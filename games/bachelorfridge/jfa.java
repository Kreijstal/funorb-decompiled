/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jfa extends bw {
    lna field_v;
    int field_y;
    int field_n;
    static int field_w;
    int field_z;
    eaa field_i;
    int field_x;
    int field_p;
    private Random field_r;
    boolean field_s;
    int field_l;
    lga field_o;
    wda[][] field_m;
    int field_u;
    int field_k;
    private kv field_j;
    private int field_h;
    static qc[] field_q;
    rk field_g;
    static sna field_f;
    private boolean field_t;

    public static void c(boolean param0) {
        field_q = null;
        field_f = null;
        if (param0) {
            field_q = null;
        }
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        pd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (-1 > (dm.field_f ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          var3 = -117 % ((param0 - 6) / 37);
          if (var2 == 0) {
            stackOut_5_0 = 5;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_6_0;
          var5 = 2;
          if (((jfa) this).field_g.field_o.field_k.field_b == 7) {
            var5 = 4;
            break L2;
          } else {
            if (-7 != (((jfa) this).field_g.field_o.field_k.field_b ^ -1)) {
              break L2;
            } else {
              var5 = 3;
              break L2;
            }
          }
        }
        var6 = 1;
        L3: while (true) {
          if (var6 >= var4) {
            L4: {
              if (var2 == 0) {
                stackOut_20_0 = 15;
                stackIn_21_0 = stackOut_20_0;
                break L4;
              } else {
                stackOut_19_0 = 6;
                stackIn_21_0 = stackOut_19_0;
                break L4;
              }
            }
            var4 = stackIn_21_0;
            var9 = 2;
            var6 = var9;
            L5: while (true) {
              if (var9 >= var4) {
                return -1;
              } else {
                if (!((jfa) this).field_g.field_g[-2 + var9]) {
                  var7 = fw.field_h[((jfa) this).field_g.field_o.field_c[-2 + var9]];
                  return var7.field_g.field_b;
                } else {
                  var9++;
                  continue L5;
                }
              }
            }
          } else {
            if (!((jfa) this).field_g.field_g[-2 + var6 * 3]) {
              var7_int = ((jfa) this).field_g.field_o.field_c[-2 + 3 * var6];
              if (var6 >= 5 + -var5) {
                return fw.field_h[var7_int].field_g.field_b;
              } else {
                return var7_int;
              }
            } else {
              var6++;
              continue L3;
            }
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param2 > 12 + ((jfa) this).field_n) {
            if (param2 < ((jfa) this).field_n - (-12 + -(bd.field_i.field_q >> -1005839646))) {
                if (param0 > 10 + (-38 + ((jfa) this).field_k)) {
                    if (!(param0 >= -38 + ((jfa) this).field_k - (-10 - (bd.field_i.field_p >> -1681546622)))) {
                        return true;
                    }
                }
            }
        }
        if (param1 <= 115) {
            ((jfa) this).field_j = null;
            return false;
        }
        return false;
    }

    final int c(byte param0) {
        if (param0 >= -113) {
            return 37;
        }
        return 10 + 56 * ((jfa) this).field_u;
    }

    final void d(int param0) {
        pv var2_ref_pv = null;
        if (!((jfa) this).field_i.e(12917)) {
            var2_ref_pv = (pv) (Object) ((jfa) this).field_i.b((byte) 90);
            // ifeq L52
            var2_ref_pv.a(false);
        } else {
            boolean discarded$0 = this.f(-4);
        }
        ((jfa) this).field_v.c(11);
        int var2 = 84 / ((57 - param0) / 36);
    }

    final static kv[] a(vr param0, int param1, String param2) {
        kv[] var3 = null;
        int var4 = 0;
        Object var5 = null;
        kv[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          var3 = new kv[50];
          if (param1 == 4) {
            break L0;
          } else {
            var8 = null;
            kv[] discarded$2 = jfa.a((vr) null, -103, (String) null);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= 5) {
            return var3;
          } else {
            L2: {
              L3: {
                var5 = null;
                if (param2.equals((Object) (Object) "left_eye")) {
                  break L3;
                } else {
                  if (param2.equals((Object) (Object) "right_eye")) {
                    break L3;
                  } else {
                    if (!param2.equals((Object) (Object) "mouth")) {
                      var5_array = gw.a("bacteria_components", param2 + "_0" + var4, param0, param1 + -51);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var5_array = pi.a(param0, -8845, "bacteria_components", param2 + "_0" + var4);
              break L2;
            }
            var6 = 0;
            L4: while (true) {
              if (var6 >= var5_array.length) {
                var4++;
                continue L1;
              } else {
                var3[10 * var4 - -var6] = var5_array[var6];
                var6++;
                continue L4;
              }
            }
          }
        }
    }

    private final boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (((jfa) this).field_t) {
            break L0;
          } else {
            this.c(-1681546622);
            break L0;
          }
        }
        L1: {
          if (!((jfa) this).field_t) {
            break L1;
          } else {
            if (null != ((jfa) this).field_o) {
              break L1;
            } else {
              ((jfa) this).field_o = new lga((jfa) this);
              ((jfa) this).field_o.a((byte) 86);
              ((jfa) this).field_o.a(8);
              return false;
            }
          }
        }
        L2: {
          if (((jfa) this).field_o == null) {
            break L2;
          } else {
            if (!((jfa) this).field_o.field_e.e(12917)) {
              ((jfa) this).field_o.b((byte) 82);
              return true;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((jfa) this).field_o == null) {
            break L3;
          } else {
            L4: {
              if (((jfa) this).field_o == null) {
                break L4;
              } else {
                if (!((jfa) this).field_o.field_e.e(12917)) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (param0 == -4) {
                break L5;
              } else {
                int discarded$1 = jfa.a(false, 33);
                break L5;
              }
            }
            return false;
          }
        }
        L6: {
          ((jfa) this).field_t = false;
          if (((jfa) this).field_o == null) {
            break L6;
          } else {
            if (!((jfa) this).field_o.field_e.e(12917)) {
              break L6;
            } else {
              if (null == ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f) {
                break L6;
              } else {
                if (!((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f.field_a) {
                  break L6;
                } else {
                  if (((jfa) this).field_g.a((byte) 77, ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f.field_d, dm.field_f)) {
                    ((jfa) this).field_i.a((bw) (Object) new vma((jfa) this, ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f), true);
                    ((jfa) this).field_i.a((bw) (Object) new vu((jfa) this, true), true);
                    ((jfa) this).field_y = -1;
                    jba.a(((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f, (jfa) this, 89);
                    ((jfa) this).field_v = ((jfa) this).field_g.e((byte) -108);
                    ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_f.field_a = false;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
        }
        L7: {
          ((jfa) this).field_z = -1;
          ((jfa) this).field_x = -1;
          ((jfa) this).field_o = null;
          var2 = kla.a(1500, ((jfa) this).field_r, param0 ^ 2147483644);
          if (-1 + ((jfa) this).field_m[0].length <= ((jfa) this).field_l) {
            break L7;
          } else {
            if (((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_e != 0) {
              break L7;
            } else {
              L8: {
                if (((jfa) this).field_l >= -1 + ((jfa) this).field_m[0].length) {
                  break L8;
                } else {
                  ((jfa) this).field_i.a((bw) (Object) new laa((jfa) this, 39), true);
                  if (0 == ((jfa) this).field_m[((jfa) this).field_u][1 + ((jfa) this).field_l].field_e) {
                    break L8;
                  } else {
                    ((jfa) this).field_i.a((bw) (Object) new ni((jfa) this), true);
                    break L8;
                  }
                }
              }
              return true;
            }
          }
        }
        L9: {
          if (((jfa) this).field_m[0].length - 1 <= ((jfa) this).field_l) {
            break L9;
          } else {
            if ((((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_e ^ -1) != -3) {
              break L9;
            } else {
              if (var2 >= 200) {
                break L9;
              } else {
                L10: {
                  if (((jfa) this).field_l >= -1 + ((jfa) this).field_m[0].length) {
                    break L10;
                  } else {
                    ((jfa) this).field_i.a((bw) (Object) new laa((jfa) this, 39), true);
                    break L10;
                  }
                }
                L11: {
                  if (0 == ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l - -1].field_e) {
                    break L11;
                  } else {
                    ((jfa) this).field_i.a((bw) (Object) new ni((jfa) this), true);
                    break L11;
                  }
                }
                return true;
              }
            }
          }
        }
        L12: {
          if (-4 != ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_e) {
            break L12;
          } else {
            if (-301 > var2) {
              L13: {
                if (var2 < 250) {
                  if (-3 <= ((jfa) this).field_l) {
                    break L13;
                  } else {
                    if (-4 != ((jfa) this).field_m[((jfa) this).field_u][-1 + ((jfa) this).field_l].field_e) {
                      break L13;
                    } else {
                      ((jfa) this).field_i.a((bw) (Object) new qd((jfa) this, -78), true);
                      break L13;
                    }
                  }
                } else {
                  if (((jfa) this).field_l >= ((jfa) this).field_m[0].length - 2) {
                    break L13;
                  } else {
                    if (3 == ((jfa) this).field_m[((jfa) this).field_u][1 + ((jfa) this).field_l].field_e) {
                      ((jfa) this).field_i.a((bw) (Object) new qd((jfa) this, 78), true);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              return true;
            } else {
              break L12;
            }
          }
        }
        L14: {
          if ((((jfa) this).field_u ^ -1) >= -1) {
            break L14;
          } else {
            if (var2 >= 550) {
              break L14;
            } else {
              L15: {
                if (0 == ((jfa) this).field_m[((jfa) this).field_u - 1][((jfa) this).field_l].field_e) {
                  break L15;
                } else {
                  ((jfa) this).field_i.a((bw) (Object) new aja((jfa) this, -56), true);
                  break L15;
                }
              }
              return true;
            }
          }
        }
        L16: {
          if (((jfa) this).field_u >= -1 + ((jfa) this).field_m.length) {
            break L16;
          } else {
            if (800 > var2) {
              L17: {
                if (0 == ((jfa) this).field_m[((jfa) this).field_u - -1][((jfa) this).field_l].field_e) {
                  break L17;
                } else {
                  ((jfa) this).field_i.a((bw) (Object) new aja((jfa) this, 56), true);
                  break L17;
                }
              }
              return true;
            } else {
              break L16;
            }
          }
        }
        if (var2 >= 1200) {
          L18: {
            this.a(102);
            if (0 != (((jfa) this).field_g.field_f ^ -1)) {
              ((jfa) this).field_i.a((bw) (Object) new vu((jfa) this, false), true);
              break L18;
            } else {
              break L18;
            }
          }
          return false;
        } else {
          L19: {
            if (-1001 < (var2 ^ -1)) {
              ((jfa) this).field_i.a((bw) (Object) new ia((jfa) this), true);
              break L19;
            } else {
              ((jfa) this).field_i.a((bw) (Object) new uc((jfa) this), true);
              break L19;
            }
          }
          L20: {
            if ((var2 ^ -1) <= -1021) {
              break L20;
            } else {
              ((jfa) this).field_y = this.b(124);
              break L20;
            }
          }
          if (((jfa) this).field_g.field_f != -1) {
            ((jfa) this).field_i.a((bw) (Object) new vu((jfa) this, false), true);
            return true;
          } else {
            return true;
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = 4;
        var3 = 0;
        var4 = -3;
        L0: while (true) {
          if ((var4 ^ -1) < -4) {
            L1: {
              if (param0 == -1681546622) {
                break L1;
              } else {
                ((jfa) this).field_h = 12;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var3 == 0) {
                  break L3;
                } else {
                  if (0 != ((jfa) this).field_m[((jfa) this).field_u][((jfa) this).field_l].field_e) {
                    break L2;
                  } else {
                    if (((jfa) this).field_l >= -2 + ((jfa) this).field_m[0].length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ((jfa) this).field_t = false;
              ((jfa) this).field_z = -1;
              ((jfa) this).field_x = -1;
              break L2;
            }
            return;
          } else {
            var5 = -Math.abs(var4) + 3;
            var6 = -var5;
            L4: while (true) {
              if (var6 > var5) {
                var4++;
                continue L0;
              } else {
                if ((var4 + ((jfa) this).field_u ^ -1) <= -1) {
                  if (-1 + ((jfa) this).field_m.length >= var4 + ((jfa) this).field_u) {
                    if (((jfa) this).field_l + var6 >= 0) {
                      if (((jfa) this).field_m[0].length - 1 >= ((jfa) this).field_l - -var6) {
                        if (((jfa) this).field_m[var4 + ((jfa) this).field_u][((jfa) this).field_l + var6].field_f != null) {
                          if (((jfa) this).field_m[var4 + ((jfa) this).field_u][((jfa) this).field_l - -var6].field_f.field_a) {
                            if (Math.abs(var4) - -Math.abs(var6) < var2) {
                              L5: {
                                if (0 != (((jfa) this).field_g.field_o.a(((jfa) this).field_m[((jfa) this).field_u - -var4][((jfa) this).field_l - -var6].field_f.field_d, 0, ((jfa) this).field_g.field_g) ^ -1)) {
                                  break L5;
                                } else {
                                  if (-1 != ((jfa) this).field_g.field_o.a(119, ((jfa) this).field_m[((jfa) this).field_u + var4][var6 + ((jfa) this).field_l].field_f.field_d, ((jfa) this).field_g.field_g)) {
                                    break L5;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                              var2 = Math.abs(var4) - -Math.abs(var6);
                              var3 = 1;
                              ((jfa) this).field_x = var4 + ((jfa) this).field_u;
                              ((jfa) this).field_z = ((jfa) this).field_l + var6;
                              ((jfa) this).field_t = true;
                              var6++;
                              continue L4;
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    } else {
                      var6++;
                      continue L4;
                    }
                  } else {
                    var6++;
                    continue L4;
                  }
                } else {
                  var6++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    private final void a(int param0) {
        ((jfa) this).field_t = true;
        ((jfa) this).field_x = kla.a(6, ((jfa) this).field_r, -2147483648);
        ((jfa) this).field_z = kla.a(10, ((jfa) this).field_r, -2147483648);
        if (!(((jfa) this).field_m[((jfa) this).field_x][((jfa) this).field_z].field_e != 3)) {
            ((jfa) this).field_t = false;
            ((jfa) this).field_z = -1;
            ((jfa) this).field_x = -1;
        }
        int var2 = 115 % ((param0 - 22) / 59);
    }

    final static int e(int param0) {
        if (param0 >= -39) {
            field_f = null;
        }
        return tf.field_n;
    }

    final int b(boolean param0) {
        if (!param0) {
            ((jfa) this).field_o = null;
        }
        return 84 - -(((jfa) this).field_l * 39);
    }

    final void g(int param0) {
        ((jfa) this).field_i = new eaa();
        ((jfa) this).field_o = null;
        ((jfa) this).field_x = -1;
        ((jfa) this).field_z = -1;
        ((jfa) this).field_t = false;
        if (param0 != 0) {
            ((jfa) this).field_m = null;
        }
    }

    final static int a(boolean param0, int param1) {
        String var2 = lka.field_E[param1][18];
        String var2_ref = var2.trim();
        if (param0) {
            int discarded$0 = jfa.a(true, -76);
        }
        var2_ref = var2_ref.toLowerCase();
        if (!(!var2_ref.equals((Object) (Object) ""))) {
            return -1;
        }
        return ((ji) (Object) eu.field_b.a(true, (long)var2_ref.hashCode())).field_h;
    }

    final void a(byte param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        vu var6 = null;
        vu var7 = null;
        var5 = BachelorFridge.field_y;
        if (param0 > 39) {
          L0: {
            if (((jfa) this).field_g.field_f != -1) {
              ((jfa) this).field_j.e(15 + ((jfa) this).field_n + param1, -13 + ((jfa) this).field_k, 39, 48, 128);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            ((jfa) this).field_v.a(((jfa) this).field_s, false, ((jfa) this).field_p >> 1850044225, ((jfa) this).field_h >> -977625247, 0, -15, 256, ((jfa) this).field_n - -param1, ((jfa) this).field_k - 33);
            if (((jfa) this).field_y == 0) {
              break L1;
            } else {
              if (0 != ((jfa) this).field_g.field_f) {
                break L1;
              } else {
                bna.field_v.e(param1 + ((jfa) this).field_n + 10, ((jfa) this).field_k - 44);
                mq.field_b[((jfa) this).field_y].e(((jfa) this).field_n - -23 + param1, ((jfa) this).field_k - 38);
                break L1;
              }
            }
          }
          L2: {
            if (!(((jfa) this).field_i.b((byte) 90) instanceof vu)) {
              break L2;
            } else {
              var6 = (vu) (Object) ((jfa) this).field_i.b((byte) 90);
              var7 = var6;
              var4 = 0;
              L3: while (true) {
                if (var4 >= var7.field_m.length) {
                  break L2;
                } else {
                  if (-1 <= (var6.field_m[var4][2] ^ -1)) {
                    return;
                  } else {
                    iq.field_l.c(param1 + (30 + -var6.field_m[var4][0]) + ((jfa) this).field_n, -var6.field_m[var4][1] + ((jfa) this).field_k, var6.field_m[var4][3], var6.field_m[var4][3]);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    jfa(rk param0, int param1, int param2, wda[][] param3) {
        ((jfa) this).field_x = -1;
        ((jfa) this).field_p = 2048;
        ((jfa) this).field_h = 2048;
        ((jfa) this).field_y = -1;
        ((jfa) this).field_z = -1;
        ((jfa) this).field_l = param2;
        ((jfa) this).field_g = param0;
        ((jfa) this).field_u = param1;
        ((jfa) this).field_n = ((jfa) this).c((byte) -120);
        ((jfa) this).field_k = ((jfa) this).b(true);
        ((jfa) this).field_m = param3;
        ((jfa) this).field_v = ((jfa) this).field_g.e((byte) -127);
        ((jfa) this).field_i = new eaa();
        ((jfa) this).field_r = new Random();
        ((jfa) this).field_j = new kv(39, 39);
        int[] var5 = new int[256];
        int[] var8 = a.a(0, 256, 16763049, 4552212);
        int[] var7 = var8;
        int[] var6 = var7;
        var5 = var6;
        ((jfa) this).field_j.b();
        dg.a(320, 320, 304, 255, var8);
        hga.field_U.a((byte) -53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new qc[9];
    }
}
