/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static ka field_e;
    static vf field_b;
    static String field_a;
    static String field_c;
    static byte[] field_d;

    public static void a(byte param0) {
        if (param0 != -50) {
          o var2 = (o) null;
          te.a(-56, 39, (o) null);
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ga.field_y = false;
          hl.field_e = false;
          if (param0 != -1) {
            return;
          }
          if (null != da.field_c) {
            if (!da.field_c.field_K) {
              return;
            }
            var3_int = 1;
            if (param1 == 8) {
              param1 = 2;
              if (eb.field_m) {
                param2 = n.field_fb;
              } else {
                param2 = k.field_f;
              }
              kb.field_O.a(lg.field_b, 10);
            }
            if (param1 == 10) {
              qk.d((byte) -80);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (ga.field_y) {
                param2 = ni.a(new String[]{param2}, 0, ug.field_a);
              }
              if (ae.field_C) {
                param2 = re.field_z;
              }
              da.field_c.a(true, param2, param1);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !eb.field_m) {
              kb.field_O.h(~param0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("te.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var1 = hl.field_d;
          synchronized (var1) {
            ja.field_f = kc.field_n;
            if (param0 != -11) {
              te.a(-52);
            }
            vf.field_a = vf.field_a + 1;
            if (df.field_Q < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                nj.field_c[var2] = false;
              }
              df.field_Q = qa.field_a;
            } else {
              while (qa.field_a != df.field_Q) {
                var2 = bb.field_g[qa.field_a];
                qa.field_a = qa.field_a + 1 & 127;
                if (0 <= var2) {
                  nj.field_c[var2] = true;
                  continue;
                }
                nj.field_c[~var2] = false;
              }
            }
            kc.field_n = b.field_M;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "te.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, o param2) {
        pa var3 = null;
        if (param1 != 9082) {
          return;
        }
        try {
          var3 = dk.field_s;
          var3.d(25, param0);
          var3.d(param2.field_p, (byte) 122);
          var3.a(param2.field_o, (byte) 106);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new vf();
        field_a = "Player names can be up to 12 letters, numbers and underscores";
        field_c = "Reload game";
    }
}
