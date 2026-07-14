/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static ci[] field_a;

    final static void a(int param0, int param1, int param2, int param3, ci[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Terraphoenix.field_V;
          if (param4 == null) {
            break L0;
          } else {
            if (0 < param3) {
              var6 = param4[param5].field_q;
              var7 = param4[2].field_q;
              var8 = param4[1].field_q;
              param4[0].e(param2, param0, param1);
              param4[2].e(-var7 + param2 + param3, param0, param1);
              l.b(vl.field_e);
              l.i(param2 - -var6, param0, param3 + (param2 + -var7), param0 - -param4[1].field_u);
              var9 = var6 + param2;
              var10 = param3 + (param2 + -var7);
              param2 = var9;
              L1: while (true) {
                if (param2 >= var10) {
                  l.a(vl.field_e);
                  return;
                } else {
                  param4[1].e(param2, param0, param1);
                  param2 = param2 + var8;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static int d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Terraphoenix.field_V;
          if (param0 == 23196) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var1 = 0;
        var2 = 0;
        L1: while (true) {
          if (9 <= var2) {
            return 0;
          } else {
            if (rf.field_B[var2].field_c) {
              if (var1 != ea.field_o) {
                var1++;
                var2++;
                continue L1;
              } else {
                return var2;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        Terraphoenix.field_O = 0;
        if (param0 <= 9) {
            field_a = null;
        }
    }

    final static boolean c(int param0) {
        if (param0 != -25704) {
            return true;
        }
        return ei.field_R;
    }

    final static boolean a(byte param0, boolean param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Terraphoenix.field_V;
          if (param2 < 2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var7 = 106 % ((29 - param0) / 60);
              var6 = 0;
              var8 = param3.length();
              var9 = 0;
              L1: while (true) {
                if (var9 >= var8) {
                  return var5 != 0;
                } else {
                  L2: {
                    var10 = param3.charAt(var9);
                    if (-1 == (var9 ^ -1)) {
                      if (var10 != 45) {
                        if (43 != var10) {
                          break L2;
                        } else {
                          if (!param1) {
                            break L2;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      } else {
                        var4 = 1;
                        var9++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var10 < 48) {
                        break L4;
                      } else {
                        if (var10 > 57) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (90 < var10) {
                          break L5;
                        } else {
                          var10 -= 55;
                          break L3;
                        }
                      }
                    }
                    if (var10 < 97) {
                      return false;
                    } else {
                      if (var10 <= 122) {
                        var10 -= 87;
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var10 < param2) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var10 = -var10;
                        break L6;
                      }
                    }
                    var11 = var10 + param2 * var6;
                    if (var6 == var11 / param2) {
                      var5 = 1;
                      var6 = var11;
                      var9++;
                      continue L1;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6144) {
            field_a = null;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != 92) {
            boolean discarded$0 = bk.c(62);
        }
        param1 = param1 & 8191;
        if (-4097 < param1) {
            return -2049 <= param1 ? va.field_d[4096 - param1] : va.field_d[param1];
        }
        return 6144 <= param1 ? -va.field_d[-param1 + 8192] : -va.field_d[param1 + -4096];
    }

    static {
    }
}
