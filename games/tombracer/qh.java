/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh extends dfa implements rqa {
    private int[] field_y;
    ff field_k;
    private v field_z;
    static jea field_F;
    int field_x;
    private vna field_f;
    static jpa field_q;
    private boolean[][] field_v;
    private boolean[] field_u;
    private int field_h;
    private boolean field_s;
    boolean field_D;
    private qra field_l;
    private int[] field_o;
    private int[] field_B;
    private kq[] field_C;
    private int field_i;
    private sna field_n;
    boolean field_A;
    int field_r;
    private boolean field_t;
    private long field_m;
    private int field_j;
    private int field_E;
    private boolean field_w;
    private boolean field_p;
    w[] field_g;

    final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        hca var4 = null;
        ag var5 = null;
        w var6 = null;
        int var7 = 0;
        la var8 = null;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = ((qh) this).field_k.field_H.length;
        ((qh) this).field_g = new w[var2];
        if (param0 < -45) {
          var3 = 0;
          L0: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var4 = ((qh) this).field_k.field_H[var3];
              if (var4 != null) {
                L1: {
                  L2: {
                    var4.a(-27496, (ac) (Object) new hf(var4, var3));
                    ((qh) this).field_k.field_y[var3].a(11008, var4);
                    var5 = new ag();
                    var5.a((jfa) (Object) var4, -1);
                    ((qh) this).field_k.field_G[var3].a((iq) (Object) var5, -1);
                    var6 = new w();
                    ((qh) this).field_g[var3] = var6;
                    if (var3 != ((qh) this).l(103)) {
                      break L2;
                    } else {
                      if (((qh) this).f((byte) 33)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var6.a(true, 0);
                  break L1;
                }
                var7 = 0;
                L3: while (true) {
                  if (((qh) this).field_k.field_G[var3].field_b.length > var7) {
                    L4: {
                      var8 = ((qh) this).field_k.field_G[var3].field_b[var7];
                      if (var8 == null) {
                        break L4;
                      } else {
                        var8.j((byte) 106).a(-28265, (ev) (Object) new sva(var8));
                        var8.a(4855, (sqa) (Object) var6);
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void i(byte param0) {
        ((qh) this).field_f.d(8);
        if (param0 != 99) {
            ((qh) this).field_i = 64;
        }
        ((qh) this).field_t = false;
    }

    private final void a(int param0, qra param1) {
        kqa.b(18916);
        if (param0 != 6) {
            ((qh) this).a(false, true, 46);
        }
        ((qh) this).field_l = param1;
    }

    final int l(int param0) {
        if (param0 <= 74) {
            return -54;
        }
        return ((qh) this).field_h;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        me var6 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          msa.field_a = ((qh) this).l(95);
          if (!((qh) this).d((byte) 65)) {
            break L0;
          } else {
            if (((qh) this).field_k.f((byte) -90, ((qh) this).l(94))) {
              ((qh) this).e(1, 17219);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!((qh) this).f((byte) 33)) {
            if (((qh) this).field_D) {
              break L1;
            } else {
              if (!param1) {
                return;
              } else {
                if (!param0) {
                  return;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        this.a(param1, param0, false);
        if (!((qh) this).field_s) {
          if (param2 == 15283) {
            L2: {
              if (((qh) this).field_l == null) {
                break L2;
              } else {
                ((qh) this).field_l.a(80, param1);
                break L2;
              }
            }
            ((qh) this).field_w = false;
            var6 = (me) (Object) ((qh) this).field_f.f(-80);
            L3: while (true) {
              if (var6 == null) {
                L4: {
                  if (null == ((qh) this).field_n) {
                    break L4;
                  } else {
                    ((qh) this).field_n.a((byte) 44);
                    break L4;
                  }
                }
                if (!((qh) this).f((byte) 33)) {
                  L5: {
                    if (!((qh) this).field_D) {
                      this.b(((qh) this).field_k.field_H[0].v(param2 + -15179), param2 + 7821);
                      this.a(((qh) this).field_k.field_g[0], 5, ((qh) this).field_k.field_F[0]);
                      var4 = uca.field_c.a(7, param2 + -15283);
                      qa.field_b = qa.field_b + var4;
                      nta.field_h = nta.field_h + var4;
                      var4 = uca.field_c.a(7, 0);
                      cfa.field_b = cfa.field_b + (long)var4;
                      lra.field_f = lra.field_f + (long)var4;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (((qh) this).field_z == null) {
                      if (3 != ((qh) this).field_k.field_K) {
                        L7: {
                          if (!((qh) this).field_k.field_I[((qh) this).field_x]) {
                            break L7;
                          } else {
                            hba.a(((qh) this).field_E, ((qh) this).field_m, (byte) 64, ((qh) this).field_i);
                            ((qh) this).field_k.field_I[((qh) this).field_x] = false;
                            break L7;
                          }
                        }
                        if (!((qh) this).field_k.f(((qh) this).field_x, 0).b(0)) {
                          break L6;
                        } else {
                          if (!((qh) this).field_p) {
                            kq.a(((qh) this).field_k.field_H[((qh) this).field_x].r((byte) -125), ((qh) this).field_E, (byte) 114);
                            ((qh) this).field_p = true;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      ((qh) this).field_z.a((qh) this, 1);
                      break L6;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L8: {
                  var6.a((byte) -120);
                  if (!var6.c((byte) -121)) {
                    if (var6.a(true)) {
                      ((qh) this).field_w = true;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    this.a(-19805, var6);
                    break L8;
                  }
                }
                var6 = (me) (Object) ((qh) this).field_f.e(param2 + -15171);
                continue L3;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (null != ((qh) this).field_z) {
            ((qh) this).field_z.a(true);
        }
        for (var2 = 0; var2 < ((qh) this).field_k.field_H.length; var2++) {
            ((qh) this).field_C[var2].a(false);
        }
        if (param0 != -1) {
            qh.b(false);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (((qh) this).field_D) {
            if (((qh) this).d((byte) 69)) {
              break L0;
            } else {
              if (!((qh) this).field_k.field_h) {
                this.j(1);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            if (vpa.a(80)) {
              L1: {
                ip.field_b = qca.a((byte) 13, pq.field_e);
                if (-1 <= (this.n((byte) 19) ^ -1)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              L2: {
                uma.field_c = stackIn_8_0 != 0;
                pna.field_p = stackIn_8_0 != 0;
                if (((qh) this).field_k.field_K == 3) {
                  break L2;
                } else {
                  L3: {
                    if (ip.field_b) {
                      break L3;
                    } else {
                      if (uma.field_c) {
                        break L3;
                      } else {
                        if (pna.field_p) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ira.a(param0, 10, (byte) 106);
                  break L0;
                }
              }
              ira.a(param0, 9, (byte) 91);
              break L0;
            } else {
              if ((((qh) this).field_k.field_K ^ -1) == -4) {
                ira.a(param0, 0, (byte) 82);
                break L0;
              } else {
                ((qh) this).o(-18570);
                ira.a(param0, 9, (byte) -62);
                break L0;
              }
            }
          }
        }
        L4: {
          ((qh) this).field_s = true;
          this.i((byte) 99);
          this.a(6, (qra) null);
          if (param1 < -75) {
            break L4;
          } else {
            ((qh) this).field_g = null;
            break L4;
          }
        }
    }

    final void a(int param0) {
        if (param0 > -102) {
            boolean discarded$0 = ((qh) this).c(false);
        }
    }

    final void e(byte param0) {
        ((qh) this).field_n = new sna((qh) this);
        if (param0 <= 11) {
            return;
        }
        iqa.field_c.d(114);
        ((qh) this).field_k.field_y[((qh) this).field_x].a(0, (byte) 37);
        ((qh) this).c(106);
    }

    private final void a(boolean param0, boolean param1, boolean param2) {
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            ((qh) this).a((byte) 23, true);
            break L0;
          }
        }
        L1: {
          L2: {
            var9 = oj.field_tb;
            var4 = var9;
            if (!param0) {
              break L2;
            } else {
              if (!param1) {
                break L2;
              } else {
                if (iqa.field_c.e(-8832)) {
                  break L2;
                } else {
                  L3: {
                    if (ov.b(-67, -1)) {
                      break L3;
                    } else {
                      if (!((qh) this).c(false)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((qh) this).field_v[0][0] = var9[kda.field_hd];
                  ((qh) this).field_v[0][1] = var9[mf.field_a];
                  ((qh) this).field_v[0][2] = var9[mi.field_k];
                  ((qh) this).field_v[0][3] = var9[fp.field_a];
                  ((qh) this).field_v[0][4] = var9[gsa.field_j];
                  ((qh) this).field_v[0][7] = var9[mv.field_i];
                  ((qh) this).field_v[0][5] = var9[ki.field_o];
                  ((qh) this).field_v[0][8] = var9[rta.field_g];
                  ((qh) this).field_v[0][6] = var9[hra.field_b];
                  ((qh) this).field_v[1][1] = var9[97];
                  ((qh) this).field_v[1][0] = var9[96];
                  ((qh) this).field_v[1][7] = var9[85];
                  ((qh) this).field_v[1][2] = var9[98];
                  ((qh) this).field_v[1][3] = var9[99];
                  break L1;
                }
              }
            }
          }
          var5 = 0;
          L4: while (true) {
            if (((qh) this).field_v.length <= var5) {
              break L1;
            } else {
              var6 = 0;
              L5: while (true) {
                if (var6 >= ((qh) this).field_v[var5].length) {
                  var5++;
                  continue L4;
                } else {
                  ((qh) this).field_v[var5][var6] = false;
                  var6++;
                  continue L5;
                }
              }
            }
          }
        }
        var5 = 0;
        L6: while (true) {
          if ((var5 ^ -1) <= -10) {
            return;
          } else {
            var6 = 0;
            var7 = 0;
            L7: while (true) {
              if (((qh) this).field_v.length <= var7) {
                if (var6 != 0) {
                  ((qh) this).field_y[var5] = ((qh) this).field_y[var5] + 1;
                  var5++;
                  continue L6;
                } else {
                  ((qh) this).field_y[var5] = 0;
                  var5++;
                  continue L6;
                }
              } else {
                if (var6 == 0) {
                  if (((qh) this).field_v[var7][var5]) {
                    var6 = 1;
                    var7++;
                    continue L7;
                  } else {
                    var6 = 0;
                    var7++;
                    continue L7;
                  }
                } else {
                  var6 = 1;
                  var7++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    qh(boolean param0, int param1, String[] param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, BitSet[] param10, boolean[] param11, ou param12) {
        super(-1);
        int var14 = 0;
        int var15_int = 0;
        ic var15 = null;
        int var16 = 0;
        hca var17 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          ((qh) this).field_s = false;
          ((qh) this).field_f = new vna();
          ((qh) this).field_A = false;
          ((qh) this).field_t = false;
          ((qh) this).field_r = -1;
          ((qh) this).field_p = false;
          ((qh) this).field_w = false;
          if (param9 < 0) {
            break L0;
          } else {
            L1: {
              if (!mca.a((byte) 6, param9)) {
                break L1;
              } else {
                if (bma.d(-74, param9)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException("CA:" + param9);
          }
        }
        L2: {
          ((qh) this).field_E = param9;
          ((qh) this).field_x = param3;
          qv.field_o = null;
          mi.field_o = false;
          stackOut_4_0 = this;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (!param0) {
            stackOut_6_0 = this;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L2;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L2;
          }
        }
        ((qh) this).field_D = stackIn_7_1 != 0;
        var14 = param2.length;
        ((qh) this).field_y = new int[9];
        ((qh) this).field_v = new boolean[2][9];
        var15_int = 0;
        L3: while (true) {
          if (var15_int >= ((qh) this).field_y.length) {
            L4: {
              ((qh) this).field_B = new int[var14];
              if (!ff.h(1)) {
                break L4;
              } else {
                L5: {
                  if (!((qh) this).field_D) {
                    var15 = new ic();
                    break L5;
                  } else {
                    var15 = (ic) (Object) new aua();
                    break L5;
                  }
                }
                L6: {
                  ((qh) this).field_k = new ff(param2, param1, param5, param6, param7, param8, ((qh) this).field_E, param10, param11, (mt) (Object) var15, param12);
                  if (param0) {
                    break L6;
                  } else {
                    ((qh) this).field_k.c((byte) -89);
                    break L6;
                  }
                }
                ((qh) this).field_C = new kq[var14];
                ((qh) this).field_k.field_x = null;
                var16 = 0;
                L7: while (true) {
                  if (var16 >= var14) {
                    break L4;
                  } else {
                    var17 = ((qh) this).field_k.field_H[var16];
                    if (var17 != null) {
                      ((qh) this).field_C[var16] = new kq();
                      var16++;
                      continue L7;
                    } else {
                      var16++;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (!((qh) this).field_D) {
                break L8;
              } else {
                ((qh) this).field_z = new v(((qh) this).field_x, var14);
                break L8;
              }
            }
            L9: {
              ((qh) this).field_o = new int[var14];
              ((qh) this).field_u = new boolean[var14];
              qda.field_b = null;
              if (!((qh) this).d((byte) 64)) {
                ((qh) this).field_h = ((qh) this).field_x;
                break L9;
              } else {
                ((qh) this).field_h = 0;
                break L9;
              }
            }
            L10: {
              msa.field_a = ((qh) this).l(92);
              ea.field_j = -1;
              ((qh) this).field_p = false;
              uca.field_a = -1;
              tb.field_o = 617;
              gda.field_b = 9170;
              ti.field_b = 8768;
              lu.field_a = 5180;
              cfa.field_b = 1180282300L;
              et.field_j = 17219L;
              qa.field_b = 1727002282;
              nta.field_h = -2073743619;
              bh.field_o = 17825;
              lra.field_f = 2023746978L;
              nb.field_c = 22238L;
              cka.field_Z = 22238;
              if (((qh) this).field_D) {
                break L10;
              } else {
                if (3 == param8) {
                  break L10;
                } else {
                  if (((qh) this).field_E < 0) {
                    break L10;
                  } else {
                    if (10 <= ((qh) this).field_E) {
                      break L10;
                    } else {
                      if (((qh) this).f((byte) 33)) {
                        break L10;
                      } else {
                        aqa.a(((qh) this).field_E, (byte) 120);
                        break L10;
                      }
                    }
                  }
                }
              }
            }
          } else {
            ((qh) this).field_y[var15_int] = 5;
            var15_int++;
            continue L3;
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param2) {
            ((qh) this).field_D = false;
        }
        ((qh) this).field_C[param1].b(79, param0);
    }

    private final void j(int param0) {
        if (param0 != 1) {
            this.b(-31, 0);
        }
        ql.field_k.k(66, param0 ^ -2987);
    }

    final void k(byte param0) {
        hca var2 = ((qh) this).field_k.field_H[0];
        if (param0 != -25) {
            ((qh) this).field_w = true;
        }
        var2.b(true, true);
        ((qh) this).j((byte) -99);
        ((qh) this).c(param0 ^ 102);
    }

    final void b(int param0, kh param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 < 91) {
            ((qh) this).field_w = false;
        }
        for (var3 = 0; ((qh) this).field_B.length > var3; var3++) {
            ((qh) this).field_B[var3] = param1.d(124);
        }
    }

    final int a(boolean param0, String param1) {
        if (param0) {
            return 127;
        }
        return ((qh) this).field_k.a(param1, (byte) 114);
    }

    final boolean g(int param0, int param1) {
        if (param0 != 0) {
            ((qh) this).field_w = true;
        }
        return (((qh) this).field_y[param1] ^ -1) == -2 ? true : false;
    }

    final void c(int param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        this.i((byte) 99);
        this.a(6, (qra) (Object) new fja((qh) this, ((qh) this).field_z));
        var2 = 0;
        L0: while (true) {
          if (((qh) this).field_u.length <= var2) {
            L1: {
              if (((qh) this).field_n != null) {
                ((qh) this).field_n.b((byte) -121);
                break L1;
              } else {
                break L1;
              }
            }
            var2 = -116 / ((param0 - 23) / 54);
            return;
          } else {
            ((qh) this).field_u[var2] = false;
            var3 = ((qh) this).field_k.field_H[var2].f((byte) -73);
            if (var3 != null) {
              var3.i((byte) -75);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final boolean o(byte param0) {
        if (param0 < 40) {
            return false;
        }
        return mi.field_o;
    }

    public static void b(boolean param0) {
        field_F = null;
        if (param0) {
            Object var2 = null;
            hra discarded$0 = qh.a(-7, (String) null);
        }
        field_q = null;
    }

    final void a(int param0, kh param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var10 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          param1.h((byte) -94);
          ((qh) this).field_k.a(param1, false);
          param1.i((byte) 98);
          ((qh) this).j((byte) -115);
          if (!((qh) this).field_k.g(0)) {
            ((qh) this).field_z.a((byte) 126);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= 92) {
            break L1;
          } else {
            ((qh) this).e(-34, -99);
            break L1;
          }
        }
        L2: {
          if (!((qh) this).field_k.a(14)) {
            ((qh) this).h((byte) 120);
            break L2;
          } else {
            if (-1 < (((qh) this).field_k.field_z ^ -1)) {
              if (!((qh) this).field_k.b(0)) {
                ((qh) this).c(102);
                break L2;
              } else {
                var10 = new int[((qh) this).field_k.field_k][3];
                var4 = 0;
                L3: while (true) {
                  if (((qh) this).field_k.field_k <= var4) {
                    this.a(var10, -9);
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (3 <= var5) {
                        var4++;
                        continue L3;
                      } else {
                        var10[var4][var5] = ((qh) this).field_k.field_H[var4].c(196608, var5);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              this.a(false);
              break L2;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ((qh) this).field_y[param2] = -param1;
        if (!param0) {
            ((qh) this).field_A = false;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        jha var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((qh) this).field_k.field_H.length) {
            L1: {
              if (param1 == -23) {
                break L1;
              } else {
                var6 = null;
                hra discarded$1 = qh.a(-21, (String) null);
                break L1;
              }
            }
            return;
          } else {
            if (!((qh) this).field_k.l(param1 ^ -28, var3)) {
              if (-1 > (1 << var3 & param0 ^ -1)) {
                ((qh) this).field_k.d((byte) -95, var3);
                var4 = eea.a(gl.a((byte) 87, se.field_r, new String[1]), (byte) -72);
                iqa.field_c.a(param1 + 23, var4);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != -54) {
            return;
        }
        if (param1 != ((qh) this).field_k.b((byte) 91)) {
            ((qh) this).i(param1, 108);
        }
    }

    final void b(boolean param0, boolean param1, int param2) {
        hca var4 = null;
        if (((qh) this).field_s) {
            return;
        }
        if (!((qh) this).field_D) {
            if (((qh) this).field_x == 0) {
                var4 = ((qh) this).field_k.field_H[((qh) this).field_x];
                if (!(var4.C(-1).j(0))) {
                    ppa.a(var4.f((byte) -127), 64, ((qh) this).field_k);
                }
            }
        }
        if (param2 != 0) {
            ((qh) this).a(115);
        }
        if (!param1) {
            this.a(6, (qra) (Object) new qka((qh) this, ((qh) this).field_z));
        } else {
            this.a(param0, (byte) -89);
        }
    }

    final boolean f(int param0, int param1) {
        if (!(null != ((qh) this).field_z)) {
            return true;
        }
        if (param0 != -12963) {
            return true;
        }
        return ((qh) this).field_z.a(param1, param0 ^ -13022);
    }

    final void c(int param0, int param1) {
        if (param1 <= 15) {
            ((qh) this).field_E = 44;
        }
        ((qh) this).field_C[param0].a(false);
    }

    final int h(int param0, int param1) {
        if (param1 != 9) {
            return 65;
        }
        return ((qh) this).field_k.field_y[param0].b(param1 ^ 68);
    }

    final boolean e(int param0) {
        if (param0 < 109) {
            ((qh) this).field_j = -75;
        }
        return ((qh) this).field_w;
    }

    final void e(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != 17219) {
            return;
        }
        int var3 = ((qh) this).l(param1 + -17104);
        if (!(((qh) this).d((byte) 91))) {
            return;
        }
        int var4 = 0;
        while (var4 == 0) {
            ((qh) this).field_h = param0 + ((qh) this).l(param1 + -17096);
            if (0 > ((qh) this).l(107)) {
                ((qh) this).field_h = ((qh) this).field_k.field_H.length - 1;
            }
            if (!(((qh) this).l(114) < ((qh) this).field_k.field_H.length)) {
                ((qh) this).field_h = 0;
            }
            // ifne L39
            var4 = 1;
        }
        if (!(null == ((qh) this).field_g)) {
            ((qh) this).field_g[var3].a(true, 0);
            ((qh) this).field_g[((qh) this).l(100)].a(false, param1 ^ 17219);
        }
    }

    final void k(int param0) {
        this.i((byte) 99);
        this.a(param0 ^ -7, (qra) (Object) new ab((qh) this, ((qh) this).field_z));
        if (param0 != -1) {
            qh.b(true);
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        jha var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 == 5) {
          L0: while (true) {
            if (((qh) this).field_k.field_H.length <= var3) {
              return;
            } else {
              if (!((qh) this).field_k.f((byte) -93, var3)) {
                if ((param1 & 1 << var3 ^ -1) < -1) {
                  ((qh) this).field_k.m(param0 ^ 4, var3);
                  var4 = eea.a(gl.a((byte) 84, lu.field_c, new String[1]), (byte) -124);
                  iqa.field_c.a(0, var4);
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, long param2) {
        int var5 = 0;
        long var6 = 0L;
        int var8_int = 0;
        long var8 = 0L;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (((qh) this).field_k.field_I[((qh) this).field_x]) {
          var5 = ((qh) this).field_i;
          var6 = ((qh) this).field_m;
          var8_int = var5;
          var9 = uca.field_c.a(param1, 0);
          bh.field_o = bh.field_o + var8_int * var9;
          cka.field_Z = cka.field_Z + var9;
          var8 = var6;
          var10_int = uca.field_c.a(5, 0);
          et.field_j = et.field_j + var8 * (long)var10_int;
          nb.field_c = nb.field_c + (long)var10_int;
          if (param0 != var5) {
            L0: {
              var8_int = param0;
              var9 = var5;
              if (var8_int != var9) {
                if (uca.field_c.a(2, 0) == 0) {
                  nta.field_h = nta.field_h - cka.field_Z * (-var9 + var8_int);
                  break L0;
                } else {
                  qa.field_b = qa.field_b + cka.field_Z * (var8_int - var9);
                  break L0;
                }
              } else {
                break L0;
              }
            }
            L1: {
              var8 = param2;
              var10 = var6;
              if ((var8 ^ -1L) == (var10 ^ -1L)) {
                break L1;
              } else {
                if (0 != uca.field_c.a(2, param1 ^ 5)) {
                  lra.field_f = lra.field_f + nb.field_c * (var8 - var10);
                  break L1;
                } else {
                  cfa.field_b = cfa.field_b - nb.field_c * (-var10 + var8);
                  break L1;
                }
              }
            }
            ((qh) this).field_i = param0;
            ((qh) this).field_m = param2;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        dda var4 = null;
        pi var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        ((qh) this).field_k.b(true, param2, param1);
        if (param0) {
            ((qh) this).field_z = null;
        }
        if (!((qh) this).field_u[param1]) {
            if (!((qh) this).field_k.b((byte) 90, param1)) {
                // ifne L68
            } else {
                ((qh) this).a(122, param1);
                ((qh) this).field_u[param1] = true;
            }
        }
        if (((qh) this).field_D) {
            ((qh) this).field_k.field_G[param1].field_i.b(-113);
        } else {
            var4 = ((qh) this).field_k.a(true, param1);
            while (var4 != null) {
                var5 = new pi(var4.a((byte) -125), param1, param1, 50 + ((qh) this).field_k.field_G[param1].field_c, var4.a((byte) -125).a((byte) -28), ((qh) this).field_k.i(1, param1));
                ((qh) this).field_k.a((byte) 96, var5);
                var4 = ((qh) this).field_k.a(true, param1);
            }
        }
    }

    final boolean b(int param0) {
        if (param0 != 31923) {
            return true;
        }
        return false;
    }

    final boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 33) {
            break L0;
          } else {
            ((qh) this).d(94, 57);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qh) this).field_k == null) {
              break L2;
            } else {
              if (!((qh) this).field_k.k(param0 ^ -25288)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0) {
        if (param0 <= 78) {
            ((qh) this).field_E = -119;
        }
    }

    public final void a(byte param0, boolean param1) {
        me var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (null != ((qh) this).field_l) {
            ((qh) this).field_l.b(param0 ^ 97, param1);
        }
        if (!((qh) this).f((byte) 33)) {
            if (((qh) this).field_A) {
                return;
            }
            if (param0 != -28) {
                boolean discarded$0 = this.o((byte) 26);
            }
            var5 = (me) (Object) ((qh) this).field_f.f(param0 ^ 84);
            while (var5 != null) {
                var5.b((byte) -66);
                var5 = (me) (Object) ((qh) this).field_f.e(123);
            }
            if (!(param1)) {
                return;
            }
            return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((qh) this).a(-75, 'n', 84);
        }
        return ((qh) this).field_l instanceof fja;
    }

    final boolean a(int param0, int param1, kh param2) {
        if (param1 != -4) {
            ((qh) this).field_g = null;
        }
        if (((qh) this).field_z == null) {
            return false;
        }
        return ((qh) this).field_z.a((byte) 107, (qh) this, param2, param0);
    }

    final void a(me param0, int param1) {
        ((qh) this).field_f.b((byte) -120, (vg) (Object) param0);
        if (param1 != 680) {
            String discarded$0 = ((qh) this).a(-90, false);
        }
        if (!(!(param0 instanceof dl))) {
            ((qh) this).field_t = true;
        }
    }

    final boolean g(int param0) {
        if (param0 <= 124) {
            return true;
        }
        return ((qh) this).field_s;
    }

    final void h(byte param0) {
        int var2 = 70 % ((37 - param0) / 62);
        this.i((byte) 99);
        this.a(6, (qra) (Object) new uda((qh) this, ((qh) this).field_z));
    }

    final static hra a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param0 != -58) {
            return null;
        }
        return fb.field_c;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            ((qh) this).field_u = null;
        }
        return ((qh) this).field_t;
    }

    final void a(byte param0, int param1, int param2) {
        if (((qh) this).field_l instanceof ab) {
            ((ab) (Object) ((qh) this).field_l).a(param1, true, param2);
        }
        int var4 = -88 / ((49 - param0) / 53);
    }

    final int m(int param0) {
        if (!(!((qh) this).field_D)) {
            return -1;
        }
        if (param0 != -1) {
            int discarded$0 = ((qh) this).h(-21, -109);
        }
        return ((qh) this).field_E;
    }

    final boolean n(int param0) {
        if (!(null != ((qh) this).field_z)) {
            return false;
        }
        int var2 = 86 % ((13 - param0) / 57);
        return ((qh) this).field_z.b(1);
    }

    private final void a(boolean param0) {
        this.i((byte) 99);
        if (param0) {
            ((qh) this).field_s = true;
        }
        this.a(6, (qra) (Object) new qka((qh) this, ((qh) this).field_z));
    }

    final void l(byte param0) {
        mi.field_o = true;
        if (param0 != -38) {
            ((qh) this).field_z = null;
        }
    }

    final void a(int param0, int param1) {
        jha var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 < 23) {
            boolean discarded$0 = ((qh) this).f(63);
        }
        if (((qh) this).field_k.b((byte) 90, param1)) {
            var3 = ab.a(-41, gl.a((byte) 124, ara.field_yb, new String[1]) + ": " + dea.a(((qh) this).field_k.c((byte) 115, param1), (byte) -8));
        } else {
            if (((qh) this).field_k.e((byte) -66, param1)) {
                var3 = ab.a(-79, gl.a((byte) 107, hu.field_a, new String[1]) + ": " + dea.a(((qh) this).field_k.c((byte) 115, param1), (byte) -8));
            } else {
                var3 = ab.a(-108, gl.a((byte) 99, at.field_Q, new String[1]));
            }
        }
        iqa.field_c.a(0, var3);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        hca var5 = null;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          if (((qh) this).field_y[0] <= 0) {
            break L0;
          } else {
            var3 = var3 | 1;
            break L0;
          }
        }
        L1: {
          if (((qh) this).field_y[1] > 0) {
            var3 = var3 | 2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 <= ((qh) this).field_y[2]) {
            break L2;
          } else {
            var3 = var3 | 4;
            break L2;
          }
        }
        L3: {
          if (-1 >= ((qh) this).field_y[3]) {
            break L3;
          } else {
            var3 = var3 | 8;
            break L3;
          }
        }
        L4: {
          if ((((qh) this).field_y[4] ^ -1) < -1) {
            var3 = var3 | 16;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((qh) this).field_y[5] <= 0) {
            break L5;
          } else {
            var3 = var3 | 32;
            break L5;
          }
        }
        L6: {
          if (((qh) this).field_y[7] > 0) {
            var3 = var3 | 128;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if ((((qh) this).field_y[6] ^ -1) < -1) {
            var3 = var3 | 64;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (((qh) this).field_y[8] > 0) {
            if (((qh) this).f(0)) {
              if (((qh) this).d((byte) 92)) {
                break L8;
              } else {
                if (!((qh) this).field_k.field_H[param1].s((byte) 85)) {
                  break L8;
                } else {
                  var3 = var3 | 256;
                  break L8;
                }
              }
            } else {
              var3 = var3 | 256;
              break L8;
            }
          } else {
            break L8;
          }
        }
        L9: {
          if (!param0) {
            break L9;
          } else {
            ((qh) this).field_f = null;
            break L9;
          }
        }
        L10: {
          var3 = lf.a(var3, 4);
          if (null == ((qh) this).field_C) {
            ((qh) this).field_C = new kq[((qh) this).field_k.field_k];
            var4 = 0;
            L11: while (true) {
              if (var4 >= ((qh) this).field_k.field_k) {
                break L10;
              } else {
                var5 = ((qh) this).field_k.field_H[var4];
                if (var5 != null) {
                  ((qh) this).field_C[var4] = new kq();
                  var4++;
                  continue L11;
                } else {
                  var4++;
                  continue L11;
                }
              }
            }
          } else {
            break L10;
          }
        }
        L12: {
          ((qh) this).field_C[param1].b(79, var3);
          if (null == ((qh) this).field_z) {
            break L12;
          } else {
            ((qh) this).field_z.a(true, var3);
            break L12;
          }
        }
    }

    private final void a(int[][] param0, int param1) {
        this.i((byte) 99);
        if (param1 != -9) {
            ((qh) this).a((byte) 46, (int[][]) null, -97);
        }
        this.a(6, (qra) (Object) new opa((qh) this, ((qh) this).field_z, param0));
    }

    final void m(byte param0) {
        if (((qh) this).field_z != null) {
            if (!((qh) this).d((byte) 120)) {
                ((qh) this).field_z.f(10);
            }
        }
        ((qh) this).field_k.a((byte) -82);
        ((qh) this).j((byte) -108);
        int var2 = -66 / ((-65 - param0) / 39);
        ((qh) this).c(-33);
    }

    private final void a(int param0, me param1) {
        if (param0 != -19805) {
            ((qh) this).field_i = 76;
        }
        param1.p(42);
        if (param1 instanceof dl) {
            ((qh) this).field_t = false;
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        me var7 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if ((((qh) this).field_x ^ -1) <= -1) {
            var4 = ((qh) this).field_D ? 1 : 0;
            if (wka.field_d) {
              break L0;
            } else {
              if (var4 != 0) {
                break L0;
              } else {
                if (rba.field_a == null) {
                  break L0;
                } else {
                  if (rba.field_a.f((byte) 33)) {
                    break L0;
                  } else {
                    if ((Object) (Object) rba.field_a != (Object) (Object) hb.field_t) {
                      break L0;
                    } else {
                      var5 = uca.field_c.a(8, 0);
                      if (0 != var5) {
                        if (1 != var5) {
                          if (-3 != (var5 ^ -1)) {
                            if ((var5 ^ -1) == -4) {
                              ti.field_b = ti.field_b - gda.field_b;
                              lu.field_a = lu.field_a + 1;
                              break L0;
                            } else {
                              if (var5 != -5) {
                                if (var5 == 5) {
                                  lu.field_a = lu.field_a + 1;
                                  tb.field_o = tb.field_o + gda.field_b;
                                  break L0;
                                } else {
                                  if (-7 != var5) {
                                    if (7 != var5) {
                                      break L0;
                                    } else {
                                      tb.field_o = tb.field_o - gda.field_b;
                                      lu.field_a = lu.field_a - 1;
                                      break L0;
                                    }
                                  } else {
                                    tb.field_o = tb.field_o - lu.field_a;
                                    gda.field_b = gda.field_b - 1;
                                    break L0;
                                  }
                                }
                              } else {
                                gda.field_b = gda.field_b + 1;
                                tb.field_o = tb.field_o + lu.field_a;
                                break L0;
                              }
                            }
                          } else {
                            gda.field_b = gda.field_b + 1;
                            ti.field_b = ti.field_b - lu.field_a;
                            break L0;
                          }
                        } else {
                          lu.field_a = lu.field_a - 1;
                          ti.field_b = ti.field_b + gda.field_b;
                          break L0;
                        }
                      } else {
                        ti.field_b = ti.field_b + lu.field_a;
                        gda.field_b = gda.field_b - 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (((qh) this).field_l == null) {
            break L1;
          } else {
            if (((qh) this).field_l.a(param1, 25, param0)) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (rda.d(20125)) {
            if (param0 == 88) {
              L3: {
                stackOut_31_0 = this;
                stackIn_33_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (((qh) this).field_A) {
                  stackOut_33_0 = this;
                  stackOut_33_1 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L3;
                } else {
                  stackOut_32_0 = this;
                  stackOut_32_1 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  break L3;
                }
              }
              ((qh) this).field_A = stackIn_34_1 != 0;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if ((param0 ^ -1) == -14) {
            if (((qh) this).c(false)) {
              break L4;
            } else {
              L5: {
                if (((qh) this).d((byte) 81)) {
                  break L5;
                } else {
                  if (null == ((qh) this).field_l) {
                    break L4;
                  } else {
                    if (!((qh) this).field_l.e(param2 ^ -9201)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              ira.a(false, 7, (byte) -92);
              return true;
            }
          } else {
            break L4;
          }
        }
        if (param2 == 1) {
          L6: {
            var7 = (me) (Object) ((qh) this).field_f.f(param2 ^ -79);
            if (var7 == null) {
              break L6;
            } else {
              if (var7.a(param0, param1, (byte) -116)) {
                break L6;
              } else {
                return true;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    private final String a(hca param0, byte param1, int param2) {
        String[] var8 = tk.field_a[param2];
        String[] var4 = var8;
        if (param1 != -9) {
            ((qh) this).field_h = -6;
        }
        int var5 = param0.A(0);
        String var6 = var4[uca.field_c.a(var8.length, param1 + 9)];
        String var7 = ((qh) this).a(var5, false);
        String var9 = "<col=" + jm.field_k[var5] + ">" + var6 + "</col>";
        String var6_ref = "<col=" + jm.field_k[var5] + ">" + var6 + "</col>";
        return gl.a((byte) 84, var9, new String[1]);
    }

    final void h(int param0) {
        int var2 = 0;
        kq var3 = null;
        int var4 = 0;
        tu var5 = null;
        qw var6 = null;
        String var7 = null;
        jha var8 = null;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param0 >= 79) {
            break L0;
          } else {
            ((qh) this).a(-121, (byte) -26);
            break L0;
          }
        }
        L1: {
          if (!((qh) this).field_k.field_h) {
            L2: {
              if (((qh) this).d((byte) 80)) {
                break L2;
              } else {
                if (!((qh) this).field_k.field_G[((qh) this).field_x].k(-19271)) {
                  break L2;
                } else {
                  this.g((byte) -36);
                  break L2;
                }
              }
            }
            var2 = 0;
            L3: while (true) {
              if (var2 >= ((qh) this).field_k.field_H.length) {
                var2 = ((qh) this).field_r + -((qh) this).field_k.c((byte) 115, ((qh) this).field_h);
                if (0 == ((qh) this).field_r) {
                  break L1;
                } else {
                  if (-501 >= var2) {
                    if (-1 == (var2 % 50 ^ -1)) {
                      vb discarded$1 = it.a(255, 131);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                L4: {
                  var3 = ((qh) this).field_C[var2];
                  if (var3.b(-123)) {
                    this.b(false, var2, var3.a((byte) -54));
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var3.b((byte) 116) ^ -1) < -17) {
                    ((qh) this).field_o[var2] = 1;
                    break L5;
                  } else {
                    if ((((qh) this).field_o[var2] ^ -1) >= -1) {
                      break L5;
                    } else {
                      if ((var3.b((byte) 97) ^ -1) < -9) {
                        break L5;
                      } else {
                        ((qh) this).field_o[var2] = 0;
                        break L5;
                      }
                    }
                  }
                }
                var4 = ((qh) this).field_o[var2];
                L6: while (true) {
                  L7: {
                    if (-1 <= (var3.b((byte) 102) ^ -1)) {
                      break L7;
                    } else {
                      if ((var4 ^ -1) >= -1) {
                        break L7;
                      } else {
                        var4--;
                        this.b(false, var2, var3.a((byte) -70));
                        continue L6;
                      }
                    }
                  }
                  var5 = (tu) (Object) ((qh) this).field_k.field_G[var2].m(9262);
                  var6 = var5.b((byte) 121);
                  L8: while (true) {
                    if (var6 == null) {
                      var2++;
                      continue L3;
                    } else {
                      L9: {
                        if (!iqa.field_c.b(4782)) {
                          break L9;
                        } else {
                          var7 = this.a(var6.b(-14065), (byte) -9, var6.c(74));
                          var8 = ab.a(-23, var7);
                          iqa.field_c.a(0, var8);
                          break L9;
                        }
                      }
                      var6 = var5.b((byte) -57);
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        L10: {
          ((qh) this).field_k.field_c.a(16);
          if (((qh) this).field_n != null) {
            ((qh) this).field_n.a(9981);
            break L10;
          } else {
            break L10;
          }
        }
    }

    final void a(byte param0, int[][] param1, int param2) {
        int var4 = 119 % ((param0 - 56) / 44);
        this.i(-1);
        ((qh) this).field_k.k(param2, -1);
        this.i((byte) 99);
        if (0 == ((qh) this).field_k.field_K) {
            this.a(6, (qra) (Object) new opa((qh) this, ((qh) this).field_z, param1));
        } else {
            this.a(6, (qra) (Object) new bp((qh) this, ((qh) this).field_z));
        }
    }

    final void b(int param0, int param1, int param2) {
        if (!(!((qh) this).field_D)) {
            throw new IllegalStateException("NMP");
        }
        ((qh) this).field_k.field_y[param2].a(param0, (byte) 37);
        if (param1 != 50) {
            ((qh) this).field_v = null;
        }
    }

    final void c(int param0, int param1, int param2) {
        if (!(!(((qh) this).field_l instanceof uda))) {
            ((uda) (Object) ((qh) this).field_l).a(param2, 0, param0);
        }
        int var4 = 25 % ((param1 - 54) / 49);
    }

    private final int n(byte param0) {
        if (param0 != 19) {
            field_q = null;
        }
        return ((qh) this).field_j;
    }

    final void o(int param0) {
        int var2 = 0;
        if (((qh) this).field_k.field_K != 3) {
            if (((qh) this).field_E == -11) {
                return;
            }
            if (param0 != -18570) {
                ((qh) this).field_E = 16;
            }
            if (qv.field_o == null) {
                if (-1 < ((qh) this).field_j) {
                    if (!this.o((byte) 62)) {
                        if (!(((qh) this).field_E < 0)) {
                            var2 = ((qh) this).field_E;
                            qv.field_o = new kb(var2, var2 ^ 65535, ti.field_b, tb.field_o, lu.field_a, gda.field_b, new int[1]);
                            if (!(vpa.a(66))) {
                                su.a(qv.field_o, (byte) -108, 3);
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
            return true;
        }
        return ((qh) this).field_k.d(-108);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 != ((qh) this).field_j) {
            var3 = -((qh) this).field_j + param0;
            if (wka.field_d) {
              break L0;
            } else {
              if (null == rba.field_a) {
                break L0;
              } else {
                if (rba.field_a.field_x < 0) {
                  break L0;
                } else {
                  if (rba.field_a.field_D) {
                    break L0;
                  } else {
                    if (rba.field_a.f((byte) 33)) {
                      break L0;
                    } else {
                      if ((Object) (Object) hb.field_t != (Object) (Object) rba.field_a) {
                        break L0;
                      } else {
                        var4 = uca.field_c.a(3, 0);
                        if (0 != var4) {
                          if (var4 == 1) {
                            tb.field_o = tb.field_o - var3;
                            break L0;
                          } else {
                            var5 = var3 / 3;
                            tb.field_o = tb.field_o - (-var5 + var3);
                            ti.field_b = ti.field_b + var5;
                            break L0;
                          }
                        } else {
                          ti.field_b = ti.field_b + var3;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            L1: {
              if (!((qh) this).field_D) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var3 = stackIn_4_0;
            if (wka.field_d) {
              break L0;
            } else {
              if (var3 != 0) {
                break L0;
              } else {
                if (rba.field_a == null) {
                  break L0;
                } else {
                  if (rba.field_a.f((byte) 33)) {
                    break L0;
                  } else {
                    if ((Object) (Object) hb.field_t == (Object) (Object) rba.field_a) {
                      var4 = uca.field_c.a(8, 0);
                      if (0 != var4) {
                        if ((var4 ^ -1) != -2) {
                          if (var4 != -3) {
                            if (-4 != var4) {
                              if (var4 == -5) {
                                tb.field_o = tb.field_o + lu.field_a;
                                gda.field_b = gda.field_b + 1;
                                break L0;
                              } else {
                                if (5 == var4) {
                                  tb.field_o = tb.field_o + gda.field_b;
                                  lu.field_a = lu.field_a + 1;
                                  break L0;
                                } else {
                                  if (-7 != var4) {
                                    if ((var4 ^ -1) == -8) {
                                      lu.field_a = lu.field_a - 1;
                                      tb.field_o = tb.field_o - gda.field_b;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  } else {
                                    tb.field_o = tb.field_o - lu.field_a;
                                    gda.field_b = gda.field_b - 1;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              lu.field_a = lu.field_a + 1;
                              ti.field_b = ti.field_b - gda.field_b;
                              break L0;
                            }
                          } else {
                            ti.field_b = ti.field_b - lu.field_a;
                            gda.field_b = gda.field_b + 1;
                            break L0;
                          }
                        } else {
                          ti.field_b = ti.field_b + gda.field_b;
                          lu.field_a = lu.field_a - 1;
                          break L0;
                        }
                      } else {
                        ti.field_b = ti.field_b + lu.field_a;
                        gda.field_b = gda.field_b - 1;
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        if (param1 == 23104) {
          ((qh) this).field_j = param0;
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        if (((qh) this).d((byte) 85)) {
            return;
        }
        if (param0 >= -4) {
            return;
        }
        if (((qh) this).field_z != null) {
            if (!(!((qh) this).field_z.b(1))) {
                return;
            }
        }
        this.a(false, ((qh) this).field_x);
    }

    final void i(int param0, int param1) {
        ((qh) this).field_k.a(param0, (byte) 119);
        this.i((byte) 99);
        if (param1 <= 15) {
            return;
        }
        this.a(6, (qra) (Object) new qka((qh) this, ((qh) this).field_z));
    }

    final String a(int param0, boolean param1) {
        if (param1) {
            ((qh) this).field_s = false;
        }
        return ((qh) this).field_k.c(param0, 0);
    }

    final boolean d(byte param0) {
        if (param0 < 60) {
            ((qh) this).field_w = false;
        }
        return (((qh) this).field_x ^ -1) == 1 ? true : false;
    }

    final String j(int param0, int param1) {
        if (param1 != 9) {
            Object var4 = null;
            ((qh) this).b(-82, (kh) null);
        }
        return ((qh) this).field_k.e(param0, 23807);
    }

    static {
    }
}
