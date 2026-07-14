/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

abstract class jk extends we implements ga {
    static int field_B;
    static int field_A;
    static gk field_z;
    static li[] field_C;
    static a field_x;
    static String[] field_y;
    static int field_u;
    we field_v;
    static int field_w;

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a(param0);
        if (((jk) this).field_v != null) {
            var3 = ((jk) this).field_v.a((byte) 54);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            ((jk) this).e(109);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jk) this).field_v == null) {
              break L2;
            } else {
              if (!((jk) this).field_v.a(param0, param1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    we a(int param0) {
        we var2 = ((jk) this).field_v;
        if (var2 != null) {
            if (var2.b((byte) 72)) {
                return var2;
            }
        }
        if (param0 == -1) {
            return null;
        }
        field_x = null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            field_C = null;
        }
        return null != ((jk) this).a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
            field_u = 112;
        }
        if (((jk) this).field_v != null) {
            ((jk) this).field_v.g(-1);
        }
    }

    private final boolean a(byte param0, we param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -18) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jk) this).field_v == null) {
              break L2;
            } else {
              if (((jk) this).field_v.b((byte) 74)) {
                break L2;
              } else {
                if (!((jk) this).field_v.a(param1, false)) {
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
        return stackIn_7_0 != 0;
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        if (((jk) this).a(param2, (byte) -122, param3, param1)) {
            ((jk) this).a(param2, param3, param1, -37);
            ((jk) this).b(param2, -25844, param1, param3);
        }
        if (param0) {
            jk.a(44, true, 113);
        }
        return param1;
    }

    private final boolean a(int param0, we param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -11) {
            break L0;
          } else {
            var4 = null;
            ((jk) this).a(-19, -80, (we) null, 5, 102, 80);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jk) this).field_v) {
              break L2;
            } else {
              if (((jk) this).field_v.b((byte) 79)) {
                break L2;
              } else {
                if (!((jk) this).field_v.a(param1, false)) {
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
        return stackIn_7_0 != 0;
    }

    jk(int param0, int param1, int param2, int param3, ml param4, of param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param3 == -1625) {
            break L0;
          } else {
            field_B = -20;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jk) this).field_v) {
              break L2;
            } else {
              if (!((jk) this).field_v.a(((jk) this).field_e + param0, param1, param2, -1625, param4, param5, param6 - -((jk) this).field_r)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1)) {
            if (null != ((jk) this).field_h) {
                ((jk) this).field_h.a(true, (we) this, param2, param3, 20);
            }
        }
        if (param0 != 30) {
            return;
        }
        if (((jk) this).field_v != null) {
            ((jk) this).field_v.a(30, param1, ((jk) this).field_e + param2, ((jk) this).field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        StringBuilder discarded$5 = param2.append(10);
        if (param1 != -25844) {
            field_A = 50;
        }
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$6 = param2.append(32);
        }
        if (null != ((jk) this).field_v) {
            StringBuilder discarded$8 = ((jk) this).field_v.a(false, param2, param0, param3 + 1);
        } else {
            StringBuilder discarded$9 = param2.append("null");
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 != 77) {
            return;
        }
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -14);
        if (param3 > -13) {
            we discarded$0 = ((jk) this).a(24);
        }
        if (!(((jk) this).field_v == null)) {
            ((jk) this).field_v.a(param0, param1 - -((jk) this).field_e, ((jk) this).field_r + param2, (byte) -86);
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -59;
        }
        return ((jk) this).field_v == null ? 0 : ((jk) this).field_v.f(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((jk) this).i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
            ((jk) this).a(49, -102, 107, 123);
        }
        if (null != ((jk) this).field_v) {
            ((jk) this).field_v.e(param0 ^ 0);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        if (((jk) this).field_v != null) {
            if (((jk) this).field_v.b((byte) 126)) {
                if (!(!((jk) this).field_v.a(param0, param1, param2, 124))) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (!(80 != var5)) {
            return !dl.field_c[81] ? this.a(-12, param0) : this.a((byte) -94, param0);
        }
        var5 = 9 % ((37 - param3) / 50);
        return false;
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        if (null != ((jk) this).field_v) {
            ((jk) this).field_v.a(param0 + ((jk) this).field_e, param1, param2, param3, 0, ((jk) this).field_r + param5);
        }
        if (param4 != 0) {
            Object var8 = null;
            boolean discarded$0 = this.a((byte) -34, (we) null);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        String stackIn_83_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        String stackOut_82_2 = null;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        String stackOut_76_2 = null;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String stackOut_75_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_89_0 = 0;
        String stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          wd.field_g = true;
          ud.field_b = param2;
          if (0 != ud.field_b) {
            if (-2 != (ud.field_b ^ -1)) {
              if ((ud.field_b ^ -1) == -3) {
                var3 = aa.a(fe.field_a, rk.field_h, gg.a(new String[1], pd.field_h, true), true, vi.field_b);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3) {
                      break L2;
                    } else {
                      if ("<%0>".equals((Object) (Object) vi.field_b[var5])) {
                        var4 = var5;
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  if ((var4 ^ -1) == 0) {
                    throw new IllegalStateException();
                  } else {
                    wi.field_b = new String[var4];
                    gl.a((Object[]) (Object) vi.field_b, 0, (Object[]) (Object) wi.field_b, 0, var4);
                    ud.field_e = new String[-1 + var3 + -var4];
                    gl.a((Object[]) (Object) vi.field_b, 1 + var4, (Object[]) (Object) ud.field_e, 0, var3 + -var4 - 1);
                    var3 = aa.a(fe.field_a, rk.field_h, gg.a(new String[1], wa.field_d, true), true, vi.field_b);
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var3 <= var5) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) vi.field_b[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          uj.field_c = new String[var4];
                          gl.a((Object[]) (Object) vi.field_b, 0, (Object[]) (Object) uj.field_c, 0, var4);
                          re.field_a = new String[var3 - (var4 - -1)];
                          gl.a((Object[]) (Object) vi.field_b, 1 + var4, (Object[]) (Object) re.field_a, 0, -1 + var3 + -var4);
                          if (uj.field_c.length > wi.field_b.length) {
                            stackOut_65_0 = uj.field_c.length;
                            stackIn_66_0 = stackOut_65_0;
                            break L5;
                          } else {
                            stackOut_64_0 = wi.field_b.length;
                            stackIn_66_0 = stackOut_64_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_66_0;
                          if (ud.field_e.length >= re.field_a.length) {
                            stackOut_68_0 = ud.field_e.length;
                            stackIn_69_0 = stackOut_68_0;
                            break L6;
                          } else {
                            stackOut_67_0 = re.field_a.length;
                            stackIn_69_0 = stackOut_67_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_69_0;
                        var7 = var6 + (var5 + 7);
                        gh.field_a = new int[var7];
                        pl.field_k = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            bi.field_B = new int[2];
                            pl.field_k[0] = qb.field_d;
                            gh.field_a[1] = 0;
                            pl.field_k[1] = jf.field_p;
                            gh.field_a[3] = 1;
                            pl.field_k[4] = sk.field_F;
                            bi.field_B[1] = 2;
                            pl.field_k[2] = ua.field_y;
                            bi.field_B[0] = 5;
                            pl.field_k[3] = uf.field_c;
                            pl.field_k[5] = "";
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                pl.field_k[6 - -var5] = null;
                                gh.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var6 <= var8) {
                                    fb.field_n = pf.a(0);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_80_0 = pl.field_k;
                                      stackOut_80_1 = var8 + 7 + var5;
                                      stackIn_82_0 = stackOut_80_0;
                                      stackIn_82_1 = stackOut_80_1;
                                      stackIn_81_0 = stackOut_80_0;
                                      stackIn_81_1 = stackOut_80_1;
                                      if (re.field_a.length <= var8) {
                                        stackOut_82_0 = (String[]) (Object) stackIn_82_0;
                                        stackOut_82_1 = stackIn_82_1;
                                        stackOut_82_2 = "";
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        stackIn_83_2 = stackOut_82_2;
                                        break L10;
                                      } else {
                                        stackOut_81_0 = (String[]) (Object) stackIn_81_0;
                                        stackOut_81_1 = stackIn_81_1;
                                        stackOut_81_2 = re.field_a[var8];
                                        stackIn_83_0 = stackOut_81_0;
                                        stackIn_83_1 = stackOut_81_1;
                                        stackIn_83_2 = stackOut_81_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_83_0[stackIn_83_1] = stackIn_83_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_74_0 = pl.field_k;
                                  stackOut_74_1 = var8 + 6;
                                  stackIn_76_0 = stackOut_74_0;
                                  stackIn_76_1 = stackOut_74_1;
                                  stackIn_75_0 = stackOut_74_0;
                                  stackIn_75_1 = stackOut_74_1;
                                  if (0 <= -var5 + var8 + uj.field_c.length) {
                                    stackOut_76_0 = (String[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = uj.field_c[uj.field_c.length + var8 - var5];
                                    stackIn_77_0 = stackOut_76_0;
                                    stackIn_77_1 = stackOut_76_1;
                                    stackIn_77_2 = stackOut_76_2;
                                    break L11;
                                  } else {
                                    stackOut_75_0 = (String[]) (Object) stackIn_75_0;
                                    stackOut_75_1 = stackIn_75_1;
                                    stackOut_75_2 = "";
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_77_2 = stackOut_75_2;
                                    break L11;
                                  }
                                }
                                stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            gh.field_a[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (ud.field_b != 3) {
                  if ((ud.field_b ^ -1) != -5) {
                    if (ud.field_b == 5) {
                      var3 = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
                      var4 = 3 + var3;
                      gh.field_a = new int[var4];
                      pl.field_k = new String[var4];
                      var5 = 0;
                      L12: while (true) {
                        if (var4 <= var5) {
                          bi.field_B = new int[2];
                          var5 = 0;
                          L13: while (true) {
                            if (var5 >= var3) {
                              pl.field_k[var4 - 3] = "";
                              pl.field_k[var4 + -2] = j.field_b;
                              gh.field_a[var4 + -2] = 0;
                              bi.field_B[0] = 3;
                              pl.field_k[var4 - 1] = db.field_e;
                              gh.field_a[-1 + var4] = 1;
                              bi.field_B[1] = 5;
                              break L0;
                            } else {
                              pl.field_k[var5] = vi.field_b[var5];
                              var5++;
                              continue L13;
                            }
                          }
                        } else {
                          gh.field_a[var5] = -1;
                          var5++;
                          continue L12;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var3 = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
                    var4 = var3 + 2;
                    pl.field_k = new String[var4];
                    gh.field_a = new int[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var4 <= var5) {
                        bi.field_B = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var3 <= var5) {
                            pl.field_k[-2 + var4] = "";
                            pl.field_k[-1 + var4] = db.field_e;
                            gh.field_a[-1 + var4] = 0;
                            bi.field_B[0] = 5;
                            break L0;
                          } else {
                            pl.field_k[var5] = vi.field_b[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        gh.field_a[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  L16: {
                    if (rc.field_k.field_q) {
                      var3 = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
                      break L16;
                    } else {
                      var3 = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
                      break L16;
                    }
                  }
                  var4 = 2 - -var3;
                  gh.field_a = new int[var4];
                  pl.field_k = new String[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (var5 >= var4) {
                      bi.field_B = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var3 <= var5) {
                          pl.field_k[var4 + -2] = "";
                          pl.field_k[var4 + -1] = db.field_e;
                          gh.field_a[-1 + var4] = 0;
                          bi.field_B[0] = 5;
                          break L0;
                        } else {
                          pl.field_k[var5] = vi.field_b[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      gh.field_a[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              var3 = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
              var4 = var3 + 2;
              pl.field_k = new String[var4];
              gh.field_a = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  bi.field_B = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3) {
                      pl.field_k[-2 + var4] = "";
                      pl.field_k[-1 + var4] = db.field_e;
                      gh.field_a[var4 + -1] = 0;
                      bi.field_B[0] = 5;
                      break L0;
                    } else {
                      pl.field_k[var5] = vi.field_b[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  gh.field_a[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3 = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
            var4 = 3 - -var3;
            gh.field_a = new int[var4];
            pl.field_k = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                bi.field_B = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3) {
                    pl.field_k[-3 + var4] = "";
                    pl.field_k[var4 - 2] = qd.field_d;
                    gh.field_a[-2 + var4] = 0;
                    bi.field_B[0] = 4;
                    pl.field_k[-1 + var4] = db.field_e;
                    gh.field_a[-1 + var4] = 1;
                    bi.field_B[1] = 5;
                    break L0;
                  } else {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                gh.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        sj.field_f.field_i = bi.field_B.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= pl.field_k.length) {
            L24: {
              if ((ud.field_b ^ -1) != -3) {
                break L24;
              } else {
                var10 = wi.field_b;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = ud.field_e;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = hh.a((byte) -126, var13, false);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = hh.a((byte) -109, var12, false);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              }
            }
            h.field_b = -(var3 >> 47297697) + (jc.field_b - -var3);
            sc.field_g = jc.field_b + -(var3 >> -1788205887);
            fd.field_s = (ud.field_a + vf.field_b << -144221503) * sj.field_f.field_i;
            if (param0 < -92) {
              var4 = 0;
              L27: while (true) {
                if (pl.field_k.length <= var4) {
                  fb.field_k = -(fd.field_s >> 1811966177) + fl.field_b;
                  ja.field_A = new int[pl.field_k.length][];
                  var4 = 0;
                  var5 = fb.field_k;
                  L28: while (true) {
                    if (pl.field_k.length <= var4) {
                      L29: {
                        if ((ud.field_b ^ -1) == -3) {
                          sj.field_f.a(-1, -1, 0, param1);
                          break L29;
                        } else {
                          sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = gh.field_a[var4];
                      if (var6 < 0) {
                        var5 = var5 + gi.field_a;
                        var4++;
                        continue L28;
                      } else {
                        var7 = hh.a((byte) -115, pl.field_k[var4], true);
                        var8 = jc.field_b - (var7 >> 1881197345);
                        var5 = var5 + ud.field_a;
                        ja.field_A[var4] = new int[4];
                        ja.field_A[var4][0] = -pl.field_h + var8;
                        ja.field_A[var4][1] = var5;
                        ja.field_A[var4][2] = (pl.field_h << 387895873) + var7;
                        var5 = var5 + ((vf.field_b << 369803937) + (ud.field_a + hb.field_n));
                        ja.field_A[var4][3] = hb.field_n - -(vf.field_b << 1498607393);
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_108_0 = fd.field_s;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if ((gh.field_a[var4] ^ -1) <= -1) {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = hb.field_n;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L30;
                    } else {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = gi.field_a;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L30;
                    }
                  }
                  fd.field_s = stackIn_111_0 + stackIn_111_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              return;
            }
          } else {
            L31: {
              stackOut_87_0 = -108;
              stackOut_87_1 = pl.field_k[var4];
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              if (gh.field_a[var4] < 0) {
                stackOut_89_0 = stackIn_89_0;
                stackOut_89_1 = (String) (Object) stackIn_89_1;
                stackOut_89_2 = 0;
                stackIn_90_0 = stackOut_89_0;
                stackIn_90_1 = stackOut_89_1;
                stackIn_90_2 = stackOut_89_2;
                break L31;
              } else {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = (String) (Object) stackIn_88_1;
                stackOut_88_2 = 1;
                stackIn_90_0 = stackOut_88_0;
                stackIn_90_1 = stackOut_88_1;
                stackIn_90_2 = stackOut_88_2;
                break L31;
              }
            }
            var5 = hh.a((byte) stackIn_90_0, stackIn_90_1, stackIn_90_2 != 0);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6 < -109) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$2 = this.a((byte) -23, (we) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jk) this).field_v) {
              break L2;
            } else {
              if (!((jk) this).field_v.b((byte) 43)) {
                break L2;
              } else {
                if (!((jk) this).field_v.a(param0, param1, param2, param3, param4, param5, -127)) {
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
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
