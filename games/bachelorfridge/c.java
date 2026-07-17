/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c extends gca {
    float field_j;
    static String field_i;
    static String[] field_k;
    private eaa field_l;

    private final void e() {
        int var2 = baa.field_v.nextInt() & 8191;
        int var3 = (255 & baa.field_v.nextInt()) + 128;
        int var4 = var3 * via.a(var2, (byte) 72) >> 16;
        int var5 = var3 * ft.a(var2, (byte) -128) >> 16;
        cia var6 = new cia(var4, 0, var5, 0, 0, 0, 128, -2);
        ((c) this).field_l.a((bw) (Object) var6, true);
    }

    final static void f() {
        wh.field_p = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = param1 >> 16;
        int var4 = param1 & 65535;
        int var5 = param0 >> 16;
        int var6 = param0 & 65535;
        return (var6 * var4 >> 16) + param0 * var3 - -(var5 * var4);
    }

    final void a(int param0, int param1, byte param2) {
        Object var4 = null;
        cia var4_ref = null;
        int var5 = 0;
        var4 = null;
        var5 = BachelorFridge.field_y;
        if (param2 == -34) {
          var4_ref = (cia) (Object) ((c) this).field_l.b((byte) 90);
          L0: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              dg.f((var4_ref.field_i >> 4) + param1, (var4_ref.field_q >> 5) + param0 + (var4_ref.field_h >> 9), 2, 12632256, var4_ref.field_o);
              var4_ref = (cia) (Object) ((c) this).field_l.c(0);
              continue L0;
            }
          }
        } else {
          ((c) this).field_j = -1.2825418710708618f;
          var4_ref = (cia) (Object) ((c) this).field_l.b((byte) 90);
          L1: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              dg.f((var4_ref.field_i >> 4) + param1, (var4_ref.field_q >> 5) + param0 + (var4_ref.field_h >> 9), 2, 12632256, var4_ref.field_o);
              var4_ref = (cia) (Object) ((c) this).field_l.c(0);
              continue L1;
            }
          }
        }
    }

    public static void a() {
        field_k = null;
        field_i = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        var2 = 3;
        if (param0 != 1220394217) {
          L0: {
            c.a(88, 16);
            if (param1 != 6) {
              break L0;
            } else {
              var2 = 2;
              break L0;
            }
          }
          int discarded$8 = 1;
          cq discarded$9 = ol.a(pja.field_a[param1][6 + kla.a(var2, m.field_a, -2147483648)]);
          return;
        } else {
          L1: {
            if (param1 != 6) {
              break L1;
            } else {
              var2 = 2;
              break L1;
            }
          }
          int discarded$10 = 1;
          cq discarded$11 = ol.a(pja.field_a[param1][6 + kla.a(var2, m.field_a, -2147483648)]);
          return;
        }
    }

    public c() {
        super(32);
        ((c) this).field_l = new eaa();
    }

    final boolean a(boolean param0, boolean param1) {
        cia var3 = null;
        float var4 = 0.0f;
        int var5 = 0;
        cia stackIn_8_0 = null;
        cia stackIn_9_0 = null;
        cia stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        cia stackOut_7_0 = null;
        cia stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cia stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          ((c) this).field_j = ((c) this).field_j * 0.9800000190734863f;
          if (!param0) {
            break L0;
          } else {
            c.a(-87, -87);
            break L0;
          }
        }
        L1: {
          if (param1) {
            ((c) this).field_j = ((c) this).field_j + 0.019999980926513672f;
            break L1;
          } else {
            break L1;
          }
        }
        var3 = (cia) (Object) ((c) this).field_l.b((byte) 90);
        L2: while (true) {
          if (var3 == null) {
            var4 = ((c) this).field_j * 3.0f;
            L3: while (true) {
              if (baa.field_v.nextFloat() * (var4 + 1.0f) < var4) {
                int discarded$2 = 99;
                this.e();
                continue L3;
              } else {
                L4: {
                  if (((c) this).field_l.e(12917)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                return stackIn_16_0 != 0;
              }
            }
          } else {
            L5: {
              stackOut_7_0 = (cia) var3;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (param0) {
                stackOut_9_0 = (cia) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L5;
              } else {
                stackOut_8_0 = (cia) (Object) stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L5;
              }
            }
            boolean discarded$3 = ((cia) (Object) stackIn_10_0).b(stackIn_10_1 != 0);
            var3 = (cia) (Object) ((c) this).field_l.c(0);
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Your ignore list is full. Max of 100 hit.";
        field_k = new String[]{"No special effects.", "Losing HP over time.", "You can't move or attack!", "Your chance to resist is increased!", "You're feeling less tough...", "You're feeling less quick...", "You feel weaker...", "You feel worse at throwing things...", "You can't move!", "You can't attack!", "You feel sleepy...", "You don't feel like fighting any more", "Losing lots of HP over time", "Attacks that hit you will hurt!", "Gaining HP over time", "Knockback", "You're feeling more tough...", "You're feeling more speedy...", "You feel stronger...", "You feel better at throwing things...", "", "Double duration of effects", "Triple duration of effects", "Pull forward", "Carrying red fly", "Carrying green fly", "Carrying yellow fly", "Carrying blue fly", "Your speed is maxed out!", "You're sleeping...", "Damage done is reduced by 50%", "When you die, the rest of your team is healed!", "You're hovering!", "Nothing can stop you now!", "The last move you used is disabled...", "You're a zombie... Brains...", "You're stuck and can't move!", "You're in love, and under control", "Your speed is decreasing every turn", "You can't move, but you can't be hit!", "Can't move! I'm scared and there are wolves after me.", "Reset buffs", "You're in an uncontrollable rage! Rawr!", "You're spilling milk!", "You're dreaming...", "Knockback 2 squares", "Knockback 3 squares", "Push aside", "Switch", "Create poison tile", "Create regen tile", "You're confused! You move randomly!", "Panic! You attack randomly!", "You're on fire! Literally!", "You're creating horrible, horrible, scary noises!"};
    }
}
