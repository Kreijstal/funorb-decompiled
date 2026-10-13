/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    static String field_h;
    private OutputStream output;
    private PlatformTaskService threadLauncher;
    static String[] field_m;
    private int readPosition;
    private boolean closed;
    private InputStream input;
    static ep field_i;
    private PlatformTask writerTask;
    static String field_a;
    private java.net.Socket socket;
    private byte[] writeBuffer;
    private int bufferCapacity;
    private int writePosition;
    private boolean writeError;
    static int field_j;

    final static void disableKeyboard(byte obfuscationGuard) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (obfuscationGuard != 41) {
          return;
        }
        if (QuickChatCategory.keyboardListener == null) {
          return;
        }
        var1 = QuickChatCategory.keyboardListener;
        synchronized (var1) {
          QuickChatCategory.keyboardListener = null;
        }
        return;
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 > 72) {
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        }
        field_h = (String) null;
        field_m = null;
        field_i = null;
        field_a = null;
    }

    BufferedSocket(java.net.Socket socket, PlatformTaskService threadLauncher) throws IOException {
        this(socket, threadLauncher, 5000);
    }

    final void write(byte[] source, byte obfuscationGuard, int sourceOffset, int length) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
            if (obfuscationGuard != 20) {
              return;
            }
            for (var6 = 0; length > var6; var6++) {
              this.writeBuffer[this.writePosition] = source[sourceOffset + var6];
              this.writePosition = (this.writePosition + 1) % this.bufferCapacity;
              if (this.writePosition == (-100 + this.bufferCapacity + this.readPosition) % this.bufferCapacity) {
                throw new IOException();
              }
            }
            if (null == this.writerTask) {
              this.writerTask = this.threadLauncher.startThreadAsync(3, obfuscationGuard - 20, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("hi.D(");
          if (source == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(',').append(sourceOffset).append(',').append(length).append(')').toString());
        }
    }

    final void readFully(int obfuscationGuard, int destinationOffset, int length, byte[] destination) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 0) {
            this.run();
          }
          if (this.closed) {
            return;
          }
          while (0 < length) {
            var5_int = this.input.read(destination, destinationOffset, length);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            length = length - var5_int;
            destinationOffset = destinationOffset + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hi.H(").append(obfuscationGuard).append(',').append(destinationOffset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int available(byte obfuscationGuard) throws IOException {
        if (this.closed) {
          return 0;
        }
        if (obfuscationGuard != 43) {
          field_j = -2;
          return this.input.available();
        }
        return this.input.available();
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
          var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
                  if (this.writePosition < this.readPosition) {
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
                  if (this.output != null) {
                    this.output.close();
                  }
                  if (null != this.socket) {
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
                if (this.readPosition == this.writePosition) {
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
            af.a((Throwable) ((Object) var1_ref), -65, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (ResourceProtocolClient.effectsGain <= 32) {
          mh.setEffectsGain(0, (byte) -109);
        } else {
          var1 = ResourceProtocolClient.effectsGain % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          mh.setEffectsGain(ResourceProtocolClient.effectsGain - var1, (byte) -109);
        }
        if (param0) {
          BufferedSocket.b((byte) -114);
          return;
        }
    }

    final void close(byte obfuscationGuard) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (this.closed) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.closed = true;
            this.notifyAll();
          }
          if (obfuscationGuard != -45) {
            return;
          }
          if (this.writerTask != null) {
            while (this.writerTask.status == 0) {
              SpriteButtonPainter.a(1L, 0);
            }
            if (this.writerTask.status == 1) {
              try {
                ((Thread) (this.writerTask.result)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
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

    final void checkWriteError(boolean check) throws IOException {
        if (!check) {
          return;
        }
        if (this.closed) {
          return;
        }
        if (this.writeError) {
          this.writeError = false;
          throw new IOException();
        }
    }

    protected final void finalize() {
        this.close((byte) -45);
    }

    final int readByte(int obfuscationGuard) throws IOException {
        if (this.closed) {
          return 0;
        }
        if (obfuscationGuard > 1) {
          return this.input.read();
        }
        field_j = 65;
        return this.input.read();
    }

    private BufferedSocket(java.net.Socket socket, PlatformTaskService threadLauncher, int bufferCapacity) throws IOException {
        this.readPosition = 0;
        this.writeError = false;
        this.writePosition = 0;
        this.closed = false;
        try {
          this.threadLauncher = threadLauncher;
          this.socket = socket;
          this.socket.setSoTimeout(30000);
          this.socket.setTcpNoDelay(true);
          this.input = this.socket.getInputStream();
          this.output = this.socket.getOutputStream();
          this.bufferCapacity = bufferCapacity;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hi.<init>(" + (socket != null ? "{...}" : "null") + ',' + (threadLauncher != null ? "{...}" : "null") + ',' + bufferCapacity + ')');
        }
    }

    static {
        field_h = "You currently have an ongoing mission in progress<br><br><col=FFFF00><%0></col>.<br><br>Starting a new mission will abort the currently ongoing mission.<br><br>Do you wish to continue?";
        field_m = new String[]{"Skirmish", "Warrior", "Ranger", "Mage", "Flying", "Helper", "Creeper", "Titan"};
        field_a = "Earn runes to access new gods and units.";
    }
}
