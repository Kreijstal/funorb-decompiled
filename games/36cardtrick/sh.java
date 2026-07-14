/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends mh {
    static byte[] field_j;
    static String field_f;
    static ff field_k;
    static qi field_i;
    static int[] field_l;
    static qj field_e;
    static qk field_g;
    static String field_h;

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_h = null;
        field_e = null;
        if (param0 != 4352) {
            field_g = (qk) null;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        L0: {
          var6 = Main.field_T;
          var2 = ((CharSequence) param0).length();
          if (-21 <= (var2 ^ -1)) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        if (param1 == -128) {
          var12 = new char[var2];
          var10 = var12;
          var9 = var10;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          if (var2 > var4) {
            L1: {
              var5 = ((CharSequence) param0).charAt(var4);
              if (65 > var5) {
                break L1;
              } else {
                if (var5 > 90) {
                  break L1;
                } else {
                  var3[var4] = (char)(-65 + var5 + 97);
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              }
            }
            if (var5 < 97) {
              if (48 <= var5) {
                if (var5 <= 57) {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              } else {
                var3[var4] = (char)95;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              }
            } else {
              if (var5 <= 122) {
                var3[var4] = (char)var5;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              } else {
                L2: {
                  L3: {
                    if (48 > var5) {
                      break L3;
                    } else {
                      if (var5 <= 57) {
                        var3[var4] = (char)var5;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (char)95;
                  var4++;
                  break L2;
                }
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              }
            }
          } else {
            return new String(var12);
          }
        } else {
          var7 = (CharSequence) null;
          String discarded$1 = sh.a((CharSequence) null, (byte) 31);
          var13 = new char[var2];
          var11 = var13;
          var9 = var11;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          if (var2 > var4) {
            L4: {
              var5 = ((CharSequence) param0).charAt(var4);
              if (65 > var5) {
                break L4;
              } else {
                if (var5 > 90) {
                  break L4;
                } else {
                  var3[var4] = (char)(-65 + var5 + 97);
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                }
              }
            }
            if (var5 < 97) {
              if (48 <= var5) {
                if (var5 > 57) {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                }
              } else {
                var3[var4] = (char)95;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var13);
              }
            } else {
              if (var5 > 122) {
                if (48 <= var5) {
                  if (var5 > 57) {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var13);
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var13);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                }
              } else {
                var3[var4] = (char)var5;
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var13);
              }
            }
          } else {
            return new String(var13);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new byte[65536];
        og.a(field_j, 0, 65536, (byte) -128);
        field_f = "More suggestions";
        field_k = null;
        field_h = "Return to game";
    }
}
