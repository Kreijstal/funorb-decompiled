/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends g implements cl, qh, wi {
    private v field_D;
    private v field_M;
    private v field_I;
    private hl field_F;
    private v field_K;
    private hl field_O;
    private v field_J;
    private ua field_N;
    static String field_P;
    bd field_L;
    static int field_E;
    private dg field_H;
    private v field_G;

    private final String n(int param0) {
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, byte param3, lk param4) {
        RuntimeException var6 = null;
        gl var7 = null;
        ck var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
            var8 = new ck(20, param1, param0 + 120, 25, param4, false, 120, 3, j.field_C, 16777215, param2);
            ((kl) this).b((lk) (Object) var8, (byte) 118);
            var7 = new gl(((of) (Object) param4).a(-108));
            ((kl) this).b((lk) (Object) var7, (byte) 118);
            if (param3 == -21) {
              var7.a(15, (-15 + var8.field_q >> 1) + var8.field_i, 15, 3 + (var8.field_h + var8.field_o), true);
              stackOut_3_0 = var8.field_q;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -4;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("kl.GA(").append(param0).append(44).append(param1).append(44);
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((kl) this).field_O.field_B = this.e((byte) 60);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "kl.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final void a(boolean param0) {
        ((hj) (Object) ((kl) this).field_D.a(109)).g(102);
        if (!param0) {
            kl.b(-18, 20, -112, 46, -45);
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
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
            if (super.a(param0, (byte) -109, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != 98) {
                if (param2 == 99) {
                  stackOut_9_0 = ((kl) this).a(param3, (byte) -28);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param1 <= -99) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    ((kl) this).field_J = null;
                    return false;
                  }
                }
              } else {
                stackOut_5_0 = ((kl) this).b(106, param3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("kl.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                if (param1 == 1) {
                  he.a(0, "privacy.ws");
                  break L1;
                } else {
                  if (param1 == 2) {
                    he.a(0, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                he.a(0, "terms.ws");
                break L1;
              }
            }
            if (param2 == 26) {
              break L0;
            } else {
              ((kl) this).field_J = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("kl.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final boolean l(int param0) {
        if (!(this.e((byte) 38))) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((kl) this).field_I.field_r);
        } catch (NumberFormatException numberFormatException) {
        }
        return oc.a(((kl) this).field_M.field_r, (kl) this, ((kl) this).field_D.field_r, ((kl) this).field_G.field_r, ((kl) this).field_N.field_D, 0, var2);
    }

    public static void m(int param0) {
        if (param0 != -23573) {
            return;
        }
        field_P = null;
    }

    private final boolean e(byte param0) {
        int var2 = 0;
        if (this.a(false, (of) (Object) ((kl) this).field_D)) {
          if (this.a(false, (of) (Object) ((kl) this).field_M)) {
            if (this.a(false, (of) (Object) ((kl) this).field_J)) {
              if (this.a(false, (of) (Object) ((kl) this).field_G)) {
                if (this.a(false, (of) (Object) ((kl) this).field_K)) {
                  if (!this.a(false, (of) (Object) ((kl) this).field_I)) {
                    return false;
                  } else {
                    var2 = 50 / ((param0 - -26) / 55);
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final int a(String param0, int param1, lk param2, int param3, int param4) {
        ck var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var7 = 95 % ((-3 - param3) / 53);
            var6 = new ck(20, param4, param1 + 120, 25, param2, false, 120, 3, j.field_C, 16777215, param0);
            ((kl) this).b((lk) (Object) var6, (byte) 118);
            stackOut_0_0 = var6.field_q;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("kl.KA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(String param0, boolean param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
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
            var3 = ((kl) this).field_D;
            var4 = param0;
            ((hf) (Object) var3).a(var4, -18845, false);
            if (param1) {
              break L0;
            } else {
              kl.m(86);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("kl.H(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final int a(lk param0, boolean param1, int param2, String param3, String param4, int param5) {
        RuntimeException var7 = null;
        Object var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var8 = null;
                ((kl) this).a((String) null, true);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, 170, param4, param3, param2, 25, 35);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("kl.JA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 170 + 41);
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var6_int = 37 / ((param1 - -62) / 32);
            if (param3 == ((kl) this).field_F) {
              a.d((byte) 63);
              return;
            } else {
              if (((kl) this).field_O != param3) {
                break L0;
              } else {
                boolean discarded$2 = this.l(20);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("kl.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 41);
        }
    }

    private final boolean a(boolean param0, of param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        sg var4 = null;
        int stackIn_3_0 = 0;
        ba stackIn_5_0 = null;
        ba stackIn_6_0 = null;
        ba stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        ba stackOut_4_0 = null;
        ba stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ba stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var3 = param1.a(94);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                stackOut_4_0 = (ba) var3;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0) {
                  stackOut_6_0 = (ba) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = (ba) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              var4 = ((ba) (Object) stackIn_7_0).a(stackIn_7_1 != 0);
              if (pe.field_b == var4) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                if (tb.field_b == var4) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  if (il.field_e != var4) {
                    if (!param0) {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      String discarded$2 = this.d((byte) -121);
                      return true;
                    }
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("kl.HA(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    private final String d(byte param0) {
        if (param0 != 62) {
            return null;
        }
        return "</col></u>";
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              vj.d(param2, param1, param4 - -1, 10000536);
              vj.d(param2, param0 + param1, 1 + param4, 12105912);
              var5_int = 1;
              if (param1 - -var5_int < vj.field_h) {
                var5_int = vj.field_h + -param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param0;
              if (vj.field_b >= param1 - -var6) {
                break L2;
              } else {
                var6 = vj.field_b - param1;
                break L2;
              }
            }
            if (param3 == 48) {
              var7 = var5_int;
              L3: while (true) {
                if (var6 <= var7) {
                  break L0;
                } else {
                  var8 = 152 - -(var7 * 48 / param0);
                  var9 = var8 << 16 | var8 << 8 | var8;
                  vj.field_j[(var7 + param1) * vj.field_l + param2] = var9;
                  vj.field_j[param2 + (var7 + param1) * vj.field_l - -param4] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "kl.OA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(lk param0, int param1, String param2, String param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pa var9 = null;
        ck var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var10 = new ck(20, param4, param1 + 120, param5, param0, false, 120, 3, j.field_C, 16777215, param3);
            ((kl) this).b((lk) (Object) var10, (byte) 118);
            var9 = new pa(((of) (Object) param0).a(-125), param2, 126, var10.field_q + param4, 50 + param1, param6);
            var9.field_k = (pl) this;
            ((kl) this).b((lk) (Object) var9, (byte) 118);
            stackOut_0_0 = var9.field_q + var10.field_q;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("kl.MA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    public kl() {
        super(0, 0, 496, 0, (ci) null);
        ((kl) this).field_D = new v("", (pl) null, 12);
        ((kl) this).field_M = new v("", (pl) null, 100);
        ((kl) this).field_J = new v("", (pl) null, 100);
        ((kl) this).field_G = new v("", (pl) null, 20);
        ((kl) this).field_K = new v("", (pl) null, 20);
        ((kl) this).field_I = new v("", (pl) null, 3);
        int var1 = 1;
        ((kl) this).field_N = new ua("", (pl) null, var1 != 0);
        ((kl) this).field_O = new hl(qk.field_h, (pl) null);
        ((kl) this).field_F = new hl(dl.field_j, (pl) null);
        ((kl) this).field_D.field_n = re.field_h;
        ((kl) this).field_M.field_n = pf.field_g;
        ((kl) this).field_J.field_n = te.field_b;
        ((kl) this).field_G.field_n = db.field_f;
        ((kl) this).field_K.field_n = ja.field_c;
        ((kl) this).field_I.field_n = cc.field_b;
        ((kl) this).field_N.field_n = nc.field_c;
        ((kl) this).field_D.a((byte) 68, (ba) (Object) new hj((hf) (Object) ((kl) this).field_D));
        ((kl) this).field_M.a((byte) 68, (ba) (Object) new rd((hf) (Object) ((kl) this).field_M));
        ((kl) this).field_J.a((byte) 68, (ba) (Object) new p((hf) (Object) ((kl) this).field_J, (hf) (Object) ((kl) this).field_M));
        ((kl) this).field_G.a((byte) 68, (ba) (Object) new mk((hf) (Object) ((kl) this).field_G, (hf) (Object) ((kl) this).field_D, (hf) (Object) ((kl) this).field_M));
        ((kl) this).field_K.a((byte) 68, (ba) (Object) new fg((hf) (Object) ((kl) this).field_K, (hf) (Object) ((kl) this).field_G));
        ((kl) this).field_I.a((byte) 68, (ba) (Object) new ai((hf) (Object) ((kl) this).field_I));
        ((kl) this).field_O.field_B = false;
        ((kl) this).field_O.field_v = (ci) (Object) new ki();
        ((kl) this).field_F.field_v = (ci) (Object) new nb();
        ((kl) this).field_D.field_v = (ci) (Object) new r(10000536);
        r dupTemp$0 = new r(10000536);
        ((kl) this).field_J.field_v = (ci) (Object) dupTemp$0;
        ((kl) this).field_M.field_v = (ci) (Object) dupTemp$0;
        ((kl) this).field_I.field_v = (ci) (Object) new r(10000536);
        ((kl) this).field_N.field_v = (ci) (Object) new tg();
        rl dupTemp$1 = new rl(10000536);
        ((kl) this).field_K.field_v = (ci) (Object) dupTemp$1;
        ((kl) this).field_G.field_v = (ci) (Object) dupTemp$1;
        String var2 = re.a(lk.field_t, new String[2], (byte) -50);
        int var3 = 20;
        var3 = var3 + this.a(cf.field_a, 170, (lk) (Object) ((kl) this).field_M, -74, var3);
        var3 = var3 + (5 + this.a((lk) (Object) ((kl) this).field_J, 170, "", mb.field_b, var3, 25, 20));
        var3 = var3 + this.a(fl.field_b, 170, (lk) (Object) ((kl) this).field_G, -96, var3);
        var3 = var3 + (this.a((lk) (Object) ((kl) this).field_K, true, var3, hk.field_c, mc.field_a, 170) + 5);
        var3 = var3 + (this.a((lk) (Object) ((kl) this).field_D, true, var3, mj.field_a, pk.field_c, 170) - -5);
        var3 = var3 + this.a(170, var3, th.field_b, (byte) -21, (lk) (Object) ((kl) this).field_I);
        ck var4 = new ck(46, var3, -90 + ((kl) this).field_h, 25, (lk) (Object) ((kl) this).field_N, true, -120 + ((kl) this).field_h, 5, me.field_c, 11579568, Main.field_M);
        ((kl) this).b((lk) (Object) var4, (byte) 118);
        var3 = var3 + var4.field_q;
        ek var5 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 0, 0, j.field_C.field_s, -1, 2147483647, true);
        ((kl) this).field_H = new dg(var2, (ci) (Object) var5);
        ((kl) this).field_H.field_n = "";
        ((kl) this).field_H.a(ni.field_b, (byte) -117, 0);
        ((kl) this).field_H.a(ni.field_b, (byte) 52, 1);
        ((kl) this).field_H.field_k = (pl) this;
        ((kl) this).field_H.b(-63, ((kl) this).field_h - 90, 46, var3);
        var3 = var3 + (15 + ((kl) this).field_H.field_q);
        ((kl) this).b((lk) (Object) ((kl) this).field_H, (byte) 118);
        int var6 = 4;
        int var7 = 200;
        ((kl) this).field_O.a(40, var3, var7, -var7 + 496 >> 1, true);
        ((kl) this).field_F.a(40, var3 - -15, 60, 3 + var6, true);
        ((kl) this).field_F.field_k = (pl) this;
        ((kl) this).field_O.field_k = (pl) this;
        ((kl) this).b((lk) (Object) ((kl) this).field_O, (byte) 118);
        ((kl) this).b((lk) (Object) ((kl) this).field_F, (byte) 118);
        ((kl) this).field_L = new bd((wi) this);
        ((kl) this).field_L.a(150, 20 + ((kl) this).field_D.field_i, -60 + (-((kl) this).field_D.field_h + ((kl) this).field_h - ((kl) this).field_D.field_o), ((kl) this).field_D.field_h + ((kl) this).field_D.field_o + 60, true);
        ((kl) this).b((lk) (Object) ((kl) this).field_L, (byte) 118);
        ((kl) this).a(var6 + (var3 - -55), 0, 496, 0, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Names cannot start or end with space or underscore";
    }
}
