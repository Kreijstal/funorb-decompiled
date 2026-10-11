/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static int field_d;
    static String field_c;
    private uj[] field_b;
    static String field_a;

    final uj[] e(int param0) {
        if (param0 != -27555) {
          return (uj[]) null;
        }
        return this.field_b;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        if (param0 != 48) {
          bf.c(-40);
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (tb.field_a == 0) {
          return;
        }
        if (0 <= nk.field_w) {
          if (gb.field_e < 0) {
            if (param0 >= -57) {
              field_d = -48;
              return;
            }
            return;
          }
          var2 = nk.field_w + li.field_c;
          var3 = gb.field_e + db.field_d;
          var4 = var2 / 32 * 32 - li.field_c;
          var5 = -db.field_d + 32 * (var3 / 32);
          eh.e(var4, var5, 8, 16711680);
          eh.g(var4, var5, 8, 16711680);
          eh.e(var4, var5 + 32, 8, 16711680);
          eh.g(var4, 24 + var5, 8, 16711680);
          eh.e(var4 + 24, var5, 8, 16711680);
          eh.g(var4 + 32, var5, 8, 16711680);
          eh.e(var4 + 24, var5, 8, 16711680);
          eh.g(var4 + 32, var5 + 24, 8, 16711680);
        }
        if (param0 < -57) {
          return;
        }
        field_d = -48;
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 < 91) {
          bf.a(-21);
        }
        if (null == di.field_O) {
          return;
        }
        var1 = di.field_O;
        synchronized (var1) {
          di.field_O = null;
        }
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = MinerDisturbance.field_ab;
        if (param0 == 32) {
          if (tb.field_a != 0 &&
            wj.field_j >= 2) {
            if (wi.field_w < 0) {
              return;
            }
            if (m.field_e < 0) {
              return;
            }
            if (jk.field_ab == 0) {
              return;
            }
            var2 = nk.field_w + li.field_c;
            var3 = db.field_d + gb.field_e;
            var4 = var2 / 32;
            var5 = var3 / 32;
            qm.field_f = true;
            di.field_X = di.field_X + 1;
            if (tb.field_a == 1) {
              mh.field_e[var4][var5].field_U = gd.field_x;
            }
            if (2 == tb.field_a) {
              if (0 == bc.field_a) {
                mh.field_e[var4][var5].field_a = false;
                mh.field_e[var4][var5].field_E = false;
                mh.field_e[var4][var5].field_v = false;
                mh.field_e[var4][var5].field_b = false;
              }
              if (bc.field_a == 4) {
                mh.field_e[var4][var5].field_b = true;
              }
              if (2 == bc.field_a) {
                mh.field_e[var4][var5].field_a = true;
                mh.field_e[var4][var5].field_v = true;
                mh.field_e[var4][var5].field_E = false;
              }
              if (bc.field_a == 3) {
                mh.field_e[var4][var5].field_a = true;
                mh.field_e[var4][var5].field_v = false;
                mh.field_e[var4][var5].field_E = true;
              }
              if (bc.field_a == 1) {
                mh.field_e[var4][var5].field_a = true;
                mh.field_e[var4][var5].field_v = false;
                mh.field_e[var4][var5].field_E = false;
              }
            }
            if (3 == tb.field_a) {
              mh.field_e[var4][var5].field_a = false;
              mh.field_e[var4][var5].field_E = false;
              mh.field_e[var4][var5].field_v = false;
              mh.field_e[var4][var5].field_b = false;
              if (ha.field_e == 0) {
                je.field_O.g(var5, var4, 4);
              } else {
                if (ha.field_e == 1) {
                  je.field_O.c(var5, var4, (byte) -48);
                } else {
                  if (ha.field_e == 2) {
                    je.field_O.h(var4, 4, var5);
                  } else {
                    if (ha.field_e != 3) {
                      if (tb.field_a != 4) {
                        return;
                      }
                      mh.field_e[var4][var5].field_a = false;
                      mh.field_e[var4][var5].field_E = false;
                      mh.field_e[var4][var5].field_v = false;
                      mh.field_e[var4][var5].field_b = false;
                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                      return;
                    }
                    je.field_O.d(var5, var4, -5);
                  }
                }
              }
            }
            if (tb.field_a == 4) {
              mh.field_e[var4][var5].field_a = false;
              mh.field_e[var4][var5].field_E = false;
              mh.field_e[var4][var5].field_v = false;
              mh.field_e[var4][var5].field_b = false;
              uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
            }
            return;
          }
          return;
        }
        this.b(94);
        if (tb.field_a == 0) {
          return;
        }
        if (wj.field_j < 2) {
          return;
        }
        if (wi.field_w < 0) {
          return;
        }
        if (m.field_e < 0) {
          return;
        }
        if (jk.field_ab == 0) {
          return;
        }
        var2Lifetime1 = nk.field_w + li.field_c;
        var3Lifetime1 = db.field_d + gb.field_e;
        var4Lifetime1 = var2Lifetime1 / 32;
        var5Lifetime1 = var3Lifetime1 / 32;
        qm.field_f = true;
        di.field_X = di.field_X + 1;
        if (tb.field_a == 1) {
          mh.field_e[var4Lifetime1][var5Lifetime1].field_U = gd.field_x;
        }
        if (2 == tb.field_a) {
          if (0 == bc.field_a) {
            mh.field_e[var4Lifetime1][var5Lifetime1].field_a = false;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_b = false;
          }
          if (bc.field_a == 4) {
            mh.field_e[var4Lifetime1][var5Lifetime1].field_b = true;
          }
          if (2 == bc.field_a) {
            mh.field_e[var4Lifetime1][var5Lifetime1].field_a = true;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_v = true;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
          }
          if (bc.field_a == 3) {
            mh.field_e[var4Lifetime1][var5Lifetime1].field_a = true;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_E = true;
          }
          if (bc.field_a == 1) {
            mh.field_e[var4Lifetime1][var5Lifetime1].field_a = true;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
            mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
          }
        }
        if (3 == tb.field_a) {
          mh.field_e[var4Lifetime1][var5Lifetime1].field_a = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_b = false;
          if (ha.field_e == 0) {
            je.field_O.g(var5Lifetime1, var4Lifetime1, 4);
          } else {
            if (ha.field_e == 1) {
              je.field_O.c(var5Lifetime1, var4Lifetime1, (byte) -48);
            } else {
              if (ha.field_e == 2) {
                je.field_O.h(var4Lifetime1, 4, var5Lifetime1);
              } else {
                if (ha.field_e != 3) {
                  if (tb.field_a != 4) {
                    return;
                  }
                  mh.field_e[var4Lifetime1][var5Lifetime1].field_a = false;
                  mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
                  mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
                  mh.field_e[var4Lifetime1][var5Lifetime1].field_b = false;
                  uf.field_p[jf.b((byte) 100)] = new gf(var4Lifetime1, var5Lifetime1, om.field_g);
                  return;
                }
                je.field_O.d(var5Lifetime1, var4Lifetime1, -5);
              }
            }
          }
        }
        if (tb.field_a == 4) {
          mh.field_e[var4Lifetime1][var5Lifetime1].field_a = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_E = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_v = false;
          mh.field_e[var4Lifetime1][var5Lifetime1].field_b = false;
          uf.field_p[jf.b((byte) 100)] = new gf(var4Lifetime1, var5Lifetime1, om.field_g);
        }
    }

    bf() {
        this.field_b = new uj[23];
        this.field_b[0] = (uj) ((Object) new v());
        this.field_b[1] = (uj) ((Object) new pj());
        this.field_b[2] = (uj) ((Object) new te());
        this.field_b[3] = (uj) ((Object) new hl());
        this.field_b[4] = (uj) ((Object) new i());
        this.field_b[5] = (uj) ((Object) new tk());
        this.field_b[6] = (uj) ((Object) new ug());
        this.field_b[7] = (uj) ((Object) new ib());
        this.field_b[8] = (uj) ((Object) new vh());
        this.field_b[9] = (uj) ((Object) new ka());
        this.field_b[10] = (uj) ((Object) new tb());
        this.field_b[11] = (uj) ((Object) new re());
        this.field_b[12] = (uj) ((Object) new wc());
        this.field_b[13] = (uj) ((Object) new le());
        this.field_b[14] = (uj) ((Object) new pn());
        this.field_b[15] = (uj) ((Object) new sk());
        this.field_b[16] = (uj) ((Object) new rj());
        this.field_b[17] = (uj) ((Object) new mh());
        this.field_b[18] = (uj) ((Object) new mm());
        this.field_b[19] = (uj) ((Object) new aj());
        this.field_b[20] = (uj) ((Object) new ub());
        this.field_b[21] = (uj) ((Object) new li());
        this.field_b[22] = (uj) ((Object) new bn());
    }

    static {
        field_a = "Alternatively, click 'Discard Results' to delete your score, progress and Achievements.";
    }
}
