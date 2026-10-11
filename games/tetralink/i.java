/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private int field_l;
    private int field_x;
    private int field_i;
    private int field_j;
    static int field_e;
    private int field_p;
    private int field_h;
    private boolean field_v;
    private int field_b;
    private int field_q;
    private int field_o;
    static boolean field_w;
    private int field_d;
    private int field_c;
    private int field_g;
    static int[] field_t;
    private int field_s;
    static int field_n;
    private int field_r;
    static int field_f;
    private int field_m;
    private ne field_u;
    private float field_k;
    static ok field_a;

    final static void a(boolean param0, boolean param1) {
        dg.a(param1, (byte) -88);
        if (!param0) {
          i.a(false, 64);
        }
        cc.b(param0, param1);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        eh var6;
        var5 = TetraLink.field_J;
        var2 = this.field_l;
        if (param0 > -54) {
          var6 = (eh) null;
          i.a(78, (eh) null, -43);
        }
        var3 = this.field_s;
        if (!this.d(0)) {
          this.field_v = false;
          return;
        }
        if (this.field_q >= var3) {
          if (var3 < this.field_j) {
            var3 = this.field_j;
          }
        } else {
          var3 = this.field_q;
        }
        if (var2 > this.field_i) {
          var2 = this.field_i;
        } else {
          if (var2 < this.field_c) {
            var2 = this.field_c;
          }
        }
        if (this.field_k > 0.0f) {
          var4 = (int)(0.5f + this.field_k * (float)var3);
          if (var4 <= var2) {
            if (var2 > var4) {
              var2 = var4;
            }
          } else {
            var3 = (int)((float)var2 / this.field_k);
          }
        }
        if (var2 != n.field_M ||
          var3 != d.field_h) {
          this.field_u.a(var3, -13325, var2);
        }
        if (this.field_l > 0) {
          sa.field_g = (this.field_l - n.field_M) / 2;
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_s = param0;
        if (param2 < 16) {
          return;
        }
        this.field_l = param1;
    }

    final void a(byte param0) {
        if (param0 != 36) {
          return;
        }
        this.field_u.a(this.field_x, -13325, this.field_d);
    }

    final static void a(boolean param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param1, (byte) -92);
        var2.field_t = var2.field_t + 1;
        int var3 = var2.field_t;
        var2.a(5, !param0 ? true : false);
        if (!param0) {
          return;
        }
        var2.a(qb.field_N.field_rc, false);
        int var4 = qb.field_N.field_ic + (qb.field_N.field_Zb << 6);
        var2.a(var4, false);
        var2.a(0, 128, qb.field_N.field_sc, qb.field_N.field_sc.length);
        var2.b(-var3 + var2.field_t, -2);
    }

    final static void c(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        oa var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        bc var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = TetraLink.field_J;
        try {
          var27 = kb.field_q;
          var2 = var27.d((byte) -99);
          if (param0 != 1) {
            field_n = 56;
          }
          if (var2 == 0) {
            var3 = var27.e(127);
            var4_ref = (oa) (wc.field_E.c(false));
            while (var4_ref != null) {
              if (var4_ref.field_C != var3) {
                var4_ref = (oa) (wc.field_E.a((byte) -70));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              mk.a(false);
              return;
            }
            var5 = var27.d((byte) -99);
            if (var5 == 0) {
              var4_ref.b(false);
              return;
            }
            var6 = var4_ref.field_z;
            lh.field_v[0].field_e = ph.field_w;
            var7 = var4_ref.field_s;
            lh.field_v[0].field_a = false;
            lh.field_v[0].field_g = null;
            for (var8_int = 1; var8_int < var5; var8_int++) {
              lh.field_v[var8_int].field_e = var27.g((byte) 81);
              lh.field_v[var8_int].field_a = false;
              if (var27.d((byte) -99) != 1) {
                lh.field_v[var8_int].field_g = null;
              } else {
                lh.field_v[var8_int].field_g = var27.g((byte) 81);
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var34 = new long[3][var6];
            var35 = new int[3][var6 * var7];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var27.d((byte) -99);
            if (var18 <= 0) {
              var4_ref.b(false);
              return;
            }
            for (var19 = 0; var19 < var18; var19++) {
              var20 = var27.d((byte) -99);
              var21 = lh.field_v[var20].field_e;
              var22 = var27.c(255);
              var24 = var27.field_t;
              if (var19 < var6) {
                var8[0][var12] = var21;
                var9[0][var12] = lh.field_v[var20].field_g;
                var34[0][var12] = var22;
                for (var25 = 0; var7 > var25; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var35[0][incrementValue$0] = var27.f(-116);
                }
                var12++;
              }
              if (var21 != null &&
                ej.a(var21, param0 ^ 5)) {
                var8[1][var13] = ph.field_w;
                var9[1][var13] = null;
                var34[1][var13] = var22;
                var13++;
                var27.field_t = var24;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var35[1][incrementValue$1] = var27.f(param0 + 118);
                }
              }
              if (var6 > var14 &&
                !lh.field_v[var20].field_a) {
                lh.field_v[var20].field_a = true;
                var8[2][var14] = var21;
                var9[2][var14] = lh.field_v[var20].field_g;
                var34[2][var14] = var22;
                var27.field_t = var24;
                var14++;
                for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var35[2][incrementValue$2] = var27.f(-111);
                }
              }
            }
            var4_ref.b(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.e(param0 ^ 126);
            var27.c(255);
            var4 = (o) (pb.field_f.c(false));
            while (var4 != null) {
              if (var3Lifetime1 != var4.field_q) {
                var4 = (o) (pb.field_f.a((byte) -70));
                continue;
              }
              break;
            }
            if (var4 == null) {
              mk.a(false);
              return;
            }
            var4.b(false);
            return;
          }
          fk.a(-104, (Throwable) null, "HS1: " + hc.a(false));
          mk.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "i.C(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = cc.a(param2, (byte) 111);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!tk.a((byte) 81, var4.charAt(0)) &&
              !tk.a((byte) 81, var4.charAt(var4.length() - 1))) {
              if (param1) {
                field_a = (ok) null;
              }
              var5 = 0;
              for (var6 = 0; var6 < param2.length(); var6++) {
                var7 = param2.charAt(var6);
                if (tk.a((byte) 81, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (2 <= var5 &&
                  !param0) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("i.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static String e(int param0) {
        if (ll.field_C == ma.field_d) {
          return pl.field_e;
        }
        if (!oa.field_y.c(false)) {
          return oa.field_y.a((byte) 72);
        }
        if (ll.field_C == pi.field_a) {
          return oa.field_y.a((byte) 72);
        }
        int var1 = 64 % ((68 - param0) / 43);
        return mk.field_d;
    }

    final static void b(boolean param0, int param1) {
        mf.field_s.a(0, 0, -23452);
        if (param1 < 73) {
          field_f = 106;
        }
    }

    final void b(int param0) {
        int fieldTemp$1 = 0;
        if (hd.field_u != null) {
          return;
        }
        if (0 >= mb.field_C) {
          this.field_v = false;
        }
        if (param0 != 29768) {
          i.c(38);
        }
        if (this.field_v) {
          fieldTemp$1 = this.field_p - 1;
          this.field_p = this.field_p - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.field_p = this.field_b;
          if (this.field_h > ja.field_a) {
            this.field_v = false;
          } else {
            this.a(-84);
          }
          return;
        }
        if (this.field_l <= n.field_M) {
          if (this.field_l > 0) {
            sa.field_g = 0;
          }
        } else {
          sa.field_g = (-n.field_M + this.field_l) / 2;
        }
        if (this.field_g != n.field_M ||
          this.field_m != d.field_h) {
          this.field_u.a(this.field_m, -13325, this.field_g);
        }
    }

    final kl b(boolean param0) {
        this.field_d = n.field_M;
        this.field_x = d.field_h;
        this.field_u.a(this.field_o, -13325, this.field_r);
        ha.field_h = param0 ? true : false;
        kl var2 = bm.a(this.field_o, 0, 0, this.field_r, 0, nd.field_Pb);
        if (var2 == null) {
          this.a((byte) 36);
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_t = null;
        if (param0) {
          field_t = (int[]) null;
        }
    }

    private i() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, eh param1, int param2) {
        int var4 = 0;
        bc var5 = nd.field_Lb;
        var5.f(param0, (byte) -92);
        if (param2 != 0) {
          return;
        }
        try {
          var5.field_t = var5.field_t + 1;
          var4 = var5.field_t;
          var5.a(1, false);
          var5.a(param1.field_r, false);
          var5.a(param1.field_y, false);
          var5.d(param1.field_o, (byte) -124);
          var5.d(param1.field_x, (byte) -124);
          var5.d(param1.field_u, (byte) -124);
          var5.d(param1.field_t, (byte) -124);
          var5.c(var4, param2 ^ -71);
          var5.b(var5.field_t - var4, param2 ^ -2);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "i.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean d(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_6_0 = (ja.field_a >= this.field_h) && (mb.field_C > 0);
        return stackIn_6_0;
    }

    static {
        field_e = 640;
        field_f = 0;
        field_a = new ok();
    }
}
