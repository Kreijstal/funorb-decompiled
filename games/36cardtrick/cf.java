/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements b {
    static int field_c;
    static byte field_d;
    static String field_a;
    private int[][] field_e;
    static byte[][] field_b;

    public final int[] a(int param0, byte param1, float param2) {
        int var4 = 68 / ((10 - param1) / 37);
        if (-1 < (param0 ^ -1)) {
            return null;
        }
        if (((cf) this).field_e.length <= param0) {
            return null;
        }
        if (null == ((cf) this).field_e[param0]) {
            return null;
        }
        return ((cf) this).field_e[param0];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = (byte[][]) null;
        if (param0 <= 3) {
            cf.a((byte) -30);
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = 28 % ((-15 - param0) / 56);
              if (param1 < 65) {
                break L2;
              } else {
                if (90 >= param1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 97) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    public final boolean d(int param0, int param1) {
        int var3 = -121 / ((61 - param0) / 34);
        return false;
    }

    final static void a(Main param0, byte param1) {
        cj.field_l[5] = 373 - kb.field_b[5];
        fh.field_G[5] = new int[4];
        ((Main) param0).field_E[5] = new re(param0, 5);
        if (param1 < 34) {
            Main var3 = (Main) null;
            cf.a((Main) null, (byte) 68);
        }
        cj.field_l[4] = 428;
        fh.field_G[4] = new int[1];
        ((Main) param0).field_E[4] = new re(param0, 4);
        if (d.field_c > 0) {
            if (hl.a(jk.field_a, -1)) {
                fh.field_G[1] = new int[6];
                ((Main) param0).field_E[1] = new re(param0, 1);
            }
        }
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 3) {
            return false;
        }
        return true;
    }

    public final int b(int param0, int param1) {
        if (param0 > -58) {
            return 91;
        }
        return 63;
    }

    public final int c(int param0, int param1) {
        if (param1 > -92) {
            boolean discarded$0 = cf.a((byte) 1, '￩');
            return 0;
        }
        return 0;
    }

    cf(kc[] param0) {
        int var2 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        ((cf) this).field_e = new int[param0.length / 2][65536];
        for (var2 = 0; var2 < ((cf) this).field_e.length; var2++) {
            var15 = param0[2 * var2].field_r;
            var16 = param0[1 + 2 * var2].field_r;
            for (var5 = 0; -65 < (var5 ^ -1); var5++) {
                og.a(var15, var5 << 777897222, ((cf) this).field_e[var2], var5 << 744039911, 64);
                og.a(var16, var5 << 191724582, ((cf) this).field_e[var2], (var5 << 165201735) + 8192, 64);
            }
            var8 = 0;
            var5 = var8;
            while ((var8 ^ -1) > -16385) {
                ((cf) this).field_e[var2][var8] = bc.a(((cf) this).field_e[var2][var8], 16316671);
                var6 = ((cf) this).field_e[var2][var8];
                ((cf) this).field_e[var2][16384 + var8] = bc.a(var6 + -(var6 >>> 35381891), 16316671);
                ((cf) this).field_e[var2][16384 + (var8 + 16384)] = bc.a(-(var6 >>> 1658564930) + var6, 16316671);
                ((cf) this).field_e[var2][32768 + (var8 + 16384)] = bc.a(16316671, -(var6 >>> 1492932483) + (-(var6 >>> 694836130) + var6));
                var8++;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
        field_b = new byte[250][];
    }
}
