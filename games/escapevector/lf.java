/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ue {
    static String field_G;
    private ed field_M;
    static ed field_I;
    private int field_O;
    static int field_H;
    private el field_N;
    static String field_J;
    private String field_L;
    static byte[] field_K;

    lf(el param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, gl.c(true));
        try {
            this.field_L = param1;
            this.field_N = param0;
            this.a(param4, param3, param2, true, param5);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5;
        rf var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        ed var19;
        ed var20;
        ed var21;
        ed var22;
        Object var23;
        ao var28;
        ed var24;
        ed var25;
        ed var26;
        ed var27;
        ao var29;
        var18 = null;
        var23 = null;
        var13 = EscapeVector.field_A;
        var6 = this.field_N.a(17124);
        if (of.field_f != var6) {
          L0: {
            L1: {
              L2: {
                if (ug.field_c != var6) {
                  var5 = this.field_N.b(44);
                  if (var5 == null) {
                    var5 = this.field_L;
                    break L2;
                  } else {
                    if (!var5.equals(this.field_l)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  var5 = fj.field_bb;
                  break L2;
                }
              }
              if (!var5.equals(this.field_l)) {
                break L1;
              } else {
                break L0;
              }
            }
            this.field_l = var5;
            this.k(0);
            break L0;
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = this.field_N.a(17124);
          var29 = (ao) ((Object) this.field_s);
          var9 = param3 - -this.field_k;
          var10 = var29.a((hm) (this), param0, -16956) - -(var29.b((hm) (this), 90).c(0) >> -974182559);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var25 = ul.field_E[0];
              var11 = var25.field_A << -1966556351;
              var12 = var25.field_z << 1145816513;
              if (this.field_M != null) {
                if (var11 <= this.field_M.field_s) {
                  if (var12 <= this.field_M.field_x) {
                    eo.a(this.field_M, (byte) -7);
                    em.d();
                    var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -this.field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    this.field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                    return;
                  } else {
                    this.field_M = new ed(var11, var12);
                    eo.a(this.field_M, (byte) -84);
                    var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -this.field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    this.field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                    return;
                  }
                } else {
                  this.field_M = new ed(var11, var12);
                  eo.a(this.field_M, (byte) -84);
                  var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -this.field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  this.field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                  return;
                }
              } else {
                this.field_M = new ed(var11, var12);
                eo.a(this.field_M, (byte) -84);
                var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -this.field_O << 1599618826, 4096);
                dl.a((byte) 120);
                this.field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h == var6) {
                    var26 = ul.field_E[1];
                    var26.c(var9, -(var26.field_x >> 1526982145) + var10, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var27 = ul.field_E[2];
                  var27.c(var9, -(var27.field_x >> 18734081) + var10, 256);
                  return;
                }
              } else {
                var24 = ul.field_E[0];
                var11 = var24.field_A << -1966556351;
                var12 = var24.field_z << 1145816513;
                if (this.field_M == null) {
                  this.field_M = new ed(var11, var12);
                  eo.a(this.field_M, (byte) -84);
                  var24.b(112, 144, var24.field_A << -1605119068, var24.field_z << -195294684, -this.field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  this.field_M.c(-(var24.field_A >> 420622369) + var9, -var24.field_z + var10, 256);
                  return;
                } else {
                  L3: {
                    L4: {
                      if (var11 > this.field_M.field_s) {
                        break L4;
                      } else {
                        if (var12 > this.field_M.field_x) {
                          break L4;
                        } else {
                          eo.a(this.field_M, (byte) -7);
                          em.d();
                          break L3;
                        }
                      }
                    }
                    this.field_M = new ed(var11, var12);
                    eo.a(this.field_M, (byte) -84);
                    break L3;
                  }
                  var24.b(112, 144, var24.field_A << -1605119068, var24.field_z << -195294684, -this.field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  this.field_M.c(-(var24.field_A >> 420622369) + var9, -var24.field_z + var10, 256);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          L5: {
            var17 = fj.field_bb;
            if (!var17.equals(this.field_l)) {
              this.field_l = var17;
              this.k(0);
              break L5;
            } else {
              break L5;
            }
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = this.field_N.a(17124);
          var28 = (ao) ((Object) this.field_s);
          var9 = param3 - -this.field_k;
          var10 = var28.a((hm) (this), param0, -16956) - -(var28.b((hm) (this), 90).c(0) >> -974182559);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var20 = ul.field_E[0];
              var11 = var20.field_A << -1966556351;
              var12 = var20.field_z << 1145816513;
              if (this.field_M != null) {
                if (var11 <= this.field_M.field_s) {
                  if (var12 <= this.field_M.field_x) {
                    eo.a(this.field_M, (byte) -7);
                    em.d();
                    var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -this.field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    this.field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                    return;
                  } else {
                    this.field_M = new ed(var11, var12);
                    eo.a(this.field_M, (byte) -84);
                    var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -this.field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    this.field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                    return;
                  }
                } else {
                  this.field_M = new ed(var11, var12);
                  eo.a(this.field_M, (byte) -84);
                  var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -this.field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  this.field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                  return;
                }
              } else {
                this.field_M = new ed(var11, var12);
                eo.a(this.field_M, (byte) -84);
                var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -this.field_O << 1599618826, 4096);
                dl.a((byte) 120);
                this.field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h != var6) {
                    return;
                  } else {
                    var21 = ul.field_E[1];
                    var21.c(var9, -(var21.field_x >> 1526982145) + var10, 256);
                    return;
                  }
                } else {
                  var22 = ul.field_E[2];
                  var22.c(var9, -(var22.field_x >> 18734081) + var10, 256);
                  return;
                }
              } else {
                L6: {
                  L7: {
                    var19 = ul.field_E[0];
                    var11 = var19.field_A << -1966556351;
                    var12 = var19.field_z << 1145816513;
                    if (this.field_M == null) {
                      break L7;
                    } else {
                      if (var11 > this.field_M.field_s) {
                        break L7;
                      } else {
                        if (var12 > this.field_M.field_x) {
                          break L7;
                        } else {
                          eo.a(this.field_M, (byte) -7);
                          em.d();
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_M = new ed(var11, var12);
                  eo.a(this.field_M, (byte) -84);
                  break L6;
                }
                var19.b(112, 144, var19.field_A << -1605119068, var19.field_z << -195294684, -this.field_O << 1599618826, 4096);
                dl.a((byte) 120);
                this.field_M.c(-(var19.field_A >> 420622369) + var9, -var19.field_z + var10, 256);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        if (param0 != -14472) {
            return;
        }
        try {
            this.field_O = this.field_O + 1;
            super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "lf.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = ca.a(-1, '_', param2, "");
              var3 = na.a(param0, false);
              if (param1 == 37) {
                break L1;
              } else {
                field_J = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param2.indexOf(param0) ^ -1) != 0) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_J = null;
        field_K = null;
        int var1 = -35 % ((param0 - 34) / 58);
        field_I = null;
        field_G = null;
    }

    final String d(int param0) {
        if (param0 == 1) {
            return null;
        }
        return (String) null;
    }

    final boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -4659) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_I = (ed) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_J = "Player Name: ";
        field_G = "Play the game without logging in just yet";
        field_H = 1;
    }
}
