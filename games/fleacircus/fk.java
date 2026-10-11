/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends dl {
    static vc field_z;
    static String field_B;
    ni field_A;
    static boolean field_D;
    byte field_E;
    static int field_C;
    int field_y;
    static String field_x;

    final static void a(String param0, int param1, boolean param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if (param2) {
            return;
          }
          ui.field_kb = ui.field_ob;
          if (param1 == 255) {
            stackIn_12_0 = !(ug.field_c >= 13);
            kh.field_a = ld.a(stackIn_12_0, (byte) 42);
            var6 = (String[]) null;
            m.a(-44, (String[]) null);
            return;
          }
          if (param1 < 100) {
            kh.field_a = af.a((byte) 36, param1, param0);
            return;
          }
          if (105 < param1) {
            kh.field_a = af.a((byte) 36, param1, param0);
            return;
          }
          var4 = param3;
          m.a(-100, var4);
          kh.field_a = ha.a(param3, -21916);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("fk.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 == 105) {
          field_B = null;
          field_z = null;
          field_x = null;
          return;
        }
        String[] var2 = (String[]) null;
        fk.a((String) null, 1, true, (String[]) null);
        field_B = null;
        field_z = null;
        field_x = null;
    }

    final int f(int param0) {
        if (param0 != 8651) {
          return 45;
        }
        if (this.field_A != null) {
          return 100 * this.field_A.field_i / (this.field_A.field_k.length - this.field_E);
        }
        return 0;
    }

    final byte[] g(int param0) {
        if (this.field_q) {
          throw new RuntimeException();
        }
        if (this.field_A.field_i < -this.field_E + this.field_A.field_k.length) {
          throw new RuntimeException();
        }
        if (param0 == 100) {
          return this.field_A.field_k;
        }
        field_D = false;
        return this.field_A.field_k;
    }

    fk() {
    }

    static {
        field_z = new vc();
        field_B = "(Including <%0>)";
        field_x = "Waiting for sound effects";
    }
}
