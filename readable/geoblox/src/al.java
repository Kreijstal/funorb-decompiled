/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        CrcAcknowledgedPacket var4_ref_wc = null;
        int var6 = 0;
        PacketBuffer var9 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var4 = 0;
        Object var5 = null;
        FifoResponseToken var8 = null;
        byte[] var13 = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != 26146) {
            return;
          }
          var9 = eh.field_d;
          var2 = var9.readUnsignedByte((byte) 34);
          if (var2 == 0) {
            var8 = (FifoResponseToken) ((Object) PrefixCodeDecoder.field_e.firstForIteration(0));
            if (var8 == null) {
              Bzip2DecoderState.closeSessionSocket((byte) -124);
              return;
            }
            var4 = var9.readUnsignedByte((byte) 34);
            if (0 != var4) {
              var13 = new byte[var4];
              var9.readBytes(29915, var4, var13, 0);
            } else {
              var5 = null;
            }
            var9.position = var9.position + 4;
            if (!var9.verifyTrailingCrc32((byte) 20)) {
              Bzip2DecoderState.closeSessionSocket((byte) -121);
              return;
            }
            var8.unlinkNode(false);
          } else {
            if (1 == var2) {
              var3 = var9.readIntBE((byte) -101);
              var4_ref_wc = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.field_g.firstForIteration(0));
              while (var4_ref_wc != null) {
                if (var3 != var4_ref_wc.acknowledgementCrc) {
                  var4_ref_wc = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.field_g.nextForIteration(1));
                  continue;
                }
                break;
              }
              if (var4_ref_wc != null) {
                var4_ref_wc.unlinkNode(false);
                return;
              }
              Bzip2DecoderState.closeSessionSocket((byte) -124);
              return;
            }
            IterableNodeHashTable.a((Throwable) null, "A1: " + TextTemplateDefinition.e(55), (byte) 125);
            Bzip2DecoderState.closeSessionSocket((byte) -120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "al.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        var2 = AchievementQuery.b(3, param0 ^ 9667);
        if (param0 != 9666) {
          return;
        }
        var3 = param1;
        if (var3 != 4) {
          if (var3 == 3) {
            ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[var2 + 13]);
          } else {
            if (var3 != 1) {
              if (var3 != 0) {
                if (var3 == 6) {
                  ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[var2 + 4]);
                } else {
                  if (5 == var3) {
                    ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[16 + var2]);
                  } else {
                    if (var3 == 2) {
                      ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[var2 + 19]);
                    }
                  }
                }
              } else {
                ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[var2 + 1]);
              }
            } else {
              ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[7 + var2]);
            }
          }
        } else {
          ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[10 + var2]);
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            int var5 = 0;
            RuntimeException var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            boolean stackIn_21_0 = false;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            var7 = Geoblox.clientControlFlowFlag;
            try {
              if (ValidationIconWidget.field_H) {
                return true;
              }
              try {
                var8 = "tuhstatbut";
                var3 = (String) (wk.a((byte) -6, param1, "getcookies"));
                var4 = FullscreenFailureReason.a(';', true, var3);
                for (var5 = 0; var5 < var4.length; var5++) {
                  var6 = var4[var5].indexOf('=');
                  if ((var6 >= 0) &&
                      (var4[var5].substring(0, var6).trim().equals(var8))) {
                    return true;
                  }
                }
                if (param0 != -109) {
                  al.a(114, -32);
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
              stackIn_21_0 = !(null == param1.getParameter("tuhstatbut"));
              return stackIn_21_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_24_0 = var2;
              stackIn_24_1 = new StringBuilder().append("al.A(").append(param0).append(',');
              if (param1 == null) {
                stackIn_25_2 = "null";
              } else {
                stackIn_25_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(int param0) {
        if (!(IntrusiveDeque.field_d != kd.field_b)) {
            return SpriteCheckboxRenderer.field_a;
        }
        if (IntrusiveDeque.field_d == WidgetSkinState.field_g) {
            return DelayedPcmStream.field_k;
        }
        if (param0 != 0) {
            al.b(66);
        }
        if (!ih.field_c.isCompleted(-91)) {
            return DelayedPcmStream.field_k;
        }
        return b.field_a;
    }

    static {
    }
}
