/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf {
    static int field_e;
    static int field_b;
    static ci field_f;
    static int field_c;
    long field_g;
    uf field_a;
    uf field_d;

    public static void b(int param0) {
        field_f = null;
        if (param0 == 71) {
            return;
        }
        uf.b(75);
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -21) {
          uf.a(55, -98);
          if (null != ((uf) this).field_a) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (null == ((uf) this).field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        uf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        eg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (eg) (Object) ic.field_s.d(param0 + -11568);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var2 = vc.field_g.d(param0 ^ 30032);
                  if (param0 == 20840) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    eb.a(param1, (byte) 125);
                    var2 = vc.field_g.e((byte) -119);
                    continue L3;
                  }
                }
              } else {
                qc.a(param1, var4, (byte) -110);
                var4 = (eg) (Object) ic.field_s.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2_ref, "uf.JB(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        if (((uf) this).field_a == null) {
          return;
        } else {
          ((uf) this).field_a.field_d = ((uf) this).field_d;
          ((uf) this).field_d.field_a = ((uf) this).field_a;
          if (param0 != 12) {
            return;
          } else {
            ((uf) this).field_d = null;
            ((uf) this).field_a = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 71;
    }
}
