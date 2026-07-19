/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d extends ta {
    int field_t;
    static int field_s;
    static String field_q;
    static sp field_r;

    public static void a(int param0) {
        field_q = null;
        field_r = null;
        int var1 = 112 % ((param0 - -54) / 34);
    }

    d(int param0) {
        this.field_t = param0;
    }

    final static void d(byte param0) {
        L0: {
          if (gn.field_m != null) {
            gn.field_m.b(true);
            break L0;
          } else {
            break L0;
          }
        }
        je.field_g = new th();
        if (param0 > -43) {
          d.a(8);
          hb.field_x.c(je.field_g, 33);
          return;
        } else {
          hb.field_x.c(je.field_g, 33);
          return;
        }
    }

    final static void a(String param0, byte param1) {
        try {
            if (param1 != 31) {
                field_r = (sp) null;
            }
            eb.field_c = param0;
            od.b(param1 + 97, 12);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "d.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract Object b(int param0);

    abstract boolean c(byte param0);

    static {
        field_q = "Account created successfully!";
        field_s = 0;
    }
}
