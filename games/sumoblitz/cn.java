/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends dq {
    static String field_P;
    static dk field_ib;
    String field_gb;
    String field_jb;
    int field_kb;
    static String field_hb;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param2 == -103) {
                      var3 = new java.net.URL(param1.getCodeBase(), param0);
                      var3 = td.a((byte) 125, param1, var3);
                      kj.a(param2 ^ 23067, param1, true, var3.toString());
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("cn.F(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            field_P = (String) null;
            field_ib = null;
            field_hb = null;
            field_P = null;
            return;
        }
        field_ib = null;
        field_hb = null;
        field_P = null;
    }

    final static void a(float param0, ab param1, int param2, byte[] param3, int param4, float param5, float param6, float param7, int param8, float param9, int param10, int param11, int param12) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param8 == 24046) {
              var13_int = 0;
              L1: while (true) {
                if (var13_int >= param11) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ls.a(param0, param6, param2, param10, param3, var13_int, param7, param11, -95, param12, param4, param9, param1, param5);
                  param2 = param2 + param10 * param12;
                  var13_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var13);

            stackIn_9_1 = new StringBuilder().append("cn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    cn() {
        super(0L, (dq) null);
    }

    final static String[] a(char param0, String param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = (CharSequence) ((Object) param1);
              var3_int = vs.a((byte) -117, var10, param0);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              if (param2 == -27224) {
                break L1;
              } else {
                cn.c(39, 126);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param1.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param0 == param1.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param1.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("cn.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static int c(int param0, int param1) {
        if (param0 != 0) {
            field_hb = (String) null;
            param1 = param1 & 8191;
            if (-4097 >= (param1 ^ -1)) {
                return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
            }
            return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
        }
        param1 = param1 & 8191;
        if (-4097 >= (param1 ^ -1)) {
            return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
        }
        return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
    }

    static {
        field_P = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_ib = new dk();
        field_hb = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
