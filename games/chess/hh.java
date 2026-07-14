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
            field_m = null;
        }
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
        Object var3 = null;
        ve var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var3 = null;
        var5 = Chess.field_G;
        if (param0 == -15024) {
          if (null != r.field_Ib) {
            L0: {
              var8 = (CharSequence) (Object) param1;
              var2 = ad.a(var8, -2);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (String) (Object) var8;
                break L0;
              }
            }
            var3_ref = (ve) (Object) r.field_Ib.a((long)var2.hashCode(), 3000);
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var9 = (CharSequence) (Object) var3_ref.field_Fb;
                  var4 = ad.a(var9, -2);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3_ref.field_Fb;
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3_ref = (ve) (Object) r.field_Ib.b(true);
                  continue L1;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          boolean discarded$17 = hh.d((byte) -52);
          if (null != r.field_Ib) {
            L3: {
              var6 = (CharSequence) (Object) param1;
              var2 = ad.a(var6, -2);
              if (var2 != null) {
                break L3;
              } else {
                var2 = (String) (Object) var6;
                break L3;
              }
            }
            var3_ref = (ve) (Object) r.field_Ib.a((long)var2.hashCode(), 3000);
            L4: while (true) {
              if (var3_ref != null) {
                L5: {
                  var7 = (CharSequence) (Object) var3_ref.field_Fb;
                  var4 = ad.a(var7, -2);
                  if (var4 != null) {
                    break L5;
                  } else {
                    var4 = var3_ref.field_Fb;
                    break L5;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3_ref = (ve) (Object) r.field_Ib.b(true);
                  continue L4;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
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
