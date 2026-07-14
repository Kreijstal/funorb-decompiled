/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements eh {
    static int field_f;
    static String field_d;
    static long field_a;
    private long field_b;
    static boolean field_e;
    static int[] field_g;
    static String field_c;

    final static void e(int param0) {
        if (ge.field_D) {
          bc.field_d = true;
          if (param0 != 6) {
            return;
          } else {
            wg.a(param0 + -107, true);
            rl.field_N = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = TrackController.field_F ? 1 : 0;
        if (param1 == -31) {
          var4 = param3.length();
          var5 = param2.length();
          var6 = var4;
          var7 = var5 + -1;
          if (-1 != (var7 ^ -1)) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var14 = new StringBuilder(var6);
                var8 = var14;
                var9 = 0;
                L1: while (true) {
                  var10 = param3.indexOf((int) param0, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$10 = var14.append(param3.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$11 = var14.append(param2);
                    continue L1;
                  } else {
                    StringBuilder discarded$12 = var14.append(param3.substring(var9));
                    return var14.toString();
                  }
                }
              }
            }
          } else {
            var13 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$13 = var13.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$14 = var13.append(param2);
                continue L2;
              } else {
                StringBuilder discarded$15 = var13.append(param3.substring(var9));
                return var13.toString();
              }
            }
          }
        } else {
          L3: {
            var12 = null;
            short[] discarded$16 = v.a(-84, (short[]) null, (la) null, 49);
            var4 = param3.length();
            var5 = param2.length();
            var6 = var4;
            var7 = var5 + -1;
            if (-1 != (var7 ^ -1)) {
              var8_int = 0;
              L4: while (true) {
                var8_int = param3.indexOf((int) param0, var8_int);
                if ((var8_int ^ -1) <= -1) {
                  var8_int++;
                  var6 = var6 + var7;
                  continue L4;
                } else {
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L3;
                }
              }
            } else {
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            }
          }
          L5: while (true) {
            var10 = param3.indexOf((int) param0, var9);
            if (-1 >= (var10 ^ -1)) {
              StringBuilder discarded$17 = var8.append(param3.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$18 = var8.append(param2);
              continue L5;
            } else {
              StringBuilder discarded$19 = var8.append(param3.substring(var9));
              return var8.toString();
            }
          }
        }
    }

    abstract ud f(int param0);

    public final void a(int param0) {
        int var2 = 68 / ((-9 - param0) / 50);
        ((v) this).field_b = qg.a(false);
    }

    public final ud a(byte param0) {
        if (((v) this).b(24685)) {
            return c.field_a;
        }
        if (!(qg.a(false) >= ((v) this).field_b - -350L)) {
            return lh.field_x;
        }
        int var2 = 35 / ((param0 - 55) / 49);
        return ((v) this).f(38);
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    public final String c(int param0) {
        if (!((v) this).b(24685)) {
          if (qg.a(false) >= 350L + ((v) this).field_b) {
            if (param0 != 15914) {
              ((v) this).field_b = 72L;
              return ((v) this).b((byte) 22);
            } else {
              return ((v) this).b((byte) 22);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    final static short[] a(int param0, short[] param1, la param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        if (param3 >= 26) {
          var4 = param2.d(0, param0);
          if (0 != var4) {
            if (param1 != null) {
              if (var4 == param1.length) {
                var5 = param2.d(0, 4);
                var6 = (short)param2.d(0, 16);
                if (-1 <= (var5 ^ -1)) {
                  var7 = 0;
                  L0: while (true) {
                    if (var4 > var7) {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L0;
                    } else {
                      return param1;
                    }
                  }
                } else {
                  var7 = 0;
                  L1: while (true) {
                    if (var4 > var7) {
                      param1[var7] = (short)(var6 + param2.d(0, var5));
                      var7++;
                      continue L1;
                    } else {
                      return param1;
                    }
                  }
                }
              } else {
                L2: {
                  param1 = new short[var4];
                  var5 = param2.d(0, 4);
                  var6 = (short)param2.d(0, 16);
                  if (-1 <= (var5 ^ -1)) {
                    var7 = 0;
                    L3: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param1[var7] = (short)var6;
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param1[var7] = (short)(var6 + param2.d(0, var5));
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                return param1;
              }
            } else {
              L5: {
                param1 = new short[var4];
                var5 = param2.d(0, 4);
                var6 = (short)param2.d(0, 16);
                if (-1 <= (var5 ^ -1)) {
                  var7 = 0;
                  L6: while (true) {
                    if (var4 <= var7) {
                      break L5;
                    } else {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L5;
                    } else {
                      param1[var7] = (short)(var6 + param2.d(0, var5));
                      var7++;
                      continue L7;
                    }
                  }
                }
              }
              return param1;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Just play";
        field_a = 0L;
        field_g = new int[]{6, 6, 9, 9, 18, 18};
        field_c = "Loading fonts";
    }
}
