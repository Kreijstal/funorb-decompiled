/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBoostersActiveTime extends ConsoleCommand {
    static IntrusiveDeque field_q;
    static int field_p;
    static int field_o;

    final static void f(byte param0) {
        if (param0 != -74) {
          field_q = (IntrusiveDeque) null;
        }
        kma.a(GrapplingHook.field_x, true, -17833, SetResourceNodeCaptureTime.field_p);
        kmb.field_c = true;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(219, 119));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cnb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetBoostersActiveTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, dj param1, dj param2, int param3, int param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        PacketBuffer stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = VoidHunters.field_G;
        try {
          var14 = param1.b((byte) 41);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param2.b((byte) 69);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == SetShipSpawnInvulnerabilityTime.field_o &&
            !ne.a(false, (byte) -11)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (tc.field_c == SetBombletSprayReload.field_p) {
            ehb.field_f = null;
            RequestNewestBlackboxRecording.field_p.position = 0;
            if (param5 == null) {
              SetTorpedoAcceleration.field_p.position = 0;
              SetTorpedoAcceleration.field_p.d(jeb.field_b.nextInt(), 332614536);
              SetTorpedoAcceleration.field_p.d(jeb.field_b.nextInt(), param4 + 332614536);
              stackIn_17_0 = SetTorpedoAcceleration.field_p;
              stackIn_17_1 = 0;
              if (!param1.a(true)) {
                stackIn_18_2 = "";
              } else {
                stackIn_18_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_17_0).b((byte) stackIn_17_1, stackIn_18_2);
              stackIn_20_0 = SetTorpedoAcceleration.field_p;
              stackIn_20_1 = 0;
              if (!param2.a(true)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_20_0).b((byte) stackIn_20_1, stackIn_21_2);
              RequestNewestBlackboxRecording.field_p.c(0, 16);
              RequestNewestBlackboxRecording.field_p.position = RequestNewestBlackboxRecording.field_p.position + 1;
              var9 = RequestNewestBlackboxRecording.field_p.position;
              GetOndamageParticleLife.a(RequestNewestBlackboxRecording.field_p, (byte) -105, SetSalvoDamageMultiplier.field_p, bib.field_g, SetTorpedoAcceleration.field_p);
              RequestNewestBlackboxRecording.field_p.e(-var9 + RequestNewestBlackboxRecording.field_p.position, -129);
            } else {
              var9 = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              SetTorpedoAcceleration.field_p.position = 0;
              SetTorpedoAcceleration.field_p.d(jeb.field_b.nextInt(), 332614536);
              SetTorpedoAcceleration.field_p.d(jeb.field_b.nextInt(), param4 ^ 332614536);
              SetTorpedoAcceleration.field_p.b((byte) 0, var14);
              SetTorpedoAcceleration.field_p.b((byte) 0, var8);
              var15 = (CharSequence) ((Object) param5);
              SetTorpedoAcceleration.field_p.b((byte) 0, esb.a(param4 + 22, var15));
              SetTorpedoAcceleration.field_p.a(param3, true);
              SetTorpedoAcceleration.field_p.c(param4 + 0, param0);
              SetTorpedoAcceleration.field_p.c(0, var9);
              RequestNewestBlackboxRecording.field_p.c(param4 + 0, 18);
              RequestNewestBlackboxRecording.field_p.position = RequestNewestBlackboxRecording.field_p.position + 2;
              var10 = RequestNewestBlackboxRecording.field_p.position;
              var11_ref_StringLifetime4 = GetMassDriverRandomness.a(-6465, MissionList.b((byte) -114));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              RequestNewestBlackboxRecording.field_p.a(true, var11_ref_StringLifetime4);
              GetOndamageParticleLife.a(RequestNewestBlackboxRecording.field_p, (byte) -108, SetSalvoDamageMultiplier.field_p, bib.field_g, SetTorpedoAcceleration.field_p);
              RequestNewestBlackboxRecording.field_p.a(RequestNewestBlackboxRecording.field_p.position - var10, -124);
            }
            lnb.b(-1, 113);
            tc.field_c = bs.field_d;
          }
          if (tc.field_c == bs.field_d &&
            ShipBlueprint.a(1, 30000)) {
            var9Lifetime1 = qga.field_b.e((byte) -124);
            qga.field_b.position = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              tc.field_c = ct.field_a;
              gob.field_a = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                kl.a(MissionList.b((byte) -124), param4 ^ 0);
                dgb.field_b = owa.field_j;
                ifb.l(param4 - 125);
                SetShowTutorial.field_o = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                tc.field_c = qva.field_k;
                vja.field_a = -1;
                ow.field_a = var9Lifetime1;
              } else {
                ShipBlueprint.a(SetWorldWidthUpshift.a(param4 + 24655), 30000);
                ehb.field_f = new Boolean(SetSpecialOrderBarYOffset.a(param4 - 2, qga.field_b));
                qga.field_b.position = 0;
              }
            }
          }
          if (tc.field_c == ct.field_a) {
            var9Lifetime2 = 2;
            if (ShipBlueprint.a(var9Lifetime2, param4 ^ 30000)) {
              var10Lifetime1 = qga.field_b.e(1869);
              qga.field_b.position = 0;
              if (ShipBlueprint.a(var10Lifetime1, param4 + 30000)) {
                var11 = gob.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  gob.field_a[var12] = qga.field_b.g(-1609246200);
                }
                ifb.l(-122);
                SetShowTutorial.field_o = false;
                stackIn_43_0 = var11 + 100;
                return stackIn_43_0;
              }
            }
          }
          if (param4 != 0) {
            GetBoostersActiveTime.f((byte) 86);
          }
          if (tc.field_c == qva.field_k &&
            ci.b((byte) 46)) {
            if (ow.field_a == 255) {
              var9_ref_String = qga.field_b.m(0);
              if (var9_ref_String != null) {
                SetNebulaProximityFadeDownshift.a(MissionList.b((byte) -123), var9_ref_String, -1);
              }
            } else {
              dgb.field_b = qga.field_b.a(-1);
            }
            ifb.l(-122);
            SetShowTutorial.field_o = false;
            stackIn_55_0 = ow.field_a;
            return stackIn_55_0;
          }
          if (SetShipSpawnInvulnerabilityTime.field_o == null) {
            if (SetShowTutorial.field_o) {
              if (30000L < mw.e(0)) {
                dgb.field_b = SetSalvoRepairTimeMultiplier.field_o;
              } else {
                dgb.field_b = uv.field_f;
              }
              SetShowTutorial.field_o = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = SetNebulaProximityFadeDownshift.field_p;
            SetNebulaProximityFadeDownshift.field_p = bia.field_d;
            bia.field_d = var9Lifetime3;
            SetShowTutorial.field_o = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("cnb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = -18 % ((-34 - param0) / 59);
        field_q = null;
    }

    static {
        field_q = new IntrusiveDeque();
        field_p = 100;
        field_o = 1;
    }
}
