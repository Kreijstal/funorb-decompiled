/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static Sprite field_k;
    static String field_o;
    static int[] field_j;
    static String field_l;
    private java.nio.ByteBuffer buffer;
    static ViewportController field_n;

    final byte[] toByteArray(int guard) {
        if (guard != 4) {
          field_j = (int[]) null;
        }
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        this.buffer.get(var3);
        return var3;
    }

    public static void releaseStatics(int guard) {
        field_j = null;
        field_k = null;
        field_o = null;
        field_n = null;
        field_l = null;
        if (guard != -4) {
          DirectByteStorage.writeAchievementQuery(111, 74);
        }
    }

    final void setBytes(boolean guard, byte[] bytes) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(bytes.length);
          this.buffer.position(0);
          if (!guard) {
            this.buffer = (java.nio.ByteBuffer) null;
          }
          this.buffer.put(bytes);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "km.B(" + guard + ',' + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    final static void writeAchievementQuery(int opcode, int guard) {
        CipherPacketBuffer var2 = QuickChatDynamicCommand.outgoingPackets;
        var2.writeCipheredOpcode(opcode, true);
        var2.writeByte(1, -123);
        int var3 = -50 % ((61 - guard) / 57);
        var2.writeByte(2, -123);
    }

    DirectByteStorage() {
    }

    final static void b(byte param0) {
        if (param0 != -59) {
          return;
        }
        if (!TrackerMusicDefinition.field_f.accountAchievementsLoaded &&
          !TrackerMusicDefinition.field_f.queryFailed) {
          TrackerMusicDefinition.field_f.requestAccountAchievements((byte) -126);
          TrackerMusicDefinition.field_f.pollAccountQuery(param0 ^ 19593);
        }
        if (!ua.field_c.isLoaded(-19836)) {
          ua.field_c.pollLoad(-9949);
        }
        CachedArchiveProvider.b(param0 ^ -57);
        SimulatorAssetSupport.loadSimulatorSprites(0);
    }

    final static void readReflectionCheck(PacketBuffer buffer, SystemTaskService taskService, int unused, int guard) {
        try {
          String stackIn_39_2 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          String var8 = null;
          int var9 = 0;
          int var14 = EscapeVector.obfuscationControl;
          try {
            if (guard != -24183) {
              return;
            }
            ReflectionCheck var17 = new ReflectionCheck();
            var17.operationCount = buffer.readUnsignedByte(0);
            var17.id = buffer.readInt(guard + 19130);
            var17.methodTasks = new SystemTask[var17.operationCount];
            var17.operations = new int[var17.operationCount];
            var17.errors = new int[var17.operationCount];
            var17.replacementValues = new int[var17.operationCount];
            var17.serializedArguments = new byte[var17.operationCount][][];
            var17.fieldTasks = new SystemTask[var17.operationCount];
            for (int var5 = 0; var5 < var17.operationCount; var5++) {
              try {
                int var6_int = buffer.readUnsignedByte(0);
                if (0 == var6_int ||
                  var6_int == 1 ||
                  var6_int == 2) {
                  String var15 = buffer.readString(false);
                  String var7 = var15;
                  var8 = buffer.readString(false);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = buffer.readInt(-5053);
                  }
                  var17.operations[var5] = var6_int;
                  var17.replacementValues[var5] = var9;
                  var17.fieldTasks[var5] = taskService.a(var8, AchievementTracker.classForReflectionType(var15, (byte) 38), PacketBuffer.xor(guard, 24120));
                } else if (var6_int == 3 ||
                  var6_int == 4) {
                  String var19 = buffer.readString(false);
                  var8 = buffer.readString(false);
                  var9 = buffer.readUnsignedByte(guard + 24183);
                  String[] var10 = new String[var9];
                  for (int var11_int = 0; var11_int < var9; var11_int++) {
                    var10[var11_int] = buffer.readString(false);
                  }
                  byte[][] var20 = new byte[var9][];
                  byte[][] var18 = var20;
                  byte[][] var11 = var18;
                  if (var6_int == 3) {
                    for (int var12_int = 0; var12_int < var9; var12_int++) {
                      int var13 = buffer.readInt(guard ^ 19914);
                      byte[] array$0 = new byte[var13];
                      var11[var12_int] = array$0;
                      buffer.readBytes(var20[var12_int], (byte) -96, 0, var13);
                    }
                  }
                  var17.operations[var5] = var6_int;
                  Class[] var12 = new Class[var9];
                  int var16 = 0;
                  int var13Lifetime1 = var16;
                  while (var16 < var9) {
                    var12[var16] = AchievementTracker.classForReflectionType(var10[var16], (byte) 38);
                    var16++;
                  }
                  var17.methodTasks[var5] = taskService.a(var8, PacketBuffer.xor(guard, -24074), AchievementTracker.classForReflectionType(var19, (byte) 38), var12);
                  var17.serializedArguments[var5] = var20;
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                ClassNotFoundException var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var17.errors[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                SecurityException var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var17.errors[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                NullPointerException var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var17.errors[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                Exception var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var17.errors[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                Throwable var6_ref4 = decompiledCaughtException;
                var17.errors[var5] = -5;
              }
            }
            SpriteFactorySupport.field_a.addLast(-12328, var17);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            RuntimeException var4 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_38_0 = var4;
            StringBuilder stackIn_38_1 = new StringBuilder().append("km.F(");
            if (buffer == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            StringBuilder stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
            if (taskService == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(unused).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(PacketBuffer param0, int param1) {
        try {
          CachedArchiveProvider.field_n = param0.readUnsignedShort(param1 - 1238557701) << 5;
          int var2_int = param0.readUnsignedByte(0);
          CachedArchiveProvider.field_n = CachedArchiveProvider.field_n + (var2_int >> 3);
          wk.field_d = 1835008 & var2_int << 18;
          wk.field_d = wk.field_d + (param0.readUnsignedShort(1952) << 2);
          int var2_intLifetime1 = param0.readUnsignedByte(param1 - 1238559653);
          wk.field_d = wk.field_d + (var2_intLifetime1 >> 6);
          PointCloudEffect.field_u = (63 & var2_intLifetime1) << 15;
          PointCloudEffect.field_u = PointCloudEffect.field_u + (param0.readUnsignedByte(param1 - 1238559653) << 7);
          int var2_intLifetime2 = param0.readUnsignedByte(param1 ^ param1);
          SocketJs5Transport.field_s = (var2_intLifetime2 & 1) << 16;
          PointCloudEffect.field_u = PointCloudEffect.field_u + (var2_intLifetime2 >> 1);
          SocketJs5Transport.field_s = SocketJs5Transport.field_s + param0.readUnsignedShort(1952);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "km.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_o = "Retrieval objectives";
        field_j = new int[8192];
        field_n = null;
    }
}
