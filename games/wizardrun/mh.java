/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends gf implements qd {
    private boolean field_mb;
    static String[] field_sb;
    static java.awt.Font field_ob;
    private boolean field_rb;
    static volatile int field_pb;
    static kl field_jb;
    static String field_lb;
    private vd field_qb;
    static int field_tb;
    private hd field_ub;
    private boolean field_kb;
    private boolean field_nb;

    final void n(int param0) {
        if (param0 != 8) {
          field_tb = 105;
        }
        this.field_ub.a(2121792, -1028717695, 4210752);
        vc var2 = new vc(this, this.field_qb, sh.field_d);
        var2.a((byte) -31, ud.field_a, 15);
        this.c(var2, param0 - 119);
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param1) {
            this.l(-27697);
            return true;
          }
          if (param2 <= -96) {
            stackIn_8_0 = super.a(param0, param1, (byte) -99, param3);
            return stackIn_8_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("mh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static le a(byte param0, mg param1) {
        int var7 = 0;
        le stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          var2_int = param1.g(8, -11719);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = oe.a((byte) -55, param1) ? 1 : 0;
          if (param0 != -117) {
            field_ob = (java.awt.Font) null;
          }
          var4 = oe.a((byte) -55, param1) ? 1 : 0;
          var5 = new le();
          var5.field_L = (short)param1.g(16, param0 ^ 11698);
          var5.field_P = sa.a(16, (byte) -48, param1, var5.field_P);
          var5.field_a = sa.a(16, (byte) -48, param1, var5.field_a);
          var5.field_w = sa.a(16, (byte) -48, param1, var5.field_w);
          var5.field_N = (short)param1.g(16, -11719);
          var5.field_p = sa.a(16, (byte) -48, param1, var5.field_p);
          var5.field_C = sa.a(16, (byte) -48, param1, var5.field_C);
          var5.field_I = sa.a(16, (byte) -48, param1, var5.field_I);
          if (var3 != 0) {
            var5.field_y = (short)param1.g(16, -11719);
            var5.field_k = sa.a(16, (byte) -48, param1, var5.field_k);
            var5.field_R = sa.a(16, (byte) -48, param1, var5.field_R);
            var5.field_o = sa.a(16, (byte) -48, param1, var5.field_o);
            var5.field_c = sa.a(16, (byte) -48, param1, var5.field_c);
            var5.field_Q = sa.a(16, (byte) -48, param1, var5.field_Q);
            var5.field_d = sa.a(16, (byte) -48, param1, var5.field_d);
          }
          if (var4 != 0) {
            param1.g(16, -11719);
            var5.field_G = sa.a(16, (byte) -48, param1, var5.field_G);
            var5.field_H = sa.a(16, (byte) -48, param1, var5.field_H);
            var5.field_m = sa.a(16, (byte) -48, param1, var5.field_m);
            var5.field_z = sa.a(16, (byte) -48, param1, var5.field_z);
            var5.field_v = sa.a(16, (byte) -48, param1, var5.field_v);
          }
          if (oe.a((byte) -55, param1)) {
            var5.field_O = sa.a(16, (byte) -48, param1, var5.field_O);
          }
          if (oe.a((byte) -55, param1)) {
            var5.field_x = sd.a(param1, var5.field_x, 16, (byte) 11);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_x.length; var7++) {
              if (var6 < (var5.field_x[var7] & 255)) {
                var6 = 255 & var5.field_x[var7];
              }
            }
            if (var6 == 0) {
              var5.field_x = null;
            } else {
              var5.field_n = (byte)(var6 + 1);
            }
          }
          stackIn_26_0 = var5;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("mh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int[] m(int param0) {
        if (param0 != -26421) {
          return (int[]) null;
        }
        return new int[8];
    }

    public static void e(boolean param0) {
        field_lb = null;
        field_ob = null;
        field_jb = null;
        field_sb = null;
        if (!param0) {
          mg var2 = (mg) null;
          mh.a((byte) -60, (mg) null);
        }
    }

    public void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!this.field_mb) {
            rb.a("tochangedisplayname.ws", -1926289535, jg.f(param0 + 18906));
          } else {
            jc.a((byte) 115, 3);
            this.l(-27697);
          }
          if (param0 != -18905) {
            this.field_mb = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mh.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var4 = wizardrun.field_H;
        wc.field_k = 0;
        hb.field_k = null;
        si.field_q = null;
        int var2 = nf.field_b;
        nf.field_b = kj.field_a;
        ii.field_f.field_k = ii.field_f.field_k + 1;
        kj.field_a = var2;
        if (param1 == 51) {
          ii.field_f.field_n = 2;
        } else {
          if (param1 != 50) {
            ii.field_f.field_n = 1;
          } else {
            ii.field_f.field_n = 5;
          }
        }
        if (2 <= ii.field_f.field_k &&
          param1 == 51) {
          return 2;
        }
        if (2 <= ii.field_f.field_k &&
          param1 == 50) {
          return 5;
        }
        if (ii.field_f.field_k >= 4) {
          return 1;
        }
        int var3 = -105 % ((param0 - 34) / 47);
        return -1;
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        vc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        vc var6 = null;
        var5 = wizardrun.field_H;
        try {
          if (this.field_kb) {
            return;
          }
          this.field_kb = true;
          stackIn_6_1 = (param2 == 256);
          this.field_mb = stackIn_6_1;
          this.field_ub.a(8405024, -1028717695, 4210752);
          var6 = new vc(this, this.field_qb, param0);
          var4 = var6;
          if (param2 != 5) {
            if (256 != param2) {
              stackIn_12_0 = var6;
              stackIn_12_1 = -31;
              if (this.field_rb) {
                stackIn_13_2 = me.field_a;
              } else {
                stackIn_13_2 = ti.field_h;
              }
              ((vc) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_13_2, -1);
            } else {
              var6.a(0, me.field_a, (ce) (this));
            }
          } else {
            var6.a((byte) -31, da.field_j, 11);
            var6.a((byte) -31, pk.field_q, 17);
          }
          if (param1 <= 12) {
            mh.m(-64);
          }
          if (param2 == 3) {
            var6.a((byte) -31, vl.field_g, 7);
          } else {
            if (param2 == 4) {
              var6.a((byte) -31, wh.field_b, 8);
            } else {
              if (param2 == 6) {
                var6.a((byte) -31, ka.field_h, 9);
              } else {
                if (param2 == 9) {
                  var6.a(0, de.field_a, (ce) (this));
                }
              }
            }
          }
          this.c(var6, -116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("mh.EA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void l(int param0) {
        if (param0 != -27697) {
          field_sb = (String[]) null;
        }
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (this.field_rb) {
          uk.a(19702);
        } else {
          if (this.field_nb) {
            me.a(param0 ^ -27704);
          }
        }
    }

    mh(wi param0, vd param1, String param2, boolean param3, boolean param4) {
        super(param0, new vc((mh) null, param1, param2), 77, 10, 10);
        try {
          this.field_qb = param1;
          this.field_mb = false;
          this.field_rb = param3 ? true : false;
          this.field_kb = false;
          this.field_nb = param4 ? true : false;
          this.field_ub = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ub.field_I = true;
          this.a((ub) (this.field_ub), (byte) 127);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_sb = new String[]{"Complete the game", "Capture and pop all creatures in world 1", "Complete world 1", "Reach world 4 from world 1 without losing a life", "Reach world 6 from world 1 without losing a life", "Kill the Giant Spider on world 1, losing no lives", "Kill the Pygmy Boss on world 2, losing no lives", "Kill the Pirate Captain on world 3, losing no lives", "Kill the Troll Ancient on world 4, losing no lives", "Kill the Ice Dragon on world 5, losing no lives", "Kill the Harpy King on world 6, losing no lives", "Collect 100 pumpkins in world 6 during halloween"};
        field_pb = 0;
        field_lb = "Fullscreen";
    }
}
