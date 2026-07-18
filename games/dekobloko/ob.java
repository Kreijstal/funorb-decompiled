/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fm {
    private String field_h;
    static int field_g;
    static String field_l;
    static ud field_n;
    private String field_m;
    static ck[][][] field_j;
    static boolean field_k;
    static nk field_i;

    final static jg b(byte param0) {
        int var1 = 0;
        return new jg(f.a(116), em.b((byte) -126));
    }

    final void a(wl param0, byte param1) {
        try {
            param0.b(8, ((ob) this).field_m);
            if (param1 < 34) {
                ve discarded$0 = ob.a(-10, 21);
            }
            param0.a(((ob) this).field_h, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ob.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ve a(int param0, int param1) {
        if (param1 != 8) {
            field_l = null;
        }
        return tg.field_b != null ? (ve) (Object) tg.field_b.a(param1 ^ 24718, (long)param0) : null;
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        ck[] var7 = new ck[9];
        ck[] var4 = var7;
        var7[0] = sm.a((byte) -99, param3, param0);
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        if (param2 != -3932) {
            ob.a((byte) 72);
        }
        var4[4] = sm.a((byte) -122, 64, param1);
        return var4;
    }

    final gh a(int param0) {
        if (param0 != 18) {
            return null;
        }
        return pb.field_i;
    }

    final static void a(int param0, ui param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (rc.field_d != param1) {
                L2: {
                  if (rc.field_d == null) {
                    break L2;
                  } else {
                    if (param1 == null) {
                      break L2;
                    } else {
                      wj.field_Ob.a(param1, 0, 0, 16);
                      rc.field_d = param1;
                      wj.field_Ob.c(param0);
                      break L1;
                    }
                  }
                }
                nn.a(param0, param1, true);
                break L1;
              } else {
                wj.field_Ob.c(param0);
                break L1;
              }
            }
            L3: {
              if (param2 >= 45) {
                break L3;
              } else {
                field_g = 64;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ob.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_l = null;
        if (param0 < 86) {
            ck[] discarded$0 = ob.a(-105, -21, 61, -11);
        }
        field_n = null;
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (256 == param2) {
            pg.field_e.f(0, param3, 64);
        } else {
            pg.field_e.f(0, param3, param2 >> 2);
        }
    }

    ob(String param0, String param1) {
        try {
            ((ob) this).field_m = param0;
            ((ob) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Message game";
        field_j = new ck[8][7][16];
    }
}
