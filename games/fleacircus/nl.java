/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int[] field_a;
    static String[] field_b;
    static RgbSprite[][] field_c;

    public static void clearStaticReferences(byte param0) {
        if (param0 == -33) {
          field_a = null;
          field_b = null;
          field_c = (RgbSprite[][]) null;
          return;
        }
        field_a = (int[]) null;
        field_a = null;
        field_b = null;
        field_c = (RgbSprite[][]) null;
    }

    final static void a(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param0 < 99) {
            field_b = (String[]) null;
          }
          if (null != param2.field_a) {
            param2.unlink(-1);
          }
          param2.field_h = param1;
          param2.field_a = param1.field_a;
          param2.field_a.field_h = param2;
          param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "nl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        param2 = param2 * 16;
        SoftwareRasterizer.saveClip(si.field_R);
        param0 = param0 * 16;
        int var3 = -(PacketBuffer.field_j * 2 % 16);
        SoftwareRasterizer.setClip(var3 + param2, param1 + param0, var3 + param2 + 16, 16 + param0);
        SoftwareRasterizer.drawCircleOutline(16 + (param2 + var3), param0 + 4, 8, 13421632);
        SoftwareRasterizer.restoreClip(si.field_R);
    }

    final static boolean a(int param0) {
        int var1 = -65 % ((-26 - param0) / 59);
        if (bh.field_t < 10) {
          return false;
        }
        if (ib.field_k >= 13) {
          return true;
        }
        return false;
    }

    static {
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
