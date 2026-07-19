/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class qda {
    vj field_e;
    static String field_l;
    vj field_m;
    static String field_f;
    static int field_i;
    static String field_b;
    vj field_c;
    vj field_k;
    long field_j;
    uia field_o;
    int field_p;
    uia field_h;
    volatile int field_n;
    volatile int field_a;
    byte field_d;
    qqa field_g;

    public static void c(byte param0) {
        if (param0 != 0) {
          field_l = (String) null;
          field_b = null;
          field_l = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_l = null;
          field_f = null;
          return;
        }
    }

    final boolean d(int param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            discarded$10 = this.b(-15);
            if (-21 < (this.f(-3) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.f(-3) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int f(int param0) {
        int discarded$2 = 0;
        if (param0 != -3) {
          discarded$2 = qda.b((byte) 52);
          return this.field_e.a((byte) -56) - -this.field_m.a((byte) -92);
        } else {
          return this.field_e.a((byte) -56) - -this.field_m.a((byte) -92);
        }
    }

    final static void a(int param0, int param1) {
        toa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ik var4 = null;
        toa stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        toa stackOut_5_0 = null;
        vg stackOut_7_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == -21) {
              var2 = (toa) ((Object) vsa.field_m.f(-80));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      uca.a(param0, var2, (byte) 93);
                      stackOut_5_0 = (toa) ((Object) vsa.field_m.e(113));
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        var2 = stackIn_6_0;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_7_0 = hca.field_I.f(param1 ^ 91);
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                }
                var4 = (ik) ((Object) stackIn_8_0);
                L4: while (true) {
                  if (var4 == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    fna.a(param0, -23814, var4);
                    var4 = (ik) ((Object) hca.field_I.e(121));
                    if (var3 == 0) {
                      continue L4;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "qda.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            uia var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_34_0 = 0;
            if (4 > wg.field_l.field_a) {
              if (param0 == -66) {
                try {
                  L0: {
                    L1: {
                      if (cma.field_m == 0) {
                        bga.field_c = oi.field_a.a(-24818, pca.field_a, du.field_d);
                        cma.field_m = cma.field_m + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (cma.field_m == 1) {
                        if (2 != bga.field_c.field_b) {
                          if (bga.field_c.field_b != 1) {
                            break L2;
                          } else {
                            cma.field_m = cma.field_m + 1;
                            break L2;
                          }
                        } else {
                          stackOut_16_0 = du.a(-1, (byte) 122);
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if ((cma.field_m ^ -1) != -3) {
                        break L3;
                      } else {
                        jia.field_a = new jqa((java.net.Socket) (bga.field_c.field_f), oi.field_a);
                        var2 = new uia(13);
                        ea.a((byte) 107, pu.field_b, var2, wk.field_n, joa.field_a);
                        var2.i(15, 0);
                        var2.a(wea.field_a, (byte) 117);
                        jia.field_a.a(var2.field_g, 0, 13, 106);
                        cma.field_m = cma.field_m + 1;
                        pm.field_n = 30000L + bva.b((byte) -107);
                        break L3;
                      }
                    }
                    L4: {
                      if (cma.field_m == 3) {
                        L5: {
                          if ((jia.field_a.c(0) ^ -1) >= -1) {
                            break L5;
                          } else {
                            var1_int = jia.field_a.d(-2147483648);
                            if (var1_int == 0) {
                              cma.field_m = cma.field_m + 1;
                              if (!TombRacer.field_G) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              stackOut_26_0 = du.a(var1_int, (byte) -26);
                              stackIn_27_0 = stackOut_26_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                        if (bva.b((byte) -107) > pm.field_n) {
                          stackOut_31_0 = du.a(-2, (byte) 17);
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    if (4 != cma.field_m) {
                      stackOut_36_0 = -1;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      wg.field_l.a(jia.field_a, (byte) 54, vga.field_q);
                      cma.field_m = 0;
                      jia.field_a = null;
                      bga.field_c = null;
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return du.a(-3, (byte) -93);
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return stackIn_32_0;
                    } else {
                      if (decompiledRegionSelector0 == 3) {
                        return stackIn_35_0;
                      } else {
                        return stackIn_37_0;
                      }
                    }
                  }
                }
              } else {
                return -114;
              }
            } else {
              if (0 == (wg.field_l.field_n ^ -1)) {
                return 3;
              } else {
                if (wg.field_l.field_n == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0);

    abstract void e(int param0);

    abstract boolean c(int param0);

    abstract void a(Object param0, byte param1, boolean param2);

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            this.field_o = (uia) null;
            if (-21 < (this.a((byte) 78) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.a((byte) 78) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(BitSet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 >= 80) {
                break L1;
              } else {
                field_i = 11;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 >= param0.size()) {
                    break L4;
                  } else {
                    stackOut_5_0 = param0.get(var3);
                    stackIn_10_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_6_0) {
                          break L5;
                        } else {
                          var2_int++;
                          break L5;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_9_0 = var2_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("qda.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final int a(byte param0) {
        if (param0 != 78) {
          this.field_k = (vj) null;
          return this.field_c.a((byte) -77) + this.field_k.a((byte) -43);
        } else {
          return this.field_c.a((byte) -77) + this.field_k.a((byte) -43);
        }
    }

    final qqa a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = ((long)param2 << -133217952) - -(long)param0;
        qqa var8 = new qqa();
        var8.field_j = var6;
        if (param3 != -21) {
            return (qqa) null;
        }
        var8.field_l = param1 ? true : false;
        var8.field_q = param4;
        if (param1) {
            if (!((this.f(param3 ^ 22) ^ -1) > -21)) {
                throw new RuntimeException();
            }
            this.field_e.a(var8, (byte) -78);
            if (!TombRacer.field_G) {
                return var8;
            }
        }
        if (!(-21 < (this.a((byte) 78) ^ -1))) {
            throw new RuntimeException();
        }
        this.field_c.a(var8, (byte) -96);
        return var8;
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -72) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param1.length() <= var2_int) {
                    break L4;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_5_0 = dja.a((byte) -20, (char) var3);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0) {
                          break L5;
                        } else {
                          if (dp.a(param0 + 190, (char) var3)) {
                            break L5;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("qda.K(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    qda() {
        this.field_e = new vj();
        this.field_m = new vj();
        this.field_c = new vj();
        this.field_k = new vj();
        this.field_o = new uia(6);
        this.field_a = 0;
        this.field_n = 0;
        this.field_d = (byte) 0;
        this.field_h = new uia(10);
    }

    static {
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_l = "Try changing the following settings:  ";
    }
}
