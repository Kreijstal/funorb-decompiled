/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dp extends ji {
    static String[] field_F;
    private int field_z;
    static int[] field_A;
    private int field_y;
    private int[] field_D;
    private int[] field_B;
    private int field_C;

    final void a(byte param0, int param1, ed param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4_int = param1;
                    if (var4_int == 0) {
                      break L4;
                    } else {
                      if (1 == var4_int) {
                        break L3;
                      } else {
                        if (var4_int != 2) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  ((dp) this).field_z = param2.h(-11);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                ((dp) this).field_C = param2.a((byte) -11);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              ((dp) this).field_y = param2.h(-11);
              break L1;
            }
            L5: {
              if (param0 == 110) {
                break L5;
              } else {
                ((dp) this).field_D = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) runtimeException;
            stackOut_23_1 = new StringBuilder().append("dp.C(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int[] stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int[] stackOut_58_0 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_array = ((dp) this).field_x.a(param0, (byte) -124);
                if (!((dp) this).field_x.field_i) {
                  break L2;
                } else {
                  L3: {
                    var4 = lf.field_y[param0];
                    if (((dp) this).field_y != 0) {
                      break L3;
                    } else {
                      var5 = 0;
                      var6 = 0;
                      L4: while (true) {
                        L5: {
                          if (var6 >= ((dp) this).field_z) {
                            break L5;
                          } else {
                            stackOut_5_0 = ((dp) this).field_B[var6];
                            stackOut_5_1 = var4;
                            stackIn_55_0 = stackOut_5_0;
                            stackIn_55_1 = stackOut_5_1;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            if (var10 != 0) {
                              break L1;
                            } else {
                              L6: {
                                if (stackIn_6_0 > stackIn_6_1) {
                                  break L6;
                                } else {
                                  if (((dp) this).field_B[1 + var6] <= var4) {
                                    break L6;
                                  } else {
                                    if (((dp) this).field_D[var6] <= var4) {
                                      break L5;
                                    } else {
                                      var5 = 4096;
                                      if (var10 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              var6++;
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        qq.a(var3_array, 0, we.field_M, var5);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  L7: while (true) {
                    stackOut_21_0 = ~var5;
                    stackOut_21_1 = ~we.field_M;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    L8: while (true) {
                      if (stackIn_22_0 <= stackIn_22_1) {
                        break L2;
                      } else {
                        var6 = 0;
                        var7 = 0;
                        var8 = rh.field_O[var5];
                        var9 = ((dp) this).field_y;
                        stackOut_23_0 = ~var9;
                        stackOut_23_1 = -2;
                        stackIn_55_0 = stackOut_23_0;
                        stackIn_55_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (var10 != 0) {
                          break L1;
                        } else {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  if (stackIn_24_0 == stackIn_24_1) {
                                    break L12;
                                  } else {
                                    if (var9 == 2) {
                                      break L11;
                                    } else {
                                      if (var9 != 3) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                var6 = var8;
                                if (var10 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                              var6 = (-4096 + var4 + var8 >> 929258945) + 2048;
                              if (var10 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                            var6 = 2048 + (-var4 + var8 >> -431928639);
                            break L9;
                          }
                          var9 = 0;
                          L13: while (true) {
                            L14: {
                              if (~var9 <= ~((dp) this).field_z) {
                                break L14;
                              } else {
                                stackOut_41_0 = var6;
                                stackOut_41_1 = ((dp) this).field_B[var9];
                                stackIn_22_0 = stackOut_41_0;
                                stackIn_22_1 = stackOut_41_1;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                if (var10 != 0) {
                                  continue L8;
                                } else {
                                  L15: {
                                    if (stackIn_42_0 < stackIn_42_1) {
                                      break L15;
                                    } else {
                                      if (~((dp) this).field_B[var9 + 1] >= ~var6) {
                                        break L15;
                                      } else {
                                        if (~((dp) this).field_D[var9] >= ~var6) {
                                          break L14;
                                        } else {
                                          var7 = 4096;
                                          if (var10 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var10 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var3_array[var5] = var7;
                            var5++;
                            if (var10 == 0) {
                              continue L7;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_54_0 = param1;
              stackOut_54_1 = 91;
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              break L1;
            }
            L16: {
              if (stackIn_55_0 > stackIn_55_1) {
                break L16;
              } else {
                ((dp) this).field_C = 10;
                break L16;
              }
            }
            stackOut_58_0 = (int[]) var3_array;
            stackIn_59_0 = stackOut_58_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "dp.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_59_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -98) {
                break L1;
              } else {
                String discarded$2 = dp.a((CharSequence) null, true, false);
                break L1;
              }
            }
            this.g(4096);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "dp.G(" + param0 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        String stackIn_17_0 = null;
        String stackIn_25_0 = null;
        boolean stackIn_32_0 = false;
        String stackIn_46_0 = null;
        int stackIn_49_0 = 0;
        String stackIn_53_0 = null;
        Object stackIn_55_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_31_0 = false;
        String stackOut_45_0 = null;
        int stackOut_48_0 = 0;
        String stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        String stackOut_24_0 = null;
        String stackOut_16_0 = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = rc.a(param0, 320);
                      if (null == var4) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (jq.a(var4.charAt(0), -96)) {
                              break L3;
                            } else {
                              if (jq.a(var4.charAt(-1 + var4.length()), -96)) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (!param1) {
                                    break L4;
                                  } else {
                                    dp.h(-57);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (param0.length() <= var6) {
                                        break L7;
                                      } else {
                                        var7 = param0.charAt(var6);
                                        stackOut_31_0 = jq.a((char) var7, -96);
                                        stackIn_49_0 = stackOut_31_0 ? 1 : 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (!stackIn_32_0) {
                                                break L9;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L8;
                                          }
                                          L10: {
                                            if (var5 < 2) {
                                              break L10;
                                            } else {
                                              if (!param2) {
                                                stackOut_45_0 = mo.field_a;
                                                stackIn_46_0 = stackOut_45_0;
                                                return stackIn_46_0;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_48_0 = 0;
                                    stackIn_49_0 = stackOut_48_0;
                                    break L6;
                                  }
                                  if (stackIn_49_0 < var5) {
                                    stackOut_52_0 = vq.field_p;
                                    stackIn_53_0 = stackOut_52_0;
                                    return stackIn_53_0;
                                  } else {
                                    stackOut_54_0 = null;
                                    stackIn_55_0 = stackOut_54_0;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_24_0 = vq.field_p;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_16_0 = jn.field_d;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              }
              stackOut_10_0 = jn.field_d;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              stackOut_2_0 = jn.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("dp.B(");
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L11;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L11;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_55_0;
    }

    public static void h(int param0) {
        if (param0 >= -68) {
            return;
        }
        try {
            field_F = null;
            field_A = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "dp.H(" + param0 + ')');
        }
    }

    public dp() {
        super(0, true);
        ((dp) this).field_y = 0;
        ((dp) this).field_z = 10;
        ((dp) this).field_C = 2048;
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            ((dp) this).field_D = new int[1 + ((dp) this).field_z];
            ((dp) this).field_B = new int[1 + ((dp) this).field_z];
            var3 = 4096 / ((dp) this).field_z;
            var4 = ((dp) this).field_C * var3 >> 281515980;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((dp) this).field_z >= ~var5) {
                    break L3;
                  } else {
                    ((dp) this).field_B[var5] = var2_int;
                    ((dp) this).field_D[var5] = var4 + var2_int;
                    var2_int = var2_int + var3;
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((dp) this).field_B[((dp) this).field_z] = 4096;
                ((dp) this).field_D[((dp) this).field_z] = ((dp) this).field_D[0] + param0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "dp.A(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) kb.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        mm.field_a = mm.field_a + 1;
                        rq.field_B = ah.field_l;
                        if (fh.field_w < 0) {
                          break L5;
                        } else {
                          L6: while (true) {
                            if (~bd.field_f == ~fh.field_w) {
                              break L4;
                            } else {
                              var2 = bq.field_D[bd.field_f];
                              bd.field_f = 127 & bd.field_f - -1;
                              stackOut_4_0 = ~var2;
                              stackOut_4_1 = -1;
                              stackIn_26_0 = stackOut_4_0;
                              stackIn_26_1 = stackOut_4_1;
                              stackIn_5_0 = stackOut_4_0;
                              stackIn_5_1 = stackOut_4_1;
                              if (var4 != 0) {
                                break L2;
                              } else {
                                L7: {
                                  L8: {
                                    if (stackIn_5_0 <= stackIn_5_1) {
                                      break L8;
                                    } else {
                                      cr.field_eb[~var2] = false;
                                      if (var4 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  cr.field_eb[var2] = true;
                                  break L7;
                                }
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 = 0;
                      L9: while (true) {
                        L10: {
                          if (var2 >= 112) {
                            break L10;
                          } else {
                            cr.field_eb[var2] = false;
                            var2++;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              if (var4 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        fh.field_w = bd.field_f;
                        break L4;
                      }
                    }
                    ah.field_l = ro.field_e;
                    break L3;
                  }
                  stackOut_25_0 = param0;
                  stackOut_25_1 = 97;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L2;
                }
                break L1;
              }
            }
            L11: {
              if (stackIn_26_0 > stackIn_26_1) {
                break L11;
              } else {
                field_F = null;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "dp.F(" + param0 + ')');
        }
    }

    final static v a(String param0, String param1, byte param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        wi stackIn_5_0 = null;
        nd stackIn_10_0 = null;
        c stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_4_0 = null;
        nd stackOut_9_0 = null;
        c stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param4) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackOut_4_0 = new wi(param1, param0);
                  stackIn_5_0 = stackOut_4_0;
                  return (v) (Object) stackIn_5_0;
                }
              }
            }
            if (param3) {
              stackOut_9_0 = new nd(param4, param0);
              stackIn_10_0 = stackOut_9_0;
              return (v) (Object) stackIn_10_0;
            } else {
              L2: {
                if (param2 == -7) {
                  break L2;
                } else {
                  dp.b((byte) 42);
                  break L2;
                }
              }
              stackOut_14_0 = new c(param4, param0);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("dp.E(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (v) (Object) stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new int[8192];
    }
}
