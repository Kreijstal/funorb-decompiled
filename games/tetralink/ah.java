/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private Object[][] field_h;
    static int field_a;
    private Object[] field_i;
    private hk field_b;
    private t field_e;
    static String[] field_j;
    static String field_c;
    static int[] field_g;
    boolean field_f;
    int field_d;

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
            if (((ah) this).c(97)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1) {
                  break L1;
                } else {
                  boolean discarded$2 = this.a(-27, (int[]) null, true, ((int[]) ((Object[]) ((ah) this).field_i[4])[7])[23]);
                  break L1;
                }
              }
              var3_int = ((ah) this).field_e.field_r.a(-114, g.a(-1, (CharSequence) (Object) param0));
              stackOut_6_0 = ((ah) this).e(-11337, var3_int);
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ah.CA(");
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
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          if (param1 > 30) {
            if (((ah) this).c(105)) {
              if (((ah) this).field_e.field_d.length != 1) {
                if (this.a((byte) 119, param0)) {
                  if (((ah) this).field_e.field_d[param0] != 1) {
                    throw new RuntimeException();
                  } else {
                    stackOut_13_0 = ((ah) this).a((byte) -30, param0, 0);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_7_0 = ((ah) this).a((byte) -30, 0, param0);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ah.D(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        try {
          L0: {
            var4_int = 8 / ((-45 - param0) / 33);
            stackOut_0_0 = this.a(-2, (int[]) null, param2, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "ah.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ah) this).c(94)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  boolean discarded$2 = this.a(((int[]) ((Object[]) ((ah) this).field_i[0])[4])[0], (int[]) null, false, 120);
                  break L1;
                }
              }
              stackOut_6_0 = ((ah) this).field_e.field_d.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ah.F(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        oh var13 = null;
        Object var14 = null;
        oh[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        oh[] stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var6 = ra.field_b;
              var7 = ra.field_f;
              var8 = ra.field_e;
              var9 = new oh(param1, -(param1 * 2) + param5);
              var9.c();
              ra.b(0, 0, param1, param5 - param1 * 2, param4, param2);
              var10 = new oh(param1, param1);
              var10.c();
              ra.c(0, 0, param1, param1, param4);
              var11 = new oh(16, param1);
              var11.c();
              ra.c(0, 0, 16, param1, param4);
              var12 = new oh(param1, param1);
              var12.c();
              ra.c(0, 0, param1, param1, param2);
              var13 = new oh(16, param1);
              var13.c();
              ra.c(0, 0, param3, param1, param2);
              var14 = null;
              if (param0 > 0) {
                var14 = (Object) (Object) new oh(16, 16);
                ((oh) var14).c();
                ra.c(0, 0, 16, 16, param0);
                break L1;
              } else {
                break L1;
              }
            }
            ra.a(var6, var7, var8);
            stackOut_4_0 = new oh[]{var10, var11, var10, var9, (oh) var14, var9, var12, var13, var12};
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var6_ref, "ah.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(String param0, byte param1) {
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
            if (((ah) this).c(111)) {
              param0 = param0.toLowerCase();
              var3_int = ((ah) this).field_e.field_r.a(84, g.a(-1, (CharSequence) (Object) param0));
              if (param1 <= -61) {
                stackOut_6_0 = ((ah) this).d(var3_int, 0);
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
            stackOut_8_1 = new StringBuilder().append("ah.L(");
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
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.a((byte) 119, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null == ((ah) this).field_i[param1]) {
                L1: {
                  if (param0 == -11337) {
                    break L1;
                  } else {
                    ((ah) this).field_e = (t) ((ah) this).field_i[9];
                    break L1;
                  }
                }
                stackOut_11_0 = ((ah) this).field_b.a(param1, 0);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ah.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized void b(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((ah) this).field_f) {
                  break L2;
                } else {
                  ((ah) this).field_i[param1] = ik.a(((ah) this).field_b.b(20396, param1), false, param0 + -134);
                  if (TetraLink.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ah) this).field_i[param1] = (Object) (Object) ((ah) this).field_b.b(20396, param1);
              break L1;
            }
            L3: {
              if (param0 == -3) {
                break L3;
              } else {
                boolean discarded$2 = ((ah) this).a(((boolean[]) ((ah) this).field_i[4])[5]);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ah.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_14_0 = null;
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
        Object stackOut_13_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_1_0 = null;
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
            if (this.a(param2, (byte) -72, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((ah) this).field_h[param2] == null) {
                    break L2;
                  } else {
                    if (null != ((ah) this).field_h[param2][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = this.a(param2, param1, false, param3) ? 1 : 0;
                if (var6 == 0) {
                  this.b((byte) -3, param2);
                  var6 = this.a(param2, param1, false, param3) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (byte[]) (Object) stackIn_14_0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param0 == -2) {
                if (((ah) this).field_h[param2] != null) {
                  L3: {
                    if (((ah) this).field_h[param2][param3] == null) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) vj.a(false, (byte) -28, ((ah) this).field_h[param2][param3]);
                      if (null == var5) {
                        throw new RuntimeException("");
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (((ah) this).field_d != 1) {
                          break L5;
                        } else {
                          ((ah) this).field_h[param2][param3] = null;
                          if (((ah) this).field_e.field_d[param2] == 1) {
                            ((ah) this).field_h[param2] = null;
                            if (TetraLink.field_J == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (((ah) this).field_d != 2) {
                        break L4;
                      } else {
                        ((ah) this).field_h[param2] = null;
                        break L4;
                      }
                    }
                  }
                  stackOut_41_0 = var5;
                  stackIn_42_0 = stackOut_41_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (byte[]) (Object) stackIn_17_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_43_0 = var5;
            stackOut_43_1 = new StringBuilder().append("ah.M(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_42_0;
    }

    final synchronized boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 87) {
                break L1;
              } else {
                oh[] discarded$2 = ah.a(103, -121, ((int[]) ((ah) this).field_i[4])[43], -50, ((int[]) ((ah) this).field_i[4])[7], 99);
                break L1;
              }
            }
            L2: {
              if (null == ((ah) this).field_e) {
                ((ah) this).field_e = ((ah) this).field_b.a(0);
                if (null != ((ah) this).field_e) {
                  ((ah) this).field_i = new Object[((ah) this).field_e.field_i];
                  ((ah) this).field_h = new Object[((ah) this).field_e.field_i][];
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                break L2;
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ah.A(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ah) this).c(param1 + 178)) {
              L1: {
                if (param1 == -72) {
                  break L1;
                } else {
                  ((boolean[]) ((ah) this).field_i[30])[8] = true;
                  break L1;
                }
              }
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (param2 < 0) {
                    break L2;
                  } else {
                    if (~((ah) this).field_e.field_d.length >= ~param0) {
                      break L2;
                    } else {
                      if (~param2 <= ~((ah) this).field_e.field_d[param0]) {
                        break L2;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!ec.field_k) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0 != 0;
              } else {
                throw new IllegalArgumentException(param0 + " " + param2);
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
          throw oi.a((Throwable) (Object) var4, "ah.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
            if (((ah) this).c(88)) {
              param0 = param0.toLowerCase();
              var3_int = ((ah) this).field_e.field_r.a(-115, g.a(param1 + -1, (CharSequence) (Object) param0));
              if (var3_int >= param1) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ah.K(");
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
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -23126) {
                break L1;
              } else {
                int discarded$2 = ((ah) this).e(1, 109);
                break L1;
              }
            }
            if (!this.a((byte) 119, param1)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((ah) this).field_e.field_d[param1];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ah.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(int param0, int[] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        bh var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        bh var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_34_0 = 0;
        int[] stackIn_36_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_81_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_167_0 = 0;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_172_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_19_0 = null;
        int[] stackOut_35_0 = null;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_80_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_168_0 = null;
        StringBuilder stackOut_168_1 = null;
        RuntimeException stackOut_171_0 = null;
        StringBuilder stackOut_171_1 = null;
        String stackOut_171_2 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
        var22 = TetraLink.field_J;
        try {
          L0: {
            if (!this.a((byte) 119, param0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((ah) this).field_i[param0]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                L1: {
                  var5_int = ((ah) this).field_e.field_m[param0];
                  var6 = ((ah) this).field_e.field_a[param0];
                  if (null != ((ah) this).field_h[param0]) {
                    break L1;
                  } else {
                    ((ah) this).field_h[param0] = new Object[((ah) this).field_e.field_d[param0]];
                    break L1;
                  }
                }
                if (!param2) {
                  var7 = ((ah) this).field_h[param0];
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (~var9_int <= ~var5_int) {
                          break L4;
                        } else {
                          stackOut_19_0 = (int[]) var6;
                          stackIn_36_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var22 != 0) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_20_0 != null) {
                                  break L6;
                                } else {
                                  var10_int = var9_int;
                                  if (var22 == 0) {
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
                                if (var22 == 0) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            var9_int++;
                            if (var22 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var8 == 0) {
                        stackOut_35_0 = (int[]) param1;
                        stackIn_36_0 = stackOut_35_0;
                        break L3;
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_34_0 = stackOut_33_0;
                        return stackIn_34_0 != 0;
                      }
                    }
                    L8: {
                      L9: {
                        if (stackIn_36_0 == null) {
                          break L9;
                        } else {
                          L10: {
                            if (param1[0] != 0) {
                              break L10;
                            } else {
                              if (0 != param1[1]) {
                                break L10;
                              } else {
                                if (param1[2] != 0) {
                                  break L10;
                                } else {
                                  if (param1[3] != 0) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = vj.a(true, (byte) -28, ((ah) this).field_i[param0]);
                          var10_ref = new bh(var9_array);
                          var10_ref.a(-25351, param1, var10_ref.field_u.length, 5);
                          break L8;
                        }
                      }
                      var9_array = vj.a(false, (byte) -28, ((ah) this).field_i[param0]);
                      break L8;
                    }
                    try {
                      L11: {
                        var10 = pk.a(var9_array, (byte) 88);
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_53_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_53_1 = new StringBuilder();
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (null == param1) {
                          stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                          stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                          stackOut_56_2 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          stackIn_57_2 = stackOut_56_2;
                          break L12;
                        } else {
                          stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                          stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                          stackOut_54_2 = 1;
                          stackIn_57_0 = stackOut_54_0;
                          stackIn_57_1 = stackOut_54_1;
                          stackIn_57_2 = stackOut_54_2;
                          break L12;
                        }
                      }
                      throw oi.a((Throwable) (Object) stackIn_57_0, (stackIn_57_2 != 0) + " " + param0 + " " + var9_array.length + " " + ti.a(var9_array, (byte) 92, var9_array.length) + " " + ti.a(var9_array, (byte) -15, -2 + var9_array.length) + " " + ((ah) this).field_e.field_u[param0] + " " + ((ah) this).field_e.field_v);
                    }
                    L13: {
                      if (((ah) this).field_f) {
                        ((ah) this).field_i[param0] = null;
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
                                if (var6 == null) {
                                  break L18;
                                } else {
                                  var11 = var6[0];
                                  if (var22 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var11 = 0;
                              break L17;
                            }
                            L19: {
                              L20: {
                                if (0 != ((ah) this).field_d) {
                                  break L20;
                                } else {
                                  var7[var11] = ik.a(var10, false, -137);
                                  if (var22 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var7[var11] = (Object) (Object) var10;
                              break L19;
                            }
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L21: {
                          if (((ah) this).field_d == 2) {
                            break L21;
                          } else {
                            var11 = var10.length;
                            var11--;
                            var12 = 255 & var10[var11];
                            var11 = var11 - var5_int * var12 * 4;
                            var13 = new bh(var10);
                            var13.field_t = var11;
                            var14_ref_int__ = new int[var5_int];
                            var15 = 0;
                            L22: while (true) {
                              L23: {
                                L24: {
                                  if (~var15 <= ~var12) {
                                    break L24;
                                  } else {
                                    var16_int = 0;
                                    stackOut_80_0 = 0;
                                    stackIn_90_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if (var22 != 0) {
                                      break L23;
                                    } else {
                                      var17 = stackIn_81_0;
                                      L25: while (true) {
                                        L26: {
                                          L27: {
                                            if (var5_int <= var17) {
                                              break L27;
                                            } else {
                                              var16_int = var16_int + var13.f(-112);
                                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                              var17++;
                                              if (var22 != 0) {
                                                break L26;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                          var15++;
                                          break L26;
                                        }
                                        if (var22 == 0) {
                                          continue L22;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_89_0 = var5_int;
                                stackIn_90_0 = stackOut_89_0;
                                break L23;
                              }
                              var15_ref_byte____ = new byte[stackIn_90_0][];
                              var16_int = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (var16_int >= var5_int) {
                                      break L30;
                                    } else {
                                      var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                      var14_ref_int__[var16_int] = 0;
                                      var16_int++;
                                      if (var22 != 0) {
                                        break L29;
                                      } else {
                                        if (var22 == 0) {
                                          continue L28;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  var13.field_t = var11;
                                  var16_int = 0;
                                  break L29;
                                }
                                var17 = 0;
                                L31: while (true) {
                                  L32: {
                                    L33: {
                                      if (var12 <= var17) {
                                        break L33;
                                      } else {
                                        var18 = 0;
                                        stackOut_99_0 = 0;
                                        stackIn_109_0 = stackOut_99_0;
                                        stackIn_100_0 = stackOut_99_0;
                                        if (var22 != 0) {
                                          break L32;
                                        } else {
                                          var19 = stackIn_100_0;
                                          L34: while (true) {
                                            L35: {
                                              L36: {
                                                if (var19 >= var5_int) {
                                                  break L36;
                                                } else {
                                                  var18 = var18 + var13.f(-111);
                                                  rd.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                  var16_int = var16_int + var18;
                                                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                  var19++;
                                                  if (var22 != 0) {
                                                    break L35;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L34;
                                                    } else {
                                                      break L36;
                                                    }
                                                  }
                                                }
                                              }
                                              var17++;
                                              break L35;
                                            }
                                            if (var22 == 0) {
                                              continue L31;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_108_0 = 0;
                                    stackIn_109_0 = stackOut_108_0;
                                    break L32;
                                  }
                                  var17 = stackIn_109_0;
                                  L37: while (true) {
                                    L38: {
                                      if (~var17 <= ~var5_int) {
                                        break L38;
                                      } else {
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          L39: {
                                            L40: {
                                              if (var6 != null) {
                                                break L40;
                                              } else {
                                                var18 = var17;
                                                if (var22 == 0) {
                                                  break L39;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            var18 = var6[var17];
                                            break L39;
                                          }
                                          L41: {
                                            L42: {
                                              if (((ah) this).field_d != 0) {
                                                break L42;
                                              } else {
                                                var7[var18] = ik.a(var15_ref_byte____[var17], false, -137);
                                                if (var22 == 0) {
                                                  break L41;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                            break L41;
                                          }
                                          var17++;
                                          if (var22 == 0) {
                                            continue L37;
                                          } else {
                                            break L38;
                                          }
                                        }
                                      }
                                    }
                                    if (var22 == 0) {
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
                        var11 = var10.length;
                        var11--;
                        var12 = 255 & var10[var11];
                        var11 = var11 - var12 * var5_int * 4;
                        var13 = new bh(var10);
                        var14 = 0;
                        var13.field_t = var11;
                        var15 = 0;
                        var16_int = 0;
                        L43: while (true) {
                          L44: {
                            L45: {
                              if (~var16_int <= ~var12) {
                                break L45;
                              } else {
                                var17 = 0;
                                stackOut_127_0 = 0;
                                stackIn_144_0 = stackOut_127_0;
                                stackIn_128_0 = stackOut_127_0;
                                if (var22 != 0) {
                                  break L44;
                                } else {
                                  var18 = stackIn_128_0;
                                  L46: while (true) {
                                    L47: {
                                      L48: {
                                        if (var5_int <= var18) {
                                          break L48;
                                        } else {
                                          var17 = var17 + var13.f(-124);
                                          if (var22 != 0) {
                                            break L47;
                                          } else {
                                            L49: {
                                              L50: {
                                                if (var6 == null) {
                                                  break L50;
                                                } else {
                                                  var19 = var6[var18];
                                                  if (var22 == 0) {
                                                    break L49;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                              }
                                              var19 = var18;
                                              break L49;
                                            }
                                            L51: {
                                              if (~param3 == ~var19) {
                                                var14 = var14 + var17;
                                                var15 = var19;
                                                break L51;
                                              } else {
                                                break L51;
                                              }
                                            }
                                            var18++;
                                            if (var22 == 0) {
                                              continue L46;
                                            } else {
                                              break L48;
                                            }
                                          }
                                        }
                                      }
                                      var16_int++;
                                      break L47;
                                    }
                                    if (var22 == 0) {
                                      continue L43;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_143_0 = var14;
                            stackIn_144_0 = stackOut_143_0;
                            break L44;
                          }
                          if (stackIn_144_0 != 0) {
                            var16 = new byte[var14];
                            var14 = 0;
                            var13.field_t = var11;
                            var17 = 0;
                            var18 = 0;
                            L52: while (true) {
                              L53: {
                                if (var18 >= var12) {
                                  break L53;
                                } else {
                                  var19 = 0;
                                  stackOut_149_0 = 0;
                                  stackIn_167_0 = stackOut_149_0;
                                  stackIn_150_0 = stackOut_149_0;
                                  if (var22 != 0) {
                                    break L14;
                                  } else {
                                    var20 = stackIn_150_0;
                                    L54: while (true) {
                                      L55: {
                                        L56: {
                                          if (~var20 <= ~var5_int) {
                                            break L56;
                                          } else {
                                            var19 = var19 + var13.f(48);
                                            if (var22 != 0) {
                                              break L55;
                                            } else {
                                              L57: {
                                                L58: {
                                                  if (null != var6) {
                                                    break L58;
                                                  } else {
                                                    var21 = var20;
                                                    if (var22 == 0) {
                                                      break L57;
                                                    } else {
                                                      break L58;
                                                    }
                                                  }
                                                }
                                                var21 = var6[var20];
                                                break L57;
                                              }
                                              L59: {
                                                if (~var21 == ~param3) {
                                                  rd.a(var10, var17, var16, var14, var19);
                                                  var14 = var14 + var19;
                                                  break L59;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                              var17 = var17 + var19;
                                              var20++;
                                              if (var22 == 0) {
                                                continue L54;
                                              } else {
                                                break L56;
                                              }
                                            }
                                          }
                                        }
                                        var18++;
                                        break L55;
                                      }
                                      if (var22 == 0) {
                                        continue L52;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                              }
                              var7[var15] = (Object) (Object) var16;
                              break L15;
                            }
                          } else {
                            stackOut_145_0 = 1;
                            stackIn_146_0 = stackOut_145_0;
                            return stackIn_146_0 != 0;
                          }
                        }
                      }
                      stackOut_166_0 = 1;
                      stackIn_167_0 = stackOut_166_0;
                      break L14;
                    }
                    break L0;
                  }
                } else {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_168_0 = (RuntimeException) var5;
            stackOut_168_1 = new StringBuilder().append("ah.C(").append(param0).append(',');
            stackIn_171_0 = stackOut_168_0;
            stackIn_171_1 = stackOut_168_1;
            stackIn_169_0 = stackOut_168_0;
            stackIn_169_1 = stackOut_168_1;
            if (param1 == null) {
              stackOut_171_0 = (RuntimeException) (Object) stackIn_171_0;
              stackOut_171_1 = (StringBuilder) (Object) stackIn_171_1;
              stackOut_171_2 = "null";
              stackIn_172_0 = stackOut_171_0;
              stackIn_172_1 = stackOut_171_1;
              stackIn_172_2 = stackOut_171_2;
              break L60;
            } else {
              stackOut_169_0 = (RuntimeException) (Object) stackIn_169_0;
              stackOut_169_1 = (StringBuilder) (Object) stackIn_169_1;
              stackOut_169_2 = "{...}";
              stackIn_172_0 = stackOut_169_0;
              stackIn_172_1 = stackOut_169_1;
              stackIn_172_2 = stackOut_169_2;
              break L60;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_172_0, stackIn_172_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_167_0 != 0;
    }

    public static void d(int param0) {
        try {
            field_g = null;
            field_c = null;
            field_j = null;
            if (param0 != 16) {
                field_j = null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ah.J(" + param0 + ')');
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!((ah) this).c(121)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              var3_int = ((ah) this).field_e.field_r.a(-85, g.a(param0, (CharSequence) (Object) param1));
              if (!this.a((byte) 119, var3_int)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ah.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    final synchronized boolean a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (((ah) this).c(95)) {
              var2_int = 1;
              if (!param0) {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (((ah) this).field_e.field_j.length <= var3) {
                        break L3;
                      } else {
                        stackOut_9_0 = ((ah) this).field_e.field_j[var3];
                        stackIn_17_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            var4 = stackIn_10_0;
                            if (null != ((ah) this).field_i[var4]) {
                              break L4;
                            } else {
                              this.b((byte) -3, var4);
                              if (null != ((ah) this).field_i[var4]) {
                                break L4;
                              } else {
                                var2_int = 0;
                                break L4;
                              }
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
          throw oi.a((Throwable) (Object) var2, "ah.I(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        int[] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (this.a((byte) 119, param0)) {
              L1: {
                L2: {
                  var3 = ((ah) this).field_e.field_a[param0];
                  if (null == var3) {
                    var3 = new int[((ah) this).field_e.field_m[param0]];
                    var4 = 0;
                    L3: while (true) {
                      if (~var3.length >= ~var4) {
                        break L2;
                      } else {
                        var3[var4] = var4;
                        var4++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (param1 == 0) {
                  break L1;
                } else {
                  boolean discarded$2 = ((ah) this).f(((int[]) ((ah) this).field_i[1])[2], -20);
                  break L1;
                }
              }
              stackOut_16_0 = (int[]) var3;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (int[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3_ref, "ah.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (param1 < -114) {
              if (((ah) this).c(98)) {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var4_int = ((ah) this).field_e.field_r.a(60, g.a(-1, (CharSequence) (Object) param2));
                if (this.a((byte) 119, var4_int)) {
                  var5 = ((ah) this).field_e.field_n[var4_int].a(-81, g.a(-1, (CharSequence) (Object) param0));
                  stackOut_9_0 = ((ah) this).a((byte) -30, var4_int, var5);
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ah.W(");
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
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 119) {
                break L1;
              } else {
                int discarded$2 = ((ah) this).e(-56, -114);
                break L1;
              }
            }
            if (((ah) this).c(104)) {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (param1 >= ((ah) this).field_e.field_d.length) {
                    break L2;
                  } else {
                    if (((ah) this).field_e.field_d[param1] == 0) {
                      break L2;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                }
              }
              if (!ec.field_k) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param1));
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
          throw oi.a((Throwable) (Object) var3, "ah.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final int a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.a((byte) 119, param0)) {
              L1: {
                param2 = param2.toLowerCase();
                if (!param1) {
                  break L1;
                } else {
                  boolean discarded$2 = ((ah) this).a((String) null, 39);
                  break L1;
                }
              }
              var4_int = ((ah) this).field_e.field_n[param0].a(83, g.a(-1, (CharSequence) (Object) param2));
              if (!this.a(param0, (byte) -72, var4_int)) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = var4_int;
                stackIn_12_0 = stackOut_11_0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ah.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        try {
          L0: {
            if (!this.a(param1, (byte) -72, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((ah) this).field_h[param1]) {
                  break L1;
                } else {
                  if (null != ((ah) this).field_h[param1][param2]) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((ah) this).field_i[param1] != null) {
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                this.b((byte) -3, param1);
                if (null == ((ah) this).field_i[param1]) {
                  if (param0 == -30) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                } else {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "ah.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final synchronized boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.a((byte) 119, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((ah) this).field_i[param0] == null) {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    ah.d(74);
                    break L1;
                  }
                }
                this.b((byte) -3, param0);
                if (null != ((ah) this).field_i[param0]) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ah.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    ah(hk param0, boolean param1, int param2) {
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
        ((ah) this).field_e = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 < param2) {
                  break L1;
                } else {
                  ((ah) this).field_f = param1;
                  ((ah) this).field_b = param0;
                  ((ah) this).field_d = param2;
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
            stackOut_8_1 = new StringBuilder().append("ah.<init>(");
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
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (!((ah) this).c(89)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((ah) this).field_i.length >= ~var4) {
                      break L3;
                    } else {
                      stackOut_8_0 = 0;
                      stackOut_8_1 = ((ah) this).field_e.field_m[var4];
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_16_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 < stackIn_9_1) {
                            var3 = var3 + ((ah) this).e(-11337, var4);
                            var2_int += 100;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = ~var2_int;
                  stackOut_15_1 = -1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                }
                if (stackIn_16_0 != stackIn_16_1) {
                  if (param0 == 22300) {
                    var4 = 100 * var3 / var2_int;
                    stackOut_22_0 = var4;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_20_0 = ((int[]) ((Object[]) ((ah) this).field_i[0])[1])[7];
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  }
                } else {
                  stackOut_17_0 = 100;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ah.V(" + param0 + ')');
        }
        return stackIn_23_0;
    }

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
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
        Object stackOut_3_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_6_0 = null;
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
            if (!((ah) this).c(97)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((ah) this).field_e.field_r.a(102, g.a(-1, (CharSequence) (Object) param0));
              if (this.a((byte) 119, var4_int)) {
                L1: {
                  if (param2) {
                    break L1;
                  } else {
                    field_j = null;
                    break L1;
                  }
                }
                var5 = ((ah) this).field_e.field_n[var4_int].a(-119, g.a(-1, (CharSequence) (Object) param1));
                stackOut_11_0 = ((ah) this).a(-127, var5, var4_int);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ah.R(");
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
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized byte[] a(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_14_0 = null;
        byte[] stackOut_19_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((ah) this).c(113)) {
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                boolean discarded$2 = ((ah) this).a((byte) -43, 44, -77);
                break L0;
              }
            }
            if (((ah) this).field_e.field_d.length == 1) {
              stackOut_9_0 = ((ah) this).a(8, param1, 0);
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              if (!this.a((byte) 119, param1)) {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (byte[]) (Object) stackIn_15_0;
              } else {
                if (((ah) this).field_e.field_d[param1] == 1) {
                  stackOut_19_0 = ((ah) this).a(103, 0, param1);
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                } else {
                  throw new RuntimeException();
                }
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
          throw oi.a((Throwable) (Object) var3, "ah.U(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Owner";
        field_g = new int[128];
    }
}
