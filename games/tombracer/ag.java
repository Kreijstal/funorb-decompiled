/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag implements iq {
    private int field_c;
    private int field_j;
    private int field_d;
    private int field_a;
    private int field_b;
    private int field_m;
    private int field_l;
    private jfa field_g;
    private int field_h;
    private int field_f;
    private int field_k;
    private int field_i;
    private int field_e;

    final int a(int param0) {
        if (param0 != -862393232) {
            this.field_c = -119;
            return this.field_e;
        }
        return this.field_e;
    }

    final int c(int param0) {
        if (param0 != -30661) {
            this.field_f = -50;
            return this.field_d;
        }
        return this.field_d;
    }

    final static void a(boolean param0, boolean param1, boolean param2, String param3) {
        try {
            oga.a(param2);
            ej.field_a.e(true);
            vn.field_b = new jw(jo.field_E, (String) null, jf.field_r, param1, param0);
            um.field_l = new mpa(ej.field_a, vn.field_b);
            ej.field_a.c(um.field_l, 114);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ag.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(jfa param0, int param1) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              if (param1 == -1) {
                break L1;
              } else {
                discarded$2 = this.b(-111, 10, 84, 17, 71);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ag.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(byte param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_g == null) {
          this.b(12052);
          return;
        } else {
          var2 = (float)((this.field_g.b((byte) -103) >> -862393232) - this.field_d);
          if (param0 >= 84) {
            L0: {
              var3 = (float)((this.field_g.c((byte) 124) >> -614437168) + -this.field_h);
              var4 = var3 * var3 + var2 * var2;
              if (var4 <= 576.0f) {
                break L0;
              } else {
                var5 = 24.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
                var6 = var2 * var5;
                var7 = var5 * var3;
                this.field_d = this.field_d + (int)(var2 - var6);
                this.field_h = this.field_h + (int)(-var7 + var3);
                this.field_a = 0;
                if (var8 != 0) {
                  break L0;
                } else {
                  this.b(12052);
                  return;
                }
              }
            }
            this.field_a = this.field_a + 1;
            if (50.0f < (float)this.field_a) {
              L1: {
                if (4.0f >= var4) {
                  break L1;
                } else {
                  var5 = 2.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
                  this.field_h = this.field_h + (int)(var5 * var3);
                  this.field_d = this.field_d + (int)(var5 * var2);
                  if (var8 != 0) {
                    break L1;
                  } else {
                    this.b(12052);
                    return;
                  }
                }
              }
              this.field_a = 0;
              this.b(12052);
              return;
            } else {
              this.b(12052);
              return;
            }
          } else {
            L2: {
              this.field_b = -28;
              var3 = (float)((this.field_g.c((byte) 124) >> -614437168) + -this.field_h);
              var4 = var3 * var3 + var2 * var2;
              if (var4 <= 576.0f) {
                break L2;
              } else {
                var5 = 24.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
                var6 = var2 * var5;
                var7 = var5 * var3;
                this.field_d = this.field_d + (int)(var2 - var6);
                this.field_h = this.field_h + (int)(-var7 + var3);
                this.field_a = 0;
                if (var8 != 0) {
                  break L2;
                } else {
                  this.b(12052);
                  return;
                }
              }
            }
            this.field_a = this.field_a + 1;
            if (50.0f < (float)this.field_a) {
              L3: {
                if (4.0f >= var4) {
                  break L3;
                } else {
                  var5 = 2.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
                  this.field_h = this.field_h + (int)(var5 * var3);
                  this.field_d = this.field_d + (int)(var5 * var2);
                  if (var8 != 0) {
                    break L3;
                  } else {
                    this.b(12052);
                    return;
                  }
                }
              }
              this.field_a = 0;
              this.b(12052);
              return;
            } else {
              this.b(12052);
              return;
            }
          }
        }
    }

    public final void a(boolean param0) {
        if (param0) {
            this.field_m = 75;
            this.b(12052);
            return;
        }
        this.b(12052);
    }

    public final void a(int param0, byte param1, int param2, int param3, int param4) {
        this.field_l = param0;
        this.field_i = param3;
        if (param1 != -3) {
            return;
        }
        this.field_m = param2;
        this.field_f = param4;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param0 != -1) {
            return true;
        }
        return (2048 & param1 ^ -1) != -1 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == -30023) {
            return;
        }
        this.a(46, (byte) 61, 4, -69, -91);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_c = param2;
        this.field_j = param4;
        this.field_b = param1;
        this.field_k = param3;
        if (param0 > 30) {
          return;
        } else {
          this.field_j = -66;
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3) {
        this.field_d = this.field_d + param2;
        this.field_h = this.field_h + param0;
        if (param3 == 26768) {
          return;
        } else {
          this.field_f = -105;
          return;
        }
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  var5_int = param1[0].field_n;
                  var6 = param1[2].field_n;
                  var7 = param1[1].field_n;
                  param1[0].b(param3, param0);
                  param1[2].b(-var6 + param4 + param3, param0);
                  bea.b(ic.field_d);
                  bea.g(param3 + var5_int, param0, -var6 + (param3 + param4), param0 + param1[1].field_k);
                  var8 = param3 + var5_int;
                  var9 = -var6 + (param3 + param4);
                  param3 = var8;
                  if (param2 < -21) {
                    L2: while (true) {
                      L3: {
                        if (param3 >= var9) {
                          bea.a(ic.field_d);
                          break L3;
                        } else {
                          param1[1].b(param3, param0);
                          param3 = param3 + var7;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            continue L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ag.O(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int b(byte param0) {
        int var2 = -96 % ((param0 - 3) / 58);
        return this.field_h;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
            return;
        }
        this.a(-41, -19, 59, 15);
    }

    final void a(int param0, byte param1) {
        this.field_e = param0;
        if (param1 == -88) {
            return;
        }
        this.field_f = 40;
    }

    private final void b(int param0) {
        int var2 = this.field_b + -this.field_c;
        int var3 = this.field_j + -this.field_k;
        this.field_d = this.b(this.field_i, this.field_f, var2, this.field_d, param0 ^ 12052);
        this.field_h = this.b(this.field_l, this.field_m, var3, this.field_h, param0 ^ param0);
    }

    private final int b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var6 = param1 - param0;
        if (-1 <= (var6 ^ -1)) {
          return param3;
        } else {
          if (param4 == 0) {
            var7 = param3;
            if (param2 > var6) {
              var7 = (param1 + -param0) / 2 + param0;
              if (var8 != 0) {
                if (param0 <= param3 - param2 / 2) {
                  if (param3 - -(param2 / 2) > param1) {
                    L0: {
                      var7 = param1 + -(param2 / 2);
                      if (var8 == 0) {
                        break L0;
                      } else {
                        var7 = param2 / 2 + param0;
                        break L0;
                      }
                    }
                    return var7;
                  } else {
                    return var7;
                  }
                } else {
                  var7 = param2 / 2 + param0;
                  return var7;
                }
              } else {
                return var7;
              }
            } else {
              if (param0 <= param3 - param2 / 2) {
                if (param3 - -(param2 / 2) <= param1) {
                  return var7;
                } else {
                  L1: {
                    var7 = param1 + -(param2 / 2);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      var7 = param2 / 2 + param0;
                      break L1;
                    }
                  }
                  return var7;
                }
              } else {
                var7 = param2 / 2 + param0;
                return var7;
              }
            }
          } else {
            this.field_h = -110;
            var7 = param3;
            if (param2 > var6) {
              var7 = (param1 + -param0) / 2 + param0;
              if (var8 != 0) {
                if (param0 <= param3 - param2 / 2) {
                  if (param3 - -(param2 / 2) <= param1) {
                    return var7;
                  } else {
                    L2: {
                      var7 = param1 + -(param2 / 2);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        var7 = param2 / 2 + param0;
                        break L2;
                      }
                    }
                    return var7;
                  }
                } else {
                  var7 = param2 / 2 + param0;
                  return var7;
                }
              } else {
                return var7;
              }
            } else {
              if (param0 <= param3 - param2 / 2) {
                if (param3 - -(param2 / 2) <= param1) {
                  return var7;
                } else {
                  L3: {
                    var7 = param1 + -(param2 / 2);
                    if (var8 == 0) {
                      break L3;
                    } else {
                      var7 = param2 / 2 + param0;
                      break L3;
                    }
                  }
                  return var7;
                }
              } else {
                var7 = param2 / 2 + param0;
                return var7;
              }
            }
          }
        }
    }

    final static void a(int param0, dh[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_7_0 = false;
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
            var2_int = param1.length;
            var3 = 1;
            L1: while (true) {
              stackOut_2_0 = var3;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 >= var2_int) {
                    stackOut_12_0 = param0;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    var4 = param1[var3];
                    stackOut_4_0 = var3 + -1;
                    stackIn_13_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      var5 = stackIn_5_0;
                      L4: while (true) {
                        L5: {
                          if (-1 < (var5 ^ -1)) {
                            break L5;
                          } else {
                            stackOut_7_0 = mka.a(var4, 13, param1[var5]);
                            stackIn_3_0 = stackOut_7_0 ? 1 : 0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var6 != 0) {
                              continue L2;
                            } else {
                              if (!stackIn_8_0) {
                                break L5;
                              } else {
                                param1[1 + var5] = param1[var5];
                                var5--;
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        param1[1 + var5] = var4;
                        var3++;
                        continue L1;
                      }
                    }
                  }
                }
                if (stackIn_13_0 < -77) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ag.R(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
