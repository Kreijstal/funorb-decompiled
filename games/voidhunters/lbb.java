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
        return this.field_i.field_f;
    }

    final int g(byte param0) {
        if (param0 <= 39) {
            this.field_d = -39;
        }
        return this.field_b;
    }

    public final void a(tv param0, int param1) {
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        try {
          L0: {
            L1: {
              var5 = (lbb) ((Object) param0);
              tja.a(var5.field_g, 1, this.field_g, false, 5547);
              if (null == this.field_i) {
                break L1;
              } else {
                if (var5.field_i != null) {
                  this.field_i.a(var5.field_i, -123);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == this.field_f) {
                break L2;
              } else {
                if (null != var5.field_f) {
                  this.field_f.a(var5.field_f, -102);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var4 = 0;
              if (var5.field_d == this.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int mission_phase has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L3;
              }
            }
            L4: {
              if (var5.field_e == this.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int phase_change_countdown has changed. before=" + var5.field_e + ", now=" + this.field_e);
                break L4;
              }
            }
            L5: {
              if (this.field_a != var5.field_a) {
                System.out.println("int phase_timer has changed. before=" + var5.field_a + ", now=" + this.field_a);
                var4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_b != var5.field_b) {
                var4 = 1;
                System.out.println("int winner has changed. before=" + var5.field_b + ", now=" + this.field_b);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (dn.a(var5.field_g, false, 1, this.field_g, -77)) {
                System.out.println("MissionVariable[] custom_variables has changed. ");
                var4 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            if (param1 < -19) {
              L8: {
                if (this.field_i != null) {
                  stackIn_26_0 = 0;
                  break L8;
                } else {
                  stackIn_26_0 = 1;
                  break L8;
                }
              }
              L9: {


                if (var5.field_i != null) {

                  stackIn_29_1 = 0;
                  break L9;
                } else {

                  stackIn_29_1 = 1;
                  break L9;
                }
              }
              L10: {
                L11: {
                  if ((stackIn_26_0 ^ stackIn_29_1) != 0) {
                    break L11;
                  } else {
                    if (this.field_i == null) {
                      break L10;
                    } else {
                      if (!this.field_i.a((byte) 84, var5.field_i)) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                System.out.println("MissionGenerationData nextround has changed. before=" + var5.field_i + ", now=" + this.field_i);
                var4 = 1;
                break L10;
              }
              L12: {
                if (!ikb.a(this.field_j, var5.field_j, false)) {
                  break L12;
                } else {
                  System.out.println("int[] teamscores has changed. ");
                  var4 = 1;
                  break L12;
                }
              }
              L13: {
                if (var5.field_f != null) {
                  stackIn_39_0 = 0;
                  break L13;
                } else {
                  stackIn_39_0 = 1;
                  break L13;
                }
              }
              L14: {


                if (null != this.field_f) {

                  stackIn_42_1 = 0;
                  break L14;
                } else {

                  stackIn_42_1 = 1;
                  break L14;
                }
              }
              L15: {
                L16: {
                  if ((stackIn_39_0 ^ stackIn_42_1) != 0) {
                    break L16;
                  } else {
                    if (null == this.field_f) {
                      break L15;
                    } else {
                      if (!this.field_f.a((byte) 126, var5.field_f)) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                System.out.println("MatchResults current_match has changed. before=" + var5.field_f + ", now=" + this.field_f);
                var4 = 1;
                break L15;
              }
              L17: {
                if (var4 != 0) {
                  System.out.println("This instance of MissionState has changed");
                  break L17;
                } else {
                  break L17;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var3);

            stackIn_53_1 = new StringBuilder().append("lbb.F(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L18;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L18;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, rsb param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var8 = new bea();
              var9 = var8;
              var9.field_d = this.a((byte) 120);
              if (!qab.a(param0 + 92, this.d(6472))) {
                break L1;
              } else {
                var10 = new Random((long)var9.field_d);
                this.b(-1, param1);
                this.a(var10, 2196, param1);
                break L1;
              }
            }
            L2: {
              var9.field_c = this.c(true);
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
            this.c(5, -7, 0);
            this.field_b = -1;
            this.field_e = 0;
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
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("lbb.NA(").append(param0).append(',');

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
    }

    final boolean c(byte param0) {
        int var2;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var2 = -41 % ((14 - param0) / 41);
            if (this.field_d == 0) {
              break L1;
            } else {
              if (this.field_d == 1) {
                break L1;
              } else {
                if ((this.field_d ^ -1) == -3) {
                  break L1;
                } else {
                  if (this.field_d != 3) {
                    stackIn_7_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final int e(byte param0) {
        int var2 = -113 % ((-74 - param0) / 52);
        return this.field_e;
    }

    private final boolean a(boolean param0, rsb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tfa var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (!param0) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.field_c.length) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
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
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("lbb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final void a(Random param0, int param1, rsb param2) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
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
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var18 = new int[2];
            var17 = var18;
            var4 = var17;
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
                        field_h = (String) null;
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
                        L6: {
                          var13 = param2.a(var12, (byte) 59);
                          var14 = var13.field_h;
                          if (var13.field_a) {
                            break L6;
                          } else {
                            if (-1 != (foa.field_p ^ -1)) {
                              break L6;
                            } else {
                              var12++;
                              continue L5;
                            }
                          }
                        }
                        L7: {
                          if ((var14 ^ -1) > -1) {
                            break L7;
                          } else {
                            if (var18.length <= var14) {
                              break L7;
                            } else {
                              var12++;
                              continue L5;
                            }
                          }
                        }
                        L8: {
                          if (var11 == var10) {
                            var15 = ccb.a(param0, var18, (byte) -21, false);
                            var13.field_h = var15;
                            var4[var15] = var4[var15] + 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var11++;
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  L10: {
                    var8_ref_tfa = param2.a(var7, (byte) 59);
                    if (var8_ref_tfa.field_a) {
                      break L10;
                    } else {
                      if (-1 != (foa.field_p ^ -1)) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var5++;
                  var9 = var8_ref_tfa.field_h;
                  if (var9 >= 0) {
                    if (var9 < var18.length) {
                      var6++;
                      var4[var9] = var4[var9] + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    var7++;
                    continue L1;
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
            var4_ref = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var4_ref);

            stackIn_36_1 = new StringBuilder().append("lbb.I(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ')');
        }
    }

    final void b(boolean param0) {
        nkb.a(param0, "Skipping phase countdown for " + this.field_d);
        this.field_e = 0;
        if (param0) {
            this.field_g = (et[]) null;
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        faa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        faa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        et[] var4 = null;
        int var5 = 0;
        et[] var6 = null;
        int var7 = 0;
        et var8 = null;
        int var9 = 0;
        faa var10 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            param0.a(-632, this.field_d, 32);
            param0.a(-632, this.field_e, 32);
            param0.a(-632, this.field_a, 32);
            param0.a(-632, this.field_b, 32);
            var10 = param0;
            var3 = var10;
            if (param1 < -109) {
              L1: {
                var4 = this.field_g;
                if (var4 == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = var4.length;
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
                        stackIn_12_0 = (faa) (var3);

                        stackIn_12_1 = 80;

                        if (var8 == null) {
                          stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 0;
                          break L4;
                        } else {
                          stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 1;
                          break L4;
                        }
                      }
                      L5: {
                        if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                          stb.a(2, 1, var10, var8);
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
                stackIn_19_0 = (faa) (param0);

                stackIn_19_1 = 99;

                if (this.field_i == null) {
                  stackIn_20_0 = (faa) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = 0;
                  break L6;
                } else {
                  stackIn_20_0 = (faa) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = 1;
                  break L6;
                }
              }
              L7: {
                if (vq.a(stackIn_20_0, stackIn_20_1, stackIn_20_2 != 0)) {
                  this.field_i.b(param0, -112);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                stackIn_25_0 = 8;

                if (this.field_j != null) {
                  stackIn_26_0 = stackIn_25_0;
                  stackIn_26_1 = this.field_j.length;
                  break L8;
                } else {
                  stackIn_26_0 = stackIn_25_0;
                  stackIn_26_1 = 0;
                  break L8;
                }
              }
              L9: {
                pgb.a(stackIn_26_0, stackIn_26_1, 76, param0, this.field_j);
                stackIn_28_0 = (faa) (param0);

                stackIn_28_1 = 84;

                if (this.field_f == null) {
                  stackIn_29_0 = (faa) ((Object) stackIn_28_0);
                  stackIn_29_1 = stackIn_28_1;
                  stackIn_29_2 = 0;
                  break L9;
                } else {
                  stackIn_29_0 = (faa) ((Object) stackIn_28_0);
                  stackIn_29_1 = stackIn_28_1;
                  stackIn_29_2 = 1;
                  break L9;
                }
              }
              L10: {
                if (vq.a(stackIn_29_0, stackIn_29_1, stackIn_29_2 != 0)) {
                  this.field_f.b(param0, -126);
                  break L10;
                } else {
                  break L10;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3_ref = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3_ref);

            stackIn_35_1 = new StringBuilder().append("lbb.B(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 2) {
            this.field_j = (int[]) null;
        }
        et var6 = this.c(-1, param2);
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
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5 = (lbb) ((Object) param1);
                var4 = 97 / ((param0 - 22) / 59);
                if (this.field_d != var5.field_d) {
                  break L2;
                } else {
                  if (this.field_e != var5.field_e) {
                    break L2;
                  } else {
                    if (this.field_a != var5.field_a) {
                      break L2;
                    } else {
                      if (this.field_b != var5.field_b) {
                        break L2;
                      } else {
                        if (dn.a(var5.field_g, false, 1, this.field_g, -22)) {
                          break L2;
                        } else {
                          L3: {
                            if (var5.field_i != null) {
                              stackIn_8_0 = 0;
                              break L3;
                            } else {
                              stackIn_8_0 = 1;
                              break L3;
                            }
                          }
                          L4: {


                            if (this.field_i != null) {

                              stackIn_11_1 = 0;
                              break L4;
                            } else {

                              stackIn_11_1 = 1;
                              break L4;
                            }
                          }
                          if ((stackIn_8_0 ^ stackIn_11_1) != 0) {
                            break L2;
                          } else {
                            L5: {
                              if (this.field_i == null) {
                                break L5;
                              } else {
                                if (this.field_i.a((byte) -74, var5.field_i)) {
                                  break L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (wpb.a(var5.field_j, this.field_j, (byte) 28)) {
                              break L2;
                            } else {
                              L6: {
                                if (null != this.field_f) {
                                  stackIn_19_0 = 0;
                                  break L6;
                                } else {
                                  stackIn_19_0 = 1;
                                  break L6;
                                }
                              }
                              L7: {


                                if (var5.field_f != null) {

                                  stackIn_22_1 = 0;
                                  break L7;
                                } else {

                                  stackIn_22_1 = 1;
                                  break L7;
                                }
                              }
                              if ((stackIn_19_0 ^ stackIn_22_1) != 0) {
                                break L2;
                              } else {
                                L8: {
                                  if (this.field_f == null) {
                                    break L8;
                                  } else {
                                    if (!this.field_f.a((byte) -57, var5.field_f)) {
                                      break L8;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                stackIn_28_0 = 0;
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
              stackIn_28_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("lbb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final int d(int param0) {
        if (param0 != 6472) {
            int[] var3 = (int[]) null;
            this.a((int[]) null, false);
        }
        return this.field_i.field_b;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -8) {
            this.b(54, -62, 111);
        }
        int var4 = this.b(7061, param2);
        this.b(2, var4 - -param1, param2);
    }

    private final void a(rsb param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tfa var8 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
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
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    param0.a(var5, (byte) 59).a(255);
                    break L2;
                  }
                }
                break L0;
              } else {
                var8 = param0.a(var6, (byte) 59);
                if (var8.a((byte) -43)) {
                  L3: {
                    if (param2 == var8.field_h) {
                      var9 = var8.field_n + var8.field_c;
                      if (var4_int < var9) {
                        var5 = var9;
                        var5 = var6;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("lbb.KA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        if (param0 < 125) {
            return;
        }
        nkb.a(false, "Extending phase countdown for " + this.field_d);
        this.field_e = this.field_e + 600 * oq.field_l;
    }

    final et a(int param0, int param1) {
        if (param0 != -31634) {
            int[] var4 = (int[]) null;
            this.a((int[]) null, false);
        }
        if (null == this.field_g) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if (this.field_g.length <= param1) {
            return null;
        }
        if (this.field_g[param1] == null) {
            return null;
        }
        return this.field_g[param1];
    }

    private final int[] a(byte param0, rsb param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_11_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var3 = new int[2];
            var4 = 0;
            L1: while (true) {
              if (param1.field_c.length <= var4) {
                if (param0 == -63) {
                  stackIn_13_0 = (int[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = (int[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var5 = param1.a(var4, (byte) 59);
                  if (var5.a((byte) -119)) {
                    var6 = var5.field_h;
                    if ((var6 ^ -1) > -1) {
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
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("lbb.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final int[] c(boolean param0) {
        if (!param0) {
            int[] var3 = (int[]) null;
            this.a((int[]) null, true);
        }
        return this.field_i.field_c;
    }

    final int f(byte param0) {
        if (param0 >= -87) {
            this.field_a = -116;
        }
        return this.field_a;
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        lbb var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = (lbb) ((Object) param1);
              var5.field_b = this.field_b;
              var5.field_a = this.field_a;
              var5.field_d = this.field_d;
              var5.field_e = this.field_e;
              if (param0 > 54) {
                break L1;
              } else {
                this.field_a = 126;
                break L1;
              }
            }
            L2: {
              var5.field_g = (et[]) ((Object) sqb.a(var5.field_g, this.field_g, 1, mja.field_p, false));
              if (this.field_i == null) {
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
                this.field_i.b((byte) 98, var5.field_i);
                break L2;
              }
            }
            L4: {
              var5.field_j = dob.a(var5.field_j, (byte) -57, this.field_j);
              if (null != this.field_f) {
                L5: {
                  if (var5.field_f != null) {
                    break L5;
                  } else {
                    var5.field_f = new qqb();
                    break L5;
                  }
                }
                this.field_f.b((byte) 64, var5.field_f);
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("lbb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            lbb.a(111, -111, (byte) -58);
        }
        field_c = null;
        field_h = null;
    }

    private final int a(byte param0) {
        if (param0 != 120) {
            return 73;
        }
        return this.field_i.field_d;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (!this.f(24416)) {
                break L1;
              } else {
                if (uaa.a(this.d(param0 + 6471), 103) <= 1) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final boolean f(int param0) {
        if (param0 != 24416) {
            field_h = (String) null;
        }
        return this.field_i != null ? true : false;
    }

    private final void a(int param0, byte param1, int param2, rsb param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        tfa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
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
                  this.field_e = this.field_e - 16;
                  if ((this.field_e ^ -1) > -1) {
                    this.field_e = 0;
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
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("lbb.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        wna var3 = null;
        if (!(this.field_d != 5)) {
            this.field_b = param1;
            if (null != this.field_f) {
                var3 = new wna();
                var3.field_b = this.field_a;
                var3.field_d = this.field_b;
                this.field_f.a(126, var3);
            }
            this.c(6, -7, oq.field_l * 10);
        }
        if (param0) {
            tv var4 = (tv) null;
            this.a((byte) -35, (tv) null);
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 7061) {
            return -10;
        }
        if (null != this.field_g && (param1 ^ -1) <= -1 && param1 < this.field_g.length) {
            if (null == this.field_g[param1]) {
                return 0;
            }
            return this.field_g[param1].field_a;
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        tv var4;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var4 = (tv) null;
            this.a((byte) 66, (tv) null);
            break L0;
          }
        }
        if (-1 < (param1 ^ -1)) {
          return 0;
        } else {
          if (param1 < this.field_j.length) {
            return this.field_j[param1];
          } else {
            return 0;
          }
        }
    }

    private final void b(int param0) {
        if (!(this.field_i != null)) {
            return;
        }
        this.field_i.field_f = this.field_i.field_f - 1;
        if (!(param0 > (this.field_i.field_f ^ -1))) {
            this.field_i = null;
        }
    }

    final et c(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if ((param1 ^ -1) > param0) {
            return null;
        }
        if (null != this.field_g && this.field_g.length > param1) {
            return this.field_g[param1];
        }
        if (null == this.field_g) {
            this.field_g = new et[1 + param1];
            this.field_g[param1] = new et();
            return this.field_g[param1];
        }
        et[] var6 = new et[1 + param1];
        et[] var3 = var6;
        for (var4 = 0; var4 < this.field_g.length; var4++) {
            var6[var4] = this.field_g[var4];
        }
        var3[param1] = new et();
        this.field_g = var3;
        return this.field_g[param1];
    }

    private final int[] a(rsb param0, byte param1) {
        int dupTemp$1 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        tfa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = new int[31];
            var3 = var9;
            var4 = 0;
            var5 = 126 / ((-8 - param1) / 48);
            L1: while (true) {
              if (var4 >= param0.field_c.length) {
                stackIn_13_0 = (int[]) (var9);
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
                      if ((var6.field_i.length ^ -1) >= -1) {
                        break L2;
                      } else {
                        var7 = 0;
                        L3: while (true) {
                          if (var7 >= var6.field_i.length) {
                            break L2;
                          } else {
                            L4: {
                              if ((var6.field_i[var7] ^ -1) > -1) {
                                break L4;
                              } else {
                                dupTemp$1 = var6.field_i[var7];
                                var9[dupTemp$1] = var9[dupTemp$1] + 1;
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
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("lbb.W(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            this.a(-126);
        }
        this.field_i = new qdb();
        this.field_i.field_d = param0;
        this.field_i.field_b = param2;
        this.field_i.field_f = uaa.a(param2, param1 ^ 57);
        this.field_f = new qqb();
    }

    final qqb b(byte param0) {
        if (param0 > -45) {
            return (qqb) null;
        }
        return this.field_f;
    }

    private final void b(int param0, rsb param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var6 = 0;
        int var7 = 0;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var9 = this.a((byte) -63, param1);
              var3 = var9;
              var4 = -var9[1] + var9[0];
              var5 = param0;
              if ((var4 ^ -1) < -2) {
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
              if (0 == (var5 ^ -1)) {
                break L2;
              } else {
                var6 = Math.abs(var4) / 2;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
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
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("lbb.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void a(int[] param0, boolean param1) {
        try {
            this.field_i.field_c = param0;
            if (param1) {
                faa var4 = (faa) null;
                this.a((faa) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lbb.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        if (param0 != 8) {
            return -38;
        }
        return this.field_d;
    }

    final et[] d(boolean param0) {
        if (param0) {
            this.d(53);
        }
        return this.field_g;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_d = param0.i(0, 32);
              this.field_e = param0.i(0, 32);
              this.field_a = param0.i(0, 32);
              this.field_b = param0.i(0, 32);
              this.field_g = (et[]) ((Object) kcb.a(8, mja.field_p, param0, 1, -128, this.field_g));
              if (kv.a(false, param0)) {
                L2: {
                  if (null != this.field_i) {
                    break L2;
                  } else {
                    this.field_i = new qdb();
                    break L2;
                  }
                }
                this.field_i.a(param0, false);
                break L1;
              } else {
                this.field_i = null;
                break L1;
              }
            }
            L3: {
              this.field_j = wkb.a((byte) 37, this.field_j, param0, 8);
              if (kv.a(param1, param0)) {
                L4: {
                  if (this.field_f != null) {
                    break L4;
                  } else {
                    this.field_f = new qqb();
                    break L4;
                  }
                }
                this.field_f.a(param0, false);
                break L3;
              } else {
                this.field_f = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lbb.H(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void a(rsb param0, int param1, byte param2) {
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Random var6_ref_Random = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        rsb var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        pe var14 = null;
        hkb var15 = null;
        hkb var16 = null;
        int[] var19 = null;
        int[] var23 = null;
        int[] var24 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((this.field_e ^ -1) >= -1) {
                break L1;
              } else {
                this.field_e = this.field_e - 1;
                break L1;
              }
            }
            L2: {
              var14 = param0.field_g;
              this.field_a = this.field_a + 1;
              if (param2 == -19) {
                break L2;
              } else {
                var10 = (rsb) null;
                this.a((rsb) null, -55, (byte) 8);
                break L2;
              }
            }
            L3: {
              if ((qrb.field_a ^ -1) != -2) {
                break L3;
              } else {
                if (5 == this.field_d) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= param0.field_c.length) {
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
                if (this.field_d == 0) {
                  if (this.field_e != 0) {
                    break L6;
                  } else {
                    L7: {
                      if (!ahb.a(param0, (byte) -106)) {
                        stackIn_75_0 = 0;
                        break L7;
                      } else {
                        stackIn_75_0 = 1;
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
                            stackIn_79_0 = 0;
                            break L9;
                          } else {
                            stackIn_79_0 = 1;
                            break L9;
                          }
                        }
                        var5 = stackIn_79_0;
                        break L8;
                      }
                    }
                    if (var5 != 0) {
                      if (this.f(24416)) {
                        this.c(3, -7, oq.field_j);
                        break L5;
                      } else {
                        this.c(1, -7, oq.field_h);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                } else {
                  if (this.field_d != 1) {
                    if (-3 == (this.field_d ^ -1)) {
                      L10: {
                        if (0 >= this.field_e) {
                          break L10;
                        } else {
                          this.a(30, (byte) -128, ena.field_q, param0, 14, -2);
                          break L10;
                        }
                      }
                      if (-1 == (this.field_e ^ -1)) {
                        var24 = this.a(param0, (byte) -95);
                        this.a(var24, false);
                        if (!qab.a(82, this.field_i.field_b)) {
                          this.c(3, -7, oq.field_j);
                          this.field_e = 0;
                          break L5;
                        } else {
                          this.c(3, -7, oq.field_j);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      if (this.field_d != 3) {
                        if (-6 != (this.field_d ^ -1)) {
                          if (this.field_d != 6) {
                            break L6;
                          } else {
                            if (0 == this.field_e) {
                              L11: {
                                if (null == this.field_f) {
                                  break L11;
                                } else {
                                  if (this.f(24416)) {
                                    break L11;
                                  } else {
                                    if (!qab.a(81, var14.d(false))) {
                                      break L11;
                                    } else {
                                      var5 = this.field_f.a(true);
                                      if (0 > var5) {
                                        break L11;
                                      } else {
                                        if (this.field_j.length <= var5) {
                                          break L11;
                                        } else {
                                          this.field_j[var5] = this.field_j[var5] + 1;
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
                              this.c(0, param2 ^ 20, oq.field_l * 1);
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
                            this.b(false, -1);
                            break L5;
                          }
                        }
                      } else {
                        L14: {
                          if (1 == dcb.field_f) {
                            var19 = new int[2];
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
                                  if (-1 <= (this.field_e ^ -1)) {
                                    break L14;
                                  } else {
                                    this.field_e = this.field_e - 1;
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
                                    if (-1 < (var8 ^ -1)) {
                                      break L18;
                                    } else {
                                      if (var8 < var19.length) {
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
                          if (this.field_e != 0) {
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
                      if (this.field_e <= 0) {
                        break L20;
                      } else {
                        this.a(13, (byte) -126, sl.field_a, param0, 0, -1);
                        break L20;
                      }
                    }
                    if (-1 == (this.field_e ^ -1)) {
                      var5 = param1;
                      var6_ref_Random = new Random((long)var5);
                      var23 = this.a(param0, (byte) -96);
                      var8 = 0;
                      L21: while (true) {
                        if (var23.length <= var8) {
                          var8 = sj.a(-126, 14, var6_ref_Random, true, var23);
                          this.a(var5, 1, var8);
                          this.c(2, -7, oq.field_z);
                          break L5;
                        } else {
                          L22: {
                            if (!tla.b(param2 ^ -110, var8)) {
                              var23[var8] = -1;
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
            stackIn_88_0 = (RuntimeException) (var4);

            stackIn_88_1 = new StringBuilder().append("lbb.O(");

            if (param0 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L23;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public lbb() {
        this.field_j = new int[unb.field_p];
        this.field_e = 1 * oq.field_l;
        this.field_g = null;
        this.field_d = 0;
        this.field_a = 0;
        this.field_b = -1;
    }

    final void c(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_e = param2;
        if (!(param1 == (this.field_d ^ -1))) {
            this.field_g = null;
        }
        this.field_a = 0;
    }

    static {
        field_h = "Email (Login):";
        field_c = "Scale down map height";
    }
}
