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
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = Kickabout.field_G;
          var2 = -122 / ((2 - param0) / 36);
          if (!this.c(-3)) {
            break L0;
          } else {
            var3 = 0;
            L1: while (true) {
              if (this.field_i.length <= var3) {
                break L0;
              } else {
                if (!this.field_i[var3].c(-2)) {
                  if (!this.a((byte) 45, var3)) {
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
        return this.b((byte) -105, param1) != null ? true : false;
    }

    gr(long param0) {
        this();
        this.field_e = param0;
        this.b(-27595);
    }

    final boolean a(int param0) {
        int var3 = Kickabout.field_G;
        cq var2 = (cq) ((Object) this.field_O.g(24009));
        while (var2 != null) {
            if (-4 != (var2.field_k ^ -1)) {
                return true;
            }
            var2 = (cq) ((Object) this.field_O.c(33));
        }
        if (param0 != -4) {
            return false;
        }
        return false;
    }

    final boolean c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        cq var3 = (cq) ((Object) this.field_O.g(24009));
        while (var3 != null) {
            if ((var3.field_k ^ -1) != -4) {
                var2++;
            }
            var3 = (cq) ((Object) this.field_O.c(param0 ^ -36));
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        cq var3 = null;
        RuntimeException var3_ref = null;
        cq var4 = null;
        int var4_int = 0;
        pt var5 = null;
        int var6 = 0;
        iw var7 = null;
        pt var8 = null;
        up var9 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
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
            var3_int = 0;
            L1: while (true) {
              if (-4 >= (var3_int ^ -1)) {
                this.field_o = param0.field_o;
                this.field_K = param0.field_K;
                var3_int = 0;
                L2: while (true) {
                  if ((var3_int ^ -1) <= -10) {
                    this.field_O = new tf();
                    var3 = (cq) ((Object) param0.field_O.g(24009));
                    L3: while (true) {
                      if (var3 == null) {
                        this.field_g = new tf();
                        var8 = (pt) ((Object) param0.field_g.g(24009));
                        L4: while (true) {
                          if (var8 == null) {
                            this.field_p = param0.field_p;
                            this.field_F = param0.field_F;
                            var3_int = 0;
                            L5: while (true) {
                              if (var3_int >= this.field_J.length) {
                                L6: {
                                  if (param1 >= 12) {
                                    break L6;
                                  } else {
                                    var7 = (iw) null;
                                    this.a(63, (iw) null, 110);
                                    break L6;
                                  }
                                }
                                this.field_B = param0.field_B;
                                this.field_H = param0.field_H;
                                this.field_L = param0.field_L;
                                this.field_b = param0.field_b;
                                this.field_C = param0.field_C;
                                this.field_z = param0.field_z;
                                this.field_d = param0.field_d;
                                this.field_A = param0.field_A;
                                var3_int = 0;
                                L7: while (true) {
                                  if (var3_int >= this.field_N.length) {
                                    this.field_f = param0.field_f;
                                    this.field_P = param0.field_P;
                                    this.field_u = param0.field_u;
                                    this.field_j = param0.field_j;
                                    this.field_D = param0.field_D;
                                    this.field_n = param0.field_n;
                                    this.field_I = param0.field_I;
                                    break L0;
                                  } else {
                                    this.field_N[var3_int] = param0.field_N[var3_int];
                                    var3_int++;
                                    continue L7;
                                  }
                                }
                              } else {
                                this.field_J[var3_int] = param0.field_J[var3_int];
                                var3_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9 = new up();
                            var9.a((byte) -65, var8.e(-128));
                            var5 = new pt(var8.a(-29), var8.f((byte) 37), var8.f(3), var8.b(6), var9);
                            this.field_g.a(var5, 3);
                            var8 = (pt) ((Object) param0.field_g.c(33));
                            continue L4;
                          }
                        }
                      } else {
                        var4 = new cq(var3.field_k, var3.field_l, var3.field_i);
                        this.field_O.a(var4, 3);
                        var3 = (cq) ((Object) param0.field_O.c(33));
                        continue L3;
                      }
                    }
                  } else {
                    L8: {
                      if (null == this.field_i[var3_int]) {
                        this.field_i[var3_int] = new up();
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.field_i[var3_int].a((byte) -61, param0.field_i[var3_int]);
                    this.field_q[var3_int] = param0.field_q[var3_int];
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                var4_int = 0;
                L9: while (true) {
                  if ((var4_int ^ -1) <= -5) {
                    var3_int++;
                    continue L1;
                  } else {
                    this.field_a[var3_int][var4_int] = param0.field_a[var3_int][var4_int];
                    var4_int++;
                    continue L9;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3_ref);

            stackIn_31_1 = new StringBuilder().append("gr.N(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
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
        StringBuilder stackIn_45_0 = null;
        StringBuilder stackIn_46_0 = null;
        String stackIn_46_1 = null;
        StringBuilder stackIn_48_0 = null;
        StringBuilder stackIn_49_0 = null;
        String stackIn_49_1 = null;
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
        L0: {
          var5 = Kickabout.field_G;
          var6 = "=====PROFILE[" + su.a(0, this.field_e) + "]=====\n";
          var1 = var6;
          var1 = var6;
          if (this.field_M) {
            var1 = var6 + "Active - Yes\n";
            break L0;
          } else {
            var1 = var6 + "Active - No\n";
            break L0;
          }
        }
        L1: {
          var7 = var1 + "Created - " + this.field_h;
          var1 = var7;
          var1 = var7;
          var8 = var7 + "\n";
          var1 = var8;
          var1 = var8;
          var9 = var8 + "League Week - " + this.field_G + "\n";
          var1 = var9;
          var1 = var9;
          var10 = var9 + "Pts - " + this.field_E + "\n";
          var1 = var10;
          var1 = var10;
          var11 = var10 + "Diamond Pts - " + this.field_r + "\n";
          var1 = var11;
          var1 = var11;
          var12 = var11 + "League - " + q.field_h[this.field_t] + "\n";
          var1 = var12;
          var1 = var12;
          var13 = var12 + "Trophies - " + this.field_s + "\n";
          var1 = var13;
          var1 = var13;
          if (!this.field_m) {
            var1 = var13 + "Diamond Win Dialog - No\n";
            break L1;
          } else {
            var1 = var13 + "Diamond Win Dialog - Yes\n";
            break L1;
          }
        }
        var14 = var1 + "\n";
        var1 = var14;
        var1 = var14;
        var15 = var14 + "Money - " + ad.a(this.field_x, 26300) + "\n";
        var1 = var15;
        var1 = var15;
        var16 = var15 + "\n";
        var1 = var16;
        var1 = var16;
        var17 = var16 + "Kit ID - " + this.field_w + "\n";
        var1 = var17;
        var1 = var17;
        var18 = var17 + "Pri Col - " + this.field_k + "\n";
        var1 = var18;
        var1 = var18;
        var19 = var18 + "Sec Col - " + this.field_R + "\n";
        var1 = var19;
        var1 = var19;
        var1 = var19 + "\n";
        var2 = 0;
        L2: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var20 = var1 + "Surface - " + this.field_K + "\n";
            var22 = var20;
            var1 = var22;
            var1 = var20;
            var21 = var20 + "Tier - " + this.field_o + "\n";
            var22 = var21;
            var1 = var22;
            var1 = var21;
            var1 = var21 + "\n";
            var22 = var1;
            var1 = var22;
            var2 = 0;
            L3: while (true) {
              if (-10 >= (var2 ^ -1)) {
                var2 = 0;
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (this.field_N.length <= var4) {
                    var24 = var1 + "\n";
                    var25 = var24;
                    var1 = var25;
                    var1 = var24 + "Auction Log Size - " + this.field_O.a(false) + "\n";
                    var25 = var1;
                    var1 = var25;
                    var2 = 0;
                    var4_ref_cq = (cq) ((Object) this.field_O.g(24009));
                    L5: while (true) {
                      if (var4_ref_cq == null) {
                        var26 = var1 + "\n";
                        var27 = var26;
                        var1 = var27;
                        var1 = var26;
                        var2 = 0;
                        var1 = var26 + "Resolve Log Size - " + this.field_g.a(false) + "\n";
                        var27 = var1;
                        var1 = var27;
                        var4_ref_pt = (pt) ((Object) this.field_g.g(24009));
                        L6: while (true) {
                          if (var4_ref_pt == null) {
                            var28 = var1 + "\n";
                            var1 = var28;
                            var1 = var28;
                            var29 = var28 + "SFX Vol - " + this.field_F + "\n";
                            var1 = var29;
                            var1 = var29;
                            var30 = var29 + "Music Vol - " + this.field_p + "\n";
                            var1 = var30;
                            var1 = var30;
                            var1 = var30 + "Help Flags  - ";
                            var4 = 0;
                            L7: while (true) {
                              if (var4 >= this.field_J.length) {
                                L8: {
                                  var1 = var1 + "\n";
                                  if (!this.field_d) {
                                    var1 = var1 + "Lock Mouse - No\n";
                                    break L8;
                                  } else {
                                    var1 = var1 + "Lock Mouse - Yes\n";
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (this.field_A) {
                                    var1 = var1 + "Autopass - Yes\n";
                                    break L9;
                                  } else {
                                    var1 = var1 + "Autopass - No\n";
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (!this.field_L) {
                                    var1 = var1 + "GFX - Low\n";
                                    break L10;
                                  } else {
                                    var1 = var1 + "GFX - High\n";
                                    break L10;
                                  }
                                }
                                L11: {
                                  var31 = var1 + "\n";
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
                                  stackIn_45_0 = new StringBuilder().append(var41).append("Refunded Trinkets? - ");

                                  if (!this.field_I) {
                                    stackIn_46_0 = (StringBuilder) ((Object) stackIn_45_0);
                                    stackIn_46_1 = "NO";
                                    break L11;
                                  } else {
                                    stackIn_46_0 = (StringBuilder) ((Object) stackIn_45_0);
                                    stackIn_46_1 = "YES";
                                    break L11;
                                  }
                                }
                                L12: {
                                  var42 = stackIn_46_1 + "\n";
                                  stackIn_48_0 = new StringBuilder().append(var42).append("Refund Confirmed? - ");

                                  if (!this.field_P) {
                                    stackIn_49_0 = (StringBuilder) ((Object) stackIn_48_0);
                                    stackIn_49_1 = "NO";
                                    break L12;
                                  } else {
                                    stackIn_49_0 = (StringBuilder) ((Object) stackIn_48_0);
                                    stackIn_49_1 = "YES";
                                    break L12;
                                  }
                                }
                                var43 = stackIn_49_1 + "\n";
                                var1 = var43 + "Refund Amount - £" + Integer.toString(this.field_f) + "\n";
                                return var1;
                              } else {
                                if (!this.field_J[var4]) {
                                  var1 = var1 + "0,";
                                  var4++;
                                  continue L7;
                                } else {
                                  var1 = var1 + "1,";
                                  var4++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            incrementValue$0 = var2;
                            var2++;
                            var27 = var1 + "   Log [" + incrementValue$0 + "]\n";
                            var1 = var27;
                            var1 = var27;
                            var1 = var27 + "   " + var4_ref_pt + "\n";
                            var4_ref_pt = (pt) ((Object) this.field_g.c(33));
                            continue L6;
                          }
                        }
                      } else {
                        incrementValue$1 = var2;
                        var2++;
                        var25 = var1 + "   Log [" + incrementValue$1 + "]\n";
                        var27 = var25;
                        var1 = var27;
                        var1 = var25;
                        var1 = var25 + "   " + var4_ref_cq + "\n";
                        var4_ref_cq = (cq) ((Object) this.field_O.c(33));
                        continue L5;
                      }
                    }
                  } else {
                    L13: {
                      if (-1 == (var2 % 8 ^ -1)) {
                        incrementValue$2 = var3;
                        var3++;
                        var1 = var1 + "\nShop Transaction [" + incrementValue$2 + "] ";
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var1 = var1 + this.field_N[var4];
                    var2++;
                    var4++;
                    continue L4;
                  }
                }
              } else {
                var22 = var1 + "Team Member [" + var2 + "]\n";
                var1 = var22;
                var1 = var22;
                var23 = var22 + this.field_i[var2] + "\n";
                var1 = var23;
                var1 = var23;
                var1 = var23 + "Render Order - " + this.field_q[var2] + "\n";
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
                if (!this.field_a[var2][var3]) {
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
            this.field_t = 42;
        }
        return -2 == (1 & this.field_n >> param1 ^ -1) ? true : false;
    }

    final int d(int param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = Kickabout.field_G;
          var2 = param0;
          if (!this.c(-3)) {
            break L0;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_i.length) {
                break L0;
              } else {
                if (!this.field_i[var3].c(-2)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              }
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
        cq var4 = (cq) ((Object) this.field_O.g(24009));
        while (var4 != null) {
            if (-1 == (var4.field_k ^ -1) || (var4.field_k ^ -1) == -2) {
                if (!((param0 ^ -1L) != (var4.field_i ^ -1L))) {
                    return true;
                }
            }
            var4 = (cq) ((Object) this.field_O.c(33));
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
        L0: {
          var10 = Kickabout.field_G;
          var14 = new Random(this.field_e);
          var3 = dq.a((byte) -60, 3, var14);
          this.field_w = dq.a((byte) 91, 3, var14);
          this.field_k = dq.a((byte) 97, 16, var14) + 16;
          this.field_R = dq.a((byte) 127, 16, var14);
          if (param0 == -27595) {
            break L0;
          } else {
            this.field_E = -108;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (4 <= var4) {
            var12 = 4;
            var4 = var12;
            L2: while (true) {
              if (var12 >= this.field_i.length) {
                return;
              } else {
                var11 = new up();
                this.field_i[var12] = var11;
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
            this.field_i[var4] = var15;
            var4++;
            continue L1;
          }
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15) {
                break L1;
              } else {
                field_l = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = vl.a(10, true, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gr.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean d(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_12_0 = 0;
        L0: {
          var4 = Kickabout.field_G;
          var2 = 0;
          if (param0 >= 3) {
            break L0;
          } else {
            this.d((byte) -19);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (-10 >= (var3 ^ -1)) {
            L2: {
              if (4 > var2) {
                stackIn_12_0 = 0;
                break L2;
              } else {
                stackIn_12_0 = 1;
                break L2;
              }
            }
            return stackIn_12_0 != 0;
          } else {
            if (!this.field_i[var3].c(-2)) {
              if (!this.a((byte) -121, var3)) {
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
        cq var4 = (cq) ((Object) this.field_O.g(24009));
        while (var4 != null) {
            if (-3 == (var4.field_k ^ -1) && (param1 ^ -1L) == (var4.field_i ^ -1L)) {
                return true;
            }
            var4 = (cq) ((Object) this.field_O.c(param0 ^ 32));
        }
        if (param0 != 1) {
            this.field_t = -7;
            return false;
        }
        return false;
    }

    final boolean b(int param0, long param1) {
        int var5 = Kickabout.field_G;
        cq var4 = (cq) ((Object) this.field_O.g(param0 + -6515));
        while (var4 != null) {
            if ((var4.field_k ^ -1) == -4 && var4.field_i == param1) {
                return true;
            }
            var4 = (cq) ((Object) this.field_O.c(33));
        }
        if (param0 != 30524) {
            this.a(-50, 63, 62);
            return false;
        }
        return false;
    }

    final cq b(byte param0, int param1) {
        int var4 = Kickabout.field_G;
        cq var3_ref_cq = (cq) ((Object) this.field_O.g(24009));
        while (var3_ref_cq != null) {
            if (var3_ref_cq.field_k != 3 && param1 == var3_ref_cq.field_l) {
                return var3_ref_cq;
            }
            var3_ref_cq = (cq) ((Object) this.field_O.c(33));
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
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_176_2 = null;
        Throwable caughtException = null;
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0.field_i;
              if (param2 > var4_int) {
                break L1;
              } else {
                if ((var4_int ^ -1) > -11) {
                  L2: {
                    if (var4_int != 0) {
                      L3: {
                        if (1 == var4_int) {
                          L4: {
                            var5 = param0.field_g[0];
                            if (-1 < (var5 ^ -1)) {
                              break L4;
                            } else {
                              if (var5 >= 9) {
                                break L4;
                              } else {
                                if (this.field_i[var5].c(param2 + -2)) {
                                  throw new IllegalStateException("User tried to sell an empty player " + param0.toString());
                                } else {
                                  if (!this.a((byte) -112, var5)) {
                                    this.field_x = this.field_x + dh.a(this.field_i[var5], true);
                                    this.field_i[var5] = new up();
                                    break L3;
                                  } else {
                                    throw new IllegalStateException("User tried to sell a player in auction " + param0.toString());
                                  }
                                }
                              }
                            }
                          }
                          throw new IllegalStateException("User tried to sell a player not in the TEAM " + param0.toString());
                        } else {
                          if (var4_int != 2) {
                            if (-4 != (var4_int ^ -1)) {
                              if ((var4_int ^ -1) != -5) {
                                if ((var4_int ^ -1) != -6) {
                                  if ((var4_int ^ -1) != -7) {
                                    if (-8 == (var4_int ^ -1)) {
                                      L5: {
                                        var5 = param0.field_g[0];
                                        var6 = param0.field_g[1];
                                        if (var5 < 0) {
                                          break L5;
                                        } else {
                                          if (var5 > 2) {
                                            break L5;
                                          } else {
                                            L6: {
                                              if (-1 < (var6 ^ -1)) {
                                                break L6;
                                              } else {
                                                if (-4 <= (var6 ^ -1)) {
                                                  if (!this.field_a[var5][var6]) {
                                                    L7: {
                                                      if ((var6 ^ -1) >= -1) {
                                                        break L7;
                                                      } else {
                                                        if (this.field_a[var5][-1 + var6]) {
                                                          break L7;
                                                        } else {
                                                          throw new IllegalStateException("User tried to buy a Pitch when they don't own the previous tier " + param0.toString());
                                                        }
                                                      }
                                                    }
                                                    var7 = cm.field_M[var6];
                                                    if (var7 <= this.field_x) {
                                                      this.field_x = this.field_x - var7;
                                                      this.field_a[var5][var6] = true;
                                                      this.field_o = var6;
                                                      this.field_K = var5;
                                                      break L2;
                                                    } else {
                                                      throw new IllegalStateException("User bought a Pitch but could not afford it " + param0.toString());
                                                    }
                                                  } else {
                                                    throw new IllegalStateException("User tried to buy a Pitch they already own " + param0.toString());
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            throw new IllegalStateException("User tried to buy a Tier that doesn't exist " + param0.toString());
                                          }
                                        }
                                      }
                                      throw new IllegalStateException("User tried to buy a Surface that doesn't exist " + param0.toString());
                                    } else {
                                      if (8 == var4_int) {
                                        L8: {
                                          var5 = param0.field_g[0];
                                          var6 = param0.field_g[1];
                                          if (-1 < (var5 ^ -1)) {
                                            break L8;
                                          } else {
                                            if (2 >= var5) {
                                              L9: {
                                                if (-1 < (var6 ^ -1)) {
                                                  break L9;
                                                } else {
                                                  if (3 >= var6) {
                                                    if (!this.field_a[var5][var6]) {
                                                      throw new IllegalStateException("User tried to select a Pitch they don't own " + param0.toString());
                                                    } else {
                                                      this.field_K = var5;
                                                      this.field_o = var6;
                                                      break L2;
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                              throw new IllegalStateException("User tried to select a Tier that doesn't exist " + param0.toString());
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        throw new IllegalStateException("User tried to select a Surface that doesn't exist " + param0.toString());
                                      } else {
                                        if ((var4_int ^ -1) == -10) {
                                          var22 = param0.field_g;
                                          var6_ref_boolean__ = new boolean[9];
                                          var7 = 0;
                                          L10: while (true) {
                                            if (-10 >= (var7 ^ -1)) {
                                              var7 = 0;
                                              L11: while (true) {
                                                L12: {
                                                  if ((var7 ^ -1) <= -10) {
                                                    stackIn_131_0 = 0;
                                                    break L12;
                                                  } else {
                                                    stackOut_125_0 = var6_ref_boolean__[var7];
                                                    stackIn_131_0 = stackOut_125_0 ? 1 : 0;
                                                    stackIn_126_0 = stackOut_125_0;
                                                    if (!stackIn_126_0) {
                                                      throw new IllegalStateException("Invalid ordering. No slot allocated for player " + var7);
                                                    } else {
                                                      var7++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                                var7 = stackIn_131_0;
                                                L13: while (true) {
                                                  if (-10 >= (var7 ^ -1)) {
                                                    break L3;
                                                  } else {
                                                    this.field_q[var7] = var22[var7];
                                                    var7++;
                                                    continue L13;
                                                  }
                                                }
                                              }
                                            } else {
                                              var6_ref_boolean__[var22[var7]] = true;
                                              var7++;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      var5 = param0.field_g[0];
                                      if (0 > var5) {
                                        break L14;
                                      } else {
                                        if (var5 >= 32) {
                                          break L14;
                                        } else {
                                          this.field_R = var5;
                                          break L2;
                                        }
                                      }
                                    }
                                    throw new IllegalStateException("User tried to select a Secondary Colour that doesn't exist " + param0.toString());
                                  }
                                } else {
                                  L15: {
                                    var5 = param0.field_g[0];
                                    if (-1 < (var5 ^ -1)) {
                                      break L15;
                                    } else {
                                      if (32 > var5) {
                                        this.field_k = var5;
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  throw new IllegalStateException("User tried to select a Primary Colour that doesn't exist " + param0.toString());
                                }
                              } else {
                                L16: {
                                  var5 = param0.field_g[0];
                                  if (var5 < 0) {
                                    break L16;
                                  } else {
                                    if (var5 < je.field_g.length) {
                                      this.field_w = var5;
                                      break L2;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                throw new IllegalStateException("User tried to select a kit that doesn't exist " + param0.toString());
                              }
                            } else {
                              L17: {
                                var5 = param0.field_g[0];
                                var6 = param0.field_g[1];
                                if (0 > var5) {
                                  break L17;
                                } else {
                                  if ((var5 ^ -1) <= -10) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (var6 < 0) {
                                        break L18;
                                      } else {
                                        if ((var6 ^ -1) >= -3) {
                                          if (this.field_i[var5].c(-2)) {
                                            throw new IllegalStateException("User tried to level up an empty player " + param0.toString());
                                          } else {
                                            if (-101 >= (this.field_i[var5].field_r ^ -1)) {
                                              L19: {
                                                if ((var6 ^ -1) == -1) {
                                                  if (this.field_i[var5].field_n >= 100) {
                                                    throw new IllegalStateException("User tried to level up a POW which is max " + param0.toString());
                                                  } else {
                                                    dupTemp$0 = this.field_i[var5];
                                                    dupTemp$0.field_n = dupTemp$0.field_n + 1;
                                                    break L19;
                                                  }
                                                } else {
                                                  if ((var6 ^ -1) == -2) {
                                                    if (this.field_i[var5].field_g >= 100) {
                                                      throw new IllegalStateException("User tried to level up a SPD which is max " + param0.toString());
                                                    } else {
                                                      dupTemp$1 = this.field_i[var5];
                                                      dupTemp$1.field_g = dupTemp$1.field_g + 1;
                                                      break L19;
                                                    }
                                                  } else {
                                                    if (-3 != (var6 ^ -1)) {
                                                      break L19;
                                                    } else {
                                                      if (this.field_i[var5].field_o < 100) {
                                                        dupTemp$2 = this.field_i[var5];
                                                        dupTemp$2.field_o = dupTemp$2.field_o + 1;
                                                        break L19;
                                                      } else {
                                                        throw new IllegalStateException("User tried to level up a TCK which is max " + param0.toString());
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              dupTemp$3 = this.field_i[var5];
                                              dupTemp$3.field_r = dupTemp$3.field_r - 100;
                                              break L2;
                                            } else {
                                              throw new IllegalStateException("User tried to level up a player who doesn't have 100 exp " + param0.toString());
                                            }
                                          }
                                        } else {
                                          break L18;
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
                            L20: {
                              var5 = param0.field_g[0];
                              var6 = param0.field_g[1];
                              var7 = param0.field_g[2];
                              var21 = this.field_i[var5].field_h;
                              if ((var5 ^ -1) > -1) {
                                break L20;
                              } else {
                                if (-10 < (var5 ^ -1)) {
                                  L21: {
                                    if (-1 < (var6 ^ -1)) {
                                      break L21;
                                    } else {
                                      if ((var6 ^ -1) > (var21.length ^ -1)) {
                                        L22: {
                                          if (var7 < 0) {
                                            break L22;
                                          } else {
                                            if (111 > var7) {
                                              L23: {
                                                var9 = pa.field_g[var7];
                                                var10 = pa.field_g[var21[var6]];
                                                if ((var9.field_h ^ -1) != -74) {
                                                  break L23;
                                                } else {
                                                  if (!il.b((byte) 115)) {
                                                    throw new IllegalStateException("User tried to use the Halloween Costume trinket when we haven't released it yet " + param0.toString());
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              if (var9.field_k == var10.field_k) {
                                                L24: {
                                                  if (72 != var9.field_h) {
                                                    break L24;
                                                  } else {
                                                    if (this.a(-2, 0)) {
                                                      break L24;
                                                    } else {
                                                      throw new IllegalStateException("User tried to attach Pumpkins trinket but they haven't unlocked the Halloween Achievement " + param0.toString());
                                                    }
                                                  }
                                                }
                                                if ((this.field_x ^ -1) <= (var9.field_e ^ -1)) {
                                                  this.field_x = this.field_x - var9.field_e;
                                                  var21[var6] = var7;
                                                  break L2;
                                                } else {
                                                  throw new IllegalStateException("User attached a trinket but could not afford it " + param0.toString());
                                                }
                                              } else {
                                                throw new IllegalStateException("User tried to attach a trinket that is the wrong shape for the slot " + param0.toString());
                                              }
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        throw new IllegalStateException("User tried to attach an unknown trinket " + param0.toString());
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  throw new IllegalStateException("User tried to attach a trinket to a slot in invalid position " + param0.toString());
                                } else {
                                  break L20;
                                }
                              }
                            }
                            throw new IllegalStateException("User tried to attach a trinket to a player from an invalid position " + param0.toString());
                          }
                        }
                      }
                      break L2;
                    } else {
                      L25: {
                        var5 = -1 + param0.field_g[0];
                        var6 = param0.field_g[1];
                        if (var6 < 0) {
                          break L25;
                        } else {
                          if (var6 >= 8) {
                            break L25;
                          } else {
                            L26: {
                              if (var5 < -1) {
                                break L26;
                              } else {
                                if (var5 >= 7) {
                                  break L26;
                                } else {
                                  L27: {
                                    L28: {
                                      if (-1 != var5) {
                                        L29: {
                                          var13 = ha.a(this.field_e, var6, this.field_N[var6 + (8 + var5 * 8)], -50, var5);
                                          var7_ref_up = var13;
                                          var8 = 0;
                                          if (-1 == var5) {
                                            break L29;
                                          } else {
                                            var8 = gp.a(var7_ref_up, -576054046);
                                            break L29;
                                          }
                                        }
                                        if ((var8 ^ -1) >= (this.field_x ^ -1)) {
                                          var9_int = 0;
                                          var14 = 0;
                                          var10_int = var14;
                                          L30: while (true) {
                                            if (9 <= var14) {
                                              break L28;
                                            } else {
                                              stackOut_34_0 = this.field_i[this.field_q[var14]].c(param2 ^ -2);
                                              stackIn_40_0 = stackOut_34_0 ? 1 : 0;
                                              stackIn_35_0 = stackOut_34_0;
                                              if (stackIn_35_0) {
                                                this.field_i[this.field_q[var14]].a((byte) -70, var13);
                                                this.field_i[this.field_q[var14]].field_c = false;
                                                var9_int = 1;
                                                break L28;
                                              } else {
                                                var14++;
                                                continue L30;
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
                                          L31: {
                                            var12 = ha.a(this.field_e, var6, this.field_N[var6 + (8 + var5 * 8)], -50, var5);
                                            var7_ref_up = var12;
                                            var8 = 0;
                                            if (-1 == var5) {
                                              break L31;
                                            } else {
                                              var8 = gp.a(var7_ref_up, -576054046);
                                              break L31;
                                            }
                                          }
                                          if ((var8 ^ -1) >= (this.field_x ^ -1)) {
                                            var9_int = 0;
                                            var10_int = 0;
                                            L32: while (true) {
                                              if (9 <= var10_int) {
                                                break L28;
                                              } else {
                                                stackOut_22_0 = this.field_i[this.field_q[var10_int]].c(param2 ^ -2);
                                                stackIn_40_0 = stackOut_22_0 ? 1 : 0;
                                                stackIn_23_0 = stackOut_22_0;
                                                if (stackIn_23_0) {
                                                  this.field_i[this.field_q[var10_int]].a((byte) -70, var12);
                                                  this.field_i[this.field_q[var10_int]].field_c = false;
                                                  var9_int = 1;
                                                  break L28;
                                                } else {
                                                  var10_int++;
                                                  continue L32;
                                                }
                                              }
                                            }
                                          } else {
                                            throw new IllegalStateException("User bought a player but did not have enough money" + param0.toString());
                                          }
                                        }
                                      }
                                    }
                                    stackIn_40_0 = var9_int;
                                    break L27;
                                  }
                                  if (stackIn_40_0 != 0) {
                                    this.field_x = this.field_x - var8;
                                    this.field_N[8 * var5 + 8 + var6] = this.field_N[8 * var5 + 8 + var6] + 1;
                                    break L2;
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
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException("Unknown Delta Type " + param0.toString());
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var4 = decompiledCaughtException;
            stackIn_175_0 = (RuntimeException) (var4);

            stackIn_175_1 = new StringBuilder().append("gr.P(");

            if (param0 == null) {
              stackIn_176_0 = (RuntimeException) ((Object) stackIn_175_0);
              stackIn_176_1 = (StringBuilder) ((Object) stackIn_175_1);
              stackIn_176_2 = "null";
              break L33;
            } else {
              stackIn_176_0 = (RuntimeException) ((Object) stackIn_175_0);
              stackIn_176_1 = (StringBuilder) ((Object) stackIn_175_1);
              stackIn_176_2 = "{...}";
              break L33;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_176_0), stackIn_176_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(byte param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        var2 = 0;
        if (param0 < -55) {
          L0: while (true) {
            if (this.field_i.length <= var2) {
              return false;
            } else {
              if (!this.field_i[var2].c(-2)) {
                var2++;
                continue L0;
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0, iw param1, int param2) {
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
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
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.field_e = param1.i((byte) -124);
              var4_int = param1.h((byte) -105);
              if (1 == (var4_int & 2) >> -1149923743) {
                this.field_m = true;
                break L1;
              } else {
                this.field_m = false;
                break L1;
              }
            }
            L2: {
              var5 = -89 % ((7 - param0) / 52);
              if (1 != (1 & var4_int)) {
                this.field_M = false;
                break L2;
              } else {
                this.field_M = true;
                break L2;
              }
            }
            this.field_h = param1.k(4);
            this.field_x = param1.k(4);
            this.field_F = param1.h((byte) -108);
            this.field_p = param1.h((byte) -114);
            var6 = param1.k(4);
            var7 = 0;
            L3: while (true) {
              if (var7 >= this.field_J.length) {
                L4: {
                  var7 = param1.h((byte) -113);
                  if (-2 == ((3 & var7) >> 1629164609 ^ -1)) {
                    this.field_L = true;
                    break L4;
                  } else {
                    this.field_L = false;
                    break L4;
                  }
                }
                L5: {
                  if (1 != (5 & var7) >> 1646339042) {
                    this.field_d = false;
                    break L5;
                  } else {
                    this.field_d = true;
                    break L5;
                  }
                }
                L6: {
                  if (-2 != (var7 & 1 ^ -1)) {
                    this.field_A = false;
                    break L6;
                  } else {
                    this.field_A = true;
                    break L6;
                  }
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
                var8 = param1.a((byte) 81);
                var9 = 0;
                var10 = 0;
                L7: while (true) {
                  if (-4 >= (var10 ^ -1)) {
                    var8 = param1.h((byte) -105);
                    this.field_K = var8 & 15;
                    this.field_o = var8 >> 275999044 & 15;
                    var10 = param1.a((byte) 81);
                    var11 = 0;
                    L8: while (true) {
                      if (var11 >= 9) {
                        var11 = 0;
                        L9: while (true) {
                          if (-10 >= (var11 ^ -1)) {
                            this.field_O = new tf();
                            var11 = param1.h((byte) -114);
                            var12 = 0;
                            L10: while (true) {
                              if (var12 >= var11) {
                                this.field_g = new tf();
                                var12 = param1.h((byte) -108);
                                var13 = 0;
                                L11: while (true) {
                                  if (var12 <= var13) {
                                    var13 = 0;
                                    L12: while (true) {
                                      if (40 <= var13) {
                                        L13: {
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
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (2 < param2) {
                                            L15: {
                                              stackIn_56_0 = this;

                                              if (param1.h((byte) -118) != 1) {
                                                stackIn_57_0 = this;
                                                stackIn_57_1 = 0;
                                                break L15;
                                              } else {
                                                stackIn_57_0 = this;
                                                stackIn_57_1 = 1;
                                                break L15;
                                              }
                                            }
                                            ((gr) (this)).field_I = stackIn_57_1 != 0;
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L16: {
                                          if ((param2 ^ -1) < -4) {
                                            L17: {
                                              stackIn_62_0 = this;

                                              if (param1.h((byte) -124) != 1) {
                                                stackIn_63_0 = this;
                                                stackIn_63_1 = 0;
                                                break L17;
                                              } else {
                                                stackIn_63_0 = this;
                                                stackIn_63_1 = 1;
                                                break L17;
                                              }
                                            }
                                            ((gr) (this)).field_P = stackIn_63_1 != 0;
                                            this.field_f = param1.k(4);
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        break L0;
                                      } else {
                                        var14 = param1.h((byte) -109);
                                        this.field_N[2 * var13] = qj.b(15, var14);
                                        this.field_N[1 + var13 * 2] = qj.b(241, var14) >> 209210116;
                                        var13++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    var14_ref_pt = new pt(param1);
                                    this.field_g.a(var14_ref_pt, 3);
                                    var13++;
                                    continue L11;
                                  }
                                }
                              } else {
                                var13_ref_cq = new cq(param1);
                                this.field_O.a(var13_ref_cq, 3);
                                var12++;
                                continue L10;
                              }
                            }
                          } else {
                            this.field_q[var11] = param1.h((byte) -109);
                            var11++;
                            continue L9;
                          }
                        }
                      } else {
                        L18: {
                          this.field_i[var11] = new up();
                          if ((1 & var10 >> var11) == 1) {
                            this.field_i[var11].a(33, param1);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var11++;
                        continue L8;
                      }
                    }
                  } else {
                    var11 = 0;
                    L19: while (true) {
                      if (var11 >= 4) {
                        var10++;
                        continue L7;
                      } else {
                        L20: {
                          var12 = 1 & var8 >> var9;
                          var9++;
                          if (-2 != (var12 ^ -1)) {
                            this.field_a[var10][var11] = false;
                            break L20;
                          } else {
                            this.field_a[var10][var11] = true;
                            break L20;
                          }
                        }
                        var11++;
                        continue L19;
                      }
                    }
                  }
                }
              } else {
                L21: {
                  if ((1 & var6 >> var7 ^ -1) != -2) {
                    this.field_J[var7] = false;
                    break L21;
                  } else {
                    this.field_J[var7] = true;
                    break L21;
                  }
                }
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var4);

            stackIn_67_1 = new StringBuilder().append("gr.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L22;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L22;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param2 + ')');
        }
    }

    public gr() {
        int var1 = 0;
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
        for (var1 = 0; -4 < (var1 ^ -1); var1++) {
            this.field_a[var1][0] = true;
        }
        this.field_i = new up[9];
        this.field_o = 0;
        this.field_K = 0;
        this.field_O = new tf();
        this.field_g = new tf();
        this.field_q = new int[9];
        int var2 = 0;
        var1 = var2;
        while (-10 < (var2 ^ -1)) {
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
