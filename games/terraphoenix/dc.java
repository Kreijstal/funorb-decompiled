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

    public static void a() {
        field_c = null;
        field_n = null;
        field_e = null;
    }

    final static short[] a(int param0, short[] param1, int param2, uc param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          var4_int = param3.a(false, 16);
          if (var4_int != 0) {
            L0: {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (var4_int != param1.length) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              param1 = new short[var4_int];
              break L0;
            }
            L2: {
              var5 = param3.a(false, 4);
              var6 = (short)param3.a(false, 16);
              if (var5 <= 0) {
                var7 = 0;
                L3: while (true) {
                  if (var4_int <= var7) {
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
                  if (var4_int <= var7) {
                    break L2;
                  } else {
                    param1[var7] = (short)(var6 + param3.a(false, var5));
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param1;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("dc.D(").append(-25076).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(16).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final int a(int param0) {
        L0: {
          if (((dc) this).field_g) {
            break L0;
          } else {
            L1: {
              if (((dc) this).field_l != 2) {
                break L1;
              } else {
                if (((dc) this).field_m > 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (~((dc) this).field_k == ~fb.field_i) {
              return 1;
            } else {
              if (param0 == 2) {
                L2: {
                  if (jg.field_gb != 2) {
                    break L2;
                  } else {
                    if (!b.a(true, ((dc) this).field_d)) {
                      break L2;
                    } else {
                      return 1;
                    }
                  }
                }
                return 0;
              } else {
                return 57;
              }
            }
          }
        }
        return 2;
    }

    final static int b() {
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
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)(-1 + (var0 << 1));
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
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
