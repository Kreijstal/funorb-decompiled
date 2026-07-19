/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    private wt field_a;
    private wt field_b;

    final void a(wt param0, byte param1) {
        if (!(param0.field_f == null)) {
            param0.d(-123);
        }
        param0.field_f = this.field_a;
        param0.field_j = this.field_a.field_j;
        param0.field_f.field_j = param0;
        if (param1 <= 122) {
            return;
        }
        try {
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "er.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final wt b(int param0) {
        wt var2 = null;
        if (param0 == -18520) {
          var2 = this.field_a.field_j;
          if (var2 == this.field_a) {
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
        RuntimeException var1 = null;
        double var1_double = 0.0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null != vc.field_f) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              vc.field_f = new int[65536];
              L1: {
                var1_double = -0.015 + Math.random() * 0.03 + 0.7;
                if (param0 == -128) {
                  break L1;
                } else {
                  er.d(65);
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                if (65536 <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = 0.0078125 + (double)((var3 & 64725) >> 481575562) / 64.0;
                  var6 = 0.0625 + (double)((1017 & var3) >> -384276985) / 8.0;
                  var8 = (double)(127 & var3) / 128.0;
                  var10 = var8;
                  var12 = var8;
                  var14 = var8;
                  if (0.0 != var6) {
                    L3: {
                      if (var8 < 0.5) {
                        var16_double = var8 * (1.0 + var6);
                        break L3;
                      } else {
                        var16_double = -(var6 * var8) + (var8 + var6);
                        break L3;
                      }
                    }
                    L4: {
                      var18_double = 2.0 * var8 - var16_double;
                      var20 = var4 + 0.3333333333333333;
                      if (var20 <= 1.0) {
                        break L4;
                      } else {
                        var20 = var20 - 1.0;
                        break L4;
                      }
                    }
                    L5: {
                      var22 = var4;
                      var24 = -0.3333333333333333 + var4;
                      if (var22 * 6.0 >= 1.0) {
                        if (var22 * 2.0 >= 1.0) {
                          if (3.0 * var22 < 2.0) {
                            var12 = (-var18_double + var16_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                            break L5;
                          } else {
                            var12 = var18_double;
                            break L5;
                          }
                        } else {
                          var12 = var16_double;
                          break L5;
                        }
                      } else {
                        var12 = (-var18_double + var16_double) * 6.0 * var22 + var18_double;
                        break L5;
                      }
                    }
                    L6: {
                      if (var24 < 0.0) {
                        var24 = var24 + 1.0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var20 * 6.0 < 1.0) {
                        var10 = var20 * ((-var18_double + var16_double) * 6.0) + var18_double;
                        break L7;
                      } else {
                        if (2.0 * var20 < 1.0) {
                          var10 = var16_double;
                          break L7;
                        } else {
                          if (var20 * 3.0 < 2.0) {
                            var10 = 6.0 * ((-var20 + 0.6666666666666666) * (-var18_double + var16_double)) + var18_double;
                            break L7;
                          } else {
                            var10 = var18_double;
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      if (1.0 > var24 * 6.0) {
                        var14 = var18_double + 6.0 * (-var18_double + var16_double) * var24;
                        break L8;
                      } else {
                        if (var24 * 2.0 >= 1.0) {
                          if (3.0 * var24 < 2.0) {
                            var14 = var18_double + 6.0 * ((-var24 + 0.6666666666666666) * (-var18_double + var16_double));
                            break L8;
                          } else {
                            var14 = var18_double;
                            break L8;
                          }
                        } else {
                          var14 = var16_double;
                          break L8;
                        }
                      }
                    }
                    var10 = Math.pow(var10, var1_double);
                    var12 = Math.pow(var12, var1_double);
                    var14 = Math.pow(var14, var1_double);
                    var16 = (int)(var10 * 256.0);
                    var17 = (int)(256.0 * var12);
                    var18 = (int)(256.0 * var14);
                    var19 = (var16 << -1477488496) - (-(var17 << 71742888) + -var18);
                    vc.field_f[var3] = var19;
                    var3++;
                    continue L2;
                  } else {
                    var10 = Math.pow(var10, var1_double);
                    var12 = Math.pow(var12, var1_double);
                    var14 = Math.pow(var14, var1_double);
                    var16 = (int)(var10 * 256.0);
                    var17 = (int)(256.0 * var12);
                    var18 = (int)(256.0 * var14);
                    var19 = (var16 << -1477488496) - (-(var17 << 71742888) + -var18);
                    vc.field_f[var3] = var19;
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "er.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0;
        wt var3 = this.field_a.field_j;
        while (var3 != this.field_a) {
            var3 = var3.field_j;
            var2++;
        }
        return var2;
    }

    final void a(int param0, wt param1) {
        wt discarded$0 = null;
        try {
            if (param1.field_f != null) {
                param1.d(-124);
            }
            param1.field_f = this.field_a.field_f;
            param1.field_j = this.field_a;
            param1.field_f.field_j = param1;
            if (param0 != 2) {
                discarded$0 = this.a(-73);
            }
            param1.field_j.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "er.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wt e(int param0) {
        wt var2 = null;
        var2 = this.field_b;
        if (var2 != this.field_a) {
          this.field_b = var2.field_j;
          if (param0 != 31542) {
            return (wt) null;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
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
          var2 = this.field_a.field_f;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.d(-114);
            return var2;
          }
        } else {
          this.field_b = (wt) null;
          var2 = this.field_a.field_f;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.d(-114);
            return var2;
          }
        }
    }

    public er() {
        this.field_a = new wt();
        this.field_a.field_f = this.field_a;
        this.field_a.field_j = this.field_a;
    }

    final wt b(byte param0) {
        wt var2 = null;
        var2 = this.field_a.field_j;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        } else {
          if (param0 < 13) {
            this.field_a = (wt) null;
            this.field_b = var2.field_j;
            return var2;
          } else {
            this.field_b = var2.field_j;
            return var2;
          }
        }
    }

    static {
        field_c = "Unpacking sound effects";
    }
}
