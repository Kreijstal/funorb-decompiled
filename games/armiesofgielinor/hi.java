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
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 == 41) {
          if (va.field_w != null) {
            var1 = va.field_w;
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
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 <= 72) {
          field_h = (String) null;
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        } else {
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        }
    }

    hi(java.net.Socket param0, hd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_k) {
              if (!this.field_o) {
                L1: {
                  if (this.field_c == null) {
                    this.field_c = new byte[this.field_p];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    if (param1 == 20) {
                      var6 = 0;
                      L3: while (true) {
                        if (param3 <= var6) {
                          L4: {
                            if (null == this.field_d) {
                              this.field_d = this.field_e.a(3, param1 + -20, (Runnable) (this));
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_c[this.field_g] = param0[param2 + var6];
                          this.field_g = (this.field_g - -1) % this.field_p;
                          if (this.field_g == (-100 + this.field_p + this.field_b) % this.field_p) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
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
                this.field_o = false;
                throw new IOException();
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5_ref);

            stackIn_28_1 = new StringBuilder().append("hi.D(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.run();
                break L1;
              }
            }
            if (!this.field_k) {
              L2: while (true) {
                if (0 >= param2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_f.read(param3, param1, param2);
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("hi.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d(byte param0) throws IOException {
        if (this.field_k) {
            return 0;
        }
        if (param0 != 43) {
            field_j = -2;
            return this.field_f.available();
        }
        return this.field_f.available();
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_g == this.field_b) {
                          if (this.field_k) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (this.field_g < this.field_b) {
                          var1_int = -this.field_b + this.field_p;
                          break L6;
                        } else {
                          var1_int = -this.field_b + this.field_g;
                          break L6;
                        }
                      }
                      var2 = this.field_b;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == this.field_f) {
                            break L8;
                          } else {
                            this.field_f.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_n != null) {
                            this.field_n.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_l) {
                            this.field_l.close();
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L12: {
                          this.field_n.write(this.field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_o = true;
                          break L13;
                        }
                      }
                      this.field_b = (var1_int + this.field_b) % this.field_p;
                      try {
                        L14: {
                          L15: {
                            if (this.field_b == this.field_g) {
                              this.field_n.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_o = true;
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
                var7 = (String) null;
                af.a((Throwable) ((Object) var1_ref), -65, (String) null);
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
        int var1;
        L0: {
          if ((bp.field_e ^ -1) < -33) {
            L1: {
              var1 = bp.field_e % 32;
              if (-1 != (var1 ^ -1)) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            mh.a(bp.field_e + -var1, (byte) -109);
            break L0;
          } else {
            mh.a(0, (byte) -109);
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          hi.b((byte) -114);
          return;
        }
    }

    final void c(byte param0) {
        try {
            InterruptedException var2 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!this.field_k) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_k = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (param0 == -45) {
                if (this.field_d != null) {
                  L1: while (true) {
                    if (this.field_d.field_g != 0) {
                      L2: {
                        if ((this.field_d.field_g ^ -1) != -2) {
                          break L2;
                        } else {
                          try {
                            L3: {
                              ((Thread) (this.field_d.field_f)).join();
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L4: {
                              var2 = (InterruptedException) (Object) decompiledCaughtException;
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            this.field_d = null;
                            return;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_d = null;
                      return;
                    } else {
                      nu.a(1L, 0);
                      continue L1;
                    }
                  }
                } else {
                  this.field_d = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        if (this.field_k) {
            return;
        }
        if (!(!this.field_o)) {
            this.field_o = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        this.c((byte) -45);
    }

    final int a(int param0) throws IOException {
        if (this.field_k) {
          return 0;
        } else {
          if (param0 <= 1) {
            field_j = 65;
            return this.field_f.read();
          } else {
            return this.field_f.read();
          }
        }
    }

    private hi(java.net.Socket param0, hd param1, int param2) throws IOException {
        this.field_b = 0;
        this.field_o = false;
        this.field_g = 0;
        this.field_k = false;
        try {
            this.field_e = param1;
            this.field_l = param0;
            this.field_l.setSoTimeout(30000);
            this.field_l.setTcpNoDelay(true);
            this.field_f = this.field_l.getInputStream();
            this.field_n = this.field_l.getOutputStream();
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "You currently have an ongoing mission in progress<br><br><col=FFFF00><%0></col>.<br><br>Starting a new mission will abort the currently ongoing mission.<br><br>Do you wish to continue?";
        field_m = new String[]{"Skirmish", "Warrior", "Ranger", "Mage", "Flying", "Helper", "Creeper", "Titan"};
        field_a = "Earn runes to access new gods and units.";
    }
}
