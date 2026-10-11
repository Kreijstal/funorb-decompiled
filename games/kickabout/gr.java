/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gr {
    tf field_O;
    int field_w;
    int field_o;
    private int field_f;
    int[] field_q;
    tf field_g;
    private int field_j;
    private long field_H;
    boolean[] field_J;
    private int field_D;
    private boolean field_I;
    boolean field_m;
    int field_r;
    private int field_B;
    boolean field_L;
    private int field_h;
    int field_p;
    boolean[][] field_a;
    private boolean field_M;
    int field_t;
    long field_e;
    static String field_v;
    private int field_G;
    boolean field_d;
    private boolean field_P;
    private int field_C;
    static int field_y;
    static r field_c;
    int[] field_N;
    int field_E;
    private int field_u;
    boolean field_A;
    int field_n;
    private int field_b;
    int field_F;
    int field_R;
    private int field_z;
    up[] field_i;
    int field_K;
    private int field_s;
    int field_x;
    static String field_Q;
    int field_k;
    static String[] field_l;

    final boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Kickabout.field_G;
        var2 = -122 / ((2 - param0) / 36);
        if (this.c(-3)) {
          for (var3 = 0; this.field_i.length > var3; var3++) {
            if (!this.field_i[var3].c(-2) &&
              !this.a((byte) 45, var3)) {
              return true;
            }
          }
        }
        return false;
    }

    final boolean a(byte param0, int param1) {
        int var3 = -58 % ((param0 + 42) / 59);
        return this.b((byte) -105, param1) != null ? true : false;
    }

    gr(long param0) {
        this();
        this.field_e = param0;
        this.b(-27595);
    }

    final boolean a(int param0) {
        int var3 = Kickabout.field_G;
        cq var2 = (cq) (this.field_O.g(24009));
        while (var2 != null) {
          if (var2.field_k != 3) {
            return true;
          }
          var2 = (cq) (this.field_O.c(33));
        }
        if (param0 != -4) {
          return false;
        }
        return false;
    }

    final boolean c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        cq var3 = (cq) (this.field_O.g(24009));
        while (var3 != null) {
          if (var3.field_k != 3) {
            var2++;
          }
          var3 = (cq) (this.field_O.c(param0 ^ -36));
        }
        if (param0 != -3) {
          this.c(-68);
        }
        return 5 > var2 ? true : false;
    }

    public static void b(byte param0) {
        field_l = null;
        field_c = null;
        field_v = null;
        field_Q = null;
        if (param0 != 0) {
          gr.b((byte) 10);
        }
    }

    final void a(gr param0, byte param1) {
        int var4_int = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        cq var3 = null;
        RuntimeException var3_ref = null;
        cq var4 = null;
        pt var5 = null;
        int var6 = 0;
        iw var7 = null;
        pt var8 = null;
        up var9 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        var6 = Kickabout.field_G;
        try {
          this.field_h = param0.field_h;
          this.field_s = param0.field_s;
          this.field_R = param0.field_R;
          this.field_M = param0.field_M;
          this.field_k = param0.field_k;
          this.field_t = param0.field_t;
          this.field_e = param0.field_e;
          this.field_E = param0.field_E;
          this.field_x = param0.field_x;
          this.field_m = param0.field_m;
          this.field_G = param0.field_G;
          this.field_r = param0.field_r;
          this.field_w = param0.field_w;
          for (var3_int = 0; var3_int < 3; var3_int++) {
            for (var4_int = 0; var4_int < 4; var4_int++) {
              this.field_a[var3_int][var4_int] = param0.field_a[var3_int][var4_int];
            }
          }
          this.field_o = param0.field_o;
          this.field_K = param0.field_K;
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 9; var3_intLifetime1++) {
            if (null == this.field_i[var3_intLifetime1]) {
              this.field_i[var3_intLifetime1] = new up();
            }
            this.field_i[var3_intLifetime1].a((byte) -61, param0.field_i[var3_intLifetime1]);
            this.field_q[var3_intLifetime1] = param0.field_q[var3_intLifetime1];
          }
          this.field_O = new tf();
          var3 = (cq) (param0.field_O.g(24009));
          while (var3 != null) {
            var4 = new cq(var3.field_k, var3.field_l, var3.field_i);
            this.field_O.a(var4, 3);
            var3 = (cq) (param0.field_O.c(33));
          }
          this.field_g = new tf();
          var8 = (pt) (param0.field_g.g(24009));
          while (var8 != null) {
            var9 = new up();
            var9.a((byte) -65, var8.e(-128));
            var5 = new pt(var8.a(-29), var8.f((byte) 37), var8.f(3), var8.b(6), var9);
            this.field_g.a(var5, 3);
            var8 = (pt) (param0.field_g.c(33));
          }
          this.field_p = param0.field_p;
          this.field_F = param0.field_F;
          for (var3_intLifetime2 = 0; var3_intLifetime2 < this.field_J.length; var3_intLifetime2++) {
            this.field_J[var3_intLifetime2] = param0.field_J[var3_intLifetime2];
          }
          if (param1 < 12) {
            var7 = (iw) null;
            this.a(63, (iw) null, 110);
          }
          this.field_B = param0.field_B;
          this.field_H = param0.field_H;
          this.field_L = param0.field_L;
          this.field_b = param0.field_b;
          this.field_C = param0.field_C;
          this.field_z = param0.field_z;
          this.field_d = param0.field_d;
          this.field_A = param0.field_A;
          for (var3_intLifetime3 = 0; var3_intLifetime3 < this.field_N.length; var3_intLifetime3++) {
            this.field_N[var3_intLifetime3] = param0.field_N[var3_intLifetime3];
          }
          this.field_f = param0.field_f;
          this.field_P = param0.field_P;
          this.field_u = param0.field_u;
          this.field_j = param0.field_j;
          this.field_D = param0.field_D;
          this.field_n = param0.field_n;
          this.field_I = param0.field_I;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_31_0 = var3_ref;
          stackIn_31_1 = new StringBuilder().append("gr.N(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        String var1;
        int var2;
        int var3;
        int var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var10;
        String var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        StringBuilder stackIn_49_0 = null;
        String stackIn_50_1 = null;
        StringBuilder stackIn_52_0 = null;
        String stackIn_53_1 = null;
        int var4;
        cq var4_ref_cq;
        pt var4_ref_pt;
        String var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        String var42;
        String var43;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        String var1Lifetime4;
        String var1Lifetime5;
        String var1Lifetime6;
        String var1Lifetime7;
        String var1Lifetime8;
        String var1Lifetime9;
        String var1Lifetime10;
        String var1Lifetime11;
        String var1Lifetime12;
        String var1Lifetime13;
        String var1Lifetime14;
        String var1Lifetime15;
        String var1Lifetime16;
        String var1Lifetime17;
        String var1Lifetime18;
        String var1Lifetime19;
        String var1Lifetime20;
        String var1Lifetime21;
        String var1Lifetime22;
        String var1Lifetime23;
        String var1Lifetime24;
        String var1Lifetime25;
        String var1Lifetime26;
        String var1Lifetime27;
        String var1Lifetime28;
        String var1Lifetime29;
        String var1Lifetime30;
        String var1Lifetime31;
        String var1Lifetime32;
        String var1Lifetime33;
        String var1Lifetime34;
        String var1Lifetime35;
        String var1Lifetime36;
        String var1Lifetime37;
        String var1Lifetime38;
        String var1Lifetime39;
        String var1Lifetime40;
        String var1Lifetime41;
        String var1Lifetime42;
        String var1Lifetime43;
        String var1Lifetime44;
        String var1Lifetime45;
        String var1Lifetime46;
        String var1Lifetime47;
        String var1Lifetime48;
        String var1Lifetime49;
        String var1Lifetime50;
        String var1Lifetime51;
        String var22Lifetime1;
        String var22Lifetime2;
        String var22Lifetime3;
        String var25Lifetime1;
        String var25Lifetime2;
        String var27Lifetime1;
        String var27Lifetime2;
        String var27Lifetime3;
        var5 = Kickabout.field_G;
        var6 = "=====PROFILE[" + su.a(0, this.field_e) + "]=====\n";
        var1 = var6;
        var1Lifetime1 = var6;
        if (this.field_M) {
          var1Lifetime2 = var6 + "Active - Yes\n";
        } else {
          var1Lifetime2 = var6 + "Active - No\n";
        }
        var7 = var1Lifetime2 + "Created - " + this.field_h;
        var1Lifetime3 = var7;
        var1Lifetime4 = var7;
        var8 = var7 + "\n";
        var1Lifetime5 = var8;
        var1Lifetime6 = var8;
        var9 = var8 + "League Week - " + this.field_G + "\n";
        var1Lifetime7 = var9;
        var1Lifetime8 = var9;
        var10 = var9 + "Pts - " + this.field_E + "\n";
        var1Lifetime9 = var10;
        var1Lifetime10 = var10;
        var11 = var10 + "Diamond Pts - " + this.field_r + "\n";
        var1Lifetime11 = var11;
        var1Lifetime12 = var11;
        var12 = var11 + "League - " + q.field_h[this.field_t] + "\n";
        var1Lifetime13 = var12;
        var1Lifetime14 = var12;
        var13 = var12 + "Trophies - " + this.field_s + "\n";
        var1Lifetime15 = var13;
        var1Lifetime16 = var13;
        if (!this.field_m) {
          var1Lifetime17 = var13 + "Diamond Win Dialog - No\n";
        } else {
          var1Lifetime17 = var13 + "Diamond Win Dialog - Yes\n";
        }
        var14 = var1Lifetime17 + "\n";
        var1Lifetime18 = var14;
        var1Lifetime19 = var14;
        var15 = var14 + "Money - " + ad.a(this.field_x, 26300) + "\n";
        var1Lifetime20 = var15;
        var1Lifetime21 = var15;
        var16 = var15 + "\n";
        var1Lifetime22 = var16;
        var1Lifetime23 = var16;
        var17 = var16 + "Kit ID - " + this.field_w + "\n";
        var1Lifetime24 = var17;
        var1Lifetime25 = var17;
        var18 = var17 + "Pri Col - " + this.field_k + "\n";
        var1Lifetime26 = var18;
        var1Lifetime27 = var18;
        var19 = var18 + "Sec Col - " + this.field_R + "\n";
        var1Lifetime28 = var19;
        var1Lifetime29 = var19;
        var1Lifetime30 = var19 + "\n";
        for (var2 = 0; var2 < 3; var2++) {
          var1Lifetime30 = var1Lifetime30 + "Bought Stadiums [" + var2 + "] - ";
          for (var3 = 0; var3 < 4; var3++) {
            if (!this.field_a[var2][var3]) {
              var1Lifetime30 = var1Lifetime30 + "0,";
            } else {
              var1Lifetime30 = var1Lifetime30 + "1,";
            }
          }
          var1Lifetime30 = var1Lifetime30 + "\n";
        }
        var20 = var1Lifetime30 + "Surface - " + this.field_K + "\n";
        var22 = var20;
        var1Lifetime31 = var22;
        var1Lifetime32 = var20;
        var21 = var20 + "Tier - " + this.field_o + "\n";
        var22Lifetime1 = var21;
        var1Lifetime33 = var22Lifetime1;
        var1Lifetime34 = var21;
        var1Lifetime35 = var21 + "\n";
        var22Lifetime2 = var1Lifetime35;
        var1Lifetime36 = var22Lifetime2;
        for (var2Lifetime1 = 0; var2Lifetime1 < 9; var2Lifetime1++) {
          var22Lifetime3 = var1Lifetime36 + "Team Member [" + var2Lifetime1 + "]\n";
          var1Lifetime36 = var22Lifetime3;
          var1Lifetime36 = var22Lifetime3;
          var23 = var22Lifetime3 + this.field_i[var2Lifetime1] + "\n";
          var1Lifetime36 = var23;
          var1Lifetime36 = var23;
          var1Lifetime36 = var23 + "Render Order - " + this.field_q[var2Lifetime1] + "\n";
        }
        var2Lifetime2 = 0;
        var3Lifetime1 = 0;
        for (var4 = 0; this.field_N.length > var4; var4++) {
          if (var2Lifetime2 % 8 == 0) {
            incrementValue$2 = var3Lifetime1;
            var3Lifetime1++;
            var1Lifetime36 = var1Lifetime36 + "\nShop Transaction [" + incrementValue$2 + "] ";
          }
          var1Lifetime36 = var1Lifetime36 + this.field_N[var4];
          var2Lifetime2++;
        }
        var24 = var1Lifetime36 + "\n";
        var25 = var24;
        var1Lifetime37 = var25;
        var1Lifetime38 = var24 + "Auction Log Size - " + this.field_O.a(false) + "\n";
        var25Lifetime1 = var1Lifetime38;
        var1Lifetime39 = var25Lifetime1;
        var2Lifetime3 = 0;
        var4_ref_cq = (cq) (this.field_O.g(24009));
        while (var4_ref_cq != null) {
          incrementValue$1 = var2Lifetime3;
          var2Lifetime3++;
          var25Lifetime2 = var1Lifetime39 + "   Log [" + incrementValue$1 + "]\n";
          var27 = var25Lifetime2;
          var1Lifetime39 = var27;
          var1Lifetime39 = var25Lifetime2;
          var1Lifetime39 = var25Lifetime2 + "   " + var4_ref_cq + "\n";
          var4_ref_cq = (cq) (this.field_O.c(33));
        }
        var26 = var1Lifetime39 + "\n";
        var27Lifetime1 = var26;
        var1Lifetime40 = var27Lifetime1;
        var1Lifetime41 = var26;
        var2Lifetime4 = 0;
        var1Lifetime42 = var26 + "Resolve Log Size - " + this.field_g.a(false) + "\n";
        var27Lifetime2 = var1Lifetime42;
        var1Lifetime43 = var27Lifetime2;
        var4_ref_pt = (pt) (this.field_g.g(24009));
        while (var4_ref_pt != null) {
          incrementValue$0 = var2Lifetime4;
          var2Lifetime4++;
          var27Lifetime3 = var1Lifetime43 + "   Log [" + incrementValue$0 + "]\n";
          var1Lifetime43 = var27Lifetime3;
          var1Lifetime43 = var27Lifetime3;
          var1Lifetime43 = var27Lifetime3 + "   " + var4_ref_pt + "\n";
          var4_ref_pt = (pt) (this.field_g.c(33));
        }
        var28 = var1Lifetime43 + "\n";
        var1Lifetime44 = var28;
        var1Lifetime45 = var28;
        var29 = var28 + "SFX Vol - " + this.field_F + "\n";
        var1Lifetime46 = var29;
        var1Lifetime47 = var29;
        var30 = var29 + "Music Vol - " + this.field_p + "\n";
        var1Lifetime48 = var30;
        var1Lifetime49 = var30;
        var1Lifetime50 = var30 + "Help Flags  - ";
        for (var4Lifetime1 = 0; var4Lifetime1 < this.field_J.length; var4Lifetime1++) {
          if (!this.field_J[var4Lifetime1]) {
            var1Lifetime50 = var1Lifetime50 + "0,";
          } else {
            var1Lifetime50 = var1Lifetime50 + "1,";
          }
        }
        var1Lifetime50 = var1Lifetime50 + "\n";
        if (!this.field_d) {
          var1Lifetime50 = var1Lifetime50 + "Lock Mouse - No\n";
        } else {
          var1Lifetime50 = var1Lifetime50 + "Lock Mouse - Yes\n";
        }
        if (this.field_A) {
          var1Lifetime50 = var1Lifetime50 + "Autopass - Yes\n";
        } else {
          var1Lifetime50 = var1Lifetime50 + "Autopass - No\n";
        }
        if (!this.field_L) {
          var1Lifetime50 = var1Lifetime50 + "GFX - Low\n";
        } else {
          var1Lifetime50 = var1Lifetime50 + "GFX - High\n";
        }
        var31 = var1Lifetime50 + "\n";
        var32 = var31 + "Team Wins - " + this.field_C + "\n";
        var33 = var32 + "Stadium Wins - " + Integer.toBinaryString(this.field_b) + "\n";
        var34 = var33 + "Formation Wins - " + Integer.toBinaryString(this.field_B) + "\n";
        var35 = var34 + "Total Goals - " + this.field_z + "\n";
        var36 = var35 + "Total Halloween Goals - " + this.field_j + "\n";
        var37 = var36 + "Total 8+ Tournament Wins - " + this.field_u + "\n";
        var38 = var37 + "Total 8+ Tournament Knockouts - " + this.field_D + "\n";
        var39 = var38 + "Nemesis - " + su.a(0, this.field_H) + "\n";
        var40 = var39 + "\n";
        var41 = var40 + "Misc Unlockables - " + Integer.toBinaryString(this.field_n) + "\n";
        stackIn_49_0 = new StringBuilder().append(var41).append("Refunded Trinkets? - ");
        if (!this.field_I) {
          stackIn_50_1 = "NO";
        } else {
          stackIn_50_1 = "YES";
        }
        var42 = ((StringBuilder) (Object) stackIn_49_0).append(stackIn_50_1).append("\n").toString();
        stackIn_52_0 = new StringBuilder().append(var42).append("Refund Confirmed? - ");
        if (!this.field_P) {
          stackIn_53_1 = "NO";
        } else {
          stackIn_53_1 = "YES";
        }
        var43 = ((StringBuilder) (Object) stackIn_52_0).append(stackIn_53_1).append("\n").toString();
        var1Lifetime51 = var43 + "Refund Amount - £" + Integer.toString(this.field_f) + "\n";
        return var1Lifetime51;
    }

    private final boolean a(int param0, int param1) {
        if (param0 != -2) {
          this.field_t = 42;
        }
        return (1 & this.field_n >> param1) == 1 ? true : false;
    }

    final int d(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param0;
        if (this.c(-3)) {
          for (var3 = 0; var3 < this.field_i.length; var3++) {
            if (this.field_i[var3].c(-2)) {
              return var3;
            }
          }
        }
        return var2;
    }

    final boolean a(long param0, byte param1) {
        int var5 = Kickabout.field_G;
        if (param1 != -79) {
          this.field_P = false;
        }
        cq var4 = (cq) (this.field_O.g(24009));
        while (var4 != null) {
          if ((var4.field_k == 0 || var4.field_k == 1) &&
            ~param0 == ~var4.field_i) {
            return true;
          }
          var4 = (cq) (this.field_O.c(33));
        }
        return false;
    }

    private final void b(int param0) {
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        up var11;
        int var12;
        up var13;
        Random var14;
        up var15;
        int var4Lifetime1;
        var10 = Kickabout.field_G;
        var14 = new Random(this.field_e);
        var3 = dq.$cfr$intArgs$a$7f8aad568c81(-60, 3, var14);
        this.field_w = dq.$cfr$intArgs$a$7f8aad568c81(91, 3, var14);
        this.field_k = dq.$cfr$intArgs$a$7f8aad568c81(97, 16, var14) + 16;
        this.field_R = dq.$cfr$intArgs$a$7f8aad568c81(127, 16, var14);
        if (param0 != -27595) {
          this.field_E = -108;
        }
        for (var4 = 0; 4 > var4; var4++) {
          var13 = new up();
          var15 = var13;
          if (var4 == 0) {
            var13.field_q = 0;
          }
          if (1 == var4) {
            if (0 != var3) {
              var15.field_q = 3;
            } else {
              var13.field_q = 0;
            }
          }
          if (var4 == 2) {
            if (var3 != 2) {
              var15.field_q = 3;
            } else {
              var15.field_q = 1;
            }
          }
          if (var4 == 3) {
            var15.field_q = 1;
          }
          var15.field_e = dq.$cfr$intArgs$a$7f8aad568c81(79, td.field_a.length, var14);
          var15.field_l = 1 + dq.$cfr$intArgs$a$7f8aad568c81(106, -1 + ce.field_G[var15.field_q].length, var14);
          var15.field_n = dq.$cfr$intArgs$a$7f8aad568c81(-86, 10, var14) + 6;
          var15.field_o = dq.$cfr$intArgs$a$7f8aad568c81(97, 10, var14) + 6;
          var15.field_g = 6 + dq.$cfr$intArgs$a$7f8aad568c81(-111, 10, var14);
          var15.field_r = 0;
          var15.field_h = new int[1];
          var15.field_h[0] = 0;
          var6 = dq.$cfr$intArgs$a$7f8aad568c81(84, 5, var14);
          var7 = dq.$cfr$intArgs$a$7f8aad568c81(-70, 3, var14);
          var8 = dq.$cfr$intArgs$a$7f8aad568c81(-57, 3, var14);
          var9 = var8;
          var9 = var9 | var7 << 4;
          var9 = var9 | var6 << 8;
          var15.field_j = var9;
          this.field_i[var4] = var15;
        }
        var12 = 4;
        var4Lifetime1 = var12;
        while (var12 < this.field_i.length) {
          var11 = new up();
          this.field_i[var12] = var11;
          var12++;
        }
    }

    final hn a(int param0, int param1, int param2) {
        if (param1 > -55) {
          return (hn) null;
        }
        int[] var6 = new int[9];
        int[] var4 = var6;
        dv.a(this.field_q, 0, var6, 0, 9);
        int var5 = var6[param2];
        var6[param2] = var6[param0];
        var6[param0] = var5;
        return new hn(9, var6);
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15) {
            field_l = (String[]) null;
          }
          stackIn_3_0 = vl.a(10, true, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gr.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Kickabout.field_G;
        var2 = 0;
        if (param0 < 3) {
          this.d((byte) -19);
        }
        for (var3 = 0; var3 < 9; var3++) {
          if (!this.field_i[var3].c(-2) &&
            !this.a((byte) -121, var3)) {
            var2++;
          }
        }
        return !(4 > var2);
    }

    final boolean a(int param0, long param1) {
        int var5 = Kickabout.field_G;
        cq var4 = (cq) (this.field_O.g(24009));
        while (var4 != null) {
          if (var4.field_k == 2 &&
            ~param1 == ~var4.field_i) {
            return true;
          }
          var4 = (cq) (this.field_O.c(param0 ^ 32));
        }
        if (param0 != 1) {
          this.field_t = -7;
          return false;
        }
        return false;
    }

    final boolean b(int param0, long param1) {
        int var5 = Kickabout.field_G;
        cq var4 = (cq) (this.field_O.g(param0 - 6515));
        while (var4 != null) {
          if (var4.field_k == 3 &&
            var4.field_i == param1) {
            return true;
          }
          var4 = (cq) (this.field_O.c(33));
        }
        if (param0 != 30524) {
          this.a(-50, 63, 62);
          return false;
        }
        return false;
    }

    final cq b(byte param0, int param1) {
        int var4 = Kickabout.field_G;
        cq var3_ref_cq = (cq) (this.field_O.g(24009));
        while (var3_ref_cq != null) {
          if (var3_ref_cq.field_k != 3 &&
            param1 == var3_ref_cq.field_l) {
            return var3_ref_cq;
          }
          var3_ref_cq = (cq) (this.field_O.c(33));
        }
        int var3 = 120 / ((-34 - param0) / 56);
        return null;
    }

    final void a(hn param0, boolean param1, int param2) {
        up dupTemp$0 = null;
        up dupTemp$1 = null;
        up dupTemp$2 = null;
        up dupTemp$3 = null;
        boolean stackIn_23_0 = false;
        boolean stackIn_35_0 = false;
        int stackIn_40_0 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_131_0 = 0;
        RuntimeException stackIn_175_0 = null;
        StringBuilder stackIn_175_1 = null;
        String stackIn_176_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_125_0;
        boolean stackOut_34_0;
        boolean stackOut_22_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean[] var6_ref_boolean__ = null;
        int var7 = 0;
        up var7_ref_up = null;
        int var8 = 0;
        fn var9 = null;
        int var9_int = 0;
        fn var10 = null;
        int var10_int = 0;
        int var11 = 0;
        up var12 = null;
        up var13 = null;
        int var14 = 0;
        int[] var21 = null;
        int[] var22 = null;
        up var7_ref_upLifetime1;
        int stackIn_40_0Lifetime1;
        int stackIn_131_0Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var10_intLifetime1;
        int stackIn_40_0Lifetime2;
        var11 = Kickabout.field_G;
        try {
          var4_int = param0.field_i;
          if (param2 <= var4_int &&
            var4_int < 10) {
            if (var4_int == 0) {
              var5 = -1 + param0.field_g[0];
              var6 = param0.field_g[1];
              if (var6 >= 0 &&
                var6 < 8) {
                if (var5 >= -1 &&
                  var5 < 7) {
                  boolean decompiledFrameRemainder0 = true;
                  boolean decompiledFrameCompleted0 = true;
                  if (-1 != var5) {
                    var13 = ha.a(this.field_e, var6, this.field_N[var6 + (8 + var5 * 8)], -50, var5);
                    var7_ref_up = var13;
                    var8 = 0;
                    if (-1 != var5) {
                      var8 = gp.a(var7_ref_up, -576054046);
                    }
                    if (var8 > this.field_x) {
                      throw new IllegalStateException("User bought a player but did not have enough money" + param0.toString());
                    }
                    var9_int = 0;
                    var14 = 0;
                    var10_int = var14;
                    boolean decompiledNaturalLoopExit0 = false;
                    while (!(decompiledNaturalLoopExit0 = (9 <= var14))) {
                      stackOut_34_0 = this.field_i[this.field_q[var14]].c(param2 ^ -2);
                      stackIn_40_0 = stackOut_34_0 ? 1 : 0;
                      stackIn_35_0 = stackOut_34_0;
                      if (!stackIn_35_0) {
                        var14++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledNaturalLoopExit0) {
                      decompiledFrameCompleted0 = false;
                    }
                    if (decompiledFrameCompleted0) {
                      this.field_i[this.field_q[var14]].a((byte) -70, var13);
                      this.field_i[this.field_q[var14]].field_c = false;
                      var9_int = 1;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted0)) {
                    if (!param1) {
                      throw new IllegalStateException("User tried to buy a MOD player when they are not a MOD" + param0.toString());
                    }
                    var12 = ha.a(this.field_e, var6, this.field_N[var6 + (8 + var5 * 8)], -50, var5);
                    var7_ref_upLifetime1 = var12;
                    var8 = 0;
                    if (-1 != var5) {
                      var8 = gp.a(var7_ref_upLifetime1, -576054046);
                    }
                    if (var8 > this.field_x) {
                      throw new IllegalStateException("User bought a player but did not have enough money" + param0.toString());
                    }
                    var9_int = 0;
                    var10_intLifetime1 = 0;
                    while (9 > var10_intLifetime1) {
                      stackOut_22_0 = this.field_i[this.field_q[var10_intLifetime1]].c(param2 ^ -2);
                      stackIn_40_0Lifetime2 = stackOut_22_0 ? 1 : 0;
                      stackIn_23_0 = stackOut_22_0;
                      if (!stackIn_23_0) {
                        var10_intLifetime1++;
                        continue;
                      }
                      this.field_i[this.field_q[var10_intLifetime1]].a((byte) -70, var12);
                      this.field_i[this.field_q[var10_intLifetime1]].field_c = false;
                      var9_int = 1;
                      break;
                    }
                  }
                  stackIn_40_0Lifetime1 = var9_int;
                  if (stackIn_40_0Lifetime1 == 0) {
                    throw new IllegalStateException("User tried to buy a player but does not have an empty slot" + param0.toString());
                  }
                  this.field_x = this.field_x - var8;
                  this.field_N[8 * var5 + 8 + var6] = this.field_N[8 * var5 + 8 + var6] + 1;
                  return;
                }
                throw new IllegalStateException("User tried to buy a league player from a nonexistant league " + param0.toString());
              }
              throw new IllegalStateException("User tried to buy a player not in the shop seg size " + param0.toString());
            }
            if (1 == var4_int) {
              var5Lifetime1 = param0.field_g[0];
              if (var5Lifetime1 >= 0 &&
                var5Lifetime1 < 9) {
                if (this.field_i[var5Lifetime1].c(param2 - 2)) {
                  throw new IllegalStateException("User tried to sell an empty player " + param0.toString());
                }
                if (this.a((byte) -112, var5Lifetime1)) {
                  throw new IllegalStateException("User tried to sell a player in auction " + param0.toString());
                }
                this.field_x = this.field_x + dh.a(this.field_i[var5Lifetime1], true);
                this.field_i[var5Lifetime1] = new up();
                return;
              }
              throw new IllegalStateException("User tried to sell a player not in the TEAM " + param0.toString());
            }
            if (var4_int == 2) {
              var5Lifetime2 = param0.field_g[0];
              var6Lifetime1 = param0.field_g[1];
              var7 = param0.field_g[2];
              var21 = this.field_i[var5Lifetime2].field_h;
              if (var5Lifetime2 >= 0 &&
                var5Lifetime2 < 9) {
                if (var6Lifetime1 >= 0 &&
                  var6Lifetime1 < var21.length) {
                  if (var7 >= 0 &&
                    111 > var7) {
                    var9 = pa.field_g[var7];
                    var10 = pa.field_g[var21[var6Lifetime1]];
                    if (var9.field_h == 73 &&
                      !il.b((byte) 115)) {
                      throw new IllegalStateException("User tried to use the Halloween Costume trinket when we haven't released it yet " + param0.toString());
                    }
                    if (var9.field_k != var10.field_k) {
                      throw new IllegalStateException("User tried to attach a trinket that is the wrong shape for the slot " + param0.toString());
                    }
                    if (72 == var9.field_h &&
                      !this.a(-2, 0)) {
                      throw new IllegalStateException("User tried to attach Pumpkins trinket but they haven't unlocked the Halloween Achievement " + param0.toString());
                    }
                    if (this.field_x < var9.field_e) {
                      throw new IllegalStateException("User attached a trinket but could not afford it " + param0.toString());
                    }
                    this.field_x = this.field_x - var9.field_e;
                    var21[var6Lifetime1] = var7;
                    return;
                  }
                  throw new IllegalStateException("User tried to attach an unknown trinket " + param0.toString());
                }
                throw new IllegalStateException("User tried to attach a trinket to a slot in invalid position " + param0.toString());
              }
              throw new IllegalStateException("User tried to attach a trinket to a player from an invalid position " + param0.toString());
            }
            if (var4_int == 3) {
              var5Lifetime3 = param0.field_g[0];
              var6Lifetime2 = param0.field_g[1];
              if (0 <= var5Lifetime3 &&
                var5Lifetime3 < 9) {
                if (var6Lifetime2 >= 0 &&
                  var6Lifetime2 <= 2) {
                  if (this.field_i[var5Lifetime3].c(-2)) {
                    throw new IllegalStateException("User tried to level up an empty player " + param0.toString());
                  }
                  if (this.field_i[var5Lifetime3].field_r < 100) {
                    throw new IllegalStateException("User tried to level up a player who doesn't have 100 exp " + param0.toString());
                  }
                  if (var6Lifetime2 == 0) {
                    if (this.field_i[var5Lifetime3].field_n >= 100) {
                      throw new IllegalStateException("User tried to level up a POW which is max " + param0.toString());
                    }
                    dupTemp$0 = this.field_i[var5Lifetime3];
                    dupTemp$0.field_n = dupTemp$0.field_n + 1;
                  } else {
                    if (var6Lifetime2 == 1) {
                      if (this.field_i[var5Lifetime3].field_g >= 100) {
                        throw new IllegalStateException("User tried to level up a SPD which is max " + param0.toString());
                      }
                      dupTemp$1 = this.field_i[var5Lifetime3];
                      dupTemp$1.field_g = dupTemp$1.field_g + 1;
                    } else {
                      if (var6Lifetime2 == 2) {
                        if (this.field_i[var5Lifetime3].field_o >= 100) {
                          throw new IllegalStateException("User tried to level up a TCK which is max " + param0.toString());
                        }
                        dupTemp$2 = this.field_i[var5Lifetime3];
                        dupTemp$2.field_o = dupTemp$2.field_o + 1;
                      }
                    }
                  }
                  dupTemp$3 = this.field_i[var5Lifetime3];
                  dupTemp$3.field_r = dupTemp$3.field_r - 100;
                  return;
                }
                throw new IllegalStateException("User tried to level up an invalid stat " + param0.toString());
              }
              throw new IllegalStateException("User tried to level up a player from an invalid position " + param0.toString());
            }
            if (var4_int == 4) {
              var5Lifetime4 = param0.field_g[0];
              if (var5Lifetime4 >= 0 &&
                var5Lifetime4 < je.field_g.length) {
                this.field_w = var5Lifetime4;
                return;
              }
              throw new IllegalStateException("User tried to select a kit that doesn't exist " + param0.toString());
            }
            if (var4_int == 5) {
              var5Lifetime5 = param0.field_g[0];
              if (var5Lifetime5 >= 0 &&
                32 > var5Lifetime5) {
                this.field_k = var5Lifetime5;
                return;
              }
              throw new IllegalStateException("User tried to select a Primary Colour that doesn't exist " + param0.toString());
            }
            if (var4_int == 6) {
              var5Lifetime6 = param0.field_g[0];
              if (0 <= var5Lifetime6 &&
                var5Lifetime6 < 32) {
                this.field_R = var5Lifetime6;
                return;
              }
              throw new IllegalStateException("User tried to select a Secondary Colour that doesn't exist " + param0.toString());
            }
            if (var4_int == 7) {
              var5Lifetime7 = param0.field_g[0];
              var6Lifetime3 = param0.field_g[1];
              if (var5Lifetime7 >= 0 &&
                var5Lifetime7 <= 2) {
                if (var6Lifetime3 >= 0 &&
                  var6Lifetime3 <= 3) {
                  if (this.field_a[var5Lifetime7][var6Lifetime3]) {
                    throw new IllegalStateException("User tried to buy a Pitch they already own " + param0.toString());
                  }
                  if (var6Lifetime3 > 0 &&
                    !this.field_a[var5Lifetime7][-1 + var6Lifetime3]) {
                    throw new IllegalStateException("User tried to buy a Pitch when they don't own the previous tier " + param0.toString());
                  }
                  var7Lifetime1 = cm.field_M[var6Lifetime3];
                  if (var7Lifetime1 > this.field_x) {
                    throw new IllegalStateException("User bought a Pitch but could not afford it " + param0.toString());
                  }
                  this.field_x = this.field_x - var7Lifetime1;
                  this.field_a[var5Lifetime7][var6Lifetime3] = true;
                  this.field_o = var6Lifetime3;
                  this.field_K = var5Lifetime7;
                  return;
                }
                throw new IllegalStateException("User tried to buy a Tier that doesn't exist " + param0.toString());
              }
              throw new IllegalStateException("User tried to buy a Surface that doesn't exist " + param0.toString());
            }
            if (8 == var4_int) {
              var5Lifetime8 = param0.field_g[0];
              var6Lifetime4 = param0.field_g[1];
              if (var5Lifetime8 >= 0 &&
                2 >= var5Lifetime8) {
                if (var6Lifetime4 >= 0 &&
                  3 >= var6Lifetime4) {
                  if (!this.field_a[var5Lifetime8][var6Lifetime4]) {
                    throw new IllegalStateException("User tried to select a Pitch they don't own " + param0.toString());
                  }
                  this.field_K = var5Lifetime8;
                  this.field_o = var6Lifetime4;
                  return;
                }
                throw new IllegalStateException("User tried to select a Tier that doesn't exist " + param0.toString());
              }
              throw new IllegalStateException("User tried to select a Surface that doesn't exist " + param0.toString());
            }
            if (var4_int != 9) {
              return;
            }
            var22 = param0.field_g;
            var6_ref_boolean__ = new boolean[9];
            for (var7Lifetime2 = 0; var7Lifetime2 < 9; var7Lifetime2++) {
              var6_ref_boolean__[var22[var7Lifetime2]] = true;
            }
            var7Lifetime3 = 0;
            while (true) {
              if (var7Lifetime3 < 9) {
                stackOut_125_0 = var6_ref_boolean__[var7Lifetime3];
                stackIn_131_0 = stackOut_125_0 ? 1 : 0;
                stackIn_126_0 = stackOut_125_0;
                if (!stackIn_126_0) {
                  throw new IllegalStateException("Invalid ordering. No slot allocated for player " + var7Lifetime3);
                }
                var7Lifetime3++;
                continue;
              }
              break;
            }
            stackIn_131_0Lifetime1 = 0;
            for (var7Lifetime4 = stackIn_131_0Lifetime1; var7Lifetime4 < 9; var7Lifetime4++) {
              this.field_q[var7Lifetime4] = var22[var7Lifetime4];
            }
            return;
          }
          throw new IllegalStateException("Unknown Delta Type " + param0.toString());
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_175_0 = var4;
          stackIn_175_1 = new StringBuilder().append("gr.P(");
          if (param0 == null) {
            stackIn_176_2 = "null";
          } else {
            stackIn_176_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_175_0), ((StringBuilder) (Object) stackIn_175_1).append(stackIn_176_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var3 = Kickabout.field_G;
        int var2 = 0;
        if (param0 >= -55) {
          return true;
        }
        while (this.field_i.length > var2) {
          if (this.field_i[var2].c(-2)) {
            return true;
          }
          var2++;
        }
        return false;
    }

    final void a(int param0, iw param1, int param2) {
        boolean stackIn_57_1 = false;
        boolean stackIn_63_1 = false;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cq var13_ref_cq = null;
        int var14 = 0;
        pt var14_ref_pt = null;
        int var15 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        var15 = Kickabout.field_G;
        try {
          this.field_e = param1.i((byte) -124);
          var4_int = param1.h((byte) -105);
          if (1 == (var4_int & 2) >> 1) {
            this.field_m = true;
          } else {
            this.field_m = false;
          }
          var5 = -89 % ((7 - param0) / 52);
          if (1 != (1 & var4_int)) {
            this.field_M = false;
          } else {
            this.field_M = true;
          }
          this.field_h = param1.k(4);
          this.field_x = param1.k(4);
          this.field_F = param1.h((byte) -108);
          this.field_p = param1.h((byte) -114);
          var6 = param1.k(4);
          for (var7 = 0; var7 < this.field_J.length; var7++) {
            if ((1 & var6 >> var7) != 1) {
              this.field_J[var7] = false;
            } else {
              this.field_J[var7] = true;
            }
          }
          var7Lifetime1 = param1.h((byte) -113);
          if ((3 & var7Lifetime1) >> 1 == 1) {
            this.field_L = true;
          } else {
            this.field_L = false;
          }
          if (1 != (5 & var7Lifetime1) >> 2) {
            this.field_d = false;
          } else {
            this.field_d = true;
          }
          if ((var7Lifetime1 & 1) != 1) {
            this.field_A = false;
          } else {
            this.field_A = true;
          }
          this.field_r = param1.i(-127);
          var8 = 0;
          this.field_E = param1.i(-115);
          this.field_t = param1.h((byte) -116);
          this.field_s = param1.h((byte) -119);
          this.field_G = param1.a((byte) 81);
          param1.k(4);
          this.field_w = param1.h((byte) -119);
          this.field_k = param1.h((byte) -122);
          this.field_R = param1.h((byte) -116);
          var8Lifetime1 = param1.a((byte) 81);
          var9 = 0;
          for (var10 = 0; var10 < 3; var10++) {
            for (var11 = 0; var11 < 4; var11++) {
              var12 = 1 & var8Lifetime1 >> var9;
              var9++;
              if (var12 != 1) {
                this.field_a[var10][var11] = false;
              } else {
                this.field_a[var10][var11] = true;
              }
            }
          }
          var8Lifetime2 = param1.h((byte) -105);
          this.field_K = var8Lifetime2 & 15;
          this.field_o = var8Lifetime2 >> 4 & 15;
          var10Lifetime1 = param1.a((byte) 81);
          for (var11Lifetime1 = 0; var11Lifetime1 < 9; var11Lifetime1++) {
            this.field_i[var11Lifetime1] = new up();
            if ((1 & var10Lifetime1 >> var11Lifetime1) == 1) {
              this.field_i[var11Lifetime1].a(33, param1);
            }
          }
          for (var11Lifetime2 = 0; var11Lifetime2 < 9; var11Lifetime2++) {
            this.field_q[var11Lifetime2] = param1.h((byte) -109);
          }
          this.field_O = new tf();
          var11Lifetime3 = param1.h((byte) -114);
          for (var12Lifetime1 = 0; var12Lifetime1 < var11Lifetime3; var12Lifetime1++) {
            var13_ref_cq = new cq(param1);
            this.field_O.a(var13_ref_cq, 3);
          }
          this.field_g = new tf();
          var12Lifetime2 = param1.h((byte) -108);
          for (var13 = 0; var12Lifetime2 > var13; var13++) {
            var14_ref_pt = new pt(param1);
            this.field_g.a(var14_ref_pt, 3);
          }
          for (var13Lifetime1 = 0; 40 > var13Lifetime1; var13Lifetime1++) {
            var14 = param1.h((byte) -109);
            this.field_N[2 * var13Lifetime1] = qj.b(15, var14);
            this.field_N[1 + var13Lifetime1 * 2] = qj.b(241, var14) >> 4;
          }
          this.field_C = param1.a((byte) 81);
          this.field_b = param1.a((byte) 81);
          this.field_B = param1.a((byte) 81);
          this.field_z = param1.a((byte) 81);
          this.field_H = -1L + param1.i((byte) -124);
          this.field_j = param1.h((byte) -128);
          this.field_u = param1.h((byte) -125);
          this.field_D = param1.h((byte) -122);
          param1.h((byte) -106);
          param1.k(4);
          param1.k(4);
          this.field_n = param1.k(4);
          if (param2 > 1) {
            param1.a((byte) 81);
            param1.a((byte) 81);
            param1.a((byte) 81);
            param1.a((byte) 81);
            param1.a((byte) 81);
            param1.a((byte) 81);
          }
          if (2 < param2) {
            stackIn_57_1 = (param1.h((byte) -118) == 1);
            this.field_I = stackIn_57_1;
          }
          if (param2 > 3) {
            stackIn_63_1 = (param1.h((byte) -124) == 1);
            this.field_P = stackIn_63_1;
            this.field_f = param1.k(4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("gr.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(')').toString());
        }
    }

    public gr() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_I = false;
        this.field_P = false;
        this.field_h = -1;
        this.field_R = 15;
        this.field_s = 0;
        this.field_a = new boolean[3][4];
        this.field_E = 0;
        this.field_G = 0;
        this.field_x = 500;
        this.field_k = 0;
        this.field_t = 0;
        this.field_r = 0;
        this.field_M = false;
        this.field_w = 0;
        for (var1 = 0; var1 < 3; var1++) {
          this.field_a[var1][0] = true;
        }
        this.field_i = new up[9];
        this.field_o = 0;
        this.field_K = 0;
        this.field_O = new tf();
        this.field_g = new tf();
        this.field_q = new int[9];
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < 9) {
          this.field_q[var2] = var2;
          var2++;
        }
        this.field_u = 0;
        this.field_H = -1L;
        this.field_b = 0;
        this.field_A = true;
        this.field_N = new int[80];
        this.field_C = 0;
        this.field_m = false;
        this.field_F = 255;
        this.field_B = 0;
        this.field_d = true;
        this.field_z = 0;
        this.field_p = 255;
        this.field_J = new boolean[7];
        this.field_L = true;
        this.field_D = 0;
        this.field_j = 0;
    }

    static {
        field_v = "This is <%0>'s RuneScape clan if they have one.";
        field_c = new r();
        field_Q = "On";
        field_l = new String[]{"Character", "Class", "Stats", "Trinkets", "Time left", "Bid", "Buyout"};
    }
}
