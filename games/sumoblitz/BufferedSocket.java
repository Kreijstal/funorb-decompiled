/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    static SpriteData field_n;
    private byte[] writeBuffer;
    static PlatformTask field_p;
    private int readPosition;
    private int bufferCapacity;
    private boolean writeError;
    private boolean closed;
    private OutputStream output;
    static String[] field_i;
    static String moreSuggestionsText;
    private PlatformTaskDispatcher taskDispatcher;
    private int writePosition;
    static boolean field_f;
    private java.net.Socket socket;
    private PlatformTask writerTask;
    private InputStream input;

    final int readByte(int guard) throws IOException {
        if (guard >= -84) {
          this.writeBuffer = (byte[]) null;
        }
        if (this.closed) {
          return 0;
        }
        return this.input.read();
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
          var6 = Sumoblitz.field_L ? 1 : 0;
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
                  if (this.readPosition > this.writePosition) {
                    var1_int = -this.readPosition + this.bufferCapacity;
                  } else {
                    var1_int = -this.readPosition + this.writePosition;
                  }
                  var2 = this.readPosition;
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
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.output.write(this.writeBuffer, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.writeError = true;
              }
              this.readPosition = (this.readPosition + var1_int) % this.bufferCapacity;
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
            IntrusiveNode.reportClientError((String) null, (Throwable) ((Object) var1_ref), 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void checkWriteError(int guard) throws IOException {
        if (this.closed) {
          return;
        }
        int var2 = -72 / ((36 - guard) / 42);
        if (this.writeError) {
          this.writeError = false;
          throw new IOException();
        }
    }

    protected final void finalize() {
        this.close((byte) -97);
    }

    final void close(byte guard) {
        try {
          int var4 = 0;
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (this.closed) {
            return;
          }
          if (guard >= -36) {
            this.taskDispatcher = (PlatformTaskDispatcher) null;
          }
          synchronized (this) {
            this.closed = true;
            this.notifyAll();
          }
          if (this.writerTask != null) {
            while (this.writerTask.status == 0) {
              tg.a(1L, (byte) 113);
            }
            if (this.writerTask.status == 1) {
              try {
                ((Thread) (this.writerTask.result)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.writerTask = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int available(int guard) throws IOException {
        if (guard >= -22) {
          return 73;
        }
        if (this.closed) {
          return 0;
        }
        return this.input.available();
    }

    final void write(int offset, int guard, byte[] source, int length) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.closed) {
            return;
          }
          if (this.writeError) {
            this.writeError = false;
            throw new IOException();
          }
          if (null == this.writeBuffer) {
            this.writeBuffer = new byte[this.bufferCapacity];
          }
          var5 = this;
          synchronized (var5) {
            if (guard != -2) {
              this.socket = (java.net.Socket) null;
            }
            for (var6 = 0; var6 < length; var6++) {
              this.writeBuffer[this.writePosition] = source[var6 + offset];
              this.writePosition = (this.writePosition + 1) % this.bufferCapacity;
              if (this.writePosition == (-100 + this.readPosition + this.bufferCapacity) % this.bufferCapacity) {
                throw new IOException();
              }
            }
            if (this.writerTask == null) {
              this.writerTask = this.taskDispatcher.a(true, (Runnable) (this), 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("dt.G(").append(offset).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(length).append(')').toString());
        }
    }

    BufferedSocket(java.net.Socket connection, PlatformTaskDispatcher dispatcher) throws IOException {
        this(connection, dispatcher, 5000);
    }

    private BufferedSocket(java.net.Socket param0, PlatformTaskDispatcher param1, int param2) throws IOException {
        this.readPosition = 0;
        this.closed = false;
        this.writeError = false;
        this.writePosition = 0;
        try {
          this.socket = param0;
          this.taskDispatcher = param1;
          this.socket.setSoTimeout(30000);
          this.socket.setTcpNoDelay(true);
          this.input = this.socket.getInputStream();
          this.output = this.socket.getOutputStream();
          this.bufferCapacity = param2;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 19) {
          BufferedSocket.releaseStatics(-53);
        }
        field_i = null;
        moreSuggestionsText = null;
        field_p = null;
        field_n = null;
    }

    final void readFully(int guard, int offset, int length, byte[] destination) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.closed) {
            return;
          }
          while (0 < length) {
            var5_int = this.input.read(destination, offset, length);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            offset = offset + var5_int;
            length = length - var5_int;
          }
          if (guard > -12) {
            this.writeError = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("dt.D(").append(guard).append(',').append(offset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        moreSuggestionsText = "More suggestions";
        field_f = true;
    }
}
