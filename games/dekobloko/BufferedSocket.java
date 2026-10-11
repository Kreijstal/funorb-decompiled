/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    private PlatformService platformServiceState0006;
    static int integerState0661;
    private InputStream inputStreamState0001;
    private boolean booleanState0154;
    static int integerState0662;
    private int integerState0663;
    private AsyncTask asyncTaskState0009;
    static int integerState0664;
    static int integerState0665;
    private java.net.Socket socketState0001;
    private int integerState0666;
    private boolean booleanState0155;
    private OutputStream outputStreamState0001;
    static String[] stringArrayState0035;
    static int integerState0667;
    private byte[] byteArrayState0025;
    static int integerState0668;
    static String[] stringArrayState0036;
    private int integerState0669;

    final void performAction1557(int integerArgument1, int integerArgument2, int integerArgument3, byte[] byteArrayArgument4) throws IOException {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        Throwable caughtExceptionLocal5 = null;
        Object objectLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.booleanState0154) {
            return;
          }
          if (integerArgument3 != 1) {
            stringArrayState0035 = (String[]) null;
          }
          if (this.booleanState0155) {
            this.booleanState0155 = false;
            throw new IOException();
          }
          if (this.byteArrayState0025 == null) {
            this.byteArrayState0025 = new byte[this.integerState0663];
          }
          objectLocal6 = this;
          synchronized (objectLocal6) {
            for (integerLocal1 = 0; integerLocal1 < integerArgument2; integerLocal1++) {
              this.byteArrayState0025[this.integerState0669] = byteArrayArgument4[integerArgument1 + integerLocal1];
              this.integerState0669 = (1 + this.integerState0669) % this.integerState0663;
              if (this.integerState0669 == (this.integerState0663 + this.integerState0666 - 100) % this.integerState0663) {
                throw new IOException();
              }
            }
            if (null == this.asyncTaskState0009) {
              this.asyncTaskState0009 = this.platformServiceState0006.computeAsyncTask0563((byte) -45, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("qk.G(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (byteArrayArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final int computeInteger1561(byte byteArgument1) throws IOException {
        if (this.booleanState0154) {
          return 0;
        }
        int integerLocal1 = -99 % ((-44 - byteArgument1) / 41);
        return this.inputStreamState0001.read();
    }

    final static String computeString1563(byte byteArgument1) {
        int integerLocal1 = 0;
        String stringLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        String stringLocal6;
        String stringLocal7;
        String stringLocal8;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        stringLocal6 = "(" + UiComponentPart017.integerState0438 + " " + GameDomainSupport001.integerState0051 + " " + ComponentContainer.integerState0378 + ") " + HashNode.integerState0070;
        stringLocal2 = stringLocal6;
        if (byteArgument1 < 14) {
          return (String) null;
        }
        if (NetworkSupport012.integerState0759 > 0) {
          stringLocal2 = stringLocal6 + ":";
          for (integerLocal1 = 0; integerLocal1 < NetworkSupport012.integerState0759; integerLocal1++) {
            stringLocal7 = stringLocal2 + ' ';
            integerLocal3 = UiComponentPart006.cipherPacketBufferState0001.payload[integerLocal1] & 255;
            integerLocal4 = integerLocal3 >> 4;
            if (integerLocal4 >= 10) {
              integerLocal4 += 55;
            } else {
              integerLocal4 += 48;
            }
            integerLocal3 = integerLocal3 & 15;
            stringLocal8 = stringLocal7 + (char)integerLocal4;
            if (integerLocal3 >= 10) {
              integerLocal3 += 55;
            } else {
              integerLocal3 += 48;
            }
            stringLocal2 = stringLocal8 + (char)integerLocal3;
          }
        }
        return stringLocal2;
    }

    final void performAction1555(int integerArgument1) {
        try {
          int integerLocal1 = 0;
          integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          if (this.booleanState0154) {
            return;
          }
          synchronized (this) {
            this.booleanState0154 = true;
            this.notifyAll();
          }
          if (integerArgument1 != 0) {
            return;
          }
          if (null != this.asyncTaskState0009) {
            while (this.asyncTaskState0009.integerState0510 == 0) {
              MixedSupport132.performAction1837(1L, integerArgument1 ^ -128);
            }
            if (1 == this.asyncTaskState0009.integerState0510) {
              try {
                ((Thread) (this.asyncTaskState0009.objectState0004)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.asyncTaskState0009 = null;
        } catch (RuntimeException | Error uncheckedExceptionLocal3) {
          throw uncheckedExceptionLocal3;
        } catch (Throwable checkedExceptionLocal4) {
          throw new RuntimeException(checkedExceptionLocal4);
        }
    }

    public final void run() {
        try {
          int regionSelectorLocal1 = 0;
          Throwable caughtExceptionLocal2 = null;
          int integerLocal3 = 0;
          IOException iOExceptionLocal4 = null;
          Exception exceptionLocal5 = null;
          int integerLocal6 = 0;
          Object objectLocal7 = null;
          IOException iOExceptionLocal8 = null;
          InterruptedException interruptedExceptionLocal9 = null;
          int integerLocal10 = 0;
          String stringLocal11 = null;
          integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            while (true) {
              objectLocal7 = this;
              synchronized (objectLocal7) {
                boolean frameRemainderLocal12 = true;
                if (this.integerState0669 == this.integerState0666) {
                  if (this.booleanState0154) {
                    regionSelectorLocal1 = 0;
                    frameRemainderLocal12 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException caughtParameterLocal13) {
                      caughtExceptionLocal2 = caughtParameterLocal13;
                      interruptedExceptionLocal9 = (InterruptedException) (Object) caughtExceptionLocal2;
                    }
                  }
                }
                if (frameRemainderLocal12) {
                  integerLocal6 = this.integerState0666;
                  if (this.integerState0666 > this.integerState0669) {
                    integerLocal3 = this.integerState0663 - this.integerState0666;
                  } else {
                    integerLocal3 = this.integerState0669 - this.integerState0666;
                  }
                  regionSelectorLocal1 = 1;
                }
              }
              if (regionSelectorLocal1 == 0) {
                try {
                  if (null != this.inputStreamState0001) {
                    this.inputStreamState0001.close();
                  }
                  if (null != this.outputStreamState0001) {
                    this.outputStreamState0001.close();
                  }
                  if (null != this.socketState0001) {
                    this.socketState0001.close();
                  }
                } catch (java.io.IOException caughtParameterLocal14) {
                  caughtExceptionLocal2 = caughtParameterLocal14;
                  iOExceptionLocal4 = (IOException) (Object) caughtExceptionLocal2;
                }
                this.byteArrayState0025 = null;
                break;
              }
              if (integerLocal3 <= 0) {
                continue;
              }
              try {
                this.outputStreamState0001.write(this.byteArrayState0025, integerLocal6, integerLocal3);
              } catch (java.io.IOException caughtParameterLocal15) {
                caughtExceptionLocal2 = caughtParameterLocal15;
                iOExceptionLocal8 = (IOException) (Object) caughtExceptionLocal2;
                this.booleanState0155 = true;
              }
              this.integerState0666 = (integerLocal3 + this.integerState0666) % this.integerState0663;
              try {
                if (this.integerState0669 == this.integerState0666) {
                  this.outputStreamState0001.flush();
                }
              } catch (java.io.IOException caughtParameterLocal16) {
                caughtExceptionLocal2 = caughtParameterLocal16;
                iOExceptionLocal8 = (IOException) (Object) caughtExceptionLocal2;
                this.booleanState0155 = true;
              }
            }
          } catch (java.lang.Exception caughtParameterLocal17) {
            caughtExceptionLocal2 = caughtParameterLocal17;
            exceptionLocal5 = (Exception) (Object) caughtExceptionLocal2;
            stringLocal11 = (String) null;
            NetworkArchiveRequestManager.performAction1468((Throwable) ((Object) exceptionLocal5), 16408, (String) null);
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal18) {
          throw uncheckedExceptionLocal18;
        } catch (Throwable checkedExceptionLocal19) {
          throw new RuntimeException(checkedExceptionLocal19);
        }
    }

    protected final void finalize() {
        this.performAction1555(0);
    }

    final static Object computeObject1558(byte[] byteArrayArgument1, int integerArgument2, boolean booleanArgument3) {
        MixedSupport044 mixedSupport044Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        MixedSupport044 stackMixedSupport044Local3 = null;
        byte[] stackByteArrayLocal4 = null;
        byte[] stackByteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (byteArrayArgument1 == null) {
            return null;
          }
          if (136 < byteArrayArgument1.length) {
            mixedSupport044Local1 = new MixedSupport044();
            ((MixedSupport086) ((Object) mixedSupport044Local1)).performAction0607(byteArrayArgument1, true);
            stackMixedSupport044Local3 = mixedSupport044Local1;
            return stackMixedSupport044Local3;
          }
          if (integerArgument2 != -1389597532) {
            integerState0667 = 67;
          }
          if (!booleanArgument3) {
            stackByteArrayLocal5 = (byte[]) (byteArrayArgument1);
            return stackByteArrayLocal5;
          }
          stackByteArrayLocal4 = SceneWidgetPart006.computeByteArray0873(0, byteArrayArgument1);
          return stackByteArrayLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("qk.E(");
          if (byteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final int computeInteger1560(int integerArgument1) throws IOException {
        if (this.booleanState0154) {
          return 0;
        }
        if (integerArgument1 != 0) {
          return -106;
        }
        return this.inputStreamState0001.available();
    }

    public static void performAction1562(int integerArgument1) {
        stringArrayState0036 = null;
        if (integerArgument1 != -11657) {
          return;
        }
        stringArrayState0035 = null;
    }

    final void performAction1556(int integerArgument1, int integerArgument2, byte byteArgument3, byte[] byteArrayArgument4) throws IOException {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.booleanState0154) {
            return;
          }
          while (integerArgument1 > 0) {
            integerLocal1 = this.inputStreamState0001.read(byteArrayArgument4, integerArgument2, integerArgument1);
            if (0 >= integerLocal1) {
              throw new EOFException();
            }
            integerArgument2 = integerArgument2 + integerLocal1;
            integerArgument1 = integerArgument1 - integerLocal1;
          }
          if (byteArgument3 != 17) {
            this.performAction1555(31);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("qk.I(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(byteArgument3).append(',');
          if (byteArrayArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final void performAction1559(byte byteArgument1) throws IOException {
        if (this.booleanState0154) {
          return;
        }
        if (byteArgument1 > -21) {
          return;
        }
        if (this.booleanState0155) {
          this.booleanState0155 = false;
          throw new IOException();
        }
    }

    BufferedSocket(java.net.Socket socketArgument1, PlatformService platformServiceArgument2) throws IOException {
        this(socketArgument1, platformServiceArgument2, 5000);
    }

    final static void performAction1554(byte byteArgument1) {
        UiComponentPart008.stringBuilderState0001.setLength(0);
        NetworkSupport010.integerState0585 = 0;
        if (byteArgument1 != 94) {
          integerState0661 = -4;
        }
    }

    private BufferedSocket(java.net.Socket socketArgument1, PlatformService platformServiceArgument2, int integerArgument3) throws IOException {
        this.booleanState0154 = false;
        this.booleanState0155 = false;
        this.integerState0666 = 0;
        this.integerState0669 = 0;
        try {
          this.platformServiceState0006 = platformServiceArgument2;
          this.socketState0001 = socketArgument1;
          this.socketState0001.setSoTimeout(30000);
          this.socketState0001.setTcpNoDelay(true);
          this.inputStreamState0001 = this.socketState0001.getInputStream();
          this.outputStreamState0001 = this.socketState0001.getOutputStream();
          this.integerState0663 = integerArgument3;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qk.<init>(" + (socketArgument1 != null ? "{...}" : "null") + ',' + (platformServiceArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    static {
        stringArrayState0035 = new String[]{"Deko Bloko", "Double Deko", "Triple Deko", "Mega Deko", "Double Bloko", "Triple Bloko", "Mini Bombo", "Maxi Bombo", "Tower Bloko", "Massive Attako", "Clean Sweepo", "Uh-Oh Bloko", "Floral Bloko", "Urban Bloko", "Retro Bloko", "Bronze Blokker", "Silver Blokker", "Gold Blokker", "Blok of Beginning", "Blok of Victory", "Blok of Supremacy", "Deko Pwnage", "Ultimate Pwnage", "Quick Deko", "Safe Deko", "Deko Modo", "Shape Mover", "Shape Sender", "Shape Dispatcher", "Shape Consigner", "Shape Shifter"};
        stringArrayState0036 = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
