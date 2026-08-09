/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends fe {
    static int field_W;
    static String field_N;
    int field_P;
    int field_Y;
    int field_V;
    int field_U;
    int field_O;
    static String field_Q;
    static int field_X;
    int field_Z;
    static int field_S;
    static String field_T;
    static int field_R;

    public static void g(byte param0) {
        field_T = null;
        field_N = null;
        field_Q = null;
        int var1 = -61 % ((param0 - 69) / 52);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        if (!(-1 >= (im.field_fc ^ -1))) {
            return;
        }
        if (param1) {
            return;
        }
        int var3 = param2 - 135;
        int var4 = param0 - 35;
        int var5 = 256;
        if (im.field_fc < 75) {
            var5 = (im.field_fc << 1255946920) / 75;
        }
        if (!(-201 <= (im.field_fc ^ -1))) {
            var5 = (-im.field_fc + 250 << 1345186536) / 50;
        }
        kj.a(63, un.field_c);
        fb.a();
        qh.d();
        gi.a(-21818);
        if (!((var5 ^ -1) <= -257)) {
            qh.c(0, 0, qh.field_l, qh.field_f, 0, -var5 + 256);
        }
        oc.a(112);
        if (im.field_fc < 150) {
            un.field_c.b(var3, var4);
            var6 = -125 + im.field_fc;
            if ((var6 ^ -1) >= -1) {
                var6 = im.field_fc + -140;
                if (0 < var6) {
                    var7 = 256;
                    if (!((var6 ^ -1) <= -21)) {
                        var7 = 256 * var6 / 20;
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                    return;
                }
                return;
            }
            if (-51 >= (var6 ^ -1)) {
                var6 = im.field_fc + -140;
                if (0 < var6) {
                    var7 = 256;
                    if (!((var6 ^ -1) <= -21)) {
                        var7 = 256 * var6 / 20;
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                    return;
                }
                return;
            }
            if (20 > var6) {
                var7 = var6 * 256 / 20;
                ci.field_h.c(var3, var4, var7);
                var6 = im.field_fc + -140;
                if (0 < var6) {
                    var7 = 256;
                    if (!((var6 ^ -1) <= -21)) {
                        var7 = 256 * var6 / 20;
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                    return;
                }
                return;
            }
            if ((var6 ^ -1) > -31) {
                ci.field_h.c(var3, var4, 256);
                var6 = im.field_fc + -140;
                if (0 < var6) {
                    var7 = 256;
                    if (!((var6 ^ -1) <= -21)) {
                        var7 = 256 * var6 / 20;
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                    return;
                }
                return;
            }
            var7 = (-var6 + 50) * 256 / 20;
            ci.field_h.c(var3, var4, var7);
            var6 = im.field_fc + -140;
            if (0 < var6) {
                var7 = 256;
                if (!((var6 ^ -1) <= -21)) {
                    var7 = 256 * var6 / 20;
                }
                we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                return;
            }
            return;
        }
        qf.field_k.a(var3 + 15, 10 + var4, var5);
        var6 = -125 + im.field_fc;
        if ((var6 ^ -1) >= -1) {
            var6 = im.field_fc + -140;
            if (0 < var6) {
                var7 = 256;
                if (!((var6 ^ -1) <= -21)) {
                    var7 = 256 * var6 / 20;
                }
                we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                return;
            }
            return;
        }
        if (-51 >= (var6 ^ -1)) {
            var6 = im.field_fc + -140;
            if (0 < var6) {
                var7 = 256;
                if (!((var6 ^ -1) <= -21)) {
                    var7 = 256 * var6 / 20;
                }
                we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                return;
            }
            return;
        }
        if (20 > var6) {
            var7 = var6 * 256 / 20;
            ci.field_h.c(var3, var4, var7);
            var6 = im.field_fc + -140;
            if (0 < var6) {
                var7 = 256;
                if (!((var6 ^ -1) <= -21)) {
                    var7 = 256 * var6 / 20;
                }
                we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
                return;
            }
            return;
        }
        if ((var6 ^ -1) > -31) {
            ci.field_h.c(var3, var4, 256);
            var6 = im.field_fc + -140;
            if (0 >= var6) {
                return;
            }
            var7 = 256;
            if (!((var6 ^ -1) <= -21)) {
                var7 = 256 * var6 / 20;
            }
            we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
            return;
        }
        var7 = (-var6 + 50) * 256 / 20;
        ci.field_h.c(var3, var4, var7);
        var6 = im.field_fc + -140;
        if (0 >= var6) {
            return;
        }
        var7 = 256;
        if (!((var6 ^ -1) <= -21)) {
            var7 = 256 * var6 / 20;
        }
        we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 1746045704);
    }

    final static void a(im param0, int param1) {
        im var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pool.field_O;
        try {
          L0: {
            param0.a((byte) -117);
            if (param1 < -89) {
              var2 = (im) ((Object) ma.field_i.c((byte) 124));
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param0, (byte) -97)) {
                      break L2;
                    } else {
                      var2 = (im) ((Object) ma.field_i.f((byte) -5));
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (var2 == null) {
                    ma.field_i.b((byte) -11, param0);
                    break L3;
                  } else {
                    vj.a(param0, (byte) -119, var2);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("er.F(");

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
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, lr param4, boolean param5, int param6) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            L1: {
              var7_int = param4.b(param1) + 6;
              var8 = param4.field_w + param4.field_C - -6;
              var9 = param2 + -(var7_int / 2);
              if (var9 >= 0) {
                if (-641 <= (var9 + var7_int ^ -1)) {
                  break L1;
                } else {
                  param2 = param2 - (-640 + (var7_int + var9));
                  var9 = -var7_int + 640;
                  break L1;
                }
              } else {
                param2 = param2 - var9;
                var9 = 0;
                break L1;
              }
            }
            L2: {
              if (param5) {
                break L2;
              } else {
                field_X = 49;
                break L2;
              }
            }
            L3: {
              var10 = -3 + (-param4.field_C + param0);
              if ((var10 ^ -1) > -1) {
                param0 = param0 - var10;
                var10 = 0;
                break L3;
              } else {
                if (480 < var10 - -var8) {
                  param0 = param0 - (var10 + (var8 + -480));
                  var10 = 480 + -var8;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            qh.a(var9, var10, var7_int, var8, 3, 0, 128);
            param4.b(param1, param2, param0, param6, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("er.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private er() throws Throwable {
        throw new Error();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_U + (-this.field_C + -param1 + param6);
                var9 = -this.field_P + -this.field_D + -param5 + param4;
                if (this.field_O * this.field_O <= var8_int * var8_int + var9 * var9) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - pp.field_d;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_Z;
                      break L2;
                    } else {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)this.field_Z;
                        break L2;
                      }
                    }
                  }
                  this.field_Y = (int)((double)this.field_Z * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_Z > this.field_Y) {
                      L4: while (true) {
                        if (-1 >= (this.field_Y ^ -1)) {
                          break L1;
                        } else {
                          this.field_Y = this.field_Y + this.field_Z;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_Y = this.field_Y - this.field_Z;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("er.AA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    static {
        field_N = "Accept rematch";
        field_Q = "Error connecting to server. Please try using a different server.";
        field_T = "Mute this player for 48 hours";
    }
}
