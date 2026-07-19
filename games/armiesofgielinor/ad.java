/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends tj implements he {
    private ro field_L;
    private ka field_J;
    static gu field_K;
    private String field_G;
    private int field_E;
    private int[] field_F;
    private fw[] field_H;
    static String field_I;

    final fw a(String param0, qo param1, byte param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
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
        fw stackOut_0_0 = null;
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
            var4 = new fw(param0, param1);
            var4.field_k = (kh) ((Object) new nu());
            var5 = this.field_w - 2;
            var6 = -98 / ((24 - param2) / 44);
            this.a(0, this.field_l, 0, 8192, this.field_w + 34);
            var4.a(7, this.field_l - 14, var5, 8192, 30);
            this.a((byte) 10, (kb) (var4));
            stackOut_0_0 = (fw) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("ad.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1) {
        fw[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        fw[] var8 = null;
        fw[] var9 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_E < param0) {
          var4 = -57 % ((44 - param1) / 34);
          var8 = new fw[param0];
          var9 = var8;
          var3 = var9;
          var5 = new int[param0];
          var6 = 0;
          L0: while (true) {
            if (var6 < this.field_E) {
              var8[var6] = this.field_H[var6];
              var5[var6] = this.field_F[var6];
              var6++;
              if (var7 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_H = var9;
              this.field_E = param0;
              this.field_F = var5;
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != 63) {
            field_I = (String) null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.field_E <= var6_int) {
                      break L4;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_16_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (((ad) (this)).field_H[var6_int] == param4) {
                              break L6;
                            } else {
                              if (var8 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            var7 = this.field_F[var6_int];
                            if (0 == (var7 ^ -1)) {
                              break L7;
                            } else {
                              gl.a(123, this.field_F[var6_int]);
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          this.field_L.b(true);
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        var6_int++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 == 11) {
                    break L2;
                  } else {
                    stackOut_15_0 = this;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  }
                }
                ((ad) (this)).field_F = (int[]) null;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (runtimeException);
            stackOut_18_1 = new StringBuilder().append("ad.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    ad(ro param0, ka param1, String param2) {
        super(0, 0, 288, 0, (kh) null);
        int var4_int = 0;
        this.field_E = 0;
        try {
            this.field_G = param2;
            this.field_L = param0;
            this.field_J = param1;
            var4_int = this.field_G != null ? this.field_J.a(this.field_G, 260, this.field_J.field_H) : 0;
            this.a(0, 288, 0, 8192, 22 - -var4_int);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -123, param3);
        int discarded$32 = this.field_J.a(this.field_G, 14 + param0 - -this.field_B, this.field_p + param1 - -10, -28 + this.field_l, this.field_w, 16777215, -1, 0, 0, this.field_J.field_H);
        if (param2 > -82) {
            ad.a((byte) 73);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        of var1_ref = null;
        au var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1_ref = (of) ((Object) be.field_u.e((byte) 97));
            L1: while (true) {
              L2: {
                if (var1_ref == null) {
                  break L2;
                } else {
                  L3: {
                    if (0 < var1_ref.field_Rb) {
                      var1_ref.field_Rb = var1_ref.field_Rb - 1;
                      if (-1 != (var1_ref.field_Rb ^ -1)) {
                        break L3;
                      } else {
                        var1_ref.field_Kb = 0;
                        if (!var1_ref.k(0)) {
                          break L3;
                        } else {
                          var1_ref.d(-126);
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var1_ref = (of) ((Object) be.field_u.a((byte) 123));
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var1_ref2 = (au) ((Object) qc.field_g.e((byte) 89));
              L4: while (true) {
                L5: {
                  L6: {
                    if (var1_ref2 == null) {
                      break L6;
                    } else {
                      stackOut_11_0 = 0;
                      stackOut_11_1 = var1_ref2.field_Lb;
                      stackIn_21_0 = stackOut_11_0;
                      stackIn_21_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_12_0 < stackIn_12_1) {
                            var1_ref2.field_Lb = var1_ref2.field_Lb - 1;
                            if (var1_ref2.field_Lb == 0) {
                              var1_ref2.field_mc = 0;
                              if (var1_ref2.k(-7)) {
                                var1_ref2.d(106);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var1_ref2 = (au) ((Object) qc.field_g.a((byte) 123));
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = -62;
                  stackOut_20_1 = (param0 - -41) / 60;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L5;
                }
                var2 = stackIn_21_0 % stackIn_21_1;
                var1_ref = (of) ((Object) wl.field_F.e((byte) 115));
                L8: while (true) {
                  if (var1_ref == null) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      L9: {
                        if (0 < var1_ref.field_Rb) {
                          var1_ref.field_Rb = var1_ref.field_Rb - 1;
                          if (var1_ref.field_Rb == 0) {
                            var1_ref.field_Kb = 0;
                            if (!var1_ref.k(0)) {
                              break L9;
                            } else {
                              var1_ref.d(-123);
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      var1_ref = (of) ((Object) wl.field_F.a((byte) 123));
                      continue L8;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ad.E(" + param0 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_E;
            this.b(var4_int + param2, -104);
            this.field_H[var4_int] = this.a(param0, (qo) (this), (byte) 104);
            this.field_F[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_K = new gu();
    }
}
