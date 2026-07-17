/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends wf {
    private boolean field_Z;
    private String field_ab;
    static String field_bb;
    private String field_db;
    private boolean field_eb;
    static int[] field_gb;
    static vf field_fb;
    private oi field_cb;

    final void r(int param0) {
        if (param0 != 4595) {
            return;
        }
        ((jl) this).field_eb = true;
        ((jl) this).field_cb.field_O = false;
    }

    final void a(int param0, String param1, float param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -100) {
                break L1;
              } else {
                jl.h((byte) 32);
                break L1;
              }
            }
            L2: {
              if (param3) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (stackIn_5_0 == (((jl) this).field_Z ? 1 : 0)) {
                  L5: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (!param3) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L5;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L5;
                    }
                  }
                  ((jl) this).field_Z = stackIn_10_1 != 0;
                  if (((jl) this).field_Z) {
                    ((jl) this).field_cb.a(4210752, 8405024, (byte) -107);
                    ((jl) this).field_cb.field_O = true;
                    break L4;
                  } else {
                    ((jl) this).field_cb.a(4210752, 2113632, (byte) -115);
                    if (((jl) this).field_eb) {
                      ((jl) this).field_cb.field_O = false;
                      break L4;
                    } else {
                      ((jl) this).field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
                      ((jl) this).field_db = param1;
                      break L3;
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((jl) this).field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
              ((jl) this).field_db = param1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("jl.N(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        if (param0 < 125) {
            return;
        }
        field_fb = null;
        field_gb = null;
    }

    jl(hm param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((jl) this).field_ab = param1;
            if (null != ((jl) this).field_ab) {
                var3_int = cn.field_g.b(((jl) this).field_ab, 260, cn.field_g.field_I);
                ((jl) this).a(150 - -var3_int, 300, (byte) 55);
            }
            ((jl) this).field_cb = new oi(13, 50, 274, 30, 15, 2113632, 4210752);
            ((jl) this).field_Z = false;
            ((jl) this).field_cb.field_O = true;
            ((jl) this).field_eb = false;
            ((jl) this).a(-1, (fe) (Object) ((jl) this).field_cb);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "jl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        cn.field_g.b(((jl) this).field_db, (((jl) this).field_v >> 1) + param2, 103 + param1, 16777215, -1);
        if (((jl) this).field_ab != null) {
            eh.e(20 + param2, 120 + param1 + -7, 260, 8421504);
            int discarded$0 = cn.field_g.a(((jl) this).field_ab, param2 + 20, 120 + (param1 + 8), 260, 100, 16777215, -1, 1, 0, cn.field_g.field_I);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        field_gb = new int[9216];
        field_bb = "Black Gold<br>Crude Death";
        var0 = 48;
        var1 = 48;
        var2 = 0;
        L0: while (true) {
          if (var2 >= field_gb.length) {
            return;
          } else {
            var3 = var2 / 96;
            var4 = -(96 * var3) + var2;
            var5 = -var0 + var4;
            var6 = var3 + -var1;
            var7 = -(255.0 * Math.sqrt((double)(var5 * var5 + var6 * var6)) / (double)var0) + 255.0;
            field_gb[var2] = (int)(var7 + 0.5);
            if (field_gb[var2] < 0) {
              field_gb[var2] = 0;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }
}
