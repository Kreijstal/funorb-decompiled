/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa extends ds {
    private int field_k;
    private int field_i;
    private dq field_j;

    final void a(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        param1 = param1 & uta.field_q[param2];
        while (this.field_k < param2) {
          param2 = param2 - this.field_k;
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$1] = (byte)(this.field_h[fieldTemp$1] + (param1 >>> param2));
          this.field_h[this.field_e] = (byte) 0;
          this.field_k = 8;
        }
        if (this.field_k == param2) {
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = (byte)(this.field_h[fieldTemp$0] + param1);
          this.field_h[this.field_e] = (byte) 0;
          this.field_k = 8;
        } else {
          this.field_k = this.field_k - param2;
          this.field_h[this.field_e] = (byte)(this.field_h[this.field_e] + (param1 << this.field_k));
        }
        if (param0 == -632) {
          return;
        }
        this.field_k = -63;
    }

    final void f(byte param0) {
        this.field_e = (this.field_i + 7) / 8;
        if (param0 > -31) {
          this.field_j = (dq) null;
        }
    }

    final int o(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 255) {
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          return 255 & this.field_h[fieldTemp$0] - this.field_j.a((byte) -41);
        }
        this.f((byte) -108);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        return 255 & this.field_h[fieldTemp$1] - this.field_j.a((byte) -41);
    }

    final static vab a(byte param0, qfa param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vab stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        vab stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 115) {
            stackIn_2_0 = (vab) null;
            return stackIn_2_0;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param2, var4_int);
          jaggl.OpenGL.glProgramStringARB(param2, 34933, param3);
          jaggl.OpenGL.glGetIntegerv(34379, lp.field_b, 0);
          if (lp.field_b[0] != -1) {
            jaggl.OpenGL.glBindProgramARB(param2, 0);
            stackIn_6_0 = null;
            return (vab) (stackIn_6_0);
          }
          jaggl.OpenGL.glBindProgramARB(param2, 0);
          stackIn_8_0 = new vab(param1, param2, var4_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("faa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int i(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = VoidHunters.field_G;
        int var3 = this.field_i >> 3;
        int var4 = 8 - (7 & this.field_i);
        int var5 = param0;
        this.field_i = this.field_i + param1;
        while (var4 < param1) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_h[incrementValue$0] & uta.field_q[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 != var4) {
          var5 = var5 + (this.field_h[var3] >> -param1 + var4 & uta.field_q[param1]);
        } else {
          var5 = var5 + (this.field_h[var3] & uta.field_q[var4]);
        }
        return var5;
    }

    faa(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 == 24335) {
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = (byte)(param1 + this.field_j.a((byte) -41));
          return;
        }
        this.field_j = (dq) null;
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(param1 + this.field_j.a((byte) -41));
    }

    faa(int param0) {
        super(param0);
    }

    final void r(int param0) {
        if (this.field_k < 8) {
          this.field_e = this.field_e + 1;
          this.field_k = 8;
        }
        if (param0 == 32712) {
          return;
        }
        this.field_j = (dq) null;
    }

    final void a(int param0, int[] param1) {
        try {
          this.field_j = new dq(param1);
          if (param0 != 18794) {
            this.r(-43);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "faa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.field_i = 8 * this.field_e;
        if (param0 != -23497) {
          this.r(-90);
        }
    }

    final void q(int param0) {
        this.field_h[this.field_e] = (byte) 0;
        if (param0 > -66) {
          return;
        }
        this.field_k = 8;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (param2 != -50) {
            this.o(39);
          }
          for (var5_int = 0; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            param3[var5_int + param1] = (byte)(this.field_h[fieldTemp$0] - this.field_j.a((byte) -41));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("faa.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
