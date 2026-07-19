/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
            field_d = -91;
        }
    }

    final int a(int param0, boolean param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 ? 1 : 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var7 ^ -1) >= (var8 ^ -1)) {
                    break L3;
                  } else {
                    var9 = param3.charAt(var8);
                    stackOut_3_0 = var9;
                    stackOut_3_1 = 60;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_14_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L5;
                          } else {
                            var6 = 1;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (62 != var9) {
                            break L6;
                          } else {
                            var6 = 0;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (var9 == 32) {
                            var5_int++;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = -1;
                stackOut_13_1 = var5_int ^ -1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              }
              if (stackIn_14_0 <= stackIn_14_1) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_15_0 = (-param2 + param0 << -796485304) / var5_int;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("ve.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            Object discarded$10 = null;
            Object discarded$11 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var11 = null;
            int stackIn_5_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_103_0 = 0;
            int stackIn_106_0 = 0;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            String stackIn_110_2 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            String stackIn_113_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_102_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_21_0 = 0;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            String stackOut_108_2 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            String stackOut_112_2 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            String stackOut_111_2 = null;
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
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (uf.field_m == ae.field_E) {
                    L3: {
                      L4: {
                        if (param3) {
                          break L4;
                        } else {
                          fa.field_b = fj.a(param0, param4, false, param1 ^ 118);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      fa.field_b = ef.a(rc.field_f, param1 ^ 27988, (String) null, false, param0);
                      break L3;
                    }
                    ed.field_q.field_h = 0;
                    ed.field_q.c(14, param1 + 24);
                    ed.field_q.c(fa.field_b.a((byte) 45).field_b, -1);
                    kc.a(-1, -1);
                    uf.field_m = rb.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (uf.field_m == rb.field_d) {
                    if (!a.b(1, 10343)) {
                      break L5;
                    } else {
                      L6: {
                        var6_int = ig.field_a.d(true);
                        ig.field_a.field_h = 0;
                        if (-1 == (var6_int ^ -1)) {
                          break L6;
                        } else {
                          pg.field_d = var6_int;
                          a.field_c = -1;
                          uf.field_m = uh.field_l;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      uf.field_m = kf.field_z;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (param1 == -25) {
                  L7: {
                    if (kf.field_z != uf.field_m) {
                      break L7;
                    } else {
                      if (!a.b(8, 10343)) {
                        break L7;
                      } else {
                        ti.field_M = ig.field_a.f((byte) 49);
                        ig.field_a.field_h = 0;
                        ri.a(param2, param3, fa.field_b, (byte) -82, param5);
                        uf.field_m = he.field_h;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (uf.field_m != he.field_h) {
                      break L8;
                    } else {
                      if (!a.b(1, 10343)) {
                        break L8;
                      } else {
                        L9: {
                          var6_int = ig.field_a.d(true);
                          ig.field_a.field_h = 0;
                          pg.field_d = var6_int;
                          og.field_b = null;
                          if (0 == var6_int) {
                            break L9;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L9;
                            } else {
                              if (8 != var6_int) {
                                a.field_c = -1;
                                uf.field_m = uh.field_l;
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              } else {
                                ck.b((byte) -30);
                                fb.field_p = false;
                                stackOut_31_0 = var6_int;
                                stackIn_32_0 = stackOut_31_0;
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                        a.field_c = -1;
                        uf.field_m = ug.field_q;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (uf.field_m == ug.field_q) {
                      if (!dc.d(param1 ^ -27)) {
                        break L10;
                      } else {
                        L11: {
                          rc.field_f = ig.field_a.f((byte) -110);
                          vb.field_i = ig.field_a.d(true);
                          discarded$6 = ig.field_a.d(true);
                          jd.field_c = ig.field_a.b(param1 + -1698573631);
                          var6_ref = ig.field_a.e((byte) -90);
                          var7 = ig.field_a.d(true);
                          if ((1 & var7 ^ -1) != -1) {
                            fg.a((byte) 120);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (param3) {
                            break L12;
                          } else {
                            L13: {
                              if (-1 == (var7 & 4 ^ -1)) {
                                stackOut_44_0 = 0;
                                stackIn_45_0 = stackOut_44_0;
                                break L13;
                              } else {
                                stackOut_43_0 = 1;
                                stackIn_45_0 = stackOut_43_0;
                                break L13;
                              }
                            }
                            L14: {
                              jl.field_c = stackIn_45_0 != 0;
                              if ((8 & var7) == 0) {
                                stackOut_47_0 = 0;
                                stackIn_48_0 = stackOut_47_0;
                                break L14;
                              } else {
                                stackOut_46_0 = 1;
                                stackIn_48_0 = stackOut_46_0;
                                break L14;
                              }
                            }
                            ul.field_k = stackIn_48_0 != 0;
                            if (ul.field_k) {
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L15: {
                          L16: {
                            if (!qb.field_c) {
                              break L16;
                            } else {
                              discarded$7 = ig.field_a.d(true);
                              discarded$8 = ig.field_a.d(true);
                              discarded$9 = ig.field_a.d((byte) 19);
                              ef.field_f = ig.field_a.b(-1698573656);
                              kc.field_d = new byte[ef.field_f];
                              var8 = 0;
                              L17: while (true) {
                                if (ef.field_f <= var8) {
                                  break L16;
                                } else {
                                  kc.field_d[var8] = ig.field_a.e(true);
                                  var8++;
                                  if (var9 != 0) {
                                    break L15;
                                  } else {
                                    if (var9 == 0) {
                                      continue L17;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          og.field_c = ig.field_a.c(false);
                          var11 = (CharSequence) ((Object) og.field_c);
                          cb.field_t = ck.a(var11, (byte) -48);
                          be.field_l = ig.field_a.d(true);
                          uf.field_m = gg.field_b;
                          break L15;
                        }
                        L18: {
                          L19: {
                            if (fa.field_b.a((byte) 45) == jf.field_M) {
                              break L19;
                            } else {
                              if (fa.field_b.a((byte) 45) != ej.field_a) {
                                break L18;
                              } else {
                                mh.field_B.a(kk.c(-14047), 4096);
                                if (var9 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          bb.field_J.a(kk.c(-14047), 4096);
                          break L18;
                        }
                        L20: {
                          fb.field_p = false;
                          if (var6_ref != null) {
                            ee.a(var6_ref, -11971, kk.c(-14047));
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          L22: {
                            if (0 < jd.field_c) {
                              break L22;
                            } else {
                              if (jl.field_c) {
                                break L22;
                              } else {
                                try {
                                  L23: {
                                    discarded$10 = oa.a(true, kk.c(-14047), "unzap");
                                    decompiledRegionSelector0 = 0;
                                    break L23;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L24: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    if (var9 == 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L24;
                                    } else {
                                      decompiledRegionSelector0 = 1;
                                      break L24;
                                    }
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          try {
                            L25: {
                              discarded$11 = oa.a(kk.c(-14047), 22347, "zap", new Object[]{jd.a(rc.field_f, param1 + 62)});
                              break L25;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L26: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L26;
                            }
                          }
                          break L21;
                        }
                        L27: {
                          if (jd.field_c <= 0) {
                            break L27;
                          } else {
                            hl.field_F = true;
                            break L27;
                          }
                        }
                        ed.field_q.a(l.field_F, param1 ^ -48);
                        var8 = 0;
                        L28: while (true) {
                          L29: {
                            L30: {
                              if (-5 >= (var8 ^ -1)) {
                                break L30;
                              } else {
                                l.field_F[var8] = l.field_F[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L29;
                                } else {
                                  if (var9 == 0) {
                                    continue L28;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            ig.field_a.a(l.field_F, 16);
                            break L29;
                          }
                          stackOut_81_0 = pg.field_d;
                          stackIn_82_0 = stackOut_81_0;
                          decompiledRegionSelector1 = 3;
                          break L0;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L31: {
                    if (uf.field_m != uh.field_l) {
                      break L31;
                    } else {
                      if (dc.d(param1 + 27)) {
                        L32: {
                          ck.b((byte) -96);
                          if (7 != pg.field_d) {
                            break L32;
                          } else {
                            if (!fb.field_p) {
                              fb.field_p = true;
                              stackOut_94_0 = -1;
                              stackIn_95_0 = stackOut_94_0;
                              decompiledRegionSelector1 = 5;
                              break L0;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L33: {
                          if (pg.field_d == 7) {
                            pg.field_d = 3;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        wj.field_p = ig.field_a.c(false);
                        fb.field_p = false;
                        stackOut_92_0 = pg.field_d;
                        stackIn_93_0 = stackOut_92_0;
                        decompiledRegionSelector1 = 4;
                        break L0;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L34: {
                    if (jc.field_b != null) {
                      break L34;
                    } else {
                      if (!fb.field_p) {
                        var6_int = nj.field_a;
                        nj.field_a = mg.field_y;
                        fb.field_p = true;
                        mg.field_y = var6_int;
                        break L34;
                      } else {
                        L35: {
                          L36: {
                            if (-30001L <= (vl.b(-92) ^ -1L)) {
                              break L36;
                            } else {
                              wj.field_p = nk.field_t;
                              if (var9 == 0) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          wj.field_p = sa.field_h;
                          break L35;
                        }
                        fb.field_p = false;
                        stackOut_102_0 = 3;
                        stackIn_103_0 = stackOut_102_0;
                        decompiledRegionSelector1 = 6;
                        break L0;
                      }
                    }
                  }
                  stackOut_105_0 = -1;
                  stackIn_106_0 = stackOut_105_0;
                  decompiledRegionSelector1 = 7;
                  break L0;
                } else {
                  stackOut_21_0 = 43;
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L37: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_107_0 = (RuntimeException) (var6);
                stackOut_107_1 = new StringBuilder().append("ve.G(");
                stackIn_109_0 = stackOut_107_0;
                stackIn_109_1 = stackOut_107_1;
                stackIn_108_0 = stackOut_107_0;
                stackIn_108_1 = stackOut_107_1;
                if (param0 == null) {
                  stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackOut_109_2 = "null";
                  stackIn_110_0 = stackOut_109_0;
                  stackIn_110_1 = stackOut_109_1;
                  stackIn_110_2 = stackOut_109_2;
                  break L37;
                } else {
                  stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
                  stackOut_108_2 = "{...}";
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_110_1 = stackOut_108_1;
                  stackIn_110_2 = stackOut_108_2;
                  break L37;
                }
              }
              L38: {
                stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                stackOut_110_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_112_0 = stackOut_110_0;
                stackIn_112_1 = stackOut_110_1;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                if (param4 == null) {
                  stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
                  stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
                  stackOut_112_2 = "null";
                  stackIn_113_0 = stackOut_112_0;
                  stackIn_113_1 = stackOut_112_1;
                  stackIn_113_2 = stackOut_112_2;
                  break L38;
                } else {
                  stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
                  stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
                  stackOut_111_2 = "{...}";
                  stackIn_113_0 = stackOut_111_0;
                  stackIn_113_1 = stackOut_111_1;
                  stackIn_113_2 = stackOut_111_2;
                  break L38;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_113_0), stackIn_113_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_22_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_82_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_93_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_95_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_103_0;
                        } else {
                          return stackIn_106_0;
                        }
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

    final int a(byte param0) {
        int var2 = 0;
        rj[] var3 = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = Lexicominos.field_L ? 1 : 0;
            var2 = -1;
            if (this.field_c != null) {
              var3 = this.field_c;
              var4 = 0;
              L2: while (true) {
                if ((var3.length ^ -1) >= (var4 ^ -1)) {
                  break L1;
                } else {
                  var5 = var3[var4];
                  if (var7 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        var6 = var5.a((byte) 103);
                        if ((var2 ^ -1) <= (var6 ^ -1)) {
                          break L3;
                        } else {
                          var2 = var6;
                          break L3;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 == 94) {
            break L0;
          } else {
            ve.a(true);
            break L0;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (null == this.field_c) {
            break L0;
          } else {
            if ((this.field_c.length ^ -1) == -1) {
              break L0;
            } else {
              if ((param2 ^ -1) <= (this.field_c[0].field_d ^ -1)) {
                L1: {
                  if (param1 <= -97) {
                    break L1;
                  } else {
                    discarded$1 = this.a((byte) -5, -94);
                    break L1;
                  }
                }
                if ((this.field_c[this.field_c.length - 1].field_c ^ -1) <= (param2 ^ -1)) {
                  if (-2 != (this.field_c.length ^ -1)) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (this.field_c.length <= var5) {
                            break L4;
                          } else {
                            var6 = this.field_c[var5];
                            stackOut_13_0 = var6.field_d ^ -1;
                            stackIn_22_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_14_0 < (param2 ^ -1)) {
                                  break L5;
                                } else {
                                  if (param2 <= var6.field_c) {
                                    var7 = var6.a(param0, (byte) -100);
                                    if (0 != (var7 ^ -1)) {
                                      return var7 + var4;
                                    } else {
                                      return -1;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var4 = var4 + (-1 + var6.field_a.length);
                              var5++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = -1;
                        stackIn_22_0 = stackOut_21_0;
                        break L3;
                      }
                      return stackIn_22_0;
                    }
                  } else {
                    return this.field_c[0].a(param0, (byte) -100);
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
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_c == null) {
                break L1;
              } else {
                if (this.field_c.length <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = -this.field_c[0].field_d + this.field_c[-1 + this.field_c.length].field_c;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 36;
        }
    }

    final int a(int param0, int param1) {
        int discarded$2 = 0;
        int var3 = 0;
        rj var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var3 ^ -1) <= (this.field_c.length ^ -1)) {
                break L2;
              } else {
                var4 = this.field_c[var3];
                stackOut_2_0 = var4.field_a.length;
                stackOut_2_1 = param1;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 <= stackIn_3_1) {
                    param1 = param1 - (var4.field_a.length + -1);
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            }
            stackOut_6_0 = param0;
            stackOut_6_1 = 28276;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L3: {
            if (stackIn_7_0 == stackIn_7_1) {
              break L3;
            } else {
              discarded$2 = this.a(73, (byte) 15, -124);
              break L3;
            }
          }
          return this.field_c.length;
        }
    }

    final int a(byte param0, int param1) {
        rj[] var3 = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        rj[] var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        if (param0 <= -108) {
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if ((var4 ^ -1) <= (var7.length ^ -1)) {
                  break L2;
                } else {
                  var5 = var7[var4];
                  stackOut_4_0 = var5.field_a.length ^ -1;
                  stackIn_9_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (stackIn_5_0 >= (param1 ^ -1)) {
                      param1 = param1 - (var5.field_a.length + -1);
                      var4++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return var5.field_a[param1];
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
            return stackIn_9_0;
          }
        } else {
          return 107;
        }
    }

    final static String b(int param0) {
        if (!(bk.field_c != ca.field_i)) {
            return Lexicominos.field_H;
        }
        if (!qa.field_c.b(param0 ^ 25590)) {
            return qa.field_c.a(false);
        }
        if (param0 != 25594) {
            return (String) null;
        }
        if (!(ca.field_i != ee.field_c)) {
            return qa.field_c.a(false);
        }
        return dd.field_d;
    }

    static {
        field_e = new dg();
        field_b = new String[]{"The dictionaries used by Lexicominos have been compiled with reference to multiple independent sources.", "Certain words, which may offend some players, have been omitted, as have all words shorter than 3 letters or longer than 8."};
        field_a = true;
    }
}
