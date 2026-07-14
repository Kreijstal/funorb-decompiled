/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kf {
    static pf field_b;
    static int field_a;

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -49) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = kf.a(-21, (CharSequence) null, true, -109);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 48) {
              break L2;
            } else {
              if (param1 > 57) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static tg[] a(int param0, int param1, gk param2, boolean param3) {
        if (!c.a(param2, param3, param0, param1)) {
            return null;
        }
        if (param3) {
            field_a = 78;
        }
        return ng.a((byte) -107);
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(int param0, java.awt.Component param1);

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 53) {
            boolean discarded$0 = kf.a(126, 'ﾑ');
        }
    }

    abstract int a(int param0);

    final static int a(int param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = Bounce.field_N;
          if (2 > param0) {
            break L0;
          } else {
            if (param0 <= 36) {
              L1: {
                if (param3 == 48) {
                  break L1;
                } else {
                  var12 = null;
                  int discarded$1 = kf.a(40, (CharSequence) null, false, -22);
                  break L1;
                }
              }
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (97 > var9) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param0) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var10 / param0 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    static {
    }
}
