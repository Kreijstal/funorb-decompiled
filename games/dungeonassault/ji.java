/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji extends da {
    static int[] field_F;
    static cn field_G;
    static String field_H;
    private md field_I;

    final void a(lm param0, int param1) {
        rf var3 = null;
        boolean discarded$0 = false;
        if (!(param0 instanceof rf)) {
            throw new IllegalArgumentException();
        }
        if (param1 != -1) {
            return;
        }
        try {
            var3 = (rf) ((Object) param0);
            this.field_I.b(var3, false);
            var3.field_T = true;
            discarded$0 = var3.a(34, (lm) (this));
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (!(this.field_o == null)) {
            this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
        }
        dj var5 = new dj(this.field_I);
        if (param2 != 0) {
            this.field_I = (md) null;
        }
        lm var6 = (lm) ((Object) var5.b(-1225818257));
        while (var6 != null) {
            var6.a(param0, param1 + this.field_q, 0, param3 - -this.field_v);
            var6 = (lm) ((Object) var5.d(1834857157));
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
            return 48;
        }
        return uj.a(ld.field_f, 37, 1 + -param2 + param0) + param2;
    }

    final static boolean a(String param0, int param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 <= -30) {
                break L1;
              } else {
                field_G = (cn) null;
                break L1;
              }
            }
            try {
              L2: {
                if (qg.field_n.startsWith("win")) {
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 3;
                      break L2;
                    } else {
                      if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L2;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L2;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref2);
            stackOut_22_1 = new StringBuilder().append("ji.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final void b(boolean param0) {
        int discarded$0 = 0;
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (!param0) {
            discarded$0 = ji.a(-59, true, -77);
        }
        rf var3 = (rf) ((Object) var2.a(-479592473));
        while (var3 != null) {
            if (!(!var3.f((byte) -90))) {
                var3.a(false);
            }
            var3 = (rf) ((Object) var2.c(17756));
        }
        this.field_D = (lm) ((Object) this.i(32));
    }

    public ji() {
        super(0, 0, hn.field_t, vf.field_x, (ca) null, (pg) null);
        this.field_I = new md();
    }

    final void j(int param0) {
        int discarded$0 = 0;
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (param0 != -33) {
            discarded$0 = ji.a(-41, true, -105);
        }
        rf var3 = (rf) ((Object) var2.a(-479592473));
        while (var3 != null) {
            if (var3.i(462)) {
                var3.a(false);
            }
            var3 = (rf) ((Object) var2.c(17756));
        }
    }

    final lm g(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        lm var5 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == 1) {
            break L0;
          } else {
            var5 = (lm) null;
            this.a((lm) null, 10);
            break L0;
          }
        }
        var2 = new dj(this.field_I);
        var3 = (rf) ((Object) var2.a(-479592473));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_T) {
              var3 = (rf) ((Object) var2.c(param0 + 17755));
              continue L1;
            } else {
              return var3.g(param0 + -20312);
            }
          } else {
            return null;
          }
        }
    }

    final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        if (param0 != 1) {
            field_F = (int[]) null;
        }
        dj var2 = new dj(this.field_I);
        rf var3 = (rf) ((Object) var2.a(-479592473));
        while (var3 != null) {
            var3.field_T = false;
            var3 = (rf) ((Object) var2.c(param0 ^ 17757));
        }
        this.field_D = null;
    }

    public static void f(byte param0) {
        field_H = null;
        field_G = null;
        if (param0 != -98) {
            ji.f((byte) -89);
        }
        field_F = null;
    }

    final rf i(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 == 32) {
          var2 = new dj(this.field_I);
          var3 = (rf) ((Object) var2.a(-479592473));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_T) {
                var3 = (rf) ((Object) var2.c(17756));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (rf) null;
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_F = new int[32];
        for (var0 = 0; -33 < (var0 ^ -1); var0++) {
            var1 = var0 * 1 + 32;
            field_F[var0] = 65793 * var1;
        }
        field_H = "You have collected <%0> consecutive bounties";
    }
}
