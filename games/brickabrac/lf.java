/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends km {
    static long field_u;
    private int field_v;
    static tp field_t;
    static int[] field_r;
    static mh field_s;

    final int b(int param0, int param1) {
        int var3 = 0;
        if (param1 == 1) {
          L0: {
            var3 = ((lf) this).field_m[param0].field_f;
            if (((lf) this).field_m.length == 2) {
              break L0;
            } else {
              if (8 == var3) {
                return ((lf) this).field_q + ((lf) this).field_p;
              } else {
                break L0;
              }
            }
          }
          return ((lf) this).field_p;
        } else {
          return -54;
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        q var4_ref_q = null;
        int var5_int = 0;
        q var5 = null;
        int var6_int = 0;
        q var6 = null;
        int var7 = 0;
        String var8 = null;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (((lf) this).field_m.length != 2) {
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 2) {
                var3 = 10 + 2 * var2;
                var4 = (640 - var3) / 2;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= 2) {
                    var2 = 30 + nn.field_g.c(((lf) this).e((byte) 111));
                    var4 = (-var2 + 640) / 2;
                    var5 = ((lf) this).field_m[2];
                    var5.field_c = var4;
                    var5.field_a = ((lf) this).b(2, 1);
                    var5.field_j = var2;
                    var5.field_d = ((lf) this).b((byte) -86, 2);
                    break L0;
                  } else {
                    var6 = ((lf) this).field_m[var5_int];
                    var6.field_c = var4;
                    var6.field_a = ((lf) this).b(var5_int, 1);
                    var6.field_j = var2;
                    var6.field_d = ((lf) this).b((byte) -30, var5_int);
                    var4 = var4 + (10 + var6.field_j);
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4_ref_q = ((lf) this).field_m[var3];
                var8 = ag.field_D[var4_ref_q.field_f];
                var6_int = 30 + nn.field_g.c(var8);
                if (var6_int > var2) {
                  var2 = var6_int;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            ((lf) this).e(2);
            break L0;
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            field_r = null;
            break L3;
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, 121);
        if (param2 <= 96) {
            return;
        }
        ch.field_h = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -94);
        if (!(!og.h(-26090))) {
            return;
        }
        if (param2 >= -52) {
            return;
        }
        if (!(ch.field_h != null)) {
            ch.field_h = gf.a(7, 0, 10, (byte) -114);
        }
    }

    final static void a(pb param0, int param1, int param2, jp param3, int param4, int param5) {
        try {
            fc.a(-59, param0.field_p);
            if (param5 < 39) {
                lf.a(true, 49, true);
            }
            lb.g(0, 0, param0.field_i, param0.field_q, kg.field_i[param4], 16777215);
            param3.b((-param3.field_x + param0.field_i) / 2 + -(50 / param1), -(189 / param1) + (-param3.field_z + param0.field_q) + param2, 55, 83);
            sc.b(-94);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "lf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        ch.field_h = null;
        if (param0 != 79) {
            field_s = null;
        }
    }

    final static void a(byte param0, boolean param1) {
        ag.a((byte) -16, false, param1);
        if (param0 >= -61) {
            field_r = null;
        }
    }

    lf() {
        super(6, 38, 460, 402, 35, td.field_s);
        String[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var8 = null;
        L0: {
          ((lf) this).field_v = 0;
          qo.field_N = 10 + ob.field_D.c("10. ");
          var8 = new String[]{so.field_e, vl.field_c, be.field_e, hj.field_Vb, jg.field_p};
          var1 = var8;
          int discarded$2 = 1;
          var2 = nn.field_g.c(nm.a((CharSequence[]) (Object) var1));
          var3 = 582;
          var4 = 182;
          var5 = (-var4 + (var3 - var2)) / 5;
          mf.field_d = new int[var8.length];
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= mf.field_d.length) {
            var6 = 0;
            L2: while (true) {
              if (mf.field_d.length <= var6) {
                return;
              } else {
                mf.field_d[var6] = mf.field_d[var6] + var4;
                var6++;
                continue L2;
              }
            }
          } else {
            mf.field_d[var6] = var5 + nn.field_g.c(var8[var6]);
            if (0 < var6) {
              mf.field_d[var6] = mf.field_d[var6] + mf.field_d[var6 - 1];
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static void f(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            lf.a((pb) null, -117, -10, (jp) null, -120, 52);
        }
        int discarded$0 = 122;
        ag.f();
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 >= -51) {
            lf.a((byte) -69, false);
        }
        if (param2) {
            lb.d(0, 0, lb.field_c, lb.field_d, 0, 192);
        } else {
            lb.d();
        }
        int discarded$0 = -1;
        wc.a(param2);
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        q var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          var4 = 0;
          var5 = ((lf) this).field_m[param0];
          var6 = var5.field_f;
          var7 = var6;
          if (var7 != 17) {
            if (18 == var7) {
              if (((lf) this).field_h.a((byte) 113)) {
                ((lf) this).field_v = 1;
                ((lf) this).b(true, param0);
                var4 = 1;
                break L0;
              } else {
                break L0;
              }
            } else {
              return super.a(param0, param1, (byte) 123);
            }
          } else {
            if (!((lf) this).field_h.a((byte) 113)) {
              break L0;
            } else {
              ((lf) this).field_v = 0;
              ((lf) this).b(true, param0);
              var4 = 1;
              break L0;
            }
          }
        }
        L1: {
          if (param2 == 123) {
            break L1;
          } else {
            ((lf) this).a(49, -67, '￩');
            break L1;
          }
        }
        return var4 != 0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        String var4_ref = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -101);
        im.a(550, 5, 243, 5, 140, (byte) -62, 45);
        al.a(((lf) this).field_a, 19);
        ((lf) this).a(0);
        if (og.h(-26090)) {
          bo.a((byte) 97, na.field_N);
          return;
        } else {
          L0: {
            var2 = 149 - -nn.field_g.field_B;
            var3 = 0;
            nn.field_g.c(ae.field_i, 66, var2, var3, -1);
            nn.field_g.a(so.field_e, mf.field_d[0], var2, var3, -1);
            nn.field_g.a(vl.field_c, mf.field_d[1], var2, var3, -1);
            if (param0 < -14) {
              break L0;
            } else {
              ((lf) this).a(false, true, 9);
              break L0;
            }
          }
          L1: {
            L2: {
              nn.field_g.a(be.field_e, mf.field_d[2], var2, var3, -1);
              nn.field_g.a(hj.field_Vb, mf.field_d[3], var2, var3, -1);
              nn.field_g.a(jg.field_p, mf.field_d[4], var2, var3, -1);
              var2 = 149 + (nn.field_g.field_B - -nn.field_g.field_P) * 5 / 2;
              var4 = null;
              if (ch.field_h == null) {
                break L2;
              } else {
                if (ch.field_h.field_v) {
                  if (null != ch.field_h.field_r) {
                    var4_ref = ef.field_f;
                    var5 = ch.field_h.field_r[((lf) this).field_v];
                    var6 = ch.field_h.field_u[((lf) this).field_v];
                    var7 = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= 10) {
                        if (var7 != 0) {
                          break L1;
                        } else {
                          i.a(ch.field_h.field_j, var2, tb.field_cb, ch.field_h.field_l, ch.field_h.field_n, 1, -1, ch.field_h.field_k, -1);
                          break L1;
                        }
                      } else {
                        if (var5[var8] != null) {
                          L4: {
                            var3 = 2;
                            if (!ci.a(var5[var8], -15)) {
                              break L4;
                            } else {
                              var3 = 1;
                              var7 = 1;
                              break L4;
                            }
                          }
                          L5: {
                            if (0 == (1 & var8)) {
                              lb.d(50, -15 + var2, 540, 18, 16777215, 16);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var4_ref = null;
                          i.a(var6[4 * var8 + 3], var2, var5[var8], var6[var8 * 4 - -1], var6[4 * var8], var3, -1, var6[var8 * 4 + 2], var8);
                          var2 += 18;
                          var8++;
                          continue L3;
                        } else {
                          var2 += 18;
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4_ref = rn.field_d;
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            var4_ref = kd.field_a;
            break L1;
          }
          L6: {
            if (var4_ref != null) {
              bo.a((byte) 119, var4_ref);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        ((lf) this).a(se.field_j, 0);
        ((lf) this).b(true, 0);
        if (param0 >= -60) {
            ((lf) this).field_v = -47;
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (((lf) this).field_m.length != 2) {
            L1: {
              if (96 != param1) {
                break L1;
              } else {
                if (((lf) this).field_h.field_j <= 0) {
                  ((lf) this).field_h.a(false, 1);
                  break L1;
                } else {
                  if (((lf) this).field_h.field_j == 2) {
                    break L1;
                  } else {
                    ((lf) this).field_h.a(false, 0);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 == 97) {
                if (((lf) this).field_h.field_j != 1) {
                  if (((lf) this).field_h.field_j != 2) {
                    ((lf) this).field_h.a(false, 1);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ((lf) this).field_h.a(false, 0);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != 99) {
                break L3;
              } else {
                if (0 > ((lf) this).field_h.field_j) {
                  ((lf) this).field_h.a(false, ((lf) this).field_v);
                  break L3;
                } else {
                  if (1 < ((lf) this).field_h.field_j) {
                    ((lf) this).field_h.a(false, ((lf) this).field_v);
                    break L3;
                  } else {
                    ((lf) this).field_h.a(false, 2);
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (param1 != 98) {
                break L4;
              } else {
                if (((lf) this).field_h.field_j != 2) {
                  ((lf) this).field_h.a(false, 2);
                  break L4;
                } else {
                  ((lf) this).field_h.a(false, ((lf) this).field_v);
                  break L4;
                }
              }
            }
            ((lf) this).field_h.d((byte) -124);
            break L0;
          } else {
            ((lf) this).field_h.a(0, -1);
            break L0;
          }
        }
        L5: {
          if (param0 == -120) {
            break L5;
          } else {
            lf.f(0);
            break L5;
          }
        }
    }

    public static void g() {
        field_r = null;
        field_t = null;
        field_s = null;
    }

    static {
    }
}
