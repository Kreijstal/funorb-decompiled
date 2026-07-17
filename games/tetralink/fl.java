/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl implements Runnable {
    private OutputStream field_i;
    static int field_g;
    private java.net.Socket field_f;
    static String field_a;
    static int field_b;
    private int field_k;
    static kc field_o;
    private vl field_r;
    private int field_v;
    private ie field_d;
    private byte[] field_t;
    static ji field_n;
    private boolean field_m;
    static int field_q;
    static int[] field_c;
    private int field_l;
    static boolean field_s;
    static lk field_u;
    static String field_h;
    private boolean field_p;
    static String field_e;
    private InputStream field_j;

    public static void b(int param0) {
        field_c = null;
        field_o = null;
        field_e = null;
        field_a = null;
        field_u = null;
        if (param0 != -26787) {
            field_b = 24;
        }
        field_h = null;
        field_n = null;
    }

    final int c(int param0) throws IOException {
        if (param0 != 3) {
            fl.b(95);
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.read();
    }

    final void d(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (!((fl) this).field_m) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((fl) this).field_m = true;
                this.notifyAll();
                if (param0 == -15488) {
                  break L1;
                } else {
                  ((fl) this).finalize();
                  break L1;
                }
              }
              break L0;
            }
          }
          L2: {
            if (null == ((fl) this).field_r) {
              break L2;
            } else {
              L3: while (true) {
                if (((fl) this).field_r.field_d != 0) {
                  if (1 != ((fl) this).field_r.field_d) {
                    break L2;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((fl) this).field_r.field_f).join();
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L2;
                  }
                } else {
                  tb.a(false, 1L);
                  continue L3;
                }
              }
            }
          }
          ((fl) this).field_r = null;
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        ((fl) this).d(-15488);
    }

    fl(java.net.Socket param0, ie param1) throws IOException {
        this(param0, param1, 5000);
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
        var6 = TetraLink.field_J;
        try {
          L0: {
            if (!((fl) this).field_m) {
              L1: {
                if (param3 == 0) {
                  break L1;
                } else {
                  field_u = null;
                  break L1;
                }
              }
              L2: while (true) {
                if (param1 <= 0) {
                  break L0;
                } else {
                  var5_int = ((fl) this).field_j.read(param2, param0, param1);
                  if (var5_int > 0) {
                    param0 = param0 + var5_int;
                    param1 = param1 - var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("fl.C(").append(param0).append(44).append(param1).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0) throws IOException {
        if (!(!((fl) this).field_m)) {
            return;
        }
        if (((fl) this).field_p) {
            ((fl) this).field_p = false;
            throw new IOException();
        }
        if (param0 != 100) {
            ((fl) this).d(-94);
        }
    }

    final static hb e(int param0) {
        String var1 = sa.a((byte) -39);
        if (param0 != 1) {
            Object var2 = null;
            boolean discarded$0 = fl.a((byte) 60, (CharSequence) null);
        }
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        return new hb(sa.a((byte) -113), pm.a(true));
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (((fl) this).field_m) {
              return;
            } else {
              if (((fl) this).field_p) {
                ((fl) this).field_p = false;
                throw new IOException();
              } else {
                L1: {
                  if (((fl) this).field_t != null) {
                    break L1;
                  } else {
                    ((fl) this).field_t = new byte[((fl) this).field_k];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      var6 = 0;
                      if (param0) {
                        break L3;
                      } else {
                        field_s = false;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (var6 >= param1) {
                        L5: {
                          if (null == ((fl) this).field_r) {
                            ((fl) this).field_r = ((fl) this).field_d.a((Runnable) this, 88, 3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((fl) this).field_t[((fl) this).field_v] = param2[var6 + param3];
                        ((fl) this).field_v = (((fl) this).field_v - -1) % ((fl) this).field_k;
                        if ((((fl) this).field_k + ((fl) this).field_l - 100) % ((fl) this).field_k != ((fl) this).field_v) {
                          var6++;
                          continue L4;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
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
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("fl.B(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
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
            var6 = TetraLink.field_J;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((fl) this).field_l != ((fl) this).field_v) {
                          break L3;
                        } else {
                          if (!((fl) this).field_m) {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        }
                      }
                      L6: {
                        var2 = ((fl) this).field_l;
                        if (((fl) this).field_v >= ((fl) this).field_l) {
                          var1_int = ((fl) this).field_v - ((fl) this).field_l;
                          break L6;
                        } else {
                          var1_int = -((fl) this).field_l + ((fl) this).field_k;
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
                          if (((fl) this).field_j == null) {
                            break L8;
                          } else {
                            ((fl) this).field_j.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((fl) this).field_i == null) {
                            break L9;
                          } else {
                            ((fl) this).field_i.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((fl) this).field_f) {
                            ((fl) this).field_f.close();
                            break L10;
                          } else {
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
                    ((fl) this).field_t = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((fl) this).field_i.write(((fl) this).field_t, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((fl) this).field_p = true;
                          break L13;
                        }
                      }
                      ((fl) this).field_l = (((fl) this).field_l + var1_int) % ((fl) this).field_k;
                      try {
                        L14: {
                          L15: {
                            if (((fl) this).field_l != ((fl) this).field_v) {
                              break L15;
                            } else {
                              ((fl) this).field_i.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((fl) this).field_p = true;
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
                fk.a(-55, (Throwable) (Object) var1_ref, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                hb discarded$2 = fl.e(92);
                break L1;
              }
            }
            stackOut_2_0 = ti.a(45, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fl.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final int f(int param0) throws IOException {
        if (param0 != 0) {
            ((fl) this).field_i = null;
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.available();
    }

    private fl(java.net.Socket param0, ie param1, int param2) throws IOException {
        ((fl) this).field_v = 0;
        ((fl) this).field_m = false;
        ((fl) this).field_l = 0;
        ((fl) this).field_p = false;
        try {
            ((fl) this).field_f = param0;
            ((fl) this).field_d = param1;
            ((fl) this).field_f.setSoTimeout(30000);
            ((fl) this).field_f.setTcpNoDelay(true);
            ((fl) this).field_j = ((fl) this).field_f.getInputStream();
            ((fl) this).field_i = ((fl) this).field_f.getOutputStream();
            ((fl) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
        field_q = 0;
        field_a = "Waiting for extra data";
        field_s = false;
        field_e = "You are playing <%0>.";
        field_h = "You have declined the invitation.";
    }
}
