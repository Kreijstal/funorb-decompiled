/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_k;
    static fc field_c;
    int field_h;
    String[] field_b;
    String field_j;
    boolean field_i;
    static String field_g;
    boolean field_a;
    static lg[] field_d;
    static String field_f;
    static sd field_e;

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -81) {
            return;
        }
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(ke param0, byte param1) {
        RuntimeException runtimeException = null;
        ke var3 = null;
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
              ko.field_M = param0;
              if (param1 >= 97) {
                break L1;
              } else {
                var3 = (ke) null;
                ch.a((ke) null, (byte) -110);
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
            stackOut_3_1 = new StringBuilder().append("ch.A(");
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
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == 63) {
          if (null != nj.field_b) {
            if (de.field_f == 13) {
              nj.field_b = null;
              return true;
            } else {
              if (il.field_a) {
                if (!im.a(-1)) {
                  return false;
                } else {
                  L0: {
                    if (!gf.a(param0, param3, 78)) {
                      stackOut_53_0 = 0;
                      stackIn_54_0 = stackOut_53_0;
                      break L0;
                    } else {
                      stackOut_52_0 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      break L0;
                    }
                  }
                  L1: {
                    L2: {
                      var4 = stackIn_54_0;
                      if (-81 == (de.field_f ^ -1)) {
                        break L2;
                      } else {
                        if (-85 == (de.field_f ^ -1)) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    il.field_a = false;
                    var4 = 1;
                    break L1;
                  }
                  L3: {
                    if ((de.field_f ^ -1) == -14) {
                      fb.h(0);
                      var4 = 1;
                      il.field_a = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4 != 0;
                }
              } else {
                L4: {
                  if (pm.field_a) {
                    break L4;
                  } else {
                    if (9 == de.field_f) {
                      break L4;
                    } else {
                      if (-11 == (de.field_f ^ -1)) {
                        break L4;
                      } else {
                        if ((de.field_f ^ -1) == -12) {
                          break L4;
                        } else {
                          L5: {
                            if (de.field_f != 80) {
                              break L5;
                            } else {
                              if (!im.a(-1)) {
                                break L5;
                              } else {
                                il.field_a = true;
                                return true;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                  }
                }
                return cf.a(param1 ^ 31066, param0, param2);
              }
            }
          } else {
            if (il.field_a) {
              if (!im.a(-1)) {
                return false;
              } else {
                L6: {
                  if (!gf.a(param0, param3, 78)) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L6;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L6;
                  }
                }
                var4 = stackIn_23_0;
                if (-81 == (de.field_f ^ -1)) {
                  L7: {
                    il.field_a = false;
                    var4 = 1;
                    if ((de.field_f ^ -1) == -14) {
                      fb.h(0);
                      var4 = 1;
                      il.field_a = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return var4 != 0;
                } else {
                  if (-85 == (de.field_f ^ -1)) {
                    L8: {
                      il.field_a = false;
                      var4 = 1;
                      if ((de.field_f ^ -1) == -14) {
                        fb.h(0);
                        var4 = 1;
                        il.field_a = false;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return var4 != 0;
                  } else {
                    L9: {
                      if ((de.field_f ^ -1) == -14) {
                        fb.h(0);
                        var4 = 1;
                        il.field_a = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return var4 != 0;
                  }
                }
              }
            } else {
              if (!pm.field_a) {
                if (9 != de.field_f) {
                  L10: {
                    if (-11 == (de.field_f ^ -1)) {
                      break L10;
                    } else {
                      if ((de.field_f ^ -1) == -12) {
                        break L10;
                      } else {
                        L11: {
                          if (de.field_f != 80) {
                            break L11;
                          } else {
                            if (!im.a(-1)) {
                              break L11;
                            } else {
                              il.field_a = true;
                              return true;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  return cf.a(param1 ^ 31066, param0, param2);
                } else {
                  return cf.a(param1 ^ 31066, param0, param2);
                }
              } else {
                return cf.a(param1 ^ 31066, param0, param2);
              }
            }
          }
        } else {
          return true;
        }
    }

    ch(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_k = 82;
        field_g = "Spectate <%0>'s game";
        field_d = new lg[2];
        field_c = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_f = "If you are not, please change your password to something more obscure!";
    }
}
