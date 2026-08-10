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
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        k var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
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
                  stackIn_21_0 = (byte[]) (var5);
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
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (-2 == (var3 ^ -1)) {
                          wo.a(var12, var5_int, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = hg.field_wb;
                          synchronized (var7) {
                            L6: {
                              hg.field_wb.a(var12, var9, param1 + 27);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackIn_19_0 = (byte[]) (var6);
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
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("hb.D(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
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
