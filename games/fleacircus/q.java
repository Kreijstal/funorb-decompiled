/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_d;
    static bi field_c;
    static int[] field_a;
    static String[] field_b;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = e.a(param0, false, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("q.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
        return stackIn_1_0;
    }

    final static rh a(int param0, int param1) {
        return ag.a(false, param1, false, 1, true, 1);
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        oa var4_ref_oa = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        kf var9 = null;
        ih var10 = null;
        byte[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var10 = ae.field_a;
            var2 = var10.e(false);
            if (var2 == 0) {
              var9 = (kf) (Object) hd.field_a.c((byte) 47);
              if (var9 != null) {
                L1: {
                  var4 = var10.e(false);
                  if (var4 != 0) {
                    var14 = new byte[var4];
                    var10.b(var14, 0, -88, var4);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var10.field_i = var10.field_i + 4;
                if (var10.g(-124)) {
                  var9.c(-1);
                  break L0;
                } else {
                  k.c(-28354);
                  return;
                }
              } else {
                k.c(-28354);
                return;
              }
            } else {
              if (1 != var2) {
                ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                k.c(-28354);
                return;
              } else {
                var3 = var10.c((byte) 122);
                var4_ref_oa = (oa) (Object) cf.field_d.c((byte) 47);
                L2: while (true) {
                  L3: {
                    if (var4_ref_oa == null) {
                      break L3;
                    } else {
                      if (var3 != var4_ref_oa.field_i) {
                        var4_ref_oa = (oa) (Object) cf.field_d.b((byte) -105);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4_ref_oa == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var4_ref_oa.c(-1);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "q.D(" + true + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
