/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    static QuickChatDynamicCommand field_k;
    private boolean closed;
    private java.net.Socket socket;
    private int bufferCapacity;
    private int writeIndex;
    private boolean writeFailed;
    private SystemTask writerTask;
    private byte[] writeBuffer;
    private SystemTaskService taskService;
    static Sprite[] field_g;
    private InputStream input;
    private OutputStream output;
    private int readIndex;

    final void close(int guard) {
        try {
          int var4 = EscapeVector.obfuscationControl;
          if (this.closed) {
            return;
          }
          Object var2 = this;
          synchronized (var2) {
            this.closed = true;
            this.notifyAll();
          }
          if (guard != 12497) {
            this.socket = (java.net.Socket) null;
          }
          if (this.writerTask != null) {
            while (0 == this.writerTask.field_f) {
              en.a((byte) 81, 1L);
            }
            if (this.writerTask.field_f == 1) {
              try {
                ((Thread) (this.writerTask.field_b)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                InterruptedException var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.writerTask = null;
                return;
              }
            }
          }
          this.writerTask = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.close(12497);
    }

    final void checkWriteError(byte guard) throws IOException {
        if (this.closed) {
          return;
        }
        if (guard != 123) {
          BufferedSocket.releaseStatics((byte) 28);
          if (this.writeFailed) {
            this.writeFailed = false;
            throw new IOException();
          }
          return;
        }
        if (this.writeFailed) {
          this.writeFailed = false;
          throw new IOException();
        }
    }

    final void write(int length, int offset, byte[] bytes, int guard) throws IOException {
        String stackIn_30_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.closed) {
            return;
          }
          if (this.writeFailed) {
            this.writeFailed = false;
            throw new IOException();
          }
          if (this.writeBuffer == null) {
            this.writeBuffer = new byte[this.bufferCapacity];
          }
          Object var5 = this;
          synchronized (var5) {
            for (int var6 = 0; length > var6; var6++) {
              this.writeBuffer[this.writeIndex] = bytes[offset + var6];
              this.writeIndex = (this.writeIndex + 1) % this.bufferCapacity;
              if (~((-100 + this.readIndex + this.bufferCapacity) % this.bufferCapacity) == ~this.writeIndex) {
                throw new IOException();
              }
            }
            if (this.writerTask == null) {
              this.writerTask = this.taskService.a(true, 3, (Runnable) (this));
            }
            if (guard != 5000) {
              return;
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_29_0 = var5_ref;
          StringBuilder stackIn_29_1 = new StringBuilder().append("pj.E(").append(length).append(',').append(offset).append(',');
          if (bytes == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(guard).append(')').toString());
        }
    }

    final int available(int guard) throws IOException {
        if (this.closed) {
          return 0;
        }
        if (guard < -116) {
          return this.input.available();
        }
        this.run();
        return this.input.available();
    }

    BufferedSocket(java.net.Socket param0, SystemTaskService param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void releaseStatics(byte guard) {
        field_g = null;
        field_k = null;
        if (guard == 6) {
          return;
        }
        BufferedSocket.releaseStatics((byte) -119);
    }

    final int readUnsignedByte(int guard) throws IOException {
        if (guard != -16650) {
          return 22;
        }
        if (this.closed) {
          return 0;
        }
        return this.input.read();
    }

    public final void run() {
        try {
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          int var2 = 0;
          IOException var3_ref = null;
          int var6 = EscapeVector.obfuscationControl;
          try {
            while (true) {
              Object var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.writeIndex == this.readIndex) {
                  if (this.closed) {
                    decompiledRegionSelector0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      InterruptedException var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2 = this.readIndex;
                  if (this.writeIndex >= this.readIndex) {
                    var1_int = this.writeIndex - this.readIndex;
                  } else {
                    var1_int = -this.readIndex + this.bufferCapacity;
                  }
                  decompiledRegionSelector0 = true;
                }
              }
              if (!decompiledRegionSelector0) {
                try {
                  if (this.input != null) {
                    this.input.close();
                  }
                  if (this.output != null) {
                    this.output.close();
                  }
                  if (null != this.socket) {
                    this.socket.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  IOException var1 = (IOException) (Object) decompiledCaughtException;
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
                this.writeFailed = true;
              }
              this.readIndex = (var1_int + this.readIndex) % this.bufferCapacity;
              try {
                if (this.readIndex == this.writeIndex) {
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
            Exception var1_ref = (Exception) (Object) decompiledCaughtException;
            String var7 = (String) null;
            pf.a(false, (String) null, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void readFully(int offset, int length, byte[] destination, byte guard) throws IOException {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (guard != -49) {
            return;
          }
          if (this.closed) {
            return;
          }
          while (length > 0) {
            int var5_int = this.input.read(destination, offset, length);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            offset = offset + var5_int;
            length = length - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pj.A(").append(offset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    private BufferedSocket(java.net.Socket param0, SystemTaskService param1, int param2) throws IOException {
        this.closed = false;
        this.writeIndex = 0;
        this.writeFailed = false;
        this.readIndex = 0;
        try {
          this.socket = param0;
          this.taskService = param1;
          this.socket.setSoTimeout(30000);
          this.socket.setTcpNoDelay(true);
          this.input = this.socket.getInputStream();
          this.output = this.socket.getOutputStream();
          this.bufferCapacity = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_k = new QuickChatDynamicCommand(7, 0, 1, 1);
    }
}
