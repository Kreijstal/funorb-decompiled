/*
 * Decompiled by CFR-JS 0.4.0.
 */
class si extends al implements n {
    private pk field_rb;
    static sd field_ob;
    private boolean field_mb;
    private hm field_kb;
    static String field_hb;
    static cm field_nb;
    private boolean field_qb;
    private boolean field_jb;
    static boolean field_gb;
    static byte[] field_ib;
    private boolean field_lb;
    static String field_pb;

    final void l(int param0) {
        this.field_kb.a(4210752, -7062047, 2121792);
        oi var2 = new oi(this, this.field_rb, field_pb);
        var2.a(15, ib.field_bb, (byte) 121);
        int var3 = 93 % ((param0 + 44) / 51);
        this.a(var2, -42);
    }

    final void a(boolean param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        oi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        oi var6 = null;
        var5 = Terraphoenix.field_V;
        try {
          if (this.field_lb) {
            return;
          }
          stackIn_7_1 = (param0);
          this.field_lb = stackIn_7_1;
          stackIn_10_1 = (256 == param2);
          this.field_jb = stackIn_10_1;
          this.field_kb.a(4210752, -7062047, 8405024);
          var6 = new oi(this, this.field_rb, param1);
          var4 = var6;
          if (param2 != 5) {
            if (param2 == 256) {
              var6.a((byte) 23, (sc) (this), rb.field_c);
            } else {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              if (this.field_qb) {
                stackIn_16_2 = rb.field_c;
              } else {
                stackIn_16_2 = gd.field_b;
              }
              ((oi) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2, (byte) 70);
            }
          } else {
            var6.a(11, hf.field_u, (byte) -84);
            var6.a(17, ed.field_c, (byte) -58);
          }
          if (param2 != 3) {
            if (param2 != 4) {
              if (param2 == 6) {
                var6.a(9, fc.field_b, (byte) -111);
              } else {
                if (param2 == 9) {
                  var6.a((byte) 23, (sc) (this), ec.field_c);
                }
              }
            } else {
              var6.a(8, pl.field_V, (byte) 57);
            }
          } else {
            var6.a(7, mi.field_i, (byte) -51);
          }
          this.a(var6, -108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("si.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    public void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 37 / ((-5 - param4) / 57);
          if (!this.field_jb) {
            nl.a((byte) 8, "tochangedisplayname.ws", dg.a(false));
            return;
          }
          bm.a(3, (byte) 1);
          this.h((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("si.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 13) {
            this.h((byte) -126);
            return true;
          }
          if (param2 != 30) {
            si.n(16);
          }
          stackIn_6_0 = super.a(param0, param1, 30, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("si.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void m(int param0) {
        bm.a(17, (byte) 1);
        if (param0 > -54) {
          field_gb = false;
        }
    }

    public static void n(int param0) {
        field_ob = null;
        field_hb = null;
        field_nb = null;
        if (param0 == 8) {
          field_pb = null;
          field_ib = null;
          return;
        }
        field_ob = (sd) null;
        field_pb = null;
        field_ib = null;
    }

    final static boolean o(int param0) {
        if (param0 != 10) {
          field_nb = (cm) null;
          if (null == cl.field_J) {
            return false;
          }
          if (null != cl.field_J.c(true)) {
            return true;
          }
          return false;
        }
        if (null == cl.field_J) {
          return false;
        }
        if (null != cl.field_J.c(true)) {
          return true;
        }
        return false;
    }

    si(d param0, pk param1, String param2, boolean param3, boolean param4) {
        super(param0, new oi((si) null, param1, param2), 77, 10, 10);
        try {
          this.field_qb = param3 ? true : false;
          this.field_jb = false;
          this.field_mb = param4 ? true : false;
          this.field_lb = false;
          this.field_rb = param1;
          this.field_kb = new hm(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_P = true;
          this.b((byte) 95, this.field_kb);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != 3) {
            si.n(13);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "si.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        if (!this.field_J) {
          return;
        }
        this.field_J = false;
        if (!this.field_qb) {
          if (!this.field_mb) {
            if (param0 != -126) {
              this.field_jb = false;
              return;
            }
            return;
          }
          jl.i((byte) -124);
          if (param0 != -126) {
            this.field_jb = false;
            return;
          }
          return;
        }
        nd.a(25);
        if (param0 == -126) {
          return;
        }
        this.field_jb = false;
    }

    static {
        field_nb = new cm(0);
        field_ib = null;
        field_pb = "Connection restored.";
    }
}
