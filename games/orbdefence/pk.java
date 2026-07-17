/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        if (!(((pk) this).field_N.field_l != null)) {
            return "";
        }
        if (param0 < 77) {
            return null;
        }
        return ((pk) this).field_N.field_l;
    }

    public static void l() {
        field_B = null;
        field_G = null;
        field_F = null;
    }

    public final void a(vi param0, boolean param1) {
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
              if (((pk) this).field_N != param0) {
                break L1;
              } else {
                boolean discarded$2 = ((pk) this).field_C.a(-81, (pj) this);
                break L1;
              }
            }
            L2: {
              if (((pk) this).field_C != param0) {
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
                ((pk) this).a(-16, 78, -13, 121);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pk.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((pk) this).field_L) {
            int discarded$0 = lm.field_f.a(((pk) this).field_L, 20 + ((pk) this).field_s + param3, ((pk) this).field_n + (param0 + 15), ((pk) this).field_m + -40, ((pk) this).field_r, 16777215, -1, 1, 0, lm.field_f.field_H);
        }
        if (!(((pk) this).field_K == null)) {
            ul.d(param3 - -10, param0 + 134, -20 + ((pk) this).field_m, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void m(int param0) {
        ((pk) this).field_N.e((byte) -128);
        ((pk) this).field_C.e((byte) -128);
        if (param0 > -7) {
            ((pk) this).field_I = null;
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
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("pk.P(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_4_0 != 0;
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
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 == 99) {
                  stackOut_9_0 = ((pk) this).b(param2, false);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((pk) this).a(param2, false);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("pk.I(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
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
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 == ((pk) this).field_I) {
                  this.k(35);
                  break L2;
                } else {
                  if (((pk) this).field_K == param3) {
                    d.c((byte) -66);
                    break L2;
                  } else {
                    if (param3 == ((pk) this).field_A) {
                      if (((pk) this).field_M) {
                        pa.a(true);
                        break L2;
                      } else {
                        if (!((pk) this).field_D) {
                          int discarded$13 = 19;
                          dk.a();
                          break L2;
                        } else {
                          qd.a((byte) 127);
                          break L2;
                        }
                      }
                    } else {
                      var6_int = -47 % ((-3 - param0) / 62);
                      break L1;
                    }
                  }
                }
              }
              var6_int = -47 % ((-3 - param0) / 62);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("pk.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
    }

    final void a(int param0, String param1) {
        vi var3 = null;
        String var4 = null;
        try {
            var3 = ((pk) this).field_N;
            var4 = param1;
            var3.a(0, false, var4);
            if (param0 < 119) {
                ((pk) this).field_N = null;
            }
            ((pk) this).field_C.e((byte) -126);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "pk.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
                ((pk) this).field_K = null;
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
            stackOut_3_1 = new StringBuilder().append("pk.N(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    pk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (td) null);
        RuntimeException var6 = null;
        vk var6_ref = null;
        kc var7 = null;
        String var8 = null;
        df var9 = null;
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
        try {
          L0: {
            L1: {
              ((pk) this).field_L = param1;
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
              ((pk) this).field_D = stackIn_4_1 != 0;
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
              ((pk) this).field_J = stackIn_7_1 != 0;
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
              ((pk) this).field_M = stackIn_10_1 != 0;
              if (!((pk) this).field_M) {
                break L4;
              } else {
                L5: {
                  if (((pk) this).field_J) {
                    break L5;
                  } else {
                    if (!((pk) this).field_D) {
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
              ((pk) this).field_N = (vi) (Object) new oc(param0, (ag) this, 100);
              ((pk) this).field_C = (vi) (Object) new oc("", (ag) this, 20);
              if (((pk) this).field_M) {
                ((pk) this).field_I = new s(tk.field_l, (ag) null);
                ((pk) this).field_A = new s(ld.field_d, (ag) null);
                ((pk) this).field_N.field_F = false;
                break L6;
              } else {
                L7: {
                  ((pk) this).field_I = new s(q.field_a, (ag) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (((pk) this).field_D) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = gl.field_k;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = vc.field_i;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((pk) this).field_A = new s(stackIn_18_3, (ag) null);
                if (!((pk) this).field_J) {
                  break L6;
                } else {
                  ((pk) this).field_K = new s(ki.field_h, (ag) this);
                  break L6;
                }
              }
            }
            L8: {
              ((pk) this).field_N.field_j = (td) (Object) new fg(10000536);
              ((pk) this).field_C.field_j = (td) (Object) new eg(10000536);
              var6_ref = new vk();
              ((pk) this).field_I.field_j = (td) (Object) var6_ref;
              if (((pk) this).field_A == null) {
                break L8;
              } else {
                ((pk) this).field_A.field_j = (td) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((pk) this).field_N.field_i = rl.field_b;
              if (((pk) this).field_K == null) {
                break L9;
              } else {
                ((pk) this).field_K.field_j = (td) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (((pk) this).field_K == null) {
                break L10;
              } else {
                ((pk) this).field_K.field_i = ec.field_J;
                break L10;
              }
            }
            L11: {
              if (!((pk) this).field_M) {
                if (((pk) this).field_D) {
                  ((pk) this).field_A.field_i = og.field_j;
                  ((pk) this).field_A.field_j = (td) (Object) new qc();
                  break L11;
                } else {
                  ((pk) this).field_A.field_j = (td) (Object) new qc();
                  break L11;
                }
              } else {
                ((pk) this).field_A.field_i = ql.field_d;
                break L11;
              }
            }
            L12: {
              ((pk) this).field_n = 15;
              var7 = lm.field_f;
              if (null == ((pk) this).field_L) {
                break L12;
              } else {
                ((pk) this).field_n = ((pk) this).field_n + (var7.a(((pk) this).field_L, -40 + ((pk) this).field_m, var7.field_H) + 5);
                break L12;
              }
            }
            L13: {
              var8 = le.field_d;
              var9 = oa.a(true, uj.b((byte) -120));
              if (mj.field_l == var9) {
                var8 = gl.field_h;
                break L13;
              } else {
                if (var9 != vh.field_s) {
                  break L13;
                } else {
                  var8 = wd.field_k;
                  break L13;
                }
              }
            }
            L14: {
              h dupTemp$2 = new h(10, ((pk) this).field_n, -20 + ((pk) this).field_m, 25, (pj) (Object) ((pk) this).field_N, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((pk) this).a((pj) (Object) dupTemp$2, (byte) 74);
              ((pk) this).field_n = ((pk) this).field_n + (((pj) (Object) var12).field_r + 5);
              h dupTemp$3 = new h(10, ((pk) this).field_n, ((pk) this).field_m + -20, 25, (pj) (Object) ((pk) this).field_C, false, 80, 3, var7, 16777215, hi.field_h);
              var13 = dupTemp$3;
              ((pk) this).a((pj) (Object) dupTemp$3, (byte) 74);
              ((pk) this).field_n = ((pk) this).field_n + (((pj) (Object) var13).field_r - -5);
              ((pk) this).field_I.field_h = (ag) this;
              if (((pk) this).field_K == null) {
                break L14;
              } else {
                ((pk) this).field_K.field_h = (ag) this;
                break L14;
              }
            }
            L15: {
              if (null == ((pk) this).field_A) {
                break L15;
              } else {
                ((pk) this).field_A.field_h = (ag) this;
                break L15;
              }
            }
            L16: {
              if (((pk) this).field_K != null) {
                ((pk) this).field_I.a(85, ((pk) this).field_n, 30, (byte) -90, -95 + ((pk) this).field_m);
                ((pk) this).field_n = ((pk) this).field_n + 60;
                break L16;
              } else {
                ((pk) this).field_I.a(8, ((pk) this).field_n, 30, (byte) -90, -6 + ((pk) this).field_m - 10);
                ((pk) this).field_n = ((pk) this).field_n + 35;
                break L16;
              }
            }
            L17: {
              if (((pk) this).field_K == null) {
                break L17;
              } else {
                ((pk) this).field_K.a(8, ((pk) this).field_n, 30, (byte) -90, ((pk) this).field_m - 16);
                ((pk) this).field_n = ((pk) this).field_n + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((pk) this).field_A) {
                break L18;
              } else {
                L19: {
                  if (((pk) this).field_M) {
                    break L19;
                  } else {
                    if (((pk) this).field_D) {
                      break L19;
                    } else {
                      ((pk) this).field_A.a(8, ((pk) this).field_n, 20, (byte) -90, 40);
                      ((pk) this).field_n = ((pk) this).field_n + 25;
                      break L18;
                    }
                  }
                }
                ((pk) this).field_A.a(8, ((pk) this).field_n, 30, (byte) -90, -6 + (((pk) this).field_m - 10));
                ((pk) this).field_n = ((pk) this).field_n + 35;
                break L18;
              }
            }
            L20: {
              ((pk) this).a(0, 0, 3 + ((pk) this).field_n, (byte) -90, ((pk) this).field_m);
              ((pk) this).a((pj) (Object) ((pk) this).field_I, (byte) 74);
              if (null == ((pk) this).field_K) {
                break L20;
              } else {
                ((pk) this).a((pj) (Object) ((pk) this).field_K, (byte) 74);
                break L20;
              }
            }
            L21: {
              if (null == ((pk) this).field_A) {
                break L21;
              } else {
                ((pk) this).a((pj) (Object) ((pk) this).field_A, (byte) 74);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("pk.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void k(int param0) {
        Object var3 = null;
        L0: {
          L1: {
            if (qe.b(14388)) {
              break L1;
            } else {
              if (((pk) this).field_N.field_l.length() <= 0) {
                break L0;
              } else {
                if (((pk) this).field_C.field_l.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          vf.a((byte) 108, ((pk) this).field_C.field_l, ((pk) this).field_N.field_l);
          break L0;
        }
        L2: {
          if (param0 >= 27) {
            break L2;
          } else {
            var3 = null;
            boolean discarded$2 = ((pk) this).a('￷', 82, (pj) null, -124);
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[4];
        field_H = 0;
        field_B = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = "Email address is unavailable";
    }
}
