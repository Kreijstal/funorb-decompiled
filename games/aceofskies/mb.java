/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends he {
    static String[] field_t;
    static String field_s;
    static int field_q;
    static pa[] field_u;
    private java.lang.ref.SoftReference field_r;

    public static void g(int param0) {
        field_t = null;
        field_s = null;
        field_u = null;
    }

    final static void a(int param0, int param1, byte param2) {
        ri.field_a = param1;
        if (param2 < 22) {
            mb.a(127, -101, (byte) 75);
            md.field_o = param0;
            return;
        }
        md.field_o = param0;
    }

    final Object a(byte param0) {
        if (param0 != 74) {
            mb.a(69, -77, (byte) 76);
            return ((mb) this).field_r.get();
        }
        return ((mb) this).field_r.get();
    }

    mb(Object param0, int param1) {
        super(param1);
        try {
            try {
                ((mb) this).field_r = new java.lang.ref.SoftReference(param0);
            } catch (RuntimeException runtimeException) {
                throw pn.a((Throwable) (Object) runtimeException, "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!bo.a((byte) 102)) {
              L1: {
                if (null == jf.field_a) {
                  break L1;
                } else {
                  if (!jf.field_a.field_b) {
                    break L1;
                  } else {
                    tt.b(-32546);
                    hr.field_e.a((ea) (Object) new oq(hr.field_e, ro.field_r), 0);
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$7 = hr.field_e.a(ik.field_l, true, qo.field_d, true);
              hr.field_e.f((byte) 33);
              L2: while (true) {
                if (!ek.a((byte) -127)) {
                  break L0;
                } else {
                  boolean discarded$8 = hr.field_e.a(108, fr.field_e, bk.field_f);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "mb.F(" + 125 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[255];
        field_s = "Quit to website";
    }
}
