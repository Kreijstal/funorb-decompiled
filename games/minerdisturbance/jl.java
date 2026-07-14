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
        int stackIn_5_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          if (param0 < -100) {
            break L0;
          } else {
            jl.h((byte) 32);
            break L0;
          }
        }
        L1: {
          if (param3) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            if (stackIn_5_0 == (((jl) this).field_Z ? 1 : 0)) {
              L4: {
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param3) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L4;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L4;
                }
              }
              ((jl) this).field_Z = stackIn_10_1 != 0;
              if (((jl) this).field_Z) {
                ((jl) this).field_cb.a(4210752, 8405024, (byte) -107);
                ((jl) this).field_cb.field_O = true;
                break L3;
              } else {
                ((jl) this).field_cb.a(4210752, 2113632, (byte) -115);
                if (((jl) this).field_eb) {
                  ((jl) this).field_cb.field_O = false;
                  break L3;
                } else {
                  ((jl) this).field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
                  ((jl) this).field_db = param1;
                  break L2;
                }
              }
            } else {
              break L3;
            }
          }
          ((jl) this).field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
          ((jl) this).field_db = param1;
          break L2;
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
        int var3 = 0;
        ((jl) this).field_ab = param1;
        if (null != ((jl) this).field_ab) {
            var3 = cn.field_g.b(((jl) this).field_ab, 260, cn.field_g.field_I);
            ((jl) this).a(150 - -var3, 300, (byte) 55);
        }
        ((jl) this).field_cb = new oi(13, 50, 274, 30, 15, 2113632, 4210752);
        ((jl) this).field_Z = false;
        ((jl) this).field_cb.field_O = true;
        ((jl) this).field_eb = false;
        ((jl) this).a(-1, (fe) (Object) ((jl) this).field_cb);
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        cn.field_g.b(((jl) this).field_db, (((jl) this).field_v >> -2072418207) + param2, 103 + param1, 16777215, -1);
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
          } else {
            var3 = var2 / 96;
            var4 = -(96 * var3) + var2;
            var5 = -var0 + var4;
            var6 = var3 + -var1;
            var7 = -(255.0 * Math.sqrt((double)(var5 * var5 + var6 * var6)) / (double)var0) + 255.0;
            field_gb[var2] = (int)(var7 + 0.5);
            if ((field_gb[var2] ^ -1) > -1) {
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
