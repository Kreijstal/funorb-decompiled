/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ie[] field_d;
    private static String field_e;
    static String field_a;
    static int field_b;
    static int field_c;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 4) {
            stackIn_4_0 = me.field_e.a(4, "", param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vd.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static hf a(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        jd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        jd var8 = null;
        ba var9 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        var8 = te.field_N;
        var2 = var8;
        var3 = var8.j(255);
        stackIn_3_0 = ((var3 & 128) != 0);
        ml.field_e = stackIn_3_0;
        qk.field_m = 127 & var3;
        th.field_I = var8.j(255);
        q.field_b = var8.a(10526);
        if (qk.field_m != 2) {
          ah.field_c = 0;
          hc.field_b = 0;
        } else {
          hc.field_b = var8.i(-127);
          ah.field_c = var8.b(false);
        }
        stackIn_9_0 = (var8.j(255) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        field_e = var8.h(40);
        if (var4 != 0) {
          field_a = var8.h(112);
        } else {
          field_a = field_e;
        }
        if (1 == qk.field_m) {
          var8.i(-117);
          var8.h(27);
        } else {
          if (4 == qk.field_m) {
            var8.i(-117);
            var8.h(27);
          }
        }
        if (!param1) {
          ek.field_a = a.a(var8, 80, false);
          qe.field_G = null;
        } else {
          var5 = var8.i(12);
          try {
            var9 = bf.field_f.a((byte) -109, var5);
            ek.field_a = var9.a((byte) 100);
            if (!field_a.equals(ne.field_g)) {
              stackIn_22_0 = var9.field_n;
            } else {
              stackIn_22_0 = null;
            }
            qe.field_G = stackIn_22_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            hi.a((Throwable) ((Object) var6), "CC1", 1);
            qe.field_G = null;
            ek.field_a = null;
          }
        }
        var5 = -3 / ((-23 - param0) / 57);
        return new hf(param1);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          if (param3 != 160) {
            vd.a((byte) 114);
          }
          var10 = new char[param2];
          var4 = var10;
          var5 = 0;
          for (var6 = 0; var6 < param2; var6++) {
            var7 = param0[var6 + param1] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = vk.field_e[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var10, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("vd.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 9) {
          field_e = (String) null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_d = new ie[10];
    }
}
