/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends ae {
    static java.math.BigInteger field_z;
    byte field_B;
    vi field_C;
    static jb[] field_A;
    int field_x;
    static bd field_y;

    final byte[] c(byte param0) {
        if (this.field_v ||
          this.field_C.field_i < -this.field_B + this.field_C.field_n.length) {
          throw new RuntimeException();
        }
        if (param0 != 127) {
          lm.e(46);
        }
        return this.field_C.field_n;
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          try {
            if (param0 != 26) {
              lm.e(77);
            }
            if (!fd.field_c.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param1.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("lm.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          p var2 = (p) null;
          lm.a((p) null, (p) null, 66);
        }
        field_y = null;
        field_z = null;
        field_A = null;
    }

    final static int e(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          lm.a(-49, (String) null);
        }
        return -hg.field_f + pc.field_d;
    }

    final int d(int param0) {
        if (null == this.field_C) {
          return 0;
        }
        if (param0 > -72) {
          this.field_x = -24;
        }
        return 100 * this.field_C.field_i / (-this.field_B + this.field_C.field_n.length);
    }

    lm() {
    }

    final static boolean a(p param0, p param1, int param2) {
        int var10 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          oa.field_d.field_i = 13;
          oa.field_d.field_j.a((byte) 46, param1.field_j);
          oa.field_d.field_l.a(param1.field_l.field_a - 0.5, param1.field_l.field_f - 0.5, 1);
          if (0.0 > oa.field_d.field_l.field_a) {
            oa.field_d.field_l.field_a = oa.field_d.field_l.field_a + 1.0;
            oa.field_d.field_j.field_g = oa.field_d.field_j.field_g - 1;
          }
          if (0.0 > oa.field_d.field_l.field_f) {
            oa.field_d.field_l.field_f = oa.field_d.field_l.field_f + 1.0;
            oa.field_d.field_j.field_e = oa.field_d.field_j.field_e - 1;
          }
          oa.field_d.field_c = nh.a(-12149, param1, param0);
          var3_double = param0.field_l.field_f + (double)param0.field_j.field_e;
          var5 = param0.field_l.field_a + (double)param0.field_j.field_g;
          oa.field_d.field_l.a(20, (byte) 94, oa.field_d.field_c);
          var7 = 0;
          var8 = param0.field_j.b(-4);
          var9 = ln.field_a.field_c[var8];
          ln.field_a.field_c[var8] = 0;
          if (param2 > -40) {
            field_z = (java.math.BigInteger) null;
          }
          for (var10 = 0; var10 < 100; var10++) {
            oa.field_d.a(8573);
            var7 = ln.field_a.field_c[oa.field_d.field_j.b(-4)];
            if (var7 != 2 &&
              !oa.field_d.a(var3_double, var5, 29821)) {
              oa.field_d.field_l.a(2, (byte) 94, oa.field_d.field_c);
              continue;
            }
            break;
          }
          ln.field_a.field_c[var8] = var9;
          return (var7 != 2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("lm.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_z = new java.math.BigInteger("65537");
        field_A = new jb[26];
    }
}
