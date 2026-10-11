/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dg extends me implements qk {
    private ba field_ob;
    private boolean field_jb;
    static String field_sb;
    static String field_qb;
    private vm field_lb;
    static String field_rb;
    private boolean field_kb;
    private boolean field_mb;
    static String field_nb;
    static ji field_tb;
    private boolean field_pb;

    final void g(byte param0) {
        int var2 = -74 % ((param0 + 80) / 36);
        if (!this.field_F) {
          return;
        }
        this.field_F = false;
        if (this.field_kb) {
          ed.b(0);
          return;
        }
        if (!this.field_pb) {
          return;
        }
        pe.b(true);
    }

    public static void q(int param0) {
        field_tb = null;
        field_rb = null;
        field_sb = null;
        if (param0 != -257) {
          return;
        }
        field_nb = null;
        field_qb = null;
    }

    public void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 60 / ((-63 - param4) / 52);
          if (!this.field_mb) {
            ta.a(-320, "tochangedisplayname.ws", bn.c(-1));
            return;
          }
          g.a((byte) 62, 3);
          this.g((byte) -122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    dg(gg param0, vm param1, String param2, boolean param3, boolean param4) {
        super(param0, new qi((dg) null, param1, param2), 77, 10, 10);
        try {
          this.field_mb = false;
          this.field_jb = false;
          this.field_pb = param4 ? true : false;
          this.field_kb = param3 ? true : false;
          this.field_lb = param1;
          this.field_ob = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ob.field_E = true;
          this.a(51448, this.field_ob);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void p(int param0) {
        this.field_ob.a(2121792, 4210752, -1);
        qi var2 = new qi(this, this.field_lb, id.field_l);
        if (param0 < -33) {
          var2.a(22770, 15, ui.field_h);
          this.b(var2, (byte) 110);
          return;
        }
        String var3 = (String) null;
        this.a(117, -124, (String) null);
        var2.a(22770, 15, ui.field_h);
        this.b(var2, (byte) 110);
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 274) {
            this.g((byte) 92);
          }
          if (param2 != 13) {
            stackIn_6_0 = super.a(274, param1, param2, param3);
            return stackIn_6_0;
          }
          this.g((byte) -116);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_7_1 = false;
        qi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        String stackIn_15_3;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        qi var6 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_jb) {
            return;
          }
          this.field_jb = true;
          stackIn_7_1 = (param0 == 256);
          this.field_mb = stackIn_7_1;
          this.field_ob.a(8405024, 4210752, -1);
          if (param1 != 17) {
            this.field_kb = false;
          }
          var6 = new qi(this, this.field_lb, param2);
          if (param0 != 5) {
            if (param0 == 256) {
              var6.a((mh) (this), hf.field_f, 30);
            } else {
              stackIn_14_0 = var6;
              stackIn_14_1 = param1 + 22753;
              stackIn_14_2 = -1;
              if (!this.field_kb) {
                stackIn_15_3 = hg.field_d;
              } else {
                stackIn_15_3 = hf.field_f;
              }
              ((qi) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_15_3);
            }
          } else {
            var6.a(param1 + 22753, 11, im.field_b);
            var6.a(22770, 17, sc.field_k);
          }
          if (param0 != 3) {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(param1 + 22753, 9, wc.field_k);
              } else {
                if (param0 != 9) {
                  this.b(var6, (byte) 110);
                  return;
                }
                var6.a((mh) (this), md.field_j, 30);
              }
            } else {
              var6.a(param1 + 22753, 8, pe.field_gb);
            }
          } else {
            var6.a(22770, 7, pf.field_N);
          }
          this.b(var6, (byte) 110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("dg.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    static {
        field_qb = "Waiting for extra data";
        field_nb = "Username: ";
        field_rb = "Waiting for levels";
        field_sb = "Unfortunately you are not eligible to create an account.";
    }
}
