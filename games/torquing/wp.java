/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends am {
    private int field_s;
    static int field_w;
    private int field_z;
    private int field_x;
    private int[] field_u;
    static t[] field_v;
    private int[] field_t;
    static int field_y;

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (param1 == 35) {
          L0: {
            var4 = param2;
            if (-1 == (var4 ^ -1)) {
              ((wp) this).field_x = param0.i((byte) -101);
              break L0;
            } else {
              if ((var4 ^ -1) != -2) {
                if (-3 == (var4 ^ -1)) {
                  ((wp) this).field_z = param0.i((byte) -101);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                ((wp) this).field_s = param0.i(param1 ^ 7059);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static da b(int param0) {
        if (param0 >= -51) {
            return null;
        }
        return new da(of.d((byte) -77), sd.b(2));
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, t[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = Torquing.field_u;
        if (param5 != null) {
            if (0 >= param2) {
                return;
            }
            var6 = param5[0].field_w;
            var7 = param5[2].field_w;
            var8 = param5[1].field_w;
            param5[0].c(param4, param0, param1);
            param5[2].c(param2 + param4 - var7, param0, param1);
            ph.b(lj.field_c);
            ph.f(var6 + param4, param0, -var7 + param4 + param2, param0 + param5[1].field_u);
            var9 = var6 + param4;
            var10 = -var7 + (param4 - -param2);
            param4 = var9;
            if (param3) {
                field_v = null;
            }
            while (var10 > param4) {
                param5[1].c(param4, param0, param1);
                param4 = param4 + var8;
            }
            ph.a(lj.field_c);
            return;
        }
    }

    private final void g(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        ((wp) this).field_u = new int[1 + ((wp) this).field_x];
        int var2 = 0;
        ((wp) this).field_t = new int[((wp) this).field_x + 1];
        int var3 = 4096 / ((wp) this).field_x;
        int var4 = ((wp) this).field_s * var3 >> -657712948;
        for (var5 = 0; ((wp) this).field_x > var5; var5++) {
            ((wp) this).field_t[var5] = var2;
            ((wp) this).field_u[var5] = var2 - -var4;
            var2 = var2 + var3;
        }
        ((wp) this).field_t[((wp) this).field_x] = 4096;
        ((wp) this).field_u[((wp) this).field_x] = 4096 - -((wp) this).field_u[0];
        if (param0 != 39) {
            ((wp) this).a((byte) 98);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Torquing.field_u;
          var15 = ((wp) this).field_l.a(param1, 25657);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (param0 >= 86) {
            break L0;
          } else {
            ((wp) this).field_z = -102;
            break L0;
          }
        }
        L1: {
          if (!((wp) this).field_l.field_b) {
            break L1;
          } else {
            var4 = dp.field_a[param1];
            if (((wp) this).field_z == 0) {
              var5 = 0;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var6 >= ((wp) this).field_x) {
                    break L3;
                  } else {
                    if (var4 >= ((wp) this).field_t[var6]) {
                      if (((wp) this).field_t[var6 - -1] > var4) {
                        if (var4 < ((wp) this).field_u[var6]) {
                          var5 = 4096;
                          break L3;
                        } else {
                          dk.a(var15, 0, ci.field_c, var5);
                          return var3;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                dk.a(var15, 0, ci.field_c, var5);
                break L1;
              }
            } else {
              var5 = 0;
              L4: while (true) {
                if (ci.field_c <= var5) {
                  break L1;
                } else {
                  L5: {
                    var6 = 0;
                    var7 = 0;
                    var8 = q.field_b[var5];
                    var9 = ((wp) this).field_z;
                    if ((var9 ^ -1) == -2) {
                      var6 = var8;
                      break L5;
                    } else {
                      if (var9 != 2) {
                        if ((var9 ^ -1) != -4) {
                          break L5;
                        } else {
                          var6 = (var8 + -var4 >> 611861953) + 2048;
                          break L5;
                        }
                      } else {
                        var6 = (var4 + -4096 + var8 >> -149594879) + 2048;
                        break L5;
                      }
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    L7: {
                      if (var11 >= ((wp) this).field_x) {
                        break L7;
                      } else {
                        if (((wp) this).field_t[var11] <= var6) {
                          if (var6 < ((wp) this).field_t[var11 + 1]) {
                            if (var6 >= ((wp) this).field_u[var11]) {
                              break L7;
                            } else {
                              var7 = 4096;
                              break L7;
                            }
                          } else {
                            var11++;
                            continue L6;
                          }
                        } else {
                          var11++;
                          continue L6;
                        }
                      }
                    }
                    var15 = var14;
                    var15[var5] = var7;
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(byte param0) {
        if (param0 <= 123) {
            ((wp) this).field_s = 91;
        }
        this.g((byte) 39);
    }

    public wp() {
        super(0, true);
        ((wp) this).field_z = 0;
        ((wp) this).field_s = 2048;
        ((wp) this).field_x = 10;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
            da discarded$0 = wp.b(110);
        }
    }

    static {
    }
}
