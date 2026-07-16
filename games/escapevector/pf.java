/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class pf {
    static int field_i;
    private dk[] field_c;
    wc field_b;
    static ed[] field_g;
    private int[] field_d;
    static String[] field_e;
    static String field_h;
    private dk[] field_a;
    int field_f;

    private final int a(int param0, dk[] param1) {
        int var4 = 0;
        dk var5 = null;
        int var6 = EscapeVector.field_A;
        int var3 = ((pf) this).field_b.field_h;
        if (param0 != 6481) {
            return -57;
        }
        for (var4 = 0; var4 < param1.length; var4++) {
            var5 = param1[var4];
            if (var5.field_c == var3) {
                return var4;
            }
        }
        return -1;
    }

    private final int a(int param0, int param1, dk[] param2, int param3) {
        if (param0 != 4) {
            Object var9 = null;
            int discarded$0 = this.a(-84, (dk[]) null);
        }
        int var5 = param3 + -param1;
        int var6 = this.a((byte) -106, param2);
        int var7 = (var5 - var6) / 2;
        int var8 = param3 - var7;
        return var8;
    }

    private final int b(byte param0) {
        if (param0 != 89) {
            boolean discarded$0 = this.a((byte) -26);
        }
        int var2 = this.a(6481, ((pf) this).field_c);
        if (-1 == (var2 ^ -1)) {
            return 1;
        }
        if (!(1 != var2)) {
            return 0;
        }
        if (!(2 != var2)) {
            return 2;
        }
        if ((var2 ^ -1) == -4) {
            return 3;
        }
        return -1;
    }

    final void d(int param0) {
        if (param0 != 100) {
            ((pf) this).field_a = null;
        }
        em.d();
        od.b(param0 + -98);
        pb.a(4);
        this.a(((pf) this).field_c, (byte) -116);
        this.a(((pf) this).field_a, (byte) -109);
    }

    private final int a(int param0, int param1, int param2) {
        if (param0 != 1) {
            field_h = null;
        }
        int var4 = this.a(param1, ((pf) this).field_c, param2, 3);
        if ((var4 ^ -1) <= -1) {
            return var4;
        }
        var4 = this.a(param1, ((pf) this).field_a, param2, 3);
        if (!((var4 ^ -1) > -1)) {
            return var4;
        }
        return -1;
    }

    private final boolean b(int param0, dk[] param1, dk[] param2) {
        int var5 = 0;
        if (param0 <= 7) {
            return true;
        }
        int var4 = this.a(6481, param1);
        if (-1 < (var4 ^ -1)) {
            return false;
        }
        if (var4 != 0) {
            var5 = param1[var4 + -1].field_c;
            ((pf) this).field_b.a(false, var5);
        } else {
            var5 = param2[param2.length - 1].field_c;
            ((pf) this).field_b.a(false, var5);
        }
        return true;
    }

    private final int a(byte param0, dk param1) {
        int var3 = param1.field_p / 2 + param1.field_f;
        int var4 = 16384 * var3 / 640;
        int var5 = 51 % ((param0 - 56) / 58);
        return var4;
    }

    private final int[] a(int param0, int param1, ih param2, byte param3) {
        int[] var6 = null;
        ed[] var7 = null;
        String[] var5 = null;
        int[] var8 = null;
        if (param3 < 91) {
            Object var11 = null;
            int[] discarded$0 = this.a(20, -91, (ih) null, (byte) -102);
        }
        if (!bj.e((byte) 127)) {
            var8 = new int[]{0, 1};
            var6 = new int[]{1, 0};
            var7 = new ed[]{pj.field_g[0], pj.field_g[1]};
            var5 = new String[]{pl.field_s[0], pl.field_s[1]};
        } else {
            var5 = pl.field_s;
            var6 = new int[]{1, 0, 2, 3};
            var7 = pj.field_g;
            var8 = new int[]{0, 1, 2, 3};
        }
        int var9 = var5.length;
        int[] var15 = this.a(param0, true, var9);
        this.a(3390, param1, var5, var7, var15, param2, var8);
        return var6;
    }

    private final int[] a(ih param0, int param1, int param2, int param3) {
        int[] var10 = null;
        int[] var8 = null;
        String[] var9 = null;
        int var5 = 0;
        int var6 = 640;
        int var7 = 442;
        if (aj.b(-96)) {
            var9 = new String[]{cn.field_e, ag.field_a};
            var10 = new int[]{0, 1};
            var8 = new int[]{3, 4};
        } else {
            var10 = new int[]{0};
            var8 = new int[]{4};
            var9 = new String[]{ag.field_a};
        }
        int var11 = var9.length;
        int[] var20 = this.a(param3, true, var11);
        if (param1 < 62) {
            field_e = null;
        }
        int[] var21 = vl.a(param2, param3, var11, (byte) -17);
        ((pf) this).field_a = na.a(var6, var20, var7, var5, param0, var9, var10, false, var21);
        return var8;
    }

    private final void a(dk[] param0, byte param1) {
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        dk[] var9 = param0;
        dk[] var3 = var9;
        for (var4 = 0; var4 < var9.length; var4++) {
            var5 = var9[var4];
            var6 = ((pf) this).field_b.field_h == var5.field_c ? 1 : 0;
            var5.a(-16383, var6 != 0);
        }
        if (param1 > -39) {
            Object var8 = null;
            int[] discarded$0 = this.a(28, -16, (ih) null, (byte) 69);
        }
    }

    private final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        var2 = 0;
        var3 = -14 % ((param0 - 15) / 58);
        L0: while (true) {
          if (!pn.p(-98)) {
            return false;
          } else {
            L1: {
              L2: {
                ((pf) this).field_b.a(113);
                if (nk.field_n == 97) {
                  break L2;
                } else {
                  if (nk.field_n != 99) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var4 = this.a(-101, ((pf) this).field_c, ((pf) this).field_a) ? 1 : 0;
                if (var4 != 0) {
                  break L3;
                } else {
                  var4 = this.a(-101, ((pf) this).field_a, ((pf) this).field_c) ? 1 : 0;
                  break L3;
                }
              }
              if (var4 != 0) {
                break L1;
              } else {
                ((pf) this).field_b.a(false, 0);
                break L1;
              }
            }
            L4: {
              L5: {
                if (96 == nk.field_n) {
                  break L5;
                } else {
                  if ((nk.field_n ^ -1) != -99) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var4 = this.b(33, ((pf) this).field_c, ((pf) this).field_a) ? 1 : 0;
                if (var4 == 0) {
                  var4 = this.b(84, ((pf) this).field_a, ((pf) this).field_c) ? 1 : 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 != 0) {
                break L4;
              } else {
                ((pf) this).field_b.a(false, 0);
                break L4;
              }
            }
            L7: {
              if (-14 != (nk.field_n ^ -1)) {
                break L7;
              } else {
                pg.field_b = false;
                qk.a(var2 != 0, -87);
                break L7;
              }
            }
            if (this.a(var2 != 0, (byte) 91)) {
              return true;
            } else {
              continue L0;
            }
          }
        }
    }

    final void e(int param0) {
        this.c((byte) 16);
        if (!(!this.a((byte) 94))) {
            return;
        }
        if (param0 <= 61) {
            field_h = null;
        }
        int var2 = this.a(1, bj.field_y, dh.field_d);
        int var3 = this.a(1, ng.field_ob, sf.field_c);
        ((pf) this).field_b.a(var3, (byte) 121, var2);
        boolean discarded$0 = this.a(true, (byte) 91);
    }

    private final int a(int param0, dk[] param1, int param2, int param3) {
        int var6 = 0;
        dk var7 = null;
        int var8 = EscapeVector.field_A;
        dk[] var10 = param1;
        dk[] var5 = var10;
        for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            if (var7.a((byte) 65, param2, param0)) {
                return var7.field_c;
            }
        }
        if (param3 != 3) {
            Object var9 = null;
            int discarded$0 = this.a(-122, (dk[]) null);
        }
        return -1;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        var2 = 84 / ((59 - param0) / 54);
        if (!((pf) this).field_b.field_e) {
          return;
        } else {
          var3 = 100;
          var4 = 1536 * qm.field_c / 64;
          var5 = (Object) (Object) rk.field_e;
          synchronized (var5) {
            L0: {
              this.a(((pf) this).field_c, (byte) -23, var3, var4);
              this.a(((pf) this).field_a, (byte) -23, var3, var4);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -113);
        if (param0 != -15268) {
            return;
        }
    }

    final static void e(byte param0) {
        oh var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        oh var6 = null;
        int var7 = 0;
        oh var7_ref_oh = null;
        oh var8_ref_oh = null;
        int var8 = 0;
        int var9 = 0;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          if (mh.field_e >= 100) {
            break L0;
          } else {
            if (Math.random() < 0.05 * (double)(100 - mh.field_e) / 100.0) {
              L1: {
                var10 = new oh();
                var11 = var10;
                if (Math.random() < 0.5) {
                  var11.field_m = 1;
                  var11.field_i = 0;
                  break L1;
                } else {
                  var10.field_m = -1;
                  var10.field_i = 640;
                  break L1;
                }
              }
              L2: {
                var11.field_q = 0 - -((int)(81.0 * Math.random()) * 6);
                var11.field_h = 50 + (int)(100.0 * Math.random());
                var11.field_o = (int)(Math.random() * 200.0) + 100;
                var2 = (int)(7.0 * Math.random());
                if (-1 < (var2 ^ -1)) {
                  var2 = 0;
                  break L2;
                } else {
                  if (-7 <= (var2 ^ -1)) {
                    break L2;
                  } else {
                    var2 = 6;
                    break L2;
                  }
                }
              }
              var11.field_l = -var2 + 6;
              var11.field_j = var2;
              wa.field_c.a(-12328, (hg) (Object) var11);
              if (var11.field_o >= 100) {
                mh.field_e = mh.field_e + 1;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (param0 <= -94) {
            break L3;
          } else {
            pf.e((byte) 116);
            break L3;
          }
        }
        var1 = (oh) (Object) wa.field_c.a(false);
        L4: while (true) {
          if (var1 == null) {
            var1 = (oh) (Object) si.field_u.a(false);
            L5: while (true) {
              if (var1 == null) {
                return;
              } else {
                L6: {
                  var2 = 0;
                  if ((var1.field_r ^ -1) > (var1.field_o ^ -1)) {
                    L7: {
                      if ((var1.field_s ^ -1) <= (var1.field_h ^ -1)) {
                        break L7;
                      } else {
                        var1.field_s = var1.field_s + 1;
                        break L7;
                      }
                    }
                    var1.field_r = var1.field_r + 1;
                    if (var1.field_s % 6 != 0) {
                      break L6;
                    } else {
                      var2 = 1;
                      break L6;
                    }
                  } else {
                    if ((var1.field_s ^ -1) >= -1) {
                      var1.c((byte) -59);
                      break L6;
                    } else {
                      var1.field_q = var1.field_q + var1.field_m;
                      var1.field_s = var1.field_s - 1;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var1.field_m >= 0) {
                    break L8;
                  } else {
                    if (-1 <= (var1.field_i ^ -1)) {
                      var1.c((byte) -56);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var1.field_m <= 0) {
                    break L9;
                  } else {
                    if (480 <= var1.field_i) {
                      var1.c((byte) -113);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var2 == 0) {
                    break L10;
                  } else {
                    L11: {
                      L12: {
                        if ((mh.field_e ^ -1) <= -101) {
                          break L12;
                        } else {
                          if (Math.random() >= (double)((500 - mh.field_e * 5) / 100)) {
                            break L12;
                          } else {
                            stackOut_68_0 = 1;
                            stackIn_70_0 = stackOut_68_0;
                            break L11;
                          }
                        }
                      }
                      stackOut_69_0 = 0;
                      stackIn_70_0 = stackOut_69_0;
                      break L11;
                    }
                    L13: {
                      L14: {
                        var3 = stackIn_70_0;
                        if (mh.field_e >= 100) {
                          break L14;
                        } else {
                          if (Math.random() >= (double)((100 - mh.field_e) * 5 / 100)) {
                            break L14;
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            break L13;
                          }
                        }
                      }
                      stackOut_73_0 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      break L13;
                    }
                    L15: {
                      var4 = stackIn_74_0;
                      var5 = var1.field_q - -(var1.field_s * var1.field_m);
                      if (var1.field_m >= 0) {
                        break L15;
                      } else {
                        var5--;
                        break L15;
                      }
                    }
                    L16: {
                      var6 = new oh();
                      var6.field_q = var5;
                      var6.field_m = -1;
                      var6.field_i = 1 + var1.field_i;
                      var6.field_h = 50 - -(int)(Math.random() * 100.0);
                      if (var3 == 0) {
                        var6.field_o = (int)(Math.random() * 40.0) + 10;
                        break L16;
                      } else {
                        L17: {
                          var6.field_o = 100 + (int)(200.0 * Math.random());
                          var7 = (int)(Math.random() * 7.0);
                          if (-1 >= (var7 ^ -1)) {
                            if (6 < var7) {
                              var7 = 6;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            var7 = 0;
                            break L17;
                          }
                        }
                        var6.field_j = var7;
                        var6.field_l = -var7 + 6;
                        break L16;
                      }
                    }
                    L18: {
                      wa.field_c.a(-12328, (hg) (Object) var6);
                      if (100 <= var6.field_o) {
                        mh.field_e = mh.field_e + 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      var12 = new oh();
                      var12.field_i = var1.field_i;
                      var12.field_q = var5;
                      var12.field_m = 1;
                      var12.field_h = 50 + (int)(Math.random() * 100.0);
                      if (var4 == 0) {
                        var12.field_o = 10 - -(int)(40.0 * Math.random());
                        break L19;
                      } else {
                        L20: {
                          var12.field_o = 100 - -(int)(200.0 * Math.random());
                          var8 = (int)(Math.random() * 7.0);
                          if (var8 >= 0) {
                            if (-7 <= (var8 ^ -1)) {
                              break L20;
                            } else {
                              var8 = 6;
                              break L20;
                            }
                          } else {
                            var8 = 0;
                            break L20;
                          }
                        }
                        var12.field_j = var8;
                        var12.field_l = 6 + -var8;
                        break L19;
                      }
                    }
                    wa.field_c.a(-12328, (hg) (Object) var12);
                    if (100 <= var12.field_o) {
                      mh.field_e = mh.field_e + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                var1 = (oh) (Object) si.field_u.b((byte) 70);
                continue L5;
              }
            }
          } else {
            L21: {
              if (var1.field_o > var1.field_r) {
                var1.field_r = var1.field_r + 1;
                if ((var1.field_s ^ -1) <= (var1.field_h ^ -1)) {
                  var1.field_i = var1.field_i + var1.field_m;
                  break L21;
                } else {
                  var1.field_s = var1.field_s + 1;
                  break L21;
                }
              } else {
                if (var1.field_s > 0) {
                  var1.field_s = var1.field_s - 1;
                  var1.field_i = var1.field_i + var1.field_m;
                  break L21;
                } else {
                  var1.c((byte) -33);
                  break L21;
                }
              }
            }
            L22: {
              if (var1.field_m >= 0) {
                break L22;
              } else {
                if (var1.field_i <= 0) {
                  var1.c((byte) -26);
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (0 >= var1.field_m) {
                break L23;
              } else {
                if (640 > var1.field_i) {
                  break L23;
                } else {
                  var1.c((byte) -69);
                  break L23;
                }
              }
            }
            L24: {
              if (var1.b((byte) 48)) {
                break L24;
              } else {
                if (100 <= var1.field_o) {
                  mh.field_e = mh.field_e - 1;
                  break L24;
                } else {
                  break L24;
                }
              }
            }
            var2 = (var1.field_o + -50) / 20;
            var3 = 0;
            L25: while (true) {
              if ((var3 ^ -1) <= (var2 ^ -1)) {
                var1 = (oh) (Object) wa.field_c.b((byte) 70);
                continue L4;
              } else {
                L26: {
                  if ((-(3 * (-var3 + var2)) + var1.field_o ^ -1) != (var1.field_r ^ -1)) {
                    break L26;
                  } else {
                    L27: {
                      var4 = var1.field_i - -(var1.field_m * (var1.field_s + (var1.field_o - var1.field_r)));
                      var5 = var4;
                      if (-1 > (var1.field_m ^ -1)) {
                        var5 += 5;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      var5 = 2 - -((var5 - 2) / 6 * 6);
                      var5 = var5 - (var2 + -var3) * (6 * var1.field_m);
                      var6_int = (int)(Math.random() * (double)var1.field_j);
                      if ((var6_int ^ -1) >= -1) {
                        break L28;
                      } else {
                        var7_ref_oh = new oh();
                        var7_ref_oh.field_i = var5;
                        var7_ref_oh.field_s = 1;
                        var7_ref_oh.field_h = 1 - -(6 * var6_int);
                        var7_ref_oh.field_o = 50;
                        var7_ref_oh.field_q = var1.field_q - -1;
                        var7_ref_oh.field_m = -1;
                        si.field_u.a(-12328, (hg) (Object) var7_ref_oh);
                        break L28;
                      }
                    }
                    var7 = (int)(Math.random() * (double)var1.field_l);
                    if (0 >= var7) {
                      break L26;
                    } else {
                      var8_ref_oh = new oh();
                      var8_ref_oh.field_s = 1;
                      var8_ref_oh.field_q = var1.field_q;
                      var8_ref_oh.field_o = 50;
                      var8_ref_oh.field_h = 1 - -(6 * var7);
                      var8_ref_oh.field_m = 1;
                      var8_ref_oh.field_i = var5;
                      si.field_u.a(-12328, (hg) (Object) var8_ref_oh);
                      break L26;
                    }
                  }
                }
                var3++;
                continue L25;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, dk[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dk var10 = null;
        int var11 = 0;
        var7 = mj.field_d;
        if (param3 <= var7) {
          if (-1 == (var7 % param0 ^ -1)) {
            L0: {
              var8 = param3 - -(param0 * (-1 + param2.length));
              if (param1 == 6) {
                break L0;
              } else {
                ((pf) this).field_f = 120;
                break L0;
              }
            }
            if (var7 > var8) {
              return;
            } else {
              L1: {
                var9 = (var7 + -param3) / param0;
                if ((var9 ^ -1) > -1) {
                  break L1;
                } else {
                  if (var9 < param2.length) {
                    var10 = param2[var9];
                    var11 = this.a((byte) 120, var10);
                    rk.field_e.a(pc.field_a, param4, param5, var11);
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        this.c(113);
        if (!((pf) this).field_b.b((byte) -18)) {
          return false;
        } else {
          L0: {
            var3 = ((pf) this).field_b.field_h;
            if (var3 < 0) {
              break L0;
            } else {
              if (((pf) this).field_d.length <= var3) {
                break L0;
              } else {
                L1: {
                  var4 = ((pf) this).field_d[var3];
                  if (-4 != (var4 ^ -1)) {
                    break L1;
                  } else {
                    if (aj.b(-100)) {
                      this.b(-15268);
                      return true;
                    } else {
                      break L1;
                    }
                  }
                }
                if (4 == var4) {
                  pg.field_b = false;
                  qk.a(param0, param1 + 34);
                  return true;
                } else {
                  if (this.b((byte) 89) != var4) {
                    if (param1 == 91) {
                      return false;
                    } else {
                      ((pf) this).field_b = null;
                      return false;
                    }
                  } else {
                    pg.field_b = false;
                    var5 = l.a(-8462, var4);
                    ll.a(0, var5, param0, ((pf) this).field_f);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final boolean a(int param0, dk[] param1, dk[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var4 = this.a(6481, param1);
        if ((var4 ^ -1) > -1) {
          return false;
        } else {
          L0: {
            if (param1.length - 1 > var4) {
              var5 = param1[var4 - -1].field_c;
              ((pf) this).field_b.a(false, var5);
              break L0;
            } else {
              var5 = param2[0].field_c;
              ((pf) this).field_b.a(false, var5);
              break L0;
            }
          }
          if (param0 == -101) {
            return true;
          } else {
            ((pf) this).field_b = null;
            return true;
          }
        }
    }

    private final void c(byte param0) {
        if (!(-1 != (mj.field_d ^ -1))) {
            sj.a(8192, (byte) 51);
        }
        de.field_j = true;
        int var2 = 6144 * qm.field_c / 64;
        int var3 = 100;
        int var4 = 10;
        if (param0 < 4) {
            field_g = null;
        }
        int var5 = var4;
        this.a(var4, 6, ((pf) this).field_c, var5, var3, var2);
        var5 = var5 + var4 * ((pf) this).field_c.length;
        this.a(var4, 6, ((pf) this).field_a, var5, var3, var2);
        if (!(-1001 >= (mj.field_d ^ -1))) {
            mj.field_d = mj.field_d + 1;
        }
    }

    private final int[] a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        if (!param1) {
            ((pf) this).d(106);
        }
        for (var5 = 0; var5 < param2; var5++) {
            var7[var5] = param0 - -var5;
        }
        return var4;
    }

    private final int a(byte param0, dk[] param1) {
        int var3 = 0;
        dk[] var4 = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = EscapeVector.field_A;
          var3 = 0;
          if (param0 <= -105) {
            break L0;
          } else {
            var8 = null;
            this.a((dk[]) null, (byte) 115, 95, -46);
            break L0;
          }
        }
        var4 = param1;
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            return var3;
          } else {
            var6 = var4[var5];
            if (var6.field_i > var3) {
              var3 = var6.field_i;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1, String[] param2, ed[] param3, int[] param4, ih param5, int[] param6) {
        int var11 = 0;
        dk var12_ref_dk = null;
        int var20 = 0;
        dk var21 = null;
        int var22 = 0;
        int var23 = EscapeVector.field_A;
        int var8 = 2;
        int var9 = param2.length;
        ((pf) this).field_c = new dk[var9];
        int var10 = 0;
        for (var11 = 0; var11 < var9; var11++) {
            var12_ref_dk = new dk(var8, param4[var11], param2[var11], param1, param3[var11], param6[var11], param5);
            ((pf) this).field_c[var11] = var12_ref_dk;
            var10 = var10 + var12_ref_dk.field_p;
        }
        var11 = 640;
        int var12 = na.a(1, var9, var11, var10);
        int var13 = dd.a(var10, (byte) 86, var11, var9, var12);
        int var14 = 0;
        int var15 = var14 + var13;
        if (param0 != 3390) {
            return;
        }
        int var16 = k.field_j.field_z / 2 + 77;
        int var17 = 442;
        int var18 = this.a(4, var16, ((pf) this).field_c, var17);
        dk[] var19 = ((pf) this).field_c;
        for (var20 = 0; var19.length > var20; var20++) {
            var21 = var19[var20];
            var22 = var18 + -var21.field_i;
            var21.b((byte) 39, var15, var22);
            var15 = var15 + (var12 + var21.field_p);
        }
    }

    private final void d(byte param0) {
        ih var2 = fh.field_g;
        int var3 = 10;
        int[] var4 = this.a(0, var3, var2, (byte) 102);
        int[] var5 = this.a(var2, 84, var3, var4.length);
        int var6 = var4.length - -var5.length;
        int var7 = 60 / ((50 - param0) / 47);
        ((pf) this).field_d = new int[var6];
        qg.a(var4, 0, ((pf) this).field_d, 0, var4.length);
        qg.a(var5, 0, ((pf) this).field_d, var4.length, var5.length);
        fi.a(((pf) this).field_c, 0);
        fi.a(((pf) this).field_a, 0);
    }

    final static void a(boolean param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            la var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            lk stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            lk stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            lk stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            Throwable decompiledCaughtException = null;
            lk stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            lk stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            lk stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            var6 = EscapeVector.field_A;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    var3_ref = jg.a(param2, 41);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                je.a(param0, var3_ref);
                var3_ref = vg.a(var3_ref, ":", (byte) 111, "%3a");
                var3_ref = vg.a(var3_ref, "@", (byte) 111, "%40");
                var3_ref = vg.a(var3_ref, "&", (byte) 111, "%26");
                var7 = vg.a(var3_ref, "#", (byte) 111, "%23");
                if (hg.field_c == null) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = ae.field_a;
                    stackOut_11_1 = -12;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackOut_11_4 = hg.field_c.getCodeBase();
                    stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(uf.field_n).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_13_5 = stackOut_11_5;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    if (null != eh.field_g) {
                      stackOut_13_0 = (lk) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                      stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                      stackOut_13_6 = eh.field_g;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      stackIn_14_6 = stackOut_13_6;
                      break L4;
                    } else {
                      stackOut_12_0 = (lk) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + eb.field_J;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_14_6 = stackOut_12_6;
                      break L4;
                    }
                  }
                  var4 = ((lk) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + lk.field_s + "&v2=" + lk.field_v + "&e=" + var7));
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if ((var4.field_f ^ -1) == -2) {
                          var5 = (DataInputStream) var4.field_b;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      en.a((byte) 105, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, byte param1, int param2) {
        if (param1 != -73) {
            ((pf) this).field_b = null;
        }
        ((pf) this).field_b = new wc(param2);
        int var4 = this.a(bj.field_y, ((pf) this).field_c, dh.field_d, 3);
        if (var4 < 0) {
            var4 = this.a(bj.field_y, ((pf) this).field_a, dh.field_d, 3);
        }
        ((pf) this).field_b.a(125, param0, var4, 0);
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_g = null;
        if (param0 != 459) {
            Object var2 = null;
            pf.a(false, (String) null, (Throwable) null);
        }
    }

    private final void a(dk[] param0, byte param1, int param2, int param3) {
        int var5 = this.a(6481, param0);
        if (!((var5 ^ -1) <= -1)) {
            return;
        }
        dk var6 = param0[var5];
        int var7 = var6.field_c;
        int var8 = ((pf) this).field_b.field_h;
        if (param1 != -23) {
            field_e = null;
        }
        if (var7 != var8) {
            return;
        }
        int var9 = this.a((byte) -97, var6);
        rk.field_e.a(oa.field_w, param2, param3, var9);
    }

    pf(boolean param0) {
        this.d((byte) -35);
        int var2 = ((pf) this).field_d.length;
        this.a(param0, (byte) -73, var2);
        ((pf) this).field_f = vh.f(104);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_g = new ed[7];
        field_h = "Level complete.";
        field_e = new String[16];
    }
}
