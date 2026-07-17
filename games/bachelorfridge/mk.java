/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mk {
    private kv field_a;
    private kv field_r;
    static sna field_h;
    private int field_x;
    private kv field_g;
    private boolean field_l;
    private int[] field_k;
    private int field_t;
    private sna field_u;
    static qia field_o;
    private mj field_m;
    private int field_e;
    private int[] field_d;
    private int[] field_n;
    private kv field_c;
    static int field_p;
    private int[] field_w;
    private kv field_q;
    private kv field_i;
    static String field_y;
    static String field_f;
    private lna field_s;
    private kv field_b;
    private String field_v;
    private kv field_j;

    private final boolean a(int[] param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0.length == param2.length) {
              var4_int = param1;
              L1: while (true) {
                if (var4_int >= param0.length) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (param0[var4_int] != param2[var4_int]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var4_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("mk.L(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final boolean a(int param0, int[] param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
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
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (param2 < -120) {
              var8 = param1;
              var4 = var8;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var8.length) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var6 = var8[var5];
                  if (param0 == var6) {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var5++;
                    continue L1;
                  }
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
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("mk.K(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          ((mk) this).field_s.c(11);
          ((mk) this).field_u.a(19842, param0);
          if (((mk) this).field_u.field_R != 1) {
            break L0;
          } else {
            if (gi.field_a) {
              if (this.a(true)) {
                L1: {
                  qm.a(14, 7758);
                  if (!this.a(((mk) this).field_k, 0, rn.field_s.field_g.field_m)) {
                    ep.a((byte) 42, rn.field_s, ((mk) this).field_l, ((mk) this).field_e, rn.field_s.field_g.field_m);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((mk) this).field_l) {
                    rn.field_s.field_v.a(false, 0, 0, true, -1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                rn.field_s.field_g.field_i = 0;
                gs.field_f.field_i = false;
                gs.field_f.field_p = false;
                uca.a(18, (byte) -19);
                break L0;
              } else {
                ((mk) this).field_m = new mj(100, 150, 440, 160, wja.field_n);
                return;
              }
            } else {
              break L0;
            }
          }
        }
        if (((mk) this).field_m == null) {
          L3: {
            ((mk) this).field_x = -1;
            var2 = bf.field_g.length;
            if (dm.field_f <= 0) {
              var2 = 6;
              break L3;
            } else {
              break L3;
            }
          }
          var3 = 0;
          L4: while (true) {
            if (var2 <= var3) {
              ((mk) this).field_t = -1;
              var7 = 0;
              var3 = var7;
              L5: while (true) {
                if (var7 >= hha.field_w.length) {
                  return;
                } else {
                  hha.field_w[var7].a(19842, true);
                  if (hha.field_w[var7].field_T) {
                    ((mk) this).field_t = var7;
                    if (hha.field_w[var7].field_R == 1) {
                      qm.a(9, 7758);
                      rn.field_s.field_g.field_m[((mk) this).field_t] = -1;
                      var7++;
                      continue L5;
                    } else {
                      var7++;
                      continue L5;
                    }
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              bf.field_g[var3].a(19842, true);
              if (bf.field_g[var3].field_T) {
                L6: {
                  L7: {
                    if (2 > var3) {
                      break L7;
                    } else {
                      if (rn.field_s.field_g.field_g[-2 + var3]) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ((mk) this).field_x = var3;
                  break L6;
                }
                if (bf.field_g[var3].field_R == 1) {
                  L8: {
                    if (this.a(((mk) this).field_x, rn.field_s.field_g.field_m, -125)) {
                      break L8;
                    } else {
                      L9: {
                        if (((mk) this).field_x < 2) {
                          break L9;
                        } else {
                          if (rn.field_s.field_g.field_g[-2 + ((mk) this).field_x]) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var6 = 0;
                      var4 = var6;
                      L10: while (true) {
                        if (var6 < rn.field_s.field_g.field_m.length) {
                          if (-1 != rn.field_s.field_g.field_m[var6]) {
                            var6++;
                            continue L10;
                          } else {
                            qm.a(8, 7758);
                            uca.a(17, (byte) 105);
                            rn.field_s.field_g.field_m[var6] = ((mk) this).field_x;
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  }
                  if (-1 != ((mk) this).field_x) {
                    if (this.a(((mk) this).field_x, rn.field_s.field_g.field_m, -126)) {
                      L11: {
                        if (((mk) this).field_x < 2) {
                          break L11;
                        } else {
                          if (rn.field_s.field_g.field_g[-2 + ((mk) this).field_x]) {
                            break L11;
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                      qm.a(9, 7758);
                      var4 = this.a(rn.field_s.field_g.field_m, 0, ((mk) this).field_x);
                      if (var4 != -1) {
                        rn.field_s.field_g.field_m[var4] = -1;
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              } else {
                var3++;
                continue L4;
              }
            }
          }
        } else {
          L12: {
            if (((mk) this).field_m.b(0) == 0) {
              ((mk) this).field_m = null;
              break L12;
            } else {
              break L12;
            }
          }
          return;
        }
    }

    private final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        var4 = 1;
        var5 = 0;
        L0: while (true) {
          if (var5 >= rn.field_s.field_g.field_m.length) {
            L1: {
              L2: {
                if (var3 == 0) {
                  break L2;
                } else {
                  if (var2 == 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L2;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L1;
            }
            return stackIn_18_0 != 0;
          } else {
            if (0 != rn.field_s.field_g.field_m[var5]) {
              L3: {
                if (-1 < dm.field_f) {
                  break L3;
                } else {
                  if (rn.field_s.field_g.field_m[var5] > 6) {
                    var4 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var6 = ur.field_e[ko.field_f.field_b[rn.field_s.field_g.field_m[var5]]];
                if (!(var6 instanceof t)) {
                  break L4;
                } else {
                  var3 = 1;
                  break L4;
                }
              }
              if (var6 instanceof tv) {
                var2 = 1;
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
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (var5 >= param3) {
                L2: {
                  if (param2 <= -110) {
                    break L2;
                  } else {
                    field_y = null;
                    break L2;
                  }
                }
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ uca.field_d[(param0[var5] ^ var4_int) & 255];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("mk.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        ho var4 = null;
        int var5 = 0;
        int var6_int = 0;
        oha var6 = null;
        int var7 = 0;
        oha var8_ref_oha = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fea stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        fea stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        fea stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_40_0 = 0;
        fea stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        fea stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        fea stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          wq.field_k.e(0, 0);
          j.a(((mk) this).field_v, 34, 16762880, true, 444, false);
          int discarded$1 = wt.field_k.a(rn.field_s.field_g.field_o.field_a, 350, 40, 240, 100, 16777215, -1, 0, 1, 14);
          jha.field_g.a(hl.field_G[2], 414, 178, 15204352, -1);
          hfa.field_z.a(hl.field_G[2], 414, 178, 65793, -1);
          jha.field_g.a(hl.field_G[3], 412, 206, 818659, -1);
          hfa.field_z.a(hl.field_G[3], 412, 206, 65793, -1);
          jha.field_g.a(hl.field_G[0], 414, 232, 16769792, -1);
          hfa.field_z.a(hl.field_G[0], 414, 232, 65793, -1);
          var3 = 11 / ((65 - param1) / 50);
          jha.field_g.a(hl.field_G[1], 408, 259, 51233, -1);
          hfa.field_z.a(hl.field_G[1], 408, 259, 65793, -1);
          jha.field_g.a(hr.field_a, 180, 428, 16776960, -1);
          hfa.field_z.a(hr.field_a, 180, 428, 65793, -1);
          jha.field_g.a(ida.field_o, 180, 32, 16776960, -1);
          hfa.field_z.a(ida.field_o, 180, 32, 65793, -1);
          if (((mk) this).field_s.field_A) {
            break L0;
          } else {
            ((mk) this).field_s.a(8);
            break L0;
          }
        }
        ((mk) this).field_s.a(false, false, 2048, 2048, 0, -60, 256, 110, 100);
        var4 = (ho) (Object) rn.field_s.field_g.field_h.b((byte) 90);
        L1: while (true) {
          if (var4 == null) {
            L2: {
              this.a((byte) 21, ((mk) this).field_d[2], dt.field_a, 154, 472, 2);
              this.a((byte) 21, ((mk) this).field_d[3], in.field_b, 184, 472, 3);
              this.a((byte) 21, ((mk) this).field_d[0], fk.field_s, 216, 472, 0);
              this.a((byte) 21, ((mk) this).field_d[1], vaa.field_b, 243, 472, 1);
              this.c(false);
              pw.field_y.e(470, 320);
              stackOut_5_0 = jha.field_g;
              stackOut_5_1 = di.field_l;
              stackOut_5_2 = 522;
              stackOut_5_3 = 342;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              if (!((mk) this).field_u.field_T) {
                stackOut_7_0 = (fea) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 16777215;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                break L2;
              } else {
                stackOut_6_0 = (fea) (Object) stackIn_6_0;
                stackOut_6_1 = (String) (Object) stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = 16776960;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                break L2;
              }
            }
            ((fea) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, -1);
            hfa.field_z.a(di.field_l, 522, 342, 65793, -1);
            var5 = 0;
            L3: while (true) {
              if (var5 >= rn.field_s.field_g.field_m.length) {
                L4: {
                  L5: {
                    if (-1 != ((mk) this).field_x) {
                      break L5;
                    } else {
                      if (0 == ((mk) this).field_t) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 == ((mk) this).field_x) {
                      stackOut_39_0 = rn.field_s.field_g.field_m[((mk) this).field_t];
                      stackIn_40_0 = stackOut_39_0;
                      break L6;
                    } else {
                      stackOut_38_0 = ((mk) this).field_x;
                      stackIn_40_0 = stackOut_38_0;
                      break L6;
                    }
                  }
                  var5 = stackIn_40_0;
                  if (-1 != var5) {
                    L7: {
                      var6 = al.a(-111, ko.field_f.field_b[var5]);
                      if (((mk) this).field_x != -1) {
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var7 = 640;
                    var8 = 480;
                    var9 = field_p + 4;
                    var10 = 4 + gd.field_m;
                    if (!param0) {
                      break L4;
                    } else {
                      sd.a(rn.field_s.field_g.a(var6, -5313), var9, var6, (byte) 74, var10, var7, var8);
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
                L8: {
                  if (((mk) this).field_m == null) {
                    break L8;
                  } else {
                    dg.g(0, 0, 640, 480);
                    ((mk) this).field_m.a((byte) 85);
                    break L8;
                  }
                }
                return;
              } else {
                if (rn.field_s.field_g.field_m[var5] != -1) {
                  L9: {
                    var6_int = od.field_A[var5][0];
                    var7 = od.field_A[var5][1];
                    gq.field_E.a(0, var7, var6_int, -1049413117, 4096);
                    var8_ref_oha = ur.field_e[ko.field_f.field_b[rn.field_s.field_g.field_m[var5]]];
                    if (!(var8_ref_oha instanceof tv)) {
                      if (var8_ref_oha instanceof hd) {
                        nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + -1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + -1 + var7, 14971949);
                        break L9;
                      } else {
                        if (var8_ref_oha instanceof a) {
                          if (var8_ref_oha.field_b == 3) {
                            nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (-1 + var6_int), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + -1 + var7, 16769792);
                            break L9;
                          } else {
                            if (var8_ref_oha.field_b != 4) {
                              if (2 == var8_ref_oha.field_b) {
                                nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (var6_int + -1), -1 + (var7 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1)), 15204352);
                                break L9;
                              } else {
                                if (var8_ref_oha.field_b != 1) {
                                  break L9;
                                } else {
                                  nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + var6_int + -1, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + var7 + -1, 818659);
                                  break L9;
                                }
                              }
                            } else {
                              nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + -1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + (var7 + -1), 51233);
                              break L9;
                            }
                          }
                        } else {
                          if (!(var8_ref_oha instanceof t)) {
                            break L9;
                          } else {
                            L10: {
                              if (((t) (Object) var8_ref_oha).field_p == 1) {
                                break L10;
                              } else {
                                if (((t) (Object) var8_ref_oha).field_p != 2) {
                                  if (((t) (Object) var8_ref_oha).field_p == 4) {
                                    nia.field_l[var8_ref_oha.field_b].e(-1 + var6_int - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + (-1 + var7), 16769792);
                                    break L9;
                                  } else {
                                    nia.field_l[var8_ref_oha.field_b].e(-1 + (var6_int + -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1)), var7 - (1 - -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1)), 15204352);
                                    break L9;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (var6_int + -1), var7 + -1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1), 818659);
                            break L9;
                          }
                        }
                      }
                    } else {
                      nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (-1 + var6_int), var7 - 1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1), 51233);
                      break L9;
                    }
                  }
                  wca.a(true, -15 + od.field_A[var5][1], -15 + od.field_A[var5][0], ko.field_f.field_b[rn.field_s.field_g.field_m[var5]], 78);
                  var5++;
                  continue L3;
                } else {
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            var4 = (ho) (Object) rn.field_s.field_g.field_h.c(0);
            continue L1;
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oha var7 = null;
        int var8 = 0;
        oha var9 = null;
        oha var10 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          var2 = 15;
          if (dm.field_f > 0) {
            break L0;
          } else {
            var2 = 6;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (15 <= var3) {
            return;
          } else {
            L2: {
              var4 = ica.field_r[var3][0];
              var5 = ica.field_r[var3][1];
              if (var2 <= var3) {
                break L2;
              } else {
                L3: {
                  if (var3 < 3) {
                    break L3;
                  } else {
                    if (!rn.field_s.field_g.b(8, var3 / 3)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var3 != rn.field_s.field_g.field_i) {
                    break L4;
                  } else {
                    if (rn.field_s.field_g.field_i != 0) {
                      ((mk) this).field_r.d(-13 + var4, var5 + -13, 255);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var3 >= 2) {
                    if (rn.field_s.field_g.field_g[var3 - 2]) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L5;
                    }
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_18_0 = stackOut_13_0;
                    break L5;
                  }
                }
                var6 = stackIn_18_0;
                if (var6 != 0) {
                  L6: {
                    var10 = ur.field_e[bf.field_g[var3].field_vb];
                    var7 = var10;
                    if (!rn.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                      break L6;
                    } else {
                      a.field_o.a(a.field_o.field_n << 3, a.field_o.field_o << 3, (1 + var4) * 16, 16 * var5 + 16, 0, 4096);
                      break L6;
                    }
                  }
                  L7: {
                    gq.field_E.a(0, var5, var4, -1049413117, 4096);
                    if (!(var7 instanceof tv)) {
                      if (!(var7 instanceof hd)) {
                        if (!(var7 instanceof a)) {
                          if (!(var7 instanceof t)) {
                            break L7;
                          } else {
                            L8: {
                              if (((t) (Object) var10).field_p == 1) {
                                break L8;
                              } else {
                                if (-3 == ((t) (Object) var10).field_p) {
                                  break L8;
                                } else {
                                  if (-5 == ((t) (Object) var10).field_p) {
                                    nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 + -1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 - 1, 16769792);
                                    break L7;
                                  } else {
                                    nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 15204352);
                                    break L7;
                                  }
                                }
                              }
                            }
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 + -1, -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 818659);
                            break L7;
                          }
                        } else {
                          if (-4 == var10.field_b) {
                            nia.field_l[var10.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 16769792);
                            break L7;
                          } else {
                            if (-5 == var10.field_b) {
                              nia.field_l[var10.field_b].e(-1 + var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), var5 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 51233);
                              break L7;
                            } else {
                              if (var10.field_b != 2) {
                                if (1 != var10.field_b) {
                                  break L7;
                                } else {
                                  nia.field_l[var10.field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), var5 - (1 - -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 818659);
                                  break L7;
                                }
                              } else {
                                nia.field_l[var10.field_b].e(var4 - 1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + -1 + var5, 15204352);
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + -1 + var5, 14971949);
                        break L7;
                      }
                    } else {
                      nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 - 1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 + -1, 51233);
                      break L7;
                    }
                  }
                  wca.a(true, bf.field_g[var3].field_rb, bf.field_g[var3].field_kb + 1, bf.field_g[var3].field_vb, 106);
                  var3++;
                  continue L1;
                } else {
                  L9: {
                    if (var3 < var2) {
                      break L9;
                    } else {
                      L10: {
                        if (2 > var3) {
                          break L10;
                        } else {
                          if (rn.field_s.field_g.field_g[var3 - 2]) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L11: {
                        var9 = ur.field_e[bf.field_g[var3].field_vb];
                        var7 = var9;
                        if (!rn.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                          break L11;
                        } else {
                          a.field_o.a(a.field_o.field_n << 3, a.field_o.field_o << 3, var4 * 16 + 16, (1 + var5) * 16, 0, 4096);
                          break L11;
                        }
                      }
                      L12: {
                        gq.field_E.a(0, var5, var4, -1049413117, 4096);
                        if (var7 instanceof tv) {
                          nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 51233);
                          break L12;
                        } else {
                          if (!(var7 instanceof hd)) {
                            if (var7 instanceof a) {
                              if (var9.field_b != 3) {
                                if (4 != var9.field_b) {
                                  if (var9.field_b == 2) {
                                    nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + -1 + var4, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 - 1, 15204352);
                                    break L12;
                                  } else {
                                    if (var9.field_b != 1) {
                                      break L12;
                                    } else {
                                      nia.field_l[var9.field_b].e(-1 + (var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 818659);
                                      break L12;
                                    }
                                  }
                                } else {
                                  nia.field_l[var9.field_b].e(-1 + var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -1 + var5 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 51233);
                                  break L12;
                                }
                              } else {
                                nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 + -1), 16769792);
                                break L12;
                              }
                            } else {
                              if (!(var7 instanceof t)) {
                                break L12;
                              } else {
                                L13: {
                                  if (((t) (Object) var9).field_p == 1) {
                                    break L13;
                                  } else {
                                    if (2 != ((t) (Object) var9).field_p) {
                                      if (((t) (Object) var9).field_p == 4) {
                                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), var5 - 1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 16769792);
                                        break L12;
                                      } else {
                                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 + -1), 15204352);
                                        break L12;
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + -1 + var4, var5 + (-1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 818659);
                                break L12;
                              }
                            }
                          } else {
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 + -1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 14971949);
                            break L12;
                          }
                        }
                      }
                      wca.a(true, bf.field_g[var3].field_rb, 1 + bf.field_g[var3].field_kb, bf.field_g[var3].field_vb, 106);
                      nma.field_v.a(nma.field_v.field_n << 3, nma.field_v.field_o << 3, 16 * var4, var5 * 16, 0, 4096);
                      var3++;
                      continue L1;
                    }
                  }
                  hp.field_b[ur.field_e[bf.field_g[var3].field_vb].field_b].a(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_n << 3, nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_o << 3, 16 * var4, 16 * var5, 0, 4096);
                  var3++;
                  continue L1;
                }
              }
            }
            nma.field_v.a(nma.field_v.field_n << 3, nma.field_v.field_o << 3, 16 * var4, var5 * 16, 0, 4096);
            var3++;
            continue L1;
          }
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            me.field_t = new js(16);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= gb.field_f.length) {
                break L0;
              } else {
                me.field_t.a((long)gb.field_f[var1_int].toLowerCase().hashCode(), (byte) 78, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "mk.J(" + -43 + 41);
        }
    }

    private final void a(byte param0, int param1, kv param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param5 != 0) {
                break L1;
              } else {
                if (rn.field_s.field_g.a(84, 0, rn.field_s.field_g.field_m)) {
                  param1++;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (1 != param5) {
                break L2;
              } else {
                if (!rn.field_s.field_g.a(85, 0, rn.field_s.field_g.field_m)) {
                  break L2;
                } else {
                  param1++;
                  break L2;
                }
              }
            }
            L3: {
              if (param5 != 2) {
                break L3;
              } else {
                if (rn.field_s.field_g.a(86, 0, rn.field_s.field_g.field_m)) {
                  param1++;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param5 != 3) {
                break L4;
              } else {
                if (!rn.field_s.field_g.a(87, 0, rn.field_s.field_g.field_m)) {
                  break L4;
                } else {
                  param1++;
                  break L4;
                }
              }
            }
            L5: {
              var7_int = 0;
              if (param0 == 21) {
                break L5;
              } else {
                boolean discarded$1 = this.a(true);
                break L5;
              }
            }
            var8 = 0;
            L6: while (true) {
              if (param1 <= var8) {
                dg.a(param4, param3, param4 + var7_int, 28 + param3);
                param2.e(param4, param3);
                dg.c();
                break L0;
              } else {
                var7_int = var7_int + ad.field_m[var8];
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("mk.G(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 >= -71) {
            field_p = 32;
        }
        if (!(param0 != -1)) {
            return;
        }
        be var2 = jga.field_y[param0];
        if (!(var2 == null)) {
            cq discarded$0 = ol.a(var2, true);
        }
    }

    private final int a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param1;
            L1: while (true) {
              if (var4_int >= param0.length) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (param0[var4_int] != param2) {
                  var4_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = var4_int;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("mk.H(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_o = null;
        field_f = null;
        field_y = null;
    }

    mk(jfa param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        kv var8 = null;
        kv var9 = null;
        kv var10 = null;
        kv var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((mk) this).field_l = stackIn_6_1 != 0;
              ((mk) this).field_e = param2;
              rn.field_s = param0;
              ko.field_f = rn.field_s.field_g.field_o.field_g;
              ((mk) this).field_v = rn.field_s.field_g.field_n;
              ((mk) this).field_k = new int[rn.field_s.field_g.field_m.length];
              bl.a(rn.field_s.field_g.field_m, 0, ((mk) this).field_k, 0, ((mk) this).field_k.length);
              ((mk) this).field_d = rn.field_s.field_g.field_k;
              ((mk) this).field_s = rn.field_s.field_g.e((byte) -121);
              rn.field_v = mka.a(13558251, 13558251, 13558251, (byte) -123, (po) (Object) jha.field_g, 13558251, 16777215, 13558251);
              rn.field_v.field_eb = wd.field_w;
              rn.field_v.field_A = bla.field_p;
              rn.field_v.field_db = op.field_I;
              rn.field_v.field_N = 1;
              ((mk) this).field_u = new sna("confirm", rn.field_v, 470, 320, jha.field_g.a(di.field_l) - -40, 40, di.field_l);
              hha.field_w = new hw[5];
              bf.field_g = new hw[15];
              uma.n(1);
              var8 = new kv(350, 80);
              var8.b();
              dg.c(0, 0, 330, 30, 5667119);
              hp.a(330, 0, (byte) -65, 30, de.field_A, 0);
              ((mk) this).field_i = new kv(340, 60);
              ((mk) this).field_i.b();
              var8.d(180, 60, 100, 4096);
              var9 = new kv(112, 30);
              var9.b();
              dg.d();
              dg.c(0, 0, 112, 30, 6127926);
              hp.a(112, 0, (byte) -42, 30, de.field_A, 0);
              ((mk) this).field_j = new kv(120, 60);
              ((mk) this).field_j.b();
              var9.d(60, 30, 0, 4096);
              ((mk) this).field_b = new kv(120, 60);
              ((mk) this).field_b.b();
              var9.d(60, 30, -100, 4096);
              var10 = new kv(120, 30);
              var10.b();
              dg.d();
              dg.c(0, 0, 100, 30, 6127926);
              hp.a(100, 0, (byte) 106, 30, de.field_A, 0);
              ((mk) this).field_c = new kv(120, 60);
              ((mk) this).field_c.b();
              var10.d(60, 30, 200, 4096);
              ((mk) this).field_a = new kv(120, 60);
              ((mk) this).field_a.b();
              var10.d(60, 30, -200, 4096);
              var11 = new kv(180, 30);
              var11.b();
              dg.c(0, 0, 180, 30, 6127926);
              hp.a(180, 0, (byte) -23, 30, de.field_A, 0);
              ((mk) this).field_g = new kv(200, 60);
              ((mk) this).field_g.b();
              var11.d(100, 30, 200, 4096);
              hga.field_U.a((byte) 21);
              ((mk) this).field_n = new int[256];
              var5 = 0;
              L2: while (true) {
                if (var5 >= 256) {
                  ((mk) this).field_w = new int[256];
                  var7 = 0;
                  var5 = var7;
                  L3: while (true) {
                    if (var7 >= 256) {
                      ((mk) this).field_q = new kv(25, 25);
                      ((mk) this).field_q.b();
                      dg.a(208, 208, 192, 255, ((mk) this).field_n);
                      ((mk) this).field_r = new kv(25, 25);
                      ((mk) this).field_r.b();
                      dg.a(208, 208, 192, 255, ((mk) this).field_w);
                      hga.field_U.a((byte) 125);
                      ((mk) this).field_s.a((byte) 65, rn.field_s.field_g.field_o.field_b, 0);
                      rn.field_s.field_g.field_f = -1;
                      qm.a(13, 7758);
                      ct.c(0, -121);
                      int[] discarded$1 = a.a(15843842, 32, 16763049, 16435458);
                      uca.a(16, (byte) -61);
                      break L0;
                    } else {
                      ((mk) this).field_w[var7] = 257 * var7;
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  ((mk) this).field_n[var5] = var5 * 65793;
                  var5++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("mk.<init>(");
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new qia();
        field_y = "(<%0> players want to join)";
        field_f = "Invalid name";
        field_p = 0;
    }
}
