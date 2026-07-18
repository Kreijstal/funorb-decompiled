/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private pc field_b;
    private wi field_c;
    private Object[] field_d;
    private int field_i;
    private boolean field_e;
    private Object[][] field_f;
    static String field_a;
    static int field_h;
    static int[] field_g;

    private final synchronized byte[] a(int[] param0, boolean param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            if (!this.a(param1, param3, param2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                L2: {
                  var5 = null;
                  if (((kk) this).field_f[param3] == null) {
                    break L2;
                  } else {
                    if (((kk) this).field_f[param3][param2] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = this.a(4, param3, param2, param0) ? 1 : 0;
                if (var6 != 0) {
                  break L1;
                } else {
                  this.d(118, param3);
                  var6 = this.a(4, param3, param2, param0) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (byte[]) (Object) stackIn_16_0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((kk) this).field_f[param3] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null == ((kk) this).field_f[param3][param2]) {
                    break L3;
                  } else {
                    var5 = (Object) (Object) me.a(false, 22692, ((kk) this).field_f[param3][param2]);
                    if (null == var5) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var5) {
                    L5: {
                      if (((kk) this).field_i != 1) {
                        break L5;
                      } else {
                        ((kk) this).field_f[param3][param2] = null;
                        if (((kk) this).field_b.field_a[param3] != 1) {
                          break L4;
                        } else {
                          ((kk) this).field_f[param3] = null;
                          if (!TrackController.field_F) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (2 == ((kk) this).field_i) {
                      ((kk) this).field_f[param3] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_42_0 = var5;
                stackIn_43_0 = stackOut_42_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_44_0 = var5;
            stackOut_44_1 = new StringBuilder().append("kk.L(");
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L6;
            } else {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_43_0;
    }

    final synchronized boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_2_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (((kk) this).c(-69)) {
              var2_int = 1;
              if (param0 == 48) {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (((kk) this).field_b.field_f.length <= var3) {
                        break L3;
                      } else {
                        stackOut_9_0 = ((kk) this).field_b.field_f[var3];
                        stackIn_17_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            var4 = stackIn_10_0;
                            if (null == ((kk) this).field_d[var4]) {
                              this.d(127, var4);
                              if (((kk) this).field_d[var4] != null) {
                                break L4;
                              } else {
                                var2_int = 0;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_16_0 = var2_int;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_5_0 = ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[6];
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "kk.R(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -40) {
                break L1;
              } else {
                byte[] discarded$2 = ((kk) this).b(-100, ((int[]) ((kk) this).field_d[2])[0]);
                break L1;
              }
            }
            if (this.c(71, param1)) {
              if (null == ((kk) this).field_d[param1]) {
                this.d(param0 + -80, param1);
                if (null == ((kk) this).field_d[param1]) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "kk.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final synchronized byte[] b(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((kk) this).c(-101)) {
            if (1 == ((kk) this).field_b.field_a.length) {
              stackOut_6_0 = ((kk) this).a(0, param0, (byte) -39);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (this.c(-116, param0)) {
                if (param1 == 20095) {
                  if (((kk) this).field_b.field_a[param0] != 1) {
                    throw new RuntimeException();
                  } else {
                    stackOut_15_0 = ((kk) this).a(param0, 0, (byte) -82);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (byte[]) (Object) stackIn_13_0;
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "kk.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 < -21) {
                break L1;
              } else {
                field_a = (String) ((kk) this).field_d[13];
                break L1;
              }
            }
            stackOut_3_0 = this.a((int[]) null, true, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var4, "kk.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            if (!((kk) this).c(-23)) {
              stackOut_6_0 = -1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((kk) this).field_b.field_a.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "kk.M(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.c(param2 ^ 66, param1)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  ((kk) this).field_d[6] = null;
                  break L1;
                }
              }
              var4_int = ((kk) this).field_b.field_e[param1].a(hk.a((CharSequence) (Object) param0, 0), param2 ^ 26555);
              if (!this.a(true, param1, var4_int)) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = var4_int;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("kk.S(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized int a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!((kk) this).c(100)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                var2_int = 0;
                var3 = 0;
                if (param0) {
                  break L1;
                } else {
                  field_a = (String) ((kk) this).field_d[2];
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((kk) this).field_d.length >= ~var4) {
                      break L4;
                    } else {
                      stackOut_11_0 = -1;
                      stackOut_11_1 = ~((kk) this).field_b.field_l[var4];
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_19_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_12_0 > stackIn_12_1) {
                            var2_int += 100;
                            var3 = var3 + ((kk) this).a(var4, -24214);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = -1;
                  stackOut_18_1 = ~var2_int;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L3;
                }
                if (stackIn_19_0 == stackIn_19_1) {
                  stackOut_21_0 = 100;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  var4 = 100 * var3 / var2_int;
                  stackOut_23_0 = var4;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "kk.H(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((kk) this).c(102)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                if (param2 == -45) {
                  break L1;
                } else {
                  ((long[]) ((kk) this).field_d[16])[11] = -121L;
                  break L1;
                }
              }
              var4_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param0, 0), param2 + -26511);
              if (!this.c(param2 ^ -110, var4_int)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                var5 = ((kk) this).field_b.field_e[var4_int].a(hk.a((CharSequence) (Object) param1, param2 + 45), param2 + -26511);
                stackOut_11_0 = ((kk) this).a(var4_int, var5, param2 ^ 44);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("kk.B(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((kk) this).c(119)) {
              L1: {
                if (param1 == -3) {
                  break L1;
                } else {
                  byte[] discarded$2 = this.a((int[]) ((Object[]) ((kk) this).field_d[43])[6], ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[2], -64, -39);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var3_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param0, 0), -26556);
              stackOut_6_0 = ((kk) this).a((byte) -40, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kk.N(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 < -50) {
                break L1;
              } else {
                kk.a(-33);
                break L1;
              }
            }
            stackOut_3_0 = vg.field_o;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "kk.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.c(67, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -91) {
                stackOut_8_0 = ((kk) this).field_b.field_a[param0];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 56;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "kk.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((kk) this).c(92)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  int discarded$2 = ((kk) this).a(true, (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var3_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param1, 0), -26556);
              if (this.c(74, var3_int)) {
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("kk.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        try {
          L0: {
            if (!this.a(true, param0, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((kk) this).field_f[param0]) {
                  break L1;
                } else {
                  if (((kk) this).field_f[param0][param1] != null) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param2 == -1) {
                  break L2;
                } else {
                  ((byte[]) ((kk) this).field_d[6])[2] = ((byte[]) ((kk) this).field_d[9])[0];
                  break L2;
                }
              }
              if (null != ((kk) this).field_d[param0]) {
                stackOut_19_0 = 1;
                stackIn_20_0 = stackOut_19_0;
                return stackIn_20_0 != 0;
              } else {
                this.d(73, param0);
                if (((kk) this).field_d[param0] != null) {
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                } else {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var4, "kk.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_27_0 != 0;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            if (!((kk) this).c(-115)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (0 > param2) {
                    break L1;
                  } else {
                    if (~((kk) this).field_b.field_a.length >= ~param1) {
                      break L1;
                    } else {
                      if (param2 < ((kk) this).field_b.field_a[param1]) {
                        L2: {
                          if (param0) {
                            break L2;
                          } else {
                            ((kk) this).field_b = null;
                            break L2;
                          }
                        }
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (!sk.field_b) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              } else {
                throw new IllegalArgumentException(param1 + " " + param2);
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var4, "kk.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            field_g = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "kk.V(" + param0 + ')');
        }
    }

    private final synchronized void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 83 / ((param0 - 2) / 61);
                if (!((kk) this).field_e) {
                  break L2;
                } else {
                  ((kk) this).field_d[param1] = (Object) (Object) ((kk) this).field_c.a(-1, param1);
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((kk) this).field_d[param1] = qk.a(((kk) this).field_c.a(-1, param1), false, (byte) -88);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "kk.U(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == -24214) {
              if (this.c(-42, param0)) {
                if (null != ((kk) this).field_d[param0]) {
                  stackOut_9_0 = 100;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = ((kk) this).field_c.b(param0, param1 ^ 2972);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 22;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "kk.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized boolean c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((kk) this).c(-79)) {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (param1 >= ((kk) this).field_b.field_a.length) {
                    break L1;
                  } else {
                    if (((kk) this).field_b.field_a[param1] == 0) {
                      break L1;
                    } else {
                      var3_int = 91 % ((13 - param0) / 52);
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
              }
              if (!sk.field_b) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param1));
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "kk.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((kk) this).c(-79)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var4_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param0, param1 ^ param1), param1 + -26555);
              if (!this.c(93, var4_int)) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var5 = ((kk) this).field_b.field_e[var4_int].a(hk.a((CharSequence) (Object) param2, 0), -26556);
                stackOut_8_0 = ((kk) this).a(var4_int, var5, (byte) -64);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("kk.E(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((kk) this).c(110)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                var3_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param0, 0), -26556);
                if (param1 <= -85) {
                  break L1;
                } else {
                  ((kk) this).field_b = null;
                  break L1;
                }
              }
              if (var3_int >= 0) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kk.W(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 122 % ((param0 - 33) / 55);
              if (null != ((kk) this).field_b) {
                break L1;
              } else {
                ((kk) this).field_b = ((kk) this).field_c.a(9);
                if (((kk) this).field_b == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((kk) this).field_d = new Object[((kk) this).field_b.field_n];
                  ((kk) this).field_f = new Object[((kk) this).field_b.field_n][];
                  break L1;
                }
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "kk.A(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        be var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        be var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_30_0 = 0;
        int[] stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_158_0 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_163_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_41_0 = null;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        var22 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (this.c(90, param1)) {
              if (null != ((kk) this).field_d[param1]) {
                var5_int = ((kk) this).field_b.field_l[param1];
                var6 = ((kk) this).field_b.field_r[param1];
                if (param0 == 4) {
                  L1: {
                    if (((kk) this).field_f[param1] != null) {
                      break L1;
                    } else {
                      ((kk) this).field_f[param1] = new Object[((kk) this).field_b.field_a[param1]];
                      break L1;
                    }
                  }
                  var7 = ((kk) this).field_f[param1];
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              if (var9_int >= var5_int) {
                                break L7;
                              } else {
                                stackOut_15_0 = (int[]) var6;
                                stackIn_43_0 = stackOut_15_0;
                                stackIn_16_0 = stackOut_15_0;
                                if (var22 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    L9: {
                                      if (stackIn_16_0 != null) {
                                        break L9;
                                      } else {
                                        var10_int = var9_int;
                                        if (var22 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var10_int = var6[var9_int];
                                    break L8;
                                  }
                                  L10: {
                                    if (null == var7[var10_int]) {
                                      var8 = 0;
                                      if (var22 == 0) {
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var9_int++;
                                  if (var22 == 0) {
                                    continue L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            if (var8 == 0) {
                              if (null == param3) {
                                break L4;
                              } else {
                                if (param3[0] != 0) {
                                  break L5;
                                } else {
                                  if (param3[1] != 0) {
                                    break L5;
                                  } else {
                                    if (param3[2] != 0) {
                                      break L5;
                                    } else {
                                      stackOut_41_0 = (int[]) param3;
                                      stackIn_43_0 = stackOut_41_0;
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              stackOut_29_0 = 1;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0 != 0;
                            }
                          }
                          if (stackIn_43_0[3] == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        var9_array = me.a(true, 22692, ((kk) this).field_d[param1]);
                        var10 = new be(var9_array);
                        var10.a(5, param3, var10.field_j.length, false);
                        break L3;
                      }
                      var9_array = me.a(false, param0 ^ 22688, ((kk) this).field_d[param1]);
                      break L3;
                    }
                    try {
                      L11: {
                        var10_array = al.a(-127, var9_array);
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_48_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_48_1 = new StringBuilder();
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (param3 == null) {
                          stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                          stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                          stackOut_51_2 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          stackIn_52_2 = stackOut_51_2;
                          break L12;
                        } else {
                          stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                          stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                          stackOut_49_2 = 1;
                          stackIn_52_0 = stackOut_49_0;
                          stackIn_52_1 = stackOut_49_1;
                          stackIn_52_2 = stackOut_49_2;
                          break L12;
                        }
                      }
                      throw sl.a((Throwable) (Object) stackIn_52_0, (stackIn_52_2 != 0) + " " + param1 + " " + var9_array.length + " " + ql.a(0, var9_array, var9_array.length) + " " + ql.a(param0 ^ 4, var9_array, -2 + var9_array.length) + " " + ((kk) this).field_b.field_b[param1] + " " + ((kk) this).field_b.field_p);
                    }
                    L13: {
                      if (((kk) this).field_e) {
                        ((kk) this).field_d[param1] = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (1 >= var5_int) {
                            break L16;
                          } else {
                            L17: {
                              if (((kk) this).field_i != 2) {
                                break L17;
                              } else {
                                var11 = var10_array.length;
                                var11--;
                                var12 = 255 & var10_array[var11];
                                var11 = var11 - 4 * (var12 * var5_int);
                                var13 = new be(var10_array);
                                var14_int = 0;
                                var13.field_k = var11;
                                var15_int = 0;
                                var16 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var16 >= var12) {
                                        break L20;
                                      } else {
                                        var17 = 0;
                                        stackOut_63_0 = 0;
                                        stackIn_78_0 = stackOut_63_0;
                                        stackIn_64_0 = stackOut_63_0;
                                        if (var22 != 0) {
                                          break L19;
                                        } else {
                                          var18 = stackIn_64_0;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (var5_int <= var18) {
                                                  break L23;
                                                } else {
                                                  var17 = var17 + var13.e((byte) 113);
                                                  if (var22 != 0) {
                                                    break L22;
                                                  } else {
                                                    L24: {
                                                      L25: {
                                                        if (null == var6) {
                                                          break L25;
                                                        } else {
                                                          var19 = var6[var18];
                                                          if (var22 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      var19 = var18;
                                                      break L24;
                                                    }
                                                    L26: {
                                                      if (var19 != param2) {
                                                        break L26;
                                                      } else {
                                                        var14_int = var14_int + var17;
                                                        var15_int = var19;
                                                        break L26;
                                                      }
                                                    }
                                                    var18++;
                                                    if (var22 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                              var16++;
                                              break L22;
                                            }
                                            if (var22 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_77_0 = var14_int;
                                    stackIn_78_0 = stackOut_77_0;
                                    break L19;
                                  }
                                  if (stackIn_78_0 == 0) {
                                    stackOut_80_0 = 1;
                                    stackIn_81_0 = stackOut_80_0;
                                    return stackIn_81_0 != 0;
                                  } else {
                                    var16_ref_byte__ = new byte[var14_int];
                                    var14_int = 0;
                                    var13.field_k = var11;
                                    var17 = 0;
                                    var18 = 0;
                                    L27: while (true) {
                                      L28: {
                                        if (var18 >= var12) {
                                          break L28;
                                        } else {
                                          var19 = 0;
                                          stackOut_84_0 = 0;
                                          stackIn_158_0 = stackOut_84_0;
                                          stackIn_85_0 = stackOut_84_0;
                                          if (var22 != 0) {
                                            break L14;
                                          } else {
                                            var20 = stackIn_85_0;
                                            L29: while (true) {
                                              L30: {
                                                L31: {
                                                  if (~var5_int >= ~var20) {
                                                    break L31;
                                                  } else {
                                                    var19 = var19 + var13.e((byte) 113);
                                                    if (var22 != 0) {
                                                      break L30;
                                                    } else {
                                                      L32: {
                                                        L33: {
                                                          if (null == var6) {
                                                            break L33;
                                                          } else {
                                                            var21 = var6[var20];
                                                            if (var22 == 0) {
                                                              break L32;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        var21 = var20;
                                                        break L32;
                                                      }
                                                      L34: {
                                                        if (param2 != var21) {
                                                          break L34;
                                                        } else {
                                                          pd.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                                          var14_int = var14_int + var19;
                                                          break L34;
                                                        }
                                                      }
                                                      var17 = var17 + var19;
                                                      var20++;
                                                      if (var22 == 0) {
                                                        continue L29;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                }
                                                var18++;
                                                break L30;
                                              }
                                              if (var22 == 0) {
                                                continue L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var10_array.length;
                            var11--;
                            var12 = 255 & var10_array[var11];
                            var11 = var11 - 4 * var5_int * var12;
                            var13 = new be(var10_array);
                            var13.field_k = var11;
                            var14 = new int[var5_int];
                            var15_int = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (var15_int >= var12) {
                                    break L37;
                                  } else {
                                    var16 = 0;
                                    stackOut_101_0 = 0;
                                    stackIn_111_0 = stackOut_101_0;
                                    stackIn_102_0 = stackOut_101_0;
                                    if (var22 != 0) {
                                      break L36;
                                    } else {
                                      var17 = stackIn_102_0;
                                      L38: while (true) {
                                        L39: {
                                          L40: {
                                            if (~var17 <= ~var5_int) {
                                              break L40;
                                            } else {
                                              var16 = var16 + var13.e((byte) 113);
                                              var14[var17] = var14[var17] + var16;
                                              var17++;
                                              if (var22 != 0) {
                                                break L39;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L38;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                          }
                                          var15_int++;
                                          break L39;
                                        }
                                        if (var22 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_110_0 = var5_int;
                                stackIn_111_0 = stackOut_110_0;
                                break L36;
                              }
                              var15 = new byte[stackIn_111_0][];
                              var16 = 0;
                              L41: while (true) {
                                L42: {
                                  L43: {
                                    if (var5_int <= var16) {
                                      break L43;
                                    } else {
                                      var15[var16] = new byte[var14[var16]];
                                      var14[var16] = 0;
                                      var16++;
                                      if (var22 != 0) {
                                        break L42;
                                      } else {
                                        if (var22 == 0) {
                                          continue L41;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                  var13.field_k = var11;
                                  var16 = 0;
                                  break L42;
                                }
                                var17 = 0;
                                L44: while (true) {
                                  L45: {
                                    L46: {
                                      if (~var17 <= ~var12) {
                                        break L46;
                                      } else {
                                        var18 = 0;
                                        stackOut_120_0 = 0;
                                        stackIn_130_0 = stackOut_120_0;
                                        stackIn_121_0 = stackOut_120_0;
                                        if (var22 != 0) {
                                          break L45;
                                        } else {
                                          var19 = stackIn_121_0;
                                          L47: while (true) {
                                            L48: {
                                              L49: {
                                                if (var19 >= var5_int) {
                                                  break L49;
                                                } else {
                                                  var18 = var18 + var13.e((byte) 113);
                                                  pd.a(var10_array, var16, var15[var19], var14[var19], var18);
                                                  var14[var19] = var14[var19] + var18;
                                                  var16 = var16 + var18;
                                                  var19++;
                                                  if (var22 != 0) {
                                                    break L48;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L47;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                              var17++;
                                              break L48;
                                            }
                                            if (var22 == 0) {
                                              continue L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_129_0 = 0;
                                    stackIn_130_0 = stackOut_129_0;
                                    break L45;
                                  }
                                  var17 = stackIn_130_0;
                                  L50: while (true) {
                                    L51: {
                                      if (~var17 <= ~var5_int) {
                                        break L51;
                                      } else {
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          L52: {
                                            L53: {
                                              if (null != var6) {
                                                break L53;
                                              } else {
                                                var18 = var17;
                                                if (var22 == 0) {
                                                  break L52;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            var18 = var6[var17];
                                            break L52;
                                          }
                                          L54: {
                                            L55: {
                                              if (((kk) this).field_i == 0) {
                                                break L55;
                                              } else {
                                                var7[var18] = (Object) (Object) var15[var17];
                                                if (var22 == 0) {
                                                  break L54;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                            var7[var18] = qk.a(var15[var17], false, (byte) -19);
                                            break L54;
                                          }
                                          var17++;
                                          if (var22 == 0) {
                                            continue L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L56: {
                          L57: {
                            if (var6 == null) {
                              break L57;
                            } else {
                              var11 = var6[0];
                              if (var22 == 0) {
                                break L56;
                              } else {
                                break L57;
                              }
                            }
                          }
                          var11 = 0;
                          break L56;
                        }
                        L58: {
                          if (((kk) this).field_i == 0) {
                            break L58;
                          } else {
                            var7[var11] = (Object) (Object) var10_array;
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var7[var11] = qk.a(var10_array, false, (byte) 8);
                        break L15;
                      }
                      stackOut_157_0 = 1;
                      stackIn_158_0 = stackOut_157_0;
                      break L14;
                    }
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_159_0 = (RuntimeException) var5;
            stackOut_159_1 = new StringBuilder().append("kk.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_162_0 = stackOut_159_0;
            stackIn_162_1 = stackOut_159_1;
            stackIn_160_0 = stackOut_159_0;
            stackIn_160_1 = stackOut_159_1;
            if (param3 == null) {
              stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
              stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
              stackOut_162_2 = "null";
              stackIn_163_0 = stackOut_162_0;
              stackIn_163_1 = stackOut_162_1;
              stackIn_163_2 = stackOut_162_2;
              break L59;
            } else {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "{...}";
              stackIn_163_0 = stackOut_160_0;
              stackIn_163_1 = stackOut_160_1;
              stackIn_163_2 = stackOut_160_2;
              break L59;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_163_0, stackIn_163_2 + ')');
        }
        return stackIn_158_0 != 0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((kk) this).c(-82)) {
              param0 = param0.toLowerCase();
              var3_int = ((kk) this).field_b.field_q.a(hk.a((CharSequence) (Object) param0, param1), -26556);
              stackOut_3_0 = ((kk) this).a(var3_int, -24214);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kk.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    kk(wi param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((kk) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((kk) this).field_i = param2;
                  ((kk) this).field_c = param0;
                  ((kk) this).field_e = param1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("kk.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You are unable to access this level yet.";
        field_g = new int[4];
    }
}
