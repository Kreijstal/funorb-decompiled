/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Switchable extends noa {
    public abstract void toggle(int param0);

    public abstract SwitchableId getGlobalId(int param0);

    public abstract SwitchableScope getScope(byte param0);

    public abstract SwitchableId getLocalId(byte param0);
}
