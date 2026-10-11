/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hm {
    static mi field_c;
    static ud field_d;
    static jc field_a;
    static w field_b;
    static int[][] field_e;

    abstract int a(int param0);

    final static void a(nf param0, mm param1, int param2, String param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param4;
          for (var7 = 1; param3.length() > var7; var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = param0.field_a[0] + ((var5_int >> 8) + param1.a(param3.substring(0, var7)));
            }
            if (-1 != var6) {
              param0.field_a[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param2;
              }
              param0.field_a[var7] = (var5_int >> 8) + param0.field_a[0] - (-param1.a(param3.substring(0, var7 + 1)) + param1.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("hm.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -36 / ((param0 + 11) / 52);
        field_a = null;
        field_e = (int[][]) null;
    }

    abstract void a(int param0, java.awt.Component param1);

    final static void a(int param0, byte param1) {
        if (param1 >= -101) {
          return;
        }
        ai.field_P = param0;
    }

    final static fm a(boolean param0, String param1, String param2, int param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        fm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 9507) {
            field_d = (ud) null;
          }
          var4_long = 0L;
          var6 = null;
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            var7 = (CharSequence) ((Object) param2);
            var4_long = ab.a(121, var7);
          }
          stackIn_6_0 = sb.a(var4_long, param1, param0, (String) (var6), 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("hm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    final static void a(int param0, boolean param1) {
        if (null != sl.field_g) {
          qd.a(sl.field_g, -2);
        }
        if (w.field_H != null) {
          w.field_H.a((byte) 39, param1);
        }
        r.a(param1, 4028);
        if (param0 != -1) {
          field_d = (ud) null;
          if (null != pd.field_f) {
            pd.field_f.a(1141039778, param1);
            lg.a(param1, -123);
            return;
          }
          lg.a(param1, -123);
          return;
        }
        if (null == pd.field_f) {
          lg.a(param1, -123);
          return;
        }
        pd.field_f.a(1141039778, param1);
        lg.a(param1, -123);
    }

    static {
        field_a = new jc();
        field_e = (int[][]) null;
    }
}
