/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends me {
    static volatile boolean field_j;
    static String field_o;
    static int[] field_n;
    static ci field_k;
    private String field_m;
    private boolean field_l;

    public static void h(int param0) {
        if (param0 > 117) {
          field_n = null;
          field_o = null;
          field_k = null;
          return;
        }
        li.h(106);
        field_n = null;
        field_o = null;
        field_k = null;
    }

    final String b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        uj var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.g(7);
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = da.a(true, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_m)) {
            var4 = vl.a(42, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_b != null) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
            this.field_l = var4.field_f;
            this.field_m = param1;
          }
          if (this.field_l) {
            stackIn_16_0 = lf.field_e;
            return stackIn_16_0;
          }
          stackIn_14_0 = gb.field_e;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("li.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static ec a(boolean param0, String param1, int param2) {
        nl var3 = null;
        RuntimeException var3_ref = null;
        ec stackIn_2_0 = null;
        nl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new nl();
          if (param0) {
            stackIn_2_0 = (ec) null;
            return stackIn_2_0;
          }
          ((ec) ((Object) var3)).field_a = param1;
          ((ec) ((Object) var3)).field_e = param2;
          stackIn_4_0 = var3;
          return (ec) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("li.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    li(rg param0) {
        super(param0);
        this.field_l = false;
    }

    final rc a(int param0, String param1) {
        uj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rc stackIn_3_0 = null;
        rc stackIn_11_0 = null;
        rc stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!ck.a(var4, (byte) -114)) {
            stackIn_3_0 = ec.field_d;
            return stackIn_3_0;
          }
          if (param0 != 95) {
            field_k = (ci) null;
          }
          if (!param1.equals(this.field_m)) {
            var3 = vl.a(param0 - 53, param1);
            if (var3 != null &&
              var3.field_b == null) {
              this.field_l = var3.field_f;
              this.field_m = param1;
            } else {
              stackIn_11_0 = fi.field_u;
              return stackIn_11_0;
            }
          }
          if (this.field_l) {
            stackIn_16_0 = hi.field_b;
          } else {
            stackIn_16_0 = ec.field_d;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("li.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int a(int param0, Random param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (nd.a((byte) -106, param0)) {
            stackIn_6_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_6_0;
          }
          var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
          do {
            var4 = param1.nextInt();
          } while (var3_int <= var4);
          if (!param2) {
            stackIn_13_0 = ic.a(param0, (byte) -70, var4);
            return stackIn_13_0;
          }
          stackIn_11_0 = -58;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("li.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var2 = 73 / ((param0 - 9) / 61);
        this.field_m = null;
    }

    static {
        field_n = new int[]{0, 0, 1, 2, 4, 8, 15, 24, 36, 50, 50, 50, 50};
        field_j = false;
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
