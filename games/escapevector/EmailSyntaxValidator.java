/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailSyntaxValidator extends TextFieldValidator {
    static int field_r;
    static int field_o;
    static String field_n;
    static ff field_s;
    static int[] field_p;
    static int field_q;

    final static void a(int param0, byte param1, String param2) {
        try {
          if (param1 != 83) {
            field_q = -5;
          }
          SavedDataQuery.field_i = false;
          DraggableWidget.field_F = false;
          if (be.field_b != null) {
            if (!be.field_b.open) {
              return;
            }
            boolean var3_int = true;
            if (8 != param0) {
            } else {
              param0 = 2;
              if (!DialWidget.field_H) {
                param2 = NineSliceFrame.field_a;
              } else {
                param2 = IndexedSpriteState.field_c;
              }
              PcmResampler.field_d.setIdentifier(StrongCacheEntry.field_v, (byte) 106);
            }
            if (param0 == 10) {
              ui.a(90);
              var3_int = false;
            }
            if (var3_int) {
              if (DraggableWidget.field_F) {
                param2 = SingleChildContainer.a(QuickChatPhraseDefinition.field_y, param1 - 146, new String[]{param2});
              }
              if (LinkButtonPainter.field_a) {
                param2 = LegacyTextBlock.field_l;
              }
              be.field_b.showResponseMessage(param2, -1, param0);
            }
            if (256 != param0) {
              if (param0 == 10) {
                return;
              }
              if (!DialWidget.field_H) {
                PcmResampler.field_d.clearCredentials((byte) -128);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hi.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static UiTheme c(boolean param0) {
        if (sl.field_d == null) {
          sl.field_d = new UiTheme();
          sl.field_d.initializePainters(-31476, Js5Transport.field_a);
          sl.field_d.tooltipBorderColor = 7697781;
          sl.field_d.tooltipFont = ke.field_c;
          sl.field_d.tooltipRightPadding = 5;
          sl.field_d.tooltipLineSpacing = 14;
          sl.field_d.tooltipBackgroundColor = 2763306;
          sl.field_d.tooltipLeftPadding = 6;
          sl.field_d.tooltipTopPadding = 0;
          sl.field_d.tooltipBottomPadding = 4;
          if (!param0) {
            return sl.field_d;
          }
          return (UiTheme) null;
        }
        if (!param0) {
          return sl.field_d;
        }
        return (UiTheme) null;
    }

    public static void releaseStatics(int guard) {
        field_s = null;
        field_n = null;
        field_p = null;
        if (guard != 14) {
          EmailSyntaxValidator.c(false);
        }
    }

    final String messageForText(byte guard, String text) {
        String stackIn_9_2 = null;
        try {
          if (this.validateText(-1, text) == ArchiveProvider.field_a) {
            String stackIn_3_0 = TickClock.field_a;
            return stackIn_3_0;
          }
          int var3_int = -127 % ((guard - 10) / 51);
          String stackIn_5_0 = SoundCache.field_c;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("hi.L(").append(guard).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == 0) {
          return true;
        }
        if (~param0 != param1) {
          return false;
        }
        return true;
    }

    final static void d(boolean param0) {
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.a((byte) -126);
          if (!param0) {
            return;
          }
          field_q = -4;
          return;
        }
        if (param0) {
          field_q = -4;
          return;
        }
    }

    EmailSyntaxValidator(EditableTextWidget param0) {
        super(param0);
    }

    final ValidationState validateText(int guard, String text) {
        String stackIn_14_2 = null;
        try {
          boolean stackIn_3_0 = !(null != LegacyStyleNode.validateEmail(guard ^ 0, text));
          boolean var3_int = stackIn_3_0;
          if (!var3_int) {
            ValidationState stackIn_6_0 = ArchiveProvider.field_a;
            return stackIn_6_0;
          }
          if (guard != -1) {
            field_n = (String) null;
          }
          ValidationState stackIn_10_0 = IsaacRandom.field_h;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("hi.G(").append(guard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_p = new int[8192];
        field_n = "Container destroyed - save your ship";
    }
}
