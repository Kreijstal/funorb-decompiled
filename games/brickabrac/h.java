/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class h extends oc implements sd {
    oc field_E;
    static boolean[] field_D;
    static String[] field_F;
    static tp[] field_C;

    public static void f(byte param0) {
        field_C = null;
        field_F = null;
        if (param0 > -82) {
            Object var2 = null;
            lo discarded$0 = h.a((String) null, false);
        }
        field_D = null;
    }

    private final boolean b(boolean param0, oc param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0;
        int stackOut_6_0;
        if (param0) {
          L0: {
            L1: {
              if (((h) this).field_E == null) {
                break L1;
              } else {
                if (((h) this).field_E.f(-124)) {
                  break L1;
                } else {
                  if (!((h) this).field_E.a(true, param1)) {
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
          return false;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        ki.field_d = param1;
        if (param0 != 13894) {
            h.a(-92, -23);
        }
        l var2 = (l) (Object) wd.field_v.d(param0 ^ -13940);
        while (var2 != null) {
            if (var2.field_n.b(0)) {
                var2.field_j.e(ki.field_d * var2.field_i + 128 >> -577644792);
            } else {
                var2.b((byte) 111);
            }
            var2 = (l) (Object) wd.field_v.a((byte) 116);
        }
        if (jc.field_M == null) {
        } else {
            var2 = (l) (Object) jc.field_M.d(param0 + -13977);
            while (var2 != null) {
                if (!var2.field_n.b(0)) {
                    var2.b((byte) 111);
                } else {
                    var2.field_j.e(var2.field_i * ki.field_d - -128 >> -134713560);
                }
                var2 = (l) (Object) jc.field_M.a((byte) 116);
            }
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (((h) this).field_E != null) {
            if (((h) this).field_E.f(-127)) {
                if (((h) this).field_E.a(param0, (byte) 110, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param0;
        if (-81 == (var5 ^ -1)) {
            return !pe.field_l[81] ? this.b(true, param2) : this.a(param2, (byte) -35);
        }
        if (param1 != 110) {
            field_C = null;
            return false;
        }
        return false;
    }

    h(int param0, int param1, int param2, int param3, ub param4, uh param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String d(int param0) {
        String var3 = null;
        if (param0 <= 6) {
            field_C = null;
        }
        String var2 = super.d(66);
        if (null != ((h) this).field_E) {
            var3 = ((h) this).field_E.d(61);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((h) this).a((byte) -19);
    }

    final void b(boolean param0) {
        if (!(null == ((h) this).field_E)) {
            ((h) this).field_E.b(param0);
        }
        if (param0) {
            boolean discarded$0 = ((h) this).f(-98);
        }
    }

    final int e(byte param0) {
        int var2 = 100 / ((-17 - param0) / 43);
        return ((h) this).field_E != null ? ((h) this).field_E.e((byte) -71) : 0;
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (param2 != 24) {
            return null;
        }
        if (!(!((h) this).a(param3, param2 ^ 1595638000, param0, param1))) {
            ((h) this).a(param1, param0, param2 + -24, param3);
            ((h) this).a(param3, true, param1, param0);
        }
        return param3;
    }

    void a(oc param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (null != ((h) this).field_E) {
            ((h) this).field_E.a(param0, (byte) 0, param2 + ((h) this).field_o, param3 + ((h) this).field_w);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0;
        int stackOut_6_0;
        L0: {
          if (param3 <= -125) {
            break L0;
          } else {
            int discarded$2 = ((h) this).e((byte) 12);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((h) this).field_E) {
              break L2;
            } else {
              if (!((h) this).field_E.f(-83)) {
                break L2;
              } else {
                if (!((h) this).field_E.a(param0, param1, param2, -126, param4, param5, param6)) {
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

    void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        if (!(null == ((h) this).field_E)) {
            ((h) this).field_E.a(param0, param1, ((h) this).field_w + param2, param3, 19223, ((h) this).field_o + param5);
        }
        if (param4 != 19223) {
            field_C = null;
        }
    }

    final static void a(int param0, int param1, byte param2, byte[] param3, int[] param4) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var5 = 0;
        if (param2 != 114) {
            field_F = null;
        }
        while (var5 < fi.field_w.length) {
            param0 = fi.field_w[var5];
            var6 = var5 << 1887129444;
            while (true) {
                param0--;
                if (0 == param0) {
                    break;
                }
                var6++;
                param1 = ek.field_jb[var6];
                param4[param3[param1]] = param4[param3[param1]] + 1;
                ek.field_jb[param4[param3[param1]]] = param1;
            }
            var5++;
        }
    }

    final void a(StringBuilder param0, boolean param1, Hashtable param2, int param3) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        StringBuilder discarded$0 = param0.append(10);
        for (var5 = 0; param3 >= var5; var5++) {
            StringBuilder discarded$1 = param0.append(32);
        }
        if (!param1) {
            return;
        }
        if (((h) this).field_E != null) {
            StringBuilder discarded$3 = ((h) this).field_E.a(1 + param3, param2, 24, param0);
        } else {
            StringBuilder discarded$4 = param0.append("null");
        }
    }

    final boolean a(boolean param0, oc param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0;
        int stackOut_5_0;
        if (param0) {
          L0: {
            L1: {
              if (((h) this).field_E == null) {
                break L1;
              } else {
                if (!((h) this).field_E.a(true, param1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (-1 == (param2 ^ -1)) {
            if (!(null == ((h) this).field_l)) {
                ((h) this).field_l.a(true, -20618, param1, (oc) this, param0);
            }
        }
        if (!(null == ((h) this).field_E)) {
            ((h) this).field_E.a(((h) this).field_w + param0, param1 + ((h) this).field_o, param2, (byte) -11);
        }
        if (param3 != -11) {
            field_C = null;
        }
    }

    oc h(byte param0) {
        oc var2 = ((h) this).field_E;
        if (param0 != 25) {
            Object var3 = null;
            boolean discarded$0 = this.b(true, (oc) null);
        }
        if (var2 == null) {
            return null;
        }
        if (!var2.f(-95)) {
            return null;
        }
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, int param6) {
        if (param3 > -122) {
            return true;
        }
        if (gp.a(-4858)) {
            hc.a(param5, -7812, param4, param1);
            if (bm.field_d != null) {
                if (bm.field_d.a(-2, param1, param6, param0, param5)) {
                    cr.f((byte) -124);
                    param5 = false;
                }
            }
            wp.a(124, param1, param5);
            vo.a(param2, param5, 124);
            param5 = false;
        }
        return param5;
    }

    private final boolean a(oc param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0;
        int stackOut_6_0;
        L0: {
          if (param1 == -35) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((h) this).field_E == null) {
              break L2;
            } else {
              if (((h) this).field_E.f(-117)) {
                break L2;
              } else {
                if (!((h) this).field_E.a(true, param0)) {
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

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0;
        int stackOut_5_0;
        L0: {
          if (param6 == 0) {
            break L0;
          } else {
            oc discarded$2 = ((h) this).h((byte) -11);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((h) this).field_E == null) {
              break L2;
            } else {
              if (!((h) this).field_E.a(param0, param1, ((h) this).field_o + param2, param3 + ((h) this).field_w, param4, param5, 0)) {
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

    void a(byte param0) {
        if (param0 > -7) {
            field_D = null;
        }
        if (((h) this).field_E != null) {
            ((h) this).field_E.e(1);
        }
    }

    final boolean f(int param0) {
        if (param0 >= -49) {
            return true;
        }
        return null != ((h) this).h((byte) 25) ? true : false;
    }

    final static lo a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0;
        int stackOut_14_0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = param0.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= -65) {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(var2 - 1) == 34) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (92 == var5) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L1;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return wg.field_c;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return wg.field_c;
              }
            } else {
              var3 = param1 ? 1 : 0;
              var4 = 0;
              L3: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (-1 == qa.field_v.indexOf(var5)) {
                      return wg.field_c;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    L4: {
                      if (-1 == (var4 ^ -1)) {
                        break L4;
                      } else {
                        if (-1 + var2 == var4) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L3;
                          }
                        }
                      }
                    }
                    return wg.field_c;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return pi.field_r;
          }
        } else {
          return la.field_a;
        }
    }

    final static void g(byte param0) {
        bn.field_q = new mh(0L, (mh) null);
        if (param0 != -24) {
            return;
        }
        if (vd.field_e) {
            bn.field_q.a(dn.field_N, 0);
        }
        bn.field_q.a(vn.field_A, 0);
        ap.field_b = new vj(fi.field_u, bn.field_q);
        fe.field_gb = new mh(0L, (mh) null);
        fe.field_gb.a((mh) (Object) ap.field_b.field_d, 0);
        fe.field_gb.a(jf.field_k, 0);
        cg.b(param0 + 44);
    }

    static {
    }
}
