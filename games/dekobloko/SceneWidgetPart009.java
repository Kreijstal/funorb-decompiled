/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart009 extends SceneWidget {
    SceneWidget sceneWidgetState0100;
    static boolean booleanState0150;
    static int integerState0647;
    static String[][] stringArrayArrayState0007;
    static int integerState0648;
    static boolean booleanState0151;
    private SceneWidget sceneWidgetState0101;

    private final void performAction1514(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        if (integerArgument2 == 9328) {
          integerLocal1 = -integerArgument1;
          if (null != this.sceneWidgetState0101) {
            integerLocal1 = this.sceneWidgetState0101.computeInteger2000(true);
          }
          integerLocal2 = -integerArgument1;
          if (null != this.sceneWidgetState0100) {
            integerLocal2 = this.sceneWidgetState0100.computeInteger1991((byte) 84, -integerLocal1 - integerArgument3 + this.integerState0896 - (integerArgument1 + integerArgument3));
          }
          integerLocal3 = integerArgument3 + (integerLocal2 + integerArgument1) + (integerArgument3 + integerLocal1);
          if (integerLocal3 > this.integerState0896) {
            integerLocal2 = integerLocal2 + (this.integerState0896 - integerLocal3);
            integerLocal3 = this.integerState0896;
          }
          if (this.integerState0916 == 1) {
            integerArgument3 = integerArgument3 + (-integerLocal3 + this.integerState0896) / 2;
          }
          if (this.integerState0916 == 2) {
            integerArgument3 = integerArgument3 + (-integerLocal3 + this.integerState0896);
          }
          if (this.sceneWidgetState0101 != null) {
            this.sceneWidgetState0101.performAction1994(integerLocal1, 0, 0, this.integerState0915, integerArgument3);
            this.sceneWidgetState0101.integerState0885 = this.integerState0885;
          }
          if (null == this.sceneWidgetState0100) {
            return;
          }
          this.sceneWidgetState0100.performAction1994(integerLocal2, 0, 0, this.integerState0915, integerArgument3 - (-integerLocal1 - integerArgument1));
          if (this.sceneWidgetState0101 != null) {
            this.sceneWidgetState0100.integerState0916 = 0;
          } else {
            this.sceneWidgetState0100.integerState0916 = this.integerState0916;
          }
          this.sceneWidgetState0100.integerState0885 = this.integerState0885;
          return;
        }
        stringArrayArrayState0007 = (String[][]) null;
        integerLocal4 = -integerArgument1;
        if (null != this.sceneWidgetState0101) {
          integerLocal4 = this.sceneWidgetState0101.computeInteger2000(true);
        }
        integerLocal5 = -integerArgument1;
        if (null != this.sceneWidgetState0100) {
          integerLocal5 = this.sceneWidgetState0100.computeInteger1991((byte) 84, -integerLocal4 - integerArgument3 + this.integerState0896 - (integerArgument1 + integerArgument3));
        }
        integerLocal6 = integerArgument3 + (integerLocal5 + integerArgument1) + (integerArgument3 + integerLocal4);
        if (integerLocal6 > this.integerState0896) {
          integerLocal5 = integerLocal5 + (this.integerState0896 - integerLocal6);
          integerLocal6 = this.integerState0896;
        }
        if (this.integerState0916 == 1) {
          integerArgument3 = integerArgument3 + (-integerLocal6 + this.integerState0896) / 2;
        }
        if (this.integerState0916 == 2) {
          integerArgument3 = integerArgument3 + (-integerLocal6 + this.integerState0896);
        }
        if (this.sceneWidgetState0101 != null) {
          this.sceneWidgetState0101.performAction1994(integerLocal4, 0, 0, this.integerState0915, integerArgument3);
          this.sceneWidgetState0101.integerState0885 = this.integerState0885;
        }
        if (null == this.sceneWidgetState0100) {
          return;
        }
        this.sceneWidgetState0100.performAction1994(integerLocal5, 0, 0, this.integerState0915, integerArgument3 - (-integerLocal4 - integerArgument1));
        if (this.sceneWidgetState0101 != null) {
          this.sceneWidgetState0100.integerState0916 = 0;
        } else {
          this.sceneWidgetState0100.integerState0916 = this.integerState0916;
        }
        this.sceneWidgetState0100.integerState0885 = this.integerState0885;
    }

    final int computeInteger1517(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = -integerArgument2;
        int integerLocal3;
        if (integerArgument3 == 1940) {
          integerLocal1 = -integerArgument2;
          if (this.sceneWidgetState0101 != null) {
            integerLocal2 = this.sceneWidgetState0101.computeInteger2000(true);
          }
          if (this.sceneWidgetState0100 != null) {
            integerLocal1 = this.sceneWidgetState0100.computeInteger2000(true);
          }
          return integerArgument1 + integerLocal2 + integerArgument1 + integerArgument2 + integerLocal1;
        }
        String stringLocal4 = (String) null;
        SceneWidgetPart009.performAction1516((String) null, -28);
        integerLocal3 = -integerArgument2;
        if (this.sceneWidgetState0101 != null) {
          integerLocal2 = this.sceneWidgetState0101.computeInteger2000(true);
        }
        if (this.sceneWidgetState0100 != null) {
          integerLocal3 = this.sceneWidgetState0100.computeInteger2000(true);
        }
        return integerArgument1 + integerLocal2 + integerArgument1 + integerArgument2 + integerLocal3;
    }

    final void performAction1515(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        this.performAction1994(integerArgument5, 0, integerArgument4, integerArgument1, integerArgument3);
        this.performAction1514(integerArgument6, 9328, integerArgument2);
        if (integerArgument7 != 500) {
          SceneWidgetPart009.computeBoolean1518(84);
        }
    }

    public static void performAction1519(int integerArgument1) {
        stringArrayArrayState0007 = (String[][]) null;
        if (integerArgument1 < 67) {
          SceneWidgetPart009.computeBoolean1518(-21);
        }
    }

    final static void performAction1516(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        try {
          integerLocal1 = HashNode.integerState0069;
          integerLocal2 = MixedSupport106.integerState0590;
          integerLocal3 = MixedSupport132.sceneWidgetState0125.bitmapFontState0020.computeInteger1209(stringArgument1, 500);
          integerLocal4 = MixedSupport132.sceneWidgetState0125.bitmapFontState0020.computeInteger1222(stringArgument1, 500) + 6;
          integerLocal5 = ComponentContainer.integerState0377 * integerLocal3 + 2;
          integerLocal6 = MixedSupport146.computeInteger1953(12, -18265, integerLocal4, integerLocal1);
          integerLocal7 = MixedSupport093.computeInteger1303(20, integerArgument2 + 2, integerLocal5, integerLocal2);
          SoftwareRaster.performAction0743(integerLocal6, integerLocal7, integerLocal4, integerLocal5, 0);
          SoftwareRaster.performAction0719(1 + integerLocal6, integerLocal7 + 1, integerLocal4 - 2, integerLocal5 + integerArgument2, 16777088);
          MixedSupport132.sceneWidgetState0125.bitmapFontState0020.computeInteger1213(stringArgument1, 3 + integerLocal6, -MixedSupport132.sceneWidgetState0125.bitmapFontState0020.integerState0518 + (MouseInput.integerState0928 + (integerLocal7 + 1)), 500, 1000, 0, -1, 0, 0, ComponentContainer.integerState0377);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qd.E(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static boolean computeBoolean1518(int integerArgument1) {
        int integerLocal1 = 63 % ((79 - integerArgument1) / 37);
        return null != MixedSupport146.sceneWidgetPart004State0001 ? true : false;
    }

    SceneWidgetPart009(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, RgbSprite rgbSpriteArgument5, String stringArgument6) {
        super(longArgument1, sceneWidgetArgument2);
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
        RuntimeException runtimeExceptionLocal13 = null;
        try {
          if (rgbSpriteArgument5 != null) {
            this.sceneWidgetState0101 = new SceneWidget(0L, sceneWidgetArgument3);
            this.sceneWidgetState0101.rgbSpriteState0070 = rgbSpriteArgument5;
            this.performAction1998(this.sceneWidgetState0101, -16834);
          }
          if (stringArgument6 != null) {
            this.sceneWidgetState0100 = new SceneWidget(0L, sceneWidgetArgument4, stringArgument6);
            this.performAction1998(this.sceneWidgetState0100, -16834);
            this.performAction2004(-65);
          } else {
            this.performAction2004(-65);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal13;
          stackStringBuilderLocal2 = new StringBuilder().append("qd.<init>(").append(longArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (rgbSpriteArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument6 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    static {
        integerState0647 = 4;
        integerState0648 = 0;
        stringArrayArrayState0007 = new String[][]{new String[]{"Standard", "Large"}, new String[]{"Slow", "Medium", "Fast", "Maximum", "Panic!"}, new String[]{"3", "4", "5", "6", "7"}, new String[]{"None", "Level 1 - wildcards only", "Level 2 - wildcards, earthquakes and drills", "Level 3 - Level 2 with bombs and power drills added", "Level 4 - all special items enabled"}, new String[]{"Level 1 - when loose pieces are eliminated, they are cooked<br>into a solid shape and sent to the next player", "Level 2 - like Level 1, but in addition to loose tiles, whole solid shapes<br>are sent to the next player when eliminated", "Level 3 - like Level 2, but even special items will bombard<br>the next player with everything they destroy!"}};
    }
}
