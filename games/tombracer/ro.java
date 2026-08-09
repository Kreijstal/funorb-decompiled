/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends wda {
    private int field_v;
    static String field_q;
    private int field_w;
    private boolean field_s;
    private gea field_t;
    private boolean field_o;
    private boolean field_u;
    private int field_r;
    static int field_p;

    final int c(int param0) {
        if (param0 != 1) {
            return 10;
        }
        return 5;
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        if (param1 != -606738686) {
            this.b((byte) -25);
        }
    }

    ro(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        gea stackIn_7_0 = null;
        gea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_s = false;
        try {
          L0: {
            L1: {
              this.field_t = new gea(param0.field_E, param1);
              if (7 < param0.field_E) {
                this.field_r = this.a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                this.field_r = param1.b((byte) 44, 4) << 542358128;
                break L1;
              }
            }
            L2: {
              if ((param0.field_E ^ -1) <= -12) {
                break L2;
              } else {
                L3: {
                  stackIn_7_0 = this.field_t;

                  if (1 != param1.b((byte) 44, 1)) {
                    stackIn_8_0 = (gea) ((Object) stackIn_7_0);
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = (gea) ((Object) stackIn_7_0);
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((gea) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 1);
                break L2;
              }
            }
            L4: {
              if ((param0.field_E ^ -1) > -13) {
                break L4;
              } else {
                L5: {
                  stackIn_12_0 = this;

                  if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 0;
                    break L5;
                  } else {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 1;
                    break L5;
                  }
                }
                ((ro) (this)).field_o = stackIn_13_1 != 0;
                if (!this.field_o) {
                  break L4;
                } else {
                  L6: {
                    stackIn_16_0 = this;

                    if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                      stackIn_17_0 = this;
                      stackIn_17_1 = 0;
                      break L6;
                    } else {
                      stackIn_17_0 = this;
                      stackIn_17_1 = 1;
                      break L6;
                    }
                  }
                  ((ro) (this)).field_u = stackIn_17_1 != 0;
                  this.field_v = param1.b((byte) 44, 12);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ro.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 4) {
            return;
        }
        this.field_u = param1 ? true : false;
    }

    final void b(byte param0) {
        int[][] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[][] var15;
        int[][] var16;
        int[][] var17;
        if (!this.field_t.a(-4075)) {
          var17 = this.field_t.c(-2);
          var16 = var17;
          var15 = var16;
          var2 = var15;
          var3 = 45 / ((-69 - param0) / 42);
          if (var17.length <= this.field_w) {
            this.field_w = 0;
            if (!this.field_t.a((byte) 21)) {
              var4 = var15[this.field_w][0] - -this.d((byte) -70);
              var5 = var15[this.field_w][1] - -this.a(false);
              var6 = -this.field_n.s(25745) + var4;
              var7 = var5 + -this.field_n.e(false);
              var8 = this.field_r >> 209416848;
              var8 = var8 * var8;
              var9 = (var6 >> 173037776) * (var6 >> 2067083696) - -((var7 >> 865888368) * (var7 >> -1579119088));
              if (var9 > var8) {
                var10 = qva.a((byte) -99, var7, var6);
                if (this.field_o) {
                  if (this.field_s) {
                    var11 = cf.a(8192, -16390, var10, this.field_n.g(-25787));
                    var12 = ua.a(var11, 39);
                    if (-1 != (this.field_v ^ -1)) {
                      if (var12 > this.field_v) {
                        this.field_n.c(false, -lw.a(var11, (byte) -76) * this.field_v);
                        if (!this.field_u) {
                          var11 = hua.a((byte) 126, var10 >> -906254206);
                          var12 = bua.a(0, var10 >> -606738686);
                          var13 = doa.a(2, this.field_r, var11);
                          var14 = doa.a(2, this.field_r, var12);
                          this.field_n.a((byte) -77, var13, var14);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_n.c(false, -var11);
                        this.field_s = false;
                        var11 = hua.a((byte) 126, var10 >> -906254206);
                        var12 = bua.a(0, var10 >> -606738686);
                        var13 = doa.a(2, this.field_r, var11);
                        var14 = doa.a(2, this.field_r, var12);
                        this.field_n.a((byte) -77, var13, var14);
                        return;
                      }
                    } else {
                      this.field_n.c(false, -var11);
                      this.field_s = false;
                      var11 = hua.a((byte) 126, var10 >> -906254206);
                      var12 = bua.a(0, var10 >> -606738686);
                      var13 = doa.a(2, this.field_r, var11);
                      var14 = doa.a(2, this.field_r, var12);
                      this.field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    var11 = hua.a((byte) 126, var10 >> -906254206);
                    var12 = bua.a(0, var10 >> -606738686);
                    var13 = doa.a(2, this.field_r, var11);
                    var14 = doa.a(2, this.field_r, var12);
                    this.field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> -906254206);
                  var12 = bua.a(0, var10 >> -606738686);
                  var13 = doa.a(2, this.field_r, var11);
                  var14 = doa.a(2, this.field_r, var12);
                  this.field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                this.field_n.a((byte) -112, var6, var7);
                this.field_s = true;
                this.field_w = this.field_w + 1;
                return;
              }
            } else {
              this.field_j = true;
              return;
            }
          } else {
            var4 = var15[this.field_w][0] - -this.d((byte) -70);
            var5 = var15[this.field_w][1] - -this.a(false);
            var6 = -this.field_n.s(25745) + var4;
            var7 = var5 + -this.field_n.e(false);
            var8 = this.field_r >> 209416848;
            var8 = var8 * var8;
            var9 = (var6 >> 173037776) * (var6 >> 2067083696) - -((var7 >> 865888368) * (var7 >> -1579119088));
            if (var9 > var8) {
              var10 = qva.a((byte) -99, var7, var6);
              if (this.field_o) {
                if (this.field_s) {
                  var11 = cf.a(8192, -16390, var10, this.field_n.g(-25787));
                  var12 = ua.a(var11, 39);
                  if (-1 != (this.field_v ^ -1)) {
                    if (var12 > this.field_v) {
                      this.field_n.c(false, -lw.a(var11, (byte) -76) * this.field_v);
                      if (!this.field_u) {
                        var11 = hua.a((byte) 126, var10 >> -906254206);
                        var12 = bua.a(0, var10 >> -606738686);
                        var13 = doa.a(2, this.field_r, var11);
                        var14 = doa.a(2, this.field_r, var12);
                        this.field_n.a((byte) -77, var13, var14);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_n.c(false, -var11);
                      this.field_s = false;
                      var11 = hua.a((byte) 126, var10 >> -906254206);
                      var12 = bua.a(0, var10 >> -606738686);
                      var13 = doa.a(2, this.field_r, var11);
                      var14 = doa.a(2, this.field_r, var12);
                      this.field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    this.field_n.c(false, -var11);
                    this.field_s = false;
                    var11 = hua.a((byte) 126, var10 >> -906254206);
                    var12 = bua.a(0, var10 >> -606738686);
                    var13 = doa.a(2, this.field_r, var11);
                    var14 = doa.a(2, this.field_r, var12);
                    this.field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> -906254206);
                  var12 = bua.a(0, var10 >> -606738686);
                  var13 = doa.a(2, this.field_r, var11);
                  var14 = doa.a(2, this.field_r, var12);
                  this.field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                var11 = hua.a((byte) 126, var10 >> -906254206);
                var12 = bua.a(0, var10 >> -606738686);
                var13 = doa.a(2, this.field_r, var11);
                var14 = doa.a(2, this.field_r, var12);
                this.field_n.a((byte) -77, var13, var14);
                return;
              }
            } else {
              this.field_n.a((byte) -112, var6, var7);
              this.field_s = true;
              this.field_w = this.field_w + 1;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        this.field_v = param0;
        int var3 = 18 % ((37 - param1) / 55);
    }

    final void b(int param0) {
        if (param0 != 1) {
            this.e(91);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 98, param1, this.field_r);
        param1 = fs.a((byte) 26, param1, this.field_w);
        if (param0 != 0) {
          field_q = (String) null;
          return param1;
        } else {
          return param1;
        }
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -91);
            if (param1 >= -78) {
                this.field_o = true;
            }
            this.field_t.a(param0, 0);
            param0.a((byte) 54, this.b(0, this.field_r), 8);
            param0.a((byte) -127, !this.field_o ? 0 : 1, 1);
            if (this.field_o) {
                param0.a((byte) -126, this.field_u ? 1 : 0, 1);
                param0.a((byte) -128, this.field_v, 12);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ro.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, gea param1) {
        try {
            this.field_t = param1;
            if (param0 < 6) {
                field_q = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ro.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ro(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = false;
        try {
            this.field_t = new gea();
            this.field_r = 131072;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -116) {
              if (param2) {
                stackIn_7_0 = qt.field_a.b(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = bfa.field_c.b(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 51;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ro.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int e(int param0) {
        if (param0 < 2) {
            field_q = (String) null;
            return this.field_r;
        }
        return this.field_r;
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 > -101) {
            String var2 = (String) null;
            ro.a((byte) -4, (String) null, false);
        }
    }

    final void c(byte param0) {
        if (param0 > -116) {
          this.field_w = -124;
          super.c((byte) -119);
          this.field_t.a(true);
          return;
        } else {
          super.c((byte) -119);
          this.field_t.a(true);
          return;
        }
    }

    final void a(byte param0, int param1) {
        this.field_r = param1;
        int var3 = 84 % ((-37 - param0) / 46);
    }

    final int d(boolean param0) {
        if (param0) {
            this.field_r = -121;
            return this.field_w;
        }
        return this.field_w;
    }

    static {
        field_q = "Enter name of friend to delete from list";
    }
}
