/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends am {
    static t[] field_t;
    static sm[] field_s;
    private kj[] field_v;
    static String field_u;

    final static void b(int param0) {
        if (!(on.b(160))) {
            return;
        }
        if (param0 != -23658) {
            field_u = (String) null;
        }
        ka.a(4, false, (byte) -53);
    }

    final static boolean h(byte param0) {
        if (param0 < 51) {
            return true;
        }
        return true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = this.field_l.a(param1, 25657);
        int[] var3 = var4;
        if (!(!this.field_l.field_b)) {
            this.a(this.field_l.a(0), -1);
        }
        if (param0 < 86) {
            return (int[]) null;
        }
        return var4;
    }

    public s() {
        super(0, true);
    }

    public static void g(byte param0) {
        if (param0 != -73) {
            return;
        }
        field_s = null;
        field_t = null;
        field_u = null;
    }

    private final void a(int[][] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        kj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            var3_int = ci.field_c;
            if (param1 == -1) {
              L1: {
                var4 = um.field_o;
                nn.a(param0, (byte) -114);
                om.a(0, 0, jh.field_A, 0, vp.field_I);
                if (null == this.field_v) {
                  break L1;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= this.field_v.length) {
                      break L1;
                    } else {
                      L3: {
                        var6 = this.field_v[var5];
                        var7 = var6.field_a;
                        var8 = var6.field_c;
                        if (-1 < (var7 ^ -1)) {
                          if (-1 < (var8 ^ -1)) {
                            break L3;
                          } else {
                            var6.a(var4, var3_int, (byte) 106);
                            break L3;
                          }
                        } else {
                          if (-1 >= (var8 ^ -1)) {
                            var6.a(var3_int, var4, -105);
                            break L3;
                          } else {
                            var6.a((byte) 60, var4, var3_int);
                            break L3;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("s.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                s.g((byte) -103);
                break L1;
              }
            }
            L2: {
              if (param2 != 0) {
                if (1 == param2) {
                  L3: {
                    stackIn_21_0 = this;

                    if (1 != param0.i((byte) -101)) {
                      stackIn_22_0 = this;
                      stackIn_22_1 = 0;
                      break L3;
                    } else {
                      stackIn_22_0 = this;
                      stackIn_22_1 = 1;
                      break L3;
                    }
                  }
                  ((s) (this)).field_p = stackIn_22_1 != 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                this.field_v = new kj[param0.i((byte) -101)];
                var4_int = 0;
                L4: while (true) {
                  if (var4_int >= this.field_v.length) {
                    break L2;
                  } else {
                    L5: {
                      var5 = param0.i((byte) -101);
                      var6 = var5;
                      if (0 == var6) {
                        this.field_v[var4_int] = (kj) ((Object) tl.a(param0, (byte) -51));
                        break L5;
                      } else {
                        if ((var6 ^ -1) != -2) {
                          if (-3 == (var6 ^ -1)) {
                            this.field_v[var4_int] = (kj) ((Object) c.a(i.c(param1, 40), param0));
                            break L5;
                          } else {
                            if (var6 != 3) {
                              break L5;
                            } else {
                              this.field_v[var4_int] = (kj) ((Object) bi.a(param0, (byte) 13));
                              break L5;
                            }
                          }
                        } else {
                          this.field_v[var4_int] = (kj) ((Object) wa.a(false, param0));
                          break L5;
                        }
                      }
                    }
                    var4_int++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("s.H(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = Torquing.field_u;
        if (param0 != -29116) {
            return (int[][]) null;
        }
        int[][] var3 = this.field_r.a(15142, param1);
        if (!(!this.field_r.field_b)) {
            var4 = ci.field_c;
            var5 = um.field_o;
            var29 = new int[var5][var4];
            var30 = this.field_r.a(false);
            this.a(var29, param0 ^ 29115);
            for (var8 = 0; var8 < um.field_o; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; ci.field_c > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = ie.a(var15 << -1874971868, 4080);
                    var12[var14] = ie.a(65280, var15) >> 49481732;
                    var11[var14] = ie.a(var15 >> 18496300, 4080);
                }
            }
        }
        return var3;
    }

    static {
        field_u = "That name is not available";
    }
}
