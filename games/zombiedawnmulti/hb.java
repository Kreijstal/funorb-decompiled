/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static String[] field_b;
    static String field_a;

    final static void b(int param0) {
        lk.g((byte) 89);
        kf.a(2, wp.field_j[0].field_z, nj.field_h, qa.field_o, jo.field_f, jk.field_f);
        if (param0 <= 31) {
            field_a = (String) null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        k var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_20_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_21_0 = null;
        byte[] stackOut_19_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var9 = new k(param0);
              var3 = var9.g(31365);
              var4 = var9.i(param1 ^ -1478490344);
              if (-1 < (var4 ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-1 == (qo.field_u ^ -1)) {
                    break L2;
                  } else {
                    if (qo.field_u >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 == param1) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(0, param1 ^ -6351, var4, var13);
                  stackOut_21_0 = (byte[]) (var5);
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.i(-1478490344);
                    if (0 > var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (0 == qo.field_u) {
                          break L4;
                        } else {
                          if (qo.field_u >= var5_int) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var12 = new byte[var5_int];
                          var10 = var12;
                          var6 = var10;
                          if (-2 == (var3 ^ -1)) {
                            break L6;
                          } else {
                            var7 = hg.field_wb;
                            synchronized (var7) {
                              L7: {
                                hg.field_wb.a(var12, var9, param1 + 27);
                                break L7;
                              }
                            }
                            if (!ZombieDawnMulti.field_E) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        discarded$1 = wo.a(var12, var5_int, param0, var4, 9);
                        break L5;
                      }
                      stackOut_19_0 = (byte[]) (var6);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("hb.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            hb.b(87);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        hd.field_s = new fe();
        wj.field_i.a((cf) (hd.field_s), (byte) 121);
        if (param0 != 0) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "";
    }
}
