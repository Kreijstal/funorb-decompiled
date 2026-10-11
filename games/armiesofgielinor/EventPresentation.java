/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface EventPresentation {
    public abstract boolean initialize(GameEvent event, byte obfuscationGuard);

    public abstract void drawBaseLayer(byte obfuscationGuard);

    public abstract void requestFinish(int obfuscationGuard);

    public abstract boolean isFinished(int obfuscationGuard);

    public abstract void advanceFrame(GameEvent event, byte obfuscationGuard);

    public abstract boolean isCombatViewReady(byte obfuscationGuard);

    public abstract void drawOverlayLayer(byte obfuscationGuard);
}
