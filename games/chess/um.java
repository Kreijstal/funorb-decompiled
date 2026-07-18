/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static int[] field_j;
    boolean field_k;
    private Object[] field_m;
    int field_f;
    static km field_c;
    private ua field_i;
    private lj field_d;
    private Object[][] field_e;
    static String field_h;
    static wf field_b;
    static jk field_g;
    static int field_a;
    static lm[] field_l;

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_g = null;
              if (param0 == 73) {
                break L1;
              } else {
                um.b(102);
                break L1;
              }
            }
            field_l = null;
            field_j = null;
            field_h = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "um.N(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            in.field_a = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "um.A(" + param0 + ')');
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((byte[]) ((um) this).field_m[8])[0] = ((byte[]) ((Object[]) ((um) this).field_m[5])[10])[18];
                break L1;
              }
            }
            if (((um) this).c((byte) 127)) {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (((um) this).field_d.field_o.length <= param1) {
                    break L2;
                  } else {
                    if (((um) this).field_d.field_o[param1] == 0) {
                      break L2;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
              }
              if (om.field_j) {
                throw new IllegalArgumentException(Integer.toString(param1));
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
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
          throw fk.a((Throwable) (Object) var3, "um.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (((um) this).c((byte) 126)) {
              stackOut_6_0 = ((um) this).field_d.field_o.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "um.C(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
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
        Object stackOut_9_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (((um) this).c((byte) 119)) {
              if (param1 == 30045) {
                param0 = param0.toLowerCase();
                param2 = param2.toLowerCase();
                var4_int = ((um) this).field_d.field_e.a(ga.a((byte) -75, (CharSequence) (Object) param0), (byte) 17);
                if (!this.b(0, var4_int)) {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (byte[]) (Object) stackIn_10_0;
                } else {
                  var5 = ((um) this).field_d.field_j[var4_int].a(ga.a((byte) -106, (CharSequence) (Object) param2), (byte) 17);
                  stackOut_11_0 = ((um) this).a(var4_int, var5, 5847);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("um.F(");
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
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            if (((um) this).c((byte) 122)) {
              L1: {
                var2_int = 0;
                if (param0 <= -53) {
                  break L1;
                } else {
                  boolean discarded$2 = ((um) this).a((byte) -102, ((int[]) ((um) this).field_m[4])[2], ((int[]) ((Object[]) ((Object[]) ((um) this).field_m[3])[13])[0])[13]);
                  break L1;
                }
              }
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((um) this).field_m.length <= var4) {
                      break L4;
                    } else {
                      stackOut_9_0 = 0;
                      stackOut_9_1 = ((um) this).field_d.field_l[var4];
                      stackIn_20_0 = stackOut_9_0;
                      stackIn_20_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_10_0 < stackIn_10_1) {
                            var3 = var3 + ((um) this).c(var4, -91);
                            var2_int += 100;
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
                  if (var2_int != 0) {
                    stackOut_19_0 = 100 * var3;
                    stackOut_19_1 = var2_int;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L3;
                  } else {
                    stackOut_17_0 = 100;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                }
                var4 = stackIn_20_0 / stackIn_20_1;
                stackOut_20_0 = var4;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "um.J(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    private final synchronized byte[] a(boolean param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            if (!this.b(param3, param2, 0)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  byte[] discarded$1 = ((um) this).a(-73, 12, ((int[]) ((um) this).field_m[23])[2]);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (((um) this).field_e[param3] == null) {
                    break L3;
                  } else {
                    if (null == ((um) this).field_e[param3][param2]) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = this.a(param1, 123, param2, param3) ? 1 : 0;
                if (var6 != 0) {
                  break L2;
                } else {
                  this.a(param3, 11076);
                  var6 = this.a(param1, -41, param2, param3) ? 1 : 0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  }
                }
              }
              if (((um) this).field_e[param3] != null) {
                L4: {
                  if (((um) this).field_e[param3][param2] == null) {
                    break L4;
                  } else {
                    var5 = (Object) (Object) jf.a(false, false, ((um) this).field_e[param3][param2]);
                    if (null != var5) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    L6: {
                      if (((um) this).field_f != 1) {
                        break L6;
                      } else {
                        ((um) this).field_e[param3][param2] = null;
                        if (1 != ((um) this).field_d.field_o[param3]) {
                          break L5;
                        } else {
                          ((um) this).field_e[param3] = null;
                          if (Chess.field_G == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (((um) this).field_f == 2) {
                      ((um) this).field_e[param3] = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_41_0 = var5;
                stackIn_42_0 = stackOut_41_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_43_0 = var5;
            stackOut_43_1 = new StringBuilder().append("um.R(").append(param0).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_46_0 = stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L7;
            } else {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L7;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_42_0;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            if (((um) this).c((byte) 127)) {
              if (param1 == 100) {
                param0 = param0.toLowerCase();
                var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -110, (CharSequence) (Object) param0), (byte) 17);
                stackOut_6_0 = ((um) this).a(var3_int, (byte) -72);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("um.B(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param1, param2, 0)) {
              L1: {
                var4_int = 124 % ((14 - param0) / 54);
                if (null == ((um) this).field_e[param1]) {
                  break L1;
                } else {
                  if (((um) this).field_e[param1][param2] != null) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (null == ((um) this).field_m[param1]) {
                this.a(param1, 11076);
                if (null == ((um) this).field_m[param1]) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              } else {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "um.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 <= -27) {
              if (!this.b(0, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (((um) this).field_m[param0] != null) {
                  stackOut_11_0 = 100;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = ((um) this).field_i.b(110, param0);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 121;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "um.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            if (((um) this).c((byte) 124)) {
              if (param0 == 4) {
                param1 = param1.toLowerCase();
                var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -100, (CharSequence) (Object) param1), (byte) 17);
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("um.G(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(0, param0)) {
              if (null != ((um) this).field_m[param0]) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                this.a(param0, 11076);
                if (((um) this).field_m[param0] == null) {
                  L1: {
                    if (param1 == -72) {
                      break L1;
                    } else {
                      ((byte[]) ((um) this).field_m[1])[3] = ((byte[]) ((Object[]) ((um) this).field_m[20])[2])[19];
                      break L1;
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
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
          throw fk.a((Throwable) (Object) var3, "um.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 5847) {
                break L1;
              } else {
                field_l = (lm[]) ((um) this).field_m[2];
                break L1;
              }
            }
            stackOut_3_0 = this.a(true, (int[]) null, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "um.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        p var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        p var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17_int = 0;
        byte[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_13_0 = null;
        int[] stackIn_13_1 = null;
        int stackIn_29_0 = 0;
        Object stackIn_31_0 = null;
        int[] stackIn_31_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_77_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int[] stackOut_12_1 = null;
        int stackOut_28_0 = 0;
        Object stackOut_30_0 = null;
        int[] stackOut_30_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_76_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var23 = Chess.field_G;
        try {
          L0: {
            if (this.b(0, param3)) {
              if (((um) this).field_m[param3] != null) {
                L1: {
                  var5_int = ((um) this).field_d.field_l[param3];
                  var6 = ((um) this).field_d.field_h[param3];
                  if (((um) this).field_e[param3] != null) {
                    break L1;
                  } else {
                    ((um) this).field_e[param3] = new Object[((um) this).field_d.field_o[param3]];
                    break L1;
                  }
                }
                var7 = ((um) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        stackOut_12_0 = null;
                        stackOut_12_1 = (int[]) var6;
                        stackIn_31_0 = stackOut_12_0;
                        stackIn_31_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var23 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_13_0 != (Object) (Object) stackIn_13_1) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var23 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (null == var7[var10_int]) {
                              var8 = 0;
                              if (var23 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var23 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    } else {
                      stackOut_30_0 = null;
                      stackOut_30_1 = (int[]) param0;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L3;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_31_0 == (Object) (Object) stackIn_31_1) {
                        break L9;
                      } else {
                        L10: {
                          if (0 != param0[0]) {
                            break L10;
                          } else {
                            if (0 != param0[1]) {
                              break L10;
                            } else {
                              if (param0[2] != 0) {
                                break L10;
                              } else {
                                if (param0[3] == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = jf.a(true, false, ((um) this).field_m[param3]);
                        var10 = new p(var9_array);
                        var10.a(5, param0, (byte) -67, var10.field_o.length);
                        break L8;
                      }
                    }
                    var9_array = jf.a(false, false, ((um) this).field_m[param3]);
                    break L8;
                  }
                  var11 = -12 / ((49 - param1) / 41);
                  try {
                    L11: {
                      var10_array = dj.a(var9_array, -21);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var12_ref_RuntimeException = decompiledCaughtException;
                      stackOut_49_0 = (RuntimeException) var12_ref_RuntimeException;
                      stackOut_49_1 = new StringBuilder();
                      stackIn_52_0 = stackOut_49_0;
                      stackIn_52_1 = stackOut_49_1;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      if (null == param0) {
                        stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                        stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                        stackOut_52_2 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        break L12;
                      } else {
                        stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                        stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                        stackOut_50_2 = 1;
                        stackIn_53_0 = stackOut_50_0;
                        stackIn_53_1 = stackOut_50_1;
                        stackIn_53_2 = stackOut_50_2;
                        break L12;
                      }
                    }
                    throw fk.a((Throwable) (Object) stackIn_53_0, (stackIn_53_2 != 0) + " " + param3 + " " + var9_array.length + " " + ke.a(var9_array, 21106, var9_array.length) + " " + ke.a(var9_array, 21106, var9_array.length + -2) + " " + ((um) this).field_d.field_p[param3] + " " + ((um) this).field_d.field_c);
                  }
                  L13: {
                    if (((um) this).field_k) {
                      ((um) this).field_m[param3] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (var5_int > 1) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (null == var6) {
                                break L18;
                              } else {
                                var12 = var6[0];
                                if (var23 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var12 = 0;
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (((um) this).field_f == 0) {
                                break L20;
                              } else {
                                var7[var12] = (Object) (Object) var10_array;
                                if (var23 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var12] = vm.a(25633, var10_array, false);
                            break L19;
                          }
                          if (var23 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (2 == ((um) this).field_f) {
                          break L21;
                        } else {
                          var12 = var10_array.length;
                          var12--;
                          var13 = 255 & var10_array[var12];
                          var12 = var12 - var5_int * (var13 * 4);
                          var14 = new p(var10_array);
                          var15_ref_int__ = new int[var5_int];
                          var14.field_l = var12;
                          var16 = 0;
                          L22: while (true) {
                            L23: {
                              L24: {
                                if (var13 <= var16) {
                                  break L24;
                                } else {
                                  var17_int = 0;
                                  stackOut_76_0 = 0;
                                  stackIn_86_0 = stackOut_76_0;
                                  stackIn_77_0 = stackOut_76_0;
                                  if (var23 != 0) {
                                    break L23;
                                  } else {
                                    var18 = stackIn_77_0;
                                    L25: while (true) {
                                      L26: {
                                        L27: {
                                          if (var5_int <= var18) {
                                            break L27;
                                          } else {
                                            var17_int = var17_int + var14.e((byte) -119);
                                            var15_ref_int__[var18] = var15_ref_int__[var18] + var17_int;
                                            var18++;
                                            if (var23 != 0) {
                                              break L26;
                                            } else {
                                              if (var23 == 0) {
                                                continue L25;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        var16++;
                                        break L26;
                                      }
                                      if (var23 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_85_0 = var5_int;
                              stackIn_86_0 = stackOut_85_0;
                              break L23;
                            }
                            var16_ref_byte____ = new byte[stackIn_86_0][];
                            var17_int = 0;
                            L28: while (true) {
                              L29: {
                                L30: {
                                  if (var17_int >= var5_int) {
                                    break L30;
                                  } else {
                                    var16_ref_byte____[var17_int] = new byte[var15_ref_int__[var17_int]];
                                    var15_ref_int__[var17_int] = 0;
                                    var17_int++;
                                    if (var23 != 0) {
                                      break L29;
                                    } else {
                                      if (var23 == 0) {
                                        continue L28;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                }
                                var14.field_l = var12;
                                var17_int = 0;
                                break L29;
                              }
                              var18 = 0;
                              L31: while (true) {
                                L32: {
                                  L33: {
                                    if (var13 <= var18) {
                                      break L33;
                                    } else {
                                      var19 = 0;
                                      stackOut_95_0 = 0;
                                      stackIn_105_0 = stackOut_95_0;
                                      stackIn_96_0 = stackOut_95_0;
                                      if (var23 != 0) {
                                        break L32;
                                      } else {
                                        var20 = stackIn_96_0;
                                        L34: while (true) {
                                          L35: {
                                            L36: {
                                              if (~var5_int >= ~var20) {
                                                break L36;
                                              } else {
                                                var19 = var19 + var14.e((byte) -127);
                                                ne.a(var10_array, var17_int, var16_ref_byte____[var20], var15_ref_int__[var20], var19);
                                                var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                                var17_int = var17_int + var19;
                                                var20++;
                                                if (var23 != 0) {
                                                  break L35;
                                                } else {
                                                  if (var23 == 0) {
                                                    continue L34;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                            }
                                            var18++;
                                            break L35;
                                          }
                                          if (var23 == 0) {
                                            continue L31;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_104_0 = 0;
                                  stackIn_105_0 = stackOut_104_0;
                                  break L32;
                                }
                                var18 = stackIn_105_0;
                                L37: while (true) {
                                  L38: {
                                    if (~var5_int >= ~var18) {
                                      break L38;
                                    } else {
                                      if (var23 != 0) {
                                        break L15;
                                      } else {
                                        L39: {
                                          L40: {
                                            if (var6 != null) {
                                              break L40;
                                            } else {
                                              var19 = var18;
                                              if (var23 == 0) {
                                                break L39;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                          var19 = var6[var18];
                                          break L39;
                                        }
                                        L41: {
                                          L42: {
                                            if (((um) this).field_f == 0) {
                                              break L42;
                                            } else {
                                              var7[var19] = (Object) (Object) var16_ref_byte____[var18];
                                              if (var23 == 0) {
                                                break L41;
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                          var7[var19] = vm.a(25633, var16_ref_byte____[var18], false);
                                          break L41;
                                        }
                                        var18++;
                                        if (var23 == 0) {
                                          continue L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  if (var23 == 0) {
                                    break L15;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var12 = var10_array.length;
                      var12--;
                      var13 = 255 & var10_array[var12];
                      var12 = var12 - 4 * var5_int * var13;
                      var14 = new p(var10_array);
                      var15 = 0;
                      var14.field_l = var12;
                      var16 = 0;
                      var17_int = 0;
                      L43: while (true) {
                        L44: {
                          L45: {
                            if (~var17_int <= ~var13) {
                              break L45;
                            } else {
                              var18 = 0;
                              stackOut_123_0 = 0;
                              stackIn_138_0 = stackOut_123_0;
                              stackIn_124_0 = stackOut_123_0;
                              if (var23 != 0) {
                                break L44;
                              } else {
                                var19 = stackIn_124_0;
                                L46: while (true) {
                                  L47: {
                                    L48: {
                                      if (~var5_int >= ~var19) {
                                        break L48;
                                      } else {
                                        var18 = var18 + var14.e((byte) -105);
                                        if (var23 != 0) {
                                          break L47;
                                        } else {
                                          L49: {
                                            L50: {
                                              if (null == var6) {
                                                break L50;
                                              } else {
                                                var20 = var6[var19];
                                                if (var23 == 0) {
                                                  break L49;
                                                } else {
                                                  break L50;
                                                }
                                              }
                                            }
                                            var20 = var19;
                                            break L49;
                                          }
                                          L51: {
                                            if (~var20 != ~param2) {
                                              break L51;
                                            } else {
                                              var15 = var15 + var18;
                                              var16 = var20;
                                              break L51;
                                            }
                                          }
                                          var19++;
                                          if (var23 == 0) {
                                            continue L46;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    var17_int++;
                                    break L47;
                                  }
                                  if (var23 == 0) {
                                    continue L43;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_137_0 = -1;
                          stackIn_138_0 = stackOut_137_0;
                          break L44;
                        }
                        if (stackIn_138_0 == ~var15) {
                          stackOut_141_0 = 1;
                          stackIn_142_0 = stackOut_141_0;
                          return stackIn_142_0 != 0;
                        } else {
                          var17 = new byte[var15];
                          var14.field_l = var12;
                          var15 = 0;
                          var18 = 0;
                          var19 = 0;
                          L52: while (true) {
                            L53: {
                              if (var13 <= var19) {
                                break L53;
                              } else {
                                var20 = 0;
                                stackOut_145_0 = 0;
                                stackIn_163_0 = stackOut_145_0;
                                stackIn_146_0 = stackOut_145_0;
                                if (var23 != 0) {
                                  break L14;
                                } else {
                                  var21 = stackIn_146_0;
                                  L54: while (true) {
                                    L55: {
                                      L56: {
                                        if (~var21 <= ~var5_int) {
                                          break L56;
                                        } else {
                                          var20 = var20 + var14.e((byte) -94);
                                          if (var23 != 0) {
                                            break L55;
                                          } else {
                                            L57: {
                                              L58: {
                                                if (var6 == null) {
                                                  break L58;
                                                } else {
                                                  var22 = var6[var21];
                                                  if (var23 == 0) {
                                                    break L57;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              var22 = var21;
                                              break L57;
                                            }
                                            L59: {
                                              if (var22 == param2) {
                                                ne.a(var10_array, var18, var17, var15, var20);
                                                var15 = var15 + var20;
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            }
                                            var18 = var18 + var20;
                                            var21++;
                                            if (var23 == 0) {
                                              continue L54;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      var19++;
                                      break L55;
                                    }
                                    if (var23 == 0) {
                                      continue L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var16] = (Object) (Object) var17;
                            break L15;
                          }
                        }
                      }
                    }
                    stackOut_162_0 = 1;
                    stackIn_163_0 = stackOut_162_0;
                    break L14;
                  }
                  break L0;
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
          L60: {
            var5 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("um.E(");
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param0 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L60;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L60;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(0, param1)) {
              L1: {
                if (param0 < -49) {
                  break L1;
                } else {
                  ((um) this).field_d = null;
                  break L1;
                }
              }
              stackOut_6_0 = ((um) this).field_d.field_o[param1];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "um.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((um) this).c((byte) 127)) {
              L1: {
                if (param0 < param2) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (~((um) this).field_d.field_o.length >= ~param0) {
                      break L1;
                    } else {
                      if (~param1 > ~((um) this).field_d.field_o[param0]) {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (!om.field_j) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(param0 + " " + param1);
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "um.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
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
            if (!this.b(0, param2)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == 7) {
                  break L1;
                } else {
                  ((um) this).field_m = (Object[]) ((um) this).field_m[1];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4_int = ((um) this).field_d.field_j[param2].a(ga.a((byte) -77, (CharSequence) (Object) param0), (byte) 17);
              if (!this.b(param2, var4_int, 0)) {
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
            stackOut_15_1 = new StringBuilder().append("um.H(");
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
          throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        cd[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cd stackIn_11_2 = null;
        cd stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        rk stackIn_11_6 = null;
        rk stackIn_11_7 = null;
        Object stackIn_11_8 = null;
        cd[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        cd stackIn_13_2 = null;
        cd stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        rk stackIn_13_6 = null;
        rk stackIn_13_7 = null;
        Object stackIn_13_8 = null;
        cd[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cd stackIn_15_2 = null;
        cd stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        rk stackIn_15_6 = null;
        rk stackIn_15_7 = null;
        Object stackIn_15_8 = null;
        cd[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cd stackIn_16_2 = null;
        cd stackIn_16_3 = null;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        rk stackIn_16_6 = null;
        rk stackIn_16_7 = null;
        Object stackIn_16_8 = null;
        int stackIn_16_9 = 0;
        cd[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cd stackIn_17_2 = null;
        cd stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        rk stackIn_17_6 = null;
        rk stackIn_17_7 = null;
        Object stackIn_17_8 = null;
        int stackIn_17_9 = 0;
        cd[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cd stackIn_18_2 = null;
        cd stackIn_18_3 = null;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        rk stackIn_18_6 = null;
        rk stackIn_18_7 = null;
        Object stackIn_18_8 = null;
        int stackIn_18_9 = 0;
        cd[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cd stackIn_19_2 = null;
        cd stackIn_19_3 = null;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        rk stackIn_19_6 = null;
        rk stackIn_19_7 = null;
        Object stackIn_19_8 = null;
        int stackIn_19_9 = 0;
        cd[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cd stackIn_20_2 = null;
        cd stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        rk stackIn_20_6 = null;
        rk stackIn_20_7 = null;
        Object stackIn_20_8 = null;
        int stackIn_20_9 = 0;
        int stackIn_20_10 = 0;
        RuntimeException decompiledCaughtException = null;
        cd[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cd stackOut_10_2 = null;
        cd stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        rk stackOut_10_6 = null;
        rk stackOut_10_7 = null;
        Object stackOut_10_8 = null;
        cd[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cd stackOut_15_2 = null;
        cd stackOut_15_3 = null;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        rk stackOut_15_6 = null;
        rk stackOut_15_7 = null;
        Object stackOut_15_8 = null;
        int stackOut_15_9 = 0;
        cd[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cd stackOut_11_2 = null;
        cd stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        rk stackOut_11_6 = null;
        rk stackOut_11_7 = null;
        Object stackOut_11_8 = null;
        cd[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cd stackOut_13_2 = null;
        cd stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        rk stackOut_13_6 = null;
        rk stackOut_13_7 = null;
        Object stackOut_13_8 = null;
        int stackOut_13_9 = 0;
        cd[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cd stackOut_16_2 = null;
        cd stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        rk stackOut_16_6 = null;
        rk stackOut_16_7 = null;
        Object stackOut_16_8 = null;
        int stackOut_16_9 = 0;
        cd[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cd stackOut_17_2 = null;
        cd stackOut_17_3 = null;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        rk stackOut_17_6 = null;
        rk stackOut_17_7 = null;
        Object stackOut_17_8 = null;
        int stackOut_17_9 = 0;
        cd[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        cd stackOut_19_2 = null;
        cd stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        rk stackOut_19_6 = null;
        rk stackOut_19_7 = null;
        Object stackOut_19_8 = null;
        int stackOut_19_9 = 0;
        int stackOut_19_10 = 0;
        cd[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cd stackOut_18_2 = null;
        cd stackOut_18_3 = null;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        rk stackOut_18_6 = null;
        rk stackOut_18_7 = null;
        Object stackOut_18_8 = null;
        int stackOut_18_9 = 0;
        int stackOut_18_10 = 0;
        var2 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (null != qd.field_w) {
                break L1;
              } else {
                qd.field_w = new qe();
                break L1;
              }
            }
            L2: {
              mi.field_q = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
              hg.field_b = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
              mi.field_q.field_y = 80;
              hg.field_b.field_y = 80;
              if (param0 == 640) {
                break L2;
              } else {
                field_g = null;
                break L2;
              }
            }
            var1_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var1_int >= 5) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L4;
                    } else {
                      L6: {
                        stackOut_10_0 = ok.field_Ib;
                        stackOut_10_1 = var1_int;
                        stackOut_10_2 = null;
                        stackOut_10_3 = null;
                        stackOut_10_4 = 24 * var1_int + ak.field_k[3];
                        stackOut_10_5 = ak.field_m[3] + -28;
                        stackOut_10_6 = ek.field_c[var1_int];
                        stackOut_10_7 = ek.field_c[5 + var1_int];
                        stackOut_10_8 = null;
                        stackIn_15_0 = stackOut_10_0;
                        stackIn_15_1 = stackOut_10_1;
                        stackIn_15_2 = stackOut_10_2;
                        stackIn_15_3 = stackOut_10_3;
                        stackIn_15_4 = stackOut_10_4;
                        stackIn_15_5 = stackOut_10_5;
                        stackIn_15_6 = stackOut_10_6;
                        stackIn_15_7 = stackOut_10_7;
                        stackIn_15_8 = stackOut_10_8;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        stackIn_11_4 = stackOut_10_4;
                        stackIn_11_5 = stackOut_10_5;
                        stackIn_11_6 = stackOut_10_6;
                        stackIn_11_7 = stackOut_10_7;
                        stackIn_11_8 = stackOut_10_8;
                        if (var1_int != 2) {
                          stackOut_15_0 = (cd[]) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = null;
                          stackOut_15_3 = null;
                          stackOut_15_4 = stackIn_15_4;
                          stackOut_15_5 = stackIn_15_5;
                          stackOut_15_6 = (rk) (Object) stackIn_15_6;
                          stackOut_15_7 = (rk) (Object) stackIn_15_7;
                          stackOut_15_8 = stackIn_15_8;
                          stackOut_15_9 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          stackIn_16_4 = stackOut_15_4;
                          stackIn_16_5 = stackOut_15_5;
                          stackIn_16_6 = stackOut_15_6;
                          stackIn_16_7 = stackOut_15_7;
                          stackIn_16_8 = stackOut_15_8;
                          stackIn_16_9 = stackOut_15_9;
                          break L6;
                        } else {
                          stackOut_11_0 = (cd[]) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = null;
                          stackOut_11_3 = null;
                          stackOut_11_4 = stackIn_11_4;
                          stackOut_11_5 = stackIn_11_5;
                          stackOut_11_6 = (rk) (Object) stackIn_11_6;
                          stackOut_11_7 = (rk) (Object) stackIn_11_7;
                          stackOut_11_8 = stackIn_11_8;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          stackIn_13_3 = stackOut_11_3;
                          stackIn_13_4 = stackOut_11_4;
                          stackIn_13_5 = stackOut_11_5;
                          stackIn_13_6 = stackOut_11_6;
                          stackIn_13_7 = stackOut_11_7;
                          stackIn_13_8 = stackOut_11_8;
                          stackOut_13_0 = (cd[]) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = null;
                          stackOut_13_3 = null;
                          stackOut_13_4 = stackIn_13_4;
                          stackOut_13_5 = stackIn_13_5;
                          stackOut_13_6 = (rk) (Object) stackIn_13_6;
                          stackOut_13_7 = (rk) (Object) stackIn_13_7;
                          stackOut_13_8 = stackIn_13_8;
                          stackOut_13_9 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          stackIn_16_1 = stackOut_13_1;
                          stackIn_16_2 = stackOut_13_2;
                          stackIn_16_3 = stackOut_13_3;
                          stackIn_16_4 = stackOut_13_4;
                          stackIn_16_5 = stackOut_13_5;
                          stackIn_16_6 = stackOut_13_6;
                          stackIn_16_7 = stackOut_13_7;
                          stackIn_16_8 = stackOut_13_8;
                          stackIn_16_9 = stackOut_13_9;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          stackOut_16_0 = (cd[]) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = null;
                          stackOut_16_3 = null;
                          stackOut_16_4 = stackIn_16_4;
                          stackOut_16_5 = stackIn_16_5;
                          stackOut_16_6 = (rk) (Object) stackIn_16_6;
                          stackOut_16_7 = (rk) (Object) stackIn_16_7;
                          stackOut_16_8 = stackIn_16_8;
                          stackOut_16_9 = stackIn_16_9;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          stackIn_18_3 = stackOut_16_3;
                          stackIn_18_4 = stackOut_16_4;
                          stackIn_18_5 = stackOut_16_5;
                          stackIn_18_6 = stackOut_16_6;
                          stackIn_18_7 = stackOut_16_7;
                          stackIn_18_8 = stackOut_16_8;
                          stackIn_18_9 = stackOut_16_9;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          stackIn_17_4 = stackOut_16_4;
                          stackIn_17_5 = stackOut_16_5;
                          stackIn_17_6 = stackOut_16_6;
                          stackIn_17_7 = stackOut_16_7;
                          stackIn_17_8 = stackOut_16_8;
                          stackIn_17_9 = stackOut_16_9;
                          if (var1_int == 3) {
                            break L8;
                          } else {
                            stackOut_17_0 = (cd[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = null;
                            stackOut_17_3 = null;
                            stackOut_17_4 = stackIn_17_4;
                            stackOut_17_5 = stackIn_17_5;
                            stackOut_17_6 = (rk) (Object) stackIn_17_6;
                            stackOut_17_7 = (rk) (Object) stackIn_17_7;
                            stackOut_17_8 = stackIn_17_8;
                            stackOut_17_9 = stackIn_17_9;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_19_2 = stackOut_17_2;
                            stackIn_19_3 = stackOut_17_3;
                            stackIn_19_4 = stackOut_17_4;
                            stackIn_19_5 = stackOut_17_5;
                            stackIn_19_6 = stackOut_17_6;
                            stackIn_19_7 = stackOut_17_7;
                            stackIn_19_8 = stackOut_17_8;
                            stackIn_19_9 = stackOut_17_9;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            stackIn_18_3 = stackOut_17_3;
                            stackIn_18_4 = stackOut_17_4;
                            stackIn_18_5 = stackOut_17_5;
                            stackIn_18_6 = stackOut_17_6;
                            stackIn_18_7 = stackOut_17_7;
                            stackIn_18_8 = stackOut_17_8;
                            stackIn_18_9 = stackOut_17_9;
                            if (var1_int != 1) {
                              stackOut_19_0 = (cd[]) (Object) stackIn_19_0;
                              stackOut_19_1 = stackIn_19_1;
                              stackOut_19_2 = null;
                              stackOut_19_3 = null;
                              stackOut_19_4 = stackIn_19_4;
                              stackOut_19_5 = stackIn_19_5;
                              stackOut_19_6 = (rk) (Object) stackIn_19_6;
                              stackOut_19_7 = (rk) (Object) stackIn_19_7;
                              stackOut_19_8 = stackIn_19_8;
                              stackOut_19_9 = stackIn_19_9;
                              stackOut_19_10 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              stackIn_20_2 = stackOut_19_2;
                              stackIn_20_3 = stackOut_19_3;
                              stackIn_20_4 = stackOut_19_4;
                              stackIn_20_5 = stackOut_19_5;
                              stackIn_20_6 = stackOut_19_6;
                              stackIn_20_7 = stackOut_19_7;
                              stackIn_20_8 = stackOut_19_8;
                              stackIn_20_9 = stackOut_19_9;
                              stackIn_20_10 = stackOut_19_10;
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        stackOut_18_0 = (cd[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = null;
                        stackOut_18_3 = null;
                        stackOut_18_4 = stackIn_18_4;
                        stackOut_18_5 = stackIn_18_5;
                        stackOut_18_6 = (rk) (Object) stackIn_18_6;
                        stackOut_18_7 = (rk) (Object) stackIn_18_7;
                        stackOut_18_8 = stackIn_18_8;
                        stackOut_18_9 = stackIn_18_9;
                        stackOut_18_10 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        stackIn_20_4 = stackOut_18_4;
                        stackIn_20_5 = stackOut_18_5;
                        stackIn_20_6 = stackOut_18_6;
                        stackIn_20_7 = stackOut_18_7;
                        stackIn_20_8 = stackOut_18_8;
                        stackIn_20_9 = stackOut_18_9;
                        stackIn_20_10 = stackOut_18_10;
                        break L7;
                      }
                      stackIn_20_0[stackIn_20_1] = new cd(stackIn_20_4, stackIn_20_5, stackIn_20_6, stackIn_20_7, (rk) (Object) stackIn_20_8, stackIn_20_9 != 0, stackIn_20_10 != 0);
                      var1_int++;
                      if (var2 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var1_int = v.field_j.field_t + (v.field_j.field_H + 4);
                ak.field_m[7] = v.field_j.field_C + (200 + v.field_j.field_t) - -var1_int;
                ak.field_y[7] = 30 + 2 * var1_int;
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "um.I(" + param0 + ')');
        }
    }

    private final synchronized void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 11076) {
                break L1;
              } else {
                ((um) this).field_m = (Object[]) ((um) this).field_m[5];
                break L1;
              }
            }
            L2: {
              L3: {
                if (((um) this).field_k) {
                  break L3;
                } else {
                  ((um) this).field_m[param0] = vm.a(dm.a(param1, 20325), ((um) this).field_i.c(param0, 1), false);
                  if (Chess.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((um) this).field_m[param0] = (Object) (Object) ((um) this).field_i.c(param0, 1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "um.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized byte[] b(byte param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((um) this).c((byte) 125)) {
            if (((um) this).field_d.field_o.length != 1) {
              if (!this.b(0, param1)) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              } else {
                if (((um) this).field_d.field_o[param1] != 1) {
                  L0: {
                    if (param0 == -74) {
                      break L0;
                    } else {
                      ((long[]) ((Object[]) ((um) this).field_m[2])[1])[0] = -41L;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  stackOut_12_0 = ((um) this).a(param1, 0, 5847);
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            } else {
              stackOut_4_0 = ((um) this).a(0, param1, param0 + 5921);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "um.U(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 117) {
                break L1;
              } else {
                ((um) this).field_e = null;
                break L1;
              }
            }
            L2: {
              if (null != ((um) this).field_d) {
                break L2;
              } else {
                ((um) this).field_d = ((um) this).field_i.b(104);
                if (((um) this).field_d != null) {
                  ((um) this).field_m = new Object[((um) this).field_d.field_g];
                  ((um) this).field_e = new Object[((um) this).field_d.field_g][];
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "um.M(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
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
            if (((um) this).c((byte) 120)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -78) {
                  break L1;
                } else {
                  int discarded$2 = ((um) this).a((String) ((um) this).field_m[0], ((int[]) ((um) this).field_m[0])[1], ((int[]) ((um) this).field_m[10])[1]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4_int = ((um) this).field_d.field_e.a(ga.a((byte) -109, (CharSequence) (Object) param0), (byte) 17);
              if (this.b(0, var4_int)) {
                var5 = ((um) this).field_d.field_j[var4_int].a(ga.a((byte) -112, (CharSequence) (Object) param1), (byte) 17);
                stackOut_9_0 = ((um) this).a((byte) -80, var4_int, var5);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("um.V(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((um) this).c((byte) 124)) {
              param0 = param0.toLowerCase();
              var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -124, (CharSequence) (Object) param0), (byte) 17);
              if (!this.b(param1, var3_int)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("um.P(");
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
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            if (((um) this).c((byte) 119)) {
              if (param0 == -40) {
                var2_int = 1;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var3 <= ~((um) this).field_d.field_q.length) {
                        break L3;
                      } else {
                        stackOut_9_0 = ((um) this).field_d.field_q[var3];
                        stackIn_19_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            var4 = stackIn_10_0;
                            if (((um) this).field_m[var4] == null) {
                              this.a(var4, 11076);
                              if (((um) this).field_m[var4] == null) {
                                var2_int = 0;
                                break L4;
                              } else {
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
                    stackOut_18_0 = var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
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
          throw fk.a((Throwable) (Object) var2, "um.S(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final int c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!((um) this).c((byte) 125)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 0) {
                  break L1;
                } else {
                  boolean discarded$2 = ((um) this).a(-40, ((byte[]) ((Object[]) ((um) this).field_m[9])[4])[14]);
                  break L1;
                }
              }
              var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -94, (CharSequence) (Object) param0), (byte) 17);
              stackOut_8_0 = ((um) this).c(var3_int, param1 + -47);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("um.L(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    um(ua param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((um) this).field_d = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((um) this).field_i = param0;
                  ((um) this).field_f = param2;
                  ((um) this).field_k = param1;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("um.<init>(");
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
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new km(640, 480);
        field_h = "No players";
        field_a = 0;
        field_l = new lm[13];
    }
}
