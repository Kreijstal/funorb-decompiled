/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oga extends bca {
    static String field_r;
    static volatile int field_q;
    nq field_s;
    static sna field_t;

    final void a(byte param0, lu param1) {
        this.a((byte) -67, param1);
        if (param0 > -12) {
          field_q = -39;
          er.a(((oga) this).field_s, 112, param1);
          return;
        } else {
          er.a(((oga) this).field_s, 112, param1);
          return;
        }
    }

    final static void e(int param0) {
        int var2 = 0;
        ema var3 = null;
        L0: {
          var2 = BachelorFridge.field_y;
          rv.field_n = null;
          pw.field_w = null;
          ce.field_y = false;
          if (null != aa.field_l) {
            aa.field_l.d(116);
            aa.field_l = null;
            break L0;
          } else {
            break L0;
          }
        }
        iga.field_c = null;
        if (null == uma.field_M) {
          L1: {
            ola.field_g = null;
            if (null != bia.field_g) {
              bia.field_g.d(79);
              bia.field_g = null;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            wi.field_i = null;
            if (null != iga.field_c) {
              var3 = (ema) (Object) iga.field_c.b((byte) -73);
              L3: while (true) {
                if (var3 == null) {
                  iga.field_c = null;
                  break L2;
                } else {
                  var3.b(0);
                  var3 = (ema) (Object) iga.field_c.a(-25177);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          if (param0 < 7) {
            field_t = null;
            return;
          } else {
            return;
          }
        } else {
          L4: {
            uma.field_M.d(112);
            uma.field_M = null;
            ola.field_g = null;
            if (null != bia.field_g) {
              bia.field_g.d(79);
              bia.field_g = null;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            wi.field_i = null;
            if (null != iga.field_c) {
              var3 = (ema) (Object) iga.field_c.b((byte) -73);
              L6: while (true) {
                if (var3 == null) {
                  iga.field_c = null;
                  break L5;
                } else {
                  var3.b(0);
                  var3 = (ema) (Object) iga.field_c.a(-25177);
                  continue L6;
                }
              }
            } else {
              break L5;
            }
          }
          if (param0 >= 7) {
            return;
          } else {
            field_t = null;
            return;
          }
        }
    }

    final void a(op param0, int param1) {
        ((oga) this).a(param0, (byte) -2);
        int var3 = -73 % ((param1 - 12) / 35);
    }

    oga(int param0, nq param1, nq param2) {
        super(param0, param1);
        ((oga) this).field_s = param2;
    }

    public static void d(int param0) {
        if (param0 >= -96) {
            oga.e(-82);
            field_r = null;
            field_t = null;
            return;
        }
        field_r = null;
        field_t = null;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new er(param1, (oga) this);
    }

    oga(lu param0) {
        super(param0);
        ((oga) this).field_k = param0.e((byte) 122);
        ((oga) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((oga) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((oga) this).field_s = qi.a(param0, (byte) 78);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_r = "Names cannot start or end with space or underscore";
    }
}
