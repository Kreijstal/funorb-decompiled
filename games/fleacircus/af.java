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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new mk(false);
            var3.field_f = param1;
            var3.field_b = param2;
            if (param0 == 36) {
              stackIn_4_0 = (mk) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("af.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2) {
              L1: {
                if ((ib.field_k ^ -1) <= -11) {
                  if (wh.b(27415)) {
                    if (-1 != (bh.field_t ^ -1)) {
                      bg.a((byte) -66, param0);
                      break L1;
                    } else {
                      pd.a(param1, false, 0);
                      be.a(0, param0, (byte) -61, 0);
                      break L1;
                    }
                  } else {
                    gb.c();
                    hd.a(320, 240, -27794);
                    be.a(0, param0, (byte) -29, 0);
                    break L1;
                  }
                } else {
                  L2: {
                    var3_int = 0;
                    if (j.field_e) {
                      var3_int = 1;
                      j.field_e = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3_int != 0, (byte) -81);
                  break L1;
                }
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("af.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            qh var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = fleas.field_A ? 1 : 0;
            L0: while (true) {
              if (this.field_c) {
                return;
              } else {
                var2 = this.field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (qh) ((Object) this.field_e.a(-123));
                    if (var7 != null) {
                      this.field_d = this.field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_e.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if ((var7.field_B ^ -1) == -3) {
                          var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                          var7.field_q = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_B ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                            var7.field_q = false;
                            break L5;
                          }
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      ud.a((String) null, (Throwable) ((Object) var2_ref), 0);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_q = false;
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
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
        qh var6 = null;
        int var8 = 0;
        qh stackIn_8_0 = null;
        qh stackIn_16_0 = null;
        qh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qh stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new qh();
            var4.field_B = 1;
            var5 = this.field_e;
            synchronized (var5) {
              L1: {
                var6 = (qh) ((Object) this.field_e.b((byte) 105));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_j != (long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_A) {
                          break L3;
                        } else {
                          if (var6.field_B != 2) {
                            break L3;
                          } else {
                            var4.field_q = false;
                            var4.field_x = var6.field_x;
                            stackIn_8_0 = (qh) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (qh) ((Object) this.field_e.c((byte) 88));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_x = param1.a((byte) -90, param0);
              stackIn_16_0 = (qh) (var4);

              if (!param2) {
                stackIn_17_0 = (qh) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L4;
              } else {
                stackIn_17_0 = (qh) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L4;
              }
            }
            stackIn_17_0.field_v = stackIn_17_1 != 0;
            var4.field_q = false;
            stackIn_18_0 = (qh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("af.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(byte param0, qh param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("af.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 89) {
            CharSequence var2 = (CharSequence) null;
            af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = -param0 + param2;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                L2: {
                  if (param4 < -56) {
                    break L2;
                  } else {
                    field_f = (ce) null;
                    break L2;
                  }
                }
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(param0 + var7);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 != var8) {
                      if (8218 == var8) {
                        param1[var7 + param5] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param1[var7 + param5] = (byte)-125;
                          break L3;
                        } else {
                          if (8222 == var8) {
                            param1[param5 + var7] = (byte)-124;
                            break L3;
                          } else {
                            if (8230 == var8) {
                              param1[var7 + param5] = (byte)-123;
                              break L3;
                            } else {
                              if (var8 == 8224) {
                                param1[param5 + var7] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 != var8) {
                                  if (710 != var8) {
                                    if (8240 == var8) {
                                      param1[param5 + var7] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param1[var7 + param5] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param1[var7 + param5] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var8 == 8217) {
                                                  param1[param5 + var7] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param1[var7 + param5] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (8212 != var8) {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param1[var7 + param5] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var8 == 353) {
                                                                  param1[var7 + param5] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 == 339) {
                                                                      param1[var7 + param5] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 != 376) {
                                                                          param1[param5 - -var7] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param5 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[param5 + var7] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param1[var7 + param5] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param1[param5 + var7] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param1[param5 + var7] = (byte)-105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          param1[param5 - -var7] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      param1[var7 + param5] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param1[var7 + param5] = (byte)-109;
                                                    break L3;
                                                  }
                                                }
                                              }
                                            } else {
                                              param1[param5 + var7] = (byte)-114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param1[var7 + param5] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param1[param5 + var7] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param1[param5 + var7] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  param1[var7 + param5] = (byte)-121;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      param1[param5 + var7] = (byte)-128;
                      break L3;
                    }
                  }
                  param1[var7 + param5] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("af.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qh var6 = null;
        qh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_1_0 = (qh) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                af.a((byte) 74, 43, (String) null);
                break L1;
              }
            }
            var4.field_j = (long)param1;
            var4.field_B = 3;
            this.a((byte) 101, var4);
            stackIn_3_0 = (qh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("af.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        od var2 = null;
        this.field_e = new bf();
        this.field_c = false;
        this.field_d = 0;
        try {
            var2 = param0.a(4532, (Runnable) (this), 5);
            while (var2.field_b == 0) {
                vh.a(10L, -101);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}
