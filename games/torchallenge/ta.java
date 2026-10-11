/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends wa implements sg {
    static am field_Db;
    private dg field_Bb;
    private boolean field_Cb;
    private boolean field_Eb;
    static String field_Ab;
    static String field_zb;

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_Eb) {
          ee.a(false, 1, true);
          return;
        }
        try {
          if (param4) {
            this.field_Bb = (dg) null;
          }
          bj.a(30);
          this.o(77);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ta.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -42) {
            stackIn_6_0 = (null != ri.a(0, param1));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ta.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean j(int param0) {
        ef var2 = null;
        if (this.field_K) {
          if (this.field_Cb) {
            if (param0 == 1) {
              return super.j(1);
            }
            return true;
          }
          var2 = uf.d(false);
          if (var2 == null) {
            if (param0 == 1) {
              return super.j(1);
            }
            return true;
          }
          this.a(false, var2, (byte) 98);
        }
        if (param0 == 1) {
          return super.j(1);
        }
        return true;
    }

    ta(si param0, dg param1) {
        super(param0, dl.field_H, cd.field_a, false, false);
        try {
          this.field_Bb = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 != 255) {
          return;
        }
        field_zb = null;
        field_Db = null;
    }

    final void h(byte param0) {
        this.a(true, mg.a((byte) 122, pa.field_u, 248), (byte) 57);
        if (param0 != 21) {
          ng var3 = (ng) null;
          this.a((ng) null, 30, -74, -95, false);
        }
    }

    private final void a(boolean param0, ef param1, byte param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sj var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          this.field_Cb = true;
          if (!param1.field_m) {
            if (null == param1.field_b) {
              var4 = param1.field_g;
              if (param1.field_n == 248) {
                if (!param0) {
                  qc.a(0);
                }
                this.field_Eb = true;
                var4 = pa.field_u;
              }
            } else {
              var4 = qb.field_f;
              if (this.field_Bb != null) {
                this.field_Bb.a(-23128);
              }
            }
          } else {
            var4 = ak.field_e;
          }
          var5 = new sj((wa) (this), dl.field_H, var4);
          if (param2 < 41) {
            return;
          }
          if (!param1.field_m) {
            if (!this.field_Eb) {
              if (param1.field_n != 5) {
                var5.a(-1, 2083, b.field_R);
              } else {
                var5.a(11, 2083, te.field_c);
                var5.a(17, 2083, ph.field_f);
              }
            } else {
              var5.a((byte) 46, (gg) (this), be.field_a);
            }
            if (param1.field_n != 3) {
              if (6 == param1.field_n) {
                var5.a(9, 2083, qc.field_b);
              }
            } else {
              var5.a(7, 2083, aj.field_a);
            }
          } else {
            if (param1.field_c) {
              this.c(0, new qh(this));
              return;
            }
            var5.a((byte) 46, (gg) (this), be.field_a);
          }
          this.c(0, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("ta.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 <= param1) {
          var2 = 2;
          if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 < -16) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
          }
          if (-2 > param0) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 1;
        if (param0 > 65535) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (255 < param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 > 15) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 > 3) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (1 < param0) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_Db = new am(3);
    }
}
