/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInput implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int integerState0928;
    static String stringState0619;
    static RgbSprite rgbSpriteState0072;
    static ResourceArchive resourceArchiveState0026;
    static MixedSupport111 mixedSupport111State0014;
    static RgbSprite rgbSpriteState0073;
    static int integerState0929;
    static boolean booleanState0223;
    static long longState0054;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent mouseEventArgument1) {
        try {
          if (null != MixedSupport063.mouseInputState0001) {
            MixedSupport104.integerState0579 = 0;
            Sprite.integerState0424 = mouseEventArgument1.getX();
            MixedSupport126.integerState0775 = mouseEventArgument1.getY();
            TranslatedUiText.booleanState0115 = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wg.mouseEntered(" + (mouseEventArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger2038(boolean booleanArgument1, CharSequence charSequenceArgument2, char characterArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = 0;
          integerLocal3 = charSequenceArgument2.length();
          for (integerLocal1 = 0; integerLocal3 > integerLocal1; integerLocal1++) {
            if (~charSequenceArgument2.charAt(integerLocal1) == ~characterArgument3) {
              integerLocal2++;
            }
          }
          if (!booleanArgument1) {
            integerState0928 = 126;
          }
          stackIntegerLocal5 = integerLocal2;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("wg.A(").append(booleanArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(characterArgument3).append(')').toString());
        }
    }

    public static void performAction2037(boolean booleanArgument1) {
        stringState0619 = null;
        rgbSpriteState0072 = null;
        mixedSupport111State0014 = null;
        resourceArchiveState0026 = null;
        if (!booleanArgument1) {
          return;
        }
        rgbSpriteState0073 = null;
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent mouseEventArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (null != MixedSupport063.mouseInputState0001) {
            MixedSupport104.integerState0579 = 0;
            UiComponentPart022.integerState0572 = 0;
            TranslatedUiText.booleanState0115 = true;
            integerLocal1 = mouseEventArgument1.getModifiers();
            if ((8 & integerLocal1) == 0) {
            }
            if (0 == (16 & integerLocal1)) {
            }
            if (0 != (integerLocal1 & 4)) {
            }
          }
          if (!mouseEventArgument1.isPopupTrigger()) {
            return;
          }
          mouseEventArgument1.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("wg.mouseReleased(");
          if (mouseEventArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent mouseEventArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport063.mouseInputState0001 == null) {
            return;
          }
          MixedSupport104.integerState0579 = 0;
          Sprite.integerState0424 = mouseEventArgument1.getX();
          MixedSupport126.integerState0775 = mouseEventArgument1.getY();
          TranslatedUiText.booleanState0115 = true;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("wg.mouseMoved(");
          if (mouseEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static void performAction2039(boolean booleanArgument1, PacketBuffer packetBufferArgument2, SceneWidgetPart013 sceneWidgetPart013Argument3, byte byteArgument4) {
        int integerLocal1 = 0;
        SceneWidgetPart013 stackSceneWidgetPart013Local2 = null;
        boolean stackBooleanLocal3 = false;
        SceneWidgetPart013 stackSceneWidgetPart013Local4 = null;
        boolean stackBooleanLocal5 = false;
        SceneWidgetPart013 stackSceneWidgetPart013Local6 = null;
        boolean stackBooleanLocal7 = false;
        SceneWidgetPart013 stackSceneWidgetPart013Local8 = null;
        boolean stackBooleanLocal9 = false;
        SceneWidgetPart013 stackSceneWidgetPart013Local10 = null;
        boolean stackBooleanLocal11 = false;
        SceneWidgetPart013 stackSceneWidgetPart013Local12 = null;
        int stackIntegerLocal13 = 0;
        int stackIntegerLocal14 = 0;
        int stackIntegerLocal15 = 0;
        RuntimeException stackRuntimeExceptionLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        RuntimeException caughtExceptionLocal21 = null;
        int integerLocal22 = 0;
        RuntimeException runtimeExceptionLocal23 = null;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        integerLocal27 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument1) {
            sceneWidgetPart013Argument3.integerState0843 = packetBufferArgument2.computeInteger2085((byte) -75);
          }
          sceneWidgetPart013Argument3.integerState0840 = packetBufferArgument2.computeInteger2085((byte) -75);
          sceneWidgetPart013Argument3.integerState0842 = packetBufferArgument2.computeInteger2085((byte) -62);
          integerLocal22 = packetBufferArgument2.computeInteger2085((byte) -95);
          stackSceneWidgetPart013Local2 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          stackBooleanLocal3 = ((128 & integerLocal22) != 0);
          stackSceneWidgetPart013Local2.booleanState0199 = stackBooleanLocal3;
          stackSceneWidgetPart013Local4 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          stackBooleanLocal5 = ((32 & integerLocal22) != 0);
          stackSceneWidgetPart013Local4.booleanState0208 = stackBooleanLocal5;
          stackSceneWidgetPart013Local6 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          stackBooleanLocal7 = (sceneWidgetPart013Argument3.booleanState0199) && (sceneWidgetPart013Argument3.integerState0843 < sceneWidgetPart013Argument3.integerState0840);
          stackSceneWidgetPart013Local6.booleanState0205 = stackBooleanLocal7;
          stackSceneWidgetPart013Local8 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          stackBooleanLocal9 = ((64 & integerLocal22) != 0);
          stackSceneWidgetPart013Local8.booleanState0204 = stackBooleanLocal9;
          stackSceneWidgetPart013Local10 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          stackBooleanLocal11 = ((integerLocal22 & 8) != 0);
          stackSceneWidgetPart013Local10.booleanState0201 = stackBooleanLocal11;
          stackSceneWidgetPart013Local12 = (SceneWidgetPart013) (sceneWidgetPart013Argument3);
          if (0 != (16 & integerLocal22)) {
            stackIntegerLocal13 = 2;
          } else {
            stackIntegerLocal13 = 1;
          }
          stackSceneWidgetPart013Local12.integerState0845 = stackIntegerLocal13;
          stackIntegerLocal14 = (0 == (4 & integerLocal22)) ? 0 : 1;
          integerLocal24 = stackIntegerLocal14;
          stackIntegerLocal15 = ((integerLocal22 & 2) == 0) ? 0 : 1;
          integerLocal25 = stackIntegerLocal15;
          packetBufferArgument2.performAction2075(sceneWidgetPart013Argument3.byteArrayState0032, 0, (byte) 126, sceneWidgetPart013Argument3.byteArrayState0032.length);
          sceneWidgetPart013Argument3.integerState0838 = packetBufferArgument2.computeInteger2089(3);
          sceneWidgetPart013Argument3.longState0052 = MixedSupport063.computeLong0827(4) - (long)packetBufferArgument2.computeInteger2096(7553);
          if (integerLocal24 == 0) {
            sceneWidgetPart013Argument3.integerState0841 = -1;
          } else {
            sceneWidgetPart013Argument3.integerState0841 = packetBufferArgument2.computeInteger2096(7553);
          }
          if (byteArgument4 > -41) {
            return;
          }
          sceneWidgetPart013Argument3.longState0053 = packetBufferArgument2.computeLong2091((byte) -108);
          integerLocal26 = packetBufferArgument2.position;
          sceneWidgetPart013Argument3.stringState0585 = packetBufferArgument2.computeString2082((byte) -38);
          if (integerLocal25 == 0) {
            sceneWidgetPart013Argument3.stringArrayState0052 = null;
            return;
          }
          sceneWidgetPart013Argument3.stringArrayState0052 = new String[sceneWidgetPart013Argument3.integerState0843];
          packetBufferArgument2.position = integerLocal26;
          for (integerLocal1 = 0; sceneWidgetPart013Argument3.integerState0843 > integerLocal1; integerLocal1++) {
            sceneWidgetPart013Argument3.stringArrayState0052[integerLocal1] = packetBufferArgument2.computeString2082((byte) -38);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal28) {
          caughtExceptionLocal21 = caughtParameterLocal28;
          runtimeExceptionLocal23 = caughtExceptionLocal21;
          stackRuntimeExceptionLocal16 = runtimeExceptionLocal23;
          stackStringBuilderLocal17 = new StringBuilder().append("wg.C(").append(booleanArgument1).append(',');
          if (packetBufferArgument2 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',');
          if (sceneWidgetPart013Argument3 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal16), ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean2036(CipherPacketBuffer cipherPacketBufferArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = 82 % ((-69 - byteArgument2) / 43);
          stackBooleanLocal3 = (cipherPacketBufferArgument1.computeInteger1857(1, (byte) 53) == 1);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("wg.D(");
          if (cipherPacketBufferArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent focusEventArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport063.mouseInputState0001 == null) {
            return;
          }
          UiComponentPart022.integerState0572 = 0;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("wg.focusLost(");
          if (focusEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent mouseEventArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (MixedSupport063.mouseInputState0001 != null) {
            MixedSupport104.integerState0579 = 0;
            RenderingSupport003.integerState0253 = mouseEventArgument1.getX();
            MixedSupport108.integerState0597 = mouseEventArgument1.getY();
            MixedSupport063.computeLong0827(4);
            if (javax.swing.SwingUtilities.isRightMouseButton(mouseEventArgument1)) {
              CollectionSupport003.integerState0544 = 2;
              UiComponentPart022.integerState0572 = 2;
            } else {
              CollectionSupport003.integerState0544 = 1;
              UiComponentPart022.integerState0572 = 1;
            }
            integerLocal1 = mouseEventArgument1.getModifiers();
            if (0 != (4 & integerLocal1)) {
            }
            TranslatedUiText.booleanState0115 = true;
            if ((integerLocal1 & 16) == 0) {
            }
            if ((integerLocal1 & 8) == 0) {
            }
          }
          if (!mouseEventArgument1.isPopupTrigger()) {
            return;
          }
          mouseEventArgument1.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("wg.mousePressed(");
          if (mouseEventArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent mouseEventArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport063.mouseInputState0001 == null) {
            return;
          }
          MixedSupport104.integerState0579 = 0;
          Sprite.integerState0424 = mouseEventArgument1.getX();
          MixedSupport126.integerState0775 = mouseEventArgument1.getY();
          TranslatedUiText.booleanState0115 = true;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("wg.mouseDragged(");
          if (mouseEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent mouseEventArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!mouseEventArgument1.isPopupTrigger()) {
            return;
          }
          mouseEventArgument1.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("wg.mouseClicked(");
          if (mouseEventArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent focusEventArgument1) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent mouseEventArgument1) {
        try {
          if (MixedSupport063.mouseInputState0001 != null) {
            MixedSupport104.integerState0579 = 0;
            Sprite.integerState0424 = -1;
            MixedSupport126.integerState0775 = -1;
            TranslatedUiText.booleanState0115 = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wg.mouseExited(" + (mouseEventArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0619 = "Find opponents";
        mixedSupport111State0014 = new MixedSupport111(11, 0, 1, 2);
    }
}
