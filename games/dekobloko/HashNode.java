/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HashNode {
    static String stringState0050;
    static String stringState0051;
    static RgbSprite[][] rgbSpriteArrayArrayState0004;
    static String stringState0052;
    static String stringState0053;
    HashNode next;
    HashNode previous;
    static int integerState0068;
    static String[] stringArrayState0002;
    static int integerState0069;
    long key;
    static MixedSupport139 mixedSupport139State0002;
    static int integerState0070;

    final boolean computeBoolean0156(byte byteArgument1) {
        if (byteArgument1 > 34) {
          return this.next != null ? true : false;
        }
        mixedSupport139State0002 = (MixedSupport139) null;
        if (this.next == null) {
          return false;
        }
        return true;
    }

    final static void performAction0157(int integerArgument1, int integerArgument2) {
        Object objectLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 > -116) {
            return;
          }
          objectLocal1 = (MixedSupport034) (MixedSupport117.nodeDequeState0030.computeHashNode1970((byte) -114));
          do {
            if (objectLocal1 == null) {
              objectLocal1 = NetworkSupport002.nodeDequeState0002.computeHashNode1970((byte) 99);
              break;
            }
            SceneWidget.performAction1995(124, integerArgument1, (MixedSupport034) (objectLocal1));
            objectLocal1 = (MixedSupport034) (MixedSupport117.nodeDequeState0030.computeHashNode1974(true));
          } while (integerLocal2 == 0);
          while (true) {
            if (objectLocal1 == null) {
              return;
            }
            ResourceSupport001.performAction0046(-1, integerArgument1);
            objectLocal1 = NetworkSupport002.nodeDequeState0002.computeHashNode1974(true);
            if (integerLocal2 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          objectLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (objectLocal1), "bh.CB(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final void performAction0161(byte byteArgument1) {
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        if (byteArgument1 >= 100) {
          this.next = null;
          this.previous = null;
          return;
        }
        integerState0070 = -105;
        this.next = null;
        this.previous = null;
    }

    final static void performAction0158(int integerArgument1, java.applet.Applet appletArgument2) {
        try {
          java.net.URL uRLLocal1 = null;
          Exception exceptionLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          java.applet.Applet appletLocal4 = null;
          RuntimeException stackRuntimeExceptionLocal5 = null;
          StringBuilder stackStringBuilderLocal6 = null;
          String stackStringLocal7 = null;
          Throwable caughtExceptionLocal8 = null;
          try {
            try {
              if (integerArgument1 > -98) {
                appletLocal4 = (java.applet.Applet) null;
                HashNode.performAction0158(-55, (java.applet.Applet) null);
              }
              uRLLocal1 = new java.net.URL(appletArgument2.getCodeBase(), "tosupport.ws");
              appletArgument2.getAppletContext().showDocument(NetworkSupport004.computeURL0662(uRLLocal1, -1, appletArgument2), "_top");
              return;
            } catch (java.lang.Exception caughtParameterLocal9) {
              caughtExceptionLocal8 = caughtParameterLocal9;
              exceptionLocal2 = (Exception) (Object) caughtExceptionLocal8;
              exceptionLocal2.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal10) {
            caughtExceptionLocal8 = caughtParameterLocal10;
            runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal8;
            stackRuntimeExceptionLocal5 = runtimeExceptionLocal3;
            stackStringBuilderLocal6 = new StringBuilder().append("bh.VA(").append(integerArgument1).append(',');
            if (appletArgument2 == null) {
              stackStringLocal7 = "null";
            } else {
              stackStringLocal7 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    public static void performAction0162(int integerArgument1) {
        rgbSpriteArrayArrayState0004 = (RgbSprite[][]) null;
        stringState0051 = null;
        stringState0050 = null;
        if (integerArgument1 == 25189) {
          mixedSupport139State0002 = null;
          stringArrayState0002 = null;
          stringState0052 = null;
          stringState0053 = null;
          return;
        }
        HashNode.performAction0162(-88);
        mixedSupport139State0002 = null;
        stringArrayState0002 = null;
        stringState0052 = null;
        stringState0053 = null;
    }

    final static int computeInteger0160(int integerArgument1, boolean booleanArgument2, CharSequence charSequenceArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (booleanArgument2) {
            stringState0050 = (String) null;
          }
          stackIntegerLocal2 = SceneWidgetPart010.computeInteger1666(true, 4, integerArgument1, charSequenceArgument3);
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("bh.BB(").append(integerArgument1).append(',').append(booleanArgument2).append(',');
          if (charSequenceArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static String computeString0159(int integerArgument1, String stringArgument2, String stringArgument3, String stringArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        String stackStringLocal3 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 0) {
          integerState0070 = -96;
        }
        integerLocal1 = stringArgument2.indexOf(stringArgument4);
        while (true) {
          if (integerLocal1 == -1) {
            return stringArgument2;
          }
          stringArgument2 = stringArgument2.substring(0, integerLocal1) + stringArgument3 + stringArgument2.substring(stringArgument4.length() + integerLocal1);
          stackStringLocal3 = (String) (stringArgument2);
          if (integerLocal2 != 0) {
            return stackStringLocal3;
          }
          integerLocal1 = ((String) (Object) stackStringLocal3).indexOf(stringArgument4, stringArgument3.length() + integerLocal1);
        }
    }

    static {
        stringState0050 = "This is <%0>'s RuneScape clan if they have one.";
        stringState0052 = "RuneScape clan";
        rgbSpriteArrayArrayState0004 = new RgbSprite[8][];
        stringState0053 = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        stringArrayState0002 = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        integerState0069 = 0;
        stringState0051 = "You can ask to join this game";
        integerState0070 = -1;
        mixedSupport139State0002 = new MixedSupport139();
    }
}
