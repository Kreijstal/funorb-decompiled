/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lbb implements ntb {
    static String field_c;
    private int field_b;
    private int[] field_j;
    private int field_e;
    private int field_d;
    private qqb field_f;
    private qdb field_i;
    private int field_a;
    static String field_h;
    et[] field_g;

    final int d(byte param0) {
        int var2 = -14 / ((param0 - -56) / 40);
        return ((lbb) this).field_i.field_f;
    }

    final int g(byte param0) {
        if (param0 <= 39) {
            ((lbb) this).field_d = -39;
        }
        return ((lbb) this).field_b;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              var5 = (lbb) (Object) param0;
              boolean discarded$3 = tja.a((ntb[]) (Object) var5.field_g, 1, (ntb[]) (Object) var5.field_g, false, 5547);
              if (null == var5.field_i) {
                break L1;
              } else {
                if (var5.field_i != null) {
                  var5.field_i.a((tv) (Object) var5.field_i, -123);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == var5.field_f) {
                break L2;
              } else {
                if (null != var5.field_f) {
                  var5.field_f.a((tv) (Object) var5.field_f, -102);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var4 = 0;
              if (var5.field_d == var5.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int mission_phase has changed. before=" + var5.field_d + ", now=" + var5.field_d);
                break L3;
              }
            }
            L4: {
              if (var5.field_e == var5.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int phase_change_countdown has changed. before=" + var5.field_e + ", now=" + var5.field_e);
                break L4;
              }
            }
            L5: {
              if (var5.field_a != var5.field_a) {
                System.out.println("int phase_timer has changed. before=" + var5.field_a + ", now=" + var5.field_a);
                var4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var5.field_b != var5.field_b) {
                var4 = 1;
                System.out.println("int winner has changed. before=" + var5.field_b + ", now=" + var5.field_b);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (dn.a((tv[]) (Object) var5.field_g, false, 1, (tv[]) (Object) var5.field_g, -77)) {
                System.out.println("MissionVariable[] custom_variables has changed. ");
                var4 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            if (param1 < -19) {
              qdb discarded$4 = var5.field_i;
              L8: {
                if (var5.field_i == null) {
                  break L8;
                } else {
                  if (!var5.field_i.a((byte) 84, (tv) (Object) var5.field_i)) {
                    break L8;
                  } else {
                    System.out.println("MissionGenerationData nextround has changed. before=" + var5.field_i + ", now=" + var5.field_i);
                    var4 = 1;
                    break L8;
                  }
                }
              }
              L9: {
                if (!ikb.a(var5.field_j, var5.field_j, false)) {
                  break L9;
                } else {
                  System.out.println("int[] teamscores has changed. ");
                  var4 = 1;
                  break L9;
                }
              }
              qqb discarded$5 = var5.field_f;
              L10: {
                if (null == var5.field_f) {
                  break L10;
                } else {
                  if (!var5.field_f.a((byte) 126, (tv) (Object) var5.field_f)) {
                    break L10;
                  } else {
                    System.out.println("MatchResults current_match has changed. before=" + var5.field_f + ", now=" + var5.field_f);
                    var4 = 1;
                    break L10;
                  }
                }
              }
              L11: {
                if (var4 != 0) {
                  System.out.println("This instance of MissionState has changed");
                  break L11;
                } else {
                  break L11;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("lbb.F(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, rsb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        bea var8 = null;
        bea var9 = null;
        Random var10 = null;
        String var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var8 = new bea();
              var9 = var8;
              var9.field_d = this.a((byte) 120);
              if (!qab.a(param0 + 92, ((lbb) this).d(6472))) {
                break L1;
              } else {
                var10 = new Random((long)var9.field_d);
                this.b(-1, param1);
                ((lbb) this).a(var10, 2196, param1);
                break L1;
              }
            }
            L2: {
              var9.field_c = ((lbb) this).c(true);
              var9.a(91, param1);
              if (vpa.a((byte) -125)) {
                var11 = ih.field_f[param1.field_e.d(6472)];
                qa.a(202, "missions_started_" + var11, 1);
                qa.a(param0 + 202, "missions_started", 1);
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= var9.field_c.length) {
                    break L2;
                  } else {
                    L4: {
                      var6 = var8.field_c[var5_int];
                      if (0 < var6) {
                        qa.a(param0 + 202, "votes_for_" + ih.field_f[var5_int], var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            this.b(-1);
            ((lbb) this).c(5, -7, 0);
            ((lbb) this).field_b = -1;
            ((lbb) this).field_e = 0;
            var4 = param0;
            L5: while (true) {
              if (var4 >= param1.field_c.length) {
                break L0;
              } else {
                var5 = param1.a(var4, (byte) 59);
                var5.b((byte) 127);
                var5.b(-1);
                var5.field_k = null;
                var4++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("lbb.NA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = -41 % ((14 - param0) / 41);
            if (((lbb) this).field_d == 0) {
              break L1;
            } else {
              if (((lbb) this).field_d == 1) {
                break L1;
              } else {
                if (((lbb) this).field_d == 2) {
                  break L1;
                } else {
                  if (((lbb) this).field_d != 3) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final int e(byte param0) {
        int var2 = -113 % ((-74 - param0) / 52);
        return ((lbb) this).field_e;
    }

    private final boolean a(boolean param0, rsb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tfa var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (!param0) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.field_c.length) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    var4 = param1.a(var3_int, (byte) 59);
                    if (!var4.field_a) {
                      break L2;
                    } else {
                      if (54 != var4.field_b) {
                        break L2;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("lbb.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(Random param0, int param1, rsb param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tfa var8_ref_tfa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tfa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var20 = new int[2];
            var19 = var20;
            var18 = var19;
            var17 = var18;
            var4_array = var17;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (param2.field_c.length <= var7) {
                var7 = -var6 + var5;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= var7) {
                    L3: {
                      if (param1 == 2196) {
                        break L3;
                      } else {
                        field_h = null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    L4: {
                      var9 = var7 + -var8;
                      var10 = 0;
                      if (1 >= var9) {
                        break L4;
                      } else {
                        var10 = hob.a(param0, var9, 122);
                        break L4;
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    L5: while (true) {
                      if (param2.field_c.length <= var12) {
                        var8++;
                        continue L2;
                      } else {
                        var13 = param2.a(var12, (byte) 59);
                        var14 = var13.field_h;
                        if (var13.field_a) {
                          if (var14 < 0) {
                            L6: {
                              if (var11 == var10) {
                                var15 = ccb.a(param0, var20, (byte) -21, false);
                                var13.field_h = var15;
                                var4_array[var15] = var4_array[var15] + 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var11++;
                            var12++;
                            continue L5;
                          } else {
                            L7: {
                              if (var20.length > var14) {
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var12++;
                            continue L5;
                          }
                        } else {
                          L8: {
                            if (foa.field_p == 0) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var12++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                L9: {
                  var8_ref_tfa = param2.a(var7, (byte) 59);
                  if (var8_ref_tfa.field_a) {
                    break L9;
                  } else {
                    if (foa.field_p != 0) {
                      break L9;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                L10: {
                  var5++;
                  var9 = var8_ref_tfa.field_h;
                  if (var9 < 0) {
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("lbb.I(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44).append(param1).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    final void b(boolean param0) {
        nkb.a(param0, "Skipping phase countdown for " + ((lbb) this).field_d);
        ((lbb) this).field_e = 0;
        if (param0) {
            ((lbb) this).field_g = null;
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa var3_ref = null;
        et[] var4 = null;
        int var5 = 0;
        et[] var6 = null;
        int var7 = 0;
        et var8 = null;
        int var9 = 0;
        faa var10 = null;
        int stackIn_6_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        faa stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        faa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        faa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        faa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        faa stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        faa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        faa stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        faa stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            param0.a(-632, ((lbb) this).field_d, 32);
            param0.a(-632, ((lbb) this).field_e, 32);
            param0.a(-632, ((lbb) this).field_a, 32);
            param0.a(-632, ((lbb) this).field_b, 32);
            var10 = param0;
            var3_ref = var10;
            if (param1 < -109) {
              L1: {
                var4 = ((lbb) this).field_g;
                if (var4 == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = var4.length;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var5 = stackIn_6_0;
                var10.a(-632, var5, 8);
                if (0 != var5) {
                  var6 = var4;
                  var7 = 0;
                  L3: while (true) {
                    if (var6.length <= var7) {
                      break L2;
                    } else {
                      L4: {
                        var8 = var6[var7];
                        stackOut_10_0 = (faa) var3_ref;
                        stackOut_10_1 = 80;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var8 == null) {
                          stackOut_12_0 = (faa) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L4;
                        } else {
                          stackOut_11_0 = (faa) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L4;
                        }
                      }
                      L5: {
                        if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                          stb.a(2, 1, var10, (tv) (Object) var8);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L6: {
                stackOut_17_0 = (faa) param0;
                stackOut_17_1 = 99;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (((lbb) this).field_i == null) {
                  stackOut_19_0 = (faa) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (faa) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              L7: {
                if (vq.a(stackIn_20_0, stackIn_20_1, stackIn_20_2 != 0)) {
                  ((lbb) this).field_i.b(param0, -112);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                stackOut_23_0 = 8;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (((lbb) this).field_j != null) {
                  stackOut_25_0 = stackIn_25_0;
                  stackOut_25_1 = ((lbb) this).field_j.length;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L8;
                } else {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L8;
                }
              }
              L9: {
                pgb.a(stackIn_26_0, stackIn_26_1, 76, param0, ((lbb) this).field_j);
                stackOut_26_0 = (faa) param0;
                stackOut_26_1 = 84;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (((lbb) this).field_f == null) {
                  stackOut_28_0 = (faa) (Object) stackIn_28_0;
                  stackOut_28_1 = stackIn_28_1;
                  stackOut_28_2 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L9;
                } else {
                  stackOut_27_0 = (faa) (Object) stackIn_27_0;
                  stackOut_27_1 = stackIn_27_1;
                  stackOut_27_2 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  break L9;
                }
              }
              L10: {
                if (vq.a(stackIn_29_0, stackIn_29_1, stackIn_29_2 != 0)) {
                  ((lbb) this).field_f.b(param0, -126);
                  break L10;
                } else {
                  break L10;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("lbb.B(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 2) {
            ((lbb) this).field_j = null;
        }
        et var6 = ((lbb) this).c(-1, param2);
        et var7 = var6;
        if (!(var7 == null)) {
            var7.field_a = param1;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 < 15) {
            return true;
        }
        return wh.a(param0, (byte) 99, param1) & (((param1 & 8192) != 0 ? true : false) | bla.a(param1, false, param0) | hsb.a(param0, 65536, param1));
    }

    public final boolean a(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5 = (lbb) (Object) param1;
                var4 = 97 / ((param0 - 22) / 59);
                if (var5.field_d != var5.field_d) {
                  break L2;
                } else {
                  if (var5.field_e != var5.field_e) {
                    break L2;
                  } else {
                    if (var5.field_a != var5.field_a) {
                      break L2;
                    } else {
                      if (var5.field_b != var5.field_b) {
                        break L2;
                      } else {
                        if (dn.a((tv[]) (Object) var5.field_g, false, 1, (tv[]) (Object) var5.field_g, -22)) {
                          break L2;
                        } else {
                          qdb discarded$2 = var5.field_i;
                          L3: {
                            if (var5.field_i == null) {
                              break L3;
                            } else {
                              if (var5.field_i.a((byte) -74, (tv) (Object) var5.field_i)) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          if (wpb.a(var5.field_j, var5.field_j, (byte) 28)) {
                            break L2;
                          } else {
                            qqb discarded$3 = var5.field_f;
                            L4: {
                              if (var5.field_f == null) {
                                break L4;
                              } else {
                                if (!var5.field_f.a((byte) -57, (tv) (Object) var5.field_f)) {
                                  break L4;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = 1;
              stackIn_18_0 = stackOut_16_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("lbb.C(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final int d(int param0) {
        if (param0 != 6472) {
            Object var3 = null;
            this.a((int[]) null, false);
        }
        return ((lbb) this).field_i.field_b;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -8) {
            ((lbb) this).b(54, -62, 111);
        }
        int var4 = ((lbb) this).b(7061, param2);
        ((lbb) this).b(2, var4 - -param1, param2);
    }

    private final void a(rsb param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tfa var8 = null;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = -2147483648;
            var5 = -1;
            var7 = 28 / ((-37 - param1) / 47);
            var6 = 0;
            L1: while (true) {
              if (param0.field_c.length <= var6) {
                L2: {
                  if (var5 < 0) {
                    break L2;
                  } else {
                    param0.a(var5, (byte) 59).a(255);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param0.a(var6, (byte) 59);
                  if (!var8.a((byte) -43)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("lbb.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0) {
        if (param0 < 125) {
            return;
        }
        nkb.a(false, "Extending phase countdown for " + ((lbb) this).field_d);
        ((lbb) this).field_e = ((lbb) this).field_e + 600 * oq.field_l;
    }

    final et a(int param0, int param1) {
        if (param0 != -31634) {
            Object var4 = null;
            this.a((int[]) null, false);
        }
        if (null == ((lbb) this).field_g) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if (((lbb) this).field_g.length <= param1) {
            return null;
        }
        if (((lbb) this).field_g[param1] == null) {
            return null;
        }
        return ((lbb) this).field_g[param1];
    }

    private final int[] a(byte param0, rsb param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_11_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var3 = new int[2];
            var4 = 0;
            L1: while (true) {
              if (param1.field_c.length <= var4) {
                if (param0 == -63) {
                  stackOut_12_0 = (int[]) var3;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (int[]) (Object) stackIn_11_0;
                }
              } else {
                L2: {
                  var5 = param1.a(var4, (byte) 59);
                  if (var5.a((byte) -119)) {
                    var6 = var5.field_h;
                    if (var6 < 0) {
                      break L2;
                    } else {
                      if (var6 >= var3.length) {
                        break L2;
                      } else {
                        var3[var6] = var3[var6] + 1;
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("lbb.S(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final int[] c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            this.a((int[]) null, true);
        }
        return ((lbb) this).field_i.field_c;
    }

    final int f(byte param0) {
        if (param0 >= -87) {
            ((lbb) this).field_a = -116;
        }
        return ((lbb) this).field_a;
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = (lbb) (Object) param1;
              var5.field_b = var5.field_b;
              var5.field_a = var5.field_a;
              var5.field_d = var5.field_d;
              var5.field_e = var5.field_e;
              if (param0 > 54) {
                break L1;
              } else {
                ((lbb) this).field_a = 126;
                break L1;
              }
            }
            L2: {
              var5.field_g = (et[]) (Object) sqb.a((tv[]) (Object) var5.field_g, (tv[]) (Object) var5.field_g, 1, mja.field_p, false);
              if (var5.field_i == null) {
                var5.field_i = null;
                break L2;
              } else {
                L3: {
                  if (null != var5.field_i) {
                    break L3;
                  } else {
                    var5.field_i = new qdb();
                    break L3;
                  }
                }
                var5.field_i.b((byte) 98, (tv) (Object) var5.field_i);
                break L2;
              }
            }
            L4: {
              var5.field_j = dob.a(var5.field_j, (byte) -57, var5.field_j);
              if (null != var5.field_f) {
                L5: {
                  if (var5.field_f != null) {
                    break L5;
                  } else {
                    var5.field_f = new qqb();
                    break L5;
                  }
                }
                var5.field_f.b((byte) 64, (tv) (Object) var5.field_f);
                break L4;
              } else {
                var5.field_f = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("lbb.D(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void a(boolean param0) {
        boolean discarded$0 = lbb.a(111, -111, (byte) -58);
        field_c = null;
        field_h = null;
    }

    private final int a(byte param0) {
        return ((lbb) this).field_i.field_d;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (!((lbb) this).f(24416)) {
                break L1;
              } else {
                if (uaa.a(((lbb) this).d(param0 + 6471), 103) <= 1) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final boolean f(int param0) {
        if (param0 != 24416) {
            field_h = null;
        }
        return ((lbb) this).field_i != null ? true : false;
    }

    private final void a(int param0, byte param1, int param2, rsb param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        tfa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var7_int = 0;
            var9 = -90 % ((-72 - param1) / 52);
            var8 = 0;
            L1: while (true) {
              L2: {
                if (var8 >= param3.field_c.length) {
                  break L2;
                } else {
                  L3: {
                    var10 = param3.a(var8, (byte) 59);
                    if (var10.field_a) {
                      var11 = var10.a(param5, 11863, param5);
                      var12 = var10.a(param4, 11863, param0);
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (param2 <= var12) {
                          break L3;
                        } else {
                          var7_int = 1;
                          break L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
              L4: {
                if (var7_int == 0) {
                  ((lbb) this).field_e = ((lbb) this).field_e - 16;
                  if (((lbb) this).field_e < 0) {
                    ((lbb) this).field_e = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("lbb.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void b(boolean param0, int param1) {
        wna var3 = null;
        if (!(((lbb) this).field_d != 5)) {
            ((lbb) this).field_b = param1;
            if (null != ((lbb) this).field_f) {
                var3 = new wna();
                var3.field_b = ((lbb) this).field_a;
                var3.field_d = ((lbb) this).field_b;
                ((lbb) this).field_f.a(126, var3);
            }
            ((lbb) this).c(6, -7, oq.field_l * 10);
        }
        if (param0) {
            Object var4 = null;
            boolean discarded$0 = ((lbb) this).a((byte) -35, (tv) null);
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 7061) {
            return -10;
        }
        if (null != ((lbb) this).field_g) {
            if (param1 >= 0) {
                if (param1 < ((lbb) this).field_g.length) {
                    if (null == ((lbb) this).field_g[param1]) {
                        return 0;
                    }
                    return ((lbb) this).field_g[param1].field_a;
                }
            }
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        Object var4 = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = ((lbb) this).a((byte) 66, (tv) null);
            break L0;
          }
        }
        if (param1 < 0) {
          return 0;
        } else {
          if (param1 < ((lbb) this).field_j.length) {
            return ((lbb) this).field_j[param1];
          } else {
            return 0;
          }
        }
    }

    private final void b(int param0) {
        if (!(((lbb) this).field_i != null)) {
            return;
        }
        ((lbb) this).field_i.field_f = ((lbb) this).field_i.field_f - 1;
        if (!(((lbb) this).field_i.field_f > 0)) {
            ((lbb) this).field_i = null;
        }
    }

    final et c(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (~param1 > param0) {
            return null;
        }
        if (null != ((lbb) this).field_g) {
            if (((lbb) this).field_g.length > param1) {
                return ((lbb) this).field_g[param1];
            }
        }
        if (null == ((lbb) this).field_g) {
            ((lbb) this).field_g = new et[1 + param1];
            ((lbb) this).field_g[param1] = new et();
            return ((lbb) this).field_g[param1];
        }
        et[] var6 = new et[1 + param1];
        et[] var3 = var6;
        for (var4 = 0; var4 < ((lbb) this).field_g.length; var4++) {
            var6[var4] = ((lbb) this).field_g[var4];
        }
        var3[param1] = new et();
        ((lbb) this).field_g = var3;
        return ((lbb) this).field_g[param1];
    }

    private final int[] a(rsb param0, byte param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        tfa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = new int[31];
            var3 = var9;
            var4 = 0;
            var5 = 126 / ((-8 - param1) / 48);
            L1: while (true) {
              if (var4 >= param0.field_c.length) {
                stackOut_12_0 = (int[]) var9;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  var6 = param0.a(var4, (byte) 59);
                  if (!var6.field_a) {
                    break L2;
                  } else {
                    if (var6.field_i == null) {
                      break L2;
                    } else {
                      if (var6.field_i.length <= 0) {
                        break L2;
                      } else {
                        var7 = 0;
                        L3: while (true) {
                          if (var7 >= var6.field_i.length) {
                            break L2;
                          } else {
                            L4: {
                              if (var6.field_i[var7] < 0) {
                                break L4;
                              } else {
                                var9[var6.field_i[var7]] = var9[var6.field_i[var7]] + 1;
                                break L4;
                              }
                            }
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("lbb.W(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            ((lbb) this).a(-126);
        }
        ((lbb) this).field_i = new qdb();
        ((lbb) this).field_i.field_d = param0;
        ((lbb) this).field_i.field_b = param2;
        ((lbb) this).field_i.field_f = uaa.a(param2, param1 ^ 57);
        ((lbb) this).field_f = new qqb();
    }

    final qqb b(byte param0) {
        if (param0 > -45) {
            return null;
        }
        return ((lbb) this).field_f;
    }

    private final void b(int param0, rsb param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var9 = this.a((byte) -63, param1);
              var3 = var9;
              var4 = -var9[1] + var9[0];
              var5 = param0;
              if (var4 > 1) {
                var5 = 0;
                break L1;
              } else {
                if (var4 < -1) {
                  var5 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var5 == -1) {
                break L2;
              } else {
                var6 = Math.abs(var4) / 2;
                var7 = 0;
                L3: while (true) {
                  if (~var7 <= ~var6) {
                    break L2;
                  } else {
                    this.a(param1, (byte) -128, var5);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("lbb.N(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void a(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((lbb) this).field_i.field_c = param0;
              if (!param1) {
                break L1;
              } else {
                var4 = null;
                ((lbb) this).a((faa) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lbb.JA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final int e(int param0) {
        if (param0 != 8) {
            return -38;
        }
        return ((lbb) this).field_d;
    }

    final et[] d(boolean param0) {
        if (param0) {
            int discarded$0 = ((lbb) this).d(53);
        }
        return ((lbb) this).field_g;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((lbb) this).field_d = param0.i(0, 32);
              ((lbb) this).field_e = param0.i(0, 32);
              ((lbb) this).field_a = param0.i(0, 32);
              ((lbb) this).field_b = param0.i(0, 32);
              ((lbb) this).field_g = (et[]) (Object) kcb.a(8, mja.field_p, param0, 1, -128, (tv[]) (Object) ((lbb) this).field_g);
              if (kv.a(false, param0)) {
                L2: {
                  if (null != ((lbb) this).field_i) {
                    break L2;
                  } else {
                    ((lbb) this).field_i = new qdb();
                    break L2;
                  }
                }
                ((lbb) this).field_i.a(param0, false);
                break L1;
              } else {
                ((lbb) this).field_i = null;
                break L1;
              }
            }
            L3: {
              ((lbb) this).field_j = wkb.a((byte) 37, ((lbb) this).field_j, param0, 8);
              if (kv.a(param1, param0)) {
                L4: {
                  if (((lbb) this).field_f != null) {
                    break L4;
                  } else {
                    ((lbb) this).field_f = new qqb();
                    break L4;
                  }
                }
                ((lbb) this).field_f.a(param0, false);
                break L3;
              } else {
                ((lbb) this).field_f = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("lbb.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final void a(rsb param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        Random var6_ref_Random = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        pe var14 = null;
        hkb var15 = null;
        hkb var16 = null;
        int[] var19 = null;
        int[] var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((lbb) this).field_e <= 0) {
                break L1;
              } else {
                ((lbb) this).field_e = ((lbb) this).field_e - 1;
                break L1;
              }
            }
            L2: {
              var14 = param0.field_g;
              ((lbb) this).field_a = ((lbb) this).field_a + 1;
              if (param2 == -19) {
                break L2;
              } else {
                var10 = null;
                ((lbb) this).a((rsb) null, -55, (byte) 8);
                break L2;
              }
            }
            L3: {
              if (qrb.field_a != 1) {
                break L3;
              } else {
                if (5 == ((lbb) this).field_d) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (~var5 <= ~param0.field_c.length) {
                      break L3;
                    } else {
                      param0.a(var5, (byte) 59).field_g = null;
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
            }
            L5: {
              L6: {
                if (((lbb) this).field_d == 0) {
                  if (((lbb) this).field_e != 0) {
                    break L6;
                  } else {
                    L7: {
                      if (!ahb.a(param0, (byte) -106)) {
                        stackOut_74_0 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        break L7;
                      } else {
                        stackOut_73_0 = 1;
                        stackIn_75_0 = stackOut_73_0;
                        break L7;
                      }
                    }
                    L8: {
                      var5 = stackIn_75_0;
                      if (var5 != 0) {
                        break L8;
                      } else {
                        L9: {
                          if (!this.a(false, param0)) {
                            stackOut_78_0 = 0;
                            stackIn_79_0 = stackOut_78_0;
                            break L9;
                          } else {
                            stackOut_77_0 = 1;
                            stackIn_79_0 = stackOut_77_0;
                            break L9;
                          }
                        }
                        var5 = stackIn_79_0;
                        break L8;
                      }
                    }
                    if (var5 != 0) {
                      if (((lbb) this).f(24416)) {
                        ((lbb) this).c(3, -7, oq.field_j);
                        break L5;
                      } else {
                        ((lbb) this).c(1, -7, oq.field_h);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                } else {
                  if (((lbb) this).field_d != 1) {
                    if (((lbb) this).field_d == 2) {
                      L10: {
                        if (0 >= ((lbb) this).field_e) {
                          break L10;
                        } else {
                          this.a(30, (byte) -128, ena.field_q, param0, 14, -2);
                          break L10;
                        }
                      }
                      if (((lbb) this).field_e == 0) {
                        var26 = this.a(param0, (byte) -95);
                        this.a(var26, false);
                        if (!qab.a(82, ((lbb) this).field_i.field_b)) {
                          ((lbb) this).c(3, -7, oq.field_j);
                          ((lbb) this).field_e = 0;
                          break L5;
                        } else {
                          ((lbb) this).c(3, -7, oq.field_j);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      if (((lbb) this).field_d != 3) {
                        if (((lbb) this).field_d != 5) {
                          if (((lbb) this).field_d != 6) {
                            break L6;
                          } else {
                            if (0 == ((lbb) this).field_e) {
                              L11: {
                                if (null == ((lbb) this).field_f) {
                                  break L11;
                                } else {
                                  if (((lbb) this).f(24416)) {
                                    break L11;
                                  } else {
                                    if (!qab.a(81, var14.d(false))) {
                                      break L11;
                                    } else {
                                      var5 = ((lbb) this).field_f.a(true);
                                      if (0 > var5) {
                                        break L11;
                                      } else {
                                        if (((lbb) this).field_j.length <= var5) {
                                          break L11;
                                        } else {
                                          ((lbb) this).field_j[var5] = ((lbb) this).field_j[var5] + 1;
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L12: {
                                if (unb.field_o) {
                                  var16 = pba.b(false).a(3, false);
                                  var16.a(true, param0, param2 ^ -112);
                                  break L12;
                                } else {
                                  var15 = bkb.a(0);
                                  var15.a(true, param0, param2 ^ 104);
                                  break L12;
                                }
                              }
                              ((lbb) this).c(0, param2 ^ 20, oq.field_l);
                              if (0 == qv.field_o) {
                                var5 = 0;
                                L13: while (true) {
                                  if (var5 >= param0.field_c.length) {
                                    break L6;
                                  } else {
                                    param0.a(var5, (byte) 59).field_h = -1;
                                    var5++;
                                    continue L13;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          var14.a((byte) 127, param0);
                          if (!this.a(false, param0)) {
                            break L6;
                          } else {
                            ((lbb) this).b(false, -1);
                            break L5;
                          }
                        }
                      } else {
                        L14: {
                          if (1 == dcb.field_f) {
                            var25 = new int[2];
                            var22 = var25;
                            var19 = var22;
                            var13 = var19;
                            var11 = var13;
                            var5_ref_int__ = var11;
                            var6 = 1;
                            var7 = 0;
                            L15: while (true) {
                              if (param0.field_c.length <= var7) {
                                if (var6 == 0) {
                                  break L14;
                                } else {
                                  if (((lbb) this).field_e <= 0) {
                                    break L14;
                                  } else {
                                    ((lbb) this).field_e = ((lbb) this).field_e - 1;
                                    break L14;
                                  }
                                }
                              } else {
                                L16: {
                                  L17: {
                                    if (param0.field_c[var7].field_a) {
                                      break L17;
                                    } else {
                                      if (foa.field_p == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    var8 = param0.a(var7, (byte) 59).field_h;
                                    if (var8 < 0) {
                                      break L18;
                                    } else {
                                      if (var8 < var25.length) {
                                        var11[var8] = var11[var8] + 1;
                                        break L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var6 = 0;
                                  break L16;
                                }
                                var7++;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                        L19: {
                          if (((lbb) this).field_e != 0) {
                            break L19;
                          } else {
                            this.a(0, param0);
                            break L19;
                          }
                        }
                        var14.a((byte) 127, param0);
                        break L5;
                      }
                    }
                  } else {
                    L20: {
                      if (((lbb) this).field_e <= 0) {
                        break L20;
                      } else {
                        this.a(13, (byte) -126, sl.field_a, param0, 0, -1);
                        break L20;
                      }
                    }
                    if (((lbb) this).field_e == 0) {
                      var5 = param1;
                      var6_ref_Random = new Random((long)var5);
                      var24 = this.a(param0, (byte) -96);
                      var8 = 0;
                      L21: while (true) {
                        if (var24.length <= var8) {
                          var8 = sj.a(-126, 14, var6_ref_Random, true, var24);
                          ((lbb) this).a(var5, 1, var8);
                          ((lbb) this).c(2, -7, oq.field_z);
                          break L5;
                        } else {
                          L22: {
                            if (!tla.b(param2 ^ -110, var8)) {
                              var24[var8] = -1;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          var8++;
                          continue L21;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var4;
            stackOut_86_1 = new StringBuilder().append("lbb.O(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L23;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L23;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public lbb() {
        ((lbb) this).field_j = new int[unb.field_p];
        ((lbb) this).field_e = oq.field_l;
        ((lbb) this).field_g = null;
        ((lbb) this).field_d = 0;
        ((lbb) this).field_a = 0;
        ((lbb) this).field_b = -1;
    }

    final void c(int param0, int param1, int param2) {
        ((lbb) this).field_d = param0;
        ((lbb) this).field_e = param2;
        if (!(param1 == ~((lbb) this).field_d)) {
            ((lbb) this).field_g = null;
        }
        ((lbb) this).field_a = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Email (Login):";
        field_c = "Scale down map height";
    }
}
