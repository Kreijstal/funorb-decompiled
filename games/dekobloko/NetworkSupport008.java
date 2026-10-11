/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NetworkSupport008 implements Runnable {
    static int integerState0558;
    static SceneWidget sceneWidgetState0093;
    private java.net.URL uRLState0001;
    private AsyncTask asyncTaskState0006;
    private DataInputStream dataInputStreamState0001;
    private int integerState0559;
    private PacketBuffer packetBufferState0006;
    static char[] characterArrayState0007;
    private PlatformService platformServiceState0005;
    static boolean booleanState0129;
    private AsyncTask asyncTaskState0007;
    static RgbSprite rgbSpriteState0037;
    static SceneWidget sceneWidgetState0094;
    static int[] integerArrayState0176;
    private AsyncTask asyncTaskState0008;

    final PacketBuffer computePacketBuffer1345(boolean booleanArgument1) {
        if (3 == this.integerState0559) {
          return this.packetBufferState0006;
        }
        if (!booleanArgument1) {
          return null;
        }
        this.integerState0559 = -68;
        return null;
    }

    final synchronized boolean computeBoolean1342(int integerArgument1) {
        Throwable caughtExceptionLocal1 = null;
        IOException iOExceptionLocal2 = null;
        OutputStream outputStreamLocal3 = null;
        java.net.Socket socketLocal4 = null;
        CharSequence charSequenceLocal5 = null;
        if (2 <= this.integerState0559) {
          return true;
        }
        boolean frameRemainderLocal6 = true;
        if (this.integerState0559 == 0) {
          if (null == this.asyncTaskState0008) {
            this.asyncTaskState0008 = this.platformServiceState0005.computeAsyncTask0571(this.uRLState0001, (byte) 66);
          }
          if (this.asyncTaskState0008.integerState0510 == 0) {
            return false;
          }
          if (this.asyncTaskState0008.integerState0510 != 1) {
            this.asyncTaskState0008 = null;
            frameRemainderLocal6 = false;
          }
        }
        if (frameRemainderLocal6) {
          if (this.integerState0559 == 1) {
            if (this.asyncTaskState0006 == null) {
              this.asyncTaskState0006 = this.platformServiceState0005.computeAsyncTask0568(100, this.uRLState0001.getHost(), 443);
            }
            if (this.asyncTaskState0006.integerState0510 == 0) {
              return false;
            }
            if (1 != this.asyncTaskState0006.integerState0510) {
              this.integerState0559 = this.integerState0559 + 1;
              this.asyncTaskState0006 = null;
              return false;
            }
          }
          if (null == this.dataInputStreamState0001) {
            try {
              if (0 == this.integerState0559) {
                this.dataInputStreamState0001 = (DataInputStream) (this.asyncTaskState0008.objectState0004);
              }
              if (this.integerState0559 == 1) {
                socketLocal4 = (java.net.Socket) (this.asyncTaskState0006.objectState0004);
                socketLocal4.setSoTimeout(10000);
                outputStreamLocal3 = socketLocal4.getOutputStream();
                outputStreamLocal3.write(17);
                charSequenceLocal5 = (CharSequence) ((Object) ("JAGGRAB " + this.uRLState0001.getFile() + "\n\n"));
                outputStreamLocal3.write(SceneWidgetNode.computeByteArray1035(6216, charSequenceLocal5));
                this.dataInputStreamState0001 = new DataInputStream(socketLocal4.getInputStream());
              }
              this.packetBufferState0006.position = 0;
            } catch (java.io.IOException caughtParameterLocal7) {
              caughtExceptionLocal1 = caughtParameterLocal7;
              iOExceptionLocal2 = (IOException) (Object) caughtExceptionLocal1;
              this.finalize();
              this.integerState0559 = this.integerState0559 + 1;
            }
          }
          if (integerArgument1 >= -89) {
            this.computePacketBuffer1345(true);
          }
          if (null == this.asyncTaskState0007) {
            this.asyncTaskState0007 = this.platformServiceState0005.computeAsyncTask0563((byte) 121, 5, (Runnable) (this));
          }
          if (0 == this.asyncTaskState0007.integerState0510) {
            return false;
          }
          if (this.asyncTaskState0007.integerState0510 == 1) {
            return false;
          }
          this.finalize();
        }
        this.integerState0559 = this.integerState0559 + 1;
        return false;
    }

    final static byte[] computeByteArray1343(String stringArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stringLocal2 = null;
        byte[] stackByteArrayLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 != -15192) {
            stringLocal2 = (String) null;
            NetworkSupport008.computeMusicTrack1344((ResourceArchive) null, -55, (String) null, (NetworkSupport011) null, (String) null);
          }
          stackByteArrayLocal3 = Sprite.resourceArchiveState0010.computeByteArray0916(0, stringArgument1, "");
          return stackByteArrayLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("oh.B(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public final void run() {
        try {
          int integerLocal1 = 0;
          Object objectLocal2 = null;
          Object objectLocal3 = null;
          Throwable throwableLocal4 = null;
          int integerLocal5 = 0;
          Throwable caughtExceptionLocal6 = null;
          integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            while (this.packetBufferState0006.position < this.packetBufferState0006.payload.length) {
              integerLocal1 = this.dataInputStreamState0001.read(this.packetBufferState0006.payload, this.packetBufferState0006.position, -this.packetBufferState0006.position + this.packetBufferState0006.payload.length);
              if (integerLocal1 >= 0) {
                this.packetBufferState0006.position = this.packetBufferState0006.position + integerLocal1;
                continue;
              }
              break;
            }
            if (this.packetBufferState0006.payload.length == this.packetBufferState0006.position) {
              throw NetworkSupport008.<RuntimeException>computeRuntimeException1340(new Exception("HG1: " + this.packetBufferState0006.payload.length + " " + this.uRLState0001));
            }
            objectLocal2 = this;
            synchronized (objectLocal2) {
              this.finalize();
              this.integerState0559 = 3;
            }
            return;
          } catch (java.lang.Exception caughtParameterLocal7) {
            caughtExceptionLocal6 = caughtParameterLocal7;
            objectLocal2 = (Exception) (Object) caughtExceptionLocal6;
            objectLocal3 = this;
            synchronized (objectLocal3) {
              this.finalize();
              this.integerState0559 = this.integerState0559 + 1;
            }
            return;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal8) {
          throw uncheckedExceptionLocal8;
        } catch (Throwable checkedExceptionLocal9) {
          throw new RuntimeException(checkedExceptionLocal9);
        }
    }

    public static void performAction1346(boolean booleanArgument1) {
        rgbSpriteState0037 = null;
        integerArrayState0176 = null;
        sceneWidgetState0093 = null;
        if (booleanArgument1) {
          return;
        }
        characterArrayState0007 = null;
        sceneWidgetState0094 = null;
    }

    final static void performAction1341(byte byteArgument1) {
        if (byteArgument1 != 13) {
          String stringLocal1 = (String) null;
          NetworkSupport008.computeByteArray1343((String) null, -97);
        }
    }

    protected final void finalize() {
        if (null != this.asyncTaskState0008) {
          if (this.asyncTaskState0008.objectState0004 != null) {
            try {
              ((DataInputStream) (this.asyncTaskState0008.objectState0004)).close();
            } catch (Exception exception) {
            }
          }
          this.asyncTaskState0008 = null;
        }
        if (this.asyncTaskState0006 != null) {
          if (this.asyncTaskState0006.objectState0004 != null) {
            try {
              ((java.net.Socket) (this.asyncTaskState0006.objectState0004)).close();
            } catch (Exception exception) {
            }
          }
          this.asyncTaskState0006 = null;
        }
        if (this.dataInputStreamState0001 != null) {
          try {
            this.dataInputStreamState0001.close();
          } catch (Exception exception) {
          }
          this.dataInputStreamState0001 = null;
        }
        this.asyncTaskState0007 = null;
    }

    final static MusicTrack computeMusicTrack1344(ResourceArchive resourceArchiveArgument1, int integerArgument2, String stringArgument3, NetworkSupport011 networkSupport011Argument4, String stringArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        MusicTrack stackMusicTrackLocal4 = null;
        MusicTrack stackMusicTrackLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        try {
          if (integerArgument2 != 91) {
            stackMusicTrackLocal4 = (MusicTrack) null;
            return stackMusicTrackLocal4;
          }
          integerLocal1 = resourceArchiveArgument1.computeInteger0926(integerArgument2 - 92, stringArgument3);
          integerLocal3 = resourceArchiveArgument1.computeInteger0913(integerLocal1, integerArgument2 + 12939, stringArgument5);
          stackMusicTrackLocal5 = LoginCredentials.computeMusicTrack0897(true, networkSupport011Argument4, integerLocal3, integerLocal1, resourceArchiveArgument1);
          return stackMusicTrackLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal15 = caughtParameterLocal16;
          runtimeExceptionLocal2 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("oh.C(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (networkSupport011Argument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',');
          if (stringArgument5 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(')').toString());
        }
    }

    NetworkSupport008(PlatformService platformServiceArgument1, java.net.URL uRLArgument2, int integerArgument3) {
        try {
          this.uRLState0001 = uRLArgument2;
          this.platformServiceState0005 = platformServiceArgument1;
          this.packetBufferState0006 = new PacketBuffer(integerArgument3);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oh.<init>(" + (platformServiceArgument1 != null ? "{...}" : "null") + ',' + (uRLArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    static {
        integerState0558 = 64;
        booleanState0129 = false;
        characterArrayState0007 = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException computeRuntimeException1340(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
