/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends df implements pj, vb {
    static aj field_I;
    static int field_G;
    static String field_H;
    private ej field_J;
    private ag field_F;
    static byte[] field_D;
    static int field_K;
    private ie field_E;

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != ob.field_hb) {
          var1 = ob.field_hb;
          synchronized (var1) {
            ob.field_hb = null;
          }
        }
        if (param0 != -23) {
          field_D = (byte[]) null;
        }
    }

    private final String g(int param0) {
        if (param0 != -7) {
          qm var3 = (qm) null;
          this.a((qm) null, (byte) 70, 'ﾘ', 107);
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String g(byte param0) {
        if (param0 != 94) {
          field_H = (String) null;
        }
        return "</col></u>";
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_24_0 = null;
        kc stackIn_33_0 = null;
        String stackIn_34_1 = null;
        kc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String[] stackIn_36_2 = null;
        String stackIn_37_3 = null;
        kc stackIn_64_0 = null;
        boolean stackIn_65_1 = false;
        kc stackIn_69_0 = null;
        boolean stackIn_70_1 = false;
        kc stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        kc var5 = null;
        kc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        kc var15 = null;
        String var16 = null;
        kc var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          ej.a(16, sm.field_a);
          if (null != om.field_x) {
            go.field_d.field_I = 0;
            var15 = go.field_d;
            var17 = var15;
            var17.field_x = 0;
            dk.field_k.field_I = 0;
            var5 = dk.field_k;
            var5.field_x = 0;
            var6 = jf.field_d;
            jf.field_d.field_I = 0;
            var6.field_x = 0;
            nl.field_Db.field_rb = ri.field_c.toUpperCase();
            var7 = (oh.field_h.field_x + 2) / 2;
            jf.field_d.a(-2 + var7, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
            dk.field_k.a(-var7 + oh.field_h.field_x, var7, oh.field_h.field_I - 40, 40, (byte) -120);
            if (ao.field_h.length == 1 &&
              ao.field_h[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (ao.field_h.length > var10) {
                  stackIn_10_0 = ((gh.field_E[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    2 != ao.field_h[var10]) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            dk.field_k.field_ub = true;
            if (!dn.field_Db) {
              stackIn_33_0 = dk.field_k;
              if (var8 == 0) {
                stackIn_34_1 = ah.field_d;
              } else {
                stackIn_34_1 = fi.field_b;
              }
              stackIn_33_0.field_rb = ((String) (Object) stackIn_34_1).toUpperCase();
              stackIn_36_0 = vc.field_c;
              stackIn_36_1 = -96;
              stackIn_36_2 = new String[]{dk.field_k.field_rb};
              if (var8 == 0) {
                stackIn_37_3 = bi.field_W;
              } else {
                stackIn_37_3 = km.field_g;
              }
              stackIn_36_0.field_rb = tj.a(stackIn_36_1, stackIn_36_2, stackIn_37_3);
              jf.field_d.field_rb = me.field_R;
              mo.field_o.field_ub = true;
              bg.field_a = true;
              if (um.field_a != null) {
                if (qa.field_l == null) {
                  qa.field_l = new byte[vf.field_l];
                  tk.field_q = new boolean[vf.field_l];
                }
                bg.field_a = false;
                nb.field_d = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (vf.field_l > var13) {
                  tk.field_q[var13] = false;
                  var13++;
                }
                jm.a(-1, (byte) -25, true, om.field_x, -1, vf.field_l, -1, 0);
                if (!(qf.field_d < 2) &&
                  ri.field_b[12]) {
                  bg.field_a = true;
                }
              }
              if (!bg.field_a) {
                dk.field_k.field_ub = false;
                if (dk.field_k.field_A) {
                  var9 = null;
                  if (nb.field_d) {
                    var9 = "<col=A00000>" + w.field_Bb + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < vf.field_l; var10Lifetime1++) {
                    if (tk.field_q[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ob.field_bb[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  kh.field_c = "<col=A00000>" + nm.field_f + "<br>" + cd.field_s + (String) (var9);
                }
              }
            } else {
              mo.field_o.field_ub = false;
              vc.field_c.field_rb = j.field_e;
              if (var8 == 0) {
                stackIn_24_0 = ql.field_e;
              } else {
                stackIn_24_0 = bb.field_f;
              }
              var16 = stackIn_24_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = jf.field_d.field_Z.b(var16) + 3 * jf.field_d.field_Z.a('.');
              jf.field_d.field_X = 0;
              if (16 == (sb.field_e & 48)) {
                var9 = var16 + ".";
              }
              jf.field_d.field_t = (jf.field_d.field_x - var10Lifetime1) / 2;
              if ((sb.field_e & 48) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((sb.field_e & 48) == 48) {
                var9 = (String) (var9) + "...";
              }
              jf.field_d.field_rb = (String) (var9);
              dk.field_k.field_rb = sa.field_Eb.toUpperCase();
            }
          }
          stackIn_64_0 = hl.field_m;
          stackIn_65_1 = (param2) && (!param0) && (!so.field_j);
          ((kc) (Object) stackIn_64_0).b(stackIn_65_1, (byte) 33);
          stackIn_69_0 = oh.field_h;
          stackIn_70_1 = (param2) && (!param0) && (!so.field_j);
          ((kc) (Object) stackIn_69_0).b(stackIn_70_1, (byte) 90);
          stackIn_74_0 = nl.field_Fb;
          stackIn_75_1 = (param2) && (!param0) && (so.field_j);
          ((kc) (Object) stackIn_74_0).b(stackIn_75_1, (byte) 64);
          tn.field_Ob.field_c.h((byte) 101);
          if (null != om.field_x) {
            if (mo.field_o.field_U != 0) {
              bc.a(param1, -14431);
            }
            if (dk.field_k.field_U != 0) {
              if (!dn.field_Db) {
                fm.a(param1, true);
              } else {
                uc.a(param1, (byte) -96);
              }
            }
            lm.a(true, param1, om.field_x, 0);
          }
          if (param3 <= 105) {
            ng.a(false, -75L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ng.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        String discarded$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!param0) {
            discarded$1 = this.g(-67);
          }
          if (this.field_F == param4) {
            mo.g(-1);
            this.field_E.h(77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ng.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -120) {
            ng.a((byte) -91);
          }
          if (super.a(param0, (byte) -122, param2, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_8_0 = this.a(param0, 9555);
            return stackIn_8_0;
          }
          if (99 != param3) {
            return false;
          }
          stackIn_12_0 = this.b(2, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ng.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, ej param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (0 == param3) {
            uh.a(126, "terms.ws");
          } else {
            if (param3 != 1) {
              if (param3 == 2) {
                uh.a(127, "conduct.ws");
              }
            } else {
              uh.a(126, "privacy.ws");
            }
          }
          if (param2 != -1607) {
            this.field_J = (ej) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ng.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 96 % ((param0 + 43) / 49);
        field_I = null;
        field_H = null;
        field_D = null;
    }

    final static void a(boolean param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param1);
            if (!param0) {
              field_I = (aj) null;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ng(ie param0) {
        super(0, 0, 288, 0, (pf) null);
        String var7 = null;
        int var3 = 0;
        jm var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_E = param0;
          this.field_F = new ag(qn.field_lb, (wc) null);
          this.field_F.field_r = (pf) ((Object) new mm());
          var7 = tj.a(125, new String[]{this.g(-7), this.g((byte) 94)}, ud.field_r);
          var3 = 20;
          var4 = new jm(ia.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_c.field_C, -1, 2147483647, true);
          this.field_J = new ej(var7, var4);
          this.field_J.field_q = "";
          this.field_J.a(0, 0, mm.field_s);
          this.field_J.a(1, 0, mm.field_s);
          this.field_J.field_o = (wc) (this);
          this.field_J.field_v = -40 + this.field_v;
          this.field_J.a(26, (byte) -4, this.field_v - 40, var3);
          var3 = var3 + (this.field_J.field_k + 15);
          this.c(-111, this.field_J);
          var5 = 4;
          var6 = 200;
          this.field_F.a(40, var3, var6, 300 - var6 >> 1, -69);
          this.field_F.field_o = (wc) (this);
          this.c(-109, this.field_F);
          this.a(var5 + (var3 + 55), 0, 300, 0, -67);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(byte param0, int param1) {
        if (0 == param1) {
          return 12176339;
        }
        if (param1 == 1) {
          return 11731378;
        }
        int var2 = 18 / ((param0 - 8) / 44);
        if (param1 == 3) {
          return 12246236;
        }
        if (4 == param1) {
          return 14869724;
        }
        if (param1 == 5) {
          return 6716006;
        }
        if (param1 == 6) {
          return 17408;
        }
        if (param1 == 7) {
          return 9938607;
        }
        if (8 == param1) {
          return 13404415;
        }
        return 4227104;
    }

    static {
        field_H = "Accept unrated rematch";
        field_I = new aj(14, 0, 4, 1);
        field_K = 0;
    }
}
