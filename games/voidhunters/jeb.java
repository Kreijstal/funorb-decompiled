/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jeb extends mfb {
    static Random field_b;
    static int[] field_c;

    final int c(int param0) {
        if (param0 != 0) {
          this.a(true);
          return ava.field_a;
        }
        return ava.field_a;
    }

    final int b(int param0) {
        int var2 = 63 % ((7 - param0) / 47);
        return rlb.field_e;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
          return false;
        }
        return false;
    }

    final int a(int param0) {
        if (param0 != 0) {
          field_b = (Random) null;
          return m.field_p;
        }
        return m.field_p;
    }

    final int a(byte param0) {
        int var2 = -96 / ((-48 - param0) / 43);
        return mq.field_j;
    }

    final int f(byte param0) {
        if (param0 < 0) {
          return 34;
        }
        return oq.field_a;
    }

    final int k(int param0) {
        if (param0 != 0) {
          this.k(108);
          return 6;
        }
        return 6;
    }

    final int a(boolean param0) {
        if (param0) {
          this.h((byte) 61);
          return 71;
        }
        return 71;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
          return -93;
        }
        return jj.field_o;
    }

    final int b(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          jeb.a(31, (int[]) null, 36L, (String) null, (byte) 17);
          return r.field_k;
        }
        return r.field_k;
    }

    jeb() {
    }

    public static void i(byte param0) {
        field_c = null;
        int var1 = 29 % ((14 - param0) / 44);
        field_b = null;
    }

    final static boolean a(int param0, int[] param1, long param2, String param3, byte param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -3) {
            field_b = (Random) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null && (param0 != 2 ||
            ira.a(param2, param3, 41))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jeb.C(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final int g(byte param0) {
        if (param0 >= -12) {
          field_c = (int[]) null;
          return cp.field_f;
        }
        return cp.field_f;
    }

    static {
        field_b = new Random();
    }
}
