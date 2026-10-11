/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static int field_b;
    static int field_a;

    final static void a(boolean param0, boolean param1) {
        sm.a((byte) 127, param0, param1);
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (!param0) {
          lk.b();
          if (param1 != -71) {
            field_b = 40;
            vt.a(param0, true);
            return;
          }
          vt.a(param0, true);
          return;
        }
        lk.b(0, 0, lk.field_b, lk.field_c, 0, 192);
        if (param1 != -71) {
          field_b = 40;
          vt.a(param0, true);
          return;
        }
        vt.a(param0, true);
    }

    final static void a(int param0, String[] param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param3) {
            field_a = -32;
          }
          vm.field_c = st.field_z;
          if (255 == param0) {
            stackIn_7_0 = !(lq.field_d >= 13);
            jh.field_z = bq.a(stackIn_7_0, 8192);
            var6 = (String[]) null;
            as.a(256, (String[]) null);
            return;
          }
          if (100 > param0) {
            jh.field_z = au.a(48, param2, param0);
            return;
          }
          if (param0 > 105) {
            jh.field_z = au.a(48, param2, param0);
            return;
          }
          var7 = param1;
          as.a(256, var7);
          jh.field_z = qr.a(param1, 8192);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("jv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = 0;
    }
}
