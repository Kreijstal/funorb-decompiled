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
        var3 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          this.b((byte) 119);
        }
        L1: {
          var2 = oe.field_a;
          if (0 != var2) {
            switch (var2) {
              case 1:
                this.a(new String[]{"RU", "TO", "SE", "SE", "XXO", "XXN"}, (byte) -100, 0, "NOTT");
                break;
              case 3:
                this.a(new String[]{"  F", "  EX", "   CHO", "   REK", "   HUS", "   ERY", "  AQXX", "  LXXX"}, (byte) -117, 0, "ETTE");
                break;
              case 4:
                this.a(new String[]{" MISS", " ENTS", " AWKS", " CHOS", "SXXXX"}, (byte) 14, 0, "ACHE");
                break;
              case 5:
                this.a(new String[]{" T", " A", " KX", "  RROR", "  ILLS", "  TARE", "  RIAL", " EXXXX", " AXXXX", " LXXXX"}, (byte) 68, 0, "ESST");
                break;
              case 10:
                this.a(new String[]{"  POSTLES", "  IFELESS", "  IAISONS", "  LLUSIVE", " NQ", " OX", " LX", " EX", " UX", " MX"}, (byte) -113, 0, "ALLI");
                break;
              default:
                switch (var2) {
                  case 11:
                    this.a(new String[]{" L", " I", " T", " T", " O", " RX", "  POSTLES", "  IFELESS", "  IAISONS", "  LLUSIVE", " NQ", " OX", " LX", " EX", " UX", " MX"}, (byte) 54, 0, "ALLI");
                    break;
                  case 13:
                    this.a(new String[]{"   XP  XP", " IED IED IED"}, (byte) -107, 0, "PPPP");
                    break;
                  case 14:
                    this.a(new String[]{" XP  P", " X IECE", " IECE IECE"}, (byte) 125, 0, "PPPP");
                    break;
                  case 17:
                    this.a(new String[]{"  PI", "  X", " XP NOCHLE", " X INOCHLE", " INOCHLE X"}, (byte) 29, 0, "PPPP");
                    break;
                  case 21:
                    this.a(new String[]{" KUNKSU", "   USK NKSX", " SK NKSK  X", " X SKUN S X"}, (byte) -9, 0, "SSSS");
                    break;
                  case 22:
                    this.a(new String[]{"TETANU E", "   UDUK DOM", " UD KEDOM", "D KEDOM"}, (byte) -125, 0, "SSSS");
                    break;
                  case 23:
                    this.a(new String[]{" STR    HT", "  SSTRENG H", "X  TRENGTHT", "X X STRENG H"}, (byte) 50, 0, "ENGT");
                    break;
                  default:
                    oe.field_a = oe.field_a + 1;
                    break L1;
                  case 25:
                    this.a(new String[]{"    KSK", " KSKUN SXXX", "S UNKSU   X", "XX USK NKSX", "XSK NKSK  X", "XX SKUN S X"}, (byte) -115, 0, "SKUN");
                    break;
                  case 24:
                    this.a(new String[]{"       XXXX", " KS    S  X", "S UNKSU   X", "XX USK NKSX", "XSK NKSK", "XX SKUN S"}, (byte) 2, 0, "KUNK");
                    break;
                  case 20:
                    this.a(new String[]{"  ASLAI", "SL INA", " XXSL INE", "  X  XPI CE"}, (byte) 17, 0, "NNNN");
                    break;
                  case 19:
                    this.a(new String[]{"P EDI", "XXXP EDI", "  XXXXP EDE", "     XXXPI D"}, (byte) -112, 0, "IIII");
                    break;
                  case 18:
                    this.a(new String[]{"P EI", "XXP EI", " XXXP EI", "   XXXP E"}, (byte) 11, 0, "IIII");
                    break;
                  case 16:
                    this.a(new String[]{"    JP", " JP J RIESTS", " J RIESTS J", " RIESTS J"}, (byte) -128, 0, "PPPP");
                    break;
                  case 15:
                    this.a(new String[]{" XP   P", " X IECES", " IECES IECES"}, (byte) -101, 0, "PPPP");
                    break;
                  case 12:
                    this.a(new String[]{"  XXX XXX", "  X P X P", " IE  IE  IE"}, (byte) -128, 0, "PPPP");
                    break;
                }
                break;
              case 9:
                this.a(new String[]{" L", " I", " M", " I", " TX", "  XCEEDS", "  IEHARD", "  EXICON", "  NDOORS", " NX", " EX", " AX", " GX", " EX"}, (byte) -101, 0, "EDLI");
                break;
              case 8:
                this.a(new String[]{"  XCEEDS", "  IEHARD", "  EXICON", "  NDOORS", " NX", " EX", " AX", " GX", " EX"}, (byte) -121, 0, "EDLI");
                break;
              case 7:
                this.a(new String[]{" S", " T", " E", " AX", "  IMITS", "  AINTS", "  RITES", "  AISIN", " IX", " TX", " E", " S"}, (byte) -121, 0, "LSWR");
                break;
              case 6:
                this.a(new String[]{" PECIE", " EDEMA", " DDITY", " ORPID", "HXXXXX", "EXXXXX"}, (byte) -102, 0, "SOOT");
                break;
              case 2:
                this.a(new String[]{"FAI", "EAS", "ART", "RAI"}, (byte) 117, 0, "LYYL");
                break;
            }
          } else {
            this.a(new String[]{"XU", "TO", "SE", "SE", "XXO", "XXN"}, (byte) 110, 0, "NOTT");
          }
          oe.field_a = oe.field_a + 1;
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
        var3 = (bd) (this.field_y.a(true));
        var4 = 77 % ((param0 - 52) / 55);
        while (var3 != null) {
          ca.a(12, var11, var3);
          var5 = var11[2] * var11[3];
          var6 = ib.field_g[var5] * this.field_l;
          this.field_a = this.field_a - (var6 << 5);
          this.field_J = this.field_J + var6;
          this.field_R = this.field_R + (var6 << 5);
          if (5 != var5) {
            if (var5 == 6) {
              this.a((byte) -107, 254, 1);
            } else {
              if (7 == var5) {
                this.a((byte) -107, 253, 2);
              } else {
                if (var5 >= 8) {
                  this.a((byte) -107, 252, 3);
                }
              }
            }
          } else {
            this.a((byte) -107, 255, 0);
          }
          var3 = (bd) (this.field_y.f(2));
        }
    }

    final void b(int param0, int param1) {
        int var8 = 0;
        int var3 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        char[] var12 = null;
        char[] var14 = null;
        String[] var15 = null;
        char[] var19 = null;
        char[] var21 = null;
        char[][] var27 = null;
        char[][] var28 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        char[] var17 = null;
        char[] var23 = null;
        char[][] var29 = null;
        int stackIn_27_0Lifetime1;
        int stackIn_27_1Lifetime1;
        var10 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= -35) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        oe.field_a = oe.field_a - 1;
        var3 = 0;
        if (param1 == 0) {
          var27 = this.field_w;
          for (var5 = 0; var27.length > var5; var5++) {
            var19 = var27[var5];
            var12 = var19;
            var6 = var12;
            for (var7 = 0; var7 < var19.length; var7++) {
              var6[var7] = (char)0;
            }
          }
          this.field_w[0][2] = (char)80;
          this.field_w[0][3] = (char)73;
          this.field_w[1][2] = bj.field_a.charAt(2);
          this.field_w[2][2] = bj.field_a.charAt(1);
          this.field_g = new ha(this, 6, new char[]{bj.field_a.charAt(0), (char)65, (char)72, (char)76});
        } else {
          if (param1 == 1) {
            var29 = this.field_w;
            for (var5 = 0; var29.length > var5; var5++) {
              var23 = var29[var5];
              var17 = var23;
              var6 = var17;
              for (var7 = 0; var7 < var23.length; var7++) {
                var6[var7] = (char)0;
              }
            }
            this.field_w[0][6] = md.field_L.charAt(0);
            this.field_w[0][7] = md.field_L.charAt(1);
            this.field_w[0][9] = md.field_L.charAt(3);
            this.field_w[0][10] = md.field_L.charAt(4);
            this.field_w[0][11] = md.field_L.charAt(5);
            this.field_w[1][6] = (char)84;
            this.field_w[1][11] = (char)69;
            this.field_w[1][5] = (char)72;
            this.field_g = new ha(this, 4, new char[]{(char)83, (char)80, (char)82, md.field_L.charAt(2)});
          } else {
            if (param1 == 2) {
              var28 = this.field_w;
              for (var5 = 0; var5 < var28.length; var5++) {
                var21 = var28[var5];
                var14 = var21;
                var6 = var14;
                for (var7 = 0; var7 < var21.length; var7++) {
                  var6[var7] = (char)0;
                }
              }
              this.field_w[0][4] = jf.field_G.charAt(1);
              this.field_w[0][5] = jf.field_G.charAt(2);
              this.field_w[0][6] = jf.field_G.charAt(3);
              this.field_w[0][7] = jf.field_G.charAt(4);
              this.field_w[1][3] = jf.field_G.charAt(0);
              this.field_w[1][4] = ch.field_d.charAt(0);
              if (ri.field_e != 2) {
                this.field_w[1][6] = ch.field_d.charAt(2);
              }
              this.field_w[1][7] = ch.field_d.charAt(3);
              this.field_w[1][8] = ch.field_d.charAt(4);
              this.field_w[2][3] = (char)70;
              this.field_w[2][5] = ch.field_d.charAt(1);
              if (2 == ri.field_e) {
                this.field_w[2][6] = ch.field_d.charAt(2);
              }
              this.field_w[3][3] = c.field_n.charAt(0);
              this.field_w[3][4] = c.field_n.charAt(1);
              this.field_w[3][5] = c.field_n.charAt(2);
              this.field_g = new ha(this, 3, new char[]{c.field_n.charAt(4), c.field_n.charAt(3), (char)67, (char)80});
            } else {
              if (param1 == 3) {
                var15 = new String[]{"NZ          ", " ST      NO ", " DTCCG  IA E", "  O  FA EQNO", " OKSG NTA S ", "SM    B  ED ", "RT    LS D  ", " P AN  LCW  ", " RS AD LTZ  ", "  L  LHA AXF", "  L    ECZ  ", "  SI  LWMLE ", "   C GW TPS ", "ESJSI DO NB ", "E  SD  W Z  ", "DE AWO ORRST", "LP  B ZDDICN"};
                var5 = 0;
                while (true) {
                  stackIn_27_0 = var15.length;
                  stackIn_27_1 = var5;
                  if (stackIn_27_0 <= stackIn_27_1) {
                    this.field_g = new ha(this, 1, new char[]{(char)68, (char)87, (char)73, (char)78});
                    this.field_Q = new ha(this, 6, new char[]{(char)84, (char)66, (char)86, (char)83});
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var6 = this.field_w[-var5 + var15.length - 1];
                  var7_ref_String = var15[var5].toUpperCase();
                  for (var8 = 0; var7_ref_String.length() > var8; var8++) {
                    var9 = var7_ref_String.charAt(var8);
                    stackIn_27_0Lifetime1 = ~var9;
                    stackIn_27_1Lifetime1 = -66;
                    if (stackIn_27_0Lifetime1 <= stackIn_27_1Lifetime1 &&
                      90 >= var9) {
                      var6[var8] = (char)var9;
                    }
                  }
                  var5++;
                }
              }
              if (decompiledFrameCompleted0) {
                var3 = 1;
              }
            }
          }
        }
        if (var3 == 0) {
          this.field_d = 3;
          this.field_b = param1;
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
        StringBuilder discarded$2 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$3 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        boolean stackIn_61_1 = false;
        boolean stackIn_66_1 = false;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        StringBuilder stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_128_0 = 0;
        char stackIn_132_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_193_0 = 0;
        Lexicominos stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        boolean stackIn_213_2 = false;
        int stackIn_214_3;
        int stackIn_218_0 = 0;
        char stackOut_131_0;
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
        int stackIn_173_0Lifetime1;
        int stackIn_173_1Lifetime1;
        int stackIn_193_0Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1Lifetime1;
        var16 = null;
        var17 = null;
        var13 = Lexicominos.field_L ? 1 : 0;
        if (this.field_T) {
          return;
        }
        if (param0 != 1) {
          return;
        }
        this.b(2);
        if (null != this.field_G.a(true)) {
          fieldTemp$0 = this.field_H + 1;
          this.field_H = this.field_H + 1;
          if (335 == fieldTemp$0) {
            this.field_H = 0;
            this.field_G.a((byte) 74);
          }
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted3 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameCompleted0 = true;
        var5 = this.field_K;
        if (var5 != 1) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (var5 == 2) {
            if (this.field_b >= 0) {
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
            }
            if (this.field_y != null) {
              this.field_n = this.field_n - 1;
              var5 = this.field_n + 50;
              var18 = (vf) (this.field_B.a(true));
              while (var18 != null) {
                var18.a(var5, true);
                var18 = (vf) (this.field_B.f(param0 ^ 3));
              }
              if ((this.field_n == 0)) {
                this.c(-111);
                this.f(19076);
                this.field_n = 50;
                this.a((byte) 99, 3);
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (this.field_X.length() == 0) {
                for (var5 = 17; var5 >= 0; var5--) {
                  for (var6 = 0; var6 < 12; var6++) {
                    stackIn_88_0 = this.field_X;
                    if (0 == this.field_w[var5][var6]) {
                      stackIn_89_1 = 46;
                    } else {
                      stackIn_89_1 = 255 & this.field_w[var5][var6];
                    }
                    discarded$2 = ((StringBuilder) (Object) stackIn_88_0).append((char)stackIn_89_1);
                  }
                  discarded$1 = this.field_X.append('|');
                }
              }
              this.field_y = this.field_m.a(this.field_w, 17161);
              this.field_t = this.field_t + this.field_y.b(param0 + 1);
              if (this.field_y.b(param0 + 1) != 0) {
                mh.b(0, 100);
                this.field_l = this.field_l + this.field_y.b(2);
                if (th.field_l.length <= this.field_l) {
                  this.field_l = th.field_l.length - 1;
                }
                if (this.field_l >= 3) {
                  this.a((byte) -107, 251, 4);
                }
                if (this.field_l >= 4) {
                  this.a((byte) -107, 250, 5);
                }
                if (5 <= this.field_l) {
                  this.a((byte) -107, 249, 6);
                }
                if (6 <= this.field_l) {
                  this.a((byte) -107, 248, 7);
                }
                this.field_c = this.field_c + 1;
                if (this.field_c >= 3) {
                  this.a((byte) -107, 247, 8);
                }
                if (this.field_c >= 4) {
                  this.a((byte) -107, 246, 9);
                }
                if (this.field_c >= 5) {
                  this.a((byte) -107, 245, 10);
                }
                var5 = 2147483647;
                var6Lifetime2 = -2147483648;
                var7 = var5;
                var8Lifetime1 = var6Lifetime2;
                var14 = new int[4];
                var9_array = new int[4];
                var15 = (bd) (this.field_y.a(true));
                while (var15 != null) {
                  ca.a(12, var14, var15);
                  stackIn_173_0 = var14[2] + var14[1] - 1;
                  stackIn_173_1 = var6Lifetime2;
                  if (stackIn_173_0 > stackIn_173_1) {
                    var6Lifetime2 = var14[1] + (var14[2] - 1);
                  }
                  if (var14[1] < var5) {
                    var5 = var14[1];
                  }
                  if (1 - var14[3] + var14[0] < var7) {
                    var7 = var14[0] + (-var14[3] + 1);
                  }
                  if (var14[0] > var8Lifetime1) {
                    var8Lifetime1 = var14[0];
                  }
                  discarded$4 = this.field_X.append(Integer.toString(var14[0]));
                  discarded$5 = this.field_X.append(',');
                  discarded$6 = this.field_X.append(Integer.toString(var14[1]));
                  discarded$7 = this.field_X.append(',');
                  discarded$8 = this.field_X.append(Integer.toString(var14[2]));
                  discarded$9 = this.field_X.append(',');
                  discarded$10 = this.field_X.append(Integer.toString(var14[3]));
                  discarded$11 = this.field_X.append(';');
                  this.field_N = this.field_N + 1;
                  this.field_i = this.field_i ^ var14[0];
                  this.field_f = this.field_f ^ var14[0];
                  this.field_P = this.field_P + this.field_U;
                  var15 = (bd) (this.field_y.f(2));
                }
                discarded$3 = this.field_X.append('|');
                this.field_V = 416 + ((var7 + var8Lifetime1) * -24 + 24) / 2;
                this.field_o = (1 + (var5 + var6Lifetime2)) * 24 / 2 + 10;
                stackIn_173_0Lifetime1 = ~this.field_l;
                stackIn_173_1Lifetime1 = -2;
                if (stackIn_173_0Lifetime1 < stackIn_173_1Lifetime1) {
                  var10 = -2 + (4 + this.field_l);
                  if (var10 >= 8) {
                    var10 = 7;
                  }
                  mh.b(var10, 100);
                }
                this.field_n = 50;
                var10Lifetime1 = 100;
                var11 = (vf) (this.field_B.a(true));
                while (var11 != null) {
                  var11.a(this.field_y.b(2), 32211, var10Lifetime1);
                  var11 = (vf) (this.field_B.f(param0 ^ 3));
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_c = 0;
                this.field_Q = new ha(this);
                this.field_L = 0;
                if (this.field_d < 16) {
                  var5 = (this.field_t >> 3) + 1;
                  if (this.field_d < var5) {
                    this.field_d = this.field_d + 1;
                    this.field_s = 0;
                    if ((this.field_d & 1) == 1) {
                      ki.a(1000000 + this.field_d * 40000 - 40000, this.field_I, -104);
                    }
                  }
                  if (this.field_d == 5) {
                    this.a((byte) -107, 244, 11);
                  } else {
                    if (10 != this.field_d) {
                      if (this.field_d == 15) {
                        this.a((byte) -107, 242, 13);
                      } else {
                        if (20 == this.field_d) {
                          this.a((byte) -107, 241, 14);
                        }
                      }
                    } else {
                      this.a((byte) -107, 243, 12);
                    }
                  }
                }
                var5 = 0;
                var6Lifetime3 = 15;
                while (true) {
                  stackIn_106_0 = 18;
                  stackIn_106_1 = var6Lifetime3;
                  boolean decompiledFrameCompleted4 = true;
                  if (stackIn_106_0 > stackIn_106_1) {
                    for (var7Lifetime1 = 0; var7Lifetime1 < 12; var7Lifetime1++) {
                      stackIn_106_0 = -1;
                      stackIn_106_1 = ~this.field_w[var6Lifetime3][var7Lifetime1];
                      if (stackIn_106_0 != stackIn_106_1) {
                        var5 = 1;
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted4) {
                      var6Lifetime3++;
                      continue;
                    }
                  }
                  if (var5 != 0 &&
                    !fg.field_b) {
                    nh.a(param0 - 1, 40000 * (this.field_d - 1) + 1000000, 5, false);
                    this.field_k = true;
                  } else {
                    if (var5 == 0 &&
                      fg.field_b) {
                      nh.a(0, 1000000 + (this.field_d - 1) * 40000, e.field_q, true);
                    }
                  }
                  fg.field_b = var5 != 0;
                  if ((32768 & sc.field_g) == 0 &&
                    this.field_k) {
                    if (fg.field_b) {
                      this.a((byte) 99, 1);
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    var6Lifetime3 = 1;
                    var7Lifetime1Lifetime1 = 12;
                    L35: while (true) {
                      stackIn_128_0 = -16;
                      while (true) {
                        if (stackIn_128_0 < ~var7Lifetime1Lifetime1) {
                          var8Lifetime2 = 0;
                          while (true) {
                            if (var8Lifetime2 >= 12) {
                              var7Lifetime1Lifetime1++;
                              continue L35;
                            }
                            stackOut_131_0 = this.field_w[var7Lifetime1Lifetime1][var8Lifetime2];
                            stackIn_128_0 = stackOut_131_0;
                            stackIn_132_0 = stackOut_131_0;
                            if (stackIn_132_0 == 0) {
                              var8Lifetime2++;
                              continue;
                            }
                            break;
                          }
                          var6Lifetime3 = 0;
                        }
                        if (var6Lifetime3 == 0) {
                          break L35;
                        }
                        this.a((byte) -107, 240, 15);
                        break L35;
                      }
                    }
                  }
                  this.a((byte) 99, 1);
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            if (var5 == 3) {
              if (this.field_n > 0) {
                this.field_n = this.field_n - 1;
                var19 = (vf) (this.field_B.a(true));
                while (var19 != null) {
                  var19.a(this.field_n, true);
                  var19 = (vf) (this.field_B.f(2));
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var3 = 0;
                var2 = 1;
                var4 = this.field_d * this.field_p / 2;
                this.field_p = this.field_p + 1;
                var5 = 0;
                while (true) {
                  stackIn_193_0 = 18;
                  if (stackIn_193_0 <= var5) {
                    if (var2 == 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    this.a((byte) 99, 2);
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  for (var6Lifetime1 = 0; var6Lifetime1 < 12; var6Lifetime1++) {
                    stackIn_193_0Lifetime1 = this.field_F[var5][var6Lifetime1];
                    if (stackIn_193_0Lifetime1 > 0) {
                      this.field_F[var5][var6Lifetime1] = Math.max(0, this.field_F[var5][var6Lifetime1] - var4);
                      var2 = 0;
                      if (this.field_F[var5][var6Lifetime1] == 0 &&
                        var3 == 0) {
                        var3 = 1;
                        mh.b(1, 100);
                      }
                    }
                  }
                  var5++;
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              if (var5 != 4) {
                System.out.println("Unknown state: " + this.field_K);
              } else {
                this.field_n = this.field_n + 1;
                if ((438 <= this.field_n) &&
                  (decompiledFrameRemainder1 = (-1 == this.field_b))) {
                  if (ki.a((byte) -112)) {
                    stackIn_218_0 = ((ee.field_a | this.field_J) == 0) ? 0 : 6;
                    var5 = stackIn_218_0;
                    this.field_u.a((byte) 88, false, var5, var5);
                  } else {
                    stackIn_213_0 = this.field_u;
                    stackIn_213_1 = 83;
                    stackIn_213_2 = false;
                    if (ee.field_a > 0) {
                      stackIn_214_3 = 7;
                    } else {
                      stackIn_214_3 = 1;
                    }
                    ((Lexicominos) (Object) stackIn_213_0).a((byte) stackIn_213_1, stackIn_213_2, stackIn_214_3, 0);
                  }
                }
              }
            }
          }
        } else {
          stackIn_15_0 = 0;
          stackIn_15_1 = 1000000 + 40000 * (-1 + this.field_d);
          if (fg.field_b) {
            stackIn_16_2 = 5;
          } else {
            stackIn_16_2 = e.field_q;
          }
          nh.a(stackIn_15_0, stackIn_15_1, stackIn_16_2, false);
          this.field_A = false;
          this.field_O = false;
          this.field_E = false;
          this.field_v = false;
          this.field_L = this.field_L + 1;
          this.field_s = this.field_s + 1;
          this.field_x = false;
          if (0 > this.field_b) {
            this.field_O = wa.field_j[97];
            this.field_v = wa.field_j[96];
            stackIn_61_1 = (wa.field_j[99]) || (wa.field_j[83]);
            this.field_E = stackIn_61_1;
            stackIn_66_1 = (wa.field_j[sa.field_c]) || (wa.field_j[98]);
            this.field_A = stackIn_66_1;
            this.field_x = wa.field_j[gk.field_e];
          } else {
            if (0 == this.field_b) {
              if (this.field_g.field_g.field_a <= 9 && (!(this.field_g.field_a.field_a >= 1) ||
                !(-this.field_d <= this.field_g.field_a.field_c))) {
                this.field_O = true;
              }
              if (this.field_g.field_g.field_a <= 14 &&
                this.field_g.field_a.field_a > 0 &&
                3 > this.field_g.field_b.field_a) {
                this.field_v = true;
              }
              if (12 >= this.field_g.field_g.field_a &&
                this.field_g.field_b.field_a < 3) {
                this.field_A = true;
              }
              if (this.field_g.field_g.field_a <= 6 &&
                1 == this.field_g.field_a.field_a) {
                this.field_E = true;
              }
            } else {
              if (1 == this.field_b) {
                if (12 >= this.field_g.field_g.field_a) {
                  this.field_E = true;
                }
                if (this.field_g.field_g.field_a <= 15 &&
                  this.field_g.field_a.field_a < 8) {
                  this.field_O = true;
                }
              } else {
                if (this.field_b == 2) {
                  if (this.field_g.field_g.field_a == 15 &&
                    0 == this.field_g.field_b.field_a) {
                    this.field_A = true;
                  }
                  if (this.field_g.field_g.field_a == 12 &&
                    this.field_g.field_a.field_a == 5) {
                    this.field_O = true;
                  } else {
                    if (this.field_g.field_g.field_a <= 9 &&
                      this.field_g.field_a.field_a == 6) {
                      this.field_E = true;
                    }
                  }
                  if (this.field_g.field_g.field_a <= 13 &&
                    1 == this.field_g.field_b.field_a) {
                    this.field_A = true;
                  }
                }
              }
            }
          }
          if ((-1 == this.field_b ||
            this.field_J == 0) &&
            !this.field_g.a(this.field_A, this.field_O, this.field_v, this.field_E, this.field_x, (byte) -93)) {
            stackIn_74_1 = 99;
            if (!this.field_g.b(param0 ^ -11497)) {
              stackIn_75_2 = 4;
            } else {
              stackIn_75_2 = 2;
            }
            this.a((byte) stackIn_74_1, stackIn_75_2);
            this.field_g = this.field_Q;
            mh.b(8, param0 + 99);
          }
          this.field_W = this.field_W - 1;
          this.field_R = this.field_R + this.field_g.field_i;
          this.field_P = this.field_P + 1;
          this.field_a = this.field_a + this.field_g.field_i;
        }

    }

    final boolean a(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 94) {
          this.a((byte) 70);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_K != 4 && (-1 == this.field_b ||
          this.field_J <= 0 ||
          this.field_K != 1)) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
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
        if ((sc.field_g & var4) != 0) {
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
        boolean stackIn_15_5 = false;
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
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var11Lifetime1;
        bd var4Lifetime1;
        int stackIn_20_0Lifetime1;
        int stackIn_20_1Lifetime1;
        var14 = Lexicominos.field_L ? 1 : 0;
        a.a((byte) -123, this.field_y);
        tl.a(false, this.field_y);
        var18 = new int[4];
        var3 = 0;
        var4 = (bd) (this.field_y.a(true));
        while (var4 != null) {
          ca.a(12, var18, var4);
          var5_ref_StringBuilder = new StringBuilder(var18[3] * var18[2]);
          var6 = var18[0];
          var7 = var18[1];
          stackIn_20_0 = -2;
          stackIn_20_1 = ~var18[2];
          stackIn_6_0 = (stackIn_20_0 == stackIn_20_1) ? 0 : 1;
          var8 = stackIn_6_0;
          stackIn_9_0 = (1 != var18[3]) ? -1 : 0;
          var9 = stackIn_9_0;
          var10 = var18[2] * var18[3];
          for (var11 = 0; var10 > var11; var11++) {
            discarded$0 = var5_ref_StringBuilder.append((char)(this.field_w[var6][var7] & 255));
            var7 = var7 + var8;
            var6 = var6 + var9;
          }
          var11Lifetime1 = 10 + 24 * var18[1];
          var12 = -(24 * var18[0]) + 416;
          stackIn_14_0 = null;
          stackIn_14_1 = null;
          stackIn_14_2 = var5_ref_StringBuilder.toString();
          stackIn_14_3 = var11Lifetime1;
          stackIn_14_4 = var12;
          if (1 != var18[2]) {
            stackIn_15_0 = null;
            stackIn_15_1 = null;
            stackIn_15_5 = false;
          } else {
            stackIn_15_0 = null;
            stackIn_15_1 = null;
            stackIn_15_5 = true;
          }
          var13 = new vf(stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_15_5);
          var13.a(50, (byte) -55, var3 * 24 + this.field_M + 266, 371);
          this.field_B.a(-60, var13);
          var3++;
          if (var18[2] <= 1) {
            var11Lifetime1 += 12;
            var12 = var12 + mk.field_h.field_E / 2;
          } else {
            var12 += 12;
            var11Lifetime1 = var11Lifetime1 + mk.field_h.a('1');
          }
          this.field_j.a(-111, new gd(ib.field_g[var10] * this.field_l, var11Lifetime1, var12));
          var4 = (bd) (this.field_y.f(param0 - 19074));
        }
        stackIn_20_0Lifetime1 = param0;
        stackIn_20_1Lifetime1 = 19076;
        if (stackIn_20_0Lifetime1 != stackIn_20_1Lifetime1) {
          return;
        }
        var4Lifetime1 = (bd) (this.field_y.a(true));
        while (var4Lifetime1 != null) {
          ca.a(param0 - 19064, var18, var4Lifetime1);
          var5 = 1 + var18[0];
          for (var6Lifetime1 = var18[0] - (var18[3] - 1); var6Lifetime1 < var5; var6Lifetime1++) {
            var7Lifetime1 = var18[1] + var18[2];
            for (var8Lifetime1 = var18[1]; var8Lifetime1 < var7Lifetime1; var8Lifetime1++) {
              this.field_w[var6Lifetime1][var8Lifetime1] = (char)0;
            }
          }
          var4Lifetime1 = (bd) (this.field_y.f(2));
        }
        cf.a(this, (byte) 50);
        return;
    }

    final void d(int param0) {
        int var8 = 0;
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
        int var9;
        vf var10;
        bd var11;
        gd var12;
        String var13;
        db var14;
        String var15;
        int[] var19;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        db var14Lifetime1;
        int stackIn_38_0Lifetime1;
        int stackIn_38_1Lifetime1;
        var9 = Lexicominos.field_L ? 1 : 0;
        ob.field_d.d(0, 0);
        if (this.field_g == null) {
          var13 = "LOADING";
          var3_ref_String = "LANGUAGE...";
          var4 = 24 * Math.max(var13.length(), var3_ref_String.length()) + 16;
          var5 = 64;
          var6 = (-var4 + 311) / 2;
          var7 = (450 - var5) / 2;
          lf.a(var6, var7, var4, var5, 0);
          eh.a(0, lg.field_c, 8 + var6 + 48, 0, var13, var7 + 8);
          eh.a(0, lg.field_c, var6 + 8, 0, var3_ref_String, 24 + (8 + var7));
          return;
        }
        if (4 != this.field_K) {
          stackIn_5_0 = ia.field_H;
        } else {
          stackIn_5_0 = lg.field_c;
        }
        var14 = stackIn_5_0;
        var2 = var14;
        var3 = 416;
        var4Lifetime1 = 0;
        L1: while (true) {
          stackIn_7_0 = ~var4Lifetime1;
          if (stackIn_7_0 > -19) {
            var5Lifetime1 = 10;
            for (var6Lifetime1 = 0; var6Lifetime1 < 12; var6Lifetime1++) {
              stackOut_10_0 = this.field_w[var4Lifetime1][var6Lifetime1];
              stackIn_7_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (stackIn_11_0 != 0) {
                if (this.field_K != 4) {
                  stackIn_16_0 = 255;
                } else {
                  stackIn_16_0 = 64 * var4Lifetime1 + 255 - 4 * this.field_n;
                }
                var7Lifetime1 = stackIn_16_0;
                if (var7Lifetime1 >= 255) {
                  var14Lifetime1 = var2;
                  if (mg.field_B) {
                    var14Lifetime1.d(var5Lifetime1, var3 - this.field_F[var4Lifetime1][var6Lifetime1]);
                  } else {
                    eb.a(89, this.field_m, 0, var14Lifetime1, this.field_w[var4Lifetime1][var6Lifetime1], -this.field_F[var4Lifetime1][var6Lifetime1] + var3, var5Lifetime1);
                  }
                } else {
                  if (var7Lifetime1 > 0) {
                    var14Lifetime1 = var2;
                    var14Lifetime1.b(var5Lifetime1, -this.field_F[var4Lifetime1][var6Lifetime1] + var3, var7Lifetime1);
                    if (!mg.field_B) {
                      this.field_m.field_f.a(this.field_w[var4Lifetime1][var6Lifetime1], var14Lifetime1.field_p / 2 + var5Lifetime1, (this.field_m.field_b + var14Lifetime1.field_u) / 2 + var3, 0, var7Lifetime1);
                    }
                  }
                }
              }
              var5Lifetime1 += 24;
            }
            var3 -= 24;
            var4Lifetime1++;
            continue L1;
          }
          break;
        }
        if (this.field_K == 4) {
          var15 = ga.field_b;
          var5Lifetime2 = 34;
          var6Lifetime2 = 200;
          var7Lifetime2 = 4 * this.field_n - 832;
          if (255 <= var7Lifetime2) {
            eh.a(0, lg.field_c, var5Lifetime2, 0, var15, var6Lifetime2);
          } else {
            if (var7Lifetime2 > 0) {
              for (var8 = 0; var8 < var15.length(); var8++) {
                stackIn_38_0 = 32;
                stackOut_32_1 = var15.charAt(var8);
                stackIn_38_1 = stackOut_32_1;
                stackIn_33_1 = stackOut_32_1;
                if (stackIn_38_0 != stackIn_33_1) {
                  lg.field_c.b(var5Lifetime2, var6Lifetime2, var7Lifetime2);
                  bi.field_a.a(var15.charAt(var8), var5Lifetime2 + lg.field_c.field_p / 2, (lg.field_c.field_u + pa.field_d) / 2 + var6Lifetime2, 0, var7Lifetime2);
                }
                var5Lifetime2 += 24;
              }
            }
          }
        }
        this.field_g.a(true, 13551);
        stackIn_38_0Lifetime1 = -3;
        stackIn_38_1Lifetime1 = ~this.field_K;
        if (stackIn_38_0Lifetime1 == stackIn_38_1Lifetime1 &&
          this.field_y != null) {
          var19 = new int[4];
          var11 = (bd) (this.field_y.a(true));
          while (var11 != null) {
            ca.a(12, var19, var11);
            this.a(var19, 371);
            var11 = (bd) (this.field_y.f(2));
          }
          if (25 < this.field_n) {
            stackIn_46_0 = 125 - this.field_n;
          } else {
            stackIn_46_0 = 75 + this.field_n;
          }
          var5Lifetime3 = stackIn_46_0 * 4096 / 100;
          th.field_l[this.field_l].a(this.field_o, this.field_V, 0, var5Lifetime3);
        }
        var10 = (vf) (this.field_B.a(true));
        while (var10 != null) {
          var10.a(17517, this.field_m, 0);
          var10 = (vf) (this.field_B.f(2));
        }
        lf.g(0, 8, 311, 450);
        if (param0 < 46) {
          return;
        }
        var12 = (gd) (this.field_j.a(true));
        while (var12 != null) {
          var12.a((byte) -34);
          var12 = (gd) (this.field_j.f(2));
        }
        lf.b();
        if (this.field_D) {
          bi.field_a.b("FPS: " + tj.field_i, 10, 3 * pa.field_d + 20, 0, -1);
          bi.field_a.b("LPS: " + ij.field_j, 10, pa.field_d * 4 + 25, 0, -1);
        }
        return;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        gd var2_ref_gd = (gd) (this.field_j.a(true));
        while (var2_ref_gd != null) {
          var2_ref_gd.c((byte) -55);
          this.field_i = this.field_i ^ var2_ref_gd.field_n;
          this.field_f = this.field_f ^ var2_ref_gd.field_n;
          var2_ref_gd = (gd) (this.field_j.f(2));
        }
        if (this.field_r < this.field_J) {
          var2 = (this.field_J - this.field_r) / 30;
          if (var2 < 1) {
            var2 = 1;
          }
          this.field_r = this.field_r + var2;
        }
        if (~this.field_r == ~this.field_J) {
          th.field_o[2].e(0);
        } else {
          na.a(2, true);
        }
        if (param0 != 2) {
          this.a(101, 119);
        }
    }

    private final void a(String[] param0, byte param1, int param2, String param3) {
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        char[] var6_ref_char__ = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0Lifetime1;
        int stackIn_3_1Lifetime1;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_g = new ha(this, param2, new char[]{param3.charAt(0), param3.charAt(1), param3.charAt(2), param3.charAt(3)});
          var5_int = 0;
          while (true) {
            stackIn_3_0 = ~param0.length;
            stackIn_3_1 = ~var5_int;
            if (stackIn_3_0 >= stackIn_3_1) {
              var6 = 29 % ((-65 - param1) / 33);
              return;
            }
            var6_ref_char__ = this.field_w[-1 + param0.length - var5_int];
            var7 = param0[var5_int].toUpperCase();
            for (var8 = 0; var7.length() > var8; var8++) {
              var9 = var7.charAt(var8);
              stackIn_3_0Lifetime1 = 65;
              stackIn_3_1Lifetime1 = var9;
              if (stackIn_3_0Lifetime1 <= stackIn_3_1Lifetime1 &&
                var9 <= 90) {
                var6_ref_char__[var8] = (char)var9;
              }
            }
            var5_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("fc.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
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
        int var3Lifetime1;
        int var3Lifetime2;
        db var9Lifetime1;
        db var9Lifetime2;
        var5 = Lexicominos.field_L ? 1 : 0;
        var6 = kf.field_A;
        for (var3 = 0; var6.length > var3; var3++) {
          var7 = var6[var3];
          var9 = var7;
          var9Lifetime2 = var7;
          var7.d(0, 0);
        }
        lf.g(125, 54, 221, 102);
        if (this.field_L > 0 &&
          this.field_L < 30 &&
          this.field_L % 10 < 5) {
          lf.a(0, 0, 640, 480, 16777215);
        }
        this.field_Q.a(false, 13551);
        lf.b();
        this.c((byte) 72);
        lf.g(60, 266 + this.field_M + 120, 252, 450);
        va.field_m.d(0, 0);
        if (param0 <= 54) {
          this.field_r = -50;
        }
        var8 = kf.field_A;
        for (var3Lifetime1 = 0; var8.length > var3Lifetime1; var3Lifetime1++) {
          var9Lifetime1 = var8[var3Lifetime1];
          var9Lifetime1.d(0, 0);
        }
        lf.b();
        oh.a(183, lg.field_c, false, Integer.toString(Math.abs(this.field_r)), 0, 230);
        if (this.field_s > 0 &&
          this.field_s < 30 &&
          5 > this.field_s % 10) {
          lf.a(53, 183, 48, 24, 16777215);
        }
        oh.a(183, lg.field_c, false, Integer.toString(this.field_d), 0, 77);
        var10 = (bd) (this.field_G.a(true));
        if (var10 != null) {
          var4 = 0;
          if (80 > this.field_H) {
            var3Lifetime2 = -32 + this.field_H / 2;
          } else {
            if (this.field_H < 230) {
              var3Lifetime2 = 8;
              if (94 < this.field_H &&
                this.field_H < 108) {
                var4 = 1;
              }
              if (this.field_H > 122 &&
                this.field_H < 136) {
                var4 = 1;
              }
            } else {
              var3Lifetime2 = -(this.field_H / 2) + 123;
            }
          }
          if (var4 == 0) {
            ef.field_d[var10.field_h].c(265, var3Lifetime2);
            bi.field_a.c(df.field_d[var10.field_h], 260, var3Lifetime2 + bi.field_a.field_E, 0, -1);
          }
        }
    }

    private final void a(int[] param0, int param1) {
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = -3 + (10 + 24 * param0[1]);
          var4 = 413 - param0[0] * 24;
          stackIn_4_0 = (param0[2] != 1) ? 0 : 3;
          var5 = stackIn_4_0;
          jj.field_f[var5].d(var3_int, var4);
          stackIn_7_0 = (param0[2] == 1) ? 0 : 24;
          var6 = stackIn_7_0;
          if (param1 != 371) {
            var11 = (String) null;
            this.a((String[]) null, (byte) 53, 106, (String) null);
          }
          stackIn_12_0 = (param0[3] != 1) ? 24 : 0;
          var7 = stackIn_12_0;
          if (param0[2] == 1) {
            stackIn_15_0 = param0[3];
          } else {
            stackIn_15_0 = param0[2];
          }
          var8 = stackIn_15_0;
          for (var9 = 1; var9 < (var8 - 1); var9++) {
            var3_int = var3_int + var6;
            var4 = var4 + var7;
            jj.field_f[1 + var5].d(var3_int, var4);
          }
          jj.field_f[2 + var5].d(var3_int + var6, var7 + var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("fc.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ng param0, char[][] param1, int[][] param2, int param3) {
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        bd var6_ref_bd = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_11_0Lifetime1;
        int stackIn_11_1Lifetime1;
        int var5Lifetime1;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = (ij) (param0.a(true));
          while (var4 != null) {
            var5 = var4.field_q;
            var6_ref_bd = (bd) (var4.field_s.a(true));
            while (var6_ref_bd != null) {
              param2[(var6_ref_bd.field_h >> 16) - var5][vg.a(65535, var6_ref_bd.field_h)] = var5 * 24;
              var6_ref_bd = (bd) (var4.field_s.f(param3 ^ 11880));
            }
            var4 = (ij) (param0.f(2));
          }
          if (param3 != 11882) {
            return;
          }
          var4_int = param1.length;
          var5Lifetime1 = param1[0].length;
          var6 = 0;
          while (true) {
            stackIn_11_0 = var6;
            stackIn_11_1 = var4_int;
            if (stackIn_11_0 >= stackIn_11_1) {
              return;
            }
            for (var7 = 0; var5Lifetime1 > var7; var7++) {
              stackIn_11_0Lifetime1 = 0;
              stackIn_11_1Lifetime1 = param2[var6][var7];
              if (stackIn_11_0Lifetime1 != stackIn_11_1Lifetime1) {
                var8 = var6 + param2[var6][var7] / 24;
                param1[var6][var7] = param1[var8][var7];
                param1[var8][var7] = (char)0;
              }
            }
            var6++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("fc.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2;
        vf var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = -6 / ((-30 - param0) / 36);
        var3 = (vf) (this.field_B.a(true));
        while (var3 != null) {
          if (var3.field_i >= 371 &&
            var3.field_n >= (266 - (-this.field_M - 120))) {
            var3.b((byte) -121);
          } else {
            var3.a(17517, this.field_m, -311);
          }
          var3 = (vf) (this.field_B.f(2));
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == this.field_K) {
          return;
        }
        var3 = this.field_K;
        if (var3 == 1) {
          this.field_l = 0;
        }
        this.field_K = param1;
        if (param0 != 99) {
          this.c(26);
        }
        var3Lifetime1 = this.field_K;
        if (var3Lifetime1 != 1) {
          if (var3Lifetime1 != 2) {
            if (var3Lifetime1 == 3) {
              this.field_p = 1;
            } else {
              if (var3Lifetime1 == 4) {
                if (this.field_J > 0 &&
                  !ki.a((byte) -115) &&
                  this.field_b == -1 &&
                  !this.field_h) {
                  ki.field_d = gl.a(65526, 9, this.field_i, 3, this.field_f, (byte) 56, this.field_R, new int[]{64 * this.field_J + this.field_m.field_i}, this.field_a);
                }
                nh.a(0, 1000000, 7, true);
              }
            }
          } else {
            this.field_y = null;
          }
        } else {
          if (vb.field_i >= 2) {
            if (this.field_X.length() > 234) {
              this.field_C = this.field_X.toString();
            }
            this.field_X = new StringBuilder(266);
          }
        }
        return;
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
          this.field_R = 268870237 + param1.field_i;
          this.field_g = new ha(this);
          this.field_Q = new ha(this);
          if (vb.field_i >= 2) {
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
