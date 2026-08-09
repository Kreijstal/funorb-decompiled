/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_e;
    static int[] field_g;
    static String field_a;
    static int field_f;
    static int field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        iw var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                hh.a((byte) 111);
                break L1;
              }
            }
            L2: {
              var9 = new iw(param0);
              var3 = var9.h((byte) -107);
              var4 = var9.k(param1 + 7);
              if ((var4 ^ -1) > -1) {
                break L2;
              } else {
                L3: {
                  if (-1 == (jk.field_h ^ -1)) {
                    break L3;
                  } else {
                    if (var4 > jk.field_h) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.k(4);
                    if (var5 < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (jk.field_h == 0) {
                          break L5;
                        } else {
                          if (var5 <= jk.field_h) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = lj.field_g;
                          synchronized (var7) {
                            L7: {
                              lj.field_g.a(-4019, var9, var13);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          au.a(var13, var5, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_23_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var12, 0, (byte) -6, var4);
                  stackIn_9_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("hh.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    public static void a(byte param0) {
        byte[] var2;
        if (param0 <= 53) {
          var2 = (byte[]) null;
          hh.a((byte[]) null, (byte) -12);
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(byte param0) {
        if (param0 == 97) {
          if (10 <= vj.field_c) {
            if (13 > hl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = -103;
          if (10 <= vj.field_c) {
            if (13 > hl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_e = "Join";
        field_a = "Gameplay";
        field_b = "Please log in as a subscribing member to access this feature.";
        field_c = "Click to turn on the buyout for this auction";
    }
}
