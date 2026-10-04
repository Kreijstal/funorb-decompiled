/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NanoFrameTimer extends FrameTimer {
    private long field_e;
    static String checkingText;
    private long field_i;
    private int field_g;
    private long[] field_f;
    private int field_d;
    static int[] decodedSpritePalette;
    private long field_c;

    final static void handleRankingResponse(int methodGuard) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int var19 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        HighscoreQuery var4 = null;
        ScoreSubmission var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        PacketBuffer var27 = null;
        long[][] var31 = null;
        var26 = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -24839) {
            NanoFrameTimer.a(false);
          }
          var27 = LogoCompositor.sessionPacketBuffer;
          var2 = var27.readUnsignedByte((byte) 34);
          if (var2 == 0) {
            var3 = var27.readUnsignedShortBE(true);
            var4 = (HighscoreQuery) ((Object) ResourceArchive.field_d.firstForIteration(0));
            while (var4 != null) {
              if (var4.queryId != var3) {
                var4 = (HighscoreQuery) ((Object) ResourceArchive.field_d.nextForIteration(1));
                continue;
              }
              break;
            }
            if (var4 == null) {
              Bzip2DecoderState.closeSessionSocket((byte) -115);
              return;
            }
            var5 = var27.readUnsignedByte((byte) 34);
            if (var5 != 0) {
              var6 = var4.entryLimit;
              var7 = var4.valuesPerEntry;
              RasterTargetRestoreSupport.highscoreNameTable[0].usedInUniqueView = false;
              RasterTargetRestoreSupport.highscoreNameTable[0].primaryName = SecondaryDeque.receivedSessionName;
              RasterTargetRestoreSupport.highscoreNameTable[0].alternateName = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                RasterTargetRestoreSupport.highscoreNameTable[var8_int].primaryName = var27.readNullTerminatedText((byte) 104);
                RasterTargetRestoreSupport.highscoreNameTable[var8_int].usedInUniqueView = false;
                if (var27.readUnsignedByte((byte) 34) == 1) {
                  RasterTargetRestoreSupport.highscoreNameTable[var8_int].alternateName = var27.readNullTerminatedText((byte) 122);
                } else {
                  RasterTargetRestoreSupport.highscoreNameTable[var8_int].alternateName = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.namesByView = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              var31 = new long[3][var6];
              dupTemp$1 = new int[3][var6 * var7];
              var4.valuesByView = dupTemp$1;
              var11 = dupTemp$1;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.readUnsignedByte((byte) 34);
              if (!(0 >= var18)) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.readUnsignedByte((byte) 34);
                  var21 = RasterTargetRestoreSupport.highscoreNameTable[var20].primaryName;
                  var22 = var27.readLongBE(2901);
                  var24 = var27.position;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = RasterTargetRestoreSupport.highscoreNameTable[var20].alternateName;
                    var31[0][var12] = var22;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$2 = var15;
                      var15++;
                      var11[0][incrementValue$2] = var27.readIntBE((byte) -76);
                    }
                    var12++;
                  }
                  if ((var21 != null) &&
                      (WhirlpoolHash.a(var21, (byte) 12))) {
                    var8[1][var13] = SecondaryDeque.receivedSessionName;
                    var9[1][var13] = null;
                    var31[1][var13] = var22;
                    var13++;
                    var27.position = var24;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var16;
                      var16++;
                      var11[1][incrementValue$3] = var27.readIntBE((byte) -122);
                    }
                  }
                  if ((var14 < var6) &&
                      (!RasterTargetRestoreSupport.highscoreNameTable[var20].usedInUniqueView)) {
                    RasterTargetRestoreSupport.highscoreNameTable[var20].usedInUniqueView = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = RasterTargetRestoreSupport.highscoreNameTable[var20].alternateName;
                    var31[2][var14] = var22;
                    var14++;
                    var27.position = var24;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$4 = var17;
                      var17++;
                      var11[2][incrementValue$4] = var27.readIntBE((byte) -101);
                    }
                  }
                }
              }
            }
            var4.completed = true;
            var4.unlinkNode(false);
            return;
          }
          if (1 == var2) {
            var3 = var27.readUnsignedShortBE(true);
            var27.readLongBE(methodGuard + 27740);
            var4_ref = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.firstForIteration(0));
            while (var4_ref != null) {
              if (var3 != var4_ref.submissionId) {
                var4_ref = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.nextForIteration(1));
                continue;
              }
              break;
            }
            if (var4_ref != null) {
              var4_ref.unlinkNode(false);
              return;
            }
            Bzip2DecoderState.closeSessionSocket((byte) -117);
            return;
          }
          IterableNodeHashTable.reportClientError((Throwable) null, "HS1: " + TextTemplateDefinition.e(methodGuard + 24894), (byte) 125);
          Bzip2DecoderState.closeSessionSocket((byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "cm.F(" + methodGuard + ')');
        }
    }

    public static void a(boolean param0) {
        decodedSpritePalette = null;
        if (param0) {
            NanoFrameTimer.a(false);
        }
        checkingText = null;
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            if (null != SpriteCheckboxRenderer.sessionSocket) {
              if (!((param1 >= 0) &&
                  (PacketBuffer.currentProtocolStage != LogoCompositor.connectedSessionStage))) {
                if ((0 == CacheReference.outgoingSessionBuffer.position) &&
                    (~ClientClockSupport.correctedCurrentTimeMillis(-12520) < ~(10000L + CanvasResizeController.lastSessionSocketWriteMillis))) {
                  CacheReference.outgoingSessionBuffer.writeCipherByte(param1, (byte) -76);
                }
                if (param0 > ~CacheReference.outgoingSessionBuffer.position) {
                  try {
                    SpriteCheckboxRenderer.sessionSocket.enqueueWrite(100, 0, CacheReference.outgoingSessionBuffer.position, CacheReference.outgoingSessionBuffer.bytes);
                    CanvasResizeController.lastSessionSocketWriteMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    iOException = (IOException) (Object) decompiledCaughtException;
                    Bzip2DecoderState.closeSessionSocket((byte) -117);
                  }
                  CacheReference.outgoingSessionBuffer.position = 0;
                }
                return;
              }
            }
            CacheReference.outgoingSessionBuffer.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (~this.field_e > ~this.field_c) {
            this.field_e = this.field_e + (this.field_c - this.field_e);
        }
        if (param0 < 60) {
            return;
        }
        this.field_i = 0L;
    }

    final int a(boolean param0, long param1) {
        int var4;
        int var5;
        var5 = Geoblox.clientControlFlowFlag;
        if (!param0) {
          NanoFrameTimer.a(true);
        }
        if (this.field_c > this.field_e) {
          this.field_i = this.field_i + (-this.field_e + this.field_c);
          this.field_e = this.field_e + (-this.field_e + this.field_c);
          this.field_c = this.field_c + param1;
          return 1;
        }
        var4 = 0;
        while (true) {
          var4++;
          this.field_c = this.field_c + param1;
          if ((var4 < 10) &&
              (~this.field_c > ~this.field_e)) {
            continue;
          }
          if (this.field_e > this.field_c) {
            this.field_c = this.field_e;
          }
          return var4;
        }
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = Geoblox.clientControlFlowFlag;
        long var2 = System.nanoTime();
        long var4 = -this.field_i + var2;
        this.field_i = var2;
        if ((-5000000000L < var4) &&
            (!(5000000000L <= var4))) {
            this.field_f[this.field_d] = var4;
            if (this.field_g < 1) {
                this.field_g = this.field_g + 1;
            }
            this.field_d = (this.field_d + 1) % 10;
        }
        long var6 = (long)param0;
        for (var8 = 1; var8 <= this.field_g; var8++) {
            var6 = var6 + this.field_f[(-var8 + (this.field_d + 10)) % 10];
        }
        return var6 / (long)this.field_g;
    }

    final long a(byte param0) {
        this.field_e = this.field_e + this.d(0);
        if (param0 != -49) {
            this.a(false, 97L);
        }
        if (~this.field_c < ~this.field_e) {
            return (this.field_c - this.field_e) / 1000000L;
        }
        return 0L;
    }

    NanoFrameTimer() {
        this.field_g = 1;
        this.field_f = new long[10];
        this.field_d = 0;
        this.field_i = 0L;
        this.field_e = 0L;
        this.field_c = 0L;
        this.field_e = System.nanoTime();
        this.field_c = System.nanoTime();
    }

    static {
        checkingText = "Checking";
    }
}
