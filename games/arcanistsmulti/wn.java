/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wn extends qm implements a {
    static kc field_D;
    static String field_x;
    static String field_A;
    static km field_z;
    static int field_y;
    static int field_C;
    qm field_B;

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              if (param0 == 0) {
                break L1;
              } else {
                ((wn) this).field_B = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((wn) this).field_B) {
                  break L3;
                } else {
                  if (!((wn) this).field_B.a(0, param1)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("wn.A(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void e() {
        field_z = null;
        field_x = null;
        field_A = null;
        field_D = null;
    }

    final void d(byte param0) {
        if (param0 != 29) {
            field_y = -126;
        }
        if (null != ((wn) this).field_B) {
            ((wn) this).field_B.d((byte) 29);
        }
    }

    final static int a(int param0, int param1, boolean param2, String param3, boolean param4, String param5) {
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
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_105_0 = 0;
            int stackIn_107_0 = 0;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            String stackIn_114_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_104_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            String stackOut_112_2 = null;
            var9 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ch.field_c) {
                    break L1;
                  } else {
                    if (ie.a(-62, param4)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                if (param1 >= 22) {
                  L2: {
                    if (pc.field_g == ob.field_eb) {
                      L3: {
                        if (param4) {
                          var10 = null;
                          fd.field_e = ci.a(false, (String) null, -95, fk.field_k, param5);
                          break L3;
                        } else {
                          int discarded$11 = 0;
                          int discarded$12 = -128;
                          fd.field_e = cf.a(param3, param5);
                          break L3;
                        }
                      }
                      he.field_e.field_g = 0;
                      he.field_e.f(14, (byte) -105);
                      he.field_e.f(fd.field_e.a(0).field_g, (byte) -106);
                      we.a(-1, (byte) 86);
                      ob.field_eb = pe.field_Db;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (ob.field_eb != pe.field_Db) {
                      break L4;
                    } else {
                      if (pe.a((byte) -86, 1)) {
                        var6_int = df.field_z.e((byte) -123);
                        df.field_z.field_g = 0;
                        if (0 == var6_int) {
                          ob.field_eb = go.field_c;
                          break L4;
                        } else {
                          on.field_g = var6_int;
                          fj.field_h = -1;
                          ob.field_eb = lf.field_f;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (ob.field_eb != go.field_c) {
                      break L5;
                    } else {
                      if (!pe.a((byte) -86, 8)) {
                        break L5;
                      } else {
                        of.field_j = df.field_z.c(-943038560);
                        df.field_z.field_g = 0;
                        dn.a(param4, fd.field_e, (byte) 116, param2, param0);
                        ob.field_eb = co.field_h;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (ob.field_eb == co.field_h) {
                      if (pe.a((byte) -86, 1)) {
                        L7: {
                          var6_int = df.field_z.e((byte) -122);
                          df.field_z.field_g = 0;
                          rj.field_i = null;
                          on.field_g = var6_int;
                          if (var6_int == 0) {
                            break L7;
                          } else {
                            if (var6_int != 1) {
                              if (var6_int == 8) {
                                int discarded$13 = 0;
                                ka.b();
                                bb.field_h = false;
                                stackOut_33_0 = var6_int;
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                fj.field_h = -1;
                                ob.field_eb = lf.field_f;
                                break L6;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        ob.field_eb = bb.field_c;
                        fj.field_h = -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    if (ob.field_eb != bb.field_c) {
                      break L8;
                    } else {
                      if (pn.b(-12564)) {
                        L9: {
                          fk.field_k = df.field_z.c(-943038560);
                          fn.field_f = param5;
                          qf.field_d = df.field_z.e((byte) 115);
                          ib.field_r = df.field_z.e((byte) 93);
                          ah.field_c = df.field_z.n(-98);
                          var6_ref = df.field_z.g(103);
                          var7 = df.field_z.e((byte) -94);
                          if ((1 & var7) != 0) {
                            int discarded$14 = -69;
                            j.b();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (!param4) {
                            L11: {
                              if ((4 & var7) == 0) {
                                stackOut_45_0 = 0;
                                stackIn_46_0 = stackOut_45_0;
                                break L11;
                              } else {
                                stackOut_44_0 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                break L11;
                              }
                            }
                            L12: {
                              fd.field_a = stackIn_46_0 != 0;
                              if (0 == (var7 & 2)) {
                                stackOut_48_0 = 0;
                                stackIn_49_0 = stackOut_48_0;
                                break L12;
                              } else {
                                stackOut_47_0 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                break L12;
                              }
                            }
                            L13: {
                              ld.field_p = stackIn_49_0 != 0;
                              if ((var7 & 8) == 0) {
                                stackOut_51_0 = 0;
                                stackIn_52_0 = stackOut_51_0;
                                break L13;
                              } else {
                                stackOut_50_0 = 1;
                                stackIn_52_0 = stackOut_50_0;
                                break L13;
                              }
                            }
                            wh.field_g = stackIn_52_0 != 0;
                            if (wh.field_g) {
                              ld.field_p = true;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        L14: {
                          if (0 == (16 & var7)) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L14;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L14;
                          }
                        }
                        L15: {
                          ag.field_E = stackIn_58_0 != 0;
                          if (fl.field_a) {
                            int discarded$15 = df.field_z.e((byte) 110);
                            ne.field_g = df.field_z.e((byte) -115);
                            int discarded$16 = df.field_z.d(-10674);
                            wd.field_d = df.field_z.n(-98);
                            ra.field_f = new byte[wd.field_d];
                            var8 = 0;
                            L16: while (true) {
                              if (~var8 <= ~wd.field_d) {
                                break L15;
                              } else {
                                ra.field_f[var8] = df.field_z.o(6);
                                var8++;
                                continue L16;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        L17: {
                          ah.field_b = df.field_z.l(-1);
                          var11 = (CharSequence) (Object) ah.field_b;
                          nm.field_b = gk.a(var11, -13);
                          dd.field_j = df.field_z.e((byte) 65);
                          ob.field_eb = qc.field_c;
                          if (fd.field_e.a(0) == k.field_q) {
                            ea.field_y.a(cd.e(118), (byte) -93);
                            break L17;
                          } else {
                            if (fd.field_e.a(0) == hk.field_m) {
                              of.field_n.a(cd.e(120), (byte) -118);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          bb.field_h = false;
                          if (var6_ref == null) {
                            break L18;
                          } else {
                            int discarded$17 = 0;
                            jf.a(var6_ref, cd.e(108));
                            break L18;
                          }
                        }
                        L19: {
                          L20: {
                            if (0 < ah.field_c) {
                              break L20;
                            } else {
                              if (fd.field_a) {
                                break L20;
                              } else {
                                try {
                                  L21: {
                                    Object discarded$18 = ei.a(cd.e(125), 108, "unzap");
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
                              int discarded$19 = 29424;
                              Object discarded$20 = ei.a("zap", cd.e(113), (byte) 114, new Object[1]);
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
                          if (ah.field_c <= 0) {
                            break L25;
                          } else {
                            lk.field_d = true;
                            break L25;
                          }
                        }
                        he.field_e.b(-107, hj.field_a);
                        var8 = 0;
                        L26: while (true) {
                          if (var8 >= 4) {
                            df.field_z.b(90, hj.field_a);
                            stackOut_84_0 = on.field_g;
                            stackIn_85_0 = stackOut_84_0;
                            return stackIn_85_0;
                          } else {
                            hj.field_a[var8] = hj.field_a[var8] + 50;
                            var8++;
                            continue L26;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L27: {
                    if (ob.field_eb != lf.field_f) {
                      break L27;
                    } else {
                      if (pn.b(-12564)) {
                        L28: {
                          int discarded$21 = 0;
                          ka.b();
                          if (7 != on.field_g) {
                            break L28;
                          } else {
                            if (bb.field_h) {
                              break L28;
                            } else {
                              bb.field_h = true;
                              stackOut_91_0 = -1;
                              stackIn_92_0 = stackOut_91_0;
                              return stackIn_92_0;
                            }
                          }
                        }
                        L29: {
                          if (on.field_g != 7) {
                            break L29;
                          } else {
                            on.field_g = 3;
                            break L29;
                          }
                        }
                        me.field_E = df.field_z.l(-1);
                        bb.field_h = false;
                        stackOut_95_0 = on.field_g;
                        stackIn_96_0 = stackOut_95_0;
                        return stackIn_96_0;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L30: {
                    if (null == ch.field_c) {
                      if (bb.field_h) {
                        L31: {
                          if (rk.a(-68) <= 30000L) {
                            me.field_E = wl.field_R;
                            break L31;
                          } else {
                            me.field_E = tg.field_a;
                            break L31;
                          }
                        }
                        bb.field_h = false;
                        stackOut_104_0 = 3;
                        stackIn_105_0 = stackOut_104_0;
                        return stackIn_105_0;
                      } else {
                        var6_int = ng.field_G;
                        ng.field_G = dh.field_Lb;
                        bb.field_h = true;
                        dh.field_Lb = var6_int;
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                  stackOut_106_0 = -1;
                  stackIn_107_0 = stackOut_106_0;
                  break L0;
                } else {
                  stackOut_6_0 = 41;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_108_0 = (RuntimeException) var6;
                stackOut_108_1 = new StringBuilder().append("wn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param3 == null) {
                  stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                  stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
                  stackOut_110_2 = "null";
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  break L32;
                } else {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "{...}";
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_111_1 = stackOut_109_1;
                  stackIn_111_2 = stackOut_109_2;
                  break L32;
                }
              }
              L33: {
                stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
                stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',').append(param4).append(',');
                stackIn_113_0 = stackOut_111_0;
                stackIn_113_1 = stackOut_111_1;
                stackIn_112_0 = stackOut_111_0;
                stackIn_112_1 = stackOut_111_1;
                if (param5 == null) {
                  stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
                  stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                  stackOut_113_2 = "null";
                  stackIn_114_0 = stackOut_113_0;
                  stackIn_114_1 = stackOut_113_1;
                  stackIn_114_2 = stackOut_113_2;
                  break L33;
                } else {
                  stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                  stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                  stackOut_112_2 = "{...}";
                  stackIn_114_0 = stackOut_112_0;
                  stackIn_114_1 = stackOut_112_1;
                  stackIn_114_2 = stackOut_112_2;
                  break L33;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_114_0, stackIn_114_2 + ')');
            }
            return stackIn_107_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    String b(boolean param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (!(((wn) this).field_B == null)) {
            var3 = ((wn) this).field_B.b(param0);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    qm a(int param0) {
        if (param0 < 31) {
            return null;
        }
        qm var2 = ((wn) this).field_B;
        if (var2 == null) {
            return null;
        }
        if (!var2.d(-2116)) {
            return null;
        }
        return var2;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              var5_int = 43 % ((param3 - 50) / 60);
              if (!((wn) this).a(param0, (byte) -90, param2, param1)) {
                break L1;
              } else {
                ((wn) this).a(param0, param1, param2, 1);
                ((wn) this).a(0, param2, param0, param1);
                break L1;
              }
            }
            stackOut_2_0 = (StringBuilder) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("wn.FA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            boolean discarded$0 = ((wn) this).d(-106);
        }
        return null != ((wn) this).a(103) ? true : false;
    }

    wn(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param2 == 0) {
            if (!(null == ((wn) this).field_r)) {
                ((wn) this).field_r.a((qm) this, 5592405, param1, param3, true);
            }
        }
        if (!(((wn) this).field_B == null)) {
            ((wn) this).field_B.a((byte) -100, param1 + ((wn) this).field_n, param2, param3 - -((wn) this).field_j);
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            StringBuilder discarded$15 = param2.append('\n');
            var5_int = param0;
            L1: while (true) {
              if (var5_int > param3) {
                L2: {
                  if (((wn) this).field_B != null) {
                    StringBuilder discarded$16 = ((wn) this).field_B.a(param2, 1 + param3, param1, (byte) -93);
                    break L2;
                  } else {
                    StringBuilder discarded$17 = param2.append("null");
                    break L2;
                  }
                }
                break L0;
              } else {
                StringBuilder discarded$18 = param2.append(' ');
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("wn.P(").append(param0).append(',');
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
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            wn.a((byte) 24, (dj) null);
        }
        return ((wn) this).field_B == null ? 0 : ((wn) this).field_B.c(0);
    }

    private final boolean a(qm param0) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
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
              L2: {
                if (null == ((wn) this).field_B) {
                  break L2;
                } else {
                  if (((wn) this).field_B.d(-2116)) {
                    break L2;
                  } else {
                    if (!((wn) this).field_B.a(0, param0)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wn.K(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        RuntimeException var7 = null;
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
        try {
          L0: {
            L1: {
              if (null != ((wn) this).field_B) {
                ((wn) this).field_B.a(param0, -20592, param2, ((wn) this).field_j + param3, ((wn) this).field_n + param4, param5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -20592) {
                break L2;
              } else {
                field_C = 79;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("wn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
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
              if (param5 == 0) {
                break L1;
              } else {
                ((wn) this).field_B = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((wn) this).field_B == null) {
                  break L3;
                } else {
                  if (!((wn) this).field_B.d(-2116)) {
                    break L3;
                  } else {
                    if (!((wn) this).field_B.a(param0, param1, param2, param3, param4, 0, param6)) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("wn.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
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
              if (((wn) this).field_B == null) {
                break L1;
              } else {
                if (!((wn) this).field_B.d(-2116)) {
                  break L1;
                } else {
                  if (((wn) this).field_B.a(param0, (byte) -127, param2, param3)) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 <= -120) {
                break L2;
              } else {
                String discarded$5 = ((wn) this).b(false);
                break L2;
              }
            }
            var5_int = param3;
            if (var5_int == 80) {
              L3: {
                if (ri.field_b[81]) {
                  int discarded$6 = 0;
                  stackOut_12_0 = this.a(param0);
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = this.a(false, param0);
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("wn.N(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
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
              L2: {
                var8_int = -70 % ((-42 - param4) / 35);
                if (null == ((wn) this).field_B) {
                  break L2;
                } else {
                  if (!((wn) this).field_B.a(param0, param1, param2, param3 + ((wn) this).field_j, 53, param5, ((wn) this).field_n + param6)) {
                    break L2;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    break L1;
                  }
                }
              }
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("wn.DA(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(byte param0, dj param1) {
        try {
            if (param0 != 111) {
                Object var3 = null;
                wn.a((byte) 9, (dj) null);
            }
            mc.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wn.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (null != ((wn) this).field_B) {
                ((wn) this).field_B.a(param0, ((wn) this).field_n + param1, param2, ((wn) this).field_j + param3);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("wn.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(byte param0) {
        if (param0 != -75) {
            Object var3 = null;
            boolean discarded$0 = this.a(true, (qm) null);
        }
        if (null != ((wn) this).field_B) {
            ((wn) this).field_B.e((byte) 100);
        }
    }

    private final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (null == ((wn) this).field_B) {
                    break L2;
                  } else {
                    if (((wn) this).field_B.d(-2116)) {
                      break L2;
                    } else {
                      if (!((wn) this).field_B.a(0, param1)) {
                        break L2;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("wn.I(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
            Object var7 = null;
            ((wn) this).a(-47, (Hashtable) null, (StringBuilder) null, -126);
        }
        super.a(param0, param1, param2, param3, -75);
        ((wn) this).a((byte) -75);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = " wand";
        field_A = "Graveyard:";
        field_C = 0;
    }
}
