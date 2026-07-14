/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_e;
    static String field_d;
    static boolean field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, hj param1, byte param2, int param3, int param4) {
        hj var5 = null;
        Object var6 = null;
        var5 = new hj(param1.field_o, param1.field_v);
        ok.a(32381);
        var5.f();
        param1.e(0, 0, 1);
        if (param2 > -41) {
          var6 = null;
          hc.a(20, (hj) null, (byte) -34, 96, -42);
          ug.b(-1);
          var5.d(param3 - (param1.field_o >> 1611386209), param4 - (param1.field_v >> -1420945279), param0);
          return;
        } else {
          ug.b(-1);
          var5.d(param3 - (param1.field_o >> 1611386209), param4 - (param1.field_v >> -1420945279), param0);
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_c = null;
        if (param0 != 24816) {
          var2 = null;
          hc.a(21, (hj) null, (byte) 110, 27, -87);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static bm a(String param0, gn param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = param1.c(param3, 3);
        var5 = param1.a(var4, param0, false);
        if (param2 > -105) {
          var6 = null;
          hc.a(-78, (hj) null, (byte) -62, 68, 71);
          return de.a(var4, var5, param1, 25);
        } else {
          return de.a(var4, var5, param1, 25);
        }
    }

    final static String a(String param0, byte param1) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        int var4 = -54 / ((-39 - param1) / 50);
        for (var5 = 0; var2 > var5; var5++) {
            var3[-var5 + -1 + var2] = param0.charAt(var5);
        }
        return new String(var3);
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 0) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackOut_18_0 = -qd.field_f[param1 + -2048];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = qd.field_f[-param1 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 < 6144) {
                stackOut_14_0 = -qd.field_f[-param1 + 6144];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = qd.field_f[param1 + -6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_c = null;
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L2: {
              if (-2049 >= (param1 ^ -1)) {
                stackOut_8_0 = -qd.field_f[param1 + -2048];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = qd.field_f[-param1 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 < 6144) {
                stackOut_4_0 = -qd.field_f[-param1 + 6144];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = qd.field_f[param1 + -6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = "Player 1";
        field_e = -1;
        field_d = "Final Lap";
    }
}
