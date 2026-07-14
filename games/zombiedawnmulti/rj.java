/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends id {
    private boolean field_H;
    static int field_J;
    static ja[] field_I;
    static int field_F;
    private boolean field_G;

    final void f(byte param0) {
        if (param0 >= -79) {
            rj.i(14);
        }
    }

    rj(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((rj) this).field_G = false;
        ((rj) this).field_H = false;
        int var4 = hp.a((byte) 104, g.field_a, 2);
        if (var4 != 1) {
            // if_icmpne L53
            ((rj) this).field_H = true;
        } else {
            ((rj) this).field_G = true;
        }
    }

    final static void a(int param0, byte param1, String param2) {
        er.field_i = un.field_k;
        int var3 = 75 % ((43 - param1) / 55);
        b.field_b = param0;
    }

    final void a(int param0, nm param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = param1.c(((rj) this).g(65) + -24, -20126);
        int var4 = param1.d(((rj) this).h(96) + -24, 106);
        if (var3 <= 47) {
            // if_icmpgt L88
            // iflt L88
            // iflt L88
        } else {
            return;
        }
        if (((rj) this).field_G) {
            cp.field_X[((rj) this).field_C].b(var3, var4);
        } else {
            if (((rj) this).field_H) {
                cp.field_X[((rj) this).field_C].a(var3, var4);
            } else {
                cp.field_X[((rj) this).field_C].g(var3, var4);
            }
        }
        if (param0 != -10136) {
            rj.i(-46);
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != 8784) {
            field_F = -106;
        }
    }

    final static void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var28 = null;
        kj var28_ref = null;
        ga var29 = null;
        Object var30 = null;
        kj var30_ref = null;
        long[][] var37 = null;
        int[][] var38 = null;
        L0: {
          var30 = null;
          var28 = null;
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 3) {
            break L0;
          } else {
            rj.j(-22);
            break L0;
          }
        }
        L1: {
          var29 = s.field_e;
          var2 = var29.g(param0 + 31362);
          if (var2 == 0) {
            var3 = var29.d((byte) 69);
            var4 = (nh) (Object) pn.field_f.c(71);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 == var4.field_l) {
                    break L3;
                  } else {
                    var4 = (nh) (Object) pn.field_f.b(6);
                    continue L2;
                  }
                }
              }
              if (var4 == null) {
                ak.a((byte) -119);
                return;
              } else {
                L4: {
                  var5 = var29.g(param0 ^ 31366);
                  if (var5 == 0) {
                    break L4;
                  } else {
                    var6 = var4.field_k;
                    ha.field_j[0].field_g = false;
                    ha.field_j[0].field_d = ta.field_lb;
                    ha.field_j[0].field_c = null;
                    var7 = var4.field_f;
                    var8_int = 1;
                    L5: while (true) {
                      if (var5 <= var8_int) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var37 = new long[3][var6];
                        var38 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.g(31365);
                        if ((var18 ^ -1) < -1) {
                          var19 = 0;
                          L6: while (true) {
                            if (var18 <= var19) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var29.g(31365);
                                var21 = ha.field_j[var20].field_d;
                                var22 = var29.a((byte) -30);
                                var24 = var29.field_j;
                                if (var6 > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = ha.field_j[var20].field_c;
                                  var37[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var7 <= var25) {
                                      break L7;
                                    } else {
                                      var15++;
                                      var38[0][var15] = var29.i(-1478490344);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (sf.a(1, var21)) {
                                    var8[1][var13] = ta.field_lb;
                                    var9[1][var13] = null;
                                    var37[1][var13] = var22;
                                    var13++;
                                    var29.field_j = var24;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        var16++;
                                        var38[1][var16] = var29.i(-1478490344);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!ha.field_j[var20].field_g) {
                                  ha.field_j[var20].field_g = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = ha.field_j[var20].field_c;
                                  var37[2][var14] = var22;
                                  var14++;
                                  var29.field_j = var24;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var25 < var7) {
                                      var17++;
                                      var38[2][var17] = var29.i(-1478490344);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        ha.field_j[var8_int].field_d = var29.f((byte) -121);
                        ha.field_j[var8_int].field_g = false;
                        if (1 != var29.g(31365)) {
                          ha.field_j[var8_int].field_c = null;
                          var8_int++;
                          continue L5;
                        } else {
                          ha.field_j[var8_int].field_c = var29.f((byte) -81);
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4.a(true);
                break L1;
              }
            }
          } else {
            if (var2 != 1) {
              bd.a("HS1: " + ci.a(param0 ^ 3), (Throwable) null, false);
              ak.a((byte) -123);
              break L1;
            } else {
              var3 = var29.d((byte) 69);
              var30_ref = (kj) (Object) md.field_u.c(102);
              L12: while (true) {
                L13: {
                  if (var30_ref == null) {
                    break L13;
                  } else {
                    if (var30_ref.field_i != var3) {
                      var28_ref = (kj) (Object) md.field_u.b(6);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var28_ref == null) {
                  ak.a((byte) -115);
                  return;
                } else {
                  var28_ref.a(true);
                  break L1;
                }
              }
            }
          }
        }
    }

    static {
    }
}
