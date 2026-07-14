/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tjb extends llb {
    private int field_Jb;
    static String field_Cb;
    static int field_wb;
    private int field_zb;
    private int field_Ib;
    private int field_Hb;
    private int field_Eb;
    private int field_Gb;
    private int field_vb;
    private char[] field_yb;
    private tjb[] field_Db;
    private int field_Fb;
    private tjb field_xb;
    private cna[] field_Bb;
    private int[] field_Ab;

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            ((tjb) this).field_Eb = 67;
            break L0;
          }
        }
        L1: {
          if (pma.field_o != 85) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var4 = stackIn_5_0;
        if (((tjb) this).field_xb != null) {
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              if (((tjb) this).field_xb.field_vb != -1) {
                break L2;
              } else {
                ((tjb) this).j(16384);
                this.a((byte) 112, 0);
                return true;
              }
            }
          }
          return ((tjb) this).field_xb.a(param0, -126, param2);
        } else {
          L3: {
            if (null != ((tjb) this).field_xb) {
              break L3;
            } else {
              if (this != (Object) (Object) fkb.field_m) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L3;
                } else {
                  fea.a(-1);
                  return true;
                }
              }
            }
          }
          L4: {
            var5 = jl.field_r;
            if (var5 <= 0) {
              break L4;
            } else {
              L5: {
                if (ttb.field_B == var5) {
                  var5 = 63;
                  break L5;
                } else {
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (var6 >= ((tjb) this).field_yb.length) {
                  break L4;
                } else {
                  if (var5 == ((tjb) this).field_yb[var6]) {
                    this.a(var6, true, param0, param2);
                    return true;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        long stackIn_14_2 = 0L;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        long stackIn_15_2 = 0L;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        long stackIn_16_2 = 0L;
        int stackIn_16_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        long stackOut_13_2 = 0L;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        long stackOut_15_2 = 0L;
        int stackOut_15_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        long stackOut_14_2 = 0L;
        int stackOut_14_3 = 0;
        var7 = VoidHunters.field_G;
        if (param1) {
          L0: {
            if (((tjb) this).field_vb != param0) {
              if (((tjb) this).field_Db[param0] != null) {
                ((tjb) this).j(16384);
                this.a((byte) 116, 0);
                ((tjb) this).field_vb = param0;
                ((tjb) this).field_xb = ((tjb) this).field_Db[((tjb) this).field_vb];
                wkb.a(((tjb) this).field_xb, 6);
                ((tjb) this).field_xb.a((byte) 121, 12);
                break L0;
              } else {
                if (0 != (((tjb) this).field_Ab[param0] ^ -1)) {
                  L1: {
                    var5 = 32768 | ((tjb) this).field_Ab[param0];
                    var6 = ow.field_b;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      if (null == lqa.field_o) {
                        break L1;
                      } else {
                        var6 = 1;
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (jia.a(var6, (byte) 19) == 2) {
                      mea.a(1, (byte) -119, param2, var6);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var8 = null;
                    va.a((String) null, -25719, var5, param3, ow.field_b, waa.field_x);
                    stackOut_13_0 = ow.field_b;
                    stackOut_13_1 = var5;
                    stackOut_13_2 = lsa.field_f;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    if (param1) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = stackIn_15_2;
                      stackOut_15_3 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      break L3;
                    } else {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = stackIn_14_2;
                      stackOut_14_3 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      break L3;
                    }
                  }
                  jtb.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, waa.field_x);
                  fea.a(-1);
                  fd.a(4907);
                  break L0;
                } else {
                  wha.a(29012);
                  fea.a(-1);
                  break L0;
                }
              }
            } else {
              ((tjb) this).j(16384);
              this.a((byte) 121, 0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    tjb(long param0, llb param1, llb param2, llb param3, tjb[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        phb var14 = null;
        int var15 = 0;
        no var17 = null;
        no var18 = null;
        ((tjb) this).field_vb = -1;
        ((tjb) this).field_yb = param7;
        ((tjb) this).field_Ab = param5;
        ((tjb) this).field_Db = param4;
        ((tjb) this).field_Gb = ((tjb) this).field_Ab.length;
        var17 = param3.field_eb;
        var18 = var17;
        ((tjb) this).field_Ib = var18.field_A + (var18.field_k + 2);
        ((tjb) this).field_Jb = 0;
        ((tjb) this).field_Bb = new cna[((tjb) this).field_Gb];
        ((tjb) this).field_zb = ((tjb) this).field_Ib * ((tjb) this).field_Gb;
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (((tjb) this).field_Gb <= var13) {
            ((tjb) this).field_Jb = ((tjb) this).field_Jb + (10 + ie.field_o.field_m);
            this.a((byte) 120, 12);
          } else {
            L1: {
              if (((tjb) this).field_yb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + av.a(((tjb) this).field_yb[var13], 6).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (((tjb) this).field_Db[var13] != null) {
                  break L3;
                } else {
                  if (0 != (((tjb) this).field_Ab[var13] ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = ie.field_o;
              break L2;
            }
            ((tjb) this).field_Bb[var13] = new cna(0L, param2, (llb) null, param3, var14, param6[var13]);
            ((tjb) this).b(-561, (llb) (Object) ((tjb) this).field_Bb[var13]);
            var15 = var17.b(param6[var13]);
            if (((tjb) this).field_Jb < var15) {
              ((tjb) this).field_Jb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = VoidHunters.field_G;
        ((tjb) this).field_Fb = param1;
        if (param0 < 109) {
            ((tjb) this).field_Eb = -122;
        }
        for (var5 = 0; var5 < ((tjb) this).field_Gb; var5++) {
            var4 = ((tjb) this).field_Fb * ((tjb) this).field_Fb;
            var3 = var5 * ((tjb) this).field_Ib;
            ((tjb) this).field_Bb[var5].field_K = ((((tjb) this).field_Hb + -((tjb) this).field_u) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    final int k(int param0) {
        if (param0 != -4109) {
            boolean discarded$0 = ((tjb) this).a(-122, 20, 102);
        }
        return ((tjb) this).field_Eb - -(null != ((tjb) this).field_xb ? ((tjb) this).field_xb.k(-4109) : 0);
    }

    public static void i(int param0) {
        if (param0 != 85) {
            return;
        }
        field_Cb = null;
    }

    final void j(int param0) {
        int var3 = 0;
        cna var4 = null;
        int var5 = VoidHunters.field_G;
        cna[] var6 = ((tjb) this).field_Bb;
        cna[] var2 = var6;
        if (param0 != 16384) {
            ((tjb) this).field_zb = -32;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_o = 0;
            var4.field_J = false;
        }
        if (!(((tjb) this).field_xb == null)) {
            ((tjb) this).field_xb.j(16384);
            ((tjb) this).field_xb.b(param0 + -20230);
        }
        ((tjb) this).field_xb = null;
        ((tjb) this).field_vb = -1;
        this.a((byte) 113, 12);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
            return false;
        }
        tsb.field_q = true;
        ska.field_p = wt.a(false) + 15000L;
        return qmb.field_q == 11 ? true : false;
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        tjb var4 = null;
        int var5 = 0;
        cna var6 = null;
        int var7 = 0;
        tjb var8 = null;
        cna stackIn_5_0 = null;
        cna stackIn_6_0 = null;
        cna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cna stackOut_4_0 = null;
        cna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cna stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var7 = VoidHunters.field_G;
        var4_int = -84 / ((-12 - param2) / 44);
        var5 = 0;
        L0: while (true) {
          if (((tjb) this).field_Bb.length <= var5) {
            L1: {
              if (((tjb) this).field_vb == -1) {
                break L1;
              } else {
                var8 = ((tjb) this).field_Db[((tjb) this).field_vb];
                var4 = var8;
                if (var4 == null) {
                  break L1;
                } else {
                  var8.a(param0, param1, (byte) 78);
                  break L1;
                }
              }
            }
            L2: {
              if (0 < ((tjb) this).field_Fb) {
                this.a((byte) 123, ((tjb) this).field_Fb + -1);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var6 = ((tjb) this).field_Bb[var5];
            if (-2 == (var6.field_o ^ -1)) {
              L3: {
                this.a(var5, true, param0, param1);
                stackOut_4_0 = (cna) var6;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != ((tjb) this).field_vb) {
                  stackOut_6_0 = (cna) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (cna) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_J = stackIn_7_1 != 0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        cna var5 = null;
        int var6 = VoidHunters.field_G;
        int var2 = 0;
        cna[] var3 = ((tjb) this).field_Bb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_o != 0 ? 1 : 0);
        }
        if (param0 != -25675) {
            boolean discarded$0 = tjb.l(52);
        }
        if (var2 == 0) {
            if (-1 != ((tjb) this).field_vb) {
                if (!(((tjb) this).field_Db[((tjb) this).field_vb] == null)) {
                    var2 = ((tjb) this).field_Db[((tjb) this).field_vb].h(-25675) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        ((tjb) this).field_Eb = ((tjb) this).field_Jb - -(2 * param3);
        if (param0 == 12) {
          L0: {
            ((tjb) this).a(param2, param0 + -41, ((tjb) this).field_Eb, param1 + -((tjb) this).field_zb, ((tjb) this).field_zb);
            if (param4 != ((tjb) this).field_Hb) {
              ((tjb) this).field_Hb = param4;
              this.a((byte) 116, ((tjb) this).field_Fb);
              break L0;
            } else {
              break L0;
            }
          }
          var7 = 0;
          L1: while (true) {
            if (var7 >= ((tjb) this).field_Gb) {
              L2: {
                if ((((tjb) this).field_vb ^ -1) == 0) {
                  break L2;
                } else {
                  if (((tjb) this).field_Db[((tjb) this).field_vb] == null) {
                    break L2;
                  } else {
                    var7 = ((tjb) this).field_Db[((tjb) this).field_vb].field_Gb;
                    var8 = ((tjb) this).field_K + (((tjb) this).field_vb + var7) * ((tjb) this).field_Ib;
                    L3: while (true) {
                      if (param1 >= var8) {
                        ((tjb) this).field_Db[((tjb) this).field_vb].a(12, var8, ((tjb) this).field_Eb + param2, param3, ((tjb) this).field_Bb[((tjb) this).field_vb].field_u, param5);
                        break L2;
                      } else {
                        var8 = var8 - ((tjb) this).field_Ib;
                        continue L3;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              ((tjb) this).field_Bb[var7].a(((tjb) this).field_Bb[var7].field_K, 0, -127, param3, param5, ((tjb) this).field_Eb, ((tjb) this).field_Ib);
              var7++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static Object a(Object[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (ls.field_q) {
          L0: {
            if (param1 == 0) {
              break L0;
            } else {
              ((byte[]) param0[2])[0] = ((byte[]) param0[12])[2];
              break L0;
            }
          }
          if (param0 != null) {
            if (-1 > (param0.length ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (var2 < param0.length) {
                  if (VoidHunters.a(true, param0[var2])) {
                    return param0[var2];
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Invalid name";
        field_wb = 2;
    }
}
