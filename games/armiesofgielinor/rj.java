/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends kb {
    private static int[] field_M;
    private int field_C;
    private int field_P;
    private int field_N;
    int field_D;
    static je field_F;
    private wk field_S;
    private int field_E;
    private int field_L;
    private wk[] field_O;
    private wk field_J;
    private int field_H;
    boolean field_R;
    private wk field_K;
    static String field_G;
    static int[] field_Q;

    private final wk b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wk var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var14 = new wk(this.field_C * 2, this.field_w);
        vn.a(var14, 3);
        var5 = this.field_w >> 279312513;
        if (param1 >= -54) {
          return (wk) null;
        } else {
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_w) {
                  break L2;
                } else {
                  var7 = (this.field_C * 2 - 1) * (var6 >> 330885057) % (this.field_C * 2);
                  var8 = param2 & 16711935;
                  var9 = 65280 & param2;
                  var10 = var6 + -var5;
                  var11 = (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0) + 128;
                  stackOut_3_0 = var11 ^ -1;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_4_0 <= -257) {
                        stackOut_6_0 = var9 | var8;
                        stackIn_7_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = (var8 * var11 & -16711936 | 16711680 & var11 * var9) >>> 382852360;
                        stackIn_7_0 = stackOut_5_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_7_0;
                      qn.e(var7, var6, this.field_C, var12);
                      var8 = 16711935 & param0;
                      qn.e(var7 + -(this.field_C * 2), var6, this.field_C, var12);
                      var9 = 65280 & param0;
                      if ((var11 ^ -1) > -257) {
                        stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -392666296;
                        stackIn_10_0 = stackOut_9_0;
                        break L4;
                      } else {
                        stackOut_8_0 = var9 | var8;
                        stackIn_10_0 = stackOut_8_0;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0;
                    qn.e(var7 - -this.field_C, var6, this.field_C, var12);
                    qn.e(-this.field_C + var7, var6, this.field_C, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_11_0 = -18862;
              stackIn_12_0 = stackOut_11_0;
              break L1;
            }
            rf.b(stackIn_12_0);
            return var14;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(3);
    }

    final void c(int param0, int param1, int param2) {
        this.field_L = param1;
        this.field_H = param0;
        this.field_P = param1 >> -1864971167 & 8355711;
        this.field_E = 8355711 & param0 >> 928997857;
        this.i(3);
        if (param2 != 27178) {
            field_F = (je) null;
        }
    }

    private final void a(int param0, int param1, wk param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param3 + this.field_l;
            id.a(this.field_J.field_y + param3, -this.field_J.field_y + var5_int, param1 + this.field_w, param1, (byte) 87);
            var6 = -this.field_N + param3;
            var7 = -123 / ((param0 - -26) / 40);
            L1: while (true) {
              L2: {
                if (var6 >= var5_int) {
                  rf.b(-18862);
                  break L2;
                } else {
                  param2.g(var6, param1);
                  var6 = var6 + param2.field_y;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                if (qn.field_j <= param3 + this.field_J.field_y) {
                  vn.a(this.field_K, 3);
                  param2.g(-this.field_N, 0);
                  param2.g(this.field_C * 2 - this.field_N, 0);
                  this.field_S.b(0, 0);
                  rf.b(-18862);
                  this.field_K.g(param3, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-this.field_J.field_y + var5_int <= qn.field_e) {
                vn.a(this.field_K, 3);
                var8 = -this.field_J.field_y + this.field_l + this.field_N;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var8 <= this.field_C * 2) {
                        break L6;
                      } else {
                        var8 = var8 - this.field_C * 2;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (var9 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    param2.g(-var8, 0);
                    param2.g(-var8 + this.field_C * 2, 0);
                    this.field_J.b(0, 0);
                    rf.b(-18862);
                    break L5;
                  }
                  this.field_K.g(var5_int - this.field_J.field_y, param1);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final static bi a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            bi var5 = null;
            dh var5_ref = null;
            bi stackIn_2_0 = null;
            bi stackIn_4_0 = null;
            dh stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            bi stackOut_3_0 = null;
            bi stackOut_1_0 = null;
            dh stackOut_5_0 = null;
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
                try {
                  L1: {
                    var4 = Class.forName("jo");
                    var5 = (bi) (var4.newInstance());
                    if (param2 == 1423111778) {
                      var5.a(param0, param2 ^ -1423111760, param3, param1);
                      stackOut_3_0 = (bi) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (bi) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new dh();
                  ((bi) ((Object) var5_ref)).a(param0, -46, param3, param1);
                  stackOut_5_0 = (dh) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (bi) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("rj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param3 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 616254785 & 8355711, (param6 & 16711422) >> -1924693887);
    }

    public static void a(byte param0) {
        field_G = null;
        field_M = null;
        field_F = null;
        if (param0 >= -67) {
            return;
        }
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 < -82) {
          if (0 != param3) {
            return;
          } else {
            L0: {
              var5 = this.field_B + param0;
              var6 = param1 + this.field_p;
              this.a(-77, var6, this.field_O[0], var5);
              if (65536 > this.field_D) {
                id.a((this.field_l * this.field_D >> 2083344304) + var5, var5 + this.field_l, this.field_w + var6, var6, (byte) 74);
                this.a(-103, var6, this.field_O[1], var5);
                rf.b(-18862);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        wk discarded$2 = null;
        RuntimeException var5 = null;
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
              if (this.field_R) {
                this.field_N = this.field_N + 1;
                if (this.field_C * 2 < this.field_N) {
                  this.field_N = this.field_N - this.field_C * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 == 32722) {
              break L0;
            } else {
              discarded$2 = this.b(11, 65, -18);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("rj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(int param0) {
        li discarded$4 = null;
        li discarded$5 = null;
        li discarded$6 = null;
        li discarded$7 = null;
        byte[] var1 = null;
        byte[] var2 = null;
        if (!nw.g(125)) {
          if (!ps.field_v) {
            return;
          } else {
            var2 = new byte[2];
            var1 = var2;
            var2[param0] = (byte)(ek.field_d << 1423111778);
            var2[0] = (byte) 1;
            if (!uc.field_a) {
              if (cu.field_a) {
                var2[1] = (byte)oe.c((int) var2[1], 1);
                discarded$4 = nm.a(0, 6, var2);
                ps.field_v = false;
                return;
              } else {
                discarded$5 = nm.a(0, 6, var2);
                ps.field_v = false;
                return;
              }
            } else {
              var2[1] = (byte)oe.c((int) var2[1], 2);
              if (!cu.field_a) {
                discarded$6 = nm.a(0, 6, var2);
                ps.field_v = false;
                return;
              } else {
                var2[1] = (byte)oe.c((int) var2[1], 1);
                discarded$7 = nm.a(0, 6, var2);
                ps.field_v = false;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private final wk j(int param0) {
        int var2 = 0;
        wk var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_w >> -1242768831;
        var3 = new wk(var2, this.field_w);
        vn.a(var3, param0 + -747);
        if (param0 != 750) {
          return (wk) null;
        } else {
          var4 = 0;
          L0: while (true) {
            stackOut_2_0 = var4;
            stackIn_3_0 = stackOut_2_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_3_0 >= this.field_w) {
                    break L3;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_17_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_5_0;
                      L4: while (true) {
                        if (var2 <= var5) {
                          var4++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        } else {
                          var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_w) * var4);
                          var8 = 1;
                          stackOut_7_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                          stackIn_3_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var9 != 0) {
                            continue L1;
                          } else {
                            L5: {
                              if (stackIn_8_0 < 0) {
                                L6: {
                                  var6 = Math.sqrt(-var6 + 1.0);
                                  if (1.0 > var6) {
                                    stackOut_12_0 = (int)(var6 * 255.0);
                                    stackIn_13_0 = stackOut_12_0;
                                    break L6;
                                  } else {
                                    stackOut_11_0 = 255;
                                    stackIn_13_0 = stackOut_11_0;
                                    break L6;
                                  }
                                }
                                var8 = stackIn_13_0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            qn.a(var5, var4, var8 | var8 << 2099005512 | var8 << -106028656);
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = param0 + -19612;
                stackIn_17_0 = stackOut_16_0;
                break L2;
              }
              rf.b(stackIn_17_0);
              return var3;
            }
          }
        }
    }

    private final void i(int param0) {
        this.field_O = new wk[]{this.b(this.field_H, -61, this.field_L), this.b(this.field_E, -120, this.field_P)};
        this.field_J = this.j(750);
        this.field_S = this.field_J.e();
        if (param0 != 3) {
          field_Q = (int[]) null;
          this.field_K = new wk(this.field_w >> 50714209, this.field_w);
          return;
        } else {
          this.field_K = new wk(this.field_w >> 50714209, this.field_w);
          return;
        }
    }

    final static void d(byte param0) {
        c.field_e = null;
        qm.field_K = null;
        j.field_e = null;
        vj.field_j = (byte[][]) null;
        if (param0 < 96) {
            return;
        }
        qv.field_j = null;
        iq.field_g = null;
    }

    private rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param5;
        this.field_H = param6;
        this.field_P = param7;
        this.field_C = param4;
        this.field_E = param8;
        this.a(param0, param2, param1, 8192, param3);
    }

    static {
        int var0 = 0;
        field_M = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
            field_M[var0] = 65536 * (var0 / 2) + (1 * var0 + 256 * (var0 / 3));
        }
        field_G = "Quality: ";
        field_Q = new int[8192];
    }
}
