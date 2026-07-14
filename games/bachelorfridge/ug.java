/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pv {
    private int field_j;
    private int field_n;
    static wl field_q;
    private double field_p;
    static String field_m;
    static int[][] field_l;
    static String field_k;
    static kv field_o;

    final static Object a(boolean param0, byte[] param1, int param2) {
        gla var3 = null;
        if (param2 == -19524) {
          if (param1 != null) {
            if ((param1.length ^ -1) < -137) {
              var3 = new gla();
              ((nu) (Object) var3).a((byte) 43, param1);
              return (Object) (Object) var3;
            } else {
              if (!param0) {
                return (Object) (Object) param1;
              } else {
                return (Object) (Object) gs.a((byte) 119, param1);
              }
            }
          } else {
            return null;
          }
        } else {
          field_l = null;
          if (param1 != null) {
            if ((param1.length ^ -1) < -137) {
              var3 = new gla();
              ((nu) (Object) var3).a((byte) 43, param1);
              return (Object) (Object) var3;
            } else {
              if (!param0) {
                return (Object) (Object) param1;
              } else {
                return (Object) (Object) gs.a((byte) 119, param1);
              }
            }
          } else {
            return null;
          }
        }
    }

    private final void b(int param0) {
        if (param0 != 1) {
            field_o = null;
        }
    }

    private final int c(int param0) {
        if (param0 != -137) {
          field_k = null;
          return Math.abs(((ug) this).field_j) * 100 / 56 >> 1841511937;
        } else {
          return Math.abs(((ug) this).field_j) * 100 / 56 >> 1841511937;
        }
    }

    private final int d(int param0) {
        if (param0 != -27656) {
          ((ug) this).field_n = 102;
          return (int)((double)((ug) this).field_g * ((ug) this).field_p) - -((ug) this).field_n;
        } else {
          return (int)((double)((ug) this).field_g * ((ug) this).field_p) - -((ug) this).field_n;
        }
    }

    final boolean b(boolean param0) {
        ((ug) this).field_g = ((ug) this).field_g + 1;
        if (((ug) this).field_g + 1 <= this.c(-137)) {
          if (((ug) this).field_j != 0) {
            if (!param0) {
              L0: {
                field_k = null;
                if (((ug) this).field_g == 1) {
                  ((ug) this).field_f.field_u = ((ug) this).field_f.field_u + ((ug) this).field_j / 56;
                  ((ug) this).field_f.field_v.a((byte) 13, ((ug) this).field_f.field_g.field_o.field_b, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((ug) this).field_f.field_n = this.d(-27656);
              return false;
            } else {
              L1: {
                if (((ug) this).field_g == 1) {
                  ((ug) this).field_f.field_u = ((ug) this).field_f.field_u + ((ug) this).field_j / 56;
                  ((ug) this).field_f.field_v.a((byte) 13, ((ug) this).field_f.field_g.field_o.field_b, 1);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ug) this).field_f.field_n = this.d(-27656);
              return false;
            }
          } else {
            this.b(1);
            return true;
          }
        } else {
          this.b(1);
          return true;
        }
    }

    ug(jfa param0, int param1) {
        ((ug) this).field_j = param1;
        ((ug) this).field_f = param0;
        ((ug) this).field_n = ((ug) this).field_f.field_n;
        ((ug) this).field_p = (double)((ug) this).field_j / (double)this.c(-137);
        if (0 > ((ug) this).field_j) {
            ((ug) this).field_f.field_s = false;
        } else {
            ((ug) this).field_f.field_s = true;
        }
    }

    public static void c(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != 10) {
          field_k = null;
          field_k = null;
          field_o = null;
          field_q = null;
          return;
        } else {
          field_k = null;
          field_o = null;
          field_q = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Passwords must be between 5 and 20 letters and numbers";
        field_k = "Please enter your age in years";
        field_l = new int[][]{new int[12], new int[11], new int[11], new int[11], new int[11]};
    }
}
