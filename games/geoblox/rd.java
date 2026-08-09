/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ff {
    static byte[][] field_s;
    static int field_u;
    static di field_r;
    static int field_v;
    static String field_w;
    private si field_t;
    private si[] field_x;

    final si a(int param0, int param1) {
        if (param0 >= -93) {
            return (si) null;
        }
        si dupTemp$0 = new si();
        this.field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, dm[] param1) {
        si[] var3 = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        el var7 = null;
        si[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 124) {
                break L1;
              } else {
                var7 = (el) null;
                this.a(-125, -66, 53, true, (el) null);
                break L1;
              }
            }
            var8 = this.field_x;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_a = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("rd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(boolean param0, rd param1, boolean param2) {
        si dupTemp$2 = null;
        int var4_int = 0;
        si var5 = null;
        si var6 = null;
        int var7 = 0;
        si stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        si stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        si stackIn_9_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              super.a(param1, param0);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_x[var4_int];
                      if (var5 == null) {
                        param1.field_x[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_x[var4_int];
                          stackIn_8_0 = (si) (var5);

                          stackIn_8_1 = 2;

                          if (var6 == null) {
                            dupTemp$2 = new si();
                            param1.field_x[var4_int] = dupTemp$2;
                            stackIn_9_0 = (si) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (si) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_9_0 = (si) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (si) (var6);
                            break L4;
                          }
                        }
                        ((si) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                sf.a(this.field_x, 0, param1.field_x, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rd.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, dm param1) {
        si[] var3 = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        si[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            var7 = this.field_x;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_l = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rd.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 520) {
            String var2 = (String) null;
            rd.a(38, (String) null);
        }
        kd.field_e.f(10936);
        if (!(null != vg.field_i)) {
            vg.field_i = new rl(kd.field_e, ff.field_d);
        }
        kd.field_e.a(false, vg.field_i);
    }

    final static void b(int param0) {
        oe.field_P[45] = 26;
        oe.field_P[44] = 71;
        oe.field_P[520] = 59;
        oe.field_P[222] = 58;
        oe.field_P[192] = param0;
        oe.field_P[46] = 72;
        oe.field_P[47] = 73;
        oe.field_P[92] = 74;
        oe.field_P[91] = 42;
        oe.field_P[93] = 43;
        oe.field_P[61] = 27;
        oe.field_P[59] = 57;
    }

    public rd() {
        this.field_x = new si[6];
        this.field_t = new si();
        si dupTemp$0 = new si();
        this.field_x[0] = dupTemp$0;
        si var1 = dupTemp$0;
        var1.a((byte) -3);
    }

    public static void a(byte param0) {
        int var1 = -71 / ((32 - param0) / 50);
        field_r = null;
        field_s = (byte[][]) null;
        field_w = null;
    }

    final void a(dm[] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (this.field_x[var4_int] == null) {
                this.field_x[var4_int] = new si();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_x[param1].field_a = param0;
              if (param2 > 38) {
                break L2;
              } else {
                field_r = (di) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("rd.GA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        el stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        si var7 = null;
        si var9 = null;
        hk var10 = null;
        si var11 = null;
        si var12 = null;
        si var13 = null;
        si var14 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof hk)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (el) (param4);
                break L1;
              }
            }
            L2: {
              var10 = (hk) ((Object) stackIn_3_0);
              uh.a(param4.field_m + param2, param4.field_v + param0, -14045, param4.field_h + (param2 - -param4.field_m), param4.field_r + (param0 - -param4.field_v));
              if (var10 != null) {
                param3 = param3 & var10.field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_x[0];
              if (param1 < -5) {
                break L3;
              } else {
                field_s = (byte[][]) null;
                break L3;
              }
            }
            L4: {
              this.field_t.a((byte) -28);
              var7.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (!var10.field_y) {
                    break L5;
                  } else {
                    var11 = this.field_x[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                      break L5;
                    }
                  }
                }
                if (!var10.field_l) {
                  break L4;
                } else {
                  L6: {
                    var12 = this.field_x[3];
                    if (var10.field_f == 0) {
                      break L6;
                    } else {
                      if (var12 == null) {
                        break L6;
                      } else {
                        var12.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                        break L4;
                      }
                    }
                  }
                  var9 = this.field_x[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (param4.e((byte) 54)) {
                var13 = this.field_x[5];
                if (var13 == null) {
                  break L7;
                } else {
                  var13.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param3) {
                var14 = this.field_x[4];
                if (var14 != null) {
                  var14.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            this.field_t.a((rd) (this), param0, param2, param4, 0);
            id.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -116) {
            return;
        }
        try {
            fl.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rd(rd param0, boolean param1) {
        this();
        try {
            param0.a(true, (rd) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static dm[] a(int param0, int param1, int param2, rh param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -61) {
              break L0;
            } else {
              field_s = (byte[][]) null;
              break L0;
            }
          }
          if (mf.a(param2, param0, 114, param3)) {
            return hj.a(104);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("rd.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_s = new byte[250][];
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
