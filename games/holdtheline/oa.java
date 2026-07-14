/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends el {
    static hj field_s;
    static oa field_p;
    int field_q;
    private String field_r;
    static String field_o;

    final static boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 103) {
          if (-11 >= (bk.field_w ^ -1)) {
            if (mn.field_a) {
              return false;
            } else {
              L0: {
                if (gd.e((byte) 63)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    oa(String param0, int param1) {
        super(0, 0);
        this.a(-122, param0, 384 * param1 / 96);
    }

    oa(String param0) {
        super(0, 0);
        this.a(91, param0, 384);
    }

    private final void a(int param0, String param1, int param2) {
        ((oa) this).field_q = param2;
        ((oa) this).field_r = param1;
        int var5 = -30 % ((-59 - param0) / 62);
        el var4 = jh.field_a.a(((oa) this).field_r, (byte) -125);
        ((oa) this).field_n = var4.field_n;
        ((oa) this).field_l = var4.field_l;
        ((oa) this).field_j = var4.field_j;
        ((oa) this).field_m = var4.field_m;
    }

    public static void a(byte param0) {
        if (param0 != 43) {
          field_p = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 != -3248) {
          int discarded$2 = oa.a(117, -101, -101);
          var3 = param1 >> -1469864545 & -1 + param0;
          return (param1 - -(param1 >>> -450974977)) % param0 + var3;
        } else {
          var3 = param1 >> -1469864545 & -1 + param0;
          return (param1 - -(param1 >>> -450974977)) % param0 + var3;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
            if (!param0) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(ah.a(var2, param1, (byte) 45), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Homing missile";
    }
}
