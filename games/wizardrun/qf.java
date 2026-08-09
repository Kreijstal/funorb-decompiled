/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends mf {
    static vh field_m;
    static int field_l;
    static String field_k;

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, param0) == hg.field_c) {
              stackIn_3_0 = di.field_a;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qf.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final ok a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ok stackIn_3_0 = null;
        ok stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!af.a(var4, (byte) 78)) {
              stackIn_3_0 = hg.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = ph.a(1124, var5);
                if (param0 <= (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (130 < var3_int) {
                    break L1;
                  } else {
                    return gf.field_V;
                  }
                }
              }
              stackIn_8_0 = hg.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("qf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
            return;
        }
        field_m = null;
    }

    final static String c(byte param0) {
        String var1;
        L0: {
          var1 = "";
          if (r.field_b != null) {
            var1 = r.field_b.d(false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 == var1.length()) {
            var1 = vk.d((byte) -110);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 77) {
          return (String) null;
        } else {
          L2: {
            if (0 != var1.length()) {
              break L2;
            } else {
              var1 = ei.field_i;
              break L2;
            }
          }
          return var1;
        }
    }

    qf(og param0) {
        super(param0);
    }

    static {
        field_k = "Achievements";
    }
}
