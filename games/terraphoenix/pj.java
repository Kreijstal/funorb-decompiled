/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static int[] field_l;
    private int field_u;
    private int field_p;
    static bm field_q;
    private int field_o;
    private int field_k;
    private float field_r;
    static String field_v;
    private int field_i;
    private int field_m;
    private int field_s;
    private int field_e;
    private int field_g;
    static int field_t;
    private int field_c;
    private ni field_j;
    private int field_d;
    private int field_w;
    private int field_f;
    private boolean field_h;
    private int field_n;
    static int[] field_a;
    private int field_b;

    final void a(int param0) {
        int var2 = 91 % ((5 - param0) / 40);
        ((pj) this).field_j.a(9887, ((pj) this).field_e, ((pj) this).field_m);
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 7468) {
          L0: {
            L1: {
              if (((pj) this).field_c > qb.field_g) {
                break L1;
              } else {
                if (-1 <= (me.field_o ^ -1)) {
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

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        var2 = ((pj) this).field_w;
        var3 = ((pj) this).field_s;
        if (!((pj) this).c(7468)) {
          ((pj) this).field_h = false;
          return;
        } else {
          L0: {
            if (((pj) this).field_b >= var3) {
              if (((pj) this).field_n > var3) {
                var3 = ((pj) this).field_n;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((pj) this).field_b;
              break L0;
            }
          }
          L1: {
            if (((pj) this).field_k < var2) {
              var2 = ((pj) this).field_k;
              break L1;
            } else {
              if (var2 < ((pj) this).field_o) {
                var2 = ((pj) this).field_o;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((pj) this).field_r > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * ((pj) this).field_r);
              if (var2 >= var4) {
                if (var2 <= var4) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              } else {
                var3 = (int)((float)var2 / ((pj) this).field_r);
                break L2;
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (param0 >= 75) {
              break L3;
            } else {
              this.b((byte) -11);
              break L3;
            }
          }
          L4: {
            L5: {
              if (var2 != ja.field_j) {
                break L5;
              } else {
                if (var3 != wc.field_p) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            ((pj) this).field_j.a(9887, var3, var2);
            break L4;
          }
          L6: {
            if ((((pj) this).field_w ^ -1) >= -1) {
              break L6;
            } else {
              ng.field_v = (((pj) this).field_w - ja.field_j) / 2;
              break L6;
            }
          }
          return;
        }
    }

    final static oa a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var2 = param1.length();
        if (-1 != (var2 ^ -1)) {
          if (var2 > 63) {
            return lg.field_j;
          } else {
            var4 = 15 % ((44 - param0) / 54);
            var3 = 0;
            L0: while (true) {
              if (var3 < var2) {
                var5 = param1.charAt(var3);
                if (var5 != 45) {
                  if (0 == (ge.field_f.indexOf(var5) ^ -1)) {
                    return ge.field_a;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (-1 + var2 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return ge.field_a;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return b.field_f;
        }
    }

    public static void d(int param0) {
        if (param0 <= 109) {
            return;
        }
        field_v = null;
        field_l = null;
        field_q = null;
        field_a = null;
    }

    final ck b(int param0) {
        ((pj) this).field_m = ja.field_j;
        ((pj) this).field_e = wc.field_p;
        ((pj) this).field_j.a(9887, ((pj) this).field_p, ((pj) this).field_u);
        ai.field_h = false;
        ck var2 = jb.a(((pj) this).field_p, ((pj) this).field_u, param0, 0, (byte) 109, nj.field_l);
        if (!(var2 != null)) {
            ((pj) this).a(param0 + 97);
        }
        return var2;
    }

    final void a(byte param0) {
        if (a.field_b != null) {
          return;
        } else {
          L0: {
            if ((me.field_o ^ -1) < -1) {
              break L0;
            } else {
              ((pj) this).field_h = false;
              break L0;
            }
          }
          if (!((pj) this).field_h) {
            L1: {
              if (((pj) this).field_w > ja.field_j) {
                ng.field_v = (((pj) this).field_w - ja.field_j) / 2;
                break L1;
              } else {
                if ((((pj) this).field_w ^ -1) < -1) {
                  ng.field_v = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (ja.field_j != ((pj) this).field_g) {
                  break L3;
                } else {
                  if (((pj) this).field_d != wc.field_p) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              ((pj) this).field_j.a(param0 + 9795, ((pj) this).field_d, ((pj) this).field_g);
              break L2;
            }
            return;
          } else {
            ((pj) this).field_i = ((pj) this).field_i - 1;
            if (((pj) this).field_i - 1 <= 0) {
              L4: {
                if (param0 == 92) {
                  break L4;
                } else {
                  ((pj) this).a((byte) 40);
                  break L4;
                }
              }
              ((pj) this).field_i = ((pj) this).field_f;
              if (qb.field_g >= ((pj) this).field_c) {
                this.b((byte) 78);
                return;
              } else {
                ((pj) this).field_h = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3, int param4) {
        if (param0 < 36) {
            pj.d(-99);
        }
        int var5 = 256 + -param2;
        int var6 = l.field_i[param4];
        int var7 = ((16711680 & param3) >> -1986506000) * param2 + var5 * (var6 >> 849544784 & 255) >> 201178408;
        int var8 = (255 & param3 >> 863857416) * param2 + var5 * ((65280 & var6) >> 41944136) >> -1204005816;
        int var9 = param2 * (param3 & 255) + var5 * (var6 & 255) >> 695670792;
        l.field_i[param4] = var9 + 65536 * var7 - -(var8 * 256);
    }

    final void a(byte param0, int param1, int param2) {
        ((pj) this).field_s = param2;
        if (param0 <= 48) {
            this.b((byte) -79);
        }
        ((pj) this).field_w = param1;
    }

    private pj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "RECRUIT";
        field_a = new int[8192];
    }
}
