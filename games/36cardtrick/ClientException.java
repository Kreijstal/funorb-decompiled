/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    String context;
    Throwable cause;
    static String field_c;

    final static void detectMaxHeapMegabytes(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          byte[] var4 = null;
          Object[] var5 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 != 7400) {
              var4 = (byte[]) null;
              ClientException.decompressContainer(-53, (byte[]) null);
            }
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var5 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              v.field_Q = (int)(var3.longValue() / 1048576L) + 1;
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] decompressContainer(int param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param1);
          if (param0 > -54) {
            ClientException.clearStaticReferences((byte) -15);
          }
          var3 = var9.readUnsignedByte(-124);
          var4 = var9.readInt((byte) 126);
          if (0 <= var4 && (0 == rl.field_u ||
            !(rl.field_u < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(97, var13, 0, var4);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.readInt((byte) 126);
            if (var5_int >= 0 && (rl.field_u == 0 ||
              !(rl.field_u < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 != 1) {
                var7 = cc.field_f;
                synchronized (var7) {
                  cc.field_f.inflate(var9, 2, var12);
                }
              } else {
                Bzip2Decompressor.decompress(var12, var5_int, param1, var4, 9);
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ac.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 != -118) {
          field_c = (String) null;
        }
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.context = param1;
    }

    static {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
