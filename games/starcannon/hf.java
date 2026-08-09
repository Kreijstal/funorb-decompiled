/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fi {
    private long field_p;
    private long[] field_k;
    private int field_o;
    static hl field_i;
    private long field_n;
    private long field_m;
    static int field_l;
    private int field_j;

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = StarCannon.field_A;
        var4 = 99 / ((param0 - -23) / 40);
        if ((this.field_m ^ -1L) < (this.field_p ^ -1L)) {
          this.field_n = this.field_n + (this.field_m + -this.field_p);
          this.field_p = this.field_p + (this.field_m - this.field_p);
          this.field_m = this.field_m + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              this.field_m = this.field_m + param1;
              var5++;
              if (-11 >= (var5 ^ -1)) {
                break L1;
              } else {
                if ((this.field_p ^ -1L) < (this.field_m ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_m < this.field_p) {
                this.field_m = this.field_p;
                break L2;
              } else {
                break L2;
              }
            }
            return var5;
          }
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ue.a(ik.a(param0, (byte) -113), 16778);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                field_i = (hl) null;
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("hf.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void b(byte param0) {
        int var2 = 47 % ((15 - param0) / 35);
        if (!(this.field_p >= this.field_m)) {
            this.field_p = this.field_p + (this.field_m - this.field_p);
        }
        this.field_n = 0L;
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = StarCannon.field_A;
        long var2 = System.nanoTime();
        long var4 = -this.field_n + var2;
        this.field_n = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(5000000000L <= var4)) {
                this.field_k[this.field_o] = var4;
                this.field_o = (this.field_o + 1) % 10;
                if (!(-2 >= (this.field_j ^ -1))) {
                    this.field_j = this.field_j + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_j; var8++) {
            var6 = var6 + this.field_k[(10 + -var8 + this.field_o) % 10];
        }
        if (param0 != 4216) {
            this.field_o = 87;
        }
        return var6 / (long)this.field_j;
    }

    final static void a(int param0, int param1, int param2, hl[] param3, int param4, int param5, hl[] param6, int param7, qe param8, int param9, int param10, boolean param11) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qc.a(param3, param4, param2, param6, param4, -109, param2, param7, param11, param5, param0, param8, param10, param1, param8);
              if (param9 == -11) {
                break L1;
              } else {
                hf.b(-126);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -22720) {
            qe var2 = (qe) null;
            hf.a(91, -55, 77, (hl[]) null, -30, 57, (hl[]) null, 31, (qe) null, 69, -32, false);
        }
        field_i = null;
    }

    final long a(byte param0) {
        if (param0 != -51) {
            return 99L;
        }
        this.field_p = this.field_p + this.c(4216);
        if ((this.field_p ^ -1L) > (this.field_m ^ -1L)) {
            return (this.field_m + -this.field_p) / 1000000L;
        }
        return 0L;
    }

    hf() {
        this.field_p = 0L;
        this.field_k = new long[10];
        this.field_n = 0L;
        this.field_o = 0;
        this.field_m = 0L;
        this.field_j = 1;
        this.field_p = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_l = 250;
    }
}
