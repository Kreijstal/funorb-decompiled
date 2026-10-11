/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiComponentPart028 extends InteractiveComponent {
    static BufferedSocket bufferedSocketState0003;
    private int integerState0715;
    static String stringState0480;
    static int integerState0716;
    static String[] stringArrayState0039;
    private long longState0043;
    static String stringState0481;
    static String[] stringArrayState0040;
    private boolean booleanState0164;
    private int integerState0717;
    static String stringState0482;
    static java.security.SecureRandom secureRandomState0001;
    private long longState0044;
    static BitmapFont bitmapFontState0019;
    static String stringState0483;
    private int integerState0718;
    private int integerState0719;
    private boolean booleanState0165;
    static int integerState0720;

    void performAction1339(int integerArgument1) {
        if (integerArgument1 != 18929) {
          secureRandomState0001 = (java.security.SecureRandom) null;
        }
        if (this.callbackContract006State0001 instanceof CallbackContract013) {
          ((CallbackContract013) (this.callbackContract006State0001)).performAction0690(16737894, this);
        }
    }

    final void performAction1642(String stringArgument1, byte byteArgument2, boolean booleanArgument3) {
        int cachedIntegerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        try {
          if (stringArgument1 == null) {
            stringArgument1 = "";
          }
          this.stringState0078 = stringArgument1;
          integerLocal2 = stringArgument1.length();
          if (this.integerState0719 != -1 &&
            this.integerState0719 < integerLocal2) {
            this.stringState0078 = this.stringState0078.substring(0, this.integerState0719);
          }
          cachedIntegerLocal1 = this.stringState0078.length();
          this.integerState0717 = cachedIntegerLocal1;
          this.integerState0718 = cachedIntegerLocal1;
          if (byteArgument2 != 114) {
            stringState0482 = (String) null;
          }
          if (!booleanArgument3) {
            this.performAction1339(18929);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("rk.L(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument2).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    private final void performAction1654(int integerArgument1) {
        TextLayout textLayoutLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        CallbackContract012 callbackContract012Local7;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!this.booleanState0164) {
          this.integerState0103 = 0;
          this.integerState0105 = 0;
          return;
        }
        if (!(this.callbackContract004State0006 instanceof CallbackContract012)) {
          return;
        }
        callbackContract012Local7 = (CallbackContract012) ((Object) this.callbackContract004State0006);
        textLayoutLocal1 = callbackContract012Local7.computeTextLayout0012((UiComponent) (this), (byte) 118);
        integerLocal2 = textLayoutLocal1.computeInteger0255(false);
        if (integerArgument1 != -17122) {
          this.integerState0717 = -109;
        }
        integerLocal3 = callbackContract012Local7.computeInteger0019(false, (UiComponent) (this));
        integerLocal4 = callbackContract012Local7.computeInteger0001((byte) -106) >> 1;
        if (integerLocal2 < integerLocal3 - integerLocal4) {
          this.integerState0105 = 0;
          this.integerState0103 = 0;
          return;
        }
        integerLocal5 = this.integerState0103 + textLayoutLocal1.computeInteger0249((byte) -94, this.integerState0718);
        if (integerLocal3 - integerLocal4 < integerLocal5) {
          this.integerState0103 = this.integerState0103 + (-integerLocal4 + integerLocal3) - integerLocal5;
        } else {
          if (integerLocal4 > integerLocal5) {
            this.integerState0103 = this.integerState0103 - (-integerLocal4 + integerLocal5);
          }
        }
        if (0 < this.integerState0103) {
          this.integerState0103 = 0;
        } else {
          if (-integerLocal3 + integerLocal4 > this.integerState0103) {
            this.integerState0103 = -integerLocal3 + integerLocal4;
          }
        }
        return;
    }

    private final void performAction1648(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        if (this.integerState0718 != this.integerState0717) {
          integerLocal2 = this.integerState0718 <= this.integerState0717 ? this.integerState0718 : this.integerState0717;
          integerLocal1 = this.integerState0718 <= this.integerState0717 ? this.integerState0717 : this.integerState0718;
          this.integerState0717 = integerLocal2;
          this.integerState0718 = integerLocal2;
          this.stringState0078 = this.stringState0078.substring(0, integerLocal2) + this.stringState0078.substring(integerLocal1, this.stringState0078.length());
          this.performAction1339(18929);
        }
        integerLocal3 = -30 / ((byteArgument1 - 40) / 59);
    }

    private final int computeInteger1647(byte byteArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = this.stringState0078.length();
        if (integerLocal1 == this.integerState0718) {
          return this.integerState0718;
        }
        for (integerLocal2 = 1 + this.integerState0718; integerLocal2 < integerLocal1; integerLocal2++) {
          if (this.stringState0078.charAt(integerLocal2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (byteArgument1 != -30) {
          this.integerState0719 = 46;
        }
        return integerLocal2;
    }

    final boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        long longLocal9 = 0L;
        RuntimeException runtimeExceptionLocal10 = null;
        try {
          if (!super.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, integerArgument5, integerArgument6, byteArgument7)) {
            return false;
          }
          if (!(this.callbackContract004State0006 instanceof CallbackContract012)) {
            return false;
          }
          integerLocal8 = ((CallbackContract012) ((Object) this.callbackContract004State0006)).computeInteger0007(integerArgument6, -257, (UiComponent) (this), integerArgument5, MixedSupport106.integerState0590, HashNode.integerState0069);
          stackIntegerLocal1 = byteArgument7 ^ 30294;
          if (integerLocal8 == -1) {
            stackIntegerLocal2 = 0;
          } else {
            stackIntegerLocal2 = integerLocal8;
          }
          this.performAction1644(stackIntegerLocal1, stackIntegerLocal2);
          longLocal9 = MixedSupport063.computeLong0827(4);
          stackBooleanLocal3 = !(250L <= -this.longState0044 + longLocal9);
          this.booleanState0165 = stackBooleanLocal3;
          if (this.booleanState0165) {
            this.integerState0717 = this.computeInteger1656(0);
            this.integerState0718 = this.computeInteger1647((byte) -30);
            if (this.integerState0718 > 0 &&
              this.stringState0078.charAt(-1 + this.integerState0718) == 32) {
              this.integerState0718 = this.integerState0718 - 1;
            }
            this.integerState0715 = this.integerState0718;
          }
          this.longState0044 = longLocal9;
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal7 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal10;
          stackStringBuilderLocal5 = new StringBuilder().append("rk.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    private final void performAction1649(byte byteArgument1) {
        if (byteArgument1 != -76) {
          return;
        }
        this.performAction1650((byte) -113);
        this.performAction1648((byte) -95);
    }

    private final void performAction1645(boolean booleanArgument1) {
        if (this.callbackContract006State0001 instanceof CallbackContract013) {
          ((CallbackContract013) (this.callbackContract006State0001)).performAction0695(-2569, this);
        }
        if (booleanArgument1) {
          this.longState0044 = 15L;
        }
    }

    UiComponentPart028(String stringArgument1, CallbackContract006 callbackContract006Argument2, int integerArgument3) {
        super(stringArgument1, callbackContract006Argument2);
        this.longState0044 = 0L;
        this.integerState0715 = -1;
        this.booleanState0165 = false;
        try {
          this.integerState0719 = integerArgument3;
          this.callbackContract004State0006 = RenderingSupport001.networkSupport002State0001.callbackContract004State0002;
          this.performAction1642(stringArgument1, (byte) 114, true);
          this.booleanState0164 = true;
          this.longState0043 = MixedSupport063.computeLong0827(4);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "rk.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (callbackContract006Argument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    final static void performAction1646(boolean booleanArgument1) {
        MixedSupport032.performAction0521(-1199770620);
        if (booleanArgument1) {
          return;
        }
        InputAdapter003.performAction0749(4, (byte) -104);
    }

    private final void performAction1643(String stringArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (!booleanArgument2) {
            return;
          }
          if (this.integerState0719 != -1) {
            integerLocal1 = this.integerState0719 - this.stringState0078.length();
            if (integerLocal1 >= 0) {
              return;
            }
            stringArgument1 = stringArgument1.substring(0, integerLocal1);
          }
          if (this.integerState0718 == this.stringState0078.length()) {
            this.stringState0078 = this.stringState0078 + stringArgument1;
          } else {
            this.stringState0078 = this.stringState0078.substring(0, this.integerState0718) + stringArgument1 + this.stringState0078.substring(this.integerState0718, this.stringState0078.length());
          }
          this.integerState0718 = this.integerState0718 + stringArgument1.length();
          this.integerState0717 = this.integerState0718;
          this.performAction1339(18929);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("rk.I(");
          if (stringArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    private final void performAction1651(int integerArgument1) {
        try {
          Throwable caughtExceptionLocal1 = null;
          String stringLocal2 = null;
          Exception exceptionLocal3 = null;
          if (integerArgument1 < 112) {
            bitmapFontState0019 = (BitmapFont) null;
          }
          try {
            stringLocal2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.performAction1648((byte) -92);
            this.performAction1643(stringLocal2, true);
          } catch (java.lang.Exception caughtParameterLocal4) {
            caughtExceptionLocal1 = caughtParameterLocal4;
            exceptionLocal3 = (Exception) (Object) caughtExceptionLocal1;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal5) {
          throw uncheckedExceptionLocal5;
        } catch (Throwable checkedExceptionLocal6) {
          throw new RuntimeException(checkedExceptionLocal6);
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        CallbackContract012 callbackContract012Local1 = null;
        long longLocal2 = 0L;
        if (integerArgument2 > -103) {
          UiComponent uiComponentLocal3 = (UiComponent) null;
          this.computeBoolean0198(-88, -47, (UiComponent) null, '%');
        }
        if (null != this.callbackContract004State0006 &&
          integerArgument3 == 0) {
          this.callbackContract004State0006.performAction0018(this.booleanState0035, integerArgument1, integerArgument4, (byte) -110, (UiComponent) (this));
          if (this.callbackContract004State0006 instanceof CallbackContract012) {
            callbackContract012Local1 = (CallbackContract012) ((Object) this.callbackContract004State0006);
            if (this.integerState0717 != this.integerState0718) {
              callbackContract012Local1.performAction0004(this.integerState0717, this.integerState0718, integerArgument4, integerArgument1, -123, (UiComponent) (this));
            }
            longLocal2 = MixedSupport063.computeLong0827(4);
            if ((longLocal2 - this.longState0043) % 1000L < 500L) {
              callbackContract012Local1.performAction0015((UiComponent) (this), this.integerState0718, 1, integerArgument1, integerArgument4);
            }
          }
        }
    }

    void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        CallbackContract012 callbackContract012Local1 = null;
        int integerLocal2 = 0;
        try {
          super.performAction0237(uiComponentArgument1, 94, integerArgument3, integerArgument4);
          if (integerArgument2 < 38) {
            this.integerState0719 = 63;
          }
          this.performAction1654(-17122);
          if (this.integerState0109 == 1) {
            if (this.callbackContract004State0006 instanceof CallbackContract012) {
              callbackContract012Local1 = (CallbackContract012) ((Object) this.callbackContract004State0006);
              integerLocal2 = callbackContract012Local1.computeInteger0007(integerArgument4, -257, (UiComponent) (this), integerArgument3, MixedSupport106.integerState0590, HashNode.integerState0069);
              if (integerLocal2 != -1) {
                if (this.booleanState0165 && this.integerState0715 > integerLocal2 &&
                  this.integerState0717 < integerLocal2) {
                  integerLocal2 = this.integerState0715;
                }
                this.integerState0718 = integerLocal2;
              }
            }
            this.longState0043 = MixedSupport063.computeLong0827(4);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "rk.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final void performAction1655(int integerArgument1) {
        this.integerState0717 = integerArgument1;
        this.stringState0078 = "";
        this.integerState0718 = 0;
        this.performAction1339(18929);
    }

    private final String computeString1652(int integerArgument1) {
        int integerLocal1 = this.integerState0718 > this.integerState0717 ? this.integerState0717 : this.integerState0718;
        if (integerArgument1 <= 102) {
          return (String) null;
        }
        int integerLocal2 = this.integerState0717 >= this.integerState0718 ? this.integerState0717 : this.integerState0718;
        return this.stringState0078.substring(integerLocal1, integerLocal2);
    }

    public static void performAction1653(int integerArgument1) {
        stringState0480 = null;
        bitmapFontState0019 = null;
        bufferedSocketState0003 = null;
        stringState0483 = null;
        stringArrayState0039 = null;
        stringState0482 = null;
        stringState0481 = null;
        stringArrayState0040 = null;
        secureRandomState0001 = null;
        if (integerArgument1 != 81) {
          UiComponentPart028.performAction1646(true);
        }
    }

    private final void performAction1644(int integerArgument1, int integerArgument2) {
        this.integerState0718 = integerArgument2;
        if (!MixedSupport011.booleanArrayState0002[81]) {
          this.integerState0717 = this.integerState0718;
        }
        if (integerArgument1 != -30305) {
          this.longState0043 = 4L;
        }
    }

    private final void performAction1650(byte byteArgument1) {
        String stringLocal1 = this.computeString1652(127);
        if (!(stringLocal1.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.computeString1652(103))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (byteArgument1 > -96) {
          String stringLocal2 = (String) null;
          this.performAction1643((String) null, true);
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int cachedIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        try {
          this.longState0043 = MixedSupport063.computeLong0827(4);
          if (60 != characterArgument4 &&
            characterArgument4 != 62) {
            if (32 <= characterArgument4 &&
              characterArgument4 <= 126) {
              if (this.integerState0718 != this.integerState0717) {
                this.performAction1648((byte) -94);
              }
              if (this.integerState0719 == -1 ||
                !(this.stringState0078.length() >= this.integerState0719)) {
                if (this.integerState0718 < this.stringState0078.length()) {
                  this.stringState0078 = this.stringState0078.substring(0, this.integerState0718) + characterArgument4 + this.stringState0078.substring(this.integerState0718, this.stringState0078.length());
                  this.integerState0718 = this.integerState0718 + 1;
                  this.integerState0717 = this.integerState0718;
                } else {
                  this.stringState0078 = this.stringState0078 + characterArgument4;
                  cachedIntegerLocal1 = this.stringState0078.length();
                  this.integerState0718 = cachedIntegerLocal1;
                  this.integerState0717 = cachedIntegerLocal1;
                }
                this.performAction1339(18929);
              }
              return true;
            }
            if (integerArgument2 == 85) {
              if (this.integerState0717 != this.integerState0718) {
                this.performAction1648((byte) -94);
                return true;
              }
              if (this.integerState0718 > 0) {
                this.integerState0717 = -1 + this.integerState0718;
                this.performAction1648((byte) 113);
                return true;
              }
            } else {
              if (integerArgument2 != 101) {
                if (integerArgument2 == 13) {
                  this.performAction1655(0);
                  return true;
                }
                if (integerArgument2 != 96) {
                  if (integerArgument2 == 97) {
                    if (this.integerState0718 < this.stringState0078.length()) {
                      stackIntegerLocal4 = -30305;
                      if (MixedSupport011.booleanArrayState0002[82]) {
                        stackIntegerLocal5 = this.computeInteger1647((byte) -30);
                      } else {
                        stackIntegerLocal5 = 1 + this.integerState0718;
                      }
                      this.performAction1644(stackIntegerLocal4, stackIntegerLocal5);
                      return true;
                    }
                  } else {
                    if (102 == integerArgument2) {
                      this.performAction1644(-30305, 0);
                      return true;
                    }
                    if (integerArgument2 == 103) {
                      this.performAction1644(-30305, this.stringState0078.length());
                      return true;
                    }
                    if (integerArgument2 == 84) {
                      this.performAction1645(false);
                      return true;
                    }
                    if (MixedSupport011.booleanArrayState0002[82] &&
                      integerArgument2 == 65) {
                      this.performAction1649((byte) -76);
                      return true;
                    }
                    if (MixedSupport011.booleanArrayState0002[82] &&
                      66 == integerArgument2) {
                      this.performAction1650((byte) -101);
                      return true;
                    }
                    if (MixedSupport011.booleanArrayState0002[82] &&
                      integerArgument2 == 67) {
                      this.performAction1651(118);
                      return true;
                    }
                  }
                } else {
                  if (0 < this.integerState0718) {
                    stackIntegerLocal2 = -30305;
                    if (MixedSupport011.booleanArrayState0002[82]) {
                      stackIntegerLocal3 = this.computeInteger1656(0);
                    } else {
                      stackIntegerLocal3 = -1 + this.integerState0718;
                    }
                    this.performAction1644(stackIntegerLocal2, stackIntegerLocal3);
                    return true;
                  }
                }
              } else {
                if (this.integerState0718 != this.integerState0717) {
                  this.performAction1648((byte) -65);
                  return true;
                }
                if (this.integerState0718 < this.stringState0078.length()) {
                  this.integerState0717 = 1 + this.integerState0718;
                  this.performAction1648((byte) -50);
                  return true;
                }
              }
            }
            integerLocal10 = -114 / ((-22 - integerArgument1) / 49);
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal9 = caughtParameterLocal12;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal11;
          stackStringBuilderLocal7 = new StringBuilder().append("rk.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(characterArgument4).append(')').toString());
        }
    }

    private final int computeInteger1656(int integerArgument1) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 == this.integerState0718) {
          return this.integerState0718;
        }
        for (integerLocal1 = this.integerState0718 - 1; 0 < integerLocal1; integerLocal1--) {
          if (this.stringState0078.charAt(integerLocal1 - 1) != 32) {
            continue;
          }
          break;
        }
        return integerLocal1;
    }

    static {
        stringArrayState0040 = new String[]{"Get four of the same colour touching!", "The wildcard special item (multicoloured star) can be used in place of any other colour!", "Watch out! All shapes you match will now come back as solid shapes. Match four loose pieces of the same colour against the solid shape to get rid of it again.", "Did you know that if you get two or more matches at the same time, you get a special item?"};
        stringState0481 = "Suggest muting this player";
        stringState0482 = "You have entered another game.";
        stringState0480 = "To clear a solid shape, make another shape of the same colour against it.";
        integerState0720 = -1;
    }
}
