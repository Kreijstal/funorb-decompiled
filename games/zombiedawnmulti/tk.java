/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends nc {
    static int field_m;
    static cj field_l;
    static int field_n;
    static String field_o;
    static java.awt.Canvas field_q;
    private int field_p;

    private final void e(int param0) {
        if (param0 >= -88) {
            this.e(-105);
        }
        on.field_bb = new ki[63];
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == -2939) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= 3) {
            return;
          } else {
            L2: {
              var5 = var4 * 73;
              s.field_c.a(420 - -var5, 341);
              if (!s.field_c.b(var5 + 420, 341, bd.field_g, bo.field_d)) {
                break L2;
              } else {
                q.field_d = 5 + var4;
                break L2;
              }
            }
            var6 = ll.field_k.field_s[var4];
            if (255 != var6) {
              if (var6 < 63) {
                L3: {
                  var7 = ll.field_k.d(var6, param2 + 2992) ? 1 : 0;
                  wa.field_b[var6 + -18].g(429 + var5, 357);
                  var8 = ll.field_k.field_t[var6];
                  if (ll.field_k.d(var6, 53)) {
                    var8 = cr.a(var6, -97);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var8 = var8 * 29 / cr.a(var6, -109);
                  stackOut_13_0 = 473 - -var5;
                  stackOut_13_1 = -var8 + 386;
                  stackOut_13_2 = 7;
                  stackOut_13_3 = var8;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (var7 == 0) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = param1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    break L4;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = param0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    break L4;
                  }
                }
                oo.e(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                int discarded$1 = 51603;
                if (h.i()) {
                  if (jk.a((byte) -70, var6)) {
                    el.field_E.a(var5 + 419, 345);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        b.field_a.a(41, b.field_a.field_zb, 850, wa.field_g);
        b.field_a.c(false, -1);
        cp.field_O = -1;
        kn.field_b = -1;
        q.field_d = -1;
        oo.h(0, 53, 640, 85);
        var2 = 112;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 3) {
            L1: {
              this.a(56, 86, 172, 18, (byte) -92);
              var3 = 0;
              var4 = 0;
              var5 = 0;
              if (lh.field_l != 255) {
                L2: {
                  L3: {
                    if (32 > lh.field_l) {
                      break L3;
                    } else {
                      if (lh.field_l > 38) {
                        break L3;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                L4: {
                  L5: {
                    var5 = stackIn_20_0;
                    if (lh.field_l < 44) {
                      break L5;
                    } else {
                      if (lh.field_l > 62) {
                        break L5;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L4;
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L4;
                }
                L6: {
                  L7: {
                    var4 = stackIn_24_0;
                    if (lh.field_l < 0) {
                      break L7;
                    } else {
                      if (lh.field_l >= 19) {
                        break L7;
                      } else {
                        stackOut_26_0 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L6;
                }
                var3 = stackIn_28_0;
                break L1;
              } else {
                break L1;
              }
            }
            L8: {
              stackOut_29_0 = 7;
              stackOut_29_1 = 337;
              stackOut_29_2 = 328;
              stackOut_29_3 = 80;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              stackIn_31_3 = stackOut_29_3;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              stackIn_30_3 = stackOut_29_3;
              if (var3 != 0) {
                stackOut_31_0 = stackIn_31_0;
                stackOut_31_1 = stackIn_31_1;
                stackOut_31_2 = stackIn_31_2;
                stackOut_31_3 = stackIn_31_3;
                stackOut_31_4 = 16711680;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                stackIn_32_3 = stackOut_31_3;
                stackIn_32_4 = stackOut_31_4;
                break L8;
              } else {
                stackOut_30_0 = stackIn_30_0;
                stackOut_30_1 = stackIn_30_1;
                stackOut_30_2 = stackIn_30_2;
                stackOut_30_3 = stackIn_30_3;
                stackOut_30_4 = 0;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_32_4 = stackOut_30_4;
                break L8;
              }
            }
            L9: {
              oo.f(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, 128);
              stackOut_32_0 = 337;
              stackOut_32_1 = 337;
              stackOut_32_2 = 296;
              stackOut_32_3 = 80;
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              stackIn_34_3 = stackOut_32_3;
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              stackIn_33_3 = stackOut_32_3;
              if (var4 == 0) {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = stackIn_34_1;
                stackOut_34_2 = stackIn_34_2;
                stackOut_34_3 = stackIn_34_3;
                stackOut_34_4 = 0;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                stackIn_35_2 = stackOut_34_2;
                stackIn_35_3 = stackOut_34_3;
                stackIn_35_4 = stackOut_34_4;
                break L9;
              } else {
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = stackIn_33_1;
                stackOut_33_2 = stackIn_33_2;
                stackOut_33_3 = stackIn_33_3;
                stackOut_33_4 = 16711680;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_35_4 = stackOut_33_4;
                break L9;
              }
            }
            L10: {
              oo.f(stackIn_35_0, stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, 128);
              oo.a(9, 339, 74, 76, 0);
              oo.a(10, 340, 72, 74, 6575425, 3354915);
              oo.a(339, 339, 74, 76, 0);
              oo.a(340, 340, 72, 74, 1989419, 597262);
              int discarded$2 = qp.field_w.a(ve.field_a, 10, 340, 72, 74, 16777215, -1, 1, 1, 0);
              int discarded$3 = qp.field_w.a(en.field_f, 339, 339, 72, 74, 16777215, -1, 1, 1, 0);
              this.a(var5 != 0, (byte) -120, 14680064, 53248);
              this.b(14680064, 53248, -2939);
              this.d((byte) -104);
              this.e((byte) -67);
              if (lh.field_l == 255) {
                break L10;
              } else {
                L11: {
                  L12: {
                    var6 = null;
                    if (lh.field_l < 0) {
                      break L12;
                    } else {
                      if (lh.field_l < 19) {
                        var6 = (Object) (Object) wa.field_b[lh.field_l];
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (32 > lh.field_l) {
                      break L13;
                    } else {
                      if (lh.field_l <= 38) {
                        var6 = (Object) (Object) wa.field_b[lh.field_l - 13];
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (lh.field_l < 44) {
                    break L11;
                  } else {
                    if (lh.field_l > 62) {
                      break L11;
                    } else {
                      var6 = (Object) (Object) wa.field_b[-44 + (lh.field_l + 26)];
                      break L11;
                    }
                  }
                }
                if (var6 == null) {
                  break L10;
                } else {
                  ((ja) var6).c(bd.field_g + -8, bo.field_d - 8, 200);
                  break L10;
                }
              }
            }
            return;
          } else {
            L14: {
              if (bo.field_d < 43) {
                break L14;
              } else {
                if (bo.field_d > 78) {
                  break L14;
                } else {
                  if (~var2 < ~bd.field_g) {
                    break L14;
                  } else {
                    if (var2 + 120 < bd.field_g) {
                      break L14;
                    } else {
                      kn.field_b = var3;
                      break L14;
                    }
                  }
                }
              }
            }
            L15: {
              if (var3 == ao.field_d) {
                var5 = 65280;
                var4 = 16768512;
                var6_int = 1783040;
                break L15;
              } else {
                L16: {
                  if (var3 != kn.field_b) {
                    break L16;
                  } else {
                    if (ud.field_S) {
                      break L16;
                    } else {
                      var6_int = 3884288;
                      var5 = 3202868;
                      var4 = 16768544;
                      break L15;
                    }
                  }
                }
                var4 = 8886132;
                var6_int = 1774864;
                var5 = 44800;
                break L15;
              }
            }
            oo.e(var2, 43, 120, 35, 10, var4);
            oo.a(var2 - -2, 45, 116, 31, 10, var5, var6_int);
            pb.field_e.b(fl.field_b[var3], 60 + var2, 69, 16646020, -1);
            var2 += 141;
            var3++;
            continue L0;
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (kj.field_q < 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          var7 = sj.field_p;
          if (var7 == 1) {
            if (var2 == 0) {
              break L1;
            } else {
              var4 = 8;
              var7 = 0;
              L2: while (true) {
                if (var7 >= 5) {
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= 3) {
                      this.e(-100);
                      break L1;
                    } else {
                      var3 = ll.field_k.field_s[var7];
                      if (ll.field_k.c(127, var3)) {
                        if (!ll.field_k.d(var3, 53)) {
                          ll.field_k.a(-98, var4, var3);
                          var7++;
                          continue L3;
                        } else {
                          var7++;
                          continue L3;
                        }
                      } else {
                        var7++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  L4: {
                    var3 = ll.field_k.field_m[var7];
                    if (!ll.field_k.c(127, var3)) {
                      break L4;
                    } else {
                      if (!ll.field_k.d(var3, 53)) {
                        ll.field_k.a(34, var4, var3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = ll.field_k.field_g[var7];
                  if (ll.field_k.c(127, var3)) {
                    if (!ll.field_k.d(var3, 53)) {
                      ll.field_k.a(-88, var4, var3);
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            if (10 == var7) {
              if (var2 != 0) {
                L5: {
                  var5 = hp.a((byte) 29, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L5;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L5;
                    } else {
                      ll.field_k.a(40, 10, var5);
                      this.e(-125);
                      break L5;
                    }
                  }
                }
                L6: {
                  var5 = hp.a((byte) -77, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L6;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(-106, 10, var5);
                      this.e(-106);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  var5 = hp.a((byte) -74, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L7;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L7;
                    } else {
                      ll.field_k.a(91, 10, var5);
                      this.e(-95);
                      break L7;
                    }
                  }
                }
                L8: {
                  var5 = hp.a((byte) -91, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L8;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L8;
                    } else {
                      ll.field_k.a(117, 10, var5);
                      this.e(-121);
                      break L8;
                    }
                  }
                }
                L9: {
                  var5 = hp.a((byte) 123, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L9;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(125, 10, var5);
                      this.e(-122);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  var5 = hp.a((byte) -115, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L10;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(-100, 10, var5);
                      this.e(-90);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  var5 = hp.a((byte) -69, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L11;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(56, 10, var5);
                      this.e(-100);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  var5 = hp.a((byte) -125, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L12;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L12;
                    } else {
                      ll.field_k.a(97, 10, var5);
                      this.e(-117);
                      break L12;
                    }
                  }
                }
                L13: {
                  var5 = hp.a((byte) 82, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L13;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L13;
                    } else {
                      ll.field_k.a(76, 10, var5);
                      this.e(-101);
                      break L13;
                    }
                  }
                }
                L14: {
                  var5 = hp.a((byte) 104, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L14;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(76, 10, var5);
                      this.e(-109);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                var5 = hp.a((byte) -85, g.field_a, 63);
                if (ll.field_k.c(127, var5)) {
                  if (!ll.field_k.d(var5, 53)) {
                    ll.field_k.a(-100, 10, var5);
                    this.e(-92);
                    ll.field_k.c((byte) -108);
                    break L1;
                  } else {
                    ll.field_k.c((byte) -108);
                    break L1;
                  }
                } else {
                  ll.field_k.c((byte) -108);
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if (11 != var7) {
                if (var7 != 5) {
                  if (var7 == 12) {
                    if (var2 != 0) {
                      ll.field_k.e(-6821, 33);
                      ll.field_k.e(-6821, 2);
                      ll.field_k.e(-6821, 57);
                      ll.field_k.e(-6821, 0);
                      ll.field_k.e(-6821, 1);
                      ll.field_k.e(-6821, 58);
                      ll.field_k.c((byte) -93);
                      ll.field_k.e(-6821, 16);
                      var7 = 0;
                      L15: while (true) {
                        if (var7 >= 19) {
                          var7 = 44;
                          L16: while (true) {
                            if (var7 >= 62) {
                              var7 = 32;
                              L17: while (true) {
                                if (var7 > 38) {
                                  this.e(-109);
                                  break L1;
                                } else {
                                  ll.field_k.e(-6821, var7);
                                  var7++;
                                  continue L17;
                                }
                              }
                            } else {
                              ll.field_k.e(-6821, var7);
                              var7++;
                              continue L16;
                            }
                          }
                        } else {
                          ll.field_k.e(-6821, var7);
                          var7++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if (var2 == 0) {
                    break L1;
                  } else {
                    var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                    var7_ref_int__ = var6;
                    var8 = 0;
                    L18: while (true) {
                      if (var7_ref_int__.length <= var8) {
                        break L1;
                      } else {
                        var9 = var7_ref_int__[var8];
                        ll.field_k.a(-86, 9999, var9);
                        var8++;
                        continue L18;
                      }
                    }
                  }
                }
              } else {
                if (var2 != 0) {
                  ll.field_k.field_f = 0L;
                  ll.field_k.field_n = ej.a((byte) 120);
                  var7 = 0;
                  L19: while (true) {
                    if (ll.field_k.field_t.length <= var7) {
                      this.e(-100);
                      break L1;
                    } else {
                      ll.field_k.field_t[var7] = 0;
                      var7++;
                      continue L19;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
        }
        super.c(param0);
    }

    private final void a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var13 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = ll.field_k.g((byte) 125);
        var6 = 0;
        if (param1 == -120) {
          L0: while (true) {
            if (var6 >= 5) {
              return;
            } else {
              L1: {
                var7 = 50 * var6;
                if (!pf.field_a.b(84 + var7, 340, bd.field_g, bo.field_d)) {
                  break L1;
                } else {
                  q.field_d = var6;
                  break L1;
                }
              }
              if (var5 > var6) {
                L2: {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      if (pb.a(ll.field_k.field_m[var6], -20, lh.field_l)) {
                        pf.field_a.a(var7 + 84, 340, 128, 8388608);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pf.field_a.a(var7 + 84, 340);
                  break L2;
                }
                L4: {
                  var8 = ll.field_k.field_m[var6];
                  var9 = ll.field_k.field_g[var6];
                  if (var8 != 255) {
                    if (ll.field_k.a(45, -126)) {
                      if (var8 == 255) {
                        break L4;
                      } else {
                        if (17 == var8) {
                          break L4;
                        } else {
                          el.field_E.a(84 - -var7, 340);
                          break L4;
                        }
                      }
                    } else {
                      if (!ll.field_k.a(45, -126)) {
                        break L4;
                      } else {
                        if (var8 == 255) {
                          break L4;
                        } else {
                          if (17 == var8) {
                            break L4;
                          } else {
                            el.field_E.a(84 - -var7, 340);
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    if (ll.field_k.a(45, -126)) {
                      if (var8 == 255) {
                        break L4;
                      } else {
                        if (17 == var8) {
                          break L4;
                        } else {
                          el.field_E.a(84 - -var7, 340);
                          break L4;
                        }
                      }
                    } else {
                      if (!ll.field_k.a(45, -126)) {
                        break L4;
                      } else {
                        if (var8 == 255) {
                          break L4;
                        } else {
                          if (17 == var8) {
                            break L4;
                          } else {
                            el.field_E.a(84 - -var7, 340);
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                int discarded$1 = 51603;
                if (h.i()) {
                  L5: {
                    if (jk.a((byte) -51, var8)) {
                      break L5;
                    } else {
                      if (jk.a((byte) -103, var9)) {
                        break L5;
                      } else {
                        var6++;
                        continue L0;
                      }
                    }
                  }
                  el.field_E.a(84 + var7, 340);
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                pf.field_a.a(var7 + 84, 340, 32);
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.e(-107);
        ((tk) this).field_p = 0;
    }

    final void b(byte param0) {
        int discarded$0 = -61;
        th.b();
        super.b(param0);
    }

    tk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ja var12 = null;
        ja var9 = null;
        int var10 = 0;
        try {
            on.field_bb = new ki[63];
            lh.field_l = 255;
            var12 = fq.field_k;
            var9 = fq.field_k.f();
            rq.field_u = new int[255];
            for (var10 = 0; var10 < 255; var10++) {
                rq.field_u[var10] = var10 * 65793;
            }
            bp.field_u.field_ab = wc.field_M;
            cr.field_i.field_ab = df.field_Q;
            b.field_a = new mj(0L, ih.field_d, var12, var9, bp.field_u, cr.field_i, false);
            b.field_a.field_Q = 315;
            b.field_a.field_zb = 631;
            ((tk) this).field_p = 0;
            b.field_a.field_x = 5;
            b.field_a.field_z = 15;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "tk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = ((wf.field_m << 1) / 3 - -(10 * param2)) % 29;
        int var8 = -var7 + 29;
        int var9 = q.a((byte) -126, (var7 << 10) / 29) >> 9;
        int var10 = (var7 * param0 - -(param5 * var8) << 4) / 29;
        int var11 = (param3 * var7 - -(var8 * param4) << 4) / 29;
        oo.a(var10, var11, 64, var9, rq.field_u);
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        ef var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int[] var24 = null;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!ud.field_S) {
          if (param0 == -67) {
            L0: {
              L1: {
                var6 = ll.field_k;
                var7 = -1;
                var8 = -1;
                if (cp.field_O == 255) {
                  break L1;
                } else {
                  if (cp.field_O != -1) {
                    var7 = cp.field_O;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (q.field_d < 5) {
                  if (0 > q.field_d) {
                    break L2;
                  } else {
                    if (~q.field_d <= ~var6.g((byte) -80)) {
                      var7 = -2;
                      break L2;
                    } else {
                      var8 = var6.field_g[q.field_d];
                      var7 = var6.field_m[q.field_d];
                      break L2;
                    }
                  }
                } else {
                  var7 = var6.field_s[-5 + q.field_d];
                  break L2;
                }
              }
              int discarded$3 = 51603;
              if (!h.i()) {
                break L0;
              } else {
                if (jk.a((byte) -51, var7)) {
                  var7 = -3;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L3: {
              if (255 == var7) {
                var7 = -1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var8 == 255) {
                var8 = -1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 == var7) {
                gf.field_f = 0;
                break L5;
              } else {
                L6: {
                  if (gf.field_f != 0) {
                    break L6;
                  } else {
                    if (10 < b.a(true)) {
                      gf.field_f = gf.field_f + 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (gf.field_f > 0) {
                  L7: {
                    gf.field_f = gf.field_f + 2;
                    if (255 < gf.field_f) {
                      gf.field_f = 255;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (!var6.c(127, var7)) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L8;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L8;
                    }
                  }
                  L9: {
                    var9 = stackIn_37_0;
                    if (var7 == -2) {
                      var10 = vc.field_b;
                      break L9;
                    } else {
                      if (var7 == -3) {
                        var10 = ik.field_b;
                        break L9;
                      } else {
                        var20 = wq.field_g[var7][var9];
                        var10 = var20;
                        if (-1 != var8) {
                          var10 = var20 + ii.field_b + wq.field_g[var8][var9];
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    var11 = qp.field_w;
                    var12 = var11.a(var10);
                    var13 = 8 * gf.field_f;
                    var4 = qp.field_w.field_w * (1 - -ro.a(-124, '<', (CharSequence) (Object) var10));
                    if (var13 > 255) {
                      var13 = 255;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: while (true) {
                    if (400 >= var12) {
                      var14 = new String[var11.b(var10, var12)];
                      var24 = new int[var14.length];
                      var16 = 0;
                      L12: while (true) {
                        if (var16 >= var14.length) {
                          int discarded$4 = var11.a(var10, var24, var14);
                          var16 = 0;
                          var17 = 0;
                          L13: while (true) {
                            if (~var14.length >= ~var17) {
                              L14: {
                                var5 = var16;
                                var4 = var14.length * qp.field_w.field_w;
                                var2 = bd.field_g;
                                var3 = 32 + bo.field_d;
                                if (var2 >= 0) {
                                  if (var5 + var2 > 635) {
                                    var2 = -var5 + 635;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                } else {
                                  var2 = 0;
                                  break L14;
                                }
                              }
                              L15: {
                                if (var3 - -var4 > 475) {
                                  var3 = -5 + (-var4 + 480);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              oo.b(var2 - 2, -2 + var3, var5 - -8, var4 + 8, 4, 0, var13 / 2);
                              oo.b(-4 + var2, var3 + -4, 8 + var5, var4 + 8, 4, 5005603, var13);
                              int discarded$5 = var11.a(var10, var2, var3, var5, var4, 16777215, 0, var13, 1, 1, 0);
                              break L5;
                            } else {
                              L16: {
                                var18 = var11.a(var14[var17]);
                                if (~var16 <= ~var18) {
                                  break L16;
                                } else {
                                  var16 = var18;
                                  break L16;
                                }
                              }
                              var17++;
                              continue L13;
                            }
                          }
                        } else {
                          var24[var16] = var12;
                          var16++;
                          continue L12;
                        }
                      }
                    } else {
                      var12 = var12 / 2;
                      var4 = var4 * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(hp param0, int param1, int param2) {
        ga var6 = null;
        int var4 = 0;
        try {
            if (param1 < 13) {
                Object var5 = null;
                tk.a((hp) null, -88, 107);
            }
            var6 = ma.field_a;
            var6.b((byte) -35, param2);
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.a(121, 1);
            var6.a(127, param0.field_v);
            var6.c(param0.field_f, 0);
            var6.b(-118, param0.field_q);
            var6.b(92, param0.field_u);
            var6.b(-115, param0.field_r);
            var6.b(100, param0.field_n);
            int discarded$0 = var6.f(var4, 115);
            var6.e(70, var6.field_j + -var4);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "tk.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        int var24 = 0;
        int[][] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var24 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.h(5, 54, 635, 330);
        var34 = em.field_Y[ao.field_d];
        var7 = 0;
        var8 = -9 / ((-16 - param4) / 50);
        L0: while (true) {
          if (var7 >= var34.length) {
            oo.c();
            return;
          } else {
            var35 = var34[var7];
            var10 = var35.length;
            var11 = 0;
            L1: while (true) {
              L2: {
                if (var11 >= var10) {
                  break L2;
                } else {
                  var12 = var35[var11];
                  if (var12 == 255) {
                    var10 = var11;
                    break L2;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
              var11 = (-var10 + var35.length) * param0 / 2;
              if (0 != var10) {
                var12 = 0;
                L3: while (true) {
                  if (var10 > var12) {
                    var13 = var35[var12];
                    if (255 != var13) {
                      if (ll.field_k.g(var13, 4)) {
                        L4: {
                          if (on.field_bb[var13] == null) {
                            var14 = param3 + var7 * param2 - wa.field_g;
                            var15 = var11 + param1 - -(var12 * param0);
                            on.field_bb[var13] = new ki(var13, var14, var15);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          on.field_bb[var13].field_q = -wa.field_g + (param3 - -(var7 * param2));
                          on.field_bb[var13].a(true);
                          if (!on.field_bb[var13].b((byte) 39)) {
                            break L5;
                          } else {
                            if (lh.field_l != 255) {
                              break L5;
                            } else {
                              if (!ud.field_S) {
                                cp.field_O = var13;
                                on.field_bb[var13].field_b.e(on.field_bb[var13].field_q, on.field_bb[var13].field_g, (q.a((byte) -60, wf.field_m << 4) >> 9) + 128);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var14 = on.field_bb[var13].field_c;
                        if (ll.field_k.g(var14, 4)) {
                          var36 = em.field_ab[var14];
                          var16 = 0;
                          L6: while (true) {
                            if (var36.length > var16) {
                              var17 = var36[var16];
                              if (var17 != 255) {
                                if (ll.field_k.g(var17, 4)) {
                                  var18 = -1;
                                  var19 = 0;
                                  L7: while (true) {
                                    if (var19 >= on.field_bb.length) {
                                      if (var18 != -1) {
                                        if (on.field_bb[var18] != null) {
                                          var19 = -3 + on.field_bb[var13].field_q;
                                          var20 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var13].field_g;
                                          var21 = on.field_bb[var13].field_b.field_x + (on.field_bb[var18].field_q + 3);
                                          var22 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var18].field_g;
                                          var23 = -1;
                                          L8: while (true) {
                                            if (var23 >= 1) {
                                              L9: {
                                                if (ll.field_k.c(127, var14)) {
                                                  var23 = 0;
                                                  L10: while (true) {
                                                    if (var23 >= 3) {
                                                      break L9;
                                                    } else {
                                                      this.b(var19, -562798775, var23, var20, var22, var21);
                                                      var23++;
                                                      continue L10;
                                                    }
                                                  }
                                                } else {
                                                  break L9;
                                                }
                                              }
                                              oo.a(var19, -4 + var20, 4, 9, 1);
                                              oo.a(var19 - -1, -3 + var20, 2, 7, 11316396, 5066061);
                                              oo.a(var21 + -4, -4 + var22, 4, 9, 1);
                                              oo.a(-3 + var21, -3 + var22, 2, 7, 11316396, 5066061);
                                              var16++;
                                              continue L6;
                                            } else {
                                              oo.g(var19, var20 + var23, var21, var23 + var22, 11528032);
                                              var23++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var16++;
                                          continue L6;
                                        }
                                      } else {
                                        var16++;
                                        continue L6;
                                      }
                                    } else {
                                      if (on.field_bb[var19] != null) {
                                        if (var17 == on.field_bb[var19].field_c) {
                                          var18 = var19;
                                          var19 = on.field_bb.length;
                                          var19++;
                                          continue L7;
                                        } else {
                                          var19++;
                                          continue L7;
                                        }
                                      } else {
                                        var19++;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  var16++;
                                  continue L6;
                                }
                              } else {
                                var16++;
                                continue L6;
                              }
                            } else {
                              var12++;
                              continue L3;
                            }
                          }
                        } else {
                          var12++;
                          continue L3;
                        }
                      } else {
                        var12++;
                        continue L3;
                      }
                    } else {
                      var12++;
                      continue L3;
                    }
                  } else {
                    var7++;
                    continue L0;
                  }
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        }
    }

    public static void c() {
        field_o = null;
        field_l = null;
        field_q = null;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.h(param5, param2, param4 + param5 + 20, 20 + param2 + param0);
        o.field_h.c(param5, param2);
        oo.f(param5, param2, param4 - -20, param0 + 20, 2560, 160);
        ak.a(20 + param4, param0 - -20, -5, param5, param2);
        oo.c();
        if (param3 >= -55) {
            ((tk) this).b((byte) 22);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rp var8 = null;
        int var9 = 0;
        rp var10 = null;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        L0: {
          L1: {
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            if (bd.field_g < 600) {
              break L1;
            } else {
              if (620 <= bd.field_g) {
                break L1;
              } else {
                if (bo.field_d < 10) {
                  break L1;
                } else {
                  if (bo.field_d > 30) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        u.field_i = stackIn_6_0 != 0;
        if (ud.field_S) {
          ((tk) this).field_p = ((tk) this).field_p + 1;
          var2 = 0;
          var3 = 0;
          L2: while (true) {
            if (~var3 <= ~lc.field_m.length) {
              L3: {
                if (var2 == 0) {
                  break L3;
                } else {
                  ud.field_S = false;
                  break L3;
                }
              }
              L4: {
                if (kd.field_b == 1) {
                  ud.field_S = false;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                if (lc.field_m[var3]) {
                  var2 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3++;
              continue L2;
            }
          }
        } else {
          L6: {
            ((tk) this).field_p = 0;
            if (kd.field_b != 1) {
              break L6;
            } else {
              if (u.field_i) {
                L7: {
                  if (ud.field_S) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L7;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L7;
                  }
                }
                ud.field_S = stackIn_26_0 != 0;
                ((tk) this).field_p = 2000;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L8: {
            super.a(param0);
            var8 = ll.field_k;
            var10 = var8;
            var3 = var10.g((byte) 123);
            en.a(~param0, 4);
            if (lh.field_l == 255) {
              break L8;
            } else {
              if (q.field_d == -1) {
                break L8;
              } else {
                L9: {
                  if (lh.field_l < 44) {
                    break L9;
                  } else {
                    if (lh.field_l <= 62) {
                      if (0 > q.field_d) {
                        break L8;
                      } else {
                        if (q.field_d < 5) {
                          en.a(-1, 6);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (0 > lh.field_l) {
                    break L10;
                  } else {
                    if (lh.field_l >= 19) {
                      break L10;
                    } else {
                      if (var3 <= q.field_d) {
                        en.a(-1, 6);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (32 > lh.field_l) {
                  break L8;
                } else {
                  if (lh.field_l >= 38) {
                    break L8;
                  } else {
                    L11: {
                      if (q.field_d < 0) {
                        break L11;
                      } else {
                        if (~var3 >= ~q.field_d) {
                          break L11;
                        } else {
                          if (!pb.a(var8.field_m[q.field_d], -20, lh.field_l)) {
                            break L11;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    en.a(param0 + -1, 6);
                    break L8;
                  }
                }
              }
            }
          }
          L12: {
            L13: {
              if (!c.field_b) {
                break L13;
              } else {
                if (pq.field_f != 0) {
                  L14: {
                    if (wf.field_m + -sq.field_S >= 25) {
                      stackOut_54_0 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      break L14;
                    } else {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L14;
                    }
                  }
                  kk.field_u = stackIn_55_0 != 0;
                  sq.field_S = wf.field_m;
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            kk.field_u = false;
            break L12;
          }
          L15: {
            if (pq.field_f != param0) {
              stackOut_58_0 = 0;
              stackIn_59_0 = stackOut_58_0;
              break L15;
            } else {
              stackOut_57_0 = 1;
              stackIn_59_0 = stackOut_57_0;
              break L15;
            }
          }
          L16: {
            c.field_b = stackIn_59_0 != 0;
            if (!kk.field_u) {
              break L16;
            } else {
              L17: {
                if (!ll.field_k.c(127, cp.field_O)) {
                  break L17;
                } else {
                  L18: {
                    if (0 > cp.field_O) {
                      break L18;
                    } else {
                      if (cp.field_O < 19) {
                        var4 = var10.g((byte) -42);
                        var5 = 0;
                        if (var5 == 0) {
                          var6 = 0;
                          L19: while (true) {
                            if (~var6 <= ~var4) {
                              break L17;
                            } else {
                              if (var10.field_m[var6] != 255) {
                                var6++;
                                continue L19;
                              } else {
                                var10.field_m[var6] = cp.field_O;
                                uj discarded$10 = nm.b(-128, 87);
                                break L17;
                              }
                            }
                          }
                        } else {
                          break L17;
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (cp.field_O < 44) {
                    break L17;
                  } else {
                    if (cp.field_O > 62) {
                      break L17;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      L20: while (true) {
                        L21: {
                          if (var5 >= 3) {
                            break L21;
                          } else {
                            if (var10.field_s[var5] != cp.field_O) {
                              var5++;
                              continue L20;
                            } else {
                              var4 = 1;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (var4 != 0) {
                            break L22;
                          } else {
                            var5 = 0;
                            L23: while (true) {
                              if (3 <= var5) {
                                break L22;
                              } else {
                                if (255 != var10.field_s[var5]) {
                                  var5++;
                                  continue L23;
                                } else {
                                  var10.field_s[var5] = cp.field_O;
                                  uj discarded$11 = nm.b(-127, 87);
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        break L17;
                      }
                    }
                  }
                }
              }
              L24: {
                if (q.field_d < 0) {
                  break L24;
                } else {
                  if (q.field_d < 5) {
                    L25: {
                      if (380 >= bo.field_d) {
                        break L25;
                      } else {
                        var10.field_g[q.field_d] = 255;
                        break L25;
                      }
                    }
                    var10.field_m[q.field_d] = 255;
                    break L16;
                  } else {
                    break L24;
                  }
                }
              }
              if (q.field_d >= 5) {
                var10.field_s[-5 + q.field_d] = 255;
                break L16;
              } else {
                break L16;
              }
            }
          }
          L26: {
            b.field_a.a(-11838, true);
            wa.field_g = b.field_a.a(850, b.field_a.field_zb, -18367);
            var4 = -10;
            wa.field_g = wa.field_g + var4 * t.field_d;
            var5 = -100;
            if (!b.field_a.k(20)) {
              break L26;
            } else {
              wa.field_g = wa.field_g + var4;
              break L26;
            }
          }
          L27: {
            if (!b.field_a.h(4690)) {
              break L27;
            } else {
              wa.field_g = wa.field_g - var4;
              break L27;
            }
          }
          L28: {
            if (!b.field_a.j(param0 ^ 64)) {
              break L28;
            } else {
              wa.field_g = wa.field_g + var5;
              break L28;
            }
          }
          L29: {
            if (!b.field_a.c((byte) -104)) {
              break L29;
            } else {
              wa.field_g = wa.field_g - var5;
              break L29;
            }
          }
          L30: {
            if (wa.field_g < 0) {
              wa.field_g = 0;
              break L30;
            } else {
              break L30;
            }
          }
          L31: {
            if (wa.field_g <= -b.field_a.field_zb + 850) {
              break L31;
            } else {
              wa.field_g = -b.field_a.field_zb + 850;
              break L31;
            }
          }
          L32: {
            if (1 != kd.field_b) {
              break L32;
            } else {
              L33: {
                if (255 == cp.field_O) {
                  break L33;
                } else {
                  if (var10.c(127, cp.field_O)) {
                    lh.field_l = cp.field_O;
                    uj discarded$12 = nm.b(-126, 90);
                    break L33;
                  } else {
                    break L33;
                  }
                }
              }
              if (kn.field_b == -1) {
                if (lh.field_l != 255) {
                  break L32;
                } else {
                  if (q.field_d == -1) {
                    break L32;
                  } else {
                    if (q.field_d < 5) {
                      if (bo.field_d >= 380) {
                        lh.field_l = var10.field_g[q.field_d];
                        uj discarded$13 = nm.b(param0 ^ -128, 90);
                        var10.field_g[q.field_d] = 255;
                        break L32;
                      } else {
                        lh.field_l = var10.field_m[q.field_d];
                        uj discarded$14 = nm.b(-128, 90);
                        var10.field_m[q.field_d] = 255;
                        var10.field_g[q.field_d] = 255;
                        break L32;
                      }
                    } else {
                      lh.field_l = var10.field_s[q.field_d - 5];
                      uj discarded$15 = nm.b(-128, 90);
                      var10.field_s[q.field_d + -5] = 255;
                      break L32;
                    }
                  }
                }
              } else {
                ao.field_d = kn.field_b;
                uj discarded$16 = nm.b(-126, 91);
                break L32;
              }
            }
          }
          L34: {
            if (pq.field_f == 1) {
              break L34;
            } else {
              L35: {
                if (q.field_d == -1) {
                  break L35;
                } else {
                  if (lh.field_l == 255) {
                    break L35;
                  } else {
                    if (q.field_d >= 5) {
                      if (lh.field_l < 44) {
                        break L35;
                      } else {
                        if (lh.field_l <= 62) {
                          var9 = 0;
                          var6 = var9;
                          L36: while (true) {
                            if (3 <= var9) {
                              var10.field_s[-5 + q.field_d] = lh.field_l;
                              uj discarded$17 = nm.b(param0 + -127, 87);
                              break L35;
                            } else {
                              L37: {
                                if (~lh.field_l == ~var10.field_s[var9]) {
                                  var10.field_s[var9] = 255;
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                              var9++;
                              continue L36;
                            }
                          }
                        } else {
                          break L35;
                        }
                      }
                    } else {
                      if (q.field_d < var3) {
                        L38: {
                          if (lh.field_l < 0) {
                            break L38;
                          } else {
                            if (lh.field_l >= 19) {
                              break L38;
                            } else {
                              var10.field_m[q.field_d] = lh.field_l;
                              if (!pb.a(lh.field_l, -20, var10.field_g[q.field_d])) {
                                var10.field_g[q.field_d] = 255;
                                uj discarded$18 = nm.b(-126, 87);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                        if (lh.field_l < 32) {
                          break L35;
                        } else {
                          if (lh.field_l <= 38) {
                            if (!pb.a(var10.field_m[q.field_d], -20, lh.field_l)) {
                              break L35;
                            } else {
                              var10.field_g[q.field_d] = lh.field_l;
                              uj discarded$19 = nm.b(-128, 87);
                              break L35;
                            }
                          } else {
                            break L35;
                          }
                        }
                      } else {
                        break L35;
                      }
                    }
                  }
                }
              }
              lh.field_l = 255;
              break L34;
            }
          }
          return;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (u.field_i) {
            oo.d(610, 20, 9, 16777215);
            break L0;
          } else {
            if (ud.field_S) {
              oo.d(610, 20, 9, 65280);
              break L0;
            } else {
              oo.d(610, 20, 9, 16711680, (q.a((byte) -104, wf.field_m << 5) >> 9) + 128);
              break L0;
            }
          }
        }
        L1: {
          if (param0 < -85) {
            break L1;
          } else {
            field_n = 43;
            break L1;
          }
        }
        L2: {
          jl.field_u.c(600, 10);
          if (!ud.field_S) {
            break L2;
          } else {
            L3: {
              oo.f(0, 0, 640, 480, 0, 64);
              var6 = 10;
              var2 = 445;
              var3 = 2;
              var4 = 120;
              var5 = pb.field_e.a(cc.field_a, var4, 0);
              this.a(var5, var6, var3, -79, var4, var2);
              int discarded$5 = pb.field_e.a(cc.field_a, var2 - -var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
              lh.field_m.a(-3 + ((var6 << 1) + (var2 - -var4)), 8 + var3);
              if (((tk) this).field_p > 0) {
                var2 = 200;
                var4 = 390;
                var3 = 100;
                var5 = pb.field_e.a(uc.field_g, var4, 0);
                this.a(var5, var6, var3, -105, var4, var2);
                int discarded$6 = pb.field_e.a(uc.field_g, var2 + var6, var3 + var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(var2 - -50, var3 - -3 + -ip.field_e.field_b);
                oi.field_k.a(var2 + 50, var5 + var3 + -3 - -(var6 << 1));
                lh.field_m.a(var2 - (-var4 + -(var6 << 1) - -3), var3 + (var5 >> 1));
                uo.field_n.a(var2 + (-var6 + -1), (var5 >> 1) + var3);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((tk) this).field_p > 100) {
                var2 = 50;
                var5 = 80;
                var4 = 250;
                var3 = 280;
                var5 = pb.field_e.a(wq.field_d, var4, 0);
                this.a(var5, var6, var3, -126, var4, var2);
                int discarded$7 = pb.field_e.a(wq.field_d, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(var2 - -50, var5 + var3 + (-3 - -(var6 << 1)));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((tk) this).field_p <= 300) {
                break L5;
              } else {
                L6: {
                  L7: {
                    var5 = 80;
                    var3 = 400;
                    var4 = 250;
                    var2 = 50;
                    if (p.field_e == 1) {
                      break L7;
                    } else {
                      if (p.field_e != 2) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var3 -= 10;
                  break L6;
                }
                var5 = pb.field_e.a(jf.field_c, var4, 0);
                this.a(var5, var6, var3, -71, var4, var2);
                int discarded$8 = pb.field_e.a(jf.field_c, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(50 + var2, -ip.field_e.field_b + (var3 + 3));
                break L5;
              }
            }
            L8: {
              if (((tk) this).field_p <= 200) {
                break L8;
              } else {
                var3 = 280;
                var4 = 250;
                var5 = 80;
                var2 = 350;
                var5 = pb.field_e.a(pi.field_h, var4, 0);
                this.a(var5, var6, var3, -118, var4, var2);
                int discarded$9 = pb.field_e.a(pi.field_h, var2 + var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(80 + var2, var5 + -3 + (var3 + (var6 << 1)));
                break L8;
              }
            }
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Show lobby chat from my friends";
    }
}
