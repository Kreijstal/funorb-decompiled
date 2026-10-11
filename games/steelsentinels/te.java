/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int field_b;
    static String field_d;
    static String[][] field_c;
    static SceneWidget field_f;
    static int[][] field_a;
    static String field_e;

    final static int a(SceneWidget param0, int param1, boolean param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        String stackIn_71_0 = null;
        boolean stackIn_77_0 = false;
        boolean stackIn_78_1 = false;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_83_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ArticulatedPart var12 = null;
        SceneWidget var13 = null;
        String var13_ref = null;
        String var14 = null;
        SceneWidget var14_ref = null;
        SceneWidget var15 = null;
        int var16 = 0;
        SceneWidget var13Lifetime1;
        int stackIn_81_0Lifetime1;
        int stackIn_81_1Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (fg.field_Ob != 1 &&
            !he.a((byte) 124)) {
            stackIn_6_0 = param1;
            return stackIn_6_0;
          }
          stackIn_11_0 = (fg.field_Ob == 1) ? 78 : 64;
          var4_int = stackIn_11_0;
          if (~(1008 & fg.field_Ob) != param3) {
            var4_int = 36;
          }
          var5 = qa.field_O;
          var7 = 1;
          var8 = 1;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(fg.field_Ob >= var8)))) {
            stackIn_83_0 = -1;
            if (var16 == 0) {
              if (stackIn_83_0 != ~(fg.field_Ob & var8)) {
                var10 = 1;
                if (var8 != 1) {
                  var10 = hl.field_v.f(var8, -1) ? 1 : 0;
                }
                var11 = 0;
                if (var8 == 1) {
                  var11 = 1;
                }
                var12 = (ArticulatedPart) (ao.field_H.first(13058));
                while (var12 != null) {
                  stackIn_81_0 = ~(var8 & var12.field_Q);
                  stackIn_81_1 = -1;
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_81_0 != stackIn_81_1) {
                    var6 = 2;
                    if (t.a(rn.field_D, var12.componentId, -20370)) {
                      var6 = 0;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (param2) {
                      decompiledFrameRemainder1 = (var6 == 0);
                    } else {
                      decompiledFrameRemainder1 = (var6 != 0);
                      if (decompiledFrameRemainder1) {
                        if (var12.field_Q == 1) {
                          decompiledFrameRemainder0 = !(bj.a(rn.field_D, var12.componentId, ArticulatedPart.f((byte) -50), (byte) 86));
                          decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
                        }
                        if ((decompiledFrameRemainder1) &&
                          (decompiledFrameRemainder0)) {
                          decompiledFrameRemainder1 = !(!aj.a(ge.field_m, (byte) -120, rn.field_D, var12.componentId, ArticulatedPart.f((byte) -92)));
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      if (var6 == 2 &&
                        sj.field_v[var12.componentId] <= li.field_v) {
                        var6 = 1;
                      }
                      if (var7 != 0) {
                        var7 = 0;
                        var13 = new SceneWidget(-1L, (SceneWidget) null);
                        var13.field_Kb = 2;
                        var13.field_Pb = gj.field_a;
                        var13.a(0, param1, 18, 0, var5);
                        param0.a(var13, 125);
                        if (param2) {
                          stackIn_71_0 = qj.field_c;
                        } else {
                          stackIn_71_0 = he.field_h;
                        }
                        var14 = stackIn_71_0;
                        var15 = new SceneWidget(-1L, kh.field_s, var14);
                        var15.field_nb = 0;
                        var15.field_L = (BitmapFont) ((Object) pl.field_U);
                        var15.a(~param3, param1, 18, 0, var5);
                        var15.field_Fb = 1;
                        var15.field_sb = 1;
                        var15.field_Kb = 1;
                        var15.field_I = null;
                        param0.a(var15, 121);
                        param1 = param1 + var15.field_Lb;
                      }
                      if (var11 == 0) {
                        var11 = 1;
                        var13_ref = sn.field_i[var9];
                        var14_ref = new SceneWidget(-1L, kh.field_s, var13_ref);
                        var14_ref.field_Kb = 1;
                        var14_ref.field_nb = 11119017;
                        param1 += 2;
                        var14_ref.field_I = lj.field_b;
                        var14_ref.a(0, param1, 15, 0, var5);
                        param1 += 15;
                        param0.a(var14_ref, 118);
                      }
                      stackIn_77_0 = param2;
                      stackIn_78_1 = (var10 == 0);
                      var13Lifetime1 = se.a(stackIn_77_0, stackIn_78_1, var6, var12, 14);
                      param1 += 2;
                      var13Lifetime1.a(0, param1, var4_int, 0, var5);
                      param0.a(var13Lifetime1, 127);
                      param1 = param1 + var4_int;
                    }
                  }
                  var12 = (ArticulatedPart) (ao.field_H.next((byte) -48));
                }
              }
              stackIn_81_0Lifetime1 = var8;
              stackIn_81_1Lifetime1 = 1390612993;
              var8 = stackIn_81_0Lifetime1 << stackIn_81_1Lifetime1;
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_83_0 = param1;
          }
          return stackIn_83_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_87_0 = var4;
          stackIn_87_1 = new StringBuilder().append("te.C(");
          if (param0 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        ah stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        ah stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ah var6 = null;
        String var7 = null;
        ah var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ah var6Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 2) {
            te.a((byte) -82);
          }
          var1 = rf.field_d;
          var2 = var1.f((byte) -109);
          if (var2 == 0) {
            if (db.field_h == null) {
              db.field_h = new dk(128);
              cc.field_gc = 0;
            }
            stackIn_14_0 = (1 != var1.f((byte) -111)) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.h(1);
            if (var3_int != 0) {
              var5 = var1.h(1);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = da.a(var4_ref_String, (byte) -41);
            var7 = var1.h(1);
            var8 = ui.a(1, (CharSequence) ((Object) var4_ref_String));
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = da.a(var7, (byte) -41);
              if (null != var6) {
                db.field_h.a(var6, 1, (long)var8.hashCode());
              }
            }
            if (null == var6) {
              var6 = new ah();
              db.field_h.a(var6, param0 ^ 3, (long)var8.hashCode());
              fieldTemp$0 = cc.field_gc;
              cc.field_gc = cc.field_gc + 1;
              var6.field_bc = fieldTemp$0;
              am.field_c.addLast(3, var6);
            }
            var6.field_Tb = var5;
            var6.field_dc = var4_ref_String;
            var6.field_Vb = var7;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (qc.field_P == 1) {
                qc.field_P = 2;
              }
              return;
            }
            if (3 == var2) {
              if (qc.field_P == 2) {
                qc.field_P = 1;
              }
              return;
            }
            if (4 != var2) {
              sj.a("F1: " + ci.a((byte) 94), param0 ^ -93, (Throwable) null);
              pm.m(75);
              return;
            }
            qc.field_P = 1;
            var3 = var1.h(1);
            nn.field_f = ((String) (var3)).intern();
            var4 = var1.f((byte) -90);
            in.a((byte) 46, var4);
            return;
          }
          if (pi.field_a == null) {
            pi.field_a = new dk(128);
            vd.field_h = 0;
          }
          var3Lifetime1 = var1.h(1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.h(1);
          var5Lifetime1 = var1.h(1);
          var6Lifetime1 = wi.a(var4_ref_StringLifetime1, (byte) 122);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = wi.a(var5Lifetime1, (byte) 114);
            if (null != var6Lifetime1) {
              pi.field_a.a(var6Lifetime1, 1, (long)ui.a(param0 ^ 3, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new ah();
            pi.field_a.a(var6Lifetime1, 1, (long)ui.a(1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = vd.field_h;
            vd.field_h = vd.field_h + 1;
            var6Lifetime1.field_bc = fieldTemp$1;
            Sprite.field_c.addLast(param0 ^ 1, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_dc = var4_ref_StringLifetime1;
          var6Lifetime1.field_ac = (String) (var3Lifetime1);
          var6Lifetime1.field_Vb = var5Lifetime1;
          var6Lifetime1.unlink(param0 ^ 6);
          var7_ref = (ah) (Sprite.field_c.first(13058));
          scanLoop1: while (true) {
            if (null != var7_ref) {
              stackIn_65_0 = var7_ref;
              stackIn_65_1 = 22635;
              stackIn_65_2 = var6Lifetime1;
              if (var9 != 0) {
                break scanLoop1;
              }
              if (dm.a(stackIn_65_0, stackIn_65_1, stackIn_65_2)) {
                var7_ref = (ah) (Sprite.field_c.next((byte) -17));
                continue;
              }
            }
            if (null == var7_ref) {
              Sprite.field_c.addLast(3, var6Lifetime1);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_65_0 = var7_ref;
            stackIn_65_1 = 30;
            stackIn_65_2 = var6Lifetime1;
            break;
          }
          IsaacRandom.insertNodeBefore(stackIn_65_0, stackIn_65_1, stackIn_65_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "te.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = (String[][]) null;
        if (param0 >= -22) {
          return;
        }
        try {
          field_a = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Your request to join has been declined.";
        field_c = new String[][]{new String[]{"Tactical", "Action"}, new String[]{"Basic", "Standard", "Advanced", "High", "Expert"}, new String[]{"Zone", "Lost", "City", "Moon", "Fleet", "Co-op"}};
        field_a = new int[][]{null, null, new int[]{0, 0, 0, 0, 10, 0}};
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
