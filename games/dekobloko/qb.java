/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb extends dd {
    static im field_r;
    static String field_t;
    private qk field_v;
    static ln field_s;
    static ck field_q;
    static int field_u;
    static w field_p;

    final void d(byte param0) {
        if (param0 < 107) {
            this.d((byte) 12);
        }
        if (!(null == this.field_v)) {
            this.field_v.a(0);
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            int var4_int = 0;
            IOException var5 = null;
            pj var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_v) {
                    try {
                      L2: {
                        this.field_v.a(0);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_v = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_v = (qk) (param0);
                this.e((byte) -15);
                this.a((byte) -124, param2);
                var4_int = -84 % ((param1 - -75) / 50);
                this.field_h = null;
                this.field_c.field_n = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      L7: {
                        var5_ref = (pj) ((Object) this.field_g.a((byte) -111));
                        if (var5_ref != null) {
                          break L7;
                        } else {
                          if (var7 != 0) {
                            break L6;
                          } else {
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      this.field_d.a(var5_ref, -7267);
                      break L6;
                    }
                    if (var7 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                  L8: while (true) {
                    L9: {
                      L10: {
                        var5_ref = (pj) ((Object) this.field_l.a((byte) -71));
                        if (var5_ref == null) {
                          break L10;
                        } else {
                          this.field_n.a(var5_ref, -7267);
                          if (var7 != 0) {
                            break L9;
                          } else {
                            if (var7 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (0 != this.field_f) {
                        try {
                          L11: {
                            this.field_i.field_n = 0;
                            this.field_i.a(true, 4);
                            this.field_i.a(true, (int) this.field_f);
                            this.field_i.a(0, false);
                            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                            break L11;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L12: {
                            var5 = (IOException) (Object) decompiledCaughtException;
                            try {
                              L13: {
                                this.field_v.a(0);
                                break L13;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L14: {
                                var6 = (Exception) (Object) decompiledCaughtException;
                                break L14;
                              }
                            }
                            this.field_j = this.field_j + 1;
                            this.field_o = -2;
                            this.field_v = null;
                            break L12;
                          }
                        }
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    this.field_b = 0;
                    this.field_e = ik.a(4);
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L15: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_30_0 = (RuntimeException) (var4_ref);
                stackOut_30_1 = new StringBuilder().append("qb.K(");
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param0 == null) {
                  stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
                  stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
                  stackOut_32_2 = "null";
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L15;
                } else {
                  stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
                  stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
                  stackOut_31_2 = "{...}";
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  break L15;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wl stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            wl stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            wl stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            wl stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            wl stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            wl stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (null != this.field_v) {
              try {
                L0: {
                  L1: {
                    this.field_i.field_n = 0;
                    stackOut_2_0 = this.field_i;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (!param1) {
                      stackOut_4_0 = (wl) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (wl) ((Object) stackIn_3_0);
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((wl) (Object) stackIn_5_0).a(stackIn_5_1 != 0, stackIn_5_2);
                  if (param0 < -108) {
                    this.field_i.a(-93, 0L);
                    this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_v.a(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_j = this.field_j + 1;
                  this.field_o = -2;
                  this.field_v = null;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
                return;
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

    final static int a(boolean param0, int param1, jg param2, int param3, int param4, jg param5, String param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int stackIn_4_0 = 0;
        wl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        wl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        wl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        wl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        wl stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        wl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        wl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        wl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        wl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        int stackOut_32_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var16 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var15 = param2.a((byte) 56);
              var12_ref_String = var15;
              var12_ref_String = var15;
              var8 = -65 / ((-58 - param3) / 43);
              var9 = param5.a((byte) 56);
              var12_ref_String = var9;
              var12_ref_String = var9;
              if (null != qc.field_s) {
                break L1;
              } else {
                if (mb.a(false, -75)) {
                  break L1;
                } else {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (ph.field_xb == ba.field_f) {
                L3: {
                  L4: {
                    wb.field_Ub = null;
                    we.field_b.field_n = 0;
                    if (param6 == null) {
                      break L4;
                    } else {
                      L5: {
                        var10 = 0;
                        if (!param0) {
                          break L5;
                        } else {
                          var10 = var10 | 1;
                          break L5;
                        }
                      }
                      L6: {
                        vi.field_A.field_n = 0;
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        vi.field_A.b(8, var15);
                        vi.field_A.b(8, var9);
                        var17 = (CharSequence) ((Object) param6);
                        vi.field_A.b(8, bc.a(var17, 65));
                        vi.field_A.d(-1, param4);
                        vi.field_A.a(true, param1);
                        vi.field_A.a(true, var10);
                        we.field_b.a(true, 18);
                        we.field_b.field_n = we.field_b.field_n + 2;
                        var11 = we.field_b.field_n;
                        var12_ref_String = a.a(se.h(25144), (byte) 121);
                        if (var12_ref_String != null) {
                          break L6;
                        } else {
                          var12_ref_String = "";
                          break L6;
                        }
                      }
                      we.field_b.a(0, var12_ref_String);
                      re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
                      we.field_b.b(true, -var11 + we.field_b.field_n);
                      if (var14 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    vi.field_A.field_n = 0;
                    vi.field_A.a(gg.field_A.nextInt(), false);
                    vi.field_A.a(gg.field_A.nextInt(), false);
                    stackOut_13_0 = vi.field_A;
                    stackOut_13_1 = 8;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (!param2.a(true)) {
                      stackOut_15_0 = (wl) ((Object) stackIn_15_0);
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = "";
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      break L7;
                    } else {
                      stackOut_14_0 = (wl) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = (String) (var15);
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      break L7;
                    }
                  }
                  L8: {
                    ((wl) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2);
                    stackOut_16_0 = vi.field_A;
                    stackOut_16_1 = 8;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (param5.a(true)) {
                      stackOut_18_0 = (wl) ((Object) stackIn_18_0);
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = (String) (var9);
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L8;
                    } else {
                      stackOut_17_0 = (wl) ((Object) stackIn_17_0);
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = "";
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      break L8;
                    }
                  }
                  ((wl) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                  we.field_b.a(true, 16);
                  we.field_b.field_n = we.field_b.field_n + 1;
                  var10 = we.field_b.field_n;
                  re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
                  we.field_b.b(-var10 + we.field_b.field_n, true);
                  break L3;
                }
                wj.c(4792, -1);
                ph.field_xb = kb.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L9: {
              if (kb.field_c != ph.field_xb) {
                break L9;
              } else {
                if (!pe.b(25973, 1)) {
                  break L9;
                } else {
                  L10: {
                    var10 = de.field_V.d((byte) -70);
                    de.field_V.field_n = 0;
                    if (var10 < 100) {
                      break L10;
                    } else {
                      if ((var10 ^ -1) >= -106) {
                        ph.field_xb = ll.field_a;
                        ph.field_Eb = new String[-100 + var10];
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var10 == 248) {
                      break L11;
                    } else {
                      L12: {
                        if (99 == var10) {
                          break L12;
                        } else {
                          sm.field_e = -1;
                          bh.field_k = var10;
                          ph.field_xb = rb.field_f;
                          if (var14 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      discarded$1 = pe.b(25973, vi.d(1));
                      wb.field_Ub = new Boolean(f.a(de.field_V, 19));
                      de.field_V.field_n = 0;
                      if (var14 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  jg.a(se.h(25144), 0);
                  rk.field_Y = tj.field_ic;
                  si.a(89);
                  jd.field_Qb = false;
                  stackOut_32_0 = var10;
                  stackIn_33_0 = stackOut_32_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L13: {
              if (ph.field_xb == ll.field_a) {
                var10 = 2;
                if (pe.b(25973, var10)) {
                  var11 = de.field_V.e(3);
                  de.field_V.field_n = 0;
                  if (!pe.b(25973, var11)) {
                    break L13;
                  } else {
                    var12 = ph.field_Eb.length;
                    var13 = 0;
                    L14: while (true) {
                      L15: {
                        if (var12 <= var13) {
                          si.a(60);
                          jd.field_Qb = false;
                          break L15;
                        } else {
                          ph.field_Eb[var13] = de.field_V.b(true);
                          var13++;
                          if (var14 != 0) {
                            break L15;
                          } else {
                            continue L14;
                          }
                        }
                      }
                      stackOut_46_0 = var12 + 100;
                      stackIn_47_0 = stackOut_46_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L16: {
              if (rb.field_f != ph.field_xb) {
                break L16;
              } else {
                if (!fh.a((byte) 117)) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      if (255 == bh.field_k) {
                        break L18;
                      } else {
                        rk.field_Y = de.field_V.c((byte) -38);
                        if (var14 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var10_ref_String = de.field_V.c(-16829);
                    if (var10_ref_String == null) {
                      break L17;
                    } else {
                      a.a(var10_ref_String, false, se.h(25144));
                      break L17;
                    }
                  }
                  si.a(105);
                  jd.field_Qb = false;
                  stackOut_55_0 = bh.field_k;
                  stackIn_56_0 = stackOut_55_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L19: {
              if (null == qc.field_s) {
                if (!jd.field_Qb) {
                  var10 = hc.field_a;
                  hc.field_a = ef.field_P;
                  jd.field_Qb = true;
                  ef.field_P = var10;
                  break L19;
                } else {
                  L20: {
                    L21: {
                      if (30000L < sl.a(-1)) {
                        break L21;
                      } else {
                        rk.field_Y = re.field_u;
                        if (var14 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    rk.field_Y = kh.field_f;
                    break L20;
                  }
                  jd.field_Qb = false;
                  stackOut_64_0 = 249;
                  stackIn_65_0 = stackOut_64_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L19;
              }
            }
            stackOut_67_0 = -1;
            stackIn_68_0 = stackOut_67_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var7);
            stackOut_69_1 = new StringBuilder().append("qb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L22;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L22;
            }
          }
          L23: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param5 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          L24: {
            stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param6 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L24;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L24;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_33_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_47_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_56_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_65_0;
                } else {
                  return stackIn_68_0;
                }
              }
            }
          }
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            pj var2_ref = null;
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
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_23_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_107_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_22_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_106_0 = 0;
            L0: {
              var16 = client.field_A ? 1 : 0;
              if (null != this.field_v) {
                L1: {
                  var2_long = ik.a(param0 ^ -52);
                  var4 = (int)(-this.field_e + var2_long);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_e = var2_long;
                this.field_b = this.field_b + var4;
                if (-30001 <= (this.field_b ^ -1)) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_v.a(0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_v = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != this.field_v) {
              try {
                L4: {
                  this.field_v.b((byte) -124);
                  var2_ref = (pj) ((Object) this.field_d.b(-2198));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_i.field_n = 0;
                          this.field_i.a(true, 1);
                          this.field_i.a(-71, var2_ref.field_r);
                          this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                          this.field_g.a(var2_ref, -7267);
                          var2_ref = (pj) ((Object) this.field_d.b((byte) 20));
                          if (var16 != 0) {
                            break L6;
                          } else {
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (param0 == -56) {
                        break L6;
                      } else {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    }
                    var2_ref = (pj) ((Object) this.field_n.b(-2198));
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_i.field_n = 0;
                          this.field_i.a(true, 0);
                          this.field_i.a(-98, var2_ref.field_r);
                          this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                          this.field_l.a(var2_ref, -7267);
                          var2_ref = (pj) ((Object) this.field_n.b((byte) 20));
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var2_int = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if ((var2_int ^ -1) <= -101) {
                              break L12;
                            } else {
                              var3_int = this.field_v.b(0);
                              stackOut_29_0 = -1;
                              stackIn_107_0 = stackOut_29_0;
                              stackIn_30_0 = stackOut_29_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_30_0 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  L13: {
                                    if (-1 != (var3_int ^ -1)) {
                                      break L13;
                                    } else {
                                      if (var16 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      this.field_b = 0;
                                      var4 = 0;
                                      if (null != this.field_h) {
                                        break L15;
                                      } else {
                                        var4 = 10;
                                        if (var16 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (0 != this.field_h.field_K) {
                                      break L14;
                                    } else {
                                      var4 = 1;
                                      break L14;
                                    }
                                  }
                                  L16: {
                                    if ((var4 ^ -1) >= -1) {
                                      L17: {
                                        var5 = -this.field_h.field_M + this.field_h.field_J.field_r.length;
                                        var6 = -this.field_h.field_K + 512;
                                        if (var6 > var5 + -this.field_h.field_J.field_n) {
                                          var6 = var5 + -this.field_h.field_J.field_n;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (var6 > var3_int) {
                                          var6 = var3_int;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        L20: {
                                          this.field_v.a(var6, this.field_h.field_J.field_n, (byte) 17, this.field_h.field_J.field_r);
                                          if (0 == this.field_f) {
                                            break L20;
                                          } else {
                                            var7 = 0;
                                            L21: while (true) {
                                              if (var7 >= var6) {
                                                break L20;
                                              } else {
                                                this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n] = (byte)qm.b((int) this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n], (int) this.field_f);
                                                var7++;
                                                if (var16 != 0) {
                                                  break L19;
                                                } else {
                                                  continue L21;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_h.field_K = this.field_h.field_K + var6;
                                        this.field_h.field_J.field_n = this.field_h.field_J.field_n + var6;
                                        break L19;
                                      }
                                      L22: {
                                        if (this.field_h.field_J.field_n != var5) {
                                          break L22;
                                        } else {
                                          this.field_h.e((byte) 116);
                                          this.field_h.field_z = false;
                                          this.field_h = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      if (512 != this.field_h.field_K) {
                                        break L16;
                                      } else {
                                        this.field_h.field_K = 0;
                                        break L16;
                                      }
                                    } else {
                                      L23: {
                                        var5 = -this.field_c.field_n + var4;
                                        if (var5 <= var3_int) {
                                          break L23;
                                        } else {
                                          var5 = var3_int;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        L25: {
                                          this.field_v.a(var5, this.field_c.field_n, (byte) 17, this.field_c.field_r);
                                          if (this.field_f == 0) {
                                            break L25;
                                          } else {
                                            var6 = 0;
                                            L26: while (true) {
                                              if (var5 <= var6) {
                                                break L25;
                                              } else {
                                                this.field_c.field_r[this.field_c.field_n - -var6] = (byte)qm.b((int) this.field_c.field_r[this.field_c.field_n + var6], (int) this.field_f);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L24;
                                                } else {
                                                  continue L26;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_c.field_n = this.field_c.field_n + var5;
                                        break L24;
                                      }
                                      L27: {
                                        if (this.field_c.field_n >= var4) {
                                          break L27;
                                        } else {
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (this.field_h == null) {
                                          L29: {
                                            this.field_c.field_n = 0;
                                            var6 = this.field_c.d((byte) -48);
                                            var7 = this.field_c.i(7553);
                                            var8 = this.field_c.d((byte) -99);
                                            var9 = this.field_c.i(7553);
                                            var10 = 127 & var8;
                                            if (0 == (128 & var8)) {
                                              stackOut_57_0 = 0;
                                              stackIn_58_0 = stackOut_57_0;
                                              break L29;
                                            } else {
                                              stackOut_56_0 = 1;
                                              stackIn_58_0 = stackOut_56_0;
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            L31: {
                                              var11 = stackIn_58_0;
                                              var12 = (long)var7 + ((long)var6 << -1415245088);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (pj) ((Object) this.field_g.b(-2198));
                                                L32: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_66_0 = ((var14_ref.field_r ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_r ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                    stackIn_75_0 = stackOut_66_0;
                                                    stackIn_67_0 = stackOut_66_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      L33: {
                                                        if (stackIn_67_0 != 0) {
                                                          break L33;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L31;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (pj) ((Object) this.field_g.b((byte) 20));
                                                      if (var16 == 0) {
                                                        continue L32;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (pj) ((Object) this.field_l.b(param0 + -2142));
                                                L34: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_61_0 = (var14_ref.field_r < var12 ? -1 : (var14_ref.field_r == var12 ? 0 : 1));
                                                    stackIn_75_0 = stackOut_61_0;
                                                    stackIn_62_0 = stackOut_61_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      if (stackIn_62_0 == 0) {
                                                        break L31;
                                                      } else {
                                                        var14_ref = (pj) ((Object) this.field_l.b((byte) 20));
                                                        continue L34;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              stackOut_74_0 = var10;
                                              stackIn_75_0 = stackOut_74_0;
                                              break L30;
                                            }
                                          }
                                          L35: {
                                            if (stackIn_75_0 == 0) {
                                              stackOut_77_0 = 5;
                                              stackIn_78_0 = stackOut_77_0;
                                              break L35;
                                            } else {
                                              stackOut_76_0 = 9;
                                              stackIn_78_0 = stackOut_76_0;
                                              break L35;
                                            }
                                          }
                                          var15 = stackIn_78_0;
                                          this.field_h = var14_ref;
                                          this.field_h.field_J = new wl(var9 - -var15 - -this.field_h.field_M);
                                          this.field_h.field_J.a(true, var10);
                                          this.field_h.field_J.a(var9, false);
                                          this.field_h.field_K = 10;
                                          this.field_c.field_n = 0;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L36: {
                                        if (0 == this.field_h.field_K) {
                                          L37: {
                                            if (-1 != this.field_c.field_r[0]) {
                                              break L37;
                                            } else {
                                              this.field_h.field_K = 1;
                                              this.field_c.field_n = 0;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                          this.field_h = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L36;
                                          }
                                        } else {
                                          break L36;
                                        }
                                      }
                                      throw new IOException();
                                    }
                                  }
                                  var2_int++;
                                  if (var16 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_106_0 = 1;
                          stackIn_107_0 = stackOut_106_0;
                          break L11;
                        }
                        decompiledRegionSelector0 = 1;
                        break L4;
                      }
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L38: {
                    this.field_v.a(0);
                    break L38;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L39: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L39;
                  }
                }
                this.field_j = this.field_j + 1;
                this.field_o = -2;
                this.field_v = null;
                if (this.c((byte) -115) == 0) {
                  if (-1 == (this.c(0) ^ -1)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_23_0 != 0;
              } else {
                return stackIn_107_0 != 0;
              }
            } else {
              if (this.c((byte) -114) == 0) {
                if (this.c(param0 ^ -56) == 0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        boolean discarded$2 = false;
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_v.a(0);
              if (param0 == 8192) {
                break L1;
              } else {
                discarded$2 = this.a((byte) -2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        this.field_o = -1;
        this.field_j = this.field_j + 1;
        this.field_v = null;
        this.field_f = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        field_p = null;
        int var1 = -57 % ((60 - param0) / 50);
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              if (param2) {
                stackOut_6_0 = aj.field_d.a(param1);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = wf.field_q.a(param1);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 14;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("qb.G(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0, byte param1, kn param2) {
        try {
            pb.field_c.a(param2, 2777);
            if (param1 != 85) {
                field_t = (String) null;
            }
            fm.a((byte) -113, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            mh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            fd stackIn_10_0 = null;
            java.net.URL stackIn_10_1 = null;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            StringBuilder stackIn_10_4 = null;
            fd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            fd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            String stackIn_12_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            fd stackOut_9_0 = null;
            java.net.URL stackOut_9_1 = null;
            java.net.URL stackOut_9_2 = null;
            java.net.URL stackOut_9_3 = null;
            StringBuilder stackOut_9_4 = null;
            fd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            fd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            String stackOut_10_5 = null;
            var6 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = j.a(param0, (byte) 37);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                im.a(18239, var3_ref);
                var3_ref = bh.a(0, var3_ref, "%3a", ":");
                var3_ref = bh.a(param1 + -16408, var3_ref, "%40", "@");
                var3_ref = bh.a(param1 ^ param1, var3_ref, "%26", "&");
                var7 = bh.a(0, var3_ref, "%23", "#");
                if (null != th.field_b) {
                  L4: {
                    stackOut_9_0 = o.field_f;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = th.field_b.getCodeBase();
                    stackOut_9_4 = new StringBuilder().append("clienterror.ws?c=").append(wb.field_Rb).append("&u=");
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    if (eh.field_d != null) {
                      stackOut_11_0 = (fd) ((Object) stackIn_11_0);
                      stackOut_11_1 = null;
                      stackOut_11_2 = null;
                      stackOut_11_3 = (java.net.URL) ((Object) stackIn_11_3);
                      stackOut_11_4 = (StringBuilder) ((Object) stackIn_11_4);
                      stackOut_11_5 = eh.field_d;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      break L4;
                    } else {
                      stackOut_10_0 = (fd) ((Object) stackIn_10_0);
                      stackOut_10_1 = null;
                      stackOut_10_2 = null;
                      stackOut_10_3 = (java.net.URL) ((Object) stackIn_10_3);
                      stackOut_10_4 = (StringBuilder) ((Object) stackIn_10_4);
                      stackOut_10_5 = "" + ua.field_B;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_12_5 = stackOut_10_5;
                      break L4;
                    }
                  }
                  var4 = ((fd) (Object) stackIn_12_0).a(new java.net.URL(stackIn_12_3, stackIn_12_5 + "&v1=" + fd.field_k + "&v2=" + fd.field_c + "&e=" + var7), (byte) 42);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4.field_c != 0) {
                          break L7;
                        } else {
                          ua.a(1L, -128);
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (1 != var4.field_c) {
                        break L6;
                      } else {
                        var5 = (DataInputStream) (var4.field_b);
                        discarded$1 = var5.read();
                        var5.close();
                        break L6;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
            if (param0 == -15) {
              if (this.field_v != null) {
                try {
                  L0: {
                    this.field_i.field_n = 0;
                    this.field_i.a(true, 6);
                    this.field_i.b((byte) 46, 3);
                    this.field_i.d(-1, 0);
                    this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_v.a(param0 + 15);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_v = null;
                    this.field_j = this.field_j + 1;
                    this.field_o = -2;
                    break L1;
                  }
                }
                return;
              } else {
                return;
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

    public qb() {
    }

    static {
        field_u = 22;
        field_s = new ln();
    }
}
