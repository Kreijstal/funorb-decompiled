/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends hi {
    private String field_p;
    static int[] field_o;
    static String[] field_t;
    static hj[] field_q;
    private boolean field_n;
    static String field_s;
    static int field_r;

    final qd a(String param0, byte param1) {
        qj var3 = null;
        CharSequence var4 = null;
        qd stackIn_13_0 = null;
        qd stackIn_17_0 = null;
        qd stackOut_16_0 = null;
        qd stackOut_15_0 = null;
        qd stackOut_12_0 = null;
        qd stackOut_11_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (!dk.a(var4, 5408)) {
          return vh.field_h;
        } else {
          L0: {
            if (param0.equals((Object) (Object) ((bc) this).field_p)) {
              break L0;
            } else {
              var3 = lf.a(param0, true);
              if (var3 != null) {
                if (var3.field_e == null) {
                  ((bc) this).field_n = var3.field_f;
                  ((bc) this).field_p = param0;
                  break L0;
                } else {
                  return uj.field_b;
                }
              } else {
                return uj.field_b;
              }
            }
          }
          if (param1 != -99) {
            L1: {
              ((bc) this).b((byte) -37);
              if (((bc) this).field_n) {
                stackOut_16_0 = nc.field_bb;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              } else {
                stackOut_15_0 = vh.field_h;
                stackIn_17_0 = stackOut_15_0;
                break L1;
              }
            }
            return stackIn_17_0;
          } else {
            L2: {
              if (((bc) this).field_n) {
                stackOut_12_0 = nc.field_bb;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = vh.field_h;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0;
          }
        }
    }

    final String a(int param0, String param1) {
        CharSequence var5 = null;
        String var3 = null;
        qj var4 = null;
        if (param0 != -11300) {
            field_s = null;
            var5 = (CharSequence) (Object) param1;
            var3 = ki.a(-1, var5);
            if (var3 != null) {
                return var3;
            }
            if (!param1.equals((Object) (Object) ((bc) this).field_p)) {
                var4 = lf.a(param1, true);
                if (var4 == null) {
                    return null;
                }
                if (var4.field_e != null) {
                    return null;
                }
                ((bc) this).field_n = var4.field_f;
                ((bc) this).field_p = param1;
            }
            if (!(((bc) this).field_n)) {
                return j.field_c;
            }
            return kf.field_b;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        var3 = ki.a(-1, var6);
        if (var3 != null) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((bc) this).field_p)) {
            var4 = lf.a(param1, true);
            if (var4 == null) {
                return null;
            }
            if (var4.field_e != null) {
                return null;
            }
            ((bc) this).field_n = var4.field_f;
            ((bc) this).field_p = param1;
        }
        if (!(((bc) this).field_n)) {
            return j.field_c;
        }
        return kf.field_b;
    }

    public static void c(byte param0) {
        if (param0 != -97) {
            return;
        }
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
    }

    bc(vi param0) {
        super(param0);
        ((bc) this).field_n = false;
    }

    final void b(byte param0) {
        ((bc) this).field_p = null;
        if (param0 <= 59) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Type your email address again to make sure it's correct";
    }
}
