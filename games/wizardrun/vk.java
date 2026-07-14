/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends wl {
    je field_v;
    static String field_o;
    static int field_r;
    int field_z;
    int field_E;
    int field_t;
    int field_j;
    int field_B;
    int field_D;
    uj field_w;
    int field_H;
    int field_k;
    int field_q;
    int field_K;
    q field_i;
    int field_y;
    int field_I;
    static String field_u;
    static vh field_p;
    static int field_l;
    static int field_G;
    int field_n;
    int field_m;
    int field_x;
    h field_C;
    int field_s;
    int field_F;

    final void a(int param0) {
        ((vk) this).field_C = null;
        ((vk) this).field_v = null;
        ((vk) this).field_i = null;
        if (param0 != 0) {
            return;
        }
        ((vk) this).field_w = null;
    }

    final static void a(byte param0) {
        L0: {
          ga.field_e = sl.field_q[qh.field_l];
          if (tl.field_e) {
            mi.field_D.a(true, -110, ga.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -39) {
          String discarded$2 = vk.d((byte) 8);
          oc.field_b = ok.field_e[qh.field_l];
          lk.field_b = sg.field_b[qh.field_l];
          wg.field_e = bd.field_c[qh.field_l];
          return;
        } else {
          oc.field_b = ok.field_e[qh.field_l];
          lk.field_b = sg.field_b[qh.field_l];
          wg.field_e = bd.field_c[qh.field_l];
          return;
        }
    }

    final static String d(byte param0) {
        if (param0 <= -79) {
          if (d.field_a == null) {
            return "";
          } else {
            return d.field_a;
          }
        } else {
          vk.a(107, 125, 75, 15);
          if (d.field_a == null) {
            return "";
          } else {
            return d.field_a;
          }
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        field_o = null;
        if (!param0) {
            vk.b(false);
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static void a(byte[] param0, va param1, java.math.BigInteger param2, boolean param3, int param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var10 = wizardrun.field_H;
          var7 = me.a(param4, -68);
          if (l.field_N != null) {
            break L0;
          } else {
            l.field_N = new java.security.SecureRandom();
            break L0;
          }
        }
        if (param3) {
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (-5 >= (var9 ^ -1)) {
              if (mk.field_a == null) {
                mk.field_a = new va(var7);
                mk.field_a.field_m = 0;
                mk.field_a.a(param0, param6, param4, 12);
                mk.field_a.c(var7, 123);
                mk.field_a.a(false, var13);
                if (ud.field_b == null) {
                  ud.field_b = new va(100);
                  ud.field_b.field_m = 0;
                  ud.field_b.b((byte) 11, 10);
                  var11 = 0;
                  var9 = var11;
                  L2: while (true) {
                    if (4 <= var11) {
                      ud.field_b.b(-1947079288, param4);
                      ud.field_b.a(param2, 95, param5);
                      param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                      param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                      return;
                    } else {
                      ud.field_b.f(var13[var11], 613003928);
                      var11++;
                      continue L2;
                    }
                  }
                } else {
                  if (100 > ud.field_b.field_k.length) {
                    ud.field_b = new va(100);
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    L3: while (true) {
                      if (4 <= var11) {
                        ud.field_b.b(-1947079288, param4);
                        ud.field_b.a(param2, 95, param5);
                        param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                        param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                        return;
                      } else {
                        ud.field_b.f(var13[var11], 613003928);
                        var11++;
                        continue L3;
                      }
                    }
                  } else {
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    L4: while (true) {
                      if (4 <= var11) {
                        ud.field_b.b(-1947079288, param4);
                        ud.field_b.a(param2, 95, param5);
                        param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                        param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                        return;
                      } else {
                        ud.field_b.f(var13[var11], 613003928);
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                if (mk.field_a.field_k.length >= var7) {
                  mk.field_a.field_m = 0;
                  mk.field_a.a(param0, param6, param4, 12);
                  mk.field_a.c(var7, 123);
                  mk.field_a.a(false, var13);
                  if (ud.field_b == null) {
                    ud.field_b = new va(100);
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    L5: while (true) {
                      if (4 <= var11) {
                        ud.field_b.b(-1947079288, param4);
                        ud.field_b.a(param2, 95, param5);
                        param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                        param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                        return;
                      } else {
                        ud.field_b.f(var13[var11], 613003928);
                        var11++;
                        continue L5;
                      }
                    }
                  } else {
                    if (100 > ud.field_b.field_k.length) {
                      ud.field_b = new va(100);
                      ud.field_b.field_m = 0;
                      ud.field_b.b((byte) 11, 10);
                      var11 = 0;
                      var9 = var11;
                      L6: while (true) {
                        if (4 <= var11) {
                          ud.field_b.b(-1947079288, param4);
                          ud.field_b.a(param2, 95, param5);
                          param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                          param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                          return;
                        } else {
                          ud.field_b.f(var13[var11], 613003928);
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      ud.field_b.field_m = 0;
                      ud.field_b.b((byte) 11, 10);
                      var11 = 0;
                      var9 = var11;
                      L7: while (true) {
                        if (4 <= var11) {
                          ud.field_b.b(-1947079288, param4);
                          ud.field_b.a(param2, 95, param5);
                          param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                          param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                          return;
                        } else {
                          ud.field_b.f(var13[var11], 613003928);
                          var11++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  mk.field_a = new va(var7);
                  mk.field_a.field_m = 0;
                  mk.field_a.a(param0, param6, param4, 12);
                  mk.field_a.c(var7, 123);
                  mk.field_a.a(false, var13);
                  if (ud.field_b == null) {
                    ud.field_b = new va(100);
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    L8: while (true) {
                      if (4 <= var11) {
                        ud.field_b.b(-1947079288, param4);
                        ud.field_b.a(param2, 95, param5);
                        param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                        param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                        return;
                      } else {
                        ud.field_b.f(var13[var11], 613003928);
                        var11++;
                        continue L8;
                      }
                    }
                  } else {
                    if (100 > ud.field_b.field_k.length) {
                      ud.field_b = new va(100);
                      ud.field_b.field_m = 0;
                      ud.field_b.b((byte) 11, 10);
                      var11 = 0;
                      var9 = var11;
                      L9: while (true) {
                        if (4 <= var11) {
                          ud.field_b.b(-1947079288, param4);
                          ud.field_b.a(param2, 95, param5);
                          param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                          param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                          return;
                        } else {
                          ud.field_b.f(var13[var11], 613003928);
                          var11++;
                          continue L9;
                        }
                      }
                    } else {
                      ud.field_b.field_m = 0;
                      ud.field_b.b((byte) 11, 10);
                      var11 = 0;
                      var9 = var11;
                      L10: while (true) {
                        if (4 <= var11) {
                          ud.field_b.b(-1947079288, param4);
                          ud.field_b.a(param2, 95, param5);
                          param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                          param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                          return;
                        } else {
                          ud.field_b.f(var13[var11], 613003928);
                          var11++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var8[var9] = l.field_N.nextInt();
              var9++;
              continue L1;
            }
          }
        } else {
          String discarded$8 = vk.d((byte) -27);
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          var9 = 0;
          L11: while (true) {
            if (-5 >= (var9 ^ -1)) {
              L12: {
                if (mk.field_a == null) {
                  mk.field_a = new va(var7);
                  break L12;
                } else {
                  if (mk.field_a.field_k.length >= var7) {
                    break L12;
                  } else {
                    mk.field_a = new va(var7);
                    break L12;
                  }
                }
              }
              L13: {
                mk.field_a.field_m = 0;
                mk.field_a.a(param0, param6, param4, 12);
                mk.field_a.c(var7, 123);
                mk.field_a.a(false, var13);
                if (ud.field_b == null) {
                  ud.field_b = new va(100);
                  ud.field_b.field_m = 0;
                  ud.field_b.b((byte) 11, 10);
                  var11 = 0;
                  var9 = var11;
                  break L13;
                } else {
                  if (100 > ud.field_b.field_k.length) {
                    ud.field_b = new va(100);
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    break L13;
                  } else {
                    ud.field_b.field_m = 0;
                    ud.field_b.b((byte) 11, 10);
                    var11 = 0;
                    var9 = var11;
                    break L13;
                  }
                }
              }
              L14: while (true) {
                if (4 <= var11) {
                  ud.field_b.b(-1947079288, param4);
                  ud.field_b.a(param2, 95, param5);
                  param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                  param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                  return;
                } else {
                  ud.field_b.f(var13[var11], 613003928);
                  var11++;
                  continue L14;
                }
              }
            } else {
              var8[var9] = l.field_N.nextInt();
              var9++;
              continue L11;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ge.field_b = param2;
        tc.field_i = param3;
        int var4 = -91 / ((param0 - 9) / 62);
        jl.field_s = param1;
    }

    vk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Instructions";
        field_u = "Wizard Run";
    }
}
