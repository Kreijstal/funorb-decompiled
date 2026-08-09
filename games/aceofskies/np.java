/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class np extends hh {
    static String field_e;
    static float[] field_d;

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                np.b(49);
                break L1;
              }
            }
            stackIn_3_0 = ro.a(param2, true, -127, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("np.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        if (param0 != 34066) {
            np.b(-127);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 83 % ((param2 - 18) / 54);
        return bs.a(-1, ci.field_i, -param0 + param1) - -param0;
    }

    final boolean a(byte param0) {
        int var2 = -13 / ((param0 - -11) / 63);
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
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != ij.field_g) {
              if (rg.field_A != param0) {
                if (param0 != gk.field_g) {
                  L1: {
                    if (!param1) {
                      break L1;
                    } else {
                      field_e = (String) null;
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                } else {
                  stackIn_8_0 = 34066;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 34065;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 9216;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("np.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_8_0;
          }
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
