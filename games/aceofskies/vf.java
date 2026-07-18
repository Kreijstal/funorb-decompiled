/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private int field_f;
    static String[] field_l;
    private InputStream field_g;
    private int field_h;
    private boolean field_i;
    private OutputStream field_j;
    private boolean field_k;
    private en field_a;
    private rk field_e;
    private int field_c;
    private byte[] field_b;
    private java.net.Socket field_d;

    protected final void finalize() {
        try {
            ((vf) this).a(1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vf.finalize()");
        }
    }

    public static void c(byte param0) {
        try {
            field_l = null;
            if (param0 > -123) {
                field_l = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vf.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (((vf) this).field_k) {
              return;
            } else {
              if (((vf) this).field_i) {
                ((vf) this).field_i = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != ((vf) this).field_b) {
                    break L1;
                  } else {
                    ((vf) this).field_b = new byte[((vf) this).field_c];
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
                          if (~param0 >= ~var6) {
                            break L5;
                          } else {
                            ((vf) this).field_b[((vf) this).field_h] = param3[var6 + param1];
                            ((vf) this).field_h = (((vf) this).field_h - -1) % ((vf) this).field_c;
                            stackOut_15_0 = ~((vf) this).field_h;
                            stackOut_15_1 = ~((((vf) this).field_f + ((vf) this).field_c + -100) % ((vf) this).field_c);
                            stackIn_27_0 = stackOut_15_0;
                            stackIn_27_1 = stackOut_15_1;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if (stackIn_16_0 != stackIn_16_1) {
                                var6++;
                                if (var8 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        }
                        L6: {
                          if (null == ((vf) this).field_a) {
                            ((vf) this).field_a = ((vf) this).field_e.a(3, 1048576, (Runnable) this);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.notifyAll();
                        stackOut_26_0 = 44;
                        stackOut_26_1 = (param2 - -35) / 56;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L4;
                      }
                      var6 = stackIn_27_0 / stackIn_27_1;
                      break L2;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5;
            stackOut_32_1 = new StringBuilder().append("vf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            RuntimeException var1_ref2 = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            boolean stackIn_4_0 = false;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0 = false;
            int stackOut_12_0 = 0;
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: while (true) {
                      var3_ref = this;
                      synchronized (var3_ref) {
                        L3: {
                          L4: {
                            L5: {
                              if (((vf) this).field_f != ((vf) this).field_h) {
                                break L5;
                              } else {
                                stackOut_3_0 = ((vf) this).field_k;
                                stackIn_13_0 = stackOut_3_0 ? 1 : 0;
                                stackIn_4_0 = stackOut_3_0;
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (!stackIn_4_0) {
                                      break L6;
                                    } else {
                                      if (var6 == 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  {
                                    L7: {
                                      this.wait();
                                      break L7;
                                    }
                                  }
                                  break L5;
                                }
                              }
                            }
                            stackOut_12_0 = ~((vf) this).field_f;
                            stackIn_13_0 = stackOut_12_0;
                            break L4;
                          }
                          L9: {
                            L10: {
                              if (stackIn_13_0 >= ~((vf) this).field_h) {
                                break L10;
                              } else {
                                var1_int = ((vf) this).field_c + -((vf) this).field_f;
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var1_int = -((vf) this).field_f + ((vf) this).field_h;
                            break L9;
                          }
                          var2 = ((vf) this).field_f;
                          decompiledRegionSelector0 = 1;
                          break L3;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        try {
                          L11: {
                            L12: {
                              if (null == ((vf) this).field_g) {
                                break L12;
                              } else {
                                ((vf) this).field_g.close();
                                break L12;
                              }
                            }
                            L13: {
                              if (((vf) this).field_j == null) {
                                break L13;
                              } else {
                                ((vf) this).field_j.close();
                                break L13;
                              }
                            }
                            L14: {
                              if (((vf) this).field_d != null) {
                                ((vf) this).field_d.close();
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            break L11;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L15: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L15;
                          }
                        }
                        ((vf) this).field_b = null;
                        break L1;
                      } else {
                        L16: {
                          if (var1_int > 0) {
                            try {
                              L17: {
                                ((vf) this).field_j.write(((vf) this).field_b, var2, var1_int);
                                break L17;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L18: {
                                var3 = (IOException) (Object) decompiledCaughtException;
                                ((vf) this).field_i = true;
                                break L18;
                              }
                            }
                            ((vf) this).field_f = (var1_int + ((vf) this).field_f) % ((vf) this).field_c;
                            try {
                              L19: {
                                L20: {
                                  if (((vf) this).field_h != ((vf) this).field_f) {
                                    break L20;
                                  } else {
                                    ((vf) this).field_j.flush();
                                    break L20;
                                  }
                                }
                                break L19;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter3) {
                              decompiledCaughtException = decompiledCaughtParameter3;
                              L21: {
                                var3 = (IOException) (Object) decompiledCaughtException;
                                ((vf) this).field_i = true;
                                break L21;
                              }
                            }
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L22: {
                    var1_ref = (Exception) (Object) decompiledCaughtException;
                    v.a((String) null, (byte) -52, (Throwable) (Object) var1_ref);
                    break L22;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw pn.a((Throwable) (Object) var1_ref2, "vf.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(long param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        String stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        String stackOut_31_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0L >= param0) {
                break L1;
              } else {
                if (param0 >= 6582952005840035281L) {
                  break L1;
                } else {
                  if (param0 % 37L == 0L) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (String) (Object) stackIn_13_0;
                  } else {
                    if (param1 == 28304) {
                      var3_int = 0;
                      var4 = param0;
                      L2: while (true) {
                        L3: {
                          if (0L == var4) {
                            break L3;
                          } else {
                            var4 = var4 / 37L;
                            var3_int++;
                            if (var11 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var6 = new StringBuilder(var3_int);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (param0 == 0L) {
                                break L6;
                              } else {
                                var7 = param0;
                                param0 = param0 / 37L;
                                var9 = ou.field_n[(int)(var7 + -(param0 * 37L))];
                                if (var11 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var9 == 95) {
                                      var10 = -1 + var6.length();
                                      var9 = 160;
                                      var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  StringBuilder discarded$2 = var6.append((char) var9);
                                  if (var11 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            StringBuilder discarded$3 = var6.reverse();
                            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                            break L5;
                          }
                          stackOut_31_0 = var6.toString();
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = null;
            stackIn_8_0 = stackOut_7_0;
            return (String) (Object) stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "vf.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_32_0;
    }

    final int a(byte param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!((vf) this).field_k) {
              var2_int = 60 / ((param0 - 26) / 55);
              stackOut_4_0 = ((vf) this).field_g.read();
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "vf.E(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    final int b(int param0) throws IOException {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!((vf) this).field_k) {
              L1: {
                if (param0 < -110) {
                  break L1;
                } else {
                  ((vf) this).finalize();
                  break L1;
                }
              }
              stackOut_7_0 = ((vf) this).field_g.available();
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "vf.D(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final void b(byte param0) throws IOException {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((vf) this).field_k) {
              return;
            } else {
              if (!((vf) this).field_i) {
                L1: {
                  if (param0 > 56) {
                    break L1;
                  } else {
                    ((vf) this).run();
                    break L1;
                  }
                }
                break L0;
              } else {
                ((vf) this).field_i = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "vf.A(" + param0 + ')');
        }
    }

    vf(java.net.Socket param0, rk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!((vf) this).field_k) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  ((vf) this).field_k = true;
                  this.notifyAll();
                  break L1;
                }
              }
              L2: {
                if (null != ((vf) this).field_a) {
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (((vf) this).field_a.field_a != 0) {
                          break L5;
                        } else {
                          wf.a(1L, false);
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (1 == ((vf) this).field_a.field_a) {
                        try {
                          L6: {
                            ((Thread) ((vf) this).field_a.field_f).join();
                            decompiledRegionSelector0 = 0;
                            break L6;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L7: {
                            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L7;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L4;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L8: {
                ((vf) this).field_a = null;
                if (param0 == 1) {
                  break L8;
                } else {
                  vf.c((byte) -69);
                  break L8;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "vf.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                ((vf) this).field_k = false;
                break L1;
              }
            }
            if (((vf) this).field_k) {
              return;
            } else {
              L2: while (true) {
                L3: {
                  L4: {
                    if (0 >= param1) {
                      break L4;
                    } else {
                      var5_int = ((vf) this).field_g.read(param2, param0, param1);
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (var5_int > 0) {
                          param1 = param1 - var5_int;
                          param0 = param0 + var5_int;
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          throw new EOFException();
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
    }

    private vf(java.net.Socket param0, rk param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((vf) this).field_i = false;
        ((vf) this).field_k = false;
        ((vf) this).field_f = 0;
        ((vf) this).field_h = 0;
        try {
          L0: {
            ((vf) this).field_e = param1;
            ((vf) this).field_d = param0;
            ((vf) this).field_d.setSoTimeout(30000);
            ((vf) this).field_d.setTcpNoDelay(true);
            ((vf) this).field_g = ((vf) this).field_d.getInputStream();
            ((vf) this).field_j = ((vf) this).field_d.getOutputStream();
            ((vf) this).field_c = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vf.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
