/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static ll[] field_b;
    static String field_d;
    static int field_c;
    static String[] field_f;
    static String field_a;
    static String field_g;
    static String field_e;

    final static void a(byte param0, oo param1) {
        try {
          if (param0 != 91) {
            oo var3 = (oo) null;
            ff.a((byte) -45, (oo) null);
          }
          param1.field_D = new int[]{-1};
          param1.field_z = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ff.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 == 46) {
          field_a = null;
          field_b = null;
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_c = -44;
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
    }

    final static ij a(int[] param0, int param1, kc param2, kc param3, kc param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        ij[] var8 = null;
        int var9 = 0;
        tk var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        ij stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param0.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new ij[var5_int];
          var9 = (char)param1;
          try {
            for (var10_int = 0; var5_int > var10_int; var10_int++) {
              var11 = th.field_d.a(param0[var10_int], (byte) -87);
              var6[var10_int] = var11.c(true);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = null;
            return (ij) (stackIn_7_0);
          }
          stackIn_9_0 = new ij(0L, param4, param3, param2, var8, param0, var6, var14);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ff.E(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static qb[] a(byte param0, int param1, int param2, int param3) {
        if (param0 > 25) {
          return qa.a(param3, param1, 1, param2, (byte) 123);
        }
        oo var5 = (oo) null;
        ff.a((byte) -74, (oo) null);
        return qa.a(param3, param1, 1, param2, (byte) 123);
    }

    final static void a(boolean param0, String param1, byte param2, String param3) {
        try {
          ge.field_g = param3;
          vh.field_o = param1;
          jn.a(bj.field_qb, param0, -1);
          if (param2 != -97) {
            field_c = 14;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ff.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_d = "GAME DRAWN<br>(out of time)<br><br>";
        field_g = "This game option is only available to members.";
        field_e = "Names cannot contain consecutive spaces";
    }
}
