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
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
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
            if (param0 == -28309) {
              break L1;
            } else {
              field_u = (vk) null;
              break L1;
            }
          }
          L2: {
            L3: {
              if (uk.field_q >= dd.field_e) {
                break L3;
              } else {
                if (-1 < uk.field_q) {
                  dd.field_e = uk.field_q;
                  kb.field_n = 0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (uk.field_q == -1) {
              dd.field_e = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L4: {
            if (!param1) {
              break L4;
            } else {
              if (kb.field_n == 0) {
                break L4;
              } else {
                L5: {
                  stackIn_19_0 = kb.field_n;

                  if (-1 > (kb.field_n ^ -1)) {
                    stackIn_20_0 = stackIn_19_0;
                    stackIn_20_1 = -1;
                    break L5;
                  } else {
                    stackIn_20_0 = stackIn_19_0;
                    stackIn_20_1 = 1;
                    break L5;
                  }
                }
                kb.field_n = stackIn_20_0 + stackIn_20_1;
                break L4;
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int[] param4) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
                    stackIn_6_0 = 1;
                    break L2;
                  } else {
                    stackIn_6_0 = 0;
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
                    if ((param3[var10] ^ -1) < (-(var9 & var10) + var7 ^ -1)) {
                      var11 = param3[var10];
                      param3[var10] = param3[var6];
                      param3[var6] = var11;
                      var12 = param4[var10];
                      param4[var10] = param4[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param4[incrementValue$0] = var12;
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param2 == -127) {
                break L4;
              } else {
                field_w = (kl) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("dk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final void a(int param0, ha param1) {
        try {
            if (param0 != 64) {
                int[] var4 = (int[]) null;
                dk.a(12, -29, (byte) 33, (int[]) null, (int[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dk(int param0, int param1) {
        this.field_m = param0;
        this.field_n = new int[param1];
        this.field_n[this.field_m] = 1024;
    }

    public static void a(boolean param0) {
        field_u = null;
        field_s = null;
        field_t = null;
        field_x = null;
        field_v = null;
        field_w = null;
        if (!param0) {
            field_s = (String[]) null;
        }
    }

    static {
        field_s = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_u = new vk();
        field_t = "Game options changed (<%0>)";
        field_x = "Prestige";
    }
}
