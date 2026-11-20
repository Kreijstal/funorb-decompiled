/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetArmageddonLength extends ConsoleCommand {
    static IntrusiveDeque pendingReflectionChecks;
    static TextureCombineSource field_q;
    static String field_o;
    static TextureCoordinateMode field_p;

    public static void clearSharedReferences(byte param0) {
        field_q = null;
        pendingReflectionChecks = null;
        field_p = null;
        field_o = null;
        if (param0 != 66) {
          String var2 = (String) null;
          GetArmageddonLength.a(0, (String) null, (byte) -109);
        }
    }

    final static void handleClientDataReply(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ClientDataWriteRequest var5_ref_dnb = null;
        Object var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        ClientDataReadRequest var9 = null;
        IsaacPacketBuffer var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var7 = VoidHunters.field_G;
        try {
          var10 = qga.field_b;
          var2 = var10.readUnsignedByte((byte) -113);
          var3 = 44 % ((-49 - param0) / 63);
          if (var2 != 0) {
            if (var2 != 1) {
              gna.a((Throwable) null, "A1: " + SetCountermeasuresPulsetime.e(-13514), 0);
              FighterBayWeaponDefinition.l(-126);
              return;
            }
            var4 = var10.readInt(100);
            var5_ref_dnb = (ClientDataWriteRequest) (SetGrapplingHookAimarc.pendingClientDataWrites.first(0));
            while (var5_ref_dnb != null) {
              if (var5_ref_dnb.payloadCrc != var4) {
                var5_ref_dnb = (ClientDataWriteRequest) (SetGrapplingHookAimarc.pendingClientDataWrites.next((byte) 78));
                continue;
              }
              break;
            }
            if (var5_ref_dnb != null) {
              var5_ref_dnb.unlink(-3846);
              return;
            }
            FighterBayWeaponDefinition.l(-121);
            return;
          }
          var9 = (ClientDataReadRequest) (GetBoostersActiveTime.pendingClientDataReads.first(0));
          if (var9 == null) {
            FighterBayWeaponDefinition.l(-126);
            return;
          }
          var5 = var10.readUnsignedByte((byte) -93);
          if (var5 != 0) {
            var12 = new byte[var5];
            var11 = var12;
            var8 = var11;
            var6 = var8;
            var10.readBytes(0, var12, (byte) -59, var5);
          } else {
            var6 = null;
          }
          var10.position = var10.position + 4;
          if (!var10.checkCrc(-2780)) {
            FighterBayWeaponDefinition.l(-126);
            return;
          }
          var9.data = (byte[]) (var6);
          var9.complete = true;
          var9.unlink(-3846);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "tma.D(" + param0 + ')');
        }
    }

    GetArmageddonLength(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tpa a(int param0, String param1, byte param2) {
        tpa var3 = null;
        RuntimeException var3_ref = null;
        tpa stackIn_2_0 = null;
        tpa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new tpa(false);
          if (param2 != -124) {
            stackIn_2_0 = (tpa) null;
            return stackIn_2_0;
          }
          var3.field_f = param1;
          var3.field_d = param0;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("tma.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_q = (TextureCombineSource) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(62, 97));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tma.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        pendingReflectionChecks = new IntrusiveDeque();
        field_o = "Players: <%0>/<%1>";
        field_q = new TextureCombineSource();
        field_p = new TextureCoordinateMode();
    }
}
