/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mo {
    static int field_e;
    ec field_c;
    static int field_a;
    static String field_b;
    static String[] field_g;
    static String field_h;
    static String field_f;
    static String field_d;

    final static boolean b(int param0) {
        oe var1 = null;
        int var2 = 0;
        int var3 = 0;
        oe var4 = null;
        var3 = DungeonAssault.field_K;
        var4 = (oe) (Object) fe.field_k.e(-24172);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var1.field_q <= var2) {
              if (param0 < -27) {
                return true;
              } else {
                field_g = null;
                return true;
              }
            } else {
              L1: {
                if (var4.field_s[var2] != null) {
                  if (-1 == (var4.field_s[var2].field_c ^ -1)) {
                    return false;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (null != var4.field_o[var2]) {
                if (-1 == (var4.field_o[var2].field_c ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final static boolean a(int[] param0, int param1, Random param2, byte param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        int var4 = -82 / ((-11 - param3) / 41);
        int var5 = param0.length - 2;
        while (0 < var5) {
            var6 = uj.a(param2, 37, var5);
            var7 = param0[var6];
            if (-1 == (me.field_g[var7].field_a ^ -1)) {
                me.field_g[var7] = new ai(param1);
                return true;
            }
            var5--;
            param0[var6] = param0[var5];
        }
        return false;
    }

    final static ab a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = DungeonAssault.field_K;
        var2 = param0.length();
        if (-1 == var2) {
          return ri.field_e;
        } else {
          if (-65 >= var2) {
            if (34 != param0.charAt(0)) {
              L0: {
                if (param1) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (46 == var5) {
                    L2: {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        if (var4 == -1 + var2) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return np.field_E;
                  } else {
                    if ((lb.field_O.indexOf(var5) ^ -1) == 0) {
                      return np.field_E;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (param0.charAt(var2 + -1) == 34) {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (var4 < var2 - 1) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L4;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var5 != 34) {
                          break L5;
                        } else {
                          if (var3 != 0) {
                            break L5;
                          } else {
                            return np.field_E;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return np.field_E;
              }
            }
          } else {
            return ta.field_d;
          }
        }
    }

    mo(int param0, ec param1) {
        ((mo) this).field_c = param1;
    }

    public static void a(int param0) {
        if (param0 != 2) {
            return;
        }
        field_h = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_d = null;
    }

    mo(int param0, int param1) {
        this(param0, new ec(2));
        ((mo) this).field_c.i(param1, -116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = "Select a raider to revive";
        field_h = "Your raider avoided detection by the monster.";
        field_f = "Order your raider to engage the monster in combat. <br><br>An aggressive attack,<col=8B1717>Charging</col> increases your raider's <%attack> at the expense of their <%defence>.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>, <col=00A7D2>Sneak</col>";
        field_d = "To server list";
    }
}
