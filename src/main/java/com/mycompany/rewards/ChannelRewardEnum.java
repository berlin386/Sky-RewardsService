package com.mycompany.rewards;

public enum ChannelRewardEnum {
    SPORTS("CHAMPIONS_LEAGUE_FINAL_TICKET"),
    KIDS("N/A"),
    MUSIC("KARAOKE_PRO_MICROPHONE"),
    NEWS("N/A"),
    MOVIES("PIRATES_OF_THE_CARIBBEAN_COLLECTION");

    private final String reward;

    ChannelRewardEnum(String reward) {
        this.reward = reward;
    }

    public String getReward() {
        return reward;
    }
}
