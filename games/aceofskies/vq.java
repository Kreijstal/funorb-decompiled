/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vq extends mi {
    private kp field_x;
    private jo field_z;
    static int field_w;
    private String[] field_y;

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = -56 / ((param0 - 14) / 53);
                if (this.field_y == null) {
                  break L2;
                } else {
                  if (param2 >= this.field_y.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var5 = new String[param2 + 1];
                if (null != this.field_y) {
                  var6 = 0;
                  L4: while (true) {
                    if (this.field_y.length <= var6) {
                      break L3;
                    } else {
                      var5[var6] = this.field_y[var6];
                      var6++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_y = var5;
              break L1;
            }
            this.field_y[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("vq.HA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.a(((et) ((Object) this.field_e)).a(param3 + 2147483537, (ea) (this)), param0, param1, param2, (byte) 124);
        if (param3 != 110) {
            this.a((byte) -98, -99, -83, 107);
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a((byte) 109, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        et var9 = (et) ((Object) this.field_e);
        jo var6 = this.field_z;
        if (var6 != null) {
            var7 = var9.a(param3, (ea) (this), (byte) -128);
            var8 = var9.a(param2, false, (ea) (this));
            do {
                co.a(var8 + (var6.field_g + -2), var6.field_e + 2, 2 + var6.field_h, var7 + var6.field_i + -2, 112);
                var6 = var6.field_f;
            } while (var6 != null);
        }
        if (param0 < 64) {
            this.a(-83, 88, 88, -90, (byte) 51);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, (byte) 127);
        if (param4 <= 122) {
            return;
        }
        this.a((byte) -67);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 + -this.field_p;
        int var6 = -this.field_h + param3;
        jo var7 = this.c(var6, 0, var5);
        if (var7 != null) {
            if (this.field_o != null) {
                ((ue) ((Object) this.field_o)).a((byte) -73, param2, (vq) (this), var7.field_k);
            }
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ea var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) 53, param1, param2, param3);
              this.field_z = null;
              if (this.field_g) {
                var5_int = ic.field_b - (param3 + this.field_p);
                var6 = -this.field_h + (cf.field_g - param2);
                this.field_z = this.c(var6, 0, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 13) {
                break L2;
              } else {
                var7 = (ea) null;
                this.a((byte) 11, (ea) null, -123, 59);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("vq.S(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        et var3 = null;
        pp var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        co var12 = null;
        int var13 = 0;
        int var14 = 0;
        jo var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = AceOfSkies.field_G ? 1 : 0;
        this.field_x = new kp();
        var2 = 0;
        var3 = (et) ((Object) this.field_e);
        if (param0 == -67) {
          var4 = var3.a((byte) 66, (ea) (this));
          L0: while (true) {
            var5 = this.field_f.indexOf("<hotspot=", var2);
            if (0 == (var5 ^ -1)) {
              return;
            } else {
              var7 = this.field_f.indexOf(">", var5);
              var6 = this.field_f.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_f.indexOf("</hotspot>", var5);
              var8 = var4.a(1, var5);
              var9 = var4.a(1, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var11 > var9) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var4.b(var5, -122);
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var12.field_h[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var9 != var11) {
                      if (var12 != null) {
                        stackOut_13_0 = var12.field_h[-1 + var12.field_h.length];
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.b(var2, -114);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new jo(var7, var13, var12.field_f, -var13 + var14, Math.max(var3.a(-4), var12.field_d - var12.field_f));
                    if (var10 == null) {
                      break L4;
                    } else {
                      ((jo) (var10)).field_f = var15;
                      break L4;
                    }
                  }
                  var10 = var15;
                  this.field_x.a(66, var15);
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final jo c(int param0, int param1, int param2) {
        jo var4 = null;
        jo var5 = null;
        int var6 = 0;
        String var7 = null;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            var7 = (String) null;
            this.a(-112, (String) null, -74);
            break L0;
          }
        }
        var4 = (jo) ((Object) this.field_x.d(268435455));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (jo) ((Object) this.field_x.b((byte) 103));
                continue L1;
              } else {
                L3: {
                  if (var5.field_i > param2) {
                    break L3;
                  } else {
                    if (var5.field_g > param0) {
                      break L3;
                    } else {
                      if (var5.field_h + var5.field_i <= param2) {
                        break L3;
                      } else {
                        if (var5.field_g + var5.field_e < param0) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_f;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    String c(byte param0) {
        if (param0 >= -41) {
            return (String) null;
        }
        if (this.field_z == null) {
            return null;
        }
        if (this.field_y == null) {
            return null;
        }
        if (this.field_y.length <= this.field_z.field_k) {
            return null;
        }
        return this.field_y[this.field_z.field_k];
    }

    boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -42) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("vq.U(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    vq(String param0, ir param1) {
        super(param0, (no) null);
        this.field_z = null;
        try {
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = 0;
    }
}
