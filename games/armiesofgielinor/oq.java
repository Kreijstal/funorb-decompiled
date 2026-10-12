/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends wv {
    static String field_j;
    static sa field_m;
    static RgbSprite[] field_l;
    static String field_k;

    oq(long param0, String param1) {
        super(param0, param1);
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 >= 66) {
          field_m = null;
          field_j = null;
          field_l = null;
          return;
        }
        oq.a(-38);
        field_m = null;
        field_j = null;
        field_l = null;
    }

    final h a(byte param0) {
        int var2 = -72 / ((-63 - param0) / 45);
        return MovementPresentation.field_l;
    }

    final static int getCampaignPacketWord1(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return -112;
        }
        return ii.campaignPacketWord1;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        if (param0 != 27080) {
          return;
        }
        try {
          param1.addKeyListener(va.field_w);
          param1.addFocusListener(va.field_w);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Classic";
        field_m = new sa();
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
