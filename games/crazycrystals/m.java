/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ue {
    static String[] field_e;
    private boolean field_o;
    private int field_h;
    private boolean field_q;
    private int field_t;
    static int[] field_l;
    private boolean field_p;
    private boolean field_s;
    private re field_g;
    static am field_n;
    private int field_i;
    static String field_m;
    private String field_j;
    private String field_r;
    private ak field_k;
    private boolean field_f;

    m(re param0, int param1, String param2, int param3, int param4, boolean param5) {
        super(5);
        try {
          if (!(a.field_b instanceof m)) {
            gh.field_B = 0;
          }
          this.field_t = param4;
          this.field_q = param5 ? true : false;
          this.field_i = param3;
          this.field_j = param2;
          this.field_g = param0;
          this.field_b.field_c = -1;
          this.field_h = param1;
          this.d(136);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0) {
        int var3;
        var3 = CrazyCrystals.field_B;
        if (this.field_s) {
          if (0 < gh.field_B) {
            gh.field_B = gh.field_B - 1;
          }
          if (0 == gh.field_B) {
            a.field_b = (ue) ((Object) this.field_g);
            this.field_g.a(this.field_b.field_i, -13880);
          }
          this.field_g.a(false);
          return;
        }
        if (!this.field_q) {
          this.field_g.f(-112);
          this.field_g.c((byte) 73);
          this.field_g.a((byte) 20, this.field_h);
        }
        if (this.field_p) {
          if (gh.field_B > 0) {
            gh.field_B = gh.field_B - 1;
          }
          if (0 == gh.field_B) {
            a.field_b = (ue) ((Object) new rb(this.field_g, this.field_b.field_i));
          }
          return;
        }
        if (this.field_f) {
          if (gh.field_B > 0) {
            gh.field_B = gh.field_B - 1;
          }
          this.field_g.c(2, 40, 180);
          if (this.field_g.field_f < 40) {
            return;
          }
          if (!this.field_o) {
            rk.a(0);
            this.field_b.a(-1, true, -1);
            this.field_o = true;
            return;
          }
          this.field_f = false;
          this.field_o = false;
          if (!rc.a(-98)) {
            this.d(136);
          }
        }
        if (gh.field_B < 20) {
          gh.field_B = gh.field_B + 1;
        }
        if (param0) {
          this.field_q = true;
        }
        this.field_g.c(-1);
        do {
          if (!ge.b(-59)) {
            this.a((byte) 118);
            return;
          }
          if (!rc.a(-93)) {
            if (pj.field_q == 96) {
              al.field_c = (al.field_c + 3 - 1) % 3;
              this.field_b.field_c = al.field_c;
              this.field_b.field_i = false;
            }
            if (97 == pj.field_q) {
              al.field_c = (al.field_c + 1) % 3;
              this.field_b.field_i = false;
              this.field_b.field_c = al.field_c;
            }
            if (pj.field_q == 98) {
              if (4 != this.field_b.field_c) {
                this.field_b.field_c = 4;
              } else {
                this.field_b.field_c = al.field_c;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 99) {
              if (al.field_c == this.field_b.field_c) {
                this.field_b.field_c = 4;
              } else {
                this.field_b.field_c = al.field_c;
              }
              this.field_b.field_i = false;
            }
          } else {
            if (pj.field_q == 98) {
              if (4 == this.field_b.field_c) {
                this.field_b.field_c = 3;
              } else {
                this.field_b.field_c = 4;
              }
              this.field_b.field_i = false;
            }
            if (99 == pj.field_q) {
              if (3 == this.field_b.field_c) {
                this.field_b.field_c = 4;
              } else {
                this.field_b.field_c = 3;
              }
              this.field_b.field_i = false;
            }
          }
          this.field_b.a((byte) 57);
          if (this.a(106)) {
            return;
          }
        } while (pj.field_q != 13 &&
          !this.field_b.a(true));
        if (this.field_q &&
          mo.field_l == 0 &&
          dk.field_h < uo.field_o) {
          this.field_p = true;
        } else {
          this.field_s = true;
        }
        this.field_b.field_i = false;
        return;
    }

    public static void c(byte param0) {
        if (param0 >= -122) {
          return;
        }
        field_l = null;
        field_m = null;
        field_e = null;
        field_n = null;
    }

    final static void c(int param0) {
        if (param0 != 29537) {
          String var2 = (String) null;
          m.a((byte) 17, (String) null);
        }
    }

    final boolean a(int param0) {
        if (this.field_b.field_c >= 0 &&
          this.field_b.field_c <= 2 &&
          this.field_b.a(true)) {
          al.field_c = this.field_b.field_c;
          return false;
        }
        if (this.field_b.field_c == 3 &&
          this.field_b.a(true) &&
          rc.a(-59)) {
          this.field_f = true;
          return true;
        }
        if (4 == this.field_b.field_c &&
          this.field_b.a(true)) {
          if (!this.field_q ||
            mo.field_l != 0 ||
            dk.field_h >= uo.field_o) {
            this.field_s = true;
            return true;
          }
          this.field_p = true;
          return true;
        }
        if (param0 <= 99) {
          this.field_f = false;
        }
        return false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -72) {
            stackIn_6_0 = (null != rg.a(param1, (byte) 120));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("m.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var8 = 0;
        int stackIn_6_0 = 0;
        re stackIn_10_0 = null;
        int stackIn_11_1 = 0;
        ef stackIn_37_0 = null;
        String stackIn_38_1 = null;
        ef stackIn_46_0 = null;
        String stackIn_47_1 = null;
        ik stackIn_57_0 = null;
        int stackIn_58_1 = 0;
        ik stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_64_2 = 0;
        int var2;
        int var3;
        Object var4;
        int var5;
        int var6;
        String[] var6_ref_String__;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var19;
        int var6Lifetime1;
        var14 = CrazyCrystals.field_B;
        if (this.field_k == null &&
          !rc.a(-56)) {
          this.field_k = jp.a(this.field_i, 125, 3, 10, 1);
        }
        this.field_g.e(75);
        var2 = gh.field_B * (580 * gh.field_B) / 400 + 30;
        stackIn_6_0 = (!this.field_q) ? 110 : 80;
        var3 = stackIn_6_0;
        wi.a(30, jn.field_o, var3, -var3 + 407, (byte) -71, -30 + var2);
        kh.d(38, param0 + var3, var2 - 46, -var3 + 407 - 16, 0, 192);
        if (this.field_g.field_f != 0) {
          return;
        }
        stackIn_10_0 = this.field_g;
        if (this.field_s) {
          stackIn_11_1 = -1;
        } else {
          stackIn_11_1 = this.field_h;
        }
        ((re) (Object) stackIn_10_0).a(stackIn_11_1, false);
        if (gh.field_B != 20) {
          return;
        }
        if (this.field_q) {
          go.field_l.c(this.field_j, 320, 106, 16777215, -1);
        }
        var4 = CrazyCrystals.field_C;
        var5 = qk.a(al.field_c, param0 ^ 119, this.field_k, lo.field_b);
        go.field_l.a(ae.field_G, 100, 136, 16760896, -1);
        go.field_l.b(vn.field_m, 340, 136, 16760896, -1);
        go.field_l.b(tg.field_a, 440, 136, 16760896, -1);
        go.field_l.b(ff.field_d, 560, 136, 16760896, -1);
        for (var6 = 0; var6 < 10; var6++) {
          var7 = 8438015;
          if (~var6 == ~var5) {
            var7 = 16777215;
          }
          go.field_l.b(1 + var6 + ". ", 100, 161 + 20 * var6, var7, -1);
        }
        if (null != this.field_k) {
          if (this.field_k.field_n) {
            if (this.field_k.field_i != null) {
              var6_ref_String__ = this.field_k.field_i[al.field_c];
              var19 = this.field_k.field_l[al.field_c];
              for (var8 = 0; var8 < 10; var8++) {
                if (null != var6_ref_String__[var8]) {
                  var4 = null;
                  var9 = 8438015;
                  if (var5 == var8) {
                    var9 = 16777215;
                  }
                  go.field_l.a(var6_ref_String__[var8], 100, 161 + var8 * 20, var9, -1);
                  var10 = var19[var8];
                  var11 = var10 % 100;
                  var10 = var10 / 100;
                  var12 = var10 % 100;
                  var10 = var10 / 100;
                  var13 = -var11 + var12;
                  go.field_l.b(Integer.toString(1 + var13), 340, 161 + 20 * var8, var9, -1);
                  stackIn_37_0 = go.field_l;
                  if (-1 + this.field_t != var12) {
                    stackIn_38_1 = Integer.toString(var12 + 1);
                  } else {
                    stackIn_38_1 = ah.field_d;
                  }
                  ((ef) (Object) stackIn_37_0).b(stackIn_38_1, 440, 161 + 20 * var8, var9, -1);
                  go.field_l.b(Integer.toString(var10), 560, 161 + 20 * var8, var9, -1);
                }
              }
            } else {
              var4 = ke.field_a;
            }
            if (var5 < 0 &&
              null != lo.field_b &&
              lo.field_b.field_k == this.field_k.field_g) {
              go.field_l.a(je.field_g, 100, 366, 16777215, -1);
              go.field_l.b(Integer.toString(dk.field_q + 1), 340, 366, 16777215, -1);
              stackIn_46_0 = go.field_l;
              if (this.field_t - 1 == oc.field_b) {
                stackIn_47_1 = ah.field_d;
              } else {
                stackIn_47_1 = Integer.toString(1 + oc.field_b);
              }
              ((ef) (Object) stackIn_46_0).b(stackIn_47_1, 440, 366, 16777215, -1);
              go.field_l.b(Integer.toString(kp.field_m), 560, 366, 16777215, -1);
            }
          } else {
            var4 = wp.field_a;
          }
        }
        if (null != var4) {
          go.field_l.c((String) (var4), 320, 251, 16777215, -1);
        }
        go.field_l.c(this.field_r, 320, 391, 16760896, -1);
        var15 = 0;
        var6Lifetime1 = var15;
        while (this.field_d.length > var15) {
          if (this.field_d[var15] != null) {
            stackIn_57_0 = this.field_d[var15];
            if (var15 != this.field_b.field_c) {
              stackIn_58_1 = 0;
            } else {
              stackIn_58_1 = 1;
            }
            stackIn_61_0 = stackIn_57_0;
            stackIn_61_1 = stackIn_58_1;
            if (var15 != this.field_b.field_c) {
              if (al.field_c == var15) {
                stackIn_64_2 = 16760896;
              } else {
                stackIn_64_2 = 12640511;
              }
              ((ik) (Object) stackIn_61_0).a(stackIn_61_1 != 0, stackIn_64_2, 1);
            } else {
              ((ik) (Object) stackIn_57_0).a(stackIn_58_1 != 0, 16777215, 1);
            }
          }
          var15++;
        }
        return;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        this.field_d = new ik[5];
        if (param0 != 136) {
          m.c((byte) -42);
        }
        if (!rc.a(param0 ^ -163)) {
          this.field_r = nl.field_g;
          var2 = go.field_l.a(ga.field_Q[0]);
          var3 = go.field_l.a(ga.field_Q[1]);
          var4 = go.field_l.a(ga.field_Q[2]);
          var5 = 60 + (var2 + 60 + var3 + var4);
          var6 = (640 - var5) / 2;
          this.field_d[0] = (ik) ((Object) new mh(var6, 417, ga.field_Q[0], 0));
          var6 = var6 + (var2 + 60);
          this.field_d[1] = (ik) ((Object) new mh(var6, 417, ga.field_Q[1], 0));
          var6 = var6 + (var3 + 60);
          this.field_d[2] = (ik) ((Object) new mh(var6, 417, ga.field_Q[2], 0));
        } else {
          this.field_r = el.field_f;
          this.field_d[3] = (ik) ((Object) new mh(200, 417, 240, si.field_a, 2));
        }
        this.field_d[4] = (ik) ((Object) new mh(200, 450, 240, ag.field_a, 2));
    }

    static {
        field_e = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_m = "Push this rock left or right to break one of the logs.";
    }
}
