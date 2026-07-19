/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends fc {
    String field_u;
    private boolean field_t;
    static char[] field_s;
    private int field_r;
    private int field_o;
    private boolean field_q;
    private int field_v;
    private long field_w;
    private boolean field_y;
    static int[] field_B;
    static long field_z;
    private int field_x;
    private int field_p;
    private int field_n;

    private final void g(int param0) {
        int discarded$0 = 0;
        ok.field_c[8] = -2;
        ok.field_c[5] = -1;
        ok.field_c[2] = -2;
        ok.field_c[4] = -1;
        if (param0 >= -48) {
            discarded$0 = this.a(true, 104);
        }
        ok.field_c[12] = -1;
        ok.field_c[7] = -1;
        ok.field_c[13] = -1;
        ok.field_c[1] = 16;
        ok.field_c[11] = -1;
        ok.field_c[10] = -1;
        ok.field_c[9] = -1;
        ok.field_c[16] = -1;
        ok.field_c[6] = -2;
        ok.field_c[17] = -1;
        ok.field_c[3] = -1;
        ok.field_c[18] = 1;
    }

    public static void d(byte param0) {
        field_B = null;
        int var1 = 73 / ((param0 - 41) / 55);
        field_s = null;
    }

    final static am a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_3_0 = null;
        am stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am stackOut_12_0 = null;
        am stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 5000) {
              var2_int = param0.length();
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var2_int <= var3) {
                    break L2;
                  } else {
                    var4 = param0.charAt(var3);
                    if (var4 >= 48) {
                      if (57 >= var4) {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
                stackOut_12_0 = lh.field_c;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (am) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("bi.R(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    final int f(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.j(param0 ^ 8214);
            if (var2 == 0) {
              break L1;
            } else {
              if (1 == var2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (eg.field_k[1]) {
              wi.a(2, param0 ^ 1198);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!eg.field_k[2]) {
              break L3;
            } else {
              db.a(3, 126);
              break L3;
            }
          }
          L4: {
            if (eg.field_k[3]) {
              d.a(4, param0 + 2);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!eg.field_k[4]) {
              break L5;
            } else {
              qi.a(false, 5);
              break L5;
            }
          }
          L6: {
            if (eg.field_k[5]) {
              wd.a(6, true);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (eg.field_k[6]) {
              sl.a(7, (byte) 63);
              break L7;
            } else {
              break L7;
            }
          }
          if (!eg.field_k[8]) {
            break L0;
          } else {
            df.f((byte) -98);
            break L0;
          }
        }
        L8: {
          if (param0 == 3) {
            break L8;
          } else {
            this.field_w = -33L;
            break L8;
          }
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 4) {
            this.a(34, true);
        }
        return this.a(true, true, param0);
    }

    private final void d(boolean param0) {
        eg.field_k[4] = true;
        if (param0) {
            field_s = (char[]) null;
        }
    }

    private final void e(byte param0) {
        eg.field_k[2] = true;
        if (param0 > -79) {
            this.field_u = (String) null;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = pl.a((byte) 100, param0);
                      if (param1 == 20558) {
                        break L2;
                      } else {
                        field_B = (int[]) null;
                        break L2;
                      }
                    }
                    if (var4 == null) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L3: {
                          if (ok.a(-121, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (ok.a(-77, var4.charAt(var4.length() + -1))) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                L5: {
                                  L6: {
                                    if (var6 >= param0.length()) {
                                      break L6;
                                    } else {
                                      var7 = param0.charAt(var6);
                                      stackOut_23_0 = ok.a(-113, (char) var7);
                                      stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (var8 != 0) {
                                        break L5;
                                      } else {
                                        L7: {
                                          if (!stackIn_24_0) {
                                            var5 = 0;
                                            if (var8 == 0) {
                                              break L7;
                                            } else {
                                              var5++;
                                              break L7;
                                            }
                                          } else {
                                            var5++;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if (var5 < 2) {
                                            break L8;
                                          } else {
                                            if (param2) {
                                              break L8;
                                            } else {
                                              stackOut_30_0 = 0;
                                              stackIn_31_0 = stackOut_30_0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var8 == 0) {
                                          continue L4;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_33_0 = -1;
                                  stackIn_34_0 = stackOut_33_0;
                                  break L5;
                                }
                                if (stackIn_34_0 <= (var5 ^ -1)) {
                                  stackOut_37_0 = 1;
                                  stackIn_38_0 = stackOut_37_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var3);
            stackOut_39_1 = new StringBuilder().append("bi.P(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0 != 0;
                  } else {
                    return stackIn_38_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        eg.field_k[18] = true;
        eg.field_k[7] = true;
        eg.field_k[8] = param1;
        eg.field_k[16] = true;
        if (param0 != -2) {
          return;
        } else {
          eg.field_k[3] = true;
          eg.field_k[17] = true;
          eg.field_k[0] = true;
          return;
        }
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param1 != 4472) {
          return;
        } else {
          L0: {
            this.a(-2, false);
            if (param0) {
              this.e(19887);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (!param2) {
              break L1;
            } else {
              this.e((byte) -121);
              break L1;
            }
          }
          L2: {
            if (!param3) {
              break L2;
            } else {
              this.d(false);
              break L2;
            }
          }
          L3: {
            if (!param4) {
              break L3;
            } else {
              this.h(9);
              break L3;
            }
          }
          return;
        }
    }

    private final void f(byte param0) {
        int var3 = 83 / ((param0 - 76) / 33);
        String var2 = lh.a((byte) -110);
        mk.a(var2, (byte) -5, ii.a(false));
    }

    final void i(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 250) {
          return;
        } else {
          L0: {
            L1: {
              if (!vg.c(false)) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackOut_2_1 = 0;
                  stackOut_2_2 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  if (null == ba.field_f) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = stackIn_4_2;
                    stackOut_4_3 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = stackIn_3_2;
                    stackOut_3_3 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    break L2;
                  }
                }
                discarded$2 = this.a(stackIn_5_1 != 0, stackIn_5_2 != 0, stackIn_5_3 != 0);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (mc.field_a >= 10) {
              L3: {
                if (ub.b(true)) {
                  break L3;
                } else {
                  ak.a((byte) 99);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (k.field_g != 0) {
                  break L4;
                } else {
                  discarded$3 = this.a(false, true, false);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              b.a(-21342, ab.field_d);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, String param2, boolean param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.b((byte) -66)) {
                  L2: {
                    L3: {
                      this.field_u = this.getCodeBase().getHost();
                      var6_ref2 = this.field_u.toLowerCase();
                      stackOut_2_0 = this;
                      stackIn_5_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L2;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_5_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                  L4: {
                    ((bi) (this)).field_y = stackIn_7_1 != 0;
                    if (param3) {
                      break L4;
                    } else {
                      this.i(-89);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_r = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_x = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_v = Integer.parseInt(var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_w = Long.parseLong(this.getParameter("instanceid"));
                    this.field_t = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L6;
                    } else {
                      this.field_o = Integer.parseInt(var8);
                      break L6;
                    }
                  }
                  L7: {
                    if (-6 < (this.field_o ^ -1)) {
                      break L7;
                    } else {
                      this.field_o = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 == null) {
                      break L8;
                    } else {
                      this.field_n = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  la.field_o = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param0, param4, this.field_p, param1, 32, param2, (byte) -48);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                kk.a((String) null, (byte) 110, (Throwable) ((Object) var6));
                this.a((byte) 87, "crash");
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6_ref);
            stackOut_22_1 = new StringBuilder().append("bi.V(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_27_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_153_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (ci.field_a != null) {
            L1: {
              if (ba.field_f == null) {
                var6 = hd.b(true);
                var4 = var6.getSize();
                ci.field_a.a(-124, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ci.field_a.b(param0 ^ -73);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          kc.a((byte) 93);
          db.a(param0 + -99);
          if (wj.d(-106)) {
            break L2;
          } else {
            if (-12 != (k.field_g ^ -1)) {
              cd.b(110);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (eb.field_A != null) {
            ab.field_d = eb.field_A.a(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 99) {
            break L4;
          } else {
            this.field_v = -121;
            break L4;
          }
        }
        L5: {
          if (!cb.a(false)) {
            break L5;
          } else {
            L6: {
              var3 = 1200 * gg.c(0);
              if (this.field_q) {
                break L6;
              } else {
                if (var3 >= qa.b(125)) {
                  break L5;
                } else {
                  if (var3 < rh.a(1)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_q = false;
            gk.a(-1);
            cf.a((byte) 108);
            pc.a((byte) -46, 2, dc.field_b);
            dd.a(0);
            qj.field_J = true;
            ha.field_ab = 15000L + pf.a(0);
            break L5;
          }
        }
        L7: {
          L8: {
            if ((bl.field_m ^ -1) == 0) {
              break L8;
            } else {
              if (bl.field_m != 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (bl.field_m != -1) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L9;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_27_0;
            bl.field_m = kh.a((byte) -93);
            if (var3 == 0) {
              break L10;
            } else {
              if (bl.field_m != 0) {
                break L10;
              } else {
                if (11 != k.field_g) {
                  break L10;
                } else {
                  if (!ld.b(true)) {
                    db.a(false);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if ((bl.field_m ^ -1) == 0) {
            break L7;
          } else {
            if ((bl.field_m ^ -1) != -1) {
              ha.field_ab = pf.a(param0 + -99) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if (0 == (bl.field_m ^ -1)) {
            break L11;
          } else {
            if (0 != bl.field_m) {
              L12: {
                if (-11 < (mc.field_a ^ -1)) {
                  break L12;
                } else {
                  if (10 > k.field_g) {
                    break L11;
                  } else {
                    L13: {
                      L14: {
                        cf.a((byte) 92);
                        if ((bl.field_m ^ -1) == -4) {
                          break L14;
                        } else {
                          L15: {
                            if (bl.field_m != 4) {
                              break L15;
                            } else {
                              pc.a((byte) -46, 256, ia.field_c);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (-3 != (bl.field_m ^ -1)) {
                              break L16;
                            } else {
                              pc.a((byte) -46, 256, vi.field_a);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (5 != bl.field_m) {
                              break L17;
                            } else {
                              pc.a((byte) -46, 5, sc.field_b);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L17;
                              }
                            }
                          }
                          pc.a((byte) -46, 256, me.field_h);
                          if (var5 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      pc.a((byte) -46, 256, qi.field_A);
                      break L13;
                    }
                    qj.field_J = true;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L18: {
                if (bl.field_m != 3) {
                  break L18;
                } else {
                  this.a((byte) 62, "js5crc");
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (-5 != (bl.field_m ^ -1)) {
                  break L19;
                } else {
                  this.a((byte) 123, "js5io");
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (-3 != (bl.field_m ^ -1)) {
                  break L20;
                } else {
                  this.a((byte) 82, "js5connect_full");
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L20;
                  }
                }
              }
              L21: {
                if ((bl.field_m ^ -1) != -6) {
                  break L21;
                } else {
                  this.a((byte) 58, "outofdate");
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L21;
                  }
                }
              }
              this.a((byte) 105, "js5connect");
              break L11;
            } else {
              break L11;
            }
          }
        }
        L22: {
          L23: {
            L24: {
              if (bl.field_m == -1) {
                break L24;
              } else {
                if (0 != bl.field_m) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            if (!ld.b(true)) {
              break L22;
            } else {
              break L23;
            }
          }
          if (pf.a(param0 + -99) >= ha.field_ab) {
            qj.field_J = false;
            if (-1 == bl.field_m) {
              break L22;
            } else {
              if ((bl.field_m ^ -1) != -1) {
                bl.field_m = -1;
                ff.a(64);
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L25: {
          if (-1 != (bl.field_m ^ -1)) {
            break L25;
          } else {
            if (!ld.b(true)) {
              lh.field_e = false;
              break L25;
            } else {
              break L25;
            }
          }
        }
        L26: {
          if (-1 != (mc.field_a ^ -1)) {
            break L26;
          } else {
            if (gh.a(false)) {
              mc.field_a = 1;
              break L26;
            } else {
              break L26;
            }
          }
        }
        L27: {
          if (mc.field_a == 1) {
            L28: {
              if (fe.field_h != 0) {
                ec.field_a = ol.a(-107, pl.field_g);
                break L28;
              } else {
                break L28;
              }
            }
            fj.field_B = b.a(false, 1, true, ph.field_c, (byte) 125);
            hf.field_a = b.a(false, 1, true, nd.field_e, (byte) -118);
            ii.field_m = b.a(false, 1, true, uk.field_q, (byte) -51);
            mc.field_a = 2;
            wj.field_j = fj.field_B;
            ri.field_a = hf.field_a;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if (-3 == (mc.field_a ^ -1)) {
            L30: {
              if (ec.field_a != null) {
                if (ec.field_a.a(73)) {
                  L31: {
                    if (!ec.field_a.b("", (byte) -111)) {
                      break L31;
                    } else {
                      if (!ec.field_a.a(0, "")) {
                        break L30;
                      } else {
                        ll.a(2, ec.field_a);
                        ec.field_a = null;
                        oe.a((byte) 119);
                        if (var5 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  ec.field_a = null;
                  break L30;
                } else {
                  break L30;
                }
              } else {
                break L30;
              }
            }
            if (ec.field_a == null) {
              mc.field_a = 3;
              break L29;
            } else {
              break L29;
            }
          } else {
            break L29;
          }
        }
        L32: {
          if ((mc.field_a ^ -1) == -4) {
            if (!di.a(fj.field_B, hf.field_a, ii.field_m, (byte) 104)) {
              break L32;
            } else {
              if (al.a(ii.field_m, (byte) 39)) {
                L33: {
                  L34: {
                    pb.a(false);
                    dj.b(param0 ^ -25469);
                    cf.field_c = false;
                    be.field_d = j.field_h;
                    lc.a(fj.field_B, mb.field_c, hf.field_a, param0 + 3249773, ii.field_m);
                    if (sd.field_d) {
                      break L34;
                    } else {
                      if (kg.field_d == null) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  L35: {
                    if (sd.field_d) {
                      stackOut_118_0 = 0;
                      stackIn_119_0 = stackOut_118_0;
                      break L35;
                    } else {
                      stackOut_117_0 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      break L35;
                    }
                  }
                  L36: {
                    stackOut_119_0 = stackIn_119_0;
                    stackOut_119_1 = 98;
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_121_1 = stackOut_119_1;
                    stackIn_120_0 = stackOut_119_0;
                    stackIn_120_1 = stackOut_119_1;
                    if (sd.field_d) {
                      stackOut_121_0 = stackIn_121_0;
                      stackOut_121_1 = stackIn_121_1;
                      stackOut_121_2 = 0;
                      stackIn_122_0 = stackOut_121_0;
                      stackIn_122_1 = stackOut_121_1;
                      stackIn_122_2 = stackOut_121_2;
                      break L36;
                    } else {
                      stackOut_120_0 = stackIn_120_0;
                      stackOut_120_1 = stackIn_120_1;
                      stackOut_120_2 = 1;
                      stackIn_122_0 = stackOut_120_0;
                      stackIn_122_1 = stackOut_120_1;
                      stackIn_122_2 = stackOut_120_2;
                      break L36;
                    }
                  }
                  bd.a(stackIn_122_0 != 0, (byte) stackIn_122_1, stackIn_122_2 != 0, kg.field_d);
                  break L33;
                }
                L37: {
                  if (la.field_o) {
                    il.a(true);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (null == dk.field_e) {
                    dk.field_e = vd.a(false);
                    fa.field_p = ne.a(param0 ^ -100);
                    break L38;
                  } else {
                    break L38;
                  }
                }
                fc.a(dk.field_e, (byte) 111, ii.field_m, fa.field_p);
                ii.field_m = null;
                fj.field_B = null;
                hf.field_a = null;
                uc.a((java.applet.Applet) (this), 0);
                oe.a((byte) 112);
                mc.field_a = 10;
                break L32;
              } else {
                break L32;
              }
            }
          } else {
            break L32;
          }
        }
        L39: {
          if (mc.field_a != 10) {
            break L39;
          } else {
            L40: {
              if (-1 != (fe.field_h ^ -1)) {
                ch.field_j = ol.a(-102, r.field_e);
                break L40;
              } else {
                break L40;
              }
            }
            mc.field_a = 11;
            break L39;
          }
        }
        L41: {
          if (mc.field_a == 11) {
            L42: {
              if (ch.field_j == null) {
                break L42;
              } else {
                L43: {
                  if (!ch.field_j.a(-124)) {
                    break L43;
                  } else {
                    if (ch.field_j.b(0)) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                }
                ad.a(ec.a(ch.field_j, ug.field_b, tk.field_a, 0), param0 ^ -24150, 0.0f);
                if (var5 == 0) {
                  break L41;
                } else {
                  break L42;
                }
              }
            }
            mc.field_a = 12;
            pl.field_d = true;
            break L41;
          } else {
            break L41;
          }
        }
        L44: {
          if (-13 == (mc.field_a ^ -1)) {
            if (pl.field_d) {
              break L44;
            } else {
              mc.field_a = 13;
              break L44;
            }
          } else {
            break L44;
          }
        }
        L45: {
          if (13 != mc.field_a) {
            break L45;
          } else {
            L46: {
              var3 = 1;
              if (lb.field_C == null) {
                break L46;
              } else {
                L47: {
                  if (!lb.field_C.a(28296)) {
                    stackOut_152_0 = 0;
                    stackIn_153_0 = stackOut_152_0;
                    break L47;
                  } else {
                    stackOut_151_0 = 1;
                    stackIn_153_0 = stackOut_151_0;
                    break L47;
                  }
                }
                var3 = stackIn_153_0;
                ad.a(lb.field_C.field_g, -24119, lb.field_C.field_b);
                break L46;
              }
            }
            if (var3 != 0) {
              mc.field_a = 20;
              break L45;
            } else {
              break L45;
            }
          }
        }
        L48: {
          if (param1) {
            break L48;
          } else {
            if (!aj.field_c) {
              break L48;
            } else {
              vh.a(ie.field_e, (byte) -115);
              this.a(false);
              af.a(20, ie.field_e);
              break L48;
            }
          }
        }
        L49: {
          if (eg.field_k[8]) {
            ei.b(param0 + -91);
            break L49;
          } else {
            break L49;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param0, 480, param2, true, 640);
              if (param1 >= 124) {
                break L1;
              } else {
                this.field_o = 99;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bi.O(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void h(int param0) {
        if (param0 != 9) {
            return;
        }
        eg.field_k[5] = true;
    }

    final static boolean a(byte param0, gk param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              var2_int = 18 / ((46 - param0) / 57);
              var3 = param1.a((byte) 114);
              if (var3 == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var4 = stackIn_3_0;
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param4 != -25172) {
            this.field_x = -97;
        }
        fe.field_h = this.field_o;
        jg.a(3860, fe.field_h);
        kj.a(fe.field_h, this.field_x, this.field_t, 5000, param0, this.field_p, this.field_u, this.field_w, param5, 5000, this.field_v, (byte) -111, this.field_r, rc.field_k);
        ii.a(rc.field_k, this.field_u, this.field_x, fe.field_h, this.field_r, param0, this.field_p, this.field_v, -2045);
        sj.a(92);
        eb.field_A = cf.a(param4 + 25427);
        af.a(20, ie.field_e);
        pl.field_g = param3;
        r.field_e = param1;
        nd.field_e = param7;
        uk.field_q = param6;
        ph.field_c = param2;
        this.g(param4 ^ 25184);
        re.b(75);
    }

    final void k(int param0) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = wk.field_a;
          if (-65 >= (var2 ^ -1)) {
            break L0;
          } else {
            if (!eg.field_k[var2]) {
              break L0;
            } else {
              L1: {
                if (param0 == -28710) {
                  break L1;
                } else {
                  this.g(-13);
                  break L1;
                }
              }
              if (0 != var2) {
                L2: {
                  if (var2 != 1) {
                    break L2;
                  } else {
                    t.i(-118);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
                L3: {
                  if (-3 == (var2 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (var2 == 3) {
                        break L4;
                      } else {
                        L5: {
                          if (4 == var2) {
                            break L5;
                          } else {
                            L6: {
                              if (-6 == (var2 ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  if (-7 != (var2 ^ -1)) {
                                    break L7;
                                  } else {
                                    m.a((byte) -106);
                                    if (var4 != 0) {
                                      break L7;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                                L8: {
                                  if ((var2 ^ -1) == -8) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (8 != var2) {
                                        break L9;
                                      } else {
                                        hk.a(MonkeyPuzzle2.field_D, rc.field_k, -1, rc.field_f);
                                        if (var4 != 0) {
                                          break L9;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                    L10: {
                                      if ((var2 ^ -1) != -17) {
                                        break L10;
                                      } else {
                                        lg.a((byte) 122);
                                        if (var4 != 0) {
                                          break L10;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                    L11: {
                                      if ((var2 ^ -1) == -12) {
                                        break L11;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L11;
                                        } else {
                                          L12: {
                                            if (var2 == 13) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (var2 == 17) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (var2 != 18) {
                                                      break L14;
                                                    } else {
                                                      uc.a(62);
                                                      if (var4 != 0) {
                                                        break L14;
                                                      } else {
                                                        return;
                                                      }
                                                    }
                                                  }
                                                  kk.a("MGS1: " + bh.a((byte) -49), (byte) 120, (Throwable) null);
                                                  gk.a(-1);
                                                  if (var4 != 0) {
                                                    break L13;
                                                  } else {
                                                    return;
                                                  }
                                                }
                                              }
                                              this.l(15);
                                              if (var4 != 0) {
                                                break L12;
                                              } else {
                                                return;
                                              }
                                            }
                                          }
                                          rh.l(78);
                                          if (var4 != 0) {
                                            break L11;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                    }
                                    L15: {
                                      if ((var2 ^ -1) != -13) {
                                        stackOut_48_0 = 0;
                                        stackIn_49_0 = stackOut_48_0;
                                        break L15;
                                      } else {
                                        stackOut_47_0 = 1;
                                        stackIn_49_0 = stackOut_47_0;
                                        break L15;
                                      }
                                    }
                                    var3 = si.a(stackIn_49_0 != 0, 0);
                                    cd.a(var3, (byte) 20);
                                    if (var4 != 0) {
                                      break L8;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                                this.f((byte) 115);
                                if (var4 != 0) {
                                  break L6;
                                } else {
                                  return;
                                }
                              }
                            }
                            sc.a(false);
                            if (var4 != 0) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        gd.a((byte) 8);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    hh.c(true);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                p.b(-79);
                if (var4 == 0) {
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        kk.a("MGS2: " + bh.a((byte) -38), (byte) 66, (Throwable) null);
        gk.a(param0 + 28709);
    }

    private final int j(int param0) {
        int var2 = 0;
        if (this.field_l) {
          return -1;
        } else {
          if (!ld.b(true)) {
            return -1;
          } else {
            if (qj.field_J) {
              return -1;
            } else {
              L0: {
                if (param0 == 8213) {
                  break L0;
                } else {
                  this.field_p = -31;
                  break L0;
                }
              }
              var2 = ad.a(this.field_n, 650, this.field_y, true, mk.e(0), lb.d((byte) -56));
              if (0 != (var2 ^ -1)) {
                L1: {
                  if (0 == var2) {
                    break L1;
                  } else {
                    if (var2 == 1) {
                      break L1;
                    } else {
                      L2: {
                        if (!nd.field_a) {
                          this.a((byte) 77, "reconnect");
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      cf.a((byte) 3);
                      pc.a((byte) -46, var2, sl.field_n);
                      qj.field_J = true;
                      ha.field_ab = pf.a(0) - -15000L;
                      return var2;
                    }
                  }
                }
                L3: {
                  if (k.field_g != 11) {
                    break L3;
                  } else {
                    if (bl.field_m == 0) {
                      db.a(false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 10) {
          return;
        } else {
          L0: {
            var2 = MonkeyPuzzle2.field_D.a((byte) 114);
            if (0 == (1 & var2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          var4 = rc.field_f + -1;
          var5 = new byte[var4];
          MonkeyPuzzle2.field_D.a((byte) 118, 0, var4, var5);
          pl.a(var3 != 0, 12430, ii.a(false), be.a(var5, (byte) -49));
          return;
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            gk var12 = null;
            int stackIn_37_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_42_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_41_1 = 0;
            int stackOut_40_0 = 0;
            int stackOut_40_1 = 0;
            L0: {
              var8 = MonkeyPuzzle2.field_F ? 1 : 0;
              var4 = sg.a(fe.field_h, param2, -128, ab.field_d);
              if (param1) {
                break L0;
              } else {
                bi.d((byte) -64);
                break L0;
              }
            }
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (-2 == (var4 ^ -1)) {
                  L2: {
                    var5_int = hb.a(-7468, qj.l(111), wc.a((byte) 112));
                    if ((var5_int ^ -1) == 0) {
                      break L2;
                    } else {
                      p.a(sl.field_n, (byte) 121, var5_int, cm.field_E);
                      sl.field_n = null;
                      cm.field_E = null;
                      break L2;
                    }
                  }
                  var11 = na.a(55);
                  if (var11 != null) {
                    ti.a(0, var11.booleanValue());
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if ((var4 ^ -1) == -3) {
                  var5_int = nj.a(ci.a((byte) 78), gh.a(12035), mk.e(0), lb.d((byte) -56), true, this.field_n, pl.a((byte) -69));
                  if (var5_int == -1) {
                    break L3;
                  } else {
                    fj.a(cm.field_E, sl.field_n, -27967, var5_int);
                    cm.field_E = null;
                    sl.field_n = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (-4 != (var4 ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if ((bl.field_m ^ -1) == 0) {
                      break L5;
                    } else {
                      if (bl.field_m != 0) {
                        bl.field_m = -1;
                        ff.a(95);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (!param0) {
                      break L6;
                    } else {
                      qj.field_J = false;
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5_int = ad.a(this.field_n, 650, this.field_y, false, mk.e(0), lb.d((byte) -56));
                  if ((var5_int ^ -1) != 0) {
                    L7: {
                      if (var5_int != 0) {
                        break L7;
                      } else {
                        cc.field_b = ia.field_f;
                        db.a(false);
                        ha.field_db = false;
                        k.field_g = 10;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    pc.a((byte) -46, var5_int, sl.field_n);
                    sl.field_n = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L8: {
                if (4 != var4) {
                  break L8;
                } else {
                  L9: {
                    if (mb.field_c) {
                      break L9;
                    } else {
                      ha.field_db = true;
                      k.field_g = 10;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param1) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L10;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L10;
                    }
                  }
                  ad.a(ii.a(stackIn_37_0 != 0), true);
                  break L8;
                }
              }
              L11: {
                if (var4 != 5) {
                  break L11;
                } else {
                  L12: {
                    stackOut_39_0 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_40_0 = stackOut_39_0;
                    if (param1) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L12;
                    } else {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      break L12;
                    }
                  }
                  hd.a(stackIn_42_0 != 0, ii.a(stackIn_42_1 != 0));
                  break L11;
                }
              }
              L13: {
                if (var4 == 6) {
                  if (cf.field_c) {
                    k.field_g = 10;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L14: {
                if (7 == var4) {
                  aa.a(-126, ii.a(false));
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var4 != 8) {
                  break L15;
                } else {
                  ad.a(ii.a(false), true);
                  break L15;
                }
              }
              L16: {
                if (-10 == (var4 ^ -1)) {
                  m.a((byte) -79, ii.a(false));
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (-11 != (var4 ^ -1)) {
                  break L17;
                } else {
                  gf.field_c.b(true, 17);
                  break L17;
                }
              }
              L18: {
                if ((var4 ^ -1) != -12) {
                  break L18;
                } else {
                  l.a(ii.a(false), -120);
                  break L18;
                }
              }
              L19: {
                if (12 != var4) {
                  break L19;
                } else {
                  k.a(ii.a(false), (byte) 91, pj.b(true));
                  break L19;
                }
              }
              L20: {
                if (13 == var4) {
                  try {
                    L21: {
                      L22: {
                        if (null == ec.field_e) {
                          ec.field_e = new qa(rc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        if (ec.field_e.c(90)) {
                          L24: {
                            L25: {
                              var12 = ec.field_e.a(18);
                              if (var12 != null) {
                                break L25;
                              } else {
                                var9 = (String) null;
                                ki.a(44, (String) null);
                                if (var8 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            var7 = sc.a(var12.field_g, var12.field_h, 78, 0);
                            ki.a(-125, var7);
                            break L24;
                          }
                          ec.field_e = null;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      break L21;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L26: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      kk.a("S1", (byte) 67, (Throwable) ((Object) var5));
                      var10 = (String) null;
                      ki.a(67, (String) null);
                      ec.field_e = null;
                      break L26;
                    }
                  }
                  break L20;
                } else {
                  break L20;
                }
              }
              L27: {
                if (var4 != 15) {
                  break L27;
                } else {
                  k.field_g = 10;
                  break L27;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (-18 != (var4 ^ -1)) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        if (param0 != 19887) {
            this.f((byte) 17);
        }
        eg.field_k[1] = true;
    }

    protected bi() {
    }

    static {
        field_s = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
