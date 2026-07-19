/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    private boolean field_q;
    private int field_p;
    private int field_m;
    static boolean field_o;
    private int field_e;
    private int field_f;
    private boolean field_i;
    private fj field_n;
    private int field_g;
    private int field_c;
    static int field_b;
    private int field_h;
    private int field_l;
    private dta field_d;
    private int field_k;
    private int field_j;
    private qh field_a;

    final boolean c(int param0) {
        if (param0 != 1727002282) {
            return true;
        }
        return this.field_q;
    }

    final static int a(boolean param0, mi[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param1.length - 1 <= var3_int) {
                      break L4;
                    } else {
                      var6 = param2 + -1;
                      var5 = param1[var3_int - -1].field_h;
                      if (var4 != 0) {
                        if (var5 == var6) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (var5 <= var6) {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_8_0 = var3_int;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_b = -62;
                break L2;
              }
              stackOut_13_0 = param1.length + -1;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("qa.G(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param2 == param0) {
          return param0;
        } else {
          L0: {
            L1: {
              var4 = -param2 + param0;
              var5 = ua.a(var4, 14);
              if (var4 <= param1) {
                break L1;
              } else {
                var6 = 1;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = -1;
            break L0;
          }
          if (this.field_h > var5) {
            return var6 + param2;
          } else {
            return var4 / this.field_h + param2;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 26) {
          this.a((byte) -94);
          this.field_g = this.field_g + param2;
          this.field_m = this.field_m + param2;
          this.field_j = this.field_j + param0;
          this.field_f = this.field_f + param0;
          this.field_h = 16;
          return;
        } else {
          this.field_g = this.field_g + param2;
          this.field_m = this.field_m + param2;
          this.field_j = this.field_j + param0;
          this.field_f = this.field_f + param0;
          this.field_h = 16;
          return;
        }
    }

    final void b(int param0) {
        int discarded$1 = 0;
        mi[] var3 = null;
        if (!this.a(0)) {
          return;
        } else {
          this.field_n.a(this.field_e, this.field_p, this.field_k, this.field_c, this.field_l, this.field_a, 51);
          if (param0 == 23479) {
            if (!this.field_a.f((byte) 33)) {
              if (!this.field_a.field_A) {
                this.field_d.a(this.field_p, this.field_k, this.field_e, -88, this.field_a, this.field_c, this.field_l);
                if (this.field_a.field_D) {
                  tra.a(0, bm.field_f, (byte) -72, this.field_p, tga.field_a, this.field_k - this.field_p, 1, -this.field_c + this.field_l, this.field_c, -16777216 | wga.field_a[this.field_e]);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var3 = (mi[]) null;
            discarded$1 = qa.a(true, (mi[]) null, 44);
            if (!this.field_a.f((byte) 33)) {
              if (!this.field_a.field_A) {
                this.field_d.a(this.field_p, this.field_k, this.field_e, -88, this.field_a, this.field_c, this.field_l);
                if (!this.field_a.field_D) {
                  return;
                } else {
                  tra.a(0, bm.field_f, (byte) -72, this.field_p, tga.field_a, this.field_k - this.field_p, 1, -this.field_c + this.field_l, this.field_c, -16777216 | wga.field_a[this.field_e]);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, wm param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == -20186) {
              L1: {
                L2: {
                  var4_int = aaa.a(false) - koa.b(0) / 2;
                  var5 = koa.b(0) / 2;
                  if (mf.field_d != param1) {
                    break L2;
                  } else {
                    this.a(0, 0, 8, aaa.a(false), koa.b(0));
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 == dp.field_j) {
                    break L3;
                  } else {
                    L4: {
                      if (qu.field_e == param1) {
                        break L4;
                      } else {
                        if (param1 != mma.field_c) {
                          break L1;
                        } else {
                          this.a(var4_int, param0 * var5, 8, aaa.a(false), (param0 - -1) * var5);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a(var4_int, 0, 8, aaa.a(false), var5 << -1326047231);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(0, 0, param2 + 20194, var4_int, koa.b(param2 ^ -20186));
                return;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("qa.K(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 59) {
          if (param0 >= this.field_p) {
            if (param2 >= this.field_c) {
              if (param3 <= this.field_k) {
                if (this.field_l < param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_g = -31;
          if (param0 >= this.field_p) {
            if (param2 >= this.field_c) {
              if (param3 <= this.field_k) {
                if (this.field_l < param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1) {
        this.field_q = param1 ? true : false;
        if (param0 > 26) {
            return;
        }
        this.field_p = -104;
    }

    final void a(byte param0) {
        if (!this.field_i) {
          this.field_p = this.a(this.field_g, 0, this.field_p);
          this.field_c = this.a(this.field_f, 0, this.field_c);
          this.field_k = this.a(this.field_m, 0, this.field_k);
          this.field_l = this.a(this.field_j, 0, this.field_l);
          this.field_n.a(-8);
          if (param0 < 77) {
            return;
          } else {
            this.field_d.a((byte) -21);
            return;
          }
        } else {
          this.field_i = false;
          this.field_p = this.field_g;
          this.field_l = this.field_j;
          this.field_k = this.field_m;
          this.field_c = this.field_f;
          return;
        }
    }

    private final boolean a(int param0) {
        if (param0 != 0) {
          this.field_f = 126;
          return this.a(aaa.a(false), (byte) 59, koa.b(param0 ^ 0), 0, 0);
        } else {
          return this.a(aaa.a(false), (byte) 59, koa.b(param0 ^ 0), 0, 0);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param1;
        this.field_c = param1;
        this.field_g = param0;
        this.field_j = param4;
        this.field_m = param3;
        this.field_h = param2;
        this.field_p = param0;
        this.field_k = param3;
        this.field_l = param4;
    }

    final void a(byte param0, int param1) {
        int var3 = 81 % ((-76 - param0) / 39);
        this.field_n.a(0, param1);
    }

    final static void a(int param0, int param1, byte param2, int param3, nh[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nh[] var11 = null;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        byte stackOut_21_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = aq.field_a[0].a();
            param1 = (var6_int / 2 + param1) / var6_int * var6_int;
            var7 = aq.field_a[0].c();
            param4[0].a(param3, param5);
            param0 = (param0 + var7 / 2) / var7 * var7;
            param4[2].a(-var6_int + param1 + param3, param5);
            param4[6].a(param3, -var7 + param0 + param5);
            param4[8].a(-var6_int + (param3 + param1), param5 - -param0 - var7);
            var8 = var6_int + param3;
            L1: while (true) {
              L2: {
                L3: {
                  if (param3 - (-param1 + var6_int * 2) < var8) {
                    break L3;
                  } else {
                    param4[1].a(var8, param5);
                    param4[7].a(var8, param0 + (param5 - var7));
                    var8 = var8 + var6_int;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8 = param5 + var7;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var8 > -(var7 * 2) + param0 + param5) {
                      break L6;
                    } else {
                      param4[3].a(param3, var8);
                      param4[5].a(param1 + (param3 - var6_int), var8);
                      var8 = var8 + var7;
                      if (var10 != 0) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var8 = var6_int + param3;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var8 > param1 + param3 + -(2 * var6_int)) {
                        break L9;
                      } else {
                        stackOut_13_0 = param5 + var7;
                        stackIn_22_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var10 != 0) {
                          break L8;
                        } else {
                          var9 = stackIn_14_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (param5 + (param0 - var7 * 2) < var9) {
                                  break L12;
                                } else {
                                  param4[4].a(var8, var9);
                                  var9 = var9 + var7;
                                  if (var10 != 0) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              var8 = var8 + var6_int;
                              break L11;
                            }
                            if (var10 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    stackOut_21_0 = param2;
                    stackIn_22_0 = stackOut_21_0;
                    break L8;
                  }
                  if (stackIn_22_0 > 64) {
                    break L0;
                  } else {
                    var11 = (nh[]) null;
                    qa.a(110, 85, (byte) -45, -18, (nh[]) null, -3);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var6);
            stackOut_25_1 = new StringBuilder().append("qa.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L13;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param5 + ')');
        }
    }

    qa(qh param0, int param1) {
        this.field_i = true;
        this.field_h = 8;
        try {
            this.field_a = param0;
            this.field_e = param1;
            this.field_n = new fj();
            this.field_d = new dta();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = 1727002282;
    }
}
