/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends sl {
    private boolean field_q;
    private int field_G;
    static int field_z;
    static int field_v;
    private int field_D;
    private int field_u;
    static la field_C;
    private int field_s;
    private int field_F;
    static rl field_y;
    private short[][] field_B;
    static String field_r;
    static String field_w;
    static String[] field_t;
    private ja field_x;
    private boolean field_E;
    private int field_A;
    private u field_p;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        gd.field_x = param0 ? true : false;
        super.a(false, 1000, param0);
        this.field_p = nl.a(this.field_s, this.field_E, -257, this.field_a + 26 * this.field_D, this.field_G, this.field_F, this.field_u * 26 + this.field_f, this.field_d[this.field_u][this.field_D]);
        if (this.field_h >= this.field_A) {
          if (this.field_p != null) {
            this.field_x.a(this.field_p, (byte) -78);
          }
          var2 = he.field_e.nextInt() & 16777215;
          this.field_A = this.field_h + 8 + sc.a(var2, -1);
        }
        u var4 = (u) (this.field_x.b(2));
        while (var4 != null) {
          var4.d(18132);
          var4 = (u) (this.field_x.a(10));
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int[] param5, int param6, int[] param7, int param8, int param9, int param10, int param11) {
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          var12_int = param11 * param1;
          var13 = param9;
          if (param4 != -64) {
            var17 = (int[]) null;
            ra.a(-30, -95, 92, -104, (byte) 105, (int[]) null, 27, (int[]) null, -25, 18, -33, 60);
          }
          for (var14 = -param2; var14 < 0; var14++) {
            for (var15 = -param6; var15 < 0; var15++) {
              param5[param0++] = param7[param10++];
              param9++;
              if (param1 == param9) {
                param10 = param10 - param1;
                param9 = 0;
              }
            }
            param0 = param0 + param8;
            param10 = param10 + (-param9 + var13 + param1);
            param9 = var13;
            param3++;
            if (param3 == param11) {
              param3 = 0;
              param10 = param10 - var12_int;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_19_0 = var12;
          stackIn_19_1 = new StringBuilder().append("ra.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    final static hg a(int param0, byte[] param1) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (hg) (stackIn_2_0);
          }
          var2 = new hg(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qk.field_M);
          if (param0 != -502) {
            field_v = 93;
          }
          ff.b(126);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ra.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_t = null;
        if (param0 >= -64) {
          field_r = (String) null;
        }
        field_y = null;
        field_r = null;
        field_C = null;
    }

    ra(byte[][] param0, int[][] param1, int[][] param2, int param3, int param4, boolean param5) {
        super(param5, param3, param4);
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        this.field_q = true;
        this.field_E = true;
        this.field_x = new ja();
        try {
          this.a(param1, (byte) 50, param2, param0);
          this.field_B = new short[param0.length][param0[0].length];
          var7_int = 0;
          L0: while (true) {
            if (var7_int >= param1.length) {
              return;
            }
            var8 = 0;
            while (true) {
              if (var8 >= param1[var7_int].length) {
                var7_int++;
                continue L0;
              }
              if ((64 & param1[var7_int][var8]) == 0) {
                var8++;
                continue;
              }
              break;
            }
            break;
          }
          this.field_D = var8;
          this.field_u = var7_int;
          this.field_d[var7_int][var8] = ma.a(64, param1[var7_int][var8]);
          this.field_F = ud.a((byte) -56, this.field_d[var7_int][var8]);
          this.field_s = e.a(this.field_d[var7_int][var8], -1932340400, this.field_F);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("ra.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = TrackController.field_F ? 1 : 0;
        if (param3 > -39) {
          this.a(false);
        }
        int var8 = e.field_a[this.field_d[this.field_u][this.field_D]] & (param6 | param4 | param1);
        var8 = this.b(var8, this.field_D, 16384, this.field_u);
        if (param4 == var8) {
          this.field_s = param2;
        } else {
          if (param6 == var8) {
            this.field_s = param5;
          } else {
            if (param1 == var8) {
              this.field_s = param0;
            } else {
              this.field_q = false;
            }
          }
        }
    }

    ra(ea param0, int param1, int param2) {
        this(param0.field_o, param0.field_d, param0.field_i, param1, param2, true);
    }

    final void c(byte param0) {
        int var3 = 0;
        short[] var4 = null;
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        short[][] var2 = this.field_B;
        if (param0 <= 42) {
          return;
        }
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          for (var5 = 0; var4.length > var5; var5++) {
            var4[var5] = (short)he.field_e.nextInt();
          }
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_17_1 = false;
        boolean stackIn_48_1 = false;
        int var3;
        int var4;
        u var5;
        var4 = TrackController.field_F ? 1 : 0;
        super.a(param0, 101);
        if (param1 < 72) {
          return;
        }
        var5 = (u) (this.field_x.b(2));
        while (var5 != null) {
          if (!var5.e(0)) {
            var5.a(-26);
          }
          var5 = (u) (this.field_x.a(10));
        }
        if (!this.field_q) {
          return;
        }
        fieldTemp$0 = this.field_G + 1;
        this.field_G = this.field_G + 1;
        if (13 == fieldTemp$0) {
          this.field_G = -13;
          if (this.field_d[this.field_u][this.field_D] == 24 &&
            256 == this.field_F) {
            this.field_F = 512;
            stackIn_17_1 = !(this.field_E);
            this.field_E = stackIn_17_1;
            this.field_s = 4096;
            return;
          }
          if (this.field_d[this.field_u][this.field_D] == 25 &&
            this.field_F == 128) {
            this.field_s = 2048;
            this.field_F = 1024;
            stackIn_48_1 = !(this.field_E);
            this.field_E = stackIn_48_1;
            return;
          }
          if ((this.field_s != 4096 ||
            this.field_D != 0) &&
            (this.field_s != 8192 ||
            -1 + this.field_o[0].length != this.field_D) &&
            (16384 != this.field_s ||
            0 != this.field_u) &&
            (this.field_s != 2048 ||
            this.field_u != this.field_o.length - 1)) {
            var3 = this.field_s;
            if (var3 == 4096) {
              this.field_F = 512;
              this.field_D = this.field_D - 1;
              this.a(2048, 8, 4096, -41, 1, 16384, 32);
              return;
            }
            if (var3 == 8192) {
              this.field_D = this.field_D + 1;
              this.field_F = 256;
              this.a(2048, 4, 8192, -48, 1, 16384, 16);
              return;
            }
            if (16384 == var3) {
              this.field_u = this.field_u - 1;
              this.field_F = 128;
              this.a(8192, 8, 16384, -123, 2, 4096, 4);
              return;
            }
            if (var3 != 2048) {
              return;
            }
            this.field_F = 1024;
            this.field_u = this.field_u + 1;
            this.a(8192, 32, 2048, -66, 2, 4096, 16);
            return;
          }
          this.field_G = 13;
          this.field_q = false;
          return;
        }
        return;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        byte[] var12;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = TrackController.field_F ? 1 : 0;
        var5 = sc.a(param0, -1);
        if (var5 < 2) {
          return param0;
        }
        if (var5 > 2) {
          var6 = (int)(Math.random() * (double)var5);
          for (var7 = 0; var7 < 32; var7++) {
            if ((1 & param0) == 1) {
              incrementValue$0 = var6;
              var6--;
              if (incrementValue$0 == 0) {
                return 1 << var7;
              }
            }
            param0 = param0 >> 1;
          }
        }
        var6Lifetime1 = -1;
        var7Lifetime1 = -1;
        var8 = 0;
        L4: while (true) {
          if (var8 < 32) {
            if (1 == (param0 & 1)) {
              if (var7Lifetime1 != -1) {
                var6Lifetime1 = var8;
                break L4;
              }
              var7Lifetime1 = var8;
            }
            param0 = param0 >> 1;
            var8++;
            continue;
          }
          break;
        }
        if (param2 != 16384) {
          var12 = (byte[]) null;
          ra.a(-59, (byte[]) null);
        }
        var8Lifetime1 = (-var7Lifetime1 + 9) * var7Lifetime1 / 2 + (var6Lifetime1 - 1);
        var9 = 1 << var8Lifetime1;
        stackIn_25_0 = ((var9 & this.field_B[param3][param1]) == 0) ? 0 : 1;
        var10 = stackIn_25_0;
        this.field_B[param3][param1] = (short)ma.a((int) this.field_B[param3][param1], var9);
        stackIn_27_0 = 1;
        if (var10 != 0) {
          stackIn_28_1 = var6Lifetime1;
        } else {
          stackIn_28_1 = var7Lifetime1;
        }
        return stackIn_27_0 << stackIn_28_1;
    }

    static {
        field_v = -1;
        field_r = "Level ";
        field_w = "Waiting for extra data";
        field_t = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
