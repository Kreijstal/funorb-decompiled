/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sc {
    sd[] field_c;
    static bi[] field_h;
    static int[] field_i;
    static rf field_a;
    static String field_e;
    static int[] field_d;
    static int field_f;
    static String[] field_g;
    static String field_j;
    static String field_b;

    final static String a(String param0, char param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Confined.field_J ? 1 : 0;
          var4 = param0.length();
          var5 = param2.length();
          var6 = var4;
          var7 = -1 + var5;
          var8 = 30 % ((-18 - param3) / 49);
          if (0 == var7) {
            break L0;
          } else {
            var9_int = 0;
            L1: while (true) {
              var9_int = param0.indexOf((int) param1, var9_int);
              if (var9_int >= 0) {
                var6 = var6 + var7;
                var9_int++;
                continue L1;
              } else {
                break L0;
              }
            }
          }
        }
        var9 = new StringBuilder(var6);
        var10 = 0;
        L2: while (true) {
          var11 = param0.indexOf((int) param1, var10);
          if (0 > var11) {
            StringBuilder discarded$3 = var9.append(param0.substring(var10));
            return var9.toString();
          } else {
            StringBuilder discarded$4 = var9.append(param0.substring(var10, var11));
            StringBuilder discarded$5 = var9.append(param2);
            var10 = var11 - -1;
            continue L2;
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        sd var4 = null;
        int var5 = Confined.field_J ? 1 : 0;
        for (var3 = 0; var3 < ((sc) this).field_c.length; var3++) {
            var4 = ((sc) this).field_c[var3];
            if (param1 < var4.field_e.length) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_e.length);
        }
        if (param0 > -68) {
            field_g = null;
        }
        return ((sc) this).field_c.length;
    }

    final int a(boolean param0) {
        int var2 = 0;
        sd[] var3 = null;
        int var4 = 0;
        sd var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        var2 = -1;
        if (param0) {
          L0: {
            if (((sc) this).field_c == null) {
              break L0;
            } else {
              var3 = ((sc) this).field_c;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b(61);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var2;
        } else {
          return 51;
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 23791) {
          L0: {
            L1: {
              if (null == ((sc) this).field_c) {
                break L1;
              } else {
                if (((sc) this).field_c.length <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = ((sc) this).field_c[-1 + ((sc) this).field_c.length].field_a - ((sc) this).field_c[0].field_d;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -87;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_j = null;
        if (param0 != -30048) {
            sc.a(-29);
        }
    }

    final int a(int param0, int param1) {
        sd var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        sd[] var7 = ((sc) this).field_c;
        sd[] var3 = var7;
        int var4 = 0;
        if (param1 >= -88) {
            return 46;
        }
        while (var7.length > var4) {
            var5 = var7[var4];
            if (var5.field_e.length > param0) {
                return var5.field_e[param0];
            }
            param0 = param0 - (var5.field_e.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        sd var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Confined.field_J ? 1 : 0;
          if (((sc) this).field_c == null) {
            break L0;
          } else {
            if (((sc) this).field_c.length == 0) {
              break L0;
            } else {
              if (((sc) this).field_c[0].field_d <= param0) {
                if (param0 <= ((sc) this).field_c[-1 + ((sc) this).field_c.length].field_a) {
                  if (1 != ((sc) this).field_c.length) {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param1 < -123) {
                        break L1;
                      } else {
                        int discarded$2 = ((sc) this).a(-123, 16);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 >= ((sc) this).field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((sc) this).field_c[var5];
                          if (var6.field_d > param0) {
                            break L3;
                          } else {
                            if (var6.field_a >= param0) {
                              var7 = var6.a((byte) 85, param2);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_e.length + -1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((sc) this).field_c[0].a((byte) 85, param2);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param3.length();
        if (param2 == 28438) {
          var8 = 0;
          L0: while (true) {
            if (var8 >= var7) {
              if ((var5 ^ -1) < -1) {
                return (param1 - param0 << -242620312) / var5;
              } else {
                return 0;
              }
            } else {
              var9 = param3.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
                if (62 == var9) {
                  var6 = 0;
                  var8++;
                  continue L0;
                } else {
                  if (var6 == 0) {
                    if (32 == var9) {
                      var5++;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          return -83;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new bi[4];
        field_i = new int[8192];
        field_a = new rf();
        field_e = "Charge#cannon#This weapon is difficult to control,#since it takes time to charge and#will fire as soon as it is ready.";
        field_f = 0;
        field_d = new int[10];
        field_b = "Password: ";
        field_j = "You already have 20 homing missiles";
    }
}
