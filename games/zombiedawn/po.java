/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ah {
    static int[] field_wb;
    static String field_Ab;
    private kd field_yb;
    static int[] field_zb;
    static int field_xb;

    final void a(wk param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            bi.d(param0.a(this.a(true), (byte) -124), param0.a(this.f(237239984), 0), 250, 16711680);
            bi.d(param0.a(this.a(true), (byte) -79), param0.a(this.f(237239984), param1 + -5060), 55, 16711935);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_ub <= var3_int) {
                    break L3;
                  } else {
                    var4 = param0.a(this.field_jb[var3_int], (byte) -78);
                    var5 = param0.a(this.field_gb[var3_int], param1 ^ 5060);
                    bi.b(-1 + var4, var5 + -1, 3, 3, 0);
                    bi.a(var4, var5, 65280);
                    var3_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 5060) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                if (null != this.field_yb) {
                  bi.e(param0.a(this.a(true), (byte) -122), param0.a(this.f(237239984), 0), param0.a(this.field_yb.a(true), (byte) -60), param0.a(this.field_yb.f(param1 + 237234924), 0), 65280);
                  break L4;
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("po.L(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void l(byte param0) {
        kd discarded$5 = null;
        boolean discarded$6 = false;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 52) {
                break L1;
              } else {
                discarded$5 = this.m((byte) 55);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.a(false, false, -85, 55)) {
                  break L3;
                } else {
                  if (!this.a(true, false, -102, 250)) {
                    break L2;
                  } else {
                    if (1 == this.field_F) {
                      break L2;
                    } else {
                      discarded$6 = this.p(-123);
                      if (ZombieDawn.field_J == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.b(true);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.I(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.g(120);
              if (this.field_F == 10) {
                L2: {
                  if ((this.field_G ^ -1) != -1) {
                    break L2;
                  } else {
                    if (this.field_N != 5) {
                      break L2;
                    } else {
                      this.field_U = dc.a((byte) 18, 12);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-2 != (this.field_G ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_yb != null) {
                      this.field_yb.c(401408, this.f(237239984), this.a(true));
                      this.field_yb = null;
                      if (ZombieDawn.field_J == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_G != 2) {
                  break L1;
                } else {
                  this.e(0, -6904);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 > 95) {
                break L4;
              } else {
                field_wb = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.A(" + param0 + ')');
        }
    }

    public static void v(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_zb = null;
              field_Ab = null;
              if (param0 == -31113) {
                break L1;
              } else {
                po.a(69, -111, false, 104, (gd) null);
                break L1;
              }
            }
            field_wb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.D(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        try {
          L0: {
            this.field_yb = this.m((byte) -95);
            if (this.field_yb == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var2_int = this.field_yb.a(param0) + -this.a(true);
                  var3 = this.field_yb.f(237239984) + -this.f(237239984);
                  if (Math.abs(var3) <= Math.abs(var2_int)) {
                    break L2;
                  } else {
                    L3: {
                      stackOut_4_0 = this;
                      stackIn_9_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (0 < var3) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 2;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L3;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_7_0 = stackOut_5_0;
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        break L3;
                      }
                    }
                    ((po) (this)).field_S = stackIn_10_1;
                    if (ZombieDawn.field_J == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  stackOut_11_0 = this;
                  stackIn_16_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var2_int <= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 3;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_12_0 = this;
                    stackIn_14_0 = stackOut_12_0;
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    break L4;
                  }
                }
                ((po) (this)).field_S = stackIn_17_1;
                break L1;
              }
              this.e(10, -6904);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "po.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    po(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        this.field_yb = null;
        try {
            this.field_ub = 21;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "po.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, gd param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var19 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = wm.a((param3 - param1) * 3, (byte) -95);
              var6 = 3 * param1;
              nl.c(param0 ^ -30006);
              var7 = var5_int - 10;
              if (param4.field_p <= 0) {
                break L1;
              } else {
                if (null != param4.field_F) {
                  jd.a(91);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            eh.field_A = 0;
            var8 = param0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param4.field_c <= var8) {
                    break L4;
                  } else {
                    var9 = param4.field_g[var8];
                    var10 = param4.field_H[var8];
                    var11 = param4.field_r[var8];
                    stackOut_10_0 = param2;
                    stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_11_0) {
                            var12 = to.field_a[var9];
                            var13 = wc.field_Nb[var9];
                            var14 = -var12 + to.field_a[var10];
                            var15 = -var12 + to.field_a[var11];
                            var16 = -var13 + wc.field_Nb[var10];
                            var17 = wc.field_Nb[var11] + -var13;
                            if (0 > var14 * var17 + -(var15 * var16)) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var12 = pj.field_s[var9];
                          if (2147483647 != (var12 ^ -1)) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var13 = pj.field_s[var10];
                        if (2147483647 == (var13 ^ -1)) {
                          break L5;
                        } else {
                          var14 = pj.field_s[var11];
                          if (-2147483648 == var14) {
                            break L5;
                          } else {
                            L8: {
                              var15 = var14 + var12 - -var13 + -var6;
                              if (var7 < 0) {
                                stackOut_28_0 = var15 << -var7;
                                stackIn_29_0 = stackOut_28_0;
                                break L8;
                              } else {
                                stackOut_26_0 = var15 >> var7;
                                stackIn_29_0 = stackOut_26_0;
                                break L8;
                              }
                            }
                            var16 = -stackIn_29_0 + je.field_b.length - 1;
                            var17 = je.field_b[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (0 == var17 >> -916753404) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_31_0 = var16;
                                    stackIn_39_0 = stackOut_31_0;
                                    stackIn_32_0 = stackOut_31_0;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_32_0 < 0) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var17 = je.field_b[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_38_0 = var17 + (var16 << -769810076);
                                stackIn_39_0 = stackOut_38_0;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_39_0;
                                uf.field_o[var18] = var8;
                                je.field_b[var16] = 1 + var17;
                                if (-1 <= (param4.field_p ^ -1)) {
                                  break L13;
                                } else {
                                  if (null != param4.field_F) {
                                    jp.field_f[param4.field_F[var8]] = jp.field_f[param4.field_F[var8]] + 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              eh.field_A = eh.field_A + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = param4.field_p ^ -1;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L14: {
                L15: {
                  if (stackIn_49_0 >= -1) {
                    break L15;
                  } else {
                    if (null != param4.field_F) {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (jp.field_f.length <= var9) {
                          break L15;
                        } else {
                          var10 = jp.field_f[var9];
                          jp.field_f[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) (var5);
            stackOut_62_1 = new StringBuilder().append("po.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param4 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L17;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
    }

    final static void f(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ej.field_o = ob.field_b[param1];
              if (param0 == -1) {
                break L1;
              } else {
                field_Ab = (String) null;
                break L1;
              }
            }
            L2: {
              tm.field_h = kd.field_Fb[param1];
              if (null == qj.field_j[param1]) {
                break L2;
              } else {
                la.field_c = qj.field_j[param1];
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean w(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 13296) {
                break L1;
              } else {
                po.f(-73, 6);
                break L1;
              }
            }
            stackOut_3_0 = i.field_Y;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final kd m(byte param0) {
        Object var2 = null;
        int var3 = 0;
        le var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2 = null;
              var3 = -1;
              if (param0 <= -60) {
                break L1;
              } else {
                field_wb = (int[]) null;
                break L1;
              }
            }
            var4 = dj.field_e.field_R.b((byte) 26);
            L2: while (true) {
              L3: {
                if (!(var4 instanceof fb)) {
                  break L3;
                } else {
                  L4: {
                    if (!(var4 instanceof kd)) {
                      break L4;
                    } else {
                      if ((((kd) ((Object) var4)).field_F ^ -1) == -9) {
                        break L4;
                      } else {
                        if (((kd) ((Object) var4)).x(37)) {
                          L5: {
                            var5 = ((kd) ((Object) var4)).a(true);
                            var6 = ((kd) ((Object) var4)).f(237239984);
                            var7 = -var5 + this.a(true);
                            var8 = -var6 + this.f(237239984);
                            var9 = var8 * var8 + var7 * var7;
                            if ((var9 ^ -1) > (var3 ^ -1)) {
                              break L5;
                            } else {
                              if (-1 != var3) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3 = var9;
                          var2 = (kd) ((Object) var4);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4 = var4.field_b;
                  if (var10 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_21_0 = var2;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (var2), "po.G(" + param0 + ')');
        }
        return (kd) ((Object) stackIn_22_0);
    }

    static {
        field_Ab = "Start Game";
        field_wb = new int[]{39, 38};
        field_zb = new int[8192];
    }
}
