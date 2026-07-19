/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class oc extends nm {
    int field_r;
    ep field_j;
    static jg field_k;
    int field_n;
    int field_s;
    static String[] field_v;
    boolean field_q;
    String field_A;
    int field_t;
    static dh field_m;
    static long field_p;
    static String field_u;
    int field_o;
    ub field_l;
    static int[] field_y;
    static jp field_x;
    int field_B;
    uh field_i;
    String field_z;
    int field_w;

    final void e(int param0) {
        if (param0 != 1) {
            return;
        }
        this.a(this.field_s, this.field_o, this.field_w, (byte) -119, this.field_t);
    }

    void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_n = 0;
              if (param4 == 19223) {
                break L1;
              } else {
                field_y = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        this.field_s = param0;
        if (param3 != -119) {
          this.a(28, 90, 95, (byte) 89, -101);
          this.field_t = param4;
          this.field_w = param2;
          this.field_o = param1;
          return;
        } else {
          this.field_t = param4;
          this.field_w = param2;
          this.field_o = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.e((byte) -79);
        var5_int = param2;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              this.a(param1, param0, var5_int, (byte) -11);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = of.d((byte) 63);
          if (var5 != null) {
            bj.field_T.a(true, ad.field_j, b.field_a, var5);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, j param3, ak param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        try {
          L0: {
            L1: {
              if ((param4.field_k ^ -1) == -2) {
                if (r.field_A) {
                  if (ka.a((byte) 88)) {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_8_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_8_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6_int = stackIn_8_0;
                stackOut_8_0 = var6_int;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (8 == ga.field_i) {
                  break L3;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (-10 != (ga.field_i ^ -1)) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L2;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  }
                }
              }
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = 1;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L2;
            }
            L4: {
              var6_int = stackIn_13_0 & stackIn_13_1;
              var7 = de.field_x - mn.field_v;
              gg.field_p[param1].c(param2, param0);
              if (var6_int != 0) {
                gg.field_p[param1].f(param2, param0, 64 + (sa.a(200 * var7, -4097) >> 227858442));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              param2 += 7;
              param0--;
              var8 = ol.field_r.field_D + param2 - 5;
              lb.g(var8, param0 + 1, 4, ol.field_r.field_C - 2, 16777215);
              if (param5 > 106) {
                break L5;
              } else {
                oc.a(120, (dh) null);
                break L5;
              }
            }
            L6: {
              var9 = param3.field_cb[param1] >> 1595637992;
              var10 = ol.field_r.field_C + (param0 - 1);
              if (-1 <= (var9 ^ -1)) {
                break L6;
              } else {
                L7: {
                  if (-4 <= (var9 ^ -1)) {
                    stackOut_21_0 = var9;
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = 3;
                    stackIn_22_0 = stackOut_20_0;
                    break L7;
                  }
                }
                var11 = stackIn_22_0;
                lb.g(var8, var10 - var11, 4, var11, 16735667);
                var10 -= 3;
                break L6;
              }
            }
            L8: {
              if (-4 <= (var9 ^ -1)) {
                break L8;
              } else {
                L9: {
                  if (-8 > (var9 ^ -1)) {
                    stackOut_26_0 = 4;
                    stackIn_27_0 = stackOut_26_0;
                    break L9;
                  } else {
                    stackOut_25_0 = -3 + var9;
                    stackIn_27_0 = stackOut_25_0;
                    break L9;
                  }
                }
                var11 = stackIn_27_0;
                lb.g(var8, -var11 + var10, 4, var11, 15876234);
                var10 -= 4;
                break L8;
              }
            }
            L10: {
              if (7 >= var9) {
                break L10;
              } else {
                L11: {
                  if ((var9 ^ -1) < -14) {
                    stackOut_31_0 = 6;
                    stackIn_32_0 = stackOut_31_0;
                    break L11;
                  } else {
                    stackOut_30_0 = -7 + var9;
                    stackIn_32_0 = stackOut_30_0;
                    break L11;
                  }
                }
                var11 = stackIn_32_0;
                lb.g(var8, -var11 + var10, 4, var11, 15410040);
                var10 -= 6;
                break L10;
              }
            }
            L12: {
              if ((var9 ^ -1) < -14) {
                L13: {
                  if (-21 <= (var9 ^ -1)) {
                    stackOut_37_0 = -13 + var9;
                    stackIn_38_0 = stackOut_37_0;
                    break L13;
                  } else {
                    stackOut_36_0 = 7;
                    stackIn_38_0 = stackOut_36_0;
                    break L13;
                  }
                }
                var11 = stackIn_38_0;
                lb.g(var8, var10 - var11, 4, var11, 13245286);
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (-21 >= (var9 ^ -1)) {
                lb.d(var8, param0 - -ol.field_r.field_C - 21, 4, 20, 16777215, (sa.a(200 * de.field_x, -4097) >> 1458751562) + 64);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              ol.field_r.c(param2, param0);
              if (var6_int != 0) {
                ol.field_r.f(param2, param0, (sa.a(400 * var7, -4097) >> -23391286) + 64);
                break L15;
              } else {
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var6);
            stackOut_46_1 = new StringBuilder().append("oc.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L16;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L16;
            }
          }
          L17: {
            stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), 24, new StringBuilder()).toString();
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dn var8 = null;
        dn var9 = null;
        dn var10 = null;
        dn var11 = null;
        dn var12 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        this.a((oc) (this), (byte) 0, param1, param0);
        var5 = this.f(-123) ? 1 : 0;
        if (param3) {
          L0: {
            if (0 == qc.field_o) {
              break L0;
            } else {
              if (var5 != 0) {
                discarded$2 = this.a(qc.field_o, pq.field_k, param0, -127, po.field_a, (oc) (this), param1);
                break L0;
              } else {
                L1: {
                  if (-1 == (ki.field_e ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (!this.a((oc) (this), tb.field_fb, param1, param0, ki.field_e, qo.field_O, 0)) {
                        break L2;
                      } else {
                        param3 = false;
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var5 != 0) {
                      this.b(false);
                      break L1;
                    } else {
                      L3: {
                        if (0 != cb.field_q) {
                          break L3;
                        } else {
                          if (-1 == (hj.field_Pb ^ -1)) {
                            break L3;
                          } else {
                            this.a(po.field_a, pq.field_k, param0, (oc) (this), 19223, param1);
                            var9 = gd.field_c;
                            if (var9 == null) {
                              break L3;
                            } else {
                              if (!(var9.field_i instanceof em)) {
                                gd.field_c = null;
                                break L3;
                              } else {
                                ((em) ((Object) var9.field_i)).a(-24178, var9, (jb) null);
                                gd.field_c = null;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var6 = -57 % ((56 - param2) / 43);
                      hj.field_Pb = cb.field_q;
                      ka.a(this.d(15), 22546);
                      return param3;
                    }
                  }
                }
                if (0 == cb.field_q) {
                  if (-1 != (hj.field_Pb ^ -1)) {
                    this.a(po.field_a, pq.field_k, param0, (oc) (this), 19223, param1);
                    var10 = gd.field_c;
                    if (var10 != null) {
                      if (!(var10.field_i instanceof em)) {
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      } else {
                        ((em) ((Object) var10.field_i)).a(-24178, var10, (jb) null);
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      }
                    } else {
                      var6 = -57 % ((56 - param2) / 43);
                      hj.field_Pb = cb.field_q;
                      ka.a(this.d(15), 22546);
                      return param3;
                    }
                  } else {
                    var6 = -57 % ((56 - param2) / 43);
                    hj.field_Pb = cb.field_q;
                    ka.a(this.d(15), 22546);
                    return param3;
                  }
                } else {
                  var6 = -57 % ((56 - param2) / 43);
                  hj.field_Pb = cb.field_q;
                  ka.a(this.d(15), 22546);
                  return param3;
                }
              }
            }
          }
          L4: {
            if (-1 == (ki.field_e ^ -1)) {
              break L4;
            } else {
              L5: {
                if (!this.a((oc) (this), tb.field_fb, param1, param0, ki.field_e, qo.field_O, 0)) {
                  break L5;
                } else {
                  param3 = false;
                  if (var7 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (var5 != 0) {
                this.b(false);
                break L4;
              } else {
                if (0 == cb.field_q) {
                  if (-1 != (hj.field_Pb ^ -1)) {
                    this.a(po.field_a, pq.field_k, param0, (oc) (this), 19223, param1);
                    var11 = gd.field_c;
                    if (var11 != null) {
                      if (!(var11.field_i instanceof em)) {
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      } else {
                        ((em) ((Object) var11.field_i)).a(-24178, var11, (jb) null);
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      }
                    } else {
                      var6 = -57 % ((56 - param2) / 43);
                      hj.field_Pb = cb.field_q;
                      ka.a(this.d(15), 22546);
                      return param3;
                    }
                  } else {
                    var6 = -57 % ((56 - param2) / 43);
                    hj.field_Pb = cb.field_q;
                    ka.a(this.d(15), 22546);
                    return param3;
                  }
                } else {
                  var6 = -57 % ((56 - param2) / 43);
                  hj.field_Pb = cb.field_q;
                  ka.a(this.d(15), 22546);
                  return param3;
                }
              }
            }
          }
          if (0 == cb.field_q) {
            if (-1 != (hj.field_Pb ^ -1)) {
              this.a(po.field_a, pq.field_k, param0, (oc) (this), 19223, param1);
              var12 = gd.field_c;
              if (var12 != null) {
                if (!(var12.field_i instanceof em)) {
                  gd.field_c = null;
                  var6 = -57 % ((56 - param2) / 43);
                  hj.field_Pb = cb.field_q;
                  ka.a(this.d(15), 22546);
                  return param3;
                } else {
                  ((em) ((Object) var12.field_i)).a(-24178, var12, (jb) null);
                  gd.field_c = null;
                  var6 = -57 % ((56 - param2) / 43);
                  hj.field_Pb = cb.field_q;
                  ka.a(this.d(15), 22546);
                  return param3;
                }
              } else {
                var6 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.field_q;
                ka.a(this.d(15), 22546);
                return param3;
              }
            } else {
              var6 = -57 % ((56 - param2) / 43);
              hj.field_Pb = cb.field_q;
              ka.a(this.d(15), 22546);
              return param3;
            }
          } else {
            var6 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.field_q;
            ka.a(this.d(15), 22546);
            return param3;
          }
        } else {
          if (var5 != 0) {
            if (ki.field_e != 0) {
              this.b(false);
              if (var7 != 0) {
                L6: {
                  if (0 == qc.field_o) {
                    break L6;
                  } else {
                    if (var5 != 0) {
                      discarded$3 = this.a(qc.field_o, pq.field_k, param0, -127, po.field_a, (oc) (this), param1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 == (ki.field_e ^ -1)) {
                    break L7;
                  } else {
                    L8: {
                      if (!this.a((oc) (this), tb.field_fb, param1, param0, ki.field_e, qo.field_O, 0)) {
                        break L8;
                      } else {
                        param3 = false;
                        if (var7 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var5 != 0) {
                      this.b(false);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if (0 == cb.field_q) {
                  if (-1 != (hj.field_Pb ^ -1)) {
                    this.a(po.field_a, pq.field_k, param0, (oc) (this), 19223, param1);
                    var8 = gd.field_c;
                    if (var8 != null) {
                      if (!(var8.field_i instanceof em)) {
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      } else {
                        ((em) ((Object) var8.field_i)).a(-24178, var8, (jb) null);
                        gd.field_c = null;
                        var6 = -57 % ((56 - param2) / 43);
                        hj.field_Pb = cb.field_q;
                        ka.a(this.d(15), 22546);
                        return param3;
                      }
                    } else {
                      var6 = -57 % ((56 - param2) / 43);
                      hj.field_Pb = cb.field_q;
                      ka.a(this.d(15), 22546);
                      return param3;
                    }
                  } else {
                    var6 = -57 % ((56 - param2) / 43);
                    hj.field_Pb = cb.field_q;
                    ka.a(this.d(15), 22546);
                    return param3;
                  }
                } else {
                  var6 = -57 % ((56 - param2) / 43);
                  hj.field_Pb = cb.field_q;
                  ka.a(this.d(15), 22546);
                  return param3;
                }
              } else {
                var6 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.field_q;
                ka.a(this.d(15), 22546);
                return param3;
              }
            } else {
              var6 = -57 % ((56 - param2) / 43);
              hj.field_Pb = cb.field_q;
              ka.a(this.d(15), 22546);
              return param3;
            }
          } else {
            var6 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.field_q;
            ka.a(this.d(15), 22546);
            return param3;
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param3 <= -125) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_j = (ep) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("oc.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, dh param1) {
        try {
            wp.field_c = param1;
            bq.field_b = new ck();
            bj.field_P = new ck();
            if (param0 != 1) {
                oc.c(16);
            }
            ff.field_d = new vl();
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oc.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        if (-1 == (param2 ^ -1)) {
          if (null != this.field_l) {
            this.field_l.a(true, param3 + -20607, param1, (oc) (this), param0);
            if (param3 != -11) {
              discarded$6 = this.a(5, -67, -79, true);
              return;
            } else {
              return;
            }
          } else {
            if (param3 != -11) {
              discarded$7 = this.a(5, -67, -79, true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != -11) {
            discarded$8 = this.a(5, -67, -79, true);
            return;
          } else {
            return;
          }
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param2 == 24) {
              L1: {
                if (!this.a(param3, 1595637992, param0, param1)) {
                  break L1;
                } else {
                  this.a(param1, param0, 0, param3);
                  break L1;
                }
              }
              stackOut_5_0 = (StringBuilder) (param3);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (StringBuilder) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("oc.UA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        Object discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 1595637992) {
                break L1;
              } else {
                this.field_w = -128;
                break L1;
              }
            }
            if (!param3.containsKey(this)) {
              discarded$4 = param3.put(this, this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("oc.EA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        if (this.f(-86)) {
          if (!this.a(param1, (byte) 110, (oc) (this), param0)) {
            var4 = param1;
            if (-81 == (var4 ^ -1)) {
              return this.a(true, (oc) (this));
            } else {
              if (!param2) {
                field_p = -38L;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          var4 = param1;
          if (-81 == (var4 ^ -1)) {
            return this.a(true, (oc) (this));
          } else {
            if (!param2) {
              field_p = -38L;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    int e(byte param0) {
        int var2 = 88 / ((-17 - param0) / 43);
        return 0;
    }

    boolean f(int param0) {
        if (param0 > -49) {
            return false;
        }
        return false;
    }

    final static void c(byte param0) {
        if (param0 >= -12) {
            oc.a(89, -103, -10, (j) null, (ak) null, (byte) 67);
            o.field_d = 0;
            return;
        }
        o.field_d = 0;
    }

    final static void a(tg param0, byte param1, java.awt.Canvas param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              sj.field_f = new ie();
              sj.field_f.b(0, 9, 128);
              tq.a(22050, true, sj.field_f, param0, 1024, (java.awt.Component) ((Object) param2));
              if (param1 == 60) {
                break L1;
              } else {
                field_y = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oc.KA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_u = null;
        field_y = null;
        if (param0 != -14711) {
          field_p = 65L;
          field_v = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_v = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int discarded$2 = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              if (!this.a(param5, param3, param2, 3, param1)) {
                break L1;
              } else {
                this.field_n = param4;
                break L1;
              }
            }
            if (param6 == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              discarded$2 = this.e((byte) -99);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("oc.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
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
            if (param1 == 110) {
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
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("oc.T(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static int d(byte param0) {
        if (param0 != -59) {
            return 73;
        }
        return 1;
    }

    boolean a(boolean param0, oc param1) {
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
            if (param0) {
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
            stackOut_5_1 = new StringBuilder().append("oc.CA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void b(boolean param0) {
        if (param0) {
            oc.c(-57);
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_w).append(" ").append(this.field_t).append("x").append(this.field_s);
              if (null == this.field_A) {
                break L1;
              } else {
                discarded$9 = param3.append(" text=\"").append(this.field_A).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_q) {
                break L2;
              } else {
                discarded$10 = param3.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!this.f(-102)) {
                break L3;
              } else {
                discarded$11 = param3.append(" focused");
                break L3;
              }
            }
            L4: {
              if (param2 == 0) {
                break L4;
              } else {
                this.a((Hashtable) null, 44, -5, (StringBuilder) null);
                break L4;
              }
            }
            L5: {
              if (this.field_l != null) {
                L6: {
                  discarded$12 = param3.append(" renderer=");
                  if (this.field_l instanceof oc) {
                    break L6;
                  } else {
                    discarded$13 = param3.append(this.field_l);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                param3 = this.a(param1 + 1, param0, 24, param3);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null != this.field_i) {
                L8: {
                  discarded$14 = param3.append(" listener=");
                  if (this.field_i instanceof oc) {
                    break L8;
                  } else {
                    discarded$15 = param3.append(this.field_i);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param3 = this.a(1 + param1, param0, 24, param3);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("oc.LA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    oc(String param0, uh param1) {
        this(param0, bj.field_T.field_i, param1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            L2: {
              var5_int = this.a(po.field_a, param3, param2, 3, pq.field_k) ? 1 : 0;
              if ((this.field_q ? 1 : 0) != var5_int) {
                L3: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5_int == 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((oc) (this)).field_q = stackIn_7_1 != 0;
                if (null == this.field_i) {
                  break L2;
                } else {
                  if (this.field_i instanceof vk) {
                    ((vk) ((Object) this.field_i)).a(-6932, (oc) (this), var5_int != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("oc.WA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 == 3) {
          if (this.field_o + param2 <= param4) {
            if (param0 >= param1 + this.field_w) {
              if (param4 < this.field_t + param2 - -this.field_o) {
                if (param0 >= this.field_s + (this.field_w + param1)) {
                  return false;
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

    final static void a(int param0, int param1, long param2, int param3, boolean param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        pi stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        pi stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        pi stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        pi stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        pi stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
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
              k.field_h.e(-13413, param1);
              k.field_h.field_l = k.field_h.field_l + 1;
              var7_int = k.field_h.field_l;
              k.field_h.a(-23054, param2);
              k.field_h.a(param5, param3 + -2);
              k.field_h.a(31, param0);
              stackOut_0_0 = k.field_h;
              stackOut_0_1 = -105;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!param4) {
                stackOut_2_0 = (pi) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (pi) ((Object) stackIn_1_0);
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((pi) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2);
              k.field_h.d((byte) 114, -var7_int + k.field_h.field_l);
              if (param3 == 1) {
                break L2;
              } else {
                field_k = (jg) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var7);
            stackOut_6_1 = new StringBuilder().append("oc.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    String d(int param0) {
        boolean discarded$11 = false;
        if (param0 >= 6) {
          if (!this.field_q) {
            return null;
          } else {
            return this.field_z;
          }
        } else {
          discarded$11 = this.a(-58, (byte) -3, (oc) null, '*');
          if (!this.field_q) {
            return null;
          } else {
            return this.field_z;
          }
        }
    }

    protected oc() {
        this.field_r = 0;
        this.field_B = 0;
    }

    oc(String param0, ub param1, uh param2) {
        RuntimeException runtimeException = null;
        qe var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        this.field_r = 0;
        this.field_B = 0;
        try {
          L0: {
            L1: {
              this.field_A = param0;
              this.field_i = param2;
              this.field_l = param1;
              if (!(this.field_l instanceof qe)) {
                break L1;
              } else {
                var4 = (qe) ((Object) this.field_l);
                this.field_t = var4.b((oc) (this), 31);
                this.field_s = var4.a((oc) (this), 46695);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("oc.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    oc(int param0, int param1, int param2, int param3, ub param4, uh param5) {
        this.field_r = 0;
        this.field_B = 0;
        try {
            this.field_o = param0;
            this.field_t = param2;
            this.field_i = param5;
            this.field_l = param4;
            this.field_w = param1;
            this.field_s = param3;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Brick Extension";
        field_y = new int[]{44, 45, 8, 3};
    }
}
