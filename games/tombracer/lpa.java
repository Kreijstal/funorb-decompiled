/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lpa extends nv {
    private int field_t;
    private int field_u;
    private int field_q;
    private boolean field_r;
    static Random field_p;
    static il field_s;
    private int field_n;
    static int field_v;
    static boolean field_w;
    static int field_o;

    lpa(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = -1;
        try {
          this.field_q = 50;
          this.field_n = 50;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (this.field_r) {
          return 0;
        }
        if (param3 != 1) {
          return 0;
        }
        int var7 = 0;
        if (param4 >= 79) {
          return foa.a(param1, param5, this.field_g.e(9648), param2, -var7 + this.field_g.c(-62), (byte) 75, param0, this.field_g.a((byte) 55) - var7, 16, this.field_g.d(3));
        }
        this.field_q = -65;
        return foa.a(param1, param5, this.field_g.e(9648), param2, -var7 + this.field_g.c(-62), (byte) 75, param0, this.field_g.a((byte) 55) - var7, 16, this.field_g.d(3));
    }

    final boolean g(byte param0) {
        if (param0 >= 63) {
          return this.field_u <= 0 ? true : false;
        }
        fsa var3 = (fsa) null;
        this.a(false, (fsa) null);
        return this.field_u <= 0 ? true : false;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          return 39;
        }
        param0 = fs.a((byte) 71, param0, this.field_u);
        return param0;
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          param1.b((byte) 91, 3);
          param1.a(true, (byte) -119, 1);
          param1.a((byte) -112, true, 2);
          param1.b((byte) 17, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lpa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_n = param1;
        if (param0 != -5) {
          this.a(3, -95, -50, 37, (byte) -23, 92);
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(-87, -106);
          return 9;
        }
        return 9;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) 36, this.field_n, 8);
          param1.a((byte) 87, this.field_q, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lpa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_u != -1 ? true : false;
    }

    lpa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = -1;
        try {
          this.field_n = param1.b((byte) 44, 8);
          this.field_q = param1.b((byte) 44, 8);
          if (param0.field_E >= 4 &&
            19 >= param0.field_E) {
            param1.b((byte) 44, 1);
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 50) {
            field_o = 116;
          }
          var4 = new float[param0];
          var3 = var4;
          lua.a(param2, 0, var4, 0, param0);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("lpa.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -16 % ((16 - param1) / 44);
        this.field_q = param0;
    }

    public final void m(int param0) {
        int var2 = -46 % ((28 - param0) / 49);
        if (this.field_k) {
          return;
        }
        super.m(117);
    }

    final void k(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 5418) {
          return;
        }
        if (this.d(false)) {
          this.field_u = this.field_u - 1;
          if (this.field_u <= 0) {
            this.field_r = true;
            this.field_g.i(true);
            return;
          }
          return;
        }
        if (this.field_n <= 0) {
          this.field_t = 0;
          return;
        }
        if (this.field_n <= this.field_t) {
          this.field_u = this.field_q;
          return;
        }
        this.field_t = 0;
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, (byte) 101, param2, param3);
          if (this.field_r) {
            return;
          }
          if (param1 < 18) {
            this.g((byte) -126);
          }
          if (param3 != 2) {
            return;
          }
          if (this.field_g == param0) {
            var5_int = this.field_g.d(3) - this.field_g.I(-16423);
            var6 = this.field_g.e(9648) - this.field_g.y((byte) -91);
            if (var5_int != 0) {
              param2.a(125, true, 1, var6, var5_int, 0);
            } else {
              if (var6 != 0) {
                param2.a(125, true, 1, var6, var5_int, 0);
              }
            }
          }
          if (this.field_u != -1) {
            return;
          }
          this.field_t = this.field_t + param2.b(-89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("lpa.SB(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
          field_p = (Random) null;
          field_s = null;
          field_p = null;
          return;
        }
        field_s = null;
        field_p = null;
    }

    static {
        field_p = new Random();
        field_v = 0;
        field_o = 0;
    }
}
