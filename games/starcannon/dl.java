/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static o field_b;
    private int[] field_e;
    static hl[] field_c;
    static int field_a;
    static boolean field_d;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = -1 + (this.field_e.length >> 1);
        var5 = -84 / ((-77 - param0) / 40);
        var4 = var3 & param1;
        while (true) {
          var6 = this.field_e[1 + (var4 + var4)];
          if (var6 == -1) {
            return -1;
          }
          if (param1 == this.field_e[var4 + var4]) {
            return var6;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          return (String) null;
        }
        if (param2) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        return hd.field_g[var4];
    }

    final static lh a(ja param0, byte param1, String param2, String param3, ue param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        lh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param3, false);
          var7 = -19 % ((param1 - 3) / 59);
          var6 = param4.a(param2, true, var5_int);
          stackIn_1_0 = qd.a(var5_int, var6, param0, (byte) 108, param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("dl.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String b(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        if (!param1) {
          return (String) null;
        }
        return lb.field_d[var4];
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
          dl.a(false);
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -12) {
            return;
          }
          if (sb.field_g != null) {
            sb.field_g.field_H.a(param0 ^ -1897, param1);
          }
          if (n.field_l != null) {
            n.field_l.field_z.a(1891, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("dl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    dl(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= (param0.length >> 1) + param0.length) {
            var2_int = var2_int << 1;
          }
          this.field_e = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_e[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (-1 != this.field_e[var4 + var4 + 1]) {
              var4 = 1 + var4 & var2_int - 1;
            }
            this.field_e[var4 + var4] = param0[var3Lifetime1];
            this.field_e[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dl.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = new o(7, 0, 1, 1);
    }
}
