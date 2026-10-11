/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport104 {
    private String stringState0417;
    SceneWidgetPart002 sceneWidgetPart002State0002;
    private int[] integerArrayState0181;
    static volatile int integerState0579;
    SceneWidget sceneWidgetState0097;
    private int integerState0580;
    String stringState0418;
    static String[] stringArrayState0029;
    private long longState0041;
    static String stringState0419;
    static int[] integerArrayState0182;
    static byte[] byteArrayState0020;
    int integerState0581;

    final void performAction1403(int integerArgument1) {
        String stringLocal1 = null;
        if (this.stringState0418 != null) {
          if (this.longState0041 == MixedSupport134.longState0050) {
            if (integerArgument1 != 17) {
              stringArrayState0029 = (String[]) null;
              return;
            }
            return;
          }
          stringLocal1 = this.computeString1415(-116);
          String stringLocal2 = stringLocal1;
          this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(104, MixedSupport081.stringState0332, new String[]{stringLocal1}), 17, integerArgument1 ^ 89);
        }
        if (integerArgument1 == 17) {
          return;
        }
        stringArrayState0029 = (String[]) null;
    }

    final boolean computeBoolean1414(int integerArgument1) {
        if (integerArgument1 != -3) {
          String stringLocal1 = (String) null;
          MixedSupport104.performAction1408((java.applet.Applet) null, (String) null, 28L, (byte) 102, (String) null);
          if (null == this.sceneWidgetPart002State0002) {
            return false;
          }
          if (this.sceneWidgetPart002State0002.computeBoolean0624(30)) {
            return true;
          }
          return false;
        }
        if (null == this.sceneWidgetPart002State0002) {
          return false;
        }
        if (this.sceneWidgetPart002State0002.computeBoolean0624(30)) {
          return true;
        }
        return false;
    }

    private final boolean computeBoolean1406(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument1 == ~integerArgument2) {
          MixedSupport102.sceneWidgetPart007State0001 = new SceneWidgetPart007(this.sceneWidgetState0097.integerState0892, this.sceneWidgetState0097.integerState0886, this.sceneWidgetState0097.integerState0896, this.sceneWidgetState0097.integerState0915, integerArgument3, MusicTrack.sceneWidgetState0127, MixedSupport127.sceneWidgetState0119, UiComponentPart014.sceneWidgetState0053, MixedSupport132.sceneWidgetState0125, InputAdapter002.sceneWidgetPart003State0001, UiComponentPart007.sceneWidgetState0019, this.stringState0418, this.longState0041);
          return true;
        }
        return false;
    }

    final void performAction1401(byte byteArgument1, boolean booleanArgument2) {
        if (byteArgument1 >= 25) {
          this.sceneWidgetPart002State0002.performAction1997(1141039778, booleanArgument2);
          return;
        }
        this.performAction1401((byte) 114, true);
        this.sceneWidgetPart002State0002.performAction1997(1141039778, booleanArgument2);
    }

    private final boolean computeBoolean1407(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument2) {
          return true;
        }
        if (0 == integerArgument3) {
          MixedSupport013.performAction0187(this.longState0041, integerArgument1, (byte) -84);
        } else {
          if (1 == integerArgument3) {
            MixedSupport087.performAction1232(booleanArgument2, this.longState0041, integerArgument1);
            return true;
          }
          if (integerArgument3 == 2) {
            RenderingSupport002.performAction0261(this.integerState0581, (byte) -9, integerArgument1);
            return true;
          }
          if (integerArgument3 == 3) {
            UiComponentPart018.performAction1160(9, integerArgument1, this.integerState0581);
            return true;
          }
          if (integerArgument3 == 10) {
            MixedSupport045.performAction0614(false, this.integerState0581, integerArgument1);
            return true;
          }
          if (integerArgument3 == 15) {
            MixedSupport145.performAction1948(-20974, integerArgument1, this.integerState0581);
            return true;
          }
          if (integerArgument3 != 16) {
            return false;
          }
          MixedSupport145.performAction1948(-20974, integerArgument1, 0);
          return true;
        }
        return true;
    }

    final void performAction1410(boolean booleanArgument1, int integerArgument2) {
        SceneWidgetPart012 sceneWidgetPart012Local1;
        String stringLocal2;
        int integerLocal3;
        SceneWidgetPart012 sceneWidgetPart012Local4;
        SceneWidgetPart012 sceneWidgetPart012Local5;
        SceneWidgetPart012 sceneWidgetPart012Local6;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument2 != 29072) {
          MixedSupport104.performAction1409(false);
          if (null == this.stringState0418) {
            return;
          }
          if (this.longState0041 != MixedSupport134.longState0050 &&
            MixedSupport016.sceneWidgetPart013State0001 != null &&
            SceneWidgetPart005.computeBoolean0803(true)) {
            sceneWidgetPart012Local4 = ComponentDecorator.computeSceneWidgetPart0121138(-105, this.longState0041);
            sceneWidgetPart012Local1 = MixedSupport011.computeSceneWidgetPart0120169(this.longState0041, (byte) 58);
            stringLocal2 = this.computeString1415(-124);
            if (sceneWidgetPart012Local1 != null) {
              if (!MixedSupport016.sceneWidgetPart013State0001.booleanState0204) {
                this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(106, MixedSupport140.stringState0572, new String[]{stringLocal2}), 1, -20);
                return;
              }
              if (0 <= MixedSupport016.sceneWidgetPart013State0001.integerState0841) {
                this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(106, MixedSupport140.stringState0572, new String[]{stringLocal2}), 1, -20);
                return;
              }
            } else {
              if (sceneWidgetPart012Local4 != null &&
                MixedSupport016.sceneWidgetPart013State0001.booleanState0201 &&
                MixedSupport016.sceneWidgetPart013State0001.integerState0843 < MixedSupport016.sceneWidgetPart013State0001.integerState0840) {
                if (sceneWidgetPart012Local4.booleanState0189) {
                  this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(93, MixedSupport149.stringState0596, new String[]{stringLocal2}), 1, 64);
                } else {
                  if (!booleanArgument1) {
                    this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(92, MixedSupport082.stringState0334, new String[]{stringLocal2}), 0, -30);
                  } else {
                    if (!sceneWidgetPart012Local4.booleanState0187) {
                      this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(92, MixedSupport082.stringState0334, new String[]{stringLocal2}), 0, -30);
                    } else {
                      this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(101, GameDomainSupport004.stringState0283, new String[]{stringLocal2}), 0, -124);
                      this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(108, UiComponentPart007.stringState0113, new String[]{stringLocal2}), 1, integerArgument2 ^ -29114);
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        }
        if (null == this.stringState0418) {
          return;
        }
        if (this.longState0041 == MixedSupport134.longState0050) {
          return;
        }
        if (MixedSupport016.sceneWidgetPart013State0001 == null) {
          return;
        }
        if (!SceneWidgetPart005.computeBoolean0803(true)) {
          return;
        }
        sceneWidgetPart012Local6 = ComponentDecorator.computeSceneWidgetPart0121138(-105, this.longState0041);
        sceneWidgetPart012Local5 = MixedSupport011.computeSceneWidgetPart0120169(this.longState0041, (byte) 58);
        stringLocal2 = this.computeString1415(-124);
        if (sceneWidgetPart012Local5 != null) {
          if (MixedSupport016.sceneWidgetPart013State0001.booleanState0204 &&
            0 > MixedSupport016.sceneWidgetPart013State0001.integerState0841) {
            return;
          }
          this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(106, MixedSupport140.stringState0572, new String[]{stringLocal2}), 1, -20);
          return;
        }
        if (sceneWidgetPart012Local6 == null) {
          return;
        }
        if (!MixedSupport016.sceneWidgetPart013State0001.booleanState0201) {
          return;
        }
        if (MixedSupport016.sceneWidgetPart013State0001.integerState0843 >= MixedSupport016.sceneWidgetPart013State0001.integerState0840) {
          return;
        }
        if (sceneWidgetPart012Local6.booleanState0189) {
          this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(93, MixedSupport149.stringState0596, new String[]{stringLocal2}), 1, 64);
        } else {
          if (!booleanArgument1) {
            this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(92, MixedSupport082.stringState0334, new String[]{stringLocal2}), 0, -30);
          } else {
            if (!sceneWidgetPart012Local6.booleanState0187) {
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(92, MixedSupport082.stringState0334, new String[]{stringLocal2}), 0, -30);
            } else {
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(101, GameDomainSupport004.stringState0283, new String[]{stringLocal2}), 0, -124);
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(108, UiComponentPart007.stringState0113, new String[]{stringLocal2}), 1, integerArgument2 ^ -29114);
            }
          }
        }
    }

    final void performAction1412(int integerArgument1) {
        String stringLocal1;
        int integerLocal2;
        SceneWidgetPart013 sceneWidgetPart013Local3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (MixedSupport016.sceneWidgetPart013State0001 != null) {
          if (integerArgument1 <= -71) {
            return;
          }
          this.integerState0581 = -11;
          return;
        }
        sceneWidgetPart013Local3 = MixedSupport095.computeSceneWidgetPart0131310(this.integerState0581, 8);
        if (sceneWidgetPart013Local3 == null) {
          if (integerArgument1 <= -71) {
            return;
          }
          this.integerState0581 = -11;
          return;
        }
        stringLocal1 = sceneWidgetPart013Local3.stringState0585;
        if (sceneWidgetPart013Local3.booleanState0200) {
          this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(124, MixedSupport024.stringState0118, new String[]{stringLocal1}), 2, 73);
          this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(89, MixedSupport056.stringState0239, new String[]{stringLocal1}), 3, 126);
        } else {
          if (sceneWidgetPart013Local3.booleanState0205) {
            this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(119, MixedSupport042.stringState0182, new String[]{stringLocal1}), 2, -98);
          } else {
            if (!sceneWidgetPart013Local3.booleanState0206 &&
              sceneWidgetPart013Local3.booleanState0201) {
              if (!sceneWidgetPart013Local3.booleanState0204) {
                this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(114, MixedSupport131.stringState0544, new String[]{stringLocal1}), 2, -93);
              } else {
                if (sceneWidgetPart013Local3.booleanState0205) {
                  this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(114, MixedSupport131.stringState0544, new String[]{stringLocal1}), 2, -93);
                }
              }
            }
          }
          if (sceneWidgetPart013Local3.booleanState0206) {
            this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(120, MixedSupport040.stringState0181, new String[]{stringLocal1}), 3, -110);
          }
        }
        if (integerArgument1 <= -71) {
          return;
        }
        this.integerState0581 = -11;
        return;
    }

    private final boolean computeBoolean1405(int integerArgument1, int integerArgument2, byte byteArgument3) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument3 != -92) {
          this.sceneWidgetPart002State0002 = (SceneWidgetPart002) null;
        }
        if (integerArgument1 == 8) {
          MixedSupport131.performAction1834((byte) 115, this.stringState0418, this.longState0041);
          return true;
        }
        if (integerArgument1 == 18) {
          UiComponentPart024.performAction1451(38, this.longState0041, this.stringState0418);
          return true;
        }
        if (integerArgument1 == 11) {
          MixedSupport031.performAction0461(this.integerState0580, integerArgument2, 0, (byte) 73);
          return true;
        }
        if (integerArgument1 == 12) {
          MixedSupport031.performAction0461(this.integerState0580, integerArgument2, 1, (byte) 91);
          return true;
        }
        if (integerArgument1 == 13) {
          MixedSupport031.performAction0461(this.integerState0580, integerArgument2, 2, (byte) 91);
          return true;
        }
        if (14 == integerArgument1) {
          RenderingSupport008.performAction1006(0);
          return true;
        }
        if (integerArgument1 == 20) {
          NetworkSupport001.performAction0067(-1045);
          return true;
        }
        if (integerArgument1 != 19) {
          return false;
        }
        MixedSupport149.computeBoolean1989(this.integerArrayState0181, this.longState0041, this.stringState0418, byteArgument3 - 28, this.integerState0580);
        return true;
    }

    final static void performAction1408(java.applet.Applet appletArgument1, String stringArgument2, long longArgument3, byte byteArgument4, String stringArgument5) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          StringBuilder stackStringBuilderLocal4 = null;
          String stackStringLocal5 = null;
          StringBuilder stackStringBuilderLocal6 = null;
          String stackStringLocal7 = null;
          Throwable caughtExceptionLocal8 = null;
          Throwable throwableLocal9 = null;
          RuntimeException runtimeExceptionLocal10 = null;
          String stringLocal11 = null;
          String stringLocal12 = null;
          String stringLocal13 = null;
          String stringLocal14;
          String stringLocal15;
          String stringLocal16;
          String stringLocal17;
          try {
            try {
              stringLocal12 = appletArgument1.getParameter("cookiehost");
              stringLocal11 = stringLocal12;
              stringLocal14 = stringLocal12;
              stringLocal13 = stringArgument2 + "=" + stringArgument5 + "; version=1; path=/; domain=" + stringLocal12;
              stringLocal15 = stringLocal13;
              stringLocal16 = stringLocal13;
              if (byteArgument4 <= 87) {
                return;
              }
              if (longArgument3 >= 0L) {
                stringLocal17 = stringLocal13 + "; Expires=" + CipherPacketBuffer.computeString1856((byte) 60, longArgument3 * 1000L + MixedSupport063.computeLong0827(4)) + "; Max-Age=" + longArgument3;
              } else {
                stringLocal17 = stringLocal13 + "; Discard;";
              }
              MixedSupport088.performAction1240((byte) -51, appletArgument1, "document.cookie=\"" + stringLocal17 + "\"");
              return;
            } catch (java.lang.Throwable caughtParameterLocal18) {
              caughtExceptionLocal8 = caughtParameterLocal18;
              throwableLocal9 = caughtExceptionLocal8;
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal19) {
            caughtExceptionLocal8 = caughtParameterLocal19;
            runtimeExceptionLocal10 = (RuntimeException) (Object) caughtExceptionLocal8;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal10;
            stackStringBuilderLocal2 = new StringBuilder().append("pf.K(");
            if (appletArgument1 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
            if (stringArgument2 == null) {
              stackStringLocal5 = "null";
            } else {
              stackStringLocal5 = "{...}";
            }
            stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(longArgument3).append(',').append(byteArgument4).append(',');
            if (stringArgument5 == null) {
              stackStringLocal7 = "null";
            } else {
              stackStringLocal7 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal20) {
          throw uncheckedExceptionLocal20;
        } catch (Throwable checkedExceptionLocal21) {
          throw new RuntimeException(checkedExceptionLocal21);
        }
    }

    private final String computeString1415(int integerArgument1) {
        String stringLocal1 = null;
        if (this.stringState0417 != null) {
          stringLocal1 = this.stringState0417;
        } else {
          stringLocal1 = this.stringState0418;
        }
        if (integerArgument1 <= -65) {
          return stringLocal1;
        }
        integerArrayState0182 = (int[]) null;
        return stringLocal1;
    }

    final static String computeString1402(char characterArgument1, byte byteArgument2) {
        if (byteArgument2 != -9) {
          stringArrayState0029 = (String[]) null;
          return String.valueOf(characterArgument1);
        }
        return String.valueOf(characterArgument1);
    }

    public static void performAction1399(byte byteArgument1) {
        stringArrayState0029 = null;
        byteArrayState0020 = null;
        stringState0419 = null;
        int integerLocal1 = 3 / ((-2 - byteArgument1) / 52);
        integerArrayState0182 = null;
    }

    final boolean computeBoolean1411(boolean booleanArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = this.sceneWidgetPart002State0002.computeInteger0622(-56, booleanArgument1);
        if (integerLocal1 == -2) {
          return false;
        }
        boolean discarded$0 = this.computeBoolean1407(integerArgument2, true, integerLocal1);
        boolean discarded$1 = this.computeBoolean1413(integerArgument5, integerLocal1, integerArgument4);
        boolean discarded$2 = this.computeBoolean1405(integerLocal1, integerArgument5, (byte) -92);
        boolean discarded$3 = this.computeBoolean1406(integerArgument4 ^ -18, integerLocal1, integerArgument3);
        return true;
    }

    final void performAction1400(byte byteArgument1, MixedSupport056 mixedSupport056Argument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (mixedSupport056Argument2.booleanState0070) {
            return;
          }
          this.integerState0580 = mixedSupport056Argument2.integerState0290;
          if (mixedSupport056Argument2.integerState0290 == 0) {
            if (BufferedSocket.integerState0667 == 0) {
              this.sceneWidgetPart002State0002.performAction0620(MixedSupport145.stringState0592, 12, 95);
            }
            this.sceneWidgetPart002State0002.performAction0620(MixedSupport047.stringState0201, 13, -65);
          }
          if (1 == mixedSupport056Argument2.integerState0290) {
            if (MixedSupport153.integerState0932 == 0) {
              this.sceneWidgetPart002State0002.performAction0620(UiComponentPart001.stringState0023, 12, byteArgument1 + 126);
            }
            this.sceneWidgetPart002State0002.performAction0620(PlatformSupport002.stringState0125, 13, byteArgument1 + 153);
          }
          if (2 == mixedSupport056Argument2.integerState0290) {
            if (PacketBuffer.integerState0936 == 0) {
              this.sceneWidgetPart002State0002.performAction0620(GameDomainSupport002.stringState0143, 12, byteArgument1 ^ -10);
            }
            this.sceneWidgetPart002State0002.performAction0620(MixedSupport018.stringState0088, 13, -77);
          }
          if (byteArgument1 == -51) {
            return;
          }
          stringState0419 = (String) null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("pf.N(").append(byteArgument1).append(',');
          if (mixedSupport056Argument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction1404(int integerArgument1, byte byteArgument2, int[] integerArrayArgument3) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        String stringLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        SceneWidgetPart014 sceneWidgetPart014Local7 = null;
        int integerLocal8 = 0;
        int[] integerArrayLocal9 = null;
        String stringLocal10 = null;
        try {
          if (byteArgument2 != -43) {
            integerArrayLocal9 = (int[]) null;
            this.performAction1404(85, (byte) 40, (int[]) null);
          }
          if (this.stringState0418 != null) {
            if (MixedSupport134.longState0050 == this.longState0041 &&
              integerArgument1 != 2) {
              return;
            }
            if (ThemeTips.integerState0351 != 2) {
              return;
            }
            stringLocal10 = this.computeString1415(-66);
            stringLocal5 = stringLocal10;
            sceneWidgetPart014Local7 = MixedSupport029.computeSceneWidgetPart0140448(this.stringState0418, (byte) -125);
            integerLocal8 = MixedSupport063.computeBoolean0830(this.stringState0418, (byte) -118) ? 1 : 0;
            if (sceneWidgetPart014Local7 == null &&
              integerLocal8 == 0) {
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(93, NetworkSupport011.stringState0431, new String[]{stringLocal10}), 4, byteArgument2 - 60);
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(122, ResourceSupport004.stringState0427, new String[]{stringLocal10}), 6, byteArgument2 ^ 12);
              if (integerArrayArgument3 != null &&
                integerArgument1 != 2 &&
                !MixedSupport151.booleanState0221) {
                this.integerArrayState0181 = integerArrayArgument3;
                this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(94, MixedSupport124.stringState0523, new String[]{stringLocal10}), 19, byteArgument2 - 85);
              }
            }
            if (sceneWidgetPart014Local7 != null) {
              if (!MixedSupport154.computeBoolean2043(-119, this.stringState0418) &&
                !MixedSupport151.booleanState0221) {
                if (!PacketBuffer.booleanState0228) {
                  this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(125, UiComponentPart001.stringState0024, new String[]{stringLocal10}), 8, 89);
                }
                this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(124, MixedSupport150.stringState0601, new String[]{stringLocal10}), 18, 80);
                if (integerArrayArgument3 != null) {
                  this.integerArrayState0181 = integerArrayArgument3;
                  this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(99, MixedSupport124.stringState0523, new String[]{stringLocal10}), 19, byteArgument2 + 140);
                }
              }
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(118, UiComponentPart005.stringState0100, new String[]{stringLocal10}), 5, byteArgument2 ^ 102);
            }
            if (integerLocal8 != 0) {
              this.sceneWidgetPart002State0002.performAction0620(CollectionSupport001.computeString0336(116, NetworkSupport009.stringState0387, new String[]{stringLocal10}), 7, -12);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal4 = caughtParameterLocal11;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("pf.P(").append(integerArgument1).append(',').append(byteArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    final static void performAction1409(boolean booleanArgument1) {
        GameDomainSupport004.booleanState0087 = booleanArgument1 ? true : false;
        if (null == SceneWidgetPart007.sceneWidgetPart005State0002) {
          if (NetworkSupport010.integerState0585 != 0) {
            BufferedSocket.performAction1554((byte) 94);
          }
          MixedSupport077.integerState0416 = 0;
          return;
        }
        SceneWidgetPart007.sceneWidgetPart005State0002.performAction0804(0);
        if (NetworkSupport010.integerState0585 != 0) {
          BufferedSocket.performAction1554((byte) 94);
        }
        MixedSupport077.integerState0416 = 0;
    }

    private final boolean computeBoolean1413(int integerArgument1, int integerArgument2, int integerArgument3) {
        String stringLocal1 = null;
        String stringLocal2 = null;
        String stringLocal3;
        String stringLocal4;
        String stringLocal5;
        String stringLocal6;
        String stringLocal7;
        String stringLocal8;
        if (integerArgument3 != 0) {
          return false;
        }
        Object objectLocal9 = null;
        if (4 == integerArgument2) {
          stringLocal1 = MixedSupport112.computeString1593(integerArgument1, 0, this.stringState0418);
          if (stringLocal1 != null) {
            stringLocal2 = (String) null;
            UiComponentPart004.performAction0200(this.stringState0418, (String) null, stringLocal1, (byte) -79, 2, 0);
            return true;
          }
          return true;
        }
        if (integerArgument2 != 5) {
          if (integerArgument2 == 6) {
            stringLocal3 = NetworkSupport003.computeString0383(this.stringState0418, 127, integerArgument1);
            if (stringLocal3 != null) {
              stringLocal5 = (String) null;
              UiComponentPart004.performAction0200(this.stringState0418, (String) null, stringLocal3, (byte) -79, 2, 0);
              return true;
            }
            return true;
          }
          if (7 != integerArgument2) {
            return false;
          }
          stringLocal7 = InputAdapter006.computeString1696(this.stringState0418, this.stringState0417, integerArgument1, (byte) 126);
          if (stringLocal7 == null) {
            return true;
          }
          stringLocal8 = (String) null;
          UiComponentPart004.performAction0200(this.stringState0418, (String) null, stringLocal7, (byte) -79, 2, 0);
          return true;
        }
        stringLocal4 = UiComponentPart018.computeString1161(integerArgument1, this.stringState0418, false);
        if (stringLocal4 == null) {
          return true;
        }
        stringLocal6 = (String) null;
        UiComponentPart004.performAction0200(this.stringState0418, (String) null, stringLocal4, (byte) -79, 2, 0);
        return true;
    }

    MixedSupport104(SceneWidget sceneWidgetArgument1, long longArgument2, String stringArgument3, String stringArgument4, int integerArgument5, int integerArgument6, int[] integerArrayArgument7) {
        try {
          this.sceneWidgetPart002State0002 = new SceneWidgetPart002(MixedSupport063.sceneWidgetPart002State0001);
          this.integerState0581 = integerArgument5;
          this.sceneWidgetState0097 = sceneWidgetArgument1;
          this.stringState0417 = stringArgument4;
          this.integerState0580 = integerArgument6;
          sceneWidgetArgument1.booleanState0217 = true;
          this.stringState0418 = stringArgument3;
          this.integerArrayState0181 = integerArrayArgument7;
          this.longState0041 = longArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pf.<init>(" + (sceneWidgetArgument1 != null ? "{...}" : "null") + ',' + longArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ',' + (integerArrayArgument7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        integerState0579 = 0;
        integerArrayState0182 = new int[128];
        stringState0419 = "Year";
        byteArrayState0020 = new byte[]{(byte) 0, (byte) 0, (byte)2, (byte) 1, (byte) 1};
    }
}
