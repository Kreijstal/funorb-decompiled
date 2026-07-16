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
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        iw var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param1 == -3) {
            break L0;
          } else {
            hh.a((byte) 111);
            break L0;
          }
        }
        L1: {
          var9 = new iw(param0);
          var3 = var9.h((byte) -107);
          var4 = var9.k(param1 + 7);
          if ((var4 ^ -1) > -1) {
            break L1;
          } else {
            L2: {
              if (-1 == (jk.field_h ^ -1)) {
                break L2;
              } else {
                if (var4 > jk.field_h) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (var3 != 0) {
              L3: {
                var5 = var9.k(4);
                if (var5 < 0) {
                  break L3;
                } else {
                  L4: {
                    if (jk.field_h == 0) {
                      break L4;
                    } else {
                      if ((var5 ^ -1) >= (jk.field_h ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var17 = new byte[var5];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var6 = var11;
                  if (1 != var3) {
                    var7 = (Object) (Object) lj.field_g;
                    synchronized (var7) {
                      L5: {
                        lj.field_g.a(-4019, var9, var17);
                        break L5;
                      }
                    }
                    return var6;
                  } else {
                    int discarded$3 = au.a(var17, var5, param0, var4, 9);
                    return var6;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              var16 = new byte[var4];
              var14 = var16;
              var12 = var14;
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(var16, 0, (byte) -6, var4);
              return var5_ref_byte__;
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 53) {
          var2 = null;
          byte[] discarded$2 = hh.a((byte[]) null, (byte) -12);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Join";
        field_a = "Gameplay";
        field_b = "Please log in as a subscribing member to access this feature.";
        field_c = "Click to turn on the buyout for this auction";
    }
}
