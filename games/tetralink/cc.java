/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements kg {
    static hl field_j;
    private int field_l;
    private int field_c;
    private int field_k;
    static int field_f;
    private int field_h;
    private int field_i;
    private jb field_g;
    private int field_b;
    static oh field_a;
    private int field_d;
    static String field_e;

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!tk.a((byte) 81, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!tk.a((byte) 81, param0.charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (var4 >= 1) {
                if (var4 <= 12) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var6 >= var3) {
                      L5: {
                        if (param1 >= 94) {
                          break L5;
                        } else {
                          int discarded$2 = cc.a(86, (byte) -28);
                          break L5;
                        }
                      }
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (sj.a(3010, (char) var7)) {
                        var8 = kb.a((char) var7, -122);
                        if (var8 != 0) {
                          StringBuilder discarded$3 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static short[] a(short[] param0, bc param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        var4 = param1.e(param2, (byte) -112);
        if (0 != var4) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (var4 == param0.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param1.e(4, (byte) -112);
            var6 = (short)param1.e(16, (byte) -112);
            if (param3 < var5) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param0[var7] = (short)(var6 + param1.e(var5, (byte) -112));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final static void c(int param0) {
        dd.b(param0 + -17958);
        if (param0 != 17896) {
            return;
        }
        qa.field_v = true;
        jd.field_a = true;
        mf.field_s.i(0);
        uf.a(id.field_n, false, false);
    }

    final static int a(byte param0, int param1) {
        param1 = (param1 & 1431655765) - -((param1 & -1431655765) >>> -1454048415);
        param1 = (param1 >>> 680778306 & -1288490189) + (858993459 & param1);
        param1 = (param1 >>> -665210812) + param1 & 252645135;
        param1 = param1 + (param1 >>> -2024446008);
        param1 = param1 + (param1 >>> 1484886160);
        if (param0 != 71) {
            return -19;
        }
        return 255 & param1;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qd var14 = null;
        na stackIn_3_0 = null;
        na stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof qd) {
            stackOut_2_0 = (na) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (na) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (qd) (Object) stackIn_3_0;
          ra.c(param0.field_t + param1, param2 + param0.field_w, param0.field_F, param0.field_u, ((cc) this).field_b);
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = param1 + (param0.field_t - -var14.field_V);
          var8 = param2 - (-param0.field_w - var14.field_Z);
          ra.f(var7, var8, var14.field_bb, ((cc) this).field_h);
          if (param3) {
            break L2;
          } else {
            ((cc) this).field_b = 42;
            break L2;
          }
        }
        L3: {
          if (-1 == var14.field_U) {
            break L3;
          } else {
            var9 = (double)var14.field_U * 3.141592653589793 * 2.0 / (double)var14.field_R;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
            var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
            ra.f(var7 - -var11, var12 + var8, 1, ((cc) this).field_l);
            break L3;
          }
        }
        L4: {
          ra.f(var7, var8, 2, 1);
          var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_R;
          var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
          var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
          ra.d(var7, var8, var11 + var7, var8 - -var12, 1);
          if (((cc) this).field_g == null) {
            break L4;
          } else {
            var13 = var14.field_V - -var14.field_bb - -((cc) this).field_k;
            int discarded$1 = ((cc) this).field_g.a(param0.field_A, param0.field_t + (param1 - -var13), ((cc) this).field_d + (param2 + param0.field_w), -var13 + (-((cc) this).field_k + param0.field_F), param0.field_u - (((cc) this).field_k << 1417374529), ((cc) this).field_i, ((cc) this).field_c, 1, 1, 0);
            break L4;
          }
        }
    }

    final static db[] b(int param0) {
        if (param0 <= 36) {
            return null;
        }
        return new db[]{rj.field_f, qj.field_c, ej.field_r, ni.field_h, e.field_e, mk.field_c, ji.field_Qb, la.field_i, dj.field_g, io.field_d, hh.field_b, uk.field_t, je.field_d, wd.field_e};
    }

    final static boolean a(String param0, byte param1) {
        CharSequence var3 = null;
        if (param1 != -80) {
            field_j = null;
        }
        if (!(cl.field_e)) {
            return false;
        }
        if (-3 == (sf.field_d ^ -1)) {
            if (null != qj.field_a) {
                var3 = (CharSequence) (Object) param0;
                if (qj.field_a.equals((Object) (Object) cc.a(var3, (byte) 95))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        int var1 = 57 / ((param0 - -40) / 56);
    }

    cc(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((cc) this).field_i = param3;
        ((cc) this).field_d = param2;
        ((cc) this).field_c = param4;
        ((cc) this).field_l = param6;
        ((cc) this).field_b = param7;
        ((cc) this).field_h = param5;
        ((cc) this).field_k = param1;
        ((cc) this).field_g = param0;
    }

    final static void b(boolean param0, boolean param1) {
        if (ak.a(3058)) {
            param1 = false;
        }
        on.a(param0, param1);
        kk.g(-1);
    }

    final static int a(int param0, byte param1) {
        param0--;
        if (param1 > -47) {
            field_e = null;
        }
        param0 = param0 | param0 >>> -1459686527;
        param0 = param0 | param0 >>> 168924194;
        param0 = param0 | param0 >>> 1598413220;
        param0 = param0 | param0 >>> -90960056;
        param0 = param0 | param0 >>> -1084891856;
        return param0 - -1;
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        int var7_int = 0;
        int var8 = 0;
        hl var8_ref_hl = null;
        int var9_int = 0;
        nh var9 = null;
        int var10_int = 0;
        nh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        hl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        hl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        hl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_39_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        hl stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        hl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        hl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var13 = TetraLink.field_J;
          cf.field_n = ra.field_f;
          bk.field_c = ra.field_e;
          if (!param0) {
            stackOut_2_0 = am.field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ng.field_t;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          nb.a(stackIn_3_0, (byte) 1);
          we.field_e.a(0, 0, -40 + tl.field_P.field_R + -2, 66, tl.field_P.field_Hb);
          e.field_d.a((byte) -92, qd.field_Q.field_Hb, 0, qe.field_d, 0);
          stackOut_3_0 = ae.field_J;
          stackOut_3_1 = -92;
          stackOut_3_2 = qd.field_Q.field_Hb;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          if (!kj.field_b) {
            stackOut_5_0 = (hl) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            break L1;
          } else {
            stackOut_4_0 = (hl) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = 2 + ha.field_e - -42;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            break L1;
          }
        }
        L2: {
          ((hl) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2 + -stackIn_6_3, qe.field_d + 2, 18, 0);
          lh.field_q.a((byte) -97, ha.field_e + 42, qe.field_d - -2, 18, qd.field_Q.field_Hb - ha.field_e - 42);
          v.field_x.a(qd.field_Q.field_Hb, ha.field_e, -qe.field_d + (qd.field_Q.field_R - 22), param1, 20 + (qe.field_d - -2), 0, 2);
          qi.field_n.a((byte) -100, tl.field_P.field_Hb, -40 + tl.field_P.field_R, 40, 0);
          ua.field_d.a((byte) -95, fk.field_V.field_Hb, 0, 30, 0);
          bl.field_Qb.a((byte) -94, fk.field_V.field_Hb, 30, -30 + fk.field_V.field_R + -40 - 2, 0);
          var2 = 3 + hg.field_k;
          if ((cl.field_f.length ^ -1) <= -3) {
            break L2;
          } else {
            var2--;
            break L2;
          }
        }
        L3: {
          if (param0) {
            var2--;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var3 = -2 + (-10 + (-5 + bl.field_Qb.field_R - 5 - -2 - -((var2 - -1) / 2))) / (1 + var2);
          if (30 >= var3) {
            break L4;
          } else {
            var3 = 30;
            break L4;
          }
        }
        L5: {
          var4 = -5 + bl.field_Qb.field_R - (5 + (2 + var3) * var2);
          if (var4 <= 40) {
            break L5;
          } else {
            var4 = 40;
            break L5;
          }
        }
        f.field_x.a((byte) -93, -5 + bl.field_Qb.field_Hb - 5, 5, var4, 5);
        var5 = var4 + 5 + 2;
        var6 = 0;
        L6: while (true) {
          if (hg.field_k + 4 <= var6) {
            fj.field_b.a((byte) -127, 360, 10, -130 + ra.field_e + -4 + -10, -360 + ra.field_f >> -177236031);
            dc.field_l.a((byte) -102, fj.field_b.field_Hb, 0, 24, 0);
            wb.field_e.a((byte) -79, fj.field_b.field_Hb, 24, fj.field_b.field_R + -24, 0);
            wb.field_e.field_Eb = ah.a(1, 3, 8421504, 16, 11579568, wb.field_e.field_R);
            hh.field_c.a((byte) -105, wb.field_e.field_Hb + -10, 5, -12 + (wb.field_e.field_R + -24), 5);
            c.field_b.a((byte) -118, 80, -29 + wb.field_e.field_R, 24, (wb.field_e.field_Hb - 80) / 2);
            g.c(1753);
            return;
          } else {
            L7: {
              L8: {
                if ((var6 ^ -1) != -2) {
                  break L8;
                } else {
                  if (-3 >= (cl.field_f.length ^ -1)) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (3 != var6) {
                  break L9;
                } else {
                  if (mk.field_e <= 1) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (param0) {
                  break L10;
                } else {
                  if (3 == var6) {
                    var7 = em.field_m[var6];
                    em.field_m[var6].field_R = 0;
                    var7.field_Hb = 0;
                    var8 = 0;
                    L11: while (true) {
                      if ((var8 ^ -1) <= (cn.field_e[var6].length ^ -1)) {
                        break L7;
                      } else {
                        L12: {
                          if (null == cn.field_e[var6][var8]) {
                            break L12;
                          } else {
                            var9 = cn.field_e[var6][var8];
                            cn.field_e[var6][var8].field_R = 0;
                            var9.field_Hb = 0;
                            break L12;
                          }
                        }
                        var8++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (!param0) {
                  break L13;
                } else {
                  if (var6 != 0) {
                    break L13;
                  } else {
                    var7 = em.field_m[var6];
                    em.field_m[var6].field_R = 0;
                    var7.field_Hb = 0;
                    var8 = 0;
                    L14: while (true) {
                      if (var8 >= cn.field_e[var6].length) {
                        break L7;
                      } else {
                        L15: {
                          if (null == cn.field_e[var6][var8]) {
                            break L15;
                          } else {
                            var9 = cn.field_e[var6][var8];
                            cn.field_e[var6][var8].field_R = 0;
                            var9.field_Hb = 0;
                            break L15;
                          }
                        }
                        var8++;
                        continue L14;
                      }
                    }
                  }
                }
              }
              L16: {
                L17: {
                  if (!param0) {
                    break L17;
                  } else {
                    if (-5 < (var6 ^ -1)) {
                      break L17;
                    } else {
                      if (ve.field_d == null) {
                        break L17;
                      } else {
                        if (!ve.field_d[var6 + -4]) {
                          break L17;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L16;
                        }
                      }
                    }
                  }
                }
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L16;
              }
              var7_int = stackIn_39_0;
              if (var7_int != 0) {
                var8_ref_hl = em.field_m[var6];
                em.field_m[var6].field_R = 0;
                var8_ref_hl.field_Hb = 0;
                var14 = 0;
                var9_int = var14;
                L18: while (true) {
                  if (var14 >= cn.field_e[var6].length) {
                    break L7;
                  } else {
                    L19: {
                      if (null != cn.field_e[var6][var14]) {
                        var10 = cn.field_e[var6][var14];
                        cn.field_e[var6][var14].field_R = 0;
                        var10.field_Hb = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    var14++;
                    continue L18;
                  }
                }
              } else {
                L20: {
                  em.field_m[var6].a((byte) -101, 103, var5, var3, 5);
                  var8 = 110;
                  if (param0) {
                    cn.field_e[var6][0].b(0, 38, var5, eh.field_w, var8, 2, var3);
                    var8 += 40;
                    break L20;
                  } else {
                    if (null != cn.field_e[var6][0]) {
                      var9 = cn.field_e[var6][0];
                      cn.field_e[var6][0].field_R = 0;
                      var9.field_Hb = 0;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                var9_int = -var8 + -5 + fk.field_V.field_Hb - -2;
                var10_int = -1 + cn.field_e[var6].length;
                var11 = 0;
                L21: while (true) {
                  if (var11 >= var10_int) {
                    var5 = var5 + (2 + var3);
                    break L7;
                  } else {
                    var12 = var11 * var9_int / var10_int;
                    cn.field_e[var6][var11 - -1].b(0, (var11 + 1) * var9_int / var10_int - (2 + var12), var5, eh.field_w, var12 + var8, 2, var3);
                    var11++;
                    continue L21;
                  }
                }
              }
            }
            var6++;
            continue L6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new oh(128, 128);
        field_e = "Players: ";
    }
}
