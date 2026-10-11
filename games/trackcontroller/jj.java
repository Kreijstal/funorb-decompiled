/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj extends db implements m {
    private dg field_eb;
    private oh field_gb;
    private boolean field_jb;
    private boolean field_kb;
    static int[] field_fb;
    private boolean field_ib;
    private boolean field_hb;

    final void a(int param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        lc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_ib) {
            return;
          }
          stackIn_7_1 = (param0 == 256);
          this.field_jb = stackIn_7_1;
          this.field_ib = true;
          if (param2 != -10) {
            return;
          }
          this.field_eb.a(4210752, 8405024, (byte) -33);
          var6 = new lc(this, this.field_gb, param1);
          if (param0 != 5) {
            if (param0 != 256) {
              stackIn_15_0 = var6;
              stackIn_15_1 = param2 - 17030;
              if (!this.field_hb) {
                stackIn_16_2 = ea.field_p;
              } else {
                stackIn_16_2 = ib.field_c;
              }
              ((lc) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2, -1);
            } else {
              var6.a(param2 ^ 4, (tg) (this), ib.field_c);
            }
          } else {
            var6.a(param2 - 17030, dh.field_r, 11);
            var6.a(-17040, cg.field_b, 17);
          }
          if (3 != param0) {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(-17040, md.field_c, 9);
              } else {
                if (param0 != 9) {
                  this.b(var6, -101);
                  return;
                }
                var6.a(param2 - 4, (tg) (this), fh.field_d);
              }
            } else {
              var6.a(-17040, wg.field_h, 8);
            }
          } else {
            var6.a(-17040, ea.field_y, 7);
          }
          this.b(var6, -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("jj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    public void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_jb) {
            gk.a("tochangedisplayname.ws", gd.b((byte) 77), -110);
          } else {
            qc.b(3, (byte) -42);
            this.t(20252);
          }
          if (param4 == -27322) {
            return;
          }
          this.field_hb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("jj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    jj(vl param0, oh param1, String param2, boolean param3, boolean param4) {
        super(param0, new lc((jj) null, param1, param2), 77, 10, 10);
        try {
          this.field_jb = false;
          this.field_ib = false;
          this.field_kb = param4 ? true : false;
          this.field_gb = param1;
          this.field_hb = param3 ? true : false;
          this.field_eb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_eb.field_C = true;
          this.a(false, this.field_eb);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void t(int param0) {
        if (!this.field_E) {
          return;
        }
        if (param0 != 20252) {
          this.field_eb = (dg) null;
          this.field_E = false;
          if (this.field_hb) {
            hh.a((byte) 111);
            return;
          }
          if (this.field_kb) {
            ja.c(1);
            return;
          }
          return;
        }
        this.field_E = false;
        if (this.field_hb) {
          hh.a((byte) 111);
          return;
        }
        if (this.field_kb) {
          ja.c(1);
          return;
        }
    }

    final static boolean s(int param0) {
        if (param0 <= 22) {
          field_fb = (int[]) null;
          return ge.field_D;
        }
        return ge.field_D;
    }

    final void r(int param0) {
        this.field_eb.a(4210752, 2121792, (byte) -33);
        int var3 = -36 % ((-22 - param0) / 60);
        lc var2 = new lc(this, this.field_gb, gf.field_a);
        var2.a(-17040, sg.field_e, 15);
        this.b(var2, -78);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 13) {
            this.t(20252);
            return true;
          }
          var5_int = -113 / ((param0 - 17) / 51);
          stackIn_5_0 = super.a((byte) -104, param1, param2, param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jj.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_fb = null;
        if (param0 < 98) {
          jj.e((byte) 9);
        }
    }

    static {
        field_fb = null;
    }
}
