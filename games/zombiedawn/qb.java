/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb {
    static int field_b;
    int field_d;
    int field_g;
    int field_a;
    static int field_i;
    int field_h;
    static String field_f;
    int field_j;
    static int[] field_c;
    int field_e;

    abstract void a(int param0, int param1, int param2);

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
          var6 = ZombieDawn.field_J;
          var2 = param1.length();
          if (-21 <= (var2 ^ -1)) {
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
        if (param0 > -106) {
          field_f = null;
          var4 = 0;
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (65 <= var5) {
              if (90 >= var5) {
                var3[var4] = (char)(97 + (-65 + var5));
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var10);
              } else {
                if (97 > var5) {
                  if (var5 >= 48) {
                    if (var5 > 57) {
                      var3[var4] = (char)95;
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
                    return new String(var10);
                  }
                } else {
                  if (var5 > 122) {
                    if (var5 >= 48) {
                      if (var5 > 57) {
                        var3[var4] = (char)95;
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
                      return new String(var10);
                    }
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                }
              }
            } else {
              if (97 > var5) {
                if (var5 >= 48) {
                  if (var5 <= 57) {
                    var3[var4] = (char)var5;
                    var4++;
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
                    return new String(var10);
                  }
                } else {
                  var3[var4] = (char)95;
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
                    break L1;
                  }
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
                  var4++;
                  return new String(var10);
                }
              }
            }
          } else {
            return new String(var10);
          }
        } else {
          var4 = 0;
          L3: while (true) {
            if (var2 <= var4) {
              return new String(var10);
            } else {
              L4: {
                var5 = param1.charAt(var4);
                if (65 > var5) {
                  break L4;
                } else {
                  if (90 < var5) {
                    break L4;
                  } else {
                    var3[var4] = (char)(97 + (-65 + var5));
                    var4++;
                    var4++;
                    continue L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (97 > var5) {
                    break L6;
                  } else {
                    if (var5 <= 122) {
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
                    if (var5 > 57) {
                      break L7;
                    } else {
                      break L5;
                    }
                  }
                }
                var3[var4] = (char)95;
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

    abstract void a(int param0, int param1);

    final static void a(boolean param0, int param1) {
        hn var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        ge.field_c = param1;
        if (!param0) {
          var2 = (hn) (Object) fj.field_i.b((byte) 26);
          L0: while (true) {
            if (var2 == null) {
              if (sf.field_n != null) {
                var2 = (hn) (Object) sf.field_n.b((byte) 26);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (!var2.field_k.a((byte) 73)) {
                        var2.b(-27598);
                        break L2;
                      } else {
                        var2.field_n.g(128 + ge.field_c * var2.field_i >> -756288440);
                        break L2;
                      }
                    }
                    var2 = (hn) (Object) sf.field_n.a(param0);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (var2.field_k.a((byte) 73)) {
                  var2.field_n.g(ge.field_c * var2.field_i + 128 >> 44158888);
                  break L3;
                } else {
                  var2.b(-27598);
                  break L3;
                }
              }
              var2 = (hn) (Object) fj.field_i.a(false);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != 91) {
          return 18;
        } else {
          return (1044493 & 15 * (param0 & 65280)) >> -559000476 | 16711935 & 15 * (param0 & 16711935) >> -601205116;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -6633) {
            int discarded$0 = qb.a(62, (byte) -7);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = new int[8192];
    }
}
