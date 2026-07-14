/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    private wt field_a;
    private wt field_b;

    final void a(wt param0, byte param1) {
        L0: {
          if (((wt) param0).field_f != null) {
            param0.d(-123);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_f = ((er) this).field_a;
        param0.field_j = ((er) this).field_a.field_j;
        ((wt) param0).field_f.field_j = param0;
        if (param1 <= 122) {
          return;
        } else {
          ((wt) param0).field_j.field_f = param0;
          return;
        }
    }

    final wt b(int param0) {
        wt var2 = null;
        if (param0 == -18520) {
          var2 = ((er) this).field_a.field_j;
          if (var2 == ((er) this).field_a) {
            return null;
          } else {
            var2.d(-121);
            return var2;
          }
        } else {
          return (wt) null;
        }
    }

    final static void a(byte param0) {
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
        var26 = AceOfSkies.field_G ? 1 : 0;
        if (null != vc.field_f) {
          return;
        } else {
          vc.field_f = new int[65536];
          L0: {
            var1 = -0.015 + Math.random() * 0.03 + 0.7;
            if (param0 == -128) {
              break L0;
            } else {
              er.d(65);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (65536 <= var3) {
              return;
            } else {
              var4 = 0.0078125 + (double)((var3 & 64725) >> 481575562) / 64.0;
              var6 = 0.0625 + (double)((1017 & var3) >> -384276985) / 8.0;
              var8 = (double)(127 & var3) / 128.0;
              var10 = var8;
              var12 = var8;
              var14 = var8;
              if (0.0 != var6) {
                L2: {
                  if (var8 < 0.5) {
                    var16_double = var8 * (1.0 + var6);
                    break L2;
                  } else {
                    var16_double = -(var6 * var8) + (var8 + var6);
                    break L2;
                  }
                }
                L3: {
                  var18_double = 2.0 * var8 - var16_double;
                  var20 = var4 + 0.3333333333333333;
                  if (var20 <= 1.0) {
                    break L3;
                  } else {
                    var20 = var20 - 1.0;
                    break L3;
                  }
                }
                L4: {
                  var22 = var4;
                  var24 = -0.3333333333333333 + var4;
                  if (var22 * 6.0 >= 1.0) {
                    if (var22 * 2.0 >= 1.0) {
                      if (3.0 * var22 < 2.0) {
                        var12 = (-var18_double + var16_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                        break L4;
                      } else {
                        var12 = var18_double;
                        break L4;
                      }
                    } else {
                      var12 = var16_double;
                      break L4;
                    }
                  } else {
                    var12 = (-var18_double + var16_double) * 6.0 * var22 + var18_double;
                    break L4;
                  }
                }
                L5: {
                  if (var24 < 0.0) {
                    var24 = var24 + 1.0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var20 * 6.0 < 1.0) {
                    var10 = var20 * ((-var18_double + var16_double) * 6.0) + var18_double;
                    break L6;
                  } else {
                    if (2.0 * var20 < 1.0) {
                      var10 = var16_double;
                      break L6;
                    } else {
                      if (var20 * 3.0 < 2.0) {
                        var10 = 6.0 * ((-var20 + 0.6666666666666666) * (-var18_double + var16_double)) + var18_double;
                        break L6;
                      } else {
                        var10 = var18_double;
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  if (1.0 > var24 * 6.0) {
                    var14 = var18_double + 6.0 * (-var18_double + var16_double) * var24;
                    break L7;
                  } else {
                    if (var24 * 2.0 >= 1.0) {
                      if (3.0 * var24 < 2.0) {
                        var14 = var18_double + 6.0 * ((-var24 + 0.6666666666666666) * (-var18_double + var16_double));
                        break L7;
                      } else {
                        var14 = var18_double;
                        break L7;
                      }
                    } else {
                      var14 = var16_double;
                      break L7;
                    }
                  }
                }
                var10 = Math.pow(var10, var1);
                var12 = Math.pow(var12, var1);
                var14 = Math.pow(var14, var1);
                var16 = (int)(var10 * 256.0);
                var17 = (int)(256.0 * var12);
                var18 = (int)(256.0 * var14);
                var19 = (var16 << -1477488496) - (-(var17 << 71742888) + -var18);
                vc.field_f[var3] = var19;
                var3++;
                continue L1;
              } else {
                var10 = Math.pow(var10, var1);
                var12 = Math.pow(var12, var1);
                var14 = Math.pow(var14, var1);
                var16 = (int)(var10 * 256.0);
                var17 = (int)(256.0 * var12);
                var18 = (int)(256.0 * var14);
                var19 = (var16 << -1477488496) - (-(var17 << 71742888) + -var18);
                vc.field_f[var3] = var19;
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final int c(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0;
        wt var3 = ((er) this).field_a.field_j;
        while (var3 != ((er) this).field_a) {
            var3 = ((wt) var3).field_j;
            var2++;
        }
        return var2;
    }

    final void a(int param0, wt param1) {
        if (((wt) param1).field_f == null) {
          param1.field_f = ((er) this).field_a.field_f;
          param1.field_j = ((er) this).field_a;
          ((wt) param1).field_f.field_j = param1;
          if (param0 != 2) {
            wt discarded$4 = ((er) this).a(-73);
            ((wt) param1).field_j.field_f = param1;
            return;
          } else {
            ((wt) param1).field_j.field_f = param1;
            return;
          }
        } else {
          param1.d(-124);
          param1.field_f = ((er) this).field_a.field_f;
          param1.field_j = ((er) this).field_a;
          ((wt) param1).field_f.field_j = param1;
          if (param0 == 2) {
            ((wt) param1).field_j.field_f = param1;
            return;
          } else {
            wt discarded$5 = ((er) this).a(-73);
            ((wt) param1).field_j.field_f = param1;
            return;
          }
        }
    }

    final wt e(int param0) {
        wt var2 = null;
        var2 = ((er) this).field_b;
        if (var2 != ((er) this).field_a) {
          ((er) this).field_b = ((wt) var2).field_j;
          if (param0 != 31542) {
            return (wt) null;
          } else {
            return var2;
          }
        } else {
          ((er) this).field_b = null;
          return null;
        }
    }

    public static void d(int param0) {
        int var1 = 118 % ((67 - param0) / 57);
        field_c = null;
    }

    final wt a(int param0) {
        wt var2 = null;
        if (param0 == 3) {
          var2 = ((er) this).field_a.field_f;
          if (var2 == ((er) this).field_a) {
            return null;
          } else {
            var2.d(-114);
            return var2;
          }
        } else {
          ((er) this).field_b = (wt) null;
          var2 = ((er) this).field_a.field_f;
          if (var2 == ((er) this).field_a) {
            return null;
          } else {
            var2.d(-114);
            return var2;
          }
        }
    }

    public er() {
        ((er) this).field_a = new wt();
        ((er) this).field_a.field_f = ((er) this).field_a;
        ((er) this).field_a.field_j = ((er) this).field_a;
    }

    final wt b(byte param0) {
        wt var2 = null;
        var2 = ((er) this).field_a.field_j;
        if (((er) this).field_a == var2) {
          ((er) this).field_b = null;
          return null;
        } else {
          if (param0 < 13) {
            ((er) this).field_a = (wt) null;
            ((er) this).field_b = ((wt) var2).field_j;
            return var2;
          } else {
            ((er) this).field_b = ((wt) var2).field_j;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unpacking sound effects";
    }
}
