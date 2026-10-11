/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends di {
    final ud a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        ud stackIn_3_0 = null;
        ud stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!ej.a(false, var5)) {
            stackIn_3_0 = ef.field_b;
            return stackIn_3_0;
          }
          if (param0 >= -106) {
            var4 = (String) null;
            this.a(-109, (String) null);
          }
          var6 = (CharSequence) ((Object) param1);
          var3_int = uk.a(var6, 10);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return TrackController.field_G;
          }
          stackIn_10_0 = ef.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    nc(lb param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(-117, param0) == ef.field_b) {
            stackIn_2_0 = ol.field_m;
            return stackIn_2_0;
          }
          if (param1 == 426) {
            return null;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -131) {
          nc.a(false, 96);
          ki.a(true, 0, param0);
          return;
        }
        ki.a(true, 0, param0);
    }

    static {
    }
}
