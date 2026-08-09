/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt extends wt {
    static ll field_o;
    private long field_p;
    int field_n;
    static String field_r;
    private wl field_q;

    protected final void finalize() throws Throwable {
        this.c((byte) -95);
        super.finalize();
    }

    public static void e(int param0) {
        gk var2;
        field_o = null;
        if (param0 > -120) {
          var2 = (gk) null;
          gt.a(110, (d) null, (java.awt.Canvas) null, (gk) null, 56);
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    final static cd a(byte param0) {
        if (param0 != -46) {
            return (cd) null;
        }
        return new cd(ve.a(true), oh.a((byte) 114));
    }

    final static ha a(int param0, d param1, java.awt.Canvas param2, gk param3, int param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        jc var8 = null;
        jaggl.OpenGL var9 = null;
        jc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tq.c(true)) {
              if (!ei.a("jaggl", (byte) -16)) {
                throw new RuntimeException("");
              } else {
                L1: {
                  if (param0 <= -25) {
                    break L1;
                  } else {
                    gt.e(19);
                    break L1;
                  }
                }
                var9 = new jaggl.OpenGL();
                var6 = var9.init(param2, 8, 8, 8, 24, 0, param4);
                if (0L != var6) {
                  var8 = new jc(var9, param2, var6, param1, param3, param4);
                  var8.f((byte) 101);
                  stackIn_10_0 = (jc) (var8);
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("gt.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ',' + param4 + ')');
        }
        return (ha) ((Object) stackIn_10_0);
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var7 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            nb.field_c = uk.field_j;
            if (param0 > 119) {
              break L0;
            } else {
              field_o = (ll) null;
              break L0;
            }
          }
          if ((param2 ^ -1) != -256) {
            if (-101 < (param2 ^ -1)) {
              vb.field_l = dq.a(param2, 32, param1);
              return;
            } else {
              if (-106 > (param2 ^ -1)) {
                vb.field_l = dq.a(param2, 32, param1);
                return;
              } else {
                var7 = param3;
                ps.a(var7, (byte) -17);
                vb.field_l = oq.a((byte) -93, param3);
                return;
              }
            }
          } else {
            L1: {
              stackIn_6_0 = 111;

              if ((sd.field_h ^ -1) <= -14) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L1;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 1;
                break L1;
              }
            }
            vb.field_l = in.a((byte) stackIn_7_0, stackIn_7_1 != 0);
            var6 = (String[]) null;
            ps.a((String[]) null, (byte) -120);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("gt.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    private final void c(byte param0) {
        if (param0 > -64) {
          L0: {
            this.field_q = (wl) null;
            if (-1L > (this.field_p ^ -1L)) {
              this.field_q.field_kc.releasePbuffer(this.field_p);
              this.field_p = 0L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-1L > (this.field_p ^ -1L)) {
              this.field_q.field_kc.releasePbuffer(this.field_p);
              this.field_p = 0L;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    gt(wl param0, int param1, int param2) {
        try {
            this.field_n = param2 * param1;
            this.field_q = param0;
            this.field_p = this.field_q.field_kc.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final long f(int param0) {
        if (param0 != 25766) {
            return -63L;
        }
        return this.field_p;
    }

    static {
    }
}
