/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ug {
    static le[][][] field_f;
    int field_g;
    byte[] field_h;
    long field_e;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -((param2 - param3) * (param5 - param0)) + (param1 + -param8) * (-param6 + param7);
        if (!(0 != var9)) {
            return false;
        }
        int var10 = -(param6 * param2) + param7 * param3;
        int var11 = -param6 + param7;
        int var12 = param2 - param3;
        int var13 = param8 * param5 - param0 * param1;
        int var14 = -param0 + param5;
        int var15 = -param8 + param1;
        ll.field_a = (var10 * var14 + -(var11 * var13)) / var9;
        ok.field_b = (-(var12 * var13) + var10 * var15) / var9;
        return true;
    }

    public static void a(int param0) {
        field_f = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 17) {
                var1_int = -1;
                var2 = 1;
                L2: while (true) {
                  if (var2 >= 17) {
                    var2 = 16;
                    var3 = 1;
                    L3: while (true) {
                      if (var2 >= 32) {
                        break L0;
                      } else {
                        hh.field_n[var2] = new gb(pe.field_d[var3], 240.0f, (float)(var3 * 30), 2.0f);
                        var3++;
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    hh.field_n[var2 + -1] = new gb(pe.field_d[-1 + var2], pe.field_d[var2], 30.0f);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                pe.field_d[var1_int] = new wg(320.0f, (float)(-(var1_int * 2)));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "nh.D(" + 62 + ')');
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            var1_int = 0;
            for (var2 = 1; var2 < 17; var2++) {
                pe.field_d[var2].field_f[0] = 0.0f;
                pe.field_d[var2].field_f[1] = pe.field_d[var2].field_f[1] + 8.0f;
                pe.field_d[var2].e(-85);
            }
            for (var1_int = 0; 3 > var1_int; var1_int++) {
                var2 = (1 & var1_int) != 0 ? 0 : 15;
                var3 = (1 & var1_int) == 0 ? -1 : 16;
                var4 = (1 & var1_int) != 0 ? 1 : -1;
                var5 = var2;
                while (var3 != var5) {
                    hh.field_n[var5].c((byte) 122);
                    var5 = var5 + var4;
                }
            }
            pe.field_d[0].field_e[1] = 0.0f;
            pe.field_d[0].field_e[0] = 240.0f;
            pe.field_d[0].field_i[0] = 240.0f;
            pe.field_d[0].field_i[1] = 0.0f;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "nh.E(" + 107 + ')');
        }
    }

    nh(long param0, int param1, byte[] param2) {
        try {
            ((nh) this).field_e = param0;
            ((nh) this).field_g = param1;
            ((nh) this).field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "nh.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            oa.field_I = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            if (param0 <= 30) {
                field_f = null;
            }
            var4 = -1L;
            wg.a(var2, param1, var3, -26372, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "nh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new le[2][5][];
    }
}
