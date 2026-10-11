/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualNode extends HashNode {
    static String stringState0043;
    static String stringState0044;
    static int[] integerArrayState0017;
    DualNode dualNodeState0003;
    static int[] integerArrayState0018;
    static int integerState0061;
    static MixedSupport066 mixedSupport066State0001;
    static int integerState0062;
    DualNode dualNodeState0004;
    long longState0003;
    static RgbSprite[][] rgbSpriteArrayArrayState0003;

    public static void performAction0140(int integerArgument1) {
        stringState0043 = null;
        integerArrayState0018 = null;
        stringState0044 = null;
        rgbSpriteArrayArrayState0003 = (RgbSprite[][]) null;
        integerArrayState0017 = null;
        int integerLocal1 = -75 / ((-44 - integerArgument1) / 60);
        mixedSupport066State0001 = null;
    }

    final static boolean computeBoolean0139(byte byteArgument1, CharSequence charSequenceArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument1 == 98) {
            stackBooleanLocal2 = MixedSupport121.computeBoolean1725(true, charSequenceArgument2, true, 10);
            return stackBooleanLocal2;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("be.U(").append(byteArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final void performAction0141(long longArgument1, byte byteArgument2) {
        if (this.dualNodeState0004 != null) {
          throw new RuntimeException();
        }
        this.longState0003 = longArgument1;
        if (byteArgument2 < 107) {
          integerState0062 = 116;
          return;
        }
    }

    final static void performAction0142(java.applet.Applet appletArgument1, byte byteArgument2) {
        if (byteArgument2 != -57) {
          return;
        }
        try {
          MixedSupport094.performAction1306(appletArgument1, -1, "");
          SceneWidgetPart014.performAction2012(appletArgument1, 30307);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "be.V(" + (appletArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    final long computeLong0143(byte byteArgument1) {
        if (byteArgument1 != 57) {
          this.computeLong0143((byte) 121);
          return this.longState0003;
        }
        return this.longState0003;
    }

    final static void performAction0138(byte byteArgument1, SceneWidgetPart005 sceneWidgetPart005Argument2) {
        if (sceneWidgetPart005Argument2 == null) {
          return;
        }
        try {
          if (byteArgument1 <= 117) {
            SceneWidgetPart005 sceneWidgetPart005Local1 = (SceneWidgetPart005) null;
            DualNode.performAction0138((byte) 85, (SceneWidgetPart005) null);
          }
          SceneWidgetPart007.sceneWidgetPart005State0002 = sceneWidgetPart005Argument2;
          MixedSupport059.sceneWidgetState0055.nodeDequeState0034.performAction1971(110);
          MixedSupport059.sceneWidgetState0055.performAction1998(SceneWidgetPart007.sceneWidgetPart005State0002, -16834);
          GameDomainSupport004.booleanState0087 = true;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "be.O(" + byteArgument1 + ',' + (sceneWidgetPart005Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0145(byte byteArgument1) {
        if (null == this.dualNodeState0004) {
          return;
        }
        this.dualNodeState0004.dualNodeState0003 = this.dualNodeState0003;
        this.dualNodeState0003.dualNodeState0004 = this.dualNodeState0004;
        if (byteArgument1 >= 68) {
          this.dualNodeState0004 = null;
          this.dualNodeState0003 = null;
          return;
        }
        rgbSpriteArrayArrayState0003 = (RgbSprite[][]) null;
        this.dualNodeState0004 = null;
        this.dualNodeState0003 = null;
    }

    protected DualNode() {
    }

    final boolean computeBoolean0144(byte byteArgument1) {
        if (byteArgument1 == -68) {
          return this.dualNodeState0004 != null ? true : false;
        }
        this.longState0003 = 35L;
        if (this.dualNodeState0004 == null) {
          return false;
        }
        return true;
    }

    static {
        integerArrayState0018 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        integerArrayState0017 = new int[8192];
        stringState0043 = "Unable to delete name - system busy";
        integerState0062 = 0;
        stringState0044 = "Average rating";
        integerState0061 = 0;
        mixedSupport066State0001 = new MixedSupport066();
    }
}
