/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends pp {
    boolean field_i;
    static ht field_l;
    static sna field_k;
    static sna field_j;

    public static void a(int param0) {
        if (param0 != -15947) {
          mh.a(true, true, true, 49, (byte) 86);
        }
        field_j = null;
        field_l = null;
        field_k = null;
    }

    final void a(lu param0, byte param1) {
        try {
          int var3_int = -92 / ((param1 - 34) / 58);
          er.a(this.field_h, 126, param0);
          param0.d(this.field_i ? 1 : 0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
          if (param2 != 12) {
            this.field_i = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mh.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, byte param4) {
        sna stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        boolean stackIn_80_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_134_0 = false;
        int stackIn_148_0 = 0;
        sna stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        boolean stackIn_168_2 = false;
        sna stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        boolean stackIn_173_2 = false;
        sna stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        boolean stackIn_178_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_79_0;
        boolean stackOut_133_0;
        sna var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        sna var6 = null;
        sna var7 = null;
        sna var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
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
        eaa var17 = null;
        Object var18 = null;
        int var18_int = 0;
        ema var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var23 = null;
        int stackIn_55_0Lifetime1;
        int stackIn_55_1Lifetime1;
        int stackIn_64_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = BachelorFridge.field_y;
        try {
          dna.c(dja.field_m, false);
          if (pw.field_w != null) {
            boolean decompiledFrameRemainder1 = true;
            jj.field_wb.field_u = true;
            ik.field_i.field_p = 0;
            var5 = ik.field_i;
            var5.field_sb = 0;
            cn.field_j.field_p = 0;
            var6 = cn.field_j;
            var6.field_sb = 0;
            cw.field_yb.field_p = 0;
            var7 = cw.field_yb;
            var7.field_sb = 0;
            if (!ps.d(-119)) {
              var9_ref_String = pw.field_w.field_Jb;
              vaa.field_a.field_Z = lga.a(true, new String[]{var9_ref_String}, fq.field_r).toUpperCase();
              cw.field_yb.a(40, 31407, ho.field_g.field_sb, 0, -40 + ho.field_g.field_p);
              cw.field_yb.field_Z = lga.a(true, new String[]{var9_ref_String}, ne.field_n);
              var8 = cw.field_yb;
              decompiledFrameRemainder1 = (var19 != 0);
            }
            if (decompiledFrameRemainder1) {
              vaa.field_a.field_Z = tea.field_lb.toUpperCase();
              var9 = (2 + ho.field_g.field_sb) / 2;
              ik.field_i.a(40, 31407, -2 + var9, 0, ho.field_g.field_p - 40);
              if (pw.field_w.field_Pb <= pw.field_w.field_Rb) {
                ik.field_i.field_Z = oia.field_i.toUpperCase();
                ik.field_i.field_u = false;
                if (var19 != 0) {
                  ik.field_i.field_Z = pe.field_l.toUpperCase();
                  ik.field_i.field_u = true;
                }
              } else {
                ik.field_i.field_Z = pe.field_l.toUpperCase();
                ik.field_i.field_u = true;
              }
              ik.field_i.field_eb = vo.field_b.field_eb;
              if (hc.field_J > 0) {
                if (hc.field_J != 1) {
                  var10_ref_String = lga.a(true, new String[]{Integer.toString(hc.field_J)}, mk.field_y);
                  if (var19 != 0) {
                    var10_ref_String = mu.field_m;
                  }
                } else {
                  var10_ref_String = mu.field_m;
                }
                ik.field_i.field_Z = ik.field_i.field_Z + "<br>" + var10_ref_String;
                if ((16 & qf.field_v) == 0 &&
                  !w.field_e) {
                  ik.field_i.field_eb = vo.field_b.field_A;
                }
              }
              cn.field_j.a(40, 31407, -var9 + ho.field_g.field_sb, var9, ho.field_g.field_p - 40);
              cn.field_j.field_Z = l.field_q.toUpperCase();
              stackIn_20_0 = cn.field_j;
              stackIn_21_1 = (param0) && (wda.field_a == 0L);
              stackIn_20_0.field_u = stackIn_21_1;
              var8 = cn.field_j;
              var10 = 2;
              if (pha.field_h != null) {
                if (bja.field_o == null) {
                  ala.field_b = new boolean[ld.field_q];
                  bja.field_o = new byte[ld.field_q];
                }
                var11 = 0;
                do {
                  if (!(var11 < ld.field_q)) {
                    var10 = 0;
                    break;
                  }
                  ala.field_b[var11] = false;
                  var11++;
                } while (var19 == 0);
                L16: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_70_0 = 0;
                    if (var19 != 0) {
                      break L16;
                    }
                    var12 = stackIn_70_0;
                    while (true) {
                      stackIn_36_0 = ~var12;
                      stackIn_36_1 = ~pha.field_h.length;
                      if (stackIn_36_0 > stackIn_36_1) {
                        var23 = pha.field_h[var12];
                        var21 = var23;
                        var20 = var21;
                        var13_ref_int__ = var20;
                        stackIn_64_0 = 0;
                        var14 = stackIn_64_0;
                        L23: while (true) {
                          if (var23.length > var14) {
                            var15 = var23[var14];
                            var16 = var20[1 + var14];
                            stackIn_55_0 = 0;
                            stackIn_55_1 = ~var15;
                            if (stackIn_55_0 != stackIn_55_1) {
                              if ((255 & pw.field_w.field_Eb[var15]) != var16) {
                                break L23;
                              }
                            } else {
                              if (var10 == 0) {
                                stackIn_48_0 = pw.field_w.field_Pb;
                              } else {
                                stackIn_48_0 = pw.field_w.field_Rb;
                              }
                              var17_int = stackIn_48_0;
                              if (~var16 != ~var17_int &&
                                var19 == 0) {
                                break L23;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_55_0Lifetime1 = var15;
                            stackIn_55_1Lifetime1 = var23.length;
                            if (stackIn_55_0Lifetime1 >= stackIn_55_1Lifetime1) {
                              break;
                            }
                            var16 = var23[var15];
                            stackIn_36_0 = var14;
                            stackIn_36_1 = var16;
                            if (stackIn_36_0 < stackIn_36_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          ala.field_b[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_64_0Lifetime1 = var11;
                    if (stackIn_64_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_70_0 = ~hea.field_r;
                  break;
                }
                if (stackIn_70_0 <= -3 &&
                  wga.field_q[12]) {
                  var10 = 2;
                }
              }
              if (var10 < 2) {
                cn.field_j.field_u = false;
                decompiledFrameRemainder1 = !(!cn.field_j.field_E);
                if (decompiledFrameRemainder1) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (ld.field_q > var13) {
                      stackOut_79_0 = ala.field_b[var13];
                      stackIn_87_0 = stackOut_79_0 ? 1 : 0;
                      stackIn_80_0 = stackOut_79_0;
                      if (var19 == 0) {
                        if (stackIn_80_0) {
                          var22 = "<col=A00000>" + kka.field_k[var13] + "</col>";
                          if (var11_ref == null) {
                            var11_ref = var22;
                          } else {
                            var11_ref = (String) (var11_ref) + ", " + var22;
                            var12 = 1;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_87_0 = 0;
                    }
                    break;
                  }
                  if (stackIn_87_0 != var10) {
                    var13_ref_String = nq.field_h;
                    boolean decompiledSharedTail2 = (var12 == 0);
                    if (!decompiledSharedTail2) {
                      var14_ref_String = oda.field_b + (String) (var11_ref);
                      decompiledSharedTail2 = (var19 != 0);
                    }
                    if (decompiledSharedTail2) {
                      var14_ref_String = lga.a(true, new String[]{(String) (var11_ref)}, ec.field_b);
                    }
                  } else {
                    var13_ref_String = aha.field_H;
                    boolean decompiledSharedTail1 = (var12 == 0);
                    if (!decompiledSharedTail1) {
                      var14_ref_String = ag.field_k + (String) (var11_ref);
                      decompiledSharedTail1 = (var19 != 0);
                    }
                    if (decompiledSharedTail1) {
                      var14_ref_String = lga.a(true, new String[]{(String) (var11_ref)}, qk.field_p);
                    }
                  }
                  jja.field_m = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder1) && (!(var10 < 2) || var19 != 0) && (hr.field_b != null ||
                null != re.field_F ||
                null != gma.field_c ||
                null != wda.field_c)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(ld.field_q > var16)))) {
                  var17_int = pw.field_w.field_Eb[var16] & 255;
                  if (var19 == 0) {
                    if (hr.field_b != null &&
                      hr.field_b[var16] != null &&
                      hr.field_b[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (null != re.field_F &&
                      null != re.field_F[var16]) {
                      var18_int = re.field_F[var16][var17_int];
                      if (var18_int != 0 &&
                        !bha.field_l) {
                        var11 = 1;
                      }
                      if (var18_int > var13Lifetime1) {
                        var13Lifetime1 = var18_int;
                      }
                    }
                    if (null != wda.field_c &&
                      wda.field_c[var16] != null) {
                      var15 = var15 | wda.field_c[var16][var17_int];
                    }
                    if (null != gma.field_c &&
                      null != gma.field_c[var16]) {
                      var18_intLifetime1 = gma.field_c[var16][var17_int];
                      if (0 != var18_intLifetime1 &&
                        !bha.field_l) {
                        var11 = 1;
                      }
                      if (var18_intLifetime1 > var14) {
                        var14 = var18_intLifetime1;
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
                var17 = ak.field_q.field_vb.field_z;
                var18_ref = (ema) (var17.b((byte) 90));
                L54: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_133_0 = var18_ref.f((byte) 21);
                    stackIn_148_0 = stackOut_133_0 ? 1 : 0;
                    stackIn_134_0 = stackOut_133_0;
                    if (var19 != 0) {
                      break L54;
                    }
                    if (!stackIn_134_0) {
                      if (var11 != 0 &&
                        !var18_ref.field_zb) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var13Lifetime1 > var18_ref.field_Jb) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_Gb < var14) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((var15 & ~var18_ref.field_xb) > 0) {
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
                      var18_ref = (ema) (var17.c(0));
                      continue;
                    }
                  }
                  stackIn_148_0 = -3;
                  break;
                }
                if (stackIn_148_0 >= ~hea.field_r &&
                  wga.field_q[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  cn.field_j.field_u = false;
                  if (cn.field_j.field_E) {
                    boolean decompiledSharedTail0 = (0 != pf.field_n.field_a.field_yb);
                    if (!decompiledSharedTail0) {
                      jja.field_m = bma.field_t;
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      jja.field_m = lga.a(true, new String[]{hfa.field_B}, n.field_c);
                    }
                  }
                }
              }
            }
            if (wda.field_a != 0L) {
              var9 = (int)(-f.b((byte) 73) + wda.field_a);
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_Z = lga.a(true, new String[]{Integer.toString(var9)}, jk.field_p);
            }
            mja.field_t.field_Z = lga.a(true, new String[]{Integer.toString(pw.field_w.field_Rb), Integer.toString(pw.field_w.field_Pb)}, gfa.field_b);
          }
          stackIn_167_0 = ela.field_i;
          stackIn_167_1 = 19842;
          stackIn_168_2 = (param2) && (!param1) && (!w.field_e);
          ((sna) (Object) stackIn_167_0).a(stackIn_167_1, stackIn_168_2);
          stackIn_172_0 = ho.field_g;
          stackIn_172_1 = 19842;
          stackIn_173_2 = (param2) && (!param1) && (!w.field_e);
          ((sna) (Object) stackIn_172_0).a(stackIn_172_1, stackIn_173_2);
          stackIn_177_0 = qw.field_b;
          stackIn_177_1 = 19842;
          stackIn_178_2 = (param2) && (!param1) && (w.field_e);
          ((sna) (Object) stackIn_177_0).a(stackIn_177_1, stackIn_178_2);
          pf.field_n.field_a.f(18632);
          if (null != pw.field_w) {
            if (0 != jj.field_wb.field_R) {
              rja.a(param3, pw.field_w.f((byte) -62), 1);
            }
            if (ik.field_i.field_R != 0) {
              w.field_e = true;
            }
            if (cn.field_j.field_R != 0) {
              aba.field_f = true;
            }
            if (0 != vca.field_h.field_R) {
              w.field_e = false;
            }
            wp.a(false, pw.field_w, param3, false);
          }
          var5_int = -73 / ((param4 - 27) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5_ref), "mh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    mh(nq param0, boolean param1) {
        try {
          this.field_h = param0;
          this.field_i = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
