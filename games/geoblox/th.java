/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends lf {
    static int[] field_h;
    static String field_g;
    static na field_f;

    th(long param0, String param1) {
        super(param0, param1);
    }

    final static od a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        od[] var3 = null;
        int var4 = 0;
        od var5 = null;
        int var6 = 0;
        od stackIn_5_0 = null;
        od stackIn_11_0 = null;
        od stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                th.d((byte) 21);
                break L1;
              }
            }
            var2 = qi.a("jagex-last-login-method", param0, -114);
            if (var2 != null) {
              var3 = ak.a(false);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackIn_14_0 = td.field_I;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(115, var2)) {
                    stackIn_11_0 = (od) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_5_0 = td.field_I;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("th.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void d(byte param0) {
        field_h = null;
        field_f = null;
        field_g = null;
        if (param0 != -109) {
            field_f = (na) null;
        }
    }

    final qg a(byte param0) {
        if (param0 != -32) {
            this.a((byte) 104);
            return vh.field_D;
        }
        return vh.field_D;
    }

    static {
        field_h = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        field_g = "Player";
    }
}
