/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends ha implements ql {
    private bg field_jb;
    private boolean field_mb;
    private boolean field_nb;
    static String field_kb;
    static int field_lb;

    jg(kj param0, bg param1) {
        super(param0, pj.field_c, c.field_j, false, false);
        try {
          this.field_jb = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(cj param0, int param1, boolean param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sk var5 = null;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          this.field_mb = true;
          if (param0.field_b) {
            var4 = bh.field_h;
          } else {
            if (null == param0.field_g) {
              var4 = param0.field_h;
              if (param0.field_i == 248) {
                if (!param2) {
                  jg.i((byte) 100);
                }
                var4 = fe.field_e;
                this.field_nb = true;
              }
            } else {
              var4 = me.field_l;
              if (null != this.field_jb) {
                this.field_jb.a(param1 ^ 193);
              }
            }
          }
          var5 = new sk((ha) (this), pj.field_c, var4);
          if (param1 != 9) {
            return;
          }
          if (param0.field_b) {
            if (param0.field_f) {
              this.c((byte) 54, new ja(this));
              return;
            }
            var5.a(0, (of) (this), pi.field_i);
          } else {
            if (!this.field_nb) {
              if (5 == param0.field_i) {
                var5.a((byte) -9, 11, wc.field_g);
                var5.a((byte) 119, 17, vh.field_L);
              } else {
                var5.a((byte) -81, -1, nf.field_E);
              }
            } else {
              var5.a(0, (of) (this), pi.field_i);
            }
            if (3 != param0.field_i) {
              if (param0.field_i != 6) {
                this.c((byte) 46, var5);
                return;
              }
              var5.a((byte) -105, 9, uf.field_k);
            } else {
              var5.a((byte) 115, 7, fc.field_m);
            }
          }
          this.c((byte) 46, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("jg.OB(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void h(byte param0) {
        if (param0 >= 79) {
          this.a(lh.a(true, fe.field_e, 248), 9, true);
          return;
        }
        field_kb = (String) null;
        this.a(lh.a(true, fe.field_e, 248), 9, true);
    }

    public static void r(int param0) {
        if (param0 != -249) {
          field_kb = (String) null;
          field_kb = null;
          return;
        }
        field_kb = null;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param3 != 7) {
          t var7 = (t) null;
          this.a(63, -42, -38, 66, (t) null);
        }
        if (this.field_nb) {
          ll.a((byte) 91, true, false);
          return;
        }
        try {
          ud.a(49);
          this.g((byte) -75);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean k(int param0) {
        if (!this.field_z) {
          if (param0 == -23913) {
            return super.k(param0 ^ 0);
          }
          return true;
        }
        if (this.field_mb) {
          if (param0 == -23913) {
            return super.k(param0 ^ 0);
          }
          return true;
        }
        cj var2 = dl.b(param0 + 23913);
        if (var2 == null) {
          if (param0 == -23913) {
            return super.k(param0 ^ 0);
          }
          return true;
        }
        this.a(var2, 9, false);
        if (param0 == -23913) {
          return super.k(param0 ^ 0);
        }
        return true;
    }

    final static void a(int param0, int param1) {
        MonkeyPuzzle2.field_E = d.field_h[param1];
        if (param0 == 3860) {
          ug.field_b = he.field_f[param1];
          tk.field_a = uk.field_o[param1];
          return;
        }
        jg.a(103, 94);
        ug.field_b = he.field_f[param1];
        tk.field_a = uk.field_o[param1];
    }

    private final static void i(byte param0) {
        if (param0 < 73) {
          field_lb = -14;
          nh.a((byte) 93, ii.a(false));
          return;
        }
        nh.a((byte) 93, ii.a(false));
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 <= 0) {
            throw new IllegalArgumentException();
          }
          if (dk.a(param1, (byte) -15)) {
            stackIn_6_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 32);
            return stackIn_6_0;
          }
          if (param0 <= 69) {
            stackIn_9_0 = 83;
            return stackIn_9_0;
          }
          var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_13_0 = uf.a(-122, param1, var4);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("jg.MB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_lb = 0;
        field_kb = "You have seen <%0> out of <%1> tips.";
    }
}
