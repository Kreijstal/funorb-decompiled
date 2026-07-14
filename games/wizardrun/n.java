/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static int field_c;
    static boolean field_a;
    static mg field_b;

    final static ne a(byte param0) {
        String var1 = null;
        if (param0 == 12) {
          var1 = nf.a((byte) 123);
          if (var1 != null) {
            if ((var1.indexOf('@') ^ -1) > -1) {
              return new ne(nf.a((byte) 122), pa.a((byte) -106));
            } else {
              var1 = "";
              return new ne(nf.a((byte) 122), pa.a((byte) -106));
            }
          } else {
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          }
        } else {
          field_c = -110;
          var1 = nf.a((byte) 123);
          if (var1 == null) {
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          } else {
            L0: {
              if ((var1.indexOf('@') ^ -1) <= -1) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            n.a(-8);
        }
    }

    final static ua a(int param0, kl param1, kl param2, int param3, int param4) {
        if (param3 <= -114) {
          if (!h.a(param0, param4, param1, -114)) {
            return null;
          } else {
            return mg.a(65, param2.a(param4, param0, 1));
          }
        } else {
          return null;
        }
    }

    static {
    }
}
