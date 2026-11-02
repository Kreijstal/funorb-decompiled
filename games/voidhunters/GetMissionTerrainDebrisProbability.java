/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissionTerrainDebrisProbability extends ConsoleCommand {
    static String field_p;
    static boolean field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = true;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(65, 126));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gwa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetMissionTerrainDebrisProbability(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, double param2, int param3, double param4) {
        int var8;
        var8 = VoidHunters.field_G;
        if (param1 != ~cd.field_c) {
          if (param0 != 0) {
            cd.field_c = param0;
            AsteroidField.field_c = param4;
            if (rw.field_q == 0 &&
              param3 > 0) {
              SetResourceNodeCaptureTime.field_o = new IntrusiveDeque();
            } else {
              if (param3 == 0) {
                SetResourceNodeCaptureTime.field_o = null;
              }
            }
          } else {
            GetSpinningBladeAimarc.field_q = null;
            cd.field_c = param0;
            AsteroidField.field_c = param4;
            if (rw.field_q == 0 &&
              param3 > 0) {
              SetResourceNodeCaptureTime.field_o = new IntrusiveDeque();
            } else {
              if (param3 == 0) {
                SetResourceNodeCaptureTime.field_o = null;
              }
            }
          }
        } else {
          if (param0 > 0) {
            GetSpinningBladeAimarc.field_q = new IntrusiveDeque();
            cd.field_c = param0;
            AsteroidField.field_c = param4;
            if (rw.field_q == 0 &&
              param3 > 0) {
              SetResourceNodeCaptureTime.field_o = new IntrusiveDeque();
            } else {
              if (param3 == 0) {
                SetResourceNodeCaptureTime.field_o = null;
              }
            }
          } else {
            if (param0 == 0) {
              GetSpinningBladeAimarc.field_q = null;
            }
            cd.field_c = param0;
            AsteroidField.field_c = param4;
            if (rw.field_q != 0) {
              if (param3 == 0) {
                SetResourceNodeCaptureTime.field_o = null;
              }
            } else {
              if (param3 > 0) {
                SetResourceNodeCaptureTime.field_o = new IntrusiveDeque();
              } else {
                if (param3 == 0) {
                  SetResourceNodeCaptureTime.field_o = null;
                }
              }
            }
          }
        }
        rw.field_q = param3;
        npa.field_c = param2;
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_p = null;
    }

    static {
        field_p = "All players have left <%0>'s game.";
    }
}
