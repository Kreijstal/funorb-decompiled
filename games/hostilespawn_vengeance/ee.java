/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static nd field_a;
    private long field_c;
    private RandomAccessFile field_i;
    static nd field_h;
    private long field_f;
    static fk field_b;
    static bd field_g;
    static bd[] field_d;
    static int field_e;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            ee.b(121);
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static int a(int param0, int param1) {
        if (ln.field_a.field_o[param1] >= 0) {
            return sa.a((byte) -118, param1) >> 1;
        }
        return sa.a((byte) -115, param1);
    }

    final void c(int param0) throws IOException {
        if (param0 != -1) {
            Object var3 = null;
            int discarded$0 = ee.a(true, 30, true, -25, (String) null, (String) null);
        }
        if (((ee) this).field_i != null) {
            ((ee) this).field_i.close();
            ((ee) this).field_i = null;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((ee) this).field_i == null)) {
            System.out.println("");
            ((ee) this).c(-1);
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((ee) this).field_i.seek(param1);
        if (param0 != -18127) {
            ee.b(35);
        }
        ((ee) this).field_f = param1;
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var5_int = ((ee) this).field_i.read(param0, param3, param2);
              if (var5_int > 0) {
                ((ee) this).field_f = ((ee) this).field_f + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ee.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 != 0) {
            return;
        }
        try {
            if (((ee) this).field_c < (long)param3 + ((ee) this).field_f) {
                ((ee) this).field_i.seek(((ee) this).field_c);
                ((ee) this).field_i.write(1);
                throw new EOFException();
            }
            ((ee) this).field_i.write(param1, param2, param3);
            ((ee) this).field_f = ((ee) this).field_f + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ee.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(boolean param0, int param1, boolean param2, int param3, String param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_5_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_100_0 = 0;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_99_0 = 0;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            String stackOut_102_2 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            String stackOut_105_2 = null;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ag.field_t) {
                    if (me.a(param0, 107)) {
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
                  if (param3 <= -85) {
                    break L2;
                  } else {
                    var10 = null;
                    int discarded$10 = ee.a(true, 46, false, -119, (String) null, (String) null);
                    break L2;
                  }
                }
                L3: {
                  if (rc.field_a != sa.field_c) {
                    break L3;
                  } else {
                    L4: {
                      if (!param0) {
                        t.field_i = mk.a(false, param5, 113, param4);
                        break L4;
                      } else {
                        var11 = null;
                        t.field_i = ul.a(false, (String) null, ib.field_d, param5, 112);
                        break L4;
                      }
                    }
                    s.field_b.field_i = 0;
                    s.field_b.d(94, 14);
                    s.field_b.d(89, t.field_i.a(false).field_a);
                    mb.d(-1, -22370);
                    rc.field_a = ci.field_h;
                    break L3;
                  }
                }
                L5: {
                  if (rc.field_a != ci.field_h) {
                    break L5;
                  } else {
                    if (re.c((byte) 33, 1)) {
                      L6: {
                        var6_int = sc.field_g.l(32270);
                        if (var6_int != 0) {
                          jd.field_q = -1;
                          wa.field_k = var6_int;
                          rc.field_a = bi.field_a;
                          break L6;
                        } else {
                          rc.field_a = dc.field_e;
                          break L6;
                        }
                      }
                      sc.field_g.field_i = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (dc.field_e == rc.field_a) {
                    if (!re.c((byte) 33, 8)) {
                      break L7;
                    } else {
                      d.field_y = sc.field_g.c(10818);
                      sc.field_g.field_i = 0;
                      ln.a(t.field_i, (byte) -73, param1, param0, param2);
                      rc.field_a = ej.field_q;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (ej.field_q == rc.field_a) {
                    if (!re.c((byte) 33, 1)) {
                      break L8;
                    } else {
                      L9: {
                        var6_int = sc.field_g.l(32270);
                        wa.field_k = var6_int;
                        sc.field_g.field_i = 0;
                        fl.field_b = null;
                        if (var6_int == 0) {
                          break L9;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int != 8) {
                              jd.field_q = -1;
                              rc.field_a = bi.field_a;
                              break L8;
                            } else {
                              le.c((byte) 67);
                              jn.field_C = false;
                              stackOut_32_0 = var6_int;
                              stackIn_33_0 = stackOut_32_0;
                              return stackIn_33_0;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      rc.field_a = wj.field_N;
                      jd.field_q = -1;
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (rc.field_a == wj.field_N) {
                    if (eb.a(13372)) {
                      L11: {
                        ib.field_d = sc.field_g.c(10818);
                        li.field_q = sc.field_g.l(32270);
                        int discarded$11 = sc.field_g.l(32270);
                        wb.field_S = sc.field_g.e(8);
                        var12 = sc.field_g.a((byte) 28);
                        var7 = sc.field_g.l(32270);
                        if ((1 & var7) != 0) {
                          int discarded$12 = -6;
                          rd.a();
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (!param0) {
                          L13: {
                            if ((4 & var7) == 0) {
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L13;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L13;
                            }
                          }
                          L14: {
                            wg.field_ub = stackIn_47_0 != 0;
                            if ((8 & var7) == 0) {
                              stackOut_49_0 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              break L14;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L14;
                            }
                          }
                          ei.field_t = stackIn_50_0 != 0;
                          if (!ei.field_t) {
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      L15: {
                        if (sd.field_u) {
                          int discarded$13 = sc.field_g.l(32270);
                          int discarded$14 = sc.field_g.l(32270);
                          int discarded$15 = sc.field_g.d(8195);
                          l.field_a = sc.field_g.e(8);
                          qj.field_h = new byte[l.field_a];
                          var8 = 0;
                          L16: while (true) {
                            if (l.field_a <= var8) {
                              break L15;
                            } else {
                              qj.field_h[var8] = sc.field_g.j(0);
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        qg.field_r = sc.field_g.o(32);
                        var13 = (CharSequence) (Object) qg.field_r;
                        se.field_c = mf.a(false, var13);
                        ca.field_a = sc.field_g.l(32270);
                        rc.field_a = ci.field_d;
                        if (t.field_i.a(false) == uk.field_a) {
                          ub.field_b.a((byte) -126, bn.c(-1));
                          break L17;
                        } else {
                          if (t.field_i.a(false) == ln.field_l) {
                            wh.field_c.a((byte) -109, bn.c(-1));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        jn.field_C = false;
                        if (var12 != null) {
                          gb.a((byte) 62, bn.c(-1), var12);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (0 < wb.field_S) {
                            break L20;
                          } else {
                            if (wg.field_ub) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  Object discarded$16 = a.a("unzap", bn.c(-1), -124);
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            int discarded$17 = 100;
                            Object discarded$18 = a.a(bn.c(-1), new Object[1], "zap", -13730);
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (wb.field_S <= 0) {
                          break L25;
                        } else {
                          wc.field_g = true;
                          break L25;
                        }
                      }
                      s.field_b.a(he.field_s, 8);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          sc.field_g.a(he.field_s, 8);
                          stackOut_78_0 = wa.field_k;
                          stackIn_79_0 = stackOut_78_0;
                          return stackIn_79_0;
                        } else {
                          he.field_s[var8] = he.field_s[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L27: {
                  if (bi.field_a != rc.field_a) {
                    break L27;
                  } else {
                    if (!eb.a(13372)) {
                      break L27;
                    } else {
                      L28: {
                        le.c((byte) 83);
                        if (wa.field_k != 7) {
                          break L28;
                        } else {
                          if (jn.field_C) {
                            break L28;
                          } else {
                            jn.field_C = true;
                            stackOut_84_0 = -1;
                            stackIn_85_0 = stackOut_84_0;
                            return stackIn_85_0;
                          }
                        }
                      }
                      L29: {
                        if (7 == wa.field_k) {
                          wa.field_k = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      km.field_x = sc.field_g.o(32);
                      jn.field_C = false;
                      stackOut_89_0 = wa.field_k;
                      stackIn_90_0 = stackOut_89_0;
                      return stackIn_90_0;
                    }
                  }
                }
                L30: {
                  if (ag.field_t != null) {
                    break L30;
                  } else {
                    if (!jn.field_C) {
                      var6_int = cb.field_c;
                      cb.field_c = fh.field_b;
                      fh.field_b = var6_int;
                      jn.field_C = true;
                      break L30;
                    } else {
                      L31: {
                        int discarded$19 = 1;
                        if (m.a() <= 30000L) {
                          km.field_x = fl.field_d;
                          break L31;
                        } else {
                          km.field_x = od.field_H;
                          break L31;
                        }
                      }
                      jn.field_C = false;
                      stackOut_96_0 = 3;
                      stackIn_97_0 = stackOut_96_0;
                      return stackIn_97_0;
                    }
                  }
                }
                stackOut_99_0 = -1;
                stackIn_100_0 = stackOut_99_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_101_0 = (RuntimeException) var6;
                stackOut_101_1 = new StringBuilder().append("ee.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                if (param4 == null) {
                  stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                  stackOut_103_2 = "null";
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  break L32;
                } else {
                  stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
                  stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
                  stackOut_102_2 = "{...}";
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  stackIn_104_2 = stackOut_102_2;
                  break L32;
                }
              }
              L33: {
                stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
                stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');
                stackIn_106_0 = stackOut_104_0;
                stackIn_106_1 = stackOut_104_1;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                if (param5 == null) {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "null";
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  stackIn_107_2 = stackOut_106_2;
                  break L33;
                } else {
                  stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
                  stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
                  stackOut_105_2 = "{...}";
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_107_1 = stackOut_105_1;
                  stackIn_107_2 = stackOut_105_2;
                  break L33;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + ')');
            }
            return stackIn_100_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            return -92L;
        }
        return ((ee) this).field_i.length();
    }

    ee(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((ee) this).field_i = new RandomAccessFile(param0, param1);
            ((ee) this).field_f = 0L;
            ((ee) this).field_c = param2;
            var5_int = ((ee) this).field_i.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ee) this).field_i.seek(0L);
                    ((ee) this).field_i.write(var5_int);
                }
            }
            ((ee) this).field_i.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nd(15, 0, 1, 0);
        field_h = new nd(8, 0, 4, 1);
        field_b = new fk();
        field_e = 0;
    }
}
