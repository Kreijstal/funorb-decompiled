/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CodecSupport004 {
    private int integerState0699;
    static int integerState0700;
    private int integerState0701;
    private int integerState0702;
    private int integerState0703;
    static String[] stringArrayState0038;
    private float floatState0004;
    private CallbackContract017 callbackContract017State0001;
    private int integerState0704;
    private int integerState0705;
    static String stringState0479;
    private boolean booleanState0163;
    private int integerState0706;
    private int integerState0707;
    private int integerState0708;
    private int integerState0709;
    private int integerState0710;
    private int integerState0711;
    private int integerState0712;
    private int integerState0713;
    private int integerState0714;

    final static boolean computeBoolean1631(int integerArgument1) {
        int integerLocal1 = -44 / ((-56 - integerArgument1) / 32);
        return UiComponentPart032.booleanState0198;
    }

    final static String computeString1636(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4) {
        int integerLocal1;
        integerLocal1 = integerArgument1;
        if (booleanArgument4) {
          integerLocal1 += 4;
        }
        if (booleanArgument3) {
          integerLocal1 += 2;
        }
        if (!booleanArgument2) {
          return MixedSupport063.stringArrayState0014[integerLocal1];
        }
        integerLocal1++;
        return MixedSupport063.stringArrayState0014[integerLocal1];
    }

    final static void performAction1632(int integerArgument1, byte byteArgument2, int integerArgument3, java.math.BigInteger bigIntegerArgument4, java.math.BigInteger bigIntegerArgument5, PacketBuffer packetBufferArgument6, byte[] byteArrayArgument7) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int[] integerArrayLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int[] integerArrayLocal17 = null;
        int[] integerArrayLocal18 = null;
        int integerLocal19;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = SceneWidgetPart003.computeInteger0672(integerArgument3, (byte) -126);
          if (UiComponentPart028.secureRandomState0001 == null) {
            UiComponentPart028.secureRandomState0001 = new java.security.SecureRandom();
          }
          integerArrayLocal18 = new int[4];
          integerArrayLocal17 = integerArrayLocal18;
          integerArrayLocal13 = integerArrayLocal17;
          for (integerLocal14 = 0; 4 > integerLocal14; integerLocal14++) {
            integerArrayLocal13[integerLocal14] = UiComponentPart028.secureRandomState0001.nextInt();
          }
          if (null == UiComponentPart010.packetBufferState0004 ||
            !(integerLocal11 <= UiComponentPart010.packetBufferState0004.payload.length)) {
            UiComponentPart010.packetBufferState0004 = new PacketBuffer(integerLocal11);
          }
          UiComponentPart010.packetBufferState0004.position = 0;
          if (byteArgument2 < 101) {
            return;
          }
          UiComponentPart010.packetBufferState0004.performAction2074(false, integerArgument3, byteArrayArgument7, integerArgument1);
          UiComponentPart010.packetBufferState0004.performAction2090(102, integerLocal11);
          UiComponentPart010.packetBufferState0004.performAction2063((byte) -105, integerArrayLocal18);
          if (ResourceSupport002.packetBufferState0001 == null ||
            !(100 <= ResourceSupport002.packetBufferState0001.payload.length)) {
            ResourceSupport002.packetBufferState0001 = new PacketBuffer(100);
          }
          ResourceSupport002.packetBufferState0001.position = 0;
          ResourceSupport002.packetBufferState0001.performAction2073(true, 10);
          integerLocal16 = 0;
          integerLocal19 = integerLocal16;
          while (4 > integerLocal16) {
            ResourceSupport002.packetBufferState0001.performAction2067(integerArrayLocal18[integerLocal16], false);
            integerLocal16++;
          }
          ResourceSupport002.packetBufferState0001.performAction2087(-1, integerArgument3);
          ResourceSupport002.packetBufferState0001.performAction2071(bigIntegerArgument5, bigIntegerArgument4, true);
          packetBufferArgument6.performAction2074(false, ResourceSupport002.packetBufferState0001.position, ResourceSupport002.packetBufferState0001.payload, 0);
          packetBufferArgument6.performAction2074(false, UiComponentPart010.packetBufferState0004.position, UiComponentPart010.packetBufferState0004.payload, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal10 = caughtParameterLocal20;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal12;
          stackStringBuilderLocal2 = new StringBuilder().append("ri.B(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
          if (bigIntegerArgument4 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (bigIntegerArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (packetBufferArgument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (byteArrayArgument7 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final PlatformSupport006 computePlatformSupport0061640(int integerArgument1) {
        PlatformSupport006 platformSupport006Local1 = null;
        PlatformSupport006 platformSupport006Local2;
        if (integerArgument1 == 27134) {
          this.integerState0701 = MixedSupport095.integerState0548;
          this.integerState0702 = UiComponentPart006.integerState0133;
          this.callbackContract017State0001.performAction1828(-4328, this.integerState0709, this.integerState0699);
          LoginCredentials.booleanState0086 = false;
          platformSupport006Local1 = InputAdapter006.computePlatformSupport0061694(this.integerState0699, CodecSupport001.platformServiceState0003, 0, 0, 67, this.integerState0709);
          if (platformSupport006Local1 == null) {
            this.performAction1638((byte) -60);
          }
          return platformSupport006Local1;
        }
        CodecSupport004.computeBoolean1631(-14);
        this.integerState0701 = MixedSupport095.integerState0548;
        this.integerState0702 = UiComponentPart006.integerState0133;
        this.callbackContract017State0001.performAction1828(-4328, this.integerState0709, this.integerState0699);
        LoginCredentials.booleanState0086 = false;
        platformSupport006Local2 = InputAdapter006.computePlatformSupport0061694(this.integerState0699, CodecSupport001.platformServiceState0003, 0, 0, 67, this.integerState0709);
        if (platformSupport006Local2 == null) {
          this.performAction1638((byte) -60);
        }
        return platformSupport006Local2;
    }

    final void performAction1637(boolean booleanArgument1) {
        int integerLocal1 = 0;
        if (null != MixedSupport020.platformSupport006State0001) {
          return;
        }
        if (Framebuffer.integerState0192 <= 0) {
          this.booleanState0163 = false;
        }
        if (this.booleanState0163) {
          integerLocal1 = this.integerState0713 - 1;
          this.integerState0713 = this.integerState0713 - 1;
          if (integerLocal1 > 0) {
            return;
          }
          this.integerState0713 = this.integerState0712;
          if (this.integerState0708 > DualNodeDeque.integerState0015) {
            this.booleanState0163 = false;
          } else {
            this.performAction1641(60);
            if (booleanArgument1) {
              CodecSupport004.performAction1633(-99, -30, 116, 96, -46, -122);
            }
          }
          return;
        }
        if (UiComponentPart006.integerState0133 < this.integerState0704) {
          SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
        } else {
          if (this.integerState0704 > 0) {
            SceneWidgetPart009.integerState0648 = 0;
          }
        }
        if (this.integerState0703 == UiComponentPart006.integerState0133 &&
          MixedSupport095.integerState0548 == this.integerState0706) {
          return;
        }
        this.callbackContract017State0001.performAction1828(-4328, this.integerState0706, this.integerState0703);
    }

    private final void performAction1641(int integerArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = this.integerState0704;
        integerLocal2 = this.integerState0711;
        if (!this.computeBoolean1639(integerArgument1 - 60)) {
          this.booleanState0163 = false;
          return;
        }
        if (integerLocal1 > this.integerState0710) {
          integerLocal1 = this.integerState0710;
        } else {
          if (integerLocal1 < this.integerState0705) {
            integerLocal1 = this.integerState0705;
          }
        }
        if (integerLocal2 > this.integerState0707) {
          integerLocal2 = this.integerState0707;
        } else {
          if (this.integerState0714 > integerLocal2) {
            integerLocal2 = this.integerState0714;
            if (!(0.0f < this.floatState0004)) {
              if (UiComponentPart006.integerState0133 != integerLocal1) {
                this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
              } else {
                if (MixedSupport095.integerState0548 != integerLocal2) {
                  this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
                }
              }
              if (integerArgument1 != 60) {
                CodecSupport004.performAction1630((byte) 59);
              }
              if (this.integerState0704 > 0) {
                SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
              }
              return;
            }
            integerLocal3 = (int)((float)integerLocal2 * this.floatState0004 + 0.5f);
            if (integerLocal3 <= integerLocal1) {
              if (integerLocal1 > integerLocal3) {
                integerLocal1 = integerLocal3;
              }
            } else {
              integerLocal2 = (int)((float)integerLocal1 / this.floatState0004);
            }
            if (UiComponentPart006.integerState0133 != integerLocal1) {
              this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
            } else {
              if (MixedSupport095.integerState0548 != integerLocal2) {
                this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
              }
            }
            if (integerArgument1 != 60) {
              CodecSupport004.performAction1630((byte) 59);
            }
            if (this.integerState0704 > 0) {
              SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
            }
            return;
          }
        }
        if (!(0.0f < this.floatState0004)) {
          if (UiComponentPart006.integerState0133 != integerLocal1 ||
            MixedSupport095.integerState0548 != integerLocal2) {
            this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
            if (integerArgument1 == 60) {
              if (this.integerState0704 <= 0) {
                return;
              }
              SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
              return;
            }
            CodecSupport004.performAction1630((byte) 59);
            if (this.integerState0704 > 0) {
              SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
            }
            return;
          }
        } else {
          integerLocal5 = (int)((float)integerLocal2 * this.floatState0004 + 0.5f);
          if (integerLocal5 > integerLocal1) {
            integerLocal2 = (int)((float)integerLocal1 / this.floatState0004);
            if (UiComponentPart006.integerState0133 != integerLocal1 ||
              MixedSupport095.integerState0548 != integerLocal2) {
              this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
            }
          } else {
            if (integerLocal1 > integerLocal5) {
              integerLocal1 = integerLocal5;
            }
            if (UiComponentPart006.integerState0133 != integerLocal1) {
              this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
            } else {
              if (MixedSupport095.integerState0548 != integerLocal2) {
                this.callbackContract017State0001.performAction1828(-4328, integerLocal2, integerLocal1);
              }
            }
          }
        }
        if (integerArgument1 != 60) {
          CodecSupport004.performAction1630((byte) 59);
        }
        if (this.integerState0704 <= 0) {
          return;
        }
        SceneWidgetPart009.integerState0648 = (this.integerState0704 - UiComponentPart006.integerState0133) / 2;
    }

    final static void performAction1634(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (80 <= integerArgument2) {
            stackIntegerLocal2 = 54;
          } else {
            stackIntegerLocal2 = integerArgument2 / 20 * 18;
          }
          integerLocal4 = stackIntegerLocal2;
          integerLocal6 = 0;
          if (integerArgument2 >= 60) {
            if (integerArgument2 < 80) {
              integerLocal4 = integerLocal4 + MixedSupport148.computeInteger1983(23841, 80, 40 + integerArgument6 * 18);
            } else {
              if (integerArgument2 >= 93) {
                SoftwareRaster.performAction0721(-30 + integerArgument5, 54 + integerArgument1 - 2, 60, 40, 4, 65280, 100);
              } else {
                integerLocal6 = MixedSupport148.computeInteger1983(23841, 80, 40 + SceneWidgetPart013.integerArrayState0239[1 + integerArgument2 - 80] * 18);
              }
            }
          } else {
            integerLocal4 = integerLocal4 + MixedSupport148.computeInteger1983(23841, 80, integerArgument3 * 18 + 40);
          }
          if (integerArgument4 >= -57) {
            integerState0700 = -11;
          }
          for (integerLocal1 = 0; integerLocal1 < 3; integerLocal1++) {
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument7][1].performAction0302(integerLocal1 * 18 - 27 + integerArgument5, 72 + integerArgument1, 18, 18);
          }
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument7][1].performAction0302(integerArgument5 - 27 + 36, integerLocal6 + integerLocal4 + integerArgument1, 18, -integerLocal6 + 18);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal3 = caughtParameterLocal8;
          runtimeExceptionLocal5 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "ri.G(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    final static void performAction1633(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        DiagnosticSupport001.integerArrayState0030[UiComponentPart021.integerState0556] = integerArgument1;
        MixedSupport017.integerArrayState0022[UiComponentPart021.integerState0556] = UiComponentPart021.integerState0556;
        ResourceSupport001.integerArrayState0012[UiComponentPart021.integerState0556] = integerArgument4;
        if (RenderingSupport003.integerState0252 > integerArgument4) {
          UiComponentPart019.integerState0504 = integerArgument4;
        }
        if (integerArgument4 <= MixedSupport010.integerState0066) {
          MixedSupport094.integerArrayState0173[UiComponentPart021.integerState0556] = integerArgument2;
          MixedSupport084.integerArrayState0150[UiComponentPart021.integerState0556] = integerArgument5;
          MixedSupport086.integerArrayState0157[UiComponentPart021.integerState0556] = integerArgument6;
          integerLocal3 = integerArgument6 + (integerArgument5 + integerArgument2);
          if (~integerLocal3 == integerArgument3) {
            stackIntegerLocal2 = 0;
          } else {
            stackIntegerLocal2 = integerArgument2 * 1000 / integerLocal3;
          }
          integerLocal4 = stackIntegerLocal2;
          MixedSupport015.integerArrayState0020[UiComponentPart021.integerState0556] = integerLocal4;
          UiComponentPart021.integerState0556 = UiComponentPart021.integerState0556 + 1;
          if (ReturnedShape.integerState0695 < integerLocal4) {
            ReturnedShape.integerState0695 = integerLocal4;
          }
          if (UiComponentPart019.integerState0504 <= integerLocal4) {
            return;
          }
          UiComponentPart019.integerState0504 = integerLocal4;
          return;
        }
        ReturnedShape.integerState0695 = integerArgument4;
        MixedSupport094.integerArrayState0173[UiComponentPart021.integerState0556] = integerArgument2;
        MixedSupport084.integerArrayState0150[UiComponentPart021.integerState0556] = integerArgument5;
        MixedSupport086.integerArrayState0157[UiComponentPart021.integerState0556] = integerArgument6;
        integerLocal5 = integerArgument6 + (integerArgument5 + integerArgument2);
        if (~integerLocal5 == integerArgument3) {
          stackIntegerLocal1 = 0;
        } else {
          stackIntegerLocal1 = integerArgument2 * 1000 / integerLocal5;
        }
        integerLocal6 = stackIntegerLocal1;
        MixedSupport015.integerArrayState0020[UiComponentPart021.integerState0556] = integerLocal6;
        UiComponentPart021.integerState0556 = UiComponentPart021.integerState0556 + 1;
        if (ReturnedShape.integerState0695 < integerLocal6) {
          ReturnedShape.integerState0695 = integerLocal6;
        }
        if (UiComponentPart019.integerState0504 <= integerLocal6) {
          return;
        }
        UiComponentPart019.integerState0504 = integerLocal6;
    }

    final boolean computeBoolean1639(int integerArgument1) {
        if (integerArgument1 != 0) {
          this.callbackContract017State0001 = (CallbackContract017) null;
          if (DualNodeDeque.integerState0015 < this.integerState0708) {
            return false;
          }
          if (0 < Framebuffer.integerState0192) {
            return true;
          }
          return false;
        }
        if (DualNodeDeque.integerState0015 < this.integerState0708) {
          return false;
        }
        if (0 < Framebuffer.integerState0192) {
          return true;
        }
        return false;
    }

    final void performAction1635(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        this.integerState0711 = integerArgument3;
        this.integerState0704 = integerArgument1;
        if (booleanArgument2) {
          this.computePlatformSupport0061640(-56);
        }
    }

    final void performAction1638(byte byteArgument1) {
        if (byteArgument1 <= -49) {
          this.callbackContract017State0001.performAction1828(-4328, this.integerState0701, this.integerState0702);
          return;
        }
        this.integerState0712 = -34;
        this.callbackContract017State0001.performAction1828(-4328, this.integerState0701, this.integerState0702);
    }

    public static void performAction1630(byte byteArgument1) {
        stringArrayState0038 = null;
        stringState0479 = null;
        if (byteArgument1 != -91) {
          byte[] byteArrayLocal1 = (byte[]) null;
          CodecSupport004.performAction1632(-34, (byte) -93, 92, (java.math.BigInteger) null, (java.math.BigInteger) null, (PacketBuffer) null, (byte[]) null);
        }
    }

    private CodecSupport004() throws Throwable {
        throw new Error();
    }

    static {
        stringState0479 = "DRAW!";
        stringArrayState0038 = new String[8];
        stringArrayState0038[0] = "fruit";
        stringArrayState0038[3] = "bugs";
        stringArrayState0038[5] = "undersea";
        stringArrayState0038[4] = "flowers";
        stringArrayState0038[1] = "animals";
        stringArrayState0038[7] = "eightbit";
        stringArrayState0038[6] = "city";
        stringArrayState0038[2] = "breakfast";
    }
}
