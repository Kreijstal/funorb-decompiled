/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends o {
    int field_r;
    static String field_x;
    int field_C;
    static hg field_m;
    String field_v;
    static String field_B;
    int field_q;
    static ci[] field_l;
    rg field_p;
    int field_A;
    int field_u;
    int field_y;
    static boolean field_o;
    jm field_n;
    int field_k;
    boolean field_w;
    static int field_z;
    String field_j;
    ub field_t;
    static rk[] field_s;

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
              if (((mf) this).a(param2, param5, param6, (byte) -117, param1)) {
                ((mf) this).field_q = param0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 == 88) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((mf) this).field_j = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("mf.OA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    boolean a(int param0, mf param1) {
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
              field_z = 37;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mf.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void d(int param0) {
        int var2 = 70 % ((34 - param0) / 57);
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (((mf) this).d((byte) -67)) {
          if (!((mf) this).a(param0, param2, -1, (mf) this)) {
            var4 = -101 / ((2 - param1) / 35);
            var5 = param2;
            if (var5 == 80) {
              return ((mf) this).a(0, (mf) this);
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = -101 / ((2 - param1) / 35);
          var5 = param2;
          if (var5 == 80) {
            return ((mf) this).a(0, (mf) this);
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
            if (param0 >= 59) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("mf.BB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public static void f(int param0) {
        field_l = null;
        field_B = null;
        field_s = null;
        field_x = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
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
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              StringBuilder discarded$9 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((mf) this).field_u).append(",").append(((mf) this).field_r).append(" ").append(((mf) this).field_y).append("x").append(((mf) this).field_C);
              if (((mf) this).field_v == null) {
                break L1;
              } else {
                StringBuilder discarded$10 = param1.append(" text=\"").append(((mf) this).field_v).append(34);
                break L1;
              }
            }
            L2: {
              if (!((mf) this).field_w) {
                break L2;
              } else {
                StringBuilder discarded$11 = param1.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (((mf) this).d((byte) -67)) {
                StringBuilder discarded$12 = param1.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((mf) this).field_n != null) {
                L5: {
                  StringBuilder discarded$13 = param1.append(" renderer=");
                  if (!(((mf) this).field_n instanceof mf)) {
                    break L5;
                  } else {
                    param1 = ((mf) this).a(param0, param2 + 1, param1, 1);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$14 = param1.append(((mf) this).field_n);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (((mf) this).field_p == null) {
                break L6;
              } else {
                L7: {
                  StringBuilder discarded$15 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    break L7;
                  } else {
                    StringBuilder discarded$16 = param1.append(((mf) this).field_p);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                break L6;
              }
            }
            L8: {
              if (!param3) {
                break L8;
              } else {
                var7 = null;
                boolean discarded$17 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("mf.WB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(pf param0, int param1) {
        try {
            ka.field_a.a(false, param0, 202);
            field_m = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "mf.UB(" + (param0 != null ? "{...}" : "null") + 44 + 89 + 41);
        }
    }

    public final String toString() {
        return ((mf) this).a(new Hashtable(), 0, new StringBuilder(), 1).toString();
    }

    void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
            ((mf) this).field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "mf.VA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void c(byte param0) {
        if (param0 <= 89) {
            return;
        }
        ((mf) this).a(((mf) this).field_r, 34, ((mf) this).field_C, ((mf) this).field_y, ((mf) this).field_u);
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        kb var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        ((mf) this).a(param2, -87, (mf) this, param1);
        if (param0 < -116) {
          L0: {
            L1: {
              var5 = ((mf) this).d((byte) -67) ? 1 : 0;
              if (!param3) {
                break L1;
              } else {
                L2: {
                  if (0 == fl.field_p) {
                    break L2;
                  } else {
                    if (var5 != 0) {
                      boolean discarded$1 = ((mf) this).a(78, fl.field_p, param1, (mf) this, param2, rf.field_b, hn.field_k);
                      break L2;
                    } else {
                      if (0 != th.field_d) {
                        L3: {
                          L4: {
                            if (((mf) this).a(th.field_d, re.field_m, ag.field_f, (byte) 88, (mf) this, param1, param2)) {
                              break L4;
                            } else {
                              if (var5 != 0) {
                                ((mf) this).d(115);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          param3 = false;
                          break L3;
                        }
                        if (wh.field_f == 0) {
                          if (on.field_h != 0) {
                            L5: {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  vj.field_a = null;
                                  break L5;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  break L5;
                                }
                              }
                            }
                            if (var7 != 0) {
                              if (var5 != 0) {
                                if (th.field_d != 0) {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                } else {
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              } else {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      } else {
                        if (wh.field_f == 0) {
                          if (on.field_h == 0) {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          } else {
                            L6: {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                break L6;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  vj.field_a = null;
                                  break L6;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (var7 == 0) {
                                break L7;
                              } else {
                                if (var5 == 0) {
                                  break L7;
                                } else {
                                  if (th.field_d == 0) {
                                    break L7;
                                  } else {
                                    ((mf) this).d(102);
                                    break L7;
                                  }
                                }
                              }
                            }
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      }
                    }
                  }
                }
                if (0 != th.field_d) {
                  L8: {
                    L9: {
                      if (((mf) this).a(th.field_d, re.field_m, ag.field_f, (byte) 88, (mf) this, param1, param2)) {
                        break L9;
                      } else {
                        if (var5 != 0) {
                          ((mf) this).d(115);
                          if (var7 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        } else {
                          if (wh.field_f == 0) {
                            if (on.field_h != 0) {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                L10: {
                                  if (var7 == 0) {
                                    break L10;
                                  } else {
                                    if (var5 == 0) {
                                      break L10;
                                    } else {
                                      if (th.field_d == 0) {
                                        break L10;
                                      } else {
                                        ((mf) this).d(102);
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      }
                                    }
                                  }
                                }
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  L11: {
                                    vj.field_a = null;
                                    if (var7 == 0) {
                                      break L11;
                                    } else {
                                      if (var5 == 0) {
                                        break L11;
                                      } else {
                                        if (th.field_d == 0) {
                                          break L11;
                                        } else {
                                          ((mf) this).d(102);
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  if (var7 != 0) {
                                    if (var5 != 0) {
                                      if (th.field_d != 0) {
                                        ((mf) this).d(102);
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      } else {
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      }
                                    } else {
                                      on.field_h = wh.field_f;
                                      sb.a(((mf) this).g(0), true);
                                      return param3;
                                    }
                                  } else {
                                    on.field_h = wh.field_f;
                                    sb.a(((mf) this).g(0), true);
                                    return param3;
                                  }
                                }
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        }
                      }
                    }
                    param3 = false;
                    break L8;
                  }
                  if (wh.field_f != 0) {
                    break L0;
                  } else {
                    if (on.field_h != 0) {
                      ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                      var6 = vj.field_a;
                      if (var6 == null) {
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        if (!(var6.field_p instanceof cj)) {
                          L12: {
                            vj.field_a = null;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (var5 == 0) {
                                break L12;
                              } else {
                                if (th.field_d == 0) {
                                  break L12;
                                } else {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              }
                            }
                          }
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        } else {
                          ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                          L13: {
                            vj.field_a = null;
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                break L13;
                              } else {
                                if (th.field_d == 0) {
                                  break L13;
                                } else {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              }
                            }
                          }
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      }
                    } else {
                      on.field_h = wh.field_f;
                      sb.a(((mf) this).g(0), true);
                      return param3;
                    }
                  }
                } else {
                  if (wh.field_f == 0) {
                    if (on.field_h != 0) {
                      ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                      var6 = vj.field_a;
                      if (var6 == null) {
                        if (var7 != 0) {
                          if (var5 != 0) {
                            if (th.field_d != 0) {
                              ((mf) this).d(102);
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      } else {
                        if (!(var6.field_p instanceof cj)) {
                          vj.field_a = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (th.field_d == 0) {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                ((mf) this).d(102);
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                          vj.field_a = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (th.field_d == 0) {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                ((mf) this).d(102);
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        }
                      }
                    } else {
                      on.field_h = wh.field_f;
                      sb.a(((mf) this).g(0), true);
                      return param3;
                    }
                  } else {
                    on.field_h = wh.field_f;
                    sb.a(((mf) this).g(0), true);
                    return param3;
                  }
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if (th.field_d == 0) {
                break L0;
              } else {
                ((mf) this).d(102);
                on.field_h = wh.field_f;
                sb.a(((mf) this).g(0), true);
                return param3;
              }
            }
          }
          on.field_h = wh.field_f;
          sb.a(((mf) this).g(0), true);
          return param3;
        } else {
          return true;
        }
    }

    String g(int param0) {
        if (param0 != 0) {
            return null;
        }
        return !((mf) this).field_w ? null : ((mf) this).field_j;
    }

    void a(int param0, int param1, mf param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
              var5_int = ((mf) this).a(rf.field_b, param3, param0, (byte) -117, hn.field_k) ? 1 : 0;
              stackOut_0_0 = ((mf) this).field_w;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (var5_int != 0) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5_int == 0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((mf) this).field_w = stackIn_8_1 != 0;
                if (null == ((mf) this).field_p) {
                  break L2;
                } else {
                  if (((mf) this).field_p instanceof qg) {
                    ((qg) (Object) ((mf) this).field_p).a((mf) this, var5_int != 0, 92);
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
              if (param1 <= -6) {
                break L4;
              } else {
                var6 = null;
                boolean discarded$2 = ((mf) this).a(67, 95, -96, (mf) null, 27, -113, 105);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("mf.G(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    mf(String param0, rg param1) {
        this(param0, a.field_a.field_f, param1);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 < -80) {
          if (param1 == 0) {
            if (null == ((mf) this).field_n) {
              return;
            } else {
              ((mf) this).field_n.a((byte) 126, param3, param0, true, (mf) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        ((mf) this).field_y = param3;
        ((mf) this).field_C = param2;
        if (param1 != 34) {
          var7 = null;
          ((mf) this).a(-106, (mf) null, 9, 48, 115, -76);
          ((mf) this).field_r = param0;
          ((mf) this).field_u = param4;
          return;
        } else {
          ((mf) this).field_r = param0;
          ((mf) this).field_u = param4;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param3 == -117) {
          if (((mf) this).field_u + param2 <= param4) {
            if (param1 + ((mf) this).field_r > param0) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((mf) this).field_y + (param2 - -((mf) this).field_u) <= param4) {
                    break L1;
                  } else {
                    if (param0 >= ((mf) this).field_C + (param1 - -((mf) this).field_r)) {
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
          mf.f(-121);
          if (((mf) this).field_u + param2 <= param4) {
            if (param1 + ((mf) this).field_r <= param0) {
              if (((mf) this).field_y + (param2 - -((mf) this).field_u) > param4) {
                if (param0 >= ((mf) this).field_C + (param1 - -((mf) this).field_r)) {
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

    boolean d(byte param0) {
        if (param0 != -67) {
            String discarded$0 = ((mf) this).toString();
            return false;
        }
        return false;
    }

    final static void e(int param0) {
        ld.a("", (String) null, 0);
        if (param0 < 76) {
            Object var2 = null;
            mf.a((pf) null, 89);
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (param3 < -3) {
                break L1;
              } else {
                var6 = null;
                ((mf) this).a((Hashtable) null, (StringBuilder) null, 58, false);
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              StringBuilder discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$5 = param1.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("mf.PB(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == 8308) {
          if (param1 == 1) {
            if (!sh.a(14222, param0)) {
              return fj.field_f[param1];
            } else {
              return 29;
            }
          } else {
            return fj.field_f[param1];
          }
        } else {
          return -18;
        }
    }

    int a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            StringBuilder discarded$0 = ((mf) this).a((Hashtable) null, -62, (StringBuilder) null, -111);
            return 0;
        }
        return 0;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param3 == 1) {
              L1: {
                if (((mf) this).a(param1, param0, param2, -34)) {
                  ((mf) this).a(param0, param2, param1, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (StringBuilder) param2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("mf.WA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    boolean a(char param0, int param1, int param2, mf param3) {
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
            if (param2 == -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("mf.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        var4 = ((mf) this).a(param0);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((mf) this).a(param1, var5_int, -84, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = lc.d((byte) 60);
          if (param0) {
            if (var5 != null) {
              a.field_a.a(var5, fm.field_S, 106, vn.field_Db);
              return;
            } else {
              return;
            }
          } else {
            mf.f(118);
            if (var5 == null) {
              return;
            } else {
              a.field_a.a(var5, fm.field_S, 106, vn.field_Db);
              return;
            }
          }
        }
    }

    protected mf() {
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
    }

    mf(String param0, jm param1, rg param2) {
        RuntimeException runtimeException = null;
        mg var4 = null;
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
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
        try {
          L0: {
            L1: {
              ((mf) this).field_p = param2;
              ((mf) this).field_v = param0;
              ((mf) this).field_n = param1;
              if (!(((mf) this).field_n instanceof mg)) {
                break L1;
              } else {
                var4 = (mg) (Object) ((mf) this).field_n;
                ((mf) this).field_y = var4.a((byte) -119, (mf) this);
                ((mf) this).field_C = var4.a(true, (mf) this);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("mf.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    mf(int param0, int param1, int param2, int param3, jm param4, rg param5) {
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
        try {
            ((mf) this).field_u = param0;
            ((mf) this).field_n = param4;
            ((mf) this).field_y = param2;
            ((mf) this).field_C = param3;
            ((mf) this).field_r = param1;
            ((mf) this).field_p = param5;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "mf.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Accept draw";
        field_B = "Please remove <%0> from your friend list first.";
        field_m = new hg(11, 0, 1, 2);
    }
}
