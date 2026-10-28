/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qf extends eo {
    private int field_i;
    private long field_e;
    private long[] field_f;
    private int field_k;
    private long field_g;
    private long field_c;
    static java.util.zip.CRC32 field_m;
    static String field_h;
    static int field_l;
    static String field_o;
    static String field_n;
    static Sprite field_d;
    static int field_j;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, SystemTaskService param5, int param6, boolean param7, byte param8, int param9, long param10, String param11, int param12, int param13) {
        try {
          String stackIn_16_2 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            QuickChatDynamicCommand.incomingPackets = new CipherPacketBuffer(param1);
            QuickChatDynamicCommand.outgoingPackets = new CipherPacketBuffer(param0);
            if (param8 != 84) {
              qf.releaseStatics(-106);
            }
            MouseWheelInput.field_c = param5;
            jc.field_b = param7;
            IntrusiveDeque.field_h = param11;
            sj.field_i = param13;
            StripedProgressBar.field_L = param6;
            ej.field_d = param3;
            ThreeSliceButtonPainter.field_q = param10;
            ej.field_b = param9;
            DropTargetWidget.field_D = param4;
            ac.field_b = param12;
            rd.field_a = param2;
            if (MouseWheelInput.field_c.field_j == null) {
              return;
            }
            try {
              SavedDataWrite.field_h = new BufferedRandomAccessFile(MouseWheelInput.field_c.field_j, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_15_0 = var15_ref;
            StringBuilder stackIn_15_1 = new StringBuilder().append("qf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_n = null;
        field_m = null;
        field_o = null;
        if (guard > 89) {
          field_h = null;
          return;
        }
        field_h = (String) null;
        field_h = null;
    }

    final void a(int param0) {
        if (param0 == 237) {
          this.field_e = 0L;
          if (this.field_c < this.field_g) {
            this.field_c = this.field_c + (-this.field_c + this.field_g);
          }
          return;
        }
    }

    private final long c(int param0) {
        int var9 = EscapeVector.obfuscationControl;
        long var2 = System.nanoTime();
        long var4 = -this.field_e + var2;
        this.field_e = var2;
        if (-5000000000L >= var4) {
          long var6 = 0L;
          for (int var8 = param0; this.field_k >= var8; var8++) {
            var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
          }
          return var6 / (long)this.field_k;
        }
        if (5000000000L <= var4) {
          long var6Lifetime1 = 0L;
          for (int var8Lifetime1 = param0; this.field_k >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_f[(this.field_i - var8Lifetime1 + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_k;
        }
        this.field_f[this.field_i] = var4;
        if (this.field_k >= 1) {
          this.field_i = (1 + this.field_i) % 10;
          long var6Lifetime2 = 0L;
          for (int var8Lifetime2 = param0; this.field_k >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_f[(this.field_i - var8Lifetime2 + 10) % 10];
          }
          return var6Lifetime2 / (long)this.field_k;
        }
        this.field_k = this.field_k + 1;
        this.field_i = (1 + this.field_i) % 10;
        long var6Lifetime3 = 0L;
        for (int var8Lifetime3 = param0; this.field_k >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_f[(this.field_i - var8Lifetime3 + 10) % 10];
        }
        return var6Lifetime3 / (long)this.field_k;
    }

    final long c(byte param0) {
        if (param0 <= 70) {
          return -6L;
        }
        this.field_c = this.field_c + this.c(1);
        if (this.field_g > this.field_c) {
          return (-this.field_c + this.field_g) / 1000000L;
        }
        return 0L;
    }

    final int a(byte param0, long param1) {
        int var6 = EscapeVector.obfuscationControl;
        int var4 = 21 % ((param0 + 29) / 51);
        if (this.field_c < this.field_g) {
          this.field_e = this.field_e + (-this.field_c + this.field_g);
          this.field_c = this.field_c + (this.field_g - this.field_c);
          this.field_g = this.field_g + param1;
          return 1;
        }
        int var5 = 0;
        do {
          this.field_g = this.field_g + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_g < this.field_c);
        if (this.field_c > this.field_g) {
          this.field_g = this.field_c;
        }
        return var5;
    }

    qf() {
        this.field_i = 0;
        this.field_k = 1;
        this.field_g = 0L;
        this.field_e = 0L;
        this.field_f = new long[10];
        this.field_c = 0L;
        this.field_c = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_m = new java.util.zip.CRC32();
        field_h = "Loading fonts";
        field_o = "Mode";
        field_n = "Unpacking sound effects";
        field_l = 250;
        field_j = 0;
    }
}
