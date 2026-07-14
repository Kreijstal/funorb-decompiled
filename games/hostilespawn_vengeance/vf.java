/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends ph {
    static bd field_H;
    static String field_G;
    static String field_I;
    static String field_J;

    final static boolean l(int param0) {
        if (param0 != -1) {
            return true;
        }
        return uh.field_o;
    }

    final static void j(int param0) {
        int var2 = HostileSpawn.field_I ? 1 : 0;
        if (!m.c(param0 ^ -77)) {
            if (null != wa.field_q) {
                if (!(!wa.field_q.field_g)) {
                    tb.f((byte) -119);
                    nb.field_F.c((ag) (Object) new jh(nb.field_F, hf.field_g), param0 + 118);
                }
            }
            return;
        }
        boolean discarded$10 = nb.field_F.a(im.field_f, param0 + 8800, true, ul.field_H);
        nb.field_F.e((byte) 114);
        while (jn.e((byte) 125)) {
            boolean discarded$11 = nb.field_F.a(pj.field_e, aj.field_e, 80);
        }
        if (param0 != -1) {
            field_H = null;
        }
    }

    vf(String param0, mh param1, boolean param2) {
        this(param0, param1);
        ((vf) this).field_A = param2 ? true : false;
    }

    private vf(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
        ((vf) this).field_h = gf.field_e.field_n;
    }

    private vf(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        ((vf) this).field_h = gf.field_e.field_n;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var22 = null;
        var18 = HostileSpawn.field_I ? 1 : 0;
        var10 = uj.field_p.field_e;
        var11 = uj.field_p.field_g;
        var12 = -101 % ((-33 - param3) / 43);
        var22 = ln.field_a.field_o;
        var14 = param4;
        L0: while (true) {
          if (param5 < var14) {
            return;
          } else {
            var7 = param0 * var14 + param2;
            var9 = 24 * var14 - var11;
            var15 = param2;
            L1: while (true) {
              if (var15 > param6) {
                var14++;
                continue L0;
              } else {
                L2: {
                  var7++;
                  var8 = 24 * var15 + -var10;
                  var16 = var22[var7];
                  if ((var16 >> 413495304 ^ -1) != -5) {
                    break L2;
                  } else {
                    if (0 != bm.field_c) {
                      break L2;
                    } else {
                      if (2 != rl.field_c) {
                        break L2;
                      } else {
                        if ((ha.field_t ^ -1) == -15) {
                          break L2;
                        } else {
                          var15++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
                if (var16 >= 0) {
                  L3: {
                    var17 = var16 & 255;
                    if (3 == var17) {
                      si.a(var8, var9, 24, 24, 0, 50);
                      break L3;
                    } else {
                      if (var17 == -18) {
                        si.a(var8, var9, 24, 24, 0, 50);
                        break L3;
                      } else {
                        if (19 == var17) {
                          si.a(var8, var9, 24, 24, 0, 50);
                          break L3;
                        } else {
                          if (3 == var17) {
                            si.a(var8, var9, 24, 24, 0, 50);
                            break L3;
                          } else {
                            if (-35 == var17) {
                              si.a(var8, var9, 24, 24, 0, 50);
                              break L3;
                            } else {
                              if ((var17 ^ -1) == -36) {
                                si.a(var8, var9, 24, 24, 0, 50);
                                break L3;
                              } else {
                                if (48 == var17) {
                                  si.a(var8, var9, 24, 24, 0, 50);
                                  break L3;
                                } else {
                                  if (49 == var17) {
                                    si.a(var8, var9, 24, 24, 0, 50);
                                    break L3;
                                  } else {
                                    if (var17 == -51) {
                                      si.a(var8, var9, 24, 24, 0, 50);
                                      break L3;
                                    } else {
                                      if (var17 == 56) {
                                        si.a(var8, var9, 24, 24, 0, 50);
                                        break L3;
                                      } else {
                                        if (var17 == 64) {
                                          si.a(var8, var9, 24, 24, 0, 50);
                                          break L3;
                                        } else {
                                          if (-82 == var17) {
                                            si.a(var8, var9, 24, 24, 0, 50);
                                            break L3;
                                          } else {
                                            if (128 == var17) {
                                              si.a(var8, var9, 24, 24, 0, 50);
                                              break L3;
                                            } else {
                                              if ((var17 ^ -1) != -132) {
                                                break L3;
                                              } else {
                                                si.a(var8, var9, 24, 24, 0, 50);
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ak.field_b[var16].a(var8, var9);
                  var15++;
                  continue L1;
                } else {
                  var15++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static jj a(String[] args, boolean param1) {
        if (!param1) {
            Object var3 = null;
            jj discarded$0 = vf.a((String[]) null, false);
        }
        jj var2 = new jj(false);
        var2.field_e = args;
        return var2;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        if (-2 >= (r.field_a ^ -1)) {
            var2 = pm.field_d;
        } else {
            var2 = 0;
        }
        if (param0 > -3) {
            return;
        }
        if (ln.field_a.field_r[param1]) {
            if (!(!wb.field_Z)) {
                var2 = 0;
            }
        }
        if (!(ln.field_a.field_u[param1] >= var2)) {
            if ((ln.field_a.field_f[param1] ^ -1) == -3) {
                ln.field_a.field_u[param1] = var2;
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        ((vf) this).field_A = !((vf) this).field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        int var1 = 82 / ((param0 - 27) / 32);
        field_G = null;
        field_I = null;
        field_H = null;
        field_J = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = -87 / ((param0 - 36) / 63);
        if (-1 >= (param1 ^ -1)) {
            // if_icmpgt L38
        }
        var2 += 16;
        param1 = param1 >>> 16;
        if (param1 >= 256) {
            var2 += 8;
            param1 = param1 >>> 8;
        }
        if (!((param1 ^ -1) > -17)) {
            param1 = param1 >>> 4;
            var2 += 4;
        }
        if (!(param1 > -5)) {
            param1 = param1 >>> 2;
            var2 += 2;
        }
        if (!(-2 > param1)) {
            var2++;
            param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final static void k(int param0) {
        int var2 = HostileSpawn.field_I ? 1 : 0;
        ne var4 = (ne) (Object) ei.field_q.g(param0 + 8183);
        while (var4 != null) {
            om.a(var4, 5, param0 + 8140);
            var4 = (ne) (Object) ei.field_q.a(12684);
        }
        el.field_h[0] = cm.a(128, 5, 0, 1);
        el.field_h[1] = cm.a(128, 5, 1, 1);
        nh.field_L = cj.a(6, 5);
        if (param0 != -8255) {
            Object var3 = null;
            jj discarded$0 = vf.a((String[]) null, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_I = "The lift won't work until I get the power working again.";
        field_J = "Account created successfully!";
    }
}
