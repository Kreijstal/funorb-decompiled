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
        var3 = new mk(false);
        var3.field_f = param1;
        var3.field_b = param2;
        if (param0 != 36) {
          return null;
        } else {
          return var3;
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (!param2) {
          return;
        } else {
          L0: {
            if ((ib.field_k ^ -1) <= -11) {
              if (wh.b(27415)) {
                if (-1 != (bh.field_t ^ -1)) {
                  bg.a((byte) -66, param0);
                  break L0;
                } else {
                  pd.a(param1, false, 0);
                  be.a(0, param0, (byte) -61, 0);
                  break L0;
                }
              } else {
                gb.c();
                hd.a(320, 240, -27794);
                be.a(0, param0, (byte) -29, 0);
                break L0;
              }
            } else {
              L1: {
                var3 = 0;
                if (j.field_e) {
                  var3 = 1;
                  j.field_e = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3 != 0, (byte) -81);
              break L0;
            }
          }
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            qh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = fleas.field_A ? 1 : 0;
            L0: while (true) {
              if (((af) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((af) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (qh) (Object) ((af) this).field_e.a(-123);
                    if (var7 != null) {
                      ((af) this).field_d = ((af) this).field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          ((Object) (Object) ((af) this).field_e).wait();
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
                          boolean discarded$1 = var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                          break L5;
                        } else {
                          if (-4 != (var7.field_B ^ -1)) {
                            break L5;
                          } else {
                            var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      ud.a((String) null, (Throwable) (Object) var2_ref, 0);
                      break L6;
                    }
                  }
                  var7.field_q = false;
                  continue L0;
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
        Object var5 = null;
        qh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        qh stackIn_7_0 = null;
        qh stackIn_14_0 = null;
        qh stackIn_15_0 = null;
        qh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Throwable decompiledCaughtException = null;
        qh stackOut_6_0 = null;
        qh stackOut_13_0 = null;
        qh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var4 = new qh();
        var4.field_B = 1;
        var5 = (Object) (Object) ((af) this).field_e;
        synchronized (var5) {
          L0: {
            var6 = (qh) (Object) ((af) this).field_e.b((byte) 105);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (var6.field_j != (long)param0) {
                    break L2;
                  } else {
                    if (param1 != var6.field_A) {
                      break L2;
                    } else {
                      if (var6.field_B != 2) {
                        break L2;
                      } else {
                        var4.field_q = false;
                        var4.field_x = var6.field_x;
                        stackOut_6_0 = (qh) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (qh) (Object) ((af) this).field_e.c((byte) 88);
                continue L1;
              }
            }
          }
        }
        L3: {
          var4.field_x = param1.a((byte) -90, param0);
          stackOut_13_0 = (qh) var4;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if (!param2) {
            stackOut_15_0 = (qh) (Object) stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L3;
          } else {
            stackOut_14_0 = (qh) (Object) stackIn_14_0;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L3;
          }
        }
        stackIn_16_0.field_v = stackIn_16_1 != 0;
        var4.field_q = false;
        return var4;
    }

    private final void a(byte param0, qh param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((af) this).field_e;
        synchronized (var3) {
          L0: {
            L1: {
              ((af) this).field_e.a((pa) (Object) param1, param0 ^ -1089421913);
              if (param0 == 101) {
                break L1;
              } else {
                field_g = -128;
                break L1;
              }
            }
            ((af) this).field_d = ((af) this).field_d + 1;
            ((Object) (Object) ((af) this).field_e).notifyAll();
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 89) {
            Object var2 = null;
            int discarded$0 = af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        var6 = -param0 + param2;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param3.charAt(param0 + var7);
                    if (var8 <= 0) {
                      break L4;
                    } else {
                      if (128 > var8) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
                      break L5;
                    } else {
                      if (var8 <= 255) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (8364 != var8) {
                      break L6;
                    } else {
                      param1[param5 + var7] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (8218 == var8) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 == 402) {
                          break L8;
                        } else {
                          L9: {
                            if (8222 == var8) {
                              break L9;
                            } else {
                              L10: {
                                if (8230 == var8) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var8 == 8224) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (8225 != var8) {
                                          break L12;
                                        } else {
                                          param1[var7 + param5] = (byte)-121;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (710 != var8) {
                                          break L13;
                                        } else {
                                          param1[param5 + var7] = (byte)-120;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L14: {
                                        if (8240 == var8) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (var8 != 352) {
                                              break L15;
                                            } else {
                                              param1[param5 + var7] = (byte)-118;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var8 != 8249) {
                                              break L16;
                                            } else {
                                              param1[var7 + param5] = (byte)-117;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (var8 == 338) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (var8 != 381) {
                                                  break L18;
                                                } else {
                                                  param1[param5 + var7] = (byte)-114;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              L19: {
                                                if (var8 == 8216) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (var8 == 8217) {
                                                      break L20;
                                                    } else {
                                                      L21: {
                                                        if (var8 != 8220) {
                                                          break L21;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-109;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if (var8 != 8221) {
                                                          break L22;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-108;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      L23: {
                                                        if (var8 == 8226) {
                                                          break L23;
                                                        } else {
                                                          L24: {
                                                            if (var8 != 8211) {
                                                              break L24;
                                                            } else {
                                                              param1[param5 - -var7] = (byte)-106;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          L25: {
                                                            if (8212 != var8) {
                                                              break L25;
                                                            } else {
                                                              param1[param5 + var7] = (byte)-105;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if (var8 != 732) {
                                                              break L26;
                                                            } else {
                                                              param1[param5 + var7] = (byte)-104;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if (var8 == 8482) {
                                                              break L27;
                                                            } else {
                                                              L28: {
                                                                if (var8 == 353) {
                                                                  break L28;
                                                                } else {
                                                                  L29: {
                                                                    if (var8 != 8250) {
                                                                      break L29;
                                                                    } else {
                                                                      param1[var7 + param5] = (byte)-101;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  L30: {
                                                                    if (var8 == 339) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (var8 != 382) {
                                                                          break L31;
                                                                        } else {
                                                                          param1[param5 + var7] = (byte)-98;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      L32: {
                                                                        if (var8 != 376) {
                                                                          break L32;
                                                                        } else {
                                                                          param1[param5 - -var7] = (byte)-97;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      param1[param5 - -var7] = (byte)63;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  param1[var7 + param5] = (byte)-100;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              param1[var7 + param5] = (byte)-102;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          param1[var7 + param5] = (byte)-103;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      param1[var7 + param5] = (byte)-107;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  param1[param5 + var7] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              param1[var7 + param5] = (byte)-111;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param1[var7 + param5] = (byte)-116;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      param1[param5 + var7] = (byte)-119;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param1[param5 + var7] = (byte)-122;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param1[var7 + param5] = (byte)-123;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param1[param5 + var7] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param1[var7 + param5] = (byte)-125;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1[var7 + param5] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param1[var7 + param5] = (byte)var8;
                break L2;
              }
              var7++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L33: {
            if (param4 < -56) {
              break L33;
            } else {
              field_f = null;
              break L33;
            }
          }
          return var6;
        }
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5 = 116 % ((26 - param0) / 42);
        qh var6 = new qh();
        var6.field_x = param3;
        var6.field_j = (long)param1;
        var6.field_v = false;
        var6.field_A = param2;
        var6.field_B = 2;
        this.a((byte) 101, var6);
        return var6;
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = new qh();
        var4.field_v = false;
        var4.field_A = param2;
        if (param0 < 111) {
            Object var5 = null;
            mk discarded$0 = af.a((byte) 74, 43, (String) null);
        }
        var4.field_j = (long)param1;
        var4.field_B = 3;
        this.a((byte) 101, var4);
        return var4;
    }

    final static void a(String param0, boolean param1, String param2, byte param3) {
        if (param3 <= 26) {
            field_b = 37;
        }
        aa.field_s = param2;
        jk.field_j = param0;
        wf.a(ll.field_o, false, param1);
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((af) this).field_c = stackIn_3_1 != 0;
        var2 = (Object) (Object) ((af) this).field_e;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((af) this).field_e).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((af) this).field_h.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((af) this).field_h = null;
    }

    af(ce param0) {
        ((af) this).field_e = new bf();
        ((af) this).field_c = false;
        ((af) this).field_d = 0;
        od var2 = param0.a(4532, (Runnable) this, 5);
        while (var2.field_b == 0) {
            vh.a(10L, -101);
        }
        if (var2.field_b == 2) {
            throw new RuntimeException();
        }
        ((af) this).field_h = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}
