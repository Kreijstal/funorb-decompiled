/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static boolean field_c;
    static String field_a;
    static w field_e;
    static int[] field_b;
    static String[] field_d;

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        w stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_153_0 = 0;
        w stackIn_175_0 = null;
        boolean stackIn_175_1 = false;
        boolean stackIn_176_2 = false;
        w stackIn_180_0 = null;
        boolean stackIn_180_1 = false;
        boolean stackIn_181_2 = false;
        w stackIn_185_0 = null;
        boolean stackIn_185_1 = false;
        boolean stackIn_186_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_80_0;
        boolean stackOut_134_0;
        RuntimeException var5 = null;
        w var6 = null;
        w var7 = null;
        w var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vj var17 = null;
        Object var18 = null;
        int var18_int = 0;
        tj var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        w var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        w var26 = null;
        int stackIn_58_0Lifetime1;
        int stackIn_58_1Lifetime1;
        int stackIn_66_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          if (param0 != 0) {
            mn.a(-82);
          }
          qf.a(tg.field_e, param0 + 101);
          if (cd.field_m != null) {
            ma.field_G.field_Hb = true;
            var22 = fh.field_d;
            var26 = var22;
            fh.field_d.field_N = 0;
            var26.field_mb = 0;
            var6 = nn.field_a;
            nn.field_a.field_N = 0;
            var6.field_mb = 0;
            var7 = tg.field_i;
            tg.field_i.field_N = 0;
            var7.field_mb = 0;
            if (ig.b(true)) {
              fl.field_b.field_Y = jf.field_f.toUpperCase();
              var9 = (2 + oh.field_d.field_mb) / 2;
              fh.field_d.a(-2 + var9, 0, oh.field_d.field_N - 40, 40, 0);
              if (cd.field_m.field_mc > cd.field_m.field_rc) {
                fh.field_d.field_Y = ea.field_u.toUpperCase();
                fh.field_d.field_Hb = true;
                if (var19 != 0) {
                  fh.field_d.field_Y = cb.field_k.toUpperCase();
                  fh.field_d.field_Hb = false;
                }
              } else {
                fh.field_d.field_Y = cb.field_k.toUpperCase();
                fh.field_d.field_Hb = false;
              }
              fh.field_d.field_lb = d.field_g.field_lb;
              if (cj.field_a > 0) {
                if (cj.field_a != 1) {
                  var10_ref_String = cm.$cfr$intArgs$a$53ce4ab4c593(122, fl.field_a, new String[]{Integer.toString(cj.field_a)});
                  if (var19 != 0) {
                    var10_ref_String = ec.field_c;
                  }
                } else {
                  var10_ref_String = ec.field_c;
                }
                fh.field_d.field_Y = fh.field_d.field_Y + "<br>" + var10_ref_String;
                if ((oe.field_G & 16) == 0 &&
                  !dn.field_k) {
                  fh.field_d.field_lb = d.field_g.field_S;
                }
              }
              nn.field_a.a(-var9 + oh.field_d.field_mb, 0, -40 + oh.field_d.field_N, 40, var9);
              nn.field_a.field_Y = mc.field_c.toUpperCase();
              stackIn_22_0 = nn.field_a;
              stackIn_23_1 = (param1) && (km.field_C == 0L);
              stackIn_22_0.field_Hb = stackIn_23_1;
              var8 = nn.field_a;
              var10 = 2;
              if (null != bc.field_D) {
                if (null == km.field_D) {
                  rd.field_c = new boolean[j.field_b];
                  km.field_D = new byte[j.field_b];
                }
                var11 = 0;
                do {
                  if (!(j.field_b > var11)) {
                    var10 = 0;
                    break;
                  }
                  rd.field_c[var11] = false;
                  var11++;
                } while (var19 == 0);
                L17: while (true) {
                  if (2 > var10) {
                    var11 = 0;
                    stackIn_72_0 = 0;
                    if (var19 != 0) {
                      break L17;
                    }
                    var12 = stackIn_72_0;
                    while (true) {
                      stackIn_37_0 = var12;
                      stackIn_37_1 = bc.field_D.length;
                      if (stackIn_37_0 < stackIn_37_1) {
                        var25 = bc.field_D[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_66_0 = 0;
                        var14 = stackIn_66_0;
                        L24: while (true) {
                          if (var25.length > var14) {
                            var15 = var25[var14];
                            var16 = var20[1 + var14];
                            stackIn_58_0 = var15;
                            stackIn_58_1 = -1;
                            if (stackIn_58_0 == stackIn_58_1) {
                              if (var10 == 0) {
                                stackIn_46_0 = cd.field_m.field_mc;
                              } else {
                                stackIn_46_0 = cd.field_m.field_rc;
                              }
                              var17_int = stackIn_46_0;
                              if (var16 != var17_int &&
                                var19 == 0) {
                                break L24;
                              }
                            } else {
                              if (var16 != (255 & cd.field_m.field_kc[var15]) &&
                                var19 == 0) {
                                break L24;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_58_0Lifetime1 = ~var15;
                            stackIn_58_1Lifetime1 = ~var25.length;
                            if (stackIn_58_0Lifetime1 <= stackIn_58_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_37_0 = ~var14;
                            stackIn_37_1 = ~var16;
                            if (stackIn_37_0 > stackIn_37_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          rd.field_c[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_66_0Lifetime1 = var11;
                    if (stackIn_66_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_72_0 = te.field_p;
                  break;
                }
                if (stackIn_72_0 >= 2 &&
                  bj.field_d[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                nn.field_a.field_Hb = false;
                decompiledFrameRemainder0 = !(!nn.field_a.field_Kb);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (j.field_b > var13) {
                      stackOut_80_0 = rd.field_c[var13];
                      stackIn_87_0 = stackOut_80_0 ? 1 : 0;
                      stackIn_81_0 = stackOut_80_0;
                      if (var19 == 0) {
                        if (stackIn_81_0) {
                          var24 = "<col=A00000>" + pa.field_db[var13] + "</col>";
                          if (var11_ref == null) {
                            var11_ref = var24;
                          } else {
                            var12 = 1;
                            var11_ref = (String) (var11_ref) + ", " + var24;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_87_0 = var10;
                    }
                    break;
                  }
                  if (stackIn_87_0 != 0) {
                    var13_ref_String = bg.field_e;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = jf.field_a + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = cm.$cfr$intArgs$a$53ce4ab4c593(119, fn.field_f, new String[]{(String) (var11_ref)});
                    }
                  } else {
                    var13_ref_String = hh.field_d;
                    if (var12 == 0) {
                      var14_ref_String = cm.$cfr$intArgs$a$53ce4ab4c593(82, ci.field_e, new String[]{(String) (var11_ref)});
                      if (var19 != 0) {
                        var14_ref_String = mf.field_S + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = mf.field_S + (String) (var11_ref);
                    }
                  }
                  sl.field_g = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != cb.field_e ||
                mg.field_Ob != null ||
                ik.field_h != null ||
                af.field_b != null)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < j.field_b)))) {
                  var17_int = cd.field_m.field_kc[var16] & 255;
                  if (var19 == 0) {
                    if (cb.field_e != null &&
                      cb.field_e[var16] != null &&
                      cb.field_e[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (null != mg.field_Ob &&
                      null != mg.field_Ob[var16]) {
                      var18_int = mg.field_Ob[var16][var17_int];
                      if (var18_int > var13Lifetime1) {
                        var13Lifetime1 = var18_int;
                      }
                      if (var18_int != 0 &&
                        !uc.field_a) {
                        var11 = 1;
                      }
                    }
                    if (ik.field_h != null &&
                      ik.field_h[var16] != null) {
                      var18_intLifetime1 = ik.field_h[var16][var17_int];
                      if (var18_intLifetime1 != 0 &&
                        !uc.field_a) {
                        var11 = 1;
                      }
                      if (var18_intLifetime1 > var14) {
                        var14 = var18_intLifetime1;
                      }
                    }
                    if (null != af.field_b &&
                      af.field_b[var16] != null) {
                      var15 = var15 | af.field_b[var16][var17_int];
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = tb.field_b.field_Ob.field_M;
                var18_ref = (tj) (var17.c((byte) 83));
                L57: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_134_0 = var18_ref.g((byte) 68);
                    stackIn_153_0 = stackOut_134_0 ? 1 : 0;
                    stackIn_135_0 = stackOut_134_0;
                    if (var19 != 0) {
                      break L57;
                    }
                    if (!stackIn_135_0 ||
                      var19 != 0) {
                      if (var11 != 0 &&
                        !var18_ref.field_ec) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var18_ref.field_Ub < var13Lifetime1) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var18_ref.field_Xb < var14) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((var15 & ~var18_ref.field_Sb) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var18_ref = (tj) (var17.d(true));
                      continue;
                    }
                  }
                  stackIn_153_0 = te.field_p;
                  break;
                }
                if (stackIn_153_0 >= 2 &&
                  bj.field_d[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  nn.field_a.field_Hb = false;
                  if (nn.field_a.field_Kb) {
                    if (0 != je.field_f.field_h.field_Pb) {
                      sl.field_g = cm.$cfr$intArgs$a$53ce4ab4c593(94, ii.field_s, new String[]{eg.field_b});
                      if (var19 != 0) {
                        sl.field_g = ui.field_L;
                      }
                    } else {
                      sl.field_g = ui.field_L;
                    }
                  }
                }
              }
              if (var19 != 0) {
                var9_ref_String = cd.field_m.field_Vb;
                fl.field_b.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(101, hf.field_a, new String[]{var9_ref_String}).toUpperCase();
                tg.field_i.a(oh.field_d.field_mb, param0 ^ 0, oh.field_d.field_N - 40, 40, 0);
                tg.field_i.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(116, h.field_e, new String[]{var9_ref_String});
                var8 = tg.field_i;
              }
            } else {
              var9_ref_String = cd.field_m.field_Vb;
              fl.field_b.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(101, hf.field_a, new String[]{var9_ref_String}).toUpperCase();
              tg.field_i.a(oh.field_d.field_mb, param0 ^ 0, oh.field_d.field_N - 40, 40, 0);
              tg.field_i.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(116, h.field_e, new String[]{var9_ref_String});
              var8 = tg.field_i;
            }
            if (km.field_C != 0L) {
              var9 = (int)(km.field_C - ik.a(4));
              var9 = (999 + var9) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(119, cf.field_b, new String[]{Integer.toString(var9)});
            }
            he.field_jb.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(101, sb.field_n, new String[]{Integer.toString(cd.field_m.field_rc), Integer.toString(cd.field_m.field_mc)});
          }
          stackIn_175_0 = ee.field_i;
          stackIn_175_1 = false;
          stackIn_176_2 = (param2) && (!param3) && (!dn.field_k);
          ((w) (Object) stackIn_175_0).a(stackIn_175_1, stackIn_176_2);
          stackIn_180_0 = oh.field_d;
          stackIn_180_1 = false;
          stackIn_181_2 = (param2) && (!param3) && (!dn.field_k);
          ((w) (Object) stackIn_180_0).a(stackIn_180_1, stackIn_181_2);
          stackIn_185_0 = (w) (field_e);
          stackIn_185_1 = false;
          stackIn_186_2 = (param2) && (!param3) && (dn.field_k);
          ((w) (Object) stackIn_185_0).a(stackIn_185_1, stackIn_186_2);
          je.field_f.field_h.b(false);
          if (cd.field_m != null) {
            if (ma.field_G.field_ob != 0) {
              md.a(param0 ^ 9, param4, cd.field_m.e(-76));
            }
            if (nn.field_a.field_ob != 0) {
              gm.field_I = true;
            }
            if (fh.field_d.field_ob != 0) {
              dn.field_k = true;
            }
            if (qc.field_q.field_ob != 0) {
              dn.field_k = false;
            }
            mc.a(cd.field_m, false, param4, (byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "mn.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, long param1, int param2) {
        uf var4 = we.field_b;
        var4.f(param2, -4);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(true, 7);
        var4.a(param1, (byte) 0);
        var4.b(-var5 + var4.field_n, param0);
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 >= -113) {
          return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = "Return to game";
        field_d = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_b = new int[]{40, 30, 24, 19, 15, 12, 9, 6, 4, 2, 0};
    }
}
