/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends rb {
    private int field_H;
    private sk field_I;
    private t field_G;
    static sm[] field_L;
    private String field_J;
    static String field_K;

    final void a(int param0, gm param1, int param2, int param3) {
        ((bj) this).field_H = ((bj) this).field_H + 1;
        int var5 = 44 / ((-28 - param0) / 43);
        super.a(-88, param1, param2, param3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        cd var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        t var17 = null;
        String var18 = null;
        Object var19 = null;
        t var20 = null;
        t var21 = null;
        t var22 = null;
        String var25 = null;
        Object var26 = null;
        t var27 = null;
        t var28 = null;
        t var29 = null;
        String var30 = null;
        Object var31 = null;
        t var32 = null;
        t var33 = null;
        t var34 = null;
        fe var35 = null;
        fe var36 = null;
        fe var37 = null;
        L0: {
          var19 = null;
          var26 = null;
          var31 = null;
          var13 = Torquing.field_u;
          if (param1 <= -7) {
            break L0;
          } else {
            var14 = null;
            ((bj) this).a(-111, (gm) null, -90, 97);
            break L0;
          }
        }
        L1: {
          var6 = ((bj) this).field_I.a((byte) -88);
          if (q.field_a == var6) {
            break L1;
          } else {
            if (gn.field_h != var6) {
              var25 = ((bj) this).field_I.a(126);
              if (var25 == null) {
                L2: {
                  var30 = ((bj) this).field_J;
                  if (!var30.equals((Object) (Object) ((bj) this).field_m)) {
                    ((bj) this).field_m = var30;
                    ((bj) this).a((byte) -36);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  super.a(param0, (byte) -63, param2, param3);
                  var6 = ((bj) this).field_I.a((byte) -84);
                  var37 = (fe) (Object) ((bj) this).field_q;
                  var9 = ((bj) this).field_w + param3;
                  var10 = var37.a((gm) this, param2, -101) + (var37.b((byte) 116, (gm) this).b(false) >> 3003681);
                  if (var6 == q.field_a) {
                    break L3;
                  } else {
                    if (var6 == gn.field_h) {
                      break L3;
                    } else {
                      if (var6 != so.field_u) {
                        if (var6 != so.field_s) {
                          return;
                        } else {
                          var32 = wj.field_h[1];
                          var32.a(var9, -(var32.field_t >> -1724886911) + var10, 256);
                          return;
                        }
                      } else {
                        var33 = wj.field_h[2];
                        var33.a(var9, -(var33.field_t >> -703169567) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var34 = wj.field_h[0];
                var11 = var34.field_w << 786474273;
                var12 = var34.field_u << -1216082399;
                if (((bj) this).field_G != null) {
                  if (var11 <= ((bj) this).field_G.field_s) {
                    if (var12 > ((bj) this).field_G.field_t) {
                      ((bj) this).field_G = new t(var11, var12);
                      tm.a((byte) 97, ((bj) this).field_G);
                      var34.c(112, 144, var34.field_w << 1938381220, var34.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                      r.a(126);
                      ((bj) this).field_G.a(var9 - (var34.field_w >> 262769377), var10 - var34.field_u, 256);
                      return;
                    } else {
                      tm.a((byte) 31, ((bj) this).field_G);
                      ph.b();
                      var34.c(112, 144, var34.field_w << 1938381220, var34.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                      r.a(126);
                      ((bj) this).field_G.a(var9 - (var34.field_w >> 262769377), var10 - var34.field_u, 256);
                      return;
                    }
                  } else {
                    ((bj) this).field_G = new t(var11, var12);
                    tm.a((byte) 97, ((bj) this).field_G);
                    var34.c(112, 144, var34.field_w << 1938381220, var34.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                    r.a(126);
                    ((bj) this).field_G.a(var9 - (var34.field_w >> 262769377), var10 - var34.field_u, 256);
                    return;
                  }
                } else {
                  ((bj) this).field_G = new t(var11, var12);
                  tm.a((byte) 97, ((bj) this).field_G);
                  var34.c(112, 144, var34.field_w << 1938381220, var34.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                  r.a(126);
                  ((bj) this).field_G.a(var9 - (var34.field_w >> 262769377), var10 - var34.field_u, 256);
                  return;
                }
              } else {
                L4: {
                  if (!var25.equals((Object) (Object) ((bj) this).field_m)) {
                    ((bj) this).field_m = var25;
                    ((bj) this).a((byte) -36);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  super.a(param0, (byte) -63, param2, param3);
                  var6 = ((bj) this).field_I.a((byte) -84);
                  var36 = (fe) (Object) ((bj) this).field_q;
                  var9 = ((bj) this).field_w + param3;
                  var10 = var36.a((gm) this, param2, -101) + (var36.b((byte) 116, (gm) this).b(false) >> 3003681);
                  if (var6 == q.field_a) {
                    break L5;
                  } else {
                    if (var6 == gn.field_h) {
                      break L5;
                    } else {
                      if (var6 != so.field_u) {
                        if (var6 == so.field_s) {
                          var27 = wj.field_h[1];
                          var27.a(var9, -(var27.field_t >> -1724886911) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var28 = wj.field_h[2];
                        var28.a(var9, -(var28.field_t >> -703169567) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var29 = wj.field_h[0];
                var17 = var29;
                var11 = var29.field_w << 786474273;
                var12 = var29.field_u << -1216082399;
                if (((bj) this).field_G != null) {
                  if (var11 <= ((bj) this).field_G.field_s) {
                    if (var12 <= ((bj) this).field_G.field_t) {
                      tm.a((byte) 31, ((bj) this).field_G);
                      ph.b();
                      var29.c(112, 144, var29.field_w << 1938381220, var29.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                      r.a(126);
                      ((bj) this).field_G.a(var9 - (var29.field_w >> 262769377), var10 - var29.field_u, 256);
                      return;
                    } else {
                      ((bj) this).field_G = new t(var11, var12);
                      tm.a((byte) 97, ((bj) this).field_G);
                      var29.c(112, 144, var29.field_w << 1938381220, var29.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                      r.a(126);
                      ((bj) this).field_G.a(var9 - (var29.field_w >> 262769377), var10 - var29.field_u, 256);
                      return;
                    }
                  } else {
                    ((bj) this).field_G = new t(var11, var12);
                    tm.a((byte) 97, ((bj) this).field_G);
                    var29.c(112, 144, var29.field_w << 1938381220, var29.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                    r.a(126);
                    ((bj) this).field_G.a(var9 - (var29.field_w >> 262769377), var10 - var29.field_u, 256);
                    return;
                  }
                } else {
                  ((bj) this).field_G = new t(var11, var12);
                  tm.a((byte) 97, ((bj) this).field_G);
                  var29.c(112, 144, var29.field_w << 1938381220, var29.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
                  r.a(126);
                  ((bj) this).field_G.a(var9 - (var29.field_w >> 262769377), var10 - var29.field_u, 256);
                  return;
                }
              }
            } else {
              break L1;
            }
          }
        }
        L6: {
          var18 = rg.field_C;
          if (!var18.equals((Object) (Object) ((bj) this).field_m)) {
            ((bj) this).field_m = var18;
            ((bj) this).a((byte) -36);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          super.a(param0, (byte) -63, param2, param3);
          var6 = ((bj) this).field_I.a((byte) -84);
          var35 = (fe) (Object) ((bj) this).field_q;
          var9 = ((bj) this).field_w + param3;
          var10 = var35.a((gm) this, param2, -101) + (var35.b((byte) 116, (gm) this).b(false) >> 3003681);
          if (var6 == q.field_a) {
            break L7;
          } else {
            if (var6 == gn.field_h) {
              break L7;
            } else {
              L8: {
                if (var6 == so.field_u) {
                  var21 = wj.field_h[2];
                  var21.a(var9, -(var21.field_t >> -703169567) + var10, 256);
                  break L8;
                } else {
                  if (var6 == so.field_s) {
                    var20 = wj.field_h[1];
                    var20.a(var9, -(var20.field_t >> -1724886911) + var10, 256);
                    break L8;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
        var22 = wj.field_h[0];
        var17 = var22;
        var11 = var22.field_w << 786474273;
        var12 = var22.field_u << -1216082399;
        if (((bj) this).field_G != null) {
          if (var11 <= ((bj) this).field_G.field_s) {
            if (var12 <= ((bj) this).field_G.field_t) {
              tm.a((byte) 31, ((bj) this).field_G);
              ph.b();
              var22.c(112, 144, var22.field_w << 1938381220, var22.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
              r.a(126);
              ((bj) this).field_G.a(var9 - (var22.field_w >> 262769377), var10 - var22.field_u, 256);
              return;
            } else {
              ((bj) this).field_G = new t(var11, var12);
              tm.a((byte) 97, ((bj) this).field_G);
              var22.c(112, 144, var22.field_w << 1938381220, var22.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
              r.a(126);
              ((bj) this).field_G.a(var9 - (var22.field_w >> 262769377), var10 - var22.field_u, 256);
              return;
            }
          } else {
            ((bj) this).field_G = new t(var11, var12);
            tm.a((byte) 97, ((bj) this).field_G);
            var22.c(112, 144, var22.field_w << 1938381220, var22.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
            r.a(126);
            ((bj) this).field_G.a(var9 - (var22.field_w >> 262769377), var10 - var22.field_u, 256);
            return;
          }
        } else {
          ((bj) this).field_G = new t(var11, var12);
          tm.a((byte) 97, ((bj) this).field_G);
          var22.c(112, 144, var22.field_w << 1938381220, var22.field_u << 287852708, -((bj) this).field_H << 371437898, 4096);
          r.a(126);
          ((bj) this).field_G.a(var9 - (var22.field_w >> 262769377), var10 - var22.field_u, 256);
          return;
        }
    }

    public static void f(byte param0) {
        if (param0 != -37) {
            bj.f((byte) 58);
            field_L = null;
            field_K = null;
            return;
        }
        field_L = null;
        field_K = null;
    }

    bj(sk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (el) (Object) no.b(true));
        ((bj) this).field_J = param1;
        ((bj) this).field_I = param0;
        ((bj) this).a((byte) 125, param2, param3, param5, param4);
    }

    final String b(int param0) {
        if (param0 == 0) {
            return null;
        }
        Object var3 = null;
        ((bj) this).a(102, (gm) null, -69, -47);
        return null;
    }

    final boolean a(gm param0, boolean param1) {
        if (param1) {
            ((bj) this).a(94, (byte) 61, 68, 60);
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Confirm Password: ";
    }
}
