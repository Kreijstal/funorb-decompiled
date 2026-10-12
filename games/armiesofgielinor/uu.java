/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu {
    static boolean field_b;
    static String field_c;
    static String field_a;

    final static void a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        je stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_114_0 = false;
        int stackIn_132_0 = 0;
        boolean stackIn_148_0 = false;
        int stackIn_155_0 = 0;
        je stackIn_173_0 = null;
        boolean stackIn_173_1 = false;
        boolean stackIn_174_2 = false;
        je stackIn_178_0 = null;
        boolean stackIn_178_1 = false;
        boolean stackIn_179_2 = false;
        je stackIn_183_0 = null;
        boolean stackIn_183_1 = false;
        boolean stackIn_184_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_113_0;
        boolean stackOut_147_0;
        RuntimeException var5 = null;
        je var6 = null;
        je var7 = null;
        je var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        NodeDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        of var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        je var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        je var26 = null;
        int stackIn_60_0Lifetime1;
        int stackIn_60_1Lifetime1;
        int stackIn_69_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 != 0) {
            uu.a((byte) -86);
          }
          AnimationSequence.a(InstructionsPanel.field_D, 125);
          if (vu.field_M != null) {
            boolean decompiledFrameRemainder1 = true;
            mp.field_Lb.field_xb = true;
            lm.field_b.field_ob = 0;
            var22 = lm.field_b;
            var26 = var22;
            var26.field_gb = 0;
            so.field_d.field_ob = 0;
            var6 = so.field_d;
            var6.field_gb = 0;
            var7 = pi.field_N;
            pi.field_N.field_ob = 0;
            var7.field_gb = 0;
            if (!vu.b(false)) {
              var9_ref_String = vu.field_M.field_rc;
              kd.field_F.field_X = fo.a(4800, CampaignMenu.field_m, new String[]{var9_ref_String}).toUpperCase();
              pi.field_N.a(40, param3 - 20500, pd.field_c.field_gb, -40 + pd.field_c.field_ob, 0);
              pi.field_N.field_X = fo.a(4800, wt.field_F, new String[]{var9_ref_String});
              var8 = pi.field_N;
              decompiledFrameRemainder1 = (var19 != 0);
            }
            if (decompiledFrameRemainder1) {
              kd.field_F.field_X = tp.field_f.toUpperCase();
              var9 = (2 + pd.field_c.field_gb) / 2;
              lm.field_b.a(40, -20500, var9 - 2, -40 + pd.field_c.field_ob, 0);
              if (vu.field_M.field_nc > vu.field_M.field_Ub) {
                lm.field_b.field_X = TickCounter.field_d.toUpperCase();
                lm.field_b.field_xb = true;
                if (var19 != 0) {
                  lm.field_b.field_X = TelefragEvent.field_y.toUpperCase();
                  lm.field_b.field_xb = false;
                }
              } else {
                lm.field_b.field_X = TelefragEvent.field_y.toUpperCase();
                lm.field_b.field_xb = false;
              }
              lm.field_b.field_G = nd.field_a.field_G;
              if (0 < AnimationPlayer.field_a) {
                boolean decompiledSharedTail0 = (1 != AnimationPlayer.field_a);
                if (!decompiledSharedTail0) {
                  var10_ref_String = vf.field_c;
                  decompiledSharedTail0 = (var19 != 0);
                }
                if (decompiledSharedTail0) {
                  var10_ref_String = fo.a(4800, UnitSpell.field_h, new String[]{Integer.toString(AnimationPlayer.field_a)});
                }
                if (0 == (16 & hg.field_b) &&
                  !vk.field_f) {
                  lm.field_b.field_G = nd.field_a.field_mb;
                }
                lm.field_b.field_X = lm.field_b.field_X + "<br>" + var10_ref_String;
              }
              so.field_d.a(40, -20500, -var9 + pd.field_c.field_gb, pd.field_c.field_ob - 40, var9);
              so.field_d.field_X = ew.field_b.toUpperCase();
              var8 = so.field_d;
              stackIn_23_0 = so.field_d;
              stackIn_24_1 = (param4) && (ph.field_d == 0L);
              stackIn_23_0.field_xb = stackIn_24_1;
              var10 = 2;
              if (null != fs.field_d) {
                if (null == TeleportAction.field_B) {
                  TeleportAction.field_B = new byte[tq.field_b];
                  dt.field_d = new boolean[tq.field_b];
                }
                var11_int = 0;
                do {
                  if (!(var11_int < tq.field_b)) {
                    var10 = 0;
                    break;
                  }
                  dt.field_d[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (2 > var10) {
                    var11_int = 0;
                    stackIn_73_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_73_0;
                    while (true) {
                      stackIn_39_0 = var12;
                      stackIn_39_1 = fs.field_d.length;
                      if (stackIn_39_0 < stackIn_39_1) {
                        var25 = fs.field_d[var12];
                        var23 = var25;
                        var20 = var23;
                        var13 = var20;
                        stackIn_69_0 = 0;
                        var14_int = stackIn_69_0;
                        scanLoop2: while (true) {
                          if (var25.length > var14_int) {
                            var15 = var25[var14_int];
                            var16 = var20[1 + var14_int];
                            stackIn_60_0 = 0;
                            stackIn_60_1 = ~var15;
                            if (stackIn_60_0 == stackIn_60_1) {
                              if (var10 != 0) {
                                stackIn_48_0 = vu.field_M.field_Ub;
                              } else {
                                stackIn_48_0 = vu.field_M.field_nc;
                              }
                              var17_int = stackIn_48_0;
                              if (var17_int != var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            } else {
                              if (var16 != (vu.field_M.field_pc[var15] & 255) &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_60_0Lifetime1 = ~var15;
                            stackIn_60_1Lifetime1 = ~var25.length;
                            if (stackIn_60_0Lifetime1 <= stackIn_60_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_39_0 = ~var14_int;
                            stackIn_39_1 = ~var16;
                            if (stackIn_39_0 > stackIn_39_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          dt.field_d[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_69_0Lifetime1 = var11_int;
                    if (stackIn_69_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_73_0 = ~hi.field_j;
                  break;
                }
                if (stackIn_73_0 <= -3 &&
                  br.field_f[12]) {
                  var10 = 2;
                }
              }
              if ((var10 >= 2) &&
                (decompiledFrameRemainder1 = (ep.field_p != null ||
                null != iv.field_e ||
                jv.field_d != null ||
                null != CombatPresentation.field_j))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < tq.field_b)))) {
                  var17_int = 255 & vu.field_M.field_pc[var16];
                  if (var19 == 0) {
                    if (null != ep.field_p &&
                      null != ep.field_p[var16] &&
                      ep.field_p[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (null != iv.field_e &&
                      iv.field_e[var16] != null) {
                      var18_int = iv.field_e[var16][var17_int];
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                      if (var18_int != 0 &&
                        !bj.field_k) {
                        var11_int = 1;
                      }
                    }
                    if (CombatPresentation.field_j != null &&
                      null != CombatPresentation.field_j[var16]) {
                      var15 = var15 | CombatPresentation.field_j[var16][var17_int];
                    }
                    if (jv.field_d != null &&
                      jv.field_d[var16] != null) {
                      var18_intLifetime1 = jv.field_d[var16][var17_int];
                      if (0 != var18_intLifetime1 &&
                        !bj.field_k) {
                        var11_int = 1;
                      }
                      if (var18_intLifetime1 > var14_int) {
                        var14_int = var18_intLifetime1;
                      }
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = bu.field_a.field_Jb.field_fb;
                var18_ref = (of) (var17.first((byte) 110));
                scanLoop3: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_113_0 = var18_ref.k(param3 ^ 0);
                    stackIn_132_0 = stackOut_113_0 ? 1 : 0;
                    stackIn_114_0 = stackOut_113_0;
                    if (var19 != 0) {
                      break scanLoop3;
                    }
                    if (!stackIn_114_0 ||
                      var19 != 0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Zb) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var18_ref.field_Sb < var13_int) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_Xb < var14_int) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((~var18_ref.field_Ob & var15) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder0 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var18_ref = (of) (var17.next((byte) 123));
                      continue;
                    }
                  }
                  stackIn_132_0 = ~hi.field_j;
                  break;
                }
                if (stackIn_132_0 <= -3 &&
                  br.field_f[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  so.field_d.field_xb = false;
                  if (so.field_d.field_jb) {
                    if (ij.field_w.field_a.field_Kb != 0) {
                      ad.field_I = fo.a(4800, Battlefield.field_pb, new String[]{ob.field_O});
                      if (var19 != 0) {
                        ad.field_I = kl.field_f;
                      }
                    } else {
                      ad.field_I = kl.field_f;
                    }
                  }
                }
              }
              if ((decompiledFrameRemainder1) &&
                (!(var10 >= 2) ||
                var19 != 0)) {
                so.field_d.field_xb = false;
                if (so.field_d.field_jb) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (true) {
                    if (var13_intLifetime1 < tq.field_b) {
                      stackOut_147_0 = dt.field_d[var13_intLifetime1];
                      stackIn_155_0 = stackOut_147_0 ? 1 : 0;
                      stackIn_148_0 = stackOut_147_0;
                      if (var19 == 0) {
                        if (stackIn_148_0) {
                          var24 = "<col=A00000>" + ob.field_M[var13_intLifetime1] + "</col>";
                          if (var11 != null) {
                            var12 = 1;
                            var11 = (String) (var11) + ", " + var24;
                          } else {
                            var11 = var24;
                          }
                        }
                        var13_intLifetime1++;
                        continue;
                      }
                    } else {
                      stackIn_155_0 = var10;
                    }
                    break;
                  }
                  if (stackIn_155_0 != 0) {
                    var13_ref = l.field_h;
                    if (var12 == 0) {
                      var14 = fo.a(4800, er.field_c, new String[]{(String) (var11)});
                      if (var19 != 0) {
                        var14 = au.field_Jb + (String) (var11);
                      }
                    } else {
                      var14 = au.field_Jb + (String) (var11);
                    }
                  } else {
                    var13_ref = rd.field_f;
                    if (var12 == 0) {
                      var14 = fo.a(param3 ^ 4800, TeamRoster.field_d, new String[]{(String) (var11)});
                      if (var19 != 0) {
                        var14 = ol.field_x + (String) (var11);
                      }
                    } else {
                      var14 = ol.field_x + (String) (var11);
                    }
                  }
                  ad.field_I = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            }
            if (ph.field_d != 0L) {
              var9 = (int)(-vi.b(-111) + ph.field_d);
              var9 = (var9 + 999) / 1000;
              if (1 > var9) {
                var9 = 1;
              }
              var8.field_X = fo.a(4800, CorpseConditionMarker.field_t, new String[]{Integer.toString(var9)});
            }
            gg.field_E.field_X = fo.a(4800, ws.field_T, new String[]{Integer.toString(vu.field_M.field_Ub), Integer.toString(vu.field_M.field_nc)});
          }
          stackIn_173_0 = lk.field_a;
          stackIn_173_1 = true;
          stackIn_174_2 = (param0) && (!param1) && (!vk.field_f);
          ((je) (Object) stackIn_173_0).a(stackIn_173_1, stackIn_174_2);
          stackIn_178_0 = pd.field_c;
          stackIn_178_1 = true;
          stackIn_179_2 = (param0) && (!param1) && (!vk.field_f);
          ((je) (Object) stackIn_178_0).a(stackIn_178_1, stackIn_179_2);
          stackIn_183_0 = ta.field_R;
          stackIn_183_1 = true;
          stackIn_184_2 = (param0) && (!param1) && (vk.field_f);
          ((je) (Object) stackIn_183_0).a(stackIn_183_1, stackIn_184_2);
          ij.field_w.field_a.l(param3 ^ 10000);
          if (vu.field_M != null) {
            if (mp.field_Lb.field_yb != 0) {
              pq.a(69, vu.field_M.d((byte) -68), param2);
            }
            if (lm.field_b.field_yb != 0) {
              vk.field_f = true;
            }
            if (0 != so.field_d.field_yb) {
              cp.field_h = true;
            }
            if (dv.field_m.field_yb != 0) {
              vk.field_f = false;
            }
            vf.a(param3 + 1, false, param2, vu.field_M);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var5), "uu.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -73 / ((param1 + 45) / 47);
          stackIn_1_0 = co.a(0, param0.length, -112, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("uu.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        kl.field_a.b(param0, param2, (byte) 93);
        if (param1 >= -22) {
          field_c = (String) null;
        }
    }

    final static boolean a(boolean param0, char param1) {
        byte[] var3;
        if (!param0) {
          var3 = (byte[]) null;
          uu.a((byte[]) null, (byte) -92);
        }
        if (param1 >= 32 &&
          param1 <= 126) {
          return true;
        }
        if (160 <= param1 &&
          param1 <= 255) {
          return true;
        }
        if (8364 != param1 &&
          338 != param1 &&
          param1 != 8212 &&
          param1 != 339) {
          if (376 != param1) {
            return false;
          }
          return true;
        }
        return true;
    }

    public static void a(byte param0) {
        int var1 = -123 % ((param0 + 58) / 51);
        field_c = null;
        field_a = null;
    }

    static {
        field_a = "Rated game";
        field_c = "Offer draw";
        field_b = false;
    }
}
