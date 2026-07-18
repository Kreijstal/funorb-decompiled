/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static byte[][] field_a;

    final static void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        faa var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = dpa.field_p;
              var3.h(24335, param2);
              var3.c(0, 3);
              var3.c(0, 9);
              var3.a(param0, true);
              if (param1 == -1) {
                break L1;
              } else {
                String discarded$2 = sh.a((String) null, (String) null, (String) null, -75);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) (Object) runtimeException, "sh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = VoidHunters.field_G;
          if (param3 == 0) {
            break L0;
          } else {
            sh.a((byte) -13);
            break L0;
          }
        }
        var4_int = param2.indexOf(param1);
        L1: while (true) {
          L2: {
            L3: {
              if (-1 == var4_int) {
                break L3;
              } else {
                param2 = param2.substring(0, var4_int) + param0 + param2.substring(param1.length() + var4_int);
                stackOut_5_0 = (String) param2;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  var4_int = ((String) (Object) stackIn_6_0).indexOf(param1, var4_int - -param0.length());
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_7_0 = (String) param2;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          }
          return stackIn_8_0;
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        pd var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 20824) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            if (null != rb.field_c) {
              var1 = (pd) (Object) rb.field_c.d(0);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var1) {
                      break L4;
                    } else {
                      if (var2 != 0) {
                        break L3;
                      } else {
                        L5: {
                          int fieldTemp$2 = var1.field_d;
                          var1.field_d = var1.field_d - 1;
                          if (fieldTemp$2 != 0) {
                            break L5;
                          } else {
                            var1.b(param0 ^ -24158);
                            break L5;
                          }
                        }
                        var1 = (pd) (Object) rb.field_c.a((byte) 12);
                        if (var2 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) (Object) runtimeException, "sh.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < 43) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sh.B(" + param0 + ')');
        }
    }

    static {
    }
}
