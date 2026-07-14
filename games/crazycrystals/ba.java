/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ln {
    static dl field_j;
    static String field_l;
    static vc field_i;
    static dl[] field_g;
    static db field_k;
    static java.awt.Image field_h;

    final int a(int param0, byte param1) {
        int var3 = 75 / ((param1 - 55) / 50);
        return -1 != (1 << param0 & qg.field_q ^ -1) ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = 4 / ((84 - param0) / 42);
        ab.f((byte) -49);
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        L0: {
          var6 = CrazyCrystals.field_B;
          var2 = param1.length();
          if ((var2 ^ -1) >= -21) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var10 = new char[var2];
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var3 = var7;
        var4 = 0;
        if (param0 == 48) {
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (var5 < 65) {
              if (var5 < 97) {
                if (48 <= var5) {
                  if (57 >= var5) {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  } else {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                }
              } else {
                if (122 < var5) {
                  L1: {
                    L2: {
                      if (48 > var5) {
                        break L2;
                      } else {
                        if (57 < var5) {
                          break L2;
                        } else {
                          var3[var4] = (char)var5;
                          var4++;
                          break L1;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    break L1;
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                }
              }
            } else {
              if (var5 > 90) {
                if (var5 >= 97) {
                  if (122 < var5) {
                    if (48 <= var5) {
                      if (57 < var5) {
                        var3[var4] = (char)95;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var10);
                      } else {
                        var3[var4] = (char)var5;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var10);
                      }
                    } else {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var10);
                    }
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                } else {
                  L3: {
                    L4: {
                      if (48 > var5) {
                        break L4;
                      } else {
                        if (57 < var5) {
                          break L4;
                        } else {
                          var3[var4] = (char)var5;
                          var4++;
                          break L3;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    break L3;
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                }
              } else {
                var3[var4] = (char)(var5 + 32);
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var10);
              }
            }
          } else {
            return new String(var10);
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, String param1) {
        ng.a(param1, 21815);
        ke.a(no.field_i, false, -13);
        int var2 = 119 % ((param0 - 6) / 49);
    }

    final static void c(byte param0) {
        jm.field_d.a((qm) (Object) new ae(), (byte) -50);
        if (param0 == 93) {
            return;
        }
        field_h = null;
    }

    final static tj a(int param0) {
        if (param0 != -29513) {
            return null;
        }
        return hb.field_l;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_l = null;
        if (param0 != 48) {
          ba.c((byte) -100);
          field_h = null;
          field_k = null;
          field_j = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_j = null;
          return;
        }
    }

    final static void a(int param0, int param1, hp param2) {
        if (param1 <= 37) {
          field_h = null;
          cf.field_c.b(0, (jb) (Object) param2);
          tb.a(param0, param2, (byte) -123);
          return;
        } else {
          cf.field_c.b(0, (jb) (Object) param2);
          tb.a(param0, param2, (byte) -123);
          return;
        }
    }

    ba(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Retry";
    }
}
