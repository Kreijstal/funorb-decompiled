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
        L0: {
          this.a(0, true);
          if (param0 == -20728) {
            break L0;
          } else {
            field_Qb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (-1 == (tm.field_t ^ -1)) {
                break L3;
              } else {
                if (this.field_F == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (this.field_Ob.field_F == 0) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void d(byte param0) {
        try {
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                if (param0 == -63) {
                  L1: {
                    L2: {
                      if (var1 == null) {
                        break L2;
                      } else {
                        try {
                          L3: {
                            var2 = Runtime.getRuntime();
                            var4 = (Object[]) null;
                            var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                            ja.field_a = (int)(var3.longValue() / 1048576L) - -1;
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var2_ref = decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L4;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    break L1;
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector1 = 1;
                break L5;
              }
            }
            if (decompiledRegionSelector1 == 0) {
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
        hb var7 = null;
        RuntimeException var7_ref = null;
        hb var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new hb(param2);
            if (param6 == -8769) {
              var8 = new hb(param3);
              stackIn_4_0 = od.a((byte) 98, param4, var7, param0, param5, param1, var8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -114;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("nd.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nd(hl param0, hl param1, hl param2, hl param3, hl param4, hl param5) {
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
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        hl var8 = null;
        hl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hl var13 = null;
        hl var14 = null;
        int var15 = 0;
        hl var17 = null;
        try {
          L0: {
            var17 = new hl(0L, param1, vb.field_m.toUpperCase());
            var17.field_xb = 1;
            this.field_Ob = new hl(0L, param2);
            var8 = new hl(0L, param3);
            var9 = new hl(0L, param3, ca.field_h);
            var9.field_xb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (var12 >= ph.field_C.length) {
                var17.a((byte) -116, 20 + var11 + 90, 0, 24, 0);
                var10 += 15;
                this.a((byte) -101, var17.field_Hb, 100, var17.field_R + var10, 100);
                this.field_Ob.a((byte) -121, 15, 5, 15, -20 + var17.field_Hb);
                var8.a((byte) -128, this.field_Hb, var17.field_R, -var17.field_R + this.field_R, 0);
                var9.a((byte) -94, this.field_Hb, 20, 15, 0);
                var8.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, var8.field_R);
                var17.a((byte) -102, this.field_Ob);
                var8.a((byte) 58, var9);
                this.a((byte) -86, var17);
                this.a((byte) 78, var8);
                var10 = 240 + -(this.field_R >> -1867990367);
                this.field_M = 320 + -(this.field_Hb >> -425235295);
                break L0;
              } else {
                L2: {
                  var13 = new hl(0L, param3, hh.field_d[var12]);
                  var14 = new hl(0L, param3, ph.field_C[var12]);
                  var15 = param3.field_Ib.b(ph.field_C[var12]);
                  if (var15 <= var11) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a((byte) -112, 65, var10, 15, 20);
                var14.a((byte) -92, 640, var10, 15, 90);
                var8.a((byte) 69, var13);
                var8.a((byte) -107, var14);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("nd.<init>(");

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


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
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
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_Qb = "Show all lobby chat";
        field_Kb = "Waiting for fonts";
        field_Sb = new je();
    }
}
