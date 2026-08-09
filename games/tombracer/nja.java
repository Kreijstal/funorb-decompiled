/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nja extends fqa {
    static int field_L;
    static iu[] field_K;
    static cn field_J;

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_K = (iu[]) null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        rh var5 = null;
        fsa stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            if (param1 == 3) {
              var4.b((byte) -11, this.field_k, this.field_l);
              var5 = new rh(param2, param0);
              this.a(var5, (byte) -92);
              var4.a((byte) 83, (nv) (var5));
              stackIn_4_0 = (fsa) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fsa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("nja.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int B(int param0) {
        if (param0 != 31609) {
            this.n((byte) 84);
            return 3;
        }
        return 3;
    }

    public static void f(boolean param0) {
        field_K = null;
        field_J = null;
        if (param0) {
            field_L = 33;
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            if (param0) {
                field_K = (iu[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nja.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -122;
        }
        return 5;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return true;
    }

    nja(la param0, int param1) {
        super(param0, param1);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_K = (iu[]) null;
            return false;
        }
        return false;
    }

    nja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            return false;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
    }
}
