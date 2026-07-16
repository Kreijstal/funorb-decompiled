/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw {
    static hd field_a;
    static String field_e;
    static vn[] field_f;
    static ut[] field_d;
    static int field_c;
    static String field_b;

    final static void b(int param0) {
        ml var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        var1 = or.field_d;
        L0: while (true) {
          if (!tm.b(-16000)) {
            if (param0 != 5) {
              field_c = 84;
              return;
            } else {
              return;
            }
          } else {
            var1.b(8, (byte) 94);
            int fieldTemp$2 = var1.field_n + 1;
            var1.field_n = var1.field_n + 1;
            var2 = fieldTemp$2;
            mo.a(var1, 0);
            or.field_d.c(param0 ^ 59, -var2 + var1.field_n);
            continue L0;
          }
        }
    }

    final static String a(int param0, byte param1, iw param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param2.f(-32768);
              if (param0 < var3_int) {
                var3_int = param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -68) {
                break L2;
              } else {
                gw.c(-32);
                break L2;
              }
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + os.field_I.a(param2.field_n, var4, var3_int, param2.field_f, 0, false);
            var5 = hf.a((byte) -121, var3_int, 0, var4);
            stackOut_5_0 = (String) var5;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_6_0;
    }

    public static void d(int param0) {
        field_e = null;
        int var1 = -113 / ((-15 - param0) / 44);
        field_f = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void c(int param0) {
        if (param0 != 0) {
            gw.b(-31);
            np.field_Jb.a((gn) (Object) new no(), 3);
            return;
        }
        np.field_Jb.a((gn) (Object) new no(), 3);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ut[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Kickabout.field_G;
          if (param5 == null) {
            break L0;
          } else {
            if (param3 > 0) {
              var6 = param5[0].field_o;
              if (param1 != -27981) {
                field_d = null;
                var7 = param5[2].field_o;
                var8 = param5[1].field_o;
                param5[0].d(param2, param0, param4);
                param5[2].d(-var7 + param2 - -param3, param0, param4);
                on.a(vi.field_q);
                on.h(param2 - -var6, param0, param2 - (-param3 + var7), param5[1].field_v + param0);
                var9 = param2 + var6;
                var10 = param3 + (param2 + -var7);
                param2 = var9;
                L1: while (true) {
                  if (var10 <= param2) {
                    on.b(vi.field_q);
                    return;
                  } else {
                    param5[1].d(param2, param0, param4);
                    param2 = param2 + var8;
                    continue L1;
                  }
                }
              } else {
                var7 = param5[2].field_o;
                var8 = param5[1].field_o;
                param5[0].d(param2, param0, param4);
                param5[2].d(-var7 + param2 - -param3, param0, param4);
                on.a(vi.field_q);
                on.h(param2 - -var6, param0, param2 - (-param3 + var7), param5[1].field_v + param0);
                var9 = param2 + var6;
                var10 = param3 + (param2 + -var7);
                param2 = var9;
                L2: while (true) {
                  if (var10 <= param2) {
                    on.b(vi.field_q);
                    return;
                  } else {
                    param5[1].d(param2, param0, param4);
                    param2 = param2 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0) {
        fb.field_J = new bo(tv.field_e, ai.field_H, hl.field_f, dw.field_e, (hd) (Object) hs.field_d, ul.field_c);
        if (param0 != 8) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new vn[5];
        field_e = "Cancel rematch";
        field_b = "You";
    }
}
