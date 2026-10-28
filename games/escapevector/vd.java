/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class vd {
    private int field_h;
    static String[] field_i;
    private BitSet field_b;
    static String field_c;
    static Sprite[] field_f;
    static String[] field_d;
    private boolean field_k;
    private SavedDataQuery field_a;
    private BitSet field_e;
    static PcmSample field_g;
    private int field_j;

    final boolean a(int param0, int param1) {
        if (param0 != 1) {
          this.field_e = (BitSet) null;
        }
        return this.a(param1, this.field_h, -32, this.field_e);
    }

    private final BitSet a(int param0, BitSet param1, int param2, BitSet param3) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        try {
          if (param0 != 0) {
            this.a(44, 44, true);
          }
          BitSet var5 = param1;
          if (param1 != null &&
            param3 != null) {
            var5.or(param3);
          }
          if (param1 == null &&
            param3 != null) {
            var5 = param3;
          }
          if (param1 == null &&
            param3 == null) {
            var5 = new BitSet(param2);
          }
          BitSet stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("vd.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        if (param0 > -33) {
          field_d = (String[]) null;
        }
        byte[] var4 = this.a(false);
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

    private final BitSet a(DataInputStream param0, int param1, BitSet param2, int param3) throws IOException {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        try {
          if (param1 != 3) {
            BitSet stackIn_2_0 = (BitSet) null;
            return stackIn_2_0;
          }
          int var5_int = param0.readUnsignedByte();
          int var6 = 8 * var5_int;
          if (param3 < var6) {
            BitSet stackIn_6_0 = (BitSet) (param2);
            return stackIn_6_0;
          }
          BitSet var7 = this.a(param3, param0, var5_int, 0);
          BitSet var8 = this.a(0, param2, param3, var7);
          BitSet stackIn_8_0 = var8;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("vd.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1317) {
          return (Sprite[]) null;
        }
        return AudioService.a(1, param0, 1, 1, param1, (byte) 33, param2, param3, 3);
    }

    private final BitSet a(int param0, DataInputStream param1, int param2, int param3) throws IOException {
        String stackIn_9_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          BitSet var5 = new BitSet(param0);
          for (int var6 = param3; var6 < param2; var6++) {
            int var7 = param1.readByte();
            int var8 = var6 * 8;
            var5 = this.a((byte) var7, param3 ^ -98, var5, param0, var8);
          }
          BitSet stackIn_5_0 = var5;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0) {
        if (param0 != -106) {
          return;
        }
        this.field_j = pc.a(2513, 2);
        this.field_b = new BitSet(this.field_j);
    }

    final void a(int param0, int param1, boolean param2) {
        if (param0 == 1) {
          this.a(-1, param1, this.field_e, this.field_h);
        }
        if (!param2) {
          this.field_k = false;
        }
        if (param0 == 0) {
          this.a(-1, param1, this.field_b, this.field_j);
        }
    }

    private final boolean a(int param0, int param1, int param2, BitSet param3) {
        String stackIn_23_2 = null;
        try {
          if (!this.field_k) {
            return false;
          }
          if (param3 == null) {
            return false;
          }
          if (param2 >= -22) {
            return true;
          }
          if (0 > param0) {
            return false;
          }
          if (param1 <= param0) {
            return false;
          }
          if (param0 < param3.size()) {
            boolean stackIn_19_0 = param3.get(param0);
            return stackIn_19_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final byte a(boolean param0, int param1, int param2, BitSet param3) {
        String stackIn_17_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var5_int = param3.size();
          int var6 = 0;
          int var7 = 0;
          if (!param0) {
            this.field_j = 35;
          }
          while (8 > var7) {
            int var8 = param1 + var7;
            if (var5_int <= var8) {
              byte stackIn_7_0 = (byte)var6;
              return stackIn_7_0;
            }
            if (param3.get(var8)) {
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
          StringBuilder stackIn_16_1 = new StringBuilder().append("vd.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = -124 % ((param0 + 86) / 37);
        RasterRestoreSupport.field_a = false;
        QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
    }

    private final BitSet a(byte param0, int param1, BitSet param2, int param3, int param4) {
        String stackIn_20_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param2 == null) {
            param2 = new BitSet(param3);
          }
          int var6_int = param0;
          if (param1 > -14) {
            BitSet stackIn_5_0 = (BitSet) null;
            return stackIn_5_0;
          }
          for (int var7 = 0; var7 < 8; var7++) {
            int var8 = 1 << var7;
            boolean stackIn_11_0 = !((var6_int & var8) == 0);
            boolean var9 = stackIn_11_0;
            int var10 = param4 + var7;
            if (!var9) {
              param2.clear(var10);
            } else {
              param2.set(var10);
            }
          }
          BitSet stackIn_16_0 = (BitSet) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var6;
          StringBuilder stackIn_19_1 = new StringBuilder().append("vd.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final byte[] a(int param0, int param1, BitSet param2) {
        String stackIn_23_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param2 == null) {
            Object stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          int var4_int = this.a(-106, param2);
          if (param0 <= 21) {
            this.field_e = (BitSet) null;
          }
          if (var4_int >= param1) {
            return null;
          }
          int var5 = 1 + var4_int;
          if (var5 < 0) {
            return null;
          }
          int var6 = this.b(-1, var5);
          byte[] var7 = new byte[var6 + 1];
          var7[0] = (byte)var6;
          if (var6 <= 0) {
            byte[] stackIn_14_0 = var7;
            return stackIn_14_0;
          }
          for (int var8 = 0; var6 > var8; var8++) {
            int var9 = 8 * var8;
            int var10 = this.a(true, var9, param1, param2);
            var7[var8 + 1] = (byte)var10;
          }
          byte[] stackIn_19_0 = var7;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var4;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vd.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final byte[] a(boolean param0) {
        byte[] var4 = this.a(49, this.field_j, this.field_b);
        byte[] var2 = var4;
        if (var4 == null) {
          return this.a(1, (byte[]) null, (byte[]) null);
        }
        byte[] var3 = this.a(64, this.field_h, this.field_e);
        if (var3 == null) {
          return this.a(1, (byte[]) null, (byte[]) null);
        }
        if (param0) {
          return (byte[]) null;
        }
        return this.a(1, var4, var3);
    }

    private final void a(int param0, int param1, BitSet param2, int param3) {
        if (!this.field_k) {
          return;
        }
        if (param0 < ~param1) {
          return;
        }
        if (param1 >= param3) {
          return;
        }
        if (param2 == null) {
          return;
        }
        try {
          param2.set(param1);
          this.e((byte) -61);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vd.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 != -83) {
          this.field_k = true;
        }
        return this.field_k;
    }

    private final int a(int param0, BitSet param1) {
        String stackIn_22_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param1 == null) {
            int stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (param0 > -22) {
            this.field_j = -38;
          }
          int var3_int = param1.size();
          if (var3_int <= 0) {
            int stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          for (int var4 = -1 + var3_int; var4 >= 0; var4--) {
            boolean var5 = (param1.get(var4));
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
          StringBuilder stackIn_21_1 = new StringBuilder().append("vd.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          if (this.field_k) {
            return;
          }
          int var2 = -98 % ((-61 - param0) / 62);
          if (!UiContainer.e((byte) 112)) {
            this.field_k = true;
            return;
          }
          if (this.field_a == null) {
            this.field_a = SavedDataQuerySupport.requestSavedData(6, 86);
          }
          this.field_k = this.field_a.complete;
          if (this.field_k) {
            try {
              this.a(-16331, this.field_a.payload);
            } catch (IOException iOException) {
              System.out.println("Error reading game data");
            }
            this.field_a = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) throws IOException {
        if (param1 == null) {
          return;
        }
        DataInputStream var3 = new DataInputStream((InputStream) ((Object) new ByteArrayInputStream(param1)));
        if (param0 != -16331) {
          field_g = (PcmSample) null;
        }
        int var4 = var3.readUnsignedByte();
        if (var4 != 1) {
          return;
        }
        try {
          this.field_b = this.a(var3, param0 ^ -16330, this.field_b, this.field_j);
          this.field_e = this.a(var3, 3, this.field_e, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vd.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        if (param0 < 103) {
          this.field_h = -109;
        }
        this.field_h = pc.a(2513, 3);
        this.field_e = new BitSet(this.field_h);
    }

    private final byte[] a(int param0, byte[] param1, byte[] param2) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          int var4_int = param0;
          if (param1 != null) {
            var4_int = var4_int + param1.length;
          }
          if (param2 != null) {
            var4_int = var4_int + param2.length;
          }
          byte[] var5 = new byte[var4_int];
          int var6 = 0;
          int incrementValue$1 = var6;
          var6++;
          var5[incrementValue$1] = (byte) 1;
          if (param1 != null) {
            ArraySupport.copy(param1, 0, var5, var6, param1.length);
            var6 = var6 + param1.length;
          }
          if (param2 != null) {
            ArraySupport.copy(param2, 0, var5, var6, param2.length);
            var6 = var6 + param2.length;
          }
          byte[] stackIn_12_0 = var5;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("vd.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1) {
        int var3 = 55 / ((-51 - param1) / 61);
        return this.a(param0, this.field_j, -107, this.field_b);
    }

    vd() {
        this.b((byte) -106);
        this.a(127);
        this.field_k = false;
    }

    private final int b(int param0, int param1) {
        if (~param1 >= param0) {
          return 0;
        }
        int var3 = param1 / 8;
        if (0 != param1 % 8) {
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
