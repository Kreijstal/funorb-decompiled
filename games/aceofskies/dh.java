/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_i;
    int field_j;
    int field_a;
    static String field_d;
    int field_f;
    static pa field_k;
    int field_l;
    byte[] field_e;
    int field_h;
    static int field_c;
    int field_b;
    byte[] field_g;

    public static void a() {
        field_k = null;
        field_d = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        dl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        oc var12 = null;
        dl var13 = null;
        eh var14 = null;
        int[] var15 = null;
        Object var16 = null;
        eh var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = nm.field_c;
              var2 = var13.g(121);
              if (var2 == 0) {
                int discarded$6 = 1;
                var11 = fu.a();
                var19 = var11;
                var18 = var19;
                var17 = var18;
                var15 = var17;
                var3 = var15;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((rb) (Object) var5).g(-97);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var16_ref = (eh) (Object) wu.field_w.d(268435455);
                    if (var16_ref != null) {
                      var16_ref.field_g = true;
                      var16_ref.field_e = var19[0];
                      var16_ref.field_f = var3;
                      var16_ref.c(-124);
                      break L1;
                    } else {
                      int discarded$7 = 1;
                      te.b();
                      return;
                    }
                  } else {
                    var10[var7] = ((rb) (Object) var5).a((byte) 124);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                if (var2 != 1) {
                  if (var2 == 2) {
                    var14 = (eh) (Object) wu.field_w.d(268435455);
                    if (var14 == null) {
                      int discarded$8 = 1;
                      te.b();
                      return;
                    } else {
                      int discarded$9 = 1;
                      var14.field_f = fu.a();
                      var14.field_g = true;
                      var14.field_e = var14.field_f[0];
                      var14.c(-125);
                      break L1;
                    }
                  } else {
                    v.a("A1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                    int discarded$10 = 1;
                    te.b();
                    break L1;
                  }
                } else {
                  var12 = (oc) (Object) ci.field_j.d(268435455);
                  if (var12 != null) {
                    var12.c(-123);
                    break L1;
                  } else {
                    int discarded$11 = 1;
                    te.b();
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "dh.A(" + 120 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, ap param4) {
        try {
            wt.field_e.a((byte) -50, 1048576, !param2 ? true : false, 256, param4, 1000000);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dh.B(" + 1000000 + ',' + 256 + ',' + param2 + ',' + 1048576 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = -1;
    }
}
