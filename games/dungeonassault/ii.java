/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ii extends lm implements aa {
    static String field_E;
    md field_B;
    static String[] field_I;
    static int field_G;
    static String field_C;
    static String field_D;
    static String field_J;
    static int field_F;
    static cn field_H;

    final boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        int var10 = DungeonAssault.field_K;
        if (param6 != -84) {
            return false;
        }
        dj var8 = new dj(((ii) this).field_B);
        lm var9 = (lm) (Object) var8.a(-479592473);
        while (var9 != null) {
            // ifeq L104
            if (var9.a((byte) 57)) {
                if (var9.a(param0, param1, param2, param3, param4, param5, (byte) -84)) {
                    return true;
                }
            }
            var9 = (lm) (Object) var8.c(param6 + 17840);
        }
        return false;
    }

    public static void e(byte param0) {
        field_I = null;
        field_D = null;
        field_H = null;
        field_E = null;
        if (param0 != -21) {
            return;
        }
        field_J = null;
        field_C = null;
    }

    ii(int param0, int param1, int param2, int param3, ca param4) {
        super(param0, param1, param2, param3, param4, (pg) null);
        ((ii) this).field_B = new md();
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        if (((ii) this).a(param1, param0, -38, param2)) {
            ((ii) this).a(param0, param2, param1, 1);
            this.a(param2, param1, true, param0);
        }
        if (param3 >= -76) {
            return null;
        }
        return param2;
    }

    private final void a(StringBuilder param0, Hashtable param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        dj var5 = new dj(((ii) this).field_B);
        lm var6 = (lm) (Object) var5.a(-479592473);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3 - -1, param1, param0, (byte) -108);
            var6 = (lm) (Object) var5.c(17756);
        }
        if (!param2) {
            field_C = null;
        }
    }

    private final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ii) this).field_B);
        if (param0 != 0) {
            ii.a(22, (byte) 122, -68, -5, 99, -3, false);
        }
        lm var3 = (lm) (Object) var2.a(-479592473);
        while (var3 != null) {
            var3.f(12591);
            var3 = (lm) (Object) var2.c(param0 + 17756);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = DungeonAssault.field_K;
        if (param4 > param3) {
          if (1 + param3 >= param5) {
            return;
          } else {
            L0: {
              if (param3 + 5 >= param5) {
                break L0;
              } else {
                if (param2 == param0) {
                  break L0;
                } else {
                  var7 = (param2 >> 356820513) - -(param0 >> -1091069343) + (param2 & param0 & 1);
                  var8 = param3;
                  var9 = param0;
                  var10 = param2;
                  var11 = param3;
                  L1: while (true) {
                    if (param5 <= var11) {
                      var11 = 75 % ((param1 - 0) / 61);
                      ii.a(param0, (byte) 94, var9, param3, param4, var8, param6);
                      ii.a(var10, (byte) -127, param2, var8, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = ol.field_k[var11];
                        if (!param6) {
                          stackOut_21_0 = ci.field_n[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = i.field_t[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var7 < var13) {
                        ol.field_k[var11] = ol.field_k[var8];
                        var8++;
                        ol.field_k[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param5 - 1;
            L3: while (true) {
              if (param3 >= var7) {
                return;
              } else {
                var8 = param3;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = ol.field_k[var8];
                    var10 = ol.field_k[1 + var8];
                    if (r.a(2, param6, var9, var10)) {
                      ol.field_k[var8] = var10;
                      ol.field_k[var8 - -1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        int var7 = DungeonAssault.field_K;
        super.a(param0, param1, param2, param3);
        dj var5 = new dj(((ii) this).field_B);
        lm var6 = (lm) (Object) var5.a(-479592473);
        while (var6 != null) {
            // ifeq L90
            var6.a(((ii) this).field_q + param0, param1 + ((ii) this).field_v, param2, param3);
            var6 = (lm) (Object) var5.c(17756);
        }
    }

    final String c(byte param0) {
        dj var2 = null;
        lm var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = DungeonAssault.field_K;
          var2 = new dj(((ii) this).field_B);
          if (param0 >= 3) {
            break L0;
          } else {
            var6 = null;
            ((ii) this).a(70, false, -108, (lm) null, 67, 9);
            break L0;
          }
        }
        var3 = (lm) (Object) var2.a(-479592473);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 80);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (lm) (Object) var2.c(17756);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void e(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ii) this).field_B);
        lm var3 = (lm) (Object) var2.a(-479592473);
        while (var3 != null) {
            var3.e(119);
            var3 = (lm) (Object) var2.c(17756);
        }
        if (param0 < 1) {
            field_G = -31;
        }
    }

    final void b(byte param0, lm param1) {
        if (param0 > -41) {
            Object var4 = null;
            boolean discarded$0 = ((ii) this).a((lm) null, -107, -45, -50, -10, (byte) -60, -91);
        }
        ((ii) this).field_B.a((ne) (Object) param1, false);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (param0 == param2) {
            if (!(null == ((ii) this).field_o)) {
                ((ii) this).field_o.a((byte) 34, (lm) this, param1, param3, true);
            }
        }
        dj var5 = new dj(((ii) this).field_B);
        lm var6 = (lm) (Object) var5.b(-1225818257);
        while (var6 != null) {
            var6.a(param0, ((ii) this).field_q + param1, 0, ((ii) this).field_v + param3);
            var6 = (lm) (Object) var5.d(1834857157);
        }
    }

    final boolean a(byte param0) {
        if (param0 < 6) {
            Object var3 = null;
            boolean discarded$0 = ((ii) this).a((lm) null, -89, 42, 5, 87, (byte) 18, -28);
        }
        return ((ii) this).g(-20311) != null ? true : false;
    }

    final boolean a(byte param0, lm param1) {
        dj var5 = null;
        lm var6 = null;
        int var7 = DungeonAssault.field_K;
        if (((ii) this).field_B.a((byte) -71)) {
            return false;
        }
        dj var3 = new dj(((ii) this).field_B);
        lm var4 = (lm) (Object) var3.a(-479592473);
        while (var4 != null) {
            if (!(!var4.a((byte) 11))) {
                var5 = new dj(((ii) this).field_B);
                ne discarded$0 = var5.a(true, (ne) (Object) var4);
                var6 = (lm) (Object) var5.c(17756);
                while (var6 != null) {
                    if (!(!var6.a(34, param1))) {
                        return true;
                    }
                    var6 = (lm) (Object) var5.c(17756);
                }
            }
            var4 = (lm) (Object) var3.c(17756);
        }
        if (param0 != -5) {
            field_C = null;
            return false;
        }
        return false;
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        int var7 = DungeonAssault.field_K;
        dj var5 = new dj(((ii) this).field_B);
        lm var8 = (lm) (Object) var5.a(-479592473);
        while (var8 != null) {
            // ifeq L86
            if (var8.a((byte) 59)) {
                if (var8.a(param0, param1, param2, (byte) 112)) {
                    return true;
                }
            }
            var8 = (lm) (Object) var5.c(17756);
        }
        if (param3 < 55) {
            field_H = null;
        }
        int var6 = param2;
        if ((var6 ^ -1) == -81) {
            return !qk.field_e[81] ? ((ii) this).a((byte) -5, param0) : ((ii) this).a(param0, (byte) 71);
        }
        return false;
    }

    final int d(int param0) {
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int var4 = 32 / ((67 - param0) / 58);
        int var2 = 0;
        dj var3 = new dj(((ii) this).field_B);
        lm var5 = (lm) (Object) var3.a(-479592473);
        while (var5 != null) {
            var6 = var5.d(127);
            if (var2 < var6) {
                var2 = var6;
            }
            var5 = (lm) (Object) var3.c(17756);
        }
        return var2;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 ^ param0, param1, param2, param3, param4);
        this.h(0);
    }

    lm g(int param0) {
        dj var2 = null;
        lm var3 = null;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == -20311) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        var2 = new dj(((ii) this).field_B);
        var3 = (lm) (Object) var2.a(param0 ^ 479612750);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.a((byte) 52)) {
              var3 = (lm) (Object) var2.c(17756);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, lm param1) {
        int var5 = DungeonAssault.field_K;
        dj var3 = new dj(((ii) this).field_B);
        if (param0 != 34) {
            return true;
        }
        lm var4 = (lm) (Object) var3.a(-479592473);
        while (var4 != null) {
            if (!(!var4.a(34, param1))) {
                return true;
            }
            var4 = (lm) (Object) var3.c(17756);
        }
        return false;
    }

    final boolean a(lm param0, byte param1) {
        dj var5 = null;
        lm var6 = null;
        int var7 = DungeonAssault.field_K;
        if (!(!((ii) this).field_B.a((byte) -70))) {
            return false;
        }
        dj var3 = new dj(((ii) this).field_B);
        lm var4 = (lm) (Object) var3.b(-1225818257);
        while (var4 != null) {
            if (var4.a((byte) 13)) {
                var5 = new dj(((ii) this).field_B);
                ne discarded$0 = var5.a((ne) (Object) var4, false);
                var6 = (lm) (Object) var5.d(1834857157);
                while (var6 != null) {
                    if (!(!var6.a(34, param0))) {
                        return true;
                    }
                    var6 = (lm) (Object) var5.d(1834857157);
                }
            }
            var4 = (lm) (Object) var3.d(1834857157);
        }
        if (param1 != 71) {
            lm discarded$1 = ((ii) this).g(51);
            return false;
        }
        return false;
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var11 = DungeonAssault.field_K;
        dj var8 = new dj(((ii) this).field_B);
        int var9 = -121 / ((param5 - -80) / 35);
        lm var10 = (lm) (Object) var8.a(-479592473);
        while (var10 != null) {
            // ifeq L108
            if (!(!var10.a(param0, param1, param2, ((ii) this).field_q + param3, param4, (byte) 53, ((ii) this).field_v + param6))) {
                return true;
            }
            var10 = (lm) (Object) var8.c(17756);
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        int var9 = DungeonAssault.field_K;
        dj var7 = new dj(((ii) this).field_B);
        lm var8 = (lm) (Object) var7.a(-479592473);
        while (var8 != null) {
            // ifeq L86
            var8.a(((ii) this).field_v + param0, true, param2, param3, param4 - -((ii) this).field_q, param5);
            var8 = (lm) (Object) var7.c(17756);
        }
        if (!param1) {
            ii.a(-2, (byte) -30, 118, -44, -40, -125, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Skip";
        field_J = "<%col_detect>Detect +3 to all monsters.</col>";
        field_C = "Defeated";
        field_F = 3;
        field_I = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = -1;
    }
}
