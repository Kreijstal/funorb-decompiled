/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ce extends ec {
    private int field_J;
    static volatile boolean field_K;
    static int field_E;
    private boolean field_F;
    private int field_B;
    private boolean field_G;
    static int field_I;
    private int field_M;
    static String field_H;
    private int field_L;

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                ce.f(-45);
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (!((ce) this).field_G) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (((ce) this).a(param5, param6, param4, (byte) 94, param3)) {
              ((ce) this).field_i = param1;
              if (param1 == 1) {
                ra.field_b = (ce) this;
                ((ce) this).field_B = -((ce) this).field_u + param4 - param5;
                ((ce) this).field_L = -((ce) this).field_l + param6 + -param3;
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_7_0 = var8_int;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("ce.NA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((ce) this).field_x instanceof tg)) {
                    break L3;
                  } else {
                    if (!((tg) (Object) ((ce) this).field_x).field_C) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((ce) this).field_i != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param0 + (nl.field_u + -((ce) this).field_L);
                    var6 = -param3 + hk.field_Jb - ((ce) this).field_B;
                    if (var5_int != ((ce) this).field_l) {
                      break L4;
                    } else {
                      if (var6 == ((ce) this).field_u) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((ce) this).field_u = var6;
                  ((ce) this).field_l = var5_int;
                  if (((ce) this).field_o instanceof pf) {
                    ((pf) (Object) ((ce) this).field_o).a(param0, param3, (ce) this, 104);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (((ce) this).field_F) {
                L5: {
                  if (((ce) this).field_M != ((ce) this).field_l) {
                    L6: {
                      var5_int = -((ce) this).field_l + ((ce) this).field_M;
                      stackOut_14_0 = this;
                      stackOut_14_1 = ((ce) this).field_l;
                      stackIn_18_0 = stackOut_14_0;
                      stackIn_18_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (Math.abs(var5_int) < -3) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = var5_int >> 1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L6;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (-1 >= var5_int) {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = -1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          break L6;
                        } else {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 1;
                          stackIn_19_0 = stackOut_16_0;
                          stackIn_19_1 = stackOut_16_1;
                          stackIn_19_2 = stackOut_16_2;
                          break L6;
                        }
                      }
                    }
                    ((ce) this).field_l = stackIn_19_1 + stackIn_19_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((ce) this).field_J != ((ce) this).field_u) {
                  L7: {
                    var5_int = ((ce) this).field_J + -((ce) this).field_u;
                    stackOut_22_0 = this;
                    stackOut_22_1 = ((ce) this).field_u;
                    stackIn_26_0 = stackOut_22_0;
                    stackIn_26_1 = stackOut_22_1;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    if (2 < Math.abs(var5_int)) {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = var5_int >> 1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      break L7;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (0 >= var5_int) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 1;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        break L7;
                      }
                    }
                  }
                  ((ce) this).field_u = stackIn_27_1 + stackIn_27_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L8: {
              if (param1 > 113) {
                break L8;
              } else {
                ((ce) this).e(33);
                break L8;
              }
            }
            super.a(param0, 122, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5;
            stackOut_32_1 = new StringBuilder().append("ce.E(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            Object var3 = null;
            hg var5 = null;
            hg var6 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (param0 < -35) {
                break L0;
              } else {
                var3 = null;
                rm[] discarded$4 = ce.a(47, -49, (eh) null, -99);
                break L0;
              }
            }
            L1: {
              if (td.field_b == null) {
                td.field_b = qc.field_f.a(uh.field_b, 27402, fj.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            if (td.field_b.field_a == 0) {
              return false;
            } else {
              long dupTemp$5 = hc.a(-9986);
              ud.field_a = dupTemp$5;
              fa.field_l = dupTemp$5;
              if (td.field_b.field_a == 1) {
                try {
                  L2: {
                    L3: {
                      oj.field_Ub = new el((java.net.Socket) td.field_b.field_f, qc.field_f);
                      var5 = sh.field_qb;
                      var6 = var5;
                      gk.field_g.field_l = 0;
                      if (param1) {
                        stackOut_12_0 = -2;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = -1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    ah.field_e = stackIn_13_0;
                    pl.field_c = stackIn_13_0;
                    md.field_b = stackIn_13_0;
                    ug.field_a = ul.field_c;
                    var6.field_l = 0;
                    hj.a(m.field_m, (jc) (Object) gk.field_g, wc.field_m, oj.field_Yb, 12);
                    al.b(-1, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ug.field_a = bd.field_d;
                  td.field_b = null;
                  return true;
                }
                td.field_b = null;
                return true;
              } else {
                ug.field_a = bd.field_d;
                td.field_b = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_H = null;
    }

    final static rm[] a(int param0, int param1, eh param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          if (param0 == -1979) {
            if (hn.a(param2, param3, param1, (byte) 109)) {
              return um.e((byte) 71);
            } else {
              return null;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (rm[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ce.F(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L0;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!((ce) this).a(param0, param2, 34, param3)) {
                break L1;
              } else {
                ((ce) this).a(param2, param0, (byte) 126, param3);
                ((ce) this).a(param0, param3, 8651, param2);
                StringBuilder discarded$26 = param3.append(" revert=").append(((ce) this).field_F);
                if (((ce) this).field_M == 2147483647) {
                  break L1;
                } else {
                  if (((ce) this).field_J == 2147483647) {
                    break L1;
                  } else {
                    StringBuilder discarded$27 = param3.append(" to ").append(((ce) this).field_M).append(',').append(((ce) this).field_J);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 > 118) {
                break L2;
              } else {
                field_K = true;
                break L2;
              }
            }
            stackOut_6_0 = (StringBuilder) param3;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ce.MA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    private ce(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ce) this).field_J = 2147483647;
        ((ce) this).field_M = 2147483647;
        try {
            ((ce) this).field_x = param6;
            ((ce) this).field_G = param8 ? true : false;
            ((ce) this).field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ce.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = co.a(false, param1, (byte) -101);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ce.C(").append(-1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gg.field_D.field_l = 0;
        gg.field_D.a(12, 108);
        gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
        gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
        gg.field_D.a(param0, 112);
        gg.field_D.a(param1, 80);
        gg.field_D.a((byte) 65, param3);
        gg.field_D.a(on.field_a, ch.field_i, (byte) 86);
        gk.field_g.g(18, 8);
        int fieldTemp$0 = gk.field_g.field_l + 1;
        gk.field_g.field_l = gk.field_g.field_l + 1;
        int var4 = fieldTemp$0;
        gk.field_g.a(gg.field_D.field_g, gg.field_D.field_l, 0, (byte) -123);
        gk.field_g.b(-var4 + gk.field_g.field_l, -1);
    }

    final void e(int param0) {
        super.e(-78);
        ((ce) this).field_x.a(((ce) this).field_m, true, 0, 0, ((ce) this).field_g);
        if (param0 > -2) {
          return;
        } else {
          ((ce) this).field_J = ((ce) this).field_u;
          ((ce) this).field_M = ((ce) this).field_l;
          return;
        }
    }

    final static void f(int param0) {
        L0: {
          am.a((byte) -16);
          if (fi.field_v != null) {
            af.a((byte) -103, fi.field_v);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          nm.d(param0 ^ 13628);
          lh.a(true);
          kh.a(0);
          if (bg.f((byte) 121)) {
            gk.field_g.g(1, 8);
            al.b(-1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 13633) {
          return;
        } else {
          tn.a(false);
          return;
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, 108);
        if (param5 < 73) {
            return;
        }
        try {
            ((ce) this).field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ce.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Connecting to<br>friend server...";
        field_I = 1;
        field_K = true;
    }
}
