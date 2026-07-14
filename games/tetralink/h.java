/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static oh field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 > -38) {
            field_c = null;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = TetraLink.field_J;
          var2 = param0.length();
          if ((var2 ^ -1) >= -21) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        if (param1 != 56) {
          return null;
        } else {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var8);
            } else {
              L2: {
                var5 = param0.charAt(var4);
                if (var5 < 65) {
                  break L2;
                } else {
                  if (var5 > 90) {
                    break L2;
                  } else {
                    var3[var4] = (char)(-65 + (var5 - -97));
                    var4++;
                    var4++;
                    continue L1;
                  }
                }
              }
              L3: {
                L4: {
                  if (var5 < 97) {
                    break L4;
                  } else {
                    if (var5 <= 122) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 48) {
                    break L5;
                  } else {
                    if (var5 > 57) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L1;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L1;
            }
          }
        }
    }

    final static oh[] a(int param0, int param1, boolean param2, ah param3) {
        if (!ia.a(param1, param3, param0, -63)) {
            return null;
        }
        if (param2) {
            return null;
        }
        return ci.d(-1);
    }

    final static void a(byte param0, boolean param1) {
        oj.field_a.a(param1, 256);
        int var3 = 72 % ((param0 - 58) / 42);
        lb var2 = bk.field_e;
        if (!(var2 == null)) {
            var2.a(oj.field_a.field_z, oj.field_a.field_eb, -23452);
        }
    }

    static {
    }
}
