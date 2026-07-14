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
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
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
              field_u = null;
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
                  stackOut_17_0 = kb.field_n;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (-1 > (kb.field_n ^ -1)) {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = -1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L5;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 < param0) {
            L1: {
              var5 = (param0 + param1) / 2;
              var6 = param1;
              var7 = param3[var5];
              param3[var5] = param3[param0];
              param3[param0] = var7;
              var8 = param4[var5];
              param4[var5] = param4[param0];
              param4[param0] = var8;
              if (2147483647 != var7) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var9 = stackIn_5_0;
            var10 = param1;
            L2: while (true) {
              if (var10 >= param0) {
                param3[param0] = param3[var6];
                param3[var6] = var7;
                param4[param0] = param4[var6];
                param4[var6] = var8;
                dk.a(-1 + var6, param1, (byte) -127, param3, param4);
                dk.a(param0, 1 + var6, (byte) -127, param3, param4);
                break L0;
              } else {
                if (param3[var10] > -(var9 & var10) + var7) {
                  var11 = param3[var10];
                  param3[var10] = param3[var6];
                  param3[var6] = var11;
                  var12 = param4[var10];
                  param4[var10] = param4[var6];
                  var6++;
                  param4[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param2 == -127) {
            break L3;
          } else {
            field_w = null;
            break L3;
          }
        }
    }

    final void a(int param0, ha param1) {
        if (param0 != 64) {
            Object var4 = null;
            dk.a(12, -29, (byte) 33, (int[]) null, (int[]) null);
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
        if (!param0) {
            field_s = null;
        }
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
