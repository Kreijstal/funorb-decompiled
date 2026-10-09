/*
 * Decompiled by CFR-JS 0.4.0.
 */
class VisualPropertyOverrides extends VisualPropertyNode {
    private int nonzeroIntegerOverride1;
    private int not256IntegerOverride;
    private int nonnegativeIntegerOverride1;
    private boolean trueOnlyOverride1;
    private int nonzeroIntegerOverride2;
    private String textOverride;
    private Sprite[] nonNullSpriteArrayOverride1;
    private Sprite[] nonNullSpriteArrayOverride2;
    private boolean trueOnlyOverride2;
    static String invalidUserOrPasswordText;
    private Sprite nonNullSpriteOverride1;
    private int minIntUnsetIntegerOverride1;
    private boolean falseOnlyOverride;
    private int nonnegativeIntegerOverride2;
    static int clientBootstrapStage;
    private Sprite[] nonNullSpriteArrayOverride3;
    private boolean trueOnlyOverride3;
    static Sprite[] sparkleFrames;
    private int minIntUnsetIntegerOverride2;
    private Sprite[] nonNullSpriteArrayOverride4;
    private String nonNullStringOverride;
    private int minIntUnsetIntegerOverride3;
    private int minIntUnsetIntegerOverride4;
    private int nonzeroIntegerOverride3;
    private int nonzeroIntegerOverride4;
    private Sprite nonNullSpriteOverride2;
    private BitmapFont fontOverride;
    private Sprite[] nonNullSpriteArrayOverride5;
    private int minIntUnsetIntegerOverride5;
    private int nonzeroIntegerOverride5;
    private Sprite nonNullSpriteOverride3;
    private int nonzeroIntegerOverride6;
    private boolean trueOnlyOverride4;
    static boolean showLoginOnMessageDismiss;
    private int nonnegativeIntegerOverride3;
    static String connectionLostWithReasonText;
    static String continueText;
    private Sprite nonNullSpriteOverride4;
    private int nonnegativeIntegerOverride4;
    private int nonzeroIntegerOverride7;
    private Sprite nonNullSpriteOverride5;
    private boolean trueOnlyOverride5;
    private int minIntUnsetIntegerOverride6;

    private final void mergeDefinedProperties(int methodGuard, VisualPropertyOverrides overrides) {
        RuntimeException mergeFailureBeforeDescription = null;
        StringBuilder mergeMessagePrefix = null;
        String inheritedPropertiesDescription = null;
        RuntimeException caughtMergeFailure = null;
        RuntimeException mergeFailureForContext = null;
        try {
          if (overrides != null) {
            if (overrides.minIntUnsetIntegerOverride3 != -2147483648) {
              this.minIntUnsetIntegerOverride3 = overrides.minIntUnsetIntegerOverride3;
            }
            if (overrides.nonzeroIntegerOverride5 != 0) {
              this.nonzeroIntegerOverride5 = overrides.nonzeroIntegerOverride5;
            }
            if (null != overrides.nonNullSpriteOverride2) {
              this.nonNullSpriteOverride2 = overrides.nonNullSpriteOverride2;
            }
            if (overrides.nonzeroIntegerOverride2 != 0) {
              this.nonzeroIntegerOverride2 = overrides.nonzeroIntegerOverride2;
            }
            if (-2147483648 != overrides.minIntUnsetIntegerOverride2) {
              this.minIntUnsetIntegerOverride2 = overrides.minIntUnsetIntegerOverride2;
            }
            if (overrides.nonNullSpriteOverride5 != null) {
              this.nonNullSpriteOverride5 = overrides.nonNullSpriteOverride5;
            }
            if (0 != overrides.nonzeroIntegerOverride6) {
              this.nonzeroIntegerOverride6 = overrides.nonzeroIntegerOverride6;
            }
            if (overrides.nonNullSpriteOverride3 != null) {
              this.nonNullSpriteOverride3 = overrides.nonNullSpriteOverride3;
            }
            if (null != overrides.nonNullStringOverride) {
              this.nonNullStringOverride = overrides.nonNullStringOverride;
            }
            if (overrides.minIntUnsetIntegerOverride4 != -2147483648) {
              this.minIntUnsetIntegerOverride4 = overrides.minIntUnsetIntegerOverride4;
            }
            if (overrides.nonNullSpriteArrayOverride2 != null) {
              this.nonNullSpriteArrayOverride2 = overrides.nonNullSpriteArrayOverride2;
            }
            if (-2147483648 != overrides.minIntUnsetIntegerOverride1) {
              this.minIntUnsetIntegerOverride1 = overrides.minIntUnsetIntegerOverride1;
            }
            if (overrides.minIntUnsetIntegerOverride6 != -2147483648) {
              this.minIntUnsetIntegerOverride6 = overrides.minIntUnsetIntegerOverride6;
            }
            if (overrides.trueOnlyOverride4) {
              this.trueOnlyOverride4 = overrides.trueOnlyOverride4;
            }
            if (overrides.nonNullSpriteOverride1 != null) {
              this.nonNullSpriteOverride1 = overrides.nonNullSpriteOverride1;
            }
            if (overrides.not256IntegerOverride != 256) {
              this.not256IntegerOverride = overrides.not256IntegerOverride;
            }
            if (overrides.nonnegativeIntegerOverride2 >= 0) {
              this.nonnegativeIntegerOverride2 = overrides.nonnegativeIntegerOverride2;
            }
            if (!overrides.falseOnlyOverride) {
              this.falseOnlyOverride = overrides.falseOnlyOverride;
            }
            if (0 != overrides.nonzeroIntegerOverride4) {
              this.nonzeroIntegerOverride4 = overrides.nonzeroIntegerOverride4;
            }
            if (null != overrides.nonNullSpriteArrayOverride5) {
              this.nonNullSpriteArrayOverride5 = overrides.nonNullSpriteArrayOverride5;
            }
            if (null != overrides.textOverride) {
              this.textOverride = overrides.textOverride;
            }
            if (overrides.nonzeroIntegerOverride7 != 0) {
              this.nonzeroIntegerOverride7 = overrides.nonzeroIntegerOverride7;
            }
            if (overrides.nonNullSpriteArrayOverride1 != null) {
              this.nonNullSpriteArrayOverride1 = overrides.nonNullSpriteArrayOverride1;
            }
            if (0 <= overrides.nonnegativeIntegerOverride1) {
              this.nonnegativeIntegerOverride1 = overrides.nonnegativeIntegerOverride1;
            }
            if (0 != overrides.nonzeroIntegerOverride1) {
              this.nonzeroIntegerOverride1 = overrides.nonzeroIntegerOverride1;
            }
            if (null != overrides.nonNullSpriteOverride4) {
              this.nonNullSpriteOverride4 = overrides.nonNullSpriteOverride4;
            }
            if (overrides.nonNullSpriteArrayOverride3 != null) {
              this.nonNullSpriteArrayOverride3 = overrides.nonNullSpriteArrayOverride3;
            }
            if (overrides.nonnegativeIntegerOverride4 >= 0) {
              this.nonnegativeIntegerOverride4 = overrides.nonnegativeIntegerOverride4;
            }
            if (overrides.trueOnlyOverride3) {
              this.trueOnlyOverride3 = overrides.trueOnlyOverride3;
            }
            if (overrides.minIntUnsetIntegerOverride5 != -2147483648) {
              this.minIntUnsetIntegerOverride5 = overrides.minIntUnsetIntegerOverride5;
            }
            if (overrides.trueOnlyOverride2) {
              this.trueOnlyOverride2 = overrides.trueOnlyOverride2;
            }
            if (null != overrides.nonNullSpriteArrayOverride4) {
              this.nonNullSpriteArrayOverride4 = overrides.nonNullSpriteArrayOverride4;
            }
            if (overrides.fontOverride != null) {
              this.fontOverride = overrides.fontOverride;
            }
            if (0 != overrides.nonzeroIntegerOverride3) {
              this.nonzeroIntegerOverride3 = overrides.nonzeroIntegerOverride3;
            }
            if (overrides.trueOnlyOverride1) {
              this.trueOnlyOverride1 = overrides.trueOnlyOverride1;
            }
            if (0 <= overrides.nonnegativeIntegerOverride3) {
              this.nonnegativeIntegerOverride3 = overrides.nonnegativeIntegerOverride3;
            }
            if (overrides.trueOnlyOverride5) {
              this.trueOnlyOverride5 = overrides.trueOnlyOverride5;
            }
          }
          if (methodGuard != -2147483648) {
            sparkleFrames = (Sprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException mergeFailure) {
          caughtMergeFailure = mergeFailure;
          mergeFailureForContext = caughtMergeFailure;
          mergeFailureBeforeDescription = mergeFailureForContext;
          mergeMessagePrefix = new StringBuilder().append("mi.B(").append(methodGuard).append(',');
          if (overrides == null) {
            inheritedPropertiesDescription = "null";
          } else {
            inheritedPropertiesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) mergeFailureBeforeDescription), ((StringBuilder) (Object) mergeMessagePrefix).append(inheritedPropertiesDescription).append(')').toString());
        }
    }

    VisualPropertyOverrides(long nodeKey, VisualPropertyOverrides inheritedProperties) {
        this(nodeKey, inheritedProperties, 0, 0, 0, 0, (String) null);
    }

    public static void releaseVisualOverrideSharedResources(boolean preserveLoginContinueAndSparkleResources) {
        connectionLostWithReasonText = null;
        if (preserveLoginContinueAndSparkleResources) {
            return;
        }
        invalidUserOrPasswordText = null;
        continueText = null;
        sparkleFrames = null;
    }

    private VisualPropertyOverrides(long nodeKey, VisualPropertyOverrides inheritedProperties, int unusedFirstOption, int unusedSecondOption, int unusedThirdOption, int unusedFourthOption, String textOverride) {
        RuntimeException overrideConstructionFailureForContext = null;
        RuntimeException overrideConstructionFailureBeforeDescription = null;
        StringBuilder overrideConstructionMessagePrefix = null;
        String inheritedPropertiesDescription = null;
        StringBuilder overrideConstructionMessageBeforeText = null;
        String textOverrideDescription = null;
        RuntimeException caughtOverrideConstructionFailure = null;
        this.nonnegativeIntegerOverride1 = -1;
        this.not256IntegerOverride = 256;
        this.minIntUnsetIntegerOverride1 = -2147483648;
        this.falseOnlyOverride = true;
        this.minIntUnsetIntegerOverride3 = -2147483648;
        this.minIntUnsetIntegerOverride2 = -2147483648;
        this.nonnegativeIntegerOverride3 = -1;
        this.nonnegativeIntegerOverride2 = -1;
        this.nonnegativeIntegerOverride4 = -1;
        this.minIntUnsetIntegerOverride5 = -2147483648;
        this.trueOnlyOverride1 = false;
        this.minIntUnsetIntegerOverride4 = -2147483648;
        this.minIntUnsetIntegerOverride6 = -2147483648;
        try {
          this.nodeKey = nodeKey;
          this.mergeDefinedProperties(-2147483648, inheritedProperties);
          if (textOverride != null) {
            this.textOverride = textOverride;
          }
          return;
        } catch (java.lang.RuntimeException overrideConstructionFailure) {
          caughtOverrideConstructionFailure = overrideConstructionFailure;
          overrideConstructionFailureForContext = caughtOverrideConstructionFailure;
          overrideConstructionFailureBeforeDescription = overrideConstructionFailureForContext;
          overrideConstructionMessagePrefix = new StringBuilder().append("mi.<init>(").append(nodeKey).append(',');
          if (inheritedProperties == null) {
            inheritedPropertiesDescription = "null";
          } else {
            inheritedPropertiesDescription = "{...}";
          }
          overrideConstructionMessageBeforeText = ((StringBuilder) (Object) overrideConstructionMessagePrefix).append(inheritedPropertiesDescription).append(',').append(unusedFirstOption).append(',').append(unusedSecondOption).append(',').append(unusedThirdOption).append(',').append(unusedFourthOption).append(',');
          if (textOverride == null) {
            textOverrideDescription = "null";
          } else {
            textOverrideDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) overrideConstructionFailureBeforeDescription), ((StringBuilder) (Object) overrideConstructionMessageBeforeText).append(textOverrideDescription).append(')').toString());
        }
    }

    static {
        invalidUserOrPasswordText = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        continueText = "Continue";
        showLoginOnMessageDismiss = false;
        connectionLostWithReasonText = "Connection lost. <%0>";
    }
}
