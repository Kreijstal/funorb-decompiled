/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rk extends gp {
    boolean field_u;
    boolean field_t;
    volatile boolean field_z;
    static vl[] field_w;
    static String field_x;
    static int field_y;
    static cr field_v;
    static String[] field_A;

    abstract int i(int param0);

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 3) {
            stackIn_3_0 = j.field_s;
            return stackIn_3_0;
          }
          if (param0 != -27) {
            field_A = (String[]) null;
          }
          if (param2 == 6) {
            stackIn_9_0 = sk.field_d;
            return stackIn_9_0;
          }
          if (7 == param2) {
            stackIn_12_0 = sp.field_K;
            return stackIn_12_0;
          }
          if (param2 == 8) {
            stackIn_15_0 = re.field_c;
            return stackIn_15_0;
          }
          if (param2 == 9) {
            stackIn_19_0 = ad.field_d;
            return stackIn_19_0;
          }
          if (10 == param2) {
            stackIn_22_0 = cf.field_b;
            return stackIn_22_0;
          }
          if (param2 == 11) {
            stackIn_26_0 = fg.field_cb;
            return stackIn_26_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_30_0 = Vertigo2.a(new String[]{param1}, bk.field_b, -115);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("rk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (param0 > -96) {
          return;
        }
        rh.b(-14, 17);
    }

    public static void a(boolean param0) {
        field_w = null;
        field_v = null;
        field_x = null;
        field_A = null;
        if (param0) {
          field_y = 77;
        }
    }

    abstract byte[] a(byte param0);

    rk() {
        this.field_z = true;
    }

    static {
        int var0 = 0;
        field_w = new vl[255];
        for (var0 = 0; field_w.length > var0; var0++) {
          field_w[var0] = new vl();
        }
        field_x = "Main Menu";
    }
}
