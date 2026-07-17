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
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        StringBuilder stackIn_2_2 = null;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        StringBuilder stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        StringBuilder stackOut_1_1 = null;
        StringBuilder stackOut_1_2 = null;
        Object stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        StringBuilder stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        StringBuilder stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((vg) this).field_Sb = 0L;
        ((vg) this).field_Tb = -1;
        ((vg) this).field_Jb = false;
        ((vg) this).field_Hb = false;
        try {
          L0: {
            L1: {
              ((vg) this).field_Eb = param4;
              ((vg) this).field_Nb = new hd(0L, param2);
              ((vg) this).field_Lb = new hd(0L, param3);
              ((vg) this).field_yb = new hd(0L, param3);
              ((vg) this).field_nb = true;
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (((vg) this).field_Eb != -1) {
                stackOut_3_0 = this;
                stackOut_3_1 = null;
                stackOut_3_2 = null;
                stackOut_3_3 = ((vg) this).field_Eb;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = null;
                stackOut_2_2 = null;
                stackOut_2_3 = 256;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            ((vg) this).field_Ub = new StringBuilder(stackIn_4_3);
            ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
            ((vg) this).field_yb.field_E = "";
            ((vg) this).field_yb.field_V = "|";
            ((vg) this).field_jb = new tf();
            ((vg) this).a((byte) -123, ((vg) this).field_Nb);
            ((vg) this).a((byte) -113, ((vg) this).field_Lb);
            ((vg) this).a((byte) -115, ((vg) this).field_yb);
            ((vg) this).field_wb = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("vg.<init>(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
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

    private final void c() {
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
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        jm var6_ref_jm = null;
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
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (go.field_b != 0) {
                L2: {
                  var2_long = nj.a(param1 + -75);
                  var4 = go.field_b;
                  if (0.0 == m.field_a) {
                    break L2;
                  } else {
                    var4 = (int)((double)var4 + ac.field_d.nextGaussian() * m.field_a);
                    if (0 <= var4) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (or.field_d.field_n > 0) {
                    var18 = new byte[or.field_d.field_n];
                    var16 = var18;
                    var14 = var16;
                    var11 = var14;
                    var8 = var11;
                    var19 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= var18.length) {
                        var6_ref_jm = new jm((long)var4 + var2_long, or.field_d.field_n, var19);
                        am.field_g.a((gn) (Object) var6_ref_jm, 3);
                        or.field_d.field_n = 0;
                        break L3;
                      } else {
                        var8[var6] = or.field_d.field_f[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var9 = (jm) (Object) am.field_g.g(24009);
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if (var13.field_f < var2_long) {
                    var13.c((byte) -109);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var10 >= var13.field_j) {
                        or.field_d.field_n = var13.field_j;
                        break L1;
                      } else {
                        or.field_d.field_f[var10] = var9.field_k[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              int discarded$1 = 0;
              c.a(param0);
              if (param1 == 0) {
                break L6;
              } else {
                field_Qb = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "vg.A(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(bu param0, int param1) {
        if (param1 != -17421) {
            return;
        }
        try {
            ((vg) this).field_Pb = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vg.KA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 20 / ((62 - param1) / 58);
        if (null != ((vg) this).field_Lb) {
            ((vg) this).field_Lb.field_y = param0;
        }
    }

    final static void a(boolean param0, wd param1) {
        ml var3 = null;
        try {
            var3 = or.field_d;
            var3.b(7, (byte) 98);
            var3.a(127, param1.field_k);
            var3.a(115, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vg.RA(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 44 + 7 + 41);
        }
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
        return true;
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        try {
            ((vg) this).field_Ub.setLength(0);
            if (param1 != -23174) {
                ((vg) this).f(24, 5);
            }
            var3_int = param0.length();
            if (((vg) this).field_Eb != -1) {
                if (!(((vg) this).field_Eb >= var3_int)) {
                    var3_int = ((vg) this).field_Eb;
                }
            }
            StringBuilder discarded$0 = ((vg) this).field_Ub.append(param0.substring(0, var3_int));
            int dupTemp$1 = ((vg) this).field_Ub.length();
            ((vg) this).field_Fb = dupTemp$1;
            ((vg) this).field_Mb = dupTemp$1;
            ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vg.NA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void b(int param0, int param1) {
        sr.field_c = rt.field_G[param0];
        ks.field_g = fi.field_g[param0];
        ep.field_e = ss.field_a[param0];
    }

    private final void h() {
        if (null == ((vg) this).field_Pb) {
            return;
        }
        int discarded$0 = 0;
        this.c();
        this.l(32);
    }

    private final void k() {
        if (null == ((vg) this).field_Pb) {
            return;
        }
        ((vg) this).field_Gb = ((vg) this).field_Pb.a(15);
    }

    private final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        var3 = param1;
        var4 = 0;
        var5 = ((vg) this).field_Ub.length();
        L0: while (true) {
          L1: {
            if (var4 >= param0) {
              break L1;
            } else {
              if (var5 <= var3) {
                break L1;
              } else {
                int incrementValue$2 = var3;
                var3++;
                var4 = var4 + ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.charAt(incrementValue$2));
                continue L0;
              }
            }
          }
          return var3;
        }
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
                  int discarded$8 = this.d(-84, 20);
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
                      if (((vg) this).field_Eb == -1) {
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
                        StringBuilder discarded$9 = ((vg) this).field_Ub.append(param1);
                        break L5;
                      } else {
                        var5 = ((vg) this).field_Ub.toString().substring(((vg) this).field_Mb, ((vg) this).field_Ub.length());
                        StringBuilder discarded$10 = dj.a(((vg) this).field_Mb, ' ', param2 + -12282, ((vg) this).field_Ub);
                        StringBuilder discarded$11 = ((vg) this).field_Ub.append(param1);
                        StringBuilder discarded$12 = ((vg) this).field_Ub.append(var5);
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
                    if (((vg) this).field_Mb > 0) {
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
                        if (param0 == 97) {
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
                                    int discarded$13 = 74;
                                    this.h();
                                    return true;
                                  }
                                }
                              }
                              L9: {
                                if (!ne.field_G[82]) {
                                  break L9;
                                } else {
                                  if (param0 == 66) {
                                    int discarded$14 = 0;
                                    this.c();
                                    return true;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (!ne.field_G[82]) {
                                break L6;
                              } else {
                                if (param0 != 67) {
                                  break L6;
                                } else {
                                  int discarded$15 = 38;
                                  this.k();
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
                        if (((vg) this).field_Mb <= 0) {
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var2 = ((vg) this).field_Ub.length();
        var3 = 112 / ((param0 - 27) / 50);
        if (((vg) this).field_Mb != var2) {
          var4 = ((vg) this).field_Mb - -1;
          L0: while (true) {
            L1: {
              if (var4 >= var2) {
                break L1;
              } else {
                if (pi.a(-41, ((vg) this).field_Ub.charAt(-1 + var4))) {
                  break L1;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
            return var4;
          }
        } else {
          return ((vg) this).field_Mb;
        }
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
        if (var2.length() == 0) {
            int discarded$0 = 99;
            var2 = ue.f();
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
        int var3 = 0;
        L0: {
          var3 = Kickabout.field_G;
          if (param0 == 26864) {
            break L0;
          } else {
            this.l(11);
            break L0;
          }
        }
        if (((vg) this).field_Mb != 0) {
          var2 = ((vg) this).field_Mb - 1;
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (pi.a(-41, ((vg) this).field_Ub.charAt(-1 + var2))) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return ((vg) this).field_Mb;
        }
    }

    private final void a(String param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (((vg) this).field_Eb == -1) {
                break L1;
              } else {
                var3_int = ((vg) this).field_Eb - ((vg) this).field_Ub.length();
                if (0 != var3_int) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((vg) this).field_Mb != ((vg) this).field_Ub.length()) {
                var4 = ((vg) this).field_Ub.toString().substring(((vg) this).field_Mb, ((vg) this).field_Ub.length());
                StringBuilder discarded$9 = dj.a(((vg) this).field_Mb, ' ', -11407, ((vg) this).field_Ub);
                StringBuilder discarded$10 = ((vg) this).field_Ub.append(param0);
                StringBuilder discarded$11 = ((vg) this).field_Ub.append(var4);
                break L2;
              } else {
                StringBuilder discarded$12 = ((vg) this).field_Ub.append(param0);
                break L2;
              }
            }
            ((vg) this).field_Lb.field_E = ((vg) this).field_Ub.toString();
            ((vg) this).field_Mb = ((vg) this).field_Ub.length();
            ((vg) this).field_Fb = ((vg) this).field_Mb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vg.IA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + -41 + 41);
        }
    }

    vg(long param0, hd param1, hd param2, hd param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          var4 = ((vg) this).field_Ub.length();
          if (param0 < 0) {
            param0 = 0;
            break L0;
          } else {
            if (var4 >= param0) {
              break L0;
            } else {
              param0 = var4;
              break L0;
            }
          }
        }
        L1: {
          if (param1 < -83) {
            break L1;
          } else {
            int discarded$2 = 0;
            this.c();
            break L1;
          }
        }
        L2: {
          if (param2 >= 0) {
            if (var4 < param2) {
              param2 = var4;
              break L2;
            } else {
              break L2;
            }
          } else {
            param2 = 0;
            break L2;
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
            Throwable decompiledCaughtException = null;
            Object stackOut_11_0 = null;
            Object stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            Object stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            int stackOut_27_0 = 0;
            int stackOut_26_0 = 0;
            L0: {
              var6 = Kickabout.field_G;
              var2 = this.d(el.field_A + -((vg) this).field_F - ((vg) this).field_Lb.field_D, param0 ^ param0);
              if (((vg) this).field_sb == 1) {
                L1: {
                  this.a(var2, (byte) -112);
                  ((vg) this).field_Jb = true;
                  var3_long = nj.a(-69);
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var3_long + -((vg) this).field_Sb >= 250L) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L1;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L1;
                  }
                }
                L2: {
                  ((vg) this).field_Hb = stackIn_14_1 != 0;
                  if (!((vg) this).field_Hb) {
                    break L2;
                  } else {
                    L3: {
                      ((vg) this).field_Fb = this.h(26864);
                      ((vg) this).field_Mb = this.i(-26);
                      if (((vg) this).field_Mb <= 0) {
                        break L3;
                      } else {
                        if (32 != ((vg) this).field_Ub.charAt(((vg) this).field_Mb - 1)) {
                          break L3;
                        } else {
                          ((vg) this).field_Mb = ((vg) this).field_Mb - 1;
                          break L3;
                        }
                      }
                    }
                    ((vg) this).field_Tb = ((vg) this).field_Mb;
                    break L2;
                  }
                }
                ((vg) this).field_Sb = var3_long;
                break L0;
              } else {
                L4: {
                  if (1 != nl.field_p) {
                    break L4;
                  } else {
                    if (((vg) this).field_Jb) {
                      L5: {
                        if (!((vg) this).field_Hb) {
                          break L5;
                        } else {
                          if (var2 >= ((vg) this).field_Tb) {
                            break L5;
                          } else {
                            if (((vg) this).field_Fb < var2) {
                              var2 = ((vg) this).field_Tb;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      ((vg) this).field_Mb = var2;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                ((vg) this).field_Jb = false;
                break L0;
              }
            }
            L6: {
              if (!((vg) this).field_wb) {
                int dupTemp$2 = ((vg) this).field_Ub.length();
                ((vg) this).field_Fb = dupTemp$2;
                ((vg) this).field_Mb = dupTemp$2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ((vg) this).field_yb.field_s = ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.toString().substring(0, ((vg) this).field_Mb));
              if (((vg) this).field_Fb != ((vg) this).field_Mb) {
                L8: {
                  var3 = ((vg) this).field_Lb.field_s + ((vg) this).field_Lb.field_X.a(((vg) this).field_Ub.toString().substring(0, ((vg) this).field_Fb));
                  if (var3 < ((vg) this).field_yb.field_s) {
                    stackOut_27_0 = var3;
                    stackIn_28_0 = stackOut_27_0;
                    break L8;
                  } else {
                    stackOut_26_0 = ((vg) this).field_yb.field_s;
                    stackIn_28_0 = stackOut_26_0;
                    break L8;
                  }
                }
                var4_int = stackIn_28_0;
                var5 = Math.abs(-((vg) this).field_yb.field_s + var3);
                ((vg) this).field_Nb.a(true, var5, var4_int + ((vg) this).field_Lb.field_D, 2, ((vg) this).field_Ab);
                break L7;
              } else {
                ((vg) this).field_Nb.a(true, 0, ((vg) this).field_yb.field_s, 2, ((vg) this).field_Ab);
                break L7;
              }
            }
            L9: {
              if (((vg) this).field_Gb == null) {
                break L9;
              } else {
                if (((vg) this).field_Gb.field_a != 0) {
                  var7 = (java.awt.datatransfer.Transferable) ((vg) this).field_Gb.field_b;
                  try {
                    L10: {
                      var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                      this.l(32);
                      int discarded$3 = -41;
                      this.a(var8);
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L11: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L11;
                    }
                  }
                  ((vg) this).field_Gb = null;
                  break L9;
                } else {
                  break L9;
                }
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
