/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends nm {
    static String field_l;
    static jp field_q;
    static int[] field_k;
    static String field_j;
    static jp[][] field_o;
    static int[] field_p;
    int field_n;
    private Object[] field_i;
    private int field_m;

    public static void a(int param0) {
        field_j = null;
        field_o = null;
        field_q = null;
        field_p = null;
        if (param0 <= 36) {
            return;
        }
        field_l = null;
        field_k = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
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
        var9 = BrickABrac.field_J ? 1 : 0;
        if (param1 == 0) {
          return "";
        } else {
          if (1 != param1) {
            var4 = param0 + param1;
            if (param2 == 19166) {
              var5 = 0;
              var6_int = param0;
              L0: while (true) {
                if (var6_int >= var4) {
                  var6 = new StringBuilder(var5);
                  var7 = param0;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param3[var7];
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append(var8);
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  var7_ref_CharSequence = param3[var6_int];
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
            } else {
              return null;
            }
          } else {
            var10 = param3[param0];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          }
        }
    }

    final Object a(int param0, int param1) {
        if (!(((ao) this).field_n >= param0)) {
            throw new RuntimeException("State in future " + ((ao) this).field_n + " " + param0);
        }
        int var3 = 80 / ((11 - param1) / 35);
        if (!(1 + (((ao) this).field_n + -((ao) this).field_m) <= param0)) {
            throw new RuntimeException("State erased " + param0 + ". Lastest entry: " + ((ao) this).field_n);
        }
        return ((ao) this).field_i[param0 % ((ao) this).field_m];
    }

    final void a(Object param0, byte param1) {
        if (param1 != -39) {
            ((ao) this).a(((Object[]) ((ao) this).field_i[8])[13], ((byte[]) ((ao) this).field_i[1])[9]);
        }
        ((ao) this).field_n = ((ao) this).field_n + 1;
        ((ao) this).field_i[(((ao) this).field_n + 1) % ((ao) this).field_m] = param0;
    }

    ao(int param0) {
        ((ao) this).field_n = -1;
        ((ao) this).field_m = param0;
        ((ao) this).field_i = new Object[((ao) this).field_m];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show all private chat";
        field_k = new int[]{8, 14, 15, 16, 43};
        field_j = "You have not yet unlocked this option for use.";
    }
}
