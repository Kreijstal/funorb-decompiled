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
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var10 = vc.field_q;
                var2 = var10.h(255);
                var3 = var10.h(param0 + 255);
                if (var2 == param0) {
                  break L2;
                } else {
                  L3: {
                    if (-2 == (var2 ^ -1)) {
                      break L3;
                    } else {
                      ssa.a("LR1: " + kk.a(32), (byte) 122, (Throwable) null);
                      dea.a(60);
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int = var10.f((byte) -128);
                  var5_ref_toa = (toa) ((Object) vsa.field_m.f(-80));
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var5_ref_toa == null) {
                          break L6;
                        } else {
                          stackOut_7_0 = var5_ref_toa.field_i;
                          stackIn_15_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (stackIn_8_0 != var3) {
                                break L7;
                              } else {
                                if (var4_int != var5_ref_toa.field_k) {
                                  break L7;
                                } else {
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var5_ref_toa = (toa) ((Object) vsa.field_m.e(param0 + 123));
                            if (var8 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (var5_ref_toa != null) {
                        var5_ref_toa.p(103);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_14_0 = 60;
                        stackIn_15_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    dea.a(stackIn_15_0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var4 = (ik) ((Object) hca.field_I.f(param0 ^ -80));
              if (var4 != null) {
                L8: {
                  var5 = -var10.field_h + uca.field_d;
                  var12 = var4.field_i;
                  var11 = var12;
                  var6 = var11;
                  if (var12.length << -252696222 < var5) {
                    var5 = var12.length << -1623616606;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var7 = 0;
                L9: while (true) {
                  if (var5 <= var7) {
                    var4.p(param0 + 79);
                    break L1;
                  } else {
                    var6[var7 >> 1081665090] = var6[var7 >> 1081665090] + (var10.h(255) << sea.c(768, var7 << -1545692536));
                    var7++;
                    if (var8 != 0) {
                      break L1;
                    } else {
                      continue L9;
                    }
                  }
                }
              } else {
                dea.a(60);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "iv.F(" + param0 + ')');
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

    private final void a(int param0, int param1, byte param2) {
        this.field_vb.field_G = -param1 + this.field_G - param0;
        this.field_tb.field_qb = 0;
        this.field_vb.field_t = this.field_t;
        this.field_tb.field_G = -param1 + this.field_G - param0;
        int var4 = 127 % ((84 - param2) / 41);
        this.field_wb.a(this.field_tb.field_t, -this.field_tb.field_T, param0, false, this.field_G + -param0, this.field_t, this.field_vb.field_t, 0);
    }

    iv(long param0, jea param1, jea param2, oj param3) {
        super(param0, (jea) null);
        try {
            this.field_vb = new jea(0L, param2);
            this.field_wb = new oj(0L, param3);
            this.b(-123, this.field_vb);
            this.b(-128, this.field_wb);
            this.field_tb = param1;
            this.field_vb.b(-122, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "iv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4) {
        int var6 = 0;
        L0: {
          if (this.field_wb.e((byte) -115)) {
            this.field_tb.field_K = this.field_tb.field_K + param3;
            break L0;
          } else {
            break L0;
          }
        }
        if (!this.field_wb.d((byte) 40)) {
          L1: {
            if (this.field_wb.f(-1)) {
              this.field_tb.field_K = this.field_tb.field_K + param2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_wb.g(-101)) {
              this.field_tb.field_K = this.field_tb.field_K - param2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var6 = -87 / ((67 - param4) / 45);
            if (this.field_o) {
              this.field_tb.field_K = this.field_tb.field_K - param0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1) {
              L5: {
                if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) > -1) {
                  this.field_tb.field_K = -this.field_tb.field_T;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (-(this.field_tb.field_K + this.field_tb.field_T) <= -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
                break L4;
              } else {
                this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) + -this.field_tb.field_T;
                if (this.field_wb.h(-1)) {
                  this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                  this.field_tb.field_K = 0;
                  this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                  return;
                } else {
                  this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                  return;
                }
              }
            } else {
              if (this.field_tb.field_O + this.field_tb.field_t - this.field_vb.field_t >= -(this.field_tb.field_K + this.field_tb.field_T)) {
                if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) <= -1) {
                  break L4;
                } else {
                  this.field_tb.field_K = -this.field_tb.field_T;
                  if (!TombRacer.field_G) {
                    break L4;
                  } else {
                    L6: {
                      if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) > -1) {
                        this.field_tb.field_K = -this.field_tb.field_T;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (-(this.field_tb.field_K + this.field_tb.field_T) <= -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
                      if (this.field_wb.h(-1)) {
                        this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                        this.field_tb.field_K = 0;
                        this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                        return;
                      } else {
                        this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                        return;
                      }
                    } else {
                      L7: {
                        this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) + -this.field_tb.field_T;
                        if (!this.field_wb.h(-1)) {
                          break L7;
                        } else {
                          this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                          this.field_tb.field_K = 0;
                          break L7;
                        }
                      }
                      this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                      return;
                    }
                  }
                }
              } else {
                this.field_tb.field_K = -(-this.field_vb.field_t + (this.field_tb.field_t - -this.field_tb.field_O)) + -this.field_tb.field_T;
                if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) > -1) {
                  this.field_tb.field_K = -this.field_tb.field_T;
                  if (TombRacer.field_G) {
                    L8: {
                      if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) > -1) {
                        this.field_tb.field_K = -this.field_tb.field_T;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (-(this.field_tb.field_K + this.field_tb.field_T) <= -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
                      if (this.field_wb.h(-1)) {
                        this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                        this.field_tb.field_K = 0;
                        this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                        return;
                      } else {
                        this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                        return;
                      }
                    } else {
                      L9: {
                        this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) + -this.field_tb.field_T;
                        if (!this.field_wb.h(-1)) {
                          break L9;
                        } else {
                          this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                          this.field_tb.field_K = 0;
                          break L9;
                        }
                      }
                      this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                      return;
                    }
                  } else {
                    L10: {
                      if (!this.field_wb.h(-1)) {
                        break L10;
                      } else {
                        this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                        this.field_tb.field_K = 0;
                        break L10;
                      }
                    }
                    this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                    return;
                  }
                } else {
                  L11: {
                    if (!this.field_wb.h(-1)) {
                      break L11;
                    } else {
                      this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
                      this.field_tb.field_K = 0;
                      break L11;
                    }
                  }
                  this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
                  return;
                }
              }
            }
          }
          if (this.field_wb.h(-1)) {
            this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
            this.field_tb.field_K = 0;
            this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
            return;
          } else {
            this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
            return;
          }
        } else {
          L12: {
            this.field_tb.field_K = this.field_tb.field_K - param3;
            if (this.field_wb.f(-1)) {
              this.field_tb.field_K = this.field_tb.field_K + param2;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (this.field_wb.g(-101)) {
              this.field_tb.field_K = this.field_tb.field_K - param2;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var6 = -87 / ((67 - param4) / 45);
            if (this.field_o) {
              this.field_tb.field_K = this.field_tb.field_K - param0;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            L16: {
              if (param1) {
                break L16;
              } else {
                L17: {
                  if (this.field_tb.field_O + this.field_tb.field_t - this.field_vb.field_t >= -(this.field_tb.field_K + this.field_tb.field_T)) {
                    break L17;
                  } else {
                    this.field_tb.field_K = -(-this.field_vb.field_t + (this.field_tb.field_t - -this.field_tb.field_O)) + -this.field_tb.field_T;
                    break L17;
                  }
                }
                if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) <= -1) {
                  break L15;
                } else {
                  this.field_tb.field_K = -this.field_tb.field_T;
                  if (!TombRacer.field_G) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
            }
            L18: {
              if ((-(this.field_tb.field_K + this.field_tb.field_T) ^ -1) > -1) {
                this.field_tb.field_K = -this.field_tb.field_T;
                break L18;
              } else {
                break L18;
              }
            }
            if (-(this.field_tb.field_K + this.field_tb.field_T) <= -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
              break L15;
            } else {
              this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) + -this.field_tb.field_T;
              break L15;
            }
          }
          L19: {
            if (!this.field_wb.h(-1)) {
              break L19;
            } else {
              this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
              this.field_tb.field_K = 0;
              break L19;
            }
          }
          this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
          return;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var8 = 0;
        if (param0) {
          var8 = 1;
          this.field_tb.a(var8 != 0, param2, 120, this.field_vb.field_t);
          this.a(param1, false, param3, param4, (byte) 114);
          if (!param6) {
            return false;
          } else {
            return var8 != 0;
          }
        } else {
          if (this.field_o) {
            if (!param5) {
              var8 = 1;
              this.field_tb.a(var8 != 0, param2, 120, this.field_vb.field_t);
              this.a(param1, false, param3, param4, (byte) 114);
              if (!param6) {
                return false;
              } else {
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_tb.a(var8 != 0, param2, 120, this.field_vb.field_t);
              this.a(param1, false, param3, param4, (byte) 114);
              if (!param6) {
                return false;
              } else {
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            this.field_tb.a(var8 != 0, param2, 120, this.field_vb.field_t);
            this.a(param1, false, param3, param4, (byte) 114);
            if (!param6) {
              return false;
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 != 127) {
          field_ub = 74;
          this.field_qb = param3;
          this.field_t = param5;
          this.field_G = param0;
          this.field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        } else {
          this.field_qb = param3;
          this.field_t = param5;
          this.field_G = param0;
          this.field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param2 <= 68) {
            return true;
        }
        return this.a(param5, param3, param0, this.field_vb.field_t, param4, param1, true);
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        this.a(param2, param0, this.field_vb.field_t, param3, (byte) 117);
        if (param1 != 0) {
            discarded$0 = this.a(false, -87, -125, 47, 100, false, true);
        }
    }

    static {
    }
}
