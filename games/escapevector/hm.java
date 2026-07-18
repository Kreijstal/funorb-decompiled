/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hm extends hg {
    wn field_q;
    boolean field_u;
    pg field_p;
    int field_j;
    String field_l;
    int field_x;
    db field_s;
    int field_n;
    int field_t;
    int field_k;
    static String field_m;
    int field_g;
    static String field_r;
    static pf field_o;
    static int[] field_h;
    static int[] field_w;
    String field_i;
    int field_v;

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 57) {
          if (param0 >= ((hm) this).field_k + param2) {
            if (param4 + ((hm) this).field_j <= param1) {
              if (((hm) this).field_k + (param2 + ((hm) this).field_g) > param0) {
                if (((hm) this).field_x + (param4 - -((hm) this).field_j) <= param1) {
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

    final boolean a(char param0, int param1, byte param2) {
        int var4 = 0;
        if (((hm) this).h(0)) {
          if (!((hm) this).a((hm) this, param0, param1, 23)) {
            var4 = param1;
            if (var4 == 80) {
              return ((hm) this).a(-4659, (hm) this);
            } else {
              if (param2 >= -106) {
                boolean discarded$4 = ((hm) this).a(44, -93, 57, (byte) 126, 65);
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
          if (var4 == 80) {
            return ((hm) this).a(-4659, (hm) this);
          } else {
            if (param2 >= -106) {
              boolean discarded$5 = ((hm) this).a(44, -93, 57, (byte) 126, 65);
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        ni var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = EscapeVector.field_A;
        ((hm) this).a(-14472, param3, param2, (hm) this);
        if (param1 != -33) {
          var8 = null;
          boolean discarded$3 = ((hm) this).a(1, (hm) null);
          var5 = ((hm) this).h(0) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (0 != qi.field_N) {
                ((hm) this).f(84);
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, ((hm) this).d(1));
              return param0;
            }
          } else {
            if (mg.field_f != 0) {
              L0: {
                if (var5 == 0) {
                  break L0;
                } else {
                  boolean discarded$4 = ((hm) this).b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) this, param2);
                  break L0;
                }
              }
              L1: {
                if (qi.field_N != 0) {
                  if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
                    if (var5 != 0) {
                      ((hm) this).f(122);
                      break L1;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                          var6 = gf.field_b;
                          if (var6 != null) {
                            if (!(var6.field_q instanceof mk)) {
                              gf.field_b = null;
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, ((hm) this).d(1));
                              return param0;
                            } else {
                              ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                              gf.field_b = null;
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, ((hm) this).d(1));
                              return param0;
                            }
                          } else {
                            bb.field_H = eb.field_K;
                            ve.a((byte) -112, ((hm) this).d(1));
                            return param0;
                          }
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    }
                  } else {
                    param0 = false;
                    if (0 == eb.field_K) {
                      if (bb.field_H != 0) {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 != null) {
                          if (!(var6.field_q instanceof mk)) {
                            gf.field_b = null;
                            bb.field_H = eb.field_K;
                            ve.a((byte) -112, ((hm) this).d(1));
                            return param0;
                          } else {
                            ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                            gf.field_b = null;
                            bb.field_H = eb.field_K;
                            ve.a((byte) -112, ((hm) this).d(1));
                            return param0;
                          }
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (0 == eb.field_K) {
                if (bb.field_H != 0) {
                  ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                  var6 = gf.field_b;
                  if (var6 != null) {
                    if (!(var6.field_q instanceof mk)) {
                      gf.field_b = null;
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                      gf.field_b = null;
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                } else {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              L2: {
                if (qi.field_N != 0) {
                  if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
                    if (var5 != 0) {
                      ((hm) this).f(122);
                      break L2;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                          var6 = gf.field_b;
                          if (var6 != null) {
                            L3: {
                              if (!(var6.field_q instanceof mk)) {
                                gf.field_b = null;
                                break L3;
                              } else {
                                ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                                gf.field_b = null;
                                break L3;
                              }
                            }
                            bb.field_H = eb.field_K;
                            ve.a((byte) -112, ((hm) this).d(1));
                            return param0;
                          } else {
                            bb.field_H = eb.field_K;
                            ve.a((byte) -112, ((hm) this).d(1));
                            return param0;
                          }
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    }
                  } else {
                    param0 = false;
                    if (0 == eb.field_K) {
                      if (bb.field_H != 0) {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 != null) {
                          L4: {
                            if (!(var6.field_q instanceof mk)) {
                              gf.field_b = null;
                              break L4;
                            } else {
                              ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                              gf.field_b = null;
                              break L4;
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (0 == eb.field_K) {
                if (bb.field_H != 0) {
                  ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                  var6 = gf.field_b;
                  if (var6 != null) {
                    if (!(var6.field_q instanceof mk)) {
                      gf.field_b = null;
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                      gf.field_b = null;
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                } else {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            }
          }
        } else {
          var5 = ((hm) this).h(0) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (0 != qi.field_N) {
                ((hm) this).f(84);
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, ((hm) this).d(1));
              return param0;
            }
          } else {
            L5: {
              if (mg.field_f == 0) {
                break L5;
              } else {
                if (var5 == 0) {
                  break L5;
                } else {
                  boolean discarded$5 = ((hm) this).b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) this, param2);
                  break L5;
                }
              }
            }
            L6: {
              if (qi.field_N != 0) {
                if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
                  if (var5 != 0) {
                    ((hm) this).f(122);
                    break L6;
                  } else {
                    if (0 == eb.field_K) {
                      if (bb.field_H != 0) {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 == null) {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        } else {
                          L7: {
                            if (!(var6.field_q instanceof mk)) {
                              gf.field_b = null;
                              break L7;
                            } else {
                              ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                              gf.field_b = null;
                              break L7;
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  }
                } else {
                  param0 = false;
                  if (0 == eb.field_K) {
                    if (bb.field_H != 0) {
                      ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                      var6 = gf.field_b;
                      if (var6 == null) {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      } else {
                        L8: {
                          if (!(var6.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L8;
                          } else {
                            ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                            gf.field_b = null;
                            break L8;
                          }
                        }
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                }
              } else {
                break L6;
              }
            }
            if (0 == eb.field_K) {
              if (bb.field_H != 0) {
                ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                var6 = gf.field_b;
                if (var6 != null) {
                  if (!(var6.field_q instanceof mk)) {
                    gf.field_b = null;
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  } else {
                    ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                    gf.field_b = null;
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                } else {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, ((hm) this).d(1));
              return param0;
            }
          }
        }
    }

    final void i(int param0) {
        ((hm) this).a(((hm) this).field_g, ((hm) this).field_j, ((hm) this).field_k, true, ((hm) this).field_x);
        if (param0 != 0) {
            ((hm) this).field_u = true;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int var4 = ((hm) this).e(12050);
        int var5_int = -73 / ((8 - param2) / 59);
        for (var6 = 0; var4 >= var6; var6++) {
            ((hm) this).a(param1, (byte) 88, var6, param0);
        }
        int discarded$0 = 46;
        String var5 = eo.a();
        if (!(var5 == null)) {
            mb.field_g.a((byte) -44, var5, ni.field_O, ci.field_g);
        }
    }

    boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
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
            if (param2 < -103) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_r = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("hm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final String toString() {
        return ((hm) this).a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
            int var7_int = -66 / ((-39 - param5) / 45);
            ((hm) this).field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hm.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    hm(String param0, wn param1) {
        this(param0, mb.field_g.field_i, param1);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                ((hm) this).field_t = 15;
                break L1;
              }
            }
            L2: {
              if (((hm) this).a(param3, param1, param2, false)) {
                ((hm) this).a(param1, param2, param3, param0 + 1);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hm.AA(").append(param0).append(',');
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(int param0, hm param1) {
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
            if (param0 == -4659) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((hm) this).h(1);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hm.M(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void d() {
        field_o = null;
        field_r = null;
        field_m = null;
        field_h = null;
        field_w = null;
    }

    void f(int param0) {
        if (param0 <= 46) {
            String discarded$0 = ((hm) this).toString();
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
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
            if (param3 >= 0) {
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
            stackOut_5_1 = new StringBuilder().append("hm.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0 != 0;
    }

    int e(int param0) {
        if (param0 != 12050) {
            ((hm) this).field_q = null;
            return 0;
        }
        return 0;
    }

    String d(int param0) {
        if (param0 != 1) {
            return null;
        }
        if (!((hm) this).field_u) {
            return null;
        }
        return ((hm) this).field_i;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 85) {
            field_r = null;
            if (param2 != 0) {
                return;
            }
            if (((hm) this).field_s == null) {
                return;
            }
            ((hm) this).field_s.a(param3, param0, -88, (hm) this, true);
            return;
        }
        if (param2 != 0) {
            return;
        }
        if (((hm) this).field_s == null) {
            return;
        }
        ((hm) this).field_s.a(param3, param0, -88, (hm) this, true);
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((hm) this).field_k).append(",").append(((hm) this).field_j).append(" ").append(((hm) this).field_g).append("x").append(((hm) this).field_x);
              if (null == ((hm) this).field_l) {
                break L1;
              } else {
                StringBuilder discarded$9 = param1.append(" text=\"").append(((hm) this).field_l).append('"');
                break L1;
              }
            }
            L2: {
              if (((hm) this).field_u) {
                StringBuilder discarded$10 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((hm) this).h(param3 ^ param3)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != ((hm) this).field_s) {
                StringBuilder discarded$12 = param1.append(" renderer=");
                if (!(((hm) this).field_s instanceof hm)) {
                  StringBuilder discarded$13 = param1.append((Object) (Object) ((hm) this).field_s);
                  break L4;
                } else {
                  param1 = ((hm) this).a(0, param0, param1, 1 + param2);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((hm) this).field_q) {
                StringBuilder discarded$14 = param1.append(" listener=");
                if (((hm) this).field_q instanceof hm) {
                  param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                  break L5;
                } else {
                  StringBuilder discarded$15 = param1.append((Object) (Object) ((hm) this).field_q);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("hm.HB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, boolean param3) {
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
              if (!param3) {
                break L1;
              } else {
                String discarded$6 = ((hm) this).toString();
                break L1;
              }
            }
            if (!param1.containsKey(this)) {
              Object discarded$7 = param1.put(this, this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              StringBuilder discarded$8 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hm.FB(").append(param0).append(',');
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0 != 0;
    }

    boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
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
              if (((hm) this).a(param1, param3, param4, (byte) 105, param0)) {
                ((hm) this).field_t = param6;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 3) {
                break L2;
              } else {
                ((hm) this).f(99);
                break L2;
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("hm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        Object var7 = null;
        if (!param3) {
          var7 = null;
          boolean discarded$2 = ((hm) this).a(-63, -124, (byte) 29, -14, 125, (hm) null, -5);
          ((hm) this).field_k = param2;
          ((hm) this).field_x = param4;
          ((hm) this).field_j = param1;
          ((hm) this).field_g = param0;
          return;
        } else {
          ((hm) this).field_k = param2;
          ((hm) this).field_x = param4;
          ((hm) this).field_j = param1;
          ((hm) this).field_g = param0;
          return;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
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
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
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
            if (param0 == -14472) {
              L1: {
                var5_int = ((hm) this).a(dh.field_d, bj.field_y, param2, (byte) 70, param1) ? 1 : 0;
                stackOut_2_0 = ((hm) this).field_u;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5_int != 0) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              L2: {
                if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
                  L3: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5_int == 0) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((hm) this).field_u = stackIn_10_1 != 0;
                  if (((hm) this).field_q == null) {
                    break L2;
                  } else {
                    if (((hm) this).field_q instanceof nj) {
                      ((nj) (Object) ((hm) this).field_q).a((hm) this, -27200, var5_int != 0);
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("hm.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static boolean g(int param0) {
        return df.field_d == null ? rk.field_b : true;
    }

    protected hm() {
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
    }

    hm(String param0, db param1, wn param2) {
        RuntimeException runtimeException = null;
        ao var4 = null;
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
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
        try {
          L0: {
            L1: {
              ((hm) this).field_s = param1;
              ((hm) this).field_q = param2;
              ((hm) this).field_l = param0;
              if (!(((hm) this).field_s instanceof ao)) {
                break L1;
              } else {
                var4 = (ao) (Object) ((hm) this).field_s;
                ((hm) this).field_g = var4.a((byte) -46, (hm) this);
                ((hm) this).field_x = var4.a(-127, (hm) this);
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
            stackOut_4_1 = new StringBuilder().append("hm.<init>(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    hm(int param0, int param1, int param2, int param3, db param4, wn param5) {
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
        try {
            ((hm) this).field_g = param2;
            ((hm) this).field_k = param0;
            ((hm) this).field_s = param4;
            ((hm) this).field_q = param5;
            ((hm) this).field_j = param1;
            ((hm) this).field_x = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Suggested names: ";
        field_r = "FROM ONLY";
        field_w = new int[8192];
        field_h = new int[8192];
    }
}
