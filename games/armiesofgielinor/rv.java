/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static String field_a;
    static int[] responsePhraseIds;

    final static java.net.URL a(String param0, String param1, int param2, int param3, java.net.URL param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_40_0 = null;
          java.net.URL stackIn_42_0 = null;
          RuntimeException stackIn_45_0 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var5 = param4.getFile();
            var6 = param2;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(0 > param3))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(0 <= var7_int);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((0 <= var7_int) &&
                      (decompiledFrameRemainder0 = (param0 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5.regionMatches(var6, "/s=", 0, 3) ||
                      var5.regionMatches(var6, "/c=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int >= 0) &&
                        (decompiledFrameRemainder0 = (param1 != null))) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param3 > 0) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param3));
                      }
                      if (param0 != null &&
                        param0.length() > 0) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param0);
                      }
                      if (param1 != null &&
                        param1.length() > 0) {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param1);
                      }
                      if (var6 >= var5.length()) {
                        discarded$7 = var7.append('/');
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      }
                      try {
                        stackIn_40_0 = new java.net.URL(param4, var7.toString());
                        return stackIn_40_0;
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_42_0 = (java.net.URL) (param4);
                        return stackIn_42_0;
                      }
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = var5_ref;
            stackIn_45_1 = new StringBuilder().append("rv.A(");
            if (param0 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
            if (param1 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_a = null;
        responsePhraseIds = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        EventPresenter var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            field_a = (String) null;
          }
          if (DropdownArrowPainter.field_a) {
            if (null != ProgressMessageDialog.field_lb) {
              for (var4_int = 0; var4_int < ProgressMessageDialog.field_lb.length; var4_int++) {
                if (~param3 == ~ProgressMessageDialog.field_lb[var4_int]) {
                  TrianglePulse.field_d.d(param2, param1, 80, 40, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
                }
              }
            }
            vv.a(param2, -96, false, param3, us.a(param3, (byte) 87), param1);
            var4 = (EventPresenter) (NetworkResourceRequest.field_C.eventPresenters.first((byte) 125));
            while (var4 != null) {
              if (param3 == var4.tileIndex) {
                var4.draw(ug.field_b, 31785, true);
              }
              var4 = (EventPresenter) (NetworkResourceRequest.field_C.eventPresenters.next((byte) 123));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "rv.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "FROM ONLY";
    }
}
