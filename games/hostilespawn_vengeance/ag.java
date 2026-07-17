/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends am {
    static int field_k;
    int field_v;
    int field_r;
    static float field_w;
    String field_i;
    int field_o;
    static String field_j;
    String field_n;
    mh field_p;
    static td field_t;
    int field_s;
    int field_m;
    ce field_l;
    boolean field_u;
    int field_q;
    nn field_h;
    int field_x;

    boolean g(int param0) {
        if (param0 != -9015) {
            boolean discarded$0 = ((ag) this).a(118, 53, false, -73);
            return false;
        }
        return false;
    }

    final static bd d(byte param0) {
        int var1 = 0;
        byte[] var2 = null;
        Object var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int[] var9 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var1 = hd.field_r[0] * sf.field_X[0];
        if (param0 < 36) {
          L0: {
            L1: {
              field_k = 78;
              var2 = ja.field_e[0];
              if (!qj.field_k[0]) {
                break L1;
              } else {
                var8 = vh.field_a[0];
                var5_ref_int__ = new int[var1];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var1) {
                    var3 = (Object) (Object) new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    var5_ref_int__[var6] = ll.a(ua.a(255, (int) var8[var6]) << 24, bf.field_d[ua.a((int) var2[var6], 255)]);
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L3: while (true) {
              L4: {
                if (var1 <= var5) {
                  break L4;
                } else {
                  var9[var5] = bf.field_d[ua.a((int) var2[var5], 255)];
                  var5++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = (Object) (Object) new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
              break L0;
            }
          }
          uj.d(121);
          return (bd) var3;
        } else {
          L5: {
            L6: {
              var2 = ja.field_e[0];
              if (!qj.field_k[0]) {
                break L6;
              } else {
                var8 = vh.field_a[0];
                var5_ref_int__ = new int[var1];
                var6 = 0;
                L7: while (true) {
                  if (var6 >= var1) {
                    var3 = (Object) (Object) new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    var5_ref_int__[var6] = ll.a(ua.a(255, (int) var8[var6]) << 24, bf.field_d[ua.a((int) var2[var6], 255)]);
                    var6++;
                    continue L7;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L8: while (true) {
              if (var1 <= var5) {
                var3 = (Object) (Object) new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
                break L5;
              } else {
                var9[var5] = bf.field_d[ua.a((int) var2[var5], 255)];
                var5++;
                continue L8;
              }
            }
          }
          uj.d(121);
          return (bd) var3;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          ((ag) this).a((ag) this, param0, 0, param3);
          var5 = ((ag) this).g(-9015) ? 1 : 0;
          if (!param2) {
            if (var5 != 0) {
              if (pf.field_o != 0) {
                ((ag) this).c((byte) -82);
                if (var7 == 0) {
                  mn.field_c = ig.field_L;
                  am.a(((ag) this).e(34), (byte) -82);
                  if (param1 != 8799) {
                    bd discarded$22 = ag.d((byte) 54);
                    return param2;
                  } else {
                    return param2;
                  }
                } else {
                  if (ll.field_c == 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L0;
                    } else {
                      boolean discarded$23 = ((ag) this).a(rb.field_m, param0, param3, 0, (ag) this, j.field_c, ll.field_c);
                      break L0;
                    }
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(((ag) this).e(34), (byte) -82);
                if (param1 == 8799) {
                  return param2;
                } else {
                  bd discarded$24 = ag.d((byte) 54);
                  return param2;
                }
              }
            } else {
              mn.field_c = ig.field_L;
              am.a(((ag) this).e(34), (byte) -82);
              if (param1 != 8799) {
                bd discarded$25 = ag.d((byte) 54);
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            if (ll.field_c == 0) {
              break L0;
            } else {
              if (var5 == 0) {
                break L0;
              } else {
                boolean discarded$26 = ((ag) this).a(rb.field_m, param0, param3, 0, (ag) this, j.field_c, ll.field_c);
                break L0;
              }
            }
          }
        }
        if (pf.field_o != 0) {
          L1: {
            if (!((ag) this).a(ec.field_a, param3, param0, rc.field_b, (byte) 110, (ag) this, pf.field_o)) {
              break L1;
            } else {
              param2 = false;
              if (var7 != 0) {
                break L1;
              } else {
                if (ig.field_L != 0) {
                  mn.field_c = ig.field_L;
                  am.a(((ag) this).e(34), (byte) -82);
                  if (param1 != 8799) {
                    bd discarded$27 = ag.d((byte) 54);
                    return param2;
                  } else {
                    return param2;
                  }
                } else {
                  if (mn.field_c != 0) {
                    ((ag) this).a(j.field_c, param0, param3, rb.field_m, (ag) this, param1 + -8799);
                    var6 = rh.field_D;
                    if (var6 != null) {
                      if (!(var6.field_p instanceof k)) {
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(((ag) this).e(34), (byte) -82);
                        if (param1 != 8799) {
                          bd discarded$28 = ag.d((byte) 54);
                          return param2;
                        } else {
                          return param2;
                        }
                      } else {
                        ((k) (Object) var6.field_p).a(var6, false, (od) null);
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(((ag) this).e(34), (byte) -82);
                        if (param1 != 8799) {
                          bd discarded$29 = ag.d((byte) 54);
                          return param2;
                        } else {
                          return param2;
                        }
                      }
                    } else {
                      mn.field_c = ig.field_L;
                      am.a(((ag) this).e(34), (byte) -82);
                      if (param1 != 8799) {
                        bd discarded$30 = ag.d((byte) 54);
                        return param2;
                      } else {
                        return param2;
                      }
                    }
                  } else {
                    mn.field_c = ig.field_L;
                    am.a(((ag) this).e(34), (byte) -82);
                    if (param1 != 8799) {
                      bd discarded$31 = ag.d((byte) 54);
                      return param2;
                    } else {
                      return param2;
                    }
                  }
                }
              }
            }
          }
          if (var5 != 0) {
            L2: {
              ((ag) this).c((byte) 47);
              if (ig.field_L != 0) {
                break L2;
              } else {
                if (mn.field_c != 0) {
                  ((ag) this).a(j.field_c, param0, param3, rb.field_m, (ag) this, param1 + -8799);
                  var6 = rh.field_D;
                  if (var6 != null) {
                    if (!(var6.field_p instanceof k)) {
                      rh.field_D = null;
                      break L2;
                    } else {
                      ((k) (Object) var6.field_p).a(var6, false, (od) null);
                      L3: {
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(((ag) this).e(34), (byte) -82);
                        if (param1 == 8799) {
                          break L3;
                        } else {
                          bd discarded$32 = ag.d((byte) 54);
                          break L3;
                        }
                      }
                      return param2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            mn.field_c = ig.field_L;
            am.a(((ag) this).e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            } else {
              bd discarded$33 = ag.d((byte) 54);
              return param2;
            }
          } else {
            if (ig.field_L != 0) {
              mn.field_c = ig.field_L;
              am.a(((ag) this).e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              } else {
                bd discarded$34 = ag.d((byte) 54);
                return param2;
              }
            } else {
              if (mn.field_c != 0) {
                ((ag) this).a(j.field_c, param0, param3, rb.field_m, (ag) this, param1 + -8799);
                var6 = rh.field_D;
                if (var6 != null) {
                  if (!(var6.field_p instanceof k)) {
                    rh.field_D = null;
                    mn.field_c = ig.field_L;
                    am.a(((ag) this).e(34), (byte) -82);
                    if (param1 == 8799) {
                      return param2;
                    } else {
                      bd discarded$35 = ag.d((byte) 54);
                      return param2;
                    }
                  } else {
                    ((k) (Object) var6.field_p).a(var6, false, (od) null);
                    rh.field_D = null;
                    mn.field_c = ig.field_L;
                    am.a(((ag) this).e(34), (byte) -82);
                    if (param1 == 8799) {
                      return param2;
                    } else {
                      bd discarded$36 = ag.d((byte) 54);
                      return param2;
                    }
                  }
                } else {
                  mn.field_c = ig.field_L;
                  am.a(((ag) this).e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    bd discarded$37 = ag.d((byte) 54);
                    return param2;
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(((ag) this).e(34), (byte) -82);
                if (param1 != 8799) {
                  bd discarded$38 = ag.d((byte) 54);
                  return param2;
                } else {
                  return param2;
                }
              }
            }
          }
        } else {
          if (ig.field_L == 0) {
            if (mn.field_c != 0) {
              ((ag) this).a(j.field_c, param0, param3, rb.field_m, (ag) this, param1 + -8799);
              var6 = rh.field_D;
              if (var6 != null) {
                if (!(var6.field_p instanceof k)) {
                  rh.field_D = null;
                  mn.field_c = ig.field_L;
                  am.a(((ag) this).e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    bd discarded$39 = ag.d((byte) 54);
                    return param2;
                  }
                } else {
                  ((k) (Object) var6.field_p).a(var6, false, (od) null);
                  rh.field_D = null;
                  mn.field_c = ig.field_L;
                  am.a(((ag) this).e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    bd discarded$40 = ag.d((byte) 54);
                    return param2;
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(((ag) this).e(34), (byte) -82);
                if (param1 == 8799) {
                  return param2;
                } else {
                  bd discarded$41 = ag.d((byte) 54);
                  return param2;
                }
              }
            } else {
              mn.field_c = ig.field_L;
              am.a(((ag) this).e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              } else {
                bd discarded$42 = ag.d((byte) 54);
                return param2;
              }
            }
          } else {
            mn.field_c = ig.field_L;
            am.a(((ag) this).e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            } else {
              bd discarded$43 = ag.d((byte) 54);
              return param2;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var4 = ((ag) this).f(0);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((ag) this).a(param1, param0, (byte) 116, var5_int);
              var5_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = 55 % ((87 - param2) / 35);
            var5 = ii.c((byte) 72);
            if (var5 != null) {
              gf.field_e.a(qh.field_q, var5, l.field_d, 94);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public final String toString() {
        return ((ag) this).a(122, new Hashtable(), 0, new StringBuilder()).toString();
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 > 42) {
          if (param3 == 0) {
            if (null == ((ag) this).field_h) {
              return;
            } else {
              ((ag) this).field_h.a(param0, param1, 15430, (ag) this, true);
              return;
            }
          } else {
            return;
          }
        } else {
          ((ag) this).field_x = 49;
          if (param3 != 0) {
            return;
          } else {
            L0: {
              if (null != ((ag) this).field_h) {
                ((ag) this).field_h.a(param0, param1, 15430, (ag) this, true);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    public static void d(int param0) {
        field_t = null;
        if (param0 != 5956) {
            bd discarded$0 = ag.d((byte) -93);
            field_j = null;
            return;
        }
        field_j = null;
    }

    ag(String param0, mh param1) {
        this(param0, gf.field_e.field_h, param1);
    }

    final boolean a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                ((ag) this).field_v = -27;
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              StringBuilder discarded$4 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$5 = param3.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ag.RA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((ag) this).b(param3, param0, 255, param2, param1)) {
                ((ag) this).field_r = param6;
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == 110) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("ag.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param6 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 255) {
          if (param1 >= param4 + ((ag) this).field_v) {
            if (((ag) this).field_m + param3 <= param0) {
              if (((ag) this).field_s + (((ag) this).field_v + param4) > param1) {
                if (param0 >= ((ag) this).field_x + (((ag) this).field_m + param3)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void c(byte param0) {
        int var2 = -78 % ((param0 - -27) / 39);
    }

    final void c(int param0) {
        ((ag) this).a(((ag) this).field_s, ((ag) this).field_m, param0 ^ param0, ((ag) this).field_v, ((ag) this).field_x);
    }

    String e(int param0) {
        if (param0 == 34) {
          if (!((ag) this).field_u) {
            return null;
          } else {
            return ((ag) this).field_i;
          }
        } else {
          ((ag) this).field_s = 88;
          if (!((ag) this).field_u) {
            return null;
          } else {
            return ((ag) this).field_i;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
            ((ag) this).field_r = param5;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ag.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    int f(int param0) {
        if (param0 != 0) {
            return -69;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 0) {
          ((ag) this).field_m = -30;
          ((ag) this).field_m = param1;
          ((ag) this).field_v = param3;
          ((ag) this).field_s = param0;
          ((ag) this).field_x = param4;
          return;
        } else {
          ((ag) this).field_m = param1;
          ((ag) this).field_v = param3;
          ((ag) this).field_s = param0;
          ((ag) this).field_x = param4;
          return;
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((ag) this).a(param3, param2, false, param1)) {
                ((ag) this).a(param2, param1, param3, 116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 73) {
                break L2;
              } else {
                boolean discarded$2 = ((ag) this).b(66, -8, -116, 93, -80);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ag.IA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 <= 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((ag) this).field_l = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ag.LA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(ag param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                var5_int = ((ag) this).b(rb.field_m, j.field_c, 255, param1, param3) ? 1 : 0;
                if (((ag) this).field_u) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                stackOut_5_0 = stackIn_5_0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5_int != 0) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L2;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L2;
                }
              }
              L3: {
                if (stackIn_8_0 != stackIn_8_1) {
                  L4: {
                    stackOut_10_0 = this;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var5_int == 0) {
                      stackOut_12_0 = this;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L4;
                    } else {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L4;
                    }
                  }
                  ((ag) this).field_u = stackIn_13_1 != 0;
                  if (null == ((ag) this).field_p) {
                    break L3;
                  } else {
                    if (!(((ag) this).field_p instanceof kg)) {
                      break L3;
                    } else {
                      ((kg) (Object) ((ag) this).field_p).a(var5_int != 0, (byte) 98, (ag) this);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("ag.W(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ag) this).field_v).append(",").append(((ag) this).field_m).append(" ").append(((ag) this).field_s).append("x").append(((ag) this).field_x);
              if (((ag) this).field_n == null) {
                break L1;
              } else {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((ag) this).field_n).append(34);
                break L1;
              }
            }
            L2: {
              if (((ag) this).field_u) {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((ag) this).g(-9015)) {
                StringBuilder discarded$11 = param2.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var5_int = 99 % ((-49 - param3) / 58);
              if (null != ((ag) this).field_h) {
                L5: {
                  StringBuilder discarded$12 = param2.append(" renderer=");
                  if (((ag) this).field_h instanceof ag) {
                    break L5;
                  } else {
                    StringBuilder discarded$13 = param2.append(((ag) this).field_h);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param2 = ((ag) this).a(123, param1, 1 + param0, param2);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (((ag) this).field_p == null) {
                break L6;
              } else {
                L7: {
                  StringBuilder discarded$14 = param2.append(" listener=");
                  if (((ag) this).field_p instanceof ag) {
                    break L7;
                  } else {
                    StringBuilder discarded$15 = param2.append(((ag) this).field_p);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param2 = ((ag) this).a(97, param1, 1 + param0, param2);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ag.UA(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("ag.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
    }

    protected ag() {
        ((ag) this).field_o = 0;
        ((ag) this).field_q = 0;
    }

    ag(String param0, nn param1, mh param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((ag) this).field_o = 0;
        ((ag) this).field_q = 0;
        try {
          L0: {
            L1: {
              ((ag) this).field_h = param1;
              ((ag) this).field_p = param2;
              ((ag) this).field_n = param0;
              if (!(((ag) this).field_h instanceof mi)) {
                break L1;
              } else {
                var4 = (mi) (Object) ((ag) this).field_h;
                ((ag) this).field_s = var4.a(false, (ag) this);
                ((ag) this).field_x = var4.b((ag) this, (byte) -79);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ag.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    ag(int param0, int param1, int param2, int param3, nn param4, mh param5) {
        ((ag) this).field_o = 0;
        ((ag) this).field_q = 0;
        try {
            ((ag) this).field_m = param1;
            ((ag) this).field_v = param0;
            ((ag) this).field_x = param3;
            ((ag) this).field_s = param2;
            ((ag) this).field_p = param5;
            ((ag) this).field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ag.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 274) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((ag) this).field_u = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ag.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        if (((ag) this).g(-9015)) {
          if (!((ag) this).a(274, (ag) this, param0, param1)) {
            if (param2 == 80) {
              var4 = param0;
              if (var4 == 80) {
                return ((ag) this).a((byte) -93, (ag) this);
              } else {
                return false;
              }
            } else {
              field_t = null;
              var4 = param0;
              if (var4 == 80) {
                return ((ag) this).a((byte) -93, (ag) this);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param2 == 80) {
            var4 = param0;
            if (var4 == 80) {
              return ((ag) this).a((byte) -93, (ag) this);
            } else {
              return false;
            }
          } else {
            field_t = null;
            var4 = param0;
            if (var4 != 80) {
              return false;
            } else {
              return ((ag) this).a((byte) -93, (ag) this);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_j = "Rating: <col=ffffff><%0>";
        field_w = 0.0f;
    }
}
