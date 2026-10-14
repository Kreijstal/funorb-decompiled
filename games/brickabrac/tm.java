/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private static long[] field_c;
    static boolean[] decodedSpriteHasAlpha;
    static String field_h;
    static NodeDeque pendingTableSubmissions;
    static int field_a;
    static String field_e;
    static String field_d;
    static int field_g;

    final static void a(PacketBuffer param0, int param1, byte param2, java.math.BigInteger param3, int param4, byte[] param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = ProxySocketConnector.roundUpToEight((byte) -98, param1);
          if (null == ReflectionCheck.field_p) {
            ReflectionCheck.field_p = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = ReflectionCheck.field_p.nextInt();
          }
          if (RadialSelectorWidget.field_N == null ||
            !(RadialSelectorWidget.field_N.data.length >= var7_int)) {
            RadialSelectorWidget.field_N = new PacketBuffer(var7_int);
          }
          RadialSelectorWidget.field_N.position = 0;
          RadialSelectorWidget.field_N.writeBytes(param5, -1, param4, param1);
          RadialSelectorWidget.field_N.padToPosition((byte) -74, var7_int);
          RadialSelectorWidget.field_N.encryptBlocks(18146, var13);
          if (null == RectangleBody.field_r ||
            !(RectangleBody.field_r.data.length >= 100)) {
            RectangleBody.field_r = new PacketBuffer(100);
          }
          RectangleBody.field_r.position = 0;
          RectangleBody.field_r.writeByte(21, 10);
          if (param2 <= 115) {
            tm.getChatFilter(-128, (byte) -47);
          }
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            RectangleBody.field_r.writeInt(var13[var11], (byte) -79);
            var11++;
          }
          RectangleBody.field_r.writeShort((byte) 122, param1);
          RectangleBody.field_r.applyRsa(param3, param6, 19775);
          param0.writeBytes(RectangleBody.field_r.data, -1, 0, RectangleBody.field_r.position);
          param0.writeBytes(RadialSelectorWidget.field_N.data, -1, 0, RadialSelectorWidget.field_N.position);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("tm.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        DelayedPacket var6_ref_pg = null;
        int var7 = 0;
        byte[] var8 = null;
        DelayedPacket var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        DelayedPacket var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (TabbedPane.field_Ub != 0) {
            var2_long = MonotonicTime.nowMillis(false);
            var4 = TabbedPane.field_Ub;
            if (HuffmanCodec.field_b != 0.0) {
              var4 = (int)((double)var4 + IterableIntrusiveHashTable.packetDelayRandom.nextGaussian() * HuffmanCodec.field_b);
              if (0 > var4) {
                var4 = 0;
              }
            }
            if (0 < TextFieldValidator.outgoingPackets.position) {
              var14 = new byte[TextFieldValidator.outgoingPackets.position];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var14.length > var6; var6++) {
                var8[var6] = TextFieldValidator.outgoingPackets.data[var6];
              }
              var6_ref_pg = new DelayedPacket(var2_long + (long)var4, TextFieldValidator.outgoingPackets.position, var17);
              hg.field_a.addLast(var6_ref_pg, (byte) 3);
              TextFieldValidator.outgoingPackets.position = 0;
            }
            var9 = (DelayedPacket) (hg.field_a.first(-62));
            var13 = var9;
            if (var13 != null &&
              var13.deliverAfterMillis < var2_long) {
              var13.unlink((byte) 111);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.opcode) {
                TextFieldValidator.outgoingPackets.data[var10] = var9.data[var10];
                var10++;
              }
              TextFieldValidator.outgoingPackets.position = var13.opcode;
            }
          }
          if (param0 != 110) {
            decodedSpriteHasAlpha = (boolean[]) null;
          }
          ActivityIndicatorWidget.a(param1, 10000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "tm.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        if (!param0) {
          return;
        }
        decodedSpriteHasAlpha = null;
        pendingTableSubmissions = null;
        field_e = null;
        field_d = null;
    }

    final static int getChatFilter(int channel, byte obfuscationGuard) {
        int var2 = 0;
        if (channel == 0) {
          var2 = InstructionsScreen.lobbyChatFilter;
        }
        if (obfuscationGuard != 18) {
          java.math.BigInteger var3 = (java.math.BigInteger) null;
          tm.a((PacketBuffer) null, 46, (byte) -64, (java.math.BigInteger) null, -75, (byte[]) null, (java.math.BigInteger) null);
        }
        if (channel == 1) {
          var2 = InstructionsScreen.gameChatFilter;
        }
        if (channel == 2) {
          var2 = WeightedLruCache.privateChatFilter;
        }
        return var2;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_c = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_c[var2] = var0;
        }
        field_h = "Ninja skills!";
        field_e = "Waiting for graphics";
        pendingTableSubmissions = new NodeDeque();
        field_d = "Strong: balls destroy bricks without bouncing.";
    }
}
