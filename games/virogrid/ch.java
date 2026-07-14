/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String[] field_j;
    static java.math.BigInteger field_i;
    int field_g;
    static String field_h;
    int field_d;
    int field_c;
    int field_k;
    static int field_f;
    static boolean field_b;
    static um field_a;
    static boolean field_e;

    final static boolean a(String param0, byte param1) {
        if (param1 != -73) {
            return true;
        }
        return null != j.a(0, param0) ? true : false;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_e = true;
          field_i = null;
          field_j = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        Object var2 = null;
        if (!kb.field_c) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (hf.field_w != null) {
              hf.field_w.h(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = og.c(-113);
          aa.field_a = new ca(var1, (String) null, true, false, false);
          tm.field_l.a(0, (fi) (Object) fi.field_t);
          if (param0 >= -109) {
            var2 = null;
            boolean discarded$2 = ch.a((String) null, (byte) -120);
            fi.field_t.b((fi) (Object) aa.field_a, (byte) -53);
            fi.field_t.j(-4236);
            return;
          } else {
            fi.field_t.b((fi) (Object) aa.field_a, (byte) -53);
            fi.field_t.j(-4236);
            return;
          }
        }
    }

    final static void a(int param0, pd param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        ok.field_G = param8;
        co.field_g = param4;
        ed.field_b = param3;
        fd.field_C = param7;
        rj.field_l = param5;
        ii.field_a = param1;
        if (param6 < 7) {
          return;
        } else {
          dl.field_c = param0;
          rb.field_c = param2;
          ji.field_e = (dk) (Object) new pn();
          bc.field_a = new sb(param1);
          ql.field_q = new ha(ji.field_e, bc.field_a);
          return;
        }
    }

    final static void a(boolean param0) {
        if (null != md.field_e) {
          if (null != md.field_e.field_d) {
            md.field_e.field_d.field_xb = false;
            md.field_e = null;
            wf.field_d = null;
            if (!param0) {
              field_i = null;
              return;
            } else {
              return;
            }
          } else {
            md.field_e = null;
            wf.field_d = null;
            if (!param0) {
              field_i = null;
              return;
            } else {
              return;
            }
          }
        } else {
          md.field_e = null;
          wf.field_d = null;
          if (!param0) {
            field_i = null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> cannot join; the game is full.";
        field_f = 0;
        field_i = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
