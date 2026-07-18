/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends o {
    static int field_o;
    int field_l;
    static String field_k;
    int field_n;
    static String field_j;
    static String field_m;

    public static void c(byte param0) {
        field_k = null;
        field_j = null;
        field_m = null;
    }

    final static boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -121) {
          L0: {
            field_j = null;
            if (vl.field_A != ci.field_ub) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (vl.field_A != ci.field_ub) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            if (param0 == -15024) {
              break L0;
            } else {
              boolean discarded$2 = hh.d((byte) -52);
              break L0;
            }
          }
          if (null != r.field_Ib) {
            L1: {
              var6 = (CharSequence) (Object) param1;
              var2 = ad.a(var6, -2);
              if (var2 != null) {
                break L1;
              } else {
                var2 = param1;
                break L1;
              }
            }
            var3 = (ve) (Object) r.field_Ib.a((long)var2.hashCode(), 3000);
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var7 = (CharSequence) (Object) var3.field_Fb;
                  var4 = ad.a(var7, -2);
                  if (var4 != null) {
                    break L3;
                  } else {
                    var4 = var3.field_Fb;
                    break L3;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (ve) (Object) r.field_Ib.b(true);
                  continue L2;
                } else {
                  stackOut_14_0 = (ve) var3;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("hh.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private hh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_k = "Loading music";
        field_m = "Your rating is <%0>";
        field_j = "Loading models";
    }
}
