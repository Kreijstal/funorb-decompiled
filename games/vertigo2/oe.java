/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends fj implements ij {
    private boolean field_ub;
    static String field_rb;
    private boolean field_nb;
    static ee field_qb;
    static String field_sb;
    static tr field_pb;
    private mk field_tb;
    static int[][] field_ob;
    static String field_vb;

    final static byte[] a(int param0, byte[] param1, int param2, mi param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param3.c((byte) -96, param2);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          var5 = param3.c((byte) -118, 3);
          if (param0 != 12635) {
            field_qb = (ee) null;
          }
          var6 = (byte)param3.c((byte) -101, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(param3.c((byte) -125, var5) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("oe.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_qb = null;
        field_sb = null;
        field_vb = null;
        field_pb = null;
        field_ob = (int[][]) null;
        if (param0 != 12705) {
          oe.p(83);
        }
        field_rb = null;
    }

    final static boolean q(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 59) {
          field_rb = (String) null;
        }
        stackIn_6_0 = (null != lo.field_k) && (bm.field_I == rg.field_d);
        return stackIn_6_0;
    }

    final void o(int param0) {
        this.a(fn.a(248, true, af.field_J), true, -120);
        if (param0 != 16614) {
          oe.q(56);
        }
    }

    final boolean j(int param0) {
        ch var2 = null;
        if (param0 != 17) {
          this.field_ub = false;
        }
        if (this.field_I &&
          !this.field_nb) {
          var2 = ar.b(param0 ^ 17);
          if (var2 != null) {
            this.a(var2, false, param0 ^ -64);
          }
        }
        return super.j(17);
    }

    private final void a(ch param0, boolean param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        rh var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_nb = true;
          if (param2 >= -45) {
            field_pb = (tr) null;
          }
          if (!param0.field_a) {
            if (param0.field_b == null) {
              var4 = param0.field_j;
              if (param0.field_h == 248) {
                if (!param1) {
                  mr.a(false);
                }
                this.field_ub = true;
                var4 = af.field_J;
              }
            } else {
              var4 = wa.field_g;
              if (this.field_tb != null) {
                this.field_tb.a(-4384);
              }
            }
          } else {
            var4 = dh.field_c;
          }
          var5 = new rh((fj) (this), sg.field_a, var4);
          if (!param0.field_a) {
            if (!this.field_ub) {
              if (param0.field_h != 5) {
                var5.a(ap.field_f, -1, -61);
              } else {
                var5.a(jb.field_A, 11, -123);
                var5.a(jd.field_b, 17, -50);
              }
            } else {
              var5.a(vi.field_x, (uf) (this), -116);
            }
            if (param0.field_h == 3) {
              var5.a(hb.field_o, 7, -33);
            } else {
              if (param0.field_h != 6) {
                this.a(false, var5);
                return;
              }
              var5.a(hm.field_H, 9, -26);
            }
          } else {
            if (param0.field_i) {
              this.a(false, new ue(this));
              return;
            }
            var5.a(vi.field_x, (uf) (this), -110);
          }
          this.a(false, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("oe.UA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    oe(sd param0, mk param1) {
        super(param0, sg.field_a, ac.field_L, false, false);
        try {
          this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (this.field_ub) {
          ak.a(true, false, 3);
          return;
        }
        try {
          fj.g((byte) -127);
          this.h((byte) 57);
          int var6_int = 112 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "oe.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_rb = "TAB - hide chat temporarily";
        field_ob = (int[][]) null;
        field_sb = "Unpacking sound effects";
        field_qb = new ee();
        field_vb = "Instructions";
    }
}
