/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_g;
    private static int[] field_a;
    static int field_i;
    static int field_e;
    int[] field_d;
    int field_c;
    static volatile long field_b;
    static java.awt.Image field_h;
    static int field_f;

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 106) {
          L0: {
            L1: {
              if (null == ((nh) this).field_d) {
                break L1;
              } else {
                if (-1 != (((nh) this).field_d.length ^ -1)) {
                  stackOut_6_0 = ((nh) this).field_d[((nh) this).field_d.length + -1];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -51;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_h = null;
        if (param0) {
            field_f = -39;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 != 337033697) {
                    nh.a(false);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    nh(int param0, int param1, int param2) {
        ((nh) this).field_c = param1;
        ((nh) this).field_g = param0;
        ((nh) this).field_d = new int[param2 + 1];
    }

    final int a(int param0, int param1) {
        int var4 = StarCannon.field_A;
        if (null != ((nh) this).field_d) {
            // ifeq L24
        } else {
            return 0;
        }
        int var3 = 1;
        if (param1 != -1) {
            return 19;
        }
        while (var3 < ((nh) this).field_d.length) {
            if (!(param0 >= ((nh) this).field_d[-1 + var3] + ((nh) this).field_d[var3] >> 337033697)) {
                return var3 - 1;
            }
            var3++;
        }
        return ((nh) this).field_d.length - 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_i = 100;
        field_e = 0;
        field_a = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var6 = (long)((var0 << 529225121) + 1);
            var4 = (long)(-1 + (var0 << -952434687));
            var3 = (int)(-32768L + (var6 * var6 >> 1540610578));
            var2 = (int)(-32768L + (var4 * var4 >> 1482351698));
            if (!(field_a.length > var3)) {
                var3 = -1 + field_a.length;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
        field_b = 0L;
    }
}
