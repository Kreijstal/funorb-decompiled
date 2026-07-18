/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends bd {
    static wk field_v;
    static vk field_u;
    static String[] field_s;
    static String field_t;
    static kl field_w;
    static String field_x;

    final static void a(int param0, boolean param1) {
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        if (kd.field_X < 0) {
          kb.field_n = 0;
          dd.field_e = 0;
          return;
        } else {
          L0: {
            dd.field_e = dd.field_e + kb.field_n;
            if (dd.field_e < 0) {
              dd.field_e = 0;
              kb.field_n = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (uk.field_q >= dd.field_e) {
                break L2;
              } else {
                if (-1 < uk.field_q) {
                  dd.field_e = uk.field_q;
                  kb.field_n = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (uk.field_q == -1) {
              dd.field_e = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L3: {
            if (!param1) {
              break L3;
            } else {
              if (kb.field_n == 0) {
                break L3;
              } else {
                L4: {
                  stackOut_15_0 = kb.field_n;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (kb.field_n > 0) {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = -1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L4;
                  } else {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L4;
                  }
                }
                kb.field_n = stackIn_18_0 + stackIn_18_1;
                break L3;
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < param0) {
                L2: {
                  var5_int = (param0 + param1) / 2;
                  var6 = param1;
                  var7 = param3[var5_int];
                  param3[var5_int] = param3[param0];
                  param3[param0] = var7;
                  var8 = param4[var5_int];
                  param4[var5_int] = param4[param0];
                  param4[param0] = var8;
                  if (2147483647 != var7) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var9 = stackIn_6_0;
                var10 = param1;
                L3: while (true) {
                  if (var10 >= param0) {
                    param3[param0] = param3[var6];
                    param3[var6] = var7;
                    param4[param0] = param4[var6];
                    param4[var6] = var8;
                    dk.a(-1 + var6, param1, (byte) -127, param3, param4);
                    dk.a(param0, 1 + var6, (byte) -127, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (param3[var10] <= -(var9 & var10) + var7) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param2 == -127) {
                break L5;
              } else {
                field_w = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("dk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void a(int param0, ha param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                var4 = null;
                dk.a(12, -29, (byte) 33, (int[]) null, (int[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    dk(int param0, int param1) {
        ((dk) this).field_m = param0;
        ((dk) this).field_n = new int[param1];
        ((dk) this).field_n[((dk) this).field_m] = 1024;
    }

    public static void a(boolean param0) {
        field_u = null;
        field_s = null;
        field_t = null;
        field_x = null;
        field_v = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_u = new vk();
        field_t = "Game options changed (<%0>)";
        field_x = "Prestige";
    }
}
