/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends mk {
    private fn field_k;
    private fn field_l;
    static int field_j;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 89) {
            ib.a(false, -126, -33, 30, 79, -34, 49, -91, -77);
          }
          var6 = this.field_l.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          var5 = var4;
          if (pd.a(var5, 0)) {
            stackIn_7_0 = mp.field_Pb;
            return stackIn_7_0;
          }
          if (ab.a(var5, 0)) {
            stackIn_11_0 = ea.field_c;
            return stackIn_11_0;
          }
          if (ph.a(var5, (byte) 113)) {
            stackIn_15_0 = CampaignMenu.field_v;
            return stackIn_15_0;
          }
          if (this.a(param1, 127)) {
            stackIn_19_0 = p.field_d;
            return stackIn_19_0;
          }
          if (var6.length() <= 0) {
            stackIn_22_0 = vk.field_b;
            return stackIn_22_0;
          }
          if (rb.a(var6, var5, -76)) {
            stackIn_25_0 = de.field_c;
            return stackIn_25_0;
          }
          if (e.a(-110, var6, var5)) {
            stackIn_29_0 = er.field_b;
            return stackIn_29_0;
          }
          if (!Battlefield.a(var5, (byte) -26, var6)) {
            stackIn_34_0 = mp.field_Pb;
            return stackIn_34_0;
          }
          stackIn_32_0 = de.field_c;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("ib.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final gu a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        gu stackIn_3_0 = null;
        gu stackIn_8_0 = null;
        gu stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = rn.field_e;
            return stackIn_3_0;
          }
          if (param0 != -3137) {
            field_j = 109;
          }
          if (!qd.a(var4, var3, false)) {
            stackIn_8_0 = rn.field_e;
            return stackIn_8_0;
          }
          if (!this.a(param1, 127)) {
            return oo.field_g;
          }
          stackIn_12_0 = rn.field_e;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ib.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        boolean stackIn_35_2 = false;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        ru stackIn_62_0;
        int stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_63_4;
        ru stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_69_3;
        ru stackIn_72_0 = null;
        int stackIn_73_1 = 0;
        ru stackIn_76_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        boolean stackIn_88_2 = false;
        int stackIn_115_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime1Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9_int = fs.a(param3, 24340, param2, param8, param4, param5, param1);
          fe.a(param2, param8, param5, param1, EffectPresentation.field_j, jh.field_k, 0, 128, false);
          fe.a(param2 + 4, param8 + 4, param5 - 8, 40, EffectPresentation.field_j, jh.field_k, 0, 128, false);
          fe.a(param2 + 4, -40 + (param1 + param8 - 4), -8 + param5, 40, EffectPresentation.field_j, jh.field_k, 0, 128, false);
          if (var9_int == -3 &&
            param3 - param8 < 40 &&
            0 < dd.field_e) {
            if (!param0) {
              fe.a(8 + param2, param8 + 8, param5 - 16, 32, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 128, true);
            } else {
              fe.a(param2 + 8, param8 + 8, param5 - 16, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true);
            }
          } else {
            fe.a(8 + param2, 8 + param8, -16 + param5, 32, DisplacedUnitMarker.field_s, jh.field_k, 0, 128, true);
          }
          if (var9_int == -3 &&
            -param8 + param3 + 40 > param1 &&
            uk.field_q > dd.field_e) {
            if (param0) {
              fe.a(param2 + 8, param8 + (param1 - 40), -16 + param5, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true);
            } else {
              fe.a(8 + param2, -40 + param1 + param8, -16 + param5, 32, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 128, true);
            }
          } else {
            fe.a(8 + param2, -40 + param1 + param8, param5 - 16, 32, DisplacedUnitMarker.field_s, jh.field_k, 0, 128, true);
          }
          sa.field_a.e(param2 + ((param5 >> 1) - 29), param8 + 14, 128);
          sa.field_a.e(11 + ((param5 >> 1) + param2), 14 + param8, 128);
          sa.field_a.c();
          sa.field_a.e(-29 + param2 + (param5 >> 1), param7 + (param1 + param8 + 9), 128);
          sa.field_a.e(11 + ((param5 >> 1) + param2), 9 + param1 + (param8 - 40), 128);
          sa.field_a.c();
          if (kd.field_X < 0) {
            stackIn_18_0 = var9_int;
            return stackIn_18_0;
          }
          var10 = param8 - (dd.field_e - 44);
          var11 = 0;
          if (od.field_c[kd.field_X]) {
            var11 = -1;
          }
          var12_int = 0;
          scanLoop1: while (true) {
            stackIn_25_0 = (!od.field_c[kd.field_X]) ? 0 : 1;
            if (stackIn_25_0 + bc.field_j[kd.field_X].length > var12_int) {
              SoftwareRaster.f(8 + param2, 44 + param8, param2 + param5 - 8, param1 + (param8 - 40 - 4));
              if (var12_int % 2 != 1) {
                stackIn_29_0 = 0;
              } else {
                stackIn_29_0 = param5 / 2 - 7;
              }
              var13 = stackIn_29_0 + (param2 + 8);
              var14 = 1 + var10;
              if (var11 != param6) {
                if (var9_int == var11) {
                  stackIn_40_0 = kd.field_X;
                  stackIn_40_1 = pg.playerProfile.getUnlockLevel(param7 ^ -40);
                  stackIn_41_2 = !(2 > hi.field_j);
                  if (!ue.a(stackIn_40_0, stackIn_40_1, stackIn_41_2, var11, -1208926000, ei.field_e[0])) {
                    fe.a(var13, var14, (param5 >> 1) - 9, 78, io.field_m, MoveAttackAction.field_x, 0, 128, false);
                  } else {
                    fe.a(var13, var14, -9 + (param5 >> 1), 78, io.field_m, TutorialController.field_e, 0, 128, false);
                  }
                } else {
                  stackIn_34_0 = kd.field_X;
                  stackIn_34_1 = pg.playerProfile.getUnlockLevel(0);
                  stackIn_35_2 = !(hi.field_j < 2);
                  if (!ue.a(stackIn_34_0, stackIn_34_1, stackIn_35_2, var11, -1208926000, ei.field_e[0])) {
                    fe.a(var13, var14, (param5 >> 1) - 9, 78, io.field_m, dh.field_l, 0, 128, false);
                  } else {
                    fe.a(var13, var14, -9 + (param5 >> 1), 78, io.field_m, jh.field_k, 0, 128, false);
                  }
                }
              } else {
                fe.a(var13, var14, (param5 >> 1) - 9, 78, io.field_m, nd.field_b, 0, 128, false);
              }
              if (var12_int % 2 != 1) {
                stackIn_47_0 = 0;
              } else {
                stackIn_47_0 = param5 / 2 - 7;
              }
              var15 = stackIn_47_0 + (11 + param2);
              if (44 + param8 >= var14) {
                stackIn_50_0 = param8 + 40 + 4;
              } else {
                stackIn_50_0 = var14;
              }
              var16 = stackIn_50_0;
              stackIn_52_0 = var15;
              stackIn_52_1 = var16;
              stackIn_52_2 = -15 + ((param5 >> 1) + var15);
              if (78 + var16 < param8 + param1 - 40 - 4) {
                stackIn_53_3 = var16 + 78;
              } else {
                stackIn_53_3 = -44 + (param8 + param1);
              }
              SoftwareRaster.f(stackIn_52_0, stackIn_52_1, stackIn_52_2, stackIn_53_3);
              if ((uh.field_e[kd.field_X][1] >> 1) + var10 >= 0) {
                if (var11 > -1) {
                  if (kd.field_X != 1) {
                    if (kd.field_X == 2) {
                      stackIn_76_0 = bc.field_j[2][var11];
                      if (var12_int % 2 == 0) {
                        stackIn_77_1 = 0;
                      } else {
                        stackIn_77_1 = param5 / 2;
                      }
                      ((ru) (Object) stackIn_76_0).c(stackIn_77_1 + (param5 / 4 + param2) - (uh.field_e[2][0] >> 3), 40 + (var10 - (uh.field_e[2][1] >> 3)));
                    } else {
                      if (kd.field_X == 3) {
                        stackIn_72_0 = bc.field_j[3][var11];
                        if (var12_int % 2 != 0) {
                          stackIn_73_1 = param5 / 2;
                        } else {
                          stackIn_73_1 = 0;
                        }
                        ((ru) (Object) stackIn_72_0).a(stackIn_73_1 - (uh.field_e[3][0] >> 3) + param2 + param5 / 4, -(uh.field_e[3][1] >> 1) + (40 + var10));
                      } else {
                        stackIn_68_0 = bc.field_j[kd.field_X][var11];
                        stackIn_68_1 = param5 / 4 + param2;
                        stackIn_68_2 = uh.field_e[kd.field_X][0] / 4;
                        if (var12_int % 2 != 0) {
                          stackIn_69_3 = param5 / 2;
                        } else {
                          stackIn_69_3 = 0;
                        }
                        ((ru) (Object) stackIn_68_0).d(stackIn_68_1 - (stackIn_68_2 - stackIn_69_3), var10 + 40 - (uh.field_e[kd.field_X][1] >> 2));
                      }
                    }
                  } else {
                    stackIn_62_0 = bc.field_j[1][var11];
                    stackIn_62_1 = param2;
                    stackIn_62_2 = param5 / 4;
                    stackIn_62_3 = uh.field_e[1][0] >> 3;
                    if (0 != var12_int % 2) {
                      stackIn_63_4 = param5 / 2;
                    } else {
                      stackIn_63_4 = 0;
                    }
                    ((ru) (Object) stackIn_62_0).c(stackIn_62_1 + (stackIn_62_2 - (stackIn_62_3 - stackIn_63_4)), 40 + (var10 - (uh.field_e[1][1] >> 3)));
                  }
                }
                if (MatchConditionEntry.a(80 + param1, (byte) 94) < var10) {
                  break scanLoop1;
                }
                if (1 == var12_int % 2) {
                  var10 += 80;
                }
                SoftwareRaster.f(param2 + 8, 40 + param8 + 4, param2 + param5 - 8, -4 + param8 - (-param1 + 40));
                var11++;
              } else {
                var11++;
                if (var12_int % 2 == 1) {
                  var10 += 80;
                }
              }
              var12_int++;
              continue;
            }
            break;
          }
          SoftwareRaster.a();
          if (kd.field_X > -1) {
            stackIn_87_0 = kd.field_X;
            stackIn_87_1 = pg.playerProfile.getUnlockLevel(0);
            stackIn_88_2 = !(hi.field_j < 2);
            if (!ue.a(stackIn_87_0, stackIn_87_1, stackIn_88_2, var9_int, -1208926000, ei.field_e[0])) {
              param4 += 10;
              param3 += 30;
              var12 = null;
              if (el.field_f[kd.field_X][var9_int] <= pg.playerProfile.getUnlockLevel(param7 ^ -40)) {
                if (ve.field_a[kd.field_X][var9_int] < 0) {
                  var12 = "Unavailable to lowly players";
                } else {
                  if ((ve.field_a[kd.field_X][var9_int] & 504) != 504) {
                    var13Lifetime1 = 0;
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (16 > var18) {
                      if (0 != (1 << var18 & ve.field_a[kd.field_X][var9_int])) {
                        if (var13Lifetime1 != 0 &&
                          var12 != null) {
                          var12 = fo.a(param7 + 4840, gk.field_L, new String[]{(String) (var12), so.field_a[var18]});
                        } else {
                          var12 = so.field_a[var18];
                        }
                        var13Lifetime1 = 1;
                      }
                      var18++;
                    }
                  } else {
                    var12 = vs.field_i;
                  }
                }
              } else {
                var12 = fo.a(4800, ll.field_Jb, new String[]{Integer.toString(el.field_f[kd.field_X][var9_int])});
              }
              if (var12 != null) {
                var19 = fo.a(4800, co.field_s, new String[]{(String) (var12)});
                var12 = var19;
                var13Lifetime1Lifetime1 = en.field_E.a(var19);
                if (var13Lifetime1Lifetime1 + param4 > db.a(true, 620)) {
                  param4 = db.a(true, 620) - var13Lifetime1Lifetime1;
                }
                if (10 + param3 > MatchConditionEntry.a(480, (byte) 94)) {
                  param3 -= 30;
                }
                SoftwareRaster.a(-6 + param4, param3 - 11, var13Lifetime1Lifetime1 + 12, 15, 5, 0, 128);
                en.field_E.b((String) (var12), param4, param3, 16777215, -1);
              }
            }
          }
          stackIn_115_0 = var9_int;
          return stackIn_115_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var9), "ib.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final boolean a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_k.field_v.toLowerCase();
          var4 = param0.toLowerCase();
          var5 = 53 / ((82 - param1) / 44);
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var6 = var3.lastIndexOf("@");
            if (var6 >= 0 &&
              var6 < var3.length() - 1) {
              var7 = var3.substring(0, var6);
              var8 = var3.substring(var6 + 1);
              if (0 <= var4.indexOf(var7)) {
                return true;
              }
              if (var4.indexOf(var8) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ib.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    ib(fn param0, fn param1, fn param2) {
        super(param0);
        try {
          this.field_k = param2;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 40) {
          ib.a(127, true, 27, -95);
        }
        if (!iu.field_h) {
          return;
        }
        OwnerChangeEvent.field_E.a(true, param1);
        int var4 = qd.field_I.d((byte) 91) ? 1 : 0;
        if (DeployEvent.field_A != 0 &&
          var4 == 0) {
          param1 = false;
          qu.e(-3);
        }
        if (param1) {
          qd.field_I.a(param3, (byte) -42, param2);
        }
        if (var4 != 0) {
          OwnerChangeEvent.field_E.a(true, param1);
        }
        int var5 = qd.field_I.e((byte) -123) + qd.field_I.field_V;
        if (var5 > 640) {
          TelefragEvent.field_z = TelefragEvent.field_z + 5;
        } else {
          if (635 > var5 &&
            !(0 >= TelefragEvent.field_z)) {
            TelefragEvent.field_z = TelefragEvent.field_z - 5;
          }
        }
    }

    static {
    }
}
