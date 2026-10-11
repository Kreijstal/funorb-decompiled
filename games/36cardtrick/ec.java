/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends gk {
    private long field_n;
    private long field_g;
    static int field_f;
    static nc field_j;
    static long field_m;
    private int field_k;
    private long[] field_i;
    private int field_l;
    private long field_h;

    public static void d(int param0) {
        field_j = null;
        if (param0 != 10) {
          field_f = 74;
        }
    }

    final void b(int param0) {
        if (param0 >= -65) {
          this.field_n = 22L;
        }
        if (this.field_n < this.field_g) {
          this.field_n = this.field_n + (-this.field_n + this.field_g);
        }
        this.field_h = 0L;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Main.field_T;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_h;
        this.field_h = var2;
        if (!param0) {
        }
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.field_i[this.field_k] = var4;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
          this.field_k = (this.field_k + 1) % 10;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_l; var8++) {
          var6 = var6 + this.field_i[(10 + (this.field_k - var8)) % 10];
        }
        return var6 / (long)this.field_l;
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        var5 = Main.field_T;
        if (param1) {
          return 92;
        }
        if (this.field_n < this.field_g) {
          this.field_h = this.field_h + (this.field_g - this.field_n);
          this.field_n = this.field_n + (this.field_g - this.field_n);
          this.field_g = this.field_g + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_g = this.field_g + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_g < this.field_n);
        if (this.field_n > this.field_g) {
          this.field_g = this.field_n;
        }
        return var4;
    }

    final static ic a(String param0, qk param1, boolean param2, String param3, qk param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ic stackIn_2_0 = null;
        ic stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_2_0 = (ic) null;
            return stackIn_2_0;
          }
          var5_int = param4.a(18659, param0);
          var6 = param4.a(var5_int, param3, (byte) 7);
          stackIn_4_0 = kf.a(param4, 0, var6, var5_int, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ec.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (param0 > -9) {
          return (byte) 87;
        }
        {
          if ((0 >= param1 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (402 == param1) {
              var2 = -125;
            } else if (param1 == 8222) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (710 == param1) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (param1 == 338) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (8221 == param1) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (param1 == 8211) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (param1 == 382) {
              var2 = -98;
            } else if (param1 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        return (byte) var2;
    }

    final long a(int param0) {
        if (param0 != 0) {
          this.b(108);
        }
        this.field_n = this.field_n + this.a(true);
        if (this.field_g > this.field_n) {
          return (this.field_g - this.field_n) / 1000000L;
        }
        return 0L;
    }

    ec() {
        this.field_n = 0L;
        this.field_g = 0L;
        this.field_l = 1;
        this.field_k = 0;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_n = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_j = new nc();
    }
}
