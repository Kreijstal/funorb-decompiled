/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static r field_a;
    static String field_h;
    static bj field_e;
    static int[] field_g;
    static boolean field_c;
    static String field_b;
    static int field_f;
    static String field_d;

    final static void a(int param0, byte param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var3_intLifetime1;
        var4 = MinerDisturbance.field_ab;
        try {
          if (param1 != 85) {
            return;
          }
          if (param2) {
            for (var3_int = 0; var3_int < 25; var3_int++) {
              if (rb.field_l[var3_int] == param0 &&
                null != dn.field_t[var3_int]) {
                kf.a(dn.field_t[var3_int], (byte) -114);
                dn.field_t[var3_int] = null;
                return;
              }
            }
            return;
          }
          var5 = 0;
          var3_intLifetime1 = var5;
          while (var5 < 25) {
            if (sd.field_c[var5] == param0 &&
              null != gl.field_u[var5]) {
              kf.a(gl.field_u[var5], (byte) -111);
              gl.field_u[var5] = null;
              return;
            }
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "ge.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 < 95) {
          field_c = false;
        }
        field_b = null;
        field_h = null;
    }

    final static ih a(byte[] param0, int param1) {
        ih var2 = null;
        RuntimeException var2_ref = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != -569) {
            field_d = (String) null;
          }
          var2 = new ih(param0, bg.field_d, oc.field_e, qk.field_b, ng.field_e, af.field_p, db.field_b);
          ec.a((byte) -111);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ge.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_h = "<%0> <times> 500 = <%1>";
        field_a = new r();
        field_b = "???";
        field_f = 48;
        field_g = new int[256];
    }
}
