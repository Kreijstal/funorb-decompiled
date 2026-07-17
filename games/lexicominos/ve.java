/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a() {
        field_b = null;
        field_e = null;
    }

    final int a(int param0, boolean param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 ? 1 : 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (var5_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = (-param2 + param0 << 8) / var5_int;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (var9 != 60) {
                    if (62 != var9) {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ve.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_15_0;
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var11 = null;
            int stackIn_5_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_53_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_112_0 = 0;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            String stackIn_116_2 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            String stackIn_119_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_108_0 = 0;
            int stackOut_111_0 = 0;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            String stackOut_114_2 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            RuntimeException stackOut_118_0 = null;
            StringBuilder stackOut_118_1 = null;
            String stackOut_118_2 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            String stackOut_117_2 = null;
            var9 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != jc.field_b) {
                    break L1;
                  } else {
                    if (!dg.a(param3, true)) {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (uf.field_m == ae.field_E) {
                    L3: {
                      if (param3) {
                        fa.field_b = ef.a(rc.field_f, -27981, (String) null, false, param0);
                        break L3;
                      } else {
                        int discarded$16 = -111;
                        int discarded$17 = 0;
                        fa.field_b = fj.a(param0, param4);
                        break L3;
                      }
                    }
                    ed.field_q.field_h = 0;
                    ed.field_q.c(14, -1);
                    ed.field_q.c(fa.field_b.a((byte) 45).field_b, -1);
                    kc.a(-1, -1);
                    uf.field_m = rb.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (uf.field_m == rb.field_d) {
                    int discarded$18 = 10343;
                    if (!a.b(1)) {
                      break L4;
                    } else {
                      var6_int = ig.field_a.d(true);
                      ig.field_a.field_h = 0;
                      if (var6_int == 0) {
                        uf.field_m = kf.field_z;
                        break L4;
                      } else {
                        pg.field_d = var6_int;
                        a.field_c = -1;
                        uf.field_m = uh.field_l;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (kf.field_z != uf.field_m) {
                    break L5;
                  } else {
                    int discarded$19 = 10343;
                    if (!a.b(8)) {
                      break L5;
                    } else {
                      ti.field_M = ig.field_a.f((byte) 49);
                      ig.field_a.field_h = 0;
                      ri.a(param2, param3, fa.field_b, (byte) -82, param5);
                      uf.field_m = he.field_h;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (uf.field_m != he.field_h) {
                    break L6;
                  } else {
                    int discarded$20 = 10343;
                    if (!a.b(1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = ig.field_a.d(true);
                        ig.field_a.field_h = 0;
                        pg.field_d = var6_int;
                        og.field_b = null;
                        if (0 == var6_int) {
                          break L7;
                        } else {
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if (8 != var6_int) {
                              a.field_c = -1;
                              uf.field_m = uh.field_l;
                              break L6;
                            } else {
                              ck.b((byte) -30);
                              fb.field_p = false;
                              stackOut_35_0 = var6_int;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0;
                            }
                          }
                        }
                      }
                      a.field_c = -1;
                      uf.field_m = ug.field_q;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (uf.field_m == ug.field_q) {
                    int discarded$21 = 2;
                    if (!dc.d()) {
                      break L8;
                    } else {
                      L9: {
                        rc.field_f = ig.field_a.f((byte) -110);
                        vb.field_i = ig.field_a.d(true);
                        int discarded$22 = ig.field_a.d(true);
                        jd.field_c = ig.field_a.b(-1698573656);
                        var6_ref = ig.field_a.e((byte) -90);
                        var7 = ig.field_a.d(true);
                        if ((1 & var7) != -1) {
                          int discarded$23 = 120;
                          fg.a();
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param3) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == (var7 & 4)) {
                              stackOut_49_0 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              break L11;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L11;
                            }
                          }
                          L12: {
                            jl.field_c = stackIn_50_0 != 0;
                            if ((8 & var7) == 0) {
                              stackOut_52_0 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              break L12;
                            } else {
                              stackOut_51_0 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              break L12;
                            }
                          }
                          ul.field_k = stackIn_53_0 != 0;
                          if (ul.field_k) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        if (!qb.field_c) {
                          break L13;
                        } else {
                          int discarded$24 = ig.field_a.d(true);
                          int discarded$25 = ig.field_a.d(true);
                          int discarded$26 = ig.field_a.d((byte) 19);
                          ef.field_f = ig.field_a.b(-1698573656);
                          kc.field_d = new byte[ef.field_f];
                          var8 = 0;
                          L14: while (true) {
                            if (ef.field_f <= var8) {
                              break L13;
                            } else {
                              kc.field_d[var8] = ig.field_a.e(true);
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        og.field_c = ig.field_a.c(false);
                        var11 = (CharSequence) (Object) og.field_c;
                        int discarded$27 = -48;
                        cb.field_t = ck.a(var11);
                        be.field_l = ig.field_a.d(true);
                        uf.field_m = gg.field_b;
                        if (fa.field_b.a((byte) 45) == jf.field_M) {
                          bb.field_J.a(kk.c(-14047), 4096);
                          break L15;
                        } else {
                          if (fa.field_b.a((byte) 45) != ej.field_a) {
                            break L15;
                          } else {
                            mh.field_B.a(kk.c(-14047), 4096);
                            break L15;
                          }
                        }
                      }
                      L16: {
                        fb.field_p = false;
                        if (null != var6_ref) {
                          ee.a(var6_ref, -11971, kk.c(-14047));
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (0 < jd.field_c) {
                            break L18;
                          } else {
                            if (jl.field_c) {
                              break L18;
                            } else {
                              try {
                                L19: {
                                  Object discarded$28 = oa.a(true, kk.c(-14047), "unzap");
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
                            }
                          }
                        }
                        try {
                          L21: {
                            int discarded$29 = 37;
                            Object discarded$30 = oa.a(kk.c(-14047), 22347, "zap", new Object[1]);
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
                        if (jd.field_c <= 0) {
                          break L23;
                        } else {
                          hl.field_F = true;
                          break L23;
                        }
                      }
                      ed.field_q.a(l.field_F, 55);
                      var8 = 0;
                      L24: while (true) {
                        if (var8 >= 4) {
                          ig.field_a.a(l.field_F, 16);
                          stackOut_83_0 = pg.field_d;
                          stackIn_84_0 = stackOut_83_0;
                          return stackIn_84_0;
                        } else {
                          l.field_F[var8] = l.field_F[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L25: {
                  if (uf.field_m != uh.field_l) {
                    break L25;
                  } else {
                    int discarded$31 = 2;
                    if (dc.d()) {
                      L26: {
                        ck.b((byte) -96);
                        if (7 != pg.field_d) {
                          break L26;
                        } else {
                          if (!fb.field_p) {
                            fb.field_p = true;
                            stackOut_98_0 = -1;
                            stackIn_99_0 = stackOut_98_0;
                            return stackIn_99_0;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (pg.field_d == 7) {
                          pg.field_d = 3;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      wj.field_p = ig.field_a.c(false);
                      fb.field_p = false;
                      stackOut_96_0 = pg.field_d;
                      stackIn_97_0 = stackOut_96_0;
                      return stackIn_97_0;
                    } else {
                      break L25;
                    }
                  }
                }
                L28: {
                  if (jc.field_b != null) {
                    break L28;
                  } else {
                    if (!fb.field_p) {
                      var6_int = nj.field_a;
                      nj.field_a = mg.field_y;
                      fb.field_p = true;
                      mg.field_y = var6_int;
                      break L28;
                    } else {
                      L29: {
                        if (vl.b(-92) <= 30000L) {
                          wj.field_p = sa.field_h;
                          break L29;
                        } else {
                          wj.field_p = nk.field_t;
                          break L29;
                        }
                      }
                      fb.field_p = false;
                      stackOut_108_0 = 3;
                      stackIn_109_0 = stackOut_108_0;
                      return stackIn_109_0;
                    }
                  }
                }
                stackOut_111_0 = -1;
                stackIn_112_0 = stackOut_111_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_113_0 = (RuntimeException) var6;
                stackOut_113_1 = new StringBuilder().append("ve.G(");
                stackIn_115_0 = stackOut_113_0;
                stackIn_115_1 = stackOut_113_1;
                stackIn_114_0 = stackOut_113_0;
                stackIn_114_1 = stackOut_113_1;
                if (param0 == null) {
                  stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                  stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                  stackOut_115_2 = "null";
                  stackIn_116_0 = stackOut_115_0;
                  stackIn_116_1 = stackOut_115_1;
                  stackIn_116_2 = stackOut_115_2;
                  break L30;
                } else {
                  stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
                  stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
                  stackOut_114_2 = "{...}";
                  stackIn_116_0 = stackOut_114_0;
                  stackIn_116_1 = stackOut_114_1;
                  stackIn_116_2 = stackOut_114_2;
                  break L30;
                }
              }
              L31: {
                stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                stackOut_116_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(44).append(-25).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_118_0 = stackOut_116_0;
                stackIn_118_1 = stackOut_116_1;
                stackIn_117_0 = stackOut_116_0;
                stackIn_117_1 = stackOut_116_1;
                if (param4 == null) {
                  stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
                  stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
                  stackOut_118_2 = "null";
                  stackIn_119_0 = stackOut_118_0;
                  stackIn_119_1 = stackOut_118_1;
                  stackIn_119_2 = stackOut_118_2;
                  break L31;
                } else {
                  stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                  stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
                  stackOut_117_2 = "{...}";
                  stackIn_119_0 = stackOut_117_0;
                  stackIn_119_1 = stackOut_117_1;
                  stackIn_119_2 = stackOut_117_2;
                  break L31;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_119_0, stackIn_119_2 + 44 + param5 + 41);
            }
            return stackIn_112_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        rj[] var3 = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = -1;
          if (((ve) this).field_c != null) {
            var3 = ((ve) this).field_c;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (null != var5) {
                  var6 = var5.a((byte) 103);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 94) {
            break L2;
          } else {
            int discarded$1 = 1;
            ve.a();
            break L2;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (null == ((ve) this).field_c) {
            break L0;
          } else {
            if (((ve) this).field_c.length == 0) {
              break L0;
            } else {
              if (param2 >= ((ve) this).field_c[0].field_d) {
                L1: {
                  if (param1 <= -97) {
                    break L1;
                  } else {
                    int discarded$2 = ((ve) this).a((byte) -5, -94);
                    break L1;
                  }
                }
                if (((ve) this).field_c[((ve) this).field_c.length - 1].field_c >= param2) {
                  if (((ve) this).field_c.length != 1) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((ve) this).field_c.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((ve) this).field_c[var5];
                          if (var6.field_d > param2) {
                            break L3;
                          } else {
                            if (param2 <= var6.field_c) {
                              var7 = var6.a(param0, (byte) -100);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_a.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((ve) this).field_c[0].a(param0, (byte) -100);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (((ve) this).field_c == null) {
                break L1;
              } else {
                if (((ve) this).field_c.length <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = -((ve) this).field_c[0].field_d + ((ve) this).field_c[-1 + ((ve) this).field_c.length].field_c;
                  stackIn_7_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 36;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        rj var4 = null;
        int var5 = Lexicominos.field_L ? 1 : 0;
        for (var3 = 0; var3 < ((ve) this).field_c.length; var3++) {
            var4 = ((ve) this).field_c[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (var4.field_a.length + -1);
        }
        if (param0 != 28276) {
            int discarded$0 = ((ve) this).a(73, (byte) 15, -124);
        }
        return ((ve) this).field_c.length;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        rj var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        rj[] var7 = ((ve) this).field_c;
        rj[] var3 = var7;
        if (param0 > -108) {
            return 107;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_a.length > param1) {
                return var5.field_a[param1];
            }
            param1 = param1 - (var5.field_a.length + -1);
        }
        return 0;
    }

    final static String b() {
        if (bk.field_c == ca.field_i) {
          return Lexicominos.field_H;
        } else {
          if (qa.field_c.b(12)) {
            if (ca.field_i == ee.field_c) {
              return qa.field_c.a(false);
            } else {
              return dd.field_d;
            }
          } else {
            return qa.field_c.a(false);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new dg();
        field_b = new String[]{"The dictionaries used by Lexicominos have been compiled with reference to multiple independent sources.", "Certain words, which may offend some players, have been omitted, as have all words shorter than 3 letters or longer than 8."};
        field_a = true;
    }
}
