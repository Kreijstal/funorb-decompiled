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
        ij[] var2 = null;
        int var3 = 0;
        ij var4 = null;
        mk var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var2 = new ij[param1.b(2)];
        var3 = param0;
        var4 = (ij) (Object) param1.a(true);
        L0: while (true) {
          if (var4 == null) {
            return var2;
          } else {
            var4.field_i = var3;
            var3++;
            var2[var3] = var4;
            var5 = (mk) (Object) var4.field_k.a(true);
            L1: while (true) {
              if (var5 == null) {
                var4 = (ij) (Object) param1.f(2);
                continue L0;
              } else {
                L2: while (true) {
                  if (null == var5.field_k.field_m) {
                    L3: {
                      if (var5.field_k == var4) {
                        var5.b((byte) -121);
                        break L3;
                      } else {
                        if (var5.field_k.field_r != var4) {
                          var5.field_k.field_r = var4;
                          var5.field_k.field_t = var5;
                          break L3;
                        } else {
                          if (var5.field_k.field_t.field_i < var5.field_i) {
                            var5.b((byte) -126);
                            break L3;
                          } else {
                            var5.field_k.field_t.b((byte) -124);
                            var5.field_k.field_t = var5;
                            break L3;
                          }
                        }
                      }
                    }
                    var5 = (mk) (Object) var4.field_k.f(param0 ^ 2);
                    continue L1;
                  } else {
                    var5.field_k = var5.field_k.field_m;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 0) {
            Object var2 = null;
            sa.a((byte) 48, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        pf.field_m = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        var4 = -1L;
        if (param0 <= 83) {
          return;
        } else {
          te.a(var2, var4, param1, var3, 1000);
          return;
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        if (param0 != 68) {
            Object var3 = null;
            sa.a((byte) 6, (java.applet.Applet) null);
            og.field_b = param1;
            return;
        }
        og.field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
        field_c = 65;
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
