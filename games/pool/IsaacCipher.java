/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacCipher {
    private int field_m;
    private int field_i;
    private int field_c;
    static int field_e;
    static PcmSample field_l;
    static int field_d;
    static String escCancelprivatemessage;
    static int[] field_h;
    private int[] field_j;
    private int[] field_a;
    static Sprite[] field_f;
    static int[] field_b;
    private int field_k;

    public static void releaseStatics(int param0) {
        field_f = null;
        escCancelprivatemessage = null;
        field_l = null;
        field_h = null;
        field_b = null;
        if (param0 >= 0) {
          PoolGameModel var2 = (PoolGameModel) null;
          IsaacCipher.a(57, (PoolGameModel) null);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (param1 <= 0) {
          throw new IllegalArgumentException();
        }
        int var3 = 2147483647 - (int)(4294967296L % (long)param1);
        if (param0 != 23165) {
          PoolGameModel var5 = (PoolGameModel) null;
          IsaacCipher.a(73, (PoolGameModel) null);
        }
        do {
          var4 = this.a((byte) 7);
        } while (var4 > var3);
        return NameEntryPopup.a(true, param1, var4);
    }

    private final void a(boolean param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_k = this.field_k + fieldTemp$0;
        var2 = 0;
        if (!param0) {
          this.b(9);
        }
        while (var2 < 256) {
          var3 = this.field_a[var2];
          if (0 == (var2 & 2)) {
            if ((var2 & 1) != 0) {
              this.field_m = this.field_m ^ this.field_m >>> 6;
            } else {
              this.field_m = this.field_m ^ this.field_m << 13;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_m = this.field_m ^ this.field_m >>> 16;
            } else {
              this.field_m = this.field_m ^ this.field_m << 2;
            }
          }
          this.field_m = this.field_m + this.field_a[255 & var2 + 128];
          dupTemp$1 = this.field_k + (this.field_a[ArchiveLoadSequence.bitwiseAnd(var3 >> 2, 255)] + this.field_m);
          var4 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          dupTemp$2 = this.field_a[ArchiveLoadSequence.bitwiseAnd(var4, 261279) >> 8 >> 2] + var3;
          this.field_k = dupTemp$2;
          this.field_j[var2] = dupTemp$2;
          var2++;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 2) {
          this.field_j = (int[]) null;
        }
        int var4 = -1640531527;
        int var10 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var3 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var5 = var5 + this.field_j[var2Lifetime1 + 2];
          var4 = var4 + this.field_j[1 + var2Lifetime1];
          var6 = var6 + this.field_j[3 + var2Lifetime1];
          var7 = var7 + this.field_j[4 + var2Lifetime1];
          var9 = var9 + this.field_j[var2Lifetime1 + 6];
          var3 = var3 + this.field_j[var2Lifetime1];
          var8 = var8 + this.field_j[5 + var2Lifetime1];
          var10 = var10 + this.field_j[var2Lifetime1 + 7];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[1 + var2Lifetime1] = var4;
          this.field_a[var2Lifetime1 + 2] = var5;
          this.field_a[3 + var2Lifetime1] = var6;
          this.field_a[var2Lifetime1 + 4] = var7;
          this.field_a[5 + var2Lifetime1] = var8;
          this.field_a[var2Lifetime1 + 6] = var9;
          this.field_a[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_a[7 + var2Lifetime2];
          var9 = var9 + this.field_a[6 + var2Lifetime2];
          var3 = var3 + this.field_a[var2Lifetime2];
          var8 = var8 + this.field_a[5 + var2Lifetime2];
          var6 = var6 + this.field_a[3 + var2Lifetime2];
          var4 = var4 + this.field_a[1 + var2Lifetime2];
          var5 = var5 + this.field_a[var2Lifetime2 + 2];
          var7 = var7 + this.field_a[4 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[var2Lifetime2 + 1] = var4;
          this.field_a[var2Lifetime2 + 2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[var2Lifetime2 + 4] = var7;
          this.field_a[5 + var2Lifetime2] = var8;
          this.field_a[6 + var2Lifetime2] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
        }
        this.a(true);
        this.field_c = 256;
    }

    final static void a(MeshBuilder param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        float[] var31 = null;
        float[] var32 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        var12 = Pool.field_O;
        try {
          var2_int = 0;
          for (var3 = param1; param0.faceCount > var3; var3++) {
            if (param0.field_L[var3] != -1) {
              var2_int++;
            }
          }
          param0.field_o = OpacityWidget.a((byte) 60, param0.field_o, var2_int);
          param0.field_p = QuickChatPhraseDefinition.a(param0.field_p, (byte) -73, var2_int * 3);
          param0.field_H = QuickChatPhraseDefinition.a(param0.field_H, (byte) -73, var2_int * 3);
          param0.field_C = QuickChatPhraseDefinition.a(param0.field_C, (byte) -73, var2_int * 3);
          param0.vertexX = MenuScreenBase.a(var2_int * 3, (byte) 108, param0.vertexX);
          param0.vertexY = MenuScreenBase.a(3 * var2_int, (byte) 108, param0.vertexY);
          param0.vertexZ = MenuScreenBase.a(var2_int * 3, (byte) 108, param0.vertexZ);
          for (var2_intLifetime1 = 0; param0.faceCount > var2_intLifetime1; var2_intLifetime1++) {
            if (param0.field_L[var2_intLifetime1] != -1) {
              var3Lifetime1 = param0.field_k[var2_intLifetime1];
              var31 = new float[3];
              var32 = new float[3];
              var26 = new int[3];
              var18 = var26;
              var6 = var18;
              var28 = new int[3];
              var20 = var28;
              var7 = var20;
              var23 = new int[3];
              var15 = var23;
              var8 = var15;
              var25 = new int[3];
              var17 = var25;
              var9 = var17;
              var27 = new int[3];
              var19 = var27;
              var10 = var19;
              var22 = new int[3];
              var14 = var22;
              var11 = var14;
              var6[0] = param0.vertexX[param0.faceVertexA[var2_intLifetime1]];
              var6[1] = param0.vertexX[param0.faceVertexB[var2_intLifetime1]];
              var6[2] = param0.vertexX[param0.faceVertexC[var2_intLifetime1]];
              var7[0] = param0.vertexY[param0.faceVertexA[var2_intLifetime1]];
              var7[1] = param0.vertexY[param0.faceVertexB[var2_intLifetime1]];
              var7[2] = param0.vertexY[param0.faceVertexC[var2_intLifetime1]];
              var8[0] = param0.vertexZ[param0.faceVertexA[var2_intLifetime1]];
              var8[1] = param0.vertexZ[param0.faceVertexB[var2_intLifetime1]];
              var8[2] = param0.vertexZ[param0.faceVertexC[var2_intLifetime1]];
              var9[0] = param0.vertexX[param0.field_p[var3Lifetime1]];
              var9[1] = param0.vertexX[param0.field_H[var3Lifetime1]];
              var9[2] = param0.vertexX[param0.field_C[var3Lifetime1]];
              var10[0] = param0.vertexY[param0.field_p[var3Lifetime1]];
              var10[1] = param0.vertexY[param0.field_H[var3Lifetime1]];
              var10[2] = param0.vertexY[param0.field_C[var3Lifetime1]];
              var11[0] = param0.vertexZ[param0.field_p[var3Lifetime1]];
              var11[1] = param0.vertexZ[param0.field_H[var3Lifetime1]];
              var11[2] = param0.vertexZ[param0.field_C[var3Lifetime1]];
              PacketBuffer.a(var31, var22, var23, var32, var25, var26, var27, (byte) 111, var28);
              MenuScreen.a(var22, var27, var23, var28, var31, var26, var32, 0, var25);
              param0.field_k[var2_intLifetime1] = param0.addTextureTriangle((short)param0.addVertex(PauseMenuScreen.c(0, -54264319, var25[0]), PauseMenuScreen.c(0, -54264319, var27[0]), PauseMenuScreen.c(0, -54264319, var22[0])), (short)param0.addVertex(PauseMenuScreen.c(0, TutorialFactory.bitwiseXor(param1, -54264319), var25[1]), PauseMenuScreen.c(0, -54264319, var27[1]), PauseMenuScreen.c(0, -54264319, var22[1])), (short)param0.addVertex(PauseMenuScreen.c(0, -54264319, var25[2]), PauseMenuScreen.c(0, -54264319, var27[2]), PauseMenuScreen.c(0, -54264319, var22[2])));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("li.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    IsaacCipher(int[] param0) {
        int var2_int = 0;
        try {
          this.field_j = new int[256];
          this.field_a = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_j[var2_int] = param0[var2_int];
          }
          this.b(2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 7) {
          return -38;
        }
        if (this.field_c == 0) {
          this.a(true);
          this.field_c = 256;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_j[fieldTemp$0];
    }

    final static void a(int param0, PoolGameModel param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        IntrusiveDequeCursor var3 = null;
        ShotRecord var4 = null;
        CipherPacketBuffer var5 = null;
        try {
          if (param0 != 2243) {
            field_d = 116;
          }
          var5 = new CipherPacketBuffer(4096);
          var3 = new IntrusiveDequeCursor(param1.shots);
          if (param1.rules instanceof EightBallRules) {
            var5.writeByte(0, false);
          } else {
            if (!(param1.rules instanceof NineBallRules)) {
              if (param1.rules instanceof KillerRules) {
                var5.writeByte(2, false);
              } else {
                if (!(param1.rules instanceof FreePlayRules)) {
                  if (param1.rules instanceof TimeTrialRules) {
                    var5.writeByte(4, false);
                  } else {
                    var5.writeByte(-1, false);
                  }
                } else {
                  var5.writeByte(3, false);
                }
              }
            } else {
              var5.writeByte(1, false);
            }
          }
          var4 = (ShotRecord) (var3.last((byte) -92));
          while (var4 != null) {
            var5.writeInt(true, var4.shotNumber);
            var5.writeByte(var4.playerIndex, false);
            var5.writeShort((byte) -81, var4.breakSeed);
            var5.writeInt(true, var4.cueBallX);
            var5.writeInt(true, var4.cueBallY);
            var5.writeShort((byte) -81, (int) var4.aimAngle);
            var5.writeShort((byte) -81, (int) var4.elevation);
            var5.writeShort((byte) -81, (int) var4.power);
            var5.writeByte((int) var4.field_D, false);
            var5.writeByte((int) var4.field_H, false);
            var5.writeByte(var4.phase, false);
            if (var4.phase >= 2) {
              var4.writeEndResolution(var5, (byte) -122);
              var5.writeLong(var4.field_x, (byte) -122);
            }
            if (var4.phase >= 3) {
              var4.writeChoices(var5, (byte) 0);
            }
            var4 = (ShotRecord) (var3.previous(-126));
          }
          var5.writeInt(true, -1);
          System.out.println("pool2:" + SectorCacheStore.toHexString(false, var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("li.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        escCancelprivatemessage = "ESC - cancel private message";
        field_d = 0;
        field_h = new int[8192];
    }
}
