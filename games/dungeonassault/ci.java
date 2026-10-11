/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ne {
    int field_k;
    int field_r;
    static int[] field_s;
    static int[] field_n;
    static int field_j;
    static java.applet.Applet field_q;
    ci field_o;
    int field_l;
    static int field_m;
    int field_p;
    int field_i;

    final static va a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        va stackIn_3_0 = null;
        va stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ll.field_r.b(param0, "", (byte) -82)) {
            stackIn_3_0 = ha.field_k.a(param0, (byte) 126, "");
            return stackIn_3_0;
          }
          if (ia.field_W.b(param0, "", (byte) -82)) {
            stackIn_7_0 = ha.field_k.a(param0, "", param1 + 47712);
            return stackIn_7_0;
          }
          if (param1 == -10396) {
            return null;
          }
          var3 = (String) null;
          ci.a((String) null, 40);
          stackIn_11_0 = null;
          return (va) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ci.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        qk stackIn_46_0 = null;
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
        qk var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = DungeonAssault.field_K;
        try {
          if (param0 != -119) {
            return;
          }
          var1_int = jm.field_c;
          var2 = 0;
          if (kh.field_t == 2) {
            var3_long = -kg.field_d + kd.c(-2456);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < go.field_A.length; var3++) {
            var4 = to.field_c[var3];
            if (var4 < 0) {
              var5 = om.field_a;
            } else {
              if (d.field_g.field_b == var4) {
                var5 = he.field_p;
              } else {
                var5 = sm.field_c;
              }
            }
            var6 = go.field_A[var3];
            if (2 == kh.field_t &&
              var2 == 1) {
              if (sn.field_a.length < mo.field_g.length) {
                stackIn_19_0 = mo.field_g.length;
              } else {
                stackIn_19_0 = sn.field_a.length;
              }
              var7 = stackIn_19_0;
              if (fd.field_b.length <= cp.field_Q.length) {
                stackIn_22_0 = cp.field_Q.length;
              } else {
                stackIn_22_0 = fd.field_b.length;
              }
              var8 = stackIn_22_0;
              if (6 <= var3 &&
                6 + var7 > var3) {
                if (-var7 + sn.field_a.length + (var3 - 6) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = sn.field_a[-var7 + (-6 + var3 + sn.field_a.length)];
                }
                var6 = stackIn_27_0;
              }
              if (var3 >= var7 + 7 &&
                var8 + var7 + 7 > var3) {
                if (-7 + var3 - var7 >= cp.field_Q.length) {
                  stackIn_34_0 = "";
                } else {
                  stackIn_34_0 = cp.field_Q[-var7 + (-7 + var3)];
                }
                var6 = stackIn_34_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = og.a(!(var4 < 0), var6, -30633);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + vo.field_r;
            if (var4 >= 0) {
              if (d.field_g.field_b == var4) {
                stackIn_46_0 = om.field_d;
              } else {
                stackIn_46_0 = gd.field_G;
              }
              var9 = stackIn_46_0;
              var1_int = var1_int + field_j;
              if (var9 != null) {
                var9.a(var1_int, (h.field_q << 1) + mj.field_g, (oh.field_t << 1) + var7Lifetime1, 112, var8Lifetime1 - oh.field_t);
              }
              var1_int = var1_int + h.field_q;
            }
            if (var4 < 0) {
              n.field_c.b(var6, var8Lifetime1, li.field_g + var1_int, var5, -1);
              var1_int = var1_int + ag.field_a;
            } else {
              i.field_x.b(var6, var8Lifetime1, i.field_n + var1_int, var5, -1);
              var1_int = var1_int + (field_j + h.field_q + mj.field_g);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ci.D(" + param0 + ')');
        }
    }

    final static long a(CharSequence param0, int param1) {
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 != 2) {
            ci.a(-61);
          }
          while (var4 > var5) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (var6 + 1));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (177917621779460413L > var2_long) {
              var5++;
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
          stackIn_25_1 = new StringBuilder().append("ci.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_q = null;
        if (param0 <= 5) {
          field_j = -10;
        }
    }

    ci(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param1;
        this.field_r = param0;
        this.field_l = param2;
        this.field_p = param4;
        this.field_i = param3;
    }

    static {
        field_s = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
