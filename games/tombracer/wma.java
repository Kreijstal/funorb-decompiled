/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wma extends nv {
    private ib field_q;
    private int field_r;
    private int field_p;
    static vna field_n;
    private mg field_o;

    final static ka a(int param0, int param1, int param2) {
        if (param1 != 12166) {
          wma.a(true, -97);
          return kb.a(param0, false, false, 2, param2);
        } else {
          return kb.a(param0, false, false, 2, param2);
        }
    }

    final void g(int param0) {
        super.g(param0);
        if (this.field_q != null) {
            this.field_q.a((byte) 82);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        dba var4 = null;
        if (ql.field_k != null) {
          var4 = new dba();
          var4.a(param2, (byte) -60);
          var4.b(param0, (byte) 123);
          var4.a(param3, 2097152);
          ql.field_k.k(80, param1 ^ -2984);
          var4.a(200, ql.field_k);
          if (param1 != 12) {
            field_n = (vna) null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_o.a(15637, param1);
            this.field_q.a(param1, (byte) 52);
            param1.a((byte) 121, this.field_p, 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wma.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lj a(int param0, int param1, boolean param2) {
        lj var4 = super.a(param0, param1, param2);
        if (!(var4 == null)) {
            return var4;
        }
        return this.field_q.a(param2, -65, param1);
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.field_r = this.field_p;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wma.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ui param1, boolean param2, ui param3) {
        try {
            super.a(-125, param1, param2, param3);
            if (null != this.field_q) {
                this.field_q.a((byte) -36, new ui(), param2, param1);
            }
            int var5_int = -85 % ((param0 - -58) / 57);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wma.KB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            this.field_q = (ib) null;
            return true;
        }
        return true;
    }

    final void k(int param0) {
        lj discarded$1 = null;
        int var2 = 0;
        if (param0 == 5418) {
          if (this.field_q != null) {
            if (this.field_o != null) {
              this.field_o.d(0);
              if (this.field_o.c(0)) {
                var2 = this.field_g.g(-25787);
                this.field_q.a(var2, this.field_g.d(3), this.field_g.e(9648), 4);
                if ((this.field_r ^ -1) < -1) {
                  this.field_r = this.field_r - 1;
                  if (this.field_r == 0) {
                    this.c(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          discarded$1 = this.a(77, -12, true);
          if (this.field_q != null) {
            if (this.field_o != null) {
              this.field_o.d(0);
              if (this.field_o.c(0)) {
                var2 = this.field_g.g(-25787);
                this.field_q.a(var2, this.field_g.d(3), this.field_g.e(9648), 4);
                if ((this.field_r ^ -1) < -1) {
                  this.field_r = this.field_r - 1;
                  if (this.field_r != 0) {
                    return;
                  } else {
                    this.c(false);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 116;
        }
        return param0;
    }

    wma(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_p = 0;
        try {
            this.field_o = new mg(param0.field_E, param1);
            this.field_q = pha.a(param1, param0, 162);
            this.field_p = param1.b((byte) 44, 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != 8) {
          field_n = (vna) null;
          return param2 >> -param1 + 16;
        } else {
          return param2 >> -param1 + 16;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 0) {
          L0: {
            wma.a(false, 4);
            hh.a(40, param0);
            if (null != qda.field_b) {
              hia.a(-65, qda.field_b);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            hh.a(40, param0);
            if (null != qda.field_b) {
              hia.a(-65, qda.field_b);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 <= 123) {
            wma.a(true, -91);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return 118;
        }
        return 16;
    }

    static {
        field_n = new vna();
    }
}
