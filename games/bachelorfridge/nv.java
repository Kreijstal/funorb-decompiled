/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nv extends sna {
    private nv field_Eb;
    static ee field_wb;
    private int field_Ib;
    private int[] field_yb;
    private int field_Ab;
    private nv[] field_Hb;
    private int field_Bb;
    private gna[] field_vb;
    private char[] field_Db;
    private int field_Gb;
    private int field_xb;
    private int field_Fb;
    private int field_Cb;
    private int field_zb;

    public static void f(int param0) {
        field_wb = null;
        if (param0 != 20038) {
            field_wb = null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            ((nv) this).field_Db = null;
        }
        return ((nv) this).field_Fb + (((nv) this).field_Eb != null ? ((nv) this).field_Eb.b(param0) : 0);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 >= -91) {
            nv.f(-20);
        }
        ((nv) this).field_Fb = 2 * param4 + ((nv) this).field_Gb;
        ((nv) this).a(((nv) this).field_Ib, 31407, ((nv) this).field_Fb, param3, param2 - ((nv) this).field_Ib);
        if (!(param1 == ((nv) this).field_zb)) {
            ((nv) this).field_zb = param1;
            this.b(((nv) this).field_Bb, false);
        }
        for (var7 = 0; ((nv) this).field_Cb > var7; var7++) {
            ((nv) this).field_vb[var7].a(((nv) this).field_Fb, param4, ((nv) this).field_Ab, 0, param5, (byte) -88, ((nv) this).field_vb[var7].field_rb);
        }
        if (-1 != ((nv) this).field_xb) {
            if (!(((nv) this).field_Hb[((nv) this).field_xb] == null)) {
                var7 = ((nv) this).field_Hb[((nv) this).field_xb].field_Cb;
                var8 = (((nv) this).field_xb - -var7) * ((nv) this).field_Ab + ((nv) this).field_rb;
                while (var8 > param2) {
                    var8 = var8 - ((nv) this).field_Ab;
                }
                ((nv) this).field_Hb[((nv) this).field_xb].a((byte) -97, ((nv) this).field_vb[((nv) this).field_xb].field_M, var8, ((nv) this).field_Fb + param3, param4, param5);
            }
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param3) {
            break L0;
          } else {
            ((nv) this).a(-125, -33, -91);
            break L0;
          }
        }
        L1: {
          if (((nv) this).field_xb == param1) {
            ((nv) this).f((byte) -128);
            this.b(0, false);
            break L1;
          } else {
            if (((nv) this).field_Hb[param1] == null) {
              if (0 == (((nv) this).field_yb[param1] ^ -1)) {
                js.a(121);
                ki.g(-26);
                break L1;
              } else {
                L2: {
                  var5 = 32768 | ((nv) this).field_yb[param1];
                  var6 = gk.field_d;
                  if (0 != var6) {
                    break L2;
                  } else {
                    if (null != pw.field_w) {
                      var6 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (af.a(var6, 26291) == 2) {
                    fk.a(113, var6, param0, 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = null;
                no.a(var5, gk.field_d, 110, (String) null, bd.field_k, param2);
                ob.a(eaa.field_a, (byte) -47, gk.field_d, var5, bd.field_k);
                ki.g(-26);
                vca.c(true);
                break L1;
              }
            } else {
              ((nv) this).f((byte) -98);
              this.b(0, false);
              ((nv) this).field_xb = param1;
              ((nv) this).field_Eb = ((nv) this).field_Hb[((nv) this).field_xb];
              dka.a(((nv) this).field_Eb, (byte) 59);
              ((nv) this).field_Eb.b(12, false);
              break L1;
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = BachelorFridge.field_y;
        ((nv) this).field_Bb = param0;
        if (param1) {
            int discarded$0 = ((nv) this).b(false);
        }
        for (var5 = 0; ((nv) this).field_Cb > var5; var5++) {
            var3 = var5 * ((nv) this).field_Ab;
            var4 = ((nv) this).field_Bb * ((nv) this).field_Bb;
            ((nv) this).field_vb[var5].field_rb = (var4 * (((nv) this).field_zb - ((nv) this).field_M) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void f(byte param0) {
        int var3 = 0;
        gna var4 = null;
        int var5 = BachelorFridge.field_y;
        gna[] var6 = ((nv) this).field_vb;
        gna[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_t = false;
            var4.field_R = 0;
        }
        if (param0 > -90) {
            int discarded$0 = ((nv) this).b(false);
        }
        if (((nv) this).field_Eb != null) {
            ((nv) this).field_Eb.f((byte) -97);
            ((nv) this).field_Eb.a(false);
        }
        ((nv) this).field_Eb = null;
        ((nv) this).field_xb = -1;
        this.b(12, false);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          if (param2 < -82) {
            break L0;
          } else {
            field_wb = null;
            break L0;
          }
        }
        L1: {
          if (jea.field_c == null) {
            break L1;
          } else {
            if (13 != gf.field_k) {
              break L1;
            } else {
              jea.field_c = null;
              return true;
            }
          }
        }
        if (lna.field_q) {
          if (cn.d((byte) 64)) {
            L2: {
              if (!vaa.a(param3, 1, param0)) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var4 = stackIn_22_0;
                if ((gf.field_k ^ -1) == -81) {
                  break L4;
                } else {
                  if ((gf.field_k ^ -1) != -85) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = 1;
              lna.field_q = false;
              break L3;
            }
            L5: {
              if ((gf.field_k ^ -1) != -14) {
                break L5;
              } else {
                bea.d(-125);
                var4 = 1;
                lna.field_q = false;
                break L5;
              }
            }
            return var4 != 0;
          } else {
            return false;
          }
        } else {
          L6: {
            if (gm.field_k) {
              break L6;
            } else {
              if (gf.field_k == -10) {
                break L6;
              } else {
                if (-11 == gf.field_k) {
                  break L6;
                } else {
                  if (11 != gf.field_k) {
                    if (gf.field_k != 80) {
                      return false;
                    } else {
                      if (cn.d((byte) 23)) {
                        lna.field_q = true;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          return wi.a(103, param0, param1);
        }
    }

    nv(long param0, sna param1, sna param2, sna param3, nv[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        kv var14 = null;
        int var15 = 0;
        po var17 = null;
        po var18 = null;
        ((nv) this).field_xb = -1;
        ((nv) this).field_Db = param7;
        ((nv) this).field_yb = param5;
        ((nv) this).field_Hb = param4;
        ((nv) this).field_Cb = ((nv) this).field_yb.length;
        var17 = param3.field_jb;
        var18 = var17;
        ((nv) this).field_Ab = var18.field_B + (2 - -var18.field_u);
        ((nv) this).field_vb = new gna[((nv) this).field_Cb];
        ((nv) this).field_Gb = 0;
        ((nv) this).field_Ib = ((nv) this).field_Cb * ((nv) this).field_Ab;
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (((nv) this).field_Cb <= var13) {
            ((nv) this).field_Gb = ((nv) this).field_Gb + (10 + kga.field_a.field_n);
            this.b(12, false);
          } else {
            L1: {
              if (0 >= ((nv) this).field_Db[var13]) {
                break L1;
              } else {
                param6[var13] = var11 + oja.a((byte) -113, ((nv) this).field_Db[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((nv) this).field_Hb[var13]) {
                  break L3;
                } else {
                  if ((((nv) this).field_yb[var13] ^ -1) != 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = kga.field_a;
              break L2;
            }
            ((nv) this).field_vb[var13] = new gna(0L, param2, (sna) null, param3, var14, param6[var13]);
            ((nv) this).a(-1, (sna) (Object) ((nv) this).field_vb[var13]);
            var15 = var17.a(param6[var13]);
            if (var15 > ((nv) this).field_Gb) {
              ((nv) this).field_Gb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if ((gf.field_k ^ -1) != -86) {
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
        if (null != ((nv) this).field_Eb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == ((nv) this).field_Eb.field_xb) {
                ((nv) this).f((byte) -107);
                this.b(0, false);
                return true;
              } else {
                break L1;
              }
            }
          }
          return ((nv) this).field_Eb.b(param0, param1 ^ 0, param2);
        } else {
          L2: {
            if (((nv) this).field_Eb != null) {
              break L2;
            } else {
              if (this != (Object) (Object) da.field_d) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  ki.g(-26);
                  return true;
                }
              }
            }
          }
          L3: {
            var5 = dla.field_j;
            if (param1 == -19044) {
              break L3;
            } else {
              ((nv) this).field_zb = -75;
              break L3;
            }
          }
          L4: {
            if (var5 <= 0) {
              break L4;
            } else {
              L5: {
                if (var5 == gja.field_l) {
                  var5 = 63;
                  break L5;
                } else {
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (var6 >= ((nv) this).field_Db.length) {
                  break L4;
                } else {
                  if (var5 != ((nv) this).field_Db[var6]) {
                    var6++;
                    continue L6;
                  } else {
                    this.a(param2, var6, param0, true);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final boolean g(int param0) {
        int var4 = 0;
        gna var5 = null;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0 != -16360) {
            ((nv) this).field_Bb = -67;
        }
        gna[] var3 = ((nv) this).field_vb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_R != 0 ? 1 : 0);
        }
        if (var2 == 0) {
            if (0 != (((nv) this).field_xb ^ -1)) {
                if (!(null == ((nv) this).field_Hb[((nv) this).field_xb])) {
                    var2 = ((nv) this).field_Hb[((nv) this).field_xb].g(-16360) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        nv var4 = null;
        gna var5 = null;
        int var6 = 0;
        nv var7 = null;
        gna stackIn_5_0 = null;
        gna stackIn_6_0 = null;
        gna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        gna stackOut_4_0 = null;
        gna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gna stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = BachelorFridge.field_y;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((nv) this).field_vb.length) {
            if (param1 == 30091) {
              L1: {
                if ((((nv) this).field_xb ^ -1) == 0) {
                  break L1;
                } else {
                  var7 = ((nv) this).field_Hb[((nv) this).field_xb];
                  var4 = var7;
                  if (var4 != null) {
                    var7.a(param0, param1 ^ 0, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((nv) this).field_Bb <= 0) {
                  break L2;
                } else {
                  this.b(-1 + ((nv) this).field_Bb, false);
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            var5 = ((nv) this).field_vb[var4_int];
            if ((var5.field_R ^ -1) == -2) {
              L3: {
                this.a(param0, var4_int, param2, true);
                stackOut_4_0 = (gna) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((nv) this).field_xb != var4_int) {
                  stackOut_6_0 = (gna) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (gna) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              ((gna) (Object) stackIn_7_0).field_t = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
