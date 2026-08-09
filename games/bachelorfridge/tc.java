/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    private int field_d;
    kv[] field_c;
    private int field_e;
    private boolean field_b;
    private int field_h;
    kv field_g;
    private int field_a;
    private int field_f;

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            gs var5 = (gs) null;
            tc.a(false, (gs) null);
        }
        if (!(!hl.field_I)) {
            return ao.field_d.a(dla.field_j, (byte) 7, gf.field_k);
        }
        if (gm.field_k) {
            return wi.a(93, param1, param0);
        }
        if (kf.a(param1, (byte) -89, param0)) {
            return true;
        }
        if (sea.field_j) {
            return false;
        }
        return vaa.a(param2, 1, param1);
    }

    final void a(int param0, tc param1) {
        if (param0 != 8) {
            return;
        }
        try {
            param1.field_g = this.field_g;
            param1.field_a = this.field_a;
            param1.field_b = this.field_b;
            param1.field_c = this.field_c;
            param1.field_f = this.field_f;
            param1.field_e = this.field_e;
            param1.field_d = this.field_d;
            param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tc.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tc a(byte param0, int param1) {
        this.field_d = param1;
        if (param0 != 0) {
            this.field_d = 23;
        }
        return (tc) (this);
    }

    final tc a(kv[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -40) {
                break L1;
              } else {
                tc.a(-101, -18);
                break L1;
              }
            }
            this.field_c = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tc.D(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (tc) (this);
    }

    final static void b(int param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        ma var4_ref_ma = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ma var17 = null;
        int var18 = 0;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            aca.field_g = new int[]{0, 0, param0, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = gaa.field_i.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = aca.field_g[9] >> -1863010744;
                  var4 = aca.field_g[10] >> 1294333320;
                  var5 = aca.field_g[11] >> -1277511928;
                  var6 = ur.field_d << -2001635196;
                  var7 = 0;
                  var8 = via.a(var6, (byte) 59) >> -101413400;
                  var9 = ft.a(var6, (byte) -128) >> 455402216;
                  if (-1 == mk.field_p) {
                    break L2;
                  } else {
                    if (gd.field_m != -1) {
                      var9 = -128;
                      var7 = mk.field_p - 320;
                      var8 = -gd.field_m + 240;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = -var3 + var7;
                var13 = var8 - var4;
                var14 = var9 - var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L3: while (true) {
                  if (gaa.field_i.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= gaa.field_i.length) {
                        var21[var16] = -2147483648;
                        var17 = gaa.field_i[var16];
                        rda.a(var16, 11259);
                        var18 = 0;
                        L5: while (true) {
                          if (3 <= var18) {
                            pt.a(true, aca.field_g, var17, false, (byte) -121, false, dl.field_j);
                            cc.a(var7, var9, var13, var8, var17, (byte) -98, var14, var12);
                            var15++;
                            continue L3;
                          } else {
                            dl.field_j[var18] = dl.field_j[var18] + bd.field_l[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        if ((var21[var17_int] ^ -1) < (var21[var16] ^ -1)) {
                          var16 = var17_int;
                          var17_int++;
                          continue L4;
                        } else {
                          var17_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_ma = gaa.field_i[var3];
                var4_ref_ma.b(108);
                rda.a(var3, 11259);
                var5 = var4_ref_ma.field_u - -var4_ref_ma.field_A >> 212630753;
                var6 = var4_ref_ma.field_B + var4_ref_ma.field_G >> 1448206465;
                var7 = var4_ref_ma.field_I + var4_ref_ma.field_q >> 1536167201;
                var8 = aca.field_g[9] >> -1614374494;
                var9 = aca.field_g[10] >> -347036702;
                var10_int = aca.field_g[11] >> 1037235906;
                var11 = dl.field_j[3] * var8 + (var9 * dl.field_j[4] + dl.field_j[5] * var10_int) >> -1391277522;
                var12 = var10_int * dl.field_j[8] + dl.field_j[6] * var8 + dl.field_j[7] * var9 >> 2066465070;
                var13 = dl.field_j[11] * var10_int + dl.field_j[9] * var8 + dl.field_j[10] * var9 >> -449279090;
                var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> 571051824;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "tc.J(" + param0 + ')');
        }
    }

    final void a(int param0) {
        this.field_h = 0;
        this.field_e = -1;
        this.field_f = 0;
        if (param0 != 11) {
            this.field_g = (kv) null;
        }
        this.field_g = null;
        this.field_c = null;
        this.field_d = 0;
        this.field_a = 256;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            gs var8 = null;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = BachelorFridge.field_y;
            try {
              L0: {
                if (wn.field_p) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        if (param0 == 24215) {
                          break L2;
                        } else {
                          var8 = (gs) null;
                          tc.a(true, (gs) null);
                          break L2;
                        }
                      }
                      var2 = "tuhstatbut";
                      var3 = (String) (ac.a(param1, "getcookies", (byte) 64));
                      var4 = fda.a(-1, ';', var3);
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_13_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_20_0 = 0;
                        break L6;
                      } else {
                        stackIn_20_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref2);

                stackIn_23_1 = new StringBuilder().append("tc.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L7;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L7;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, wd param1, wj param2, int param3, int param4) {
        po stackIn_21_0 = null;
        String stackIn_21_1 = null;
        po stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              hp.a(param2.field_p, param4 + param2.field_s, (byte) -5, param2.field_q, this.field_c, param2.field_v + param0);
              if (null != this.field_g) {
                L2: {
                  var6_int = param4 + (param2.field_s + this.field_f);
                  var7 = param0 - (-param2.field_v + -this.field_d);
                  if (param1.field_m != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_g.field_n + param2.field_p) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (-3 != (param1.field_m ^ -1)) {
                    break L3;
                  } else {
                    var6_int = var6_int + (param2.field_p - this.field_g.field_n);
                    break L3;
                  }
                }
                L4: {
                  if (1 == param1.field_g) {
                    var7 = var7 + (param2.field_q + -this.field_g.field_o) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_g == 2) {
                    var7 = var7 + (param2.field_q - this.field_g.field_o);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_g.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param3 < -17) {
                break L6;
              } else {
                this.field_a = 54;
                break L6;
              }
            }
            L7: {
              var6 = param1.c(param2, 1);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param1.field_l) {
                  break L7;
                } else {
                  if ((this.field_h ^ -1) <= -1) {
                    L8: {
                      stackIn_21_0 = param1.field_l;

                      stackIn_21_1 = (String) (var6);

                      if (this.field_f == -2147483648) {
                        stackIn_22_0 = (po) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = 0;
                        break L8;
                      } else {
                        stackIn_22_0 = (po) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = this.field_f;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_24_2 = stackIn_22_2 + param1.field_i + param2.field_s + param4;

                      stackIn_24_3 = param1.field_j;

                      stackIn_24_4 = param2.field_v + param0;

                      if (this.field_d != -2147483648) {
                        stackIn_22_0 = (po) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = this.field_d;
                        break L9;
                      } else {
                        stackIn_22_0 = (po) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_27_3 = stackIn_25_3 + (stackIn_25_4 - -stackIn_25_5);

                      stackIn_27_4 = -param1.field_s + param2.field_p - param1.field_i;

                      stackIn_27_5 = param2.field_q + (-param1.field_j - param1.field_r);

                      stackIn_27_6 = this.field_h;

                      stackIn_27_7 = this.field_e;

                      if ((this.field_a ^ -1) == 2147483647) {
                        stackIn_22_0 = (po) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = 256;
                        break L10;
                      } else {
                        stackIn_22_0 = (po) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = this.field_a;
                        break L10;
                      }
                    }
                    ((po) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_m, param1.field_g, param1.field_c);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("tc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final tc a(boolean param0, int param1) {
        this.field_b = param0 ? true : false;
        if (param1 != -2147483648) {
            this.field_c = (kv[]) null;
        }
        return (tc) (this);
    }

    final tc b(byte param0, int param1) {
        if (param0 != -88) {
            this.field_f = 97;
        }
        this.field_f = param1;
        return (tc) (this);
    }

    final void a(wd param0, int param1, wj param2, byte param3, tc param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_b) {
                break L1;
              } else {
                param4.a(param5, param0, param2, -118, param1);
                param4.a(11);
                break L1;
              }
            }
            L2: {
              if (this.field_a != -2147483648) {
                param4.field_a = this.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 <= this.field_e) {
                param4.field_e = this.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_c == null) {
                break L4;
              } else {
                param4.field_c = this.field_c;
                break L4;
              }
            }
            L5: {
              if ((this.field_h ^ -1) <= 0) {
                param4.field_h = this.field_h;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null != this.field_g) {
                param4.field_g = this.field_g;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2147483648 != this.field_f) {
                param4.field_f = this.field_f;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_d != -2147483648) {
                param4.field_d = this.field_d;
                break L8;
              } else {
                break L8;
              }
            }
            var7_int = -38 % ((param3 - -21) / 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("tc.M(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    final tc b(int param0, int param1) {
        if (param1 != -25251) {
            this.field_g = (kv) null;
        }
        this.field_h = param0;
        return (tc) (this);
    }

    final tc c(int param0, int param1) {
        this.field_e = param1;
        if (param0 <= 113) {
            return (tc) null;
        }
        return (tc) (this);
    }

    final static int a(boolean param0, gs param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = vq.field_w;
              if ((param1.field_p ^ -1) != -3) {
                if (-5 != (param1.field_p ^ -1)) {
                  if (ge.field_F == param1.field_a) {
                    var2_int = jaa.field_u[param1.field_p];
                    break L1;
                  } else {
                    var2_int = wp.field_q[param1.field_p];
                    break L1;
                  }
                } else {
                  var2_int = wp.field_q[param1.field_p];
                  break L1;
                }
              } else {
                if (!param1.field_i) {
                  L2: {
                    if (param1.field_m != 0) {
                      break L2;
                    } else {
                      if (param1.field_j != 0) {
                        break L2;
                      } else {
                        var2_int = jaa.field_u[param1.field_p];
                        break L1;
                      }
                    }
                  }
                  var2_int = wp.field_q[param1.field_p];
                  break L1;
                } else {
                  var2_int = vq.field_w;
                  break L1;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                tc.a(104, 4);
                break L3;
              }
            }
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("tc.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    tc() {
        this.field_d = -2147483648;
        this.field_c = null;
        this.field_b = false;
        this.field_g = null;
        this.field_a = -2147483648;
        this.field_f = -2147483648;
        this.field_h = -2;
        this.field_e = -2;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        gea var4 = null;
        rg var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (gea) ((Object) wd.field_t.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == -16482) {
                  var5 = (rg) ((Object) rp.field_C.b((byte) 90));
                  L2: while (true) {
                    if (var5 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      kr.a(93, var5, param0);
                      var5 = (rg) ((Object) rp.field_C.c(0));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                tca.a(var4, 5, param0);
                var4 = (gea) ((Object) wd.field_t.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "tc.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
