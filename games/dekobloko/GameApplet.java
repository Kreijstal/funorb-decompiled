/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean booleanState0071;
    static MixedSupport062 mixedSupport062State0003;
    static CollectionSupport003 collectionSupport003State0002;
    static int integerState0292;
    static RenderingSupport010 renderingSupport010State0002;
    public static boolean booleanState0072;
    public static boolean booleanState0073;
    public static int integerState0293;
    public static boolean booleanState0074;
    public static int integerState0294;
    public static int integerState0295;
    public static boolean booleanState0075;

    public final void windowOpened(java.awt.event.WindowEvent windowEventArgument1) {
    }

    public final void focusGained(java.awt.event.FocusEvent focusEventArgument1) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          RenderingSupport003.booleanState0055 = true;
          MixedSupport016.booleanState0016 = true;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("hn.focusGained(");
          if (focusEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent windowEventArgument1) {
    }

    abstract void performAction0329(int integerArgument1);

    final static IndexedSprite computeIndexedSprite0757(String stringArgument1, ResourceArchive resourceArchiveArgument2, String stringArgument3, byte byteArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        IndexedSprite stackIndexedSpriteLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (byteArgument4 <= 26) {
            mixedSupport062State0003 = (MixedSupport062) null;
          }
          integerLocal1 = resourceArchiveArgument2.computeInteger0926(-1, stringArgument3);
          integerLocal3 = resourceArchiveArgument2.computeInteger0913(integerLocal1, 13030, stringArgument1);
          stackIndexedSpriteLocal4 = ComponentDecorator.computeIndexedSprite1141(resourceArchiveArgument2, integerLocal1, integerLocal3, 21828);
          return stackIndexedSpriteLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("hn.M(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(byteArgument4).append(')').toString());
        }
    }

    public final String getParameter(String stringArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (null != MixedSupport054.frameState0001) {
            stackObjectLocal2 = null;
            return (String) (stackObjectLocal2);
          }
          if (null != MixedSupport071.appletState0001 &&
            this != MixedSupport071.appletState0001) {
            stackStringLocal3 = MixedSupport071.appletState0001.getParameter(stringArgument1);
            return stackStringLocal3;
          }
          stackStringLocal4 = super.getParameter(stringArgument1);
          return stackStringLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("hn.getParameter(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        java.applet.AppletContext stackAppletContextLocal3 = null;
        java.applet.AppletContext stackAppletContextLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport054.frameState0001 != null) {
            stackObjectLocal2 = null;
            return (java.applet.AppletContext) (stackObjectLocal2);
          }
          if (MixedSupport071.appletState0001 != null &&
            MixedSupport071.appletState0001 != this) {
            stackAppletContextLocal3 = MixedSupport071.appletState0001.getAppletContext();
            return stackAppletContextLocal3;
          }
          stackAppletContextLocal4 = super.getAppletContext();
          return stackAppletContextLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "hn.getAppletContext()");
        }
    }

    final void performAction0756(String stringArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        try {
          PlatformService cachedPlatformServiceLocal1 = null;
          AsyncTask asyncTaskLocal2 = null;
          int integerLocal3 = 0;
          RuntimeException stackRuntimeExceptionLocal4 = null;
          StringBuilder stackStringBuilderLocal5 = null;
          String stackStringLocal6 = null;
          Throwable caughtExceptionLocal7 = null;
          Throwable throwableLocal8 = null;
          RuntimeException runtimeExceptionLocal9 = null;
          integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            try {
              if (MixedSupport124.gameAppletState0001 != null) {
                DualNode.integerState0061 = DualNode.integerState0061 + 1;
                if (DualNode.integerState0061 < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.performAction0760(true, "alreadyloaded");
                return;
              }
              UiComponentPart024.integerState0592 = 0;
              UiComponentPart006.integerState0133 = integerArgument6;
              UiComponentPart020.integerState0551 = integerArgument6;
              SceneWidgetPart009.integerState0648 = 0;
              MixedSupport095.integerState0548 = integerArgument5;
              CodecSupport001.integerState0436 = integerArgument5;
              MixedSupport124.gameAppletState0001 = this;
              SceneWidgetPart014.integerState0919 = integerArgument7;
              MixedSupport128.appletState0002 = UiComponentPart029.computeApplet1689(25144);
              cachedPlatformServiceLocal1 = new PlatformService(integerArgument2, stringArgument1, integerArgument3, booleanArgument4);
              CodecSupport001.platformServiceState0003 = cachedPlatformServiceLocal1;
              MixedSupport093.platformServiceState0004 = cachedPlatformServiceLocal1;
              asyncTaskLocal2 = CodecSupport001.platformServiceState0003.computeAsyncTask0563((byte) -126, 1, (Runnable) (this));
              while (true) {
                if (0 == asyncTaskLocal2.integerState0510) {
                  MixedSupport132.performAction1837(10L, -128);
                  if (integerLocal3 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable caughtParameterLocal10) {
              caughtExceptionLocal7 = caughtParameterLocal10;
              throwableLocal8 = caughtExceptionLocal7;
              NetworkArchiveRequestManager.performAction1468(throwableLocal8, 16408, (String) null);
              this.performAction0760(true, "crash");
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal11) {
            caughtExceptionLocal7 = caughtParameterLocal11;
            runtimeExceptionLocal9 = (RuntimeException) (Object) caughtExceptionLocal7;
            stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
            stackStringBuilderLocal5 = new StringBuilder().append("hn.B(");
            if (stringArgument1 == null) {
              stackStringLocal6 = "null";
            } else {
              stackStringLocal6 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(booleanArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal12) {
          throw uncheckedExceptionLocal12;
        } catch (Throwable checkedExceptionLocal13) {
          throw new RuntimeException(checkedExceptionLocal13);
        }
    }

    final boolean computeBoolean0755(byte byteArgument1) {
        return true;
    }

    public final static void provideLoaderApplet(java.applet.Applet appletArgument1) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          MixedSupport071.appletState0001 = appletArgument1;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("hn.provideLoaderApplet(");
          if (appletArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent windowEventArgument1) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException caughtExceptionLocal2 = null;
        try {
          if (MixedSupport124.gameAppletState0001 == this &&
            !MixedSupport031.booleanState0032) {
            MixedSupport077.longState0025 = MixedSupport063.computeLong0827(4);
            MixedSupport132.performAction1837(5000L, -128);
            MixedSupport093.platformServiceState0004 = null;
            this.performAction0759(false, -124);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal2 = caughtParameterLocal3;
          runtimeException = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.destroy()");
        }
    }

    private final void performAction0758(boolean booleanArgument1) {
        int integerLocal1 = 0;
        long longLocal2 = 0L;
        long longLocal3 = 0L;
        java.awt.Insets insetsLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        try {
          longLocal2 = MixedSupport063.computeLong0827(4);
          longLocal3 = MixedSupport120.longArrayState0009[GameDomainSupport002.integerState0180];
          MixedSupport120.longArrayState0009[GameDomainSupport002.integerState0180] = longLocal2;
          if (longLocal3 != 0L &&
            longLocal3 < longLocal2) {
            integerLocal7 = (int)(-longLocal3 + longLocal2);
            MixedSupport067.integerState0347 = (32000 + (integerLocal7 >> 1)) / integerLocal7;
          }
          if (booleanArgument1) {
            return;
          }
          GameDomainSupport002.integerState0180 = GameDomainSupport002.integerState0180 + 1 & 31;
          integerLocal1 = DiagnosticSupport002.integerState0339;
          DiagnosticSupport002.integerState0339 = DiagnosticSupport002.integerState0339 + 1;
          if (integerLocal1 > 50) {
            MixedSupport016.booleanState0016 = true;
            DiagnosticSupport002.integerState0339 = DiagnosticSupport002.integerState0339 - 50;
            GameDomainSupport004.canvasState0001.setSize(UiComponentPart006.integerState0133, MixedSupport095.integerState0548);
            GameDomainSupport004.canvasState0001.setVisible(true);
            boolean sharedTailLocal8 = (null != MixedSupport054.frameState0001 &&
              NetworkSupport009.frameState0002 == null);
            if (!sharedTailLocal8) {
              GameDomainSupport004.canvasState0001.setLocation(SceneWidgetPart009.integerState0648, UiComponentPart024.integerState0592);
              sharedTailLocal8 = (DekoBlokoClient.obfuscationControl);
            }
            if (sharedTailLocal8) {
              insetsLocal4 = MixedSupport054.frameState0001.getInsets();
              GameDomainSupport004.canvasState0001.setLocation(SceneWidgetPart009.integerState0648 + insetsLocal4.left, UiComponentPart024.integerState0592 + insetsLocal4.top);
            }
          }
          this.performAction0330(320);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "hn.H(" + booleanArgument1 + ')');
        }
    }

    final synchronized void performAction0761(byte byteArgument1) {
        int integerLocal1 = 0;
        Object objectLocal2 = null;
        java.awt.Insets insetsLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null != GameDomainSupport004.canvasState0001) {
            GameDomainSupport004.canvasState0001.removeFocusListener((java.awt.event.FocusListener) (this));
            GameDomainSupport004.canvasState0001.getParent().setBackground(java.awt.Color.black);
            GameDomainSupport004.canvasState0001.getParent().remove((java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
          }
          boolean frameRemainderLocal7 = true;
          integerLocal1 = 123 / ((byteArgument1 - 18) / 39);
          if (null != NetworkSupport009.frameState0002) {
            objectLocal2 = NetworkSupport009.frameState0002;
            frameRemainderLocal7 = (integerLocal4 != 0);
          }
          if (frameRemainderLocal7) {
            if (MixedSupport054.frameState0001 == null) {
              if (MixedSupport071.appletState0001 != null) {
                objectLocal2 = MixedSupport071.appletState0001;
                if (integerLocal4 != 0) {
                  objectLocal2 = MixedSupport124.gameAppletState0001;
                  objectLocal2 = MixedSupport054.frameState0001;
                }
              } else {
                objectLocal2 = MixedSupport124.gameAppletState0001;
                if (integerLocal4 != 0) {
                  objectLocal2 = MixedSupport054.frameState0001;
                }
              }
            } else {
              objectLocal2 = MixedSupport054.frameState0001;
            }
          }
          ((java.awt.Container) (objectLocal2)).setLayout((java.awt.LayoutManager) null);
          GameDomainSupport004.canvasState0001 = (java.awt.Canvas) ((Object) new PlatformSupport002((java.awt.Component) (this)));
          ((java.awt.Container) (objectLocal2)).add((java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
          GameDomainSupport004.canvasState0001.setSize(UiComponentPart006.integerState0133, MixedSupport095.integerState0548);
          GameDomainSupport004.canvasState0001.setVisible(true);
          if (MixedSupport054.frameState0001 == objectLocal2) {
            insetsLocal3 = MixedSupport054.frameState0001.getInsets();
            GameDomainSupport004.canvasState0001.setLocation(insetsLocal3.left + SceneWidgetPart009.integerState0648, UiComponentPart024.integerState0592 + insetsLocal3.top);
            if (integerLocal4 != 0) {
              GameDomainSupport004.canvasState0001.setLocation(SceneWidgetPart009.integerState0648, UiComponentPart024.integerState0592);
            }
          } else {
            GameDomainSupport004.canvasState0001.setLocation(SceneWidgetPart009.integerState0648, UiComponentPart024.integerState0592);
          }
          GameDomainSupport004.canvasState0001.addFocusListener((java.awt.event.FocusListener) (this));
          GameDomainSupport004.canvasState0001.requestFocus();
          RenderingSupport003.booleanState0055 = true;
          GameSession.booleanState0141 = true;
          MixedSupport016.booleanState0016 = true;
          LoginCredentials.booleanState0086 = false;
          NetworkSupport004.longState0018 = MixedSupport063.computeLong0827(4);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal5 = caughtParameterLocal8;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "hn.K(" + byteArgument1 + ')');
        }
    }

    private final void performAction0759(boolean booleanArgument1, int integerArgument2) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object objectLocal4 = null;
        int integerLocal5 = 0;
        Throwable caughtExceptionLocal6 = null;
        try {
          objectLocal4 = this;
          synchronized (objectLocal4) {
            if (MixedSupport031.booleanState0032) {
              return;
            }
            MixedSupport031.booleanState0032 = true;
          }
          if (null != MixedSupport071.appletState0001) {
            MixedSupport071.appletState0001.destroy();
          }
          try {
            this.performAction0331(0);
          } catch (java.lang.Exception caughtParameterLocal7) {
            caughtExceptionLocal6 = caughtParameterLocal7;
            exception = (Exception) (Object) caughtExceptionLocal6;
          }
          if (GameDomainSupport004.canvasState0001 != null) {
            try {
              GameDomainSupport004.canvasState0001.removeFocusListener((java.awt.event.FocusListener) (this));
              GameDomainSupport004.canvasState0001.getParent().remove((java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
            } catch (java.lang.Exception caughtParameterLocal8) {
              caughtExceptionLocal6 = caughtParameterLocal8;
              exception = (Exception) (Object) caughtExceptionLocal6;
            }
          }
          if (null != CodecSupport001.platformServiceState0003) {
            try {
              CodecSupport001.platformServiceState0003.performAction0565(0);
            } catch (java.lang.Exception caughtParameterLocal9) {
              caughtExceptionLocal6 = caughtParameterLocal9;
              exception = (Exception) (Object) caughtExceptionLocal6;
            }
          }
          this.performAction0323(124);
          if (null != MixedSupport054.frameState0001) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable caughtParameterLocal10) {
              caughtExceptionLocal6 = caughtParameterLocal10;
              throwable = caughtExceptionLocal6;
            }
          }
          System.out.println("Shutdown complete - clean:" + booleanArgument1);
          integerLocal5 = -105 / ((integerArgument2 - 7) / 62);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal6 = caughtParameterLocal11;
          runtimeException = (RuntimeException) (Object) caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.C(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent windowEventArgument1) {
    }

    abstract void performAction0323(int integerArgument1);

    public final void start() {
        if (this != MixedSupport124.gameAppletState0001 ||
          MixedSupport031.booleanState0032) {
          return;
        }
        try {
          MixedSupport077.longState0025 = 0L;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent windowEventArgument1) {
    }

    final void performAction0760(boolean booleanArgument1, String stringArgument2) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          Throwable caughtExceptionLocal4 = null;
          Throwable throwableLocal5 = null;
          Exception exceptionLocal6 = null;
          RuntimeException runtimeExceptionLocal7 = null;
          try {
            if (this.booleanState0071) {
              return;
            }
            this.booleanState0071 = true;
            System.out.println("error_game_" + stringArgument2);
            try {
              MixedSupport088.computeObject1242(booleanArgument1, "loggedout", UiComponentPart029.computeApplet1689(25144));
            } catch (java.lang.Throwable caughtParameterLocal8) {
              caughtExceptionLocal4 = caughtParameterLocal8;
              throwableLocal5 = caughtExceptionLocal4;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + stringArgument2 + ".ws"), "_top");
            } catch (java.lang.Exception caughtParameterLocal9) {
              caughtExceptionLocal4 = caughtParameterLocal9;
              exceptionLocal6 = (Exception) (Object) caughtExceptionLocal4;
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal10) {
            caughtExceptionLocal4 = caughtParameterLocal10;
            runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal4;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal7;
            stackStringBuilderLocal2 = new StringBuilder().append("hn.L(").append(booleanArgument1).append(',');
            if (stringArgument2 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent windowEventArgument1) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("hn.windowClosing(");
          if (windowEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    private final void performAction0763(int integerArgument1) {
        RuntimeException runtimeException = null;
        long longLocal2 = 0L;
        long longLocal3 = 0L;
        int integerLocal4 = 0;
        Throwable caughtExceptionLocal5 = null;
        Object objectLocal6 = null;
        try {
          longLocal2 = MixedSupport063.computeLong0827(4);
          longLocal3 = SceneWidgetPart006.longArrayState0003[MixedSupport080.integerState0435];
          SceneWidgetPart006.longArrayState0003[MixedSupport080.integerState0435] = longLocal2;
          MixedSupport080.integerState0435 = 31 & 1 + MixedSupport080.integerState0435;
          if (longLocal3 != 0L &&
            longLocal3 >= longLocal2) {
          }
          integerLocal4 = -68 / ((-31 - integerArgument1) / 40);
          objectLocal6 = this;
          synchronized (objectLocal6) {
            GameSession.booleanState0141 = RenderingSupport003.booleanState0055;
          }
          this.performAction0329(11978);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeException = (RuntimeException) (Object) caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.N(" + integerArgument1 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackBooleanLocal1 = false;
          int stackIntegerLocal2 = 0;
          int stackIntegerLocal3 = 0;
          int stackIntegerLocal4 = 0;
          Throwable caughtExceptionLocal5 = null;
          Object objectLocal6 = null;
          int integerLocal7 = 0;
          String stringLocal8 = null;
          int integerLocal9 = 0;
          java.lang.reflect.Method methodLocal10 = null;
          int integerLocal11 = 0;
          Throwable throwableLocal12 = null;
          String stringLocal13 = null;
          int integerLocal14 = 0;
          integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            try {
              boolean frameRemainderLocal15 = true;
              boolean frameRemainderLocal16 = true;
              boolean frameCompletedLocal17 = true;
              if (null != PlatformService.stringState0168) {
                objectLocal6 = PlatformService.stringState0168.toLowerCase();
                if (-1 != ((String) (objectLocal6)).indexOf("sun") ||
                  ((String) (objectLocal6)).indexOf("apple") != -1) {
                  stringLocal8 = PlatformService.stringState0170;
                  if (stringLocal8.equals("1.1") ||
                    stringLocal8.startsWith("1.1.") ||
                    stringLocal8.equals("1.2") ||
                    stringLocal8.startsWith("1.2.") ||
                    stringLocal8.equals("1.3") ||
                    stringLocal8.startsWith("1.3.") ||
                    stringLocal8.equals("1.4") ||
                    stringLocal8.startsWith("1.4.") ||
                    stringLocal8.equals("1.5") ||
                    stringLocal8.startsWith("1.5.") ||
                    stringLocal8.equals("1.6.0")) {
                    this.performAction0760(true, "wrongjava");
                    frameRemainderLocal15 = (integerLocal14 != 0);
                  }
                  if ((frameRemainderLocal15) &&
                    (stringLocal8.startsWith("1.6.0_"))) {
                    integerLocal11 = 6;
                    while (stringLocal8.length() > integerLocal11) {
                      stackBooleanLocal1 = MixedSupport042.computeBoolean0591(stringLocal8.charAt(integerLocal11), (byte) 23);
                      if (integerLocal14 != 0) {
                        frameCompletedLocal17 = false;
                        break;
                      }
                      if (stackBooleanLocal1) {
                        integerLocal11++;
                        continue;
                      }
                      break;
                    }
                    if (frameCompletedLocal17) {
                      stringLocal13 = stringLocal8.substring(6, integerLocal11);
                      if (DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal13)) &&
                        !(MixedSupport014.computeInteger0207((byte) 51, (CharSequence) ((Object) stringLocal13)) >= 10)) {
                        this.performAction0760(true, "wrongjava");
                        frameRemainderLocal15 = (integerLocal14 != 0);
                      }
                    }
                  }
                }
              }
              if (((frameRemainderLocal15) && (frameCompletedLocal17)) &&
                (frameRemainderLocal16 = (null != PlatformService.stringState0170))) {
                stackBooleanLocal1 = PlatformService.stringState0170.startsWith("1.");
              }
              if ((frameRemainderLocal15) &&
                (frameRemainderLocal16) &&
                (stackBooleanLocal1)) {
                integerLocal7 = 2;
                integerLocal9 = 0;
                while (true) {
                  boolean frameRemainderLocal18 = true;
                  if (integerLocal7 < PlatformService.stringState0170.length()) {
                    integerLocal11 = PlatformService.stringState0170.charAt(integerLocal7);
                    stackIntegerLocal2 = ~integerLocal11;
                    stackIntegerLocal3 = -49;
                    frameRemainderLocal18 = (integerLocal14 == 0);
                    if ((frameRemainderLocal18) && (stackIntegerLocal2 <= stackIntegerLocal3 && (integerLocal11 <= 57 ||
                      integerLocal14 != 0))) {
                      integerLocal7++;
                      integerLocal9 = integerLocal9 * 10 - (-integerLocal11 + 48);
                      continue;
                    }
                  }
                  if (frameRemainderLocal18) {
                    stackIntegerLocal2 = -6;
                    stackIntegerLocal3 = ~integerLocal9;
                  }
                  if (stackIntegerLocal2 < stackIntegerLocal3) {
                    break;
                  }
                  NetworkSupport008.booleanState0129 = true;
                  break;
                }
              }
              if (frameRemainderLocal15) {
                objectLocal6 = MixedSupport124.gameAppletState0001;
                if (null != MixedSupport071.appletState0001) {
                  objectLocal6 = MixedSupport071.appletState0001;
                }
                methodLocal10 = PlatformService.methodState0001;
                if (methodLocal10 != null) {
                  try {
                    methodLocal10.invoke(objectLocal6, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable caughtParameterLocal19) {
                    caughtExceptionLocal5 = caughtParameterLocal19;
                    throwableLocal12 = caughtExceptionLocal5;
                  }
                }
                NodeHashTable.performAction1710(1);
                this.performAction0761((byte) 125);
                MixedSupport080.framebufferState0001 = ArchiveRequestManager.computeFramebuffer0515(MixedSupport095.integerState0548, (byte) 120, UiComponentPart006.integerState0133, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
                this.performAction0328(false);
                CollectionSupport001.mixedSupport059State0001 = MixedSupport031.computeMixedSupport0590459((byte) 63);
                do {
                  boolean frameRemainderLocal20 = true;
                  if (MixedSupport077.longState0025 != 0L) {
                    stackIntegerLocal4 = computeInteger0754(~MixedSupport063.computeLong0827(4), ~MixedSupport077.longState0025);
                    frameRemainderLocal20 = (integerLocal14 == 0);
                    if ((frameRemainderLocal20) &&
                      (stackIntegerLocal4 <= 0)) {
                      break;
                    }
                  }
                  if (frameRemainderLocal20) {
                    MixedSupport149.integerState0883 = CollectionSupport001.mixedSupport059State0001.computeInteger0795(MixedSupport138.longState0051, 4);
                    stackIntegerLocal4 = 0;
                  }
                  integerLocal11 = stackIntegerLocal4;
                  do {
                    if (!(integerLocal11 < MixedSupport149.integerState0883)) {
                      this.performAction0758(false);
                      DiagnosticSupport001.performAction0362(-61, GameDomainSupport004.canvasState0001, CodecSupport001.platformServiceState0003);
                      break;
                    }
                    this.performAction0763(121);
                    integerLocal11++;
                  } while (integerLocal14 == 0);
                } while (integerLocal14 == 0);
              }
            } catch (java.lang.Throwable caughtParameterLocal21) {
              caughtExceptionLocal5 = caughtParameterLocal21;
              objectLocal6 = caughtExceptionLocal5;
              NetworkArchiveRequestManager.performAction1468((Throwable) (objectLocal6), 16408, (String) null);
              this.performAction0760(true, "crash");
            }
            this.performAction0759(true, -128);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal22) {
            caughtExceptionLocal5 = caughtParameterLocal22;
            objectLocal6 = (RuntimeException) (Object) caughtExceptionLocal5;
            throw ClientException.computeDiagnosticSupport0020400((Throwable) (objectLocal6), "hn.run()");
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal23) {
          throw uncheckedExceptionLocal23;
        } catch (Throwable checkedExceptionLocal24) {
          throw new RuntimeException(checkedExceptionLocal24);
        }
    }

    public abstract void init();

    public final void focusLost(java.awt.event.FocusEvent focusEventArgument1) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          RenderingSupport003.booleanState0055 = false;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("hn.focusLost(");
          if (focusEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public static void performAction0762(int integerArgument1) {
        collectionSupport003State0002 = null;
        mixedSupport062State0003 = null;
        if (integerArgument1 != 6) {
          return;
        }
        try {
          renderingSupport010State0002 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.E(" + integerArgument1 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException runtimeExceptionLocal1;
        if (null != MixedSupport054.frameState0001) {
          return null;
        }
        if (null != MixedSupport071.appletState0001 &&
          MixedSupport071.appletState0001 != this) {
          return MixedSupport071.appletState0001.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final synchronized void paint(java.awt.Graphics graphicsArgument1) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        java.awt.Rectangle rectangleLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (MixedSupport124.gameAppletState0001 == this &&
            !MixedSupport031.booleanState0032) {
            MixedSupport016.booleanState0016 = true;
            if (NetworkSupport008.booleanState0129 &&
              -NetworkSupport004.longState0018 + MixedSupport063.computeLong0827(4) > 1000L) {
              rectangleLocal5 = graphicsArgument1.getClipBounds();
              if (null != rectangleLocal5) {
                if (UiComponentPart020.integerState0551 > rectangleLocal5.width) {
                  return;
                }
                if (rectangleLocal5.height < CodecSupport001.integerState0436) {
                  return;
                }
              }
              LoginCredentials.booleanState0086 = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal4 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("hn.paint(");
          if (graphicsArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    abstract void performAction0331(int integerArgument1);

    public final void stop() {
        if (MixedSupport124.gameAppletState0001 != this ||
          MixedSupport031.booleanState0032) {
          return;
        }
        try {
          MixedSupport077.longState0025 = MixedSupport063.computeLong0827(4) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hn.stop()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        java.net.URL stackURLLocal3 = null;
        java.net.URL stackURLLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport054.frameState0001 != null) {
            stackObjectLocal2 = null;
            return (java.net.URL) (stackObjectLocal2);
          }
          if (null != MixedSupport071.appletState0001 &&
            MixedSupport071.appletState0001 != this) {
            stackURLLocal3 = MixedSupport071.appletState0001.getDocumentBase();
            return stackURLLocal3;
          }
          stackURLLocal4 = super.getDocumentBase();
          return stackURLLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "hn.getDocumentBase()");
        }
    }

    abstract void performAction0330(int integerArgument1);

    protected GameApplet() {
        this.booleanState0071 = false;
    }

    public final void update(java.awt.Graphics graphicsArgument1) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          this.paint(graphicsArgument1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("hn.update(");
          if (graphicsArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent windowEventArgument1) {
    }

    abstract void performAction0328(boolean booleanArgument1);

    static {
        mixedSupport062State0003 = new MixedSupport062("");
    }

    private static int computeInteger0754(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
