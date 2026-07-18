/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_h;
    private int[] field_e;
    static String field_f;
    private int[] field_d;
    static String field_g;
    static int field_b;
    static String field_c;
    private byte[] field_a;

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (f.field_a >= 0) {
          L0: {
            var3_int = 185;
            var4 = 205;
            var5 = 256;
            if (f.field_a < 75) {
              var5 = (f.field_a << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (200 < f.field_a) {
              var5 = (-f.field_a + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            r.a(0, m.field_w);
            ep.e();
            oo.b();
            rl.a((byte) 125);
            if (var5 < 256) {
              oo.f(0, 0, oo.field_b, oo.field_l, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          int discarded$1 = 1;
          ql.a();
          if (f.field_a >= 150) {
            qp.field_v.c(15 + var3_int, var4 - -10, var5);
            return;
          } else {
            m.field_w.f(var3_int, var4);
            return;
          }
        } else {
          return;
        }
    }

    final static ld a(boolean param0, cj param1, cj param2, cj param3, ob param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ld[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ob var13_ref_ob = null;
        int var14 = 0;
        int var15 = 0;
        tl var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        ld stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        ld stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param4.field_x != null) {
                  stackOut_8_0 = param4.field_x.length;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_9_0;
                if (null != param4.field_B) {
                  stackOut_11_0 = param4.field_B.length;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_12_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                var25 = new char[var7];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var9 = var19;
                var24 = new int[var7];
                var22 = var24;
                var20 = var22;
                var18 = var20;
                var10 = var18;
                var11 = new ld[var7];
                if (null == param4.field_x) {
                  break L3;
                } else {
                  var12 = 0;
                  L4: while (true) {
                    if (param4.field_x.length <= var12) {
                      break L3;
                    } else {
                      var13_ref_ob = ok.field_p.a(param4.field_x[var12], 32767);
                      var8[var12] = var13_ref_ob.field_s;
                      var9[var12] = param4.field_r[var12];
                      var11[var12] = eh.a(false, param1, param2, param3, var13_ref_ob);
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
              L5: {
                if (param4.field_B == null) {
                  break L5;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L6: while (true) {
                    if (param4.field_B.length <= var14) {
                      break L5;
                    } else {
                      L7: {
                        var15 = param4.field_B[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = le.field_I;
                          var9[var14 + var12] = param4.field_D[var14];
                          var10[var12 + var14] = param4.field_B[var14];
                          break L7;
                        } else {
                          L8: {
                            var16 = bd.field_c.a(var15, -11452);
                            var8[var12 - -var14] = var16.e(-18572);
                            var9[var12 + var14] = param4.field_D[var14];
                            if (var9[var12 + var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10[var12 + var14] = param4.field_B[var14];
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_27_0 = new ld(0L, param3, param1, param2, var11, var24, var8, var25);
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("eh.D(").append(false).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_28_0;
    }

    final static void a(int param0) {
        ja var1 = null;
        RuntimeException var1_ref = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = new ja(540, 140);
            r.a(0, var1);
            ep.e();
            oo.b();
            f.field_a = 0;
            rl.a((byte) 120);
            var2 = var1.c();
            var3 = 0;
            L1: while (true) {
              if (var3 >= 15) {
                kk.field_r.a();
                var1.f(0, 0);
                int discarded$1 = 1;
                ql.a();
                break L0;
              } else {
                var2.f(-2, -2, 16777215);
                oo.i(4, 4, 0, 0, 540, 140);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "eh.A(" + -1741 + ')');
        }
    }

    public static void a() {
        field_h = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 != 0) {
              var7_int = 0;
              param0 = param0 + param2;
              var9 = 77 / ((param1 - -1) / 54);
              var8 = param5;
              L1: while (true) {
                L2: {
                  var10 = param3[var8];
                  if (var10 < 0) {
                    var7_int = ((eh) this).field_d[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] < 0) {
                      int incrementValue$7 = param2;
                      param2++;
                      param4[incrementValue$7] = (byte)(~var11);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L4;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((64 & var10) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] >= 0) {
                      break L6;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param4[incrementValue$8] = (byte)(~var11);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L7: {
                    if (0 != (32 & var10)) {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (0 <= ((eh) this).field_d[var7_int]) {
                      break L8;
                    } else {
                      int incrementValue$9 = param2;
                      param2++;
                      param4[incrementValue$9] = (byte)(~var11);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L8;
                      } else {
                        return 1 + (var8 - param5);
                      }
                    }
                  }
                  L9: {
                    if ((16 & var10) != 0) {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] < 0) {
                      int incrementValue$10 = param2;
                      param2++;
                      param4[incrementValue$10] = (byte)(~var11);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var10 & 8) != 0) {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] >= 0) {
                      break L12;
                    } else {
                      int incrementValue$11 = param2;
                      param2++;
                      param4[incrementValue$11] = (byte)(~var11);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (0 == (4 & var10)) {
                      var7_int++;
                      break L13;
                    } else {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L13;
                    }
                  }
                  L14: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] < 0) {
                      int incrementValue$12 = param2;
                      param2++;
                      param4[incrementValue$12] = (byte)(~var11);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var10 & 2) == 0) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] >= 0) {
                      break L16;
                    } else {
                      int incrementValue$13 = param2;
                      param2++;
                      param4[incrementValue$13] = (byte)(~var11);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (0 != (1 & var10)) {
                      var7_int = ((eh) this).field_d[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var11 = ((eh) this).field_d[var7_int];
                    if (((eh) this).field_d[var7_int] >= 0) {
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_69_0 = 1 + (var8 - param5);
                stackIn_70_0 = stackOut_69_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("eh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          L20: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L20;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L20;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ')');
        }
        return stackIn_70_0;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              param0 = param0 + param2;
              var8 = param4 << 3;
              if (param1 == -62) {
                break L1;
              } else {
                ((eh) this).field_a = null;
                break L1;
              }
            }
            L2: while (true) {
              if (param2 >= param0) {
                stackOut_25_0 = (7 + var8 >> 3) - param4;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                var9 = 255 & param5[param2];
                var10 = ((eh) this).field_e[var9];
                var11 = ((eh) this).field_a[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = (-1 + (var13 - -var11) >> 3) + var12;
                    var8 = var8 + var11;
                    var13 += 24;
                    int dupTemp$1 = cr.b(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param3[var12] = (byte)dupTemp$1;
                    if (var14 <= var12) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param2++;
                  continue L2;
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var7;
            stackOut_27_1 = new StringBuilder().append("eh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          L5: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
        return stackIn_26_0;
    }

    eh(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((eh) this).field_e = new int[var2_int];
            ((eh) this).field_a = param0;
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            ((eh) this).field_d = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 != var6) {
                    L3: {
                      var7 = 1 << 32 + -var6;
                      var8 = var19[var6];
                      ((eh) this).field_e[var5] = var8;
                      if ((var7 & var8) == 0) {
                        var10 = var6 + -1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var19[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << 32 + -var10;
                                if ((var11 & var12) == 0) {
                                  var3[var10] = cr.b(var12, var11);
                                  var10--;
                                  continue L4;
                                } else {
                                  var3[var10] = var3[-1 + var10];
                                  break L5;
                                }
                              }
                            }
                          }
                          var9 = var8 | var7;
                          break L3;
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var19[var6] = var9;
                    var10 = var6 + 1;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            L8: {
                              if (var4 > var10) {
                                break L8;
                              } else {
                                var4 = 1 + var10;
                                break L8;
                              }
                            }
                            ((eh) this).field_d[var10] = ~var5;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var8 & var12)) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (((eh) this).field_d[var10] != 0) {
                                    break L10;
                                  } else {
                                    ((eh) this).field_d[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = ((eh) this).field_d[var10];
                                break L9;
                              }
                            }
                            L11: {
                              if (var10 < ((eh) this).field_d.length) {
                                break L11;
                              } else {
                                var13 = new int[2 * ((eh) this).field_d.length];
                                var14 = 0;
                                L12: while (true) {
                                  if (var14 >= ((eh) this).field_d.length) {
                                    ((eh) this).field_d = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = ((eh) this).field_d[var14];
                                    var14++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        L13: {
                          if (var19[var10] != var8) {
                            break L13;
                          } else {
                            var19[var10] = var9;
                            break L13;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("eh.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_f = "Scamming";
        field_c = "Enter multiplayer lobby";
        field_h = "From only <%0>/month";
        field_g = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
