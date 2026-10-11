/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_a;
    static int field_f;
    static int field_d;
    static int field_e;
    static String[] field_b;
    static w[] field_c;

    final static void a(mm param0, int param1, int param2, cc param3, cc param4, cc param5, int param6, int param7, mm param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          wf.field_q = param0;
          if (param13) {
            dh.a((mm) null, 99, -109, (cc) null, (cc) null, (cc) null, 54, -67, (mm) null, 70, -37, -96, -83, true, 8, 108, -4, 38, -94, -69);
          }
          aj.field_d = param8;
          fl.b(param14, param17, param19, 0, param10);
          vm.a(param4, param11, param1, -11);
          mk.a(param9, param15, (byte) -118, param5, param2, param3);
          tb.a(param7, -25073, param18);
          qm.a(param16, -115, param6, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("dh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -68) {
          dh.a((mm) null, -53, 78, (cc) null, (cc) null, (cc) null, -74, -100, (mm) null, 108, -57, 96, -30, true, 2, 34, -16, -53, -123, 32);
        }
    }

    final static jb a(Throwable param0, String param1) {
        jb var2 = null;
        if (param0 instanceof jb) {
          var2 = (jb) ((Object) param0);
          var2.field_i = var2.field_i + ' ' + param1;
        } else {
          var2 = new jb(param0, param1);
        }
        return var2;
    }

    static {
        field_e = -1;
    }
}
