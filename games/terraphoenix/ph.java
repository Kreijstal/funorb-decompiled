/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends di {
    static int[] field_t;
    private ej field_s;
    private ej field_p;
    static String[] field_n;
    static int field_o;
    static fa field_q;
    static wg field_v;
    static String[] field_r;
    static String field_u;
    static int[] field_m;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
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
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (-1 < (param5 ^ -1)) {
                break L1;
              } else {
                if (ob.field_h <= param0) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param2) {
                      break L2;
                    } else {
                      if (0 <= param7) {
                        break L2;
                      } else {
                        if (param8 >= 0) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < ob.field_i) {
                      break L3;
                    } else {
                      if (ob.field_i > param7) {
                        break L3;
                      } else {
                        if (ob.field_i > param8) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param5 - param0;
                    if (param0 == param1) {
                      L5: {
                        if (param0 != param5) {
                          var15 = param5 + -param1;
                          if (param7 <= param2) {
                            var11 = (param8 + -param7 << -588891184) / var15;
                            var10 = param2 << -513257424;
                            var9_int = param7 << -819171824;
                            var12 = (-param2 + param8 << 632313104) / var14;
                            break L5;
                          } else {
                            var9_int = param2 << -470414064;
                            var12 = (-param7 + param8 << 767336464) / var15;
                            var10 = param7 << -1114056144;
                            var11 = (param8 + -param2 << 1253956144) / var14;
                            break L5;
                          }
                        } else {
                          var12 = 0;
                          var11 = 0;
                          var9_int = param2 << 1291374832;
                          var10 = param7 << 929650032;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (-1 >= (param0 ^ -1)) {
                        break L4;
                      } else {
                        param0 = Math.min(-param0, param1 + -param0);
                        var10 = var10 + var12 * param0;
                        var9_int = var9_int + var11 * param0;
                        param0 = 0;
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param2 << 1194213872;
                        var9_int = param2 << 1194213872;
                        var15 = -param0 + param1;
                        var11 = (-param2 + param7 << -83630896) / var15;
                        var12 = (-param2 + param8 << -929534096) / var14;
                        if (var11 >= var12) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        } else {
                          var13 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (-1 < (param0 ^ -1)) {
                            if (param1 >= 0) {
                              param0 = -param0;
                              var9_int = var9_int + var11 * param0;
                              var10 = var10 + var12 * param0;
                              param0 = 0;
                              break L8;
                            } else {
                              param0 = -param0 + param1;
                              var10 = var10 + param0 * var12;
                              var9_int = var9_int + var11 * param0;
                              param0 = param1;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var16 = ob.field_d[param0];
                        L9: while (true) {
                          if (param1 <= param0) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 684891952;
                              if ((var17 ^ -1) > (ob.field_i ^ -1)) {
                                var18 = (var10 >> -532512592) + -(var9_int >> -1764339600);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L10;
                                  } else {
                                    if (var17 >= ob.field_i) {
                                      break L10;
                                    } else {
                                      ch.a(var17 + var16, var18, 15169, param6, param4);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (ob.field_i > var18 + var17) {
                                      break L11;
                                    } else {
                                      var18 = -var17 + ob.field_i + -1;
                                      break L11;
                                    }
                                  }
                                  if (-1 >= (var17 ^ -1)) {
                                    ch.a(var16 + var17, var18, 15169, param6, param4);
                                    break L10;
                                  } else {
                                    ch.a(var16, var18 + var17, 15169, param6, param4);
                                    break L10;
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param0++;
                            if (ob.field_h <= param0) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var16 = var16 + l.field_k;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L9;
                            }
                          }
                        }
                      }
                      var16 = param5 - param1;
                      if (-1 == (var16 ^ -1)) {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L12: {
                          if (var13 != 0) {
                            var10 = param7 << 81410960;
                            break L12;
                          } else {
                            var9_int = param7 << 104682000;
                            break L12;
                          }
                        }
                        var17 = param8 << 30940336;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  if (param3 <= -109) {
                    L13: {
                      if (0 <= param0) {
                        break L13;
                      } else {
                        param0 = -param0;
                        var10 = var10 + var12 * param0;
                        var9_int = var9_int + var11 * param0;
                        param0 = 0;
                        break L13;
                      }
                    }
                    var15 = ob.field_d[param0];
                    L14: while (true) {
                      if (param0 >= param5) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> -950859376;
                          if (var16 >= ob.field_i) {
                            break L15;
                          } else {
                            var17 = -(var9_int >> -1037530704) + (var10 >> -963230352);
                            if (0 == var17) {
                              if (-1 < (var16 ^ -1)) {
                                break L15;
                              } else {
                                if (var16 < ob.field_i) {
                                  ch.a(var16 - -var15, var17, 15169, param6, param4);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            } else {
                              L16: {
                                if (var16 + var17 < ob.field_i) {
                                  break L16;
                                } else {
                                  var17 = -var16 + (ob.field_i - 1);
                                  break L16;
                                }
                              }
                              if (-1 < (var16 ^ -1)) {
                                ch.a(var15, var16 + var17, 15169, param6, param4);
                                break L15;
                              } else {
                                ch.a(var15 + var16, var17, 15169, param6, param4);
                                break L15;
                              }
                            }
                          }
                        }
                        param0++;
                        if (ob.field_h <= param0) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var15 = var15 + l.field_k;
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var9);

            stackIn_78_1 = new StringBuilder().append("ph.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L17;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L17;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param7 + ',' + param8 + ')');
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
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    ph(ej param0, ej param1, ej param2) {
        super(param0);
        try {
            this.field_s = param2;
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(he param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_25_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ef[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ef[] var10 = null;
        mf var11 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.b(2)) {
              L1: {
                if (0 == param5) {
                  var10 = of.a(param0, param4 + -5);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_25_0 = null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        if (var10[var8].field_d == param1) {
                          L3: {
                            if (var10[var8].field_e == param3) {
                              L4: {
                                if (0 == param2) {
                                  break L4;
                                } else {
                                  if (param2 == var10[var8].field_f) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_g > param5) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var7_int = 1;
                              param5 = var10[var8].field_g;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(param5, param2, true, param1, param3);
              L6: while (true) {
                if (-1 != (var11.field_d ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    L7: {
                      if (param4 == 10) {
                        break L7;
                      } else {
                        field_m = (int[]) null;
                        break L7;
                      }
                    }
                    if (var11.field_d != 2) {
                      stackIn_38_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      ck.a(param0, 112, var7);
                      stackIn_36_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  gi.a((byte) -63, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var6_ref);

            stackIn_41_1 = new StringBuilder().append("ph.A(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L8;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_25_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_36_0);
          } else {
            return stackIn_38_0;
          }
        }
    }

    final im b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        im stackIn_3_0 = null;
        im stackIn_7_0 = null;
        im stackIn_10_0 = null;
        im stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_p.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() == param1) {
              stackIn_3_0 = qf.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!qc.a((byte) 80, var4, var3)) {
                stackIn_7_0 = qf.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.c(param0, -1)) {
                  stackIn_12_0 = dg.field_c;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = qf.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ph.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(int param0, bm param1, int param2, int param3) {
        try {
            ck.field_a = param1;
            nb.field_e = param0;
            if (param3 != -1) {
                field_t = (int[]) null;
            }
            eb.field_D = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ph.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_p.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              var5 = var4;
              if (!f.a(var5, -51)) {
                if (am.a(var5, true)) {
                  stackIn_9_0 = a.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (ef.a((byte) -102, var5)) {
                    stackIn_13_0 = ak.field_j;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var6 = -107 / ((param1 - 26) / 56);
                    if (!this.c(param0, -1)) {
                      if (var7.length() <= 0) {
                        stackIn_31_0 = nb.field_a;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (ak.a(var5, var7, false)) {
                          stackIn_21_0 = jd.field_i;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (a.a(var5, -19, var7)) {
                            stackIn_25_0 = tc.field_b;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (oh.a((byte) -85, var7, var5)) {
                              stackIn_29_0 = jd.field_i;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              return kh.field_M;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = mj.field_a;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_5_0 = kh.field_M;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("ph.B(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean c(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        bm var8 = null;
        String var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                var8 = (bm) null;
                ph.a(-49, (bm) null, -94, 122);
                break L1;
              }
            }
            L2: {
              var9 = this.field_s.field_o.toLowerCase();
              var4 = param0.toLowerCase();
              if (0 >= var9.length()) {
                break L2;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var5 = var9.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (-1 + var9.length() <= var5) {
                      break L2;
                    } else {
                      var6 = var9.substring(0, var5);
                      var7 = var9.substring(var5 - -1);
                      if ((var4.indexOf(var6) ^ -1) <= -1) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (-1 >= (var4.indexOf(var7) ^ -1)) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("ph.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    public static void g(int param0) {
        field_t = null;
        field_u = null;
        field_n = null;
        field_v = null;
        field_m = null;
        field_q = null;
        if (param0 != 104682000) {
            return;
        }
        field_r = null;
    }

    static {
        field_n = new String[]{"Helepad", "Barracks", "ResearchBase", "FactoryBase", "Hanger", "FuelDump", "UFO-Transport", "UFO-Invader", "UFO-Dominator", "MissileBase", "AB-Entrance", "AB-Corridors", "AB-Room0", "AB-Room1", "AB-Room2", "AB-Room3", "AB-Room4", "AB-CommandCenter", "AB-Hanger", "AB-Reactor", "AB-Maindoor", "AB-Hangerdoor", "AlienFactoryBase", "AlienHanger", "City1", "City2", "City3", "City4", "City5", "City6", "City7", "City8", "Tutorial"};
        field_u = "Move to ground level";
        field_r = new String[]{"Alan", "Alex", "Alexi", "Antony", "Andrew", "Ben", "Bill", "Bob", "Carl", "Charles", "Chris", "Daniel", "David", "Dermot", "Douglas", "Eric", "Fred", "Gary", "Gordon", "Greg", "Gunther", "Henry", "Harry", "Harvey", "Karl", "Ian", "Jack", "James", "Jim", "Jonathan", "John", "Joseph", "Justin", "Johannes", "Lincoln", "Lionel", "Luke", "Marcus", "Mark", "Mason", "Maurice", "Michael", "Mike", "Nathan", "Neil", "Noel", "Nigel", "Oliver", "Peter", "Paul", "Philip", "Ralph", "Raymond", "Richard", "Robert", "Roger", "Rupert", "Sagir", "Sam", "Shaun", "Simon", "Steve", "Stewart", "Thomas", "Tony", "Trevor", "Victor", "Vincent", "William", "Wilson", "Yuan", "Bruce", "Joshua", "Patrick"};
        field_m = new int[8192];
    }
}
