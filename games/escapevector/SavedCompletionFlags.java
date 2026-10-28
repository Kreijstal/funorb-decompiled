/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class SavedCompletionFlags {
    private int simulatorLevelCount;
    static String[] field_i;
    private BitSet retributionCompleted;
    static String field_c;
    static Sprite[] field_f;
    static String[] field_d;
    private boolean loaded;
    private SavedDataQuery query;
    private BitSet simulatorCompleted;
    static PcmSample field_g;
    private int retributionLevelCount;

    final boolean isSimulatorCompleted(int guard, int levelIndex) {
        if (guard != 1) {
          this.simulatorCompleted = (BitSet) null;
        }
        return this.hasCompletion(levelIndex, this.simulatorLevelCount, -32, this.simulatorCompleted);
    }

    private final BitSet mergeCompletionBits(int guard, BitSet retained, int bitCount, BitSet incoming) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        try {
          if (guard != 0) {
            this.recordCompletion(44, 44, true);
          }
          BitSet var5 = retained;
          if (retained != null &&
            incoming != null) {
            var5.or(incoming);
          }
          if (retained == null &&
            incoming != null) {
            var5 = incoming;
          }
          if (retained == null &&
            incoming == null) {
            var5 = new BitSet(bitCount);
          }
          BitSet stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("vd.S(").append(guard).append(',');
          if (retained == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(bitCount).append(',');
          if (incoming == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void enqueueSave(byte guard) {
        if (guard > -33) {
          field_d = (String[]) null;
        }
        byte[] var4 = this.encodeSavedData(false);
        byte[] var2 = var4;
        if (var4 == null) {
          return;
        }
        SavedDataWrite var3 = new SavedDataWrite(var4);
        MouseWheelInput.enqueueSavedDataWrite(1, 6, var3);
    }

    public static void releaseStatics(byte guard) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_i = null;
        if (guard < 5) {
          field_d = (String[]) null;
        }
    }

    private final BitSet readCompletionSection(DataInputStream input, int guard, BitSet retained, int bitCount) throws IOException {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        try {
          if (guard != 3) {
            BitSet stackIn_2_0 = (BitSet) null;
            return stackIn_2_0;
          }
          int var5_int = input.readUnsignedByte();
          int var6 = 8 * var5_int;
          if (bitCount < var6) {
            BitSet stackIn_6_0 = (BitSet) (retained);
            return stackIn_6_0;
          }
          BitSet var7 = this.readBitsetBytes(bitCount, input, var5_int, 0);
          BitSet var8 = this.mergeCompletionBits(0, retained, bitCount, var7);
          BitSet stackIn_8_0 = var8;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("vd.O(");
          if (input == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(',');
          if (retained == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(bitCount).append(')').toString());
        }
    }

    final static Sprite[] createFrameSprites(int accentColor, int topLeftColor, int bottomRightColor, int backgroundColor, int guard) {
        if (guard != 1317) {
          return (Sprite[]) null;
        }
        return AudioService.a(1, accentColor, 1, 1, topLeftColor, (byte) 33, bottomRightColor, backgroundColor, 3);
    }

    private final BitSet readBitsetBytes(int bitCount, DataInputStream input, int byteCount, int startByte) throws IOException {
        String stackIn_9_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          BitSet var5 = new BitSet(bitCount);
          for (int var6 = startByte; var6 < byteCount; var6++) {
            int var7 = input.readByte();
            int var8 = var6 * 8;
            var5 = this.unpackBitsetByte((byte) var7, startByte ^ -98, var5, bitCount, var8);
          }
          BitSet stackIn_5_0 = var5;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vd.G(").append(bitCount).append(',');
          if (input == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(byteCount).append(',').append(startByte).append(')').toString());
        }
    }

    private final void initializeRetributionFlags(byte guard) {
        if (guard != -106) {
          return;
        }
        this.retributionLevelCount = pc.levelNameCount(2513, 2);
        this.retributionCompleted = new BitSet(this.retributionLevelCount);
    }

    final void recordCompletion(int writeGroup, int levelIndex, boolean guard) {
        if (writeGroup == 1) {
          this.setCompletionBit(-1, levelIndex, this.simulatorCompleted, this.simulatorLevelCount);
        }
        if (!guard) {
          this.loaded = false;
        }
        if (writeGroup == 0) {
          this.setCompletionBit(-1, levelIndex, this.retributionCompleted, this.retributionLevelCount);
        }
    }

    private final boolean hasCompletion(int levelIndex, int bitCount, int guard, BitSet completed) {
        String stackIn_23_2 = null;
        try {
          if (!this.loaded) {
            return false;
          }
          if (completed == null) {
            return false;
          }
          if (guard >= -22) {
            return true;
          }
          if (0 > levelIndex) {
            return false;
          }
          if (bitCount <= levelIndex) {
            return false;
          }
          if (levelIndex < completed.size()) {
            boolean stackIn_19_0 = completed.get(levelIndex);
            return stackIn_19_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vd.A(").append(levelIndex).append(',').append(bitCount).append(',').append(guard).append(',');
          if (completed == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final byte packBitsetByte(boolean guard, int firstBit, int unusedLimit, BitSet completed) {
        String stackIn_17_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var5_int = completed.size();
          int var6 = 0;
          int var7 = 0;
          if (!guard) {
            this.retributionLevelCount = 35;
          }
          while (8 > var7) {
            int var8 = firstBit + var7;
            if (var5_int <= var8) {
              byte stackIn_7_0 = (byte)var6;
              return stackIn_7_0;
            }
            if (completed.get(var8)) {
              int var10 = 1 << var7;
              var6 = var6 | var10;
            }
            var7++;
          }
          byte stackIn_13_0 = (byte)var6;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("vd.W(").append(guard).append(',').append(firstBit).append(',').append(unusedLimit).append(',');
          if (completed == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void decodeLoginFlagReset(byte guard) {
        int var1 = -124 % ((guard + 86) / 37);
        RasterRestoreSupport.field_a = false;
        QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
    }

    private final BitSet unpackBitsetByte(byte value, int guard, BitSet completed, int bitCount, int firstBit) {
        String stackIn_20_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (completed == null) {
            completed = new BitSet(bitCount);
          }
          int var6_int = value;
          if (guard > -14) {
            BitSet stackIn_5_0 = (BitSet) null;
            return stackIn_5_0;
          }
          for (int var7 = 0; var7 < 8; var7++) {
            int var8 = 1 << var7;
            boolean stackIn_11_0 = !((var6_int & var8) == 0);
            boolean var9 = stackIn_11_0;
            int var10 = firstBit + var7;
            if (!var9) {
              completed.clear(var10);
            } else {
              completed.set(var10);
            }
          }
          BitSet stackIn_16_0 = (BitSet) (completed);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var6;
          StringBuilder stackIn_19_1 = new StringBuilder().append("vd.J(").append(value).append(',').append(guard).append(',');
          if (completed == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(bitCount).append(',').append(firstBit).append(')').toString());
        }
    }

    private final byte[] encodeCompletionSection(int guard, int bitCount, BitSet completed) {
        String stackIn_23_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (completed == null) {
            Object stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          int var4_int = this.highestSetBit(-106, completed);
          if (guard <= 21) {
            this.simulatorCompleted = (BitSet) null;
          }
          if (var4_int >= bitCount) {
            return null;
          }
          int var5 = 1 + var4_int;
          if (var5 < 0) {
            return null;
          }
          int var6 = this.byteCountForBits(-1, var5);
          byte[] var7 = new byte[var6 + 1];
          var7[0] = (byte)var6;
          if (var6 <= 0) {
            byte[] stackIn_14_0 = var7;
            return stackIn_14_0;
          }
          for (int var8 = 0; var6 > var8; var8++) {
            int var9 = 8 * var8;
            int var10 = this.packBitsetByte(true, var9, bitCount, completed);
            var7[var8 + 1] = (byte)var10;
          }
          byte[] stackIn_19_0 = var7;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var4;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vd.V(").append(guard).append(',').append(bitCount).append(',');
          if (completed == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final byte[] encodeSavedData(boolean guard) {
        byte[] var4 = this.encodeCompletionSection(49, this.retributionLevelCount, this.retributionCompleted);
        byte[] var2 = var4;
        if (var4 == null) {
          return this.combineSavedDataSections(1, (byte[]) null, (byte[]) null);
        }
        byte[] var3 = this.encodeCompletionSection(64, this.simulatorLevelCount, this.simulatorCompleted);
        if (var3 == null) {
          return this.combineSavedDataSections(1, (byte[]) null, (byte[]) null);
        }
        if (guard) {
          return (byte[]) null;
        }
        return this.combineSavedDataSections(1, var4, var3);
    }

    private final void setCompletionBit(int guard, int levelIndex, BitSet completed, int bitCount) {
        if (!this.loaded) {
          return;
        }
        if (guard < ~levelIndex) {
          return;
        }
        if (levelIndex >= bitCount) {
          return;
        }
        if (completed == null) {
          return;
        }
        try {
          completed.set(levelIndex);
          this.enqueueSave((byte) -61);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "vd.M(" + guard + ',' + levelIndex + ',' + (completed != null ? "{...}" : "null") + ',' + bitCount + ')');
        }
    }

    final boolean isLoaded(byte guard) {
        if (guard != -83) {
          this.loaded = true;
        }
        return this.loaded;
    }

    private final int highestSetBit(int guard, BitSet completed) {
        String stackIn_22_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (completed == null) {
            int stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (guard > -22) {
            this.retributionLevelCount = -38;
          }
          int var3_int = completed.size();
          if (var3_int <= 0) {
            int stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          for (int var4 = -1 + var3_int; var4 >= 0; var4--) {
            boolean var5 = (completed.get(var4));
            if (var5) {
              int stackIn_15_0 = var4;
              return stackIn_15_0;
            }
          }
          int stackIn_18_0 = -1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3;
          StringBuilder stackIn_21_1 = new StringBuilder().append("vd.P(").append(guard).append(',');
          if (completed == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void pollLoad(int guard) {
        try {
          if (this.loaded) {
            return;
          }
          int var2 = -98 % ((-61 - guard) / 62);
          if (!UiContainer.hasMembership((byte) 112)) {
            this.loaded = true;
            return;
          }
          if (this.query == null) {
            this.query = SavedDataQuerySupport.requestSavedData(6, 86);
          }
          this.loaded = this.query.complete;
          if (this.loaded) {
            try {
              this.decodeSavedData(-16331, this.query.payload);
            } catch (IOException iOException) {
              System.out.println("Error reading game data");
            }
            this.query = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void decodeSavedData(int guard, byte[] payload) throws IOException {
        if (payload == null) {
          return;
        }
        DataInputStream var3 = new DataInputStream((InputStream) ((Object) new ByteArrayInputStream(payload)));
        if (guard != -16331) {
          field_g = (PcmSample) null;
        }
        int var4 = var3.readUnsignedByte();
        if (var4 != 1) {
          return;
        }
        try {
          this.retributionCompleted = this.readCompletionSection(var3, guard ^ -16330, this.retributionCompleted, this.retributionLevelCount);
          this.simulatorCompleted = this.readCompletionSection(var3, 3, this.simulatorCompleted, this.simulatorLevelCount);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "vd.Q(" + guard + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    private final void initializeSimulatorFlags(int guard) {
        if (guard < 103) {
          this.simulatorLevelCount = -109;
        }
        this.simulatorLevelCount = pc.levelNameCount(2513, 3);
        this.simulatorCompleted = new BitSet(this.simulatorLevelCount);
    }

    private final byte[] combineSavedDataSections(int headerBytes, byte[] retribution, byte[] simulator) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          int var4_int = headerBytes;
          if (retribution != null) {
            var4_int = var4_int + retribution.length;
          }
          if (simulator != null) {
            var4_int = var4_int + simulator.length;
          }
          byte[] var5 = new byte[var4_int];
          int var6 = 0;
          int incrementValue$1 = var6;
          var6++;
          var5[incrementValue$1] = (byte) 1;
          if (retribution != null) {
            ArraySupport.copy(retribution, 0, var5, var6, retribution.length);
            var6 = var6 + retribution.length;
          }
          if (simulator != null) {
            ArraySupport.copy(simulator, 0, var5, var6, simulator.length);
            var6 = var6 + simulator.length;
          }
          byte[] stackIn_12_0 = var5;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("vd.U(").append(headerBytes).append(',');
          if (retribution == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (simulator == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean isRetributionCompleted(int levelIndex, byte guard) {
        int var3 = 55 / ((-51 - guard) / 61);
        return this.hasCompletion(levelIndex, this.retributionLevelCount, -107, this.retributionCompleted);
    }

    SavedCompletionFlags() {
        this.initializeRetributionFlags((byte) -106);
        this.initializeSimulatorFlags(127);
        this.loaded = false;
    }

    private final int byteCountForBits(int guard, int bitCount) {
        if (~bitCount >= guard) {
          return 0;
        }
        int var3 = bitCount / 8;
        if (0 != bitCount % 8) {
          var3++;
        }
        return var3;
    }

    static {
        field_d = new String[]{"Fuel Storage Unit 531", "Outlying Fuel Depot", "Fuel Production Caverns", "Cannister Elimination Run", "Mine Shafts", "Fortified Mine", "Mine Field", "Auto Destruct", "Drive Research Facility", "Engine Research Station", "Cold Fusion Laboratory", "High-security Research Cavern", "Growth Pod Caverns", "Mined Cloning Facility", "Genetic Research Laboratory", "Secluded Cloning Pods"};
        field_c = "Lives: ";
        field_i = new String[]{"The President sends his highest regards. Given your success so far we have one final mission for you. Your ultimate battle lies ahead, with the ultimate prize for the victor.", "The aliens have perfected cloning technology and are busy growing an unstoppable army of genetically enhanced soldiers. Destroy their growth pods before they can breed their army."};
    }
}
