/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;
import java.net.URL;

final class kk {
    private le field_a;
    private int field_g;
    private le[] field_f;
    private boolean field_d;
    int field_e;
    static int field_b;
    static String field_h;
    private int field_i;
    private sg field_c;

    final static byte[] a(int param0, hb param1, byte[] param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param3 == 99) {
          var4 = param1.f(8, param0);
          if (-1 != (var4 ^ -1)) {
            L0: {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2.length == var4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param2 = new byte[var4];
              break L0;
            }
            L2: {
              var5 = param1.f(8, 3);
              var6 = (byte)param1.f(8, 8);
              if (-1 > (var5 ^ -1)) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param2[var7] = (byte)(var6 + param1.f(param3 + -91, var5));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param2[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param2;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        le var2 = null;
        int var3 = 0;
        vk var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vk stackIn_46_0 = null;
        vk stackIn_47_0 = null;
        vk stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        vk stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        vk stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        vk stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        vk stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        vk stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        vk stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        vk stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        vk stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        vk stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        vk stackIn_58_0 = null;
        vk stackIn_59_0 = null;
        vk stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        vk stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        vk stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        vk stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        vk stackOut_45_0 = null;
        vk stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        vk stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        vk stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        vk stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        vk stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        vk stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        vk stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        vk stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        vk stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        vk stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        vk stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        vk stackOut_57_0 = null;
        vk stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        vk stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        vk stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        vk stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        vk stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        ke.field_i.a(0, 0);
        var2_int = 0;
        L0: while (true) {
          if (480 <= var2_int) {
            df.field_q[bc.field_a].c(-(df.field_q[0].field_m >> -1513667871) + 80, ne.field_b);
            var2_int = 0;
            L1: while (true) {
              if (-481 >= (var2_int ^ -1)) {
                df.field_q[ob.field_r].f(-(df.field_q[0].field_m >> 1825633889) + 560, dd.field_e);
                var2_int = 0;
                L2: while (true) {
                  if ((var2_int ^ -1) <= (dk.field_j ^ -1)) {
                    L3: {
                      if (param0 >= 119) {
                        break L3;
                      } else {
                        int discarded$1 = this.a((byte) 24, -74);
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if ((((kk) this).field_g ^ -1) == -9) {
                          break L5;
                        } else {
                          if (10 == ((kk) this).field_g) {
                            break L5;
                          } else {
                            if ((((kk) this).field_g ^ -1) != -10) {
                              if ((((kk) this).field_g ^ -1) != -5) {
                                var2 = kb.field_a[((kk) this).field_g];
                                break L4;
                              } else {
                                var2 = kb.field_a[3];
                                break L4;
                              }
                            } else {
                              var2 = kb.field_a[2];
                              break L4;
                            }
                          }
                        }
                      }
                      var2 = kb.field_a[5];
                      break L4;
                    }
                    L6: {
                      L7: {
                        L8: {
                          if (ad.a(false)) {
                            break L8;
                          } else {
                            if (ek.a((byte) -125)) {
                              break L8;
                            } else {
                              if (((kk) this).field_d) {
                                break L8;
                              } else {
                                if (20 >= ((kk) this).field_i) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          if (!((kk) this).field_d) {
                            break L9;
                          } else {
                            if (-1 < (((kk) this).field_i ^ -1)) {
                              break L9;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var2.c(-(var2.field_m >> -515955519) + 320, 0);
                        break L6;
                      }
                      L10: {
                        var3 = var2.field_n;
                        var4 = ((kk) this).field_i * 255 / 20;
                        if (var4 <= 255) {
                          break L10;
                        } else {
                          var4 = 255;
                          break L10;
                        }
                      }
                      L11: {
                        var5 = var4 + -40;
                        if (0 <= var5) {
                          break L11;
                        } else {
                          var5 = 0;
                          break L11;
                        }
                      }
                      ma.a(var2, 320 - (var2.field_m >> -793499935), 0, var3, var4, var5);
                      break L6;
                    }
                    L12: {
                      if (((kk) this).field_g == 2) {
                        this.b(69);
                        break L12;
                      } else {
                        if (-4 != (((kk) this).field_g ^ -1)) {
                          if (-5 != (((kk) this).field_g ^ -1)) {
                            if (((kk) this).field_g == 5) {
                              ri.a((byte) -100, ((kk) this).field_i, false);
                              break L12;
                            } else {
                              L13: {
                                if (6 == ((kk) this).field_g) {
                                  break L13;
                                } else {
                                  if (-11 == (((kk) this).field_g ^ -1)) {
                                    break L13;
                                  } else {
                                    if (((kk) this).field_g != 7) {
                                      if ((((kk) this).field_g ^ -1) != -10) {
                                        if (-9 == (((kk) this).field_g ^ -1)) {
                                          ri.a((byte) -122, ((kk) this).field_i, false);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        this.c(119);
                                        break L12;
                                      }
                                    } else {
                                      L14: {
                                        lb.a(120, 400, (byte) -119, wc.field_e, 180, 185);
                                        var3_ref = pl.field_e;
                                        var4 = var3_ref.field_C + 200;
                                        var5 = 4 + (var3_ref.field_j + var3_ref.field_D);
                                        var3_ref.a(f.field_f, 320, var4, 1, -1);
                                        stackOut_45_0 = (vk) var3_ref;
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_46_0 = stackOut_45_0;
                                        if (-1 == (fg.field_b ^ -1)) {
                                          stackOut_47_0 = (vk) (Object) stackIn_47_0;
                                          stackOut_47_1 = 0;
                                          stackIn_48_0 = stackOut_47_0;
                                          stackIn_48_1 = stackOut_47_1;
                                          break L14;
                                        } else {
                                          stackOut_46_0 = (vk) (Object) stackIn_46_0;
                                          stackOut_46_1 = 1;
                                          stackIn_48_0 = stackOut_46_0;
                                          stackIn_48_1 = stackOut_46_1;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        stackOut_48_0 = (vk) (Object) stackIn_48_0;
                                        stackOut_48_1 = stackIn_48_1;
                                        stackOut_48_2 = 0;
                                        stackOut_48_3 = 22890;
                                        stackIn_50_0 = stackOut_48_0;
                                        stackIn_50_1 = stackOut_48_1;
                                        stackIn_50_2 = stackOut_48_2;
                                        stackIn_50_3 = stackOut_48_3;
                                        stackIn_49_0 = stackOut_48_0;
                                        stackIn_49_1 = stackOut_48_1;
                                        stackIn_49_2 = stackOut_48_2;
                                        stackIn_49_3 = stackOut_48_3;
                                        if (hf.field_f.field_A == 0) {
                                          stackOut_50_0 = (vk) (Object) stackIn_50_0;
                                          stackOut_50_1 = stackIn_50_1;
                                          stackOut_50_2 = stackIn_50_2;
                                          stackOut_50_3 = stackIn_50_3;
                                          stackOut_50_4 = 0;
                                          stackIn_51_0 = stackOut_50_0;
                                          stackIn_51_1 = stackOut_50_1;
                                          stackIn_51_2 = stackOut_50_2;
                                          stackIn_51_3 = stackOut_50_3;
                                          stackIn_51_4 = stackOut_50_4;
                                          break L15;
                                        } else {
                                          stackOut_49_0 = (vk) (Object) stackIn_49_0;
                                          stackOut_49_1 = stackIn_49_1;
                                          stackOut_49_2 = stackIn_49_2;
                                          stackOut_49_3 = stackIn_49_3;
                                          stackOut_49_4 = 1;
                                          stackIn_51_0 = stackOut_49_0;
                                          stackIn_51_1 = stackOut_49_1;
                                          stackIn_51_2 = stackOut_49_2;
                                          stackIn_51_3 = stackOut_49_3;
                                          stackIn_51_4 = stackOut_49_4;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        ((vk) (Object) stackIn_51_0).a(wa.a(stackIn_51_1 != 0, stackIn_51_2 != 0, stackIn_51_3, stackIn_51_4 != 0), 320, var4 - -var5, 1, -1);
                                        stackOut_51_0 = (vk) var3_ref;
                                        stackOut_51_1 = -88;
                                        stackIn_53_0 = stackOut_51_0;
                                        stackIn_53_1 = stackOut_51_1;
                                        stackIn_52_0 = stackOut_51_0;
                                        stackIn_52_1 = stackOut_51_1;
                                        if (0 == fg.field_b) {
                                          stackOut_53_0 = (vk) (Object) stackIn_53_0;
                                          stackOut_53_1 = stackIn_53_1;
                                          stackOut_53_2 = 0;
                                          stackIn_54_0 = stackOut_53_0;
                                          stackIn_54_1 = stackOut_53_1;
                                          stackIn_54_2 = stackOut_53_2;
                                          break L16;
                                        } else {
                                          stackOut_52_0 = (vk) (Object) stackIn_52_0;
                                          stackOut_52_1 = stackIn_52_1;
                                          stackOut_52_2 = 1;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_54_1 = stackOut_52_1;
                                          stackIn_54_2 = stackOut_52_2;
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        stackOut_54_0 = (vk) (Object) stackIn_54_0;
                                        stackOut_54_1 = stackIn_54_1;
                                        stackOut_54_2 = stackIn_54_2;
                                        stackIn_56_0 = stackOut_54_0;
                                        stackIn_56_1 = stackOut_54_1;
                                        stackIn_56_2 = stackOut_54_2;
                                        stackIn_55_0 = stackOut_54_0;
                                        stackIn_55_1 = stackOut_54_1;
                                        stackIn_55_2 = stackOut_54_2;
                                        if ((hf.field_f.field_A ^ -1) == -1) {
                                          stackOut_56_0 = (vk) (Object) stackIn_56_0;
                                          stackOut_56_1 = stackIn_56_1;
                                          stackOut_56_2 = stackIn_56_2;
                                          stackOut_56_3 = 0;
                                          stackIn_57_0 = stackOut_56_0;
                                          stackIn_57_1 = stackOut_56_1;
                                          stackIn_57_2 = stackOut_56_2;
                                          stackIn_57_3 = stackOut_56_3;
                                          break L17;
                                        } else {
                                          stackOut_55_0 = (vk) (Object) stackIn_55_0;
                                          stackOut_55_1 = stackIn_55_1;
                                          stackOut_55_2 = stackIn_55_2;
                                          stackOut_55_3 = 1;
                                          stackIn_57_0 = stackOut_55_0;
                                          stackIn_57_1 = stackOut_55_1;
                                          stackIn_57_2 = stackOut_55_2;
                                          stackIn_57_3 = stackOut_55_3;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        ((vk) (Object) stackIn_57_0).a(lk.a(stackIn_57_1, stackIn_57_2 != 0, stackIn_57_3 != 0, false), 320, 20 + (var4 - -(var5 * 3)), 1, -1);
                                        stackOut_57_0 = (vk) var3_ref;
                                        stackIn_59_0 = stackOut_57_0;
                                        stackIn_58_0 = stackOut_57_0;
                                        if ((hf.field_f.field_A ^ -1) == -1) {
                                          stackOut_59_0 = (vk) (Object) stackIn_59_0;
                                          stackOut_59_1 = 0;
                                          stackIn_60_0 = stackOut_59_0;
                                          stackIn_60_1 = stackOut_59_1;
                                          break L18;
                                        } else {
                                          stackOut_58_0 = (vk) (Object) stackIn_58_0;
                                          stackOut_58_1 = 1;
                                          stackIn_60_0 = stackOut_58_0;
                                          stackIn_60_1 = stackOut_58_1;
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        stackOut_60_0 = (vk) (Object) stackIn_60_0;
                                        stackOut_60_1 = stackIn_60_1;
                                        stackOut_60_2 = 122;
                                        stackIn_62_0 = stackOut_60_0;
                                        stackIn_62_1 = stackOut_60_1;
                                        stackIn_62_2 = stackOut_60_2;
                                        stackIn_61_0 = stackOut_60_0;
                                        stackIn_61_1 = stackOut_60_1;
                                        stackIn_61_2 = stackOut_60_2;
                                        if (-1 == (fg.field_b ^ -1)) {
                                          stackOut_62_0 = (vk) (Object) stackIn_62_0;
                                          stackOut_62_1 = stackIn_62_1;
                                          stackOut_62_2 = stackIn_62_2;
                                          stackOut_62_3 = 0;
                                          stackIn_63_0 = stackOut_62_0;
                                          stackIn_63_1 = stackOut_62_1;
                                          stackIn_63_2 = stackOut_62_2;
                                          stackIn_63_3 = stackOut_62_3;
                                          break L19;
                                        } else {
                                          stackOut_61_0 = (vk) (Object) stackIn_61_0;
                                          stackOut_61_1 = stackIn_61_1;
                                          stackOut_61_2 = stackIn_61_2;
                                          stackOut_61_3 = 1;
                                          stackIn_63_0 = stackOut_61_0;
                                          stackIn_63_1 = stackOut_61_1;
                                          stackIn_63_2 = stackOut_61_2;
                                          stackIn_63_3 = stackOut_61_3;
                                          break L19;
                                        }
                                      }
                                      ((vk) (Object) stackIn_63_0).a(ma.a(stackIn_63_1 != 0, (byte) stackIn_63_2, stackIn_63_3 != 0, false), 320, 20 + (var5 * 4 + var4 - -40), 1, -1);
                                      break L12;
                                    }
                                  }
                                }
                              }
                              ri.a((byte) -101, ((kk) this).field_i, true);
                              break L12;
                            }
                          } else {
                            this.a((byte) 1, false);
                            break L12;
                          }
                        } else {
                          this.a((byte) 1, true);
                          break L12;
                        }
                      }
                    }
                    var3 = 0;
                    L20: while (true) {
                      if ((((kk) this).field_c.field_i ^ -1) >= (var3 ^ -1)) {
                        L21: {
                          if (ad.a(false)) {
                            L22: {
                              var3 = hl.field_a;
                              if (32 < var3) {
                                var3 = 32;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              var4 = hl.field_a * 3;
                              if ((var4 ^ -1) >= -129) {
                                break L23;
                              } else {
                                var4 = 128;
                                break L23;
                              }
                            }
                            this.a(var3, (byte) 110, 0, var4, 0, 0, 0, 0);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        return;
                      } else {
                        L24: {
                          stackOut_74_0 = this;
                          stackOut_74_1 = -1;
                          stackOut_74_2 = var3;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_76_1 = stackOut_74_1;
                          stackIn_76_2 = stackOut_74_2;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          stackIn_75_2 = stackOut_74_2;
                          if (((kk) this).field_c.field_a != var3) {
                            stackOut_76_0 = this;
                            stackOut_76_1 = stackIn_76_1;
                            stackOut_76_2 = stackIn_76_2;
                            stackOut_76_3 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            stackIn_77_2 = stackOut_76_2;
                            stackIn_77_3 = stackOut_76_3;
                            break L24;
                          } else {
                            stackOut_75_0 = this;
                            stackOut_75_1 = stackIn_75_1;
                            stackOut_75_2 = stackIn_75_2;
                            stackOut_75_3 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            stackIn_77_2 = stackOut_75_2;
                            stackIn_77_3 = stackOut_75_3;
                            break L24;
                          }
                        }
                        this.a(stackIn_77_1, stackIn_77_2, stackIn_77_3 != 0);
                        var3++;
                        continue L20;
                      }
                    }
                  } else {
                    var3 = 0;
                    L25: while (true) {
                      if (var3 >= 5) {
                        ma.a(ve.field_x[var2_int][0] << -243469980, ve.field_x[var2_int][1] << 142028388, 128, 40000);
                        var2_int++;
                        continue L2;
                      } else {
                        ge.g(pf.a((byte) 25, 640), pf.a((byte) -100, 100), pf.a((byte) 19, 500), 9283525, 60);
                        var3++;
                        continue L25;
                      }
                    }
                  }
                }
              } else {
                kj.field_F.c(560 + -(kj.field_F.field_m >> 1482303553), var2_int);
                var2_int = var2_int + kj.field_F.field_n;
                continue L1;
              }
            }
          } else {
            kj.field_F.c(-(kj.field_F.field_m >> -533000127) + 80, var2_int);
            var2_int = var2_int + kj.field_F.field_n;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -104) {
            field_h = null;
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        vk var5 = null;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        String stackIn_11_0 = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((kk) this).field_a.e();
        var3 = 380;
        var4 = 263;
        ge.d(3, 3, var3 - 6, -6 + var4, 16249775);
        lb.a(0, var3, (byte) -124, wc.field_e, 0, var4);
        var5 = pl.field_e;
        var6 = 0;
        var7_int = si.field_r / 8;
        if (param0 == 1) {
          L0: while (true) {
            if (var6 >= 8) {
              L1: {
                if (param1) {
                  int discarded$2 = var5.a(mk.field_j, 15, 53, -30 + var3, var4, 1, -1, 0, 0, 14);
                  break L1;
                } else {
                  L2: {
                    var6 = hb.a(false);
                    if (qb.field_b) {
                      stackOut_10_0 = gg.a(new String[2], jg.field_kb, true);
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = lg.field_I;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  var7 = stackIn_11_0;
                  int discarded$3 = var5.a(gg.a(new String[1], je.field_a, true), 14, 53, var3 + -30, var4, 1, -1, 0, 0, 14);
                  break L1;
                }
              }
              L3: {
                ac.field_a.a((byte) 118);
                var6 = ((kk) this).field_i * var4 / 20;
                if ((var6 ^ -1) < (var4 ^ -1)) {
                  var6 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((kk) this).field_a.b(130, (-var6 + var4 >> 1971065441) + 104, var3, var6);
              return;
            } else {
              L4: {
                var8 = 0;
                if (-33 <= (si.field_r + var7_int * 6 & 63 ^ -1)) {
                  var8 = var7_int % 4;
                  break L4;
                } else {
                  break L4;
                }
              }
              nh.field_f[0][var6 % 5][var8].c(-160 + 40 * var6 + (var3 >> 1910711617), 15);
              var6++;
              var7_int++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        if (!(2 == ((kk) this).field_g)) {
            if (3 != ((kk) this).field_g) {
                // if_icmpne L44
            }
            if (-3 < (param0 ^ -1)) {
                return fl.field_a[((kk) this).field_g];
            }
            var3 = b.field_j[((kk) this).field_g][param0];
            if (!(19 != var3)) {
                return 30 + (((kk) this).field_f[param0].field_m + fl.field_a[((kk) this).field_g]);
            }
            if (-19 == (var3 ^ -1)) {
                return fl.field_a[((kk) this).field_g] + -10 + (-((kk) this).field_f[param0].field_m + -20);
            }
        }
        if (param1 != 52) {
            return -100;
        }
        if (!(3 <= param0)) {
            return fl.field_a[((kk) this).field_g] + (20 + ((kk) this).field_f[param0].field_m) * param0;
        }
        return 20 + ((kk) this).field_f[param0].field_m + fl.field_a[((kk) this).field_g];
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
            ((kk) this).b((byte) -56);
        }
        ((kk) this).field_c.a((byte) 60, this.a(-6, p.field_a, ei.field_a), param0);
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        vk var4 = null;
        de var5 = null;
        String var6 = null;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int[] var19 = null;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (s.field_S != null) {
            break L0;
          } else {
            s.field_S = o.a(41, 10, 3, 1, -114);
            break L0;
          }
        }
        L1: {
          if (param0 >= 39) {
            break L1;
          } else {
            var15 = null;
            kk.a((String) null, (byte) -126, (Throwable) null);
            break L1;
          }
        }
        L2: {
          ((kk) this).field_a.e();
          var2 = 380;
          var3 = 275;
          ge.d(3, 3, var2 + -6, var3 + -6, 16249775);
          lb.a(0, var2, (byte) -12, wc.field_e, 0, var3);
          sb.field_r.a(bg.field_B[ef.field_b], var2 >> 693749377, 30, 9330743, -1);
          var4 = pl.field_e;
          var5 = s.field_S;
          if (!var5.field_l) {
            var6 = eg.field_h;
            break L2;
          } else {
            if (var5.field_g != null) {
              var6 = qc.field_O;
              var7_ref_String__ = var5.field_g[ef.field_b];
              var19 = var5.field_i[ef.field_b];
              var9 = ti.a(0, var5, ef.field_b, pg.field_b);
              var10 = var4.field_C - -40;
              var11 = 0;
              L3: while (true) {
                if (var11 >= 10) {
                  L4: {
                    if (hf.field_f == null) {
                      break L4;
                    } else {
                      if (var9 != -1) {
                        break L4;
                      } else {
                        if (0 != hf.field_f.field_A) {
                          var4.b(cl.field_e, 30, var10, 5683782, -1);
                          var4.c(Integer.toString(hf.field_f.field_A), 360, var10, 5683782, -1);
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  break L2;
                } else {
                  L5: {
                    if ((1 & var11 ^ -1) != -1) {
                      ge.c(13, -2 + (-var4.field_C + var10), 354, 18, 14540253, 40);
                      break L5;
                    } else {
                      ge.c(13, -2 + -var4.field_C + var10, 354, 18, 12303291, 80);
                      break L5;
                    }
                  }
                  L6: {
                    if (null != var7_ref_String__[var11]) {
                      L7: {
                        var12 = 1;
                        var13 = var19[var11];
                        if ((var9 ^ -1) == (var11 ^ -1)) {
                          var12 = 5683782;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var4.c(var11 + 1 + ". ", 30, var10, var12, -1);
                      var4.b(var7_ref_String__[var11], 30, var10, var12, -1);
                      var4.c(Integer.toString(var13), 360, var10, var12, -1);
                      var6 = "";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10 += 18;
                  var11++;
                  continue L3;
                }
              }
            } else {
              var6 = re.field_b;
              break L2;
            }
          }
        }
        L8: {
          int discarded$1 = pl.field_e.a(nc.field_c, 30, var3 + -37, -60 + var2, 40, 1, -1, 1, 0, 12);
          var7 = 137;
          sb.field_r.a(var6, var2 / 2, var7, 9330743, -1);
          ac.field_a.a((byte) 116);
          var8 = var3 * ((kk) this).field_i / 20;
          if (var8 <= var3) {
            break L8;
          } else {
            var8 = var3;
            break L8;
          }
        }
        ((kk) this).field_a.b(130, (-var8 + var3 >> 530617729) + 90, var2, var8);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -53 / ((param0 - 15) / 33);
        if (((kk) this).field_d) {
          L0: {
            ((kk) this).field_i = ((kk) this).field_i - 1;
            if ((((kk) this).field_i ^ -1) >= -1) {
              if (-1 != ((kk) this).field_e) {
                L1: {
                  L2: {
                    if (((kk) this).field_g == 5) {
                      break L2;
                    } else {
                      if (((kk) this).field_g == 6) {
                        break L2;
                      } else {
                        if (-9 == (((kk) this).field_g ^ -1)) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  ee.field_F = -1;
                  break L1;
                }
                L3: {
                  pg.field_d[((kk) this).field_e].c((byte) -122);
                  if ((((kk) this).field_e ^ -1) == -3) {
                    s.field_S = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = qh.field_b;
                    if (((kk) this).field_g != 1) {
                      break L5;
                    } else {
                      if ((((kk) this).field_e ^ -1) == -7) {
                        break L5;
                      } else {
                        if (-11 == (((kk) this).field_e ^ -1)) {
                          break L5;
                        } else {
                          if (2 != ((kk) this).field_e) {
                            vl.field_g = ((kk) this).field_g;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (1 != var3) {
                    if (var3 != 0) {
                      break L4;
                    } else {
                      vl.field_g = 0;
                      break L4;
                    }
                  } else {
                    vl.field_g = 1;
                    break L4;
                  }
                }
                l.field_f = ((kk) this).field_e;
                qh.field_b = ((kk) this).field_e;
                break L0;
              } else {
                ej.field_b = 50;
                l.field_f = ((kk) this).field_e;
                return;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          ((kk) this).field_i = ((kk) this).field_i + 1;
          if (20 > ((kk) this).field_i) {
            return;
          } else {
            L6: while (true) {
              if (!ba.a(-1)) {
                if ((((kk) this).field_e ^ -1) != (((kk) this).field_g ^ -1)) {
                  L7: {
                    if ((((kk) this).field_e ^ -1) != 0) {
                      pg.field_d[((kk) this).field_e].a(false, false);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((kk) this).field_d = true;
                  ((kk) this).field_i = 20;
                  return;
                } else {
                  L8: {
                    ((kk) this).field_c.a(this.a(-6, p.field_a, ei.field_a), this.a(-6, ab.field_e, qg.field_c), true);
                    if (((kk) this).field_c.field_a != -1) {
                      this.a(((kk) this).field_c.field_a, true, 59);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (((kk) this).field_e != qh.field_b) {
                      L10: {
                        ((kk) this).field_i = 20;
                        if (((kk) this).field_e == -1) {
                          break L10;
                        } else {
                          pg.field_d[((kk) this).field_e].a(true, false);
                          break L10;
                        }
                      }
                      ((kk) this).field_d = true;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (13 != oa.field_H) {
                    break L11;
                  } else {
                    if ((((kk) this).field_g ^ -1) == -1) {
                      break L11;
                    } else {
                      if (((kk) this).field_g != 7) {
                        L12: {
                          ((kk) this).field_e = vl.field_g;
                          if (1 != ((kk) this).field_g) {
                            break L12;
                          } else {
                            ((kk) this).field_e = -1;
                            h.a(0, true);
                            break L12;
                          }
                        }
                        if (-1 != ((kk) this).field_e) {
                          pg.field_d[((kk) this).field_e].c((byte) -89);
                          continue L6;
                        } else {
                          continue L6;
                        }
                      } else {
                        continue L6;
                      }
                    }
                  }
                }
                L13: {
                  L14: {
                    if (((kk) this).field_g == 2) {
                      break L14;
                    } else {
                      if (((kk) this).field_g == 3) {
                        break L14;
                      } else {
                        if (-5 != (((kk) this).field_g ^ -1)) {
                          ((kk) this).field_c.e(0);
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (((kk) this).field_g == 2) {
                    ((kk) this).field_c.b((byte) 107);
                    ((kk) this).field_c.a(this.a(-99, 3), -117);
                    break L13;
                  } else {
                    if (3 == ((kk) this).field_g) {
                      ((kk) this).field_c.b((byte) 113);
                      ((kk) this).field_c.a(this.d(122), -58);
                      break L13;
                    } else {
                      if (-5 == (((kk) this).field_g ^ -1)) {
                        ((kk) this).field_c.b((byte) 119);
                        ((kk) this).field_c.a(this.d(122), 83);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                if (((kk) this).field_c.field_a == -1) {
                  continue L6;
                } else {
                  this.a(((kk) this).field_c.field_a, false, 77);
                  continue L6;
                }
              }
            }
          }
        }
    }

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ic var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            md stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            md stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            md stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            md stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            md stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            md stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = id.a(param2, (byte) 37);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 == null) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param2 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ke.a(var3_ref, (byte) 80);
                            var7 = eg.a("%3a", 4, ":", var3_ref);
                            var8 = eg.a("%40", 4, "@", var7);
                            var9 = eg.a("%26", 4, "&", var8);
                            var10 = eg.a("%23", 4, "#", var9);
                            if (ni.field_e == null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = fk.field_c;
                            stackOut_12_1 = 101;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = ni.field_e.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(kd.field_c).append("&u=");
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            if (null == ck.field_f) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (md) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = ck.field_f;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (md) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = "" + cc.field_b;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + md.field_l + "&v2=" + md.field_m + "&e=" + var10);
                            var4 = ((md) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (0 != var4.field_g) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            em.a(1L, false);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((var4.field_g ^ -1) == -2) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (param1 >= 56) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        field_h = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        vk var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String[] stackIn_5_0 = null;
        String[] stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        String[] stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String stackIn_7_3 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackOut_4_0 = null;
        String[] stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        String[] stackOut_6_0 = null;
        String[] stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        String stackOut_6_3 = null;
        String[] stackOut_5_0 = null;
        String[] stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        String stackOut_5_3 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          var4 = this.a((byte) -128, param1);
          var5 = this.a(param1, (byte) 52);
          var6 = b.field_j[((kk) this).field_g][param1];
          var7 = ma.field_a[var6];
          if (var7 == null) {
            var7_ref = "ERROR: missing text";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((var6 ^ -1) != -17) {
            if (-6 != (var6 ^ -1)) {
              break L1;
            } else {
              if ((((kk) this).field_g ^ -1) == -3) {
                var7_ref = pl.field_c;
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            L2: {
              stackOut_4_0 = new String[1];
              stackOut_4_1 = new String[1];
              stackOut_4_2 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (qb.field_b) {
                stackOut_6_0 = (String[]) (Object) stackIn_6_0;
                stackOut_6_1 = (String[]) (Object) stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = ie.field_d;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L2;
              } else {
                stackOut_5_0 = (String[]) (Object) stackIn_5_0;
                stackOut_5_1 = (String[]) (Object) stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = qg.field_b;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            stackIn_7_1[stackIn_7_2] = stackIn_7_3;
            var7_ref = gg.a(stackIn_7_0, var7_ref, true);
            break L1;
          }
        }
        var8 = ((kk) this).field_f[param1].field_m;
        if (param0 == -1) {
          L3: {
            ((kk) this).field_f[param1].e();
            if (param2) {
              stackOut_16_0 = 5683782;
              stackIn_17_0 = stackOut_16_0;
              break L3;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L3;
            }
          }
          L4: {
            var9 = stackIn_17_0;
            if (-8 == (((kk) this).field_g ^ -1)) {
              break L4;
            } else {
              lb.a(0, var8, (byte) -33, wc.field_e, 0, 40);
              break L4;
            }
          }
          L5: {
            L6: {
              var10 = sb.field_r;
              if ((var6 ^ -1) == -12) {
                break L6;
              } else {
                if (-13 != (var6 ^ -1)) {
                  var10.a(var7_ref, var8 >> -935373055, var10.field_C, var9, -1);
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var11 = lh.field_b - -137;
              var12 = -var11 + var8 >> -839809695;
              var12 = var12 + (lh.field_b - -13);
              var10.c(var7_ref, var12, var10.field_C, var9, -1);
              sd.field_f.c(var12, -6 + mc.field_b[((kk) this).field_g] / 2);
              if (-12 == (var6 ^ -1)) {
                stackOut_24_0 = re.field_e;
                stackIn_25_0 = stackOut_24_0;
                break L7;
              } else {
                stackOut_23_0 = ol.field_e;
                stackIn_25_0 = stackOut_23_0;
                break L7;
              }
            }
            var13 = stackIn_25_0;
            de.field_f.c(146 * var13 / 256 + -2 + var12, 14);
            break L5;
          }
          L8: {
            L9: {
              ac.field_a.a((byte) 114);
              var11 = 40 * ((kk) this).field_i / 20;
              if (var11 > 40) {
                break L9;
              } else {
                if (!ad.a(false)) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            var11 = 40;
            break L8;
          }
          ((kk) this).field_f[param1].b(var5, var4 - -(40 - var11 >> 378069313), var8, var11);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
            return -16;
        }
        return 40;
    }

    private final void c(int param0) {
        ((kk) this).field_a.e();
        int var2 = 380;
        int var3 = 275;
        ge.d(3, 3, -6 + var2, -6 + var3, 16249775);
        lb.a(0, var2, (byte) 64, wc.field_e, 0, var3);
        int var5 = 86 % ((53 - param0) / 61);
        int var4 = 90;
        int discarded$0 = sb.field_r.a(el.field_c, 20, var4, -40 + var2, 200, 9330743, -1, 1, 0, 0);
        ac.field_a.a((byte) 127);
        int var6 = ((kk) this).field_i * var3 / 20;
        if ((var3 ^ -1) > (var6 ^ -1)) {
            var6 = var3;
        }
        ((kk) this).field_a.b(130, 90 + (var3 + -var6 >> -1958809311), var2, var6);
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 >= 93) {
            break L0;
          } else {
            this.a(121, true, 108);
            break L0;
          }
        }
        L1: {
          var2 = ((kk) this).field_c.field_a;
          if (((kk) this).field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 != (oa.field_H ^ -1)) {
              break L1;
            } else {
              ((kk) this).field_c.field_b = false;
              if (var2 >= 0) {
                if ((var2 ^ -1) == -2) {
                  var2 = 2;
                  break L1;
                } else {
                  if (-1 == (var2 ^ -1)) {
                    break L1;
                  } else {
                    var2 = 1;
                    break L1;
                  }
                }
              } else {
                var2 = 0;
                break L1;
              }
            }
          }
        }
        L2: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L2;
          } else {
            if ((oa.field_H ^ -1) != -98) {
              break L2;
            } else {
              ((kk) this).field_c.field_b = false;
              if (0 > var2) {
                var2 = 0;
                break L2;
              } else {
                if (1 == var2) {
                  var2 = 2;
                  break L2;
                } else {
                  if (0 != var2) {
                    var2 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
        }
        L3: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L3;
          } else {
            if ((oa.field_H ^ -1) != -99) {
              break L3;
            } else {
              ((kk) this).field_c.field_b = false;
              if ((var2 ^ -1) <= -1) {
                if (-3 < (var2 ^ -1)) {
                  if (var2 != 0) {
                    var2--;
                    break L3;
                  } else {
                    var2 = 1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                var2 = 2;
                break L3;
              }
            }
          }
        }
        L4: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L4;
          } else {
            if (oa.field_H != 99) {
              break L4;
            } else {
              ((kk) this).field_c.field_b = false;
              if (var2 == -1) {
                var2 = 2;
                break L4;
              } else {
                if (var2 < 1) {
                  var2++;
                  break L4;
                } else {
                  if ((var2 ^ -1) != -2) {
                    break L4;
                  } else {
                    var2 = 0;
                    break L4;
                  }
                }
              }
            }
          }
        }
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -6) {
            return 122;
        }
        for (var4 = 0; (b.field_j[((kk) this).field_g].length ^ -1) < (var4 ^ -1); var4++) {
            var5 = this.a((byte) -128, var4);
            if (this.a(var4, (byte) 52) <= param2) {
                if ((param2 ^ -1) > (this.b(-6162, var4) ^ -1)) {
                    if (param1 >= var5) {
                        if (param1 < this.a(var4, true) + var5) {
                            return var4;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_50_0 = 0;
        int stackIn_169_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (((kk) this).field_c.c((byte) -104)) {
            cj.a((byte) -47, ke.field_h[0]);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 >= 15) {
            break L1;
          } else {
            field_b = 52;
            break L1;
          }
        }
        L2: {
          var4 = b.field_j[((kk) this).field_g][param0];
          var5 = var4;
          if (-1 == (var5 ^ -1)) {
            if (((kk) this).field_c.g(0)) {
              L3: {
                if (!qb.field_b) {
                  L4: {
                    if (!ok.a(false)) {
                      break L4;
                    } else {
                      if (-1 != (lg.field_w ^ -1)) {
                        break L4;
                      } else {
                        qb.field_b = true;
                        break L3;
                      }
                    }
                  }
                  if (s.field_S == null) {
                    break L3;
                  } else {
                    if (s.field_S.field_l) {
                      if (null == s.field_S.field_g) {
                        break L3;
                      } else {
                        L5: {
                          var5_ref_String__ = s.field_S.field_g[1];
                          if (null != var5_ref_String__[0]) {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            break L5;
                          } else {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            break L5;
                          }
                        }
                        qb.field_b = stackIn_50_0 != 0;
                        break L3;
                      }
                    } else {
                      s.field_S = null;
                      lg.field_w = lg.field_w + 1;
                      pg.field_b = null;
                      hf.field_f = new hj();
                      ((kk) this).field_e = -1;
                      break L2;
                    }
                  }
                } else {
                  break L3;
                }
              }
              s.field_S = null;
              lg.field_w = lg.field_w + 1;
              pg.field_b = null;
              hf.field_f = new hj();
              ((kk) this).field_e = -1;
              break L2;
            } else {
              break L2;
            }
          } else {
            if (var5 != 1) {
              L6: {
                if (-16 != (var5 ^ -1)) {
                  if ((var5 ^ -1) != -6) {
                    L7: {
                      if (13 == var5) {
                        if (!((kk) this).field_c.g(0)) {
                          break L7;
                        } else {
                          ((kk) this).field_e = 5;
                          if (ok.a(false)) {
                            ((kk) this).field_e = 8;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (var5 == 3) {
                          if (!((kk) this).field_c.g(0)) {
                            break L7;
                          } else {
                            ((kk) this).field_e = 3;
                            break L2;
                          }
                        } else {
                          if ((var5 ^ -1) != -3) {
                            if ((var5 ^ -1) == -12) {
                              L8: {
                                if (((kk) this).field_c.c(102)) {
                                  cj.a((byte) -37, ke.field_h[0]);
                                  qb.a(256, 0);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                if (((kk) this).field_c.b(-29996)) {
                                  cj.a((byte) 102, ke.field_h[0]);
                                  qb.a(256, 256);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (((kk) this).field_c.a((byte) 10)) {
                                  L11: {
                                    var5 = lh.field_b + 137;
                                    var6 = (-var5 + (this.a(param0, (byte) 52) + this.b(-6162, param0)) >> -1332231615) - (-lh.field_b - 30);
                                    var7 = ((-var6 + ei.field_a) * 256 + 4608) / 146;
                                    if (-1 > (var7 ^ -1)) {
                                      if (-257 < (var7 ^ -1)) {
                                        qb.a(256, var7);
                                        break L11;
                                      } else {
                                        qb.a(256, 256);
                                        break L11;
                                      }
                                    } else {
                                      qb.a(256, 0);
                                      break L11;
                                    }
                                  }
                                  we.field_j = we.field_j + 1;
                                  if (-26 <= (we.field_j + 1 ^ -1)) {
                                    break L10;
                                  } else {
                                    we.field_j = 0;
                                    cj.a((byte) 109, ke.field_h[0]);
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              L12: {
                                if (((kk) this).field_c.f(0)) {
                                  cj.a((byte) -126, ke.field_h[0]);
                                  jc.b(-42);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              if (!((kk) this).field_c.d(25149)) {
                                break L7;
                              } else {
                                cj.a((byte) -18, ke.field_h[0]);
                                wc.a(-17076);
                                break L2;
                              }
                            } else {
                              if (12 != var5) {
                                if (var5 != 4) {
                                  if ((var5 ^ -1) != -18) {
                                    if (var5 != 6) {
                                      if (-8 == (var5 ^ -1)) {
                                        if (!((kk) this).field_c.g(0)) {
                                          break L7;
                                        } else {
                                          ef.field_b = 0;
                                          break L2;
                                        }
                                      } else {
                                        if (-9 == (var5 ^ -1)) {
                                          if (((kk) this).field_c.g(0)) {
                                            ef.field_b = 1;
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          if (9 == var5) {
                                            if (!((kk) this).field_c.g(0)) {
                                              break L7;
                                            } else {
                                              ef.field_b = 2;
                                              break L2;
                                            }
                                          } else {
                                            if (-19 != (var5 ^ -1)) {
                                              if (var5 == 19) {
                                                if (!((kk) this).field_c.g(0)) {
                                                  break L7;
                                                } else {
                                                  ((kk) this).field_e = 4;
                                                  break L2;
                                                }
                                              } else {
                                                if (var5 != 14) {
                                                  if (-11 == (var5 ^ -1)) {
                                                    if (!((kk) this).field_c.g(0)) {
                                                      break L7;
                                                    } else {
                                                      L13: {
                                                        if (ba.field_f != null) {
                                                          rb.h(3591);
                                                          break L13;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                      hd.a(true, ii.a(false));
                                                      break L2;
                                                    }
                                                  } else {
                                                    if (16 == var5) {
                                                      if (!((kk) this).field_c.g(0)) {
                                                        break L7;
                                                      } else {
                                                        L14: {
                                                          tl.a(-32663, false);
                                                          if (qb.field_b) {
                                                            stackOut_168_0 = 0;
                                                            stackIn_169_0 = stackOut_168_0;
                                                            break L14;
                                                          } else {
                                                            stackOut_167_0 = 1;
                                                            stackIn_169_0 = stackOut_167_0;
                                                            break L14;
                                                          }
                                                        }
                                                        qb.field_b = stackIn_169_0 != 0;
                                                        break L7;
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  if (!((kk) this).field_c.g(0)) {
                                                    break L7;
                                                  } else {
                                                    if (8 != ((kk) this).field_g) {
                                                      if (7 != ((kk) this).field_g) {
                                                        if ((((kk) this).field_g ^ -1) == -10) {
                                                          gj.a(0, 9, 2);
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        L15: {
                                                          if (-1 <= (fg.field_b ^ -1)) {
                                                            var5 = 2;
                                                            break L15;
                                                          } else {
                                                            if (-1 > (hf.field_f.field_A ^ -1)) {
                                                              var5 = 6;
                                                              break L15;
                                                            } else {
                                                              var5 = 10;
                                                              break L15;
                                                            }
                                                          }
                                                        }
                                                        gj.a(0, 7, var5);
                                                        break L2;
                                                      }
                                                    } else {
                                                      gj.a(0, 8, 5);
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              if (!((kk) this).field_c.g(0)) {
                                                break L7;
                                              } else {
                                                ((kk) this).field_e = 3;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!((kk) this).field_c.g(0)) {
                                        break L7;
                                      } else {
                                        L16: {
                                          if (-1 <= (hf.field_f.field_I ^ -1)) {
                                            break L16;
                                          } else {
                                            L17: {
                                              hf.field_f.field_A = hf.field_f.field_A + (10000 + hf.field_f.field_I);
                                              var5 = 10000 - -hf.field_f.field_I;
                                              var6 = ej.field_b % 3;
                                              if (-1 == (var6 ^ -1)) {
                                                cl.field_d = cl.field_d + var5;
                                                break L17;
                                              } else {
                                                if (var6 == 1) {
                                                  nj.field_b = nj.field_b - var5;
                                                  break L17;
                                                } else {
                                                  var7 = var5 / 3;
                                                  cl.field_d = cl.field_d + var7;
                                                  nj.field_b = nj.field_b - (-var7 + var5);
                                                  break L17;
                                                }
                                              }
                                            }
                                            hf.field_f.a(-19921);
                                            hf.field_f.field_I = -1;
                                            break L16;
                                          }
                                        }
                                        L18: {
                                          if (!ok.a(false)) {
                                            hf.field_f.c((byte) -108);
                                            s.field_S = null;
                                            if (fg.field_b == 0) {
                                              if (hf.field_f.field_A <= 0) {
                                                ((kk) this).field_e = 0;
                                                break L18;
                                              } else {
                                                ((kk) this).field_e = 2;
                                                break L18;
                                              }
                                            } else {
                                              if (0 < hf.field_f.field_A) {
                                                ((kk) this).field_e = 6;
                                                break L18;
                                              } else {
                                                ((kk) this).field_e = 10;
                                                break L18;
                                              }
                                            }
                                          } else {
                                            L19: {
                                              if (hf.field_f.field_A > 0) {
                                                break L19;
                                              } else {
                                                if (0 < fg.field_b) {
                                                  break L19;
                                                } else {
                                                  ((kk) this).field_e = 0;
                                                  break L18;
                                                }
                                              }
                                            }
                                            ((kk) this).field_e = 7;
                                            break L18;
                                          }
                                        }
                                        bl.a(50, uh.field_e);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (((kk) this).field_c.g(0)) {
                                      ((kk) this).field_e = vl.field_g;
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  if (((kk) this).field_c.g(0)) {
                                    hl.field_a = 0;
                                    if (null == ba.field_f) {
                                      ue.a((byte) 122, param1);
                                      break L2;
                                    } else {
                                      rb.h(3591);
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                L20: {
                                  if (((kk) this).field_c.c(102)) {
                                    w.a(-1, 0);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (((kk) this).field_c.b(-29996)) {
                                    w.a(-1, 256);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (((kk) this).field_c.a((byte) 10)) {
                                    var5 = lh.field_b - -128 - -9;
                                    var6 = 30 + (this.a(param0, (byte) 52) - (-this.b(-6162, param0) + var5) >> -1088242175) + lh.field_b;
                                    var7 = 256 * (ei.field_a - (var6 + -18)) / 146;
                                    if (-1 > (var7 ^ -1)) {
                                      if (var7 < 256) {
                                        w.a(-1, var7);
                                        break L22;
                                      } else {
                                        w.a(-1, 256);
                                        break L22;
                                      }
                                    } else {
                                      w.a(-1, 0);
                                      break L22;
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                                L23: {
                                  if (!((kk) this).field_c.f(0)) {
                                    break L23;
                                  } else {
                                    cj.a((byte) 103, ke.field_h[0]);
                                    vg.a(124);
                                    break L23;
                                  }
                                }
                                if (!((kk) this).field_c.d(25149)) {
                                  break L7;
                                } else {
                                  cj.a((byte) -51, ke.field_h[0]);
                                  fl.a(-225);
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (((kk) this).field_c.g(0)) {
                              ((kk) this).field_e = 2;
                              if (!ok.a(false)) {
                                break L7;
                              } else {
                                ((kk) this).field_e = 9;
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    break L2;
                  } else {
                    break L6;
                  }
                } else {
                  if (!((kk) this).field_c.g(0)) {
                    break L6;
                  } else {
                    kg.field_c = 0;
                    break L6;
                  }
                }
              }
              if (((kk) this).field_c.g(0)) {
                ((kk) this).field_e = 0;
                break L2;
              } else {
                break L2;
              }
            } else {
              if (((kk) this).field_c.g(0)) {
                h.a(0, true);
                ((kk) this).field_e = -1;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -99) {
            break L0;
          } else {
            ((kk) this).field_d = true;
            break L0;
          }
        }
        L1: {
          var3 = ((kk) this).field_c.field_a;
          if (((kk) this).field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 == (oa.field_H ^ -1)) {
              L2: {
                if ((var3 ^ -1) > -1) {
                  var3 = param1;
                  break L2;
                } else {
                  if (0 != var3 % param1) {
                    break L2;
                  } else {
                    var3 = var3 + param1;
                    break L2;
                  }
                }
              }
              L3: {
                if ((var3 ^ -1) >= (((kk) this).field_c.field_i ^ -1)) {
                  break L3;
                } else {
                  var3 = ((kk) this).field_c.field_i;
                  break L3;
                }
              }
              ((kk) this).field_c.field_b = false;
              var3--;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L4: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L4;
          } else {
            if (97 == oa.field_H) {
              L5: {
                if (var3 >= 0) {
                  L6: {
                    var3++;
                    if ((var3 % param1 ^ -1) != -1) {
                      break L6;
                    } else {
                      var3 = var3 - param1;
                      break L6;
                    }
                  }
                  if ((((kk) this).field_c.field_i ^ -1) < (var3 ^ -1)) {
                    break L5;
                  } else {
                    var3 = var3 - ((kk) this).field_c.field_i % param1;
                    break L5;
                  }
                } else {
                  var3 = 0;
                  break L5;
                }
              }
              ((kk) this).field_c.field_b = false;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L7: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L7;
          } else {
            if (-99 == (oa.field_H ^ -1)) {
              L8: {
                if (param1 > var3) {
                  var3 = var3 - param1;
                  break L8;
                } else {
                  var3 = 1;
                  break L8;
                }
              }
              ((kk) this).field_c.field_b = false;
              if (-1 < (var3 ^ -1)) {
                var3 = 3;
                break L7;
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (((kk) this).field_c.a((byte) 10)) {
            break L9;
          } else {
            if (oa.field_H != 99) {
              break L9;
            } else {
              L10: {
                var3 = var3 + param1;
                if ((var3 ^ -1) <= (((kk) this).field_c.field_i ^ -1)) {
                  if ((((kk) this).field_c.field_i + ((kk) this).field_c.field_i % param1 ^ -1) <= (var3 ^ -1)) {
                    var3 = 3;
                    break L10;
                  } else {
                    var3 = 1;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              ((kk) this).field_c.field_b = false;
              break L9;
            }
          }
        }
        return var3;
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var9 = 101 / ((58 - param1) / 33);
        for (param4 = ge.field_i.length + -1; param4 >= 0; param4--) {
            param5 = ge.field_i[param4];
            param7 = 255 & param5;
            param2 = 255 & param5 >> -140450192;
            param6 = param5 >> -1325656696 & 255;
            if (119 > param6) {
                param2 = param2 - param3;
                param7 = param7 - param3;
                param6 = param6 - param3;
            } else {
                param6 = param6 - param0;
                param7 = param7 - param0;
                param2 = param2 - param0;
            }
            if (param7 < 0) {
                param7 = 0;
            }
            if (0 > param2) {
                param2 = 0;
            }
            if (!((param6 ^ -1) <= -1)) {
                param6 = 0;
            }
            ge.field_i[param4] = bd.a(param7, bd.a(param2 << -845292272, param6 << -8027416));
        }
    }

    final void c(byte param0) {
        ((kk) this).field_d = false;
        ((kk) this).field_i = 0;
        int var2 = -55 % ((param0 - -6) / 62);
        ((kk) this).field_e = ((kk) this).field_g;
    }

    kk(int param0) {
        int var2 = 0;
        int var4 = 0;
        L0: {
          ((kk) this).field_g = param0;
          ((kk) this).field_c = new sg(b.field_j[param0].length);
          ((kk) this).field_f = new le[b.field_j[param0].length];
          if (-3 == (param0 ^ -1)) {
            var4 = 0;
            var2 = var4;
            L1: while (true) {
              if ((var4 ^ -1) <= (b.field_j[param0].length ^ -1)) {
                ((kk) this).field_a = new le(380, 275);
                break L0;
              } else {
                ((kk) this).field_f[var4] = new le((-fl.field_a[param0] + tj.field_c[param0] - 30) / 3, 40);
                var4++;
                continue L1;
              }
            }
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) == -4) {
                  break L3;
                } else {
                  if (-5 == (param0 ^ -1)) {
                    break L3;
                  } else {
                    if (param0 != 9) {
                      break L2;
                    } else {
                      ((kk) this).field_a = new le(380, 275);
                      break L2;
                    }
                  }
                }
              }
              ((kk) this).field_a = new le(380, 263);
              break L2;
            }
            var2 = 0;
            L4: while (true) {
              if (b.field_j[param0].length <= var2) {
                break L0;
              } else {
                ((kk) this).field_f[var2] = new le(tj.field_c[param0] - fl.field_a[param0], 40);
                var2++;
                continue L4;
              }
            }
          }
        }
        ((kk) this).field_d = false;
        ((kk) this).field_i = 0;
        ((kk) this).field_e = ((kk) this).field_g;
    }

    private final int b(int param0, int param1) {
        if ((((kk) this).field_g ^ -1) != -3) {
            if (3 != ((kk) this).field_g) {
                // if_icmpne L44
            }
            if (-3 < (param1 ^ -1)) {
                return tj.field_c[((kk) this).field_g];
            }
        }
        if (param0 != -6162) {
            ((kk) this).a(false, true);
        }
        return this.a(param1, (byte) 52) + ((kk) this).field_f[param1].field_m;
    }

    private final int a(byte param0, int param1) {
        if (!(-3 == (((kk) this).field_g ^ -1))) {
            if (((kk) this).field_g != 3) {
                // if_icmpne L41
            }
            if (param1 < 2) {
                return mc.field_b[((kk) this).field_g] * param1 + i.field_r[((kk) this).field_g];
            }
            return mc.field_b[((kk) this).field_g] + i.field_r[((kk) this).field_g];
        }
        if (!(param1 >= 3)) {
            return i.field_r[((kk) this).field_g];
        }
        if (param0 > -127) {
            ((kk) this).a(false, false);
        }
        return mc.field_b[((kk) this).field_g] + i.field_r[((kk) this).field_g];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
