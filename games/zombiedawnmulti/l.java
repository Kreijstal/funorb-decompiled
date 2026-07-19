/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    java.awt.Image field_g;
    int field_f;
    static bo field_c;
    int[] field_b;
    int field_h;
    static int field_a;
    static k field_e;
    static String field_d;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void b(byte param0) {
        if (param0 < 94) {
            return;
        }
        oo.a(this.field_b, this.field_h, this.field_f);
    }

    final static boolean a(int param0, int param1) {
        if (param1 > -23) {
            return false;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final static hf a(byte param0) {
        String var1 = null;
        if (param0 != -118) {
          return (hf) null;
        } else {
          L0: {
            var1 = s.a((byte) 32);
            if (var1 == null) {
              break L0;
            } else {
              if (var1.indexOf('@') < 0) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new hf(s.a((byte) 32), bg.a(2));
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 64) {
            field_e = (k) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void a(int param0, byte param1) {
        ga var2 = null;
        var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-65, 2);
        if (param1 >= -43) {
          return;
        } else {
          var2.a(109, 4);
          var2.a(-119, ro.c((byte) 126));
          return;
        }
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    static {
        field_c = new bo("usename");
        field_a = 0;
        field_d = "Game";
    }
}
