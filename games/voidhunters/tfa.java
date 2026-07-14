/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tfa extends bha implements ntb {
    int field_j;
    int field_n;
    int[] field_k;
    int field_h;
    int field_e;
    int field_b;
    int field_f;
    int field_l;
    int field_m;
    sg field_g;
    int[] field_i;
    int field_c;
    int field_d;

    public final boolean a(byte param0, tv param1) {
        int var4 = 0;
        tfa var5 = null;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          L1: {
            var4 = 2 / ((param0 - 22) / 59);
            var5 = (tfa) (Object) param1;
            if (super.a((byte) -38, param1)) {
              break L1;
            } else {
              if (var5.field_f != var5.field_f) {
                break L1;
              } else {
                if (var5.field_d != var5.field_d) {
                  break L1;
                } else {
                  if (var5.field_e != var5.field_e) {
                    break L1;
                  } else {
                    if (var5.field_b != var5.field_b) {
                      break L1;
                    } else {
                      if (var5.field_m != var5.field_m) {
                        break L1;
                      } else {
                        if (var5.field_h != var5.field_h) {
                          break L1;
                        } else {
                          if (wpb.a(var5.field_i, var5.field_i, (byte) 28)) {
                            break L1;
                          } else {
                            sg discarded$2 = var5.field_g;
                            L2: {
                              if (null == var5.field_g) {
                                break L2;
                              } else {
                                if (var5.field_g.a((byte) -125, (tv) (Object) var5.field_g)) {
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            if (wpb.a(var5.field_k, var5.field_k, (byte) 28)) {
                              break L1;
                            } else {
                              if (var5.field_c != var5.field_c) {
                                break L1;
                              } else {
                                if (var5.field_n != var5.field_n) {
                                  break L1;
                                } else {
                                  if (var5.field_l != var5.field_l) {
                                    break L1;
                                  } else {
                                    if (var5.field_j == var5.field_j) {
                                      stackOut_20_0 = 0;
                                      stackIn_21_0 = stackOut_20_0;
                                      break L0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_19_0 = 1;
          stackIn_21_0 = stackOut_19_0;
          break L0;
        }
        return stackIn_21_0 != 0;
    }

    final void c(byte param0) {
        if ((((tfa) this).field_j ^ -1) < -1) {
            ((tfa) this).field_j = ((tfa) this).field_j - 1;
        }
        if (param0 != 11) {
            Object var3 = null;
            ((tfa) this).a((tv) null, -82);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (null != ((tfa) this).field_i) {
          var4 = 0;
          var5 = 0;
          if (param1 == 11863) {
            L0: while (true) {
              if (var5 >= ((tfa) this).field_i.length) {
                return var4;
              } else {
                var6 = ((tfa) this).field_i[var5];
                if (var6 >= param0) {
                  if (param2 >= var6) {
                    var4++;
                    var5++;
                    continue L0;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return -83;
          }
        } else {
          return 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var13 = VoidHunters.field_G;
        if (0 > param1) {
          if (((tfa) this).a(param3, 11863, param0) == param4) {
            return;
          } else {
            ((tfa) this).field_i = qi.a(param1, true, ((tfa) this).field_i, (byte) -14);
            return;
          }
        } else {
          L0: {
            ((tfa) this).field_i = kdb.a(((tfa) this).field_i, param1, (byte) -99);
            var6 = ((tfa) this).a(param3, param2 + -18161, param0);
            if (param4 < var6) {
              var7 = var6 + -param4;
              var17 = new int[((tfa) this).field_i.length + -var7];
              var16 = var17;
              var15 = var16;
              var14 = var15;
              var8 = var14;
              var9 = 0;
              var10 = 0;
              var11 = 0;
              L1: while (true) {
                L2: {
                  if (var11 >= ((tfa) this).field_i.length) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var12 = ((tfa) this).field_i[var11];
                        if (var12 < param3) {
                          break L4;
                        } else {
                          if (param0 < var12) {
                            break L4;
                          } else {
                            if (var12 != param1) {
                              if (var9 < var7) {
                                var9++;
                                break L3;
                              } else {
                                var10++;
                                var8[var10] = var12;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var10++;
                      var8[var10] = var12;
                      break L3;
                    }
                    var17 = var16;
                    if (var17.length <= var10) {
                      break L2;
                    } else {
                      var11++;
                      continue L1;
                    }
                  }
                }
                ((tfa) this).field_i = var8;
                break L0;
              }
            } else {
              break L0;
            }
          }
          L5: {
            if (param2 == 30024) {
              break L5;
            } else {
              ((tfa) this).field_n = -99;
              break L5;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        ((tfa) this).field_j = param0;
        ((tfa) this).field_h = sja.field_c;
    }

    final void a(boolean param0, tja param1, int param2, int param3) {
        rsb var5 = (rsb) (Object) param1;
        rha var6 = new rha(2, param3, param3);
        var5.field_d.a(var6, param0);
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        tfa var5 = null;
        L0: {
          super.a(param0, -44);
          var5 = (tfa) (Object) param0;
          if (var5.field_g == null) {
            break L0;
          } else {
            if (var5.field_g != null) {
              var5.field_g.a((tv) (Object) var5.field_g, -122);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var4 = 0;
          if (var5.field_f != var5.field_f) {
            System.out.println("int triggers has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            var4 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var5.field_d == var5.field_d) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int aimtargetx has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L2;
          }
        }
        L3: {
          if (var5.field_e == var5.field_e) {
            break L3;
          } else {
            var4 = 1;
            System.out.println("int aimtargety has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            break L3;
          }
        }
        L4: {
          if (var5.field_b == var5.field_b) {
            break L4;
          } else {
            var4 = 1;
            System.out.println("int specialorder has changed. before=" + var5.field_b + ", now=" + var5.field_b);
            break L4;
          }
        }
        L5: {
          if (var5.field_m != var5.field_m) {
            var4 = 1;
            System.out.println("int spawn_choice has changed. before=" + var5.field_m + ", now=" + var5.field_m);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var5.field_h == var5.field_h) {
            break L6;
          } else {
            System.out.println("int selected_team has changed. before=" + var5.field_h + ", now=" + var5.field_h);
            var4 = 1;
            break L6;
          }
        }
        L7: {
          if (!ikb.a(var5.field_i, var5.field_i, false)) {
            break L7;
          } else {
            System.out.println("int[] votes has changed. ");
            var4 = 1;
            break L7;
          }
        }
        sg discarded$1 = var5.field_g;
        L8: {
          if (null == var5.field_g) {
            break L8;
          } else {
            if (!var5.field_g.a((byte) 92, (tv) (Object) var5.field_g)) {
              break L8;
            } else {
              var4 = 1;
              System.out.println("Ship saved_ship has changed. before=" + var5.field_g + ", now=" + var5.field_g);
              break L8;
            }
          }
        }
        L9: {
          if (ikb.a(var5.field_k, var5.field_k, false)) {
            var4 = 1;
            System.out.println("int[] carried_over_components has changed. ");
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (var5.field_c != var5.field_c) {
            var4 = 1;
            System.out.println("int kills has changed. before=" + var5.field_c + ", now=" + var5.field_c);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (var5.field_n == var5.field_n) {
            break L11;
          } else {
            var4 = 1;
            System.out.println("int assists has changed. before=" + var5.field_n + ", now=" + var5.field_n);
            break L11;
          }
        }
        L12: {
          if (var5.field_l != var5.field_l) {
            System.out.println("int deaths has changed. before=" + var5.field_l + ", now=" + var5.field_l);
            var4 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (var5.field_j == var5.field_j) {
            break L13;
          } else {
            System.out.println("int unassigned_for_autobalance_timer has changed. before=" + var5.field_j + ", now=" + var5.field_j);
            var4 = 1;
            break L13;
          }
        }
        if (param1 >= -19) {
          L14: {
            ((tfa) this).field_b = 45;
            if (var4 != 0) {
              System.out.println("This instance of MyCarouselPlayerInfo has changed");
              break L14;
            } else {
              break L14;
            }
          }
          return;
        } else {
          L15: {
            if (var4 != 0) {
              System.out.println("This instance of MyCarouselPlayerInfo has changed");
              break L15;
            } else {
              break L15;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (((tfa) this).field_i == null) {
          return;
        } else {
          var3 = -1;
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (var4_int >= ((tfa) this).field_i.length) {
                break L1;
              } else {
                if (((tfa) this).field_i[var4_int] == param0) {
                  var3 = var4_int;
                  break L1;
                } else {
                  var4_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param1 < -10) {
                break L2;
              } else {
                ((tfa) this).a(-58, (byte) 29);
                break L2;
              }
            }
            L3: {
              if (0 == (var3 ^ -1)) {
                break L3;
              } else {
                if (1 < ((tfa) this).field_i.length) {
                  var4 = new int[-1 + ((tfa) this).field_i.length];
                  var5 = 0;
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= ((tfa) this).field_i.length) {
                      ((tfa) this).field_i = var4;
                      break L3;
                    } else {
                      if (var6 != var3) {
                        var4[var5] = ((tfa) this).field_i[var6];
                        var5++;
                        var6++;
                        continue L4;
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((tfa) this).field_i = null;
                  break L3;
                }
              }
            }
            return;
          }
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, ((tfa) this).field_f, 4);
        param0.a(-632, ((tfa) this).field_d, 32);
        if (param1 >= -109) {
            ((tfa) this).b((byte) 107);
        }
        param0.a(-632, ((tfa) this).field_e, 32);
        param0.a(-632, 1 + ((tfa) this).field_b, 8);
        param0.a(-632, ((tfa) this).field_m, 4);
        param0.a(-632, 1 + ((tfa) this).field_h, 4);
        pgb.a(4, ((tfa) this).field_i == null ? 0 : ((tfa) this).field_i.length, 49, param0, ((tfa) this).field_i);
        if (!(vq.a(param0, 85, ((tfa) this).field_g == null ? true : false))) {
            ((tfa) this).field_g.b(param0, -114);
        }
        pgb.a(8, ((tfa) this).field_k != null ? ((tfa) this).field_k.length : 0, 63, param0, ((tfa) this).field_k);
        param0.a(-632, ((tfa) this).field_c, 16);
        param0.a(-632, ((tfa) this).field_n, 16);
        param0.a(-632, ((tfa) this).field_l, 16);
        param0.a(-632, ((tfa) this).field_j, 8);
    }

    public final void b(byte param0, tv param1) {
        tfa var4 = (tfa) (Object) param1;
        if (param0 <= 54) {
            return;
        }
        super.b((byte) 93, param1);
        var4.field_h = var4.field_h;
        var4.field_f = var4.field_f;
        var4.field_e = var4.field_e;
        var4.field_m = var4.field_m;
        var4.field_b = var4.field_b;
        var4.field_d = var4.field_d;
        var4.field_i = dob.a(var4.field_i, (byte) -108, var4.field_i);
        if (var4.field_g == null) {
            var4.field_g = null;
        } else {
            if (var4.field_g == null) {
                var4.field_g = new sg();
            }
            var4.field_g.b((byte) 93, (tv) (Object) var4.field_g);
        }
        var4.field_k = dob.a(var4.field_k, (byte) -66, var4.field_k);
        var4.field_n = var4.field_n;
        var4.field_j = var4.field_j;
        var4.field_c = var4.field_c;
        var4.field_l = var4.field_l;
    }

    final void b(byte param0) {
        if (param0 <= 124) {
            ((tfa) this).field_h = 69;
        }
        ((tfa) this).field_i = null;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((tfa) this).field_f = param0.i(0, 4);
        ((tfa) this).field_d = param0.i(0, 32);
        ((tfa) this).field_e = param0.i(0, 32);
        ((tfa) this).field_b = -1 + param0.i(0, 8);
        ((tfa) this).field_m = param0.i(0, 4);
        ((tfa) this).field_h = param0.i(0, 4) + -1;
        ((tfa) this).field_i = wkb.a((byte) 37, ((tfa) this).field_i, param0, 4);
        if (kv.a(param1, param0)) {
            if (((tfa) this).field_g == null) {
                ((tfa) this).field_g = new sg();
            }
            ((tfa) this).field_g.a(param0, false);
        } else {
            ((tfa) this).field_g = null;
        }
        ((tfa) this).field_k = wkb.a((byte) 37, ((tfa) this).field_k, param0, 8);
        ((tfa) this).field_c = param0.i(0, 16);
        ((tfa) this).field_n = param0.i(0, 16);
        ((tfa) this).field_l = param0.i(0, 16);
        ((tfa) this).field_j = param0.i(0, 8);
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 81 % ((param0 - 12) / 41);
            if (((tfa) this).field_a) {
              break L1;
            } else {
              if (foa.field_p != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void b(int param0) {
        ((tfa) this).field_l = 0;
        if (param0 != -1) {
            Object var3 = null;
            ((tfa) this).b((faa) null, 126);
        }
        ((tfa) this).field_n = 0;
        ((tfa) this).field_c = 0;
    }

    final void a(tja param0, int param1, int param2, int param3) {
        Random var8 = null;
        ((tfa) this).field_h = -1;
        rsb var10 = (rsb) (Object) param0;
        if (!var10.field_e.c((byte) 125)) {
            if (!qab.a(param2 + 24476, var10.field_g.d(false))) {
                ((tfa) this).field_h = param1;
            }
        }
        rha var6 = new rha(1, param1, param1);
        var10.field_d.a(var6, true);
        if (param2 != -24354) {
            Object var9 = null;
            ((tfa) this).a(false, (tja) null, -66, -35);
        }
        sg var7 = var10.field_g.d(param1, 92);
        if (!(var7 == null)) {
            ((tfa) this).field_h = var7.q((byte) 65);
            return;
        }
        if ((var10.field_e.e(8) ^ -1) == -6) {
            if (!(!qab.a(34, var10.field_g.d(false)))) {
                var8 = new Random((long)param3);
                var10.field_e.a(var8, 2196, var10);
            }
        }
        ((tfa) this).field_j = 0;
    }

    tfa() {
        ((tfa) this).field_b = -1;
        ((tfa) this).field_i = null;
        ((tfa) this).field_h = sja.field_c;
    }

    static {
    }
}
