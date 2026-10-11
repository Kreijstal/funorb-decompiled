/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke extends ui implements sg {
    static ag field_W;
    static boolean field_V;
    static boolean[] field_X;
    static bk field_U;
    private int field_T;
    private jm field_S;

    final static int a(int param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -21937) {
            field_X = (boolean[]) null;
          }
          if (0 >= param0) {
            throw new IllegalArgumentException();
          }
          if (tn.a(param0, -3236)) {
            stackIn_6_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 32);
            return stackIn_6_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_11_0 = vj.a((byte) -101, var4, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ke.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void r(int param0) {
        if (param0 <= 123) {
          return;
        }
        super.r(124);
        if (null != this.field_S) {
          this.field_S.c(-11);
        }
    }

    public final jm a(int param0) {
        if (param0 != 35) {
          this.h(-84);
          return this.field_S;
        }
        return this.field_S;
    }

    final void a(jm param0, int param1) {
        if (param1 != 1048576) {
          return;
        }
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ke.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(wh param0, boolean param1, int param2, boolean param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param3) {
            ke.s(-5);
          }
          if (nj.field_e != null) {
            dl.a(param1, param0, -32532, 1048576, param2);
          }
          if (km.field_a == null) {
            return;
          }
          var4 = mj.field_o;
          synchronized (var4) {
            km.field_a.a(param2, true, -1);
            if (param0 == de.field_b) {
              return;
            }
            km.field_a.c((byte) 108);
            mj.field_o.f();
            de.field_b = param0;
            if (de.field_b != null) {
              km.field_a.a(param1, de.field_b, (byte) 2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("ke.S(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          var4_int = param2.length();
          if (param1 != 75) {
            field_U = (bk) null;
          }
          var5 = param3.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (0 > var10) {
              discarded$0 = var8.append(param2.substring(var9));
              stackIn_13_0 = var8.toString();
              return stackIn_13_0;
            }
            discarded$1 = var8.append(param2.substring(var9, var10));
            discarded$2 = var8.append(param3);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ke.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
          super.a(param0, param1, (byte) 62, param3);
          this.field_T = -param1 + (nk.field_w - this.field_u);
          if (param2 <= 49) {
            Random var6 = (Random) null;
            ke.a(-45, -96, (Random) null);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ke.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String h(int param0) {
        if (!this.field_x) {
          return null;
        }
        if (null == this.field_n) {
          return null;
        }
        qh.a(gb.field_e, nk.field_w + (-this.field_T + this.field_v), 1);
        if (param0 == -27867) {
          return this.field_n;
        }
        field_W = (ag) null;
        return this.field_n;
    }

    public static void s(int param0) {
        field_X = null;
        field_U = null;
        if (param0 > -65) {
          field_V = false;
          field_W = null;
          return;
        }
        field_W = null;
    }

    ke(String param0, rm param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_W = new ag();
        field_X = new boolean[35];
    }
}
