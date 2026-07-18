/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;
import java.lang.String;

final class qc extends pe implements fj, qd {
    private boolean field_O;
    private boolean field_P;
    private og field_Q;
    private pl field_M;
    static o[] field_E;
    private String field_F;
    private pl field_G;
    private boolean field_J;
    private og field_K;
    static String field_N;
    static String field_I;
    static int field_L;
    private pl field_H;

    final void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        og var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((qc) this).field_K;
              if (param0 == 5990) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            var4 = param1;
            var3.a(-1, false, var4);
            ((qc) this).field_Q.e(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("qc.CA(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public final void a(og param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5) {
                break L1;
              } else {
                var4 = null;
                ((qc) this).a(56, (pl) null, 121, 39, 55);
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
            stackOut_3_1 = new StringBuilder().append("qc.FA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int discarded$2 = -1;
        if (!qi.d()) {
            if (0 >= ((qc) this).field_K.field_k.length()) {
                return;
            }
            if (((qc) this).field_Q.field_k.length() <= 0) {
                return;
            }
        }
        int discarded$3 = -124;
        w.a(((qc) this).field_Q.field_k, ((qc) this).field_K.field_k);
    }

    final void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (((qc) this).field_F == null) {
            break L0;
          } else {
            int discarded$2 = gh.field_b.a(((qc) this).field_F, 20 + (param0 - -((qc) this).field_o), 15 + (((qc) this).field_l + param3), ((qc) this).field_r - 40, ((qc) this).field_n, 16777215, -1, 1, 0, gh.field_b.field_M);
            break L0;
          }
        }
        L1: {
          if (null != ((qc) this).field_M) {
            ed.f(10 + param0, 134 + param3, ((qc) this).field_r + -20, 4210752);
            break L1;
          } else {
            break L1;
          }
        }
        super.a(param0, param1, param2, param3);
    }

    final static Class a(String param0) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (!param0.equals((Object) (Object) "S")) {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_17_0 = Long.TYPE;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_22_0 = Boolean.TYPE;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (!param0.equals((Object) (Object) "D")) {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_32_0 = Character.TYPE;
                            stackIn_33_0 = stackOut_32_0;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        } else {
                          stackOut_28_0 = Double.TYPE;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      } else {
                        stackOut_25_0 = Float.TYPE;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      }
                    }
                  }
                } else {
                  stackOut_12_0 = Short.TYPE;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                stackOut_9_0 = Integer.TYPE;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("qc.JA(");
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L1;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + -39 + ')');
        }
        return stackIn_33_0;
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) -125, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 != 98) {
                if (param2 <= -96) {
                  if (param1 != 99) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = ((qc) this).b(param3, 1);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_6_0 = ((qc) this).a((byte) -117, param3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public final void a(int param0, og param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((qc) this).field_K != param1) {
                break L1;
              } else {
                boolean discarded$2 = ((qc) this).field_Q.a((ub) this, 8);
                break L1;
              }
            }
            L2: {
              if (((qc) this).field_Q == param1) {
                this.a(4210752);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= -111) {
                break L3;
              } else {
                ((qc) this).field_O = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("qc.IA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == -18905) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            L2: {
              if (((qc) this).field_H != param1) {
                if (((qc) this).field_M != param1) {
                  if (((qc) this).field_G != param1) {
                    break L2;
                  } else {
                    if (((qc) this).field_J) {
                      ea.c(param0 ^ 12849);
                      break L2;
                    } else {
                      if (!((qc) this).field_O) {
                        int discarded$2 = -89;
                        sf.a();
                        break L2;
                      } else {
                        int discarded$3 = -97;
                        pg.a();
                        break L2;
                      }
                    }
                  }
                } else {
                  w.b(param0 ^ 18904);
                  break L2;
                }
              } else {
                this.a(4210752);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("qc.DA(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(int param0) {
        ((qc) this).field_K.e(true);
        ((qc) this).field_Q.e(true);
        int var2 = 127 % ((-20 - param0) / 50);
    }

    qc(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (bf) null);
        RuntimeException var6 = null;
        jl var6_ref = null;
        vd var7 = null;
        String var8 = null;
        uf var9 = null;
        ik var12 = null;
        ik var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_19_0 = null;
        pl stackIn_19_1 = null;
        pl stackIn_19_2 = null;
        Object stackIn_21_0 = null;
        pl stackIn_21_1 = null;
        pl stackIn_21_2 = null;
        Object stackIn_22_0 = null;
        pl stackIn_22_1 = null;
        pl stackIn_22_2 = null;
        String stackIn_22_3 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_18_0 = null;
        pl stackOut_18_1 = null;
        pl stackOut_18_2 = null;
        Object stackOut_21_0 = null;
        pl stackOut_21_1 = null;
        pl stackOut_21_2 = null;
        String stackOut_21_3 = null;
        Object stackOut_19_0 = null;
        pl stackOut_19_1 = null;
        pl stackOut_19_2 = null;
        String stackOut_19_3 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        try {
          L0: {
            L1: {
              ((qc) this).field_F = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
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
              ((qc) this).field_O = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((qc) this).field_J = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((qc) this).field_P = stackIn_10_1 != 0;
              if (!((qc) this).field_J) {
                break L4;
              } else {
                L5: {
                  if (((qc) this).field_P) {
                    break L5;
                  } else {
                    if (!((qc) this).field_O) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((qc) this).field_K = (og) (Object) new p(param0, (ce) this, 100);
              ((qc) this).field_Q = (og) (Object) new p("", (ce) this, 20);
              if (!((qc) this).field_J) {
                L7: {
                  ((qc) this).field_H = new pl(dj.field_a, (ce) null);
                  stackOut_18_0 = this;
                  stackOut_18_1 = null;
                  stackOut_18_2 = null;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (!((qc) this).field_O) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = null;
                    stackOut_21_2 = null;
                    stackOut_21_3 = ti.field_h;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    break L7;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = null;
                    stackOut_19_2 = null;
                    stackOut_19_3 = th.field_b;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_22_2 = stackOut_19_2;
                    stackIn_22_3 = stackOut_19_3;
                    break L7;
                  }
                }
                ((qc) this).field_G = new pl(stackIn_22_3, (ce) null);
                if (!((qc) this).field_P) {
                  break L6;
                } else {
                  ((qc) this).field_M = new pl(qk.field_h, (ce) this);
                  break L6;
                }
              } else {
                ((qc) this).field_H = new pl(me.field_a, (ce) null);
                ((qc) this).field_G = new pl(pk.field_q, (ce) null);
                ((qc) this).field_K.field_B = false;
                break L6;
              }
            }
            L8: {
              ((qc) this).field_K.field_w = (bf) (Object) new qb(10000536);
              ((qc) this).field_Q.field_w = (bf) (Object) new ke(10000536);
              var6_ref = new jl();
              ((qc) this).field_H.field_w = (bf) (Object) var6_ref;
              if (null == ((qc) this).field_G) {
                break L8;
              } else {
                ((qc) this).field_G.field_w = (bf) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((qc) this).field_M != null) {
                ((qc) this).field_M.field_w = (bf) (Object) var6_ref;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              ((qc) this).field_K.field_p = tf.field_a;
              if (((qc) this).field_M != null) {
                ((qc) this).field_M.field_p = hb.field_i;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!((qc) this).field_J) {
                if (((qc) this).field_O) {
                  ((qc) this).field_G.field_p = hf.field_a;
                  ((qc) this).field_G.field_w = (bf) (Object) new tk();
                  break L11;
                } else {
                  ((qc) this).field_G.field_w = (bf) (Object) new tk();
                  break L11;
                }
              } else {
                ((qc) this).field_G.field_p = sh.field_a;
                break L11;
              }
            }
            L12: {
              ((qc) this).field_l = 15;
              var7 = gh.field_b;
              if (null != ((qc) this).field_F) {
                ((qc) this).field_l = ((qc) this).field_l + (5 + var7.a(((qc) this).field_F, -40 + ((qc) this).field_r, var7.field_M));
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var8 = ai.field_j;
              int discarded$3 = 48;
              var9 = jf.a(jg.f(1));
              if (var9 == hd.field_C) {
                var8 = dc.field_q;
                break L13;
              } else {
                if (var9 != jf.field_e) {
                  break L13;
                } else {
                  var8 = tl.field_b;
                  break L13;
                }
              }
            }
            L14: {
              ik dupTemp$4 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_K, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$4;
              ((qc) this).a((ub) (Object) dupTemp$4, (byte) 57);
              ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var12).field_n);
              ik dupTemp$5 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_Q, false, 80, 3, var7, 16777215, qk.field_d);
              var13 = dupTemp$5;
              ((qc) this).a((ub) (Object) dupTemp$5, (byte) 85);
              ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var13).field_n);
              ((qc) this).field_H.field_s = (ce) this;
              if (((qc) this).field_M == null) {
                break L14;
              } else {
                ((qc) this).field_M.field_s = (ce) this;
                break L14;
              }
            }
            L15: {
              if (((qc) this).field_G != null) {
                ((qc) this).field_G.field_s = (ce) this;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (((qc) this).field_M != null) {
                ((qc) this).field_H.a(118, ((qc) this).field_l, 30, ((qc) this).field_r + -95, 85);
                ((qc) this).field_l = ((qc) this).field_l + 60;
                break L16;
              } else {
                ((qc) this).field_H.a(118, ((qc) this).field_l, 30, -10 + (((qc) this).field_r - 6), 8);
                ((qc) this).field_l = ((qc) this).field_l + 35;
                break L16;
              }
            }
            L17: {
              if (null != ((qc) this).field_M) {
                ((qc) this).field_M.a(121, ((qc) this).field_l, 30, ((qc) this).field_r + -16, 8);
                ((qc) this).field_l = ((qc) this).field_l + 35;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (null == ((qc) this).field_G) {
                break L18;
              } else {
                L19: {
                  if (((qc) this).field_J) {
                    break L19;
                  } else {
                    if (((qc) this).field_O) {
                      break L19;
                    } else {
                      ((qc) this).field_G.a(121, ((qc) this).field_l, 20, 40, 8);
                      ((qc) this).field_l = ((qc) this).field_l + 25;
                      break L18;
                    }
                  }
                }
                ((qc) this).field_G.a(110, ((qc) this).field_l, 30, -10 + (-6 + ((qc) this).field_r), 8);
                ((qc) this).field_l = ((qc) this).field_l + 35;
                break L18;
              }
            }
            L20: {
              ((qc) this).a(110, 0, ((qc) this).field_l + 3, ((qc) this).field_r, 0);
              ((qc) this).a((ub) (Object) ((qc) this).field_H, (byte) 84);
              if (null != ((qc) this).field_M) {
                ((qc) this).a((ub) (Object) ((qc) this).field_M, (byte) 126);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (((qc) this).field_G == null) {
                break L21;
              } else {
                ((qc) this).a((ub) (Object) ((qc) this).field_G, (byte) 58);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var6;
            stackOut_77_1 = new StringBuilder().append("qc.<init>(");
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L22;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L22;
            }
          }
          L23: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');
            stackIn_84_0 = stackOut_81_0;
            stackIn_84_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L23;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_85_0 = stackOut_82_0;
              stackIn_85_1 = stackOut_82_1;
              stackIn_85_2 = stackOut_82_2;
              break L23;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, vh param3, int param4, String param5, boolean param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            he.field_q = param1;
            ej.field_d = param8;
            fg.field_c = param4;
            pg.field_j = param7;
            vk.field_p = param3;
            kj.field_a = param0;
            nf.field_b = param2;
            aa.field_hb = param5;
            ii.field_f = (na) (Object) new sl();
            ig.field_q = new cd(param3);
            wi.field_L = new ad(ii.field_f, ig.field_q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("qc.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + true + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void g() {
        field_N = null;
        field_E = null;
        field_I = null;
    }

    final String d(boolean param0) {
        if (!param0) {
          if (((qc) this).field_K.field_k == null) {
            return "";
          } else {
            return ((qc) this).field_K.field_k;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Sound         ";
    }
}
