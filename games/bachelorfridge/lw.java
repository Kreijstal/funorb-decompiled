/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lw {
    static ws field_g;
    int field_a;
    static String[] field_k;
    String field_j;
    static kv[] field_b;
    int field_e;
    private int field_d;
    String[] field_h;
    int[][] field_c;
    boolean field_i;
    static be[] field_f;

    void a(int param0) {
        int var2 = 87 / ((59 - param0) / 33);
        this.field_e = 0;
    }

    final void c(int param0) {
        ua.field_b = true;
        if (param0 <= 69) {
          lw.a(-78, 62, 3, 125, -30, -74, -51, 3, 42);
        }
    }

    final boolean c(byte param0) {
        if (param0 != 95) {
          return true;
        }
        if (this.field_i) {
          return this.field_d == this.field_e ? true : false;
        }
        return rfa.a(false, this.field_e) == this.field_d ? true : false;
    }

    abstract void a(int param0, byte param1);

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_b = null;
        field_k = null;
        if (!param0) {
          field_b = (kv[]) null;
        }
    }

    abstract void a(byte param0);

    final void b(byte param0) {
        if (param0 != 112) {
          this.field_a = 72;
        }
        ua.field_b = false;
    }

    final void b(int param0) {
        if (param0 != 1) {
          return;
        }
        if (this.field_i) {
          this.field_e = this.field_e + 1;
        } else {
          this.field_e = this.field_e | 1 << this.field_a;
        }
        aga.d(false);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        var12 = BachelorFridge.field_y;
        try {
          param4 = param4 - param1;
          if (param5 != 12175) {
            field_b = (kv[]) null;
          }
          param7 = param7 - param3;
          var9_int = param6;
          if (param7 == 0) {
            if (param4 >= 0) {
              for (var10 = param1; param4 + 1 > var10; var10++) {
                incrementValue$4 = var9_int;
                var9_int++;
                if (incrementValue$4 / param0 % 2 == 0) {
                  qea.a(var10, param3, param8, (byte) -107, param2);
                }
              }
            } else {
              for (var10 = param1 + param4; var10 < -param4 + 1; var10++) {
                incrementValue$5 = var9_int;
                var9_int++;
                if (incrementValue$5 / param0 % 2 == 0) {
                  qea.a(var10, param3, param8, (byte) -113, param2);
                }
              }
            }
            stackIn_17_0 = var9_int;
            return stackIn_17_0;
          }
          if (param4 == 0) {
            if (param7 < 0) {
              for (var10Lifetime1 = param7 + param3; 1 - param7 > var10Lifetime1; var10Lifetime1++) {
                incrementValue$2 = var9_int;
                var9_int++;
                if (incrementValue$2 / param0 % 2 == 0) {
                  qea.a(param1, var10Lifetime1, param8, (byte) -104, param2);
                }
              }
            } else {
              for (var10Lifetime1 = param3; param7 + 1 > var10Lifetime1; var10Lifetime1++) {
                incrementValue$3 = var9_int;
                var9_int++;
                if (0 == incrementValue$3 / param0 % 2) {
                  qea.a(param1, var10Lifetime1, param8, (byte) -97, param2);
                }
              }
            }
            stackIn_32_0 = var9_int;
            return stackIn_32_0;
          }
          if (0 > param4 + param7) {
            param1 = param1 + param4;
            param4 = -param4;
            param3 = param3 + param7;
            param7 = -param7;
          }
          if (param7 < param4) {
            param3 = param3 << 16;
            param7 = param7 << 16;
            param3 = param3 + 32768;
            var10Lifetime2 = (int)Math.floor(0.5 + (double)param7 / (double)param4);
            param4 = param4 + param1;
            while (param1 <= param4) {
              var11 = param3 >> 16;
              incrementValue$0 = var9_int;
              var9_int++;
              if (0 == incrementValue$0 / param0 % 2) {
                qea.a(param1, var11, param8, (byte) -102, param2);
              }
              param3 = param3 + var10Lifetime2;
              param1++;
            }
          } else {
            param1 = param1 << 16;
            param1 = param1 + 32768;
            param4 = param4 << 16;
            var10Lifetime2 = (int)Math.floor((double)param4 / (double)param7 + 0.5);
            param7 = param7 + param3;
            while (param3 <= param7) {
              var11 = param1 >> 16;
              param1 = param1 + var10Lifetime2;
              incrementValue$1 = var9_int;
              var9_int++;
              if (0 == incrementValue$1 / param0 % 2) {
                qea.a(var11, param3, param8, (byte) -128, param2);
              }
              param3++;
            }
          }
          stackIn_50_0 = var9_int;
          return stackIn_50_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var9), "lw.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    lw(boolean param0, String[] param1, String param2) {
        this.field_a = 1;
        try {
          this.field_h = param1;
          this.field_j = param2;
          this.field_d = this.field_h.length;
          this.field_i = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new be[10];
        field_g = new ws();
    }
}
