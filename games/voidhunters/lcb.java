/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lcb extends rqa {
    static String field_p;
    static phb[] field_t;
    static llb field_r;
    static ml[] field_q;
    static String field_s;
    static boolean field_o;

    public static void a(int param0) {
        field_t = null;
        field_q = null;
        if (param0 != 0) {
          boolean[] var2 = (boolean[]) null;
          lcb.a((boolean[]) null, (boolean[]) null, (byte) 62);
        }
        field_p = null;
        field_s = null;
        field_r = null;
    }

    lcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        boolean[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (boolean[]) null;
            lcb.a((boolean[]) null, (boolean[]) null, (byte) -94);
          }
          stackIn_3_0 = new nc(frb.a(151, 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lcb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean[] param0, boolean[] param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (param0[86]) {
            for (var3_int = 0; var3_int < ecb.field_a.length; var3_int++) {
              var4 = ecb.field_a[var3_int];
              if (!param1[var4] &&
                param0[var4]) {
                var5 = 1 << var3_int;
                if (param0[81]) {
                  var5 = var5 << 10;
                }
                stackIn_14_0 = var5;
                stackIn_15_1 = !(pqa.a(var5, 11284));
                ucb.a(stackIn_14_0, stackIn_15_1, 11585);
              }
            }
          }
          if (param2 != 79) {
            lcb.a(-53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("lcb.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_p = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_q = new ml[5];
        field_s = "Your email address is used to identify this account";
        field_o = true;
    }
}
