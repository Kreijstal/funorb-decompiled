/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uda {
    static String field_c;
    static int field_b;
    pf field_d;
    static String field_a;

    abstract void a(int param0, int param1, int param2);

    void a(boolean param0) {
        if (!param0) {
            this.d(-18);
        }
    }

    abstract void b(int param0, boolean param1);

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            if (!po.field_o) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              nma.field_b = new da[5];
              var1_int = 0;
              L1: while (true) {
                if (nma.field_b.length <= var1_int) {
                  nkb.a(false, "Finished building fonts");
                  if (param0 == -2283) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    uda.b((byte) 81);
                    return;
                  }
                } else {
                  nma.field_b[var1_int] = og.field_r.a(ok.field_b[var1_int], djb.field_s[var1_int], smb.a((byte) -26, var1_int));
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "uda.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, boolean param1);

    void c(int param0) {
        if (param0 != 5) {
            this.a(-37);
        }
    }

    abstract void a(int param0);

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -6) {
            uda.b(-56);
            field_c = null;
            return;
        }
        field_c = null;
    }

    void b(boolean param0) {
        if (!param0) {
            field_b = -18;
        }
    }

    void c(byte param0) {
        if (param0 != 15) {
            field_c = (String) null;
        }
    }

    abstract boolean a(byte param0);

    abstract void a(byte param0, int param1, ura param2);

    uda(pf param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    void d(int param0) {
        if (param0 != 8) {
            this.a(-80, -4, -126);
        }
    }

    static {
        field_b = 8;
        field_a = "Players";
        field_c = "Add <%0> to ignore list";
    }
}
