/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static cd field_d;
    static volatile int field_b;
    static int field_c;
    static String field_a;

    final static am a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_5_0 = null;
        am stackIn_9_0 = null;
        am stackIn_19_0 = null;
        am stackIn_23_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 <= 40) {
            field_b = 88;
          }
          if (var2_int == 0) {
            stackIn_5_0 = si.field_s;
            return stackIn_5_0;
          }
          if (var2_int > 63) {
            stackIn_9_0 = wk.field_f;
            return stackIn_9_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var2_int - 1 == var3) {
                stackIn_19_0 = lh.field_c;
                return stackIn_19_0;
              }
            } else {
              if (fb.field_i.indexOf(var4) == -1) {
                stackIn_23_0 = lh.field_c;
                return stackIn_23_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2Lifetime1;
        kd.field_a = null;
        ii.field_T = 0;
        pg.field_a = null;
        if (!param0) {
          field_a = (String) null;
          var2 = oh.field_c;
          oh.field_c = pi.field_o;
          if (param1 == 51) {
            lg.field_n.field_a = 2;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (lg.field_n.field_b < 2) {
              if (lg.field_n.field_b >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(lg.field_n.field_b < 4)) {
                return 1;
              }
              return -1;
            }
            if (51 == param1) {
              return 2;
            }
            if (lg.field_n.field_b < 2) {
              if (!(lg.field_n.field_b < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          if (50 != param1) {
            lg.field_n.field_a = 1;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (lg.field_n.field_b < 2) {
              if (lg.field_n.field_b >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(lg.field_n.field_b < 4)) {
                return 1;
              }
              return -1;
            }
            if (51 == param1) {
              return 2;
            }
            if (lg.field_n.field_b < 2) {
              if (!(lg.field_n.field_b < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          lg.field_n.field_a = 5;
          pi.field_o = var2;
          lg.field_n.field_b = lg.field_n.field_b + 1;
          if (lg.field_n.field_b < 2) {
            if (lg.field_n.field_b >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          if (51 == param1) {
            return 2;
          }
          if (lg.field_n.field_b < 2) {
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 50) {
            return 5;
          }
          if (!(lg.field_n.field_b < 4)) {
            return 1;
          }
          return -1;
        }
        var2Lifetime1 = oh.field_c;
        oh.field_c = pi.field_o;
        if (param1 == 51) {
          lg.field_n.field_a = 2;
          pi.field_o = var2Lifetime1;
          lg.field_n.field_b = lg.field_n.field_b + 1;
          if (lg.field_n.field_b >= 2) {
            if (51 == param1) {
              return 2;
            }
            if (lg.field_n.field_b >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          if (lg.field_n.field_b >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(lg.field_n.field_b < 4)) {
            return 1;
          }
          return -1;
        }
        if (50 != param1) {
          lg.field_n.field_a = 1;
          pi.field_o = var2Lifetime1;
          lg.field_n.field_b = lg.field_n.field_b + 1;
          if (lg.field_n.field_b >= 2) {
            if (51 == param1) {
              return 2;
            }
            if (lg.field_n.field_b >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(lg.field_n.field_b < 4)) {
              return 1;
            }
            return -1;
          }
          if (lg.field_n.field_b >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(lg.field_n.field_b < 4)) {
            return 1;
          }
          return -1;
        }
        lg.field_n.field_a = 5;
        pi.field_o = var2Lifetime1;
        lg.field_n.field_b = lg.field_n.field_b + 1;
        if (lg.field_n.field_b >= 2) {
          if (51 == param1) {
            return 2;
          }
          if (lg.field_n.field_b >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(lg.field_n.field_b < 4)) {
            return 1;
          }
          return -1;
        }
        if (lg.field_n.field_b >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(lg.field_n.field_b < 4)) {
          return 1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -14955) {
          dh.a(-41);
        }
    }

    static {
        field_b = -1;
        field_a = "Suggested names: ";
        field_d = new cd("usename");
    }
}
