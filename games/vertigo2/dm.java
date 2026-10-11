/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends cr {
    cr field_Hb;
    static String field_Jb;
    static String field_Ib;
    cr field_Kb;
    cr field_Mb;
    od field_Lb;

    public static void l(int param0) {
        if (param0 != -1) {
          dm.a(-82, 7, -96, 101, -2, -78);
        }
        field_Jb = null;
        field_Ib = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_wb = param5;
        this.field_db = param0;
        this.field_N = param7;
        if (param4 != 1) {
          field_Jb = (String) null;
        }
        this.field_Fb = param2;
        this.a(param6, true, param3, param1);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = (param2 + this.field_Fb) / 2;
        int var6 = this.field_db - param3;
        this.field_Lb.a(0, param2, param0, var6 - param2, 0, this.field_Fb, 3124);
        this.field_Hb.field_wb = 0;
        this.field_Hb.field_N = var6;
        this.field_Hb.field_Fb = var5 - param2;
        if (!param1) {
          dm.l(-112);
        }
        this.field_Hb.field_db = param3;
        this.field_Kb.field_Fb = -var5 + this.field_Fb;
        this.field_Kb.field_N = var6;
        this.field_Kb.field_db = param3;
        this.field_Kb.field_wb = var5;
    }

    dm(long param0, dm param1, String param2, String param3) {
        this(param0, param1, param1.field_Lb.field_Lb, param1.field_Lb.field_Hb, param1.field_Hb, param2, param3);
    }

    final static void k(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        s var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        vi var6_ref_vi = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        mi var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 0) {
            dm.a(-79, 39, -11, -30);
          }
          var27 = id.field_f;
          var2 = var27.h(-11);
          if (var2 == 0) {
            var3 = var27.a((byte) -11);
            var4 = (s) (wg.field_i.a((byte) 100));
            while (var4 != null) {
              if (var4.field_p != var3) {
                var4 = (s) (wg.field_i.b(param0 + 110));
                continue;
              }
              break;
            }
            if (var4 == null) {
              rm.b((byte) 122);
              return;
            }
            var5 = var27.h(-11);
            if (var5 != 0) {
              var6 = var4.field_q;
              rk.field_w[0].field_m = false;
              var7 = var4.field_o;
              rk.field_w[0].field_i = null;
              rk.field_w[0].field_l = qe.field_V;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                rk.field_w[var8_int].field_l = var27.f(param0 + 128);
                rk.field_w[var8_int].field_m = false;
                if (var27.h(-11) != 1) {
                  rk.field_w[var8_int].field_i = null;
                } else {
                  rk.field_w[var8_int].field_i = var27.f(128);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_x = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_w = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_n = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.h(-11);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.h(-11);
                  var21 = rk.field_w[var20].field_l;
                  var22 = var27.i(param0 ^ -31016);
                  var24 = var27.field_u;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = rk.field_w[var20].field_i;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.b(true);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    wc.a(var21, true)) {
                    var8[1][var13] = qe.field_V;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var27.field_u = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.b(true);
                    }
                  }
                  if (var6 > var14 &&
                    !rk.field_w[var20].field_m) {
                    rk.field_w[var20].field_m = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = rk.field_w[var20].field_i;
                    var10[2][var14] = var22;
                    var27.field_u = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.b(true);
                    }
                  }
                }
              }
            }
            var4.field_s = true;
            var4.c(param0 ^ 2);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.a((byte) -11);
            var4_long = var27.i(-31016);
            var6_ref_vi = (vi) (mc.field_i.a((byte) 100));
            while (var6_ref_vi != null) {
              if (var3Lifetime1 != var6_ref_vi.field_u) {
                var6_ref_vi = (vi) (mc.field_i.b(param0 + 62));
                continue;
              }
              break;
            }
            if (var6_ref_vi == null) {
              rm.b((byte) 107);
              return;
            }
            var6_ref_vi.field_r = var4_long;
            var6_ref_vi.c(param0 ^ 2);
            return;
          }
          ke.a((Throwable) null, "HS1: " + or.a(param0 + 121), 0);
          rm.b((byte) 5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "dm.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 <= cj.field_D &&
            param5 >= ua.field_e) {
            if (param1 < ap.field_e) {
              var6_int = 0;
              param1 = ap.field_e;
            } else {
              if (ib.field_a >= param1) {
                var6_int = 1;
              } else {
                param1 = ib.field_a;
                var6_int = 0;
              }
            }
            if (ap.field_e <= param3) {
              if (param3 > ib.field_a) {
                param3 = ib.field_a;
                var7 = 0;
              } else {
                var7 = 1;
              }
            } else {
              var7 = 0;
              param3 = ap.field_e;
            }
            if (ua.field_e <= param2) {
              incrementValue$0 = param2;
              param2++;
              ki.a(-93, param1, vl.field_e[incrementValue$0], param3, param4);
            } else {
              param2 = ua.field_e;
            }
            if (param5 <= cj.field_D) {
              incrementValue$1 = param5;
              param5--;
              ki.a(-116, param1, vl.field_e[incrementValue$1], param3, param4);
            } else {
              param5 = cj.field_D;
            }
            if (var6_int != 0 &&
              var7 != 0) {
              for (var8 = param2; var8 <= param5; var8++) {
                var12 = vl.field_e[var8];
                var11 = var12;
                var9 = var11;
                var12[param3] = param4;
                var9[param1] = param4;
              }
            } else {
              if (var6_int != 0) {
                for (var8 = param2; var8 <= param5; var8++) {
                  vl.field_e[var8][param1] = param4;
                }
              } else {
                if (var7 != 0) {
                  for (var8 = param2; var8 <= param5; var8++) {
                    vl.field_e[var8][param3] = param4;
                  }
                }
              }
            }
          }
          if (param0 != 0) {
            dm.l(-21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "dm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(param2 + (param3 + param0) > bi.field_j)) {
          return param0 + param3;
        }
        if (-param2 + param3 >= param1) {
          return param3 - param2;
        }
        return bi.field_j - param2;
    }

    dm(long param0, cr param1, cr param2, ie param3, cr param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Mb = new cr(0L, (cr) null);
          this.field_Lb = new od(0L, this.field_Mb, param2, param3);
          this.field_Hb = new cr(0L, param4);
          this.field_Kb = new cr(0L, param4);
          this.field_Hb.field_S = param5;
          this.field_Kb.field_S = param6;
          this.b(this.field_Lb, 121);
          this.b(this.field_Hb, 118);
          this.b(this.field_Kb, 126);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "dm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Ib = "Ignore";
        field_Jb = "Offer draw";
    }
}
