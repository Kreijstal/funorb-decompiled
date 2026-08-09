/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends wda {
    private int field_q;
    static String field_p;
    static iu field_s;
    private boolean field_u;
    private int field_v;
    static int field_t;
    private boolean field_r;
    private ir field_o;

    final void b(byte param0) {
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
        hca var14;
        var13 = TombRacer.field_G ? 1 : 0;
        var3 = -93 % ((param0 - -69) / 42);
        var14 = this.field_n.H(-122);
        if (var14.u(-25561)) {
          return;
        } else {
          this.field_o.field_f = var14.d(3);
          this.field_o.field_d = var14.e(9648);
          this.field_n.a(this.field_o, 30);
          var4 = this.field_o.field_f - this.field_n.s(25745);
          var5 = this.field_o.field_d + -this.field_n.e(false);
          var6 = this.field_q >> -450006160;
          var6 = var6 * var6;
          var7 = (var4 >> -1643954256) * (var4 >> 348233296) + (var5 >> -1774965552) * (var5 >> 38151056);
          if (var7 <= var6) {
            return;
          } else {
            if (var4 != 0) {
              L0: {
                if (this.field_u) {
                  var8 = ua.a(var4, -106);
                  var9 = ua.a(var5, -115);
                  var10 = 0;
                  var11 = 0;
                  if (!this.field_r) {
                    L1: {
                      if (this.field_r) {
                        break L1;
                      } else {
                        if (var9 * 4 >= 3 * var8) {
                          break L1;
                        } else {
                          L2: {
                            this.field_r = true;
                            if (-1 > (var4 ^ -1)) {
                              var10 = this.field_v;
                              break L2;
                            } else {
                              var10 = -this.field_v;
                              break L2;
                            }
                          }
                          if (var8 >= ua.a(var10, -103)) {
                            this.field_n.a((byte) -120, var10, var11);
                            return;
                          } else {
                            var10 = var4;
                            this.field_n.a((byte) -120, var10, var11);
                            return;
                          }
                        }
                      }
                    }
                    L3: {
                      this.field_r = false;
                      if ((var5 ^ -1) < -1) {
                        var11 = this.field_v;
                        break L3;
                      } else {
                        var11 = -this.field_v;
                        break L3;
                      }
                    }
                    if (var9 < ua.a(var11, 60)) {
                      var11 = var5;
                      this.field_n.a((byte) -120, var10, var11);
                      break L0;
                    } else {
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    if (var8 * 4 >= var9 * 3) {
                      L4: {
                        this.field_r = true;
                        if (-1 > (var4 ^ -1)) {
                          var10 = this.field_v;
                          break L4;
                        } else {
                          var10 = -this.field_v;
                          break L4;
                        }
                      }
                      if (var8 < ua.a(var10, -103)) {
                        var10 = var4;
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    } else {
                      L5: {
                        if (this.field_r) {
                          break L5;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L5;
                          } else {
                            L6: {
                              this.field_r = true;
                              if (-1 > (var4 ^ -1)) {
                                var10 = this.field_v;
                                break L6;
                              } else {
                                var10 = -this.field_v;
                                break L6;
                              }
                            }
                            if (var8 < ua.a(var10, -103)) {
                              var10 = var4;
                              this.field_n.a((byte) -120, var10, var11);
                              return;
                            } else {
                              this.field_n.a((byte) -120, var10, var11);
                              return;
                            }
                          }
                        }
                      }
                      L7: {
                        this.field_r = false;
                        if ((var5 ^ -1) < -1) {
                          var11 = this.field_v;
                          break L7;
                        } else {
                          var11 = -this.field_v;
                          break L7;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                  }
                } else {
                  L8: {
                    if (0 != var4) {
                      break L8;
                    } else {
                      if (var5 == 0) {
                        var5 = 1;
                        break L8;
                      } else {
                        var8 = qva.a((byte) -73, var5, var4);
                        var9 = hua.a((byte) 107, var8 >> -316068894);
                        var10 = bua.a(0, var8 >> 554838914);
                        var11 = doa.a(2, this.field_v, var9);
                        var12 = doa.a(2, this.field_v, var10);
                        this.field_n.a((byte) -113, var11, var12);
                        return;
                      }
                    }
                  }
                  var8 = qva.a((byte) -73, var5, var4);
                  var9 = hua.a((byte) 107, var8 >> -316068894);
                  var10 = bua.a(0, var8 >> 554838914);
                  var11 = doa.a(2, this.field_v, var9);
                  var12 = doa.a(2, this.field_v, var10);
                  this.field_n.a((byte) -113, var11, var12);
                  break L0;
                }
              }
              return;
            } else {
              if (var5 != 0) {
                L9: {
                  if (this.field_u) {
                    L10: {
                      L11: {
                        var8 = ua.a(var4, -106);
                        var9 = ua.a(var5, -115);
                        var10 = 0;
                        var11 = 0;
                        if (!this.field_r) {
                          break L11;
                        } else {
                          if (var8 * 4 >= var9 * 3) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (this.field_r) {
                          break L12;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L12;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        this.field_r = false;
                        if ((var5 ^ -1) < -1) {
                          var11 = this.field_v;
                          break L13;
                        } else {
                          var11 = -this.field_v;
                          break L13;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        this.field_n.a((byte) -120, var10, var11);
                        break L9;
                      } else {
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                    L14: {
                      this.field_r = true;
                      if (-1 > (var4 ^ -1)) {
                        var10 = this.field_v;
                        break L14;
                      } else {
                        var10 = -this.field_v;
                        break L14;
                      }
                    }
                    if (var8 < ua.a(var10, -103)) {
                      var10 = var4;
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    } else {
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    L15: {
                      if (0 != var4) {
                        break L15;
                      } else {
                        if (var5 == 0) {
                          var5 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var8 = qva.a((byte) -73, var5, var4);
                    var9 = hua.a((byte) 107, var8 >> -316068894);
                    var10 = bua.a(0, var8 >> 554838914);
                    var11 = doa.a(2, this.field_v, var9);
                    var12 = doa.a(2, this.field_v, var10);
                    this.field_n.a((byte) -113, var11, var12);
                    break L9;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        this.field_q = param1;
        int var3 = 108 / ((param0 - -57) / 33);
    }

    final void a(kh param0, byte param1) {
        if (param1 >= -78) {
            return;
        }
        try {
            super.a(param0, (byte) -83);
            param0.a((byte) -128, this.field_q >> 1657486128, 10);
            param0.a((byte) -25, this.b(0, this.field_v), 8);
            param0.a((byte) -128, this.field_u ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bg.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, boolean param1) {
        super(param0, param1);
        this.field_r = true;
        this.field_o = new ir();
        try {
            this.field_q = 1048576;
            this.field_v = 131072;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_r = true;
        this.field_o = new ir();
        try {
          L0: {
            L1: {
              this.field_q = param1.b((byte) 44, 10) << 1507414544;
              if (7 < param0.field_E) {
                this.field_v = this.a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                this.field_v = param1.b((byte) 44, 4) << -1552938064;
                break L1;
              }
            }
            L2: {
              if (this.c(true).field_E < 3) {
                this.field_u = false;
                break L2;
              } else {
                L3: {
                  stackIn_7_0 = this;

                  if (1 == param1.b((byte) 44, 1)) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  }
                }
                ((bg) (this)).field_u = stackIn_8_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("bg.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            this.field_q = 125;
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, this.field_v);
        if (param0 != 0) {
            this.a(-97, -102);
            return param1;
        }
        return param1;
    }

    final void a(boolean param0, int param1) {
        this.field_v = param1;
        if (param0) {
            field_p = (String) null;
        }
    }

    public static void e(byte param0) {
        if (param0 != 67) {
            return;
        }
        field_s = null;
        field_p = null;
    }

    final void a(int param0, fsa param1) {
        try {
            super.a(66, param1);
            if (param0 <= 35) {
                this.c(65, 104);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            this.b((byte) -128);
            return 1;
        }
        return 1;
    }

    static {
        field_p = "Play free version";
    }
}
