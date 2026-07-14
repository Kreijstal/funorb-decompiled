/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends r {
    static fk field_E;
    static volatile int field_G;
    static vn field_D;
    int field_F;
    static String field_H;

    public md() {
        super(0, 0, 0, 0, (db) null, (wn) null);
        ((md) this).field_F = 256;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1051710561;
        if (param0 != 127) {
          md.l(60);
          param1 = param1 | param1 >>> 1757938562;
          param1 = param1 | param1 >>> 1227445252;
          param1 = param1 | param1 >>> 1114085768;
          param1 = param1 | param1 >>> 1332124592;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 1757938562;
          param1 = param1 | param1 >>> 1227445252;
          param1 = param1 | param1 >>> 1114085768;
          param1 = param1 | param1 >>> 1332124592;
          return 1 + param1;
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            Exception exception = null;
            java.net.URL var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = new java.net.URL(param0.getCodeBase(), param2);
                            var3 = sh.a((byte) 95, param0, var3);
                            th.a(true, true, param0, var3.toString());
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 >= -91) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        field_H = null;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    md(hm param0) {
        super(param0.field_k, param0.field_j, param0.field_g, param0.field_x, (db) null, (wn) null);
        param0.a(((md) this).field_g, 0, 0, true, ((md) this).field_x);
        ((md) this).field_C = param0;
        ((md) this).field_F = 256;
    }

    public static void l(int param0) {
        int var1 = -26 / ((param0 - -6) / 58);
        field_D = null;
        field_E = null;
        field_H = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ed var6 = null;
        if (param2 == 0) {
          if (null != ((md) this).field_C) {
            if (((md) this).field_F != 0) {
              if ((((md) this).field_F ^ -1) != -257) {
                var6 = new ed(((md) this).field_C.field_g, ((md) this).field_C.field_x);
                eo.a(var6, (byte) -105);
                ((md) this).field_C.a(0, (byte) 91, param2, 0);
                if (param1 < 85) {
                  field_H = null;
                  dl.a((byte) 107);
                  var6.d(((md) this).field_k + param3, ((md) this).field_j + param0, ((md) this).field_F);
                  return;
                } else {
                  dl.a((byte) 107);
                  var6.d(((md) this).field_k + param3, ((md) this).field_j + param0, ((md) this).field_F);
                  return;
                }
              } else {
                ((md) this).field_C.a(((md) this).field_j + param0, (byte) 95, param2, ((md) this).field_k + param3);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new fk(3);
        field_G = 0;
    }
}
