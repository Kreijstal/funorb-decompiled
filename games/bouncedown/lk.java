/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class lk extends ai {
    String field_q;
    ed field_l;
    int field_i;
    int field_u;
    static lj field_t;
    fc field_j;
    int field_v;
    int field_m;
    int field_r;
    sk field_n;
    static Boolean field_p;
    static String field_s;
    boolean field_g;
    int field_o;
    int field_k;
    String field_h;

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((lk) this).field_k = param2;
        ((lk) this).field_r = param3;
        ((lk) this).field_i = param4;
        ((lk) this).field_m = param0;
        if (param1 != 80) {
            ((lk) this).field_r = -53;
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
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
              var5_int = ((lk) this).c(uc.field_C, 0, param2, param1, ll.field_y) ? 1 : 0;
              if (var5_int == (((lk) this).field_g ? 1 : 0)) {
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
                ((lk) this).field_g = stackIn_4_1 != 0;
                if (null == ((lk) this).field_n) {
                  break L1;
                } else {
                  if (((lk) this).field_n instanceof dj) {
                    ((dj) (Object) ((lk) this).field_n).a(-124, var5_int != 0, (lk) this);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                ((lk) this).field_g = false;
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
            stackOut_11_1 = new StringBuilder().append("lk.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
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
              if (!((lk) this).a(param2, param3, (byte) 14, param0)) {
                break L1;
              } else {
                ((lk) this).a(param0, param3, param2, 32362);
                break L1;
              }
            }
            if (param1) {
              stackOut_5_0 = (StringBuilder) param3;
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
            stackOut_7_1 = new StringBuilder().append("lk.HA(").append(param0).append(44).append(param1).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    int f(int param0) {
        if (param0 != 0) {
            ((lk) this).field_k = -2;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            if (((lk) this).field_j != null) {
              ((lk) this).field_j.a(param1, (lk) this, (byte) -127, true, param3);
              break L0;
            } else {
              if (param2 >= 33) {
                return;
              } else {
                ((lk) this).field_l = null;
                return;
              }
            }
          }
        }
        if (param2 < 33) {
          ((lk) this).field_l = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              StringBuilder discarded$9 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((lk) this).field_r).append(",").append(((lk) this).field_i).append(" ").append(((lk) this).field_k).append("x").append(((lk) this).field_m);
              if (((lk) this).field_h == null) {
                break L1;
              } else {
                StringBuilder discarded$10 = param1.append(" text=\"").append(((lk) this).field_h).append(34);
                break L1;
              }
            }
            L2: {
              if (((lk) this).field_g) {
                StringBuilder discarded$11 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((lk) this).e(param3 + -32361)) {
                break L3;
              } else {
                StringBuilder discarded$12 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (param3 == 32362) {
                break L4;
              } else {
                boolean discarded$13 = ((lk) this).c(-89, 94, 115, -98, -13);
                break L4;
              }
            }
            L5: {
              if (((lk) this).field_j != null) {
                StringBuilder discarded$14 = param1.append(" renderer=");
                if (!(((lk) this).field_j instanceof lk)) {
                  StringBuilder discarded$15 = param1.append(((lk) this).field_j);
                  break L5;
                } else {
                  param1 = ((lk) this).a(1 + param0, true, param2, param1);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (null == ((lk) this).field_n) {
                break L6;
              } else {
                StringBuilder discarded$16 = param1.append(" listener=");
                if (!(((lk) this).field_n instanceof lk)) {
                  StringBuilder discarded$17 = param1.append(((lk) this).field_n);
                  break L6;
                } else {
                  param1 = ((lk) this).a(1 + param0, true, param2, param1);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("lk.OB(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 41);
        }
    }

    lk(String param0, sk param1) {
        this(param0, ma.field_m.field_c, param1);
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
            if (param4 != 34) {
                ((lk) this).field_q = null;
            }
            ((lk) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "lk.MA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    String d(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 0) {
          L0: {
            boolean discarded$10 = ((lk) this).e(15);
            if (((lk) this).field_g) {
              stackOut_7_0 = ((lk) this).field_q;
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
            if (((lk) this).field_g) {
              stackOut_3_0 = ((lk) this).field_q;
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

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
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
              if (param4 == 28455) {
                break L1;
              } else {
                boolean discarded$2 = ((lk) this).e(-128);
                break L1;
              }
            }
            if (!((lk) this).c(param3, 0, param6, param2, param5)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              ((lk) this).field_u = param0;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("lk.IA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        bj var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        ((lk) this).a(-1, param0, param3, (lk) this);
        var5 = ((lk) this).e(1) ? 1 : 0;
        if (param2) {
          L0: {
            if (0 == va.field_a) {
              break L0;
            } else {
              if (var5 != 0) {
                boolean discarded$1 = ((lk) this).a(param0, ll.field_y, va.field_a, uc.field_C, param3, (lk) this, true);
                break L0;
              } else {
                L1: {
                  if (vh.field_e == 0) {
                    break L1;
                  } else {
                    if (((lk) this).a(vh.field_e, (lk) this, param0, og.field_a, 28455, rk.field_a, param3)) {
                      param2 = false;
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L1;
                      } else {
                        ((lk) this).c((byte) 114);
                        break L1;
                      }
                    }
                  }
                }
                if (0 == n.field_m) {
                  if (0 != d.field_B) {
                    ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                    var6 = nd.field_A;
                    if (var6 != null) {
                      if (!(var6.field_n instanceof df)) {
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, ((lk) this).d(0));
                          return param2;
                        }
                      } else {
                        ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, ((lk) this).d(0));
                          return param2;
                        }
                      }
                    } else {
                      d.field_B = n.field_m;
                      if (!param1) {
                        return false;
                      } else {
                        gk.a(73, ((lk) this).d(0));
                        return param2;
                      }
                    }
                  } else {
                    d.field_B = n.field_m;
                    if (!param1) {
                      return false;
                    } else {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (!param1) {
                    return false;
                  } else {
                    gk.a(73, ((lk) this).d(0));
                    return param2;
                  }
                }
              }
            }
          }
          L2: {
            if (vh.field_e == 0) {
              break L2;
            } else {
              if (((lk) this).a(vh.field_e, (lk) this, param0, og.field_a, 28455, rk.field_a, param3)) {
                param2 = false;
                break L2;
              } else {
                L3: {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    ((lk) this).c((byte) 114);
                    break L3;
                  }
                }
                L4: {
                  if (0 != n.field_m) {
                    break L4;
                  } else {
                    if (0 == d.field_B) {
                      break L4;
                    } else {
                      ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                      var6 = nd.field_A;
                      if (var6 != null) {
                        if (!(var6.field_n instanceof df)) {
                          nd.field_A = null;
                          d.field_B = n.field_m;
                          if (param1) {
                            gk.a(73, ((lk) this).d(0));
                            return param2;
                          } else {
                            return false;
                          }
                        } else {
                          ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                          nd.field_A = null;
                          d.field_B = n.field_m;
                          if (param1) {
                            gk.a(73, ((lk) this).d(0));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        d.field_B = n.field_m;
                        if (param1) {
                          gk.a(73, ((lk) this).d(0));
                          return param2;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
                d.field_B = n.field_m;
                if (param1) {
                  gk.a(73, ((lk) this).d(0));
                  return param2;
                } else {
                  return false;
                }
              }
            }
          }
          L5: {
            if (0 != n.field_m) {
              break L5;
            } else {
              if (0 == d.field_B) {
                break L5;
              } else {
                ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                var6 = nd.field_A;
                if (var6 != null) {
                  if (!(var6.field_n instanceof df)) {
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  } else {
                    ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (param1) {
                    gk.a(73, ((lk) this).d(0));
                    return param2;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          d.field_B = n.field_m;
          if (param1) {
            gk.a(73, ((lk) this).d(0));
            return param2;
          } else {
            return false;
          }
        } else {
          if (var5 != 0) {
            if (vh.field_e != 0) {
              ((lk) this).c((byte) 114);
              d.field_B = n.field_m;
              if (!param1) {
                return false;
              } else {
                gk.a(73, ((lk) this).d(0));
                return param2;
              }
            } else {
              d.field_B = n.field_m;
              if (!param1) {
                return false;
              } else {
                gk.a(73, ((lk) this).d(0));
                return param2;
              }
            }
          } else {
            d.field_B = n.field_m;
            if (!param1) {
              return false;
            } else {
              gk.a(73, ((lk) this).d(0));
              return param2;
            }
          }
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        if (((lk) this).e(1)) {
          if (!((lk) this).a((lk) this, param2, param1, -14565)) {
            if (param0 <= -72) {
              var4 = param1;
              if (80 == var4) {
                return ((lk) this).a((lk) this, false);
              } else {
                return false;
              }
            } else {
              boolean discarded$4 = ((lk) this).a((byte) -98, -66, '￺');
              var4 = param1;
              if (80 == var4) {
                return ((lk) this).a((lk) this, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param0 <= -72) {
            var4 = param1;
            if (80 == var4) {
              return ((lk) this).a((lk) this, false);
            } else {
              return false;
            }
          } else {
            boolean discarded$5 = ((lk) this).a((byte) -98, -66, '￺');
            var4 = param1;
            if (80 == var4) {
              return ((lk) this).a((lk) this, false);
            } else {
              return false;
            }
          }
        }
    }

    final void g(int param0) {
        ((lk) this).b(((lk) this).field_m, param0 + -11133, ((lk) this).field_k, ((lk) this).field_r, ((lk) this).field_i);
        if (param0 != 11213) {
            StringBuilder discarded$0 = ((lk) this).a(69, false, (Hashtable) null, (StringBuilder) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = ((lk) this).f(0);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param2 > -28) {
              L1: {
                ((lk) this).a(88, (StringBuilder) null, (Hashtable) null, -53);
                int discarded$4 = -1;
                var5 = ag.b();
                if (var5 != null) {
                  ma.field_m.a(ha.field_b, var5, mh.field_Z, true);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                int discarded$5 = -1;
                var5 = ag.b();
                if (var5 != null) {
                  ma.field_m.a(ha.field_b, var5, mh.field_Z, true);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            ((lk) this).a(var5_int, param0, 85, param1);
            var5_int++;
            continue L0;
          }
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
            ((lk) this).c((byte) -37);
            return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
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
              if (param2 == 14) {
                break L1;
              } else {
                StringBuilder discarded$6 = ((lk) this).a(-119, false, (Hashtable) null, (StringBuilder) null);
                break L1;
              }
            }
            if (!param0.containsKey(this)) {
              Object discarded$7 = param0.put(this, this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              StringBuilder discarded$8 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            stackOut_7_1 = new StringBuilder().append("lk.PB(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0 != 0;
    }

    public static void b(byte param0) {
        field_s = null;
        int var1 = 30 / ((param0 - -5) / 58);
        field_t = null;
        field_p = null;
    }

    boolean a(lk param0, boolean param1) {
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((lk) this).a(8, 111, 24);
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
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lk.PA(");
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
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
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
              if (param6) {
                break L1;
              } else {
                lk.b((byte) -10);
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
            stackOut_4_1 = new StringBuilder().append("lk.GB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public final String toString() {
        return ((lk) this).a(0, true, new Hashtable(), new StringBuilder()).toString();
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 0) {
          if (param0 >= ((lk) this).field_r + param3) {
            if (param2 - -((lk) this).field_i <= param4) {
              if (param0 < param3 + ((lk) this).field_r + ((lk) this).field_k) {
                if (param4 >= ((lk) this).field_m + param2 - -((lk) this).field_i) {
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

    boolean a(lk param0, char param1, int param2, int param3) {
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
            if (param3 == -14565) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((lk) this).field_n = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("lk.E(");
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
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void c(byte param0) {
        if (param0 < 80) {
            ((lk) this).field_j = null;
        }
    }

    protected lk() {
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
    }

    lk(String param0, fc param1, sk param2) {
        RuntimeException runtimeException = null;
        sf var4 = null;
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
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
        try {
          L0: {
            L1: {
              ((lk) this).field_h = param0;
              ((lk) this).field_n = param2;
              ((lk) this).field_j = param1;
              if (!(((lk) this).field_j instanceof sf)) {
                break L1;
              } else {
                var4 = (sf) (Object) ((lk) this).field_j;
                ((lk) this).field_k = var4.a(-79925823, (lk) this);
                ((lk) this).field_m = var4.a((lk) this, 1);
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
            stackOut_4_1 = new StringBuilder().append("lk.<init>(");
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
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    lk(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
        try {
            ((lk) this).field_k = param2;
            ((lk) this).field_j = param4;
            ((lk) this).field_r = param0;
            ((lk) this).field_m = param3;
            ((lk) this).field_n = param5;
            ((lk) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "lk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new lj();
        field_s = "Password is valid";
    }
}
