/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static ab field_g;
    int field_i;
    String field_f;
    String field_b;
    String field_e;
    sh field_d;
    static String field_h;
    static int field_c;

    final static ij[] a(int param0, ng param1) {
        int incrementValue$0 = 0;
        ij[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ij var4 = null;
        mk var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2 = new ij[param1.b(2)];
            var3 = param0;
            var4 = (ij) ((Object) param1.a(true));
            L1: while (true) {
              if (null == var4) {
                stackIn_17_0 = (ij[]) (var2);
                break L0;
              } else {
                var4.field_i = var3;
                incrementValue$0 = var3;
                var3++;
                var2[incrementValue$0] = var4;
                var5 = (mk) ((Object) var4.field_k.a(true));
                L2: while (true) {
                  if (var5 == null) {
                    var4 = (ij) ((Object) param1.f(2));
                    continue L1;
                  } else {
                    L3: while (true) {
                      if (null == var5.field_k.field_m) {
                        L4: {
                          if (var5.field_k == var4) {
                            var5.b((byte) -121);
                            break L4;
                          } else {
                            if (var5.field_k.field_r != var4) {
                              var5.field_k.field_r = var4;
                              var5.field_k.field_t = var5;
                              break L4;
                            } else {
                              if (var5.field_k.field_t.field_i < var5.field_i) {
                                var5.b((byte) -126);
                                break L4;
                              } else {
                                var5.field_k.field_t.b((byte) -124);
                                var5.field_k.field_t = var5;
                                break L4;
                              }
                            }
                          }
                        }
                        var5 = (mk) ((Object) var4.field_k.f(param0 ^ 2));
                        continue L2;
                      } else {
                        var5.field_k = var5.field_k.field_m;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2_ref);

            stackIn_20_1 = new StringBuilder().append("sa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 0) {
            String var2 = (String) null;
            sa.a((byte) 48, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        pf.field_m = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param0 <= 83) {
            return;
        }
        try {
            te.a(var2, var4, param1, var3, 1000);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 68) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                sa.a((byte) 6, (java.applet.Applet) null);
            }
            og.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Email (Login):";
        field_c = 65;
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
