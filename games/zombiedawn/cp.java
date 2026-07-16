/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp implements Runnable {
    ec field_b;
    volatile boolean field_a;
    volatile boolean field_d;
    volatile qf[] field_c;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        qf var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            ((cp) this).field_a = true;
            try {
              L1: {
                L2: while (true) {
                  if (((cp) this).field_d) {
                    ((cp) this).field_a = false;
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (var1_int >= 2) {
                        ld.a(10L, (byte) 101);
                        var5 = null;
                        an.a(0, ((cp) this).field_b, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = ((cp) this).field_c[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.g();
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
                ae.a((Throwable) (Object) var1, 10331, (String) null);
                ((cp) this).field_a = false;
                break L5;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              ((cp) this).field_a = false;
              throw cp.<RuntimeException>$cfr$sneakyThrow(var3);
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, field_z);
        }
    }

    cp() {
        ((cp) this).field_c = new qf[2];
        ((cp) this).field_d = false;
        ((cp) this).field_a = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "cp.run()";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
