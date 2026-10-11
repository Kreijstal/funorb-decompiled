/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static String field_c;
    static boolean[] field_d;
    static mm field_f;
    static boolean field_a;
    static ud field_e;
    static String field_b;

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 112) {
          field_b = (String) null;
        }
    }

    final static void a(int param0, ck[] param1, mm param2, boolean param3, mm param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, ck[] param12, int param13, int param14, int param15, ck[] param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          n.a(param18, new cc(param12), param4, param6, param20, new cc(param1), param13, param2, param14, param19, new cc(param16), param7, -6, param17, param15, param0, param10, param8, param5, param11, param9);
          if (!param3) {
            field_e = (ud) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("bj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final static ck[] a(int param0, ji param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck[] stackIn_2_0 = null;
        ck[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 112) {
            stackIn_2_0 = (ck[]) null;
            return stackIn_2_0;
          }
          var4_int = param1.b(param0 - 113, param2);
          var5 = param1.a(var4_int, 13030, param3);
          stackIn_4_0 = we.a(param1, -126, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static tj a(long param0, byte param1) {
        if (param1 < 47) {
          return (tj) null;
        }
        return (tj) (hn.field_h.a(24710, param0));
    }

    static {
        field_c = "The Twist";
        field_d = new boolean[112];
        field_b = "<%0> cannot join; the game is full.";
    }
}
