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
        if (param0 != 255) {
          field_u = (pa[]) null;
          field_t = null;
          field_s = null;
          field_u = null;
          return;
        } else {
          field_t = null;
          field_s = null;
          field_u = null;
          return;
        }
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
            return this.field_r.get();
        }
        return this.field_r.get();
    }

    mb(Object param0, int param1) {
        super(param1);
        try {
            try {
                this.field_r = new java.lang.ref.SoftReference(param0);
            } catch (RuntimeException runtimeException) {
                throw pn.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(byte param0) {
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
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
                    hr.field_e.a(new oq(hr.field_e, ro.field_r), 0);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              discarded$14 = hr.field_e.a(ik.field_l, true, qo.field_d, true);
              hr.field_e.f((byte) 33);
              if (param0 >= 120) {
                L2: while (true) {
                  if (!ek.a((byte) -127)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    discarded$15 = hr.field_e.a(108, fr.field_e, bk.field_f);
                    continue L2;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "mb.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return false;
        }
        return true;
    }

    static {
        field_t = new String[255];
        field_s = "Quit to website";
    }
}
