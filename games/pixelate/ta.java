/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private static int field_d;
    private static int[] field_c;
    private static int field_a;
    private static int field_h;
    private static int field_f;
    private static int field_e;
    private static int field_b;
    private static int field_g;

    private final static void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (field_h < 0) {
            field_g = 0;
            field_d = 0;
            field_b = 0;
            field_a = 2147483646;
            return;
        }
        ta.a(0, field_h);
        int var0 = field_c[1];
        if (var0 < t.field_f) {
            var0 = t.field_f;
        }
        int var1 = 0;
        for (var2 = 0; var2 < field_h; var2 += 4) {
            var3 = field_c[var2 + 1];
            if (var0 < var3) {
                break;
            }
            var4 = field_c[var2];
            var5 = field_c[var2 + 2];
            var6 = field_c[var2 + 3];
            var7 = (var5 - var4 << 16) / (var6 - var3);
            var8 = (var4 << 16) + 32768;
            field_c[var2] = var8 + (var0 - var3) * var7;
            field_c[var2 + 2] = var7;
        }
        field_b = var1;
        field_d = var2;
        field_g = var2;
        field_a = var0 - 1;
    }

    final static void a(int[] param0, int param1) {
        ta.a(param0, 0, param0.length, param1);
    }

    private final static void a(int[] param0, int param1, int param2) {
        int var3 = 0;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var3 = field_h + (param2 << 1);
            if (field_c == null) {
              break L1;
            } else {
              if (field_c.length >= var3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4_ref_int__ = new int[var3];
          var5 = 0;
          L2: while (true) {
            if (var5 >= field_h) {
              field_c = var4_ref_int__;
              break L0;
            } else {
              var4_ref_int__[var5] = field_c[var5];
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
            var6 = param0[var4 + 1];
            var7 = param0[var8 + 1];
            if (var6 >= var7) {
              L4: {
                if (var7 >= var6) {
                  break L4;
                } else {
                  field_h = field_h + 1;
                  field_c[field_h] = param0[var8];
                  field_h = field_h + 1;
                  field_c[field_h] = var7;
                  field_h = field_h + 1;
                  field_c[field_h] = param0[var4];
                  field_h = field_h + 1;
                  field_c[field_h] = var6;
                  break L4;
                }
              }
              var4 = var8;
              var8 += 2;
              continue L3;
            } else {
              field_h = field_h + 1;
              field_c[field_h] = param0[var4];
              field_h = field_h + 1;
              field_c[field_h] = var6;
              field_h = field_h + 1;
              field_c[field_h] = param0[var8];
              field_h = field_h + 1;
              field_c[field_h] = var7;
              var4 = var8;
              var8 += 2;
              continue L3;
            }
          }
        }
    }

    private final static boolean d() {
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
        var0 = field_d;
        var1 = field_g;
        var2 = field_a;
        L0: while (true) {
          if (var1 < var0) {
            field_f = field_c[var1] >> 16;
            field_e = field_c[var1 + 4] >> 16;
            field_c[var1] = field_c[var1] + field_c[var1 + 2];
            field_c[var1 + 4] = field_c[var1 + 4] + field_c[var1 + 6];
            var1 += 8;
            field_g = var1;
            return true;
          } else {
            var2++;
            field_a = var2;
            if (var2 < t.field_a) {
              var3 = field_b;
              L1: while (true) {
                L2: {
                  if (var0 >= field_h) {
                    break L2;
                  } else {
                    var4 = field_c[var0 + 1];
                    if (var2 >= var4) {
                      var5 = field_c[var0];
                      var6 = field_c[var0 + 2];
                      var7 = field_c[var0 + 3];
                      var8 = (var6 - var5 << 16) / (var7 - var4);
                      var9 = (var5 << 16) + 32768;
                      field_c[var0] = var9;
                      field_c[var0 + 2] = var8;
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
                    if (var3 != field_h) {
                      ta.b(var3, var0);
                      field_b = var3;
                      field_d = var0;
                      var1 = var3;
                      continue L0;
                    } else {
                      field_h = 0;
                      return false;
                    }
                  } else {
                    var5 = field_c[var10 + 3];
                    if (var2 >= var5) {
                      field_c[var10] = field_c[var3];
                      field_c[var10 + 1] = field_c[var3 + 1];
                      field_c[var10 + 2] = field_c[var3 + 2];
                      field_c[var10 + 3] = field_c[var3 + 3];
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
          var3 = field_c[var2];
          var4 = field_c[var2 + 1];
          var5 = field_c[var2 + 2];
          var6 = field_c[var2 + 3];
          var7 = param0 + 4;
          L0: while (true) {
            if (var7 >= param1) {
              field_c[var2] = var3;
              field_c[var2 + 1] = var4;
              field_c[var2 + 2] = var5;
              field_c[var2 + 3] = var6;
              ta.a(param0, var2);
              ta.a(var2 + 4, param1);
              return;
            } else {
              var8 = field_c[var7 + 1];
              if (var8 < var4) {
                field_c[var2] = field_c[var7];
                field_c[var2 + 1] = var8;
                field_c[var2 + 2] = field_c[var7 + 2];
                field_c[var2 + 3] = field_c[var7 + 3];
                var2 += 4;
                field_c[var7] = field_c[var2];
                field_c[var7 + 1] = field_c[var2 + 1];
                field_c[var7 + 2] = field_c[var2 + 2];
                field_c[var7 + 3] = field_c[var2 + 3];
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

    public static void a() {
        field_c = null;
    }

    private final static void c() {
        field_h = 0;
    }

    private final static void a(int[] param0, int param1, int param2, int param3) {
        ta.c();
        ta.a(param0, 0, param2);
        ta.a(param3);
    }

    private final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ta.b();
        while (ta.d()) {
            var1 = field_f;
            var2 = field_e;
            var3 = field_a;
            t.b(var1, var3, var2 - var1, param0);
        }
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
                  var4 = field_c[var3 - 4];
                  var5 = field_c[var3];
                  if (var4 > var5) {
                    var2 = 0;
                    field_c[var3 - 4] = var5;
                    field_c[var3] = var4;
                    var4 = field_c[var3 - 2];
                    field_c[var3 - 2] = field_c[var3 + 2];
                    field_c[var3 + 2] = var4;
                    var4 = field_c[var3 - 1];
                    field_c[var3 - 1] = field_c[var3 + 3];
                    field_c[var3 + 3] = var4;
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
}
