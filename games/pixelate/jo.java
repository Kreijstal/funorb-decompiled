/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class jo implements eb {
    private int field_q;
    static String field_c;
    static long field_h;
    private int field_e;
    static ak[] field_n;
    private int field_o;
    private int field_g;
    private int field_b;
    static String field_k;
    private int field_d;
    static boolean field_r;
    private int field_i;
    static tf field_j;
    private int field_l;
    private jl field_m;
    private int field_a;
    private int field_p;
    private int field_f;

    final static void a(int param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ei var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            cb stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            cb stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            cb stackIn_16_0 = null;
            int stackIn_16_1 = 0;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            java.net.URL stackIn_16_4 = null;
            StringBuilder stackIn_16_5 = null;
            String stackIn_16_6 = null;
            Throwable decompiledCaughtException = null;
            cb stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            cb stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            java.net.URL stackOut_15_4 = null;
            StringBuilder stackOut_15_5 = null;
            String stackOut_15_6 = null;
            cb stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            var6 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    var3_ref = oa.a(param2, (byte) 120);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  al.a(var3_ref, 0);
                  var7 = qk.a(var3_ref, ":", "%3a", -123);
                  var8 = qk.a(var7, "@", "%40", -128);
                  if (param0 == 1) {
                    break L4;
                  } else {
                    jo.a(-53);
                    break L4;
                  }
                }
                var9 = qk.a(var8, "&", "%26", -126);
                var10 = qk.a(var9, "#", "%23", -127);
                if (null != qm.field_L) {
                  L5: {
                    stackOut_13_0 = fp.field_c;
                    stackOut_13_1 = -44;
                    stackOut_13_2 = null;
                    stackOut_13_3 = null;
                    stackOut_13_4 = qm.field_L.getCodeBase();
                    stackOut_13_5 = new StringBuilder().append("clienterror.ws?c=").append(jh.field_M).append("&u=");
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_15_5 = stackOut_13_5;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    stackIn_14_5 = stackOut_13_5;
                    if (null == ui.field_c) {
                      stackOut_15_0 = (cb) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = null;
                      stackOut_15_3 = null;
                      stackOut_15_4 = (java.net.URL) (Object) stackIn_15_4;
                      stackOut_15_5 = (StringBuilder) (Object) stackIn_15_5;
                      stackOut_15_6 = "" + ff.field_d;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      stackIn_16_4 = stackOut_15_4;
                      stackIn_16_5 = stackOut_15_5;
                      stackIn_16_6 = stackOut_15_6;
                      break L5;
                    } else {
                      stackOut_14_0 = (cb) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                      stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                      stackOut_14_6 = ui.field_c;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      stackIn_16_4 = stackOut_14_4;
                      stackIn_16_5 = stackOut_14_5;
                      stackIn_16_6 = stackOut_14_6;
                      break L5;
                    }
                  }
                  var4 = ((cb) (Object) stackIn_16_0).a((byte) stackIn_16_1, new java.net.URL(stackIn_16_4, stackIn_16_6 + "&v1=" + cb.field_o + "&v2=" + cb.field_l + "&e=" + var10));
                  L6: while (true) {
                    if (0 != var4.field_b) {
                      if (var4.field_b == 1) {
                        var5 = (DataInputStream) var4.field_e;
                        int discarded$1 = var5.read();
                        var5.close();
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      vg.a(1L, (byte) 23);
                      continue L6;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        h var11 = null;
        ng stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ng stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof h)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ng) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ng) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (h) (Object) stackIn_3_0;
              if (param1 == -124) {
                break L2;
              } else {
                ((jo) this).field_g = -59;
                break L2;
              }
            }
            L3: {
              if (var11 == null) {
                break L3;
              } else {
                param4 = param4 & var11.field_H;
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              if (!param4) {
                break L4;
              } else {
                var7 = 16777215;
                break L4;
              }
            }
            L5: {
              t.d(param3 + param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, ((jo) this).field_a);
              var8 = ((jo) this).field_f + (param3 + param0.field_z);
              var9 = param2 + param0.field_p - -((jo) this).field_l;
              t.c(var8, var9, ((jo) this).field_q, ((jo) this).field_p, 5592405);
              t.d(var8, var9, ((jo) this).field_q, ((jo) this).field_p, var7);
              if (var11.field_M) {
                t.b(var8, var9, var8 - -((jo) this).field_q, var9 - -((jo) this).field_p, 1);
                t.b(var8 + ((jo) this).field_q, var9, var8, var9 + ((jo) this).field_p, 1);
                break L5;
              } else {
                break L5;
              }
            }
            if (((jo) this).field_m != null) {
              var10 = ((jo) this).field_q - (-((jo) this).field_f + -((jo) this).field_b);
              int discarded$1 = ((jo) this).field_m.a(param0.field_q, param0.field_z + param3 + var10, ((jo) this).field_d + (param0.field_p + param2), param0.field_E - (var10 - -((jo) this).field_b), param0.field_C - (((jo) this).field_b << 1), ((jo) this).field_g, ((jo) this).field_i, ((jo) this).field_e, ((jo) this).field_o, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("jo.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_n = null;
        field_j = null;
        field_k = null;
    }

    final static void a(int param0) {
        fl.a((byte) -125);
        te.a(4, -2671);
        if (param0 != -22218) {
            jo.a(-34);
        }
    }

    jo(jl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((jo) this).field_e = 1;
        ((jo) this).field_o = 1;
        try {
            ((jo) this).field_a = param9;
            ((jo) this).field_d = param2;
            ((jo) this).field_g = param3;
            ((jo) this).field_f = param5;
            ((jo) this).field_l = param6;
            ((jo) this).field_i = param4;
            ((jo) this).field_q = param8;
            ((jo) this).field_m = param0;
            ((jo) this).field_p = param7;
            ((jo) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jo.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter multiplayer lobby";
        field_r = false;
        field_h = 0L;
    }
}
