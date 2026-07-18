/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a(boolean param0) {
        try {
            field_b = null;
            field_e = null;
            if (!param0) {
                field_d = -91;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ve.B(" + param0 + ')');
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
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                  if (~var7 >= ~var8) {
                    break L3;
                  } else {
                    var9 = param3.charAt(var8);
                    stackOut_3_0 = var9;
                    stackOut_3_1 = 60;
                    stackIn_23_0 = stackOut_3_0;
                    stackIn_23_1 = stackOut_3_1;
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
                stackOut_22_0 = -1;
                stackOut_22_1 = ~var5_int;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L2;
              }
              if (stackIn_23_0 <= stackIn_23_1) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                stackOut_24_0 = (-param2 + param0 << -796485304) / var5_int;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("ve.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_27_0;
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
            int stackIn_6_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_71_0 = 0;
            int stackIn_114_0 = 0;
            int stackIn_132_0 = 0;
            int stackIn_134_0 = 0;
            int stackIn_148_0 = 0;
            int stackIn_151_0 = 0;
            RuntimeException stackIn_153_0 = null;
            StringBuilder stackIn_153_1 = null;
            RuntimeException stackIn_155_0 = null;
            StringBuilder stackIn_155_1 = null;
            RuntimeException stackIn_156_0 = null;
            StringBuilder stackIn_156_1 = null;
            String stackIn_156_2 = null;
            RuntimeException stackIn_157_0 = null;
            StringBuilder stackIn_157_1 = null;
            RuntimeException stackIn_159_0 = null;
            StringBuilder stackIn_159_1 = null;
            RuntimeException stackIn_160_0 = null;
            StringBuilder stackIn_160_1 = null;
            String stackIn_160_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_113_0 = 0;
            int stackOut_133_0 = 0;
            int stackOut_131_0 = 0;
            int stackOut_147_0 = 0;
            int stackOut_150_0 = 0;
            int stackOut_28_0 = 0;
            RuntimeException stackOut_152_0 = null;
            StringBuilder stackOut_152_1 = null;
            RuntimeException stackOut_155_0 = null;
            StringBuilder stackOut_155_1 = null;
            String stackOut_155_2 = null;
            RuntimeException stackOut_153_0 = null;
            StringBuilder stackOut_153_1 = null;
            String stackOut_153_2 = null;
            RuntimeException stackOut_156_0 = null;
            StringBuilder stackOut_156_1 = null;
            RuntimeException stackOut_159_0 = null;
            StringBuilder stackOut_159_1 = null;
            String stackOut_159_2 = null;
            RuntimeException stackOut_157_0 = null;
            StringBuilder stackOut_157_1 = null;
            String stackOut_157_2 = null;
            var9 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != jc.field_b) {
                    break L1;
                  } else {
                    var6_int = dg.a(param3, true) ? 1 : 0;
                    if (var6_int == 0) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
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
                        if (var6_int == 0) {
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
                            if (var6_int == 1) {
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
                                stackOut_47_0 = var6_int;
                                stackIn_48_0 = stackOut_47_0;
                                return stackIn_48_0;
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
                          int discarded$6 = ig.field_a.d(true);
                          jd.field_c = ig.field_a.b(param1 + -1698573631);
                          var6_ref = ig.field_a.e((byte) -90);
                          var7 = ig.field_a.d(true);
                          if ((1 & var7) != 0) {
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
                              if ((var7 & 4) == 0) {
                                stackOut_66_0 = 0;
                                stackIn_67_0 = stackOut_66_0;
                                break L13;
                              } else {
                                stackOut_64_0 = 1;
                                stackIn_67_0 = stackOut_64_0;
                                break L13;
                              }
                            }
                            L14: {
                              jl.field_c = stackIn_67_0 != 0;
                              if ((8 & var7) == 0) {
                                stackOut_70_0 = 0;
                                stackIn_71_0 = stackOut_70_0;
                                break L14;
                              } else {
                                stackOut_68_0 = 1;
                                stackIn_71_0 = stackOut_68_0;
                                break L14;
                              }
                            }
                            ul.field_k = stackIn_71_0 != 0;
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
                              int discarded$7 = ig.field_a.d(true);
                              int discarded$8 = ig.field_a.d(true);
                              int discarded$9 = ig.field_a.d((byte) 19);
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
                          cb.field_t = ck.a((CharSequence) (Object) og.field_c, (byte) -48);
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
                          if (null != var6_ref) {
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
                                    Object discarded$10 = oa.a(true, kk.c(-14047), "unzap");
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
                              Object discarded$11 = oa.a(kk.c(-14047), 22347, "zap", new Object[1]);
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
                              if (var8 >= 4) {
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
                          stackOut_113_0 = pg.field_d;
                          stackIn_114_0 = stackOut_113_0;
                          return stackIn_114_0;
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
                              stackOut_133_0 = -1;
                              stackIn_134_0 = stackOut_133_0;
                              return stackIn_134_0;
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
                        stackOut_131_0 = pg.field_d;
                        stackIn_132_0 = stackOut_131_0;
                        return stackIn_132_0;
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
                            if (vl.b(-92) <= 30000L) {
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
                        stackOut_147_0 = 3;
                        stackIn_148_0 = stackOut_147_0;
                        return stackIn_148_0;
                      }
                    }
                  }
                  stackOut_150_0 = -1;
                  stackIn_151_0 = stackOut_150_0;
                  break L0;
                } else {
                  stackOut_28_0 = 43;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L37: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_152_0 = (RuntimeException) var6;
                stackOut_152_1 = new StringBuilder().append("ve.G(");
                stackIn_155_0 = stackOut_152_0;
                stackIn_155_1 = stackOut_152_1;
                stackIn_153_0 = stackOut_152_0;
                stackIn_153_1 = stackOut_152_1;
                if (param0 == null) {
                  stackOut_155_0 = (RuntimeException) (Object) stackIn_155_0;
                  stackOut_155_1 = (StringBuilder) (Object) stackIn_155_1;
                  stackOut_155_2 = "null";
                  stackIn_156_0 = stackOut_155_0;
                  stackIn_156_1 = stackOut_155_1;
                  stackIn_156_2 = stackOut_155_2;
                  break L37;
                } else {
                  stackOut_153_0 = (RuntimeException) (Object) stackIn_153_0;
                  stackOut_153_1 = (StringBuilder) (Object) stackIn_153_1;
                  stackOut_153_2 = "{...}";
                  stackIn_156_0 = stackOut_153_0;
                  stackIn_156_1 = stackOut_153_1;
                  stackIn_156_2 = stackOut_153_2;
                  break L37;
                }
              }
              L38: {
                stackOut_156_0 = (RuntimeException) (Object) stackIn_156_0;
                stackOut_156_1 = ((StringBuilder) (Object) stackIn_156_1).append(stackIn_156_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_159_0 = stackOut_156_0;
                stackIn_159_1 = stackOut_156_1;
                stackIn_157_0 = stackOut_156_0;
                stackIn_157_1 = stackOut_156_1;
                if (param4 == null) {
                  stackOut_159_0 = (RuntimeException) (Object) stackIn_159_0;
                  stackOut_159_1 = (StringBuilder) (Object) stackIn_159_1;
                  stackOut_159_2 = "null";
                  stackIn_160_0 = stackOut_159_0;
                  stackIn_160_1 = stackOut_159_1;
                  stackIn_160_2 = stackOut_159_2;
                  break L38;
                } else {
                  stackOut_157_0 = (RuntimeException) (Object) stackIn_157_0;
                  stackOut_157_1 = (StringBuilder) (Object) stackIn_157_1;
                  stackOut_157_2 = "{...}";
                  stackIn_160_0 = stackOut_157_0;
                  stackIn_160_1 = stackOut_157_1;
                  stackIn_160_2 = stackOut_157_2;
                  break L38;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_160_0, stackIn_160_2 + ',' + param5 + ')');
            }
            return stackIn_151_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        rj[] var3 = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -1;
                if (((ve) this).field_c != null) {
                  var3 = ((ve) this).field_c;
                  var4 = 0;
                  L3: while (true) {
                    if (~var3.length >= ~var4) {
                      break L2;
                    } else {
                      var5 = var3[var4];
                      if (var7 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (null == var5) {
                            break L4;
                          } else {
                            var6 = var5.a((byte) 103);
                            if (~var2_int <= ~var6) {
                              break L4;
                            } else {
                              var2_int = var6;
                              break L4;
                            }
                          }
                        }
                        var4++;
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param0 == 94) {
                break L1;
              } else {
                ve.a(true);
                break L1;
              }
            }
            stackOut_16_0 = var2_int;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "ve.A(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((ve) this).field_c) {
                break L1;
              } else {
                if (((ve) this).field_c.length == 0) {
                  break L1;
                } else {
                  if (~param2 <= ~((ve) this).field_c[0].field_d) {
                    L2: {
                      if (param1 <= -97) {
                        break L2;
                      } else {
                        int discarded$1 = ((ve) this).a((byte) -5, -94);
                        break L2;
                      }
                    }
                    if (~((ve) this).field_c[((ve) this).field_c.length - 1].field_c <= ~param2) {
                      if (((ve) this).field_c.length != 1) {
                        var4_int = 0;
                        var5 = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              if (((ve) this).field_c.length <= var5) {
                                break L5;
                              } else {
                                var6 = ((ve) this).field_c[var5];
                                stackOut_21_0 = ~var6.field_d;
                                stackIn_37_0 = stackOut_21_0;
                                stackIn_22_0 = stackOut_21_0;
                                if (var8 != 0) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (stackIn_22_0 < ~param2) {
                                      break L6;
                                    } else {
                                      if (param2 <= var6.field_c) {
                                        var7 = var6.a(param0, (byte) -100);
                                        if (var7 != -1) {
                                          stackOut_33_0 = var7 + var4_int;
                                          stackIn_34_0 = stackOut_33_0;
                                          return stackIn_34_0;
                                        } else {
                                          stackOut_31_0 = -1;
                                          stackIn_32_0 = stackOut_31_0;
                                          return stackIn_32_0;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var4_int = var4_int + (-1 + var6.field_a.length);
                                  var5++;
                                  if (var8 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            stackOut_36_0 = -1;
                            stackIn_37_0 = stackOut_36_0;
                            break L4;
                          }
                          break L0;
                        }
                      } else {
                        stackOut_17_0 = ((ve) this).field_c[0].a(param0, (byte) -100);
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = -1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_8_0 = -1;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4, "ve.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_37_0;
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (((ve) this).field_c == null) {
                    break L2;
                  } else {
                    if (((ve) this).field_c.length <= 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = -((ve) this).field_c[0].field_d + ((ve) this).field_c[-1 + ((ve) this).field_c.length].field_c;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 36;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "ve.I(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rj var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~((ve) this).field_c.length) {
                    break L3;
                  } else {
                    var4 = ((ve) this).field_c[var3_int];
                    stackOut_3_0 = var4.field_a.length;
                    stackOut_3_1 = param1;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 <= stackIn_4_1) {
                        param1 = param1 - (var4.field_a.length + -1);
                        var3_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_7_0 = var3_int;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      }
                    }
                  }
                }
                stackOut_10_0 = param0;
                stackOut_10_1 = 28276;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              L4: {
                if (stackIn_11_0 == stackIn_11_1) {
                  break L4;
                } else {
                  int discarded$2 = ((ve) this).a(73, (byte) 15, -124);
                  break L4;
                }
              }
              stackOut_14_0 = ((ve) this).field_c.length;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "ve.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final int a(byte param0, int param1) {
        rj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3 = ((ve) this).field_c;
            if (param0 <= -108) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~var3.length) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      stackOut_6_0 = ~var5.field_a.length;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 >= ~param1) {
                          param1 = param1 - (var5.field_a.length + -1);
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = var5.field_a[param1];
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 107;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3_ref, "ve.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final static String b(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_14_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_9_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            if (bk.field_c == ca.field_i) {
              stackOut_3_0 = Lexicominos.field_H;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (qa.field_c.b(param0 ^ 25590)) {
                if (param0 == 25594) {
                  if (ca.field_i == ee.field_c) {
                    stackOut_14_0 = qa.field_c.a(false);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    stackOut_16_0 = dd.field_d;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (String) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = qa.field_c.a(false);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "ve.H(" + param0 + ')');
        }
        return stackIn_17_0;
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
