/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia extends mu {
    int field_D;
    static llb field_M;
    private nva field_F;
    static String field_G;
    int field_H;
    static int[] field_J;
    static long field_C;
    Object[] field_L;
    static String field_K;
    int field_I;
    private no field_E;

    public static void a(int param0) {
        field_J = null;
        field_M = null;
        field_G = null;
        int var1 = -23 % ((-30 - param0) / 60);
        field_K = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        this.field_D = -1;
        if (!this.field_F.field_H) {
          return false;
        } else {
          if (!this.field_F.field_G.field_y.field_e) {
            return false;
          } else {
            if (this.field_L == null) {
              return super.a(param0, param1, param2, param3, (byte) 22);
            } else {
              L0: {
                param0 = param0 - (this.field_r + param3);
                param2 = param2 - (param1 - -this.field_g);
                if ((param2 ^ -1) > -1) {
                  break L0;
                } else {
                  if (0 > param0) {
                    break L0;
                  } else {
                    if (param2 > this.field_h) {
                      break L0;
                    } else {
                      if (this.field_f < param0) {
                        break L0;
                      } else {
                        L1: {
                          if (param4 == 22) {
                            break L1;
                          } else {
                            ((byte[]) (((Object[]) (this.field_L[16]))[0]))[25] = (byte) 98;
                            break L1;
                          }
                        }
                        this.field_D = param0 / this.field_I;
                        if (this.field_L.length <= this.field_D) {
                          this.field_D = -1;
                          return true;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return false;
            }
          }
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.c(param0, param1, param2, param3);
        param3 = param3 - this.field_r;
        param1 = param1 - this.field_g;
        if (!(null == this.field_L)) {
            var5 = param3 / this.field_I;
            if (var5 >= 0) {
                if (!(this.field_L.length <= var5)) {
                    this.field_H = var5;
                    this.field_F.i(21694);
                }
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = VoidHunters.field_G;
        if (param1 != 0) {
            return;
        }
        int var5 = this.field_g + param0;
        int var6 = this.field_r + param3;
        dma.d(var5, var6, this.field_h, this.field_f, 0);
        if (param2 <= 47) {
            return;
        }
        int var7 = this.field_H;
        if (-1 != this.field_D) {
            var7 = this.field_D;
        }
        if (this.field_L != null) {
            for (var8 = 0; var8 < this.field_L.length; var8++) {
                var9 = this.field_L[var8];
                var10 = var9.toString();
                if (!(var8 != var7)) {
                    dma.e(2 + var5, var6 + 4, this.field_h - 4, this.field_I, 2188450, 128);
                }
                var6 = var6 + this.field_I;
                this.field_E.c(var10, 2 + var5, var6, 10000536, -1);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2, boolean param3) {
        if (param0) {
            tia.a(-64);
        }
        return rt.c(1);
    }

    final int e(int param0) {
        if (param0 != 4) {
            this.field_E = (no) (((Object[]) (this.field_L[1]))[15]);
        }
        return null != this.field_L ? this.field_I * (1 + this.field_L.length * 2) >> 589398561 : 200;
    }

    tia(nva param0, no param1, Object[] param2, int param3) {
        super(param0);
        try {
            this.field_E = param1;
            this.field_F = param0;
            this.field_I = this.field_E.field_A + this.field_E.field_k;
            this.a(param3, 28, param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object g(byte param0) {
        Object stackIn_7_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_5_0 = null;
        L0: {
          if (param0 == 96) {
            break L0;
          } else {
            this.b(-103, 101, 5, -59);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_L) {
              break L2;
            } else {
              if (-1 != this.field_H) {
                stackOut_6_0 = this.field_L[this.field_H];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = null;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            this.field_L = param2;
            this.field_H = param0;
            this.field_D = -1;
            if (param1 == 28) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_H < -1) {
                      break L2;
                    } else {
                      if (this.field_H >= this.field_L.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  throw new IllegalStateException();
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
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("tia.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_J = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_G = "To <%0>: ";
        field_K = "OK";
    }
}
