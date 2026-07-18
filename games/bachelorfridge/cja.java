/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja extends bca {
    int field_u;
    int field_s;
    static int field_v;
    static String field_r;
    int field_q;
    static String field_t;

    final void a(op param0, int param1) {
        try {
            int var3_int = -69 % ((param1 - 12) / 35);
            ((cja) this).a(param0, (byte) -2);
            param0.b((byte) -64, ((cja) this).field_q, ((cja) this).field_s, ((cja) this).field_u);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cja.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cja(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((cja) this).field_k = param0.e((byte) 105);
            ((cja) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                ((cja) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((cja) this).field_s = param0.b(16711935);
            ((cja) this).field_u = param0.b(16711935);
            ((cja) this).field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d() {
        field_r = null;
        field_t = null;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        mm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var4 = null;
                cja.a((uha) null, (lu) null, 81, true);
                break L1;
              }
            }
            stackOut_2_0 = new mm(param1, (cja) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cja.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (at) (Object) stackIn_3_0;
    }

    cja(int param0, nq param1) {
        super(param0, param1);
    }

    final static void a(int param0, kv param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              param4 = param4 + param1.field_u;
              param3 = param3 + param1.field_t;
              var5_int = param3 - -(param4 * dg.field_i);
              var6 = 0;
              var7 = param1.field_p;
              var8 = param1.field_q;
              var9 = -var8 + dg.field_i;
              if (dg.field_j > param4) {
                var11 = -param4 + dg.field_j;
                var7 = var7 - var11;
                var6 = var6 + var8 * var11;
                param4 = dg.field_j;
                var5_int = var5_int + dg.field_i * var11;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var10 = 0;
              if (param3 >= dg.field_f) {
                break L2;
              } else {
                var11 = -param3 + dg.field_f;
                var6 = var6 + var11;
                var9 = var9 + var11;
                var8 = var8 - var11;
                var10 = var10 + var11;
                param3 = dg.field_f;
                var5_int = var5_int + var11;
                break L2;
              }
            }
            L3: {
              if (dg.field_k < var7 + param4) {
                var7 = var7 - (-dg.field_k + (param4 + var7));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (dg.field_h >= var8 + param3) {
                break L4;
              } else {
                var11 = -dg.field_h + (var8 + param3);
                var9 = var9 + var11;
                var8 = var8 - var11;
                var10 = var10 + var11;
                break L4;
              }
            }
            L5: {
              if (var8 <= 0) {
                break L5;
              } else {
                if (0 < var7) {
                  el.a(var8, var6, var9, var5_int, 125, 5587456, dg.field_e, param1.field_v, var10, var7);
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("cja.C(").append(5587456).append(',');
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -116 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(uha param0, lu param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uha stackIn_5_0 = null;
        uha stackIn_6_0 = null;
        uha stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        uha stackIn_8_0 = null;
        uha stackIn_9_0 = null;
        uha stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        uha stackIn_11_0 = null;
        uha stackIn_12_0 = null;
        uha stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        uha stackIn_14_0 = null;
        uha stackIn_15_0 = null;
        uha stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uha stackIn_19_0 = null;
        uha stackIn_20_0 = null;
        uha stackIn_21_0 = null;
        uha stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uha stackIn_23_0 = null;
        uha stackIn_24_0 = null;
        uha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        uha stackOut_4_0 = null;
        uha stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        uha stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        uha stackOut_7_0 = null;
        uha stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        uha stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        uha stackOut_10_0 = null;
        uha stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        uha stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        uha stackOut_13_0 = null;
        uha stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        uha stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uha stackOut_18_0 = null;
        uha stackOut_19_0 = null;
        uha stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        uha stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        uha stackOut_22_0 = null;
        uha stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        uha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3) {
                param0.field_Rb = param1.b(16711935);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_Pb = param1.b(16711935);
              param0.field_Kb = param1.b(16711935);
              var4_int = param1.b(16711935);
              stackOut_4_0 = (uha) param0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (128 & var4_int)) {
                stackOut_6_0 = (uha) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (uha) (Object) stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Bb = stackIn_7_1 != 0;
              stackOut_7_0 = (uha) param0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((32 & var4_int) == -1) {
                stackOut_9_0 = (uha) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = (uha) (Object) stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_dc = stackIn_10_1 != 0;
              stackOut_10_0 = (uha) param0;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (-1 != (16 & var4_int)) {
                stackOut_12_0 = (uha) (Object) stackIn_12_0;
                stackOut_12_1 = 2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = (uha) (Object) stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              stackIn_13_0.field_Lb = stackIn_13_1;
              stackOut_13_0 = (uha) param0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (0 == (var4_int & 64)) {
                stackOut_15_0 = (uha) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = (uha) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            stackIn_16_0.field_Zb = stackIn_16_1 != 0;
            if (param2 >= 47) {
              L6: {
                L7: {
                  stackOut_18_0 = (uha) param0;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (!param0.field_Bb) {
                    break L7;
                  } else {
                    stackOut_19_0 = (uha) (Object) stackIn_19_0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (param0.field_Pb <= param0.field_Rb) {
                      break L7;
                    } else {
                      stackOut_20_0 = (uha) (Object) stackIn_20_0;
                      stackOut_20_1 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L6;
                    }
                  }
                }
                stackOut_21_0 = (uha) (Object) stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L6;
              }
              L8: {
                stackIn_22_0.field_zb = stackIn_22_1 != 0;
                stackOut_22_0 = (uha) param0;
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if ((var4_int & 8) == 0) {
                  stackOut_24_0 = (uha) (Object) stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L8;
                } else {
                  stackOut_23_0 = (uha) (Object) stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L8;
                }
              }
              L9: {
                stackIn_25_0.field_Fb = stackIn_25_1 != 0;
                if (0 == (var4_int & 4)) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                } else {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_28_0;
                if ((var4_int & 2) == 0) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L10;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_31_0;
                param1.a(param0.field_Eb, param0.field_Eb.length, 128, 0);
                param0.field_bc = param1.e((byte) 64);
                param0.field_Ob = f.b((byte) 73) + -(long)param1.f(-124);
                if (var5 == 0) {
                  param0.field_Nb = -1;
                  break L11;
                } else {
                  param0.field_Nb = param1.f(51);
                  break L11;
                }
              }
              param0.field_Sb = param1.c(-120);
              var7 = param1.field_g;
              param0.field_Jb = param1.g(-87);
              if (var6 != 0) {
                param0.field_Cb = new String[param0.field_Rb];
                param1.field_g = var7;
                var8 = 0;
                L12: while (true) {
                  if (param0.field_Rb <= var8) {
                    break L0;
                  } else {
                    param0.field_Cb[var8] = param1.g(-88);
                    var8++;
                    continue L12;
                  }
                }
              } else {
                param0.field_Cb = null;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("cja.B(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          L14: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        super.a((byte) -47, param1);
        param1.d(((cja) this).field_s, 0);
        param1.d(((cja) this).field_u, 0);
        if (param0 > -12) {
            return;
        }
        try {
            param1.d(((cja) this).field_q, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Lobby";
        field_v = 22;
        field_t = "Fruit & Veg";
    }
}
