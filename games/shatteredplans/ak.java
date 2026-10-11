/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends jc {
    static boolean field_A;
    byte[] field_w;
    int field_y;
    static bi field_x;
    static fm field_v;
    ua field_B;
    static bi field_z;

    public static void h(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 100 % ((-56 - param0) / 52);
    }

    final static void a(int param0, int param1, wa param2) {
        int stackIn_7_0;
        int stackIn_7_1;
        Object stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        wa var5 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 > param1 &&
            param2.field_h > param0) {
            stackIn_7_0 = param2.field_a;
            stackIn_7_1 = param2.field_a * (param0 - 1) + param2.field_f;
            stackIn_7_2 = null;
            stackIn_7_3 = param2.field_f + param0 * param2.field_a;
            if (2147483647 == param2.field_h) {
              stackIn_8_4 = param2.field_h;
            } else {
              stackIn_8_4 = -param0 + param2.field_h;
            }
            var5 = wi.a(stackIn_7_0, stackIn_7_1, (wa) (stackIn_7_2), stackIn_7_3, stackIn_8_4, param2.field_g + param0, param1 - 3903);
            param2.field_h = param0;
            while (param2.field_c != null) {
              if (!(param2.field_c.field_g >= var5.field_g) ||
                param2.field_c.field_g == var5.field_g &&
                !(param2.field_c.field_h <= var5.field_h)) {
                param2 = param2.field_c;
                continue;
              }
              break;
            }
            var5.field_c = param2.field_c;
            param2.field_c = var5;
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ak.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(bc param0, byte param1, boolean param2, bc param3) {
        try {
          int var4_int = -57 / ((param1 - 22) / 37);
          ba.a(n.field_o, dm.field_h, 124, fg.field_b, se.field_m, mc.field_o, l.field_a, oh.field_a, param2, ul.field_xb, ii.field_u, gn.field_w);
          bh.field_m = ae.a(93, "lobby", param3, "chatfilter");
          jf.field_d[1] = gm.field_o;
          jf.field_d[0] = bf.field_b;
          jf.field_d[2] = ue.field_d;
          ne.a(param0, (byte) -64, ge.field_p);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ak.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 != 118) {
          CharSequence var2 = (CharSequence) null;
          ak.a(22, (CharSequence) null, '\001');
          if (di.field_m == 0) {
            sg.a(true, false, 50, vr.field_d, tk.field_C);
          }
          fieldTemp$0 = di.field_m + 1;
          di.field_m = di.field_m + 1;
          if (fieldTemp$0 == 750) {
            jc.a(4, (byte) 122);
            return;
          }
          return;
        }
        if (di.field_m == 0) {
          sg.a(true, false, 50, vr.field_d, tk.field_C);
        }
        int fieldTemp$1 = di.field_m + 1;
        di.field_m = di.field_m + 1;
        if (fieldTemp$1 != 750) {
          return;
        }
        jc.a(4, (byte) 122);
    }

    final int e(int param0) {
        if (this.field_u) {
          return 0;
        }
        if (param0 != 0) {
          this.field_w = (byte[]) null;
          return 100;
        }
        return 100;
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (ol.a(-126)) {
          o.a(param3, param6, false, param2);
          if (null != hp.field_m &&
            hp.field_m.a(param6, param1, -16, param5, param3)) {
            ai.a(3);
            param3 = false;
          }
          jl.a(-21, param3, param6);
          nf.a(-126, param4, param3);
          param3 = false;
        }
        if (param0) {
          return param3;
        }
        field_A = false;
        return param3;
    }

    final static void c(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        wm.field_b = param1;
        if (jh.field_B == null) {
          if (null != u.field_b) {
            u.field_b.a(param1, 0);
          }
          var2 = -9 / ((62 - param0) / 62);
          return;
        }
        jh.field_B.c(598, param1);
        if (null != u.field_b) {
          u.field_b.a(param1, 0);
        }
        var2Lifetime1 = -9 / ((62 - param0) / 62);
    }

    final static void i(int param0) {
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (qa.field_t > 0) {
          qa.field_t = qa.field_t - 1;
        } else {
          if (bc.field_b > 0) {
            bc.field_b = bc.field_b - 1;
          } else {
            if (ee.field_k > 0) {
              ee.field_k = ee.field_k - 1;
            }
          }
        }
        if (param0 != -751) {
          field_z = (bi) null;
        }
        if (qa.field_t > 0) {
          nj.a(438);
        }
        if (bc.field_b > 0) {
          qo.a(22353, bc.field_b);
        }
        if (ee.field_k > 0) {
          qo.a(22353, ee.field_k);
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1.charAt(var5) == param2) {
              var3_int++;
            }
          }
          var6 = 6 % ((-32 - param0) / 50);
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ak.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    ak() {
    }

    final byte[] e(byte param0) {
        if (param0 <= 48) {
          this.field_y = -105;
          if (this.field_u) {
            throw new RuntimeException();
          }
          return this.field_w;
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        return this.field_w;
    }

    final static void a(int[] param0, int param1, Object[] param2) {
        try {
          int var3_int = 105 / ((param1 - 42) / 55);
          lr.a(0, param0.length - 1, param0, (byte) 78, param2);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ak.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
