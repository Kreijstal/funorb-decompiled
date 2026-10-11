/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends k implements ae {
    static NodeDeque field_Ub;
    private boolean field_Nb;
    private vi field_Zb;
    static uf field_Tb;
    static String field_Pb;
    static volatile int field_Rb;
    static String field_Qb;
    private boolean field_Sb;
    static rf field_Yb;
    static String field_Vb;
    static String field_Wb;
    static int field_Ob;
    static int[] field_Xb;

    final static void n(int param0) {
        if (param0 != -6) {
          CharSequence var2 = (CharSequence) null;
          fg.a((CharSequence) null, -105);
        }
    }

    final static pc a(int param0, int param1, int param2, sk param3) {
        RuntimeException var4 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 248) {
            field_Wb = (String) null;
          }
          stackIn_3_0 = on.a(em.b(param3, 100, param0, param1), -48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fg.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void o(byte param0) {
        field_Xb = null;
        field_Tb = null;
        field_Yb = null;
        field_Pb = null;
        field_Ub = null;
        field_Vb = null;
        field_Wb = null;
        if (param0 != -29) {
          return;
        }
        field_Qb = null;
    }

    private final void a(int param0, boolean param1, e param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        bm var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          this.field_Nb = true;
          if (!param2.field_d) {
            if (param2.field_c == null) {
              var4 = param2.field_e;
              if (248 == param2.field_a) {
                if (!param1) {
                  ud.a(true);
                }
                var4 = ec.field_g;
                this.field_Sb = true;
              }
            } else {
              var4 = field_Qb;
              if (this.field_Zb != null) {
                this.field_Zb.a((byte) 86);
              }
            }
          } else {
            var4 = lk.field_Z;
          }
          if (param0 != 5) {
            field_Yb = (rf) null;
          }
          var5 = new bm((k) (this), gf.field_d, var4);
          if (param2.field_d) {
            if (param2.field_f) {
              this.c(new nj(this), -22908735);
              return;
            }
            var5.a(-122, (tn) (this), ah.field_Sb);
          } else {
            if (!this.field_Sb) {
              if (param2.field_a == 5) {
                var5.a(11, cl.field_c, param0 ^ 110);
                var5.a(17, qe.field_b, 74);
              } else {
                var5.a(-1, le.field_J, 75);
              }
            } else {
              var5.a(param0 ^ -105, (tn) (this), ah.field_Sb);
            }
            if (3 != param2.field_a) {
              if (param2.field_a != 6) {
                this.c(var5, -22908735);
                return;
              }
              var5.a(9, rn.field_s, 74);
            } else {
              var5.a(7, vg.field_d, 76);
            }
          }
          this.c(var5, -22908735);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("fg.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = SteelSentinels.obfuscationControl;
        try {
          var6_int = 8 + param4 + (485 + param3 + param0);
          vg.field_g.a(0, 3, -6 + qc.field_V.field_Lb, 3, -6 + var6_int);
          var7 = -5 + vg.field_g.field_Lb;
          CombatWorld.field_H.a(0, var7 - param1, param1, 5, param3 + 485 + 2 + param4);
          vd.field_d.a(0, 0, param1, param3, -wh.field_e.field_zb + (-param3 + CombatWorld.field_H.field_zb));
          wh.field_e.a(0, 0, param1, vd.field_d.field_zb + param3, wh.field_e.field_zb);
          var7 = var7 - (2 + param1);
          sn.field_j.a(param4 + param3 + 485 + 2, -2048, param4, var7 - 5, 2, 5, 5);
          if (ve.field_b != null) {
            ve.field_b.a(sn.field_j.field_Y, (byte) -92, sn.field_j.field_eb, sn.field_j.field_zb, sn.field_j.field_Lb);
          }
          var8 = -param3 + (qc.field_V.field_zb - var6_int);
          var9 = var8 / 2;
          var10 = param3 + (param2 + var9);
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (5 <= var12 ||
              ah.field_Yb[var12] != null) {
              var13 = 3 + var11 * (2 + (-6 + qc.field_V.field_Lb)) / (1 + c.field_u);
              var11++;
              var7Lifetime1 = var11 * (-4 + qc.field_V.field_Lb) / (1 + c.field_u) + 1 - var13;
              if (var12 < 5) {
                ah.field_Yb[var12].a(0, var13, var7Lifetime1, var6_int, var8);
                en.field_b[var12].a(0, 0, var7Lifetime1, param3, -param3 + var9);
                jk.field_a[var12].a(0, param5, var7Lifetime1 - param5 - param5, var9, param2);
                gb.field_f[var12].a(0, param5, -param5 + (var7Lifetime1 - param5), var10, -var10 + (-param3 + var8));
              } else {
                fm.field_b.a(param0 - 10, var13, var7Lifetime1, var6_int, var8);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "fg.BB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean i(int param0) {
        e var2 = null;
        if (this.field_Q &&
          !this.field_Nb) {
          var2 = al.b((byte) 73);
          if (var2 != null) {
            this.a(5, false, var2);
          }
        }
        if (param0 != -8350) {
          fg.p((byte) -108);
        }
        return super.i(param0 + 0);
    }

    final static hl a(int param0, int param1) {
        hl var2 = new hl();
        if (param1 != 19999) {
          fg.a(125, 90);
        }
        ic.field_D.addLast(3, var2);
        eh.a(param0, -17274);
        return var2;
    }

    final static boolean p(byte param0) {
        int var1 = 77 / ((param0 - 28) / 44);
        return null != tj.field_f ? true : false;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -21) {
            field_Tb = (uf) null;
          }
          stackIn_3_0 = bi.a(true, 10, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fg.CB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        if (this.field_Sb) {
          ok.a(false, true, 95);
          return;
        }
        try {
          lc.a(0);
          this.m(112);
          int var6_int = -27 / ((param1 + 85) / 36);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fg.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    fg(ka param0, vi param1) {
        super(param0, gf.field_d, hk.field_Jc, false, false);
        try {
          this.field_Zb = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void o(int param0) {
        this.a(5, true, fi.a(123, ec.field_g, 248));
        if (param0 < 77) {
          field_Yb = (rf) null;
        }
    }

    static {
        field_Qb = "That name is not available";
        field_Rb = 0;
        field_Pb = "or";
        field_Ub = new NodeDeque();
        field_Vb = "Detail: Low";
        field_Yb = new rf();
        field_Wb = "Mission Complete";
        field_Ob = 1;
        field_Xb = new int[]{0, 5, 10, 1, 6, 11, 2, 7, 12, 33, 32, 26, 18, 21, 28, 29, 36, 27, 24, 3, 8, 13, 9, 4, 14, 42, 15, 39, 40, 20, 30, 35, 38, 37, 44, 41};
    }
}
