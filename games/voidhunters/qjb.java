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
        return this.a((byte) 24).c(0);
    }

    final int a(int param0) {
        if (!(this.a((byte) 24).h((byte) 38))) {
            return 0;
        }
        if (param0 < 67) {
            return 87;
        }
        return 256 * this.field_b / Math.max(1, this.a((byte) 24).f((byte) 118));
    }

    final boolean b(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var2 = -28 % ((74 - param0) / 38);
            if ((this.field_b ^ -1) < -1) {
              break L1;
            } else {
              if ((this.field_c ^ -1) == -10) {
                break L1;
              } else {
                if (-6 == (this.field_c ^ -1)) {
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L0;
                }
              }
            }
          }
          stackIn_5_0 = 0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_b = param0.i(0, 16);
              this.field_c = param0.i(0, 4);
              if (kv.a(param1, param0)) {
                L2: {
                  if (this.field_e == null) {
                    this.field_e = new odb();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_e.a(param0, param1);
                break L1;
              } else {
                this.field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("qjb.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        qjb var5 = null;
        try {
          L0: {
            L1: {
              var5 = (qjb) ((Object) param0);
              if (this.field_e == null) {
                break L1;
              } else {
                if (var5.field_e != null) {
                  this.field_e.a(var5.field_e, -104);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (var5.field_b == this.field_b) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int reload has changed. before=" + var5.field_b + ", now=" + this.field_b);
                break L2;
              }
            }
            L3: {
              if (this.field_c != var5.field_c) {
                var4 = 1;
                System.out.println("int weapontype has changed. before=" + var5.field_c + ", now=" + this.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_e) {
                stackIn_12_0 = 0;
                break L4;
              } else {
                stackIn_12_0 = 1;
                break L4;
              }
            }
            L5: {


              if (null != var5.field_e) {

                stackIn_15_1 = 0;
                break L5;
              } else {

                stackIn_15_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
                  break L7;
                } else {
                  if (null == this.field_e) {
                    break L6;
                  } else {
                    if (this.field_e.a((byte) -43, var5.field_e)) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              System.out.println("TargetLock target_lock has changed. before=" + var5.field_e + ", now=" + this.field_e);
              var4 = 1;
              break L6;
            }
            L8: {
              if (param1 < -19) {
                break L8;
              } else {
                this.field_e = (odb) null;
                break L8;
              }
            }
            L9: {
              if (var4 == 0) {
                break L9;
              } else {
                System.out.println("This instance of WeaponBehaviour has changed");
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("qjb.F(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final odb c(int param0) {
        if (param0 != 2) {
            this.field_b = 37;
        }
        return this.field_e;
    }

    final boolean b(boolean param0) {
        mfb var2;
        int stackIn_8_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.e((byte) 111);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = this.a((byte) 24);
            if (this.field_b == var2.f((byte) 127)) {
              break L2;
            } else {
              L3: {
                if (!var2.i(1024)) {
                  break L3;
                } else {
                  if (this.field_b <= var2.f((byte) 32) + -var2.c((byte) -50)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = 0;
              break L1;
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final mfb a(byte param0) {
        if (param0 != 24) {
            field_d = -84;
        }
        return ema.field_o[this.field_c];
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
            this.a(73);
        }
    }

    final boolean d(int param0) {
        if (param0 != 6) {
            ml var3 = (ml) null;
            this.a(-39, -35, 81, (wfb) null, (ml) null);
        }
        return !this.a((byte) 24).e(118) ? true : false;
    }

    final int d(byte param0) {
        if (param0 <= 106) {
            mfb var3 = (mfb) null;
            this.a(107, -16, 116, -66, 72, -61, -84, 43, -112, 41, (anb) null, 15, 117, -19, -92, (pe) null, (mfb) null);
        }
        return this.a((byte) 24).b(-105);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, anb param10, int param11, int param12, int param13, int param14, pe param15, mfb param16) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var18_int = 0;
        RuntimeException var18 = null;
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
        var37 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var18_int = param16.b(false);
              var19 = param16.g((byte) -48);
              var20 = param16.h((byte) 105) ? 1 : 0;
              var21 = param16.d((byte) -106);
              var22 = param16.a((byte) 9);
              var23 = param16.k(0);
              this.field_b = param1;
              var24 = var21 * (param14 >> -1708888604) >> 660822924;
              var25 = var21 * (param6 >> -1044281532) >> -1382527636;
              if (var20 != 0) {
                param10.a(var18_int * -var25, param5, param8, (byte) -125, var18_int * -var24);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var26 = var24 * aq.field_o + param10.c((byte) -126);
              var28 = 47 % ((15 - param2) / 63);
              var27 = var25 * aq.field_o - -param10.f(0);
              if (!param16.e(-34)) {
                break L2;
              } else {
                var27 = -param7 + param11;
                var26 = param0 + -param13;
                break L2;
              }
            }
            L3: {
              var29 = new Random((long)param13);
              var30 = param13 + (param14 >> -1626536536);
              var31 = param7 + (param6 >> 1111097800);
              var32 = param16.g(2769);
              if (-1 <= (param16.e((byte) -63) ^ -1)) {
                break L3;
              } else {
                var33 = param16.f((byte) 30) + -this.field_b;
                var34 = param16.c((byte) -111);
                var35 = -var33 + var34;
                if (var35 >= param16.e((byte) -63)) {
                  break L3;
                } else {
                  var32 = var32 * var35 / param16.e((byte) -63);
                  break L3;
                }
              }
            }
            L4: {
              if (!param16.c(true)) {
                L5: {
                  if (6 == this.field_c) {
                    break L5;
                  } else {
                    if (11 == this.field_c) {
                      break L5;
                    } else {
                      if ((this.field_c ^ -1) == -10) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param12 = 0;
                break L4;
              } else {
                param12 = sqb.a(-param7 + param11 >> 1094892294, 77, param0 + -param13 >> 1712254054);
                break L4;
              }
            }
            var33 = 0;
            L6: while (true) {
              if (var33 >= var18_int) {
                L7: {
                  if ((this.field_c ^ -1) == -7) {
                    break L7;
                  } else {
                    if (this.field_c == 9) {
                      break L7;
                    } else {
                      if (-12 == (this.field_c ^ -1)) {
                        break L7;
                      } else {
                        param15.a(5, param10.c((byte) -121) + (var24 >> eta.field_b), 20, 20, 30273, param13, 500, param7, param10.f(0) + (var25 >> eta.field_b));
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  L9: {
                    if (this.field_c != 9) {
                      break L9;
                    } else {
                      if ((param4 ^ -1) > -1) {
                        break L9;
                      } else {
                        rmb.a(param7, param10.field_l, param4, -39, param13);
                        break L8;
                      }
                    }
                  }
                  if (-1 < (param4 ^ -1)) {
                    break L8;
                  } else {
                    qba.a(20382, param13, param4, param7, 5);
                    break L8;
                  }
                }
                break L0;
              } else {
                L10: {
                  var34 = 0;
                  var35 = 0;
                  if (0 < var19) {
                    var34 = hob.a(var29, var19 << -1739237119, 124) - var19;
                    var35 = -var19 + hob.a(var29, var19 << -1020228223, 121);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var36 = new tj(var30, var31, var26 - -var34, var27 + var35, param12, var22, param3, param9, var23, var32);
                param15.a(var36, false);
                var33++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var18 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var18);

            stackIn_34_1 = new StringBuilder().append("qjb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param16 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), stackIn_41_2 + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 71) {
            this.a(126);
        }
        return -7 == (this.field_c ^ -1) ? true : false;
    }

    final void a(pe param0, boolean param1, int param2, int param3, int param4, anb param5, int param6, int param7, int param8, int param9, int param10, int[] param11) {
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
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
        Object var24 = null;
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
        try {
          L0: {
            var34 = this.a((byte) 24);
            if (-1 <= (var34.b((byte) 34) ^ -1)) {
              L1: {
                L2: {
                  var14 = -90 / ((param4 - 6) / 33);
                  if (-1 <= (this.field_b ^ -1)) {
                    break L2;
                  } else {
                    if (param1) {
                      break L2;
                    } else {
                      if (this.field_c != 9) {
                        break L1;
                      } else {
                        if (this.field_b > -upb.field_a + fja.field_o) {
                          break L2;
                        } else {
                          break L1;
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
                L3: while (true) {
                  if (var20 >= param11.length) {
                    L4: {
                      var20 = param9 - -(var15 * (256 + var19) >> 1696313712);
                      var21 = (var16 * (256 + var19) >> -1454790640) + param7;
                      var22 = -1;
                      var23 = -1;
                      var24 = null;
                      if (param5 instanceof sg) {
                        var35_ref = (sg) ((Object) param5);
                        var24 = var35_ref;
                        var22 = var35_ref.q((byte) 86);
                        var23 = var35_ref.o((byte) -117);
                        if (null == var35_ref.k((byte) -108)) {
                          break L4;
                        } else {
                          var23 = var35_ref.k((byte) -108).a((byte) 80);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    if (2 == this.field_c) {
                      L5: {
                        if (-1 < (var23 ^ -1)) {
                          break L5;
                        } else {
                          if (param0.e(var23, (byte) -99) >= wk.field_a) {
                            break L1;
                          } else {
                            break L5;
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
                      this.field_b = var34.f((byte) 77);
                      eib.a(6811, var34.a(false), 1 + this.field_b / 2);
                      break L1;
                    } else {
                      if ((this.field_c ^ -1) != -11) {
                        L6: {
                          if (var34.c(true)) {
                            break L6;
                          } else {
                            if (param1) {
                              break L6;
                            } else {
                              if (0 == di.field_p) {
                                var25_int = param3 - var17;
                                var26_int = -var18 + param6;
                                var27 = ecb.a(var26_int, (byte) -77, var25_int);
                                var28 = rrb.a(22433, var27 + -param8);
                                if (Math.abs(var28) <= var34.d(27918)) {
                                  break L6;
                                } else {
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (param1) {
                            break L7;
                          } else {
                            if (!var34.i(1024)) {
                              break L7;
                            } else {
                              if (-1 <= (this.field_b ^ -1)) {
                                break L7;
                              } else {
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        L8: {
                          var25_int = -1;
                          var26_int = var34.f((byte) 64);
                          var27 = 0;
                          if (0 >= var34.c((byte) -106)) {
                            var25_int = var34.a(false);
                            break L8;
                          } else {
                            if (this.field_b == 0) {
                              var27 = 1;
                              var25_int = var34.a(false);
                              break L8;
                            } else {
                              var26_int = this.field_b;
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var28 = var34.a(0);
                          if (var24 == null) {
                            break L9;
                          } else {
                            if (((sg) (var24)).a((byte) 11, var28)) {
                              break L9;
                            } else {
                              if ((fra.field_a ^ -1) != -2) {
                                break L1;
                              } else {
                                if (!param1) {
                                  break L1;
                                } else {
                                  if (var27 != 0) {
                                    break L1;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (this.c((byte) 101)) {
                          L10: {
                            if (param1) {
                              break L10;
                            } else {
                              L11: {
                                if (this.field_e == null) {
                                  this.field_e = new odb();
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var29 = param0.a(true, param6, param3, ((sg) (var24)).q((byte) 83));
                                var30 = 0;
                                if (var29 != null) {
                                  var31 = -param3 + var29.field_d;
                                  var32 = var29.field_e - param6;
                                  if (ar.a(var31, (byte) 112, var32) <= var29.b(true) - -32768) {
                                    this.field_e.field_a = var29.c(false);
                                    this.field_e.field_d = param3 - var29.d(false);
                                    this.field_e.field_c = -var29.g((byte) -122) + param6;
                                    var30 = 1;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              if (var30 != 0) {
                                break L10;
                              } else {
                                this.field_e.field_a = -1;
                                this.field_e.field_d = -param5.d(false) + param3;
                                this.field_e.field_c = -param5.g((byte) 123) + param6;
                                break L10;
                              }
                            }
                          }
                          this.a(param3, var26_int, 113, var22, var25_int, param9, var16, var21, param7, var23, param5, param6, param8, var20, var15, param0, var34);
                          break L1;
                        } else {
                          this.a(param3, var26_int, 113, var22, var25_int, param9, var16, var21, param7, var23, param5, param6, param8, var20, var15, param0, var34);
                          break L1;
                        }
                      } else {
                        this.field_b = oq.field_a;
                        qba.a(20382, var20, var34.a(false), var21, this.field_b / 2 + 1);
                        break L1;
                      }
                    }
                  } else {
                    var21 = param11[var20];
                    if (var19 < var21) {
                      var19 = var21;
                      var20 += 2;
                      continue L3;
                    } else {
                      var20 += 2;
                      continue L3;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L13: {
                this.field_b = this.field_b + var34.f(1024);
                var14 = var34.b((byte) 82);
                if (this.field_b > var14) {
                  this.field_b = var14;
                  break L13;
                } else {
                  break L13;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var13 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var13);

            stackIn_66_1 = new StringBuilder().append("qjb.P(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L14;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L15;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L16;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L16;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_67_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final void b(byte param0, tv param1) {
        qjb var3 = null;
        qjb var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = (qjb) ((Object) param1);
              var3 = var4;
              var4.field_c = this.field_c;
              var4.field_b = this.field_b;
              if (this.field_e != null) {
                L2: {
                  if (null != var3.field_e) {
                    break L2;
                  } else {
                    var3.field_e = new odb();
                    break L2;
                  }
                }
                this.field_e.b((byte) 79, var3.field_e);
                break L1;
              } else {
                var4.field_e = null;
                break L1;
              }
            }
            L3: {
              if (param0 >= 54) {
                break L3;
              } else {
                field_d = -90;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("qjb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        qjb var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -72 / ((22 - param0) / 59);
                var3 = (qjb) ((Object) param1);
                if (var3.field_b != this.field_b) {
                  break L2;
                } else {
                  if (var3.field_c != this.field_c) {
                    break L2;
                  } else {
                    L3: {
                      if (null != this.field_e) {
                        stackIn_5_0 = 0;
                        break L3;
                      } else {
                        stackIn_5_0 = 1;
                        break L3;
                      }
                    }
                    L4: {


                      if (var3.field_e != null) {

                        stackIn_8_1 = 0;
                        break L4;
                      } else {

                        stackIn_8_1 = 1;
                        break L4;
                      }
                    }
                    if ((stackIn_5_0 ^ stackIn_8_1) != 0) {
                      break L2;
                    } else {
                      L5: {
                        if (this.field_e == null) {
                          break L5;
                        } else {
                          if (!this.field_e.a((byte) 91, var3.field_e)) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      break L1;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("qjb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param0.a(-632, this.field_b, 16);
              if (param1 <= -109) {
                break L1;
              } else {
                this.e((byte) -18);
                break L1;
              }
            }
            L2: {
              param0.a(-632, this.field_c, 4);
              stackIn_4_0 = (faa) (param0);

              stackIn_4_1 = -103;

              if (null == this.field_e) {
                stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = 0;
                break L2;
              } else {
                stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = 1;
                break L2;
              }
            }
            L3: {
              if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                this.field_e.b(param0, -126);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("qjb.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        uwa var11 = null;
        mfb var12 = null;
        try {
          L0: {
            L1: {
              if (0 < this.field_b) {
                this.field_b = this.field_b - 1;
                param1.d((byte) 87);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_c != 10) {
                break L2;
              } else {
                if (oq.field_a + -oq.field_n >= this.field_b) {
                  break L2;
                } else {
                  var10_int = oq.field_a + -this.field_b;
                  var11 = ccb.field_a.a(0);
                  var11.a(-1, param4, param0, bpa.field_a / oq.field_n * var10_int, 1, 0, (byte) 69, param1, param7, 0);
                  break L2;
                }
              }
            }
            L3: {
              var12 = this.a((byte) 24);
              if (var12.i(1024)) {
                if (this.field_b <= var12.f((byte) 113) + -var12.c((byte) 124)) {
                  break L3;
                } else {
                  this.a(param8, true, param6, 0, -127, param1, 0, param4, param7, param0, param3, param2);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (param5) {
                break L4;
              } else {
                this.b(-89);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("qjb.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
    }

    final void b(int param0) {
        this.field_e = null;
        if (param0 != 2048) {
            field_d = 124;
        }
    }

    qjb(int param0) {
        this.field_c = param0;
    }

    final boolean a(int param0, int param1, int param2, wfb param3, ml param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = param4.c(param0 + 26894);
            if (-1 == (var6_int ^ -1)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -26772) {
                  break L1;
                } else {
                  this.field_b = 95;
                  break L1;
                }
              }
              L2: {
                var7 = param4.a(param3, (byte) -69);
                var8 = param4.a(-119, param3);
                var9 = param4.g((byte) -127);
                var10 = param2 + -var7;
                var11 = param1 + -var8;
                var12 = ecb.a(var11, (byte) -77, var10);
                var13 = rrb.a(22433, var12 - var9);
                if (Math.abs(var13) > var6_int) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("qjb.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            this.field_c = -50;
            return false;
        }
        return false;
    }

    static {
        field_d = 1;
        field_a = "Choose the mutators";
    }
}
