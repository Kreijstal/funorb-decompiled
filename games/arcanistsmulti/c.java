/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static java.security.SecureRandom field_b;
    static String field_c;
    static ll[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        boolean decompiledFrameRemainder0 = true;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 >= param0) {
          if (param3 >= param5) {
            if (param5 <= param0) {
              wg.a(param6, 2973, param7, param0, de.field_l, param3, param2, param5, param4);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              wg.a(param7, 2973, param6, param5, de.field_l, param3, param2, param0, param4);
              decompiledFrameRemainder0 = (var9 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            wg.a(param4, 2973, param6, param3, de.field_l, param5, param2, param0, param7);
          }
        }
        if ((decompiledFrameRemainder0) &&
          (!(param3 >= param0) ||
          var9 != 0)) {
          if (param5 <= param0) {
            if (param5 > param3) {
              wg.a(param7, 2973, param4, param5, de.field_l, param0, param2, param3, param6);
              if (var9 != 0) {
                wg.a(param4, 2973, param7, param3, de.field_l, param0, param2, param5, param6);
                wg.a(param6, 2973, param4, param0, de.field_l, param5, param2, param3, param7);
              }
            } else {
              wg.a(param4, 2973, param7, param3, de.field_l, param0, param2, param5, param6);
              if (var9 != 0) {
                wg.a(param6, 2973, param4, param0, de.field_l, param5, param2, param3, param7);
              }
            }
          } else {
            wg.a(param6, 2973, param4, param0, de.field_l, param5, param2, param3, param7);
          }
        }
        if (param1 <= 60) {
          field_c = (String) null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 < 26) {
          field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        kc stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_125_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_154_0 = false;
        int stackIn_161_0 = 0;
        kc stackIn_182_0 = null;
        boolean stackIn_183_1 = false;
        kc stackIn_187_0 = null;
        boolean stackIn_188_1 = false;
        kc stackIn_192_0 = null;
        boolean stackIn_193_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_107_0;
        boolean stackOut_135_0;
        boolean stackOut_153_0;
        RuntimeException var5 = null;
        kc var6 = null;
        kc var7 = null;
        kc var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
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
        vn var17 = null;
        Object var18 = null;
        int var18_int = 0;
        cg var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        kc var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        kc var27 = null;
        int stackIn_52_0Lifetime1;
        int stackIn_52_1Lifetime1;
        int stackIn_61_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        int var13_intLifetime2;
        var18 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          ej.a(16, oo.field_y);
          if (wi.field_f != null) {
            mo.field_o.field_ub = true;
            var22 = go.field_d;
            var27 = var22;
            go.field_d.field_I = 0;
            var27.field_x = 0;
            dk.field_k.field_I = 0;
            var6 = dk.field_k;
            var6.field_x = 0;
            var7 = jf.field_d;
            jf.field_d.field_I = 0;
            var7.field_x = 0;
            if (qk.k((byte) 105)) {
              nl.field_Db.field_rb = fb.field_c.toUpperCase();
              var9 = (2 + oh.field_h.field_x) / 2;
              go.field_d.a(-2 + var9, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
              if (wi.field_f.field_Rb < wi.field_f.field_dc) {
                go.field_d.field_rb = mb.field_O.toUpperCase();
                go.field_d.field_ub = true;
                if (var19 != 0) {
                  go.field_d.field_rb = ck.field_f.toUpperCase();
                  go.field_d.field_ub = false;
                }
              } else {
                go.field_d.field_rb = ck.field_f.toUpperCase();
                go.field_d.field_ub = false;
              }
              go.field_d.field_v = ko.field_h.field_v;
              if (0 < oe.field_b) {
                if (oe.field_b != 1) {
                  var10_ref_String = tj.a(-36, new String[]{Integer.toString(oe.field_b)}, mm.field_y);
                  if (var19 != 0) {
                    var10_ref_String = qk.field_pb;
                  }
                } else {
                  var10_ref_String = qk.field_pb;
                }
                if ((16 & sb.field_e) == 0 &&
                  !so.field_j) {
                  go.field_d.field_v = ko.field_h.field_Ab;
                }
                go.field_d.field_rb = go.field_d.field_rb + "<br>" + var10_ref_String;
              }
              dk.field_k.a(oh.field_h.field_x - var9, var9, -40 + oh.field_h.field_I, 40, (byte) -120);
              dk.field_k.field_rb = nn.field_m.toUpperCase();
              stackIn_19_0 = dk.field_k;
              stackIn_20_1 = (param2) && (ba.field_a == 0L);
              stackIn_19_0.field_ub = stackIn_20_1;
              var8 = dk.field_k;
              var10 = 2;
              if (null != um.field_a) {
                if (qa.field_l == null) {
                  tk.field_q = new boolean[vf.field_l];
                  qa.field_l = new byte[vf.field_l];
                }
                var11_int = 0;
                do {
                  if (!(var11_int < vf.field_l)) {
                    var10 = 0;
                    break;
                  }
                  tk.field_q[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                L17: while (true) {
                  if (var10 < 2) {
                    var11_int = 0;
                    stackIn_65_0 = 0;
                    if (var19 != 0) {
                      break L17;
                    }
                    var12 = stackIn_65_0;
                    while (true) {
                      stackIn_34_0 = ~var12;
                      stackIn_34_1 = ~um.field_a.length;
                      if (stackIn_34_0 > stackIn_34_1) {
                        var26 = um.field_a[var12];
                        var23 = var26;
                        var20 = var23;
                        var13 = var20;
                        stackIn_61_0 = 0;
                        var14_int = stackIn_61_0;
                        L24: while (true) {
                          if (var14_int < var26.length) {
                            var15 = var26[var14_int];
                            var16 = var20[1 + var14_int];
                            stackIn_52_0 = 0;
                            stackIn_52_1 = ~var15;
                            if (stackIn_52_0 == stackIn_52_1) {
                              if (0 == var10) {
                                stackIn_43_0 = wi.field_f.field_dc;
                              } else {
                                stackIn_43_0 = wi.field_f.field_Rb;
                              }
                              var17_int = stackIn_43_0;
                              if (~var17_int != ~var16) {
                                break L24;
                              }
                            } else {
                              if (~(wi.field_f.field_Wb[var15] & 255) != ~var16) {
                                break L24;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_52_0Lifetime1 = var15;
                            stackIn_52_1Lifetime1 = var26.length;
                            if (stackIn_52_0Lifetime1 >= stackIn_52_1Lifetime1) {
                              break;
                            }
                            var16 = var26[var15];
                            stackIn_34_0 = var16;
                            stackIn_34_1 = var14_int;
                            if (stackIn_34_0 > stackIn_34_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          tk.field_q[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_61_0Lifetime1 = var11_int;
                    if (stackIn_61_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_65_0 = ~qf.field_d;
                  break;
                }
                if (stackIn_65_0 <= -3 &&
                  ri.field_b[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder3 = true;
              if ((var10 >= 2) &&
                (decompiledFrameRemainder0 = (null != dh.field_Hb ||
                null != pe.field_Fb ||
                null != dk.field_a ||
                ue.field_b != null))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(vf.field_l > var16)))) {
                  var17_int = wi.field_f.field_Wb[var16] & 255;
                  if (var19 == 0) {
                    if (dh.field_Hb != null &&
                      null != dh.field_Hb[var16] &&
                      dh.field_Hb[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (pe.field_Fb != null &&
                      pe.field_Fb[var16] != null) {
                      var18_int = pe.field_Fb[var16][var17_int];
                      if (0 != var18_int &&
                        !gm.field_c) {
                        var11_int = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    if (null != ue.field_b &&
                      null != ue.field_b[var16]) {
                      var15 = var15 | ue.field_b[var16][var17_int];
                    }
                    if (null != dk.field_a &&
                      dk.field_a[var16] != null) {
                      var18_intLifetime1 = dk.field_a[var16][var17_int];
                      if (var18_intLifetime1 != 0 &&
                        !gm.field_c) {
                        var11_int = 1;
                      }
                      if (var14_int < var18_intLifetime1) {
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
                var17 = lf.field_b.field_Cb.field_G;
                var18_ref = (cg) (var17.b(12623));
                L49: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_107_0 = var18_ref.e(183874081);
                    stackIn_125_0 = stackOut_107_0 ? 1 : 0;
                    stackIn_108_0 = stackOut_107_0;
                    if (var19 != 0) {
                      break L49;
                    }
                    if (!stackIn_108_0 ||
                      var19 != 0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Jb) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var18_ref.field_Pb < var13_int) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var14_int > var18_ref.field_Vb) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((~var18_ref.field_Bb & var15) > 0) {
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
                      var18_ref = (cg) (var17.a(0));
                      continue;
                    }
                  }
                  stackIn_125_0 = 2;
                  break;
                }
                if (stackIn_125_0 <= qf.field_d &&
                  ri.field_b[12]) {
                  var16 = 0;
                }
                if ((var16 == 0) &&
                  (decompiledFrameRemainder0 = (var19 != 0))) {
                  dk.field_k.field_ub = false;
                  decompiledFrameRemainder0 = !(!dk.field_k.field_A);
                  if (decompiledFrameRemainder0) {
                    var11 = null;
                    var12 = 0;
                    var13_intLifetime2 = 0;
                    decompiledFrameRemainder3 = !(var13_intLifetime2 >= vf.field_l);
                    if (decompiledFrameRemainder3) {
                      stackOut_135_0 = tk.field_q[var13_intLifetime2];
                      stackIn_161_0 = stackOut_135_0 ? 1 : 0;
                      stackIn_136_0 = stackOut_135_0;
                      decompiledFrameRemainder2 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder0)) {
                  dk.field_k.field_ub = false;
                  if (dk.field_k.field_A) {
                    if (tn.field_Ob.field_c.field_Mb != 0) {
                      kh.field_c = tj.a(param3 ^ 119, new String[]{ec.field_b}, q.field_O);
                      if (var19 != 0) {
                        kh.field_c = ea.field_G;
                      }
                    } else {
                      kh.field_c = ea.field_G;
                    }
                  }
                  decompiledFrameRemainder0 = (var19 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0)) {
                dk.field_k.field_ub = false;
                decompiledFrameRemainder0 = !(!dk.field_k.field_A);
                if (decompiledFrameRemainder0) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(var13_intLifetime1 >= vf.field_l)) {
                    stackOut_153_0 = tk.field_q[var13_intLifetime1];
                    stackIn_161_0 = stackOut_153_0 ? 1 : 0;
                    stackIn_154_0 = stackOut_153_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_154_0) {
                      var25 = "<col=A00000>" + ob.field_bb[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var12 = 1;
                        var11 = (String) (var11) + ", " + var25;
                      } else {
                        var11 = var25;
                      }
                    }
                    var13_intLifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                stackIn_161_0 = -1;
              }
              if (decompiledFrameRemainder0) {
                if (stackIn_161_0 != ~var10) {
                  var13_ref = on.field_i;
                  if (var12 == 0) {
                    var14 = tj.a(-11, new String[]{(String) (var11)}, hb.field_Hb);
                    if (var19 != 0) {
                      var14 = oj.field_d + (String) (var11);
                    }
                  } else {
                    var14 = oj.field_d + (String) (var11);
                  }
                } else {
                  var13_ref = hd.field_c;
                  if (var12 == 0) {
                    var14 = tj.a(-42, new String[]{(String) (var11)}, fo.field_b);
                    if (var19 != 0) {
                      var14 = rf.field_g + (String) (var11);
                    }
                  } else {
                    var14 = rf.field_g + (String) (var11);
                  }
                }
                kh.field_c = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
              if (var19 != 0) {
                var9_ref_String = wi.field_f.field_ic;
                nl.field_Db.field_rb = tj.a(param3 ^ 118, new String[]{var9_ref_String}, ul.field_j).toUpperCase();
                jf.field_d.a(oh.field_h.field_x, 0, oh.field_h.field_I - 40, 40, (byte) -120);
                jf.field_d.field_rb = tj.a(param3 + 112, new String[]{var9_ref_String}, uf.field_b);
                var8 = jf.field_d;
              }
            } else {
              var9_ref_String = wi.field_f.field_ic;
              nl.field_Db.field_rb = tj.a(param3 ^ 118, new String[]{var9_ref_String}, ul.field_j).toUpperCase();
              jf.field_d.a(oh.field_h.field_x, 0, oh.field_h.field_I - 40, 40, (byte) -120);
              jf.field_d.field_rb = tj.a(param3 + 112, new String[]{var9_ref_String}, uf.field_b);
              var8 = jf.field_d;
            }
            if (ba.field_a != 0L) {
              var9 = (int)(ba.field_a - qj.b(param3 ^ -26570));
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_rb = tj.a(113, new String[]{Integer.toString(var9)}, ef.field_v);
            }
            aj.field_d.field_rb = tj.a(116, new String[]{Integer.toString(wi.field_f.field_Rb), Integer.toString(wi.field_f.field_dc)}, ug.field_h);
          }
          stackIn_182_0 = hl.field_m;
          stackIn_183_1 = (param4) && (!param1) && (!so.field_j);
          ((kc) (Object) stackIn_182_0).b(stackIn_183_1, (byte) 60);
          stackIn_187_0 = oh.field_h;
          stackIn_188_1 = (param4) && (!param1) && (!so.field_j);
          ((kc) (Object) stackIn_187_0).b(stackIn_188_1, (byte) 69);
          stackIn_192_0 = nl.field_Fb;
          stackIn_193_1 = (param4) && (!param1) && (so.field_j);
          ((kc) (Object) stackIn_192_0).b(stackIn_193_1, (byte) 115);
          tn.field_Ob.field_c.h((byte) 118);
          if (param3 != 2) {
            return;
          }
          if (wi.field_f != null) {
            if (mo.field_o.field_U != 0) {
              qc.a(false, wi.field_f.h((byte) 94), param0);
            }
            if (0 != go.field_d.field_U) {
              so.field_j = true;
            }
            if (dk.field_k.field_U != 0) {
              bj.field_ub = true;
            }
            if (0 != gj.field_d.field_U) {
              so.field_j = false;
            }
            lm.a(false, param0, wi.field_f, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "c.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = "<%0> has declined the invitation.";
    }
}
