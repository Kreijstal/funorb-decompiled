/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String field_c;
    int field_a;
    int field_b;
    int field_e;
    int field_d;

    final static void a(int param0, gh param1, int param2) {
        int var4 = 0;
        hj var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        gh var5 = null;
        try {
          L0: {
            L1: {
              var6 = ff.field_D;
              var6.a(false, param0);
              var6.field_h = var6.field_h + 1;
              var4 = var6.field_h;
              var6.f(6389, 1);
              if (null == param1.field_k) {
                var6.f(6389, 0);
                break L1;
              } else {
                var6.f(6389, param1.field_k.length);
                var6.a((byte) -65, param1.field_k, param1.field_k.length, 0);
                if (!Transmogrify.field_A) {
                  break L1;
                } else {
                  var6.f(6389, 0);
                  break L1;
                }
              }
            }
            L2: {
              var6.d(var4, param2 ^ -1323322296);
              if (param2 == 0) {
                break L2;
              } else {
                var5 = (gh) null;
                nb.a(-41, (gh) null, 68);
                break L2;
              }
            }
            var6.field_h = var6.field_h - 4;
            param1.field_j = var6.c((byte) -121);
            var6.a((byte) -42, -var4 + var6.field_h);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("nb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -24 % ((param0 - -46) / 43);
        field_c = null;
    }

    final static e a(boolean param0, hj param1) {
        e stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.k(8, 1522829539);
            if (var2_int <= 0) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_c = (String) null;
                  break L1;
                }
              }
              L2: {
                var3 = w.a(-1, param1) ? 1 : 0;
                var4 = w.a(-1, param1) ? 1 : 0;
                var5 = new e();
                var5.field_M = (short)param1.k(16, 1522829539);
                var5.field_v = lb.a(var5.field_v, 256, 16, param1);
                var5.field_d = lb.a(var5.field_d, 256, 16, param1);
                var5.field_B = lb.a(var5.field_B, 256, 16, param1);
                var5.field_C = (short)param1.k(16, 1522829539);
                var5.field_o = lb.a(var5.field_o, 256, 16, param1);
                var5.field_s = lb.a(var5.field_s, 256, 16, param1);
                var5.field_G = lb.a(var5.field_G, 256, 16, param1);
                if (var3 != 0) {
                  var5.field_l = (short)param1.k(16, 1522829539);
                  var5.field_e = lb.a(var5.field_e, 256, 16, param1);
                  var5.field_F = lb.a(var5.field_F, 256, 16, param1);
                  var5.field_L = lb.a(var5.field_L, 256, 16, param1);
                  var5.field_b = lb.a(var5.field_b, 256, 16, param1);
                  var5.field_n = lb.a(var5.field_n, 256, 16, param1);
                  var5.field_J = lb.a(var5.field_J, 256, 16, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  param1.k(16, 1522829539);
                  var5.field_N = lb.a(var5.field_N, 256, 16, param1);
                  var5.field_H = lb.a(var5.field_H, 256, 16, param1);
                  var5.field_h = lb.a(var5.field_h, 256, 16, param1);
                  var5.field_A = lb.a(var5.field_A, 256, 16, param1);
                  var5.field_r = lb.a(var5.field_r, 256, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!w.a(-1, param1)) {
                  break L4;
                } else {
                  var5.field_f = lb.a(var5.field_f, 256, 16, param1);
                  break L4;
                }
              }
              L5: {
                if (!w.a(-1, param1)) {
                  break L5;
                } else {
                  var5.field_y = dj.a(-39, param1, var5.field_y, 16);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var7 >= var5.field_y.length) {
                            break L9;
                          } else {
                            var10 = var5.field_y[var7] & 255 ^ -1;
                            var9 = var6 ^ -1;
                            if (var8 != 0) {
                              if (var9 != var10) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              L10: {
                                if (var9 <= var10) {
                                  break L10;
                                } else {
                                  var6 = var5.field_y[var7] & 255;
                                  break L10;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (0 != var6) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      var5.field_y = null;
                      if (var8 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                    var5.field_w = (byte)(var6 + 1);
                    break L5;
                  }
                }
              }
              stackIn_27_0 = (e) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("nb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    static {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
