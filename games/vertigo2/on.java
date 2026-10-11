/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static ae[][] field_b;
    static int[] field_e;
    static String field_d;
    static fc field_a;
    static int field_c;

    final static boolean a(byte param0, int param1) {
        if (-1 == param1) {
          return true;
        }
        if (param0 <= -68) {
          return (to.field_c & 1 << param1) != 0 ? true : false;
        }
        on.a((byte) 50, 2);
        return (to.field_c & 1 << param1) != 0 ? true : false;
    }

    final static void a(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, mp param7, mp param8, int param9, byte param10, int param11, mp param12, int param13, int param14, cc param15, int param16, int param17, int param18, int param19) {
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
          if (param10 != 24) {
            on.a((byte) 31, -11);
          }
          hd.field_f = param0;
          oc.field_s = param15;
          t.a(param17, param3, param4, param18, (byte) 89);
          aq.a(param12, (byte) -122, param19, param9);
          ni.a((byte) 107, param6, param2, param1, param7, param8);
          af.a(param11, param16, (byte) 122);
          ug.a((byte) -113, param5, param14, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("on.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = (ae[][]) null;
        if (param0) {
          field_a = null;
          field_d = null;
          return;
        }
        cc var2 = (cc) null;
        on.a((cc) null, -20, -80, 55, -39, 122, -59, (mp) null, (mp) null, 108, (byte) -25, -117, (mp) null, 111, 97, (cc) null, 20, -31, 110, 20);
        field_a = null;
        field_d = null;
    }

    final static s a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = Vertigo2.field_L ? 1 : 0;
        s var5 = (s) (wg.field_i.a((byte) 100));
        while (var5 != null) {
          if (var5.field_p == param4) {
            return var5;
          }
          var5 = (s) (wg.field_i.b(99));
        }
        s var7 = new s();
        var5 = var7;
        var7.field_q = param2;
        if (param3 > 70) {
          var5.field_o = param0;
          var5.field_p = param4;
          wg.field_i.a(var5, false);
          mm.a(param1, var5, (byte) 108);
          return var5;
        }
        return (s) null;
    }

    final static void a(int param0) {
        if (pm.field_a) {
          bm.g(0);
          if (param0 != 9110) {
            field_e = (int[]) null;
            return;
          }
          return;
        }
        if (param0 == 9110) {
          return;
        }
        field_e = (int[]) null;
    }

    static {
        field_d = "Hide lobby chat";
        field_b = new ae[30][1];
        field_a = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_c = 0;
    }
}
