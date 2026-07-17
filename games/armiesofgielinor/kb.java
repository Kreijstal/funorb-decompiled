/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class kb extends tc {
    static int field_A;
    static int[] field_o;
    int field_p;
    qo field_x;
    static me field_y;
    boolean field_t;
    int field_l;
    int field_z;
    kh field_k;
    int field_w;
    int field_q;
    int field_B;
    ju field_u;
    String field_s;
    String field_v;
    int field_r;
    static int field_n;
    static int[] field_m;

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 == 1) {
          if (param1 - -((kb) this).field_B <= param3) {
            if (param2 < param4 + ((kb) this).field_p) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((kb) this).field_l + (param1 - -((kb) this).field_B) <= param3) {
                    break L1;
                  } else {
                    if (((kb) this).field_p + param4 + ((kb) this).field_w <= param2) {
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
          ((kb) this).a(27, 29, 59, (kb) null);
          if (param1 - -((kb) this).field_B <= param3) {
            if (param2 >= param4 + ((kb) this).field_p) {
              if (((kb) this).field_l + (param1 - -((kb) this).field_B) > param3) {
                if (((kb) this).field_p + param4 + ((kb) this).field_w <= param2) {
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

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        try {
            ((kb) this).field_q = 0;
            int var7_int = 122 / ((param3 - -58) / 53);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "kb.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((kb) this).a((Hashtable) null, 105, (byte) 68, (StringBuilder) null);
            return false;
        }
        return false;
    }

    final void a(int param0, Hashtable param1, boolean param2, StringBuilder param3) {
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((kb) this).field_B).append(",").append(((kb) this).field_p).append(" ").append(((kb) this).field_l).append("x").append(((kb) this).field_w);
              if (((kb) this).field_v == null) {
                break L1;
              } else {
                StringBuilder discarded$9 = param3.append(" text=\"").append(((kb) this).field_v).append(34);
                break L1;
              }
            }
            L2: {
              if (((kb) this).field_t) {
                StringBuilder discarded$10 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            if (param2) {
              L3: {
                if (!((kb) this).a(false)) {
                  break L3;
                } else {
                  StringBuilder discarded$11 = param3.append(" focused");
                  break L3;
                }
              }
              L4: {
                if (((kb) this).field_k == null) {
                  break L4;
                } else {
                  L5: {
                    StringBuilder discarded$12 = param3.append(" renderer=");
                    if (!(((kb) this).field_k instanceof kb)) {
                      break L5;
                    } else {
                      param3 = ((kb) this).a(1 + param0, param3, 26477, param1);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  StringBuilder discarded$13 = param3.append(((kb) this).field_k);
                  break L4;
                }
              }
              L6: {
                if (null == ((kb) this).field_x) {
                  break L6;
                } else {
                  L7: {
                    StringBuilder discarded$14 = param3.append(" listener=");
                    if (!(((kb) this).field_x instanceof kb)) {
                      break L7;
                    } else {
                      param3 = ((kb) this).a(1 + param0, param3, 26477, param1);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  StringBuilder discarded$15 = param3.append(((kb) this).field_x);
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("kb.BB(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    int g(int param0) {
        if (param0 != -31989) {
            return 112;
        }
        return 0;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
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
              if (param3 >= 103) {
                break L1;
              } else {
                field_A = -35;
                break L1;
              }
            }
            if (!((kb) this).b(1, param1, param5, param0, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              ((kb) this).field_q = param6;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("kb.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
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
            if (param5 >= 93) {
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
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("kb.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        int var1 = 53 / ((-78 - param0) / 43);
        field_y = null;
    }

    final void e(int param0) {
        if (param0 != 0) {
            return;
        }
        ((kb) this).a(((kb) this).field_B, ((kb) this).field_l, ((kb) this).field_p, 8192, ((kb) this).field_w);
    }

    kb(String param0, qo param1) {
        this(param0, t.field_c.field_t, param1);
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        if (((kb) this).a(false)) {
          if (!((kb) this).a((kb) this, param0, param1, param2 + -12295)) {
            var4 = param0;
            if (var4 == 80) {
              return ((kb) this).a(param2 ^ 91, (kb) this);
            } else {
              if (param2 != 80) {
                field_y = null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          var4 = param0;
          if (var4 == 80) {
            return ((kb) this).a(param2 ^ 91, (kb) this);
          } else {
            if (param2 != 80) {
              field_y = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    String h(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 21384) {
          L0: {
            ((kb) this).field_l = 36;
            if (((kb) this).field_t) {
              stackOut_7_0 = ((kb) this).field_s;
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
            if (((kb) this).field_t) {
              stackOut_3_0 = ((kb) this).field_s;
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

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
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
              if (((kb) this).a(param3, param0, (byte) 74, param1)) {
                ((kb) this).a(param0, param3, true, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 26477) {
                break L2;
              } else {
                ((kb) this).field_B = -116;
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("kb.OA(").append(param0).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        wc var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((kb) this).a(32722, param2, param3, (kb) this);
        if (param1 == -6226) {
          L0: {
            L1: {
              var5 = ((kb) this).a(false) ? 1 : 0;
              if (!param0) {
                break L1;
              } else {
                L2: {
                  if (el.field_d == 0) {
                    break L2;
                  } else {
                    if (var5 != 0) {
                      boolean discarded$2 = ((kb) this).a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, (kb) this);
                      break L2;
                    } else {
                      L3: {
                        if (tr.field_A == 0) {
                          break L3;
                        } else {
                          L4: {
                            if (((kb) this).a(iu.field_t, param2, param3, 113, (kb) this, ur.field_z, tr.field_A)) {
                              break L4;
                            } else {
                              if (var5 != 0) {
                                ((kb) this).f(1);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                L5: {
                                  if (ro.field_ub != 0) {
                                    break L5;
                                  } else {
                                    if (au.field_Ob != 0) {
                                      L6: {
                                        ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                                        var6 = bn.field_f;
                                        if (var6 == null) {
                                          break L6;
                                        } else {
                                          L7: {
                                            if (var6.field_x instanceof ch) {
                                              ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          }
                                          bn.field_f = null;
                                          break L6;
                                        }
                                      }
                                      if (var7 == 0) {
                                        break L5;
                                      } else {
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          if (tr.field_A == 0) {
                                            break L5;
                                          } else {
                                            ((kb) this).f(1);
                                            break L5;
                                          }
                                        }
                                      }
                                    } else {
                                      au.field_Ob = ro.field_ub;
                                      as.a(param1 ^ 6225, ((kb) this).h(21384));
                                      return param0;
                                    }
                                  }
                                }
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, ((kb) this).h(21384));
                                return param0;
                              }
                            }
                          }
                          param0 = false;
                          break L3;
                        }
                      }
                      L8: {
                        if (ro.field_ub != 0) {
                          break L8;
                        } else {
                          if (au.field_Ob != 0) {
                            L9: {
                              ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                              var6 = bn.field_f;
                              if (var6 == null) {
                                break L9;
                              } else {
                                L10: {
                                  if (var6.field_x instanceof ch) {
                                    ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                bn.field_f = null;
                                break L9;
                              }
                            }
                            if (var7 == 0) {
                              break L8;
                            } else {
                              if (var5 == 0) {
                                break L8;
                              } else {
                                if (tr.field_A == 0) {
                                  break L8;
                                } else {
                                  ((kb) this).f(1);
                                  au.field_Ob = ro.field_ub;
                                  as.a(param1 ^ 6225, ((kb) this).h(21384));
                                  return param0;
                                }
                              }
                            }
                          } else {
                            au.field_Ob = ro.field_ub;
                            as.a(param1 ^ 6225, ((kb) this).h(21384));
                            return param0;
                          }
                        }
                      }
                      au.field_Ob = ro.field_ub;
                      as.a(param1 ^ 6225, ((kb) this).h(21384));
                      return param0;
                    }
                  }
                }
                L11: {
                  if (tr.field_A == 0) {
                    break L11;
                  } else {
                    L12: {
                      if (((kb) this).a(iu.field_t, param2, param3, 113, (kb) this, ur.field_z, tr.field_A)) {
                        break L12;
                      } else {
                        if (var5 != 0) {
                          ((kb) this).f(1);
                          if (var7 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        } else {
                          L13: {
                            if (ro.field_ub != 0) {
                              break L13;
                            } else {
                              if (au.field_Ob != 0) {
                                L14: {
                                  ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                                  var6 = bn.field_f;
                                  if (var6 == null) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (var6.field_x instanceof ch) {
                                        ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    bn.field_f = null;
                                    break L14;
                                  }
                                }
                                if (var7 == 0) {
                                  break L13;
                                } else {
                                  if (var5 == 0) {
                                    break L13;
                                  } else {
                                    if (tr.field_A == 0) {
                                      break L13;
                                    } else {
                                      ((kb) this).f(1);
                                      au.field_Ob = ro.field_ub;
                                      as.a(param1 ^ 6225, ((kb) this).h(21384));
                                      return param0;
                                    }
                                  }
                                }
                              } else {
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, ((kb) this).h(21384));
                                return param0;
                              }
                            }
                          }
                          au.field_Ob = ro.field_ub;
                          as.a(param1 ^ 6225, ((kb) this).h(21384));
                          return param0;
                        }
                      }
                    }
                    param0 = false;
                    break L11;
                  }
                }
                if (ro.field_ub != 0) {
                  break L0;
                } else {
                  if (au.field_Ob != 0) {
                    L16: {
                      ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                      var6 = bn.field_f;
                      if (var6 == null) {
                        break L16;
                      } else {
                        L17: {
                          if (var6.field_x instanceof ch) {
                            ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        bn.field_f = null;
                        break L16;
                      }
                    }
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, ((kb) this).h(21384));
                    return param0;
                  }
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if (tr.field_A == 0) {
                break L0;
              } else {
                ((kb) this).f(1);
                au.field_Ob = ro.field_ub;
                as.a(param1 ^ 6225, ((kb) this).h(21384));
                return param0;
              }
            }
          }
          au.field_Ob = ro.field_ub;
          as.a(param1 ^ 6225, ((kb) this).h(21384));
          return param0;
        } else {
          L18: {
            L19: {
              field_n = 69;
              var5 = ((kb) this).a(false) ? 1 : 0;
              if (!param0) {
                break L19;
              } else {
                if (el.field_d != 0) {
                  L20: {
                    if (var5 != 0) {
                      boolean discarded$3 = ((kb) this).a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, (kb) this);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (tr.field_A != 0) {
                    L21: {
                      L22: {
                        if (((kb) this).a(iu.field_t, param2, param3, 113, (kb) this, ur.field_z, tr.field_A)) {
                          break L22;
                        } else {
                          if (var5 != 0) {
                            ((kb) this).f(1);
                            if (var7 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          } else {
                            L23: {
                              if (ro.field_ub != 0) {
                                break L23;
                              } else {
                                if (au.field_Ob != 0) {
                                  L24: {
                                    ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                                    var6 = bn.field_f;
                                    if (var6 == null) {
                                      break L24;
                                    } else {
                                      L25: {
                                        if (var6.field_x instanceof ch) {
                                          ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      bn.field_f = null;
                                      break L24;
                                    }
                                  }
                                  if (var7 == 0) {
                                    break L23;
                                  } else {
                                    if (var5 == 0) {
                                      break L23;
                                    } else {
                                      if (tr.field_A == 0) {
                                        break L23;
                                      } else {
                                        ((kb) this).f(1);
                                        break L23;
                                      }
                                    }
                                  }
                                } else {
                                  au.field_Ob = ro.field_ub;
                                  as.a(param1 ^ 6225, ((kb) this).h(21384));
                                  return param0;
                                }
                              }
                            }
                            au.field_Ob = ro.field_ub;
                            as.a(param1 ^ 6225, ((kb) this).h(21384));
                            return param0;
                          }
                        }
                      }
                      param0 = false;
                      break L21;
                    }
                    if (ro.field_ub != 0) {
                      break L18;
                    } else {
                      if (au.field_Ob != 0) {
                        L26: {
                          ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                          var6 = bn.field_f;
                          if (var6 == null) {
                            break L26;
                          } else {
                            L27: {
                              if (var6.field_x instanceof ch) {
                                ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            bn.field_f = null;
                            break L26;
                          }
                        }
                        if (var7 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      } else {
                        au.field_Ob = ro.field_ub;
                        as.a(param1 ^ 6225, ((kb) this).h(21384));
                        return param0;
                      }
                    }
                  } else {
                    L28: {
                      if (ro.field_ub != 0) {
                        break L28;
                      } else {
                        if (au.field_Ob != 0) {
                          L29: {
                            ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                            var6 = bn.field_f;
                            if (var6 == null) {
                              break L29;
                            } else {
                              L30: {
                                if (var6.field_x instanceof ch) {
                                  ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              bn.field_f = null;
                              break L29;
                            }
                          }
                          if (var7 == 0) {
                            break L28;
                          } else {
                            if (var5 == 0) {
                              break L28;
                            } else {
                              if (tr.field_A == 0) {
                                break L28;
                              } else {
                                ((kb) this).f(1);
                                break L28;
                              }
                            }
                          }
                        } else {
                          au.field_Ob = ro.field_ub;
                          as.a(param1 ^ 6225, ((kb) this).h(21384));
                          return param0;
                        }
                      }
                    }
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, ((kb) this).h(21384));
                    return param0;
                  }
                } else {
                  L31: {
                    if (tr.field_A == 0) {
                      break L31;
                    } else {
                      L32: {
                        if (((kb) this).a(iu.field_t, param2, param3, 113, (kb) this, ur.field_z, tr.field_A)) {
                          break L32;
                        } else {
                          if (var5 != 0) {
                            ((kb) this).f(1);
                            if (var7 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          } else {
                            break L31;
                          }
                        }
                      }
                      param0 = false;
                      break L31;
                    }
                  }
                  L33: {
                    if (ro.field_ub != 0) {
                      break L33;
                    } else {
                      if (au.field_Ob != 0) {
                        L34: {
                          ((kb) this).a(param3, (kb) this, sm.field_d, (byte) -127, ko.field_b, param2);
                          var6 = bn.field_f;
                          if (var6 == null) {
                            break L34;
                          } else {
                            L35: {
                              if (var6.field_x instanceof ch) {
                                ((ch) (Object) var6.field_x).a(var6, -14486, (ku) null);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            bn.field_f = null;
                            break L34;
                          }
                        }
                        if (var7 == 0) {
                          break L33;
                        } else {
                          if (var5 == 0) {
                            break L33;
                          } else {
                            if (tr.field_A == 0) {
                              break L33;
                            } else {
                              ((kb) this).f(1);
                              break L33;
                            }
                          }
                        }
                      } else {
                        au.field_Ob = ro.field_ub;
                        as.a(param1 ^ 6225, ((kb) this).h(21384));
                        return param0;
                      }
                    }
                  }
                  au.field_Ob = ro.field_ub;
                  as.a(param1 ^ 6225, ((kb) this).h(21384));
                  return param0;
                }
              }
            }
            if (var5 == 0) {
              break L18;
            } else {
              if (tr.field_A == 0) {
                break L18;
              } else {
                ((kb) this).f(1);
                au.field_Ob = ro.field_ub;
                as.a(param1 ^ 6225, ((kb) this).h(21384));
                return param0;
              }
            }
          }
          au.field_Ob = ro.field_ub;
          as.a(param1 ^ 6225, ((kb) this).h(21384));
          return param0;
        }
    }

    void f(int param0) {
        if (param0 != 1) {
            String discarded$0 = ((kb) this).h(93);
        }
    }

    final boolean a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 >= 29) {
              if (param0.containsKey(this)) {
                StringBuilder discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                Object discarded$5 = param0.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
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
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("kb.FB(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public final String toString() {
        return ((kb) this).a(0, new StringBuilder(), 26477, new Hashtable()).toString();
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((kb) this).field_B = param0;
        if (param3 != 8192) {
            return;
        }
        ((kb) this).field_p = param2;
        ((kb) this).field_l = param1;
        ((kb) this).field_w = param4;
    }

    void a(int param0, int param1, byte param2, int param3) {
        L0: {
          if (0 != param3) {
            break L0;
          } else {
            if (((kb) this).field_k != null) {
              ((kb) this).field_k.a((kb) this, param0, -89, true, param1);
              break L0;
            } else {
              if (param2 <= -82) {
                return;
              } else {
                ((kb) this).field_t = false;
                return;
              }
            }
          }
        }
        if (param2 > -82) {
          ((kb) this).field_t = false;
          return;
        } else {
          return;
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
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
            if (param3 == -12215) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((kb) this).field_z = -5;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("kb.F(");
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, kb param1) {
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
            if (param0 == 11) {
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
            stackOut_5_1 = new StringBuilder().append("kb.M(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 == 32722) {
              L1: {
                var5_int = ((kb) this).b(param0 + -32721, param1, ko.field_b, sm.field_d, param2) ? 1 : 0;
                stackOut_2_0 = var5_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (((kb) this).field_t) {
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
                if (stackIn_5_0 != stackIn_5_1) {
                  break L2;
                } else {
                  L3: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5_int == 0) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  ((kb) this).field_t = stackIn_9_1 != 0;
                  if (null == ((kb) this).field_x) {
                    break L2;
                  } else {
                    if (!(((kb) this).field_x instanceof o)) {
                      break L2;
                    } else {
                      ((o) (Object) ((kb) this).field_x).a(var5_int != 0, false, (kb) this);
                      break L2;
                    }
                  }
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("kb.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 <= -117) {
          var4 = ((kb) this).g(-31989);
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                ((kb) this).a(param0, param2, (byte) -115, var5_int);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = bl.b(2);
            if (var5 == null) {
              return;
            } else {
              t.field_c.a(cc.field_b, -127, var5, lq.field_e);
              return;
            }
          }
        } else {
          field_A = 34;
          var4 = ((kb) this).g(-31989);
          var5_int = 0;
          L2: while (true) {
            L3: {
              if (var5_int > var4) {
                break L3;
              } else {
                ((kb) this).a(param0, param2, (byte) -115, var5_int);
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = bl.b(2);
            if (var5 == null) {
              return;
            } else {
              t.field_c.a(cc.field_b, -127, var5, lq.field_e);
              return;
            }
          }
        }
    }

    protected kb() {
        ((kb) this).field_z = 0;
        ((kb) this).field_r = 0;
    }

    kb(String param0, kh param1, qo param2) {
        RuntimeException runtimeException = null;
        pm var4 = null;
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
        ((kb) this).field_z = 0;
        ((kb) this).field_r = 0;
        try {
          L0: {
            L1: {
              ((kb) this).field_k = param1;
              ((kb) this).field_v = param0;
              ((kb) this).field_x = param2;
              if (!(((kb) this).field_k instanceof pm)) {
                break L1;
              } else {
                var4 = (pm) (Object) ((kb) this).field_k;
                ((kb) this).field_l = var4.a((kb) this, (byte) -120);
                ((kb) this).field_w = var4.a((kb) this, -2);
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
            stackOut_4_1 = new StringBuilder().append("kb.<init>(");
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    kb(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        ((kb) this).field_z = 0;
        ((kb) this).field_r = 0;
        try {
            ((kb) this).field_B = param0;
            ((kb) this).field_p = param1;
            ((kb) this).field_l = param2;
            ((kb) this).field_w = param3;
            ((kb) this).field_x = param5;
            ((kb) this).field_k = param4;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "kb.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new me(11, 0, 1, 2);
        field_n = 0;
        field_m = new int[8192];
    }
}
