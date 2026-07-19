/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf extends vd {
    private int field_E;
    boolean field_C;
    private rp field_G;
    static String field_D;
    static sna field_F;

    vf(rp param0, int param1, int param2) {
        super(-param1 + lb.field_v >> 612499073, mi.field_k - param2 >> -1035425151, param1, param2, (qda) null);
        try {
            this.field_G = param0;
            this.field_E = 0;
            this.field_C = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 >= -9) {
          this.field_C = true;
          this.a(-param2 + lb.field_v >> -1606413663, param1, (byte) 59, param2, mi.field_k + -param1 >> -353310687);
          return;
        } else {
          this.a(-param2 + lb.field_v >> -1606413663, param1, (byte) 59, param2, mi.field_k + -param1 >> -353310687);
          return;
        }
    }

    boolean k(int param0) {
        this.field_E = this.l(79);
        if (param0 < -59) {
          if (-1 == (this.field_E ^ -1)) {
            if (this.field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final int l(int param0) {
        int var2 = -53 / ((param0 - -8) / 44);
        return this.field_C ? this != this.field_G.h(0) ? 0 : 256 : 0;
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param0 <= -32) {
          L0: {
            var2 = this.l(80);
            var3 = -this.field_E + var2;
            if (var3 > 0) {
              this.field_E = this.field_E + (-1 + (8 + var3)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 >= (var3 ^ -1)) {
            if (-1 == (this.field_E ^ -1)) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L1: {
                  if (this.field_C) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L1;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L1;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            this.field_E = this.field_E + (-15 + var3) / 16;
            if (-1 == (this.field_E ^ -1)) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L2: {
                  if (this.field_C) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (this.field_E != 0) {
          if (-257 >= (this.field_E ^ -1)) {
            if (param2 != 0) {
              return;
            } else {
              this.a(this.field_v + param1, (byte) 89, param3 + this.field_s);
              super.a((byte) -85, param1, param2, param3);
              return;
            }
          } else {
            if (null != lfa.field_u) {
              if (this.field_p <= lfa.field_u.field_q) {
                if (this.field_q <= lfa.field_u.field_p) {
                  bu.a(0, lfa.field_u);
                  dg.d();
                  var5 = 42 % ((-20 - param0) / 54);
                  this.a(0, (byte) -109, 0);
                  super.a((byte) 43, -this.field_v + -param1, param2, -param3 - this.field_s);
                  db.b(110);
                  lfa.field_u.a(param3 - -this.field_s, param1 - -this.field_v, this.field_E);
                  return;
                } else {
                  lfa.field_u = new kv(this.field_p, this.field_q);
                  bu.a(0, lfa.field_u);
                  dg.d();
                  var5 = 42 % ((-20 - param0) / 54);
                  this.a(0, (byte) -109, 0);
                  super.a((byte) 43, -this.field_v + -param1, param2, -param3 - this.field_s);
                  db.b(110);
                  lfa.field_u.a(param3 - -this.field_s, param1 - -this.field_v, this.field_E);
                  return;
                }
              } else {
                lfa.field_u = new kv(this.field_p, this.field_q);
                bu.a(0, lfa.field_u);
                dg.d();
                var5 = 42 % ((-20 - param0) / 54);
                this.a(0, (byte) -109, 0);
                super.a((byte) 43, -this.field_v + -param1, param2, -param3 - this.field_s);
                db.b(110);
                lfa.field_u.a(param3 - -this.field_s, param1 - -this.field_v, this.field_E);
                return;
              }
            } else {
              lfa.field_u = new kv(this.field_p, this.field_q);
              bu.a(0, lfa.field_u);
              dg.d();
              var5 = 42 % ((-20 - param0) / 54);
              this.a(0, (byte) -109, 0);
              super.a((byte) 43, -this.field_v + -param1, param2, -param3 - this.field_s);
              db.b(110);
              lfa.field_u.a(param3 - -this.field_s, param1 - -this.field_v, this.field_E);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, int param2, String param3, String param4, int param5) {
        gs var6 = null;
        try {
            var6 = new gs(param5, param0, param1, param3, param4);
            ija.a((byte) 105, var6);
            int var7 = -6 / ((70 - param2) / 45);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vf.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void j(int param0) {
        field_D = null;
        int var1 = -123 / ((-26 - param0) / 40);
        field_F = null;
    }

    final wj g(int param0) {
        wj var2 = null;
        if (param0 <= -26) {
          var2 = super.g(-116);
          if (var2 != null) {
            return var2;
          } else {
            return (wj) (this);
          }
        } else {
          this.a((byte) 36, -117, 49, -84);
          var2 = super.g(-116);
          if (var2 != null) {
            return var2;
          } else {
            return (wj) (this);
          }
        }
    }

    abstract void a(int param0, byte param1, int param2);

    static {
        field_D = "Status effect <%0>";
    }
}
