/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends l {
    static km field_m;
    static String field_i;
    int field_o;
    boolean field_p;
    int field_l;
    static km field_k;
    static nh[] field_n;
    static String field_h;
    static int field_q;
    int field_g;
    static na field_j;

    public static void a(int param0) {
        field_m = null;
        if (param0 != -25621) {
          field_n = (nh[]) null;
        }
        field_k = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 1) {
          return 48;
        }
        if (param1 >= 2) {
          return 2;
        }
        if (param0 >= 5) {
          return 1;
        }
        return 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int[] param4) {
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = -42 % ((param2 + 82) / 42);
          if (param1 < param3) {
            var6 = (param3 + param1) / 2;
            var7 = param1;
            var8 = param0[var6];
            param0[var6] = param0[param3];
            param0[param3] = var8;
            var9 = param4[var6];
            param4[var6] = param4[param3];
            param4[param3] = var9;
            stackIn_5_0 = (var8 != 2147483647) ? 1 : 0;
            var10 = stackIn_5_0;
            for (var11 = param1; var11 < param3; var11++) {
              if (param0[var11] > -(var10 & var11) + var8) {
                var12 = param0[var11];
                param0[var11] = param0[var7];
                param0[var7] = var12;
                var13 = param4[var11];
                param4[var11] = param4[var7];
                param4[var7++] = var13;
              }
            }
            param0[param3] = param0[var7];
            param0[var7] = var8;
            param4[param3] = param4[var7];
            param4[var7] = var9;
            ij.a(param0, param1, 40, var7 - 1, param4);
            ij.a(param0, 1 + var7, -127, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ij.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param1 != 4290) {
          return (byte) -125;
        }
        {
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            param0 > 255)) {
            if (8364 == param0) {
              var2 = -128;
            } else if (8218 == param0) {
              var2 = -126;
            } else if (402 == param0) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (param0 == 8230) {
              var2 = -123;
            } else if (8224 == param0) {
              var2 = -122;
            } else if (8225 == param0) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (param0 == 8240) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (param0 == 338) {
              var2 = -116;
            } else if (param0 == 381) {
              var2 = -114;
            } else if (param0 == 8216) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (8220 == param0) {
              var2 = -109;
            } else if (8221 == param0) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (8211 == param0) {
              var2 = -106;
            } else if (param0 == 8212) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (param0 == 339) {
              var2 = -100;
            } else if (382 == param0) {
              var2 = -98;
            } else if (376 != param0) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        return (byte) var2;
    }

    ij(int param0, boolean param1, int param2) {
        this.field_g = param0;
        this.field_l = param2;
        this.field_p = param1 ? true : false;
        this.field_o = 0;
    }

    final static void a(byte param0) {
        int var1 = id.field_r / 2;
        String var2 = jk.field_e;
        if (db.b((byte) 13, 0)) {
          var2 = ge.field_a;
        }
        String var3 = var2.substring(0, var1 <= var2.length() ? var1 : var2.length());
        mc.field_b.a(var3, 120, 100, 400, 200, 1141646, -1, 0, 0, 0);
        if (param0 != 105) {
          int[] var4 = (int[]) null;
          ij.a((int[]) null, 50, -10, -91, (int[]) null);
        }
    }

    final static void a(int param0, int param1) {
        int var4 = 0;
        int incrementValue$2 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 21 / ((-72 - param0) / 41);
          for (var4 = -(df.field_e * df.field_f); var4 < 0; var4++) {
            var5 = df.field_d[var2_int];
            var6 = var5 & 16711935;
            var5 = var5 & 65280;
            var6 = var6 * param1;
            var6 = var6 & -16711936;
            var5 = var5 * param1;
            var5 = var5 & 16711680;
            var5 = (var6 | var5) >> 8;
            incrementValue$2 = var2_int;
            var2_int++;
            df.field_d[incrementValue$2] = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "ij.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_i = "No spectators";
        field_h = "Please try changing the following settings:  ";
    }
}
