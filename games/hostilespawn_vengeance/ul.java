/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends vd {
    static int field_H;
    private int field_I;
    static bd field_G;
    static java.text.DecimalFormat field_E;
    private gg field_K;
    static String field_M;
    static int field_L;
    static bd[] field_J;
    static boolean field_O;
    static gb field_P;
    static boolean field_N;
    boolean field_F;

    ul(gg param0, int param1, int param2) {
        super(-param1 + mm.field_q >> 1, fb.field_f - param2 >> 1, param1, param2, (nn) null);
        try {
          this.field_K = param0;
          this.field_I = 0;
          this.field_F = false;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, int param2);

    private final int a(boolean param0) {
        if (param0) {
          return !this.field_F ? 0 : this != this.field_K.k(0) ? 0 : 256;
        }
        this.j(-123);
        return !this.field_F ? 0 : this != this.field_K.k(0) ? 0 : 256;
    }

    boolean l(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_41_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 65393) {
          field_O = false;
          var2 = this.a(true);
          var3 = -this.field_I + var2;
          if (var3 <= 0) {
            if (0 > var3) {
              this.field_I = this.field_I + (-16 + var3 + 1) / 16;
            }
            if (this.field_I != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_20_0 = !(this.field_F);
            return stackIn_20_0;
          }
          this.field_I = this.field_I + (-1 + var3 + 8) / 8;
          if (0 > var3) {
            this.field_I = this.field_I + (-16 + var3 + 1) / 16;
          }
          stackIn_10_0 = (this.field_I == 0) && (var2 == 0) && (!this.field_F);
          return stackIn_10_0;
        }
        var2Lifetime1 = this.a(true);
        var3Lifetime1 = -this.field_I + var2Lifetime1;
        if (var3Lifetime1 <= 0) {
          if (0 > var3Lifetime1) {
            this.field_I = this.field_I + (-16 + var3Lifetime1 + 1) / 16;
          }
          stackIn_32_0 = (this.field_I == 0) && (var2Lifetime1 == 0) && (!this.field_F);
          return stackIn_32_0;
        }
        this.field_I = this.field_I + (-1 + var3Lifetime1 + 8) / 8;
        if (0 > var3Lifetime1) {
          this.field_I = this.field_I + (-16 + var3Lifetime1 + 1) / 16;
        }
        stackIn_41_0 = (this.field_I == 0) && (var2Lifetime1 == 0) && (!this.field_F);
        return stackIn_41_0;
    }

    final ag i(int param0) {
        ag var2 = super.i(param0);
        if (var2 != null) {
          return var2;
        }
        return (ag) (this);
    }

    boolean j(int param0) {
        this.field_I = this.a(true);
        if (param0 != -15953) {
          return false;
        }
        if (this.field_I != 0) {
          return false;
        }
        if (!this.field_F) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        this.a(param0, -param2 + fb.field_f >> 1, param1 - 15767, -param0 + mm.field_q >> 1, param2);
        if (param1 != 15767) {
          field_G = (bd) null;
        }
    }

    final static ca a(boolean param0, String param1, long param2, String param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        vk stackIn_5_0 = null;
        la stackIn_7_0 = null;
        uh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -6 / ((param4 + 59) / 39);
          if (param2 == 0L &&
            param1 != null) {
            stackIn_7_0 = new la(param1, param3);
            return (ca) ((Object) stackIn_7_0);
          }
          if (!param0) {
            stackIn_9_0 = new uh(param2, param3);
            return (ca) ((Object) stackIn_9_0);
          }
          stackIn_5_0 = new vk(param2, param3);
          return (ca) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ul.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < 42) {
          String var6 = (String) null;
          ul.a(true, (String) null, 48L, (String) null, -128);
          if (0 == this.field_I) {
            return;
          }
          if (this.field_I >= 256) {
            if (param3 == 0) {
              this.b(this.field_m + param0, -238948511, this.field_v + param1);
              super.a(param0, param1, (byte) 49, param3);
              return;
            }
            return;
          }
          if (q.field_f == null) {
            q.field_f = new bd(this.field_s, this.field_x);
            sb.a(q.field_f, -119);
            si.d();
            this.b(0, -238948511, 0);
            super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
            eh.b(false);
            q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
            return;
          }
          if (this.field_s > q.field_f.field_z) {
            q.field_f = new bd(this.field_s, this.field_x);
            sb.a(q.field_f, -119);
            si.d();
            this.b(0, -238948511, 0);
            super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
            eh.b(false);
            q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
            return;
          }
          if (q.field_f.field_A < this.field_x) {
            q.field_f = new bd(this.field_s, this.field_x);
            sb.a(q.field_f, -119);
            si.d();
            this.b(0, -238948511, 0);
            super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
            eh.b(false);
            q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
            return;
          }
          sb.a(q.field_f, -119);
          si.d();
          this.b(0, -238948511, 0);
          super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
          eh.b(false);
          q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
          return;
        }
        if (0 == this.field_I) {
          return;
        }
        if (this.field_I >= 256) {
          if (param3 == 0) {
            this.b(this.field_m + param0, -238948511, this.field_v + param1);
            super.a(param0, param1, (byte) 49, param3);
            return;
          }
          return;
        }
        if (q.field_f == null) {
          q.field_f = new bd(this.field_s, this.field_x);
          sb.a(q.field_f, -119);
          si.d();
          this.b(0, -238948511, 0);
          super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
          eh.b(false);
          q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
          return;
        }
        if (this.field_s > q.field_f.field_z) {
          q.field_f = new bd(this.field_s, this.field_x);
          sb.a(q.field_f, -119);
          si.d();
          this.b(0, -238948511, 0);
          super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
          eh.b(false);
          q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
          return;
        }
        if (q.field_f.field_A < this.field_x) {
          q.field_f = new bd(this.field_s, this.field_x);
          sb.a(q.field_f, -119);
          si.d();
          this.b(0, -238948511, 0);
          super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
          eh.b(false);
          q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
          return;
        }
        sb.a(q.field_f, -119);
        si.d();
        this.b(0, -238948511, 0);
        super.a(-this.field_m - param0, -this.field_v - param1, (byte) 47, param3);
        eh.b(false);
        q.field_f.b(param1 + this.field_v, param0 + this.field_m, this.field_I);
    }

    final static void e(byte param0) {
        ri.a((byte) 126, true, qi.field_G, fj.field_Sb);
        md.field_i = true;
        if (param0 != -25) {
          field_M = (String) null;
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_E = null;
        field_J = null;
        if (param0 == -1847325791) {
          field_G = null;
          field_M = null;
          return;
        }
        field_G = (bd) null;
        field_G = null;
        field_M = null;
    }

    static {
        field_M = "Your email address is used to identify this account";
        field_O = false;
    }
}
