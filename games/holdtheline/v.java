/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class v extends n implements jm {
    ah field_D;
    static int field_C;
    static String[][] field_A;
    static int field_E;
    static int field_B;

    final void a(boolean param0, n param1) {
        if (!param0) {
            return;
        }
        try {
            ((v) this).field_D.a((byte) -94, (hl) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "v.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        tm var5 = null;
        RuntimeException var5_ref = null;
        n var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 == 0) {
              var5 = new tm(((v) this).field_D);
              var6 = (n) (Object) var5.c((byte) -114);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  StringBuilder discarded$12 = param3.append('\n');
                  var7 = 0;
                  L2: while (true) {
                    if (param2 < var7) {
                      StringBuilder discarded$13 = var6.a(1 + param2, (byte) 67, param0, param3);
                      var6 = (n) (Object) var5.a((byte) -104);
                      continue L1;
                    } else {
                      StringBuilder discarded$14 = param3.append(' ');
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("v.QB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(byte param0, String param1, int param2, int param3, int param4) {
        try {
            nj.field_i.a(param3, param4);
            nm.field_c.a(param1, 15 + param3, -2 + (param4 + (nm.field_c.field_G + 30) / 2), param2, -1);
            int var5_int = -72;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "v.PB(" + -122 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_5_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_71_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_93_0 = 0;
            RuntimeException stackIn_95_0 = null;
            StringBuilder stackIn_95_1 = null;
            RuntimeException stackIn_96_0 = null;
            StringBuilder stackIn_96_1 = null;
            RuntimeException stackIn_97_0 = null;
            StringBuilder stackIn_97_1 = null;
            String stackIn_97_2 = null;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            String stackIn_100_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_92_0 = 0;
            RuntimeException stackOut_94_0 = null;
            StringBuilder stackOut_94_1 = null;
            RuntimeException stackOut_96_0 = null;
            StringBuilder stackOut_96_1 = null;
            String stackOut_96_2 = null;
            RuntimeException stackOut_95_0 = null;
            StringBuilder stackOut_95_1 = null;
            String stackOut_95_2 = null;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            String stackOut_99_2 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            String stackOut_98_2 = null;
            var9 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  if (null == lk.field_h) {
                    if (le.a(param4, (byte) 105)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (a.field_S != d.field_f) {
                    break L2;
                  } else {
                    L3: {
                      if (param4) {
                        var10 = null;
                        qk.field_j = eb.a((String) null, vd.field_a, false, param3, true);
                        break L3;
                      } else {
                        qk.field_j = wi.a((byte) 126, false, param2, param3);
                        break L3;
                      }
                    }
                    da.field_p.field_l = 0;
                    da.field_p.f(111, 14);
                    da.field_p.f(111, qk.field_j.a(true).field_a);
                    qn.a(-1, 0);
                    d.field_f = um.field_d;
                    break L2;
                  }
                }
                L4: {
                  if (um.field_d != d.field_f) {
                    break L4;
                  } else {
                    if (!hi.b(1, (byte) 40)) {
                      break L4;
                    } else {
                      var6_int = rd.field_e.f((byte) -102);
                      rd.field_e.field_l = 0;
                      if (var6_int == 0) {
                        d.field_f = pb.field_c;
                        break L4;
                      } else {
                        vn.field_c = var6_int;
                        d.field_f = uj.field_d;
                        ad.field_c = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (pb.field_c != d.field_f) {
                    break L5;
                  } else {
                    if (hi.b(8, (byte) 40)) {
                      qj.field_H = rd.field_e.d(true);
                      rd.field_e.field_l = 0;
                      dd.a(0, param5, param0, qk.field_j, param4);
                      d.field_f = ui.field_l;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (d.field_f != ui.field_l) {
                    break L6;
                  } else {
                    if (!hi.b(1, (byte) 40)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = rd.field_e.f((byte) -128);
                        vn.field_c = var6_int;
                        rd.field_e.field_l = 0;
                        ok.field_f = null;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int == 8) {
                              r.a(-28036);
                              uk.field_e = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              d.field_f = uj.field_d;
                              ad.field_c = -1;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      ad.field_c = -1;
                      d.field_f = fb.field_s;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (fb.field_s != d.field_f) {
                    break L8;
                  } else {
                    if (ok.a((byte) 55)) {
                      L9: {
                        vd.field_a = rd.field_e.d(true);
                        rb.field_x = rd.field_e.f((byte) -33);
                        int discarded$6 = rd.field_e.f((byte) -43);
                        fc.field_a = rd.field_e.k(-119);
                        var6_ref = rd.field_e.i(-1);
                        var7 = rd.field_e.f((byte) -57);
                        if (0 == (var7 & 1)) {
                          break L9;
                        } else {
                          j.a((byte) 66);
                          break L9;
                        }
                      }
                      L10: {
                        if (!param4) {
                          L11: {
                            if (-1 == (4 & var7)) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L11;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L11;
                            }
                          }
                          L12: {
                            uj.field_c = stackIn_40_0 != 0;
                            if (-1 == (8 & var7)) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L12;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L12;
                            }
                          }
                          ci.field_h = stackIn_43_0 != 0;
                          if (!ci.field_h) {
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L13: {
                        if (!mi.field_f) {
                          break L13;
                        } else {
                          int discarded$7 = rd.field_e.f((byte) -53);
                          int discarded$8 = rd.field_e.f((byte) -82);
                          int discarded$9 = rd.field_e.a(-116);
                          ho.field_l = rd.field_e.k(-59);
                          im.field_i = new byte[ho.field_l];
                          var8 = 0;
                          L14: while (true) {
                            if (ho.field_l <= var8) {
                              break L13;
                            } else {
                              im.field_i[var8] = rd.field_e.f(wb.a(1, 1));
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ng.field_e = rd.field_e.j(-1231);
                        var11 = (CharSequence) (Object) ng.field_e;
                        co.field_e = kf.a(var11, (byte) -12);
                        q.field_c = rd.field_e.f((byte) -95);
                        d.field_f = ad.field_b;
                        if (qk.field_j.a(true) == sb.field_d) {
                          ja.field_Wb.a(en.a(87), 127);
                          break L15;
                        } else {
                          if (qk.field_j.a(true) == jh.field_d) {
                            gj.field_s.a(en.a(97), 125);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        uk.field_e = false;
                        if (var6_ref == null) {
                          break L16;
                        } else {
                          tm.a(-32312, var6_ref, en.a(73));
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (fc.field_a > 0) {
                            break L18;
                          } else {
                            if (!uj.field_c) {
                              try {
                                L19: {
                                  Object discarded$10 = eo.a(21896, "unzap", en.a(92));
                                  break L19;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L20: {
                                  var8_ref_Throwable = decompiledCaughtException;
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
                            Object discarded$11 = eo.a(en.a(78), new Object[1], false, "zap");
                            break L21;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L22: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L22;
                          }
                        }
                        break L17;
                      }
                      L23: {
                        if (fc.field_a > 0) {
                          hc.field_b = true;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      da.field_p.a(gb.field_x, false);
                      var8 = 0;
                      L24: while (true) {
                        if (4 <= var8) {
                          rd.field_e.a(gb.field_x, false);
                          stackOut_70_0 = vn.field_c;
                          stackIn_71_0 = stackOut_70_0;
                          return stackIn_71_0;
                        } else {
                          gb.field_x[var8] = gb.field_x[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L25: {
                  if (d.field_f != uj.field_d) {
                    break L25;
                  } else {
                    if (ok.a((byte) 55)) {
                      L26: {
                        r.a(-28036);
                        if (vn.field_c != 7) {
                          break L26;
                        } else {
                          if (uk.field_e) {
                            break L26;
                          } else {
                            uk.field_e = true;
                            stackOut_77_0 = -1;
                            stackIn_78_0 = stackOut_77_0;
                            return stackIn_78_0;
                          }
                        }
                      }
                      L27: {
                        if (vn.field_c != 7) {
                          break L27;
                        } else {
                          vn.field_c = 3;
                          break L27;
                        }
                      }
                      um.field_b = rd.field_e.j(-1231);
                      uk.field_e = false;
                      stackOut_81_0 = vn.field_c;
                      stackIn_82_0 = stackOut_81_0;
                      return stackIn_82_0;
                    } else {
                      break L25;
                    }
                  }
                }
                L28: {
                  if (null == lk.field_h) {
                    if (uk.field_e) {
                      L29: {
                        if (30000L < sf.d(126)) {
                          um.field_b = mo.field_y;
                          break L29;
                        } else {
                          um.field_b = dc.field_hb;
                          break L29;
                        }
                      }
                      uk.field_e = false;
                      stackOut_90_0 = 3;
                      stackIn_91_0 = stackOut_90_0;
                      return stackIn_91_0;
                    } else {
                      var6_int = bo.field_e;
                      bo.field_e = ci.field_b;
                      ci.field_b = var6_int;
                      uk.field_e = true;
                      break L28;
                    }
                  } else {
                    break L28;
                  }
                }
                stackOut_92_0 = -1;
                stackIn_93_0 = stackOut_92_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_94_0 = (RuntimeException) var6;
                stackOut_94_1 = new StringBuilder().append("v.HB(").append(param0).append(',').append(1).append(',');
                stackIn_96_0 = stackOut_94_0;
                stackIn_96_1 = stackOut_94_1;
                stackIn_95_0 = stackOut_94_0;
                stackIn_95_1 = stackOut_94_1;
                if (param2 == null) {
                  stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                  stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
                  stackOut_96_2 = "null";
                  stackIn_97_0 = stackOut_96_0;
                  stackIn_97_1 = stackOut_96_1;
                  stackIn_97_2 = stackOut_96_2;
                  break L30;
                } else {
                  stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                  stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                  stackOut_95_2 = "{...}";
                  stackIn_97_0 = stackOut_95_0;
                  stackIn_97_1 = stackOut_95_1;
                  stackIn_97_2 = stackOut_95_2;
                  break L30;
                }
              }
              L31: {
                stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',');
                stackIn_99_0 = stackOut_97_0;
                stackIn_99_1 = stackOut_97_1;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                if (param3 == null) {
                  stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                  stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                  stackOut_99_2 = "null";
                  stackIn_100_0 = stackOut_99_0;
                  stackIn_100_1 = stackOut_99_1;
                  stackIn_100_2 = stackOut_99_2;
                  break L31;
                } else {
                  stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                  stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                  stackOut_98_2 = "{...}";
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_100_1 = stackOut_98_1;
                  stackIn_100_2 = stackOut_98_2;
                  break L31;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + ',' + param4 + ',' + param5 + ')');
            }
            return stackIn_93_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        tm var7 = null;
        RuntimeException var7_ref = null;
        n var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var7 = new tm(((v) this).field_D);
            if (param4 == -9) {
              var8 = (n) (Object) var7.c((byte) -128);
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(111)) {
                      break L2;
                    } else {
                      var8.a(param0, param1, param2 + ((v) this).field_o, ((v) this).field_k + param3, (byte) -9, param5);
                      var8 = (n) (Object) var7.a((byte) -104);
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("v.SA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            Object var3 = null;
            boolean discarded$0 = ((v) this).a(25, (n) null, 78, 2, 104, 42, -126);
        }
        return ((v) this).f((byte) 118) != null ? true : false;
    }

    public static void e(byte param0) {
        field_A = null;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        n var8 = null;
        tm var9 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var9 = new tm(((v) this).field_D);
            var8 = (n) (Object) var9.c((byte) -120);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(68)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.c((byte) -20)) {
                        break L3;
                      } else {
                        if (var8.a(param0, param1, (byte) -78, param3)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8 = (n) (Object) var9.a((byte) -104);
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (80 == var6) {
                L4: {
                  if (lk.field_g[81]) {
                    stackOut_14_0 = ((v) this).c(param0, param2 + 77);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = ((v) this).b(param0, 116);
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                return stackIn_15_0;
              } else {
                if (param2 == -78) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  field_E = 5;
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("v.T(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        tm var8 = null;
        RuntimeException var8_ref = null;
        n var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var8 = new tm(((v) this).field_D);
            var9 = (n) (Object) var8.c((byte) -114);
            if (param4 == -108) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(param4 ^ -92)) {
                      break L2;
                    } else {
                      if (!var9.a(((v) this).field_k + param0, param1, ((v) this).field_o + param2, param3, (byte) -108, param5, param6)) {
                        var9 = (n) (Object) var8.a((byte) -104);
                        continue L1;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("v.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = 0;
        tm var3 = new tm(((v) this).field_D);
        if (param0 >= -66) {
            field_A = null;
        }
        n var4 = (n) (Object) var3.c((byte) 119);
        while (var4 != null) {
            var5 = var4.d((byte) -123);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (n) (Object) var3.a((byte) -104);
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        tm var5 = null;
        RuntimeException var5_ref = null;
        n var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new tm(((v) this).field_D);
            var6 = (n) (Object) var5.c((byte) -115);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(55)) {
                    break L2;
                  } else {
                    var6.a(((v) this).field_k + param0, param1, param2 - -((v) this).field_o, (byte) -3);
                    var6 = (n) (Object) var5.a((byte) -104);
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("v.JA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param3 == 0) {
            if (null != ((v) this).field_l) {
                ((v) this).field_l.a(true, param2, -76, (n) this, param1);
            }
        }
        tm var5 = new tm(((v) this).field_D);
        if (param0 != -9532) {
            return;
        }
        n var6 = (n) (Object) var5.a(8115);
        while (var6 != null) {
            var6.a(-9532, param1 + ((v) this).field_o, param2 - -((v) this).field_k, param3);
            var6 = (n) (Object) var5.a(false);
        }
    }

    final static boolean a(th param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
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
            var2_int = param0.f((byte) -26);
            if (1 != var2_int) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_3_0 = stackOut_1_0;
              break L0;
            }
          }
          var3 = stackIn_3_0;
          return var3 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("v.DB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 87 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ib param6, boolean param7, long param8, String param9, int param10, int param11, boolean param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  rd.field_e = new da(5000);
                  da.field_p = new da(5000);
                  de.field_L = param11;
                  ci.field_n = param13;
                  na.field_s = param6;
                  if (!param1) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  hc.field_b = stackIn_3_0 != 0;
                  ce.field_m = param10;
                  ci.field_b = param4;
                  uj.field_f = param9;
                  ih.field_i = param8;
                  bo.field_e = param5;
                  oi.field_b = param0;
                  if (!param7) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  mi.field_f = stackIn_6_0 != 0;
                  if (null == na.field_s.field_a) {
                    break L3;
                  } else {
                    {
                      L4: {
                        ao.field_c = new ud(na.field_s.field_a, 64, 0);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("v.IB(").append(param0).append(',').append(param1).append(',').append(5000).append(',').append(5000).append(',').append(param4).append(',').append(param5).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param6 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param7).append(',').append(param8).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param9 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param10 + ',' + param11 + ',' + true + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    v(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (tb) null);
        ((v) this).field_D = new ah();
    }

    final boolean a(n param0, int param1) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        n var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var3 = new tm(((v) this).field_D);
            if (param1 == -25823) {
              var4 = (n) (Object) var3.c((byte) -2);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (!var4.a(param0, -25823)) {
                    var4 = (n) (Object) var3.a((byte) -104);
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("v.NB(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(java.applet.Applet param0, int param1) {
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
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 54), "_top");
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
                stackOut_6_1 = new StringBuilder().append("v.GB(");
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
              throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 102 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(int param0) {
        String var4 = null;
        int var5 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        n var3 = (n) (Object) var2.c((byte) -118);
        while (var3 != null) {
            var4 = var3.f(param0);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (n) (Object) var2.a((byte) -104);
        }
        if (param0 == 0) {
            return null;
        }
        Object var6 = null;
        this.a((Hashtable) null, 49, 4, (StringBuilder) null);
        return null;
    }

    final boolean b(n param0, int param1) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 >= 111) {
              if (((v) this).field_D.b(0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3 = new tm(((v) this).field_D);
                var4 = (n) (Object) var3.c((byte) -119);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    L2: {
                      if (var4.c((byte) -20)) {
                        var5 = new tm(((v) this).field_D);
                        hl discarded$2 = var5.a((hl) (Object) var4, (byte) -125);
                        var6 = (n) (Object) var5.a((byte) -104);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param0, -25823)) {
                              var6 = (n) (Object) var5.a((byte) -104);
                              continue L3;
                            } else {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (n) (Object) var3.a((byte) -104);
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("v.MB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void a(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        if (param0 != 15) {
            Object var5 = null;
            boolean discarded$0 = ((v) this).a((n) null, 83);
        }
        n var3 = (n) (Object) var2.c((byte) -114);
        while (var3 != null) {
            var3.g(92);
            var3 = (n) (Object) var2.a((byte) -104);
        }
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            L1: {
              if (((v) this).a(20720, param2, param3, param0)) {
                ((v) this).a(param2, param0, true, param3);
                this.a(param2, 0, param0, param3);
                break L1;
              } else {
                break L1;
              }
            }
            var5_int = -111 % ((0 - param1) / 49);
            stackOut_3_0 = (StringBuilder) param3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("v.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        tm var8 = null;
        RuntimeException var8_ref = null;
        n var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var8 = new tm(((v) this).field_D);
            if (param6 == -24898) {
              var9 = (n) (Object) var8.c((byte) 61);
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(72)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.c((byte) -20)) {
                          break L3;
                        } else {
                          if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (n) (Object) var8.a((byte) -104);
                      continue L1;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("v.KB(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void e(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        n var3 = (n) (Object) var2.c((byte) -122);
        if (param0 < 15) {
            return;
        }
        while (var3 != null) {
            var3.e(55);
            var3 = (n) (Object) var2.a((byte) -104);
        }
    }

    final boolean c(n param0, int param1) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (!((v) this).field_D.b(0)) {
              if (param1 == -1) {
                var3 = new tm(((v) this).field_D);
                var4 = (n) (Object) var3.a(8115);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.c((byte) -20)) {
                        break L2;
                      } else {
                        var5 = new tm(((v) this).field_D);
                        hl discarded$2 = var5.a(-10279, (hl) (Object) var4);
                        var6 = (n) (Object) var5.a(false);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, param1 + -25822)) {
                              stackOut_14_0 = 1;
                              stackIn_15_0 = stackOut_14_0;
                              return stackIn_15_0 != 0;
                            } else {
                              var6 = (n) (Object) var5.a(false);
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (n) (Object) var3.a(false);
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("v.JB(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    n f(byte param0) {
        tm var2 = null;
        n var3 = null;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = new tm(((v) this).field_D);
          var3 = (n) (Object) var2.c((byte) -122);
          if (param0 > 73) {
            break L0;
          } else {
            field_E = 118;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.c((byte) -20)) {
              return var3;
            } else {
              var3 = (n) (Object) var2.a((byte) -104);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param1 ^ 117);
    }

    final static void a(int param0, int param1, fo param2) {
        da var3 = null;
        try {
            var3 = da.field_p;
            var3.c((byte) 33, param1);
            var3.f(111, param2.field_j);
            var3.b(-652561784, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "v.CB(" + 3 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = -1;
    }
}
