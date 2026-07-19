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
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    if (param1 == 20) {
                      var6 = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (param3 <= var6) {
                              if (null == this.field_d) {
                                stackOut_21_0 = this;
                                stackIn_22_0 = stackOut_21_0;
                                break L5;
                              } else {
                                break L4;
                              }
                            } else {
                              this.field_c[this.field_g] = param0[param2 + var6];
                              this.field_g = (this.field_g - -1) % this.field_p;
                              stackOut_14_0 = this;
                              stackIn_22_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var8 != 0) {
                                break L5;
                              } else {
                                if (((hi) (this)).field_g == (-100 + this.field_p + this.field_b) % this.field_p) {
                                  throw new IOException();
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                          ((hi) (this)).field_d = this.field_e.a(3, param1 + -20, (Runnable) (this));
                          break L4;
                        }
                        this.notifyAll();
                        break L2;
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
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("hi.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.run();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!this.field_k) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= param2) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5_int = this.field_f.read(param3, param1, param2);
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 >= var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param2 = param2 - var5_int;
                        param1 = param1 + var5_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackOut_15_0 = (RuntimeException) (var5);
                    stackOut_15_1 = new StringBuilder().append("hi.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (param3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackOut_16_2 = "{...}";
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                        if (this.field_g == this.field_b) {
                          L4: {
                            if (this.field_k) {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          try {
                            L5: {
                              this.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              var4 = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L7: {
                        L8: {
                          if (this.field_g < this.field_b) {
                            break L8;
                          } else {
                            var1_int = -this.field_b + this.field_g;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = -this.field_b + this.field_p;
                        break L7;
                      }
                      var2 = this.field_b;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null == this.field_f) {
                            break L10;
                          } else {
                            this.field_f.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (this.field_n != null) {
                            this.field_n.close();
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (null != this.field_l) {
                            this.field_l.close();
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        break L9;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L13;
                      }
                    }
                    this.field_c = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L14: {
                          this.field_n.write(this.field_c, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_o = true;
                          break L15;
                        }
                      }
                      this.field_b = (var1_int + this.field_b) % this.field_p;
                      try {
                        L16: {
                          L17: {
                            if (this.field_b == this.field_g) {
                              this.field_n.flush();
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_o = true;
                          break L18;
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
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                af.a((Throwable) ((Object) var1_ref), -65, (String) null);
                break L19;
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
            if (!ArmiesOfGielinor.field_M) {
              break L0;
            } else {
              L2: {
                var1 = bp.field_e % 32;
                if (-1 != (var1 ^ -1)) {
                  break L2;
                } else {
                  var1 = 32;
                  break L2;
                }
              }
              mh.a(bp.field_e + -var1, (byte) -109);
              if (!param0) {
                return;
              } else {
                hi.b((byte) -114);
                return;
              }
            }
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
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
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
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        return;
                      }
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
