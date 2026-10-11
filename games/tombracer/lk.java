/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends vg implements qn, fo, noa {
    private int field_o;
    private int field_p;
    private bca field_m;
    static boolean[] field_h;
    private boolean field_g;
    private int field_n;
    private boolean field_f;
    private int field_j;
    private la field_i;
    private int field_k;
    static jea field_l;

    private final boolean a(int param0) {
        if (param0 < 65) {
          return false;
        }
        return false;
    }

    final boolean a(int param0, boolean param1) {
        if (param1) {
          this.c((byte) -27);
        }
        return this.field_m.a(param0, 14530);
    }

    final void a(la param0, byte param1) {
        iq var4 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_n = param0.a(this.field_n, (byte) 71);
          stackIn_3_1 = !(this.field_g);
          this.field_g = stackIn_3_1;
          if (param1 != 104) {
            var4 = (iq) null;
            this.a(-36, (iq) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lk.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          return false;
        }
        stackIn_6_0 = (this.field_i.o((byte) -82)) && (!this.a(this.field_i.i(6029), false));
        return stackIn_6_0;
    }

    final void a(int param0, int param1) {
        this.field_n = param1;
        if (param0 != -6492) {
          this.b((byte) 30);
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!this.f((byte) -1)) {
            dea.field_a.a(param1, 15, this);
          }
          if (param0 <= 103) {
            this.field_g = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lk.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final int b(byte param0) {
        int var2 = -17 % ((-23 - param0) / 53);
        return this.field_n;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_i = (la) null;
        }
    }

    final void a(byte param0, kh param1) {
        try {
          if (param0 >= -125) {
            this.field_n = -37;
          }
          param1.a((byte) 20, this.field_j, 8);
          param1.a((byte) -127, this.field_n >> 16, 12);
          param1.a((byte) -43, this.field_p >> 16, 12);
          param1.a((byte) -125, this.field_k >> 16, 10);
          param1.a((byte) -128, this.field_o >> 16, 10);
          param1.a((byte) -127, this.field_g ? 1 : 0, 1);
          param1.a((byte) 86, !this.field_f ? 0 : 1, 1);
          this.field_m.a((byte) -86, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lk.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.a(72);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          return -46;
        }
        return this.field_p;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          this.field_k = -73;
          return 0;
        }
        return 0;
    }

    final int a(byte param0) {
        int var2 = -101 % ((56 - param0) / 62);
        return this.field_n;
    }

    final int b(int param0) {
        if (param0 < 36) {
          return -117;
        }
        return this.field_k;
    }

    final void b(int param0, int param1) {
        this.field_p = param1;
        if (param0 != 0) {
          this.d((byte) 90);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_h = null;
        if (param0) {
          field_h = (boolean[]) null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
          field_h = (boolean[]) null;
        }
        return this.field_o;
    }

    final int g(byte param0) {
        if (param0 >= -58) {
          return -85;
        }
        return this.field_p;
    }

    lk(la param0, kh param1) {
        try {
          this.field_i = param0;
          this.field_j = param1.b((byte) 44, 8);
          this.field_n = param1.b((byte) 44, 12) << 16;
          this.field_p = param1.b((byte) 44, 12) << 16;
          this.field_k = param1.b((byte) 44, 10) << 16;
          this.field_o = param1.b((byte) 44, 10) << 16;
          this.field_g = param1.b((byte) 44, 1) == 1 ? true : false;
          this.field_f = param1.b((byte) 44, 1) == 1 ? true : false;
          this.field_m = new bca(param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = new boolean[42];
        for (var0 = 0; var0 < field_h.length; var0++) {
          field_h[var0] = true;
        }
        field_h[0] = false;
        field_h[36] = false;
        field_h[37] = false;
        field_h[38] = false;
        field_h[33] = false;
        field_h[34] = false;
        field_h[39] = false;
        field_h[40] = false;
        field_h[41] = false;
        field_h[35] = false;
    }
}
