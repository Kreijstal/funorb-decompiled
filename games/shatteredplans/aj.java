/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static ib field_b;
    static ap field_e;
    static int field_c;
    static volatile int field_f;
    static pf field_a;
    static int[] field_d;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param1);
          for (var5 = var4_int; param1 > var5; var5++) {
            param0.setCharAt(var5, param3);
          }
          var6 = 14 % ((param2 + 41) / 41);
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("aj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, fb param2, String param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fc var7 = null;
        String var8 = null;
        fc var9 = null;
        String var10 = null;
        fc var11 = null;
        String var12 = null;
        fc var13 = null;
        try {
          tp.a((int[]) null, 0L, (String) null, (String) null, 293, qs.field_y, param2, -1, param2.g(-77));
          if (param2.field_Ab && (param2.field_Fb == 2 ||
            !(bs.field_b < 2))) {
            var7 = hp.field_m;
            var8 = re.a(fk.field_o, 4371, new String[]{param3});
            var7.field_j.a(1, 10, var8);
          }
          hp.field_m.a(false);
          if (param0) {
            if (kf.field_g == hp.field_m.field_f) {
              var11 = hp.field_m;
              var12 = re.a(id.field_e, 4371, new String[]{param3});
              var11.field_j.a(1, 16, var12);
            } else {
              var9 = hp.field_m;
              var10 = re.a(cb.field_g, 4371, new String[]{param3});
              var9.field_j.a(1, 15, var10);
            }
          }
          var13 = hp.field_m;
          if (param1 > -22) {
            return;
          }
          var5 = nh.field_p;
          var6 = td.field_P;
          var13.field_j.b(0, 0, 0, var5, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("aj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int[] param3) {
        int var7 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param3[-2 + param3.length];
          var5 = param3[param3.length - param0];
          var6 = 0;
          for (var7 = 0; param3.length > var7; var7 += 2) {
            var8 = param3[var7];
            var9 = param3[var7 + 1];
            if (td.a(var5, -120, var4_int, var9, param1, var8, param2)) {
              var6++;
            }
            var5 = var9;
            var4_int = var8;
          }
          stackIn_9_0 = ((var6 & 1) == 1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("aj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
          System.out.println("Error: " + nf.a("%0a", param0, (byte) 82, "\n"));
          return;
        }
        field_f = -71;
        System.out.println("Error: " + nf.a("%0a", param0, (byte) 82, "\n"));
    }

    final static ms a(String param0, boolean param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ms stackIn_5_0 = null;
        ms stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = oq.a(5722, var7);
          } else {
            var6 = param0;
          }
          if (!param2) {
            stackIn_7_0 = dd.a(param1, param3, (String) (var6), 4684, var4_long);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ms) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("aj.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != 21805) {
          field_c = 3;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_f = -1;
    }
}
