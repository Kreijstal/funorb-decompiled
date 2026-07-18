/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int field_g;
    static String field_c;
    static int field_a;
    private jj field_f;
    static tf field_e;
    private rh field_d;
    private rh field_b;

    final og a(byte param0, int param1) {
        og var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var3 = (og) ((di) this).field_f.a((byte) 106, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            var4 = 3 % ((param0 - 57) / 42);
            if (param1 >= 32768) {
              var5 = ((di) this).field_b.a(1, -28153, 32767 & param1);
              break L0;
            } else {
              var5 = ((di) this).field_d.a(1, -28153, param1);
              break L0;
            }
          }
          L1: {
            var3 = new og();
            if (var5 != null) {
              var3.a(0, new qc(var5));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 >= 32768) {
              var3.f((byte) 119);
              break L2;
            } else {
              break L2;
            }
          }
          ((di) this).field_f.a(-126, (long)param1, (Object) (Object) var3);
          return var3;
        }
    }

    public static void a(byte param0) {
        int var1 = -52;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        hf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        wc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (wc) (Object) l.field_g.g(param1 ^ param1);
            L1: while (true) {
              if (var4 == null) {
                var2 = qa.field_e.g(0);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    gf.a(6, 125);
                    var2 = qa.field_e.d(1);
                    continue L2;
                  }
                }
              } else {
                o.a(6, var4, param1 + -21718);
                var4 = (wc) (Object) l.field_g.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "di.B(" + 6 + ',' + param1 + ')');
        }
    }

    private di() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "Create";
    }
}
