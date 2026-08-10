/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class n extends hl {
    static gn field_w;
    static uf field_j;
    int field_y;
    boolean field_p;
    String field_z;
    static uf field_r;
    tb field_t;
    int field_o;
    lm field_i;
    int field_u;
    dh field_l;
    static String field_s;
    int field_k;
    int field_v;
    int field_x;
    int field_m;
    String field_q;
    static volatile long field_n;

    final boolean b(int param0, byte param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        if (param1 == -105) {
          if (this.field_k + param0 <= param2) {
            if (param3 - -this.field_o > param4) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param2 >= this.field_x + this.field_k + param0) {
                    break L1;
                  } else {
                    if (param4 >= this.field_u + this.field_o + param3) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.toString();
          if (this.field_k + param0 <= param2) {
            if (param3 - -this.field_o <= param4) {
              if (param2 < this.field_x + this.field_k + param0) {
                if (param4 >= this.field_u + this.field_o + param3) {
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

    void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 122) {
          this.d((byte) -120);
          this.field_o = param2;
          this.field_u = param3;
          this.field_x = param4;
          this.field_k = param0;
          return;
        } else {
          this.field_o = param2;
          this.field_u = param3;
          this.field_x = param4;
          this.field_k = param0;
          return;
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4;
        int var5;
        var4 = 111 % ((57 - param2) / 45);
        if (this.c((byte) -20)) {
          if (!this.a((n) (this), param0, (byte) -78, param1)) {
            var5 = param0;
            if ((var5 ^ -1) == -81) {
              return this.a((n) (this), -25823);
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var5 = param0;
          if ((var5 ^ -1) != -81) {
            return false;
          } else {
            return this.a((n) (this), -25823);
          }
        }
    }

    boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
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
            if (param6 == -24898) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_w = (gn) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("n.KB(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean c(byte param0) {
        if (param0 != -20) {
            return false;
        }
        return false;
    }

    int d(byte param0) {
        if (param0 >= -66) {
            this.field_y = 63;
            return 0;
        }
        return 0;
    }

    void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        try {
            this.field_v = 0;
            if (param4 != -9) {
                this.field_q = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "n.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 25) {
            return;
        }
        field_w = null;
        field_j = null;
        field_r = null;
        field_s = null;
    }

    String f(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        if (!this.field_p) {
            return null;
        }
        return this.field_z;
    }

    n(String param0, tb param1) {
        this(param0, pc.field_b.field_r, param1);
    }

    void a(int param0, n param1, int param2, byte param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(param0, (byte) -105, nc.field_g, param2, rf.field_X) ? 1 : 0;
              if (var5_int != 0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (this.field_p ? 1 : 0)) {
                L3: {
                  stackIn_7_0 = this;

                  if (var5_int == 0) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((n) (this)).field_p = stackIn_8_1 != 0;
                if (this.field_t == null) {
                  break L2;
                } else {
                  if (this.field_t instanceof qc) {
                    ((qc) ((Object) this.field_t)).a((n) (this), (byte) 118, var5_int != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param3 == -3) {
                break L4;
              } else {
                this.field_z = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("n.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(20720, param2, param3, param0)) {
                break L1;
              } else {
                this.a(param2, param0, true, param3);
                break L1;
              }
            }
            var5_int = 127 / ((param1 - 0) / 49);
            stackIn_3_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("n.PA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    void e(int param0) {
        if (param0 <= 15) {
            this.field_k = 102;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == -9532) {
          if (param3 == 0) {
            if (null == this.field_l) {
              return;
            } else {
              this.field_l.a(true, param2, -67, (n) (this), param1);
              return;
            }
          } else {
            return;
          }
        } else {
          field_r = (uf) null;
          if (param3 != 0) {
            return;
          } else {
            L0: {
              if (null != this.field_l) {
                this.field_l.a(true, param2, -67, (n) (this), param1);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
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
              if (param4 == -108) {
                break L1;
              } else {
                this.field_x = -39;
                break L1;
              }
            }
            if (!this.b(param0, (byte) -105, param5, param2, param1)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_v = param6;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("n.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = HoldTheLine.field_D;
                    var4 = this.d((byte) -110);
                    var5_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 < var5_int) {
                        statePc = 14;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(-9532, param1, param2, var5_int);
                    var5_int++;
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = qb.a(100);
                    if (var5 != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
                    return;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param0 == -81) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var5 = qb.a(100);
                    if (var5 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
                    return;
                }
                case 12: {
                    return;
                }
                case 14: {
                    if (param0 == -81) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    var5 = qb.a(100);
                    if (var5 != null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (param0 == 20720) {
                break L1;
              } else {
                this.field_k = 91;
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("n.FC(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        int var7;
        jd var8;
        jd var9;
        jd var10;
        jd var11;
        jd var12;
        jd var13;
        var7 = HoldTheLine.field_D;
        this.a(param0, (n) (this), param1, (byte) -3);
        var5 = this.c((byte) -20) ? 1 : 0;
        if (!param2) {
          if (var5 != 0) {
            if (gg.field_J != 0) {
              this.e(117);
              if (var7 != 0) {
                L0: {
                  if (-1 == (vg.field_T ^ -1)) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L0;
                    } else {
                      this.a(param0, (n) (this), vg.field_T, param1, rf.field_X, nc.field_g, -24898);
                      break L0;
                    }
                  }
                }
                if (-1 != (gg.field_J ^ -1)) {
                  L1: {
                    L2: {
                      if (this.a(param0, jb.field_U, param1, (n) (this), (byte) -108, lb.field_x, gg.field_J)) {
                        break L2;
                      } else {
                        if (var5 != 0) {
                          this.e(47);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L3: {
                            if (0 != rd.field_f) {
                              break L3;
                            } else {
                              if (0 == qj.field_L) {
                                break L3;
                              } else {
                                this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                                var12 = ig.field_q;
                                if (var12 != null) {
                                  if (!(var12.field_t instanceof c)) {
                                    L4: {
                                      ig.field_q = null;
                                      if (!param3) {
                                        break L4;
                                      } else {
                                        this.a(19, 'ￚ', (byte) -73);
                                        break L4;
                                      }
                                    }
                                    qj.field_L = rd.field_f;
                                    ba.a(this.f(0), 0);
                                    return param2;
                                  } else {
                                    ((c) ((Object) var12.field_t)).a(var12, (byte) -3, (pg) null);
                                    L5: {
                                      ig.field_q = null;
                                      if (!param3) {
                                        break L5;
                                      } else {
                                        this.a(19, 'ￚ', (byte) -73);
                                        break L5;
                                      }
                                    }
                                    qj.field_L = rd.field_f;
                                    ba.a(this.f(0), 0);
                                    return param2;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          if (param3) {
                            this.a(19, 'ￚ', (byte) -73);
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          } else {
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L1;
                  }
                  L6: {
                    if (0 != rd.field_f) {
                      break L6;
                    } else {
                      if (0 == qj.field_L) {
                        break L6;
                      } else {
                        this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                        var13 = ig.field_q;
                        if (var13 != null) {
                          if (!(var13.field_t instanceof c)) {
                            ig.field_q = null;
                            if (param3) {
                              this.a(19, 'ￚ', (byte) -73);
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            } else {
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            }
                          } else {
                            ((c) ((Object) var13.field_t)).a(var13, (byte) -3, (pg) null);
                            ig.field_q = null;
                            if (param3) {
                              this.a(19, 'ￚ', (byte) -73);
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            } else {
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            }
                          }
                        } else {
                          if (param3) {
                            this.a(19, 'ￚ', (byte) -73);
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          } else {
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if (!param3) {
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  } else {
                    this.a(19, 'ￚ', (byte) -73);
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                } else {
                  L7: {
                    if (0 != rd.field_f) {
                      break L7;
                    } else {
                      if (0 == qj.field_L) {
                        break L7;
                      } else {
                        this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                        var11 = ig.field_q;
                        if (var11 != null) {
                          if (!(var11.field_t instanceof c)) {
                            ig.field_q = null;
                            break L7;
                          } else {
                            ((c) ((Object) var11.field_t)).a(var11, (byte) -3, (pg) null);
                            ig.field_q = null;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!param3) {
                      break L8;
                    } else {
                      this.a(19, 'ￚ', (byte) -73);
                      break L8;
                    }
                  }
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                }
              } else {
                if (param3) {
                  this.a(19, 'ￚ', (byte) -73);
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                } else {
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                }
              }
            } else {
              if (param3) {
                this.a(19, 'ￚ', (byte) -73);
                qj.field_L = rd.field_f;
                ba.a(this.f(0), 0);
                return param2;
              } else {
                qj.field_L = rd.field_f;
                ba.a(this.f(0), 0);
                return param2;
              }
            }
          } else {
            if (param3) {
              this.a(19, 'ￚ', (byte) -73);
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            } else {
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            }
          }
        } else {
          L9: {
            if (-1 == (vg.field_T ^ -1)) {
              break L9;
            } else {
              if (var5 == 0) {
                break L9;
              } else {
                this.a(param0, (n) (this), vg.field_T, param1, rf.field_X, nc.field_g, -24898);
                break L9;
              }
            }
          }
          if (-1 != (gg.field_J ^ -1)) {
            L10: {
              L11: {
                if (this.a(param0, jb.field_U, param1, (n) (this), (byte) -108, lb.field_x, gg.field_J)) {
                  break L11;
                } else {
                  if (var5 != 0) {
                    this.e(47);
                    if (var7 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    L12: {
                      if (0 != rd.field_f) {
                        break L12;
                      } else {
                        if (0 == qj.field_L) {
                          break L12;
                        } else {
                          this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                          var9 = ig.field_q;
                          if (var9 != null) {
                            if (!(var9.field_t instanceof c)) {
                              ig.field_q = null;
                              break L12;
                            } else {
                              ((c) ((Object) var9.field_t)).a(var9, (byte) -3, (pg) null);
                              ig.field_q = null;
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if (!param3) {
                        break L13;
                      } else {
                        this.a(19, 'ￚ', (byte) -73);
                        break L13;
                      }
                    }
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                }
              }
              param2 = false;
              break L10;
            }
            L14: {
              if (0 != rd.field_f) {
                break L14;
              } else {
                if (0 == qj.field_L) {
                  break L14;
                } else {
                  this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                  var10 = ig.field_q;
                  if (var10 != null) {
                    if (!(var10.field_t instanceof c)) {
                      L15: {
                        ig.field_q = null;
                        if (!param3) {
                          break L15;
                        } else {
                          this.a(19, 'ￚ', (byte) -73);
                          break L15;
                        }
                      }
                      qj.field_L = rd.field_f;
                      ba.a(this.f(0), 0);
                      return param2;
                    } else {
                      ((c) ((Object) var10.field_t)).a(var10, (byte) -3, (pg) null);
                      L16: {
                        ig.field_q = null;
                        if (!param3) {
                          break L16;
                        } else {
                          this.a(19, 'ￚ', (byte) -73);
                          break L16;
                        }
                      }
                      qj.field_L = rd.field_f;
                      ba.a(this.f(0), 0);
                      return param2;
                    }
                  } else {
                    L17: {
                      if (!param3) {
                        break L17;
                      } else {
                        this.a(19, 'ￚ', (byte) -73);
                        break L17;
                      }
                    }
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                }
              }
            }
            if (param3) {
              this.a(19, 'ￚ', (byte) -73);
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            } else {
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            }
          } else {
            L18: {
              if (0 != rd.field_f) {
                break L18;
              } else {
                if (0 == qj.field_L) {
                  break L18;
                } else {
                  this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                  var8 = ig.field_q;
                  if (var8 != null) {
                    if (!(var8.field_t instanceof c)) {
                      ig.field_q = null;
                      break L18;
                    } else {
                      ((c) ((Object) var8.field_t)).a(var8, (byte) -3, (pg) null);
                      ig.field_q = null;
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (!param3) {
                break L19;
              } else {
                this.a(19, 'ￚ', (byte) -73);
                break L19;
              }
            }
            qj.field_L = rd.field_f;
            ba.a(this.f(0), 0);
            return param2;
          }
        }
    }

    final void a(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
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
        n var7 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_o).append(" ").append(this.field_x).append("x").append(this.field_u);
              if (null == this.field_q) {
                break L1;
              } else {
                discarded$1 = param3.append(" text=\"").append(this.field_q).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_p) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.c((byte) -20)) {
                discarded$3 = param3.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == this.field_l) {
                break L4;
              } else {
                L5: {
                  discarded$4 = param3.append(" renderer=");
                  if (this.field_l instanceof n) {
                    break L5;
                  } else {
                    discarded$5 = param3.append(this.field_l);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param3 = this.a(param1 + 1, (byte) -61, param0, param3);
                break L4;
              }
            }
            L6: {
              if (this.field_t != null) {
                L7: {
                  discarded$6 = param3.append(" listener=");
                  if (!(this.field_t instanceof n)) {
                    break L7;
                  } else {
                    param3 = this.a(1 + param1, (byte) 106, param0, param3);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$7 = param3.append(this.field_t);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param2) {
                break L8;
              } else {
                var7 = (n) null;
                this.a((n) null, 89, (byte) -105, '8');
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("n.DC(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
    }

    final void g(int param0) {
        if (param0 < 72) {
            return;
        }
        this.a(this.field_k, (byte) 122, this.field_o, this.field_u, this.field_x);
    }

    public final String toString() {
        return this.a(0, (byte) -67, new Hashtable(), new StringBuilder()).toString();
    }

    boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -25823) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_t = (tb) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("n.NB(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -78) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_m = 116;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("n.T(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    protected n() {
        this.field_y = 0;
        this.field_m = 0;
    }

    n(String param0, dh param1, tb param2) {
        RuntimeException runtimeException = null;
        vc var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_y = 0;
        this.field_m = 0;
        try {
          L0: {
            L1: {
              this.field_l = param1;
              this.field_t = param2;
              this.field_q = param0;
              if (!(this.field_l instanceof vc)) {
                break L1;
              } else {
                var4 = (vc) ((Object) this.field_l);
                this.field_x = var4.b((byte) -36, (n) (this));
                this.field_u = var4.a((n) (this), -95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("n.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    n(int param0, int param1, int param2, int param3, dh param4, tb param5) {
        this.field_y = 0;
        this.field_m = 0;
        try {
            this.field_k = param0;
            this.field_l = param4;
            this.field_u = param3;
            this.field_o = param1;
            this.field_t = param5;
            this.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "n.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = null;
        field_n = 0L;
    }
}
