/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static int[] field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        if (param0 <= 108) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = HoldTheLine.field_D;
        try {
          var2_long = 0L;
          var4 = param0.length();
          if (param1 != -13820) {
            var8 = (CharSequence) null;
            ko.a((CharSequence) null, -60);
          }
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (var6 + 1));
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 - (-var6 + 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ko.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static mf[] a(int param0) {
        int var1 = -36 % ((param0 + 55) / 43);
        return new mf[]{ja.field_Wb, gj.field_s, ho.field_n};
    }

    final static hj[] a(boolean param0) {
        int var1 = 0;
        int var4 = HoldTheLine.field_D;
        hj[] var2 = new hj[28];
        hj var3 = dl.a(fb.field_i, "overlayfont", param0, "");
        int var1Lifetime1;
        int var1Lifetime2;
        for (var1 = 0; var1 < 10; var1++) {
          var2[var1 + 0] = fj.a(0, 30 * var1, var3, 50, 0, 30);
        }
        var2[24] = fj.a(0, 300, var3, 20, 0, 40);
        var2[26] = fj.a(0, 340, var3, 20, 0, 40);
        for (var1Lifetime1 = 0; var1Lifetime1 < 10; var1Lifetime1++) {
          var2[var1Lifetime1 + 10] = fj.a(0, 20 * var1Lifetime1, var3, 20, 60, 20);
        }
        var2[27] = fj.a(0, 300, var3, 20, 70, 15);
        var2[25] = fj.a(0, 320, var3, 30, 60, 75);
        for (var1Lifetime2 = 0; var1Lifetime2 < 4; var1Lifetime2++) {
          var2[20 + var1Lifetime2] = fj.a(0, var1Lifetime2 * 60, var3, 30, 90, 60);
        }
        return var2;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (10 > pf.field_d) {
            var3_int = 0;
            if (cg.field_a) {
              cg.field_a = false;
              var3_int = 1;
            }
            jd.a(q.b((byte) 118), dm.field_d, ni.a((byte) -120), 300, var3_int != 0);
          } else {
            if (!ge.a(true)) {
              tc.c();
              vb.a(-76, 240, 320);
              hi.a(param1, 0, true, 0);
            } else {
              if (bk.field_w != 0) {
                ck.a((byte) -97, param1);
              } else {
                vk.a(param2, false, 86);
                hi.a(param1, 0, true, 0);
              }
            }
          }
          if (param0 >= -19) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ko.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_a = "<col=2>You are not currently logged in.</col><br><br>To store your score, progress or achievements, you must log in or register by clicking <col=1>Log in/Register</col> above.<br><br>Otherwise, click <col=1>Discard</col> to lose them and continue.";
        field_c = fc.a(-117, 25, 4);
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$210fc2102f3d(int param0, java.awt.Canvas param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (10 > pf.field_d) {
            var3_int = 0;
            if (cg.field_a) {
              cg.field_a = false;
              var3_int = 1;
            }
            jd.a(q.b((byte) 118), dm.field_d, ni.a((byte) -120), 300, var3_int != 0);
          } else {
            if (!ge.a(true)) {
              tc.c();
              vb.a(-76, 240, 320);
              hi.a(param1, 0, true, 0);
            } else {
              if (bk.field_w != 0) {
                ck.a((byte) -97, param1);
              } else {
                vk.a(param2, false, 86);
                hi.a(param1, 0, true, 0);
              }
            }
          }
          if (param0 >= -19) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ko.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }
}
