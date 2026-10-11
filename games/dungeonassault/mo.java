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
        int var2 = 0;
        oe var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        oe var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          var4 = (oe) (fe.field_k.e(-24172));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_q > var2; var2++) {
            if (var4.field_s[var2] != null &&
              var4.field_s[var2].field_c == 0) {
              return false;
            }
            if (null != var4.field_o[var2] &&
              var4.field_o[var2].field_c == 0) {
              return false;
            }
          }
          if (param0 < -27) {
            return true;
          }
          field_g = (String[]) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "mo.D(" + param0 + ')');
        }
    }

    final static boolean a(int[] param0, int param1, Random param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          var4_int = -82 / ((-11 - param3) / 41);
          var5 = param0.length - 2;
          while (true) {
            if (0 >= var5) {
              return false;
            }
            var6 = uj.a(param2, 37, var5);
            var7 = param0[var6];
            if (me.field_g[var7].field_a != 0) {
              var5--;
              param0[var6] = param0[var5];
              continue;
            }
            break;
          }
          me.field_g[var7] = new ai(param1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("mo.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ab a(String param0, boolean param1) {
        ab stackIn_4_0 = null;
        ab stackIn_7_0 = null;
        ab stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ab stackIn_24_0 = null;
        ab stackIn_40_0 = null;
        ab stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = DungeonAssault.field_K;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = ri.field_e;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = ta.field_d;
            return stackIn_7_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_11_0 = np.field_E;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = np.field_E;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          if (!param1) {
            field_d = (String) null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = np.field_E;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (lb.field_O.indexOf(var5Lifetime1) == -1) {
                stackIn_45_0 = np.field_E;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("mo.A(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    mo(int param0, ec param1) {
        try {
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "mo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        this.field_c.i(param1, -116);
    }

    static {
        field_e = 0;
        field_b = "Select a raider to revive";
        field_h = "Your raider avoided detection by the monster.";
        field_f = "Order your raider to engage the monster in combat. <br><br>An aggressive attack,<col=8B1717>Charging</col> increases your raider's <%attack> at the expense of their <%defence>.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>, <col=00A7D2>Sneak</col>";
        field_d = "To server list";
    }
}
