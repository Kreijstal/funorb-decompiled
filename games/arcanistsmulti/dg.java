/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rl {
    private String field_r;
    static String field_v;
    static String field_q;
    static String field_t;
    static int field_u;
    static boolean field_s;
    private boolean field_w;

    public static void d(int param0) {
        if (param0 != -1) {
          field_v = null;
          field_t = null;
          field_q = null;
          field_v = null;
          return;
        } else {
          field_t = null;
          field_q = null;
          field_v = null;
          return;
        }
    }

    final eh a(String param0, int param1) {
        int var3 = 0;
        ho var3_ref = null;
        CharSequence var4 = null;
        eh stackIn_6_0 = null;
        eh stackIn_13_0 = null;
        eh stackOut_12_0 = null;
        eh stackOut_11_0 = null;
        eh stackOut_5_0 = null;
        eh stackOut_4_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (ee.a((byte) 127, var4)) {
          if (!param0.equals((Object) (Object) ((dg) this).field_r)) {
            var3_ref = r.a(param0, 256);
            if (var3_ref != null) {
              if (null != var3_ref.field_e) {
                return ug.field_c;
              } else {
                L0: {
                  ((dg) this).field_r = param0;
                  ((dg) this).field_w = var3_ref.field_f;
                  var3 = 0 % ((param1 - -50) / 36);
                  if (!((dg) this).field_w) {
                    stackOut_12_0 = ra.field_k;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_11_0 = nn.field_s;
                    stackIn_13_0 = stackOut_11_0;
                    break L0;
                  }
                }
                return (eh) (Object) stackIn_13_0;
              }
            } else {
              return ug.field_c;
            }
          } else {
            L1: {
              var3 = 0 % ((param1 - -50) / 36);
              if (!((dg) this).field_w) {
                stackOut_5_0 = ra.field_k;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = nn.field_s;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return (eh) (Object) stackIn_6_0;
          }
        } else {
          return ra.field_k;
        }
    }

    final void e(int param0) {
        ((dg) this).field_r = null;
        if (param0 <= 123) {
            ((dg) this).field_w = false;
        }
    }

    final static void d(byte param0) {
        if (param0 <= -52) {
          L0: {
            if (ce.field_m.field_m != vd.field_k) {
              ma.field_N = ma.field_N + (ce.field_m.field_m - vd.field_k);
              vd.field_k = ce.field_m.field_m;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 > (jo.field_e ^ -1)) {
              jo.field_e = jo.field_e - 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 < jo.field_e) {
            ed.j(120);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    dg(rn param0) {
        super(param0);
        ((dg) this).field_w = false;
    }

    final String a(String param0, byte param1) {
        CharSequence var5 = null;
        String var3 = null;
        ho var4 = null;
        if (param1 >= -114) {
            field_u = 97;
            var5 = (CharSequence) (Object) param0;
            var3 = uk.a(var5, (byte) -118);
            if (!(var3 == null)) {
                return var3;
            }
            if (!(param0.equals((Object) (Object) ((dg) this).field_r))) {
                var4 = r.a(param0, 256);
                if (var4 == null) {
                    return null;
                }
                if (var4.field_e != null) {
                    return null;
                }
                ((dg) this).field_r = param0;
                ((dg) this).field_w = var4.field_f;
            }
            if (!(((dg) this).field_w)) {
                return ec.field_e;
            }
            return wk.field_i;
        }
        CharSequence var6 = (CharSequence) (Object) param0;
        var3 = uk.a(var6, (byte) -118);
        if (!(var3 == null)) {
            return var3;
        }
        if (!(param0.equals((Object) (Object) ((dg) this).field_r))) {
            var4 = r.a(param0, 256);
            if (var4 == null) {
                return null;
            }
            if (var4.field_e != null) {
                return null;
            }
            ((dg) this).field_r = param0;
            ((dg) this).field_w = var4.field_f;
        }
        if (!(((dg) this).field_w)) {
            return ec.field_e;
        }
        return wk.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Enter name of friend to add to list";
        field_q = "This is the Book of Nature. Nature spells focus on trapping enemies and controlling the battlefield. You require 5 wands to purchase this spellbook; you currently have ";
        field_t = "Rated games are available to members only. To become a member and gain access to all the spells, please visit the 'Account' section of the website.";
        field_s = false;
    }
}
