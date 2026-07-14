/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.StringBuilder;

final class fc {
    static wf field_z;
    String field_C;
    private StringBuilder field_X;
    static db[] field_e;
    private int field_W;
    boolean field_T;
    static int field_q;
    int field_i;
    int field_R;
    int field_f;
    private int field_P;
    private ng field_G;
    private int field_U;
    boolean field_D;
    static String[] field_S;
    int field_a;
    private int field_N;
    private int field_n;
    int field_t;
    private int field_o;
    private ng field_B;
    int field_J;
    int field_r;
    private ng field_y;
    boolean field_h;
    private boolean field_k;
    private int field_V;
    int[][] field_F;
    private int field_c;
    private int field_H;
    Random field_I;
    private ha field_g;
    int field_d;
    char[][] field_w;
    private int field_K;
    oj field_m;
    ha field_Q;
    int field_M;
    ng field_j;
    boolean field_E;
    boolean field_O;
    private boolean field_x;
    private int field_l;
    boolean field_v;
    boolean field_A;
    private Lexicominos field_u;
    int field_s;
    private int field_b;
    private int field_L;
    private int field_p;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            ((fc) this).b((byte) 119);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = oe.field_a;
            if (0 != var2) {
              if ((var2 ^ -1) == -2) {
                this.a(new String[6], (byte) -100, 0, "NOTT");
                break L2;
              } else {
                if (2 != var2) {
                  if (-4 == (var2 ^ -1)) {
                    this.a(new String[8], (byte) -117, 0, "ETTE");
                    break L2;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      this.a(new String[5], (byte) 14, 0, "ACHE");
                      break L2;
                    } else {
                      if ((var2 ^ -1) == -6) {
                        this.a(new String[10], (byte) 68, 0, "ESST");
                        break L2;
                      } else {
                        if ((var2 ^ -1) != -7) {
                          if (-8 != (var2 ^ -1)) {
                            if (-9 != (var2 ^ -1)) {
                              if (var2 != 9) {
                                if (10 == var2) {
                                  this.a(new String[10], (byte) -113, 0, "ALLI");
                                  break L2;
                                } else {
                                  if ((var2 ^ -1) == -12) {
                                    this.a(new String[16], (byte) 54, 0, "ALLI");
                                    break L2;
                                  } else {
                                    if ((var2 ^ -1) != -13) {
                                      if (13 == var2) {
                                        this.a(new String[2], (byte) -107, 0, "PPPP");
                                        break L2;
                                      } else {
                                        if (-15 == (var2 ^ -1)) {
                                          this.a(new String[3], (byte) 125, 0, "PPPP");
                                          break L2;
                                        } else {
                                          if (15 != var2) {
                                            if (16 != var2) {
                                              if (var2 == 17) {
                                                this.a(new String[5], (byte) 29, 0, "PPPP");
                                                break L2;
                                              } else {
                                                if (var2 != 18) {
                                                  if (var2 != 19) {
                                                    if (20 != var2) {
                                                      if (-22 == (var2 ^ -1)) {
                                                        this.a(new String[4], (byte) -9, 0, "SSSS");
                                                        break L2;
                                                      } else {
                                                        if (22 == var2) {
                                                          this.a(new String[4], (byte) -125, 0, "SSSS");
                                                          break L2;
                                                        } else {
                                                          if (var2 == 23) {
                                                            this.a(new String[4], (byte) 50, 0, "ENGT");
                                                            break L2;
                                                          } else {
                                                            if (24 != var2) {
                                                              if ((var2 ^ -1) == -26) {
                                                                this.a(new String[6], (byte) -115, 0, "SKUN");
                                                                break L2;
                                                              } else {
                                                                oe.field_a = oe.field_a + 1;
                                                                break L1;
                                                              }
                                                            } else {
                                                              this.a(new String[6], (byte) 2, 0, "KUNK");
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      this.a(new String[4], (byte) 17, 0, "NNNN");
                                                      break L2;
                                                    }
                                                  } else {
                                                    this.a(new String[4], (byte) -112, 0, "IIII");
                                                    break L2;
                                                  }
                                                } else {
                                                  this.a(new String[4], (byte) 11, 0, "IIII");
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              this.a(new String[4], (byte) -128, 0, "PPPP");
                                              break L2;
                                            }
                                          } else {
                                            this.a(new String[3], (byte) -101, 0, "PPPP");
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      this.a(new String[3], (byte) -128, 0, "PPPP");
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                this.a(new String[14], (byte) -101, 0, "EDLI");
                                break L2;
                              }
                            } else {
                              this.a(new String[9], (byte) -121, 0, "EDLI");
                              break L2;
                            }
                          } else {
                            this.a(new String[12], (byte) -121, 0, "LSWR");
                            break L2;
                          }
                        } else {
                          this.a(new String[6], (byte) -102, 0, "SOOT");
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  this.a(new String[4], (byte) 117, 0, "LYYL");
                  break L2;
                }
              }
            } else {
              this.a(new String[6], (byte) 110, 0, "NOTT");
              break L2;
            }
          }
          oe.field_a = oe.field_a + 1;
          break L1;
        }
    }

    private final void c(int param0) {
        bd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        var11 = new int[4];
        var3 = (bd) (Object) ((fc) this).field_y.a(true);
        var4 = 77 % ((param0 - 52) / 55);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              ca.a(12, var11, var3);
              var5 = var11[2] * var11[3];
              var6 = ib.field_g[var5] * ((fc) this).field_l;
              ((fc) this).field_a = ((fc) this).field_a - (var6 << -604734619);
              ((fc) this).field_J = ((fc) this).field_J + var6;
              ((fc) this).field_R = ((fc) this).field_R + (var6 << 2138757829);
              if (5 != var5) {
                if (var5 == 6) {
                  this.a((byte) -107, 254, 1);
                  break L1;
                } else {
                  if (7 == var5) {
                    this.a((byte) -107, 253, 2);
                    break L1;
                  } else {
                    if (var5 < 8) {
                      break L1;
                    } else {
                      this.a((byte) -107, 252, 3);
                      break L1;
                    }
                  }
                }
              } else {
                this.a((byte) -107, 255, 0);
                break L1;
              }
            }
            var3 = (bd) (Object) ((fc) this).field_y.f(2);
            continue L0;
          }
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var12 = null;
        char[] var14 = null;
        String[] var15 = null;
        char[] var17 = null;
        char[] var19 = null;
        char[] var21 = null;
        char[] var23 = null;
        char[] var25 = null;
        char[] var27 = null;
        char[] var29 = null;
        char[][] var30 = null;
        char[] var31 = null;
        char[][] var32 = null;
        char[] var33 = null;
        char[][] var34 = null;
        char[] var35 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        if (param0 < -35) {
          L0: {
            oe.field_a = oe.field_a - 1;
            var3 = 0;
            if ((param1 ^ -1) != -1) {
              if (param1 == 1) {
                var34 = ((fc) this).field_w;
                var5 = 0;
                L1: while (true) {
                  if ((var34.length ^ -1) >= (var5 ^ -1)) {
                    ((fc) this).field_w[0][6] = md.field_L.charAt(0);
                    ((fc) this).field_w[0][7] = md.field_L.charAt(1);
                    ((fc) this).field_w[0][9] = md.field_L.charAt(3);
                    ((fc) this).field_w[0][10] = md.field_L.charAt(4);
                    ((fc) this).field_w[0][11] = md.field_L.charAt(5);
                    ((fc) this).field_w[1][6] = (char)84;
                    ((fc) this).field_w[1][11] = (char)69;
                    ((fc) this).field_w[1][5] = (char)72;
                    ((fc) this).field_g = new ha((fc) this, 4, new char[4]);
                    break L0;
                  } else {
                    var35 = var34[var5];
                    var29 = var35;
                    var23 = var29;
                    var17 = var23;
                    var6 = var17;
                    var7 = 0;
                    L2: while (true) {
                      if ((var7 ^ -1) <= (var35.length ^ -1)) {
                        var5++;
                        continue L1;
                      } else {
                        var6[var7] = (char)0;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                if (-3 != (param1 ^ -1)) {
                  if ((param1 ^ -1) != -4) {
                    var3 = 1;
                    break L0;
                  } else {
                    var15 = new String[]{"NZ          ", " ST      NO ", " DTCCG  IA E", "  O  FA EQNO", " OKSG NTA S ", "SM    B  ED ", "RT    LS D  ", " P AN  LCW  ", " RS AD LTZ  ", "  L  LHA AXF", "  L    ECZ  ", "  SI  LWMLE ", "   C GW TPS ", "ESJSI DO NB ", "E  SD  W Z  ", "DE AWO ORRST", "LP  B ZDDICN"};
                    var5 = 0;
                    L3: while (true) {
                      if (var15.length <= var5) {
                        ((fc) this).field_g = new ha((fc) this, 1, new char[4]);
                        ((fc) this).field_Q = new ha((fc) this, 6, new char[4]);
                        break L0;
                      } else {
                        var6 = ((fc) this).field_w[-var5 + var15.length + -1];
                        var7_ref = var15[var5].toUpperCase();
                        var8 = 0;
                        L4: while (true) {
                          if (var7_ref.length() <= var8) {
                            var5++;
                            continue L3;
                          } else {
                            L5: {
                              var9 = var7_ref.charAt(var8);
                              if (var9 < 65) {
                                break L5;
                              } else {
                                if (90 >= var9) {
                                  var6[var8] = (char)var9;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var32 = ((fc) this).field_w;
                  var5 = 0;
                  L6: while (true) {
                    if ((var5 ^ -1) <= (var32.length ^ -1)) {
                      L7: {
                        ((fc) this).field_w[0][4] = jf.field_G.charAt(1);
                        ((fc) this).field_w[0][5] = jf.field_G.charAt(2);
                        ((fc) this).field_w[0][6] = jf.field_G.charAt(3);
                        ((fc) this).field_w[0][7] = jf.field_G.charAt(4);
                        ((fc) this).field_w[1][3] = jf.field_G.charAt(0);
                        ((fc) this).field_w[1][4] = ch.field_d.charAt(0);
                        if ((ri.field_e ^ -1) == -3) {
                          break L7;
                        } else {
                          ((fc) this).field_w[1][6] = ch.field_d.charAt(2);
                          break L7;
                        }
                      }
                      L8: {
                        ((fc) this).field_w[1][7] = ch.field_d.charAt(3);
                        ((fc) this).field_w[1][8] = ch.field_d.charAt(4);
                        ((fc) this).field_w[2][3] = (char)70;
                        ((fc) this).field_w[2][5] = ch.field_d.charAt(1);
                        if (2 == ri.field_e) {
                          ((fc) this).field_w[2][6] = ch.field_d.charAt(2);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ((fc) this).field_w[3][3] = c.field_n.charAt(0);
                      ((fc) this).field_w[3][4] = c.field_n.charAt(1);
                      ((fc) this).field_w[3][5] = c.field_n.charAt(2);
                      ((fc) this).field_g = new ha((fc) this, 3, new char[4]);
                      break L0;
                    } else {
                      var33 = var32[var5];
                      var27 = var33;
                      var21 = var27;
                      var14 = var21;
                      var6 = var14;
                      var7 = 0;
                      L9: while (true) {
                        if ((var7 ^ -1) <= (var33.length ^ -1)) {
                          var5++;
                          continue L6;
                        } else {
                          var6[var7] = (char)0;
                          var7++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var30 = ((fc) this).field_w;
              var5 = 0;
              L10: while (true) {
                if ((var30.length ^ -1) >= (var5 ^ -1)) {
                  ((fc) this).field_w[0][2] = (char)80;
                  ((fc) this).field_w[0][3] = (char)73;
                  ((fc) this).field_w[1][2] = bj.field_a.charAt(2);
                  ((fc) this).field_w[2][2] = bj.field_a.charAt(1);
                  ((fc) this).field_g = new ha((fc) this, 6, new char[4]);
                  break L0;
                } else {
                  var31 = var30[var5];
                  var25 = var31;
                  var19 = var25;
                  var12 = var19;
                  var6 = var12;
                  var7 = 0;
                  L11: while (true) {
                    if ((var7 ^ -1) <= (var31.length ^ -1)) {
                      var5++;
                      continue L10;
                    } else {
                      var6[var7] = (char)0;
                      var7++;
                      continue L11;
                    }
                  }
                }
              }
            }
          }
          L12: {
            if (var3 != 0) {
              break L12;
            } else {
              ((fc) this).field_d = 3;
              ((fc) this).field_b = param1;
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -2) {
            ((fc) this).field_f = 49;
        }
        return rh.a(param0 ^ -14817, ((fc) this).field_I, param1);
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean[] var5_ref_boolean__ = null;
        boolean[] var6_ref_boolean__ = null;
        int var6 = 0;
        boolean[] var7_ref_boolean__ = null;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        int[] var9_array = null;
        boolean[] var10_ref_boolean__ = null;
        int var10 = 0;
        int var11_int = 0;
        vf var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int[] var14 = null;
        bd var15 = null;
        Object var16 = null;
        Object var17 = null;
        vf var18 = null;
        vf var19 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        StringBuilder stackIn_87_0 = null;
        StringBuilder stackIn_88_0 = null;
        StringBuilder stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Lexicominos stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        int stackIn_204_2 = 0;
        Lexicominos stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        Lexicominos stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_206_3 = 0;
        int stackIn_210_0 = 0;
        StringBuilder stackOut_86_0 = null;
        StringBuilder stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        StringBuilder stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        Lexicominos stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        int stackOut_203_2 = 0;
        Lexicominos stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_205_3 = 0;
        Lexicominos stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int stackOut_204_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_62_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        var16 = null;
        var17 = null;
        var13 = Lexicominos.field_L ? 1 : 0;
        if (!((fc) this).field_T) {
          if (param0 == 1) {
            L0: {
              ((fc) this).b(2);
              if (null == ((fc) this).field_G.a(true)) {
                break L0;
              } else {
                ((fc) this).field_H = ((fc) this).field_H + 1;
                if (335 != ((fc) this).field_H + 1) {
                  break L0;
                } else {
                  ((fc) this).field_H = 0;
                  kd discarded$12 = ((fc) this).field_G.a((byte) 74);
                  break L0;
                }
              }
            }
            L1: {
              var5 = ((fc) this).field_K;
              if (var5 != 1) {
                L2: {
                  if (-3 == (var5 ^ -1)) {
                    L3: {
                      if (((fc) this).field_b >= 0) {
                        var5_ref_boolean__ = wa.field_j;
                        var6_ref_boolean__ = wa.field_j;
                        var7_ref_boolean__ = wa.field_j;
                        var8 = sa.field_c;
                        var9 = wa.field_j;
                        var10_ref_boolean__ = wa.field_j;
                        var11_int = gk.field_e;
                        var12 = wa.field_j;
                        wa.field_j[83] = false;
                        var12[99] = false;
                        var10_ref_boolean__[var11_int] = false;
                        var9[98] = false;
                        var7_ref_boolean__[var8] = false;
                        var5_ref_boolean__[96] = false;
                        var6_ref_boolean__[97] = false;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (((fc) this).field_y != null) {
                      ((fc) this).field_n = ((fc) this).field_n - 1;
                      var5 = ((fc) this).field_n + 50;
                      var18 = (vf) (Object) ((fc) this).field_B.a(true);
                      L4: while (true) {
                        if (var18 == null) {
                          if ((((fc) this).field_n ^ -1) == -1) {
                            this.c(-111);
                            this.f(19076);
                            ((fc) this).field_n = 50;
                            ((fc) this).a((byte) 99, 3);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          var18.a(var5, true);
                          var18 = (vf) (Object) ((fc) this).field_B.f(param0 ^ 3);
                          continue L4;
                        }
                      }
                    } else {
                      L5: {
                        if (((fc) this).field_X.length() != 0) {
                          break L5;
                        } else {
                          var5 = 17;
                          L6: while (true) {
                            if (-1 < (var5 ^ -1)) {
                              break L5;
                            } else {
                              var6 = 0;
                              L7: while (true) {
                                if (-13 >= (var6 ^ -1)) {
                                  StringBuilder discarded$13 = ((fc) this).field_X.append(124);
                                  var5--;
                                  continue L6;
                                } else {
                                  L8: {
                                    stackOut_86_0 = ((fc) this).field_X;
                                    stackIn_88_0 = stackOut_86_0;
                                    stackIn_87_0 = stackOut_86_0;
                                    if (0 == ((fc) this).field_w[var5][var6]) {
                                      stackOut_88_0 = (StringBuilder) (Object) stackIn_88_0;
                                      stackOut_88_1 = 46;
                                      stackIn_89_0 = stackOut_88_0;
                                      stackIn_89_1 = stackOut_88_1;
                                      break L8;
                                    } else {
                                      stackOut_87_0 = (StringBuilder) (Object) stackIn_87_0;
                                      stackOut_87_1 = 255 & ((fc) this).field_w[var5][var6];
                                      stackIn_89_0 = stackOut_87_0;
                                      stackIn_89_1 = stackOut_87_1;
                                      break L8;
                                    }
                                  }
                                  StringBuilder discarded$14 = ((StringBuilder) (Object) stackIn_89_0).append((char)stackIn_89_1);
                                  var6++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      ((fc) this).field_y = ((fc) this).field_m.a(((fc) this).field_w, 17161);
                      ((fc) this).field_t = ((fc) this).field_t + ((fc) this).field_y.b(param0 + 1);
                      if (-1 != (((fc) this).field_y.b(param0 + 1) ^ -1)) {
                        L9: {
                          mh.b(0, 100);
                          ((fc) this).field_l = ((fc) this).field_l + ((fc) this).field_y.b(2);
                          if ((th.field_l.length ^ -1) < (((fc) this).field_l ^ -1)) {
                            break L9;
                          } else {
                            ((fc) this).field_l = th.field_l.length + -1;
                            break L9;
                          }
                        }
                        L10: {
                          if (((fc) this).field_l < 3) {
                            break L10;
                          } else {
                            this.a((byte) -107, 251, 4);
                            break L10;
                          }
                        }
                        L11: {
                          if (-5 >= (((fc) this).field_l ^ -1)) {
                            this.a((byte) -107, 250, 5);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (5 > ((fc) this).field_l) {
                            break L12;
                          } else {
                            this.a((byte) -107, 249, 6);
                            break L12;
                          }
                        }
                        L13: {
                          if (6 <= ((fc) this).field_l) {
                            this.a((byte) -107, 248, 7);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          ((fc) this).field_c = ((fc) this).field_c + 1;
                          if (((fc) this).field_c < 3) {
                            break L14;
                          } else {
                            this.a((byte) -107, 247, 8);
                            break L14;
                          }
                        }
                        L15: {
                          if (-5 < (((fc) this).field_c ^ -1)) {
                            break L15;
                          } else {
                            this.a((byte) -107, 246, 9);
                            break L15;
                          }
                        }
                        L16: {
                          if (-6 < (((fc) this).field_c ^ -1)) {
                            break L16;
                          } else {
                            this.a((byte) -107, 245, 10);
                            break L16;
                          }
                        }
                        var5 = 2147483647;
                        var6 = -2147483648;
                        var7 = var5;
                        var8 = var6;
                        var14 = new int[4];
                        var9_array = new int[4];
                        var15 = (bd) (Object) ((fc) this).field_y.a(true);
                        L17: while (true) {
                          if (var15 == null) {
                            L18: {
                              StringBuilder discarded$15 = ((fc) this).field_X.append(124);
                              ((fc) this).field_V = 416 - -(((var7 + var8) * -24 - -24) / 2);
                              ((fc) this).field_o = (1 + (var5 + var6)) * 24 / 2 + 10;
                              if ((((fc) this).field_l ^ -1) >= -2) {
                                break L18;
                              } else {
                                L19: {
                                  var10 = -2 + (4 + ((fc) this).field_l);
                                  if ((var10 ^ -1) <= -9) {
                                    var10 = 7;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                mh.b(var10, 100);
                                break L18;
                              }
                            }
                            ((fc) this).field_n = 50;
                            var10 = 100;
                            var11 = (vf) (Object) ((fc) this).field_B.a(true);
                            L20: while (true) {
                              if (var11 == null) {
                                break L2;
                              } else {
                                var11.a(((fc) this).field_y.b(2), 32211, var10);
                                var11 = (vf) (Object) ((fc) this).field_B.f(param0 ^ 3);
                                continue L20;
                              }
                            }
                          } else {
                            L21: {
                              ca.a(12, var14, var15);
                              if (var14[2] + var14[1] + -1 > var6) {
                                var6 = var14[1] + (var14[2] - 1);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              if (var14[1] >= var5) {
                                break L22;
                              } else {
                                var5 = var14[1];
                                break L22;
                              }
                            }
                            L23: {
                              if (1 + -var14[3] + var14[0] < var7) {
                                var7 = var14[0] + (-var14[3] + 1);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: {
                              if (var14[0] <= var8) {
                                break L24;
                              } else {
                                var8 = var14[0];
                                break L24;
                              }
                            }
                            StringBuilder discarded$16 = ((fc) this).field_X.append(Integer.toString(var14[0]));
                            StringBuilder discarded$17 = ((fc) this).field_X.append(44);
                            StringBuilder discarded$18 = ((fc) this).field_X.append(Integer.toString(var14[1]));
                            StringBuilder discarded$19 = ((fc) this).field_X.append(44);
                            StringBuilder discarded$20 = ((fc) this).field_X.append(Integer.toString(var14[2]));
                            StringBuilder discarded$21 = ((fc) this).field_X.append(44);
                            StringBuilder discarded$22 = ((fc) this).field_X.append(Integer.toString(var14[3]));
                            StringBuilder discarded$23 = ((fc) this).field_X.append(59);
                            ((fc) this).field_N = ((fc) this).field_N + 1;
                            ((fc) this).field_i = ((fc) this).field_i ^ var14[0];
                            ((fc) this).field_f = ((fc) this).field_f ^ var14[0];
                            ((fc) this).field_P = ((fc) this).field_P + ((fc) this).field_U;
                            var15 = (bd) (Object) ((fc) this).field_y.f(2);
                            continue L17;
                          }
                        }
                      } else {
                        L25: {
                          ((fc) this).field_c = 0;
                          ((fc) this).field_Q = new ha((fc) this);
                          ((fc) this).field_L = 0;
                          if (((fc) this).field_d >= 16) {
                            break L25;
                          } else {
                            L26: {
                              var5 = (((fc) this).field_t >> -1538622301) + 1;
                              if ((((fc) this).field_d ^ -1) <= (var5 ^ -1)) {
                                break L26;
                              } else {
                                ((fc) this).field_d = ((fc) this).field_d + 1;
                                ((fc) this).field_s = 0;
                                if ((((fc) this).field_d & 1 ^ -1) != -2) {
                                  break L26;
                                } else {
                                  ki.a(1000000 - -(((fc) this).field_d * 40000) - 40000, ((fc) this).field_I, -104);
                                  break L26;
                                }
                              }
                            }
                            if (-6 == (((fc) this).field_d ^ -1)) {
                              this.a((byte) -107, 244, 11);
                              break L25;
                            } else {
                              if (10 != ((fc) this).field_d) {
                                if ((((fc) this).field_d ^ -1) == -16) {
                                  this.a((byte) -107, 242, 13);
                                  break L25;
                                } else {
                                  if (20 != ((fc) this).field_d) {
                                    break L25;
                                  } else {
                                    this.a((byte) -107, 241, 14);
                                    break L25;
                                  }
                                }
                              } else {
                                this.a((byte) -107, 243, 12);
                                break L25;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        var6 = 15;
                        L27: while (true) {
                          L28: {
                            if (18 <= var6) {
                              break L28;
                            } else {
                              var7 = 0;
                              L29: while (true) {
                                if (-13 >= (var7 ^ -1)) {
                                  var6++;
                                  continue L27;
                                } else {
                                  if (-1 != (((fc) this).field_w[var6][var7] ^ -1)) {
                                    var5 = 1;
                                    break L28;
                                  } else {
                                    var7++;
                                    continue L29;
                                  }
                                }
                              }
                            }
                          }
                          L30: {
                            L31: {
                              if (var5 == 0) {
                                break L31;
                              } else {
                                if (!fg.field_b) {
                                  nh.a(param0 + -1, 40000 * (((fc) this).field_d - 1) + 1000000, 5, false);
                                  ((fc) this).field_k = true;
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            if (var5 != 0) {
                              break L30;
                            } else {
                              if (!fg.field_b) {
                                break L30;
                              } else {
                                nh.a(0, 1000000 - -((((fc) this).field_d + -1) * 40000), e.field_q, true);
                                break L30;
                              }
                            }
                          }
                          L32: {
                            fg.field_b = var5 != 0;
                            if ((32768 & sc.field_g ^ -1) != -1) {
                              break L32;
                            } else {
                              if (!((fc) this).field_k) {
                                break L32;
                              } else {
                                if (!fg.field_b) {
                                  var6 = 1;
                                  var7 = 12;
                                  L33: while (true) {
                                    L34: {
                                      if (-16 >= (var7 ^ -1)) {
                                        break L34;
                                      } else {
                                        var8 = 0;
                                        L35: while (true) {
                                          if (var8 >= 12) {
                                            var7++;
                                            continue L33;
                                          } else {
                                            if (((fc) this).field_w[var7][var8] == 0) {
                                              var8++;
                                              continue L35;
                                            } else {
                                              var6 = 0;
                                              break L34;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var6 != 0) {
                                      this.a((byte) -107, 240, 15);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                } else {
                                  ((fc) this).a((byte) 99, 1);
                                  break L1;
                                }
                              }
                            }
                          }
                          ((fc) this).a((byte) 99, 1);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if ((var5 ^ -1) == -4) {
                      if (((fc) this).field_n <= 0) {
                        var3 = 0;
                        var2 = 1;
                        var4 = ((fc) this).field_d * ((fc) this).field_p / 2;
                        ((fc) this).field_p = ((fc) this).field_p + 1;
                        var5 = 0;
                        L36: while (true) {
                          if (18 <= var5) {
                            if (var2 == 0) {
                              break L2;
                            } else {
                              ((fc) this).a((byte) 99, 2);
                              break L1;
                            }
                          } else {
                            var6 = 0;
                            L37: while (true) {
                              if ((var6 ^ -1) <= -13) {
                                var5++;
                                continue L36;
                              } else {
                                L38: {
                                  if (((fc) this).field_F[var5][var6] > 0) {
                                    ((fc) this).field_F[var5][var6] = Math.max(0, ((fc) this).field_F[var5][var6] - var4);
                                    var2 = 0;
                                    if ((((fc) this).field_F[var5][var6] ^ -1) != -1) {
                                      break L38;
                                    } else {
                                      if (var3 == 0) {
                                        var3 = 1;
                                        mh.b(1, 100);
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  } else {
                                    break L38;
                                  }
                                }
                                var6++;
                                continue L37;
                              }
                            }
                          }
                        }
                      } else {
                        ((fc) this).field_n = ((fc) this).field_n - 1;
                        var19 = (vf) (Object) ((fc) this).field_B.a(true);
                        L39: while (true) {
                          if (var19 == null) {
                            break L2;
                          } else {
                            var19.a(((fc) this).field_n, true);
                            var19 = (vf) (Object) ((fc) this).field_B.f(2);
                            continue L39;
                          }
                        }
                      }
                    } else {
                      if ((var5 ^ -1) == -5) {
                        ((fc) this).field_n = ((fc) this).field_n + 1;
                        if (438 > ((fc) this).field_n) {
                          break L2;
                        } else {
                          if (-1 == ((fc) this).field_b) {
                            if (ki.a((byte) -112)) {
                              L40: {
                                if (((ee.field_a | ((fc) this).field_J) ^ -1) == -1) {
                                  stackOut_209_0 = 0;
                                  stackIn_210_0 = stackOut_209_0;
                                  break L40;
                                } else {
                                  stackOut_208_0 = 6;
                                  stackIn_210_0 = stackOut_208_0;
                                  break L40;
                                }
                              }
                              var5 = stackIn_210_0;
                              ((fc) this).field_u.a((byte) 88, false, var5, var5);
                              break L1;
                            } else {
                              L41: {
                                stackOut_203_0 = ((fc) this).field_u;
                                stackOut_203_1 = 83;
                                stackOut_203_2 = 0;
                                stackIn_205_0 = stackOut_203_0;
                                stackIn_205_1 = stackOut_203_1;
                                stackIn_205_2 = stackOut_203_2;
                                stackIn_204_0 = stackOut_203_0;
                                stackIn_204_1 = stackOut_203_1;
                                stackIn_204_2 = stackOut_203_2;
                                if ((ee.field_a ^ -1) < -1) {
                                  stackOut_205_0 = (Lexicominos) (Object) stackIn_205_0;
                                  stackOut_205_1 = stackIn_205_1;
                                  stackOut_205_2 = stackIn_205_2;
                                  stackOut_205_3 = 7;
                                  stackIn_206_0 = stackOut_205_0;
                                  stackIn_206_1 = stackOut_205_1;
                                  stackIn_206_2 = stackOut_205_2;
                                  stackIn_206_3 = stackOut_205_3;
                                  break L41;
                                } else {
                                  stackOut_204_0 = (Lexicominos) (Object) stackIn_204_0;
                                  stackOut_204_1 = stackIn_204_1;
                                  stackOut_204_2 = stackIn_204_2;
                                  stackOut_204_3 = 1;
                                  stackIn_206_0 = stackOut_204_0;
                                  stackIn_206_1 = stackOut_204_1;
                                  stackIn_206_2 = stackOut_204_2;
                                  stackIn_206_3 = stackOut_204_3;
                                  break L41;
                                }
                              }
                              ((Lexicominos) (Object) stackIn_206_0).a((byte) stackIn_206_1, stackIn_206_2 != 0, stackIn_206_3, 0);
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        System.out.println("Unknown state: " + ((fc) this).field_K);
                        break L1;
                      }
                    }
                  }
                }
                break L1;
              } else {
                L42: {
                  stackOut_13_0 = 0;
                  stackOut_13_1 = 1000000 - -(40000 * (-1 + ((fc) this).field_d));
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (fg.field_b) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 5;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    break L42;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = e.field_q;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    break L42;
                  }
                }
                L43: {
                  nh.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, false);
                  ((fc) this).field_A = false;
                  ((fc) this).field_O = false;
                  ((fc) this).field_E = false;
                  ((fc) this).field_v = false;
                  ((fc) this).field_L = ((fc) this).field_L + 1;
                  ((fc) this).field_s = ((fc) this).field_s + 1;
                  ((fc) this).field_x = false;
                  if (0 > ((fc) this).field_b) {
                    L44: {
                      L45: {
                        ((fc) this).field_O = wa.field_j[97];
                        ((fc) this).field_v = wa.field_j[96];
                        stackOut_56_0 = this;
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_57_0 = stackOut_56_0;
                        if (wa.field_j[99]) {
                          break L45;
                        } else {
                          stackOut_57_0 = this;
                          stackIn_60_0 = stackOut_57_0;
                          stackIn_58_0 = stackOut_57_0;
                          if (!wa.field_j[83]) {
                            stackOut_60_0 = this;
                            stackOut_60_1 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            break L44;
                          } else {
                            stackOut_58_0 = this;
                            stackIn_59_0 = stackOut_58_0;
                            break L45;
                          }
                        }
                      }
                      stackOut_59_0 = this;
                      stackOut_59_1 = 1;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      break L44;
                    }
                    L46: {
                      L47: {
                        ((fc) this).field_E = stackIn_61_1 != 0;
                        stackOut_61_0 = this;
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_62_0 = stackOut_61_0;
                        if (wa.field_j[sa.field_c]) {
                          break L47;
                        } else {
                          stackOut_62_0 = this;
                          stackIn_65_0 = stackOut_62_0;
                          stackIn_63_0 = stackOut_62_0;
                          if (!wa.field_j[98]) {
                            stackOut_65_0 = this;
                            stackOut_65_1 = 0;
                            stackIn_66_0 = stackOut_65_0;
                            stackIn_66_1 = stackOut_65_1;
                            break L46;
                          } else {
                            stackOut_63_0 = this;
                            stackIn_64_0 = stackOut_63_0;
                            break L47;
                          }
                        }
                      }
                      stackOut_64_0 = this;
                      stackOut_64_1 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      break L46;
                    }
                    ((fc) this).field_A = stackIn_66_1 != 0;
                    ((fc) this).field_x = wa.field_j[gk.field_e];
                    break L43;
                  } else {
                    if (0 == ((fc) this).field_b) {
                      L48: {
                        if ((((fc) this).field_g.field_g.field_a ^ -1) < -10) {
                          break L48;
                        } else {
                          L49: {
                            if ((((fc) this).field_g.field_a.field_a ^ -1) > -2) {
                              break L49;
                            } else {
                              if (-((fc) this).field_d > ((fc) this).field_g.field_a.field_c) {
                                break L49;
                              } else {
                                break L48;
                              }
                            }
                          }
                          ((fc) this).field_O = true;
                          break L48;
                        }
                      }
                      L50: {
                        if (-15 > (((fc) this).field_g.field_g.field_a ^ -1)) {
                          break L50;
                        } else {
                          if (-1 <= (((fc) this).field_g.field_a.field_a ^ -1)) {
                            break L50;
                          } else {
                            if (3 > ((fc) this).field_g.field_b.field_a) {
                              ((fc) this).field_v = true;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                      L51: {
                        if (12 < ((fc) this).field_g.field_g.field_a) {
                          break L51;
                        } else {
                          if (-4 >= (((fc) this).field_g.field_b.field_a ^ -1)) {
                            break L51;
                          } else {
                            ((fc) this).field_A = true;
                            break L51;
                          }
                        }
                      }
                      if (((fc) this).field_g.field_g.field_a > 6) {
                        break L43;
                      } else {
                        if (1 != ((fc) this).field_g.field_a.field_a) {
                          break L43;
                        } else {
                          ((fc) this).field_E = true;
                          break L43;
                        }
                      }
                    } else {
                      if (1 == ((fc) this).field_b) {
                        L52: {
                          if (12 >= ((fc) this).field_g.field_g.field_a) {
                            ((fc) this).field_E = true;
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        if (((fc) this).field_g.field_g.field_a > 15) {
                          break L43;
                        } else {
                          if ((((fc) this).field_g.field_a.field_a ^ -1) <= -9) {
                            break L43;
                          } else {
                            ((fc) this).field_O = true;
                            break L43;
                          }
                        }
                      } else {
                        if (-3 == (((fc) this).field_b ^ -1)) {
                          L53: {
                            if (-16 != (((fc) this).field_g.field_g.field_a ^ -1)) {
                              break L53;
                            } else {
                              if (0 == ((fc) this).field_g.field_b.field_a) {
                                ((fc) this).field_A = true;
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                          }
                          L54: {
                            L55: {
                              if (((fc) this).field_g.field_g.field_a != 12) {
                                break L55;
                              } else {
                                if (-6 != (((fc) this).field_g.field_a.field_a ^ -1)) {
                                  break L55;
                                } else {
                                  ((fc) this).field_O = true;
                                  break L54;
                                }
                              }
                            }
                            if (((fc) this).field_g.field_g.field_a > 9) {
                              break L54;
                            } else {
                              if ((((fc) this).field_g.field_a.field_a ^ -1) != -7) {
                                break L54;
                              } else {
                                ((fc) this).field_E = true;
                                break L54;
                              }
                            }
                          }
                          if ((((fc) this).field_g.field_g.field_a ^ -1) < -14) {
                            break L43;
                          } else {
                            if (1 != ((fc) this).field_g.field_b.field_a) {
                              break L43;
                            } else {
                              ((fc) this).field_A = true;
                              break L43;
                            }
                          }
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                }
                L56: {
                  L57: {
                    if (-1 == ((fc) this).field_b) {
                      break L57;
                    } else {
                      if (((fc) this).field_J != 0) {
                        break L56;
                      } else {
                        break L57;
                      }
                    }
                  }
                  if (!((fc) this).field_g.a(((fc) this).field_A, ((fc) this).field_O, ((fc) this).field_v, ((fc) this).field_E, ((fc) this).field_x, (byte) -93)) {
                    L58: {
                      stackOut_72_0 = this;
                      stackOut_72_1 = 99;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      stackIn_73_0 = stackOut_72_0;
                      stackIn_73_1 = stackOut_72_1;
                      if (!((fc) this).field_g.b(param0 ^ -11497)) {
                        stackOut_74_0 = this;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = 4;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        stackIn_75_2 = stackOut_74_2;
                        break L58;
                      } else {
                        stackOut_73_0 = this;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = 2;
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        stackIn_75_2 = stackOut_73_2;
                        break L58;
                      }
                    }
                    ((fc) this).a((byte) stackIn_75_1, stackIn_75_2);
                    ((fc) this).field_g = ((fc) this).field_Q;
                    mh.b(8, param0 + 99);
                    break L56;
                  } else {
                    break L56;
                  }
                }
                ((fc) this).field_W = ((fc) this).field_W - 1;
                ((fc) this).field_R = ((fc) this).field_R + ((fc) this).field_g.field_i;
                ((fc) this).field_P = ((fc) this).field_P + 1;
                ((fc) this).field_a = ((fc) this).field_a + ((fc) this).field_g.field_i;
                break L1;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 94) {
            break L0;
          } else {
            boolean discarded$2 = ((fc) this).a((byte) 70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fc) this).field_K == 4) {
              break L2;
            } else {
              L3: {
                if (-1 == ((fc) this).field_b) {
                  break L3;
                } else {
                  if (((fc) this).field_J <= 0) {
                    break L3;
                  } else {
                    if ((((fc) this).field_K ^ -1) != -2) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != -265) {
            fc.a(-122);
        }
        field_e = null;
        field_z = null;
        field_S = null;
    }

    private final void a(byte param0, int param1, int param2) {
        if (0 <= ((fc) this).field_b) {
            return;
        }
        if (param0 != -107) {
            ((fc) this).field_x = true;
        }
        int var4 = 1 << param2;
        if (-1 != (sc.field_g & var4 ^ -1)) {
            return;
        }
        sc.field_g = sc.field_g | var4;
        ee.field_a = ee.field_a | var4;
        ((fc) this).field_G.b(127, (kd) (Object) new bd(param2));
        if (((fc) this).field_h) {
            return;
        }
        if (ki.a((byte) -102)) {
            rb.field_b.b(104, (kd) (Object) new vb(param2, param1, ((fc) this).field_U, ((fc) this).field_P, ((fc) this).field_W, ((fc) this).field_N));
        } else {
            vb discarded$0 = qd.a(((fc) this).field_N, 11803, ((fc) this).field_W, ((fc) this).field_P, param1, param2, 4, ((fc) this).field_U);
        }
    }

    private final void f(int param0) {
        int var3 = 0;
        bd var4 = null;
        StringBuilder var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vf var13 = null;
        int var14 = 0;
        int[] var18 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        vf stackIn_12_0 = null;
        vf stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        vf stackIn_13_0 = null;
        vf stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        vf stackIn_14_0 = null;
        vf stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        vf stackOut_11_0 = null;
        vf stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        vf stackOut_13_0 = null;
        vf stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        vf stackOut_12_0 = null;
        vf stackOut_12_1 = null;
        String stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        var14 = Lexicominos.field_L ? 1 : 0;
        a.a((byte) -123, ((fc) this).field_y);
        tl.a(false, ((fc) this).field_y);
        var18 = new int[4];
        var3 = 0;
        var4 = (bd) (Object) ((fc) this).field_y.a(true);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 19076) {
              var4 = (bd) (Object) ((fc) this).field_y.a(true);
              L1: while (true) {
                if (var4 == null) {
                  cf.a((fc) this, (byte) 50);
                  return;
                } else {
                  ca.a(param0 + -19064, var18, var4);
                  var5 = 1 + var18[0];
                  var6 = var18[0] - (var18[3] - 1);
                  L2: while (true) {
                    if ((var6 ^ -1) <= (var5 ^ -1)) {
                      var4 = (bd) (Object) ((fc) this).field_y.f(2);
                      continue L1;
                    } else {
                      var7 = var18[1] - -var18[2];
                      var8 = var18[1];
                      L3: while (true) {
                        if (var8 >= var7) {
                          var6++;
                          continue L2;
                        } else {
                          ((fc) this).field_w[var6][var8] = (char)0;
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L4: {
              ca.a(12, var18, var4);
              var5_ref = new StringBuilder(var18[3] * var18[2]);
              var6 = var18[0];
              var7 = var18[1];
              if (-2 == (var18[2] ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L4;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_5_0;
              if (1 != var18[3]) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L5;
              } else {
                stackOut_6_0 = 0;
                stackIn_8_0 = stackOut_6_0;
                break L5;
              }
            }
            var9 = stackIn_8_0;
            var10 = var18[2] * var18[3];
            var11 = 0;
            L6: while (true) {
              if ((var10 ^ -1) >= (var11 ^ -1)) {
                L7: {
                  var11 = 10 - -(24 * var18[1]);
                  var12 = -(24 * var18[0]) + 416;
                  stackOut_11_0 = null;
                  stackOut_11_1 = null;
                  stackOut_11_2 = var5_ref.toString();
                  stackOut_11_3 = var11;
                  stackOut_11_4 = var12;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  stackIn_13_4 = stackOut_11_4;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  stackIn_12_4 = stackOut_11_4;
                  if (1 != var18[2]) {
                    stackOut_13_0 = null;
                    stackOut_13_1 = null;
                    stackOut_13_2 = (String) (Object) stackIn_13_2;
                    stackOut_13_3 = stackIn_13_3;
                    stackOut_13_4 = stackIn_13_4;
                    stackOut_13_5 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    stackIn_14_5 = stackOut_13_5;
                    break L7;
                  } else {
                    stackOut_12_0 = null;
                    stackOut_12_1 = null;
                    stackOut_12_2 = (String) (Object) stackIn_12_2;
                    stackOut_12_3 = stackIn_12_3;
                    stackOut_12_4 = stackIn_12_4;
                    stackOut_12_5 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    break L7;
                  }
                }
                L8: {
                  new vf(stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5 != 0);
                  var13 = stackIn_14_0;
                  var13.a(50, (byte) -55, var3 * 24 + ((fc) this).field_M + 266, 371);
                  ((fc) this).field_B.a(-60, (kd) (Object) var13);
                  var3++;
                  if (var18[2] <= 1) {
                    var11 += 12;
                    var12 = var12 + mk.field_h.field_E / 2;
                    break L8;
                  } else {
                    var12 += 12;
                    var11 = var11 + mk.field_h.a('1');
                    break L8;
                  }
                }
                ((fc) this).field_j.a(-111, (kd) (Object) new gd(ib.field_g[var10] * ((fc) this).field_l, var11, var12));
                var4 = (bd) (Object) ((fc) this).field_y.f(param0 + -19074);
                continue L0;
              } else {
                StringBuilder discarded$1 = var5_ref.append((char)(((fc) this).field_w[var6][var7] & 255));
                var7 = var7 + var8;
                var6 = var6 + var9;
                var11++;
                continue L6;
              }
            }
          }
        }
    }

    final void d(int param0) {
        db var2 = null;
        String var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vf var10 = null;
        bd var11 = null;
        gd var12 = null;
        String var13 = null;
        db var14 = null;
        String var15 = null;
        int[] var19 = null;
        db stackIn_5_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_42_0 = 0;
        db stackOut_4_0 = null;
        db stackOut_3_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        ob.field_d.d(0, 0);
        if (((fc) this).field_g != null) {
          L0: {
            if (4 != ((fc) this).field_K) {
              stackOut_4_0 = ia.field_H;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = lg.field_c;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var14 = stackIn_5_0;
          var2 = var14;
          var3 = 416;
          var4 = 0;
          L1: while (true) {
            if ((var4 ^ -1) <= -19) {
              L2: {
                if (-5 != (((fc) this).field_K ^ -1)) {
                  break L2;
                } else {
                  var15 = ga.field_b;
                  var5 = 34;
                  var6 = 200;
                  var7 = 4 * ((fc) this).field_n + -832;
                  if (255 <= var7) {
                    eh.a(0, lg.field_c, var5, 0, var15, var6);
                    break L2;
                  } else {
                    if (var7 <= 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      L3: while (true) {
                        if ((var8 ^ -1) <= (var15.length() ^ -1)) {
                          break L2;
                        } else {
                          L4: {
                            if (32 == var15.charAt(var8)) {
                              break L4;
                            } else {
                              lg.field_c.b(var5, var6, var7);
                              bi.field_a.a(var15.charAt(var8), var5 + lg.field_c.field_p / 2, (lg.field_c.field_u - -pa.field_d) / 2 + var6, 0, var7);
                              break L4;
                            }
                          }
                          var5 += 24;
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              L5: {
                ((fc) this).field_g.a(true, 13551);
                if (-3 != (((fc) this).field_K ^ -1)) {
                  break L5;
                } else {
                  if (((fc) this).field_y == null) {
                    break L5;
                  } else {
                    var19 = new int[4];
                    var11 = (bd) (Object) ((fc) this).field_y.a(true);
                    L6: while (true) {
                      if (var11 == null) {
                        L7: {
                          if (25 < ((fc) this).field_n) {
                            stackOut_41_0 = 125 + -((fc) this).field_n;
                            stackIn_42_0 = stackOut_41_0;
                            break L7;
                          } else {
                            stackOut_40_0 = 75 + ((fc) this).field_n;
                            stackIn_42_0 = stackOut_40_0;
                            break L7;
                          }
                        }
                        var5 = stackIn_42_0 * 4096 / 100;
                        th.field_l[((fc) this).field_l].a(((fc) this).field_o, ((fc) this).field_V, 0, var5);
                        break L5;
                      } else {
                        ca.a(12, var19, var11);
                        this.a(var19, 371);
                        var11 = (bd) (Object) ((fc) this).field_y.f(2);
                        continue L6;
                      }
                    }
                  }
                }
              }
              var10 = (vf) (Object) ((fc) this).field_B.a(true);
              L8: while (true) {
                if (var10 == null) {
                  lf.g(0, 8, 311, 450);
                  if (param0 >= 46) {
                    var12 = (gd) (Object) ((fc) this).field_j.a(true);
                    L9: while (true) {
                      if (var12 == null) {
                        L10: {
                          lf.b();
                          if (((fc) this).field_D) {
                            bi.field_a.b("FPS: " + tj.field_i, 10, 3 * pa.field_d + 20, 0, -1);
                            bi.field_a.b("LPS: " + ij.field_j, 10, pa.field_d * 4 + 25, 0, -1);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      } else {
                        var12.a((byte) -34);
                        var12 = (gd) (Object) ((fc) this).field_j.f(2);
                        continue L9;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  var10.a(17517, ((fc) this).field_m, 0);
                  var10 = (vf) (Object) ((fc) this).field_B.f(2);
                  continue L8;
                }
              }
            } else {
              var5 = 10;
              var6 = 0;
              L11: while (true) {
                if (var6 >= 12) {
                  var3 -= 24;
                  var4++;
                  continue L1;
                } else {
                  L12: {
                    if (((fc) this).field_w[var4][var6] != 0) {
                      L13: {
                        if ((((fc) this).field_K ^ -1) != -5) {
                          stackOut_13_0 = 255;
                          stackIn_14_0 = stackOut_13_0;
                          break L13;
                        } else {
                          stackOut_12_0 = 64 * var4 + 255 + -(4 * ((fc) this).field_n);
                          stackIn_14_0 = stackOut_12_0;
                          break L13;
                        }
                      }
                      var7 = stackIn_14_0;
                      if (-256 >= (var7 ^ -1)) {
                        var14 = var2;
                        if (mg.field_B) {
                          var14.d(var5, var3 - ((fc) this).field_F[var4][var6]);
                          break L12;
                        } else {
                          eb.a(89, ((fc) this).field_m, 0, var14, ((fc) this).field_w[var4][var6], -((fc) this).field_F[var4][var6] + var3, var5);
                          break L12;
                        }
                      } else {
                        if ((var7 ^ -1) < -1) {
                          var14 = var2;
                          var14.b(var5, -((fc) this).field_F[var4][var6] + var3, var7);
                          if (!mg.field_B) {
                            ((fc) this).field_m.field_f.a(((fc) this).field_w[var4][var6], var14.field_p / 2 + var5, (((fc) this).field_m.field_b + var14.field_u) / 2 + var3, 0, var7);
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var5 += 24;
                  var6++;
                  continue L11;
                }
              }
            }
          }
        } else {
          var13 = "LOADING";
          var3_ref = "LANGUAGE...";
          var4 = 24 * Math.max(var13.length(), var3_ref.length()) - -16;
          var5 = 64;
          var6 = (-var4 + 311) / 2;
          var7 = (450 + -var5) / 2;
          lf.a(var6, var7, var4, var5, 0);
          eh.a(0, lg.field_c, 8 + var6 - -48, 0, var13, var7 - -8);
          eh.a(0, lg.field_c, var6 - -8, 0, var3_ref, 24 + (8 + var7));
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        gd var2_ref_gd = (gd) (Object) ((fc) this).field_j.a(true);
        while (var2_ref_gd != null) {
            var2_ref_gd.c((byte) -55);
            ((fc) this).field_i = ((fc) this).field_i ^ var2_ref_gd.field_n;
            ((fc) this).field_f = ((fc) this).field_f ^ var2_ref_gd.field_n;
            var2_ref_gd = (gd) (Object) ((fc) this).field_j.f(2);
        }
        if ((((fc) this).field_r ^ -1) > (((fc) this).field_J ^ -1)) {
            var2 = (((fc) this).field_J + -((fc) this).field_r) / 30;
            if (!(-2 >= (var2 ^ -1))) {
                var2 = 1;
            }
            ((fc) this).field_r = ((fc) this).field_r + var2;
        }
        if ((((fc) this).field_r ^ -1) == (((fc) this).field_J ^ -1)) {
            th.field_o[2].e(0);
        } else {
            na.a(2, true);
        }
        if (param0 != 2) {
            int discarded$0 = ((fc) this).a(101, 119);
        }
    }

    private final void a(String[] param0, byte param1, int param2, String param3) {
        int var5 = 0;
        char[] var6_ref_char__ = null;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = Lexicominos.field_L ? 1 : 0;
        ((fc) this).field_g = new ha((fc) this, param2, new char[4]);
        for (var5 = 0; (param0.length ^ -1) < (var5 ^ -1); var5++) {
            var6_ref_char__ = ((fc) this).field_w[-1 + param0.length + -var5];
            var7 = param0[var5].toUpperCase();
            for (var8 = 0; (var7.length() ^ -1) < (var8 ^ -1); var8++) {
                var9 = var7.charAt(var8);
                if (65 <= var9) {
                    if (!(var9 > 90)) {
                        var6_ref_char__[var8] = (char)var9;
                    }
                }
            }
        }
        int var6 = 29 % ((-65 - param1) / 33);
    }

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        db[] var6 = null;
        db var7 = null;
        db[] var8 = null;
        db var9 = null;
        db var9_ref = null;
        bd var10 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        var6 = kf.field_A;
        var3 = 0;
        L0: while (true) {
          if ((var6.length ^ -1) >= (var3 ^ -1)) {
            L1: {
              lf.g(125, 54, 221, 102);
              if (-1 <= (((fc) this).field_L ^ -1)) {
                break L1;
              } else {
                if ((((fc) this).field_L ^ -1) <= -31) {
                  break L1;
                } else {
                  if (((fc) this).field_L % 10 < 5) {
                    lf.a(0, 0, 640, 480, 16777215);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              ((fc) this).field_Q.a(false, 13551);
              lf.b();
              ((fc) this).c((byte) 72);
              lf.g(60, 266 - -((fc) this).field_M + 120, 252, 450);
              va.field_m.d(0, 0);
              if (param0 > 54) {
                break L2;
              } else {
                ((fc) this).field_r = -50;
                break L2;
              }
            }
            var8 = kf.field_A;
            var3 = 0;
            L3: while (true) {
              if (var8.length <= var3) {
                L4: {
                  lf.b();
                  oh.a(183, lg.field_c, false, Integer.toString(Math.abs(((fc) this).field_r)), 0, 230);
                  if (((fc) this).field_s <= 0) {
                    break L4;
                  } else {
                    if (((fc) this).field_s >= 30) {
                      break L4;
                    } else {
                      if (5 > ((fc) this).field_s % 10) {
                        lf.a(53, 183, 48, 24, 16777215);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  oh.a(183, lg.field_c, false, Integer.toString(((fc) this).field_d), 0, 77);
                  var10 = (bd) (Object) ((fc) this).field_G.a(true);
                  if (var10 != null) {
                    L6: {
                      var4 = 0;
                      if (80 > ((fc) this).field_H) {
                        var3 = -32 + ((fc) this).field_H / 2;
                        break L6;
                      } else {
                        if (-231 < (((fc) this).field_H ^ -1)) {
                          L7: {
                            var3 = 8;
                            if (94 >= ((fc) this).field_H) {
                              break L7;
                            } else {
                              if (-109 >= (((fc) this).field_H ^ -1)) {
                                break L7;
                              } else {
                                var4 = 1;
                                break L7;
                              }
                            }
                          }
                          if (-123 <= (((fc) this).field_H ^ -1)) {
                            break L6;
                          } else {
                            if (((fc) this).field_H >= 136) {
                              break L6;
                            } else {
                              var4 = 1;
                              break L6;
                            }
                          }
                        } else {
                          var3 = -(((fc) this).field_H / 2) + 123;
                          break L6;
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L5;
                    } else {
                      ef.field_d[var10.field_h].c(265, var3);
                      bi.field_a.c(df.field_d[var10.field_h], 260, var3 - -bi.field_a.field_E, 0, -1);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                var9_ref = var8[var3];
                var9_ref.d(0, 0);
                var3++;
                continue L3;
              }
            }
          } else {
            var7 = var6[var3];
            var9 = var7;
            var9 = var7;
            var7.d(0, 0);
            var3++;
            continue L0;
          }
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var3 = -3 + (10 - -(24 * param0[1]));
          var4 = 413 + -(param0[0] * 24);
          if (-2 != (param0[2] ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          jj.field_f[var5].d(var3, var4);
          if (-2 == (param0[2] ^ -1)) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 24;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 == 371) {
            break L2;
          } else {
            var11 = null;
            this.a((String[]) null, (byte) 53, 106, (String) null);
            break L2;
          }
        }
        L3: {
          if ((param0[3] ^ -1) != -2) {
            stackOut_10_0 = 24;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var7 = stackIn_11_0;
          if (param0[2] == 1) {
            stackOut_13_0 = param0[3];
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = param0[2];
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        var8 = stackIn_14_0;
        var9 = 1;
        L5: while (true) {
          if ((var9 ^ -1) <= (var8 + -1 ^ -1)) {
            jj.field_f[2 + var5].d(var3 - -var6, var7 + var4);
            return;
          } else {
            var3 = var3 + var6;
            var4 = var4 + var7;
            jj.field_f[1 + var5].d(var3, var4);
            var9++;
            continue L5;
          }
        }
    }

    final static void a(ng param0, char[][] param1, int[][] param2, int param3) {
        int var5 = 0;
        bd var6_ref_bd = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        ij var4_ref_ij = (ij) (Object) param0.a(true);
        while (var4_ref_ij != null) {
            var5 = var4_ref_ij.field_q;
            var6_ref_bd = (bd) (Object) var4_ref_ij.field_s.a(true);
            while (var6_ref_bd != null) {
                param2[(var6_ref_bd.field_h >> -1316673200) + -var5][vg.a(65535, var6_ref_bd.field_h)] = var5 * 24;
                var6_ref_bd = (bd) (Object) var4_ref_ij.field_s.f(param3 ^ 11880);
            }
            var4_ref_ij = (ij) (Object) param0.f(2);
        }
        if (param3 != 11882) {
            return;
        }
        int var4 = param1.length;
        var5 = param1[0].length;
        for (var6 = 0; var6 < var4; var6++) {
            for (var7 = 0; (var5 ^ -1) < (var7 ^ -1); var7++) {
                if (0 != param2[var6][var7]) {
                    var8 = var6 + param2[var6][var7] / 24;
                    param1[var6][var7] = param1[var8][var7];
                    param1[var8][var7] = (char)0;
                }
            }
        }
    }

    final void c(byte param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = -6 / ((-30 - param0) / 36);
        vf var3 = (vf) (Object) ((fc) this).field_B.a(true);
        while (var3 != null) {
            if ((var3.field_i ^ -1) <= -372) {
                // if_icmpgt L82
                var3.b((byte) -121);
            } else {
                var3.a(17517, ((fc) this).field_m, -311);
            }
            var3 = (vf) (Object) ((fc) this).field_B.f(2);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != ((fc) this).field_K) {
          L0: {
            var3 = ((fc) this).field_K;
            if ((var3 ^ -1) != -2) {
              break L0;
            } else {
              ((fc) this).field_l = 0;
              break L0;
            }
          }
          L1: {
            ((fc) this).field_K = param1;
            if (param0 == 99) {
              break L1;
            } else {
              this.c(26);
              break L1;
            }
          }
          L2: {
            var3 = ((fc) this).field_K;
            if ((var3 ^ -1) != -2) {
              if ((var3 ^ -1) != -3) {
                if (var3 == 3) {
                  ((fc) this).field_p = 1;
                  break L2;
                } else {
                  if (var3 == 4) {
                    L3: {
                      if ((((fc) this).field_J ^ -1) >= -1) {
                        break L3;
                      } else {
                        if (ki.a((byte) -115)) {
                          break L3;
                        } else {
                          if (0 != (((fc) this).field_b ^ -1)) {
                            break L3;
                          } else {
                            if (((fc) this).field_h) {
                              break L3;
                            } else {
                              ki.field_d = gl.a(65526, 9, ((fc) this).field_i, 3, ((fc) this).field_f, (byte) 56, ((fc) this).field_R, new int[1], ((fc) this).field_a);
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    nh.a(0, 1000000, 7, true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                ((fc) this).field_y = null;
                break L2;
              }
            } else {
              if ((vb.field_i ^ -1) > -3) {
                break L2;
              } else {
                L4: {
                  if ((((fc) this).field_X.length() ^ -1) < -235) {
                    ((fc) this).field_C = ((fc) this).field_X.toString();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((fc) this).field_X = new StringBuilder(266);
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    fc(Lexicominos param0, oj param1, Random param2) {
        L0: {
          ((fc) this).field_C = "";
          ((fc) this).field_X = new StringBuilder(266);
          ((fc) this).field_T = false;
          ((fc) this).field_W = 274776128;
          ((fc) this).field_P = 17239300;
          ((fc) this).field_D = false;
          ((fc) this).field_U = 0;
          ((fc) this).field_N = -17;
          ((fc) this).field_G = new ng();
          ((fc) this).field_h = false;
          ((fc) this).field_F = new int[18][12];
          ((fc) this).field_H = 0;
          ((fc) this).field_w = new char[18][12];
          ((fc) this).field_K = 1;
          ((fc) this).field_d = 1;
          ((fc) this).field_B = new ng();
          ((fc) this).field_M = 0;
          ((fc) this).field_j = new ng();
          ((fc) this).field_s = 4096;
          ((fc) this).field_l = 0;
          ((fc) this).field_b = -1;
          ((fc) this).field_L = 4096;
          ((fc) this).field_a = 434781;
          ((fc) this).field_m = param1;
          ((fc) this).field_u = param0;
          ((fc) this).field_f = 1342181376;
          ((fc) this).field_i = 2162904;
          ((fc) this).field_I = param2;
          ((fc) this).field_R = 268870237 - -param1.field_i;
          ((fc) this).field_g = new ha((fc) this);
          ((fc) this).field_Q = new ha((fc) this);
          if ((vb.field_i ^ -1) > -3) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        ee.field_a = 0;
        fg.field_b = false;
    }

    static {
    }
}
