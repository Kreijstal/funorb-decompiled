/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_a;
    private em field_k;
    private int field_h;
    int field_b;
    static wk field_d;
    static String field_j;
    static nc field_i;
    static int field_c;
    static int[] field_e;
    private int field_g;
    static wk field_f;

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_j = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static void a(byte param0) {
        vs.a(256, wn.field_jb);
        if (param0 < 113) {
            field_d = null;
        }
    }

    final void b(byte param0) {
        if (param0 != -66) {
            return;
        }
        if (!(((hh) this).field_k != null)) {
            ((hh) this).field_g = 127;
            return;
        }
        if (((hh) this).field_k.c(param0 ^ 65)) {
            ((hh) this).field_k.b(17);
        }
        int var2 = ((hh) this).field_k.field_a;
        int var3 = ((hh) this).field_k.field_f;
        var3 = var3 >> 1;
        int var4 = var2 <= var3 ? 1 : 0;
        var2 = var4 != 0 ? var2 : -var3 + var2;
        int var5 = var4 == 0 ? ((hh) this).field_b : ((hh) this).field_h;
        int var6 = var4 == 0 ? ((hh) this).field_h : ((hh) this).field_b;
        ((hh) this).field_g = var5 - -(var2 * (-var5 + var6) / var3);
        if (((hh) this).field_g < ((hh) this).field_h) {
            ((hh) this).field_g = ((hh) this).field_h;
        }
        if (((hh) this).field_b < ((hh) this).field_g) {
            ((hh) this).field_g = ((hh) this).field_b;
        }
    }

    final static void a(int param0, int param1, um param2, boolean param3) {
        try {
            lk.field_e.a(256, !param3 ? true : false, param2, -1, 50, 1000000);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "hh.H(" + -16147 + ',' + 50 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 >= 0) {
            break L0;
          } else {
            param3 = 100;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 0) {
              break L2;
            } else {
              if (param0 <= 255) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          param0 = 32;
          break L1;
        }
        L3: {
          L4: {
            ((hh) this).field_k = new em(param3);
            ((hh) this).field_h = param0;
            if (param2 < 0) {
              break L4;
            } else {
              if (param2 > 255) {
                break L4;
              } else {
                if (param2 < param0) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
          }
          param2 = 224;
          break L3;
        }
        ((hh) this).field_b = param2;
        ((hh) this).field_g = ((hh) this).field_b + ((hh) this).field_h >> 1;
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_22_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (0 != param2) {
              if (param2 == 1) {
                var10 = param0[0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            StringBuilder discarded$5 = var6.append("null");
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("hh.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 0 + ',' + param2 + ',' + 0 + ')');
        }
        return stackIn_23_0;
    }

    final static void a(au param0, boolean param1, vh param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        au stackIn_4_0 = null;
        au stackIn_5_0 = null;
        au stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        au stackIn_7_0 = null;
        au stackIn_8_0 = null;
        au stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        au stackIn_10_0 = null;
        au stackIn_11_0 = null;
        au stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        au stackIn_13_0 = null;
        au stackIn_14_0 = null;
        au stackIn_15_0 = null;
        au stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        au stackIn_17_0 = null;
        au stackIn_18_0 = null;
        au stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        au stackIn_20_0 = null;
        au stackIn_21_0 = null;
        au stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        au stackOut_3_0 = null;
        au stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        au stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        au stackOut_6_0 = null;
        au stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        au stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        au stackOut_9_0 = null;
        au stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        au stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        au stackOut_12_0 = null;
        au stackOut_13_0 = null;
        au stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        au stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        au stackOut_16_0 = null;
        au stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        au stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        au stackOut_19_0 = null;
        au stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        au stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                param0.field_Ub = param2.k(0);
                break L1;
              }
            }
            L2: {
              param0.field_nc = param2.k(0);
              param0.field_Tb = param2.k(0);
              var4_int = param2.k(0);
              stackOut_3_0 = (au) param0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (0 == (128 & var4_int)) {
                stackOut_5_0 = (au) (Object) stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (au) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              stackIn_6_0.field_uc = stackIn_6_1 != 0;
              stackOut_6_0 = (au) param0;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if ((var4_int & 64) == 0) {
                stackOut_8_0 = (au) (Object) stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = (au) (Object) stackIn_7_0;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              stackIn_9_0.field_kc = stackIn_9_1 != 0;
              stackOut_9_0 = (au) param0;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if ((16 & var4_int) != 0) {
                stackOut_11_0 = (au) (Object) stackIn_11_0;
                stackOut_11_1 = 2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = (au) (Object) stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_12_0.field_ac = stackIn_12_1;
                stackOut_12_0 = (au) param0;
                stackIn_15_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (!param0.field_uc) {
                  break L6;
                } else {
                  stackOut_13_0 = (au) (Object) stackIn_13_0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (param0.field_Ub >= param0.field_nc) {
                    break L6;
                  } else {
                    stackOut_14_0 = (au) (Object) stackIn_14_0;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L5;
                  }
                }
              }
              stackOut_15_0 = (au) (Object) stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L5;
            }
            L7: {
              stackIn_16_0.field_Sb = stackIn_16_1 != 0;
              stackOut_16_0 = (au) param0;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (0 == (8 & var4_int)) {
                stackOut_18_0 = (au) (Object) stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = (au) (Object) stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_tc = stackIn_19_1 != 0;
              stackOut_19_0 = (au) param0;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if ((32 & var4_int) == 0) {
                stackOut_21_0 = (au) (Object) stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (au) (Object) stackIn_20_0;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_vc = stackIn_22_1 != 0;
              if (0 == (var4_int & 4)) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L9;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_25_0;
              if ((var4_int & 2) == 0) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L10;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_28_0;
              param2.a(0, param0.field_pc.length, 0, param0.field_pc);
              param0.field_qc = param2.e((byte) -104);
              param0.field_Mb = vi.b(39) - (long)param2.i(1);
              if (var5 == 0) {
                param0.field_bc = -1;
                break L11;
              } else {
                param0.field_bc = param2.i(1);
                break L11;
              }
            }
            param0.field_dc = param2.j((byte) -2);
            var7 = param2.field_q;
            if (param3 >= 73) {
              L12: {
                param0.field_rc = param2.g(1);
                if (var6 != 0) {
                  param0.field_jc = new String[param0.field_Ub];
                  param2.field_q = var7;
                  var8 = 0;
                  L13: while (true) {
                    if (var8 >= param0.field_Ub) {
                      break L12;
                    } else {
                      param0.field_jc[var8] = param2.g(1);
                      var8++;
                      continue L13;
                    }
                  }
                } else {
                  param0.field_jc = null;
                  break L12;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("hh.E(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          L15: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L15;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 > -121) {
            int discarded$0 = ((hh) this).c(103);
        }
        return ((hh) this).field_k.field_a <= ((hh) this).field_k.field_f >> 1 ? true : false;
    }

    final int c(int param0) {
        if (param0 == -1953891327) {
          L0: {
            if (((hh) this).field_g < 0) {
              break L0;
            } else {
              if (((hh) this).field_g > 255) {
                break L0;
              } else {
                return ((hh) this).field_g;
              }
            }
          }
          return 127;
        } else {
          return 4;
        }
    }

    hh(int param0, int param1, int param2) {
        this.a(param0, (byte) 127, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have 1 unread message!";
        field_j = "Confirm Email:";
        field_e = new int[]{0, 1, 2, 4, 8, 31, 16, 0, 0};
        field_c = 0;
    }
}
