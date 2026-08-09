/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mc extends hh {
    static r field_x;
    static cn[] field_w;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        try {
            if (param4) {
                ll.a(2, param2 - -param1.field_q, param1.field_x, param1.field_s, param3 - -param1.field_v);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "mc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    mc(se param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    public static void c(int param0) {
        field_x = null;
        field_w = null;
        int var1 = 44 / ((param0 - -51) / 47);
    }

    mc(int param0) {
        this(lp.field_C, param0);
    }

    final static void b(int param0, int param1) {
        am.field_d = (param0 << -531048592) / param1;
        am.field_g = 100 * param0 / 150;
        am.field_c = param0 * 400 / 150;
    }

    final static void a(byte param0, int param1, int[] param2) {
        try {
            if (param0 <= 15) {
                mc.c(21);
            }
            tg.field_f[param1] = param2;
            bf.field_f[param1] = (qe) ((Object) new qc(param1));
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "mc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, boolean param2, boolean[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            if (ed.c(param2)) {
              var7 = (String) null;
              throw new RuntimeException((String) null);
            } else {
              if (eh.a(true, param0)) {
                var8 = (String) null;
                throw new RuntimeException((String) null);
              } else {
                if (null == gm.field_d) {
                  var9 = (String) null;
                  throw new RuntimeException((String) null);
                } else {
                  L1: {
                    if (!gm.field_d.field_H) {
                      ac.field_B.d((byte) -89, 58);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  o.a(121);
                  ac.field_B.d((byte) -105, 61);
                  var4_int = 0;
                  var5 = 0;
                  L2: while (true) {
                    if ((var5 ^ -1) <= -9) {
                      ac.field_B.i(param1, -97);
                      ac.field_B.a(6, var4_int);
                      break L0;
                    } else {
                      if (param3[var5]) {
                        var4_int = var4_int | 1 << var5;
                        var5++;
                        continue L2;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("mc.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_x = new r();
    }
}
