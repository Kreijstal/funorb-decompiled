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
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
                var5_ref = this;
                synchronized (var5_ref) {
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
                          if (param2 <= var6) {
                            if (null == this.field_b) {
                              stackOut_20_0 = this;
                              stackIn_21_0 = stackOut_20_0;
                              break L6;
                            } else {
                              break L5;
                            }
                          } else {
                            this.field_h[this.field_g] = param1[var6 + param3];
                            this.field_g = (this.field_g + 1) % this.field_o;
                            stackOut_13_0 = this;
                            stackIn_21_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var8 != 0) {
                              break L6;
                            } else {
                              if ((((gj) (this)).field_o + (this.field_n + -100)) % this.field_o == this.field_g) {
                                throw new IOException();
                              } else {
                                var6++;
                                continue L4;
                              }
                            }
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
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("gj.G(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
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
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Object stackIn_5_0 = null;
            Object stackIn_6_0 = null;
            Object stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_4_0 = null;
            Object stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            Object stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            var4 = Transmogrify.field_A ? 1 : 0;
            if (this.field_e) {
              return;
            } else {
              var2 = this;
              synchronized (var2) {
                L0: {
                  L1: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L1;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
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
        StringBuilder discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        char[] var15 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        String stackOut_9_0 = null;
        int stackOut_11_0 = 0;
        String stackOut_18_0 = null;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var15 = param1.toCharArray();
            var5 = -108 % ((param0 - 46) / 49);
            var6 = 0;
            L1: while (true) {
              stackOut_2_0 = var6;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= param1.length()) {
                      break L4;
                    } else {
                      stackOut_4_0 = var3_int;
                      stackIn_31_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_5_0 > 2) {
                            stackOut_7_0 = var3_int - -1;
                            stackIn_8_0 = stackOut_7_0;
                            break L5;
                          } else {
                            stackOut_6_0 = 3;
                            stackIn_8_0 = stackOut_6_0;
                            break L5;
                          }
                        }
                        var7 = stackIn_8_0 + var6;
                        L6: while (true) {
                          stackOut_9_0 = (String) (param1);
                          stackIn_10_0 = stackOut_9_0;
                          L7: while (true) {
                            L8: {
                              if (((String) (Object) stackIn_10_0).length() < var7) {
                                break L8;
                              } else {
                                var8 = 0L;
                                stackOut_11_0 = var6;
                                stackIn_3_0 = stackOut_11_0;
                                stackIn_12_0 = stackOut_11_0;
                                if (var11 != 0) {
                                  continue L2;
                                } else {
                                  var10_int = stackIn_12_0;
                                  L9: while (true) {
                                    if (var10_int >= var7) {
                                      var10 = ac.field_n.a(-126, var8);
                                      L10: while (true) {
                                        L11: {
                                          if (var10 == null) {
                                            break L11;
                                          } else {
                                            stackOut_18_0 = (String) (param1);
                                            stackIn_10_0 = stackOut_18_0;
                                            stackIn_19_0 = stackOut_18_0;
                                            if (var11 != 0) {
                                              continue L7;
                                            } else {
                                              L12: {
                                                if (stackIn_19_0 == var10) {
                                                  break L12;
                                                } else {
                                                  dj.field_b.setLength(0);
                                                  discarded$1 = dj.field_b.append(param1.substring(var6, var7));
                                                  if (-1 == ((String) (var10)).indexOf(dj.field_b.toString())) {
                                                    break L12;
                                                  } else {
                                                    var3_int = var7 - var6;
                                                    if (var11 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              var10 = ac.field_n.b(-1);
                                              if (var11 == 0) {
                                                continue L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        L13: {
                                          if (param2) {
                                            ac.field_n.a(param1, (byte) 26, var8);
                                            if (null == ac.field_n.a(-128, var8)) {
                                              throw new IllegalStateException();
                                            } else {
                                              break L13;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        var7++;
                                        if (var11 == 0) {
                                          continue L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      var8 = -var8 + (var8 << 791048133) - -(long)(255 & var15[var10_int]);
                                      var10_int++;
                                      if (var11 != 0) {
                                        continue L6;
                                      } else {
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var6++;
                            if (var11 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_30_0 = li.field_n[-var3_int + param1.length()];
                  stackIn_31_0 = stackOut_30_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var3);
            stackOut_32_1 = new StringBuilder().append("gj.B(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        return stackIn_31_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 5768) {
              if (this.field_e) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: while (true) {
                  if (param1 <= 0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int = this.field_d.read(param2, param0, param1);
                    if (var6 == 0) {
                      if (-1 > (var5_int ^ -1)) {
                        param0 = param0 + var5_int;
                        param1 = param1 - var5_int;
                        continue L1;
                      } else {
                        throw new EOFException();
                      }
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("gj.J(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
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
        int discarded$3 = wf.a(-1);
        if (param0) {
            return;
        }
        gj.b(-59);
    }

    final static q a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        q stackIn_4_0 = null;
        q stackIn_7_0 = null;
        q stackIn_17_0 = null;
        q stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        q stackOut_3_0 = null;
        q stackOut_16_0 = null;
        q stackOut_19_0 = null;
        Object stackOut_22_0 = null;
        q stackOut_6_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == param0) {
              stackOut_3_0 = ai.field_a;
              stackIn_4_0 = stackOut_3_0;
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
                        stackOut_16_0 = vc.field_N;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((li.field_o.indexOf(var4) ^ -1) != 0) {
                          break L2;
                        } else {
                          stackOut_19_0 = vc.field_N;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_6_0 = rd.field_d;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("gj.I(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
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
        int discarded$2 = 0;
        String var2 = null;
        if (param0 != 0) {
          var2 = (String) null;
          discarded$2 = gj.a((byte) -24, (String) null, true);
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
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            String var7 = null;
            boolean stackIn_4_0 = false;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0 = false;
            int stackOut_11_0 = 0;
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
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
                        stackOut_11_0 = this.field_n;
                        stackIn_12_0 = stackOut_11_0;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
        RuntimeException var2 = null;
        long var2_long = 0L;
        b var4_ref_b = null;
        int var4 = 0;
        int var5_int = 0;
        b var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (ll.field_Q == lj.field_z) {
              L1: {
                var2_long = lk.a(0);
                if (aa.field_a == 0) {
                  break L1;
                } else {
                  if (-1 >= (md.field_k ^ -1)) {
                    break L1;
                  } else {
                    var4_ref_b = (b) ((Object) le.field_C.a((byte) -95));
                    if (var4_ref_b == null) {
                      break L1;
                    } else {
                      if (var4_ref_b.field_g >= var2_long) {
                        break L1;
                      } else {
                        var4_ref_b.c(5);
                        tg.field_a = var4_ref_b.field_h.length;
                        nf.field_l.field_h = 0;
                        var5_int = 0;
                        L2: while (true) {
                          L3: {
                            L4: {
                              if (tg.field_a <= var5_int) {
                                break L4;
                              } else {
                                nf.field_l.field_g[var5_int] = var4_ref_b.field_h[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  if (var7 == 0) {
                                    continue L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            bd.field_t = nf.field_k;
                            nf.field_k = dg.field_a;
                            dg.field_a = ca.field_e;
                            ca.field_e = var4_ref_b.field_j;
                            break L3;
                          }
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L5: {
                if (param1 > 83) {
                  break L5;
                } else {
                  field_f = (String) null;
                  break L5;
                }
              }
              L6: while (true) {
                L7: {
                  if (0 > md.field_k) {
                    nf.field_l.field_h = 0;
                    if (ue.a(1, 0)) {
                      md.field_k = nf.field_l.l(-12135);
                      nf.field_l.field_h = 0;
                      tg.field_a = param0[md.field_k];
                      break L7;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L7;
                  }
                }
                if (!ce.a(0)) {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (aa.field_a != 0) {
                    L8: {
                      var4 = aa.field_a;
                      if (lj.field_x == 0.0) {
                        break L8;
                      } else {
                        var4 = (int)((double)var4 + d.field_c.nextGaussian() * lj.field_x);
                        if (0 <= var4) {
                          break L8;
                        } else {
                          var4 = 0;
                          break L8;
                        }
                      }
                    }
                    var5 = new b((long)var4 + var2_long, md.field_k, new byte[tg.field_a]);
                    var6 = 0;
                    L9: while (true) {
                      L10: {
                        if (tg.field_a <= var6) {
                          break L10;
                        } else {
                          var5.field_h[var6] = nf.field_l.field_g[var6];
                          var6++;
                          if (var7 != 0) {
                            continue L6;
                          } else {
                            if (var7 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      le.field_C.a(var5, -100);
                      md.field_k = -1;
                      continue L6;
                    }
                  } else {
                    bd.field_t = nf.field_k;
                    nf.field_k = dg.field_a;
                    dg.field_a = ca.field_e;
                    ca.field_e = md.field_k;
                    md.field_k = -1;
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("gj.L(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                return stackIn_30_0 != 0;
              }
            }
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
