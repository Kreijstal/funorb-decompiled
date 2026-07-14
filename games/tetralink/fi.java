/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends lk implements dm {
    private ho field_Bb;
    static int field_Db;
    private boolean field_Eb;
    private boolean field_yb;
    static String[] field_Ab;
    static String field_zb;
    static String field_xb;
    static boolean field_Cb;

    final static void a(String param0, int param1, byte param2) {
        int var3 = 0;
        jd.field_a = false;
        s.field_f = false;
        if (null != fl.field_u) {
            if (fl.field_u.field_K) {
                var3 = 1;
                if (8 != param1) {
                } else {
                    if (qa.field_v) {
                        param0 = fk.field_R;
                    } else {
                        param0 = ek.field_r;
                    }
                    param1 = 2;
                    ao.field_c.a(true, mk.field_d);
                }
                if (!(10 != param1)) {
                    var3 = 0;
                    hk.a((byte) -89);
                }
                if (!(var3 == 0)) {
                    if (!(!jd.field_a)) {
                        param0 = sk.a(new String[1], lb.field_U, 122);
                    }
                    if (!(!sn.field_b)) {
                        param0 = bf.field_s;
                    }
                    fl.field_u.a(param0, param1, 17);
                }
                if (-257 != param1) {
                    if (-11 != param1) {
                        if (!qa.field_v) {
                            ao.field_c.a(1379);
                        }
                    }
                }
            }
        }
        if (param2 != 20) {
            Object var4 = null;
            int discarded$0 = fi.a(true, (String) null, (byte) -53);
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (!(!((fi) this).field_yb)) {
            jd.a((byte) -71, false, true);
            return;
        }
        ud.d((byte) 58);
        if (param0 >= 0) {
            return;
        }
        ((fi) this).r(-125);
    }

    fi(pk param0, ho param1) {
        super(param0, ab.field_V, ic.field_a, false, false);
        ((fi) this).field_Bb = param1;
    }

    public static void g(byte param0) {
        field_zb = null;
        int var1 = 90 / ((64 - param0) / 35);
        field_Ab = null;
        field_xb = null;
    }

    final static int a(boolean param0, String param1, byte param2) {
        if (param2 >= -68) {
            return -51;
        }
        if (param0) {
            return cf.field_o.b(param1);
        }
        return dk.field_d.b(param1);
    }

    final static int a(byte param0, fj param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TetraLink.field_J;
          var2 = t.field_l;
          if (2 == param1.field_i) {
            if (param1.field_l) {
              var2 = t.field_l;
              break L0;
            } else {
              L1: {
                if (param1.field_g != 0) {
                  break L1;
                } else {
                  if (-1 == (param1.field_s ^ -1)) {
                    var2 = pg.field_f[param1.field_i];
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = un.field_j[param1.field_i];
              break L0;
            }
          } else {
            if (-5 == (param1.field_i ^ -1)) {
              var2 = un.field_j[param1.field_i];
              break L0;
            } else {
              if ((param1.field_r ^ -1L) == (oj.field_c ^ -1L)) {
                var2 = pg.field_f[param1.field_i];
                break L0;
              } else {
                var2 = un.field_j[param1.field_i];
                break L0;
              }
            }
          }
        }
        if (param0 >= 81) {
          return var2;
        } else {
          return 100;
        }
    }

    final static byte[] a(int param0, byte[] param1, bc param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TetraLink.field_J;
          if (param3 == 119) {
            break L0;
          } else {
            field_Ab = null;
            break L0;
          }
        }
        var4 = param2.e(param0, (byte) -112);
        if (0 != var4) {
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (var4 == param1.length) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param1 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param2.e(3, (byte) -112);
            var6 = (byte)param2.e(8, (byte) -112);
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)(var6 + param2.e(var5, (byte) -112));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final static void t(int param0) {
        if (param0 != 11) {
            field_xb = null;
        }
        Object var2 = null;
        ve.a(-1, (String) null, "");
    }

    final void s(int param0) {
        if (param0 <= 1) {
            field_Cb = false;
        }
        this.a(hj.a(wc.field_K, 248, false), 22811, true);
    }

    final static void a(int param0, int param1, String param2, int param3, String param4, String param5) {
        fj var6 = new fj(param3, param2, param0, param5, param4);
        ei.a(-2792, var6);
        if (param1 != 0) {
            field_zb = null;
        }
    }

    private final void a(sj param0, int param1, boolean param2) {
        String var4 = null;
        ba var5 = null;
        int var6 = 0;
        L0: {
          var6 = TetraLink.field_J;
          if (param1 == 22811) {
            break L0;
          } else {
            field_zb = null;
            break L0;
          }
        }
        L1: {
          ((fi) this).field_Eb = true;
          if (!param0.field_f) {
            if (param0.field_h == null) {
              var4 = param0.field_i;
              if ((param0.field_d ^ -1) != -249) {
                break L1;
              } else {
                L2: {
                  if (param2) {
                    break L2;
                  } else {
                    vj.a(param1 + -22810);
                    break L2;
                  }
                }
                var4 = wc.field_K;
                ((fi) this).field_yb = true;
                break L1;
              }
            } else {
              var4 = qc.field_fb;
              if (((fi) this).field_Bb != null) {
                ((fi) this).field_Bb.a(true);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            var4 = te.field_N;
            break L1;
          }
        }
        L3: {
          L4: {
            var5 = new ba((lk) this, ab.field_V, var4);
            if (param0.field_f) {
              if (!param0.field_b) {
                ae discarded$2 = var5.a((dn) this, param1 ^ -22896, al.field_e);
                break L4;
              } else {
                ((fi) this).e((na) (Object) new ia((fi) this), -27667);
                return;
              }
            } else {
              L5: {
                if (((fi) this).field_yb) {
                  ae discarded$3 = var5.a((dn) this, param1 ^ -22882, al.field_e);
                  break L5;
                } else {
                  if ((param0.field_d ^ -1) == -6) {
                    var5.a(ml.field_hb, 11, 122);
                    var5.a(uh.field_a, 17, 95);
                    break L5;
                  } else {
                    var5.a(nb.field_T, -1, 111);
                    break L5;
                  }
                }
              }
              if ((param0.field_d ^ -1) != -4) {
                if (param0.field_d == 6) {
                  var5.a(em.field_c, 9, 115);
                  break L4;
                } else {
                  ((fi) this).e((na) (Object) var5, -27667);
                  break L3;
                }
              } else {
                var5.a(hl.field_C, 7, 75);
                ((fi) this).e((na) (Object) var5, -27667);
                break L3;
              }
            }
          }
          ((fi) this).e((na) (Object) var5, -27667);
          break L3;
        }
    }

    final boolean l(int param0) {
        sj var2 = null;
        if (param0 != -1) {
            field_Ab = null;
        }
        if (((fi) this).field_K) {
            if (!((fi) this).field_Eb) {
                var2 = ik.a(127);
                if (var2 != null) {
                    this.a(var2, 22811, false);
                }
            }
        }
        return super.l(-1);
    }

    final static boolean a(long param0, int param1, String param2, byte param3, int[] param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 < -81) {
            break L0;
          } else {
            field_Cb = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 == null) {
              break L2;
            } else {
              L3: {
                if (-3 != (param1 ^ -1)) {
                  break L3;
                } else {
                  if (!nl.a((byte) 127, param2, param0)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = -1;
        field_xb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_Cb = true;
        field_zb = "Players";
    }
}
