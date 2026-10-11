/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_a;

    final static boolean a(int[] param0, byte param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        q var4_ref_q = null;
        int var4 = 0;
        q var5 = null;
        int var7 = 0;
        var7 = StarCannon.field_A;
        try {
          if (pb.field_a != r.field_c) {
            return false;
          }
          var2_long = dd.b(param1 + 198);
          if (jl.field_h != 0 &&
            0 > t.field_C) {
            var4_ref_q = (q) (le.field_e.c(-3905));
            if (var4_ref_q != null &&
              var2_long > var4_ref_q.field_g) {
              var4_ref_q.b(4);
              il.field_g = var4_ref_q.field_k.length;
              se.field_p.field_g = 0;
              for (var5_int = 0; var5_int < il.field_g; var5_int++) {
                se.field_p.field_f[var5_int] = var4_ref_q.field_k[var5_int];
              }
              wc.field_i = hh.field_a;
              hh.field_a = bh.field_d;
              bh.field_d = vh.field_t;
              vh.field_t = var4_ref_q.field_f;
              return true;
            }
          }
          if (param1 != -99) {
            field_a = (String) null;
          }
          while (true) {
            if (t.field_C < 0) {
              se.field_p.field_g = 0;
              if (!ag.a(125, 1)) {
                return false;
              }
              t.field_C = se.field_p.m(255);
              se.field_p.field_g = 0;
              il.field_g = param0[t.field_C];
            }
            if (!fk.a(false)) {
              return false;
            }
            if (jl.field_h == 0) {
              wc.field_i = hh.field_a;
              hh.field_a = bh.field_d;
              bh.field_d = vh.field_t;
              vh.field_t = t.field_C;
              t.field_C = -1;
              return true;
            }
            var4 = jl.field_h;
            if (fc.field_b != 0.0) {
              var4 = (int)((double)var4 + di.field_l.nextGaussian() * fc.field_b);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new q(var2_long + (long)var4, t.field_C, new byte[il.field_g]);
            for (var6 = 0; var6 < il.field_g; var6++) {
              var5.field_k[var6] = se.field_p.field_f[var6];
            }
            le.field_e.b(80, var5);
            t.field_C = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("ll.C(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.applet.Applet b(int param0) {
        if (oj.field_f != null) {
          return oj.field_f;
        }
        if (param0 < 67) {
          ll.b(8);
        }
        return (java.applet.Applet) ((Object) ic.field_b);
    }

    final static hh a(boolean param0, byte param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param1 != -49) {
            field_a = (String) null;
          }
          var6 = null;
          if (-1 == param2.indexOf('@')) {
            var7 = (CharSequence) ((Object) param2);
            var4_long = ik.a(var7, (byte) -83);
          } else {
            var6 = param2;
          }
          stackIn_6_0 = ik.a(param3, -66, var4_long, (String) (var6), param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ll.B(").append(param0).append(',').append(param1).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_a = (String) null;
        }
    }

    static {
        field_a = "Name is available";
    }
}
