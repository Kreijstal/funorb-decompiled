/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eua extends jea {
    private eua field_Eb;
    private int field_vb;
    private int field_Fb;
    private char[] field_xb;
    private tv[] field_Gb;
    private int field_Db;
    private eua[] field_zb;
    private int field_Bb;
    private int field_wb;
    private int field_Cb;
    static String field_Ab;
    private int field_yb;
    private int field_tb;
    private int[] field_ub;

    final int g(int param0) {
        if (param0 != 22514) {
            ((eua) this).field_Cb = -14;
        }
        return ((eua) this).field_Fb + (null != ((eua) this).field_Eb ? ((eua) this).field_Eb.g(22514) : 0);
    }

    final void a(boolean param0) {
        int var3 = 0;
        tv var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        tv[] var6 = ((eua) this).field_Gb;
        tv[] var2 = var6;
        if (!param0) {
            boolean discarded$0 = ((eua) this).a(33, (byte) -9, 44);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_cb = false;
            var4.field_y = 0;
        }
        if (!(null == ((eua) this).field_Eb)) {
            ((eua) this).field_Eb.a(param0);
            ((eua) this).field_Eb.p(1);
        }
        ((eua) this).field_Eb = null;
        ((eua) this).field_tb = -1;
        this.a(12, 6);
    }

    public static void f(int param0) {
        field_Ab = null;
        if (param0 <= 52) {
            field_Ab = null;
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        tv var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        tv[] var3 = ((eua) this).field_Gb;
        for (var4 = param0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_y ? 1 : 0);
        }
        if (var2 == 0) {
            if (0 != (((eua) this).field_tb ^ -1)) {
                if (null != ((eua) this).field_zb[((eua) this).field_tb]) {
                    var2 = ((eua) this).field_zb[((eua) this).field_tb].h(param0 ^ 0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        ((eua) this).field_Cb = param0;
        if (param1 <= 3) {
            return;
        }
        for (var5 = 0; ((eua) this).field_Bb > var5; var5++) {
            var4 = ((eua) this).field_Cb * ((eua) this).field_Cb;
            var3 = ((eua) this).field_wb * var5;
            ((eua) this).field_Gb[var5].field_T = (var3 * (144 + -var4) - -((((eua) this).field_Db + -((eua) this).field_A) * var4)) / 144;
        }
    }

    eua(long param0, jea param1, jea param2, jea param3, eua[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        iu var14 = null;
        int var15 = 0;
        il var17 = null;
        il var18 = null;
        ((eua) this).field_tb = -1;
        ((eua) this).field_zb = param4;
        ((eua) this).field_ub = param5;
        ((eua) this).field_xb = param7;
        ((eua) this).field_Bb = ((eua) this).field_ub.length;
        var17 = param3.field_H;
        var18 = var17;
        ((eua) this).field_wb = var18.field_k + (var18.field_w + 2);
        ((eua) this).field_Gb = new tv[((eua) this).field_Bb];
        ((eua) this).field_vb = 0;
        ((eua) this).field_yb = ((eua) this).field_Bb * ((eua) this).field_wb;
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (var13 >= ((eua) this).field_Bb) {
            ((eua) this).field_vb = ((eua) this).field_vb + (10 + gfa.field_j.field_n);
            this.a(12, 93);
          } else {
            L1: {
              if (((eua) this).field_xb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + no.a((byte) 67, ((eua) this).field_xb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((eua) this).field_zb[var13]) {
                  break L3;
                } else {
                  if (-1 != ((eua) this).field_ub[var13]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = gfa.field_j;
              break L2;
            }
            ((eua) this).field_Gb[var13] = new tv(0L, param2, (jea) null, param3, var14, param6[var13]);
            ((eua) this).b(-123, (jea) (Object) ((eua) this).field_Gb[var13]);
            var15 = var17.b(param6[var13]);
            if (((eua) this).field_vb < var15) {
              ((eua) this).field_vb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param3 == -62) {
            break L0;
          } else {
            ((eua) this).field_vb = 1;
            break L0;
          }
        }
        L1: {
          if (param2 != ((eua) this).field_tb) {
            if (((eua) this).field_zb[param2] != null) {
              ((eua) this).a(true);
              this.a(0, 60);
              ((eua) this).field_tb = param2;
              ((eua) this).field_Eb = ((eua) this).field_zb[((eua) this).field_tb];
              hj.a(((eua) this).field_Eb, (byte) 122);
              ((eua) this).field_Eb.a(12, 116);
              break L1;
            } else {
              if (0 != (((eua) this).field_ub[param2] ^ -1)) {
                L2: {
                  var5 = ((eua) this).field_ub[param2] | 32768;
                  var6 = bta.field_q;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (uu.field_a == null) {
                      break L2;
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (gda.a(var6, -20011) == 2) {
                    loa.a(var6, param0, (byte) 108, 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = null;
                opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                f.b(param3 + -48);
                jq.c((byte) -25);
                break L1;
              } else {
                kra.a(false);
                f.b(param3 + 7);
                break L1;
              }
            }
          } else {
            ((eua) this).a(true);
            this.a(0, 70);
            break L1;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if ((fna.field_h ^ -1) != -86) {
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
        if (((eua) this).field_Eb != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if ((((eua) this).field_Eb.field_tb ^ -1) != 0) {
                break L1;
              } else {
                ((eua) this).a(true);
                this.a(0, 124);
                return true;
              }
            }
          }
          return ((eua) this).field_Eb.a(param0, (byte) -105, param2);
        } else {
          L2: {
            if (null != ((eua) this).field_Eb) {
              break L2;
            } else {
              if (this != (Object) (Object) kga.field_n) {
                break L2;
              } else {
                if (var4 != 0) {
                  f.b(param1 ^ 48);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          var5 = kda.field_td;
          if (param1 == -105) {
            if (0 < var5) {
              L3: {
                if (var5 == tqa.field_o) {
                  var5 = 63;
                  break L3;
                } else {
                  break L3;
                }
              }
              var6 = 0;
              L4: while (true) {
                if (var6 >= ((eua) this).field_xb.length) {
                  return false;
                } else {
                  if (((eua) this).field_xb[var6] == var5) {
                    this.a(param2, param0, var6, (byte) -62);
                    return true;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        eua var4 = null;
        tv var5 = null;
        int var6 = 0;
        eua var7 = null;
        tv stackIn_5_0 = null;
        tv stackIn_6_0 = null;
        tv stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tv stackOut_4_0 = null;
        tv stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tv stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((eua) this).field_Gb.length) {
            L1: {
              if (param2 <= -52) {
                break L1;
              } else {
                eua.f(-120);
                break L1;
              }
            }
            L2: {
              if (((eua) this).field_tb == -1) {
                break L2;
              } else {
                var7 = ((eua) this).field_zb[((eua) this).field_tb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, param1, (byte) -79);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((((eua) this).field_Cb ^ -1) >= -1) {
                break L3;
              } else {
                this.a(((eua) this).field_Cb - 1, 66);
                break L3;
              }
            }
            return;
          } else {
            var5 = ((eua) this).field_Gb[var4_int];
            if (-2 == (var5.field_y ^ -1)) {
              L4: {
                this.a(param1, param0, var4_int, (byte) -62);
                stackOut_4_0 = (tv) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((eua) this).field_tb) {
                  stackOut_6_0 = (tv) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (tv) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_cb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          ((eua) this).field_Fb = ((eua) this).field_vb - -(2 * param5);
          ((eua) this).a(((eua) this).field_Fb, ((eua) this).field_yb, -23776, -((eua) this).field_yb + param4, param1);
          if (param3 != ((eua) this).field_Db) {
            ((eua) this).field_Db = param3;
            this.a(((eua) this).field_Cb, 77);
            break L0;
          } else {
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (((eua) this).field_Bb <= var7) {
            L2: {
              if (param2 == -3269) {
                break L2;
              } else {
                field_Ab = null;
                break L2;
              }
            }
            L3: {
              if ((((eua) this).field_tb ^ -1) == 0) {
                break L3;
              } else {
                if (null != ((eua) this).field_zb[((eua) this).field_tb]) {
                  var7 = ((eua) this).field_zb[((eua) this).field_tb].field_Bb;
                  var8 = (((eua) this).field_tb - -var7) * ((eua) this).field_wb + ((eua) this).field_T;
                  L4: while (true) {
                    if (param4 >= var8) {
                      ((eua) this).field_zb[((eua) this).field_tb].a(param0, ((eua) this).field_Fb + param1, param2 + 0, ((eua) this).field_Gb[((eua) this).field_tb].field_A, var8, param5);
                      break L3;
                    } else {
                      var8 = var8 - ((eua) this).field_wb;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            ((eua) this).field_Gb[var7].a(((eua) this).field_Fb, 0, param0, ((eua) this).field_wb, 0, param5, ((eua) this).field_Gb[var7].field_T);
            var7++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "Lindemann totems";
    }
}
