/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi implements Runnable {
    static String field_h;
    private OutputStream field_n;
    private hd field_e;
    static String[] field_m;
    private int field_b;
    private boolean field_k;
    private InputStream field_f;
    static ep field_i;
    private wo field_d;
    static String field_a;
    private java.net.Socket field_l;
    private byte[] field_c;
    private int field_p;
    private int field_g;
    private boolean field_o;
    static int field_j;

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (va.field_w != null) {
          var1 = (Object) (Object) va.field_w;
          synchronized (var1) {
            L0: {
              va.field_w = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_m = null;
        field_i = null;
        field_a = null;
    }

    hi(java.net.Socket param0, hd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (!((hi) this).field_k) {
            if (!((hi) this).field_o) {
              L0: {
                if (((hi) this).field_c == null) {
                  ((hi) this).field_c = new byte[((hi) this).field_p];
                  break L0;
                } else {
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  if (param1 == 20) {
                    var6 = 0;
                    L2: while (true) {
                      if (param3 <= var6) {
                        L3: {
                          if (null == ((hi) this).field_d) {
                            ((hi) this).field_d = ((hi) this).field_e.a(3, param1 + -20, (Runnable) this);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        this.notifyAll();
                        break L1;
                      } else {
                        ((hi) this).field_c[((hi) this).field_g] = param0[param2 + var6];
                        ((hi) this).field_g = (((hi) this).field_g - -1) % ((hi) this).field_p;
                        if (((hi) this).field_g == (-100 + ((hi) this).field_p + ((hi) this).field_b) % ((hi) this).field_p) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              ((hi) this).field_o = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("hi.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((hi) this).run();
                break L1;
              }
            }
            if (!((hi) this).field_k) {
              L2: while (true) {
                if (0 >= param2) {
                  break L0;
                } else {
                  var5_int = ((hi) this).field_f.read(param3, param1, param2);
                  if (0 >= var5_int) {
                    throw new EOFException();
                  } else {
                    param2 = param2 - var5_int;
                    param1 = param1 + var5_int;
                    continue L2;
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("hi.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final int d(byte param0) throws IOException {
        if (((hi) this).field_k) {
            return 0;
        }
        if (param0 != 43) {
            field_j = -2;
            return ((hi) this).field_f.available();
        }
        return ((hi) this).field_f.available();
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
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((hi) this).field_g == ((hi) this).field_b) {
                          if (((hi) this).field_k) {
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
                        if (((hi) this).field_g < ((hi) this).field_b) {
                          var1_int = -((hi) this).field_b + ((hi) this).field_p;
                          break L6;
                        } else {
                          var1_int = -((hi) this).field_b + ((hi) this).field_g;
                          break L6;
                        }
                      }
                      var2 = ((hi) this).field_b;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((hi) this).field_f) {
                            break L8;
                          } else {
                            ((hi) this).field_f.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((hi) this).field_n != null) {
                            ((hi) this).field_n.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((hi) this).field_l) {
                            ((hi) this).field_l.close();
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
                    ((hi) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((hi) this).field_n.write(((hi) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hi) this).field_o = true;
                          break L13;
                        }
                      }
                      ((hi) this).field_b = (var1_int + ((hi) this).field_b) % ((hi) this).field_p;
                      try {
                        L14: {
                          L15: {
                            if (((hi) this).field_b == ((hi) this).field_g) {
                              ((hi) this).field_n.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hi) this).field_o = true;
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
                af.a((Throwable) (Object) var1_ref, -65, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (bp.field_e <= 32) {
            mh.a(0, (byte) -109);
        } else {
            var1 = bp.field_e % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            mh.a(bp.field_e + -var1, (byte) -109);
            return;
        }
    }

    final void c(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((hi) this).field_k) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((hi) this).field_k = true;
              this.notifyAll();
              break L0;
            }
          }
          if (param0 == -45) {
            if (((hi) this).field_d != null) {
              L1: while (true) {
                if (((hi) this).field_d.field_g != 0) {
                  L2: {
                    if (((hi) this).field_d.field_g != 1) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          ((Thread) ((hi) this).field_d.field_f).join();
                          decompiledRegionSelector0 = 0;
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        ((hi) this).field_d = null;
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((hi) this).field_d = null;
                  return;
                } else {
                  nu.a(1L, 0);
                  continue L1;
                }
              }
            } else {
              ((hi) this).field_d = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        if (((hi) this).field_k) {
            return;
        }
        if (!(!((hi) this).field_o)) {
            ((hi) this).field_o = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((hi) this).c((byte) -45);
    }

    final int a(int param0) throws IOException {
        if (((hi) this).field_k) {
          return 0;
        } else {
          if (param0 <= 1) {
            field_j = 65;
            return ((hi) this).field_f.read();
          } else {
            return ((hi) this).field_f.read();
          }
        }
    }

    private hi(java.net.Socket param0, hd param1, int param2) throws IOException {
        ((hi) this).field_b = 0;
        ((hi) this).field_o = false;
        ((hi) this).field_g = 0;
        ((hi) this).field_k = false;
        try {
            ((hi) this).field_e = param1;
            ((hi) this).field_l = param0;
            ((hi) this).field_l.setSoTimeout(30000);
            ((hi) this).field_l.setTcpNoDelay(true);
            ((hi) this).field_f = ((hi) this).field_l.getInputStream();
            ((hi) this).field_n = ((hi) this).field_l.getOutputStream();
            ((hi) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You currently have an ongoing mission in progress<br><br><col=FFFF00><%0></col>.<br><br>Starting a new mission will abort the currently ongoing mission.<br><br>Do you wish to continue?";
        field_m = new String[]{"Skirmish", "Warrior", "Ranger", "Mage", "Flying", "Helper", "Creeper", "Titan"};
        field_a = "Earn runes to access new gods and units.";
    }
}
