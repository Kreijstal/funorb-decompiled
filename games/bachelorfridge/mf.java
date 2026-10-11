/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mf extends uda implements lja {
    private boolean field_ib;
    private boolean field_gb;
    private boolean field_fb;
    private boolean field_jb;
    private de field_kb;
    private po field_hb;

    final void o(int param0) {
        this.field_kb.c(1705304705, 2121792, 4210752);
        hc var2 = new hc(this, this.field_hb, fr.field_r);
        if (param0 == 2113632) {
          var2.a(7, wk.field_i, 15);
          this.e(var2, 33);
          return;
        }
        this.field_jb = true;
        var2.a(7, wk.field_i, 15);
        this.e(var2, 33);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param1) {
            this.p(-94);
            return true;
          }
          if (param0 != 10) {
            this.o(25);
          }
          stackIn_6_0 = super.a(10, param1, param2, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, boolean param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        hc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hc var6 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (this.field_gb) {
            return;
          }
          stackIn_6_1 = (param0 == 256);
          this.field_ib = stackIn_6_1;
          stackIn_9_1 = (param2);
          this.field_gb = stackIn_9_1;
          this.field_kb.c(1705304705, 8405024, 4210752);
          var6 = new hc(this, this.field_hb, param1);
          var4 = var6;
          if (5 != param0) {
            if (param0 == 256) {
              var6.a((pl) (this), bga.field_k, 19528);
            } else {
              stackIn_14_0 = var6;
              stackIn_14_1 = 7;
              if (!this.field_jb) {
                stackIn_15_2 = ina.field_s;
              } else {
                stackIn_15_2 = bga.field_k;
              }
              ((hc) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, -1);
            }
          } else {
            var6.a(7, tt.field_h, 11);
            var6.a(7, uda.field_ab, 17);
          }
          if (param0 == 3) {
            var6.a(7, pr.field_c, 7);
          } else {
            if (param0 == 4) {
              var6.a(7, hd.field_r, 8);
            } else {
              if (param0 != 6) {
                if (param0 != 9) {
                  this.e(var6, 33);
                  return;
                }
                var6.a((pl) (this), eq.field_i, 19528);
              } else {
                var6.a(7, wha.field_b, 9);
              }
            }
          }
          this.e(var6, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    public void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 50) {
            this.field_hb = (po) null;
          }
          if (!this.field_ib) {
            eea.a((byte) 127, "tochangedisplayname.ws", nia.d(-31768));
            return;
          }
          ep.a(3, 8192);
          this.p(-106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void p(int param0) {
        if (param0 >= -71) {
          this.field_fb = false;
          if (!this.field_C) {
            return;
          }
          this.field_C = false;
          if (this.field_jb) {
            sp.b(1);
            return;
          }
          if (this.field_fb) {
            dla.b(0);
            return;
          }
          return;
        }
        if (!this.field_C) {
          return;
        }
        this.field_C = false;
        if (this.field_jb) {
          sp.b(1);
          return;
        }
        if (this.field_fb) {
          dla.b(0);
          return;
        }
    }

    mf(rp param0, po param1, String param2, boolean param3, boolean param4) {
        super(param0, new hc((mf) null, param1, param2), 77, 10, 10);
        try {
          this.field_jb = param3 ? true : false;
          this.field_fb = param4 ? true : false;
          this.field_ib = false;
          this.field_gb = false;
          this.field_hb = param1;
          this.field_kb = new de(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_P = true;
          this.c(this.field_kb, -123);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
