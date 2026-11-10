/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Teleportable {
    public abstract TeleportState getTeleportState(boolean param0);

    public abstract void moveTo(int param0, int param1, int param2);

    public abstract boolean canTeleport(byte param0);
}
