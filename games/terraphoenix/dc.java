/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    private String field_d;
    int field_l;
    int field_f;
    private static int[] field_c;
    String field_h;
    private long field_k;
    private int field_m;
    private boolean field_g;
    int field_j;
    int[] field_i;
    static int field_b;
    static int field_a;
    static rj field_n;
    static String[] field_e;

    public static void a(byte param0) {
        if (param0 != -117) {
            return;
        }
        field_c = null;
        field_n = null;
        field_e = null;
    }

    final static short[] a(int param0, short[] param1, int param2, uc param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        var4 = param3.a(false, param2);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 != param1.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.a(false, 4);
            var6 = (short)param3.a(false, 16);
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (short)(var6 + param3.a(false, var5));
                  var7++;
                  continue L4;
                }
              }
            }
          }
          if (param0 == -25076) {
            return param1;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(int param0) {
        if (!((dc) this).field_g) {
            // if_icmpne L30
            // if_icmplt L28
        } else {
            return 2;
        }
        if (!((((dc) this).field_k ^ -1L) != (fb.field_i ^ -1L))) {
            return 1;
        }
        if (param0 != 2) {
            return 57;
        }
        if (-3 == (jg.field_gb ^ -1)) {
            if (b.a(true, ((dc) this).field_d)) {
                return 1;
            }
        }
        return 0;
    }

    final static int b(byte param0) {
        if (param0 != 30) {
            field_a = 20;
            return 1;
        }
        return 1;
    }

    dc(boolean param0) {
        ((dc) this).field_f = wb.field_c;
        ((dc) this).field_h = ea.field_n;
        ((dc) this).field_k = pl.field_Q;
        ((dc) this).field_d = wh.field_a;
        ((dc) this).field_j = ji.field_k;
        if (!param0) {
            ((dc) this).field_i = null;
        } else {
            ((dc) this).field_i = ui.field_e;
        }
        ((dc) this).field_g = ng.field_s;
        ((dc) this).field_m = da.field_d;
        ((dc) this).field_l = im.field_c;
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
        field_c = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var6 = (long)(1 + (var0 << 1709666625));
            var4 = (long)(-1 + (var0 << 1589543457));
            var3 = (int)((var6 * var6 >> -1747006638) + -32768L);
            var2 = (int)(-32768L + (var4 * var4 >> -960922862));
            if (field_c.length <= var3) {
                var3 = -1 + field_c.length;
            }
            for (var1 = 0 > var2 ? 0 : var2; var1 <= var3; var1++) {
                field_c[var1] = var0;
            }
        }
        field_e = new String[]{"Unite your forces", "Capture Objectives", "Destroy the enemy", "Research powerful weaponary", "Liberate the cities", "Defend humanity"};
        field_n = new rj();
    }
}
