/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class af extends di {
    static String field_n;
    static kd field_o;
    private boolean field_p;
    private String field_m;

    public static void d(byte param0) {
        int var1 = -80 / ((0 - param0) / 46);
        field_n = null;
        field_o = null;
    }

    af(lb param0) {
        super(param0);
        ((af) this).field_p = false;
    }

    final ud a(int param0, String param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ud stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        ud stackIn_13_0 = null;
        ud stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_2_0 = null;
        ud stackOut_12_0 = null;
        ud stackOut_17_0 = null;
        ud stackOut_16_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param1;
            if (!pl.a(43, var4)) {
              stackOut_2_0 = ef.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 <= -106) {
                L1: {
                  if (!param1.equals((Object) (Object) ((af) this).field_m)) {
                    L2: {
                      var3 = kj.a(param1, 63);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null == var3.field_c) {
                          ((af) this).field_m = param1;
                          ((af) this).field_p = var3.field_e;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = tk.field_t;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (((af) this).field_p) {
                    stackOut_17_0 = TrackController.field_G;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = ef.field_b;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (ud) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("af.F(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    param0.getAppletContext().showDocument(of.a(param0, var2, false), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("af.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -9 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              gh.field_k = false;
              u.field_i = false;
              if (kb.field_a == null) {
                break L1;
              } else {
                if (!kb.field_a.field_E) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (param1 != 8) {
                      break L2;
                    } else {
                      L3: {
                        if (vg.field_o) {
                          param2 = vi.field_e;
                          break L3;
                        } else {
                          param2 = ba.field_d;
                          break L3;
                        }
                      }
                      param1 = 2;
                      ra.field_y.a((byte) 114, qg.field_c);
                      break L2;
                    }
                  }
                  L4: {
                    if (param1 == 10) {
                      pl.a(0);
                      var3_int = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!u.field_i) {
                          break L6;
                        } else {
                          param2 = dh.a((byte) -73, new String[1], od.field_b);
                          break L6;
                        }
                      }
                      L7: {
                        if (!pc.field_h) {
                          break L7;
                        } else {
                          param2 = cb.field_a;
                          break L7;
                        }
                      }
                      kb.field_a.a(param1, param2, -10);
                      break L5;
                    }
                  }
                  if (param1 == 256) {
                    break L1;
                  } else {
                    if (10 == param1) {
                      break L1;
                    } else {
                      if (vg.field_o) {
                        break L1;
                      } else {
                        ra.field_y.a((byte) 121);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              if (param0 < -60) {
                break L8;
              } else {
                field_n = null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("af.G(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nj var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            var3 = il.a(-67, var5);
            if (var3 == null) {
              L1: {
                if (!param0.equals((Object) (Object) ((af) this).field_m)) {
                  var4 = kj.a(param0, 63);
                  if (var4 != null) {
                    if (var4.field_c == null) {
                      ((af) this).field_m = param0;
                      ((af) this).field_p = var4.field_e;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 426) {
                  break L2;
                } else {
                  ((af) this).field_m = null;
                  break L2;
                }
              }
              if (((af) this).field_p) {
                stackOut_16_0 = qk.field_K;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = ga.field_f;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("af.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var7 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                if (wd.field_R) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                } else {
                  L1: {
                    if (param0 == 9819) {
                      break L1;
                    } else {
                      af.d((byte) 51);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      var2 = "tuhstatbut";
                      var3 = (String) sj.a((byte) -29, "getcookies", param1);
                      var4 = te.a(var3, ';', (byte) -46);
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4.length) {
                          break L2;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                break L4;
                              } else {
                                stackOut_11_0 = 1;
                                stackIn_12_0 = stackOut_11_0;
                                return stackIn_12_0 != 0;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.getParameter("tuhstatbut") == null) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L6;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var2_ref2;
                stackOut_20_1 = new StringBuilder().append("af.D(").append(param0).append(44);
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
            }
            return stackIn_19_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        if (param0) {
            ((af) this).a(true);
        }
        ((af) this).field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Highscores";
        field_o = null;
    }
}
