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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          var2 = -122 / ((2 - param0) / 36);
          if (!((gr) this).c(-3)) {
            break L0;
          } else {
            var3 = 0;
            L1: while (true) {
              if (((gr) this).field_i.length <= var3) {
                break L0;
              } else {
                if (!((gr) this).field_i[var3].c(-2)) {
                  if (!((gr) this).a((byte) 45, var3)) {
                    return true;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        return false;
    }

    final boolean a(byte param0, int param1) {
        int var3 = -58 % ((param0 - -42) / 59);
        return ((gr) this).b((byte) -105, param1) != null ? true : false;
    }

    gr(long param0) {
        this();
        ((gr) this).field_e = param0;
        this.b(-27595);
    }

    final boolean a(int param0) {
        int var3 = Kickabout.field_G;
        cq var2 = (cq) (Object) ((gr) this).field_O.g(24009);
        while (var2 != null) {
            if (-4 != (var2.field_k ^ -1)) {
                return true;
            }
            var2 = (cq) (Object) ((gr) this).field_O.c(33);
        }
        if (param0 != -4) {
            return false;
        }
        return false;
    }

    final boolean c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        cq var3 = (cq) (Object) ((gr) this).field_O.g(24009);
        while (var3 != null) {
            if ((var3.field_k ^ -1) != -4) {
                var2++;
            }
            var3 = (cq) (Object) ((gr) this).field_O.c(param0 ^ -36);
        }
        if (param0 != -3) {
            boolean discarded$0 = ((gr) this).c(-68);
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
        int var3 = 0;
        int var4_int = 0;
        cq var4 = null;
        up var9 = null;
        pt var5 = null;
        int var6 = Kickabout.field_G;
        ((gr) this).field_h = param0.field_h;
        ((gr) this).field_s = param0.field_s;
        ((gr) this).field_R = param0.field_R;
        ((gr) this).field_M = param0.field_M;
        ((gr) this).field_k = param0.field_k;
        ((gr) this).field_t = param0.field_t;
        ((gr) this).field_e = param0.field_e;
        ((gr) this).field_E = param0.field_E;
        ((gr) this).field_x = param0.field_x;
        ((gr) this).field_m = param0.field_m;
        ((gr) this).field_G = param0.field_G;
        ((gr) this).field_r = param0.field_r;
        ((gr) this).field_w = param0.field_w;
        for (var3 = 0; -4 < (var3 ^ -1); var3++) {
            for (var4_int = 0; (var4_int ^ -1) > -5; var4_int++) {
                ((gr) this).field_a[var3][var4_int] = param0.field_a[var3][var4_int];
            }
        }
        ((gr) this).field_o = param0.field_o;
        ((gr) this).field_K = param0.field_K;
        for (var3 = 0; (var3 ^ -1) > -10; var3++) {
            if (!(null != ((gr) this).field_i[var3])) {
                ((gr) this).field_i[var3] = new up();
            }
            ((gr) this).field_i[var3].a((byte) -61, param0.field_i[var3]);
            ((gr) this).field_q[var3] = param0.field_q[var3];
        }
        ((gr) this).field_O = new tf();
        cq var3_ref_cq = (cq) (Object) param0.field_O.g(24009);
        while (var3_ref_cq != null) {
            var4 = new cq(var3_ref_cq.field_k, var3_ref_cq.field_l, var3_ref_cq.field_i);
            ((gr) this).field_O.a((gn) (Object) var4, 3);
            var3_ref_cq = (cq) (Object) param0.field_O.c(33);
        }
        ((gr) this).field_g = new tf();
        pt var8 = (pt) (Object) param0.field_g.g(24009);
        while (var8 != null) {
            var9 = new up();
            var9.a((byte) -65, var8.e(-128));
            var5 = new pt(var8.a(-29), var8.f((byte) 37), var8.f(3), var8.b(6), var9);
            ((gr) this).field_g.a((gn) (Object) var5, 3);
            var8 = (pt) (Object) param0.field_g.c(33);
        }
        ((gr) this).field_p = param0.field_p;
        ((gr) this).field_F = param0.field_F;
        for (var3 = 0; var3 < ((gr) this).field_J.length; var3++) {
            ((gr) this).field_J[var3] = param0.field_J[var3];
        }
        if (param1 < 12) {
            Object var7 = null;
            ((gr) this).a(63, (iw) null, 110);
        }
        ((gr) this).field_B = param0.field_B;
        ((gr) this).field_H = param0.field_H;
        ((gr) this).field_L = param0.field_L;
        ((gr) this).field_b = param0.field_b;
        ((gr) this).field_C = param0.field_C;
        ((gr) this).field_z = param0.field_z;
        ((gr) this).field_d = param0.field_d;
        ((gr) this).field_A = param0.field_A;
        for (var3 = 0; var3 < ((gr) this).field_N.length; var3++) {
            ((gr) this).field_N[var3] = param0.field_N[var3];
        }
        ((gr) this).field_f = param0.field_f;
        ((gr) this).field_P = param0.field_P;
        ((gr) this).field_u = param0.field_u;
        ((gr) this).field_j = param0.field_j;
        ((gr) this).field_D = param0.field_D;
        ((gr) this).field_n = param0.field_n;
        ((gr) this).field_I = param0.field_I;
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cq var4_ref_cq = null;
        pt var4_ref_pt = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var45 = null;
        StringBuilder stackIn_44_0 = null;
        StringBuilder stackIn_45_0 = null;
        StringBuilder stackIn_46_0 = null;
        String stackIn_46_1 = null;
        StringBuilder stackIn_47_0 = null;
        StringBuilder stackIn_48_0 = null;
        StringBuilder stackIn_49_0 = null;
        String stackIn_49_1 = null;
        StringBuilder stackOut_43_0 = null;
        StringBuilder stackOut_45_0 = null;
        String stackOut_45_1 = null;
        StringBuilder stackOut_44_0 = null;
        String stackOut_44_1 = null;
        StringBuilder stackOut_46_0 = null;
        StringBuilder stackOut_48_0 = null;
        String stackOut_48_1 = null;
        StringBuilder stackOut_47_0 = null;
        String stackOut_47_1 = null;
        L0: {
          var5 = Kickabout.field_G;
          var7 = "=====PROFILE[" + su.a(0, ((gr) this).field_e) + "]=====\n";
          var1 = var7;
          var1 = var7;
          if (((gr) this).field_M) {
            var1 = var7 + "Active - Yes\n";
            break L0;
          } else {
            var1 = var7 + "Active - No\n";
            break L0;
          }
        }
        L1: {
          var8 = var1 + "Created - " + ((gr) this).field_h;
          var1 = var8;
          var1 = var8;
          var9 = var8 + "\n";
          var1 = var9;
          var1 = var9;
          var10 = var9 + "League Week - " + ((gr) this).field_G + "\n";
          var1 = var10;
          var1 = var10;
          var11 = var10 + "Pts - " + ((gr) this).field_E + "\n";
          var1 = var11;
          var1 = var11;
          var12 = var11 + "Diamond Pts - " + ((gr) this).field_r + "\n";
          var1 = var12;
          var1 = var12;
          var13 = var12 + "League - " + q.field_h[((gr) this).field_t] + "\n";
          var1 = var13;
          var1 = var13;
          var14 = var13 + "Trophies - " + ((gr) this).field_s + "\n";
          var1 = var14;
          var1 = var14;
          if (!((gr) this).field_m) {
            var1 = var14 + "Diamond Win Dialog - No\n";
            break L1;
          } else {
            var1 = var14 + "Diamond Win Dialog - Yes\n";
            break L1;
          }
        }
        var15 = var1 + "\n";
        var1 = var15;
        var1 = var15;
        var16 = var15 + "Money - " + ad.a(((gr) this).field_x, 26300) + "\n";
        var1 = var16;
        var1 = var16;
        var17 = var16 + "\n";
        var1 = var17;
        var1 = var17;
        var18 = var17 + "Kit ID - " + ((gr) this).field_w + "\n";
        var1 = var18;
        var1 = var18;
        var19 = var18 + "Pri Col - " + ((gr) this).field_k + "\n";
        var1 = var19;
        var1 = var19;
        var20 = var19 + "Sec Col - " + ((gr) this).field_R + "\n";
        var1 = var20;
        var1 = var20;
        var1 = var20 + "\n";
        var2 = 0;
        L2: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var21 = var1 + "Surface - " + ((gr) this).field_K + "\n";
            var23 = var21;
            var1 = var23;
            var1 = var21;
            var22 = var21 + "Tier - " + ((gr) this).field_o + "\n";
            var23 = var22;
            var1 = var23;
            var1 = var22;
            var1 = var22 + "\n";
            var23 = var1;
            var1 = var23;
            var2 = 0;
            L3: while (true) {
              if (-10 >= (var2 ^ -1)) {
                var2 = 0;
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (((gr) this).field_N.length <= var4) {
                    var25 = var1 + "\n";
                    var26 = var25;
                    var1 = var26;
                    var1 = var25 + "Auction Log Size - " + ((gr) this).field_O.a(false) + "\n";
                    var26 = var1;
                    var1 = var26;
                    var2 = 0;
                    var4_ref_cq = (cq) (Object) ((gr) this).field_O.g(24009);
                    L5: while (true) {
                      if (var4_ref_cq == null) {
                        var27 = var1 + "\n";
                        var28 = var27;
                        var1 = var28;
                        var1 = var27;
                        var2 = 0;
                        var1 = var27 + "Resolve Log Size - " + ((gr) this).field_g.a(false) + "\n";
                        var28 = var1;
                        var1 = var28;
                        var4_ref_pt = (pt) (Object) ((gr) this).field_g.g(24009);
                        L6: while (true) {
                          if (var4_ref_pt == null) {
                            var29 = var1 + "\n";
                            var1 = var29;
                            var1 = var29;
                            var30 = var29 + "SFX Vol - " + ((gr) this).field_F + "\n";
                            var1 = var30;
                            var1 = var30;
                            var31 = var30 + "Music Vol - " + ((gr) this).field_p + "\n";
                            var1 = var31;
                            var1 = var31;
                            var1 = var31 + "Help Flags  - ";
                            var6 = 0;
                            var4 = var6;
                            L7: while (true) {
                              if (var6 >= ((gr) this).field_J.length) {
                                L8: {
                                  var32 = var1 + "\n";
                                  var1 = var32;
                                  var1 = var32;
                                  if (!((gr) this).field_d) {
                                    var1 = var32 + "Lock Mouse - No\n";
                                    break L8;
                                  } else {
                                    var1 = var32 + "Lock Mouse - Yes\n";
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (((gr) this).field_A) {
                                    var1 = var1 + "Autopass - Yes\n";
                                    break L9;
                                  } else {
                                    var1 = var1 + "Autopass - No\n";
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (!((gr) this).field_L) {
                                    var1 = var1 + "GFX - Low\n";
                                    break L10;
                                  } else {
                                    var1 = var1 + "GFX - High\n";
                                    break L10;
                                  }
                                }
                                L11: {
                                  var33 = var1 + "\n";
                                  var34 = var33 + "Team Wins - " + ((gr) this).field_C + "\n";
                                  var35 = var34 + "Stadium Wins - " + Integer.toBinaryString(((gr) this).field_b) + "\n";
                                  var36 = var35 + "Formation Wins - " + Integer.toBinaryString(((gr) this).field_B) + "\n";
                                  var37 = var36 + "Total Goals - " + ((gr) this).field_z + "\n";
                                  var38 = var37 + "Total Halloween Goals - " + ((gr) this).field_j + "\n";
                                  var39 = var38 + "Total 8+ Tournament Wins - " + ((gr) this).field_u + "\n";
                                  var40 = var39 + "Total 8+ Tournament Knockouts - " + ((gr) this).field_D + "\n";
                                  var41 = var40 + "Nemesis - " + su.a(0, ((gr) this).field_H) + "\n";
                                  var42 = var41 + "\n";
                                  var43 = var42 + "Misc Unlockables - " + Integer.toBinaryString(((gr) this).field_n) + "\n";
                                  stackOut_43_0 = new StringBuilder().append(var43).append("Refunded Trinkets? - ");
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_44_0 = stackOut_43_0;
                                  if (!((gr) this).field_I) {
                                    stackOut_45_0 = (StringBuilder) (Object) stackIn_45_0;
                                    stackOut_45_1 = "NO";
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    break L11;
                                  } else {
                                    stackOut_44_0 = (StringBuilder) (Object) stackIn_44_0;
                                    stackOut_44_1 = "YES";
                                    stackIn_46_0 = stackOut_44_0;
                                    stackIn_46_1 = stackOut_44_1;
                                    break L11;
                                  }
                                }
                                L12: {
                                  var44 = stackIn_46_1 + "\n";
                                  stackOut_46_0 = new StringBuilder().append(var44).append("Refund Confirmed? - ");
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_47_0 = stackOut_46_0;
                                  if (!((gr) this).field_P) {
                                    stackOut_48_0 = (StringBuilder) (Object) stackIn_48_0;
                                    stackOut_48_1 = "NO";
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    break L12;
                                  } else {
                                    stackOut_47_0 = (StringBuilder) (Object) stackIn_47_0;
                                    stackOut_47_1 = "YES";
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    break L12;
                                  }
                                }
                                var45 = stackIn_49_1 + "\n";
                                var1 = var45 + "Refund Amount - £" + Integer.toString(((gr) this).field_f) + "\n";
                                return var1;
                              } else {
                                if (!((gr) this).field_J[var6]) {
                                  var1 = var1 + "0,";
                                  var6++;
                                  continue L7;
                                } else {
                                  var1 = var1 + "1,";
                                  var6++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var2++;
                            var28 = var1 + "   Log [" + var2 + "]\n";
                            var1 = var28;
                            var1 = var28;
                            var1 = var28 + "   " + var4_ref_pt + "\n";
                            var4_ref_pt = (pt) (Object) ((gr) this).field_g.c(33);
                            continue L6;
                          }
                        }
                      } else {
                        var2++;
                        var26 = var1 + "   Log [" + var2 + "]\n";
                        var28 = var26;
                        var1 = var28;
                        var1 = var26;
                        var1 = var26 + "   " + var4_ref_cq + "\n";
                        var4_ref_cq = (cq) (Object) ((gr) this).field_O.c(33);
                        continue L5;
                      }
                    }
                  } else {
                    L13: {
                      if (-1 == (var2 % 8 ^ -1)) {
                        var3++;
                        var1 = var1 + "\nShop Transaction [" + var3 + "] ";
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var1 = var1 + ((gr) this).field_N[var4];
                    var2++;
                    var4++;
                    continue L4;
                  }
                }
              } else {
                var23 = var1 + "Team Member [" + var2 + "]\n";
                var1 = var23;
                var1 = var23;
                var24 = var23 + ((gr) this).field_i[var2] + "\n";
                var1 = var24;
                var1 = var24;
                var1 = var24 + "Render Order - " + ((gr) this).field_q[var2] + "\n";
                var2++;
                continue L3;
              }
            }
          } else {
            var1 = var1 + "Bought Stadiums [" + var2 + "] - ";
            var3 = 0;
            L14: while (true) {
              if (var3 >= 4) {
                var1 = var1 + "\n";
                var2++;
                continue L2;
              } else {
                if (!((gr) this).field_a[var2][var3]) {
                  var1 = var1 + "0,";
                  var3++;
                  continue L14;
                } else {
                  var1 = var1 + "1,";
                  var3++;
                  continue L14;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (param0 != -2) {
            ((gr) this).field_t = 42;
        }
        return -2 == (1 & ((gr) this).field_n >> param1 ^ -1) ? true : false;
    }

    final int d(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param0;
        if (((gr) this).c(-3)) {
            for (var3 = 0; var3 < ((gr) this).field_i.length; var3++) {
                if (((gr) this).field_i[var3].c(-2)) {
                    return var3;
                }
            }
        }
        return var2;
    }

    final boolean a(long param0, byte param1) {
        int var5 = Kickabout.field_G;
        if (param1 != -79) {
            ((gr) this).field_P = false;
        }
        cq var4 = (cq) (Object) ((gr) this).field_O.g(24009);
        while (var4 != null) {
            if (-1 != (var4.field_k ^ -1)) {
                // if_icmpne L97
            }
            if (!((param0 ^ -1L) != (var4.field_i ^ -1L))) {
                return true;
            }
            var4 = (cq) (Object) ((gr) this).field_O.c(33);
        }
        return false;
    }

    private final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        up var11 = null;
        int var12 = 0;
        up var13 = null;
        Random var14 = null;
        up var15 = null;
        L0: {
          var10 = Kickabout.field_G;
          var14 = new Random(((gr) this).field_e);
          var3 = dq.a((byte) -60, 3, var14);
          ((gr) this).field_w = dq.a((byte) 91, 3, var14);
          ((gr) this).field_k = dq.a((byte) 97, 16, var14) + 16;
          ((gr) this).field_R = dq.a((byte) 127, 16, var14);
          if (param0 == -27595) {
            break L0;
          } else {
            ((gr) this).field_E = -108;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (4 <= var4) {
            var12 = 4;
            var4 = var12;
            L2: while (true) {
              if (var12 >= ((gr) this).field_i.length) {
                return;
              } else {
                var11 = new up();
                ((gr) this).field_i[var12] = var11;
                var12++;
                continue L2;
              }
            }
          } else {
            L3: {
              var13 = new up();
              var15 = var13;
              if (var4 == 0) {
                var13.field_q = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (1 == var4) {
                if (0 != var3) {
                  var15.field_q = 3;
                  break L4;
                } else {
                  var13.field_q = 0;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var4 ^ -1) != -3) {
                break L5;
              } else {
                if ((var3 ^ -1) != -3) {
                  var15.field_q = 3;
                  break L5;
                } else {
                  var15.field_q = 1;
                  break L5;
                }
              }
            }
            L6: {
              if (var4 == 3) {
                var15.field_q = 1;
                break L6;
              } else {
                break L6;
              }
            }
            var15.field_e = dq.a((byte) 79, td.field_a.length, var14);
            var15.field_l = 1 + dq.a((byte) 106, -1 + ce.field_G[var15.field_q].length, var14);
            var15.field_n = dq.a((byte) -86, 10, var14) + 6;
            var15.field_o = dq.a((byte) 97, 10, var14) + 6;
            var15.field_g = 6 + dq.a((byte) -111, 10, var14);
            var15.field_r = 0;
            var15.field_h = new int[1];
            var15.field_h[0] = 0;
            var6 = dq.a((byte) 84, 5, var14);
            var7 = dq.a((byte) -70, 3, var14);
            var8 = dq.a((byte) -57, 3, var14);
            var9 = var8;
            var9 = var9 | var7 << 1693997444;
            var9 = var9 | var6 << 1492626248;
            var15.field_j = var9;
            ((gr) this).field_i[var4] = var15;
            var4++;
            continue L1;
          }
        }
    }

    final hn a(int param0, int param1, int param2) {
        if (param1 > -55) {
            return null;
        }
        int[] var6 = new int[9];
        int[] var4 = var6;
        dv.a(((gr) this).field_q, 0, var6, 0, 9);
        int var5 = var6[param2];
        var6[param2] = var6[param0];
        var6[param0] = var5;
        return new hn(9, var6);
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 15) {
            field_l = null;
        }
        return vl.a(10, true, true, param1);
    }

    final boolean d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var4 = Kickabout.field_G;
          var2 = 0;
          if (param0 >= 3) {
            break L0;
          } else {
            boolean discarded$2 = ((gr) this).d((byte) -19);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (-10 >= (var3 ^ -1)) {
            L2: {
              if (4 > var2) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L2;
              }
            }
            return stackIn_12_0 != 0;
          } else {
            if (!((gr) this).field_i[var3].c(-2)) {
              if (!((gr) this).a((byte) -121, var3)) {
                var2++;
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, long param1) {
        int var5 = Kickabout.field_G;
        cq var4 = (cq) (Object) ((gr) this).field_O.g(24009);
        while (var4 != null) {
            if (-3 == (var4.field_k ^ -1)) {
                if ((param1 ^ -1L) == (var4.field_i ^ -1L)) {
                    return true;
                }
            }
            var4 = (cq) (Object) ((gr) this).field_O.c(param0 ^ 32);
        }
        if (param0 != 1) {
            ((gr) this).field_t = -7;
            return false;
        }
        return false;
    }

    final boolean b(int param0, long param1) {
        int var5 = Kickabout.field_G;
        cq var4 = (cq) (Object) ((gr) this).field_O.g(param0 + -6515);
        while (var4 != null) {
            if ((var4.field_k ^ -1) == -4) {
                if (var4.field_i == param1) {
                    return true;
                }
            }
            var4 = (cq) (Object) ((gr) this).field_O.c(33);
        }
        if (param0 != 30524) {
            hn discarded$0 = ((gr) this).a(-50, 63, 62);
            return false;
        }
        return false;
    }

    final cq b(byte param0, int param1) {
        int var4 = Kickabout.field_G;
        cq var3_ref_cq = (cq) (Object) ((gr) this).field_O.g(24009);
        while (var3_ref_cq != null) {
            if (var3_ref_cq.field_k != 3) {
                if (param1 == var3_ref_cq.field_l) {
                    return var3_ref_cq;
                }
            }
            var3_ref_cq = (cq) (Object) ((gr) this).field_O.c(33);
        }
        int var3 = 120 / ((-34 - param0) / 56);
        return null;
    }

    final void a(hn param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] var6_ref_boolean__ = null;
        int var7 = 0;
        up var7_ref = null;
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
        L0: {
          var11 = Kickabout.field_G;
          var4 = param0.field_i;
          if (param2 > var4) {
            break L0;
          } else {
            if ((var4 ^ -1) > -11) {
              L1: {
                if (var4 != 0) {
                  if (1 == var4) {
                    L2: {
                      var5 = param0.field_g[0];
                      if (-1 < (var5 ^ -1)) {
                        break L2;
                      } else {
                        if (var5 >= 9) {
                          break L2;
                        } else {
                          if (((gr) this).field_i[var5].c(param2 + -2)) {
                            throw new IllegalStateException("User tried to sell an empty player " + param0.toString());
                          } else {
                            if (!((gr) this).a((byte) -112, var5)) {
                              ((gr) this).field_x = ((gr) this).field_x + dh.a(((gr) this).field_i[var5], true);
                              ((gr) this).field_i[var5] = new up();
                              break L1;
                            } else {
                              throw new IllegalStateException("User tried to sell a player in auction " + param0.toString());
                            }
                          }
                        }
                      }
                    }
                    throw new IllegalStateException("User tried to sell a player not in the TEAM " + param0.toString());
                  } else {
                    if (var4 != 2) {
                      if (-4 != (var4 ^ -1)) {
                        if ((var4 ^ -1) != -5) {
                          if (var4 != -6) {
                            if ((var4 ^ -1) != -7) {
                              if (-8 == (var4 ^ -1)) {
                                L3: {
                                  var5 = param0.field_g[0];
                                  var6 = param0.field_g[1];
                                  if (var5 < 0) {
                                    break L3;
                                  } else {
                                    if (var5 > 2) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (-1 < var6) {
                                          break L4;
                                        } else {
                                          if (-4 >= var6) {
                                            if (!((gr) this).field_a[var5][var6]) {
                                              L5: {
                                                if ((var6 ^ -1) >= -1) {
                                                  break L5;
                                                } else {
                                                  if (((gr) this).field_a[var5][-1 + var6]) {
                                                    break L5;
                                                  } else {
                                                    throw new IllegalStateException("User tried to buy a Pitch when they don't own the previous tier " + param0.toString());
                                                  }
                                                }
                                              }
                                              var7 = cm.field_M[var6];
                                              if (var7 <= ((gr) this).field_x) {
                                                ((gr) this).field_x = ((gr) this).field_x - var7;
                                                ((gr) this).field_a[var5][var6] = true;
                                                ((gr) this).field_o = var6;
                                                ((gr) this).field_K = var5;
                                                break L1;
                                              } else {
                                                throw new IllegalStateException("User bought a Pitch but could not afford it " + param0.toString());
                                              }
                                            } else {
                                              throw new IllegalStateException("User tried to buy a Pitch they already own " + param0.toString());
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      throw new IllegalStateException("User tried to buy a Tier that doesn't exist " + param0.toString());
                                    }
                                  }
                                }
                                throw new IllegalStateException("User tried to buy a Surface that doesn't exist " + param0.toString());
                              } else {
                                if (8 == var4) {
                                  L6: {
                                    var5 = param0.field_g[0];
                                    var6 = param0.field_g[1];
                                    if (-1 < (var5 ^ -1)) {
                                      break L6;
                                    } else {
                                      if (2 >= var5) {
                                        L7: {
                                          if (-1 < (var6 ^ -1)) {
                                            break L7;
                                          } else {
                                            if (3 >= var6) {
                                              if (!((gr) this).field_a[var5][var6]) {
                                                throw new IllegalStateException("User tried to select a Pitch they don't own " + param0.toString());
                                              } else {
                                                ((gr) this).field_K = var5;
                                                ((gr) this).field_o = var6;
                                                break L1;
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        throw new IllegalStateException("User tried to select a Tier that doesn't exist " + param0.toString());
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  throw new IllegalStateException("User tried to select a Surface that doesn't exist " + param0.toString());
                                } else {
                                  if (var4 == -10) {
                                    var22 = param0.field_g;
                                    var6_ref_boolean__ = new boolean[9];
                                    var7 = 0;
                                    L8: while (true) {
                                      if (-10 <= var7) {
                                        var7 = 0;
                                        L9: while (true) {
                                          if ((var7 ^ -1) <= -10) {
                                            var7 = 0;
                                            L10: while (true) {
                                              if (-10 >= (var7 ^ -1)) {
                                                break L1;
                                              } else {
                                                ((gr) this).field_q[var7] = var22[var7];
                                                var7++;
                                                continue L10;
                                              }
                                            }
                                          } else {
                                            if (!var6_ref_boolean__[var7]) {
                                              throw new IllegalStateException("Invalid ordering. No slot allocated for player " + var7);
                                            } else {
                                              var7++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      } else {
                                        var6_ref_boolean__[var22[var7]] = true;
                                        var7++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              L11: {
                                var5 = param0.field_g[0];
                                if (0 > var5) {
                                  break L11;
                                } else {
                                  if (var5 >= 32) {
                                    break L11;
                                  } else {
                                    ((gr) this).field_R = var5;
                                    break L1;
                                  }
                                }
                              }
                              throw new IllegalStateException("User tried to select a Secondary Colour that doesn't exist " + param0.toString());
                            }
                          } else {
                            L12: {
                              var5 = param0.field_g[0];
                              if (-1 > var5) {
                                break L12;
                              } else {
                                if (32 > var5) {
                                  ((gr) this).field_k = var5;
                                  break L1;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            throw new IllegalStateException("User tried to select a Primary Colour that doesn't exist " + param0.toString());
                          }
                        } else {
                          L13: {
                            var5 = param0.field_g[0];
                            if (var5 < 0) {
                              break L13;
                            } else {
                              if (var5 < je.field_g.length) {
                                ((gr) this).field_w = var5;
                                break L1;
                              } else {
                                break L13;
                              }
                            }
                          }
                          throw new IllegalStateException("User tried to select a kit that doesn't exist " + param0.toString());
                        }
                      } else {
                        L14: {
                          var5 = param0.field_g[0];
                          var6 = param0.field_g[1];
                          if (0 > var5) {
                            break L14;
                          } else {
                            if ((var5 ^ -1) <= -10) {
                              break L14;
                            } else {
                              L15: {
                                if (var6 < 0) {
                                  break L15;
                                } else {
                                  if ((var6 ^ -1) >= -3) {
                                    if (((gr) this).field_i[var5].c(-2)) {
                                      throw new IllegalStateException("User tried to level up an empty player " + param0.toString());
                                    } else {
                                      if (-101 >= (((gr) this).field_i[var5].field_r ^ -1)) {
                                        L16: {
                                          if (var6 == 0) {
                                            if (((gr) this).field_i[var5].field_n >= 100) {
                                              throw new IllegalStateException("User tried to level up a POW which is max " + param0.toString());
                                            } else {
                                              ((gr) this).field_i[var5].field_n = ((gr) this).field_i[var5].field_n + 1;
                                              break L16;
                                            }
                                          } else {
                                            if (var6 == -2) {
                                              if (((gr) this).field_i[var5].field_g >= 100) {
                                                throw new IllegalStateException("User tried to level up a SPD which is max " + param0.toString());
                                              } else {
                                                ((gr) this).field_i[var5].field_g = ((gr) this).field_i[var5].field_g + 1;
                                                break L16;
                                              }
                                            } else {
                                              if (-3 != var6) {
                                                break L16;
                                              } else {
                                                if (((gr) this).field_i[var5].field_o < 100) {
                                                  ((gr) this).field_i[var5].field_o = ((gr) this).field_i[var5].field_o + 1;
                                                  break L16;
                                                } else {
                                                  throw new IllegalStateException("User tried to level up a TCK which is max " + param0.toString());
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((gr) this).field_i[var5].field_r = ((gr) this).field_i[var5].field_r - 100;
                                        break L1;
                                      } else {
                                        throw new IllegalStateException("User tried to level up a player who doesn't have 100 exp " + param0.toString());
                                      }
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              throw new IllegalStateException("User tried to level up an invalid stat " + param0.toString());
                            }
                          }
                        }
                        throw new IllegalStateException("User tried to level up a player from an invalid position " + param0.toString());
                      }
                    } else {
                      L17: {
                        var5 = param0.field_g[0];
                        var6 = param0.field_g[1];
                        var7 = param0.field_g[2];
                        var21 = ((gr) this).field_i[var5].field_h;
                        if (var5 > -1) {
                          break L17;
                        } else {
                          if (-10 > var5) {
                            L18: {
                              if (-1 < (var6 ^ -1)) {
                                break L18;
                              } else {
                                if (var6 < var21.length) {
                                  L19: {
                                    if (var7 < 0) {
                                      break L19;
                                    } else {
                                      if (111 > var7) {
                                        L20: {
                                          var9 = pa.field_g[var7];
                                          var10 = pa.field_g[var21[var6]];
                                          if ((var9.field_h ^ -1) != -74) {
                                            break L20;
                                          } else {
                                            if (!il.b((byte) 115)) {
                                              throw new IllegalStateException("User tried to use the Halloween Costume trinket when we haven't released it yet " + param0.toString());
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (var9.field_k == var10.field_k) {
                                          L21: {
                                            if (72 != var9.field_h) {
                                              break L21;
                                            } else {
                                              if (this.a(-2, 0)) {
                                                break L21;
                                              } else {
                                                throw new IllegalStateException("User tried to attach Pumpkins trinket but they haven't unlocked the Halloween Achievement " + param0.toString());
                                              }
                                            }
                                          }
                                          if (((gr) this).field_x >= var9.field_e) {
                                            ((gr) this).field_x = ((gr) this).field_x - var9.field_e;
                                            var21[var6] = var7;
                                            break L1;
                                          } else {
                                            throw new IllegalStateException("User attached a trinket but could not afford it " + param0.toString());
                                          }
                                        } else {
                                          throw new IllegalStateException("User tried to attach a trinket that is the wrong shape for the slot " + param0.toString());
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  throw new IllegalStateException("User tried to attach an unknown trinket " + param0.toString());
                                } else {
                                  break L18;
                                }
                              }
                            }
                            throw new IllegalStateException("User tried to attach a trinket to a slot in invalid position " + param0.toString());
                          } else {
                            break L17;
                          }
                        }
                      }
                      throw new IllegalStateException("User tried to attach a trinket to a player from an invalid position " + param0.toString());
                    }
                  }
                } else {
                  L22: {
                    var5 = -1 + param0.field_g[0];
                    var6 = param0.field_g[1];
                    if (var6 < 0) {
                      break L22;
                    } else {
                      if (var6 >= 8) {
                        break L22;
                      } else {
                        L23: {
                          if (var5 < -1) {
                            break L23;
                          } else {
                            if (var5 >= 7) {
                              break L23;
                            } else {
                              L24: {
                                if (-1 != var5) {
                                  L25: {
                                    var13 = ha.a(((gr) this).field_e, var6, ((gr) this).field_N[var6 + (8 + var5 * 8)], -50, var5);
                                    var7_ref = var13;
                                    var8 = 0;
                                    if (-1 == var5) {
                                      break L25;
                                    } else {
                                      var8 = gp.a(var7_ref, -576054046);
                                      break L25;
                                    }
                                  }
                                  if (var8 <= ((gr) this).field_x) {
                                    var9_int = 0;
                                    var14 = 0;
                                    var10_int = var14;
                                    L26: while (true) {
                                      if (9 <= var14) {
                                        break L24;
                                      } else {
                                        if (((gr) this).field_i[((gr) this).field_q[var14]].c(param2 ^ -2)) {
                                          ((gr) this).field_i[((gr) this).field_q[var14]].a((byte) -70, var13);
                                          ((gr) this).field_i[((gr) this).field_q[var14]].field_c = false;
                                          var9_int = 1;
                                          break L24;
                                        } else {
                                          var14++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  } else {
                                    throw new IllegalStateException("User bought a player but did not have enough money" + param0.toString());
                                  }
                                } else {
                                  if (!param1) {
                                    throw new IllegalStateException("User tried to buy a MOD player when they are not a MOD" + param0.toString());
                                  } else {
                                    L27: {
                                      var12 = ha.a(((gr) this).field_e, var6, ((gr) this).field_N[var6 + (8 + var5 * 8)], -50, var5);
                                      var7_ref = var12;
                                      var8 = 0;
                                      if (-1 == var5) {
                                        break L27;
                                      } else {
                                        var8 = gp.a(var7_ref, -576054046);
                                        break L27;
                                      }
                                    }
                                    if (var8 <= ((gr) this).field_x) {
                                      var9_int = 0;
                                      var10_int = 0;
                                      L28: while (true) {
                                        if (9 <= var10_int) {
                                          break L24;
                                        } else {
                                          if (((gr) this).field_i[((gr) this).field_q[var10_int]].c(param2 ^ -2)) {
                                            ((gr) this).field_i[((gr) this).field_q[var10_int]].a((byte) -70, var12);
                                            ((gr) this).field_i[((gr) this).field_q[var10_int]].field_c = false;
                                            var9_int = 1;
                                            break L24;
                                          } else {
                                            var10_int++;
                                            continue L28;
                                          }
                                        }
                                      }
                                    } else {
                                      throw new IllegalStateException("User bought a player but did not have enough money" + param0.toString());
                                    }
                                  }
                                }
                              }
                              if (var9_int != 0) {
                                ((gr) this).field_x = ((gr) this).field_x - var8;
                                ((gr) this).field_N[8 * var5 + 8 + var6] = ((gr) this).field_N[8 * var5 + 8 + var6] + 1;
                                break L1;
                              } else {
                                throw new IllegalStateException("User tried to buy a player but does not have an empty slot" + param0.toString());
                              }
                            }
                          }
                        }
                        throw new IllegalStateException("User tried to buy a league player from a nonexistant league " + param0.toString());
                      }
                    }
                  }
                  throw new IllegalStateException("User tried to buy a player not in the shop seg size " + param0.toString());
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalStateException("Unknown Delta Type " + param0.toString());
    }

    final boolean c(byte param0) {
        int var3 = Kickabout.field_G;
        int var2 = 0;
        if (param0 >= -55) {
            return true;
        }
        while (((gr) this).field_i.length > var2) {
            if (((gr) this).field_i[var2].c(-2)) {
                return true;
            }
            var2++;
        }
        return false;
    }

    final void a(int param0, iw param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cq var13_ref = null;
        pt var14_ref = null;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        L0: {
          var15 = Kickabout.field_G;
          ((gr) this).field_e = param1.i((byte) -124);
          var4 = param1.h((byte) -105);
          if (1 == (var4 & 2) >> -1149923743) {
            ((gr) this).field_m = true;
            break L0;
          } else {
            ((gr) this).field_m = false;
            break L0;
          }
        }
        L1: {
          var5 = -89 % ((7 - param0) / 52);
          if (1 != (1 & var4)) {
            ((gr) this).field_M = false;
            break L1;
          } else {
            ((gr) this).field_M = true;
            break L1;
          }
        }
        ((gr) this).field_h = param1.k(4);
        ((gr) this).field_x = param1.k(4);
        ((gr) this).field_F = param1.h((byte) -108);
        ((gr) this).field_p = param1.h((byte) -114);
        var6 = param1.k(4);
        var7 = 0;
        L2: while (true) {
          if (var7 >= ((gr) this).field_J.length) {
            L3: {
              var7 = param1.h((byte) -113);
              if (-2 == ((3 & var7) >> 1629164609 ^ -1)) {
                ((gr) this).field_L = true;
                break L3;
              } else {
                ((gr) this).field_L = false;
                break L3;
              }
            }
            L4: {
              if (1 != (5 & var7) >> 1646339042) {
                ((gr) this).field_d = false;
                break L4;
              } else {
                ((gr) this).field_d = true;
                break L4;
              }
            }
            L5: {
              if (-2 != (var7 & 1 ^ -1)) {
                ((gr) this).field_A = false;
                break L5;
              } else {
                ((gr) this).field_A = true;
                break L5;
              }
            }
            ((gr) this).field_r = param1.i(-127);
            var8 = 0;
            ((gr) this).field_E = param1.i(-115);
            ((gr) this).field_t = param1.h((byte) -116);
            ((gr) this).field_s = param1.h((byte) -119);
            ((gr) this).field_G = param1.a((byte) 81);
            int discarded$10 = param1.k(4);
            ((gr) this).field_w = param1.h((byte) -119);
            ((gr) this).field_k = param1.h((byte) -122);
            ((gr) this).field_R = param1.h((byte) -116);
            var8 = param1.a((byte) 81);
            var9 = 0;
            var10 = 0;
            L6: while (true) {
              if (-4 >= var10) {
                var8 = param1.h((byte) -105);
                ((gr) this).field_K = var8 & 15;
                ((gr) this).field_o = var8 >> 275999044 & 15;
                var10 = param1.a((byte) 81);
                var11 = 0;
                L7: while (true) {
                  if (var11 >= 9) {
                    var11 = 0;
                    L8: while (true) {
                      if (-10 >= (var11 ^ -1)) {
                        ((gr) this).field_O = new tf();
                        var11 = param1.h((byte) -114);
                        var12 = 0;
                        L9: while (true) {
                          if (var12 >= var11) {
                            ((gr) this).field_g = new tf();
                            var12 = param1.h((byte) -108);
                            var13 = 0;
                            L10: while (true) {
                              if (var12 <= var13) {
                                var13 = 0;
                                L11: while (true) {
                                  if (40 <= var13) {
                                    L12: {
                                      ((gr) this).field_C = param1.a((byte) 81);
                                      ((gr) this).field_b = param1.a((byte) 81);
                                      ((gr) this).field_B = param1.a((byte) 81);
                                      ((gr) this).field_z = param1.a((byte) 81);
                                      ((gr) this).field_H = -1L + param1.i((byte) -124);
                                      ((gr) this).field_j = param1.h((byte) -128);
                                      ((gr) this).field_u = param1.h((byte) -125);
                                      ((gr) this).field_D = param1.h((byte) -122);
                                      int discarded$11 = param1.h((byte) -106);
                                      int discarded$12 = param1.k(4);
                                      int discarded$13 = param1.k(4);
                                      ((gr) this).field_n = param1.k(4);
                                      if (param2 > 1) {
                                        int discarded$14 = param1.a((byte) 81);
                                        int discarded$15 = param1.a((byte) 81);
                                        int discarded$16 = param1.a((byte) 81);
                                        int discarded$17 = param1.a((byte) 81);
                                        int discarded$18 = param1.a((byte) 81);
                                        int discarded$19 = param1.a((byte) 81);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (2 < param2) {
                                        L14: {
                                          stackOut_52_0 = this;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (param1.h((byte) -118) != 1) {
                                            stackOut_54_0 = this;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L14;
                                          } else {
                                            stackOut_53_0 = this;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L14;
                                          }
                                        }
                                        ((gr) this).field_I = stackIn_55_1 != 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L15: {
                                      if ((param2 ^ -1) < -4) {
                                        L16: {
                                          stackOut_58_0 = this;
                                          stackIn_60_0 = stackOut_58_0;
                                          stackIn_59_0 = stackOut_58_0;
                                          if (param1.h((byte) -124) != 1) {
                                            stackOut_60_0 = this;
                                            stackOut_60_1 = 0;
                                            stackIn_61_0 = stackOut_60_0;
                                            stackIn_61_1 = stackOut_60_1;
                                            break L16;
                                          } else {
                                            stackOut_59_0 = this;
                                            stackOut_59_1 = 1;
                                            stackIn_61_0 = stackOut_59_0;
                                            stackIn_61_1 = stackOut_59_1;
                                            break L16;
                                          }
                                        }
                                        ((gr) this).field_P = stackIn_61_1 != 0;
                                        ((gr) this).field_f = param1.k(4);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    return;
                                  } else {
                                    var14 = param1.h((byte) -109);
                                    ((gr) this).field_N[2 * var13] = qj.b(15, var14);
                                    ((gr) this).field_N[1 + var13 * 2] = qj.b(241, var14) >> 209210116;
                                    var13++;
                                    continue L11;
                                  }
                                }
                              } else {
                                var14_ref = new pt(param1);
                                ((gr) this).field_g.a((gn) (Object) var14_ref, 3);
                                var13++;
                                continue L10;
                              }
                            }
                          } else {
                            var13_ref = new cq(param1);
                            ((gr) this).field_O.a((gn) (Object) var13_ref, 3);
                            var12++;
                            continue L9;
                          }
                        }
                      } else {
                        ((gr) this).field_q[var11] = param1.h((byte) -109);
                        var11++;
                        continue L8;
                      }
                    }
                  } else {
                    ((gr) this).field_i[var11] = new up();
                    if ((1 & var10 >> var11) == 1) {
                      ((gr) this).field_i[var11].a(33, param1);
                      var11++;
                      continue L7;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var11 = 0;
                L17: while (true) {
                  if (var11 >= 4) {
                    var10++;
                    continue L6;
                  } else {
                    var12 = 1 & var8 >> var9;
                    var9++;
                    if (-2 != var12) {
                      ((gr) this).field_a[var10][var11] = false;
                      var11++;
                      continue L17;
                    } else {
                      ((gr) this).field_a[var10][var11] = true;
                      var11++;
                      continue L17;
                    }
                  }
                }
              }
            }
          } else {
            if ((1 & var6 >> var7 ^ -1) != -2) {
              ((gr) this).field_J[var7] = false;
              var7++;
              continue L2;
            } else {
              ((gr) this).field_J[var7] = true;
              var7++;
              continue L2;
            }
          }
        }
    }

    public gr() {
        int var1 = 0;
        int var2 = 0;
        ((gr) this).field_I = false;
        ((gr) this).field_P = false;
        ((gr) this).field_h = -1;
        ((gr) this).field_R = 15;
        ((gr) this).field_s = 0;
        ((gr) this).field_a = new boolean[3][4];
        ((gr) this).field_E = 0;
        ((gr) this).field_G = 0;
        ((gr) this).field_x = 500;
        ((gr) this).field_k = 0;
        ((gr) this).field_t = 0;
        ((gr) this).field_r = 0;
        ((gr) this).field_M = false;
        ((gr) this).field_w = 0;
        var1 = 0;
        L0: while (true) {
          if (-4 >= (var1 ^ -1)) {
            ((gr) this).field_i = new up[9];
            ((gr) this).field_o = 0;
            ((gr) this).field_K = 0;
            ((gr) this).field_O = new tf();
            ((gr) this).field_g = new tf();
            ((gr) this).field_q = new int[9];
            var2 = 0;
            var1 = var2;
            L1: while (true) {
              if (-10 >= (var2 ^ -1)) {
                ((gr) this).field_u = 0;
                ((gr) this).field_H = -1L;
                ((gr) this).field_b = 0;
                ((gr) this).field_A = true;
                ((gr) this).field_N = new int[80];
                ((gr) this).field_C = 0;
                ((gr) this).field_m = false;
                ((gr) this).field_F = 255;
                ((gr) this).field_B = 0;
                ((gr) this).field_d = true;
                ((gr) this).field_z = 0;
                ((gr) this).field_p = 255;
                ((gr) this).field_J = new boolean[7];
                ((gr) this).field_L = true;
                ((gr) this).field_D = 0;
                ((gr) this).field_j = 0;
              } else {
                ((gr) this).field_q[var2] = var2;
                var2++;
                continue L1;
              }
            }
          } else {
            ((gr) this).field_a[var1][0] = true;
            var1++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "This is <%0>'s RuneScape clan if they have one.";
        field_c = new r();
        field_Q = "On";
        field_l = new String[]{"Character", "Class", "Stats", "Trinkets", "Time left", "Bid", "Buyout"};
    }
}
