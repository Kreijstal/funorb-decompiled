/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioService implements Runnable {
    PlatformTaskDispatcher field_b;
    static Sprite[] screenTitleSprites;
    volatile AudioOutput[] field_g;
    static String field_a;
    static int canvasWidth;
    volatile boolean field_c;
    volatile boolean field_f;
    static long field_e;

    public static void a(int param0) {
        field_a = null;
        screenTitleSprites = null;
        if (param0 < 82) {
            screenTitleSprites = (Sprite[]) null;
        }
    }

    final static String a(byte param0) {
        if (VisualPropertyOverrides.field_C < 2) {
            return SocialListEntry.field_lb;
        }
        if (!(FadingDialog.field_J == null)) {
            if (!FadingDialog.field_J.ensureIndexLoaded(0)) {
                return LoginProtocolSupport.field_c;
            }
            return CachedTextLayout.field_g;
        }
        if (!DirectByteStorage.field_h.ensureIndexLoaded(0)) {
            return TextWidgetRenderer.waitingForGraphicsText;
        }
        if (param0 >= -59) {
            AudioService.a((byte) -7);
        }
        if (!DirectByteStorage.field_h.loadGroupByName("commonui", (byte) -127)) {
            return AccountWelcomePanel.loadingGraphicsText + " - " + DirectByteStorage.field_h.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!(AttachedEntityRenderer.field_c.ensureIndexLoaded(0))) {
            return EntityLinkSupport.waitingForFontsText;
        }
        if (!AttachedEntityRenderer.field_c.loadGroupByName("commonui", (byte) -125)) {
            return EntitySpawnSupport.loadingFontsText + " - " + AttachedEntityRenderer.field_c.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!DialRenderer.field_n.ensureIndexLoaded(0)) {
            return ByteShortQuery.waitingForExtraDataText;
        }
        if (!DialRenderer.field_n.loadAllGroups(true)) {
            return ByteStorage.loadingExtraDataText + " - " + DialRenderer.field_n.getLoadProgress((byte) 101) + "%";
        }
        return SecondaryNodeHashTable.pleaseWaitText;
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = Geoblox.clientControlFlowFlag;
        this.field_c = true;
        try {
            while (!this.field_f) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = this.field_g[var1_int];
                    if (var2 != null) {
                        var2.b();
                    }
                }
                bc.sleepMillis(0, 10L);
                Object var5 = (Object) null;
                OpacityWidget.a(this.field_b, (byte) 116, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            IterableNodeHashTable.a((Throwable) ((Object) exception), (String) null, (byte) 125);
        } finally {
            this.field_c = false;
        }
    }

    AudioService() {
        this.field_g = new AudioOutput[2];
        this.field_f = false;
        this.field_c = false;
    }

    static {
        screenTitleSprites = new Sprite[10];
    }
}
