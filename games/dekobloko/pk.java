/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends bh {
    int field_s;
    int field_n;
    static int field_r;
    static qn field_v;
    int field_u;
    pk field_o;
    static ud field_q;
    int field_p;
    int field_t;

    public static void c(int param0) {
        int var1 = 86 % ((52 - param0) / 35);
        field_v = null;
        field_q = null;
    }

    final static boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        lf.field_g = true;
        if (param0 < 55) {
          L0: {
            pk.a(false, true);
            lb.field_d = 15000L + ik.a(4);
            if (hc.field_d != 11) {
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
        } else {
          L1: {
            lb.field_d = 15000L + ik.a(4);
            if (hc.field_d != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        jj.field_f.a(-21, param0);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                if (param0 != -17) {
                    mi discarded$0 = pk.a(-74);
                }
                param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static mi a(int param0) {
        if (param0 != 15000) {
            return null;
        }
        return vh.field_a;
    }

    pk(int param0, int param1, int param2, int param3, int param4) {
        ((pk) this).field_u = param2;
        ((pk) this).field_n = param3;
        ((pk) this).field_s = param4;
        ((pk) this).field_p = param0;
        ((pk) this).field_t = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
    }
}
