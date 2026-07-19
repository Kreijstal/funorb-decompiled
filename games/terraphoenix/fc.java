/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private boolean field_c;
    private int field_f;
    static fa field_a;
    static int[] field_e;
    static bg[] field_i;
    private int field_d;
    static String[] field_k;
    static String field_g;
    static String field_b;
    static String field_h;
    static String field_j;
    private int[] field_l;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -114) {
            return;
        }
        field_h = null;
        field_g = null;
        field_b = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_k = null;
    }

    final int c(int param0) {
        if (param0 != -16952) {
            return 119;
        }
        return this.field_d - -1;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > this.field_d) {
            this.field_d = param1;
        }
        if (param2 != 16) {
            this.b(48, 84);
        }
        if (!(this.field_l.length > param1)) {
            this.a(param1, (byte) -126);
        }
        this.field_l[param1] = param0;
    }

    private final void a(int param0, byte param1) {
        int[] var5 = new int[this.a(-1, param0)];
        int[] var3 = var5;
        ka.a(this.field_l, 0, var5, 0, this.field_l.length);
        this.field_l = var5;
        int var4 = 63 / ((param1 - -72) / 53);
    }

    final void b(int param0, int param1) {
        L0: {
          if (param1 > 119) {
            break L0;
          } else {
            field_i = (bg[]) null;
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) > -1) {
            break L1;
          } else {
            if (this.field_d < param0) {
              break L1;
            } else {
              L2: {
                if (this.field_d == param0) {
                  break L2;
                } else {
                  ka.a(this.field_l, param0 - -1, this.field_l, param0, this.field_d + -param0);
                  break L2;
                }
              }
              this.field_d = this.field_d - 1;
              return;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + this.field_d, 16);
        if (param0 != 0) {
            field_e = (int[]) null;
        }
    }

    final int a(byte param0, int param1) {
        if (param1 > this.field_d) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 != -68) {
            fc.a((byte) 71);
        }
        return this.field_l[param1];
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            ci var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 100) {
                        break L2;
                      } else {
                        var3 = (ci) null;
                        fc.a(-76, (ci) null, -49, -91, 0);
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    param0.getAppletContext().showDocument(bb.a((byte) 112, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("fc.I(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ci param1, int param2, int param3, int param4) {
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
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
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var18 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param0 = param0 + param3;
              param3 = param3 - (-15 + param1.field_u);
              param2 = param2 + param1.field_p;
              param3 = param3 + param1.field_v;
              var5_int = param3 * l.field_k + param2;
              var6 = param4;
              var7 = param2;
              var8 = param3;
              var9 = param1.field_t;
              var10 = param1.field_r;
              var11 = -var10 + l.field_k;
              var12 = 0;
              if (param3 >= l.field_d) {
                break L1;
              } else {
                var13 = -param3 + l.field_d;
                var9 = var9 - var13;
                param3 = l.field_d;
                var5_int = var5_int + var13 * l.field_k;
                var6 = var6 + var13 * var10;
                var8 = var8 + var13;
                break L1;
              }
            }
            L2: {
              if (l.field_b > param2) {
                var13 = -param2 + l.field_b;
                var12 = var12 + var13;
                var7 = var7 + var13;
                var11 = var11 + var13;
                var10 = var10 - var13;
                var6 = var6 + var13;
                param2 = l.field_b;
                var5_int = var5_int + var13;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 + var9 > l.field_c) {
                var9 = var9 - (param3 - -var9 + -l.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (l.field_f >= param2 + var10) {
                break L4;
              } else {
                var13 = var10 + (param2 + -l.field_f);
                var10 = var10 - var13;
                var12 = var12 + var13;
                var11 = var11 + var13;
                break L4;
              }
            }
            L5: {
              if ((var10 ^ -1) >= -1) {
                break L5;
              } else {
                if (-1 > (var9 ^ -1)) {
                  var13 = var7;
                  var15 = -(var10 >> -702278302);
                  var10 = -(var10 & 3);
                  var16 = -var9;
                  L6: while (true) {
                    if (var16 >= 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = var15;
                      L7: while (true) {
                        if (-1 >= (var17 ^ -1)) {
                          var17 = var10;
                          L8: while (true) {
                            if (0 <= var17) {
                              L9: {
                                var8++;
                                var7 = var13;
                                var5_int = var5_int + var11;
                                if (var8 >= param3 + (param1.field_t + -15)) {
                                  param0++;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var6 = var6 + var12;
                              var16++;
                              continue L6;
                            } else {
                              L10: {
                                incrementValue$14 = var6;
                                var6++;
                                var14 = param1.field_z[incrementValue$14];
                                if (var14 != 0) {
                                  incrementValue$15 = var5_int;
                                  var5_int++;
                                  l.field_i[incrementValue$15] = 0;
                                  break L10;
                                } else {
                                  var5_int++;
                                  break L10;
                                }
                              }
                              var17++;
                              continue L8;
                            }
                          }
                        } else {
                          L11: {
                            L12: {
                              incrementValue$16 = var6;
                              var6++;
                              var14 = param1.field_z[incrementValue$16];
                              if (-1 == (var14 ^ -1)) {
                                break L12;
                              } else {
                                if (gd.field_a[var7][var8] > param0) {
                                  break L12;
                                } else {
                                  incrementValue$17 = var7;
                                  var7++;
                                  gd.field_a[incrementValue$17][var8] = param0;
                                  incrementValue$18 = var5_int;
                                  var5_int++;
                                  l.field_i[incrementValue$18] = 0;
                                  break L11;
                                }
                              }
                            }
                            var5_int++;
                            var7++;
                            break L11;
                          }
                          L13: {
                            L14: {
                              incrementValue$19 = var6;
                              var6++;
                              var14 = param1.field_z[incrementValue$19];
                              if (-1 == (var14 ^ -1)) {
                                break L14;
                              } else {
                                if (gd.field_a[var7][var8] <= param0) {
                                  incrementValue$20 = var7;
                                  var7++;
                                  gd.field_a[incrementValue$20][var8] = param0;
                                  incrementValue$21 = var5_int;
                                  var5_int++;
                                  l.field_i[incrementValue$21] = 0;
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var5_int++;
                            var7++;
                            break L13;
                          }
                          L15: {
                            L16: {
                              incrementValue$22 = var6;
                              var6++;
                              var14 = param1.field_z[incrementValue$22];
                              if (var14 == 0) {
                                break L16;
                              } else {
                                if (param0 < gd.field_a[var7][var8]) {
                                  break L16;
                                } else {
                                  incrementValue$23 = var7;
                                  var7++;
                                  gd.field_a[incrementValue$23][var8] = param0;
                                  incrementValue$24 = var5_int;
                                  var5_int++;
                                  l.field_i[incrementValue$24] = 0;
                                  break L15;
                                }
                              }
                            }
                            var7++;
                            var5_int++;
                            break L15;
                          }
                          L17: {
                            L18: {
                              incrementValue$25 = var6;
                              var6++;
                              var14 = param1.field_z[incrementValue$25];
                              if (0 == var14) {
                                break L18;
                              } else {
                                if (param0 < gd.field_a[var7][var8]) {
                                  break L18;
                                } else {
                                  incrementValue$26 = var7;
                                  var7++;
                                  gd.field_a[incrementValue$26][var8] = param0;
                                  incrementValue$27 = var5_int;
                                  var5_int++;
                                  l.field_i[incrementValue$27] = 0;
                                  break L17;
                                }
                              }
                            }
                            var5_int++;
                            var7++;
                            break L17;
                          }
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var5);
            stackOut_48_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L19;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L19;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = a.field_d;
        synchronized (var1) {
          L0: {
            L1: {
              oh.field_f = wa.field_p;
              ng.field_t = ng.field_t + 1;
              ef.field_j = ie.field_d;
              if (param0 == 43) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            jb.field_b = ch.field_d;
            ja.field_l = sj.field_c;
            sj.field_c = false;
            ma.field_I = sh.field_z;
            mm.field_c = qe.field_l;
            lm.field_c = qd.field_i;
            sh.field_z = 0;
            break L0;
          }
        }
    }

    final static int a(int param0) {
        if (-3 < (uh.field_H ^ -1)) {
          return 0;
        } else {
          L0: {
            if ((ph.field_o ^ -1) != param0) {
              L1: {
                if (bl.field_a != null) {
                  if (!bl.field_a.a(0)) {
                    return 14;
                  } else {
                    if (!bl.field_a.d(param0 + 0, "")) {
                      return 29;
                    } else {
                      if (!bl.field_a.a(-3, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (bi.field_d.a(param0 ^ -1)) {
                if (bi.field_d.a(-3, "commonui")) {
                  if (!ph.field_q.a(0)) {
                    return 71;
                  } else {
                    if (!ph.field_q.a(param0 + -2, "commonui")) {
                      return 80;
                    } else {
                      if (!ch.field_g.a(0)) {
                        return 82;
                      } else {
                        if (ch.field_g.b((byte) -128)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    }
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            } else {
              if (!bi.field_d.a(0)) {
                return 20;
              } else {
                if (bi.field_d.a(param0 ^ 2, "commonui")) {
                  if (!ph.field_q.a(0)) {
                    return 50;
                  } else {
                    if (!ph.field_q.a(param0 ^ 2, "commonui")) {
                      return 60;
                    } else {
                      if (ch.field_g.a(0)) {
                        if (ch.field_g.b((byte) -128)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              }
            }
          }
          return 100;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param0 == -1) {
          var3 = this.field_l.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!this.field_c) {
                var3 = var3 + this.field_f;
                continue L0;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * this.field_f;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -109;
        }
    }

    final static ee a(int param0, uc param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ee stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = param1.a(false, 8);
            if (-1 > (var2_int ^ -1)) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param0 == 11043) {
                  break L1;
                } else {
                  field_g = (String) null;
                  break L1;
                }
              }
              L2: {
                var3 = ma.a(param1, (byte) 98) ? 1 : 0;
                var4 = ma.a(param1, (byte) 98) ? 1 : 0;
                var5 = new ee();
                var5.field_m = (short)param1.a(false, 16);
                var5.field_D = dc.a(-25076, var5.field_D, 16, param1);
                var5.field_B = dc.a(param0 ^ -19153, var5.field_B, 16, param1);
                var5.field_L = dc.a(-25076, var5.field_L, 16, param1);
                var5.field_l = (short)param1.a(false, 16);
                var5.field_E = dc.a(-25076, var5.field_E, 16, param1);
                var5.field_n = dc.a(-25076, var5.field_n, 16, param1);
                var5.field_p = dc.a(-25076, var5.field_p, 16, param1);
                if (var3 != 0) {
                  var5.field_o = (short)param1.a(false, 16);
                  var5.field_j = dc.a(param0 ^ -19153, var5.field_j, 16, param1);
                  var5.field_P = dc.a(-25076, var5.field_P, 16, param1);
                  var5.field_u = dc.a(-25076, var5.field_u, 16, param1);
                  var5.field_C = dc.a(param0 ^ -19153, var5.field_C, 16, param1);
                  var5.field_k = dc.a(param0 ^ -19153, var5.field_k, 16, param1);
                  var5.field_g = dc.a(-25076, var5.field_g, 16, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  discarded$1 = param1.a(false, 16);
                  var5.field_F = dc.a(-25076, var5.field_F, 16, param1);
                  var5.field_s = dc.a(-25076, var5.field_s, 16, param1);
                  var5.field_A = dc.a(-25076, var5.field_A, 16, param1);
                  var5.field_y = dc.a(param0 + -36119, var5.field_y, 16, param1);
                  var5.field_J = dc.a(-25076, var5.field_J, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!ma.a(param1, (byte) 98)) {
                  break L4;
                } else {
                  var5.field_x = dc.a(param0 ^ -19153, var5.field_x, 16, param1);
                  break L4;
                }
              }
              L5: {
                if (!ma.a(param1, (byte) 98)) {
                  break L5;
                } else {
                  var5.field_f = ig.a(16, 125, param1, var5.field_f);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_f.length) {
                      if (0 == var6) {
                        var5.field_f = null;
                        break L5;
                      } else {
                        var5.field_I = (byte)(1 + var6);
                        break L5;
                      }
                    } else {
                      L7: {
                        if ((255 & var5.field_f[var7]) > var6) {
                          var6 = var5.field_f[var7] & 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_23_0 = (ee) (var5);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    private fc() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "To Customer Support";
        field_k = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = "Quit to main menu";
        field_e = new int[1024];
        field_j = "LAC-2";
        field_h = "UFO about to launch";
    }
}
