/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends se implements in {
    private gn[] field_I;
    static String field_K;
    static hh field_H;
    private String[] field_G;
    static cd field_L;
    private jn field_J;

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        hp var4 = null;
        u var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = (hp) ((Object) mh.field_l.c(108));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    gl.c(false);
                    break L2;
                  }
                }
                var5 = (u) ((Object) cp.field_T.c(59));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    o.a(var5, param1, -85);
                    var5 = (u) ((Object) cp.field_T.b(6));
                    continue L3;
                  }
                }
              } else {
                tk.a(var4, 58, param1);
                var4 = (hp) ((Object) mh.field_l.b(6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "gl.D(" + param0 + ',' + param1 + ')');
        }
    }

    gl(jn param0) {
        super(0, 0, 0, 0, (nl) null);
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        he var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -112) {
                break L1;
              } else {
                this.field_G = (String[]) null;
                break L1;
              }
            }
            L2: {
              this.field_B.e(-30986);
              if (param1 == null) {
                break L2;
              } else {
                if (-1 != (param1.length ^ -1)) {
                  var3_int = param1.length;
                  this.field_G = new String[var3_int];
                  var4_int = 0;
                  L3: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new he(ke.field_h, 0, 1);
                      this.field_I = new gn[var3_int - -1];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_I[var3_int] = new gn(al.field_ab, (bj) (this));
                          this.field_I[var3_int].field_h = (nl) ((Object) var4);
                          this.field_I[var3_int].b(0, 16 * var3_int + 16 + 20, 28972, 100, 15);
                          this.b((byte) 55, this.field_I[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_I[var5] = new gn(this.field_G[var5], (bj) (this));
                          this.field_I[var5].field_h = (nl) ((Object) var4);
                          this.field_I[var5].field_x = wd.field_I;
                          this.field_I[var5].b(0, 20 - -(var5 * 16), 28972, 80, 15);
                          this.b((byte) 94, this.field_I[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_G[var4_int] = ld.a((byte) 0, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            this.field_G = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("gl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        if (param0 != -2) {
            return;
        }
        fm var5 = ke.field_h;
        if (null != this.field_G) {
            var5.a(pi.field_g, param3 - -this.field_y, param1 + this.field_i, this.field_n, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_C);
        }
    }

    final static ja a(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var1 = oq.field_w[0] * vj.field_p[0];
        byte[] var2 = qp.field_t[0];
        int[] var3 = new int[var1];
        int var4_int = 0;
        if (param0 != 15) {
            field_K = (String) null;
        }
        while (var1 > var4_int) {
            var3[var4_int] = tp.field_t[tq.b(255, (int) var2[var4_int])];
            var4_int++;
        }
        ja var4 = new ja(ie.field_nb, hj.field_a, k.field_i[0], qj.field_o[0], oq.field_w[0], vj.field_p[0], var3);
        fd.h((byte) 126);
        return var4;
    }

    public static void c(boolean param0) {
        if (!param0) {
            gl.b(true, -119);
        }
        field_H = null;
        field_L = null;
        field_K = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param0 ^ -1)) {
                stackIn_7_0 = this.a((byte) -1, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 != 99) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(99, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("gl.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        cf var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -83) {
                break L1;
              } else {
                var8 = (cf) null;
                this.a(-106, '￘', (cf) null, 49);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_G.length <= var6_int) {
                L3: {
                  if (this.field_I[this.field_G.length] == param2) {
                    this.field_J.a(496);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param2 == this.field_I[var6_int]) {
                    this.field_J.a(this.field_G[var6_int], 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_K = "All players have left <%0>'s game.";
    }
}
