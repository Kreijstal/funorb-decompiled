/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LimitedRandomAccessFile {
    static uj field_b;
    private long maximumLength;
    static String waitingForSoundEffectsText;
    static String field_a;
    private RandomAccessFile file;
    private long position;
    static int avatarFeedbackHoldTicks;

    final void write(byte[] source, int sourceOffset, int methodGuard, int length) throws IOException {
        try {
            if (this.maximumLength < (long)length + this.position) {
                this.file.seek(this.maximumLength);
                this.file.write(1);
                throw new EOFException();
            }
            if (methodGuard != 90) {
                LimitedRandomAccessFile.b((byte) 102);
            }
            this.file.write(source, sourceOffset, length);
            this.position = this.position + (long)length;
        } catch (RuntimeException writeFailure) {
            throw t.a((Throwable) ((Object) writeFailure), "pa.A(" + (source != null ? "{...}" : "null") + ',' + sourceOffset + ',' + methodGuard + ',' + length + ')');
        }
    }

    final int read(int length, byte[] destination, int destinationOffset, boolean methodGuard) throws IOException {
        int bytesRead = 0;
        RuntimeException readFailureForContext = null;
        int bytesReadBeforeReturn = 0;
        RuntimeException readFailureBeforeContext = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtReadFailure = null;
        try {
          bytesRead = this.file.read(destination, destinationOffset, length);
          if (bytesRead > 0) {
            this.position = this.position + (long)bytesRead;
          }
          if (methodGuard) {
            avatarFeedbackHoldTicks = -101;
          }
          bytesReadBeforeReturn = bytesRead;
          return bytesReadBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeContext = (RuntimeException) (readFailureForContext);
          readMessagePrefix = new StringBuilder().append("pa.D(").append(length).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) readFailureBeforeContext), ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(destinationOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    final long length(int methodGuard) throws IOException {
        if (methodGuard != 1) {
            return -83L;
        }
        return this.file.length();
    }

    public static void b(byte param0) {
        waitingForSoundEffectsText = null;
        if (param0 <= 3) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (2 <= param2) {
            if (param2 <= 36) {
              var4_int = 0;
              var5 = 0;
              var6 = 0;
              var7 = param0.length();
              if (param3 != 87) {
                field_b = (uj) null;
              }
              for (var8 = 0; var8 < var7; var8++) {
                L3: {
                  var9 = param0.charAt(var8);
                  if (var8 == 0) {
                    if (45 == var9) {
                      var4_int = 1;
                      break L3;
                    }
                    if (var9 == 43) {
                      if (param1) {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (var9 >= 48) {
                      if (var9 <= 57) {
                        var9 -= 48;
                        break L5;
                      }
                    }
                    if (var9 >= 65) {
                      if (var9 <= 90) {
                        var9 -= 55;
                        break L5;
                      }
                    }
                    if (var9 >= 97) {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L5;
                      }
                    }
                    return false;
                  }
                  if (var9 >= param2) {
                    return false;
                  }
                  if (var4_int != 0) {
                    var9 = -var9;
                  }
                  var10 = var6 * param2 + var9;
                  if (var6 != var10 / param2) {
                    return false;
                  }
                  var6 = var10;
                  var5 = 1;
                }
              }
              stackIn_41_0 = var5;
              return stackIn_41_0 != 0;
            }
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = (RuntimeException) (var4);
          stackIn_44_1 = new StringBuilder().append("pa.B(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.file) {
            System.out.println("");
            this.close((byte) -5);
        }
    }

    final static void a(String param0, byte param1, boolean param2, java.applet.Applet param3) {
        try {
            int var4_int = 0;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            try {
              if (PlatformTaskDispatcher.osNameLowerCase.startsWith("win")) {
                if (GameplaySession.a(param0, false)) {
                  return;
                }
              }
              try {
                var4_int = -83 / ((param1 + 55) / 62);
                param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
              } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                gi.a((Throwable) null, "MGR1: " + param0, (byte) 125);
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_10_0 = (RuntimeException) (var4_ref);
              stackIn_10_1 = new StringBuilder().append("pa.F(");
              if (param0 == null) {
                stackIn_11_2 = "null";
              } else {
                stackIn_11_2 = "{...}";
              }
              stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
              if (param3 == null) {
                stackIn_14_2 = "null";
              } else {
                stackIn_14_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    LimitedRandomAccessFile(File path, String mode, long maximumLength) throws IOException {
        int firstByte = 0;
        try {
            if (maximumLength == -1L) {
                maximumLength = 9223372036854775807L;
            }
            if (~maximumLength > ~path.length()) {
                path.delete();
            }
            this.file = new RandomAccessFile(path, mode);
            this.maximumLength = maximumLength;
            this.position = 0L;
            firstByte = this.file.read();
            if (firstByte != -1 && !mode.equals("r")) {
                this.file.seek(0L);
                this.file.write(firstByte);
            }
            this.file.seek(0L);
        } catch (RuntimeException constructionFailure) {
            throw t.a((Throwable) ((Object) constructionFailure), "pa.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    final void seek(long position, boolean methodGuard) throws IOException {
        this.file.seek(position);
        this.position = position;
        if (!methodGuard) {
            waitingForSoundEffectsText = (String) null;
        }
    }

    final void close(byte methodGuard) throws IOException {
        if (methodGuard != -5) {
            return;
        }
        if (null != this.file) {
            this.file.close();
            this.file = null;
        }
    }

    static {
        field_b = new uj();
        field_a = "Score: <%0>";
        waitingForSoundEffectsText = "Waiting for sound effects";
        avatarFeedbackHoldTicks = 0;
    }
}
