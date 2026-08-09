/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static jc field_e;
    static long field_b;
    static km field_g;
    static int field_d;
    static String field_f;
    static km[][][][] field_c;
    static String field_a;
    static String field_h;

    final static void a(int param0, boolean param1) {
        nk var3;
        if (param0 != -1) {
          var3 = (nk) null;
          cl.a(-24, (nk) null);
          pi.field_c.a(param1, -1730123902);
          return;
        } else {
          pi.field_c.a(param1, -1730123902);
          return;
        }
    }

    final static void a(byte param0) {
        int var1;
        if ((bc.field_b ^ -1) > -71) {
          rf.b(80, 10 + bc.field_b);
          var1 = -102 % ((param0 - -89) / 32);
          return;
        } else {
          rf.b(80, 80);
          var1 = -102 % ((param0 - -89) / 32);
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_a = null;
        if (param0 != 12) {
          cl.a(40);
          field_c = (km[][][][]) null;
          field_e = null;
          return;
        } else {
          field_c = (km[][][][]) null;
          field_e = null;
          return;
        }
    }

    final static fn[] a(int param0, nk param1) {
        Object stackIn_5_0 = null;
        fn[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fn[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        fn var6_ref_fn = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -4974) {
                break L1;
              } else {
                field_g = (km) null;
                break L1;
              }
            }
            var2_int = param1.e(-16, 8);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param1.e(param0 + 5082, 12);
              var4 = new fn[var3];
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackIn_14_0 = (fn[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (!r.a(true, param1)) {
                      var6 = param1.e(-63, kb.a(-1 + var5, param0 ^ -4904));
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_fn = new fn();
                      param1.e(param0 + 5096, 24);
                      param1.e(-33, 24);
                      var6_ref_fn.field_g = param1.e(-94, 24);
                      param1.e(123, 9);
                      param1.e(-18, 12);
                      param1.e(110, 12);
                      param1.e(105, 12);
                      var4[var5] = var6_ref_fn;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("cl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fn[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_14_0;
        }
    }

    static {
        field_g = new km(0, 0);
        field_f = "Create unrated game";
        field_c = new km[2][2][2][7];
        field_a = "Match by...";
        field_h = "Honour";
    }
}
