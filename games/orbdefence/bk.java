/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends IOException {
    static hj[] field_d;
    static String field_a;
    static String field_b;
    static int field_e;
    static String field_c;
    static String[] field_f;

    final static void a(int param0, hj[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            dm.field_b = param1;
            if (param0 == 90) {
              if (dm.field_b == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.length < 3) {
                  throw new IllegalArgumentException("");
                } else {
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("bk.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bk(String param0) {
        super(param0);
    }

    final static fh a(int param0, java.awt.Component param1, int param2, boolean param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            fh var5 = null;
            ij var5_ref = null;
            fh stackIn_3_0 = null;
            ij stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (!param3) {
                        break L2;
                      } else {
                        field_c = (String) null;
                        break L2;
                      }
                    }
                    var4 = Class.forName("ch");
                    var5 = (fh) (var4.newInstance());
                    var5.a(88, param2, param0, param1);
                    stackIn_3_0 = (fh) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ij();
                  ((fh) ((Object) var5_ref)).a(-73, param2, param0, param1);
                  stackIn_5_0 = (ij) (var5_ref);
                  return (fh) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, vg param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        se var7 = null;
        se var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = uk.field_b;
                        var8 = var7;
                        var8.i(param1, -41);
                        var8.field_i = var8.field_i + 1;
                        var4 = var8.field_i;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var8.a(1, -62);
                        var8.b((byte) -60, param2.field_t);
                        var8.b((byte) -60, param2.field_g);
                        var8.b((byte) -60, param2.field_k);
                        var8.b(param2.field_n, -1);
                        var8.b(param2.field_m, -1);
                        var8.b(param2.field_f, -1);
                        var8.b(param2.field_r, -1);
                        var8.a(param2.field_o.length, -118);
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 >= param2.field_o.length) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7.b(param2.field_o[var5], -1);
                        var5++;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8.e(-18951, var4);
                        var8.c((byte) -15, var8.field_i - var4);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param2 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long a(int param0, CharSequence param1) {
        long stackIn_31_0 = 0L;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      var10 = var6;
                      var9 = 65;
                      if (var7 != 0) {
                        if (var9 >= var10) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              if (var9 > var10) {
                                break L7;
                              } else {
                                if (var6 <= 90) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var6 < 97) {
                                break L8;
                              } else {
                                if (122 < var6) {
                                  break L8;
                                } else {
                                  var2_long = var2_long + (long)(1 + (var6 - 97));
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var6 < 48) {
                              break L5;
                            } else {
                              if (var6 <= 57) {
                                var2_long = var2_long + (long)(-21 + var6);
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L5;
                        }
                        L9: {
                          if ((var2_long ^ -1L) > -177917621779460414L) {
                            break L9;
                          } else {
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var5++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 >= 121) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var8 = (byte[]) null;
                bk.a((byte[]) null, 109);
                break L2;
              }
              L10: while (true) {
                L11: {
                  L12: {
                    if (0L != var2_long % 37L) {
                      break L12;
                    } else {
                      stackIn_31_0 = 0L;

                      if (var7 != 0) {
                        break L11;
                      } else {
                        if (stackIn_31_0 == var2_long) {
                          break L12;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  stackIn_31_0 = var2_long;
                  break L11;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("bk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L13;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L13;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 == 48) {
            return;
        }
        field_d = (hj[]) null;
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        vg var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -12465) {
                break L1;
              } else {
                var3 = (vg) null;
                bk.a(true, 92, (vg) null);
                break L1;
              }
            }
            stackIn_3_0 = tj.a(param0.length, 0, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("bk.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = "AWESOMEO";
        field_a = "Waiting for fonts";
        field_e = 0;
        field_c = "BEST HISCORES";
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
