/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends nv implements ut {
    static String field_p;
    private jma field_s;
    static int field_r;
    private mg field_o;
    static long[] field_q;
    static jpa field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  param1--;
                  if ((param1 ^ -1) > -1) {
                    break L3;
                  } else {
                    var9 = param4;
                    var5 = var9;
                    var6 = param0;
                    var7 = param2;
                    var9[var6] = var7 - -(sea.c(16711422, var9[var6]) >> 1535993377);
                    param0++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param3 == 1535993377) {
                  break L2;
                } else {
                  tl.a((byte) 72, -101, -90, -85, 66, 71, -106, -32);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5_ref);
            stackOut_8_1 = new StringBuilder().append("tl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_s.a(this.h((byte) 123), (byte) 76, param1);
            this.field_o.a(15637, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int c(int param0) {
        jma discarded$0 = null;
        if (param0 != 17832) {
            discarded$0 = this.k((byte) 44);
            return 5570594;
        }
        return 5570594;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          this.field_o = (mg) null;
          return this.field_s.a(86, param0);
        } else {
          return this.field_s.a(86, param0);
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_s.a((byte) 48, this.h((byte) 119));
    }

    final void a(mg param0, byte param1) {
        if (param1 >= -60) {
            return;
        }
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tl.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param0 < -32) {
          if (param1 >= pka.field_b) {
            if (ss.field_c >= param3) {
              if (gca.field_d > param2) {
                pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
                if (!TombRacer.field_G) {
                  return;
                } else {
                  rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                  return;
                }
              } else {
                if (param4 > hc.field_h) {
                  pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
                  if (!TombRacer.field_G) {
                    return;
                  } else {
                    rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                    return;
                  }
                } else {
                  rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                  return;
                }
              }
            } else {
              pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
              if (TombRacer.field_G) {
                rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                return;
              } else {
                return;
              }
            }
          } else {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            if (TombRacer.field_G) {
              rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
              return;
            } else {
              return;
            }
          }
        } else {
          field_q = (long[]) null;
          if (param1 >= pka.field_b) {
            if (ss.field_c >= param3) {
              if (gca.field_d > param2) {
                pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
                if (TombRacer.field_G) {
                  rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                  return;
                } else {
                  return;
                }
              } else {
                if (param4 > hc.field_h) {
                  pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
                  if (TombRacer.field_G) {
                    rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                    return;
                  } else {
                    return;
                  }
                } else {
                  rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                  return;
                }
              }
            } else {
              pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
              if (TombRacer.field_G) {
                rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                return;
              } else {
                return;
              }
            }
          } else {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            if (TombRacer.field_G) {
              rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
              return;
            } else {
              return;
            }
          }
        }
    }

    public final int b(int param0) {
        int var2 = -99 % ((-46 - param0) / 45);
        return this.field_o.a(false);
    }

    tl(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_s = new jma(15);
            this.field_o = new mg();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            return (jma) null;
        }
        return this.field_s;
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_s = (jma) null;
            return 21;
        }
        return 21;
    }

    public static void l(int param0) {
        field_n = null;
        field_p = null;
        field_q = null;
        if (param0 != 16711422) {
            field_q = (long[]) null;
        }
    }

    public final int j(byte param0) {
        if (param0 != -108) {
          field_p = (String) null;
          return this.field_o.a(false) - this.field_o.b(12);
        } else {
          return this.field_o.a(false) - this.field_o.b(12);
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return 116;
        }
        return 16711782;
    }

    tl(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_s = new jma(15, param0, param1);
            this.field_o = new mg(param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        int discarded$1 = 0;
        if (param0 == 5418) {
          if (this.field_s.f((byte) -56)) {
            this.c(false);
            this.field_o.d(0);
            this.field_s.a((byte) -14, this.field_o.c(0));
            return;
          } else {
            this.field_o.d(0);
            this.field_s.a((byte) -14, this.field_o.c(0));
            return;
          }
        } else {
          discarded$1 = this.b(27);
          if (!this.field_s.f((byte) -56)) {
            this.field_o.d(0);
            this.field_s.a((byte) -14, this.field_o.c(0));
            return;
          } else {
            this.c(false);
            this.field_o.d(0);
            this.field_s.a((byte) -14, this.field_o.c(0));
            return;
          }
        }
    }

    static {
        field_p = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
