/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jk {
    static Random field_b;
    static String field_a;
    static gb field_c;

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var2 = param1.length();
          if (-21 <= (var2 ^ -1)) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        if (param0 == 104) {
          var12 = new char[var2];
          var10 = var12;
          var9 = var10;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          if (var2 > var4) {
            L1: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L1;
              } else {
                if (var5 > 90) {
                  break L1;
                } else {
                  var3[var4] = (char)(97 + (-65 + var5));
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              }
            }
            if (97 > var5) {
              if (48 <= var5) {
                if (var5 > 57) {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                } else {
                  var3[var4] = (char)var5;
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
                return new String(var12);
              }
            } else {
              if (122 < var5) {
                L2: {
                  L3: {
                    if (48 > var5) {
                      break L3;
                    } else {
                      if (var5 > 57) {
                        break L3;
                      } else {
                        var3[var4] = (char)var5;
                        var4++;
                        break L2;
                      }
                    }
                  }
                  var3[var4] = (char)95;
                  break L2;
                }
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              } else {
                var3[var4] = (char)var5;
                var4++;
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
          var7 = null;
          String discarded$1 = jk.a((byte) 61, (CharSequence) null);
          var13 = new char[var2];
          var11 = var13;
          var9 = var11;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          if (var2 > var4) {
            L4: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L4;
              } else {
                if (var5 > 90) {
                  break L4;
                } else {
                  var3[var4] = (char)(97 + (-65 + var5));
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                }
              }
            }
            if (97 > var5) {
              if (48 <= var5) {
                if (var5 <= 57) {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var13);
                } else {
                  var3[var4] = (char)95;
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
                return new String(var13);
              }
            } else {
              if (122 < var5) {
                L5: {
                  L6: {
                    if (48 > var5) {
                      break L6;
                    } else {
                      if (var5 > 57) {
                        break L6;
                      } else {
                        var3[var4] = (char)var5;
                        var4++;
                        break L5;
                      }
                    }
                  }
                  var3[var4] = (char)95;
                  break L5;
                }
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
                var4++;
                return new String(var13);
              }
            }
          } else {
            return new String(var13);
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -23322) {
            jk.b(-58);
            return sf.field_U;
        }
        return sf.field_U;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 > -43) {
            jk.b(66);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
        field_a = "Reach the bridge's main navigation console and set the station to crash into the planet.";
    }
}
