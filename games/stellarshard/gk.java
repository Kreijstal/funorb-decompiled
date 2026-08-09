/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static boolean field_a;
    static long field_h;
    private uh field_e;
    static String field_g;
    static String field_c;
    private pf field_b;
    private pf field_d;
    private uh field_f;

    final ud a(byte param0, int param1, int param2) {
        int var4 = -50 % ((param0 - -10) / 50);
        return this.a(param1, param2, (int[]) null, 1);
    }

    final static void a(boolean param0) {
        if (param0) {
            field_h = 59L;
        }
    }

    final static int a(int param0, boolean param1, am param2, String param3, int param4, am param5, boolean param6) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        ka stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ka stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        ka stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ka stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = stellarshard.field_B;
        try {
          L0: {
            if (!param6) {
              L1: {
                var14 = param2.a((byte) 125);
                var11_ref_String = var14;
                var11_ref_String = var14;
                var8 = param5.a((byte) -22);
                var11_ref_String = var8;
                var11_ref_String = var8;
                if (null == ob.field_b) {
                  if (nh.a(-1, false)) {
                    break L1;
                  } else {
                    stackIn_8_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (sl.field_d == oa.field_C) {
                  L3: {
                    pg.field_fb.field_k = 0;
                    nb.field_M = null;
                    if (param3 != null) {
                      L4: {
                        var9 = 0;
                        if (param1) {
                          var9 = var9 | 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        uc.field_c.field_k = 0;
                        uc.field_c.b(0, pl.field_P.nextInt());
                        uc.field_c.b(0, pl.field_P.nextInt());
                        uc.field_c.a(-104, var14);
                        uc.field_c.a(-106, var8);
                        var15 = (CharSequence) ((Object) param3);
                        uc.field_c.a(-117, gg.a(var15, param6));
                        uc.field_c.c(param0, -127);
                        uc.field_c.a(false, param4);
                        uc.field_c.a(false, var9);
                        pg.field_fb.a(false, 18);
                        pg.field_fb.field_k = pg.field_fb.field_k + 2;
                        var10 = pg.field_fb.field_k;
                        var11_ref_String = dd.a(0, hf.a((byte) -118));
                        if (var11_ref_String != null) {
                          break L5;
                        } else {
                          var11_ref_String = "";
                          break L5;
                        }
                      }
                      pg.field_fb.b(var11_ref_String, -9799);
                      ha.a(fj.field_l, pg.field_fb, uc.field_c, -105, u.field_o);
                      pg.field_fb.d(-1, -var10 + pg.field_fb.field_k);
                      break L3;
                    } else {
                      L6: {
                        uc.field_c.field_k = 0;
                        uc.field_c.b(0, pl.field_P.nextInt());
                        uc.field_c.b(0, pl.field_P.nextInt());
                        stackIn_14_0 = uc.field_c;

                        stackIn_14_1 = 96;

                        if (!param2.a(5)) {
                          stackIn_15_0 = (ka) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = "";
                          break L6;
                        } else {
                          stackIn_15_0 = (ka) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = (String) (var14);
                          break L6;
                        }
                      }
                      L7: {
                        ((ka) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                        stackIn_17_0 = uc.field_c;

                        stackIn_17_1 = 126;

                        if (!param5.a(5)) {
                          stackIn_18_0 = (ka) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = "";
                          break L7;
                        } else {
                          stackIn_18_0 = (ka) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = (String) (var8);
                          break L7;
                        }
                      }
                      ((ka) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2);
                      pg.field_fb.a(false, 16);
                      pg.field_fb.field_k = pg.field_fb.field_k + 1;
                      var9 = pg.field_fb.field_k;
                      ha.a(fj.field_l, pg.field_fb, uc.field_c, -121, u.field_o);
                      pg.field_fb.a(pg.field_fb.field_k - var9, (byte) -94);
                      break L3;
                    }
                  }
                  ue.a((byte) -108, -1);
                  sl.field_d = i.field_d;
                  break L2;
                } else {
                  break L2;
                }
              }
              L8: {
                if (sl.field_d != i.field_d) {
                  break L8;
                } else {
                  if (!qe.b(64, 1)) {
                    break L8;
                  } else {
                    L9: {
                      var9 = ae.field_N.f(4);
                      ae.field_N.field_k = 0;
                      if (var9 < 100) {
                        break L9;
                      } else {
                        if (105 >= var9) {
                          fc.field_b = new String[-100 + var9];
                          sl.field_d = stellarshard.field_E;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (-249 != (var9 ^ -1)) {
                      if (-100 == (var9 ^ -1)) {
                        qe.b(64, ug.b(1));
                        nb.field_M = new Boolean(h.a(ae.field_N, 31184));
                        ae.field_N.field_k = 0;
                        break L8;
                      } else {
                        sl.field_d = bg.field_c;
                        ja.field_t = var9;
                        ue.field_b = -1;
                        break L8;
                      }
                    } else {
                      aa.a(hf.a((byte) -64), false);
                      ga.field_a = pg.field_eb;
                      oj.c(-2290);
                      ta.field_u = false;
                      stackIn_33_0 = var9;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              L10: {
                if (sl.field_d != stellarshard.field_E) {
                  break L10;
                } else {
                  var9 = 2;
                  if (!qe.b(64, var9)) {
                    break L10;
                  } else {
                    var10 = ae.field_N.c((byte) 74);
                    ae.field_N.field_k = 0;
                    if (!qe.b(64, var10)) {
                      break L10;
                    } else {
                      var11 = fc.field_b.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var12 >= var11) {
                          oj.c(-2290);
                          ta.field_u = false;
                          stackIn_45_0 = var11 + 100;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          fc.field_b[var12] = ae.field_N.f((byte) 94);
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                if (sl.field_d == bg.field_c) {
                  if (cd.e((byte) 123)) {
                    L13: {
                      if (-256 == (ja.field_t ^ -1)) {
                        var9_ref_String = ae.field_N.a(0);
                        if (var9_ref_String == null) {
                          break L13;
                        } else {
                          dj.a(false, hf.a((byte) -101), var9_ref_String);
                          break L13;
                        }
                      } else {
                        ga.field_a = ae.field_N.e((byte) 96);
                        break L13;
                      }
                    }
                    oj.c(-2290);
                    ta.field_u = false;
                    stackIn_55_0 = ja.field_t;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null == ob.field_b) {
                  if (!ta.field_u) {
                    var9 = ue.field_d;
                    ue.field_d = wd.field_a;
                    ta.field_u = true;
                    wd.field_a = var9;
                    break L14;
                  } else {
                    L15: {
                      if ((tk.b(127) ^ -1L) < -30001L) {
                        ga.field_a = hj.field_a;
                        break L15;
                      } else {
                        ga.field_a = wb.field_h;
                        break L15;
                      }
                    }
                    ta.field_u = false;
                    stackIn_63_0 = 249;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  break L14;
                }
              }
              stackIn_66_0 = -1;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackIn_3_0 = 110;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("gk.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L16;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L17;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L18;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L18;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_70_0), stackIn_76_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_63_0;
                  } else {
                    return stackIn_66_0;
                  }
                }
              }
            }
          }
        }
    }

    private final ud a(int param0, int[] param1, int param2, int param3) {
        ud discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        kj var9 = null;
        int[] var10 = null;
        ud var11 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = ((param0 & -2147479553) << -1134406140 | param0 >>> -262161012) ^ param3;
            var5_int = var5_int | param0 << -1593721136;
            var6 = (long)var5_int;
            var8 = (ud) ((Object) this.field_f.a(var6, 74));
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (-1 > (param1[0] ^ -1)) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                var9 = kj.a(this.field_b, param0, param3);
                if (param2 == -26190) {
                  break L2;
                } else {
                  var10 = (int[]) null;
                  discarded$1 = this.a(-19, (int[]) null, -4, 9);
                  break L2;
                }
              }
              if (var9 != null) {
                L3: {
                  var11 = var9.a();
                  var8 = var11;
                  this.field_f.a(var8, var6, 1);
                  if (param1 == null) {
                    break L3;
                  } else {
                    param1[0] = param1[0] - var11.field_n.length;
                    break L3;
                  }
                }
                stackIn_15_0 = (ud) (var8);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("gk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ud) ((Object) stackIn_11_0);
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
            field_h = 62L;
        }
        field_c = null;
    }

    private final ud a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        ad var9 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param1 >>> -1030678868 | 65523 & param1 << 526509892);
            var5_int = var5_int | param1 << 665284592;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ud) ((Object) this.field_f.a(var6, -105));
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (0 < param2[0]) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                var9 = (ad) ((Object) this.field_e.a(var6, param3 ^ -125));
                if (var9 == null) {
                  var9 = ad.a(this.field_d, param1, param0);
                  if (var9 != null) {
                    this.field_e.a(var9, var6, param3 + 0);
                    break L2;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.c(20);
                this.field_f.a(var8, var6, param3);
                stackIn_17_0 = (ud) (var8);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("gk.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ud) ((Object) stackIn_11_0);
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final ud a(int param0, int param1, boolean param2) {
        ud discarded$0 = null;
        if (param2) {
            int[] var5 = (int[]) null;
            discarded$0 = this.a(-93, (int[]) null, 110, 16);
        }
        return this.a(param0, (int[]) null, -26190, param1);
    }

    gk(pf param0, pf param1) {
        this.field_e = new uh(256);
        this.field_f = new uh(256);
        try {
            this.field_b = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Create a free Account";
        field_h = 0L;
    }
}
