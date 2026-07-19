/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ta implements jb, ai {
    private String field_L;
    static int field_H;
    static int[] field_F;
    private vi field_N;
    static String[] field_B;
    private boolean field_M;
    private s field_A;
    static String field_G;
    private boolean field_J;
    private vi field_C;
    private boolean field_D;
    private s field_K;
    private s field_I;

    final String a(byte param0) {
        if (!(this.field_N.field_l != null)) {
            return "";
        }
        if (param0 < 77) {
            return (String) null;
        }
        return this.field_N.field_l;
    }

    public static void l(int param0) {
        boolean discarded$0 = false;
        field_B = null;
        field_G = null;
        field_F = null;
        if (param0 != -100) {
            ki var2 = (ki) null;
            discarded$0 = pk.a(2, 65, (ki) null, 120);
        }
    }

    public final void a(vi param0, boolean param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_N != param0) {
                break L1;
              } else {
                discarded$2 = this.field_C.a(-81, (pj) (this));
                break L1;
              }
            }
            L2: {
              if (this.field_C != param0) {
                break L2;
              } else {
                this.k(99);
                break L2;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                this.a(-16, 78, -13, 121);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("pk.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (null != this.field_L) {
            discarded$0 = lm.field_f.a(this.field_L, 20 + this.field_s + param3, this.field_n + (param0 + 15), this.field_m + -40, this.field_r, 16777215, -1, 1, 0, lm.field_f.field_H);
        }
        if (!(this.field_K == null)) {
            ul.d(param3 - -10, param0 + 134, -20 + this.field_m, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void m(int param0) {
        this.field_N.e((byte) -128);
        this.field_C.e((byte) -128);
        if (param0 > -7) {
            this.field_I = (s) null;
        }
    }

    final static boolean a(int param0, int param1, ki param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6 = param2.b(param1, false, param3);
            var4 = var6;
            var5 = 28 / ((param0 - 28) / 40);
            if (var6 != null) {
              OrbDefence.a(var6, (byte) -93);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("pk.P(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 98) {
                if ((param1 ^ -1) == -100) {
                  stackOut_9_0 = this.b(param2, false);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a(param2, false);
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("pk.I(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 != this.field_I) {
                  L3: {
                    if (this.field_K == param3) {
                      break L3;
                    } else {
                      if (param3 == this.field_A) {
                        L4: {
                          if (this.field_M) {
                            break L4;
                          } else {
                            L5: {
                              if (!this.field_D) {
                                break L5;
                              } else {
                                qd.a((byte) 127);
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            dk.a((byte) 19);
                            if (var7 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        pa.a(true);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        var6_int = -47 % ((-3 - param0) / 62);
                        break L1;
                      }
                    }
                  }
                  d.c((byte) -66);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    this.k(35);
                    break L2;
                  }
                } else {
                  this.k(35);
                  break L2;
                }
              }
              var6_int = -47 % ((-3 - param0) / 62);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("pk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, String param1) {
        vi var3 = null;
        String var4 = null;
        try {
            var3 = this.field_N;
            var4 = param1;
            var3.a(0, false, var4);
            if (param0 < 119) {
                this.field_N = (vi) null;
            }
            this.field_C.e((byte) -126);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vi param0, int param1) {
        RuntimeException runtimeException = null;
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
              if (param1 > 27) {
                break L1;
              } else {
                this.field_K = (s) null;
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
            stackOut_3_1 = new StringBuilder().append("pk.N(");
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    pk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (td) null);
        h dupTemp$2 = null;
        h dupTemp$3 = null;
        RuntimeException var6 = null;
        vk var6_ref = null;
        kc var7 = null;
        String var8 = null;
        df var9 = null;
        int var11 = 0;
        h var12 = null;
        h var13 = null;
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
        Object stackIn_16_0 = null;
        s stackIn_16_1 = null;
        s stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        s stackIn_17_1 = null;
        s stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        s stackIn_18_1 = null;
        s stackIn_18_2 = null;
        String stackIn_18_3 = null;
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
        Object stackOut_15_0 = null;
        s stackOut_15_1 = null;
        s stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        s stackOut_17_1 = null;
        s stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        s stackOut_16_1 = null;
        s stackOut_16_2 = null;
        String stackOut_16_3 = null;
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
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_L = param1;
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
              ((pk) (this)).field_D = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
              ((pk) (this)).field_J = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
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
              ((pk) (this)).field_M = stackIn_10_1 != 0;
              if (!this.field_M) {
                break L4;
              } else {
                L5: {
                  if (this.field_J) {
                    break L5;
                  } else {
                    if (!this.field_D) {
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
              L7: {
                this.field_N = (vi) ((Object) new oc(param0, (ag) (this), 100));
                this.field_C = (vi) ((Object) new oc("", (ag) (this), 20));
                if (this.field_M) {
                  break L7;
                } else {
                  L8: {
                    this.field_I = new s(q.field_a, (ag) null);
                    stackOut_15_0 = this;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    if (this.field_D) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = null;
                      stackOut_17_2 = null;
                      stackOut_17_3 = gl.field_k;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      stackIn_18_3 = stackOut_17_3;
                      break L8;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = vc.field_i;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      break L8;
                    }
                  }
                  ((pk) (this)).field_A = new s(stackIn_18_3, (ag) null);
                  if (!this.field_J) {
                    break L6;
                  } else {
                    this.field_K = new s(ki.field_h, (ag) (this));
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_I = new s(tk.field_l, (ag) null);
              this.field_A = new s(ld.field_d, (ag) null);
              this.field_N.field_F = false;
              break L6;
            }
            L9: {
              this.field_N.field_j = (td) ((Object) new fg(10000536));
              this.field_C.field_j = (td) ((Object) new eg(10000536));
              var6_ref = new vk();
              this.field_I.field_j = (td) ((Object) var6_ref);
              if (this.field_A == null) {
                break L9;
              } else {
                this.field_A.field_j = (td) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_N.field_i = rl.field_b;
              if (this.field_K == null) {
                break L10;
              } else {
                this.field_K.field_j = (td) ((Object) var6_ref);
                break L10;
              }
            }
            L11: {
              if (this.field_K == null) {
                break L11;
              } else {
                this.field_K.field_i = ec.field_J;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!this.field_M) {
                  break L13;
                } else {
                  this.field_A.field_i = ql.field_d;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (this.field_D) {
                  break L14;
                } else {
                  this.field_A.field_j = (td) ((Object) new qc());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              this.field_A.field_i = og.field_j;
              this.field_A.field_j = (td) ((Object) new qc());
              break L12;
            }
            L15: {
              this.field_n = 15;
              var7 = lm.field_f;
              if (null == this.field_L) {
                break L15;
              } else {
                this.field_n = this.field_n + (var7.a(this.field_L, -40 + this.field_m, var7.field_H) + 5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = le.field_d;
                var9 = oa.a(true, uj.b((byte) -120));
                if (mj.field_l == var9) {
                  break L17;
                } else {
                  if (var9 != vh.field_s) {
                    break L16;
                  } else {
                    var8 = wd.field_k;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              var8 = gl.field_h;
              break L16;
            }
            L18: {
              dupTemp$2 = new h(10, this.field_n, -20 + this.field_m, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(dupTemp$2, (byte) 74);
              this.field_n = this.field_n + (((pj) ((Object) var12)).field_r + 5);
              dupTemp$3 = new h(10, this.field_n, this.field_m + -20, 25, this.field_C, false, 80, 3, var7, 16777215, hi.field_h);
              var13 = dupTemp$3;
              this.a(dupTemp$3, (byte) 74);
              this.field_n = this.field_n + (((pj) ((Object) var13)).field_r - -5);
              this.field_I.field_h = (ag) (this);
              if (this.field_K == null) {
                break L18;
              } else {
                this.field_K.field_h = (ag) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_A) {
                break L19;
              } else {
                this.field_A.field_h = (ag) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_K != null) {
                  break L21;
                } else {
                  this.field_I.a(8, this.field_n, 30, (byte) -90, -6 + this.field_m - 10);
                  this.field_n = this.field_n + 35;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_I.a(85, this.field_n, 30, (byte) -90, -95 + this.field_m);
              this.field_n = this.field_n + 60;
              break L20;
            }
            L22: {
              if (this.field_K == null) {
                break L22;
              } else {
                this.field_K.a(8, this.field_n, 30, (byte) -90, this.field_m - 6 + -10);
                this.field_n = this.field_n + 35;
                break L22;
              }
            }
            L23: {
              if (null == this.field_A) {
                break L23;
              } else {
                L24: {
                  if (this.field_M) {
                    break L24;
                  } else {
                    if (this.field_D) {
                      break L24;
                    } else {
                      this.field_A.a(8, this.field_n, 20, (byte) -90, 40);
                      this.field_n = this.field_n + 25;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                this.field_A.a(8, this.field_n, 30, (byte) -90, -6 + (this.field_m - 10));
                this.field_n = this.field_n + 35;
                break L23;
              }
            }
            L25: {
              this.a(0, 0, 3 + this.field_n, (byte) -90, this.field_m);
              this.a(this.field_I, (byte) 74);
              if (null == this.field_K) {
                break L25;
              } else {
                this.a(this.field_K, (byte) 74);
                break L25;
              }
            }
            L26: {
              if (null == this.field_A) {
                break L26;
              } else {
                this.a(this.field_A, (byte) 74);
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("pk.<init>(");
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
              break L27;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L27;
            }
          }
          L28: {
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
              break L28;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L28;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void k(int param0) {
        boolean discarded$2 = false;
        pj var3 = null;
        L0: {
          L1: {
            if (qe.b(14388)) {
              break L1;
            } else {
              if ((this.field_N.field_l.length() ^ -1) >= -1) {
                break L0;
              } else {
                if ((this.field_C.field_l.length() ^ -1) < -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          vf.a((byte) 108, this.field_C.field_l, this.field_N.field_l);
          break L0;
        }
        L2: {
          if (param0 >= 27) {
            break L2;
          } else {
            var3 = (pj) null;
            discarded$2 = this.a('￷', 82, (pj) null, -124);
            break L2;
          }
        }
    }

    static {
        field_F = new int[4];
        field_H = 0;
        field_B = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = "Email address is unavailable";
    }
}
