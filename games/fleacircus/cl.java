/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_c;
    static vc field_e;
    static String field_a;
    static int field_b;
    static int[] field_d;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ih var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hi var12 = null;
        ih var13 = null;
        ia var14 = null;
        int[] var15 = null;
        Object var16 = null;
        ia var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = ae.field_a;
              if (param0 == -36) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2 = var13.e(false);
            if (var2 == 0) {
              var11 = h.a((byte) -112);
              var19 = var11;
              var18 = var19;
              var17 = var18;
              var15 = var17;
              var3 = var15;
              var10 = var11;
              var4 = var10;
              var5 = var13;
              var6 = ((ni) (Object) var5).e(false);
              var7 = 0;
              L2: while (true) {
                if (var6 <= var7) {
                  var16_ref = (ia) (Object) rj.field_i.c((byte) 47);
                  if (var16_ref == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var16_ref.field_n = true;
                    var16_ref.field_k = var19[0];
                    var16_ref.field_i = var3;
                    var16_ref.c(-1);
                    break L0;
                  }
                } else {
                  var10[var7] = ((ni) (Object) var5).c((byte) -114);
                  var7++;
                  continue L2;
                }
              }
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                  k.c(-28354);
                  return;
                } else {
                  var14 = (ia) (Object) rj.field_i.c((byte) 47);
                  if (var14 == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var14.field_i = h.a((byte) -121);
                    var14.field_n = true;
                    var14.field_k = var14.field_i[0];
                    var14.c(-1);
                    return;
                  }
                }
              } else {
                var12 = (hi) (Object) bf.field_e.c((byte) 47);
                if (var12 != null) {
                  var12.c(-1);
                  return;
                } else {
                  k.c(param0 ^ 28386);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "cl.A(" + param0 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "They cannot be directly removed, so be careful where you put them!";
        field_d = new int[40];
        field_b = -1;
    }
}
