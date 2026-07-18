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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("qc.CA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final void a(og param0, int param1) {
        RuntimeException runtimeException = null;
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
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 4210752) {
              L1: {
                L2: {
                  if (qi.d(-1)) {
                    break L2;
                  } else {
                    if (0 >= ((qc) this).field_K.field_k.length()) {
                      break L1;
                    } else {
                      if (((qc) this).field_Q.field_k.length() <= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                w.a(((qc) this).field_Q.field_k, ((qc) this).field_K.field_k, -124);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "qc.UA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((qc) this).field_F == null) {
                break L1;
              } else {
                int discarded$2 = gh.field_b.a(((qc) this).field_F, 20 + (param0 - -((qc) this).field_o), 15 + (((qc) this).field_l + param3), ((qc) this).field_r - 40, ((qc) this).field_n, 16777215, -1, 1, 0, gh.field_b.field_M);
                break L1;
              }
            }
            L2: {
              if (null != ((qc) this).field_M) {
                ed.f(10 + param0, 134 + param3, ((qc) this).field_r + -20, 4210752);
                break L2;
              } else {
                break L2;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var5, "qc.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_33_0 = null;
        Class stackIn_39_0 = null;
        Class stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_38_0 = null;
        Class stackOut_40_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_10_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -39) {
                if (!param0.equals((Object) (Object) "I")) {
                  if (!param0.equals((Object) (Object) "S")) {
                    if (param0.equals((Object) (Object) "J")) {
                      stackOut_20_0 = Long.TYPE;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      if (param0.equals((Object) (Object) "Z")) {
                        stackOut_25_0 = Boolean.TYPE;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        if (!param0.equals((Object) (Object) "F")) {
                          if (!param0.equals((Object) (Object) "D")) {
                            if (param0.equals((Object) (Object) "C")) {
                              stackOut_38_0 = Character.TYPE;
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            } else {
                              stackOut_40_0 = Class.forName(param0);
                              stackIn_41_0 = stackOut_40_0;
                              break L0;
                            }
                          } else {
                            stackOut_32_0 = Double.TYPE;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0;
                          }
                        } else {
                          stackOut_28_0 = Float.TYPE;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      }
                    }
                  } else {
                    stackOut_14_0 = Short.TYPE;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_10_0 = Integer.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (Class) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("qc.JA(");
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L1;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
        }
        return stackIn_41_0;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qc.IA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
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
              L3: {
                if (((qc) this).field_H == param1) {
                  break L3;
                } else {
                  L4: {
                    if (((qc) this).field_M != param1) {
                      break L4;
                    } else {
                      w.b(param0 ^ 18904);
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (((qc) this).field_G != param1) {
                    break L2;
                  } else {
                    L5: {
                      if (((qc) this).field_J) {
                        break L5;
                      } else {
                        L6: {
                          if (!((qc) this).field_O) {
                            break L6;
                          } else {
                            pg.a((byte) -97);
                            if (var7 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                        sf.a((byte) -89);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ea.c(param0 ^ 12849);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(4210752);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("qc.DA(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(int param0) {
        try {
            ((qc) this).field_K.e(true);
            ((qc) this).field_Q.e(true);
            int var2_int = 127 % ((-20 - param0) / 50);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "qc.HA(" + param0 + ')');
        }
    }

    qc(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (bf) null);
        RuntimeException var6 = null;
        jl var6_ref = null;
        vd var7 = null;
        String var8 = null;
        uf var9 = null;
        ik var10 = null;
        int var11 = 0;
        Object stackIn_13_0 = null;
        pl stackIn_13_1 = null;
        pl stackIn_13_2 = null;
        Object stackIn_15_0 = null;
        pl stackIn_15_1 = null;
        pl stackIn_15_2 = null;
        Object stackIn_17_0 = null;
        pl stackIn_17_1 = null;
        pl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pl stackIn_18_1 = null;
        pl stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        pl stackOut_12_1 = null;
        pl stackOut_12_2 = null;
        Object stackOut_17_0 = null;
        pl stackOut_17_1 = null;
        pl stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_13_0 = null;
        pl stackOut_13_1 = null;
        pl stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        pl stackOut_15_1 = null;
        pl stackOut_15_2 = null;
        String stackOut_15_3 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              ((qc) this).field_F = param1;
              ((qc) this).field_O = param4;
              ((qc) this).field_J = param2;
              ((qc) this).field_P = param3;
              if (!((qc) this).field_J) {
                break L1;
              } else {
                L2: {
                  if (((qc) this).field_P) {
                    break L2;
                  } else {
                    if (!((qc) this).field_O) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L3: {
              L4: {
                ((qc) this).field_K = (og) (Object) new p(param0, (ce) this, 100);
                ((qc) this).field_Q = (og) (Object) new p("", (ce) this, 20);
                if (!((qc) this).field_J) {
                  break L4;
                } else {
                  ((qc) this).field_H = new pl(me.field_a, (ce) null);
                  ((qc) this).field_G = new pl(pk.field_q, (ce) null);
                  ((qc) this).field_K.field_B = false;
                  if (var11 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                ((qc) this).field_H = new pl(dj.field_a, (ce) null);
                stackOut_12_0 = this;
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackIn_17_0 = stackOut_12_0;
                stackIn_17_1 = stackOut_12_1;
                stackIn_17_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (!((qc) this).field_O) {
                  stackOut_17_0 = this;
                  stackOut_17_1 = null;
                  stackOut_17_2 = null;
                  stackOut_17_3 = ti.field_h;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  break L5;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackOut_15_3 = th.field_b;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  stackIn_18_3 = stackOut_15_3;
                  break L5;
                }
              }
              ((qc) this).field_G = new pl(stackIn_18_3, (ce) null);
              if (!((qc) this).field_P) {
                break L3;
              } else {
                ((qc) this).field_M = new pl(qk.field_h, (ce) this);
                break L3;
              }
            }
            L6: {
              ((qc) this).field_K.field_w = (bf) (Object) new qb(10000536);
              ((qc) this).field_Q.field_w = (bf) (Object) new ke(10000536);
              var6_ref = new jl();
              ((qc) this).field_H.field_w = (bf) (Object) var6_ref;
              if (null == ((qc) this).field_G) {
                break L6;
              } else {
                ((qc) this).field_G.field_w = (bf) (Object) var6_ref;
                break L6;
              }
            }
            L7: {
              if (((qc) this).field_M != null) {
                ((qc) this).field_M.field_w = (bf) (Object) var6_ref;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              ((qc) this).field_K.field_p = tf.field_a;
              if (((qc) this).field_M != null) {
                ((qc) this).field_M.field_p = hb.field_i;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (!((qc) this).field_J) {
                  break L10;
                } else {
                  ((qc) this).field_G.field_p = sh.field_a;
                  if (var11 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (((qc) this).field_O) {
                  break L11;
                } else {
                  ((qc) this).field_G.field_w = (bf) (Object) new tk();
                  if (var11 == 0) {
                    break L9;
                  } else {
                    break L11;
                  }
                }
              }
              ((qc) this).field_G.field_p = hf.field_a;
              ((qc) this).field_G.field_w = (bf) (Object) new tk();
              break L9;
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
              L14: {
                var8 = ai.field_j;
                var9 = jf.a(jg.f(1), (byte) 48);
                if (var9 == hd.field_C) {
                  break L14;
                } else {
                  if (var9 != jf.field_e) {
                    break L13;
                  } else {
                    var8 = tl.field_b;
                    if (var11 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var8 = dc.field_q;
              break L13;
            }
            L15: {
              ik dupTemp$2 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_K, false, 80, 3, var7, 16777215, var8);
              var10 = dupTemp$2;
              ((qc) this).a((ub) (Object) dupTemp$2, (byte) 57);
              ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var10).field_n);
              ik dupTemp$3 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_Q, false, 80, 3, var7, 16777215, qk.field_d);
              var10 = dupTemp$3;
              ((qc) this).a((ub) (Object) dupTemp$3, (byte) 85);
              ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var10).field_n);
              ((qc) this).field_H.field_s = (ce) this;
              if (((qc) this).field_M == null) {
                break L15;
              } else {
                ((qc) this).field_M.field_s = (ce) this;
                break L15;
              }
            }
            L16: {
              if (((qc) this).field_G != null) {
                ((qc) this).field_G.field_s = (ce) this;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              L18: {
                if (((qc) this).field_M != null) {
                  break L18;
                } else {
                  ((qc) this).field_H.a(118, ((qc) this).field_l, 30, -10 + (((qc) this).field_r - 6), 8);
                  ((qc) this).field_l = ((qc) this).field_l + 35;
                  if (var11 == 0) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              ((qc) this).field_H.a(118, ((qc) this).field_l, 30, ((qc) this).field_r + -95, 85);
              ((qc) this).field_l = ((qc) this).field_l + 60;
              break L17;
            }
            L19: {
              if (null != ((qc) this).field_M) {
                ((qc) this).field_M.a(121, ((qc) this).field_l, 30, ((qc) this).field_r + -16, 8);
                ((qc) this).field_l = ((qc) this).field_l + 35;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (null == ((qc) this).field_G) {
                break L20;
              } else {
                L21: {
                  if (((qc) this).field_J) {
                    break L21;
                  } else {
                    if (((qc) this).field_O) {
                      break L21;
                    } else {
                      ((qc) this).field_G.a(121, ((qc) this).field_l, 20, 40, 8);
                      ((qc) this).field_l = ((qc) this).field_l + 25;
                      if (var11 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                ((qc) this).field_G.a(110, ((qc) this).field_l, 30, -10 + (-6 + ((qc) this).field_r), 8);
                ((qc) this).field_l = ((qc) this).field_l + 35;
                break L20;
              }
            }
            L22: {
              ((qc) this).a(110, 0, ((qc) this).field_l + 3, ((qc) this).field_r, 0);
              ((qc) this).a((ub) (Object) ((qc) this).field_H, (byte) 84);
              if (null != ((qc) this).field_M) {
                ((qc) this).a((ub) (Object) ((qc) this).field_M, (byte) 126);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((qc) this).field_G == null) {
                break L23;
              } else {
                ((qc) this).a((ub) (Object) ((qc) this).field_G, (byte) 58);
                break L23;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) var6;
            stackOut_90_1 = new StringBuilder().append("qc.<init>(");
            stackIn_93_0 = stackOut_90_0;
            stackIn_93_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param0 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L24;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_94_0 = stackOut_91_0;
              stackIn_94_1 = stackOut_91_1;
              stackIn_94_2 = stackOut_91_2;
              break L24;
            }
          }
          L25: {
            stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',');
            stackIn_97_0 = stackOut_94_0;
            stackIn_97_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L25;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_98_0 = stackOut_95_0;
              stackIn_98_1 = stackOut_95_1;
              stackIn_98_2 = stackOut_95_2;
              break L25;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            if (param6) {
              vk.field_p = param3;
              kj.field_a = param0;
              nf.field_b = param2;
              aa.field_hb = param5;
              ii.field_f = (na) (Object) new sl();
              ig.field_q = new cd(param3);
              wi.field_L = new ad(ii.field_f, ig.field_q);
              break L0;
            } else {
              return;
            }
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
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_N = null;
              if (param0 == -6664) {
                break L1;
              } else {
                field_L = 3;
                break L1;
              }
            }
            field_E = null;
            field_I = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "qc.GA(" + param0 + ')');
        }
    }

    final String d(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (!param0) {
              if (((qc) this).field_K.field_k == null) {
                stackOut_6_0 = "";
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((qc) this).field_K.field_k;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "qc.VA(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Sound         ";
    }
}
