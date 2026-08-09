/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends ana {
    private taa field_v;
    static hk field_x;
    private oga field_w;
    static boolean field_y;

    final static void e(int param0) {
        String var1;
        String var2;
        L0: {
          if (ur.field_b == null) {
            break L0;
          } else {
            var2 = ur.field_b;
            var1 = var2;
            rg.a(lga.a(true, new String[]{var2}, nn.field_a), param0 ^ 9943);
            ur.field_b = null;
            break L0;
          }
        }
        if (param0 == 9941) {
          return;
        } else {
          field_y = false;
          return;
        }
    }

    final boolean c(byte param0) {
        if (this.field_m.a((byte) -106)) {
            return false;
        }
        if (this.field_v.a((byte) -106)) {
            return false;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!((fieldTemp$0 ^ -1) > -1)) {
            if (75 != this.field_l) {
                return false;
            }
            jja.a(256, -1, 18);
            this.g(-1);
            return false;
        }
        int var2 = 100 % ((71 - param0) / 47);
        this.g((byte) 28);
        return true;
    }

    final static boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 11154) {
          if (-11 >= (jv.field_j ^ -1)) {
            if (qo.field_c) {
              return false;
            } else {
              L0: {
                if (cia.a(0)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          er.d(122);
          if (-11 >= (jv.field_j ^ -1)) {
            if (qo.field_c) {
              return false;
            } else {
              L1: {
                if (cia.a(0)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static String f(int param0) {
        if (!b.field_r) {
          if (pv.field_i <= df.field_o) {
            if (df.field_o >= pv.field_i + oha.field_i) {
              if (param0 == 75) {
                return null;
              } else {
                field_x = (hk) null;
                return null;
              }
            } else {
              return ov.field_g;
            }
          } else {
            if (param0 == 75) {
              return null;
            } else {
              field_x = (hk) null;
              return null;
            }
          }
        } else {
          if (param0 == 75) {
            return null;
          } else {
            field_x = (hk) null;
            return null;
          }
        }
    }

    private final void g(byte param0) {
        if (param0 >= 7) {
            return;
        }
        er.d(-7);
    }

    public static void f(byte param0) {
        field_x = null;
        if (param0 < -116) {
            return;
        }
        field_y = true;
    }

    final static void e(byte param0) {
        dj.field_c = null;
        sna.field_fb = null;
        iba.d(34);
        au.field_b = true;
        bf.field_f = false;
        sia.field_h = true;
        kaa.field_m = -3;
        if (param0 >= -64) {
          return;
        } else {
          ena.a((byte) -44, wha.field_a);
          gs.field_f = new saa(cha.field_l);
          aq.a(0, -1);
          jn.b(0);
          return;
        }
    }

    private final void g(int param0) {
        pp var3;
        sia var5;
        int var6;
        aga var7;
        ad var8;
        var6 = BachelorFridge.field_y;
        var7 = this.field_w.field_l.a(param0 ^ -113, this.field_q.field_h);
        if (!var7.i(param0 + -104)) {
          var3 = (pp) ((Object) this.field_w.field_o.b((byte) 90));
          al.a(116, this.field_w.field_k);
          if (param0 == -1) {
            L0: while (true) {
              if (var3 != null) {
                L1: {
                  if (var3 instanceof rla) {
                    var8 = var3.field_h.a(param0 ^ 27448, this.field_q);
                    var8.b(-1, 6);
                    var5 = new sia(this.field_q, var8.field_s.field_x, var8.field_s.field_J, this.field_w.field_l.a(-27449, this.field_q));
                    ((kj) ((Object) var5)).a(0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3.a(var7, this.field_q.field_h, 12);
                var3 = (pp) ((Object) this.field_w.field_o.c(0));
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    er(gj param0, oga param1) {
        super(param0, param1);
        try {
            this.field_w = param1;
            al.a(105, this.field_w.field_k);
            this.field_v = new taa(this.field_q, this.field_w.field_s.a(-27449, this.field_q));
            this.a(27799, this.field_v);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "er.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(nq param0, int param1, lu param2) {
        if (param1 < 105) {
            return;
        }
        if (!(param0 != null)) {
            param2.d(-1, 0);
            return;
        }
        try {
            param2.d(param0.field_f | param0.field_g << 1613719525, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "er.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new hk("usename");
    }
}
