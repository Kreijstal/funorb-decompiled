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
        ok.field_c[8] = -2;
        ok.field_c[5] = -1;
        ok.field_c[2] = -2;
        ok.field_c[4] = -1;
        if (param0 >= -48) {
            this.a(true, 104);
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 5000) {
              var2_int = param0.length();
              var3 = 0;
              L1: while (true) {
                if (var2_int <= var3) {
                  stackIn_13_0 = lh.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = param0.charAt(var3);
                  if (var4 >= 48) {
                    if (57 >= var4) {
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (am) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("bi.R(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
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
        int var2;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                      stackIn_15_0 = 0;
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
                                if (var6 >= param0.length()) {
                                  if (-1 <= (var5 ^ -1)) {
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_33_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param0.charAt(var6);
                                    if (ok.a(-113, (char) var7)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param2) {
                                        break L6;
                                      } else {
                                        stackIn_29_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("bi.P(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ',' + param2 + ')');
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
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_35_0 != 0;
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
        }
        eg.field_k[3] = true;
        eg.field_k[17] = true;
        eg.field_k[0] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param1 != 4472) {
            return;
        }
        this.a(-2, false);
        if (!(!param0)) {
            this.e(19887);
        }
        if (param2) {
            this.e((byte) -121);
        }
        if (param3) {
            this.d(false);
        }
        if (param4) {
            this.h(9);
        }
    }

    private final void f(byte param0) {
        int var3 = 83 / ((param0 - 76) / 33);
        String var2 = lh.a((byte) -110);
        mk.a(var2, (byte) -5, ii.a(false));
    }

    final void i(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 250) {
            return;
        }
        if (vg.c(false)) {
            discarded$1 = this.a(false, true, null != ba.field_f ? true : false);
        } else {
            if (mc.field_a < 10) {
            } else {
                if (!ub.b(true)) {
                    ak.a((byte) 99);
                } else {
                    if (k.field_g == 0) {
                        discarded$3 = this.a(false, true, false);
                    } else {
                        b.a(-21342, ab.field_d);
                    }
                }
            }
        }
    }

    private final void a(int param0, int param1, String param2, boolean param3, int param4) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.b((byte) -66)) {
                  L2: {
                    L3: {
                      this.field_u = this.getCodeBase().getHost();
                      var6 = this.field_u.toLowerCase();
                      stackIn_5_0 = this;

                      if (var6.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackIn_6_0 = this;

                        if (!var6.endsWith(".jagex.com")) {
                          stackIn_7_0 = this;
                          stackIn_7_1 = 0;
                          break L2;
                        } else {
                          stackIn_5_0 = this;
                          break L3;
                        }
                      }
                    }
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
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
                var6_ref = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                kk.a((String) null, (byte) 110, (Throwable) ((Object) var6_ref));
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
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6_ref2);

            stackIn_24_1 = new StringBuilder().append("bi.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        int stackIn_27_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_143_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
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
              stackIn_27_0 = 0;
              break L9;
            } else {
              stackIn_27_0 = 1;
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
              if (-11 < (mc.field_a ^ -1)) {
                if (bl.field_m != 3) {
                  if (-5 != (bl.field_m ^ -1)) {
                    if (-3 != (bl.field_m ^ -1)) {
                      if ((bl.field_m ^ -1) != -6) {
                        this.a((byte) 105, "js5connect");
                        break L11;
                      } else {
                        this.a((byte) 58, "outofdate");
                        break L11;
                      }
                    } else {
                      this.a((byte) 82, "js5connect_full");
                      break L11;
                    }
                  } else {
                    this.a((byte) 123, "js5io");
                    break L11;
                  }
                } else {
                  this.a((byte) 62, "js5crc");
                  break L11;
                }
              } else {
                if (10 > k.field_g) {
                  break L11;
                } else {
                  L12: {
                    cf.a((byte) 92);
                    if ((bl.field_m ^ -1) == -4) {
                      pc.a((byte) -46, 256, qi.field_A);
                      break L12;
                    } else {
                      if (bl.field_m != 4) {
                        if (-3 != (bl.field_m ^ -1)) {
                          if (5 != bl.field_m) {
                            pc.a((byte) -46, 256, me.field_h);
                            break L12;
                          } else {
                            pc.a((byte) -46, 5, sc.field_b);
                            break L12;
                          }
                        } else {
                          pc.a((byte) -46, 256, vi.field_a);
                          break L12;
                        }
                      } else {
                        pc.a((byte) -46, 256, ia.field_c);
                        break L12;
                      }
                    }
                  }
                  qj.field_J = true;
                  break L11;
                }
              }
            } else {
              break L11;
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (bl.field_m == -1) {
                break L15;
              } else {
                if (0 != bl.field_m) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!ld.b(true)) {
              break L13;
            } else {
              break L14;
            }
          }
          if (pf.a(param0 + -99) >= ha.field_ab) {
            qj.field_J = false;
            if (-1 == bl.field_m) {
              break L13;
            } else {
              if ((bl.field_m ^ -1) != -1) {
                bl.field_m = -1;
                ff.a(64);
                break L13;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (-1 != (bl.field_m ^ -1)) {
            break L16;
          } else {
            if (!ld.b(true)) {
              lh.field_e = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (-1 != (mc.field_a ^ -1)) {
            break L17;
          } else {
            if (gh.a(false)) {
              mc.field_a = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (mc.field_a == 1) {
            L19: {
              if (fe.field_h != 0) {
                ec.field_a = ol.a(-107, pl.field_g);
                break L19;
              } else {
                break L19;
              }
            }
            fj.field_B = b.a(false, 1, true, ph.field_c, (byte) 125);
            hf.field_a = b.a(false, 1, true, nd.field_e, (byte) -118);
            ii.field_m = b.a(false, 1, true, uk.field_q, (byte) -51);
            mc.field_a = 2;
            wj.field_j = fj.field_B;
            ri.field_a = hf.field_a;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (-3 == (mc.field_a ^ -1)) {
            L21: {
              if (ec.field_a != null) {
                if (ec.field_a.a(73)) {
                  if (!ec.field_a.b("", (byte) -111)) {
                    ec.field_a = null;
                    break L21;
                  } else {
                    if (!ec.field_a.a(0, "")) {
                      break L21;
                    } else {
                      ll.a(2, ec.field_a);
                      ec.field_a = null;
                      oe.a((byte) 119);
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              } else {
                break L21;
              }
            }
            if (ec.field_a == null) {
              mc.field_a = 3;
              break L20;
            } else {
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if ((mc.field_a ^ -1) == -4) {
            if (!di.a(fj.field_B, hf.field_a, ii.field_m, (byte) 104)) {
              break L22;
            } else {
              if (al.a(ii.field_m, (byte) 39)) {
                L23: {
                  L24: {
                    pb.a(false);
                    dj.b(param0 ^ -25469);
                    cf.field_c = false;
                    be.field_d = j.field_h;
                    lc.a(fj.field_B, mb.field_c, hf.field_a, param0 + 3249773, ii.field_m);
                    if (sd.field_d) {
                      break L24;
                    } else {
                      if (kg.field_d == null) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (sd.field_d) {
                      stackIn_110_0 = 0;
                      break L25;
                    } else {
                      stackIn_110_0 = 1;
                      break L25;
                    }
                  }
                  L26: {


                    stackIn_112_1 = 98;

                    if (sd.field_d) {

                      stackIn_113_1 = stackIn_112_1;
                      stackIn_113_2 = 0;
                      break L26;
                    } else {

                      stackIn_113_1 = stackIn_112_1;
                      stackIn_113_2 = 1;
                      break L26;
                    }
                  }
                  bd.a(stackIn_110_0 != 0, (byte) stackIn_113_1, stackIn_113_2 != 0, kg.field_d);
                  break L23;
                }
                L27: {
                  if (la.field_o) {
                    il.a(true);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == dk.field_e) {
                    dk.field_e = vd.a(false);
                    fa.field_p = ne.a(param0 ^ -100);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                fc.a(dk.field_e, (byte) 111, ii.field_m, fa.field_p);
                ii.field_m = null;
                fj.field_B = null;
                hf.field_a = null;
                uc.a((java.applet.Applet) (this), 0);
                oe.a((byte) 112);
                mc.field_a = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (mc.field_a != 10) {
            break L29;
          } else {
            L30: {
              if (-1 != (fe.field_h ^ -1)) {
                ch.field_j = ol.a(-102, r.field_e);
                break L30;
              } else {
                break L30;
              }
            }
            mc.field_a = 11;
            break L29;
          }
        }
        L31: {
          if (mc.field_a == 11) {
            L32: {
              if (ch.field_j == null) {
                break L32;
              } else {
                L33: {
                  if (!ch.field_j.a(-124)) {
                    break L33;
                  } else {
                    if (ch.field_j.b(0)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                ad.a(ec.a(ch.field_j, ug.field_b, tk.field_a, 0), param0 ^ -24150, 0.0f);
                break L31;
              }
            }
            mc.field_a = 12;
            pl.field_d = true;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (-13 == (mc.field_a ^ -1)) {
            if (pl.field_d) {
              break L34;
            } else {
              mc.field_a = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (13 != mc.field_a) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (lb.field_C == null) {
                break L36;
              } else {
                L37: {
                  if (!lb.field_C.a(28296)) {
                    stackIn_143_0 = 0;
                    break L37;
                  } else {
                    stackIn_143_0 = 1;
                    break L37;
                  }
                }
                var3 = stackIn_143_0;
                ad.a(lb.field_C.field_g, -24119, lb.field_C.field_b);
                break L36;
              }
            }
            if (var3 != 0) {
              mc.field_a = 20;
              break L35;
            } else {
              break L35;
            }
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!aj.field_c) {
              break L38;
            } else {
              vh.a(ie.field_e, (byte) -115);
              this.a(false);
              af.a(20, ie.field_e);
              break L38;
            }
          }
        }
        L39: {
          if (eg.field_k[8]) {
            ei.b(param0 + -91);
            break L39;
          } else {
            break L39;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            this.a(param0, 480, param2, true, 640);
            if (param1 < 124) {
                this.field_o = 99;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "bi.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 18 / ((46 - param0) / 57);
              var3 = param1.a((byte) 114);
              if (var3 == 1) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            var4 = stackIn_3_0;
            stackIn_4_0 = var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int stackIn_32_0 = 0;
        int var2;
        hl var3;
        int var4;
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
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (-3 == (var2 ^ -1)) {
                      p.b(-79);
                      break L2;
                    } else {
                      if (var2 == 3) {
                        hh.c(true);
                        break L2;
                      } else {
                        if (4 == var2) {
                          gd.a((byte) 8);
                          break L2;
                        } else {
                          if (-6 == (var2 ^ -1)) {
                            sc.a(false);
                            break L2;
                          } else {
                            if (-7 != (var2 ^ -1)) {
                              if ((var2 ^ -1) == -8) {
                                this.f((byte) 115);
                                break L2;
                              } else {
                                if (8 != var2) {
                                  if ((var2 ^ -1) != -17) {
                                    L3: {
                                      if ((var2 ^ -1) == -12) {
                                        break L3;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            rh.l(78);
                                            break L2;
                                          } else {
                                            if (var2 == 17) {
                                              this.l(15);
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                kk.a("MGS1: " + bh.a((byte) -49), (byte) 120, (Throwable) null);
                                                gk.a(-1);
                                                break L2;
                                              } else {
                                                uc.a(62);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if ((var2 ^ -1) != -13) {
                                        stackIn_32_0 = 0;
                                        break L4;
                                      } else {
                                        stackIn_32_0 = 1;
                                        break L4;
                                      }
                                    }
                                    var3 = si.a(stackIn_32_0 != 0, 0);
                                    cd.a(var3, (byte) 20);
                                    break L2;
                                  } else {
                                    lg.a((byte) 122);
                                    break L2;
                                  }
                                } else {
                                  hk.a(MonkeyPuzzle2.field_D, rc.field_k, -1, rc.field_f);
                                  break L2;
                                }
                              }
                            } else {
                              m.a((byte) -106);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    t.i(-118);
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        kk.a("MGS2: " + bh.a((byte) -38), (byte) 66, (Throwable) null);
        gk.a(param0 + 28709);
    }

    private final int j(int param0) {
        if (!(!this.field_l)) {
            return -1;
        }
        if (!(ld.b(true))) {
            return -1;
        }
        if (!(!qj.field_J)) {
            return -1;
        }
        if (param0 != 8213) {
            this.field_p = -31;
        }
        int var2 = ad.a(this.field_n, 650, this.field_y, true, mk.e(0), lb.d((byte) -56));
        if (0 == (var2 ^ -1)) {
            return -1;
        }
        if (0 == var2 || var2 == 1) {
            if (k.field_g == 11) {
                if (!(bl.field_m != 0)) {
                    db.a(false);
                }
            }
            return var2;
        }
        if (!(nd.field_a)) {
            this.a((byte) 77, "reconnect");
        }
        cf.a((byte) 3);
        pc.a((byte) -46, var2, sl.field_n);
        qj.field_J = true;
        ha.field_ab = pf.a(0) - -15000L;
        return var2;
    }

    private final void l(int param0) {
        if (param0 <= 10) {
            return;
        }
        int var2 = MonkeyPuzzle2.field_D.a((byte) 114);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = rc.field_f + -1;
        byte[] var5 = new byte[var4];
        MonkeyPuzzle2.field_D.a((byte) 118, 0, var4, var5);
        pl.a(var3 != 0, 12430, ii.a(false), be.a(var5, (byte) -49));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int stackIn_34_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_39_1 = 0;
            Throwable decompiledCaughtException = null;
            int var4 = 0;
            int var5_int = 0;
            Exception var5 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            gk var12 = null;
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
                  if (!param0) {
                    var5_int = ad.a(this.field_n, 650, this.field_y, false, mk.e(0), lb.d((byte) -56));
                    if ((var5_int ^ -1) != 0) {
                      if (var5_int != 0) {
                        pc.a((byte) -46, var5_int, sl.field_n);
                        sl.field_n = null;
                        break L4;
                      } else {
                        cc.field_b = ia.field_f;
                        db.a(false);
                        ha.field_db = false;
                        k.field_g = 10;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    qj.field_J = false;
                    break L4;
                  }
                }
              }
              L6: {
                if (4 != var4) {
                  break L6;
                } else {
                  if (mb.field_c) {
                    L7: {
                      if (param1) {
                        stackIn_34_0 = 0;
                        break L7;
                      } else {
                        stackIn_34_0 = 1;
                        break L7;
                      }
                    }
                    ad.a(ii.a(stackIn_34_0 != 0), true);
                    break L6;
                  } else {
                    ha.field_db = true;
                    k.field_g = 10;
                    break L6;
                  }
                }
              }
              L8: {
                if (var4 != 5) {
                  break L8;
                } else {
                  L9: {
                    stackIn_38_0 = 1;

                    if (param1) {
                      stackIn_39_0 = stackIn_38_0;
                      stackIn_39_1 = 0;
                      break L9;
                    } else {
                      stackIn_39_0 = stackIn_38_0;
                      stackIn_39_1 = 1;
                      break L9;
                    }
                  }
                  hd.a(stackIn_39_0 != 0, ii.a(stackIn_39_1 != 0));
                  break L8;
                }
              }
              L10: {
                if (var4 == 6) {
                  if (cf.field_c) {
                    k.field_g = 10;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (7 == var4) {
                  aa.a(-126, ii.a(false));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 != 8) {
                  break L12;
                } else {
                  ad.a(ii.a(false), true);
                  break L12;
                }
              }
              L13: {
                if (-10 == (var4 ^ -1)) {
                  m.a((byte) -79, ii.a(false));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (-11 != (var4 ^ -1)) {
                  break L14;
                } else {
                  gf.field_c.b(true, 17);
                  break L14;
                }
              }
              L15: {
                if ((var4 ^ -1) != -12) {
                  break L15;
                } else {
                  l.a(ii.a(false), -120);
                  break L15;
                }
              }
              L16: {
                if (12 != var4) {
                  break L16;
                } else {
                  k.a(ii.a(false), (byte) 91, pj.b(true));
                  break L16;
                }
              }
              L17: {
                if (13 == var4) {
                  try {
                    L18: {
                      L19: {
                        if (null == ec.field_e) {
                          ec.field_e = new qa(rc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (ec.field_e.c(90)) {
                          L21: {
                            var12 = ec.field_e.a(18);
                            if (var12 != null) {
                              var7 = sc.a(var12.field_g, var12.field_h, 78, 0);
                              ki.a(-125, var7);
                              break L21;
                            } else {
                              var9 = (String) null;
                              ki.a(44, (String) null);
                              break L21;
                            }
                          }
                          ec.field_e = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      break L18;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L22: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      kk.a("S1", (byte) 67, (Throwable) ((Object) var5));
                      var10 = (String) null;
                      ki.a(67, (String) null);
                      ec.field_e = null;
                      break L22;
                    }
                  }
                  break L17;
                } else {
                  break L17;
                }
              }
              L23: {
                if (var4 != 15) {
                  break L23;
                } else {
                  k.field_g = 10;
                  break L23;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (-18 == (var4 ^ -1)) {
                  return 2;
                } else {
                  return 0;
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
