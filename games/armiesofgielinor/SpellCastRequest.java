/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellCastRequest extends ActionRequest {
    private Spell spell;
    private int selectionMode;

    final static short[] a(short[] param0, int param1, CipherPacketBuffer param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = param2.readBits(45, param1);
          if (var4_int == 0) {
            return null;
          }
          if (param3 != 10064) {
            stackIn_6_0 = (short[]) null;
            return stackIn_6_0;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          var5 = param2.readBits(123, 4);
          var6 = (short)param2.readBits(param3 - 10172, 16);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(param2.readBits(63, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_19_0 = (short[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("to.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (vi.field_a == null) {
          return;
        }
        if (0 == vi.field_a.length) {
          return;
        }
        if (param0 < 0) {
          return;
        }
        if (param0 < vi.field_a.length) {
          we.playSoundAtVolume(100, param2, vi.field_a[param0]);
          int var3 = -110 / ((-58 - param1) / 63);
          return;
        }
    }

    final static void a(boolean param0, float param1, String param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PointerInputHandler.field_a == null) {
            PointerInputHandler.field_a = new cr(KingBlackDragonEvent.field_C, BestScoreStrategy.field_h);
            KingBlackDragonEvent.field_C.a(PointerInputHandler.field_a, param3 + 1);
          }
          PointerInputHandler.field_a.a(param1, 30, param0, param2);
          SoftwareRaster.b();
          DamageEvent.b((byte) 92, true);
          if (param3 == -1) {
            return;
          }
          SpellCastRequest.a(-96, (byte) 21, 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("to.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        RuntimeException var3 = null;
        String var4 = null;
        SpellCastAction stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.unlink(-104);
          if (obfuscationGuard <= 31) {
            var4 = (String) null;
            SpellCastRequest.a(true, -1.1208561658859253f, (String) null, -70);
          }
          this.spell.prepareEffect((byte) -37, battlefield);
          stackIn_3_0 = new SpellCastAction(this.spell, this.selectionMode, this.actingPlayer);
          return (PreparedAction) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("to.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    SpellCastRequest(Spell spell, int selectionMode, int actingPlayer) {
        try {
          this.selectionMode = selectionMode;
          this.actingPlayer = actingPlayer;
          this.spell = spell;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "to.<init>(" + (spell != null ? "{...}" : "null") + ',' + selectionMode + ',' + actingPlayer + ')');
        }
    }

    static {
    }
}
