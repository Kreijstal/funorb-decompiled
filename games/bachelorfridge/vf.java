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
        super(-param1 + lb.field_v >> 1, mi.field_k - param2 >> 1, param1, param2, (qda) null);
        try {
            ((vf) this).field_G = param0;
            ((vf) this).field_E = 0;
            ((vf) this).field_C = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 >= -9) {
          ((vf) this).field_C = true;
          ((vf) this).a(-param2 + lb.field_v >> 1, param1, (byte) 59, param2, mi.field_k + -param1 >> 1);
          return;
        } else {
          ((vf) this).a(-param2 + lb.field_v >> 1, param1, (byte) 59, param2, mi.field_k + -param1 >> 1);
          return;
        }
    }

    boolean k(int param0) {
        ((vf) this).field_E = this.l(79);
        if (param0 < -59) {
          if (((vf) this).field_E == 0) {
            if (((vf) this).field_C) {
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
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var2 = -53 / ((param0 - -8) / 44);
          if (!((vf) this).field_C) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (this == (Object) (Object) ((vf) this).field_G.h(0)) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    boolean a(int param0) {
        if (param0 > -32) {
            return true;
        }
        int var2 = this.l(80);
        int var3 = -((vf) this).field_E + var2;
        if (!(var3 <= 0)) {
            ((vf) this).field_E = ((vf) this).field_E + (-1 + (8 + var3)) / 8;
        }
        if (var3 < 0) {
            ((vf) this).field_E = ((vf) this).field_E + (-15 + var3) / 16;
            if (((vf) this).field_E != 0) {
                return false;
            }
            if (var2 != 0) {
                return false;
            }
            return !((vf) this).field_C ? true : false;
        }
        if (((vf) this).field_E != 0) {
            return false;
        }
        if (var2 != 0) {
            return false;
        }
        return !((vf) this).field_C ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (((vf) this).field_E != 0) {
          if (((vf) this).field_E >= 256) {
            if (param2 == 0) {
              ((vf) this).a(((vf) this).field_v + param1, (byte) 89, param3 + ((vf) this).field_s);
              super.a((byte) -85, param1, param2, param3);
              return;
            } else {
              return;
            }
          } else {
            if (null == lfa.field_u) {
              lfa.field_u = new kv(((vf) this).field_p, ((vf) this).field_q);
              bu.a(0, lfa.field_u);
              dg.d();
              var5 = 42 % ((-20 - param0) / 54);
              ((vf) this).a(0, (byte) -109, 0);
              super.a((byte) 43, -((vf) this).field_v + -param1, param2, -param3 - ((vf) this).field_s);
              db.b(110);
              lfa.field_u.a(param3 - -((vf) this).field_s, param1 - -((vf) this).field_v, ((vf) this).field_E);
              return;
            } else {
              if (~((vf) this).field_p < ~lfa.field_u.field_q) {
                lfa.field_u = new kv(((vf) this).field_p, ((vf) this).field_q);
                bu.a(0, lfa.field_u);
                dg.d();
                var5 = 42 % ((-20 - param0) / 54);
                ((vf) this).a(0, (byte) -109, 0);
                super.a((byte) 43, -((vf) this).field_v + -param1, param2, -param3 - ((vf) this).field_s);
                db.b(110);
                lfa.field_u.a(param3 - -((vf) this).field_s, param1 - -((vf) this).field_v, ((vf) this).field_E);
                return;
              } else {
                if (((vf) this).field_q > lfa.field_u.field_p) {
                  lfa.field_u = new kv(((vf) this).field_p, ((vf) this).field_q);
                  bu.a(0, lfa.field_u);
                  dg.d();
                  var5 = 42 % ((-20 - param0) / 54);
                  ((vf) this).a(0, (byte) -109, 0);
                  super.a((byte) 43, -((vf) this).field_v + -param1, param2, -param3 - ((vf) this).field_s);
                  db.b(110);
                  lfa.field_u.a(param3 - -((vf) this).field_s, param1 - -((vf) this).field_v, ((vf) this).field_E);
                  return;
                } else {
                  bu.a(0, lfa.field_u);
                  dg.d();
                  var5 = 42 % ((-20 - param0) / 54);
                  ((vf) this).a(0, (byte) -109, 0);
                  super.a((byte) 43, -((vf) this).field_v + -param1, param2, -param3 - ((vf) this).field_s);
                  db.b(110);
                  lfa.field_u.a(param3 - -((vf) this).field_s, param1 - -((vf) this).field_v, ((vf) this).field_E);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, int param2, String param3, String param4) {
        gs var6 = null;
        try {
            var6 = new gs(2, param0, 0, param3, param4);
            ija.a((byte) 105, var6);
            int var7 = -6 / ((70 - param2) / 45);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vf.EA(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + 2 + 41);
        }
    }

    public static void j() {
        field_D = null;
        int var1 = -123;
        field_F = null;
    }

    final wj g(int param0) {
        wj var2 = null;
        if (param0 <= -26) {
          var2 = super.g(-116);
          if (var2 != null) {
            return var2;
          } else {
            return (wj) this;
          }
        } else {
          ((vf) this).a((byte) 36, -117, 49, -84);
          var2 = super.g(-116);
          if (var2 != null) {
            return var2;
          } else {
            return (wj) this;
          }
        }
    }

    abstract void a(int param0, byte param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Status effect <%0>";
    }
}
