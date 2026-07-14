/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private nh[] field_c;
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            gk.a((fg) null, 112);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(fg param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        fg var5 = null;
        fg var6 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0.field_i == null) {
          return;
        } else {
          if (param0.field_g == 0) {
            if (param0.field_d == 0) {
              if (param1 != -15980) {
                L0: {
                  field_b = null;
                  if (null == param0.field_e) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
                ja.a(param0, (byte) -60);
                return;
              } else {
                L1: {
                  if (null == param0.field_e) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ja.a(param0, (byte) -60);
                return;
              }
            } else {
              L2: {
                var2 = 0;
                if (sf.field_e <= var2) {
                  break L2;
                } else {
                  L3: {
                    var6 = mi.field_c[var2];
                    if (2 != var6.field_a) {
                      var2++;
                      break L3;
                    } else {
                      L4: {
                        if (var6.field_g != param0.field_g) {
                          var2++;
                          break L4;
                        } else {
                          if (param0.field_d != var6.field_d) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  break L2;
                }
              }
              if (param1 != -15980) {
                L5: {
                  field_b = null;
                  if (null == param0.field_e) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ja.a(param0, (byte) -60);
                return;
              } else {
                L6: {
                  if (null == param0.field_e) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ja.a(param0, (byte) -60);
                return;
              }
            }
          } else {
            L7: {
              var2 = 0;
              if (sf.field_e <= var2) {
                break L7;
              } else {
                L8: {
                  var5 = mi.field_c[var2];
                  if (2 != var5.field_a) {
                    var2++;
                    break L8;
                  } else {
                    L9: {
                      if (var5.field_g != param0.field_g) {
                        var2++;
                        break L9;
                      } else {
                        if (param0.field_d != var5.field_d) {
                          break L9;
                        } else {
                          return;
                        }
                      }
                    }
                    var2++;
                    break L8;
                  }
                }
                var2++;
                var2++;
                var2++;
                var2++;
                break L7;
              }
            }
            if (param1 != -15980) {
              L10: {
                field_b = null;
                if (null == param0.field_e) {
                  break L10;
                } else {
                  break L10;
                }
              }
              ja.a(param0, (byte) -60);
              return;
            } else {
              L11: {
                if (null == param0.field_e) {
                  break L11;
                } else {
                  break L11;
                }
              }
              ja.a(param0, (byte) -60);
              return;
            }
          }
        }
    }

    gk(nh[] param0) {
        ((gk) this).field_c = param0;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = ph.a(param1, (byte) -21, '_', "");
        var3 = vj.a(param2, -121);
        if (param0 == -1) {
          if (-1 == param1.indexOf(param2)) {
            if (param1.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_a = null;
          if (-1 != param1.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (param1.indexOf(var3) == -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param4 != 7453) {
          var7 = null;
          gk.a((fg) null, -125);
          am.a(param3, param0, param2, ((gk) this).field_c, 14673, param1);
          return;
        } else {
          am.a(param3, param0, param2, ((gk) this).field_c, 14673, param1);
          return;
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (pi.field_O != null) {
            var1 = pi.field_O.b(false);
        }
        if (param0 == var1.length()) {
            var1 = am.h(0);
        }
        if (var1.length() == 0) {
            var1 = u.field_e;
        }
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Username: ";
        field_a = "OVER <%0>";
    }
}
