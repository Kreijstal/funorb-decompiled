/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends b implements tma, tsa, mia {
    private so field_E;
    private jla field_D;
    private so field_I;
    private rj field_B;
    private rj field_F;
    private lga field_A;
    private so field_z;
    laa field_y;
    private so field_G;
    static w field_w;
    private so field_J;
    private so field_C;
    static String field_H;
    static String[] field_x;

    public final void a(lga param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        lga var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == 30846) {
              break L0;
            } else {
              var7 = (lga) null;
              this.a((lga) null, -41, 57, 20);
              break L0;
            }
          }
          if (param1 == 0) {
            gva.a("terms.ws", (byte) -25);
            return;
          } else {
            if (param1 == 1) {
              gva.a("privacy.ws", (byte) -109);
              return;
            } else {
              if ((param1 ^ -1) == -3) {
                gva.a("conduct.ws", (byte) -43);
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("mr.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(ae param0, int param1, int param2, byte param3, String param4) {
        jsa var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new jsa(20, param1, param2 + 120, 25, param0, false, 120, 3, mj.field_J, 16777215, param4);
            this.a(var6, -1);
            if (param3 >= 33) {
              stackIn_4_0 = var6.field_p;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 97;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("mr.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean c(int param0) {
        if (!(this.g(param0 ^ -1878))) {
            return false;
        }
        int var2 = param0;
        try {
            var2 = Integer.parseInt(this.field_I.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return qt.a(this.field_G.field_o, true, var2, this.field_z.field_o, this.field_E.field_o, (mr) (this), this.field_D.field_w);
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float stackIn_3_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_11_0 = 0.0f;
        float var4;
        float var5;
        float var6;
        L0: {
          if (0.0f <= param3) {
            stackIn_3_0 = param3;
            break L0;
          } else {
            stackIn_3_0 = -param3;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (!param2) {
            break L1;
          } else {
            mr.f(-14);
            break L1;
          }
        }
        L2: {
          if (param1 < 0.0f) {
            stackIn_8_0 = -param1;
            break L2;
          } else {
            stackIn_8_0 = param1;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_8_0;
          if (0.0f > param0) {
            stackIn_11_0 = -param0;
            break L3;
          } else {
            stackIn_11_0 = param0;
            break L3;
          }
        }
        var6 = stackIn_11_0;
        if (var4 < var5) {
          if (var5 > var6) {
            if (param1 > 0.0f) {
              return 0;
            } else {
              return 1;
            }
          } else {
            if (var6 <= var4) {
              if (0.0f < param3) {
                return 4;
              } else {
                return 5;
              }
            } else {
              if (var6 > var5) {
                if (param0 > 0.0f) {
                  return 2;
                } else {
                  return 3;
                }
              } else {
                if (0.0f < param3) {
                  return 4;
                } else {
                  return 5;
                }
              }
            }
          }
        } else {
          if (var6 <= var4) {
            if (0.0f < param3) {
              return 4;
            } else {
              return 5;
            }
          } else {
            if (var6 > var5) {
              if (param0 > 0.0f) {
                return 2;
              } else {
                return 3;
              }
            } else {
              if (0.0f < param3) {
                return 4;
              } else {
                return 5;
              }
            }
          }
        }
    }

    public mr() {
        super(0, 0, 496, 0, (isa) null);
        this.field_G = new so("", (qc) null, 12);
        this.field_z = new so("", (qc) null, 100);
        this.field_J = new so("", (qc) null, 100);
        this.field_E = new so("", (qc) null, 20);
        this.field_C = new so("", (qc) null, 20);
        this.field_I = new so("", (qc) null, 3);
        int var1 = 1;
        this.field_D = new jla("", (qc) null, var1 != 0);
        this.field_F = new rj(sla.field_c, (qc) null);
        this.field_B = new rj(kda.field_gd, (qc) null);
        this.field_G.field_q = rma.field_a;
        this.field_z.field_q = ema.field_a;
        this.field_J.field_q = ju.field_a;
        this.field_E.field_q = me.field_f;
        this.field_C.field_q = df.field_G;
        this.field_I.field_q = dta.field_e;
        this.field_D.field_q = vf.field_e;
        this.field_G.a(-13861, new tf(this.field_G));
        this.field_z.a(-13861, new hqa(this.field_z));
        this.field_J.a(-13861, new mn(this.field_J, this.field_z));
        this.field_E.a(-13861, new jm(this.field_E, this.field_G, this.field_z));
        this.field_C.a(-13861, new oe(this.field_C, this.field_E));
        this.field_I.a(-13861, new jba(this.field_I));
        this.field_F.field_y = false;
        this.field_F.field_r = (isa) ((Object) new td());
        this.field_B.field_r = (isa) ((Object) new kaa());
        this.field_G.field_r = (isa) ((Object) new hga(10000536));
        hga dupTemp$0 = new hga(10000536);
        this.field_J.field_r = (isa) ((Object) dupTemp$0);
        this.field_z.field_r = (isa) ((Object) dupTemp$0);
        this.field_I.field_r = (isa) ((Object) new hga(10000536));
        this.field_D.field_r = (isa) ((Object) new ee());
        poa dupTemp$1 = new poa(10000536);
        this.field_C.field_r = (isa) ((Object) dupTemp$1);
        this.field_E.field_r = (isa) ((Object) dupTemp$1);
        String var2 = gl.a((byte) 90, uqa.field_y, new String[]{this.d(170), this.e(127)});
        int var3 = 20;
        var3 = var3 + this.a(this.field_z, var3, 170, (byte) 74, em.field_f);
        var3 = var3 + (this.a(var3, 77, this.field_J, 170, 20, "", ct.field_d) + 5);
        var3 = var3 + this.a(this.field_E, var3, 170, (byte) 59, rta.field_j);
        var3 = var3 + (this.a(gea.field_c, gt.field_d, this.field_C, -3, 170, var3) + 5);
        var3 = var3 + (this.a(rea.field_r, za.field_f, this.field_G, -3, 170, var3) + 5);
        var3 = var3 + this.a(this.field_I, var3, (byte) 99, iqa.field_g, 170);
        jsa var4 = new jsa(46, var3, this.field_m + -90, 25, this.field_D, true, this.field_m + -120, 5, eka.field_o, 11579568, jja.field_l);
        this.a(var4, -1);
        var3 = var3 + var4.field_p;
        vpa var5 = new vpa(mj.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, mj.field_J.field_w, -1, 2147483647, true);
        this.field_A = new lga(var2, var5);
        this.field_A.field_q = "";
        this.field_A.a(sw.field_Fb, 0, 0);
        this.field_A.a(sw.field_Fb, 1, 0);
        this.field_A.field_h = (qc) (this);
        this.field_A.a(var3, (byte) -120, -90 + this.field_m, 46);
        var3 = var3 + (this.field_A.field_p - -15);
        this.a(this.field_A, -1);
        int var6 = 4;
        int var7 = 200;
        this.field_F.a((byte) -31, var7, 40, -var7 + 496 >> 1689603105, var3);
        this.field_B.a((byte) -31, 60, 40, var6 - -3, 15 + var3);
        this.field_B.field_h = (qc) (this);
        this.field_F.field_h = (qc) (this);
        this.a(this.field_F, -1);
        this.a(this.field_B, -1);
        this.field_y = new laa((mia) (this));
        this.field_y.a((byte) -31, -60 + -this.field_G.field_m + -this.field_G.field_i + this.field_m, 150, 60 + (this.field_G.field_m + this.field_G.field_i), this.field_G.field_n + 20);
        this.a(this.field_y, -1);
        this.a((byte) -31, 496, var6 + 55 + var3, 0, 0);
    }

    public final void a(int param0) {
        ((tf) ((Object) this.field_G.a((byte) 69))).b((byte) -69);
        if (param0 != 10000536) {
            this.field_E = (so) null;
        }
    }

    private final int a(int param0, int param1, ae param2, int param3, int param4, String param5, String param6) {
        RuntimeException var8 = null;
        sd var9 = null;
        jsa var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new jsa(20, param0, param3 + 120, 25, param2, false, 120, 3, mj.field_J, 16777215, param6);
            this.a(var10, -1);
            var9 = new sd(((mk) ((Object) param2)).a((byte) 120), param5, 126, var10.field_p + param0, param3 - -50, param4);
            var9.field_h = (qc) (this);
            this.a(var9, -1);
            if (param1 >= 66) {
              stackIn_4_0 = var9.field_p + var10.field_p;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 37;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("mr.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if ((param2 ^ -1) != -99) {
                if ((param2 ^ -1) == -100) {
                  stackIn_9_0 = this.a(param1, (byte) -9);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.b(param1, (byte) -79);
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("mr.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    private final String d(int param0) {
        if (param0 != 170) {
            ae var3 = (ae) null;
            this.a(27, -27, (ae) null, -94);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean g(int param0) {
        if (this.a((byte) -10, this.field_G)) {
          if (this.a((byte) -10, this.field_z)) {
            if (this.a((byte) -10, this.field_J)) {
              if (this.a((byte) -10, this.field_E)) {
                if (this.a((byte) -10, this.field_C)) {
                  if (this.a((byte) -10, this.field_I)) {
                    if (param0 != 1877) {
                      this.field_E = (so) null;
                      return true;
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
          return false;
        }
    }

    private final boolean a(byte param0, mk param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        it var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -10) {
              var3 = param1.a((byte) 127);
              if (var3 != null) {
                var4 = var3.b(param0 ^ 4656);
                if (var4 != fp.field_c) {
                  if (gla.field_p == var4) {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (fk.field_d != var4) {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_15_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
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
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("mr.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L1;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0 != 0;
                } else {
                  return stackIn_17_0 != 0;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_F.field_y = this.g(param1 + -2095275);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mr.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        so var3 = null;
        String var4 = null;
        try {
            var3 = this.field_G;
            var4 = param0;
            if (param1 <= 18) {
                this.field_A = (lga) null;
            }
            ((tra) ((Object) var3)).a(false, -16719, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          mr.a((byte) 10);
          field_w = null;
          field_H = null;
          field_x = null;
          return;
        } else {
          field_w = null;
          field_H = null;
          field_x = null;
          return;
        }
    }

    private final String e(int param0) {
        int var2 = 105 % ((param0 - 83) / 38);
        return "</col></u>";
    }

    private final int a(String param0, String param1, ae param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        lga var8 = null;
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
              if (param3 == -3) {
                break L1;
              } else {
                var8 = (lga) null;
                this.a((lga) null, -33, -81, -72);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param5, param3 + 112, param2, param4, 35, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("mr.N(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static roa a(byte param0) {
        roa var1;
        var1 = new roa();
        if (param0 <= 123) {
          mr.a(-0.43077895045280457f, 0.6055110096931458f, true, 1.4660576581954956f);
          var1.field_f = new up(1, 3);
          var1.field_f.b(1, 12);
          var1.field_n = 655360;
          var1.field_p = 250;
          var1.field_k = 12;
          var1.field_b = 3;
          var1.field_y = false;
          var1.field_h = 2;
          var1.field_a = 524288;
          var1.field_s = 1024;
          var1.field_d = 2;
          var1.field_l = 2097152;
          return var1;
        } else {
          var1.field_f = new up(1, 3);
          var1.field_f.b(1, 12);
          var1.field_n = 655360;
          var1.field_p = 250;
          var1.field_k = 12;
          var1.field_b = 3;
          var1.field_y = false;
          var1.field_h = 2;
          var1.field_a = 524288;
          var1.field_s = 1024;
          var1.field_d = 2;
          var1.field_l = 2097152;
          return var1;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        boolean discarded$0 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_B == param2) {
                gqa.a((byte) 70);
                break L1;
              } else {
                if (param2 != this.field_F) {
                  break L1;
                } else {
                  discarded$0 = this.c(-1);
                  break L1;
                }
              }
            }
            if (param4 > 44) {
              break L0;
            } else {
              this.field_J = (so) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("mr.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(ae param0, int param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        mha var7 = null;
        jsa var8 = null;
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
              var8 = new jsa(20, param1, 120 - -param4, 25, param0, false, 120, 3, mj.field_J, 16777215, param3);
              this.a(var8, -1);
              if (param2 >= 51) {
                break L1;
              } else {
                field_w = (w) null;
                break L1;
              }
            }
            var7 = new mha(((mk) ((Object) param0)).a((byte) 106));
            this.a(var7, -1);
            var7.a((byte) -31, 15, 15, 3 + (var8.field_m + var8.field_i), var8.field_n + (var8.field_p - 15 >> 1729361313));
            stackIn_3_0 = var8.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("mr.AA(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_H = "Creep carefully over snakes.";
        field_x = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
