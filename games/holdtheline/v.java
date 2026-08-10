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
            this.field_D.a((byte) -94, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "v.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 == 0) {
              var5 = new tm(this.field_D);
              var6 = (n) ((Object) var5.c((byte) -114));
              L1: while (true) {
                if (var6 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$3 = param3.append('\n');
                  var7 = 0;
                  L2: while (true) {
                    if (param2 < var7) {
                      var6.a(1 + param2, (byte) 67, param0, param3);
                      var6 = (n) ((Object) var5.a((byte) -104));
                      continue L1;
                    } else {
                      discarded$4 = param3.append(' ');
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("v.QB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1, int param2, int param3, int param4) {
        try {
            nj.field_i.a(param3, param4);
            nm.field_c.a(param1, 15 + param3, -2 + (param4 + (nm.field_c.field_G + 30) / 2), param2, -1);
            int var5_int = 72 / ((param0 - -43) / 61);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "v.PB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_71_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_95_0 = 0;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            String stackIn_99_2 = null;
            StringBuilder stackIn_101_1 = null;
            StringBuilder stackIn_102_1 = null;
            String stackIn_102_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            var9 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  if (null == lk.field_h) {
                    if (le.a(param4, (byte) 105)) {
                      break L1;
                    } else {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
                        var10 = (String) null;
                        qk.field_j = eb.a((String) null, vd.field_a, false, param3, true);
                        break L3;
                      } else {
                        qk.field_j = wi.a((byte) 126, false, param2, param3);
                        break L3;
                      }
                    }
                    da.field_p.field_l = 0;
                    da.field_p.f(param1 ^ 110, 14);
                    da.field_p.f(param1 + 110, qk.field_j.a(true).field_a);
                    qn.a(-1, param1 ^ 1);
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
                      dd.a(param1 ^ 1, param5, param0, qk.field_j, param4);
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
                        if (-1 == (var6_int ^ -1)) {
                          break L7;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int == 8) {
                              r.a(param1 ^ -28035);
                              uk.field_e = false;
                              stackIn_29_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
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
                        rd.field_e.f((byte) -43);
                        fc.field_a = rd.field_e.k(-119);
                        var6 = rd.field_e.i(-1);
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
                            if (-1 == (4 & var7 ^ -1)) {
                              stackIn_40_0 = 0;
                              break L11;
                            } else {
                              stackIn_40_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            uj.field_c = stackIn_40_0 != 0;
                            if (-1 == (8 & var7 ^ -1)) {
                              stackIn_43_0 = 0;
                              break L12;
                            } else {
                              stackIn_43_0 = 1;
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
                          rd.field_e.f((byte) -53);
                          rd.field_e.f((byte) -82);
                          rd.field_e.a(-116);
                          ho.field_l = rd.field_e.k(-59);
                          im.field_i = new byte[ho.field_l];
                          var8 = 0;
                          L14: while (true) {
                            if (ho.field_l <= var8) {
                              break L13;
                            } else {
                              im.field_i[var8] = rd.field_e.f(wb.a(param1, 1));
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ng.field_e = rd.field_e.j(-1231);
                        var11 = (CharSequence) ((Object) ng.field_e);
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
                        if (var6 == null) {
                          break L16;
                        } else {
                          tm.a(-32312, var6, en.a(73));
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (-1 > (fc.field_a ^ -1)) {
                            break L18;
                          } else {
                            if (!uj.field_c) {
                              try {
                                L19: {
                                  eo.a(21896, "unzap", en.a(92));
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
                            eo.a(en.a(param1 ^ 79), new Object[]{kk.a(true, vd.field_a)}, false, "zap");
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
                        if ((fc.field_a ^ -1) < -1) {
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
                          stackIn_71_0 = vn.field_c;
                          decompiledRegionSelector0 = 2;
                          break L0;
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
                        if ((vn.field_c ^ -1) != -8) {
                          break L26;
                        } else {
                          if (uk.field_e) {
                            break L26;
                          } else {
                            uk.field_e = true;
                            stackIn_78_0 = -1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      L27: {
                        if ((vn.field_c ^ -1) != -8) {
                          break L27;
                        } else {
                          vn.field_c = 3;
                          break L27;
                        }
                      }
                      um.field_b = rd.field_e.j(param1 + -1232);
                      uk.field_e = false;
                      stackIn_82_0 = vn.field_c;
                      decompiledRegionSelector0 = 4;
                      break L0;
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
                      stackIn_91_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
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
                L30: {
                  if (param1 == 1) {
                    break L30;
                  } else {
                    field_B = -82;
                    break L30;
                  }
                }
                stackIn_95_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_98_0 = (RuntimeException) (var6_ref);

                stackIn_98_1 = new StringBuilder().append("v.HB(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
                  stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
                  stackIn_99_2 = "null";
                  break L31;
                } else {
                  stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
                  stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
                  stackIn_99_2 = "{...}";
                  break L31;
                }
              }
              L32: {


                stackIn_101_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',');

                if (param3 == null) {
                  stackIn_99_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
                  stackIn_102_2 = "null";
                  break L32;
                } else {
                  stackIn_99_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
                  stackIn_102_2 = "{...}";
                  break L32;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_99_0), stackIn_102_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_71_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_78_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_82_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_91_0;
                      } else {
                        return stackIn_95_0;
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

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        tm var7 = null;
        n var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var7 = new tm(this.field_D);
            if (param4 == -9) {
              var8 = (n) ((Object) var7.c((byte) -128));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(111)) {
                      break L2;
                    } else {
                      var8.a(param0, param1, param2 + this.field_o, this.field_k + param3, (byte) -9, param5);
                      var8 = (n) ((Object) var7.a((byte) -104));
                      continue L1;
                    }
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("v.SA(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            n var3 = (n) null;
            this.a(25, (n) null, 78, 2, 104, 42, -126);
        }
        return this.f((byte) 118) != null ? true : false;
    }

    public static void e(byte param0) {
        field_A = (String[][]) null;
        if (param0 != 70) {
            field_C = -41;
        }
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var9 = new tm(this.field_D);
            var8 = (n) ((Object) var9.c((byte) -120));
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
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8 = (n) ((Object) var9.a((byte) -104));
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (80 == var6) {
                L4: {
                  if (lk.field_g[81]) {
                    stackIn_15_0 = this.c(param0, param2 + 77);
                    break L4;
                  } else {
                    stackIn_15_0 = this.b(param0, 116);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 == -78) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
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
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("v.T(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        tm var8 = null;
        RuntimeException var8_ref = null;
        n var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var8 = new tm(this.field_D);
            var9 = (n) ((Object) var8.c((byte) -114));
            if (param4 == -108) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(param4 ^ -92)) {
                      break L2;
                    } else {
                      if (!var9.a(this.field_k + param0, param1, this.field_o + param2, param3, (byte) -108, param5, param6)) {
                        var9 = (n) ((Object) var8.a((byte) -104));
                        continue L1;
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("v.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = 0;
        tm var3 = new tm(this.field_D);
        if (param0 >= -66) {
            field_A = (String[][]) null;
        }
        n var4 = (n) ((Object) var3.c((byte) 119));
        while (var4 != null) {
            var5 = var4.d((byte) -123);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (n) ((Object) var3.a((byte) -104));
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new tm(this.field_D);
            var6 = (n) ((Object) var5.c((byte) -115));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(55)) {
                    break L2;
                  } else {
                    var6.a(this.field_k + param0, param1, param2 - -this.field_o, (byte) -3);
                    var6 = (n) ((Object) var5.a((byte) -104));
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
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("v.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param3 == 0 && null != this.field_l) {
            this.field_l.a(true, param2, -76, (n) (this), param1);
        }
        tm var5 = new tm(this.field_D);
        if (param0 != -9532) {
            return;
        }
        n var6 = (n) ((Object) var5.a(8115));
        while (var6 != null) {
            var6.a(-9532, param1 + this.field_o, param2 - -this.field_k, param3);
            var6 = (n) ((Object) var5.a(false));
        }
    }

    final static boolean a(th param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.f((byte) -26);
              if (1 != var2_int) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            if (param1 > 56) {
              stackIn_7_0 = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("v.DB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ib param6, boolean param7, long param8, String param9, int param10, int param11, boolean param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  rd.field_e = new da(param2);
                  da.field_p = new da(param3);
                  de.field_L = param11;
                  ci.field_n = param13;
                  na.field_s = param6;
                  if (!param1) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  hc.field_b = stackIn_3_0 != 0;
                  ce.field_m = param10;
                  ci.field_b = param4;
                  if (param12) {
                    break L2;
                  } else {
                    field_E = 98;
                    break L2;
                  }
                }
                L3: {
                  uj.field_f = param9;
                  ih.field_i = param8;
                  bo.field_e = param5;
                  oi.field_b = param0;
                  if (!param7) {
                    stackIn_8_0 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  mi.field_f = stackIn_8_0 != 0;
                  if (null == na.field_s.field_a) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        ao.field_c = new ud(na.field_s.field_a, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("v.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',');

                if (param9 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    v(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (tb) null);
        this.field_D = new ah();
    }

    final boolean a(n param0, int param1) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        n var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var3 = new tm(this.field_D);
            if (param1 == -25823) {
              var4 = (n) ((Object) var3.c((byte) -2));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a(param0, -25823)) {
                    var4 = (n) ((Object) var3.a((byte) -104));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("v.NB(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                if (param1 > 97) {
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("v.GB(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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

    final String f(int param0) {
        String var4 = null;
        int var5 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        n var3 = (n) ((Object) var2.c((byte) -118));
        while (var3 != null) {
            var4 = var3.f(param0 + 0);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (n) ((Object) var2.a((byte) -104));
        }
        if (param0 == 0) {
            return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.a((Hashtable) null, 49, 4, (StringBuilder) null);
        return null;
    }

    final boolean b(n param0, int param1) {
        RuntimeException var3 = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        tm var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 >= 111) {
              if (this.field_D.b(0)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = new tm(this.field_D);
                var4 = (n) ((Object) var8.c((byte) -119));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (var4.c((byte) -20)) {
                        var5 = new tm(this.field_D);
                        var5.a(var4, (byte) -125);
                        var6 = (n) ((Object) var5.a((byte) -104));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param0, -25823)) {
                              var6 = (n) ((Object) var5.a((byte) -104));
                              continue L3;
                            } else {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (n) ((Object) var8.a((byte) -104));
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("v.MB(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    private final void a(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        if (param0 != 15) {
            n var5 = (n) null;
            this.a((n) null, 83);
        }
        n var3 = (n) ((Object) var2.c((byte) -114));
        while (var3 != null) {
            var3.g(92);
            var3 = (n) ((Object) var2.a((byte) -104));
        }
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(20720, param2, param3, param0)) {
                this.a(param2, param0, true, param3);
                this.a(param2, 0, param0, param3);
                break L1;
              } else {
                break L1;
              }
            }
            var5_int = -111 % ((0 - param1) / 49);
            stackIn_4_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("v.PA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var8 = new tm(this.field_D);
            if (param6 == -24898) {
              var9 = (n) ((Object) var8.c((byte) 61));
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
                          if (var9.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (n) ((Object) var8.a((byte) -104));
                      continue L1;
                    }
                  }
                }
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("v.KB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final void e(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        n var3 = (n) ((Object) var2.c((byte) -122));
        if (param0 < 15) {
            return;
        }
        while (var3 != null) {
            var3.e(55);
            var3 = (n) ((Object) var2.a((byte) -104));
        }
    }

    final boolean c(n param0, int param1) {
        RuntimeException var3 = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        tm var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (!this.field_D.b(0)) {
              if (param1 == -1) {
                var8 = new tm(this.field_D);
                var4 = (n) ((Object) var8.a(8115));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.c((byte) -20)) {
                        break L2;
                      } else {
                        var5 = new tm(this.field_D);
                        var5.a(-10279, var4);
                        var6 = (n) ((Object) var5.a(false));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, param1 + -25822)) {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (n) ((Object) var5.a(false));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (n) ((Object) var8.a(false));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("v.JB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    n f(byte param0) {
        tm var2;
        n var3;
        int var4;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = new tm(this.field_D);
          var3 = (n) ((Object) var2.c((byte) -122));
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
              var3 = (n) ((Object) var2.a((byte) -104));
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
            if (param0 != 3) {
                field_E = -111;
            }
            var3 = da.field_p;
            var3.c((byte) 33, param1);
            var3.f(param0 + 108, param2.field_j);
            var3.b(-652561784, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "v.CB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = -1;
    }
}
