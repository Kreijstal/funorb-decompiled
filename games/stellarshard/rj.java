/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rj extends gg {
    vk field_r;
    lf field_v;
    uk field_u;
    int field_l;
    int field_p;
    boolean field_q;
    String field_m;
    String field_x;
    int field_k;
    int field_o;
    int field_t;
    int field_n;
    static pb field_s;
    int field_w;

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
            rj.c((byte) -1);
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                var5_int = ((rj) this).a((byte) 126, param0, eb.field_a, ni.field_e, param2) ? 1 : 0;
                stackOut_2_0 = ((rj) this).field_q;
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
                  ((rj) this).field_q = stackIn_10_1 != 0;
                  if (null == ((rj) this).field_v) {
                    break L2;
                  } else {
                    if (!(((rj) this).field_v instanceof da)) {
                      break L2;
                    } else {
                      ((da) (Object) ((rj) this).field_v).a((byte) 76, var5_int != 0, (rj) this);
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
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("rj.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    String d(int param0) {
        if (param0 == 3690) {
          if (!((rj) this).field_q) {
            return null;
          } else {
            return ((rj) this).field_x;
          }
        } else {
          ((rj) this).field_m = null;
          if (!((rj) this).field_q) {
            return null;
          } else {
            return ((rj) this).field_x;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (!((7 & param1) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var4 = param1 + var2;
        return var4;
    }

    boolean a(int param0, int param1, rj param2, int param3, int param4, int param5, int param6) {
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
            if (param4 >= 30) {
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
            stackOut_5_1 = new StringBuilder().append("rj.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
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
              if (!((rj) this).a((byte) 126, param6, param3, param1, param4)) {
                break L1;
              } else {
                ((rj) this).field_o = param2;
                break L1;
              }
            }
            if (param5 >= 24) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              ((rj) this).field_m = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("rj.P(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    boolean a(int param0, rj param1) {
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
            if (param0 == -2147483648) {
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
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rj.J(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final String toString() {
        return ((rj) this).a(0, false, new StringBuilder(), new Hashtable()).toString();
    }

    rj(String param0, lf param1) {
        this(param0, n.field_i.field_r, param1);
    }

    int a(boolean param0) {
        if (param0) {
            ((rj) this).a(-18, -25, 118);
            return 0;
        }
        return 0;
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        dl var6 = null;
        int var7 = 0;
        var7 = stellarshard.field_B;
        if (param1 < -116) {
          ((rj) this).a(param2, false, param3, (rj) this);
          var5 = ((rj) this).e(0) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (gh.field_c == 0) {
                nb.field_H = fb.field_n;
                int discarded$34 = 96;
                cl.a(((rj) this).d(3690));
                return param0;
              } else {
                ((rj) this).c(true);
                nb.field_H = fb.field_n;
                int discarded$35 = 96;
                cl.a(((rj) this).d(3690));
                return param0;
              }
            } else {
              nb.field_H = fb.field_n;
              int discarded$36 = 96;
              cl.a(((rj) this).d(3690));
              return param0;
            }
          } else {
            if (ke.field_b != 0) {
              if (var5 != 0) {
                L0: {
                  boolean discarded$37 = ((rj) this).a(param2, eb.field_a, (rj) this, ni.field_e, 63, ke.field_b, param3);
                  if (gh.field_c == 0) {
                    break L0;
                  } else {
                    if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                      param0 = false;
                      break L0;
                    } else {
                      if (var5 == 0) {
                        break L0;
                      } else {
                        L1: {
                          ((rj) this).c(true);
                          if (0 != fb.field_n) {
                            break L1;
                          } else {
                            if (nb.field_H != 0) {
                              ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                              var6 = lk.field_e;
                              if (var6 != null) {
                                L2: {
                                  if (var6.field_v instanceof jh) {
                                    ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                                lk.field_e = null;
                                break L1;
                              } else {
                                nb.field_H = fb.field_n;
                                int discarded$38 = 96;
                                cl.a(((rj) this).d(3690));
                                return param0;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        nb.field_H = fb.field_n;
                        int discarded$39 = 96;
                        cl.a(((rj) this).d(3690));
                        return param0;
                      }
                    }
                  }
                }
                if (0 != fb.field_n) {
                  nb.field_H = fb.field_n;
                  int discarded$40 = 96;
                  cl.a(((rj) this).d(3690));
                  return param0;
                } else {
                  if (nb.field_H != 0) {
                    ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                    var6 = lk.field_e;
                    if (var6 != null) {
                      L3: {
                        if (var6.field_v instanceof jh) {
                          ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      lk.field_e = null;
                      nb.field_H = fb.field_n;
                      int discarded$41 = 96;
                      cl.a(((rj) this).d(3690));
                      return param0;
                    } else {
                      nb.field_H = fb.field_n;
                      int discarded$42 = 96;
                      cl.a(((rj) this).d(3690));
                      return param0;
                    }
                  } else {
                    nb.field_H = fb.field_n;
                    int discarded$43 = 96;
                    cl.a(((rj) this).d(3690));
                    return param0;
                  }
                }
              } else {
                L4: {
                  if (gh.field_c == 0) {
                    break L4;
                  } else {
                    if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                      param0 = false;
                      break L4;
                    } else {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        ((rj) this).c(true);
                        if (0 != fb.field_n) {
                          nb.field_H = fb.field_n;
                          int discarded$44 = 96;
                          cl.a(((rj) this).d(3690));
                          return param0;
                        } else {
                          if (nb.field_H != 0) {
                            ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                            var6 = lk.field_e;
                            if (var6 != null) {
                              L5: {
                                if (var6.field_v instanceof jh) {
                                  ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              lk.field_e = null;
                              nb.field_H = fb.field_n;
                              int discarded$45 = 96;
                              cl.a(((rj) this).d(3690));
                              return param0;
                            } else {
                              nb.field_H = fb.field_n;
                              int discarded$46 = 96;
                              cl.a(((rj) this).d(3690));
                              return param0;
                            }
                          } else {
                            nb.field_H = fb.field_n;
                            int discarded$47 = 96;
                            cl.a(((rj) this).d(3690));
                            return param0;
                          }
                        }
                      }
                    }
                  }
                }
                if (0 != fb.field_n) {
                  nb.field_H = fb.field_n;
                  int discarded$48 = 96;
                  cl.a(((rj) this).d(3690));
                  return param0;
                } else {
                  if (nb.field_H != 0) {
                    ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                    var6 = lk.field_e;
                    if (var6 != null) {
                      L6: {
                        if (var6.field_v instanceof jh) {
                          ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      lk.field_e = null;
                      nb.field_H = fb.field_n;
                      int discarded$49 = 96;
                      cl.a(((rj) this).d(3690));
                      return param0;
                    } else {
                      nb.field_H = fb.field_n;
                      int discarded$50 = 96;
                      cl.a(((rj) this).d(3690));
                      return param0;
                    }
                  } else {
                    nb.field_H = fb.field_n;
                    int discarded$51 = 96;
                    cl.a(((rj) this).d(3690));
                    return param0;
                  }
                }
              }
            } else {
              L7: {
                if (gh.field_c == 0) {
                  break L7;
                } else {
                  if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                    param0 = false;
                    break L7;
                  } else {
                    if (var5 == 0) {
                      break L7;
                    } else {
                      ((rj) this).c(true);
                      if (0 != fb.field_n) {
                        nb.field_H = fb.field_n;
                        int discarded$52 = 96;
                        cl.a(((rj) this).d(3690));
                        return param0;
                      } else {
                        if (nb.field_H != 0) {
                          ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                          var6 = lk.field_e;
                          if (var6 != null) {
                            L8: {
                              if (var6.field_v instanceof jh) {
                                ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            lk.field_e = null;
                            nb.field_H = fb.field_n;
                            int discarded$53 = 96;
                            cl.a(((rj) this).d(3690));
                            return param0;
                          } else {
                            nb.field_H = fb.field_n;
                            int discarded$54 = 96;
                            cl.a(((rj) this).d(3690));
                            return param0;
                          }
                        } else {
                          nb.field_H = fb.field_n;
                          int discarded$55 = 96;
                          cl.a(((rj) this).d(3690));
                          return param0;
                        }
                      }
                    }
                  }
                }
              }
              if (0 != fb.field_n) {
                nb.field_H = fb.field_n;
                int discarded$56 = 96;
                cl.a(((rj) this).d(3690));
                return param0;
              } else {
                if (nb.field_H != 0) {
                  ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                  var6 = lk.field_e;
                  if (var6 != null) {
                    L9: {
                      if (var6.field_v instanceof jh) {
                        ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    lk.field_e = null;
                    nb.field_H = fb.field_n;
                    int discarded$57 = 96;
                    cl.a(((rj) this).d(3690));
                    return param0;
                  } else {
                    nb.field_H = fb.field_n;
                    int discarded$58 = 96;
                    cl.a(((rj) this).d(3690));
                    return param0;
                  }
                } else {
                  nb.field_H = fb.field_n;
                  int discarded$59 = 96;
                  cl.a(((rj) this).d(3690));
                  return param0;
                }
              }
            }
          }
        } else {
          L10: {
            ((rj) this).field_p = 21;
            ((rj) this).a(param2, false, param3, (rj) this);
            var5 = ((rj) this).e(0) ? 1 : 0;
            if (!param0) {
              if (var5 == 0) {
                break L10;
              } else {
                if (gh.field_c == 0) {
                  break L10;
                } else {
                  ((rj) this).c(true);
                  nb.field_H = fb.field_n;
                  int discarded$60 = 96;
                  cl.a(((rj) this).d(3690));
                  return param0;
                }
              }
            } else {
              if (ke.field_b != 0) {
                if (var5 != 0) {
                  L11: {
                    boolean discarded$61 = ((rj) this).a(param2, eb.field_a, (rj) this, ni.field_e, 63, ke.field_b, param3);
                    if (gh.field_c == 0) {
                      break L11;
                    } else {
                      if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                        param0 = false;
                        break L11;
                      } else {
                        if (var5 == 0) {
                          break L11;
                        } else {
                          ((rj) this).c(true);
                          break L11;
                        }
                      }
                    }
                  }
                  if (0 != fb.field_n) {
                    break L10;
                  } else {
                    if (nb.field_H != 0) {
                      ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                      var6 = lk.field_e;
                      if (var6 != null) {
                        L12: {
                          if (var6.field_v instanceof jh) {
                            ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        lk.field_e = null;
                        break L10;
                      } else {
                        nb.field_H = fb.field_n;
                        int discarded$62 = 96;
                        cl.a(((rj) this).d(3690));
                        return param0;
                      }
                    } else {
                      break L10;
                    }
                  }
                } else {
                  L13: {
                    if (gh.field_c == 0) {
                      break L13;
                    } else {
                      if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                        param0 = false;
                        break L13;
                      } else {
                        if (var5 == 0) {
                          break L13;
                        } else {
                          ((rj) this).c(true);
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    if (0 != fb.field_n) {
                      break L14;
                    } else {
                      if (nb.field_H != 0) {
                        ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                        var6 = lk.field_e;
                        if (var6 != null) {
                          L15: {
                            if (var6.field_v instanceof jh) {
                              ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          lk.field_e = null;
                          break L14;
                        } else {
                          nb.field_H = fb.field_n;
                          int discarded$63 = 96;
                          cl.a(((rj) this).d(3690));
                          return param0;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  nb.field_H = fb.field_n;
                  int discarded$64 = 96;
                  cl.a(((rj) this).d(3690));
                  return param0;
                }
              } else {
                L16: {
                  if (gh.field_c == 0) {
                    break L16;
                  } else {
                    if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                      param0 = false;
                      break L16;
                    } else {
                      if (var5 == 0) {
                        break L16;
                      } else {
                        ((rj) this).c(true);
                        break L16;
                      }
                    }
                  }
                }
                L17: {
                  if (0 != fb.field_n) {
                    break L17;
                  } else {
                    if (nb.field_H != 0) {
                      ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                      var6 = lk.field_e;
                      if (var6 != null) {
                        L18: {
                          if (var6.field_v instanceof jh) {
                            ((jh) (Object) var6.field_v).a((of) null, (byte) 106, var6);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        lk.field_e = null;
                        break L17;
                      } else {
                        nb.field_H = fb.field_n;
                        int discarded$65 = 96;
                        cl.a(((rj) this).d(3690));
                        return param0;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                nb.field_H = fb.field_n;
                int discarded$66 = 96;
                cl.a(((rj) this).d(3690));
                return param0;
              }
            }
          }
          nb.field_H = fb.field_n;
          int discarded$67 = 96;
          cl.a(((rj) this).d(3690));
          return param0;
        }
    }

    final void f(int param0) {
        if (param0 != 0) {
          ((rj) this).field_r = null;
          ((rj) this).b(((rj) this).field_p, ((rj) this).field_w, ((rj) this).field_k, ((rj) this).field_t, 23987);
          return;
        } else {
          ((rj) this).b(((rj) this).field_p, ((rj) this).field_w, ((rj) this).field_k, ((rj) this).field_t, 23987);
          return;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 > 123) {
          if (param3 >= param4 - -((rj) this).field_w) {
            if (param1 - -((rj) this).field_k > param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((rj) this).field_w + (param4 - -((rj) this).field_p) <= param3) {
                    break L1;
                  } else {
                    if (param1 + (((rj) this).field_k + ((rj) this).field_t) <= param2) {
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
          boolean discarded$1 = ((rj) this).a((byte) -24, 123, -112, 102, -44);
          if (param3 >= param4 - -((rj) this).field_w) {
            if (param1 - -((rj) this).field_k <= param2) {
              if (((rj) this).field_w + (param4 - -((rj) this).field_p) > param3) {
                if (param1 + (((rj) this).field_k + ((rj) this).field_t) <= param2) {
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

    void c(boolean param0) {
        if (!param0) {
            field_s = null;
        }
    }

    final boolean a(int param0, char param1, boolean param2) {
        int var4 = 0;
        if (((rj) this).e(0)) {
          if (!((rj) this).a(29657, param0, param1, (rj) this)) {
            if (param2) {
              var4 = param0;
              if (var4 == 80) {
                return ((rj) this).a(-2147483648, (rj) this);
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param2) {
            var4 = param0;
            if (var4 != 80) {
              return false;
            } else {
              return ((rj) this).a(-2147483648, (rj) this);
            }
          } else {
            return false;
          }
        }
    }

    final static void c(byte param0) {
        if (param0 == -94) {
          if (!cg.field_a) {
            throw new IllegalStateException();
          } else {
            qh.field_d = true;
            va.a(true, -844);
            eg.field_d = 0;
            return;
          }
        } else {
          field_s = null;
          if (!cg.field_a) {
            throw new IllegalStateException();
          } else {
            qh.field_d = true;
            va.a(true, -844);
            eg.field_d = 0;
            return;
          }
        }
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5_int = 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 44 / ((param0 - 15) / 38);
            if (!param1.containsKey(this)) {
              Object discarded$4 = param1.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("rj.JA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_4_0 != 0;
    }

    boolean a(int param0, int param1, char param2, rj param3) {
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
            if (param0 == 29657) {
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
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("rj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((rj) this).field_w = param1;
        if (param4 != 23987) {
          boolean discarded$2 = ((rj) this).a(50, (rj) null);
          ((rj) this).field_p = param0;
          ((rj) this).field_k = param2;
          ((rj) this).field_t = param3;
          return;
        } else {
          ((rj) this).field_p = param0;
          ((rj) this).field_k = param2;
          ((rj) this).field_t = param3;
          return;
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 != -57) {
            boolean discarded$10 = ((rj) this).a(-120, -51, 'ﾁ', (rj) null);
            if (param0 != 0) {
                return;
            }
            if (((rj) this).field_u == null) {
                return;
            }
            ((rj) this).field_u.a(true, param3, param2, (rj) this, 4549);
            return;
        }
        if (param0 != 0) {
            return;
        }
        if (((rj) this).field_u == null) {
            return;
        }
        ((rj) this).field_u.a(true, param3, param2, (rj) this, 4549);
    }

    void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
            int var7_int = -122 / ((-50 - param1) / 57);
            ((rj) this).field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rj.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var4 = ((rj) this).a(false);
        var5_int = param1;
        L0: while (true) {
          if (var4 < var5_int) {
            var5 = e.b(-1);
            if (var5 != null) {
              n.field_i.a(var5, h.field_c, am.field_f, (byte) 127);
              return;
            } else {
              return;
            }
          } else {
            ((rj) this).a(var5_int, (byte) -57, param2, param0);
            var5_int++;
            continue L0;
          }
        }
    }

    StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
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
              if (!param1) {
                break L1;
              } else {
                rj.b(false);
                break L1;
              }
            }
            L2: {
              if (((rj) this).a((byte) 55, param3, param2, param0)) {
                ((rj) this).a((byte) 126, param0, param2, param3);
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
            stackOut_7_1 = new StringBuilder().append("rj.T(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((rj) this).field_w).append(",").append(((rj) this).field_k).append(" ").append(((rj) this).field_p).append("x").append(((rj) this).field_t);
              if (((rj) this).field_m != null) {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((rj) this).field_m).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 76) {
                break L2;
              } else {
                ((rj) this).field_q = false;
                break L2;
              }
            }
            L3: {
              if (!((rj) this).field_q) {
                break L3;
              } else {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (((rj) this).e(0)) {
                StringBuilder discarded$11 = param2.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == ((rj) this).field_u) {
                break L5;
              } else {
                StringBuilder discarded$12 = param2.append(" renderer=");
                if (((rj) this).field_u instanceof rj) {
                  param2 = ((rj) this).a(param1 + 1, false, param2, param3);
                  break L5;
                } else {
                  StringBuilder discarded$13 = param2.append((Object) (Object) ((rj) this).field_u);
                  break L5;
                }
              }
            }
            L6: {
              if (null != ((rj) this).field_v) {
                StringBuilder discarded$14 = param2.append(" listener=");
                if (((rj) this).field_v instanceof rj) {
                  param2 = ((rj) this).a(1 + param1, false, param2, param3);
                  break L6;
                } else {
                  StringBuilder discarded$15 = param2.append((Object) (Object) ((rj) this).field_v);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("rj.IA(").append(param0).append(',').append(param1).append(',');
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
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    boolean e(int param0) {
        if (param0 != 0) {
            StringBuilder discarded$0 = ((rj) this).a(-83, false, (StringBuilder) null, (Hashtable) null);
            return false;
        }
        return false;
    }

    protected rj() {
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
    }

    rj(String param0, uk param1, lf param2) {
        RuntimeException runtimeException = null;
        pj var4 = null;
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
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
        try {
          L0: {
            L1: {
              ((rj) this).field_u = param1;
              ((rj) this).field_m = param0;
              ((rj) this).field_v = param2;
              if (!(((rj) this).field_u instanceof pj)) {
                break L1;
              } else {
                var4 = (pj) (Object) ((rj) this).field_u;
                ((rj) this).field_p = var4.a((rj) this, (byte) 124);
                ((rj) this).field_t = var4.a((rj) this, 28361);
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
            stackOut_4_1 = new StringBuilder().append("rj.<init>(");
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        L0: {
          if (ge.field_n == null) {
            break L0;
          } else {
            if (ge.field_n.length >= param1) {
              if (null == se.field_B) {
                L1: {
                  L2: {
                    se.field_B = new int[2 * param1];
                    if (null == qf.field_g) {
                      break L2;
                    } else {
                      if (qf.field_g.length < param1) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  qf.field_g = new int[2 * param1];
                  break L1;
                }
                if (null != wb.field_e) {
                  if (param1 > wb.field_e.length) {
                    L3: {
                      L4: {
                        wb.field_e = new int[param1 * 2];
                        if (null == vc.field_f) {
                          break L4;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (null == vh.field_h) {
                          break L6;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (fj.field_b == null) {
                          break L8;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L7;
                    }
                    L9: {
                      L10: {
                        if (null == vl.field_s) {
                          break L10;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L9;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  } else {
                    L11: {
                      L12: {
                        if (null == vc.field_f) {
                          break L12;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L11;
                    }
                    L13: {
                      L14: {
                        if (null == vh.field_h) {
                          break L14;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L13;
                    }
                    L15: {
                      L16: {
                        if (fj.field_b == null) {
                          break L16;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L15;
                    }
                    L17: {
                      L18: {
                        if (null == vl.field_s) {
                          break L18;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L17;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  }
                } else {
                  L19: {
                    L20: {
                      wb.field_e = new int[param1 * 2];
                      if (null == vc.field_f) {
                        break L20;
                      } else {
                        if (param1 > vc.field_f.length) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    vc.field_f = new int[param1 * 2];
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (null == vh.field_h) {
                        break L22;
                      } else {
                        if (param1 > vh.field_h.length) {
                          break L22;
                        } else {
                          break L21;
                        }
                      }
                    }
                    vh.field_h = new int[param1 * 2];
                    break L21;
                  }
                  L23: {
                    L24: {
                      if (fj.field_b == null) {
                        break L24;
                      } else {
                        if (fj.field_b.length < param1 - -param2) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    fj.field_b = new int[2 * (param1 + param2)];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (null == vl.field_s) {
                        break L26;
                      } else {
                        if (param1 > vl.field_s.length) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    vl.field_s = new boolean[param1 * 2];
                    break L25;
                  }
                  ta.field_q = 2147483647;
                  ce.field_b = -2147483648;
                  fh.field_b = 0;
                  af.field_k = 2147483647;
                  oe.field_c = -2147483648;
                  return;
                }
              } else {
                if (param1 > se.field_B.length) {
                  L27: {
                    L28: {
                      se.field_B = new int[2 * param1];
                      if (null == qf.field_g) {
                        break L28;
                      } else {
                        if (qf.field_g.length < param1) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    qf.field_g = new int[2 * param1];
                    break L27;
                  }
                  if (null != wb.field_e) {
                    if (param1 > wb.field_e.length) {
                      L29: {
                        L30: {
                          wb.field_e = new int[param1 * 2];
                          if (null == vc.field_f) {
                            break L30;
                          } else {
                            if (param1 > vc.field_f.length) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        vc.field_f = new int[param1 * 2];
                        break L29;
                      }
                      L31: {
                        L32: {
                          if (null == vh.field_h) {
                            break L32;
                          } else {
                            if (param1 > vh.field_h.length) {
                              break L32;
                            } else {
                              break L31;
                            }
                          }
                        }
                        vh.field_h = new int[param1 * 2];
                        break L31;
                      }
                      L33: {
                        L34: {
                          if (fj.field_b == null) {
                            break L34;
                          } else {
                            if (fj.field_b.length < param1 - -param2) {
                              break L34;
                            } else {
                              break L33;
                            }
                          }
                        }
                        fj.field_b = new int[2 * (param1 + param2)];
                        break L33;
                      }
                      L35: {
                        L36: {
                          if (null == vl.field_s) {
                            break L36;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L36;
                            } else {
                              break L35;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L35;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    } else {
                      L37: {
                        L38: {
                          if (null == vc.field_f) {
                            break L38;
                          } else {
                            if (param1 > vc.field_f.length) {
                              break L38;
                            } else {
                              break L37;
                            }
                          }
                        }
                        vc.field_f = new int[param1 * 2];
                        break L37;
                      }
                      L39: {
                        L40: {
                          if (null == vh.field_h) {
                            break L40;
                          } else {
                            if (param1 > vh.field_h.length) {
                              break L40;
                            } else {
                              break L39;
                            }
                          }
                        }
                        vh.field_h = new int[param1 * 2];
                        break L39;
                      }
                      L41: {
                        L42: {
                          if (fj.field_b == null) {
                            break L42;
                          } else {
                            if (fj.field_b.length < param1 - -param2) {
                              break L42;
                            } else {
                              break L41;
                            }
                          }
                        }
                        fj.field_b = new int[2 * (param1 + param2)];
                        break L41;
                      }
                      L43: {
                        L44: {
                          if (null == vl.field_s) {
                            break L44;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L44;
                            } else {
                              break L43;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L43;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    }
                  } else {
                    L45: {
                      L46: {
                        wb.field_e = new int[param1 * 2];
                        if (null == vc.field_f) {
                          break L46;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L46;
                          } else {
                            break L45;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L45;
                    }
                    L47: {
                      L48: {
                        if (null == vh.field_h) {
                          break L48;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L48;
                          } else {
                            break L47;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L47;
                    }
                    L49: {
                      L50: {
                        if (fj.field_b == null) {
                          break L50;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L50;
                          } else {
                            break L49;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L49;
                    }
                    L51: {
                      L52: {
                        if (null == vl.field_s) {
                          break L52;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L52;
                          } else {
                            break L51;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L51;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  }
                } else {
                  L53: {
                    L54: {
                      if (null == qf.field_g) {
                        break L54;
                      } else {
                        if (qf.field_g.length < param1) {
                          break L54;
                        } else {
                          break L53;
                        }
                      }
                    }
                    qf.field_g = new int[2 * param1];
                    break L53;
                  }
                  L55: {
                    L56: {
                      if (null == wb.field_e) {
                        break L56;
                      } else {
                        if (param1 <= wb.field_e.length) {
                          break L55;
                        } else {
                          break L56;
                        }
                      }
                    }
                    wb.field_e = new int[param1 * 2];
                    break L55;
                  }
                  L57: {
                    L58: {
                      if (null == vc.field_f) {
                        break L58;
                      } else {
                        if (param1 > vc.field_f.length) {
                          break L58;
                        } else {
                          break L57;
                        }
                      }
                    }
                    vc.field_f = new int[param1 * 2];
                    break L57;
                  }
                  L59: {
                    L60: {
                      if (null == vh.field_h) {
                        break L60;
                      } else {
                        if (param1 > vh.field_h.length) {
                          break L60;
                        } else {
                          break L59;
                        }
                      }
                    }
                    vh.field_h = new int[param1 * 2];
                    break L59;
                  }
                  if (fj.field_b != null) {
                    if (fj.field_b.length < param1 - -param2) {
                      L61: {
                        L62: {
                          fj.field_b = new int[2 * (param1 + param2)];
                          if (null == vl.field_s) {
                            break L62;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L62;
                            } else {
                              break L61;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L61;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    } else {
                      L63: {
                        L64: {
                          if (null == vl.field_s) {
                            break L64;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L64;
                            } else {
                              break L63;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L63;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    }
                  } else {
                    L65: {
                      L66: {
                        fj.field_b = new int[2 * (param1 + param2)];
                        if (null == vl.field_s) {
                          break L66;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L66;
                          } else {
                            break L65;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L65;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L67: {
          L68: {
            ge.field_n = new int[param1 * 2];
            if (null == se.field_B) {
              break L68;
            } else {
              if (param1 > se.field_B.length) {
                break L68;
              } else {
                break L67;
              }
            }
          }
          se.field_B = new int[2 * param1];
          break L67;
        }
        L69: {
          L70: {
            if (null == qf.field_g) {
              break L70;
            } else {
              if (qf.field_g.length < param1) {
                break L70;
              } else {
                break L69;
              }
            }
          }
          qf.field_g = new int[2 * param1];
          break L69;
        }
        L71: {
          L72: {
            if (null == wb.field_e) {
              break L72;
            } else {
              if (param1 <= wb.field_e.length) {
                break L71;
              } else {
                break L72;
              }
            }
          }
          wb.field_e = new int[param1 * 2];
          break L71;
        }
        L73: {
          L74: {
            if (null == vc.field_f) {
              break L74;
            } else {
              if (param1 > vc.field_f.length) {
                break L74;
              } else {
                break L73;
              }
            }
          }
          vc.field_f = new int[param1 * 2];
          break L73;
        }
        L75: {
          L76: {
            if (null == vh.field_h) {
              break L76;
            } else {
              if (param1 > vh.field_h.length) {
                break L76;
              } else {
                break L75;
              }
            }
          }
          vh.field_h = new int[param1 * 2];
          break L75;
        }
        L77: {
          L78: {
            if (fj.field_b == null) {
              break L78;
            } else {
              if (fj.field_b.length < param1 - -param2) {
                break L78;
              } else {
                break L77;
              }
            }
          }
          fj.field_b = new int[2 * (param1 + param2)];
          break L77;
        }
        L79: {
          L80: {
            if (null == vl.field_s) {
              break L80;
            } else {
              if (param1 > vl.field_s.length) {
                break L80;
              } else {
                break L79;
              }
            }
          }
          vl.field_s = new boolean[param1 * 2];
          break L79;
        }
        ta.field_q = 2147483647;
        ce.field_b = -2147483648;
        fh.field_b = 0;
        af.field_k = 2147483647;
        oe.field_c = -2147483648;
    }

    rj(int param0, int param1, int param2, int param3, uk param4, lf param5) {
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
        try {
            ((rj) this).field_k = param1;
            ((rj) this).field_w = param0;
            ((rj) this).field_t = param3;
            ((rj) this).field_v = param5;
            ((rj) this).field_u = param4;
            ((rj) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
