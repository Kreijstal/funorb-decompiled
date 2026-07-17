/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static byte[][] field_a;

    final static void a(int param0, int param1, int param2) {
        faa var3 = null;
        Object var4 = null;
        var3 = dpa.field_p;
        var3.h(24335, 11);
        var3.c(0, 3);
        var3.c(0, 9);
        var3.a(param0, true);
        if (param1 != -1) {
          var4 = null;
          String discarded$2 = sh.a((String) null, (String) null, (String) null, -75);
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        var5 = VoidHunters.field_G;
        sh.a((byte) -13);
        var4 = param2.indexOf(param1);
        L0: while (true) {
          L1: {
            L2: {
              if (-1 == var4) {
                break L2;
              } else {
                param2 = param2.substring(0, var4) + param0 + param2.substring(param1.length() + var4);
                stackOut_2_0 = (String) param2;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var4 = ((String) (Object) stackIn_3_0).indexOf(param1, var4 - -param0.length());
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_4_0 = (String) param2;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          }
          return stackIn_5_0;
        }
    }

    final static void a(int param0) {
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            if (null != rb.field_c) {
              var1 = (pd) (Object) rb.field_c.d(0);
              L1: while (true) {
                if (var1 == null) {
                  break L0;
                } else {
                  if (var2 == 0) {
                    L2: {
                      int fieldTemp$4 = var1.field_d;
                      var1.field_d = var1.field_d - 1;
                      if (fieldTemp$4 != 0) {
                        break L2;
                      } else {
                        var1.b(-3846);
                        break L2;
                      }
                    }
                    var1 = (pd) (Object) rb.field_c.a((byte) 12);
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1_ref, "sh.D(" + 20824 + 41);
        }
    }

    public static void a(byte param0) {
    }

    static {
    }
}
