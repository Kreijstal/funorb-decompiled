/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static RgbSprite[] field_l;
    static String requestedAccountName;
    static int[] field_k;

    final static void a(PacketBuffer param0, PlatformTaskService param1, int param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          dc var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var18 = new dc();
            var18.field_p = param0.readUnsignedByte(0);
            var18.field_q = param0.readInt(1);
            var18.field_m = new int[var18.field_p];
            var18.field_u = new byte[var18.field_p][][];
            if (param3 != -1) {
              return;
            }
            var18.field_k = new PlatformTask[var18.field_p];
            var18.field_r = new PlatformTask[var18.field_p];
            var18.field_t = new int[var18.field_p];
            var18.field_v = new int[var18.field_p];
            for (var5 = 0; var5 < var18.field_p; var5++) {
              try {
                var6_int = param0.readUnsignedByte(0);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (3 == var6_int ||
                    var6_int == 4) {
                    var20 = param0.readNullTerminatedString(1);
                    var21 = param0.readNullTerminatedString(param3 + 2);
                    var9 = param0.readUnsignedByte(0);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param0.readNullTerminatedString(GrowthEvent.bitwiseXor(param3, -2));
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param0.readInt(1);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.readBytes(0, var13, 0, var22[var12_int]);
                      }
                    }
                    var18.field_t[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = ah.a(var10[var17], (byte) 90);
                      var17++;
                    }
                    var18.field_r[var5] = param1.findDeclaredMethodAsync(ah.a(var20, (byte) 90), 0, var12, var21);
                    var18.field_u[var5] = var22;
                  }
                } else {
                  var15 = param0.readNullTerminatedString(param3 + 2);
                  var16 = param0.readNullTerminatedString(1);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.readInt(param3 + 2);
                  }
                  var18.field_t[var5] = var6_int;
                  var18.field_v[var5] = var9;
                  var18.field_k[var5] = param1.findDeclaredFieldAsync(-30598, ah.a(var15, (byte) 90), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_m[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_m[var5] = -5;
              }
            }
            DualNodeHashTable.field_e.addLast((byte) -119, (IntrusiveNode) (var18));
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_36_0 = var4;
            stackIn_36_1 = new StringBuilder().append("jh.P(");
            if (param0 == null) {
              stackIn_37_2 = "null";
            } else {
              stackIn_37_2 = "{...}";
            }
            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
            if (param1 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    AgeValidator(EditableTextWidget input) {
        super(input);
    }

    final ValidationState validateText(int obfuscationGuard, String text) {
        int age = 0;
        RuntimeException failure = null;
        CharSequence syntaxText = null;
        CharSequence numericText = null;
        ValidationState invalidSyntaxState = null;
        ValidationState invalidRangeState = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -3137) {
            field_k = (int[]) null;
          }
          syntaxText = (CharSequence) ((Object) text);
          if (!vv.a(-66, syntaxText)) {
            invalidSyntaxState = rn.validationInvalid;
            return invalidSyntaxState;
          }
          numericText = (CharSequence) ((Object) text);
          age = HuffmanCodec.a(46, numericText);
          if (age > 0 &&
            age <= 130) {
            return oo.validationValid;
          }
          invalidRangeState = rn.validationInvalid;
          return invalidRangeState;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_13_0 = failure;
          stackIn_13_1 = new StringBuilder().append("jh.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean isPacketPayloadReady(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          field_l = (RgbSprite[]) null;
        }
        if (fk.packetPayloadLength == -1) {
          if (!ConsoleTokenCursor.receivePacketBytes(-122, 1)) {
            return false;
          }
          fk.packetPayloadLength = ByteStorage.incomingPacket.readUnsignedByte(0);
          ByteStorage.incomingPacket.position = 0;
        }
        if (-2 == fk.packetPayloadLength) {
          if (!ConsoleTokenCursor.receivePacketBytes(-96, 2)) {
            return false;
          }
          fk.packetPayloadLength = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
          ByteStorage.incomingPacket.position = 0;
        }
        return ConsoleTokenCursor.receivePacketBytes(-105, fk.packetPayloadLength);
    }

    final static void rememberLastQuickChat(String recipientName, long accountId, int phraseId, int channelId, int obfuscationGuard) {
        vt.lastQuickChatChannel = channelId;
        AdaptiveMidiPcmStream.lastQuickChatRecipientName = recipientName;
        vi.lastQuickChatPhraseId = phraseId;
        if (obfuscationGuard != 19212) {
          return;
        }
        try {
          lq.hasLastQuickChat = true;
          RevivalEvent.lastQuickChatRecipientAccountId = accountId;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jh.Q(" + (recipientName != null ? "{...}" : "null") + ',' + accountId + ',' + phraseId + ',' + channelId + ',' + obfuscationGuard + ')');
        }
    }

    final String describeText(byte obfuscationGuard, String text) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 89) {
            field_l = (RgbSprite[]) null;
          }
          if (this.validateText(-3137, text) != rn.validationInvalid) {
            return null;
          }
          stackIn_5_0 = jg.field_n;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jh.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        requestedAccountName = null;
        if (param0 >= -45) {
          field_k = (int[]) null;
        }
        field_l = null;
        field_k = null;
    }

    final static void c(byte param0) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 >= -64) {
              AgeValidator.isPacketPayloadReady(-70);
            }
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                hq.field_f = (int)(var3.longValue() / 1048576L) + 1;
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
