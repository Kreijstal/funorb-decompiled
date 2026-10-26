/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class np extends hh {
    static String field_e;
    static float[] field_d;

    final static int a(CharSequence param0, int param1, int param2) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 4) {
            np.b(49);
          }
          int stackIn_3_0 = ro.a(param2, true, -127, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("np.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 34066) {
          np.b(-127);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 83 % ((param2 - 18) / 54);
        return bs.a(-1, ci.gameRandom, -param0 + param1) + param0;
    }

    final boolean a(byte param0) {
        int var2 = -13 / ((param0 + 11) / 63);
        return true;
    }

    final void a(int param0, int param1, rt param2) {
        if (param1 != -1486691000) {
          return;
        }
        try {
          this.field_a.a(param2, 1);
          this.field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "np.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -65) {
          this.b((byte) 7);
        }
    }

    final static int a(nf param0, boolean param1) {
        String stackIn_15_2 = null;
        try {
          if (param0 == ij.field_g) {
            int stackIn_2_0 = 9216;
            return stackIn_2_0;
          }
          if (rg.field_A == param0) {
            int stackIn_5_0 = 34065;
            return stackIn_5_0;
          }
          if (param0 == ResourceArchive.field_g) {
            int stackIn_8_0 = 34066;
            return stackIn_8_0;
          }
          if (param1) {
            field_e = (String) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("np.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (param0 <= 5) {
          field_e = (String) null;
          this.field_a.a((byte) -126, false);
          return;
        }
        this.field_a.a((byte) -126, false);
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
          field_d = (float[]) null;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 9216) {
          CharSequence var2 = (CharSequence) null;
          np.a((CharSequence) null, 73, 16);
        }
    }

    np(wl param0) {
        super(param0);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          field_d = (float[]) null;
          this.field_a.a((byte) -126, true);
          return;
        }
        this.field_a.a((byte) -126, true);
    }

    static {
        field_e = "menu_mouseover";
        field_d = new float[4];
    }
}
