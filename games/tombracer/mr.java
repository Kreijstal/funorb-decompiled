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
        int var6 = 0;
        Object var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 == 30846) {
          if (param1 != 0) {
            if (param1 != 1) {
              if ((param1 ^ -1) != -3) {
                return;
              } else {
                gva.a("conduct.ws", (byte) -43);
                return;
              }
            } else {
              gva.a("privacy.ws", (byte) -109);
              return;
            }
          } else {
            gva.a("terms.ws", (byte) -25);
            return;
          }
        } else {
          var7 = null;
          ((mr) this).a((lga) null, -41, 57, 20);
          if (param1 != 0) {
            if (param1 != 1) {
              if ((param1 ^ -1) != -3) {
                return;
              } else {
                gva.a("conduct.ws", (byte) -43);
                return;
              }
            } else {
              gva.a("privacy.ws", (byte) -109);
              return;
            }
          } else {
            gva.a("terms.ws", (byte) -25);
            return;
          }
        }
    }

    private final int a(ae param0, int param1, int param2, byte param3, String param4) {
        jsa var6 = null;
        var6 = new jsa(20, param1, param2 + 120, 25, param0, false, 120, 3, mj.field_J, 16777215, param4);
        ((mr) this).a((ae) (Object) var6, -1);
        if (param3 < 33) {
          return 97;
        } else {
          return var6.field_p;
        }
    }

    private final boolean c(int param0) {
        if (!(this.g(param0 ^ -1878))) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((mr) this).field_I.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return qt.a(((mr) this).field_G.field_o, true, var2, ((mr) this).field_z.field_o, ((mr) this).field_E.field_o, (mr) this, ((mr) this).field_D.field_w);
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float stackIn_3_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_11_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        float stackOut_1_0 = 0.0f;
        float stackOut_7_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_9_0 = 0.0f;
        L0: {
          if (0.0f <= param3) {
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -param3;
            stackIn_3_0 = stackOut_1_0;
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
            stackOut_7_0 = -param1;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = param1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_8_0;
          if (0.0f > param0) {
            stackOut_10_0 = -param0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = param0;
            stackIn_11_0 = stackOut_9_0;
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
        ((mr) this).field_G = new so("", (qc) null, 12);
        ((mr) this).field_z = new so("", (qc) null, 100);
        ((mr) this).field_J = new so("", (qc) null, 100);
        ((mr) this).field_E = new so("", (qc) null, 20);
        ((mr) this).field_C = new so("", (qc) null, 20);
        ((mr) this).field_I = new so("", (qc) null, 3);
        int var1 = 1;
        ((mr) this).field_D = new jla("", (qc) null, var1 != 0);
        ((mr) this).field_F = new rj(sla.field_c, (qc) null);
        ((mr) this).field_B = new rj(kda.field_gd, (qc) null);
        ((mr) this).field_G.field_q = rma.field_a;
        ((mr) this).field_z.field_q = ema.field_a;
        ((mr) this).field_J.field_q = ju.field_a;
        ((mr) this).field_E.field_q = me.field_f;
        ((mr) this).field_C.field_q = df.field_G;
        ((mr) this).field_I.field_q = dta.field_e;
        ((mr) this).field_D.field_q = vf.field_e;
        ((mr) this).field_G.a(-13861, (nua) (Object) new tf((tra) (Object) ((mr) this).field_G));
        ((mr) this).field_z.a(-13861, (nua) (Object) new hqa((tra) (Object) ((mr) this).field_z));
        ((mr) this).field_J.a(-13861, (nua) (Object) new mn((tra) (Object) ((mr) this).field_J, (tra) (Object) ((mr) this).field_z));
        ((mr) this).field_E.a(-13861, (nua) (Object) new jm((tra) (Object) ((mr) this).field_E, (tra) (Object) ((mr) this).field_G, (tra) (Object) ((mr) this).field_z));
        ((mr) this).field_C.a(-13861, (nua) (Object) new oe((tra) (Object) ((mr) this).field_C, (tra) (Object) ((mr) this).field_E));
        ((mr) this).field_I.a(-13861, (nua) (Object) new jba((tra) (Object) ((mr) this).field_I));
        ((mr) this).field_F.field_y = false;
        ((mr) this).field_F.field_r = (isa) (Object) new td();
        ((mr) this).field_B.field_r = (isa) (Object) new kaa();
        ((mr) this).field_G.field_r = (isa) (Object) new hga(10000536);
        ((mr) this).field_J.field_r = (isa) (Object) new hga(10000536);
        ((mr) this).field_z.field_r = (isa) (Object) new hga(10000536);
        ((mr) this).field_I.field_r = (isa) (Object) new hga(10000536);
        ((mr) this).field_D.field_r = (isa) (Object) new ee();
        ((mr) this).field_C.field_r = (isa) (Object) new poa(10000536);
        ((mr) this).field_E.field_r = (isa) (Object) new poa(10000536);
        String var2 = gl.a((byte) 90, uqa.field_y, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a((ae) (Object) ((mr) this).field_z, var3, 170, (byte) 74, em.field_f);
        var3 = var3 + (this.a(var3, 77, (ae) (Object) ((mr) this).field_J, 170, 20, "", ct.field_d) + 5);
        var3 = var3 + this.a((ae) (Object) ((mr) this).field_E, var3, 170, (byte) 59, rta.field_j);
        var3 = var3 + (this.a(gea.field_c, gt.field_d, (ae) (Object) ((mr) this).field_C, -3, 170, var3) + 5);
        var3 = var3 + (this.a(rea.field_r, za.field_f, (ae) (Object) ((mr) this).field_G, -3, 170, var3) + 5);
        var3 = var3 + this.a((ae) (Object) ((mr) this).field_I, var3, (byte) 99, iqa.field_g, 170);
        jsa var4 = new jsa(46, var3, ((mr) this).field_m + -90, 25, (ae) (Object) ((mr) this).field_D, true, ((mr) this).field_m + -120, 5, eka.field_o, 11579568, jja.field_l);
        ((mr) this).a((ae) (Object) var4, -1);
        var3 = var3 + var4.field_p;
        vpa var5 = new vpa(mj.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, mj.field_J.field_w, -1, 2147483647, true);
        ((mr) this).field_A = new lga(var2, (isa) (Object) var5);
        ((mr) this).field_A.field_q = "";
        ((mr) this).field_A.a(sw.field_Fb, 0, 0);
        ((mr) this).field_A.a(sw.field_Fb, 1, 0);
        ((mr) this).field_A.field_h = (qc) this;
        ((mr) this).field_A.a(var3, (byte) -120, -90 + ((mr) this).field_m, 46);
        var3 = var3 + (((mr) this).field_A.field_p - -15);
        ((mr) this).a((ae) (Object) ((mr) this).field_A, -1);
        int var6 = 4;
        int var7 = 200;
        ((mr) this).field_F.a((byte) -31, var7, 40, -var7 + 496 >> 1689603105, var3);
        ((mr) this).field_B.a((byte) -31, 60, 40, var6 - -3, 15 + var3);
        ((mr) this).field_B.field_h = (qc) this;
        ((mr) this).field_F.field_h = (qc) this;
        ((mr) this).a((ae) (Object) ((mr) this).field_F, -1);
        ((mr) this).a((ae) (Object) ((mr) this).field_B, -1);
        ((mr) this).field_y = new laa((mia) this);
        ((mr) this).field_y.a((byte) -31, -60 + -((mr) this).field_G.field_m + -((mr) this).field_G.field_i + ((mr) this).field_m, 150, 60 + (((mr) this).field_G.field_m + ((mr) this).field_G.field_i), ((mr) this).field_G.field_n + 20);
        ((mr) this).a((ae) (Object) ((mr) this).field_y, -1);
        ((mr) this).a((byte) -31, 496, var6 + 55 + var3, 0, 0);
    }

    public final void a(int param0) {
        ((tf) (Object) ((mr) this).field_G.a((byte) 69)).b((byte) -69);
        if (param0 != 10000536) {
            ((mr) this).field_E = null;
        }
    }

    private final int a(int param0, int param1, ae param2, int param3, int param4, String param5, String param6) {
        sd var9 = null;
        jsa var10 = null;
        var10 = new jsa(20, param0, param3 + 120, 25, param2, false, 120, 3, mj.field_J, 16777215, param6);
        ((mr) this).a((ae) (Object) var10, -1);
        var9 = new sd(((mk) (Object) param2).a((byte) 120), param5, 126, var10.field_p + param0, param3 - -50, param4);
        var9.field_h = (qc) this;
        ((mr) this).a((ae) (Object) var9, -1);
        if (param1 < 66) {
          return 37;
        } else {
          return var9.field_p + var10.field_p;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param2 ^ -1) != -99) {
            if ((param2 ^ -1) != -100) {
              return false;
            } else {
              return ((mr) this).a(param1, (byte) -9);
            }
          } else {
            return ((mr) this).b(param1, (byte) -79);
          }
        } else {
          return true;
        }
    }

    private final String d(int param0) {
        if (param0 != 170) {
            Object var3 = null;
            ((mr) this).a(27, -27, (ae) null, -94);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean g(int param0) {
        if (this.a((byte) -10, (mk) (Object) ((mr) this).field_G)) {
          if (this.a((byte) -10, (mk) (Object) ((mr) this).field_z)) {
            if (this.a((byte) -10, (mk) (Object) ((mr) this).field_J)) {
              if (this.a((byte) -10, (mk) (Object) ((mr) this).field_E)) {
                if (this.a((byte) -10, (mk) (Object) ((mr) this).field_C)) {
                  if (this.a((byte) -10, (mk) (Object) ((mr) this).field_I)) {
                    if (param0 != 1877) {
                      ((mr) this).field_E = null;
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
        it var4 = null;
        if (param0 == -10) {
          var3 = param1.a((byte) 127);
          if (var3 != null) {
            var4 = var3.b(param0 ^ 4656);
            if (var4 != fp.field_c) {
              if (gla.field_p == var4) {
                return false;
              } else {
                if (fk.field_d == var4) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((mr) this).field_F.field_y = this.g(param1 + -2095275);
    }

    public final void a(String param0, int param1) {
        so var3 = null;
        String var4 = null;
        var3 = ((mr) this).field_G;
        var4 = param0;
        if (param1 <= 18) {
          ((mr) this).field_A = null;
          ((tra) (Object) var3).a(false, -16719, var4);
          return;
        } else {
          ((tra) (Object) var3).a(false, -16719, var4);
          return;
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          roa discarded$2 = mr.a((byte) 10);
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
        Object var8 = null;
        if (param3 != -3) {
          var8 = null;
          ((mr) this).a((lga) null, -33, -81, -72);
          return this.a(param5, param3 + 112, param2, param4, 35, param1, param0);
        } else {
          return this.a(param5, param3 + 112, param2, param4, 35, param1, param0);
        }
    }

    final static roa a(byte param0) {
        roa var1 = null;
        var1 = new roa();
        if (param0 <= 123) {
          int discarded$1 = mr.a(-0.43077895045280457f, 0.6055110096931458f, true, 1.4660576581954956f);
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
        if (((mr) this).field_B == param2) {
          gqa.a((byte) 70);
          if (param4 > 44) {
            return;
          } else {
            ((mr) this).field_J = null;
            return;
          }
        } else {
          if (param2 != ((mr) this).field_F) {
            if (param4 <= 44) {
              ((mr) this).field_J = null;
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.c(-1);
            if (param4 > 44) {
              return;
            } else {
              ((mr) this).field_J = null;
              return;
            }
          }
        }
    }

    private final int a(ae param0, int param1, byte param2, String param3, int param4) {
        mha var7 = null;
        jsa var8 = null;
        var8 = new jsa(20, param1, 120 - -param4, 25, param0, false, 120, 3, mj.field_J, 16777215, param3);
        ((mr) this).a((ae) (Object) var8, -1);
        if (param2 < 51) {
          field_w = null;
          var7 = new mha(((mk) (Object) param0).a((byte) 106));
          ((mr) this).a((ae) (Object) var7, -1);
          var7.a((byte) -31, 15, 15, 3 + (var8.field_m + var8.field_i), var8.field_n + (var8.field_p - 15 >> 1729361313));
          return var8.field_p;
        } else {
          var7 = new mha(((mk) (Object) param0).a((byte) 106));
          ((mr) this).a((ae) (Object) var7, -1);
          var7.a((byte) -31, 15, 15, 3 + (var8.field_m + var8.field_i), var8.field_n + (var8.field_p - 15 >> 1729361313));
          return var8.field_p;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Creep carefully over snakes.";
        field_x = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
