/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends lh {
    static sf field_p;
    static int field_q;
    static String field_k;
    int field_l;
    int field_j;
    int field_m;
    int field_n;
    int field_i;
    int field_o;

    final static boolean a(byte param0) {
        if (param0 != -72) {
          field_p = (sf) null;
          return d.field_L;
        }
        return d.field_L;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          if (param0 != -38) {
            hi.c((byte) -59);
          }
          cb.a(-105, "", param1);
          df.a(param1, 10245);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "hi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ce param0, java.awt.Frame param1, byte param2) {
        od var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(param1, (byte) -34);
            while (var3.field_b == 0) {
              vh.a(10L, 120);
            }
            if (var3.field_b != 1) {
              vh.a(100L, 101);
              continue;
            }
            break;
          }
          if (param2 != 52) {
            field_q = -47;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("hi.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_p = null;
        if (param0 >= -63) {
          field_p = (sf) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    hi(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param3;
        this.field_m = param1;
        this.field_n = param5;
        this.field_o = param2;
        this.field_l = param4;
        this.field_j = param0;
    }

    static {
        field_k = "Names should contain a maximum of 12 characters";
        field_q = 0;
    }
}
