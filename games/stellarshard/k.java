/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_e;
    static String field_c;
    static String field_a;
    static long field_d;
    static fh field_b;

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          int[] var5 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                fh.field_m = 1 + (int)(var3.longValue() / 1048576L);
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
            if (param0 != 3) {
              var5 = (int[]) null;
              k.a((byte[]) null, 110, (int[]) null, false, 122);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte[] param0, int param1, int[] param2, boolean param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        try {
          if (param3) {
            field_a = (String) null;
          }
          var5_int = 0;
          while (true) {
            if (gg.field_h.length <= var5_int) {
              return;
            }
            param1 = gg.field_h[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = ki.field_z[incrementValue$1];
              dupTemp$2 = param0[param4];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              ki.field_z[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("k.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = -117 / ((-81 - param0) / 41);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(pf param0, int param1) {
        pb var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new pb(param0.a("final_frame.jpg", "", (byte) -12), (java.awt.Component) ((Object) qd.field_j));
          var3 = var2.field_v;
          var4 = var2.field_y;
          kg.d(false);
          wh.field_a = new pb(var3, param1 * var4 / 4);
          wh.field_a.e();
          var2.d(0, 0);
          fb.field_h = new pb(var3, var4 - wh.field_a.field_y);
          fb.field_h.e();
          var2.d(0, -wh.field_a.field_y);
          fb.field_h.field_s = wh.field_a.field_y;
          id.b((byte) -58);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "k.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Password is valid";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Login: ";
    }
}
