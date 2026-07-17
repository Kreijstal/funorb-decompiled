/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bf extends hs {
    private kq[] field_j;
    private hd field_q;
    private up[] field_k;
    static np field_u;
    private int field_r;
    private int field_B;
    private kq[] field_z;
    private jw field_o;
    private int field_p;
    private hd field_A;
    private boolean field_v;
    private hd[] field_t;
    static gd field_y;
    private int field_l;
    static kg[][] field_s;
    private int field_w;
    static ic field_m;
    static ot field_x;
    static String field_n;

    private final int a(byte param0, int param1) {
        if (param0 <= 98) {
            this.a((byte) 101, true, 125, true);
        }
        int var3 = this.g(param1, 0);
        if (var3 == -1) {
            return 75 * (param1 / 3) + ((bf) this).field_A.field_T;
        }
        return ((bf) this).field_t[var3].field_T;
    }

    private final void a(byte param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        int stackIn_2_5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        ut stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        ut stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        ut stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        ut stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        ut stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        int stackOut_1_5 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        ut stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        ut stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        ut stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        ut stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        ut stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        L0: {
          var5 = ((bf) this).field_t[param2].field_F;
          var6 = ((bf) this).field_t[param2].field_T;
          var7 = ((bf) this).field_t[param2].field_q;
          var8 = ((bf) this).field_t[param2].field_mb;
          var9 = es.field_f.field_o * 13 >> 4;
          var10 = es.field_f.field_v * 13 >> 4;
          if (!param1) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = var5;
              stackOut_1_1 = var6;
              stackOut_1_2 = var7;
              stackOut_1_3 = var8;
              stackOut_1_4 = 10;
              stackOut_1_5 = 65793;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              if (!param3) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = stackIn_3_5;
                stackOut_3_6 = 200;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                stackIn_4_6 = stackOut_3_6;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = 256;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                stackIn_4_6 = stackOut_2_6;
                break L1;
              }
            }
            L2: {
              on.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6);
              stackOut_4_0 = var5;
              stackOut_4_1 = var6;
              stackOut_4_2 = var7;
              stackOut_4_3 = var8;
              stackOut_4_4 = 10;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              if (param3) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = 16777215;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = 8947848;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L2;
              }
            }
            on.f(stackIn_7_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
            break L0;
          }
        }
        L3: {
          var11 = (var7 - var9 >> 1) + var5;
          if (param0 <= -72) {
            break L3;
          } else {
            this.a((byte) 82, true, -69, false);
            break L3;
          }
        }
        L4: {
          var12 = var6 - (-(var8 - var10 >> 1) - -6);
          if (!((bf) this).field_v) {
            var12 += 4;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          stackOut_13_0 = es.field_f;
          stackOut_13_1 = var11;
          stackOut_13_2 = var12;
          stackOut_13_3 = var9;
          stackOut_13_4 = var10;
          stackIn_17_0 = stackOut_13_0;
          stackIn_17_1 = stackOut_13_1;
          stackIn_17_2 = stackOut_13_2;
          stackIn_17_3 = stackOut_13_3;
          stackIn_17_4 = stackOut_13_4;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          stackIn_14_2 = stackOut_13_2;
          stackIn_14_3 = stackOut_13_3;
          stackIn_14_4 = stackOut_13_4;
          if (param3) {
            stackOut_17_0 = (ut) (Object) stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = stackIn_17_2;
            stackOut_17_3 = stackIn_17_3;
            stackOut_17_4 = stackIn_17_4;
            stackOut_17_5 = 256;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            stackIn_18_3 = stackOut_17_3;
            stackIn_18_4 = stackOut_17_4;
            stackIn_18_5 = stackOut_17_5;
            break L5;
          } else {
            stackOut_14_0 = (ut) (Object) stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = stackIn_14_2;
            stackOut_14_3 = stackIn_14_3;
            stackOut_14_4 = stackIn_14_4;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            stackIn_16_4 = stackOut_14_4;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            stackIn_15_4 = stackOut_14_4;
            if (!param1) {
              stackOut_16_0 = (ut) (Object) stackIn_16_0;
              stackOut_16_1 = stackIn_16_1;
              stackOut_16_2 = stackIn_16_2;
              stackOut_16_3 = stackIn_16_3;
              stackOut_16_4 = stackIn_16_4;
              stackOut_16_5 = 100;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_18_3 = stackOut_16_3;
              stackIn_18_4 = stackOut_16_4;
              stackIn_18_5 = stackOut_16_5;
              break L5;
            } else {
              stackOut_15_0 = (ut) (Object) stackIn_15_0;
              stackOut_15_1 = stackIn_15_1;
              stackOut_15_2 = stackIn_15_2;
              stackOut_15_3 = stackIn_15_3;
              stackOut_15_4 = stackIn_15_4;
              stackOut_15_5 = 200;
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              stackIn_18_3 = stackOut_15_3;
              stackIn_18_4 = stackOut_15_4;
              stackIn_18_5 = stackOut_15_5;
              break L5;
            }
          }
        }
        L6: {
          ((ut) (Object) stackIn_18_0).d(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5);
          if (!param1) {
            break L6;
          } else {
            un.field_d.d(Integer.toString(1 + param2), (var7 >> 1) + var5, 23 + var12, 65793, -1);
            break L6;
          }
        }
    }

    private final hd a(int param0, int param1, byte param2) {
        hd var5 = new hd();
        hd var4 = var5;
        var5.field_s = ws.field_b[param0][param1] * 147 / 896 + -26;
        var5.field_J = ws.field_d[param0][param1] * 220 / 1344 + -37;
        var4.field_mb = 75;
        var4.field_q = 52;
        return var4;
    }

    private final boolean a(boolean param0, hd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_int = wt.field_x;
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                bf.a(43, (String[]) null, 37, (java.applet.Applet) null, -63, -56);
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = us.field_j;
                if (var3_int <= param1.field_F) {
                  break L3;
                } else {
                  if (param1.field_T >= var4) {
                    break L3;
                  } else {
                    if (var3_int >= param1.field_F - -param1.field_q) {
                      break L3;
                    } else {
                      if (param1.field_mb + param1.field_T <= var4) {
                        break L3;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("bf.M(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        up var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kq var11 = null;
        up var12 = null;
        int stackIn_6_0 = 0;
        up stackIn_9_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        up stackOut_8_0 = null;
        up stackOut_7_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var10 = Kickabout.field_G;
          ((bf) this).field_q.b(0, param1);
          if (!((bf) this).a((byte) 13)) {
            ((bf) this).field_l = -1;
            break L0;
          } else {
            ((bf) this).field_l = -1;
            var3 = 0;
            L1: while (true) {
              if (9 <= var3) {
                L2: {
                  if (0 == ((bf) this).field_l) {
                    var3 = 0;
                    L3: while (true) {
                      if (-10 <= var3) {
                        break L2;
                      } else {
                        if (!((bf) this).field_j[var3].field_Eb.c(-2)) {
                          if (((bf) this).field_j[var3].field_gb) {
                            if (!((bf) this).field_j[var3].field_Gb) {
                              ((bf) this).field_l = var3;
                              var3++;
                              continue L3;
                            } else {
                              var3++;
                              continue L3;
                            }
                          } else {
                            var3++;
                            continue L3;
                          }
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (((bf) this).field_o.field_sb == 1) {
                    this.i(74, -1);
                    wh discarded$1 = sp.c(61, 47);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((bf) this).field_o.field_Gb = ((bf) this).field_a.field_o.a(-82, ((bf) this).field_g);
                ((bf) this).field_o.field_lb = ((bf) this).field_a.field_o.a(false, ((bf) this).field_g);
                break L0;
              } else {
                L5: {
                  var11 = ((bf) this).field_j[var3];
                  if (((bf) this).field_a.field_e) {
                    stackOut_5_0 = var3;
                    stackIn_6_0 = stackOut_5_0;
                    break L5;
                  } else {
                    stackOut_4_0 = tu.field_E.field_q[var3];
                    stackIn_6_0 = stackOut_4_0;
                    break L5;
                  }
                }
                L6: {
                  var5 = stackIn_6_0;
                  if (((bf) this).field_a.field_e) {
                    stackOut_8_0 = ((bf) this).field_k[var5];
                    stackIn_9_0 = stackOut_8_0;
                    break L6;
                  } else {
                    stackOut_7_0 = tu.field_E.field_i[var5];
                    stackIn_9_0 = stackOut_7_0;
                    break L6;
                  }
                }
                L7: {
                  var6 = stackIn_9_0;
                  var11.a(((bf) this).field_r, ((bf) this).field_w, (byte) 125, ((bf) this).field_B, var6);
                  if (((bf) this).field_a.field_e) {
                    break L7;
                  } else {
                    var11.a((byte) -128, tu.field_E, var5);
                    break L7;
                  }
                }
                L8: {
                  if (var11.field_Eb.c(-2)) {
                    break L8;
                  } else {
                    if (var11.field_qb == 0) {
                      break L8;
                    } else {
                      if (!var11.field_Gb) {
                        var11.field_F = -(var11.field_q >> 1) + wt.field_x;
                        var11.field_s = -(var11.field_q >> 1) + wt.field_x;
                        var11.field_T = us.field_j - (var11.field_mb >> 1);
                        var11.field_J = us.field_j - (var11.field_mb >> 1);
                        ((bf) this).field_l = var3;
                        ((bf) this).field_p = var3;
                        var3++;
                        continue L1;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (((bf) this).field_p != var3) {
                  L9: {
                    var7 = this.h(var3, 3);
                    var8 = this.a((byte) 116, var3);
                    if (var7 != var11.field_s) {
                      L10: {
                        var9 = -var11.field_s + (var7 + var11.field_s * 3 >> 2);
                        if (0 == var9) {
                          L11: {
                            if (var7 > var11.field_s) {
                              stackOut_34_0 = 1;
                              stackIn_35_0 = stackOut_34_0;
                              break L11;
                            } else {
                              stackOut_33_0 = -1;
                              stackIn_35_0 = stackOut_33_0;
                              break L11;
                            }
                          }
                          var9 = stackIn_35_0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var11.field_s = var11.field_s + var9;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (var8 != var11.field_J) {
                    L12: {
                      var9 = (var11.field_J * 3 + var8 >> 2) - var11.field_J;
                      if (var9 == 0) {
                        L13: {
                          if (var11.field_J < var8) {
                            stackOut_43_0 = 1;
                            stackIn_44_0 = stackOut_43_0;
                            break L13;
                          } else {
                            stackOut_42_0 = -1;
                            stackIn_44_0 = stackOut_42_0;
                            break L13;
                          }
                        }
                        var9 = stackIn_44_0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var11.field_J = var11.field_J + var9;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  ((bf) this).field_p = -1;
                  if (!this.a(false, ((bf) this).field_A)) {
                    var7 = 3;
                    L14: while (true) {
                      if (0 <= var7) {
                        if (((bf) this).field_a.field_i[((bf) this).field_h][var7] == ((bf) this).field_g) {
                          if (this.a(false, ((bf) this).field_t[var7])) {
                            kj.a((byte) 45);
                            this.i(74, var5 - -1 << 2 | var7);
                            var7--;
                            continue L14;
                          } else {
                            var7--;
                            continue L14;
                          }
                        } else {
                          var7--;
                          continue L14;
                        }
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  } else {
                    var7 = this.g(var3, 0);
                    if (var7 != -1) {
                      this.i(74, var7);
                      var3++;
                      continue L1;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        var3 = 0;
        L15: while (true) {
          if (var3 >= 4) {
            L16: {
              if (param0 < -92) {
                break L16;
              } else {
                field_u = null;
                break L16;
              }
            }
            return;
          } else {
            if (((bf) this).field_a.field_i[((bf) this).field_h][var3] != ((bf) this).field_g) {
              var12 = ((bf) this).field_a.field_b[((bf) this).field_h][var3];
              ((bf) this).field_z[var3].a(((bf) this).field_r, ((bf) this).field_w, (byte) 127, ((bf) this).field_B, var12);
              var3++;
              continue L15;
            } else {
              var3++;
              continue L15;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_s = null;
        field_n = null;
        field_y = null;
        field_u = null;
        field_x = null;
        int var1 = 19;
    }

    final static void a(tv param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        uv var5 = null;
        String var6 = null;
        uv var7 = null;
        String var8 = null;
        uv var9 = null;
        String var10 = null;
        uv var11 = null;
        String var12 = null;
        uv var13 = null;
        hd stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        Object stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        String stackIn_1_4 = null;
        Object stackIn_1_5 = null;
        long stackIn_1_6 = 0L;
        String stackIn_1_7 = null;
        hd stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        String stackIn_2_4 = null;
        Object stackIn_2_5 = null;
        long stackIn_2_6 = 0L;
        String stackIn_2_7 = null;
        hd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        String stackIn_3_4 = null;
        Object stackIn_3_5 = null;
        long stackIn_3_6 = 0L;
        String stackIn_3_7 = null;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        Object stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        String stackOut_0_4 = null;
        Object stackOut_0_5 = null;
        long stackOut_0_6 = 0L;
        String stackOut_0_7 = null;
        hd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        String stackOut_2_4 = null;
        Object stackOut_2_5 = null;
        long stackOut_2_6 = 0L;
        String stackOut_2_7 = null;
        int stackOut_2_8 = 0;
        hd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        String stackOut_1_4 = null;
        Object stackOut_1_5 = null;
        long stackOut_1_6 = 0L;
        String stackOut_1_7 = null;
        int stackOut_1_8 = 0;
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
              stackOut_0_0 = param0.field_s;
              stackOut_0_1 = 0;
              stackOut_0_2 = null;
              stackOut_0_3 = param0.field_c;
              stackOut_0_4 = param0.field_q;
              stackOut_0_5 = null;
              stackOut_0_6 = param0.field_d;
              stackOut_0_7 = param0.field_h;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_2_6 = stackOut_0_6;
              stackIn_2_7 = stackOut_0_7;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              stackIn_1_6 = stackOut_0_6;
              stackIn_1_7 = stackOut_0_7;
              if (param0.field_c == 1) {
                stackOut_2_0 = (hd) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (String) (Object) stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = (String) (Object) stackIn_2_7;
                stackOut_2_8 = param0.field_n;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                stackIn_3_7 = stackOut_2_7;
                stackIn_3_8 = stackOut_2_8;
                break L1;
              } else {
                stackOut_1_0 = (hd) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = (String) (Object) stackIn_1_4;
                stackOut_1_5 = stackIn_1_5;
                stackOut_1_6 = stackIn_1_6;
                stackOut_1_7 = (String) (Object) stackIn_1_7;
                stackOut_1_8 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                stackIn_3_7 = stackOut_1_7;
                stackIn_3_8 = stackOut_1_8;
                break L1;
              }
            }
            L2: {
              el.a(stackIn_3_0, stackIn_3_1 != 0, (np) (Object) stackIn_3_2, stackIn_3_3, stackIn_3_4, (int[]) (Object) stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
              if (param0.field_c != 0) {
                break L2;
              } else {
                if (wm.c((byte) -121)) {
                  break L2;
                } else {
                  if (null != uv.field_i) {
                    break L2;
                  } else {
                    if (ow.field_b != null) {
                      break L2;
                    } else {
                      L3: {
                        if (kb.field_C) {
                          break L3;
                        } else {
                          var5 = wi.field_v;
                          var6 = sp.field_Cb;
                          var5.field_j.a(0, 14, var6);
                          break L3;
                        }
                      }
                      var7 = wi.field_v;
                      var8 = em.field_c;
                      var7.field_j.a(0, 20, var8);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0.field_c != 1) {
                break L4;
              } else {
                if (wm.c((byte) -121)) {
                  break L4;
                } else {
                  if (uv.field_i == null) {
                    break L4;
                  } else {
                    if (param0.field_n == uv.field_i.h((byte) -105)) {
                      L5: {
                        if (kb.field_C) {
                          break L5;
                        } else {
                          var9 = wi.field_v;
                          var10 = vo.field_db;
                          var9.field_j.a(0, 14, var10);
                          break L5;
                        }
                      }
                      var11 = wi.field_v;
                      var12 = st.field_f;
                      var11.field_j.a(0, 20, var12);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            wi.field_v.d(1);
            wi.field_v.a(false, 0);
            wi.field_v.a(param0.field_c, -118, param0.field_r);
            wi.field_v.b(-120);
            wi.field_v.a(param0, (byte) 11);
            var13 = wi.field_v;
            var3 = sm.field_q;
            var4 = vc.field_y;
            var13.field_j.a(0, 0, var3, var4, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("bf.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -60 + 41);
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        jw stackIn_27_0 = null;
        jw stackIn_28_0 = null;
        jw stackIn_29_0 = null;
        jw stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        jw stackOut_26_0 = null;
        jw stackOut_27_0 = null;
        jw stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        jw stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        var9 = Kickabout.field_G;
        ((bf) this).c(62);
        ((bf) this).a(false, k.field_h);
        ((bf) this).b(param0 ^ -2352, ((bf) this).field_a.field_v);
        ((bf) this).d(126);
        ((bf) this).field_q.a(120, false);
        var2 = -1;
        var3 = -1;
        var4 = 3;
        L0: while (true) {
          if (0 > var4) {
            L1: {
              if (var2 != -1) {
                break L1;
              } else {
                if (((bf) this).field_l == -1) {
                  break L1;
                } else {
                  L2: {
                    if (this.a(false, ((bf) this).field_A)) {
                      break L2;
                    } else {
                      var2 = this.g(((bf) this).field_l, param0 + -1);
                      break L2;
                    }
                  }
                  if (var2 == 0) {
                    var3 = ((bf) this).field_l;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var4 = 3;
            L3: while (true) {
              if (-1 > var4) {
                L4: {
                  if (var2 != -1) {
                    this.a((byte) -108, true, var2, true);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!((bf) this).a((byte) 13)) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        gd.a(-1, ((bf) this).field_A.field_T, ((bf) this).field_A.field_F, (byte) -96, var3);
                        stackOut_26_0 = ((bf) this).field_o;
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (!((bf) this).field_o.field_lb) {
                          break L7;
                        } else {
                          stackOut_27_0 = (jw) (Object) stackIn_27_0;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_28_0 = stackOut_27_0;
                          if (((bf) this).field_o.field_Gb) {
                            break L7;
                          } else {
                            stackOut_28_0 = (jw) (Object) stackIn_28_0;
                            stackOut_28_1 = 1;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_29_0 = (jw) (Object) stackIn_29_0;
                      stackOut_29_1 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L6;
                    }
                    ((jw) (Object) stackIn_30_0).a(stackIn_30_1 != 0, (byte) 46);
                    var4 = 0;
                    L8: while (true) {
                      if (var4 >= 9) {
                        break L5;
                      } else {
                        if (((bf) this).field_l != var4) {
                          ((bf) this).field_j[var4].h((byte) -116);
                          var4++;
                          continue L8;
                        } else {
                          var4++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                var4 = 0;
                L9: while (true) {
                  if (var4 >= 4) {
                    L10: {
                      if (param0 == 1) {
                        break L10;
                      } else {
                        var10 = null;
                        boolean discarded$1 = this.a(true, (hd) null);
                        break L10;
                      }
                    }
                    L11: {
                      if (!((bf) this).field_v) {
                        break L11;
                      } else {
                        var4 = 0;
                        L12: while (true) {
                          if (4 <= var4) {
                            break L11;
                          } else {
                            var5_int = ((bf) this).field_a.field_i[((bf) this).field_h][var4];
                            var6 = (((bf) this).field_t[var4].field_q >> 1) + ((bf) this).field_t[var4].field_F;
                            var7 = -16 + ((bf) this).field_t[var4].field_T - -((bf) this).field_t[var4].field_mb;
                            iw.a(67, ff.field_b);
                            on.b();
                            q.field_d.d(((bf) this).field_a.field_S[var5_int].toLowerCase(), on.field_g >> 1, -1 + on.field_f, 16777062, -1);
                            ta.e(param0 + 116);
                            eo.a(ff.field_b, 65793);
                            ff.field_b.c(-(ff.field_b.field_o >> 1) + var6, var7 + -ff.field_b.field_v);
                            var4++;
                            continue L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if (((bf) this).field_l == -1) {
                        break L13;
                      } else {
                        ((bf) this).field_j[((bf) this).field_l].h((byte) -117);
                        break L13;
                      }
                    }
                    L14: {
                      if (((bf) this).field_v) {
                        ((bf) this).a(((bf) this).field_h, 240, (byte) -60, 412);
                        pt.a(640, -22914, 574, 480, 0);
                        var4 = 263;
                        var11 = 0;
                        var5_int = var11;
                        L15: while (true) {
                          if (var11 >= ((bf) this).field_a.field_I) {
                            L16: {
                              ta.e(param0 ^ 124);
                              if (((bf) this).a((byte) 13)) {
                                var6 = -1;
                                var7 = -1;
                                var8 = 0;
                                L17: while (true) {
                                  if (var8 >= 4) {
                                    if (var7 != -1) {
                                      var5 = vo.a((byte) -18, ss.field_i, new String[2]);
                                      break L16;
                                    } else {
                                      var5 = vo.a((byte) -18, sm.field_p, new String[1]);
                                      break L16;
                                    }
                                  } else {
                                    if (((bf) this).field_g == ((bf) this).field_a.field_i[((bf) this).field_h][var8]) {
                                      if (-1 == var6) {
                                        var6 = var8;
                                        var8++;
                                        continue L17;
                                      } else {
                                        var7 = var8;
                                        var8++;
                                        continue L17;
                                      }
                                    } else {
                                      var8++;
                                      continue L17;
                                    }
                                  }
                                }
                              } else {
                                var5 = ig.field_j;
                                break L16;
                              }
                            }
                            ul.a(130, 1, 105, true, (byte) 26, 225, 18, 380, 1, var5);
                            break L14;
                          } else {
                            if (((bf) this).field_h == ((bf) this).field_a.field_g[var11].field_p) {
                              on.a(412, var4, 186, 21, 7, 65793, 128);
                              if (((bf) this).field_a.field_o.a(param0 + -87, var11)) {
                                vb.field_l.c(574, var4 + -4);
                                var4 += 23;
                                var11++;
                                continue L15;
                              } else {
                                var4 += 23;
                                var11++;
                                continue L15;
                              }
                            } else {
                              var11++;
                              continue L15;
                            }
                          }
                        }
                      } else {
                        ul.a(230, 1, 105, true, (byte) -123, 210, 18, 390, 1, ni.field_q);
                        break L14;
                      }
                    }
                    L18: {
                      if (((bf) this).field_a.field_f) {
                        un.field_d.a("FB", 5, 17, 16777215, -1);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    return;
                  } else {
                    ((bf) this).field_z[var4].h((byte) -124);
                    var4++;
                    continue L9;
                  }
                }
              } else {
                if (var4 != var2) {
                  L19: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = -105;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (((bf) this).field_a.field_i[((bf) this).field_h][var4] != ((bf) this).field_g) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L19;
                    } else {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      break L19;
                    }
                  }
                  this.a((byte) stackIn_21_1, stackIn_21_2 != 0, var4, false);
                  var4--;
                  continue L3;
                } else {
                  var4--;
                  continue L3;
                }
              }
            }
          } else {
            if (((bf) this).field_g == ((bf) this).field_a.field_i[((bf) this).field_h][var4]) {
              if (this.a(false, ((bf) this).field_t[var4])) {
                var2 = var4;
                var4--;
                continue L0;
              } else {
                var4--;
                continue L0;
              }
            } else {
              var4--;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              rd.field_c = param3.getParameter("overxgames");
              if (null == rd.field_c) {
                rd.field_c = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              gm.field_lb = param3.getParameter("overxachievements");
              if (null == gm.field_lb) {
                gm.field_lb = "0";
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 < -46) {
              L3: {
                var6 = param3.getParameter("currency");
                if (var6 == null) {
                  break L3;
                } else {
                  if (gr.a((byte) 15, (CharSequence) (Object) var6)) {
                    int discarded$2 = rr.a(10, (CharSequence) (Object) var6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              sb.field_b = new ut[param1.length];
              var7 = 0;
              L4: while (true) {
                if (param1.length <= var7) {
                  break L0;
                } else {
                  sb.field_b[var7] = new ut(317, 34);
                  var7++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("bf.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final int h(int param0, int param1) {
        int var3 = this.g(param0, 0);
        if (-1 == var3) {
            return ((bf) this).field_A.field_F + 52 * (param0 % 3);
        }
        return ((bf) this).field_t[var3].field_F;
    }

    private final void i(int param0, int param1) {
        ((bf) this).field_a.a(wd.a(18238, ((bf) this).field_k, tu.field_E, param1, ((bf) this).field_g), -121);
        if (param0 != 74) {
            return;
        }
        if (((bf) this).field_f) {
            or.field_d.b(74, (byte) 121);
            or.field_d.g(-1207444472, param1);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 1670) {
            field_m = null;
        }
        if (((bf) this).a((byte) 13)) {
            if (ne.field_G[82]) {
                if (!(param2 != 48)) {
                    this.i(74, -2);
                    return true;
                }
            }
        }
        return super.a(param0, 1670, param2);
    }

    bf(nu param0, int param1, boolean param2, up[] param3) {
        super(param0, param1, param2, (int[]) null);
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        int var9 = 0;
        hd var11 = null;
        hd var12 = null;
        int stackIn_6_0 = 0;
        up stackIn_7_0 = null;
        up stackIn_8_0 = null;
        up stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        up stackOut_6_0 = null;
        up stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        up stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((bf) this).field_l = -1;
        ((bf) this).field_v = false;
        ((bf) this).field_p = -1;
        try {
          L0: {
            ((bf) this).field_k = param3;
            ((bf) this).field_w = param0.field_H[((bf) this).field_h];
            ((bf) this).field_B = param0.field_d[((bf) this).field_h];
            ((bf) this).field_r = param0.field_Q[((bf) this).field_h];
            ((bf) this).field_q = new hd();
            ((bf) this).field_q.a(true, 640, 0, 0, 480);
            var11 = new hd();
            var12 = var11;
            var12.field_N = qj.field_f;
            var12.a(true, var12.field_N.field_o, 220, 100, var12.field_N.field_v);
            ((bf) this).field_q.a((byte) -114, var11);
            var6 = param0.field_r[((bf) this).field_h];
            ((bf) this).field_z = new kq[4];
            ((bf) this).field_t = new hd[4];
            var7 = 3;
            L1: while (true) {
              if (var7 < 0) {
                L2: {
                  if (!((bf) this).a((byte) 13)) {
                    break L2;
                  } else {
                    ((bf) this).field_A = new hd();
                    ((bf) this).field_A.a(true, 156, 45, 112, 225);
                    ((bf) this).field_q.a((byte) -104, ((bf) this).field_A);
                    ((bf) this).field_q.b(0, true);
                    ((bf) this).field_o = new jw(sl.field_Ab, (hu) (Object) un.field_d, var12.field_q);
                    ((bf) this).field_o.field_lb = false;
                    ((bf) this).field_o.field_J = 7 + var12.field_mb + var12.field_T;
                    ((bf) this).field_o.field_s = var12.field_F;
                    ((bf) this).field_q.a((byte) -127, (hd) (Object) ((bf) this).field_o);
                    ((bf) this).field_j = new kq[9];
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= 9) {
                        break L2;
                      } else {
                        ((bf) this).field_j[var7] = new kq();
                        ((bf) this).field_j[var7].a(true, 52, this.h(var7, 3), this.a((byte) 113, var7), 75);
                        ((bf) this).field_j[var7].field_F = ((bf) this).field_j[var7].field_s;
                        ((bf) this).field_j[var7].field_T = ((bf) this).field_j[var7].field_J;
                        ((bf) this).field_q.a((byte) -125, (hd) (Object) ((bf) this).field_j[var7]);
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
                var7 = 0;
                L4: while (true) {
                  if (param0.field_I <= var7) {
                    break L0;
                  } else {
                    L5: {
                      if (((bf) this).field_h != param0.field_g[var7].field_p) {
                        break L5;
                      } else {
                        if (var7 == param1) {
                          break L5;
                        } else {
                          if (!param0.field_R[var7].d(3511)) {
                            break L5;
                          } else {
                            ((bf) this).field_v = true;
                            break L5;
                          }
                        }
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              } else {
                L6: {
                  ((bf) this).field_t[var7] = this.a(var6, var7, (byte) -75);
                  var11.a((byte) -111, ((bf) this).field_t[var7]);
                  ((bf) this).field_z[var7] = new kq();
                  var8 = ((bf) this).field_t[var7];
                  ((bf) this).field_z[var7].a(true, var8.field_q, var8.field_s, var8.field_J, var8.field_mb);
                  var11.a((byte) -104, (hd) (Object) ((bf) this).field_z[var7]);
                  if ((1 << param0.field_i[((bf) this).field_h][var7] & param0.field_c) == 0) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L6;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_6_0;
                  stackOut_6_0 = ((bf) this).field_z[var7].field_Eb;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var9 == 0) {
                    stackOut_8_0 = (up) (Object) stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L7;
                  } else {
                    stackOut_7_0 = (up) (Object) stackIn_7_0;
                    stackOut_7_1 = 2;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L7;
                  }
                }
                stackIn_9_0.field_i = stackIn_9_1;
                var7--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("bf.<init>(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    private final int g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var3 = param1;
        L0: while (true) {
          if (var3 >= 4) {
            return -1;
          } else {
            if (((bf) this).field_a.field_i[((bf) this).field_h][var3] == ((bf) this).field_g) {
              L1: {
                L2: {
                  if (!((bf) this).field_a.field_e) {
                    break L2;
                  } else {
                    if (param0 == ((bf) this).field_a.field_k[((bf) this).field_h][var3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!((bf) this).field_a.field_e) {
                  if (tu.field_E.field_q[param0] == ((bf) this).field_a.field_k[((bf) this).field_h][var3]) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
              return var3;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
            this.a((byte) -5, false, -85, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new gd();
        field_m = new ic();
        field_n = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
