/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        og var3 = null;
        String var4 = null;
        try {
            var3 = this.field_K;
            if (param0 != 5990) {
                field_E = (o[]) null;
            }
            var4 = param1;
            var3.a(-1, false, var4);
            this.field_Q.e(true);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "qc.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(og param0, int param1) {
        RuntimeException runtimeException = null;
        pl var4 = null;
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
              if (param1 == 5) {
                break L1;
              } else {
                var4 = (pl) null;
                this.a(56, (pl) null, 121, 39, 55);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qc.FA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        if (param0 != 4210752) {
          return;
        } else {
          L0: {
            L1: {
              if (qi.d(-1)) {
                break L1;
              } else {
                if (0 >= this.field_K.field_k.length()) {
                  break L0;
                } else {
                  if (this.field_Q.field_k.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            w.a(this.field_Q.field_k, this.field_K.field_k, -124);
            break L0;
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (this.field_F != null) {
            discarded$0 = gh.field_b.a(this.field_F, 20 + (param0 - -this.field_o), 15 + (this.field_l + param3), this.field_r - 40, this.field_n, 16777215, -1, 1, 0, gh.field_b.field_M);
        }
        if (!(null == this.field_M)) {
            ed.f(10 + param0, 134 + param3, this.field_r + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_11_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -39) {
                if (!param0.equals("I")) {
                  if (!param0.equals("S")) {
                    if (param0.equals("J")) {
                      stackOut_15_0 = Long.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param0.equals("Z")) {
                        stackOut_19_0 = Boolean.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("F")) {
                          if (!param0.equals("D")) {
                            if (param0.equals("C")) {
                              stackOut_29_0 = Character.TYPE;
                              stackIn_30_0 = stackOut_29_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return Class.forName(param0);
                            }
                          } else {
                            stackOut_25_0 = Double.TYPE;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackOut_22_0 = Float.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackOut_11_0 = Short.TYPE;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = Integer.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = (Class) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("qc.JA(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        return stackIn_30_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) -125, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 98) {
                if (param2 <= -96) {
                  if (param1 != 99) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_11_0 = this.b(param3, 1);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = this.a((byte) -117, param3);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0 != 0;
              }
            }
          }
        }
    }

    public final void a(int param0, og param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_K != param1) {
                break L1;
              } else {
                discarded$2 = this.field_Q.a((ub) (this), 8);
                break L1;
              }
            }
            L2: {
              if (this.field_Q == param1) {
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
                this.field_O = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("qc.IA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == -18905) {
                break L1;
              } else {
                field_E = (o[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_H == param1) {
                this.a(4210752);
                break L2;
              } else {
                if (this.field_M != param1) {
                  if (this.field_G != param1) {
                    break L2;
                  } else {
                    if (this.field_J) {
                      ea.c(param0 ^ 12849);
                      break L2;
                    } else {
                      if (!this.field_O) {
                        sf.a((byte) -89);
                        break L2;
                      } else {
                        pg.a((byte) -97);
                        break L2;
                      }
                    }
                  }
                } else {
                  w.b(param0 ^ 18904);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("qc.DA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(int param0) {
        this.field_K.e(true);
        this.field_Q.e(true);
        int var2 = 127 % ((-20 - param0) / 50);
    }

    qc(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (bf) null);
        ik dupTemp$2 = null;
        ik dupTemp$3 = null;
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
        Object stackIn_17_0 = null;
        pl stackIn_17_1 = null;
        pl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pl stackIn_18_1 = null;
        pl stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        pl stackIn_19_1 = null;
        pl stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
        Object stackOut_16_0 = null;
        pl stackOut_16_1 = null;
        pl stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        pl stackOut_18_1 = null;
        pl stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        pl stackOut_17_1 = null;
        pl stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              this.field_F = param1;
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
              ((qc) (this)).field_O = stackIn_4_1 != 0;
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
              ((qc) (this)).field_J = stackIn_7_1 != 0;
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
              ((qc) (this)).field_P = stackIn_10_1 != 0;
              if (!this.field_J) {
                break L4;
              } else {
                L5: {
                  if (this.field_P) {
                    break L5;
                  } else {
                    if (!this.field_O) {
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
              this.field_K = (og) ((Object) new p(param0, (ce) (this), 100));
              this.field_Q = (og) ((Object) new p("", (ce) (this), 20));
              if (!this.field_J) {
                L7: {
                  this.field_H = new pl(dj.field_a, (ce) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!this.field_O) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = ti.field_h;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = th.field_b;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((qc) (this)).field_G = new pl(stackIn_19_3, (ce) null);
                if (!this.field_P) {
                  break L6;
                } else {
                  this.field_M = new pl(qk.field_h, (ce) (this));
                  break L6;
                }
              } else {
                this.field_H = new pl(me.field_a, (ce) null);
                this.field_G = new pl(pk.field_q, (ce) null);
                this.field_K.field_B = false;
                break L6;
              }
            }
            L8: {
              this.field_K.field_w = (bf) ((Object) new qb(10000536));
              this.field_Q.field_w = (bf) ((Object) new ke(10000536));
              var6_ref = new jl();
              this.field_H.field_w = (bf) ((Object) var6_ref);
              if (null == this.field_G) {
                break L8;
              } else {
                this.field_G.field_w = (bf) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              if (this.field_M == null) {
                break L9;
              } else {
                this.field_M.field_w = (bf) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_K.field_p = tf.field_a;
              if (this.field_M == null) {
                break L10;
              } else {
                this.field_M.field_p = hb.field_i;
                break L10;
              }
            }
            L11: {
              if (!this.field_J) {
                if (this.field_O) {
                  this.field_G.field_p = hf.field_a;
                  this.field_G.field_w = (bf) ((Object) new tk());
                  break L11;
                } else {
                  this.field_G.field_w = (bf) ((Object) new tk());
                  break L11;
                }
              } else {
                this.field_G.field_p = sh.field_a;
                break L11;
              }
            }
            L12: {
              this.field_l = 15;
              var7 = gh.field_b;
              if (null == this.field_F) {
                break L12;
              } else {
                this.field_l = this.field_l + (5 + var7.a(this.field_F, -40 + this.field_r, var7.field_M));
                break L12;
              }
            }
            L13: {
              var8 = ai.field_j;
              var9 = jf.a(jg.f(1), (byte) 48);
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
              dupTemp$2 = new ik(10, this.field_l, -20 + this.field_r, 25, this.field_K, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a((ub) (dupTemp$2), (byte) 57);
              this.field_l = this.field_l + (5 + ((ub) ((Object) var12)).field_n);
              dupTemp$3 = new ik(10, this.field_l, -20 + this.field_r, 25, this.field_Q, false, 80, 3, var7, 16777215, qk.field_d);
              var13 = dupTemp$3;
              this.a((ub) (dupTemp$3), (byte) 85);
              this.field_l = this.field_l + (5 + ((ub) ((Object) var13)).field_n);
              this.field_H.field_s = (ce) (this);
              if (this.field_M == null) {
                break L14;
              } else {
                this.field_M.field_s = (ce) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_G == null) {
                break L15;
              } else {
                this.field_G.field_s = (ce) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_M != null) {
                this.field_H.a(118, this.field_l, 30, this.field_r + -95, 85);
                this.field_l = this.field_l + 60;
                break L16;
              } else {
                this.field_H.a(118, this.field_l, 30, -10 + (this.field_r - 6), 8);
                this.field_l = this.field_l + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_M) {
                break L17;
              } else {
                this.field_M.a(121, this.field_l, 30, this.field_r + -16, 8);
                this.field_l = this.field_l + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_G) {
                break L18;
              } else {
                L19: {
                  if (this.field_J) {
                    break L19;
                  } else {
                    if (this.field_O) {
                      break L19;
                    } else {
                      this.field_G.a(121, this.field_l, 20, 40, 8);
                      this.field_l = this.field_l + 25;
                      break L18;
                    }
                  }
                }
                this.field_G.a(110, this.field_l, 30, -10 + (-6 + this.field_r), 8);
                this.field_l = this.field_l + 35;
                break L18;
              }
            }
            L20: {
              this.a(110, 0, this.field_l + 3, this.field_r, 0);
              this.a((ub) (this.field_H), (byte) 84);
              if (null == this.field_M) {
                break L20;
              } else {
                this.a((ub) (this.field_M), (byte) 126);
                break L20;
              }
            }
            L21: {
              if (this.field_G == null) {
                break L21;
              } else {
                this.a((ub) (this.field_G), (byte) 58);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("qc.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, vh param3, int param4, String param5, boolean param6, int param7, int param8) {
        he.field_q = param1;
        ej.field_d = param8;
        fg.field_c = param4;
        pg.field_j = param7;
        if (!param6) {
            return;
        }
        try {
            vk.field_p = param3;
            kj.field_a = param0;
            nf.field_b = param2;
            aa.field_hb = param5;
            ii.field_f = (na) ((Object) new sl());
            ig.field_q = new cd(param3);
            wi.field_L = new ad(ii.field_f, ig.field_q);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "qc.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void g(int param0) {
        field_N = null;
        if (param0 != -6664) {
            field_L = 3;
        }
        field_E = null;
        field_I = null;
    }

    final String d(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (!(this.field_K.field_k != null)) {
            return "";
        }
        return this.field_K.field_k;
    }

    static {
        field_N = "Sound         ";
    }
}
