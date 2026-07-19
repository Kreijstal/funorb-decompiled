/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv extends tj implements he {
    private String[] field_H;
    static String field_J;
    private fw[] field_E;
    private mf field_G;
    static String field_I;
    static int field_F;

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        td var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_D.b(param0 + -11);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  var3_int = param1.length;
                  this.field_H = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var4_int >= var3_int) {
                        break L3;
                      } else {
                        this.field_H[var4_int] = ug.a(kf.b(param0, 116), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 = new td(ArmiesOfGielinor.field_J, 0, 1);
                    this.field_E = new fw[var3_int + 1];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          this.field_E[var3_int] = new fw(h.field_h, (qo) (this));
                          this.field_E[var3_int].field_k = (kh) ((Object) var4);
                          this.field_E[var3_int].a(0, param0, var3_int * 16 + 16 + 20, param0 ^ 8292, 15);
                          this.a((byte) 10, (kb) (this.field_E[var3_int]));
                          break L5;
                        } else {
                          this.field_E[var5] = new fw(this.field_H[var5], (qo) (this));
                          this.field_E[var5].field_k = (kh) ((Object) var4);
                          this.field_E[var5].field_s = wl.field_J;
                          this.field_E[var5].a(0, 80, 20 - -(16 * var5), 8192, 15);
                          this.a((byte) 10, (kb) (this.field_E[var5]));
                          var5++;
                          if (var6 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            this.field_H = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("kv.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int[] var2 = null;
        var2 = new int[3];
        var1 = var2;
        var2[0] = 1;
        var2[2] = 16777215;
        var2[1] = 14737632;
        ll.field_Rb = new vn(oh.field_J, ga.field_k, rs.field_n, var2, 0, 0);
        if (param0 != -28541) {
          field_F = 18;
          le.field_b = new cg();
          tm.a();
          tm.b(0.75f);
          return;
        } else {
          le.field_b = new cg();
          tm.a();
          tm.b(0.75f);
          return;
        }
    }

    final static fl k(int param0) {
        if (param0 == 5) {
          if (iv.field_b == null) {
            iv.field_b = new fl();
            iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
            iv.field_b.field_s = 7697781;
            iv.field_b.field_o = 14;
            iv.field_b.field_h = 0;
            iv.field_b.field_c = 2763306;
            iv.field_b.field_m = gl.field_e;
            iv.field_b.field_d = 4;
            iv.field_b.field_x = 6;
            iv.field_b.field_r = 5;
            return iv.field_b;
          } else {
            return iv.field_b;
          }
        } else {
          field_J = (String) null;
          if (iv.field_b != null) {
            return iv.field_b;
          } else {
            iv.field_b = new fl();
            iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
            iv.field_b.field_s = 7697781;
            iv.field_b.field_o = 14;
            iv.field_b.field_h = 0;
            iv.field_b.field_c = 2763306;
            iv.field_b.field_m = gl.field_e;
            iv.field_b.field_d = 4;
            iv.field_b.field_x = 6;
            iv.field_b.field_r = 5;
            return iv.field_b;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        ka var5 = null;
        super.a(param0, param1, (byte) -95, param3);
        if (0 != param3) {
          return;
        } else {
          var5 = ArmiesOfGielinor.field_J;
          if (param2 > -82) {
            L0: {
              kv.b(true);
              if (this.field_H != null) {
                discarded$2 = var5.a(we.field_i, param0 + this.field_B, param1 + this.field_p, this.field_l, 20, 16777215, -1, 0, 0, var5.field_L + var5.field_H);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (this.field_H != null) {
                discarded$3 = var5.a(we.field_i, param0 + this.field_B, param1 + this.field_p, this.field_l, 20, 16777215, -1, 0, 0, var5.field_L + var5.field_H);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!ph.a(-19, param2)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != null) {
                L1: {
                  var3_int = param1.length();
                  if (!param0) {
                    break L1;
                  } else {
                    field_F = 103;
                    break L1;
                  }
                }
                if (-13 < (var3_int ^ -1)) {
                  if (rs.a(param2, (byte) -87)) {
                    if (var3_int != 0) {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("kv.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param3 == -12215) {
              if (!super.a(param0, param1, param2, param3 ^ 0)) {
                if (98 != param1) {
                  if (-100 == (param1 ^ -1)) {
                    stackOut_11_0 = this.b((byte) -125, param0);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_7_0 = this.a(false, param0);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("kv.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    kv(mf param0) {
        super(0, 0, 0, 0, (kh) null);
        try {
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        boolean discarded$2 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fw stackIn_6_0 = null;
        fw stackIn_6_1 = null;
        fw stackIn_8_0 = null;
        fw stackIn_8_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_5_0 = null;
        fw stackOut_5_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                discarded$2 = kv.a(false, (CharSequence) null, 'ﾪ');
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (this.field_H.length <= var6_int) {
                      break L5;
                    } else {
                      stackOut_5_0 = (fw) (param4);
                      stackOut_5_1 = this.field_E[var6_int];
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var7 != 0) {
                        if (stackIn_8_0 != stackIn_8_1) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          if (stackIn_6_0 != stackIn_6_1) {
                            break L6;
                          } else {
                            this.field_G.a(-1, this.field_H[var6_int]);
                            break L6;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (this.field_E[this.field_H.length] != param4) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                this.field_G.a((byte) -116);
                return;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("kv.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
            return;
        }
        field_J = null;
    }

    static {
        field_J = "No special action";
        field_I = "You cannot use this equipment until turn <%0>.";
    }
}
