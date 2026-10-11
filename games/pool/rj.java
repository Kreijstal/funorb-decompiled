/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends sq {
    static String field_g;
    static String field_i;
    static int field_f;
    static String field_j;
    int[] field_e;
    static int field_h;

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4;
        int stackIn_22_0 = 0;
        if (param2 != -1) {
          rj.a(56, -99, 1, -23);
        }
        if (sa.field_f != null &&
          qi.field_a == 13) {
          sa.field_f = null;
          return true;
        }
        if (!rg.field_p) {
          if (!fm.field_H &&
            qi.field_a != 9 &&
            10 != qi.field_a &&
            qi.field_a != 11) {
            if (qi.field_a != 80) {
              return false;
            }
            if (!mp.g((byte) -108)) {
              return false;
            }
            rg.field_p = true;
            return true;
          }
          return tf.a(param2 + 15586, param0, param3);
        }
        if (!mp.g((byte) -121)) {
          return false;
        }
        stackIn_22_0 = (!th.a(param3, -103, param1)) ? 0 : 1;
        var4 = stackIn_22_0;
        if (80 == qi.field_a ||
          84 == qi.field_a) {
          rg.field_p = false;
          var4 = 1;
        }
        if (qi.field_a == 13) {
          cl.a(param2 + 14852);
          rg.field_p = false;
          var4 = 1;
        }
        return var4 != 0;
    }

    private final void f(int param0, int param1) {
        if (this.field_e[param0] > 0) {
          this.field_e[param0] = this.field_e[param0] - 1;
        }
        if (param1 != 8640) {
          qe var4 = (qe) null;
          this.b((qe) null, -71);
        }
    }

    final int a(byte param0) {
        int var7 = 0;
        int var3;
        int var4;
        int var5;
        aa var6_ref_aa;
        int var6;
        cr var7_ref_cr;
        int var8;
        qe var9;
        qe var10;
        var8 = Pool.field_O;
        var9 = this.field_d.j(96);
        var10 = var9;
        if (var10 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
        var3 = 69 % ((-37 - param0) / 60);
        if (2 != var10.field_q) {
          throw new IllegalStateException("Shot not finished yet, foo!");
        }
        var4 = ll.field_f;
        if (this.field_d.d((byte) 125)) {
          var4 = var4 | (nr.field_R | um.field_c);
          var10.field_t = true;
          var10.field_w = (byte)(var10.field_w - 1);
          var10.a(3, -14, new int[]{var9.field_L});
        }
        if (var10.field_n == -1) {
          var10.field_w = (byte)(var10.field_w - 1);
          var10.field_t = true;
          var10.a(7, -14, new int[]{var9.field_L});
        }
        var5 = 0;
        var6_ref_aa = new aa(var10.field_m);
        var7_ref_cr = (cr) (var6_ref_aa.b((byte) -92));
        while (var7_ref_cr != null) {
          if (0 == var7_ref_cr.field_n) {
            var10.field_w = (byte)(var10.field_w - 1);
          } else {
            if (var7_ref_cr.field_n == 8 &&
              !var10.field_t) {
              var10.a(20, -14, new int[]{var9.field_L});
              this.d(var10.field_L, 165);
            }
            var5++;
          }
          var7_ref_cr = (cr) (var6_ref_aa.b(-95));
        }
        if (var10.field_M < 0) {
          if (var5 == 0) {
            var10.a(18, -14, new int[]{var10.field_L});
            this.f(var10.field_L, 8640);
          } else {
            var10.field_w = (byte)(var10.field_w + var5);
          }
          if (var10.field_t) {
            var10.a(19, -14, new int[]{});
            this.f(var10.field_L, 8640);
          }
        } else {
          if (!var10.field_t) {
            if (var5 == 0) {
              var4 = nd.field_j;
            }
          } else {
            var10.a(22, -14, new int[]{var9.field_L});
            this.f(var10.field_L, 8640);
            var4 = var4 | (nr.field_R | ob.field_F);
          }
        }
        if (this.e((byte) -91) > 1) {
          var6 = 0;
          for (var7 = 1; this.field_d.field_l.length > var7; var7++) {
            if (!this.field_d.field_l[var7].field_s) {
              continue;
            }
            var6 = 1;
            break;
          }
          if (var6 == 0) {
            var4 = var4 | (ob.field_F | nr.field_R);
          }
        } else {
          if (this.a((byte) 36, var10.field_L)) {
            var4 = var4 | ag.field_e;
          } else {
            var4 = var4 | hm.field_e;
          }
        }
        return var4;
    }

    final void a(ge param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Pool.field_O;
        try {
          if (this.field_d.field_h.length != this.field_e.length) {
            this.field_e = new int[this.field_d.field_h.length];
          }
          var3_int = 0;
          while (true) {
            var4 = param0.g(-119);
            this.field_e[var3_int] = rb.b(var4, 254) >> 4;
            var3_int++;
            if (this.field_d.field_h.length != var3_int) {
              this.field_e[var3_int] = rb.b(var4, 15);
              var3_int++;
              if (~var3_int != ~this.field_d.field_h.length) {
                continue;
              }
            }
            break;
          }
          if (!param1) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("rj.M(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(qe param0, boolean param1) {
        try {
          super.a(param0, param1);
          param0.field_N = this.field_e[param0.field_L];
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "rj.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static long a(long param0, byte param1, long param2) {
        long var5;
        if (param1 != -48) {
          field_g = (String) null;
        }
        var5 = param0 * param2;
        if (param0 < 0L &&
          param2 < 0L &&
          var5 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
        }
        if ((0L < param0 &&
          0L > param2 ||
          param0 < 0L &&
          param2 > 0L) && var5 > 0L) {
          throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
        }
        if (param0 > 0L &&
          param2 > 0L &&
          0L > var5) {
          throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
        }
        return var5;
    }

    rj(al param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_e = new int[this.field_d.field_h.length];
          for (var2_int = 0; this.field_e.length > var2_int; var2_int++) {
            this.field_e[var2_int] = 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rj.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static float e(int param0, int param1) {
        if (param1 != 3) {
          return -1.207617998123169f;
        }
        return de.a(-1, 3, param0);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = Pool.field_O;
        var2 = 0;
        var3 = 0;
        if (param0 > -71) {
          return -24;
        }
        while (var3 < this.field_e.length) {
          if (this.a((byte) 115, var3)) {
            var2++;
          }
          var3++;
        }
        return var2;
    }

    final boolean f(int param0) {
        if (param0 <= 113) {
          this.h(-114);
          return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = -32 / ((-79 - param0) / 38);
        return 1;
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        qe var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            return null;
          }
          var4 = (qe) null;
          this.a(40, (byte) -54, (qe) null);
          stackIn_3_0 = null;
          return (dd) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rj.JA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
          this.field_e = (int[]) null;
          return 0;
        }
        return 0;
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
          this.d(28, 64);
        }
        return uj.field_a;
    }

    final int m(int param0) {
        if (param0 != 0) {
          field_i = (String) null;
        }
        return 1 + this.field_d.field_h.length >> 1;
    }

    final int h(int param0) {
        int var3;
        int var4;
        int var5;
        qe var6;
        int var3Lifetime1;
        var5 = Pool.field_O;
        var6 = this.field_d.j(45);
        var3 = 0;
        var4 = var6.field_u;
        if (var4 != 2) {
          if (var4 != 3) {
            if (var4 == 1) {
              var3Lifetime1 = ll.field_f | nr.field_R;
            } else {
              var3Lifetime1 = ll.field_f;
            }
          } else {
            var3Lifetime1 = nr.field_V | ll.field_f;
          }
        } else {
          var3Lifetime1 = ll.field_f | nr.field_Q;
        }
        var6.field_t = true;
        if (~var6.field_M <= param0) {
          var3Lifetime1 = var3Lifetime1 | ob.field_F;
        }
        this.f(var6.field_L, 8640);
        if (this.e((byte) -125) <= 1) {
          if (this.a((byte) -99, var6.field_L)) {
            var3Lifetime1 = var3Lifetime1 | ag.field_e;
          } else {
            var3Lifetime1 = var3Lifetime1 | hm.field_e;
          }
        }
        return var3Lifetime1;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 < 122) {
          field_f = -9;
        }
        return 0 != param2 ? true : false;
    }

    final boolean a(byte param0, int param1) {
        int var3 = -125 % ((-16 - param0) / 46);
        return this.field_e[param1] > 0 ? true : false;
    }

    final void c(int param0) {
        if (param0 >= -25) {
          field_h = 78;
        }
    }

    private final void d(int param0, int param1) {
        if (15 > this.field_e[param0]) {
          this.field_e[param0] = this.field_e[param0] + 1;
        }
        if (param1 != 165) {
          this.m(-27);
        }
    }

    final int j(int param0) {
        int var2 = 0;
        if (ko.a(param0, (byte) 99) &&
          this.field_d.field_s == 2) {
          var2 = ga.a(14, true, ea.field_r);
          return var2 - (-1 - var2 / 7);
        }
        return -1;
    }

    final static void c(byte param0) {
        qk.field_f.field_hb = dq.a(1, param0 ^ -45, Integer.toString(fr.field_n));
        dk.a(qk.field_f, (byte) 93);
        tn.field_w.field_pb = 2 < fr.field_n ? true : false;
        ih.field_e.field_pb = fr.field_n < 8 ? true : false;
        if (param0 != -45) {
          rj.c((byte) -61);
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
          field_g = (String) null;
          return false;
        }
        return false;
    }

    final int a(boolean param0) {
        if (param0) {
          return 96;
        }
        return 1;
    }

    final byte b(int param0, int param1) {
        if (param1 != 30554) {
          qe var4 = (qe) null;
          this.a((qe) null, 32);
        }
        if (param0 != 0) {
          return (byte) 0;
        }
        return (byte) -1;
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -41 % ((-32 - param1) / 40);
          stackIn_1_0 = -1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("rj.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 >= -61) {
          field_i = (String) null;
        }
        field_g = null;
        field_i = null;
    }

    final boolean a(int param0, byte param1, qe param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            this.a(97);
          }
          return !(param0 <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rj.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean c(qe param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -33) {
            stackIn_6_0 = !(param0.field_n < 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rj.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int i(int param0) {
        if (param0 != 26840) {
          this.a(-19, (byte) -27);
        }
        return 16;
    }

    static {
        field_i = "Spectate";
        field_g = "You are <%2>!";
        field_j = "Off";
        field_h = 165;
    }
}
