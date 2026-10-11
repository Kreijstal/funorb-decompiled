/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformService implements Runnable {
    static String stringState0168;
    java.awt.EventQueue eventQueueState0001;
    private PlatformSupport001 platformSupport001State0001;
    private static int integerState0223;
    private AsyncTask asyncTaskState0002;
    private Object objectState0001;
    private static volatile long longState0016;
    boolean booleanState0043;
    PlatformSupport004 platformSupport004State0001;
    private static String stringState0169;
    static String stringState0170;
    PlatformSupport004[] platformSupport004ArrayState0001;
    private Thread threadState0001;
    private AsyncTask asyncTaskState0003;
    private boolean booleanState0044;
    private boolean booleanState0045;
    static String stringState0171;
    static java.lang.reflect.Method methodState0001;
    private Object objectState0002;
    private static String stringState0172;
    PlatformSupport004 platformSupport004State0002;
    private static String stringState0173;
    private PlatformSupport003 platformSupport003State0001;
    PlatformSupport004 platformSupport004State0003;

    final AsyncTask computeAsyncTask0562(byte byteArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (byteArgument1 <= 39) {
          this.platformSupport001State0001 = (PlatformSupport001) null;
        }
        return this.computeAsyncTask0566(integerArgument5 + (integerArgument3 << 16), 1, (Object) null, 6, (integerArgument4 << 16) + integerArgument2);
    }

    final AsyncTask computeAsyncTask0568(int integerArgument1, String stringArgument2, int integerArgument3) {
        AsyncTask discarded$0 = null;
        if (integerArgument1 <= 98) {
          String stringLocal2 = (String) null;
          discarded$0 = this.computeAsyncTask0570(12, true, -60, (String) null);
        }
        return this.computeAsyncTask0570(integerArgument3, false, -10742, stringArgument2);
    }

    final void performAction0565(int integerArgument1) {
        try {
          int integerLocal1 = 0;
          Throwable caughtExceptionLocal2 = null;
          Object objectLocal3 = null;
          InterruptedException interruptedExceptionLocal4 = null;
          IOException iOExceptionLocal5 = null;
          IOException iOExceptionLocal6 = null;
          objectLocal3 = this;
          synchronized (objectLocal3) {
            this.booleanState0045 = true;
            this.notifyAll();
          }
          try {
            this.threadState0001.join();
            if (integerArgument1 != 0) {
              this.performAction0565(-106);
            }
          } catch (java.lang.InterruptedException caughtParameterLocal7) {
            caughtExceptionLocal2 = caughtParameterLocal7;
            interruptedExceptionLocal4 = (InterruptedException) (Object) caughtExceptionLocal2;
          }
          if (this.platformSupport004State0001 != null) {
            try {
              this.platformSupport004State0001.performAction0700(-72);
            } catch (java.io.IOException caughtParameterLocal8) {
              caughtExceptionLocal2 = caughtParameterLocal8;
              iOExceptionLocal5 = (IOException) (Object) caughtExceptionLocal2;
            }
          }
          if (null != this.platformSupport004State0003) {
            try {
              this.platformSupport004State0003.performAction0700(integerArgument1 - 55);
            } catch (java.io.IOException caughtParameterLocal9) {
              caughtExceptionLocal2 = caughtParameterLocal9;
              iOExceptionLocal5 = (IOException) (Object) caughtExceptionLocal2;
            }
          }
          if (null != this.platformSupport004ArrayState0001) {
            for (integerLocal1 = 0; integerLocal1 < this.platformSupport004ArrayState0001.length; integerLocal1++) {
              if (null != this.platformSupport004ArrayState0001[integerLocal1]) {
                try {
                  this.platformSupport004ArrayState0001[integerLocal1].performAction0700(integerArgument1 ^ -71);
                } catch (java.io.IOException caughtParameterLocal10) {
                  caughtExceptionLocal2 = caughtParameterLocal10;
                  iOExceptionLocal6 = (IOException) (Object) caughtExceptionLocal2;
                }
              }
            }
          }
          if (this.platformSupport004State0002 != null) {
            try {
              this.platformSupport004State0002.performAction0700(-72);
            } catch (java.io.IOException caughtParameterLocal11) {
              caughtExceptionLocal2 = caughtParameterLocal11;
              iOExceptionLocal5 = (IOException) (Object) caughtExceptionLocal2;
            }
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal12) {
          throw uncheckedExceptionLocal12;
        } catch (Throwable checkedExceptionLocal13) {
          throw new RuntimeException(checkedExceptionLocal13);
        }
    }

    final AsyncTask computeAsyncTask0572(boolean booleanArgument1, String stringArgument2, Class classArgument3) {
        if (booleanArgument1) {
          return (AsyncTask) null;
        }
        return this.computeAsyncTask0566(0, 1, new Object[]{classArgument3, stringArgument2}, 9, 0);
    }

    private final AsyncTask computeAsyncTask0570(int integerArgument1, boolean booleanArgument2, int integerArgument3, String stringArgument4) {
        if (integerArgument3 != -10742) {
          this.asyncTaskState0002 = (AsyncTask) null;
        }
        return this.computeAsyncTask0566(0, 1, stringArgument4, booleanArgument2 ? 22 : 1, integerArgument1);
    }

    final boolean computeBoolean0573(int integerArgument1) {
        if (integerArgument1 != -86) {
          return false;
        }
        if (!this.booleanState0043) {
          return false;
        }
        if (this.booleanState0044) {
          return null != this.platformSupport003State0001 ? true : false;
        }
        return this.objectState0001 != null ? true : false;
    }

    final AsyncTask computeAsyncTask0569(int integerArgument1, String stringArgument2, Class classArgument3, Class[] classArrayArgument4) {
        if (integerArgument1 != -10962) {
          methodState0001 = (java.lang.reflect.Method) null;
        }
        return this.computeAsyncTask0566(0, integerArgument1 ^ -10961, new Object[]{classArgument3, stringArgument2, classArrayArgument4}, 8, 0);
    }

    private final static PlatformSupport004 computePlatformSupport0040564(byte byteArgument1, String stringArgument2, String stringArgument3, int integerArgument4) {
        try {
          int integerLocal1 = 0;
          PlatformSupport004 stackPlatformSupport004Local2 = null;
          Throwable caughtExceptionLocal3 = null;
          String stringLocal4 = null;
          String[] stringArrayLocal5 = null;
          String stringLocal6 = null;
          PlatformSupport004 platformSupport004Local7 = null;
          Exception exceptionLocal8 = null;
          if (33 == integerArgument4) {
            stringLocal4 = "jagex_" + stringArgument2 + "_preferences" + stringArgument3 + "_rc.dat";
          } else {
            if (integerArgument4 == 34) {
              stringLocal4 = "jagex_" + stringArgument2 + "_preferences" + stringArgument3 + "_wip.dat";
            } else {
              stringLocal4 = "jagex_" + stringArgument2 + "_preferences" + stringArgument3 + ".dat";
            }
          }
          stringArrayLocal5 = new String[]{"c:/rscache/", "/rscache/", stringState0172, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (byteArgument1 != -32) {
            return (PlatformSupport004) null;
          }
          for (integerLocal1 = 0; stringArrayLocal5.length > integerLocal1; integerLocal1++) {
            stringLocal6 = stringArrayLocal5[integerLocal1];
            if (!(stringLocal6.length() > 0) ||
              new File(stringLocal6).exists()) {
              try {
                platformSupport004Local7 = new PlatformSupport004(new File(stringLocal6, stringLocal4), "rw", 10000L);
                stackPlatformSupport004Local2 = platformSupport004Local7;
                return stackPlatformSupport004Local2;
              } catch (java.lang.Exception caughtParameterLocal9) {
                caughtExceptionLocal3 = caughtParameterLocal9;
                exceptionLocal8 = (Exception) (Object) caughtExceptionLocal3;
              }
            }
          }
          return null;
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    final AsyncTask computeAsyncTask0567(int integerArgument1, java.awt.Frame frameArgument2) {
        if (integerArgument1 != 75254128) {
          return (AsyncTask) null;
        }
        return this.computeAsyncTask0566(0, 1, frameArgument2, 7, 0);
    }

    public final void run() {
        try {
          int integerLocal1 = 0;
          int stackIntegerLocal2 = 0;
          Throwable caughtExceptionLocal3 = null;
          Object objectLocal4 = null;
          int integerLocal5 = 0;
          ThreadDeath threadDeathLocal6 = null;
          Throwable throwableLocal7 = null;
          InterruptedException interruptedExceptionLocal8 = null;
          PlatformSupport004 platformSupport004Local9 = null;
          int integerLocal10 = 0;
          Exception exceptionLocal11 = null;
          DiagnosticSupport001 diagnosticSupport001Local12 = null;
          int integerLocal13 = 0;
          String stringLocal14 = null;
          java.awt.datatransfer.Transferable transferableLocal15 = null;
          AsyncTask asyncTaskLocal16 = null;
          Object[] objectArrayLocal17 = null;
          Object[] objectArrayLocal18 = null;
          java.awt.datatransfer.Clipboard clipboardLocal19 = null;
          java.awt.datatransfer.Clipboard clipboardLocal20 = null;
          String stringLocal21 = null;
          java.awt.Frame frameLocal22 = null;
          Object[] objectArrayLocal23 = null;
          Object objectLocal24 = null;
          String stringLocal25 = null;
          Object objectLocal26 = null;
          java.awt.Component componentLocal27 = null;
          Thread threadLocal28 = null;
          objectLocal24 = null;
          objectLocal26 = null;
          while (true) {
            objectLocal4 = this;
            synchronized (objectLocal4) {
              boolean frameCompletedLocal29 = true;
              while (!this.booleanState0045) {
                if (this.asyncTaskState0002 != null) {
                  asyncTaskLocal16 = this.asyncTaskState0002;
                  this.asyncTaskState0002 = this.asyncTaskState0002.asyncTaskState0005;
                  if (null == this.asyncTaskState0002) {
                    this.asyncTaskState0003 = null;
                  }
                  frameCompletedLocal29 = false;
                  break;
                }
                try {
                  this.wait();
                } catch (java.lang.InterruptedException caughtParameterLocal30) {
                  caughtExceptionLocal3 = caughtParameterLocal30;
                  interruptedExceptionLocal8 = (InterruptedException) (Object) caughtExceptionLocal3;
                }
              }
              if (frameCompletedLocal29) {
                return;
              }
            }
            try {
              {
                integerLocal5 = asyncTaskLocal16.integerState0511;
                switch (integerLocal5) {
                  case 1:
                    if (MixedSupport063.computeLong0827(4) < longState0016) {
                      throw new IOException();
                    }
                    asyncTaskLocal16.objectState0004 = new java.net.Socket(java.net.InetAddress.getByName((String) (asyncTaskLocal16.objectState0003)), asyncTaskLocal16.integerState0509);
                    break;
                  case 2:
                    threadLocal28 = new Thread((Runnable) (asyncTaskLocal16.objectState0003));
                    threadLocal28.setDaemon(true);
                    threadLocal28.start();
                    threadLocal28.setPriority(asyncTaskLocal16.integerState0509);
                    asyncTaskLocal16.objectState0004 = threadLocal28;
                    break;
                  case 4:
                    if (longState0016 > MixedSupport063.computeLong0827(4)) {
                      throw new IOException();
                    }
                    asyncTaskLocal16.objectState0004 = new DataInputStream(((java.net.URL) (asyncTaskLocal16.objectState0003)).openStream());
                    break;
                  case 16:
                  default:
                    if (!this.booleanState0043) {
                      throw PlatformService.<RuntimeException>computeRuntimeException0560(new Exception(""));
                    }
                    switch (integerLocal5) {
                      case 21:
                        if (longState0016 > MixedSupport063.computeLong0827(4)) {
                          throw new IOException();
                        }
                        asyncTaskLocal16.objectState0004 = java.net.InetAddress.getByName((String) (asyncTaskLocal16.objectState0003)).getAddress();
                        break;
                      case 12:
                        platformSupport004Local9 = PlatformService.computePlatformSupport0040564((byte) -32, stringState0173, (String) (asyncTaskLocal16.objectState0003), integerState0223);
                        asyncTaskLocal16.objectState0004 = platformSupport004Local9;
                        break;
                      case 16:
                      default:
                        if (this.booleanState0043 &&
                          integerLocal5 == 14) {
                          integerLocal10 = asyncTaskLocal16.integerState0509;
                          integerLocal13 = asyncTaskLocal16.integerState0508;
                          if (this.booleanState0044) {
                            this.platformSupport001State0001.performAction0050(integerLocal10, integerLocal13, (byte) -98);
                          } else {
                            Class.forName("RenderingSupport005").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.objectState0002, new Object[]{new Integer(integerLocal10), new Integer(integerLocal13)});
                          }
                          break;
                        }
                        if (this.booleanState0043 &&
                          15 == integerLocal5) {
                          stackIntegerLocal2 = (asyncTaskLocal16.integerState0509 == 0) ? 0 : 1;
                          integerLocal10 = stackIntegerLocal2;
                          componentLocal27 = (java.awt.Component) (asyncTaskLocal16.objectState0003);
                          if (this.booleanState0044) {
                            this.platformSupport001State0001.performAction0051(integerLocal10 != 0, componentLocal27, (byte) 111);
                          } else {
                            Class.forName("RenderingSupport005").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.objectState0002, new Object[]{componentLocal27, new Boolean(integerLocal10 != 0)});
                          }
                          break;
                        }
                        if (!this.booleanState0044 &&
                          integerLocal5 == 17) {
                          objectArrayLocal23 = (Object[]) (asyncTaskLocal16.objectState0003);
                          Class.forName("RenderingSupport005").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.objectState0002, new Object[]{objectArrayLocal23[0], objectArrayLocal23[1], new Integer(asyncTaskLocal16.integerState0509), new Integer(asyncTaskLocal16.integerState0508), objectArrayLocal23[2]});
                        } else {
                          if (16 != integerLocal5) {
                            throw PlatformService.<RuntimeException>computeRuntimeException0560(new Exception(""));
                          }
                          try {
                            if (!stringState0171.startsWith("win")) {
                              throw PlatformService.<RuntimeException>computeRuntimeException0560(new Exception());
                            }
                            stringLocal25 = (String) (asyncTaskLocal16.objectState0003);
                            if (!stringLocal25.startsWith("http://") &&
                              !stringLocal25.startsWith("https://")) {
                              throw PlatformService.<RuntimeException>computeRuntimeException0560(new Exception());
                            }
                            stringLocal14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (integerLocal1 = 0; stringLocal25.length() > integerLocal1; integerLocal1++) {
                              if (stringLocal14.indexOf((int) stringLocal25.charAt(integerLocal1)) == -1) {
                                throw PlatformService.<RuntimeException>computeRuntimeException0560(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + stringLocal25 + "\"");
                            asyncTaskLocal16.objectState0004 = null;
                          } catch (java.lang.Exception caughtParameterLocal31) {
                            caughtExceptionLocal3 = caughtParameterLocal31;
                            exceptionLocal11 = (Exception) (Object) caughtExceptionLocal3;
                            asyncTaskLocal16.objectState0004 = exceptionLocal11;
                            throw PlatformService.<RuntimeException>computeRuntimeException0560(exceptionLocal11);
                          }
                        }
                        break;
                      case 13:
                        platformSupport004Local9 = PlatformService.computePlatformSupport0040564((byte) -32, "", (String) (asyncTaskLocal16.objectState0003), integerState0223);
                        asyncTaskLocal16.objectState0004 = platformSupport004Local9;
                        break;
                      case 7:
                        if (this.booleanState0044) {
                          this.platformSupport003State0001.performAction0579((java.awt.Frame) (asyncTaskLocal16.objectState0003), (byte) 122);
                        } else {
                          Class.forName("MixedSupport142").getMethod("exit", new Class[]{}).invoke(this.objectState0001, new Object[]{});
                        }
                        break;
                      case 6:
                        frameLocal22 = new java.awt.Frame("Jagex Full Screen");
                        asyncTaskLocal16.objectState0004 = frameLocal22;
                        frameLocal22.setResizable(false);
                        if (!this.booleanState0044) {
                          Class.forName("MixedSupport142").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.objectState0001, new Object[]{frameLocal22, new Integer(asyncTaskLocal16.integerState0509 >>> 16), new Integer(asyncTaskLocal16.integerState0509 & 65535), new Integer(asyncTaskLocal16.integerState0508 >> 16), new Integer(asyncTaskLocal16.integerState0508 & 65535)});
                        } else {
                          this.platformSupport003State0001.performAction0578(asyncTaskLocal16.integerState0508 >> 16, false, asyncTaskLocal16.integerState0509 >>> 16, asyncTaskLocal16.integerState0509 & 65535, asyncTaskLocal16.integerState0508 & 65535, frameLocal22);
                        }
                        break;
                      case 5:
                        if (!this.booleanState0044) {
                          asyncTaskLocal16.objectState0004 = Class.forName("MixedSupport142").getMethod("listmodes", new Class[]{}).invoke(this.objectState0001, new Object[]{});
                        } else {
                          asyncTaskLocal16.objectState0004 = this.platformSupport003State0001.computeIntegerArray0577(0);
                        }
                        break;
                      case 3:
                        if (longState0016 > MixedSupport063.computeLong0827(4)) {
                          throw new IOException();
                        }
                        stringLocal21 = (asyncTaskLocal16.integerState0509 >> 24 & 255) + "." + (255 & asyncTaskLocal16.integerState0509 >> 16) + "." + ((asyncTaskLocal16.integerState0509 & 65502) >> 8) + "." + (255 & asyncTaskLocal16.integerState0509);
                        asyncTaskLocal16.objectState0004 = java.net.InetAddress.getByName(stringLocal21).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    transferableLocal15 = (java.awt.datatransfer.Transferable) (asyncTaskLocal16.objectState0003);
                    clipboardLocal20 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboardLocal20.setContents(transferableLocal15, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    clipboardLocal19 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    asyncTaskLocal16.objectState0004 = clipboardLocal19.getContents((Object) null);
                    break;
                  case 9:
                    objectArrayLocal18 = (Object[]) (asyncTaskLocal16.objectState0003);
                    if (this.booleanState0043 &&
                      null == ((Class) (objectArrayLocal18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    asyncTaskLocal16.objectState0004 = ((Class) (objectArrayLocal18[0])).getDeclaredField((String) (objectArrayLocal18[1]));
                    break;
                  case 8:
                    objectArrayLocal17 = (Object[]) (asyncTaskLocal16.objectState0003);
                    if (this.booleanState0043 &&
                      ((Class) (objectArrayLocal17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    asyncTaskLocal16.objectState0004 = ((Class) (objectArrayLocal17[0])).getDeclaredMethod((String) (objectArrayLocal17[1]), (Class[]) (objectArrayLocal17[2]));
                    break;
                  case 22:
                    if (MixedSupport063.computeLong0827(4) < longState0016) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (DiagnosticSupport001) null;
                      asyncTaskLocal16.objectState0004 = UiComponentPart024.computeSocketFactory1454((String) (asyncTaskLocal16.objectState0003), asyncTaskLocal16.integerState0509, 23155).computeSocket1679(-7);
                    } catch (DiagnosticSupport001 caughtParameterLocal32) {
                      caughtExceptionLocal3 = caughtParameterLocal32;
                      diagnosticSupport001Local12 = (DiagnosticSupport001) (Object) caughtExceptionLocal3;
                      asyncTaskLocal16.objectState0004 = diagnosticSupport001Local12.getMessage();
                      throw diagnosticSupport001Local12;
                    }
                    break;
                }
              }
              asyncTaskLocal16.integerState0510 = 1;
            } catch (java.lang.ThreadDeath caughtParameterLocal33) {
              caughtExceptionLocal3 = caughtParameterLocal33;
              threadDeathLocal6 = (ThreadDeath) (Object) caughtExceptionLocal3;
              throw threadDeathLocal6;
            } catch (java.lang.Throwable caughtParameterLocal34) {
              caughtExceptionLocal3 = caughtParameterLocal34;
              throwableLocal7 = caughtExceptionLocal3;
              asyncTaskLocal16.integerState0510 = 2;
            }
            objectLocal4 = asyncTaskLocal16;
            synchronized (objectLocal4) {
              asyncTaskLocal16.notify();
            }
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal35) {
          throw uncheckedExceptionLocal35;
        } catch (Throwable checkedExceptionLocal36) {
          throw new RuntimeException(checkedExceptionLocal36);
        }
    }

    final AsyncTask computeAsyncTask0571(java.net.URL uRLArgument1, byte byteArgument2) {
        int integerLocal1 = -74 % ((-9 - byteArgument2) / 45);
        return this.computeAsyncTask0566(0, 1, uRLArgument1, 4, 0);
    }

    final AsyncTask computeAsyncTask0561(byte byteArgument1) {
        if (byteArgument1 <= 121) {
          return (AsyncTask) null;
        }
        return this.computeAsyncTask0566(0, 1, (Object) null, 5, 0);
    }

    private final AsyncTask computeAsyncTask0566(int integerArgument1, int integerArgument2, Object objectArgument3, int integerArgument4, int integerArgument5) {
        AsyncTask asyncTaskLocal1 = null;
        Throwable caughtExceptionLocal2 = null;
        Object objectLocal3 = null;
        asyncTaskLocal1 = new AsyncTask();
        asyncTaskLocal1.integerState0509 = integerArgument5;
        asyncTaskLocal1.integerState0508 = integerArgument1;
        asyncTaskLocal1.integerState0511 = integerArgument4;
        asyncTaskLocal1.objectState0003 = objectArgument3;
        objectLocal3 = this;
        synchronized (objectLocal3) {
          if (null != this.asyncTaskState0003) {
            this.asyncTaskState0003.asyncTaskState0005 = asyncTaskLocal1;
            this.asyncTaskState0003 = asyncTaskLocal1;
          } else {
            this.asyncTaskState0002 = asyncTaskLocal1;
            this.asyncTaskState0003 = asyncTaskLocal1;
          }
          this.notify();
          if (integerArgument2 != 1) {
            longState0016 = -68L;
          }
        }
        return asyncTaskLocal1;
    }

    final AsyncTask computeAsyncTask0563(byte byteArgument1, int integerArgument2, Runnable runnableArgument3) {
        int integerLocal1 = -20 / ((byteArgument1 - 80) / 41);
        return this.computeAsyncTask0566(0, 1, runnableArgument3, 2, integerArgument2);
    }

    PlatformService(int integerArgument1, String stringArgument2, int integerArgument3, boolean booleanArgument4) throws Exception {
        int integerLocal1 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackBooleanLocal4 = false;
        Throwable caughtExceptionLocal5 = null;
        PlatformSupport003 platformSupport003Local6 = null;
        this.asyncTaskState0002 = null;
        this.platformSupport004State0001 = null;
        this.asyncTaskState0003 = null;
        this.booleanState0045 = false;
        this.booleanState0044 = false;
        this.booleanState0043 = false;
        this.platformSupport004State0003 = null;
        this.platformSupport004State0002 = null;
        stackBooleanLocal4 = (booleanArgument4);
        this.booleanState0043 = stackBooleanLocal4;
        integerState0223 = integerArgument1;
        stringState0170 = "1.1";
        stringState0173 = stringArgument2;
        stringState0168 = "Unknown";
        try {
          stringState0168 = System.getProperty("java.vendor");
          stringState0170 = System.getProperty("java.version");
        } catch (java.lang.Exception caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          exception = (Exception) (Object) caughtExceptionLocal5;
        }
        if (stringState0168.toLowerCase().indexOf("microsoft") != -1) {
          this.booleanState0044 = true;
        }
        try {
          stringState0169 = System.getProperty("os.name");
        } catch (java.lang.Exception caughtParameterLocal8) {
          caughtExceptionLocal5 = caughtParameterLocal8;
          exception = (Exception) (Object) caughtExceptionLocal5;
          stringState0169 = "Unknown";
        }
        stringState0171 = stringState0169.toLowerCase();
        try {
          System.getProperty("os.arch").toLowerCase();
        } catch (java.lang.Exception caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          exception = (Exception) (Object) caughtExceptionLocal5;
        }
        try {
          System.getProperty("os.version").toLowerCase();
        } catch (java.lang.Exception caughtParameterLocal10) {
          caughtExceptionLocal5 = caughtParameterLocal10;
          exception = (Exception) (Object) caughtExceptionLocal5;
        }
        try {
          stringState0172 = System.getProperty("user.home");
          if (stringState0172 != null) {
            stringState0172 = stringState0172 + "/";
          }
        } catch (java.lang.Exception caughtParameterLocal11) {
          caughtExceptionLocal5 = caughtParameterLocal11;
          exception = (Exception) (Object) caughtExceptionLocal5;
        }
        if (stringState0172 == null) {
          stringState0172 = "~/";
        }
        try {
          this.eventQueueState0001 = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable caughtParameterLocal12) {
          caughtExceptionLocal5 = caughtParameterLocal12;
          throwable = caughtExceptionLocal5;
        }
        if (!this.booleanState0044) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception caughtParameterLocal13) {
            caughtExceptionLocal5 = caughtParameterLocal13;
            exception = (Exception) (Object) caughtExceptionLocal5;
          }
          try {
            methodState0001 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception caughtParameterLocal14) {
            caughtExceptionLocal5 = caughtParameterLocal14;
            exception = (Exception) (Object) caughtExceptionLocal5;
          }
        }
        PlatformSupport005.performAction1319(integerState0223, stringState0173, 7154);
        if (this.booleanState0043) {
          this.platformSupport004State0002 = new PlatformSupport004(PlatformSupport005.computeFile1320((String) null, 30869, "random.dat", integerState0223), "rw", 25L);
          this.platformSupport004State0001 = new PlatformSupport004(PlatformSupport005.computeFile1318(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.platformSupport004State0003 = new PlatformSupport004(PlatformSupport005.computeFile1318(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.platformSupport004ArrayState0001 = new PlatformSupport004[integerArgument3];
          for (integerLocal1 = 0; integerArgument3 > integerLocal1; integerLocal1++) {
            this.platformSupport004ArrayState0001[integerLocal1] = new PlatformSupport004(PlatformSupport005.computeFile1318(0, "main_file_cache.idx" + integerLocal1), "rw", 1048576L);
          }
          if (this.booleanState0044) {
            try {
              Class.forName("MixedSupport055").newInstance();
            } catch (java.lang.Throwable caughtParameterLocal15) {
              caughtExceptionLocal5 = caughtParameterLocal15;
              throwable = caughtExceptionLocal5;
            }
          }
          try {
            if (!this.booleanState0044) {
              this.objectState0001 = Class.forName("MixedSupport142").newInstance();
            } else {
              platformSupport003Local6 = new PlatformSupport003();
              this.platformSupport003State0001 = platformSupport003Local6;
            }
          } catch (java.lang.Throwable caughtParameterLocal16) {
            caughtExceptionLocal5 = caughtParameterLocal16;
            throwable = caughtExceptionLocal5;
          }
          try {
            if (!this.booleanState0044) {
              this.objectState0002 = Class.forName("RenderingSupport005").newInstance();
            } else {
              this.platformSupport001State0001 = new PlatformSupport001();
            }
          } catch (java.lang.Throwable caughtParameterLocal17) {
            caughtExceptionLocal5 = caughtParameterLocal17;
            throwable = caughtExceptionLocal5;
          }
        }
        this.booleanState0045 = false;
        this.threadState0001 = new Thread((Runnable) (this));
        this.threadState0001.setPriority(10);
        this.threadState0001.setDaemon(true);
        this.threadState0001.start();
    }

    static {
        longState0016 = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException computeRuntimeException0560(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
