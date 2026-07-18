/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends sh {
    private int field_K;
    private m field_F;
    private String field_J;
    static dm field_H;
    static int[] field_I;
    private boolean field_B;
    private int field_C;
    static char[] field_D;
    private int field_G;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + ((hd) this).field_v;
        int var6 = param1 + ((hd) this).field_m;
        super.a(param0, param1, (byte) 105, param3);
        int var7 = -79 / ((param2 - 1) / 43);
        if (!(param3 == 0)) {
            return;
        }
        int var8 = !((hd) this).field_B ? 0 : -((hd) this).field_K + (((hd) this).field_r + -(((hd) this).field_C * 2));
        int discarded$0 = ((hd) this).field_F.a(((hd) this).field_J, ((hd) this).field_C + (var8 + var5), ((hd) this).field_C + var6, -((hd) this).field_C + ((hd) this).field_K, -(((hd) this).field_C * 2) + ((hd) this).field_h, ((hd) this).field_G, -1, !((hd) this).field_B ? 2 : 0, 1, ((hd) this).field_F.field_o);
    }

    public static void f(byte param0) {
        field_H = null;
        field_D = null;
        field_I = null;
    }

    final static void f(int param0) {
        if (!el.field_o.field_Y) {
          di.field_g = di.field_g + 1;
          ul.field_b = ul.field_b + 1;
          if (sa.field_b == di.field_g) {
            if (gb.field_c >= 2) {
              L0: {
                if (fa.field_b != ul.field_b) {
                  break L0;
                } else {
                  L1: {
                    ul.field_b = 0;
                    fj.field_m = 0;
                    el.field_o.field_bb = 1;
                    di.field_g = 0;
                    if (gb.field_c < 2) {
                      ld.b(false);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  gb.field_c = 0;
                  el.field_t = el.field_t + 1;
                  break L0;
                }
              }
              return;
            } else {
              L2: {
                di.field_g = 0;
                ld.b(false);
                gb.field_c = gb.field_c + 1;
                if (fa.field_b != ul.field_b) {
                  break L2;
                } else {
                  L3: {
                    ul.field_b = 0;
                    fj.field_m = 0;
                    el.field_o.field_bb = 1;
                    di.field_g = 0;
                    if (gb.field_c < 2) {
                      ld.b(false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  gb.field_c = 0;
                  el.field_t = el.field_t + 1;
                  break L2;
                }
              }
              return;
            }
          } else {
            L4: {
              if (fa.field_b != ul.field_b) {
                break L4;
              } else {
                L5: {
                  ul.field_b = 0;
                  fj.field_m = 0;
                  el.field_o.field_bb = 1;
                  di.field_g = 0;
                  if (gb.field_c < 2) {
                    ld.b(false);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                gb.field_c = 0;
                el.field_t = el.field_t + 1;
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final String c(byte param0) {
        int var2 = ((hd) this).field_A.field_l ? 1 : 0;
        ((hd) this).field_A.field_l = ((hd) this).field_l;
        String var3 = ((hd) this).field_A.c(param0);
        ((hd) this).field_A.field_l = var2 != 0 ? true : false;
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, el param4, boolean param5, int param6, int param7, m param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (bb) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((hd) this).field_G = param9;
              ((hd) this).field_A = param4;
              ((hd) this).field_C = param7;
              ((hd) this).field_F = param8;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hd) this).field_B = stackIn_4_1 != 0;
              ((hd) this).field_K = param6;
              ((hd) this).field_J = param10;
              var12_int = ((hd) this).field_K - ((hd) this).field_C;
              var13 = ((hd) this).field_F.b(param10, var12_int, ((hd) this).field_F.field_o) - -(2 * ((hd) this).field_C);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                ((hd) this).a(var13, param2, (byte) -74, param1, param0);
                break L2;
              }
            }
            L3: {
              if (!((hd) this).field_B) {
                stackOut_9_0 = ((hd) this).field_K - -(((hd) this).field_C * 2);
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((hd) this).field_A.a(-(2 * ((hd) this).field_C) + param3, param2 + -((hd) this).field_K - ((hd) this).field_C * 3, (byte) -105, (-param3 + var13 >> 1) + ((hd) this).field_C, var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("hd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[4];
        field_D = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
