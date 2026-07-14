/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jc implements td, rj {
    int field_d;
    private boolean field_e;
    static String field_n;
    int field_r;
    int field_i;
    int field_p;
    kc field_g;
    int field_q;
    static int[][] field_f;
    private int field_l;
    int field_s;
    static long field_o;
    int field_m;
    static hj field_k;
    int field_t;
    int field_h;
    static boolean field_b;
    int field_c;
    static df field_a;
    static boolean field_j;

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, pj param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          id.a(param7.field_m + param7.field_s + param2, param7.field_s + param2, param6 - -param7.field_n + param7.field_r, param6 + param7.field_n, 734);
          var9 = ((jc) this).a(param7, -125);
          var10 = this.d(param7, false);
          if (!((jc) this).field_e) {
            L1: {
              var12 = ((jc) this).field_c;
              if (-1 != var12) {
                if (-3 == var12) {
                  var11 = var10 + -((jc) this).field_g.field_B;
                  break L1;
                } else {
                  L2: {
                    if (3 == var12) {
                      break L2;
                    } else {
                      if ((var12 ^ -1) != -2) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var11 = ((jc) this).field_g.field_H + (-((jc) this).field_g.field_B + (var10 - ((jc) this).field_g.field_H) >> 306438977);
                  break L1;
                }
              } else {
                var11 = ((jc) this).field_g.field_H;
                break L1;
              }
            }
            L3: {
              var12 = ((jc) this).field_h;
              if (-1 == (var12 ^ -1)) {
                break L3;
              } else {
                if ((var12 ^ -1) == -4) {
                  break L3;
                } else {
                  if ((var12 ^ -1) != -2) {
                    if ((var12 ^ -1) == -3) {
                      ((jc) this).field_g.a(((jc) this).a((byte) -95, param7), this.a(param2, 5, param7, param1) - -var9, this.a(param6, param7, (byte) -122, param0) + var11, param5, param3);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((jc) this).field_g.c(((jc) this).a((byte) -95, param7), (var9 >> -638964607) + this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -120, param0) - -var11, param5, param3);
                    break L0;
                  }
                }
              }
            }
            ((jc) this).field_g.b(((jc) this).a((byte) -95, param7), this.a(param2, 5, param7, param1), var11 + this.a(param6, param7, (byte) -120, param0), param5, param3);
            break L0;
          } else {
            int discarded$1 = ((jc) this).field_g.a(((jc) this).a((byte) -95, param7), this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -125, param0), var9, var10, param5, param3, ((jc) this).field_h, ((jc) this).field_c, ((jc) this).field_t);
            break L0;
          }
        }
        L4: {
          oc.g((byte) -105);
          if (param4 >= 27) {
            break L4;
          } else {
            var14 = null;
            ((jc) this).a((byte) 21, (jc) null);
            break L4;
          }
        }
    }

    public final int b(pj param0, boolean param1) {
        dm discarded$0 = ((jc) this).a(param0, param1);
        return param0.field_g.b(118) + ((jc) this).field_r - -((jc) this).field_q;
    }

    public final int a(pj param0, int param1, int param2) {
        if (param1 != 9534) {
            Object var5 = null;
            ((jc) this).a(-127, -37, (pj) null, 88, -84, 86);
        }
        return this.a(param2, param0, (byte) -124, 0);
    }

    final static void a(mg param0, int param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          var7 = ek.a(param4, 7);
          if (dd.field_D != null) {
            break L0;
          } else {
            dd.field_D = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (s.field_C == null) {
                  break L3;
                } else {
                  if (var7 <= s.field_C.field_j.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              s.field_C = new mg(var7);
              break L2;
            }
            s.field_C.field_i = 0;
            s.field_C.a(param2, param4, (byte) -11, param3);
            s.field_C.d((byte) -115, var7);
            s.field_C.a(var15, -87);
            if (param1 >= 24) {
              L4: {
                L5: {
                  if (vd.field_a == null) {
                    break L5;
                  } else {
                    if ((vd.field_a.field_j.length ^ -1) <= -101) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                vd.field_a = new mg(100);
                break L4;
              }
              vd.field_a.field_i = 0;
              vd.field_a.a(10, -64);
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if ((var11 ^ -1) <= -5) {
                  vd.field_a.b((byte) -60, param4);
                  vd.field_a.a(param5, param6, 27551);
                  param0.a(0, vd.field_a.field_i, (byte) -11, vd.field_a.field_j);
                  param0.a(0, s.field_C.field_i, (byte) -11, s.field_C.field_j);
                  return;
                } else {
                  vd.field_a.b(var15[var11], -1);
                  var11++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          } else {
            var8[var9] = dd.field_D.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    public final dm a(pj param0, boolean param1) {
        if (param0.field_g == null) {
            param0.field_g = (dm) (Object) new bd();
        }
        if (!param1) {
            return null;
        }
        if (!((jc) this).field_e) {
            this.a(-29106, param0);
        } else {
            ((bd) (Object) param0.field_g).a(0, ((jc) this).a((byte) -95, param0), ((jc) this).field_h, ((jc) this).field_g, ((jc) this).a(param0, -119), this.d(param0, !param1 ? true : false), ((jc) this).field_t, ((jc) this).field_c);
        }
        return param0.field_g;
    }

    public void a(int param0, int param1, pj param2, int param3, boolean param4) {
        if (((jc) this).field_g == null) {
            return;
        }
        if (param3 != -4394) {
            ((jc) this).field_g = null;
        }
        this.a((byte) 88, param2, param0, param1);
    }

    public final int a(pj param0, int param1, byte param2) {
        if (param2 != 54) {
            int discarded$0 = ((jc) this).a((byte) -23);
        }
        return this.a(param1, param2 + -49, param0, 0);
    }

    private final int a(int param0, pj param1, byte param2, int param3) {
        if (param2 >= -116) {
            return 90;
        }
        return param3 + (param1.field_q + (((jc) this).field_r + param0)) + param1.field_n;
    }

    public final void a(int param0, pj param1, int param2, byte param3, int param4) {
        dm var13 = null;
        dm var14 = null;
        int var7 = 0;
        ed var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param1.d(-81))) {
            var13 = ((jc) this).a(param1, true);
            var14 = var13;
            var7 = var14.a(param4, (byte) 107);
            var8 = var13.field_c[var7];
            var9 = var14.a(-116, param4);
            var10 = this.a(param2, 5, param1, var9);
            var11 = ((jc) this).a(param1, 9534, param0) + Math.max(0, var8.field_f);
            var12 = ((jc) this).a(param1, 9534, param0) - -Math.min(this.d(param1, false), Math.min(var8.field_c, var14.field_c.length <= 1 + var7 ? var8.field_c : var13.field_c[var7 + 1].field_f));
            id.a(param1.field_m + param1.field_s + param2, param1.field_s + param2, param1.field_r + (param1.field_n + param0), param0 - -param1.field_n, 734);
            mb.field_a.a(var10, false, var12, ((jc) this).field_m, var10, var11);
            oc.g((byte) -105);
        }
        if (param3 <= 93) {
            ((jc) this).field_h = -63;
        }
    }

    public final void a(int param0, int param1, pj param2, int param3, int param4, int param5) {
        int var7 = 0;
        dm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ed var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var17 = OrbDefence.field_D ? 1 : 0;
        var7 = -30 % ((78 - param4) / 37);
        if (param0 == param1) {
          return;
        } else {
          L0: {
            if (!param2.d(-81)) {
              break L0;
            } else {
              L1: {
                var8 = ((jc) this).a(param2, true);
                if (param0 < param1) {
                  var10 = param1;
                  var9 = param0;
                  break L1;
                } else {
                  var9 = param1;
                  var10 = param0;
                  break L1;
                }
              }
              var11 = var8.a(var9, (byte) 107);
              var12 = var8.a(var10, (byte) 107);
              id.a(param3 + (param2.field_s - -param2.field_m), param2.field_s + param3, param2.field_r + param2.field_n + param5, param2.field_n + param5, 734);
              var13 = var11;
              L2: while (true) {
                if (var12 < var13) {
                  oc.g((byte) -105);
                  break L0;
                } else {
                  L3: {
                    var14 = var8.field_c[var13];
                    if (var11 != var13) {
                      stackOut_11_0 = var14.field_g[0];
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var8.a(-118, var9);
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var15 = stackIn_12_0;
                    if (var12 != var13) {
                      if (var14 == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = var14.field_g[var14.field_g.length + -1];
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = var8.a(-76, var10);
                      stackIn_17_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  var16 = stackIn_17_0;
                  mb.field_a.a(((jc) this).field_d, -var15 + var16, var14.field_c, ((jc) this).field_r + (param5 - (-param2.field_n + -param2.field_q) + var14.field_f), ((jc) this).field_d >>> 30573528, this.a(param3, 5, param2, var15), 123);
                  var13++;
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    public final int c(pj param0, boolean param1) {
        dm discarded$6 = ((jc) this).a(param0, param1);
        if (!param1) {
            Object var4 = null;
            String discarded$7 = ((jc) this).a((byte) 53, (pj) null);
        }
        return param0.field_g.a(!param1 ? true : false) - -((jc) this).field_p - -((jc) this).field_i;
    }

    String a(byte param0, pj param1) {
        if (param0 != -95) {
            return null;
        }
        return param1.field_l;
    }

    private final int d(pj param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            int discarded$0 = ((jc) this).a(-126, 33, 76, -43, (pj) null, 24);
        }
        return -((jc) this).field_q + (param0.field_r - ((jc) this).field_r);
    }

    public final int a(byte param0) {
        int var2 = -71 % ((param0 - -18) / 51);
        return ((jc) this).field_g.field_B + ((jc) this).field_g.field_H;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (param1 > 31) {
          var3 = 0;
          var4 = sd.field_h;
          L0: while (true) {
            if (ea.field_d.length <= var3) {
              return -1;
            } else {
              var5 = dd.field_B[var3];
              if (var5 < 0) {
                var4 = var4 + d.field_j;
                var3++;
                continue L0;
              } else {
                var6 = hg.a(true, ea.field_d[var3], 0);
                var4 = var4 + gg.field_N;
                var7 = fd.field_c - (var6 >> -769312799);
                if (fm.a(var4, param2, -mj.field_f + var7, (mj.field_f << 704072993) + var6, 102, param0, el.field_D + (ol.field_b << -1467722911))) {
                  return var5;
                } else {
                  var4 = var4 + (gg.field_N + ((ol.field_b << -446107743) - -el.field_D));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 84;
        }
    }

    final void a(byte param0, jc param1) {
        param1.field_m = ((jc) this).field_m;
        param1.field_s = ((jc) this).field_s;
        param1.field_d = ((jc) this).field_d;
        param1.field_g = ((jc) this).field_g;
        param1.field_q = ((jc) this).field_q;
        param1.field_l = ((jc) this).field_l;
        param1.field_t = ((jc) this).field_t;
        if (param0 != 81) {
            field_f = null;
        }
        param1.field_c = ((jc) this).field_c;
        param1.field_r = ((jc) this).field_r;
        param1.field_h = ((jc) this).field_h;
        param1.field_p = ((jc) this).field_p;
        param1.field_i = ((jc) this).field_i;
        param1.field_e = ((jc) this).field_e;
    }

    public final int a(int param0, int param1, int param2, int param3, pj param4, int param5) {
        dm discarded$6 = ((jc) this).a(param4, true);
        if (param2 != 2147483647) {
            Object var8 = null;
            String discarded$7 = ((jc) this).a((byte) 90, (pj) null);
        }
        return param4.field_g.a(param0 - ((jc) this).a(param4, 9534, param1), -((jc) this).a(param4, param5, (byte) 54) + param3, (byte) 124);
    }

    private final int a(int param0, int param1, pj param2, int param3) {
        if (param1 != 5) {
            field_j = false;
        }
        return param3 + (param2.field_f + (param0 - -param2.field_s) - -((jc) this).field_p);
    }

    private final void a(int param0, pj param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          if (null == param1.field_g) {
            param1.field_g = (dm) (Object) new bd();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -29106) {
          L1: {
            var3 = ((jc) this).a(param1, param0 ^ 29172);
            var4 = this.d(param1, false);
            var6 = ((jc) this).field_c;
            if (var6 == 0) {
              var5 = ((jc) this).field_g.field_H;
              break L1;
            } else {
              if (var6 == -3) {
                var5 = var4 - ((jc) this).field_g.field_B;
                break L1;
              } else {
                L2: {
                  if (-4 != var6) {
                    if (var6 != 1) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = (-((jc) this).field_g.field_B + var4 - ((jc) this).field_g.field_H >> 111060769) + ((jc) this).field_g.field_H;
                break L1;
              }
            }
          }
          L3: {
            L4: {
              var6 = ((jc) this).field_h;
              if (0 != var6) {
                if (3 == var6) {
                  break L4;
                } else {
                  if (var6 == 1) {
                    if (!(param1.field_g instanceof bd)) {
                      break L3;
                    } else {
                      ((bd) (Object) param1.field_g).a(var3 >> -1104717695, var5, param0 ^ -29127, ((jc) this).a((byte) -95, param1), ((jc) this).field_g);
                      break L3;
                    }
                  } else {
                    if (2 == var6) {
                      if (param1.field_g instanceof bd) {
                        ((bd) (Object) param1.field_g).a(var3, ((jc) this).field_g, param0 + 29227, ((jc) this).a((byte) -95, param1), var5);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            if (!(param1.field_g instanceof bd)) {
              break L3;
            } else {
              ((bd) (Object) param1.field_g).a(0, ((jc) this).a((byte) -95, param1), 89, var5, ((jc) this).field_g);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_k = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_n = null;
    }

    public final int a(pj param0, int param1) {
        if (param1 >= -69) {
            Object var4 = null;
            int discarded$0 = this.a(86, 3, (pj) null, 16);
        }
        return -((jc) this).field_i + (-((jc) this).field_p + param0.field_m);
    }

    private final void a(byte param0, pj param1, int param2, int param3) {
        this.a(0, 0, param3, ((jc) this).field_l, (byte) 51, ((jc) this).field_s, param2, param1);
        if (param0 < 53) {
            int discarded$0 = ((jc) this).a((byte) -19);
        }
    }

    protected jc() {
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((jc) this).field_t = param9;
        ((jc) this).field_i = param2;
        ((jc) this).field_r = param3;
        ((jc) this).field_g = param0;
        ((jc) this).field_m = param10;
        ((jc) this).field_p = param1;
        ((jc) this).field_q = param4;
        ((jc) this).field_e = param12 ? true : false;
        ((jc) this).field_l = param6;
        ((jc) this).field_s = param5;
        ((jc) this).field_d = param11;
        ((jc) this).field_h = param7;
        ((jc) this).field_c = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This password contains repeated characters, and would be easy to guess";
        field_f = new int[][]{new int[99], new int[99], new int[99], new int[99], new int[99], new int[99]};
        field_o = 0L;
        field_k = new hj(270, 70);
        field_a = new df("");
        field_j = false;
    }
}
