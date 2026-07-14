/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qjb implements ntb {
    int field_b;
    int field_c;
    static int field_d;
    private odb field_e;
    static String field_a;

    final int e(byte param0) {
        int var2 = 114 / ((param0 - 78) / 43);
        if (1 == fra.field_a) {
            return 2048;
        }
        return ((qjb) this).a((byte) 24).c(0);
    }

    final int a(int param0) {
        if (!(((qjb) this).a((byte) 24).h((byte) 38))) {
            return 0;
        }
        if (param0 < 67) {
            return 87;
        }
        return 256 * ((qjb) this).field_b / Math.max(1, ((qjb) this).a((byte) 24).f((byte) 118));
    }

    final boolean b(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = -28 % ((74 - param0) / 38);
            if ((((qjb) this).field_b ^ -1) < -1) {
              break L1;
            } else {
              if (((qjb) this).field_c == -10) {
                break L1;
              } else {
                if (-6 == ((qjb) this).field_c) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        ((qjb) this).field_b = param0.i(0, 16);
        ((qjb) this).field_c = param0.i(0, 4);
        if (!kv.a(param1, param0)) {
            ((qjb) this).field_e = null;
        } else {
            if (!(((qjb) this).field_e != null)) {
                ((qjb) this).field_e = new odb();
            }
            ((qjb) this).field_e.a(param0, param1);
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        qjb var5 = null;
        L0: {
          var5 = (qjb) (Object) param0;
          if (var5.field_e == null) {
            break L0;
          } else {
            if (var5.field_e != null) {
              var5.field_e.a((tv) (Object) var5.field_e, -104);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var4 = 0;
          if (var5.field_b == var5.field_b) {
            break L1;
          } else {
            var4 = 1;
            System.out.println("int reload has changed. before=" + var5.field_b + ", now=" + var5.field_b);
            break L1;
          }
        }
        L2: {
          if (var5.field_c != var5.field_c) {
            var4 = 1;
            System.out.println("int weapontype has changed. before=" + var5.field_c + ", now=" + var5.field_c);
            break L2;
          } else {
            break L2;
          }
        }
        odb discarded$1 = var5.field_e;
        L3: {
          if (null == var5.field_e) {
            break L3;
          } else {
            if (!var5.field_e.a((byte) -43, (tv) (Object) var5.field_e)) {
              break L3;
            } else {
              System.out.println("TargetLock target_lock has changed. before=" + var5.field_e + ", now=" + var5.field_e);
              var4 = 1;
              break L3;
            }
          }
        }
        L4: {
          if (param1 < -19) {
            break L4;
          } else {
            ((qjb) this).field_e = null;
            break L4;
          }
        }
        L5: {
          if (var4 == 0) {
            break L5;
          } else {
            System.out.println("This instance of WeaponBehaviour has changed");
            break L5;
          }
        }
    }

    final odb c(int param0) {
        if (param0 != 2) {
            ((qjb) this).field_b = 37;
        }
        return ((qjb) this).field_e;
    }

    final boolean b(boolean param0) {
        mfb var2 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            int discarded$2 = ((qjb) this).e((byte) 111);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((qjb) this).a((byte) 24);
            if (((qjb) this).field_b == var2.f((byte) 127)) {
              break L2;
            } else {
              L3: {
                if (!var2.i(1024)) {
                  break L3;
                } else {
                  if (((qjb) this).field_b <= var2.f((byte) 32) + -var2.c((byte) -50)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final mfb a(byte param0) {
        if (param0 != 24) {
            field_d = -84;
        }
        return ema.field_o[((qjb) this).field_c];
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((qjb) this).a(73);
        }
    }

    final boolean d(int param0) {
        if (param0 != 6) {
            Object var3 = null;
            boolean discarded$0 = ((qjb) this).a(-39, -35, 81, (wfb) null, (ml) null);
        }
        return !((qjb) this).a((byte) 24).e(118) ? true : false;
    }

    final int d(byte param0) {
        if (param0 <= 106) {
            Object var3 = null;
            this.a(107, -16, 116, -66, 72, -61, -84, 43, -112, 41, (anb) null, 15, 117, -19, -92, (pe) null, (mfb) null);
        }
        return ((qjb) this).a((byte) 24).b(-105);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, anb param10, int param11, int param12, int param13, int param14, pe param15, mfb param16) {
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        Random var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        tj var36 = null;
        int var37 = 0;
        L0: {
          var37 = VoidHunters.field_G;
          var18 = param16.b(false);
          var19 = param16.g((byte) -48);
          var20 = param16.h((byte) 105) ? 1 : 0;
          var21 = param16.d((byte) -106);
          var22 = param16.a((byte) 9);
          var23 = param16.k(0);
          ((qjb) this).field_b = param1;
          var24 = var21 * (param14 >> -1708888604) >> 660822924;
          var25 = var21 * (param6 >> -1044281532) >> -1382527636;
          if (var20 != 0) {
            param10.a(var18 * -var25, param5, param8, (byte) -125, var18 * -var24);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var26 = var24 * aq.field_o + param10.c((byte) -126);
          var28 = 47 % ((15 - param2) / 63);
          var27 = var25 * aq.field_o - -param10.f(0);
          if (!param16.e(-34)) {
            break L1;
          } else {
            var27 = -param7 + param11;
            var26 = param0 + -param13;
            break L1;
          }
        }
        L2: {
          var29 = new Random((long)param13);
          var30 = param13 + (param14 >> -1626536536);
          var31 = param7 + (param6 >> 1111097800);
          var32 = param16.g(2769);
          if (-1 <= (param16.e((byte) -63) ^ -1)) {
            break L2;
          } else {
            var33 = param16.f((byte) 30) + -((qjb) this).field_b;
            var34 = param16.c((byte) -111);
            var35 = -var33 + var34;
            if (var35 >= param16.e((byte) -63)) {
              break L2;
            } else {
              var32 = var32 * var35 / param16.e((byte) -63);
              break L2;
            }
          }
        }
        L3: {
          if (!param16.c(true)) {
            L4: {
              if (6 == ((qjb) this).field_c) {
                break L4;
              } else {
                if (11 == ((qjb) this).field_c) {
                  break L4;
                } else {
                  if ((((qjb) this).field_c ^ -1) == -10) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
            }
            param12 = 0;
            break L3;
          } else {
            param12 = sqb.a(-param7 + param11 >> 1094892294, 77, param0 + -param13 >> 1712254054);
            break L3;
          }
        }
        var33 = 0;
        L5: while (true) {
          if (var33 >= var18) {
            L6: {
              if (((qjb) this).field_c == -7) {
                break L6;
              } else {
                if (((qjb) this).field_c == 9) {
                  break L6;
                } else {
                  if (-12 == ((qjb) this).field_c) {
                    break L6;
                  } else {
                    param15.a(5, param10.c((byte) -121) + (var24 >> eta.field_b), 20, 20, 30273, param13, 500, param7, param10.f(0) + (var25 >> eta.field_b));
                    break L6;
                  }
                }
              }
            }
            L7: {
              L8: {
                if (((qjb) this).field_c != 9) {
                  break L8;
                } else {
                  if (param4 > -1) {
                    break L8;
                  } else {
                    rmb.a(param7, param10.field_l, param4, -39, param13);
                    break L7;
                  }
                }
              }
              if (-1 > param4) {
                break L7;
              } else {
                qba.a(20382, param13, param4, param7, 5);
                break L7;
              }
            }
            return;
          } else {
            L9: {
              var34 = 0;
              var35 = 0;
              if (0 < var19) {
                var34 = hob.a(var29, var19 << -1739237119, 124) - var19;
                var35 = -var19 + hob.a(var29, var19 << -1020228223, 121);
                break L9;
              } else {
                break L9;
              }
            }
            var36 = new tj(var30, var31, var26 - -var34, var27 + var35, param12, var22, param3, param9, var23, var32);
            param15.a(var36, false);
            var33++;
            continue L5;
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 71) {
            int discarded$0 = ((qjb) this).a(126);
        }
        return -7 == (((qjb) this).field_c ^ -1) ? true : false;
    }

    final void a(pe param0, boolean param1, int param2, int param3, int param4, anb param5, int param6, int param7, int param8, int param9, int param10, int[] param11) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        sg var24 = null;
        sg var25 = null;
        int var25_int = 0;
        aoa var26 = null;
        int var26_int = 0;
        int var27 = 0;
        int var28 = 0;
        anb var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        mfb var34 = null;
        Object var35 = null;
        sg var35_ref = null;
        var35 = null;
        var33 = VoidHunters.field_G;
        var34 = ((qjb) this).a((byte) 24);
        if (-1 <= (var34.b((byte) 34) ^ -1)) {
          L0: {
            L1: {
              var14 = -90 / ((param4 - 6) / 33);
              if (-1 <= (((qjb) this).field_b ^ -1)) {
                break L1;
              } else {
                if (param1) {
                  break L1;
                } else {
                  if (((qjb) this).field_c != 9) {
                    break L0;
                  } else {
                    if (((qjb) this).field_b > -upb.field_a + fja.field_o) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var15 = fc.a(param8, (byte) 123);
            var16 = eu.a(param8, 96);
            var17 = (-(param10 * var16) + var15 * param2 >> 702127568) + param9;
            var18 = (var15 * param10 + var16 * param2 >> 59829360) + param7;
            var19 = 0;
            var20 = 0;
            L2: while (true) {
              if (var20 >= param11.length) {
                L3: {
                  var20 = param9 - -(var15 * (256 + var19) >> 1696313712);
                  var21 = (var16 * (256 + var19) >> -1454790640) + param7;
                  var22 = -1;
                  var23 = -1;
                  var24 = null;
                  if (param5 instanceof sg) {
                    var35_ref = (sg) (Object) param5;
                    var24 = var35_ref;
                    var22 = var35_ref.q((byte) 86);
                    var23 = var35_ref.o((byte) -117);
                    if (null == var35_ref.k((byte) -108)) {
                      break L3;
                    } else {
                      var23 = var35_ref.k((byte) -108).a((byte) 80);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (2 == ((qjb) this).field_c) {
                  L4: {
                    if (-1 < (var23 ^ -1)) {
                      break L4;
                    } else {
                      if (param0.e(var23, (byte) -99) >= wk.field_a) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var25 = gqb.a(false);
                  var25.a(var20, var21, (byte) 118);
                  var25.a(param8, -122);
                  var25.h(17704, var22);
                  var25.g(-1, -111);
                  var26 = new aoa();
                  var26.a(var23, true);
                  var25.a(var26, 4);
                  var25.a(var21, param8, var20, 500, 1948934248);
                  param0.a(var25, (byte) 72);
                  ((qjb) this).field_b = var34.f((byte) 77);
                  eib.a(6811, var34.a(false), 1 + ((qjb) this).field_b / 2);
                  break L0;
                } else {
                  if ((((qjb) this).field_c ^ -1) != -11) {
                    L5: {
                      if (var34.c(true)) {
                        break L5;
                      } else {
                        if (param1) {
                          break L5;
                        } else {
                          if (0 == di.field_p) {
                            var25_int = param3 - var17;
                            var26_int = -var18 + param6;
                            var27 = ecb.a(var26_int, (byte) -77, var25_int);
                            var28 = rrb.a(22433, var27 + -param8);
                            if (Math.abs(var28) <= var34.d(27918)) {
                              break L5;
                            } else {
                              return;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (param1) {
                        break L6;
                      } else {
                        if (!var34.i(1024)) {
                          break L6;
                        } else {
                          if (-1 <= (((qjb) this).field_b ^ -1)) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L7: {
                      var25_int = -1;
                      var26_int = var34.f((byte) 64);
                      var27 = 0;
                      if (0 >= var34.c((byte) -106)) {
                        var25_int = var34.a(false);
                        break L7;
                      } else {
                        if (((qjb) this).field_b == 0) {
                          var27 = 1;
                          var25_int = var34.a(false);
                          break L7;
                        } else {
                          var26_int = ((qjb) this).field_b;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var28 = var34.a(0);
                      if (var24 == null) {
                        break L8;
                      } else {
                        if (var24.a((byte) 11, var28)) {
                          break L8;
                        } else {
                          if ((fra.field_a ^ -1) != -2) {
                            break L0;
                          } else {
                            if (!param1) {
                              break L0;
                            } else {
                              if (var27 != 0) {
                                break L0;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (((qjb) this).c((byte) 101)) {
                      L9: {
                        if (param1) {
                          break L9;
                        } else {
                          L10: {
                            if (((qjb) this).field_e == null) {
                              ((qjb) this).field_e = new odb();
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var29 = param0.a(true, param6, param3, var24.q((byte) 83));
                            var30 = 0;
                            if (var29 != null) {
                              var31 = -param3 + var29.field_d;
                              var32 = var29.field_e - param6;
                              if (ar.a(var31, (byte) 112, var32) <= var29.b(true) - -32768) {
                                ((qjb) this).field_e.field_a = var29.c(false);
                                ((qjb) this).field_e.field_d = param3 - var29.d(false);
                                ((qjb) this).field_e.field_c = -var29.g((byte) -122) + param6;
                                var30 = 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            } else {
                              break L11;
                            }
                          }
                          if (var30 != 0) {
                            break L9;
                          } else {
                            ((qjb) this).field_e.field_a = -1;
                            ((qjb) this).field_e.field_d = -param5.d(false) + param3;
                            ((qjb) this).field_e.field_c = -param5.g((byte) 123) + param6;
                            break L9;
                          }
                        }
                      }
                      this.a(param3, var26_int, 113, var22, var25_int, param9, var16, var21, param7, var23, param5, param6, param8, var20, var15, param0, var34);
                      break L0;
                    } else {
                      this.a(param3, var26_int, 113, var22, var25_int, param9, var16, var21, param7, var23, param5, param6, param8, var20, var15, param0, var34);
                      break L0;
                    }
                  } else {
                    ((qjb) this).field_b = oq.field_a;
                    qba.a(20382, var20, var34.a(false), var21, ((qjb) this).field_b / 2 + 1);
                    break L0;
                  }
                }
              } else {
                var21 = param11[var20];
                if (var19 < var21) {
                  var19 = var21;
                  var20 += 2;
                  continue L2;
                } else {
                  var20 += 2;
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          L12: {
            ((qjb) this).field_b = ((qjb) this).field_b + var34.f(1024);
            var14 = var34.b((byte) 82);
            if (((qjb) this).field_b > var14) {
              ((qjb) this).field_b = var14;
              break L12;
            } else {
              break L12;
            }
          }
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        qjb var4 = (qjb) (Object) param1;
        qjb var3 = var4;
        var4.field_c = var4.field_c;
        var4.field_b = var4.field_b;
        if (var4.field_e == null) {
            var4.field_e = null;
        } else {
            if (null == var3.field_e) {
                var3.field_e = new odb();
            }
            var4.field_e.b((byte) 79, (tv) (Object) var3.field_e);
        }
        if (param0 < 54) {
            field_d = -90;
        }
    }

    public final boolean a(byte param0, tv param1) {
        qjb var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          L1: {
            var4 = -72 / ((22 - param0) / 59);
            var3 = (qjb) (Object) param1;
            if (var3.field_b != var3.field_b) {
              break L1;
            } else {
              if (var3.field_c != var3.field_c) {
                break L1;
              } else {
                odb discarded$2 = var3.field_e;
                L2: {
                  if (var3.field_e == null) {
                    break L2;
                  } else {
                    if (!var3.field_e.a((byte) 91, (tv) (Object) var3.field_e)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L0;
        }
        return stackIn_9_0 != 0;
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((qjb) this).field_b, 16);
        if (param1 > -109) {
            int discarded$0 = ((qjb) this).e((byte) -18);
        }
        param0.a(-632, ((qjb) this).field_c, 4);
        if (!(vq.a(param0, -103, null == ((qjb) this).field_e ? true : false))) {
            ((qjb) this).field_e.b(param0, -126);
        }
    }

    public static void c(boolean param0) {
        field_a = null;
        if (!param0) {
            qjb.c(false);
        }
    }

    qjb() {
    }

    final void a(int param0, anb param1, int[] param2, int param3, int param4, boolean param5, int param6, int param7, pe param8) {
        int var10 = 0;
        uwa var11 = null;
        if (!(0 >= ((qjb) this).field_b)) {
            ((qjb) this).field_b = ((qjb) this).field_b - 1;
            param1.d((byte) 87);
        }
        if (((qjb) this).field_c == 10) {
            if (oq.field_a + -oq.field_n < ((qjb) this).field_b) {
                var10 = oq.field_a + -((qjb) this).field_b;
                var11 = ccb.field_a.a(0);
                var11.a(-1, param4, param0, bpa.field_a / oq.field_n * var10, 1, 0, (byte) 69, param1, param7, 0);
            }
        }
        mfb var12 = ((qjb) this).a((byte) 24);
        if (!(!var12.i(1024))) {
            if (((qjb) this).field_b > var12.f((byte) 113) + -var12.c((byte) 124)) {
                ((qjb) this).a(param8, true, param6, 0, -127, param1, 0, param4, param7, param0, param3, param2);
            }
        }
        if (!param5) {
            ((qjb) this).b(-89);
        }
    }

    final void b(int param0) {
        ((qjb) this).field_e = null;
        if (param0 != 2048) {
            field_d = 124;
        }
    }

    qjb(int param0) {
        ((qjb) this).field_c = param0;
    }

    final boolean a(int param0, int param1, int param2, wfb param3, ml param4) {
        int var6 = param4.c(param0 + 26894);
        if (!(-1 != (var6 ^ -1))) {
            return false;
        }
        if (param0 != -26772) {
            ((qjb) this).field_b = 95;
        }
        int var7 = param4.a(param3, (byte) -69);
        int var8 = param4.a(-119, param3);
        int var9 = param4.g((byte) -127);
        int var10 = param2 + -var7;
        int var11 = param1 + -var8;
        int var12 = ecb.a(var11, (byte) -77, var10);
        int var13 = rrb.a(22433, var12 - var9);
        return Math.abs(var13) <= var6 ? true : false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((qjb) this).field_c = -50;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_a = "Choose the mutators";
    }
}
