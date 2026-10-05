/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AsyncResourceDownloader implements Runnable {
    private java.net.URL resourceUrl;
    static int tooltipShowDelayTicks;
    private PlatformTaskDispatcher taskDispatcher;
    private int downloadStage;
    static int duplicateAppletStartCount;
    private ByteArrayBuffer downloadBuffer;
    static ArchiveNetworkClient archiveNetworkClient;
    static int minimumPasswordLength;
    static TextTemplateArgumentType textTemplateArgumentTypeFour;
    private DataInputStream downloadStream;
    private PlatformTask jaggrabSocketTask;
    private PlatformTask urlStreamTask;
    private PlatformTask readerThreadTask;
    static int receivedSocialSettingHigh;

    final ByteArrayBuffer getDownloadedBuffer(byte methodGuard) {
        int unusedGuardQuotient = 62 / ((methodGuard - 9) / 53);
        if (this.downloadStage == 3) {
            return this.downloadBuffer;
        }
        return null;
    }

    protected final void finalize() {
        if (null != this.urlStreamTask) {
            if (this.urlStreamTask.result != null) {
                try {
                    ((DataInputStream) (this.urlStreamTask.result)).close();
                } catch (Exception ignoredUrlStreamCloseFailure) {
                }
            }
            this.urlStreamTask = null;
        }
        if (this.jaggrabSocketTask != null) {
            if (null != this.jaggrabSocketTask.result) {
                try {
                    ((java.net.Socket) (this.jaggrabSocketTask.result)).close();
                } catch (Exception ignoredSocketCloseFailure) {
                }
            }
            this.jaggrabSocketTask = null;
        }
        if (null != this.downloadStream) {
            try {
                this.downloadStream.close();
            } catch (Exception ignoredDownloadStreamCloseFailure) {
            }
            this.downloadStream = null;
        }
        this.readerThreadTask = null;
    }

    public static void releaseDownloaderSharedResources(byte methodGuard) {
        int unusedGuardQuotient = 26 / ((methodGuard - 45) / 32);
        archiveNetworkClient = null;
        textTemplateArgumentTypeFour = null;
    }

    final synchronized boolean pollDownloadAttempts(byte methodGuard) {
        int streamSetupOutcome = 0;
        Throwable caughtStreamSetupFailure = null;
        IOException ignoredStreamSetupIoFailure = null;
        OutputStream jaggrabOutputStream = null;
        java.net.Socket jaggrabSocket = null;
        CharSequence jaggrabRequestCharacters = null;
        if (2 <= this.downloadStage) {
          return true;
        }
        if (this.downloadStage == 0) {
          if (null == this.urlStreamTask) {
            this.urlStreamTask = this.taskDispatcher.requestUrlStream(-14, this.resourceUrl);
          }
          if (0 == this.urlStreamTask.status) {
            return false;
          }
          if (1 != this.urlStreamTask.status) {
            this.downloadStage = this.downloadStage + 1;
            this.urlStreamTask = null;
            return false;
          }
        }
        if (this.downloadStage == 1) {
          if (this.jaggrabSocketTask == null) {
            this.jaggrabSocketTask = this.taskDispatcher.requestSocket(443, this.resourceUrl.getHost(), false);
          }
          if (this.jaggrabSocketTask.status == 0) {
            return false;
          }
          if (1 != this.jaggrabSocketTask.status) {
            this.jaggrabSocketTask = null;
            this.downloadStage = this.downloadStage + 1;
            return false;
          }
        }
        if (null == this.downloadStream) {
          try {
            if (this.downloadStage == 0) {
              this.downloadStream = (DataInputStream) (this.urlStreamTask.result);
            }
            if (this.downloadStage == 1) {
              jaggrabSocket = (java.net.Socket) (this.jaggrabSocketTask.result);
              jaggrabSocket.setSoTimeout(10000);
              jaggrabOutputStream = jaggrabSocket.getOutputStream();
              jaggrabOutputStream.write(17);
              jaggrabRequestCharacters = (CharSequence) ((Object) ("JAGGRAB " + this.resourceUrl.getFile() + "\n\n"));
              jaggrabOutputStream.write(MultiHandleSliderRenderer.encodeTextBytes(jaggrabRequestCharacters, (byte) 127));
              this.downloadStream = new DataInputStream(jaggrabSocket.getInputStream());
            }
            this.downloadBuffer.position = 0;
            streamSetupOutcome = 0;
          } catch (java.io.IOException streamSetupIoFailure) {
            caughtStreamSetupFailure = streamSetupIoFailure;
            ignoredStreamSetupIoFailure = (IOException) (Object) caughtStreamSetupFailure;
            this.finalize();
            this.downloadStage = this.downloadStage + 1;
            streamSetupOutcome = 1;
          }
          if (streamSetupOutcome == 0) {
            if (null == this.readerThreadTask) {
              this.readerThreadTask = this.taskDispatcher.startThread((Runnable) (this), 0, 5);
            }
            if (0 == this.readerThreadTask.status) {
              return false;
            }
            if (methodGuard != 45) {
              return false;
            }
            if (this.readerThreadTask.status == 1) {
              return false;
            }
            this.finalize();
            this.downloadStage = this.downloadStage + 1;
            return false;
          }
        }
        if (null == this.readerThreadTask) {
          this.readerThreadTask = this.taskDispatcher.startThread((Runnable) (this), 0, 5);
        }
        if (0 == this.readerThreadTask.status) {
          return false;
        }
        if (methodGuard != 45) {
          return false;
        }
        if (this.readerThreadTask.status != 1) {
          this.finalize();
          this.downloadStage = this.downloadStage + 1;
        }
        return false;
    }

    public final void run() {
        try {
            int bytesRead = 0;
            Object completionMonitorOrCaughtReadFailure = null;
            Object failureMonitor = null;
            Throwable unusedThrowableSnapshot = null;
            int clientControlSnapshot = 0;
            Throwable caughtReadFailure = null;
            clientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              while (this.downloadBuffer.position < this.downloadBuffer.bytes.length) {
                bytesRead = this.downloadStream.read(this.downloadBuffer.bytes, this.downloadBuffer.position, -this.downloadBuffer.position + this.downloadBuffer.bytes.length);
                if (0 <= bytesRead) {
                  this.downloadBuffer.position = this.downloadBuffer.position + bytesRead;
                  continue;
                }
                break;
              }
              if (this.downloadBuffer.bytes.length == this.downloadBuffer.position) {
                throw AsyncResourceDownloader.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.downloadBuffer.bytes.length + " " + this.resourceUrl));
              }
              completionMonitorOrCaughtReadFailure = this;
              synchronized (completionMonitorOrCaughtReadFailure) {
                this.finalize();
                this.downloadStage = 3;
              }
              return;
            } catch (java.lang.Exception readFailure) {
              caughtReadFailure = readFailure;
              completionMonitorOrCaughtReadFailure = (Exception) (Object) caughtReadFailure;
              failureMonitor = this;
              synchronized (failureMonitor) {
                this.finalize();
                this.downloadStage = this.downloadStage + 1;
              }
              return;
            }
        } catch (RuntimeException | Error uncheckedReaderFailure) {
            throw uncheckedReaderFailure;
        } catch (Throwable checkedReaderFailure) {
            throw new RuntimeException(checkedReaderFailure);
        }
    }

    final static void setGameMusicVolume(int methodGuard, int volumeLevel) {
        SpriteCheckboxRenderer.gameMusicVolumeLevel = volumeLevel;
        PasswordWidgetRenderer.gameMusicStream.setMasterVolume((int)((float)(64 * volumeLevel / 80) * 1.399999976158142f), (byte) 22);
        if (methodGuard != -15346) {
            AsyncResourceDownloader.setGameMusicVolume(-15, 68);
        }
    }

    AsyncResourceDownloader(PlatformTaskDispatcher taskDispatcher, java.net.URL resourceUrl, int bufferCapacity) {
        try {
            this.taskDispatcher = taskDispatcher;
            this.resourceUrl = resourceUrl;
            this.downloadBuffer = new ByteArrayBuffer(bufferCapacity);
        } catch (RuntimeException downloaderConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) downloaderConstructionFailure), "wg.<init>(" + (taskDispatcher != null ? "{...}" : "null") + ',' + (resourceUrl != null ? "{...}" : "null") + ',' + bufferCapacity + ')');
        }
    }

    static {
        minimumPasswordLength = 5;
        duplicateAppletStartCount = 0;
        tooltipShowDelayTicks = 50;
        textTemplateArgumentTypeFour = new TextTemplateArgumentType(4, 1, 1, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
