/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vn {
    int field_d;
    static al field_g;
    static hh field_c;
    static cn field_e;
    int field_h;
    static String field_b;
    static int[][] field_a;
    java.awt.Image field_f;
    int[] field_i;

    public static void a(byte param0) {
        field_a = (int[][]) null;
        field_g = null;
        if (param0 < 72) {
          return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0) {
        if (param0 <= 105) {
          vn.a((byte) -18);
        }
        em.a(this.field_i, this.field_d, this.field_h);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        lj var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          if (0 < param1) {
            var9 = new byte[param2];
            var4 = var9;
            for (var5_int = 0; var5_int < param2; var5_int++) {
              var9[var5_int] = param0[param1 + var5_int];
            }
          } else {
            var4 = param0;
          }
          var5 = new lj();
          var5.b(false);
          var5.a((long)(8 * param2), var4, 2);
          var6 = new byte[64];
          var5.a(0, var6, false);
          if (param3 != 0) {
            var8 = (String) null;
            vn.a((byte) 62, (String) null);
          }
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("vn.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static d a(byte param0, String param1) {
        RuntimeException var2 = null;
        d stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 24) {
            field_g = (al) null;
          }
          stackIn_3_0 = new d(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, java.net.URL param3, int param4) {
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
          java.net.URL stackIn_29_0 = null;
          java.net.URL stackIn_43_0 = null;
          java.net.URL stackIn_45_0 = null;
          RuntimeException stackIn_48_0 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          StringBuilder stackIn_54_1 = null;
          String stackIn_55_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = EscapeVector.field_A;
          try {
            var5 = param3.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                decompiledFrameRemainder0 = !(0 <= var7_int);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param2 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  if (param4 != 1) {
                    stackIn_29_0 = (java.net.URL) null;
                    return stackIn_29_0;
                  }
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param1 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param1));
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param2);
                  }
                  if (param0 != null &&
                    param0.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param0);
                  }
                  if (var6 >= var5.length()) {
                    discarded$7 = var7.append('/');
                  } else {
                    discarded$8 = var7.append(var5.substring(var6, var5.length()));
                  }
                  try {
                    stackIn_43_0 = new java.net.URL(param3, var7.toString());
                    return stackIn_43_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_45_0 = (java.net.URL) (param3);
                    return stackIn_45_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_48_0 = var5_ref;
            stackIn_48_1 = new StringBuilder().append("vn.H(");
            if (param0 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
            if (param3 == null) {
              stackIn_55_2 = "null";
            } else {
              stackIn_55_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = EscapeVector.field_A;
        try {
          var2_long = 0L;
          var4 = param1.length();
          if (param0 < 47) {
            field_g = (al) null;
          }
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-64 + var6);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(-97 + (var6 + 1));
            } else {
              if (48 <= var6 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("vn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_g = new al();
        field_b = "That name is not available";
        field_e = new cn();
        field_a = new int[][]{new int[]{0, 1}, new int[]{2}, new int[]{3}};
    }
}
