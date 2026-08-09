/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends mc {
    int field_H;
    ng field_B;
    int field_C;
    int field_n;
    wf field_y;
    int field_D;
    int field_J;
    int field_s;
    ee field_I;
    int field_E;
    int field_G;
    int field_x;
    int field_A;
    static go field_z;
    int field_p;
    int field_r;
    int field_F;
    int field_o;
    lm field_q;
    int field_u;
    int field_v;
    static String field_w;
    int field_t;

    final void a(int param0) {
        this.field_B = null;
        this.field_q = null;
        this.field_I = null;
        this.field_y = null;
        int var2 = -115 / ((15 - param0) / 40);
    }

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (vd.field_a < 10) {
                L2: {
                  var3_int = 0;
                  if (ja.field_h) {
                    ja.field_h = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                rh.a(th.field_e, ai.c((byte) -63), vi.a(-31307), (byte) 84, var3_int != 0);
                break L1;
              } else {
                if (!me.a((byte) -99)) {
                  ra.a();
                  ef.a(320, 240, -109);
                  bo.a(0, 0, param0, -2);
                  break L1;
                } else {
                  if (fn.field_R == 0) {
                    lg.a(param1, 1, false);
                    bo.a(0, 0, param0, -2);
                    break L1;
                  } else {
                    kf.a(-8129, param0);
                    break L1;
                  }
                }
              }
            }
            if (param2 == 32511) {
              break L0;
            } else {
              oc.b((byte) 26);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static oh[] a(String param0, boolean param1, ah param2, String param3) {
        oh[] var4 = null;
        RuntimeException var4_ref = null;
        oh[] var5 = null;
        oh[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = bf.a((byte) -117, param2, param3, param0);
              var4 = var5;
              var5[3].field_F = var5[3].field_E;
              var5[1].field_t = var5[1].field_u;
              var5[5].field_F = var5[5].field_E;
              var5[7].field_t = var5[7].field_u;
              if (param1) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (oh[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("oc.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_z = (go) null;
            field_z = null;
            field_w = null;
            return;
        }
        field_z = null;
        field_w = null;
    }

    final static void b(byte param0) {
        String var1;
        String var2;
        if (param0 < 61) {
          L0: {
            field_w = (String) null;
            if (null == ll.field_t) {
              break L0;
            } else {
              var2 = ll.field_t;
              var1 = var2;
              go.a((byte) -105, sk.a(new String[]{var2}, lc.field_f, 122));
              ll.field_t = null;
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null == ll.field_t) {
              break L1;
            } else {
              var2 = ll.field_t;
              var1 = var2;
              go.a((byte) -105, sk.a(new String[]{var2}, lc.field_f, 122));
              ll.field_t = null;
              break L1;
            }
          }
          return;
        }
    }

    oc() {
    }

    static {
        field_z = new go();
        field_w = "Waiting for sound effects";
    }
}
