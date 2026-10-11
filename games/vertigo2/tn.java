/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn {
    String field_k;
    int field_h;
    boolean field_n;
    static fe field_i;
    String field_d;
    static String field_r;
    static int field_c;
    int field_s;
    int field_q;
    static int field_j;
    long field_b;
    static long field_p;
    int field_m;
    String field_l;
    int[] field_f;
    String field_a;
    static String field_g;
    cr field_e;
    int field_o;

    final static er a(String param0, r param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er stackIn_2_0 = null;
        er stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a((byte) 118, param3);
          var5 = param1.a(var4_int, param0, 98);
          if (param2 <= -70) {
            stackIn_4_0 = cr.a(var5, param1, (byte) -117, var4_int);
            return stackIn_4_0;
          }
          stackIn_2_0 = (er) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("tn.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 55) {
          field_p = -63L;
        }
        vm.field_c = param1;
        s.field_u = param0;
    }

    final int a(byte param0) {
        int var2;
        var2 = 31 / ((-37 - param0) / 43);
        if (!this.field_n && (this.field_s != 2 ||
          this.field_h <= 0)) {
          if (this.field_b == ao.field_N) {
            return 1;
          }
          if (ba.field_d == 2 &&
            c.a(this.field_a, (byte) -49)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            if (param3 > -126) {
              return false;
            }
            while (var8 < var7) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (122 < var9) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var10 / param0 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
              var8++;
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("tn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(lq param0, String param1, cc param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 < 16) {
            field_c = 15;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param0.field_c[0] + param2.c(param1.substring(0, var7)));
            }
            if (-1 != var6) {
              param0.field_c[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param4;
              }
              param0.field_c[var7] = (var5_int >> 8) + (param0.field_c[0] + param2.c(param1.substring(0, 1 + var7)) - param2.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("tn.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 >= -76) {
          return;
        }
        field_r = null;
        field_g = null;
    }

    tn(boolean param0) {
        this.field_k = ad.field_a;
        this.field_l = sp.field_U;
        this.field_q = tj.field_b;
        if (param0) {
          this.field_f = sd.field_P;
        } else {
          this.field_f = null;
        }
        this.field_s = ln.field_c;
        this.field_h = rq.field_u;
        this.field_m = qf.field_a;
        this.field_b = ug.field_a;
        this.field_n = cb.field_Ib;
        this.field_a = fd.field_p;
        this.field_d = tj.field_a;
        this.field_o = ck.field_J;
    }

    tn(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_a = param1;
          this.field_f = null;
          this.field_h = 0;
          this.field_s = param0;
          this.field_d = param4;
          this.field_m = 0;
          this.field_n = true;
          this.field_l = param1;
          this.field_b = 0L;
          this.field_o = 0;
          this.field_q = param2;
          this.field_k = param3;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 32;
        field_j = 0;
        field_r = "Connecting to<br>friend server...";
        field_g = "<%0>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$95d5eaff65e7(lq param0, String param1, cc param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 < 16) {
            field_c = 15;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param0.field_c[0] + param2.c(param1.substring(0, var7)));
            }
            if (-1 != var6) {
              param0.field_c[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param4;
              }
              param0.field_c[var7] = (var5_int >> 8) + (param0.field_c[0] + param2.c(param1.substring(0, 1 + var7)) - param2.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("tn.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }
}
