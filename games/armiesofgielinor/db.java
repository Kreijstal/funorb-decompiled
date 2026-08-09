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
          field_b = (String) null;
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
            db.a(false, '!');
            return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
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
                        stackIn_33_0 = 0;
                        break L0;
                      } else {
                        stackIn_33_0 = 1;
                        break L0;
                      }
                    }
                    return stackIn_33_0 != 0;
                  } else {
                    L1: {
                      if (Math.abs(var6 - ko.field_b) - -(Math.abs(var5 - sm.field_d) * var8 / var7) > var8) {
                        stackIn_37_0 = 0;
                        break L1;
                      } else {
                        stackIn_37_0 = 1;
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
          field_e = (String[]) null;
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
                        stackIn_15_0 = 0;
                        break L2;
                      } else {
                        stackIn_15_0 = 1;
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
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        hl stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != bk.field_a) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = k.a(var6, false);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              L2: {
                var3 = (hl) ((Object) bk.field_a.a((byte) -27, (long)var2.hashCode()));
                if (param1 <= -40) {
                  break L2;
                } else {
                  db.a(-88);
                  break L2;
                }
              }
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_Mb);
                    var4 = k.a(var7, false);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_Mb;
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (hl) ((Object) bk.field_a.d(-348));
                    continue L3;
                  } else {
                    stackIn_14_0 = (hl) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2_ref);

            stackIn_19_1 = new StringBuilder().append("db.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_3_0);
        } else {
          return stackIn_14_0;
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
            return -83;
        }
        return param1 + (so.field_b.field_a - rs.field_k >> 599425889);
    }

    static {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Offer rematch";
        field_g = 20;
        field_d = "AnimateBattle";
    }
}
