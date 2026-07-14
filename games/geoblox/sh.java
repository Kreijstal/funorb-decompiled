/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sh extends el implements ql {
    static sc field_y;
    static int[] field_x;
    static String field_z;
    el field_A;

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var8 = 124 % ((-3 - param1) / 38);
            if (((sh) this).field_A == null) {
              break L1;
            } else {
              if (!((sh) this).field_A.a(((sh) this).field_m + param0, -96, ((sh) this).field_v + param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Geoblox.field_C;
        if (param1 > param0) {
          if (param5 > param0 + 1) {
            L0: {
              if (param0 - -5 >= param5) {
                break L0;
              } else {
                if (param3 == param2) {
                  break L0;
                } else {
                  var7 = (1 & (param3 & param2)) + (param2 >> 1184836673) + (param3 >> -826575679);
                  var8 = param0;
                  var9 = param3;
                  if (param4 >= 106) {
                    var10 = param2;
                    var11 = param0;
                    L1: while (true) {
                      if (var11 >= param5) {
                        sh.a(param0, param1, var9, param3, (byte) 118, var8, param6);
                        sh.a(var8, param1, param2, var10, (byte) 107, param5, param6);
                        return;
                      } else {
                        L2: {
                          var12 = qi.field_i[var11];
                          if (!param6) {
                            stackOut_22_0 = gk.field_a[var12];
                            stackIn_23_0 = stackOut_22_0;
                            break L2;
                          } else {
                            stackOut_21_0 = hg.field_a[var12];
                            stackIn_23_0 = stackOut_21_0;
                            break L2;
                          }
                        }
                        var13 = stackIn_23_0;
                        if (var13 > var7) {
                          qi.field_i[var11] = qi.field_i[var8];
                          var8++;
                          qi.field_i[var8] = var12;
                          if (var9 > var13) {
                            var9 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        } else {
                          if (var10 < var13) {
                            var10 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var7 = -1 + param5;
            L3: while (true) {
              if (var7 <= param0) {
                return;
              } else {
                var8 = param0;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = qi.field_i[var8];
                    var10 = qi.field_i[1 + var8];
                    if (ig.a(param6, var10, (byte) -125, var9)) {
                      qi.field_i[var8] = var10;
                      qi.field_i[var8 + 1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(el param0, int param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 22439) {
            break L0;
          } else {
            var4 = null;
            ((sh) this).a(73, 123, false, (el) null, 48, 45);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sh) this).field_A == null) {
              break L2;
            } else {
              if (((sh) this).field_A.e((byte) 54)) {
                break L2;
              } else {
                if (!((sh) this).field_A.a((byte) -117, param0)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(byte param0, int[] param1) {
        int var2 = 0;
        long var3 = 0L;
        ma var5_ref_ma = null;
        int var5 = 0;
        int var6_int = 0;
        ma var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        var2 = -108 / ((-71 - param0) / 45);
        if (eh.field_b != pk.field_l) {
          return false;
        } else {
          L0: {
            var3 = oa.a(-12520);
            if (ab.field_b == -1) {
              break L0;
            } else {
              if (-1 <= pc.field_f) {
                break L0;
              } else {
                var5_ref_ma = (ma) (Object) va.field_c.g(0);
                if (var5_ref_ma == null) {
                  break L0;
                } else {
                  if (var3 <= var5_ref_ma.field_f) {
                    break L0;
                  } else {
                    var5_ref_ma.a(false);
                    p.field_k = var5_ref_ma.field_g.length;
                    eh.field_d.field_f = 0;
                    var6_int = 0;
                    L1: while (true) {
                      if (var6_int >= p.field_k) {
                        ad.field_o = dc.field_b;
                        dc.field_b = kg.field_n;
                        kg.field_n = me.field_l;
                        me.field_l = var5_ref_ma.field_h;
                        return true;
                      } else {
                        eh.field_d.field_j[var6_int] = var5_ref_ma.field_g[var6_int];
                        var6_int++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
          L2: while (true) {
            L3: {
              if (-1 >= (pc.field_f ^ -1)) {
                break L3;
              } else {
                eh.field_d.field_f = 0;
                if (el.b(30000, 1)) {
                  pc.field_f = eh.field_d.j((byte) 122);
                  eh.field_d.field_f = 0;
                  p.field_k = param1[pc.field_f];
                  break L3;
                } else {
                  return false;
                }
              }
            }
            if (nf.a(false)) {
              if (ab.field_b == 0) {
                ad.field_o = dc.field_b;
                dc.field_b = kg.field_n;
                kg.field_n = me.field_l;
                me.field_l = pc.field_f;
                pc.field_f = -1;
                return true;
              } else {
                L4: {
                  var5 = ab.field_b;
                  if (0.0 == fc.field_a) {
                    break L4;
                  } else {
                    var5 = (int)((double)var5 + bh.field_d.nextGaussian() * fc.field_a);
                    if (-1 >= (var5 ^ -1)) {
                      break L4;
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  }
                }
                var6 = new ma((long)var5 + var3, pc.field_f, new byte[p.field_k]);
                var7 = 0;
                L5: while (true) {
                  if (p.field_k <= var7) {
                    va.field_c.a(-108, (hf) (Object) var6);
                    pc.field_f = -1;
                    continue L2;
                  } else {
                    var6.field_g[var7] = eh.field_d.field_j[var7];
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        if (((sh) this).a(param1, param3, 10095, param2)) {
            ((sh) this).a(param3, param2, 34, param1);
            ((sh) this).b(param3, param1, param2, 0);
        }
        if (param0 != 0) {
            field_y = null;
        }
        return param1;
    }

    el e(int param0) {
        el var2 = ((sh) this).field_A;
        if (var2 != null) {
            if (!(!var2.e((byte) 54))) {
                return var2;
            }
        }
        if (param0 == -4863) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((sh) this).a(114, -49, -37, 74, 126, 94, (el) null);
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (0 == param3) {
            if (!(((sh) this).field_q == null)) {
                ((sh) this).field_q.a(param0, -50, param1, true, (el) this);
            }
        }
        int var5 = 85 % ((param2 - 1) / 43);
        if (((sh) this).field_A != null) {
            ((sh) this).field_A.a(((sh) this).field_v + param0, param1 - -((sh) this).field_m, (byte) -74, param3);
        }
    }

    void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        if (!param2) {
            return;
        }
        if (null != ((sh) this).field_A) {
            ((sh) this).field_A.a(((sh) this).field_v + param0, param1, true, param3, param4 + ((sh) this).field_m, param5);
        }
    }

    final int d(byte param0) {
        if (param0 <= 82) {
            Object var3 = null;
            boolean discarded$0 = ((sh) this).a(-119, 24, -30, 98, 113, (el) null, 116);
        }
        return ((sh) this).field_A != null ? ((sh) this).field_A.d((byte) 123) : 0;
    }

    final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        StringBuilder discarded$0 = param1.append(10);
        for (var5 = param3; param0 >= var5; var5++) {
            StringBuilder discarded$1 = param1.append(32);
        }
        if (((sh) this).field_A == null) {
            StringBuilder discarded$3 = param1.append("null");
        } else {
            StringBuilder discarded$4 = ((sh) this).field_A.a(0, param1, param2, param0 - -1);
        }
    }

    String c(byte param0) {
        String var3 = null;
        String var2 = super.c(param0);
        if (!(((sh) this).field_A == null)) {
            var3 = ((sh) this).field_A.c((byte) 69);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    private final boolean a(el param0, byte param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = -11 % ((param1 - -73) / 40);
            if (null == ((sh) this).field_A) {
              break L1;
            } else {
              if (((sh) this).field_A.e((byte) 54)) {
                break L1;
              } else {
                if (!((sh) this).field_A.a((byte) -85, param0)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(byte param0, el param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -30) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((sh) this).field_A) {
              break L2;
            } else {
              if (!((sh) this).field_A.a((byte) -34, param1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            Object var3 = null;
            ((sh) this).a(false, 15, (el) null, 31);
        }
        return ((sh) this).e(-4863) != null ? true : false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param3 == -1) {
          L0: {
            L1: {
              if (null == ((sh) this).field_A) {
                break L1;
              } else {
                if (!((sh) this).field_A.e((byte) 54)) {
                  break L1;
                } else {
                  if (!((sh) this).field_A.a(param0, param1, param2, -1, param4, param5, param6)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void d(int param0) {
        if (null != ((sh) this).field_A) {
            ((sh) this).field_A.d(-123);
        }
        if (param0 >= -122) {
            sh.a((byte) 83);
        }
    }

    void b(boolean param0) {
        if (null != ((sh) this).field_A) {
            ((sh) this).field_A.c(-73);
        }
        if (!param0) {
            field_x = null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            return;
        }
        field_y = null;
        field_z = null;
        field_x = null;
    }

    void a(boolean param0, int param1, el param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((sh) this).field_A != null) {
            ((sh) this).field_A.a(false, ((sh) this).field_m + param1, param2, ((sh) this).field_v + param3);
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (null != ((sh) this).field_A) {
            if (((sh) this).field_A.e((byte) 54)) {
                if (((sh) this).field_A.a(param0, 13, param2, param3)) {
                    return true;
                }
            }
        }
        if (param1 != 13) {
            field_y = null;
        }
        int var5 = param0;
        if (-81 == (var5 ^ -1)) {
            return kj.field_o[81] ? this.a(param3, (byte) -119) : this.a(param3, 22439);
        }
        return false;
    }

    sh(int param0, int param1, int param2, int param3, dh param4, bb param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) -40, param3, param4);
        if (param2 > -6) {
            field_z = null;
        }
        ((sh) this).b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
        field_z = "FPS: <%0>";
    }
}
