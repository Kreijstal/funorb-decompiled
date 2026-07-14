/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends java.awt.Canvas {
    static int field_d;
    static jd[][] field_a;
    static String field_b;
    private java.awt.Component field_c;

    final static wl a(di param0, int param1, int param2, di param3, int param4) {
        if (param4 != 24888) {
            field_b = null;
        }
        if (!vj.a(param2, param0, param1, (byte) 121)) {
            return null;
        }
        return cl.a(param3.a(param4 + -24766, param1, param2), true);
    }

    final static void a(int param0) {
        sn.field_m = new vh(0L, (vh) null);
        if (!(!tq.field_p)) {
            sn.field_m.a(21, pm.field_m);
        }
        sn.field_m.a(39, c.field_e);
        kg.field_l = new vn(sn.field_l, sn.field_m);
        ir.field_a = new vh(0L, (vh) null);
        ir.field_a.a(-117, (vh) (Object) kg.field_l.field_i);
        ir.field_a.a(-120, gj.field_K);
        f.a(48);
        int var1 = 106 / ((-83 - param0) / 35);
    }

    public final void paint(java.awt.Graphics param0) {
        ((cn) this).field_c.paint(param0);
    }

    final static boolean a(byte param0) {
        if (param0 < 33) {
            Object var2 = null;
            wl discarded$0 = cn.a((di) null, 9, -34, (di) null, -113);
        }
        return qi.field_c;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 38) {
            field_b = null;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((cn) this).field_c.update(param0);
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var2 = 115 / ((param0 - 73) / 39);
          var3 = param1.length();
          if (var3 <= 20) {
            break L0;
          } else {
            var3 = 20;
            break L0;
          }
        }
        var4 = new char[var3];
        var5 = 0;
        L1: while (true) {
          if (var5 >= var3) {
            return new String(var4);
          } else {
            L2: {
              var6 = param1.charAt(var5);
              if (65 > var6) {
                break L2;
              } else {
                if (var6 > 90) {
                  break L2;
                } else {
                  var4[var5] = (char)(var6 + 32);
                  var5++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var6 < 97) {
                  break L4;
                } else {
                  if (var6 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (48 > var6) {
                  break L5;
                } else {
                  if (var6 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var4[var5] = (char)95;
              var5++;
              continue L1;
            }
            var4[var5] = (char)var6;
            var5++;
            continue L1;
          }
        }
    }

    cn(java.awt.Component param0) {
        ((cn) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Open in popup window";
    }
}
