/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    nc field_b;
    static String field_a;
    static String field_g;
    private int field_e;
    private int[] field_f;
    static boolean field_d;
    boolean field_c;

    final void a(ga param0, kq param1, vl param2, int param3, byte param4, vl[] param5) {
        if (param4 > -90) {
          return;
        } else {
          int discarded$2 = td.a(param5, ((oi) this).field_b.field_j[((oi) this).field_f[param3 % ((oi) this).field_e]], param1, param2, param0, 10792131);
          return;
        }
    }

    final int a(int param0) {
        int var2 = -58 / ((16 - param0) / 35);
        return ((oi) this).field_e;
    }

    final String a(int param0, byte param1) {
        if (param1 >= -117) {
          ((oi) this).field_e = 122;
          return ((oi) this).field_b.field_c[this.a(param0, true)].field_j;
        } else {
          return ((oi) this).field_b.field_c[this.a(param0, true)].field_j;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 <= 47) {
            boolean discarded$0 = oi.a(97, -60, 47, -79);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 == -1) {
          if (null != bm.field_d) {
            if (!bm.field_d.b(param1 ^ -2100)) {
              if (no.field_p != null) {
                if (!no.field_p.d((byte) 119)) {
                  if (!na.j((byte) -60)) {
                    if (qa.a(param3, param0, (byte) 108, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  no.field_p = null;
                  cr.f((byte) -55);
                  return true;
                }
              } else {
                if (!na.j((byte) -60)) {
                  if (qa.a(param3, param0, (byte) 108, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              cr.f((byte) -123);
              return true;
            }
          } else {
            if (no.field_p != null) {
              if (!no.field_p.d((byte) 119)) {
                if (!na.j((byte) -60)) {
                  if (qa.a(param3, param0, (byte) 108, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                no.field_p = null;
                cr.f((byte) -55);
                return true;
              }
            } else {
              if (!na.j((byte) -60)) {
                if (qa.a(param3, param0, (byte) 108, param2)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
          field_a = null;
          return ((oi) this).field_f[param0 % ((oi) this).field_e];
        } else {
          return ((oi) this).field_f[param0 % ((oi) this).field_e];
        }
    }

    final String a(byte param0, int param1) {
        if (param0 <= 94) {
          ((oi) this).field_e = 59;
          return ((oi) this).field_b.field_c[this.a(param1, true)].field_o;
        } else {
          return ((oi) this).field_b.field_c[this.a(param1, true)].field_o;
        }
    }

    oi(nc param0) {
        this(param0, kk.a(false, param0.field_i, (fo) null), param0.field_i);
    }

    oi(nc param0, int[] param1, int param2) {
        ((oi) this).field_f = param1;
        ((oi) this).field_b = param0;
        ((oi) this).field_e = param2;
        if ((((oi) this).field_e ^ -1) > -1) {
            ((oi) this).field_e = ((oi) this).field_f.length;
            ((oi) this).field_c = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_d = true;
        field_a = "Close";
    }
}
