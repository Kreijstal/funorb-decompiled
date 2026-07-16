/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static String[] field_a;

    abstract fd b(byte param0);

    abstract int a(int param0, int param1);

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        var5 = Torquing.field_u;
        var6 = "(" + mm.field_d + " " + eb.field_f + " " + wk.field_h + ") " + fa.field_e;
        if (param0 > (oo.field_a ^ -1)) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (var2 < oo.field_a) {
              L1: {
                stackOut_5_0 = var1 + 32;
                stackIn_16_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var7 = stackIn_6_0;
                      var3 = kj.field_d.field_j[var2] & 255;
                      var4 = var3 >> -12710428;
                      var3 = var3 & 15;
                      if ((var4 ^ -1) <= -11) {
                        break L3;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 55;
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (var3 < 10) {
                        break L5;
                      } else {
                        var3 += 55;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 48;
                    break L4;
                  }
                  var8 = var7 + (char)var4;
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    stackOut_15_0 = (String) var1;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  }
                }
              }
              return stackIn_16_0;
            } else {
              return var1;
            }
          }
        } else {
          return var6;
        }
    }

    public static void a(byte param0) {
        if (param0 < 1) {
            String discarded$0 = me.a(-64);
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract byte[] a(int param0, boolean param1);

    static {
    }
}
