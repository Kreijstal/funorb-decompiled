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
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 2 / ((param0 - 22) / 59);
                var5 = (tfa) ((Object) param1);
                if (super.a((byte) -38, param1)) {
                  break L2;
                } else {
                  if (var5.field_f != this.field_f) {
                    break L2;
                  } else {
                    if (var5.field_d != this.field_d) {
                      break L2;
                    } else {
                      if (this.field_e != var5.field_e) {
                        break L2;
                      } else {
                        if (var5.field_b != this.field_b) {
                          break L2;
                        } else {
                          if (this.field_m != var5.field_m) {
                            break L2;
                          } else {
                            if (var5.field_h != this.field_h) {
                              break L2;
                            } else {
                              if (wpb.a(var5.field_i, this.field_i, (byte) 28)) {
                                break L2;
                              } else {
                                L3: {
                                  if (this.field_g != null) {
                                    stackOut_10_0 = 0;
                                    stackIn_11_0 = stackOut_10_0;
                                    break L3;
                                  } else {
                                    stackOut_9_0 = 1;
                                    stackIn_11_0 = stackOut_9_0;
                                    break L3;
                                  }
                                }
                                L4: {
                                  stackOut_11_0 = stackIn_11_0;
                                  stackIn_13_0 = stackOut_11_0;
                                  stackIn_12_0 = stackOut_11_0;
                                  if (var5.field_g != null) {
                                    stackOut_13_0 = stackIn_13_0;
                                    stackOut_13_1 = 0;
                                    stackIn_14_0 = stackOut_13_0;
                                    stackIn_14_1 = stackOut_13_1;
                                    break L4;
                                  } else {
                                    stackOut_12_0 = stackIn_12_0;
                                    stackOut_12_1 = 1;
                                    stackIn_14_0 = stackOut_12_0;
                                    stackIn_14_1 = stackOut_12_1;
                                    break L4;
                                  }
                                }
                                if ((stackIn_14_0 ^ stackIn_14_1) != 0) {
                                  break L2;
                                } else {
                                  L5: {
                                    if (null == this.field_g) {
                                      break L5;
                                    } else {
                                      if (this.field_g.a((byte) -125, var5.field_g)) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  if (wpb.a(var5.field_k, this.field_k, (byte) 28)) {
                                    break L2;
                                  } else {
                                    if (this.field_c != var5.field_c) {
                                      break L2;
                                    } else {
                                      if (var5.field_n != this.field_n) {
                                        break L2;
                                      } else {
                                        if (this.field_l != var5.field_l) {
                                          break L2;
                                        } else {
                                          if (var5.field_j == this.field_j) {
                                            stackOut_25_0 = 0;
                                            stackIn_26_0 = stackOut_25_0;
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
              }
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("tfa.C(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final void c(byte param0) {
        if ((this.field_j ^ -1) < -1) {
            this.field_j = this.field_j - 1;
        }
        if (param0 != 11) {
            tv var3 = (tv) null;
            this.a((tv) null, -82);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (null != this.field_i) {
          var4 = 0;
          var5 = 0;
          if (param1 == 11863) {
            L0: while (true) {
              if (var5 >= this.field_i.length) {
                return var4;
              } else {
                var6 = this.field_i[var5];
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
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
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
        var13 = VoidHunters.field_G;
        if (0 > param1) {
          if (this.a(param3, 11863, param0) == param4) {
            return;
          } else {
            this.field_i = qi.a(param1, true, this.field_i, (byte) -14);
            return;
          }
        } else {
          L0: {
            this.field_i = kdb.a(this.field_i, param1, (byte) -99);
            var6 = this.a(param3, param2 + -18161, param0);
            if (param4 < var6) {
              var7 = var6 + -param4;
              var15 = new int[this.field_i.length + -var7];
              var14 = var15;
              var8 = var14;
              var9 = 0;
              var10 = 0;
              var11 = 0;
              L1: while (true) {
                L2: {
                  if (var11 >= this.field_i.length) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var12 = this.field_i[var11];
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
                                incrementValue$20 = var10;
                                var10++;
                                var8[incrementValue$20] = var12;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      incrementValue$21 = var10;
                      var10++;
                      var8[incrementValue$21] = var12;
                      break L3;
                    }
                    var15 = var14;
                    if (var15.length <= var10) {
                      break L2;
                    } else {
                      var11++;
                      continue L1;
                    }
                  }
                }
                this.field_i = var8;
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
              this.field_n = -99;
              break L5;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        this.field_j = param0;
        this.field_h = sja.field_c;
    }

    final void a(boolean param0, tja param1, int param2, int param3) {
        rsb var5 = null;
        rha var6 = null;
        try {
            var5 = (rsb) ((Object) param1);
            var6 = new rha(2, param3, param3);
            var5.field_d.a(var6, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tfa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tfa var5 = null;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -44);
              var5 = (tfa) ((Object) param0);
              if (this.field_g == null) {
                break L1;
              } else {
                if (var5.field_g != null) {
                  this.field_g.a(var5.field_g, -122);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (var5.field_f != this.field_f) {
                System.out.println("int triggers has changed. before=" + var5.field_f + ", now=" + this.field_f);
                var4 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_d == var5.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int aimtargetx has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L3;
              }
            }
            L4: {
              if (this.field_e == var5.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int aimtargety has changed. before=" + var5.field_e + ", now=" + this.field_e);
                break L4;
              }
            }
            L5: {
              if (this.field_b == var5.field_b) {
                break L5;
              } else {
                var4 = 1;
                System.out.println("int specialorder has changed. before=" + var5.field_b + ", now=" + this.field_b);
                break L5;
              }
            }
            L6: {
              if (var5.field_m != this.field_m) {
                var4 = 1;
                System.out.println("int spawn_choice has changed. before=" + var5.field_m + ", now=" + this.field_m);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_h == var5.field_h) {
                break L7;
              } else {
                System.out.println("int selected_team has changed. before=" + var5.field_h + ", now=" + this.field_h);
                var4 = 1;
                break L7;
              }
            }
            L8: {
              if (!ikb.a(this.field_i, var5.field_i, false)) {
                break L8;
              } else {
                System.out.println("int[] votes has changed. ");
                var4 = 1;
                break L8;
              }
            }
            L9: {
              if (var5.field_g != null) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L9;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L9;
              }
            }
            L10: {
              stackOut_23_0 = stackIn_23_0;
              stackIn_25_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (null != this.field_g) {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = 0;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L10;
              } else {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L10;
              }
            }
            L11: {
              L12: {
                if ((stackIn_26_0 ^ stackIn_26_1) != 0) {
                  break L12;
                } else {
                  if (null == this.field_g) {
                    break L11;
                  } else {
                    if (this.field_g.a((byte) 92, var5.field_g)) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("Ship saved_ship has changed. before=" + var5.field_g + ", now=" + this.field_g);
              break L11;
            }
            L13: {
              if (ikb.a(this.field_k, var5.field_k, false)) {
                var4 = 1;
                System.out.println("int[] carried_over_components has changed. ");
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (var5.field_c != this.field_c) {
                var4 = 1;
                System.out.println("int kills has changed. before=" + var5.field_c + ", now=" + this.field_c);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (this.field_n == var5.field_n) {
                break L15;
              } else {
                var4 = 1;
                System.out.println("int assists has changed. before=" + var5.field_n + ", now=" + this.field_n);
                break L15;
              }
            }
            L16: {
              if (this.field_l != var5.field_l) {
                System.out.println("int deaths has changed. before=" + var5.field_l + ", now=" + this.field_l);
                var4 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (this.field_j == var5.field_j) {
                break L17;
              } else {
                System.out.println("int unassigned_for_autobalance_timer has changed. before=" + var5.field_j + ", now=" + this.field_j);
                var4 = 1;
                break L17;
              }
            }
            L18: {
              if (param1 < -19) {
                break L18;
              } else {
                this.field_b = 45;
                break L18;
              }
            }
            L19: {
              if (var4 != 0) {
                System.out.println("This instance of MyCarouselPlayerInfo has changed");
                break L19;
              } else {
                break L19;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var3);
            stackOut_50_1 = new StringBuilder().append("tfa.F(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L20;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L20;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
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
        if (this.field_i == null) {
          return;
        } else {
          var3 = -1;
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (var4_int >= this.field_i.length) {
                break L1;
              } else {
                if (this.field_i[var4_int] == param0) {
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
                this.a(-58, (byte) 29);
                break L2;
              }
            }
            L3: {
              if (0 == (var3 ^ -1)) {
                break L3;
              } else {
                if (1 < this.field_i.length) {
                  var4 = new int[-1 + this.field_i.length];
                  var5 = 0;
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= this.field_i.length) {
                      this.field_i = var4;
                      break L3;
                    } else {
                      if (var6 != var3) {
                        var4[var5] = this.field_i[var6];
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
                  this.field_i = null;
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
              param0.a(-632, this.field_f, 4);
              param0.a(-632, this.field_d, 32);
              if (param1 < -109) {
                break L1;
              } else {
                this.b((byte) 107);
                break L1;
              }
            }
            L2: {
              param0.a(-632, this.field_e, 32);
              param0.a(-632, 1 + this.field_b, 8);
              param0.a(-632, this.field_m, 4);
              param0.a(-632, 1 + this.field_h, 4);
              stackOut_2_0 = 4;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (this.field_i != null) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = this.field_i.length;
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
              pgb.a(stackIn_5_0, stackIn_5_1, 49, param0, this.field_i);
              stackOut_5_0 = (faa) (param0);
              stackOut_5_1 = 85;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (this.field_g == null) {
                stackOut_7_0 = (faa) ((Object) stackIn_7_0);
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L3;
              } else {
                stackOut_6_0 = (faa) ((Object) stackIn_6_0);
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
                this.field_g.b(param0, -114);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              stackOut_11_0 = 8;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (this.field_k == null) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L5;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = this.field_k.length;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L5;
              }
            }
            pgb.a(stackIn_14_0, stackIn_14_1, 63, param0, this.field_k);
            param0.a(-632, this.field_c, 16);
            param0.a(-632, this.field_n, 16);
            param0.a(-632, this.field_l, 16);
            param0.a(-632, this.field_j, 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("tfa.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        tfa var4 = (tfa) ((Object) param1);
        if (param0 <= 54) {
            return;
        }
        try {
            super.b((byte) 93, param1);
            var4.field_h = this.field_h;
            var4.field_f = this.field_f;
            var4.field_e = this.field_e;
            var4.field_m = this.field_m;
            var4.field_b = this.field_b;
            var4.field_d = this.field_d;
            var4.field_i = dob.a(var4.field_i, (byte) -108, this.field_i);
            if (this.field_g == null) {
                var4.field_g = null;
            } else {
                if (var4.field_g == null) {
                    var4.field_g = new sg();
                }
                this.field_g.b((byte) 93, var4.field_g);
            }
            var4.field_k = dob.a(var4.field_k, (byte) -66, this.field_k);
            var4.field_n = this.field_n;
            var4.field_j = this.field_j;
            var4.field_c = this.field_c;
            var4.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tfa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 <= 124) {
            this.field_h = 69;
        }
        this.field_i = null;
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
              this.field_f = param0.i(0, 4);
              this.field_d = param0.i(0, 32);
              this.field_e = param0.i(0, 32);
              this.field_b = -1 + param0.i(0, 8);
              this.field_m = param0.i(0, 4);
              this.field_h = param0.i(0, 4) + -1;
              this.field_i = wkb.a((byte) 37, this.field_i, param0, 4);
              if (!kv.a(param1, param0)) {
                this.field_g = null;
                break L1;
              } else {
                L2: {
                  if (this.field_g != null) {
                    break L2;
                  } else {
                    this.field_g = new sg();
                    break L2;
                  }
                }
                this.field_g.a(param0, false);
                break L1;
              }
            }
            this.field_k = wkb.a((byte) 37, this.field_k, param0, 8);
            this.field_c = param0.i(0, 16);
            this.field_n = param0.i(0, 16);
            this.field_l = param0.i(0, 16);
            this.field_j = param0.i(0, 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("tfa.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
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
            if (this.field_a) {
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
        this.field_l = 0;
        if (param0 != -1) {
            faa var3 = (faa) null;
            this.b((faa) null, 126);
        }
        this.field_n = 0;
        this.field_c = 0;
    }

    final void a(tja param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        rha var6 = null;
        sg var7 = null;
        Random var8 = null;
        tja var9 = null;
        rsb var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
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
              this.field_h = -1;
              var10 = (rsb) ((Object) param0);
              if (var10.field_e.c((byte) 125)) {
                break L1;
              } else {
                if (qab.a(param2 + 24476, var10.field_g.d(false))) {
                  break L1;
                } else {
                  this.field_h = param1;
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
                var9 = (tja) null;
                this.a(false, (tja) null, -66, -35);
                break L2;
              }
            }
            var7 = var10.field_g.d(param1, 92);
            if (var7 != null) {
              this.field_h = var7.q((byte) 65);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                if ((var10.field_e.e(8) ^ -1) != -6) {
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
              this.field_j = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("tfa.I(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    tfa() {
        this.field_b = -1;
        this.field_i = null;
        this.field_h = sja.field_c;
    }

    static {
    }
}
