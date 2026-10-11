/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends HashNode {
    int integerState0103;
    static SceneWidget sceneWidgetState0009;
    int integerState0104;
    int integerState0105;
    static boolean booleanState0017;
    String stringState0078;
    static int integerState0106;
    int integerState0107;
    int integerState0108;
    CallbackContract004 callbackContract004State0006;
    static String stringState0079;
    static RgbSprite[] rgbSpriteArrayState0005;
    int integerState0109;
    boolean booleanState0018;
    int integerState0110;
    static GameSession gameSessionState0001;
    String stringState0080;
    TextLayout textLayoutState0001;
    CallbackContract006 callbackContract006State0001;

    String computeString0242(byte byteArgument1) {
        if (byteArgument1 == 113) {
          return !this.booleanState0018 ? null : this.stringState0080;
        }
        rgbSpriteArrayState0005 = (RgbSprite[]) null;
        return !this.booleanState0018 ? null : this.stringState0080;
    }

    boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!booleanArgument1) {
            return false;
          }
          sceneWidgetState0009 = (SceneWidget) null;
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ce.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction0247(int integerArgument1) {
        if (integerArgument1 > 106) {
          this.performAction0241(this.integerState0108, this.integerState0107, this.integerState0110, this.integerState0104, -16555);
          return;
        }
        this.computeInteger0245(52);
        this.performAction0241(this.integerState0108, this.integerState0107, this.integerState0110, this.integerState0104, -16555);
    }

    StringBuilder computeStringBuilder0238(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!booleanArgument4) {
            stackStringBuilderLocal2 = (StringBuilder) null;
            return stackStringBuilderLocal2;
          }
          if (this.computeBoolean0234(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0225((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
          }
          stackStringBuilderLocal3 = (StringBuilder) (stringBuilderArgument3);
          return stackStringBuilderLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ce.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final boolean computeBoolean0234(int integerArgument1, int integerArgument2, Hashtable hashtableArgument3, StringBuilder stringBuilderArgument4) {
        StringBuilder discarded$1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument1 != 0) {
            return true;
          }
          if (hashtableArgument3.containsKey(this)) {
            discarded$1 = stringBuilderArgument4.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          hashtableArgument3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("ce.HC(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (hashtableArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (stringBuilderArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final boolean computeBoolean0228(int integerArgument1, char characterArgument2, byte byteArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        if (this.computeBoolean0239(true)) {
          if (this.computeBoolean0198(59, integerArgument1, this, characterArgument2)) {
            return true;
          }
          integerLocal1 = integerArgument1;
          if (integerLocal1 == 80) {
            return this.computeBoolean0240(false, this);
          }
          if (byteArgument3 >= 100) {
            return false;
          }
          return true;
        }
        integerLocal2 = integerArgument1;
        if (integerLocal2 == 80) {
          return this.computeBoolean0240(false, this);
        }
        if (byteArgument3 >= 100) {
          return false;
        }
        return true;
    }

    boolean computeBoolean0233(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!booleanArgument7) {
            return false;
          }
          gameSessionState0001 = (GameSession) null;
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ce.FC(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument3 == 0) {
          if (null == this.callbackContract004State0006) {
            if (integerArgument2 > -103) {
              UiComponent.performAction0231(-50, -124, -49, 105, 114, (String) null, (PlatformService) null, -111, -67);
              return;
            }
            return;
          }
          this.callbackContract004State0006.performAction0018(true, integerArgument1, integerArgument4, (byte) -118, this);
        }
        if (integerArgument2 > -103) {
          UiComponent.performAction0231(-50, -124, -49, 105, 114, (String) null, (PlatformService) null, -111, -67);
          return;
        }
    }

    UiComponent(String stringArgument1, CallbackContract006 callbackContract006Argument2) {
        this(stringArgument1, RenderingSupport001.networkSupport002State0001.callbackContract004State0005, callbackContract006Argument2);
    }

    final static void performAction0227(int integerArgument1, byte byteArgument2, int integerArgument3, String stringArgument4, int integerArgument5, String stringArgument6) {
        int integerLocal1 = 0;
        CipherPacketBuffer cipherPacketBufferLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        try {
          cipherPacketBufferLocal2 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal2.performAction1861(integerArgument1, -4);
          cipherPacketBufferLocal2.position = cipherPacketBufferLocal2.position + 1;
          integerLocal1 = cipherPacketBufferLocal2.position;
          cipherPacketBufferLocal2.performAction2073(true, integerArgument3);
          if (byteArgument2 != -85) {
            UiComponent.performAction0246(9);
          }
          if (2 == integerArgument3) {
            cipherPacketBufferLocal2.performAction2066(0, stringArgument4);
          }
          if (stringArgument6 != null) {
            MixedSupport062.computeInteger0823(-20539, cipherPacketBufferLocal2, stringArgument6);
          } else {
            cipherPacketBufferLocal2.performAction2087(-1, integerArgument5);
            if (DekoBlokoClient.obfuscationControl) {
              MixedSupport062.computeInteger0823(-20539, cipherPacketBufferLocal2, stringArgument6);
            }
          }
          cipherPacketBufferLocal2.performAction2079(cipherPacketBufferLocal2.position - integerLocal1, true);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("ce.NB(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument5).append(',');
          if (stringArgument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static void performAction0235(int integerArgument1, NetworkSupport005 networkSupport005Argument2, int integerArgument3) {
        if (integerArgument3 != -697) {
          return;
        }
        try {
          RenderingSupport002.nodeDequeState0004.performAction1963(networkSupport005Argument2, 2777);
          MixedSupport074.performAction1031(integerArgument1, -15016, networkSupport005Argument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ce.GC(" + integerArgument1 + ',' + (networkSupport005Argument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    void performAction0241(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        this.integerState0108 = integerArgument1;
        this.integerState0107 = integerArgument2;
        this.integerState0104 = integerArgument4;
        this.integerState0110 = integerArgument3;
        if (integerArgument5 != -16555) {
          this.computeBoolean0236(68, true, -45, 80);
          return;
        }
    }

    final static void performAction0231(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, String stringArgument6, PlatformService platformServiceArgument7, int integerArgument8, int integerArgument9) {
        MixedSupport014.integerState0099 = integerArgument5;
        MixedSupport039.integerState0233 = integerArgument3;
        UiComponentPart003.platformServiceState0001 = platformServiceArgument7;
        MixedSupport050.integerState0265 = integerArgument1;
        GameDomainSupport003.integerState0278 = integerArgument9;
        MixedSupport103.stringState0416 = stringArgument6;
        UiComponentPart005.integerState0122 = integerArgument4;
        if (integerArgument8 != 0) {
          return;
        }
        try {
          MixedSupport149.integerState0880 = integerArgument2;
          MixedSupport124.networkSupport003State0003 = (NetworkSupport003) ((Object) new NetworkArchiveRequestManager());
          NetworkArchiveRequestManager.cacheWorkQueueState0003 = new CacheWorkQueue(platformServiceArgument7);
          ProxySocketFactory.codecSupport002State0001 = new CodecSupport002(MixedSupport124.networkSupport003State0003, NetworkArchiveRequestManager.cacheWorkQueueState0003);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ce.SB(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + (stringArgument6 != null ? "{...}" : "null") + ',' + (platformServiceArgument7 != null ? "{...}" : "null") + ',' + integerArgument8 + ',' + integerArgument9 + ')');
        }
    }

    int computeInteger0245(int integerArgument1) {
        int integerLocal1 = 7 / ((integerArgument1 - 36) / 51);
        return 0;
    }

    final static void performAction0246(int integerArgument1) {
        String stringLocal1 = null;
        if (null != MixedSupport133.stringState0552) {
          stringLocal1 = MixedSupport133.stringState0552;
          String stringLocal2 = stringLocal1;
          DiagnosticSupport002.performAction0861((byte) 107, CollectionSupport001.computeString0336(117, MixedSupport122.stringState0517, new String[]{stringLocal1}));
          MixedSupport133.stringState0552 = null;
        }
        if (integerArgument1 <= 99) {
          gameSessionState0001 = (GameSession) null;
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
          if (this.computeBoolean0226(integerArgument2, (byte) -83, integerArgument5, integerArgument1, integerArgument6)) {
            this.integerState0109 = integerArgument4;
          }
          if (byteArgument7 == -55) {
            return false;
          }
          this.computeBoolean0226(19, (byte) 11, -125, -81, -78);
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ce.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        try {
          integerLocal1 = this.computeBoolean0226(HashNode.integerState0069, (byte) -87, integerArgument3, MixedSupport106.integerState0590, integerArgument4) ? 1 : 0;
          stackIntegerLocal2 = (this.booleanState0018) ? 0 : 1;
          if (stackIntegerLocal2 == integerLocal1) {
            stackBooleanLocal3 = (integerLocal1 != 0);
            this.booleanState0018 = stackBooleanLocal3;
            if (this.callbackContract006State0001 != null &&
              this.callbackContract006State0001 instanceof CallbackContract003) {
              ((CallbackContract003) (this.callbackContract006State0001)).performAction0650(integerLocal1 != 0, this, true);
            }
          }
          if (integerArgument2 < 38) {
            booleanState0017 = false;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("ce.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    void performAction0244(byte byteArgument1) {
        if (byteArgument1 == -95) {
          return;
        }
        this.stringState0080 = (String) null;
    }

    final void performAction0229(int integerArgument1, int integerArgument2, byte byteArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        String stringLocal4;
        String stringLocal5;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = this.computeInteger0245(94);
        integerLocal2 = 0;
        if (byteArgument3 == -72) {
          while (integerLocal2 <= integerLocal1) {
            this.performAction0175(integerArgument2, -118, integerLocal2, integerArgument1);
            integerLocal2++;
            if (integerLocal3 == 0) {
              continue;
            }
            break;
          }
          stringLocal4 = RichTextLayout.computeString0435(true);
          if (stringLocal4 != null) {
            RenderingSupport001.networkSupport002State0001.performAction0196(stringLocal4, byteArgument3 + 71, ClientException.integerState0142, UiComponentPart022.integerState0573);
          }
          return;
        }
        this.performAction0175(-73, -87, 50, 71);
        while (integerLocal2 <= integerLocal1) {
          this.performAction0175(integerArgument2, -118, integerLocal2, integerArgument1);
          integerLocal2++;
          if (integerLocal3 == 0) {
            continue;
          }
          break;
        }
        stringLocal5 = RichTextLayout.computeString0435(true);
        if (stringLocal5 != null) {
          RenderingSupport001.networkSupport002State0001.performAction0196(stringLocal5, byteArgument3 + 71, ClientException.integerState0142, UiComponentPart022.integerState0573);
        }
    }

    void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        try {
          this.integerState0109 = 0;
          if (integerArgument2 != 64) {
            this.toString();
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ce.IB(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (uiComponentArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    final boolean computeBoolean0236(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        UiComponentPart029 uiComponentPart029Local3;
        UiComponentPart029 uiComponentPart029Local4;
        UiComponentPart029 uiComponentPart029Local5;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.performAction0237(this, 79, integerArgument1, integerArgument3);
        integerLocal1 = this.computeBoolean0239(true) ? 1 : 0;
        if (!booleanArgument2) {
          if (integerLocal1 != 0 &&
            SceneWidgetPart005.integerState0328 != 0) {
            this.performAction0244((byte) -95);
          }
          if (integerArgument4 != 29166) {
            this.integerState0104 = 110;
          }
          MixedSupport130.integerState0787 = DualNode.integerState0062;
          MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
          return booleanArgument2;
        }
        if (MixedSupport068.integerState0353 == 0) {
          if (SceneWidgetPart005.integerState0328 != 0) {
            if (this.computeBoolean0062(TextLineMetrics.integerState0535, UiComponentPart013.integerState0276, this, SceneWidgetPart005.integerState0328, integerArgument1, integerArgument3, (byte) -55)) {
              booleanArgument2 = false;
              if ((integerLocal2 != 0) &&
                (integerLocal1 != 0)) {
                this.performAction0244((byte) -95);
              }
            } else {
              if (integerLocal1 != 0) {
                this.performAction0244((byte) -95);
              }
            }
          }
          if (DualNode.integerState0062 != 0) {
            if (integerArgument4 != 29166) {
              this.integerState0104 = 110;
            }
            MixedSupport130.integerState0787 = DualNode.integerState0062;
            MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
            return booleanArgument2;
          }
          if (MixedSupport130.integerState0787 == 0) {
            if (integerArgument4 != 29166) {
              this.integerState0104 = 110;
            }
            MixedSupport130.integerState0787 = DualNode.integerState0062;
            MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
            return booleanArgument2;
          }
          this.performAction0232(MixedSupport106.integerState0590, 64, integerArgument3, this, integerArgument1, HashNode.integerState0069);
          uiComponentPart029Local3 = UiComponentPart017.uiComponentPart029State0001;
          if (uiComponentPart029Local3 != null) {
            if (uiComponentPart029Local3.callbackContract006State0001 instanceof CallbackContract010) {
              ((CallbackContract010) (uiComponentPart029Local3.callbackContract006State0001)).performAction1238(uiComponentPart029Local3, (UiComponentPart015) null, (byte) -128);
            }
            UiComponentPart017.uiComponentPart029State0001 = null;
          }
          if (integerLocal2 != 0 &&
            integerLocal1 != 0 &&
            SceneWidgetPart005.integerState0328 != 0) {
            this.performAction0244((byte) -95);
          }
          if (integerArgument4 != 29166) {
            this.integerState0104 = 110;
          }
          MixedSupport130.integerState0787 = DualNode.integerState0062;
          MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
          return booleanArgument2;
        }
        if (integerLocal1 == 0) {
          if (SceneWidgetPart005.integerState0328 != 0 &&
            this.computeBoolean0062(TextLineMetrics.integerState0535, UiComponentPart013.integerState0276, this, SceneWidgetPart005.integerState0328, integerArgument1, integerArgument3, (byte) -55)) {
            booleanArgument2 = false;
            if (integerLocal2 == 0) {
            }
          }
          if (DualNode.integerState0062 != 0) {
            if (integerArgument4 != 29166) {
              this.integerState0104 = 110;
            }
            MixedSupport130.integerState0787 = DualNode.integerState0062;
            MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
            return booleanArgument2;
          }
          if (MixedSupport130.integerState0787 == 0) {
            if (integerArgument4 != 29166) {
              this.integerState0104 = 110;
            }
            MixedSupport130.integerState0787 = DualNode.integerState0062;
            MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
            return booleanArgument2;
          }
          this.performAction0232(MixedSupport106.integerState0590, 64, integerArgument3, this, integerArgument1, HashNode.integerState0069);
          uiComponentPart029Local4 = UiComponentPart017.uiComponentPart029State0001;
          if (uiComponentPart029Local4 != null) {
            if (uiComponentPart029Local4.callbackContract006State0001 instanceof CallbackContract010) {
              ((CallbackContract010) (uiComponentPart029Local4.callbackContract006State0001)).performAction1238(uiComponentPart029Local4, (UiComponentPart015) null, (byte) -128);
            }
            UiComponentPart017.uiComponentPart029State0001 = null;
          }
          if (integerLocal2 != 0 &&
            integerLocal1 != 0 &&
            SceneWidgetPart005.integerState0328 != 0) {
            this.performAction0244((byte) -95);
          }
          if (integerArgument4 != 29166) {
            this.integerState0104 = 110;
          }
          MixedSupport130.integerState0787 = DualNode.integerState0062;
          MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
          return booleanArgument2;
        }
        this.computeBoolean0233(MixedSupport106.integerState0590, integerArgument1, HashNode.integerState0069, this, MixedSupport068.integerState0353, integerArgument3, false);
        if (SceneWidgetPart005.integerState0328 != 0) {
          if (this.computeBoolean0062(TextLineMetrics.integerState0535, UiComponentPart013.integerState0276, this, SceneWidgetPart005.integerState0328, integerArgument1, integerArgument3, (byte) -55)) {
            booleanArgument2 = false;
            if (integerLocal2 != 0) {
              this.performAction0244((byte) -95);
            }
          } else {
            this.performAction0244((byte) -95);
          }
        }
        if (DualNode.integerState0062 != 0) {
          if (integerArgument4 != 29166) {
            this.integerState0104 = 110;
          }
          MixedSupport130.integerState0787 = DualNode.integerState0062;
          MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
          return booleanArgument2;
        }
        if (MixedSupport130.integerState0787 == 0) {
          if (integerArgument4 != 29166) {
            this.integerState0104 = 110;
          }
          MixedSupport130.integerState0787 = DualNode.integerState0062;
          MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
          return booleanArgument2;
        }
        this.performAction0232(MixedSupport106.integerState0590, 64, integerArgument3, this, integerArgument1, HashNode.integerState0069);
        uiComponentPart029Local5 = UiComponentPart017.uiComponentPart029State0001;
        if (uiComponentPart029Local5 != null) {
          if (uiComponentPart029Local5.callbackContract006State0001 instanceof CallbackContract010) {
            ((CallbackContract010) (uiComponentPart029Local5.callbackContract006State0001)).performAction1238(uiComponentPart029Local5, (UiComponentPart015) null, (byte) -128);
          }
          UiComponentPart017.uiComponentPart029State0001 = null;
        }
        if (integerLocal2 != 0 &&
          integerLocal1 != 0 &&
          SceneWidgetPart005.integerState0328 != 0) {
          this.performAction0244((byte) -95);
        }
        if (integerArgument4 != 29166) {
          this.integerState0104 = 110;
        }
        MixedSupport130.integerState0787 = DualNode.integerState0062;
        MixedSupport117.performAction1672(this.computeString0242((byte) 113), -1);
        return booleanArgument2;
    }

    public final String toString() {
        return this.computeStringBuilder0238(new Hashtable(), 0, new StringBuilder(), true).toString();
    }

    final boolean computeBoolean0226(int integerArgument1, byte byteArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        boolean stackBooleanLocal1 = false;
        if (byteArgument2 > -29) {
          UiComponent.performAction0227(-81, (byte) -68, -126, (String) null, 93, (String) null);
          if (integerArgument1 < integerArgument5 + this.integerState0110) {
            return false;
          }
          if (integerArgument3 + this.integerState0104 > integerArgument4) {
            return false;
          }
          if (this.integerState0107 + (this.integerState0110 + integerArgument5) <= integerArgument1) {
            return false;
          }
          if (integerArgument4 >= this.integerState0108 + this.integerState0104 + integerArgument3) {
            return false;
          }
          return true;
        }
        if (integerArgument1 < integerArgument5 + this.integerState0110) {
          return false;
        }
        if (integerArgument3 + this.integerState0104 > integerArgument4) {
          return false;
        }
        stackBooleanLocal1 = (this.integerState0107 + (this.integerState0110 + integerArgument5) > integerArgument1) && (integerArgument4 < this.integerState0108 + this.integerState0104 + integerArgument3);
        return stackBooleanLocal1;
    }

    boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          integerLocal1 = -128 / ((-22 - integerArgument1) / 49);
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("ce.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public static void performAction0243(int integerArgument1) {
        rgbSpriteArrayState0005 = null;
        sceneWidgetState0009 = null;
        gameSessionState0001 = null;
        stringState0079 = null;
        if (integerArgument1 <= 52) {
          UiComponent.performAction0231(-104, 121, -47, 103, 95, (String) null, (PlatformService) null, -67, -90);
          return;
        }
    }

    final void performAction0225(byte byteArgument1, StringBuilder stringBuilderArgument2, Hashtable hashtableArgument3, int integerArgument4) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        RuntimeException runtimeExceptionLocal15 = null;
        int integerLocal16 = 0;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != 72) {
            UiComponent.performAction0227(80, (byte) -66, 85, (String) null, 114, (String) null);
          }
          discarded$0 = stringBuilderArgument2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.integerState0110).append(",").append(this.integerState0104).append(" ").append(this.integerState0107).append("x").append(this.integerState0108);
          if (this.stringState0078 != null) {
            discarded$1 = stringBuilderArgument2.append(" text=\"").append(this.stringState0078).append('"');
          }
          if (this.booleanState0018) {
            discarded$2 = stringBuilderArgument2.append(" mouseover");
          }
          if (this.computeBoolean0239(true)) {
            discarded$3 = stringBuilderArgument2.append(" focused");
          }
          if (null != this.callbackContract004State0006) {
            discarded$4 = stringBuilderArgument2.append(" renderer=");
            if (this.callbackContract004State0006 instanceof UiComponent) {
              stringBuilderArgument2 = this.computeStringBuilder0238(hashtableArgument3, integerArgument4 + 1, stringBuilderArgument2, true);
              if (integerLocal16 != 0) {
                discarded$5 = stringBuilderArgument2.append(this.callbackContract004State0006);
              }
            } else {
              discarded$5 = stringBuilderArgument2.append(this.callbackContract004State0006);
            }
          }
          if (this.callbackContract006State0001 != null) {
            discarded$6 = stringBuilderArgument2.append(" listener=");
            if (!(this.callbackContract006State0001 instanceof UiComponent)) {
              discarded$7 = stringBuilderArgument2.append(this.callbackContract006State0001);
              if (integerLocal16 != 0) {
                stringBuilderArgument2 = this.computeStringBuilder0238(hashtableArgument3, 1 + integerArgument4, stringBuilderArgument2, true);
              }
            } else {
              stringBuilderArgument2 = this.computeStringBuilder0238(hashtableArgument3, 1 + integerArgument4, stringBuilderArgument2, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal14 = caughtParameterLocal17;
          runtimeExceptionLocal15 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal15;
          stackStringBuilderLocal10 = new StringBuilder().append("ce.VB(").append(byteArgument1).append(',');
          if (stringBuilderArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (hashtableArgument3 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument4).append(')').toString());
        }
    }

    boolean computeBoolean0239(boolean booleanArgument1) {
        if (!booleanArgument1) {
          UiComponent.performAction0246(120);
          return false;
        }
        return false;
    }

    final static RgbSprite[] computeRgbSpriteArray0230(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        RgbSprite cachedRgbSpriteLocal1 = null;
        RgbSprite cachedRgbSpriteLocal2 = null;
        RgbSprite[] rgbSpriteArrayLocal3 = new RgbSprite[9];
        RgbSprite[] rgbSpriteArrayLocal4 = rgbSpriteArrayLocal3;
        if (integerArgument2 < -10) {
          cachedRgbSpriteLocal1 = NetworkSupport012.computeRgbSprite1738((byte) -125, integerArgument1, integerArgument4);
          rgbSpriteArrayLocal3[6] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[3] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[2] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[1] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[0] = cachedRgbSpriteLocal1;
          cachedRgbSpriteLocal2 = NetworkSupport012.computeRgbSprite1738((byte) -109, integerArgument1, integerArgument3);
          rgbSpriteArrayLocal3[8] = cachedRgbSpriteLocal2;
          rgbSpriteArrayLocal4[7] = cachedRgbSpriteLocal2;
          rgbSpriteArrayLocal4[5] = cachedRgbSpriteLocal2;
          if (0 != integerArgument5) {
            rgbSpriteArrayLocal3[4] = NetworkSupport012.computeRgbSprite1738((byte) -121, 64, integerArgument5);
          }
          return rgbSpriteArrayLocal4;
        }
        stringState0079 = (String) null;
        RgbSprite cachedRgbSpriteLocal5 = NetworkSupport012.computeRgbSprite1738((byte) -125, integerArgument1, integerArgument4);
        rgbSpriteArrayLocal3[6] = cachedRgbSpriteLocal5;
        rgbSpriteArrayLocal4[3] = cachedRgbSpriteLocal5;
        rgbSpriteArrayLocal4[2] = cachedRgbSpriteLocal5;
        rgbSpriteArrayLocal4[1] = cachedRgbSpriteLocal5;
        rgbSpriteArrayLocal4[0] = cachedRgbSpriteLocal5;
        RgbSprite cachedRgbSpriteLocal6 = NetworkSupport012.computeRgbSprite1738((byte) -109, integerArgument1, integerArgument3);
        rgbSpriteArrayLocal3[8] = cachedRgbSpriteLocal6;
        rgbSpriteArrayLocal4[7] = cachedRgbSpriteLocal6;
        rgbSpriteArrayLocal4[5] = cachedRgbSpriteLocal6;
        if (0 != integerArgument5) {
          rgbSpriteArrayLocal3[4] = NetworkSupport012.computeRgbSprite1738((byte) -121, 64, integerArgument5);
        }
        return rgbSpriteArrayLocal4;
    }

    protected UiComponent() {
        this.integerState0105 = 0;
        this.integerState0103 = 0;
    }

    UiComponent(String stringArgument1, CallbackContract004 callbackContract004Argument2, CallbackContract006 callbackContract006Argument3) {
        RuntimeException runtimeException = null;
        CallbackContract012 callbackContract012Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        this.integerState0105 = 0;
        this.integerState0103 = 0;
        try {
          this.callbackContract006State0001 = callbackContract006Argument3;
          this.stringState0078 = stringArgument1;
          this.callbackContract004State0006 = callbackContract004Argument2;
          if (this.callbackContract004State0006 instanceof CallbackContract012) {
            callbackContract012Local2 = (CallbackContract012) ((Object) this.callbackContract004State0006);
            this.integerState0107 = callbackContract012Local2.computeInteger0022(this, 0);
            this.integerState0108 = callbackContract012Local2.computeInteger0013(this, -49);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeException = caughtExceptionLocal10;
          stackRuntimeExceptionLocal3 = runtimeException;
          stackStringBuilderLocal4 = new StringBuilder().append("ce.<init>(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (callbackContract004Argument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (callbackContract006Argument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    UiComponent(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5, CallbackContract006 callbackContract006Argument6) {
        this.integerState0105 = 0;
        this.integerState0103 = 0;
        try {
          this.integerState0104 = integerArgument2;
          this.integerState0108 = integerArgument4;
          this.integerState0110 = integerArgument1;
          this.integerState0107 = integerArgument3;
          this.callbackContract004State0006 = callbackContract004Argument5;
          this.callbackContract006State0001 = callbackContract006Argument6;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ce.<init>(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + (callbackContract004Argument5 != null ? "{...}" : "null") + ',' + (callbackContract006Argument6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0079 = "To server list";
    }
}
