/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static char[] field_f;
    static String field_b;
    static String field_e;
    static ml field_d;
    static String field_c;
    static String field_a;
    static String field_g;

    final static km b(int param0) {
        if (param0 != 1463) {
            cg.a(false, 127);
            return ch.field_a.field_Jb;
        }
        return ch.field_a.field_Jb;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_c = null;
        if (param0 >= -24) {
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(int param0, ii param1) {
        if (param0 != 8799) {
            return;
        }
        ph.field_k = param1;
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (null != wc.field_g) {
            ob.a((byte) -83, wc.field_g);
            break L0;
          } else {
            break L0;
          }
        }
        if (md.field_e == null) {
          L1: {
            ra.a((byte) 3, param0);
            if (null != km.field_yb) {
              km.field_yb.a(param0, param1 + 18109);
              break L1;
            } else {
              break L1;
            }
          }
          cf.a((byte) -111, param0);
          if (param1 != 6851) {
            field_b = null;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            md.field_e.a((byte) -22, param0);
            ra.a((byte) 3, param0);
            if (null != km.field_yb) {
              km.field_yb.a(param0, param1 + 18109);
              break L2;
            } else {
              break L2;
            }
          }
          cf.a((byte) -111, param0);
          if (param1 == 6851) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> might change the options - wait and see.";
        field_f = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_a = "No options available";
        field_c = "You must play 1 more rated game before playing with the current options.";
        field_g = "Solicitation";
        field_e = "<%0> has no pieces left";
    }
}
