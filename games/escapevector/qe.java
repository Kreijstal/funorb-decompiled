/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private int field_c;
    private int[] field_j;
    qj field_f;
    private qj[] field_e;
    static byte[][] field_a;
    int field_d;
    private int[] field_i;
    private int field_g;
    int field_h;
    private int field_b;

    private final void a(boolean param0, byte param1) {
        hl[] var3 = null;
        hl var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hl[] var8 = null;
        L0: {
          var8 = gd.field_K;
          var3 = var8;
          if (0 > ((qe) this).field_d) {
            break L0;
          } else {
            if (var8.length > ((qe) this).field_d) {
              if (param1 < -20) {
                var4 = var8[((qe) this).field_d];
                if (var4 != null) {
                  L1: {
                    if (!param0) {
                      var5 = 256;
                      var6 = qm.field_c * 6144 / 64;
                      var7 = 16384 * ((qe) this).field_f.field_h / 640;
                      var4.a(var5, var6, var7);
                      break L1;
                    } else {
                      var5 = 256;
                      var4.g(var5);
                      var8[((qe) this).field_d] = null;
                      break L1;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final int a(qj param0, qj param1, byte param2) {
        double var4 = this.a(84, param0, param1);
        int var6 = 99 % ((param2 - -53) / 62);
        int var7 = (int)(var4 * 0.2 + 0.5);
        return var7;
    }

    private final void a(int[] param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int var3 = param0.length / 2;
        ((qe) this).field_e = new qj[var3];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = param0[var4 * 2];
            var6 = param0[var4 * 2 - -1];
            ((qe) this).field_e[var4] = new qj(var5, var6);
        }
        if (param1 <= 15) {
            return;
        }
        ((qe) this).field_f = ((qe) this).field_e[0];
    }

    final static void a(int param0, int param1, int param2, ed[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = EscapeVector.field_A;
          if (param3 == null) {
            break L0;
          } else {
            if (-1 > (param2 ^ -1)) {
              var6 = param3[0].field_A;
              var7 = param3[2].field_A;
              var8 = param3[1].field_A;
              param3[0].f(param5, param1, param4);
              param3[2].f(-var7 + (param2 + param5), param1, param4);
              em.a(sf.field_m);
              em.h(var6 + param5, param1, -var7 + param2 + param5, param3[1].field_z + param1);
              var9 = param5 - -var6;
              var10 = param5 + (param2 - var7);
              param5 = var9;
              var11 = -59 / ((11 - param0) / 32);
              L1: while (true) {
                if (param5 >= var10) {
                  em.b(sf.field_m);
                  return;
                } else {
                  param3[1].f(param5, param1, param4);
                  param5 = param5 + var8;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        L0: {
          var3 = ((qe) this).field_i[param0];
          em.d(((qe) this).field_f.field_h, ((qe) this).field_f.field_b, ((qe) this).field_b, var3);
          var3 = ((qe) this).field_j[param0];
          em.a(((qe) this).field_f.field_h, ((qe) this).field_f.field_b, ((qe) this).field_b, var3);
          if (param1 == -92) {
            break L0;
          } else {
            ((qe) this).field_j = null;
            break L0;
          }
        }
        var4 = Integer.toString(((qe) this).field_d - -1);
        fh.field_g.c(var4, 1 + (((qe) this).field_f.field_h - 1), -2 + ((qe) this).field_f.field_b - -((qe) this).field_b, ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h - -1, -2 + (((qe) this).field_f.field_b + ((qe) this).field_b), ((qe) this).field_g, -1);
        fh.field_g.c(var4, ((qe) this).field_f.field_h + 1, -1 + ((qe) this).field_b + (((qe) this).field_f.field_b - 2), ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h, -1 + (((qe) this).field_b + ((qe) this).field_f.field_b), ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h, -2 + (((qe) this).field_b + ((qe) this).field_f.field_b), ((qe) this).field_c, -1);
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qj var11 = null;
        qj var12 = null;
        qj var13 = null;
        qj var14 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var10 = EscapeVector.field_A;
          var4 = ((qe) this).field_e.length;
          var5 = 0;
          var6 = null;
          var7 = null;
          if (param0) {
            break L0;
          } else {
            ((qe) this).field_b = 83;
            break L0;
          }
        }
        var8 = ((qe) this).field_i[param1];
        L1: while (true) {
          L2: {
            if (0 >= param2) {
              break L2;
            } else {
              if (var4 <= 1 + var5) {
                break L2;
              } else {
                var12 = ((qe) this).field_e[var5 + 1];
                var11 = ((qe) this).field_e[var5];
                var9 = this.a(var11, var12, (byte) -128);
                var13 = this.a(var12, true, param2, var11, var9);
                param2 = param2 - var9;
                em.d(var11.field_h, var11.field_b, var13.field_h, var13.field_b, var8);
                if (param2 <= 0) {
                  break L2;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
          L3: {
            if ((param2 ^ -1) >= -1) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L3;
            }
          }
          L4: {
            var9 = stackIn_10_0;
            if (var9 == 0) {
              break L4;
            } else {
              var14 = ((qe) this).field_e[var4 - 1];
              em.a(-1 + var14.field_h, -1 + var14.field_b, 3, 3, var8);
              break L4;
            }
          }
          this.a(var9 != 0, (byte) -66);
          return param2;
        }
    }

    private final qj a(qj param0, boolean param1, int param2, qj param3, int param4) {
        if (param4 <= param2) {
            bn.field_a.field_h = param0.field_h;
            bn.field_a.field_b = param0.field_b;
        } else {
            bn.field_a.field_b = param2 * (-param3.field_b + param0.field_b) / param4 + param3.field_b;
            bn.field_a.field_h = param2 * (-param3.field_h + param0.field_h) / param4 + param3.field_h;
        }
        if (!param1) {
            Object var7 = null;
        }
        return bn.field_a;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
    }

    final static int a(int[] param0, int param1, boolean param2, int[] param3) {
        if (!param2) {
            Object var5 = null;
            qe.a(107, 78, 55, (ed[]) null, 95, 113);
        }
        qg.a(param3, 0, param0, param1, param3.length);
        param1 = param1 + param3.length;
        return param1;
    }

    final void a(boolean param0, int param1) {
        int var3 = !param0 ? kh.field_b : bo.field_E;
        int var4 = mj.field_d;
        if (((qe) this).field_h > var4) {
            return;
        }
        if (param1 != -1) {
            ((qe) this).field_d = 26;
        }
        var4 = -((qe) this).field_h + var4;
        var4 = this.a(true, var3, var4);
        this.a(var3, (byte) -92);
    }

    final static int a(int param0) {
        if (fc.field_a >= 2) {
          L0: {
            if (ff.field_h != 0) {
              L1: {
                if (null != nk.field_p) {
                  if (nk.field_p.b(0)) {
                    if (!nk.field_p.a("", (byte) -111)) {
                      return 29;
                    } else {
                      if (!nk.field_p.a(0, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!ii.field_a.b(0)) {
                return 43;
              } else {
                if (ii.field_a.a(0, "commonui")) {
                  if (!w.field_ab.b(0)) {
                    return 71;
                  } else {
                    if (!w.field_ab.a(0, "commonui")) {
                      return 80;
                    } else {
                      if (pl.field_j.b(0)) {
                        if (!pl.field_j.a((byte) -119)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      } else {
                        return 82;
                      }
                    }
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (ii.field_a.b(0)) {
                if (ii.field_a.a(0, "commonui")) {
                  if (!w.field_ab.b(0)) {
                    return 50;
                  } else {
                    if (!w.field_ab.a(0, "commonui")) {
                      return 60;
                    } else {
                      if (pl.field_j.b(0)) {
                        if (pl.field_j.a((byte) -119)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          }
          if (param0 < -8) {
            return 100;
          } else {
            return -98;
          }
        } else {
          return 0;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -((qe) this).field_f.field_h + param1;
        int var5 = -((qe) this).field_f.field_b + param0;
        int var6 = var4 * var4 - -(var5 * var5);
        int var7 = (param2 + ((qe) this).field_b) * ((qe) this).field_b;
        int var8 = var6 <= var7 ? 1 : 0;
        return var8 != 0;
    }

    private final double a(int param0, qj param1, qj param2) {
        if (param0 <= 75) {
            return 0.7839713364957465;
        }
        int var4 = param2.field_h - param1.field_h;
        int var5 = -param1.field_b + param2.field_b;
        int var6 = var4 * var4 + var5 * var5;
        return Math.sqrt((double)var6);
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_a = null;
        }
        rd.field_c.a((hm) (Object) new l(), 30);
    }

    qe(int param0, int[] param1, int param2, int[] param3, int[] param4, int param5, int param6, ih param7) {
        ((qe) this).field_d = param0;
        this.a(param1, (byte) 121);
        ((qe) this).field_h = 5 * (((qe) this).field_d + 1);
        ((qe) this).field_j = param4;
        ((qe) this).field_b = param2;
        ((qe) this).field_c = param5;
        ((qe) this).field_g = param6;
        ((qe) this).field_i = param3;
    }

    static {
    }
}
