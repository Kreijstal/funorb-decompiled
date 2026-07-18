/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tj {
    static le field_e;
    private int field_b;
    static String field_a;
    private boolean field_f;
    private int field_d;
    private int[] field_c;

    final static String a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        String stackIn_40_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        String stackOut_18_0 = null;
        String stackOut_26_0 = null;
        String stackOut_37_0 = null;
        String stackOut_39_0 = null;
        String stackOut_32_0 = null;
        String stackOut_29_0 = null;
        String stackOut_21_0 = null;
        try {
          L0: {
            if (vh.field_n < 2) {
              stackOut_3_0 = nc.field_Z;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null != lf.field_a) {
                if (!lf.field_a.b(-1)) {
                  stackOut_11_0 = de.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = mi.field_e;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                if (!og.field_g.b(-1)) {
                  stackOut_18_0 = jj.field_B;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  if (og.field_g.b((byte) 91, "commonui")) {
                    if (!am.field_b.b(-1)) {
                      stackOut_26_0 = bk.field_a;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    } else {
                      if (am.field_b.b((byte) -103, "commonui")) {
                        var1_int = 87 % ((param0 - -3) / 57);
                        if (wb.field_b.b(-1)) {
                          if (!wb.field_b.c(7715)) {
                            stackOut_37_0 = fa.field_c + " - " + wb.field_b.a(20147) + "%";
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0;
                          } else {
                            stackOut_39_0 = ql.field_f;
                            stackIn_40_0 = stackOut_39_0;
                            break L0;
                          }
                        } else {
                          stackOut_32_0 = ge.field_i;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        }
                      } else {
                        stackOut_29_0 = hi.field_e + " - " + am.field_b.a((byte) -97, "commonui") + "%";
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      }
                    }
                  } else {
                    stackOut_21_0 = kj.field_z + " - " + og.field_g.a((byte) -41, "commonui") + "%";
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "tj.B(" + param0 + ')');
        }
        return stackIn_40_0;
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            stackOut_3_0 = ((tj) this).field_b + 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "tj.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > ((tj) this).field_b) {
                ((tj) this).field_b = param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((tj) this).field_c.length <= param0) {
                this.a(param0, true);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((tj) this).field_c[param0] = param1;
              if (param2 == -11784) {
                break L3;
              } else {
                ((tj) this).field_f = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "tj.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_14_0 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            var3_int = ((tj) this).field_c.length;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3_int < ~param0) {
                    break L4;
                  } else {
                    stackOut_6_0 = ((tj) this).field_f;
                    stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0) {
                          break L5;
                        } else {
                          var3_int = var3_int + ((tj) this).field_d;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (0 == var3_int) {
                          break L6;
                        } else {
                          var3_int = var3_int * ((tj) this).field_d;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3_int = 1;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_14_0 = var3_int;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "tj.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((tj) this).field_b = -70;
                break L1;
              }
            }
            if (~((tj) this).field_b <= ~param1) {
              stackOut_6_0 = ((tj) this).field_c[param1];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "tj.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        Object stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!param2) {
                break L1;
              } else {
                var4_int += 4;
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var4_int += 2;
                break L2;
              }
            }
            if (param0 == -14189) {
              L3: {
                if (param3) {
                  var4_int++;
                  break L3;
                } else {
                  break L3;
                }
              }
              stackOut_13_0 = ee.field_d[var4_int];
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (String) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "tj.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(be param0, java.awt.Frame param1, int param2) {
        RuntimeException runtimeException = null;
        eb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a((byte) -120, param1);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var3.field_a != 0) {
                        break L5;
                      } else {
                        hb.a(10L, 109);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (var3.field_a != 1) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    hb.a(100L, 101);
                    break L4;
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
                L7: {
                  param1.setVisible(false);
                  param1.dispose();
                  if (param2 == -23144) {
                    break L7;
                  } else {
                    boolean discarded$3 = tj.a(false, -4, (CharSequence) null);
                    break L7;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) runtimeException;
            stackOut_18_1 = new StringBuilder().append("tj.F(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var3 = new int[this.c(param0, -1)];
            mk.a(((tj) this).field_c, 0, var3, 0, ((tj) this).field_c.length);
            ((tj) this).field_c = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3_ref, "tj.L(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_e = null;
            field_a = null;
            if (param0 != -58) {
                String discarded$0 = tj.a(28);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "tj.D(" + param0 + ')');
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = new char[param0];
            var5 = 0;
            var6 = param2;
            L1: while (true) {
              L2: {
                if (~var6 <= ~param0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var7 = 255 & param3[var6 + param1];
                      if (var7 != 0) {
                        break L4;
                      } else {
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (128 > var7) {
                        break L5;
                      } else {
                        if (var7 >= 160) {
                          break L5;
                        } else {
                          L6: {
                            var8 = fe.field_a[var7 - 128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var7 = var8;
                          break L5;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L3;
                  }
                  var6++;
                  if (var9 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_20_0 = new String(var4, 0, var5);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4_ref;
            stackOut_22_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_21_0;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (vl.a(param0, param2, -125)) {
              var3_int = param1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3_int <= ~param2.length()) {
                      break L3;
                    } else {
                      stackOut_6_0 = vg.a(param2.charAt(var3_int), -22118);
                      stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                break L0;
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
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final void b(int param0, int param1) {
        try {
            this.a(((tj) this).field_b + param0, param1, param0 ^ -11783);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "tj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static hj c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        hj var4 = null;
        int var5 = 0;
        hj stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_7_0 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = wh.field_b[0] * m.field_a[0];
              var2 = fl.field_a[0];
              var3 = new int[var1_int];
              if (param0 >= 95) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (var4_int >= var1_int) {
                  break L3;
                } else {
                  var3[var4_int] = vc.field_g[vi.a(255, (int) var2[var4_int])];
                  var4_int++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
              md.a((byte) -125);
              stackOut_7_0 = (hj) var4;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "tj.I(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private tj() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "tj.<init>()");
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (((tj) this).field_b < param0) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == -3344) {
                      break L2;
                    } else {
                      String discarded$2 = tj.a(-117);
                      break L2;
                    }
                  }
                  L3: {
                    if (~param0 == ~((tj) this).field_b) {
                      break L3;
                    } else {
                      mk.a(((tj) this).field_c, 1 + param0, ((tj) this).field_c, param0, ((tj) this).field_b + -param0);
                      break L3;
                    }
                  }
                  ((tj) this).field_b = ((tj) this).field_b - 1;
                  break L0;
                }
              }
            }
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "tj.J(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_e = new le();
    }
}
