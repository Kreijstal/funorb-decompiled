/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    String[] field_a;
    boolean field_d;
    boolean field_g;
    String field_e;
    static tf field_k;
    int field_j;
    static String field_i;
    static String field_h;
    static dm[] field_f;
    static String field_b;
    static rh field_l;
    static dm field_c;

    final static void a(java.awt.Canvas param0, int param1) {
        hj.a((byte) -85, (java.awt.Component) (Object) param0);
        if (param1 != 57) {
          return;
        } else {
          L0: {
            fk.a((java.awt.Component) (Object) param0, param1 + -56);
            if (null != vc.field_f) {
              vc.field_f.a(124, (java.awt.Component) (Object) param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        L0: {
          var2 = param0.length();
          if (20 >= var2) {
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
        if (param1 != 48) {
          var6 = null;
          sl.a((java.awt.Canvas) null, 58);
          if (var2 > var4) {
            var5 = param0.charAt(var4);
            if (var5 < 65) {
              if (var5 < 97) {
                if (var5 >= 48) {
                  if (var5 > 57) {
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
                if (var5 > 122) {
                  L1: {
                    L2: {
                      if (var5 < 48) {
                        break L2;
                      } else {
                        if (var5 > 57) {
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
                L3: {
                  L4: {
                    L5: {
                      if (var5 < 97) {
                        break L5;
                      } else {
                        if (var5 <= 122) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 48) {
                        break L6;
                      } else {
                        if (var5 > 57) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L3;
                }
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var10);
              } else {
                var3[var4] = (char)(-65 + (var5 - -97));
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
          L7: while (true) {
            if (var2 <= var4) {
              return new String(var10);
            } else {
              L8: {
                var5 = param0.charAt(var4);
                if (var5 < 65) {
                  break L8;
                } else {
                  if (var5 <= 90) {
                    var3[var4] = (char)(-65 + (var5 - -97));
                    var4++;
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                L10: {
                  if (var5 < 97) {
                    break L10;
                  } else {
                    if (var5 <= 122) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  if (var5 < 48) {
                    break L11;
                  } else {
                    if (var5 > 57) {
                      break L11;
                    } else {
                      break L9;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L7;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L7;
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_l = null;
        field_k = null;
        int var1 = -39 % ((48 - param0) / 43);
        field_b = null;
        field_h = null;
        field_f = null;
    }

    sl(boolean param0) {
        ((sl) this).field_g = param0 ? true : false;
    }

    final static int a(boolean param0, wf param1, boolean param2) {
        if (param2) {
            field_l = null;
            return param1.a(param0, -17978);
        }
        return param1.a(param0, -17978);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new tf();
        field_i = "Please enter your age in years";
        field_h = "Orb points: <%0>";
        field_b = "Email: ";
    }
}
