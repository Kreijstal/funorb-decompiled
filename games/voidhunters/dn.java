/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends rqa {
    static float[] field_o;
    static int field_p;
    static dfa field_r;
    static int field_q;

    final static boolean a(tv[] param0, boolean param1, int param2, tv[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var5 = 88 / ((param4 - 60) / 55);
          if (param3 == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param3.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (param0 == null) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param0.length;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var7 = stackIn_6_0;
        if (var6 == var7) {
          var8 = 0;
          L2: while (true) {
            if (var8 >= var6) {
              return false;
            } else {
              L3: {
                if (param3[var8] == null) {
                  if (null != param0[var8]) {
                    break L3;
                  } else {
                    var8++;
                    continue L2;
                  }
                } else {
                  if (param0[var8] == null) {
                    break L3;
                  } else {
                    L4: {
                      if (!param1) {
                        break L4;
                      } else {
                        if (((Object) (Object) param0[var8]).getClass() != ((Object) (Object) param3[var8]).getClass()) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (la.a(param0[var8], param3[var8], param2, (byte) -86)) {
                      return true;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        si.a(129, 62, param0[0].a(44));
        return new nc((Object) (Object) "void");
    }

    public static void a(int param0) {
        int var1 = 1 % ((param0 - 59) / 42);
        field_r = null;
        field_o = null;
    }

    dn(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_q = 49;
    }
}
