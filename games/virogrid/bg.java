/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends km {
    private km field_Kb;
    private km[] field_Hb;
    private int field_Nb;
    private StringBuilder field_Ib;
    private km field_Qb;
    private km field_Eb;
    long field_Mb;
    private en field_Jb;
    static String field_Pb;
    private km field_Ob;
    private km field_Fb;
    static ml field_Lb;
    private km field_Gb;

    public static void g(int param0) {
        field_Lb = null;
        field_Pb = null;
        if (param0 != 0) {
            field_Pb = (String) null;
        }
    }

    private final int a(km param0, km param1, int param2, int param3, int param4) {
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
            param3 += 8;
            var6_int = param1.field_C.a(param1.field_V, -(2 * param1.field_z) + param4, param1.field_fb);
            param1.a(0, var6_int, param4, (byte) -66, param3);
            param3 = param3 + (var6_int - 0);
            if (param2 >= 37) {
              param0.a(0, param1);
              stackIn_4_0 = param3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 122;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("bg.C(");

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
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    bg(int param0, int param1, int param2, int param3, int param4, km param5, km param6, km param7, km param8, en param9, km param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        en stackIn_6_1;
        en stackIn_6_2;
        long stackIn_6_3;
        en stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        en stackIn_8_1;
        en stackIn_8_2;
        long stackIn_8_3;
        en stackIn_8_4;
        String stackIn_8_5;
        km stackIn_14_0 = null;
        km stackIn_15_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        km[] var15 = null;
        RuntimeException var15_ref = null;
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
        km[] var28 = null;
        this.field_Nb = -2;
        try {
          L0: {
            L1: {
              this.field_Mb = param12;
              this.field_Ob = new km(0L, param6, we.field_i.toUpperCase());
              this.field_Ob.field_lb = 1;
              this.a(0, this.field_Ob);
              this.field_Qb = new km(0L, param7);
              this.field_Ob.a(0, this.field_Qb);
              this.field_Gb = new km(0L, (km) null);
              this.a(0, this.field_Gb);
              if (param11 == null) {
                this.field_Fb = new km(0L, param8, ji.field_a);
                this.field_Fb.field_E = 11184810;
                this.field_Fb.field_lb = 1;
                this.field_Gb.a(0, this.field_Fb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Fb.field_C.b(this.field_Fb.field_V, var15_int);
                this.field_Fb.a(13, pg.field_e * var17, var15_int, (byte) -78, var16);
                var16 = var16 + var17 * pg.field_e;
                this.field_Gb.a(0, var16 + 10, 13 + (13 - -var15_int), (byte) -45, 24);
                this.field_Gb.field_vb = ne.a(this.field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
                var18 = var15_int + 26;
                var19 = var16 + 34;
                var20 = sh.b(0, param2, param0, var18);
                var21 = p.a(-1, var19, param1, param3);
                this.a(var20, var19, var18, (byte) -104, var21);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Fb = new km(0L, param8, qa.field_f);
                    this.field_Fb.field_lb = 1;
                    this.field_Fb.field_E = 11184810;
                    this.field_Gb.a(0, this.field_Fb);
                    this.field_Eb = new km(0L, param8, jf.field_l);
                    this.field_Eb.field_lb = 1;
                    this.field_Eb.field_E = 11184810;
                    this.field_Gb.a(0, this.field_Eb);
                    this.field_Kb = new km(0L, param8);
                    this.field_Kb.field_E = 16764006;
                    this.field_Gb.a(0, this.field_Kb);
                    this.field_Kb.field_eb = "|";
                    if (og.field_s >= 5) {
                      break L3;
                    } else {
                      if (hd.field_d < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_6_0 = this;

                      stackIn_6_1 = null;

                      stackIn_6_2 = null;

                      stackIn_6_3 = 0L;

                      stackIn_6_4 = (en) (param9);

                      if (-8 >= (og.field_s ^ -1)) {
                        break L5;
                      } else {
                        stackIn_7_0 = this;
                        stackIn_6_0 = stackIn_7_0;

                        if ((hd.field_d ^ -1) > -3) {
                          stackIn_8_0 = this;
                          stackIn_8_1 = null;
                          stackIn_8_2 = null;
                          stackIn_8_3 = stackIn_6_3;
                          stackIn_8_4 = (en) ((Object) stackIn_6_4);
                          stackIn_8_5 = ai.field_i;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_3 = stackIn_6_3;
                    stackIn_8_4 = (en) ((Object) stackIn_6_4);
                    stackIn_8_5 = ne.field_d;
                    break L4;
                  }
                  ((bg) (this)).field_Jb = new en(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_Gb.a(0, this.field_Jb);
                  break L2;
                }
                var28 = new km[3];
                var15 = var28;
                var28[0] = new km(0L, (km) null);
                this.field_Gb.a(0, var28[0]);
                var28[1] = new km(0L, (km) null);
                this.field_Gb.a(0, var28[1]);
                var28[2] = new km(0L, (km) null);
                this.field_Gb.a(0, var28[2]);
                this.field_Hb = new km[ad.field_c];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= ad.field_c) {
                    L7: {
                      this.field_Ib = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$0 = this.field_Ib.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_C.a(jg.field_c);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_C.a(hn.field_s);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_C.a(gd.field_p);
                      if (var16 >= var17) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= ad.field_c) {
                        L12: {
                          if (140 >= var16) {
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
                          var18 = this.a(var18, -61, var28[0], var16, jg.field_c, param6);
                          var18 = this.a(var28[0], this.field_Hb[6], 99, var18, var16);
                          var18 = this.a(var28[0], this.field_Hb[9], 108, var18, var16);
                          var18 = this.a(var28[0], this.field_Hb[5], 124, var18, var16);
                          var18 = this.a(var28[0], this.field_Hb[7], 56, var18, var16);
                          var18 = this.a(var28[0], this.field_Hb[15], 92, var18, var16);
                          var18 = this.a(var28[0], this.field_Hb[4], 45, var18, var16);
                          if (var17 >= var18) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(var18, -40, var28[1], var16, hn.field_s, param6);
                          var18 = this.a(var28[1], this.field_Hb[16], 69, var18, var16);
                          var18 = this.a(var28[1], this.field_Hb[17], 41, var18, var16);
                          var18 = this.a(var28[1], this.field_Hb[18], 58, var18, var16);
                          var18 = this.a(var28[1], this.field_Hb[19], 81, var18, var16);
                          var18 = this.a(var28[1], this.field_Hb[20], 102, var18, var16);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(var18, -97, var28[2], var16, gd.field_p, param6);
                          var18 = this.a(var28[2], this.field_Hb[13], 56, var18, var16);
                          var18 = this.a(var28[2], this.field_Hb[21], 71, var18, var16);
                          var18 = this.a(var28[2], this.field_Hb[11], 65, var18, var16);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 3 * var16 + 26;
                          var20 = this.field_Ob.c((byte) 40);
                          if (var20 <= var19) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_Jb) {
                            break L17;
                          } else {
                            var20 = this.field_Jb.a((byte) -126, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Ob.a(0, 24, var19 + 26, (byte) -117, 0);
                          this.field_Qb.a(this.field_Ob.field_K - 20, 15, 15, (byte) -119, 5);
                          var21 = 10;
                          this.field_Fb.a(13, pg.field_e * 2, var19, (byte) -110, var21);
                          var21 = var21 + 2 * pg.field_e;
                          this.field_Eb.a(13, pg.field_e * 2, var19, (byte) -41, var21);
                          var21 = var21 + (10 + 2 * pg.field_e);
                          this.field_Kb.a(0, pg.field_e, 0, (byte) -83, var21);
                          var21 = var21 + (pg.field_e + 10);
                          if (this.field_Jb == null) {
                            break L18;
                          } else {
                            var20 = this.field_Jb.a((byte) -128, 4);
                            this.field_Jb.a(var20, 4, 13 - -((var19 - var20) / 2), (byte) -127, pg.field_e, var21);
                            var21 = var21 + (10 + pg.field_e);
                            break L18;
                          }
                        }
                        var28[0].a(13, var17, var16, (byte) -95, var21);
                        var28[1].a(26 + var16, var17, var16, (byte) -108, var21);
                        var28[2].a(39 - -(var16 * 2), var17, var16, (byte) -60, var21);
                        var22 = var21;
                        this.field_Gb.a(0, var22 - (-var17 - 10), 13 + (var19 + 13), (byte) -92, 24);
                        this.field_Gb.field_vb = ne.a(this.field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
                        var23 = var19 + 26;
                        var24 = var22 + 24 + var17 - -10;
                        var25 = sh.b(0, param2, param0, var23);
                        var26 = p.a(-1, var24, param1, param3);
                        this.a(var25, var24, var23, (byte) -124, var26);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Hb[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Hb[var17].c((byte) 33);
                            if (var16 >= var18) {
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
                      if (null == se.field_f[var16]) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Hb[var16] = new km(0L, param10, se.field_f[var16]);
                          this.field_Hb[var16].field_lb = 0;
                          stackIn_14_0 = this.field_Hb[var16];

                          if (param11 == null) {
                            stackIn_15_0 = (km) ((Object) stackIn_14_0);
                            stackIn_15_1 = 0;
                            break L21;
                          } else {
                            stackIn_15_0 = (km) ((Object) stackIn_14_0);
                            stackIn_15_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_Y = stackIn_15_1 != 0;
                        this.field_Gb.a(0, this.field_Hb[var16]);
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

            stackIn_51_1 = new StringBuilder().append("bg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final static boolean f(byte param0) {
        int var1;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var1 = -82 / ((45 - param0) / 61);
            if (oj.field_Ub == null) {
              break L1;
            } else {
              if (!ug.field_a.a(false)) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 140) {
            break L0;
          } else {
            this.field_Gb = (km) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Jb == null) {
              break L2;
            } else {
              if (!this.field_Jb.field_xb) {
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

    final boolean d(boolean param0) {
        if (param0) {
            bg.g(-40);
        }
        if (!((this.field_Nb ^ -1) == 1)) {
            return false;
        }
        if (-14 == (um.field_Gb ^ -1)) {
            this.field_Nb = -1;
            return true;
        }
        return true;
    }

    final String e(byte param0) {
        if (param0 != -72) {
            return (String) null;
        }
        return this.field_Ib.toString();
    }

    final int a(int param0, boolean param1) {
        en stackIn_6_0 = null;
        en stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        km stackIn_14_0 = null;
        km stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          this.a(param1, (byte) 119);
          if (null != this.field_Kb) {
            L1: {
              this.field_Kb.field_V = this.field_Ib.toString();
              this.field_Kb.field_tb = (this.field_K - this.field_Kb.field_C.a(this.field_Kb.field_V)) / 2;
              if (this.field_Jb == null) {
                break L1;
              } else {
                if (0 == this.field_Jb.field_nb) {
                  break L1;
                } else {
                  L2: {
                    stackIn_6_0 = this.field_Jb;

                    if (this.field_Jb.field_xb) {
                      stackIn_7_0 = (en) ((Object) stackIn_6_0);
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = (en) ((Object) stackIn_6_0);
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_xb = stackIn_7_1 != 0;
                  break L1;
                }
              }
            }
            this.field_Kb.field_K = -this.field_Kb.field_tb + this.field_K;
            var3 = 0;
            L3: while (true) {
              if (var3 >= ad.field_c) {
                break L0;
              } else {
                if (null != this.field_Hb[var3]) {
                  L4: {
                    stackIn_14_0 = this.field_Hb[var3];

                    if (this.field_Ib.length() <= 0) {
                      stackIn_15_0 = (km) ((Object) stackIn_14_0);
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = (km) ((Object) stackIn_14_0);
                      stackIn_15_1 = 1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_Y = stackIn_15_1 != 0;
                  if (this.field_Hb[var3].field_Y) {
                    if (-1 != (this.field_Hb[var3].field_nb ^ -1)) {
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
          } else {
            break L0;
          }
        }
        if (this.field_Qb.field_nb == 0) {
          if (param0 == 2105376) {
            L5: {
              if (!param1) {
                break L5;
              } else {
                if (0 == oi.field_g) {
                  break L5;
                } else {
                  if (this.field_nb == 0) {
                    return -1;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return this.field_Nb;
          } else {
            return 9;
          }
        } else {
          return -1;
        }
    }

    private final int a(int param0, int param1, km param2, int param3, String param4, km param5) {
        int discarded$1 = 0;
        km var7 = null;
        RuntimeException var7_ref = null;
        km var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new km(0L, param5, 0, param0, param3, 24, param4);
              param0 += 32;
              if (param1 < -10) {
                break L1;
              } else {
                var8 = (km) null;
                discarded$1 = this.a((km) null, (km) null, -49, 28, 48);
                break L1;
              }
            }
            param2.a(0, var7);
            stackIn_3_0 = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("bg.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Pb = "Suggested names: ";
    }
}
