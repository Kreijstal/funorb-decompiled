/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private int field_h;
    static String field_j;
    static int field_f;
    private int field_a;
    private boolean field_c;
    static gk field_b;
    tg field_o;
    static String field_d;
    tg[] field_n;
    static boolean field_i;
    static rb field_k;
    static int[] field_g;
    private int field_l;
    private int field_m;
    private int field_e;

    final kg a(byte param0, int param1) {
        this.field_a = param1;
        if (param0 <= 6) {
            this.field_m = -22;
        }
        return (kg) (this);
    }

    final kg a(boolean param0, byte param1) {
        int var3 = -74 / ((param1 - 63) / 40);
        this.field_c = param0 ? true : false;
        return (kg) (this);
    }

    final kg a(int param0, byte param1) {
        if (param1 > -47) {
            return (kg) null;
        }
        this.field_h = param0;
        return (kg) (this);
    }

    final void a(kg param0, byte param1) {
        try {
            param0.field_o = this.field_o;
            param0.field_h = this.field_h;
            param0.field_l = this.field_l;
            if (param1 != 55) {
                field_k = (rb) null;
            }
            param0.field_n = this.field_n;
            param0.field_c = this.field_c;
            param0.field_a = this.field_a;
            param0.field_m = this.field_m;
            param0.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "kg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_e = 256;
        this.field_o = null;
        this.field_a = 0;
        if (param0 != -29776) {
            field_b = (gk) null;
        }
        this.field_n = null;
        this.field_h = -1;
        this.field_m = 0;
        this.field_l = 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        tg dupTemp$2 = null;
        tg dupTemp$3 = null;
        tg[] var5;
        tg[] var6;
        if (param3 != -2147483648) {
          return (tg[]) null;
        } else {
          L0: {
            var6 = new tg[9];
            var5 = var6;
            dupTemp$2 = hc.a(param1, param2, (byte) -126);
            var6[6] = dupTemp$2;
            var5[3] = dupTemp$2;
            var5[2] = dupTemp$2;
            var5[1] = dupTemp$2;
            var5[0] = dupTemp$2;
            dupTemp$3 = hc.a(param1, param0, (byte) -123);
            var6[8] = dupTemp$3;
            var5[7] = dupTemp$3;
            var5[5] = dupTemp$3;
            if (param4 == 0) {
              break L0;
            } else {
              var6[4] = hc.a(64, param4, (byte) -127);
              break L0;
            }
          }
          return var5;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        String var20 = null;
        var19 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) > -1) {
                break L1;
              } else {
                if (param2 >= qk.field_g) {
                  break L1;
                } else {
                  L2: {
                    if ((param8 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (0 <= param0) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param8 < qk.field_a) {
                      break L3;
                    } else {
                      if (param0 < qk.field_a) {
                        break L3;
                      } else {
                        if (param4 >= qk.field_a) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param3 + -param2;
                    if (param1 == param2) {
                      L5: {
                        if (param3 != param2) {
                          var15 = param3 - param1;
                          if (param8 >= param0) {
                            var10 = param8 << 152049232;
                            var9_int = param0 << 1574304240;
                            var11 = (-param0 + param4 << 952263824) / var15;
                            var12 = (-param8 + param4 << 134190288) / var14;
                            break L5;
                          } else {
                            var11 = (param4 + -param8 << -141159856) / var14;
                            var10 = param0 << 847962960;
                            var12 = (-param0 + param4 << -2020974096) / var15;
                            var9_int = param8 << 1194858096;
                            break L5;
                          }
                        } else {
                          var9_int = param8 << 501187152;
                          var10 = param0 << -274827088;
                          var11 = 0;
                          var12 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 > param2) {
                          param2 = Math.min(-param2, -param2 + param1);
                          var10 = var10 + param2 * var12;
                          var9_int = var9_int + var11 * param2;
                          param2 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param8 << -1644688816;
                        var9_int = param8 << -1644688816;
                        var15 = -param2 + param1;
                        var11 = (param0 + -param8 << 1388755248) / var15;
                        var12 = (param4 + -param8 << -752068848) / var14;
                        if (var12 <= var11) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (-1 < (param2 ^ -1)) {
                            if ((param1 ^ -1) <= -1) {
                              param2 = -param2;
                              var10 = var10 + var12 * param2;
                              var9_int = var9_int + param2 * var11;
                              param2 = 0;
                              break L9;
                            } else {
                              param2 = param1 - param2;
                              var9_int = var9_int + param2 * var11;
                              var10 = var10 + var12 * param2;
                              param2 = param1;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = qk.field_b[param2];
                        L10: while (true) {
                          if (param1 <= param2) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> -1467038960;
                              if (qk.field_a > var17) {
                                var18 = (var10 >> -1861191888) + -(var9_int >> 1677043632);
                                if (var18 != 0) {
                                  L12: {
                                    if (qk.field_a <= var17 - -var18) {
                                      var18 = -1 + (qk.field_a + -var17);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if ((var17 ^ -1) <= -1) {
                                    la.a(param6, 2, var18, var17 + var16, param5);
                                    break L11;
                                  } else {
                                    la.a(param6, 2, var17 + var18, var16, param5);
                                    break L11;
                                  }
                                } else {
                                  if (-1 < (var17 ^ -1)) {
                                    break L11;
                                  } else {
                                    if (qk.field_a <= var17) {
                                      break L11;
                                    } else {
                                      la.a(param6, 2, var18, var16 + var17, param5);
                                      break L11;
                                    }
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param2++;
                            if (param2 >= qk.field_g) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var16 = var16 + na.field_e;
                              var9_int = var9_int + var11;
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = param3 - param1;
                      if (0 != var16) {
                        L13: {
                          if (var13 != 0) {
                            var10 = param0 << -593187568;
                            break L13;
                          } else {
                            var9_int = param0 << -1166011856;
                            break L13;
                          }
                        }
                        var17 = param4 << -1821506832;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param7 >= 74) {
                      break L14;
                    } else {
                      var20 = (String) null;
                      kg.a(-100, (String) null);
                      break L14;
                    }
                  }
                  L15: {
                    if ((param2 ^ -1) > -1) {
                      param2 = -param2;
                      var10 = var10 + var12 * param2;
                      var9_int = var9_int + var11 * param2;
                      param2 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = qk.field_b[param2];
                  L16: while (true) {
                    if (param3 <= param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 861681904;
                        if (qk.field_a > var16) {
                          var17 = (var10 >> -1779752176) - (var9_int >> -960810224);
                          if (-1 == (var17 ^ -1)) {
                            if ((var16 ^ -1) > -1) {
                              break L17;
                            } else {
                              if (qk.field_a <= var16) {
                                break L17;
                              } else {
                                la.a(param6, 2, var17, var16 - -var15, param5);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (qk.field_a <= var17 + var16) {
                                var17 = -1 + qk.field_a + -var16;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if ((var16 ^ -1) > -1) {
                              la.a(param6, 2, var17 + var16, var15, param5);
                              break L17;
                            } else {
                              la.a(param6, 2, var17, var15 + var16, param5);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param2++;
                      if (param2 < qk.field_g) {
                        var9_int = var9_int + var11;
                        var15 = var15 + na.field_e;
                        var10 = var10 + var12;
                        continue L16;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var9);

            stackIn_82_1 = new StringBuilder().append("kg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L19;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L19;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static qh a(int param0, String param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                var3 = (int[]) null;
                kg.a(-22, -118, -32, 113, 57, (int[]) null, 57, 112, 26);
                break L1;
              }
            }
            stackIn_3_0 = new qh(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("kg.G(").append(param0).append(',');

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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, qi param1, lk param2, int param3, int param4) {
        tj stackIn_17_0 = null;
        String stackIn_17_1 = null;
        tj stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              ve.a(param2.field_m, param2.field_i + param0, this.field_n, (byte) -128, param2.field_k, param3 + param2.field_r);
              var6_int = -105 / ((74 - param4) / 44);
              if (this.field_o == null) {
                break L1;
              } else {
                L2: {
                  var7_int = this.field_a + param2.field_r + param3;
                  var8 = this.field_m + (param0 + param2.field_i);
                  if (param1.field_d != 1) {
                    break L2;
                  } else {
                    var7_int = var7_int + (param2.field_k - this.field_o.field_t) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (1 == param1.field_p) {
                    var8 = var8 + (param2.field_m - this.field_o.field_o) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-3 == (param1.field_d ^ -1)) {
                    var7_int = var7_int + (-this.field_o.field_t + param2.field_k);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 != param1.field_p) {
                    break L5;
                  } else {
                    var8 = var8 + (param2.field_m + -this.field_o.field_o);
                    break L5;
                  }
                }
                this.field_o.a(var7_int, var8);
                break L1;
              }
            }
            L6: {
              var7 = param1.a(true, param2);
              if (var7 == null) {
                break L6;
              } else {
                if (param1.field_b == null) {
                  break L6;
                } else {
                  if (-1 < (this.field_l ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_17_0 = param1.field_b;

                      stackIn_17_1 = (String) (var7);

                      if ((this.field_a ^ -1) != 2147483647) {
                        stackIn_18_0 = (tj) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = this.field_a;
                        break L7;
                      } else {
                        stackIn_18_0 = (tj) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = 0;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_20_2 = stackIn_18_2 + (param1.field_m + (param3 - -param2.field_r));

                      if (-2147483648 != this.field_m) {
                        stackIn_18_0 = (tj) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = this.field_m;
                        break L8;
                      } else {
                        stackIn_18_0 = (tj) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = 0;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_23_3 = stackIn_21_3 + (param0 - -param2.field_i - -param1.field_o);

                      stackIn_23_4 = -param1.field_k + -param1.field_m + param2.field_k;

                      stackIn_23_5 = -param1.field_n + -param1.field_o + param2.field_m;

                      stackIn_23_6 = this.field_l;

                      stackIn_23_7 = this.field_h;

                      if ((this.field_e ^ -1) != 2147483647) {
                        stackIn_18_0 = (tj) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = this.field_e;
                        break L9;
                      } else {
                        stackIn_18_0 = (tj) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = 256;
                        break L9;
                      }
                    }
                    ((tj) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param1.field_d, param1.field_p, param1.field_f);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("kg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final kg a(tg[] param0, int param1) {
        RuntimeException var3 = null;
        kg stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_n = param0;
            if (param1 == -1) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kg.K(");

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
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (kg) (this);
        }
    }

    final kg b(int param0, byte param1) {
        if (param1 >= -30) {
            return (kg) null;
        }
        this.field_m = param0;
        return (kg) (this);
    }

    final kg a(int param0, int param1) {
        if (param1 != -2) {
            this.a(true, (byte) -16);
        }
        this.field_l = param0;
        return (kg) (this);
    }

    public static void a(byte param0) {
        field_k = null;
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != -64) {
            field_d = (String) null;
        }
        field_b = null;
    }

    final void a(kg param0, int param1, int param2, qi param3, boolean param4, lk param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_c) {
                param0.a(param2, param3, param5, param1, -89);
                param0.a(-29776);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_a ^ -1) == 2147483647) {
                break L2;
              } else {
                param0.field_a = this.field_a;
                break L2;
              }
            }
            L3: {
              if (0 >= (this.field_l ^ -1)) {
                param0.field_l = this.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_o) {
                param0.field_o = this.field_o;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.field_m == -2147483648) {
                break L5;
              } else {
                param0.field_m = this.field_m;
                break L5;
              }
            }
            L6: {
              if (null == this.field_n) {
                break L6;
              } else {
                param0.field_n = this.field_n;
                break L6;
              }
            }
            L7: {
              if ((this.field_h ^ -1) <= 0) {
                param0.field_h = this.field_h;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_e ^ -1) == 2147483647) {
                break L8;
              } else {
                param0.field_e = this.field_e;
                break L8;
              }
            }
            L9: {
              if (!param4) {
                break L9;
              } else {
                this.a(-108, 126);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("kg.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L12;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L12;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    kg() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_o = null;
        this.field_c = false;
        this.field_m = -2147483648;
        this.field_n = null;
        this.field_e = -2147483648;
        this.field_l = -2;
    }

    static {
        field_j = null;
        field_f = 0;
        field_d = "Create a free account to start using this feature";
        field_i = true;
        field_g = new int[8192];
    }
}
