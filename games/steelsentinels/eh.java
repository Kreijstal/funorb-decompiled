/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static ng field_c;
    static int[] field_d;
    static int field_a;
    static byte[] field_e;
    static int[] field_b;

    final static void a(int param0, int param1) {
        if (param1 != -17274) {
            return;
        }
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 114, 1);
        var2.a((byte) 117, 2);
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (param0 != -71) {
            return '"';
        }
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 && 160 > var2) {
            var3 = gl.field_w[-128 + var2];
            if (!(0 != var3)) {
                var3 = 63;
            }
            var2 = var3;
        }
        return (char)var2;
    }

    final static gh a(boolean param0) {
        if (param0) {
            field_c = (ng) null;
        }
        return km.field_j.field_Wb;
    }

    final static int a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        long var4 = 0L;
        int var6 = 0;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!dl.f(22759)) {
                L2: {
                  ra.field_f.a(param0 + 125, lg.a(param0 + 5, pi.field_c, oh.field_f), lg.a(param0 + 5, rj.field_j, oa.field_S));
                  if (ra.field_f.c(0)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = param0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 <= ra.field_f.field_e) {
                        L5: {
                          var3 = oc.field_b[ra.field_f.field_e];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (5 == var3) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        jc.a((byte) -2);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (in.field_a == 2) {
                      break L3;
                    } else {
                      jc.a((byte) -2);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if ((in.field_a ^ -1) == -3) {
                      var4 = mm.a(-63) + -rb.field_c;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        var3 = 2;
                        cl.a(114, true, 5);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackIn_26_0 = var3;
                break L0;
              } else {
                L7: {
                  ra.field_f.a(true);
                  if (!ra.field_f.c(0)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (-14 != (ei.field_q ^ -1)) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "eh.F(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    final static cn b(boolean param0) {
        if (param0) {
            return (cn) null;
        }
        if (!(uc.field_i != null)) {
            uc.field_i = new cn(rc.field_m, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_m.field_G, -1, 2147483647, true);
        }
        return uc.field_i;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        kg stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        kg stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        gh stackIn_22_0 = null;
        gh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ul var4 = null;
        Object var5 = null;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dd var16 = null;
        dd var17 = null;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_a = 45;
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = vi.field_W.field_Xb;

              stackIn_5_1 = 2;

              stackIn_5_2 = 2 + db.field_b;

              stackIn_5_3 = 3 * ((db.field_b + 2) * param2);

              if (vi.field_W.field_Xb != la.field_c) {
                stackIn_6_0 = (kg) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = 0;
                break L2;
              } else {
                stackIn_6_0 = (kg) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var3_int = ((kg) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 != 0, param0, (byte) -41) ? 1 : 0;
                var4 = vi.field_W.field_Wb.field_M;
                if (qc.field_P == 2) {
                  break L4;
                } else {
                  if (1 == qc.field_P) {
                    break L4;
                  } else {
                    vi.field_W.field_T = false;
                    vi.field_W.field_Xb.field_Tb.field_S = eb.field_q;
                    ue.a(0, vi.field_W.field_Wb);
                    break L3;
                  }
                }
              }
              vi.field_W.field_Xb.field_Tb.field_S = null;
              vi.field_W.field_T = true;
              var5 = null;
              var6 = (ah) ((Object) var4.e(13058));
              L5: while (true) {
                if (var6 == null) {
                  L6: {
                    if (vi.field_W.field_bc.field_Eb != 0) {
                      kc.field_y = new el(vi.field_W.field_bc.field_Rb, vi.field_W.field_bc.field_cb, vi.field_W.field_bc.field_zb, vi.field_W.field_bc.field_Lb, bm.field_W, kf.field_y, bd.field_f, bd.field_f);
                      ol.field_bc = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (vi.field_W.field_Sb.field_Eb == 0) {
                    break L3;
                  } else {
                    kc.field_y = new el(vi.field_W.field_Sb.field_Rb, vi.field_W.field_Sb.field_cb, vi.field_W.field_Sb.field_zb, vi.field_W.field_Sb.field_Lb, va.field_g, kf.field_y, bd.field_f, bd.field_f);
                    ol.field_bc = 3;
                    break L3;
                  }
                } else {
                  L7: {
                    var7 = 0;
                    if (var6.field_M == null) {
                      var6.field_Ub = new gh(0L, bb.field_W);
                      var6.a(var6.field_Ub, 121);
                      var6.field_cc = new gh(0L, bb.field_W);
                      var6.a(var6.field_cc, param1 ^ -123);
                      var7 = 1;
                      var6.h(-100);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var6.field_zb = vi.field_W.field_Wb.field_zb;
                    var6.field_Ub.a(0, 0, db.field_b, 0, var6.field_zb);
                    var8 = 0;
                    if (null == var6.field_Vb) {
                      break L8;
                    } else {
                      if (var6.field_Vb.equals("")) {
                        break L8;
                      } else {
                        var6.field_cc.field_rb = 16737894;
                        var6.field_cc.field_Pb = ce.field_p;
                        var6.field_cc.a(0, 0, db.field_b, 0, 3 + ce.field_p.field_z);
                        var8 = 1;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var9 = 0;
                    var10 = var6.field_zb;
                    if (var8 != 0) {
                      var9 = 3 + ce.field_p.field_z;
                      var10 = var10 - var9;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_22_0 = var6.field_Ub;

                    if (-1 > (var10 ^ -1)) {
                      stackIn_23_0 = (gh) ((Object) stackIn_22_0);
                      stackIn_23_1 = mi.a(var6.field_Ub.field_L, var6.field_dc, var10);
                      break L10;
                    } else {
                      stackIn_23_0 = (gh) ((Object) stackIn_22_0);
                      stackIn_23_1 = var6.field_dc;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_23_0.field_S = stackIn_23_1;
                    if (var6.field_Ub.field_S.equals(var6.field_dc)) {
                      stackIn_26_0 = 0;
                      break L11;
                    } else {
                      stackIn_26_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = stackIn_26_0;
                    var6.field_Ub.a(param1 ^ -1, 0, db.field_b, var9, var10);
                    if (var3_int == 0) {
                      var6.field_lb = -var6.field_Lb + db.field_b;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var7 != 0) {
                      vi.field_W.field_Wb.a(2, (byte) 70, (gh) (var5), var6);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      if (null == var6.field_cc) {
                        break L15;
                      } else {
                        if (!var6.field_cc.field_kb) {
                          break L15;
                        } else {
                          ll.field_i = var6.field_Vb;
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Ub.field_kb) {
                      break L14;
                    } else {
                      if (var11 != 0) {
                        ll.field_i = var6.field_dc;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L16: {
                    var5 = var6;
                    if (0 == var6.field_Eb) {
                      break L16;
                    } else {
                      kk.a(var6, -1, -1, (int[]) null, var6.field_Tb, var6.field_dc, 1073741824, 0L, vi.field_W.field_Xb);
                      var16 = an.field_i;
                      var13_ref_String = sa.field_a;
                      var16.field_j.a(param1 ^ -3, 7, var13_ref_String);
                      var17 = an.field_i;
                      var13 = oa.field_S;
                      var14 = rj.field_j;
                      var17.field_j.a(0, 0, var14, (byte) -115, var13);
                      break L16;
                    }
                  }
                  var6 = (ah) ((Object) var4.a((byte) -11));
                  continue L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "eh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_a = -1;
        field_b = new int[36];
        field_b[32] = 360;
        field_b[20] = 60;
        field_b[9] = 30;
        field_b[8] = 60;
        field_b[6] = 30;
        field_b[7] = 30;
        field_b[19] = 60;
        field_b[33] = 180;
        field_b[34] = 120;
    }
}
