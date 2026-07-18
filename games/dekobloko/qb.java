/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

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
            ((qb) this).d((byte) 12);
        }
        if (!(null == ((qb) this).field_v)) {
            ((qb) this).field_v.a(0);
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
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((qb) this).field_v) {
                    try {
                      L2: {
                        ((qb) this).field_v.a(0);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((qb) this).field_v = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((qb) this).field_v = (qk) param0;
                int discarded$1 = -15;
                this.e();
                this.a((byte) -124, param2);
                var4_int = -84 % ((param1 - -75) / 50);
                ((qb) this).field_h = null;
                ((qb) this).field_c.field_n = 0;
                L4: while (true) {
                  var5_ref = (pj) (Object) ((qb) this).field_g.a((byte) -111);
                  if (var5_ref != null) {
                    ((qb) this).field_d.a((be) (Object) var5_ref, -7267);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var5_ref = (pj) (Object) ((qb) this).field_l.a((byte) -71);
                      if (var5_ref == null) {
                        L6: {
                          if (0 != ((qb) this).field_f) {
                            {
                              L7: {
                                ((qb) this).field_i.field_n = 0;
                                ((qb) this).field_i.a(true, 4);
                                ((qb) this).field_i.a(true, (int) ((qb) this).field_f);
                                ((qb) this).field_i.a(0, false);
                                ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((qb) this).field_b = 0;
                        ((qb) this).field_e = ik.a(4);
                        break L0;
                      } else {
                        ((qb) this).field_n.a((be) (Object) var5_ref, -7267);
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
                stackOut_24_0 = (RuntimeException) var4_ref;
                stackOut_24_1 = new StringBuilder().append("qb.K(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L11;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
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
            Throwable decompiledCaughtException = null;
            wl stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            wl stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            wl stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (null != ((qb) this).field_v) {
              try {
                L0: {
                  L1: {
                    ((qb) this).field_i.field_n = 0;
                    stackOut_2_0 = ((qb) this).field_i;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (!param1) {
                      stackOut_4_0 = (wl) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (wl) (Object) stackIn_3_0;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((wl) (Object) stackIn_5_0).a(stackIn_5_1 != 0, stackIn_5_2);
                  ((qb) this).field_i.a(-93, 0L);
                  ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((qb) this).field_v.a(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((qb) this).field_j = ((qb) this).field_j + 1;
                  ((qb) this).field_o = -2;
                  ((qb) this).field_v = null;
                  break L2;
                }
              }
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

    final static int a(boolean param0, int param1, jg param2, int param3, int param4, jg param5, String param6) {
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
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
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
                  return stackIn_4_0;
                }
              }
            }
            L2: {
              if (ph.field_xb == ba.field_f) {
                L3: {
                  wb.field_Ub = null;
                  we.field_b.field_n = 0;
                  if (param6 == null) {
                    L4: {
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
                        stackOut_15_0 = (wl) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = "";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L4;
                      } else {
                        stackOut_14_0 = (wl) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = (String) var15;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L4;
                      }
                    }
                    L5: {
                      ((wl) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2);
                      stackOut_16_0 = vi.field_A;
                      stackOut_16_1 = 8;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (param5.a(true)) {
                        stackOut_18_0 = (wl) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (String) var9;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L5;
                      } else {
                        stackOut_17_0 = (wl) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = "";
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L5;
                      }
                    }
                    ((wl) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                    we.field_b.a(true, 16);
                    we.field_b.field_n = we.field_b.field_n + 1;
                    var10 = we.field_b.field_n;
                    int discarded$7 = 0;
                    re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A);
                    we.field_b.b(-var10 + we.field_b.field_n, true);
                    break L3;
                  } else {
                    L6: {
                      var10 = 0;
                      if (!param0) {
                        break L6;
                      } else {
                        var10 = var10 | 1;
                        break L6;
                      }
                    }
                    L7: {
                      vi.field_A.field_n = 0;
                      vi.field_A.a(gg.field_A.nextInt(), false);
                      vi.field_A.a(gg.field_A.nextInt(), false);
                      vi.field_A.b(8, var15);
                      vi.field_A.b(8, var9);
                      var17 = (CharSequence) (Object) param6;
                      int discarded$8 = 65;
                      vi.field_A.b(8, bc.a(var17));
                      vi.field_A.d(-1, param4);
                      vi.field_A.a(true, param1);
                      vi.field_A.a(true, var10);
                      we.field_b.a(true, 18);
                      we.field_b.field_n = we.field_b.field_n + 2;
                      var11 = we.field_b.field_n;
                      var12_ref_String = a.a(se.h(25144), (byte) 121);
                      if (var12_ref_String != null) {
                        break L7;
                      } else {
                        var12_ref_String = "";
                        break L7;
                      }
                    }
                    we.field_b.a(0, var12_ref_String);
                    int discarded$9 = 0;
                    re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A);
                    we.field_b.b(true, -var11 + we.field_b.field_n);
                    break L3;
                  }
                }
                wj.c(4792, -1);
                ph.field_xb = kb.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (kb.field_c != ph.field_xb) {
                break L8;
              } else {
                if (!pe.b(25973, 1)) {
                  break L8;
                } else {
                  L9: {
                    var10 = de.field_V.d((byte) -70);
                    de.field_V.field_n = 0;
                    if (var10 < 100) {
                      break L9;
                    } else {
                      if (var10 <= 105) {
                        ph.field_xb = ll.field_a;
                        ph.field_Eb = new String[-100 + var10];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var10 == 248) {
                    int discarded$10 = 0;
                    jg.a(se.h(25144));
                    rk.field_Y = tj.field_ic;
                    si.a(89);
                    jd.field_Qb = false;
                    stackOut_30_0 = var10;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    if (99 == var10) {
                      int discarded$11 = 1;
                      boolean discarded$12 = pe.b(25973, vi.d());
                      int discarded$13 = 19;
                      wb.field_Ub = new Boolean(f.a((wl) (Object) de.field_V));
                      de.field_V.field_n = 0;
                      break L8;
                    } else {
                      sm.field_e = -1;
                      bh.field_k = var10;
                      ph.field_xb = rb.field_f;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (ph.field_xb == ll.field_a) {
                var10 = 2;
                if (pe.b(25973, var10)) {
                  var11 = de.field_V.e(3);
                  de.field_V.field_n = 0;
                  if (!pe.b(25973, var11)) {
                    break L10;
                  } else {
                    var12 = ph.field_Eb.length;
                    var13 = 0;
                    L11: while (true) {
                      if (var12 <= var13) {
                        si.a(60);
                        jd.field_Qb = false;
                        stackOut_41_0 = var12 + 100;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      } else {
                        ph.field_Eb[var13] = de.field_V.b(true);
                        var13++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (rb.field_f != ph.field_xb) {
                break L12;
              } else {
                if (!fh.a((byte) 117)) {
                  break L12;
                } else {
                  L13: {
                    if (255 == bh.field_k) {
                      var10_ref_String = de.field_V.c(-16829);
                      if (var10_ref_String == null) {
                        break L13;
                      } else {
                        a.a(var10_ref_String, false, se.h(25144));
                        break L13;
                      }
                    } else {
                      rk.field_Y = de.field_V.c((byte) -38);
                      break L13;
                    }
                  }
                  si.a(105);
                  jd.field_Qb = false;
                  stackOut_49_0 = bh.field_k;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0;
                }
              }
            }
            L14: {
              if (null == qc.field_s) {
                if (!jd.field_Qb) {
                  var10 = hc.field_a;
                  hc.field_a = ef.field_P;
                  jd.field_Qb = true;
                  ef.field_P = var10;
                  break L14;
                } else {
                  L15: {
                    if (30000L < sl.a(-1)) {
                      rk.field_Y = kh.field_f;
                      break L15;
                    } else {
                      rk.field_Y = re.field_u;
                      break L15;
                    }
                  }
                  jd.field_Qb = false;
                  stackOut_57_0 = 249;
                  stackIn_58_0 = stackOut_57_0;
                  return stackIn_58_0;
                }
              } else {
                break L14;
              }
            }
            stackOut_60_0 = -1;
            stackIn_61_0 = stackOut_60_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("qb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param2 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          L17: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param5 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param6 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
        return stackIn_61_0;
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
            int stackIn_19_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_86_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_18_0 = 0;
            L0: {
              var16 = client.field_A ? 1 : 0;
              if (null != ((qb) this).field_v) {
                L1: {
                  var2_long = ik.a(param0 ^ -52);
                  var4 = (int)(-((qb) this).field_e + var2_long);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((qb) this).field_e = var2_long;
                ((qb) this).field_b = ((qb) this).field_b + var4;
                if (((qb) this).field_b <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((qb) this).field_v.a(0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((qb) this).field_v = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != ((qb) this).field_v) {
              try {
                L4: {
                  ((qb) this).field_v.b((byte) -124);
                  var2_ref = (pj) (Object) ((qb) this).field_d.b(-2198);
                  L5: while (true) {
                    if (var2_ref == null) {
                      if (param0 == -56) {
                        var2_ref = (pj) (Object) ((qb) this).field_n.b(-2198);
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              if (var2_int >= 100) {
                                stackOut_86_0 = 1;
                                stackIn_87_0 = stackOut_86_0;
                                break L4;
                              } else {
                                var3_int = ((qb) this).field_v.b(0);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L8: {
                                      ((qb) this).field_b = 0;
                                      var4 = 0;
                                      if (null != ((qb) this).field_h) {
                                        if (0 != ((qb) this).field_h.field_K) {
                                          break L8;
                                        } else {
                                          var4 = 1;
                                          break L8;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (var4 <= 0) {
                                        L10: {
                                          var5 = -((qb) this).field_h.field_M + ((qb) this).field_h.field_J.field_r.length;
                                          var6 = -((qb) this).field_h.field_K + 512;
                                          if (var6 > var5 + -((qb) this).field_h.field_J.field_n) {
                                            var6 = var5 + -((qb) this).field_h.field_J.field_n;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((qb) this).field_v.a(var6, ((qb) this).field_h.field_J.field_n, (byte) 17, ((qb) this).field_h.field_J.field_r);
                                          if (0 == ((qb) this).field_f) {
                                            break L12;
                                          } else {
                                            var7 = 0;
                                            L13: while (true) {
                                              if (~var7 <= ~var6) {
                                                break L12;
                                              } else {
                                                ((qb) this).field_h.field_J.field_r[var7 + ((qb) this).field_h.field_J.field_n] = (byte)qm.b((int) ((qb) this).field_h.field_J.field_r[var7 + ((qb) this).field_h.field_J.field_n], (int) ((qb) this).field_f);
                                                var7++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        ((qb) this).field_h.field_K = ((qb) this).field_h.field_K + var6;
                                        ((qb) this).field_h.field_J.field_n = ((qb) this).field_h.field_J.field_n + var6;
                                        if (~((qb) this).field_h.field_J.field_n != ~var5) {
                                          if (512 != ((qb) this).field_h.field_K) {
                                            break L9;
                                          } else {
                                            ((qb) this).field_h.field_K = 0;
                                            break L9;
                                          }
                                        } else {
                                          ((qb) this).field_h.e((byte) 116);
                                          ((qb) this).field_h.field_z = false;
                                          ((qb) this).field_h = null;
                                          break L9;
                                        }
                                      } else {
                                        L14: {
                                          var5 = -((qb) this).field_c.field_n + var4;
                                          if (~var5 >= ~var3_int) {
                                            break L14;
                                          } else {
                                            var5 = var3_int;
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          ((qb) this).field_v.a(var5, ((qb) this).field_c.field_n, (byte) 17, ((qb) this).field_c.field_r);
                                          if (((qb) this).field_f == 0) {
                                            break L15;
                                          } else {
                                            var6 = 0;
                                            L16: while (true) {
                                              if (~var5 >= ~var6) {
                                                break L15;
                                              } else {
                                                ((qb) this).field_c.field_r[((qb) this).field_c.field_n - -var6] = (byte)qm.b((int) ((qb) this).field_c.field_r[((qb) this).field_c.field_n + var6], (int) ((qb) this).field_f);
                                                var6++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                        ((qb) this).field_c.field_n = ((qb) this).field_c.field_n + var5;
                                        if (~((qb) this).field_c.field_n <= ~var4) {
                                          if (((qb) this).field_h == null) {
                                            L17: {
                                              ((qb) this).field_c.field_n = 0;
                                              var6 = ((qb) this).field_c.d((byte) -48);
                                              var7 = ((qb) this).field_c.i(7553);
                                              var8 = ((qb) this).field_c.d((byte) -99);
                                              var9 = ((qb) this).field_c.i(7553);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackOut_47_0 = 0;
                                                stackIn_48_0 = stackOut_47_0;
                                                break L17;
                                              } else {
                                                stackOut_46_0 = 1;
                                                stackIn_48_0 = stackOut_46_0;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              var11 = stackIn_48_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (pj) (Object) ((qb) this).field_g.b(-2198);
                                                L19: while (true) {
                                                  if (var14_ref == null) {
                                                    break L18;
                                                  } else {
                                                    if (~var14_ref.field_r != ~var12) {
                                                      var14_ref = (pj) (Object) ((qb) this).field_g.b((byte) 20);
                                                      continue L19;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (pj) (Object) ((qb) this).field_l.b(param0 + -2142);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L18;
                                                  } else {
                                                    if (var14_ref.field_r == var12) {
                                                      break L18;
                                                    } else {
                                                      var14_ref = (pj) (Object) ((qb) this).field_l.b((byte) 20);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L21: {
                                                if (var10 == 0) {
                                                  stackOut_63_0 = 5;
                                                  stackIn_64_0 = stackOut_63_0;
                                                  break L21;
                                                } else {
                                                  stackOut_62_0 = 9;
                                                  stackIn_64_0 = stackOut_62_0;
                                                  break L21;
                                                }
                                              }
                                              var15 = stackIn_64_0;
                                              ((qb) this).field_h = var14_ref;
                                              ((qb) this).field_h.field_J = new wl(var9 - -var15 - -((qb) this).field_h.field_M);
                                              ((qb) this).field_h.field_J.a(true, var10);
                                              ((qb) this).field_h.field_J.a(var9, false);
                                              ((qb) this).field_h.field_K = 10;
                                              ((qb) this).field_c.field_n = 0;
                                              break L9;
                                            }
                                          } else {
                                            if (0 == ((qb) this).field_h.field_K) {
                                              if (-1 != ((qb) this).field_c.field_r[0]) {
                                                ((qb) this).field_h = null;
                                                break L9;
                                              } else {
                                                ((qb) this).field_h.field_K = 1;
                                                ((qb) this).field_c.field_n = 0;
                                                break L9;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          } else {
                            ((qb) this).field_i.field_n = 0;
                            ((qb) this).field_i.a(true, 0);
                            ((qb) this).field_i.a(-98, var2_ref.field_r);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            ((qb) this).field_l.a((be) (Object) var2_ref, -7267);
                            var2_ref = (pj) (Object) ((qb) this).field_n.b((byte) 20);
                            continue L6;
                          }
                        }
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                    } else {
                      ((qb) this).field_i.field_n = 0;
                      ((qb) this).field_i.a(true, 1);
                      ((qb) this).field_i.a(-71, var2_ref.field_r);
                      ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                      ((qb) this).field_g.a((be) (Object) var2_ref, -7267);
                      var2_ref = (pj) (Object) ((qb) this).field_d.b((byte) 20);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L22: {
                    ((qb) this).field_v.a(0);
                    break L22;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L23: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L23;
                  }
                }
                L24: {
                  ((qb) this).field_j = ((qb) this).field_j + 1;
                  ((qb) this).field_o = -2;
                  ((qb) this).field_v = null;
                  if (((qb) this).c((byte) -115) != 0) {
                    break L24;
                  } else {
                    if (((qb) this).c(0) != 0) {
                      break L24;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_87_0 != 0;
            } else {
              L25: {
                if (((qb) this).c((byte) -114) != 0) {
                  break L25;
                } else {
                  if (((qb) this).c(param0 ^ -56) != 0) {
                    break L25;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((qb) this).field_v.a(0);
              if (param0 == 8192) {
                break L1;
              } else {
                boolean discarded$2 = ((qb) this).a((byte) -2);
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
        ((qb) this).field_o = -1;
        ((qb) this).field_j = ((qb) this).field_j + 1;
        ((qb) this).field_v = null;
        ((qb) this).field_f = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void d() {
        field_s = null;
        field_q = null;
        field_p = null;
        int var1 = 0;
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2) {
              stackOut_5_0 = aj.field_d.a(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = wf.field_q.a(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qb.G(").append(0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, byte param1, kn param2) {
        try {
            pb.field_c.a((bh) (Object) param2, 2777);
            fm.a((byte) -113, 3, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qb.B(" + 3 + ',' + 85 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
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
                    int discarded$2 = 37;
                    var3_ref = j.a(param0);
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
                var3_ref = bh.a(0, var3_ref, "%40", "@");
                var3_ref = bh.a(0, var3_ref, "%26", "&");
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
                      stackOut_11_0 = (fd) (Object) stackIn_11_0;
                      stackOut_11_1 = null;
                      stackOut_11_2 = null;
                      stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                      stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                      stackOut_11_5 = eh.field_d;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      break L4;
                    } else {
                      stackOut_10_0 = (fd) (Object) stackIn_10_0;
                      stackOut_10_1 = null;
                      stackOut_10_2 = null;
                      stackOut_10_3 = (java.net.URL) (Object) stackIn_10_3;
                      stackOut_10_4 = (StringBuilder) (Object) stackIn_10_4;
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
                    if (var4.field_c != 0) {
                      L6: {
                        if (1 != var4.field_c) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_b;
                          int discarded$3 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      ua.a(1L, -128);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((qb) this).field_v != null) {
              {
                L0: {
                  ((qb) this).field_i.field_n = 0;
                  ((qb) this).field_i.a(true, 6);
                  ((qb) this).field_i.b((byte) 46, 3);
                  ((qb) this).field_i.d(-1, 0);
                  ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                  break L0;
                }
              }
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

    public qb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 22;
        field_s = new ln();
    }
}
