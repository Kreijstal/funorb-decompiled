/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CollectionSupport003 {
    static int integerState0540;
    static String stringState0367;
    static boolean booleanState0121;
    private int integerState0541;
    private int integerState0542;
    private DualNode dualNodeState0007;
    private DualNode dualNodeState0008;
    static int integerState0543;
    private DualNode[] dualNodeArrayState0001;
    private long longState0039;
    static MixedSupport111 mixedSupport111State0006;
    static int[] integerArrayState0169;
    static String[][] stringArrayArrayState0006;
    static volatile int integerState0544;
    static boolean booleanState0122;

    public static void performAction1279(int integerArgument1) {
        stringState0367 = null;
        stringArrayArrayState0006 = (String[][]) null;
        integerArrayState0169 = null;
        mixedSupport111State0006 = null;
        if (integerArgument1 > -31) {
          byte[] byteArrayLocal1 = (byte[]) null;
          CollectionSupport003.performAction1283((SceneWidget) null, (SceneWidget) null, 83, -100, -58, (SceneWidget) null, (byte[]) null, 7, 17, -108);
        }
    }

    final DualNode computeDualNode1284(int integerArgument1) {
        int integerLocal1 = 0;
        DualNode dualNodeLocal2;
        int integerLocal3;
        int integerLocal4;
        DualNode dualNodeLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.integerState0542 > 0 &&
          this.dualNodeArrayState0001[-1 + this.integerState0542] != this.dualNodeState0007) {
          dualNodeLocal2 = this.dualNodeState0007;
          this.dualNodeState0007 = dualNodeLocal2.dualNodeState0003;
          return dualNodeLocal2;
        }
        do {
          if (this.integerState0542 >= this.integerState0541) {
            integerLocal3 = -38 / ((integerArgument1 + 21) / 56);
            return null;
          }
          integerLocal1 = this.integerState0542;
          this.integerState0542 = this.integerState0542 + 1;
          dualNodeLocal5 = this.dualNodeArrayState0001[integerLocal1].dualNodeState0003;
          dualNodeLocal2 = dualNodeLocal5;
        } while (dualNodeLocal5 == this.dualNodeArrayState0001[this.integerState0542 - 1]);
        this.dualNodeState0007 = dualNodeLocal2.dualNodeState0003;
        return dualNodeLocal2;
    }

    final DualNode computeDualNode1286(int integerArgument1) {
        DualNode dualNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (null == this.dualNodeState0008) {
          return null;
        }
        if (integerArgument1 != -17713) {
          return (DualNode) null;
        }
        DualNode dualNodeLocal3 = this.dualNodeArrayState0001[(int)((long)(this.integerState0541 - 1) & this.longState0039)];
        while (dualNodeLocal3 != this.dualNodeState0008) {
          if (this.dualNodeState0008.longState0003 == this.longState0039) {
            dualNodeLocal1 = this.dualNodeState0008;
            this.dualNodeState0008 = this.dualNodeState0008.dualNodeState0003;
            return dualNodeLocal1;
          }
          this.dualNodeState0008 = this.dualNodeState0008.dualNodeState0003;
        }
        this.dualNodeState0008 = null;
        return null;
    }

    final void performAction1281(DualNode dualNodeArgument1, int integerArgument2, long longArgument3) {
        DualNode dualNodeLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (null != dualNodeArgument1.dualNodeState0004) {
            dualNodeArgument1.performAction0145((byte) 75);
          }
          dualNodeLocal1 = this.dualNodeArrayState0001[(int)((long)(this.integerState0541 - 1) & longArgument3)];
          dualNodeArgument1.dualNodeState0003 = dualNodeLocal1;
          dualNodeArgument1.dualNodeState0004 = dualNodeLocal1.dualNodeState0004;
          dualNodeArgument1.dualNodeState0004.dualNodeState0003 = dualNodeArgument1;
          dualNodeArgument1.longState0003 = longArgument3;
          dualNodeArgument1.dualNodeState0003.dualNodeState0004 = dualNodeArgument1;
          if (integerArgument2 != -1) {
            this.computeDualNode1284(85);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("nk.A(");
          if (dualNodeArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(',').append(longArgument3).append(')').toString());
        }
    }

    final DualNode computeDualNode1285(int integerArgument1) {
        this.integerState0542 = 0;
        if (integerArgument1 != -9443) {
          booleanState0122 = true;
        }
        return this.computeDualNode1284(-81);
    }

    final static void performAction1283(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, int integerArgument3, int integerArgument4, int integerArgument5, SceneWidget sceneWidgetArgument6, byte[] byteArrayArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport112.byteArrayState0026 = byteArrayArgument7;
          MixedSupport134.longState0050 = -1L;
          MixedSupport054.integerState0277 = integerArgument4;
          MixedSupport064.integerState0336 = byteArrayArgument7.length;
          MixedSupport074.byteArrayState0011 = new byte[(MixedSupport054.integerState0277 + 7) / 8];
          MixedSupport040.booleanState0047 = false;
          UiComponentPart011.sceneWidgetPart013State0002 = null;
          MixedSupport016.sceneWidgetPart013State0001 = null;
          integerLocal12 = integerArgument3;
          for (integerLocal1 = 0; integerLocal1 < MixedSupport112.byteArrayState0026.length; integerLocal1++) {
            integerLocal12 = integerLocal12 + (255 & MixedSupport112.byteArrayState0026[integerLocal1]);
          }
          integerLocal12 = (7 + integerLocal12) / 8;
          MixedSupport141.byteArrayState0029 = new byte[integerLocal12];
          if (null == sceneWidgetArgument2.nodeDequeState0034) {
            sceneWidgetArgument2.nodeDequeState0034 = new NodeDeque();
          }
          MixedSupport057.nodeDequeState0010 = sceneWidgetArgument2.nodeDequeState0034;
          MixedSupport057.nodeDequeState0010.performAction1971(118);
          MixedSupport095.collectionSupport003State0004 = new CollectionSupport003(integerArgument5);
          ReturnedShape.integerState0693 = -1;
          UiComponentPart006.integerState0137 = -1;
          MixedSupport019.integerState0113 = 0;
          MixedSupport124.integerState0772 = 0;
          if (null == sceneWidgetArgument1.nodeDequeState0034) {
            sceneWidgetArgument1.nodeDequeState0034 = new NodeDeque();
          }
          MixedSupport051.nodeDequeState0009 = sceneWidgetArgument1.nodeDequeState0034;
          MixedSupport051.nodeDequeState0009.performAction1971(integerArgument3 ^ 105);
          MixedSupport127.collectionSupport003State0005 = new CollectionSupport003(integerArgument10);
          if (sceneWidgetArgument6.nodeDequeState0034 == null) {
            sceneWidgetArgument6.nodeDequeState0034 = new NodeDeque();
          }
          MixedSupport096.nodeDequeState0021 = sceneWidgetArgument6.nodeDequeState0034;
          MixedSupport096.nodeDequeState0021.performAction1971(121);
          GameApplet.collectionSupport003State0002 = new CollectionSupport003(integerArgument9);
          MixedSupport094.integerState0547 = integerArgument8;
          SceneWidgetNode.longState0023 = 0L;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal11 = caughtParameterLocal15;
          runtimeExceptionLocal13 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal13;
          stackStringBuilderLocal3 = new StringBuilder().append("nk.C(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (sceneWidgetArgument6 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (byteArrayArgument7 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(')').toString());
        }
    }

    final static boolean computeBoolean1282(String stringArgument1, byte byteArgument2, UiComponentPart031 uiComponentPart031Argument3, boolean booleanArgument4, int integerArgument5, String stringArgument6, String stringArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponentPart033 uiComponentPart033Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (MixedSupport134.mixedSupport004State0005 != GameAssets.mixedSupport004State0004) {
            return false;
          }
          uiComponentPart033Local2 = new UiComponentPart033(MixedSupport005.uiComponentPart016State0001, uiComponentPart031Argument3);
          MixedSupport005.uiComponentPart016State0001.performAction0945((byte) -123, uiComponentPart033Local2);
          if (!CollectionSupport002.computeBoolean0398(-40)) {
            SceneWidgetPart013.stringState0586 = stringArgument1;
            RichTextLayout.mixedSupport016State0001 = null;
            MixedSupport126.stringState0527 = stringArgument7;
            GameAssets.mixedSupport004State0004 = UiComponentPart022.mixedSupport004State0003;
            NetworkArchiveRequestManager.stringState0438 = stringArgument6;
            MixedSupport068.integerState0352 = integerArgument5;
            TextLayout.booleanState0019 = booleanArgument4;
          } else {
            uiComponentPart033Local2.performAction2051(true);
          }
          if (byteArgument2 > 120) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal1 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("nk.G(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument2).append(',');
          if (uiComponentPart031Argument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument4).append(',').append(integerArgument5).append(',');
          if (stringArgument6 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument7 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    CollectionSupport003(int integerArgument1) {
        int integerLocal1 = 0;
        DualNode cachedDualNodeLocal2 = null;
        DualNode dualNodeLocal3 = null;
        this.integerState0542 = 0;
        this.dualNodeArrayState0001 = new DualNode[integerArgument1];
        this.integerState0541 = integerArgument1;
        for (integerLocal1 = 0; integerArgument1 > integerLocal1; integerLocal1++) {
          cachedDualNodeLocal2 = new DualNode();
          dualNodeLocal3 = cachedDualNodeLocal2;
          this.dualNodeArrayState0001[integerLocal1] = cachedDualNodeLocal2;
          dualNodeLocal3.dualNodeState0004 = dualNodeLocal3;
          dualNodeLocal3.dualNodeState0003 = dualNodeLocal3;
        }
    }

    final DualNode computeDualNode1280(int integerArgument1, long longArgument2) {
        DualNode dualNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.longState0039 = longArgument2;
        DualNode dualNodeLocal3 = this.dualNodeArrayState0001[(int)((long)(-1 + this.integerState0541) & longArgument2)];
        this.dualNodeState0008 = dualNodeLocal3.dualNodeState0003;
        while (dualNodeLocal3 != this.dualNodeState0008) {
          if (~this.dualNodeState0008.longState0003 == ~longArgument2) {
            dualNodeLocal1 = this.dualNodeState0008;
            this.dualNodeState0008 = this.dualNodeState0008.dualNodeState0003;
            return dualNodeLocal1;
          }
          this.dualNodeState0008 = this.dualNodeState0008.dualNodeState0003;
        }
        if (integerArgument1 != 24710) {
          String stringLocal4 = (String) null;
          CollectionSupport003.computeBoolean1282((String) null, (byte) 91, (UiComponentPart031) null, false, 64, (String) null, (String) null);
        }
        this.dualNodeState0008 = null;
        return null;
    }

    static {
        stringState0367 = "The wildcard special item can be used in place of any other colour.";
        integerArrayState0169 = new int[8];
        stringArrayArrayState0006 = new String[][]{new String[]{"Earthquake", "Causes stacks of loose pieces to collapse."}, new String[]{"Drill", "Individually pops every piece in its path."}, new String[]{"Bomb", "When you pop a shape touching a bomb, everything in your bucket of the same colour will explode."}, new String[]{"Power Drill", "Pops every entire shape, loose or solid, in its path. Loose shapes take touching solid shapes with them!"}, new String[]{"Water Capsule", "Turns every solid shape in your bucket into loose pieces. Can be quite spectacular."}, new String[]{"Poison", "Turns all the loose pieces in your bucket into solid shapes. Not good!"}, new String[]{"Wildcard", "Can be used in place of any other loose piece."}};
        mixedSupport111State0006 = new MixedSupport111(8, 0, 4, 1);
        integerState0544 = 0;
        booleanState0122 = false;
    }
}
