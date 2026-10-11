/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh implements ca {
    static String field_a;
    static md field_j;
    private se field_m;
    private int field_g;
    static int field_s;
    private int field_p;
    private int field_f;
    private int field_c;
    private int field_k;
    private int field_d;
    private int field_e;
    static String field_o;
    private int field_h;
    private int field_l;
    static String field_q;
    private int field_i;
    static String field_b;
    private int field_r;
    static int field_t;
    static String field_n;

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        try {
          al.field_o.a(1);
          al.field_o.a(24, -92);
          jb.field_Sb[24] = -1;
          if (param1 != 7) {
            field_b = (String) null;
          }
          hf.field_ob.b(-4);
          hf.field_ob.a(new a(24), false);
          while (!hf.field_ob.a((byte) -88)) {
            var2_int = ((a) (hf.field_ob.b((byte) -124))).field_j;
            if (me.field_g[var2_int].field_h.field_g == param0) {
              al.field_o.b(var2_int, param1 + 24);
              continue;
            }
            if (var2_int % 7 > 0) {
              me.a(var2_int, -1 + var2_int, (byte) 69, var2_int - 1 - var2_int / 7);
            }
            if (var2_int % 7 < 6) {
              me.a(var2_int, var2_int + 1, (byte) 114, -(var2_int / 7) + var2_int);
            }
            if (var2_int > 6) {
              me.a(var2_int, -7 + var2_int, (byte) 71, var2_int - 7 + 42);
            }
            if (42 <= var2_int) {
              continue;
            }
            me.a(var2_int, 7 + var2_int, (byte) 115, var2_int + 42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "oh.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_a = null;
        if (param0 < 0) {
          return;
        }
        field_q = null;
        field_b = null;
        field_n = null;
        field_o = null;
    }

    final static me a(String param0, int param1) {
        RuntimeException var2 = null;
        me stackIn_2_0 = null;
        me stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -8) {
            stackIn_4_0 = new me(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (me) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("oh.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (null != m.field_e &&
          20 <= gn.field_h) {
          if (m.field_e != un.field_e) {
            of.field_f = m.field_e.b((byte) -114);
            if (of.field_f != null) {
              uo.field_a = dd.a((byte) -112, 8, of.field_f);
            }
          }
          if (null != of.field_f) {
            var1 = of.field_f.field_y;
            var2 = of.field_f.field_v;
            var3 = hj.field_S;
            if (var1 + var3 > 640) {
              var3 = var3 - var1;
            }
            var4 = eh.field_h - var2;
            if (0 > var4) {
              var4 = var4 + (30 + var2);
            }
            gf.b(-8 + var3, -8 + var4, of.field_f.field_y + 16, of.field_f.field_v + 16, 16777215, 16);
            gf.b(var3 - 4, -4 + var4, 8 + of.field_f.field_y, of.field_f.field_v + 8, 0, 64);
            bp.a(var4, uo.field_a, var3, (byte) 99);
            of.field_f.h(var3, var4);
          }
        }
        if (param0 <= 1) {
          field_j = (md) null;
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        lm stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rb var11 = null;
        try {
          if (param1 instanceof rb) {
            stackIn_3_0 = (lm) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (rb) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_B;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          gf.b(param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, this.field_g);
          if (param0 != 34) {
            oh.a(32, '￴');
          }
          var8 = param2 + param1.field_q + this.field_d;
          var9 = param3 + (param1.field_v + this.field_h);
          gf.a(var8, var9, this.field_l, this.field_e, 5592405);
          gf.b(var8, var9, this.field_l, this.field_e, var7);
          if (var11.field_E) {
            gf.c(var8, var9, this.field_l + var8, this.field_e + var9, 1);
            gf.c(var8 + this.field_l, var9, var8, var9 + this.field_e, 1);
          }
          if (null != this.field_m) {
            var10 = this.field_k + this.field_l + this.field_d;
            this.field_m.a(param1.field_w, param1.field_q + param2 + var10, this.field_f + (param1.field_v + param3), -var10 - (this.field_k - param1.field_x), -(this.field_k << 1) + param1.field_s, this.field_p, this.field_i, this.field_c, this.field_r, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("oh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static cn a(nh param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        cn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 11091) {
            var6 = (String) null;
            oh.a((String) null, -24);
          }
          var4_int = param0.a(param1, 1000);
          var5 = param0.a(0, param3, var4_int);
          stackIn_3_0 = jf.a(var5, param0, var4_int, (byte) 41);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("oh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = DungeonAssault.field_K;
        try {
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            255 < param1)) {
            if (0 != param1) {
              var6 = mh.field_d;
              var2 = var6;
              for (var3 = 0; var3 < var6.length; var3++) {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                }
              }
            }
            if (param0 == -161) {
              return false;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "oh.A(" + param0 + ',' + param1 + ')');
        }
    }

    oh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_c = 1;
        this.field_r = 1;
        try {
          this.field_k = param1;
          this.field_h = param6;
          this.field_p = param3;
          this.field_g = param9;
          this.field_e = param7;
          this.field_d = param5;
          this.field_i = param4;
          this.field_f = param2;
          this.field_m = param0;
          this.field_l = param8;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Recently raided by: ";
        field_q = "Hidden Pit";
        field_b = "Reload game";
        field_j = new md();
        field_n = "Play the game without logging in just yet";
    }
}
