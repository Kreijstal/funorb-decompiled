/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wja extends ci {
    private int field_m;
    private int field_n;
    static String field_o;

    final static void a(String param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        rv.field_c.field_r = param0;
        uv.field_o = true;
        int var2_int = gn.field_C.field_f;
        int var3 = gn.field_C.field_e;
        if (param1 != 15165) {
            return;
        }
        try {
            var4 = rv.field_c.field_H.a(param0, 272, rv.field_c.field_P);
            var5 = -(var4 / 2) + (-103 + var3 / 2);
            wo.field_k.a(320, -(2 * var5) + (var3 - 120), -23776, var5, (-320 + var2_int) / 2);
            wo.field_k.field_w = hca.c(wo.field_k.field_t, 2105376, 3, 11579568, -118, 8421504);
            rv.field_c.a(-24 + (wo.field_k.field_G + -24), -20 + wo.field_k.field_t + -24, -23776, 16, 24);
            bma.field_v.a(80, 24, param1 ^ -26595, -24 + wo.field_k.field_t - 20, 120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wja.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var4_int = param2;
                      if (-1 != (var4_int ^ -1)) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (1 == var4_int) {
                      break L3;
                    } else {
                      if (2 != var4_int) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.field_n = param1.d(127);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_m = param1.d(param0 + 16);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L6: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (-2 != (param1.h(255) ^ -1)) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L6;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L6;
                }
              }
              ((wja) (this)).field_g = stackIn_15_1 != 0;
              break L1;
            }
            if (param0 == 107) {
              break L0;
            } else {
              this.field_n = 41;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("wja.A(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    public wja() {
        super(1, false);
        this.field_n = 0;
        this.field_m = 4096;
    }

    final static void d(byte param0) {
        if (param0 != 96) {
            field_o = (String) null;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var26 = this.field_h.a(param0, (byte) 18);
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (this.field_h.field_f) {
            var37 = this.a(param0, 0, param1 ^ 0);
            var38 = var37[0];
            var39 = var37[1];
            var40 = var37[2];
            var30 = var26[0];
            var22 = var30;
            var8 = var22;
            var31 = var26[1];
            var23 = var31;
            var9 = var23;
            var32 = var26[2];
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L0: while (true) {
              if (var11 < ns.field_g) {
                L1: {
                  L2: {
                    var12 = var38[var11];
                    var13 = var39[var11];
                    var14 = var40[var11];
                    if (this.field_n <= var12) {
                      break L2;
                    } else {
                      var8[var11] = this.field_n;
                      if (var15 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var12 > this.field_m) {
                      break L3;
                    } else {
                      var30[var11] = var12;
                      if (var15 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8[var11] = this.field_m;
                  break L1;
                }
                L4: {
                  L5: {
                    if (var13 < this.field_n) {
                      break L5;
                    } else {
                      L6: {
                        if (this.field_m >= var13) {
                          break L6;
                        } else {
                          var9[var11] = this.field_m;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var31[var11] = var13;
                      if (var15 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9[var11] = this.field_n;
                  break L4;
                }
                L7: {
                  L8: {
                    if (var14 >= this.field_n) {
                      break L8;
                    } else {
                      var10[var11] = this.field_n;
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (this.field_m < var14) {
                      break L9;
                    } else {
                      var32[var11] = var14;
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var10[var11] = this.field_m;
                  break L7;
                }
                var11++;
                if (var15 == 0) {
                  continue L0;
                } else {
                  return var16;
                }
              } else {
                return var16;
              }
            }
          } else {
            return var16;
          }
        } else {
          return (int[][]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_34_0 = null;
        int[] stackOut_24_0 = null;
        int[] stackOut_33_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_17_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.field_i.a((byte) 84, param1);
        var3 = var8;
        if (param0 == 1) {
          var8 = var3;
          if (this.field_i.field_d) {
            var4 = this.c(0, -101, param1);
            var5 = 0;
            L0: while (true) {
              if (var5 < ns.field_g) {
                L1: {
                  stackOut_24_0 = (int[]) (var4);
                  stackIn_34_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var6 = stackIn_25_0[var5];
                        if (this.field_n <= var6) {
                          break L3;
                        } else {
                          var8[var5] = this.field_n;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (var6 <= this.field_m) {
                          break L4;
                        } else {
                          var8[var5] = this.field_m;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8[var5] = var6;
                      break L2;
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      stackOut_33_0 = (int[]) (var8);
                      stackIn_34_0 = stackOut_33_0;
                      break L1;
                    }
                  }
                }
                return stackIn_34_0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          wja.c(18);
          if (this.field_i.field_d) {
            var8 = var3;
            var4 = this.c(0, -101, param1);
            var5 = 0;
            L5: while (true) {
              if (var5 < ns.field_g) {
                L6: {
                  stackOut_8_0 = (int[]) (var4);
                  stackIn_18_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var7 != 0) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        var6 = stackIn_9_0[var5];
                        if (this.field_n <= var6) {
                          break L8;
                        } else {
                          var8[var5] = this.field_n;
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var6 <= this.field_m) {
                          break L9;
                        } else {
                          var8[var5] = this.field_m;
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var8[var5] = var6;
                      break L7;
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L5;
                    } else {
                      stackOut_17_0 = (int[]) (var8);
                      stackIn_18_0 = stackOut_17_0;
                      break L6;
                    }
                  }
                }
                return stackIn_18_0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        }
    }

    static {
        field_o = "Please Log In";
    }
}
