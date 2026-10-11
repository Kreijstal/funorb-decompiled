/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static int[] field_a;
    static int field_c;
    static String field_b;

    final static void a(byte param0, String param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (param0 >= -103) {
            field_c = 3;
          }
          if (a.field_e == -1 &&
            dg.field_n == -1) {
            a.field_e = pe.field_d;
            dg.field_n = la.field_c;
          }
          boolean decompiledFrameRemainder0 = true;
          di.field_m = di.field_m + 1;
          if (param1 == null) {
            decompiledFrameRemainder0 = (sc.field_c == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(sc.field_c));
          }
          if (decompiledFrameRemainder0) {
            if (!eg.field_h) {
              if (di.field_m >= le.field_a) {
                stackIn_19_0 = (le.field_a + hf.field_l > di.field_m) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_19_0;
            if (param1 != null) {
              if (eg.field_h) {
                di.field_m = le.field_a;
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var2_int != 0) {
                  di.field_m = le.field_a;
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              di.field_m = 0;
            }
            ti.field_c = a.field_e;
            ua.field_a = dg.field_n;
            if (param1 == null) {
              if (var2_int != 0) {
                eg.field_h = true;
              }
            } else {
              eg.field_h = false;
            }
          }
          sc.field_c = param1;
          if (!eg.field_h &&
            le.field_a > di.field_m &&
            uf.field_d) {
            ua.field_a = dg.field_n;
            ti.field_c = a.field_e;
            di.field_m = 0;
          }
          a.field_e = -1;
          if (eg.field_h &&
            sb.field_c == di.field_m) {
            eg.field_h = false;
            di.field_m = 0;
          }
          dg.field_n = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("qi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static id a(int param0) {
        id var1 = new id(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], og.field_c[0], of.field_g);
        rc.b((byte) 64);
        if (param0 == 14609) {
          return var1;
        }
        return (id) null;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    static {
        field_a = new int[8];
        field_c = 0;
    }
}
