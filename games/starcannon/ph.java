/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ph extends qj implements ga {
    static String[] field_nb;
    private fa field_kb;
    private qe field_fb;
    static String field_gb;
    private boolean field_ib;
    static String field_mb;
    private boolean field_hb;
    private boolean field_jb;
    private boolean field_lb;

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 1 << param2;
        if ((var3 & eb.field_c) != 0) {
          return;
        }
        eb.field_c = eb.field_c | var3;
        if (param1) {
          ph.a(-49, false, 94);
          jg.field_H = jg.field_H | var3;
          pk.field_a.b(90, new wf(param2));
          if (a.field_a) {
            return;
          }
          if (!wk.a(112)) {
            rh.a(param0, rj.field_h, ja.field_d, il.field_i, oe.field_a, -1893600464, 4, param2);
            return;
          }
          bh.field_e.b(86, new hb(param2, param0, ja.field_d, oe.field_a, il.field_i, rj.field_h));
          return;
        }
        jg.field_H = jg.field_H | var3;
        pk.field_a.b(90, new wf(param2));
        if (a.field_a) {
          return;
        }
        if (!wk.a(112)) {
          rh.a(param0, rj.field_h, ja.field_d, il.field_i, oe.field_a, -1893600464, 4, param2);
          return;
        }
        bh.field_e.b(86, new hb(param2, param0, ja.field_d, oe.field_a, il.field_i, rj.field_h));
    }

    final void o(int param0) {
        this.field_kb.b(2121792, 2, 4210752);
        kj var2 = new kj(this, this.field_fb, cf.field_p);
        if (param0 >= 121) {
          var2.a(fd.field_b, 13759, 15);
          this.c(20317, var2);
          return;
        }
    }

    public static void m(int param0) {
        field_mb = null;
        field_nb = null;
        field_gb = null;
        if (param0 != -1) {
          field_gb = (String) null;
        }
    }

    final void n(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        int var2 = -21 / ((param0 + 47) / 42);
        if (this.field_ib) {
          vg.a(32083);
          return;
        }
        if (this.field_lb) {
          ng.h((byte) -58);
          return;
        }
    }

    public void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_hb) {
            fd.a(3, 0);
            this.n(125);
          } else {
            ef.a("tochangedisplayname.ws", ll.b(90), 100);
          }
          if (!param2) {
            return;
          }
          ph.a(-104, false, -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ph.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -90) {
            this.field_jb = false;
          }
          if (param3 != 13) {
            stackIn_6_0 = super.a(param0, param1, (byte) -90, param3);
            return stackIn_6_0;
          }
          this.n(108);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ph.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, int param1, boolean param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        kj stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        kj var5 = null;
        try {
          if (this.field_jb) {
            return;
          }
          stackIn_6_1 = (param2);
          this.field_jb = stackIn_6_1;
          stackIn_9_1 = (param1 == 256);
          this.field_hb = stackIn_9_1;
          this.field_kb.b(8405024, 2, 4210752);
          var5 = new kj(this, this.field_fb, param0);
          if (param1 == 5) {
            var5.a(hd.field_i, 13759, 11);
            var5.a(bg.field_b, 13759, 17);
          } else {
            if (256 != param1) {
              stackIn_14_0 = var5;
              if (this.field_ib) {
                stackIn_15_1 = ma.field_g;
              } else {
                stackIn_15_1 = dk.field_t;
              }
              ((kj) (Object) stackIn_14_0).a(stackIn_15_1, 13759, -1);
            } else {
              var5.a((byte) 88, (qg) (this), ma.field_g);
            }
          }
          if (3 == param1) {
            var5.a(kf.field_u, 13759, 7);
          } else {
            if (param1 == 4) {
              var5.a(s.field_d, 13759, 8);
            } else {
              if (param1 != 6) {
                if (param1 == 9) {
                  var5.a((byte) 123, (qg) (this), db.field_B);
                }
              } else {
                var5.a(dk.field_w, 13759, 9);
              }
            }
          }
          this.c(20317, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("ph.J(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ph(tc param0, qe param1, String param2, boolean param3, boolean param4) {
        super(param0, new kj((ph) null, param1, param2), 77, 10, 10);
        try {
          this.field_hb = false;
          this.field_jb = false;
          this.field_lb = param4 ? true : false;
          this.field_ib = param3 ? true : false;
          this.field_fb = param1;
          this.field_kb = new fa(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_D = true;
          this.a(true, this.field_kb);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_gb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_mb = "Confirm Email:";
    }
}
