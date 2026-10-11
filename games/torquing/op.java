/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends wk implements ec {
    private la field_m;
    private la field_p;
    private boolean field_o;
    static int field_k;
    private cf field_l;
    private int field_n;
    static int field_q;
    static int field_j;
    static int field_i;

    public final int[] a(int param0, float param1) {
        vm var3;
        vm stackIn_4_0;
        Object stackIn_4_1;
        la stackIn_4_2;
        float stackIn_4_3;
        Object stackIn_5_1;
        boolean stackIn_6_4 = false;
        Object stackIn_4_1Lifetime1;
        var3 = this.b(param0, (byte) -61);
        if (var3 == null) {
          return null;
        }
        boolean decompiledFrameRemainder0 = true;
        stackIn_4_0 = var3;
        stackIn_4_1 = this;
        stackIn_4_2 = this.field_p;
        stackIn_4_3 = param1;
        if (!this.field_o) {
          stackIn_5_1 = this;
          if (!this.a(param0, (byte) 98).field_h) {
            stackIn_6_4 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_4_1Lifetime1 = this;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_6_4 = true;
        }
        return ((vm) (Object) stackIn_4_0).a((si) (this), stackIn_4_2, stackIn_4_3, stackIn_6_4);
    }

    final static void a(byte param0, fj param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4, byte[] param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Torquing.field_u;
        try {
          var7_int = ed.a((byte) 72, param4);
          if (mo.field_y == null) {
            mo.field_y = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = mo.field_y.nextInt();
          }
          if (param0 != 20) {
            op.a(-68L, 80);
          }
          if (hc.field_c == null ||
            !(var7_int <= hc.field_c.field_j.length)) {
            hc.field_c = new fj(var7_int);
          }
          hc.field_c.field_n = 0;
          hc.field_c.a(param4, param6, param5, (byte) -53);
          hc.field_c.d(var7_int, 114);
          hc.field_c.a(5479, var13);
          if (null == vg.field_k ||
            !(vg.field_k.field_j.length >= 100)) {
            vg.field_k = new fj(100);
          }
          vg.field_k.field_n = 0;
          vg.field_k.b(90, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            vg.field_k.b((byte) 60, var13[var11]);
            var11++;
          }
          vg.field_k.a(param4, param0 + 52);
          vg.field_k.a(param2, param3, -64);
          param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
          param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("op.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    private final vm b(int param0, byte param1) {
        byte[] var4 = null;
        vm var3 = (vm) (this.field_l.a((long)param0, 4604));
        byte[] var4Lifetime1;
        if (var3 != null) {
          return var3;
        }
        if (param1 != -61) {
          field_k = -28;
          var4 = this.field_m.a(param0, param1 + 161, 0);
          if (var4 != null) {
            var3 = new vm(new fj(var4));
            this.field_l.a((long)param0, var3, 0);
            return var3;
          }
          return null;
        }
        var4Lifetime1 = this.field_m.a(param0, param1 + 161, 0);
        if (var4Lifetime1 != null) {
          var3 = new vm(new fj(var4Lifetime1));
          this.field_l.a((long)param0, var3, 0);
          return var3;
        }
        return null;
    }

    final static void a(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          byte[] var4 = null;
          try {
            Thread.sleep(param0);
            if (param1 < 75) {
              var4 = (byte[]) null;
              op.a((byte) -95, (fj) null, (java.math.BigInteger) null, (java.math.BigInteger) null, 124, (byte[]) null, -48);
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean d(int param0) {
        return !this.a(param0, (byte) 98).field_g;
    }

    public final int c(int param0) {
        return this.a(param0, (byte) 98).field_j;
    }

    final wd a(byte param0, int param1) {
        vm var3 = null;
        vm var3Lifetime1;
        if (param0 <= 19) {
          field_j = 49;
          var3 = this.b(param1, (byte) -61);
          if (var3 != null) {
            return var3.field_u;
          }
          return null;
        }
        var3Lifetime1 = this.b(param1, (byte) -61);
        if (var3Lifetime1 != null) {
          return var3Lifetime1.field_u;
        }
        return null;
    }

    op(la param0, la param1, la param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_o = false;
        this.field_n = 50;
        try {
          this.field_m = param0;
          this.field_n = param3;
          this.field_p = param2;
          this.field_o = param4 ? true : false;
          this.field_l = new cf(this.field_n);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "op.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(int param0) {
        return this.a(param0, (byte) 98).field_d & 65535;
    }

    public final boolean a(int param0) {
        if (this.field_o) {
          return true;
        }
        if (!this.a(param0, (byte) 98).field_h) {
          return false;
        }
        return true;
    }

    static {
        tb.a(50, -128);
    }
}
