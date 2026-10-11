/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class UiComponentPart029 extends ComponentDecorator {
    private int integerState0742;
    static RenderingSupport010 renderingSupport010State0005;
    static String stringState0496;
    static String stringState0497;
    private int integerState0743;
    private boolean booleanState0170;
    private int integerState0744;
    static SceneWidget sceneWidgetState0109;
    private int integerState0745;
    private boolean booleanState0171;

    public static void performAction1688(int integerArgument1) {
        if (integerArgument1 == 11344) {
          stringState0497 = null;
          stringState0496 = null;
          renderingSupport010State0005 = null;
          sceneWidgetState0109 = null;
          return;
        }
        UiComponentPart029.computeBoolean1690(-102);
        stringState0497 = null;
        stringState0496 = null;
        renderingSupport010State0005 = null;
        sceneWidgetState0109 = null;
    }

    final boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = super.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, integerArgument5, integerArgument6, byteArgument7) ? 1 : 0;
          if (integerLocal1 != 0 &&
            this.booleanState0170) {
            return true;
          }
          if (!this.computeBoolean0226(integerArgument2, (byte) -39, integerArgument5, integerArgument1, integerArgument6)) {
            stackIntegerLocal3 = integerLocal1;
            return stackIntegerLocal3 != 0;
          }
          this.integerState0109 = integerArgument4;
          if (integerArgument4 != 1) {
            return true;
          }
          this.integerState0742 = -integerArgument6 + (integerArgument2 - this.integerState0110);
          UiComponentPart017.uiComponentPart029State0001 = this;
          this.integerState0743 = integerArgument1 - this.integerState0104 - integerArgument5;
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("se.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    final static java.applet.Applet computeApplet1689(int integerArgument1) {
        if (integerArgument1 != 25144) {
          UiComponentPart029.computeBoolean1690(-107);
          if (MixedSupport071.appletState0001 != null) {
            return MixedSupport071.appletState0001;
          }
          return (java.applet.Applet) ((Object) MixedSupport124.gameAppletState0001);
        }
        if (MixedSupport071.appletState0001 != null) {
          return MixedSupport071.appletState0001;
        }
        return (java.applet.Applet) ((Object) MixedSupport124.gameAppletState0001);
    }

    final static boolean computeBoolean1690(int integerArgument1) {
        if (integerArgument1 != -1) {
          UiComponentPart029.computeBoolean1690(107);
          if (!SceneWidgetPart008.booleanState0123) {
            return UiComponentPart023.computeBoolean1421(integerArgument1 - 30145) ? true : false;
          }
          if (!MixedSupport110.booleanState0153) {
            return UiComponentPart023.computeBoolean1421(integerArgument1 - 30145) ? true : false;
          }
          return true;
        }
        if (SceneWidgetPart008.booleanState0123) {
          if (MixedSupport110.booleanState0153) {
            return true;
          }
          return UiComponentPart023.computeBoolean1421(integerArgument1 - 30145) ? true : false;
        }
        if (!UiComponentPart023.computeBoolean1421(integerArgument1 - 30145)) {
          return false;
        }
        return true;
    }

    final void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        int integerLocal9 = 0;
        RuntimeException runtimeExceptionLocal10 = null;
        int integerLocal11 = 0;
        try {
          if ((!(this.uiComponentState0002 instanceof InteractiveComponent) ||
            ((InteractiveComponent) (this.uiComponentState0002)).booleanState0035) &&
            1 == this.integerState0109) {
            integerLocal9 = HashNode.integerState0069 - (this.integerState0742 + integerArgument4);
            integerLocal11 = MixedSupport106.integerState0590 - this.integerState0743 - integerArgument3;
            if (this.integerState0110 != integerLocal9 ||
              integerLocal11 != this.integerState0104) {
              this.integerState0104 = integerLocal11;
              this.integerState0110 = integerLocal9;
              if (this.callbackContract006State0001 instanceof CallbackContract009) {
                ((CallbackContract009) (this.callbackContract006State0001)).performAction1199(integerArgument4, this, -24076, integerArgument3);
              }
            }
          } else {
            if (this.booleanState0171) {
              if (this.integerState0745 != this.integerState0110) {
                integerLocal9 = -this.integerState0110 + this.integerState0745;
                stackIntegerLocal1 = this.integerState0110;
                if (Math.abs(integerLocal9) <= 2) {
                  if (integerLocal9 <= 0) {
                    stackIntegerLocal2 = -1;
                  } else {
                    stackIntegerLocal2 = 1;
                  }
                } else {
                  stackIntegerLocal2 = integerLocal9 >> 1;
                }
                this.integerState0110 = stackIntegerLocal1 + stackIntegerLocal2;
              }
              if (this.integerState0104 != this.integerState0744) {
                integerLocal9 = this.integerState0744 - this.integerState0104;
                stackIntegerLocal3 = this.integerState0104;
                if (Math.abs(integerLocal9) > 2) {
                  stackIntegerLocal4 = integerLocal9 >> 1;
                } else {
                  if (integerLocal9 > 0) {
                    stackIntegerLocal4 = 1;
                  } else {
                    stackIntegerLocal4 = -1;
                  }
                }
                this.integerState0104 = stackIntegerLocal3 + stackIntegerLocal4;
              }
            }
          }
          super.performAction0237(uiComponentArgument1, 113, integerArgument3, integerArgument4);
          if (integerArgument2 >= 38) {
            return;
          }
          UiComponentPart029.performAction1688(86);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal8 = caughtParameterLocal12;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal10;
          stackStringBuilderLocal6 = new StringBuilder().append("se.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction1687(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2, byte byteArgument3, boolean booleanArgument4, ResourceArchive resourceArchiveArgument5) {
        try {
          ThemeTips.mixedSupport124State0001 = MusicTrack.computeMixedSupport1241883(0, "");
          ThemeTips.mixedSupport124State0001.performAction1768(-21, false);
          MixedSupport044.performAction0606(resourceArchiveArgument1, resourceArchiveArgument2, resourceArchiveArgument5, 0);
          UiComponentPart003.performAction0181((byte) -121);
          GameAssets.mixedSupport004State0004 = MixedSupport134.mixedSupport004State0005;
          if (byteArgument3 != 76) {
            ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
            UiComponentPart029.performAction1687((ResourceArchive) null, (ResourceArchive) null, (byte) -98, true, (ResourceArchive) null);
          }
          UiComponentPart016.mixedSupport004State0001 = MixedSupport134.mixedSupport004State0005;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "se.GB(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ',' + byteArgument3 + ',' + booleanArgument4 + ',' + (resourceArchiveArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    final StringBuilder computeStringBuilder0238(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        UiComponent uiComponentLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          if (!booleanArgument4) {
            uiComponentLocal4 = (UiComponent) null;
            this.computeBoolean0062(-91, 66, (UiComponent) null, 112, 104, 72, (byte) -16);
          }
          if (this.computeBoolean0234(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0225((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
            this.performAction1136((byte) -105, integerArgument2, stringBuilderArgument3, hashtableArgument1);
            discarded$62 = stringBuilderArgument3.append(" revert=").append(this.booleanState0171);
            if (this.integerState0745 != 2147483647 &&
              this.integerState0744 != 2147483647) {
              discarded$63 = stringBuilderArgument3.append(" to ").append(this.integerState0745).append(',').append(this.integerState0744);
            }
          }
          stackStringBuilderLocal5 = (StringBuilder) (stringBuilderArgument3);
          return stackStringBuilderLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal3 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal3;
          stackStringBuilderLocal7 = new StringBuilder().append("se.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final void performAction1142(boolean booleanArgument1) {
        super.performAction1142(booleanArgument1);
        this.uiComponentState0002.performAction0241(this.integerState0108, this.integerState0107, 0, 0, -16555);
        this.integerState0744 = this.integerState0104;
        this.integerState0745 = this.integerState0110;
    }

    final void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        try {
          super.performAction0232(integerArgument1, integerArgument2 ^ 0, integerArgument3, uiComponentArgument4, integerArgument5, integerArgument6);
          this.integerState0109 = 0;
          if (integerArgument2 != 64) {
            renderingSupport010State0005 = (RenderingSupport010) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "se.IB(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (uiComponentArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    private UiComponentPart029(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5, CallbackContract006 callbackContract006Argument6, UiComponent uiComponentArgument7, boolean booleanArgument8, boolean booleanArgument9) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5, callbackContract006Argument6);
        this.integerState0744 = 2147483647;
        this.integerState0745 = 2147483647;
        try {
          this.booleanState0171 = booleanArgument8 ? true : false;
          this.booleanState0170 = booleanArgument9 ? true : false;
          this.uiComponentState0002 = uiComponentArgument7;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "se.<init>(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + (callbackContract004Argument5 != null ? "{...}" : "null") + ',' + (callbackContract006Argument6 != null ? "{...}" : "null") + ',' + (uiComponentArgument7 != null ? "{...}" : "null") + ',' + booleanArgument8 + ',' + booleanArgument9 + ')');
        }
    }

    static {
        stringState0497 = "Create";
        stringState0496 = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
