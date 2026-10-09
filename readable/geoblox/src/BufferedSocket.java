/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    private int writeReadIndex;
    static int[] thirdVertexTransformedY;
    private PlatformTask writerTask;
    private int writeInsertIndex;
    private int bufferCapacity;
    private byte[] writeBuffer;
    static int keyEventWriteIndex;
    private InputStream inputStream;
    private boolean closeRequested;
    private OutputStream outputStream;
    private java.net.Socket socket;
    private PlatformTaskDispatcher taskDispatcher;
    private boolean writeFailurePending;

    protected final void finalize() {
        this.close(-124);
    }

    final void close(int guard) {
        try {
            InterruptedException ignoredJoinInterruption = null;
            Throwable caughtThrowable = null;
            Object closeMonitor = null;
            if (guard >= -117) {
              this.run();
            }
            if (this.closeRequested) {
              return;
            }
            closeMonitor = this;
            synchronized (closeMonitor) {
              this.closeRequested = true;
              this.notifyAll();
            }
            if (this.writerTask != null) {
              while (0 == this.writerTask.status) {
                ByteTextDecodingSupport.sleepMillis(0, 1L);
              }
              if (1 == this.writerTask.status) {
                try {
                  ((Thread) (this.writerTask.result)).join();
                } catch (java.lang.InterruptedException joinInterruption) {
                  caughtThrowable = joinInterruption;
                  ignoredJoinInterruption = (InterruptedException) (Object) caughtThrowable;
                }
              }
            }
            this.writerTask = null;
            return;
        } catch (RuntimeException | Error uncheckedFailure) {
            throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
            throw new RuntimeException(checkedFailure);
        }
    }

    final void checkWriteFailure(int guard) throws IOException {
        if (this.closeRequested) {
            return;
        }
        if (guard >= -79) {
            return;
        }
        if (!this.writeFailurePending) {
            return;
        }
        this.writeFailurePending = false;
        throw new IOException();
    }

    final int available(byte guard) throws IOException {
        if (guard <= 71) {
            this.inputStream = (InputStream) null;
            if (!this.closeRequested) {
                return this.inputStream.available();
            }
            return 0;
        }
        if (!this.closeRequested) {
            return this.inputStream.available();
        }
        return 0;
    }

    final static FrameTimer createFrameClock(int guard) {
        if (guard != 5000) {
            BufferedSocket.releaseTransformedVertexScratch(-113);
            return (FrameTimer) ((Object) new NanoFrameTimer());
        }
        return (FrameTimer) ((Object) new NanoFrameTimer());
    }

    final void readFully(byte[] destination, byte guard, int destinationOffset, int remainingLength) throws IOException {
        int bytesRead = 0;
        RuntimeException readFailureForMessage = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtReadFailure = null;
        RuntimeException readFailure = null;
        try {
          if (guard != -97) {
            return;
          }
          if (this.closeRequested) {
            return;
          }
          while (remainingLength > 0) {
            bytesRead = this.inputStream.read(destination, destinationOffset, remainingLength);
            if (0 >= bytesRead) {
              throw new EOFException();
            }
            remainingLength = remainingLength - bytesRead;
            destinationOffset = destinationOffset + bytesRead;
          }
          return;
        } catch (java.lang.RuntimeException readRuntimeFailure) {
          caughtReadFailure = readRuntimeFailure;
          readFailure = caughtReadFailure;
          readFailureForMessage = readFailure;
          readMessagePrefix = new StringBuilder().append("ba.B(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureForMessage), ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(guard).append(',').append(destinationOffset).append(',').append(remainingLength).append(')').toString());
        }
    }

    final void enqueueWrite(int guard, int sourceOffset, int length, byte[] source) throws IOException {
        int sourceIndex = 0;
        RuntimeException enqueueFailureForMessage = null;
        StringBuilder enqueueMessagePrefix = null;
        String sourceDescription = null;
        Throwable caughtEnqueueFailure = null;
        Object enqueueMonitor = null;
        RuntimeException enqueueFailure = null;
        try {
          if (this.closeRequested) {
            return;
          }
          if (this.writeFailurePending) {
            this.writeFailurePending = false;
            throw new IOException();
          }
          if (null == this.writeBuffer) {
            this.writeBuffer = new byte[this.bufferCapacity];
          }
          enqueueMonitor = this;
          synchronized (enqueueMonitor) {
            for (sourceIndex = 0; length > sourceIndex; sourceIndex++) {
              this.writeBuffer[this.writeInsertIndex] = source[sourceOffset + sourceIndex];
              this.writeInsertIndex = (this.writeInsertIndex + 1) % this.bufferCapacity;
              if (this.writeInsertIndex == (this.bufferCapacity + (this.writeReadIndex - 100)) % this.bufferCapacity) {
                throw new IOException();
              }
            }
            if (guard != 100) {
              this.outputStream = (OutputStream) null;
            }
            if (null == this.writerTask) {
              this.writerTask = this.taskDispatcher.startThread((Runnable) (this), 0, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException enqueueRuntimeFailure) {
          caughtEnqueueFailure = enqueueRuntimeFailure;
          enqueueFailure = (RuntimeException) (Object) caughtEnqueueFailure;
          enqueueFailureForMessage = enqueueFailure;
          enqueueMessagePrefix = new StringBuilder().append("ba.G(").append(guard).append(',').append(sourceOffset).append(',').append(length).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) enqueueFailureForMessage), ((StringBuilder) (Object) enqueueMessagePrefix).append(sourceDescription).append(')').toString());
        }
    }

    final int readByte(int guard) throws IOException {
        if (this.closeRequested) {
            return 0;
        }
        if (guard != -17422) {
            return -104;
        }
        return this.inputStream.read();
    }

    public static void releaseTransformedVertexScratch(int guard) {
        if (guard != 21888) {
            return;
        }
        thirdVertexTransformedY = null;
    }

    BufferedSocket(java.net.Socket socket, PlatformTaskDispatcher taskDispatcher) throws IOException {
        this(socket, taskDispatcher, 5000);
    }

    public final void run() {
        try {
            int contiguousWriteLength = 0;
            Object writerMonitor = null;
            int writerActionRoute = 0;
            Throwable caughtWriterThrowable = null;
            IOException ignoredCloseFailure = null;
            Exception workerFailure = null;
            int contiguousWriteOffset = 0;
            IOException ignoredWriteOrFlushFailure = null;
            InterruptedException ignoredWaitInterruption = null;
            String unusedReportMessage = null;
            try {
              while (true) {
                writerMonitor = this;
                synchronized (writerMonitor) {
                  writerChunkSelection: {
                    if (this.writeReadIndex == this.writeInsertIndex) {
                      if (this.closeRequested) {
                        writerActionRoute = 0;
                        break writerChunkSelection;
                      }
                      try {
                        this.wait();
                      } catch (java.lang.InterruptedException waitInterruption) {
                        caughtWriterThrowable = waitInterruption;
                        ignoredWaitInterruption = (InterruptedException) (Object) caughtWriterThrowable;
                      }
                    }
                    contiguousWriteOffset = this.writeReadIndex;
                    if (this.writeInsertIndex < this.writeReadIndex) {
                      contiguousWriteLength = this.bufferCapacity - this.writeReadIndex;
                    } else {
                      contiguousWriteLength = this.writeInsertIndex - this.writeReadIndex;
                    }
                    writerActionRoute = 1;
                  }
                }
                if (writerActionRoute == 0) {
                  try {
                    if (this.inputStream != null) {
                      this.inputStream.close();
                    }
                    if (this.outputStream != null) {
                      this.outputStream.close();
                    }
                    if (this.socket != null) {
                      this.socket.close();
                    }
                  } catch (java.io.IOException closeFailure) {
                    caughtWriterThrowable = closeFailure;
                    ignoredCloseFailure = (IOException) (Object) caughtWriterThrowable;
                  }
                  this.writeBuffer = null;
                  break;
                }
                if (contiguousWriteLength <= 0) {
                  continue;
                }
                try {
                  this.outputStream.write(this.writeBuffer, contiguousWriteOffset, contiguousWriteLength);
                } catch (java.io.IOException writeFailure) {
                  caughtWriterThrowable = writeFailure;
                  ignoredWriteOrFlushFailure = (IOException) (Object) caughtWriterThrowable;
                  this.writeFailurePending = true;
                }
                this.writeReadIndex = (contiguousWriteLength + this.writeReadIndex) % this.bufferCapacity;
                try {
                  if (this.writeInsertIndex == this.writeReadIndex) {
                    this.outputStream.flush();
                  }
                } catch (java.io.IOException flushFailure) {
                  caughtWriterThrowable = flushFailure;
                  ignoredWriteOrFlushFailure = (IOException) (Object) caughtWriterThrowable;
                  this.writeFailurePending = true;
                }
              }
            } catch (java.lang.Exception unexpectedWorkerFailure) {
              caughtWriterThrowable = unexpectedWorkerFailure;
              workerFailure = (Exception) (Object) caughtWriterThrowable;
              unusedReportMessage = (String) null;
              IterableNodeHashTable.reportClientError((Throwable) ((Object) workerFailure), (String) null, (byte) 125);
            }
        } catch (RuntimeException | Error uncheckedFailure) {
            throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
            throw new RuntimeException(checkedFailure);
        }
    }

    final static void clearSessionAndReload(byte guard, java.applet.Applet applet) {
        try {
            if (guard != 116) {
                java.applet.Applet unusedApplet = (java.applet.Applet) null;
                BufferedSocket.clearSessionAndReload((byte) 45, (java.applet.Applet) null);
            }
            MeshPrioritySupport.updateSessionCookie("", applet, -1);
            EmailAvailabilityQuery.navigateToReloadPage(applet, false);
        } catch (RuntimeException reloadFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) reloadFailure), "ba.C(" + guard + ',' + (applet != null ? "{...}" : "null") + ')');
        }
    }

    private BufferedSocket(java.net.Socket socket, PlatformTaskDispatcher taskDispatcher, int bufferCapacity) throws IOException {
        this.closeRequested = false;
        this.writeInsertIndex = 0;
        this.writeReadIndex = 0;
        this.writeFailurePending = false;
        try {
            this.taskDispatcher = taskDispatcher;
            this.socket = socket;
            this.socket.setSoTimeout(30000);
            this.socket.setTcpNoDelay(true);
            this.inputStream = this.socket.getInputStream();
            this.outputStream = this.socket.getOutputStream();
            this.bufferCapacity = bufferCapacity;
        } catch (RuntimeException socketConfigurationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) socketConfigurationFailure), "ba.<init>(" + (socket != null ? "{...}" : "null") + ',' + (taskDispatcher != null ? "{...}" : "null") + ',' + bufferCapacity + ')');
        }
    }

    static {
        thirdVertexTransformedY = new int[8192];
        keyEventWriteIndex = 0;
    }
}
