/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends mh {
    static String field_n;
    static v field_o;
    static int field_m;
    static int field_l;
    static String field_p;

    public static void b(int param0) {
        field_p = null;
        field_o = null;
        int var1 = -52 % ((-62 - param0) / 53);
        field_n = null;
    }

    final ul a(boolean param0) {
        if (!param0) {
            field_o = null;
            return oh.field_e;
        }
        return oh.field_e;
    }

    re(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(byte param0, cj param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 < -91) {
          L0: {
            var2 = null;
            if (param1.field_r == null) {
              break L0;
            } else {
              L1: {
                var5 = param1.field_r;
                var2 = var5;
                var2 = var5;
                if ((param1.field_e ^ -1) != -2) {
                  break L1;
                } else {
                  var2 = "<img=0>" + var5;
                  break L1;
                }
              }
              if (2 != param1.field_e) {
                break L0;
              } else {
                var2 = "<img=1>" + var2;
                var3 = var2;
                var3 = var2;
                break L0;
              }
            }
          }
          var3 = "";
          if (2 != param1.field_n) {
            L2: {
              if (0 != param1.field_n) {
                break L2;
              } else {
                if (ch.field_e) {
                  var3 = "[" + fj.field_a + "] ";
                  break L2;
                } else {
                  L3: {
                    if (param1.field_n != 1) {
                      break L3;
                    } else {
                      var3 = "[" + oi.a(new String[1], ra.field_c, 2) + "] ";
                      break L3;
                    }
                  }
                  if (-5 == (param1.field_n ^ -1)) {
                    if (tl.field_e == null) {
                      L4: {
                        if (3 != param1.field_n) {
                          break L4;
                        } else {
                          var3 = "[#" + param1.field_d + "] ";
                          break L4;
                        }
                      }
                      L5: {
                        if (!param1.field_j) {
                          var3 = var3 + var2 + ": ";
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return var3;
                    } else {
                      L6: {
                        var3 = "[" + tl.field_e + "] ";
                        if (3 != param1.field_n) {
                          break L6;
                        } else {
                          var3 = "[#" + param1.field_d + "] ";
                          break L6;
                        }
                      }
                      L7: {
                        if (!param1.field_j) {
                          var3 = var3 + var2 + ": ";
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return var3;
                    }
                  } else {
                    L8: {
                      if (3 != param1.field_n) {
                        break L8;
                      } else {
                        var3 = "[#" + param1.field_d + "] ";
                        break L8;
                      }
                    }
                    L9: {
                      if (!param1.field_j) {
                        var3 = var3 + var2 + ": ";
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return var3;
                  }
                }
              }
            }
            L10: {
              if (param1.field_n != 1) {
                break L10;
              } else {
                var3 = "[" + oi.a(new String[1], ra.field_c, 2) + "] ";
                break L10;
              }
            }
            L11: {
              if (-5 != (param1.field_n ^ -1)) {
                break L11;
              } else {
                if (tl.field_e != null) {
                  var3 = "[" + tl.field_e + "] ";
                  break L11;
                } else {
                  L12: {
                    if (3 != param1.field_n) {
                      break L12;
                    } else {
                      var3 = "[#" + param1.field_d + "] ";
                      break L12;
                    }
                  }
                  L13: {
                    if (!param1.field_j) {
                      var3 = var3 + var2 + ": ";
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return var3;
                }
              }
            }
            L14: {
              if (3 != param1.field_n) {
                break L14;
              } else {
                var3 = "[#" + param1.field_d + "] ";
                break L14;
              }
            }
            if (param1.field_j) {
              return var3;
            } else {
              var3 = var3 + var2 + ": ";
              return var3;
            }
          } else {
            if (!param1.field_j) {
              if (-1 == (param1.field_m ^ -1)) {
                if (0 != param1.field_a) {
                  var3 = oi.a(new String[1], mf.field_d, 2);
                  return var3;
                } else {
                  var3 = oi.a(new String[1], lm.field_c, 2);
                  return var3;
                }
              } else {
                var3 = oi.a(new String[1], mf.field_d, 2);
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return null;
        }
    }

    final static void c(byte param0) {
        oi.field_h.setLength(0);
        if (param0 != 121) {
            return;
        }
        sd.field_e = 0;
    }

    final static String a(String param0, boolean param1, char param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        if (!param1) {
          var4 = param3.length();
          var5 = param0.length();
          var6 = var4;
          var7 = var5 + -1;
          if (0 != var7) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param3.indexOf((int) param2, var8_int);
              if (var8_int >= 0) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param3.indexOf((int) param2, var9);
                  if (0 > var10) {
                    StringBuilder discarded$6 = var13.append(param3.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$7 = var13.append(param3.substring(var9, var10));
                    var9 = var10 - -1;
                    StringBuilder discarded$8 = var13.append(param0);
                    continue L1;
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param3.indexOf((int) param2, var9);
              if (0 > var10) {
                StringBuilder discarded$9 = var12.append(param3.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$10 = var12.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$11 = var12.append(param0);
                continue L2;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = 0;
        field_p = "Please enter a year between <%0> and <%1>";
    }
}
