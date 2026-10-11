/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private int field_e;
    private int[] field_b;
    private int field_f;
    static int field_h;
    private boolean field_a;
    static boolean field_d;
    static int[][] field_c;
    static ib field_j;
    static int[] field_i;
    static int[] field_g;

    private final void a(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 100) {
          discarded$0 = this.b(-88, -45);
        }
        int[] var4 = new int[this.b(param0, param1 ^ 101)];
        int[] var3 = var4;
        he.a(this.field_b, 0, var4, 0, this.field_b.length);
        this.field_b = var4;
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_b = (int[]) null;
        }
        return this.field_f + 1;
    }

    final void b(int param0, byte param1) {
        if (0 <= param0 &&
          this.field_f >= param0) {
          if (this.field_f != param0) {
            he.a(this.field_b, param0 + 1, this.field_b, param0, -param0 + this.field_f);
          }
          this.field_f = this.field_f - 1;
          if (param1 != -116) {
            this.a(true);
          }
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        boolean stackIn_39_1 = false;
        h stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        h var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = jl.field_e;
          var2 = 0;
          if (nd.field_c == 2) {
            var3_long = ol.a(256) - fd.field_e;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < gf.field_s.length; var3++) {
            var4 = dl.field_s[var3];
            if (var4 < 0) {
              var5 = qa.field_f;
            } else {
              if (ui.field_c.field_j != var4) {
                var5 = ai.field_d;
              } else {
                var5 = lg.field_f;
              }
            }
            var6 = gf.field_s[var3];
            if (nd.field_c == 2 &&
              var2 == 1) {
              if (qb.field_c.length > ji.field_n.length) {
                stackIn_19_0 = qb.field_c.length;
              } else {
                stackIn_19_0 = ji.field_n.length;
              }
              var7 = stackIn_19_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (ji.field_n.length - 6 + (var3 - var7) >= 0) {
                  stackIn_24_0 = ji.field_n[ji.field_n.length + (var3 - 6 - var7)];
                } else {
                  stackIn_24_0 = "";
                }
                var6 = stackIn_24_0;
              }
              if (qi.field_b.length > jl.field_c.length) {
                stackIn_28_0 = qi.field_b.length;
              } else {
                stackIn_28_0 = jl.field_c.length;
              }
              var8 = stackIn_28_0;
              if (var3 >= 7 + var7 &&
                var3 < var8 + var7 + 7) {
                if (-var7 + (var3 - 7) < jl.field_c.length) {
                  stackIn_33_0 = jl.field_c[-var7 + (-7 + var3)];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = -18;
            stackIn_39_1 = !(var4 < 0);
            var7Lifetime1 = ki.$cfr$intArgs$a$62abead39cee(stackIn_38_0, stackIn_39_1, var6);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + dg.field_ab;
            if (var4 >= 0) {
              var1_int = var1_int + uc.field_Y;
              if (var4 != ui.field_c.field_j) {
                stackIn_44_0 = tf.field_f;
              } else {
                stackIn_44_0 = kk.field_e;
              }
              var9 = stackIn_44_0;
              if (var9 != null) {
                var9.a(sl.field_f + (ai.field_a << 1), var1_int, -1, -ni.field_i + var8Lifetime1, (ni.field_i << 1) + var7Lifetime1);
              }
              var1_int = var1_int + ai.field_a;
            }
            if (var4 >= 0) {
              ec.field_c.c(var6, var8Lifetime1, re.field_A + var1_int, var5, -1);
              var1_int = var1_int + (sl.field_f + (ai.field_a + uc.field_Y));
            } else {
              pf.field_c.c(var6, var8Lifetime1, var1_int + hb.field_d, var5, -1);
              var1_int = var1_int + ok.field_e;
            }
          }
          if (param0 < 12) {
            field_j = (ib) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "m.J(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (this.field_f < param0) {
          this.field_f = param0;
        }
        if (param0 >= this.field_b.length) {
          this.a(param0, 100);
        }
        if (param1 <= 39) {
          return;
        }
        this.field_b[param0] = param2;
    }

    final static boolean b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var9 = null;
        int var3Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          for (var3 = 0; var3 < 16; var3++) {
            var9 = ia.field_p[var3];
            var1 = lg.field_d[var3];
            if (1 == kf.field_b &&
              fl.field_t[var3] != null) {
              var1 = fl.field_t[var3];
            }
            da.a(var1[1], var1[2], var1[8] + var1[6], param0 ^ -26, var1[3], var3, var9);
          }
          ee.field_s = tf.field_x.a(we.field_c[12][0]);
          if (param0 != -98) {
            field_j = (ib) null;
          }
          var3Lifetime1 = tf.field_x.a(we.field_c[13][0]);
          if (ee.field_s < var3Lifetime1) {
            ee.field_s = var3Lifetime1;
          }
          var4 = tf.field_x.field_t + tf.field_x.field_K + 4;
          il.field_q[6] = var4 + tf.field_x.field_x + (200 + tf.field_x.field_K);
          ea.field_d[6] = 33 + 2 * var4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "m.H(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 != 1) {
          field_g = (int[]) null;
        }
        var3 = this.field_b.length;
        while (var3 <= param0) {
          if (!this.field_a) {
            var3 = var3 + this.field_e;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_e;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void a(int param0, byte param1) {
        this.a(this.field_f + 1, (byte) 99, param0);
        if (param1 < 39) {
          m.a(-27);
        }
    }

    final static ge[] a(lj param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        lj var5 = null;
        Object stackIn_4_0 = null;
        ge[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 6) {
            var5 = (lj) null;
            m.a((lj) null, -92, (byte) -64, 66);
          }
          if (lk.a(160, param0, param1, param3)) {
            stackIn_6_0 = jc.b(-125);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ge[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("m.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = (int[][]) null;
        field_i = null;
        field_g = null;
        if (param0 != 128) {
          m.a((byte) -35);
        }
        field_j = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final int c(int param0, int param1) {
        if (param1 != 7) {
          m.a(-97);
        }
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_b[param0];
    }

    final static void a(int param0, String param1, boolean param2, String[] param3) {
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          eh.field_p = hf.field_b;
          if (param2) {
            var6 = (String[]) null;
            m.a(120, (String) null, true, (String[]) null);
          }
          if (255 != param0) {
            if (param0 >= 100 &&
              param0 <= 105) {
              var4 = param3;
              ae.a((byte) 61, var4);
              gf.field_w = wk.a(param3, -1);
              return;
            }
            gf.field_w = mg.a((byte) 15, param1, param0);
          } else {
            stackIn_6_0 = -115;
            stackIn_7_1 = !(cf.field_f >= 13);
            gf.field_w = be.a(stackIn_6_0, stackIn_7_1);
            var7 = (String[]) null;
            ae.a((byte) 73, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("m.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = new int[][]{new int[]{60}, new int[]{250, 250, 250, 250, 250, 250}, new int[]{0}, new int[]{0}, new int[]{100}, new int[]{50}};
        field_i = new int[128];
        field_g = new int[]{116, 195, 407, 89};
    }
}
