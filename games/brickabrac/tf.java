/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String[] field_f;
    static boolean field_h;
    static jp[] field_g;
    static byte[] field_b;
    static jp[] field_c;
    static int[] field_a;
    static mk field_d;
    static String[] field_e;
    static boolean field_i;

    final static void a(String param0, byte param1, int param2) {
        int var3_int = 0;
        try {
            t.field_g = false;
            sa.field_E = false;
            if (param1 >= -43) {
                field_c = (jp[]) null;
            }
            if (null != ej.field_I) {
                if (!ej.field_I.field_N) {
                    return;
                }
                var3_int = 1;
                if (param2 == 8) {
                    if (cg.field_l) {
                        param0 = nq.field_n;
                    } else {
                        param0 = gi.field_u;
                    }
                    param2 = 2;
                    eo.field_k.a(70, gf.field_d);
                }
                if (!(-11 != (param2 ^ -1))) {
                    bn.c(116);
                    var3_int = 0;
                }
                if (!(var3_int == 0)) {
                    if (sa.field_E) {
                        param0 = rd.a(wi.field_h, new String[]{param0}, (byte) 103);
                    }
                    if (ln.field_l) {
                        param0 = wg.field_b;
                    }
                    ej.field_I.a(param2, false, param0);
                }
                if (param2 != 256) {
                    if (10 == param2) {
                        return;
                    }
                    if (!cg.field_l) {
                        eo.field_k.h(-113);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "tf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        String var2;
        if (param0 != 6) {
          var2 = (String) null;
          tf.a((om) null, false, (byte) -54, (String) null);
          field_a = null;
          field_b = null;
          field_f = null;
          field_g = null;
          field_e = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_f = null;
          field_g = null;
          field_e = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(om param0, boolean param1, byte param2, String param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        nn var9 = null;
        String var10 = null;
        nn var11 = null;
        String var12 = null;
        nn var13 = null;
        String var14 = null;
        nn var15 = null;
        try {
          L0: {
            L1: {
              var4_int = 47 / ((param2 - -13) / 51);
              mn.a(-1, param0, rl.field_e, (int[]) null, (String) null, param0.e((byte) -14), (byte) -58, 0L, (String) null);
              if (!param0.field_Rb) {
                break L1;
              } else {
                L2: {
                  if (param0.field_wc == 2) {
                    break L2;
                  } else {
                    if (-3 < (kb.field_Yb ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var9 = bm.field_d;
                var10 = rd.a(pn.field_s, new String[]{param3}, (byte) 103);
                var9.field_d.a(var10, 10, (byte) 91);
                break L1;
              }
            }
            L3: {
              bm.field_d.a(true);
              if (param1) {
                if (bm.field_d.field_b == re.field_i) {
                  var13 = bm.field_d;
                  var14 = rd.a(co.field_d, new String[]{param3}, (byte) 103);
                  var13.field_d.a(var14, 16, (byte) 90);
                  break L3;
                } else {
                  var11 = bm.field_d;
                  var12 = rd.a(vo.field_G, new String[]{param3}, (byte) 103);
                  var11.field_d.a(var12, 15, (byte) 116);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var15 = bm.field_d;
            var6 = tb.field_fb;
            var7 = qo.field_O;
            var15.field_d.a(var7, -102, 0, 0, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("tf.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, jp param5) {
        try {
            fc.a(-68, param2.field_p);
            lb.g(0, 0, param2.field_i, param2.field_q, 16777215);
            int var6_int = -110 / ((param4 - 62) / 39);
            param5.c((-param5.field_x + param2.field_i) / 2, param2.field_q + (param0 - (param5.field_z - 5 / param3)));
            la.a(0, 0, param2.field_i, param2.field_q, nm.field_h[param1], 11970969, 152);
            sc.b(-112);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "tf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = false;
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_b = new byte[520];
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
