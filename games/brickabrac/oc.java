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
        try {
            this.field_n = 0;
            if (param4 != 19223) {
                field_y = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oc.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
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
        int var4;
        int var5_int;
        String var5;
        int var6;
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            L1: {
              if ((param4.field_k ^ -1) == -2) {
                if (r.field_A) {
                  if (ka.a((byte) 88)) {
                    stackIn_8_0 = 1;
                    break L1;
                  } else {
                    stackIn_8_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_8_0 = 0;
                  break L1;
                }
              } else {
                stackIn_8_0 = 0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6_int = stackIn_8_0;
                stackIn_11_0 = var6_int;

                if (8 == ga.field_i) {
                  break L3;
                } else {


                  if (-10 != (ga.field_i ^ -1)) {
                    stackIn_13_0 = stackIn_11_0;
                    stackIn_13_1 = 0;
                    break L2;
                  } else {

                    break L3;
                  }
                }
              }
              stackIn_13_0 = stackIn_11_0;
              stackIn_13_1 = 1;
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
                    stackIn_22_0 = var9;
                    break L7;
                  } else {
                    stackIn_22_0 = 3;
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
                    stackIn_27_0 = 4;
                    break L9;
                  } else {
                    stackIn_27_0 = -3 + var9;
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
                    stackIn_32_0 = 6;
                    break L11;
                  } else {
                    stackIn_32_0 = -7 + var9;
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
                    stackIn_38_0 = -13 + var9;
                    break L13;
                  } else {
                    stackIn_38_0 = 7;
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
            stackIn_48_0 = (RuntimeException) (var6);

            stackIn_48_1 = new StringBuilder().append("oc.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L16;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

            if (param4 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L17;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L17;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), 24, new StringBuilder()).toString();
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        dn var8;
        dn var9;
        dn var10;
        dn var11;
        dn var12;
        var7 = BrickABrac.field_J ? 1 : 0;
        this.a((oc) (this), (byte) 0, param1, param0);
        var5 = this.f(-123) ? 1 : 0;
        if (param3) {
          L0: {
            if (0 == qc.field_o) {
              break L0;
            } else {
              if (var5 != 0) {
                this.a(qc.field_o, pq.field_k, param0, -127, po.field_a, (oc) (this), param1);
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
                      this.a(qc.field_o, pq.field_k, param0, -127, po.field_a, (oc) (this), param1);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 <= -125) {
              stackIn_3_0 = 0;
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
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("oc.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        if (-1 == (param2 ^ -1)) {
          if (null != this.field_l) {
            this.field_l.a(true, param3 + -20607, param1, (oc) (this), param0);
            if (param3 != -11) {
              this.a(5, -67, -79, true);
              return;
            } else {
              return;
            }
          } else {
            if (param3 != -11) {
              this.a(5, -67, -79, true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != -11) {
            this.a(5, -67, -79, true);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oc.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              param3.put(this, this);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oc.EA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4;
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
        try {
            sj.field_f = new ie();
            sj.field_f.b(0, 9, 128);
            tq.a(22050, true, sj.field_f, param0, 1024, (java.awt.Component) ((Object) param2));
            if (param1 != 60) {
                field_y = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oc.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.e((byte) -99);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("oc.MA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 110) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("oc.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("oc.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_w).append(" ").append(this.field_t).append("x").append(this.field_s);
              if (null == this.field_A) {
                break L1;
              } else {
                discarded$1 = param3.append(" text=\"").append(this.field_A).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_q) {
                break L2;
              } else {
                discarded$2 = param3.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!this.f(-102)) {
                break L3;
              } else {
                discarded$3 = param3.append(" focused");
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
                  discarded$4 = param3.append(" renderer=");
                  if (this.field_l instanceof oc) {
                    break L6;
                  } else {
                    discarded$5 = param3.append(this.field_l);
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
                  L9: {
                    discarded$6 = param3.append(" listener=");
                    if (this.field_i instanceof oc) {
                      break L9;
                    } else {
                      discarded$7 = param3.append(this.field_i);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  param3 = this.a(1 + param1, param0, 24, param3);
                  break L8;
                }
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("oc.LA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
    }

    oc(String param0, uh param1) {
        this(param0, bj.field_T.field_i, param1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  stackIn_6_0 = this;

                  if (var5_int == 0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  ((oc) (this)).field_q = stackIn_7_1 != 0;
                  if (null == this.field_i) {
                    break L4;
                  } else {
                    if (this.field_i instanceof vk) {
                      ((vk) ((Object) this.field_i)).a(-6932, (oc) (this), var5_int != 0);
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("oc.WA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
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
        pi stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        pi stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              k.field_h.e(-13413, param1);
              k.field_h.field_l = k.field_h.field_l + 1;
              var7_int = k.field_h.field_l;
              k.field_h.a(-23054, param2);
              k.field_h.a(param5, param3 + -2);
              k.field_h.a(31, param0);
              stackIn_2_0 = k.field_h;

              stackIn_2_1 = -105;

              if (!param4) {
                stackIn_3_0 = (pi) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (pi) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
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
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("oc.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    String d(int param0) {
        if (param0 >= 6) {
          if (!this.field_q) {
            return null;
          } else {
            return this.field_z;
          }
        } else {
          this.a(-58, (byte) -3, (oc) null, '*');
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
        qe var4 = null;
        this.field_r = 0;
        this.field_B = 0;
        try {
            this.field_A = param0;
            this.field_i = param2;
            this.field_l = param1;
            if (this.field_l instanceof qe) {
                var4 = (qe) ((Object) this.field_l);
                this.field_t = var4.b((oc) (this), 31);
                this.field_s = var4.a((oc) (this), 46695);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
