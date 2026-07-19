/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af implements Runnable {
    private bf field_e;
    static ce field_f;
    static String field_a;
    static int field_b;
    private boolean field_c;
    static int field_g;
    private Thread field_h;
    int field_d;

    final static mk a(byte param0, int param1, String param2) {
        mk var3 = null;
        RuntimeException var3_ref = null;
        mk stackIn_2_0 = null;
        mk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_3_0 = null;
        mk stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new mk(false);
            var3.field_f = param1;
            var3.field_b = param2;
            if (param0 == 36) {
              stackOut_3_0 = (mk) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (mk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("af.J(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2) {
              L1: {
                L2: {
                  if ((ib.field_k ^ -1) <= -11) {
                    break L2;
                  } else {
                    L3: {
                      var3_int = 0;
                      if (j.field_e) {
                        var3_int = 1;
                        j.field_e = false;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3_int != 0, (byte) -81);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (wh.b(27415)) {
                    break L4;
                  } else {
                    gb.c();
                    hd.a(320, 240, -27794);
                    be.a(0, param0, (byte) -29, 0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-1 != (bh.field_t ^ -1)) {
                    break L5;
                  } else {
                    pd.a(param1, false, 0);
                    be.a(0, param0, (byte) -61, 0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                bg.a((byte) -66, param0);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("af.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            boolean discarded$2 = false;
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Object var2_ref2 = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            qh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = fleas.field_A ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_c) {
                  break L1;
                } else {
                  var2_ref2 = this.field_e;
                  synchronized (var2_ref2) {
                    L2: {
                      var7 = (qh) ((Object) this.field_e.a(-123));
                      if (var5 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        L3: {
                          if (var7 != null) {
                            break L3;
                          } else {
                            try {
                              L4: {
                                this.field_e.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            if (var5 == 0) {
                              decompiledRegionSelector0 = 1;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.field_d = this.field_d - 1;
                        decompiledRegionSelector0 = 2;
                        break L2;
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L1;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      continue L0;
                    } else {
                      try {
                        L6: {
                          L7: {
                            L8: {
                              if ((var7.field_B ^ -1) == -3) {
                                break L8;
                              } else {
                                if (-4 != (var7.field_B ^ -1)) {
                                  break L7;
                                } else {
                                  var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                                  if (var5 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            discarded$2 = var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                            break L7;
                          }
                          break L6;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2_ref = (Exception) (Object) decompiledCaughtException;
                          var6 = (String) null;
                          ud.a((String) null, (Throwable) ((Object) var2_ref), 0);
                          break L9;
                        }
                      }
                      var7.field_q = false;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qh a(int param0, ah param1, boolean param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        qh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        qh stackIn_5_0 = null;
        qh stackIn_9_0 = null;
        qh stackIn_16_0 = null;
        qh stackIn_17_0 = null;
        qh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qh stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        qh stackOut_4_0 = null;
        qh stackOut_8_0 = null;
        qh stackOut_15_0 = null;
        qh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qh stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new qh();
            var4.field_B = 1;
            var5_ref = this.field_e;
            synchronized (var5_ref) {
              L1: {
                var6 = (qh) ((Object) this.field_e.b((byte) 105));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackOut_4_0 = (qh) (var6);
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0.field_j != (long)param0) {
                            break L4;
                          } else {
                            if (param1 != var6.field_A) {
                              break L4;
                            } else {
                              if (var6.field_B != 2) {
                                break L4;
                              } else {
                                var4.field_q = false;
                                var4.field_x = var6.field_x;
                                stackOut_8_0 = (qh) (var4);
                                stackIn_9_0 = stackOut_8_0;
                                return stackIn_9_0;
                              }
                            }
                          }
                        }
                        var6 = (qh) ((Object) this.field_e.c((byte) 88));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            }
            L5: {
              if (decompiledRegionSelector0 == 0) {
                break L5;
              } else {
                L6: {
                  var4.field_x = param1.a((byte) -90, param0);
                  stackOut_15_0 = (qh) (var4);
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (!param2) {
                    stackOut_17_0 = (qh) ((Object) stackIn_17_0);
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L6;
                  } else {
                    stackOut_16_0 = (qh) ((Object) stackIn_16_0);
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L6;
                  }
                }
                stackIn_18_0.field_v = stackIn_18_1 != 0;
                var4.field_q = false;
                stackOut_18_0 = (qh) (var4);
                stackIn_19_0 = stackOut_18_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4_ref);
            stackOut_20_1 = new StringBuilder().append("af.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(byte param0, qh param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = this.field_e;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_e.a(param1, param0 ^ -1089421913);
                  if (param0 == 101) {
                    break L2;
                  } else {
                    field_g = -128;
                    break L2;
                  }
                }
                this.field_d = this.field_d + 1;
                this.field_e.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("af.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_a = null;
        if (param0 < 89) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = -param0 + param2;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 >= var6_int) {
                    break L3;
                  } else {
                    var8 = param3.charAt(param0 + var7);
                    stackOut_3_0 = var8;
                    stackIn_96_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 <= 0) {
                              break L6;
                            } else {
                              if (128 > var8) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var8 < 160) {
                              break L7;
                            } else {
                              if (var8 <= 255) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (8364 != var8) {
                              break L8;
                            } else {
                              param1[param5 + var7] = (byte)-128;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (8218 == var8) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 == 402) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (8222 == var8) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (8230 == var8) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var8 == 8224) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (8225 != var8) {
                                                  break L14;
                                                } else {
                                                  param1[var7 + param5] = (byte)-121;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L15: {
                                                if (710 != var8) {
                                                  break L15;
                                                } else {
                                                  param1[param5 + var7] = (byte)-120;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              L16: {
                                                if (8240 == var8) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (var8 != 352) {
                                                      break L17;
                                                    } else {
                                                      param1[param5 + var7] = (byte)-118;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L18: {
                                                    if (var8 != 8249) {
                                                      break L18;
                                                    } else {
                                                      param1[var7 + param5] = (byte)-117;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  L19: {
                                                    if (var8 == 338) {
                                                      break L19;
                                                    } else {
                                                      L20: {
                                                        if (var8 != 381) {
                                                          break L20;
                                                        } else {
                                                          param1[param5 + var7] = (byte)-114;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      L21: {
                                                        if (var8 == 8216) {
                                                          break L21;
                                                        } else {
                                                          L22: {
                                                            if (var8 == 8217) {
                                                              break L22;
                                                            } else {
                                                              L23: {
                                                                if (var8 != 8220) {
                                                                  break L23;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-109;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L23;
                                                                  }
                                                                }
                                                              }
                                                              L24: {
                                                                if (var8 != 8221) {
                                                                  break L24;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-108;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              L25: {
                                                                if (var8 == 8226) {
                                                                  break L25;
                                                                } else {
                                                                  L26: {
                                                                    if (var8 != 8211) {
                                                                      break L26;
                                                                    } else {
                                                                      param1[param5 - -var7] = (byte)-106;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  L27: {
                                                                    if (8212 != var8) {
                                                                      break L27;
                                                                    } else {
                                                                      param1[param5 + var7] = (byte)-105;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  L28: {
                                                                    if (var8 != 732) {
                                                                      break L28;
                                                                    } else {
                                                                      param1[param5 + var7] = (byte)-104;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    }
                                                                  }
                                                                  L29: {
                                                                    if (var8 == 8482) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if (var8 == 353) {
                                                                          break L30;
                                                                        } else {
                                                                          L31: {
                                                                            if (var8 != 8250) {
                                                                              break L31;
                                                                            } else {
                                                                              param1[var7 + param5] = (byte)-101;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          L32: {
                                                                            if (var8 == 339) {
                                                                              break L32;
                                                                            } else {
                                                                              L33: {
                                                                                if (var8 != 382) {
                                                                                  break L33;
                                                                                } else {
                                                                                  param1[param5 + var7] = (byte)-98;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L34: {
                                                                                if (var8 != 376) {
                                                                                  break L34;
                                                                                } else {
                                                                                  param1[param5 - -var7] = (byte)-97;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L34;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param1[param5 - -var7] = (byte)63;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          param1[var7 + param5] = (byte)-100;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      param1[var7 + param5] = (byte)-102;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  param1[var7 + param5] = (byte)-103;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              param1[var7 + param5] = (byte)-107;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L22;
                                                              }
                                                            }
                                                          }
                                                          param1[param5 + var7] = (byte)-110;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      param1[var7 + param5] = (byte)-111;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  param1[var7 + param5] = (byte)-116;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              param1[param5 + var7] = (byte)-119;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          param1[param5 + var7] = (byte)-122;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      param1[var7 + param5] = (byte)-123;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param1[param5 + var7] = (byte)-124;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param1[var7 + param5] = (byte)-125;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param1[var7 + param5] = (byte)-126;
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        param1[var7 + param5] = (byte)var8;
                        break L4;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_95_0 = param4;
                stackIn_96_0 = stackOut_95_0;
                break L2;
              }
              L35: {
                if (stackIn_96_0 < -56) {
                  break L35;
                } else {
                  field_f = (ce) null;
                  break L35;
                }
              }
              stackOut_98_0 = var6_int;
              stackIn_99_0 = stackOut_98_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var6 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var6);
            stackOut_100_1 = new StringBuilder().append("af.A(").append(param0).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L36;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L36;
            }
          }
          L37: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param2).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L37;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L37;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_99_0;
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qh var6 = null;
        qh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = 116 % ((26 - param0) / 42);
            var6 = new qh();
            var6.field_x = param3;
            var6.field_j = (long)param1;
            var6.field_v = false;
            var6.field_A = param2;
            var6.field_B = 2;
            this.a((byte) 101, var6);
            stackOut_0_0 = (qh) (var6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5);
            stackOut_2_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final qh a(int param0, int param1, ah param2) {
        mk discarded$2 = null;
        qh var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_2_0 = null;
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
              var4 = new qh();
              var4.field_v = false;
              var4.field_A = param2;
              if (param0 >= 111) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = af.a((byte) 74, 43, (String) null);
                break L1;
              }
            }
            var4.field_j = (long)param1;
            var4.field_B = 3;
            this.a((byte) 101, var4);
            stackOut_2_0 = (qh) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("af.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, boolean param1, String param2, byte param3) {
        try {
            if (param3 <= 26) {
                field_b = 37;
            }
            aa.field_s = param2;
            jk.field_j = param0;
            wf.a(ll.field_o, false, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        try {
            this.field_c = param0 ? true : false;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
            }
            try {
                this.field_h.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(ce param0) {
        RuntimeException runtimeException = null;
        od var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = fleas.field_A ? 1 : 0;
        this.field_e = new bf();
        this.field_c = false;
        this.field_d = 0;
        try {
          L0: {
            var2 = param0.a(4532, (Runnable) (this), 5);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2.field_b != 0) {
                    break L3;
                  } else {
                    vh.a(10L, -101);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2.field_b != 2) {
                  this.field_h = (Thread) (var2.field_e);
                  break L0;
                } else {
                  break L2;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("af.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}
