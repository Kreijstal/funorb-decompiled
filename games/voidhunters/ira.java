/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends mfb {
    static lkb field_b;
    static java.awt.Frame field_c;

    ira() {
    }

    final boolean h(byte param0) {
        if (param0 <= 18) {
          this.a(false);
          return false;
        }
        return false;
    }

    final int b(boolean param0) {
        if (param0) {
          return 72;
        }
        return qh.field_J;
    }

    final int a(boolean param0) {
        if (param0) {
          field_b = (lkb) null;
          return 41;
        }
        return 41;
    }

    final int b(int param0) {
        int var2 = -55 / ((7 - param0) / 47);
        return ljb.field_o;
    }

    final int f(byte param0) {
        if (param0 < 0) {
          field_c = (java.awt.Frame) null;
          return fja.field_o;
        }
        return fja.field_o;
    }

    final boolean e(int param0) {
        int var2 = -111 / ((param0 - 54) / 54);
        return true;
    }

    public static void l(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 17036) {
          String var2 = (String) null;
          ira.a(25L, (String) null, -89);
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
          this.c((byte) -16);
          return eg.field_o;
        }
        return eg.field_o;
    }

    final int g(byte param0) {
        if (param0 > -12) {
          this.d((byte) -91);
          return nob.field_p;
        }
        return nob.field_p;
    }

    final int k(int param0) {
        if (param0 != 0) {
          return -72;
        }
        return 3;
    }

    final int c(byte param0) {
        int var2 = -86 % ((param0 - 75) / 46);
        return upb.field_a;
    }

    final static boolean a(long param0, String param1, int param2) {
        vu var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = di.a(param1, 0);
          if (param2 != 41) {
            var5 = (String) null;
            ira.a(1L, (String) null, 31);
          }
          if (var4 != null &&
            null != var4.field_Ab) {
            return true;
          }
          stackIn_11_0 = (null != lqa.field_o) && (null != pjb.a(param0, true));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("ira.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int g(int param0) {
        if (param0 != 2769) {
          return 6;
        }
        return uh.field_q;
    }

    final boolean h(int param0) {
        if (param0 != -2291) {
          field_b = (lkb) null;
          return true;
        }
        return true;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
          field_b = (lkb) null;
          return mqa.field_s;
        }
        return mqa.field_s;
    }

    final int c(int param0) {
        if (param0 != 0) {
          return -95;
        }
        return asa.field_e;
    }

    final int a(byte param0) {
        int var2 = 106 % ((param0 + 48) / 43);
        return 1;
    }

    static {
        field_b = new lkb();
    }
}
