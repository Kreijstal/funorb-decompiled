/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Frame;
import java.applet.Applet;

final class sk implements Runnable {
    private DataInputStream field_b;
    private int field_g;
    private java.net.URL field_c;
    private od field_e;
    private ni field_d;
    private ce field_f;
    private od field_h;
    private od field_a;

    final ni a(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        ni stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ni stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 >= 83) {
              if (((sk) this).field_g != 3) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((sk) this).field_d;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ni) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "sk.C(" + param0 + ')');
        }
        return (ni) (Object) stackIn_7_0;
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        RuntimeException var2_ref = null;
        java.net.Socket var2_ref2 = null;
        OutputStream var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((sk) this).field_g < 2) {
              L1: {
                if (((sk) this).field_g == 0) {
                  L2: {
                    if (((sk) this).field_h != null) {
                      break L2;
                    } else {
                      ((sk) this).field_h = ((sk) this).field_f.a(((sk) this).field_c, -34);
                      break L2;
                    }
                  }
                  if (((sk) this).field_h.field_b != 0) {
                    if (1 == ((sk) this).field_h.field_b) {
                      break L1;
                    } else {
                      ((sk) this).field_h = null;
                      ((sk) this).field_g = ((sk) this).field_g + 1;
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (param0 > 41) {
                  break L3;
                } else {
                  ((sk) this).field_c = null;
                  break L3;
                }
              }
              L4: {
                if (1 == ((sk) this).field_g) {
                  L5: {
                    if (null == ((sk) this).field_e) {
                      ((sk) this).field_e = ((sk) this).field_f.a(443, (byte) 32, ((sk) this).field_c.getHost());
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (0 != ((sk) this).field_e.field_b) {
                    if (((sk) this).field_e.field_b != 1) {
                      ((sk) this).field_e = null;
                      ((sk) this).field_g = ((sk) this).field_g + 1;
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    } else {
                      break L4;
                    }
                  } else {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (((sk) this).field_b != null) {
                  break L6;
                } else {
                  try {
                    L7: {
                      L8: {
                        if (((sk) this).field_g == 0) {
                          ((sk) this).field_b = (DataInputStream) ((sk) this).field_h.field_e;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (1 == ((sk) this).field_g) {
                          var2_ref2 = (java.net.Socket) ((sk) this).field_e.field_e;
                          var2_ref2.setSoTimeout(10000);
                          var3 = var2_ref2.getOutputStream();
                          var3.write(17);
                          var3.write(ea.a(-18428, (CharSequence) (Object) ("JAGGRAB " + ((sk) this).field_c.getFile() + "\n\n")));
                          ((sk) this).field_b = new DataInputStream(var2_ref2.getInputStream());
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ((sk) this).field_d.field_i = 0;
                      break L7;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L10: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      ((sk) this).finalize();
                      ((sk) this).field_g = ((sk) this).field_g + 1;
                      break L10;
                    }
                  }
                  break L6;
                }
              }
              L11: {
                if (((sk) this).field_a != null) {
                  break L11;
                } else {
                  ((sk) this).field_a = ((sk) this).field_f.a(4532, (Runnable) this, 5);
                  break L11;
                }
              }
              if (((sk) this).field_a.field_b != 0) {
                L12: {
                  if (((sk) this).field_a.field_b != 1) {
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L0;
              } else {
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                return stackIn_50_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "sk.E(" + param0 + ')');
        }
        return stackIn_56_0 != 0;
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
            return;
        }
        try {
            System.out.println("Error: " + tj.a("%0a", param1, "\n", (byte) -66));
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = ed.field_c;
              var2 = 0;
              var3 = var1.length;
              if (param0 <= -75) {
                break L1;
              } else {
                sk.a(-77, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3 >= ~var2) {
                    break L4;
                  } else {
                    int incrementValue$16 = var2;
                    var2++;
                    var1[incrementValue$16] = 0;
                    int incrementValue$17 = var2;
                    var2++;
                    var1[incrementValue$17] = 0;
                    int incrementValue$18 = var2;
                    var2++;
                    var1[incrementValue$18] = 0;
                    int incrementValue$19 = var2;
                    var2++;
                    var1[incrementValue$19] = 0;
                    int incrementValue$20 = var2;
                    var2++;
                    var1[incrementValue$20] = 0;
                    int incrementValue$21 = var2;
                    var2++;
                    var1[incrementValue$21] = 0;
                    int incrementValue$22 = var2;
                    var2++;
                    var1[incrementValue$22] = 0;
                    int incrementValue$23 = var2;
                    var2++;
                    var1[incrementValue$23] = 0;
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
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "sk.D(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            RuntimeException var1_ref2 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_3_0 = 0;
            int stackIn_3_1 = 0;
            int stackIn_10_0 = 0;
            int stackIn_10_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_2_1 = 0;
            int stackOut_9_0 = 0;
            int stackOut_9_1 = 0;
            var4 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (((sk) this).field_d.field_i >= ((sk) this).field_d.field_k.length) {
                            break L4;
                          } else {
                            var1_int = ((sk) this).field_b.read(((sk) this).field_d.field_k, ((sk) this).field_d.field_i, -((sk) this).field_d.field_i + ((sk) this).field_d.field_k.length);
                            stackOut_2_0 = 0;
                            stackOut_2_1 = var1_int;
                            stackIn_10_0 = stackOut_2_0;
                            stackIn_10_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              if (stackIn_3_0 > stackIn_3_1) {
                                break L4;
                              } else {
                                ((sk) this).field_d.field_i = ((sk) this).field_d.field_i + var1_int;
                                if (var4 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        stackOut_9_0 = ((sk) this).field_d.field_i;
                        stackOut_9_1 = ((sk) this).field_d.field_k.length;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L3;
                      }
                      if (stackIn_10_0 == stackIn_10_1) {
                        throw sk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((sk) this).field_d.field_k.length + " " + (Object) (Object) ((sk) this).field_c));
                      } else {
                        var1 = this;
                        synchronized (var1) {
                          L5: {
                            ((sk) this).finalize();
                            ((sk) this).field_g = 3;
                            break L5;
                          }
                        }
                        break L1;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var1_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref = this;
                    synchronized (var2_ref) {
                      L7: {
                        ((sk) this).finalize();
                        ((sk) this).field_g = ((sk) this).field_g + 1;
                        break L7;
                      }
                    }
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw pf.a((Throwable) (Object) var1_ref2, "sk.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Container a(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        java.applet.Applet stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Frame stackOut_3_0 = null;
        java.applet.Applet stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (cb.field_t != null) {
              stackOut_3_0 = cb.field_t;
              stackIn_4_0 = stackOut_3_0;
              return (java.awt.Container) (Object) stackIn_4_0;
            } else {
              if (param0 > 19) {
                stackOut_8_0 = rl.a((byte) -117);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (java.awt.Container) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "sk.B(" + param0 + ')');
        }
        return (java.awt.Container) (Object) stackIn_9_0;
    }

    sk(ce param0, java.net.URL param1, int param2) {
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
        try {
          L0: {
            ((sk) this).field_f = param0;
            ((sk) this).field_c = param1;
            ((sk) this).field_d = new ni(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sk.<init>(");
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, qc param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            id.field_c = param5;
            if (param3 == 443) {
              ae.field_c = param2;
              ge.field_h = param0;
              qg.field_b = param1;
              ub.field_a = param4;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("sk.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
        }
    }

    protected final void finalize() {
        Exception exception = null;
        RuntimeException var1 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((sk) this).field_h) {
                L2: {
                  if (((sk) this).field_h.field_e != null) {
                    try {
                      L3: {
                        ((DataInputStream) ((sk) this).field_h.field_e).close();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((sk) this).field_h = null;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (((sk) this).field_e != null) {
                L6: {
                  if (((sk) this).field_e.field_e != null) {
                    try {
                      L7: {
                        ((java.net.Socket) ((sk) this).field_e.field_e).close();
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L8;
                      }
                    }
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((sk) this).field_e = null;
                break L5;
              } else {
                break L5;
              }
            }
            L9: {
              if (null == ((sk) this).field_b) {
                break L9;
              } else {
                try {
                  L10: {
                    ((sk) this).field_b.close();
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                ((sk) this).field_b = null;
                break L9;
              }
            }
            ((sk) this).field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "sk.finalize()");
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
