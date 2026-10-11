/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends gf {
    static long field_l;
    private tk field_m;
    static int[] field_o;
    private tk field_n;

    public static void f(int param0) {
        if (param0 > -73) {
          CharSequence var2 = (CharSequence) null;
          ij.a(true, 89, (CharSequence) null, 107);
        }
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_m.field_m.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (param0 != -121) {
            this.field_n = (tk) null;
          }
          var5 = var4;
          if (va.b(var5, 25326)) {
            stackIn_8_0 = dj.field_b;
            return stackIn_8_0;
          }
          if (hk.a(true, var5)) {
            stackIn_12_0 = nh.field_q;
            return stackIn_12_0;
          }
          if (fm.a((byte) -98, var5)) {
            stackIn_15_0 = jg.field_u;
            return stackIn_15_0;
          }
          if (this.b((byte) -6, param1)) {
            stackIn_18_0 = fi.field_f;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_33_0 = ci.field_b;
            return stackIn_33_0;
          }
          if (tm.a(true, var5, var6)) {
            stackIn_23_0 = jn.field_a;
            return stackIn_23_0;
          }
          if (rh.a(true, var6, var5)) {
            stackIn_26_0 = nh.field_o;
            return stackIn_26_0;
          }
          if (!vk.a(var6, 4096, var5)) {
            stackIn_31_0 = dj.field_b;
            return stackIn_31_0;
          }
          stackIn_29_0 = jn.field_a;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("ij.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 15 % ((79 - param0) / 43);
          var3 = this.field_n.field_m.toLowerCase();
          var5 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var5.length() <= 0) {
              return false;
            }
            var6 = var3.lastIndexOf("@");
            if (0 <= var6 &&
              -1 + var3.length() > var6) {
              var7 = var3.substring(0, var6);
              var8 = var3.substring(var6 + 1);
              if (var5.indexOf(var7) >= 0) {
                return true;
              }
              if (var5.indexOf(var8) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ij.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final cd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        cd stackIn_2_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_12_0 = null;
        cd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_m.field_m.toLowerCase();
          if (param0 <= 62) {
            stackIn_2_0 = (cd) null;
            return stackIn_2_0;
          }
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_6_0 = so.field_u;
            return stackIn_6_0;
          }
          if (!cd.a(var4, 18, var3)) {
            stackIn_9_0 = so.field_u;
            return stackIn_9_0;
          }
          if (!this.b((byte) -56, param1)) {
            stackIn_14_0 = so.field_s;
            return stackIn_14_0;
          }
          stackIn_12_0 = so.field_u;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ni var4_ref_ni = null;
        Object var5 = null;
        int var6 = 0;
        qa var9 = null;
        df var10 = null;
        byte[] var14 = null;
        var6 = Torquing.field_u;
        try {
          var10 = kj.field_d;
          var2 = var10.i((byte) -101);
          if (var2 == 0) {
            var9 = (qa) (qf.field_a.b(0));
            if (var9 == null) {
              ih.b(true);
              return;
            }
            var4 = var10.i((byte) -101);
            if (var4 != 0) {
              var14 = new byte[var4];
              var10.a(48, var4, var14, 0);
            } else {
              var5 = null;
            }
            var10.field_n = var10.field_n + 4;
            if (!var10.h(-31017)) {
              ih.b(true);
              return;
            }
            var9.f(0);
          } else {
            if (1 == var2) {
              var3 = var10.c((byte) -59);
              var4_ref_ni = (ni) (vb.field_f.b(param0 ^ 10078));
              while (var4_ref_ni != null) {
                if (var3 != var4_ref_ni.field_k) {
                  var4_ref_ni = (ni) (vb.field_f.f(-24059));
                  continue;
                }
                break;
              }
              if (var4_ref_ni == null) {
                ih.b(true);
                return;
              }
              var4_ref_ni.f(0);
            } else {
              nn.a("A1: " + me.a(-1), (Throwable) null, -9958);
              ih.b(true);
            }
          }
          if (param0 != 10078) {
            field_l = 30L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ij.O(" + param0 + ')');
        }
    }

    ij(tk param0, tk param1, tk param2) {
        super(param0);
        try {
          this.field_m = param1;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          if (param1 >= 2 &&
            36 >= param1) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            if (param3 != -98) {
              field_l = -68L;
            }
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param0))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param1 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param1 + var9;
                if (var10 / param1 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("ij.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
