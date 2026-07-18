/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private static int field_b;
    private static int field_h;
    private static int field_d;
    private static int[] field_f;
    private static int field_e;
    private static int field_g;
    private static int field_a;
    private static int field_c;

    private final static void c() {
        field_d = 0;
    }

    public static void d() {
        field_f = null;
    }

    final static void a(int[] param0, int param1, int param2) {
        ok.a(param0, 0, param0.length, 16777215, param2, (int[]) null, (int[]) null);
    }

    private final static void a(int param0, int param1, int[] param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ok.a();
        while (ok.b()) {
            var4 = field_a;
            var5 = field_e;
            var6 = field_h;
            if (param2 != null) {
                var7 = var6 - hk.field_h;
                if (var4 < param2[var7] + hk.field_c) {
                    var4 = param2[var7] + hk.field_c;
                }
                if (var5 > param2[var7] + param3[var7] + hk.field_c) {
                    var5 = param2[var7] + param3[var7] + hk.field_c;
                }
            }
            hk.c(var4, var6, var5 - var4, 16777215, param1);
        }
    }

    private final static void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (field_d < 0) {
            field_g = 0;
            field_b = 0;
            field_c = 0;
            field_h = 2147483646;
            return;
        }
        ok.a(0, field_d);
        int var0 = field_f[1];
        if (var0 < hk.field_h) {
            var0 = hk.field_h;
        }
        int var1 = 0;
        for (var2 = 0; var2 < field_d; var2 += 4) {
            var3 = field_f[var2 + 1];
            if (var0 < var3) {
                break;
            }
            var4 = field_f[var2];
            var5 = field_f[var2 + 2];
            var6 = field_f[var2 + 3];
            var7 = (var5 - var4 << 16) / (var6 - var3);
            var8 = (var4 << 16) + 32768;
            field_f[var2] = var8 + (var0 - var3) * var7;
            field_f[var2 + 2] = var7;
        }
        field_c = var1;
        field_b = var2;
        field_g = var2;
        field_h = var0 - 1;
    }

    private final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: while (true) {
          L1: {
            if (param1 < param0 + 8) {
              break L1;
            } else {
              var2 = 1;
              var3 = param0 + 4;
              L2: while (true) {
                if (var3 >= param1) {
                  if (var2 == 0) {
                    param1 -= 4;
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  var4 = field_f[var3 - 4];
                  var5 = field_f[var3];
                  if (var4 > var5) {
                    var2 = 0;
                    field_f[var3 - 4] = var5;
                    field_f[var3] = var4;
                    var4 = field_f[var3 - 2];
                    field_f[var3 - 2] = field_f[var3 + 2];
                    field_f[var3 + 2] = var4;
                    var4 = field_f[var3 - 1];
                    field_f[var3 - 1] = field_f[var3 + 3];
                    field_f[var3 + 3] = var4;
                    var3 += 4;
                    continue L2;
                  } else {
                    var3 += 4;
                    continue L2;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final static boolean b() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var0 = field_b;
        var1 = field_g;
        var2 = field_h;
        L0: while (true) {
          if (var1 < var0) {
            field_a = field_f[var1] >> 16;
            field_e = field_f[var1 + 4] >> 16;
            field_f[var1] = field_f[var1] + field_f[var1 + 2];
            field_f[var1 + 4] = field_f[var1 + 4] + field_f[var1 + 6];
            var1 += 8;
            field_g = var1;
            return true;
          } else {
            var2++;
            field_h = var2;
            if (var2 < hk.field_b) {
              var3 = field_c;
              L1: while (true) {
                L2: {
                  if (var0 >= field_d) {
                    break L2;
                  } else {
                    var4 = field_f[var0 + 1];
                    if (var2 >= var4) {
                      var5 = field_f[var0];
                      var6 = field_f[var0 + 2];
                      var7 = field_f[var0 + 3];
                      var8 = (var6 - var5 << 16) / (var7 - var4);
                      var9 = (var5 << 16) + 32768;
                      field_f[var0] = var9;
                      field_f[var0 + 2] = var8;
                      var0 += 4;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = var3;
                var4 = var10;
                L3: while (true) {
                  if (var10 >= var0) {
                    if (var3 != field_d) {
                      ok.b(var3, var0);
                      field_c = var3;
                      field_b = var0;
                      var1 = var3;
                      continue L0;
                    } else {
                      field_d = 0;
                      return false;
                    }
                  } else {
                    var5 = field_f[var10 + 3];
                    if (var2 >= var5) {
                      field_f[var10] = field_f[var3];
                      field_f[var10 + 1] = field_f[var3 + 1];
                      field_f[var10 + 2] = field_f[var3 + 2];
                      field_f[var10 + 3] = field_f[var3 + 3];
                      var3 += 4;
                      var10 += 4;
                      continue L3;
                    } else {
                      var10 += 4;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    private final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 > param0 + 4) {
          var2 = param0;
          var3 = field_f[var2];
          var4 = field_f[var2 + 1];
          var5 = field_f[var2 + 2];
          var6 = field_f[var2 + 3];
          var7 = param0 + 4;
          L0: while (true) {
            if (var7 >= param1) {
              field_f[var2] = var3;
              field_f[var2 + 1] = var4;
              field_f[var2 + 2] = var5;
              field_f[var2 + 3] = var6;
              ok.a(param0, var2);
              ok.a(var2 + 4, param1);
              return;
            } else {
              var8 = field_f[var7 + 1];
              if (var8 < var4) {
                field_f[var2] = field_f[var7];
                field_f[var2 + 1] = var8;
                field_f[var2 + 2] = field_f[var7 + 2];
                field_f[var2 + 3] = field_f[var7 + 3];
                var2 += 4;
                field_f[var7] = field_f[var2];
                field_f[var7 + 1] = field_f[var2 + 1];
                field_f[var7 + 2] = field_f[var2 + 2];
                field_f[var7 + 3] = field_f[var2 + 3];
                var7 += 4;
                continue L0;
              } else {
                var7 += 4;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int[] param0, int param1) {
        ok.a(param0, 0, param0.length, param1);
    }

    private final static void a(int[] param0, int param1, int param2, int param3) {
        ok.c();
        ok.b(param0, 0, param2);
        ok.a(param3);
    }

    private final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ok.a();
        while (ok.b()) {
            var1 = field_a;
            var2 = field_e;
            var3 = field_h;
            hk.a(var1, var3, var2 - var1, param0);
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int[] param5, int[] param6) {
        if (param5 != null) {
            if (hk.field_b - hk.field_h != param5.length) {
                throw new IllegalStateException();
            }
        }
        ok.c();
        ok.b(param0, 0, param2);
        ok.a(16777215, param4, param5, param6);
    }

    private final static void b(int[] param0, int param1, int param2) {
        int var3 = 0;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var3 = field_d + (param2 << 1);
            if (field_f == null) {
              break L1;
            } else {
              if (field_f.length >= var3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4_ref_int__ = new int[var3];
          var5 = 0;
          L2: while (true) {
            if (var5 >= field_d) {
              field_f = var4_ref_int__;
              break L0;
            } else {
              var4_ref_int__[var5] = field_f[var5];
              var5++;
              continue L2;
            }
          }
        }
        param2 = param2;
        var4 = param2 - 2;
        var8 = 0;
        var5 = var8;
        L3: while (true) {
          if (var8 >= param2) {
            return;
          } else {
            L4: {
              var6 = param0[var4 + 1];
              var7 = param0[var8 + 1];
              if (var6 >= var7) {
                if (var7 >= var6) {
                  break L4;
                } else {
                  int fieldTemp$8 = field_d;
                  field_d = field_d + 1;
                  field_f[fieldTemp$8] = param0[var8];
                  int fieldTemp$9 = field_d;
                  field_d = field_d + 1;
                  field_f[fieldTemp$9] = var7;
                  int fieldTemp$10 = field_d;
                  field_d = field_d + 1;
                  field_f[fieldTemp$10] = param0[var4];
                  int fieldTemp$11 = field_d;
                  field_d = field_d + 1;
                  field_f[fieldTemp$11] = var6;
                  break L4;
                }
              } else {
                int fieldTemp$12 = field_d;
                field_d = field_d + 1;
                field_f[fieldTemp$12] = param0[var4];
                int fieldTemp$13 = field_d;
                field_d = field_d + 1;
                field_f[fieldTemp$13] = var6;
                int fieldTemp$14 = field_d;
                field_d = field_d + 1;
                field_f[fieldTemp$14] = param0[var8];
                int fieldTemp$15 = field_d;
                field_d = field_d + 1;
                field_f[fieldTemp$15] = var7;
                break L4;
              }
            }
            var4 = var8;
            var8 += 2;
            continue L3;
          }
        }
    }
}
