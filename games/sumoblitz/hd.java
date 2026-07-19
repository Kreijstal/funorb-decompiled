/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ac {
    private ld field_M;
    Object[] field_K;
    static String field_I;
    static wb[] field_O;
    private vn field_P;
    static ki field_H;
    int field_J;
    int field_N;
    int field_L;

    public static void f(int param0) {
        field_I = null;
        field_H = null;
        int var1 = 84 / ((-18 - param0) / 55);
        field_O = null;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        this.field_N = -1;
        if (!this.field_M.field_A) {
          return false;
        } else {
          if (this.field_M.field_J.field_D.field_k) {
            if (null == this.field_K) {
              return super.b(param0, -1, param2, param3, param4);
            } else {
              param3 = param3 - (this.field_v + param4);
              param0 = param0 - (this.field_r + param2);
              if (param1 >= (param0 ^ -1)) {
                if (-1 >= (param3 ^ -1)) {
                  if (param0 <= this.field_q) {
                    if (param3 <= this.field_p) {
                      this.field_N = param3 / this.field_J;
                      if (this.field_K.length <= this.field_N) {
                        this.field_N = -1;
                        return true;
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
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final int e(byte param0) {
        int var2 = -28 / ((param0 - -73) / 48);
        return this.field_K == null ? 200 : (1 + this.field_K.length * 2) * this.field_J >> -1827804159;
    }

    final Object a(int param0) {
        if (param0 < -22) {
          if (null != this.field_K) {
            if (0 == (this.field_L ^ -1)) {
              return null;
            } else {
              return this.field_K[this.field_L];
            }
          } else {
            return null;
          }
        } else {
          this.a(((int[]) (this.field_K[0]))[0], ((int[]) (this.field_K[1]))[7], (byte) -89, -41);
          if (null != this.field_K) {
            if (0 == (this.field_L ^ -1)) {
              return null;
            } else {
              return this.field_K[this.field_L];
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        super.b(param0, param1, param2, param3);
        param3 = param3 - this.field_v;
        param1 = param1 - this.field_r;
        if (this.field_K != null) {
          var5 = param3 / this.field_J;
          if (var5 >= 0) {
            if (var5 >= this.field_K.length) {
              return;
            } else {
              this.field_L = var5;
              this.field_M.h(0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
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
            L1: {
              this.field_K = param2;
              this.field_N = -1;
              this.field_L = param1;
              if (param2 == null) {
                break L1;
              } else {
                L2: {
                  if (this.field_L < -1) {
                    break L2;
                  } else {
                    if (this.field_K.length > this.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            if (param0 == -22994) {
              break L0;
            } else {
              this.field_N = ((int[]) (this.field_K[1]))[1];
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("hd.DB(").append(param0).append(',').append(param1).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        String var17 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 0) {
          if (param2 < -35) {
            L0: {
              var5 = param0 - -this.field_r;
              var6 = param1 - -this.field_v;
              lk.d(var5, var6, this.field_q, this.field_p, 0);
              var7 = this.field_L;
              if (-1 != this.field_N) {
                var7 = this.field_N;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_K != null) {
              var8 = 0;
              L1: while (true) {
                if (this.field_K.length > var8) {
                  var16 = this.field_K[var8];
                  var17 = var16.toString();
                  if (var11 == 0) {
                    L2: {
                      if (var7 != var8) {
                        break L2;
                      } else {
                        lk.b(2 + var5, var6 + 4, -4 + this.field_q, this.field_J, 2188450, 128);
                        break L2;
                      }
                    }
                    var6 = var6 + this.field_J;
                    this.field_P.b(var17, 2 + var5, var6, 10000536, -1);
                    var8++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L3: {
              this.b(56, -9, false, ((int[]) (this.field_K[0]))[2]);
              var5 = param0 - -this.field_r;
              var6 = param1 - -this.field_v;
              lk.d(var5, var6, this.field_q, this.field_p, 0);
              var7 = this.field_L;
              if (-1 != this.field_N) {
                var7 = this.field_N;
                break L3;
              } else {
                break L3;
              }
            }
            if (this.field_K != null) {
              var8 = 0;
              L4: while (true) {
                if (this.field_K.length > var8) {
                  var14 = this.field_K[var8];
                  var15 = var14.toString();
                  if (var11 == 0) {
                    L5: {
                      if (var7 != var8) {
                        break L5;
                      } else {
                        lk.b(2 + var5, var6 + 4, -4 + this.field_q, this.field_J, 2188450, 128);
                        break L5;
                      }
                    }
                    var6 = var6 + this.field_J;
                    this.field_P.b(var15, 2 + var5, var6, 10000536, -1);
                    var8++;
                    continue L4;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    hd(ld param0, vn param1, Object[] param2, int param3) {
        super(param0);
        try {
            this.field_M = param0;
            this.field_P = param1;
            this.field_J = this.field_P.field_I + this.field_P.field_s;
            this.a(-22994, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_I = "regular";
    }
}
