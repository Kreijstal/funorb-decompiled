/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static int[] field_a;
    static int[][] field_h;
    static int field_f;
    static cd field_d;
    static int[] field_c;
    static int[] field_b;
    static int[] field_e;
    static String field_i;
    static long field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_h = (int[][]) null;
        field_b = null;
        field_d = null;
        field_i = null;
        if (param0 > 103) {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        try {
          kk.field_c = param2;
          ob.field_F = param3;
          jj.a(param1, gb.field_c, 1702);
          if (param0 < 58) {
            fd.a(-9);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = el.field_n;
          synchronized (var1) {
            if (!param0) {
              field_f = 1;
            }
            bg.field_l = bf.field_B;
            vd.field_a = vd.field_a + 1;
            if (0 > j.field_b) {
              for (var2 = 0; 112 > var2; var2++) {
                ve.field_B[var2] = false;
              }
              j.field_b = sc.field_a;
            } else {
              while (sc.field_a != j.field_b) {
                var2 = se.field_p[sc.field_a];
                sc.field_a = 127 & sc.field_a + 1;
                if (var2 < 0) {
                  ve.field_B[~var2] = false;
                  continue;
                }
                ve.field_B[var2] = true;
              }
            }
            bf.field_B = dk.field_i;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "fd.D(" + param0 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
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
          java.net.URL stackIn_44_0 = null;
          java.net.URL stackIn_46_0 = null;
          RuntimeException stackIn_49_0 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          StringBuilder stackIn_55_1 = null;
          String stackIn_56_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = Transmogrify.field_A ? 1 : 0;
          try {
            var5 = param3.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param0 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                decompiledFrameRemainder0 = !(var7_int >= 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                    var6 = var7_int;
                    continue;
                  }
                }
                if (var5.regionMatches(var6, "/s=", 0, 3) ||
                  var5.regionMatches(var6, "/c=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param1 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param2 != 130) {
                    field_d = (cd) null;
                  }
                  if (param0 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param0));
                  }
                  if (param4 != null &&
                    param4.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param4);
                  }
                  if (param1 != null &&
                    param1.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param1);
                  }
                  if (var5.length() > var6) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  try {
                    stackIn_44_0 = new java.net.URL(param3, var7.toString());
                    return stackIn_44_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_46_0 = (java.net.URL) (param3);
                    return stackIn_46_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_49_0 = var5_ref;
            stackIn_49_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
            if (param4 == null) {
              stackIn_56_2 = "null";
            } else {
              stackIn_56_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[]{0, 3, 17, 12, 13, 4, 2, 14, 11}, (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[]{1, 12, 13, 4, 3, 7}, (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[]{21, 12, 13, 4, 3, 22}, (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[]{15, 5}, (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[]{18, 6, 19, 20}, (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[]{15, 5}, (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[]{2, 5}, (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[]{15, 16}, (byte) 57, 443, 197, 260);
    }
}
