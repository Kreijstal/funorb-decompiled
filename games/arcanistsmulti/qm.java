/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends pg {
    int field_t;
    static String field_l;
    String field_q;
    pf field_r;
    int field_h;
    int field_n;
    String field_g;
    int field_v;
    kh field_s;
    int field_j;
    static int field_u;
    static String field_p;
    wc field_o;
    boolean field_w;
    int field_k;
    static String field_m;
    int field_i;

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= -52) {
          if (0 == param2) {
            if (this.field_r == null) {
              return;
            } else {
              this.field_r.a((qm) (this), 5592405, param1, param3, true);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        boolean discarded$6 = false;
        StringBuilder discarded$7 = null;
        Object discarded$8 = null;
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
              if (param1 == -90) {
                break L1;
              } else {
                discarded$6 = this.a('ﾬ', (byte) 20, -10);
                break L1;
              }
            }
            if (param2.containsKey(this)) {
              discarded$7 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$8 = param2.put(this, this);
              stackOut_3_0 = 1;
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
            stackOut_7_1 = new StringBuilder().append("qm.HB(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
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
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                qm.f((byte) -21);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("qm.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 == -47) {
          if (param4 >= param3 - -this.field_n) {
            if (param1 + this.field_j > param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param4 >= param3 + (this.field_n - -this.field_v)) {
                    break L1;
                  } else {
                    if (param2 >= param1 - -this.field_j + this.field_k) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_j = -27;
          if (param4 >= param3 - -this.field_n) {
            if (param1 + this.field_j <= param2) {
              if (param4 < param3 + (this.field_n - -this.field_v)) {
                if (param2 >= param1 - -this.field_j + this.field_k) {
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
        }
    }

    int c(int param0) {
        if (param0 != 0) {
            return -80;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param0;
        this.field_v = param2;
        this.field_j = param1;
        this.field_n = param3;
        if (param4 >= -49) {
            field_p = (String) null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = this.c(0);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              this.a((byte) -99, param0, var5_int, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = sk.a(-14150);
          if (!param1) {
            return;
          } else {
            L2: {
              if (var5 != null) {
                io.field_n.a(var5, (byte) 60, ka.field_p, mo.field_p);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
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
            if (param0 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_w = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("qm.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void f(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 != -17) {
            return;
        }
        field_l = null;
    }

    boolean d(int param0) {
        int discarded$0 = 0;
        if (param0 != -2116) {
            discarded$0 = this.c(8);
            return false;
        }
        return false;
    }

    final void e(byte param0) {
        StringBuilder discarded$2 = null;
        Hashtable var3 = null;
        if (param0 <= 44) {
          var3 = (Hashtable) null;
          discarded$2 = this.a((StringBuilder) null, -107, (Hashtable) null, (byte) 106);
          this.a(this.field_k, this.field_j, this.field_v, this.field_n, -114);
          return;
        } else {
          this.a(this.field_k, this.field_j, this.field_v, this.field_n, -114);
          return;
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        if (!this.d(-2116)) {
          var4 = param2;
          if ((var4 ^ -1) == -81) {
            return this.a(0, (qm) (this));
          } else {
            var4 = 123 % ((87 - param1) / 35);
            return false;
          }
        } else {
          if (!this.a((qm) (this), (byte) -123, param0, param2)) {
            var4 = param2;
            if ((var4 ^ -1) == -81) {
              return this.a(0, (qm) (this));
            } else {
              var4 = 123 % ((87 - param1) / 35);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, byte param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        int var7 = 0;
        se var8 = null;
        se var9 = null;
        se var10 = null;
        se var11 = null;
        se var12 = null;
        se var13 = null;
        se var14 = null;
        se var15 = null;
        se var16 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 < -75) {
          this.a((qm) (this), param0, 170, param1);
          var5 = this.d(-2116) ? 1 : 0;
          if (!param2) {
            if (var5 != 0) {
              if (-1 == (re.field_r ^ -1)) {
                la.field_f = wk.field_m;
                qg.a(38, this.b(false));
                return param2;
              } else {
                this.d((byte) 29);
                la.field_f = wk.field_m;
                qg.a(38, this.b(false));
                return param2;
              }
            } else {
              la.field_f = wk.field_m;
              qg.a(38, this.b(false));
              return param2;
            }
          } else {
            if (wn.field_y != 0) {
              if (var5 != 0) {
                discarded$1 = this.a(param1, param0, an.field_g, me.field_I, wn.field_y, 0, (qm) (this));
                if (0 != re.field_r) {
                  L0: {
                    L1: {
                      if (this.a(ja.field_s, re.field_r, (qm) (this), param1, 10, pb.field_h, param0)) {
                        break L1;
                      } else {
                        if (var5 != 0) {
                          this.d((byte) 29);
                          if (var7 == 0) {
                            break L0;
                          } else {
                            break L1;
                          }
                        } else {
                          if (0 == wk.field_m) {
                            if (la.field_f != 0) {
                              this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                              var15 = so.field_i;
                              if (var15 != null) {
                                if (!(var15.field_o instanceof em)) {
                                  L2: {
                                    so.field_i = null;
                                    if (var7 == 0) {
                                      break L2;
                                    } else {
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        if (-1 != (re.field_r ^ -1)) {
                                          this.d((byte) 29);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                  la.field_f = wk.field_m;
                                  qg.a(38, this.b(false));
                                  return param2;
                                } else {
                                  ((em) ((Object) var15.field_o)).a(var15, (byte) 71, (q) null);
                                  L3: {
                                    so.field_i = null;
                                    if (var7 == 0) {
                                      break L3;
                                    } else {
                                      if (var5 == 0) {
                                        break L3;
                                      } else {
                                        if (-1 != (re.field_r ^ -1)) {
                                          this.d((byte) 29);
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                  la.field_f = wk.field_m;
                                  qg.a(38, this.b(false));
                                  return param2;
                                }
                              } else {
                                if (var7 != 0) {
                                  if (var5 != 0) {
                                    if (-1 == (re.field_r ^ -1)) {
                                      la.field_f = wk.field_m;
                                      qg.a(38, this.b(false));
                                      return param2;
                                    } else {
                                      this.d((byte) 29);
                                      la.field_f = wk.field_m;
                                      qg.a(38, this.b(false));
                                      return param2;
                                    }
                                  } else {
                                    la.field_f = wk.field_m;
                                    qg.a(38, this.b(false));
                                    return param2;
                                  }
                                } else {
                                  la.field_f = wk.field_m;
                                  qg.a(38, this.b(false));
                                  return param2;
                                }
                              }
                            } else {
                              la.field_f = wk.field_m;
                              qg.a(38, this.b(false));
                              return param2;
                            }
                          } else {
                            la.field_f = wk.field_m;
                            qg.a(38, this.b(false));
                            return param2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L0;
                  }
                  if (0 == wk.field_m) {
                    if (la.field_f != 0) {
                      this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                      var16 = so.field_i;
                      if (var16 != null) {
                        if (!(var16.field_o instanceof em)) {
                          so.field_i = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (-1 != (re.field_r ^ -1)) {
                                this.d((byte) 29);
                                la.field_f = wk.field_m;
                                qg.a(38, this.b(false));
                                return param2;
                              } else {
                                la.field_f = wk.field_m;
                                qg.a(38, this.b(false));
                                return param2;
                              }
                            } else {
                              la.field_f = wk.field_m;
                              qg.a(38, this.b(false));
                              return param2;
                            }
                          } else {
                            la.field_f = wk.field_m;
                            qg.a(38, this.b(false));
                            return param2;
                          }
                        } else {
                          ((em) ((Object) var16.field_o)).a(var16, (byte) 71, (q) null);
                          so.field_i = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (-1 == (re.field_r ^ -1)) {
                                la.field_f = wk.field_m;
                                qg.a(38, this.b(false));
                                return param2;
                              } else {
                                this.d((byte) 29);
                                la.field_f = wk.field_m;
                                qg.a(38, this.b(false));
                                return param2;
                              }
                            } else {
                              la.field_f = wk.field_m;
                              qg.a(38, this.b(false));
                              return param2;
                            }
                          } else {
                            la.field_f = wk.field_m;
                            qg.a(38, this.b(false));
                            return param2;
                          }
                        }
                      } else {
                        if (var7 != 0) {
                          if (var5 != 0) {
                            if (-1 != (re.field_r ^ -1)) {
                              this.d((byte) 29);
                              la.field_f = wk.field_m;
                              qg.a(38, this.b(false));
                              return param2;
                            } else {
                              la.field_f = wk.field_m;
                              qg.a(38, this.b(false));
                              return param2;
                            }
                          } else {
                            la.field_f = wk.field_m;
                            qg.a(38, this.b(false));
                            return param2;
                          }
                        } else {
                          la.field_f = wk.field_m;
                          qg.a(38, this.b(false));
                          return param2;
                        }
                      }
                    } else {
                      la.field_f = wk.field_m;
                      qg.a(38, this.b(false));
                      return param2;
                    }
                  } else {
                    la.field_f = wk.field_m;
                    qg.a(38, this.b(false));
                    return param2;
                  }
                } else {
                  L4: {
                    if (0 != wk.field_m) {
                      break L4;
                    } else {
                      if (la.field_f == 0) {
                        break L4;
                      } else {
                        L5: {
                          this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                          var14 = so.field_i;
                          if (var14 != null) {
                            if (!(var14.field_o instanceof em)) {
                              so.field_i = null;
                              break L5;
                            } else {
                              ((em) ((Object) var14.field_o)).a(var14, (byte) 71, (q) null);
                              so.field_i = null;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        if (var7 == 0) {
                          break L4;
                        } else {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            if (-1 != (re.field_r ^ -1)) {
                              this.d((byte) 29);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  la.field_f = wk.field_m;
                  qg.a(38, this.b(false));
                  return param2;
                }
              } else {
                if (0 != re.field_r) {
                  L6: {
                    L7: {
                      if (this.a(ja.field_s, re.field_r, (qm) (this), param1, 10, pb.field_h, param0)) {
                        break L7;
                      } else {
                        if (var5 != 0) {
                          this.d((byte) 29);
                          if (var7 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        } else {
                          L8: {
                            if (0 != wk.field_m) {
                              break L8;
                            } else {
                              if (la.field_f == 0) {
                                break L8;
                              } else {
                                L9: {
                                  this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                                  var12 = so.field_i;
                                  if (var12 != null) {
                                    if (!(var12.field_o instanceof em)) {
                                      so.field_i = null;
                                      break L9;
                                    } else {
                                      ((em) ((Object) var12.field_o)).a(var12, (byte) 71, (q) null);
                                      so.field_i = null;
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var7 == 0) {
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    break L8;
                                  } else {
                                    if (-1 != (re.field_r ^ -1)) {
                                      this.d((byte) 29);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          la.field_f = wk.field_m;
                          qg.a(38, this.b(false));
                          return param2;
                        }
                      }
                    }
                    param2 = false;
                    break L6;
                  }
                  if (0 == wk.field_m) {
                    if (la.field_f != 0) {
                      this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                      var13 = so.field_i;
                      if (var13 != null) {
                        if (!(var13.field_o instanceof em)) {
                          L10: {
                            so.field_i = null;
                            if (var7 == 0) {
                              break L10;
                            } else {
                              if (var5 == 0) {
                                break L10;
                              } else {
                                if (-1 != (re.field_r ^ -1)) {
                                  this.d((byte) 29);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          la.field_f = wk.field_m;
                          qg.a(38, this.b(false));
                          return param2;
                        } else {
                          ((em) ((Object) var13.field_o)).a(var13, (byte) 71, (q) null);
                          L11: {
                            so.field_i = null;
                            if (var7 == 0) {
                              break L11;
                            } else {
                              if (var5 == 0) {
                                break L11;
                              } else {
                                if (-1 != (re.field_r ^ -1)) {
                                  this.d((byte) 29);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          la.field_f = wk.field_m;
                          qg.a(38, this.b(false));
                          return param2;
                        }
                      } else {
                        L12: {
                          if (var7 == 0) {
                            break L12;
                          } else {
                            if (var5 == 0) {
                              break L12;
                            } else {
                              if (-1 != (re.field_r ^ -1)) {
                                this.d((byte) 29);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        la.field_f = wk.field_m;
                        qg.a(38, this.b(false));
                        return param2;
                      }
                    } else {
                      la.field_f = wk.field_m;
                      qg.a(38, this.b(false));
                      return param2;
                    }
                  } else {
                    la.field_f = wk.field_m;
                    qg.a(38, this.b(false));
                    return param2;
                  }
                } else {
                  L13: {
                    if (0 != wk.field_m) {
                      break L13;
                    } else {
                      if (la.field_f == 0) {
                        break L13;
                      } else {
                        L14: {
                          this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                          var11 = so.field_i;
                          if (var11 != null) {
                            if (!(var11.field_o instanceof em)) {
                              so.field_i = null;
                              break L14;
                            } else {
                              ((em) ((Object) var11.field_o)).a(var11, (byte) 71, (q) null);
                              so.field_i = null;
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        if (var7 == 0) {
                          break L13;
                        } else {
                          if (var5 == 0) {
                            break L13;
                          } else {
                            if (-1 != (re.field_r ^ -1)) {
                              this.d((byte) 29);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  la.field_f = wk.field_m;
                  qg.a(38, this.b(false));
                  return param2;
                }
              }
            } else {
              if (0 != re.field_r) {
                L15: {
                  L16: {
                    if (this.a(ja.field_s, re.field_r, (qm) (this), param1, 10, pb.field_h, param0)) {
                      break L16;
                    } else {
                      if (var5 != 0) {
                        this.d((byte) 29);
                        if (var7 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      } else {
                        L17: {
                          if (0 != wk.field_m) {
                            break L17;
                          } else {
                            if (la.field_f == 0) {
                              break L17;
                            } else {
                              L18: {
                                this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                                var9 = so.field_i;
                                if (var9 != null) {
                                  if (!(var9.field_o instanceof em)) {
                                    so.field_i = null;
                                    break L18;
                                  } else {
                                    ((em) ((Object) var9.field_o)).a(var9, (byte) 71, (q) null);
                                    so.field_i = null;
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              if (var7 == 0) {
                                break L17;
                              } else {
                                if (var5 == 0) {
                                  break L17;
                                } else {
                                  if (-1 != (re.field_r ^ -1)) {
                                    this.d((byte) 29);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                        la.field_f = wk.field_m;
                        qg.a(38, this.b(false));
                        return param2;
                      }
                    }
                  }
                  param2 = false;
                  break L15;
                }
                if (0 == wk.field_m) {
                  if (la.field_f != 0) {
                    this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                    var10 = so.field_i;
                    if (var10 != null) {
                      if (!(var10.field_o instanceof em)) {
                        L19: {
                          so.field_i = null;
                          if (var7 == 0) {
                            break L19;
                          } else {
                            if (var5 == 0) {
                              break L19;
                            } else {
                              if (-1 != (re.field_r ^ -1)) {
                                this.d((byte) 29);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        la.field_f = wk.field_m;
                        qg.a(38, this.b(false));
                        return param2;
                      } else {
                        ((em) ((Object) var10.field_o)).a(var10, (byte) 71, (q) null);
                        L20: {
                          so.field_i = null;
                          if (var7 == 0) {
                            break L20;
                          } else {
                            if (var5 == 0) {
                              break L20;
                            } else {
                              if (-1 != (re.field_r ^ -1)) {
                                this.d((byte) 29);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        la.field_f = wk.field_m;
                        qg.a(38, this.b(false));
                        return param2;
                      }
                    } else {
                      L21: {
                        if (var7 == 0) {
                          break L21;
                        } else {
                          if (var5 == 0) {
                            break L21;
                          } else {
                            if (-1 != (re.field_r ^ -1)) {
                              this.d((byte) 29);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      la.field_f = wk.field_m;
                      qg.a(38, this.b(false));
                      return param2;
                    }
                  } else {
                    la.field_f = wk.field_m;
                    qg.a(38, this.b(false));
                    return param2;
                  }
                } else {
                  la.field_f = wk.field_m;
                  qg.a(38, this.b(false));
                  return param2;
                }
              } else {
                L22: {
                  if (0 != wk.field_m) {
                    break L22;
                  } else {
                    if (la.field_f == 0) {
                      break L22;
                    } else {
                      L23: {
                        this.a(me.field_I, -20592, an.field_g, param1, param0, (qm) (this));
                        var8 = so.field_i;
                        if (var8 != null) {
                          if (!(var8.field_o instanceof em)) {
                            so.field_i = null;
                            break L23;
                          } else {
                            ((em) ((Object) var8.field_o)).a(var8, (byte) 71, (q) null);
                            so.field_i = null;
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      if (var7 == 0) {
                        break L22;
                      } else {
                        if (var5 == 0) {
                          break L22;
                        } else {
                          if (-1 != (re.field_r ^ -1)) {
                            this.d((byte) 29);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                }
                la.field_f = wk.field_m;
                qg.a(38, this.b(false));
                return param2;
              }
            }
          }
        } else {
          return false;
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
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
            if (param1 < -120) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_o = (wc) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("qm.N(");
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        try {
            if (param1 != -20592) {
                this.field_q = (String) null;
            }
            this.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qm.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void d(byte param0) {
        if (param0 != 29) {
            this.a((byte) -10, 57, 127, -111);
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              if (!this.a(param0, (byte) -90, param2, param1)) {
                break L1;
              } else {
                this.a(param0, param1, param2, 1);
                break L1;
              }
            }
            var5_int = -122 % ((param3 - 50) / 60);
            stackOut_2_0 = (StringBuilder) (param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("qm.FA(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        return this.a(new StringBuilder(), 0, new Hashtable(), (byte) -32).toString();
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
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
            L1: {
              if (!this.a((byte) -47, param3, param0, param6, param5)) {
                break L1;
              } else {
                this.field_t = param1;
                break L1;
              }
            }
            var8_int = 106 % ((param4 - -42) / 35);
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("qm.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_n).append(",").append(this.field_j).append(" ").append(this.field_v).append("x").append(this.field_k);
              if (null != this.field_g) {
                discarded$9 = param0.append(" text=\"").append(this.field_g).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_w) {
                break L2;
              } else {
                discarded$10 = param0.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!this.d(param3 + -2117)) {
                break L3;
              } else {
                discarded$11 = param0.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != this.field_r) {
                L5: {
                  discarded$12 = param0.append(" renderer=");
                  if (this.field_r instanceof qm) {
                    break L5;
                  } else {
                    discarded$13 = param0.append(this.field_r);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param0 = this.a(param0, param1 - -1, param2, (byte) 117);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_o == null) {
                break L6;
              } else {
                L7: {
                  discarded$14 = param0.append(" listener=");
                  if (!(this.field_o instanceof qm)) {
                    break L7;
                  } else {
                    param0 = this.a(param0, 1 + param1, param2, (byte) -77);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$15 = param0.append(this.field_o);
                break L6;
              }
            }
            L8: {
              if (param3 == 1) {
                break L8;
              } else {
                this.a(-66, 16, 33, 3, 108);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("qm.DB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
    }

    String b(boolean param0) {
        boolean discarded$9 = false;
        if (!param0) {
          if (!this.field_w) {
            return null;
          } else {
            return this.field_q;
          }
        } else {
          discarded$9 = this.a('ﾗ', (byte) 86, -60);
          if (!this.field_w) {
            return null;
          } else {
            return this.field_q;
          }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a((byte) -47, param3, me.field_I, param1, an.field_g) ? 1 : 0;
              if (param2 == 170) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = var5_int;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (this.field_w) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_5_0 == stackIn_5_1) {
                L4: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5_int == 0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                ((qm) (this)).field_w = stackIn_10_1 != 0;
                if (null == this.field_o) {
                  break L3;
                } else {
                  if (this.field_o instanceof l) {
                    ((l) ((Object) this.field_o)).a(53, (qm) (this), var5_int != 0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("qm.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
            fj.a((java.awt.Component) ((Object) param0), 115);
            so.a((java.awt.Component) ((Object) param0), 0);
            if (!(null == nh.field_w)) {
                nh.field_w.a((java.awt.Component) ((Object) param0), (byte) -22);
            }
            int var2_int = 17 / ((-7 - param1) / 49);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qm.KB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qm(String param0, wc param1) {
        this(param0, io.field_n.field_r, param1);
    }

    protected qm() {
        this.field_h = 0;
        this.field_i = 0;
    }

    qm(String param0, pf param1, wc param2) {
        RuntimeException runtimeException = null;
        ac var4 = null;
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
        this.field_h = 0;
        this.field_i = 0;
        try {
          L0: {
            L1: {
              this.field_o = param2;
              this.field_g = param0;
              this.field_r = param1;
              if (!(this.field_r instanceof ac)) {
                break L1;
              } else {
                var4 = (ac) ((Object) this.field_r);
                this.field_v = var4.a((byte) 124, (qm) (this));
                this.field_k = var4.b((qm) (this), 1);
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
            stackOut_4_1 = new StringBuilder().append("qm.<init>(");
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    qm(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        this.field_h = 0;
        this.field_i = 0;
        try {
            this.field_n = param0;
            this.field_k = param3;
            this.field_v = param2;
            this.field_r = param4;
            this.field_j = param1;
            this.field_o = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Jumping:";
        field_p = "<%0> is not a member, and cannot play with the current options.";
        field_m = "Public";
    }
}
