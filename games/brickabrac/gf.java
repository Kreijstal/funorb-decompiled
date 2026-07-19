/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf {
    static wp field_e;
    int field_a;
    static String field_d;
    static n field_c;
    static String field_b;
    static hj field_f;
    static String field_g;

    abstract void b(byte param0);

    final boolean a(byte param0) {
        if (param0 != -51) {
            return true;
        }
        return true;
    }

    abstract boolean a(char param0, int param1, int param2);

    abstract void a(boolean param0, boolean param1, int param2);

    gf(int param0) {
        this.field_a = param0;
    }

    public static void c(byte param0) {
        cq discarded$2 = null;
        field_g = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_e = null;
        if (param0 == -91) {
          return;
        } else {
          discarded$2 = gf.a(119, 39, -126, (byte) 48);
          return;
        }
    }

    final static cq a(int param0, int param1, int param2, byte param3) {
        cq var4 = null;
        int var5 = 0;
        cq var6 = null;
        cq var7 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        var4 = (cq) ((Object) fk.field_f.d(-55));
        if (param3 >= -102) {
          gf.c((byte) -109);
          L0: while (true) {
            if (var4 != null) {
              if (param1 != var4.field_m) {
                var4 = (cq) ((Object) fk.field_f.a((byte) 116));
                continue L0;
              } else {
                return var4;
              }
            } else {
              var7 = new cq();
              var4 = var7;
              var7.field_s = param2;
              var7.field_m = param1;
              fk.field_f.a(var7, (byte) 3);
              gn.a(-21167, var7, param0);
              return var7;
            }
          }
        } else {
          L1: while (true) {
            if (var4 != null) {
              if (param1 != var4.field_m) {
                var4 = (cq) ((Object) fk.field_f.a((byte) 116));
                continue L1;
              } else {
                return var4;
              }
            } else {
              var6 = new cq();
              var4 = var6;
              var6.field_s = param2;
              var6.field_m = param1;
              fk.field_f.a(var6, (byte) 3);
              gn.a(-21167, var6, param0);
              return var6;
            }
          }
        }
    }

    static {
        field_c = new n();
        field_b = "Connection lost - attempting to reconnect";
        field_g = "Charge: instantly charges the ball.";
    }
}
