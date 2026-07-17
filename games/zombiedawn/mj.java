/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private int field_l;
    private int field_f;
    private int field_j;
    private int field_i;
    int field_d;
    private int field_m;
    private tf field_k;
    private tf[] field_e;
    static int[] field_g;
    private fa field_a;
    private int field_h;
    private int field_c;
    static int field_b;

    private final tf a(int param0, int param1, int param2) {
        if (param0 != 1) {
            ((mj) this).field_j = 32;
            return this.a(false, param1, param2, 0);
        }
        return this.a(false, param1, param2, 0);
    }

    final static void a(int param0, int param1) {
        le var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bo var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                mj.a(103, -42);
                break L1;
              }
            }
            var4 = (bo) (Object) mp.field_g.b((byte) 26);
            L2: while (true) {
              if (var4 == null) {
                var2 = qi.field_J.b((byte) 26);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    pp.a(2, param0);
                    var2 = qi.field_J.a(false);
                    continue L3;
                  }
                }
              } else {
                ag.a(param0, true, var4);
                var4 = (bo) (Object) mp.field_g.a(false);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2_ref, "mj.J(" + param0 + 44 + param1 + 41);
        }
    }

    final fa a(int param0, int param1, int param2, int param3) {
        if (param2 != 29845) {
            ((mj) this).field_j = -108;
            return ((mj) this).a(param1 + -param0, param3 - param0, param3 - -param0, param0 + param1, true);
        }
        return ((mj) this).a(param1 + -param0, param3 - param0, param3 - -param0, param0 + param1, true);
    }

    private final tf a(boolean param0, int param1, int param2, int param3) {
        if (~param1 <= ~((mj) this).field_m) {
            return null;
        }
        if (param2 >= ((mj) this).field_d) {
            return null;
        }
        if (param1 < 0) {
            return null;
        }
        if (0 > param2) {
            return null;
        }
        tf var5 = ((mj) this).field_e[param2 - -(param1 * ((mj) this).field_d)];
        if (var5 == null) {
            if (param0) {
                tf dupTemp$0 = new tf();
                ((mj) this).field_e[param2 + param1 * ((mj) this).field_d] = dupTemp$0;
                var5 = dupTemp$0;
            }
        }
        return var5;
    }

    final fa b(boolean param0) {
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        fa stackIn_5_1 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        fa stackIn_14_1 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        fa stackIn_28_1 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        fa stackIn_38_1 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        fa stackIn_49_1 = null;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        fa stackOut_37_1 = null;
        Object stackOut_36_0 = null;
        Object stackOut_36_1 = null;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        fa stackOut_48_1 = null;
        Object stackOut_47_0 = null;
        Object stackOut_47_1 = null;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        fa stackOut_27_1 = null;
        Object stackOut_26_0 = null;
        Object stackOut_26_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        fa stackOut_4_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        fa stackOut_13_1 = null;
        Object stackOut_12_0 = null;
        Object stackOut_12_1 = null;
        var3 = ZombieDawn.field_J;
        if (null != ((mj) this).field_k) {
          L0: {
            if (null == ((mj) this).field_a) {
              L1: {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (null != ((mj) this).field_k) {
                  stackOut_37_0 = this;
                  stackOut_37_1 = ((mj) this).field_k.b(29);
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L1;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = null;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = (fa) (Object) stackOut_36_1;
                  break L1;
                }
              }
              ((mj) this).field_a = stackIn_38_1;
              break L0;
            } else {
              ((mj) this).field_a = ((mj) this).field_k.a(-6116);
              break L0;
            }
          }
          L2: while (true) {
            if (null != ((mj) this).field_a) {
              if (!param0) {
                return ((mj) this).field_a;
              } else {
                ((mj) this).field_a = null;
                return ((mj) this).field_a;
              }
            } else {
              L3: {
                ((mj) this).field_l = ((mj) this).field_l + 1;
                if (~((mj) this).field_j <= ~((mj) this).field_l) {
                  break L3;
                } else {
                  ((mj) this).field_c = ((mj) this).field_c + 1;
                  ((mj) this).field_l = ((mj) this).field_f;
                  if (((mj) this).field_h < ((mj) this).field_c) {
                    L4: {
                      ((mj) this).field_a = null;
                      if (!param0) {
                        break L4;
                      } else {
                        ((mj) this).field_a = null;
                        break L4;
                      }
                    }
                    return ((mj) this).field_a;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                ((mj) this).field_k = this.a(1, ((mj) this).field_c, ((mj) this).field_l);
                stackOut_46_0 = this;
                stackIn_48_0 = stackOut_46_0;
                stackIn_47_0 = stackOut_46_0;
                if (((mj) this).field_k != null) {
                  stackOut_48_0 = this;
                  stackOut_48_1 = ((mj) this).field_k.b(45);
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  break L5;
                } else {
                  stackOut_47_0 = this;
                  stackOut_47_1 = null;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = (fa) (Object) stackOut_47_1;
                  break L5;
                }
              }
              ((mj) this).field_a = stackIn_49_1;
              continue L2;
            }
          }
        } else {
          ((mj) this).field_k = this.a(1, ((mj) this).field_c, ((mj) this).field_l);
          if (null != ((mj) this).field_a) {
            ((mj) this).field_a = ((mj) this).field_k.a(-6116);
            L6: while (true) {
              L7: {
                if (null != ((mj) this).field_a) {
                  break L7;
                } else {
                  L8: {
                    ((mj) this).field_l = ((mj) this).field_l + 1;
                    if (~((mj) this).field_j <= ~((mj) this).field_l) {
                      break L8;
                    } else {
                      ((mj) this).field_c = ((mj) this).field_c + 1;
                      ((mj) this).field_l = ((mj) this).field_f;
                      if (((mj) this).field_h < ((mj) this).field_c) {
                        ((mj) this).field_a = null;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    ((mj) this).field_k = this.a(1, ((mj) this).field_c, ((mj) this).field_l);
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (((mj) this).field_k != null) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = ((mj) this).field_k.b(45);
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      break L9;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = null;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = (fa) (Object) stackOut_26_1;
                      break L9;
                    }
                  }
                  ((mj) this).field_a = stackIn_28_1;
                  continue L6;
                }
              }
              L10: {
                if (!param0) {
                  break L10;
                } else {
                  ((mj) this).field_a = null;
                  break L10;
                }
              }
              return ((mj) this).field_a;
            }
          } else {
            L11: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (null != ((mj) this).field_k) {
                stackOut_4_0 = this;
                stackOut_4_1 = ((mj) this).field_k.b(29);
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L11;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = null;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = (fa) (Object) stackOut_3_1;
                break L11;
              }
            }
            ((mj) this).field_a = stackIn_5_1;
            L12: while (true) {
              L13: {
                if (null != ((mj) this).field_a) {
                  break L13;
                } else {
                  L14: {
                    ((mj) this).field_l = ((mj) this).field_l + 1;
                    if (~((mj) this).field_j <= ~((mj) this).field_l) {
                      break L14;
                    } else {
                      ((mj) this).field_c = ((mj) this).field_c + 1;
                      ((mj) this).field_l = ((mj) this).field_f;
                      if (((mj) this).field_h < ((mj) this).field_c) {
                        ((mj) this).field_a = null;
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    ((mj) this).field_k = this.a(1, ((mj) this).field_c, ((mj) this).field_l);
                    stackOut_11_0 = this;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (((mj) this).field_k != null) {
                      stackOut_13_0 = this;
                      stackOut_13_1 = ((mj) this).field_k.b(45);
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L15;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = null;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = (fa) (Object) stackOut_12_1;
                      break L15;
                    }
                  }
                  ((mj) this).field_a = stackIn_14_1;
                  continue L12;
                }
              }
              L16: {
                if (!param0) {
                  break L16;
                } else {
                  ((mj) this).field_a = null;
                  break L16;
                }
              }
              return ((mj) this).field_a;
            }
          }
        }
    }

    final void a(int param0, int param1, fa param2, int param3) {
        tf var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((mj) this).field_j = -40;
                break L1;
              }
            }
            L2: {
              var5 = this.a(true, param0, param3, 0);
              if (var5 == null) {
                break L2;
              } else {
                var5.a((byte) 65, param2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("mj.B(").append(param0).append(44).append(param1).append(44);
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -6;
    }

    final fa a(boolean param0) {
        if (!param0) {
            ((mj) this).field_a = null;
            return ((mj) this).a(0, 0, -1 + ((mj) this).field_d, -1 + ((mj) this).field_m, true);
        }
        return ((mj) this).a(0, 0, -1 + ((mj) this).field_d, -1 + ((mj) this).field_m, true);
    }

    final fa a(int param0, int param1, int param2, int param3, boolean param4) {
        ((mj) this).field_i = param0 < 0 ? 0 : param0;
        ((mj) this).field_h = ~param3 <= ~((mj) this).field_m ? -1 + ((mj) this).field_m : param3;
        ((mj) this).field_f = param1 < 0 ? 0 : param1;
        ((mj) this).field_j = ~param2 > ~((mj) this).field_d ? param2 : ((mj) this).field_d - 1;
        if (!param4) {
            ((mj) this).field_i = 26;
            ((mj) this).field_a = null;
            ((mj) this).field_k = null;
            ((mj) this).field_l = ((mj) this).field_f;
            ((mj) this).field_c = ((mj) this).field_i;
            return ((mj) this).b(!param4 ? true : false);
        }
        ((mj) this).field_a = null;
        ((mj) this).field_k = null;
        ((mj) this).field_l = ((mj) this).field_f;
        ((mj) this).field_c = ((mj) this).field_i;
        return ((mj) this).b(!param4 ? true : false);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) ng.field_b);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ng.field_b);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) ng.field_b);
            if (param0 != 3490) {
                field_b = 29;
            }
            le.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "mj.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    mj(int param0, int param1) {
        ((mj) this).field_d = param0;
        ((mj) this).field_m = param1;
        ((mj) this).field_e = new tf[((mj) this).field_d * ((mj) this).field_m];
    }

    static {
    }
}
