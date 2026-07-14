/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_e;
    static ae field_d;
    static String field_b;
    static vi field_a;
    static qj field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -47) {
            tl.a((byte) -113);
        }
    }

    final static boolean a(aa param0, aa param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = wizardrun.field_H;
          if (param2 == -1) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = tl.a((aa) null, (aa) null, 6);
            break L0;
          }
        }
        L1: {
          var3 = param0.field_ob - param1.field_ob;
          if (me.field_d != param0.field_jb) {
            if (null == param0.field_jb) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          } else {
            // wide iinc 3 -200
            break L1;
          }
        }
        if (me.field_d != param1.field_jb) {
          if (param1.field_jb != null) {
            L2: {
              if (-1 >= var3) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if (-1 <= var3) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if (-1 <= var3) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_d = new ae();
        field_b = "Username: ";
    }
}
