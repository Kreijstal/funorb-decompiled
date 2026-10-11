/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends o {
    int field_j;
    static int field_o;
    int field_y;
    int field_q;
    boolean field_p;
    boolean field_l;
    jd field_u;
    rh field_h;
    int field_m;
    int field_i;
    private int field_w;
    static String field_s;
    int field_k;
    md field_g;
    gb field_r;
    md field_n;
    int field_x;
    int field_t;
    int field_v;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, byte param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 >= 0 &&
            re.field_f > param15) {
            if (0 > param4 &&
              param8 < 0 &&
              param10 < 0) {
              return;
            }
            if (param4 >= re.field_b &&
              param8 >= re.field_b &&
              re.field_b <= param10) {
              return;
            }
            var34 = -param15 + param0;
            if (param15 != param14) {
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var22 = param12 << 16;
              var21 = param12 << 16;
              var30 = param7 << 16;
              var29 = param7 << 16;
              var26 = param2 << 16;
              var25 = param2 << 16;
              var35 = -param15 + param14;
              var19 = (-param4 + param8 << 16) / var35;
              var20 = (-param4 + param10 << 16) / var34;
              if (var19 >= var20) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (param6 - param7 << 16) / var35;
                var24 = (param3 - param12 << 16) / var35;
                var31 = (param1 - param7 << 16) / var34;
                var33 = 1;
                var27 = (-param2 + param9 << 16) / var34;
                var28 = (param11 - param2 << 16) / var35;
                var23 = (param13 - param12 << 16) / var34;
              } else {
                var23 = (-param12 + param3 << 16) / var35;
                var27 = (param11 - param2 << 16) / var35;
                var28 = (param9 - param2 << 16) / var34;
                var31 = (-param7 + param6 << 16) / var35;
                var32 = (-param7 + param1 << 16) / var34;
                var33 = 0;
                var24 = (param13 - param12 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param14 < 0) {
                  param15 = param14 - param15;
                  var21 = var21 + var23 * param15;
                  var29 = var29 + param15 * var31;
                  var26 = var26 + var28 * param15;
                  var30 = var30 + param15 * var32;
                  var22 = var22 + var24 * param15;
                  var18 = var18 + var20 * param15;
                  var17_int = var17_int + var19 * param15;
                  var25 = var25 + var27 * param15;
                  param15 = param14;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var18 = var18 + var20 * param15;
                  var22 = var22 + param15 * var24;
                  var30 = var30 + var32 * param15;
                  var26 = var26 + param15 * var28;
                  var29 = var29 + param15 * var31;
                  var21 = var21 + param15 * var23;
                  var25 = var25 + param15 * var27;
                  var17_int = var17_int + var19 * param15;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = re.field_i[param15];
                while (param14 > param15) {
                  var37 = var17_int >> 16;
                  if (var37 < re.field_b) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        re.field_b > var37) {
                        s.a((byte) 118, var21, var29, param5, 0, 0, var38, var37 + var36Lifetime2, 0, var25);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (re.field_b <= var38 + var37) {
                        var38 = -var37 + re.field_b - 1;
                      }
                      if (0 > var37) {
                        s.a((byte) 118, var21 - var37 * var39, -(var41 * var37) + var29, param5, var41, var40, var37 + var38, var36Lifetime2, var39, var25 - var40 * var37);
                      } else {
                        s.a((byte) 118, var21, var29, param5, var41, var40, var38, var37 + var36Lifetime2, var39, var25);
                      }
                    }
                  }
                  param15++;
                  if (re.field_f <= param15) {
                    return;
                  }
                  var25 = var25 + var27;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + vp.field_i;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = param0 - param14;
              if (0 == var36Lifetime3) {
                var27 = 0;
                var23 = 0;
                var31 = 0;
                var32 = 0;
                var20 = 0;
                var28 = 0;
                var19 = 0;
                var24 = 0;
              } else {
                var37Lifetime2 = param10 << 16;
                var38Lifetime2 = param13 << 16;
                var39Lifetime2 = param9 << 16;
                if (var33 == 0) {
                  var25 = param11 << 16;
                  var29 = param6 << 16;
                  var21 = param3 << 16;
                  var17_int = param8 << 16;
                } else {
                  var26 = param11 << 16;
                  var30 = param6 << 16;
                  var18 = param8 << 16;
                  var22 = param3 << 16;
                }
                var40Lifetime2 = param1 << 16;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              }
            } else {
              if (param15 != param0) {
                var35 = param0 - param14;
                if (param8 <= param4) {
                  var31 = (-param6 + param1 << 16) / var35;
                  var17_int = param8 << 16;
                  var29 = param6 << 16;
                  var22 = param12 << 16;
                  var30 = param7 << 16;
                  var25 = param11 << 16;
                  var20 = (-param4 + param10 << 16) / var34;
                  var23 = (-param3 + param13 << 16) / var35;
                  var18 = param4 << 16;
                  var26 = param2 << 16;
                  var19 = (-param8 + param10 << 16) / var35;
                  var28 = (-param2 + param9 << 16) / var34;
                  var27 = (param9 - param11 << 16) / var35;
                  var21 = param3 << 16;
                  var32 = (param1 - param7 << 16) / var34;
                  var24 = (param13 - param12 << 16) / var34;
                } else {
                  var28 = (-param11 + param9 << 16) / var35;
                  var21 = param12 << 16;
                  var24 = (-param3 + param13 << 16) / var35;
                  var26 = param11 << 16;
                  var29 = param7 << 16;
                  var22 = param3 << 16;
                  var32 = (param1 - param6 << 16) / var35;
                  var31 = (param1 - param7 << 16) / var34;
                  var19 = (-param4 + param10 << 16) / var34;
                  var25 = param2 << 16;
                  var23 = (-param12 + param13 << 16) / var34;
                  var17_int = param4 << 16;
                  var20 = (param10 - param8 << 16) / var35;
                  var18 = param8 << 16;
                  var30 = param6 << 16;
                  var27 = (param9 - param2 << 16) / var34;
                }
              } else {
                var28 = 0;
                var20 = 0;
                var21 = param12;
                var18 = param8 << 16;
                var22 = param3;
                var31 = 0;
                var25 = param2;
                var24 = 0;
                var19 = 0;
                var23 = 0;
                var17_int = param4 << 16;
                var29 = param7;
                var32 = 0;
                var26 = param11;
                var27 = 0;
                var30 = param6;
              }
              var33 = 0;
              if (param15 < 0) {
                param15 = Math.min(-param15, param14 - param15);
                var26 = var26 + var28 * param15;
                var21 = var21 + var23 * param15;
                var18 = var18 + var20 * param15;
                var30 = var30 + param15 * var32;
                var22 = var22 + var24 * param15;
                var25 = var25 + var27 * param15;
                var29 = var29 + param15 * var31;
                var17_int = var17_int + param15 * var19;
                param15 = 0;
              }
            }
            if (param16 > -8) {
              field_o = 50;
            }
            if (param15 < 0) {
              param15 = -param15;
              var21 = var21 + var23 * param15;
              var18 = var18 + var20 * param15;
              var25 = var25 + param15 * var27;
              var29 = var29 + var31 * param15;
              var30 = var30 + var32 * param15;
              var26 = var26 + var28 * param15;
              var22 = var22 + param15 * var24;
              var17_int = var17_int + param15 * var19;
              param15 = 0;
            }
            var35Lifetime1 = re.field_i[param15];
            while (param15 < param0) {
              var36Lifetime1 = var17_int >> 16;
              if (re.field_b > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 != var37Lifetime1) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (re.field_b <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = -1 - var36Lifetime1 + re.field_b;
                  }
                  if (var36Lifetime1 < 0) {
                    s.a((byte) 118, -(var38Lifetime1 * var36Lifetime1) + var21, var29 - var40Lifetime1 * var36Lifetime1, param5, var40Lifetime1, var39Lifetime1, var36Lifetime1 + var37Lifetime1, var35Lifetime1, var38Lifetime1, var25 - var36Lifetime1 * var39Lifetime1);
                  } else {
                    s.a((byte) 118, var21, var29, param5, var40Lifetime1, var39Lifetime1, var37Lifetime1, var36Lifetime1 + var35Lifetime1, var38Lifetime1, var25);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < re.field_b) {
                    s.a((byte) 118, var21, var29, param5, 0, 0, var37Lifetime1, var36Lifetime1 + var35Lifetime1, 0, var25);
                  }
                }
              }
              param15++;
              if (re.field_f <= param15) {
                return;
              }
              var21 = var21 + var23;
              var18 = var18 + var20;
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var30 = var30 + var32;
              var35Lifetime1 = var35Lifetime1 + vp.field_i;
              var29 = var29 + var31;
              var26 = var26 + var28;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_81_0 = var17;
          stackIn_81_1 = new StringBuilder().append("md.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    private final void a(byte param0, kc param1, gb param2) {
        try {
          this.field_d.a(param1, true);
          if (param0 < 56) {
            this.field_w = 43;
          }
          this.field_r = param2;
          this.field_j = 0;
          this.field_y = this.field_r.field_d;
          this.field_k = this.field_r.field_e;
          this.field_l = false;
          this.field_t = 92;
          this.field_u = qo.field_e;
          this.field_b = this.field_r.field_i;
          this.field_e = (double)qq.a(20, 256);
          this.field_g = null;
          this.field_q = 0;
          this.field_i = 0;
          this.field_n = null;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "md.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    md(kc param0, gb param1) {
        super(param0);
        this.field_p = false;
        this.field_g = null;
        this.field_n = null;
        this.field_m = 0;
        this.field_v = -1;
        this.field_x = 0;
        try {
          this.a((byte) 86, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, hc param2, int param3, mg param4, int param5, int param6, int param7, int param8, hc param9, byte param10, mg param11, int param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          sn.a(param9, param7, 24097, param2);
          hh.a(param6, param18, -92, param20, param5);
          mb.a(param8, param15, (byte) 121);
          var21_int = -4 / ((46 - param10) / 53);
          ef.a(119, param17, param4, param16, param13, param0);
          uc.a(param11, 25345, param3, param19);
          ql.a(param12, 2048, param14, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("md.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void a(int param0, byte param1, md param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        jd stackIn_16_1 = null;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14_int = 0;
        double var14 = 0.0;
        int var16 = 0;
        int var13Lifetime1;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (qo.field_e != this.field_u &&
            param2 != null) {
            if (param2.field_b * 4.0 < (double)param0) {
              param0 = 4 * (int)param2.field_b;
            }
            if (this.field_r != ro.field_u) {
              if (this.field_j < 150) {
                stackIn_16_1 = ht.field_i;
              } else {
                stackIn_16_1 = pd.field_a;
              }
              this.field_u = stackIn_16_1;
            } else {
              if (pd.field_a != this.field_u) {
                this.field_u = ht.field_i;
              } else {
                fieldTemp$0 = this.field_w + 1;
                this.field_w = this.field_w + 1;
                if (0 <= fieldTemp$0) {
                  this.field_u = ht.field_i;
                }
              }
            }
            var4_int = 15 * param0 - 128;
            if (this.field_r == ro.field_u) {
              var4_int = 0;
            }
            param2.b((double)var4_int, 128);
            this.b(20.0, param1 ^ 203);
            var5 = lc.a(this.field_d, false, param2.field_d);
            this.b(-20.0, 128);
            this.a(-10.0, (byte) 25);
            this.b(20.0, 128);
            var7 = lc.a(this.field_d, false, param2.field_d);
            this.b(-20.0, param1 ^ 203);
            this.a(20.0, (byte) 25);
            this.b(20.0, param1 + 53);
            var9 = lc.a(this.field_d, false, param2.field_d);
            this.b(-20.0, param1 + 53);
            this.a(-10.0, (byte) 25);
            var11 = this.field_r.field_g;
            var13 = 0;
            if (pd.field_a == this.field_u) {
              if (var7 > var9) {
                stackIn_38_0 = (!(var7 > var5)) ? 0 : -1;
                var13Lifetime1 = stackIn_38_0;
              } else {
                stackIn_34_0 = (!(var5 < var9)) ? 0 : 1;
                var13Lifetime1 = stackIn_34_0;
              }
            } else {
              if (var9 > var7) {
                stackIn_29_0 = (!(var7 < var5)) ? 0 : -1;
                var13Lifetime1 = stackIn_29_0;
              } else {
                stackIn_25_0 = (!(var9 < var5)) ? 0 : 1;
                var13Lifetime1 = stackIn_25_0;
              }
            }
            this.a((double)var13Lifetime1 * var11, (byte) 25);
            if (param1 != 75) {
              return;
            }
            if (this.field_r != ro.field_u) {
              var14_int = var13Lifetime1;
              if (var14_int != 1) {
                if (var14_int == -1) {
                  this.field_i = this.field_i - 2;
                  if (-16 > this.field_i) {
                    this.field_i = -16;
                  }
                }
              } else {
                this.field_i = this.field_i + 2;
                if (this.field_i > 16) {
                  this.field_i = 16;
                }
              }
            }
            param2.b((double)(-var4_int), 128);
            if (uh.a(param1 + 30, param2.field_d, 500.0, this.field_d)) {
              if (100 <= this.field_j) {
                return;
              }
              if (ro.field_u == this.field_r) {
                kp.field_a.a(10.0, (double)this.field_f + this.field_e, 121);
                rc.field_d.a(this.field_d, true);
                rc.field_d.a(param2.field_d, param1 ^ -30562);
                var14 = kp.field_a.a(rc.field_d, (byte) -118) / rc.field_d.a((byte) -74);
                if (9.5 < var14) {
                  this.field_l = true;
                  this.field_w = 0;
                  if (pd.field_a != this.field_u) {
                    return;
                  }
                  this.field_u = ht.field_i;
                  return;
                }
                fieldTemp$1 = this.field_w + 1;
                this.field_w = this.field_w + 1;
                if (fieldTemp$1 < 150) {
                  return;
                }
                this.field_u = pd.field_a;
                this.field_w = 150;
                return;
              }
              if (0 != var13Lifetime1) {
                return;
              }
              this.field_l = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_s = null;
        if (param0 != 20) {
          field_s = (String) null;
        }
    }

    static {
        field_s = "Go Back";
    }
}
