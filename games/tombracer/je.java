/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends haa {
    int field_G;
    int field_K;
    static nh field_E;
    int field_H;
    Object[] field_I;
    private rla field_J;
    private il field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return;
        } else {
          L0: {
            var5 = param0 + this.field_i;
            var6 = param1 + this.field_n;
            bea.e(var5, var6, this.field_m, this.field_p, param2);
            var7 = this.field_G;
            if (0 == (this.field_H ^ -1)) {
              break L0;
            } else {
              var7 = this.field_H;
              break L0;
            }
          }
          if (this.field_I != null) {
            var8 = 0;
            L1: while (true) {
              if (var8 < this.field_I.length) {
                var9 = this.field_I[var8];
                var10 = var9.toString();
                if (var11 == 0) {
                  L2: {
                    if (var7 == var8) {
                      bea.c(2 + var5, 4 + var6, -4 + this.field_m, this.field_K, 2188450, 128);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6 = var6 + this.field_K;
                  this.field_F.c(var10, var5 + 2, var6, 10000536, -1);
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
        }
    }

    final Object d(int param0) {
        Object stackIn_5_0 = null;
        Object stackOut_3_0 = null;
        if (param0 > 113) {
          if (null != this.field_I) {
            if (this.field_G == -1) {
              return null;
            } else {
              return this.field_I[this.field_G];
            }
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return (Object) null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        var6 = 100 / ((-38 - param2) / 50);
        this.field_H = -1;
        if (!this.field_J.field_G) {
          return false;
        } else {
          if (!this.field_J.field_F.field_A.field_f) {
            return false;
          } else {
            if (this.field_I == null) {
              return super.a(param0, param1, -107, param3, param4);
            } else {
              param0 = param0 - (param1 - -this.field_i);
              param3 = param3 - (this.field_n + param4);
              if (param0 >= 0) {
                if (0 <= param3) {
                  if (param0 <= this.field_m) {
                    if (param3 <= this.field_p) {
                      this.field_H = param3 / this.field_K;
                      if (this.field_I.length <= this.field_H) {
                        this.field_H = -1;
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
          }
        }
    }

    final static iu a(byte param0) {
        int var1 = 0;
        int[] var3 = null;
        int var4_int = 0;
        iu var4 = null;
        int var5 = 0;
        byte[] var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = mq.field_b[0] * iga.field_m[0];
        var7 = ck.field_c[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= var1) {
            if (param0 == 69) {
              var4 = new iu(ika.field_a, kba.field_s, ak.field_p[0], pg.field_C[0], mq.field_b[0], iga.field_m[0], var3);
              loa.a((byte) 113);
              return var4;
            } else {
              return (iu) null;
            }
          } else {
            var3[var4_int] = mga.field_g[sea.c(255, (int) var7[var4_int])];
            var4_int++;
            if (var5 == 0) {
              continue L0;
            } else {
              var4 = new iu(ika.field_a, kba.field_s, ak.field_p[0], pg.field_C[0], mq.field_b[0], iga.field_m[0], var3);
              loa.a((byte) 113);
              return var4;
            }
          }
        }
    }

    public static void g(byte param0) {
        iu discarded$0 = null;
        field_E = null;
        if (param0 > -117) {
            discarded$0 = je.a((byte) 41);
        }
    }

    final int c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 23112) {
          L0: {
            this.field_I[10] = this.field_I[0];
            if (null == this.field_I) {
              stackOut_7_0 = 200;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = this.field_K * (1 + this.field_I.length * 2) >> 1266672129;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null == this.field_I) {
              stackOut_3_0 = 200;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = this.field_K * (1 + this.field_I.length * 2) >> 1266672129;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    private final void a(Object[] param0, int param1, int param2) {
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
            this.field_H = -1;
            if (param1 == 0) {
              L1: {
                this.field_I = param0;
                this.field_G = param2;
                if (param0 == null) {
                  break L1;
                } else {
                  L2: {
                    if ((this.field_G ^ -1) > 0) {
                      break L2;
                    } else {
                      if (this.field_G < this.field_I.length) {
                        break L1;
                      } else {
                        break L2;
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
            stackOut_8_1 = new StringBuilder().append("je.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.b(param0, param1, param2, -109);
        if (param3 <= -40) {
          param0 = param0 - this.field_n;
          param2 = param2 - this.field_i;
          if (this.field_I != null) {
            var5 = param0 / this.field_K;
            if (var5 >= 0) {
              if (var5 >= this.field_I.length) {
                return;
              } else {
                this.field_G = var5;
                this.field_J.a(99);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_I[3] = this.field_I[1];
          param0 = param0 - this.field_n;
          param2 = param2 - this.field_i;
          if (this.field_I != null) {
            var5 = param0 / this.field_K;
            if (var5 < 0) {
              return;
            } else {
              L0: {
                if (var5 < this.field_I.length) {
                  this.field_G = var5;
                  this.field_J.a(99);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    je(rla param0, il param1, Object[] param2, int param3) {
        super(param0);
        try {
            this.field_F = param1;
            this.field_J = param0;
            this.field_K = this.field_F.field_w + this.field_F.field_k;
            this.a(param2, 0, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
