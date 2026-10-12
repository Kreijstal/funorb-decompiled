/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends mk {
    static RgbSprite[] field_l;
    static String field_j;
    static int[] field_k;

    final static void a(PacketBuffer param0, hd param1, int param2, int param3) {
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
            var18.field_k = new wo[var18.field_p];
            var18.field_r = new wo[var18.field_p];
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
                      var10[var11_int] = param0.readNullTerminatedString(GrowthEvent.b(param3, -2));
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
                    var18.field_r[var5] = param1.a(ah.a(var20, (byte) 90), 0, var12, var21);
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
                  var18.field_k[var5] = param1.a(-30598, ah.a(var15, (byte) 90), var16);
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
            tp.field_e.addLast((byte) -119, (IntrusiveNode) (var18));
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

    jh(fn param0) {
        super(param0);
    }

    final gu a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        gu stackIn_5_0 = null;
        gu stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3137) {
            field_k = (int[]) null;
          }
          var4 = (CharSequence) ((Object) param1);
          if (!vv.a(-66, var4)) {
            stackIn_5_0 = rn.field_e;
            return stackIn_5_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = dq.a(46, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return oo.field_g;
          }
          stackIn_10_0 = rn.field_e;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jh.R(").append(param0).append(',');
          if (param1 == null) {
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
          if (!es.receivePacketBytes(-122, 1)) {
            return false;
          }
          fk.packetPayloadLength = ByteStorage.incomingPacket.readUnsignedByte(0);
          ByteStorage.incomingPacket.position = 0;
        }
        if (-2 == fk.packetPayloadLength) {
          if (!es.receivePacketBytes(-96, 2)) {
            return false;
          }
          fk.packetPayloadLength = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
          ByteStorage.incomingPacket.position = 0;
        }
        return es.receivePacketBytes(-105, fk.packetPayloadLength);
    }

    final static void a(String param0, long param1, int param2, int param3, int param4) {
        vt.field_l = param3;
        wn.field_db = param0;
        vi.field_e = param2;
        if (param4 != 19212) {
          return;
        }
        try {
          lq.field_d = true;
          RevivalEvent.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 89) {
            field_l = (RgbSprite[]) null;
          }
          if (this.a(-3137, param1) != rn.field_e) {
            return null;
          }
          stackIn_5_0 = jg.field_n;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_j = null;
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
              jh.isPacketPayloadReady(-70);
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
