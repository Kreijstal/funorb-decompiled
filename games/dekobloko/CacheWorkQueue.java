/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheWorkQueue implements Runnable {
    static String stringState0263;
    private DualNodeDeque dualNodeDequeState0005;
    static boolean booleanState0079;
    static String stringState0264;
    static RgbSprite[] rgbSpriteArrayState0016;
    private Thread threadState0002;
    static String stringState0265;
    int integerState0333;
    private boolean booleanState0080;
    static String stringState0266;

    final void performAction0833(byte byteArgument1) {
        try {
          int integerLocal1 = 0;
          integerLocal1 = 53 % ((byteArgument1 + 50) / 38);
          this.booleanState0080 = true;
          synchronized (this.dualNodeDequeState0005) {
            this.dualNodeDequeState0005.notifyAll();
          }
          try {
            this.threadState0002.join();
          } catch (InterruptedException interruptedException) {
          }
          this.threadState0002 = null;
        } catch (RuntimeException | Error uncheckedExceptionLocal3) {
          throw uncheckedExceptionLocal3;
        } catch (Throwable checkedExceptionLocal4) {
          throw new RuntimeException(checkedExceptionLocal4);
        }
    }

    public static void performAction0835(int integerArgument1) {
        stringState0265 = null;
        if (integerArgument1 != 0) {
          return;
        }
        stringState0264 = null;
        stringState0263 = null;
        rgbSpriteArrayState0016 = null;
        stringState0266 = null;
    }

    final static void performAction0836(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4) {
        MixedSupport038.performAction0576(booleanArgument3, 10891);
        if (integerArgument1 < -87) {
          SceneWidgetPart002.performAction0619(integerArgument4, booleanArgument3, (byte) -126, integerArgument2);
          return;
        }
        stringState0266 = (String) null;
        SceneWidgetPart002.performAction0619(integerArgument4, booleanArgument3, (byte) -126, integerArgument2);
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int integerLocal2 = 0;
          ArchiveRequestManager archiveRequestManagerLocal3 = null;
          int regionSelectorLocal4 = 0;
          Throwable caughtExceptionLocal5 = null;
          Object objectLocal6 = null;
          Exception exceptionLocal7 = null;
          String stringLocal8 = null;
          integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          while (!this.booleanState0080) {
            objectLocal6 = this.dualNodeDequeState0005;
            synchronized (objectLocal6) {
              archiveRequestManagerLocal3 = (ArchiveRequestManager) (this.dualNodeDequeState0005.computeDualNode0029((byte) 79));
              if (archiveRequestManagerLocal3 != null) {
                this.integerState0333 = this.integerState0333 - 1;
                regionSelectorLocal4 = 1;
              } else {
                try {
                  this.dualNodeDequeState0005.wait();
                } catch (java.lang.InterruptedException caughtParameterLocal9) {
                  caughtExceptionLocal5 = caughtParameterLocal9;
                  interruptedException = (InterruptedException) (Object) caughtExceptionLocal5;
                }
                regionSelectorLocal4 = 0;
              }
            }
            if (regionSelectorLocal4 == 0) {
              continue;
            }
            try {
              if (2 == archiveRequestManagerLocal3.integerState0207) {
                archiveRequestManagerLocal3.mixedSupport073State0001.computeBoolean1015((byte) 43, archiveRequestManagerLocal3.byteArrayState0006, (int)archiveRequestManagerLocal3.longState0003, archiveRequestManagerLocal3.byteArrayState0006.length);
                archiveRequestManagerLocal3.booleanState0173 = false;
              } else {
                if (3 == archiveRequestManagerLocal3.integerState0207) {
                  archiveRequestManagerLocal3.byteArrayState0006 = archiveRequestManagerLocal3.mixedSupport073State0001.computeByteArray1018((int)archiveRequestManagerLocal3.longState0003, (byte) 117);
                  archiveRequestManagerLocal3.booleanState0173 = false;
                } else {
                  archiveRequestManagerLocal3.booleanState0173 = false;
                }
              }
            } catch (java.lang.Exception caughtParameterLocal10) {
              caughtExceptionLocal5 = caughtParameterLocal10;
              exceptionLocal7 = (Exception) (Object) caughtExceptionLocal5;
              stringLocal8 = (String) null;
              NetworkArchiveRequestManager.performAction1468((Throwable) ((Object) exceptionLocal7), 16408, (String) null);
              archiveRequestManagerLocal3.booleanState0173 = false;
            }
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    private final void performAction0834(byte byteArgument1, ArchiveRequestManager archiveRequestManagerArgument2) {
        synchronized (this.dualNodeDequeState0005) {
          int integerLocal1 = 78 % ((byteArgument1 + 34) / 50);
          this.dualNodeDequeState0005.performAction0032(archiveRequestManagerArgument2, -7267);
          this.integerState0333 = this.integerState0333 + 1;
          this.dualNodeDequeState0005.notifyAll();
        }
    }

    final static void performAction0837(int integerArgument1, String stringArgument2) {
        System.out.println("Error: " + HashNode.computeString0159(0, stringArgument2, "\n", "%0a"));
        if (integerArgument1 != 18239) {
          CacheWorkQueue.performAction0836(56, -121, true, -33);
        }
    }

    final ArchiveRequestManager computeArchiveRequestManager0838(int integerArgument1, MixedSupport073 mixedSupport073Argument2, byte byteArgument3) {
        ArchiveRequestManager archiveRequestManagerLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        ArchiveRequestManager stackArchiveRequestManagerLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          archiveRequestManagerLocal1 = new ArchiveRequestManager();
          archiveRequestManagerLocal1.booleanState0172 = false;
          archiveRequestManagerLocal1.integerState0207 = 3;
          if (byteArgument3 != 61) {
            stringLocal3 = (String) null;
            CacheWorkQueue.performAction0837(109, (String) null);
          }
          archiveRequestManagerLocal1.mixedSupport073State0001 = mixedSupport073Argument2;
          archiveRequestManagerLocal1.longState0003 = (long)integerArgument1;
          this.performAction0834((byte) -115, archiveRequestManagerLocal1);
          stackArchiveRequestManagerLocal4 = archiveRequestManagerLocal1;
          return stackArchiveRequestManagerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("im.B(").append(integerArgument1).append(',');
          if (mixedSupport073Argument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument3).append(')').toString());
        }
    }

    final ArchiveRequestManager computeArchiveRequestManager0840(int integerArgument1, MixedSupport073 mixedSupport073Argument2, byte[] byteArrayArgument3, byte byteArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        ArchiveRequestManager archiveRequestManagerLocal3 = null;
        ArchiveRequestManager stackArchiveRequestManagerLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          integerLocal1 = 63 / ((-8 - byteArgument4) / 56);
          archiveRequestManagerLocal3 = new ArchiveRequestManager();
          archiveRequestManagerLocal3.booleanState0172 = false;
          archiveRequestManagerLocal3.integerState0207 = 2;
          archiveRequestManagerLocal3.longState0003 = (long)integerArgument1;
          archiveRequestManagerLocal3.mixedSupport073State0001 = mixedSupport073Argument2;
          archiveRequestManagerLocal3.byteArrayState0006 = byteArrayArgument3;
          this.performAction0834((byte) -121, archiveRequestManagerLocal3);
          stackArchiveRequestManagerLocal4 = archiveRequestManagerLocal3;
          return stackArchiveRequestManagerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("im.A(").append(integerArgument1).append(',');
          if (mixedSupport073Argument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final ArchiveRequestManager computeArchiveRequestManager0839(int integerArgument1, MixedSupport073 mixedSupport073Argument2, int integerArgument3) {
        ArchiveRequestManager archiveRequestManagerLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        Object objectLocal3 = null;
        int integerLocal4 = 0;
        ArchiveRequestManager archiveRequestManagerLocal5 = null;
        int integerLocal6 = 0;
        ArchiveRequestManager stackArchiveRequestManagerLocal7 = null;
        ArchiveRequestManager stackArchiveRequestManagerLocal8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        Throwable caughtExceptionLocal12 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          archiveRequestManagerLocal1 = new ArchiveRequestManager();
          archiveRequestManagerLocal1.integerState0207 = 1;
          objectLocal3 = this.dualNodeDequeState0005;
          synchronized (objectLocal3) {
            archiveRequestManagerLocal5 = (ArchiveRequestManager) (this.dualNodeDequeState0005.computeDualNode0034(-2198));
            while (archiveRequestManagerLocal5 != null) {
              if (archiveRequestManagerLocal5.longState0003 == (long)integerArgument1 &&
                mixedSupport073Argument2 == archiveRequestManagerLocal5.mixedSupport073State0001 &&
                2 == archiveRequestManagerLocal5.integerState0207) {
                archiveRequestManagerLocal1.byteArrayState0006 = archiveRequestManagerLocal5.byteArrayState0006;
                archiveRequestManagerLocal1.booleanState0173 = false;
                stackArchiveRequestManagerLocal7 = archiveRequestManagerLocal1;
                return stackArchiveRequestManagerLocal7;
              }
              archiveRequestManagerLocal5 = (ArchiveRequestManager) (this.dualNodeDequeState0005.computeDualNode0033((byte) 20));
            }
          }
          integerLocal4 = 84 % ((integerArgument3 - 77) / 46);
          archiveRequestManagerLocal1.byteArrayState0006 = mixedSupport073Argument2.computeByteArray1018(integerArgument1, (byte) 49);
          archiveRequestManagerLocal1.booleanState0173 = false;
          archiveRequestManagerLocal1.booleanState0172 = true;
          stackArchiveRequestManagerLocal8 = archiveRequestManagerLocal1;
          return stackArchiveRequestManagerLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = (RuntimeException) (Object) caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal2;
          stackStringBuilderLocal10 = new StringBuilder().append("im.D(").append(integerArgument1).append(',');
          if (mixedSupport073Argument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument3).append(')').toString());
        }
    }

    CacheWorkQueue(PlatformService platformServiceArgument1) {
        AsyncTask asyncTaskLocal1 = null;
        this.dualNodeDequeState0005 = new DualNodeDeque();
        this.integerState0333 = 0;
        this.booleanState0080 = false;
        try {
          asyncTaskLocal1 = platformServiceArgument1.computeAsyncTask0563((byte) -104, 5, (Runnable) (this));
          while (0 == asyncTaskLocal1.integerState0510) {
            MixedSupport132.performAction1837(10L, -128);
          }
          if (asyncTaskLocal1.integerState0510 == 2) {
            throw new RuntimeException();
          }
          this.threadState0002 = (Thread) (asyncTaskLocal1.objectState0004);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "im.<init>(" + (platformServiceArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0263 = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        stringState0266 = "From <%0>: ";
        stringState0265 = "Options Menu";
        stringState0264 = "Exploiting a bug";
    }
}
