/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi extends qg implements pb {
    static int field_x;
    static sh field_w;
    qg field_v;
    static int[] field_t;
    static rc field_u;

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        qg var9 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -30386) {
            var9 = (qg) null;
            this.b(113, -82, (qg) null, -14, -67, 9, 85);
          }
          stackIn_6_0 = (this.field_v != null) && (this.field_v.b(param0, param1, param2, param3 + this.field_p, -30386, param5, this.field_n + param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("fi.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    fi(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0) {
        int var2 = 91 % ((74 - param0) / 49);
        if (this.field_v == null) {
          return;
        }
        this.field_v.c((byte) 85);
    }

    private final boolean b(qg param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32) {
            field_x = 106;
          }
          stackIn_7_0 = (this.field_v != null) && (!this.field_v.b((byte) 102)) && (this.field_v.a(param0, param1 - 140));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fi.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int g(int param0) {
        if (param0 <= -41) {
          return this.field_v != null ? this.field_v.g(-116) : 0;
        }
        field_w = (sh) null;
        return this.field_v != null ? this.field_v.g(-116) : 0;
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -20) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a((byte) -93, param3, param2, param0)) {
            this.a(param2, 69, param0, param3);
            this.a(param2, param0, param3, false);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fi.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-126, param1, param2, param3, param4);
        this.a((byte) 126);
        int var6 = 67 % ((-29 - param0) / 53);
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -17) {
            return true;
          }
          stackIn_8_0 = (null != this.field_v) && (this.field_v.b((byte) 53)) && (this.field_v.a(param0, param1, param2, param3, param4, param5 + 0, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("fi.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        ia var1_ref = null;
        Object var1 = null;
        ia var1_refLifetime1;
        if (!param0) {
          fi.c(false);
          var1_ref = (ia) (uj.field_c.a(-9424));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          sb.a(var1_ref.field_o, var1_ref.field_h, var1_ref.field_n);
          sb.a(var1_ref.field_k, var1_ref.field_g, var1_ref.field_p, var1_ref.field_m);
          var1_ref.field_o = null;
          kk.field_f.a(var1_ref, -128);
          return;
        }
        var1_refLifetime1 = (ia) (uj.field_c.a(-9424));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        sb.a(var1_refLifetime1.field_o, var1_refLifetime1.field_h, var1_refLifetime1.field_n);
        sb.a(var1_refLifetime1.field_k, var1_refLifetime1.field_g, var1_refLifetime1.field_p, var1_refLifetime1.field_m);
        var1_refLifetime1.field_o = null;
        kk.field_f.a(var1_refLifetime1, -128);
    }

    public static void h(int param0) {
        if (param0 == 30381) {
          field_w = null;
          field_u = null;
          field_t = null;
          return;
        }
        fi.h(-100);
        field_w = null;
        field_u = null;
        field_t = null;
    }

    String f(int param0) {
        String var2 = super.f(param0);
        if (this.field_v == null) {
          return var2;
        }
        String var3 = this.field_v.f(4);
        if (var3 != null) {
          return var3;
        }
        return var2;
    }

    final void e(int param0) {
        if (param0 != -29113) {
          qg var3 = (qg) null;
          this.a(101, (byte) 111, (qg) null, 40);
          if (this.field_v != null) {
            this.field_v.e(-29113);
            return;
          }
          return;
        }
        if (this.field_v != null) {
          this.field_v.e(-29113);
          return;
        }
    }

    final boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -11) {
            field_t = (int[]) null;
          }
          stackIn_6_0 = (this.field_v != null) && (this.field_v.a(param0, -119));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fi.M(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static uk b(String param0, byte param1) {
        String var2 = null;
        uk var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        uk stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null == rb.field_b) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = hj.a((byte) -126, var6);
          if (param1 != 51) {
            field_t = (int[]) null;
          }
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (uk) (rb.field_b.a((long)var2.hashCode(), (byte) -50));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_eb);
            var4 = hj.a((byte) -126, var7);
            if (var4 == null) {
              var4 = var3.field_eb;
            }
            if (!var4.equals(var2)) {
              var3 = (uk) (rb.field_b.a(93));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("fi.J(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_v &&
            this.field_v.b((byte) -114) &&
            this.field_v.a(param0, param1, (byte) 122, param3)) {
            return true;
          }
          var5_int = param0;
          if (80 != var5_int) {
            var5_int = 55 % ((65 - param2) / 55);
            return false;
          }
          if (!ve.field_B[81]) {
            stackIn_10_0 = this.a(param1, (byte) -128);
          } else {
            stackIn_10_0 = this.b(param1, 32);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("fi.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          discarded$3 = param0.append('\n');
          var5_int = 0;
          if (param3) {
            return;
          }
          while (param1 >= var5_int) {
            discarded$5 = param0.append(' ');
            var5_int++;
          }
          if (null == this.field_v) {
            discarded$4 = param0.append("null");
            return;
          }
          this.field_v.a(param1 + 1, -74, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("fi.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        int var2 = 50 % ((param0 + 57) / 46);
        return this.d((byte) 104) != null ? true : false;
    }

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            this.a(-91, -31, -117, -62, -38);
          }
          if (null == this.field_v) {
            return;
          }
          this.field_v.a(this.field_n + param0, param1, param2, -1, param4, this.field_p + param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("fi.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        nc.field_t = nc.field_t + param1;
        ud.field_b = ud.field_b + (param2 - 255);
        if (mg.field_d) {
          return false;
        }
        int var3 = 1 << param2;
        if (param0 != (var3 & rh.field_n)) {
          return false;
        }
        rh.field_n = rh.field_n | var3;
        hc.field_u = hc.field_u | var3;
        oj.field_u.a(new pi(param2), -99);
        if (qj.b((byte) 78)) {
          rh.field_n = rh.field_n | var3;
        }
        if (dk.field_b) {
          return true;
        }
        if (!qj.b((byte) 74)) {
          nh.a(jk.field_B, ud.field_b, param1, nc.field_t, param2, gh.field_l, 4, 75);
          return true;
        }
        mc.field_c.a(new gd(param2, param1, nc.field_t, ud.field_b, jk.field_B, gh.field_l), -94);
        return true;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_v) {
            this.field_v.a(this.field_n + param0, (byte) -12, param2, param3 + this.field_p);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fi.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean a(qg param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 27 % ((-15 - param1) / 59);
          stackIn_5_0 = (null != this.field_v) && (!this.field_v.b((byte) -117)) && (this.field_v.a(param0, -77));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fi.U(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    qg d(byte param0) {
        int var2 = 47 / ((51 - param0) / 48);
        qg var3 = this.field_v;
        if (var3 == null) {
          return null;
        }
        if (var3.b((byte) 36)) {
          return var3;
        }
        return null;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (0 != param2) {
          if (null != this.field_v) {
            this.field_v.a(this.field_p + param0, param1 + this.field_n, param2, (byte) 112);
          }
          var5 = 66 % ((param3 - 77) / 34);
          return;
        }
        if (null != this.field_q) {
          this.field_q.a(param0, param1, true, (byte) 99, (qg) (this));
          if (null != this.field_v) {
            this.field_v.a(this.field_p + param0, param1 + this.field_n, param2, (byte) 112);
          }
          var5Lifetime1 = 66 % ((param3 - 77) / 34);
          return;
        }
        if (null != this.field_v) {
          this.field_v.a(this.field_p + param0, param1 + this.field_n, param2, (byte) 112);
        }
        var5Lifetime2 = 66 % ((param3 - 77) / 34);
    }

    static {
        field_t = new int[4];
        field_w = new sh();
        field_u = new rc();
    }
}
