/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wla extends jea {
    private jea field_zb;
    private int field_Gb;
    private jea[] field_yb;
    private jea field_xb;
    private jea field_Fb;
    private jea field_Bb;
    private jea field_tb;
    static ur field_Eb;
    long field_Db;
    static int field_ub;
    private jea field_wb;
    private StringBuilder field_vb;
    private ta field_Ab;
    static volatile boolean field_Cb;

    private final int a(int param0, int param1, jea param2, int param3, jea param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0 += 8;
            if (param1 == 13) {
              var6_int = param4.field_H.a(param4.field_r, -(2 * param4.field_x) + param3, param4.field_P);
              param4.a(param3, var6_int, -23776, param0, 0);
              param0 = param0 + (var6_int - 0);
              param2.b(-125, param4);
              stackIn_4_0 = param0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -113;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("wla.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        field_Eb = null;
        if (!param0) {
            field_Cb = true;
        }
    }

    final String f(int param0) {
        int var2 = -32 / ((-45 - param0) / 61);
        return this.field_vb.toString();
    }

    wla(int param0, int param1, int param2, int param3, int param4, jea param5, jea param6, jea param7, jea param8, ta param9, jea param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        jea[] var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        jea[] var28 = null;
        Object stackIn_7_0;
        ta stackIn_7_1;
        ta stackIn_7_2;
        long stackIn_7_3;
        ta stackIn_7_4;
        Object stackIn_8_0;
        ta stackIn_8_1;
        ta stackIn_8_2;
        long stackIn_8_3;
        ta stackIn_8_4;
        String stackIn_8_5;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        this.field_Gb = -2;
        try {
          L0: {
            L1: {
              this.field_Db = param12;
              this.field_zb = new jea(0L, param6, gfa.field_m.toUpperCase());
              this.field_zb.field_z = 1;
              this.b(-126, this.field_zb);
              this.field_Fb = new jea(0L, param7);
              this.field_zb.b(-123, this.field_Fb);
              this.field_wb = new jea(0L, (jea) null);
              this.b(-127, this.field_wb);
              if (param11 == null) {
                this.field_Bb = new jea(0L, param8, rh.field_r);
                this.field_Bb.field_z = 1;
                this.field_Bb.field_ib = 11184810;
                this.field_wb.b(-126, this.field_Bb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Bb.field_H.a(this.field_Bb.field_r, var15_int);
                this.field_Bb.a(var15_int, di.field_a * var17, -23776, var16, 13);
                var16 = var16 + var17 * di.field_a;
                this.field_wb.a(26 + var15_int, var16 + 10, -23776, 24, 0);
                this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -121, 8421504);
                var18 = 13 + var15_int + 13;
                var19 = var16 + 34;
                var20 = bt.a((byte) -8, var18, param2, param0);
                var21 = hsa.a(param3, var19, param1, (byte) 53);
                this.a(var18, var19, -23776, var21, var20);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Bb = new jea(0L, param8, fpa.field_a);
                    this.field_Bb.field_ib = 11184810;
                    this.field_Bb.field_z = 1;
                    this.field_wb.b(-122, this.field_Bb);
                    this.field_tb = new jea(0L, param8, nla.field_b);
                    this.field_tb.field_ib = 11184810;
                    this.field_tb.field_z = 1;
                    this.field_wb.b(-122, this.field_tb);
                    this.field_xb = new jea(0L, param8);
                    this.field_xb.field_ib = 16764006;
                    this.field_wb.b(-125, this.field_xb);
                    this.field_xb.field_sb = "|";
                    if (rja.field_e >= 5) {
                      break L3;
                    } else {
                      if (ld.field_e < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_7_0 = this;

                      stackIn_7_1 = null;

                      stackIn_7_2 = null;

                      stackIn_7_3 = 0L;

                      stackIn_7_4 = (ta) (param9);

                      if (-8 >= (rja.field_e ^ -1)) {
                        break L5;
                      } else {
                        stackIn_7_0 = this;

                        stackIn_7_1 = null;

                        stackIn_7_2 = null;

                        stackIn_7_4 = (ta) ((Object) stackIn_7_4);

                        if (-3 >= (ld.field_e ^ -1)) {
                          break L5;
                        } else {
                          stackIn_8_0 = this;
                          stackIn_8_1 = null;
                          stackIn_8_2 = null;
                          stackIn_8_3 = stackIn_7_3;
                          stackIn_8_4 = (ta) ((Object) stackIn_7_4);
                          stackIn_8_5 = pl.field_c;
                          break L4;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_3 = stackIn_7_3;
                    stackIn_8_4 = (ta) ((Object) stackIn_7_4);
                    stackIn_8_5 = ur.field_b;
                    break L4;
                  }
                  ((wla) (this)).field_Ab = new ta(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_wb.b(-125, this.field_Ab);
                  break L2;
                }
                var28 = new jea[3];
                var15 = var28;
                var28[0] = new jea(0L, (jea) null);
                this.field_wb.b(-123, var28[0]);
                var28[1] = new jea(0L, (jea) null);
                this.field_wb.b(-122, var28[1]);
                var28[2] = new jea(0L, (jea) null);
                this.field_wb.b(-127, var28[2]);
                this.field_yb = new jea[rh.field_n];
                var16 = 0;
                L6: while (true) {
                  if (rh.field_n <= var16) {
                    L7: {
                      this.field_vb = new StringBuilder(12);
                      if (null == param11) {
                        break L7;
                      } else {
                        discarded$1 = this.field_vb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_H.b(ai.field_c);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_H.b(qba.field_b);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_H.b(lo.field_o);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= rh.field_n) {
                        L12: {
                          if (var16 <= 140) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(param6, ai.field_c, var16, var18, 8421504, var28[0]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[6]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[9]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[5]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[7]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[15]);
                          var18 = this.a(var18, 13, var28[0], var16, this.field_yb[4]);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(param6, qba.field_b, var16, var18, 8421504, var28[1]);
                          var18 = this.a(var18, 13, var28[1], var16, this.field_yb[16]);
                          var18 = this.a(var18, 13, var28[1], var16, this.field_yb[17]);
                          var18 = this.a(var18, 13, var28[1], var16, this.field_yb[18]);
                          var18 = this.a(var18, 13, var28[1], var16, this.field_yb[19]);
                          var18 = this.a(var18, 13, var28[1], var16, this.field_yb[20]);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(param6, lo.field_o, var16, var18, 8421504, var28[2]);
                          var18 = this.a(var18, 13, var28[2], var16, this.field_yb[13]);
                          var18 = this.a(var18, 13, var28[2], var16, this.field_yb[21]);
                          var18 = this.a(var18, 13, var28[2], var16, this.field_yb[11]);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + 3 * var16;
                          var20 = this.field_zb.b((byte) 69);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_Ab) {
                            break L17;
                          } else {
                            var20 = this.field_Ab.a((byte) 95, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_zb.a(13 + (13 - -var19), 24, -23776, 0, 0);
                          this.field_Fb.a(15, 15, -23776, 5, -20 + this.field_zb.field_G);
                          var21 = 10;
                          this.field_Bb.a(var19, 2 * di.field_a, -23776, var21, 13);
                          var21 = var21 + di.field_a * 2;
                          this.field_tb.a(var19, 2 * di.field_a, -23776, var21, 13);
                          var21 = var21 + (10 + 2 * di.field_a);
                          this.field_xb.a(0, di.field_a, -23776, var21, 0);
                          var21 = var21 + (di.field_a + 10);
                          if (null == this.field_Ab) {
                            break L18;
                          } else {
                            var20 = this.field_Ab.a((byte) 95, 4);
                            this.field_Ab.a(var20, var21, (byte) -110, 4, di.field_a, 13 - -((-var20 + var19) / 2));
                            var21 = var21 + (10 + di.field_a);
                            break L18;
                          }
                        }
                        var28[0].a(var16, var17, -23776, var21, 13);
                        var28[1].a(var16, var17, -23776, var21, 13 + (13 - -var16));
                        var28[2].a(var16, var17, -23776, var21, 26 + (2 * var16 + 13));
                        var22 = var21;
                        this.field_wb.a(var19 + 26, 10 + (var17 + var22), -23776, 24, 0);
                        this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -125, 8421504);
                        var23 = 13 + (13 - -var19);
                        var24 = 10 + var17 + (var22 + 24);
                        var25 = bt.a((byte) -8, var23, param2, param0);
                        var26 = hsa.a(param3, var24, param1, (byte) -99);
                        this.a(var23, var24, -23776, var26, var25);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_yb[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_yb[var17].b((byte) 69);
                            if (var18 <= var16) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (null == aca.field_h[var16]) {
                        break L20;
                      } else {
                        L21: {
                          this.field_yb[var16] = new jea(0L, param10, aca.field_h[var16]);
                          this.field_yb[var16].field_z = 0;
                          stackIn_14_0 = this.field_yb[var16];

                          if (param11 == null) {
                            stackIn_15_0 = (jea) ((Object) stackIn_14_0);
                            stackIn_15_1 = 0;
                            break L21;
                          } else {
                            stackIn_15_0 = (jea) ((Object) stackIn_14_0);
                            stackIn_15_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_X = stackIn_15_1 != 0;
                        this.field_wb.b(-128, this.field_yb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("wla.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L22;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param6 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L23;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L24;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param8 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L25;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param9 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L26;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');

            if (param10 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L27;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param11 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L28;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final boolean c(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Ab) {
              break L2;
            } else {
              if (!this.field_Ab.field_cb) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final int a(jea param0, String param1, int param2, int param3, int param4, jea param5) {
        jea var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == 8421504) {
              var7 = new jea(0L, param0, 0, param3, param2, 24, param1);
              param3 += 32;
              param5.b(param4 ^ -8421632, var7);
              stackIn_4_0 = param3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -60;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("wla.A(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(boolean param0) {
        if ((this.field_Gb ^ -1) != 1) {
            return false;
        }
        if (!(-14 != (fna.field_h ^ -1))) {
            this.field_Gb = -1;
        }
        if (!param0) {
            return true;
        }
        return true;
    }

    final int d(int param0, boolean param1) {
        ta stackIn_6_0 = null;
        ta stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          this.c(44, param1);
          if (null == this.field_xb) {
            break L0;
          } else {
            L1: {
              this.field_xb.field_r = this.field_vb.toString();
              this.field_xb.field_qb = (this.field_G + -this.field_xb.field_H.b(this.field_xb.field_r)) / 2;
              this.field_xb.field_G = -this.field_xb.field_qb + this.field_G;
              if (this.field_Ab == null) {
                break L1;
              } else {
                if (this.field_Ab.field_y != 0) {
                  L2: {
                    stackIn_6_0 = this.field_Ab;

                    if (this.field_Ab.field_cb) {
                      stackIn_7_0 = (ta) ((Object) stackIn_6_0);
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = (ta) ((Object) stackIn_6_0);
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_cb = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= rh.field_n) {
                break L0;
              } else {
                if (null != this.field_yb[var3]) {
                  L4: {
                    stackIn_14_0 = this.field_yb[var3];

                    if (-1 <= (this.field_vb.length() ^ -1)) {
                      stackIn_15_0 = (jea) ((Object) stackIn_14_0);
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = (jea) ((Object) stackIn_14_0);
                      stackIn_15_1 = 1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_X = stackIn_15_1 != 0;
                  if (this.field_yb[var3].field_X) {
                    if (this.field_yb[var3].field_y != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          }
        }
        if (param0 == (this.field_Fb.field_y ^ -1)) {
          L5: {
            if (!param1) {
              break L5;
            } else {
              if (-1 == (hf.field_b ^ -1)) {
                break L5;
              } else {
                if (this.field_y != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return this.field_Gb;
        } else {
          return -1;
        }
    }

    static {
        field_Eb = new ur(2);
        field_Cb = false;
    }
}
