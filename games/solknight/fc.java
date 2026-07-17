/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends gg {
    static int field_o;
    static boolean field_m;
    byte[] field_h;
    static int[] field_n;
    g[] field_i;
    private int[] field_k;
    byte[] field_r;
    byte[] field_p;
    sh[] field_q;
    static gl field_l;
    int field_j;
    short[] field_s;

    final static int a(String param0, int param1, boolean param2, boolean param3, String param4, int param5) {
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
            int stackIn_6_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_98_0 = 0;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            String stackIn_102_2 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            String stackIn_105_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_97_0 = 0;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            String stackOut_101_2 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            String stackOut_104_2 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            var9 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == lf.field_d) {
                    if (!ai.a(param2, (byte) -37)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (qc.field_i != ef.field_e) {
                    break L2;
                  } else {
                    L3: {
                      if (param2) {
                        var11 = null;
                        lf.field_a = pb.a(false, param4, kc.field_P, 0, (String) null);
                        break L3;
                      } else {
                        lf.field_a = rj.a(param0, (byte) 102, param4, false);
                        break L3;
                      }
                    }
                    id.field_c.field_m = 0;
                    id.field_c.c(-121, 14);
                    id.field_c.c(-127, lf.field_a.a(77).field_e);
                    qf.a(0, -1);
                    ef.field_e = gl.field_s;
                    break L2;
                  }
                }
                L4: {
                  if (ef.field_e != gl.field_s) {
                    break L4;
                  } else {
                    if (bf.c(81, 1)) {
                      var6_int = te.field_N.j(255);
                      te.field_N.field_m = 0;
                      if (0 != var6_int) {
                        ef.field_e = ik.field_e;
                        ob.field_h = var6_int;
                        te.field_O = -1;
                        break L4;
                      } else {
                        ef.field_e = pl.field_b;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (ef.field_e == pl.field_b) {
                    if (bf.c(54, 8)) {
                      i.field_H = te.field_N.a(10526);
                      te.field_N.field_m = 0;
                      ci.a(-25776, param2, param1, lf.field_a, param3);
                      ef.field_e = rc.field_o;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (ef.field_e != rc.field_o) {
                    break L6;
                  } else {
                    if (!bf.c(53, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = te.field_N.j(255);
                        ob.field_h = var6_int;
                        te.field_N.field_m = 0;
                        ri.field_a = null;
                        if (0 == var6_int) {
                          break L7;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int != 8) {
                              ef.field_e = ik.field_e;
                              te.field_O = -1;
                              break L6;
                            } else {
                              je.a(false);
                              je.field_c = false;
                              stackOut_30_0 = var6_int;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      ef.field_e = dk.field_h;
                      te.field_O = -1;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (dk.field_h == ef.field_e) {
                    if (qd.b((byte) 127)) {
                      L9: {
                        kc.field_P = te.field_N.a(10526);
                        lh.field_s = te.field_N.j(255);
                        int discarded$7 = te.field_N.j(255);
                        ob.field_l = te.field_N.i(-103);
                        var12 = te.field_N.g(87);
                        var7 = te.field_N.j(255);
                        if (0 != (var7 & 1)) {
                          uf.d(31911);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param2) {
                          break L10;
                        } else {
                          L11: {
                            if ((4 & var7) == 0) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L11;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L11;
                            }
                          }
                          L12: {
                            lc.field_u = stackIn_44_0 != 0;
                            if (0 == (8 & var7)) {
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L12;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L12;
                            }
                          }
                          fb.field_a = stackIn_47_0 != 0;
                          if (!fb.field_a) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        if (!b.field_b) {
                          break L13;
                        } else {
                          int discarded$8 = te.field_N.j(255);
                          int discarded$9 = te.field_N.j(255);
                          int discarded$10 = te.field_N.e(true);
                          me.field_d = te.field_N.i(-105);
                          dk.field_l = new byte[me.field_d];
                          var8 = 0;
                          L14: while (true) {
                            if (var8 >= me.field_d) {
                              break L13;
                            } else {
                              dk.field_l[var8] = te.field_N.a((byte) -14);
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ne.field_g = te.field_N.h(16);
                        var13 = (CharSequence) (Object) ne.field_g;
                        kf.field_D = jg.a(var13, -2);
                        c.field_H = te.field_N.j(255);
                        ef.field_e = jj.field_Y;
                        if (lf.field_a.a(123) != dc.field_k) {
                          if (lf.field_a.a(70) != qb.field_L) {
                            break L15;
                          } else {
                            bb.field_I.a((byte) 104, ia.g(-78));
                            break L15;
                          }
                        } else {
                          sk.field_p.a((byte) 82, ia.g(-55));
                          break L15;
                        }
                      }
                      L16: {
                        je.field_c = false;
                        if (var12 != null) {
                          kl.a(ia.g(90), var12, 13536);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (ob.field_l > 0) {
                            break L18;
                          } else {
                            if (!lc.field_u) {
                              try {
                                L19: {
                                  Object discarded$11 = fd.a(ia.g(110), "unzap", (byte) 101);
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
                            Object discarded$12 = fd.a(-4476, ia.g(-63), "zap", new Object[1]);
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
                        if (0 >= ob.field_l) {
                          break L23;
                        } else {
                          cl.field_m = true;
                          break L23;
                        }
                      }
                      id.field_c.a(-1, ed.field_a);
                      var8 = 0;
                      L24: while (true) {
                        if (var8 >= 4) {
                          te.field_N.a(-1, ed.field_a);
                          stackOut_73_0 = ob.field_h;
                          stackIn_74_0 = stackOut_73_0;
                          return stackIn_74_0;
                        } else {
                          ed.field_a[var8] = ed.field_a[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L25: {
                  if (ik.field_e == ef.field_e) {
                    if (!qd.b((byte) 125)) {
                      break L25;
                    } else {
                      L26: {
                        je.a(false);
                        if (ob.field_h != 7) {
                          break L26;
                        } else {
                          if (!je.field_c) {
                            je.field_c = true;
                            stackOut_86_0 = -1;
                            stackIn_87_0 = stackOut_86_0;
                            return stackIn_87_0;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (ob.field_h == 7) {
                          ob.field_h = 3;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      md.field_v = te.field_N.h(121);
                      je.field_c = false;
                      stackOut_84_0 = ob.field_h;
                      stackIn_85_0 = stackOut_84_0;
                      return stackIn_85_0;
                    }
                  } else {
                    break L25;
                  }
                }
                L28: {
                  var10 = null;
                  ve discarded$13 = fc.a((Throwable) null, (String) null);
                  if (null == lf.field_d) {
                    if (je.field_c) {
                      L29: {
                        if (dh.b(-1) > 30000L) {
                          md.field_v = il.field_d;
                          break L29;
                        } else {
                          md.field_v = cl.field_j;
                          break L29;
                        }
                      }
                      je.field_c = false;
                      stackOut_95_0 = 3;
                      stackIn_96_0 = stackOut_95_0;
                      return stackIn_96_0;
                    } else {
                      var6_int = ia.field_kb;
                      ia.field_kb = ki.field_C;
                      ki.field_C = var6_int;
                      je.field_c = true;
                      break L28;
                    }
                  } else {
                    break L28;
                  }
                }
                stackOut_97_0 = -1;
                stackIn_98_0 = stackOut_97_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_99_0 = (RuntimeException) var6;
                stackOut_99_1 = new StringBuilder().append("fc.D(");
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_100_0 = stackOut_99_0;
                stackIn_100_1 = stackOut_99_1;
                if (param0 == null) {
                  stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                  stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                  stackOut_101_2 = "null";
                  stackIn_102_0 = stackOut_101_0;
                  stackIn_102_1 = stackOut_101_1;
                  stackIn_102_2 = stackOut_101_2;
                  break L30;
                } else {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "{...}";
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_102_1 = stackOut_100_1;
                  stackIn_102_2 = stackOut_100_2;
                  break L30;
                }
              }
              L31: {
                stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
                stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_104_0 = stackOut_102_0;
                stackIn_104_1 = stackOut_102_1;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                if (param4 == null) {
                  stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
                  stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
                  stackOut_104_2 = "null";
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  break L31;
                } else {
                  stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                  stackOut_103_2 = "{...}";
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_105_1 = stackOut_103_1;
                  stackIn_105_2 = stackOut_103_2;
                  break L31;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + 44 + 0 + 41);
            }
            return stackIn_98_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        ((fc) this).field_k = null;
        if (param0 != 6890) {
            fc.a((byte) 62);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        if (param0 != 124) {
            Object var2 = null;
            ve discarded$0 = fc.a((Throwable) null, (String) null);
        }
    }

    final boolean a(me param0, int[] param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = 89 % ((-82 - param3) / 36);
            var5_int = 1;
            var7 = 0;
            var8 = null;
            var9 = 0;
            L1: while (true) {
              if (var9 >= 128) {
                stackOut_19_0 = var5_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param2 == null) {
                      break L3;
                    } else {
                      if (param2[var9] != 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = ((fc) this).field_k[var9];
                  if (0 != var10) {
                    L4: {
                      if (var7 == var10) {
                        break L4;
                      } else {
                        L5: {
                          var7 = var10;
                          var10--;
                          if (0 == (var10 & 1)) {
                            var8 = (Object) (Object) param0.a(0, var10 >> 2, param1);
                            break L5;
                          } else {
                            var8 = (Object) (Object) param0.a(param1, -2, var10 >> 2);
                            break L5;
                          }
                        }
                        if (var8 == null) {
                          var5_int = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 != null) {
                      ((fc) this).field_q[var9] = (sh) var8;
                      ((fc) this).field_k[var9] = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("fc.C(");
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
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final static ve a(Throwable param0, String param1) {
        ve var2 = null;
        if (param0 instanceof ve) {
            var2 = (ve) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        } else {
            var2 = new ve(param0, param1);
        }
        return var2;
    }

    fc(byte[] param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        g[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        g var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gb var38 = null;
        byte[] var39 = null;
        g var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        g var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        g var48 = null;
        g var49 = null;
        g var50 = null;
        g var51 = null;
        g var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((fc) this).field_r = new byte[128];
        ((fc) this).field_p = new byte[128];
        ((fc) this).field_h = new byte[128];
        ((fc) this).field_i = new g[128];
        ((fc) this).field_q = new sh[128];
        ((fc) this).field_s = new short[128];
        ((fc) this).field_k = new int[128];
        var38 = new gb(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_l[var3 + var38.field_m]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_m = var38.field_m + 1;
                var5 = var38.field_m;
                var38.field_m = var38.field_m + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_l[var38.field_m + var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_m = var38.field_m + 1;
                        var8 = var38.field_m;
                        var38.field_m = var38.field_m + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_l[var9 + var38.field_m] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_m = var38.field_m + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.j(255);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (var13_int < var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new g[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.j(255);
                                      if (var14 > 0) {
                                        stackOut_37_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.j(255);
                                      if (var14 <= 0) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_l[var38.field_m + var17] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_m = var38.field_m + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var23) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((fc) this).field_j = var38.j(255) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (~var27 <= ~var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var70.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.a((byte) -14);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (var27 >= var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.a((byte) -14);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var12 <= var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.j(255);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (~var29 <= ~var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((fc) this).field_p[var30] = (byte)(32 + ((fc) this).field_p[var30] * var28 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (var30 + -var27) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = ke.b(var32, -1697860097, var30 + -var27);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((fc) this).field_p[var33] = (byte)(32 + var34 * ((fc) this).field_p[var33] >> 6);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((fc) this).field_p[var29] = (byte)(((fc) this).field_p[var29] * var28 + 32 >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.j(255));
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 == null) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        var19 = var38.j(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (~var29 <= ~var47.length) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((fc) this).field_r[var30]) - -var28;
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (var31 <= 128) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((fc) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << 1;
                                                                                                    var32 = (var30 + -var27) * var28 + (var30 - var27) / 2;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (~var30 >= ~var37) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = ke.b(var32, -1697860097, -var27 + var30);
                                                                                                          var35 = var34 + (255 & ((fc) this).field_r[var37]);
                                                                                                          if (var35 >= 0) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (var35 <= 128) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((fc) this).field_r[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (((fc) this).field_r[var29] & 255);
                                                                                                  if (0 <= var30) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (var30 <= 128) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((fc) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.j(255));
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (~var27 <= ~var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (~var27 <= ~var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_d <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_f = var38.j(255);
                                                                                                            break L52;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (var51.field_m <= 0) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_d = var38.j(255);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_m = var38.j(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_j) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_b = var38.j(255);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var50.field_i == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_h = var38.j(255);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_c <= 0) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_g = var38.j(255);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_c = var38.j(255);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_j == null) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (~var29 <= ~var49.field_j.length) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = var38.j(255) + var19 - -1;
                                                                                            var49.field_j[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L58;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L59: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_i) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (~var48.field_i.length >= ~var29) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = 1 + (var19 - -var38.j(255));
                                                                                        var48.field_i[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L60;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L61: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_j) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (~var29 <= ~var45.field_j.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_j[var29] = var38.a((byte) -14);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var45.field_i) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (-2 + var45.field_i.length <= var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_i[var29] = var38.a((byte) -14);
                                                                                    var29 += 2;
                                                                                    continue L64;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L65: {
                                                                          if (var20 != 0) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (var66.length > var21) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (0 >= ((fc) this).field_k[var27]) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = 1 + var38.j(255);
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((fc) this).field_p[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((fc) this).field_k[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (~var21 > ~var69.length) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((fc) this).field_i[var26] = (g) var25;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (((fc) this).field_k[var25_int] == 0) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (var20 != 0) {
                                                                        break L70;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = 16 + var38.field_l[incrementValue$12] << 2;
                                                                        if (var68.length <= var21) {
                                                                          var20 = -1;
                                                                          break L70;
                                                                        } else {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L70;
                                                                        }
                                                                      }
                                                                    }
                                                                    ((fc) this).field_r[var25_int] = (byte)var24;
                                                                    var20--;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L71: {
                                                              if (((fc) this).field_k[var24] == 0) {
                                                                break L71;
                                                              } else {
                                                                L72: {
                                                                  if (0 != var20) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (var21 >= var67.length) {
                                                                        var20 = -1;
                                                                        break L73;
                                                                      } else {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = -1 + var38.field_l[incrementValue$15];
                                                                    break L72;
                                                                  }
                                                                }
                                                                ((fc) this).field_h[var24] = (byte)var23;
                                                                var20--;
                                                                break L71;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L74: {
                                                          if (var20 != 0) {
                                                            break L74;
                                                          } else {
                                                            L75: {
                                                              if (var21 < var66.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L75;
                                                              } else {
                                                                var20 = -1;
                                                                break L75;
                                                              }
                                                            }
                                                            var22 = var38.c((byte) 120);
                                                            break L74;
                                                          }
                                                        }
                                                        ((fc) this).field_s[var23] = (short)(((fc) this).field_s[var23] + (fi.a(-1 + var22, 2) << 14));
                                                        var20--;
                                                        ((fc) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.j(255);
                                                    ((fc) this).field_s[var20] = (short)(((fc) this).field_s[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.j(255);
                                                ((fc) this).field_s[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) -14);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L76: {
                                      g dupTemp$17 = new g();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.j(255);
                                      if (var16_int <= 0) {
                                        break L76;
                                      } else {
                                        var15.field_j = new byte[2 * var16_int];
                                        break L76;
                                      }
                                    }
                                    L77: {
                                      var16_int = var38.j(255);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_i = new byte[2 + 2 * var16_int];
                                        var40.field_i[1] = (byte) 64;
                                        break L77;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a((byte) -14);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.a((byte) -14);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.a((byte) -14);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_n = new int[]{1, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 5, 2, 3, 10, 2};
        field_m = false;
        field_l = null;
    }
}
