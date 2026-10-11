/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static String field_c;
    static int field_f;
    static fm field_b;
    static BitmapFont field_a;
    static String field_e;
    static int field_g;
    static volatile int field_d;

    final static SceneWidget b(byte param0) {
        RuntimeException var1 = null;
        SceneWidget stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 121) {
            field_a = (BitmapFont) null;
          }
          stackIn_4_0 = gd.l((byte) 19);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "wn.B(" + param0 + ')');
        }
    }

    final static void a(SceneWidget param0, SceneWidget param1, SceneWidget param2, lb param3, boolean param4, int param5, BitmapFont param6, SceneWidget param7, SceneWidget param8, SceneWidget param9, SceneWidget param10, SceneWidget param11) {
        String stackIn_13_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RgbSprite[] var16 = null;
        SceneWidget var17 = null;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        var21 = SteelSentinels.obfuscationControl;
        try {
          ag.field_r[0] = 16764000;
          pl.field_X = param6;
          ag.field_r[2] = 9474303;
          ag.field_r[3] = 16736511;
          ag.field_r[1] = 6356832;
          cd.field_g = param4;
          td.field_ic = param2;
          ag.field_r[4] = 16711935;
          pf.field_j[1] = 6356832;
          ag.field_r[4] = 16711935;
          pf.field_j[2] = 16736352;
          pf.field_j[0] = 16764000;
          v.field_e = 8421504;
          pf.field_j[3] = 16736511;
          var12 = new RgbSprite(4, 4);
          var13 = var12.field_E;
          var14 = var12.field_E;
          var12.field_E[15] = 7368816;
          var15 = var12.field_E;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new RgbSprite[9];
          var16[4] = var12;
          qc.field_V = new SceneWidget(0L, param8);
          vg.field_g = new SceneWidget(0L, param9);
          qc.field_V.a(vg.field_g, 118);
          var17 = new SceneWidget(0L, (SceneWidget) null);
          var17.field_M = new NodeDeque();
          sn.field_j = new kg(0L, var17, param7, param3);
          vg.field_g.a(sn.field_j, 123);
          CombatWorld.field_H = new SceneWidget(0L, param10);
          vg.field_g.a(CombatWorld.field_H, 125);
          vd.field_d = new SceneWidget(0L, param11);
          vd.field_d.field_L = pl.field_X;
          CombatWorld.field_H.a(vd.field_d, 121);
          var18 = -112 / ((71 - param5) / 40);
          CombatWorld.field_H.h(-87);
          wh.field_e = new SceneWidget(0L, (SceneWidget) null);
          wh.field_e.field_I = var16;
          CombatWorld.field_H.a(wh.field_e, 118);
          en.field_b = new SceneWidget[5];
          jk.field_a = new SceneWidget[5];
          gb.field_f = new SceneWidget[5];
          ah.field_Yb = new SceneWidget[5];
          var19 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var19 >= 5))) {
            stackIn_28_0 = -1;
            if (var21 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 == ~var19) {
                if (!cd.field_g) {
                  stackIn_13_0 = vi.field_bb;
                } else {
                  stackIn_13_0 = kh.field_p;
                }
                var20 = stackIn_13_0;
              } else if (var19 == 1 &&
                cd.field_g) {
                var20 = bk.field_P;
              } else {
                decompiledFrameRemainder0 = (2 == var19);
                if (decompiledFrameRemainder0) {
                  var20 = r.field_k;
                }
              }
              if (decompiledFrameRemainder0) {
                ah.field_Yb[var19] = new SceneWidget(0L, param0);
                en.field_b[var19] = new SceneWidget(0L, td.field_ic, var20);
                jk.field_a[var19] = new SceneWidget(0L, (SceneWidget) null);
                jk.field_a[var19].field_Fb = 1;
                gb.field_f[var19] = new SceneWidget(0L, td.field_ic);
                gb.field_f[var19].field_Fb = 1;
                ah.field_Yb[var19].a(en.field_b[var19], 126);
                ah.field_Yb[var19].a(jk.field_a[var19], 125);
                ah.field_Yb[var19].a(gb.field_f[var19], 123);
                ah.field_Yb[var19].h(-94);
                qc.field_V.a(ah.field_Yb[var19], 119);
                c.field_u = c.field_u + 1;
              }
              var19++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            fm.field_b = new SceneWidget(0L, param1);
            fm.field_b.field_S = ok.field_b;
            qc.field_V.a(fm.field_b, 118);
            stackIn_28_0 = ud.e(-107) ? 1 : 0;
          }
          if (stackIn_28_0 != 0 &&
            !fj.field_e) {
            return;
          }
          ve.field_b = new pl(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_39_0 = var12_ref;
          stackIn_39_1 = new StringBuilder().append("wn.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param7 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param8 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param9 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param10 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param11 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_e = null;
          if (param0 > -125) {
            field_d = -57;
          }
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "wn.D(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        try {
          ag.field_p.a(param0, 0, (byte) -128);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "wn.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "members-only content";
        field_b = new fm(12, 0, 1, 0);
        field_e = "Accept draw";
        field_d = 0;
    }
}
