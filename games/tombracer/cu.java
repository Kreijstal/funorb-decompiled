/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu extends nv {
    private int field_r;
    private kpa field_w;
    private int field_s;
    private int field_u;
    private kpa field_A;
    private boolean field_n;
    static String field_x;
    private int field_t;
    private int field_p;
    private int field_z;
    private int field_q;
    private int field_y;
    private int field_v;
    static int[] field_o;

    final kpa j(byte param0) {
        int var2 = -44 / ((-56 - param0) / 45);
        return ((cu) this).field_w;
    }

    private final fsa b(int param0) {
        int var2 = -100 / ((48 - param0) / 57);
        if (((cu) this).field_n) {
            return ((cu) this).field_g;
        }
        return ((cu) this).e(6);
    }

    private final void g(byte param0) {
        fsa var2 = null;
        if (param0 <= 54) {
          ((cu) this).field_q = 119;
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        } else {
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        }
    }

    private final int a(int param0, up param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var3_int = param1.field_j;
            if (param0 > 71) {
              L1: {
                if (0 >= ((cu) this).field_s) {
                  break L1;
                } else {
                  if (this.a(var3_int, (byte) 10)) {
                    L2: {
                      ((cu) this).field_s = ((cu) this).field_s - param1.field_b;
                      if (((cu) this).field_s <= 0) {
                        this.g((byte) 121);
                        break L2;
                      } else {
                        if (((cu) this).field_v <= 0) {
                          break L2;
                        } else {
                          if (!this.b(-106).m((byte) -99)) {
                            ((cu) this).field_v = ((cu) this).field_v - param1.field_b;
                            if (0 >= ((cu) this).field_v) {
                              this.d(true);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_14_0 = param1.field_b;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (0 >= ((cu) this).field_s) {
                  break L3;
                } else {
                  if (!this.a((byte) -94, var3_int)) {
                    break L3;
                  } else {
                    L4: {
                      ((cu) this).field_s = ((cu) this).field_s + param1.field_b;
                      if (((cu) this).field_s > ((cu) this).field_z) {
                        ((cu) this).field_s = ((cu) this).field_z;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    stackOut_21_0 = param1.field_b;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  }
                }
              }
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              stackOut_1_0 = 13;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("cu.H(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_24_0;
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 6) {
                ((cu) this).field_p = ((cu) this).field_y;
                ((cu) this).field_v = ((cu) this).field_r;
                ((cu) this).field_q = ((cu) this).field_u;
                ((cu) this).field_s = ((cu) this).field_z;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (((cu) this).field_w.a(0, var3_int)) {
                      break L3;
                    } else {
                      if (!((cu) this).field_A.a(0, var3_int)) {
                        var3_int++;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1.a(26492, true, var3_int);
                  var3_int++;
                  break L2;
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("cu.Q(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -123;
        }
        return 24;
    }

    private final boolean a(int param0, byte param1) {
        return ((cu) this).field_w.a(0, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((cu) this).field_r = param0;
        ((cu) this).field_y = param1;
        if (param2 < 29) {
            return;
        }
        ((cu) this).field_t = param3;
    }

    private final void d(boolean param0) {
        ((cu) this).field_v = ((cu) this).field_r;
        this.b(110).n(((cu) this).field_t, -127);
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var7_int = -96 / ((param4 - 62) / 52);
            stackOut_0_0 = this.a(94, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("cu.UB(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0;
    }

    final static hja a(boolean param0, int param1, cn param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (jna.a(param0, param1, param3, param2)) {
            return sba.d((byte) 120);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cu.CA(").append(param0).append(44).append(param1).append(44);
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
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
    }

    final void k(int param0) {
        if (-1 > ((cu) this).field_p) {
          ((cu) this).field_p = ((cu) this).field_p - 1;
          if (-1 == ((cu) this).field_p) {
            ((cu) this).field_v = ((cu) this).field_v + 1;
            ((cu) this).field_p = ((cu) this).field_y;
            if (((cu) this).field_r < ((cu) this).field_v) {
              L0: {
                ((cu) this).field_v = ((cu) this).field_r;
                if (-1 <= ((cu) this).field_q) {
                  break L0;
                } else {
                  ((cu) this).field_q = ((cu) this).field_q - 1;
                  if (-1 != ((cu) this).field_q) {
                    break L0;
                  } else {
                    ((cu) this).field_s = ((cu) this).field_s + 1;
                    ((cu) this).field_q = ((cu) this).field_u;
                    if (((cu) this).field_s > ((cu) this).field_z) {
                      ((cu) this).field_s = ((cu) this).field_z;
                      break L0;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((cu) this).field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                ((cu) this).field_q = -100;
                return;
              }
            } else {
              L1: {
                if (-1 <= ((cu) this).field_q) {
                  break L1;
                } else {
                  ((cu) this).field_q = ((cu) this).field_q - 1;
                  if (-1 != ((cu) this).field_q) {
                    break L1;
                  } else {
                    ((cu) this).field_s = ((cu) this).field_s + 1;
                    ((cu) this).field_q = ((cu) this).field_u;
                    if (((cu) this).field_s > ((cu) this).field_z) {
                      ((cu) this).field_s = ((cu) this).field_z;
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((cu) this).field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                ((cu) this).field_q = -100;
                return;
              }
            }
          } else {
            if (-1 < ((cu) this).field_q) {
              ((cu) this).field_q = ((cu) this).field_q - 1;
              if (((cu) this).field_q == 0) {
                ((cu) this).field_s = ((cu) this).field_s + 1;
                ((cu) this).field_q = ((cu) this).field_u;
                if (((cu) this).field_s > ((cu) this).field_z) {
                  ((cu) this).field_s = ((cu) this).field_z;
                  if (param0 != 5418) {
                    ((cu) this).field_q = -100;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 != 5418) {
                    ((cu) this).field_q = -100;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                ((cu) this).field_q = -100;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 < ((cu) this).field_q) {
            ((cu) this).field_q = ((cu) this).field_q - 1;
            if (((cu) this).field_q == 0) {
              ((cu) this).field_s = ((cu) this).field_s + 1;
              ((cu) this).field_q = ((cu) this).field_u;
              if (((cu) this).field_s > ((cu) this).field_z) {
                ((cu) this).field_s = ((cu) this).field_z;
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                ((cu) this).field_q = -100;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 5418) {
              ((cu) this).field_q = -100;
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, ep param1, up param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
              if (param0 == 25940) {
                break L1;
              } else {
                ((cu) this).field_w = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(76, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cu.BC(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -127, !((cu) this).field_n ? 0 : 1, 1);
            param1.a((byte) -29, ((cu) this).field_r, 8);
            param1.a((byte) -127, ((cu) this).field_z, 8);
            param1.a((byte) -128, ((cu) this).field_u, 4);
            param1.a((byte) -126, ((cu) this).field_y, 4);
            param1.a((byte) 107, ((cu) this).field_t, 8);
            ((cu) this).field_w.a(param1, (byte) -120);
            ((cu) this).field_A.a(param1, (byte) -120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cu.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    cu(la param0, boolean param1) {
        super(param0, param1);
        try {
            ((cu) this).field_u = 0;
            ((cu) this).field_r = 25;
            ((cu) this).field_t = 25;
            ((cu) this).field_z = 50;
            ((cu) this).field_y = 10;
            ((cu) this).field_n = false;
            ((cu) this).field_w = new kpa(6);
            ((cu) this).field_w.a(3, -17075, true);
            ((cu) this).field_w.a(0, -17075, true);
            ((cu) this).field_A = new kpa(6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_o = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -67) {
          L0: {
            stackOut_11_0 = er.c(param1, param2, 52);
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((param1 & 458752) == 0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          if (stackIn_14_0 | stackIn_14_1 == 0) {
            if (uu.a(true, param1, param2)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            var4 = null;
            hja discarded$8 = cu.a(true, -98, (cn) null, 106);
            stackOut_1_0 = er.c(param1, param2, 52);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((param1 & 458752) == 0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!uu.a(true, param1, param2)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
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
            if (param0 <= -85) {
              stackOut_3_0 = this.a(127, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -55;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cu.S(").append(param0).append(44);
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    cu(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((cu) this).field_n = param1.b((byte) 44, 1) == 1 ? true : false;
            ((cu) this).field_r = param1.b((byte) 44, 8);
            ((cu) this).field_z = param1.b((byte) 44, 8);
            ((cu) this).field_u = param1.b((byte) 44, 4);
            ((cu) this).field_y = param1.b((byte) 44, 4);
            ((cu) this).field_t = param1.b((byte) 44, 8);
            ((cu) this).field_w = new kpa(6, param0.field_E, param1);
            ((cu) this).field_A = new kpa(6, param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3 = -126 / ((19 - param0) / 56);
        return ((cu) this).field_A.a(0, param1);
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 27, param0, ((cu) this).field_s);
        if (param1 >= -48) {
          return 119;
        } else {
          param0 = fs.a((byte) 59, param0, ((cu) this).field_v);
          return param0;
        }
    }

    final void b(byte param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            this.g((byte) -127);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((cu) this).field_n = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((cu) this).field_n = stackIn_4_1 != 0;
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        ((cu) this).field_z = param1;
        ((cu) this).field_u = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Music: ";
    }
}
