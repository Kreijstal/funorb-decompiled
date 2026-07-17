/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.lang.String;

class el extends hf {
    int field_h;
    int field_r;
    dk field_w;
    int field_m;
    boolean field_l;
    String field_s;
    static int field_t;
    dh field_q;
    int field_v;
    int field_f;
    int field_k;
    int field_n;
    bb field_u;
    String field_j;
    static tf field_p;
    static int field_i;
    static gh field_o;
    static int field_g;

    final boolean a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (((el) this).e((byte) 54)) {
          if (!((el) this).a(param2, 13, param1, (el) this)) {
            var4 = 71 / ((param0 - -40) / 63);
            var5 = param2;
            if (var5 == 80) {
              return ((el) this).a((byte) -75, (el) this);
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = 71 / ((param0 - -40) / 63);
          var5 = param2;
          if (var5 == 80) {
            return ((el) this).a((byte) -75, (el) this);
          } else {
            return false;
          }
        }
    }

    public static void b() {
        field_o = null;
        field_p = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (param3 == 0) {
          if (null == ((el) this).field_q) {
            var5 = 35 % ((1 - param2) / 43);
            return;
          } else {
            ((el) this).field_q.a(param0, -81, param1, true, (el) this);
            var5 = 35 % ((1 - param2) / 43);
            return;
          }
        } else {
          var5 = 35 % ((1 - param2) / 43);
          return;
        }
    }

    int d(byte param0) {
        if (param0 < 82) {
            field_p = null;
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return ((el) this).a(0, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean a(int param0, int param1, char param2, el param3) {
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
            if (param1 == 13) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((el) this).field_u = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("el.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(boolean param0, int param1, el param2, int param3) {
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
            if (!param0) {
              L1: {
                var5_int = ((el) this).a(qa.field_a, -1, ue.field_e, param1, param3) ? 1 : 0;
                stackOut_2_0 = var5_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (((el) this).field_l) {
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
                if (stackIn_5_0 == stackIn_5_1) {
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
                  ((el) this).field_l = stackIn_10_1 != 0;
                  if (((el) this).field_u == null) {
                    break L2;
                  } else {
                    if (((el) this).field_u instanceof lg) {
                      ((lg) (Object) ((el) this).field_u).a(53, (el) this, var5_int != 0);
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
            stackOut_15_1 = new StringBuilder().append("el.H(").append(param0).append(44).append(param1).append(44);
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
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == -1) {
          if (param0 >= ((el) this).field_v + param4) {
            if (param2 >= ((el) this).field_m + param3) {
              if (param0 < param4 + ((el) this).field_v - -((el) this).field_r) {
                if (((el) this).field_h + (((el) this).field_m + param3) <= param2) {
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
          return true;
        }
    }

    el(String param0, bb param1) {
        this(param0, hb.field_j.field_b, param1);
    }

    boolean a(byte param0, el param1) {
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
            if (param0 <= -30) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((el) this).a(-77, -17, -47, -88, 79, (el) null, 49);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("el.UA(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        la var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        if (param1 > 126) {
          ((el) this).a(false, param3, (el) this, param2);
          var5 = ((el) this).e((byte) 54) ? 1 : 0;
          if (!param0) {
            L0: {
              if (var5 == 0) {
                break L0;
              } else {
                if (bi.field_g != 0) {
                  ((el) this).d(-126);
                  break L0;
                } else {
                  ij.field_X = gf.field_a;
                  int discarded$42 = 72;
                  sa.a(((el) this).c((byte) 69));
                  return param0;
                }
              }
            }
            ij.field_X = gf.field_a;
            int discarded$43 = 72;
            sa.a(((el) this).c((byte) 69));
            return param0;
          } else {
            if (0 != vc.field_i) {
              if (var5 != 0) {
                boolean discarded$44 = ((el) this).a(param3, vc.field_i, param2, -1, qa.field_a, (el) this, ue.field_e);
                if (0 != bi.field_g) {
                  if (((el) this).a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) this)) {
                    param0 = false;
                    if (gf.field_a == 0) {
                      if (0 != ij.field_X) {
                        ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                        var6 = lh.field_b;
                        if (var6 != null) {
                          L1: {
                            if (var6.field_u instanceof rg) {
                              ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          lh.field_b = null;
                          ij.field_X = gf.field_a;
                          int discarded$45 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        } else {
                          ij.field_X = gf.field_a;
                          int discarded$46 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        int discarded$47 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      int discarded$48 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  } else {
                    if (var5 != 0) {
                      L2: {
                        ((el) this).d(-127);
                        if (gf.field_a != 0) {
                          break L2;
                        } else {
                          if (0 == ij.field_X) {
                            break L2;
                          } else {
                            ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                            var6 = lh.field_b;
                            if (var6 != null) {
                              L3: {
                                if (var6.field_u instanceof rg) {
                                  ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              lh.field_b = null;
                              break L2;
                            } else {
                              ij.field_X = gf.field_a;
                              int discarded$49 = 72;
                              sa.a(((el) this).c((byte) 69));
                              return param0;
                            }
                          }
                        }
                      }
                      ij.field_X = gf.field_a;
                      int discarded$50 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    } else {
                      L4: {
                        if (gf.field_a != 0) {
                          break L4;
                        } else {
                          if (0 == ij.field_X) {
                            break L4;
                          } else {
                            ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                            var6 = lh.field_b;
                            if (var6 != null) {
                              L5: {
                                if (var6.field_u instanceof rg) {
                                  ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              lh.field_b = null;
                              break L4;
                            } else {
                              ij.field_X = gf.field_a;
                              int discarded$51 = 72;
                              sa.a(((el) this).c((byte) 69));
                              return param0;
                            }
                          }
                        }
                      }
                      ij.field_X = gf.field_a;
                      int discarded$52 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  }
                } else {
                  L6: {
                    if (gf.field_a != 0) {
                      break L6;
                    } else {
                      if (0 == ij.field_X) {
                        break L6;
                      } else {
                        ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                        var6 = lh.field_b;
                        if (var6 != null) {
                          L7: {
                            if (var6.field_u instanceof rg) {
                              ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          lh.field_b = null;
                          break L6;
                        } else {
                          ij.field_X = gf.field_a;
                          int discarded$53 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        }
                      }
                    }
                  }
                  ij.field_X = gf.field_a;
                  int discarded$54 = 72;
                  sa.a(((el) this).c((byte) 69));
                  return param0;
                }
              } else {
                if (0 != bi.field_g) {
                  if (((el) this).a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) this)) {
                    L8: {
                      param0 = false;
                      if (gf.field_a != 0) {
                        break L8;
                      } else {
                        if (0 == ij.field_X) {
                          break L8;
                        } else {
                          ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                          var6 = lh.field_b;
                          if (var6 != null) {
                            L9: {
                              if (var6.field_u instanceof rg) {
                                ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            lh.field_b = null;
                            ij.field_X = gf.field_a;
                            int discarded$55 = 72;
                            sa.a(((el) this).c((byte) 69));
                            return param0;
                          } else {
                            ij.field_X = gf.field_a;
                            int discarded$56 = 72;
                            sa.a(((el) this).c((byte) 69));
                            return param0;
                          }
                        }
                      }
                    }
                    ij.field_X = gf.field_a;
                    int discarded$57 = 72;
                    sa.a(((el) this).c((byte) 69));
                    return param0;
                  } else {
                    if (var5 != 0) {
                      L10: {
                        ((el) this).d(-127);
                        if (gf.field_a != 0) {
                          break L10;
                        } else {
                          if (0 == ij.field_X) {
                            break L10;
                          } else {
                            ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                            var6 = lh.field_b;
                            if (var6 != null) {
                              L11: {
                                if (var6.field_u instanceof rg) {
                                  ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              lh.field_b = null;
                              break L10;
                            } else {
                              ij.field_X = gf.field_a;
                              int discarded$58 = 72;
                              sa.a(((el) this).c((byte) 69));
                              return param0;
                            }
                          }
                        }
                      }
                      ij.field_X = gf.field_a;
                      int discarded$59 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    } else {
                      if (gf.field_a == 0) {
                        if (0 != ij.field_X) {
                          ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                          var6 = lh.field_b;
                          if (var6 == null) {
                            ij.field_X = gf.field_a;
                            int discarded$60 = 72;
                            sa.a(((el) this).c((byte) 69));
                            return param0;
                          } else {
                            L12: {
                              if (var6.field_u instanceof rg) {
                                ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            lh.field_b = null;
                            ij.field_X = gf.field_a;
                            int discarded$61 = 72;
                            sa.a(((el) this).c((byte) 69));
                            return param0;
                          }
                        } else {
                          ij.field_X = gf.field_a;
                          int discarded$62 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        int discarded$63 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    }
                  }
                } else {
                  if (gf.field_a == 0) {
                    if (0 != ij.field_X) {
                      ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                      var6 = lh.field_b;
                      if (var6 == null) {
                        ij.field_X = gf.field_a;
                        int discarded$64 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      } else {
                        L13: {
                          if (var6.field_u instanceof rg) {
                            ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        lh.field_b = null;
                        ij.field_X = gf.field_a;
                        int discarded$65 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      int discarded$66 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    int discarded$67 = 72;
                    sa.a(((el) this).c((byte) 69));
                    return param0;
                  }
                }
              }
            } else {
              if (0 != bi.field_g) {
                if (((el) this).a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) this)) {
                  param0 = false;
                  if (gf.field_a == 0) {
                    if (0 != ij.field_X) {
                      ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                      var6 = lh.field_b;
                      if (var6 != null) {
                        L14: {
                          if (var6.field_u instanceof rg) {
                            ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        lh.field_b = null;
                        ij.field_X = gf.field_a;
                        int discarded$68 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      } else {
                        ij.field_X = gf.field_a;
                        int discarded$69 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      int discarded$70 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    int discarded$71 = 72;
                    sa.a(((el) this).c((byte) 69));
                    return param0;
                  }
                } else {
                  if (var5 != 0) {
                    ((el) this).d(-127);
                    if (gf.field_a == 0) {
                      if (0 != ij.field_X) {
                        ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                        var6 = lh.field_b;
                        if (var6 != null) {
                          L15: {
                            if (var6.field_u instanceof rg) {
                              ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          lh.field_b = null;
                          ij.field_X = gf.field_a;
                          int discarded$72 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        } else {
                          ij.field_X = gf.field_a;
                          int discarded$73 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        int discarded$74 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      int discarded$75 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  } else {
                    if (gf.field_a == 0) {
                      if (0 != ij.field_X) {
                        ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                        var6 = lh.field_b;
                        if (var6 == null) {
                          ij.field_X = gf.field_a;
                          int discarded$76 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        } else {
                          L16: {
                            if (var6.field_u instanceof rg) {
                              ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          lh.field_b = null;
                          ij.field_X = gf.field_a;
                          int discarded$77 = 72;
                          sa.a(((el) this).c((byte) 69));
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        int discarded$78 = 72;
                        sa.a(((el) this).c((byte) 69));
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      int discarded$79 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  }
                }
              } else {
                if (gf.field_a == 0) {
                  if (0 != ij.field_X) {
                    ((el) this).a(param2, qa.field_a, true, (el) this, param3, ue.field_e);
                    var6 = lh.field_b;
                    if (var6 == null) {
                      ij.field_X = gf.field_a;
                      int discarded$80 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    } else {
                      L17: {
                        if (var6.field_u instanceof rg) {
                          ((rg) (Object) var6.field_u).a((fk) null, var6, 22176);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      lh.field_b = null;
                      ij.field_X = gf.field_a;
                      int discarded$81 = 72;
                      sa.a(((el) this).c((byte) 69));
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    int discarded$82 = 72;
                    sa.a(((el) this).c((byte) 69));
                    return param0;
                  }
                } else {
                  ij.field_X = gf.field_a;
                  int discarded$83 = 72;
                  sa.a(((el) this).c((byte) 69));
                  return param0;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
              if (!((el) this).a(param1, param3, 10095, param2)) {
                break L1;
              } else {
                ((el) this).a(param3, param2, 34, param1);
                break L1;
              }
            }
            if (param0 == 0) {
              stackOut_5_0 = (StringBuilder) param1;
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
            stackOut_7_1 = new StringBuilder().append("el.PA(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = Geoblox.field_C;
        int var4 = ((el) this).d((byte) 105);
        for (var5_int = param2; var4 >= var5_int; var5_int++) {
            ((el) this).a(param1, param0, (byte) 54, var5_int);
        }
        int discarded$0 = 55;
        String var5 = lf.c();
        if (!(var5 == null)) {
            hb.field_j.a(nj.field_g, true, bc.field_a, var5);
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        ((el) this).field_h = param0;
        ((el) this).field_v = param4;
        if (param2 >= -6) {
          ((el) this).field_k = 112;
          ((el) this).field_r = param1;
          ((el) this).field_m = param3;
          return;
        } else {
          ((el) this).field_r = param1;
          ((el) this).field_m = param3;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
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
            var8_int = 93 % ((-3 - param1) / 38);
            if (((el) this).a(param4, -1, param5, param0, param2)) {
              ((el) this).field_f = param3;
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("el.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
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
              if (param3 == -1) {
                break L1;
              } else {
                ((el) this).a(false, 57, (el) null, -122);
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
            stackOut_4_1 = new StringBuilder().append("el.EB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    String c(byte param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 69) {
          L0: {
            boolean discarded$14 = ((el) this).a((byte) -36, (el) null);
            if (((el) this).field_l) {
              stackOut_7_0 = ((el) this).field_j;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((el) this).field_l) {
              stackOut_3_0 = ((el) this).field_j;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((el) this).field_v).append(",").append(((el) this).field_m).append(" ").append(((el) this).field_r).append("x").append(((el) this).field_h);
              if (((el) this).field_s != null) {
                StringBuilder discarded$9 = param3.append(" text=\"").append(((el) this).field_s).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 34) {
                break L2;
              } else {
                ((el) this).field_v = -101;
                break L2;
              }
            }
            L3: {
              if (!((el) this).field_l) {
                break L3;
              } else {
                StringBuilder discarded$10 = param3.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (((el) this).e((byte) 54)) {
                StringBuilder discarded$11 = param3.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == ((el) this).field_q) {
                break L5;
              } else {
                StringBuilder discarded$12 = param3.append(" renderer=");
                if (!(((el) this).field_q instanceof el)) {
                  StringBuilder discarded$13 = param3.append(((el) this).field_q);
                  break L5;
                } else {
                  param3 = ((el) this).a(0, param3, param1, 1 + param0);
                  break L5;
                }
              }
            }
            L6: {
              if (null != ((el) this).field_u) {
                StringBuilder discarded$14 = param3.append(" listener=");
                if (((el) this).field_u instanceof el) {
                  param3 = ((el) this).a(0, param3, param1, 1 + param0);
                  break L6;
                } else {
                  StringBuilder discarded$15 = param3.append(((el) this).field_u);
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
            stackOut_21_1 = new StringBuilder().append("el.DC(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    void d(int param0) {
        if (param0 >= -122) {
            ((el) this).a(76, -76, 91);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (eh.field_d.field_f >= param1) {
              return true;
            } else {
              if (oc.field_e == null) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (param0 == 30000) {
                        break L1;
                      } else {
                        boolean discarded$18 = el.b(-45, -75);
                        break L1;
                      }
                    }
                    var2_int = oc.field_e.a((byte) 110);
                    if (var2_int <= 0) {
                      L2: {
                        if (var2_int < 0) {
                          jl.a((byte) -127);
                          break L2;
                        } else {
                          int discarded$19 = 12;
                          if (ll.a() <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            jl.a((byte) -127);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (-eh.field_d.field_f + param1 >= var2_int) {
                          break L3;
                        } else {
                          var2_int = param1 - eh.field_d.field_f;
                          break L3;
                        }
                      }
                      oc.field_e.a(eh.field_d.field_j, (byte) -97, eh.field_d.field_f, var2_int);
                      kh.field_e = oa.a(-12520);
                      eh.field_d.field_f = eh.field_d.field_f + var2_int;
                      if (param1 > eh.field_d.field_f) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        eh.field_d.field_f = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    jl.a((byte) -120);
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, qc param1, qc param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            int discarded$0 = 1;
            nh.a(param4, param3, 0, param2, param1.field_j, param1.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "el.WB(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    boolean e(byte param0) {
        if (param0 != 54) {
            boolean discarded$0 = ((el) this).a(65, 5, '￦', (el) null);
            return false;
        }
        return false;
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
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
              if (param2 == 10095) {
                break L1;
              } else {
                ((el) this).field_u = null;
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              StringBuilder discarded$4 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$5 = param3.put(this, this);
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
            stackOut_7_1 = new StringBuilder().append("el.CC(");
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void c(int param0) {
        int var2 = 117 % ((-3 - param0) / 63);
        ((el) this).a(((el) this).field_h, ((el) this).field_r, (byte) -113, ((el) this).field_m, ((el) this).field_v);
    }

    void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
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
              ((el) this).field_f = 0;
              if (param2) {
                break L1;
              } else {
                String discarded$2 = ((el) this).toString();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("el.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    protected el() {
        ((el) this).field_k = 0;
        ((el) this).field_n = 0;
    }

    el(String param0, dh param1, bb param2) {
        RuntimeException runtimeException = null;
        cc var4 = null;
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
        ((el) this).field_k = 0;
        ((el) this).field_n = 0;
        try {
          L0: {
            L1: {
              ((el) this).field_q = param1;
              ((el) this).field_u = param2;
              ((el) this).field_s = param0;
              if (!(((el) this).field_q instanceof cc)) {
                break L1;
              } else {
                var4 = (cc) (Object) ((el) this).field_q;
                ((el) this).field_r = var4.a((el) this, (byte) -33);
                ((el) this).field_h = var4.a(-122, (el) this);
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
            stackOut_4_1 = new StringBuilder().append("el.<init>(");
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    el(int param0, int param1, int param2, int param3, dh param4, bb param5) {
        ((el) this).field_k = 0;
        ((el) this).field_n = 0;
        try {
            ((el) this).field_r = param2;
            ((el) this).field_v = param0;
            ((el) this).field_h = param3;
            ((el) this).field_m = param1;
            ((el) this).field_u = param5;
            ((el) this).field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "el.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new tf();
        field_i = -1;
    }
}
