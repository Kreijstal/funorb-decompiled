/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String field_e;
    static String field_b;
    private RgbSprite[] field_d;
    static String field_a;
    static int field_c;

    final static int a(SceneWidget param0, int param1) {
        int var6 = 0;
        int stackIn_6_0 = 0;
        SceneWidget stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        SceneWidget stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        SceneWidget stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        SceneWidget stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        SceneWidget stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        SceneWidget stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        int stackIn_87_0 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        PartInstruction var5 = null;
        SceneWidget var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        SceneWidget var13_ref_gh = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String[] var20 = null;
        PartInstruction[] var21 = null;
        PartInstruction[] var22 = null;
        ArticulatedPart var23 = null;
        SceneWidget var24 = null;
        int var13Lifetime1;
        var19 = SteelSentinels.obfuscationControl;
        try {
          if (param0.field_M != null) {
            param0.field_M.clear(6);
          }
          var2_int = 4;
          if (!kc.field_r) {
            stackIn_6_0 = 106 - pf.field_n;
          } else {
            stackIn_6_0 = -8 - pf.field_n + 110 - bi.field_d;
          }
          var3 = stackIn_6_0;
          var22 = new PartInstruction[]{};
          var21 = hl.field_v.a(var22, -21636, fg.field_Ob);
          if (param1 <= 82) {
            var20 = (String[]) null;
            ak.a((RgbSprite) null, -101, (String) null, 108, -59, -84, 124, -128, (String[]) null, true);
          }
          for (var6 = 0; var6 < var21.length; var6++) {
            var5 = var21[var6];
            var7 = new SceneWidget("", ei.field_n);
            if (null != ti.field_B &&
              (var5.field_q & ti.field_B.field_Q) > 0) {
              var7.b(sb.field_Y, 6402);
            }
            if (null == ti.field_B &&
              t.field_h >= 0) {
              var23 = NodeDeque.a(t.field_h, (byte) 67);
              if (var23 != null &&
                (var23.field_Q & var5.field_q) != 0) {
                var7.b(sb.field_Y, 6402);
              }
            }
            var7.a(0, var2_int, 32, 4, var3);
            var7.field_Fb = 0;
            var7.field_S = "";
            var7.field_sb = 2;
            var24 = new SceneWidget(-1L, (SceneWidget) null);
            var24.field_nb = 9211020;
            var24.field_Fb = 2;
            var24.field_Kb = 1;
            var24.field_L = (BitmapFont) ((Object) fk.field_d);
            var24.field_I = lj.field_b;
            var24.a(0, 18, 12, 2, var3 - 4);
            var7.a(var24, 122);
            var9 = var5.field_q;
            var10 = 0;
            var11 = 1;
            var12 = kh.field_v.a((byte) 2, var5);
            if (null == var5.attachedPart &&
              (var5.field_q & 256) == 0) {
            }
            if (var5.attachedPart != null) {
              if (var12 == var5.attachedPart.componentId) {
                var12 = -1;
              }
              var10 = var5.attachedPart.field_Q;
              var24.field_S = bg.a(var5.attachedPart.getPartName(-24719), var24.field_zb - 2 * var24.field_ub, (byte) -45, var24.field_L);
              var13 = var5.attachedPart.componentId;
              if (var13 != 83 &&
                0 != (1008 & var10)) {
                qh.field_Wb = true;
              }
              if (var13 == 76 ||
                var13 == 89 ||
                var13 == 66) {
                qh.field_Wb = true;
              }
            }
            if (var11 != 0) {
              if ((16 & var9) > 0) {
                stackIn_38_0 = var7;
                stackIn_38_1 = new StringBuilder().append(var7.field_S);
                if ((16 & var10) != 0) {
                  stackIn_39_2 = "<img=8>";
                } else {
                  stackIn_39_2 = "<img=13>";
                }
                stackIn_38_0.field_S = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).toString();
              }
              if (0 < (var9 & 32)) {
                stackIn_43_0 = var7;
                stackIn_43_1 = new StringBuilder().append(var7.field_S);
                if ((var10 & 32) == 0) {
                  stackIn_44_2 = "<img=14>";
                } else {
                  stackIn_44_2 = "<img=9>";
                }
                stackIn_43_0.field_S = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).toString();
              }
              if ((var9 & 64) > 0) {
                stackIn_49_0 = var7;
                stackIn_49_1 = new StringBuilder().append(var7.field_S);
                if ((64 & var10) == 0) {
                  stackIn_50_2 = "<img=15>";
                } else {
                  stackIn_50_2 = "<img=10>";
                }
                stackIn_49_0.field_S = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).toString();
              }
              if ((128 & var9) > 0) {
                stackIn_54_0 = var7;
                stackIn_54_1 = new StringBuilder().append(var7.field_S);
                if ((var10 & 128) == 0) {
                  stackIn_55_2 = "<img=16>";
                } else {
                  stackIn_55_2 = "<img=11>";
                }
                stackIn_54_0.field_S = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).toString();
              }
              if ((var9 & 256) > 0) {
                stackIn_60_0 = var7;
                stackIn_60_1 = new StringBuilder().append(var7.field_S);
                if ((var10 & 256) == 0) {
                  stackIn_61_2 = "<img=17>";
                } else {
                  stackIn_61_2 = "<img=12>";
                }
                stackIn_60_0.field_S = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).toString();
              }
              if ((var9 & 512) > 0 && (t.a(rn.field_D, 49, -20370) ||
                aj.a(ge.field_m, (byte) 124, rn.field_D, 49, ArticulatedPart.f((byte) -95)))) {
                stackIn_68_0 = var7;
                stackIn_68_1 = new StringBuilder().append(var7.field_S);
                if ((var10 & 512) == 0) {
                  stackIn_69_2 = "<img=19>";
                } else {
                  stackIn_69_2 = "<img=18>";
                }
                stackIn_68_0.field_S = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).toString();
              }
            }
            param0.a(var7, 127);
            if (param0.field_kb &&
              oh.field_f >= param0.field_Rb &&
              param0.field_zb + param0.field_Rb > oh.field_f &&
              var2_int + param0.field_cb <= pi.field_c &&
              32 + (var2_int + param0.field_cb) > pi.field_c) {
              if (null == ti.field_B) {
                var7.field_I = be.field_f;
              }
              lj.field_h = var5;
            }
            if (0 <= var12) {
              var13_ref_gh = new SceneWidget("", ei.field_n);
              var13_ref_gh.field_S = uh.field_h;
              var13_ref_gh.a(0, 2, 10, 2, 10);
              var13_ref_gh.field_nb = 65535;
              var13_ref_gh.field_I = null;
              var13_ref_gh.field_L = (BitmapFont) ((Object) fk.field_d);
              var7.a(var13_ref_gh, 124);
            }
            var13Lifetime1 = param0.field_Rb;
            var14 = param0.field_cb - (-var2_int - 16);
            var15 = (var5.field_k + var13Lifetime1) / 2;
            var16 = 4473924;
            var17 = 376;
            var18 = 84;
            var2_int += 36;
            if (var14 <= var17 &&
              var14 >= var18) {
              SoftwareRaster.a(var15, var14, var13Lifetime1, var14, var16, 128);
              SoftwareRaster.a((3 * var5.field_k + var15) / 4, (3 * var5.field_l + var14) / 4, var15, var14, var16, 128);
            }
          }
          stackIn_87_0 = var2_int;
          return stackIn_87_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_90_0 = var2;
          stackIn_90_1 = new StringBuilder().append("ak.B(");
          if (param0 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(RgbSprite param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, String[] param8, boolean param9) {
        int var16 = 0;
        fh stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        int stackIn_7_6;
        int stackIn_7_7;
        int stackIn_8_8;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        fh var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        var17 = SteelSentinels.obfuscationControl;
        try {
          var10 = ff.field_lb;
          SoftwareRaster.c(-8 + (param4 - param5), param1 - 8 + 2, 16 + (param3 - 4), param6 + 12, 0, 210);
          jm.a(-8 + param1, param6 + 16, oa.field_Q, 1, param4 - 8, param3 + 16);
          var11 = 4 + param1;
          if (param0 != null) {
            param0.a((-param0.field_A + param3) / 2 + param4, var11);
            var11 = var11 + (param0.field_F + 2);
          }
          if (param2 != null) {
            stackIn_7_0 = var10;
            stackIn_7_1 = (String) (param2);
            stackIn_7_2 = param4 + 8;
            stackIn_7_3 = var11;
            stackIn_7_4 = -16 + param3;
            stackIn_7_5 = -var11 + param1 + param6;
            stackIn_7_6 = 8421504;
            stackIn_7_7 = -1;
            if (param9) {
              stackIn_8_8 = 1;
            } else {
              stackIn_8_8 = 0;
            }
            var12 = ((BitmapFont) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_8_8, 0, 0);
            var11 = var11 + (4 + (((BitmapFont) ((Object) var10)).field_W * var12 + 3));
          }
          SoftwareRaster.h(param4, param1, param3, -param1 + var11, param7);
          var12Lifetime1 = 100;
          var13 = 30;
          if (param8 != null &&
            0 != param8.length) {
            if (5 * param8.length + 5 + var12Lifetime1 * param8.length > param3) {
              var12Lifetime1 = (-((1 + param8.length) * 5) + param3) / param8.length;
            }
            var14 = param4 + (-(param8.length * 5) - (-5 + var12Lifetime1 * param8.length - param3)) / 2;
            var11Lifetime1 = -5 + param1 - (-param6 + var13);
            var15 = -1;
            for (var16 = 0; param8.length > var16; var16++) {
              if (nm.a(var11Lifetime1, var14, 116, param8[var16], var13, var12Lifetime1)) {
                var15 = var16;
              }
              var14 = var14 + (5 + var12Lifetime1);
            }
            stackIn_24_0 = var15;
            return stackIn_24_0;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_27_0 = var10_ref;
          stackIn_27_1 = new StringBuilder().append("ak.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -15203) {
          SceneWidget var7 = (SceneWidget) null;
          ak.a((SceneWidget) null, 87);
        }
        hb.a((byte) -77, this.field_d, param0, param4, param2, param3);
    }

    public static void a(int param0) {
        int var1 = -48 % ((param0 + 54) / 60);
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            255 >= param1) {
            return true;
          }
          if (param1 != 0) {
            var6 = gl.field_w;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (~param1 != ~var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (param0 == -2036) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ak.E(" + param0 + ',' + param1 + ')');
        }
    }

    ak(RgbSprite[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static me a(String param0, String param1, int param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        me stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -20407) {
            field_c = -47;
          }
          var4_long = 0L;
          var6 = null;
          if (-1 != param0.indexOf('@')) {
            var6 = param0;
          } else {
            var7 = (CharSequence) ((Object) param0);
            var4_long = SentinelDesigner.a(-60, var7);
          }
          stackIn_6_0 = qi.a(param3, var4_long, param1, 0, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ak.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "From <%0>: ";
        field_b = "Game options";
        field_c = 0;
        field_a = "<col=ffffff>Time:</col> <%0>";
    }
}
