/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends um {
    static om field_y;
    static int field_w;
    static sd field_u;
    static je field_s;
    private nn field_r;
    static String field_q;
    private nn field_t;
    static String[] field_x;
    static String[] field_v;

    final static void a(ri param0, byte param1, boolean param2) {
        if (param1 >= -44) {
            return;
        }
        fe.a(param0, 256, param2, 113);
    }

    final jk a(int param0, String param1) {
        String var3 = ((mm) this).field_t.field_A.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return db.field_h;
        }
        if (!(oe.a((byte) -41, var4, var3))) {
            return db.field_h;
        }
        if (param0 != 0) {
            field_v = null;
            if (!(!this.a(param1, (byte) 47))) {
                return db.field_h;
            }
            return pf.field_a;
        }
        if (!(!this.a(param1, (byte) 47))) {
            return db.field_h;
        }
        return pf.field_a;
    }

    mm(nn param0, nn param1, nn param2) {
        super(param0);
        ((mm) this).field_r = param2;
        ((mm) this).field_t = param1;
    }

    public static void g(int param0) {
        Object var2 = null;
        field_v = null;
        field_x = null;
        if (param0 != 0) {
          var2 = null;
          mm.a((ri) null, (byte) 14, false);
          field_s = null;
          field_y = null;
          field_u = null;
          field_q = null;
          return;
        } else {
          field_s = null;
          field_y = null;
          field_u = null;
          field_q = null;
          return;
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        var3 = ((mm) this).field_r.field_A.toLowerCase();
        var4 = 124 / ((param1 - -5) / 36);
        var5 = param0.toLowerCase();
        if (-1 > (var3.length() ^ -1)) {
          if ((var5.length() ^ -1) < -1) {
            var6 = var3.lastIndexOf("@");
            if (var6 >= 0) {
              if (var3.length() + -1 > var6) {
                var7 = var3.substring(0, var6);
                var8 = var3.substring(var6 - -1);
                if (-1 < (var5.indexOf(var7) ^ -1)) {
                  if (0 <= var5.indexOf(var8)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final String a(String param0, int param1) {
        String var7 = ((mm) this).field_t.field_A.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!pi.a(var5, 17510))) {
            return ka.field_i;
        }
        if (q.a(false, var5)) {
            return ic.field_d;
        }
        if (!(!ha.a(var5, -78))) {
            return ac.field_d;
        }
        if (param1 != 26202) {
            Object var6 = null;
            boolean discarded$0 = this.a((String) null, (byte) -27);
            if (this.a(param0, (byte) 89)) {
                return nl.field_l;
            }
            if ((var7.length() ^ -1) >= -1) {
                return nb.field_W;
            }
            if (!(!jd.a(var5, -6270, var7))) {
                return oj.field_f;
            }
            if (mf.a((byte) -28, var7, var5)) {
                return ei.field_h;
            }
            if (!(!qa.a(16732, var5, var7))) {
                return oj.field_f;
            }
            return ka.field_i;
        }
        if (this.a(param0, (byte) 89)) {
            return nl.field_l;
        }
        if ((var7.length() ^ -1) >= -1) {
            return nb.field_W;
        }
        if (!(!jd.a(var5, -6270, var7))) {
            return oj.field_f;
        }
        if (mf.a((byte) -28, var7, var5)) {
            return ei.field_h;
        }
        if (!(!qa.a(16732, var5, var7))) {
            return oj.field_f;
        }
        return ka.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Try again";
        field_x = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_v = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
