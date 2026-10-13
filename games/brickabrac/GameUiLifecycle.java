/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GameUiLifecycle {
    public abstract void initializeUi(boolean obfuscationGuard);

    public abstract boolean pollUiReady(int obfuscationGuard);

    public abstract void prepareUiAssets(boolean obfuscationGuard);

    public abstract boolean pollUiBootstrap(byte obfuscationGuard);
}
