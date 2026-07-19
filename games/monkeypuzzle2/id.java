/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Runnable {
    static String field_h;
    private java.net.Socket field_j;
    private OutputStream field_b;
    static int field_a;
    private md field_f;
    private InputStream field_g;
    private ic field_d;
    private int field_l;
    static int field_m;
    private byte[] field_c;
    private int field_e;
    private boolean field_n;
    private boolean field_i;
    private int field_k;

    protected final void finalize() {
        this.a((byte) 73);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16840) {
            return 43;
        }
        if (!(!this.field_n)) {
            return 0;
        }
        return this.field_g.read();
    }

    final void a(byte param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (!this.field_n) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_n = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (this.field_d != null) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (this.field_d.field_g != 0) {
                        break L3;
                      } else {
                        em.a(1L, false);
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (1 == this.field_d.field_g) {
                      try {
                        L4: {
                          ((Thread) (this.field_d.field_b)).join();
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var2 = (InterruptedException) (Object) decompiledCaughtException;
                          this.field_d = null;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        this.field_d = null;
                        if (param0 == 73) {
                          return;
                        } else {
                          this.field_n = true;
                          return;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      this.field_d = null;
                      if (param0 == 73) {
                        return;
                      } else {
                        this.field_n = true;
                        return;
                      }
                    }
                  }
                  if (param0 == 73) {
                    return;
                  } else {
                    this.field_n = true;
                    return;
                  }
                }
              } else {
                this.field_d = null;
                if (param0 == 73) {
                  return;
                } else {
                  this.field_n = true;
                  return;
                }
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

    final void b(byte param0) throws IOException {
        if (!(!this.field_n)) {
            return;
        }
        if (!(!this.field_i)) {
            this.field_i = false;
            throw new IOException();
        }
        int var2 = 122 / ((-61 - param0) / 56);
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        PrintWriter var20 = null;
        StringWriter var21 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        PrintWriter var30 = null;
        StringWriter var31 = null;
        String var32 = null;
        BufferedReader var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        L0: {
          L1: {
            var13 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (param0 instanceof dd) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var14 = (dd) ((Object) param0);
          param0 = var14.field_b;
          var2 = var14.field_c + " | ";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        if (param1 == 37) {
          var21 = new StringWriter();
          var20 = new PrintWriter((Writer) ((Object) var21));
          param0.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
          var29 = var23.readLine();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          L2: while (true) {
            L3: {
              var24 = var23.readLine();
              var11 = var24;
              var2 = var11;
              var11 = var24;
              if (var24 == null) {
                var2 = var2 + "| " + var29;
                var11 = var2;
                var2 = var11;
                var11 = var2;
                break L3;
              } else {
                var9 = var24.indexOf('(');
                var10 = var24.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (0 == (var9 ^ -1)) {
                        break L5;
                      } else {
                        var11 = var24.substring(0, var9);
                        if (var13 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = var24;
                    var2 = var11;
                    var2 = var11;
                    break L4;
                  }
                  L6: {
                    var25 = var11.trim();
                    var2 = var25;
                    var2 = var25;
                    var26 = var25.substring(1 + var25.lastIndexOf(' '));
                    var2 = var26;
                    var2 = var26;
                    var27 = var26.substring(var26.lastIndexOf('\t') + 1);
                    var2 = var27;
                    var2 = var27;
                    var28 = var2 + var27;
                    var2 = var28;
                    var2 = var28;
                    var2 = var28;
                    if (var9 == -1) {
                      break L6;
                    } else {
                      if ((var10 ^ -1) != 0) {
                        var12 = var24.indexOf(".java:", var9);
                        if (-1 >= (var12 ^ -1)) {
                          var2 = var28 + var24.substring(5 + var12, var10);
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  continue L2;
                }
              }
            }
            return var2;
          }
        } else {
          field_h = (String) null;
          var31 = new StringWriter();
          var30 = new PrintWriter((Writer) ((Object) var31));
          param0.printStackTrace(var30);
          var30.close();
          var32 = var31.toString();
          var11 = var32;
          var2 = var11;
          var11 = var32;
          var33 = new BufferedReader((Reader) ((Object) new StringReader(var32)));
          var6 = var33;
          var39 = var33.readLine();
          var11 = var39;
          var2 = var11;
          var11 = var39;
          var7 = var39;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L7: while (true) {
            L8: {
              var34 = var33.readLine();
              var11 = var34;
              var2 = var11;
              var11 = var34;
              if (var34 == null) {
                var2 = var2 + "| " + var39;
                var11 = var2;
                var2 = var11;
                var11 = var2;
                break L8;
              } else {
                var9 = var34.indexOf('(');
                var10 = var34.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if (0 == (var9 ^ -1)) {
                        break L10;
                      } else {
                        var11 = var34.substring(0, var9);
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var11 = var34;
                    var2 = var11;
                    var2 = var11;
                    break L9;
                  }
                  L11: {
                    var35 = var11.trim();
                    var2 = var35;
                    var2 = var35;
                    var36 = var35.substring(1 + var35.lastIndexOf(' '));
                    var2 = var36;
                    var2 = var36;
                    var37 = var36.substring(var36.lastIndexOf('\t') + 1);
                    var2 = var37;
                    var2 = var37;
                    var38 = var2 + var37;
                    var2 = var38;
                    var2 = var38;
                    var2 = var38;
                    if (var9 == -1) {
                      break L11;
                    } else {
                      if ((var10 ^ -1) != 0) {
                        var12 = var34.indexOf(".java:", var9);
                        if (-1 >= (var12 ^ -1)) {
                          var2 = var38 + var34.substring(5 + var12, var10);
                          break L11;
                        } else {
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  continue L7;
                }
              }
            }
            return var2;
          }
        }
    }

    id(java.net.Socket param0, md param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_n) {
              if (!this.field_i) {
                L1: {
                  if (this.field_c != null) {
                    break L1;
                  } else {
                    this.field_c = new byte[this.field_k];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var6 >= param3) {
                              break L6;
                            } else {
                              this.field_c[this.field_e] = param0[var6 + param1];
                              this.field_e = (this.field_e - -1) % this.field_k;
                              var10 = this.field_e;
                              var9 = (-100 + (this.field_k + this.field_l)) % this.field_k;
                              if (var8 != 0) {
                                if (var9 >= var10) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                if (var9 == var10) {
                                  throw new IOException();
                                } else {
                                  var6++;
                                  if (var8 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            if (null == this.field_d) {
                              this.field_d = this.field_f.a((Runnable) (this), 3, 0);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (param2 >= 12) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        this.a((byte) 110);
                        break L4;
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_i = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("id.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 == 1) {
            return;
        }
        field_h = (String) null;
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_n) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_6_0 >= param0) {
                        break L4;
                      } else {
                        var5_int = this.field_g.read(param2, param3, param0);
                        var8 = var5_int ^ -1;
                        var7 = -1;
                        if (var6 != 0) {
                          if (var7 == var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 <= var8) {
                            throw new EOFException();
                          } else {
                            param0 = param0 - var5_int;
                            param3 = param3 + var5_int;
                            if (var6 == 0) {
                              stackOut_5_0 = 0;
                              stackIn_6_0 = stackOut_5_0;
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (param1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  this.a((byte) 64);
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
            String var7 = null;
            boolean stackIn_4_0 = false;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0 = false;
            int stackOut_11_0 = 0;
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        L4: {
                          if (this.field_e != this.field_l) {
                            break L4;
                          } else {
                            stackOut_3_0 = this.field_n;
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
                        stackOut_11_0 = this.field_l;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      }
                      L8: {
                        L9: {
                          var2 = stackIn_12_0;
                          if (this.field_e < this.field_l) {
                            break L9;
                          } else {
                            var1_int = this.field_e - this.field_l;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_int = this.field_k - this.field_l;
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
                          if (this.field_g == null) {
                            break L11;
                          } else {
                            this.field_g.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (this.field_b == null) {
                            break L12;
                          } else {
                            this.field_b.close();
                            break L12;
                          }
                        }
                        L13: {
                          if (null != this.field_j) {
                            this.field_j.close();
                            break L13;
                          } else {
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L15: {
                          this.field_b.write(this.field_c, var2, var1_int);
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
                      this.field_l = (this.field_l - -var1_int) % this.field_k;
                      try {
                        L17: {
                          L18: {
                            if (this.field_e != this.field_l) {
                              break L18;
                            } else {
                              this.field_b.flush();
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
                kk.a((String) null, (byte) 69, (Throwable) ((Object) var1_ref));
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
        int var2 = -80 % ((param0 - -42) / 38);
        if (this.field_n) {
            return 0;
        }
        return this.field_g.available();
    }

    private id(java.net.Socket param0, md param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_n = false;
        this.field_e = 0;
        this.field_i = false;
        try {
            this.field_j = param0;
            this.field_f = param1;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_g = this.field_j.getInputStream();
            this.field_b = this.field_j.getOutputStream();
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Type your password again to make sure it's correct";
        field_a = 250;
    }
}
