/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends ci {
    static boolean field_m;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
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
        var9 = TombRacer.field_G ? 1 : 0;
        if (-1 == (param3 ^ -1)) {
          return "";
        } else {
          if (param3 == 1) {
            var10 = param1[param2];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param3 + param2;
            var5 = 0;
            if (param0 > 121) {
              var6_int = param2;
              L0: while (true) {
                if (var6_int >= var4) {
                  var6 = new StringBuilder(var5);
                  var7 = param2;
                  L1: while (true) {
                    if (var4 <= var7) {
                      return var6.toString();
                    } else {
                      var8 = param1[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        continue L1;
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
            } else {
              return null;
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
            qga.c(97);
        }
        return ht.field_Fb;
    }

    final static void c(int param0) {
        int var1 = 0;
        if ((ot.field_v ^ -1) < -33) {
            var1 = ot.field_v % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            mp.a(2, ot.field_v - var1);
        } else {
            mp.a(2, 0);
        }
        if (param0 != -10794) {
            field_m = false;
        }
    }

    public qga() {
        super(0, true);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          if (param5 < -107) {
            break L0;
          } else {
            var17 = null;
            qga.a(30, -67, (int[]) null, -70, -115, -54, -31, -19, 111, 23);
            break L0;
          }
        }
        param6--;
        L1: while (true) {
          if (param6 < 0) {
            return;
          } else {
            var18 = param2;
            var10 = var18;
            var11 = param4;
            var12 = param8;
            var13 = param1;
            var14 = param0;
            var15 = 8355711 & var18[var11] >> 1250374305;
            var10[var11] = (sea.c(33478545, var14) >> 189010993) - -(sea.c(var13, 33423539) >> -696668695) - (-(sea.c(33423360, var12) >> -77464319) - var15);
            param4++;
            param0 = param0 + param9;
            param8 = param8 + param3;
            param1 = param1 + param7;
            param6--;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = true;
    }
}
