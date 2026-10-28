/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements ValidationSource {
    private long lastChangeMillis;
    static String field_a;
    static int field_b;
    static String field_d;

    public final ValidationState validationState(int guard) {
        if (this.isEmpty(-107)) {
          return GradientOutlineTextPainter.field_s;
        }
        if (guard != 17124) {
          DebouncedValidator.a(false, true);
          if (td.b(guard - 16996) < (this.lastChangeMillis + 350L)) {
            return of.field_f;
          }
          return this.evaluateState(-76);
        }
        if (td.b(guard - 16996) < (this.lastChangeMillis + 350L)) {
          return of.field_f;
        }
        return this.evaluateState(-76);
    }

    public final String validationMessage(int guard) {
        int var2 = 103 / ((guard + 35) / 59);
        if (this.isEmpty(95)) {
          return null;
        }
        if ((350L + this.lastChangeMillis) > td.b(128)) {
          return null;
        }
        return this.evaluateMessage((byte) 125);
    }

    final static int a(int param0, int param1, LegacyButton[] param2, int param3) {
        String stackIn_17_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param2 == null) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          LegacyButton[] var4 = param2;
          int var6 = -90 % ((param1 + 58) / 32);
          for (int var5 = 0; var4.length > var5; var5++) {
            LegacyButton var7 = var4[var5];
            if (var7 != null &&
              var7.hitTest((byte) 65, param3, param0)) {
              int stackIn_10_0 = var7.actionId;
              return stackIn_10_0;
            }
          }
          int stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("sm.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void markChanged(boolean guard) {
        this.lastChangeMillis = td.b(128);
        if (guard) {
          field_b = -44;
        }
    }

    abstract ValidationState evaluateState(int guard);

    public static void releaseStatics(boolean guard) {
        field_a = null;
        if (!guard) {
          DebouncedValidator.a(false, false);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void writeAchievementRecord(AchievementRecord record, int opcode, boolean guard) {
        try {
          CipherPacketBuffer var3 = QuickChatDynamicCommand.outgoingPackets;
          var3.writeCipheredOpcode(opcode, guard);
          var3.position = var3.position + 1;
          int var4 = var3.position;
          var3.writeByte(1, -123);
          var3.writeByte(record.field_m, -123);
          var3.writeByte(record.field_h, -123);
          var3.writeInt((byte) 124, record.field_k);
          var3.writeInt((byte) 127, record.field_i);
          var3.writeInt((byte) 125, record.field_j);
          var3.writeInt((byte) 127, record.field_g);
          var3.appendCrc32(var4, -76);
          var3.backpatchByteLength(86, var3.position - var4);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sm.O(" + (record != null ? "{...}" : "null") + ',' + opcode + ',' + guard + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = EscapeVector.obfuscationControl;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        if (param0) {
          field_a = (String) null;
          if (Js5NetworkRequest.field_x <= 0) {
            if (!aj.b(-104)) {
              var2 = 1;
              if (null != DirectByteStorage.field_n) {
                return;
              }
              if (!e.field_d) {
                return;
              }
              sn.a(var2, 0, param1);
              return;
            }
            var2 = 0;
            if (null != DirectByteStorage.field_n) {
              return;
            }
            if (!e.field_d) {
              return;
            }
            sn.a(var2, 0, param1);
            return;
          }
          if (DirectByteStorage.field_n != null) {
            IsaacRandom.field_d = DirectByteStorage.field_n.enterFullscreen(!param0 ? true : false);
            TextHotspotWidget.b(2, (byte) 101);
            if (null == IsaacRandom.field_d) {
              var2Lifetime4 = 3;
            } else {
              var2Lifetime4 = 2;
              rc.a(IsaacRandom.field_d, true);
            }
            if (null != DirectByteStorage.field_n) {
              return;
            }
            if (!e.field_d) {
              return;
            }
            sn.a(var2Lifetime4, 0, param1);
            return;
          }
          IsaacRandom.field_d = al.a(640, -16493, NetworkGameClient.field_r, 480, 0, 0);
          if (null == IsaacRandom.field_d) {
            var2Lifetime5 = 3;
          } else {
            var2Lifetime5 = 2;
            rc.a(IsaacRandom.field_d, true);
          }
          if (null != DirectByteStorage.field_n) {
            return;
          }
          if (!e.field_d) {
            return;
          }
          sn.a(var2Lifetime5, 0, param1);
          return;
        }
        if (Js5NetworkRequest.field_x <= 0) {
          if (!aj.b(-104)) {
            int var2Lifetime1 = 1;
            if (null == DirectByteStorage.field_n &&
              e.field_d) {
              sn.a(var2Lifetime1, 0, param1);
              return;
            }
            return;
          }
          int var2Lifetime1Lifetime1 = 0;
          if (null != DirectByteStorage.field_n) {
            return;
          }
          if (!e.field_d) {
            return;
          }
          sn.a(var2Lifetime1Lifetime1, 0, param1);
          return;
        }
        if (DirectByteStorage.field_n != null) {
          IsaacRandom.field_d = DirectByteStorage.field_n.enterFullscreen(!param0 ? true : false);
          TextHotspotWidget.b(2, (byte) 101);
          if (null == IsaacRandom.field_d) {
            var2Lifetime2 = 3;
          } else {
            var2Lifetime2 = 2;
            rc.a(IsaacRandom.field_d, true);
          }
          if (null == DirectByteStorage.field_n &&
            e.field_d) {
            sn.a(var2Lifetime2, 0, param1);
            return;
          }
          return;
        }
        IsaacRandom.field_d = al.a(640, -16493, NetworkGameClient.field_r, 480, 0, 0);
        if (null == IsaacRandom.field_d) {
          var2Lifetime3 = 3;
        } else {
          var2Lifetime3 = 2;
          rc.a(IsaacRandom.field_d, true);
        }
        if (null == DirectByteStorage.field_n &&
          e.field_d) {
          sn.a(var2Lifetime3, 0, param1);
          return;
        }
    }

    final static void b(byte param0) {
        AchievementQuery.a(true, AgeValidator.field_o, false, ResourceArchive.field_b);
        if (param0 > -45) {
          return;
        }
        LinkButtonPainter.field_a = true;
    }

    abstract String evaluateMessage(byte guard);

    static {
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Loading graphics";
    }
}
