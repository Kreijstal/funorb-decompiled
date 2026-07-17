/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends sj {
    static long field_F;
    static String field_y;
    private int[] field_v;
    private int[] field_B;
    private ua field_q;
    static uo field_p;
    private boolean field_r;
    private ti field_t;
    private ua field_A;
    private boolean field_w;
    static byte[] field_K;
    ti field_x;
    private int field_I;
    static String field_E;
    static String field_s;
    static String field_J;
    private int field_z;
    private ua field_G;
    private int field_u;
    static pc field_o;
    private int field_D;
    static String field_L;
    ti field_H;

    final static void a(java.applet.Applet param0) {
        try {
            int discarded$0 = 1;
            gj.a("", param0);
            int discarded$1 = 3279;
            vf.a(param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vi.I(" + (param0 != null ? "{...}" : "null") + 44 + 22770 + 41);
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, ua param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        ti stackIn_40_0 = null;
        ua stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        ti stackIn_41_0 = null;
        ua stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        ti stackIn_42_0 = null;
        ua stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        ti stackIn_49_0 = null;
        ua stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        ti stackIn_50_0 = null;
        ua stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        ti stackIn_51_0 = null;
        ua stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        ti stackOut_48_0 = null;
        ua stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        ti stackOut_50_0 = null;
        ua stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        ti stackOut_49_0 = null;
        ua stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        ti stackOut_39_0 = null;
        ua stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        ti stackOut_41_0 = null;
        ua stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        ti stackOut_40_0 = null;
        ua stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((vi) this).field_r) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (((vi) this).field_u > 0) {
                      L3: {
                        if (null != ((vi) this).field_q) {
                          ((vi) this).field_x.g(-84);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((vi) this).field_q = param4;
                      if (param4 != null) {
                        ((vi) this).field_x.a(param4, -39, false);
                        this.a(-24762, param5, param0, ((vi) this).field_x);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((vi) this).field_A == null) {
                          break L4;
                        } else {
                          ((vi) this).field_H.g(-29);
                          break L4;
                        }
                      }
                      ((vi) this).field_A = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        ((vi) this).field_H.a(param4, -39, false);
                        this.a(-24762, param5, param0, ((vi) this).field_H);
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param1) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            ((vi) this).field_r = stackIn_19_1 != 0;
            if (param4 == ((vi) this).field_q) {
              ((vi) this).field_u = param2;
              this.a(-24762, param5, param0, ((vi) this).field_x);
              return;
            } else {
              if (((vi) this).field_A != param4) {
                L6: {
                  if (param3 >= 110) {
                    break L6;
                  } else {
                    ((vi) this).field_B = null;
                    break L6;
                  }
                }
                L7: {
                  if (((vi) this).field_q != null) {
                    if (null != ((vi) this).field_A) {
                      L8: {
                        if (((vi) this).field_z >= 524288) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L8;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_34_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (null != ((vi) this).field_A) {
                        ((vi) this).field_H.g(-8);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      ((vi) this).field_A = param4;
                      if (param4 == null) {
                        break L11;
                      } else {
                        L12: {
                          stackOut_48_0 = ((vi) this).field_H;
                          stackOut_48_1 = (ua) param4;
                          stackOut_48_2 = -39;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_50_2 = stackOut_48_2;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          if (param1) {
                            stackOut_50_0 = (ti) (Object) stackIn_50_0;
                            stackOut_50_1 = (ua) (Object) stackIn_50_1;
                            stackOut_50_2 = stackIn_50_2;
                            stackOut_50_3 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            stackIn_51_3 = stackOut_50_3;
                            break L12;
                          } else {
                            stackOut_49_0 = (ti) (Object) stackIn_49_0;
                            stackOut_49_1 = (ua) (Object) stackIn_49_1;
                            stackOut_49_2 = stackIn_49_2;
                            stackOut_49_3 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            stackIn_51_3 = stackOut_49_3;
                            break L12;
                          }
                        }
                        ((ti) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_51_3 != 0);
                        this.a(-24762, param5, param0, ((vi) this).field_H);
                        break L11;
                      }
                    }
                    ((vi) this).field_u = -param2;
                    break L9;
                  } else {
                    L13: {
                      if (null == ((vi) this).field_q) {
                        break L13;
                      } else {
                        ((vi) this).field_x.g(127);
                        break L13;
                      }
                    }
                    L14: {
                      ((vi) this).field_q = param4;
                      if (param4 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_39_0 = ((vi) this).field_x;
                          stackOut_39_1 = (ua) param4;
                          stackOut_39_2 = -39;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          if (param1) {
                            stackOut_41_0 = (ti) (Object) stackIn_41_0;
                            stackOut_41_1 = (ua) (Object) stackIn_41_1;
                            stackOut_41_2 = stackIn_41_2;
                            stackOut_41_3 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            stackIn_42_2 = stackOut_41_2;
                            stackIn_42_3 = stackOut_41_3;
                            break L15;
                          } else {
                            stackOut_40_0 = (ti) (Object) stackIn_40_0;
                            stackOut_40_1 = (ua) (Object) stackIn_40_1;
                            stackOut_40_2 = stackIn_40_2;
                            stackOut_40_3 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            stackIn_42_3 = stackOut_40_3;
                            break L15;
                          }
                        }
                        ((ti) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3 != 0);
                        this.a(-24762, param5, param0, ((vi) this).field_x);
                        break L14;
                      }
                    }
                    ((vi) this).field_u = param2;
                    break L9;
                  }
                }
                break L0;
              } else {
                ((vi) this).field_u = -param2;
                this.a(-24762, param5, param0, ((vi) this).field_H);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("vi.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param4 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L16;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param5 + 41);
        }
    }

    final synchronized int a() {
        return 2;
    }

    final static int b(byte param0) {
        return um.field_r;
    }

    final sj b() {
        return null;
    }

    private final void a(int param0, int param1, int param2, ti param3) {
        try {
            param3.b(param1, false, -1);
            param3.c(param2, 274191016);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vi.F(" + -24762 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e() {
        field_y = null;
        field_s = null;
        field_L = null;
        field_p = null;
        int var1 = 125;
        field_o = null;
        field_K = null;
        field_J = null;
        field_E = null;
    }

    private final void a(ti param0, byte param1, ti param2) {
        try {
            ((vi) this).field_x = param0;
            ((vi) this).field_H = param2;
            ((vi) this).field_z = 1048576;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vi.G(" + (param0 != null ? "{...}" : "null") + 44 + 26 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 2) {
            field_y = null;
        }
        ((vi) this).field_D = param0;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (((vi) this).field_z <= 0) {
            break L0;
          } else {
            if (null != ((vi) this).field_q) {
              ((vi) this).field_x.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= ((vi) this).field_z) {
            break L1;
          } else {
            if (null != ((vi) this).field_A) {
              ((vi) this).field_H.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((vi) this).field_I <= 0) {
            break L2;
          } else {
            if (((vi) this).field_G == null) {
              break L2;
            } else {
              ((vi) this).field_t.a(param0);
              break L2;
            }
          }
        }
        L3: {
          if (((vi) this).field_r) {
            L4: {
              if (((vi) this).field_u <= 0) {
                break L4;
              } else {
                if (!((vi) this).field_x.a((byte) -76)) {
                  ((vi) this).field_r = false;
                  ((vi) this).field_u = -((vi) this).field_u;
                  ((vi) this).field_q = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (((vi) this).field_u >= 0) {
              break L3;
            } else {
              if (!((vi) this).field_H.a((byte) 112)) {
                ((vi) this).field_r = false;
                ((vi) this).field_u = -((vi) this).field_u;
                ((vi) this).field_A = null;
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (((vi) this).field_u == 0) {
            break L5;
          } else {
            L6: {
              ((vi) this).field_z = ((vi) this).field_z + ((vi) this).field_u * param0;
              if (((vi) this).field_z < 1048576) {
                if (((vi) this).field_z <= 0) {
                  ((vi) this).field_z = 0;
                  if (((vi) this).field_r) {
                    break L6;
                  } else {
                    ((vi) this).field_u = 0;
                    if (((vi) this).field_w) {
                      break L6;
                    } else {
                      L7: {
                        if (null != ((vi) this).field_q) {
                          ((vi) this).field_x.g(-104);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((vi) this).field_q = null;
                      break L6;
                    }
                  }
                } else {
                  break L5;
                }
              } else {
                ((vi) this).field_z = 1048576;
                if (((vi) this).field_r) {
                  break L6;
                } else {
                  ((vi) this).field_u = 0;
                  if (!((vi) this).field_w) {
                    L8: {
                      if (((vi) this).field_A != null) {
                        ((vi) this).field_H.g(-3);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((vi) this).field_A = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            break L5;
          }
        }
    }

    final static tf[] a(fm param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf[] stackIn_3_0 = null;
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
        tf[] stackOut_2_0 = null;
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
        try {
          L0: {
            var4_int = param0.a(127, param3);
            var5 = param0.a((byte) -114, param2, var4_int);
            stackOut_2_0 = se.a(var5, var4_int, 1000, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("vi.L(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(20049).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (mc.field_r == null) {
            break L0;
          } else {
            var1 = (Object) (Object) mc.field_r;
            synchronized (var1) {
              L1: {
                mc.field_r = null;
                break L1;
              }
            }
            break L0;
          }
        }
    }

    final sj d() {
        return null;
    }

    final static void f(int param0) {
        pj[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = up.field_n;
              var2 = 0;
              if (param0 > 31) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var1.length <= var2) {
                break L0;
              } else {
                var3 = var1[var2];
                var3.a((byte) -70);
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "vi.J(" + param0 + 41);
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (0 < ((vi) this).field_D) {
              L1: {
                if (!((vi) this).field_r) {
                  break L1;
                } else {
                  L2: {
                    if (((vi) this).field_u <= 0) {
                      break L2;
                    } else {
                      if (((vi) this).field_x.a((byte) 105)) {
                        break L2;
                      } else {
                        ((vi) this).field_q = null;
                        ((vi) this).field_r = false;
                        ((vi) this).field_u = -((vi) this).field_u;
                        break L1;
                      }
                    }
                  }
                  if (((vi) this).field_u >= 0) {
                    break L1;
                  } else {
                    if (!((vi) this).field_H.a((byte) -83)) {
                      ((vi) this).field_u = -((vi) this).field_u;
                      ((vi) this).field_A = null;
                      ((vi) this).field_r = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (((vi) this).field_z >> 12) * ((vi) this).field_D / 256;
                var5 = -var4_int + ((vi) this).field_D;
                if (((vi) this).field_u == 0) {
                  break L3;
                } else {
                  ((vi) this).field_z = ((vi) this).field_z + ((vi) this).field_u * param2;
                  if (1048576 <= ((vi) this).field_z) {
                    ((vi) this).field_z = 1048576;
                    if (((vi) this).field_r) {
                      break L3;
                    } else {
                      ((vi) this).field_u = 0;
                      if (!((vi) this).field_w) {
                        L4: {
                          if (((vi) this).field_A == null) {
                            break L4;
                          } else {
                            ((vi) this).field_H.g(126);
                            break L4;
                          }
                        }
                        ((vi) this).field_A = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (((vi) this).field_z > 0) {
                      break L3;
                    } else {
                      ((vi) this).field_z = 0;
                      if (((vi) this).field_r) {
                        break L3;
                      } else {
                        ((vi) this).field_u = 0;
                        if (!((vi) this).field_w) {
                          L5: {
                            if (((vi) this).field_q != null) {
                              ((vi) this).field_x.g(126);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((vi) this).field_q = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (!mm.field_o) {
                  stackOut_30_0 = param2;
                  stackIn_31_0 = stackOut_30_0;
                  break L6;
                } else {
                  stackOut_29_0 = param2 << 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_31_0;
                if (((vi) this).field_I >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (((vi) this).field_q != null) {
                      break L8;
                    } else {
                      if (null != ((vi) this).field_A) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((vi) this).field_v) {
                            break L10;
                          } else {
                            if (var6 > ((vi) this).field_v.length) {
                              break L10;
                            } else {
                              qb.a(((vi) this).field_v, 0, var6);
                              qb.a(((vi) this).field_B, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((vi) this).field_B = new int[var6];
                        ((vi) this).field_v = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((vi) this).field_x.b(((vi) this).field_v, 0, param2);
                        ((vi) this).field_H.b(((vi) this).field_B, 0, param2);
                        if (!mm.field_o) {
                          stackOut_45_0 = param1;
                          stackIn_46_0 = stackOut_45_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_44_0 = param1 << 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_46_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (((vi) this).field_v[var8] * var4_int + var5 * ((vi) this).field_B[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((vi) this).field_H.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    ((vi) this).field_x.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (null == ((vi) this).field_G) {
                  break L13;
                } else {
                  if (((vi) this).field_I != 0) {
                    L14: {
                      L15: {
                        if (null == ((vi) this).field_v) {
                          break L15;
                        } else {
                          if (((vi) this).field_v.length >= var6) {
                            qb.a(((vi) this).field_v, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((vi) this).field_v = new int[var6];
                      ((vi) this).field_B = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((vi) this).field_t.b(((vi) this).field_v, 0, param2);
                      if (!mm.field_o) {
                        stackOut_59_0 = param1;
                        stackIn_60_0 = stackOut_59_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_58_0 = param1 << 1;
                        stackIn_60_0 = stackOut_58_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_60_0;
                    var8 = ((vi) this).field_D * ((vi) this).field_I / 256;
                    var9 = ((vi) this).field_D - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var7 + var10] = var9 * param0[var7 + var10] + var8 * ((vi) this).field_v[var10] >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              break L0;
            } else {
              ((vi) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var4;
            stackOut_64_1 = new StringBuilder().append("vi.A(");
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param0 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public vi() {
        ((vi) this).field_w = false;
        ((vi) this).field_I = 0;
        ((vi) this).field_D = 256;
        ti var1 = new ti();
        this.a(var1, (byte) 26, new ti(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new byte[520];
        field_y = "Passwords must be between 5 and 20 characters long";
        field_J = "Continue";
        field_E = "Perfect Drops: ";
        field_L = "Name is available";
        field_s = "FULL ACCESS";
    }
}
