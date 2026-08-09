/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wf {
    static long field_i;
    static char[] field_e;
    static int[] field_g;
    static boolean field_h;
    static gk field_f;

    private te() throws Throwable {
        throw new Error();
    }

    final static cp a(byte[] param0, int param1) {
        cp var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        cp stackIn_5_0 = null;
        cp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new cp(param0, lh.field_a, lg.field_j, ji.field_b, ee.field_e, ud.field_e, fk.field_a);
              if (param1 <= -75) {
                kf.f(1);
                stackIn_7_0 = (cp) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (cp) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("te.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cp) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        try {
            io.field_c.a(0);
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                pn.field_b[var1_int] = 0L;
            }
            if (param0 < 31) {
                field_e = (char[]) null;
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                ob.field_c[var1_int] = 0L;
            }
            eu.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "te.D(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            int var2 = 0;
            Throwable var3 = null;
            var2 = 112 % ((param1 - 8) / 34);
            try {
              L0: {
                fe.a("resizing", -15201, new Object[]{new Integer(param0)}, bm.m(110));
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          if (null != ft.field_l) {
            ft.field_l.a(1);
            ft.field_l = null;
            return;
          } else {
            return;
          }
        } else {
          field_i = -60L;
          if (null == ft.field_l) {
            return;
          } else {
            ft.field_l.a(1);
            ft.field_l = null;
            return;
          }
        }
    }

    static {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
