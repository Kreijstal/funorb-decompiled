/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends km {
    static int field_r;
    private int field_u;
    static int field_v;
    static String field_x;
    static String field_t;
    private int field_s;
    static String field_w;

    final static int f(byte param0) {
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        java.awt.Component var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (jl.a((byte) 5)) {
            mh.field_H.d(-1);
            if (mh.field_H.a((byte) 113)) {
              var1_int = 1;
            }
            if (dc.field_b != 13) {
              continue;
            }
            var2 = 1;
          }
          if (param0 != 124) {
            var8 = (java.awt.Component) null;
            md.a(22, (java.awt.Component) null);
          }
          mh.field_H.a(qo.b(120, po.field_a, pq.field_k), param0 + 27355, qo.b(param0 - 4, qo.field_O, tb.field_fb));
          if (mh.field_H.a((byte) 113)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            mh.field_H.field_j >= 0) {
            var3 = ri.field_I[mh.field_H.field_j];
            if (var3 == 2) {
              w.c((byte) 3);
            } else if (5 == var3) {
              w.c((byte) 3);
            }
          } else {
            if (var2 != 0 &&
              ih.field_p != 2) {
              w.c((byte) 3);
            }
          }
          if (var3 == 0 &&
            ih.field_p == 2) {
            var4 = ue.a(false) - un.field_g;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              bq.a(true, 5, (byte) 104);
              var3 = 2;
            }
          }
          stackIn_32_0 = var3;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "md.C(" + param0 + ')');
        }
    }

    final static int a(int param0, String param1, wq param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.field_l;
          var5 = (CharSequence) ((Object) param1);
          var4 = uj.a(var5, false);
          param2.b(-1, var4.length);
          param2.field_l = param2.field_l + so.field_d.a((byte) -119, var4.length, 0, param2.field_k, param2.field_l, var4);
          if (param0 == 26152) {
            stackIn_4_0 = param2.field_l - var3_int;
            return stackIn_4_0;
          }
          stackIn_2_0 = -117;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("md.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          return 71;
        }
        return this.field_s;
    }

    final boolean a(byte param0, int param1) {
        int var3;
        boolean stackIn_10_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_20_0 = false;
        if (param1 < 0) {
          return false;
        }
        if (param0 <= 80) {
          field_v = -12;
        }
        var3 = this.field_m[param1].field_f;
        if (var3 == 25) {
          stackIn_20_0 = !(0 >= this.field_u);
          return stackIn_20_0;
        }
        if (26 == var3) {
          stackIn_10_0 = !(gh.field_b.length - 1 <= this.field_u);
          return stackIn_10_0;
        }
        if (var3 != 37) {
          return true;
        }
        stackIn_16_0 = (gh.field_b.length - 1 == this.field_u) && (!lm.a((byte) -10));
        return stackIn_16_0;
    }

    final void a(int param0, int param1, char param2) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        stackIn_3_0 = (!this.a((byte) 113, 0)) ? 1 : 0;
        var4 = stackIn_3_0;
        stackIn_6_0 = (this.a((byte) 104, 2)) ? 2 : 1;
        var5 = stackIn_6_0;
        stackIn_9_0 = (this.a((byte) 111, 3)) ? 3 : var5;
        var5Lifetime1 = stackIn_9_0;
        if (!this.field_h.a(false)) {
          if (param1 == 96) {
            var6 = -1 + this.field_h.field_j;
            if (!this.a((byte) 86, var6)) {
              var6--;
            }
            if (var4 < this.field_h.field_j) {
              this.field_h.a(false, var6);
            } else {
              this.field_h.a(false, var5Lifetime1);
            }
          }
          if (param1 == 97) {
            var6Lifetime1 = 1 + this.field_h.field_j;
            if (!this.a((byte) 85, var6Lifetime1)) {
              var6Lifetime1++;
            }
            if (this.field_h.field_j < 0) {
              this.field_h.a(false, var4);
            } else {
              if (this.field_h.field_j >= var5Lifetime1) {
                this.field_h.a(false, var4);
              } else {
                this.field_h.a(false, var6Lifetime1);
              }
            }
          }
        }
        this.field_h.d((byte) -124);
        if (param0 != -120) {
          field_x = (String) null;
        }
    }

    md() {
        super(7, 38, 460, 402, 35, lc.field_n);
        m.field_j = ob.field_D.field_F + ob.field_D.field_P + 1;
    }

    final void a(boolean param0, int param1, int param2) {
        int var7 = 0;
        int var4;
        int var5;
        q var6_ref_q;
        String var7_ref_String;
        int var8_int;
        int var9;
        String stackIn_5_0 = null;
        int var6;
        q var8;
        int var5Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, 2, 98);
        this.field_u = 0;
        var4 = 0;
        for (var5 = 0; var5 < this.field_m.length; var5++) {
          var6_ref_q = this.field_m[var5];
          if (var6_ref_q.field_f != 8) {
            stackIn_5_0 = ag.field_D[var6_ref_q.field_f];
          } else {
            stackIn_5_0 = this.e((byte) 112);
          }
          var7_ref_String = stackIn_5_0;
          var8_int = nn.field_g.c(var7_ref_String);
          if (var8_int > var4) {
            var4 = var8_int;
          }
        }
        var4 += 30;
        var5Lifetime1 = 20 + 3 * var4;
        var6 = (-var5Lifetime1 + 640) / 2;
        if (param2 < 96) {
          field_t = (String) null;
        }
        for (var7 = 0; var7 < this.field_m.length; var7++) {
          var8 = this.field_m[var7];
          var8.field_j = var4;
          var8.field_c = var6;
          if (var8.field_f != 26) {
            var6 = var6 + (var8.field_j + 10);
          }
        }
        this.field_s = lp.field_rb.field_a;
    }

    public static void g(byte param0) {
        field_x = null;
        if (param0 <= 23) {
          return;
        }
        field_t = null;
        field_w = null;
    }

    final void b(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        bi var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -27);
        im.a(550, 5, 243, 5, 140, (byte) -101, 45);
        al.a(this.field_a, 19);
        if (this.field_u != 0) {
          ob.field_D.a(h.field_C, nd.field_f);
        } else {
          ob.field_D.a(un.field_e, vj.field_f);
        }
        var2 = ob.field_D.a(gh.field_b[this.field_u], jq.field_t, ok.field_b);
        var3 = 145 - (-m.field_j - 4);
        for (var4 = 0; var2 > var4; var4++) {
          var5 = ob.field_D;
          var6 = 2;
          var7 = -1;
          var8 = 0;
          if (ok.field_b[var4].startsWith("<bab:heading1>")) {
            var5 = ce.field_e;
            var8 = 4;
            var6 = 0;
          } else {
            if (ok.field_b[var4].startsWith("<bab:heading2>")) {
              var8 = 3;
              var6 = 8;
              var5 = ce.field_e;
            } else {
              if (ok.field_b[var4].startsWith("<bab:vspace>")) {
                var8 = 4;
              } else {
                if (!ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                  if (!ok.field_b[var4].endsWith("<bab:smlbr><br>")) {
                    if (ok.field_b[var4].endsWith("<bab:smlvspace><br>") &&
                      !ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                      var8 = 3;
                    }
                  } else {
                    var8 = 9;
                  }
                } else {
                  var8 = 3;
                }
              }
            }
          }
          var5.c(ok.field_b[var4], 60, var3, var6, var7);
          var3 = var3 + (m.field_j + var8);
        }
        if (param0 >= -14) {
          md.g((byte) 61);
        }
        nn.field_g.a(pb.a(this.field_u, 4), 581, -12 + (nn.field_g.field_B + 373), 0, -1);
        this.a(0);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          int var2_int = -107 / ((param0 + 53) / 50);
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(gp.field_c);
          param1.addFocusListener(gp.field_c);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "md.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (param0 < 53) {
          java.awt.Component var3 = (java.awt.Component) null;
          md.a(-108, (java.awt.Component) null);
        }
        return ag.field_D[7];
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var4;
        q var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (param2 != 123) {
          this.b(117, -99);
        }
        var4 = 0;
        var5 = this.field_m[param0];
        var6 = var5.field_f;
        var7 = var6;
        if (26 == var7) {
          if (this.field_h.a((byte) 113) &&
            this.a((byte) 106, param0)) {
            fieldTemp$1 = this.field_u + 1;
            this.field_u = this.field_u + 1;
            if (fieldTemp$1 >= gh.field_b.length) {
              this.field_u = gh.field_b.length - 1;
            }
            if (!this.a((byte) 123, 2)) {
              this.field_h.a(false, 3);
              if (!this.a((byte) 102, 3)) {
                this.field_h.a(false, 1);
              }
            }
            var4 = 1;
          }
        } else {
          if (25 != var7) {
            return super.a(param0, param1, (byte) 123);
          }
          if (this.field_h.a((byte) 113) &&
            this.a((byte) 91, param0)) {
            fieldTemp$2 = this.field_u - 1;
            this.field_u = this.field_u - 1;
            if (0 > fieldTemp$2) {
              this.field_u = 0;
            }
            var4 = 1;
            if (!this.a((byte) 86, 0)) {
              this.field_h.a(false, 2);
            }
          }
        }
        return var4 != 0;
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
          return 42;
        }
        return this.field_p;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param1) {
            field_t = (String) null;
          }
          if (null != o.field_c) {
            o.field_c.field_K.a((byte) -94, args);
          }
          if (pq.field_o != null) {
            pq.field_o.field_R.a((byte) 102, args);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("md.D(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_w = "<%0> has joined your game.";
        field_x = "Passwords must be between 5 and 20 letters and numbers";
        field_t = "This game option has not yet been unlocked for use.";
    }
}
