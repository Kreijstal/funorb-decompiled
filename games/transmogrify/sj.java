/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj extends wf {
    static String[] field_w;
    int field_v;
    int field_l;
    j field_k;
    int field_h;
    int field_q;
    static wb field_u;
    boolean field_x;
    j field_o;
    int field_t;
    int field_p;
    int field_j;
    int field_s;
    static String field_r;
    nf field_n;
    int field_g;
    static long field_m;
    char field_i;

    public static void b(byte param0) {
        field_r = null;
        field_w = null;
        field_u = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        wl.field_K.b(param3 + ((sj) this).field_j, param1 + ((sj) this).field_q, ff.field_H[((sj) this).field_h]);
        if (((sj) this).field_x) {
          param0 = param0 >> 3;
          if ((param0 & 31) != 31) {
            L0: {
              rj.field_a[param0 % rj.field_a.length].c(((sj) this).field_j + param3, param1 + ((sj) this).field_q);
              var12 = Integer.toString(((sj) this).field_v + (((sj) this).field_h << 1));
              var6 = ((sj) this).field_n.field_c.a(((sj) this).field_i);
              var7 = hk.field_a.a(var12);
              var8 = -var7 + 31;
              var9 = var8 - var6;
              var10 = 29 - var6 >> 1;
              if (var10 < var9) {
                var9 = var10;
                var8 = var8 + (var9 + var6) >> 1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var9 < 1) {
                var9 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            ((sj) this).field_n.field_c.a(((sj) this).field_i, var9 + (((sj) this).field_j + param3), param1 + ((sj) this).field_n.field_c.field_D + ((sj) this).field_q + 8, param2);
            hk.field_a.b(var12, param3 + ((sj) this).field_j - -var8, param1 + 28 + ((sj) this).field_q, 1, -1);
            return;
          } else {
            wl.field_K.b(((sj) this).field_j - -param3, ((sj) this).field_q - -param1, 10539762);
            L2: {
              rj.field_a[param0 % rj.field_a.length].c(((sj) this).field_j + param3, param1 + ((sj) this).field_q);
              var13 = Integer.toString(((sj) this).field_v + (((sj) this).field_h << 1));
              var6 = ((sj) this).field_n.field_c.a(((sj) this).field_i);
              var7 = hk.field_a.a(var13);
              var8 = -var7 + 31;
              var9 = var8 - var6;
              var10 = 29 - var6 >> 1;
              if (var10 < var9) {
                var9 = var10;
                var8 = var8 + (var9 + var6) >> 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var9 < 1) {
                var9 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            ((sj) this).field_n.field_c.a(((sj) this).field_i, var9 + (((sj) this).field_j + param3), param1 + ((sj) this).field_n.field_c.field_D + ((sj) this).field_q + 8, param2);
            hk.field_a.b(var13, param3 + ((sj) this).field_j - -var8, param1 + 28 + ((sj) this).field_q, 1, -1);
            return;
          }
        } else {
          L4: {
            var14 = Integer.toString(((sj) this).field_v + (((sj) this).field_h << 1));
            var6 = ((sj) this).field_n.field_c.a(((sj) this).field_i);
            var7 = hk.field_a.a(var14);
            var8 = -var7 + 31;
            var9 = var8 - var6;
            var10 = 29 - var6 >> 1;
            if (var10 < var9) {
              var9 = var10;
              var8 = var8 + (var9 + var6) >> 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var9 < 1) {
              var9 = 1;
              break L5;
            } else {
              break L5;
            }
          }
          ((sj) this).field_n.field_c.a(((sj) this).field_i, var9 + (((sj) this).field_j + param3), param1 + ((sj) this).field_n.field_c.field_D + ((sj) this).field_q + 8, param2);
          hk.field_a.b(var14, param3 + ((sj) this).field_j - -var8, param1 + 28 + ((sj) this).field_q, 1, -1);
          return;
        }
    }

    final void a(int param0, int param1, j param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ((sj) this).field_o.field_e[((sj) this).field_t] == this) {
                ((sj) this).field_o.field_e[((sj) this).field_t] = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (od.field_g != ((sj) this).field_o) {
                ((sj) this).field_k = ((sj) this).field_o;
                ((sj) this).field_s = ((sj) this).field_t;
                break L2;
              } else {
                break L2;
              }
            }
            ((sj) this).field_t = param0;
            ((sj) this).field_o = param2;
            ((sj) this).field_o.field_e[((sj) this).field_t] = (sj) this;
            ((sj) this).field_p = param2.field_c;
            ((sj) this).field_g = 32 * param0 + param2.field_d;
            if (param1 == 28) {
              break L0;
            } else {
              ((sj) this).a(-53, -35, -125, 103);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("sj.G(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final void d(int param0) {
        ab.field_c.a((wf) this, -127);
        if (param0 != 1) {
            ((sj) this).field_n = null;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        double var3 = 0.0;
        if (param0 == 75) {
          if (((sj) this).field_j == ((sj) this).field_g) {
            if (((sj) this).field_p != ((sj) this).field_q) {
              var2 = (-((sj) this).field_j + ((sj) this).field_g) * (-((sj) this).field_j + ((sj) this).field_g) - -((((sj) this).field_p + -((sj) this).field_q) * (((sj) this).field_p - ((sj) this).field_q));
              if (var2 <= 144) {
                ((sj) this).field_j = ((sj) this).field_g;
                ((sj) this).field_q = ((sj) this).field_p;
                if (((sj) this).field_j == ((sj) this).field_g) {
                  if (((sj) this).field_q != ((sj) this).field_p) {
                    return;
                  } else {
                    od discarded$7 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = 12.0 / Math.sqrt((double)var2);
                ((sj) this).field_j = ((sj) this).field_j + (int)((double)(-((sj) this).field_j + ((sj) this).field_g) * var3);
                ((sj) this).field_q = ((sj) this).field_q + (int)((double)(-((sj) this).field_q + ((sj) this).field_p) * var3);
                if (((sj) this).field_j == ((sj) this).field_g) {
                  if (((sj) this).field_q != ((sj) this).field_p) {
                    return;
                  } else {
                    od discarded$8 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var2 = (-((sj) this).field_j + ((sj) this).field_g) * (-((sj) this).field_j + ((sj) this).field_g) - -((((sj) this).field_p + -((sj) this).field_q) * (((sj) this).field_p - ((sj) this).field_q));
            if (var2 <= 144) {
              ((sj) this).field_j = ((sj) this).field_g;
              ((sj) this).field_q = ((sj) this).field_p;
              if (((sj) this).field_j == ((sj) this).field_g) {
                if (((sj) this).field_q == ((sj) this).field_p) {
                  od discarded$9 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var3 = 12.0 / Math.sqrt((double)var2);
              ((sj) this).field_j = ((sj) this).field_j + (int)((double)(-((sj) this).field_j + ((sj) this).field_g) * var3);
              ((sj) this).field_q = ((sj) this).field_q + (int)((double)(-((sj) this).field_q + ((sj) this).field_p) * var3);
              if (((sj) this).field_j == ((sj) this).field_g) {
                if (((sj) this).field_q != ((sj) this).field_p) {
                  return;
                } else {
                  od discarded$10 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          ((sj) this).field_o = null;
          if (((sj) this).field_j == ((sj) this).field_g) {
            if (((sj) this).field_p != ((sj) this).field_q) {
              var2 = (-((sj) this).field_j + ((sj) this).field_g) * (-((sj) this).field_j + ((sj) this).field_g) - -((((sj) this).field_p + -((sj) this).field_q) * (((sj) this).field_p - ((sj) this).field_q));
              if (var2 <= 144) {
                ((sj) this).field_j = ((sj) this).field_g;
                ((sj) this).field_q = ((sj) this).field_p;
                if (((sj) this).field_j == ((sj) this).field_g) {
                  if (((sj) this).field_q != ((sj) this).field_p) {
                    return;
                  } else {
                    od discarded$11 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = 12.0 / Math.sqrt((double)var2);
                ((sj) this).field_j = ((sj) this).field_j + (int)((double)(-((sj) this).field_j + ((sj) this).field_g) * var3);
                ((sj) this).field_q = ((sj) this).field_q + (int)((double)(-((sj) this).field_q + ((sj) this).field_p) * var3);
                if (((sj) this).field_j == ((sj) this).field_g) {
                  if (((sj) this).field_q != ((sj) this).field_p) {
                    return;
                  } else {
                    od discarded$12 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L0: {
              var2 = (-((sj) this).field_j + ((sj) this).field_g) * (-((sj) this).field_j + ((sj) this).field_g) - -((((sj) this).field_p + -((sj) this).field_q) * (((sj) this).field_p - ((sj) this).field_q));
              if (var2 <= 144) {
                ((sj) this).field_j = ((sj) this).field_g;
                ((sj) this).field_q = ((sj) this).field_p;
                break L0;
              } else {
                var3 = 12.0 / Math.sqrt((double)var2);
                ((sj) this).field_j = ((sj) this).field_j + (int)((double)(-((sj) this).field_j + ((sj) this).field_g) * var3);
                ((sj) this).field_q = ((sj) this).field_q + (int)((double)(-((sj) this).field_q + ((sj) this).field_p) * var3);
                break L0;
              }
            }
            if (((sj) this).field_j == ((sj) this).field_g) {
              if (((sj) this).field_q != ((sj) this).field_p) {
                return;
              } else {
                od discarded$13 = vk.a((byte) 108, dg.field_d[3 - -li.a(3, o.field_o, false)]);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, jl param2) {
        hj var5 = null;
        int var4 = 0;
        if (param0 != -7812) {
            return;
        }
        try {
            var5 = ff.field_D;
            var5.a(false, param1);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.f(6389, 1);
            var5.f(6389, param2.field_m);
            var5.g(-21770, param2.field_i);
            var5.a(param0 + 7711, param2.field_h);
            var5.a(-108, param2.field_g);
            var5.a(-123, param2.field_n);
            var5.a(-113, param2.field_k);
            int discarded$0 = var5.d(var4, -1323322296);
            var5.a((byte) -42, var5.field_h + -var4);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "sj.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e(int param0) {
        if (param0 != 31) {
            return true;
        }
        return we.field_j.b(false);
    }

    sj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_r = null;
    }
}
