/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements eh {
    static int field_f;
    static String field_d;
    static long field_a;
    private long field_b;
    static boolean field_e;
    static int[] field_g;
    static String field_c;

    final static void e(int param0) {
        if (!ge.field_D) {
          throw new IllegalStateException();
        }
        bc.field_d = true;
        if (param0 == 6) {
          wg.a(param0 - 107, true);
          rl.field_N = 0;
          return;
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        la var12 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 != -31) {
            var12 = (la) null;
            v.a(-84, (short[]) null, (la) null, 49);
          }
          var4_int = param3.length();
          var5 = param2.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param3.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$2 = var8.append(param3.substring(var9));
              stackIn_14_0 = var8.toString();
              return stackIn_14_0;
            }
            discarded$0 = var8.append(param3.substring(var9, var10));
            var9 = 1 + var10;
            discarded$1 = var8.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("v.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    abstract ud f(int param0);

    public final void a(int param0) {
        int var2 = 68 / ((-9 - param0) / 50);
        this.field_b = qg.a(false);
    }

    public final ud a(byte param0) {
        if (this.b(24685)) {
          return c.field_a;
        }
        if (!(qg.a(false) >= this.field_b + 350L)) {
          return lh.field_x;
        }
        int var2 = 35 / ((param0 - 55) / 49);
        return this.f(38);
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    public final String c(int param0) {
        if (this.b(24685)) {
          return null;
        }
        if (qg.a(false) < 350L + this.field_b) {
          return null;
        }
        if (param0 == 15914) {
          return this.b((byte) 22);
        }
        this.field_b = 72L;
        return this.b((byte) 22);
    }

    abstract String b(byte param0);

    final static short[] a(int param0, short[] param1, la param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param3 < 26) {
            stackIn_3_0 = (short[]) null;
            return stackIn_3_0;
          }
          var4_int = param2.d(0, param0);
          if (0 == var4_int) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new short[var4_int];
          }
          var5 = param2.d(0, 4);
          var6 = (short)param2.d(0, 16);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param2.d(0, var5));
            }
          }
          stackIn_19_0 = (short[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("v.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = "Just play";
        field_a = 0L;
        field_g = new int[]{6, 6, 9, 9, 18, 18};
        field_c = "Loading fonts";
    }
}
