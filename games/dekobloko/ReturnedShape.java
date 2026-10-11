/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReturnedShape {
    byte[] packedCells;
    int integerState0687;
    int integerState0688;
    int height;
    int width;
    int integerState0691;
    static MixedSupport111 mixedSupport111State0009;
    int integerState0692;
    static String stringState0472;
    static String stringState0473;
    static int integerState0693;
    static String stringState0474;
    static int integerState0694;
    static int integerState0695;
    static int integerState0696;
    static int integerState0697;

    final static ClientException[] computeClientExceptionArray1624(int integerArgument1, CipherPacketBuffer cipherPacketBufferArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        ClientException[] clientExceptionArrayLocal5 = null;
        int integerLocal6 = 0;
        ClientException clientExceptionLocal7 = null;
        int integerLocal8 = 0;
        Object stackObjectLocal9 = null;
        ClientException[] stackClientExceptionArrayLocal10 = null;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = cipherPacketBufferArgument2.computeInteger1857(8, (byte) 80);
          if (integerLocal2 > 0) {
            stackObjectLocal9 = null;
            return (ClientException[]) (stackObjectLocal9);
          }
          if (integerArgument1 <= 121) {
            stringState0474 = (String) null;
          }
          integerLocal4 = cipherPacketBufferArgument2.computeInteger1857(12, (byte) 77);
          clientExceptionArrayLocal5 = new ClientException[integerLocal4];
          for (integerLocal1 = 0; integerLocal1 < integerLocal4; integerLocal1++) {
            if (MouseInput.computeBoolean2036(cipherPacketBufferArgument2, (byte) 26)) {
              clientExceptionLocal7 = new ClientException();
              cipherPacketBufferArgument2.computeInteger1857(24, (byte) 40);
              cipherPacketBufferArgument2.computeInteger1857(24, (byte) 73);
              clientExceptionLocal7.integerState0139 = cipherPacketBufferArgument2.computeInteger1857(24, (byte) 42);
              cipherPacketBufferArgument2.computeInteger1857(9, (byte) 98);
              cipherPacketBufferArgument2.computeInteger1857(12, (byte) 77);
              cipherPacketBufferArgument2.computeInteger1857(12, (byte) 86);
              cipherPacketBufferArgument2.computeInteger1857(12, (byte) 108);
              clientExceptionArrayLocal5[integerLocal1] = clientExceptionLocal7;
            } else {
              integerLocal6 = cipherPacketBufferArgument2.computeInteger1857(ComponentDecorator.computeInteger1137(integerLocal1 - 1, (byte) 49), (byte) 118);
              clientExceptionArrayLocal5[integerLocal1] = clientExceptionArrayLocal5[integerLocal6];
            }
          }
          stackClientExceptionArrayLocal10 = clientExceptionArrayLocal5;
          return stackClientExceptionArrayLocal10;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal14 = caughtParameterLocal15;
          runtimeExceptionLocal3 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal11 = runtimeExceptionLocal3;
          stackStringBuilderLocal12 = new StringBuilder().append("rf.D(").append(integerArgument1).append(',');
          if (cipherPacketBufferArgument2 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(')').toString());
        }
    }

    final static void performAction1625(int integerArgument1, boolean booleanArgument2, float floatArgument3, String stringArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (null == NetworkSupport010.uiComponentPart026State0001) {
            NetworkSupport010.uiComponentPart026State0001 = new UiComponentPart026(MixedSupport005.uiComponentPart016State0001, MixedSupport029.stringState0148);
            MixedSupport005.uiComponentPart016State0001.performAction0945((byte) -107, NetworkSupport010.uiComponentPart026State0001);
          }
          NetworkSupport010.uiComponentPart026State0001.performAction1580(booleanArgument2, floatArgument3, 4210752, stringArgument4);
          SoftwareRaster.performAction0727();
          RenderingSupport002.performAction0268(true, integerArgument1 + 106);
          if (integerArgument1 != 12) {
            mixedSupport111State0009 = (MixedSupport111) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("rf.A(").append(integerArgument1).append(',').append(booleanArgument2).append(',').append(floatArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    public static void performAction1626(boolean booleanArgument1) {
        stringState0474 = null;
        stringState0472 = null;
        stringState0473 = null;
        if (booleanArgument1) {
          CipherPacketBuffer cipherPacketBufferLocal1 = (CipherPacketBuffer) null;
          ReturnedShape.computeClientExceptionArray1624(88, (CipherPacketBuffer) null);
        }
        mixedSupport111State0009 = null;
    }

    final static void performAction1621(byte byteArgument1) {
        Throwable caughtExceptionLocal1 = null;
        Object objectLocal2 = null;
        if (byteArgument1 != 0) {
          return;
        }
        if (null != MixedSupport063.mouseInputState0001) {
          objectLocal2 = MixedSupport063.mouseInputState0001;
          synchronized (objectLocal2) {
            MixedSupport063.mouseInputState0001 = null;
          }
        }
    }

    final static void performAction1623(int integerArgument1, java.awt.Component componentArgument2) {
        try {
          if (integerArgument1 != 12) {
            String stringLocal1 = (String) null;
            ReturnedShape.performAction1625(29, true, 0.5555365681648254f, (String) null);
          }
          componentArgument2.removeKeyListener(MixedSupport033.inputAdapter004State0001);
          componentArgument2.removeFocusListener(MixedSupport033.inputAdapter004State0001);
          MixedSupport154.integerState0933 = -1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "rf.F(" + integerArgument1 + ',' + (componentArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger1622(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        if (integerArgument2 == integerArgument1) {
          integerLocal1 = BufferedSocket.integerState0667;
        }
        if (integerArgument2 == 1) {
          integerLocal1 = MixedSupport153.integerState0932;
        }
        if (integerArgument2 == 2) {
          integerLocal1 = PacketBuffer.integerState0936;
        }
        return integerLocal1;
    }

    final static void performAction1627(String[] args, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, java.applet.Applet appletArgument6) {
        int integerLocal1 = 0;
        String stringLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          SoftwareFramebuffer.stringState0617 = appletArgument6.getParameter("overxgames");
          if (SoftwareFramebuffer.stringState0617 == null) {
            SoftwareFramebuffer.stringState0617 = "0";
          }
          MixedSupport069.stringState0291 = appletArgument6.getParameter("overxachievements");
          if (integerArgument4 > -22) {
            stringState0474 = (String) null;
          }
          if (MixedSupport069.stringState0291 == null) {
            MixedSupport069.stringState0291 = "0";
          }
          stringLocal2 = appletArgument6.getParameter("currency");
          if (stringLocal2 == null) {
            MixedSupport112.integerState0683 = 2;
          } else {
            if (!DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal2))) {
              MixedSupport112.integerState0683 = 2;
            } else {
              MixedSupport112.integerState0683 = MixedSupport014.computeInteger0207((byte) -33, (CharSequence) ((Object) stringLocal2));
            }
          }
          SceneWidget.integerState0909 = integerArgument3;
          MixedSupport093.integerState0546 = integerArgument5;
          UiComponentPart026.integerState0673 = integerArgument2;
          MixedSupport147.rgbSpriteArrayState0031 = new RgbSprite[args.length];
          for (integerLocal1 = 0; integerLocal1 < args.length; integerLocal1++) {
            MixedSupport147.rgbSpriteArrayState0031[integerLocal1] = new RgbSprite(317, 34);
          }
          UiComponentPart009.stringArrayState0008 = args;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal10;
          stackStringBuilderLocal5 = new StringBuilder().append("rf.B(");
          if (args == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (appletArgument6 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    ReturnedShape(int integerArgument1) {
        this.integerState0688 = integerArgument1;
    }

    static {
        mixedSupport111State0009 = new MixedSupport111(14, 0, 4, 1);
        stringState0472 = "Unpacking sound effects";
        stringState0474 = "When you match pieces, the machine transforms them into solid shapes.";
        stringState0473 = "Show game chat from my friends";
        integerState0696 = 2;
        integerState0694 = 0;
    }
}
