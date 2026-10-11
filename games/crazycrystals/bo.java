/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bo extends pn {
    static int field_o;
    static int field_n;
    static String field_m;

    protected Object clone() {
        pn var1 = (pn) (super.clone());
        var1.field_l = (f) (this.field_l.clone());
        return var1;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 < 92) {
            this.clone();
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bo.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          java.awt.Frame var5 = (java.awt.Frame) null;
          bo.a((un) null, (java.awt.Frame) null, -60);
          return (f) (this);
        }
        return (f) (this);
    }

    bo(f param0) {
        super(param0);
    }

    final static void a(un param0, java.awt.Frame param1, int param2) {
        gb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = CrazyCrystals.field_B;
        try {
          while (true) {
            var3 = param0.a(param1, (byte) -116);
            while (0 == var3.field_a) {
              fh.a(true, 10L);
            }
            if (var3.field_a != 1) {
              fh.a(true, 100L);
              continue;
            }
            break;
          }
          if (param2 != 1) {
            field_o = 104;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bo.P(");
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
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          bo.f(-4);
          field_m = null;
          return;
        }
        field_m = null;
    }

    static {
        field_n = 0;
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
