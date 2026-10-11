/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma extends jf implements ke {
    static ql field_tb;
    private boolean field_xb;
    private rf field_zb;
    static byte[] field_yb;
    private boolean field_rb;
    private boolean field_ub;
    private hd field_Ab;
    static int field_wb;
    private boolean field_Bb;
    static int field_sb;
    static long field_vb;

    public void a(int param0, int param1, boolean param2, hf param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            ma.n(30);
          }
          if (!this.field_Bb) {
            ff.a(-27, "tochangedisplayname.ws", nb.a(71));
            return;
          }
          sf.a(3, 11649);
          this.d(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ma.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_tb = null;
        if (param0 != 19678) {
          field_vb = -97L;
          field_yb = null;
          return;
        }
        field_yb = null;
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 13) {
            this.d(true);
            return true;
          }
          if (param3 < 63) {
            var6 = (String) null;
            this.a(-120, (String) null, 15);
          }
          stackIn_6_0 = super.a(param0, param1, param2, 110);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ma.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        dj stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        String stackIn_13_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dj var6 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_xb) {
            return;
          }
          stackIn_7_1 = (param0 == 256);
          this.field_Bb = stackIn_7_1;
          this.field_xb = true;
          this.field_Ab.a(false, 8405024, 4210752);
          var6 = new dj(this, this.field_zb, param1);
          var4 = var6;
          if (param0 == 5) {
            var6.a(false, jf.field_fb, 11);
            var6.a(false, qk.field_d, 17);
          } else {
            if (256 != param0) {
              stackIn_12_0 = var6;
              stackIn_12_1 = false;
              if (!this.field_rb) {
                stackIn_13_2 = f.field_m;
              } else {
                stackIn_13_2 = DrPhlogistonSavesTheEarth.field_E;
              }
              ((dj) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2, -1);
            } else {
              var6.a(DrPhlogistonSavesTheEarth.field_E, false, (fd) (this));
            }
          }
          if (3 == param0) {
            var6.a(false, nl.field_o, 7);
          } else {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(false, bb.field_d, 9);
              } else {
                if (9 == param0) {
                  var6.a(eg.field_g, false, (fd) (this));
                }
              }
            } else {
              var6.a(false, ge.field_g, 8);
            }
          }
          this.a(33, var6);
          if (param2 == -5485) {
            return;
          }
          this.d(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ma.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        this.field_Ab.a(false, 2121792, 4210752);
        dj var2 = new dj(this, this.field_zb, lk.field_n);
        var2.a(param0, fe.field_b, 15);
        this.a(33, var2);
    }

    ma(k param0, rf param1, String param2, boolean param3, boolean param4) {
        super(param0, new dj((ma) null, param1, param2), 77, 10, 10);
        try {
          this.field_ub = param4 ? true : false;
          this.field_zb = param1;
          this.field_Bb = false;
          this.field_xb = false;
          this.field_rb = param3 ? true : false;
          this.field_Ab = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Ab.field_E = true;
          this.b(this.field_Ab, (byte) 58);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(boolean param0) {
        if (!this.field_Q) {
          return;
        }
        this.field_Q = false;
        if (this.field_rb) {
          ck.d(121);
        } else {
          if (this.field_ub) {
            hg.e((byte) 47);
          }
        }
        if (param0) {
          return;
        }
        this.field_rb = true;
    }

    static {
        field_yb = new byte[520];
        field_tb = new ql(1);
        field_vb = 20000000L;
    }
}
