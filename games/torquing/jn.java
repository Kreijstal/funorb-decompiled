/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_a;
    static String field_b;
    static sm[] field_c;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        if (null == uk.field_a ||
          !(param2 <= uk.field_a.length)) {
          uk.field_a = new int[2 * param2];
        }
        if (il.field_o == null ||
          !(param2 <= il.field_o.length)) {
          il.field_o = new int[2 * param2];
        }
        if (null == wh.field_y ||
          !(param2 <= wh.field_y.length)) {
          wh.field_y = new int[param2 * 2];
        }
        if (param1 != 3328) {
          field_b = (String) null;
        }
        if (vo.field_d == null ||
          !(vo.field_d.length >= param2)) {
          vo.field_d = new int[param2 * 2];
        }
        if (null == vp.field_F ||
          !(vp.field_F.length >= param2)) {
          vp.field_F = new int[param2 * 2];
        }
        if (ji.field_a == null ||
          !(param2 <= ji.field_a.length)) {
          ji.field_a = new int[param2 * 2];
        }
        if (lp.field_g == null ||
          !(param2 + param0 <= lp.field_g.length)) {
          lp.field_g = new int[2 * (param2 + param0)];
        }
        if (null == go.field_s ||
          !(param2 <= go.field_s.length)) {
          go.field_s = new boolean[2 * param2];
        }
        lj.field_d = 2147483647;
        qd.field_g = -2147483648;
        ga.field_c = 2147483647;
        mc.field_l = -2147483648;
        vg.field_o = 0;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 96 % ((param0 + 53) / 34);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          if (!mn.a(param0, param2, (byte) 67)) {
            return false;
          }
          var3_int = 0;
          if (param1 < 97) {
            var5 = (CharSequence) null;
            jn.a((CharSequence) null, (byte) 7, true);
          }
          while (true) {
            if (var3_int >= param0.length()) {
              return true;
            }
            if (co.a(47, param0.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        fn stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Torquing.field_u;
        try {
          var1_int = a.field_d;
          var2 = 0;
          if (param0 <= 51) {
            return;
          }
          if (go.field_x == 2) {
            var3_long = km.b(-1) - dc.field_c;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < wh.field_z.length; var3++) {
            var4 = mn.field_Z[var3];
            if (var4 < 0) {
              var5 = uf.field_c;
            } else {
              if (var4 != kb.field_g.field_g) {
                var5 = cc.field_c;
              } else {
                var5 = qa.field_l;
              }
            }
            var6 = wh.field_z[var3];
            if (go.field_x == 2 &&
              var2 == 1) {
              if (qh.field_b.length > fd.field_k.length) {
                stackIn_18_0 = qh.field_b.length;
              } else {
                stackIn_18_0 = fd.field_k.length;
              }
              var7 = stackIn_18_0;
              if (var3 >= 6 &&
                var3 < var7 + 6) {
                if (-var7 + (fd.field_k.length + (var3 - 6)) < 0) {
                  stackIn_24_0 = "";
                } else {
                  stackIn_24_0 = fd.field_k[-var7 + (-6 + var3 + fd.field_k.length)];
                }
                var6 = stackIn_24_0;
              }
              if (me.field_a.length <= ib.field_c.length) {
                stackIn_28_0 = ib.field_c.length;
              } else {
                stackIn_28_0 = me.field_a.length;
              }
              var8 = stackIn_28_0;
              if (var3 >= 7 + var7 &&
                var7 + (7 + var8) > var3) {
                if (-7 + (var3 - var7) >= ib.field_c.length) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = ib.field_c[var3 + (-7 - var7)];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = mh.a(!(0 > var4), -112, var6);
            var8Lifetime1 = vk.field_A - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (kb.field_g.field_g != var4) {
                stackIn_43_0 = id.field_b;
              } else {
                stackIn_43_0 = kc.field_x;
              }
              var9 = stackIn_43_0;
              var1_int = var1_int + hn.field_z;
              if (var9 != null) {
                var9.a(-aq.field_b + var8Lifetime1, (ln.field_D << 1) + kp.field_d, (aq.field_b << 1) + var7Lifetime1, (byte) 119, var1_int);
              }
              var1_int = var1_int + ln.field_D;
            }
            if (0 <= var4) {
              sp.field_Q.b(var6, var8Lifetime1, var1_int + bi.field_p, var5, -1);
              var1_int = var1_int + (hn.field_z + (ln.field_D + kp.field_d));
            } else {
              bo.field_e.b(var6, var8Lifetime1, var1_int + bp.field_f, var5, -1);
              var1_int = var1_int + bp.field_e;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "jn.C(" + param0 + ')');
        }
    }

    static {
        field_a = "This password contains your Player Name, and would be easy to guess";
        field_b = "Return to game";
        field_d = "Unpacking models";
    }
}
