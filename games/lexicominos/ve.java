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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 ? 1 : 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (-1 <= (var5_int ^ -1)) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_15_0 = (-param2 + param0 << -796485304) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (var9 != 60) {
                    if (62 != var9) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ve.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_20_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_96_0 = 0;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            String stackIn_100_2 = null;
            StringBuilder stackIn_102_1 = null;
            StringBuilder stackIn_103_1 = null;
            String stackIn_103_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            CharSequence var11 = null;
            var9 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != jc.field_b) {
                    break L1;
                  } else {
                    if (!dg.a(param3, true)) {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (uf.field_m == ae.field_E) {
                    L3: {
                      if (param3) {
                        fa.field_b = ef.a(rc.field_f, param1 ^ 27988, (String) null, false, param0);
                        break L3;
                      } else {
                        fa.field_b = fj.a(param0, param4, false, param1 ^ 118);
                        break L3;
                      }
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
                L4: {
                  if (uf.field_m == rb.field_d) {
                    if (!a.b(1, 10343)) {
                      break L4;
                    } else {
                      var6_int = ig.field_a.d(true);
                      ig.field_a.field_h = 0;
                      if (-1 == (var6_int ^ -1)) {
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
                if (param1 == -25) {
                  L5: {
                    if (kf.field_z != uf.field_m) {
                      break L5;
                    } else {
                      if (!a.b(8, 10343)) {
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
                      if (!a.b(1, 10343)) {
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
                            if (-2 == (var6_int ^ -1)) {
                              break L7;
                            } else {
                              if (8 != var6_int) {
                                a.field_c = -1;
                                uf.field_m = uh.field_l;
                                break L6;
                              } else {
                                ck.b((byte) -30);
                                fb.field_p = false;
                                stackIn_30_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
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
                      if (!dc.d(param1 ^ -27)) {
                        break L8;
                      } else {
                        L9: {
                          rc.field_f = ig.field_a.f((byte) -110);
                          vb.field_i = ig.field_a.d(true);
                          ig.field_a.d(true);
                          jd.field_c = ig.field_a.b(param1 + -1698573631);
                          var6 = ig.field_a.e((byte) -90);
                          var7 = ig.field_a.d(true);
                          if ((1 & var7) != 0) {
                            fg.a((byte) 120);
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
                              if (-1 == (var7 & 4 ^ -1)) {
                                stackIn_43_0 = 0;
                                break L11;
                              } else {
                                stackIn_43_0 = 1;
                                break L11;
                              }
                            }
                            L12: {
                              jl.field_c = stackIn_43_0 != 0;
                              if ((8 & var7) == 0) {
                                stackIn_46_0 = 0;
                                break L12;
                              } else {
                                stackIn_46_0 = 1;
                                break L12;
                              }
                            }
                            ul.field_k = stackIn_46_0 != 0;
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
                            ig.field_a.d(true);
                            ig.field_a.d(true);
                            ig.field_a.d((byte) 19);
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
                          var11 = (CharSequence) ((Object) og.field_c);
                          cb.field_t = ck.a(var11, (byte) -48);
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
                          if (var6 != null) {
                            ee.a(var6, -11971, kk.c(-14047));
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
                                    oa.a(true, kk.c(-14047), "unzap");
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
                              oa.a(kk.c(-14047), 22347, "zap", new Object[]{jd.a(rc.field_f, param1 + 62)});
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
                        ed.field_q.a(l.field_F, param1 ^ -48);
                        var8 = 0;
                        L24: while (true) {
                          if (-5 >= (var8 ^ -1)) {
                            ig.field_a.a(l.field_F, 16);
                            stackIn_73_0 = pg.field_d;
                            decompiledRegionSelector0 = 3;
                            break L0;
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
                      if (dc.d(param1 + 27)) {
                        L26: {
                          ck.b((byte) -96);
                          if (7 != pg.field_d) {
                            break L26;
                          } else {
                            if (!fb.field_p) {
                              fb.field_p = true;
                              stackIn_86_0 = -1;
                              decompiledRegionSelector0 = 5;
                              break L0;
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
                        stackIn_84_0 = pg.field_d;
                        decompiledRegionSelector0 = 4;
                        break L0;
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
                          if (-30001L <= (vl.b(-92) ^ -1L)) {
                            wj.field_p = sa.field_h;
                            break L29;
                          } else {
                            wj.field_p = nk.field_t;
                            break L29;
                          }
                        }
                        fb.field_p = false;
                        stackIn_93_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                  stackIn_96_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_20_0 = 43;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_99_0 = (RuntimeException) (var6_ref);

                stackIn_99_1 = new StringBuilder().append("ve.G(");

                if (param0 == null) {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackIn_100_2 = "null";
                  break L30;
                } else {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackIn_100_2 = "{...}";
                  break L30;
                }
              }
              L31: {


                stackIn_102_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "null";
                  break L31;
                } else {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "{...}";
                  break L31;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_100_0), stackIn_103_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_30_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_73_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_84_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_86_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_93_0;
                        } else {
                          return stackIn_96_0;
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
        int var2;
        rj[] var3;
        int var4;
        rj var5;
        int var7;
        int var6;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = -1;
          if (this.field_c != null) {
            var3 = this.field_c;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
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
            ve.a(true);
            break L2;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = Lexicominos.field_L ? 1 : 0;
        if (null == this.field_c || this.field_c.length == 0 || param2 < this.field_c[0].field_d) {
            return -1;
        }
        if (param1 > -97) {
            this.a((byte) -5, -94);
        }
        if (this.field_c[this.field_c.length - 1].field_c < param2) {
            return -1;
        }
        if (-2 == (this.field_c.length ^ -1)) {
            return this.field_c[0].a(param0, (byte) -100);
        }
        int var4 = 0;
        for (var5 = 0; this.field_c.length > var5; var5++) {
            var6 = this.field_c[var5];
            if (var6.field_d <= param2) {
                if (!(param2 > var6.field_c)) {
                    var7 = var6.a(param0, (byte) -100);
                    if (0 == (var7 ^ -1)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_c == null) {
                break L1;
              } else {
                if (this.field_c.length <= 0) {
                  break L1;
                } else {
                  stackIn_6_0 = -this.field_c[0].field_d + this.field_c[-1 + this.field_c.length].field_c;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 36;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        rj var4 = null;
        int var5 = Lexicominos.field_L ? 1 : 0;
        for (var3 = 0; var3 < this.field_c.length; var3++) {
            var4 = this.field_c[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (var4.field_a.length + -1);
        }
        if (param0 != 28276) {
            this.a(73, (byte) 15, -124);
        }
        return this.field_c.length;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        rj var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        rj[] var7 = this.field_c;
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
