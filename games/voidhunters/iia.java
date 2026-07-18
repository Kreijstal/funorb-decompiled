/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iia extends wm implements ntb, hd {
    static String field_c;
    private int field_d;
    private int field_e;

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1);
              if (!param1) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            ((iia) this).field_d = param0.i(0, 32);
            ((iia) this).field_e = param0.i(0, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("iia.H(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final ucb[] a(pe param0, int param1) {
        anb var3 = null;
        RuntimeException var3_ref = null;
        cq var4 = null;
        ucb[] stackIn_8_0 = null;
        ucb[] stackIn_17_0 = null;
        ucb[] stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ucb[] stackOut_7_0 = null;
        ucb[] stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        ucb[] stackOut_16_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20605) {
                break L1;
              } else {
                ((iia) this).a((faa) null, true);
                break L1;
              }
            }
            L2: {
              var3 = param0.d((byte) -27, ((iia) this).field_d);
              var4 = param0.e((byte) -126, ((iia) this).field_e);
              if (var3 == null) {
                break L2;
              } else {
                if (var4 == null) {
                  break L2;
                } else {
                  stackOut_7_0 = new ucb[]{new ucb(var3.d(false), var3.g((byte) 124)), new ucb(var4.field_f, var4.field_g)};
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            L3: {
              if (null == var3) {
                break L3;
              } else {
                if (var4 == null) {
                  stackOut_18_0 = new ucb[]{new ucb(var3.d(false), var3.g((byte) 123))};
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  break L3;
                }
              }
            }
            if (var4 == null) {
              stackOut_20_0 = null;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_16_0 = new ucb[]{new ucb(var4.field_f, var4.field_g)};
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("iia.I(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return (ucb[]) (Object) stackIn_21_0;
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 <= 0) {
                L1: {
                  if (param0 < -59) {
                    break L1;
                  } else {
                    field_c = null;
                    break L1;
                  }
                }
                L2: {
                  var2_int = 2;
                  if (param1 < -65536) {
                    var2_int += 16;
                    param1 = param1 >> 16;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1 < -256) {
                    var2_int += 8;
                    param1 = param1 >> 8;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 >= -16) {
                    break L4;
                  } else {
                    var2_int += 4;
                    param1 = param1 >> 4;
                    break L4;
                  }
                }
                L5: {
                  if (param1 >= -4) {
                    break L5;
                  } else {
                    param1 = param1 >> 2;
                    var2_int += 2;
                    break L5;
                  }
                }
                L6: {
                  if (param1 < -2) {
                    param1 = param1 >> 1;
                    var2_int++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_41_0 = var2_int;
                stackIn_42_0 = stackOut_41_0;
                break L0;
              } else {
                L7: {
                  var2_int = 1;
                  if (65535 < param1) {
                    var2_int += 16;
                    param1 = param1 >> 16;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1 > 255) {
                    var2_int += 8;
                    param1 = param1 >> 8;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1 <= 15) {
                    break L9;
                  } else {
                    param1 = param1 >> 4;
                    var2_int += 4;
                    break L9;
                  }
                }
                L10: {
                  if (param1 <= 3) {
                    break L10;
                  } else {
                    param1 = param1 >> 2;
                    var2_int += 2;
                    break L10;
                  }
                }
                L11: {
                  if (param1 <= 1) {
                    break L11;
                  } else {
                    var2_int++;
                    param1 = param1 >> 1;
                    break L11;
                  }
                }
                stackOut_20_0 = var2_int;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "iia.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_42_0;
    }

    public final boolean a(byte param0, tv param1) {
        iia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
            L1: {
              L2: {
                var4 = -96 % ((param0 - 22) / 59);
                var3 = (iia) (Object) param1;
                if (super.a((byte) -126, param1)) {
                  break L2;
                } else {
                  if (var3.field_d != ((iia) this).field_d) {
                    break L2;
                  } else {
                    if (~((iia) this).field_e == ~var3.field_e) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("iia.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int[] a(pe param0, int param1, int[] param2) {
        cq var4 = null;
        RuntimeException var4_ref = null;
        sg[] var5 = null;
        sg[] var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int[] stackIn_8_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_20_0 = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 16) {
                break L1;
              } else {
                ((iia) this).field_e = 118;
                break L1;
              }
            }
            var4 = param0.e((byte) -74, ((iia) this).field_e);
            if (var4 == null) {
              stackOut_7_0 = (int[]) param2;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (-1 == ((iia) this).field_d) {
                var5 = param0.d(1000);
                var6 = var5;
                var7 = 0;
                L2: while (true) {
                  L3: {
                    if (~var7 <= ~var6.length) {
                      break L3;
                    } else {
                      L4: {
                        var8 = var6[var7];
                        if (null == var8) {
                          break L4;
                        } else {
                          if (!var4.a(var8.g((byte) 121), var8.d(false), (byte) -98)) {
                            break L4;
                          } else {
                            param2 = qi.a(var8.c(false), true, param2, (byte) -14);
                            break L4;
                          }
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_20_0 = (int[]) param2;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              } else {
                stackOut_10_0 = qi.a(((iia) this).field_d, true, param2, (byte) -14);
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4_ref;
            stackOut_22_1 = new StringBuilder().append("iia.J(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_21_0;
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 > 99) {
              L1: {
                if (((iia) this).field_d < 0) {
                  break L1;
                } else {
                  param1 = qi.a(((iia) this).field_d, true, param1, (byte) -14);
                  break L1;
                }
              }
              stackOut_5_0 = (int[]) param1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("iia.N(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_6_0;
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -102) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            if (param1 == 0) {
              stackOut_6_0 = ((iia) this).field_d;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = ((iia) this).field_e;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "iia.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (param0 > 11) {
                  break L1;
                } else {
                  if (param2) {
                    L2: {
                      if (param1 < 1) {
                        break L2;
                      } else {
                        if (param1 <= tp.a(param3, false, param0)) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "iia.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -2) {
              L1: {
                L2: {
                  L3: {
                    if (param2 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (((iia) this).field_d >= param3) {
                          stackOut_9_0 = -1;
                          stackIn_10_0 = stackOut_9_0;
                          break L4;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                      var5_int = stackIn_10_0;
                      var6 = 50;
                      var7 = var6 * var5_int + param3;
                      var8 = param3;
                      L5: while (true) {
                        L6: {
                          if (var7 == var8) {
                            break L6;
                          } else {
                            if (var9 != 0) {
                              break L2;
                            } else {
                              L7: {
                                L8: {
                                  if (param0.d((byte) -27, var8) != null) {
                                    break L8;
                                  } else {
                                    if (var8 != -1) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                ((iia) this).field_d = var8;
                                if (var9 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                              var8 = var8 + var5_int;
                              if (var9 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L9: {
                    if (((iia) this).field_e >= param3) {
                      stackOut_29_0 = -1;
                      stackIn_30_0 = stackOut_29_0;
                      break L9;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_30_0 = stackOut_27_0;
                      break L9;
                    }
                  }
                  var5_int = stackIn_30_0;
                  var6 = 50;
                  var7 = var6 * var5_int + param3;
                  var8 = param3;
                  L10: while (true) {
                    if (~var7 == ~var8) {
                      break L2;
                    } else {
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L11: {
                          if (null == param0.e((byte) -99, var8)) {
                            break L11;
                          } else {
                            ((iia) this).field_e = var8;
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var8 = var8 + var5_int;
                        if (var9 == 0) {
                          continue L10;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("iia.E(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        iia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 < -19) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              var3 = (iia) (Object) param0;
              super.a(param0, -37);
              var4 = 0;
              if (var3.field_d != ((iia) this).field_d) {
                var4 = 1;
                System.out.println("int body_id has changed. before=" + var3.field_d + ", now=" + ((iia) this).field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((iia) this).field_e == var3.field_e) {
                break L3;
              } else {
                System.out.println("int zone_id has changed. before=" + var3.field_e + ", now=" + ((iia) this).field_e);
                var4 = 1;
                break L3;
              }
            }
            L4: {
              if (var4 == 0) {
                break L4;
              } else {
                System.out.println("This instance of MissionConditionBodyInMapZone has changed");
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("iia.F(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              var2 = "Body " + ((iia) this).field_d;
              if (((iia) this).field_d == -1) {
                var2 = "Any ship";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                boolean discarded$2 = ((iia) this).a((byte) 14, (tv) null);
                break L2;
              }
            }
            stackOut_7_0 = var2 + " in map zone " + ((iia) this).field_e;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2_ref, "iia.L(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.b(param0, -125);
              if (param1 <= -109) {
                break L1;
              } else {
                ((iia) this).field_d = 10;
                break L1;
              }
            }
            param0.a(-632, ((iia) this).field_d, 32);
            param0.a(-632, ((iia) this).field_e, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("iia.B(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        cq var4 = null;
        RuntimeException var4_ref = null;
        anb var5 = null;
        sg[] var5_array = null;
        sg[] var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var4 = param2.e((byte) -121, ((iia) this).field_e);
            if (null != var4) {
              if (param0 == ~((iia) this).field_d) {
                var5_array = param2.d(1000);
                var6 = var5_array;
                var7 = 0;
                L1: while (true) {
                  L2: {
                    if (var7 >= var6.length) {
                      break L2;
                    } else {
                      L3: {
                        var8 = var6[var7];
                        if (var8 == null) {
                          break L3;
                        } else {
                          if (!var4.a(var8.g((byte) 124), var8.d(false), (byte) -98)) {
                            break L3;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          }
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                }
              } else {
                var5 = param2.d((byte) -27, ((iia) this).field_d);
                if (var5 != null) {
                  stackOut_8_0 = var4.a(var5.g((byte) -62), var5.d(false), (byte) -98);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4_ref;
            stackOut_21_1 = new StringBuilder().append("iia.G(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          L5: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    iia() {
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15818) {
                break L1;
              } else {
                boolean discarded$2 = iia.a(-54, 46, true, 51);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "iia.K(" + param0 + ')');
        }
    }

    iia(int param0, int param1) {
        try {
            ((iia) this).field_d = param0;
            ((iia) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "iia.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        iia var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                ((iia) this).field_d = -91;
                break L1;
              }
            }
            super.b((byte) 66, param1);
            var3 = (iia) (Object) param1;
            var3.field_e = ((iia) this).field_e;
            var3.field_d = ((iia) this).field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("iia.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
    }
}
