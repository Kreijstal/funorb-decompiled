/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements iq {
    static int[] field_c;
    static bg field_b;
    static String field_a;

    final static uj a(int param0, mn param1, fs param2, dc param3, int param4) {
        RuntimeException var5 = null;
        cj stackIn_5_0 = null;
        sc stackIn_8_0 = null;
        rj stackIn_11_0 = null;
        hg stackIn_14_0 = null;
        ma stackIn_18_0 = null;
        j stackIn_23_0 = null;
        ka stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 < -69) {
                break L1;
              } else {
                field_b = (bg) null;
                break L1;
              }
            }
            if ((param0 ^ -1) == -3) {
              stackIn_5_0 = new cj(param3, param2, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (4 != param0) {
                if (5 != param0) {
                  if ((param0 ^ -1) != -7) {
                    if (param0 == 7) {
                      stackIn_18_0 = new ma(param3, param2, param1);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L2: {
                        if (param0 == 0) {
                          break L2;
                        } else {
                          if (1 == param0) {
                            break L2;
                          } else {
                            stackIn_25_0 = new ka(param3, param2, param1, param0);
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                      stackIn_23_0 = new j(param3, param2, param1, param0);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = new hg(param3, param2, param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = new rj(param3, param2, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = new sc(param3, param2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("og.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L3;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_35_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uj) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (uj) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (uj) ((Object) stackIn_11_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (uj) ((Object) stackIn_14_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (uj) ((Object) stackIn_18_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (uj) ((Object) stackIn_23_0);
                  } else {
                    return (uj) ((Object) stackIn_25_0);
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_b = (bg) null;
            break L0;
          }
        }
        if (null == pd.field_j) {
          return;
        } else {
          var1 = pd.field_j;
          synchronized (var1) {
            L1: {
              pd.field_j = null;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -1) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, boolean param1) {
        le.field_e.a(0, param0, (byte) -66);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bi var8 = null;
        try {
          L0: {
            var6_int = param0.field_m + param1;
            if (param4 == 12) {
              L1: {
                var7 = param3 + param0.field_q;
                rg.a((byte) -73, var7, param0.field_n, var6_int, param0.field_x);
                var8 = lp.field_w[1];
                if (!(param0 instanceof kg)) {
                  break L1;
                } else {
                  if (((kg) ((Object) param0)).field_z) {
                    var8.c(1 + (var6_int + (param0.field_x - var8.field_o >> -1620406015)), (-var8.field_p + param0.field_n >> 2074811361) + 1 + var7, 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (!param0.f(param4 ^ 13)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                dd.a(-4 + param0.field_n, 1, -4 + param0.field_x, var6_int + 2, 2 + var7);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("og.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, ln[] param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -117 % ((param0 - -84) / 33);
            var5 = 0;
            L1: while (true) {
              if (param1.length <= var5) {
                break L0;
              } else {
                L2: {
                  if (null == param1[var5]) {
                    break L2;
                  } else {
                    L3: {
                      var7 = var5 / param2;
                      if (var7 % 2 != 0) {
                        stackIn_7_0 = 0;
                        break L3;
                      } else {
                        stackIn_7_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_7_0;
                      var6 = 1 + var5;
                      if (0 == var6 % param2) {
                        break L4;
                      } else {
                        if (param1[var6] == null) {
                          break L4;
                        } else {
                          if (param1[var5].field_p >= param1[var6].field_p) {
                            break L4;
                          } else {
                            param1[var5].a((byte) -123, param1[var6]);
                            param1[var6].a((byte) -104, param1[var5]);
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var6 = var5 + -1;
                      if (-1 != (var5 % param2 ^ -1)) {
                        if (param1[var6] == null) {
                          break L5;
                        } else {
                          if (param1[var6].field_p <= param1[var5].field_p) {
                            break L5;
                          } else {
                            param1[var5].a((byte) -87, param1[var6]);
                            param1[var6].a((byte) -77, param1[var5]);
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 > (var7 ^ -1)) {
                        L7: {
                          L8: {
                            if (var5 % param2 != 0) {
                              break L8;
                            } else {
                              if (var8 != 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var8 == 0) {
                              var6 = var5 + -param2;
                              break L9;
                            } else {
                              var6 = -param2 + -1 + var5;
                              break L9;
                            }
                          }
                          if (param1[var6] == null) {
                            break L7;
                          } else {
                            if (param1[var6].field_p <= param1[var5].field_p) {
                              break L7;
                            } else {
                              param1[var5].a((byte) -120, param1[var6]);
                              param1[var6].a((byte) -112, param1[var5]);
                              break L7;
                            }
                          }
                        }
                        L10: {
                          if (var8 != 0) {
                            break L10;
                          } else {
                            if (0 != (var5 + 1) % param2) {
                              break L10;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L11: {
                          if (var8 == 0) {
                            var6 = -param2 + var5 - -1;
                            break L11;
                          } else {
                            var6 = -param2 + var5;
                            break L11;
                          }
                        }
                        if (null == param1[var6]) {
                          break L6;
                        } else {
                          if (param1[var6].field_p > param1[var5].field_p) {
                            param1[var5].a((byte) -93, param1[var6]);
                            param1[var6].a((byte) -88, param1[var5]);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    if (var7 < param3 + -1) {
                      L12: {
                        L13: {
                          if (var8 == 0) {
                            break L13;
                          } else {
                            if (0 != var5 % param2) {
                              break L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          if (var8 != 0) {
                            var6 = var5 - (-param2 - -1);
                            break L14;
                          } else {
                            var6 = var5 + param2;
                            break L14;
                          }
                        }
                        if (null == param1[var6]) {
                          break L12;
                        } else {
                          if (param1[var6].field_p <= param1[var5].field_p) {
                            break L12;
                          } else {
                            param1[var5].a((byte) -81, param1[var6]);
                            param1[var6].a((byte) -124, param1[var5]);
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (var8 != 0) {
                          break L15;
                        } else {
                          if ((var5 - -1) % param2 == 0) {
                            break L2;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (var8 == 0) {
                          var6 = param2 + var5 + 1;
                          break L16;
                        } else {
                          var6 = param2 + var5;
                          break L16;
                        }
                      }
                      if (param1[var6] == null) {
                        break L2;
                      } else {
                        if (param1[var5].field_p >= param1[var6].field_p) {
                          break L2;
                        } else {
                          param1[var5].a((byte) -83, param1[var6]);
                          param1[var6].a((byte) -104, param1[var5]);
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var4);

            stackIn_62_1 = new StringBuilder().append("og.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L17;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L17;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new bg("email");
        field_a = "Rules: Classic";
    }
}
