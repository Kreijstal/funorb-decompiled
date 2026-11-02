/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb {
    static String muGamelistOwner;
    static int[] field_b;
    static int field_e;
    static vh field_f;
    static int keycodeDefaultLeft2;
    static String no;
    static int[] field_c;

    public static void c(int param0) {
        field_c = null;
        if (param0 == 4) {
          muGamelistOwner = null;
          no = null;
          field_b = null;
          field_f = null;
          return;
        }
        field_f = (vh) null;
        muGamelistOwner = null;
        no = null;
        field_b = null;
        field_f = null;
    }

    final static void b(int param0) {
        String var2 = (String) null;
        rf.a((String) null, -125, "");
        if (param0 != 3) {
          field_f = (vh) null;
        }
    }

    abstract void a(byte[] param0, byte param1);

    abstract byte[] a(int param0);

    final static void d(int param0) {
        if (un.field_e != 0) {
          dp.field_c.field_hb = dq.a(2, 0, il.off);
          if (param0 > -97) {
            mb.b(111);
            return;
          }
          return;
        }
        dp.field_c.field_hb = dq.a(3, 0, jc.on);
        if (param0 > -97) {
          mb.b(111);
          return;
        }
    }

    static {
        field_b = new int[4];
        muGamelistOwner = "Owner";
        keycodeDefaultLeft2 = 96;
        no = "No";
    }
}
