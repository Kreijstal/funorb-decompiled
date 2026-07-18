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
        RuntimeException var3 = null;
        int var4 = 0;
        tfa var5 = null;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 2 / ((param0 - 22) / 59);
                var5 = (tfa) (Object) param1;
                if (super.a((byte) -38, param1)) {
                  break L2;
                } else {
                  if (var5.field_f != var5.field_f) {
                    break L2;
                  } else {
                    if (var5.field_d != var5.field_d) {
                      break L2;
                    } else {
                      if (var5.field_e != var5.field_e) {
                        break L2;
                      } else {
                        if (var5.field_b != var5.field_b) {
                          break L2;
                        } else {
                          if (var5.field_m != var5.field_m) {
                            break L2;
                          } else {
                            if (var5.field_h != var5.field_h) {
                              break L2;
                            } else {
                              int discarded$3 = 28;
                              if (wpb.a(var5.field_i, var5.field_i)) {
                                break L2;
                              } else {
                                sg discarded$4 = var5.field_g;
                                L3: {
                                  if (null == var5.field_g) {
                                    break L3;
                                  } else {
                                    if (var5.field_g.a((byte) -125, (tv) (Object) var5.field_g)) {
                                      break L2;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                int discarded$5 = 28;
                                if (wpb.a(var5.field_k, var5.field_k)) {
                                  break L2;
                                } else {
                                  if (var5.field_c != var5.field_c) {
                                    break L2;
                                  } else {
                                    if (var5.field_n != var5.field_n) {
                                      break L2;
                                    } else {
                                      if (var5.field_l != var5.field_l) {
                                        break L2;
                                      } else {
                                        if (var5.field_j == var5.field_j) {
                                          stackOut_20_0 = 0;
                                          stackIn_21_0 = stackOut_20_0;
                                          break L1;
                                        } else {
                                          break L2;
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
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("tfa.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final void c(byte param0) {
        if (((tfa) this).field_j > 0) {
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
            int discarded$3 = -14;
            ((tfa) this).field_i = qi.a(param1, true, ((tfa) this).field_i);
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
                                int incrementValue$4 = var10;
                                var10++;
                                var8[incrementValue$4] = var12;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      int incrementValue$5 = var10;
                      var10++;
                      var8[incrementValue$5] = var12;
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
        rsb var5 = null;
        rha var6 = null;
        try {
            var5 = (rsb) (Object) param1;
            var6 = new rha(2, param3, param3);
            var5.field_d.a(var6, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tfa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tfa var5 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -44);
              var5 = (tfa) (Object) param0;
              if (var5.field_g == null) {
                break L1;
              } else {
                if (var5.field_g != null) {
                  var5.field_g.a((tv) (Object) var5.field_g, -122);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (var5.field_f != var5.field_f) {
                System.out.println("int triggers has changed. before=" + var5.field_f + ", now=" + var5.field_f);
                var4 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var5.field_d == var5.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int aimtargetx has changed. before=" + var5.field_d + ", now=" + var5.field_d);
                break L3;
              }
            }
            L4: {
              if (var5.field_e == var5.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int aimtargety has changed. before=" + var5.field_e + ", now=" + var5.field_e);
                break L4;
              }
            }
            L5: {
              if (var5.field_b == var5.field_b) {
                break L5;
              } else {
                var4 = 1;
                System.out.println("int specialorder has changed. before=" + var5.field_b + ", now=" + var5.field_b);
                break L5;
              }
            }
            L6: {
              if (var5.field_m != var5.field_m) {
                var4 = 1;
                System.out.println("int spawn_choice has changed. before=" + var5.field_m + ", now=" + var5.field_m);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var5.field_h == var5.field_h) {
                break L7;
              } else {
                System.out.println("int selected_team has changed. before=" + var5.field_h + ", now=" + var5.field_h);
                var4 = 1;
                break L7;
              }
            }
            L8: {
              int discarded$3 = 0;
              if (!ikb.a(var5.field_i, var5.field_i)) {
                break L8;
              } else {
                System.out.println("int[] votes has changed. ");
                var4 = 1;
                break L8;
              }
            }
            sg discarded$4 = var5.field_g;
            L9: {
              if (null == var5.field_g) {
                break L9;
              } else {
                if (var5.field_g.a((byte) 92, (tv) (Object) var5.field_g)) {
                  var4 = 1;
                  System.out.println("Ship saved_ship has changed. before=" + (Object) (Object) var5.field_g + ", now=" + (Object) (Object) var5.field_g);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              int discarded$5 = 0;
              if (ikb.a(var5.field_k, var5.field_k)) {
                var4 = 1;
                System.out.println("int[] carried_over_components has changed. ");
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var5.field_c != var5.field_c) {
                var4 = 1;
                System.out.println("int kills has changed. before=" + var5.field_c + ", now=" + var5.field_c);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (var5.field_n == var5.field_n) {
                break L12;
              } else {
                var4 = 1;
                System.out.println("int assists has changed. before=" + var5.field_n + ", now=" + var5.field_n);
                break L12;
              }
            }
            L13: {
              if (var5.field_l != var5.field_l) {
                System.out.println("int deaths has changed. before=" + var5.field_l + ", now=" + var5.field_l);
                var4 = 1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (var5.field_j == var5.field_j) {
                break L14;
              } else {
                System.out.println("int unassigned_for_autobalance_timer has changed. before=" + var5.field_j + ", now=" + var5.field_j);
                var4 = 1;
                break L14;
              }
            }
            L15: {
              if (param1 < -19) {
                break L15;
              } else {
                ((tfa) this).field_b = 45;
                break L15;
              }
            }
            L16: {
              if (var4 != 0) {
                System.out.println("This instance of MyCarouselPlayerInfo has changed");
                break L16;
              } else {
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var3;
            stackOut_45_1 = new StringBuilder().append("tfa.F(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ')');
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
              if (var3 == -1) {
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
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        faa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        faa stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              super.b(param0, -124);
              param0.a(-632, ((tfa) this).field_f, 4);
              param0.a(-632, ((tfa) this).field_d, 32);
              if (param1 < -109) {
                break L1;
              } else {
                ((tfa) this).b((byte) 107);
                break L1;
              }
            }
            L2: {
              param0.a(-632, ((tfa) this).field_e, 32);
              param0.a(-632, 1 + ((tfa) this).field_b, 8);
              param0.a(-632, ((tfa) this).field_m, 4);
              param0.a(-632, 1 + ((tfa) this).field_h, 4);
              stackOut_2_0 = 4;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (((tfa) this).field_i != null) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = ((tfa) this).field_i.length;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              pgb.a(stackIn_5_0, stackIn_5_1, 49, param0, ((tfa) this).field_i);
              stackOut_5_0 = (faa) param0;
              stackOut_5_1 = 85;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (((tfa) this).field_g == null) {
                stackOut_7_0 = (faa) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L3;
              } else {
                stackOut_6_0 = (faa) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L3;
              }
            }
            L4: {
              if (vq.a(stackIn_8_0, stackIn_8_1, stackIn_8_2 != 0)) {
                ((tfa) this).field_g.b(param0, -114);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              stackOut_11_0 = 8;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (((tfa) this).field_k == null) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L5;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = ((tfa) this).field_k.length;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L5;
              }
            }
            pgb.a(stackIn_14_0, stackIn_14_1, 63, param0, ((tfa) this).field_k);
            param0.a(-632, ((tfa) this).field_c, 16);
            param0.a(-632, ((tfa) this).field_n, 16);
            param0.a(-632, ((tfa) this).field_l, 16);
            param0.a(-632, ((tfa) this).field_j, 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("tfa.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        tfa var4 = (tfa) (Object) param1;
        if (param0 <= 54) {
            return;
        }
        try {
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
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tfa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 <= 124) {
            ((tfa) this).field_h = 69;
        }
        ((tfa) this).field_i = null;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              ((tfa) this).field_f = param0.i(0, 4);
              ((tfa) this).field_d = param0.i(0, 32);
              ((tfa) this).field_e = param0.i(0, 32);
              ((tfa) this).field_b = -1 + param0.i(0, 8);
              ((tfa) this).field_m = param0.i(0, 4);
              ((tfa) this).field_h = param0.i(0, 4) + -1;
              ((tfa) this).field_i = wkb.a((byte) 37, ((tfa) this).field_i, param0, 4);
              if (!kv.a(param1, param0)) {
                ((tfa) this).field_g = null;
                break L1;
              } else {
                L2: {
                  if (((tfa) this).field_g != null) {
                    break L2;
                  } else {
                    ((tfa) this).field_g = new sg();
                    break L2;
                  }
                }
                ((tfa) this).field_g.a(param0, false);
                break L1;
              }
            }
            ((tfa) this).field_k = wkb.a((byte) 37, ((tfa) this).field_k, param0, 8);
            ((tfa) this).field_c = param0.i(0, 16);
            ((tfa) this).field_n = param0.i(0, 16);
            ((tfa) this).field_l = param0.i(0, 16);
            ((tfa) this).field_j = param0.i(0, 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("tfa.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
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
        RuntimeException var5 = null;
        rha var6 = null;
        sg var7 = null;
        Random var8 = null;
        Object var9 = null;
        rsb var10 = null;
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
        try {
          L0: {
            L1: {
              ((tfa) this).field_h = -1;
              var10 = (rsb) (Object) param0;
              if (var10.field_e.c((byte) 125)) {
                break L1;
              } else {
                if (qab.a(param2 + 24476, var10.field_g.d(false))) {
                  break L1;
                } else {
                  ((tfa) this).field_h = param1;
                  break L1;
                }
              }
            }
            L2: {
              var6 = new rha(1, param1, param1);
              var10.field_d.a(var6, true);
              if (param2 == -24354) {
                break L2;
              } else {
                var9 = null;
                ((tfa) this).a(false, (tja) null, -66, -35);
                break L2;
              }
            }
            var7 = var10.field_g.d(param1, 92);
            if (var7 != null) {
              ((tfa) this).field_h = var7.q((byte) 65);
              return;
            } else {
              L3: {
                if (var10.field_e.e(8) != 5) {
                  break L3;
                } else {
                  if (qab.a(34, var10.field_g.d(false))) {
                    var8 = new Random((long)param3);
                    var10.field_e.a(var8, 2196, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              ((tfa) this).field_j = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("tfa.I(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    tfa() {
        ((tfa) this).field_b = -1;
        ((tfa) this).field_i = null;
        ((tfa) this).field_h = sja.field_c;
    }

    static {
    }
}
