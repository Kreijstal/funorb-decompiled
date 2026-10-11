/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    private boolean field_d;
    private int field_q;
    private int field_o;
    private int field_f;
    private int field_e;
    private int field_c;
    static String field_b;
    private int field_n;
    private int field_a;
    private int field_i;
    private int field_r;
    private int field_l;
    private int field_p;
    private int field_g;
    private jb field_m;
    private int field_h;
    private float field_s;
    private int field_j;
    private int field_k;

    final ui c(int param0) {
        this.field_n = rg.field_R;
        this.field_p = rg.field_P;
        this.field_m.a(this.field_l, this.field_j, -93);
        tj.field_F = false;
        ui var2 = hb.a(0, this.field_j, param0, this.field_l, 0, ld.field_g);
        if (var2 == null) {
          this.a(122);
        }
        return var2;
    }

    final static boolean d(int param0) {
        if (param0 != -1) {
          field_b = (String) null;
        }
        return wi.field_J;
    }

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        if (null != ki.field_E) {
          return;
        }
        if (hl.field_a <= 0) {
          this.field_d = false;
        }
        if (this.field_d) {
          fieldTemp$1 = this.field_e - 1;
          this.field_e = this.field_e - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          if (!param0) {
            this.a(true);
          }
          this.field_e = this.field_c;
          if (this.field_q > jd.field_b) {
            this.field_d = false;
          } else {
            this.a((byte) 99);
          }
          return;
        }
        if (rg.field_R >= this.field_o) {
          if (this.field_o > 0) {
            ph.field_o = 0;
          }
        } else {
          ph.field_o = (-rg.field_R + this.field_o) / 2;
        }
        if (this.field_f != rg.field_R ||
          rg.field_P != this.field_g) {
          this.field_m.a(this.field_g, this.field_f, -113);
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
          field_b = (String) null;
        }
    }

    final void a(int param0) {
        this.field_m.a(this.field_p, this.field_n, -112);
        if (param0 <= 17) {
          this.a(25);
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= -56) {
          this.field_i = -13;
        }
        this.field_o = param2;
        this.field_k = param1;
    }

    final static int a(ne param0, ne param1, String param2, int param3, int param4, boolean param5, int param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        va stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        va stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = wizardrun.field_H;
        try {
          var14 = param0.a(160);
          var8 = param1.a(160);
          var11_ref_String = var8;
          if (null == jc.field_H &&
            !ol.a(127, false)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (tj.field_G == wh.field_j) {
            gh.field_c = null;
            n.field_b.field_m = 0;
            if (param2 != null) {
              var9 = 0;
              re.field_G.field_m = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              re.field_G.f(oi.field_c.nextInt(), param6 + 612976077);
              re.field_G.f(oi.field_c.nextInt(), 613003928);
              re.field_G.b(param6 - 27851, var14);
              re.field_G.b(param6 ^ 27851, var8);
              var15 = (CharSequence) ((Object) param2);
              re.field_G.b(0, fi.a(var15, param6 - 27768));
              re.field_G.b(param6 - 1947107139, param4);
              re.field_G.b((byte) 11, param3);
              re.field_G.b((byte) 11, var9);
              n.field_b.b((byte) 11, 18);
              n.field_b.field_m = n.field_b.field_m + 2;
              var10 = n.field_b.field_m;
              var11_ref_StringLifetime1 = fb.a(jg.f(1), (byte) 102);
              if (var11_ref_StringLifetime1 == null) {
                var11_ref_StringLifetime1 = "";
              }
              n.field_b.a(var11_ref_StringLifetime1, false);
              pa.a(ag.field_s, 0, ad.field_d, re.field_G, n.field_b);
              n.field_b.a(n.field_b.field_m - var10, (byte) -67);
            } else {
              re.field_G.field_m = 0;
              re.field_G.f(oi.field_c.nextInt(), 613003928);
              re.field_G.f(oi.field_c.nextInt(), 613003928);
              stackIn_11_0 = re.field_G;
              stackIn_11_1 = 0;
              if (!param0.c((byte) 127)) {
                stackIn_12_2 = "";
              } else {
                stackIn_12_2 = var14;
              }
              ((va) (Object) stackIn_11_0).b(stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = re.field_G;
              stackIn_14_1 = 0;
              if (!param1.c((byte) 125)) {
                stackIn_15_2 = "";
              } else {
                stackIn_15_2 = var8;
              }
              ((va) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_15_2);
              n.field_b.b((byte) 11, 16);
              n.field_b.field_m = n.field_b.field_m + 1;
              var9 = n.field_b.field_m;
              pa.a(ag.field_s, 0, ad.field_d, re.field_G, n.field_b);
              n.field_b.a(n.field_b.field_m - var9, -115);
            }
            id.a((byte) -67, -1);
            wh.field_j = va.field_l;
          }
          if (param6 != 27851) {
            field_b = (String) null;
          }
          if (wh.field_j == va.field_l &&
            hc.a(1, -28266)) {
            var9Lifetime1 = nk.field_N.f(255);
            nk.field_N.field_m = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              pd.field_I = new String[-100 + var9Lifetime1];
              wh.field_j = vj.field_a;
            } else {
              if (var9Lifetime1 == 248) {
                tj.a(3088, jg.f(param6 ^ 27850));
                bh.field_g = ii.field_b;
                ql.a(-71);
                n.field_a = false;
                stackIn_32_0 = var9Lifetime1;
                return stackIn_32_0;
              }
              if (var9Lifetime1 == 99) {
                hc.a(uf.a(true), param6 ^ -675);
                gh.field_c = new Boolean(qj.a((byte) -100, nk.field_N));
                nk.field_N.field_m = 0;
              } else {
                wh.field_j = gf.field_ib;
                ra.field_k = var9Lifetime1;
                gd.field_c = -1;
              }
            }
          }
          if (wh.field_j == vj.field_a) {
            var9Lifetime2 = 2;
            if (hc.a(var9Lifetime2, -28266)) {
              var10Lifetime1 = nk.field_N.j(param6 - 42328);
              nk.field_N.field_m = 0;
              if (hc.a(var10Lifetime1, -28266)) {
                var11 = pd.field_I.length;
                for (var12 = 0; var11 > var12; var12++) {
                  pd.field_I[var12] = nk.field_N.h(727059944);
                }
                ql.a(-107);
                n.field_a = false;
                stackIn_44_0 = 100 + var11;
                return stackIn_44_0;
              }
            }
          }
          if (gf.field_ib == wh.field_j &&
            bd.b(92)) {
            if (ra.field_k != 255) {
              bh.field_g = nk.field_N.d(0);
            } else {
              var9_ref_String = nk.field_N.c(-1);
              if (var9_ref_String != null) {
                q.a(26017, jg.f(1), var9_ref_String);
              }
            }
            ql.a(-36);
            n.field_a = false;
            stackIn_54_0 = ra.field_k;
            return stackIn_54_0;
          }
          if (jc.field_H == null) {
            if (n.field_a) {
              if (eh.a(2) > 30000L) {
                bh.field_g = sa.field_b;
              } else {
                bh.field_g = fg.field_d;
              }
              n.field_a = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = vl.field_d;
            vl.field_d = tj.field_J;
            tj.field_J = var9Lifetime3;
            n.field_a = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("qi.J(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void e(int param0) {
        d.field_a = nk.field_N.d(param0 ^ param0);
        CharSequence var2 = (CharSequence) ((Object) d.field_a);
        wl.field_a = ta.a(-49, var2);
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          qi.e(61);
        }
        stackIn_6_0 = (jd.field_b >= this.field_q) && (0 < hl.field_a);
        return stackIn_6_0;
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = wizardrun.field_H;
        if (param0 != 99) {
          this.field_c = -121;
        }
        var2 = this.field_o;
        var3 = this.field_k;
        if (!this.b(0)) {
          this.field_d = false;
          return;
        }
        if (this.field_r < var2) {
          var2 = this.field_r;
        } else {
          if (var2 < this.field_a) {
            var2 = this.field_a;
          }
        }
        if (var3 > this.field_i) {
          var3 = this.field_i;
        } else {
          if (this.field_h > var3) {
            var3 = this.field_h;
          }
        }
        if (0.0f < this.field_s) {
          var4 = (int)(this.field_s * (float)var3 + 0.5f);
          if (var4 <= var2) {
            if (var4 < var2) {
              var2 = var4;
            }
          } else {
            var3 = (int)((float)var2 / this.field_s);
          }
        }
        if (rg.field_R != var2 ||
          rg.field_P != var3) {
          this.field_m.a(var3, var2, -109);
        }
        if (this.field_o > 0) {
          ph.field_o = (-rg.field_R + this.field_o) / 2;
        }
    }

    private qi() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
