/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_e;
    static hd[] field_d;
    static vn field_f;
    static String field_b;
    static String field_c;
    static int field_a;

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0) {
            field_f = (vn) null;
        }
    }

    final static String a(int param0, byte param1, String param2) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        gg var7 = null;
        gg var8 = null;
        ml var9 = null;
        CharSequence var10 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            if (!ef.a(var10, -9907)) {
              stackIn_4_0 = kq.field_Ib;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ts.field_d ^ -1) == -3) {
                var8 = tr.a(param2, (byte) 40);
                if (var8 == null) {
                  stackIn_11_0 = vo.a((byte) -18, af.field_c, new String[]{param2});
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  ne.field_I.b(-7584, var8);
                  L1: while (true) {
                    var7 = (gg) ((Object) ne.field_I.c(33));
                    if (var7 == null) {
                      L2: {
                        var8.c((byte) -109);
                        var8.f(25);
                        bc.field_d = bc.field_d - 1;
                        var9 = or.field_d;
                        var9.b(param0, (byte) -85);
                        var9.field_n = var9.field_n + 1;
                        var5 = var9.field_n;
                        var9.a(123, 1);
                        var9.a(14190, param2);
                        if (param1 >= 4) {
                          break L2;
                        } else {
                          of.a(false);
                          break L2;
                        }
                      }
                      var9.c(62, var9.field_n - var5);
                      stackIn_18_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7.field_Cb = var7.field_Cb - 1;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_7_0 = kh.field_t;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("of.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (String) ((Object) stackIn_18_0);
            }
          }
        }
    }

    static {
        field_c = "lost";
        field_b = "<%0> is already on your ignore list.";
    }
}
