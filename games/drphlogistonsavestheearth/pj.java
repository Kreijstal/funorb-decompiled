/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends vg implements ba {
    static String[] field_A;
    static boolean field_H;
    vd field_I;
    static he[] field_z;
    static aj field_G;
    static int field_E;
    static boolean field_C;
    static he[][] field_B;
    static qb field_D;
    static boolean field_F;

    public static void f(int param0) {
        field_A = null;
        field_B = (he[][]) null;
        field_G = null;
        field_D = null;
        int var1 = -31 % ((48 - param0) / 51);
        field_z = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -10612) {
                break L1;
              } else {
                var6 = (vg) null;
                this.a(0, 46, (byte) 23, 114, (vg) null, 80, 117);
                break L1;
              }
            }
            L2: {
              if (!this.a(param1, param2, param0, 43)) {
                break L2;
              } else {
                this.a(param2, (byte) 89, param0, param1);
                this.a(param1, false, param2, param0);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pj.WA(").append(param0).append(',');

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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    vg g(int param0) {
        rh var2;
        vg var3;
        int var4;
        vg var5;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = new rh(this.field_I);
          var3 = (vg) ((Object) var2.c(-1));
          if (param0 == -22426) {
            break L0;
          } else {
            var5 = (vg) null;
            this.a((vg) null, 42, -25, (byte) 121);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.a(true)) {
              var3 = (vg) ((Object) var2.a((byte) -85));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, (byte) -128);
            if (param3 < -127) {
              var5 = new rh(this.field_I);
              var6 = (vg) ((Object) var5.c(-1));
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.c(-1387)) {
                      break L2;
                    } else {
                      var6.a(param0, this.field_o + param1, param2 - -this.field_m, (byte) -128);
                      var6 = (vg) ((Object) var5.a((byte) -119));
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
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("pj.I(");

            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pj(int param0, int param1, int param2, int param3, cg param4) {
        super(param0, param1, param2, param3, param4, (fd) null);
        this.field_I = new vd();
    }

    final static double a(double param0, int param1) {
        if (param1 != 32768) {
            return 0.02654725030847743;
        }
        return oj.field_b[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 != -21) {
            this.e(6);
        }
        if (param1 == 0 && this.field_l != null) {
            this.field_l.a(true, 116, (vg) (this), param3, param0);
        }
        rh var5 = new rh(this.field_I);
        vg var6 = (vg) ((Object) var5.a(-80));
        while (var6 != null) {
            var6.a(this.field_o + param0, param1, (byte) -21, param3 - -this.field_m);
            var6 = (vg) ((Object) var5.b((byte) 87));
        }
    }

    final String e(int param0) {
        rh var2;
        vg var3;
        String var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < -39) {
          var2 = new rh(this.field_I);
          var3 = (vg) ((Object) var2.c(-1));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.e(-80);
              if (var4 == null) {
                var3 = (vg) ((Object) var2.a((byte) -121));
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        rh var7 = null;
        vg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var7 = new rh(this.field_I);
            if (!param5) {
              var8 = (vg) ((Object) var7.c(-1));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.c(-1387)) {
                      break L2;
                    } else {
                      var8.a(param0 - -this.field_o, this.field_m + param1, param2, param3, param4, param5);
                      var8 = (vg) ((Object) var7.a((byte) -98));
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
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("pj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        rh var8 = null;
        RuntimeException var8_ref = null;
        vg var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 113) {
                break L1;
              } else {
                field_D = (qb) null;
                break L1;
              }
            }
            var8 = new rh(this.field_I);
            var9 = (vg) ((Object) var8.c(-1));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(-1387)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1, param2, (byte) 117, param4, this.field_o + param5, this.field_m + param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (vg) ((Object) var8.a((byte) -100));
                      continue L2;
                    }
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("pj.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static int a(String param0, int param1, a param2, a param3, int param4, int param5, boolean param6) {
        int stackIn_6_0 = 0;
        od stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        od stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        od stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        od stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param3.c(-97);
              if (param4 == 0) {
                break L1;
              } else {
                pj.a(-0.7811526601818387, -66);
                break L1;
              }
            }
            L2: {
              var8 = param2.c(120);
              var11_ref_String = var8;
              if (uj.field_j != null) {
                break L2;
              } else {
                if (ek.a(true, false)) {
                  break L2;
                } else {
                  stackIn_6_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (hh.field_b == tl.field_O) {
                L4: {
                  oe.field_a = null;
                  nj.field_p.field_j = 0;
                  if (param0 != null) {
                    L5: {
                      var9 = 0;
                      am.field_n.field_j = 0;
                      if (!param6) {
                        break L5;
                      } else {
                        var9 = var9 | 1;
                        break L5;
                      }
                    }
                    L6: {
                      am.field_n.a(cm.field_M.nextInt(), (byte) -30);
                      am.field_n.a(cm.field_M.nextInt(), (byte) 119);
                      am.field_n.a(-23805, var14);
                      am.field_n.a(param4 ^ -23805, var8);
                      var15 = (CharSequence) ((Object) param0);
                      am.field_n.a(param4 ^ -23805, fg.a(var15, 90));
                      am.field_n.c(param5, param4 + -17402);
                      am.field_n.c(param1, (byte) -88);
                      am.field_n.c(var9, (byte) -98);
                      nj.field_p.c(18, (byte) -101);
                      nj.field_p.field_j = nj.field_p.field_j + 2;
                      var10 = nj.field_p.field_j;
                      var11_ref_String = ob.a((byte) 97, nb.a(param4 + 67));
                      if (var11_ref_String != null) {
                        break L6;
                      } else {
                        var11_ref_String = "";
                        break L6;
                      }
                    }
                    nj.field_p.a(var11_ref_String, -1);
                    i.a(nj.field_p, am.field_n, a.field_b, d.field_a, 0);
                    nj.field_p.a(-2, -var10 + nj.field_p.field_j);
                    break L4;
                  } else {
                    L7: {
                      am.field_n.field_j = 0;
                      am.field_n.a(cm.field_M.nextInt(), (byte) -77);
                      am.field_n.a(cm.field_M.nextInt(), (byte) 126);
                      stackIn_12_0 = am.field_n;

                      stackIn_12_1 = -23805;

                      if (!param3.a((byte) -128)) {
                        stackIn_13_0 = (od) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = "";
                        break L7;
                      } else {
                        stackIn_13_0 = (od) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = (String) (var14);
                        break L7;
                      }
                    }
                    L8: {
                      ((od) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2);
                      stackIn_15_0 = am.field_n;

                      stackIn_15_1 = param4 + -23805;

                      if (!param2.a((byte) -108)) {
                        stackIn_16_0 = (od) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = "";
                        break L8;
                      } else {
                        stackIn_16_0 = (od) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = (String) (var8);
                        break L8;
                      }
                    }
                    ((od) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2);
                    nj.field_p.c(16, (byte) -102);
                    nj.field_p.field_j = nj.field_p.field_j + 1;
                    var9 = nj.field_p.field_j;
                    i.a(nj.field_p, am.field_n, a.field_b, d.field_a, 0);
                    nj.field_p.b(nj.field_p.field_j - var9, (byte) 87);
                    break L4;
                  }
                }
                qj.a(-1, param4 + 14656);
                tl.field_O = eg.field_h;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (tl.field_O != eg.field_h) {
                break L9;
              } else {
                if (jd.a(1, param4 ^ 5929)) {
                  L10: {
                    var9 = dh.field_N.l(31760);
                    dh.field_N.field_j = 0;
                    if (100 > var9) {
                      break L10;
                    } else {
                      if (var9 > 105) {
                        break L10;
                      } else {
                        td.field_m = new String[-100 + var9];
                        tl.field_O = kc.field_n;
                        break L9;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (var9 == 99) {
                      jd.a(ab.a(39), 5929);
                      oe.field_a = new Boolean(eb.a(dh.field_N, param4 + 126));
                      dh.field_N.field_j = 0;
                      break L9;
                    } else {
                      tl.field_O = dl.field_L;
                      t.field_b = var9;
                      gf.field_C = -1;
                      break L9;
                    }
                  } else {
                    dd.a((byte) 64, nb.a(param4 + -77));
                    cc.field_p = dd.field_n;
                    eg.a((byte) 126);
                    dk.field_b = false;
                    stackIn_31_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (tl.field_O != kc.field_n) {
                break L11;
              } else {
                var9 = 2;
                if (!jd.a(var9, 5929)) {
                  break L11;
                } else {
                  var10 = dh.field_N.j(-788751192);
                  dh.field_N.field_j = 0;
                  if (!jd.a(var10, 5929)) {
                    break L11;
                  } else {
                    var11 = td.field_m.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        eg.a((byte) 126);
                        dk.field_b = false;
                        stackIn_42_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        td.field_m[var12] = dh.field_N.e(-75);
                        var12++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (dl.field_L == tl.field_O) {
                if (li.d(-29427)) {
                  L14: {
                    if (-256 != (t.field_b ^ -1)) {
                      cc.field_p = dh.field_N.b((byte) -63);
                      break L14;
                    } else {
                      var9_ref_String = dh.field_N.i(715718304);
                      if (var9_ref_String != null) {
                        aj.a(nb.a(-113), param4 + 77, var9_ref_String);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  eg.a((byte) 126);
                  dk.field_b = false;
                  stackIn_53_0 = t.field_b;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (uj.field_j == null) {
                if (dk.field_b) {
                  L16: {
                    if (30000L >= of.a((byte) 122)) {
                      cc.field_p = lf.field_f;
                      break L16;
                    } else {
                      cc.field_p = dg.field_a;
                      break L16;
                    }
                  }
                  dk.field_b = false;
                  stackIn_62_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = ei.field_o;
                  ei.field_o = ia.field_c;
                  dk.field_b = true;
                  ia.field_c = var9;
                  break L15;
                }
              } else {
                break L15;
              }
            }
            stackIn_64_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("pj.LA(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L17;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L18;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param3 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L19;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L19;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_68_0), stackIn_74_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_42_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_53_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0;
                } else {
                  return stackIn_64_0;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        rh var8 = null;
        RuntimeException var8_ref = null;
        vg var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 43) {
                break L1;
              } else {
                this.a(-95, -52, 83, 47, -104);
                break L1;
              }
            }
            var8 = new rh(this.field_I);
            var9 = (vg) ((Object) var8.c(-1));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(-1387)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.a(true)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, (byte) 95, param3, param4, param5, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (vg) ((Object) var8.a((byte) -77));
                    continue L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("pj.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 3) {
            field_B = (he[][]) null;
        }
        int var2 = 0;
        rh var3 = new rh(this.field_I);
        vg var4 = (vg) ((Object) var3.c(param0 + -4));
        while (var4 != null) {
            var5 = var4.d(param0 ^ 0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (vg) ((Object) var3.a((byte) -91));
        }
        return var2;
    }

    final void b(vg param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_I.a(param0, 255);
              if (param1 >= 30) {
                break L1;
              } else {
                field_E = -118;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pj.SA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        rh var8 = null;
        vg var9 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new rh(this.field_I);
              var9 = (vg) ((Object) var8.c(-1));
              if (param3 > 63) {
                break L1;
              } else {
                field_z = (he[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(-1387)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.a(true)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, param2, 72)) {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (vg) ((Object) var8.a((byte) -113));
                    continue L2;
                  }
                }
              }
              var6 = param0;
              if (var6 != 80) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (!ck.field_f[81]) {
                    stackIn_15_0 = this.a(param2, (byte) 79);
                    break L5;
                  } else {
                    stackIn_15_0 = this.a(param2, 65535);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pj.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    private final void h(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 1) {
            return;
        }
        rh var2 = new rh(this.field_I);
        vg var3 = (vg) ((Object) var2.c(-1));
        while (var3 != null) {
            var3.e((byte) 106);
            var3 = (vg) ((Object) var2.a((byte) -104));
        }
    }

    final boolean a(vg param0, byte param1) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        vg var4 = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (this.field_I.a(30430)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 > 29) {
                var3 = new rh(this.field_I);
                var4 = (vg) ((Object) var3.c(-1));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.a(true)) {
                        break L2;
                      } else {
                        var5 = new rh(this.field_I);
                        var5.a((gi) (var4), (byte) -98);
                        var6 = (vg) ((Object) var5.a((byte) -107));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(false, param0)) {
                              var6 = (vg) ((Object) var5.a((byte) -119));
                              continue L3;
                            } else {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    var4 = (vg) ((Object) var3.a((byte) -105));
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("pj.VA(");

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
          throw ie.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final void c(byte param0) {
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(this.field_I);
        int var3 = -40 % ((param0 - -10) / 51);
        vg var4 = (vg) ((Object) var2.c(-1));
        while (var4 != null) {
            var4.c((byte) 49);
            var4 = (vg) ((Object) var2.a((byte) -87));
        }
    }

    final boolean a(boolean param0, vg param1) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        vg var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_z = (he[]) null;
                break L1;
              }
            }
            var3 = new rh(this.field_I);
            var4 = (vg) ((Object) var3.c(-1));
            L2: while (true) {
              if (var4 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(false, param1)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (vg) ((Object) var3.a((byte) -74));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("pj.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            vg var3 = (vg) null;
            this.a(-123, 'ﾼ', (vg) null, 80);
        }
        return this.g(-22426) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param3 + -16534);
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new rh(this.field_I);
              var6 = (vg) ((Object) var5.c(-1));
              if (!param1) {
                break L1;
              } else {
                field_D = (qb) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param3) {
                    var6.a(param3 + 1, param0, param2, -10612);
                    var6 = (vg) ((Object) var5.a((byte) -72));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("pj.NA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        rh var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!this.field_I.a(param1 + -35105)) {
              var8 = new rh(this.field_I);
              var4 = (vg) ((Object) var8.a(-105));
              L1: while (true) {
                if (var4 == null) {
                  L2: {
                    if (param1 == 65535) {
                      break L2;
                    } else {
                      this.a(6, -36, -109, -26, 125);
                      break L2;
                    }
                  }
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.a(true)) {
                      break L3;
                    } else {
                      var5 = new rh(this.field_I);
                      var5.a(var4, -2);
                      var6 = (vg) ((Object) var5.b((byte) 87));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(false, param0)) {
                            stackIn_12_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (vg) ((Object) var5.b((byte) 87));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (vg) ((Object) var8.b((byte) 87));
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("pj.BB(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    static {
        field_A = new String[16];
        field_H = true;
        field_B = new he[3][];
        field_G = new aj();
        field_D = new qb();
    }
}
