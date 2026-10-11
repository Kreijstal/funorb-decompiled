/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkSupport003 {
    DualNodeDeque dualNodeDequeState0001;
    static SceneWidget sceneWidgetState0018;
    DualNodeDeque dualNodeDequeState0002;
    static String stringState0107;
    static int[] integerArrayState0031;
    DualNodeDeque dualNodeDequeState0003;
    DualNodeDeque dualNodeDequeState0004;
    PacketBuffer packetBufferState0002;
    int integerState0130;
    long longState0006;
    volatile int integerState0131;
    volatile int integerState0132;
    PacketBuffer packetBufferState0003;
    byte byteState0001;
    ResourceSupport004 resourceSupport004State0001;

    final static String computeString0383(String stringArgument1, int integerArgument2, int integerArgument3) {
        String stackStringLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        Object stackObjectLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        CipherPacketBuffer cipherPacketBufferLocal15 = null;
        CharSequence charSequenceLocal16 = null;
        try {
          charSequenceLocal16 = (CharSequence) ((Object) stringArgument1);
          if (!MixedSupport023.computeBoolean0371(charSequenceLocal16, (byte) -70)) {
            stackStringLocal1 = RenderingSupport003.stringState0199;
            return stackStringLocal1;
          }
          if (MixedSupport070.computeBoolean0943(stringArgument1, true)) {
            stackStringLocal2 = NodeHashTable.stringState0506;
            return stackStringLocal2;
          }
          if (ThemeTips.integerState0351 != 2) {
            stackStringLocal3 = RenderingSupport013.stringState0441;
            return stackStringLocal3;
          }
          if (MixedSupport063.computeBoolean0830(stringArgument1, (byte) -118)) {
            stackStringLocal4 = CollectionSupport001.computeString0336(114, UiComponentPart023.stringState0422, new String[]{stringArgument1});
            return stackStringLocal4;
          }
          if (MixedSupport029.integerState0182 >= 100) {
            stackStringLocal5 = UiComponentPart004.stringState0065;
            return stackStringLocal5;
          }
          if (RenderingSupport013.computeBoolean1525(stringArgument1, 3)) {
            stackStringLocal6 = CollectionSupport001.computeString0336(116, MixedSupport092.stringState0369, new String[]{stringArgument1});
            return stackStringLocal6;
          }
          cipherPacketBufferLocal15 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal15.performAction1861(integerArgument3, -4);
          cipherPacketBufferLocal15.position = cipherPacketBufferLocal15.position + 1;
          integerLocal13 = -88 % ((integerArgument2 - 84) / 41);
          integerLocal14 = cipherPacketBufferLocal15.position;
          cipherPacketBufferLocal15.performAction2073(true, 2);
          cipherPacketBufferLocal15.performAction2066(0, stringArgument1);
          cipherPacketBufferLocal15.performAction2079(cipherPacketBufferLocal15.position - integerLocal14, true);
          stackObjectLocal7 = null;
          return (String) (stackObjectLocal7);
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal11 = caughtParameterLocal17;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal12;
          stackStringBuilderLocal9 = new StringBuilder().append("dd.R(");
          if (stringArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    abstract void performAction0376(Object objectArgument1, byte byteArgument2, boolean booleanArgument3);

    final int computeInteger0384(byte byteArgument1) {
        if (byteArgument1 < -73) {
          return this.dualNodeDequeState0001.computeInteger0030(0) + this.dualNodeDequeState0002.computeInteger0030(0);
        }
        integerArrayState0031 = (int[]) null;
        return this.dualNodeDequeState0001.computeInteger0030(0) + this.dualNodeDequeState0002.computeInteger0030(0);
    }

    final static void performAction0377(String stringArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          SceneWidgetPart012.booleanState0188 = false;
          SceneWidgetPart007.booleanState0113 = false;
          if (MixedSupport020.uiComponentPart012State0001 != null &&
            MixedSupport020.uiComponentPart012State0001.booleanState0011) {
            integerLocal1 = 1;
            if (integerArgument3 == 8) {
              integerArgument3 = 2;
              if (UiComponentPart032.booleanState0198) {
                stringArgument1 = MixedSupport150.stringState0600;
              } else {
                stringArgument1 = MixedSupport024.stringState0115;
              }
              MixedSupport025.uiComponentPart013State0001.performAction0692(SceneWidgetPart004.stringState0217, 30534);
            }
            if (integerArgument3 == 10) {
              integerLocal1 = 0;
              NodeHashTable.performAction1712(-31842);
            }
            if (integerLocal1 != 0) {
              if (SceneWidgetPart012.booleanState0188) {
                stringArgument1 = CollectionSupport001.computeString0336(103, CollectionSupport001.stringState0099, new String[]{stringArgument1});
              }
              if (MixedSupport023.booleanState0025) {
                stringArgument1 = MixedSupport114.stringState0477;
              }
              MixedSupport020.uiComponentPart012State0001.performAction0651((byte) 48, stringArgument1, integerArgument3);
            }
            if (integerArgument3 != 256 &&
              integerArgument3 != 10 &&
              !UiComponentPart032.booleanState0198) {
              MixedSupport025.uiComponentPart013State0001.performAction0688(51);
            }
          }
          if (integerArgument2 == 0) {
            return;
          }
          stringLocal3 = (String) null;
          NetworkSupport003.computeString0383((String) null, 52, 86);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("dd.T(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    abstract void performAction0386(byte byteArgument1);

    final boolean computeBoolean0382(int integerArgument1) {
        if (integerArgument1 == 0) {
          return this.computeInteger0385(0) >= 20 ? true : false;
        }
        this.integerState0132 = -70;
        return this.computeInteger0385(0) >= 20 ? true : false;
    }

    final ResourceSupport004 computeResourceSupport0040379(boolean booleanArgument1, byte byteArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5) {
        long longLocal1 = ((long)integerArgument4 << 32) + (long)integerArgument5;
        if (!booleanArgument3) {
          return (ResourceSupport004) null;
        }
        ResourceSupport004 resourceSupport004Local2 = new ResourceSupport004();
        resourceSupport004Local2.longState0003 = longLocal1;
        resourceSupport004Local2.booleanState0172 = booleanArgument1 ? true : false;
        resourceSupport004Local2.byteState0003 = byteArgument2;
        if (booleanArgument1) {
          if (!(this.computeInteger0384((byte) -109) < 20)) {
            throw new RuntimeException();
          }
          this.dualNodeDequeState0001.performAction0032(resourceSupport004Local2, -7267);
        } else {
          if (!(20 > this.computeInteger0385(0))) {
            throw new RuntimeException();
          }
          this.dualNodeDequeState0003.performAction0032(resourceSupport004Local2, -7267);
        }
        return resourceSupport004Local2;
    }

    abstract boolean computeBoolean0374(byte byteArgument1);

    final int computeInteger0385(int integerArgument1) {
        if (integerArgument1 == 0) {
          return this.dualNodeDequeState0003.computeInteger0030(0) + this.dualNodeDequeState0004.computeInteger0030(0);
        }
        this.resourceSupport004State0001 = (ResourceSupport004) null;
        return this.dualNodeDequeState0003.computeInteger0030(0) + this.dualNodeDequeState0004.computeInteger0030(0);
    }

    final static void performAction0380(boolean booleanArgument1, boolean booleanArgument2, byte byteArgument3) {
        String stringLocal1 = null;
        String stringLocal2;
        if (byteArgument3 == 66) {
          stringLocal1 = (String) null;
          MixedSupport112.performAction1591(booleanArgument1, -85, (String) null, booleanArgument2);
          return;
        }
        sceneWidgetState0018 = (SceneWidget) null;
        stringLocal2 = (String) null;
        MixedSupport112.performAction1591(booleanArgument1, -85, (String) null, booleanArgument2);
    }

    public static void performAction0381(byte byteArgument1) {
        sceneWidgetState0018 = null;
        stringState0107 = null;
        integerArrayState0031 = null;
        int integerLocal1 = -6 % ((-1 - byteArgument1) / 47);
    }

    final boolean computeBoolean0378(boolean booleanArgument1) {
        if (booleanArgument1) {
          return this.computeInteger0384((byte) -95) >= 20 ? true : false;
        }
        this.packetBufferState0002 = (PacketBuffer) null;
        return this.computeInteger0384((byte) -95) >= 20 ? true : false;
    }

    abstract void performAction0375(int integerArgument1);

    NetworkSupport003() {
        this.dualNodeDequeState0001 = new DualNodeDeque();
        this.dualNodeDequeState0002 = new DualNodeDeque();
        this.dualNodeDequeState0003 = new DualNodeDeque();
        this.dualNodeDequeState0004 = new DualNodeDeque();
        this.packetBufferState0002 = new PacketBuffer(6);
        this.integerState0132 = 0;
        this.integerState0131 = 0;
        this.byteState0001 = (byte) 0;
        this.packetBufferState0003 = new PacketBuffer(10);
    }

    static {
        stringState0107 = "Email address is unavailable";
        integerArrayState0031 = new int[8192];
    }
}
