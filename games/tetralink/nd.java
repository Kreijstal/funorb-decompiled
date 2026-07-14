/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends hl {
    static String field_Qb;
    private hl field_Ob;
    static je field_Sb;
    static String[] field_Rb;
    static String field_Kb;
    static int field_Nb;
    static int field_Mb;
    static bc field_Lb;
    static ie field_Pb;

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          ((nd) this).a(0, true);
          if (param0 == -20728) {
            break L0;
          } else {
            field_Qb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (-1 == (tm.field_t ^ -1)) {
                break L3;
              } else {
                if (((nd) this).field_F == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((nd) this).field_Ob.field_F == 0) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void d(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (param0 == -63) {
                L0: {
                  if (var1 == null) {
                    break L0;
                  } else {
                    try {
                      var2_ref = Runtime.getRuntime();
                      var4 = null;
                      var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                      ja.field_a = (int)(var3.longValue() / 1048576L) - -1;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    break L0;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_Pb = null;
        field_Rb = null;
        field_Qb = null;
        if (param0 != 2105376) {
            nd.d((byte) 78);
        }
        field_Kb = null;
        field_Lb = null;
        field_Sb = null;
    }

    final static int a(int param0, boolean param1, String param2, String param3, String param4, int param5, int param6) {
        hb var7 = new hb(param2);
        if (param6 != -8769) {
            return -114;
        }
        hb var8 = new hb(param3);
        return od.a((byte) 98, param4, var7, param0, param5, param1, var8);
    }

    nd(hl param0, hl param1, hl param2, hl param3, hl param4, hl param5) {
        int var12 = 0;
        hl var13 = null;
        hl var14 = null;
        int var15 = 0;
        hl var17 = new hl(0L, param1, vb.field_m.toUpperCase());
        var17.field_xb = 1;
        ((nd) this).field_Ob = new hl(0L, param2);
        hl var8 = new hl(0L, param3);
        hl var9 = new hl(0L, param3, ca.field_h);
        var9.field_xb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < ph.field_C.length; var12++) {
            var13 = new hl(0L, param3, hh.field_d[var12]);
            var14 = new hl(0L, param3, ph.field_C[var12]);
            var15 = param3.field_Ib.b(ph.field_C[var12]);
            if (var15 > var11) {
                var11 = var15;
            }
            var13.a((byte) -112, 65, var10, 15, 20);
            var14.a((byte) -92, 640, var10, 15, 90);
            var8.a((byte) 69, var13);
            var8.a((byte) -107, var14);
            var10 += 30;
        }
        var17.a((byte) -116, 20 + var11 + 90, 0, 24, 0);
        var10 += 15;
        ((nd) this).a((byte) -101, var17.field_Hb, 100, var17.field_R + var10, 100);
        ((nd) this).field_Ob.a((byte) -121, 15, 5, 15, -20 + var17.field_Hb);
        var8.a((byte) -128, ((nd) this).field_Hb, var17.field_R, -var17.field_R + ((nd) this).field_R, 0);
        var9.a((byte) -94, ((nd) this).field_Hb, 20, 15, 0);
        var8.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, var8.field_R);
        var17.a((byte) -102, ((nd) this).field_Ob);
        var8.a((byte) 58, var9);
        ((nd) this).a((byte) -86, var17);
        ((nd) this).a((byte) 78, var8);
        var10 = 240 + -(((nd) this).field_R >> -1867990367);
        ((nd) this).field_M = 320 + -(((nd) this).field_Hb >> -425235295);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "Show all lobby chat";
        field_Kb = "Waiting for fonts";
        field_Sb = new je();
    }
}
