/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    private int field_k;
    static String[] field_a;
    static String field_h;
    private int field_d;
    int field_i;
    int field_b;
    private int field_j;
    private boolean field_f;
    private int field_g;
    static String field_c;
    static String field_e;

    final void d(int param0) {
        this.field_d = 0;
        this.field_k = 0;
        if (this.field_g == 0 &&
          mm.field_t == 98) {
          if (0 >= this.field_b) {
            this.field_b = this.field_i;
          }
          this.field_b = this.field_b - 1;
          this.field_f = false;
        }
        if (this.field_g == 0) {
          this.field_d = mm.field_t;
        }
        if (param0 == this.field_g &&
          99 == mm.field_t) {
          this.field_b = this.field_b + 1;
          if (this.field_b >= this.field_i) {
            this.field_b = 0;
          }
          this.field_f = false;
        }
    }

    final boolean b(int param0) {
        if (param0 != -1) {
          this.field_k = -104;
        }
        return this.field_d == 102 ? true : false;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -4) {
          return;
        }
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        to.field_g = sj.field_cb[param0];
        if (param1 != -5) {
          return;
        }
        ec.field_r = lc.field_k[param0];
        ki.field_c = qh.field_R[param0];
    }

    final void a(int param0, byte param1) {
        this.field_d = 0;
        this.field_k = 0;
        if (this.field_g == 0 &&
          mm.field_t == 96) {
          if (this.field_b <= 0) {
            this.field_b = this.field_i;
          }
          this.field_f = false;
          this.field_b = this.field_b - 1;
        }
        if (this.field_g == 0) {
          this.field_d = mm.field_t;
        }
        if (this.field_g == 0 &&
          mm.field_t == 97) {
          this.field_b = this.field_b + 1;
          if (this.field_i <= this.field_b) {
            this.field_b = 0;
          }
          this.field_f = false;
        }
        if (param1 != -107) {
          return;
        }
        if (this.field_g == 0 && (98 == mm.field_t ||
          mm.field_t == 99)) {
          if (this.field_b < 0) {
            this.field_b = param0;
          }
          this.field_f = false;
        }
    }

    final boolean b(byte param0) {
        int var2 = -93 / ((param0 - 59) / 62);
        return this.field_g != 0 ? true : false;
    }

    final boolean c(byte param0) {
        int var2 = -70 % ((param0 + 30) / 56);
        return this.field_d == 97 ? true : false;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          this.d(43);
        }
        return this.field_d == 96 ? true : false;
    }

    final void a(boolean param0, boolean param1, int param2, int param3) {
        this.field_f = param1 ? true : false;
        this.field_g = 0;
        if (this.field_f) {
          this.field_b = param3;
        } else {
          this.field_b = param2;
        }
        if (param0) {
          this.c((byte) 33);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          ae.a(53, 54);
        }
        return this.field_d == 103 ? true : false;
    }

    final void b(int param0, int param1) {
        if (param1 != 3) {
          field_e = (String) null;
        }
        if (this.field_g == 0) {
          this.field_b = param0;
          this.field_f = false;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_43_2 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        String stackIn_50_2 = null;
        boolean stackIn_93_0 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = DungeonAssault.field_K;
        try {
          nk.field_Hb = true;
          kh.field_t = param1;
          if (kh.field_t == 0) {
            var3_int = og.a(n.field_c, (byte) 96, qj.field_e, wa.field_l, ql.field_k);
            var4 = var3_int + 3;
            go.field_A = new String[var4];
            to.field_c = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              to.field_c[var5] = -1;
            }
            n.field_g = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              go.field_A[var5] = qj.field_e[var5];
            }
            go.field_A[var4 - 3] = "";
            go.field_A[var4 - 2] = mn.field_a;
            to.field_c[var4 - 2] = 0;
            n.field_g[0] = 4;
            go.field_A[-1 + var4] = sp.field_b;
            to.field_c[var4 - 1] = 1;
            n.field_g[1] = 5;
          } else if (kh.field_t == 1) {
            var3_int = og.a(n.field_c, (byte) -114, qj.field_e, wa.field_l, ql.field_k);
            var4 = var3_int + 2;
            to.field_c = new int[var4];
            go.field_A = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              to.field_c[var5] = -1;
            }
            n.field_g = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              go.field_A[var5] = qj.field_e[var5];
            }
            go.field_A[-2 + var4] = "";
            go.field_A[var4 - 1] = sp.field_b;
            to.field_c[var4 - 1] = 0;
            n.field_g[0] = 5;
          } else if (kh.field_t != 2) {
            if (kh.field_t == 3) {
              if (i.field_A.field_j) {
                var3_int = og.a(n.field_c, (byte) 120, qj.field_e, wa.field_l, fg.field_g);
              } else {
                var3_int = og.a(n.field_c, (byte) -46, qj.field_e, wa.field_l, oh.field_a);
              }
              var4 = 2 + var3_int;
              go.field_A = new String[var4];
              to.field_c = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                to.field_c[var5] = -1;
              }
              n.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                go.field_A[var5] = qj.field_e[var5];
              }
              go.field_A[var4 - 2] = "";
              go.field_A[-1 + var4] = sp.field_b;
              to.field_c[-1 + var4] = 0;
              n.field_g[0] = 5;
            } else if (kh.field_t == 4) {
              var3_int = og.a(n.field_c, (byte) 101, qj.field_e, wa.field_l, jg.field_b);
              var4 = var3_int + 2;
              to.field_c = new int[var4];
              go.field_A = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                to.field_c[var5] = -1;
              }
              n.field_g = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                go.field_A[var5] = qj.field_e[var5];
              }
              go.field_A[var4 - 2] = "";
              go.field_A[var4 - 1] = sp.field_b;
              to.field_c[var4 - 1] = 0;
              n.field_g[0] = 5;
            } else {
              if (kh.field_t != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = og.a(n.field_c, (byte) -68, qj.field_e, wa.field_l, id.field_g);
              var4 = 3 + var3_int;
              to.field_c = new int[var4];
              go.field_A = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                to.field_c[var5] = -1;
              }
              n.field_g = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                go.field_A[var5] = qj.field_e[var5];
              }
              go.field_A[var4 - 3] = "";
              go.field_A[-2 + var4] = fc.field_j;
              to.field_c[var4 - 2] = 0;
              n.field_g[0] = 3;
              go.field_A[-1 + var4] = sp.field_b;
              to.field_c[-1 + var4] = 1;
              n.field_g[1] = 5;
            }
          } else {
            var3_int = og.a(n.field_c, (byte) 125, qj.field_e, wa.field_l, jk.a(new String[]{"<br><%0><br>"}, ef.field_b, param2 ^ -30497));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(qj.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            sn.field_a = new String[var4];
            cj.a(qj.field_e, 0, sn.field_a, 0, var4);
            cp.field_Q = new String[-1 + (-var4 + var3_int)];
            cj.a(qj.field_e, var4 + 1, cp.field_Q, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = og.a(n.field_c, (byte) 84, qj.field_e, wa.field_l, jk.a(new String[]{"<br><%0><br>"}, bn.field_i, param2 ^ -30497));
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(qj.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            mo.field_g = new String[var4];
            cj.a(qj.field_e, 0, mo.field_g, 0, var4);
            fd.field_b = new String[-1 - var4 + var3_int];
            cj.a(qj.field_e, var4 + 1, fd.field_b, 0, -1 + var3_int - var4);
            if (sn.field_a.length < mo.field_g.length) {
              stackIn_32_0 = mo.field_g.length;
            } else {
              stackIn_32_0 = sn.field_a.length;
            }
            var5 = stackIn_32_0;
            if (cp.field_Q.length < fd.field_b.length) {
              stackIn_35_0 = fd.field_b.length;
            } else {
              stackIn_35_0 = cp.field_Q.length;
            }
            var6 = stackIn_35_0;
            var7 = var6 + (7 + var5);
            go.field_A = new String[var7];
            to.field_c = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              to.field_c[var8] = -1;
            }
            to.field_c[1] = 0;
            go.field_A[0] = mj.field_b;
            n.field_g = new int[2];
            go.field_A[1] = lg.field_l;
            go.field_A[5] = "";
            n.field_g[0] = 5;
            go.field_A[2] = ef.field_c;
            to.field_c[3] = 1;
            go.field_A[3] = jg.field_d;
            n.field_g[1] = 2;
            go.field_A[4] = qp.field_e;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_42_0 = go.field_A;
              stackIn_42_1 = var8Lifetime2 + 6;
              if (mo.field_g.length + (var8Lifetime2 - var5) >= 0) {
                stackIn_43_2 = mo.field_g[mo.field_g.length + var8Lifetime2 - var5];
              } else {
                stackIn_43_2 = "";
              }
              stackIn_42_0[stackIn_42_1] = stackIn_43_2;
            }
            go.field_A[6 + var5] = null;
            to.field_c[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_47_0 = go.field_A;
              stackIn_47_1 = 7 - (-var5 - var8Lifetime3);
              stackIn_47_2 = fd.field_b.length;
              stackIn_47_3 = var8Lifetime3;
              if (stackIn_47_2 <= stackIn_47_3) {
                stackIn_50_2 = "";
              } else {
                stackIn_50_2 = fd.field_b[var8Lifetime3];
              }
              stackIn_47_0[stackIn_47_1] = stackIn_50_2;
            }
            kg.field_d = kd.c(-2456);
          }
          d.field_g.field_i = n.field_g.length;
          var3_intLifetime1 = 0;
          var4Lifetime1 = 0;
          if (param2 != -1) {
            field_e = (String) null;
          }
          while (var4Lifetime1 < go.field_A.length) {
            stackIn_93_0 = !(to.field_c[var4Lifetime1] < 0);
            var5Lifetime1 = og.a(stackIn_93_0, go.field_A[var4Lifetime1], param2 ^ 30632);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
            var4Lifetime1++;
          }
          if (kh.field_t == 2) {
            var10 = sn.field_a;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = og.a(false, var11, param2 - 30632);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = cp.field_Q;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = og.a(false, var12, -30633);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          d.field_e = vo.field_r - (-var3_intLifetime1 + (var3_intLifetime1 >> 1));
          jn.field_d = (ci.field_j + h.field_q << 1) * d.field_g.field_i;
          bf.field_b = -(var3_intLifetime1 >> 1) + vo.field_r;
          for (var4Lifetime2 = 0; go.field_A.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_114_0 = jn.field_d;
            if (to.field_c[var4Lifetime2] < 0) {
              stackIn_115_1 = ag.field_a;
            } else {
              stackIn_115_1 = mj.field_g;
            }
            jn.field_d = stackIn_114_0 + stackIn_115_1;
          }
          jm.field_c = -(jn.field_d >> 1) + bl.field_p;
          dg.field_L = new int[go.field_A.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = jm.field_c;
          while (go.field_A.length > var4Lifetime3) {
            var6Lifetime1 = to.field_c[var4Lifetime3];
            if (0 <= var6Lifetime1) {
              var7Lifetime2 = og.a(true, go.field_A[var4Lifetime3], param2 ^ 30632);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + vo.field_r;
              var5Lifetime3 = var5Lifetime3 + ci.field_j;
              dg.field_L[var4Lifetime3] = new int[4];
              dg.field_L[var4Lifetime3][0] = -oh.field_t + var8Lifetime1;
              dg.field_L[var4Lifetime3][1] = var5Lifetime3;
              dg.field_L[var4Lifetime3][2] = var7Lifetime2 + (oh.field_t << 1);
              var5Lifetime3 = var5Lifetime3 + (mj.field_g + ((h.field_q << 1) + ci.field_j));
              dg.field_L[var4Lifetime3][3] = (h.field_q << 1) + mj.field_g;
            } else {
              var5Lifetime3 = var5Lifetime3 + ag.field_a;
            }
            var4Lifetime3++;
          }
          if (kh.field_t == 2) {
            d.field_g.a(false, param0, -1, -1);
          } else {
            d.field_g.a(false, param0, 0, ab.a(-776726687, hj.field_S, eh.field_h));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ae.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        this.field_d = 0;
        if (param0 < 88) {
          this.field_g = -80;
        }
        this.field_k = 0;
        if (this.field_g == 0) {
          this.field_d = mm.field_t;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        if (param0 != -7734) {
          this.field_f = true;
        }
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_d = 0;
        this.field_k = 0;
        if (0 != no.field_d) {
          this.field_g = no.field_d;
          this.field_f = true;
          this.field_b = param1;
          this.field_k = no.field_d;
          this.field_j = e.field_e;
        }
        if (this.field_g != 0 &&
          la.field_g != 0) {
          if (this.field_j <= 0) {
            this.field_j = r.field_c;
          }
          this.field_j = this.field_j - 1;
        }
        if (no.field_d == 0 &&
          la.field_g == 0) {
          this.field_g = 0;
        }
        if (this.field_g == 0 &&
          (this.field_f ||
          cp.field_U)) {
          if (param2 >= 0) {
            if (this.field_b == param2) {
            }
            this.field_f = true;
            this.field_b = param2;
          } else {
            if (this.field_f) {
              this.field_b = -1;
            }
          }
        }

    }

    final boolean c(int param0) {
        int var2;
        boolean stackIn_6_0 = false;
        var2 = -24 / ((param0 + 29) / 40);
        stackIn_6_0 = (this.field_k != 0) || (this.field_d == 84) || (83 == this.field_d);
        return stackIn_6_0;
    }

    ae(int param0) {
        this.field_b = 0;
        this.field_f = false;
        this.field_i = param0;
    }

    static {
        field_h = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Dwarf Renegade";
        field_e = "HEAL";
    }
}
