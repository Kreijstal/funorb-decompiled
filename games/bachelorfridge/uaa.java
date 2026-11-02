/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uaa extends TileEffect {
    private BattleCreature field_j;
    static iga field_f;
    static UiComponent field_i;
    private IntrusiveDeque field_h;
    private DamageTileEffect field_g;

    final void a(int param0, boolean param1, int param2) {
        bma var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        Object var4 = null;
        int var7 = BachelorFridge.field_y;
        bma var4_refLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (!param1) {
          uaa.d((byte) -65);
        } else {
          var4_ref = (bma) (this.field_h.b((byte) 90));
          while (var4_ref != null) {
            var5 = (var4_ref.field_i >> 4) + param2;
            var6 = -(var4_ref.field_h >> 4) + (param0 + (var4_ref.field_q >> 5));
            mla.field_b[var4_ref.field_v].draw(var5, var6);
            var4_ref = (bma) (this.field_h.c(0));
          }
          return;
        }
        var4_refLifetime1 = (bma) (this.field_h.b((byte) 90));
        while (var4_refLifetime1 != null) {
          var5Lifetime1 = (var4_refLifetime1.field_i >> 4) + param2;
          var6Lifetime1 = -(var4_refLifetime1.field_h >> 4) + (param0 + (var4_refLifetime1.field_q >> 5));
          mla.field_b[var4_refLifetime1.field_v].draw(var5Lifetime1, var6Lifetime1);
          var4_refLifetime1 = (bma) (this.field_h.c(0));
        }
    }

    uaa(BattleScreen param0, DamageTileEffect param1, BattleCreature param2) {
        super(param0, param1.field_i, param1.field_l);
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_h = new IntrusiveDeque();
          this.field_g = param1;
          this.field_j = param2;
          for (var4_int = 0; var4_int < 500; var4_int++) {
            this.c(-22786);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("uaa.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var2 = DiveBomberAnimation.a(1024, GasCloudAnimation.field_I, -2147483648);
        int var3 = DiveBomberAnimation.a(1024, GasCloudAnimation.field_I, -2147483648);
        if (param0 != -22786) {
          return;
        }
        int var4 = var3 + var2;
        int var5 = var2 - var3;
        int var6 = DiveBomberAnimation.a(1024, GasCloudAnimation.field_I, -2147483648);
        bma var7 = new bma(var4, var6, var5, DiveBomberAnimation.a(mla.field_b.length, GasCloudAnimation.field_I, param0 - 2147460862), 50 + DiveBomberAnimation.a(50, GasCloudAnimation.field_I, param0 ^ 2147460862));
        var7.field_p = -64 + (var7.field_i >> 4);
        var7.field_g = (var7.field_q >> 4) - 32;
        var7.field_k = var7.field_h >> 4;
        var7.field_l = -8;
        this.field_h.a(var7, true);
    }

    final static String d(byte param0) {
        if (cha.field_l == null) {
          return "";
        }
        if (param0 >= -24) {
          uaa.a(false);
          return cha.field_l;
        }
        return cha.field_l;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          field_f = (iga) null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        if (param0 != -126) {
          return;
        }
        field_f = null;
    }

    final boolean b(int param0) {
        bma var2_ref = null;
        Object var2 = null;
        int var3 = BachelorFridge.field_y;
        bma var2_refLifetime1;
        if (null != this.field_g) {
          this.field_g.apply(this.field_j, this.field_e.field_h, 12);
          if (param0 <= 21) {
            return true;
          }
          var2_ref = (bma) (this.field_h.b((byte) 90));
          while (var2_ref != null) {
            var2_ref.b(true);
            if (!(var2_ref.field_h >= 0)) {
              var2_ref.unlink(false);
            }
            var2_ref = (bma) (this.field_h.c(0));
          }
          return this.field_h.e(12917);
        }
        if (param0 <= 21) {
          return true;
        }
        var2_refLifetime1 = (bma) (this.field_h.b((byte) 90));
        while (var2_refLifetime1 != null) {
          var2_refLifetime1.b(true);
          if (!(var2_refLifetime1.field_h >= 0)) {
            var2_refLifetime1.unlink(false);
          }
          var2_refLifetime1 = (bma) (this.field_h.c(0));
        }
        return this.field_h.e(12917);
    }

    final static void a(boolean param0) {
        UiComponent var3 = mka.a(5222712, 9883516, 5222712, (byte) -121, jha.field_g, 9883516, 16777215, 9883516);
        UiComponent var4 = var3;
        var4.field_Y = 1;
        var4.field_N = 1;
        var4.field_eb = bga.field_j;
        if (param0) {
          uaa.d((byte) -72);
        }
        vu.field_p.field_Y = 1;
        IntrusiveNode.field_a = new UiComponent("checkout", vu.field_p, 444, 324, 167, 38, "");
        lfa.field_l = new UiComponent("back", vu.field_p, 440, 428, 177, 28, "");
        EffectBatch.field_l = new UiComponent("up", vu.field_p, 440, 137, 140, 16, "");
        hk.field_c = new UiComponent("down", vu.field_p, 440, 328, 140, 16, "");
        DiskCacheRequest.field_s = new UiComponent[8];
        mg.field_l = new UiComponent("bakery", vu.field_p, 14, 90, 73, 34, "Bakery");
        qba.field_l = new UiComponent("meat", vu.field_p, 91, 90, 73, 34, "Meat");
        dt.field_b = new UiComponent("fish", vu.field_p, 168, 90, 73, 34, "Fish");
        ClamsEvent.field_u = new UiComponent("dairy", vu.field_p, 245, 90, 73, 34, "Dairy");
        sea.field_k = new UiComponent("fruitnveg", vu.field_p, 322, 90, 73, 34, "Fruit & Veg");
        mk.field_h = new UiComponent("drinks", vu.field_p, 399, 90, 73, 34, "Drinks");
        StampedeSpecial.field_q = new UiComponent("readymeal", vu.field_p, 476, 90, 73, 34, "Ready Meal");
        rfa.field_b = new UiComponent("misc", vu.field_p, 553, 90, 73, 34, "Misc.");
        DiskCacheRequest.field_s[3] = ClamsEvent.field_u;
        DiskCacheRequest.field_s[0] = mg.field_l;
        DiskCacheRequest.field_s[4] = sea.field_k;
        DiskCacheRequest.field_s[6] = StampedeSpecial.field_q;
        DiskCacheRequest.field_s[7] = rfa.field_b;
        DiskCacheRequest.field_s[2] = dt.field_b;
        DiskCacheRequest.field_s[1] = qba.field_l;
        DiskCacheRequest.field_s[5] = mk.field_h;
    }

    static {
        field_f = null;
    }
}
