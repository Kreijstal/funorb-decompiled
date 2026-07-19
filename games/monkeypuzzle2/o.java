/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    private int field_g;
    private int[][] field_e;
    static te field_d;
    private int field_f;
    static int field_a;
    static int field_c;

    public static void a(byte param0) {
        int var1 = -60 % ((0 - param0) / 62);
        field_d = null;
    }

    final int a(int param0, int param1) {
        byte[] discarded$2 = null;
        byte[] var4 = null;
        L0: {
          if (this.field_e != null) {
            param0 = (int)((long)this.field_g * (long)param0 / (long)this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -70) {
          var4 = (byte[]) null;
          discarded$2 = this.a(true, (byte[]) null);
          return param0;
        } else {
          return param0;
        }
    }

    final static le[] a(boolean param0) {
        le[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_11_0 = false;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = new le[eg.field_c];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= eg.field_c) {
                break L2;
              } else {
                var3 = ra.field_ab[var2] * da.field_c[var2];
                var13 = cb.field_b[var2];
                var11 = new int[var3];
                var9 = var11;
                var5 = var9;
                stackOut_2_0 = 0;
                stackIn_12_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var3 <= var6) {
                        var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var11);
                        var2++;
                        break L4;
                      } else {
                        var5[var6] = fk.field_d[ch.a((int) var13[var6], 255)];
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            gb.a(-85);
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0 ? 1 : 0;
            break L1;
          }
          if (stackIn_12_0 != 1) {
            return (le[]) null;
          } else {
            return var1;
          }
        }
    }

    final int a(int param0, byte param1) {
        L0: {
          if (null != this.field_e) {
            param0 = 6 - -(int)((long)this.field_g * (long)param0 / (long)this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 20) {
          field_b = -31;
          return param0;
        } else {
          return param0;
        }
    }

    final byte[] a(boolean param0, byte[] param1) {
        byte[] discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        byte[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        byte[] stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var12 = (byte[]) null;
                discarded$1 = this.a(false, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (null == this.field_e) {
                break L2;
              } else {
                var3_int = 14 + (int)((long)this.field_g * (long)param1.length / (long)this.field_f);
                var16 = new int[var3_int];
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var7 >= param1.length) {
                        break L5;
                      } else {
                        var8 = param1[var7];
                        var18 = this.field_e[var6];
                        stackOut_6_0 = 0;
                        stackIn_15_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          var10 = stackIn_7_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (-15 >= (var10 ^ -1)) {
                                  break L8;
                                } else {
                                  var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
                                  var10++;
                                  if (var11 != 0) {
                                    break L7;
                                  } else {
                                    if (var11 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var6 = var6 + this.field_g;
                              var10 = var6 / this.field_f;
                              var6 = var6 - this.field_f * var10;
                              var5 = var5 + var10;
                              var7++;
                              break L7;
                            }
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    param1 = new byte[var3_int];
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  }
                  var7 = stackIn_15_0;
                  L9: while (true) {
                    if (var3_int <= var7) {
                      break L2;
                    } else {
                      L10: {
                        L11: {
                          var8 = 32768 + var16[var7] >> 1514084656;
                          if (127 < (var8 ^ -1)) {
                            break L11;
                          } else {
                            L12: {
                              if (127 < var8) {
                                break L12;
                              } else {
                                param1[var7] = (byte)var8;
                                if (var11 == 0) {
                                  break L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            param1[var7] = (byte)127;
                            if (var11 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        param1[var7] = (byte)-128;
                        break L10;
                      }
                      var7++;
                      if (var11 == 0) {
                        continue L9;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackOut_25_0 = (byte[]) (param1);
            stackIn_26_0 = stackOut_25_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("o.C(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            param0.addMouseListener(we.field_n);
            param0.addMouseMotionListener(we.field_n);
            param0.addFocusListener(we.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "o.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static de a(int param0, int param1, int param2, int param3, int param4) {
        de var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = (de) ((Object) qa.field_d.a((byte) -117));
        var6 = -26 / ((11 - param4) / 54);
        L0: while (true) {
          if (var5 != null) {
            stackOut_3_0 = param0 ^ -1;
            stackOut_3_1 = var5.field_k ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (var7 == 0) {
              if (stackIn_5_0 != stackIn_5_1) {
                var5 = (de) ((Object) qa.field_d.d((byte) 63));
                continue L0;
              } else {
                return var5;
              }
            } else {
              w.a(stackIn_4_0, stackIn_4_1, var5);
              return var5;
            }
          } else {
            var5 = new de();
            var5.field_e = param3;
            var5.field_h = param1;
            var5.field_k = param0;
            qa.field_d.a(-8212, var5);
            w.a(-95, param2, var5);
            return var5;
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
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
            if (param0 == 76) {
              stackOut_3_0 = gf.field_b.a(param1, "", 62);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("o.F(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    o(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != param0) {
          var3 = ed.a(param0, param1, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_g = param1;
          this.field_f = param0;
          this.field_e = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_4_0 >= param0) {
                return;
              } else {
                var5 = this.field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if (var16 == 0) {
                  L2: {
                    if ((var8 ^ -1) <= -1) {
                      break L2;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = (int)Math.ceil(var6 + 7.0);
                    if (-15 <= (var9 ^ -1)) {
                      break L3;
                    } else {
                      var9 = 14;
                      break L3;
                    }
                  }
                  var10 = (double)param1 / (double)param0;
                  L4: while (true) {
                    if (var9 <= var8) {
                      var4++;
                      continue L0;
                    } else {
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      stackOut_13_0 = (-0.0001 < var12 ? -1 : (-0.0001 == var12 ? 0 : 1));
                      stackIn_4_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_14_0 > 0) {
                              break L6;
                            } else {
                              if (var12 <= 0.0001) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var14 = var14 * (Math.sin(var12) / var12);
                          break L5;
                        }
                        var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)) + 0.54);
                        var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                        var8++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        field_b = 0;
        field_d = new te(10, 2, 2, 0);
    }
}
