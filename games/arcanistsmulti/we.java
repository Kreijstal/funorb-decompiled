/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    static String field_e;
    String[] field_c;
    static int field_b;
    static String field_d;
    static String field_a;

    final static void a(int param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != CredentialKind.field_c) {
            if (0 <= param0) {
              decompiledFrameRemainder0 = (qc.field_c == ResizableModalPanel.field_eb);
              if ((decompiledFrameRemainder0) && (he.field_e.position == 0 &&
                qj.monotonicTimeMillis(-26572) > 10000L + fo.field_d)) {
                he.field_e.writeOpcode((byte) -50, param0);
              }
            } else {
              if (he.field_e.position == 0 &&
                qj.monotonicTimeMillis(-26572) > 10000L + fo.field_d) {
                he.field_e.writeOpcode((byte) -50, param0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param1 < 73) {
                field_d = (String) null;
              }
              if (he.field_e.position > 0) {
                try {
                  CredentialKind.field_c.write(he.field_e.position, 0, (byte) 122, he.field_e.payload);
                  fo.field_d = qj.monotonicTimeMillis(-26572);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ProxySocketConnector.closeActiveConnection(false);
                }
                he.field_e.position = 0;
              }
              return;
            }
          }
          he.field_e.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        int var1 = -7 % ((param0 + 28) / 61);
        field_e = null;
        field_a = null;
    }

    final static int b(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != -3) {
            we.a((byte) -29);
          }
          var1_int = 0;
          while (BevelTextPainter.pollKeyEvent(false)) {
            NumericDateInputWidget.field_S.a((byte) -76);
            if (!NumericDateInputWidget.field_S.b(true)) {
              continue;
            }
            var1_int = 1;
          }
          NumericDateInputWidget.field_S.a(ao.a(param0 + 31131, EmailLoginCredentials.field_g, MenuButtonPanel.field_I), ao.a(param0 ^ -31131, pb.field_h, ja.field_s), -97);
          if (NumericDateInputWidget.field_S.b(true)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            0 <= NumericDateInputWidget.field_S.field_h) {
            var2 = cf.field_c[NumericDateInputWidget.field_S.field_h];
            if (var2 == 2) {
              Js5NetworkRequest.c(false);
            }
          }
          stackIn_17_0 = var2;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "we.F(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -80) {
          we.releaseStatics(84);
          if (null == pm.field_b) {
            return oj.field_i ? true : false;
          }
          return true;
        }
        if (null != pm.field_b) {
          return true;
        }
        if (!oj.field_i) {
          return false;
        }
        return true;
    }

    final static void writeSecureLoginBlock(java.math.BigInteger param0, int param1, byte[] param2, PacketBuffer param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7_int = LoadingProgressDialog.padToByteBoundary(param1 ^ 29389, param6);
          if (null == c.field_b) {
            c.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = c.field_b.nextInt();
          }
          if (ue.field_c == null ||
            !(var7_int <= ue.field_c.payload.length)) {
            ue.field_c = new PacketBuffer(var7_int);
          }
          ue.field_c.position = 0;
          ue.field_c.writeBytes(param2, param4, (byte) -86, param6);
          ue.field_c.padTo(var7_int, (byte) 83);
          ue.field_c.xteaEncrypt(param1 ^ 127, var13);
          if (KeyboardInputHandler.field_b == null ||
            !(KeyboardInputHandler.field_b.payload.length >= 100)) {
            KeyboardInputHandler.field_b = new PacketBuffer(100);
          }
          KeyboardInputHandler.field_b.position = 0;
          KeyboardInputHandler.field_b.writeByte(10, (byte) -33);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            KeyboardInputHandler.field_b.writeInt(var13[var11], (byte) -101);
            var11++;
          }
          KeyboardInputHandler.field_b.writeShort(param6, (byte) -60);
          KeyboardInputHandler.field_b.rsaEncrypt(param0, (byte) 95, param5);
          param3.writeBytes(KeyboardInputHandler.field_b.payload, 0, (byte) -86, KeyboardInputHandler.field_b.position);
          param3.writeBytes(ue.field_c.payload, param1, (byte) -86, ue.field_c.position);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("we.D(");
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
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param6).append(')').toString());
        }
    }

    private we() throws Throwable {
        throw new Error();
    }

    final long a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
          return qj.monotonicTimeMillis(-26572);
        }
        return qj.monotonicTimeMillis(-26572);
    }

    static {
        field_e = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_b = 0;
        field_d = "to return to the normal view.";
        field_a = "Down below you will see your spellbook. Currently, it only contains the Fire Ball spell, but, as you complete your training, your selection of spells will increase. Click on the Fire Ball spell to continue.";
    }
}
