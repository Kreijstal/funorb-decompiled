/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ara implements ntb {
    private int field_n;
    private int field_j;
    static String field_r;
    static int field_q;
    private int field_i;
    int field_o;
    private int field_l;
    static String[] field_k;
    private int field_p;
    private int field_m;

    final int a(ml param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        var3 = 2147483647;
        if (param1 == 3) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0.field_g.length) {
              return var3;
            } else {
              L1: {
                var5 = param0.field_g[var4];
                var6 = param0.field_g[var4 - -1];
                var7 = param0.field_g[(2 + var4) % param0.field_g.length];
                var8 = param0.field_g[(var4 - -3) % param0.field_g.length];
                if (var7 <= var5) {
                  // wide iinc 5 512
                  // wide iinc 7 -512
                  break L1;
                } else {
                  // wide iinc 5 -512
                  // wide iinc 7 512
                  break L1;
                }
              }
              L2: {
                if (var8 > var6) {
                  // wide iinc 6 -512
                  // wide iinc 8 512
                  break L2;
                } else {
                  // wide iinc 8 -512
                  // wide iinc 6 512
                  break L2;
                }
              }
              var9 = ng.a(8, -((tj) this).field_h + ((tj) this).field_e, (byte) 89, -((tj) this).field_f + ((tj) this).field_d, var7, ((tj) this).field_d, var6, var5, var8, ((tj) this).field_e);
              if (0 != (var9 ^ -1)) {
                if (var9 < var3) {
                  var3 = var9;
                  var4 += 2;
                  continue L0;
                } else {
                  var4 += 2;
                  continue L0;
                }
              } else {
                var4 += 2;
                continue L0;
              }
            }
          }
        } else {
          return 88;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -94) {
            Object var4 = null;
            ((tj) this).a((byte) 43, (pe) null);
        }
        ((tj) this).field_l = param0;
    }

    public static void g(int param0) {
        field_r = null;
        int var1 = -35 % ((param0 - -84) / 39);
        field_k = null;
    }

    final int c(byte param0) {
        if (param0 <= 36) {
            return 21;
        }
        return ((tj) this).field_j;
    }

    final void a(byte param0, pe param1) {
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        anb var15 = null;
        anb var16 = null;
        L0: {
          var14 = VoidHunters.field_G;
          if (param0 == 93) {
            break L0;
          } else {
            ((tj) this).field_j = -51;
            break L0;
          }
        }
        L1: {
          L2: {
            ((tj) this).field_o = ((tj) this).field_o - 1;
            if (-1 < (((tj) this).field_o ^ -1)) {
              ((tj) this).b(param0 ^ -3929);
              if ((((tj) this).field_m ^ -1) == -7) {
                param1.a(0, gib.field_a, ((tj) this).field_p, ((tj) this).field_n, false, ((tj) this).field_d, ((tj) this).field_e);
                break L2;
              } else {
                break L2;
              }
            } else {
              if (3 == ((tj) this).field_m) {
                break L2;
              } else {
                if (((tj) this).field_m != 5) {
                  param1.a(10, ((tj) this).field_e, ((tj) this).field_d, 0, 11184895, 1, 5);
                  if ((((tj) this).field_m ^ -1) != -2) {
                    if (((tj) this).field_m == 6) {
                      L3: {
                        var3 = null;
                        if (-1 < (((tj) this).field_l ^ -1)) {
                          var16 = param1.a(true, ((tj) this).field_e, ((tj) this).field_d, ((tj) this).field_p);
                          if (var16 == null) {
                            break L3;
                          } else {
                            L4: {
                              var4 = 0;
                              var5 = -((tj) this).field_d + var16.field_d;
                              var6 = var16.field_e + -((tj) this).field_e;
                              if (ar.a(var5, (byte) 111, var6) < cab.field_p / 2) {
                                if (!param1.a(var16, param0 ^ 39)) {
                                  var4 = 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            if (var4 == 0) {
                              var3 = null;
                              break L3;
                            } else {
                              ((tj) this).field_l = var16.field_l;
                              break L3;
                            }
                          }
                        } else {
                          L5: {
                            var15 = param1.d((byte) -27, ((tj) this).field_l);
                            if (var15 == null) {
                              break L5;
                            } else {
                              if (param1.a(var15, -76)) {
                                break L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                          ((tj) this).field_l = -1;
                          break L3;
                        }
                      }
                      L6: {
                        if (var3 != null) {
                          var4 = ((anb) var3).field_k.field_r;
                          var5 = ((anb) var3).field_k.field_n;
                          break L6;
                        } else {
                          var4 = ((tj) this).field_d + (iea.field_d * fc.a(((tj) this).field_i, (byte) 28) >> -1278657432);
                          var5 = ((tj) this).field_e + (iea.field_d * eu.a(((tj) this).field_i, 70) >> 559906504);
                          break L6;
                        }
                      }
                      var6 = var4 + -((tj) this).field_d >> 747133094;
                      var7 = var5 - ((tj) this).field_e >> -402247130;
                      var8 = ar.a(var6, (byte) 120, var7);
                      if ((var8 ^ -1) < -1) {
                        var6 = var6 * la.field_k / var8;
                        var7 = var7 * la.field_k / var8;
                        var9 = var6 - ((tj) this).field_f;
                        var10 = -((tj) this).field_h + var7;
                        var11 = ar.a(var9, (byte) 111, var10);
                        if (0 < var11) {
                          var12 = var9 * iea.field_d / var11;
                          ((tj) this).field_f = ((tj) this).field_f + var12;
                          var13 = var10 * iea.field_d / var11;
                          ((tj) this).field_h = ((tj) this).field_h + var13;
                          break L2;
                        } else {
                          ((tj) this).field_e = ((tj) this).field_e + ((tj) this).field_h;
                          ((tj) this).field_d = ((tj) this).field_d + ((tj) this).field_f;
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    ((tj) this).field_f = ((tj) this).field_f + (np.field_o * fc.a(((tj) this).field_i, (byte) 89) >> 1945337136);
                    ((tj) this).field_h = ((tj) this).field_h + (np.field_o * eu.a(((tj) this).field_i, 96) >> 1141720400);
                    var3_int = 128;
                    param1.a(20, ((tj) this).field_e, ((tj) this).field_d, var3_int, param0 + 11184802, 1, 10);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          ((tj) this).field_e = ((tj) this).field_e + ((tj) this).field_h;
          ((tj) this).field_d = ((tj) this).field_d + ((tj) this).field_f;
          break L1;
        }
    }

    final void b(int param0, byte param1) {
        ((tj) this).field_n = param0;
        if (param1 != 47) {
            ((tj) this).field_o = -66;
        }
    }

    final void a(int param0, lta param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var3 = param1.a(((tj) this).field_d, (byte) 127);
          var4 = param1.b(true, ((tj) this).field_e);
          if (param0 == ((tj) this).field_m) {
            var5 = param1.a(((tj) this).field_d - ((tj) this).field_f, (byte) 123);
            var6 = param1.b(true, -((tj) this).field_h + ((tj) this).field_e);
            c.a(var6, var5, var3, var4, -16777216, 16776977);
            break L0;
          } else {
            if (-5 != (((tj) this).field_m ^ -1)) {
              if ((((tj) this).field_m ^ -1) != -4) {
                if (2 == ((tj) this).field_m) {
                  ena.a(var4, param1.field_a * 400.0f, param0 + -106, var3, 65280);
                  break L0;
                } else {
                  if (((tj) this).field_m != 5) {
                    if (1 == ((tj) this).field_m) {
                      kq.a(2400.0f * param1.field_a, (byte) 96, var4, 65280, var3);
                      ena.a(var4, 1600.0f * param1.field_a, -110, var3, 65280);
                      break L0;
                    } else {
                      if (6 == ((tj) this).field_m) {
                        kq.a(1200.0f * param1.field_a, (byte) 80, var4, 16776960, var3);
                        if ((((tj) this).field_l ^ -1) > -1) {
                          var5 = cab.field_p / 2 >> -1899314136;
                          var6 = 0;
                          L1: while (true) {
                            if ((var6 ^ -1) <= -9) {
                              break L0;
                            } else {
                              var7 = (int)((float)(var5 * (fc.a(((tj) this).field_o + var6 << 1783446309, (byte) 33) >> 423143112)) * param1.field_a) + var3;
                              var8 = (int)((float)((eu.a(((tj) this).field_o + var6 << 402066693, 62) >> -1291582136) * var5) * param1.field_a) + var4;
                              hha.a(var3, (byte) 66, var7, var4, 65280, var8, 23);
                              var6++;
                              continue L1;
                            }
                          }
                        } else {
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    ena.a(var4, param1.field_a * 400.0f, -100, var3, 65280);
                    break L0;
                  }
                }
              } else {
                L2: {
                  var5 = param1.a(-((tj) this).field_f + ((tj) this).field_d, (byte) 112);
                  var6 = param1.b(true, ((tj) this).field_e - ((tj) this).field_h);
                  var7 = qpb.a(false, ((tj) this).field_p, 13894143);
                  var8 = 255 * ((tj) this).field_j / hrb.field_a;
                  kra.a(var7, 3, 16994, var4, var8 >> -1114096927, var3, var5, var6);
                  if (0 >= ((tj) this).field_i) {
                    break L2;
                  } else {
                    jj.a(var7, (byte) 7, var4, Math.max(3.0f, (float)var8 * (11.0f * param1.field_a)), var8 >> 762269377, var3);
                    jj.a(var7, (byte) 7, var4, Math.max(2.0f, 8.0f * param1.field_a * (float)var8), var8, var3);
                    break L2;
                  }
                }
                jj.a(var7, (byte) 7, var6, Math.max(2.0f, param1.field_a * 8.0f * (float)var8), var8 >> 502021857, var5);
                jj.a(var7, (byte) 7, var6, Math.max(1.0f, (float)var8 * (param1.field_a * 4.0f)), var8, var5);
                hha.a(var3, (byte) 66, var5, var4, var7, var6, var8);
                break L0;
              }
            } else {
              var5 = param1.a(-((tj) this).field_f + ((tj) this).field_d, (byte) 119);
              var6 = param1.b(true, ((tj) this).field_e - ((tj) this).field_h);
              c.a(var6, var5, var3, var4, param0 ^ -16777216, 16746632);
              break L0;
            }
          }
        }
    }

    final int b(boolean param0) {
        if (param0) {
            ((tj) this).field_i = -104;
        }
        return ((tj) this).field_n;
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -111);
        param0.a(-632, ((tj) this).field_i, 32);
        param0.a(-632, ((tj) this).field_o, 32);
        param0.a(-632, ((tj) this).field_p, 32);
        if (param1 > -109) {
            Object var4 = null;
            ((tj) this).a((faa) null, true);
        }
        param0.a(-632, ((tj) this).field_n, 32);
        param0.a(-632, ((tj) this).field_m, 32);
        param0.a(-632, ((tj) this).field_l, 32);
        param0.a(-632, ((tj) this).field_j, 32);
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((tj) this).field_i = param0.i(0, 32);
        ((tj) this).field_o = param0.i(0, 32);
        ((tj) this).field_p = param0.i(0, 32);
        if (param1) {
            field_r = null;
        }
        ((tj) this).field_n = param0.i(0, 32);
        ((tj) this).field_m = param0.i(0, 32);
        ((tj) this).field_l = param0.i(0, 32);
        ((tj) this).field_j = param0.i(0, 32);
    }

    final void a(int param0, int param1) {
        int var3 = -117 % ((param0 - 63) / 42);
        ((tj) this).field_p = param1;
    }

    final static boolean f(byte param0) {
        if (param0 != -21) {
            field_r = null;
        }
        return tla.field_c;
    }

    final int d(byte param0) {
        if (param0 != -119) {
            return 84;
        }
        return ((tj) this).field_l;
    }

    final void a(int param0, int param1, int param2) {
        ((tj) this).field_e = ((tj) this).field_e - ((tj) this).field_h;
        ((tj) this).field_d = ((tj) this).field_d - ((tj) this).field_f;
        int var4 = -((tj) this).field_d + param1;
        if (param2 <= 87) {
            int discarded$0 = ((tj) this).d((byte) -40);
        }
        int var5 = -((tj) this).field_e + param0;
        ((tj) this).field_f = var4;
        ((tj) this).field_h = var5;
        ((tj) this).field_d = ((tj) this).field_d + ((tj) this).field_f;
        ((tj) this).field_e = ((tj) this).field_e + ((tj) this).field_h;
        ((tj) this).field_i = ((tj) this).field_i | 1;
    }

    public final void b(byte param0, tv param1) {
        tj var5 = (tj) (Object) param1;
        tj var6 = var5;
        super.b((byte) 103, param1);
        var6.field_o = var5.field_o;
        var6.field_p = var5.field_p;
        var6.field_l = var5.field_l;
        var6.field_i = var5.field_i;
        var6.field_j = var5.field_j;
        var6.field_m = var5.field_m;
        if (param0 <= 54) {
            ((tj) this).field_i = -107;
        }
        var6.field_n = var5.field_n;
    }

    final void b(int param0, int param1) {
        ((tj) this).field_j = param0;
        if (param1 <= 50) {
            field_r = null;
        }
    }

    final void f(int param0) {
        if (param0 != -24805) {
            return;
        }
        ((tj) this).field_i = ((tj) this).field_i | 1;
    }

    public final boolean a(byte param0, tv param1) {
        tj var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          L1: {
            var4 = -41 / ((param0 - 22) / 59);
            var3 = (tj) (Object) param1;
            if (super.a((byte) -121, param1)) {
              break L1;
            } else {
              if (var3.field_i != var3.field_i) {
                break L1;
              } else {
                if (var3.field_o != var3.field_o) {
                  break L1;
                } else {
                  if (var3.field_p != var3.field_p) {
                    break L1;
                  } else {
                    if (var3.field_n != var3.field_n) {
                      break L1;
                    } else {
                      if (var3.field_m != var3.field_m) {
                        break L1;
                      } else {
                        if (var3.field_l != var3.field_l) {
                          break L1;
                        } else {
                          if (var3.field_j == var3.field_j) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
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
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L0;
        }
        return stackIn_11_0 != 0;
    }

    final int e(int param0) {
        if (param0 != 512) {
            ((tj) this).field_p = -93;
        }
        return ((tj) this).field_p;
    }

    final int d(int param0) {
        if (param0 <= 100) {
            field_r = null;
        }
        return ((tj) this).field_d;
    }

    final void a(int param0, ml param1, sfa param2) {
        if (((tj) this).field_m != 3) {
            if (!((((tj) this).field_m ^ -1) == -5)) {
                if (fra.a(param1.field_g, ((tj) this).field_e, 2, ((tj) this).field_d)) {
                    param2.a(((tj) this).field_e, param1, (tj) this, (byte) 61, ((tj) this).field_d);
                }
                return;
            }
        }
        if (param0 != 24158) {
            field_k = null;
        }
        int var4 = ((tj) this).a(param1, 3);
        ((tj) this).a(false, param2, param1, var4);
    }

    final int e(byte param0) {
        if (param0 != -107) {
            int discarded$0 = ((tj) this).e((byte) -9);
        }
        return ((tj) this).field_e;
    }

    final int g(byte param0) {
        if (param0 != -104) {
            field_k = null;
        }
        return ((tj) this).field_m;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        tj var5 = null;
        L0: {
          var5 = (tj) (Object) param0;
          super.a(param0, -106);
          var4 = 0;
          if (var5.field_i != var5.field_i) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.field_i + ", now=" + var5.field_i);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_o == var5.field_o) {
            break L1;
          } else {
            var4 = 1;
            System.out.println("int life has changed. before=" + var5.field_o + ", now=" + var5.field_o);
            break L1;
          }
        }
        L2: {
          if (var5.field_p != var5.field_p) {
            System.out.println("int fired_team has changed. before=" + var5.field_p + ", now=" + var5.field_p);
            var4 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var5.field_n == var5.field_n) {
            break L3;
          } else {
            System.out.println("int fired_player has changed. before=" + var5.field_n + ", now=" + var5.field_n);
            var4 = 1;
            break L3;
          }
        }
        L4: {
          if (var5.field_m != var5.field_m) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.field_m + ", now=" + var5.field_m);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 < -19) {
            break L5;
          } else {
            ((tj) this).field_l = -123;
            break L5;
          }
        }
        L6: {
          if (var5.field_l != var5.field_l) {
            System.out.println("int target_body has changed. before=" + var5.field_l + ", now=" + var5.field_l);
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (var5.field_j != var5.field_j) {
            var4 = 1;
            System.out.println("int damage has changed. before=" + var5.field_j + ", now=" + var5.field_j);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (var4 != 0) {
            System.out.println("This instance of Projectile has changed");
            break L8;
          } else {
            break L8;
          }
        }
    }

    final boolean c(int param0) {
        if (!(-4 != (((tj) this).field_m ^ -1))) {
            return true;
        }
        if (param0 < 82) {
            ((tj) this).field_i = 82;
            return false;
        }
        return false;
    }

    tj() {
    }

    tj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((tj) this).field_d = param0;
        ((tj) this).field_n = param7;
        ((tj) this).field_e = param1;
        ((tj) this).field_j = 5;
        ((tj) this).field_o = param5;
        ((tj) this).field_h = param3;
        ((tj) this).field_f = param2;
        ((tj) this).field_l = -1;
        ((tj) this).field_i = param4;
        ((tj) this).field_m = param8;
        ((tj) this).field_p = param6;
        ((tj) this).field_j = param9;
        if (-2 == (fra.field_a ^ -1)) {
            ((tj) this).field_j = ((tj) this).field_j * ed.field_o;
        }
    }

    final void a(boolean param0, sfa param1, ml param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if ((param3 ^ -1) > -2147483648) {
            var5 = (param3 * ((tj) this).field_f >> -1356091928) + (-((tj) this).field_f + ((tj) this).field_d);
            var6 = (((tj) this).field_h * param3 >> -272284216) + -((tj) this).field_h + ((tj) this).field_e;
            param1.a(var6, param2, (tj) this, (byte) 61, var5);
        }
        if (param0) {
            ((tj) this).field_n = 12;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
        field_q = 16384;
    }
}
