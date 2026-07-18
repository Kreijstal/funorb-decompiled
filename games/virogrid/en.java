/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class en extends km {
    private km field_Ib;
    static int[] field_Hb;
    private km field_Gb;
    static String field_Eb;
    static int field_Jb;
    static boolean field_Fb;
    static int field_Kb;

    public static void g() {
        field_Hb = null;
        field_Eb = null;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -122 / ((25 - param3) / 37);
        ((en) this).a(param2, param4, param0, (byte) -120, param5);
        this.b(param1, 106);
    }

    final static void a(String param0, Throwable param1) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            un var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            pd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            pd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            pd stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            String stackIn_13_5 = null;
            Throwable decompiledCaughtException = null;
            pd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            pd stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            pd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3_ref = ma.a(40, param1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                int discarded$2 = 0;
                kb.a(var3_ref);
                var7 = kn.a(var3_ref, (byte) -33, "%3a", ":");
                var8 = kn.a(var7, (byte) -33, "%40", "@");
                var9 = kn.a(var8, (byte) -33, "%26", "&");
                var10 = kn.a(var9, (byte) -33, "%23", "#");
                if (wf.field_m == null) {
                  return;
                } else {
                  L4: {
                    stackOut_10_0 = qn.field_R;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = wf.field_m.getCodeBase();
                    stackOut_10_4 = new StringBuilder().append("clienterror.ws?c=").append(db.field_v).append("&u=");
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    if (mf.field_f == null) {
                      stackOut_12_0 = (pd) (Object) stackIn_12_0;
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                      stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                      stackOut_12_5 = "" + ae.field_d;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      break L4;
                    } else {
                      stackOut_11_0 = (pd) (Object) stackIn_11_0;
                      stackOut_11_1 = null;
                      stackOut_11_2 = null;
                      stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                      stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                      stackOut_11_5 = mf.field_f;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      break L4;
                    }
                  }
                  var4 = ((pd) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, stackIn_13_5 + "&v1=" + pd.field_q + "&v2=" + pd.field_k + "&e=" + var10), true);
                  L5: while (true) {
                    if (0 != var4.field_a) {
                      L6: {
                        if (var4.field_a != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_f;
                          int discarded$3 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      mm.a(-14, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private en(long param0, km param1, km param2, String param3) {
        super(param0, (km) null);
        try {
            ((en) this).field_Ib = new km(0L, param1);
            ((en) this).field_Gb = new km(0L, param2);
            ((en) this).field_Gb.field_V = param3;
            ((en) this).a(0, ((en) this).field_Ib);
            ((en) this).a(0, ((en) this).field_Gb);
            ((en) this).b((byte) 42);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "en.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, jc param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = param2.field_l;
            var5 = (CharSequence) (Object) param1;
            var4 = ak.a(1514, var5);
            param2.f(var4.length, 30408);
            param2.field_l = param2.field_l + ph.field_k.a(var4.length, param2.field_l, -7089, 0, var4, param2.field_g);
            stackOut_0_0 = -var3_int + param2.field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("en.A(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final int a(byte param0, int param1) {
        int var3 = -9 / ((param0 - -62) / 61);
        return param1 + ((en) this).field_Ib.c((byte) 48) - -((en) this).field_Gb.c((byte) 113);
    }

    private final void b(int param0, int param1) {
        ((en) this).field_Ib.a(0, ((en) this).field_ub, ((en) this).field_Ib.c((byte) 36), (byte) -47, 0);
        int var3 = param0 + ((en) this).field_Ib.field_K;
        ((en) this).field_Gb.a(var3, ((en) this).field_ub, -var3 + ((en) this).field_K, (byte) -107, 0);
        int var4 = 0;
    }

    en(long param0, en param1, String param2) {
        this(param0, param1.field_Ib, param1.field_Gb, param2);
    }

    en(long param0, mg param1, mg param2, int param3, km param4, String param5) {
        this(param0, (km) null, param4, param5);
        try {
            ((en) this).field_Ib.field_D = param3;
            ((en) this).field_Ib.field_jb = param1;
            ((en) this).field_Ib.field_qb = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "en.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = new int[8192];
        field_Jb = 0;
        field_Fb = false;
        field_Eb = "Previous";
    }
}
