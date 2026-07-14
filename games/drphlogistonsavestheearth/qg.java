/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends kl implements ud {
    private int field_I;
    private qi field_X;
    static he[] field_W;
    static he[] field_U;

    public static void n(int param0) {
        field_U = null;
        if (param0 != -1) {
            int discarded$0 = qg.n((byte) 59);
        }
        field_W = null;
    }

    qg(String param0, fd param1, int param2) {
        super(param0, param1, param2);
    }

    public final qi a(byte param0) {
        int var2 = 90 % ((param0 - -80) / 39);
        return ((qg) this).field_X;
    }

    final void a(qi param0, byte param1) {
        if (param1 != -57) {
            return;
        }
        ((qg) this).field_X = param0;
    }

    final static int n(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!th.a(46)) {
            L1: {
              wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), qg.a(ih.field_R, (byte) -112, ae.field_gb));
              if (wg.field_k.c((byte) -82)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = 0;
                if (var1 == 0) {
                  break L3;
                } else {
                  if (wg.field_k.field_f <= -1) {
                    L4: {
                      var3 = mi.field_g[wg.field_k.field_f];
                      if (var3 == 2) {
                        break L4;
                      } else {
                        if (5 != var3) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ch.c(3);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L2;
              } else {
                if (-3 == re.field_g) {
                  break L2;
                } else {
                  ch.c(3);
                  break L2;
                }
              }
            }
            L5: {
              if (param0 == 46) {
                break L5;
              } else {
                field_U = null;
                break L5;
              }
            }
            L6: {
              if (-1 != (var3 ^ -1)) {
                break L6;
              } else {
                if (2 != re.field_g) {
                  break L6;
                } else {
                  var4 = -aa.field_d + la.a(false);
                  var6 = (int)((-var4 + 10999L) / 1000L);
                  if (0 >= var6) {
                    var3 = 2;
                    jk.a((byte) 49, true, 5);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            return var3;
          } else {
            L7: {
              wg.field_k.c(param0 + -5);
              if (!wg.field_k.c((byte) -82)) {
                break L7;
              } else {
                var1 = 1;
                break L7;
              }
            }
            if (di.field_c != 13) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    final static bm a(vj param0, String param1, String param2, vj param3, int param4) {
        int var6 = -127 / ((param4 - 40) / 53);
        int var5 = param3.a(param2, (byte) -104);
        int var7 = param3.a((byte) -66, param1, var5);
        return tc.a(var7, param3, var5, param0, 65245);
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        qf.field_c = param1;
        nd.field_K = param2;
        if (param3 != -11) {
            Object var5 = null;
            String discarded$0 = qg.a((String) null, (String) null, 112, (String) null, (vj) null);
        }
        nc.a(j.field_Y, param0, (byte) 77);
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = 0;
        var4 = jd.field_N;
        L0: while (true) {
          if (var3 >= sg.field_f.length) {
            L1: {
              if (param1 == -112) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = lg.field_a[var3];
            if (0 > var5) {
              var4 = var4 + s.field_g;
              var3++;
              continue L0;
            } else {
              var6 = u.a(sg.field_f[var3], true, true);
              var4 = var4 + ig.field_h;
              var7 = -(var6 >> 166003809) + ji.field_f;
              if (g.a((dg.field_d << -1769105727) + var6, (byte) -108, ni.field_p + (wa.field_N << -1371097599), var4, var7 - dg.field_d, param0, param2)) {
                return var5;
              } else {
                var4 = var4 + (ni.field_p + ig.field_h + (wa.field_N << -1164920351));
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static og l(int param0) {
        if (fk.field_q == pj.field_D) {
            throw new IllegalStateException();
        }
        if (param0 != 19860) {
            return null;
        }
        if (fk.field_q != wg.field_u) {
            return null;
        }
        fk.field_q = pj.field_D;
        return jj.field_d;
    }

    final static void a(od param0, byte param1) {
        ah.field_K = param0.j(-788751192) << 1858275077;
        int var2 = param0.l(31760);
        ah.field_K = ah.field_K + (var2 >> 464758499);
        d.field_b = (7 & var2) << 2106993010;
        d.field_b = d.field_b + (param0.j(-788751192) << 328831970);
        var2 = param0.l(31760);
        oh.field_d = (63 & var2) << 455532303;
        d.field_b = d.field_b + (var2 >> 240440934);
        oh.field_d = oh.field_d + (param0.l(31760) << 617323527);
        var2 = param0.l(31760);
        oh.field_d = oh.field_d + (var2 >> 959710753);
        if (param1 <= 51) {
            field_W = null;
        }
        j.field_e = var2 << 85565264 & 65536;
        j.field_e = j.field_e + param0.j(-788751192);
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -128);
        ((qg) this).field_I = -param1 + -((qg) this).field_o + ck.field_c;
        if (param3 > -127) {
            Object var6 = null;
            ((qg) this).a((qi) null, (byte) -8);
        }
    }

    final static String a(String param0, String param1, int param2, String param3, vj param4) {
        if (param2 != 34) {
            return null;
        }
        if (!param4.a(0)) {
            return param0;
        }
        return param1 + " - " + param4.b(10461, param3) + "%";
    }

    final static vi b(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 > 66) {
            break L0;
          } else {
            field_U = null;
            break L0;
          }
        }
        var2 = param1.length();
        if (var2 == -1) {
          return qj.field_e;
        } else {
          if (-65 < var2) {
            return ej.field_f;
          } else {
            if (param1.charAt(0) == 34) {
              if (param1.charAt(var2 - 1) != 34) {
                return dh.field_H;
              } else {
                var3 = 0;
                var4 = 1;
                L1: while (true) {
                  if (var2 - 1 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 != 92) {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            return dh.field_H;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        if (var3 != 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L3;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_20_0;
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = 0;
              L4: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (46 != var5) {
                    if (0 == (m.field_b.indexOf(var5) ^ -1)) {
                      return dh.field_H;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L4;
                    }
                  } else {
                    L5: {
                      if (-1 == (var4 ^ -1)) {
                        break L5;
                      } else {
                        if (var2 - 1 == var4) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    return dh.field_H;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final static int m(int param0) {
        if (param0 != 12484) {
            field_W = null;
        }
        return th.field_e;
    }

    final void m(byte param0) {
        super.m((byte) 103);
        if (((qg) this).field_X != null) {
            ((qg) this).field_X.a((byte) 87);
        }
        int var2 = -108 % ((param0 - 35) / 33);
    }

    final String e(int param0) {
        if (!((qg) this).field_n) {
            return null;
        }
        if (((qg) this).field_v == null) {
            return null;
        }
        oh.a(26500, ob.field_g, ((qg) this).field_w + -((qg) this).field_I + ck.field_c);
        if (param0 >= -39) {
            Object var3 = null;
            qg.a(false, (String) null, (String) null, (byte) 23);
        }
        return ((qg) this).field_v;
    }

    static {
    }
}
