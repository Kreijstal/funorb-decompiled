/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e implements ch, eg {
    private boolean field_l;
    static String field_g;
    int field_d;
    int field_i;
    fa field_j;
    int field_n;
    private int field_a;
    int field_h;
    int field_f;
    int field_k;
    int field_o;
    int field_c;
    int field_p;
    int field_m;
    static int field_b;
    static int field_e;

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3 = fi.a(param0, param1, (byte) 124);
            if (var3 == null) {
              var4 = param2;
              L1: while (true) {
                if (param0.length() > var4) {
                  if (!gi.a(45, param0.charAt(var4))) {
                    stackIn_10_0 = sd.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      stackIn_13_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("e.U(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return (String) ((Object) stackIn_13_0);
          }
        }
    }

    private final void a(int param0, int param1, int param2, qa param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var10 = -16 / ((54 - param2) / 63);
                mi.a((byte) -52, param3.field_u + (param3.field_y + param1), param1 + param3.field_y, param3.field_j + (param3.field_z + param5), param3.field_z + param5);
                var9_int = this.b(param3, (byte) -50);
                var11 = this.a(param3, 122);
                if (this.field_l) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            var13 = this.field_h;
                            if (var13 != 0) {
                              break L7;
                            } else {
                              if (var14 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if ((var13 ^ -1) == -3) {
                            break L5;
                          } else {
                            L8: {
                              if (3 != var13) {
                                break L8;
                              } else {
                                if (var14 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if ((var13 ^ -1) != -2) {
                              break L4;
                            } else {
                              if (var14 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var12 = this.field_j.field_H;
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      var12 = var11 + -this.field_j.field_K;
                      if (var14 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    var12 = (-this.field_j.field_H + var11 + -this.field_j.field_K >> 1041347137) + this.field_j.field_H;
                    break L3;
                  }
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          L13: {
                            var13 = this.field_i;
                            if (var13 != 0) {
                              break L13;
                            } else {
                              if (var14 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((var13 ^ -1) == -4) {
                            break L12;
                          } else {
                            if (-2 == (var13 ^ -1)) {
                              break L11;
                            } else {
                              if (-3 == (var13 ^ -1)) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        this.field_j.c(this.c(31, param3), this.a(param3, param4, true, param1), var12 + this.a(param3, param5, param0, -3), param7, param6);
                        if (var14 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                      this.field_j.a(this.c(45, param3), (var9_int >> -970278207) + this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3) + var12, param7, param6);
                      if (var14 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                    this.field_j.b(this.c(90, param3), this.a(param3, param4, true, param1) + var9_int, var12 + this.a(param3, param5, param0, -3), param7, param6);
                    break L9;
                  }
                  if (var14 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_j.a(this.c(66, param3), this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3), var9_int, var11, param7, param6, this.field_i, this.field_h, this.field_d);
              break L1;
            }
            ia.a(-99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var9);

            stackIn_32_1 = new StringBuilder().append("e.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L14;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L14;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final int b(qa param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -37) {
              stackIn_4_0 = -this.field_o + (-this.field_n + param0.field_u);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 126;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("e.E(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(qa param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -3) {
              stackIn_4_0 = param0.field_z + (param1 + (this.field_m + (param0.field_n + param2)));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 119;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("e.S(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(qa param0, int param1, int param2, byte param3) {
        try {
            if (param3 > -26) {
                qa var6 = (qa) null;
                this.a(-19, (qa) null);
            }
            this.a(0, param1, 120, param0, 0, param2, this.field_a, this.field_f);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, e param1) {
        try {
            param1.field_m = this.field_m;
            param1.field_k = this.field_k;
            if (param0 != 2) {
                qa var4 = (qa) null;
                this.c((qa) null, (byte) 95);
            }
            param1.field_a = this.field_a;
            param1.field_o = this.field_o;
            param1.field_l = this.field_l;
            param1.field_c = this.field_c;
            param1.field_n = this.field_n;
            param1.field_f = this.field_f;
            param1.field_p = this.field_p;
            param1.field_j = this.field_j;
            param1.field_i = this.field_i;
            param1.field_h = this.field_h;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, qa param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        pi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qa var13 = null;
        ne var14 = null;
        ne var15 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var13 = (qa) null;
                this.a(67, (qa) null);
                break L1;
              }
            }
            L2: {
              if (!param2.e(1)) {
                break L2;
              } else {
                L3: {
                  var14 = this.a(param2, (byte) -35);
                  var15 = var14;
                  var7 = var15.b(param3, -1);
                  var8 = var14.field_c[var7];
                  var9 = var15.c(-1, param3);
                  var10 = this.a(param2, var9, true, param4);
                  var11 = this.a(param0, param2, (byte) 60) - -Math.max(0, var8.field_a);
                  stackIn_5_0 = this.a(param0, param2, (byte) -82);

                  stackIn_5_1 = this.a(param2, -21);

                  stackIn_5_2 = var8.field_c;

                  if (1 + var7 < var15.field_c.length) {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = var14.field_c[1 + var7].field_a;
                    break L3;
                  } else {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = var8.field_c;
                    break L3;
                  }
                }
                var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                mi.a((byte) -52, param2.field_u + (param4 + param2.field_y), param4 - -param2.field_y, param0 - (-param2.field_z - param2.field_j), param0 - -param2.field_z);
                nf.field_M.a(param1 ^ 4, var10, var11, var12, this.field_c, var10);
                ia.a(-69);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("e.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(byte param0) {
        int discarded$1 = 0;
        qa var3;
        if (param0 != 127) {
          var3 = (qa) null;
          discarded$1 = this.a((qa) null, -117);
          return this.field_j.field_H - -this.field_j.field_K;
        } else {
          return this.field_j.field_H - -this.field_j.field_K;
        }
    }

    public final void a(qa param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ne var17 = null;
        ne var18 = null;
        var16 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param4 == -30298) {
              if (param1 != param3) {
                if (param0.e(1)) {
                  L1: {
                    L2: {
                      var17 = this.a(param0, (byte) -35);
                      var18 = var17;
                      if (param1 > param3) {
                        break L2;
                      } else {
                        var9 = param3;
                        var8 = param1;
                        if (var16 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var8 = param3;
                    var9 = param1;
                    break L1;
                  }
                  var10 = var18.b(var8, -1);
                  var11 = var18.b(var9, -1);
                  mi.a((byte) -52, param0.field_u + param5 + param0.field_y, param5 - -param0.field_y, param0.field_z + param2 - -param0.field_j, param2 - -param0.field_z);
                  var12 = var10;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var11 < var12) {
                          break L5;
                        } else {
                          var13 = var17.field_c[var12];
                          stackIn_23_0 = var12;

                          if (var16 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (stackIn_23_0 == var10) {
                                stackIn_16_0 = var18.c(-1, var8);
                                break L6;
                              } else {
                                stackIn_16_0 = var13.field_d[0];
                                break L6;
                              }
                            }
                            L7: {
                              var14 = stackIn_16_0;
                              if (var11 == var12) {
                                stackIn_21_0 = var18.c(-1, var9);
                                break L7;
                              } else {
                                if (var13 != null) {
                                  stackIn_21_0 = var13.field_d[-1 + var13.field_d.length];
                                  break L7;
                                } else {
                                  stackIn_21_0 = 0;
                                  break L7;
                                }
                              }
                            }
                            var15 = stackIn_21_0;
                            nf.field_M.a(this.field_p >>> -259099560, var15 + -var14, false, this.field_p, var13.field_c, this.field_m + param2 - -param0.field_z + (param0.field_n - -var13.field_a), this.a(param0, var14, true, param5));
                            var12++;
                            if (var16 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackIn_23_0 = -69;
                      break L4;
                    }
                    ia.a(stackIn_23_0);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("e.J(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final int a(boolean param0, int param1, qa param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_d = 20;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, 0, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("e.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final ne a(qa param0, byte param1) {
        RuntimeException var3 = null;
        ne stackIn_9_0 = null;
        ne stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_w) {
                param0.field_w = (ne) ((Object) new j());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_l) {
                  break L3;
                } else {
                  this.c(param0, (byte) 64);
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((j) ((Object) param0.field_w)).a(true, this.field_d, this.field_i, this.field_j, this.c(param1 ^ -93, param0), this.b(param0, (byte) -98), this.field_h, this.a(param0, 122));
              break L2;
            }
            if (param1 == -35) {
              stackIn_11_0 = param0.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (ne) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    public final int a(int param0, qa param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -84) {
              this.a(param1, (byte) -35);
              stackIn_4_0 = param1.field_w.b((byte) 97) - (-this.field_n - this.field_o);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("e.I(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(qa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -90 / ((57 - param1) / 61);
            stackIn_1_0 = -this.field_m + param0.field_j - this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("e.AA(");

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
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(int param0, qa param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param1, (byte) -35);
            if (param2 > 18) {
              stackIn_4_0 = param1.field_w.a(-this.a(false, param3, param1) + param5, param0 + -this.a(param4, param1, (byte) 125), (byte) -116);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -15;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("e.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public void a(int param0, int param1, boolean param2, qa param3, int param4) {
        if (param0 > -36) {
            this.field_c = 31;
        }
        if (!(null != this.field_j)) {
            return;
        }
        try {
            this.a(param3, param1, param4, (byte) -34);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(int param0, qa param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 124 % ((param2 - -3) / 53);
            stackIn_1_0 = this.a(param1, param0, 0, -3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("e.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void c(qa param0, byte param1) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_w == null) {
                param0.field_w = (ne) ((Object) new j());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var3_int = this.b(param0, (byte) -117);
                  var4 = this.a(param0, -13);
                  var6 = this.field_h;
                  if (0 == var6) {
                    var5 = this.field_j.field_H;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  } else {
                    L5: {
                      if (var6 != 2) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (3 == var6) {
                      break L3;
                    } else {
                      if ((var6 ^ -1) == -2) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5 = var4 + -this.field_j.field_K;
                if (var7 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var5 = (-this.field_j.field_K + var4 - this.field_j.field_H >> -2130555647) + this.field_j.field_H;
              break L2;
            }
            L6: {
              if (param1 == 64) {
                break L6;
              } else {
                field_b = 28;
                break L6;
              }
            }
            L7: {
              L8: {
                L9: {
                  L10: {
                    L11: {
                      var6 = this.field_i;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        if (var7 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((var6 ^ -1) == -4) {
                      break L10;
                    } else {
                      L12: {
                        if (var6 != 1) {
                          break L12;
                        } else {
                          if (var7 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if ((var6 ^ -1) == -3) {
                        break L8;
                      } else {
                        return;
                      }
                    }
                  }
                  if (!(param0.field_w instanceof j)) {
                    break L7;
                  } else {
                    ((j) ((Object) param0.field_w)).a(this.c(93, param0), 0, this.field_j, true, var5);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L9;
                    }
                  }
                }
                if (!(param0.field_w instanceof j)) {
                  break L7;
                } else {
                  ((j) ((Object) param0.field_w)).a(this.field_j, param1 ^ 4, this.c(param1 + 46, param0), var3_int >> 1194439969, var5);
                  if (var7 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (!(param0.field_w instanceof j)) {
                break L7;
              } else {
                ((j) ((Object) param0.field_w)).a(var3_int, var5, param1 + -64, this.c(58, param0), this.field_j);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("e.CA(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L13;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L13;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
    }

    public final int b(int param0, qa param1) {
        RuntimeException var3 = null;
        qa var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, (byte) -35);
              if (param0 <= -25) {
                break L1;
              } else {
                var4 = (qa) null;
                this.a((qa) null, -4, 97, -107, -121, 31);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_w.a(true) - (-this.field_m + -this.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("e.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    protected e() {
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_d = param9;
            this.field_n = param1;
            this.field_p = param11;
            this.field_m = param3;
            this.field_l = param12 ? true : false;
            this.field_k = param4;
            this.field_a = param6;
            this.field_j = param0;
            this.field_o = param2;
            this.field_f = param5;
            this.field_i = param7;
            this.field_h = param8;
            this.field_c = param10;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    private final int a(qa param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              stackIn_4_0 = param0.field_y + (param3 + (this.field_n - -param0.field_r) - -param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 64;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("e.BA(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 != -92) {
            field_g = (String) null;
        }
    }

    String c(int param0, qa param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 21) {
                break L1;
              } else {
                this.field_n = 77;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("e.DA(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_g = "OK";
        field_b = 0;
    }
}
