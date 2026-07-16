/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_i;
    boolean field_h;
    boolean field_k;
    int field_e;
    boolean field_g;
    int field_f;
    static String[] field_b;
    static e field_n;
    static wg field_o;
    int field_a;
    static eh field_j;
    int field_c;
    boolean field_m;
    boolean field_d;
    static String field_l;

    jf() {
        this(3);
    }

    final static void a(boolean param0, eh param1, eh param2, eh param3, int param4) {
        if (param4 != -1) {
          field_n = null;
          w.field_I = oe.a("", false);
          w.field_I.a(false, 11358);
          cf.a(param2, param3, 60, param1);
          jg.b(461050508);
          cb.field_c = kh.field_e;
          pa.field_l = kh.field_e;
          return;
        } else {
          w.field_I = oe.a("", false);
          w.field_I.a(false, 11358);
          cf.a(param2, param3, 60, param1);
          jg.b(461050508);
          cb.field_c = kh.field_e;
          pa.field_l = kh.field_e;
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (null != he.field_Wb) {
          if (param0 > -51) {
            return false;
          } else {
            L0: {
              if (param1.toLowerCase().indexOf(he.field_Wb.toLowerCase()) < 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static vh a(byte[] param0, int param1) {
        vh var2 = null;
        if (param0 != null) {
          var2 = new vh(param0, el.field_w, mb.field_bb, db.field_k, gb.field_F, k.field_c, lj.field_j);
          pe.b((byte) -28);
          if (param1 != 20) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        field_n = null;
        field_l = null;
        if (param0 != -124) {
          field_o = null;
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    jf(int param0) {
        int var2 = 0;
        var2 = param0;
        if (var2 == 0) {
          ((jf) this).field_h = false;
          ((jf) this).field_k = false;
          ((jf) this).field_g = false;
          ((jf) this).field_f = 0;
          ((jf) this).field_m = false;
          ((jf) this).field_e = -1;
          ((jf) this).field_d = true;
          return;
        } else {
          if (var2 == 1) {
            ((jf) this).field_e = -1;
            ((jf) this).field_g = false;
            ((jf) this).field_f = 0;
            ((jf) this).field_a = 20;
            ((jf) this).field_h = false;
            ((jf) this).field_c = 50;
            ((jf) this).field_k = false;
            ((jf) this).field_m = true;
            ((jf) this).field_i = 1;
            ((jf) this).field_d = true;
            return;
          } else {
            if ((var2 ^ -1) == -3) {
              ((jf) this).field_f = 0;
              ((jf) this).field_e = -1;
              ((jf) this).field_g = true;
              ((jf) this).field_m = false;
              ((jf) this).field_h = false;
              ((jf) this).field_k = false;
              ((jf) this).field_d = true;
              return;
            } else {
              L0: {
                if (var2 != 3) {
                  break L0;
                } else {
                  ((jf) this).field_c = 50;
                  ((jf) this).field_k = true;
                  ((jf) this).field_h = false;
                  ((jf) this).field_f = 0;
                  ((jf) this).field_a = 20;
                  ((jf) this).field_g = true;
                  ((jf) this).field_m = false;
                  ((jf) this).field_d = true;
                  ((jf) this).field_e = -1;
                  ((jf) this).field_i = 1;
                  break L0;
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
