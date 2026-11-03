/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HailAnimation extends EventAnimation {
    private ActorAnimation field_y;
    static String field_w;
    static int field_x;
    private HailEvent field_z;
    static UiComponent field_A;
    private boolean field_v;

    final boolean isFinished(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_y.isLinked((byte) -106)) {
          return false;
        }
        fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$1 <= 0) {
          var2 = 92 % ((param0 - 71) / 47);
          this.b(true);
          return true;
        }
        if (!this.field_v) {
          this.e((byte) 47);
        }
        return false;
    }

    private final void b(boolean param0) {
        this.f((byte) -125);
        if (!param0) {
          field_A = (UiComponent) null;
        }
    }

    private final void e(byte param0) {
        int var11 = 0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int var14;
        int var15;
        kw var16;
        int var17;
        int[][] var21;
        var17 = BachelorFridge.field_y;
        var21 = this.field_z.d(1);
        var3 = this.field_z.field_q;
        var4 = this.field_z.field_t;
        var5 = 17;
        var6 = 17;
        var7 = var5 - 1 >> 1;
        if (param0 != 47) {
          HailAnimation.releaseStatics(-36);
        }
        var8 = var6 - 1 >> 1;
        var9 = DiveBomberAnimation.a(513, m.field_a, -2147483648) - 256;
        var10 = -128 + DiveBomberAnimation.a(257, m.field_a, param0 + 2147483601);
        for (var11 = 0; var5 > var11; var11++) {
          for (var12 = 0; var12 < var6; var12++) {
            if (var21[var11][var12] == 1) {
              var13 = var11 + (-var7 + var3);
              var14 = var4 - (-var12 + var8);
              if (this.screen.field_h.a(var13, var14, (byte) 61)) {
                stackIn_15_0 = (this.screen.field_h.tiles[var13][var14].occupant != null) ? 0 : 1;
                var15 = stackIn_15_0;
                var16 = new kw(this.screen, var13, var14, var9, var10, var15 != 0);
                ((TileEffect) ((Object) var16)).a(0);
              }
            }
          }
        }
        this.field_v = true;
    }

    HailAnimation(BattleScreen param0, HailEvent param1) {
        super(param0, param1);
        try {
          this.field_z = param1;
          this.field_y = new ActorAnimation(this.screen, this.field_z.field_q, this.field_z.field_t);
          this.addChild(27799, this.field_y);
          this.field_l = 80;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_w = null;
        if (param0 != -128) {
          return;
        }
        field_A = null;
    }

    final static void a(it param0, FridgeCreature param1, int param2) {
        int var3_int = 0;
        if (AttackUpAllAnimation.e(-29919)) {
          return;
        }
        try {
          sja.field_fb.writeCipheredByte(param2, (byte) 109);
          sja.field_fb.position = sja.field_fb.position + 2;
          var3_int = sja.field_fb.position;
          rha.a(param1.field_g, sja.field_fb, (byte) -93);
          oe.a(-21332, sja.field_fb, param0);
          sja.field_fb.writeLengthShort((byte) -88, sja.field_fb.position - var3_int);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jba.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void f(byte param0) {
        CreatureActor var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_z.creature.a(param0 + 178, this.screen.field_h);
        if (param0 != -125) {
          return;
        }
        if (var2.isDown(84)) {
          return;
        }
        EventEffect var3 = (EventEffect) (this.field_z.effects.b((byte) 90));
        while (var3 != null) {
          var4 = var3.target.a(param0 - 27324, this.screen);
          var4.b(param0 + 124, 6);
          var3.apply(var2, this.screen.field_h, 12);
          this.addChild(27799, new DamagePopupAnimation(this.screen, var4, var3.field_f));
          var3 = (EventEffect) (this.field_z.effects.c(0));
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(uc.field_m);
          if (param0 != -30229) {
            FridgeCreature var3 = (FridgeCreature) null;
            HailAnimation.a((it) null, (FridgeCreature) null, -106);
          }
          param1.addMouseMotionListener(uc.field_m);
          param1.addFocusListener(uc.field_m);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jba.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Withdraw invitation to <%0> to join this game";
        field_x = 2;
    }
}
