/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ee extends da {
    static String field_y;
    String field_v;
    int field_z;
    static int field_o;
    boolean field_w;
    j field_q;
    static int field_s;
    int field_u;
    int field_i;
    String field_r;
    int field_j;
    int field_p;
    int field_m;
    lg field_t;
    int field_l;
    gg field_k;
    static hb field_x;
    static int[] field_n;

    final boolean a(int param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        uk var6 = null;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        ((ee) this).a((ee) this, param0, (byte) -127, param2);
        var5 = ((ee) this).c(94) ? 1 : 0;
        if (!param3) {
          if (var5 != 0) {
            if (vb.field_n != 0) {
              ((ee) this).d(6064);
              ok.field_f = wh.field_e;
              je.a((byte) -109, ((ee) this).b(param1));
              return param3;
            } else {
              ok.field_f = wh.field_e;
              je.a((byte) -109, ((ee) this).b(param1));
              return param3;
            }
          } else {
            ok.field_f = wh.field_e;
            je.a((byte) -109, ((ee) this).b(param1));
            return param3;
          }
        } else {
          if (bl.field_X != 0) {
            L0: {
              if (var5 != 0) {
                boolean discarded$1 = ((ee) this).a(0, bl.field_X, param0, kc.field_u, (ee) this, ph.field_d, param2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (vb.field_n == 0) {
                break L1;
              } else {
                if (!((ee) this).a(ci.field_m, ik.field_a, -81, param2, param0, vb.field_n, (ee) this)) {
                  if (var5 != 0) {
                    ((ee) this).d(6064);
                    break L1;
                  } else {
                    if (0 == wh.field_e) {
                      if (ok.field_f != 0) {
                        ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                        var6 = gl.field_b;
                        if (var6 != null) {
                          if (!(var6.field_k instanceof f)) {
                            gl.field_b = null;
                            ok.field_f = wh.field_e;
                            je.a((byte) -109, ((ee) this).b(param1));
                            return param3;
                          } else {
                            ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                            gl.field_b = null;
                            ok.field_f = wh.field_e;
                            je.a((byte) -109, ((ee) this).b(param1));
                            return param3;
                          }
                        } else {
                          ok.field_f = wh.field_e;
                          je.a((byte) -109, ((ee) this).b(param1));
                          return param3;
                        }
                      } else {
                        ok.field_f = wh.field_e;
                        je.a((byte) -109, ((ee) this).b(param1));
                        return param3;
                      }
                    } else {
                      ok.field_f = wh.field_e;
                      je.a((byte) -109, ((ee) this).b(param1));
                      return param3;
                    }
                  }
                } else {
                  param3 = false;
                  if (0 == wh.field_e) {
                    if (ok.field_f != 0) {
                      ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                      var6 = gl.field_b;
                      if (var6 != null) {
                        if (!(var6.field_k instanceof f)) {
                          gl.field_b = null;
                          ok.field_f = wh.field_e;
                          je.a((byte) -109, ((ee) this).b(param1));
                          return param3;
                        } else {
                          ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                          gl.field_b = null;
                          ok.field_f = wh.field_e;
                          je.a((byte) -109, ((ee) this).b(param1));
                          return param3;
                        }
                      } else {
                        ok.field_f = wh.field_e;
                        je.a((byte) -109, ((ee) this).b(param1));
                        return param3;
                      }
                    } else {
                      ok.field_f = wh.field_e;
                      je.a((byte) -109, ((ee) this).b(param1));
                      return param3;
                    }
                  } else {
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  }
                }
              }
            }
            if (0 == wh.field_e) {
              if (ok.field_f != 0) {
                ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                var6 = gl.field_b;
                if (var6 != null) {
                  if (!(var6.field_k instanceof f)) {
                    gl.field_b = null;
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  } else {
                    ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                    gl.field_b = null;
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  }
                } else {
                  ok.field_f = wh.field_e;
                  je.a((byte) -109, ((ee) this).b(param1));
                  return param3;
                }
              } else {
                ok.field_f = wh.field_e;
                je.a((byte) -109, ((ee) this).b(param1));
                return param3;
              }
            } else {
              ok.field_f = wh.field_e;
              je.a((byte) -109, ((ee) this).b(param1));
              return param3;
            }
          } else {
            L2: {
              if (vb.field_n == 0) {
                break L2;
              } else {
                if (!((ee) this).a(ci.field_m, ik.field_a, -81, param2, param0, vb.field_n, (ee) this)) {
                  if (var5 != 0) {
                    ((ee) this).d(6064);
                    break L2;
                  } else {
                    if (0 == wh.field_e) {
                      if (ok.field_f != 0) {
                        ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                        var6 = gl.field_b;
                        if (var6 == null) {
                          ok.field_f = wh.field_e;
                          je.a((byte) -109, ((ee) this).b(param1));
                          return param3;
                        } else {
                          L3: {
                            if (!(var6.field_k instanceof f)) {
                              gl.field_b = null;
                              break L3;
                            } else {
                              ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                              gl.field_b = null;
                              break L3;
                            }
                          }
                          ok.field_f = wh.field_e;
                          je.a((byte) -109, ((ee) this).b(param1));
                          return param3;
                        }
                      } else {
                        ok.field_f = wh.field_e;
                        je.a((byte) -109, ((ee) this).b(param1));
                        return param3;
                      }
                    } else {
                      ok.field_f = wh.field_e;
                      je.a((byte) -109, ((ee) this).b(param1));
                      return param3;
                    }
                  }
                } else {
                  param3 = false;
                  if (0 == wh.field_e) {
                    if (ok.field_f != 0) {
                      ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                      var6 = gl.field_b;
                      if (var6 == null) {
                        ok.field_f = wh.field_e;
                        je.a((byte) -109, ((ee) this).b(param1));
                        return param3;
                      } else {
                        L4: {
                          if (!(var6.field_k instanceof f)) {
                            gl.field_b = null;
                            break L4;
                          } else {
                            ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                            gl.field_b = null;
                            break L4;
                          }
                        }
                        ok.field_f = wh.field_e;
                        je.a((byte) -109, ((ee) this).b(param1));
                        return param3;
                      }
                    } else {
                      ok.field_f = wh.field_e;
                      je.a((byte) -109, ((ee) this).b(param1));
                      return param3;
                    }
                  } else {
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  }
                }
              }
            }
            if (0 == wh.field_e) {
              if (ok.field_f != 0) {
                ((ee) this).a(param2, (byte) -77, (ee) this, param0, kc.field_u, ph.field_d);
                var6 = gl.field_b;
                if (var6 != null) {
                  if (!(var6.field_k instanceof f)) {
                    gl.field_b = null;
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  } else {
                    ((f) (Object) var6.field_k).a(var6, (wk) null, param1);
                    gl.field_b = null;
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, ((ee) this).b(param1));
                    return param3;
                  }
                } else {
                  ok.field_f = wh.field_e;
                  je.a((byte) -109, ((ee) this).b(param1));
                  return param3;
                }
              } else {
                ok.field_f = wh.field_e;
                je.a((byte) -109, ((ee) this).b(param1));
                return param3;
              }
            } else {
              ok.field_f = wh.field_e;
              je.a((byte) -109, ((ee) this).b(param1));
              return param3;
            }
          }
        }
    }

    public static void f(int param0) {
        field_n = null;
        field_y = null;
        field_x = null;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
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
              if (param2 == -81) {
                break L1;
              } else {
                boolean discarded$2 = ((ee) this).a(-23, -24, 118, 19, -83, -121, (ee) null);
                break L1;
              }
            }
            if (((ee) this).a(param0, param1, param3, -29991, param4)) {
              ((ee) this).field_z = param5;
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("ee.CA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
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
              if (param0 == 0) {
                break L1;
              } else {
                ((ee) this).a(-72, -73, false, 71);
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
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ee.BB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param3 == -29991) {
          if (param1 >= param4 - -((ee) this).field_m) {
            if (param0 < ((ee) this).field_i + param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ee) this).field_p + (((ee) this).field_m + param4) <= param1) {
                    break L1;
                  } else {
                    if (param2 - -((ee) this).field_i + ((ee) this).field_l <= param0) {
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
          ((ee) this).field_z = -33;
          if (param1 >= param4 - -((ee) this).field_m) {
            if (param0 >= ((ee) this).field_i + param2) {
              if (((ee) this).field_p + (((ee) this).field_m + param4) > param1) {
                if (param2 - -((ee) this).field_i + ((ee) this).field_l <= param0) {
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

    void a(ee param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
            L1: {
              var5_int = ((ee) this).a(ph.field_d, kc.field_u, param3, -29991, param1) ? 1 : 0;
              if (var5_int == (((ee) this).field_w ? 1 : 0)) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (var5_int == 0) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((ee) this).field_w = stackIn_4_1 != 0;
                if (((ee) this).field_k == null) {
                  break L1;
                } else {
                  if (((ee) this).field_k instanceof ml) {
                    ((ml) (Object) ((ee) this).field_k).a(var5_int != 0, (ee) this, 29557);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param2 <= -97) {
                break L3;
              } else {
                ((ee) this).field_r = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ee.U(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
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
              if (param2 < -124) {
                break L1;
              } else {
                ((ee) this).field_r = null;
                break L1;
              }
            }
            if (!param0.containsKey(this)) {
              Object discarded$4 = param0.put(this, this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              StringBuilder discarded$5 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            stackOut_7_1 = new StringBuilder().append("ee.OB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
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
            if (param2 > 9) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((ee) this).a(74, 31, 55, -90, (ee) null, -101, -90);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ee.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ee) this).field_m).append(",").append(((ee) this).field_i).append(" ").append(((ee) this).field_p).append("x").append(((ee) this).field_l);
              var5_int = 31 / ((param1 - -42) / 51);
              if (null != ((ee) this).field_v) {
                StringBuilder discarded$9 = param0.append(" text=\"").append(((ee) this).field_v).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!((ee) this).field_w) {
                break L2;
              } else {
                StringBuilder discarded$10 = param0.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!((ee) this).c(89)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param0.append(" focused");
                break L3;
              }
            }
            L4: {
              if (((ee) this).field_q == null) {
                break L4;
              } else {
                StringBuilder discarded$12 = param0.append(" renderer=");
                if (!(((ee) this).field_q instanceof ee)) {
                  StringBuilder discarded$13 = param0.append(((ee) this).field_q);
                  break L4;
                } else {
                  param0 = ((ee) this).a(param2, 1 + param3, param0, true);
                  break L4;
                }
              }
            }
            L5: {
              if (((ee) this).field_k != null) {
                StringBuilder discarded$14 = param0.append(" listener=");
                if (((ee) this).field_k instanceof ee) {
                  param0 = ((ee) this).a(param2, param3 + 1, param0, true);
                  break L5;
                } else {
                  StringBuilder discarded$15 = param0.append(((ee) this).field_k);
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
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ee.CB(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 41);
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
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
        Object stackOut_3_0 = null;
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
              if (!((ee) this).a(param0, param1, -125, param2)) {
                break L1;
              } else {
                ((ee) this).a(param2, -110, param0, param1);
                break L1;
              }
            }
            if (param3) {
              stackOut_5_0 = (StringBuilder) param2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (StringBuilder) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ee.W(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(bk param0, int param1, byte param2) {
        try {
            na.field_d.a((da) (Object) param0, -104);
            if (param2 != -43) {
                field_n = null;
            }
            int discarded$0 = -15024;
            ae.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ee.FB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = ((ee) this).e(-15000);
        var5_int = param0;
        L0: while (true) {
          if (var4 < var5_int) {
            var5 = wi.b(param0 + 1);
            if (var5 != null) {
              kl.field_e.a(ul.field_n, var5, bi.field_h, -45);
              return;
            } else {
              return;
            }
          } else {
            ((ee) this).a(param2, param1, false, var5_int);
            var5_int++;
            continue L0;
          }
        }
    }

    boolean a(ee param0, int param1) {
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
            if (param1 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_y = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ee.RA(");
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
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
            int var7_int = -81 % ((-29 - param1) / 39);
            ((ee) this).field_z = 0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ee.Q(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    int e(int param0) {
        if (param0 != -15000) {
            ((ee) this).field_t = null;
            return 0;
        }
        return 0;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        v.a(param2, (byte) -24, param0, (String) null);
    }

    final static void a(int param0, int param1, h param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, eg param12, int param13, eg param14, int param15, int param16, h param17, int param18, h param19) {
        RuntimeException var21 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            int discarded$8 = 480;
            int discarded$9 = 67;
            hl.a(param14, param12);
            qc.a((byte) -118, 24, param18, 24, 18);
            ok.a(320, 240, (byte) -126);
            int discarded$10 = 2;
            int discarded$11 = 32;
            int discarded$12 = 8;
            int discarded$13 = 27;
            tc.a(param19, param17);
            int discarded$14 = 0;
            int discarded$15 = 69;
            ef.a(0, param2);
            oi.a(param3, param13, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var21;
            stackOut_4_1 = new StringBuilder().append("ee.NB(").append(32).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param3).append(44).append(0).append(44).append(24).append(44).append(0).append(44).append(240).append(44).append(2).append(44).append(320).append(44).append(0).append(44).append(480).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param13).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param14 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(24).append(44).append(18).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param17 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param18).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param19 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 8 + 41);
        }
    }

    boolean c(int param0) {
        if (param0 <= 76) {
            return true;
        }
        return false;
    }

    void a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (0 != param3) {
            break L0;
          } else {
            if (((ee) this).field_q != null) {
              ((ee) this).field_q.a((ee) this, param0, param1, (byte) 97, true);
              break L0;
            } else {
              if (!param2) {
                return;
              } else {
                String discarded$4 = ((ee) this).toString();
                return;
              }
            }
          }
        }
        if (param2) {
          String discarded$5 = ((ee) this).toString();
          return;
        } else {
          return;
        }
    }

    void d(int param0) {
        if (param0 != 6064) {
            ee.a((bk) null, 51, (byte) -94);
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        ((ee) this).field_m = param1;
        if (param0 <= 100) {
          boolean discarded$2 = ((ee) this).a((ee) null, -90);
          ((ee) this).field_i = param4;
          ((ee) this).field_p = param3;
          ((ee) this).field_l = param2;
          return;
        } else {
          ((ee) this).field_i = param4;
          ((ee) this).field_p = param3;
          ((ee) this).field_l = param2;
          return;
        }
    }

    ee(String param0, gg param1) {
        this(param0, kl.field_e.field_q, param1);
    }

    final void b(byte param0) {
        if (param0 <= 52) {
            return;
        }
        ((ee) this).a((byte) 114, ((ee) this).field_m, ((ee) this).field_l, ((ee) this).field_p, ((ee) this).field_i);
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        if (((ee) this).c(121)) {
            if (((ee) this).a(param1, param0, (byte) 126, (ee) this)) {
                return true;
            }
            var4 = param1;
            if (!(var4 != 80)) {
                return ((ee) this).a((ee) this, 0);
            }
            var4 = -89 / ((8 - param2) / 60);
            return false;
        }
        var4 = param1;
        if (!(var4 != 80)) {
            return ((ee) this).a((ee) this, 0);
        }
        var4 = -89 / ((8 - param2) / 60);
        return false;
    }

    String b(boolean param0) {
        if (!param0) {
          if (!((ee) this).field_w) {
            return null;
          } else {
            return ((ee) this).field_r;
          }
        } else {
          boolean discarded$9 = ((ee) this).a('4', -20, -6);
          if (!((ee) this).field_w) {
            return null;
          } else {
            return ((ee) this).field_r;
          }
        }
    }

    public final String toString() {
        return ((ee) this).a(new Hashtable(), 0, new StringBuilder(), true).toString();
    }

    protected ee() {
        ((ee) this).field_u = 0;
        ((ee) this).field_j = 0;
    }

    ee(String param0, j param1, gg param2) {
        RuntimeException runtimeException = null;
        gd var4 = null;
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
        ((ee) this).field_u = 0;
        ((ee) this).field_j = 0;
        try {
          L0: {
            L1: {
              ((ee) this).field_k = param2;
              ((ee) this).field_q = param1;
              ((ee) this).field_v = param0;
              if (!(((ee) this).field_q instanceof gd)) {
                break L1;
              } else {
                var4 = (gd) (Object) ((ee) this).field_q;
                ((ee) this).field_p = var4.c((ee) this, (byte) -93);
                ((ee) this).field_l = var4.b((ee) this, (byte) -4);
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
            stackOut_4_1 = new StringBuilder().append("ee.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    ee(int param0, int param1, int param2, int param3, j param4, gg param5) {
        ((ee) this).field_u = 0;
        ((ee) this).field_j = 0;
        try {
            ((ee) this).field_m = param0;
            ((ee) this).field_l = param3;
            ((ee) this).field_p = param2;
            ((ee) this).field_i = param1;
            ((ee) this).field_q = param4;
            ((ee) this).field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ee.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "More suggestions";
        field_x = new hb("usename");
        field_n = new int[]{5, 5, 5};
    }
}
