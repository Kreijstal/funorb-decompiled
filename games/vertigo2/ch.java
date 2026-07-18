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
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(ke param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
                var3 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ch.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
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
                  if (!gf.a(13, 12, 78)) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L0;
                  } else {
                    stackOut_50_0 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    break L0;
                  }
                }
                L1: {
                  L2: {
                    var4 = stackIn_52_0;
                    if (de.field_f == 80) {
                      break L2;
                    } else {
                      if (de.field_f == 84) {
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
                  if (de.field_f == 13) {
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
                    if (de.field_f == 10) {
                      break L4;
                    } else {
                      if (de.field_f == 11) {
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
              return cf.a(31077, 13, 15);
            }
          }
        } else {
          if (il.field_a) {
            if (!im.a(-1)) {
              return false;
            } else {
              L6: {
                if (!gf.a(13, 12, 78)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L6;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L6;
                }
              }
              var4 = stackIn_21_0;
              if (de.field_f == 80) {
                L7: {
                  il.field_a = false;
                  var4 = 1;
                  if (de.field_f == 13) {
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
                if (de.field_f == 84) {
                  L8: {
                    il.field_a = false;
                    var4 = 1;
                    if (de.field_f == 13) {
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
                    if (de.field_f == 13) {
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
                  if (de.field_f == 10) {
                    break L10;
                  } else {
                    if (de.field_f == 11) {
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
                return cf.a(31077, 13, 15);
              } else {
                return cf.a(31077, 13, 15);
              }
            } else {
              return cf.a(31077, 13, 15);
            }
          }
        }
    }

    ch(boolean param0) {
        ((ch) this).field_a = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 82;
        field_g = "Spectate <%0>'s game";
        field_d = new lg[2];
        field_c = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_f = "If you are not, please change your password to something more obscure!";
    }
}
