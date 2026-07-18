/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class gd {
    static dn field_c;
    static String field_e;
    static String field_b;
    static int field_a;
    static String field_d;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_d = null;
              field_e = null;
              if (!param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "gd.C(" + param0 + ')');
        }
    }

    final static java.awt.Canvas a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_3_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        try {
          L0: {
            L1: {
              var1_int = -97 / ((param0 - 81) / 36);
              if (null != ua.field_d) {
                stackOut_3_0 = ua.field_d;
                stackIn_4_0 = (Object) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = kj.field_D;
                stackIn_4_0 = (Object) (Object) stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "gd.B(" + param0 + ')');
        }
        return (java.awt.Canvas) (Object) stackIn_4_0;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        byte[] stackIn_35_0 = null;
        byte[] stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_34_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_23_0 = null;
        try {
          L0: {
            L1: {
              if (100 != param0) {
                break L1;
              } else {
                if (ig.field_N > 0) {
                  int fieldTemp$3 = ig.field_N - 1;
                  ig.field_N = ig.field_N - 1;
                  var2_array = cf.field_b[fieldTemp$3];
                  cf.field_b[ig.field_N] = null;
                  stackOut_6_0 = (byte[]) var2_array;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 != 5000) {
                break L2;
              } else {
                if (dq.field_b <= 0) {
                  break L2;
                } else {
                  int fieldTemp$4 = dq.field_b - 1;
                  dq.field_b = dq.field_b - 1;
                  var2_array = da.field_L[fieldTemp$4];
                  da.field_L[dq.field_b] = null;
                  stackOut_12_0 = (byte[]) var2_array;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
            L3: {
              if (param0 != 30000) {
                break L3;
              } else {
                if (ac.field_e > 0) {
                  int fieldTemp$5 = ac.field_e - 1;
                  ac.field_e = ac.field_e - 1;
                  var2_array = si.field_b[fieldTemp$5];
                  si.field_b[ac.field_e] = null;
                  stackOut_20_0 = (byte[]) var2_array;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0;
                } else {
                  break L3;
                }
              }
            }
            if (param1 >= 99) {
              L4: {
                if (bm.field_a == null) {
                  break L4;
                } else {
                  var2_int = 0;
                  L5: while (true) {
                    if (gn.field_x.length <= var2_int) {
                      break L4;
                    } else {
                      L6: {
                        if (~gn.field_x[var2_int] != ~param0) {
                          break L6;
                        } else {
                          if (lk.field_u[var2_int] <= 0) {
                            break L6;
                          } else {
                            lk.field_u[var2_int] = lk.field_u[var2_int] - 1;
                            var3 = bm.field_a[var2_int][lk.field_u[var2_int] - 1];
                            bm.field_a[var2_int][lk.field_u[var2_int]] = null;
                            stackOut_34_0 = (byte[]) var3;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0;
                          }
                        }
                      }
                      var2_int++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_37_0 = new byte[param0];
              stackIn_38_0 = stackOut_37_0;
              break L0;
            } else {
              stackOut_23_0 = null;
              stackIn_24_0 = stackOut_23_0;
              return (byte[]) (Object) stackIn_24_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "gd.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_38_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
