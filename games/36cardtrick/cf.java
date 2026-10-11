/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements b {
    static int field_c;
    static byte field_d;
    static String field_a;
    private int[][] field_e;
    static byte[][] field_b;

    public final int[] a(int param0, byte param1, float param2) {
        int var4 = 68 / ((10 - param1) / 37);
        if (param0 < 0) {
          return null;
        }
        if (this.field_e.length <= param0) {
          return null;
        }
        if (null == this.field_e[param0]) {
          return null;
        }
        return this.field_e[param0];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = (byte[][]) null;
        if (param0 <= 3) {
          cf.a((byte) -30);
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2;
        boolean stackIn_8_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = 28 % ((-15 - param0) / 56);
        if ((param1 < 65 ||
          90 < param1) && (param1 < 97 ||
          param1 > 122)) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public final boolean d(int param0, int param1) {
        int var3 = -121 / ((61 - param0) / 34);
        return false;
    }

    final static void a(Main param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Main var3 = null;
        try {
          cj.field_l[5] = 373 - kb.field_b[5];
          fh.field_G[5] = new int[]{18, 19, 20, 17};
          param0.field_E[5] = new re(param0, 5);
          if (param1 < 34) {
            var3 = (Main) null;
            cf.a((Main) null, (byte) 68);
          }
          cj.field_l[4] = 428;
          fh.field_G[4] = new int[]{17};
          param0.field_E[4] = new re(param0, 4);
          if (d.field_c > 0 &&
            hl.a(jk.field_a, -1)) {
            fh.field_G[1] = new int[]{7, 3, 4, 8, 5, 10};
            param0.field_E[1] = new re(param0, 1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("cf.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 3) {
          return false;
        }
        return true;
    }

    public final int b(int param0, int param1) {
        if (param0 > -58) {
          return 91;
        }
        return 63;
    }

    public final int c(int param0, int param1) {
        if (param1 > -92) {
          cf.a((byte) 1, '￩');
          return 0;
        }
        return 0;
    }

    cf(kc[] param0) {
        int var2_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var5Lifetime1;
        try {
          this.field_e = new int[param0.length / 2][65536];
          for (var2_int = 0; var2_int < this.field_e.length; var2_int++) {
            var15 = param0[2 * var2_int].field_r;
            var16 = param0[1 + 2 * var2_int].field_r;
            for (var5 = 0; var5 < 64; var5++) {
              og.a(var15, var5 << 6, this.field_e[var2_int], var5 << 7, 64);
              og.a(var16, var5 << 6, this.field_e[var2_int], (var5 << 7) + 8192, 64);
            }
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < 16384) {
              this.field_e[var2_int][var8] = bc.a(this.field_e[var2_int][var8], 16316671);
              var6 = this.field_e[var2_int][var8];
              this.field_e[var2_int][16384 + var8] = bc.a(var6 - (var6 >>> 3), 16316671);
              this.field_e[var2_int][16384 + (var8 + 16384)] = bc.a(-(var6 >>> 2) + var6, 16316671);
              this.field_e[var2_int][32768 + (var8 + 16384)] = bc.a(16316671, -(var6 >>> 3) + (-(var6 >>> 2) + var6));
              var8++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cf.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_a = "Email (Login):";
        field_b = new byte[250][];
    }
}
