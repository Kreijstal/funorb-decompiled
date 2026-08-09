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
        if (param0 != 2716) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, byte param3, lk param4) {
        RuntimeException var6 = null;
        gl var7 = null;
        ck var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new ck(20, param1, param0 + 120, 25, param4, false, 120, 3, j.field_C, 16777215, param2);
            this.b(var8, (byte) 118);
            var7 = new gl(((of) ((Object) param4)).a(-108));
            this.b(var7, (byte) 118);
            if (param3 == -21) {
              var7.a(15, (-15 + var8.field_q >> -2023095551) + var8.field_i, 15, 3 + (var8.field_h + var8.field_o), true);
              stackIn_4_0 = var8.field_q;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -4;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("kl.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_O.field_B = this.e((byte) 60);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "kl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(boolean param0) {
        ((hj) ((Object) this.field_D.a(109))).g(102);
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -109, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param2 ^ -1)) {
                if (param2 == 99) {
                  stackIn_10_0 = this.a(param3, (byte) -28);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 <= -99) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    this.field_J = (v) null;
                    return false;
                  }
                }
              } else {
                stackIn_6_0 = this.b(106, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("kl.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                if (-2 == (param1 ^ -1)) {
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
              this.field_J = (v) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("kl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final boolean l(int param0) {
        if (!(this.e((byte) 38))) {
            return false;
        }
        if (param0 != 20) {
            kl.b(113, 1, -15, 15, -70);
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_I.field_r);
        } catch (NumberFormatException numberFormatException) {
        }
        return oc.a(this.field_M.field_r, (kl) (this), this.field_D.field_r, this.field_G.field_r, this.field_N.field_D, param0 ^ 20, var2);
    }

    public static void m(int param0) {
        if (param0 != -23573) {
            return;
        }
        field_P = null;
    }

    private final boolean e(byte param0) {
        int var2;
        if (this.a(false, this.field_D)) {
          if (this.a(false, this.field_M)) {
            if (this.a(false, this.field_J)) {
              if (this.a(false, this.field_G)) {
                if (this.a(false, this.field_K)) {
                  if (!this.a(false, this.field_I)) {
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = 95 % ((-3 - param3) / 53);
            var6 = new ck(20, param4, param1 + 120, 25, param2, false, 120, 3, j.field_C, 16777215, param0);
            this.b(var6, (byte) 118);
            stackIn_1_0 = var6.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("kl.KA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(String param0, boolean param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_D;
            var4 = param0;
            ((hf) ((Object) var3)).a(var4, -18845, false);
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
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("kl.H(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final int a(lk param0, boolean param1, int param2, String param3, String param4, int param5) {
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var8 = (String) null;
                this.a((String) null, true);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, param5, param4, param3, param2, 25, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("kl.JA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = 37 / ((param1 - -62) / 32);
            if (param3 == this.field_F) {
              a.d((byte) 63);
              return;
            } else {
              if (this.field_O != param3) {
                break L0;
              } else {
                discarded$1 = this.l(20);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("kl.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
    }

    private final boolean a(boolean param0, of param1) {
        String discarded$1 = null;
        ba var3 = null;
        RuntimeException var3_ref = null;
        sg var4 = null;
        int stackIn_3_0 = 0;
        ba stackIn_6_0 = null;
        ba stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(94);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = (ba) (var3);

                if (param0) {
                  stackIn_7_0 = (ba) ((Object) stackIn_6_0);
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = (ba) ((Object) stackIn_6_0);
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              var4 = ((ba) (Object) stackIn_7_0).a(stackIn_7_1 != 0);
              if (pe.field_b == var4) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (tb.field_b == var4) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (il.field_e != var4) {
                    if (!param0) {
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      discarded$1 = this.d((byte) -121);
                      return true;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("kl.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    private final String d(byte param0) {
        if (param0 != 62) {
            return (String) null;
        }
        return "</col></u>";
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 152 - -(var7 * 48 / param0);
                  var9 = var8 << 1064439248 | var8 << -478241528 | var8;
                  vj.field_j[(var7 + param1) * vj.field_l + param2] = var9;
                  vj.field_j[param2 + (var7 + param1) * vj.field_l - -param4] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "kl.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(lk param0, int param1, String param2, String param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pa var9 = null;
        ck var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new ck(20, param4, param1 + 120, param5, param0, false, 120, 3, j.field_C, 16777215, param3);
            this.b(var10, (byte) 118);
            var9 = new pa(((of) ((Object) param0)).a(-125), param2, 126, var10.field_q + param4, 50 + param1, param6);
            var9.field_k = (pl) (this);
            this.b(var9, (byte) 118);
            stackIn_1_0 = var9.field_q + var10.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("kl.MA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    public kl() {
        super(0, 0, 496, 0, (ci) null);
        this.field_D = new v("", (pl) null, 12);
        this.field_M = new v("", (pl) null, 100);
        this.field_J = new v("", (pl) null, 100);
        this.field_G = new v("", (pl) null, 20);
        this.field_K = new v("", (pl) null, 20);
        this.field_I = new v("", (pl) null, 3);
        int var1 = 1;
        this.field_N = new ua("", (pl) null, var1 != 0);
        this.field_O = new hl(qk.field_h, (pl) null);
        this.field_F = new hl(dl.field_j, (pl) null);
        this.field_D.field_n = re.field_h;
        this.field_M.field_n = pf.field_g;
        this.field_J.field_n = te.field_b;
        this.field_G.field_n = db.field_f;
        this.field_K.field_n = ja.field_c;
        this.field_I.field_n = cc.field_b;
        this.field_N.field_n = nc.field_c;
        this.field_D.a((byte) 68, new hj(this.field_D));
        this.field_M.a((byte) 68, new rd(this.field_M));
        this.field_J.a((byte) 68, new p(this.field_J, this.field_M));
        this.field_G.a((byte) 68, new mk(this.field_G, this.field_D, this.field_M));
        this.field_K.a((byte) 68, new fg(this.field_K, this.field_G));
        this.field_I.a((byte) 68, new ai(this.field_I));
        this.field_O.field_B = false;
        this.field_O.field_v = (ci) ((Object) new ki());
        this.field_F.field_v = (ci) ((Object) new nb());
        this.field_D.field_v = (ci) ((Object) new r(10000536));
        r dupTemp$0 = new r(10000536);
        this.field_J.field_v = (ci) ((Object) dupTemp$0);
        this.field_M.field_v = (ci) ((Object) dupTemp$0);
        this.field_I.field_v = (ci) ((Object) new r(10000536));
        this.field_N.field_v = (ci) ((Object) new tg());
        rl dupTemp$1 = new rl(10000536);
        this.field_K.field_v = (ci) ((Object) dupTemp$1);
        this.field_G.field_v = (ci) ((Object) dupTemp$1);
        String var2 = re.a(lk.field_t, new String[]{this.n(2716), this.d((byte) 62)}, (byte) -50);
        int var3 = 20;
        var3 = var3 + this.a(cf.field_a, 170, this.field_M, -74, var3);
        var3 = var3 + (5 + this.a(this.field_J, 170, "", mb.field_b, var3, 25, 20));
        var3 = var3 + this.a(fl.field_b, 170, this.field_G, -96, var3);
        var3 = var3 + (this.a(this.field_K, true, var3, hk.field_c, mc.field_a, 170) + 5);
        var3 = var3 + (this.a(this.field_D, true, var3, mj.field_a, pk.field_c, 170) - -5);
        var3 = var3 + this.a(170, var3, th.field_b, (byte) -21, this.field_I);
        ck var4 = new ck(46, var3, -90 + this.field_h, 25, this.field_N, true, -120 + this.field_h, 5, me.field_c, 11579568, Main.field_M);
        this.b(var4, (byte) 118);
        var3 = var3 + var4.field_q;
        ek var5 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 0, 0, j.field_C.field_s, -1, 2147483647, true);
        this.field_H = new dg(var2, var5);
        this.field_H.field_n = "";
        this.field_H.a(ni.field_b, (byte) -117, 0);
        this.field_H.a(ni.field_b, (byte) 52, 1);
        this.field_H.field_k = (pl) (this);
        this.field_H.b(-63, this.field_h - 90, 46, var3);
        var3 = var3 + (15 + this.field_H.field_q);
        this.b(this.field_H, (byte) 118);
        int var6 = 4;
        int var7 = 200;
        this.field_O.a(40, var3, var7, -var7 + 496 >> 156031425, true);
        this.field_F.a(40, var3 - -15, 60, 3 + var6, true);
        this.field_F.field_k = (pl) (this);
        this.field_O.field_k = (pl) (this);
        this.b(this.field_O, (byte) 118);
        this.b(this.field_F, (byte) 118);
        this.field_L = new bd((wi) (this));
        this.field_L.a(150, 20 + this.field_D.field_i, -60 + (-this.field_D.field_h + this.field_h - this.field_D.field_o), this.field_D.field_h + this.field_D.field_o + 60, true);
        this.b(this.field_L, (byte) 118);
        this.a(var6 + (var3 - -55), 0, 496, 0, true);
    }

    static {
        field_P = "Names cannot start or end with space or underscore";
    }
}
