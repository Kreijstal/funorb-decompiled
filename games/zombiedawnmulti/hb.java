/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static String[] field_b;
    static String field_a;

    final static void b(int param0) {
        lk.g((byte) 89);
        kf.a(2, wp.field_j[0].field_z, nj.field_h, qa.field_o, jo.field_f, jk.field_f);
    }

    final static byte[] a(byte[] param0, int param1) {
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
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new k(param0);
              var3 = var9.g(31365);
              var4 = var9.i(-1478490344);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (qo.field_u == 0) {
                    break L2;
                  } else {
                    if (~qo.field_u <= ~var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(0, -6351, var4, var17);
                  stackOut_20_0 = (byte[]) var5;
                  stackIn_21_0 = stackOut_20_0;
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
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 == 1) {
                          int discarded$1 = wo.a(var16, var5_int, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = (Object) (Object) hg.field_wb;
                          synchronized (var7) {
                            L6: {
                              hg.field_wb.a(var16, var9, 27);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) var6;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
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
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("hb.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 0 + ')');
        }
        return stackIn_21_0;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        hd.field_s = new fe();
        wj.field_i.a((cf) (Object) hd.field_s, (byte) 121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "";
    }
}
