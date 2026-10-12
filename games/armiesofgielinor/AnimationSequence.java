/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationSequence {
    private int[][] opcode13Rows;
    private int[] opcode3Values;
    static String[] field_c;
    int[] frameDurations;
    boolean unlimitedLoops;
    int maximumLoops;
    static int[] field_f;
    static ContextActionMenu field_h;
    int[] frameIds;
    static String field_k;
    static String field_l;
    int loopStartFrame;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != -8) {
            field_c = (String[]) null;
          }
          while (lp.field_c.length > var1_int) {
            op.field_c[0][var1_int] = lp.field_c[var1_int];
            var1_int++;
          }
          var3 = 0;
          var1_intLifetime1 = var3;
          while (var3 < bn.field_a.length) {
            ActionRequest.unitModels[76][var3] = bn.field_a[var3];
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "qb.E(" + param0 + ')');
        }
    }

    private final void decodeOpcode(int obfuscationGuard, PacketBuffer packet, int opcode) {
        int[] rowValues = null;
        int wordIndex = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int elementCount = 0;
        RuntimeException var4 = null;
        int elementIndex = 0;
        int rowLength = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (opcode == 1) {
            elementCount = packet.readUnsignedShort((byte) -104);
            this.frameDurations = new int[elementCount];
            for (elementIndex = 0; elementCount > elementIndex; elementIndex++) {
              this.frameDurations[elementIndex] = packet.readUnsignedShort((byte) -104);
            }
            this.frameIds = new int[elementCount];
            for (elementIndex = 0; elementIndex < elementCount; elementIndex++) {
              this.frameIds[elementIndex] = packet.readUnsignedShort((byte) -104);
            }
            for (elementIndex = 0; elementIndex < elementCount; elementIndex++) {
              this.frameIds[elementIndex] = (packet.readUnsignedShort((byte) -104) << 16) + this.frameIds[elementIndex];
            }
          } else {
            if (opcode == 2) {
              this.loopStartFrame = packet.readUnsignedShort((byte) -104);
            } else {
              if (opcode == 3) {
                elementCount = packet.readUnsignedByte(0);
                this.opcode3Values = new int[1 + elementCount];
                for (elementIndex = 0; elementCount > elementIndex; elementIndex++) {
                  this.opcode3Values[elementIndex] = packet.readUnsignedByte(0);
                }
                this.opcode3Values[elementCount] = 9999999;
              } else {
                if (opcode != 5) {
                  if (opcode == 6) {
                    packet.readUnsignedShort((byte) -104);
                  } else {
                    if (opcode == 7) {
                      packet.readUnsignedShort((byte) -104);
                    } else {
                      if (opcode == 8) {
                        this.maximumLoops = packet.readUnsignedByte(0);
                        this.unlimitedLoops = false;
                      } else {
                        if (9 != opcode) {
                          if (opcode == 10) {
                            packet.readUnsignedByte(obfuscationGuard ^ 0);
                          } else {
                            if (opcode != 11) {
                              if (opcode == 12) {
                                elementCount = packet.readUnsignedByte(0);
                                for (elementIndex = 0; elementIndex < elementCount; elementIndex++) {
                                  packet.readUnsignedShort((byte) -104);
                                }
                                for (elementIndex = 0; elementIndex < elementCount; elementIndex++) {
                                  packet.readUnsignedShort((byte) -104);
                                }
                              } else {
                                if (opcode == 13) {
                                  elementCount = packet.readUnsignedShort((byte) -104);
                                  this.opcode13Rows = new int[elementCount][];
                                  for (elementIndex = 0; elementCount > elementIndex; elementIndex++) {
                                    rowLength = packet.readUnsignedByte(obfuscationGuard + 0);
                                    if (rowLength > 0) {
                                      rowValues = new int[rowLength];
                                      this.opcode13Rows[elementIndex] = rowValues;
                                      this.opcode13Rows[elementIndex][0] = packet.readUnsignedMedium((byte) -13);
                                      for (wordIndex = 1; wordIndex < rowLength; wordIndex++) {
                                        this.opcode13Rows[elementIndex][wordIndex] = packet.readUnsignedShort((byte) -104);
                                      }
                                    }
                                  }
                                } else {
                                  if (opcode != 14 &&
                                    opcode != 15 &&
                                    opcode != 16 &&
                                    opcode != 18) {
                                  }
                                }
                              }
                            } else {
                              packet.readUnsignedByte(obfuscationGuard ^ 0);
                            }
                          }
                        } else {
                          packet.readUnsignedByte(0);
                        }
                      }
                    }
                  }
                } else {
                  packet.readUnsignedByte(obfuscationGuard + 0);
                }
              }
            }
          }
          if (obfuscationGuard != 0) {
            this.frameIds = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_58_0 = var4;
          stackIn_58_1 = new StringBuilder().append("qb.C(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(opcode).append(')').toString());
        }
    }

    private AnimationSequence(ResourceArchive param0, int param1, String param2) {
        this(param0, param1, param0.getFileId((byte) 28, param1, param2));
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + tq.field_c) / 2;
        int var4 = -54 / ((33 - param1) / 47);
        int var3 = mj.field_c * mj.field_c;
        int var5 = -(param0 * param0) + var3;
        lk.field_a.setBounds(-90 + (-120 + (SoftwareRaster.height - 4)), -20500, 199, 90, -(199 * var5 / var3) + var2);
        pd.field_c.setBounds(SoftwareRaster.height - 124, -20500, 438, 0, 202 + var2 + 438 * var5 / var3);
    }

    private final void decode(int obfuscationGuard, PacketBuffer packet) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          while (true) {
            var3_int = packet.readUnsignedByte(0);
            if (var3_int != 0) {
              this.decodeOpcode(0, packet, var3_int);
              continue;
            }
            break;
          }
          if (obfuscationGuard != 32737) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qb.B(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 >= -18) {
          return;
        }
        field_l = null;
        field_h = null;
        field_f = null;
        field_c = null;
    }

    AnimationSequence(ResourceArchive param0, String param1, String param2) {
        this(param0, param0.getGroupId(param1, 122), param2);
    }

    private AnimationSequence(ResourceArchive param0, int param1, int param2) {
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
        this.maximumLoops = 0;
        this.loopStartFrame = -1;
        try {
          this.unlimitedLoops = true;
          var11 = param0.getFile((byte) 113, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.decode(32737, new PacketBuffer(var11));
          }
          var5 = 0;
          for (var6 = 0; this.frameIds.length > var6; var6++) {
            if (var5 < this.frameIds[var6]) {
              var5 = this.frameIds[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; var7 < this.frameDurations.length; var7++) {
            if (this.frameDurations[var7] > var6Lifetime1) {
              var6Lifetime1 = this.frameDurations[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("qb.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = new int[]{4, 5, 6, 7, 8};
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_l = "Bolts";
        field_k = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
