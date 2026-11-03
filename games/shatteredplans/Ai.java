/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Ai {
    public abstract void planTurn(byte param0);

    public abstract void broadcastChat(int param0);

    public abstract void setChatEnabled(boolean param0, int param1);

    public abstract void sendWarningChat(Player param0, byte param1);

    public abstract void sendTurnChat(Player param0, int param1);

    public abstract int getPersonality(boolean param0);

    public abstract void updateDiplomacy(byte param0);
}
