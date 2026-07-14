/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aoa implements ntb {
    private anb field_a;
    private int field_d;
    private int field_b;
    private int field_e;
    static int[] field_c;
    private int field_f;

    private final int a(ml[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param2) {
            L1: {
              if (param1 <= -1) {
                break L1;
              } else {
                aoa.a(true);
                break L1;
              }
            }
            return var4 << -1632899805;
          } else {
            var6 = param0[var5];
            var7 = var6.field_c.field_c;
            if (!var6.k((byte) 86)) {
              if (2 != var7) {
                if (-9 != (var7 ^ -1)) {
                  if (9 != var7) {
                    if (var7 != 10) {
                      var8 = var6.field_c.a((byte) 24).j(118);
                      if (var8 > var4) {
                        var4 = var8;
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
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
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
    }

    final void a(sg param0, int param1, lta param2, pe param3) {
        int var5 = -5 / ((-71 - param1) / 50);
        c.a(param2.b(true, param0.field_e - -((aoa) this).field_d), param2.a(param0.field_d - -((aoa) this).field_e, (byte) 124), param2.a(param0.field_d, (byte) 127), param2.b(true, param0.field_e), -16777216, 16776960);
    }

    private final void a(int param0, sg param1, pe param2) {
        int var4 = 0;
        int var5 = 0;
        crb[] var6 = null;
        int var7 = 0;
        crb[] var8 = null;
        int var9 = 0;
        crb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        var4 = 0;
        var5 = param0;
        var6 = param2.a(true);
        var7 = param1.g(-101);
        var8 = var6;
        var9 = 0;
        L0: while (true) {
          if (var9 >= var8.length) {
            ((aoa) this).field_d = ((aoa) this).field_d + var5;
            ((aoa) this).field_e = ((aoa) this).field_e + var4;
            return;
          } else {
            var10 = var8[var9];
            if (var10 != null) {
              var11 = var10.g(-42) + var7 >> 2034632486;
              var12 = var10.field_d + -param1.field_d;
              var13 = var10.field_e - param1.field_e;
              var14 = ar.a(var12, (byte) 122, var13) >> -26321655;
              if (var14 <= var11 / 2) {
                L1: {
                  if ((var14 ^ -1) >= -1) {
                    var14 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var15 = ecb.a(-var13, (byte) -77, -var12);
                var4 = var4 + fc.a(var15, (byte) -106) * var11 / (var14 * var14);
                var5 = var5 + var11 * eu.a(var15, 40) / (var14 * var14);
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    public final void a(tv param0, int param1) {
        aoa var3 = (aoa) (Object) param0;
        int var4 = 0;
        if (var3.field_b != var3.field_b) {
            var4 = 1;
            System.out.println("int parent_player has changed. before=" + var3.field_b + ", now=" + var3.field_b);
        }
        if (param1 >= -19) {
            return;
        }
        if (var4 != 0) {
            System.out.println("This instance of ShipAI has changed");
        }
    }

    private final void a(boolean param0, int param1, sg param2, pe param3) {
        int var5 = 0;
        ((aoa) this).field_d = 0;
        if (param0) {
            field_c = null;
        }
        ((aoa) this).field_a = null;
        ((aoa) this).field_e = 0;
        ((aoa) this).field_f = 0;
        this.a(param3, (byte) -89, param2, param1);
        if (!(param2.g(param0))) {
            var5 = param2.field_k.l(-8913);
            if (var5 > 0) {
                this.a(0, param2, param3);
                this.a(param3, (byte) -103, param2);
            }
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ((aoa) this).a((sg) null, 11, (lta) null, (pe) null);
        }
        ((aoa) this).field_b = param0.i(0, 4);
    }

    public final boolean a(byte param0, tv param1) {
        aoa var3 = (aoa) (Object) param1;
        int var4 = -12 % ((param0 - 22) / 59);
        return var3.field_b != var3.field_b ? true : false;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final boolean a(sg param0, byte param1, pe param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ij var16_ref = null;
        int var17 = 0;
        Object var18_ref = null;
        int var18 = 0;
        tj var18_ref_tj = null;
        ml var19_ref_ml = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        L0: {
          var18_ref = null;
          var23 = VoidHunters.field_G;
          if (param1 == -73) {
            break L0;
          } else {
            var24 = null;
            ((aoa) this).b((byte) -82, (tv) null);
            break L0;
          }
        }
        L1: {
          var4 = param0.field_f;
          var5 = param0.field_h;
          var6 = param0.field_n;
          var7 = param0.field_k.b(127, 0);
          var8 = this.a(lcb.field_q, -18, var7);
          if (var8 <= cab.field_p) {
            break L1;
          } else {
            var8 = cab.field_p;
            break L1;
          }
        }
        L2: {
          if (!param0.g(false)) {
            break L2;
          } else {
            L3: {
              var9_ref = new Random((long)(param0.field_l * th.field_o));
              var10 = 1000;
              if (((aoa) this).field_a == null) {
                var10 = 4000;
                break L3;
              } else {
                break L3;
              }
            }
            if (-1 != (hob.a(var9_ref, var10, 125) ^ -1)) {
              break L2;
            } else {
              fnb.a(50, param0.field_e, param0.field_d, false, 94, 512);
              break L2;
            }
          }
        }
        L4: {
          this.a(false, var8, param0, param2);
          var9 = 0;
          var10 = 0;
          var11 = 0;
          if (((aoa) this).field_a != null) {
            L5: {
              var10 = ((aoa) this).field_a.field_k.field_r;
              var11 = ((aoa) this).field_a.field_k.field_n;
              var12 = -param0.field_d + var10;
              var13 = var11 + -param0.field_e;
              var14 = ar.a(var12, (byte) 109, var13);
              var15 = ecb.a(var13, (byte) -77, var12);
              if (16384 + var8 < var14) {
                if (0 == ((aoa) this).field_e) {
                  if (cab.field_p > var14) {
                    param0.a(-73, 2, param2, var11, var10);
                    param0.a(-126, 6, param2, var11, var10);
                    if (param0.n(31390)) {
                      break L5;
                    } else {
                      param0.a(param1 ^ 30, 3, param2, var11, var10);
                      break L5;
                    }
                  } else {
                    if (cab.field_p <= var14) {
                      break L5;
                    } else {
                      param0.a(-73, 2, param2, var11, var10);
                      param0.a(-126, 6, param2, var11, var10);
                      if (param0.n(31390)) {
                        break L5;
                      } else {
                        param0.a(param1 ^ 30, 3, param2, var11, var10);
                        break L5;
                      }
                    }
                  }
                } else {
                  if (cab.field_p <= var14) {
                    break L5;
                  } else {
                    param0.a(-73, 2, param2, var11, var10);
                    param0.a(-126, 6, param2, var11, var10);
                    if (param0.n(31390)) {
                      break L5;
                    } else {
                      param0.a(param1 ^ 30, 3, param2, var11, var10);
                      break L5;
                    }
                  }
                }
              } else {
                var16 = 0;
                var17 = 2147483647;
                var18 = 0;
                L6: while (true) {
                  if (var18 >= var7) {
                    L7: {
                      if (-2147483648 < (var17 ^ -1)) {
                        ((aoa) this).field_f = var16 << -1424292856;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (di.field_p == 0) {
                        int discarded$1 = param0.a(8, var11, var10);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var9 = var9 | 16;
                    if (cab.field_p <= var14) {
                      break L5;
                    } else {
                      param0.a(-73, 2, param2, var11, var10);
                      param0.a(-126, 6, param2, var11, var10);
                      if (param0.n(31390)) {
                        break L5;
                      } else {
                        param0.a(param1 ^ 30, 3, param2, var11, var10);
                        break L5;
                      }
                    }
                  } else {
                    var19_ref_ml = lcb.field_q[var18];
                    var20 = var19_ref_ml.field_c.field_c;
                    if (!var19_ref_ml.k((byte) 48)) {
                      if ((var20 ^ -1) != -3) {
                        if (var20 != 8) {
                          if (9 != var20) {
                            if (var20 != 10) {
                              if (var8 >> 859646691 <= var19_ref_ml.field_c.a((byte) 24).j(127)) {
                                var21 = var19_ref_ml.g((byte) -127);
                                var22 = rrb.a(param1 + 22506, var15 - var21);
                                if (var17 > Math.abs(var22)) {
                                  var17 = Math.abs(var22);
                                  var16 = var22;
                                  var18++;
                                  continue L6;
                                } else {
                                  var18++;
                                  continue L6;
                                }
                              } else {
                                var18++;
                                continue L6;
                              }
                            } else {
                              var18++;
                              continue L6;
                            }
                          } else {
                            var18++;
                            continue L6;
                          }
                        } else {
                          var18++;
                          continue L6;
                        }
                      } else {
                        var18++;
                        continue L6;
                      }
                    } else {
                      var18++;
                      continue L6;
                    }
                  }
                }
              }
            }
            if (!param0.field_k.b((byte) 70, 7)) {
              break L4;
            } else {
              var16_ref = param2.c(true);
              var17 = 0;
              var18_ref_tj = (tj) (Object) var16_ref.d(0);
              L9: while (true) {
                L10: {
                  if (var18_ref_tj == null) {
                    break L10;
                  } else {
                    L11: {
                      if (-7 != (var18_ref_tj.g((byte) -104) ^ -1)) {
                        break L11;
                      } else {
                        if (var18_ref_tj.d((byte) -119) == param0.field_l) {
                          var19 = var18_ref_tj.field_d - param0.field_d;
                          var20 = var18_ref_tj.field_e + -param0.field_e;
                          var21 = ar.a(var19, (byte) 115, var20);
                          if (var21 < bpa.field_a) {
                            var17 = 1;
                            break L10;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var18_ref_tj = (tj) (Object) var16_ref.a((byte) 55);
                    continue L9;
                  }
                }
                if (var17 != 0) {
                  param0.a(-111, 7, param2, var11, var10);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          } else {
            break L4;
          }
        }
        L12: {
          L13: {
            var12 = 1024;
            var13 = 1024;
            var14 = ((aoa) this).field_e - var4;
            var15 = -var5 + ((aoa) this).field_d;
            var16 = ((aoa) this).field_f - var6;
            if (var14 != 0) {
              break L13;
            } else {
              if (var15 != 0) {
                break L13;
              } else {
                if (var16 == -1) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
          }
          L14: {
            if (Math.abs(var16) > var12) {
              if (var16 <= 0) {
                if (-1 > var16) {
                  var9 = var9 | 4;
                  break L14;
                } else {
                  break L14;
                }
              } else {
                var9 = var9 | 8;
                break L14;
              }
            } else {
              break L14;
            }
          }
          L15: {
            if (var14 != -1) {
              break L15;
            } else {
              if (-1 != var15) {
                break L15;
              } else {
                break L12;
              }
            }
          }
          L16: {
            var17 = ecb.a(var15, (byte) -77, var14);
            var18 = param0.e(0);
            var19 = rrb.a(22433, var17 - var18);
            var20 = rrb.a(22433, -4096 - (var18 - var17));
            var21 = rrb.a(22433, 2048 - (var18 - var17));
            var22 = rrb.a(param1 + 22506, var17 - var18 - 2048);
            if (Math.abs(var19) >= var13) {
              break L16;
            } else {
              var9 = var9 | 1;
              break L16;
            }
          }
          L17: {
            if (var13 > Math.abs(var20)) {
              var9 = var9 | 2;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (var13 <= Math.abs(var21)) {
              break L18;
            } else {
              var9 = var9 | 32;
              break L18;
            }
          }
          if (Math.abs(var22) >= var13) {
            break L12;
          } else {
            var9 = var9 | 64;
            break L12;
          }
        }
        if (var9 == 0) {
          return false;
        } else {
          param0.a(param2, var9, false, var10, var11);
          return true;
        }
    }

    final int a(byte param0) {
        int var2 = -17 / ((param0 - -52) / 54);
        return -1 + ((aoa) this).field_b;
    }

    private final void a(pe param0, byte param1, sg param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sg[] var7 = null;
        sg[] var8 = null;
        int var9 = 0;
        sg var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        var4 = 0;
        var5 = 0;
        if (param1 == -103) {
          var6 = param2.g(-100);
          var7 = param0.d(1000);
          var8 = var7;
          var9 = 0;
          L0: while (true) {
            if (var8.length <= var9) {
              ((aoa) this).field_d = ((aoa) this).field_d + var5;
              ((aoa) this).field_e = ((aoa) this).field_e + var4;
              return;
            } else {
              var10 = var8[var9];
              if (var10 != null) {
                if (param2 != var10) {
                  if (var10.q((byte) 70) == param2.q((byte) 97)) {
                    var11 = var6 - -var10.g(-86) >> -136151738;
                    var12 = -param2.field_d + var10.field_d;
                    var13 = var10.field_e - param2.field_e;
                    var14 = ar.a(var12, (byte) 109, var13) >> 1819599689;
                    if (256 >= var14) {
                      L1: {
                        if ((var14 ^ -1) >= -1) {
                          var14 = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      var15 = ecb.a(-var13, (byte) -77, -var12);
                      var4 = var4 + var11 * fc.a(var15, (byte) 85) / (var14 * var14);
                      var5 = var5 + eu.a(var15, 107) * var11 / (var14 * var14);
                      var9++;
                      continue L0;
                    } else {
                      var9++;
                      continue L0;
                    }
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(pe param0, byte param1, sg param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sg var16 = gca.a(param0, (byte) 63, ((aoa) this).a((byte) 70), param2);
        if (!(var16 == null)) {
            var6 = var16.field_k.field_r;
            var7 = var16.field_k.field_n;
            var8 = ecb.a(param2.field_e + -var7, (byte) -77, -var6 + param2.field_d);
            var9 = param3;
            var10 = var6 - -((fc.a(var8, (byte) 38) >> -1745236888) * (var9 >> 982898344));
            var11 = (var9 >> 766529672) * (eu.a(var8, 127) >> -374889976) + var7;
            var12 = 256;
            var13 = -param2.field_d + var10;
            var14 = var11 + -param2.field_e;
            var15 = ar.a(var13, (byte) 120, var14);
            if (var12 < var15) {
                var13 = var12 * var13 / (var15 >> -929561340);
                var14 = var14 * var12 / (var15 >> -2006160956);
            }
            ((aoa) this).field_d = var14;
            ((aoa) this).field_a = (anb) (Object) var16;
            ((aoa) this).field_e = var13;
        }
        if (param1 >= -76) {
            ((aoa) this).field_a = null;
        }
    }

    final void a(int param0, boolean param1) {
        ((aoa) this).field_b = param0 - -1;
        if (!param1) {
            field_c = null;
        }
    }

    public final void b(byte param0, tv param1) {
        aoa var6 = (aoa) (Object) param1;
        aoa var7 = var6;
        if (param0 < 54) {
            Object var4 = null;
            boolean discarded$0 = ((aoa) this).a((byte) -32, (tv) null);
        }
        var7.field_b = ((aoa) this).field_b;
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        param0.a(-632, ((aoa) this).field_b, 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
