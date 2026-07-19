/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends fb {
    private fh field_s;
    static String[] field_t;

    public static void d(byte param0) {
        int var1 = 69 % ((param0 - -39) / 53);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ka stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ka stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            ka stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            int stackIn_8_2 = 0;
            Throwable decompiledCaughtException = null;
            ka stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            ka stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int stackOut_7_2 = 0;
            ka stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            if (this.field_s == null) {
              return;
            } else {
              if (param0 == 24215) {
                try {
                  L0: {
                    L1: {
                      this.field_c.field_k = 0;
                      stackOut_5_0 = this.field_c;
                      stackOut_5_1 = 0;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (!param1) {
                        stackOut_7_0 = (ka) ((Object) stackIn_7_0);
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L1;
                      } else {
                        stackOut_6_0 = (ka) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 2;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L1;
                      }
                    }
                    ((ka) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2);
                    this.field_c.a(param0 + -24175, 0L);
                    this.field_s.a(this.field_c.field_r, 0, 121, this.field_c.field_r.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        this.field_s.a(true);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    this.field_s = null;
                    this.field_g = -2;
                    this.field_i = this.field_i + 1;
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public wj() {
    }

    final static int a(String param0, int param1, boolean param2, String param3, byte param4, boolean param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            Object discarded$10 = null;
            Object discarded$11 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            String var7_ref_String = null;
            int var8 = 0;
            Throwable var9_ref_Throwable = null;
            int var9 = 0;
            int var10 = 0;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_5_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_94_0 = 0;
            RuntimeException stackIn_96_0 = null;
            StringBuilder stackIn_96_1 = null;
            RuntimeException stackIn_97_0 = null;
            StringBuilder stackIn_97_1 = null;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            String stackIn_98_2 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            String stackIn_101_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_93_0 = 0;
            RuntimeException stackOut_95_0 = null;
            StringBuilder stackOut_95_1 = null;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            String stackOut_97_2 = null;
            RuntimeException stackOut_96_0 = null;
            StringBuilder stackOut_96_1 = null;
            String stackOut_96_2 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            String stackOut_99_2 = null;
            var10 = stellarshard.field_B;
            try {
              L0: {
                L1: {
                  if (ob.field_b != null) {
                    break L1;
                  } else {
                    if (!nh.a(-1, param5)) {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (sl.field_d == oa.field_C) {
                    L3: {
                      if (!param5) {
                        le.field_n = h.a(param0, (byte) -117, false, param3);
                        break L3;
                      } else {
                        var11 = (String) null;
                        le.field_n = wf.a(we.field_a, (String) null, -124, param0, false);
                        break L3;
                      }
                    }
                    pg.field_fb.field_k = 0;
                    pg.field_fb.a(false, 14);
                    pg.field_fb.a(false, le.field_n.a(160).field_h);
                    ue.a((byte) 114, -1);
                    sl.field_d = de.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  var6_int = 119 / ((param4 - -28) / 43);
                  if (sl.field_d == de.field_a) {
                    if (qe.b(64, 1)) {
                      var7 = ae.field_N.f(4);
                      ae.field_N.field_k = 0;
                      if (var7 == 0) {
                        sl.field_d = vg.field_p;
                        break L4;
                      } else {
                        sl.field_d = ih.field_a;
                        ue.field_b = -1;
                        ja.field_t = var7;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (sl.field_d != vg.field_p) {
                    break L5;
                  } else {
                    if (!qe.b(64, 8)) {
                      break L5;
                    } else {
                      ob.field_a = ae.field_N.d(0);
                      ae.field_N.field_k = 0;
                      cd.a(54, param2, le.field_n, param1, param5);
                      sl.field_d = lb.field_o;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (sl.field_d == lb.field_o) {
                    if (!qe.b(64, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var7 = ae.field_N.f(4);
                        ja.field_t = var7;
                        pk.field_b = null;
                        ae.field_N.field_k = 0;
                        if (-1 == (var7 ^ -1)) {
                          break L7;
                        } else {
                          if (-2 == (var7 ^ -1)) {
                            break L7;
                          } else {
                            if (8 != var7) {
                              sl.field_d = ih.field_a;
                              ue.field_b = -1;
                              break L6;
                            } else {
                              oj.c(-2290);
                              ta.field_u = false;
                              stackOut_28_0 = var7;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                      ue.field_b = -1;
                      sl.field_d = ge.field_m;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (sl.field_d != ge.field_m) {
                    break L8;
                  } else {
                    if (cd.e((byte) 125)) {
                      L9: {
                        we.field_a = ae.field_N.d(0);
                        ph.field_D = ae.field_N.f(4);
                        discarded$6 = ae.field_N.f(4);
                        mk.field_k = ae.field_N.c((byte) 56);
                        var7_ref_String = ae.field_N.a(0);
                        var8 = ae.field_N.f(4);
                        if ((var8 & 1) != 0) {
                          nd.g(-26923);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param5) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == (8 & var8 ^ -1)) {
                              stackOut_41_0 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              break L11;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L11;
                            }
                          }
                          L12: {
                            wd.field_c = stackIn_42_0 != 0;
                            if ((var8 & 4) == 0) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L12;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L12;
                            }
                          }
                          ta.field_n = stackIn_45_0 != 0;
                          if (wd.field_c) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        if (!tl.field_b) {
                          break L13;
                        } else {
                          discarded$7 = ae.field_N.f(4);
                          discarded$8 = ae.field_N.f(4);
                          discarded$9 = ae.field_N.b(false);
                          aj.field_a = ae.field_N.c((byte) 107);
                          bf.field_a = new byte[aj.field_a];
                          var9 = 0;
                          L14: while (true) {
                            if (aj.field_a <= var9) {
                              break L13;
                            } else {
                              bf.field_a[var9] = ae.field_N.g(102);
                              var9++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        wf.field_b = ae.field_N.e((byte) 97);
                        var12 = (CharSequence) ((Object) wf.field_b);
                        wb.field_b = nh.a(var12, false);
                        ag.field_c = ae.field_N.f(4);
                        sl.field_d = la.field_O;
                        if (le.field_n.a(160) != hc.field_s) {
                          if (le.field_n.a(160) == ea.field_o) {
                            ak.field_d.a(hf.a((byte) -34), (byte) 73);
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          kk.field_k.a(hf.a((byte) -8), (byte) 73);
                          break L15;
                        }
                      }
                      L16: {
                        ta.field_u = false;
                        if (var7_ref_String == null) {
                          break L16;
                        } else {
                          dj.a(false, hf.a((byte) -112), var7_ref_String);
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (0 < mk.field_k) {
                            break L18;
                          } else {
                            if (!ta.field_n) {
                              try {
                                L19: {
                                  discarded$10 = sh.a("unzap", hf.a((byte) -24), (byte) 78);
                                  break L19;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L20: {
                                  var9_ref_Throwable = decompiledCaughtException;
                                  break L20;
                                }
                              }
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        try {
                          L21: {
                            discarded$11 = sh.a(new Object[]{cj.a(we.field_a, (byte) -66)}, false, "zap", hf.a((byte) -62));
                            break L21;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L22: {
                            var9_ref_Throwable = decompiledCaughtException;
                            break L22;
                          }
                        }
                        break L17;
                      }
                      L23: {
                        if (0 >= mk.field_k) {
                          break L23;
                        } else {
                          uj.field_f = true;
                          break L23;
                        }
                      }
                      pg.field_fb.a(dj.field_b, -1001);
                      var9 = 0;
                      L24: while (true) {
                        if (4 <= var9) {
                          ae.field_N.a(dj.field_b, -1001);
                          stackOut_71_0 = ja.field_t;
                          stackIn_72_0 = stackOut_71_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          dj.field_b[var9] = dj.field_b[var9] + 50;
                          var9++;
                          continue L24;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L25: {
                  if (ih.field_a == sl.field_d) {
                    if (!cd.e((byte) 123)) {
                      break L25;
                    } else {
                      L26: {
                        oj.c(-2290);
                        if (ja.field_t != 7) {
                          break L26;
                        } else {
                          if (!ta.field_u) {
                            ta.field_u = true;
                            stackOut_83_0 = -1;
                            stackIn_84_0 = stackOut_83_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (7 != ja.field_t) {
                          break L27;
                        } else {
                          ja.field_t = 3;
                          break L27;
                        }
                      }
                      ga.field_a = ae.field_N.e((byte) 116);
                      ta.field_u = false;
                      stackOut_81_0 = ja.field_t;
                      stackIn_82_0 = stackOut_81_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L25;
                  }
                }
                L28: {
                  if (ob.field_b != null) {
                    break L28;
                  } else {
                    if (ta.field_u) {
                      L29: {
                        if ((tk.b(125) ^ -1L) >= -30001L) {
                          ga.field_a = wb.field_h;
                          break L29;
                        } else {
                          ga.field_a = hj.field_a;
                          break L29;
                        }
                      }
                      ta.field_u = false;
                      stackOut_91_0 = 3;
                      stackIn_92_0 = stackOut_91_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var7 = ue.field_d;
                      ue.field_d = wd.field_a;
                      wd.field_a = var7;
                      ta.field_u = true;
                      break L28;
                    }
                  }
                }
                stackOut_93_0 = -1;
                stackIn_94_0 = stackOut_93_0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_95_0 = (RuntimeException) (var6);
                stackOut_95_1 = new StringBuilder().append("wj.D(");
                stackIn_97_0 = stackOut_95_0;
                stackIn_97_1 = stackOut_95_1;
                stackIn_96_0 = stackOut_95_0;
                stackIn_96_1 = stackOut_95_1;
                if (param0 == null) {
                  stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
                  stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
                  stackOut_97_2 = "null";
                  stackIn_98_0 = stackOut_97_0;
                  stackIn_98_1 = stackOut_97_1;
                  stackIn_98_2 = stackOut_97_2;
                  break L30;
                } else {
                  stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
                  stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
                  stackOut_96_2 = "{...}";
                  stackIn_98_0 = stackOut_96_0;
                  stackIn_98_1 = stackOut_96_1;
                  stackIn_98_2 = stackOut_96_2;
                  break L30;
                }
              }
              L31: {
                stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
                stackOut_98_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_98_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_100_0 = stackOut_98_0;
                stackIn_100_1 = stackOut_98_1;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                if (param3 == null) {
                  stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
                  stackOut_100_2 = "null";
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  break L31;
                } else {
                  stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackOut_99_2 = "{...}";
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_101_1 = stackOut_99_1;
                  stackIn_101_2 = stackOut_99_2;
                  break L31;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_72_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_82_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_84_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_92_0;
                      } else {
                        return stackIn_94_0;
                      }
                    }
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

    final boolean f(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ph var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ph var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_85_0 = 0;
            L0: {
              var16 = stellarshard.field_B;
              if (null != this.field_s) {
                L1: {
                  var2_long = ih.a((byte) -98);
                  var4 = (int)(var2_long + -this.field_l);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_l = var2_long;
                this.field_m = this.field_m + var4;
                if (-30001 > (this.field_m ^ -1)) {
                  try {
                    L2: {
                      this.field_s.a(true);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (this.field_s == null) {
              if (-1 != (this.b((byte) -123) ^ -1)) {
                return false;
              } else {
                if (-1 == (this.a(param0 ^ 26348) ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_s.c(param0 + 32614);
                  var2_ref = (ph) ((Object) this.field_o.a(false));
                  L5: while (true) {
                    if (var2_ref == null) {
                      L6: {
                        if (param0 == 26348) {
                          break L6;
                        } else {
                          wj.d((byte) 71);
                          break L6;
                        }
                      }
                      var2_ref = (ph) ((Object) this.field_j.a(false));
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var2_int >= 100) {
                                break L9;
                              } else {
                                var3_int = this.field_s.b(-93);
                                if ((var3_int ^ -1) <= -1) {
                                  if (-1 != (var3_int ^ -1)) {
                                    L10: {
                                      this.field_m = 0;
                                      var4 = 0;
                                      if (this.field_r == null) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_r.field_C != 0) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (0 < var4) {
                                        L12: {
                                          var5 = -this.field_a.field_k + var4;
                                          if (var3_int >= var5) {
                                            break L12;
                                          } else {
                                            var5 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_s.a(this.field_a.field_k, (byte) -64, this.field_a.field_r, var5);
                                          if (0 == this.field_p) {
                                            break L13;
                                          } else {
                                            var6 = 0;
                                            L14: while (true) {
                                              if (var5 <= var6) {
                                                break L13;
                                              } else {
                                                this.field_a.field_r[var6 + this.field_a.field_k] = (byte)ih.a((int) this.field_a.field_r[var6 + this.field_a.field_k], (int) this.field_p);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        this.field_a.field_k = this.field_a.field_k + var5;
                                        if (var4 > this.field_a.field_k) {
                                          break L11;
                                        } else {
                                          if (null != this.field_r) {
                                            if (this.field_r.field_C != 0) {
                                              throw new IOException();
                                            } else {
                                              if (0 == (this.field_a.field_r[0] ^ -1)) {
                                                this.field_a.field_k = 0;
                                                this.field_r.field_C = 1;
                                                break L11;
                                              } else {
                                                this.field_r = null;
                                                break L11;
                                              }
                                            }
                                          } else {
                                            L15: {
                                              this.field_a.field_k = 0;
                                              var6 = this.field_a.f(4);
                                              var7 = this.field_a.b(false);
                                              var8 = this.field_a.f(4);
                                              var9 = this.field_a.b(false);
                                              var10 = 127 & var8;
                                              if (-1 == (var8 & 128 ^ -1)) {
                                                stackOut_61_0 = 0;
                                                stackIn_62_0 = stackOut_61_0;
                                                break L15;
                                              } else {
                                                stackOut_60_0 = 1;
                                                stackIn_62_0 = stackOut_60_0;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_62_0;
                                              var12 = ((long)var6 << 1884392736) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ph) ((Object) this.field_k.a(false));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if ((var12 ^ -1L) == (var14_ref.field_o ^ -1L)) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (ph) ((Object) this.field_k.a(-102));
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ph) ((Object) this.field_q.a(false));
                                                L18: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
                                                      var14_ref = (ph) ((Object) this.field_q.a(param0 ^ -26262));
                                                      continue L18;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L19: {
                                                this.field_r = var14_ref;
                                                if (var10 != 0) {
                                                  stackOut_77_0 = 9;
                                                  stackIn_78_0 = stackOut_77_0;
                                                  break L19;
                                                } else {
                                                  stackOut_76_0 = 5;
                                                  stackIn_78_0 = stackOut_76_0;
                                                  break L19;
                                                }
                                              }
                                              var15 = stackIn_78_0;
                                              this.field_r.field_G = new ka(var15 + var9 - -this.field_r.field_F);
                                              this.field_r.field_G.a(false, var10);
                                              this.field_r.field_G.b(0, var9);
                                              this.field_a.field_k = 0;
                                              this.field_r.field_C = 10;
                                              break L11;
                                            }
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var5 = -this.field_r.field_F + this.field_r.field_G.field_r.length;
                                          var6 = -this.field_r.field_C + 512;
                                          if (var6 > -this.field_r.field_G.field_k + var5) {
                                            var6 = -this.field_r.field_G.field_k + var5;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          this.field_s.a(this.field_r.field_G.field_k, (byte) -64, this.field_r.field_G.field_r, var6);
                                          if (-1 != (this.field_p ^ -1)) {
                                            var7 = 0;
                                            L23: while (true) {
                                              if (var7 >= var6) {
                                                break L22;
                                              } else {
                                                this.field_r.field_G.field_r[this.field_r.field_G.field_k + var7] = (byte)ih.a((int) this.field_r.field_G.field_r[this.field_r.field_G.field_k + var7], (int) this.field_p);
                                                var7++;
                                                continue L23;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                        this.field_r.field_G.field_k = this.field_r.field_G.field_k + var6;
                                        this.field_r.field_C = this.field_r.field_C + var6;
                                        if (var5 != this.field_r.field_G.field_k) {
                                          if ((this.field_r.field_C ^ -1) != -513) {
                                            break L11;
                                          } else {
                                            this.field_r.field_C = 0;
                                            break L11;
                                          }
                                        } else {
                                          this.field_r.c((byte) 36);
                                          this.field_r.field_w = false;
                                          this.field_r = null;
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            stackOut_85_0 = 1;
                            stackIn_86_0 = stackOut_85_0;
                            break L4;
                          }
                        } else {
                          this.field_c.field_k = 0;
                          this.field_c.a(false, 0);
                          this.field_c.a(param0 + -26250, var2_ref.field_o);
                          this.field_s.a(this.field_c.field_r, 0, 114, this.field_c.field_r.length);
                          this.field_k.a((byte) 126, var2_ref);
                          var2_ref = (ph) ((Object) this.field_j.a(-121));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_c.field_k = 0;
                      this.field_c.a(false, 1);
                      this.field_c.a(116, var2_ref.field_o);
                      this.field_s.a(this.field_c.field_r, 0, 107, this.field_c.field_r.length);
                      this.field_q.a((byte) 125, var2_ref);
                      var2_ref = (ph) ((Object) this.field_o.a(-116));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_s.a(true);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  this.field_g = -2;
                  this.field_s = null;
                  this.field_i = this.field_i + 1;
                  if (this.b((byte) -93) != 0) {
                    break L26;
                  } else {
                    if (this.a(param0 ^ 26348) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_86_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == this.field_s) {
              return;
            } else {
              L0: {
                if (param0 == -84) {
                  break L0;
                } else {
                  this.a(34, true);
                  break L0;
                }
              }
              try {
                L1: {
                  this.field_c.field_k = 0;
                  this.field_c.a(false, 6);
                  this.field_c.b(3, (byte) 119);
                  this.field_c.c(0, -121);
                  this.field_s.a(this.field_c.field_r, 0, 110, this.field_c.field_r.length);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_s.a(true);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_s = null;
                  this.field_i = this.field_i + 1;
                  this.field_g = -2;
                  break L2;
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

    final static void h(int param0) {
        Boolean discarded$0 = null;
        if (param0 > -124) {
            discarded$0 = wj.g(-16);
        }
        if (!cg.field_a) {
            throw new IllegalStateException();
        }
        qh.field_d = true;
        va.a(false, -844);
        eg.field_d = 0;
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            ph var4_ref2 = null;
            int var4_int = 0;
            IOException var5 = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = stellarshard.field_B;
            try {
              L0: {
                L1: {
                  if (this.field_s == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_s.a(true);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_s = null;
                    break L1;
                  }
                }
                this.field_s = (fh) (param1);
                this.e((byte) -84);
                this.a(24215, param0);
                this.field_r = null;
                this.field_a.field_k = 0;
                L4: while (true) {
                  var4_ref2 = (ph) ((Object) this.field_q.a((byte) 110));
                  if (var4_ref2 != null) {
                    this.field_o.a((byte) 124, var4_ref2);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref2 = (ph) ((Object) this.field_k.a((byte) 61));
                      if (var4_ref2 == null) {
                        L6: {
                          var4_int = -48 % ((-59 - param2) / 61);
                          if (this.field_p == 0) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_c.field_k = 0;
                                this.field_c.a(false, 4);
                                this.field_c.a(false, (int) this.field_p);
                                this.field_c.b(0, 0);
                                this.field_s.a(this.field_c.field_r, 0, 111, this.field_c.field_r.length);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var5 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_s.a(true);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var6 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_g = -2;
                                this.field_s = null;
                                this.field_i = this.field_i + 1;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        this.field_m = 0;
                        this.field_l = ih.a((byte) -98);
                        break L0;
                      } else {
                        this.field_j.a((byte) 125, var4_ref2);
                        continue L5;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var4_ref);
                stackOut_22_1 = new StringBuilder().append("wj.C(").append(param0).append(',');
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param1 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
            this.field_s.a(true);
        } catch (Exception exception) {
        }
        this.field_g = -1;
        this.field_s = null;
        if (param0 > -101) {
            return;
        }
        this.field_i = this.field_i + 1;
        this.field_p = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void c(byte param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        pb var2_ref_pb = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        pb var9 = null;
        int var10 = 0;
        pb var11 = null;
        pb var12 = null;
        String var14 = null;
        pb var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (nh.field_g == null) {
                break L1;
              } else {
                if (!nh.field_g.a((byte) -36)) {
                  break L1;
                } else {
                  if (!nh.field_g.a("benefits", (byte) -109)) {
                    break L1;
                  } else {
                    if (vf.field_E == null) {
                      break L1;
                    } else {
                      if (!vf.field_E.a((byte) -36)) {
                        break L1;
                      } else {
                        if (vf.field_E.a("benefits", (byte) -109)) {
                          tk.field_c = qd.a(nh.field_g, "headline", "benefits", (byte) 81);
                          pl.field_T = qd.a(nh.field_g, "blurbpane", "benefits", (byte) 78);
                          fe.field_a = qd.a(nh.field_g, "button", "benefits", (byte) 78);
                          dd.field_a = qd.a(nh.field_g, "signup_text", "benefits", (byte) 57);
                          na.field_e = qd.a(nh.field_g, "menu_text", "benefits", (byte) 42);
                          ui.field_F = qd.a(nh.field_g, "button_frame", "benefits", (byte) 59);
                          ea.field_l = qd.a(nh.field_g, "arrow", "benefits", (byte) 118);
                          o.field_h = (bd) ((Object) ae.a("benefits", "large_font", nh.field_g, -109, vf.field_E));
                          fj.field_f = (bd) ((Object) ae.a("benefits", "small_font", nh.field_g, -116, vf.field_E));
                          var27 = ti.field_a;
                          var2 = ti.field_i;
                          var3 = ti.field_b;
                          ti.a(pk.field_i);
                          var11 = new pb(ea.field_l.field_v + 4, ea.field_l.field_y + 4);
                          var11.e();
                          ea.field_l.c(2, 2, ki.field_x);
                          oj.a(var11, 1, 0, var11.field_y, 2, 0, var11.field_v, true);
                          ea.field_l = var11;
                          bk.field_b = ea.field_l.f();
                          var12 = new pb(195, 221);
                          var6 = var12.field_v / 2;
                          var12.e();
                          o.field_h.c(h.a(ph.field_E, 0, new String[]{vd.field_d}), var6, 40, 16777215, -1);
                          fj.field_f.c(h.a(ch.field_c, 0, new String[]{vd.field_d}), var6, 60, 16777215, -1);
                          o.field_h.c(h.a(vd.field_a, 0, new String[]{vg.field_r}), var6, 110, 16777215, -1);
                          fj.field_f.c(h.a(rb.field_t, 0, new String[]{vg.field_r}), var6, 130, 16777215, -1);
                          o.field_h.c(cm.field_b, var6, 180, 16777215, -1);
                          fj.field_f.c(nl.field_d, var6, 200, 16777215, -1);
                          oj.a(var12, 1, 0, var12.field_y, 3, 0, var12.field_v, true);
                          pl.field_T.e();
                          var12.e(-pl.field_T.field_t + 18, 241 - pl.field_T.field_s);
                          var7 = 0;
                          L2: while (true) {
                            if (pk.field_d.length <= var7) {
                              pk.field_d = null;
                              q.field_b = dd.field_a.a();
                              q.field_b.e();
                              ob.a(117, 0, 64, ti.field_i, ti.field_b * 2 / 3, 0);
                              ti.a(var27, var2, var3);
                              ti.b(pk.field_i);
                              wc.field_y = 231 + (fe.field_a.field_v - ui.field_F.field_v) / 2;
                              cm.field_a = (fe.field_a.field_v - ui.field_F.field_v) / 2 + 434;
                              af.field_l = (fe.field_a.field_y + -ui.field_F.field_y) / 2 + 390;
                              nh.field_g = null;
                              vi.field_a = 390 - -((-ui.field_F.field_y + fe.field_a.field_y) / 2);
                              break L1;
                            } else {
                              dl.field_C[var7].e();
                              discarded$3 = fj.field_f.a(pk.field_d[var7], 3, 3, -6 + dl.field_C[var7].field_v, dl.field_C[var7].field_y + -6, ki.field_x, -1, 1, 1, fj.field_f.field_N + fj.field_f.field_r);
                              oj.a(dl.field_C[var7], 1, 0, dl.field_C[var7].field_y, 3, 0, dl.field_C[var7].field_v, true);
                              var7++;
                              continue L2;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (ve.field_a != null) {
              L3: {
                if (null == ug.field_f) {
                  break L3;
                } else {
                  if (null != o.field_h) {
                    L4: {
                      var28 = ti.field_a;
                      var2 = ti.field_i;
                      var3 = ti.field_b;
                      ti.a(pk.field_i);
                      var14 = h.a(hj.field_b, 0, new String[]{ai.field_a[ic.field_a]});
                      var5 = o.field_h.b(var14, vh.field_i);
                      var6 = o.field_h.b(var14, vh.field_i, o.field_h.field_N - -o.field_h.field_r);
                      var7 = (vh.field_i + -var5) / 2 + kk.field_o;
                      var8 = (i.field_a - var6) / 2 + vi.field_d;
                      var7 -= 3;
                      var5 += 6;
                      var6 += 6;
                      var8 -= 3;
                      if (-1 < (var7 ^ -1)) {
                        var9_int = -var7;
                        var7 = var7 + var9_int;
                        ug.field_f.field_w = ug.field_f.field_w + 2 * var9_int;
                        pk.field_g = pk.field_g - var9_int;
                        var5 = var5 + var9_int * 2;
                        ug.field_f.field_t = ug.field_f.field_t + var9_int;
                        kk.field_o = kk.field_o + var9_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 + var7 <= ug.field_f.field_w) {
                        break L5;
                      } else {
                        var9_int = var5 + var7 - ug.field_f.field_w;
                        ug.field_f.field_w = ug.field_f.field_w + var9_int * 2;
                        var5 = var5 + 2 * var9_int;
                        pk.field_g = pk.field_g - var9_int;
                        kk.field_o = kk.field_o + var9_int;
                        var7 = var7 + var9_int;
                        ug.field_f.field_t = ug.field_f.field_t + var9_int;
                        break L5;
                      }
                    }
                    L6: {
                      if ((var8 ^ -1) <= -1) {
                        break L6;
                      } else {
                        var9_int = -var8;
                        vi.field_d = vi.field_d + var9_int;
                        var8 = var8 + var9_int;
                        ug.field_f.field_x = ug.field_f.field_x + 2 * var9_int;
                        var6 = var6 + 2 * var9_int;
                        t.field_a = t.field_a - var9_int;
                        ug.field_f.field_s = ug.field_f.field_s + var9_int;
                        break L6;
                      }
                    }
                    L7: {
                      if (ug.field_f.field_x < var6 + var8) {
                        var9_int = -ug.field_f.field_x + var8 + var6;
                        ug.field_f.field_s = ug.field_f.field_s + var9_int;
                        ug.field_f.field_x = ug.field_f.field_x + var9_int * 2;
                        var6 = var6 + 2 * var9_int;
                        var8 = var8 + var9_int;
                        t.field_a = t.field_a - var9_int;
                        vi.field_d = vi.field_d + var9_int;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ug.field_f.b();
                    var9 = new pb(ug.field_f.field_w, ug.field_f.field_x);
                    var9.e();
                    discarded$4 = o.field_h.a(var14, kk.field_o, vi.field_d, vh.field_i, i.field_a, 16777215, -1, 1, 1, o.field_h.field_N + o.field_h.field_r);
                    oj.a(var9, 1, 0, var9.field_x, 3, 0, var9.field_w, true);
                    ug.field_f.e();
                    var9.e(0, 0);
                    jd.field_a = new pb(640, 480);
                    jd.field_a.e();
                    ug.field_f.b(pk.field_g + (ug.field_f.field_w >> -792135007), (ug.field_f.field_x >> 125884513) + t.field_a, bl.field_d, 4096);
                    ug.field_f = null;
                    jd.field_a.d();
                    ti.a(var28, var2, var3);
                    ti.b(pk.field_i);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                if (be.field_f == null) {
                  break L8;
                } else {
                  if (null != fj.field_f) {
                    var29 = ti.field_a;
                    var2 = ti.field_i;
                    var3 = ti.field_b;
                    ti.a(pk.field_i);
                    var16 = new pb(412, 43);
                    var5_ref_String = h.a(wg.field_b, 0, new String[]{be.field_f});
                    be.field_f = null;
                    var16.e();
                    discarded$5 = fj.field_f.a(var5_ref_String, 3, 3, -6 + var16.field_v, var16.field_y - 6, 16777215, -1, 0, 1, fj.field_f.field_r + fj.field_f.field_N);
                    oj.a(var16, 1, 0, var16.field_y, 3, 0, var16.field_v, true);
                    ve.field_a.e();
                    var16.e(199 + -ve.field_a.field_t, 83 - ve.field_a.field_s);
                    ti.a(var29, var2, var3);
                    ti.b(pk.field_i);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (null == eh.field_f) {
                  break L9;
                } else {
                  if (null == fj.field_f) {
                    break L9;
                  } else {
                    var30 = ti.field_a;
                    var2 = ti.field_i;
                    var3 = ti.field_b;
                    ti.a(pk.field_i);
                    var4 = 6 + fj.field_f.b(li.field_a, 640);
                    var5 = 20 + eh.field_f.field_w + var4;
                    var6 = 427 + -(var5 / 2);
                    var7 = 20 + (var6 - -eh.field_f.field_w);
                    ve.field_a.e();
                    fj.field_f.a(li.field_a, var7 - ve.field_a.field_t, fj.field_f.field_r + -ve.field_a.field_s + (155 - -fj.field_f.field_N), 16777215, -1);
                    oj.a(ve.field_a, 1, -4 + (var7 - ve.field_a.field_t), 50, 3, 155 + -ve.field_a.field_s, var4, true);
                    var8 = -ve.field_a.field_s + (155 - (-fj.field_f.field_r + -fj.field_f.field_N + (-3 + eh.field_f.field_x)) / 2);
                    eh.field_f.e(-ve.field_a.field_t + var6, var8);
                    ti.a(var30, var2, var3);
                    ti.b(pk.field_i);
                    eh.field_f = null;
                    break L9;
                  }
                }
              }
              L10: {
                ti.a(pk.field_i);
                ti.a(16, 16, 608, 112, 15, ki.field_t, jb.field_a);
                ti.a(231, 144, 393, 232, 15, ki.field_t, jb.field_a);
                if (null != tk.field_c) {
                  tk.field_c.e(0, 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (null == pl.field_T) {
                  break L11;
                } else {
                  pl.field_T.e(0, 0);
                  break L11;
                }
              }
              L12: {
                ve.field_a.e(0, 0);
                var1_int = -52 % ((2 - param0) / 55);
                if (jd.field_a == null) {
                  break L12;
                } else {
                  jd.field_a.e(0, 0);
                  break L12;
                }
              }
              L13: {
                if (null == fe.field_a) {
                  break L13;
                } else {
                  if (null == ui.field_F) {
                    break L13;
                  } else {
                    L14: {
                      fe.field_a.e(231, 390);
                      var2_ref_pb = dd.field_a;
                      if (cd.field_L.field_f != 0) {
                        break L14;
                      } else {
                        var2_ref_pb = q.field_b;
                        break L14;
                      }
                    }
                    L15: {
                      var2_ref_pb.e(0, 0);
                      stackOut_46_0 = 40;
                      stackOut_46_1 = 40;
                      stackOut_46_2 = gj.field_v;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_48_2 = stackOut_46_2;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      if (cd.field_L.field_f == 0) {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = stackIn_48_2;
                        stackOut_48_3 = 4;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        stackIn_49_3 = stackOut_48_3;
                        break L15;
                      } else {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = stackIn_47_2;
                        stackOut_47_3 = 3;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        stackIn_49_3 = stackOut_47_3;
                        break L15;
                      }
                    }
                    L16: {
                      var3 = stackIn_49_0 + (stackIn_49_1 * ih.b(stackIn_49_2 << stackIn_49_3, 64763) >> 743059824);
                      if (var3 <= 0) {
                        break L16;
                      } else {
                        fe.field_a.d(230, 389, var3);
                        fe.field_a.d(232, 389, var3);
                        fe.field_a.d(232, 391, var3);
                        fe.field_a.d(230, 391, var3);
                        var2_ref_pb.d(1, 1, var3);
                        var2_ref_pb.d(-1, 1, var3);
                        var2_ref_pb.d(1, -1, var3);
                        var2_ref_pb.d(-1, -1, var3);
                        break L16;
                      }
                    }
                    L17: {
                      if (-1 != (cd.field_L.field_f ^ -1)) {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        break L17;
                      } else {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        break L17;
                      }
                    }
                    tk.a(stackIn_54_0 != 0, wc.field_y, vi.field_a, -127);
                    break L13;
                  }
                }
              }
              L18: {
                if (null == fe.field_a) {
                  break L18;
                } else {
                  if (null == ui.field_F) {
                    break L18;
                  } else {
                    L19: {
                      fe.field_a.e(434, 390);
                      na.field_e.e(0, 0);
                      if (1 == cd.field_L.field_f) {
                        ob.a(116, 436, 64, fe.field_a.field_v + -4, 7 * fe.field_a.field_y / 12, 392);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (1 != cd.field_L.field_f) {
                        stackOut_62_0 = 0;
                        stackIn_63_0 = stackOut_62_0;
                        break L20;
                      } else {
                        stackOut_61_0 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        break L20;
                      }
                    }
                    tk.a(stackIn_63_0 != 0, cm.field_a, af.field_l, -108);
                    break L18;
                  }
                }
              }
              L21: {
                L22: {
                  if (null == ea.field_l) {
                    break L22;
                  } else {
                    var2 = 357 + -(ea.field_l.field_x / 2);
                    ea.field_l.e(-ea.field_l.field_w + 269, var2);
                    bk.field_b.e(586, var2);
                    if (var2 >= eb.field_a) {
                      break L22;
                    } else {
                      if (eb.field_a < ea.field_l.field_y + var2) {
                        var3 = 40 - -(ih.b(gj.field_v << 277731588, 64763) * 40 >> -770925168);
                        if (-1 > (var3 ^ -1)) {
                          L23: {
                            if (-ea.field_l.field_v + 269 >= ni.field_e) {
                              break L23;
                            } else {
                              if (-270 < (ni.field_e ^ -1)) {
                                ea.field_l.d(-ea.field_l.field_w + 268, -1 + var2, var3);
                                ea.field_l.d(1 + (-ea.field_l.field_w + 269), -1 + var2, var3);
                                ea.field_l.d(-1 + (-ea.field_l.field_w + 269), 1 + var2, var3);
                                ea.field_l.d(-ea.field_l.field_w + 269 + 1, 1 + var2, var3);
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (-587 <= (ni.field_e ^ -1)) {
                            break L22;
                          } else {
                            if (586 - -ea.field_l.field_v <= ni.field_e) {
                              break L22;
                            } else {
                              bk.field_b.d(585, -1 + var2, var3);
                              bk.field_b.d(587, -1 + var2, var3);
                              bk.field_b.d(585, 1 + var2, var3);
                              bk.field_b.d(587, 1 + var2, var3);
                              break L22;
                            }
                          }
                        } else {
                          kc.a(36);
                          dl.field_C[nk.field_c].e(269, 340);
                          break L21;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                kc.a(36);
                dl.field_C[nk.field_c].e(269, 340);
                break L21;
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
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "wj.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static Boolean g(int param0) {
        Boolean discarded$0 = null;
        Boolean var1 = nb.field_M;
        nb.field_M = null;
        if (param0 >= -111) {
            discarded$0 = wj.g(115);
        }
        return var1;
    }

    final void a(byte param0) {
        if (param0 <= 82) {
            wj.d((byte) -54);
        }
        if (this.field_s != null) {
            this.field_s.a(true);
        }
    }

    static {
        field_t = new String[255];
    }
}
