/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends PacketBuffer {
    private int field_r;
    static volatile int liveMouseX;
    private nf field_n;
    static int[] field_p;
    static String field_q;
    static int field_o;

    final int d(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        int var3 = this.field_r >> 3;
        int var4 = 8 - (this.field_r & 7);
        int var5 = param0;
        this.field_r = this.field_r + param1;
        while (var4 < param1) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((pf.field_c[var4] & this.payload[incrementValue$0]) << -var4 + param1);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 == var4) {
          var5 = var5 + (this.payload[var3] & pf.field_c[var4]);
        } else {
          var5 = var5 + (this.payload[var3] >> var4 - param1 & pf.field_c[param1]);
        }
        return var5;
    }

    la(byte[] param0) {
        super(param0);
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = 0;
          if (param1) {
            return;
          }
          while (var5_int < param0) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int + param2] = (byte)(this.payload[fieldTemp$0] - this.field_n.c(127));
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("la.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void g(byte param0) {
        this.position = (this.field_r + 7) / 8;
        if (param0 <= -25) {
          return;
        }
        field_p = (int[]) null;
    }

    final void a(byte param0, int[] param1) {
        if (param0 != -83) {
          return;
        }
        try {
          this.field_n = new nf(param1);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "la.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    la(int param0) {
        super(param0);
    }

    public static void d(boolean param0) {
        if (param0) {
          return;
        }
        field_p = null;
        field_q = null;
    }

    final void h(byte param0) {
        this.field_r = 8 * this.position;
        if (param0 == 31) {
          return;
        }
        this.field_r = -2;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.field_n.c(126) + param0);
        if (param1 == 7) {
          return;
        }
        this.g((byte) 52);
    }

    final int e(boolean param0) {
        int fieldTemp$0 = 0;
        if (param0) {
          byte[] var3 = (byte[]) null;
          this.a(-123, false, 4, (byte[]) null);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_n.c(125) & 255;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_n.c(125) & 255;
    }

    static {
        liveMouseX = -1;
        field_p = new int[8192];
    }
}
