/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoomCompletedScreen extends MatchOverlay {
    static String field_j;
    static String field_k;

    public static void releaseStatics(byte param0) {
        field_k = null;
        if (param0 > -35) {
          return;
        }
        field_j = null;
    }

    final boolean handleKey(int param0, char param1, byte param2) {
        int var4 = 25 / ((29 - param2) / 57);
        return false;
    }

    final void draw(byte param0) {
        int var3 = 0;
        int var4 = 0;
        Room var5 = null;
        int var2 = 16777215;
        if (param0 < -13) {
          var3 = 160;
          SecondaryNodeDequeIterator.a(192, 160, 3145728, 240, (byte) 22, var3, 200);
          WhiteLightShooterComponent.a(200, (byte) -85, var3, 5242880, 2, 160, 240);
          MembersUpsellMenu.a("Room Completed", var2, eda.field_f, -1, var3 + 40, 320, 0);
          var4 = 240;
          var5 = this.field_g.simulations[0].rooms[0];
          var4 += 20;
          MembersUpsellMenu.a("Total Time: " + dea.a(this.field_g.simulations[0].tick, (byte) -8), var2, kn.field_p, -1, var4, 320, 0);
          var4 += 20;
          MembersUpsellMenu.a("Deaths: " + var5.getDeathCount(0), var2, kn.field_p, -1, var4, 320, 0);
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          return MidiVoiceMixer.min(param1, param0, -81) - RandomBrickOperator.max(param3, param4, 2);
        }
        field_j = (String) null;
        return MidiVoiceMixer.min(param1, param0, -81) - RandomBrickOperator.max(param3, param4, 2);
    }

    final void update(byte param0) {
        if (param0 > -107) {
          lu var3 = (lu) null;
          RoomCompletedScreen.a((byte) 21, true, 36, (lu) null, true);
        }
    }

    RoomCompletedScreen(MatchScreen param0) {
        super(param0);
    }

    final boolean pausesGame(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    final static boolean c(int param0) {
        if (param0 != 2) {
          return false;
        }
        lqa var1 = LegacyOpenGlBloomEffect.b(false);
        if (var1 == null) {
          return false;
        }
        return var1.field_f;
    }

    final static void a(byte param0, boolean param1, int param2, lu param3, boolean param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          AllPlatformsMazeComponent.field_K[0] = PlatformBehaviour.field_p.nextInt();
          AllPlatformsMazeComponent.field_K[1] = PlatformBehaviour.field_p.nextInt();
          jg.field_a.position = 0;
          AllPlatformsMazeComponent.field_K[3] = (int)PathMoverComponent.field_L;
          AllPlatformsMazeComponent.field_K[2] = (int)(PathMoverComponent.field_L >> 32);
          jg.field_a.writeInt(AllPlatformsMazeComponent.field_K[0], (byte) 80);
          jg.field_a.writeInt(AllPlatformsMazeComponent.field_K[1], (byte) 124);
          jg.field_a.writeInt(AllPlatformsMazeComponent.field_K[2], (byte) -28);
          if (param0 < 19) {
            return;
          }
          jg.field_a.writeInt(AllPlatformsMazeComponent.field_K[3], (byte) 104);
          ni.a(jg.field_a, (byte) 77);
          jg.field_a.writeShort(-1477662136, param2);
          param3.a(jg.field_a, false);
          ql.field_k.position = 0;
          if (!param1) {
            ql.field_k.writeByte(16, 0);
          } else {
            ql.field_k.writeByte(18, 0);
          }
          ql.field_k.position = ql.field_k.position + 2;
          var5_int = ql.field_k.position;
          ql.field_k.writeInt(ClientException.field_c, (byte) 125);
          ql.field_k.writeLong(1736565456, du.field_h);
          var6 = 0;
          if (ft.field_a) {
            var6 = var6 | 1;
          }
          if (q.field_r) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (NodeHashTable.field_d != null) {
            var6 = var6 | 16;
          }
          ql.field_k.writeByte(var6, 0);
          var7 = FontMetrics.a(0, di.a(46));
          if (var7 == null) {
            var7 = "";
          }
          ql.field_k.writeString(var7, false);
          if (null != NodeHashTable.field_d) {
            ql.field_k.writeVersionedString(NodeHashTable.field_d, (byte) 0);
          }
          bna.a(oca.field_a, false, PooledObject.field_f, ql.field_k, jg.field_a);
          ql.field_k.backpatchShortLength(ql.field_k.position - var5_int, (byte) 114);
          bl.a(-1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ova.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_j = "This game option has not yet been unlocked for use.";
        field_k = "Who can join";
    }
}
