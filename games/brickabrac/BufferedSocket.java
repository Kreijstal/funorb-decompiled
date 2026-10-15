/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    private int writePosition;
    private java.net.Socket socket;
    private boolean writeFailed;
    private PlatformServices taskScheduler;
    private byte[] outputBuffer;
    private boolean closed;
    private OutputStream output;
    static int textChoiceBodyLineHeight;
    private int readPosition;
    private InputStream input;
    private PlatformTask writerTask;
    private int bufferCapacity;
    static UiComponent field_h;

    final int readByte(int obfuscationGuard) throws IOException {
        if (obfuscationGuard != 0) {
          this.finalize();
        }
        if (this.closed) {
          return 0;
        }
        return this.input.read();
    }

    protected final void finalize() {
        this.close((byte) 111);
    }

    final void write(byte[] data, boolean obfuscationGuard, int length, int offset) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.closed) {
            return;
          }
          if (!obfuscationGuard) {
            return;
          }
          if (this.writeFailed) {
            this.writeFailed = false;
            throw new IOException();
          }
          if (this.outputBuffer == null) {
            this.outputBuffer = new byte[this.bufferCapacity];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < length; var6++) {
              this.outputBuffer[this.writePosition] = data[offset + var6];
              this.writePosition = (1 + this.writePosition) % this.bufferCapacity;
              if ((this.bufferCapacity + this.readPosition - 100) % this.bufferCapacity == this.writePosition) {
                throw new IOException();
              }
            }
            if (null == this.writerTask) {
              this.writerTask = this.taskScheduler.startThread(3, (Runnable) (this), (byte) -69);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("wh.B(");
          if (data == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(obfuscationGuard).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    final void readFully(int obfuscationGuard, byte[] data, int length, int offset) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.closed) {
            return;
          }
          if (obfuscationGuard != 25826) {
            return;
          }
          while (0 < length) {
            var5_int = this.input.read(data, offset, length);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            length = length - var5_int;
            offset = offset + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wh.E(").append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = BrickABrac.field_J ? 1 : 0;
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
                  if (this.readPosition <= this.writePosition) {
                    var1_int = -this.readPosition + this.writePosition;
                  } else {
                    var1_int = this.bufferCapacity - this.readPosition;
                  }
                  var2 = this.readPosition;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.input != null) {
                    this.input.close();
                  }
                  if (null != this.output) {
                    this.output.close();
                  }
                  if (null != this.socket) {
                    this.socket.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.outputBuffer = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.output.write(this.outputBuffer, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.writeFailed = true;
              }
              this.readPosition = (var1_int + this.readPosition) % this.bufferCapacity;
              try {
                if (this.readPosition == this.writePosition) {
                  this.output.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.writeFailed = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            AlignedIconLabel.a((String) null, (Throwable) ((Object) var1_ref), 105);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    BufferedSocket(java.net.Socket socket, PlatformServices taskScheduler) throws IOException {
        this(socket, taskScheduler, 5000);
    }

    public static void b(int param0) {
        if (param0 < 89) {
          return;
        }
        field_h = null;
    }

    final void close(byte obfuscationGuard) {
        try {
          int var4 = 0;
          var4 = BrickABrac.field_J ? 1 : 0;
          if (this.closed) {
            return;
          }
          synchronized (this) {
            this.closed = true;
            this.notifyAll();
          }
          if (this.writerTask != null) {
            while (this.writerTask.status == 0) {
              BytePayloadRequest.sleepMillis(-127, 1L);
            }
            if (this.writerTask.status == 1) {
              try {
                ((Thread) (this.writerTask.result)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.writerTask = null;
          if (obfuscationGuard < 110) {
            this.close((byte) 56);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (param0 != 21862) {
          return;
        }
        if (TooltipSprite.field_p) {
          Rasterizer2D.darkenRectangle(Rasterizer2D.clipLeft, Rasterizer2D.clipTop, -Rasterizer2D.clipLeft + Rasterizer2D.clipRight, -Rasterizer2D.clipTop + Rasterizer2D.clipBottom);
          QuickChatPhraseDefinition.quickChatMenuRoot.drawRoot(true, false);
        }
    }

    final void checkWriteError(int obfuscationGuard) throws IOException {
        if (this.closed) {
          return;
        }
        if (obfuscationGuard != -1) {
          this.writePosition = -17;
        }
        if (this.writeFailed) {
          this.writeFailed = false;
          throw new IOException();
        }
    }

    final int available(int obfuscationGuard) throws IOException {
        if (this.closed) {
          return 0;
        }
        if (obfuscationGuard != 10434) {
          this.finalize();
        }
        return this.input.available();
    }

    private BufferedSocket(java.net.Socket socket, PlatformServices taskScheduler, int bufferCapacity) throws IOException {
        this.writeFailed = false;
        this.closed = false;
        this.readPosition = 0;
        this.writePosition = 0;
        try {
          this.taskScheduler = taskScheduler;
          this.socket = socket;
          this.socket.setSoTimeout(30000);
          this.socket.setTcpNoDelay(true);
          this.input = this.socket.getInputStream();
          this.output = this.socket.getOutputStream();
          this.bufferCapacity = bufferCapacity;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wh.<init>(" + (socket != null ? "{...}" : "null") + ',' + (taskScheduler != null ? "{...}" : "null") + ',' + bufferCapacity + ')');
        }
    }

    static {
    }
}
