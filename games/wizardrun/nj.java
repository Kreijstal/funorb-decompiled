/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends wl {
    static db[] field_k;
    int field_l;
    int field_o;
    String[][] field_n;
    long[][] field_q;
    int field_j;
    int[][] field_i;
    boolean field_m;
    static int field_r;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        if (param0 >= -86) {
          nj.a(-51);
        }
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          cf.field_i = false;
          lc.field_d = false;
          if (null != aa.field_lb &&
            aa.field_lb.field_H) {
            var3_int = 1;
            if (param2 == 8) {
              if (wi.field_J) {
                param1 = i.field_f;
              } else {
                param1 = fc.field_a;
              }
              param2 = 2;
              r.field_b.a(param0 + 5980, rg.field_S);
            }
            if (param2 == 10) {
              var3_int = 0;
              ie.a(-3870);
            }
            if (var3_int != 0) {
              if (lc.field_d) {
                param1 = di.a(new String[]{param1}, (byte) 84, ca.field_d);
              }
              if (ga.field_a) {
                param1 = ca.field_g;
              }
              aa.field_lb.a(param1, 57, param2);
            }
            if (param2 != 256 &&
              10 != param2 &&
              !wi.field_J) {
              r.field_b.h(-71);
            }
          }
          if (param0 == 10) {
            return;
          }
          var4 = (String) null;
          nj.a(-77, (String) null, 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    nj() {
    }

    static {
        field_r = 255;
        field_p = "World-Stage";
    }
}
