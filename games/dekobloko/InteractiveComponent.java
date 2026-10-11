/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveComponent extends UiComponent {
    boolean booleanState0034;
    boolean booleanState0035;
    private boolean booleanState0036;
    private boolean booleanState0037;

    boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (this.booleanState0035 &&
            this.booleanState0037) {
            if (booleanArgument1) {
              this.performAction0244((byte) 59);
            }
            uiComponentArgument2.performAction0244((byte) -95);
            this.booleanState0036 = true;
            if (this.callbackContract006State0001 != null) {
              if (!(this.callbackContract006State0001 instanceof CallbackContract008)) {
                return true;
              }
              ((CallbackContract008) (this.callbackContract006State0001)).performAction1135(-28841, this.booleanState0036, (UiComponent) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ek.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    void performAction0415(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument4 != 520) {
          this.booleanState0037 = false;
          if (null == this.callbackContract006State0001) {
            return;
          }
          if (this.callbackContract006State0001 instanceof CallbackContract019) {
            ((CallbackContract019) (this.callbackContract006State0001)).performAction0341((byte) 67, integerArgument3, this, integerArgument1, integerArgument2);
            return;
          }
          return;
        }
        if (null == this.callbackContract006State0001) {
          return;
        }
        if (this.callbackContract006State0001 instanceof CallbackContract019) {
          ((CallbackContract019) (this.callbackContract006State0001)).performAction0341((byte) 67, integerArgument3, this, integerArgument1, integerArgument2);
          return;
        }
    }

    boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (byteArgument7 != -55) {
            this.booleanState0036 = true;
          }
          if (this.booleanState0035 &&
            this.computeBoolean0226(integerArgument2, (byte) -48, integerArgument5, integerArgument1, integerArgument6)) {
            this.computeBoolean0240(false, uiComponentArgument3);
            this.integerState0109 = integerArgument4;
            if (null != this.callbackContract006State0001 &&
              this.callbackContract006State0001 instanceof CallbackContract016) {
              ((CallbackContract016) (this.callbackContract006State0001)).performAction1715(integerArgument4, -4040, this, integerArgument6, integerArgument1, integerArgument5, integerArgument2);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ek.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    final void performAction0244(byte byteArgument1) {
        UiComponent uiComponentLocal1 = null;
        UiComponent uiComponentLocal2;
        UiComponent uiComponentLocal3;
        UiComponent uiComponentLocal4;
        if (!this.booleanState0036) {
          if (byteArgument1 == -95) {
            return;
          }
          uiComponentLocal1 = (UiComponent) null;
          this.performAction0237((UiComponent) null, -106, -89, 48);
          return;
        }
        this.booleanState0036 = false;
        if (this.callbackContract006State0001 == null) {
          if (byteArgument1 == -95) {
            return;
          }
          uiComponentLocal2 = (UiComponent) null;
          this.performAction0237((UiComponent) null, -106, -89, 48);
          return;
        }
        if (this.callbackContract006State0001 instanceof CallbackContract008) {
          ((CallbackContract008) (this.callbackContract006State0001)).performAction1135(-28841, this.booleanState0036, (UiComponent) (this));
          if (byteArgument1 == -95) {
            return;
          }
          uiComponentLocal3 = (UiComponent) null;
          this.performAction0237((UiComponent) null, -106, -89, 48);
          return;
        }
        if (byteArgument1 == -95) {
          return;
        }
        uiComponentLocal4 = (UiComponent) null;
        this.performAction0237((UiComponent) null, -106, -89, 48);
    }

    final static RgbSprite[] computeRgbSpriteArray0512(String stringArgument1, String stringArgument2, int integerArgument3, ResourceArchive resourceArchiveArgument4) {
        RgbSprite[] rgbSpriteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        ResourceArchive resourceArchiveLocal3 = null;
        RgbSprite[] rgbSpriteArrayLocal4 = null;
        RgbSprite[] stackRgbSpriteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          rgbSpriteArrayLocal4 = GameDomainSupport001.computeRgbSpriteArray0104(18064, stringArgument2, resourceArchiveArgument4, stringArgument1);
          rgbSpriteArrayLocal1 = rgbSpriteArrayLocal4;
          if (integerArgument3 > -43) {
            resourceArchiveLocal3 = (ResourceArchive) null;
            InteractiveComponent.computeRgbSpriteArray0512((String) null, (String) null, -51, (ResourceArchive) null);
          }
          rgbSpriteArrayLocal4[1].integerState0260 = rgbSpriteArrayLocal4[1].integerState0255;
          rgbSpriteArrayLocal4[7].integerState0260 = rgbSpriteArrayLocal4[7].integerState0255;
          stackRgbSpriteArrayLocal5 = rgbSpriteArrayLocal1;
          return stackRgbSpriteArrayLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("ek.U(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (stringArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument3).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    final StringBuilder computeStringBuilder0238(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (!booleanArgument4) {
            this.booleanState0035 = true;
          }
          if (this.computeBoolean0234(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0225((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
            if (this.booleanState0034) {
              discarded$2 = stringBuilderArgument3.append(" active");
            }
            if (!this.booleanState0035) {
              discarded$3 = stringBuilderArgument3.append(" disabled");
            }
          }
          stackStringBuilderLocal4 = (StringBuilder) (stringBuilderArgument3);
          return stackStringBuilderLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal3 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal3;
          stackStringBuilderLocal6 = new StringBuilder().append("ek.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final static void performAction0514(int integerArgument1) {
        if (integerArgument1 != -1209) {
          return;
        }
        UiComponentPart023.booleanState0134 = false;
    }

    void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 < 38) {
            this.booleanState0034 = true;
          }
          super.performAction0237(uiComponentArgument1, 94, integerArgument3, integerArgument4);
          if (this.integerState0109 != 0 &&
            DualNode.integerState0062 != this.integerState0109) {
            if (this.computeBoolean0226(HashNode.integerState0069, (byte) -124, integerArgument3, MixedSupport106.integerState0590, integerArgument4) &&
              DualNode.integerState0062 == 0) {
              this.performAction0415(-integerArgument4 + HashNode.integerState0069, MixedSupport106.integerState0590 - integerArgument3, this.integerState0109, 520);
            }
            this.performAction0232(MixedSupport106.integerState0590, 64, integerArgument4, uiComponentArgument1, integerArgument3, HashNode.integerState0069);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ek.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    InteractiveComponent(String stringArgument1, CallbackContract006 callbackContract006Argument2) {
        this(stringArgument1, RenderingSupport001.networkSupport002State0001.callbackContract004State0001, callbackContract006Argument2);
    }

    boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          integerLocal1 = -127 / ((integerArgument1 + 22) / 49);
          if (this.computeBoolean0239(true) && (integerArgument2 == 84 ||
            integerArgument2 == 83)) {
            this.performAction0415(-1, -1, 1, 520);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("ek.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(characterArgument4).append(')').toString());
        }
    }

    final static RenderingSupport008 computeRenderingSupport0080513(boolean booleanArgument1, boolean booleanArgument2, int integerArgument3) {
        RenderingSupport008 renderingSupport008Local1 = new RenderingSupport008(3);
        RenderingSupport008 renderingSupport008Local2 = renderingSupport008Local1;
        renderingSupport008Local2.performAction0969(new GameDomainSupport002(25, DiagnosticSupport002.stringState0271, MixedSupport001.renderingSupport010State0001), 110);
        renderingSupport008Local2.performAction0969(new GameDomainSupport002(13, booleanArgument2 ? MixedSupport099.stringState0396 : MixedSupport101.stringState0411, MixedSupport001.renderingSupport010State0001), 120);
        renderingSupport008Local2.performAction0969(new GameDomainSupport002(26, UiComponentPart021.stringState0384, MixedSupport001.renderingSupport010State0001), 122);
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[1].integerState0176 = 40 + MixedSupport001.renderingSupport010State0001.computeInteger1208(renderingSupport008Local1.gameDomainSupport002ArrayState0001[1].stringState0142);
        GameDomainSupport002 gameDomainSupport002Local3 = renderingSupport008Local1.gameDomainSupport002ArrayState0001[0];
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[2].integerState0176 = 120;
        gameDomainSupport002Local3.integerState0176 = 120;
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[1].integerState0174 = -(renderingSupport008Local1.gameDomainSupport002ArrayState0001[1].integerState0176 / 2) + 320;
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[0].integerState0174 = 32;
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[2].integerState0174 = integerArgument3 + (-renderingSupport008Local1.gameDomainSupport002ArrayState0001[2].integerState0176 - 32);
        GameDomainSupport002 gameDomainSupport002Local4 = renderingSupport008Local1.gameDomainSupport002ArrayState0001[0];
        renderingSupport008Local1.gameDomainSupport002ArrayState0001[2].integerState0178 = 400;
        GameDomainSupport002 gameDomainSupport002Local5 = renderingSupport008Local1.gameDomainSupport002ArrayState0001[1];
        gameDomainSupport002Local5.integerState0178 = 400;
        renderingSupport008Local2.integerState0368 = 520;
        renderingSupport008Local2.integerState0374 = 60;
        renderingSupport008Local2.integerState0372 = 284;
        gameDomainSupport002Local4.integerState0178 = 400;
        renderingSupport008Local2.integerState0375 = 96;
        renderingSupport008Local2.performAction0968(1, booleanArgument1, integerArgument3 ^ -513);
        MixedSupport003.performAction0043((byte) -119);
        return renderingSupport008Local2;
    }

    final boolean computeBoolean0239(boolean booleanArgument1) {
        if (!booleanArgument1) {
          this.booleanState0035 = false;
          return this.booleanState0036;
        }
        return this.booleanState0036;
    }

    final void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (null != this.callbackContract006State0001 &&
            this.callbackContract006State0001 instanceof CallbackContract016) {
            ((CallbackContract016) (this.callbackContract006State0001)).performAction1714(integerArgument1, integerArgument3, integerArgument5, integerArgument6, this, integerArgument2 + 19001);
          }
          this.integerState0109 = 0;
          if (integerArgument2 == 64) {
            return;
          }
          this.booleanState0036 = false;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ek.IB(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    InteractiveComponent(String stringArgument1, CallbackContract004 callbackContract004Argument2, CallbackContract006 callbackContract006Argument3) {
        super(stringArgument1, callbackContract004Argument2, callbackContract006Argument3);
        this.booleanState0036 = false;
        this.booleanState0035 = true;
        this.booleanState0037 = true;
    }

    protected InteractiveComponent() {
        this.booleanState0036 = false;
        this.booleanState0035 = true;
        this.booleanState0037 = true;
        this.callbackContract004State0006 = RenderingSupport001.networkSupport002State0001.callbackContract004State0003;
    }

    static {
    }
}
