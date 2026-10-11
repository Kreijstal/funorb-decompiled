/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_h;
    static je field_d;
    boolean field_i;
    int field_k;
    private int[][] field_a;
    int field_b;
    int[] field_l;
    static bh field_j;
    int[] field_f;
    static boolean field_e;
    private int[] field_c;
    static char field_m;
    static boolean field_g;

    final static void a(boolean param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          ka.field_m = param1;
          sf.field_d = 2;
          var5 = (CharSequence) ((Object) param1);
          qj.field_a = cc.a(var5, (byte) 114);
          vj.field_o = param2;
          if (param0) {
            field_h = (String) null;
          }
          cl.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "tb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, bh param1) {
        int var3_int = 0;
        int var4 = 0;
        bh var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          if (!param0) {
            var5 = (bh) null;
            this.a(-64, (byte) 59, (bh) null);
          }
          while (true) {
            var3_int = param1.d((byte) -99);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, (byte) -5, param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("tb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    tb(ah param0, String param1, String param2) {
        this(param0, param0.a(-1, param1), param2);
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param0, (byte) -92);
        var2.a(1, false);
        if (param1 != -15289) {
          field_j = (bh) null;
        }
        var2.a(1, false);
    }

    private tb(ah param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, false, param2));
    }

    public static void a(byte param0) {
        field_d = null;
        field_j = null;
        field_h = null;
        if (param0 >= -112) {
          field_d = (je) null;
        }
    }

    private final void a(int param0, byte param1, bh param2) {
        int[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          if (param1 != -5) {
            return;
          }
          if (param0 == 1) {
            var4_int = param2.e(param1 + 132);
            this.field_l = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_l[var5] = param2.e(127);
            }
            this.field_f = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_f[var5] = param2.e(127);
            }
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_f[var5] = (param2.e(127) << 16) + this.field_f[var5];
            }
          } else {
            if (param0 == 2) {
              this.field_k = param2.e(127);
              return;
            }
            if (param0 == 3) {
              var4_int = param2.d((byte) -99);
              this.field_c = new int[var4_int + 1];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_c[var5] = param2.d((byte) -99);
              }
              this.field_c[var4_int] = 9999999;
              return;
            }
            if (param0 == 5) {
              param2.d((byte) -99);
              return;
            }
            if (param0 == 6) {
              param2.e(127);
              return;
            }
            if (param0 == 7) {
              param2.e(127);
              return;
            }
            if (8 == param0) {
              this.field_b = param2.d((byte) -99);
              this.field_i = false;
              return;
            }
            if (param0 == 9) {
              param2.d((byte) -99);
              return;
            }
            if (param0 == 10) {
              param2.d((byte) -99);
              return;
            }
            if (param0 == 11) {
              param2.d((byte) -99);
              return;
            }
            if (12 == param0) {
              var4_int = param2.d((byte) -99);
              for (var5 = 0; var5 < var4_int; var5++) {
                param2.e(127);
              }
              for (var5 = 0; var5 < var4_int; var5++) {
                param2.e(param1 ^ -124);
              }
            } else if (13 == param0) {
              var4_int = param2.e(127);
              this.field_a = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param2.d((byte) -99);
                if (var6 > 0) {
                  array$0 = new int[var6];
                  this.field_a[var5] = array$0;
                  this.field_a[var5][0] = param2.d(-1);
                  for (var7 = 1; var6 > var7; var7++) {
                    this.field_a[var5][var7] = param2.e(127);
                  }
                }
              }
            } else {
              if (param0 != 14) {
                if (param0 == 15) {
                  return;
                }
                if (16 != param0 &&
                  param0 != 18) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("tb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    final static void a(boolean param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0) {
          tb.a(false, (String) null, -3L);
        }
        if (param1 % 10L != 0L) {
          uj.a(param1, -568127903);
        } else {
          uj.a(-1L + param1, -568127903);
          uj.a(1L, -568127903);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        boolean stackIn_6_0 = false;
        var7 = -92 / ((-53 - param6) / 49);
        stackIn_6_0 = (param3 >= param1) && (param3 < param1 + param4) && (param0 >= param2) && (param0 < param5 + param2);
        return stackIn_6_0;
    }

    private tb(ah param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_k = -1;
        this.field_b = 0;
        try {
          this.field_i = true;
          var11 = param0.a(3, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.a(true, new bh(var11));
          }
          var5 = 0;
          for (var6 = 0; this.field_f.length > var6; var6++) {
            if (this.field_f[var6] > var5) {
              var5 = this.field_f[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; this.field_l.length > var7; var7++) {
            if (var6Lifetime1 < this.field_l[var7]) {
              var6Lifetime1 = this.field_l[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("tb.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_h = "Email is valid";
        field_d = new je();
        field_j = new bh(256);
        field_e = true;
    }
}
