/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static ClientProtocolStage field_g;
    static java.awt.Canvas field_d;
    static String[][] field_a;
    static String field_e;
    private IntrusiveDeque field_f;
    private IntrusiveNode field_b;
    static NineSliceFrame field_i;
    static String[] field_h;
    static int[] field_c;

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_f.sentinel) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        if (param0 != 17) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    final static QuickChatCommandType findEntryById(int param0, int param1) {
        int var3 = 0;
        QuickChatCommandType[] var2;
        int var4;
        QuickChatCommandType[] var5;
        var4 = ZombieDawn.field_J;
        var5 = LoginUiHelpers.getRegisteredEntries(19795);
        var2 = var5;
        for (var3 = param1; var3 < var5.length; var3++) {
          if (var5[var3].field_f == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    final IntrusiveNode startForwardFrom(IntrusiveNode param0, byte param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -128) {
            field_c = (int[]) null;
          }
          if (param0 == null) {
            var3 = this.field_f.sentinel.next;
          } else {
            var3 = param0;
          }
          if (this.field_f.sentinel == var3) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_b = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("cj.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.field_f.sentinel.previous;
        if (param0 > -113) {
          IntrusiveDequeCursor.releaseStatics(-19);
        }
        if (this.field_f.sentinel == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        return var2;
    }

    final IntrusiveNode first(byte param0) {
        if (param0 != -21) {
          this.last((byte) 123);
        }
        IntrusiveNode var2 = this.field_f.sentinel.next;
        if (var2 == this.field_f.sentinel) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        return var2;
    }

    final static LoginCredentials createLoginCredentials(boolean param0, byte param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        LoginCredentials stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 25) {
            field_e = (String) null;
          }
          var4_long = 0L;
          var6 = null;
          if (param2.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param2);
            var4_long = AccountRequestState.encodeBase37(-66, var7);
          } else {
            var6 = param2;
          }
          stackIn_6_0 = LoginMethod.createCredentials((byte) -116, var4_long, param0, param3, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void registerSoundEffect(String param0, int param1, int param2, int param3, int param4) {
        try {
          InsetTextPainter.field_s[InsetTextPainter.field_t] = param1;
          InsetTextPainter.field_y[InsetTextPainter.field_t] = param3;
          InsetTextPainter.field_x[InsetTextPainter.field_t] = param0;
          if (param2 > -82) {
            field_e = (String) null;
          }
          InsetTextPainter.field_w[InsetTextPainter.field_t] = param4;
          InsetTextPainter.field_t = InsetTextPainter.field_t + 1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "cj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean hasNonAlphanumeric(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (param0 != 15) {
            var5 = (String) null;
            IntrusiveDequeCursor.registerSoundEffect((String) null, -43, -34, 75, -12);
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!VisualPropertyOverrides.isAsciiLetter(60, (char) var3) &&
              !CacheEntry.isAsciiDigit((char) var3, 91)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("cj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void selectAlternateLoginAction(byte param0) {
        if (param0 <= 99) {
          return;
        }
        NetworkArchiveRequest.setPendingAccountAction(-111, 17);
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_c = null;
        field_a = (String[][]) null;
        field_d = null;
        field_e = null;
        field_g = null;
        if (param0 != 25808) {
          field_h = (String[]) null;
        }
        field_h = null;
    }

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_f.sentinel == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        if (param0 != 61) {
          field_e = (String) null;
        }
        return var2;
    }

    final IntrusiveNode startBackwardFrom(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3549) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            var3 = this.field_f.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (var3 == this.field_f.sentinel) {
            this.field_b = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.field_b = var3.previous;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[][]{new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"}, new String[]{"Terminal 5", "Countryside", "The Labs", "The Palace"}};
        field_g = new ClientProtocolStage();
        field_c = new int[]{220, 347, 515, -1};
    }
}
