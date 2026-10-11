/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ew extends bca {
    static int[] field_s;
    static ee field_q;
    static kv field_r;

    final void a(byte param0, lu param1) {
        try {
          if (param0 > -12) {
            CharSequence var4 = (CharSequence) null;
            ew.a((byte) 95, (CharSequence) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ew.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, int param2, String param3, String param4) {
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
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = BachelorFridge.field_y;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((0 <= var7_int) &&
                  (decompiledFrameRemainder0 = !(param2 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  decompiledFrameRemainder0 = !(0 <= var7_int);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param3 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5.regionMatches(var6, "/s=", 0, 3) ||
                      var5.regionMatches(var6, "/c=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if ((0 <= var7_int) &&
                        (decompiledFrameRemainder0 = (param4 != null))) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (0 < param2) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param2));
                      }
                      if (param3 != null &&
                        0 < param3.length()) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param3);
                      }
                      if (param4 != null &&
                        0 < param4.length()) {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param4);
                      }
                      if (var6 >= var5.length()) {
                        discarded$7 = var7.append('/');
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      }
                      try {
                        if (param1 != 25969) {
                          ew.d(35);
                        }
                        stackIn_41_0 = new java.net.URL(param0, var7.toString());
                        return stackIn_41_0;
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_43_0 = (java.net.URL) (param0);
                        return stackIn_43_0;
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
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("ew.B(");
            if (param0 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
            if (param4 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(op param0, int param1) {
        try {
          int var3_int = 113 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ew.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ew(lu param0) {
        super(param0);
    }

    final static boolean a(int[] param0, long param1, int param2, boolean param3, String param4) {
        nv var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!eu.a(param4, (byte) -103, param1, param2, param0)) {
            return false;
          }
          if (param2 == 1) {
            param2 = 0;
          }
          gk.field_d = param2;
          bd.field_k = param4;
          var7 = (CharSequence) ((Object) param4);
          df.field_s = fq.a(0, var7);
          eaa.field_a = param1;
          var6 = lma.a(jv.field_i, param0, tga.field_p, 0, mj.field_k);
          if (param3) {
            return true;
          }
          lga.a(var6, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("ew.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        op var4 = null;
        ra stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (op) null;
            this.a((op) null, 89);
          }
          stackIn_3_0 = new ra(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ew.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var5Lifetime1;
        if (param0 <= param4) {
          hba.a(param3, param0, tj.field_b[param1], 7, param4);
          var5 = 13 % ((param2 + 26) / 40);
          return;
        }
        hba.a(param3, param4, tj.field_b[param1], 7, param0);
        var5Lifetime1 = 13 % ((param2 + 26) / 40);
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var6 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_8_0 = 0L;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          var2_int = param1.length();
          var3 = 0L;
          if (param0 != 8) {
            stackIn_3_0 = -70L;
            return stackIn_3_0;
          }
          for (var5 = 0; var2_int > var5; var5++) {
            var3 = -var3 + ((var3 << 5) + (long)param1.charAt(var5));
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ew.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 == 16776) {
          field_q = null;
          field_s = null;
          field_r = null;
          return;
        }
        ew.a(34, -45, 26, 51, -47);
        field_q = null;
        field_s = null;
        field_r = null;
    }

    ew(nq param0) {
        super(1023, param0);
    }

    static {
        field_s = new int[8192];
    }
}
