/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vk field_b;
    static mg field_c;
    static dl field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -27838) {
            field_a = null;
        }
        field_c = null;
        field_a = null;
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -2) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((Object) (Object) tk.field_k == this) {
              break L2;
            } else {
              if (this == (Object) (Object) fm.field_y) {
                break L2;
              } else {
                if ((Object) (Object) ek.field_h != this) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4_ref_CharSequence = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = CrazyCrystals.field_B;
        if (-1 == (param3 ^ -1)) {
          return "";
        } else {
          if ((param3 ^ -1) == -2) {
            var10 = param1[param2];
            var4_ref_CharSequence = var10;
            if (var4_ref_CharSequence == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 + param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var4 <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  if (param0 >= 62) {
                    break L1;
                  } else {
                    field_c = null;
                    break L1;
                  }
                }
                var7 = param2;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param1[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param1[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
