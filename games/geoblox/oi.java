/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String[] field_a;
    static String field_e;
    static String field_d;
    static dm field_b;
    static String field_c;

    final synchronized static byte[] a(boolean param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if ((param1 == 100) &&
            (hb.field_b > 0)) {
          fieldTemp$3 = hb.field_b - 1;
          hb.field_b = hb.field_b - 1;
          var2_ref_byte__ = dj.field_I[fieldTemp$3];
          dj.field_I[hb.field_b] = null;
          return var2_ref_byte__;
        }
        if ((param1 == 5000) &&
            (0 < ah.field_d)) {
          fieldTemp$4 = ah.field_d - 1;
          ah.field_d = ah.field_d - 1;
          var2_ref_byte__ = rd.field_s[fieldTemp$4];
          rd.field_s[ah.field_d] = null;
          return var2_ref_byte__;
        }
        if (param0) {
          return (byte[]) null;
        }
        if ((param1 == 30000) &&
            (ag.field_i > 0)) {
          fieldTemp$5 = ag.field_i - 1;
          ag.field_i = ag.field_i - 1;
          var2_ref_byte__ = sd.field_C[fieldTemp$5];
          sd.field_C[ag.field_i] = null;
          return var2_ref_byte__;
        }
        if (sg.field_c != null) {
          var2 = 0;
          while (!(var2 >= nk.field_c.length)) {
            if (nk.field_c[var2] != param1) {
              var2++;
              continue;
            }
            if (0 >= oa.field_b[var2]) {
              var2++;
              continue;
            }
            dupTemp$6 = oa.field_b[var2] - 1;
            arrayValue$7 = sg.field_c[var2];
            oa.field_b[var2] = dupTemp$6;
            var3 = arrayValue$7[dupTemp$6];
            sg.field_c[var2][oa.field_b[var2]] = null;
            return var3;
          }
        }
        return new byte[param1];
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        se var4 = null;
        ea var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          var4 = (se) ((Object) sj.field_g.g(0));
          while (var4 != null) {
            tj.a(param0, 86, var4);
            var4 = (se) ((Object) sj.field_g.d(1));
          }
          if (param1 < 115) {
            field_b = (dm) null;
          }
          var5 = (ea) ((Object) ea.field_g.g(0));
          while (var5 != null) {
            gj.a((byte) -88, param0, var5);
            var5 = (ea) ((Object) ea.field_g.d(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "oi.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static dm[] a(byte param0, String param1, String param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        dm[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -59 % ((41 - param0) / 39);
          var4_int = param3.a((byte) 127, param2);
          var6 = param3.a(param1, -101, var4_int);
          stackIn_1_0 = rd.a(var4_int, -122, var6, param3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var4);
          stackIn_4_1 = new StringBuilder().append("oi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -119 / ((param0 - 49) / 55);
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = new String[255];
        field_d = "The objective of Geoblox is to stack geoblox on your avatar in patterns of three in a row, by shape, colour, or both shape AND colour. Matching both shape and colour simultaneously will earn you even more points!<br>Try connecting three of a kind by colour now. Press <img=2> once you are ready to continue.";
        field_c = "Type your password again to make sure it's correct";
    }
}
