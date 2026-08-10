/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        int var2;
        int var3;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.b((byte) 119);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = oe.field_a;
            if (0 != var2) {
              if ((var2 ^ -1) == -2) {
                this.a(new String[]{"RU", "TO", "SE", "SE", "XXO", "XXN"}, (byte) -100, 0, "NOTT");
                break L2;
              } else {
                if (2 != var2) {
                  if (-4 == (var2 ^ -1)) {
                    this.a(new String[]{"  F", "  EX", "   CHO", "   REK", "   HUS", "   ERY", "  AQXX", "  LXXX"}, (byte) -117, 0, "ETTE");
                    break L2;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      this.a(new String[]{" MISS", " ENTS", " AWKS", " CHOS", "SXXXX"}, (byte) 14, 0, "ACHE");
                      break L2;
                    } else {
                      if ((var2 ^ -1) == -6) {
                        this.a(new String[]{" T", " A", " KX", "  RROR", "  ILLS", "  TARE", "  RIAL", " EXXXX", " AXXXX", " LXXXX"}, (byte) 68, 0, "ESST");
                        break L2;
                      } else {
                        if ((var2 ^ -1) != -7) {
                          if (-8 != (var2 ^ -1)) {
                            if (-9 != (var2 ^ -1)) {
                              if (var2 != 9) {
                                if (10 == var2) {
                                  this.a(new String[]{"  POSTLES", "  IFELESS", "  IAISONS", "  LLUSIVE", " NQ", " OX", " LX", " EX", " UX", " MX"}, (byte) -113, 0, "ALLI");
                                  break L2;
                                } else {
                                  if ((var2 ^ -1) == -12) {
                                    this.a(new String[]{" L", " I", " T", " T", " O", " RX", "  POSTLES", "  IFELESS", "  IAISONS", "  LLUSIVE", " NQ", " OX", " LX", " EX", " UX", " MX"}, (byte) 54, 0, "ALLI");
                                    break L2;
                                  } else {
                                    if ((var2 ^ -1) != -13) {
                                      if (13 == var2) {
                                        this.a(new String[]{"   XP  XP", " IED IED IED"}, (byte) -107, 0, "PPPP");
                                        break L2;
                                      } else {
                                        if (-15 == (var2 ^ -1)) {
                                          this.a(new String[]{" XP  P", " X IECE", " IECE IECE"}, (byte) 125, 0, "PPPP");
                                          break L2;
                                        } else {
                                          if (15 != var2) {
                                            if (16 != var2) {
                                              if (var2 == 17) {
                                                this.a(new String[]{"  PI", "  X", " XP NOCHLE", " X INOCHLE", " INOCHLE X"}, (byte) 29, 0, "PPPP");
                                                break L2;
                                              } else {
                                                if (var2 != 18) {
                                                  if (var2 != 19) {
                                                    if (20 != var2) {
                                                      if (-22 == (var2 ^ -1)) {
                                                        this.a(new String[]{" KUNKSU", "   USK NKSX", " SK NKSK  X", " X SKUN S X"}, (byte) -9, 0, "SSSS");
                                                        break L2;
                                                      } else {
                                                        if (22 == var2) {
                                                          this.a(new String[]{"TETANU E", "   UDUK DOM", " UD KEDOM", "D KEDOM"}, (byte) -125, 0, "SSSS");
                                                          break L2;
                                                        } else {
                                                          if (var2 == 23) {
                                                            this.a(new String[]{" STR    HT", "  SSTRENG H", "X  TRENGTHT", "X X STRENG H"}, (byte) 50, 0, "ENGT");
                                                            break L2;
                                                          } else {
                                                            if (24 != var2) {
                                                              if ((var2 ^ -1) == -26) {
                                                                this.a(new String[]{"    KSK", " KSKUN SXXX", "S UNKSU   X", "XX USK NKSX", "XSK NKSK  X", "XX SKUN S X"}, (byte) -115, 0, "SKUN");
                                                                break L2;
                                                              } else {
                                                                oe.field_a = oe.field_a + 1;
                                                                break L1;
                                                              }
                                                            } else {
                                                              this.a(new String[]{"       XXXX", " KS    S  X", "S UNKSU   X", "XX USK NKSX", "XSK NKSK", "XX SKUN S"}, (byte) 2, 0, "KUNK");
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      this.a(new String[]{"  ASLAI", "SL INA", " XXSL INE", "  X  XPI CE"}, (byte) 17, 0, "NNNN");
                                                      break L2;
                                                    }
                                                  } else {
                                                    this.a(new String[]{"P EDI", "XXXP EDI", "  XXXXP EDE", "     XXXPI D"}, (byte) -112, 0, "IIII");
                                                    break L2;
                                                  }
                                                } else {
                                                  this.a(new String[]{"P EI", "XXP EI", " XXXP EI", "   XXXP E"}, (byte) 11, 0, "IIII");
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              this.a(new String[]{"    JP", " JP J RIESTS", " J RIESTS J", " RIESTS J"}, (byte) -128, 0, "PPPP");
                                              break L2;
                                            }
                                          } else {
                                            this.a(new String[]{" XP   P", " X IECES", " IECES IECES"}, (byte) -101, 0, "PPPP");
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      this.a(new String[]{"  XXX XXX", "  X P X P", " IE  IE  IE"}, (byte) -128, 0, "PPPP");
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                this.a(new String[]{" L", " I", " M", " I", " TX", "  XCEEDS", "  IEHARD", "  EXICON", "  NDOORS", " NX", " EX", " AX", " GX", " EX"}, (byte) -101, 0, "EDLI");
                                break L2;
                              }
                            } else {
                              this.a(new String[]{"  XCEEDS", "  IEHARD", "  EXICON", "  NDOORS", " NX", " EX", " AX", " GX", " EX"}, (byte) -121, 0, "EDLI");
                              break L2;
                            }
                          } else {
                            this.a(new String[]{" S", " T", " E", " AX", "  IMITS", "  AINTS", "  RITES", "  AISIN", " IX", " TX", " E", " S"}, (byte) -121, 0, "LSWR");
                            break L2;
                          }
                        } else {
                          this.a(new String[]{" PECIE", " EDEMA", " DDITY", " ORPID", "HXXXXX", "EXXXXX"}, (byte) -102, 0, "SOOT");
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  this.a(new String[]{"FAI", "EAS", "ART", "RAI"}, (byte) 117, 0, "LYYL");
                  break L2;
                }
              }
            } else {
              this.a(new String[]{"XU", "TO", "SE", "SE", "XXO", "XXN"}, (byte) 110, 0, "NOTT");
              break L2;
            }
          }
          oe.field_a = oe.field_a + 1;
          break L1;
        }
    }

    private final void c(int param0) {
        bd var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        var7 = Lexicominos.field_L ? 1 : 0;
        var11 = new int[4];
        var3 = (bd) ((Object) this.field_y.a(true));
        var4 = 77 % ((param0 - 52) / 55);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              ca.a(12, var11, var3);
              var5 = var11[2] * var11[3];
              var6 = ib.field_g[var5] * this.field_l;
              this.field_a = this.field_a - (var6 << -604734619);
              this.field_J = this.field_J + var6;
              this.field_R = this.field_R + (var6 << 2138757829);
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
            var3 = (bd) ((Object) this.field_y.f(2));
            continue L0;
          }
        }
    }

    final void b(int param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int statePc = 0;
        int var3 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
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
        char[][] var27 = null;
        char[][] var28 = null;
        char[][] var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    if (param0 < -35) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    oe.field_a = oe.field_a - 1;
                    var3 = 0;
                    if ((param1 ^ -1) != -1) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var27 = this.field_w;
                    var5 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var27.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var19 = var27[var5];
                    var12 = var19;
                    var6 = var12;
                    var7 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var7 ^ -1) <= (var19.length ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6[var7] = (char)0;
                    var7++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 8: {
                    var5++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 9: {
                    this.field_w[0][2] = (char)80;
                    this.field_w[0][3] = (char)73;
                    this.field_w[1][2] = bj.field_a.charAt(2);
                    this.field_w[2][2] = bj.field_a.charAt(1);
                    this.field_g = new ha((fc) (this), 6, new char[]{bj.field_a.charAt(0), (char)65, (char)72, (char)76});
                    statePc = 46;
                    continue stateLoop;
                }
                case 10: {
                    if (param1 == 1) {
                        statePc = 39;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-3 != (param1 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var28 = this.field_w;
                    var5 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var5 ^ -1) <= (var28.length ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var21 = var28[var5];
                    var14 = var21;
                    var6 = var14;
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var7 ^ -1) <= (var21.length ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6[var7] = (char)0;
                    var7++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 17: {
                    var5++;
                    statePc = 13;
                    continue stateLoop;
                }
                case 18: {
                    this.field_w[0][4] = jf.field_G.charAt(1);
                    this.field_w[0][5] = jf.field_G.charAt(2);
                    this.field_w[0][6] = jf.field_G.charAt(3);
                    this.field_w[0][7] = jf.field_G.charAt(4);
                    this.field_w[1][3] = jf.field_G.charAt(0);
                    this.field_w[1][4] = ch.field_d.charAt(0);
                    if ((ri.field_e ^ -1) == -3) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_w[1][6] = ch.field_d.charAt(2);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    this.field_w[1][7] = ch.field_d.charAt(3);
                    this.field_w[1][8] = ch.field_d.charAt(4);
                    this.field_w[2][3] = (char)70;
                    this.field_w[2][5] = ch.field_d.charAt(1);
                    if (2 == ri.field_e) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_w[2][6] = ch.field_d.charAt(2);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    this.field_w[3][3] = c.field_n.charAt(0);
                    this.field_w[3][4] = c.field_n.charAt(1);
                    this.field_w[3][5] = c.field_n.charAt(2);
                    this.field_g = new ha((fc) (this), 3, new char[]{c.field_n.charAt(4), c.field_n.charAt(3), (char)67, (char)80});
                    statePc = 46;
                    continue stateLoop;
                }
                case 24: {
                    if ((param1 ^ -1) != -4) {
                        statePc = 38;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var15 = new String[]{"NZ          ", " ST      NO ", " DTCCG  IA E", "  O  FA EQNO", " OKSG NTA S ", "SM    B  ED ", "RT    LS D  ", " P AN  LCW  ", " RS AD LTZ  ", "  L  LHA AXF", "  L    ECZ  ", "  SI  LWMLE ", "   C GW TPS ", "ESJSI DO NB ", "E  SD  W Z  ", "DE AWO ORRST", "LP  B ZDDICN"};
                    var5 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = var15.length;
                    stackIn_27_1 = var5;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 <= stackIn_27_1) {
                        statePc = 37;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var6 = this.field_w[-var5 + var15.length + -1];
                    var7_ref_String = var15[var5].toUpperCase();
                    var8 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var7_ref_String.length() <= var8) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var9 = var7_ref_String.charAt(var8);
                    stackIn_27_0 = var9 ^ -1;
                    stackIn_31_0 = stackIn_27_0;
                    stackIn_27_1 = -66;
                    stackIn_31_1 = stackIn_27_1;
                    if (false) {
                        statePc = 27;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 > stackIn_31_1) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (90 >= var9) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var6[var8] = (char)var9;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var8++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 36: {
                    var5++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 37: {
                    this.field_g = new ha((fc) (this), 1, new char[]{(char)68, (char)87, (char)73, (char)78});
                    this.field_Q = new ha((fc) (this), 6, new char[]{(char)84, (char)66, (char)86, (char)83});
                    statePc = 46;
                    continue stateLoop;
                }
                case 38: {
                    var3 = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 39: {
                    var29 = this.field_w;
                    var5 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var29.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var23 = var29[var5];
                    var17 = var23;
                    var6 = var17;
                    var7 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if ((var7 ^ -1) <= (var23.length ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var6[var7] = (char)0;
                    var7++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 44: {
                    var5++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 45: {
                    this.field_w[0][6] = md.field_L.charAt(0);
                    this.field_w[0][7] = md.field_L.charAt(1);
                    this.field_w[0][9] = md.field_L.charAt(3);
                    this.field_w[0][10] = md.field_L.charAt(4);
                    this.field_w[0][11] = md.field_L.charAt(5);
                    this.field_w[1][6] = (char)84;
                    this.field_w[1][11] = (char)69;
                    this.field_w[1][5] = (char)72;
                    this.field_g = new ha((fc) (this), 4, new char[]{(char)83, (char)80, (char)82, md.field_L.charAt(2)});
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var3 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_d = 3;
                    this.field_b = param1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -2) {
            this.field_f = 49;
        }
        return rh.a(param0 ^ -14817, this.field_I, param1);
    }

    final void e(int param0) {
        int fieldTemp$0 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
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
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_128_0 = 0;
        char stackIn_132_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_197_0 = 0;
        Lexicominos stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        int stackIn_212_2 = 0;
        Lexicominos stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        int stackIn_213_2 = 0;
        Lexicominos stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        int stackIn_214_2 = 0;
        int stackIn_214_3 = 0;
        int stackIn_218_0 = 0;
        char stackOut_131_0;
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = null;
                    var17 = null;
                    var13 = Lexicominos.field_L ? 1 : 0;
                    if (!this.field_T) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (param0 == 1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    this.b(2);
                    if (null == this.field_G.a(true)) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    fieldTemp$0 = this.field_H + 1;
                    this.field_H = this.field_H + 1;
                    if (335 != fieldTemp$0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_H = 0;
                    this.field_G.a((byte) 74);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this.field_K;
                    if (var5 != 1) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-3 == (var5 ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((var5 ^ -1) == -4) {
                        statePc = 187;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((var5 ^ -1) == -5) {
                        statePc = 207;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = 0;
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = 1000000 - -(40000 * (-1 + this.field_d));
                    stackIn_14_1 = stackIn_15_1;
                    if (fg.field_b) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = stackIn_14_0;
                    stackIn_16_1 = stackIn_14_1;
                    stackIn_16_2 = e.field_q;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = stackIn_15_0;
                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = 5;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    nh.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, false);
                    this.field_A = false;
                    this.field_O = false;
                    this.field_E = false;
                    this.field_v = false;
                    this.field_L = this.field_L + 1;
                    this.field_s = this.field_s + 1;
                    this.field_x = false;
                    if (0 > this.field_b) {
                        statePc = 56;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (0 == this.field_b) {
                        statePc = 40;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (1 == this.field_b) {
                        statePc = 34;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-3 == (this.field_b ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-16 != (this.field_g.field_g.field_a ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (0 == this.field_g.field_b.field_a) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_A = true;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (this.field_g.field_g.field_a != 12) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-6 != (this.field_g.field_a.field_a ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_O = true;
                    statePc = 31;
                    continue stateLoop;
                }
                case 28: {
                    if (this.field_g.field_g.field_a > 9) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((this.field_g.field_a.field_a ^ -1) != -7) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_E = true;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((this.field_g.field_g.field_a ^ -1) < -14) {
                        statePc = 67;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (1 != this.field_g.field_b.field_a) {
                        statePc = 67;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_A = true;
                    statePc = 67;
                    continue stateLoop;
                }
                case 34: {
                    if (12 >= this.field_g.field_g.field_a) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_E = true;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (this.field_g.field_g.field_a > 15) {
                        statePc = 67;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((this.field_g.field_a.field_a ^ -1) <= -9) {
                        statePc = 67;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.field_O = true;
                    statePc = 67;
                    continue stateLoop;
                }
                case 40: {
                    if ((this.field_g.field_g.field_a ^ -1) < -10) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((this.field_g.field_a.field_a ^ -1) > -2) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-this.field_d > this.field_g.field_a.field_c) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_O = true;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-15 > (this.field_g.field_g.field_a ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (-1 <= (this.field_g.field_a.field_a ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (3 > this.field_g.field_b.field_a) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_v = true;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (12 < this.field_g.field_g.field_a) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-4 >= (this.field_g.field_b.field_a ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_A = true;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (this.field_g.field_g.field_a > 6) {
                        statePc = 67;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (1 != this.field_g.field_a.field_a) {
                        statePc = 67;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_E = true;
                    statePc = 67;
                    continue stateLoop;
                }
                case 56: {
                    this.field_O = wa.field_j[97];
                    this.field_v = wa.field_j[96];
                    stackIn_59_0 = this;
                    stackIn_57_0 = stackIn_59_0;
                    if (wa.field_j[99]) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = this;
                    stackIn_58_0 = stackIn_60_0;
                    if (!wa.field_j[83]) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = this;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = this;
                    stackIn_61_1 = 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = this;
                    stackIn_61_1 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    ((fc) (this)).field_E = stackIn_61_1 != 0;
                    stackIn_64_0 = this;
                    stackIn_62_0 = stackIn_64_0;
                    if (wa.field_j[sa.field_c]) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = this;
                    stackIn_63_0 = stackIn_65_0;
                    if (!wa.field_j[98]) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = this;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = this;
                    stackIn_66_1 = 1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = this;
                    stackIn_66_1 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    ((fc) (this)).field_A = stackIn_66_1 != 0;
                    this.field_x = wa.field_j[gk.field_e];
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (-1 == this.field_b) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_J != 0) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (!this.field_g.a(this.field_A, this.field_O, this.field_v, this.field_E, this.field_x, (byte) -93)) {
                        statePc = 72;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = this;
                    stackIn_73_0 = stackIn_74_0;
                    stackIn_74_1 = 99;
                    stackIn_73_1 = stackIn_74_1;
                    if (!this.field_g.b(param0 ^ -11497)) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = this;
                    stackIn_75_1 = stackIn_73_1;
                    stackIn_75_2 = 2;
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = this;
                    stackIn_75_1 = stackIn_74_1;
                    stackIn_75_2 = 4;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    this.a((byte) stackIn_75_1, stackIn_75_2);
                    this.field_g = this.field_Q;
                    mh.b(8, param0 + 99);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    this.field_W = this.field_W - 1;
                    this.field_R = this.field_R + this.field_g.field_i;
                    this.field_P = this.field_P + 1;
                    this.field_a = this.field_a + this.field_g.field_i;
                    statePc = 221;
                    continue stateLoop;
                }
                case 77: {
                    if (this.field_b >= 0) {
                        statePc = 79;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 79: {
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
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (this.field_y != null) {
                        statePc = 181;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (this.field_X.length() != 0) {
                        statePc = 91;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var5 = 17;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (-1 < (var5 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var6 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (-13 >= (var6 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_88_0 = this.field_X;
                    stackIn_87_0 = stackIn_88_0;
                    if (0 == this.field_w[var5][var6]) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = (StringBuilder) ((Object) stackIn_87_0);
                    stackIn_89_1 = 255 & this.field_w[var5][var6];
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (StringBuilder) ((Object) stackIn_88_0);
                    stackIn_89_1 = 46;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    discarded$1 = ((StringBuilder) (Object) stackIn_89_0).append((char)stackIn_89_1);
                    var6++;
                    statePc = 85;
                    continue stateLoop;
                }
                case 90: {
                    discarded$2 = this.field_X.append('|');
                    var5--;
                    statePc = 83;
                    continue stateLoop;
                }
                case 91: {
                    this.field_y = this.field_m.a(this.field_w, 17161);
                    this.field_t = this.field_t + this.field_y.b(param0 + 1);
                    if (-1 != (this.field_y.b(param0 + 1) ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_c = 0;
                    this.field_Q = new ha((fc) (this));
                    this.field_L = 0;
                    if (this.field_d >= 16) {
                        statePc = 104;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var5 = (this.field_t >> -1538622301) + 1;
                    if ((this.field_d ^ -1) <= (var5 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_d = this.field_d + 1;
                    this.field_s = 0;
                    if ((this.field_d & 1 ^ -1) != -2) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ki.a(1000000 - -(this.field_d * 40000) - 40000, this.field_I, -104);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (-6 == (this.field_d ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (10 != this.field_d) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.a((byte) -107, 243, 12);
                    statePc = 104;
                    continue stateLoop;
                }
                case 99: {
                    if ((this.field_d ^ -1) == -16) {
                        statePc = 102;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (20 != this.field_d) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.a((byte) -107, 241, 14);
                    statePc = 104;
                    continue stateLoop;
                }
                case 102: {
                    this.a((byte) -107, 242, 13);
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    this.a((byte) -107, 244, 11);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var5 = 0;
                    var6 = 15;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = 18;
                    stackIn_106_1 = var6;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 <= stackIn_106_1) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var7 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (-13 >= (var7 ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackIn_106_0 = -1;
                    stackIn_110_0 = stackIn_106_0;
                    stackIn_106_1 = this.field_w[var6][var7] ^ -1;
                    stackIn_110_1 = stackIn_106_1;
                    if (false) {
                        statePc = 106;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (stackIn_110_0 != stackIn_110_1) {
                        statePc = 112;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var5 = 1;
                    statePc = 115;
                    continue stateLoop;
                }
                case 113: {
                    var7++;
                    statePc = 108;
                    continue stateLoop;
                }
                case 114: {
                    var6++;
                    statePc = 105;
                    continue stateLoop;
                }
                case 115: {
                    if (var5 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (!fg.field_b) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var5 != 0) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (!fg.field_b) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    nh.a(0, 1000000 - -((this.field_d + -1) * 40000), e.field_q, true);
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    nh.a(param0 + -1, 40000 * (this.field_d - 1) + 1000000, 5, false);
                    this.field_k = true;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    fg.field_b = var5 != 0;
                    if ((32768 & sc.field_g ^ -1) != -1) {
                        statePc = 139;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (!this.field_k) {
                        statePc = 139;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (!fg.field_b) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    this.a((byte) 99, 1);
                    statePc = 221;
                    continue stateLoop;
                }
                case 126: {
                    var6 = 1;
                    var7 = 12;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = -16;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 >= (var7 ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var8 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var8 >= 12) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = this.field_w[var7][var8];
                    stackIn_128_0 = stackOut_131_0;
                    stackIn_132_0 = stackOut_131_0;
                    if (false) {
                        statePc = 128;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (stackIn_132_0 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var6 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 134: {
                    var8++;
                    statePc = 130;
                    continue stateLoop;
                }
                case 135: {
                    var7++;
                    statePc = 127;
                    continue stateLoop;
                }
                case 136: {
                    if (var6 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 138: {
                    this.a((byte) -107, 240, 15);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    this.a((byte) 99, 1);
                    statePc = 221;
                    continue stateLoop;
                }
                case 140: {
                    mh.b(0, 100);
                    this.field_l = this.field_l + this.field_y.b(2);
                    if ((th.field_l.length ^ -1) < (this.field_l ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_l = th.field_l.length + -1;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (this.field_l < 3) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    this.a((byte) -107, 251, 4);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (-5 >= (this.field_l ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.a((byte) -107, 250, 5);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (5 > this.field_l) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    this.a((byte) -107, 249, 6);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (6 <= this.field_l) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    this.a((byte) -107, 248, 7);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    this.field_c = this.field_c + 1;
                    if (this.field_c < 3) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    this.a((byte) -107, 247, 8);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-5 < (this.field_c ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.a((byte) -107, 246, 9);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (-6 < (this.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    this.a((byte) -107, 245, 10);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var5 = 2147483647;
                    var6 = -2147483648;
                    var7 = var5;
                    var8 = var6;
                    var14 = new int[4];
                    var9_array = new int[4];
                    var15 = (bd) ((Object) this.field_y.a(true));
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (var15 == null) {
                        statePc = 172;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    ca.a(12, var14, var15);
                    stackIn_173_0 = var14[2] + var14[1] + -1;
                    stackIn_161_0 = stackIn_173_0;
                    stackIn_173_1 = var6;
                    stackIn_161_1 = stackIn_173_1;
                    if (false) {
                        statePc = 173;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (stackIn_161_0 > stackIn_161_1) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var6 = var14[1] + (var14[2] - 1);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var14[1] >= var5) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var5 = var14[1];
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (1 + -var14[3] + var14[0] < var7) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var7 = var14[0] + (-var14[3] + 1);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (var14[0] <= var8) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var8 = var14[0];
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    discarded$3 = this.field_X.append(Integer.toString(var14[0]));
                    discarded$4 = this.field_X.append(',');
                    discarded$5 = this.field_X.append(Integer.toString(var14[1]));
                    discarded$6 = this.field_X.append(',');
                    discarded$7 = this.field_X.append(Integer.toString(var14[2]));
                    discarded$8 = this.field_X.append(',');
                    discarded$9 = this.field_X.append(Integer.toString(var14[3]));
                    discarded$10 = this.field_X.append(';');
                    this.field_N = this.field_N + 1;
                    this.field_i = this.field_i ^ var14[0];
                    this.field_f = this.field_f ^ var14[0];
                    this.field_P = this.field_P + this.field_U;
                    var15 = (bd) ((Object) this.field_y.f(2));
                    statePc = 159;
                    continue stateLoop;
                }
                case 172: {
                    discarded$11 = this.field_X.append('|');
                    this.field_V = 416 - -(((var7 + var8) * -24 - -24) / 2);
                    this.field_o = (1 + (var5 + var6)) * 24 / 2 + 10;
                    stackIn_173_0 = this.field_l ^ -1;
                    stackIn_173_1 = -2;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 >= stackIn_173_1) {
                        statePc = 178;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var10 = -2 + (4 + this.field_l);
                    if ((var10 ^ -1) <= -9) {
                        statePc = 176;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var10 = 7;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    mh.b(var10, 100);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    this.field_n = 50;
                    var10 = 100;
                    var11 = (vf) ((Object) this.field_B.a(true));
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (var11 == null) {
                        statePc = 221;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var11.a(this.field_y.b(2), 32211, var10);
                    var11 = (vf) ((Object) this.field_B.f(param0 ^ 3));
                    statePc = 179;
                    continue stateLoop;
                }
                case 181: {
                    this.field_n = this.field_n - 1;
                    var5 = this.field_n + 50;
                    var18 = (vf) ((Object) this.field_B.a(true));
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (var18 == null) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var18.a(var5, true);
                    var18 = (vf) ((Object) this.field_B.f(param0 ^ 3));
                    statePc = 182;
                    continue stateLoop;
                }
                case 184: {
                    if ((this.field_n ^ -1) == -1) {
                        statePc = 186;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.c(-111);
                    this.f(19076);
                    this.field_n = 50;
                    this.a((byte) 99, 3);
                    statePc = 221;
                    continue stateLoop;
                }
                case 187: {
                    if (this.field_n <= 0) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    this.field_n = this.field_n - 1;
                    var19 = (vf) ((Object) this.field_B.a(true));
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (var19 == null) {
                        statePc = 221;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var19.a(this.field_n, true);
                    var19 = (vf) ((Object) this.field_B.f(2));
                    statePc = 189;
                    continue stateLoop;
                }
                case 191: {
                    var3 = 0;
                    var2 = 1;
                    var4 = this.field_d * this.field_p / 2;
                    this.field_p = this.field_p + 1;
                    var5 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_193_0 = 18;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (stackIn_193_0 <= var5) {
                        statePc = 205;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var6 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if ((var6 ^ -1) <= -13) {
                        statePc = 204;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    stackIn_193_0 = this.field_F[var5][var6];
                    stackIn_197_0 = stackIn_193_0;
                    if (false) {
                        statePc = 193;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (stackIn_197_0 > 0) {
                        statePc = 199;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 199: {
                    this.field_F[var5][var6] = Math.max(0, this.field_F[var5][var6] - var4);
                    var2 = 0;
                    if ((this.field_F[var5][var6] ^ -1) != -1) {
                        statePc = 203;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var3 == 0) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var3 = 1;
                    mh.b(1, 100);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var6++;
                    statePc = 195;
                    continue stateLoop;
                }
                case 204: {
                    var5++;
                    statePc = 192;
                    continue stateLoop;
                }
                case 205: {
                    if (var2 == 0) {
                        statePc = 221;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.a((byte) 99, 2);
                    statePc = 221;
                    continue stateLoop;
                }
                case 207: {
                    this.field_n = this.field_n + 1;
                    if (438 > this.field_n) {
                        statePc = 221;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (-1 == this.field_b) {
                        statePc = 210;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (ki.a((byte) -112)) {
                        statePc = 215;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_213_0 = this.field_u;
                    stackIn_212_0 = stackIn_213_0;
                    stackIn_213_1 = 83;
                    stackIn_212_1 = stackIn_213_1;
                    stackIn_213_2 = 0;
                    stackIn_212_2 = stackIn_213_2;
                    if ((ee.field_a ^ -1) < -1) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    stackIn_214_0 = (Lexicominos) ((Object) stackIn_212_0);
                    stackIn_214_1 = stackIn_212_1;
                    stackIn_214_2 = stackIn_212_2;
                    stackIn_214_3 = 1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 213: {
                    stackIn_214_0 = (Lexicominos) ((Object) stackIn_213_0);
                    stackIn_214_1 = stackIn_213_1;
                    stackIn_214_2 = stackIn_213_2;
                    stackIn_214_3 = 7;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    ((Lexicominos) (Object) stackIn_214_0).a((byte) stackIn_214_1, stackIn_214_2 != 0, stackIn_214_3, 0);
                    statePc = 221;
                    continue stateLoop;
                }
                case 215: {
                    if (((ee.field_a | this.field_J) ^ -1) == -1) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    stackIn_218_0 = 6;
                    statePc = 218;
                    continue stateLoop;
                }
                case 217: {
                    stackIn_218_0 = 0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    var5 = stackIn_218_0;
                    this.field_u.a((byte) 88, false, var5, var5);
                    statePc = 221;
                    continue stateLoop;
                }
                case 219: {
                    System.out.println("Unknown state: " + this.field_K);
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == 94) {
            break L0;
          } else {
            this.a((byte) 70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_K == 4) {
              break L2;
            } else {
              L3: {
                if (-1 == this.field_b) {
                  break L3;
                } else {
                  if (this.field_J <= 0) {
                    break L3;
                  } else {
                    if ((this.field_K ^ -1) != -2) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              break L1;
            }
          }
          stackIn_9_0 = 1;
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
        if (0 <= this.field_b) {
            return;
        }
        if (param0 != -107) {
            this.field_x = true;
        }
        int var4 = 1 << param2;
        if (-1 != (sc.field_g & var4 ^ -1)) {
            return;
        }
        sc.field_g = sc.field_g | var4;
        ee.field_a = ee.field_a | var4;
        this.field_G.b(127, new bd(param2));
        if (this.field_h) {
            return;
        }
        if (ki.a((byte) -102)) {
            rb.field_b.b(104, new vb(param2, param1, this.field_U, this.field_P, this.field_W, this.field_N));
        } else {
            qd.a(this.field_N, 11803, this.field_W, this.field_P, param1, param2, 4, this.field_U);
        }
    }

    private final void f(int param0) {
        StringBuilder discarded$0 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        vf stackIn_14_0;
        vf stackIn_14_1;
        String stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        vf stackIn_15_0 = null;
        vf stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int var3;
        bd var4;
        StringBuilder var5_ref_StringBuilder;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        vf var13;
        int var14;
        int[] var18;
        var14 = Lexicominos.field_L ? 1 : 0;
        a.a((byte) -123, this.field_y);
        tl.a(false, this.field_y);
        var18 = new int[4];
        var3 = 0;
        var4 = (bd) ((Object) this.field_y.a(true));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              stackIn_20_0 = param0;
              stackIn_20_1 = 19076;
              break L1;
            } else {
              ca.a(12, var18, var4);
              var5_ref_StringBuilder = new StringBuilder(var18[3] * var18[2]);
              var6 = var18[0];
              var7 = var18[1];
              stackIn_20_0 = -2;

              stackIn_20_1 = var18[2] ^ -1;

              L2: {
                if (stackIn_20_0 == stackIn_20_1) {
                  stackIn_6_0 = 0;
                  break L2;
                } else {
                  stackIn_6_0 = 1;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_6_0;
                if (1 != var18[3]) {
                  stackIn_9_0 = -1;
                  break L3;
                } else {
                  stackIn_9_0 = 0;
                  break L3;
                }
              }
              var9 = stackIn_9_0;
              var10 = var18[2] * var18[3];
              var11 = 0;
              L4: while (true) {
                if ((var10 ^ -1) >= (var11 ^ -1)) {
                  L5: {
                    var11 = 10 - -(24 * var18[1]);
                    var12 = -(24 * var18[0]) + 416;
                    stackIn_14_0 = null;

                    stackIn_14_1 = null;

                    stackIn_14_2 = var5_ref_StringBuilder.toString();

                    stackIn_14_3 = var11;

                    stackIn_14_4 = var12;

                    if (1 != var18[2]) {
                      stackIn_15_0 = null;
                      stackIn_15_1 = null;
                      stackIn_15_2 = (String) ((Object) stackIn_14_2);
                      stackIn_15_3 = stackIn_14_3;
                      stackIn_15_4 = stackIn_14_4;
                      stackIn_15_5 = 0;
                      break L5;
                    } else {
                      stackIn_15_0 = null;
                      stackIn_15_1 = null;
                      stackIn_15_2 = (String) ((Object) stackIn_14_2);
                      stackIn_15_3 = stackIn_14_3;
                      stackIn_15_4 = stackIn_14_4;
                      stackIn_15_5 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var13 = new vf(stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_15_5 != 0);
                    var13.a(50, (byte) -55, var3 * 24 + this.field_M + 266, 371);
                    this.field_B.a(-60, var13);
                    var3++;
                    if (var18[2] <= 1) {
                      var11 += 12;
                      var12 = var12 + mk.field_h.field_E / 2;
                      break L6;
                    } else {
                      var12 += 12;
                      var11 = var11 + mk.field_h.a('1');
                      break L6;
                    }
                  }
                  this.field_j.a(-111, new gd(ib.field_g[var10] * this.field_l, var11, var12));
                  var4 = (bd) ((Object) this.field_y.f(param0 + -19074));
                  continue L0;
                } else {
                  discarded$0 = var5_ref_StringBuilder.append((char)(this.field_w[var6][var7] & 255));
                  var7 = var7 + var8;
                  var6 = var6 + var9;
                  var11++;
                  continue L4;
                }
              }
            }
          }
          if (stackIn_20_0 == stackIn_20_1) {
            var4 = (bd) ((Object) this.field_y.a(true));
            L7: while (true) {
              if (var4 == null) {
                cf.a((fc) (this), (byte) 50);
                return;
              } else {
                ca.a(param0 + -19064, var18, var4);
                var5 = 1 + var18[0];
                var6 = var18[0] - (var18[3] - 1);
                L8: while (true) {
                  if ((var6 ^ -1) <= (var5 ^ -1)) {
                    var4 = (bd) ((Object) this.field_y.f(2));
                    continue L7;
                  } else {
                    var7 = var18[1] - -var18[2];
                    var8 = var18[1];
                    L9: while (true) {
                      if (var8 >= var7) {
                        var6++;
                        continue L8;
                      } else {
                        this.field_w[var6][var8] = (char)0;
                        var8++;
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void d(int param0) {
        db stackIn_5_0 = null;
        int stackIn_7_0 = 0;
        char stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        char stackIn_33_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_46_0 = 0;
        char stackOut_32_1;
        char stackOut_10_0;
        db var2;
        int var3;
        String var3_ref_String;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        vf var10;
        bd var11;
        gd var12;
        String var13;
        db var14;
        String var15;
        int[] var19;
        var9 = Lexicominos.field_L ? 1 : 0;
        ob.field_d.d(0, 0);
        if (this.field_g != null) {
          L0: {
            if (4 != this.field_K) {
              stackIn_5_0 = ia.field_H;
              break L0;
            } else {
              stackIn_5_0 = lg.field_c;
              break L0;
            }
          }
          var14 = stackIn_5_0;
          var2 = var14;
          var3 = 416;
          var4 = 0;
          L1: while (true) {
            stackIn_7_0 = var4 ^ -1;
            L2: while (true) {
              if (stackIn_7_0 <= -19) {
                L3: {
                  L4: {
                    if (-5 != (this.field_K ^ -1)) {
                      break L4;
                    } else {
                      var15 = ga.field_b;
                      var5 = 34;
                      var6 = 200;
                      var7 = 4 * this.field_n + -832;
                      if (255 <= var7) {
                        eh.a(0, lg.field_c, var5, 0, var15, var6);
                        break L4;
                      } else {
                        if (var7 <= 0) {
                          break L4;
                        } else {
                          var8 = 0;
                          L5: while (true) {
                            if ((var8 ^ -1) <= (var15.length() ^ -1)) {
                              break L4;
                            } else {
                              stackIn_38_0 = 32;

                              stackOut_32_1 = var15.charAt(var8);
                              stackIn_38_1 = stackOut_32_1;
                              stackIn_33_1 = stackOut_32_1;
                              L6: {
                                if (stackIn_38_0 == stackIn_33_1) {
                                  break L6;
                                } else {
                                  lg.field_c.b(var5, var6, var7);
                                  bi.field_a.a(var15.charAt(var8), var5 + lg.field_c.field_p / 2, (lg.field_c.field_u - -pa.field_d) / 2 + var6, 0, var7);
                                  break L6;
                                }
                              }
                              var5 += 24;
                              var8++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_g.a(true, 13551);
                  stackIn_38_0 = -3;
                  stackIn_38_1 = this.field_K ^ -1;
                  break L3;
                }
                L7: {
                  if (stackIn_38_0 != stackIn_38_1) {
                    break L7;
                  } else {
                    if (this.field_y == null) {
                      break L7;
                    } else {
                      var19 = new int[4];
                      var11 = (bd) ((Object) this.field_y.a(true));
                      L8: while (true) {
                        if (var11 == null) {
                          L9: {
                            if (25 < this.field_n) {
                              stackIn_46_0 = 125 + -this.field_n;
                              break L9;
                            } else {
                              stackIn_46_0 = 75 + this.field_n;
                              break L9;
                            }
                          }
                          var5 = stackIn_46_0 * 4096 / 100;
                          th.field_l[this.field_l].a(this.field_o, this.field_V, 0, var5);
                          break L7;
                        } else {
                          ca.a(12, var19, var11);
                          this.a(var19, 371);
                          var11 = (bd) ((Object) this.field_y.f(2));
                          continue L8;
                        }
                      }
                    }
                  }
                }
                var10 = (vf) ((Object) this.field_B.a(true));
                L10: while (true) {
                  if (var10 == null) {
                    lf.g(0, 8, 311, 450);
                    if (param0 >= 46) {
                      var12 = (gd) ((Object) this.field_j.a(true));
                      L11: while (true) {
                        if (var12 == null) {
                          L12: {
                            lf.b();
                            if (this.field_D) {
                              bi.field_a.b("FPS: " + tj.field_i, 10, 3 * pa.field_d + 20, 0, -1);
                              bi.field_a.b("LPS: " + ij.field_j, 10, pa.field_d * 4 + 25, 0, -1);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          return;
                        } else {
                          var12.a((byte) -34);
                          var12 = (gd) ((Object) this.field_j.f(2));
                          continue L11;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var10.a(17517, this.field_m, 0);
                    var10 = (vf) ((Object) this.field_B.f(2));
                    continue L10;
                  }
                }
              } else {
                var5 = 10;
                var6 = 0;
                L13: while (true) {
                  if (var6 >= 12) {
                    var3 -= 24;
                    var4++;
                    continue L1;
                  } else {
                    stackOut_10_0 = this.field_w[var4][var6];
                    stackIn_7_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    L14: {
                      if (stackIn_11_0 != 0) {
                        L15: {
                          if ((this.field_K ^ -1) != -5) {
                            stackIn_16_0 = 255;
                            break L15;
                          } else {
                            stackIn_16_0 = 64 * var4 + 255 + -(4 * this.field_n);
                            break L15;
                          }
                        }
                        var7 = stackIn_16_0;
                        if (-256 >= (var7 ^ -1)) {
                          var14 = var2;
                          if (mg.field_B) {
                            var14.d(var5, var3 - this.field_F[var4][var6]);
                            break L14;
                          } else {
                            eb.a(89, this.field_m, 0, var14, this.field_w[var4][var6], -this.field_F[var4][var6] + var3, var5);
                            break L14;
                          }
                        } else {
                          if ((var7 ^ -1) < -1) {
                            var14 = var2;
                            var14.b(var5, -this.field_F[var4][var6] + var3, var7);
                            if (!mg.field_B) {
                              this.field_m.field_f.a(this.field_w[var4][var6], var14.field_p / 2 + var5, (this.field_m.field_b + var14.field_u) / 2 + var3, 0, var7);
                              break L14;
                            } else {
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    var5 += 24;
                    var6++;
                    continue L13;
                  }
                }
              }
            }
          }
        } else {
          var13 = "LOADING";
          var3_ref_String = "LANGUAGE...";
          var4 = 24 * Math.max(var13.length(), var3_ref_String.length()) - -16;
          var5 = 64;
          var6 = (-var4 + 311) / 2;
          var7 = (450 + -var5) / 2;
          lf.a(var6, var7, var4, var5, 0);
          eh.a(0, lg.field_c, 8 + var6 - -48, 0, var13, var7 - -8);
          eh.a(0, lg.field_c, var6 - -8, 0, var3_ref_String, 24 + (8 + var7));
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        gd var2_ref_gd = (gd) ((Object) this.field_j.a(true));
        while (var2_ref_gd != null) {
            var2_ref_gd.c((byte) -55);
            this.field_i = this.field_i ^ var2_ref_gd.field_n;
            this.field_f = this.field_f ^ var2_ref_gd.field_n;
            var2_ref_gd = (gd) ((Object) this.field_j.f(2));
        }
        if ((this.field_r ^ -1) > (this.field_J ^ -1)) {
            var2 = (this.field_J + -this.field_r) / 30;
            if (!(-2 >= (var2 ^ -1))) {
                var2 = 1;
            }
            this.field_r = this.field_r + var2;
        }
        if ((this.field_r ^ -1) == (this.field_J ^ -1)) {
            th.field_o[2].e(0);
        } else {
            na.a(2, true);
        }
        if (param0 != 2) {
            this.a(101, 119);
        }
    }

    private final void a(String[] param0, byte param1, int param2, String param3) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        char[] var6_ref_char__ = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_g = new ha((fc) (this), param2, new char[]{param3.charAt(0), param3.charAt(1), param3.charAt(2), param3.charAt(3)});
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = param0.length ^ -1;
                        stackIn_3_1 = var5_int ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_ref_char__ = this.field_w[-1 + param0.length + -var5_int];
                        var7 = param0[var5_int].toUpperCase();
                        var8 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var7.length() ^ -1) >= (var8 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = var7.charAt(var8);
                        stackIn_3_0 = 65;
                        stackIn_7_0 = stackIn_3_0;
                        stackIn_3_1 = var9;
                        stackIn_7_1 = stackIn_3_1;
                        if (false) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 > stackIn_7_1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 <= 90) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6_ref_char__[var8] = (char)var9;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = 29 % ((-65 - param1) / 33);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("fc.G(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param3 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        int var3;
        int var4;
        int var5;
        db[] var6;
        db var7;
        db[] var8;
        db var9;
        bd var10;
        var5 = Lexicominos.field_L ? 1 : 0;
        var6 = kf.field_A;
        var3 = 0;
        L0: while (true) {
          if ((var6.length ^ -1) >= (var3 ^ -1)) {
            L1: {
              lf.g(125, 54, 221, 102);
              if (-1 <= (this.field_L ^ -1)) {
                break L1;
              } else {
                if ((this.field_L ^ -1) <= -31) {
                  break L1;
                } else {
                  if (this.field_L % 10 < 5) {
                    lf.a(0, 0, 640, 480, 16777215);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              this.field_Q.a(false, 13551);
              lf.b();
              this.c((byte) 72);
              lf.g(60, 266 - -this.field_M + 120, 252, 450);
              va.field_m.d(0, 0);
              if (param0 > 54) {
                break L2;
              } else {
                this.field_r = -50;
                break L2;
              }
            }
            var8 = kf.field_A;
            var3 = 0;
            L3: while (true) {
              if (var8.length <= var3) {
                L4: {
                  lf.b();
                  oh.a(183, lg.field_c, false, Integer.toString(Math.abs(this.field_r)), 0, 230);
                  if (this.field_s <= 0) {
                    break L4;
                  } else {
                    if (this.field_s >= 30) {
                      break L4;
                    } else {
                      if (5 > this.field_s % 10) {
                        lf.a(53, 183, 48, 24, 16777215);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  oh.a(183, lg.field_c, false, Integer.toString(this.field_d), 0, 77);
                  var10 = (bd) ((Object) this.field_G.a(true));
                  if (var10 != null) {
                    L6: {
                      var4 = 0;
                      if (80 > this.field_H) {
                        var3 = -32 + this.field_H / 2;
                        break L6;
                      } else {
                        if (-231 < (this.field_H ^ -1)) {
                          L7: {
                            var3 = 8;
                            if (94 >= this.field_H) {
                              break L7;
                            } else {
                              if (-109 >= (this.field_H ^ -1)) {
                                break L7;
                              } else {
                                var4 = 1;
                                break L7;
                              }
                            }
                          }
                          if (-123 <= (this.field_H ^ -1)) {
                            break L6;
                          } else {
                            if (this.field_H >= 136) {
                              break L6;
                            } else {
                              var4 = 1;
                              break L6;
                            }
                          }
                        } else {
                          var3 = -(this.field_H / 2) + 123;
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
                var9 = var8[var3];
                var9.d(0, 0);
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -3 + (10 - -(24 * param0[1]));
              var4 = 413 + -(param0[0] * 24);
              if (-2 != (param0[2] ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 3;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              jj.field_f[var5].d(var3_int, var4);
              if (-2 == (param0[2] ^ -1)) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 24;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_7_0;
              if (param1 == 371) {
                break L3;
              } else {
                var11 = (String) null;
                this.a((String[]) null, (byte) 53, 106, (String) null);
                break L3;
              }
            }
            L4: {
              if ((param0[3] ^ -1) != -2) {
                stackIn_12_0 = 24;
                break L4;
              } else {
                stackIn_12_0 = 0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_12_0;
              if (param0[2] == 1) {
                stackIn_15_0 = param0[3];
                break L5;
              } else {
                stackIn_15_0 = param0[2];
                break L5;
              }
            }
            var8 = stackIn_15_0;
            var9 = 1;
            L6: while (true) {
              if ((var9 ^ -1) <= (var8 + -1 ^ -1)) {
                jj.field_f[2 + var5].d(var3_int - -var6, var7 + var4);
                break L0;
              } else {
                var3_int = var3_int + var6;
                var4 = var4 + var7;
                jj.field_f[1 + var5].d(var3_int, var4);
                var9++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("fc.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final static void a(ng param0, char[][] param1, int[][] param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ij var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bd var6_ref_bd = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (ij) ((Object) param0.a(true));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = var4.field_q;
                        var6_ref_bd = (bd) ((Object) var4.field_s.a(true));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6_ref_bd == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param2[(var6_ref_bd.field_h >> -1316673200) + -var5][vg.a(65535, var6_ref_bd.field_h)] = var5 * 24;
                        var6_ref_bd = (bd) ((Object) var4.field_s.f(param3 ^ 11880));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = (ij) ((Object) param0.f(2));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param3 == 11882) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var4_int = param1.length;
                        var5 = param1[0].length;
                        var6 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var6;
                        stackIn_11_1 = var4_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= stackIn_11_1) {
                            statePc = 30;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var5 ^ -1) >= (var7 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_11_0 = 0;
                        stackIn_15_0 = stackIn_11_0;
                        stackIn_11_1 = param2[var6][var7];
                        stackIn_15_1 = stackIn_11_1;
                        if (false) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == stackIn_15_1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var6 + param2[var6][var7] / 24;
                        param1[var6][var7] = param1[var8][var7];
                        param1[var8][var7] = (char)0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4_ref);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("fc.B(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int var2;
        vf var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = -6 / ((-30 - param0) / 36);
        var3 = (vf) ((Object) this.field_B.a(true));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if ((var3.field_i ^ -1) > -372) {
                  break L2;
                } else {
                  if ((var3.field_n ^ -1) > (266 - (-this.field_M + -120) ^ -1)) {
                    break L2;
                  } else {
                    var3.b((byte) -121);
                    break L1;
                  }
                }
              }
              var3.a(17517, this.field_m, -311);
              break L1;
            }
            var3 = (vf) ((Object) this.field_B.f(2));
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != this.field_K) {
          L0: {
            var3 = this.field_K;
            if ((var3 ^ -1) != -2) {
              break L0;
            } else {
              this.field_l = 0;
              break L0;
            }
          }
          L1: {
            this.field_K = param1;
            if (param0 == 99) {
              break L1;
            } else {
              this.c(26);
              break L1;
            }
          }
          L2: {
            var3 = this.field_K;
            if ((var3 ^ -1) != -2) {
              if ((var3 ^ -1) != -3) {
                if (var3 == 3) {
                  this.field_p = 1;
                  break L2;
                } else {
                  if (var3 == 4) {
                    L3: {
                      if ((this.field_J ^ -1) >= -1) {
                        break L3;
                      } else {
                        if (ki.a((byte) -115)) {
                          break L3;
                        } else {
                          if (0 != (this.field_b ^ -1)) {
                            break L3;
                          } else {
                            if (this.field_h) {
                              break L3;
                            } else {
                              ki.field_d = gl.a(65526, 9, this.field_i, 3, this.field_f, (byte) 56, this.field_R, new int[]{64 * this.field_J - -this.field_m.field_i}, this.field_a);
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
                this.field_y = null;
                break L2;
              }
            } else {
              if ((vb.field_i ^ -1) > -3) {
                break L2;
              } else {
                L4: {
                  if ((this.field_X.length() ^ -1) < -235) {
                    this.field_C = this.field_X.toString();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_X = new StringBuilder(266);
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
        this.field_C = "";
        this.field_X = new StringBuilder(266);
        this.field_T = false;
        this.field_W = 274776128;
        this.field_P = 17239300;
        this.field_D = false;
        this.field_U = 0;
        this.field_N = -17;
        this.field_G = new ng();
        this.field_h = false;
        this.field_F = new int[18][12];
        this.field_H = 0;
        this.field_w = new char[18][12];
        this.field_K = 1;
        this.field_d = 1;
        this.field_B = new ng();
        this.field_M = 0;
        this.field_j = new ng();
        this.field_s = 4096;
        this.field_l = 0;
        this.field_b = -1;
        this.field_L = 4096;
        try {
            this.field_a = 434781;
            this.field_m = param1;
            this.field_u = param0;
            this.field_f = 1342181376;
            this.field_i = 2162904;
            this.field_I = param2;
            this.field_R = 268870237 - -param1.field_i;
            this.field_g = new ha((fc) (this));
            this.field_Q = new ha((fc) (this));
            if ((vb.field_i ^ -1) <= -3) {
                this.a(true);
            }
            ee.field_a = 0;
            fg.field_b = false;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
