/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static wk[] field_a;
    static String field_c;
    static int field_g;
    static String field_f;
    static String field_h;
    static String[] field_e;
    static String field_d;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -3) {
          field_b = null;
          field_h = null;
          field_c = null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_h = null;
          field_c = null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
            String discarded$0 = db.a(false, '!');
            return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param3 == 1661761121) {
          if (sm.field_d >= param4) {
            if (param2 >= sm.field_d) {
              if (ko.field_b >= param1) {
                if (ko.field_b <= param0) {
                  var5 = param2 + param4 >> -533106143;
                  var6 = param0 + param1 >> 1661761121;
                  var7 = -param4 + param2 >> -624927903;
                  var8 = -param1 + param0 >> -1743943711;
                  if (var8 < var7) {
                    L0: {
                      if (Math.abs(var5 + -sm.field_d) + Math.abs(var6 + -ko.field_b) * var7 / var8 > var7) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L0;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L0;
                      }
                    }
                    return stackIn_33_0 != 0;
                  } else {
                    L1: {
                      if (Math.abs(var6 - ko.field_b) - -(Math.abs(var5 - sm.field_d) * var8 / var7) > var8) {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        break L1;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L1;
                      }
                    }
                    return stackIn_37_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_e = null;
          if (sm.field_d >= param4) {
            if (param2 >= sm.field_d) {
              if (ko.field_b >= param1) {
                if (ko.field_b <= param0) {
                  var5 = param2 + param4 >> -533106143;
                  var6 = param0 + param1 >> 1661761121;
                  var7 = -param4 + param2 >> -624927903;
                  var8 = -param1 + param0 >> -1743943711;
                  if (var8 < var7) {
                    L2: {
                      if (Math.abs(var5 + -sm.field_d) + Math.abs(var6 + -ko.field_b) * var7 / var8 > var7) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                    return stackIn_15_0 != 0;
                  } else {
                    if (Math.abs(var6 - ko.field_b) - -(Math.abs(var5 - sm.field_d) * var8 / var7) > var8) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static hl a(String param0, int param1) {
        String var2 = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        Object var16 = null;
        var16 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != bk.field_a) {
          L0: {
            var10 = (CharSequence) (Object) param0;
            var2 = k.a(var10, false);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var10;
              break L0;
            }
          }
          var3 = (hl) (Object) bk.field_a.a((byte) -27, (long)var2.hashCode());
          if (param1 > -40) {
            db.a(-88);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var12 = (CharSequence) (Object) var3.field_Mb;
                  var4 = k.a(var12, false);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_Mb;
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (hl) (Object) bk.field_a.d(-348);
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            L3: while (true) {
              if (var3 != null) {
                L4: {
                  var11 = (CharSequence) (Object) var3.field_Mb;
                  var4 = k.a(var11, false);
                  if (var4 != null) {
                    break L4;
                  } else {
                    var4 = var3.field_Mb;
                    break L4;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (hl) (Object) bk.field_a.d(-348);
                  continue L3;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
            return -83;
        }
        return param1 + (so.field_b.field_a - rs.field_k >> 599425889);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Offer rematch";
        field_g = 20;
        field_d = "AnimateBattle";
    }
}
