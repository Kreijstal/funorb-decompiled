/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class ii {
    private boolean field_u;
    private int field_w;
    private int field_n;
    static String field_v;
    static int field_t;
    static String field_b;
    private int field_x;
    static String field_B;
    private boolean field_h;
    static int field_i;
    private bg field_j;
    private boolean field_f;
    private boolean field_m;
    static String field_c;
    static int field_q;
    static String[] field_y;
    private pb field_A;
    private boolean field_s;
    static String field_k;
    private boolean field_l;
    static hh[] field_p;
    private boolean field_r;
    int field_z;
    int field_o;
    private boolean field_g;
    private nn field_e;
    private uh[] field_d;
    pm field_a;

    private final void b(int param0, byte param1) {
        int var7 = 0;
        uh var8 = null;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var3 = 6;
        ((ii) this).field_a.field_a[param0].a(((ii) this).field_a.field_d.field_l[((ii) this).field_a.field_d.field_d], -99);
        ((ii) this).field_a.field_a[-param0 + 1].a(0, rd.field_l);
        ((ii) this).field_a.field_a[-param0 + 1].field_e = bl.field_b;
        ((ii) this).field_a.field_a[1 + -param0].field_h = ka.field_V;
        int var4 = jk.field_c + -((ii) this).field_a.field_v[param0];
        int var5 = ng.field_u + -((ii) this).field_a.field_v[-param0 + 1];
        if (0 < var4) {
            ((ii) this).field_d[param0].a(-20791, var4, false);
        }
        if (!(var5 <= 0)) {
            ((ii) this).field_d[-param0 + 1].a(-20791, var5, false);
        }
        ((ii) this).field_a.field_v[param0] = jk.field_c;
        ((ii) this).field_a.field_v[-param0 + 1] = ng.field_u;
        uh[] var6 = ((ii) this).field_d;
        for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            var8.d(93);
            var8.field_l = true;
        }
        if (((ii) this).field_a.c(0)) {
            ((ii) this).field_r = false;
        } else {
            ((ii) this).field_r = true;
        }
        ((ii) this).field_d[param0].field_c = false;
        gq.a(0, 200, 320, sd.a(qm.field_G, 35, new String[1]));
    }

    private final void h(int param0) {
        uh[] var2 = null;
        int var3 = 0;
        uh var4 = null;
        int var5 = 0;
        uh[] var6 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (((ii) this).field_a.field_r <= 0) {
            break L0;
          } else {
            if (((ii) this).field_s) {
              break L0;
            } else {
              if (!((ii) this).field_a.field_d.field_i) {
                ((ii) this).a(16, (byte) 58, 239);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((ii) this).field_w) {
            break L1;
          } else {
            L2: {
              if (((ii) this).field_a.field_r != 5) {
                break L2;
              } else {
                ((ii) this).a(11, (byte) 58, 244);
                break L2;
              }
            }
            if (10 != ((ii) this).field_a.field_r) {
              break L1;
            } else {
              ((ii) this).a(17, (byte) 58, 238);
              break L1;
            }
          }
        }
        L3: {
          ((ii) this).field_s = false;
          if (9 != ((ii) this).field_a.field_r) {
            break L3;
          } else {
            if (uo.field_j > 0) {
              break L3;
            } else {
              ((ii) this).a(true, 250, false);
              return;
            }
          }
        }
        ((ii) this).field_a.field_d.field_d = ((ii) this).field_a.field_d.field_l.length;
        int fieldTemp$1 = ((ii) this).field_a.field_r + 1;
        ((ii) this).field_a.field_r = ((ii) this).field_a.field_r + 1;
        ((ii) this).field_a.a(0, fieldTemp$1, oa.field_j);
        ((ii) this).field_f = true;
        var6 = ((ii) this).field_d;
        var2 = var6;
        var3 = 0;
        L4: while (true) {
          if (var3 >= var6.length) {
            L5: {
              if (param0 > 12) {
                break L5;
              } else {
                ((ii) this).field_w = 103;
                break L5;
              }
            }
            L6: {
              f.field_o = f.field_o + 1;
              if (((ii) this).field_a.field_r == 30) {
                ((ii) this).a(4, (byte) 58, 251);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (40 != ((ii) this).field_a.field_r) {
                break L7;
              } else {
                ((ii) this).a(5, (byte) 58, 250);
                break L7;
              }
            }
            L8: {
              if (50 != ((ii) this).field_a.field_r) {
                break L8;
              } else {
                ((ii) this).a(6, (byte) 58, 249);
                break L8;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            var4.e(2406);
            var3++;
            continue L4;
          }
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        hq var7 = null;
        hq var8 = null;
        hq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        hq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        hq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        hq stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        boolean stackIn_7_4 = false;
        boolean stackIn_7_5 = false;
        hq stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        boolean stackIn_8_4 = false;
        boolean stackIn_8_5 = false;
        hq stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        boolean stackIn_9_4 = false;
        boolean stackIn_9_5 = false;
        int stackIn_9_6 = 0;
        hq stackIn_20_0 = null;
        hq stackIn_21_0 = null;
        hq stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        hq stackOut_19_0 = null;
        hq stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        hq stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        hq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        hq stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        hq stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        hq stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        boolean stackOut_6_4 = false;
        boolean stackOut_6_5 = false;
        hq stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        boolean stackOut_8_4 = false;
        boolean stackOut_8_5 = false;
        int stackOut_8_6 = 0;
        hq stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        boolean stackOut_7_4 = false;
        boolean stackOut_7_5 = false;
        int stackOut_7_6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (!((ii) this).field_g) {
          L0: {
            ((ii) this).field_g = true;
            var7 = (hq) (Object) wo.b(-119, 13);
            var8 = var7;
            if (0 != oa.field_j) {
              if (oa.field_j != 1) {
                if (2 == oa.field_j) {
                  L1: {
                    var5 = null;
                    if (((ii) this).field_a.field_j < 0) {
                      break L1;
                    } else {
                      var5 = (Object) (Object) ((ii) this).field_a.field_i[((ii) this).field_a.field_j];
                      break L1;
                    }
                  }
                  var8.a((String) var5, -10, ((ii) this).field_a);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                L2: {
                  var5_int = un.field_j.field_e;
                  if (un.field_j.field_n) {
                    var5_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (50 > var5_int) {
                    break L3;
                  } else {
                    var5_int = -1;
                    break L3;
                  }
                }
                L4: {
                  if (0 < uo.field_j) {
                    break L4;
                  } else {
                    if (var5_int < 10) {
                      break L4;
                    } else {
                      var5_int = -1;
                      break L4;
                    }
                  }
                }
                L5: {
                  stackOut_19_0 = (hq) var8;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (go.field_k == 0) {
                    stackOut_21_0 = (hq) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L5;
                  } else {
                    stackOut_20_0 = (hq) (Object) stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L5;
                  }
                }
                ((hq) (Object) stackIn_22_0).a(stackIn_22_1 != 0, un.field_j.field_n, gb.field_f[1], gb.field_f[0], (byte) 34, var5_int, un.field_j.a((byte) -117));
                break L0;
              }
            } else {
              L6: {
                this.j(17945);
                stackOut_3_0 = (hq) var7;
                stackOut_3_1 = gb.field_f[0];
                stackOut_3_2 = gb.field_f[1];
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (wh.field_p == null) {
                  stackOut_5_0 = (hq) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L6;
                } else {
                  stackOut_4_0 = (hq) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L6;
                }
              }
              L7: {
                stackOut_6_0 = (hq) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = param0;
                stackOut_6_5 = jg.a((byte) 85);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                if (go.field_k == 0) {
                  stackOut_8_0 = (hq) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  break L7;
                } else {
                  stackOut_7_0 = (hq) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = stackIn_7_5;
                  stackOut_7_6 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  stackIn_9_6 = stackOut_7_6;
                  break L7;
                }
              }
              ((hq) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0, stackIn_9_4, stackIn_9_5, stackIn_9_6 != 0, gb.field_f[3], 2, gb.field_f[2], ((ii) this).field_a.field_v[0]);
              break L0;
            }
          }
          L8: {
            if (oa.field_j != 1) {
              dg.a(1, (byte) -97);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param1 == 250) {
              break L9;
            } else {
              ((ii) this).field_h = false;
              break L9;
            }
          }
          la.a(ti.field_t, 13, false, -25528);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 1 << param0;
        if ((de.field_n & var4) != 0) {
            return;
        }
        de.field_n = de.field_n | var4;
        go.field_k = go.field_k | var4;
        if (param1 != 58) {
            boolean discarded$0 = this.a(-117, 64);
        }
        pl.field_Y.a(22125, (fa) (Object) new ph(param0));
        if (!((ii) this).field_l) {
            nj.field_h.a(param1 ^ 22103, (fa) (Object) new hf(param0, param2, sb.field_a, f.field_o, ap.field_f, lo.field_Mb));
        }
    }

    private final void d(int param0) {
        uh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        uh var6 = null;
        uh stackIn_3_0 = null;
        uh stackOut_2_0 = null;
        uh stackOut_1_0 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (!this.a(14098, ((ii) this).field_z)) {
            stackOut_2_0 = ((ii) this).field_d[0];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((ii) this).field_d[((ii) this).field_z];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          var2 = var6;
          ((ma) (Object) ((ii) this).field_j).a(12804, false);
          if (0 == ec.field_t) {
            if (-1 > ((ii) this).field_n) {
              ((ii) this).field_n = ((ii) this).field_n - 1;
              ((ii) this).field_e.a((byte) -87, ((ii) this).field_n);
              if (!((ii) this).field_r) {
                break L1;
              } else {
                if (((ii) this).field_n != 0) {
                  break L1;
                } else {
                  if (var6.i(-122)) {
                    break L1;
                  } else {
                    ((ii) this).field_r = false;
                    ((ii) this).field_e.b(430);
                    aa.field_f.g(64, 15514);
                    break L1;
                  }
                }
              }
            } else {
              if (!((ii) this).field_r) {
                break L1;
              } else {
                if (-1 != ((ii) this).field_n) {
                  break L1;
                } else {
                  if (var6.i(-122)) {
                    break L1;
                  } else {
                    ((ii) this).field_r = false;
                    ((ii) this).field_e.b(430);
                    aa.field_f.g(64, 15514);
                    break L1;
                  }
                }
              }
            }
          } else {
            if (!((ii) this).field_r) {
              break L1;
            } else {
              if (((ii) this).field_n != 0) {
                break L1;
              } else {
                if (var6.i(-122)) {
                  break L1;
                } else {
                  ((ii) this).field_r = false;
                  ((ii) this).field_e.b(430);
                  aa.field_f.g(64, 15514);
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (!((ii) this).field_u) {
            break L2;
          } else {
            if (((ii) this).field_x <= 0) {
              break L2;
            } else {
              ((ii) this).field_x = ((ii) this).field_x - 1;
              break L2;
            }
          }
        }
        var3 = -1;
        var4 = 0;
        L3: while (true) {
          if (((ii) this).field_d.length <= var4) {
            L4: {
              if (var3 == -1) {
                break L4;
              } else {
                this.b(var3, (byte) -119);
                break L4;
              }
            }
            return;
          } else {
            L5: {
              ((ii) this).field_d[var4].c(-1);
              if (((ii) this).field_d[var4].field_c) {
                var3 = var4;
                break L5;
              } else {
                break L5;
              }
            }
            if (-1 > ((ii) this).field_a.field_a[var4].field_f) {
              L6: {
                if (-51 != ((ii) this).field_a.field_a[var4].field_f) {
                  break L6;
                } else {
                  ((ii) this).field_d[var4].a(-20791, 50, true);
                  break L6;
                }
              }
              ((ii) this).field_a.field_a[var4].field_f = 0;
              var4++;
              continue L3;
            } else {
              var4++;
              continue L3;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(2 == oa.field_j)) {
            throw new IllegalStateException();
        }
        int var5 = -122 % ((param3 - -11) / 49);
        if (!this.a(14098, param0)) {
            return;
        }
        if (!(!((ii) this).field_d[param0].field_o)) {
            ((ii) this).field_d[param0].a(6364, param1, param2);
        }
    }

    private final void a(boolean param0) {
        ((ii) this).field_a.a(false, nf.field_a);
        ((ii) this).field_a.field_v[1] = fo.field_g;
        ((ii) this).field_a.field_v[0] = sl.field_k;
        ((ii) this).a(false, 250, false);
    }

    final void e(int param0) {
        if (param0 != 6) {
            this.a((byte) 108);
        }
        if (!ag.field_p) {
            throw new IllegalStateException();
        }
        aa.field_f.g(60, 15514);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        L0: {
          L1: {
            if (((ii) this).field_z == -2) {
              break L1;
            } else {
              L2: {
                if (((ii) this).field_z == param1) {
                  break L2;
                } else {
                  if ((1 << ((ii) this).field_z & ((ii) this).field_a.field_k) != 0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ((ii) this).field_x = 1;
              break L0;
            }
          }
          ((ii) this).field_x = 50;
          break L0;
        }
        L3: {
          sl.field_k = param0;
          ((ii) this).field_u = true;
          if (!param3) {
            break L3;
          } else {
            this.a(true);
            break L3;
          }
        }
        fo.field_g = param2;
        nf.field_a = param1;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 >= 115) {
            break L0;
          } else {
            field_q = 92;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void g(int param0) {
        if (!(ag.field_p)) {
            throw new IllegalStateException();
        }
        aa.field_f.g(61, 15514);
        if (param0 <= 2) {
            ((ii) this).field_w = 3;
        }
    }

    final static fl a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        fl stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fl stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 118) {
              stackOut_3_0 = new fl(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fl) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ii.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, int param3, tf[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param0 <= 0) {
                  break L1;
                } else {
                  L2: {
                    var5_int = param4[0].field_A;
                    var6 = param4[2].field_A;
                    var7 = param4[1].field_A;
                    param4[0].b(param3, param1);
                    param4[2].b(-var6 + param0 + param3, param1);
                    t.a(wg.field_c);
                    t.d(param3 + var5_int, param1, param0 + param3 + -var6, param1 - -param4[1].field_B);
                    var8 = var5_int + param3;
                    var9 = param3 - -param0 - var6;
                    param3 = var8;
                    if (param2 == 19571) {
                      break L2;
                    } else {
                      field_i = 19;
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var9 <= param3) {
                      t.b(wg.field_c);
                      break L0;
                    } else {
                      param4[1].b(param3, param1);
                      param3 = param3 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ii.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            if (!((ii) this).field_u) {
              break L0;
            } else {
              if (((ii) this).field_x != 0) {
                break L0;
              } else {
                if (!((ii) this).field_d[0].i(-121)) {
                  this.a(true);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          gb.field_f[0] = gb.field_f[0] + 1;
          if (!param1) {
            break L1;
          } else {
            this.i(114);
            break L1;
          }
        }
        L2: {
          this.a((byte) 34, param1);
          if (oa.field_j == 0) {
            this.a((byte) 41);
            break L2;
          } else {
            if (oa.field_j != 1) {
              if (oa.field_j != 2) {
                break L2;
              } else {
                this.d(-1);
                break L2;
              }
            } else {
              this.c(param0 + 228);
              break L2;
            }
          }
        }
        L3: {
          if (!this.a(14098, ((ii) this).field_z)) {
            break L3;
          } else {
            if (!((ii) this).field_h) {
              break L3;
            } else {
              if (0 == ((ii) this).field_d[((ii) this).field_z].field_p) {
                ((ii) this).field_h = false;
                ((ii) this).a(82, (byte) 123);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          rg.field_e.c(param0 + 109);
          ih.a(false);
          if (param0 == -110) {
            break L4;
          } else {
            ((ii) this).field_A = null;
            break L4;
          }
        }
        wn.c(0);
        ((ii) this).field_e.a(-82);
        ((ii) this).field_A.d(param0 + -16778);
    }

    private final void j(int param0) {
        int var2 = ((ii) this).field_a.field_v[0];
        if (null == wh.field_p) {
            if (var2 > 0) {
                if (!((ii) this).field_l) {
                    wh.field_p = new rh(0, 65535, ln.field_n, mj.field_j, ra.field_a, uh.field_r, new int[1]);
                    if (!(jg.a((byte) 120))) {
                        md.a(wh.field_p, true, 3);
                    }
                }
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, byte[] param6) {
        try {
            if (((ii) this).field_z != param2) {
                ((ii) this).field_d[param2].a(6364, 8, param3);
            } else {
                boolean discarded$0 = ((ii) this).field_d[param2].a(0, 8);
            }
            ka.field_V = 15 & param0;
            ng.field_u = param1;
            bl.field_b = param0 >> 4;
            if (param4 <= 23) {
                this.c(44);
            }
            rd.field_l = param6;
            jk.field_c = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ii.U(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1) {
        try {
            java.lang.reflect.Field var12_ref = null;
            Exception var3_ref_Exception = null;
            uh[] var3_ref_uh__ = null;
            long var3 = 0L;
            int var4 = 0;
            uh var5_ref_uh = null;
            long var5_long = 0L;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Class var8 = null;
            java.lang.reflect.Field[] var9 = null;
            Object[] var10 = null;
            java.lang.reflect.Field[] var10_array = null;
            int var11 = 0;
            Object var12 = null;
            Thread var13 = null;
            Exception var14 = null;
            String var14_ref = null;
            int var15 = 0;
            uh[] var16 = null;
            Object var17 = null;
            tc var17_ref = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var12_ref = null;
            var15 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                rg.field_e.a(false);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                var3_ref_Exception.printStackTrace();
                break L1;
              }
            }
            L2: {
              if (fq.field_o == null) {
                break L2;
              } else {
                if (!jc.field_d) {
                  break L2;
                } else {
                  pe.field_b.c();
                  t.d();
                  fq.field_o.a(false);
                  qa.field_f.a(19692);
                  pe.field_b.a(0, 0, hn.field_d);
                  break L2;
                }
              }
            }
            if (!pm.field_u) {
              ((ii) this).field_A.c((byte) 104);
              var16 = ((ii) this).field_d;
              var3_ref_uh__ = var16;
              var4 = param1;
              L3: while (true) {
                if (var4 >= var16.length) {
                  L4: {
                    if (oa.field_j == 0) {
                      L5: {
                        vi.f(91);
                        ((ii) this).field_j.c(param1 + 2);
                        if (!param0) {
                          break L5;
                        } else {
                          rm.a(0);
                          break L5;
                        }
                      }
                      rg.field_e.a((byte) -119);
                      if (null == fq.field_o) {
                        break L4;
                      } else {
                        fq.field_o.a((byte) -108);
                        break L4;
                      }
                    } else {
                      if (oa.field_j != 1) {
                        if (oa.field_j != 2) {
                          break L4;
                        } else {
                          vi.f(68);
                          break L4;
                        }
                      } else {
                        un.field_j.f(param1 ^ 550);
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (param0) {
                      ((ii) this).field_e.a((byte) 9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (oa.field_j != 2) {
                      break L7;
                    } else {
                      ((ii) this).field_j.c(2);
                      break L7;
                    }
                  }
                  L8: {
                    if (!pf.field_e) {
                      break L8;
                    } else {
                      if (!cm.field_m) {
                        break L8;
                      } else {
                        rk.field_e.a(Integer.toString(kk.field_k), 30, 100, 1, -1);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (ud.field_K) {
                      var3 = Runtime.getRuntime().totalMemory();
                      var5_long = Runtime.getRuntime().freeMemory();
                      rk.field_e.c((var3 - var5_long) / 1024L + " kB / " + var3 / 1024L + " kB", 610, 100, 0, 0);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (!li.field_e) {
                      break L10;
                    } else {
                      var17_ref = qj.field_e;
                      var4 = var17_ref.field_z + var17_ref.field_w;
                      var5 = 30;
                      var6 = var4 - -15;
                      var7 = var5 - -110;
                      var8 = ((Object) (Object) ((ii) this).field_a).getClass();
                      var9 = var8.getFields();
                      t.a(var5 - 5, -5 + var6 + -var4, 70 + var7 + -var5, var4 * var9.length, 0, 190);
                      var10_array = var9;
                      var11 = 0;
                      L11: while (true) {
                        if (var11 >= var10_array.length) {
                          break L10;
                        } else {
                          var12_ref = var10_array[var11];
                          if (!var12_ref.getType().isArray()) {
                            var13 = Thread.currentThread();
                            var13.setName(var12_ref.getName());
                            var17_ref.c(var13.getName(), var7, var6, 16777215, 0);
                            try {
                              L12: {
                                var13.setName(var12_ref.get((Object) (Object) ((ii) this).field_a).toString());
                                var14_ref = var13.getName();
                                if (var14_ref != null) {
                                  var17_ref.a(var14_ref, var7 - -15, var6, 16777215, 0);
                                  decompiledRegionSelector0 = 1;
                                  break L12;
                                } else {
                                  var6 = var6 + var4;
                                  var11++;
                                  decompiledRegionSelector0 = 0;
                                  break L12;
                                }
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L13: {
                                var14 = (Exception) (Object) decompiledCaughtException;
                                decompiledRegionSelector0 = 1;
                                break L13;
                              }
                            }
                            if (decompiledRegionSelector0 == 0) {
                              continue L11;
                            } else {
                              var6 = var6 + var4;
                              var11++;
                              continue L11;
                            }
                          } else {
                            var11++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  var5_ref_uh = var16[var4];
                  var5_ref_uh.b(-1);
                  var4++;
                  continue L3;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            ((ii) this).field_x = 112;
            break L0;
          }
        }
        L1: {
          if (!this.a(14098, ((ii) this).field_z)) {
            break L1;
          } else {
            L2: {
              if (!((ii) this).field_d[((ii) this).field_z].field_l) {
                if (param1) {
                  if (bc.field_m[83]) {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_11_0 = stackOut_8_0;
                    break L2;
                  }
                } else {
                  stackOut_6_0 = 0;
                  stackIn_11_0 = stackOut_6_0;
                  break L2;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_11_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_11_0;
              stackOut_11_0 = ((ii) this).field_a.field_a[((ii) this).field_z].field_p;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var3 != 0) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L3;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
            }
            if ((stackIn_14_0 ? 1 : 0) == stackIn_14_1) {
              if (var3 != 0) {
                boolean discarded$28 = ((ii) this).field_d[((ii) this).field_z].a(param0 ^ 34, 6);
                if (ag.field_p) {
                  ae.a(6, -18656, ((ii) this).field_d[((ii) this).field_z].a(-119));
                  break L1;
                } else {
                  break L1;
                }
              } else {
                boolean discarded$29 = ((ii) this).field_d[((ii) this).field_z].a(param0 + -34, 7);
                if (!ag.field_p) {
                  break L1;
                } else {
                  ae.a(7, -18656, ((ii) this).field_d[((ii) this).field_z].a(-84));
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        L0: {
          if (param1 < 32) {
            break L0;
          } else {
            if (param1 <= 126) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 < 160) {
            break L1;
          } else {
            if (param1 <= 255) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (8364 == param1) {
            break L2;
          } else {
            if (param1 == 338) {
              break L2;
            } else {
              if (param1 == 8212) {
                break L2;
              } else {
                if (339 == param1) {
                  break L2;
                } else {
                  if (376 == param1) {
                    break L2;
                  } else {
                    if (param0 == 1) {
                      return false;
                    } else {
                      field_t = -29;
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return true;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        uh[] var4_ref_uh__ = null;
        int var5 = 0;
        uh var6 = null;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_96_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var3 = 100 / ((param1 - 25) / 58);
        if (param0 != 13) {
          L0: {
            if (!pf.field_e) {
              break L0;
            } else {
              if (param0 != 85) {
                if (1 != param0) {
                  if (param0 != 2) {
                    if (param0 == 3) {
                      wh.e(61, 2);
                      break L0;
                    } else {
                      if (param0 == 4) {
                        wh.e(-41, 3);
                        break L0;
                      } else {
                        if (param0 == 5) {
                          wh.e(60, 4);
                          break L0;
                        } else {
                          if (param0 == 6) {
                            wh.e(-111, 5);
                            break L0;
                          } else {
                            if (param0 == 7) {
                              wh.e(123, 6);
                              break L0;
                            } else {
                              if (param0 != 8) {
                                if (9 == param0) {
                                  L1: {
                                    if (li.field_e) {
                                      stackOut_56_0 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      break L1;
                                    } else {
                                      stackOut_55_0 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      break L1;
                                    }
                                  }
                                  li.field_e = stackIn_57_0 != 0;
                                  break L0;
                                } else {
                                  if (11 != param0) {
                                    if (12 == param0) {
                                      L2: {
                                        if (jc.field_d) {
                                          stackOut_52_0 = 0;
                                          stackIn_53_0 = stackOut_52_0;
                                          break L2;
                                        } else {
                                          stackOut_51_0 = 1;
                                          stackIn_53_0 = stackOut_51_0;
                                          break L2;
                                        }
                                      }
                                      jc.field_d = stackIn_53_0 != 0;
                                      break L0;
                                    } else {
                                      if (param0 != 102) {
                                        break L0;
                                      } else {
                                        L3: {
                                          if (!bc.field_m[81]) {
                                            break L3;
                                          } else {
                                            if (oa.field_j != 0) {
                                              break L3;
                                            } else {
                                              this.h(125);
                                              ((ii) this).a(-59);
                                              break L0;
                                            }
                                          }
                                        }
                                        if (bc.field_m[81]) {
                                          break L0;
                                        } else {
                                          var4_ref_uh__ = ((ii) this).field_d;
                                          var5 = 0;
                                          L4: while (true) {
                                            if (~var5 <= ~var4_ref_uh__.length) {
                                              boolean discarded$1 = ((ii) this).field_a.field_d.a((byte) -125);
                                              if (((ii) this).field_a.field_d.field_l.length != ((ii) this).field_a.field_d.field_d) {
                                                break L0;
                                              } else {
                                                this.h(80);
                                                ((ii) this).a(-105);
                                                break L0;
                                              }
                                            } else {
                                              var6 = var4_ref_uh__[var5];
                                              var6.d(93);
                                              var5++;
                                              continue L4;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L5: {
                                      if (gf.field_b) {
                                        stackOut_37_0 = 0;
                                        stackIn_38_0 = stackOut_37_0;
                                        break L5;
                                      } else {
                                        stackOut_36_0 = 1;
                                        stackIn_38_0 = stackOut_36_0;
                                        break L5;
                                      }
                                    }
                                    gf.field_b = stackIn_38_0 != 0;
                                    break L0;
                                  }
                                }
                              } else {
                                wh.e(51, 7);
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    wh.e(104, 1);
                    break L0;
                  }
                } else {
                  wh.e(-42, 0);
                  break L0;
                }
              } else {
                if (bc.field_m[81]) {
                  L6: {
                    if (ud.field_K) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  ud.field_K = stackIn_21_0 != 0;
                  break L0;
                } else {
                  L7: {
                    if (cm.field_m) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L7;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L7;
                    }
                  }
                  cm.field_m = stackIn_17_0 != 0;
                  break L0;
                }
              }
            }
          }
          L8: {
            if (this.a(14098, ((ii) this).field_z)) {
              L9: {
                L10: {
                  var4 = -1;
                  if (82 == param0) {
                    break L10;
                  } else {
                    if (~ap.field_e != ~param0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var4 = 4;
                break L9;
              }
              L11: {
                L12: {
                  if (param0 == 98) {
                    break L12;
                  } else {
                    if (param0 == el.field_a) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                var4 = 0;
                break L11;
              }
              L13: {
                L14: {
                  if (param0 == 99) {
                    break L14;
                  } else {
                    if (~param0 != ~ae.field_d) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                var4 = 1;
                break L13;
              }
              L15: {
                L16: {
                  if (param0 == 96) {
                    break L16;
                  } else {
                    if (cg.field_F != param0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var4 = 2;
                break L15;
              }
              L17: {
                L18: {
                  if (97 == param0) {
                    break L18;
                  } else {
                    if (hg.field_g == param0) {
                      break L18;
                    } else {
                      break L17;
                    }
                  }
                }
                var4 = 3;
                break L17;
              }
              L19: {
                if (84 == param0) {
                  L20: {
                    if (((ii) this).field_a.field_r != 0) {
                      break L20;
                    } else {
                      if (0 != oa.field_j) {
                        break L20;
                      } else {
                        this.h(65);
                        ((ii) this).a(-40);
                        ((ii) this).field_a.field_f = 0;
                        ((ii) this).field_a.field_b = false;
                        ((ii) this).field_a.field_o = 0;
                        break L20;
                      }
                    }
                  }
                  jd.a(0);
                  break L19;
                } else {
                  break L19;
                }
              }
              if (var4 == -1) {
                break L8;
              } else {
                L21: {
                  if (((ii) this).field_d[((ii) this).field_z].field_l) {
                    break L21;
                  } else {
                    L22: {
                      if (!((ii) this).field_d[((ii) this).field_z].a(0, var4)) {
                        stackOut_95_0 = 0;
                        stackIn_96_0 = stackOut_95_0;
                        break L22;
                      } else {
                        stackOut_94_0 = 1;
                        stackIn_96_0 = stackOut_94_0;
                        break L22;
                      }
                    }
                    L23: {
                      var5 = stackIn_96_0;
                      if (!ag.field_p) {
                        break L23;
                      } else {
                        if (var5 != 0) {
                          ae.a(var4, -18656, ((ii) this).field_d[((ii) this).field_z].a(-110));
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (var4 != 4) {
                      break L21;
                    } else {
                      if (var5 != 0) {
                        break L21;
                      } else {
                        if (((ii) this).field_d[((ii) this).field_z].field_p <= 0) {
                          break L21;
                        } else {
                          ((ii) this).field_h = true;
                          break L8;
                        }
                      }
                    }
                  }
                }
                break L8;
              }
            } else {
              break L8;
            }
          }
          return;
        } else {
          L24: {
            var4 = 1;
            if (ag.field_p) {
              if (((ii) this).field_z >= 0) {
                if (((ii) this).field_a.field_t) {
                  return;
                } else {
                  var4 = 2;
                  break L24;
                }
              } else {
                var4 = 4;
                break L24;
              }
            } else {
              break L24;
            }
          }
          L25: {
            var5 = var4;
            if (!gq.d(83)) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L25;
            } else {
              stackOut_8_0 = 12;
              stackIn_10_0 = stackOut_8_0;
              break L25;
            }
          }
          la.a(stackIn_10_0, var5, false, -25528);
          return;
        }
    }

    private final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 14098) {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                if (1 != param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    private final void c(int param0) {
        uh var3 = null;
        L0: {
          var3 = ((ii) this).field_d[((ii) this).field_z];
          var3.c(-1);
          if (param0 > 101) {
            break L0;
          } else {
            ((ii) this).field_o = -75;
            break L0;
          }
        }
        L1: {
          un.field_j.d(27420);
          if (un.field_j.field_f) {
            break L1;
          } else {
            if (!var3.field_l) {
              break L1;
            } else {
              L2: {
                if (((ii) this).field_l) {
                  break L2;
                } else {
                  un.field_j.e(20604);
                  break L2;
                }
              }
              L3: {
                var3.d(93);
                ((ii) this).field_a.field_a[((ii) this).field_z].a(-121);
                un.field_j.field_f = true;
                if ((33554431L & jo.field_h) == 33554431L) {
                  ((ii) this).a(14, (byte) 58, 241);
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((jo.field_h & 1125899906842623L) != 1125899906842623L) {
                break L1;
              } else {
                ((ii) this).a(15, (byte) 58, 240);
                break L1;
              }
            }
          }
        }
        L4: {
          L5: {
            if (un.field_j.field_f) {
              break L5;
            } else {
              if (!un.field_j.field_h) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (!var3.i(-124)) {
            gb.field_f[1] = ((ii) this).field_a.field_a[0].field_d;
            ((ii) this).a(false, 250, false);
            break L4;
          } else {
            break L4;
          }
        }
    }

    private final void i(int param0) {
        L0: {
          ra.field_a = ra.field_a + 7;
          ap.field_f = ap.field_f + sb.field_a;
          ln.field_n = ln.field_n + 7;
          lo.field_Mb = lo.field_Mb + 1;
          if (((ii) this).field_j instanceof ul) {
            if (pf.field_e) {
              if (bc.field_m[88]) {
                ((ul) (Object) ((ii) this).field_j).b(-123, true);
                if (!pf.field_e) {
                  break L0;
                } else {
                  if (!bc.field_m[87]) {
                    break L0;
                  } else {
                    ((ul) (Object) ((ii) this).field_j).b(-108, false);
                    break L0;
                  }
                }
              } else {
                if (!pf.field_e) {
                  break L0;
                } else {
                  if (!bc.field_m[87]) {
                    break L0;
                  } else {
                    ((ul) (Object) ((ii) this).field_j).b(-108, false);
                    break L0;
                  }
                }
              }
            } else {
              if (!pf.field_e) {
                break L0;
              } else {
                if (!bc.field_m[87]) {
                  break L0;
                } else {
                  ((ul) (Object) ((ii) this).field_j).b(-108, false);
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, String param4) {
        try {
            kf.field_q = param2;
            int var5_int = 55 / ((2 - param3) / 55);
            ch.a(param0, param4, 5, param1, ab.field_c, 320, rk.field_e.field_w, 10, bi.field_g, true, (jl) (Object) rk.field_e, rk.field_e.field_z + rk.field_e.field_w, (byte) 27, 15, 240);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ii.HA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static int c(int param0, byte param1) {
        return ok.a(tp.field_v, -100, param0);
    }

    ii() {
        this((String[]) null, 0, false, ok.a(ea.field_b, -115, 2147483647), 0, 0, 0);
    }

    final void a(int param0) {
        uh[] var2 = null;
        int var3 = 0;
        uh var4 = null;
        int var5 = 0;
        uh[] var6 = null;
        uh[] var7 = null;
        int var8 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (!ag.field_p) {
            break L0;
          } else {
            var6 = ((ii) this).field_d;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                this.d(-1);
                break L0;
              } else {
                var4 = var6[var3];
                if (!var4.field_l) {
                  var4.a(false);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        ((ii) this).field_a.d(0);
        var7 = ((ii) this).field_d;
        var2 = var7;
        var8 = 0;
        var3 = var8;
        L2: while (true) {
          if (var7.length <= var8) {
            L3: {
              if (param0 <= -1) {
                break L3;
              } else {
                this.h(-56);
                break L3;
              }
            }
            return;
          } else {
            var4 = var7[var8];
            var4.j(-125);
            var8++;
            continue L2;
          }
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_y = null;
        field_c = null;
        field_p = null;
        field_b = null;
        field_v = null;
        field_B = null;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        uh[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uh stackIn_14_2 = null;
        uh stackIn_14_3 = null;
        pm stackIn_14_4 = null;
        int stackIn_14_5 = 0;
        uh[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uh stackIn_15_2 = null;
        uh stackIn_15_3 = null;
        pm stackIn_15_4 = null;
        int stackIn_15_5 = 0;
        uh[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uh stackIn_16_2 = null;
        uh stackIn_16_3 = null;
        pm stackIn_16_4 = null;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        uh[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uh stackIn_17_2 = null;
        uh stackIn_17_3 = null;
        pm stackIn_17_4 = null;
        int stackIn_17_5 = 0;
        uh[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        uh stackIn_18_2 = null;
        uh stackIn_18_3 = null;
        pm stackIn_18_4 = null;
        int stackIn_18_5 = 0;
        uh[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        uh stackIn_19_2 = null;
        uh stackIn_19_3 = null;
        pm stackIn_19_4 = null;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        Object stackIn_20_0 = null;
        nn stackIn_20_1 = null;
        nn stackIn_20_2 = null;
        pm stackIn_20_3 = null;
        int[] stackIn_20_4 = null;
        int[] stackIn_20_5 = null;
        Object stackIn_21_0 = null;
        nn stackIn_21_1 = null;
        nn stackIn_21_2 = null;
        pm stackIn_21_3 = null;
        int[] stackIn_21_4 = null;
        int[] stackIn_21_5 = null;
        Object stackIn_22_0 = null;
        nn stackIn_22_1 = null;
        nn stackIn_22_2 = null;
        pm stackIn_22_3 = null;
        int[] stackIn_22_4 = null;
        int[] stackIn_22_5 = null;
        int stackIn_22_6 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        uh[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uh stackOut_13_2 = null;
        uh stackOut_13_3 = null;
        pm stackOut_13_4 = null;
        int stackOut_13_5 = 0;
        uh[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        uh stackOut_15_2 = null;
        uh stackOut_15_3 = null;
        pm stackOut_15_4 = null;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        uh[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uh stackOut_14_2 = null;
        uh stackOut_14_3 = null;
        pm stackOut_14_4 = null;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        uh[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        uh stackOut_16_2 = null;
        uh stackOut_16_3 = null;
        pm stackOut_16_4 = null;
        int stackOut_16_5 = 0;
        uh[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        uh stackOut_18_2 = null;
        uh stackOut_18_3 = null;
        pm stackOut_18_4 = null;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        uh[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        uh stackOut_17_2 = null;
        uh stackOut_17_3 = null;
        pm stackOut_17_4 = null;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        Object stackOut_19_0 = null;
        nn stackOut_19_1 = null;
        nn stackOut_19_2 = null;
        pm stackOut_19_3 = null;
        int[] stackOut_19_4 = null;
        int[] stackOut_19_5 = null;
        Object stackOut_21_0 = null;
        nn stackOut_21_1 = null;
        nn stackOut_21_2 = null;
        pm stackOut_21_3 = null;
        int[] stackOut_21_4 = null;
        int[] stackOut_21_5 = null;
        int stackOut_21_6 = 0;
        Object stackOut_20_0 = null;
        nn stackOut_20_1 = null;
        nn stackOut_20_2 = null;
        pm stackOut_20_3 = null;
        int[] stackOut_20_4 = null;
        int[] stackOut_20_5 = null;
        int stackOut_20_6 = 0;
        L0: {
          if (param0 > 110) {
            break L0;
          } else {
            field_t = 63;
            break L0;
          }
        }
        L1: {
          if (ag.field_p) {
            L2: {
              ((ii) this).field_d = new uh[2];
              if (((ii) this).field_z == 1) {
                stackOut_6_0 = 500;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 140;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_7_0;
              if (((ii) this).field_z != 1) {
                stackOut_9_0 = 500;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 140;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_10_0;
              if (oa.field_i) {
                stackOut_12_0 = 100;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 0;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_13_0;
              stackOut_13_0 = ((ii) this).field_d;
              stackOut_13_1 = 0;
              stackOut_13_2 = null;
              stackOut_13_3 = null;
              stackOut_13_4 = ((ii) this).field_a;
              stackOut_13_5 = 0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              stackIn_15_3 = stackOut_13_3;
              stackIn_15_4 = stackOut_13_4;
              stackIn_15_5 = stackOut_13_5;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              stackIn_14_4 = stackOut_13_4;
              stackIn_14_5 = stackOut_13_5;
              if (((ii) this).field_z == 0) {
                stackOut_15_0 = (uh[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = null;
                stackOut_15_3 = null;
                stackOut_15_4 = (pm) (Object) stackIn_15_4;
                stackOut_15_5 = stackIn_15_5;
                stackOut_15_6 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                stackIn_16_3 = stackOut_15_3;
                stackIn_16_4 = stackOut_15_4;
                stackIn_16_5 = stackOut_15_5;
                stackIn_16_6 = stackOut_15_6;
                break L5;
              } else {
                stackOut_14_0 = (uh[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = null;
                stackOut_14_3 = null;
                stackOut_14_4 = (pm) (Object) stackIn_14_4;
                stackOut_14_5 = stackIn_14_5;
                stackOut_14_6 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_16_3 = stackOut_14_3;
                stackIn_16_4 = stackOut_14_4;
                stackIn_16_5 = stackOut_14_5;
                stackIn_16_6 = stackOut_14_6;
                break L5;
              }
            }
            L6: {
              stackIn_16_0[stackIn_16_1] = new uh(stackIn_16_4, stackIn_16_5, stackIn_16_6 != 0, ((ii) this).field_a.field_d, var2, -var4 + 235);
              stackOut_16_0 = ((ii) this).field_d;
              stackOut_16_1 = 1;
              stackOut_16_2 = null;
              stackOut_16_3 = null;
              stackOut_16_4 = ((ii) this).field_a;
              stackOut_16_5 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_18_3 = stackOut_16_3;
              stackIn_18_4 = stackOut_16_4;
              stackIn_18_5 = stackOut_16_5;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              stackIn_17_3 = stackOut_16_3;
              stackIn_17_4 = stackOut_16_4;
              stackIn_17_5 = stackOut_16_5;
              if (1 == ((ii) this).field_z) {
                stackOut_18_0 = (uh[]) (Object) stackIn_18_0;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = null;
                stackOut_18_3 = null;
                stackOut_18_4 = (pm) (Object) stackIn_18_4;
                stackOut_18_5 = stackIn_18_5;
                stackOut_18_6 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                stackIn_19_3 = stackOut_18_3;
                stackIn_19_4 = stackOut_18_4;
                stackIn_19_5 = stackOut_18_5;
                stackIn_19_6 = stackOut_18_6;
                break L6;
              } else {
                stackOut_17_0 = (uh[]) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = null;
                stackOut_17_3 = null;
                stackOut_17_4 = (pm) (Object) stackIn_17_4;
                stackOut_17_5 = stackIn_17_5;
                stackOut_17_6 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_19_3 = stackOut_17_3;
                stackIn_19_4 = stackOut_17_4;
                stackIn_19_5 = stackOut_17_5;
                stackIn_19_6 = stackOut_17_6;
                break L6;
              }
            }
            L7: {
              stackIn_19_0[stackIn_19_1] = new uh(stackIn_19_4, stackIn_19_5, stackIn_19_6 != 0, ((ii) this).field_a.field_d, var3, -var4 + 235);
              ((ii) this).field_A = new pb(((ii) this).field_a.field_d, 320, -(var4 >> 1) + 200);
              stackOut_19_0 = this;
              stackOut_19_1 = null;
              stackOut_19_2 = null;
              stackOut_19_3 = ((ii) this).field_a;
              stackOut_19_4 = new int[]{var2, var3};
              stackOut_19_5 = new int[]{235, 235};
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_21_3 = stackOut_19_3;
              stackIn_21_4 = stackOut_19_4;
              stackIn_21_5 = stackOut_19_5;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              stackIn_20_4 = stackOut_19_4;
              stackIn_20_5 = stackOut_19_5;
              if (((ii) this).field_z != 1) {
                stackOut_21_0 = this;
                stackOut_21_1 = null;
                stackOut_21_2 = null;
                stackOut_21_3 = (pm) (Object) stackIn_21_3;
                stackOut_21_4 = (int[]) (Object) stackIn_21_4;
                stackOut_21_5 = (int[]) (Object) stackIn_21_5;
                stackOut_21_6 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                stackIn_22_3 = stackOut_21_3;
                stackIn_22_4 = stackOut_21_4;
                stackIn_22_5 = stackOut_21_5;
                stackIn_22_6 = stackOut_21_6;
                break L7;
              } else {
                stackOut_20_0 = this;
                stackOut_20_1 = null;
                stackOut_20_2 = null;
                stackOut_20_3 = (pm) (Object) stackIn_20_3;
                stackOut_20_4 = (int[]) (Object) stackIn_20_4;
                stackOut_20_5 = (int[]) (Object) stackIn_20_5;
                stackOut_20_6 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                stackIn_22_4 = stackOut_20_4;
                stackIn_22_5 = stackOut_20_5;
                stackIn_22_6 = stackOut_20_6;
                break L7;
              }
            }
            ((ii) this).field_e = new nn(stackIn_22_3, stackIn_22_4, stackIn_22_5, stackIn_22_6 != 0);
            break L1;
          } else {
            ((ii) this).field_d = new uh[1];
            ((ii) this).field_d[0] = new uh(((ii) this).field_a, 0, false, ((ii) this).field_a.field_d, 384, 256);
            ((ii) this).field_A = new pb(((ii) this).field_a.field_d, 110, 240);
            ((ii) this).field_e = new nn(((ii) this).field_a, new int[1], new int[1], false);
            break L1;
          }
        }
        L8: {
          if (((ii) this).field_j == null) {
            break L8;
          } else {
            ((ii) this).field_j.a(((ii) this).field_a.field_d.field_j, -74);
            break L8;
          }
        }
    }

    final void a(byte param0, we param1) {
        try {
            if (param0 != 20) {
                ((ii) this).field_d = null;
            }
            ((ii) this).field_a.a(param1, (byte) 123);
            this.b(param0 ^ 102);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ii.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void f(int param0) {
        uh var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        uh[] var7 = ((ii) this).field_d;
        uh[] var2 = var7;
        int var3 = 0;
        int var4 = 73 % ((param0 - -2) / 36);
        while (var7.length > var3) {
            var5 = var7[var3];
            var5.j(-125);
            var5.h(9236);
            var3++;
        }
    }

    private final void a(byte param0) {
        uh var2 = null;
        hd var3 = null;
        ul var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        uh var8 = null;
        L0: {
          L1: {
            sb.field_a = sb.field_a - 1;
            f.field_o = f.field_o - lo.field_Mb;
            mj.field_j = mj.field_j + 1;
            uh.field_r = uh.field_r + ((ii) this).field_a.field_v[0];
            var8 = ((ii) this).field_d[((ii) this).field_z];
            var2 = var8;
            var3 = ((ii) this).field_a.field_a[((ii) this).field_z];
            var4 = (ul) (Object) ((ii) this).field_j;
            var8.c(param0 + -42);
            if (0 < ((ii) this).field_a.field_r) {
              break L1;
            } else {
              if (((ii) this).field_a.field_d.field_d != 4) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4.a(param0 + -77, var8.i(-122));
          break L0;
        }
        L2: {
          wb.b(5);
          if (null == aa.field_p) {
            break L2;
          } else {
            if (!aa.field_p.field_n) {
              break L2;
            } else {
              if (aa.field_p.field_r == null) {
                break L2;
              } else {
                ((ii) this).field_e.field_f = di.a(false, aa.field_p.field_l[1][0]);
                aa.field_p = null;
                break L2;
              }
            }
          }
        }
        if (!var4.a(false)) {
          L3: {
            if (var3.field_p) {
              break L3;
            } else {
              if (((ii) this).field_w <= 0) {
                break L3;
              } else {
                if (((ii) this).field_a.field_r <= 0) {
                  break L3;
                } else {
                  ((ii) this).field_w = ((ii) this).field_w - 1;
                  break L3;
                }
              }
            }
          }
          L4: {
            if (param0 == 41) {
              break L4;
            } else {
              var7 = null;
              fl discarded$1 = ii.a((byte) 95, (String) null);
              break L4;
            }
          }
          L5: {
            if (((ii) this).field_a.field_r <= 0) {
              break L5;
            } else {
              L6: {
                if (((ii) this).field_a.field_o != ((ii) this).field_a.field_d.field_g) {
                  break L6;
                } else {
                  ((ii) this).a(18, (byte) 58, 237);
                  break L6;
                }
              }
              L7: {
                if (!((ii) this).field_a.field_b) {
                  break L7;
                } else {
                  if (var8.field_l) {
                    break L7;
                  } else {
                    ((ii) this).a(19, (byte) 58, 236);
                    break L7;
                  }
                }
              }
              if (100 > ((ii) this).field_a.field_f) {
                break L5;
              } else {
                ((ii) this).a(21, (byte) 58, 234);
                break L5;
              }
            }
          }
          L8: {
            if (var3.field_f <= 0) {
              break L8;
            } else {
              if (((ii) this).field_a.field_r > 0) {
                L9: {
                  if (50 != var3.field_f) {
                    break L9;
                  } else {
                    var8.a(-20791, var3.field_f, true);
                    gb.field_f[2] = gb.field_f[2] + 1;
                    kl.a((byte) -117);
                    break L9;
                  }
                }
                L10: {
                  var5 = var3.field_f;
                  f.field_o = f.field_o + (var5 << 7);
                  ln.field_n = ln.field_n + var5 * mj.field_j;
                  if (((ii) this).field_a.field_v[0] >= 10000) {
                    ((ii) this).a(0, (byte) 58, 255);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (((ii) this).field_a.field_v[0] < 50000) {
                    break L11;
                  } else {
                    ((ii) this).a(1, (byte) 58, 254);
                    break L11;
                  }
                }
                L12: {
                  if (((ii) this).field_a.field_v[0] > -100001) {
                    break L12;
                  } else {
                    ((ii) this).a(2, (byte) 58, 253);
                    break L12;
                  }
                }
                if (-250001 <= ((ii) this).field_a.field_v[0]) {
                  ((ii) this).a(3, (byte) 58, 252);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
          }
          L13: {
            var3.field_f = 0;
            if (!var8.field_l) {
              break L13;
            } else {
              L14: {
                var5 = ((ii) this).field_a.field_d.field_e;
                if (0 < ((ii) this).field_a.field_r) {
                  L15: {
                    var6 = var5;
                    ((ii) this).field_a.field_v[0] = ((ii) this).field_a.field_v[0] + var6;
                    ra.field_a = ra.field_a - mj.field_j * var6;
                    ap.field_f = ap.field_f + (var6 << 7);
                    if (((ii) this).field_a.field_v[0] < 10000) {
                      break L15;
                    } else {
                      ((ii) this).a(0, (byte) 58, 255);
                      break L15;
                    }
                  }
                  L16: {
                    if (((ii) this).field_a.field_v[0] < 50000) {
                      break L16;
                    } else {
                      ((ii) this).a(1, (byte) 58, 254);
                      break L16;
                    }
                  }
                  L17: {
                    if (((ii) this).field_a.field_v[0] >= 100000) {
                      ((ii) this).a(2, (byte) 58, 253);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (250000 > ((ii) this).field_a.field_v[0]) {
                      break L18;
                    } else {
                      ((ii) this).a(3, (byte) 58, 252);
                      break L18;
                    }
                  }
                  var8.a(-20791, var5, false);
                  break L14;
                } else {
                  break L14;
                }
              }
              L19: {
                if (var4.a(((ii) this).field_a.field_d.field_b, (byte) 73)) {
                  if (((ii) this).field_a.field_r > 10) {
                    ((ii) this).a(7, (byte) 58, 248);
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
              L20: {
                gb.field_f[3] = gb.field_f[3] + 1;
                var8.d(93);
                var2.field_l = false;
                ((ii) this).field_m = true;
                ((ii) this).field_a.field_b = false;
                ((ii) this).field_a.field_f = 0;
                ((ii) this).field_a.field_o = 0;
                if (var3.field_x) {
                  break L20;
                } else {
                  if (((ii) this).field_a.field_r <= 0) {
                    break L20;
                  } else {
                    ((ii) this).a(20, (byte) 58, 235);
                    break L20;
                  }
                }
              }
              L21: {
                if (((ii) this).field_a.field_r > 10) {
                  L22: {
                    if (var3.field_m) {
                      break L22;
                    } else {
                      if (!((ii) this).field_a.field_d.field_i) {
                        ((ii) this).a(8, (byte) 58, 247);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var3.field_k) {
                      break L23;
                    } else {
                      ((ii) this).a(9, (byte) 58, 246);
                      break L23;
                    }
                  }
                  if (var3.field_k) {
                    break L21;
                  } else {
                    if (var3.field_m) {
                      break L21;
                    } else {
                      if (!((ii) this).field_a.field_d.field_i) {
                        ((ii) this).a(10, (byte) 58, 245);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                } else {
                  break L21;
                }
              }
              ((ii) this).field_s = ((ii) this).field_s | var3.field_m;
              break L13;
            }
          }
          L24: {
            L25: {
              if (!((ii) this).field_m) {
                break L25;
              } else {
                if (!var8.g(param0 ^ -42)) {
                  break L25;
                } else {
                  L26: {
                    if (((ii) this).field_a.c(0)) {
                      gb.field_f[1] = gb.field_f[1] + ((ii) this).field_a.field_a[0].field_d;
                      this.h(125);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  ((ii) this).a(param0 + -56);
                  ((ii) this).field_m = false;
                  break L24;
                }
              }
            }
            if (!((ii) this).field_f) {
              break L24;
            } else {
              if (((ii) this).field_A.a((byte) 85)) {
                ((ii) this).field_f = false;
                ((ii) this).field_A = new pb(((ii) this).field_a.field_d, 110, 240);
                break L24;
              } else {
                break L24;
              }
            }
          }
          return;
        } else {
          gb.field_f[1] = gb.field_f[1] + ((ii) this).field_a.field_a[0].field_d;
          ((ii) this).a(false, param0 + 209, false);
          return;
        }
    }

    ii(String[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        String[] stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String[] stackIn_8_0 = null;
        String[] stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        String stackIn_8_3 = null;
        int stackIn_12_0 = 0;
        Object stackIn_19_0 = null;
        ma stackIn_19_1 = null;
        ma stackIn_19_2 = null;
        int[] stackIn_19_3 = null;
        Object stackIn_20_0 = null;
        ma stackIn_20_1 = null;
        ma stackIn_20_2 = null;
        int[] stackIn_20_3 = null;
        Object stackIn_21_0 = null;
        ma stackIn_21_1 = null;
        ma stackIn_21_2 = null;
        int[] stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        Object stackIn_22_0 = null;
        ma stackIn_22_1 = null;
        ma stackIn_22_2 = null;
        int[] stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        Object stackIn_23_0 = null;
        ma stackIn_23_1 = null;
        ma stackIn_23_2 = null;
        int[] stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        Object stackIn_24_0 = null;
        ma stackIn_24_1 = null;
        ma stackIn_24_2 = null;
        int[] stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        String[] stackOut_5_0 = null;
        String[] stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        String[] stackOut_7_0 = null;
        String[] stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        String stackOut_7_3 = null;
        String[] stackOut_6_0 = null;
        String[] stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        String stackOut_6_3 = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_18_0 = null;
        ma stackOut_18_1 = null;
        ma stackOut_18_2 = null;
        int[] stackOut_18_3 = null;
        Object stackOut_20_0 = null;
        ma stackOut_20_1 = null;
        ma stackOut_20_2 = null;
        int[] stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        Object stackOut_19_0 = null;
        ma stackOut_19_1 = null;
        ma stackOut_19_2 = null;
        int[] stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        Object stackOut_21_0 = null;
        ma stackOut_21_1 = null;
        ma stackOut_21_2 = null;
        int[] stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        Object stackOut_23_0 = null;
        ma stackOut_23_1 = null;
        ma stackOut_23_2 = null;
        int[] stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        Object stackOut_22_0 = null;
        ma stackOut_22_1 = null;
        ma stackOut_22_2 = null;
        int[] stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        ((ii) this).field_h = false;
        ((ii) this).field_m = false;
        ((ii) this).field_f = false;
        ((ii) this).field_s = false;
        ((ii) this).field_w = 50;
        ((ii) this).field_u = false;
        ((ii) this).field_l = false;
        ((ii) this).field_g = false;
        ((ii) this).field_r = true;
        try {
          L0: {
            L1: {
              ap.field_f = 770566011;
              sb.field_a = 22178;
              if (oa.field_j != 2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              ag.field_p = stackIn_4_0 != 0;
              go.field_k = 0;
              f.field_o = 2359467;
              ln.field_n = 1426010794;
              ra.field_a = 1947508858;
              ((ii) this).field_z = param1;
              lo.field_Mb = 34851;
              if (param0 != null) {
                break L2;
              } else {
                L3: {
                  stackOut_5_0 = new String[1];
                  stackOut_5_1 = new String[1];
                  stackOut_5_2 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (null == kn.field_J) {
                    stackOut_7_0 = (String[]) (Object) stackIn_7_0;
                    stackOut_7_1 = (String[]) (Object) stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = ng.field_t;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    break L3;
                  } else {
                    stackOut_6_0 = (String[]) (Object) stackIn_6_0;
                    stackOut_6_1 = (String[]) (Object) stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = kn.field_J;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    break L3;
                  }
                }
                stackIn_8_1[stackIn_8_2] = stackIn_8_3;
                param0 = stackIn_8_0;
                break L2;
              }
            }
            L4: {
              if (wo.field_h < 2) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              pf.field_e = stackIn_12_0 != 0;
              mj.field_j = 13483;
              uh.field_r = 16042;
              ng.i(0);
              gb.field_f = new int[4];
              le.a(true);
              if (oa.field_j != 0) {
                if (oa.field_j == 1) {
                  ((ii) this).field_a = new pm(param0, 0, oa.field_j, param3, 0, un.field_j.field_a);
                  aq.a(((ii) this).field_a.field_g, false);
                  this.b(127);
                  ((ii) this).a(-100);
                  break L5;
                } else {
                  if (oa.field_j != 2) {
                    break L5;
                  } else {
                    L6: {
                      ((ii) this).field_a = new pm(param0, param4, oa.field_j, param3, param5, param6);
                      aq.a(((ii) this).field_a.field_g, false);
                      stackOut_18_0 = this;
                      stackOut_18_1 = null;
                      stackOut_18_2 = null;
                      stackOut_18_3 = ((ii) this).field_a.field_v;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      if (((ii) this).field_z != 1) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = null;
                        stackOut_20_2 = null;
                        stackOut_20_3 = (int[]) (Object) stackIn_20_3;
                        stackOut_20_4 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        break L6;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = null;
                        stackOut_19_2 = null;
                        stackOut_19_3 = (int[]) (Object) stackIn_19_3;
                        stackOut_19_4 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        break L6;
                      }
                    }
                    L7: {
                      stackOut_21_0 = this;
                      stackOut_21_1 = null;
                      stackOut_21_2 = null;
                      stackOut_21_3 = (int[]) (Object) stackIn_21_3;
                      stackOut_21_4 = stackIn_21_4;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      stackIn_22_4 = stackOut_21_4;
                      if (!oa.field_i) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = null;
                        stackOut_23_2 = null;
                        stackOut_23_3 = (int[]) (Object) stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        break L7;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = null;
                        stackOut_22_2 = null;
                        stackOut_22_3 = (int[]) (Object) stackIn_22_3;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = 120;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_24_5 = stackOut_22_5;
                        break L7;
                      }
                    }
                    L8: {
                      ((ii) this).field_j = (bg) (Object) new ma(stackIn_24_3, stackIn_24_4 != 0, stackIn_24_5);
                      this.b(122);
                      ((ii) this).field_r = true;
                      stackOut_24_0 = this;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (((ii) this).field_z != -2) {
                        stackOut_26_0 = this;
                        stackOut_26_1 = 149;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L8;
                      } else {
                        stackOut_25_0 = this;
                        stackOut_25_1 = 0;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        break L8;
                      }
                    }
                    ((ii) this).field_n = stackIn_27_1;
                    break L5;
                  }
                }
              } else {
                L9: {
                  aq.a(true);
                  ((ii) this).field_j = (bg) (Object) new ul(90);
                  if (jg.a((byte) 95)) {
                    break L9;
                  } else {
                    aa.field_p = g.a(3, (byte) -97, 1, 10, 0);
                    break L9;
                  }
                }
                ((ii) this).field_a = new pm(param0, 0, oa.field_j, param3, 0, 0);
                kk.a(1, ((ii) this).field_a);
                this.b(119);
                ((ii) this).a(-70);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var8;
            stackOut_30_1 = new StringBuilder().append("ii.<init>(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Go Back";
        field_q = -1;
        field_k = "Names cannot start or end with space or underscore";
        field_b = "Options";
        field_c = "Match by...";
    }
}
