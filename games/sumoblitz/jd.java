/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ag {
    private int field_e;
    private boolean field_i;
    static ri[] field_h;
    private int field_j;
    private int field_k;
    private vn field_l;
    private int field_g;
    private int field_m;
    private String field_f;

    final void a(byte param0, int param1, vn param2, int param3, String param4, int param5, int param6, int param7) {
        tk stackIn_34_0;
        tk stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        tk stackIn_35_0 = null;
        tk stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        int stackIn_39_0 = 0;
        tk stackIn_39_1 = null;
        int stackIn_40_2 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        tk var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        int var13Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 == param6) {
            param6 = param2.field_F;
          }
          if (param4 == null) {
            this.field_a = null;
            return;
          }
          if (param2 == this.field_l &&
            !this.field_i &&
            this.field_e == param1 &&
            this.field_m == param5 &&
            param6 == this.field_j &&
            param3 == this.field_g &&
            this.field_k == param7 &&
            this.field_f != null &&
            this.field_f.equals(param4)) {
            return;
          }
          this.field_f = param4;
          this.field_j = param6;
          this.field_i = false;
          this.field_g = param3;
          this.field_e = param1;
          this.field_k = param7;
          this.field_l = param2;
          this.field_m = param5;
          var17 = new String[param2.b(param4, param7) + 1];
          var18 = var17;
          var10 = Math.max(1, param2.a(param4, new int[]{param7}, var18));
          if (this.field_m == 3 &&
            var10 == 1) {
            this.field_m = 1;
          }
          var12 = -23 / ((13 - param0) / 59);
          if (this.field_m == 0) {
            var11 = param2.field_s;
          } else {
            if (1 != this.field_m) {
              if (this.field_m != 2) {
                var13 = (this.field_g - var10 * this.field_j) / (var10 + 1);
                if (0 > var13) {
                  var13 = 0;
                }
                this.field_j = this.field_j + var13;
                var11 = param2.field_s + var13;
              } else {
                var11 = -(var10 * this.field_j) + this.field_g - param2.field_I;
              }
            } else {
              var11 = (this.field_g - var10 * this.field_j >> 1) + param2.field_s;
            }
          }
          this.field_a = new tk[var10];
          for (var13Lifetime1 = 0; var10 > var13Lifetime1; var13Lifetime1++) {
            var14 = var17[var13Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = -param2.field_s + var11;
            stackIn_34_3 = param2.field_I + var11;
            if (var14 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var14.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var15 = new tk(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var15.field_b[0] = 0;
            if (var14 != null) {
              var15.field_b[var14.length()] = param2.a(var14);
              stackIn_39_0 = 90;
              stackIn_39_1 = var15;
              if (3 != param1) {
                stackIn_40_2 = 0;
              } else {
                stackIn_40_2 = this.a(-292767736, param7, var14, param2.a(var14));
              }
              kw.$cfr$intArgs$a$62b8cf4125f9(stackIn_39_0, stackIn_39_1, stackIn_40_2, param2, var14);
            }
            var11 = var11 + param6;
            this.field_a[var13Lifetime1] = var15;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, vn param1, int param2, String param3, int param4) {
        tk var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_l == param1 && this.field_i && this.field_e == 1 && null != this.field_f &&
          this.field_f.equals(param3)) {
          return;
        }
        try {
          if (param2 < 73) {
            this.field_k = -104;
          }
          this.field_i = true;
          this.field_l = param1;
          this.field_e = 1;
          var8 = this.a(param0, -106, param1, param3);
          var7 = param1.a(param3);
          var8.field_b[0] = -(var7 >> 1) + param4;
          var8.field_b[param3.length()] = param4 + (var7 >> 1);
          kw.$cfr$intArgs$a$62b8cf4125f9(90, var8, 0, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = gf.a('_', param2, false, "");
          var3 = ji.a(param0, (byte) 117);
          if (param1 <= 29) {
            jd.e(58);
          }
          stackIn_7_0 = (param2.indexOf(param0) != -1) || (-1 != param2.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jd.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          jd.a((lj) null, -59, (lj) null, 54, false, 96, (String) null);
        }
        field_h = null;
    }

    final static String e(int param0) {
        if (param0 <= 71) {
          String var2 = (String) null;
          jd.a((lj) null, 38, (lj) null, -17, false, -119, (String) null);
        }
        if (up.field_d) {
          return null;
        }
        if (fn.field_s > qf.field_a) {
          return null;
        }
        if (!(qf.field_a >= fn.field_s + sb.field_c)) {
          return hp.field_l;
        }
        return null;
    }

    final static void a(tv param0, byte param1, boolean param2) {
        try {
          if (param1 < 54) {
            field_h = (ri[]) null;
          }
          uj.a((byte) -124, 256, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final tk a(int param0, int param1, vn param2, String param3) {
        tk var5 = null;
        RuntimeException var5_ref = null;
        tk var6 = null;
        tk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new tk(-param2.field_s + param0, param2.field_I + param0, param3.length());
          var5 = var6;
          this.field_a = new tk[]{var6};
          if (param1 != -106) {
            this.field_l = (vn) null;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("jd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(lj param0, int param1, lj param2, int param3, boolean param4, int param5, String param6) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        fs stackIn_13_0 = null;
        String stackIn_14_1 = null;
        fs stackIn_16_0 = null;
        String stackIn_17_1 = null;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        tv var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param5 <= 20) {
            var14 = (tv) null;
            jd.a((tv) null, (byte) 63, false);
          }
          var15 = param0.a(true);
          var8 = param2.a(true);
          if (null == qk.field_O &&
            !nd.a((byte) -83, false)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (kw.field_c == gg.field_t) {
            aw.field_j = null;
            as.field_v.field_p = 0;
            if (param6 != null) {
              var9 = 0;
              if (param4) {
                var9 = var9 | 1;
              }
              sd.field_e.field_p = 0;
              sd.field_e.e(48, fd.field_d.nextInt());
              sd.field_e.e(48, fd.field_d.nextInt());
              sd.field_e.b(var15, (byte) -108);
              sd.field_e.b(var8, (byte) -121);
              var17 = (CharSequence) ((Object) param6);
              sd.field_e.b(kh.a(var17, 1457), (byte) -107);
              sd.field_e.b(-69, param3);
              sd.field_e.b((byte) 50, param1);
              sd.field_e.b((byte) 50, var9);
              as.field_v.b((byte) 114, 18);
              as.field_v.field_p = as.field_v.field_p + 2;
              var10 = as.field_v.field_p;
              var11_ref_String = dv.a(-94, ra.c(2));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              as.field_v.a(var11_ref_String, (byte) -115);
              ks.a(gh.field_a, oh.field_c, false, as.field_v, sd.field_e);
              as.field_v.a(0, as.field_v.field_p - var10);
            } else {
              sd.field_e.field_p = 0;
              sd.field_e.e(48, fd.field_d.nextInt());
              sd.field_e.e(48, fd.field_d.nextInt());
              stackIn_13_0 = sd.field_e;
              if (!param0.a(110)) {
                stackIn_14_1 = "";
              } else {
                stackIn_14_1 = var15;
              }
              ((fs) (Object) stackIn_13_0).b(stackIn_14_1, (byte) 120);
              stackIn_16_0 = sd.field_e;
              if (!param2.a(91)) {
                stackIn_17_1 = "";
              } else {
                stackIn_17_1 = var8;
              }
              ((fs) (Object) stackIn_16_0).b(stackIn_17_1, (byte) 101);
              as.field_v.b((byte) 108, 16);
              as.field_v.field_p = as.field_v.field_p + 1;
              var9 = as.field_v.field_p;
              ks.a(gh.field_a, oh.field_c, false, as.field_v, sd.field_e);
              as.field_v.c(as.field_v.field_p - var9, -13745);
            }
            gt.a(0, -1);
            kw.field_c = vf.field_c;
          }
          if (kw.field_c == vf.field_c &&
            ju.b(-1, 1)) {
            var9Lifetime1 = ig.field_a.e(-31302);
            ig.field_a.field_p = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              kw.field_c = oi.field_a;
              mn.field_g = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                bw.a(false, ra.c(2));
                ns.field_c = qk.field_R;
                kk.a((byte) -116);
                sr.field_g = false;
                stackIn_37_0 = var9Lifetime1;
                return stackIn_37_0;
              }
              if (var9Lifetime1 != 99) {
                gu.field_d = -1;
                iw.field_a = var9Lifetime1;
                kw.field_c = fm.field_b;
              } else {
                ju.b(-1, br.b(-105));
                aw.field_j = new Boolean(of.a(ig.field_a, 115));
                ig.field_a.field_p = 0;
              }
            }
          }
          if (oi.field_a == kw.field_c) {
            var9Lifetime2 = 2;
            if (ju.b(-1, var9Lifetime2)) {
              var10Lifetime1 = ig.field_a.a(255);
              ig.field_a.field_p = 0;
              if (ju.b(-1, var10Lifetime1)) {
                var11 = mn.field_g.length;
                for (var12 = 0; var11 > var12; var12++) {
                  mn.field_g[var12] = ig.field_a.g(-105);
                }
                kk.a((byte) -110);
                sr.field_g = false;
                stackIn_48_0 = var11 + 100;
                return stackIn_48_0;
              }
            }
          }
          if (fm.field_b == kw.field_c &&
            lt.a((byte) 119)) {
            if (iw.field_a != 255) {
              ns.field_c = ig.field_a.d(-1);
            } else {
              var9_ref_String = ig.field_a.g((byte) 80);
              if (var9_ref_String != null) {
                jb.a((byte) 97, var9_ref_String, ra.c(2));
              }
            }
            kk.a((byte) -127);
            sr.field_g = false;
            stackIn_57_0 = iw.field_a;
            return stackIn_57_0;
          }
          if (qk.field_O == null) {
            if (sr.field_g) {
              if (30000L < uc.b(26560)) {
                ns.field_c = ar.field_F;
              } else {
                ns.field_c = nd.field_G;
              }
              sr.field_g = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = vp.field_a;
            vp.field_a = nb.field_b;
            sr.field_g = true;
            nb.field_b = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("jd.A(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    public jd() {
    }

    final void a(vn param0, int param1, int param2, String param3, byte param4) {
        if (param3 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_l == param0 &&
          this.field_i &&
          this.field_e == 2 &&
          this.field_f != null &&
          this.field_f.equals(param3)) {
          return;
        }
        this.field_e = 2;
        this.field_l = param0;
        this.field_i = true;
        this.field_f = param3;
        tk var7 = this.a(param1, param4 ^ -39, param0, param3);
        tk var8 = var7;
        if (param4 != 79) {
          return;
        }
        try {
          var8.field_b[0] = param2 - param0.a(param3);
          var7.field_b[param3.length()] = param2;
          kw.$cfr$intArgs$a$62b8cf4125f9(90, var8, 0, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(vn param0, int param1, String param2, int param3, byte param4) {
        tk var7 = null;
        tk var8 = null;
        if (param2 == null) {
          this.field_a = null;
          return;
        }
        if (param4 != -36) {
          this.field_f = (String) null;
        }
        if (param0 == this.field_l && this.field_i && this.field_e == 0 && this.field_f != null &&
          this.field_f.equals(param2)) {
          return;
        }
        try {
          this.field_e = 0;
          this.field_l = param0;
          this.field_i = true;
          this.field_f = param2;
          var7 = this.a(param1, -106, param0, param2);
          var8 = var7;
          var7.field_b[0] = param3;
          var8.field_b[param2.length()] = param3 + param0.a(param2);
          kw.$cfr$intArgs$a$62b8cf4125f9(90, var8, 0, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
