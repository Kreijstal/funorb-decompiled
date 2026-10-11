/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c extends gca {
    float field_j;
    static String field_i;
    static String[] field_k;
    private eaa field_l;

    private final void e(byte param0) {
        int var5 = 0;
        cia var6 = null;
        int var2 = baa.field_v.nextInt() & 8191;
        int var3 = (255 & baa.field_v.nextInt()) + 128;
        int var4 = var3 * via.a(var2, (byte) 72) >> 16;
        if (param0 == 99) {
          var5 = var3 * ft.a(var2, (byte) -128) >> 16;
          var6 = new cia(var4, 0, var5, 0, 0, 0, 128, -2);
          this.field_l.a(var6, true);
          return;
        }
    }

    final static void f(byte param0) {
        if (param0 != 48) {
          field_i = (String) null;
          wh.field_p = null;
          return;
        }
        wh.field_p = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (!param2) {
          var3 = param1 >> 16;
          var4 = param1 & 65535;
          var5 = param0 >> 16;
          var6 = param0 & 65535;
          return (var6 * var4 >> 16) + param0 * var3 + var5 * var4;
        }
        return -114;
    }

    final void a(int param0, int param1, byte param2) {
        cia var4_ref = null;
        Object var4 = null;
        int var5 = BachelorFridge.field_y;
        cia var4_refLifetime1;
        if (param2 != -34) {
          this.field_j = -1.2825418710708618f;
        } else {
          var4_ref = (cia) (this.field_l.b((byte) 90));
          while (var4_ref != null) {
            dg.f((var4_ref.field_i >> 4) + param1, (var4_ref.field_q >> 5) + param0 + (var4_ref.field_h >> 9), 2, 12632256, var4_ref.field_o);
            var4_ref = (cia) (this.field_l.c(0));
          }
          return;
        }
        var4_refLifetime1 = (cia) (this.field_l.b((byte) 90));
        while (var4_refLifetime1 != null) {
          dg.f((var4_refLifetime1.field_i >> 4) + param1, (var4_refLifetime1.field_q >> 5) + param0 + (var4_refLifetime1.field_h >> 9), 2, 12632256, var4_refLifetime1.field_o);
          var4_refLifetime1 = (cia) (this.field_l.c(0));
        }
    }

    public static void a(int param0) {
        if (param0 != -20330) {
          c.f((byte) -87);
          field_k = null;
          field_i = null;
          return;
        }
        field_k = null;
        field_i = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 3;
        if (param0 == 1220394217) {
          if (param1 == 6) {
            var2 = 2;
          }
          ol.a(pja.field_a[param1][6 + kla.a(var2, m.field_a, -2147483648)], true);
          return;
        }
        c.a(88, 16);
        if (param1 == 6) {
          var2 = 2;
        }
        ol.a(pja.field_a[param1][6 + kla.a(var2, m.field_a, -2147483648)], true);
    }

    public c() {
        super(32);
        this.field_l = new eaa();
    }

    final boolean a(boolean param0, boolean param1) {
        cia stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_16_0 = false;
        cia var3;
        float var4;
        int var5;
        var5 = BachelorFridge.field_y;
        this.field_j = this.field_j * 0.9800000190734863f;
        if (param0) {
          c.a(-87, -87);
        }
        if (param1) {
          this.field_j = this.field_j + 0.019999980926513672f;
        }
        var3 = (cia) (this.field_l.b((byte) 90));
        while (var3 != null) {
          stackIn_9_0 = var3;
          stackIn_10_1 = !(param0);
          ((cia) (Object) stackIn_9_0).b(stackIn_10_1);
          var3 = (cia) (this.field_l.c(0));
        }
        var4 = this.field_j * 3.0f;
        while (baa.field_v.nextFloat() * (var4 + 1.0f) < var4) {
          this.e((byte) 99);
        }
        stackIn_16_0 = !(this.field_l.e(12917));
        return stackIn_16_0;
    }

    static {
        field_i = "Your ignore list is full. Max of 100 hit.";
        field_k = new String[]{"No special effects.", "Losing HP over time.", "You can't move or attack!", "Your chance to resist is increased!", "You're feeling less tough...", "You're feeling less quick...", "You feel weaker...", "You feel worse at throwing things...", "You can't move!", "You can't attack!", "You feel sleepy...", "You don't feel like fighting any more", "Losing lots of HP over time", "Attacks that hit you will hurt!", "Gaining HP over time", "Knockback", "You're feeling more tough...", "You're feeling more speedy...", "You feel stronger...", "You feel better at throwing things...", "", "Double duration of effects", "Triple duration of effects", "Pull forward", "Carrying red fly", "Carrying green fly", "Carrying yellow fly", "Carrying blue fly", "Your speed is maxed out!", "You're sleeping...", "Damage done is reduced by 50%", "When you die, the rest of your team is healed!", "You're hovering!", "Nothing can stop you now!", "The last move you used is disabled...", "You're a zombie... Brains...", "You're stuck and can't move!", "You're in love, and under control", "Your speed is decreasing every turn", "You can't move, but you can't be hit!", "Can't move! I'm scared and there are wolves after me.", "Reset buffs", "You're in an uncontrollable rage! Rawr!", "You're spilling milk!", "You're dreaming...", "Knockback 2 squares", "Knockback 3 squares", "Push aside", "Switch", "Create poison tile", "Create regen tile", "You're confused! You move randomly!", "Panic! You attack randomly!", "You're on fire! Literally!", "You're creating horrible, horrible, scary noises!"};
    }
}
