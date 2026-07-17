/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ka {
    static tg field_e;
    static mp field_c;
    static String[] field_d;

    final static void a(int param0, byte param1) {
        dj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            kr.field_c = param0;
            var2 = (dj) (Object) jf.field_c.b(81);
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  if (null != s.field_u) {
                    var2 = (dj) (Object) s.field_u.b(67);
                    L3: while (true) {
                      if (var2 == null) {
                        break L2;
                      } else {
                        L4: {
                          if (var2.field_k.a(false)) {
                            var2.field_q.f(128 + kr.field_c * var2.field_p >> 8);
                            break L4;
                          } else {
                            var2.b(false);
                            break L4;
                          }
                        }
                        var2 = (dj) (Object) s.field_u.d((byte) 18);
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L5: {
                  if (!var2.field_k.a(false)) {
                    var2.b(false);
                    break L5;
                  } else {
                    var2.field_q.f(128 + var2.field_p * kr.field_c >> 8);
                    break L5;
                  }
                }
                var2 = (dj) (Object) jf.field_c.d((byte) 18);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "lf.E(" + param0 + 44 + -58 + 41);
        }
    }

    final static void b() {
        mf[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        mf var3 = null;
        int var4 = 0;
        mf[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = fh.field_n;
            var1 = var5;
            var2 = 0;
            L1: while (true) {
              if (var2 >= var5.length) {
                break L0;
              } else {
                var3 = var5[var2];
                io.a(109, var3);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1_ref, "lf.C(" + -128 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_d = null;
    }

    lf(fr param0) {
        try {
            jq discarded$0 = new jq((fk) null, 5126, 3, 0);
            jq discarded$1 = new jq((fk) null, 5126, 2, 0);
            jq discarded$2 = new jq((fk) null, 5126, 3, 0);
            jq discarded$3 = new jq((fk) null, 5121, 4, 0);
            ke discarded$4 = new ke();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        tt.field_l = param1;
        if (!(null == qc.field_e)) {
            qc.field_e.b(param1, true);
        }
        if (qr.field_b != null) {
            qr.field_b.a((byte) -43, param1);
        }
    }

    final static boolean b(int param0) {
        return td.field_u > 250;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new tg();
        field_d = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_c = new mp();
    }
}
