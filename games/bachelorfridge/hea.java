/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hea extends td {
    static du field_p;
    static String field_s;
    static int field_r;
    static String field_t;
    static String field_q;

    final ii a(op param0, int param1) {
        rn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        aga var20 = null;
        wia var21 = null;
        aga var22 = null;
        wia var23 = null;
        aga var24 = null;
        var19 = BachelorFridge.field_y;
        var20 = ((hea) this).field_h.a(param1 + 110, param0);
        var4 = new rn(((hea) this).field_g, new nq(var20), ((hea) this).field_i);
        var5 = param0.field_z;
        var6 = param0.field_B;
        var7 = var20.field_x;
        var8 = var20.field_J;
        var9 = ((hea) this).field_i;
        var10 = 0;
        var11 = 0;
        if (param1 == 3) {
          var12 = -1;
          var13 = -1;
          L0: while (true) {
            var10++;
            if (1000 <= var10) {
              throw new IllegalStateException("");
            } else {
              L1: {
                var14 = var7;
                var15 = var8;
                var16 = var9;
                if ((var16 ^ -1) != -3) {
                  if (var16 == 4) {
                    var14++;
                    break L1;
                  } else {
                    if (var16 == -2) {
                      var15--;
                      break L1;
                    } else {
                      if (-4 == var16) {
                        var15++;
                        break L1;
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                } else {
                  var14--;
                  break L1;
                }
              }
              L2: {
                var16 = 0;
                if (var14 >= 0) {
                  break L2;
                } else {
                  var9 = 3;
                  var16 = 1;
                  break L2;
                }
              }
              L3: {
                if (var5 > var14) {
                  break L3;
                } else {
                  var9 = 1;
                  var16 = 1;
                  break L3;
                }
              }
              L4: {
                if ((var15 ^ -1) > -1) {
                  var9 = 2;
                  var16 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var6 <= var15) {
                  var16 = 1;
                  var9 = 4;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var16 == 0) {
                L6: {
                  var8 = var15;
                  var7 = var14;
                  if (var20.field_x != var7) {
                    break L6;
                  } else {
                    if (var8 == var20.field_J) {
                      return (ii) (Object) var4;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  var23 = param0.field_a[var7][var8];
                  var24 = var23.field_l;
                  if (var24 == null) {
                    break L7;
                  } else {
                    var4.field_o.a((bw) (Object) new iv(new nq(var24), false, 1, 50, 0), true);
                    break L7;
                  }
                }
                if (var11 == 0) {
                  continue L0;
                } else {
                  if (var12 != var7) {
                    continue L0;
                  } else {
                    if (var8 != var13) {
                      continue L0;
                    } else {
                      var9 = ov.b(((hea) this).field_i, 60);
                      continue L0;
                    }
                  }
                }
              } else {
                if (var11 == 0) {
                  var11 = 1;
                  var13 = var8;
                  var12 = var7;
                  continue L0;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          field_r = 110;
          var12 = -1;
          var13 = -1;
          L8: while (true) {
            var10++;
            if (1000 <= var10) {
              throw new IllegalStateException("");
            } else {
              L9: {
                var14 = var7;
                var15 = var8;
                var16 = var9;
                if ((var16 ^ -1) != -3) {
                  if (var16 == 4) {
                    var14++;
                    break L9;
                  } else {
                    if (var16 == -2) {
                      var15--;
                      break L9;
                    } else {
                      if (-4 == var16) {
                        var15++;
                        break L9;
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                } else {
                  var14--;
                  break L9;
                }
              }
              L10: {
                var16 = 0;
                if (var14 >= 0) {
                  break L10;
                } else {
                  var9 = 3;
                  var16 = 1;
                  break L10;
                }
              }
              L11: {
                if (var5 > var14) {
                  break L11;
                } else {
                  var9 = 1;
                  var16 = 1;
                  break L11;
                }
              }
              L12: {
                if ((var15 ^ -1) > -1) {
                  var9 = 2;
                  var16 = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var6 <= var15) {
                  var16 = 1;
                  var9 = 4;
                  break L13;
                } else {
                  break L13;
                }
              }
              if (var16 == 0) {
                L14: {
                  var8 = var15;
                  var7 = var14;
                  if (var20.field_x != var7) {
                    break L14;
                  } else {
                    if (var8 == var20.field_J) {
                      return (ii) (Object) var4;
                    } else {
                      break L14;
                    }
                  }
                }
                L15: {
                  var21 = param0.field_a[var7][var8];
                  var22 = var21.field_l;
                  if (var22 == null) {
                    break L15;
                  } else {
                    var4.field_o.a((bw) (Object) new iv(new nq(var22), false, 1, 50, 0), true);
                    break L15;
                  }
                }
                if (var11 == 0) {
                  continue L8;
                } else {
                  if (var12 != var7) {
                    continue L8;
                  } else {
                    if (var8 != var13) {
                      continue L8;
                    } else {
                      var9 = ov.b(((hea) this).field_i, 60);
                      continue L8;
                    }
                  }
                }
              } else {
                if (var11 == 0) {
                  var11 = 1;
                  var13 = var8;
                  var12 = var7;
                  continue L8;
                } else {
                  continue L8;
                }
              }
            }
          }
        }
    }

    final static ee a(ee param0, int[] param1, byte param2) {
        ee var3 = null;
        var3 = new ee(0, 0, 0);
        if (param2 < 115) {
          field_r = -40;
          var3.field_a = param0.field_a;
          var3.field_g = param0.field_g;
          var3.field_e = param0.field_e;
          var3.field_b = param0.field_b;
          var3.field_h = param1;
          var3.field_f = param0.field_f;
          var3.field_d = param0.field_d;
          var3.field_c = param0.field_c;
          return var3;
        } else {
          var3.field_a = param0.field_a;
          var3.field_g = param0.field_g;
          var3.field_e = param0.field_e;
          var3.field_b = param0.field_b;
          var3.field_h = param1;
          var3.field_f = param0.field_f;
          var3.field_d = param0.field_d;
          var3.field_c = param0.field_c;
          return var3;
        }
    }

    hea(int param0, aga param1, int param2) {
        super(param0, param1);
        ((hea) this).field_i = param2;
    }

    final static pp b(int param0, lu param1) {
        nq var2 = null;
        if (param0 != 16866) {
          hea.b(20);
          var2 = qi.a(param1, (byte) 74);
          return (pp) (Object) new ks(var2);
        } else {
          var2 = qi.a(param1, (byte) 74);
          return (pp) (Object) new ks(var2);
        }
    }

    final static void b(int param0) {
        if (!vs.a(23864)) {
            return;
        }
        tfa.a(param0, param0 + -3, false);
    }

    public static void c(int param0) {
        field_p = null;
        field_q = null;
        field_s = null;
        field_t = null;
        if (param0 >= -86) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Cancel";
        field_t = "Music: ";
        field_p = new du(12, 0, 1, 0);
        field_q = "Rating";
    }
}
