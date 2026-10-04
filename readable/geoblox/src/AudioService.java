/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioService implements Runnable {
    PlatformTaskDispatcher taskDispatcher;
    static Sprite[] screenTitleSprites;
    volatile AudioOutput[] outputs;
    static String sessionResponseText;
    static int canvasWidth;
    volatile boolean running;
    volatile boolean stopRequested;
    static long sessionActivityStartMillis;

    public static void releaseAudioServiceResources(int methodGuard) {
        sessionResponseText = null;
        screenTitleSprites = null;
        if (methodGuard < 82) {
            screenTitleSprites = (Sprite[]) null;
        }
    }

    final static String getBootstrapLoadingStatusText(byte methodGuard) {
        if (VisualPropertyOverrides.clientBootstrapStage < 2) {
            return SocialListEntry.connectingToUpdateServerText;
        }
        if (!(FadingDialog.interfaceTextArchive == null)) {
            if (!FadingDialog.interfaceTextArchive.ensureIndexLoaded(0)) {
                return LoginProtocolSupport.waitingForBootstrapText;
            }
            return CachedTextLayout.loadingBootstrapText;
        }
        if (!DirectByteStorage.initialCommonUiSpriteArchive.ensureIndexLoaded(0)) {
            return TextWidgetRenderer.waitingForGraphicsText;
        }
        if (methodGuard >= -59) {
            AudioService.getBootstrapLoadingStatusText((byte) -7);
        }
        if (!DirectByteStorage.initialCommonUiSpriteArchive.loadGroupByName("commonui", (byte) -127)) {
            return AccountWelcomePanel.loadingGraphicsText + " - " + DirectByteStorage.initialCommonUiSpriteArchive.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!(AttachedEntityRenderer.initialUiFontArchive.ensureIndexLoaded(0))) {
            return EntityLinkSupport.waitingForFontsText;
        }
        if (!AttachedEntityRenderer.initialUiFontArchive.loadGroupByName("commonui", (byte) -125)) {
            return EntitySpawnSupport.loadingFontsText + " - " + AttachedEntityRenderer.initialUiFontArchive.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!DialRenderer.initialButtonAndLogoArchive.ensureIndexLoaded(0)) {
            return ByteShortQuery.waitingForExtraDataText;
        }
        if (!DialRenderer.initialButtonAndLogoArchive.loadAllGroups(true)) {
            return ByteStorage.loadingExtraDataText + " - " + DialRenderer.initialButtonAndLogoArchive.getLoadProgress((byte) 101) + "%";
        }
        return SecondaryNodeHashTable.pleaseWaitText;
    }

    public final void run() {
        int outputIndex = 0;
        AudioOutput output = null;
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        this.running = true;
        try {
            while (!this.stopRequested) {
                for (outputIndex = 0; outputIndex < 2; outputIndex++) {
                    output = this.outputs[outputIndex];
                    if (output != null) {
                        output.serviceOutput();
                    }
                }
                ByteTextDecodingSupport.sleepMillis(0, 10L);
                Object unusedNullEventSource = (Object) null;
                OpacityWidget.pollEventQueueAndPostDummyEvent(this.taskDispatcher, (byte) 116, (Object) null);
            }
        } catch (Exception audioServiceFailure) {
            String unusedNullErrorMessage = (String) null;
            IterableNodeHashTable.reportClientError((Throwable) ((Object) audioServiceFailure), (String) null, (byte) 125);
        } finally {
            this.running = false;
        }
    }

    AudioService() {
        this.outputs = new AudioOutput[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
        screenTitleSprites = new Sprite[10];
    }
}
