/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_b;
    static String field_c;
    static String field_a;
    static byte[][][] field_d;

    final static void a(int param0, qp param1, int param2) {
        df var5 = wa.field_d;
        var5.f(param2 ^ 117, param0);
        var5.field_n = var5.field_n + 1;
        int var4 = var5.field_n;
        var5.b(90, param2);
        var5.b(90, param1.field_p);
        var5.b(90, param1.field_m);
        var5.b((byte) 60, param1.field_l);
        var5.b((byte) 60, param1.field_k);
        var5.b((byte) 60, param1.field_q);
        var5.b((byte) 60, param1.field_n);
        int discarded$0 = var5.a(var4, true);
        var5.c((byte) 48, var5.field_n + -var4);
    }

    final static tl a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        if (param3 != 83) {
          return null;
        } else {
          L0: {
            if (-1 != (param2 ^ -1)) {
              break L0;
            } else {
              var6 = param1;
              if (1 != var6) {
                break L0;
              } else {
                param2 = 1000;
                break L0;
              }
            }
          }
          return new tl(param0, param5, param4, param1, param2);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 124 % ((17 - param0) / 51);
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        fj var9 = null;
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
          var9 = new fj(param1);
          var3 = var9.i((byte) -101);
          var4 = var9.c((byte) -102);
          if (param0 > var4) {
            break L0;
          } else {
            L1: {
              if (0 == ee.field_v) {
                break L1;
              } else {
                if (var4 <= ee.field_v) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (0 == var3) {
              var17 = new byte[var4];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var5 = var11;
              var9.a(48, var4, var17, 0);
              return var5;
            } else {
              L2: {
                var5_int = var9.c((byte) -108);
                if (-1 < (var5_int ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (ee.field_v == 0) {
                      break L3;
                    } else {
                      if (var5_int > ee.field_v) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var16 = new byte[var5_int];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var6 = var10;
                  if (-2 == (var3 ^ -1)) {
                    int discarded$1 = fc.a(var16, var5_int, param1, var4, 9);
                    return var6;
                  } else {
                    var7 = (Object) (Object) wo.field_d;
                    synchronized (var7) {
                      L4: {
                        wo.field_d.a((byte) -67, var9, var16);
                        break L4;
                      }
                    }
                    return var6;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(ni param0, int param1, int param2) {
        df var3 = null;
        int var4 = 0;
        df var5 = null;
        var5 = wa.field_d;
        var3 = var5;
        var5.f(127, param1);
        var5.field_n = var5.field_n + 1;
        var4 = var5.field_n;
        var5.b(90, param2);
        if (param0.field_j != null) {
          var5.b(90, param0.field_j.length);
          var5.a(param0.field_j.length, 0, param0.field_j, (byte) -58);
          int discarded$4 = var5.a(var4, true);
          var5.field_n = var5.field_n - 4;
          param0.field_k = var5.c((byte) -88);
          var5.c((byte) 48, -var4 + var5.field_n);
          return;
        } else {
          var5.b(90, 0);
          int discarded$5 = var5.a(var4, true);
          var5.field_n = var5.field_n - 4;
          param0.field_k = var5.c((byte) -88);
          var5.c((byte) 48, -var4 + var5.field_n);
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 == 23273) {
          if (param3 >= param5) {
            if (param4 + param5 > param3) {
              if (param6 <= param1) {
                if (param1 >= param0 + param6) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading fonts";
        field_a = "GRAPHICS: ";
        field_b = "Updates will sent to the email address you've given";
    }
}
