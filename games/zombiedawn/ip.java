/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ip extends sp {
    private rj field_n;
    vo field_s;
    static String field_o;
    static int[] field_r;
    static de field_l;
    fi field_m;
    static boolean[] field_q;
    static vn[] field_p;

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        u var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var1 = 120;
        if (param0 <= -1) {
          var2 = 180;
          var3 = 240;
          var4 = ij.field_L;
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4.length) {
              return;
            } else {
              L1: {
                var6 = var4[var5];
                if (var6.field_b == 0) {
                  var6.field_l = 0;
                  var6.field_h = 24;
                  var6.field_a = var6.field_l + (var1 << 74272292);
                  break L1;
                } else {
                  if ((var6.field_b ^ -1) != -2) {
                    if (-3 == (var6.field_b ^ -1)) {
                      var6.field_l = -pb.a(so.field_a, 19, 1) << -1940293308;
                      var6.field_a = (var3 << -1405261916) + var6.field_l;
                      var6.field_h = 48;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var6.field_l = -pb.a(so.field_a, 12, 1) << 1227225284;
                    var6.field_a = (var2 << -1054615292) + var6.field_l;
                    var6.field_h = 36;
                    break L1;
                  }
                }
              }
              var6.field_k = false;
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int[] param0, lf param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fn var11 = null;
        int var12 = 0;
        rj stackIn_11_0 = null;
        lf stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        rj stackIn_12_0 = null;
        lf stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        rj stackIn_13_0 = null;
        lf stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        rj stackOut_10_0 = null;
        lf stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        rj stackOut_12_0 = null;
        lf stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        rj stackOut_11_0 = null;
        lf stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        L0: {
          var12 = ZombieDawn.field_J;
          if (-1 == (((ip) this).field_n.field_l[param1.field_z] & 4)) {
            break L0;
          } else {
            if (-1 <= param1.field_k) {
              break L0;
            } else {
              var7 = ((ip) this).field_n.field_r[param1.field_z] / qf.field_p;
              L1: while (true) {
                var8 = (var7 + 1048575 + -param1.field_D) / var7;
                if (var8 <= param4) {
                  L2: {
                    param1.field_E.a(param0, param2, var8);
                    param4 = param4 - var8;
                    param1.field_D = param1.field_D + (var7 * var8 - 1048576);
                    param2 = param2 + var8;
                    var9 = qf.field_p / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param1.field_E;
                    if (0 != ((ip) this).field_n.field_O[param1.field_z]) {
                      L4: {
                        param1.field_E = fn.a(param1.field_s, var11.m(), 0, var11.g());
                        stackOut_10_0 = ((ip) this).field_n;
                        stackOut_10_1 = (lf) param1;
                        stackOut_10_2 = 124;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        if (param1.field_u.field_j[param1.field_i] >= 0) {
                          stackOut_12_0 = (rj) (Object) stackIn_12_0;
                          stackOut_12_1 = (lf) (Object) stackIn_12_1;
                          stackOut_12_2 = stackIn_12_2;
                          stackOut_12_3 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          stackIn_13_3 = stackOut_12_3;
                          break L4;
                        } else {
                          stackOut_11_0 = (rj) (Object) stackIn_11_0;
                          stackOut_11_1 = (lf) (Object) stackIn_11_1;
                          stackOut_11_2 = stackIn_11_2;
                          stackOut_11_3 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          stackIn_13_3 = stackOut_11_3;
                          break L4;
                        }
                      }
                      ((rj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0);
                      param1.field_E.b(var9, var11.k());
                      break L3;
                    } else {
                      param1.field_E = fn.a(param1.field_s, var11.m(), var11.k(), var11.g());
                      break L3;
                    }
                  }
                  L5: {
                    if (param1.field_u.field_j[param1.field_i] < 0) {
                      param1.field_E.e(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11.c(var9);
                  var11.a(param0, param2, param5 + -param2);
                  if (!var11.f()) {
                    continue L1;
                  } else {
                    ((ip) this).field_m.b((sp) (Object) var11);
                    continue L1;
                  }
                } else {
                  param1.field_D = param1.field_D + var7 * param4;
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          if (param3 == 0) {
            break L6;
          } else {
            int discarded$1 = ((ip) this).a();
            break L6;
          }
        }
        param1.field_E.a(param0, param2, param4);
    }

    final sp d() {
        lf var1 = null;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        L0: while (true) {
          var1 = (lf) (Object) ((ip) this).field_s.a(false);
          if (var1 != null) {
            if (null != var1.field_E) {
              return (sp) (Object) var1.field_E;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static ek a(int param0, int param1, int param2, boolean param3) {
        ek var4 = (ek) (Object) td.field_c.f(32);
        if (!param3) {
            return null;
        }
        if (var4 == null) {
            var4 = new ek();
        }
        var4.a(param1, param0, param2, 2011722288);
        return var4;
    }

    private final void a(lf param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        rj stackIn_8_0 = null;
        lf stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        rj stackIn_9_0 = null;
        lf stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        rj stackIn_10_0 = null;
        lf stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        rj stackOut_7_0 = null;
        lf stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        rj stackOut_9_0 = null;
        lf stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        rj stackOut_8_0 = null;
        lf stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        if (param2 == -26206) {
          L0: {
            if ((4 & ((ip) this).field_n.field_l[param0.field_z]) == 0) {
              break L0;
            } else {
              if (param0.field_k >= 0) {
                break L0;
              } else {
                var4 = ((ip) this).field_n.field_r[param0.field_z] / qf.field_p;
                var5 = (var4 + 1048575 - param0.field_D) / var4;
                param0.field_D = 1048575 & param1 * var4 + param0.field_D;
                if (var5 <= param1) {
                  L1: {
                    if (((ip) this).field_n.field_O[param0.field_z] == 0) {
                      param0.field_E = fn.a(param0.field_s, param0.field_E.m(), param0.field_E.k(), param0.field_E.g());
                      break L1;
                    } else {
                      L2: {
                        param0.field_E = fn.a(param0.field_s, param0.field_E.m(), 0, param0.field_E.g());
                        stackOut_7_0 = ((ip) this).field_n;
                        stackOut_7_1 = (lf) param0;
                        stackOut_7_2 = param2 ^ 26145;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        if (-1 >= (param0.field_u.field_j[param0.field_i] ^ -1)) {
                          stackOut_9_0 = (rj) (Object) stackIn_9_0;
                          stackOut_9_1 = (lf) (Object) stackIn_9_1;
                          stackOut_9_2 = stackIn_9_2;
                          stackOut_9_3 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          break L2;
                        } else {
                          stackOut_8_0 = (rj) (Object) stackIn_8_0;
                          stackOut_8_1 = (lf) (Object) stackIn_8_1;
                          stackOut_8_2 = stackIn_8_2;
                          stackOut_8_3 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          break L2;
                        }
                      }
                      ((rj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                      break L1;
                    }
                  }
                  L3: {
                    if (param0.field_u.field_j[param0.field_i] < 0) {
                      param0.field_E.e(-1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param1 = param0.field_D / var4;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          param0.field_E.a(param1);
          return;
        } else {
          return;
        }
    }

    final sp c() {
        lf var1 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_E)) {
            return (sp) (Object) var1.field_E;
        }
        return ((ip) this).d();
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if (param2 != null) {
          var3 = param2.length();
          if (param0 == 1048576) {
            L0: {
              if (1 > var3) {
                break L0;
              } else {
                if (-13 > (var3 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var4 = fm.a(param2, -127);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if ((var4.length() ^ -1) > -2) {
                        break L1;
                      } else {
                        L2: {
                          if (vi.a(31153, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!vi.a(31153, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param2.length() <= var6) {
                                  if (-1 > (var5 ^ -1)) {
                                    return dn.field_G;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (vi.a(31153, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param1) {
                                      return hl.field_f;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        return dn.field_G;
                      }
                    }
                  }
                  return pg.field_r;
                }
              }
            }
            return pg.field_r;
          } else {
            return null;
          }
        } else {
          return pg.field_r;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        lf var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        ((ip) this).field_m.a(param0, param1, param2);
        var6 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (!((ip) this).field_n.b(30296, var6)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var6.field_r >= var5) {
                    this.a(param0, var6, var4, (byte) 0, var5, var4 + var5);
                    var6.field_r = var6.field_r - var5;
                    break L1;
                  } else {
                    this.a(param0, var6, var4, (byte) 0, var6.field_r, var5 + var4);
                    var5 = var5 - var6.field_r;
                    var4 = var4 + var6.field_r;
                    if (((ip) this).field_n.a(-32464, var4, var6, param0, var5)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (lf) (Object) ((ip) this).field_s.a(false);
            continue L0;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 != -1) {
            field_l = null;
        }
        if ((7 & param0) != 0) {
            var2 = -(7 & param0) + 8;
        }
        int var3 = param0 - -var2;
        return var3;
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 != 10) {
            return;
        }
        field_r = null;
        field_q = null;
        field_p = null;
        field_o = null;
    }

    final void a(int param0) {
        int var2 = 0;
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        ((ip) this).field_m.a(param0);
        var3 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ip) this).field_n.b(30296, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_r >= var2) {
                    this.a(var3, var2, -26206);
                    var3.field_r = var3.field_r - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_r, -26206);
                    var2 = var2 - var3.field_r;
                    if (!((ip) this).field_n.a(-32464, 0, var3, (int[]) null, var2)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (lf) (Object) ((ip) this).field_s.a(false);
            continue L0;
          }
        }
    }

    final int a() {
        return 0;
    }

    ip(rj param0) {
        ((ip) this).field_s = new vo();
        ((ip) this).field_m = new fi();
        ((ip) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_o = "(Click to close)";
    }
}
