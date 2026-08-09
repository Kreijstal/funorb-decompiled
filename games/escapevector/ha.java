/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha implements db {
    private wl field_f;
    static hf field_c;
    private int field_b;
    private int field_d;
    static int[] field_e;
    static boolean field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 94) {
            return;
        }
        field_e = null;
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_u) {
                  break L2;
                } else {
                  if (param3.h(0)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 2188450;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_5_0;
            if (param2 <= -14) {
              L3: {
                this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_l + "</u>", param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, var6_int, -1, this.field_b, this.field_d, this.field_f.field_r + this.field_f.field_x);
                if (!param3.h(0)) {
                  break L3;
                } else {
                  L4: {
                    var7 = this.field_f.b(param3.field_l);
                    var8 = this.field_f.field_x + this.field_f.field_r;
                    var9 = param0 - -param3.field_k;
                    var10 = param3.field_j + param1;
                    if (-3 == (this.field_b ^ -1)) {
                      var9 = var9 + (-var7 + param3.field_g);
                      break L4;
                    } else {
                      if (1 != this.field_b) {
                        break L4;
                      } else {
                        var9 = var9 + (param3.field_g + -var7 >> 885728961);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (this.field_d != 2) {
                      if (-2 != (this.field_d ^ -1)) {
                        break L5;
                      } else {
                        var10 = var10 + (-var8 + param3.field_x >> 1458485857);
                        break L5;
                      }
                    } else {
                      var10 = var10 + (param3.field_x + -var8);
                      break L5;
                    }
                  }
                  ic.a(false, 4 + var7, var9 + -2, var8, var10 + 2);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("ha.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
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
        int[] var20 = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (0 > param7) {
                break L1;
              } else {
                if (bi.field_f <= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param3 >= 0) {
                      break L2;
                    } else {
                      if (-1 >= (param0 ^ -1)) {
                        break L2;
                      } else {
                        if (param4 >= 0) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < bi.field_c) {
                      break L3;
                    } else {
                      if (bi.field_c > param0) {
                        break L3;
                      } else {
                        if (bi.field_c <= param4) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param2 + param7;
                    if (param2 == param1) {
                      L5: {
                        if (param7 != param2) {
                          var15 = -param1 + param7;
                          if (param3 >= param0) {
                            var11 = (param4 + -param0 << -1095185296) / var15;
                            var10 = param3 << -271754448;
                            var12 = (-param3 + param4 << -1923873168) / var14;
                            var9_int = param0 << 208893360;
                            break L5;
                          } else {
                            var12 = (param4 - param0 << 1218183120) / var15;
                            var11 = (-param3 + param4 << -330442096) / var14;
                            var10 = param0 << -1456663408;
                            var9_int = param3 << 38715216;
                            break L5;
                          }
                        } else {
                          var12 = 0;
                          var10 = param0 << 1875203280;
                          var11 = 0;
                          var9_int = param3 << -198630768;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if ((param2 ^ -1) > -1) {
                        param2 = Math.min(-param2, -param2 + param1);
                        var9_int = var9_int + param2 * var11;
                        var10 = var10 + var12 * param2;
                        param2 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param3 << -1337291696;
                        var9_int = param3 << -1337291696;
                        var15 = param1 - param2;
                        var12 = (param4 + -param3 << 1843538800) / var14;
                        var11 = (param0 + -param3 << 465729232) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 < 0) {
                          if (param1 < 0) {
                            param2 = -param2 + param1;
                            var9_int = var9_int + param2 * var11;
                            var10 = var10 + param2 * var12;
                            param2 = param1;
                            break L7;
                          } else {
                            param2 = -param2;
                            var10 = var10 + param2 * var12;
                            var9_int = var9_int + param2 * var11;
                            param2 = 0;
                            var16 = bi.field_a[param2];
                            L8: while (true) {
                              if (param2 >= param1) {
                                break L7;
                              } else {
                                L9: {
                                  var17 = var9_int >> 820108304;
                                  if (bi.field_c > var17) {
                                    var18 = (var10 >> -980615600) - (var9_int >> 1902431312);
                                    if (var18 == 0) {
                                      if (0 > var17) {
                                        break L9;
                                      } else {
                                        if (bi.field_c <= var17) {
                                          break L9;
                                        } else {
                                          bb.a(-23466, var17 - -var16, param6, var18, param8);
                                          break L9;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        if (bi.field_c > var17 - -var18) {
                                          break L10;
                                        } else {
                                          var18 = -1 + -var17 + bi.field_c;
                                          break L10;
                                        }
                                      }
                                      if (var17 < 0) {
                                        bb.a(-23466, var16, param6, var17 + var18, param8);
                                        break L9;
                                      } else {
                                        bb.a(-23466, var17 + var16, param6, var18, param8);
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                param2++;
                                if (param2 >= bi.field_f) {
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  var16 = var16 + em.field_l;
                                  var9_int = var9_int + var11;
                                  var10 = var10 + var12;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = bi.field_a[param2];
                          L11: while (true) {
                            if (param2 >= param1) {
                              break L7;
                            } else {
                              L12: {
                                var17 = var9_int >> 820108304;
                                if (bi.field_c > var17) {
                                  var18 = (var10 >> -980615600) - (var9_int >> 1902431312);
                                  if (var18 == 0) {
                                    if (0 > var17) {
                                      break L12;
                                    } else {
                                      if (bi.field_c <= var17) {
                                        break L12;
                                      } else {
                                        bb.a(-23466, var17 - -var16, param6, var18, param8);
                                        break L12;
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (bi.field_c > var17 - -var18) {
                                        break L13;
                                      } else {
                                        var18 = -1 + -var17 + bi.field_c;
                                        break L13;
                                      }
                                    }
                                    if (var17 < 0) {
                                      bb.a(-23466, var16, param6, var17 + var18, param8);
                                      break L12;
                                    } else {
                                      bb.a(-23466, var17 + var16, param6, var18, param8);
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              param2++;
                              if (param2 >= bi.field_f) {
                                return;
                              } else {
                                var16 = var16 + em.field_l;
                                var9_int = var9_int + var11;
                                var10 = var10 + var12;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      var16 = -param1 + param7;
                      if (-1 == (var16 ^ -1)) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L14: {
                          if (var13 != 0) {
                            var10 = param0 << -2019933936;
                            break L14;
                          } else {
                            var9_int = param0 << -286447440;
                            break L14;
                          }
                        }
                        var17 = param4 << -1250300816;
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L15: {
                    if (-1 < (param2 ^ -1)) {
                      param2 = -param2;
                      var10 = var10 + var12 * param2;
                      var9_int = var9_int + param2 * var11;
                      param2 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = bi.field_a[param2];
                  L16: while (true) {
                    if (param7 <= param2) {
                      L17: {
                        if (param5 > 33) {
                          break L17;
                        } else {
                          var20 = (int[]) null;
                          ha.a(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
                          break L17;
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L18: {
                        var16 = var9_int >> -107980944;
                        if (bi.field_c > var16) {
                          var17 = -(var9_int >> -513591056) + (var10 >> 1253497232);
                          if (var17 != 0) {
                            L19: {
                              if (bi.field_c > var17 + var16) {
                                break L19;
                              } else {
                                var17 = -1 + (-var16 + bi.field_c);
                                break L19;
                              }
                            }
                            if (var16 < 0) {
                              bb.a(-23466, var15, param6, var16 + var17, param8);
                              break L18;
                            } else {
                              bb.a(-23466, var15 + var16, param6, var17, param8);
                              break L18;
                            }
                          } else {
                            if (0 > var16) {
                              break L18;
                            } else {
                              if (bi.field_c <= var16) {
                                break L18;
                              } else {
                                bb.a(-23466, var16 + var15, param6, var17, param8);
                                break L18;
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      param2++;
                      if (param2 >= bi.field_f) {
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + em.field_l;
                        continue L16;
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
          L20: {
            var9 = decompiledCaughtException;
            stackIn_96_0 = (RuntimeException) (var9);

            stackIn_96_1 = new StringBuilder().append("ha.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "null";
              break L20;
            } else {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "{...}";
              break L20;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
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

    final static ab a(int param0, int param1, mf param2, int param3, mf param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ab stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uc.a(param4, param1 ^ 198630719, param0, param3)) {
              L1: {
                if (param1 == -198630768) {
                  break L1;
                } else {
                  field_c = (hf) null;
                  break L1;
                }
              }
              stackIn_6_0 = ea.a(param2.a(param0, (byte) -97, param3), -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ha.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ab) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public ha() {
        this.field_b = 1;
        this.field_d = 1;
        this.field_f = sb.field_a;
    }

    ha(wl param0, int param1, int param2) {
        try {
            this.field_b = param1;
            this.field_d = param2;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mf var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 <= -75) {
                break L1;
              } else {
                var17 = (mf) null;
                ha.a(-4, -41, (mf) null, 73, (mf) null);
                break L1;
              }
            }
            L2: while (true) {
              param7--;
              if (-1 < (param7 ^ -1)) {
                break L0;
              } else {
                var18 = param8;
                var10 = var18;
                var11 = param1;
                var12 = param9;
                var13 = param0;
                var14 = param4;
                var15 = 8355711 & var18[var11] >> 372541249;
                var10[var11] = ae.a(var13 >> -1856944375, 65280) + (ae.a(33423360, var12) >> 90304577) - (-(ae.a(var14, 33532346) >> 332702705) - var15);
                param4 = param4 + param2;
                param9 = param9 + param5;
                param0 = param0 + param6;
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("ha.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param9 + ')');
        }
    }

    static {
        field_c = new hf();
        field_e = new int[]{19, 27};
        field_a = false;
    }
}
