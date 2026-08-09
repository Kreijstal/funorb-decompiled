/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class en extends km {
    private km field_Ib;
    static int[] field_Hb;
    private km field_Gb;
    static String field_Eb;
    static int field_Jb;
    static boolean field_Fb;
    static int field_Kb;

    public static void g(int param0) {
        field_Hb = null;
        field_Eb = null;
        if (param0 != 0) {
            field_Eb = (String) null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -122 / ((25 - param3) / 37);
        this.a(param2, param4, param0, (byte) -120, param5);
        this.b(param1, 106);
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            pd stackIn_12_0;
            java.net.URL stackIn_12_1;
            java.net.URL stackIn_12_2;
            java.net.URL stackIn_12_3;
            StringBuilder stackIn_12_4;
            pd stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            String stackIn_13_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            un var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3 = ma.a(40, param1);
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
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param0;
                    break L2;
                  }
                }
                kb.a(var3, 0);
                var7 = kn.a(var3, (byte) -33, "%3a", ":");
                var8 = kn.a(var7, (byte) -33, "%40", "@");
                var9 = kn.a(var8, (byte) -33, "%26", "&");
                var10 = kn.a(var9, (byte) -33, "%23", "#");
                if (wf.field_m == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_12_0 = qn.field_R;

                    stackIn_12_1 = null;

                    stackIn_12_2 = null;

                    stackIn_12_3 = wf.field_m.getCodeBase();

                    stackIn_12_4 = new StringBuilder().append("clienterror.ws?c=").append(db.field_v).append("&u=");

                    if (mf.field_f == null) {
                      stackIn_13_0 = (pd) ((Object) stackIn_12_0);
                      stackIn_13_1 = null;
                      stackIn_13_2 = null;
                      stackIn_13_3 = (java.net.URL) ((Object) stackIn_12_3);
                      stackIn_13_4 = (StringBuilder) ((Object) stackIn_12_4);
                      stackIn_13_5 = "" + ae.field_d;
                      break L4;
                    } else {
                      stackIn_13_0 = (pd) ((Object) stackIn_12_0);
                      stackIn_13_1 = null;
                      stackIn_13_2 = null;
                      stackIn_13_3 = (java.net.URL) ((Object) stackIn_12_3);
                      stackIn_13_4 = (StringBuilder) ((Object) stackIn_12_4);
                      stackIn_13_5 = mf.field_f;
                      break L4;
                    }
                  }
                  var4 = ((pd) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, stackIn_13_5 + "&v1=" + pd.field_q + "&v2=" + pd.field_k + "&e=" + var10), true);
                  L5: while (true) {
                    if (0 != var4.field_a) {
                      L6: {
                        if (var4.field_a != param2) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_f);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
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
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
            this.field_Ib = new km(0L, param1);
            this.field_Gb = new km(0L, param2);
            this.field_Gb.field_V = param3;
            this.a(0, this.field_Ib);
            this.a(0, this.field_Gb);
            this.b((byte) 42);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "en.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, jc param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        jc var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param2.field_l;
              var6 = (CharSequence) ((Object) param1);
              var4 = ak.a(1514, var6);
              if (param0) {
                break L1;
              } else {
                var5 = (jc) null;
                en.a(true, (String) null, (jc) null);
                break L1;
              }
            }
            param2.f(var4.length, 30408);
            param2.field_l = param2.field_l + ph.field_k.a(var4.length, param2.field_l, -7089, 0, var4, param2.field_g);
            stackIn_3_0 = -var3_int + param2.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("en.A(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(byte param0, int param1) {
        int var3 = -9 / ((param0 - -62) / 61);
        return param1 + this.field_Ib.c((byte) 48) - -this.field_Gb.c((byte) 113);
    }

    private final void b(int param0, int param1) {
        this.field_Ib.a(0, this.field_ub, this.field_Ib.c((byte) 36), (byte) -47, 0);
        int var3 = param0 + this.field_Ib.field_K;
        this.field_Gb.a(var3, this.field_ub, -var3 + this.field_K, (byte) -107, 0);
        int var4 = -128 % ((54 - param1) / 39);
    }

    en(long param0, en param1, String param2) {
        this(param0, param1.field_Ib, param1.field_Gb, param2);
    }

    en(long param0, mg param1, mg param2, int param3, km param4, String param5) {
        this(param0, (km) null, param4, param5);
        try {
            this.field_Ib.field_D = param3;
            this.field_Ib.field_jb = param1;
            this.field_Ib.field_qb = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "en.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Hb = new int[8192];
        field_Jb = 0;
        field_Fb = false;
        field_Eb = "Previous";
    }
}
