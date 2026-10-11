/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends tm {
    static String field_C;
    static String field_A;
    static String field_B;
    static int field_D;
    static nu field_F;
    static int field_E;

    jo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static kg[] a(sj param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kg[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param2, -1);
          if (param1 != 17369) {
            jo.g(27);
          }
          var5 = param0.a((byte) -121, param3, var4_int);
          stackIn_3_0 = ua.a(var4_int, var5, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jo.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        hd var6 = null;
        int var7 = 0;
        int var8 = 0;
        tv var9 = null;
        var8 = Kickabout.field_G;
        try {
          if (pg.field_b < rb.field_Bb) {
            pg.field_b = pg.field_b + 1;
          }
          if (na.field_Ab != ea.field_f.field_e) {
            c.field_c = c.field_c + (ea.field_f.field_e - na.field_Ab);
            na.field_Ab = ea.field_f.field_e;
          }
          if (pg.field_b <= 0) {
            return;
          }
          eq.a(0);
          g.field_a.b(0, param0);
          if (null != la.field_a) {
            if (iw.field_l) {
              la.field_a.a(g.field_a.field_T, 31947, g.field_a.field_F, param0);
            } else {
              la.field_a = null;
            }
          }
          var4_int = 52 / ((-26 - param3) / 46);
          for (var5_int = 0; var5_int < 5; var5_int++) {
            var6 = mr.field_W[var5_int];
            if (var6 != null) {
              if (var6.field_sb != 0) {
                kr.a(var6, true, var5_int);
              }
              var7 = r.a(0, var5_int);
              av.field_b[var5_int].field_N = il.field_d[var7];
              ds.field_a[var5_int].field_E = tf.field_h[var7];
            }
          }
          if (0 != uq.field_a.field_sb) {
            ck.field_b = new rb(uq.field_a.field_F, uq.field_a.field_T, uq.field_a.field_q, uq.field_a.field_mb, param2, tv.field_e, ai.field_H, hl.field_f, dw.field_e, hs.field_d, ul.field_c, (String) null, 0L);
          }
          var9 = rb.a(param1, sh.field_c, (byte) 26, eb.field_b);
          if (var9 != null) {
            bf.a(var9, (byte) -60);
          }
          var5 = fn.f(-3);
          if (var5 != null) {
            sn.field_e = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "jo.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            field_F = (nu) null;
          }
          stackIn_3_0 = new li(nt.k(39));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_F = null;
        if (param0 != 0) {
          return;
        }
        field_B = null;
        field_A = null;
    }

    final static boolean a(tf param0, boolean param1) {
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param1) {
            return false;
          }
          var2 = param0.g(24009);
          while (var2 instanceof ak) {
            if (var2.field_d instanceof ak) {
              if (((ak) (var2)).a((byte) -56) < ((ak) (var2.field_d)).a((byte) -9)) {
                return false;
              }
              var2 = var2.field_d;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("jo.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = "Reject";
        field_B = "tournament";
        field_C = "The Final starts in <%0> seconds...";
        field_E = 0;
    }
}
