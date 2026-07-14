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
        ((gm) this).field_K = ((gm) this).field_K + 1;
        super.a(param0, param1, param2, param3);
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
        String var5 = null;
        qrb var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        phb var16 = null;
        Object var17 = null;
        phb var18 = null;
        phb var19 = null;
        phb var20 = null;
        Object var21 = null;
        phb var22 = null;
        phb var23 = null;
        phb var24 = null;
        Object var25 = null;
        phb var26 = null;
        phb var27 = null;
        phb var28 = null;
        phb var29 = null;
        Object var30 = null;
        phb var31 = null;
        phb var32 = null;
        phb var33 = null;
        at var34 = null;
        at var35 = null;
        at var36 = null;
        at var37 = null;
        L0: {
          L1: {
            var17 = null;
            var21 = null;
            var25 = null;
            var30 = null;
            var13 = VoidHunters.field_G;
            var6 = ((gm) this).field_L.a((byte) 35);
            if (tg.field_p == var6) {
              break L1;
            } else {
              if (var6 != dsa.field_q) {
                var5 = ((gm) this).field_L.c((byte) -79);
                if (var5 != null) {
                  break L0;
                } else {
                  var5 = ((gm) this).field_J;
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
        if (!var5.equals((Object) (Object) ((gm) this).field_j)) {
          ((gm) this).field_j = var5;
          ((gm) this).g((byte) 115);
          if (param2 >= 47) {
            L2: {
              super.b(param0, param1, 111, param3);
              var6 = ((gm) this).field_L.a((byte) 35);
              var37 = (at) (Object) ((gm) this).field_q;
              var9 = param0 - -((gm) this).field_g;
              var10 = var37.b(-3, param3, (shb) this) - -(var37.a((shb) this, 3).a(29565) >> -797554815);
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
            if (((gm) this).field_N != null) {
              if (var11 <= ((gm) this).field_N.field_q) {
                if (var12 <= ((gm) this).field_N.field_p) {
                  de.a(94, ((gm) this).field_N);
                  dma.a();
                  var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  ((gm) this).field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                  return;
                } else {
                  ((gm) this).field_N = new phb(var11, var12);
                  de.a(99, ((gm) this).field_N);
                  var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  ((gm) this).field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                  return;
                }
              } else {
                ((gm) this).field_N = new phb(var11, var12);
                de.a(99, ((gm) this).field_N);
                var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                bia.a((byte) 124);
                ((gm) this).field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
                return;
              }
            } else {
              ((gm) this).field_N = new phb(var11, var12);
              de.a(99, ((gm) this).field_N);
              var33.b(112, 144, var33.field_m << -697751676, var33.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
              bia.a((byte) 124);
              ((gm) this).field_N.c(var9 + -(var33.field_m >> -663841503), -var33.field_n + var10, 256);
              return;
            }
          } else {
            ((gm) this).field_L = null;
            super.b(param0, param1, 111, param3);
            var6 = ((gm) this).field_L.a((byte) 35);
            var36 = (at) (Object) ((gm) this).field_q;
            var9 = param0 - -((gm) this).field_g;
            var10 = var36.b(-3, param3, (shb) this) - -(var36.a((shb) this, 3).a(29565) >> -797554815);
            if (tg.field_p != var6) {
              if (dsa.field_q == var6) {
                var29 = ps.field_a[0];
                var16 = var29;
                var11 = var29.field_m << -541462143;
                var12 = var29.field_n << -772159871;
                if (((gm) this).field_N != null) {
                  if (var11 <= ((gm) this).field_N.field_q) {
                    if (var12 > ((gm) this).field_N.field_p) {
                      ((gm) this).field_N = new phb(var11, var12);
                      de.a(99, ((gm) this).field_N);
                      var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                      bia.a((byte) 124);
                      ((gm) this).field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                      return;
                    } else {
                      de.a(94, ((gm) this).field_N);
                      dma.a();
                      var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                      bia.a((byte) 124);
                      ((gm) this).field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                      return;
                    }
                  } else {
                    ((gm) this).field_N = new phb(var11, var12);
                    de.a(99, ((gm) this).field_N);
                    var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                    bia.a((byte) 124);
                    ((gm) this).field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
                    return;
                  }
                } else {
                  ((gm) this).field_N = new phb(var11, var12);
                  de.a(99, ((gm) this).field_N);
                  var29.b(112, 144, var29.field_m << -697751676, var29.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  ((gm) this).field_N.c(var9 + -(var29.field_m >> -663841503), -var29.field_n + var10, 256);
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
                  if (((gm) this).field_N == null) {
                    break L4;
                  } else {
                    if (var11 > ((gm) this).field_N.field_q) {
                      break L4;
                    } else {
                      if (var12 <= ((gm) this).field_N.field_p) {
                        de.a(94, ((gm) this).field_N);
                        dma.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((gm) this).field_N = new phb(var11, var12);
                de.a(99, ((gm) this).field_N);
                break L3;
              }
              var26.b(112, 144, var26.field_m << -697751676, var26.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
              bia.a((byte) 124);
              ((gm) this).field_N.c(var9 + -(var26.field_m >> -663841503), -var26.field_n + var10, 256);
              return;
            }
          }
        } else {
          if (param2 >= 47) {
            L5: {
              super.b(param0, param1, 111, param3);
              var6 = ((gm) this).field_L.a((byte) 35);
              var35 = (at) (Object) ((gm) this).field_q;
              var9 = param0 - -((gm) this).field_g;
              var10 = var35.b(-3, param3, (shb) this) - -(var35.a((shb) this, 3).a(29565) >> -797554815);
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
            if (((gm) this).field_N != null) {
              if (var11 <= ((gm) this).field_N.field_q) {
                if (var12 > ((gm) this).field_N.field_p) {
                  ((gm) this).field_N = new phb(var11, var12);
                  de.a(99, ((gm) this).field_N);
                  var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  ((gm) this).field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                  return;
                } else {
                  de.a(94, ((gm) this).field_N);
                  dma.a();
                  var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                  bia.a((byte) 124);
                  ((gm) this).field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                  return;
                }
              } else {
                ((gm) this).field_N = new phb(var11, var12);
                de.a(99, ((gm) this).field_N);
                var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
                bia.a((byte) 124);
                ((gm) this).field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
                return;
              }
            } else {
              ((gm) this).field_N = new phb(var11, var12);
              de.a(99, ((gm) this).field_N);
              var24.b(112, 144, var24.field_m << -697751676, var24.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
              bia.a((byte) 124);
              ((gm) this).field_N.c(var9 + -(var24.field_m >> -663841503), -var24.field_n + var10, 256);
              return;
            }
          } else {
            L6: {
              L7: {
                ((gm) this).field_L = null;
                super.b(param0, param1, 111, param3);
                var6 = ((gm) this).field_L.a((byte) 35);
                var34 = (at) (Object) ((gm) this).field_q;
                var9 = param0 - -((gm) this).field_g;
                var10 = var34.b(-3, param3, (shb) this) - -(var34.a((shb) this, 3).a(29565) >> -797554815);
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
                  if (((gm) this).field_N == null) {
                    break L9;
                  } else {
                    if (var11 > ((gm) this).field_N.field_q) {
                      break L9;
                    } else {
                      if (var12 <= ((gm) this).field_N.field_p) {
                        de.a(94, ((gm) this).field_N);
                        dma.a();
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                ((gm) this).field_N = new phb(var11, var12);
                de.a(99, ((gm) this).field_N);
                break L8;
              }
              var20.b(112, 144, var20.field_m << -697751676, var20.field_n << 1550078788, -((gm) this).field_K << -593003734, 4096);
              bia.a((byte) 124);
              ((gm) this).field_N.c(var9 + -(var20.field_m >> -663841503), -var20.field_n + var10, 256);
              break L6;
            }
            return;
          }
        }
    }

    final boolean a(int param0, shb param1) {
        if (param0 != 0) {
            field_H = null;
            return false;
        }
        return false;
    }

    final String d(byte param0) {
        if (param0 == 125) {
            return null;
        }
        ((gm) this).field_J = null;
        return null;
    }

    final static int a(uja param0, int param1) {
        if (rpa.field_c != param0) {
          if (param0 != tea.field_d) {
            if (param0 == tma.field_p) {
              return 34066;
            } else {
              if (param1 != 9216) {
                field_H = null;
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return 34065;
          }
        } else {
          return 9216;
        }
    }

    gm(eeb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (wwa) (Object) cfa.b((byte) -111));
        ((gm) this).field_J = param1;
        ((gm) this).field_L = param0;
        ((gm) this).a(param2, param4, param5, 1, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ij();
        field_I = "Stingray chassis";
    }
}
