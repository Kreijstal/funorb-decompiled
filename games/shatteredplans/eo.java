/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends jl {
    static String field_ib;
    private String field_gb;
    static String field_X;
    private boolean field_jb;
    static ih field_Z;
    private String field_eb;
    private boolean field_db;
    private md field_bb;
    static String field_hb;
    static String field_kb;
    static ob field_cb;
    static pf field_ab;
    static int field_Y;
    static int[] field_fb;

    final void p(int param0) {
        this.field_db = true;
        if (param0 != 8305) {
          field_X = (String) null;
        }
        this.field_bb.field_L = false;
    }

    eo(tc param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_gb = param1;
          if (this.field_gb != null) {
            var3_int = sl.field_p.c(this.field_gb, 260, sl.field_p.field_J);
            this.b(150 + var3_int, 300, (byte) -122);
          }
          this.field_bb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_bb.field_L = true;
          this.field_db = false;
          this.field_jb = false;
          this.b((byte) -73, this.field_bb);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 7433) {
          field_Z = (ih) null;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var56 = 0;
        int var57 = 0;
        double stackIn_26_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        double var45 = 0.0;
        double var47 = 0.0;
        double var49 = 0.0;
        double var51 = 0.0;
        double var53 = 0.0;
        int var55 = 0;
        int var58 = 0;
        var58 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7_double = Math.sqrt((double)((param5 - param6) * (param5 - param6) + (param2 - param1) * (param2 - param1)));
          var9 = (double)(param5 - param6) / var7_double;
          var11 = (double)(-param1 + param2) / var7_double;
          if (param5 > param6) {
            var13 = param6;
            var14 = param5;
          } else {
            var14 = param6;
            var13 = param5;
          }
          if (param2 <= param1) {
            var16 = param1;
            var15 = param2;
          } else {
            var16 = param2;
            var15 = param1;
          }
          if (!(0.0 < var9)) {
            var16 += 4;
            var15 = (int)((double)var15 + (var7_double * var9 / 10.0 - 5.0));
          } else {
            var15 -= 4;
            var16 = (int)((double)var16 + (4.0 + var9 * var7_double / 10.0));
          }
          if (!(var11 > 0.0)) {
            var14 = (int)((double)var14 - (-5.0 + var7_double * var11 / 10.0));
            var13 -= 4;
          } else {
            var14 += 4;
            var13 = (int)((double)var13 - (5.0 + var7_double * var11 / 10.0));
          }
          if (var13 < 0) {
            var13 = 0;
          }
          if (0 > var15) {
            var15 = 0;
          }
          if (var14 > 639) {
            var14 = 639;
          }
          if (var16 > 479) {
            var16 = 479;
          }
          var37 = 1.0 / var7_double;
          var39 = var7_double / 2.0;
          var41 = 1.0 / var39;
          if (var11 == 0.0) {
            stackIn_26_0 = 0.0;
          } else {
            stackIn_26_0 = 1.0 / var11;
          }
          var43 = stackIn_26_0;
          var45 = var7_double / 10.0;
          var47 = (double)(param1 - param2);
          var49 = (double)(-param5 + param6);
          var51 = Math.sqrt(var47 * var47 + var49 * var49);
          var49 = var49 / var51;
          var47 = var47 / var51;
          var55 = -110 % ((param3 - 18) / 50);
          var53 = (var45 + 4.0) / Math.cos(Math.atan(var9 / var11));
          if (0.0 > var53) {
            var53 = -var53;
          }
          for (var56 = 0; var56 < var16 + (1 - var15); var56++) {
            var34 = var15 + (var56 - param1);
            var26 = (double)var34 * var43;
            var28 = (double)param6 + var9 * var26;
            if (var11 < 0.0) {
              var36 = (int)(var28 + var53) + 1 - var13;
              var35 = (int)((double)(-var13) + (var28 - 8.0));
              if (-var13 + (var14 + 1) < var36) {
                var36 = 1 + (var14 - var13);
              }
            } else {
              if (var11 != 0.0) {
                var36 = (int)((double)(-var13) + (8.0 + var28));
                var35 = -var13 + (int)(var28 - var53);
                if (var35 < 0) {
                  var35 = 0;
                }
              } else {
                var36 = 1 + var14 - var13;
                var35 = 0;
              }
            }
            for (var57 = var35; var36 > var57; var57++) {
              var32 = -var28 + (double)(var57 + var13);
              var20 = -(var32 * var49) + var26;
              if (!(0.0 > var20) &&
                !(var20 > var7_double * (double)param4 / 200.0)) {
                if (var7_double / 4.0 > var20) {
                  var18 = 1.0 + var37 * (4.0 * var20 * 3.0);
                } else {
                  var18 = 4.0;
                }
                if (var11 != 0.0) {
                  var24 = var32 * var47;
                } else {
                  var24 = var9 * (double)var34;
                }
                var22 = var45 - (-var39 + var20) * (var20 - var39) * var41 * 0.2;
                var30 = -var22 + var24;
                if (var30 < 0.0) {
                  var30 = -var30;
                }
                if (var30 <= var18) {
                  boolean decompiledSharedTail0 = !(var20 > var7_double);
                  if (!decompiledSharedTail0) {
                    var30 = Math.sqrt((double)((var13 + var57 - param5) * (-param5 + var13 + var57) + (var15 - (-var56 + param2)) * (-param2 + var56 + var15)));
                    decompiledSharedTail0 = (!(var30 > var18));
                  }
                  if (decompiledSharedTail0) {
                    var17 = (int)(160.0 * (var18 - var30) / var18);
                    if (!param0) {
                      gf.c(var13 + var57, var56 + var15, 16777215, var17);
                    } else {
                      gf.a(var57, var56, var17 << 24 | 16777215);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "eo.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1 + 0, param2);
        sl.field_p.c(this.field_eb, (this.field_x >> 1) + param0, param1 + param2, 16777215, -1);
        if (null != this.field_gb) {
          gf.f(20 + param0, param2 + 113, 260, 8421504);
          sl.field_p.a(this.field_gb, param0 + 20, 8 + (param2 + 120), 260, 100, 16777215, -1, 1, 0, sl.field_p.field_J);
        }
    }

    final static void a(nc param0, boolean param1, int param2, nc param3) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7_int = 0;
        float var7 = 0.0f;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_float = -param0.field_h + param3.field_h;
          var5 = param3.field_l - param0.field_l;
          if (param2 != -10000) {
            return;
          }
          var6 = param3.field_s * param0.field_i - param0.field_s * param3.field_i;
          if (var6 != 0.0f) {
            var7 = (-(param3.field_i * var5) + var4_float * param3.field_s) / var6;
            var8 = (var4_float * param0.field_s - var5 * param0.field_i) / var6;
            if (0.0f > var6) {
              if (var7 < param0.field_o) {
                param0.field_k = param3;
                param0.field_o = var7;
              }
              if (var8 > param3.field_j) {
                param3.field_r = param0;
                param3.field_j = var8;
              }
            } else {
              if (param3.field_o > var8) {
                param3.field_k = param0;
                param3.field_o = var8;
              }
              if (var7 > param0.field_j) {
                param0.field_r = param3;
                param0.field_j = var7;
              }
            }
            return;
          }
          if (!param1) {
            return;
          }
          stackIn_10_0 = (!(param0.field_i > 0.0f)) ? 0 : 1;
          var7_int = stackIn_10_0;
          stackIn_13_0 = (!(0.0f < param0.field_s)) ? 0 : 1;
          var8_int = stackIn_13_0;
          stackIn_16_0 = (!(0.0f < param3.field_i)) ? 0 : 1;
          var9 = stackIn_16_0;
          stackIn_19_0 = (!(0.0f < param3.field_s)) ? 0 : 1;
          var10 = stackIn_19_0;
          stackIn_22_0 = (var7_int != 0) ? 0 : 1;
          if (var9 != 0) {
            stackIn_25_1 = 0;
          } else {
            stackIn_25_1 = 1;
          }
          if (stackIn_22_0 == stackIn_25_1 &&
            var10 == var8_int) {
            if (param3.field_i * param3.field_i + param3.field_s * param3.field_s < param0.field_s * param0.field_s + param0.field_i * param0.field_i) {
              param0.field_o = -10000.0f;
              param0.field_j = 10000.0f;
            } else {
              param3.field_j = 10000.0f;
              param3.field_o = -10000.0f;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("eo.WA(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_2_0 = this.field_jb;
          if (param0) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (param0);
            this.field_jb = stackIn_8_1;
            if (this.field_jb) {
              this.field_bb.a(4210752, 8405024, -27855);
              this.field_bb.field_L = true;
            } else {
              this.field_bb.a(4210752, 2113632, -27855);
              if (this.field_db) {
                this.field_bb.field_L = false;
              }
            }
            this.field_eb = param1;
            this.field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
          } else {
            this.field_eb = param1;
            this.field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("eo.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        int var1 = 16 / ((47 - param0) / 37);
        field_X = null;
        field_fb = null;
        field_cb = null;
        field_hb = null;
        field_ib = null;
        field_ab = null;
        field_Z = null;
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, int param4) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 > param4) {
            var5_int = (param4 + param2) / 2;
            var6 = param4;
            var7 = param1[var5_int];
            param1[var5_int] = param1[param2];
            param1[param2] = var7;
            var8 = param0[var5_int];
            param0[var5_int] = param0[param2];
            param0[param2] = var8;
            stackIn_6_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_6_0;
            for (var10 = param4; var10 < param2; var10++) {
              if (param1[var10] < var7 + (var9 & var10)) {
                var11 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6] = var11;
                var12 = param0[var10];
                param0[var10] = param0[var6];
                param0[var6++] = var12;
              }
            }
            param1[param2] = param1[var6];
            param1[var6] = var7;
            param0[param2] = param0[var6];
            param0[var6] = var8;
            eo.a(param0, param1, -1 + var6, true, param4);
            eo.a(param0, param1, param2, true, var6 + 1);
          }
          if (!param3) {
            field_kb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("eo.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void f(boolean param0) {
        if (dp.field_t) {
          jp.g((byte) 118);
        }
        if (param0) {
          field_kb = (String) null;
        }
    }

    static {
        field_X = "Drawn";
        field_hb = "Turn: <%0>";
        field_ib = "Please try again in a few minutes.";
        field_kb = "Pending fleet order";
        field_Z = new ih();
        field_cb = new ob(256);
        field_ab = new pf();
        field_Y = 4;
    }
}
