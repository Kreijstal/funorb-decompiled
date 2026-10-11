/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport113 {
    private HashNode hashNodeState0007;
    private NodeDeque nodeDequeState0029;
    static boolean[] booleanArrayState0009;
    static SceneWidget sceneWidgetState0103;
    static SceneWidget sceneWidgetState0104;

    final static SceneWidget computeSceneWidget1613(int integerArgument1) {
        if (integerArgument1 > -26) {
          MixedSupport113.computeInteger1604((byte) -21, 73, 124);
          return UiComponentPart007.computeSceneWidget0394(119);
        }
        return UiComponentPart007.computeSceneWidget0394(119);
    }

    final HashNode computeHashNode1607(HashNode hashNodeArgument1, boolean booleanArgument2) {
        HashNode hashNodeLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        HashNode stackHashNodeLocal3 = null;
        Object stackObjectLocal4 = null;
        HashNode stackHashNodeLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (booleanArgument2) {
            stackHashNodeLocal3 = (HashNode) null;
            return stackHashNodeLocal3;
          }
          if (hashNodeArgument1 == null) {
            hashNodeLocal1 = this.nodeDequeState0029.hashNodeState0009.previous;
          } else {
            hashNodeLocal1 = hashNodeArgument1;
          }
          if (hashNodeLocal1 == this.nodeDequeState0029.hashNodeState0009) {
            this.hashNodeState0007 = null;
            stackObjectLocal4 = null;
            return (HashNode) (stackObjectLocal4);
          }
          this.hashNodeState0007 = hashNodeLocal1.previous;
          stackHashNodeLocal5 = hashNodeLocal1;
          return stackHashNodeLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("rd.J(");
          if (hashNodeArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    public static void performAction1612(byte byteArgument1) {
        booleanArrayState0009 = null;
        sceneWidgetState0104 = null;
        if (byteArgument1 != -119) {
          booleanArrayState0009 = (boolean[]) null;
          sceneWidgetState0103 = null;
          return;
        }
        sceneWidgetState0103 = null;
    }

    final HashNode computeHashNode1605(int integerArgument1) {
        HashNode hashNodeLocal1 = this.hashNodeState0007;
        if (integerArgument1 >= -40) {
          booleanArrayState0009 = (boolean[]) null;
          if (this.nodeDequeState0029.hashNodeState0009 == hashNodeLocal1) {
            this.hashNodeState0007 = null;
            return null;
          }
          this.hashNodeState0007 = hashNodeLocal1.previous;
          return hashNodeLocal1;
        }
        if (this.nodeDequeState0029.hashNodeState0009 == hashNodeLocal1) {
          this.hashNodeState0007 = null;
          return null;
        }
        this.hashNodeState0007 = hashNodeLocal1.previous;
        return hashNodeLocal1;
    }

    final static int computeInteger1610(String stringArgument1, int integerArgument2, String stringArgument3, String stringArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        LoginCredentials loginCredentialsLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        LoginCredentials loginCredentialsLocal3 = null;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          loginCredentialsLocal1 = new LoginCredentials(stringArgument4);
          if (integerArgument5 != 0) {
            stackIntegerLocal4 = -75;
            return stackIntegerLocal4;
          }
          loginCredentialsLocal3 = new LoginCredentials(stringArgument3);
          stackIntegerLocal5 = NetworkArchiveRequestManager.computeInteger1469(booleanArgument7, integerArgument2, loginCredentialsLocal1, -109, integerArgument6, loginCredentialsLocal3, stringArgument1);
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("rd.C(");
          if (stringArgument1 == null) {
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
          if (stringArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    final HashNode computeHashNode1611(boolean booleanArgument1) {
        HashNode hashNodeLocal1 = this.nodeDequeState0029.hashNodeState0009.next;
        if (!booleanArgument1) {
          String stringLocal2 = (String) null;
          MixedSupport113.computeInteger1610((String) null, 14, (String) null, (String) null, -52, 96, false);
          if (hashNodeLocal1 == this.nodeDequeState0029.hashNodeState0009) {
            this.hashNodeState0007 = null;
            return null;
          }
          this.hashNodeState0007 = hashNodeLocal1.next;
          return hashNodeLocal1;
        }
        if (hashNodeLocal1 == this.nodeDequeState0029.hashNodeState0009) {
          this.hashNodeState0007 = null;
          return null;
        }
        this.hashNodeState0007 = hashNodeLocal1.next;
        return hashNodeLocal1;
    }

    final HashNode computeHashNode1606(HashNode hashNodeArgument1, byte byteArgument2) {
        HashNode hashNodeLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        Object stackObjectLocal3 = null;
        HashNode stackHashNodeLocal4 = null;
        HashNode stackHashNodeLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (hashNodeArgument1 == null) {
            hashNodeLocal1 = this.nodeDequeState0029.hashNodeState0009.next;
          } else {
            hashNodeLocal1 = hashNodeArgument1;
          }
          if (this.nodeDequeState0029.hashNodeState0009 == hashNodeLocal1) {
            this.hashNodeState0007 = null;
            stackObjectLocal3 = null;
            return (HashNode) (stackObjectLocal3);
          }
          this.hashNodeState0007 = hashNodeLocal1.next;
          if (byteArgument2 == -88) {
            stackHashNodeLocal5 = hashNodeLocal1;
            return stackHashNodeLocal5;
          }
          stackHashNodeLocal4 = (HashNode) null;
          return stackHashNodeLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("rd.K(");
          if (hashNodeArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    MixedSupport113(NodeDeque nodeDequeArgument1) {
        try {
          this.nodeDequeState0029 = nodeDequeArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "rd.<init>(" + (nodeDequeArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final HashNode computeHashNode1615(int integerArgument1) {
        HashNode hashNodeLocal1 = this.hashNodeState0007;
        if (hashNodeLocal1 == this.nodeDequeState0029.hashNodeState0009) {
          this.hashNodeState0007 = null;
          return null;
        }
        if (integerArgument1 == 2078965185) {
          this.hashNodeState0007 = hashNodeLocal1.next;
          return hashNodeLocal1;
        }
        MixedSupport113.computeSceneWidget1613(-96);
        this.hashNodeState0007 = hashNodeLocal1.next;
        return hashNodeLocal1;
    }

    final HashNode computeHashNode1603(byte byteArgument1) {
        HashNode hashNodeLocal1 = this.nodeDequeState0029.hashNodeState0009.previous;
        if (byteArgument1 != 71) {
          String stringLocal2 = (String) null;
          MixedSupport113.computeInteger1610((String) null, -87, (String) null, (String) null, -5, -114, false);
          if (hashNodeLocal1 != this.nodeDequeState0029.hashNodeState0009) {
            this.hashNodeState0007 = hashNodeLocal1.previous;
            return hashNodeLocal1;
          }
          this.hashNodeState0007 = null;
          return null;
        }
        if (hashNodeLocal1 != this.nodeDequeState0029.hashNodeState0009) {
          this.hashNodeState0007 = hashNodeLocal1.previous;
          return hashNodeLocal1;
        }
        this.hashNodeState0007 = null;
        return null;
    }

    final static void performAction1608(java.applet.Applet appletArgument1, boolean booleanArgument2) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (booleanArgument2) {
            MixedSupport113.performAction1614(-42);
          }
          stringLocal1 = appletArgument1.getParameter("username");
          if (stringLocal1 != null) {
            charSequenceLocal3 = (CharSequence) ((Object) stringLocal1);
            if (DualNodeDeque.computeLong0031(120, charSequenceLocal3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("rd.H(");
          if (appletArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final static int computeInteger1604(byte byteArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != 16) {
            MixedSupport113.computeSceneWidget1613(15);
          }
          integerLocal1 = 0;
          while (0 < integerArgument2) {
            integerLocal1 = integerLocal1 << 1 | integerArgument3 & 1;
            integerArgument3 = integerArgument3 >>> 1;
            integerArgument2--;
          }
          stackIntegerLocal4 = integerLocal1;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal2 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "rd.G(" + byteArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final static boolean computeBoolean1609(CharSequence charSequenceArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 == -27454) {
            stackBooleanLocal2 = MixedSupport136.computeBoolean1872(charSequenceArgument1, false, 100);
            return stackBooleanLocal2;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("rd.I(");
          if (charSequenceArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static void performAction1614(int integerArgument1) {
        int[] integerArrayLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int[] integerArrayLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerArrayLocal5 = MixedSupport001.integerArrayState0001;
          integerArrayLocal1 = integerArrayLocal5;
          integerLocal2 = integerArgument1;
          integerLocal3 = integerArrayLocal5.length;
          while (integerLocal2 < integerLocal3) {
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
            integerArrayLocal5[integerLocal2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal7), "rd.M(" + integerArgument1 + ')');
        }
    }

    static {
    }
}
