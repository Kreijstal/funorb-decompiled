/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_f;
    static String field_c;
    static String[] field_d;
    static int[] field_b;
    static String field_e;
    static String field_a;

    final static boolean a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (0 > param0) {
            return false;
          }
          if (param2) {
            if (param0 == 27) {
              return false;
            }
            if (param0 == 32) {
              return false;
            }
          }
          if (param1 > -62) {
            field_f = (int[]) null;
          }
          var3_int = 0;
          scanLoop1: while (true) {
            if (var3_int >= 6) {
              return true;
            }
            var4 = FunOrbClient.field_z[var3_int];
            var12 = nl.a(var4, (byte) 124);
            if (param2) {
              stackIn_18_0 = var12.length - 8;
            } else {
              stackIn_18_0 = 0;
            }
            var6 = stackIn_18_0;
            if (param2) {
              stackIn_21_0 = var12.length;
            } else {
              stackIn_21_0 = var12.length - 8;
            }
            var7 = stackIn_21_0;
            while (true) {
              if (var7 <= var6) {
                var3_int++;
                continue scanLoop1;
              }
              if (~var12[var6] != ~param0) {
                var6++;
                continue;
              }
              break;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "oc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != -1) {
          oc.a(-65, -59, true);
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static int a(int param0, SceneWidget param1) {
        int var5_int = 0;
        int var6 = 0;
        SceneWidget stackIn_26_0 = null;
        SceneWidget stackIn_26_1 = null;
        long stackIn_26_2 = 0L;
        SceneWidget stackIn_27_0 = null;
        SceneWidget stackIn_27_1 = null;
        SceneWidget stackIn_27_3 = null;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        PartInstruction[] var4 = null;
        PartInstruction var5 = null;
        PartInstruction var6_ref_qd = null;
        PartInstruction var7 = null;
        int var8 = 0;
        SceneWidget var10 = null;
        int var11 = 0;
        int var12 = 0;
        ArticulatedPart var13 = null;
        SceneWidget var14 = null;
        SceneWidget var15_ref_gh = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        PartInstruction[] var20 = null;
        PartInstruction var21 = null;
        PartInstruction[] var22 = null;
        PartInstruction[] var23 = null;
        ArticulatedPart var24 = null;
        SceneWidget var25 = null;
        ArticulatedPart var26 = null;
        PartInstruction var7Lifetime1;
        PartInstruction var7Lifetime2;
        var19 = SteelSentinels.obfuscationControl;
        try {
          if (param1.field_M != null) {
            param1.field_M.clear(param0 ^ 2);
          }
          var2_int = 0;
          var3 = 110 - pf.field_n - param0;
          var22 = new PartInstruction[]{};
          var20 = hl.field_v.a(var22, -21636, fg.field_Ob);
          var4 = var20;
          for (var5_int = 1; var5_int < var20.length; var5_int++) {
            if (0 != (var20[var5_int].field_q & 2)) {
              var6_ref_qd = var20[0];
              var7 = var6_ref_qd;
              var7Lifetime2 = var6_ref_qd;
              var20[0] = var20[var5_int];
              var20[var5_int] = var6_ref_qd;
            }
          }
          if (3 == var20.length &&
            (8 & var20[1].field_q) != 0) {
            var21 = var20[1];
            var5 = var21;
            var20[1] = var20[2];
            var20[2] = var21;
          }
          var23 = var20;
          for (var6 = 0; var23.length > var6; var6++) {
            var7Lifetime1 = var23[var6];
            var2_int += 4;
            var8 = 0;
            if (null == ti.field_B) {
              if (t.field_h >= 0) {
                var24 = NodeDeque.a(t.field_h, (byte) 67);
                if (var24 != null &&
                  (var7Lifetime1.field_q & var24.field_Q) != 0) {
                  var8 = 1;
                }
              }
            } else {
              if ((var7Lifetime1.field_q & ti.field_B.field_Q) != 0) {
                var8 = 1;
              }
            }
            stackIn_26_0 = null;
            stackIn_26_1 = null;
            stackIn_26_2 = -1L;
            if (var8 == 0) {
              stackIn_27_0 = null;
              stackIn_27_1 = null;
              stackIn_27_3 = ei.field_n;
            } else {
              stackIn_27_0 = null;
              stackIn_27_1 = null;
              stackIn_27_3 = sb.field_Y;
            }
            var25 = new SceneWidget(stackIn_26_2, stackIn_27_3);
            var25.a(0, var2_int, 78, 4, var3);
            var10 = new SceneWidget(-1L, (SceneWidget) null);
            var10.field_nb = 9211020;
            var10.field_I = lj.field_b;
            var10.field_Kb = 1;
            var10.field_Fb = 2;
            var10.a(0, 64, 12, 2, -4 + var3);
            var11 = var7Lifetime1.field_q;
            var12 = kh.field_v.a((byte) 2, var7Lifetime1);
            var10.field_L = (BitmapFont) ((Object) fk.field_d);
            var26 = var7Lifetime1.attachedPart;
            if (var26 != null) {
              if (var26.componentId == var12) {
                var12 = -1;
              }
              var10.field_S = var26.getPartName(-24719);
            } else {
              if (0 < (var11 & 2)) {
                var10.field_S = im.field_e;
              }
              if ((var11 & 4) > 0) {
                var10.field_S = tc.field_r;
              }
              if ((var11 & 8) > 0) {
                var10.field_S = ti.field_o;
              }
            }
            var10.field_S = bg.a(var10.field_S, -(var10.field_ub * 2) + var10.field_zb, (byte) -45, var10.field_L);
            var25.a(var10, 120);
            param1.a(var25, 124);
            var14 = new SceneWidget(-1L, (SceneWidget) null);
            var14.a(0, 2, 78 - var10.field_Lb - 5, 2, -4 + var3);
            if (var26 != null) {
              var13 = NodeDeque.a(var26.componentId, (byte) 67);
              ParticleEffect.a(var13, var14, (byte) -93, true, var3, 78 + (-var10.field_Lb - 5));
            }
            var25.a(var14, param0 + 117);
            if (oh.field_f >= param1.field_Rb &&
              param1.field_zb + param1.field_Rb > oh.field_f &&
              var2_int + param1.field_cb <= pi.field_c &&
              pi.field_c < 78 + param1.field_cb + var2_int) {
              if (ti.field_B == null) {
                var25.field_I = be.field_f;
              }
              lj.field_h = var7Lifetime1;
            }
            if (0 <= var12) {
              var15_ref_gh = new SceneWidget("", ei.field_n);
              var15_ref_gh.field_S = NodeHashTable.field_h;
              var15_ref_gh.a(param0 - 4, 2, 10, 2, 10);
              var15_ref_gh.field_L = (BitmapFont) ((Object) fk.field_d);
              var15_ref_gh.field_I = null;
              var15_ref_gh.field_nb = 65535;
              var25.a(var15_ref_gh, 123);
            }
            var15 = param1.field_Rb;
            var16 = param1.field_cb + (var2_int + 39);
            var17 = (var15 + var7Lifetime1.field_k) / 2;
            var18 = 4473924;
            SoftwareRaster.a(var17, var16, var15, var16, var18, 128);
            SoftwareRaster.a((var7Lifetime1.field_k * 3 + var17) / 4, (var16 + var7Lifetime1.field_l * 3) / 4, var17, var16, var18, 128);
            var2_int += 78;
          }
          stackIn_52_0 = var2_int;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("oc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 84) {
          field_f = (int[]) null;
        }
        stackIn_6_0 = (dl.field_J != null) && (null != dl.field_J.i(-1850));
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, String param2, boolean param3, boolean param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = SteelSentinels.obfuscationControl;
        try {
          gd.field_mb = param1;
          nc.field_q = true;
          var11 = param2;
          if (!param4) {
            stackIn_4_0 = dg.field_f;
          } else {
            stackIn_4_0 = cf.field_v;
          }
          var6 = stackIn_4_0;
          if (gd.field_mb == 0) {
            var7 = tc.a(480, re.field_ib, 75, var11, lj.field_a);
            var8 = 3 + var7;
            an.field_g = new String[var8];
            kk.field_g = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              kk.field_g[var9] = -1;
            }
            cb.field_c = new int[2];
            for (var9 = 0; var7 > var9; var9++) {
              an.field_g[var9] = lj.field_a[var9];
            }
            an.field_g[var8 - 3] = "";
            an.field_g[var8 - 2] = var6;
            kk.field_g[-2 + var8] = 0;
            cb.field_c[0] = 1;
            an.field_g[-1 + var8] = jf.field_cb;
            kk.field_g[-1 + var8] = 1;
            cb.field_c[1] = 2;
          } else {
            if (gd.field_mb != 1) {
              throw new IllegalArgumentException();
            }
            var7 = tc.a(480, re.field_ib, 75, var11, lj.field_a);
            var8 = var7 + 2;
            an.field_g = new String[var8];
            kk.field_g = new int[var8];
            for (var9 = 0; var9 < var8; var9++) {
              kk.field_g[var9] = -1;
            }
            cb.field_c = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              an.field_g[var9] = lj.field_a[var9];
            }
            an.field_g[-2 + var8] = "";
            an.field_g[var8 - 1] = jf.field_cb;
            kk.field_g[-1 + var8] = 0;
            cb.field_c[0] = 2;
          }
          se.field_c.field_m = cb.field_c.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; an.field_g.length > var8Lifetime1; var8Lifetime1++) {
            stackIn_25_0 = an.field_g[var8Lifetime1];
            stackIn_26_1 = !(kk.field_g[var8Lifetime1] < 0);
            var9Lifetime1 = rg.a(stackIn_25_0, stackIn_26_1, (byte) -120);
            if (kk.field_g[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + 2 * h.field_U;
            }
            if (var7Lifetime1 < var9Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          SceneWidget.field_hb = (id.field_ac + tf.field_c << 1) * se.field_c.field_m;
          hb.field_b = -(var7Lifetime1 >> 1) + (var7Lifetime1 + vg.field_f);
          hl.field_q = vg.field_f - (var7Lifetime1 >> 1);
          if (param0 < 46) {
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < an.field_g.length; var8Lifetime2++) {
            stackIn_39_0 = SceneWidget.field_hb;
            if (0 <= kk.field_g[var8Lifetime2]) {
              stackIn_40_1 = ig.field_e;
            } else {
              stackIn_40_1 = IntrusiveNode.field_e;
            }
            SceneWidget.field_hb = stackIn_39_0 + stackIn_40_1;
          }
          lk.field_W = qg.field_a - (SceneWidget.field_hb >> 1);
          se.field_c.a(param3, 0, 0, se.a((byte) 32, oh.field_f, pi.field_c));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("oc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        fj.field_e = param0 ? true : false;
        uc.field_g = 0 == rf.field_d.readUnsignedByte((byte) -103) ? true : false;
    }

    static {
        field_f = new int[]{107, 35, 4, 9, 14, 14, -1, -1, -1, -1};
        field_c = "Offline";
        field_e = "You must engineer the <col=00ffff><%0></col> before you can engineer the <%1>.";
        field_a = "Report abuse";
    }
}
