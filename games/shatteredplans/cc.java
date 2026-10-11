/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc extends ml {
    private go field_o;
    static String field_p;
    private go field_q;
    static int field_n;

    cc(go param0, go param1, go param2) {
        super(param0);
        try {
          this.field_o = param2;
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_o.field_s.toLowerCase();
          if (!param0) {
            cc.a(80, -33, 98, true);
          }
          var4 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) < 0) {
                return false;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("cc.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        qr var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        nf var9 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (ed.field_f > pg.field_J) {
            pg.field_J = pg.field_J + 1;
          }
          if (pc.field_m != so.field_q.field_d) {
            fl.field_f = fl.field_f + (so.field_q.field_d - pc.field_m);
            pc.field_m = so.field_q.field_d;
          }
          if (pg.field_J <= 0) {
            return;
          }
          bq.a(127);
          tg.field_c.a(param3, -20429);
          if (null != wi.field_c) {
            if (bg.field_g) {
              wi.field_c.a(tg.field_c.field_B, param3, tg.field_c.field_N, (byte) 0);
            } else {
              wi.field_c = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = oq.field_b[var4_int];
            if (var5 != null) {
              if (var5.field_rb != 0) {
                cj.a(var4_int, -127, var5);
              }
              var6 = id.a(-7019, var4_int);
              mr.field_d[var4_int].field_pb = bh.field_m[var6];
              n.field_n[var4_int].field_z = jf.field_d[var6];
            }
          }
          if (pr.field_c.field_rb != 0) {
            tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
          }
          var9 = sh.a(false, param2, tg.field_a, cr.field_c);
          if (var9 != null) {
            ks.a(var9, 0);
          }
          if (param0 >= -99) {
            cc.d(34);
          }
          var8 = bk.b(-127);
          if (var8 == null) {
            return;
          }
          dn.field_k = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "cc.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          p var8 = null;
          bc stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param3 != 12000) {
              field_p = (String) null;
            }
            var6 = null;
            var7 = null;
            if (null != dh.field_a.field_k) {
              oq.field_g = new ej(dh.field_a.field_k, 5200, 0);
              dh.field_a.field_k = null;
              var6 = new ua(255, oq.field_g, new ej(dh.field_a.field_n, 12000, 0), 2097152);
            }
            if (oq.field_g != null) {
              if (tr.field_Eb == null) {
                tr.field_Eb = new ej[dh.field_a.field_p.length];
              }
              if (tr.field_Eb[param2] == null) {
                tr.field_Eb[param2] = new ej(dh.field_a.field_p[param2], 12000, 0);
                dh.field_a.field_p[param2] = null;
              }
              var7 = new ua(param2, oq.field_g, tr.field_Eb[param2], 2097152);
            }
            var8 = lg.field_c.a(false, param2, (ua) (var6), (ua) (var7), param1);
            if (param5) {
              var8.c(255);
            }
            stackIn_15_0 = new bc(var8, param4, param0);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final u b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        u stackIn_2_0 = null;
        u stackIn_6_0 = null;
        u stackIn_10_0 = null;
        u stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11196) {
            stackIn_2_0 = (u) null;
            return stackIn_2_0;
          }
          var3 = this.field_q.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_6_0 = tj.field_b;
            return stackIn_6_0;
          }
          if (!gi.a(var4, -12076, var3)) {
            stackIn_10_0 = tj.field_b;
            return stackIn_10_0;
          }
          if (!this.b(true, param1)) {
            return p.field_g;
          }
          stackIn_14_0 = tj.field_b;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("cc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != 255) {
          field_p = (String) null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_9_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = im.field_c;
        synchronized (var1) {
          if (tc.field_B == fe.field_J) {
            return false;
          }
          oq.field_j = ng.field_a[tc.field_B];
          ho.field_h = fb.field_yb[tc.field_B];
          tc.field_B = 1 + tc.field_B & 127;
          if (param0 != 55) {
            return true;
          }
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static void f(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (224 <= tf.field_p) {
          js.a(256, 197126152);
        } else {
          var1 = tf.field_p % 32;
          js.a(-var1 + 32 + tf.field_p, 197126152);
        }
        var1Lifetime1 = -41 % ((param0 - 29) / 57);
    }

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        boolean stackIn_19_1 = false;
        String stackIn_22_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_35_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_q.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (cg.a(-76, var5)) {
            stackIn_6_0 = ab.field_b;
            return stackIn_6_0;
          }
          if (hb.a(var5, -31654)) {
            stackIn_10_0 = ol.field_d;
            return stackIn_10_0;
          }
          if (pf.a(var5, (byte) 24)) {
            stackIn_13_0 = no.field_d;
            return stackIn_13_0;
          }
          if (param0) {
            this.field_q = (go) null;
          }
          stackIn_19_1 = !(param0);
          if (this.b(stackIn_19_1, param1)) {
            stackIn_22_0 = hq.field_d;
            return stackIn_22_0;
          }
          if (var6.length() <= 0) {
            stackIn_37_0 = bc.field_l;
            return stackIn_37_0;
          }
          if (va.a(var6, -1, var5)) {
            stackIn_27_0 = po.field_e;
            return stackIn_27_0;
          }
          if (ms.a(var5, (byte) -53, var6)) {
            stackIn_31_0 = qg.field_k;
            return stackIn_31_0;
          }
          if (!na.a(var5, 127, var6)) {
            return ab.field_b;
          }
          stackIn_35_0 = po.field_e;
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("cc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static {
        field_p = "Unpacking graphics";
        field_n = 56;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$e$296a4c2b494e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_9_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = im.field_c;
        synchronized (var1) {
          if (tc.field_B == fe.field_J) {
            return false;
          }
          oq.field_j = ng.field_a[tc.field_B];
          ho.field_h = fb.field_yb[tc.field_B];
          tc.field_B = 1 + tc.field_B & 127;
          if (param0 != 55) {
            return true;
          }
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }
}
