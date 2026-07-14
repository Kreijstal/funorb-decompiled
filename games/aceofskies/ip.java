/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip {
    static int[][] field_a;
    static ll[] field_c;
    static int[] field_b;

    final static String a(byte param0, CharSequence param1) {
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
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          var2 = ((CharSequence) param1).length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var11 = new char[var2];
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var3 = var8;
        if (param0 != -81) {
          var7 = (CharSequence) null;
          String discarded$1 = ip.a((byte) -114, (CharSequence) null);
          var4 = 0;
          if (var2 > var4) {
            var5 = ((CharSequence) param1).charAt(var4);
            if (65 > var5) {
              if (var5 < 97) {
                if (var5 >= 48) {
                  if (var5 > 57) {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                }
              } else {
                if (122 < var5) {
                  if (var5 >= 48) {
                    if (var5 > 57) {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var11);
                    } else {
                      var3[var4] = (char)var5;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var11);
                    }
                  } else {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  }
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                }
              }
            } else {
              if (var5 > 90) {
                if (var5 >= 97) {
                  if (122 < var5) {
                    if (var5 >= 48) {
                      if (var5 > 57) {
                        var3[var4] = (char)95;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var11);
                      } else {
                        var3[var4] = (char)var5;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var11);
                      }
                    } else {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var11);
                    }
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  }
                } else {
                  L1: {
                    L2: {
                      if (var5 < 48) {
                        break L2;
                      } else {
                        if (var5 <= 57) {
                          var3[var4] = (char)var5;
                          var4++;
                          var4++;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    break L1;
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                }
              } else {
                var3[var4] = (char)(-65 + (var5 - -97));
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var11);
              }
            }
          } else {
            return new String(var11);
          }
        } else {
          var4 = 0;
          L3: while (true) {
            if (var2 <= var4) {
              return new String(var11);
            } else {
              L4: {
                var5 = ((CharSequence) param1).charAt(var4);
                if (65 > var5) {
                  break L4;
                } else {
                  if (var5 <= 90) {
                    var3[var4] = (char)(-65 + (var5 - -97));
                    var4++;
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (var5 < 97) {
                    break L6;
                  } else {
                    if (122 >= var5) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5 < 48) {
                    break L7;
                  } else {
                    if (var5 <= 57) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L3;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L3;
            }
          }
        }
    }

    abstract int b(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -3) {
          field_c = (ll[]) null;
          field_c = null;
          field_a = (int[][]) null;
          return;
        } else {
          field_c = null;
          field_a = (int[][]) null;
          return;
        }
    }

    abstract ps a(boolean param0);

    abstract byte[] a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = new int[][]{new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7]};
    }
}
