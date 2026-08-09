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
        if (param0 <= 95) {
            field_m = (String) null;
        }
    }

    final static boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -121) {
          L0: {
            field_j = (String) null;
            if (vl.field_A != ci.field_ub) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (vl.field_A != ci.field_ub) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -15024) {
                break L1;
              } else {
                hh.d((byte) -52);
                break L1;
              }
            }
            if (null != r.field_Ib) {
              L2: {
                var6 = (CharSequence) ((Object) param1);
                var2 = ad.a(var6, -2);
                if (var2 != null) {
                  break L2;
                } else {
                  var2 = param1;
                  break L2;
                }
              }
              var3 = (ve) ((Object) r.field_Ib.a((long)var2.hashCode(), 3000));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_Fb);
                    var4 = ad.a(var7, -2);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_Fb;
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (ve) ((Object) r.field_Ib.b(true));
                    continue L3;
                  } else {
                    stackIn_15_0 = (ve) (var3);
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2_ref);

            stackIn_20_1 = new StringBuilder().append("hh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_15_0;
    }

    private hh() throws Throwable {
        throw new Error();
    }

    static {
        field_o = -1;
        field_k = "Loading music";
        field_m = "Your rating is <%0>";
        field_j = "Loading models";
    }
}
