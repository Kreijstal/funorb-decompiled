/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    private int writePosition;
    private PlatformService field_e;
    private int bufferCapacity;
    private boolean writeError;
    private PlatformRequest field_g;
    private OutputStream output;
    private boolean closed;
    private byte[] writeBuffer;
    private java.net.Socket socket;
    private InputStream input;
    private int readPosition;

    final void close(int param0) {
        try {
          int var4 = 0;
          var4 = VoidHunters.field_G;
          if (this.closed) {
            return;
          }
          if (param0 != 1) {
            return;
          }
          synchronized (this) {
            this.closed = true;
            this.notifyAll();
          }
          if (this.field_g != null) {
            while (this.field_g.status == 0) {
              BufferedFile.sleep(-94, 1L);
            }
            if (this.field_g.status == 1) {
              try {
                ((Thread) (this.field_g.result)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void readFully(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 >= -121) {
            this.bufferCapacity = 66;
          }
          if (this.closed) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.input.read(param3, param1, param2);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param2 = param2 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("lpb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var3 = null;
          int var6 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          String var7 = null;
          var6 = VoidHunters.field_G;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.writePosition == this.readPosition) {
                  if (this.closed) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2 = this.readPosition;
                  if (this.writePosition >= this.readPosition) {
                    var1_int = -this.readPosition + this.writePosition;
                  } else {
                    var1_int = this.bufferCapacity - this.readPosition;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.input) {
                    this.input.close();
                  }
                  if (null != this.output) {
                    this.output.close();
                  }
                  if (this.socket != null) {
                    this.socket.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.writeBuffer = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.output.write(this.writeBuffer, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.writeError = true;
              }
              this.readPosition = (var1_int + this.readPosition) % this.bufferCapacity;
              try {
                if (this.writePosition == this.readPosition) {
                  this.output.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.writeError = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            FractalNoiseVolumeGenerator.reportClientError((Throwable) ((Object) var1_ref), (String) null, 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int readByte(int param0) throws IOException {
        if (param0 >= -34) {
          byte[] var3 = (byte[]) null;
          BufferedSocket.createAlphaBitmapFont((byte) -34, (byte[]) null);
        }
        if (this.closed) {
          return 0;
        }
        return this.input.read();
    }

    final void write(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (this.closed) {
            return;
          }
          if (this.writeError) {
            this.writeError = false;
            throw new IOException();
          }
          if (this.writeBuffer == null) {
            this.writeBuffer = new byte[this.bufferCapacity];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = param0; var6 < param2; var6++) {
              this.writeBuffer[this.writePosition] = param1[var6 + param3];
              this.writePosition = (this.writePosition + 1) % this.bufferCapacity;
              if (this.writePosition == (-100 + (this.bufferCapacity + this.readPosition)) % this.bufferCapacity) {
                throw new IOException();
              }
            }
            if (null == this.field_g) {
              this.field_g = this.field_e.startThread(0, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("lpb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static SoftwareAlphaBitmapFont createAlphaBitmapFont(byte param0, byte[] param1) {
        SoftwareAlphaBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        SoftwareAlphaBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 != 19) {
            var3 = (byte[]) null;
            BufferedSocket.createAlphaBitmapFont((byte) -54, (byte[]) null);
          }
          var2 = new SoftwareAlphaBitmapFont(param1, LegacyOpenGlScrollingNoiseEffect.field_e, SettingsChange.field_f, SetMissionTerrainDebrisProbability.field_o, hla.field_a, LegacyOpenGlTextureCache.field_d, sh.field_a);
          MatchResults.a(39);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("lpb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int available(int param0) throws IOException {
        if (this.closed) {
          return 0;
        }
        if (param0 != 0) {
          return 45;
        }
        return this.input.available();
    }

    final void checkWriteError(byte param0) throws IOException {
        if (this.closed) {
          return;
        }
        if (this.writeError) {
          this.writeError = false;
          throw new IOException();
        }
        if (param0 <= 101) {
          this.finalize();
        }
    }

    protected final void finalize() {
        this.close(1);
    }

    BufferedSocket(java.net.Socket param0, PlatformService param1) throws IOException {
        this(param0, param1, 5000);
    }

    private BufferedSocket(java.net.Socket param0, PlatformService param1, int param2) throws IOException {
        this.writeError = false;
        this.closed = false;
        this.writePosition = 0;
        this.readPosition = 0;
        try {
          this.field_e = param1;
          this.socket = param0;
          this.socket.setSoTimeout(30000);
          this.socket.setTcpNoDelay(true);
          this.input = this.socket.getInputStream();
          this.output = this.socket.getOutputStream();
          this.bufferCapacity = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lpb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
