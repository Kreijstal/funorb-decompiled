/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bga extends bw {
    static sga field_m;
    static String field_h;
    int field_i;
    static kv[] field_j;
    static String field_f;
    static String field_k;
    byte[] field_g;
    static cc field_l;

    final static void c(byte param0) {
        L0: {
          if (null != oq.field_b) {
            oq.field_b.p(-79);
            break L0;
          } else {
            break L0;
          }
        }
        vk.field_q = new gda();
        if (param0 >= -4) {
          field_j = (kv[]) null;
          kka.field_l.e(vk.field_q, 33);
          return;
        } else {
          kka.field_l.e(vk.field_q, 33);
          return;
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        if (param0) {
          bga.a(-57, true);
          field_j = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_m = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(wh.field_p == null)) {
            wh.field_p.a(param1, param0 + 17884);
        }
        if (param0 != -10082) {
            field_f = (String) null;
            return;
        }
    }

    private bga() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Your food is now going mouldy. If it's left alone long enough, a creature will spawn from it!";
        field_k = "Retry";
        field_f = "Cancel";
    }
}
