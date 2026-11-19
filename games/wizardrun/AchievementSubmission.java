/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementSubmission extends IntrusiveNode {
    static int[] field_r;
    private int field_l;
    private int eventType;
    static boolean field_q;
    static int field_j;
    private int field_i;
    private int field_p;
    private int achievementId;
    static int field_n;
    private int field_k;

    final static int d(byte param0) {
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          var1_int = 0;
          var2 = 0;
          while (EmailValidationError.pollKeyboardEvent(-121)) {
            IntegerSyntaxHelpers.field_d.a(46);
            if (IntegerSyntaxHelpers.field_d.b(-1)) {
              var1_int = 1;
            }
            if (MidiNote.field_r != 13) {
              continue;
            }
            var2 = 1;
          }
          IntegerSyntaxHelpers.field_d.a(DisplayModeInfo.a(-578629823, field_n, NetworkArchiveRequest.field_B), 83, DisplayModeInfo.a(-578629823, MouseInputHandler.field_e, EmailDomainHelpers.field_b));
          if (IntegerSyntaxHelpers.field_d.b(param0 + 47)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            IntegerSyntaxHelpers.field_d.field_g >= 0) {
            var3 = MusicPatch.field_s[IntegerSyntaxHelpers.field_d.field_g];
            if (var3 == 2 ||
              var3 == 5) {
              DiskCacheStore.a((byte) 64);
            }
          } else {
            if (var2 != 0 &&
              oc.field_d != 2) {
              DiskCacheStore.a((byte) 64);
            }
          }
          if (param0 != -48) {
            stackIn_23_0 = -11;
            return stackIn_23_0;
          }
          if (var3 == 0 &&
            oc.field_d == 2) {
            var4 = -DirectByteStorage.field_g + MonotonicClockHelpers.monotonicMillis((byte) 115);
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              TriangleMesh.a(true, 5, 15991);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "pg.F(" + param0 + ')');
        }
    }

    final static void sleepMillisUnchecked(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            if (param1 != 2) {
              field_n = -55;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int encodeCp1252(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          var6_int = param5 - param2;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param2 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param1[param4 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[param4 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[param4 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param4] = (byte)-124;
                    break;
                  case 8230:
                    param1[var7 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param4] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param4] = (byte)-121;
                    break;
                  case 710:
                    param1[var7 + param4] = (byte)-120;
                    break;
                  case 8240:
                    param1[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[param4 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[param4 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[var7 + param4] = (byte)-116;
                    break;
                  case 381:
                    param1[param4 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param4] = (byte)-111;
                    break;
                  case 8217:
                    param1[param4 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param1[param4 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param4] = (byte)-105;
                    break;
                  case 732:
                    param1[param4 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[param4 + var7] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param4] = (byte)-102;
                    break;
                  case 8250:
                    param1[param4 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[param4 + var7] = (byte)-100;
                    break;
                  case 382:
                    param1[var7 + param4] = (byte)-98;
                    break;
                  case 376:
                    param1[param4 + var7] = (byte)-97;
                    break;
                  default:
                    param1[var7 + param4] = (byte)63;
                    break;
                }
              } else {
                param1[var7 + param4] = (byte)var8;
              }
            }
          }
          if (param0 != 8220) {
            field_n = -99;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("pg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void clearLoginDialogs(int param0) {
        DisplayNameSyntaxHelpers.field_b = null;
        mh.field_ob = null;
        if (param0 != -382) {
          field_j = 3;
        }
    }

    public static void releaseStatics(byte param0) {
        field_r = null;
        if (param0 != -73) {
          AchievementSubmission.showLoginChoices((byte) -55);
        }
    }

    final static void writeAchievementSubmission(int param0, boolean param1, AchievementSubmission param2) {
        IsaacPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (!param1) {
            AchievementSubmission.sleepMillisUnchecked(122L, 90);
          }
          var5 = n.field_b;
          var5.writeCipheredOpcode((byte) 92, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte((byte) 11, 1);
          var5.writeByte((byte) 11, param2.achievementId);
          var5.writeByte((byte) 11, param2.eventType);
          var5.writeInt(param2.field_l, 613003928);
          var5.writeInt(param2.field_i, 613003928);
          var5.writeInt(param2.field_p, 613003928);
          var5.writeInt(param2.field_k, 613003928);
          var5.appendCrc(var4, -1182887024);
          var5.backpatchByteLength(-var4 + var5.position, -117);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void showLoginChoices(byte param0) {
        if (param0 != -97) {
          field_q = false;
        }
        td.field_f.c(new LoginChoicePanel(), -123);
    }

    AchievementSubmission(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_k = param5;
        this.field_l = param2;
        this.field_i = param3;
        this.eventType = param1;
        this.achievementId = param0;
        this.field_p = param4;
    }

    static {
        field_r = new int[8192];
        field_n = 0;
    }
}
