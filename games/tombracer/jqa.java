/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jqa implements Runnable {
    private boolean field_a;
    private int field_k;
    private int field_d;
    private java.net.Socket field_e;
    static jea field_b;
    private InputStream field_h;
    private fia field_i;
    private OutputStream field_l;
    private byte[] field_c;
    static int field_g;
    private boolean field_f;
    private naa field_j;
    private int field_m;

    protected final void finalize() {
        ((jqa) this).a((byte) 105);
    }

    public static void a() {
        field_b = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((jqa) this).field_a) {
              return;
            } else {
              if (((jqa) this).field_f) {
                ((jqa) this).field_f = false;
                throw new IOException();
              } else {
                L1: {
                  if (((jqa) this).field_c == null) {
                    ((jqa) this).field_c = new byte[((jqa) this).field_d];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param2) {
                        L4: {
                          if (((jqa) this).field_j != null) {
                            break L4;
                          } else {
                            ((jqa) this).field_j = ((jqa) this).field_i.a((Runnable) this, 425, 3);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((jqa) this).field_c[((jqa) this).field_m] = param0[var6 + param1];
                        ((jqa) this).field_m = (1 + ((jqa) this).field_m) % ((jqa) this).field_d;
                        if (((jqa) this).field_m != (((jqa) this).field_d + ((jqa) this).field_k - 100) % ((jqa) this).field_d) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param3 >= 99) {
                    break L5;
                  } else {
                    ((jqa) this).field_k = 121;
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("jqa.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((jqa) this).field_a)) {
            return 0;
        }
        if (param0 != -2147483648) {
            Object var3 = null;
            int discarded$0 = jqa.a(-72, (Random) null, -100);
        }
        return ((jqa) this).field_h.read();
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (!(pda.a(param9, param4, param6, 256, param7, param3, param0, param8, param2))) {
            return 0;
        }
        int var10 = ova.a(param7, param8, true, param9, param6);
        int var11 = ova.a(param4, param3, true, param0, param2);
        if (!(param5 <= 0)) {
            var10 = var10 + (1 << param5 - 1);
            var11 = var11 + (1 << -1 + param5);
        }
        return (var10 >> param5) * (var11 >> param5);
    }

    jqa(java.net.Socket param0, fia param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(int param0) throws IOException {
        if (((jqa) this).field_a) {
            return;
        }
        if (((jqa) this).field_f) {
            ((jqa) this).field_f = false;
            throw new IOException();
        }
        if (param0 < 79) {
            ((jqa) this).a((byte) 122);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((jqa) this).field_a) {
              if (param0 == 0) {
                L1: while (true) {
                  if (param3 <= 0) {
                    break L0;
                  } else {
                    var5_int = ((jqa) this).field_h.read(param2, param1, param3);
                    if (var5_int > 0) {
                      param3 = param3 - var5_int;
                      param1 = param1 + var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("jqa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final int c(int param0) throws IOException {
        if (((jqa) this).field_a) {
            return 0;
        }
        if (param0 != 0) {
            ((jqa) this).a((byte) 47);
        }
        return ((jqa) this).field_h.available();
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
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((jqa) this).field_m == ((jqa) this).field_k) {
                          if (((jqa) this).field_a) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = ((jqa) this).field_k;
                        if (((jqa) this).field_k > ((jqa) this).field_m) {
                          var1_int = ((jqa) this).field_d - ((jqa) this).field_k;
                          break L6;
                        } else {
                          var1_int = -((jqa) this).field_k + ((jqa) this).field_m;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((jqa) this).field_h) {
                            break L8;
                          } else {
                            ((jqa) this).field_h.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((jqa) this).field_l == null) {
                            break L9;
                          } else {
                            ((jqa) this).field_l.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((jqa) this).field_e) {
                            break L10;
                          } else {
                            ((jqa) this).field_e.close();
                            break L10;
                          }
                        }
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L11;
                      }
                    }
                    ((jqa) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((jqa) this).field_l.write(((jqa) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((jqa) this).field_f = true;
                          break L13;
                        }
                      }
                      ((jqa) this).field_k = (((jqa) this).field_k - -var1_int) % ((jqa) this).field_d;
                      try {
                        L14: {
                          L15: {
                            if (((jqa) this).field_m != ((jqa) this).field_k) {
                              break L15;
                            } else {
                              ((jqa) this).field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((jqa) this).field_f = true;
                          break L16;
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
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                ssa.a((String) null, (byte) 122, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 <= 0) {
              throw new IllegalArgumentException();
            } else {
              var3_int = -43 % ((param2 - -14) / 57);
              if (cla.a(9181, param0)) {
                stackOut_5_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param0 >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var4 = -2147483648 - (int)(4294967296L % (long)param0);
                L1: while (true) {
                  var5 = param1.nextInt();
                  if (var4 > var5) {
                    stackOut_10_0 = oea.a(var5, param0, -127);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("jqa.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!((jqa) this).field_a) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((jqa) this).field_a = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (((jqa) this).field_j == null) {
              break L1;
            } else {
              L2: while (true) {
                if (((jqa) this).field_j.field_b != 0) {
                  if (1 != ((jqa) this).field_j.field_b) {
                    break L1;
                  } else {
                    try {
                      L3: {
                        ((Thread) ((jqa) this).field_j.field_f).join();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L1;
                  }
                } else {
                  vja.a(0, 1L);
                  continue L2;
                }
              }
            }
          }
          L5: {
            if (param0 == 105) {
              break L5;
            } else {
              ((jqa) this).field_c = null;
              break L5;
            }
          }
          ((jqa) this).field_j = null;
          return;
        } else {
          return;
        }
    }

    private jqa(java.net.Socket param0, fia param1, int param2) throws IOException {
        ((jqa) this).field_k = 0;
        ((jqa) this).field_a = false;
        ((jqa) this).field_f = false;
        ((jqa) this).field_m = 0;
        try {
            ((jqa) this).field_i = param1;
            ((jqa) this).field_e = param0;
            ((jqa) this).field_e.setSoTimeout(30000);
            ((jqa) this).field_e.setTcpNoDelay(true);
            ((jqa) this).field_h = ((jqa) this).field_e.getInputStream();
            ((jqa) this).field_l = ((jqa) this).field_e.getOutputStream();
            ((jqa) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
