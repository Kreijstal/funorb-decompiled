/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static rc field_a;
    static kl field_b;

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = wizardrun.field_H;
        try {
          var5 = id.field_b;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "vj.A(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ob var5 = null;
        ob var6 = null;
        int var2Lifetime1;
        var4 = wizardrun.field_H;
        try {
          var5 = new ob();
          var6 = var5;
          var5.field_b = 0;
          while (var6.field_b < 20) {
            var6.field_a = 0;
            while (var6.field_a < 15) {
              if (tc.field_l.field_a[var6.a((byte) -68)] > 0) {
                var2 = 0;
                var3 = qh.field_l;
                if (var3 != 0) {
                  if (var3 != 1) {
                    if (var3 != 2) {
                      if (var3 != 3) {
                        if (var3 != 4) {
                          if (var3 == 5) {
                            if (tc.field_l.field_a[var6.a((byte) -68)] == 1) {
                              var2 = 36;
                            }
                            if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                              var2 = 37;
                            }
                            if (tc.field_l.field_a[var6.a((byte) -68)] == 3) {
                              var2 = 38;
                            }
                            if (tc.field_l.field_a[var6.a((byte) -68)] == 4) {
                              var2 = 39;
                            }
                            if (5 == tc.field_l.field_a[var6.a((byte) -68)]) {
                              var2 = 40;
                            }
                          }
                        } else {
                          if (tc.field_l.field_a[var6.a((byte) -68)] == 1) {
                            var2 = 29;
                          }
                          if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                            var2 = 30;
                          }
                          if (tc.field_l.field_a[var6.a((byte) -68)] == 3) {
                            var2 = 31;
                          }
                          if (tc.field_l.field_a[var6.a((byte) -68)] == 4) {
                            var2 = 32;
                          }
                          if (tc.field_l.field_a[var6.a((byte) -68)] == 5) {
                            var2 = 33;
                          }
                        }
                      } else {
                        if (1 == tc.field_l.field_a[var6.a((byte) -68)]) {
                          var2 = 22;
                        }
                        if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                          var2 = 23;
                        }
                        if (3 == tc.field_l.field_a[var6.a((byte) -68)]) {
                          var2 = 24;
                        }
                        if (tc.field_l.field_a[var6.a((byte) -68)] == 4) {
                          var2 = 25;
                        }
                        if (5 == tc.field_l.field_a[var6.a((byte) -68)]) {
                          var2 = 26;
                        }
                      }
                    } else {
                      if (tc.field_l.field_a[var6.a((byte) -68)] == 1) {
                        var2 = 13;
                      }
                      if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                        var2 = 14;
                      }
                      if (tc.field_l.field_a[var6.a((byte) -68)] == 3) {
                        var2 = 15;
                      }
                      if (tc.field_l.field_a[var6.a((byte) -68)] == 4) {
                        var2 = 16;
                      }
                      if (tc.field_l.field_a[var6.a((byte) -68)] == 5) {
                        var2 = 17;
                      }
                    }
                  } else {
                    if (tc.field_l.field_a[var6.a((byte) -68)] == 1) {
                      var2 = 7;
                    }
                    if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                      var2 = 8;
                    }
                    if (3 == tc.field_l.field_a[var6.a((byte) -68)]) {
                      var2 = 9;
                    }
                    if (tc.field_l.field_a[var6.a((byte) -68)] == 4) {
                      var2 = 10;
                    }
                    if (tc.field_l.field_a[var6.a((byte) -68)] != 5) {
                      tc.field_l.field_a[var6.a((byte) -68)] = 0;
                      ii.field_e[od.field_k].a(9147, var2, var6);
                      od.field_k = od.field_k + 1;
                      var6.field_a = var6.field_a + 1;
                      continue;
                    }
                    var2 = 12;
                  }
                } else {
                  if (tc.field_l.field_a[var6.a((byte) -68)] == 1) {
                    var2 = 3;
                  }
                  if (tc.field_l.field_a[var6.a((byte) -68)] == 2) {
                    var2 = 4;
                  }
                  if (3 == tc.field_l.field_a[var6.a((byte) -68)]) {
                    var2 = 5;
                  }
                  if (tc.field_l.field_a[var6.a((byte) -68)] == 5) {
                    var2 = 6;
                  }
                }
                tc.field_l.field_a[var6.a((byte) -68)] = 0;
                ii.field_e[od.field_k].a(9147, var2, var6);
                od.field_k = od.field_k + 1;
              }
              var6.field_a = var6.field_a + 1;
            }
            var6.field_b = var6.field_b + 1;
          }
          var2Lifetime1 = -113 % ((param0 + 79) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "vj.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          vj.a(-52);
        }
    }

    static {
        field_a = new rc();
    }
}
