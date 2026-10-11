/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq extends pc {
    static String field_C;
    static String field_H;
    static String field_F;
    private int field_I;
    int field_E;
    private ch field_B;
    int field_J;
    static String field_G;

    final static void a(int param0, boolean param1) {
        int var3 = CrazyCrystals.field_B;
        if (param0 != -32056) {
          dq.a(-128, true);
          if (mo.field_l <= 0) {
            if (!rc.a(param0 ^ 32034)) {
              se.a((byte) -64, param1, 1);
              return;
            }
            se.a((byte) -63, param1, 0);
            return;
          }
          ph.field_E = io.a(640, 0, param0 ^ -1038173815, te.field_a, 480, 0);
          if (null != ph.field_E) {
            mm.a(ph.field_E, true);
            se.a((byte) -80, param1, 2);
            return;
          }
          se.a((byte) -108, param1, 3);
          return;
        }
        if (mo.field_l <= 0) {
          if (!rc.a(param0 ^ 32034)) {
            se.a((byte) -64, param1, 1);
            return;
          }
          se.a((byte) -63, param1, 0);
          return;
        }
        ph.field_E = io.a(640, 0, param0 ^ -1038173815, te.field_a, 480, 0);
        if (null != ph.field_E) {
          mm.a(ph.field_E, true);
          se.a((byte) -80, param1, 2);
          return;
        }
        se.a((byte) -108, param1, 3);
    }

    public static void f(byte param0) {
        field_F = null;
        if (param0 < -60) {
          field_H = null;
          field_G = null;
          field_C = null;
          return;
        }
        field_C = (String) null;
        field_H = null;
        field_G = null;
        field_C = null;
    }

    final static void a(int param0) {
        oj.a(true, tm.field_d, 480, 480, bq.field_i[1], 0, bq.field_i[2], 0, (byte) -32, bq.field_i[0]);
        if (param0 != -26477) {
          byte[] var2 = (byte[]) null;
          dq.a(44, (byte[]) null);
          if (ab.field_D != null) {
            ab.field_D.b(-1771219320);
            return;
          }
          if (go.field_i) {
            kh.d(0, 0, 480, 480, 0, 192);
            return;
          }
          return;
        }
        if (ab.field_D != null) {
          ab.field_D.b(-1771219320);
          return;
        }
        if (!go.field_i) {
          return;
        }
        kh.d(0, 0, 480, 480, 0, 192);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = qe.a((byte) 36, '_', param2, "");
          if (param1 >= -53) {
            field_C = (String) null;
          }
          var3 = pc.a(param0, 0);
          stackIn_7_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("dq.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int e(byte param0) {
        if (param0 != -49) {
          return 23;
        }
        return this.field_B.a(true);
    }

    final static dh a(int param0, byte[] param1) {
        dh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        dh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (dh) (stackIn_2_0);
          }
          var2 = new dh(param1, uo.field_k, jm.field_a, uo.field_l, je.field_c, gh.field_z, ui.field_c);
          ok.a(2188450);
          if (param0 != -18289) {
            dq.f((byte) -96);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("dq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param0 < 0) {
          return -1;
        }
        if (param0 < this.field_B.a(true)) {
          int var3 = 20 % ((-49 - param1) / 54);
          return this.field_B.d(-32240, param0);
        }
        return -1;
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        ch stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        var14 = CrazyCrystals.field_B;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (param3) {
              var15 = (byte[]) null;
              dq.a(116, (byte[]) null);
            }
            return false;
          }
          var8_int = -param0 + param6 - this.field_E;
          var9 = this.field_g - this.field_E * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = this.field_I * var8_int / var9;
          if (1 == param5) {
            this.field_B.a(var8_int, (byte) 123);
          } else {
            if (param5 == 2) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              while (true) {
                stackIn_13_0 = this.field_B;
                stackIn_14_1 = !(param3);
                if (((ch) (Object) stackIn_13_0).a(stackIn_14_1) <= var12) {
                  if (var11 < 0) {
                    return true;
                  }
                  this.field_B.c(127, var11);
                  break;
                }
                var13 = -var8_int + this.field_B.d(-32240, var12);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var10 = var13;
                  var11 = var12;
                }
                var12++;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_31_0 = var8;
          stackIn_31_1 = new StringBuilder().append("dq.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private dq() throws Throwable {
        throw new Error();
    }

    final int h(int param0) {
        if (param0 != -1) {
          this.h(-4);
          return this.field_I;
        }
        return this.field_I;
    }

    static {
        field_C = "Type your email address again to make sure it's correct";
        field_F = "Log";
        field_H = "Earth";
        field_G = "Passwords must be between 5 and 20 characters long";
    }
}
