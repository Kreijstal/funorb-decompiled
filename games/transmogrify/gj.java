/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj implements Runnable {
    private int field_o;
    private boolean field_i;
    private ib field_b;
    private int field_n;
    private OutputStream field_k;
    static java.awt.Color field_a;
    private byte[] field_h;
    private boolean field_e;
    private fe field_c;
    private int field_g;
    private java.net.Socket field_m;
    private InputStream field_d;
    static String field_f;
    static int[] field_j;
    static volatile int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        Object stackIn_21_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_e) {
              if (this.field_i) {
                this.field_i = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != this.field_h) {
                    break L1;
                  } else {
                    this.field_h = new byte[this.field_o];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    L3: {
                      if (param0 == 9) {
                        break L3;
                      } else {
                        this.run();
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          L7: {
                            if (param2 <= var6) {
                              break L7;
                            } else {
                              this.field_h[this.field_g] = param1[var6 + param3];
                              this.field_g = (this.field_g + 1) % this.field_o;
                              stackIn_21_0 = this;

                              if (var8 != 0) {
                                break L6;
                              } else {
                                if ((((gj) (this)).field_o + (this.field_n + -100)) % this.field_o == this.field_g) {
                                  throw new IOException();
                                } else {
                                  var6++;
                                  if (var8 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          if (null == this.field_b) {
                            stackIn_21_0 = this;
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                        ((gj) (this)).field_b = this.field_c.a((Runnable) (this), 3, 65535);
                        break L5;
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5_ref);

            stackIn_29_1 = new StringBuilder().append("gj.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 <= -69) {
            return;
        }
        field_f = (String) null;
    }

    gj(java.net.Socket param0, fe param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(boolean param0) {
        try {
            InterruptedException interruptedException = null;
            int var4 = 0;
            Object stackIn_6_0 = null;
            Object stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            var4 = Transmogrify.field_A ? 1 : 0;
            if (this.field_e) {
              return;
            } else {
              var2 = this;
              synchronized (var2) {
                L0: {
                  L1: {
                    stackIn_6_0 = this;

                    if (!param0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L1;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L1;
                    }
                  }
                  ((gj) (this)).field_e = stackIn_7_1 != 0;
                  this.notifyAll();
                  break L0;
                }
              }
              if (null != this.field_b) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (0 != this.field_b.field_c) {
                        break L4;
                      } else {
                        pg.a(1L, -94);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (-2 == (this.field_b.field_c ^ -1)) {
                      try {
                        L5: {
                          ((Thread) (this.field_b.field_g)).join();
                          break L5;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L6;
                        }
                      }
                      break L3;
                    } else {
                      this.field_b = null;
                      return;
                    }
                  }
                  this.field_b = null;
                  return;
                }
              } else {
                this.field_b = null;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        String stackIn_10_0 = null;
        int stackIn_12_0 = 0;
        String stackIn_19_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        char[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var15 = param1.toCharArray();
                        var5 = -108 % ((param0 - 46) / 49);
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var6;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= param1.length()) {
                            statePc = 30;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_31_0 = var3_int;
                        stackIn_5_0 = stackIn_31_0;
                        if (var11 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 > 2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_8_0 = 3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3_int - -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = stackIn_8_0 + var6;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (String) (param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((String) (Object) stackIn_10_0).length() < var7) {
                            statePc = 29;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0L;
                        stackIn_3_0 = var6;
                        stackIn_12_0 = stackIn_3_0;
                        if (var11 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_int = stackIn_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var10_int >= var7) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = -var8 + (var8 << 791048133) - -(long)(255 & var15[var10_int]);
                        var10_int++;
                        if (var11 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = ac.field_n.a(-126, var8);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var10 == null) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_10_0 = (String) (param1);
                        stackIn_19_0 = stackIn_10_0;
                        if (var11 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == var10) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dj.field_b.setLength(0);
                        discarded$0 = dj.field_b.append(param1.substring(var6, var7));
                        if (-1 == ((String) (var10)).indexOf(dj.field_b.toString())) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_int = var7 - var6;
                        if (var11 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = ac.field_n.b(-1);
                        if (var11 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param2) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ac.field_n.a(param1, (byte) 26, var8);
                        if (null == ac.field_n.a(-128, var8)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6++;
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = li.field_n[-var3_int + param1.length()];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var3);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("gj.B(").append(param0).append(',');
                    stackIn_33_1 = stackIn_34_1;
                    if (param1 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw ch.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 5768) {
              if (this.field_e) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (param1 <= 0) {
                      break L2;
                    } else {
                      var5_int = this.field_d.read(param2, param0, param1);
                      if (var6 == 0) {
                        if (-1 > (var5_int ^ -1)) {
                          param0 = param0 + var5_int;
                          param1 = param1 - var5_int;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        } else {
                          throw new EOFException();
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("gj.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(byte param0, cf param1, int param2) {
        hj var3 = ff.field_D;
        var3.a(false, param2);
        var3.f(param0 + 6306, param1.field_g);
        if (param0 != 83) {
            return;
        }
        try {
            var3.c(param1.field_h, -159688920);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gj.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        wf.a(-1);
        if (param0) {
            return;
        }
        gj.b(-59);
    }

    final static q a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        q stackIn_4_0 = null;
        q stackIn_7_0 = null;
        q stackIn_17_0 = null;
        q stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == param0) {
              stackIn_4_0 = ai.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 <= (var2_int ^ -1)) {
                var3 = 0;
                L1: while (true) {
                  if (var3 < var2_int) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int - 1 == var3) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = vc.field_N;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((li.field_o.indexOf(var4) ^ -1) != 0) {
                          break L2;
                        } else {
                          stackIn_20_0 = vc.field_N;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = rd.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("gj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return (q) ((Object) stackIn_23_0);
              }
            }
          }
        }
    }

    final static void e(int param0) {
        String var2;
        if (param0 != 0) {
          var2 = (String) null;
          gj.a((byte) -24, (String) null, true);
          ha.field_a = null;
          hk.field_c = null;
          return;
        } else {
          ha.field_a = null;
          hk.field_c = null;
          return;
        }
    }

    final void d(int param0) throws IOException {
        int var2 = -36 / ((param0 - 16) / 54);
        if (this.field_e) {
            return;
        }
        if (!(!this.field_i)) {
            this.field_i = false;
            throw new IOException();
        }
    }

    public final void run() {
        try {
            boolean stackIn_4_0 = false;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        L4: {
                          if (this.field_g != this.field_n) {
                            break L4;
                          } else {
                            stackOut_3_0 = this.field_e;
                            stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                            stackIn_4_0 = stackOut_3_0;
                            if (var6 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_4_0) {
                                  if (var6 == 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              try {
                                L6: {
                                  this.wait();
                                  break L6;
                                }
                              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L7: {
                                  var4 = (InterruptedException) (Object) decompiledCaughtException;
                                  break L7;
                                }
                              }
                              break L4;
                            }
                          }
                        }
                        stackIn_12_0 = this.field_n;
                        break L3;
                      }
                      L8: {
                        L9: {
                          var2 = stackIn_12_0;
                          if (this.field_n <= this.field_g) {
                            break L9;
                          } else {
                            var1_int = this.field_o - this.field_n;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_int = this.field_g + -this.field_n;
                        break L8;
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L10: {
                        L11: {
                          if (this.field_d == null) {
                            break L11;
                          } else {
                            this.field_d.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (null != this.field_k) {
                            this.field_k.close();
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (null == this.field_m) {
                            break L13;
                          } else {
                            this.field_m.close();
                            break L13;
                          }
                        }
                        break L10;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L14: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L14;
                      }
                    }
                    this.field_h = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L15: {
                          this.field_k.write(this.field_h, var2, var1_int);
                          break L15;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L16;
                        }
                      }
                      this.field_n = (var1_int + this.field_n) % this.field_o;
                      try {
                        L17: {
                          L18: {
                            if (this.field_n != this.field_g) {
                              break L18;
                            } else {
                              this.field_k.flush();
                              break L18;
                            }
                          }
                          break L17;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L19: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L19;
                        }
                      }
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L20: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                d.a((Throwable) ((Object) var1_ref), 28, (String) null);
                break L20;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (this.field_e) {
            return 0;
        }
        if (param0 != 1) {
            return 119;
        }
        return this.field_d.read();
    }

    final static String a(int param0) {
        if (param0 > -100) {
            gj.a(false, 74);
            if (w.field_a == null) {
                return "";
            }
            return w.field_a;
        }
        if (w.field_a == null) {
            return "";
        }
        return w.field_a;
    }

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        b var4_ref_b = null;
        int var4 = 0;
        int var5_int = 0;
        b var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ll.field_Q == lj.field_z) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2_long = lk.a(0);
                        if (aa.field_a == 0) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 >= (md.field_k ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_ref_b = (b) ((Object) le.field_C.a((byte) -95));
                        if (var4_ref_b == null) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4_ref_b.field_g >= var2_long) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_ref_b.c(5);
                        tg.field_a = var4_ref_b.field_h.length;
                        nf.field_l.field_h = 0;
                        var5_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (tg.field_a <= var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nf.field_l.field_g[var5_int] = var4_ref_b.field_h[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        bd.field_t = nf.field_k;
                        nf.field_k = dg.field_a;
                        dg.field_a = ca.field_e;
                        ca.field_e = var4_ref_b.field_j;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        if (param1 > 83) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        field_f = (String) null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 > md.field_k) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        nf.field_l.field_h = 0;
                        if (ue.a(1, 0)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    try {
                        md.field_k = nf.field_l.l(-12135);
                        nf.field_l.field_h = 0;
                        tg.field_a = param0[md.field_k];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!ce.a(0)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    try {
                        if (aa.field_a != 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        bd.field_t = nf.field_k;
                        nf.field_k = dg.field_a;
                        dg.field_a = ca.field_e;
                        ca.field_e = md.field_k;
                        md.field_k = -1;
                        stackIn_30_0 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    try {
                        var4 = aa.field_a;
                        if (lj.field_x == 0.0) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = (int)((double)var4 + d.field_c.nextGaussian() * lj.field_x);
                        if (0 <= var4) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = new b((long)var4 + var2_long, md.field_k, new byte[tg.field_a]);
                        var6 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (tg.field_a <= var6) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5.field_h[var6] = nf.field_l.field_g[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        le.field_C.a(var5, -100);
                        md.field_k = -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var2);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("gj.L(");
                    stackIn_42_1 = stackIn_43_1;
                    if (param0 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    throw ch.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        this.a(true);
    }

    final int a(byte param0) throws IOException {
        if (this.field_e) {
            return 0;
        }
        int var2 = -83 / ((-62 - param0) / 36);
        return this.field_d.available();
    }

    private gj(java.net.Socket param0, fe param1, int param2) throws IOException {
        this.field_i = false;
        this.field_n = 0;
        this.field_e = false;
        this.field_g = 0;
        try {
            this.field_c = param1;
            this.field_m = param0;
            this.field_m.setSoTimeout(30000);
            this.field_m.setTcpNoDelay(true);
            this.field_d = this.field_m.getInputStream();
            this.field_k = this.field_m.getOutputStream();
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "Orb points: <%0>";
        field_a = new java.awt.Color(10040319);
        field_l = 0;
    }
}
