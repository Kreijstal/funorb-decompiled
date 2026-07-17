/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll implements Runnable {
    private InputStream field_i;
    private int field_g;
    private int field_m;
    static int field_h;
    private OutputStream field_o;
    private ia field_b;
    private byte[] field_c;
    static String field_e;
    private boolean field_l;
    private java.net.Socket field_j;
    private vf field_n;
    static hm field_a;
    private boolean field_f;
    static int field_d;
    private int field_k;

    protected final void finalize() {
        ((ll) this).b(120);
    }

    ll(java.net.Socket param0, vf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          if (!((ll) this).field_l) {
            if (!((ll) this).field_f) {
              if (param0 >= 92) {
                L0: {
                  if (null != ((ll) this).field_c) {
                    break L0;
                  } else {
                    ((ll) this).field_c = new byte[((ll) this).field_g];
                    break L0;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L1: {
                    var6 = 0;
                    L2: while (true) {
                      if (param2 <= var6) {
                        L3: {
                          if (null != ((ll) this).field_b) {
                            break L3;
                          } else {
                            ((ll) this).field_b = ((ll) this).field_n.a((Runnable) this, (byte) 44, 3);
                            break L3;
                          }
                        }
                        this.notifyAll();
                        break L1;
                      } else {
                        ((ll) this).field_c[((ll) this).field_m] = param1[var6 + param3];
                        ((ll) this).field_m = (((ll) this).field_m + 1) % ((ll) this).field_g;
                        if (((ll) this).field_m == (((ll) this).field_k - -((ll) this).field_g + -100) % ((ll) this).field_g) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              ((ll) this).field_f = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ll.E(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        if (!((ll) this).field_l) {
          var2_ref = this;
          synchronized (var2_ref) {
            L0: {
              L1: {
                ((ll) this).field_l = true;
                if (param0 >= 84) {
                  break L1;
                } else {
                  int discarded$2 = ll.a((byte) 104, -28);
                  break L1;
                }
              }
              this.notifyAll();
              break L0;
            }
          }
          if (((ll) this).field_b != null) {
            L2: while (true) {
              if (((ll) this).field_b.field_c != 0) {
                if (((ll) this).field_b.field_c == 1) {
                  try {
                    L3: {
                      ((Thread) ((ll) this).field_b.field_a).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((ll) this).field_b = null;
                    return;
                  }
                  ((ll) this).field_b = null;
                  return;
                } else {
                  ((ll) this).field_b = null;
                  return;
                }
              } else {
                int discarded$3 = -10309;
                gf.a(1L);
                continue L2;
              }
            }
          } else {
            ((ll) this).field_b = null;
            return;
          }
        } else {
          return;
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
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((ll) this).field_m == ((ll) this).field_k) {
                          if (((ll) this).field_l) {
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
                        if (((ll) this).field_m < ((ll) this).field_k) {
                          var1_int = -((ll) this).field_k + ((ll) this).field_g;
                          break L6;
                        } else {
                          var1_int = ((ll) this).field_m + -((ll) this).field_k;
                          break L6;
                        }
                      }
                      var2 = ((ll) this).field_k;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != ((ll) this).field_i) {
                            ((ll) this).field_i.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((ll) this).field_o) {
                            break L9;
                          } else {
                            ((ll) this).field_o.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((ll) this).field_j == null) {
                            break L10;
                          } else {
                            ((ll) this).field_j.close();
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
                    ((ll) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((ll) this).field_o.write(((ll) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ll) this).field_f = true;
                          break L13;
                        }
                      }
                      ((ll) this).field_k = (((ll) this).field_k - -var1_int) % ((ll) this).field_g;
                      try {
                        L14: {
                          L15: {
                            if (((ll) this).field_m != ((ll) this).field_k) {
                              break L15;
                            } else {
                              ((ll) this).field_o.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ll) this).field_f = true;
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
                di.a((Throwable) (Object) var1_ref, 1, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -73) {
            int discarded$0 = ll.a((byte) -58, -86);
            return ke.a(param1, -21937, sb.field_t);
        }
        return ke.a(param1, -21937, sb.field_t);
    }

    final static void a() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != lb.field_y) {
          var1 = (Object) (Object) lb.field_y;
          synchronized (var1) {
            L0: {
              lb.field_y = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int c(int param0) throws IOException {
        if (!(!((ll) this).field_l)) {
            return 0;
        }
        if (param0 != 0) {
            return -37;
        }
        return ((ll) this).field_i.available();
    }

    public static void b() {
        field_e = null;
        field_a = null;
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (((ll) this).field_l) {
              return;
            } else {
              L1: while (true) {
                if (param3 <= 0) {
                  if (!param0) {
                    break L0;
                  } else {
                    field_a = null;
                    return;
                  }
                } else {
                  var5_int = ((ll) this).field_i.read(param1, param2, param3);
                  if (var5_int > 0) {
                    param2 = param2 + var5_int;
                    param3 = param3 - var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ll.I(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(boolean param0) throws IOException {
        if (!param0) {
          if (((ll) this).field_l) {
            return 0;
          } else {
            return ((ll) this).field_i.read();
          }
        } else {
          ((ll) this).field_k = -72;
          if (((ll) this).field_l) {
            return 0;
          } else {
            return ((ll) this).field_i.read();
          }
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 0;
        if (!((ll) this).field_l) {
          var2 = -54 / ((param0 - 65) / 38);
          if (((ll) this).field_f) {
            ((ll) this).field_f = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private ll(java.net.Socket param0, vf param1, int param2) throws IOException {
        ((ll) this).field_l = false;
        ((ll) this).field_f = false;
        ((ll) this).field_m = 0;
        ((ll) this).field_k = 0;
        try {
            ((ll) this).field_j = param0;
            ((ll) this).field_n = param1;
            ((ll) this).field_j.setSoTimeout(30000);
            ((ll) this).field_j.setTcpNoDelay(true);
            ((ll) this).field_i = ((ll) this).field_j.getInputStream();
            ((ll) this).field_o = ((ll) this).field_j.getOutputStream();
            ((ll) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ll.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = "Loading...";
    }
}
