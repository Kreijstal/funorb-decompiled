/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static String field_a;
    static vo field_b;
    static int field_c;

    final static cg[] b(int param0) {
        if (param0 == 19795) {
          return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
        }
        c.a('ￄ', 89);
        return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_b = (vo) null;
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 != 441) {
          field_c = -62;
          if (param0 < 48) {
            if (param0 >= 65 &&
              90 >= param0) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 57) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (90 >= param0) {
            return true;
          }
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (90 >= param0) {
            return true;
          }
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (90 >= param0) {
          return true;
        }
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    final static String a(dj param0, String param1, String param2, String param3, byte param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -24) {
            c.b(-60);
          }
          if (!param0.a((byte) 73)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param1 + " - " + param0.b(param3, 109) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("c.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (!nm.field_c) {
          throw new IllegalStateException();
        }
        if (null != kk.field_i) {
          kk.field_i.h((byte) 20);
        }
        if (param0 == 65) {
          var1 = bo.a(param0 + 39);
          he.field_a = new ih(var1, (String) null, true, false, false);
          e.field_S.a(bm.field_d, true);
          bm.field_d.b(20, he.field_a);
          bm.field_d.f((byte) -70);
          return;
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
        field_b = new vo();
    }
}
