/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static cn field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;
    static String field_g;
    static String field_b;
    static String field_a;
    static cf field_d;

    private final boolean a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -62) {
          if ((Object) (Object) rp.field_d != this) {
            if ((Object) (Object) k.field_e != this) {
              if (this == (Object) (Object) qa.field_c) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          tj discarded$4 = ef.a(92, -86, (nh) null, 64, (nh) null);
          if ((Object) (Object) rp.field_d != this) {
            if ((Object) (Object) k.field_e == this) {
              return true;
            } else {
              L0: {
                if (this != (Object) (Object) qa.field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static tj a(int param0, int param1, nh param2, int param3, nh param4) {
        int var5 = 0;
        var5 = -125 % ((param0 - -63) / 57);
        if (!kk.a(param2, 1, param1, param3)) {
          return null;
        } else {
          return rj.a(param4.b(5, param1, param3), 18118);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (sp.field_c == null) {
            return false;
        }
        if (!pd.field_A.a(-86)) {
            return false;
        }
        return true;
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = DungeonAssault.field_K;
        if (param3 == 0) {
          return "";
        } else {
          if ((param3 ^ -1) == -2) {
            var10 = param2[param0];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 + param0;
            var5 = 0;
            var6_int = param0;
            L0: while (true) {
              if (var4 <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  var7 = param0;
                  if (var4 <= var7) {
                    break L1;
                  } else {
                    L2: {
                      var8 = param2[var7];
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var7++;
                        break L2;
                      } else {
                        StringBuilder discarded$3 = var6.append(var8);
                        var7++;
                        break L2;
                      }
                    }
                    var7++;
                    var7++;
                    break L1;
                  }
                }
                var7 = 74 % ((param1 - -43) / 59);
                return var6.toString();
              } else {
                var7_ref_CharSequence = param2[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 111) {
          return;
        } else {
          field_c = null;
          field_g = null;
          field_b = null;
          field_d = null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "COST:";
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = "Achievements";
        field_a = "Create";
        field_c = "to keep fullscreen or";
    }
}
