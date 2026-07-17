/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iia extends wm implements ntb, hd {
    static String field_c;
    private int field_d;
    private int field_e;

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            if (param1) {
                field_c = null;
            }
            ((iia) this).field_d = param0.i(0, 32);
            ((iia) this).field_e = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "iia.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final ucb[] a(pe param0, int param1) {
        anb var3 = null;
        RuntimeException var3_ref = null;
        cq var4 = null;
        Object var5 = null;
        anb var6 = null;
        ucb[] stackIn_5_0 = null;
        ucb[] stackIn_12_0 = null;
        ucb[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ucb[] stackOut_4_0 = null;
        ucb[] stackOut_13_0 = null;
        ucb[] stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20605) {
                break L1;
              } else {
                var5 = null;
                ((iia) this).a((faa) null, true);
                break L1;
              }
            }
            L2: {
              var6 = param0.d((byte) -27, ((iia) this).field_d);
              var3 = var6;
              var4 = param0.e((byte) -126, ((iia) this).field_e);
              if (var3 == null) {
                break L2;
              } else {
                if (var4 == null) {
                  break L2;
                } else {
                  stackOut_4_0 = new ucb[]{new ucb(var6.d(false), var6.g((byte) 124)), new ucb(var4.field_f, var4.field_g)};
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            L3: {
              if (var3 == null) {
                break L3;
              } else {
                if (var4 == null) {
                  stackOut_13_0 = new ucb[]{new ucb(var6.d(false), var6.g((byte) 123))};
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            if (var4 != null) {
              stackOut_11_0 = new ucb[]{new ucb(var4.field_f, var4.field_g)};
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("iia.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (!(65535 >= param1)) {
                var2 += 16;
                param1 = param1 >> 16;
            }
            if (!(param1 <= 255)) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (param1 > 15) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (param1 > 3) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (param1 > 1) {
                var2++;
                param1 = param1 >> 1;
            }
            return var2;
        }
        if (param0 >= -59) {
            field_c = null;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (!(param1 >= -256)) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (param1 < -16) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (param1 < -4) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (!(param1 >= -2)) {
            param1 = param1 >> 1;
            var2++;
        }
        return var2;
    }

    public final boolean a(byte param0, tv param1) {
        iia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
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
              L2: {
                var4 = -96 % ((param0 - 22) / 59);
                var3 = (iia) (Object) param1;
                if (super.a((byte) -126, param1)) {
                  break L2;
                } else {
                  if (var3.field_d != var3.field_d) {
                    break L2;
                  } else {
                    if (var3.field_e == var3.field_e) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("iia.C(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final int[] a(pe param0, int param1, int[] param2) {
        cq var4 = null;
        RuntimeException var4_ref = null;
        sg[] var5 = null;
        sg[] var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int[] stackIn_6_0 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
              stackOut_5_0 = (int[]) param2;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (-1 == ((iia) this).field_d) {
                var5 = param0.d(1000);
                var6 = var5;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6.length) {
                    stackOut_15_0 = (int[]) param2;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    L3: {
                      var8 = var6[var7];
                      if (var8 == null) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7++;
                    continue L2;
                  }
                }
              } else {
                stackOut_8_0 = qi.a(((iia) this).field_d, true, param2, (byte) -14);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("iia.J(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            stackOut_7_1 = new StringBuilder().append("iia.N(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final int a(byte param0, int param1) {
        if (param0 > -102) {
            field_c = null;
        }
        if (param1 != 0) {
            return ((iia) this).field_e;
        }
        return ((iia) this).field_d;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (param0 > 11) {
              break L0;
            } else {
              if (param2) {
                if (param1 < 1) {
                  return false;
                } else {
                  if (param1 <= tp.a(param3, false, param0)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                return true;
              }
            }
          }
        }
        return false;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -2) {
              L1: {
                if (param2 != 0) {
                  L2: {
                    if (((iia) this).field_e >= param3) {
                      stackOut_16_0 = -1;
                      stackIn_17_0 = stackOut_16_0;
                      break L2;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L2;
                    }
                  }
                  var5_int = stackIn_17_0;
                  var6 = 50;
                  var7 = var6 * var5_int + param3;
                  var8 = param3;
                  L3: while (true) {
                    if (var7 == var8) {
                      break L1;
                    } else {
                      if (null == param0.e((byte) -99, var8)) {
                        var8 = var8 + var5_int;
                        continue L3;
                      } else {
                        ((iia) this).field_e = var8;
                        break L1;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (((iia) this).field_d >= param3) {
                      stackOut_6_0 = -1;
                      stackIn_7_0 = stackOut_6_0;
                      break L4;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L4;
                    }
                  }
                  var5_int = stackIn_7_0;
                  var6 = 50;
                  var7 = var6 * var5_int + param3;
                  var8 = param3;
                  L5: while (true) {
                    if (var7 == var8) {
                      break L1;
                    } else {
                      L6: {
                        if (param0.d((byte) -27, var8) != null) {
                          break L6;
                        } else {
                          if (var8 != -1) {
                            var8 = var8 + var5_int;
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((iia) this).field_d = var8;
                      break L1;
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
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("iia.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(tv param0, int param1) {
        iia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (var3.field_d != var3.field_d) {
                var4 = 1;
                System.out.println("int body_id has changed. before=" + var3.field_d + ", now=" + var3.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3.field_e == var3.field_e) {
                break L3;
              } else {
                System.out.println("int zone_id has changed. before=" + var3.field_e + ", now=" + var3.field_e);
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("iia.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final String a(int param0) {
        String var2 = "Body " + ((iia) this).field_d;
        if (!(((iia) this).field_d != -1)) {
            var2 = "Any ship";
        }
        if (param0 != -1) {
            Object var3 = null;
            boolean discarded$0 = ((iia) this).a((byte) 14, (tv) null);
        }
        return var2 + " in map zone " + ((iia) this).field_e;
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -125);
            if (param1 > -109) {
                ((iia) this).field_d = 10;
            }
            param0.a(-632, ((iia) this).field_d, 32);
            param0.a(-632, ((iia) this).field_e, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "iia.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        cq var4 = null;
        RuntimeException var4_ref = null;
        sg[] var5 = null;
        sg[] var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        anb var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
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
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var4 = param2.e((byte) -121, ((iia) this).field_e);
            if (var4 != null) {
              if (param0 == ~((iia) this).field_d) {
                var5 = param2.d(1000);
                var6 = var5;
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var6.length) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    L2: {
                      var8 = var6[var7];
                      if (var8 == null) {
                        break L2;
                      } else {
                        if (!var4.a(var8.g((byte) 124), var8.d(false), (byte) -98)) {
                          break L2;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      }
                    }
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var10 = param2.d((byte) -27, ((iia) this).field_d);
                if (var10 != null) {
                  stackOut_8_0 = var4.a(var10.g((byte) -62), var10.d(false), (byte) -98);
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
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("iia.G(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          L4: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    iia() {
    }

    public static void b(int param0) {
        field_c = null;
    }

    iia(int param0, int param1) {
        ((iia) this).field_d = param0;
        ((iia) this).field_e = param1;
    }

    public final void b(byte param0, tv param1) {
        iia var5 = null;
        iia var6 = null;
        try {
            if (param0 <= 54) {
                ((iia) this).field_d = -91;
            }
            super.b((byte) 66, param1);
            var5 = (iia) (Object) param1;
            var6 = var5;
            var6.field_e = var5.field_e;
            var6.field_d = var5.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "iia.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
