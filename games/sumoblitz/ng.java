/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ng extends rq {
    private ef[] field_i;
    static hr[] field_f;
    private boolean field_h;
    private boolean field_g;
    static String field_e;

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) -83, lf.field_e, vi.field_v);
        if (param1 > -71) {
            this.field_i = (ef[]) null;
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            return true;
        }
        return true;
    }

    final static void e(int param0) {
        if (param0 > -9) {
            return;
        }
        jp.b((byte) 126);
    }

    final void c(boolean param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
          L0: {
            if (!this.field_h) {
              break L0;
            } else {
              this.field_b.g(1, -109);
              this.field_b.a((ed) null, 102);
              this.field_b.a(13754, lf.field_c);
              this.field_b.l(0);
              if (!this.field_g) {
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.g(2, -117);
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.a(ta.field_a, 1, 0);
                this.field_b.a(jq.field_a, 0, true);
                this.field_b.a((ed) null, 110);
                this.field_b.g(0, -126);
                this.field_h = false;
                if (var3 == 0) {
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  return;
                } else {
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  return;
                }
              } else {
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.a(jq.field_a, 0, true);
                if (var3 == 0) {
                  this.field_b.g(0, -126);
                  this.field_h = false;
                  if (var3 == 0) {
                    this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                    return;
                  } else {
                    break L0;
                  }
                } else {
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  this.field_b.a(jq.field_a, 0, 0);
                  this.field_b.g(2, -117);
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  this.field_b.a(jq.field_a, 0, 0);
                  this.field_b.a(ta.field_a, 1, 0);
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_b.a((ed) null, 110);
                  this.field_b.g(0, -126);
                  this.field_h = false;
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  return;
                }
              }
            }
          }
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.a((byte) -83, vi.field_v, vi.field_v);
          return;
        } else {
          L1: {
            this.a(114, 98, -46);
            if (!this.field_h) {
              break L1;
            } else {
              this.field_b.g(1, -109);
              this.field_b.a((ed) null, 102);
              this.field_b.a(13754, lf.field_c);
              this.field_b.l(0);
              if (this.field_g) {
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.a(jq.field_a, 0, true);
                if (var3 != 0) {
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  this.field_b.a(jq.field_a, 0, 0);
                  this.field_b.g(2, -117);
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  this.field_b.a(jq.field_a, 0, 0);
                  this.field_b.a(ta.field_a, 1, 0);
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_b.a((ed) null, 110);
                  this.field_b.g(0, -126);
                  this.field_h = false;
                  if (var3 == 0) {
                    this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                    return;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_b.g(0, -126);
                  this.field_h = false;
                  if (var3 == 0) {
                    this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                    return;
                  } else {
                    this.field_b.a(jq.field_a, 0, true);
                    this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                    return;
                  }
                }
              } else {
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.g(2, -117);
                this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.a(ta.field_a, 1, 0);
                this.field_b.a(jq.field_a, 0, true);
                this.field_b.a((ed) null, 110);
                this.field_b.g(0, -126);
                this.field_h = false;
                if (var3 == 0) {
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  return;
                } else {
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_b.a((byte) -83, vi.field_v, vi.field_v);
                  return;
                }
              }
            }
          }
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.a((byte) -83, vi.field_v, vi.field_v);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          return;
        } else {
          L0: {
            if (!this.field_h) {
              break L0;
            } else {
              this.field_b.g(1, -122);
              this.field_b.a(this.field_i[-1 + param2], 93);
              this.field_b.g(0, -119);
              break L0;
            }
          }
          return;
        }
    }

    final static ki a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            Object var7 = null;
            Object var8 = null;
            am var9 = null;
            ki stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_10_0 = null;
            try {
              L0: {
                L1: {
                  var6_int = 100 % ((param1 - -29) / 42);
                  var7 = null;
                  if (gk.field_u.field_l == null) {
                    break L1;
                  } else {
                    bc.field_a = new gj(gk.field_u.field_l, 5200, 0);
                    gk.field_u.field_l = null;
                    var7 = new wl(255, bc.field_a, new gj(gk.field_u.field_d, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var8 = null;
                  if (null == bc.field_a) {
                    break L2;
                  } else {
                    L3: {
                      if (null != m.field_O) {
                        break L3;
                      } else {
                        m.field_O = new gj[gk.field_u.field_i.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (m.field_O[param3] != null) {
                        break L4;
                      } else {
                        m.field_O[param3] = new gj(gk.field_u.field_i[param3], 12000, 0);
                        gk.field_u.field_i[param3] = null;
                        break L4;
                      }
                    }
                    var8 = new wl(param3, bc.field_a, m.field_O[param3], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var9 = wt.field_i.a(false, param3, (wl) (var7), param5, (wl) (var8));
                  if (!param4) {
                    break L5;
                  } else {
                    var9.c((byte) -81);
                    break L5;
                  }
                }
                stackOut_10_0 = new ki(var9, param2, param0);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var6.toString());
            }
            return stackIn_11_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
            return;
        }
        try {
            this.field_b.a(param2, 125);
            this.field_b.h(84, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ng(aw param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var17 = Sumoblitz.field_L ? 1 : 0;
        this.field_h = false;
        try {
          L0: {
            if (param0.field_W) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if ((param0.field_cc ^ -1) <= -4) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((ng) (this)).field_g = stackIn_6_1 != 0;
                if (!this.field_g) {
                  stackOut_8_0 = 127;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 48;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var2_int = stackIn_9_0;
              var29 = new int[6][4096];
              var27 = new int[6][4096];
              var28 = new int[6][4096];
              var9 = 0;
              var14 = 0;
              L3: while (true) {
                stackOut_10_0 = var14 ^ -1;
                stackIn_11_0 = stackOut_10_0;
                L4: while (true) {
                  L5: {
                    if (stackIn_11_0 <= -65) {
                      this.field_i = new ef[3];
                      this.field_i[0] = this.field_b.a(64, (byte) -105, var27, false);
                      this.field_i[1] = this.field_b.a(64, (byte) -84, var28, false);
                      break L5;
                    } else {
                      if (var17 != 0) {
                        break L5;
                      } else {
                        var15 = 0;
                        L6: while (true) {
                          stackOut_14_0 = var15;
                          stackIn_15_0 = stackOut_14_0;
                          L7: while (true) {
                            if (stackIn_15_0 >= 64) {
                              var14++;
                              continue L3;
                            } else {
                              var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                              var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                              var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                              var11 = var11 * var13;
                              var12 = var12 * var13;
                              stackOut_16_0 = 0;
                              stackIn_11_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var17 != 0) {
                                continue L4;
                              } else {
                                var16 = stackIn_17_0;
                                L8: while (true) {
                                  if (var16 >= 6) {
                                    var9++;
                                    var15++;
                                    continue L6;
                                  } else {
                                    stackOut_19_0 = var16;
                                    stackIn_15_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (var17 != 0) {
                                      continue L7;
                                    } else {
                                      L9: {
                                        L10: {
                                          if (stackIn_20_0 != 0) {
                                            break L10;
                                          } else {
                                            var10 = -var11;
                                            if (var17 == 0) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (1 != var16) {
                                            break L11;
                                          } else {
                                            var10 = var11;
                                            if (var17 == 0) {
                                              break L9;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (-3 == (var16 ^ -1)) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (var16 == 3) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if (var16 != 4) {
                                                    break L14;
                                                  } else {
                                                    var10 = var13;
                                                    if (var17 == 0) {
                                                      break L9;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                var10 = -var13;
                                                if (var17 == 0) {
                                                  break L9;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var10 = -var12;
                                            if (var17 == 0) {
                                              break L9;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var10 = var12;
                                        break L9;
                                      }
                                      L15: {
                                        L16: {
                                          if (var10 > 0.0f) {
                                            break L16;
                                          } else {
                                            var8 = 0;
                                            var7 = 0;
                                            var6 = 0;
                                            if (var17 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                        var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                                        var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                        break L15;
                                      }
                                      var27[var16][var9] = var6 << -36905544;
                                      var28[var16][var9] = var7 << -1061053576;
                                      var29[var16][var9] = var8 << -108557352;
                                      var16++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_i[2] = this.field_b.a(64, (byte) 122, var29, false);
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var2);
            stackOut_40_1 = new StringBuilder().append("ng.<init>(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L17;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int var4 = 0;
        ed var5 = null;
        ut var6 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_i == null) {
          this.field_b.a(fv.field_y, 0, true);
          if (param1 != 20186) {
            var5 = (ed) null;
            this.a(105, 46, (ed) null);
            return;
          } else {
            return;
          }
        } else {
          if (!param0) {
            this.field_b.a(fv.field_y, 0, true);
            if (param1 != 20186) {
              var5 = (ed) null;
              this.a(105, 46, (ed) null);
              return;
            } else {
              return;
            }
          } else {
            this.field_b.g(1, -118);
            this.field_b.a(param1 ^ 31584, nl.field_n);
            var6 = this.field_b.B(0);
            var6.a((byte) 79, 1024);
            this.field_b.a(ip.field_y, 28880);
            if (!this.field_g) {
              this.field_b.a((byte) -83, vi.field_v, lf.field_e);
              this.field_b.a(ta.field_a, 0, param1 ^ 20186);
              this.field_b.g(2, param1 + -20295);
              this.field_b.a((byte) -83, lf.field_e, cv.field_F);
              this.field_b.a(ta.field_a, 0, 0);
              this.field_b.a((byte) 102, 1, true, false, ta.field_a);
              this.field_b.a(fv.field_y, 0, true);
              this.field_b.a(this.field_b.field_D, param1 + -20079);
              this.field_b.g(0, -113);
              this.field_h = true;
              if (var4 == 0) {
                if (param1 != 20186) {
                  var5 = (ed) null;
                  this.a(105, 46, (ed) null);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_b.a(fv.field_y, 0, true);
                if (param1 != 20186) {
                  var5 = (ed) null;
                  this.a(105, 46, (ed) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_b.a((byte) -83, lf.field_e, cv.field_F);
              this.field_b.a((byte) -66, 0, true, false, jq.field_a);
              this.field_b.a(fv.field_y, 0, true);
              if (var4 == 0) {
                this.field_b.g(0, -113);
                this.field_h = true;
                if (var4 == 0) {
                  if (param1 != 20186) {
                    var5 = (ed) null;
                    this.a(105, 46, (ed) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_b.a(fv.field_y, 0, true);
                  if (param1 != 20186) {
                    var5 = (ed) null;
                    this.a(105, 46, (ed) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_b.a((byte) -83, vi.field_v, lf.field_e);
                this.field_b.a(ta.field_a, 0, param1 ^ 20186);
                this.field_b.g(2, param1 + -20295);
                this.field_b.a((byte) -83, lf.field_e, cv.field_F);
                this.field_b.a(ta.field_a, 0, 0);
                this.field_b.a((byte) 102, 1, true, false, ta.field_a);
                this.field_b.a(fv.field_y, 0, true);
                this.field_b.a(this.field_b.field_D, param1 + -20079);
                this.field_b.g(0, -113);
                this.field_h = true;
                if (var4 != 0) {
                  this.field_b.a(fv.field_y, 0, true);
                  if (param1 == 20186) {
                    return;
                  } else {
                    var5 = (ed) null;
                    this.a(105, 46, (ed) null);
                    return;
                  }
                } else {
                  if (param1 != 20186) {
                    var5 = (ed) null;
                    this.a(105, 46, (ed) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_e = "No highscores";
    }
}
