/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lw {
    static ws field_g;
    int field_a;
    static String[] field_k;
    String field_j;
    static kv[] field_b;
    int field_e;
    private int field_d;
    String[] field_h;
    int[][] field_c;
    boolean field_i;
    static be[] field_f;

    void a(int param0) {
        int var2 = 87 / ((59 - param0) / 33);
        ((lw) this).field_e = 0;
    }

    final void c(int param0) {
        ua.field_b = true;
        if (param0 <= 69) {
            int discarded$0 = lw.a(-78, 62, 3, 125, -30, -74, -51, 3, 42);
        }
    }

    final boolean c(byte param0) {
        if (param0 != 95) {
            return true;
        }
        if (((lw) this).field_i) {
            return ((lw) this).field_d == ((lw) this).field_e ? true : false;
        }
        return rfa.a(false, ((lw) this).field_e) == ((lw) this).field_d ? true : false;
    }

    abstract void a(int param0, byte param1);

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_b = null;
        field_k = null;
        if (!param0) {
            field_b = null;
        }
    }

    abstract void a(byte param0);

    final void b(byte param0) {
        if (param0 != 112) {
            ((lw) this).field_a = 72;
        }
        ua.field_b = false;
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        if (((lw) this).field_i) {
            ((lw) this).field_e = ((lw) this).field_e + 1;
        } else {
            ((lw) this).field_e = ((lw) this).field_e | 1 << ((lw) this).field_a;
        }
        aga.d(false);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = BachelorFridge.field_y;
          param4 = param4 - param1;
          if (param5 == 12175) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        param7 = param7 - param3;
        var9 = param6;
        if (-1 != (param7 ^ -1)) {
          if (-1 != param4) {
            L1: {
              if (0 > param4 + param7) {
                param1 = param1 + param4;
                param4 = -param4;
                param3 = param3 + param7;
                param7 = -param7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param7 < param4) {
                param3 = param3 << 16;
                param7 = param7 << 16;
                param3 = param3 + 32768;
                var10 = (int)Math.floor(0.5 + (double)param7 / (double)param4);
                param4 = param4 + param1;
                L3: while (true) {
                  if (param1 > param4) {
                    break L2;
                  } else {
                    L4: {
                      var11 = param3 >> 1934868304;
                      var9++;
                      if (0 == var9 / param0 % 2) {
                        qea.a(param1, var11, param8, (byte) -102, param2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param3 = param3 + var10;
                    param1++;
                    continue L3;
                  }
                }
              } else {
                param1 = param1 << 16;
                param1 = param1 + 32768;
                param4 = param4 << 16;
                var10 = (int)Math.floor((double)param4 / (double)param7 + 0.5);
                param7 = param7 + param3;
                L5: while (true) {
                  if (param3 > param7) {
                    break L2;
                  } else {
                    var11 = param1 >> 661913104;
                    param1 = param1 + var10;
                    var9++;
                    if (0 == var9 / param0 % 2) {
                      qea.a(var11, param3, param8, (byte) -128, param2);
                      param3++;
                      continue L5;
                    } else {
                      param3++;
                      continue L5;
                    }
                  }
                }
              }
            }
            return var9;
          } else {
            L6: {
              if ((param7 ^ -1) > -1) {
                var10 = param7 + param3;
                L7: while (true) {
                  if (1 + -param7 <= var10) {
                    break L6;
                  } else {
                    var9++;
                    if (var9 / param0 % 2 == 0) {
                      qea.a(param1, var10, param8, (byte) -104, param2);
                      var10++;
                      continue L7;
                    } else {
                      var10++;
                      continue L7;
                    }
                  }
                }
              } else {
                var10 = param3;
                L8: while (true) {
                  if (param7 - -1 <= var10) {
                    break L6;
                  } else {
                    var9++;
                    if (0 == var9 / param0 % 2) {
                      qea.a(param1, var10, param8, (byte) -97, param2);
                      var10++;
                      continue L8;
                    } else {
                      var10++;
                      continue L8;
                    }
                  }
                }
              }
            }
            return var9;
          }
        } else {
          L9: {
            if ((param4 ^ -1) <= -1) {
              var10 = param1;
              L10: while (true) {
                if (param4 + 1 <= var10) {
                  break L9;
                } else {
                  var9++;
                  if (var9 / param0 % 2 == -1) {
                    qea.a(var10, param3, param8, (byte) -107, param2);
                    var10++;
                    continue L10;
                  } else {
                    var10++;
                    continue L10;
                  }
                }
              }
            } else {
              var10 = param1 - -param4;
              L11: while (true) {
                if (var10 >= -param4 - -1) {
                  break L9;
                } else {
                  var9++;
                  if (var9 / param0 % 2 == 0) {
                    qea.a(var10, param3, param8, (byte) -113, param2);
                    var10++;
                    continue L11;
                  } else {
                    var10++;
                    continue L11;
                  }
                }
              }
            }
          }
          return var9;
        }
    }

    lw(boolean param0, String[] param1, String param2) {
        ((lw) this).field_a = 1;
        ((lw) this).field_h = param1;
        ((lw) this).field_j = param2;
        ((lw) this).field_d = ((lw) this).field_h.length;
        ((lw) this).field_i = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new be[10];
        field_g = new ws();
    }
}
