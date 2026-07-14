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
        this.finalize();
    }

    public static void e(int param0) {
        gk var2 = null;
        field_o = null;
        if (param0 > -120) {
          var2 = (gk) null;
          ha discarded$2 = gt.a(110, (d) null, (java.awt.Canvas) null, (gk) null, 56);
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
        long var6 = 0L;
        jc var8 = null;
        jaggl.OpenGL var9 = null;
        if (tq.c(true)) {
          if (!ei.a("jaggl", (byte) -16)) {
            throw new RuntimeException("");
          } else {
            if (param0 <= -25) {
              var9 = new jaggl.OpenGL();
              var6 = var9.init(param2, 8, 8, 8, 24, 0, param4);
              if (0L == var6) {
                throw new RuntimeException("");
              } else {
                var8 = new jc(var9, param2, var6, param1, param3, param4);
                var8.f((byte) 101);
                return (ha) (Object) var8;
              }
            } else {
              gt.e(19);
              var9 = new jaggl.OpenGL();
              var6 = var9.init(param2, 8, 8, 8, 24, 0, param4);
              if (0L == var6) {
                throw new RuntimeException("");
              } else {
                var8 = new jc(var9, param2, var6, param1, param3, param4);
                var8.f((byte) 101);
                return (ha) (Object) var8;
              }
            }
          }
        } else {
          throw new RuntimeException("");
        }
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        int var5 = 0;
        String[] var6 = null;
        String[] var8 = null;
        String[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        nb.field_c = uk.field_j;
        if (param0 > 119) {
          if ((param2 ^ -1) != -256) {
            if (-101 <= param2) {
              if (-106 <= (param2 ^ -1)) {
                var9 = param3;
                ps.a(var9, (byte) -17);
                vb.field_l = oq.a((byte) -93, param3);
                return;
              } else {
                vb.field_l = dq.a(param2, 32, param1);
                return;
              }
            } else {
              vb.field_l = dq.a(param2, 32, param1);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 111;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (sd.field_h <= -14) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            vb.field_l = in.a((byte) stackIn_16_0, stackIn_16_1 != 0);
            var6 = (String[]) null;
            ps.a((String[]) null, (byte) -120);
            return;
          }
        } else {
          field_o = (ll) null;
          if ((param2 ^ -1) != -256) {
            if (-101 <= param2) {
              if (-106 <= (param2 ^ -1)) {
                var8 = param3;
                ps.a(var8, (byte) -17);
                vb.field_l = oq.a((byte) -93, param3);
                return;
              } else {
                vb.field_l = dq.a(param2, 32, param1);
                return;
              }
            } else {
              vb.field_l = dq.a(param2, 32, param1);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 111;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (sd.field_h <= -14) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            vb.field_l = in.a((byte) stackIn_5_0, stackIn_5_1 != 0);
            var6 = (String[]) null;
            ps.a((String[]) null, (byte) -120);
            return;
          }
        }
    }

    private final void c(byte param0) {
        if (param0 > -64) {
          L0: {
            ((gt) this).field_q = (wl) null;
            if (-1L > (((gt) this).field_p ^ -1L)) {
              ((gt) this).field_q.field_kc.releasePbuffer(((gt) this).field_p);
              ((gt) this).field_p = 0L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-1L > (((gt) this).field_p ^ -1L)) {
              ((gt) this).field_q.field_kc.releasePbuffer(((gt) this).field_p);
              ((gt) this).field_p = 0L;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    gt(wl param0, int param1, int param2) {
        ((gt) this).field_n = param2 * param1;
        ((gt) this).field_q = param0;
        ((gt) this).field_p = ((gt) this).field_q.field_kc.createPbuffer(param1, param2);
    }

    final long f(int param0) {
        if (param0 != 25766) {
            return -63L;
        }
        return ((gt) this).field_p;
    }

    static {
    }
}
