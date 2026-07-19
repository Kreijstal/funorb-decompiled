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

    public static void a(byte param0) {
        field_k = null;
        if (param0 >= -69) {
            return;
        }
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 39) {
                break L1;
              } else {
                field_k = (pa) null;
                break L1;
              }
            }
            L2: {
              var13 = nm.field_c;
              var2 = var13.g(121);
              if (var2 == 0) {
                var11 = fu.a(true);
                var17 = var11;
                var15 = var17;
                var3 = var15;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((rb) ((Object) var5)).g(-97);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
                    var16_ref = (eh) ((Object) wu.field_w.d(268435455));
                    if (var16_ref != null) {
                      var16_ref.field_g = true;
                      var16_ref.field_e = var17[0];
                      var16_ref.field_f = var3;
                      var16_ref.c(-124);
                      break L2;
                    } else {
                      te.b(true);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    var10[var7] = ((rb) ((Object) var5)).a((byte) 124);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  if (var2 == 2) {
                    var14 = (eh) ((Object) wu.field_w.d(268435455));
                    if (var14 == null) {
                      te.b(true);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var14.field_f = fu.a(true);
                      var14.field_g = true;
                      var14.field_e = var14.field_f[0];
                      var14.c(-125);
                      break L2;
                    }
                  } else {
                    v.a("A1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                    te.b(true);
                    break L2;
                  }
                } else {
                  var12 = (oc) ((Object) ci.field_j.d(268435455));
                  if (var12 != null) {
                    var12.c(-123);
                    break L2;
                  } else {
                    te.b(true);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "dh.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, ap param4) {
        try {
            wt.field_e.a((byte) -50, param3, !param2 ? true : false, param1, param4, param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = -1;
    }
}
