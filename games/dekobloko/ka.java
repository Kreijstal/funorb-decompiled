/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends ma {
    static String field_M;
    private vj field_Q;
    static String field_O;
    static af field_P;
    static pl field_N;

    final bl g(byte param0) {
        rd var2;
        bl var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_Q);
        var3 = (bl) (var2.a((byte) 71));
        if (param0 > -73) {
          ka.h((byte) 44);
        }
        while (var3 != null) {
          if (var3.field_S) {
            return var3;
          }
          var3 = (bl) (var2.a(-93));
        }
        return null;
    }

    final void c(boolean param0) {
        int var4 = client.field_A ? 1 : 0;
        if (!param0) {
          field_O = (String) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) (var2.a((byte) 71));
        while (var3 != null) {
          var3.field_S = false;
          var3 = (bl) (var2.a(-48));
        }
        this.field_L = null;
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 0) {
            throw new IllegalArgumentException();
          }
          if (pe.a(922790152, param1)) {
            stackIn_5_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 32);
            return stackIn_5_0;
          }
          if (param0 < 42) {
            field_N = (pl) null;
          }
          var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
          do {
            var4 = param2.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = oi.a(param1, 105, var4);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ka.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public ka() {
        super(0, 0, cf.field_f, vd.field_n, (gl) null, (kg) null);
        this.field_Q = new vj();
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0;
        boolean stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        boolean stackIn_16_6 = false;
        int stackIn_18_7;
        boolean stackIn_18_8;
        boolean stackIn_18_9;
        int stackIn_18_10;
        boolean stackIn_19_11;
        sb.c((byte) 123);
        if (hh.field_a == tc.field_Tb) {
          gn.b(param1 - 26499);
        } else {
          if (cd.field_m != null) {
            stackIn_7_0 = (km.b(cd.field_m.field_rc, -8222)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var2 = stackIn_7_0;
          stackIn_10_0 = (hh.field_a == null) ? 0 : 1;
          var3 = stackIn_10_0;
          stackIn_14_0 = 0;
          stackIn_14_1 = true;
          stackIn_14_2 = 14;
          stackIn_14_3 = 11;
          stackIn_14_4 = 13;
          stackIn_14_5 = jk.field_c;
          stackIn_16_6 = (fm.field_b) || (fa.field_n) || (var3 != 0);
          stackIn_18_7 = 15;
          stackIn_18_8 = param0;
          stackIn_18_9 = true;
          stackIn_18_10 = var2;
          stackIn_19_11 = (50 >= pm.field_g) ? false : true;
          lk.a(stackIn_14_0, stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5, stackIn_16_6, stackIn_18_7, stackIn_18_8, stackIn_18_9, stackIn_18_10 != 0, stackIn_19_11);
        }
        if (param1 != -3051) {
          return;
        }
        if (sn.field_g) {
          jb.a((byte) 126, uj.field_g);
          sn.field_g = false;
        }
        if (gm.field_I) {
          we.field_b.f(58, -4);
          gm.field_I = false;
        }
        if (nh.field_a) {
          we.field_b.f(10, -4);
          nh.field_a = false;
        }
    }

    final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
          field_O = (String) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) (var2.a((byte) 71));
        while (var3 != null) {
          if (var3.h((byte) 39)) {
            var3.b((byte) 124);
          }
          var3 = (bl) (var2.a(param0 - 70));
        }
        this.field_L = (ce) ((Object) this.g((byte) -87));
    }

    public static void h(byte param0) {
        field_N = null;
        field_O = null;
        field_M = null;
        field_P = null;
        int var1 = 99 % ((-85 - param0) / 40);
    }

    final ce a(int param0) {
        rd var2;
        bl var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_Q);
        if (param0 != 14) {
          return (ce) null;
        }
        var3 = (bl) (var2.a((byte) 71));
        while (var3 != null) {
          if (var3.field_S) {
            return var3.e((byte) -74);
          }
          var3 = (bl) (var2.a(-93));
        }
        return null;
    }

    final void f(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != -66) {
          field_P = (af) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) (var2.a((byte) 71));
        while (var3 != null) {
          if (var3.f((byte) 110)) {
            var3.b((byte) 120);
          }
          var3 = (bl) (var2.a(param0 ^ 8));
        }
    }

    final void a(byte param0, ce param1) {
        bl var3 = null;
        try {
          if (!(param1 instanceof bl)) {
            throw new IllegalArgumentException();
          }
          if (param0 > -104) {
            ce var4 = (ce) null;
            this.a((byte) -72, (ce) null);
          }
          var3 = (bl) (param1);
          this.field_Q.b(var3, 7143);
          var3.field_S = true;
          var3.a(false, (ce) (this));
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (null != this.field_p) {
          this.field_p.a(true, param0, param3, (byte) -100, (ce) (this));
        }
        rd var5 = new rd(this.field_Q);
        if (param1 > -103) {
          return;
        }
        ce var6 = (ce) (var5.a(true));
        while (var6 != null) {
          var6.a(param0 + this.field_u, -116, param2, this.field_D + param3);
          var6 = (ce) (var5.d(2078965185));
        }
    }

    static {
        field_M = "CHALLENGE!";
        field_O = "Members' Benefits";
    }
}
