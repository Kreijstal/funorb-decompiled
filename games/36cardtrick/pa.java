/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends dg {
    static String field_N;
    private int field_R;
    private ba field_O;
    private kc field_Q;
    private String field_P;

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param1);
              var3 = fh.a(param0, var3, -1);
              bk.a(param0, -25573, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            if (param2 >= -5) {
              pa.f((byte) -124);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("pa.D(");
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
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
          this.field_R = this.field_R + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pa.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(String param0, jk param1, jk param2, int param3, int param4, int param5, boolean param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        pb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_2 = null;
        pb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_14_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
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
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Main.field_T;
        try {
          var14 = param1.a(0);
          var8 = param2.a(0);
          if (null == cb.field_j &&
            !md.a(100, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (vf.field_a == ra.field_b) {
            ni.field_f = null;
            na.field_r.field_i = 0;
            if (param0 != null) {
              var9 = 0;
              gh.field_h.field_i = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              gh.field_h.a(-246, pg.field_a.nextInt());
              gh.field_h.a(-246, pg.field_a.nextInt());
              gh.field_h.a(744825352, var14);
              gh.field_h.a(744825352, var8);
              var15 = (CharSequence) ((Object) param0);
              gh.field_h.a(744825352, sh.a(var15, (byte) -128));
              gh.field_h.e(param3, 26040);
              gh.field_h.b(param5 ^ -9455, param4);
              gh.field_h.b(-9469, var9);
              na.field_r.b(-9469, 18);
              na.field_r.field_i = na.field_r.field_i + 2;
              var10 = na.field_r.field_i;
              var11_ref_String = bi.a((byte) -27, mk.g(-119));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              na.field_r.a(var11_ref_String, 19235);
              lf.a(wd.field_c, na.field_r, id.field_c, (byte) -75, gh.field_h);
              na.field_r.d(na.field_r.field_i - var10, -27308);
            } else {
              gh.field_h.field_i = 0;
              gh.field_h.a(-246, pg.field_a.nextInt());
              gh.field_h.a(param5 - 264, pg.field_a.nextInt());
              stackIn_10_0 = gh.field_h;
              stackIn_10_1 = 744825352;
              if (!param1.b(true)) {
                stackIn_11_2 = "";
              } else {
                stackIn_11_2 = var14;
              }
              ((pb) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2);
              stackIn_13_0 = gh.field_h;
              stackIn_13_1 = 744825352;
              if (param2.b(true)) {
                stackIn_14_2 = var8;
              } else {
                stackIn_14_2 = "";
              }
              ((pb) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2);
              na.field_r.b(-9469, 16);
              na.field_r.field_i = na.field_r.field_i + 1;
              var9 = na.field_r.field_i;
              lf.a(wd.field_c, na.field_r, id.field_c, (byte) -75, gh.field_h);
              na.field_r.f(na.field_r.field_i - var9, 8049);
            }
            fe.a((byte) -97, -1);
            ra.field_b = kg.field_c;
          }
          if (kg.field_c == ra.field_b &&
            r.a(1, (byte) 122)) {
            var9Lifetime1 = rd.field_j.f(72);
            rd.field_j.field_i = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              ll.field_f = new String[var9Lifetime1 - 100];
              ra.field_b = ta.field_eb;
            } else {
              if (var9Lifetime1 == 248) {
                wf.a((byte) -83, mk.g(-126));
                e.field_a = qk.field_i;
                mc.a((byte) -127);
                lk.field_w = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (var9Lifetime1 != 99) {
                ra.field_b = kb.field_a;
                al.field_a = -1;
                pd.field_l = var9Lifetime1;
              } else {
                r.a(ia.b(param5 - 23), (byte) 119);
                ni.field_f = new Boolean(tg.a(-2, rd.field_j));
                rd.field_j.field_i = 0;
              }
            }
          }
          if (ta.field_eb == ra.field_b) {
            var9Lifetime2 = 2;
            if (r.a(var9Lifetime2, (byte) 120)) {
              var10Lifetime1 = rd.field_j.d((byte) 72);
              rd.field_j.field_i = 0;
              if (r.a(var10Lifetime1, (byte) 124)) {
                var11 = ll.field_f.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ll.field_f[var12] = rd.field_j.d(-74);
                }
                mc.a((byte) -125);
                lk.field_w = false;
                stackIn_43_0 = 100 + var11;
                return stackIn_43_0;
              }
            }
          }
          if (kb.field_a == ra.field_b &&
            gl.a(false)) {
            if (255 != pd.field_l) {
              e.field_a = rd.field_j.c(false);
            } else {
              var9_ref_String = rd.field_j.f((byte) 29);
              if (var9_ref_String != null) {
                lk.a(mk.g(param5 - 146), 0, var9_ref_String);
              }
            }
            mc.a((byte) -128);
            lk.field_w = false;
            stackIn_52_0 = pd.field_l;
            return stackIn_52_0;
          }
          if (cb.field_j == null) {
            if (lk.field_w) {
              if (we.a((byte) 79) > 30000L) {
                e.field_a = jf.field_k;
              } else {
                e.field_a = e.field_f;
              }
              lk.field_w = false;
              stackIn_60_0 = 249;
              return stackIn_60_0;
            }
            var9Lifetime3 = ag.field_e;
            ag.field_e = hj.field_l;
            hj.field_l = var9Lifetime3;
            lk.field_w = true;
          }
          if (param5 != 18) {
            field_N = (String) null;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("pa.F(");
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
          throw ma.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static ic a(byte[] param0, int param1) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ic stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (ic) (stackIn_2_0);
          }
          if (param1 != -1) {
            field_N = (String) null;
          }
          var2 = new ic(param0, kb.field_c, ml.field_b, na.field_q, hb.field_a, jf.field_i, rd.field_k);
          rh.d(-41);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pa.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    pa(ba param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, dj.b(31959));
        try {
          this.field_O = param0;
          this.field_P = param1;
          this.a(param5, param3, param4, param2, true);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(byte param0) {
        if (param0 == -79) {
          return null;
        }
        return (String) null;
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 71) {
            return false;
          }
          this.field_O = (ba) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        w var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        w var11 = null;
        int[] var12 = null;
        rc var13 = null;
        rc var14 = null;
        dh var15 = null;
        int[] var16 = null;
        var8 = Main.field_T;
        try {
          var11 = rd.field_j;
          var2 = var11.f(param0 ^ -121);
          if (var2 == param0) {
            var10 = eg.a(-60);
            var16 = var10;
            var12 = var16;
            var3 = var12;
            var9 = var10;
            var4 = var9;
            var5 = var11;
            var6 = ((pb) ((Object) var5)).f(-124);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((pb) ((Object) var5)).e((byte) 127);
            }
            var13 = (rc) (ue.field_b.a((byte) 74));
            if (var13 == null) {
              mc.a((byte) -127);
              return;
            }
            var13.field_p = var3;
            var13.field_j = true;
            var13.field_h = var16[0];
            var13.c(87);
            return;
          }
          if (var2 == 1) {
            var15 = (dh) (vb.field_c.a((byte) 74));
            if (var15 == null) {
              mc.a((byte) -128);
              return;
            }
            var15.c(param0 ^ 121);
          } else {
            if (var2 != 2) {
              k.a((Throwable) null, (byte) 70, "A1: " + aj.a((byte) 92));
              mc.a((byte) -128);
            } else {
              var14 = (rc) (ue.field_b.a((byte) 74));
              if (var14 == null) {
                mc.a((byte) -126);
                return;
              }
              var14.field_p = eg.a(85);
              var14.field_h = var14.field_p[0];
              var14.field_j = true;
              var14.c(118);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "pa.C(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 >= -47) {
          return;
        }
        field_N = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        sg var6;
        ne var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        lk var14;
        kc var15;
        kc var16;
        kc var17;
        sg var6Lifetime1;
        var13 = Main.field_T;
        var6 = this.field_O.a(true);
        if (var6 != tb.field_b &&
          var6 != a.field_n) {
          var5 = this.field_O.b(param2 ^ -26767);
          if (var5 == null) {
            var5 = this.field_P;
          }
        } else {
          var5 = n.field_C;
        }
        if (!var5.equals(this.field_r)) {
          this.field_r = var5;
          this.e((byte) 5);
        }
        super.a(param0, param1, param2 ^ 0, param3);
        var6Lifetime1 = this.field_O.a(true);
        var8 = (ne) ((Object) this.field_v);
        var9 = this.field_o + param0;
        var10 = var8.a((lk) (this), -1815612287, param1) + (var8.a((byte) 92, (lk) (this)).b(0) >> 1);
        if (param2 != -1) {
          var14 = (lk) null;
          this.a(-10, (lk) null);
        }
        if (tb.field_b != var6Lifetime1 &&
          a.field_n != var6Lifetime1) {
          if (pe.field_b == var6Lifetime1) {
            var16 = gh.field_n[2];
            var16.b(var9, -(var16.field_o >> 1) + var10, 256);
          } else if (ii.field_e == var6Lifetime1) {
            var15 = gh.field_n[1];
            var15.b(var9, -(var15.field_o >> 1) + var10, 256);
          }
        } else {
          var17 = gh.field_n[0];
          var11 = var17.field_l << 1;
          var12 = var17.field_k << 1;
          if (this.field_Q != null &&
            var11 <= this.field_Q.field_p &&
            var12 <= this.field_Q.field_o) {
            dl.a(-60, this.field_Q);
            vj.d();
          } else {
            this.field_Q = new kc(var11, var12);
            dl.a(-33, this.field_Q);
          }
          var17.a(112, 144, var17.field_l << 4, var17.field_k << 4, -this.field_R << 10, 4096);
          gg.a(14756);
          this.field_Q.b(var9 - (var17.field_l >> 1), var10 - var17.field_k, 256);
        }
    }

    static {
        field_N = "Unfortunately you are not eligible to create an account.";
    }
}
