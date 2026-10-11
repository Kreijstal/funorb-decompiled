/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends kk {
    static ld field_n;
    private String field_i;
    static String field_h;
    static ti field_m;
    private String field_l;
    static long field_j;
    static String[] field_k;

    public static void a(byte param0) {
        field_h = null;
        if (param0 < -75) {
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        }
        field_m = (ti) null;
        field_k = null;
        field_m = null;
        field_n = null;
    }

    final void a(byte param0, oa param1) {
        try {
          if (param0 >= -50) {
            ac.a((byte) -2);
          }
          param1.a(this.field_l, 124);
          param1.a((byte) 118, this.field_i);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ac.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static si a(int param0, int param1, ci param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        si stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param2.b((byte) -121, param0);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          if (param1 != 270) {
            field_j = -92L;
          }
          stackIn_6_0 = new si(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ac.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final nk a(int param0) {
        if (param0 != -184) {
          ci var3 = (ci) null;
          ac.a(31, -57, (ci) null);
          return wh.field_I;
        }
        return wh.field_I;
    }

    final static String a(int param0, j param1) {
        RuntimeException var2 = null;
        j var3 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 13) {
            var3 = (j) null;
            ac.a(-41, (j) null);
          }
          if (param1 == od.field_g) {
            stackIn_4_0 = "submission_rack";
            return stackIn_4_0;
          }
          if (wk.field_a == param1) {
            stackIn_12_0 = "carryover_rack";
            return stackIn_12_0;
          }
          if (param1 == si.field_i) {
            stackIn_10_0 = "new_rack";
            return stackIn_10_0;
          }
          stackIn_8_0 = "Error:" + param1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ac.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static ti a(int param0, int param1, ci param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            field_j = -83L;
          }
          if (rl.a(param1, 0, param0, param2)) {
            return lk.a(true);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ac.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    ac(String param0, String param1) {
        try {
          this.field_i = param1;
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ac.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Cancel";
        field_m = new ti(270, 70);
        field_k = new String[]{"All scores", "My scores", "Best each"};
    }
}
