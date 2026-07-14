/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pw extends fqa {
    private int field_K;
    private int field_L;
    private int field_J;

    final static void a(boolean param0, byte param1, int param2, int param3) {
        int var4 = 0;
        jea var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gqa var9 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (pk.field_r >= pna.field_q) {
            break L0;
          } else {
            pk.field_r = pk.field_r + 1;
            break L0;
          }
        }
        L1: {
          if (mha.field_E != gn.field_C.field_e) {
            tj.field_b = tj.field_b + (gn.field_C.field_e - mha.field_E);
            mha.field_E = gn.field_C.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        if ((pk.field_r ^ -1) < -1) {
          L2: {
            rg.a((byte) -53);
            era.field_e.c(37, param0);
            if (null != apa.field_c) {
              if (!fua.field_g) {
                apa.field_c = null;
                break L2;
              } else {
                boolean discarded$1 = apa.field_c.a(era.field_e.field_A, param0, era.field_e.field_q, -90);
                break L2;
              }
            } else {
              break L2;
            }
          }
          var4 = 0;
          L3: while (true) {
            if (var4 >= 5) {
              L4: {
                if (0 != ara.field_ub.field_y) {
                  fj.field_c = new wla(ara.field_ub.field_q, ara.field_ub.field_A, ara.field_ub.field_G, ara.field_ub.field_t, param2, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, (String) null, 0L);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var9 = mna.a((byte) 73, param3, di.field_a, mna.field_d);
                if (var9 == null) {
                  break L5;
                } else {
                  hpa.a(-2, var9);
                  break L5;
                }
              }
              var8 = fa.a((byte) -126);
              if (param1 < -75) {
                L6: {
                  if (var8 == null) {
                    break L6;
                  } else {
                    qda.field_b = var8;
                    break L6;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              var5 = wba.field_p[var4];
              if (var5 != null) {
                L7: {
                  if (var5.field_y != 0) {
                    nw.a(false, var4, var5);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6 = gda.a(var4, -20011);
                oka.field_y[var4].field_R = vda.field_m[var6];
                kva.field_p[var4].field_r = jra.field_c[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return -28;
        }
        return 3;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            ((pw) this).field_K = -83;
            return false;
        }
        return false;
    }

    final static void C(int param0) {
        if (-gpa.field_b + 0 != tl.field_r) {
            if (tl.field_r != 250 - gpa.field_b) {
            }
        }
        if (param0 != -5) {
            return;
        }
        tl.field_r = tl.field_r + 1;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((pw) this).field_L = 117;
            return false;
        }
        return false;
    }

    pw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((pw) this).field_L = 2;
        ((pw) this).field_L = param2.b((byte) 44, 4);
    }

    final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          super.q(param0);
          var2 = ((pw) this).field_m;
          if (3 != var2) {
            if (var2 != 4) {
              ((pw) this).field_J = -1;
              ((pw) this).field_K = -1;
              break L0;
            } else {
              ((pw) this).field_J = 2;
              ((pw) this).field_K = 2;
              break L0;
            }
          } else {
            ((pw) this).field_J = 1;
            ((pw) this).field_K = 1;
            break L0;
          }
        }
        ((pw) this).b(106, ((pw) this).field_J * 2097152, 2097152 * ((pw) this).field_K);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            ((pw) this).field_J = 97;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((pw) this).v(97);
        }
        return 5;
    }

    pw(la param0, int param1) {
        super(param0, param1);
        ((pw) this).field_L = 2;
    }

    final fsa a(boolean param0, int param1, la param2) {
        int var5_int = 0;
        dja var5 = null;
        mfa var6 = null;
        cv var7 = null;
        int var8 = 0;
        int var9 = 0;
        fsa var10 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var10 = new fsa(param2, param0);
          var5_int = ((pw) this).field_m;
          if ((var5_int ^ -1) == -55) {
            ((pw) this).field_k = 2097152;
            break L0;
          } else {
            if (55 == var5_int) {
              ((pw) this).field_l = 2097152;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var10.b((byte) -11, ((pw) this).field_k, ((pw) this).field_l);
          var5 = new dja(param2, param0);
          var5.a(((pw) this).field_L, true);
          ((pw) this).a((ut) (Object) var5, (byte) -94);
          var10.a((byte) 83, (nv) (Object) var5);
          var6 = rm.field_a;
          var7 = (cv) (Object) var6.a(9, param1 ^ 113);
          if (param1 == 3) {
            break L1;
          } else {
            ((pw) this).field_K = 33;
            break L1;
          }
        }
        L2: {
          var8 = ((pw) this).field_m;
          if (var8 != -4) {
            if (-5 != var8) {
              if (54 == var8) {
                var7.b(4, (byte) -112);
                break L2;
              } else {
                if (-56 == (var8 ^ -1)) {
                  var7.b(5, (byte) -112);
                  break L2;
                } else {
                  var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
                  return var10;
                }
              }
            } else {
              var7.b(2, (byte) -112);
              break L2;
            }
          } else {
            var7.b(0, (byte) -112);
            break L2;
          }
        }
        var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var10;
    }

    final static ha a(int param0, java.awt.Canvas param1, int param2, byte param3, d param4) {
        if (param3 != -62) {
            return null;
        }
        return (ha) (Object) new oa(param1, param4, param2, param0);
    }

    final boolean v(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == 555277520) {
            break L0;
          } else {
            ((pw) this).field_K = -36;
            break L0;
          }
        }
        var2 = ((pw) this).field_m;
        if (-55 == (var2 ^ -1)) {
          return true;
        } else {
          if ((var2 ^ -1) != -56) {
            return false;
          } else {
            return true;
          }
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -125, ((pw) this).field_L, 4);
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            ((pw) this).field_K = -50;
            return true;
        }
        return true;
    }

    static {
    }
}
