/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq implements Runnable {
    volatile boolean field_b;
    volatile boolean field_a;
    tg field_c;
    volatile tj[] field_d;
    static int field_e;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        tj var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            ((aq) this).field_b = true;
            try {
              L1: {
                L2: while (true) {
                  if (((aq) this).field_a) {
                    ((aq) this).field_b = false;
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (var1_int >= 2) {
                        wj.a(-128, 10L);
                        var5 = null;
                        kq.a(-4317, ((aq) this).field_c, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = ((aq) this).field_d[var1_int];
                          if (var2 != null) {
                            var2.c();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var1 = (Exception) (Object) decompiledCaughtException;
                var6 = null;
                rk.a((String) null, (Throwable) (Object) var1, 96);
                ((aq) this).field_b = false;
                break L5;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              ((aq) this).field_b = false;
              throw aq.<RuntimeException>$cfr$sneakyThrow(var3);
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, field_z);
        }
    }

    aq() {
        ((aq) this).field_d = new tj[2];
        ((aq) this).field_a = false;
        ((aq) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "aq.run()";
        field_e = 98;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
