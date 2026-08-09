/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends dqa implements ln, oo, jpb {
    private htb field_v;
    private kja field_w;
    private tga field_F;
    private tga field_A;
    private tga field_x;
    private tga field_y;
    static String field_G;
    rcb field_C;
    private tga field_D;
    private jla field_E;
    private htb field_B;
    private tga field_z;

    private final int a(int param0, String param1, int param2, String param3, int param4, shb param5) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -40) {
                break L1;
              } else {
                discarded$1 = this.d(45);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param5, param4, param2, param3, false, 35, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("rq.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(shb param0, int param1, String param2, int param3, byte param4) {
        sca var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new sca(20, param1, param3 + 120, 25, param0, false, 120, 3, loa.field_o, 16777215, param2);
              this.b(-18756, var6);
              if (param4 <= -27) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((byte) 37, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = var6.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("rq.R(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 11) {
              if (param3 == this.field_v) {
                to.e((byte) -77);
                return;
              } else {
                if (this.field_B == param3) {
                  discarded$1 = this.d(param0 + -7);
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("rq.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    private final boolean a(int param0, lca param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        qrb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(-782444220);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 22239) {
                var4 = var3.a((byte) 35);
                if (cca.field_o != var4) {
                  if (tg.field_p == var4) {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (mp.field_p != var4) {
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("rq.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L1;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  return stackIn_18_0 != 0;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_B.field_x = this.e(-122);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rq.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0) {
        if (!this.e(-119)) {
            return false;
        }
        int var2 = -1;
        if (param0 != 4) {
            return false;
        }
        try {
            var2 = Integer.parseInt(this.field_D.field_j);
        } catch (NumberFormatException numberFormatException) {
        }
        return ku.a(this.field_x.field_j, var2, (rq) (this), this.field_E.field_u, param0 + -3, this.field_F.field_j, this.field_z.field_j);
    }

    private final int a(int param0, shb param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        pla var7 = null;
        sca var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8 = new sca(20, param4, param0 + 120, 25, param1, false, 120, 3, loa.field_o, 16777215, param3);
              this.b(param2 + -18860, var8);
              var7 = new pla(((lca) ((Object) param1)).a(-782444220));
              this.b(-18756, var7);
              if (param2 == 104) {
                break L1;
              } else {
                field_G = (String) null;
                break L1;
              }
            }
            var7.a(var8.field_h + (var8.field_g - -3), 15, 15, param2 + -103, (var8.field_f + -15 >> -2037283519) + var8.field_r);
            stackIn_3_0 = var8.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("rq.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    public rq() {
        super(0, 0, 496, 0, (wwa) null);
        this.field_F = new tga("", (sba) null, 12);
        this.field_z = new tga("", (sba) null, 100);
        this.field_y = new tga("", (sba) null, 100);
        this.field_x = new tga("", (sba) null, 20);
        this.field_A = new tga("", (sba) null, 20);
        this.field_D = new tga("", (sba) null, 3);
        int var1 = 1;
        this.field_E = new jla("", (sba) null, var1 != 0);
        this.field_B = new htb(so.field_d, (sba) null);
        this.field_v = new htb(gsa.field_p, (sba) null);
        this.field_F.field_p = gna.field_m;
        this.field_z.field_p = lcb.field_s;
        this.field_y.field_p = dj.field_a;
        this.field_x.field_p = sha.field_x;
        this.field_A.field_p = knb.field_p;
        this.field_D.field_p = lq.field_j;
        this.field_E.field_p = jv.field_f;
        this.field_F.a(6614, new tib(this.field_F));
        this.field_z.a(6614, new rm(this.field_z));
        this.field_y.a(6614, new bla(this.field_y, this.field_z));
        this.field_x.a(6614, new ocb(this.field_x, this.field_F, this.field_z));
        this.field_A.a(6614, new vqa(this.field_A, this.field_x));
        this.field_D.a(6614, new wgb(this.field_D));
        this.field_B.field_x = false;
        this.field_B.field_q = (wwa) ((Object) new vva());
        this.field_v.field_q = (wwa) ((Object) new meb());
        this.field_F.field_q = (wwa) ((Object) new io(10000536));
        io dupTemp$0 = new io(10000536);
        this.field_y.field_q = (wwa) ((Object) dupTemp$0);
        this.field_z.field_q = (wwa) ((Object) dupTemp$0);
        this.field_D.field_q = (wwa) ((Object) new io(10000536));
        this.field_E.field_q = (wwa) ((Object) new dw());
        kpb dupTemp$1 = new kpb(10000536);
        this.field_A.field_q = (wwa) ((Object) dupTemp$1);
        this.field_x.field_q = (wwa) ((Object) dupTemp$1);
        String var2 = isa.a(vwa.field_o, new String[]{this.j((byte) 50), this.i((byte) -121)}, 109);
        int var3 = 20;
        var3 = var3 + this.a(this.field_z, var3, lbb.field_h, 170, (byte) -42);
        var3 = var3 + (5 + this.a(this.field_y, var3, 170, qs.field_b, false, 20, ""));
        var3 = var3 + this.a(this.field_x, var3, dpa.field_q, 170, (byte) -36);
        var3 = var3 + (this.a(-41, mmb.field_e, 170, lg.field_d, var3, this.field_A) + 5);
        var3 = var3 + (5 + this.a(-103, tj.field_r, 170, ffb.field_c, var3, this.field_F));
        var3 = var3 + this.a(170, this.field_D, (byte) 104, jja.field_a, var3);
        sca var4 = new sca(46, var3, -90 + this.field_h, 25, this.field_E, true, this.field_h - 120, 5, web.field_o, 11579568, shb.field_m);
        this.b(-18756, var4);
        var3 = var3 + var4.field_f;
        bob var5 = new bob(loa.field_o, 0, 0, 0, 0, 16777215, -1, 0, 0, loa.field_o.field_k, -1, 2147483647, true);
        this.field_w = new kja(var2, var5);
        this.field_w.field_p = "";
        this.field_w.a(0, -1, pma.field_q);
        this.field_w.a(1, -1, pma.field_q);
        this.field_w.field_l = (sba) (this);
        this.field_w.a(this.field_h - 90, var3, 46, (byte) -23);
        var3 = var3 + (15 + this.field_w.field_f);
        this.b(-18756, this.field_w);
        int var6 = 4;
        int var7 = 200;
        this.field_B.a(496 + -var7 >> -1997136831, var7, 40, 1, var3);
        this.field_v.a(3 + var6, 60, 40, 1, 15 + var3);
        this.field_v.field_l = (sba) (this);
        this.field_B.field_l = (sba) (this);
        this.b(-18756, this.field_B);
        this.b(-18756, this.field_v);
        this.field_C = new rcb((jpb) (this));
        this.field_C.a(60 + (this.field_F.field_h + this.field_F.field_g), -60 + (-this.field_F.field_h + this.field_h) + -this.field_F.field_g, 150, 1, 20 + this.field_F.field_r);
        this.b(-18756, this.field_C);
        this.a(0, 496, var3 + 55 + var6, 1, 0);
    }

    private final boolean e(int param0) {
        if (param0 < -57) {
          if (this.a(22239, (lca) (this.field_F))) {
            if (this.a(22239, (lca) (this.field_z))) {
              if (this.a(22239, (lca) (this.field_y))) {
                if (this.a(22239, (lca) (this.field_x))) {
                  if (this.a(22239, (lca) (this.field_A))) {
                    if (!this.a(22239, (lca) (this.field_D))) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_w = (kja) null;
          if (this.a(22239, (lca) (this.field_F))) {
            if (this.a(22239, (lca) (this.field_z))) {
              if (this.a(22239, (lca) (this.field_y))) {
                if (this.a(22239, (lca) (this.field_x))) {
                  if (this.a(22239, (lca) (this.field_A))) {
                    if (!this.a(22239, (lca) (this.field_D))) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final String i(byte param0) {
        if (param0 >= -97) {
            return (String) null;
        }
        return "</col></u>";
    }

    private final int a(shb param0, int param1, int param2, String param3, boolean param4, int param5, String param6) {
        RuntimeException var8 = null;
        gm var9 = null;
        sca var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new sca(20, param1, 120 + param2, 25, param0, param4, 120, 3, loa.field_o, 16777215, param3);
            this.b(-18756, var10);
            var9 = new gm(((lca) ((Object) param0)).a(-782444220), param6, 126, param1 - -var10.field_f, param2 + 50, param5);
            var9.field_l = (sba) (this);
            this.b(-18756, var9);
            stackIn_1_0 = var9.field_f + var10.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("rq.J(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if ((param1 ^ -1) == -99) {
                stackIn_6_0 = this.a(param2, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) != -100) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(true, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("rq.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, kja param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != (param2 ^ -1)) {
              if (param2 != 1) {
                if ((param2 ^ -1) == -3) {
                  vba.a(12, "conduct.ws");
                  break L0;
                } else {
                  return;
                }
              } else {
                vba.a(12, "privacy.ws");
                return;
              }
            } else {
              vba.a(12, "terms.ws");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("rq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final String j(byte param0) {
        if (param0 != 50) {
            this.field_v = (htb) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0) {
        if (param0 != 1546) {
            return;
        }
        ((tib) ((Object) this.field_F.a(param0 ^ -782442674))).d((byte) 38);
    }

    public static void f(int param0) {
        int var1 = 67 / ((-47 - param0) / 56);
        field_G = null;
    }

    public final void a(byte param0, String param1) {
        String var4 = null;
        tga var3 = this.field_F;
        if (param0 != 41) {
            return;
        }
        try {
            var4 = param1;
            ((uf) ((Object) var3)).a(false, 0, var4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Scamming";
    }
}
