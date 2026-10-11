/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    private int field_a;
    private String field_f;
    cf field_b;
    static String field_g;
    int field_d;
    private int[] field_e;
    private long field_j;
    String field_i;
    ci field_k;
    static String field_h;
    static int field_c;

    private final boolean b(int param0, int param1, int param2) {
        if (17 == param1) {
          pj.field_h = new pc(this.field_k.field_U, this.field_k.field_wb, this.field_k.field_M, this.field_k.field_pb, param0, ki.field_P, dc.field_s, gd.field_b, qn.field_P, kj.field_g, sj.field_k, this.field_i, this.field_j);
          return true;
        }
        if (param2 == 13563) {
          return false;
        }
        field_g = (String) null;
        return false;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (!param1) {
              field_c = -94;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(rh.a(var2, param0, (byte) -87), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("dh.R(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -75) {
          return;
        }
        field_h = null;
        field_g = null;
    }

    final void a(int param0, boolean param1) {
        r var4;
        String var5;
        int var6;
        r var7;
        r var8;
        r var9;
        r var4Lifetime1;
        var6 = Chess.field_G;
        if (param0 != 0) {
          this.field_j = 17L;
          if (null == this.field_i) {
            return;
          }
          if (this.field_j == gb.field_t) {
            return;
          }
          if (pd.field_Rb == null) {
            return;
          }
          if (ci.f(-52)) {
            var9 = ug.a((byte) -86, this.field_j);
            var4 = mi.a(134217727, this.field_j);
            var5 = this.a(28);
            if (var4 != null) {
              if (pd.field_Rb.field_Vb &&
                pd.field_Rb.field_pc < 0) {
                return;
              }
              this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
              return;
            }
            if (var9 != null &&
              pd.field_Rb.field_ac) {
              if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
                return;
              }
              if (var9.field_ac) {
                this.field_b.a((byte) -12, oc.a(sh.field_a, new String[]{var5}, (byte) -92), 1);
              } else {
                if (!param1) {
                  this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                } else {
                  if (!var9.field_Qb) {
                    this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                  } else {
                    this.field_b.a((byte) -12, oc.a(ub.field_c, new String[]{var5}, (byte) -127), 0);
                    this.field_b.a((byte) -12, oc.a(w.field_Fb, new String[]{var5}, (byte) -81), 1);
                  }
                }
              }
              return;
            }
          }
          return;
        }
        if (null == this.field_i) {
          return;
        }
        if (this.field_j == gb.field_t) {
          return;
        }
        if (pd.field_Rb == null) {
          return;
        }
        if (!ci.f(-52)) {
          return;
        }
        var8 = ug.a((byte) -86, this.field_j);
        var7 = var8;
        var4Lifetime1 = mi.a(134217727, this.field_j);
        var5 = this.a(28);
        if (var4Lifetime1 != null) {
          if (pd.field_Rb.field_Vb &&
            pd.field_Rb.field_pc < 0) {
            return;
          }
          this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
          return;
        }
        if (var8 == null) {
          return;
        }
        if (!pd.field_Rb.field_ac) {
          return;
        }
        if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
          return;
        }
        if (var8.field_ac) {
          this.field_b.a((byte) -12, oc.a(sh.field_a, new String[]{var5}, (byte) -92), 1);
        } else {
          if (!param1) {
            this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
          } else {
            if (!var8.field_Qb) {
              this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
            } else {
              this.field_b.a((byte) -12, oc.a(ub.field_c, new String[]{var5}, (byte) -127), 0);
              this.field_b.a((byte) -12, oc.a(w.field_Fb, new String[]{var5}, (byte) -81), 1);
            }
          }
        }
    }

    final static void a(int param0, j param1) {
        try {
          int var2_int = 22 / ((35 - param0) / 41);
          param1.field_s = new char[]{(char)63};
          param1.field_t = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0, int param1, int param2) {
        int var5;
        var5 = Chess.field_G;
        if (param1 <= 63) {
          return false;
        }
        if (param0 == 8) {
          wg.a(this.field_i, (byte) -118, this.field_j);
          return true;
        }
        if (param0 == 18) {
          lj.a(this.field_i, this.field_j, 112);
          return true;
        }
        if (param0 == 11) {
          oj.a(this.field_a, (byte) -99, 0, param2);
          return true;
        }
        if (param0 == 12) {
          oj.a(this.field_a, (byte) -99, 1, param2);
          return true;
        }
        if (13 == param0) {
          oj.a(this.field_a, (byte) -99, 2, param2);
          return true;
        }
        if (param0 == 14) {
          jg.n(-66);
          return true;
        }
        if (param0 == 20) {
          sh.a(false);
          return true;
        }
        if (param0 != 19) {
          return false;
        }
        fl.a(this.field_e, this.field_j, this.field_a, this.field_i, (byte) 113);
        return true;
    }

    final void a(int param0, ld param1) {
        if (param1.field_d) {
          return;
        }
        try {
          this.field_a = param1.field_k;
          if (0 == param1.field_k) {
            if (sg.field_d == 0) {
              this.field_b.a((byte) -12, dl.field_m, 12);
            }
            this.field_b.a((byte) -12, ua.field_e, 13);
          }
          int var3_int = -49 % ((param0 - 3) / 36);
          if (param1.field_k == 1) {
            if (ii.field_Q == 0) {
              this.field_b.a((byte) -12, nk.field_v, 12);
            }
            this.field_b.a((byte) -12, un.field_i, 13);
          }
          if (param1.field_k == 2) {
            if (v.field_d == 0) {
              this.field_b.a((byte) -12, wf.field_X, 12);
            }
            this.field_b.a((byte) -12, in.field_e, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        hh var1 = (hh) (eh.field_R.g(-18110));
        if (var1 == null) {
          si.d(65280);
          return;
        }
        nk var2 = tk.field_h;
        var2.e((byte) -96);
        var2.e((byte) -92);
        var2.e((byte) -99);
        if (param0 == 49) {
          var2.e((byte) -109);
          var1.c(-2193);
          return;
        }
        field_c = -36;
        var2.e((byte) -109);
        var1.c(-2193);
    }

    final void b(int param0, boolean param1) {
        this.field_b.a(false, param1);
        if (param0 > -58) {
          this.field_f = (String) null;
        }
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ve var5 = null;
        int var6 = 0;
        p var7 = null;
        String var8 = null;
        try {
          if (this.field_i != null && (~this.field_j != ~gb.field_t ||
            param2 == 2) && ld.field_g == 2) {
            var8 = this.a(param0 + 106);
            var4 = var8;
            var5 = mn.a(param0 - 18, this.field_i);
            var6 = va.a(this.field_i, -19554) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_b.a((byte) -12, oc.a(jl.field_a, new String[]{var8}, (byte) -71), 4);
              this.field_b.a((byte) -12, oc.a(bb.field_c, new String[]{var8}, (byte) -62), 6);
              if (param1 != null &&
                param2 != 2 &&
                !qf.field_b) {
                this.field_e = param1;
                this.field_b.a((byte) -12, oc.a(ci.field_x, new String[]{var8}, (byte) -93), 19);
              }
            }
            if (var5 != null) {
              if (!am.a(false, this.field_i) &&
                !qf.field_b) {
                if (!kh.field_o) {
                  this.field_b.a((byte) -12, oc.a(bc.field_c, new String[]{var8}, (byte) -57), 8);
                }
                this.field_b.a((byte) -12, oc.a(nd.field_b, new String[]{var8}, (byte) -89), 18);
                if (param1 != null) {
                  this.field_e = param1;
                  this.field_b.a((byte) -12, oc.a(ci.field_x, new String[]{var8}, (byte) -62), 19);
                }
              }
              this.field_b.a((byte) -12, oc.a(un.field_h, new String[]{var8}, (byte) -100), 5);
            }
            if (var6 != 0) {
              this.field_b.a((byte) -12, oc.a(tb.field_b, new String[]{var8}, (byte) -119), 7);
            }
          }
          if (param0 == 17) {
            return;
          }
          var7 = (p) null;
          dh.a(29, -33, -123, 35, (p) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("dh.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var6 = this.field_b.a(param1, -19);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$2 = this.a(5069, var6, param0);
        if (param4 == -11) {
          discarded$3 = this.a(false, var6, param2);
          discarded$4 = this.d(var6, param4 + 120, param2);
          discarded$5 = this.b(param3, var6, 13563);
          return true;
        }
        j var7 = (j) null;
        dh.a(113, (j) null);
        boolean discarded$6 = this.a(false, var6, param2);
        boolean discarded$7 = this.d(var6, param4 + 120, param2);
        boolean discarded$8 = this.b(param3, var6, 13563);
        return true;
    }

    final void b(byte param0) {
        ln var5 = null;
        String var3 = null;
        int var4 = Chess.field_G;
        if (param0 >= -67) {
          return;
        }
        if (null == pd.field_Rb) {
          var5 = bk.a(-118, this.field_d);
          if (var5 == null) {
            return;
          }
          var3 = var5.field_Gb;
          if (var5.field_dc) {
            this.field_b.a((byte) -12, oc.a(sj.field_p, new String[]{var3}, (byte) -76), 2);
            this.field_b.a((byte) -12, oc.a(kh.field_p, new String[]{var3}, (byte) -101), 3);
            return;
          }
          if (!var5.field_Pb) {
            if (var5.field_Tb) {
              if (!var5.field_Tb) {
                return;
              }
              this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
              return;
            }
            if (!var5.field_ac) {
              if (!var5.field_Tb) {
                return;
              }
              this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
              return;
            }
            if (!var5.field_Vb) {
              this.field_b.a((byte) -12, oc.a(ki.field_O, new String[]{var3}, (byte) -68), 2);
              if (!var5.field_Tb) {
                return;
              }
              this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
              return;
            }
            if (var5.field_Pb) {
              this.field_b.a((byte) -12, oc.a(ki.field_O, new String[]{var3}, (byte) -68), 2);
              if (!var5.field_Tb) {
                return;
              }
              this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
              return;
            }
            if (!var5.field_Tb) {
              return;
            }
            this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
            return;
          }
          this.field_b.a((byte) -12, oc.a(lj.field_d, new String[]{var3}, (byte) -46), 2);
          if (!var5.field_Tb) {
            return;
          }
          this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
          return;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          var5 = lc.field_n;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 > 61) {
            return;
          }
          dh.d((byte) 5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "dh.N(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, p param4) {
        param4.c(12, (byte) -81);
        param4.b(17, 91);
        param4.b(param0, param1 + 78);
        param4.b(param2, param1 ^ 118);
        if (param1 != 11) {
          return;
        }
        try {
          param4.c(param3, (byte) 109);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "dh.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        String var4 = null;
        String var2 = null;
        String var2Lifetime1;
        if (param0 < -6) {
          if (this.field_i != null &&
            this.field_j != gb.field_t) {
            var4 = this.a(72);
            var2 = var4;
            this.field_b.a((byte) -12, oc.a(oh.field_c, new String[]{var4}, (byte) -127), 17);
          }
          return;
        }
        j var3 = (j) null;
        dh.a(57, (j) null);
        if (this.field_i != null &&
          this.field_j != gb.field_t) {
          var4 = this.a(72);
          var2Lifetime1 = var4;
          this.field_b.a((byte) -12, oc.a(oh.field_c, new String[]{var4}, (byte) -127), 17);
        }
    }

    private final static void c(int param0, int param1, int param2) {
        ln var6 = null;
        ln var7 = null;
        nk var4 = null;
        nk var4Lifetime1;
        if (param2 != cn.field_g) {
          var6 = (ln) (ae.field_f.a((long)cn.field_g, 3000));
          var7 = var6;
          cn.field_g = param2;
          if (var7 != null) {
            var7.field_ec = null;
          } else {
            var4 = qn.field_U;
            var4.f(param1, -94);
            var4.c(3, (byte) 82);
            var4.c(11, (byte) 76);
            var4.b(param2, 117);
            if (param0 <= 107) {
              field_g = (String) null;
              return;
            }
            return;
          }
          var4Lifetime1 = qn.field_U;
          var4Lifetime1.f(param1, -94);
          var4Lifetime1.c(3, (byte) 82);
          var4Lifetime1.c(11, (byte) 76);
          var4Lifetime1.b(param2, 117);
          if (param0 <= 107) {
            field_g = (String) null;
            return;
          }
          return;
        }
        if (param0 > 107) {
          return;
        }
        field_g = (String) null;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = Chess.field_G;
        if (param0 != 5069) {
          return false;
        }
        if (param1 == 0) {
          ue.a(this.field_j, 16581, param2);
        } else {
          if (param1 == 1) {
            fd.a(param2, -125, this.field_j);
            return true;
          }
          if (param1 == 2) {
            fj.a(param2, 3, this.field_d);
            return true;
          }
          if (param1 == 3) {
            db.a(param2, this.field_d, param0 ^ 32284);
            return true;
          }
          if (10 == param1) {
            la.a(param2, (byte) 127, this.field_d);
            return true;
          }
          if (param1 == 15) {
            dh.c(114, param2, this.field_d);
            return true;
          }
          if (16 == param1) {
            dh.c(113, param2, 0);
            return true;
          }
          return false;
        }
        return true;
    }

    final boolean b(int param0) {
        if (param0 != 4) {
          return true;
        }
        if (this.field_b == null) {
          return false;
        }
        if (this.field_b.l(3)) {
          return true;
        }
        return false;
    }

    private final boolean a(boolean param0, int param1, int param2) {
        Object var4;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var5Lifetime1;
        String var5Lifetime2;
        String var5Lifetime3;
        if (param0) {
          return true;
        }
        var4 = null;
        if (param1 == 4) {
          var6 = hf.a(param2, 107, this.field_i);
          if (var6 == null) {
            return true;
          }
          var5 = (String) null;
          lc.a(this.field_i, (String) null, 2, 0, var6, false);
          return true;
        }
        if (5 == param1) {
          var9 = ab.a(param2, 21250, this.field_i);
          if (var9 != null) {
            var5Lifetime1 = (String) null;
            lc.a(this.field_i, (String) null, 2, 0, var9, false);
          }
          return true;
        }
        if (param1 == 6) {
          var7 = a.a(param2, this.field_i, (byte) 64);
          if (var7 != null) {
            var5Lifetime2 = (String) null;
            lc.a(this.field_i, (String) null, 2, 0, var7, false);
          }
          return true;
        }
        if (param1 != 7) {
          return false;
        }
        var8 = of.a(this.field_f, param2, this.field_i, -1);
        if (var8 != null) {
          var5Lifetime3 = (String) null;
          lc.a(this.field_i, (String) null, 2, 0, var8, false);
        }
        return true;
    }

    private final String a(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 > 17) {
          if (this.field_f == null) {
            var2 = this.field_i;
          } else {
            var2 = this.field_f;
          }
          return var2;
        }
        this.field_d = -57;
        if (this.field_f == null) {
          var2Lifetime1 = this.field_i;
        } else {
          var2Lifetime1 = this.field_f;
        }
        return var2Lifetime1;
    }

    final static void c(int param0) {
        if (rm.field_Q == 10) {
          sh.a((byte) -59);
          rm.field_Q = 11;
        } else {
          if (!tb.a((byte) 87)) {
            sh.a((byte) -59);
            rm.field_Q = 11;
          }
        }
        if (param0 != 12) {
          return;
        }
        gg.field_n = true;
    }

    dh(ci param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_b = new cf(bd.field_a);
          this.field_j = param1;
          this.field_a = param5;
          param0.field_gb = true;
          this.field_e = param6;
          this.field_k = param0;
          this.field_f = param3;
          this.field_i = param2;
          this.field_d = param4;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Discard";
        field_g = "<%0> is already on your ignore list.";
    }
}
