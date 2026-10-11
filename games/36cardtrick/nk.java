/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    boolean field_b;
    boolean field_e;
    int field_g;
    String field_d;
    String[] field_c;
    static int[] field_a;
    static String[] field_f;

    final static ff a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        ff stackIn_2_0 = null;
        jl stackIn_6_0 = null;
        rb stackIn_10_0 = null;
        mi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -78) {
            stackIn_2_0 = (ff) null;
            return stackIn_2_0;
          }
          if (param2 == 0L &&
            param3 != null) {
            stackIn_6_0 = new jl(param3, param4);
            return (ff) ((Object) stackIn_6_0);
          }
          if (param1) {
            stackIn_10_0 = new rb(param2, param4);
            return (ff) ((Object) stackIn_10_0);
          }
          stackIn_12_0 = new mi(param2, param4);
          return (ff) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("nk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          nk.a(47);
          field_f = null;
          field_a = null;
          return;
        }
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          r.field_p = false;
          cg.field_f = false;
          if (pc.field_a != null &&
            pc.field_a.field_E) {
            if (param0 == 8) {
              if (ei.field_e) {
                param2 = rl.field_t;
              } else {
                param2 = jh.field_d;
              }
              param0 = 2;
              i.field_a.a(ng.field_y, -95);
            }
            var3_int = 1;
            if (param0 == 10) {
              var3_int = 0;
              di.b(param1 ^ -10);
            }
            if (var3_int != 0) {
              if (cg.field_f) {
                param2 = re.a(lk.field_p, new String[]{param2}, (byte) -50);
              }
              if (ij.field_g) {
                param2 = ph.field_a;
              }
              pc.field_a.a(param2, (byte) -109, param0);
            }
            if (param0 != 256 &&
              param0 != 10 &&
              !ei.field_e) {
              i.field_a.l(-31940);
            }
          }
          if (param1 == -9) {
            return;
          }
          nk.a(40);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    nk(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    final static lb a(boolean param0, String param1) {
        RuntimeException var2 = null;
        lb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_f = (String[]) null;
          }
          stackIn_3_0 = new lb(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
