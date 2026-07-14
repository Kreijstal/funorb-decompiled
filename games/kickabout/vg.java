/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends hd {
    private boolean field_Jb;
    static boolean field_Rb;
    static long field_Ib;
    static String field_Vb;
    private StringBuilder field_Ub;
    static int field_Ob;
    private int field_Mb;
    private boolean field_Hb;
    private wu field_Gb;
    private int field_Tb;
    private bu field_Pb;
    static String field_Cb;
    static boolean field_Wb;
    private long field_Sb;
    static int field_zb;
    static hd field_Qb;
    static nb[] field_Db;
    private hd field_yb;
    static String field_Kb;
    static gq field_Bb;
    private int field_Ab;
    private int field_Eb;
    private int field_Fb;
    private hd field_Nb;
    hd field_Lb;

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        if (param0 != 32) {
            return;
        }
        if (!(((vg) this).field_Mb == ((vg) this).field_Fb)) {
            var2 = ((vg) this).field_Mb <= ((vg) this).field_Fb ? ((vg) this).field_Mb : ((vg) this).field_Fb;
            var3 = ((vg) this).field_Mb <= ((vg) this).field_Fb ? ((vg) this).field_Fb : ((vg) this).field_Mb;
            ((vg) this).field_Fb = var2;
            ((vg) this).field_Mb = var2;
            var4 = ((vg) this).field_Ub.toString().substring(var3, ((vg) this).field_Ub.length());
            StringBuilder discarded$0 = dj.a(var2, ' ', param0 + -11439, ((vg) this).field_Ub);
            StringBuilder discarded$1 = ((vg) this).field_Ub.append(var4);
            ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
        }
    }

    vg(long param0, hd param1, hd param2, hd param3, int param4) {
        super(param0, param1);
        ((vg) this).field_Sb = 0L;
        ((vg) this).field_Tb = -1;
        ((vg) this).field_Jb = false;
        ((vg) this).field_Hb = false;
        ((vg) this).field_Eb = param4;
        ((vg) this).field_Nb = new hd(0L, param2);
        ((vg) this).field_Lb = new hd(0L, param3);
        ((vg) this).field_yb = new hd(0L, param3);
        ((vg) this).field_nb = true;
        ((vg) this).field_Ub = new StringBuilder((((vg) this).field_Eb ^ -1) == 0 ? 256 : ((vg) this).field_Eb);
        ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
        ((vg) this).field_yb.field_E = "";
        ((vg) this).field_yb.field_V = "|";
        ((vg) this).field_jb = new tf();
        ((vg) this).a((byte) -123, ((vg) this).field_Nb);
        ((vg) this).a((byte) -113, ((vg) this).field_Lb);
        ((vg) this).a((byte) -115, ((vg) this).field_yb);
        ((vg) this).field_wb = true;
    }

    public static void m(int param0) {
        if (param0 != 96) {
            String discarded$0 = vg.a(49);
        }
        field_Kb = null;
        field_Vb = null;
        field_Cb = null;
        field_Bb = null;
        field_Db = null;
        field_Qb = null;
    }

    private final void c(boolean param0) {
        if (param0) {
            field_Wb = false;
        }
        if (!(null != ((vg) this).field_Pb)) {
            return;
        }
        String var2 = ((vg) this).i((byte) 35);
        if (var2.length() == 0) {
            return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(((vg) this).i((byte) 35));
        wu discarded$0 = ((vg) this).field_Pb.a((byte) 68, (java.awt.datatransfer.Transferable) (Object) var3);
    }

    final void k(int param0) {
        StringBuilder discarded$0 = dj.a(0, ' ', -11407, ((vg) this).field_Ub);
        ((vg) this).field_Mb = 0;
        ((vg) this).field_Fb = 0;
        if (param0 != -19174) {
            int discarded$1 = this.h(-14);
        }
        ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
    }

    final static void c(int param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var6 = 0;
        jm var6_ref = null;
        int var7 = 0;
        byte[] var8 = null;
        jm var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        jm var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        L0: {
          var7 = Kickabout.field_G;
          if (-1 != (go.field_b ^ -1)) {
            L1: {
              var2 = nj.a(param1 + -75);
              var4 = go.field_b;
              if (0.0 == m.field_a) {
                break L1;
              } else {
                var4 = (int)((double)var4 + ac.field_d.nextGaussian() * m.field_a);
                if (0 <= var4) {
                  break L1;
                } else {
                  var4 = 0;
                  break L1;
                }
              }
            }
            L2: {
              if ((or.field_d.field_n ^ -1) < -1) {
                var18 = new byte[or.field_d.field_n];
                var16 = var18;
                var14 = var16;
                var11 = var14;
                var8 = var11;
                var19 = var8;
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var18.length) {
                    var6_ref = new jm((long)var4 + var2, or.field_d.field_n, var19);
                    am.field_g.a((gn) (Object) var6_ref, 3);
                    or.field_d.field_n = 0;
                    break L2;
                  } else {
                    var8[var6] = or.field_d.field_f[var6];
                    var6++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var9 = (jm) (Object) am.field_g.g(24009);
            var13 = var9;
            if (var13 == null) {
              break L0;
            } else {
              if (var13.field_f < var2) {
                var13.c((byte) -109);
                var10 = 0;
                var6 = var10;
                L4: while (true) {
                  if (var10 >= var13.field_j) {
                    or.field_d.field_n = var13.field_j;
                    break L0;
                  } else {
                    or.field_d.field_f[var10] = var9.field_k[var10];
                    var10++;
                    continue L4;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          c.a(param0, false);
          if (param1 == 0) {
            break L5;
          } else {
            field_Qb = null;
            break L5;
          }
        }
    }

    final void a(bu param0, int param1) {
        if (param1 != -17421) {
            return;
        }
        ((vg) this).field_Pb = param0;
    }

    final void b(int param0, byte param1) {
        int var3 = 20 / ((62 - param1) / 58);
        if (null != ((vg) this).field_Lb) {
            ((vg) this).field_Lb.field_y = param0;
        }
    }

    final static void a(boolean param0, wd param1, int param2) {
        ml var3 = or.field_d;
        var3.b(param2, (byte) 98);
        if (!param0) {
            vg.c(-62, -59);
        }
        var3.a(127, param1.field_k);
        var3.a(115, param1.field_p);
    }

    final int j(int param0) {
        if (param0 != -1) {
            return 64;
        }
        return ((vg) this).field_Mb;
    }

    final static boolean e(int param0, int param1) {
        int var2 = param1;
        nv.a(var2, m.field_a, i.field_B, 0, var2);
        if (param0 != -63) {
            vg.b(-62, 88);
        }
        return true;
    }

    final void b(String param0, int param1) {
        ((vg) this).field_Ub.setLength(0);
        if (param1 != -23174) {
            ((vg) this).f(24, 5);
        }
        int var3 = param0.length();
        if (((vg) this).field_Eb != -1) {
            if (!(((vg) this).field_Eb >= var3)) {
                var3 = ((vg) this).field_Eb;
            }
        }
        StringBuilder discarded$0 = ((vg) this).field_Ub.append(param0.substring(0, var3));
        ((vg) this).field_Fb = ((vg) this).field_Ub.length();
        ((vg) this).field_Mb = ((vg) this).field_Ub.length();
        ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
    }

    final static void b(int param0, int param1) {
        sr.field_c = rt.field_G[param0];
        ks.field_g = fi.field_g[param0];
        if (param1 != 31900) {
            field_Qb = null;
        }
        ep.field_e = ss.field_a[param0];
    }

    private final void h(byte param0) {
        if (null == ((vg) this).field_Pb) {
            return;
        }
        this.c(false);
        if (param0 <= 42) {
            ((vg) this).b(-41);
        }
        this.l(32);
    }

    private final void k(byte param0) {
        if (param0 != 38) {
            return;
        }
        if (null == ((vg) this).field_Pb) {
            return;
        }
        ((vg) this).field_Gb = ((vg) this).field_Pb.a(15);
    }

    private final int d(int param0, int param1) {
        int var6 = Kickabout.field_G;
        int var3 = param1;
        int var4 = 0;
        int var5 = ((vg) this).field_Ub.length();
        while (var4 < param0) {
            // if_icmple L60
            var3++;
            var4 = var4 + ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.charAt(var3));
        }
        return var3;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        String var5 = null;
        int stackIn_31_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          if (param1 == 60) {
            break L0;
          } else {
            if (param1 == 62) {
              break L0;
            } else {
              L1: {
                if (param2 == 875) {
                  break L1;
                } else {
                  int discarded$5 = this.d(-84, 20);
                  break L1;
                }
              }
              L2: {
                if (param1 < 32) {
                  break L2;
                } else {
                  if (param1 > 126) {
                    break L2;
                  } else {
                    L3: {
                      if (((vg) this).field_Fb == ((vg) this).field_Mb) {
                        break L3;
                      } else {
                        this.l(32);
                        break L3;
                      }
                    }
                    L4: {
                      if ((((vg) this).field_Eb ^ -1) == 0) {
                        break L4;
                      } else {
                        if (((vg) this).field_Ub.length() < ((vg) this).field_Eb) {
                          break L4;
                        } else {
                          return true;
                        }
                      }
                    }
                    L5: {
                      if (((vg) this).field_Mb == ((vg) this).field_Ub.length()) {
                        StringBuilder discarded$6 = ((vg) this).field_Ub.append(param1);
                        break L5;
                      } else {
                        var5 = ((vg) this).field_Ub.toString().substring(((vg) this).field_Mb, ((vg) this).field_Ub.length());
                        StringBuilder discarded$7 = dj.a(((vg) this).field_Mb, ' ', param2 + -12282, ((vg) this).field_Ub);
                        StringBuilder discarded$8 = ((vg) this).field_Ub.append(param1);
                        StringBuilder discarded$9 = ((vg) this).field_Ub.append(var5);
                        break L5;
                      }
                    }
                    ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
                    ((vg) this).field_Mb = ((vg) this).field_Mb + 1;
                    ((vg) this).field_Fb = ((vg) this).field_Mb;
                    return true;
                  }
                }
              }
              L6: {
                if (85 == param0) {
                  if (((vg) this).field_Mb != ((vg) this).field_Fb) {
                    this.l(32);
                    return true;
                  } else {
                    if (-1 > (((vg) this).field_Mb ^ -1)) {
                      ((vg) this).field_Fb = -1 + ((vg) this).field_Mb;
                      this.l(32);
                      return true;
                    } else {
                      break L6;
                    }
                  }
                } else {
                  if (param0 != 101) {
                    if (param0 != 13) {
                      if (param0 != 96) {
                        if (-98 == (param0 ^ -1)) {
                          if (((vg) this).field_Mb < ((vg) this).field_Ub.length()) {
                            L7: {
                              if (ne.field_G[82]) {
                                stackOut_51_0 = this.i(-100);
                                stackIn_52_0 = stackOut_51_0;
                                break L7;
                              } else {
                                stackOut_50_0 = ((vg) this).field_Mb - -1;
                                stackIn_52_0 = stackOut_50_0;
                                break L7;
                              }
                            }
                            var4 = stackIn_52_0;
                            this.a(var4, (byte) -115);
                            return true;
                          } else {
                            break L6;
                          }
                        } else {
                          if (102 == param0) {
                            this.a(0, (byte) -126);
                            return true;
                          } else {
                            if (param0 != 103) {
                              L8: {
                                if (!ne.field_G[82]) {
                                  break L8;
                                } else {
                                  if (65 != param0) {
                                    break L8;
                                  } else {
                                    this.h((byte) 74);
                                    return true;
                                  }
                                }
                              }
                              L9: {
                                if (!ne.field_G[82]) {
                                  break L9;
                                } else {
                                  if ((param0 ^ -1) == -67) {
                                    this.c(false);
                                    return true;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (!ne.field_G[82]) {
                                break L6;
                              } else {
                                if ((param0 ^ -1) != -68) {
                                  break L6;
                                } else {
                                  this.k((byte) 38);
                                  return true;
                                }
                              }
                            } else {
                              this.a(((vg) this).field_Ub.length(), (byte) -103);
                              return true;
                            }
                          }
                        }
                      } else {
                        if ((((vg) this).field_Mb ^ -1) >= -1) {
                          break L6;
                        } else {
                          L10: {
                            if (ne.field_G[82]) {
                              stackOut_30_0 = this.h(26864);
                              stackIn_31_0 = stackOut_30_0;
                              break L10;
                            } else {
                              stackOut_29_0 = ((vg) this).field_Mb + -1;
                              stackIn_31_0 = stackOut_29_0;
                              break L10;
                            }
                          }
                          var4 = stackIn_31_0;
                          this.a(var4, (byte) -103);
                          return true;
                        }
                      }
                    } else {
                      ((vg) this).k(-19174);
                      return true;
                    }
                  } else {
                    if (((vg) this).field_Fb == ((vg) this).field_Mb) {
                      if (((vg) this).field_Mb < ((vg) this).field_Ub.length()) {
                        ((vg) this).field_Fb = 1 + ((vg) this).field_Mb;
                        this.l(32);
                        return true;
                      } else {
                        break L6;
                      }
                    } else {
                      this.l(32);
                      return true;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    final String j(byte param0) {
        if (param0 != -16) {
            return null;
        }
        return ((vg) this).field_Ub.toString();
    }

    final String i(byte param0) {
        if (param0 != 35) {
            ((vg) this).field_yb = null;
        }
        String var2 = ((vg) this).field_Ub.toString();
        int var3 = ((vg) this).field_Mb <= ((vg) this).field_Fb ? ((vg) this).field_Mb : ((vg) this).field_Fb;
        int var4 = ((vg) this).field_Mb <= ((vg) this).field_Fb ? ((vg) this).field_Fb : ((vg) this).field_Mb;
        return var2.substring(var3, var4);
    }

    private final int i(int param0) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var2 = ((vg) this).field_Ub.length();
        int var3 = 112 / ((param0 - 27) / 50);
        if (((vg) this).field_Mb == var2) {
            return ((vg) this).field_Mb;
        }
        for (var4 = ((vg) this).field_Mb - -1; var4 < var2; var4++) {
            // ifne L76
        }
        return var4;
    }

    final void f(int param0, int param1) {
        ((vg) this).field_Mb = param1;
        ((vg) this).field_Fb = param1;
        if (param0 > -22) {
            ((vg) this).a(88, -94, -16, -118, -110);
        }
    }

    final static String a(int param0) {
        int var1 = 100 / ((36 - param0) / 50);
        String var2 = "";
        if (pb.field_E != null) {
            var2 = pb.field_E.a(124);
        }
        if (-1 == (var2.length() ^ -1)) {
            var2 = ue.f((byte) 99);
        }
        if (0 == var2.length()) {
            var2 = pc.field_d;
        }
        return var2;
    }

    private final void a(int param0, byte param1) {
        ((vg) this).field_Mb = param0;
        if (param1 > -70) {
            vg.c(-51, -118);
        }
        if (!ne.field_G[81]) {
            ((vg) this).field_Fb = ((vg) this).field_Mb;
        }
    }

    private final int h(int param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != 26864) {
            this.l(11);
        }
        if (((vg) this).field_Mb == 0) {
            return ((vg) this).field_Mb;
        }
        for (var2 = ((vg) this).field_Mb - 1; (var2 ^ -1) < -1; var2--) {
            // ifne L70
        }
        return var2;
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        if ((((vg) this).field_Eb ^ -1) != 0) {
            var3 = ((vg) this).field_Eb - ((vg) this).field_Ub.length();
            if (0 == var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (param1 >= -1) {
            field_Wb = true;
        }
        if (((vg) this).field_Mb == ((vg) this).field_Ub.length()) {
            StringBuilder discarded$1 = ((vg) this).field_Ub.append(param0);
        } else {
            var4 = ((vg) this).field_Ub.toString().substring(((vg) this).field_Mb, ((vg) this).field_Ub.length());
            StringBuilder discarded$2 = dj.a(((vg) this).field_Mb, ' ', -11407, ((vg) this).field_Ub);
            StringBuilder discarded$3 = ((vg) this).field_Ub.append(param0);
            StringBuilder discarded$4 = ((vg) this).field_Ub.append(var4);
        }
        ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
        ((vg) this).field_Mb = ((vg) this).field_Ub.length();
        ((vg) this).field_Fb = ((vg) this).field_Mb;
    }

    vg(long param0, hd param1, hd param2, hd param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = Kickabout.field_G;
        int var4 = ((vg) this).field_Ub.length();
        if (-1 >= (param0 ^ -1)) {
            // if_icmpge L35
            param0 = var4;
        } else {
            param0 = 0;
        }
        if (param1 >= -83) {
            this.c(false);
        }
        if (param2 < 0) {
            param2 = 0;
        } else {
            if (!(var4 >= param2)) {
                param2 = var4;
            }
        }
        ((vg) this).field_Mb = param0;
        ((vg) this).field_Fb = param2;
    }

    final void b(int param0) {
        try {
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_12_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            int stackIn_28_0 = 0;
            Object stackOut_11_0 = null;
            Object stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            Object stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            int stackOut_26_0 = 0;
            int stackOut_27_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Kickabout.field_G;
                        var2 = this.d(el.field_A + -((vg) this).field_F - ((vg) this).field_Lb.field_D, param0 ^ param0);
                        if (((vg) this).field_sb == 1) {
                            statePc = 11;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (1 != nl.field_p) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (((vg) this).field_Jb) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ((vg) this).field_Jb = false;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 5: {
                        if (!((vg) this).field_Hb) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var2 >= ((vg) this).field_Tb) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (((vg) this).field_Fb < var2) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var2 = ((vg) this).field_Tb;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((vg) this).field_Mb = var2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 11: {
                        this.a(var2, (byte) -112);
                        ((vg) this).field_Jb = true;
                        var3_long = nj.a(-69);
                        stackOut_11_0 = this;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var3_long + -((vg) this).field_Sb >= 250L) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((vg) this).field_Hb = stackIn_14_1 != 0;
                        if (!((vg) this).field_Hb) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        ((vg) this).field_Fb = this.h(26864);
                        ((vg) this).field_Mb = this.i(-26);
                        if (((vg) this).field_Mb <= 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (32 != ((vg) this).field_Ub.charAt(((vg) this).field_Mb - 1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        ((vg) this).field_Mb = ((vg) this).field_Mb - 1;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((vg) this).field_Tb = ((vg) this).field_Mb;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((vg) this).field_Sb = var3_long;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (!((vg) this).field_wb) {
                            statePc = 22;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        ((vg) this).field_Fb = ((vg) this).field_Ub.length();
                        ((vg) this).field_Mb = ((vg) this).field_Ub.length();
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((vg) this).field_yb.field_s = ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.toString().substring(0, ((vg) this).field_Mb));
                        if (((vg) this).field_Fb != ((vg) this).field_Mb) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        ((vg) this).field_Nb.a(true, 0, ((vg) this).field_yb.field_s, 2, ((vg) this).field_Ab);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 25: {
                        var3 = ((vg) this).field_Lb.field_s + ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.toString().substring(0, ((vg) this).field_Fb));
                        if (var3 < ((vg) this).field_yb.field_s) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        stackOut_26_0 = ((vg) this).field_yb.field_s;
                        stackIn_28_0 = stackOut_26_0;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        stackOut_27_0 = var3;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        var4_int = stackIn_28_0;
                        var5 = Math.abs(-((vg) this).field_yb.field_s + var3);
                        ((vg) this).field_Nb.a(true, var5, var4_int + ((vg) this).field_Lb.field_D, 2, ((vg) this).field_Ab);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (((vg) this).field_Gb == null) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (((vg) this).field_Gb.field_a != 0) {
                            statePc = 32;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        var7 = (java.awt.datatransfer.Transferable) ((vg) this).field_Gb.field_b;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        try {
                            var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.l(32);
                            this.a(var8, -41);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        ((vg) this).field_Gb = null;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -630) {
            field_Db = null;
        }
        ((vg) this).a(true, param4, param1, param2, param3);
        ((vg) this).field_Lb.a(true, param4, 0, 0, param3);
        ((vg) this).field_yb.a(true, param4, 0, 0, param3);
        ((vg) this).field_Ab = param3 + -4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Rb = true;
        field_Ob = 0;
        field_Vb = "Location";
        field_Bb = null;
        field_Db = new nb[89];
        field_Kb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_Cb = "Try changing the following settings:  ";
        field_Wb = true;
    }
}
