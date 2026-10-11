/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends lb {
    private Object field_y;
    static String field_z;
    static ka[][] field_v;
    static kh field_B;
    static int[] field_w;
    static ka[][] field_x;
    static int field_A;

    public static void e(byte param0) {
        if (param0 > -77) {
          re.a(86, -45, 70, -5);
        }
        field_B = null;
        field_v = (ka[][]) null;
        field_z = null;
        field_x = (ka[][]) null;
        field_w = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        if (param1 == param0) {
          return false;
        }
        var4 = param1 >> 16 & -1;
        param1 = 65535 & param1;
        if (var4 >= 0) {
          if (var4 <= 1) {
            if (0 <= param1) {
              stackIn_12_0 = (param1 < 3) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
          } else {
            stackIn_12_0 = 0;
          }
        } else {
          stackIn_12_0 = 0;
        }
        var5 = stackIn_12_0;
        if (var5 == 0) {
          return false;
        }
        if (param2 == var4) {
          if (param3 != param1) {
            stackIn_22_0 = (0 > param3) ? 1 : 0;
          } else {
            stackIn_22_0 = 1;
          }
        } else {
          stackIn_22_0 = 0;
        }
        var6 = stackIn_22_0;
        return var6 != 0;
    }

    final static vi a(String param0, byte param1) {
        vi stackIn_4_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        vi stackIn_25_0 = null;
        vi stackIn_40_0 = null;
        vi stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = dj.field_W;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = uk.field_I;
            return stackIn_8_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_13_0 = di.field_g;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_25_0 = di.field_g;
                  return stackIn_25_0;
                }
                var3 = 0;
              } else {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          if (param1 != 104) {
            var7 = (String) null;
            re.a((String) null, (byte) -97);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = di.field_g;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (rk.field_h.indexOf(var5Lifetime1) == -1) {
                stackIn_44_0 = di.field_g;
                return stackIn_44_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("re.I(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(')').toString());
        }
    }

    final Object c(byte param0) {
        if (param0 != 70) {
          field_z = (String) null;
        }
        return this.field_y;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
              if (param1 != 7184) {
                field_B = (kh) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("re.K(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    re(Object param0, int param1) {
        super(param1);
        try {
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 1024) {
          String var3 = (String) null;
          re.a((String) null, (byte) -106);
          return false;
        }
        return false;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18990) {
            re.a(-67, -69, 50, -31);
          }
          stackIn_3_0 = r.a(param1.length, 0, param1, (byte) 8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("re.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_w = new int[]{1, 1, 2, 2, 3, 1, 2, 3, 1, 2, 2, 3, 1, 2, 3, 3, 1};
        field_z = "Please try again in a few minutes.";
        field_v = new ka[2][2];
        field_x = new ka[9][];
    }
}
