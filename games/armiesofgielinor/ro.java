/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends pt implements he {
    private rj field_tb;
    private boolean field_sb;
    static String field_kb;
    private boolean field_wb;
    static v field_ob;
    private boolean field_mb;
    static int field_pb;
    static int[] field_lb;
    private boolean field_qb;
    static String field_vb;
    static int field_ub;
    static ru[] field_rb;
    private ka field_nb;

    final static void a(tc param0, tc param1, boolean param2) {
        tc var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_j != null) {
            param1.d(76);
          }
          param1.field_j = param0;
          param1.field_b = param0.field_b;
          param1.field_j.field_b = param1;
          param1.field_b.field_j = param1;
          if (!param2) {
            var4 = (tc) null;
            ro.a((tc) null, (tc) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ro.SA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -12215) {
            field_pb = 103;
          }
          if (param1 != 13) {
            stackIn_6_0 = super.a(param0, param1, param2, -12215);
            return stackIn_6_0;
          }
          this.b(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ro.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ro(gk param0, ka param1, String param2, boolean param3, boolean param4) {
        super(param0, new ad((ro) null, param1, param2), 77, 10, 10);
        try {
          this.field_qb = false;
          this.field_mb = param3 ? true : false;
          this.field_wb = false;
          this.field_sb = param4 ? true : false;
          this.field_nb = param1;
          this.field_tb = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_tb.field_R = true;
          this.a((byte) 10, (kb) (this.field_tb));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0) {
        if (!this.field_L) {
          return;
        }
        if (!param0) {
          field_rb = (ru[]) null;
          this.field_L = false;
          if (this.field_mb) {
            ns.d((byte) 83);
            return;
          }
          if (this.field_sb) {
            of.d((byte) -24);
            return;
          }
          return;
        }
        this.field_L = false;
        if (this.field_mb) {
          ns.d((byte) 83);
          return;
        }
        if (!this.field_sb) {
          return;
        }
        of.d((byte) -24);
    }

    public static void n(int param0) {
        field_lb = null;
        field_ob = null;
        field_rb = null;
        if (param0 != 0) {
          return;
        }
        field_kb = null;
        field_vb = null;
    }

    final static boolean b(int param0, byte param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var20;
        String var51;
        String var52;
        String var53;
        String var54;
        Object var55;
        CharSequence var56;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var54Lifetime1;
        String var54Lifetime2;
        var55 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 1;
        if (!cu.field_c &&
          null == eu.field_g) {
          var3 = 0;
        }
        if (0 == rs.field_t &&
          null != no.field_K) {
          var3 = 0;
        }
        if (rs.field_t == 2 &&
          !vu.j(6)) {
          var3 = 0;
        }
        if (rs.field_q == 84) {
          if (var3 == 0) {
            if (0 == rs.field_t) {
              return true;
            }
            rd.b(8445);
            return true;
          }
          if (qj.field_C.length() <= 0) {
            rd.b(8445);
            return true;
          }
          var4_ref_String = qj.field_C.toString();
          if (kg.a(var4_ref_String, param1 + 134)) {
            var13 = (String) null;
            var12 = (String) null;
            ta.a((String) null, 2, -18119, (String) null, rl.field_y, 0);
            var15 = (String) null;
            var14 = (String) null;
            ta.a((String) null, 2, -18119, (String) null, g.field_a, 0);
            rd.b(8445);
            return true;
          }
          var5 = rs.field_t;
          if (var5 == 0 &&
            null != vu.field_M) {
            var5 = 1;
          }
          if (kp.a(var5, param1 ^ -97) == 2) {
            ud.b(1, false, var5, param2);
          }
          it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
          rd.b(8445);
          return true;
        }
        if (85 == rs.field_q) {
          if (var3 == 0) {
            return true;
          }
          if (qj.field_C.length() <= 0) {
            return true;
          }
          up.a(' ', -1 + qj.field_C.length(), qj.field_C, true);
          return true;
        }
        var4 = ui.field_i;
        if (!uu.a(true, (char) var4)) {
          if (param1 == -59) {
          }
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (qj.field_C.length() >= 80) {
          return true;
        }
        discarded$0 = qj.field_C.append((char) var4);
        var5Lifetime1 = 485;
        var17 = mv.field_d;
        var16 = nt.a(param1 - 47, var17);
        var18 = var16;
        if (rs.field_t == 2) {
          var56 = (CharSequence) ((Object) qd.field_G);
          var20 = fo.a(4800, ta.field_Q, new String[]{ug.a(16, var56)});
          var8 = fo.a(4800, ov.field_l, new String[]{var16});
          var9 = tc.field_e.a(var20);
          var10 = tc.field_e.a(var8);
          if (var9 > var10) {
            var5Lifetime1 = var5Lifetime1 - var9;
            if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
              up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
            }
            return true;
          }
          var5Lifetime1 = var5Lifetime1 - var10;
          if (tc.field_e.a(qj.field_C.toString()) <= var5Lifetime1) {
            return true;
          }
          up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
          return true;
        }
        var7 = "";
        if (0 != rs.field_t) {
          var51 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - tc.field_e.a(var51);
          if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
            up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
          }
          return true;
        }
        if (null == vu.field_M &&
          bq.field_c) {
          var7 = "[" + sa.field_c + "] ";
        }
        if (vu.field_M == null) {
          var54 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - tc.field_e.a(var54);
          if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
            up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
          }
          return true;
        }
        if (!mt.field_f) {
          var7Lifetime1 = "[" + fo.a(param1 ^ -4859, cv.field_m, new String[]{vu.field_M.field_rc}) + "] ";
          var54Lifetime1 = var7Lifetime1 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - tc.field_e.a(var54Lifetime1);
          if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
            up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
          }
          return true;
        }
        if (ur.field_C != null) {
          var52 = "[" + ur.field_C + "] ";
          var53 = var52 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - tc.field_e.a(var53);
          if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
            up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
          }
          return true;
        }
        var7Lifetime2 = "[" + fo.a(param1 ^ -4859, cv.field_m, new String[]{vu.field_M.field_rc}) + "] ";
        var54Lifetime2 = var7Lifetime2 + var18 + ": ";
        var5Lifetime1 = var5Lifetime1 - tc.field_e.a(var54Lifetime2);
        if (tc.field_e.a(qj.field_C.toString()) > var5Lifetime1) {
          up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
        }
        return true;
    }

    public void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_wb) {
            gl.a(122, 3);
            this.b(true);
          } else {
            ra.a(ag.d((byte) -125), -113, "tochangedisplayname.ws");
          }
          if (param1 != 11) {
            ro.n(46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ro.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void o(int param0) {
        ad var2 = null;
        if (param0 == 4259) {
          this.field_tb.c(4210752, 2121792, 27178);
          var2 = new ad(this, this.field_nb, va.field_B);
          var2.a(sa.field_b, 15, 1);
          this.a(var2, (byte) -108);
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        boolean stackIn_7_1 = false;
        ad stackIn_12_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ad var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_qb) {
            return;
          }
          this.field_qb = true;
          stackIn_7_1 = (param0 == 256);
          this.field_wb = stackIn_7_1;
          this.field_tb.c(4210752, 8405024, 27178);
          var6 = new ad(this, this.field_nb, param2);
          var4 = var6;
          if (5 == param0) {
            var6.a(me.field_d, 11, 1);
            var6.a(dt.field_c, 17, param1 ^ 99);
          } else {
            if (param0 != 256) {
              stackIn_12_0 = var6;
              if (this.field_mb) {
                stackIn_13_1 = a.field_k;
              } else {
                stackIn_13_1 = fj.field_a;
              }
              ((ad) (Object) stackIn_12_0).a(stackIn_13_1, -1, param1 ^ 99);
            } else {
              var6.a(a.field_k, (qo) (this), (byte) -89);
            }
          }
          if (param0 == 3) {
            var6.a(te.field_m, 7, 1);
          } else {
            if (param0 != 4) {
              if (param0 != 6) {
                if (param0 == 9) {
                  var6.a(iu.field_b, (qo) (this), (byte) -55);
                }
              } else {
                var6.a(ag.field_O, 9, 1);
              }
            } else {
              var6.a(nf.field_Jb, 8, 1);
            }
          }
          this.a(var6, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("ro.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_kb = "Continue";
        field_ub = 0;
    }
}
