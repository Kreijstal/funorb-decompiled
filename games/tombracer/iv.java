/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iv extends jea {
    static int field_ub;
    jea field_tb;
    jea field_vb;
    oj field_wb;

    final static void f(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ik var4 = null;
        int var4_int = 0;
        int var5 = 0;
        toa var5_ref_toa = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        kh var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = vc.field_q;
              var2 = var10.h(255);
              var3 = var10.h(255);
              if (var2 == 0) {
                var4 = (ik) (Object) hca.field_I.f(-80);
                if (var4 != null) {
                  L2: {
                    var5 = -var10.field_h + uca.field_d;
                    var14 = var4.field_i;
                    var13 = var14;
                    var12 = var13;
                    var11 = var12;
                    var6 = var11;
                    if (var14.length << 2 < var5) {
                      var5 = var14.length << 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.p(79);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var10.h(255) << sea.c(768, var7 << 8));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  dea.a(60);
                  return;
                }
              } else {
                if (var2 == 1) {
                  var4_int = var10.f((byte) -128);
                  var5_ref_toa = (toa) (Object) vsa.field_m.f(-80);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_toa == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_toa.field_i != var3) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_toa.field_k) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_toa = (toa) (Object) vsa.field_m.e(123);
                        continue L4;
                      }
                    }
                    if (var5_ref_toa != null) {
                      var5_ref_toa.p(103);
                      break L1;
                    } else {
                      dea.a(60);
                      return;
                    }
                  }
                } else {
                  ssa.a("LR1: " + kk.a(32), (byte) 122, (Throwable) null);
                  dea.a(60);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "iv.F(" + 0 + 41);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        ((iv) this).field_vb.field_G = -param1 + ((iv) this).field_G - param0;
        ((iv) this).field_tb.field_qb = 0;
        ((iv) this).field_vb.field_t = ((iv) this).field_t;
        ((iv) this).field_tb.field_G = -param1 + ((iv) this).field_G - param0;
        int var4 = 0;
        ((iv) this).field_wb.a(((iv) this).field_tb.field_t, -((iv) this).field_tb.field_T, param0, false, ((iv) this).field_G + -param0, ((iv) this).field_t, ((iv) this).field_vb.field_t, 0);
    }

    iv(long param0, jea param1, jea param2, oj param3) {
        super(param0, (jea) null);
        try {
            ((iv) this).field_vb = new jea(0L, param2);
            ((iv) this).field_wb = new oj(0L, param3);
            ((iv) this).b(-123, ((iv) this).field_vb);
            ((iv) this).b(-128, (jea) (Object) ((iv) this).field_wb);
            ((iv) this).field_tb = param1;
            ((iv) this).field_vb.b(-122, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "iv.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4) {
        int var6 = 0;
        L0: {
          if (((iv) this).field_wb.e((byte) -115)) {
            ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K + param3;
            break L0;
          } else {
            break L0;
          }
        }
        if (!((iv) this).field_wb.d((byte) 40)) {
          L1: {
            if (((iv) this).field_wb.f(-1)) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K + param2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((iv) this).field_wb.g(-101)) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K - param2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var6 = -87 / ((67 - param4) / 45);
            if (((iv) this).field_o) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K - param0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1) {
              L5: {
                if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) < 0) {
                  ((iv) this).field_tb.field_K = -((iv) this).field_tb.field_T;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) <= -((iv) this).field_vb.field_t + ((iv) this).field_tb.field_O + ((iv) this).field_tb.field_t) {
                break L4;
              } else {
                ((iv) this).field_tb.field_K = -(((iv) this).field_tb.field_O + (((iv) this).field_tb.field_t - ((iv) this).field_vb.field_t)) + -((iv) this).field_tb.field_T;
                if (((iv) this).field_wb.h(-1)) {
                  ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                  ((iv) this).field_tb.field_K = 0;
                  ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                  return;
                } else {
                  ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                  return;
                }
              }
            } else {
              if (((iv) this).field_tb.field_O + ((iv) this).field_tb.field_t - ((iv) this).field_vb.field_t >= -(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T)) {
                if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) >= 0) {
                  break L4;
                } else {
                  ((iv) this).field_tb.field_K = -((iv) this).field_tb.field_T;
                  if (((iv) this).field_wb.h(-1)) {
                    ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                    ((iv) this).field_tb.field_K = 0;
                    ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                    return;
                  } else {
                    ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                    return;
                  }
                }
              } else {
                ((iv) this).field_tb.field_K = -(-((iv) this).field_vb.field_t + (((iv) this).field_tb.field_t - -((iv) this).field_tb.field_O)) + -((iv) this).field_tb.field_T;
                if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) >= 0) {
                  if (((iv) this).field_wb.h(-1)) {
                    ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                    ((iv) this).field_tb.field_K = 0;
                    ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                    return;
                  } else {
                    ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                    return;
                  }
                } else {
                  L6: {
                    ((iv) this).field_tb.field_K = -((iv) this).field_tb.field_T;
                    if (!((iv) this).field_wb.h(-1)) {
                      break L6;
                    } else {
                      ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                      ((iv) this).field_tb.field_K = 0;
                      break L6;
                    }
                  }
                  ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                  return;
                }
              }
            }
          }
          if (((iv) this).field_wb.h(-1)) {
            ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
            ((iv) this).field_tb.field_K = 0;
            ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
            return;
          } else {
            ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
            return;
          }
        } else {
          L7: {
            ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K - param3;
            if (((iv) this).field_wb.f(-1)) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K + param2;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (((iv) this).field_wb.g(-101)) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K - param2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var6 = -87 / ((67 - param4) / 45);
            if (((iv) this).field_o) {
              ((iv) this).field_tb.field_K = ((iv) this).field_tb.field_K - param0;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1) {
              L11: {
                if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) < 0) {
                  ((iv) this).field_tb.field_K = -((iv) this).field_tb.field_T;
                  break L11;
                } else {
                  break L11;
                }
              }
              if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) > -((iv) this).field_vb.field_t + ((iv) this).field_tb.field_O + ((iv) this).field_tb.field_t) {
                ((iv) this).field_tb.field_K = -(((iv) this).field_tb.field_O + (((iv) this).field_tb.field_t - ((iv) this).field_vb.field_t)) + -((iv) this).field_tb.field_T;
                break L10;
              } else {
                L12: {
                  if (!((iv) this).field_wb.h(-1)) {
                    break L12;
                  } else {
                    ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                    ((iv) this).field_tb.field_K = 0;
                    break L12;
                  }
                }
                ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                return;
              }
            } else {
              L13: {
                if (((iv) this).field_tb.field_O + ((iv) this).field_tb.field_t - ((iv) this).field_vb.field_t >= -(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T)) {
                  break L13;
                } else {
                  ((iv) this).field_tb.field_K = -(-((iv) this).field_vb.field_t + (((iv) this).field_tb.field_t - -((iv) this).field_tb.field_O)) + -((iv) this).field_tb.field_T;
                  break L13;
                }
              }
              if (-(((iv) this).field_tb.field_K + ((iv) this).field_tb.field_T) < 0) {
                ((iv) this).field_tb.field_K = -((iv) this).field_tb.field_T;
                break L10;
              } else {
                L14: {
                  if (!((iv) this).field_wb.h(-1)) {
                    break L14;
                  } else {
                    ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
                    ((iv) this).field_tb.field_K = 0;
                    break L14;
                  }
                }
                ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
                return;
              }
            }
          }
          if (((iv) this).field_wb.h(-1)) {
            ((iv) this).field_tb.field_T = -((iv) this).field_wb.a(param1, (byte) 108, ((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t);
            ((iv) this).field_tb.field_K = 0;
            ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
            return;
          } else {
            ((iv) this).field_wb.a(((iv) this).field_vb.field_t, ((iv) this).field_tb.field_t, (byte) -74, -((iv) this).field_tb.field_T);
            return;
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var8 = 0;
        if (!param0) {
          if (((iv) this).field_o) {
            if (param5) {
              var8 = 0;
              ((iv) this).field_tb.a(var8 != 0, param2, 120, ((iv) this).field_vb.field_t);
              this.a(param1, false, param3, param4, (byte) 114);
              return var8 != 0;
            } else {
              var8 = 1;
              ((iv) this).field_tb.a(var8 != 0, param2, 120, ((iv) this).field_vb.field_t);
              this.a(param1, false, param3, param4, (byte) 114);
              return var8 != 0;
            }
          } else {
            var8 = 0;
            ((iv) this).field_tb.a(var8 != 0, param2, 120, ((iv) this).field_vb.field_t);
            this.a(param1, false, param3, param4, (byte) 114);
            return var8 != 0;
          }
        } else {
          var8 = 1;
          ((iv) this).field_tb.a(var8 != 0, param2, 120, ((iv) this).field_vb.field_t);
          this.a(param1, false, param3, param4, (byte) 114);
          return var8 != 0;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 != 127) {
          field_ub = 74;
          ((iv) this).field_qb = param3;
          ((iv) this).field_t = param5;
          ((iv) this).field_G = param0;
          ((iv) this).field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        } else {
          ((iv) this).field_qb = param3;
          ((iv) this).field_t = param5;
          ((iv) this).field_G = param0;
          ((iv) this).field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param2 <= 68) {
            return true;
        }
        return this.a(param5, param3, param0, ((iv) this).field_vb.field_t, param4, param1, true);
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        this.a(param2, param0, ((iv) this).field_vb.field_t, param3, (byte) 117);
        if (param1 != 0) {
            boolean discarded$0 = this.a(false, -87, -125, 47, 100, false, true);
        }
    }

    static {
    }
}
