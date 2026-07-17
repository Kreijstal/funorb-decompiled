/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cf extends ci {
    private int field_Mb;
    private int field_Pb;
    static int field_Lb;
    private ci field_Qb;
    private int field_Rb;
    static ag field_Tb;
    static long field_Jb;
    static boolean field_Nb;
    private int[] field_Kb;
    private int field_Sb;
    private ci field_Hb;
    private int field_Fb;
    private int field_Ib;
    private km[] field_Ob;
    private int field_Eb;
    private tl[] field_Gb;

    final static aj b(int param0, boolean param1) {
        if (param0 != 18621) {
            return null;
        }
        aj var2 = new aj(true);
        var2.field_f = param1 ? true : false;
        return var2;
    }

    final boolean l(int param0) {
        if (param0 != 3) {
            aj discarded$0 = cf.b(55, true);
        }
        if (((cf) this).field_Pb != -2) {
            return false;
        }
        if (13 != vg.field_a) {
            return true;
        }
        ((cf) this).field_Pb = -1;
        return true;
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ci var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ci var8_ref_ci = null;
        int var9_int = 0;
        tl var9 = null;
        int var10_int = 0;
        tl var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ci var14 = null;
        int var15 = 0;
        int stackIn_4_0 = 0;
        ci stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ci stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ci stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ci stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ci stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        ci stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        var13 = Chess.field_G;
        try {
          L0: {
            L1: {
              vi.field_d = wb.field_h;
              fn.field_c = wb.field_c;
              if (param1) {
                stackOut_3_0 = aj.field_c;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ed.field_c;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              f.a(stackIn_4_0, true);
              qa.field_f.a(fm.field_T.field_M, 0, 0, -2 + (-40 + fm.field_T.field_pb), true);
              ec.field_j.a(0, de.field_d.field_M, -2147483648, fe.field_g, 0);
              stackOut_4_0 = ln.field_vc;
              stackOut_4_1 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (bo.field_c) {
                stackOut_6_0 = (ci) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = sc.field_e + 44;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (ci) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            L3: {
              ((ci) (Object) stackIn_7_0).a(stackIn_7_1, -stackIn_7_2 + de.field_d.field_M, -2147483648, 18, fe.field_g + 2);
              nb.field_Ib.a(-2 + (de.field_d.field_M - sc.field_e - 40), 42 - -sc.field_e, -2147483648, 18, 2 + fe.field_g);
              se.field_S.a(2, -20 + (de.field_d.field_pb + -fe.field_g) + -2, 20 + (fe.field_g + 2), -3, sc.field_e, 0, de.field_d.field_M);
              sc.field_d.a(0, fm.field_T.field_M, -2147483648, 40, fm.field_T.field_pb - 40);
              sc.field_f.a(0, ri.field_k.field_M, -2147483648, 30, 0);
              ce.field_d.a(0, ri.field_k.field_M, -2147483648, -2 + (-40 + ri.field_k.field_pb + -30), 30);
              var2_int = 3 + qa.field_e;
              if (wn.field_d.length >= 2) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (param1) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + (-10 + (-5 + ce.field_d.field_pb) + -5 + (2 + (1 + var2_int) / 2)) / (var2_int - -1);
              if (var3 <= 30) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -5 + ce.field_d.field_pb + (-5 - var2_int * (var3 + 2));
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            s.field_M.a(5, -5 + ce.field_d.field_M + -5, -2147483648, var4, 5);
            var5 = 2 + (var4 + 5);
            var6 = 0;
            L7: while (true) {
              if (4 + qa.field_e <= var6) {
                L8: {
                  if (param0 > 121) {
                    break L8;
                  } else {
                    field_Nb = true;
                    break L8;
                  }
                }
                ah.field_i.a(wb.field_h - 360 >> 1, 360, -2147483648, -10 + (-120 + wb.field_c - 14), 10);
                qf.field_f.a(0, ah.field_i.field_M, -2147483648, 24, 0);
                dn.field_c.a(0, ah.field_i.field_M, -2147483648, -24 + ah.field_i.field_pb, 24);
                dn.field_c.field_Ab = wh.a(67, dn.field_c.field_pb, 3, 11579568, 8421504, 1);
                bh.field_G.a(5, -10 + dn.field_c.field_M, -2147483648, -2 + (-24 + (-10 + dn.field_c.field_pb)), 5);
                hn.field_d.a((-80 + dn.field_c.field_M) / 2, 80, -2147483648, 24, -24 + dn.field_c.field_pb - 5);
                dj.g(2);
                break L0;
              } else {
                L9: {
                  L10: {
                    if (var6 != 1) {
                      break L10;
                    } else {
                      if (2 > wn.field_d.length) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (3 != var6) {
                      break L11;
                    } else {
                      if (1 >= un.field_q) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (param1) {
                      break L12;
                    } else {
                      if (var6 == 3) {
                        var7 = hm.field_c[var6];
                        hm.field_c[var6].field_pb = 0;
                        var7.field_M = 0;
                        var8 = 0;
                        L13: while (true) {
                          if (var8 >= ba.field_P[var6].length) {
                            break L9;
                          } else {
                            L14: {
                              if (null != ba.field_P[var6][var8]) {
                                var9 = ba.field_P[var6][var8];
                                ba.field_P[var6][var8].field_pb = 0;
                                var9.field_M = 0;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var8++;
                            continue L13;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L15: {
                    if (!param1) {
                      break L15;
                    } else {
                      if (var6 != 0) {
                        break L15;
                      } else {
                        var14 = hm.field_c[var6];
                        var7 = var14;
                        hm.field_c[var6].field_pb = 0;
                        var14.field_M = 0;
                        var8 = 0;
                        L16: while (true) {
                          if (ba.field_P[var6].length <= var8) {
                            break L9;
                          } else {
                            L17: {
                              if (null == ba.field_P[var6][var8]) {
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L18: {
                    if (param1) {
                      if (var6 >= 4) {
                        if (sf.field_v != null) {
                          if (sf.field_v[var6 - 4]) {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            break L18;
                          } else {
                            stackOut_41_0 = 0;
                            stackIn_44_0 = stackOut_41_0;
                            break L18;
                          }
                        } else {
                          stackOut_39_0 = 0;
                          stackIn_44_0 = stackOut_39_0;
                          break L18;
                        }
                      } else {
                        stackOut_37_0 = 0;
                        stackIn_44_0 = stackOut_37_0;
                        break L18;
                      }
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      break L18;
                    }
                  }
                  var7_int = stackIn_44_0;
                  if (var7_int != 0) {
                    var8_ref_ci = hm.field_c[var6];
                    hm.field_c[var6].field_pb = 0;
                    var8_ref_ci.field_M = 0;
                    var15 = 0;
                    var9_int = var15;
                    L19: while (true) {
                      if (var15 >= ba.field_P[var6].length) {
                        break L9;
                      } else {
                        L20: {
                          if (ba.field_P[var6][var15] != null) {
                            var10 = ba.field_P[var6][var15];
                            ba.field_P[var6][var15].field_pb = 0;
                            var10.field_M = 0;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var15++;
                        continue L19;
                      }
                    }
                  } else {
                    L21: {
                      hm.field_c[var6].a(5, 103, -2147483648, var3, var5);
                      var8 = 110;
                      if (param1) {
                        ba.field_P[var6][0].a(38, qc.field_e, var3, var8, var5, (byte) -22, 2);
                        var8 += 40;
                        break L21;
                      } else {
                        if (ba.field_P[var6][0] == null) {
                          break L21;
                        } else {
                          var9 = ba.field_P[var6][0];
                          ba.field_P[var6][0].field_pb = 0;
                          var9.field_M = 0;
                          break L21;
                        }
                      }
                    }
                    var9_int = 2 + (-var8 + ri.field_k.field_M) - 5;
                    var10_int = ba.field_P[var6].length + -1;
                    var11 = 0;
                    L22: while (true) {
                      if (var10_int <= var11) {
                        var5 = var5 + (2 + var3);
                        break L9;
                      } else {
                        var12 = var9_int * var11 / var10_int;
                        ba.field_P[var6][1 + var11].a(-var12 + ((1 + var11) * var9_int / var10_int - 2), qc.field_e, var3, var12 + var8, var5, (byte) -22, 2);
                        var11++;
                        continue L22;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "cf.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        int discarded$3 = ve.f((byte) -76);
        if (param1 >= -77) {
            field_Nb = false;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        ((cf) this).a(param0, (byte) 88);
        if (!(param0)) {
            return -2;
        }
        for (var3 = 0; ((cf) this).field_Sb > var3; var3++) {
            if (((cf) this).field_Gb[var3].field_L != 0) {
                return ((cf) this).field_Kb[var3];
            }
        }
        if (param1 > -11) {
            return -5;
        }
        if (!(0 == th.field_d)) {
            return -1;
        }
        return ((cf) this).field_Pb;
    }

    cf(cf param0) {
        this((ci) (Object) param0, param0.field_Ob, param0.field_Hb, param0.field_Qb, param0.field_Ib, param0.field_Rb, param0.field_Mb, param0.field_Eb, param0.field_Fb);
    }

    public static void k(int param0) {
        field_Tb = null;
        if (param0 != 5) {
            cf.k(-58);
        }
    }

    cf(ci param0, km[] param1, ci param2, ci param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((cf) this).field_Pb = -2;
        ((cf) this).field_Kb = new int[256];
        ((cf) this).field_Gb = new tl[256];
        try {
            ((cf) this).field_Ob = param1;
            ((cf) this).field_Eb = param7;
            ((cf) this).field_Fb = param8;
            ((cf) this).field_Rb = param5;
            ((cf) this).field_Qb = param3;
            ((cf) this).field_Mb = param6;
            ((cf) this).field_Hb = param2;
            ((cf) this).field_Ib = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(byte param0, String param1, int param2) {
        try {
            ((cf) this).field_Gb[((cf) this).field_Sb] = new tl(0L, (ci) null, (ci) null, ((cf) this).field_Qb, (km) null, param1);
            ((cf) this).field_Gb[((cf) this).field_Sb].field_Q = ((cf) this).field_Ob;
            ((cf) this).field_Gb[((cf) this).field_Sb].field_w = true;
            ((cf) this).field_Gb[((cf) this).field_Sb].field_cb = 1;
            if (param0 != -12) {
                ((cf) this).field_Ib = 65;
            }
            ((cf) this).a((byte) 127, (ci) (Object) ((cf) this).field_Gb[((cf) this).field_Sb]);
            ((cf) this).field_Kb[((cf) this).field_Sb] = param2;
            ((cf) this).field_Sb = ((cf) this).field_Sb + 1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cf.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = Chess.field_G;
        try {
          var3 = qc.a(param0, false, (byte) 109);
          if (var3 == null) {
            L0: {
              if (param1 <= -48) {
                break L0;
              } else {
                field_Nb = true;
                break L0;
              }
            }
            var4 = 0;
            L1: while (true) {
              if (param0.length() > var4) {
                if (am.a(-16, param0.charAt(var4))) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_10_0 = bi.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("cf.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + 0 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 <= 69) {
            Object var4 = null;
            String discarded$0 = cf.a((CharSequence) null, -29, false);
        }
        if (!param1) {
            wb.b();
        } else {
            wb.b(0, 0, wb.field_h, wb.field_c, 0, 192);
        }
        qe.a((byte) -31, param1);
    }

    final void a(byte param0, String param1, km param2, int param3) {
        try {
            ((cf) this).field_Gb[((cf) this).field_Sb] = new tl(0L, (ci) null, (ci) null, ((cf) this).field_Qb, param2, param1);
            ((cf) this).field_Gb[((cf) this).field_Sb].field_Q = ((cf) this).field_Ob;
            ((cf) this).field_Gb[((cf) this).field_Sb].field_w = true;
            ((cf) this).field_Gb[((cf) this).field_Sb].field_cb = 1;
            ((cf) this).a((byte) 127, (ci) (Object) ((cf) this).field_Gb[((cf) this).field_Sb]);
            ((cf) this).field_Kb[((cf) this).field_Sb] = param3;
            if (param0 != -110) {
                cf.a(-53, (byte) 21);
            }
            ((cf) this).field_Sb = ((cf) this).field_Sb + 1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cf.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        r.k(param3 + 2949);
        wb.e(param4, param2, param1, param0);
        if (param3 != 80) {
            aj discarded$0 = cf.b(77, false);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Chess.field_G;
          if (((cf) this).field_Sb != 0) {
            break L0;
          } else {
            ((cf) this).field_Gb[((cf) this).field_Sb] = new tl(0L, (ci) null, (ci) null, ((cf) this).field_Hb, (km) null, w.field_Gb);
            ((cf) this).field_Gb[((cf) this).field_Sb].field_cb = 1;
            ((cf) this).a((byte) 127, (ci) (Object) ((cf) this).field_Gb[((cf) this).field_Sb]);
            ((cf) this).field_Kb[((cf) this).field_Sb] = -1;
            ((cf) this).field_Sb = ((cf) this).field_Sb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((cf) this).field_Sb <= var7) {
            var6 = var6 + 2 * ((cf) this).field_Ib;
            var7 = ((cf) this).field_Eb - (-(((cf) this).field_Fb * ((cf) this).field_Sb) + -((cf) this).field_Eb);
            var8 = ao.a(var6, param0, param1, param4);
            var9 = sg.a(param3, var7, param2, 0);
            ((cf) this).a(var8, var6, -2147483648, var7, var9);
            var10 = 0;
            L2: while (true) {
              if (((cf) this).field_Sb <= var10) {
                return;
              } else {
                ((cf) this).field_Gb[var10].a(-(2 * ((cf) this).field_Ib) + var6, ((cf) this).field_Mb, ((cf) this).field_Fb, ((cf) this).field_Ib, ((cf) this).field_Fb * var10 + ((cf) this).field_Eb, (byte) -22, ((cf) this).field_Rb);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = ((cf) this).field_Gb[var7].a(((cf) this).field_Mb, ((cf) this).field_Rb, true);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Tb = new ag();
        field_Nb = false;
    }
}
