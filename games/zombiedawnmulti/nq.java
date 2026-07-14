/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nq extends qa {
    int field_x;
    static th field_s;
    int field_u;
    int field_y;
    static String field_A;
    int field_z;
    static cj field_v;
    int field_w;
    static cj field_t;
    int field_r;
    static int[] field_q;

    final static void f(int param0) {
        og.a(0, jl.b(0));
        int var1 = -5 % ((33 - param0) / 60);
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 >= -92) {
            return;
        }
        field_t = null;
        field_q = null;
        field_A = null;
        field_v = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        eq.a((java.awt.Component) (Object) param1, (byte) 127);
        of.a(-1693, (java.awt.Component) (Object) param1);
        if (param0 != 95) {
          L0: {
            field_s = null;
            if (ll.field_a != null) {
              ll.field_a.a((java.awt.Component) (Object) param1, (byte) 62);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ll.field_a != null) {
              ll.field_a.a((java.awt.Component) (Object) param1, (byte) 62);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static ae a(int param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 != 22272) {
          field_t = null;
          var2 = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.d((byte) 69);
          return (ae) (Object) aq.a(var2, false, var4, var3);
        } else {
          var2 = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.d((byte) 69);
          return (ae) (Object) aq.a(var2, false, var4, var3);
        }
    }

    final static String a(int param0, CharSequence param1) {
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param1.length();
        if (param0 > -21) {
          L0: {
            var7 = null;
            ae discarded$1 = nq.a(-8, (ga) null);
            if ((var2 ^ -1) < -21) {
              var2 = 20;
              break L0;
            } else {
              break L0;
            }
          }
          var12 = new char[var2];
          var10 = var12;
          var9 = var10;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (var5 >= 65) {
              if (var5 <= 90) {
                var3[var4] = (char)(97 + var5 + -65);
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              } else {
                if (var5 < 97) {
                  if (var5 >= 48) {
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
                      break L1;
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
              }
            } else {
              if (var5 < 97) {
                if (var5 >= 48) {
                  if (var5 <= 57) {
                    var3[var4] = (char)var5;
                    var4++;
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
                  L3: {
                    L4: {
                      if (var5 < 48) {
                        break L4;
                      } else {
                        if (var5 > 57) {
                          break L4;
                        } else {
                          var3[var4] = (char)var5;
                          var4++;
                          break L3;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L3;
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
            }
          } else {
            return new String(var12);
          }
        } else {
          L5: {
            if ((var2 ^ -1) < -21) {
              var2 = 20;
              break L5;
            } else {
              break L5;
            }
          }
          var13 = new char[var2];
          var11 = var13;
          var9 = var11;
          var8 = var9;
          var3 = var8;
          var4 = 0;
          L6: while (true) {
            if (var2 <= var4) {
              return new String(var13);
            } else {
              L7: {
                var5 = param1.charAt(var4);
                if (var5 < 65) {
                  break L7;
                } else {
                  if (var5 > 90) {
                    break L7;
                  } else {
                    var3[var4] = (char)(97 + var5 + -65);
                    var4++;
                    var4++;
                    continue L6;
                  }
                }
              }
              L8: {
                L9: {
                  if (var5 < 97) {
                    break L9;
                  } else {
                    if (122 >= var5) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5 < 48) {
                    break L10;
                  } else {
                    if (var5 > 57) {
                      break L10;
                    } else {
                      break L8;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                continue L6;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L6;
            }
          }
        }
    }

    nq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Get the humans into your portal!";
        field_q = new int[]{100, 267, 374, 460, 520, 580};
        field_s = new th();
    }
}
