/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static hj field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 > -11) {
            var6 = (byte[]) null;
            i.a(true, (byte[]) null);
          }
          tg.field_c = kf.field_d;
          if (param3 == 255) {
            stackIn_7_0 = !(13 <= ae.field_a);
            uc.field_q = fk.a(stackIn_7_0, (byte) -68);
            var7 = (String[]) null;
            gi.a((String[]) null, (byte) -73);
            return;
          }
          if (100 > param3) {
            uc.field_q = oe.a(param3, param1, -3);
            return;
          }
          if (param3 > 105) {
            uc.field_q = oe.a(param3, param1, -3);
            return;
          }
          var8 = param2;
          gi.a(var8, (byte) -66);
          uc.field_q = hi.a(2, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("i.C(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 100) {
          i.a(8);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static wa a(boolean param0, byte[] param1) {
        wa var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        wa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new wa(param1, jd.field_g, wc.field_a, wh.field_b, m.field_a, vc.field_g, fl.field_a);
          md.$cfr$intArgs$a$6121ff5511c4(-118);
          if (param0) {
            var3 = (byte[]) null;
            i.a(true, (byte[]) null);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("i.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
