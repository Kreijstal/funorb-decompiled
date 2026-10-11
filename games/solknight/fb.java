/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, String param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 12239) {
            field_b = (int[]) null;
          }
          gb.field_i = da.field_d;
          if (param2 != 255) {
            if (param2 < 100) {
              a.field_h = mh.a(param2, true, param3);
              return;
            }
            if (param2 > 105) {
              a.field_h = mh.a(param2, true, param3);
              return;
            }
            var4 = param1;
            kf.a(1, var4);
            a.field_h = wk.a((byte) 17, param1);
            return;
          }
          stackIn_12_0 = false;
          stackIn_13_1 = !(13 <= uh.field_d);
          a.field_h = di.a(stackIn_12_0, stackIn_13_1);
          var6 = (String[]) null;
          kf.a(1, (String[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("fb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          fb.a(-18, (String[]) null, -68, (String) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 == 255) {
          if (null != u.field_b) {
            u.field_b.d(true);
          }
          if (null != pc.field_b) {
            pc.field_b.f((byte) -85);
          }
          df.h(-1);
          return;
        }
        fb.a(true);
        if (null != u.field_b) {
          u.field_b.d(true);
        }
        if (null != pc.field_b) {
          pc.field_b.f((byte) -85);
        }
        df.h(-1);
    }

    static {
        field_c = 0;
        field_b = new int[1024];
        field_a = true;
    }
}
