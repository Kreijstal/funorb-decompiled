/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk {
    private java.util.zip.Inflater field_d;
    static int field_c;
    static String field_b;
    static cn field_e;
    static int field_a;

    final static wm a(int param0, Random param1) {
        int fieldTemp$0 = 0;
        int stackIn_54_0 = 0;
        wm stackIn_95_0 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var16 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            bo.field_Jb = new wm(ib.field_l);
            wl.field_e = new int[ib.field_l];
            h.field_j = 0;
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ib.field_l) {
                ue.field_j = new int[ib.field_k];
                var2_int = param0;
                L2: while (true) {
                  if (ib.field_k <= var2_int) {
                    L3: while (true) {
                      if ((h.field_j ^ -1) >= -1) {
                        L4: {
                          var2_int = uj.a(param1, param0 ^ 37, 4);
                          var3 = uj.a(param1, 37, 3);
                          if (var3 == var2_int) {
                            var3 = 3;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (0 != var2_int) {
                            if (0 != var3) {
                              break L5;
                            } else {
                              bo.field_Jb.a(20, -111);
                              break L5;
                            }
                          } else {
                            bo.field_Jb.a(20, -111);
                            break L5;
                          }
                        }
                        L6: {
                          if (1 != var2_int) {
                            if (1 != var3) {
                              break L6;
                            } else {
                              bo.field_Jb.a(21, -90);
                              break L6;
                            }
                          } else {
                            bo.field_Jb.a(21, -90);
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            if ((var2_int ^ -1) == -3) {
                              break L8;
                            } else {
                              if (-3 == (var3 ^ -1)) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          bo.field_Jb.a(59, -86);
                          break L7;
                        }
                        L9: {
                          L10: {
                            if (3 == var2_int) {
                              break L10;
                            } else {
                              if ((var3 ^ -1) == -4) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          bo.field_Jb.a(66, -70);
                          break L9;
                        }
                        var4 = ec.h(24, 5);
                        var5 = 0;
                        L11: while (true) {
                          if ((var5 ^ -1) <= -5) {
                            L12: while (true) {
                              var5 = 4;
                              var6 = -1;
                              var7 = 0;
                              L13: while (true) {
                                if (var7 >= ib.field_l) {
                                  if (var6 != -1) {
                                    bo.field_Jb.a(var6, -88);
                                    var4 = ec.h(24, 5);
                                    continue L12;
                                  } else {
                                    stackIn_95_0 = bo.field_Jb;
                                    break L0;
                                  }
                                } else {
                                  if (var7 != 20) {
                                    if (-22 != (var7 ^ -1)) {
                                      if (var7 != 59) {
                                        L14: {
                                          if ((var7 ^ -1) != -67) {
                                            if (8 <= qc.a(var7, -127, var4)) {
                                              var8 = sh.a(120, var7, var4);
                                              if (var5 < var8) {
                                                var6 = var7;
                                                var5 = var8;
                                                break L14;
                                              } else {
                                                var7++;
                                                continue L13;
                                              }
                                            } else {
                                              var7++;
                                              continue L13;
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        var7++;
                                        continue L13;
                                      } else {
                                        var7++;
                                        continue L13;
                                      }
                                    } else {
                                      var7++;
                                      continue L13;
                                    }
                                  } else {
                                    var7++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          } else {
                            L15: {
                              if (-1 == (var5 ^ -1)) {
                                stackIn_54_0 = 0;
                                break L15;
                              } else {
                                if (1 != var5) {
                                  if (-3 == (var5 ^ -1)) {
                                    stackIn_54_0 = ib.field_k + -ib.field_j;
                                    break L15;
                                  } else {
                                    stackIn_54_0 = -1 + ib.field_k;
                                    break L15;
                                  }
                                } else {
                                  stackIn_54_0 = -1 + ib.field_j;
                                  break L15;
                                }
                              }
                            }
                            var6 = stackIn_54_0;
                            var16 = ec.h(var6, param0 ^ 5);
                            var8 = 0;
                            var9 = -1;
                            var10 = 1;
                            L16: while (true) {
                              if (ib.field_l <= var10) {
                                L17: {
                                  if ((var9 ^ -1) != 0) {
                                    bo.field_Jb.a(var9, -126);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var5++;
                                continue L11;
                              } else {
                                if ((var10 ^ -1) != -21) {
                                  if ((var10 ^ -1) != -22) {
                                    if (-60 != (var10 ^ -1)) {
                                      L18: {
                                        if (-67 != (var10 ^ -1)) {
                                          if (10 <= qc.a(var10, 122, var16)) {
                                            L19: {
                                              var11 = sh.a(param0 + 123, var10, var16);
                                              if (-1 == var9) {
                                                break L19;
                                              } else {
                                                if (var8 < var11) {
                                                  break L19;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            var8 = var11;
                                            var9 = var10;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var10++;
                                      continue L16;
                                    } else {
                                      var10++;
                                      continue L16;
                                    }
                                  } else {
                                    var10++;
                                    continue L16;
                                  }
                                } else {
                                  var10++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        fo.a(-126, gd.a(param1, true));
                        continue L3;
                      }
                    }
                  } else {
                    ue.field_j[var2_int] = var2_int;
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                L20: {
                  if (-15 == (var2_int ^ -1)) {
                    break L20;
                  } else {
                    if ((var2_int ^ -1) == -16) {
                      break L20;
                    } else {
                      if (26 == var2_int) {
                        break L20;
                      } else {
                        if (var2_int == 27) {
                          break L20;
                        } else {
                          if ((var2_int ^ -1) == -59) {
                            break L20;
                          } else {
                            if ((var2_int ^ -1) == -61) {
                              break L20;
                            } else {
                              if (65 == var2_int) {
                                break L20;
                              } else {
                                if (var2_int != 67) {
                                  if (var2_int == 20) {
                                    break L20;
                                  } else {
                                    if ((var2_int ^ -1) == -22) {
                                      break L20;
                                    } else {
                                      if ((var2_int ^ -1) == -60) {
                                        break L20;
                                      } else {
                                        if (var2_int != 66) {
                                          fieldTemp$0 = h.field_j;
                                          h.field_j = h.field_j + 1;
                                          wl.field_e[fieldTemp$0] = var2_int;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var2 = decompiledCaughtException;
            stackIn_98_0 = (RuntimeException) (var2);

            stackIn_98_1 = new StringBuilder().append("uk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L21;
            } else {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L21;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
        return stackIn_95_0;
    }

    public uk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              lj.a((java.awt.Component) ((Object) param0), (byte) 70);
              if (param1 < -119) {
                break L1;
              } else {
                field_c = 72;
                break L1;
              }
            }
            L2: {
              im.a((java.awt.Component) ((Object) param0), (byte) 94);
              if (bn.field_j == null) {
                break L2;
              } else {
                bn.field_j.a((byte) 123, (java.awt.Component) ((Object) param0));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("uk.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
            field_e = (cn) null;
        }
    }

    final void a(int param0, byte[] param1, ec param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (-32 != (param2.field_m[param2.field_o] ^ -1)) {
                    break L1;
                  } else {
                    if (116 != (param2.field_m[1 + param2.field_o] ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_d) {
                          break L2;
                        } else {
                          this.field_d = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_d.setInput(param2.field_m, 10 + param2.field_o, param2.field_m.length + -10 + (-param2.field_o + -8));
                          this.field_d.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_d.reset();
                        throw new RuntimeException("");
                      }
                      L4: {
                        if (param0 < -80) {
                          break L4;
                        } else {
                          field_e = (cn) null;
                          break L4;
                        }
                      }
                      this.field_d.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("uk.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private uk(int param0, int param1, int param2) {
    }

    static {
        field_b = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
        field_c = 2;
    }
}
