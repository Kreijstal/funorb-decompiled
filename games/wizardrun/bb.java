/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bb extends uh {
    static String field_g;
    private long field_m;
    static kl field_h;
    static String field_j;
    static int field_k;
    static String field_l;
    private String field_i;

    sd a(boolean param0) {
        if (!param0) {
            return (sd) null;
        }
        return ud.field_c;
    }

    public static void c(int param0) {
        field_g = null;
        field_j = null;
        if (param0 != 24957) {
            return;
        }
        field_l = null;
        field_h = null;
    }

    final static void a(int param0, int param1, byte param2, qj param3) {
        try {
            ii.field_c = param0;
            if (param2 != -13) {
                field_k = 125;
            }
            ic.field_c = param1;
            tl.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "bb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        if (!oa.a(param0 ^ 25325)) {
            return;
        }
        le.a(false, 4, 15991);
        if (param0 != -100) {
            bb.b((byte) 126);
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            var3 = hg.a(param0, (byte) -118, param2);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = param1;
              L1: while (true) {
                if (param0.length() > var4) {
                  if (df.a(param0.charAt(var4), true)) {
                    var4++;
                    continue L1;
                  } else {
                    stackIn_10_0 = nk.field_Q;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("bb.L(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static void b(int param0) {
        ei var1;
        var1 = (ei) ((Object) lh.field_b.c(8192));
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          ed.a(var1.field_q, var1.field_v, var1.field_o);
          ed.c(var1.field_r, var1.field_u, var1.field_s, var1.field_p);
          var1.field_q = null;
          qa.field_q.a(var1, false);
          if (param0 != 4) {
            bb.b((byte) -18);
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, va param1) {
        RuntimeException runtimeException = null;
        va var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.b(param0 + 1290648724, this.field_m);
              param1.a(this.field_i, -66);
              if (param0 == 4) {
                break L1;
              } else {
                var4 = (va) null;
                this.a(-43, (va) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bb.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    bb(long param0, String param1) {
        try {
            this.field_m = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "bb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "STARPOWER";
        field_l = "Name";
    }
}
