/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static MusicTrack field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0) {
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (PasswordInputPainter.field_x.field_M) {
          if ((1 << PasswordInputPainter.field_x.field_h & PasswordInputPainter.field_x.field_P.field_e) != 0) {
            oq.field_i[13] = ReflectionCheck.field_i;
          } else {
            if (PasswordInputPainter.field_x.field_P.field_e != 0) {
              oq.field_i[13] = MusicVoice.field_s;
            } else {
              if ((1 << PasswordInputPainter.field_x.field_P.field_r) - 1 != (1 << PasswordInputPainter.field_x.field_h | PasswordInputPainter.field_x.field_i)) {
                oq.field_i[13] = uo.field_b;
              } else {
                oq.field_i[13] = mq.field_a;
              }
            }
          }
        } else {
          if (0 != (PasswordInputPainter.field_x.field_P.field_e & 1 << PasswordInputPainter.field_x.field_h)) {
            oq.field_i[13] = SocketArchiveNetworkClient.field_s;
          } else {
            if (PasswordInputPainter.field_x.field_P.field_e != 0) {
              oq.field_i[13] = en.field_d;
            } else {
              if (-1 + (1 << PasswordInputPainter.field_x.field_P.field_r) == (PasswordInputPainter.field_x.field_i | 1 << PasswordInputPainter.field_x.field_h)) {
                oq.field_i[13] = SecondaryNodeDequeIterator.field_d;
              } else {
                oq.field_i[13] = IntList.field_a;
              }
            }
          }
        }
        if (param0 == -2) {
          return;
        }
        field_a = (MusicTrack) null;
    }

    public static void clearStatics(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -90) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.previous != null) {
            param1.unlink((byte) -111);
          }
          param1.next = param2;
          param1.previous = param2.previous;
          param1.previous.next = param1;
          param1.next.previous = param1;
          if (param0 <= -122) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = FrameTimer.field_a;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = DateInputWidget.a(param1, true);
            if (var4 != null &&
              var4.length() >= 1) {
              if (param0 > -46) {
                stackIn_16_0 = (String) null;
                return stackIn_16_0;
              }
              if (!DialogRoot.isNameSeparator(var4.charAt(0), 2) &&
                !DialogRoot.isNameSeparator(var4.charAt(-1 + var4.length()), 2)) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (!DialogRoot.isNameSeparator((char) var7, 2)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_30_0 = ChatMessage.field_g;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = cr.field_a;
                return stackIn_35_0;
              }
              stackIn_21_0 = cr.field_a;
              return stackIn_21_0;
            }
            stackIn_13_0 = FrameTimer.field_a;
            return stackIn_13_0;
          }
          stackIn_8_0 = FrameTimer.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("wp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = "Click";
        field_c = "Place fleets in territory <%0> (<%1> remaining)";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$2661ebe01e52(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.previous != null) {
            param1.unlink((byte) -111);
          }
          param1.next = param2;
          param1.previous = param2.previous;
          param1.previous.next = param1;
          param1.next.previous = param1;
          if (param0 <= -122) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
