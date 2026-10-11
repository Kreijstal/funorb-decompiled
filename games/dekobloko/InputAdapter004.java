/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputAdapter004 implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int integerState0530;
    static String stringState0356;
    static String stringState0357;
    static String stringState0358;

    public static void performAction1237(int integerArgument1) {
        if (integerArgument1 == 128) {
          stringState0356 = null;
          stringState0358 = null;
          stringState0357 = null;
          return;
        }
        stringState0356 = (String) null;
        stringState0356 = null;
        stringState0358 = null;
        stringState0357 = null;
    }

    final static void performAction1236(int integerArgument1, MixedSupport015 mixedSupport015Argument2, BitmapFont bitmapFontArgument3, int integerArgument4, int integerArgument5, MixedSupport015 mixedSupport015Argument6, int integerArgument7, BitmapFont bitmapFontArgument8, int integerArgument9, int integerArgument10, MixedSupport015 mixedSupport015Argument11, int integerArgument12, int integerArgument13, int integerArgument14, int integerArgument15, int integerArgument16, int integerArgument17, int integerArgument18, int integerArgument19, int integerArgument20, int integerArgument21) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        try {
          BucketBoard.performAction1098(bitmapFontArgument8, true, bitmapFontArgument3, integerArgument9);
          integerLocal13 = 80 % ((integerArgument13 + 81) / 39);
          SceneWidgetPart010.performAction1662(integerArgument7, integerArgument21, (byte) -91, integerArgument1, integerArgument17);
          ResourceSupport004.performAction1426(31004, integerArgument16, integerArgument15);
          MixedSupport018.performAction0275(mixedSupport015Argument11, integerArgument14, integerArgument5, (byte) -63, integerArgument12, mixedSupport015Argument6);
          UiComponentPart012.performAction0652(integerArgument20, integerArgument19, (byte) -75, mixedSupport015Argument2);
          SoftwareFramebuffer.performAction2029(integerArgument18, integerArgument4, integerArgument10, true);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal12 = caughtParameterLocal15;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal14;
          stackStringBuilderLocal2 = new StringBuilder().append("n.D(").append(integerArgument1).append(',');
          if (mixedSupport015Argument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (bitmapFontArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (mixedSupport015Argument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument7).append(',');
          if (bitmapFontArgument8 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',');
          if (mixedSupport015Argument11 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument12).append(',').append(integerArgument13).append(',').append(integerArgument14).append(',').append(integerArgument15).append(',').append(integerArgument16).append(',').append(integerArgument17).append(',').append(integerArgument18).append(',').append(integerArgument19).append(',').append(integerArgument20).append(',').append(integerArgument21).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent keyEventArgument1) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8;
        try {
          if (MixedSupport033.inputAdapter004State0001 == null) {
            return;
          }
          MixedSupport098.integerState0569 = 0;
          integerLocal1 = keyEventArgument1.getKeyCode();
          if (0 <= integerLocal1 &&
            integerLocal1 < DualNode.integerArrayState0018.length) {
            integerLocal1 = DualNode.integerArrayState0018[integerLocal1];
            if ((128 & integerLocal1) != 0) {
              integerLocal1 = -1;
            }
          } else {
            integerLocal1 = -1;
          }
          if (MixedSupport154.integerState0933 >= 0 &&
            integerLocal1 >= 0) {
            MixedSupport078.integerArrayState0141[MixedSupport154.integerState0933] = integerLocal1;
            MixedSupport154.integerState0933 = MixedSupport154.integerState0933 + 1 & 127;
            if (MixedSupport154.integerState0933 == AudioSupport004.integerState0685) {
              MixedSupport154.integerState0933 = -1;
            }
          }
          if (integerLocal1 >= 0) {
            integerLocal7 = GameDomainSupport004.integerState0349 + 1 & 127;
            if (integerLocal7 != MixedSupport120.integerState0746) {
              MixedSupport104.integerArrayState0182[GameDomainSupport004.integerState0349] = integerLocal1;
              UiComponentPart003.characterArrayState0003[GameDomainSupport004.integerState0349] = (char)0;
              GameDomainSupport004.integerState0349 = integerLocal7;
            }
          }
          integerLocal8 = keyEventArgument1.getModifiers();
          if ((integerLocal8 & 10) != 0) {
            keyEventArgument1.consume();
            return;
          }
          if (integerLocal1 == 85) {
            keyEventArgument1.consume();
            return;
          }
          if (integerLocal1 != 10) {
            return;
          }
          keyEventArgument1.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("n.keyPressed(");
          if (keyEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent focusEventArgument1) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent focusEventArgument1) {
        try {
          if (null != MixedSupport033.inputAdapter004State0001) {
            MixedSupport154.integerState0933 = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "n.focusLost(" + (focusEventArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent keyEventArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        try {
          if (MixedSupport033.inputAdapter004State0001 != null) {
            integerLocal1 = keyEventArgument1.getKeyChar();
            if (integerLocal1 != 0 && 65535 != integerLocal1 &&
              UiComponentPart013.computeBoolean0689(-97, (char) integerLocal1)) {
              integerLocal2 = 1 + GameDomainSupport004.integerState0349 & 127;
              if (integerLocal2 != MixedSupport120.integerState0746) {
                MixedSupport104.integerArrayState0182[GameDomainSupport004.integerState0349] = -1;
                UiComponentPart003.characterArrayState0003[GameDomainSupport004.integerState0349] = (char)integerLocal1;
                GameDomainSupport004.integerState0349 = integerLocal2;
              }
            }
          }
          keyEventArgument1.consume();
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "n.keyTyped(" + (keyEventArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent keyEventArgument1) {
        RuntimeException runtimeException = null;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (MixedSupport033.inputAdapter004State0001 != null) {
            MixedSupport098.integerState0569 = 0;
            integerLocal2 = keyEventArgument1.getKeyCode();
            if (integerLocal2 >= 0 &&
              integerLocal2 < DualNode.integerArrayState0018.length) {
              integerLocal2 = DualNode.integerArrayState0018[integerLocal2] & -129;
            } else {
              integerLocal2 = -1;
            }
            if (MixedSupport154.integerState0933 >= 0 &&
              integerLocal2 >= 0) {
              MixedSupport078.integerArrayState0141[MixedSupport154.integerState0933] = ~integerLocal2;
              MixedSupport154.integerState0933 = 127 & MixedSupport154.integerState0933 + 1;
              if (AudioSupport004.integerState0685 == MixedSupport154.integerState0933) {
                MixedSupport154.integerState0933 = -1;
              }
            }
          }
          keyEventArgument1.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeException = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeException;
          stackStringBuilderLocal4 = new StringBuilder().append("n.keyReleased(");
          if (keyEventArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static int computeInteger1233(byte byteArgument1) {
        if (byteArgument1 != -74) {
          InputAdapter004.computeInteger1233((byte) -95);
          return (int)(1000000000L / MixedSupport138.longState0051);
        }
        return (int)(1000000000L / MixedSupport138.longState0051);
    }

    final static void performAction1234(int integerArgument1) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport029.stringState0148 = null;
        if (integerArgument1 != 1) {
          return;
        }
        SceneWidgetPart007.booleanState0113 = false;
        if (UiComponentPart032.booleanState0198) {
          MixedSupport020.uiComponentPart012State0001.performAction0656(4210752);
        } else {
          integerLocal1 = GameDomainSupport001.integerState0052;
          if (0 < integerLocal1) {
            if (integerLocal1 == 1) {
              MixedSupport029.stringState0148 = MixedSupport002.stringState0005;
            } else {
              MixedSupport029.stringState0148 = CollectionSupport001.computeString0336(87, MixedSupport066.stringState0274, new String[]{Integer.toString(integerLocal1)});
            }
            MixedSupport029.stringState0148 = DiagnosticSupport001.computeString0367(new CharSequence[]{(CharSequence) ((Object) MixedSupport029.stringState0148), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) PlatformSupport004.stringState0228)}, -62);
          }
          MixedSupport020.uiComponentPart012State0001.performAction0655(-127);
          MixedSupport032.performAction0521(-1199770620);
        }
    }

    final static int computeInteger1235(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 < integerArgument3) {
            integerLocal1 = integerArgument2;
            integerArgument2 = integerArgument3;
            integerArgument3 = integerLocal1;
          }
          if (integerArgument1 < 37) {
            InputAdapter004.performAction1237(77);
          }
          while (integerArgument3 != 0) {
            integerLocal6 = integerArgument2 % integerArgument3;
            integerArgument2 = integerArgument3;
            integerArgument3 = integerLocal6;
          }
          stackIntegerLocal4 = integerArgument2;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "n.E(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    static {
        stringState0356 = "Day";
        stringState0357 = "Total: ";
    }
}
