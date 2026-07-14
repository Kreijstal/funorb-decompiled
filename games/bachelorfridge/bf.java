/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bf extends bw {
    static lw[] field_h;
    static hw[] field_g;
    static boolean field_f;

    abstract void a(op param0, int param1);

    bf() {
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = BachelorFridge.field_y;
        if (param1 == -44) {
          if ((param0 ^ -1) <= -3) {
            if (36 >= param0) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = param3.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param2) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (57 < var9) {
                          break L3;
                        } else {
                          var9 -= 48;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (65 > var9) {
                        break L4;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 > 122) {
                          break L5;
                        } else {
                          var9 -= 87;
                          break L2;
                        }
                      }
                    }
                    return false;
                  }
                  if (param0 <= var9) {
                    return false;
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var6 != var10 / param0) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L0;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          var12 = null;
          boolean discarded$1 = bf.a(118, -16, false, (CharSequence) null);
          if ((param0 ^ -1) <= -3) {
            if (36 >= param0) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param3.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param2) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (57 < var9) {
                          break L10;
                        } else {
                          var9 -= 48;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (65 > var9) {
                        break L11;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (var9 > 122) {
                          break L12;
                        } else {
                          var9 -= 87;
                          break L9;
                        }
                      }
                    }
                    return false;
                  }
                  if (param0 <= var9) {
                    return false;
                  } else {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var6 != var10 / param0) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L7;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        ik var5 = null;
        String var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        nea var3 = hj.b(0, param0, param1);
        int var4 = 6 / ((-4 - param2) / 36);
        if (var3 != null) {
            ms.field_u.a(117, false);
            var5 = ms.field_u;
            var6_ref = cd.field_p;
            var5.field_a.a(var6_ref, true, 5);
            var5 = ms.field_u;
            var6 = nfa.field_a;
            var7 = jc.field_r;
            var5.field_a.a(0, false, var6, 0, var7);
        }
        wb.a(param1, param0, -115);
    }

    public static void c(byte param0) {
        int var1 = -105 / ((param0 - -1) / 57);
        field_g = null;
        field_h = null;
    }

    abstract void a(int param0, lu param1);

    static {
    }
}
