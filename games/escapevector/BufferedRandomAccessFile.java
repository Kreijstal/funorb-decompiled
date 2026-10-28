/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedRandomAccessFile {
    private long field_f;
    private long field_d;
    static String field_c;
    private long field_i;
    private long field_k;
    private long field_a;
    private byte[] field_h;
    private long field_e;
    private byte[] field_g;
    private int field_l;
    private int field_j;
    private BoundedRandomAccessFile field_b;

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          try {
            if (this.field_e < (this.field_d + (long)param3)) {
              this.field_e = (long)param3 + this.field_d;
            }
            if (this.field_a != -1L) {
              if (!(this.field_a <= this.field_d)) {
                this.b(118);
              } else if (((long)this.field_l + this.field_a) < this.field_d) {
                this.b(118);
              }
            }
            if (this.field_a != -1L &&
              this.field_d + (long)param3 > this.field_a + (long)this.field_h.length) {
              int var5_int = (int)(this.field_a - this.field_d + (long)this.field_h.length);
              qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), var5_int);
              param1 = param1 + var5_int;
              this.field_d = this.field_d + (long)var5_int;
              param3 = param3 - var5_int;
              this.field_l = this.field_h.length;
              this.b(115);
            }
            if (this.field_h.length < param3) {
              if (~this.field_k != ~this.field_d) {
                this.field_b.a(this.field_d, 1);
                this.field_k = this.field_d;
              }
              this.field_b.a(param2, param3, param1, -15814);
              this.field_k = this.field_k + (long)param3;
              if (this.field_i < this.field_k) {
                this.field_i = this.field_k;
              }
              long var5_long = -1L;
              if (this.field_f <= this.field_d &&
                this.field_f + (long)this.field_j > this.field_d) {
                var5_long = this.field_d;
              } else if (this.field_f >= this.field_d &&
                this.field_f < ((long)param3 + this.field_d)) {
                var5_long = this.field_f;
              }
              long var7 = -1L;
              if ((this.field_d + (long)param3) > this.field_f &&
                ((long)this.field_j + this.field_f) >= (this.field_d + (long)param3)) {
                var7 = (long)param3 + this.field_d;
              } else if ((this.field_f + (long)this.field_j) > this.field_d &&
                ((long)this.field_j + this.field_f) <= ((long)param3 + this.field_d)) {
                var7 = this.field_f + (long)this.field_j;
              }
              if (var5_long > -1L &&
                var5_long < var7) {
                int var9 = (int)(var7 - var5_long);
                qg.a(param2, (int)(var5_long + (long)param1 - this.field_d), this.field_g, (int)(var5_long - this.field_f), var9);
              }
              this.field_d = this.field_d + (long)param3;
              return;
            }
            if (param3 > 0) {
              if (this.field_a == -1L) {
                this.field_a = this.field_d;
              }
              qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), param3);
              this.field_d = this.field_d + (long)param3;
              if (this.field_d - this.field_a > (long)this.field_l) {
                this.field_l = (int)(this.field_d - this.field_a);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
          if (!param0) {
            this.field_g = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_54_0 = var5_ref;
          StringBuilder stackIn_54_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -111) {
          field_c = (String) null;
        }
        this.b(125);
        this.field_b.a(0);
    }

    private final void b(int param0) throws IOException {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_a != -1L) {
          if (this.field_a != this.field_k) {
            this.field_b.a(this.field_a, 1);
            this.field_k = this.field_a;
          }
          this.field_b.a(this.field_h, this.field_l, 0, -15814);
          this.field_k = this.field_k + (long)this.field_l;
          if (this.field_i < this.field_k) {
            this.field_i = this.field_k;
          }
          long var2_long = -1L;
          if (this.field_a >= this.field_f &&
            this.field_f + (long)this.field_j > this.field_a) {
            var2_long = this.field_a;
          } else if (this.field_f >= this.field_a &&
            this.field_f < (this.field_a + (long)this.field_l)) {
            var2_long = this.field_f;
          }
          long var4 = -1L;
          if (((long)this.field_l + this.field_a) > this.field_f &&
            (long)this.field_j + this.field_f >= this.field_a + (long)this.field_l) {
            var4 = (long)this.field_l + this.field_a;
          } else if (this.field_a < (this.field_f + (long)this.field_j) &&
            (this.field_f + (long)this.field_j) <= (this.field_a + (long)this.field_l)) {
            var4 = this.field_f + (long)this.field_j;
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            int var6 = (int)(-var2_long + var4);
            qg.a(this.field_h, (int)(-this.field_a + var2_long), this.field_g, (int)(-this.field_f + var2_long), var6);
          }
          this.field_l = 0;
          this.field_a = -1L;
        }
        int var2 = 81 / ((56 - param0) / 50);
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
          return;
        }
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_d = param1;
    }

    final long a(int param0) {
        if (param0 != 16034) {
          BufferedRandomAccessFile.releaseStatics((byte) -75);
        }
        return this.field_e;
    }

    private final void a(boolean param0) throws IOException {
        int var4 = EscapeVector.obfuscationControl;
        this.field_j = 0;
        if (this.field_d != this.field_k) {
          this.field_b.a(this.field_d, 1);
          this.field_k = this.field_d;
        }
        this.field_f = this.field_d;
        if (!param0) {
          return;
        }
        while (this.field_g.length > this.field_j) {
          int var2 = this.field_g.length - this.field_j;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          int var3 = this.field_b.a(var2, (byte) 127, this.field_g, this.field_j);
          if (var3 == -1) {
            break;
          }
          this.field_j = this.field_j + var3;
          this.field_k = this.field_k + (long)var3;
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        int var1 = -78 / ((-11 - guard) / 41);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        int var14 = EscapeVector.obfuscationControl;
        try {
          try {
            if (param2 != 101) {
              return;
            }
            if (param0 + param1 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param1 + (param0 - param3.length));
            }
            if (this.field_a != -1L &&
              this.field_d >= this.field_a &&
              (long)this.field_l + this.field_a >= (long)param1 + this.field_d) {
              qg.a(this.field_h, (int)(-this.field_a + this.field_d), param3, param0, param1);
              this.field_d = this.field_d + (long)param1;
              return;
            }
            long var5_long = this.field_d;
            int var7 = param0;
            int var8 = param1;
            if (this.field_f <= this.field_d &&
              this.field_d < this.field_f + (long)this.field_j) {
              int var9_int = (int)(-this.field_d + this.field_f + (long)this.field_j);
              if (param1 < var9_int) {
                var9_int = param1;
              }
              qg.a(this.field_g, (int)(this.field_d - this.field_f), param3, param0, var9_int);
              param0 = param0 + var9_int;
              param1 = param1 - var9_int;
              this.field_d = this.field_d + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_g.length) {
              this.field_b.a(this.field_d, 1);
              this.field_k = this.field_d;
              while (param1 > 0) {
                int var9_intLifetime1 = this.field_b.a(param1, (byte) 125, param3, param0);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param0 = param0 + var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0 &&
              param1 > 0) {
              this.a(true);
              int var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_j) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              qg.a(this.field_g, 0, param3, param0, var9_intLifetime1Lifetime1);
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_a > this.field_d) {
                int stackIn_29_0 = 0;
                int stackIn_29_1 = param1;
                if (stackIn_29_0 < stackIn_29_1) {
                  int var9_intLifetime2 = param0 + (int)(this.field_a - this.field_d);
                  if (var9_intLifetime2 > param0 + param1) {
                    var9_intLifetime2 = param1 + param0;
                  }
                  while (param0 < var9_intLifetime2) {
                    int incrementValue$0 = param0;
                    param0++;
                    param3[incrementValue$0] = (byte) 0;
                    param1--;
                    this.field_d = this.field_d + 1L;
                  }
                }
              }
              long var9 = -1L;
              long var11 = -1L;
              if (var5_long <= this.field_a &&
                this.field_a < var5_long + (long)var8) {
                var9 = this.field_a;
              } else if (this.field_a <= var5_long &&
                var5_long < ((long)this.field_l + this.field_a)) {
                var9 = var5_long;
              }
              if (var5_long < ((long)this.field_l + this.field_a) &&
                this.field_a + (long)this.field_l <= var5_long + (long)var8) {
                var11 = (long)this.field_l + this.field_a;
              } else if (var5_long + (long)var8 > this.field_a &&
                (this.field_a + (long)this.field_l) >= ((long)var8 + var5_long)) {
                var11 = var5_long + (long)var8;
              }
              if (var9 > -1L &&
                var11 > var9) {
                int var13 = (int)(var11 - var9);
                qg.a(this.field_h, (int)(-this.field_a + var9), param3, var7 + (int)(var9 - var5_long), var13);
                if (this.field_d < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_d));
                  this.field_d = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
          if (param1 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_60_0 = var5_ref;
          StringBuilder stackIn_60_1 = new StringBuilder().append("rg.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final static short[] a(CipherPacketBuffer param0, int param1, short[] param2, int param3) {
        int var7 = 0;
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = param0.readBits(param1, 8);
          if (~var4_int == param3) {
            return null;
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new short[var4_int];
          }
          int var5 = param0.readBits(4, 8);
          int var6 = (short)param0.readBits(16, 8);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)(var6 + param0.readBits(var5, 8));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)var6;
            }
          }
          short[] stackIn_16_0 = (short[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var4;
          StringBuilder stackIn_19_1 = new StringBuilder().append("rg.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (ck.field_t != al.field_d) {
            return false;
          }
          var2_long = td.b(128);
          if (param1 < 101) {
            return true;
          }
          if (vj.field_a != 0 &&
            GameAppletShell.field_a < 0) {
            DelayedServerPacket var4_ref_dm = (DelayedServerPacket) (bb.field_L.first(false));
            if (var4_ref_dm != null &&
              var4_ref_dm.readyAtMillis < var2_long) {
              var4_ref_dm.unlink((byte) -67);
              EmailSyntaxValidator.field_r = var4_ref_dm.payload.length;
              QuickChatDynamicCommand.incomingPackets.position = 0;
              for (int var5_int = 0; var5_int < EmailSyntaxValidator.field_r; var5_int++) {
                QuickChatDynamicCommand.incomingPackets.payload[var5_int] = var4_ref_dm.payload[var5_int];
              }
              NetworkGameClient.field_q = ArchiveIndex.field_t;
              ArchiveIndex.field_t = jj.field_b;
              jj.field_b = cd.field_v;
              cd.field_v = var4_ref_dm.opcode;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
        int stackIn_22_0 = GameAppletShell.field_a;
        try {
          while (true) {
            if (stackIn_22_0 < 0) {
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (!bo.a(30000, 1)) {
                return false;
              }
              GameAppletShell.field_a = QuickChatDynamicCommand.incomingPackets.readCipheredOpcode(8);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              EmailSyntaxValidator.field_r = param0[GameAppletShell.field_a];
            }
            if (!ArchiveKeyRequest.hasCompletePacket(10550)) {
              return false;
            }
            if (vj.field_a == 0) {
              NetworkGameClient.field_q = ArchiveIndex.field_t;
              ArchiveIndex.field_t = jj.field_b;
              jj.field_b = cd.field_v;
              cd.field_v = GameAppletShell.field_a;
              GameAppletShell.field_a = -1;
              return true;
            }
            int var4 = vj.field_a;
            if (pd.field_a != 0.0) {
              var4 = (int)((double)var4 + gk.field_a.nextGaussian() * pd.field_a);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            DelayedServerPacket var5 = new DelayedServerPacket(var2_long + (long)var4, GameAppletShell.field_a, new byte[EmailSyntaxValidator.field_r]);
            for (int var6 = 0; var6 < EmailSyntaxValidator.field_r; var6++) {
              var5.payload[var6] = QuickChatDynamicCommand.incomingPackets.payload[var6];
            }
            bb.field_L.addLast(-12328, var5);
            GameAppletShell.field_a = -1;
            stackIn_22_0 = GameAppletShell.field_a;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
          if (param0 < 31) {
            this.a(-37);
          }
          this.a(0, param1.length, (byte) 101, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    BufferedRandomAccessFile(BoundedRandomAccessFile param0, int param1, int param2) throws IOException {
        this.field_f = -1L;
        this.field_a = -1L;
        this.field_l = 0;
        try {
          this.field_b = param0;
          long dupTemp$0 = param0.c(-26510);
          this.field_i = dupTemp$0;
          this.field_e = dupTemp$0;
          this.field_d = 0L;
          this.field_g = new byte[param1];
          this.field_h = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static NameAvailabilityResult a(String[] args, byte param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 > -53) {
            NameAvailabilityResult stackIn_2_0 = (NameAvailabilityResult) null;
            return stackIn_2_0;
          }
          NameAvailabilityResult var2 = new NameAvailabilityResult(false);
          var2.field_c = args;
          NameAvailabilityResult stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rg.F(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Names cannot contain consecutive spaces";
    }
}
