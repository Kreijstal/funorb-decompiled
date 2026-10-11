/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ae extends na {
    boolean field_N;
    static hl field_J;
    private boolean field_O;
    boolean field_K;
    private boolean field_I;
    static String field_M;
    static int field_L;

    final static void b(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TetraLink.field_J;
        try {
          we.a(0, ai.field_h, nd.field_Mb, param1, true, 0, eh.field_s);
          if (param0 <= 77) {
            field_M = (String) null;
          }
          var2_int = 0;
          do {
            if (!(var2_int < nd.field_Mb)) {
              we.a(0, mh.field_d, param1 + nd.field_Mb, param1 + param1, false, param1, va.field_z);
              break;
            }
            qd.field_W[var2_int + param1] = var2_int;
            var2_int++;
          } while (var3 == 0);
          if (nd.field_Mb > param1) {
            nd.field_Mb = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ae.BA(" + param0 + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 80) {
            this.field_O = true;
          }
          if (null != this.field_s &&
            this.field_s instanceof dm) {
            ((dm) (this.field_s)).a((byte) -55, this, param3, param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "ae.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_K &&
            this.field_I) {
            param0.f(-102);
            this.field_O = true;
            if (null != this.field_s &&
              this.field_s instanceof ub) {
              ((ub) (this.field_s)).a(param1 ^ 384161774, (na) (this), this.field_O);
            }
            if (param1 == -384169950) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ae.EB(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.math.BigInteger param0, bh param1, bh param2, java.math.BigInteger param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param4 <= 54) {
            field_L = 109;
          }
          ac.a((byte) 92, param2.field_u, param2.field_t, param1, 0, param0, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ae.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    ae(String param0, dn param1) {
        this(param0, dh.field_q.field_n, param1);
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 82) {
            field_J = (hl) null;
          }
          bo.field_C = new je();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "ae.W(" + param0 + ')');
        }
    }

    final static ud a(boolean param0, int param1, int param2) {
        rb stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_4_4;
        boolean stackIn_5_5 = false;
        ud stackIn_7_0 = null;
        hl stackIn_44_0 = null;
        String stackIn_45_1 = null;
        hl stackIn_48_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        je var4 = null;
        Object var5 = null;
        Object var6 = null;
        ud var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        pf var17 = null;
        String var18 = null;
        int var19 = 0;
        pf var17Lifetime1;
        String var18Lifetime1;
        var19 = TetraLink.field_J;
        try {
          stackIn_4_0 = pj.field_f.field_Rb;
          stackIn_4_1 = 2;
          stackIn_4_2 = qe.field_d + 2;
          stackIn_4_3 = -127;
          stackIn_4_4 = param0;
          stackIn_5_5 = (bi.field_d == pj.field_f.field_Rb);
          var3_int = ((rb) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_5_5, param1 * (6 + qe.field_d * 3)) ? 1 : 0;
          var4 = pj.field_f.field_Kb.field_fb;
          if (param2 != -13047) {
            stackIn_7_0 = (ud) null;
            return stackIn_7_0;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = null;
          if (ji.field_Tb != 2) {
            mi.field_Kb.field_jb = dg.field_m;
            go.field_d.field_S = false;
            if (ji.field_Tb != 1) {
              pj.field_f.field_Rb.field_Ob.field_jb = kl.field_f;
              if (var19 != 0) {
                pj.field_f.field_Rb.field_Ob.field_jb = oe.field_t;
              }
            } else {
              pj.field_f.field_Rb.field_Ob.field_jb = oe.field_t;
            }
            hd.a(pj.field_f.field_Kb, (byte) -104);
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            go.field_d.field_S = true;
            mi.field_Kb.field_jb = sk.a(new String[]{ul.field_e}, vc.field_a, param2 + 13174);
            pj.field_f.field_Rb.field_Ob.field_jb = null;
            var6 = null;
            var7 = (ud) (var4.c(false));
            while (true) {
              if (null != var7) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_fb) {
                    var7.field_Tb = new hl(0L, sk.field_h);
                    var7.a((byte) -114, var7.field_Tb);
                    var7.field_Wb = new hl(0L, ga.field_c);
                    var7.a((byte) 94, var7.field_Wb);
                    var7.field_Kb = new hl(0L, sk.field_h);
                    var7.a((byte) -122, var7.field_Kb);
                    var7.field_Wb.field_xb = 2;
                    var8 = 1;
                    var7.c((byte) -43);
                  }
                  var7.field_Hb = pj.field_f.field_Kb.field_Hb;
                  var9 = 0;
                  if (null != var7.field_Ub) {
                    if (ul.field_e != var7.field_Ub) {
                      var11 = 16777062;
                      var10 = 13421568;
                    } else {
                      var11 = 6750054;
                      var10 = 52224;
                    }
                  } else {
                    var10 = 13369344;
                    var11 = 16737894;
                  }
                  var12 = 0;
                  if (var7.field_Vb != null &&
                    !var7.field_Vb.equals("")) {
                    var7.field_Kb.field_vb = db.field_b;
                    var7.field_Kb.field_L = var11;
                    var7.field_Kb.a((byte) -120, 3 + db.field_b.field_t, var9, qe.field_d, 0);
                    var12 = 1;
                  }
                  var7.field_Wb.field_ib = var11;
                  var7.field_Tb.field_ib = var11;
                  var7.field_Wb.field_nb = var11;
                  var7.field_Tb.field_nb = var11;
                  var7.field_Wb.field_N = var10;
                  var7.field_Tb.field_N = var10;
                  var7.field_Wb.field_L = var11;
                  var7.field_Tb.field_L = var11;
                  var13 = 0;
                  var14 = var7.field_Hb - 80 - 2;
                  if (var12 != 0) {
                    var13 = db.field_b.field_t + 3;
                    var14 = var14 - var13;
                  }
                  stackIn_44_0 = var7.field_Tb;
                  if (var14 > 0) {
                    stackIn_45_1 = jb.a(var7.field_Tb.field_Ib, var7.field_Mb, var14);
                  } else {
                    stackIn_45_1 = var7.field_Mb;
                  }
                  stackIn_44_0.field_jb = stackIn_45_1;
                  var7.field_Tb.a((byte) -93, var14, var9, qe.field_d, var13);
                  stackIn_48_0 = var7.field_Wb;
                  if (var7.field_Ub != null) {
                    stackIn_49_1 = var7.field_Ub;
                  } else {
                    stackIn_49_1 = j.field_t;
                  }
                  stackIn_48_0.field_jb = stackIn_49_1;
                  var7.field_Wb.a((byte) -108, 80, var9, qe.field_d, var7.field_Hb - 80);
                  stackIn_53_0 = (var7.field_Tb.field_jb.equals(var7.field_Mb)) ? 0 : 1;
                  var15 = stackIn_53_0;
                  var9 = var9 + qe.field_d;
                  if (var3_int == 0) {
                    var7.field_mb = var9 - var7.field_R;
                  }
                  if (var8 != 0) {
                    pj.field_f.field_Kb.a((hl) (var6), true, var7, 2);
                  }
                  if (var7.field_Kb == null ||
                    !var7.field_Kb.field_Y) {
                    if (var7.field_F != 0) {
                      var16 = var7.field_Mb;
                      gd.a(var16, 255, (String) null, -1, pj.field_f.field_Rb, (int[]) null, 0L, var7, -1);
                      if (null != var7.field_Ub &&
                        !cc.a(hd.field_s.field_b, (byte) -80) &&
                        !cd.field_a) {
                        if (!fn.field_K) {
                          var17 = hd.field_s;
                          var18 = sk.a(new String[]{var16}, jk.field_a, 123);
                          var17.field_j.a(var18, param2 + 13048, 8);
                        }
                        var17Lifetime1 = hd.field_s;
                        var18Lifetime1 = sk.a(new String[]{var16}, pl.field_b, param2 + 13172);
                        var17Lifetime1.field_j.a(var18Lifetime1, 1, 18);
                      }
                      var5 = var7;
                    } else if (var7.field_Tb.field_Y &&
                      var15 != 0) {
                      re.field_P = var7.field_Mb;
                    }
                  } else {
                    re.field_P = var7.field_Vb;
                  }
                  var6 = var7;
                  var7 = (ud) (var4.a((byte) -70));
                  continue;
                }
              } else {
                if (pj.field_f.field_Sb.field_F != 0) {
                  lf.field_b = new vg(pj.field_f.field_Sb.field_eb, pj.field_f.field_Sb.field_z, pj.field_f.field_Sb.field_Hb, pj.field_f.field_Sb.field_R, qj.field_d, um.field_n, bk.field_i, bk.field_i);
                  ke.field_c = 0;
                }
              }
              if (pj.field_f.field_Pb.field_F == 0) {
                break;
              }
              lf.field_b = new vg(pj.field_f.field_Pb.field_eb, pj.field_f.field_Pb.field_z, pj.field_f.field_Pb.field_Hb, pj.field_f.field_Pb.field_R, wg.field_g, um.field_n, bk.field_i, bk.field_i);
              ke.field_c = 1;
              break;
            }
          }
          stackIn_102_0 = var5;
          return (ud) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "ae.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.c(3) && (param0 == 84 ||
            param0 == 83)) {
            this.b(-1, -1, 80, 1);
            return true;
          }
          if (param2 != 1) {
            this.field_K = true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ae.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        try {
          field_J = null;
          field_M = null;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ae.DA(" + param0 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param2, 80, param1)) {
            this.a(-126, param1, param0, param2);
            if (this.field_N) {
              discarded$0 = param1.append(" active");
            }
            if (!this.field_K) {
              discarded$1 = param1.append(" disabled");
            }
          }
          if (param3 == -372494750) {
            stackIn_14_0 = (StringBuilder) (param1);
            return stackIn_14_0;
          }
          stackIn_12_0 = (StringBuilder) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ae.WA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param1) {
            return;
          }
          if (null != this.field_s &&
            this.field_s instanceof tf) {
            ((tf) (this.field_s)).a(param0, param4, param3, this, param5, 126);
          }
          this.field_x = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("ae.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -32738) {
            field_J = (hl) null;
          }
          if (this.field_K &&
            this.b(param6, 1343807649, param1, param3, param5)) {
            this.a(param0, -384169950);
            this.field_x = param2;
            if (null != this.field_s &&
              this.field_s instanceof tf) {
              ((tf) (this.field_s)).a(param3, param6, param1, 9294, param5, this, param2);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("ae.PA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (0 != this.field_x &&
            ho.field_X != this.field_x) {
            if (this.b(aa.field_Nb, 1343807649, param1, param2, a.field_a) &&
              ho.field_X == 0) {
              this.b(-param2 + a.field_a, -param1 + aa.field_Nb, 80, this.field_x);
            }
            this.a(a.field_a, false, param0, param2, aa.field_Nb, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ae.MA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ae(String param0, kg param1, dn param2) {
        super(param0, param1, param2);
        this.field_K = true;
        this.field_O = false;
        this.field_I = true;
    }

    protected ae() {
        this.field_K = true;
        this.field_O = false;
        this.field_I = true;
        try {
          this.field_H = dh.field_q.field_t;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ae.<init>()");
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_O) {
            this.field_O = false;
            if (this.field_s != null &&
              this.field_s instanceof ub) {
              ((ub) (this.field_s)).a(-8244, (na) (this), this.field_O);
            }
          }
          if (param0 > -63) {
            field_M = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ae.UA(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            this.field_K = true;
          }
          stackIn_4_0 = this.field_O;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ae.JA(" + param0 + ')');
        }
    }

    static {
        field_M = "You need a rating of <%1> to play with the current options.";
        field_L = 0;
    }
}
