/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends od {
    static int[] field_n;
    static ok field_l;
    private ta field_o;
    static int field_m;
    static nh field_p;
    private int field_q;

    final int e(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 != 121) {
          byte[] var3 = (byte[]) null;
          this.a(-86, 117, (byte[]) null, (byte) -63);
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          return 255 & this.field_h[fieldTemp$0] - this.field_o.b((byte) -57);
        }
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        return 255 & this.field_h[fieldTemp$1] - this.field_o.b((byte) -57);
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = 0;
          if (param3 > -114) {
            return;
          }
          while (var5_int < param0) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            param2[param1 + var5_int] = (byte)(this.field_h[fieldTemp$0] - this.field_o.b((byte) -115));
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("lh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(nh[] param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 != null &&
            param2 > 0) {
            var6_int = param0[0].field_z;
            if (param1 <= 46) {
              return;
            }
            var7 = param0[2].field_z;
            var8 = param0[1].field_z;
            param0[0].b(param4, param5, param3);
            param0[2].b(param4 + param2 - var7, param5, param3);
            wj.b(rb.field_e);
            wj.d(param4 + var6_int, param5, param4 + (param2 - var7), param0[1].field_C + param5);
            var9 = param4 + var6_int;
            var10 = -var7 + (param4 + param2);
            for (param4 = var9; var10 > param4; param4 = param4 + var8) {
              param0[1].b(param4, param5, param3);
            }
            wj.a(rb.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("lh.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    lh(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int[] param1) {
        try {
          if (param0 > -100) {
            this.field_o = (ta) null;
          }
          this.field_o = new ta(param1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "lh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lh(int param0) {
        super(param0);
    }

    final static void b(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          int var3 = 0;
          InterruptedException var4 = null;
          var3 = 95 % ((param1 - 54) / 48);
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void o(int param0) {
        this.field_j = (this.field_q + 7) / 8;
        if (param0 <= -107) {
          return;
        }
        field_l = (ok) null;
    }

    final void d(byte param0) {
        int var2 = -98 / ((param0 + 11) / 42);
        this.field_q = 8 * this.field_j;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param1 != -18392) {
          lh.b(2L, (byte) -21);
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_h[fieldTemp$0] = (byte)(this.field_o.b((byte) 127) + param0);
          return;
        }
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(this.field_o.b((byte) 127) + param0);
    }

    final int e(int param0, byte param1) {
        int incrementValue$0 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var3 = this.field_q >> 3;
        int var4 = 8 - (this.field_q & 7);
        int var6 = 47 / ((param1 + 33) / 51);
        int var5 = 0;
        this.field_q = this.field_q + param0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_h[incrementValue$0] & ji.field_a[var4]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 == param0) {
          var5 = var5 + (this.field_h[var3] & ji.field_a[var4]);
        } else {
          var5 = var5 + (this.field_h[var3] >> -param0 + var4 & ji.field_a[param0]);
        }
        return var5;
    }

    public static void p(int param0) {
        field_l = null;
        field_p = null;
        if (param0 != 0) {
          field_n = (int[]) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    static {
        field_n = new int[2];
    }
}
