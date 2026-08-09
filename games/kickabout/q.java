/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int[] field_e;
    static String field_f;
    static int field_b;
    private lk[] field_g;
    int field_a;
    static String[] field_h;
    static uo field_d;
    static String field_c;

    final static void a(hd param0, int param1, int param2, int param3, hd param4, byte[] param5, hd param6, int param7, int param8, int param9) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          L0: {
            rp.field_x = param5;
            dd.field_c = -1L;
            qi.field_p = param8;
            ss.field_j = param5.length;
            hw.field_k = false;
            er.field_h = new byte[(7 + qi.field_p) / 8];
            uv.field_i = null;
            ow.field_b = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (var11 >= rp.field_x.length) {
                L2: {
                  var10_int = (7 + var10_int) / 8;
                  rf.field_d = new byte[var10_int];
                  if (null == param0.field_jb) {
                    param0.field_jb = new tf();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  rp.field_B = param0.field_jb;
                  rp.field_B.b(22997);
                  pq.field_N = new em(param2);
                  jm.field_h = 0;
                  mi.field_d = -1;
                  da.field_o = -1;
                  fh.field_b = 0;
                  if (param6.field_jb == null) {
                    param6.field_jb = new tf();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  kq.field_yb = param6.field_jb;
                  kq.field_yb.b(22997);
                  sr.field_f = new em(param9);
                  if (param4.field_jb == null) {
                    param4.field_jb = new tf();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  lw.field_d = param4.field_jb;
                  lw.field_d.b(22997);
                  pu.field_Eb = new em(param3);
                  mg.field_c = param7;
                  vg.field_Ib = 0L;
                  if (param1 > 114) {
                    break L5;
                  } else {
                    q.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
                    break L5;
                  }
                }
                break L0;
              } else {
                var10_int = var10_int + (rp.field_x[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var10);

            stackIn_18_1 = new StringBuilder().append("q.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_28_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final lk a(byte param0) {
        if (param0 <= 55) {
            return (lk) null;
        }
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_g[fieldTemp$0];
    }

    public static void b(int param0) {
        field_e = null;
        field_h = null;
        field_c = null;
        field_f = null;
        int var1 = 73 / ((-20 - param0) / 63);
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != 6) {
            field_e = (int[]) null;
        }
        return this.field_a >= this.field_g.length ? true : false;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        ut[] var10;
        ut[] var11_ref_ut__;
        int var11;
        int var12;
        ut var13;
        int var14;
        int var15;
        var15 = Kickabout.field_G;
        var9 = param1 + (param3 + param0);
        var10 = new ut[]{new ut(var9, var9), new ut(param4, var9), new ut(var9, var9), new ut(var9, param4), new ut(64, 64), new ut(var9, param4), new ut(var9, var9), new ut(param4, var9), new ut(var9, var9)};
        var11_ref_ut__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_ut__.length) {
            var11 = 0;
            L1: while (true) {
              if (param0 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (param0 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= param4) {
                        if (param5 == -1481) {
                          var11 = 0;
                          L4: while (true) {
                            if (param4 >> 1827069377 <= var11) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (var12 >= param1) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_y[(var9 + -var12 - 1) * param4 - -var11] = param7;
                                  var10[3].field_y[var9 + -1 + (-var12 + var9 * var11)] = param7;
                                  var10[7].field_y[var12 * param4 - -var11] = param7;
                                  var10[5].field_y[var9 * var11 - -var12] = param7;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          return (ut[]) null;
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 < param0) {
                            var10[7].field_y[param4 * (-var12 + (var9 + -1)) - -var11] = param2;
                            var10[5].field_y[-var12 - (-var9 + 1 - var9 * var11)] = param2;
                            var10[1].field_y[var12 * param4 - -var11] = param8;
                            var10[3].field_y[var11 * var9 + var12] = param8;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_y[var12 + var11 * var9] = param8;
                        var10[0].field_y[var9 * var12 + var11] = param8;
                        if (var9 + -var11 > var12) {
                          var10[2].field_y[var11 * var9 + var12] = param8;
                          var10[6].field_y[var9 * var12 + var11] = param8;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_y[(-1 + -var11 + var9) * var9 - -var12] = param2;
                    var10[8].field_y[var12 + var9 * (-var11 + (var9 + -1))] = param2;
                    var10[2].field_y[var12 * var9 + (-1 + (var9 + -var11))] = param2;
                    var10[8].field_y[-var11 - -var9 - (1 - var12 * var9)] = param2;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ut__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_y.length) {
                var12++;
                continue L0;
              } else {
                var13.field_y[var14] = param6;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    q(tf param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        lk var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          L0: {
            this.field_g = new lk[param0.a(false)];
            var2_int = 0;
            var3 = (lk) ((Object) param0.g(24009));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.c((byte) -109);
                incrementValue$2 = var2_int;
                var2_int++;
                this.field_g[incrementValue$2] = var3;
                var3 = (lk) ((Object) param0.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("q.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_e = new int[7];
        field_h = new String[]{"Amateur", "Pebble Playoffs", "Cobalt Conference", "Sandstone Series", "Quartz Qualifiers", "Crystal Circuit", "Diamond Division"};
        field_f = "Stats";
        field_e[5] = 11;
        field_e[2] = 8;
        field_e[4] = 10;
        field_e[6] = 19;
        field_e[1] = 7;
        field_e[0] = 6;
        field_e[3] = 9;
        field_c = "Username: ";
    }
}
