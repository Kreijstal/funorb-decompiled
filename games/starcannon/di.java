/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends qf {
    static Random field_l;
    static int field_m;
    static String field_k;
    static String[] field_j;

    di(fe param0) {
        super(param0);
    }

    final static hl a(int param0, int param1, ue param2, int param3) {
        Object var5 = null;
        if (qb.a((byte) -76, param3, param1, param2)) {
          if (param0 != 130) {
            var5 = null;
            boolean discarded$2 = di.a((byte) 118, (String) null);
            return uh.c((byte) 34);
          } else {
            return uh.c((byte) 34);
          }
        } else {
          return null;
        }
    }

    final String a(String param0, boolean param1) {
        if (!param1) {
          if (((di) this).a(param0, -26188) != sb.field_n) {
            return null;
          } else {
            return pe.field_f;
          }
        } else {
          di.f(-21);
          if (((di) this).a(param0, -26188) != sb.field_n) {
            return null;
          } else {
            return pe.field_f;
          }
        }
    }

    final p a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param0;
        if (!ba.a(6, var4)) {
          return sb.field_n;
        } else {
          if (param1 == -26188) {
            var6 = (CharSequence) (Object) param0;
            var3 = pd.a(var6, 10);
            if (0 < var3) {
              if (var3 > 130) {
                return sb.field_n;
              } else {
                return bf.field_x;
              }
            } else {
              return sb.field_n;
            }
          } else {
            field_j = null;
            var5 = (CharSequence) (Object) param0;
            var3 = pd.a(var5, 10);
            if (0 < var3) {
              if (var3 > 130) {
                return sb.field_n;
              } else {
                return bf.field_x;
              }
            } else {
              return sb.field_n;
            }
          }
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 24979) {
            return;
        }
        field_j = null;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 89) {
          L0: {
            field_m = -11;
            if (null == hg.a(120, param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == hg.a(120, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_k = "POWERUPS 2/2:";
        field_l = new Random();
        field_j = new String[]{"Defender", "Interstellar Fighter", "Alien Aggressor", "Interstellar Warrior", "Alien Dominator", "Zenon Warrior", "Missile Gunner", "Destroyer Pilot", "Battleship Pilot", "Dog Fighter", "Wolverine Fighter", "Fusion Engines", "High Five Fighter", "High Five Interceptor", "High Five Invader"};
    }
}
