/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class FlySpecial extends SpecialOrder {
    static String field_r;
    static String field_t;
    static Sprite[] field_p;
    static String field_s;
    static String field_q;

    FlySpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        FlyEvent var4 = null;
        FlyEvent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(57, param0);
          var4 = new FlyEvent(this.moveId, new CreatureRef(var3));
          var4.field_s = this.field_k;
          var4.field_u = this.field_n;
          if (param1 != 3) {
            field_p = (Sprite[]) null;
          }
          var4.field_q = 2 * DiveBomberAnimation.a(4, param0.field_w, param1 ^ -2147483645) + 6;
          stackIn_3_0 = var4;
          return (CreatureEvent) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nw.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_t = null;
          field_s = null;
          field_p = null;
          field_r = null;
          field_q = null;
          return;
        }
        FlySpecial.a(false, false, (byte) -101);
        field_t = null;
        field_s = null;
        field_p = null;
        field_r = null;
        field_q = null;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var4 = (String) null;
        vma.$cfr$intArgs$a$842e35442ba4(-6, param0, param1, (String) null);
        int var3 = -72 / ((-21 - param2) / 58);
    }

    final static void a(vr param0, byte param1) {
        byte[] var13 = null;
        byte[] var8 = null;
        byte[] var4 = null;
        byte[] var2 = null;
        PacketBuffer var9 = null;
        byte[] var14 = null;
        byte[] var10 = null;
        byte[] var5 = null;
        byte[] var15 = null;
        byte[] var11 = null;
        byte[] var6 = null;
        byte[] var16 = null;
        byte[] var12 = null;
        byte[] var7 = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        try {
          var13 = param0.a((byte) 123, "MoveTable.csv", "");
          var8 = var13;
          var4 = var8;
          var2 = var4;
          var9 = new PacketBuffer(var13);
          CreatureType.a((byte) -121);
          vi.b(16);
          TeleportAnimation.f(-93);
          hba.c(7);
          kma.d(param1 - 109);
          lg.c(8);
          li.e(-117);
          mk.a((byte) -43);
          ut.c(-22021);
          DualLinkDequeIterator.a((byte) 80);
          if (param1 != 2) {
            field_t = (String) null;
          }
          TextInputWidget.field_E = qs.a(false, var9);
          hga.a(true, var13);
          var14 = param0.a((byte) 123, "UnlockTable.csv", "");
          var10 = var14;
          var5 = var10;
          var2Lifetime1 = var5;
          WidgetTheme.a((byte) -104);
          MoveCreatureEffect.a(var14, (byte) 22);
          lg.a(-92);
          var15 = param0.a((byte) 123, "UnlockerTable.csv", "");
          var11 = var15;
          var6 = var11;
          var2Lifetime2 = var6;
          sp.a(var15, param1 ^ -5);
          var16 = param0.a((byte) 123, "CreatureTable.csv", "");
          var12 = var16;
          var7 = var12;
          var2Lifetime3 = var7;
          PacketBuffer var3 = new PacketBuffer(var16);
          qs.b(false);
          an.a(var16, -49);
          wv.a((byte) -73, var16);
          fi.field_m = null;
          BuffVendorEvent.field_t = null;
          du.field_a = null;
          ResetAnimation.field_v = null;
          dl.field_h = null;
          InsanoSauceAnimation.field_x = null;
          PizzaArenaTheme.field_i = null;
          MoveInfoPanel.field_f = null;
          cw.field_zb = null;
          DualLinkNode.field_f = null;
          i.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nw.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_r = "Mute this player for 48 hours";
        field_t = "Click on a creature or its portrait to select it.";
        field_s = "TAB - hide chat temporarily";
        field_q = "Password is valid";
    }
}
