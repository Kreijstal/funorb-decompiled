/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    private static int field_d;
    private static int field_c;
    private static int field_a;
    private static int field_f;
    private static int field_b;
    private static int field_h;
    private static int[] field_e;
    private static int field_g;

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
            var3 = field_c + (param2 << 1);
            if (field_e == null) {
              break L1;
            } else {
              if (field_e.length >= var3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4_ref_int__ = new int[var3];
          var5 = 0;
          L2: while (true) {
            if (var5 >= field_c) {
              field_e = var4_ref_int__;
              break L0;
            } else {
              var4_ref_int__[var5] = field_e[var5];
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
                  field_c = field_c + 1;
                  field_e[field_c] = param0[var8];
                  field_c = field_c + 1;
                  field_e[field_c] = var7;
                  field_c = field_c + 1;
                  field_e[field_c] = param0[var4];
                  field_c = field_c + 1;
                  field_e[field_c] = var6;
                  break L4;
                }
              } else {
                field_c = field_c + 1;
                field_e[field_c] = param0[var4];
                field_c = field_c + 1;
                field_e[field_c] = var6;
                field_c = field_c + 1;
                field_e[field_c] = param0[var8];
                field_c = field_c + 1;
                field_e[field_c] = var7;
                break L4;
              }
            }
            var4 = var8;
            var8 += 2;
            continue L3;
          }
        }
    }

    final static void a(ha param0, int[] param1, int param2, int param3, int param4) {
        Object var6 = null;
        Object var5 = null;
        rj.a(param0, param1, 0, param3, param4, (int[]) null, (int[]) null);
    }

    private final static void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (field_c < 0) {
            field_b = 0;
            field_f = 0;
            field_g = 0;
            field_d = 2147483646;
            return;
        }
        rj.a(0, field_c);
        int var1 = field_e[1];
        if (var1 < param0) {
            var1 = param0;
        }
        int var2 = 0;
        for (var3 = 0; var3 < field_c; var3 += 4) {
            var4 = field_e[var3 + 1];
            if (var1 < var4) {
                break;
            }
            var5 = field_e[var3];
            var6 = field_e[var3 + 2];
            var7 = field_e[var3 + 3];
            var8 = (var6 - var5 << 16) / (var7 - var4);
            var9 = (var5 << 16) + 32768;
            field_e[var3] = var9 + (var1 - var4) * var8;
            field_e[var3 + 2] = var8;
        }
        field_g = var2;
        field_f = var3;
        field_b = var3;
        field_d = var1 - 1;
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
          var3 = field_e[var2];
          var4 = field_e[var2 + 1];
          var5 = field_e[var2 + 2];
          var6 = field_e[var2 + 3];
          var7 = param0 + 4;
          L0: while (true) {
            if (var7 >= param1) {
              field_e[var2] = var3;
              field_e[var2 + 1] = var4;
              field_e[var2 + 2] = var5;
              field_e[var2 + 3] = var6;
              rj.a(param0, var2);
              rj.a(var2 + 4, param1);
              return;
            } else {
              var8 = field_e[var7 + 1];
              if (var8 < var4) {
                field_e[var2] = field_e[var7];
                field_e[var2 + 1] = var8;
                field_e[var2 + 2] = field_e[var7 + 2];
                field_e[var2 + 3] = field_e[var7 + 3];
                var2 += 4;
                field_e[var7] = field_e[var2];
                field_e[var7 + 1] = field_e[var2 + 1];
                field_e[var7 + 2] = field_e[var2 + 2];
                field_e[var7 + 3] = field_e[var2 + 3];
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
                  var4 = field_e[var3 - 4];
                  var5 = field_e[var3];
                  if (var4 > var5) {
                    var2 = 0;
                    field_e[var3 - 4] = var5;
                    field_e[var3] = var4;
                    var4 = field_e[var3 - 2];
                    field_e[var3 - 2] = field_e[var3 + 2];
                    field_e[var3 + 2] = var4;
                    var4 = field_e[var3 - 1];
                    field_e[var3 - 1] = field_e[var3 + 3];
                    field_e[var3 + 3] = var4;
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

    private final static void b() {
        field_c = 0;
    }

    final static void a(ha param0, int[] param1, int param2) {
        rj.a(param0, param1, 0, param1.length, param2, (int[]) null, (int[]) null);
    }

    private final static boolean b(int param0) {
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
        int var11 = 0;
        var1 = field_f;
        var2 = field_b;
        var3 = field_d;
        L0: while (true) {
          if (var2 < var1) {
            field_a = field_e[var2] >> 16;
            field_h = field_e[var2 + 4] >> 16;
            field_e[var2] = field_e[var2] + field_e[var2 + 2];
            field_e[var2 + 4] = field_e[var2 + 4] + field_e[var2 + 6];
            var2 += 8;
            field_b = var2;
            return true;
          } else {
            var3++;
            field_d = var3;
            if (var3 < param0) {
              var4 = field_g;
              L1: while (true) {
                L2: {
                  if (var1 >= field_c) {
                    break L2;
                  } else {
                    var5 = field_e[var1 + 1];
                    if (var3 >= var5) {
                      var6 = field_e[var1];
                      var7 = field_e[var1 + 2];
                      var8 = field_e[var1 + 3];
                      var9 = (var7 - var6 << 16) / (var8 - var5);
                      var10 = (var6 << 16) + 32768;
                      field_e[var1] = var10;
                      field_e[var1 + 2] = var9;
                      var1 += 4;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var11 = var4;
                var5 = var11;
                L3: while (true) {
                  if (var11 >= var1) {
                    if (var4 != field_c) {
                      rj.b(var4, var1);
                      field_g = var4;
                      field_f = var1;
                      var2 = var4;
                      continue L0;
                    } else {
                      field_c = 0;
                      return false;
                    }
                  } else {
                    var6 = field_e[var11 + 3];
                    if (var3 >= var6) {
                      field_e[var11] = field_e[var4];
                      field_e[var11 + 1] = field_e[var4 + 1];
                      field_e[var11 + 2] = field_e[var4 + 2];
                      field_e[var11 + 3] = field_e[var4 + 3];
                      var4 += 4;
                      var11 += 4;
                      continue L3;
                    } else {
                      var11 += 4;
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

    private final static void a(ha param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var15 = null;
        L0: {
          var15 = new int[4];
          param0.K(var15);
          if (param5 == null) {
            break L0;
          } else {
            if (var15[3] - var15[1] == param5.length) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        rj.b();
        rj.a(param1, 0, param3);
        rj.a(var15[1]);
        L1: while (true) {
          if (!rj.b(var15[3])) {
            return;
          } else {
            L2: {
              var8 = field_a;
              var9 = field_h;
              var10 = field_d;
              if (param5 == null) {
                break L2;
              } else {
                L3: {
                  var11 = var10 - var15[1];
                  if (var8 >= param5[var11] + var15[0]) {
                    break L3;
                  } else {
                    var8 = param5[var11] + var15[0];
                    break L3;
                  }
                }
                L4: {
                  if (var9 <= param5[var11] + param6[var11] + var15[0]) {
                    break L4;
                  } else {
                    var9 = param5[var11] + param6[var11] + var15[0];
                    break L4;
                  }
                }
                if (var9 - var8 > 0) {
                  break L2;
                } else {
                  continue L1;
                }
              }
            }
            param0.U(var8, var10, var9 - var8, param4, 1);
            continue L1;
          }
        }
    }

    public static void a() {
        field_e = null;
    }
}
