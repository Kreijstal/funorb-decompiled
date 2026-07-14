/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tha extends b implements tsa {
    static String field_A;
    static String field_B;
    private rj field_x;
    private rj field_z;
    private rj field_w;
    static String field_y;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((tha) this).field_i - -param0;
        int var6 = param1 + ((tha) this).field_n;
        int discarded$0 = mj.field_J.a(bb.field_q, var5 - -20, 20 + var6, -40 + ((tha) this).field_m, -50 + ((tha) this).field_p, 16777215, -1, 1, param2, mj.field_J.field_w);
        super.a(param0, param1, 0, param3);
    }

    final static void a(int param0) {
        double var1 = 0.0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        if (cla.field_m == null) {
          cla.field_m = new int[65536];
          var1 = 0.7 + (Math.random() * 0.03 - 0.015);
          var3 = 0;
          if (param0 != 906) {
            field_y = null;
            L0: while (true) {
              if (-65537 < (var3 ^ -1)) {
                var4 = (double)(63 & var3 >> 606609290) / 64.0 + 0.0078125;
                var6 = 0.0625 + (double)((var3 & 906) >> -1180551865) / 8.0;
                var8 = (double)(127 & var3) / 128.0;
                var10 = var8;
                var12 = var8;
                var14 = var8;
                if (var6 != 0.0) {
                  L1: {
                    if (var8 >= 0.5) {
                      var16_double = -(var8 * var6) + (var6 + var8);
                      break L1;
                    } else {
                      var16_double = (1.0 + var6) * var8;
                      break L1;
                    }
                  }
                  L2: {
                    var18_double = 2.0 * var8 - var16_double;
                    var20 = var4 + 0.3333333333333333;
                    if (var20 > 1.0) {
                      var20 = var20 - 1.0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var22 = var4;
                    var24 = -0.3333333333333333 + var4;
                    if (var24 < 0.0) {
                      var24 = var24 + 1.0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (1.0 <= var22 * 6.0) {
                      if (1.0 <= 2.0 * var22) {
                        if (2.0 <= 3.0 * var22) {
                          var12 = var18_double;
                          break L4;
                        } else {
                          var12 = var18_double + 6.0 * ((-var22 + 0.6666666666666666) * (var16_double - var18_double));
                          break L4;
                        }
                      } else {
                        var12 = var16_double;
                        break L4;
                      }
                    } else {
                      var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                      break L4;
                    }
                  }
                  L5: {
                    if (1.0 <= var20 * 6.0) {
                      if (1.0 <= var20 * 2.0) {
                        if (3.0 * var20 >= 2.0) {
                          var10 = var18_double;
                          break L5;
                        } else {
                          var10 = 6.0 * ((0.6666666666666666 - var20) * (-var18_double + var16_double)) + var18_double;
                          break L5;
                        }
                      } else {
                        var10 = var16_double;
                        break L5;
                      }
                    } else {
                      var10 = var18_double + (-var18_double + var16_double) * 6.0 * var20;
                      break L5;
                    }
                  }
                  L6: {
                    if (1.0 <= var24 * 6.0) {
                      if (1.0 > var24 * 2.0) {
                        var14 = var16_double;
                        break L6;
                      } else {
                        if (2.0 > 3.0 * var24) {
                          var14 = (-var18_double + var16_double) * (0.6666666666666666 - var24) * 6.0 + var18_double;
                          break L6;
                        } else {
                          var14 = var18_double;
                          break L6;
                        }
                      }
                    } else {
                      var14 = (var16_double - var18_double) * 6.0 * var24 + var18_double;
                      break L6;
                    }
                  }
                  var10 = Math.pow(var10, var1);
                  var12 = Math.pow(var12, var1);
                  var14 = Math.pow(var14, var1);
                  var16 = (int)(256.0 * var10);
                  var17 = (int)(var12 * 256.0);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var17 << -2052617368) + (var16 << -871645136) - -var18;
                  cla.field_m[var3] = var19;
                  var3++;
                  continue L0;
                } else {
                  var10 = Math.pow(var10, var1);
                  var12 = Math.pow(var12, var1);
                  var14 = Math.pow(var14, var1);
                  var16 = (int)(256.0 * var10);
                  var17 = (int)(var12 * 256.0);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var17 << -2052617368) + (var16 << -871645136) - -var18;
                  cla.field_m[var3] = var19;
                  var3++;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            L7: while (true) {
              if (-65537 < (var3 ^ -1)) {
                var4 = (double)(63 & var3 >> 606609290) / 64.0 + 0.0078125;
                var6 = 0.0625 + (double)((var3 & 906) >> -1180551865) / 8.0;
                var8 = (double)(127 & var3) / 128.0;
                var10 = var8;
                var12 = var8;
                var14 = var8;
                if (var6 != 0.0) {
                  L8: {
                    if (var8 >= 0.5) {
                      var16_double = -(var8 * var6) + (var6 + var8);
                      break L8;
                    } else {
                      var16_double = (1.0 + var6) * var8;
                      break L8;
                    }
                  }
                  L9: {
                    var18_double = 2.0 * var8 - var16_double;
                    var20 = var4 + 0.3333333333333333;
                    if (var20 > 1.0) {
                      var20 = var20 - 1.0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    var22 = var4;
                    var24 = -0.3333333333333333 + var4;
                    if (var24 < 0.0) {
                      var24 = var24 + 1.0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (1.0 <= var22 * 6.0) {
                      if (1.0 <= 2.0 * var22) {
                        if (2.0 <= 3.0 * var22) {
                          var12 = var18_double;
                          break L11;
                        } else {
                          var12 = var18_double + 6.0 * ((-var22 + 0.6666666666666666) * (var16_double - var18_double));
                          break L11;
                        }
                      } else {
                        var12 = var16_double;
                        break L11;
                      }
                    } else {
                      var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                      break L11;
                    }
                  }
                  L12: {
                    if (1.0 <= var20 * 6.0) {
                      if (1.0 <= var20 * 2.0) {
                        if (3.0 * var20 >= 2.0) {
                          var10 = var18_double;
                          break L12;
                        } else {
                          var10 = 6.0 * ((0.6666666666666666 - var20) * (-var18_double + var16_double)) + var18_double;
                          break L12;
                        }
                      } else {
                        var10 = var16_double;
                        break L12;
                      }
                    } else {
                      var10 = var18_double + (-var18_double + var16_double) * 6.0 * var20;
                      break L12;
                    }
                  }
                  L13: {
                    if (1.0 <= var24 * 6.0) {
                      if (1.0 > var24 * 2.0) {
                        var14 = var16_double;
                        break L13;
                      } else {
                        if (2.0 > 3.0 * var24) {
                          var14 = (-var18_double + var16_double) * (0.6666666666666666 - var24) * 6.0 + var18_double;
                          break L13;
                        } else {
                          var14 = var18_double;
                          break L13;
                        }
                      }
                    } else {
                      var14 = (var16_double - var18_double) * 6.0 * var24 + var18_double;
                      break L13;
                    }
                  }
                  var10 = Math.pow(var10, var1);
                  var12 = Math.pow(var12, var1);
                  var14 = Math.pow(var14, var1);
                  var16 = (int)(256.0 * var10);
                  var17 = (int)(var12 * 256.0);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var17 << -2052617368) + (var16 << -871645136) - -var18;
                  cla.field_m[var3] = var19;
                  var3++;
                  continue L7;
                } else {
                  var10 = Math.pow(var10, var1);
                  var12 = Math.pow(var12, var1);
                  var14 = Math.pow(var14, var1);
                  var16 = (int)(256.0 * var10);
                  var17 = (int)(var12 * 256.0);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var17 << -2052617368) + (var16 << -871645136) - -var18;
                  cla.field_m[var3] = var19;
                  var3++;
                  continue L7;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public tha() {
        super(0, 0, 476, 225, (isa) null);
        ((tha) this).field_z = new rj(foa.field_a, (qc) null);
        ((tha) this).field_w = new rj(kda.field_gd, (qc) null);
        ((tha) this).field_x = new rj(fca.field_d, (qc) null);
        td var1 = new td();
        ((tha) this).field_z.field_r = (isa) (Object) var1;
        ((tha) this).field_w.field_r = (isa) (Object) var1;
        ((tha) this).field_x.field_r = (isa) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1445643489;
        ((tha) this).field_w.a((byte) -31, var4, 30, ((tha) this).field_m + -var3 >> -969403679, -var2 + (((tha) this).field_p + -48));
        ((tha) this).field_x.a((byte) -31, var4, 30, var4 + (-var3 + ((tha) this).field_m >> -240427839) + var2, -var2 + ((tha) this).field_p - 48);
        ((tha) this).field_z.a((byte) -31, var3, 30, ((tha) this).field_m - var3 >> 231575233, ((tha) this).field_p + (-78 + -(var2 * 2)));
        ((tha) this).field_w.field_h = (qc) this;
        ((tha) this).field_z.field_h = (qc) this;
        ((tha) this).field_z.field_q = hga.field_n;
        ((tha) this).field_x.field_h = (qc) this;
        ((tha) this).field_x.field_q = tg.field_a;
        ((tha) this).a((ae) (Object) ((tha) this).field_w, -1);
        ((tha) this).a((ae) (Object) ((tha) this).field_z, -1);
        ((tha) this).a((ae) (Object) ((tha) this).field_x, -1);
    }

    public static void c(int param0) {
        int var1 = -116 % ((43 - param0) / 38);
        field_y = null;
        field_B = null;
        field_A = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param4 < 44) {
            tha.a(-94);
            if (param2 == ((tha) this).field_w) {
                pn.f(-804227775);
            } else {
                if (((tha) this).field_z == param2) {
                    qfa.a((byte) 6);
                    return;
                }
                if (((tha) this).field_x == param2) {
                    aoa.b(true);
                    return;
                }
                return;
            }
            return;
        }
        if (param2 == ((tha) this).field_w) {
            pn.f(-804227775);
        } else {
            if (((tha) this).field_z == param2) {
                qfa.a((byte) 6);
                return;
            }
            if (((tha) this).field_x != param2) {
                return;
            }
            aoa.b(true);
            return;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (param2 != 98) {
            if (param2 == 99) {
              return ((tha) this).a(param1, (byte) -9);
            } else {
              return false;
            }
          } else {
            return ((tha) this).b(param1, (byte) -118);
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "All games";
        field_y = "Machinegun";
        field_A = "You have died - but death is not the end. The room's traps will be reset and you'll start again from the entrance. You'll lose any treasure not yet banked.";
    }
}
