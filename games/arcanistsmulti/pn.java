/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static qb[][] field_b;
    static int field_d;
    static int[] field_a;
    static qb field_c;
    static qb field_e;

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        int var1 = -20 / ((34 - param0) / 57);
        field_a = null;
        field_b = (qb[][]) null;
    }

    final static void a(int param0) {
        if (param0 > -21) {
          field_d = -35;
        }
        io.field_n = oo.d(-9685);
        pm.field_e = new h();
        ke.g((byte) 94);
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          var4 = 0;
          if (param0 != 8671) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          while (var4 < var2_int) {
            var3[var2_int - 1 - var4] = param1.charAt(var4);
            var4++;
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != -11090) {
          return;
        }
        String var2 = (String) null;
        bb.a(on.field_d, -3, (String) null);
    }

    final static boolean a(byte param0) {
        int var1;
        boolean stackIn_7_0 = false;
        var1 = 75 / ((param0 - 48) / 54);
        stackIn_7_0 = (eo.field_c != null) || (rc.c(-1321)) || (null != db.field_a) || (we.a((byte) -80));
        return stackIn_7_0;
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2 >= -35) {
            return;
          }
          in.field_Gb = pa.field_g;
          if (255 != param1) {
            if (param1 >= 100 &&
              param1 <= 105) {
              i.field_i = ho.a((byte) 102, args);
              return;
            }
            i.field_i = ab.a(0, param1, param3);
          } else {
            stackIn_6_0 = 32517;
            stackIn_7_1 = !(qm.field_u >= 13);
            i.field_i = oj.a(stackIn_6_0, stackIn_7_1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("pn.G(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (-1 == fj.field_h) {
          if (!pe.a((byte) -86, 1)) {
            return false;
          }
          fj.field_h = df.field_z.e((byte) -108);
          df.field_z.field_g = 0;
        }
        if (fj.field_h == -2) {
          if (!pe.a((byte) -86, 2)) {
            return false;
          }
          fj.field_h = df.field_z.n(-98);
          df.field_z.field_g = 0;
        }
        if (param0 != -12564) {
          return false;
        }
        return pe.a((byte) -86, fj.field_h);
    }

    final static ri a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ri var5 = null;
        ri stackIn_4_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = uh.field_i;
              return stackIn_7_0;
            }
            if (param0 != 78) {
              field_e = (qb) null;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = pm.a((byte) -58, var3);
            if (var5 == null) {
              return tf.a(32752, var4);
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = fc.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
