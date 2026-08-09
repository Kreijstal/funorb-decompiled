/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends kja {
    private phb field_N;
    static ij field_H;
    private int field_K;
    private eeb field_L;
    static byte[] field_M;
    static String field_I;
    private String field_J;

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            this.field_K = this.field_K + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_M = null;
        field_I = null;
        if (param0 != -2459) {
            return;
        }
        field_H = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        String var5;
        qrb var6;
        int var13;
        Object var17;
        Object var21;
        Object var25;
        Object var30;
        int var9;
        int var10;
        int var11;
        int var12;
        phb var16;
        phb var18;
        phb var19;
        phb var20;
        phb var22;
        phb var23;
        phb var24;
        phb var26;
        phb var27;
        phb var28;
        phb var29;
        phb var31;
        phb var32;
        phb var33;
        at var34;
        at var35;
        at var36;
        at var37;
        L0: {
          L1: {
            var17 = null;
            var21 = null;
            var25 = null;
            var30 = null;
            var13 = VoidHunters.field_G;
            var6 = this.field_L.a((byte) 35);
            if (tg.field_p == var6) {
              break L1;
            } else {
              if (var6 != dsa.field_q) {
                var5 = this.field_L.c((byte) -79);
                if (var5 != null) {
                  break L0;
                } else {
                  var5 = this.field_J;
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = nga.field_c;
          break L0;
        }
        if (!var5.equals(this.field_j)) {
          this.field_j = var5;
          this.g((byte) 115);
          if (param2 >= 47) {
            L2: {
              super.b(param0, param1, 111, param3);
              var6 = this.field_L.a((byte) 35);
              var37 = (at) ((Object) this.field_q);
              var9 = param0 - -this.field_g;
              var10 = var37.b(-3, param3, (shb) (this)) - -(var37.a((shb) (this), 3).a(29565) >> -797554815);
              if (tg.field_p == var6) {
                break L2;
              } else {
                if (dsa.field_q == var6) {
                  break L2;
                } else {
                  if (cca.field_o != var6) {
                    if (var6 != lea.field_o) {
                      return;
                    } else {
                      var32 = ps.field_a[1];
                      var32.c(var9, var10 + -(var32.field_p >> -940320159), 256);
                      return;
                    }
                  } else {
                    var31 = ps.field_a[2];
                    var31.c(var9, var10 - (var31.field_p >> -1424337375), 256);
                    return;
                  }
                }
              }
            }
            var33 = ps.field_a[0];
            var11 = var33.field_m << -541462143;
            var12 = var33.field_n << -772159871;
            if (this.field_N != null) {
              if (var11 <= this.field_N.field_q) {
                if (var12 <= this.field_N.field_p) {
                  de.a(94, this.field_N);
                  dma.a();
                  var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -this.field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  this.field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                  return;
                } else {
                  this.field_N = new phb(var11, var12);
                  de.a(99, this.field_N);
                  var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -this.field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  this.field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                  return;
                }
              } else {
                this.field_N = new phb(var11, var12);
                de.a(99, this.field_N);
                var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -this.field_K << -593003734, 4096);
                bia.a((byte) 124);
                this.field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                return;
              }
            } else {
              this.field_N = new phb(var11, var12);
              de.a(99, this.field_N);
              var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -this.field_K << -593003734, 4096);
              bia.a((byte) 124);
              this.field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
              return;
            }
          } else {
            this.field_L = (eeb) null;
            super.b(param0, param1, 111, param3);
            var6 = this.field_L.a((byte) 35);
            var36 = (at) ((Object) this.field_q);
            var9 = param0 - -this.field_g;
            var10 = var36.b(-3, param3, (shb) (this)) - -(var36.a((shb) (this), 3).a(29565) >> -797554815);
            if (tg.field_p != var6) {
              if (dsa.field_q == var6) {
                var29 = ps.field_a[0];
                var16 = var29;
                var11 = var29.field_m << -541462143;
                var12 = var29.field_n << -772159871;
                if (this.field_N != null) {
                  if (var11 <= this.field_N.field_q) {
                    if (var12 > this.field_N.field_p) {
                      this.field_N = new phb(var11, var12);
                      de.a(99, this.field_N);
                      var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -this.field_K << -593003734, 4096);
                      bia.a((byte) 124);
                      this.field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                      return;
                    } else {
                      de.a(94, this.field_N);
                      dma.a();
                      var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -this.field_K << -593003734, 4096);
                      bia.a((byte) 124);
                      this.field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                      return;
                    }
                  } else {
                    this.field_N = new phb(var11, var12);
                    de.a(99, this.field_N);
                    var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -this.field_K << -593003734, 4096);
                    bia.a((byte) 124);
                    this.field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                    return;
                  }
                } else {
                  this.field_N = new phb(var11, var12);
                  de.a(99, this.field_N);
                  var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -this.field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  this.field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                  return;
                }
              } else {
                if (cca.field_o != var6) {
                  if (var6 == lea.field_o) {
                    var28 = ps.field_a[1];
                    var28.c(var9, var10 + -(var28.field_p >> -940320159), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var27 = ps.field_a[2];
                  var27.c(var9, var10 - (var27.field_p >> -1424337375), 256);
                  return;
                }
              }
            } else {
              L3: {
                L4: {
                  var26 = ps.field_a[0];
                  var11 = var26.field_m << -541462143;
                  var12 = var26.field_n << -772159871;
                  if (this.field_N == null) {
                    break L4;
                  } else {
                    if (var11 > this.field_N.field_q) {
                      break L4;
                    } else {
                      if (var12 <= this.field_N.field_p) {
                        de.a(94, this.field_N);
                        dma.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_N = new phb(var11, var12);
                de.a(99, this.field_N);
                break L3;
              }
              var26.b(112, 144, var26.field_m << -697751676, var26.field_n << 1550078788, -this.field_K << -593003734, 4096);
              bia.a((byte) 124);
              this.field_N.c(var9 + -(var26.field_m >> -663841503), -var26.field_n + var10, 256);
              return;
            }
          }
        } else {
          if (param2 >= 47) {
            L5: {
              super.b(param0, param1, 111, param3);
              var6 = this.field_L.a((byte) 35);
              var35 = (at) ((Object) this.field_q);
              var9 = param0 - -this.field_g;
              var10 = var35.b(-3, param3, (shb) (this)) - -(var35.a((shb) (this), 3).a(29565) >> -797554815);
              if (tg.field_p == var6) {
                break L5;
              } else {
                if (dsa.field_q == var6) {
                  break L5;
                } else {
                  if (cca.field_o != var6) {
                    if (var6 == lea.field_o) {
                      var23 = ps.field_a[1];
                      var23.c(var9, var10 + -(var23.field_p >> -940320159), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var22 = ps.field_a[2];
                    var22.c(var9, var10 - (var22.field_p >> -1424337375), 256);
                    return;
                  }
                }
              }
            }
            var24 = ps.field_a[0];
            var11 = var24.field_m << -541462143;
            var12 = var24.field_n << -772159871;
            if (this.field_N != null) {
              if (var11 <= this.field_N.field_q) {
                if (var12 > this.field_N.field_p) {
                  this.field_N = new phb(var11, var12);
                  de.a(99, this.field_N);
                  var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -this.field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  this.field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                  return;
                } else {
                  de.a(94, this.field_N);
                  dma.a();
                  var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -this.field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  this.field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                  return;
                }
              } else {
                this.field_N = new phb(var11, var12);
                de.a(99, this.field_N);
                var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -this.field_K << -593003734, 4096);
                bia.a((byte) 124);
                this.field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                return;
              }
            } else {
              this.field_N = new phb(var11, var12);
              de.a(99, this.field_N);
              var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -this.field_K << -593003734, 4096);
              bia.a((byte) 124);
              this.field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
              return;
            }
          } else {
            L6: {
              L7: {
                this.field_L = (eeb) null;
                super.b(param0, param1, 111, param3);
                var6 = this.field_L.a((byte) 35);
                var34 = (at) ((Object) this.field_q);
                var9 = param0 - -this.field_g;
                var10 = var34.b(-3, param3, (shb) (this)) - -(var34.a((shb) (this), 3).a(29565) >> -797554815);
                if (tg.field_p == var6) {
                  break L7;
                } else {
                  if (dsa.field_q == var6) {
                    break L7;
                  } else {
                    if (cca.field_o != var6) {
                      if (var6 != lea.field_o) {
                        break L6;
                      } else {
                        var19 = ps.field_a[1];
                        var19.c(var9, var10 + -(var19.field_p >> -940320159), 256);
                        break L6;
                      }
                    } else {
                      var18 = ps.field_a[2];
                      var18.c(var9, var10 - (var18.field_p >> -1424337375), 256);
                      break L6;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  var20 = ps.field_a[0];
                  var11 = var20.field_m << -541462143;
                  var12 = var20.field_n << -772159871;
                  if (this.field_N == null) {
                    break L9;
                  } else {
                    if (var11 > this.field_N.field_q) {
                      break L9;
                    } else {
                      if (var12 <= this.field_N.field_p) {
                        de.a(94, this.field_N);
                        dma.a();
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                this.field_N = new phb(var11, var12);
                de.a(99, this.field_N);
                break L8;
              }
              var20.b(112, 144, var20.field_m << -697751676, var20.field_n << 1550078788, -this.field_K << -593003734, 4096);
              bia.a((byte) 124);
              this.field_N.c(var9 + -(var20.field_m >> -663841503), -var20.field_n + var10, 256);
              break L6;
            }
            return;
          }
        }
    }

    final boolean a(int param0, shb param1) {
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
            if (param0 == 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_H = (ij) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gm.A(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final String d(byte param0) {
        if (param0 == 125) {
            return null;
        }
        this.field_J = (String) null;
        return null;
    }

    final static int a(uja param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rpa.field_c != param0) {
              if (param0 == tea.field_d) {
                stackIn_9_0 = 34065;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 == tma.field_p) {
                  stackIn_7_0 = 34066;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L1: {
                    if (param1 == 9216) {
                      break L1;
                    } else {
                      field_H = (ij) null;
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                }
              }
            } else {
              stackIn_2_0 = 9216;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("gm.L(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    gm(eeb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cfa.b((byte) -111));
        try {
            this.field_J = param1;
            this.field_L = param0;
            this.a(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_H = new ij();
        field_I = "Stingray chassis";
    }
}
