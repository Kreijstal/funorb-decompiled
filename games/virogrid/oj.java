/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends km {
    private char[] field_Jb;
    private int field_Lb;
    private int field_Ob;
    private oj[] field_Wb;
    static lc field_Xb;
    private int field_Eb;
    private int field_Nb;
    static java.awt.Image field_Gb;
    private static long[] field_Mb;
    static eh field_Fb;
    static int field_Vb;
    static int field_Kb;
    private int field_Pb;
    private oj field_Qb;
    private int field_Hb;
    private int[] field_Sb;
    private hk[] field_Ib;
    private int field_Rb;
    static int field_Yb;
    static el field_Ub;
    private int field_Tb;

    final boolean i(int param0) {
        int var4 = 0;
        hk var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        hk[] var3 = ((oj) this).field_Ib;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_nb ? 1 : 0);
        }
        if (var2 == 0) {
            if ((((oj) this).field_Tb ^ -1) != 0) {
                if (((oj) this).field_Wb[((oj) this).field_Tb] != null) {
                    var2 = ((oj) this).field_Wb[((oj) this).field_Tb].i(-9184) ? 1 : 0;
                }
            }
        }
        if (param0 != -9184) {
            ((oj) this).field_Jb = null;
        }
        return var2 != 0;
    }

    oj(long param0, km param1, km param2, km param3, oj[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        e var17 = null;
        e var18 = null;
        ((oj) this).field_Tb = -1;
        ((oj) this).field_Jb = param7;
        ((oj) this).field_Sb = param5;
        ((oj) this).field_Wb = param4;
        ((oj) this).field_Nb = ((oj) this).field_Sb.length;
        var17 = param3.field_C;
        var18 = var17;
        ((oj) this).field_Ob = 2 + (var18.field_H + var18.field_G);
        ((oj) this).field_Lb = ((oj) this).field_Nb * ((oj) this).field_Ob;
        ((oj) this).field_Eb = 0;
        ((oj) this).field_Ib = new hk[((oj) this).field_Nb];
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (var13 >= ((oj) this).field_Nb) {
            ((oj) this).field_Eb = ((oj) this).field_Eb + (da.field_h.field_u - -10);
            this.b(12, (byte) 49);
            return;
          } else {
            L1: {
              if (0 >= ((oj) this).field_Jb[var13]) {
                break L1;
              } else {
                param6[var13] = var11 + mb.a(true, ((oj) this).field_Jb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((oj) this).field_Wb[var13]) {
                  break L3;
                } else {
                  if (-1 != ((oj) this).field_Sb[var13]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = (Object) (Object) da.field_h;
              break L2;
            }
            ((oj) this).field_Ib[var13] = new hk(0L, param2, (km) null, param3, (mg) var14, param6[var13]);
            ((oj) this).a(0, (km) (Object) ((oj) this).field_Ib[var13]);
            var15 = var17.a(param6[var13]);
            if (var15 > ((oj) this).field_Eb) {
              ((oj) this).field_Eb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 <= -118) {
            break L0;
          } else {
            boolean discarded$1 = ((oj) this).a(false, -98, -15);
            break L0;
          }
        }
        L1: {
          if ((param2 ^ -1) != (((oj) this).field_Tb ^ -1)) {
            if (null != ((oj) this).field_Wb[param2]) {
              ((oj) this).h(1026);
              this.b(0, (byte) 49);
              ((oj) this).field_Tb = param2;
              ((oj) this).field_Qb = ((oj) this).field_Wb[((oj) this).field_Tb];
              nb.a(false, ((oj) this).field_Qb);
              ((oj) this).field_Qb.b(12, (byte) 49);
              break L1;
            } else {
              if (0 == (((oj) this).field_Sb[param2] ^ -1)) {
                aa.a((byte) 83);
                f.a((byte) -38);
                break L1;
              } else {
                L2: {
                  var5 = ((oj) this).field_Sb[param2] | 32768;
                  var6 = sd.field_e;
                  if (-1 != (var6 ^ -1)) {
                    break L2;
                  } else {
                    if (wl.field_d != null) {
                      var6 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((id.a(var6, (byte) 55) ^ -1) == -3) {
                    sd.a(1, param3, var6, (byte) 58);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = null;
                jl.a(var5, sd.field_e, va.field_d, param1, (byte) 39, (String) null);
                uk.a(var5, 5, va.field_d, sd.field_e, oc.field_n);
                f.a((byte) -128);
                gg.a(15810);
                break L1;
              }
            }
          } else {
            ((oj) this).h(1026);
            this.b(0, (byte) 49);
            break L1;
          }
        }
    }

    final void h(int param0) {
        int var3 = 0;
        hk var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        hk[] var6 = ((oj) this).field_Ib;
        hk[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_nb = 0;
            var4.field_xb = false;
        }
        if (null != ((oj) this).field_Qb) {
            ((oj) this).field_Qb.h(param0 + 0);
            ((oj) this).field_Qb.a(false);
        }
        ((oj) this).field_Tb = -1;
        ((oj) this).field_Qb = null;
        this.b(12, (byte) 49);
        if (param0 != 1026) {
            ((oj) this).field_Nb = -75;
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (-86 != (um.field_Gb ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (null != ((oj) this).field_Qb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (0 != (((oj) this).field_Qb.field_Tb ^ -1)) {
                break L1;
              } else {
                ((oj) this).h(1026);
                this.b(0, (byte) 49);
                return true;
              }
            }
          }
          return ((oj) this).field_Qb.a(true, param1, param2);
        } else {
          L2: {
            if (((oj) this).field_Qb != null) {
              break L2;
            } else {
              if ((Object) (Object) dk.field_v != this) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  f.a((byte) -99);
                  return true;
                }
              }
            }
          }
          L3: {
            if (param0) {
              break L3;
            } else {
              oj.e((byte) 20);
              break L3;
            }
          }
          var5 = nm.field_d;
          if (var5 > 0) {
            L4: {
              if (ne.field_a != var5) {
                break L4;
              } else {
                var5 = 63;
                break L4;
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var6 >= ((oj) this).field_Jb.length) {
                return false;
              } else {
                if (var5 != ((oj) this).field_Jb[var6]) {
                  var6++;
                  continue L5;
                } else {
                  this.a(-120, param2, var6, param1);
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void f(byte param0) {
        int var1 = 123 % ((param0 - -52) / 43);
        field_Xb = null;
        field_Fb = null;
        field_Ub = null;
        field_Mb = null;
        field_Gb = null;
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return nm.a(mb.g((byte) -90), 123);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        ((oj) this).field_Rb = ((oj) this).field_Eb - -(param1 * 2);
        ((oj) this).a(param2, ((oj) this).field_Lb, ((oj) this).field_Rb, (byte) -113, param3 + -((oj) this).field_Lb);
        if (!(((oj) this).field_Hb == param4)) {
            ((oj) this).field_Hb = param4;
            this.b(((oj) this).field_Pb, (byte) 49);
        }
        for (var7 = param5; var7 < ((oj) this).field_Nb; var7++) {
            ((oj) this).field_Ib[var7].a(((oj) this).field_Rb, 0, 2, ((oj) this).field_Ib[var7].field_F, param0, ((oj) this).field_Ob, param1);
        }
        if (((oj) this).field_Tb != -1) {
            if (!(null == ((oj) this).field_Wb[((oj) this).field_Tb])) {
                var7 = ((oj) this).field_Wb[((oj) this).field_Tb].field_Nb;
                var8 = ((oj) this).field_F + ((oj) this).field_Ob * (var7 + ((oj) this).field_Tb);
                while (var8 > param3) {
                    var8 = var8 - ((oj) this).field_Ob;
                }
                ((oj) this).field_Wb[((oj) this).field_Tb].a(param0, param1, param2 - -((oj) this).field_Rb, var8, ((oj) this).field_Ib[((oj) this).field_Tb].field_J, 0);
            }
        }
    }

    final static void a(int param0, wg param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, wg param11, byte param12, int param13, e param14, int param15, int param16, e param17, int param18, wg param19, int param20) {
        wf.a(param10, param17, 0, param14);
        vb.a(param0, (byte) 90, param16, param20, param18);
        bj.a(param8, 23, param15);
        if (param12 != -29) {
            field_Yb = 64;
        }
        sh.a((byte) -40, param9, param19, param11, param2, param5);
        ld.a(param12 ^ 28, param3, param6, param1);
        qd.a(param4, (byte) 41, param7, param13);
    }

    final static void e(byte param0) {
        int var1_int = 0;
        pm var1 = null;
        float var1_float = 0.0f;
        float var2_float = 0.0f;
        ij var2 = null;
        fl var3 = null;
        ij var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ij var7 = null;
        ij stackIn_78_0 = null;
        ij stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        ij stackIn_79_0 = null;
        ij stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        ij stackIn_80_0 = null;
        ij stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_110_0 = 0;
        ij stackOut_77_0 = null;
        ij stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        ij stackOut_79_0 = null;
        ij stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        ij stackOut_78_0 = null;
        ij stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          if (ln.field_g == bc.field_c) {
            break L0;
          } else {
            L1: {
              L2: {
                var1_int = 1;
                if (gb.field_H.field_g) {
                  break L2;
                } else {
                  if (!ke.field_p.field_g) {
                    break L2;
                  } else {
                    em.field_c = sg.field_i;
                    jk.field_c = 2;
                    ec.field_z = sj.field_o;
                    var2_float = -cf.field_c + ec.field_z;
                    L3: while (true) {
                      if ((double)var2_float >= -3.141592653589793) {
                        L4: while (true) {
                          if ((double)var2_float <= 3.141592653589793) {
                            L5: {
                              if ((double)Math.abs(var2_float) > 0.01) {
                                break L5;
                              } else {
                                if ((double)Math.abs(lj.field_r - em.field_c) <= 0.05) {
                                  lj.field_r = em.field_c;
                                  cf.field_c = ec.field_z;
                                  vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                  vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                  gb.c((byte) -44);
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var1_int = 0;
                            break L1;
                          } else {
                            var2_float = (float)((double)var2_float - 6.283185307179586);
                            continue L4;
                          }
                        }
                      } else {
                        var2_float = (float)((double)var2_float + 6.283185307179586);
                        continue L3;
                      }
                    }
                  }
                }
              }
              if (!gb.field_H.field_g) {
                break L1;
              } else {
                if (!ke.field_p.field_g) {
                  cf.field_c = sj.field_o;
                  lj.field_r = sg.field_i;
                  vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                  vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                  ke.field_p.field_g = true;
                  gb.c((byte) -44);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              ke.field_p.field_k = gb.field_H.field_k;
              if (!gb.field_H.field_d) {
                L7: {
                  if (!ke.field_p.field_d) {
                    break L7;
                  } else {
                    mj.field_D = 0;
                    ke.field_p.field_d = false;
                    break L7;
                  }
                }
                mj.field_D = mj.field_D + 16384;
                if (mj.field_D >= 262144) {
                  mj.field_D = 262144;
                  break L6;
                } else {
                  var1_int = 0;
                  break L6;
                }
              } else {
                mj.field_D = mj.field_D - 16384;
                if ((mj.field_D ^ -1) < -1) {
                  var1_int = 0;
                  break L6;
                } else {
                  mj.field_D = 0;
                  break L6;
                }
              }
            }
            L8: {
              if (gb.field_H.field_f > ke.field_p.field_f) {
                ke.field_p.field_f = ke.field_p.field_f + 1;
                break L8;
              } else {
                if (ke.field_p.field_f > gb.field_H.field_f) {
                  ke.field_p.field_f = ke.field_p.field_f - 1;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (ke.field_p.field_f == gb.field_H.field_f) {
                break L9;
              } else {
                var1_int = 0;
                break L9;
              }
            }
            ke.field_p.field_m = gb.field_H.field_m;
            ke.field_p.field_e = gb.field_H.field_e;
            if (var1_int == 0) {
              break L0;
            } else {
              ke.field_p = gb.field_H;
              ln.field_g = bc.field_c;
              break L0;
            }
          }
        }
        L10: {
          if (jk.field_c != 0) {
            L11: while (true) {
              if ((double)cf.field_c >= -3.141592653589793) {
                L12: while (true) {
                  if (-3.141592653589793 <= (double)ec.field_z) {
                    L13: while (true) {
                      if (3.141592653589793 >= (double)cf.field_c) {
                        L14: while (true) {
                          if ((double)ec.field_z <= 3.141592653589793) {
                            var1_float = ec.field_z - cf.field_c;
                            L15: while (true) {
                              if ((double)var1_float >= -3.141592653589793) {
                                L16: while (true) {
                                  if ((double)var1_float <= 3.141592653589793) {
                                    L17: {
                                      var2_float = em.field_c - lj.field_r;
                                      cf.field_c = cf.field_c + 0.05000000074505806f * var1_float;
                                      lj.field_r = lj.field_r + var2_float * 0.05000000074505806f;
                                      vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                      vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                      gb.c((byte) -44);
                                      if ((double)Math.abs(var1_float) >= 0.0001) {
                                        break L17;
                                      } else {
                                        if (0.05 > (double)Math.abs(var2_float)) {
                                          lj.field_r = em.field_c;
                                          cf.field_c = ec.field_z;
                                          jk.field_c = 0;
                                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                          gb.c((byte) -44);
                                          break L10;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if ((double)Math.abs(var1_float) >= 0.1) {
                                      break L10;
                                    } else {
                                      if (Math.abs(var2_float) < 1.0f) {
                                        jk.field_c = 1;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    var1_float = (float)((double)var1_float - 6.283185307179586);
                                    continue L16;
                                  }
                                }
                              } else {
                                var1_float = (float)((double)var1_float + 6.283185307179586);
                                continue L15;
                              }
                            }
                          } else {
                            ec.field_z = (float)((double)ec.field_z - 6.283185307179586);
                            continue L14;
                          }
                        }
                      } else {
                        cf.field_c = (float)((double)cf.field_c - 6.283185307179586);
                        continue L13;
                      }
                    }
                  } else {
                    ec.field_z = (float)((double)ec.field_z + 6.283185307179586);
                    continue L12;
                  }
                }
              } else {
                cf.field_c = (float)((double)cf.field_c + 6.283185307179586);
                continue L11;
              }
            }
          } else {
            break L10;
          }
        }
        L18: {
          if (-11 == (hm.field_c ^ -1)) {
            L19: {
              ad.field_g[0] = 1.0;
              mj.field_D = 262144;
              em.field_c = 80.0f;
              lj.field_r = 80.0f;
              ad.field_g[2] = 0.0;
              co.field_h = 0;
              we.field_k = 50.0f;
              ao.field_Hb = 52.5f;
              cf.field_c = sj.field_o;
              if ((id.field_r ^ -1) > -11) {
                jk.field_c = 2;
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
                break L19;
              } else {
                break L19;
              }
            }
            if ((id.field_r ^ -1) >= -351) {
              ec.field_z = sj.field_o;
              em.field_c = 80.0f;
              break L18;
            } else {
              break L18;
            }
          } else {
            break L18;
          }
        }
        var1 = (pm) (Object) gd.field_n.a((byte) -122);
        L20: while (true) {
          if (var1 == null) {
            var2 = (ij) (Object) sk.field_a.a((byte) -69);
            L21: while (true) {
              if (var2 == null) {
                L22: {
                  if (0 != sh.a(4712, 40)) {
                    break L22;
                  } else {
                    L23: {
                      stackOut_77_0 = null;
                      stackOut_77_1 = null;
                      stackOut_77_2 = sh.a(4712, 3);
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      stackIn_79_2 = stackOut_77_2;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      stackIn_78_2 = stackOut_77_2;
                      if (sh.a(4712, 2) != 0) {
                        stackOut_79_0 = null;
                        stackOut_79_1 = null;
                        stackOut_79_2 = stackIn_79_2;
                        stackOut_79_3 = 0;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
                        stackIn_80_2 = stackOut_79_2;
                        stackIn_80_3 = stackOut_79_3;
                        break L23;
                      } else {
                        stackOut_78_0 = null;
                        stackOut_78_1 = null;
                        stackOut_78_2 = stackIn_78_2;
                        stackOut_78_3 = 1;
                        stackIn_80_0 = stackOut_78_0;
                        stackIn_80_1 = stackOut_78_1;
                        stackIn_80_2 = stackOut_78_2;
                        stackIn_80_3 = stackOut_78_3;
                        break L23;
                      }
                    }
                    var7 = new ij(stackIn_80_2, stackIn_80_3 != 0, sh.a(4712, 64));
                    var3_ref = (ij) (Object) sk.field_a.a((byte) -64);
                    L24: while (true) {
                      L25: {
                        if (var3_ref == null) {
                          break L25;
                        } else {
                          if (var7.field_l <= var3_ref.field_l) {
                            var3_ref = (ij) (Object) sk.field_a.a(16213);
                            continue L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (var3_ref != null) {
                        td.a((l) (Object) var3_ref, (byte) -93, (l) (Object) var7);
                        break L22;
                      } else {
                        sk.field_a.a((l) (Object) var7, (byte) -69);
                        break L22;
                      }
                    }
                  }
                }
                var3 = (fl) (Object) sh.field_tb.a((byte) -68);
                L26: while (true) {
                  if (var3 == null) {
                    L27: {
                      if ((ke.field_p.field_e ^ -1) >= -1) {
                        break L27;
                      } else {
                        L28: {
                          if ((ke.field_p.field_e ^ -1) == -2) {
                            break L28;
                          } else {
                            if (sh.a(4712, ke.field_p.field_e) == 0) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L29: while (true) {
                          var4 = -4096 + sh.a(4712, 8193);
                          var5 = -4096 + sh.a(4712, 8193);
                          if (var4 * var4 - -(var5 * var5) >= 8388608) {
                            continue L29;
                          } else {
                            var3 = new fl(0, 1638400, 0, var4, -8192, var5, 150);
                            sh.field_tb.a((l) (Object) var3, (byte) -104);
                            break L27;
                          }
                        }
                      }
                    }
                    L30: {
                      if (param0 <= -32) {
                        break L30;
                      } else {
                        field_Mb = null;
                        break L30;
                      }
                    }
                    L31: {
                      if (-4 != hm.field_c) {
                        if (-2 != hm.field_c) {
                          L32: {
                            if (gb.field_H.field_g) {
                              stackOut_109_0 = 2;
                              stackIn_110_0 = stackOut_109_0;
                              break L32;
                            } else {
                              stackOut_108_0 = 1;
                              stackIn_110_0 = stackOut_108_0;
                              break L32;
                            }
                          }
                          wn.field_C = stackIn_110_0;
                          break L31;
                        } else {
                          wn.field_C = 0;
                          break L31;
                        }
                      } else {
                        wn.field_C = 0;
                        break L31;
                      }
                    }
                    L33: {
                      if (wn.field_C != he.field_ec) {
                        int fieldTemp$4 = ai.field_f + 8;
                        ai.field_f = ai.field_f + 8;
                        if ((fieldTemp$4 ^ -1) <= -257) {
                          ai.field_f = 0;
                          he.field_ec = wn.field_C;
                          break L33;
                        } else {
                          break L33;
                        }
                      } else {
                        ai.field_f = 0;
                        break L33;
                      }
                    }
                    L34: {
                      var4 = 0;
                      if (wn.field_C == 2) {
                        var4 = vg.field_H.a(sl.field_a) - -17;
                        if (-136 >= (var4 ^ -1)) {
                          break L34;
                        } else {
                          var4 = 135;
                          break L34;
                        }
                      } else {
                        if (wn.field_C != 1) {
                          break L34;
                        } else {
                          var4 = vg.field_H.a(o.field_a) + 17 - -8;
                          break L34;
                        }
                      }
                    }
                    kd.field_t = kd.field_t + 0.10000000149011612f * (-kd.field_t + (float)var4);
                    return;
                  } else {
                    L35: {
                      int fieldTemp$5 = var3.field_o - 1;
                      var3.field_o = var3.field_o - 1;
                      if (-1 > (fieldTemp$5 ^ -1)) {
                        var3.field_p = var3.field_p + var3.field_l;
                        var3.field_m = var3.field_m + var3.field_h;
                        var3.field_n = var3.field_n + var3.field_q;
                        var3.field_l = var3.field_l + 48;
                        break L35;
                      } else {
                        var3.a(false);
                        break L35;
                      }
                    }
                    var3 = (fl) (Object) sh.field_tb.a(16213);
                    continue L26;
                  }
                }
              } else {
                L36: {
                  int fieldTemp$6 = var2.field_o + 1;
                  var2.field_o = var2.field_o + 1;
                  if (fieldTemp$6 <= 83) {
                    break L36;
                  } else {
                    var2.a(false);
                    break L36;
                  }
                }
                var2 = (ij) (Object) sk.field_a.a(16213);
                continue L21;
              }
            }
          } else {
            L37: {
              int fieldTemp$7 = var1.field_r - 1;
              var1.field_r = var1.field_r - 1;
              if (0 != fieldTemp$7) {
                break L37;
              } else {
                var1.a(false);
                break L37;
              }
            }
            var1 = (pm) (Object) gd.field_n.a(16213);
            continue L20;
          }
        }
    }

    final int g(int param0) {
        if (param0 != -10) {
            ((oj) this).field_Jb = null;
        }
        return ((oj) this).field_Rb + (((oj) this).field_Qb == null ? 0 : ((oj) this).field_Qb.g(-10));
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        oj var4 = null;
        hk var5_ref_hk = null;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        hk stackIn_5_0 = null;
        hk stackIn_6_0 = null;
        hk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hk stackOut_4_0 = null;
        hk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((oj) this).field_Ib.length) {
            L1: {
              var5 = -102 / ((19 - param1) / 36);
              if ((((oj) this).field_Tb ^ -1) != 0) {
                var7 = ((oj) this).field_Wb[((oj) this).field_Tb];
                var4 = var7;
                if (var4 == null) {
                  break L1;
                } else {
                  var7.b(param0, -65, param2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 <= (((oj) this).field_Pb ^ -1)) {
                break L2;
              } else {
                this.b(-1 + ((oj) this).field_Pb, (byte) 49);
                break L2;
              }
            }
            return;
          } else {
            var5_ref_hk = ((oj) this).field_Ib[var4_int];
            if (-2 == (var5_ref_hk.field_nb ^ -1)) {
              L3: {
                this.a(-119, param2, var4_int, param0);
                stackOut_4_0 = (hk) var5_ref_hk;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((oj) this).field_Tb) {
                  stackOut_6_0 = (hk) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (hk) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_xb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          we.field_h = param1 * 6;
          ve.field_x = new int[we.field_h + (we.field_h * (1 + we.field_h) / 2 - -1)];
          if (param0 == -9) {
            break L0;
          } else {
            oj.f((byte) -16);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= we.field_h) {
            return;
          } else {
            var3 = var2 * var2;
            var4 = 0;
            L2: while (true) {
              if (var2 < var4) {
                var2++;
                continue L1;
              } else {
                L3: {
                  var5 = var4 * var4;
                  var6 = var5 + var3;
                  if (0 != var5) {
                    break L3;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      of.a(2, aj.field_g, var2, var4);
                      var4++;
                      continue L2;
                    }
                  }
                }
                L4: {
                  var7 = aj.field_g * param1 / var6;
                  stackOut_9_0 = 2;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (0 < var7) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = var7;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L4;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
                of.a(stackIn_12_0, stackIn_12_1, var2, var4);
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    private final void b(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        ((oj) this).field_Pb = param0;
        if (param1 != 49) {
            ((oj) this).field_Tb = 63;
        }
        for (var5 = 0; ((oj) this).field_Nb > var5; var5++) {
            var3 = ((oj) this).field_Ob * var5;
            var4 = ((oj) this).field_Pb * ((oj) this).field_Pb;
            ((oj) this).field_Ib[var5].field_F = (var3 * (144 + -var4) + (((oj) this).field_Hb - ((oj) this).field_J) * var4) / 144;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_Xb = new lc(13, 0, 1, 0);
        field_Mb = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                field_Mb[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (-2L == (var0 & 1L ^ -1L)) {
                  var0 = var0 >>> 745988801 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
