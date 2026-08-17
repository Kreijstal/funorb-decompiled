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
        if (param0) {
          lk.b(0, 0, lk.field_b, lk.field_c, 0, 192);
          if (param1 == -71) {
            vt.a(param0, true);
            return;
          } else {
            field_b = 40;
            vt.a(param0, true);
            return;
          }
        } else {
          lk.b();
          if (param1 == -71) {
            vt.a(param0, true);
            return;
          } else {
            field_b = 40;
            vt.a(param0, true);
            return;
          }
        }
    }

    final static void a(int param0, String[] param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3) {
              break L0;
            } else {
              field_a = -32;
              break L0;
            }
          }
          vm.field_c = st.field_z;
          if (255 != param0) {
            if (100 > param0) {
              jh.field_z = au.a(48, param2, param0);
              return;
            } else {
              if (param0 > 105) {
                jh.field_z = au.a(48, param2, param0);
                return;
              } else {
                var7 = param1;
                as.a(256, var7);
                jh.field_z = qr.a(param1, 8192);
                return;
              }
            }
          } else {
            L1: {
              if ((lq.field_d ^ -1) <= -14) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            jh.field_z = bq.a(stackIn_7_0 != 0, 8192);
            var6 = (String[]) null;
            as.a(256, (String[]) null);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("jv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = 0;
    }
}
