/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends rqa {
    static int field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        si.a(150, 62, param0[0].a(127));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static uca a(int param0, kda param1, faa param2, byte param3) {
        byte[] var4 = null;
        faa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        uca var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var13 = VoidHunters.field_G;
        if (param3 >= 96) {
          var18 = param1.b(param2, 1000);
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var14 = var15;
          var4 = var14;
          if (var14 != null) {
            L0: {
              var5 = wl.a(9, var18);
              var6 = var5.e((byte) -95);
              var7 = var5.h(23);
              if (var5.e((byte) -101) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            var8 = stackIn_7_0;
            var9 = new String[var5.e((byte) -105)];
            var11_int = 0;
            L1: while (true) {
              if (var9.length <= var11_int) {
                L2: {
                  var10 = -2;
                  var10 = var5.d((byte) -114);
                  if (-1 == var10) {
                    var10 = -2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var11 = new uca(true, var9, var10, var8 != 0, var6, var7, false);
                  if (-2 != (var5.e((byte) -116) ^ -1)) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L3;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L3;
                  }
                }
                L4: {
                  var12 = stackIn_22_0;
                  if (var12 != 0) {
                    var5.p(-23497);
                    var11.field_m.a(-62, var5);
                    var5.f((byte) -81);
                    param1.a(0, idb.field_o, var11.field_m.field_l);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.field_m.field_j = param1.a(true, -13027);
                if (param1.b((byte) 85)) {
                  return null;
                } else {
                  return var11;
                }
              } else {
                L5: {
                  if (-2 != (var5.e((byte) -114) ^ -1)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L5;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
                var12 = stackIn_12_0;
                if (var12 != 0) {
                  var9[var11_int] = var5.g(-1609246200);
                  var11_int++;
                  var11_int++;
                  continue L1;
                } else {
                  var11_int++;
                  var11_int++;
                  continue L1;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        if (param1 > -95) {
          return null;
        } else {
          var2 = param0.length;
          var3 = new byte[var2];
          cua.a(param0, 0, var3, 0, var2);
          return var3;
        }
    }

    nia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
