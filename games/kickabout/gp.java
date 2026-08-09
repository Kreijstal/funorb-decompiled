/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ps {
    private String field_f;
    static int[] field_g;
    private String field_h;
    static int field_i;

    final kj a(byte param0) {
        if (param0 > -77) {
            iw var3 = (iw) null;
            this.a((iw) null, -96);
        }
        return qq.field_K;
    }

    public static void c(int param0) {
        int var1 = -123 % ((param0 - -53) / 59);
        field_g = null;
    }

    final static void b(byte param0) {
        ag var1 = null;
        int var2 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              cb.field_d.d();
              if (param0 == -28) {
                break L1;
              } else {
                gp.c(-80);
                break L1;
              }
            }
            L2: {
              L3: {
                pg.field_d.d();
                ri.field_r = ri.field_r - 1;
                if (ri.field_r != 0) {
                  break L3;
                } else {
                  ri.field_r = 200;
                  var1 = (ag) ((Object) ps.field_a.g(param0 + 24037));
                  L4: while (true) {
                    if (var1 == null) {
                      if (null != qd.field_c) {
                        var1 = (ag) ((Object) qd.field_c.g(24009));
                        L5: while (true) {
                          if (var1 == null) {
                            break L3;
                          } else {
                            stackIn_15_0 = var1.field_k.e((byte) -113);
                            L6: {
                              if (!stackIn_15_0) {
                                var1.c((byte) -109);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var1 = (ag) ((Object) qd.field_c.c(33));
                            continue L5;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L7: {
                        if (!var1.field_k.e((byte) -113)) {
                          var1.c((byte) -109);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var1 = (ag) ((Object) ps.field_a.c(param0 ^ -59));
                      continue L4;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "gp.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        g.field_a.a(97, param0);
        ib var2 = la.field_a;
        if (param1 >= -27) {
            gp.b((byte) 111);
        }
        if (!(var2 == null)) {
            var2.a(g.field_a.field_T, g.field_a.field_F, (byte) -120);
        }
    }

    final static ld a(byte param0, String param1) {
        ld stackIn_4_0 = null;
        ld stackIn_8_0 = null;
        ld stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        ld stackIn_26_0 = null;
        ld stackIn_39_0 = null;
        ld stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var3 = -34 % ((param0 - 38) / 57);
            var2_int = param1.length();
            if (0 == var2_int) {
              stackIn_4_0 = ld.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_8_0 = st.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(-1 + var2_int) != 34) {
                    stackIn_14_0 = lm.field_F;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = 0;
                    var5 = 1;
                    L1: while (true) {
                      if (var5 < -1 + var2_int) {
                        L2: {
                          var6 = param1.charAt(var5);
                          if (var6 != 92) {
                            L3: {
                              if (var6 != 34) {
                                break L3;
                              } else {
                                if (var4 != 0) {
                                  break L3;
                                } else {
                                  stackIn_26_0 = lm.field_F;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var4 = 0;
                            break L2;
                          } else {
                            L4: {
                              if (var4 != 0) {
                                stackIn_22_0 = 0;
                                break L4;
                              } else {
                                stackIn_22_0 = 1;
                                break L4;
                              }
                            }
                            var4 = stackIn_22_0;
                            break L2;
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var4 = 0;
                  var5 = 0;
                  L5: while (true) {
                    if (var2_int > var5) {
                      L6: {
                        var6 = param1.charAt(var5);
                        if (var6 != 46) {
                          if ((ua.field_i.indexOf(var6) ^ -1) == 0) {
                            stackIn_44_0 = lm.field_F;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var4 = 0;
                            break L6;
                          }
                        } else {
                          L7: {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              if (var5 == var2_int + -1) {
                                break L7;
                              } else {
                                if (var4 != 0) {
                                  break L7;
                                } else {
                                  var4 = 1;
                                  break L6;
                                }
                              }
                            }
                          }
                          stackIn_39_0 = lm.field_F;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var5++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var2);

            stackIn_50_1 = new StringBuilder().append("gp.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L8;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  return stackIn_44_0;
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1, boolean param2, String param3, ae param4, int param5, String param6) {
        RuntimeException var7 = null;
        jn var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wk.field_f != vj.field_a) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new jn(wd.field_l, param4);
                wd.field_l.a(var8, false);
                if (!wq.c((byte) 59)) {
                  L2: {
                    kl.field_a = null;
                    if (!param2) {
                      stackIn_9_0 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = 1;
                      break L2;
                    }
                  }
                  n.field_c = stackIn_9_0 != 0;
                  tn.field_b = param5;
                  wn.field_i = param6;
                  wk.field_f = nr.field_f;
                  ld.field_a = param1;
                  qr.field_f = param3;
                  break L1;
                } else {
                  var8.t(17);
                  break L1;
                }
              }
              if (param0 >= 98) {
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_g = (int[]) null;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("gp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ml var9 = null;
        int var7 = 0;
        try {
            var9 = or.field_d;
            ml var6 = var9;
            var9.b(param3, (byte) 104);
            var9.field_n = var9.field_n + 1;
            int var8 = 39 / ((param1 - 14) / 61);
            var7 = var9.field_n;
            var9.a(113, param2);
            if (!(-3 != (param2 ^ -1))) {
                var9.a(14190, param4);
            }
            if (param5 == null) {
                var9.g(-1207444472, param0);
            } else {
                cu.a((byte) 104, param5, var9);
            }
            var9.c(62, -var7 + var9.field_n);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gp.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(iw param0, int param1) {
        param0.a(this.field_f, (byte) -126);
        if (param1 != 17053) {
            return;
        }
        try {
            param0.a((byte) 124, this.field_h);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gp.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(up param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == -576054046) {
                break L1;
              } else {
                field_i = 81;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (param0.field_h.length <= var3) {
                L3: {
                  var3 = p.a(param1 + 576054974, param0);
                  if (15 > var3) {
                    break L3;
                  } else {
                    var2_int = (452 * ((var3 + -15) * (var3 + -15)) >> 52760709) + 10;
                    var4 = 0;
                    L4: while (true) {
                      if (param0.field_h.length <= var4) {
                        break L3;
                      } else {
                        var5 = pa.field_g[param0.field_h[var4]];
                        var2_int = var2_int + fn.field_g[var5.field_k];
                        var2_int = var2_int + (var5.field_e >> -576054046);
                        var4++;
                        continue L4;
                      }
                    }
                  }
                }
                stackIn_11_0 = var2_int;
                break L0;
              } else {
                var2_int = var2_int + (pa.field_g[param0.field_h[var3]].field_e >> 2068671521);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("gp.K(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    gp(String param0, String param1) {
        try {
            this.field_h = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[8192];
    }
}
