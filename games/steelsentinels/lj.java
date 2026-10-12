/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static String field_c;
    static rf field_d;
    static RgbSprite[] field_b;
    static String field_i;
    static String[] field_g;
    static String[] field_a;
    static String field_f;
    static PartInstruction field_h;
    static RgbSprite[] field_e;

    final static String a(String param0, byte param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_23_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          if (!ArchiveProvider.a(true, (CharSequence) ((Object) param0))) {
            stackIn_4_0 = en.field_a;
            return stackIn_4_0;
          }
          if (2 != qc.field_P) {
            stackIn_7_0 = ed.field_d;
            return stackIn_7_0;
          }
          if (Projectile.a(param1 ^ -2, param0)) {
            stackIn_12_0 = o.field_f;
            return stackIn_12_0;
          }
          if (pf.a(param0, -53)) {
            stackIn_17_0 = db.a(f.field_u, -107, new String[]{param0});
            return stackIn_17_0;
          }
          if (vd.field_h >= 100 &&
            rd.field_b <= 0) {
            stackIn_23_0 = pf.field_m;
            return stackIn_23_0;
          }
          if (vd.field_h >= 200) {
            stackIn_28_0 = pf.field_m;
            return stackIn_28_0;
          }
          if (o.a(-32, param0)) {
            stackIn_31_0 = db.a(qj.field_m, -68, new String[]{param0});
            return stackIn_31_0;
          }
          if (param1 != -79) {
            stackIn_34_0 = (String) null;
            return stackIn_34_0;
          }
          var3 = mm.field_g;
          var3.writeCipheredOpcode(param2, (byte) -117);
          var3.position = var3.position + 1;
          var4 = var3.position;
          var3.writeByte((byte) 114, 0);
          var3.a(param0, param1 ^ 43);
          var3.b((byte) -46, -var4 + var3.position);
          stackIn_36_0 = null;
          return (String) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_40_0 = var3_ref;
          stackIn_40_1 = new StringBuilder().append("lj.E(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          field_e = null;
          field_i = null;
          field_f = null;
          field_c = null;
          if (param0 != 109) {
            field_g = (String[]) null;
          }
          field_h = null;
          field_d = null;
          field_a = null;
          field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lj.B(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        String stackIn_67_0 = null;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 1) {
            field_f = (String) null;
          }
          var1 = null;
          var2 = null;
          if (ib.field_b == 0 &&
            ni.field_a != null) {
            var2 = ki.field_ob;
          }
          if (2 == ib.field_b &&
            !wa.b((byte) -76)) {
            boolean decompiledSharedTail2 = !(pf.a(bk.field_U, -59));
            if (!decompiledSharedTail2) {
              var2 = db.a(wh.field_a, -110, new String[]{en.field_e});
              decompiledSharedTail2 = (var10 != 0);
            }
            if (decompiledSharedTail2) {
              var2 = db.a(oh.field_b, param0 ^ -11, new String[]{en.field_e});
            }
            if (vb.field_e) {
              sj.a((String) null, (String) (var2), 0, (byte) 21, (String) null, 2);
              pm.a((byte) -110);
            }
          }
          if (var2 == null &&
            !rg.field_f &&
            null == hh.field_a) {
            var2 = t.field_g;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != var2) {
            ParticleEffect.a(56, v.field_e, (String) (var2), 0, (String) null);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = g.field_l;
            var3 = dh.a(-27905, var3);
            var4 = "";
            var5 = "|";
            var6 = ib.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = db.a(hh.field_d, param0 - 44, new String[]{en.field_e});
              var8 = db.a(ak.field_e, -67, new String[]{var3});
              var7 = -485 + (vd.field_d.field_zb + (wh.field_e.field_zb + pl.field_X.c(var8) - pl.field_X.c(var4)));
              if (var7 < 0) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (null == nf.field_b &&
                  cd.field_g) {
                  var4 = "[" + kh.field_p + "] ";
                }
                if (null != nf.field_b) {
                  boolean decompiledSharedTail1 = (!(cc.field_lc) ||
                    PartInstruction.field_a == null);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + PartInstruction.field_a + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + db.a(pd.field_ab, -93, new String[]{nf.field_b.field_Xb}) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (fg.p((byte) 84)) {
                stackIn_67_0 = ": ";
              } else {
                stackIn_67_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_67_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(fj.field_e);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + hk.field_Kc + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (uc.field_g)) {
                var4 = "<col=999999>" + var4 + ArchiveIndex.field_f + "</col>";
                var5 = "";
              }
              var9 = pl.field_X.c(var4);
              if (!fg.p((byte) -102)) {
                if (vd.field_d.field_kb &&
                  var9 > -vd.field_d.field_Rb + oh.field_f) {
                  if (fj.field_e) {
                    var1 = "Broken!";
                  } else {
                    var1 = ArchiveIndex.field_f;
                  }
                }
                if (vd.field_d.field_Eb != 0 &&
                  vd.field_d.field_Cb < var9 &&
                  !fj.field_e) {
                  pd.j(param0 + 13170);
                }
              }
            }
            ParticleEffect.a(71, ag.field_r[var6], var4 + BitmapFont.a(tf.field_g.toString()), var7, var5);
            if (!jn.field_g) {
              wh.field_e.field_kb = false;
            }
            if (wh.field_e.field_kb) {
              var1 = db.a(Projectile.field_Y, -120, new String[]{var3, en.field_e});
            }
          }
          stackIn_102_0 = var1;
          return (String) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (var1), "lj.D(" + param0 + ')');
        }
    }

    final static u a(ResourceArchive param0, int param1, int param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_7_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -20) {
            field_f = (String) null;
          }
          if (!wa.a((byte) 30, param1, param4, param3)) {
            stackIn_7_0 = null;
            return (u) (stackIn_7_0);
          }
          stackIn_9_0 = SentinelCommand.a(96, param0.getFile(param4, (byte) 75, param1));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("lj.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static SceneWidget a(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_103_0 = 0;
        SceneWidget stackIn_106_0 = null;
        RgbSprite[] stackIn_107_1 = null;
        SceneWidget stackIn_110_0 = null;
        RgbSprite[] stackIn_111_1 = null;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        SceneWidget stackIn_139_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        SceneWidget var8_ref = null;
        Object var9 = null;
        String var9_ref = null;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        SceneWidget var15 = null;
        int var16 = 0;
        SceneWidget var17 = null;
        IndexedSprite var18 = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        SceneWidget var21 = null;
        SceneWidget var22 = null;
        int var23 = 0;
        SceneWidget var21Lifetime1;
        int var13Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var20Lifetime2;
        var23 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = qa.field_O;
          if ((ni.b(103) ||
            !(rd.field_b > 0)) && oc.a(param1, -87, true)) {
            stackIn_11_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_11_0 = 0;
          }
          var7 = stackIn_11_0;
          var8 = null;
          var9 = null;
          if (param1 != 34) {
            var9_ref = rj.field_m[param1];
          } else {
            var9_ref = "GODULE";
          }
          var10 = null;
          var11 = 0;
          var12 = 5;
          var13 = param1;
          if (var13 == 0) {
            var11 = 1;
            var10 = "<img=7>";
          } else {
            if (var13 == 1 &&
              var23 == 0) {
              var10 = "<img=7>";
              var11 = 2;
            } else {
              if (var13 == 2) {
                var11 = 3;
                var10 = "<img=7>";
              } else {
                if (var13 == 3 &&
                  var23 == 0) {
                  var11 = 4;
                  var10 = "<img=7>";
                } else {
                  if (var13 == 4) {
                    var10 = "<img=7>";
                    var11 = 5;
                  } else {
                    if (var13 == 20) {
                      var11 = 10;
                      var10 = "<img=7>";
                    } else {
                      if (var13 == 5) {
                        var10 = "<img=4>";
                        var11 = 1;
                      } else {
                        if (var13 == 6 &&
                          var23 == 0) {
                          var11 = 2;
                          var10 = "<img=4>";
                        } else {
                          if (7 == var13 &&
                            var23 == 0) {
                            var10 = "<img=4>";
                            var11 = 3;
                          } else {
                            if (var13 == 8 &&
                              var23 == 0) {
                              var10 = "<img=4>";
                              var11 = 4;
                            } else {
                              if (var13 == 9 &&
                                var23 == 0) {
                                var11 = 5;
                                var10 = "<img=4>";
                              } else {
                                if (var13 == 10) {
                                  var11 = 1;
                                  var10 = "<img=5>";
                                  var12 = 10;
                                } else {
                                  if (var13 == 11) {
                                    var12 = 10;
                                    var11 = 2;
                                    var10 = "<img=5>";
                                  } else {
                                    if (var13 == 12) {
                                      var10 = "<img=5>";
                                      var11 = 5;
                                      var12 = 10;
                                    } else {
                                      if (var13 == 13 &&
                                        var23 == 0) {
                                        var12 = 10;
                                        var11 = 10;
                                        var10 = "<img=5>";
                                      } else {
                                        if (var13 == 14) {
                                          var10 = "<img=5>";
                                          var11 = 20;
                                          var12 = 10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_103_0 = (null != var10) ? 1 : 2;
          var13Lifetime1 = stackIn_103_0;
          var8_ref = new SceneWidget((long)param1, sb.field_Y);
          cj.field_a[param1] = var8_ref;
          stackIn_106_0 = var8_ref;
          if (0 != param4) {
            stackIn_107_1 = co.field_d;
          } else {
            stackIn_107_1 = tk.field_t;
          }
          stackIn_106_0.field_I = stackIn_107_1;
          stackIn_110_0 = var8_ref;
          if (param4 == 0) {
            stackIn_111_1 = be.field_f;
          } else {
            stackIn_111_1 = tk.field_t;
          }
          stackIn_110_0.field_Ab = stackIn_111_1;
          var14 = 46;
          var15 = new SceneWidget(-1L, kh.field_s, var9_ref);
          var15.field_Ib = 10;
          var15.a(0, 2, -4 + (-15 + param5), var14, param0 - (var14 + 10));
          if (1 == var13Lifetime1) {
            var9_ref = bg.a(var9_ref, -(var15.field_ub * 2) + var15.field_zb, (byte) -45, var15.field_L);
          }
          var9_ref = db.a("<col=1e73a1><%0></col>", -21, new String[]{var9_ref});
          var15.field_S = var9_ref;
          var8_ref.a(var15, 125);
          var16 = var15.field_L.a(var15.field_S, var15.field_zb - var15.field_ub * 2, var15.field_Ib) + 6;
          kh.a(var8_ref, "<img=1>", dn.field_Sb[param1], param1, var16, var6_int, 1000, var14, param2);
          var16 += 14;
          if (var10 != null) {
            kh.a(var8_ref, (String) (var10), var11, param1, var16, var6_int, var12, var14, true);
          }
          boolean decompiledFrameCompleted0 = true;
          var17 = new SceneWidget((long)param1, (SceneWidget) null);
          var17.a(0, 2, param5 - 4, 2, -4 + var14);
          var17.field_I = co.field_d;
          var18 = IsaacRandom.field_d[param1];
          var17.field_Pb = var18.toRgbSprite();
          if (!param3 ||
            var7 != 0) {
            var19_ref_int__ = var17.field_Pb.field_E;
            var20 = 0;
            while (var20 < var19_ref_int__.length) {
              stackIn_131_0 = ~var19_ref_int__[var20];
              stackIn_131_1 = -1;
              if (var23 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_131_0 != stackIn_131_1) {
                var19_ref_int__[var20] = 4210752;
              }
              var20++;
            }
          }
          if (decompiledFrameCompleted0) {
            var8_ref.a(var17, 127);
            stackIn_131_0 = param1;
            stackIn_131_1 = 10;
          }
          if (stackIn_131_0 == stackIn_131_1) {
          }
          if (var7 != 0) {
            var19 = sj.field_F.field_A;
            var20Lifetime1 = sj.field_F.field_F;
            var21 = new SceneWidget(-1L, (SceneWidget) null);
            var21.a(0, var17.field_eb + (-var19 + var17.field_Lb) / 2, var20Lifetime1, var17.field_Y + (var17.field_zb - var19) / 2, var19);
            var21.field_Pb = sj.field_F;
            var8_ref.a(var21, 124);
          }
          if ((var7 == 0 ||
            var23 != 0) &&
            param4 != 0) {
            var19Lifetime1 = 28;
            var20Lifetime2 = var19Lifetime1;
            var21Lifetime1 = new SceneWidget("engineer", (SceneWidget) null);
            var21Lifetime1.a(0, var17.field_eb + (var17.field_Lb - var20Lifetime2) / 2, var20Lifetime2, var17.field_Y + (-var19Lifetime1 + var17.field_zb) / 2, var19Lifetime1);
            var21Lifetime1.field_qb = 2;
            var21Lifetime1.field_I = field_b;
            var21Lifetime1.field_Ab = ResourceArchive.field_b;
            var21Lifetime1.field_sb = 2;
            var21Lifetime1.field_Pb = aj.field_r[param4];
            var22 = new SceneWidget(-1L, (SceneWidget) null);
            var22.a(0, 0, 28, 0, 28);
            var22.field_Pb = b.field_q[param4];
            var22.field_sb = 2;
            var22.field_qb = 2;
            var21Lifetime1.a(var22, 119);
            var8_ref.a(var21Lifetime1, 127);
          }
          stackIn_139_0 = var8_ref;
          return stackIn_139_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "lj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "Just play";
        field_i = "Find opponent";
        field_g = new String[]{"Default shoulder for the ", "<shy>, ", "<shy> and ", "-class sentinel.", "-class sentinels."};
        field_d = new rf();
        field_a = new String[16];
        field_f = "Auto-respond to <%0>";
    }
}
