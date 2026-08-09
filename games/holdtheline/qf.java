/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends gd {
    private nk field_m;
    static int[] field_i;
    static long field_l;
    static float[] field_k;
    static int field_j;

    final static void a(ei param0, vj param1, int param2, int param3, int param4, vj param5, int param6, ei param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        float var10 = 0.0f;
        int var10_int = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        lb var14 = null;
        lb var15 = null;
        Object var16 = null;
        Object var17 = null;
        gj var17_ref = null;
        Object var18 = null;
        gj var18_ref = null;
        Object var19 = null;
        gj var19_ref = null;
        lb var20 = null;
        var18 = null;
        var17 = null;
        var19 = null;
        var16 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1.field_k - param5.field_k > 1) {
                break L1;
              } else {
                if ((param1.field_k - param5.field_k ^ -1) > 0) {
                  break L1;
                } else {
                  L2: {
                    if (param1 instanceof lb) {
                      var15 = (lb) ((Object) param1);
                      if (param5 instanceof lb) {
                        var20 = (lb) ((Object) param5);
                        if (!th.a(-1, var15, var20)) {
                          break L2;
                        } else {
                          var10 = mm.field_d + (float)param4;
                          var11 = (float)param6 + lk.field_b;
                          oe.a(var11, param2, param7, (byte) 63, var10, param0);
                          break L2;
                        }
                      } else {
                        L3: {
                          var19_ref = (gj) ((Object) param5);
                          var10_int = ba.a(var15, 0, var19_ref);
                          if (var10_int >= 1) {
                            var11 = (float)param4 + mm.field_d;
                            var12 = (float)param6 + var19_ref.b(lk.field_b, param3 ^ 7518);
                            oe.a(var12, param2, param7, (byte) 113, var11, param0);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if ((var10_int ^ -1) != -3) {
                          break L2;
                        } else {
                          var11 = rb.field_g + (float)param4;
                          var12 = var19_ref.b(cj.field_G, -7517) + (float)param6;
                          oe.a(var12, param2, param7, (byte) 127, var11, param0);
                          break L2;
                        }
                      }
                    } else {
                      var18_ref = (gj) ((Object) param1);
                      if (param5 instanceof lb) {
                        L4: {
                          var14 = (lb) ((Object) param5);
                          var10_int = ba.a(var14, 0, var18_ref);
                          if (var10_int < 1) {
                            break L4;
                          } else {
                            var11 = (float)param4 + var18_ref.b(lk.field_b, -7517);
                            var12 = mm.field_d + (float)param6;
                            oe.a(var12, param2, param7, (byte) 62, var11, param0);
                            break L4;
                          }
                        }
                        if (var10_int == 2) {
                          var11 = var18_ref.b(cj.field_G, -7517) + (float)param4;
                          var12 = rb.field_g + (float)param6;
                          oe.a(var12, param2, param7, (byte) 78, var11, param0);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        L5: {
                          var17_ref = (gj) ((Object) param5);
                          var10_int = i.a(var17_ref, var18_ref, -6218);
                          if (-2 >= (var10_int ^ -1)) {
                            var11 = var18_ref.b(mm.field_d, -7517) + (float)param4;
                            var12 = var17_ref.b(lk.field_b, param3 ^ 7518) + (float)param6;
                            oe.a(var12, param2, param7, (byte) 110, var11, param0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (-3 != (var10_int ^ -1)) {
                          break L2;
                        } else {
                          var11 = (float)param4 + var18_ref.b(rb.field_g, param3 ^ 7518);
                          var12 = (float)param6 + var17_ref.b(cj.field_G, param3 ^ 7518);
                          oe.a(var12, param2, param7, (byte) 91, var11, param0);
                          break L2;
                        }
                      }
                    }
                  }
                  L6: {
                    if (param3 == -3) {
                      break L6;
                    } else {
                      field_i = (int[]) null;
                      break L6;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var8);

            stackIn_30_1 = new StringBuilder().append("qf.BA(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qf(nk param0, nk param1) {
        super(param0);
        try {
            this.field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        if (!(pj.b((byte) 80))) {
            wm.a(param3, false, param0);
            return;
        }
        ej.field_b = param0;
        if (ej.field_b == dg.field_c) {
            return;
        }
        lm.field_a = dg.field_c;
        if (param2 != 3865) {
            field_j = 35;
            if ((dg.field_c ^ -1) != -14) {
                if (!(0 == (dg.field_c ^ -1))) {
                    ((ti) ((Object) l.field_a[dg.field_c])).i(param2 ^ 3923);
                }
                vg.field_G = 1;
                gg.field_L = param1 ? true : false;
                return;
            }
            ((ec) ((Object) l.field_a[dg.field_c])).d((byte) -126);
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        if ((dg.field_c ^ -1) == -14) {
            ((ec) ((Object) l.field_a[dg.field_c])).d((byte) -126);
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        if (0 == (dg.field_c ^ -1)) {
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        ((ti) ((Object) l.field_a[dg.field_c])).i(param2 ^ 3923);
        vg.field_G = 1;
        gg.field_L = param1 ? true : false;
    }

    final static void a(int param0, int param1, byte[] param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = 256;
            var4 = new int[256];
            var5 = 0;
            L1: while (true) {
              if (-257 >= (var5 ^ -1)) {
                var3_int += 256;
                var7 = param0;
                var5 = var7;
                L2: while (true) {
                  if (var7 >= 256) {
                    break L0;
                  } else {
                    param2[var3_int] = (byte)(param2[var3_int] + -param1);
                    var3_int = var3_int + var4[var7];
                    var7++;
                    continue L2;
                  }
                }
              } else {
                incrementValue$1 = var3_int;
                var3_int++;
                var4[var5] = pk.a((int) param2[incrementValue$1], 255);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("qf.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final fd a(String param0, byte param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        fd stackIn_8_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 52) {
                break L1;
              } else {
                field_k = (float[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_m instanceof wk) {
                var3 = ((wk) ((Object) this.field_m)).a(1);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.b(-7447) != tg.field_d) {
                    stackIn_8_0 = g.field_k;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_m.field_q)) {
                stackIn_12_0 = g.field_k;
                break L3;
              } else {
                stackIn_12_0 = tg.field_d;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("qf.N(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(boolean param0) {
        ja.a(-1848651292, en.a(95));
        if (!param0) {
            qf.g(33);
        }
    }

    public static void g(int param0) {
        field_k = null;
        if (param0 != -14) {
            return;
        }
        field_i = null;
    }

    final static ui a(int param0, el param1) {
        RuntimeException var2 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 293) {
                break L1;
              } else {
                field_i = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = lg.a(db.a(param1, 100, 96), (byte) -68);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qf.AA(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, ee param1, ee param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (!param1.field_z) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2.field_z) {
                if (param0 < -60) {
                  L1: {
                    if ((param1.field_q + -param2.field_q ^ -1) < -2) {
                      break L1;
                    } else {
                      if ((param1.field_q + -param2.field_q ^ -1) > 0) {
                        break L1;
                      } else {
                        if ((param2.field_A.field_f - param1.field_A.field_f) * (param2.field_A.field_f + -param1.field_A.field_f) + (-param1.field_A.field_h + param2.field_A.field_h) * (-param1.field_A.field_h + param2.field_A.field_h) <= (param2.field_B + param1.field_B) * (param2.field_B + param1.field_B)) {
                          L2: {
                            if (!param1.field_p) {
                              break L2;
                            } else {
                              if (!param2.field_p) {
                                break L2;
                              } else {
                                stackIn_19_0 = jf.a(param1.field_w, param1.field_A, param2.field_i, param1.field_k, param2.field_w, param2.field_k, param1.field_i, param2.field_A, 7527);
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                          if (param1.field_p) {
                            stackIn_27_0 = ck.a(param2.field_B, true, param1.field_i, param2.field_A, param1.field_A, param1.field_k, param1.field_w);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!param2.field_p) {
                              stackIn_25_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              stackIn_23_0 = ca.a(param1.field_A, param2.field_i, param2.field_A, param1.field_B, param2.field_w, param2.field_k, 110);
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_15_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("qf.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L4;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0 != 0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final String a(String param0, boolean param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_16_0 = null;
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
              if (!(this.field_m instanceof wk)) {
                break L1;
              } else {
                var3 = ((wk) ((Object) this.field_m)).a(1);
                if (var3 != null) {
                  L2: {
                    if (var3.b(-7447) != tg.field_d) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_m.field_q)) {
                        break L2;
                      } else {
                        stackIn_6_0 = jd.field_L;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = var3.b((byte) -59);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0.equals(this.field_m.field_q)) {
              stackIn_12_0 = jd.field_L;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (!param1) {
                field_l = 24L;
                stackIn_16_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("qf.L(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return (String) ((Object) stackIn_16_0);
            }
          }
        }
    }

    static {
        field_k = new float[]{1.5f, 1.25f, 1.0f};
    }
}
