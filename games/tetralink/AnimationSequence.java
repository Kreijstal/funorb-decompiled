/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationSequence {
    static String field_h;
    static IntrusiveDeque field_d;
    boolean field_i;
    int field_k;
    private int[][] field_a;
    int field_b;
    int[] field_l;
    static PacketBuffer field_j;
    int[] field_f;
    static boolean field_e;
    private int[] field_c;
    static char field_m;
    static boolean field_g;

    final static void openPrivateChatTo(boolean param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          LongAndTextCredentials.field_m = param1;
          SecondaryNodeDequeIterator.field_d = 2;
          var5 = (CharSequence) ((Object) param1);
          NineSliceFrameHelpers.field_a = DialWidgetPainter.normalizeDisplayName(var5, (byte) 114);
          PendingListRequest.field_o = param2;
          if (param0) {
            field_h = (String) null;
          }
          MenuScreen.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "tb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void decode(boolean param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        PacketBuffer var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          if (!param0) {
            var5 = (PacketBuffer) null;
            this.decodeOpcode(-64, (byte) 59, (PacketBuffer) null);
          }
          while (true) {
            var3_int = param1.readUnsignedByte((byte) -99);
            if (0 == var3_int) {
              return;
            }
            this.decodeOpcode(var3_int, (byte) -5, param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("tb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    AnimationSequence(Archive param0, String param1, String param2) {
        this(param0, param0.getGroupIdByName(-1, param1), param2);
    }

    final static void sendFlagRequest(int param0, int param1) {
        BitPacketBuffer var2 = QuickChatHelpDialog.field_Lb;
        var2.writeCipheredByte(param0, (byte) -92);
        var2.writeByte(1, false);
        if (param1 != -15289) {
          field_j = (PacketBuffer) null;
        }
        var2.writeByte(1, false);
    }

    private AnimationSequence(Archive param0, int param1, String param2) {
        this(param0, param1, param0.getFileIdByName(param1, false, param2));
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_j = null;
        field_h = null;
        if (param0 >= -112) {
          field_d = (IntrusiveDeque) null;
        }
    }

    private final void decodeOpcode(int param0, byte param1, PacketBuffer param2) {
        int[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          if (param1 != -5) {
            return;
          }
          if (param0 == 1) {
            var4_int = param2.readUnsignedShort(param1 + 132);
            this.field_l = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_l[var5] = param2.readUnsignedShort(127);
            }
            this.field_f = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_f[var5] = param2.readUnsignedShort(127);
            }
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_f[var5] = (param2.readUnsignedShort(127) << 16) + this.field_f[var5];
            }
          } else {
            if (param0 == 2) {
              this.field_k = param2.readUnsignedShort(127);
              return;
            }
            if (param0 == 3) {
              var4_int = param2.readUnsignedByte((byte) -99);
              this.field_c = new int[var4_int + 1];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_c[var5] = param2.readUnsignedByte((byte) -99);
              }
              this.field_c[var4_int] = 9999999;
              return;
            }
            if (param0 == 5) {
              param2.readUnsignedByte((byte) -99);
              return;
            }
            if (param0 == 6) {
              param2.readUnsignedShort(127);
              return;
            }
            if (param0 == 7) {
              param2.readUnsignedShort(127);
              return;
            }
            if (8 == param0) {
              this.field_b = param2.readUnsignedByte((byte) -99);
              this.field_i = false;
              return;
            }
            if (param0 == 9) {
              param2.readUnsignedByte((byte) -99);
              return;
            }
            if (param0 == 10) {
              param2.readUnsignedByte((byte) -99);
              return;
            }
            if (param0 == 11) {
              param2.readUnsignedByte((byte) -99);
              return;
            }
            if (12 == param0) {
              var4_int = param2.readUnsignedByte((byte) -99);
              for (var5 = 0; var5 < var4_int; var5++) {
                param2.readUnsignedShort(127);
              }
              for (var5 = 0; var5 < var4_int; var5++) {
                param2.readUnsignedShort(param1 ^ -124);
              }
            } else if (13 == param0) {
              var4_int = param2.readUnsignedShort(127);
              this.field_a = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param2.readUnsignedByte((byte) -99);
                if (var6 > 0) {
                  array$0 = new int[var6];
                  this.field_a[var5] = array$0;
                  this.field_a[var5][0] = param2.readMedium(-1);
                  for (var7 = 1; var6 > var7; var7++) {
                    this.field_a[var5][var7] = param2.readUnsignedShort(127);
                  }
                }
              }
            } else {
              if (param0 != 14) {
                if (param0 == 15) {
                  return;
                }
                if (16 != param0 &&
                  param0 != 18) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("tb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    final static void sleepMillis(boolean param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0) {
          AnimationSequence.openPrivateChatTo(false, (String) null, -3L);
        }
        if (param1 % 10L != 0L) {
          ThreeSliceButtonPainter.sleepIgnoringInterrupt(param1, -568127903);
        } else {
          ThreeSliceButtonPainter.sleepIgnoringInterrupt(-1L + param1, -568127903);
          ThreeSliceButtonPainter.sleepIgnoringInterrupt(1L, -568127903);
        }
    }

    final static boolean containsPoint(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        boolean stackIn_6_0 = false;
        var7 = -92 / ((-53 - param6) / 49);
        stackIn_6_0 = (param3 >= param1) && (param3 < param1 + param4) && (param0 >= param2) && (param0 < param5 + param2);
        return stackIn_6_0;
    }

    private AnimationSequence(Archive param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_k = -1;
        this.field_b = 0;
        try {
          this.field_i = true;
          var11 = param0.getFile(3, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.decode(true, new PacketBuffer(var11));
          }
          var5 = 0;
          for (var6 = 0; this.field_f.length > var6; var6++) {
            if (this.field_f[var6] > var5) {
              var5 = this.field_f[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; this.field_l.length > var7; var7++) {
            if (var6Lifetime1 < this.field_l[var7]) {
              var6Lifetime1 = this.field_l[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("tb.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_h = "Email is valid";
        field_d = new IntrusiveDeque();
        field_j = new PacketBuffer(256);
        field_e = true;
    }
}
