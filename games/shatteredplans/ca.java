/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends oh {
    static String field_i;
    static a field_h;
    static int field_j;

    public static void a(int param0) {
        field_i = null;
        if (param0 != 2105376) {
            String var2 = (String) null;
            ca.a(72, -63, 69, (String) null, -119, 55, -75, -55, 113);
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            mb.field_n.field_z = param3;
            if (em.field_h == 2) {
                cb.field_l.field_z = kh.field_Kb;
            } else {
                cb.field_l.field_z = qi.field_m;
            }
            var9_int = 495;
            var10 = 5;
            sg.field_Ab.a(var9_int + param6, param2, (byte) 88, var10, 5);
            uq.field_j.a(-cg.field_C.field_K + sg.field_Ab.field_K, param2, (byte) 66, 0, 0);
            cg.field_C.a(cg.field_C.field_K, param2, (byte) 112, 0, uq.field_j.field_K);
            var10 = var10 + (param2 - -param4);
            hd.field_m.a(hd.field_m.e(false), param1, (byte) 77, var10, 5);
            var11 = cb.field_l.e(false);
            cb.field_l.a(var11, param1, (byte) 39, var10, -var11 + (-5 + var9_int));
            var12 = 5 + (var10 + param1);
            mb.field_n.a(var9_int, param7, (byte) 70, 0, 0);
            fe.field_w.a(var9_int, var12, (byte) 48, param7, 0);
            fe.field_w.field_F = cs.a(16, 3, fe.field_w.field_mb, 11579568, 8421504, 2105376);
            var12 = var12 + param7;
            fa.field_X.a(var9_int, var12, (byte) 106, -(var12 / 2) + param8, -(var9_int / 2) + param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ca.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    ca(fs param0) {
    }

    final static void a(java.applet.Applet param0, bc param1, bc param2, bc param3, boolean param4, bc param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        bi[][] var9 = null;
        bi[][] var10 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var9 = new bi[la.field_r.length][];
            var10 = var9;
            var7 = 0;
            L1: while (true) {
              if (var7 >= la.field_r.length) {
                wl.field_b = ah.field_Q;
                qr.a(hn.field_j, pg.field_C, ga.field_w, ub.field_Db, jd.field_d, 5, w.field_J, param1, param3, 6, param2, var10, -117, param4, var10);
                gn.field_y = id.a(2, param5, "", "lobbyicon");
                hm.field_o = false;
                pe.field_D = ms.field_c;
                ra.a(115, 200);
                rj.a(-94, param2, param1);
                nh.a(param0, 0, 0, (byte) -3, cg.field_B, 16777215);
                break L0;
              } else {
                L2: {
                  if (la.field_r[var7] == null) {
                    break L2;
                  } else {
                    var9[var7] = ae.a(69, "", param5, la.field_r[var7]);
                    break L2;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ca.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_23_2 + ')');
        }
    }

    static {
        field_i = "Updates will sent to the email address you've given";
    }
}
