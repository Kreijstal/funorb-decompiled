/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static boolean field_a;
    static int field_d;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        if (vl.field_n == null) {
            return;
        }
        nb.a(-2, vl.field_n);
        vl.field_n.a(0, ka.field_i);
        if (param0 <= -14) {
            vl.field_n = null;
            if (!(null == rb.field_d)) {
                rb.field_d.b((byte) -101);
            }
            f.field_kb.requestFocus();
            return;
        }
        d var2 = (d) null;
        jk.a((java.awt.Frame) null, 17, (d) null);
        vl.field_n = null;
        if (!(null == rb.field_d)) {
            rb.field_d.b((byte) -101);
        }
        f.field_kb.requestFocus();
    }

    public static void a(int param0) {
        if (param0 != -10848) {
            field_c = (String) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = Geoblox.field_C;
        try {
          mh.b();
          ok.field_g = 11;
          jf.field_b = new int[260];
          var1_int = -29 / ((param0 + 40) / 45);
          for (var2 = 0; 256 > var2; var2++) {
            var3 = 15.0;
            jf.field_b[var2] = (int)(255.0 * Math.pow((double)((float)var2 / 256.0f), var3));
          }
          var6 = 256;
          var1_int = var6;
          L1: while (jf.field_b.length > var6) {
            jf.field_b[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jk.F(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            jk.a(-65);
            return gh.field_P;
        }
        return gh.field_P;
    }

    final static nd a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        nd stackIn_5_0 = null;
        nd stackIn_9_0 = null;
        nd stackIn_18_0 = null;
        nd stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Geoblox.field_C;
        try {
          var2_int = param1.length();
          if (param0 != 255) {
            jk.a(118);
          }
          if (0 != var2_int) {
            if (var2_int > 63) {
              stackIn_9_0 = hk.field_x;
              return stackIn_9_0;
            } else {
              for (var3 = 0; var2_int > var3; var3++) {
                L2: {
                  var4 = param1.charAt(var3);
                  if (45 != var4) {
                    if (pk.field_q.indexOf(var4) == -1) {
                      stackIn_21_0 = ii.field_h;
                      return stackIn_21_0;
                    }
                  } else {
                    if (var3 != 0) {
                      if (var3 != -1 + var2_int) {
                        break L2;
                      }
                    }
                    stackIn_18_0 = ii.field_h;
                    return stackIn_18_0;
                  }
                }
              }
              return null;
            }
          } else {
            stackIn_5_0 = pj.field_f;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = (RuntimeException) (var2);

          stackIn_26_1 = new StringBuilder().append("jk.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(java.awt.Frame param0, int param1, d param2) {
        cb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Geoblox.field_C;
        try {
          L0: while (true) {
            var3 = param2.a(param0, 0);
            L1: while (var3.field_a == 0) {
              bc.a(0, 10L);
            }
            if (var3.field_a != 1) {
              bc.a(0, 100L);
              continue L0;
            } else {
              param0.setVisible(false);
              if (param1 != 10) {
                field_b = (String) null;
              }
              param0.dispose();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var3_ref);

          stackIn_13_1 = new StringBuilder().append("jk.C(");

          if (param0 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }


          stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = 0;
        field_a = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "Return to game";
    }
}
