/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends hf {
    static String field_f;
    int field_g;
    static dm field_h;
    static rh field_i;
    static boolean field_j;
    int field_k;

    public static void b(int param0) {
        field_f = null;
        field_h = null;
        field_i = null;
    }

    final static void b(int param0, int param1) {
        pk var2 = fj.field_q;
        var2.a(param1, (byte) -66);
        var2.d((byte) 124, 1);
        var2.d((byte) 127, 2);
        if (param0 >= -65) {
            re.b(116, -127);
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var1 = (Object) (Object) je.field_j;
            synchronized (var1) {
              L1: {
                L2: {
                  vd.field_n = pc.field_p;
                  nk.field_e = nk.field_e + 1;
                  if (ii.field_c < 0) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (var5 >= 112) {
                        ii.field_c = gk.field_b;
                        break L2;
                      } else {
                        kj.field_o[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (gk.field_b == ii.field_c) {
                        break L2;
                      } else {
                        var2 = gf.field_c[gk.field_b];
                        gk.field_b = 1 + gk.field_b & 127;
                        if (var2 < 0) {
                          kj.field_o[~var2] = false;
                          continue L4;
                        } else {
                          kj.field_o[var2] = true;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                pc.field_p = ba.field_c;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "re.C(" + true + ')');
        }
    }

    private re() throws Throwable {
        throw new Error();
    }

    static {
    }
}
