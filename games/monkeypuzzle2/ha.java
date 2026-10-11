/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ha extends pc implements ql {
    static li field_Z;
    static ad field_fb;
    private boolean field_eb;
    static long field_ab;
    private jh field_gb;
    private boolean field_cb;
    private boolean field_hb;
    private boolean field_bb;
    static boolean field_db;
    private ta field_ib;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13) {
            var5_int = -44 / ((param3 - 37) / 50);
            stackIn_4_0 = super.a(param0, param1, param2, 120);
            return stackIn_4_0;
          }
          this.g((byte) -75);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ha.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 7) {
            var7 = (String) null;
            this.a(59, (String) null, -95);
          }
          if (!this.field_bb) {
            k.a(ii.a(false), (byte) -31, "tochangedisplayname.ws");
            return;
          }
          qh.a(3, true);
          this.g((byte) -75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ha.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static float a(byte param0, float param1) {
        if (param0 == 51) {
          return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
        }
        ha.a((byte) 30, 0.09005918353796005f);
        return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
    }

    final static String a(byte param0, long param1) {
        ec.field_b.setTime(new Date(param1));
        int var3 = ec.field_b.get(7);
        int var4 = ec.field_b.get(5);
        int var5 = ec.field_b.get(2);
        int var6 = ec.field_b.get(1);
        int var7 = -5 % ((param0 + 46) / 62);
        int var8 = ec.field_b.get(11);
        int var9 = ec.field_b.get(12);
        int var10 = ec.field_b.get(13);
        return jk.field_y[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uc.field_f[var5] + "-" + var6 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    final static void a(int param0, int param1, int param2, int param3, le[] param4, le[] param5, int param6, int param7, int param8, int param9, ta param10) {
        try {
          cf.a((byte) 66);
          int var11_int = -74 / ((68 - param1) / 47);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ha.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 > -39) {
          field_db = true;
          field_Z = null;
          field_fb = null;
          return;
        }
        field_Z = null;
        field_fb = null;
    }

    ha(kj param0, ta param1, String param2, boolean param3, boolean param4) {
        super(param0, new sk((ha) null, param1, param2), 77, 10, 10);
        try {
          this.field_hb = param3 ? true : false;
          this.field_bb = false;
          this.field_ib = param1;
          this.field_cb = false;
          this.field_eb = param4 ? true : false;
          this.field_gb = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_gb.field_G = true;
          this.b((byte) -104, this.field_gb);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void g(byte param0) {
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (this.field_hb) {
          vb.a((byte) 28);
        } else {
          if (this.field_eb) {
            nc.a(1);
          }
        }
        if (param0 == -75) {
          return;
        }
        field_fb = (ad) null;
    }

    final void a(int param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        sk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        String stackIn_12_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        sk var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (this.field_cb) {
            return;
          }
          stackIn_7_1 = (param2 == 256);
          this.field_bb = stackIn_7_1;
          this.field_cb = true;
          this.field_gb.a((byte) -115, 8405024, 4210752);
          var6 = new sk(this, this.field_ib, param1);
          var4 = var6;
          if (param2 == 5) {
            var6.a((byte) -116, 11, wc.field_g);
            var6.a((byte) 102, 17, vh.field_L);
          } else {
            if (param2 == 256) {
              var6.a(0, (of) (this), qd.field_c);
            } else {
              stackIn_11_0 = var6;
              stackIn_11_1 = 92;
              stackIn_11_2 = -1;
              if (this.field_hb) {
                stackIn_12_3 = qd.field_c;
              } else {
                stackIn_12_3 = nf.field_E;
              }
              ((sk) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2, stackIn_12_3);
            }
          }
          if (param2 != 3) {
            if (4 != param2) {
              if (param2 == 6) {
                var6.a((byte) 108, 9, uf.field_k);
              } else {
                if (param2 == 9) {
                  var6.a(0, (of) (this), qa.field_b);
                }
              }
            } else {
              var6.a((byte) -51, 8, ub.field_d);
            }
          } else {
            var6.a((byte) -27, 7, fc.field_m);
          }
          if (param0 != -10) {
            return;
          }
          this.c((byte) 108, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ha.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final void q(int param0) {
        this.field_gb.a((byte) -115, 2121792, 4210752);
        sk var2 = new sk(this, this.field_ib, sg.field_h);
        int var3 = 123 % ((11 - param0) / 43);
        var2.a((byte) -10, 15, a.field_d);
        this.c((byte) 50, var2);
    }

    static {
        field_Z = null;
        field_db = true;
    }
}
