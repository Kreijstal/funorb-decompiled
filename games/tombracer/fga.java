/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.BitSet;

final class fga implements sia {
    private boolean field_c;
    static String field_a;
    private int[] field_d;
    private int[] field_b;

    private final void d() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ql.field_k.k(76, -2988);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fga.G(" + 32415 + 41);
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 78 % ((-55 - param0) / 60);
                if (!rd.b(false)) {
                  break L2;
                } else {
                  if (!aga.a(false, param1).field_d) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fga.I(" + param0 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public final void a(boolean param0, boolean param1) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((fga) this).field_c) {
              if (param1) {
                if (param0) {
                  if (ld.field_e < 2) {
                    return;
                  } else {
                    L1: {
                      if (hf.field_b != 1) {
                        break L1;
                      } else {
                        try {
                          L2: {
                            var3_int = 0;
                            L3: while (true) {
                              L4: {
                                L5: {
                                  if (((fga) this).field_d.length <= var3_int) {
                                    break L5;
                                  } else {
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L6: {
                                        if (~((fga) this).field_d[var3_int] <= ~jm.field_m) {
                                          break L6;
                                        } else {
                                          if (~jm.field_m <= ~(40 + ((fga) this).field_d[var3_int])) {
                                            break L6;
                                          } else {
                                            if (~lba.field_p >= ~((fga) this).field_b[var3_int]) {
                                              break L6;
                                            } else {
                                              if (~(((fga) this).field_b[var3_int] + 30) >= ~lba.field_p) {
                                                break L6;
                                              } else {
                                                if (oj.field_tb[82]) {
                                                  break L6;
                                                } else {
                                                  L7: {
                                                    var4 = ak.a(var3_int, (byte) 56);
                                                    stackOut_29_0 = this;
                                                    stackOut_29_1 = 74;
                                                    stackIn_32_0 = stackOut_29_0;
                                                    stackIn_32_1 = stackOut_29_1;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    stackIn_30_1 = stackOut_29_1;
                                                    if (f.field_e.get(var4)) {
                                                      stackOut_32_0 = this;
                                                      stackOut_32_1 = stackIn_32_1;
                                                      stackOut_32_2 = 0;
                                                      stackIn_33_0 = stackOut_32_0;
                                                      stackIn_33_1 = stackOut_32_1;
                                                      stackIn_33_2 = stackOut_32_2;
                                                      break L7;
                                                    } else {
                                                      stackOut_30_0 = this;
                                                      stackOut_30_1 = stackIn_30_1;
                                                      stackOut_30_2 = 1;
                                                      stackIn_33_0 = stackOut_30_0;
                                                      stackIn_33_1 = stackOut_30_1;
                                                      stackIn_33_2 = stackOut_30_2;
                                                      break L7;
                                                    }
                                                  }
                                                  this.a((byte) stackIn_33_1, stackIn_33_2 != 0, var4);
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L3;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                break L4;
                              }
                              break L2;
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L8: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var3.printStackTrace();
                            break L8;
                          }
                        }
                        break L1;
                      }
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "fga.D(" + param0 + 44 + param1 + 41);
        }
    }

    public final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                ((fga) this).field_d = null;
                break L1;
              }
            }
            stackOut_3_0 = ((fga) this).field_c;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fga.A(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kh stackIn_1_0 = null;
        kh stackIn_3_0 = null;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_0_0 = null;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              ql.field_k.k(77, -2988);
              ql.field_k.i(param2, 0);
              stackOut_0_0 = ql.field_k;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param1) {
                stackOut_3_0 = (kh) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = (kh) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            ((kh) (Object) stackIn_4_0).i(stackIn_4_1, 0);
            var4_int = -5 % ((param0 - -45) / 58);
            int discarded$2 = 32415;
            this.d();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fga.H(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, java.awt.Canvas param3) {
        Exception var4 = null;
        RuntimeException var4_ref = null;
        java.awt.Graphics var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
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
            try {
              L1: {
                var4_ref2 = param3.getGraphics();
                gn.field_C.a(0, 0, var4_ref2, 2);
                var4_ref2.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4 = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("fga.E(").append(0).append(44).append(0).append(44).append(0).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public final void b(int param0) {
        try {
            RuntimeException var2 = null;
            int var2_int = 0;
            int var3_int = 0;
            ha var3 = null;
            int var4 = 0;
            int var5 = 0;
            qva var6 = null;
            int var6_int = 0;
            int var7 = 0;
            int var8 = 0;
            Object var9 = null;
            int var10 = 0;
            int stackIn_16_0 = 0;
            BitSet stackIn_16_1 = null;
            int stackIn_18_0 = 0;
            BitSet stackIn_18_1 = null;
            int stackIn_19_0 = 0;
            BitSet stackIn_19_1 = null;
            int stackIn_19_2 = 0;
            int stackIn_25_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_61_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            BitSet stackOut_15_1 = null;
            int stackOut_18_0 = 0;
            BitSet stackOut_18_1 = null;
            int stackOut_18_2 = 0;
            int stackOut_16_0 = 0;
            BitSet stackOut_16_1 = null;
            int stackOut_16_2 = 0;
            int stackOut_24_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_60_0 = 0;
            var10 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                if (!((fga) this).field_c) {
                  return;
                } else {
                  if (f.field_e != null) {
                    L1: {
                      L2: {
                        var2_int = aq.a(-5640);
                        if (null == ((fga) this).field_d) {
                          break L2;
                        } else {
                          if (var2_int == ((fga) this).field_d.length) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      ((fga) this).field_b = new int[var2_int];
                      ((fga) this).field_d = new int[var2_int];
                      var3_int = 20;
                      var4 = 30;
                      var5 = var3_int;
                      var6_int = 0;
                      L3: while (true) {
                        if (~var2_int >= ~var6_int) {
                          break L1;
                        } else {
                          L4: {
                            if (var6_int % 15 != 0) {
                              break L4;
                            } else {
                              var4 += 30;
                              var5 = var3_int;
                              break L4;
                            }
                          }
                          ((fga) this).field_d[var6_int] = var5;
                          var5 += 40;
                          ((fga) this).field_b[var6_int] = var4;
                          var6_int++;
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    L5: {
                      var3 = tga.field_a;
                      var3.GA(0);
                      stackOut_15_0 = 22;
                      stackOut_15_1 = f.field_e;
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_18_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (rd.b(false)) {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = (BitSet) (Object) stackIn_18_1;
                        stackOut_18_2 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L5;
                      } else {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = (BitSet) (Object) stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        break L5;
                      }
                    }
                    L6: {
                      var4 = jk.a((byte) stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0);
                      if (param0 == 1) {
                        break L6;
                      } else {
                        ((fga) this).field_b = null;
                        break L6;
                      }
                    }
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var5 >= var2_int) {
                            break L9;
                          } else {
                            var6_int = ak.a(var5, (byte) 95);
                            var7 = f.field_e.get(var6_int) ? 1 : 0;
                            var8 = -10079437;
                            stackOut_24_0 = var7;
                            stackIn_61_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var10 != 0) {
                              break L8;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_25_0 != 0) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (~var5 <= ~var4) {
                                        break L12;
                                      } else {
                                        if (this.a((byte) -122, var6_int)) {
                                          break L12;
                                        } else {
                                          var8 = -7829453;
                                          if (var10 == 0) {
                                            break L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    if (this.a((byte) -120, var6_int)) {
                                      var8 = -2004318072;
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L13: {
                                  if (!this.a((byte) -121, var6_int)) {
                                    stackOut_46_0 = -13391309;
                                    stackIn_47_0 = stackOut_46_0;
                                    break L13;
                                  } else {
                                    stackOut_44_0 = -2013231104;
                                    stackIn_47_0 = stackOut_44_0;
                                    break L13;
                                  }
                                }
                                var8 = stackIn_47_0;
                                break L10;
                              }
                              L14: {
                                var3.c(var8, ((fga) this).field_d[var5], 40, ((fga) this).field_b[var5], -22971, 30);
                                var3.a(((fga) this).field_b[var5], ((fga) this).field_d[var5], 30, 40, -10066330, (byte) -107);
                                var9 = null;
                                if (var6_int == -1) {
                                  break L14;
                                } else {
                                  var9 = (Object) (Object) Integer.toString(var6_int);
                                  break L14;
                                }
                              }
                              L15: {
                                if (var9 == null) {
                                  break L15;
                                } else {
                                  oka.a((String) var9, 16777215, kn.field_p, -1, ((fga) this).field_b[var5] - -15, 20 + ((fga) this).field_d[var5], 0);
                                  break L15;
                                }
                              }
                              L16: {
                                var9 = null;
                                if (!aga.a(false, var6_int).field_d) {
                                  break L16;
                                } else {
                                  var9 = (Object) (Object) "M";
                                  break L16;
                                }
                              }
                              L17: {
                                if (null != var9) {
                                  oka.a((String) var9, 16777215, kn.field_p, -1, 26 + ((fga) this).field_b[var5], ((fga) this).field_d[var5] + 20, 0);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              var5++;
                              if (var10 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        int discarded$1 = 20297;
                        var5 = una.a(f.field_e);
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L8;
                      }
                      ts.a(stackIn_61_0, param0 + -16, 460, "max corridor: " + var5 + " / " + ml.a(param0 + 86), 10, kn.field_p, 16777215);
                      try {
                        L18: {
                          var3.e(param0 + -1);
                          break L18;
                        }
                      } catch (qva decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L19: {
                          var6 = (qva) (Object) decompiledCaughtException;
                          System.out.println((Object) (Object) var6);
                          break L19;
                        }
                      }
                      break L0;
                    }
                  } else {
                    return;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) (Object) var2, "fga.B(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 76) {
              L1: {
                if (!toa.field_j) {
                  f.field_e = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((fga) this).field_c = true;
              ((fga) this).field_d = null;
              int discarded$2 = 32415;
              this.d();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fga.F(" + param0 + 41);
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_2_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((fga) this).field_c) {
              L1: {
                if (13 != param2) {
                  break L1;
                } else {
                  ((fga) this).field_c = false;
                  break L1;
                }
              }
              L2: {
                if (param0 == -72) {
                  break L2;
                } else {
                  field_a = null;
                  break L2;
                }
              }
              if (param2 != 35) {
                if (48 != param2) {
                  stackOut_46_0 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  break L0;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var5 <= ~aq.a(-5640)) {
                          break L5;
                        } else {
                          stackOut_36_0 = var4_int;
                          stackIn_45_0 = stackOut_36_0;
                          stackIn_37_0 = stackOut_36_0;
                          if (var7 != 0) {
                            break L4;
                          } else {
                            if (stackIn_37_0 >= 10) {
                              break L5;
                            } else {
                              L6: {
                                var6 = ak.a(var5, (byte) 125);
                                if (!aga.a(false, var6).field_d) {
                                  break L6;
                                } else {
                                  this.a((byte) 110, true, var5);
                                  var4_int++;
                                  break L6;
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_44_0 = 1;
                      stackIn_45_0 = stackOut_44_0;
                      break L4;
                    }
                    return stackIn_45_0 != 0;
                  }
                }
              } else {
                var4_int = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4_int >= 100) {
                        break L9;
                      } else {
                        this.a((byte) -128, false, var4_int);
                        var4_int++;
                        if (var7 != 0) {
                          break L8;
                        } else {
                          if (var7 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4_int = 0;
                    break L8;
                  }
                  var5 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var5 >= aq.a(param0 + -5568)) {
                          break L12;
                        } else {
                          stackOut_20_0 = 30;
                          stackIn_32_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L11;
                          } else {
                            if (stackIn_21_0 <= var4_int) {
                              break L12;
                            } else {
                              L13: {
                                L14: {
                                  var6 = ak.a(var5, (byte) 111);
                                  if (!aga.a(false, var6).field_d) {
                                    break L14;
                                  } else {
                                    if (var7 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                this.a((byte) 46, true, var5);
                                var4_int++;
                                break L13;
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      stackOut_31_0 = 1;
                      stackIn_32_0 = stackOut_31_0;
                      break L11;
                    }
                    return stackIn_32_0 != 0;
                  }
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
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fga.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_47_0 != 0;
    }

    public static void a() {
        try {
            int var1_int = 39;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fga.J(" + -29 + 41);
        }
    }

    fga() {
        ((fga) this).field_c = false;
        ((fga) this).field_d = null;
        ((fga) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Menu";
    }
}
