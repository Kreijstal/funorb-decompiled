/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends qb {
    private ug field_m;
    static md field_n;
    static long field_s;
    static int[] field_t;
    static wi field_r;
    static String field_p;
    md field_q;
    mb field_o;

    private final void a(lp param0, int[] param1, int param2, int param3, int param4, boolean param5) {
        ug stackIn_12_0 = null;
        lp stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        boolean stackIn_13_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ni var11 = null;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          if (0 != (4 & this.field_m.field_G[param0.field_p]) &&
            param0.field_r < 0) {
            var7_int = this.field_m.field_Q[param0.field_p] / vn.field_t;
            while (true) {
              var8 = (-param0.field_m + (1048575 + var7_int)) / var7_int;
              if (var8 > param4) {
                param0.field_m = param0.field_m + param4 * var7_int;
                break;
              }
              param0.field_v.b(param1, param3, var8);
              param3 = param3 + var8;
              param0.field_m = param0.field_m + (-1048576 + var8 * var7_int);
              param4 = param4 - var8;
              var9 = vn.field_t / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_v;
              if (this.field_m.field_o[param0.field_p] == 0) {
                param0.field_v = ni.a(param0.field_I, var11.l(), var11.i(), var11.h());
              } else {
                param0.field_v = ni.a(param0.field_I, var11.l(), 0, var11.h());
                stackIn_12_0 = this.field_m;
                stackIn_12_1 = (lp) (param0);
                stackIn_12_2 = 4917;
                stackIn_13_3 = !(param0.field_x.field_r[param0.field_y] >= 0);
                ((ug) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_13_3);
                param0.field_v.a(var9, var11.i());
              }
              if (0 > param0.field_x.field_r[param0.field_y]) {
                param0.field_v.e(-1);
              }
              var11.f(var9);
              var11.b(param1, param3, -param3 + param2);
              if (!var11.e()) {
                continue;
              }
              this.field_o.b(var11);
            }
          }
          param0.field_v.b(param1, param3, param4);
          if (!param5) {
            field_s = 44L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("hg.D(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (null == kc.field_Q) {
          kc.field_Q = new int[param2 * 2];
          if (i.field_t == null) {
            i.field_t = new int[param2 * 2];
          } else {
            if (param2 > i.field_t.length) {
              i.field_t = new int[param2 * 2];
            }
          }
          if (null == mf.field_d) {
            mf.field_d = new int[param2 * 2];
          } else {
            if (param2 > mf.field_d.length) {
              mf.field_d = new int[param2 * 2];
            }
          }
          if (wa.field_m == null) {
            wa.field_m = new int[param2 * 2];
          } else {
            if (param2 > wa.field_m.length) {
              wa.field_m = new int[param2 * 2];
            }
          }
          if (null == tc.field_w) {
            tc.field_w = new int[param2 * 2];
            if (null == ci.field_n ||
              !(param2 <= ci.field_n.length)) {
              ci.field_n = new int[param2 * 2];
            }
            if (ol.field_k == null ||
              !(param2 + param1 <= ol.field_k.length)) {
              ol.field_k = new int[2 * (param1 + param2)];
            }
            if (tf.field_e == null ||
              !(param2 <= tf.field_e.length)) {
              tf.field_e = new boolean[param2 * 2];
            }
          } else {
            if (param2 > tc.field_w.length) {
              tc.field_w = new int[param2 * 2];
              if (null == ci.field_n ||
                !(param2 <= ci.field_n.length)) {
                ci.field_n = new int[param2 * 2];
              }
              if (ol.field_k == null ||
                !(param2 + param1 <= ol.field_k.length)) {
                ol.field_k = new int[2 * (param1 + param2)];
              }
              if (tf.field_e == null ||
                !(param2 <= tf.field_e.length)) {
                tf.field_e = new boolean[param2 * 2];
              }
            } else {
              if (null == ci.field_n ||
                !(param2 <= ci.field_n.length)) {
                ci.field_n = new int[param2 * 2];
              }
              if (ol.field_k == null) {
                ol.field_k = new int[2 * (param1 + param2)];
                if (tf.field_e == null ||
                  !(param2 <= tf.field_e.length)) {
                  tf.field_e = new boolean[param2 * 2];
                }
              } else {
                if (param2 + param1 > ol.field_k.length) {
                  ol.field_k = new int[2 * (param1 + param2)];
                  if (tf.field_e == null ||
                    !(param2 <= tf.field_e.length)) {
                    tf.field_e = new boolean[param2 * 2];
                  }
                } else {
                  if (tf.field_e == null) {
                    tf.field_e = new boolean[param2 * 2];
                  } else {
                    if (param2 > tf.field_e.length) {
                      tf.field_e = new boolean[param2 * 2];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (kc.field_Q.length >= param2) {
            if (i.field_t == null) {
              i.field_t = new int[param2 * 2];
            } else {
              if (param2 > i.field_t.length) {
                i.field_t = new int[param2 * 2];
              }
            }
            if (null == mf.field_d ||
              !(param2 <= mf.field_d.length)) {
              mf.field_d = new int[param2 * 2];
            }
            if (wa.field_m == null ||
              !(param2 <= wa.field_m.length)) {
              wa.field_m = new int[param2 * 2];
            }
            if (null == tc.field_w) {
              tc.field_w = new int[param2 * 2];
              if (null == ci.field_n ||
                !(param2 <= ci.field_n.length)) {
                ci.field_n = new int[param2 * 2];
              }
              if (ol.field_k == null ||
                !(param2 + param1 <= ol.field_k.length)) {
                ol.field_k = new int[2 * (param1 + param2)];
              }
              if (tf.field_e == null ||
                !(param2 <= tf.field_e.length)) {
                tf.field_e = new boolean[param2 * 2];
              }
            } else {
              if (param2 > tc.field_w.length) {
                tc.field_w = new int[param2 * 2];
                if (null == ci.field_n ||
                  !(param2 <= ci.field_n.length)) {
                  ci.field_n = new int[param2 * 2];
                }
                if (ol.field_k == null ||
                  !(param2 + param1 <= ol.field_k.length)) {
                  ol.field_k = new int[2 * (param1 + param2)];
                }
                if (tf.field_e == null ||
                  !(param2 <= tf.field_e.length)) {
                  tf.field_e = new boolean[param2 * 2];
                }
              } else {
                if (null == ci.field_n ||
                  !(param2 <= ci.field_n.length)) {
                  ci.field_n = new int[param2 * 2];
                }
                if (ol.field_k == null) {
                  ol.field_k = new int[2 * (param1 + param2)];
                  if (tf.field_e == null ||
                    !(param2 <= tf.field_e.length)) {
                    tf.field_e = new boolean[param2 * 2];
                  }
                } else {
                  if (param2 + param1 > ol.field_k.length) {
                    ol.field_k = new int[2 * (param1 + param2)];
                    if (tf.field_e == null ||
                      !(param2 <= tf.field_e.length)) {
                      tf.field_e = new boolean[param2 * 2];
                    }
                  } else {
                    if (tf.field_e == null) {
                      tf.field_e = new boolean[param2 * 2];
                    } else {
                      if (param2 > tf.field_e.length) {
                        tf.field_e = new boolean[param2 * 2];
                      }
                    }
                  }
                }
              }
            }
          } else {
            kc.field_Q = new int[param2 * 2];
            if (i.field_t == null) {
              i.field_t = new int[param2 * 2];
            } else {
              if (param2 > i.field_t.length) {
                i.field_t = new int[param2 * 2];
              }
            }
            if (null == mf.field_d ||
              !(param2 <= mf.field_d.length)) {
              mf.field_d = new int[param2 * 2];
            }
            if (wa.field_m == null ||
              !(param2 <= wa.field_m.length)) {
              wa.field_m = new int[param2 * 2];
            }
            if (null == tc.field_w) {
              tc.field_w = new int[param2 * 2];
              if (null == ci.field_n ||
                !(param2 <= ci.field_n.length)) {
                ci.field_n = new int[param2 * 2];
              }
              if (ol.field_k == null ||
                !(param2 + param1 <= ol.field_k.length)) {
                ol.field_k = new int[2 * (param1 + param2)];
              }
              if (tf.field_e == null) {
                tf.field_e = new boolean[param2 * 2];
              } else {
                if (param2 > tf.field_e.length) {
                  tf.field_e = new boolean[param2 * 2];
                }
              }
            } else {
              if (param2 > tc.field_w.length) {
                tc.field_w = new int[param2 * 2];
                if (null == ci.field_n ||
                  !(param2 <= ci.field_n.length)) {
                  ci.field_n = new int[param2 * 2];
                }
                if (ol.field_k == null ||
                  !(param2 + param1 <= ol.field_k.length)) {
                  ol.field_k = new int[2 * (param1 + param2)];
                }
                if (tf.field_e == null ||
                  !(param2 <= tf.field_e.length)) {
                  tf.field_e = new boolean[param2 * 2];
                }
              } else {
                if (null == ci.field_n ||
                  !(param2 <= ci.field_n.length)) {
                  ci.field_n = new int[param2 * 2];
                }
                if (ol.field_k == null) {
                  ol.field_k = new int[2 * (param1 + param2)];
                } else {
                  if (param2 + param1 > ol.field_k.length) {
                    ol.field_k = new int[2 * (param1 + param2)];
                  }
                }
                if (tf.field_e == null) {
                  tf.field_e = new boolean[param2 * 2];
                } else {
                  if (param2 > tf.field_e.length) {
                    tf.field_e = new boolean[param2 * 2];
                  }
                }
              }
            }
          }
        }
        ln.field_d = -2147483648;
        n.field_d = -2147483648;
        ib.field_e = 2147483647;
        da.field_B = 2147483647;
        if (param0 != 31751) {
          hg.a(59, -22, 8);
        }
        lc.field_d = 0;
    }

    private final void a(int param0, lp param1, int param2) {
        ug stackIn_7_0 = null;
        lp stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        boolean stackIn_8_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (0 != (4 & this.field_m.field_G[param1.field_p]) &&
            param1.field_r < 0) {
            var4_int = this.field_m.field_Q[param1.field_p] / vn.field_t;
            var5 = (-param1.field_m + var4_int + 1048575) / var4_int;
            param1.field_m = 1048575 & var4_int * param2 + param1.field_m;
            if (param2 >= var5) {
              if (0 == this.field_m.field_o[param1.field_p]) {
                param1.field_v = ni.a(param1.field_I, param1.field_v.l(), param1.field_v.i(), param1.field_v.h());
              } else {
                param1.field_v = ni.a(param1.field_I, param1.field_v.l(), 0, param1.field_v.h());
                stackIn_7_0 = this.field_m;
                stackIn_7_1 = (lp) (param1);
                stackIn_7_2 = 4917;
                stackIn_8_3 = !(param1.field_x.field_r[param1.field_y] >= 0);
                ((ug) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_8_3);
              }
              if (param1.field_x.field_r[param1.field_y] < 0) {
                param1.field_v.e(-1);
              }
              param2 = param1.field_m / var4_int;
            }
          }
          if (param0 >= -71) {
            field_t = (int[]) null;
          }
          param1.field_v.a(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2;
        lp var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = DungeonAssault.field_K;
        this.field_o.a(param0);
        var3 = (lp) (this.field_q.e(-24172));
        L0: while (true) {
          if (var3 == null) {
            return;
          }
          stackIn_4_0 = this.field_m.a(var3, -16257);
          if (stackIn_4_0) {
            var3 = (lp) (this.field_q.a(4));
            continue L0;
          }
          var2 = param0;
          do {
            if (var3.field_H >= var2) {
              this.a(-84, var3, var2);
              var3.field_H = var3.field_H - var2;
              var3 = (lp) (this.field_q.a(4));
              continue L0;
            }
            this.a(-72, var3, var3.field_H);
            var2 = var2 - var3.field_H;
            stackIn_4_0 = this.field_m.a(-127, 0, var2, var3, (int[]) null);
          } while (!stackIn_4_0);
          var3 = (lp) (this.field_q.a(4));
        }
    }

    final qb c() {
        lp var1_ref = null;
        int var2 = DungeonAssault.field_K;
        do {
          var1_ref = (lp) (this.field_q.a(4));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_v);
        return (qb) ((Object) var1_ref.field_v);
    }

    public static void d(int param0) {
        if (param0 != 26609) {
          field_s = -67L;
          field_r = null;
          field_p = null;
          field_n = null;
          field_t = null;
          return;
        }
        field_r = null;
        field_p = null;
        field_n = null;
        field_t = null;
    }

    final qb d() {
        lp var1 = (lp) (this.field_q.e(-24172));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_v) {
          return (qb) ((Object) var1.field_v);
        }
        return this.c();
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        lp var6 = null;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          this.field_o.b(param0, param1, param2);
          var6 = (lp) (this.field_q.e(-24172));
          L0: while (true) {
            if (var6 == null) {
              return;
            }
            stackIn_4_0 = this.field_m.a(var6, -16257);
            if (stackIn_4_0) {
              var6 = (lp) (this.field_q.a(4));
              continue L0;
            }
            var5 = param2;
            var4_int = param1;
            do {
              if (var5 <= var6.field_H) {
                this.a(var6, param0, var4_int + var5, var4_int, var5, true);
                var6.field_H = var6.field_H - var5;
                var6 = (lp) (this.field_q.a(4));
                continue L0;
              }
              this.a(var6, param0, var5 + var4_int, var4_int, var6.field_H, true);
              var5 = var5 - var6.field_H;
              var4_int = var4_int + var6.field_H;
              stackIn_4_0 = this.field_m.a(118, var4_int, var5, var6, param0);
            } while (!stackIn_4_0);
            var6 = (lp) (this.field_q.a(4));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("hg.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    hg(ug param0) {
        this.field_q = new md();
        this.field_o = new mb();
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new md();
        field_p = "Skeleton Sentinels";
    }
}
