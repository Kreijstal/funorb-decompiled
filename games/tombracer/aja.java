/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends lea {
    static String field_G;
    static int field_H;
    static String field_I;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = super.a(param0, param1, param2);
          var5 = new ue(param2, param0);
          var5.a(2, false);
          var4.a((byte) 83, (nv) (var5));
          var6 = rm.field_a;
          var7 = (kga) (var6.a(12, 125));
          var7.b((byte) 123, 1);
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("aja.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    aja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        jea stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_80_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_145_0 = 0;
        jea stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        boolean stackIn_169_2 = false;
        jea stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        boolean stackIn_174_2 = false;
        jea stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        boolean stackIn_179_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_73_0;
        boolean stackOut_126_0;
        RuntimeException var5 = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
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
        vna var17 = null;
        Object var18 = null;
        int var18_int = 0;
        pha var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        jea var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        jea var26 = null;
        int stackIn_54_0Lifetime1;
        int stackIn_54_1Lifetime1;
        int stackIn_62_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          dga.a(fp.field_e, 199);
          if (null != uu.field_a) {
            bc.field_b.field_X = true;
            var22 = pk.field_z;
            var26 = var22;
            pk.field_z.field_t = 0;
            var26.field_G = 0;
            var6 = hw.field_a;
            hw.field_a.field_t = 0;
            var6.field_G = 0;
            var7 = dl.field_t;
            dl.field_t.field_t = 0;
            var7.field_G = 0;
            if (mka.b(param1 + 8193)) {
              wf.field_g.field_r = una.field_d.toUpperCase();
              var9 = (2 + dka.field_b.field_G) / 2;
              pk.field_z.a(-2 + var9, 40, -23776, -40 + dka.field_b.field_t, 0);
              if (uu.field_a.field_Mb >= uu.field_a.field_Jb) {
                pk.field_z.field_r = ml.field_c.toUpperCase();
                pk.field_z.field_X = false;
                if (var19 != 0) {
                  pk.field_z.field_r = eu.field_b.toUpperCase();
                  pk.field_z.field_X = true;
                }
              } else {
                pk.field_z.field_r = eu.field_b.toUpperCase();
                pk.field_z.field_X = true;
              }
              pk.field_z.field_w = hg.field_g.field_w;
              if (so.field_K > 0) {
                boolean decompiledSharedTail0 = (1 != so.field_K);
                if (!decompiledSharedTail0) {
                  var10_ref_String = sj.field_a;
                  decompiledSharedTail0 = (var19 != 0);
                }
                if (decompiledSharedTail0) {
                  var10_ref_String = gl.$cfr$intArgs$a$53ce4ab4c593(84, ld.field_f, new String[]{Integer.toString(so.field_K)});
                }
                if ((lh.field_a & 16) == 0 &&
                  !tla.field_e) {
                  pk.field_z.field_w = hg.field_g.field_C;
                }
                pk.field_z.field_r = pk.field_z.field_r + "<br>" + var10_ref_String;
              }
              hw.field_a.a(dka.field_b.field_G - var9, 40, -23776, dka.field_b.field_t - 40, var9);
              hw.field_a.field_r = ki.field_p.toUpperCase();
              var8 = hw.field_a;
              stackIn_20_0 = hw.field_a;
              stackIn_21_1 = (param3) && (uq.field_d == 0L);
              stackIn_20_0.field_X = stackIn_21_1;
              var10 = 2;
              if (null != ce.field_A) {
                if (tba.field_m == null) {
                  tba.field_m = new byte[fk.field_b];
                  sda.field_f = new boolean[fk.field_b];
                }
                var11 = 0;
                do {
                  if (!(var11 < fk.field_b)) {
                    var10 = 0;
                    break;
                  }
                  sda.field_f[var11] = false;
                  var11++;
                } while (var19 == 0);
                L17: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_66_0 = 0;
                    if (var19 != 0) {
                      break L17;
                    }
                    var12 = stackIn_66_0;
                    while (true) {
                      stackIn_36_0 = ce.field_A.length;
                      stackIn_36_1 = var12;
                      if (stackIn_36_0 > stackIn_36_1) {
                        var25 = ce.field_A[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_62_0 = 0;
                        var14 = stackIn_62_0;
                        L24: while (true) {
                          if (var25.length > var14) {
                            var15 = var25[var14];
                            var16 = var20[1 + var14];
                            stackIn_54_0 = 0;
                            stackIn_54_1 = ~var15;
                            if (stackIn_54_0 == stackIn_54_1) {
                              if (var10 != 0) {
                                stackIn_47_0 = uu.field_a.field_Mb;
                              } else {
                                stackIn_47_0 = uu.field_a.field_Jb;
                              }
                              var17_int = stackIn_47_0;
                              if (~var17_int != ~var16 &&
                                var19 == 0) {
                                break L24;
                              }
                            } else {
                              if (~var16 != ~(255 & uu.field_a.field_ac[var15])) {
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
                            stackIn_54_0Lifetime1 = var25.length;
                            stackIn_54_1Lifetime1 = var15;
                            if (stackIn_54_0Lifetime1 <= stackIn_54_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_36_0 = ~var14;
                            stackIn_36_1 = ~var16;
                            if (stackIn_36_0 > stackIn_36_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          sda.field_f[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_62_0Lifetime1 = var11;
                    if (stackIn_62_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_66_0 = 2;
                  break;
                }
                if (!(stackIn_66_0 > ld.field_e) &&
                  oj.field_tb[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                hw.field_a.field_X = false;
                decompiledFrameRemainder0 = !(!hw.field_a.field_pb);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (var13 < fk.field_b) {
                      stackOut_73_0 = sda.field_f[var13];
                      stackIn_80_0 = stackOut_73_0 ? 1 : 0;
                      stackIn_74_0 = stackOut_73_0;
                      if (var19 == 0) {
                        if (stackIn_74_0) {
                          var24 = "<col=A00000>" + kma.field_e[var13] + "</col>";
                          if (var11_ref == null) {
                            var11_ref = var24;
                          } else {
                            var11_ref = (String) (var11_ref) + ", " + var24;
                            var12 = 1;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_80_0 = var10;
                    }
                    break;
                  }
                  if (stackIn_80_0 == 0) {
                    var13_ref_String = wqa.field_J;
                    if (var12 == 0) {
                      var14_ref_String = gl.$cfr$intArgs$a$53ce4ab4c593(82, field_I, new String[]{(String) (var11_ref)});
                      if (var19 != 0) {
                        var14_ref_String = v.field_j + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = v.field_j + (String) (var11_ref);
                    }
                  } else {
                    var13_ref_String = lha.field_m;
                    if (var12 == 0) {
                      var14_ref_String = gl.$cfr$intArgs$a$53ce4ab4c593(102, bl.field_b, new String[]{(String) (var11_ref)});
                      if (var19 != 0) {
                        var14_ref_String = uda.field_w + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = uda.field_w + (String) (var11_ref);
                    }
                  }
                  qda.field_b = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != rl.field_u ||
                null != hp.field_a ||
                nra.field_g != null ||
                null != lga.field_z)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < fk.field_b)))) {
                  var17_int = uu.field_a.field_ac[var16] & 255;
                  if (var19 == 0) {
                    if (rl.field_u != null &&
                      null != rl.field_u[var16] &&
                      rl.field_u[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (null != hp.field_a &&
                      hp.field_a[var16] != null) {
                      var18_int = hp.field_a[var16][var17_int];
                      if (0 != var18_int &&
                        !dea.field_c) {
                        var11 = 1;
                      }
                      if (var13Lifetime1 < var18_int) {
                        var13Lifetime1 = var18_int;
                      }
                    }
                    if (lga.field_z != null &&
                      null != lga.field_z[var16]) {
                      var15 = var15 | lga.field_z[var16][var17_int];
                    }
                    if (null != nra.field_g &&
                      nra.field_g[var16] != null) {
                      var18_intLifetime1 = nra.field_g[var16][var17_int];
                      if (var14 < var18_intLifetime1) {
                        var14 = var18_intLifetime1;
                      }
                      if (0 != var18_intLifetime1 &&
                        !dea.field_c) {
                        var11 = 1;
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
                var17 = tn.field_n.field_tb.field_J;
                var18_ref = (pha) (var17.f(param1 - 79));
                L54: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_126_0 = var18_ref.f(162);
                    stackIn_145_0 = stackOut_126_0 ? 1 : 0;
                    stackIn_127_0 = stackOut_126_0;
                    if (var19 != 0) {
                      break L54;
                    }
                    if (!stackIn_127_0 ||
                      var19 != 0) {
                      if (var11 != 0 &&
                        !var18_ref.field_tb) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var18_ref.field_Jb < var13Lifetime1) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var18_ref.field_zb < var14) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((~var18_ref.field_Eb & var15) > 0) {
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
                      var18_ref = (pha) (var17.e(120));
                      continue;
                    }
                  }
                  stackIn_145_0 = -3;
                  break;
                }
                if (stackIn_145_0 >= ~ld.field_e &&
                  oj.field_tb[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  hw.field_a.field_X = false;
                  if (hw.field_a.field_pb) {
                    if (rm.field_e.field_a.field_wb != 0) {
                      qda.field_b = gl.$cfr$intArgs$a$53ce4ab4c593(126, sta.field_A, new String[]{kh.field_p});
                      if (var19 != 0) {
                        qda.field_b = kh.field_o;
                      }
                    } else {
                      qda.field_b = kh.field_o;
                    }
                  }
                }
              }
              if (var19 != 0) {
                var9_ref_String = uu.field_a.field_tb;
                wf.field_g.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(113, jea.field_nb, new String[]{var9_ref_String}).toUpperCase();
                dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
                dl.field_t.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(107, bja.field_d, new String[]{var9_ref_String});
                var8 = dl.field_t;
              }
            } else {
              var9_ref_String = uu.field_a.field_tb;
              wf.field_g.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(113, jea.field_nb, new String[]{var9_ref_String}).toUpperCase();
              dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
              dl.field_t.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(107, bja.field_d, new String[]{var9_ref_String});
              var8 = dl.field_t;
            }
            if (uq.field_d != 0L) {
              var9 = (int)(-bva.b((byte) -107) + uq.field_d);
              var9 = (999 + var9) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(97, he.field_b, new String[]{Integer.toString(var9)});
            }
            cea.field_a.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(106, tra.field_A, new String[]{Integer.toString(uu.field_a.field_Mb), Integer.toString(uu.field_a.field_Jb)});
          }
          stackIn_168_0 = nra.field_c;
          stackIn_168_1 = -98;
          stackIn_169_2 = (param4) && (!param0) && (!tla.field_e);
          ((jea) (Object) stackIn_168_0).c(stackIn_168_1, stackIn_169_2);
          stackIn_173_0 = dka.field_b;
          stackIn_173_1 = 67;
          stackIn_174_2 = (param4) && (!param0) && (!tla.field_e);
          ((jea) (Object) stackIn_173_0).c(stackIn_173_1, stackIn_174_2);
          stackIn_178_0 = hf.field_a;
          stackIn_178_1 = 36;
          stackIn_179_2 = (param4) && (!param0) && (tla.field_e);
          ((jea) (Object) stackIn_178_0).c(stackIn_178_1, stackIn_179_2);
          rm.field_e.field_a.e((byte) -98);
          if (param1 != -1) {
            return;
          }
          if (null != uu.field_a) {
            if (0 != bc.field_b.field_y) {
              et.a(param2, 30, uu.field_a.f(0));
            }
            if (hw.field_a.field_y != 0) {
              hoa.field_p = true;
            }
            if (pk.field_z.field_y != 0) {
              tla.field_e = true;
            }
            if (fsa.field_q.field_y != 0) {
              tla.field_e = false;
            }
            cm.a(param2, uu.field_a, param1 ^ 21289, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "aja.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void A(int param0) {
        field_I = null;
        if (param0 != 32076) {
          aja.a(false, 126, -63, false, true);
        }
        field_G = null;
    }

    aja(la param0, int param1) {
        super(param0, param1);
    }

    static {
        field_G = "Reject <%0> from this game";
        field_I = "Please select an option in the '<%0>' row.";
    }
}
