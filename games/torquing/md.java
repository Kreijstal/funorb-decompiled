/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_c;
    static String field_d;
    static int[] field_a;

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_a = null;
        if (param0 != -137) {
          var2 = null;
          Object discarded$2 = md.a((byte) -126, (byte[]) null, true);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((md) this).field_c.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((md) this).field_c.update(param0);
    }

    final static sm a(String param0, int param1, la param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(param1 ^ -31095, param3);
        if (param1 != 31094) {
          field_b = null;
          var5 = param2.a(param0, param1 ^ -30987, var4);
          return bf.a(var4, var5, param2, (byte) -44);
        } else {
          var5 = param2.a(param0, param1 ^ -30987, var4);
          return bf.a(var4, var5, param2, (byte) -44);
        }
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        jm var3 = null;
        if (param0 == -5) {
          if (param1 != null) {
            if ((param1.length ^ -1) < -137) {
              var3 = new jm();
              ((dp) (Object) var3).a((byte) -70, param1);
              return (Object) (Object) var3;
            } else {
              if (param2) {
                return (Object) (Object) ch.a(param1, (byte) 115);
              } else {
                return (Object) (Object) param1;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    md(java.awt.Component param0) {
        ((md) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
