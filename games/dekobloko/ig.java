/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends w {
    private int field_fc;
    private int field_Vb;
    static ud field_ac;
    private int field_bc;
    private int field_ec;
    private int[] field_Nb;
    private qd[] field_gc;
    private int field_Ob;
    private int field_Qb;
    private char[] field_Wb;
    static String field_Sb;
    static String field_Xb;
    private int field_Zb;
    private ig[] field_Pb;
    static int field_Yb;
    private int field_Rb;
    static int field_dc;
    static nh[] field_cc;
    private ig field_Ub;
    static String field_Tb;

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = client.field_A ? 1 : 0;
            var5 = 2 % ((param2 - 61) / 40);
            if (param1 != this.field_Rb) {
              break L1;
            } else {
              this.e(0);
              this.b((byte) 67, 0);
              if (var8 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_Pb[param1] != null) {
              break L2;
            } else {
              L3: {
                if (this.field_Nb[param1] != -1) {
                  break L3;
                } else {
                  cc.a(8);
                  pf.a(false);
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var6 = this.field_Nb[param1] | 32768;
                var7 = pk.field_r;
                if (var7 != 0) {
                  break L4;
                } else {
                  if (null != cd.field_m) {
                    var7 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-3 == (rf.a(0, var7) ^ -1)) {
                  eg.a(var7, param0, 1, (byte) 123);
                  break L5;
                } else {
                  break L5;
                }
              }
              ce.a(param3, (byte) -85, pk.field_r, ed.field_c, var6, (String) null);
              rb.a(fm.field_d, ed.field_c, -94, pk.field_r, var6);
              pf.a(false);
              h.a((byte) 11);
              if (var8 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          this.e(0);
          this.b((byte) 67, 0);
          this.field_Rb = param1;
          this.field_Ub = this.field_Pb[this.field_Rb];
          vm.a(107, this.field_Ub);
          this.field_Ub.b((byte) 67, 12);
          break L0;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (wh.field_c != 85) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (null != this.field_Ub) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (this.field_Ub.field_Rb != -1) {
                break L1;
              } else {
                this.e(param1 + -15028);
                this.b((byte) 67, 0);
                return true;
              }
            }
          }
          return this.field_Ub.b(param0, param1 ^ 0, param2);
        } else {
          L2: {
            if (this.field_Ub != null) {
              break L2;
            } else {
              if (this != mg.field_bc) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  pf.a(false);
                  return true;
                }
              }
            }
          }
          if (param1 == 15028) {
            L3: {
              L4: {
                var5 = el.field_G;
                if (var5 <= 0) {
                  break L4;
                } else {
                  L5: {
                    if ((aa.field_b ^ -1) == (var5 ^ -1)) {
                      var5 = 63;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var6 = 0;
                  L6: while (true) {
                    if ((this.field_Wb.length ^ -1) >= (var6 ^ -1)) {
                      break L4;
                    } else {
                      stackOut_20_0 = this.field_Wb[var6] ^ -1;
                      stackIn_26_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_21_0 == (var5 ^ -1)) {
                          this.a(param0, var6, 107, param2);
                          return true;
                        } else {
                          var6++;
                          if (var7 == 0) {
                            continue L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L3;
            }
            return stackIn_26_0 != 0;
          } else {
            return true;
          }
        }
    }

    final int g(int param0) {
        if (param0 > -87) {
            field_cc = (nh[]) null;
        }
        return this.field_bc - -(null != this.field_Ub ? this.field_Ub.g(-119) : 0);
    }

    private final void b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          this.field_ec = param1;
          if (param0 == 67) {
            break L0;
          } else {
            this.field_Wb = (char[]) null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (this.field_Ob <= var5) {
              break L2;
            } else {
              var4 = this.field_ec * this.field_ec;
              var3 = var5 * this.field_Vb;
              this.field_gc[var5].field_Ib = (var3 * (-var4 + 144) + (this.field_Zb - this.field_pb) * var4) / 144;
              var5++;
              if (var6 != 0) {
                break L2;
              } else {
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        ig var4 = null;
        qd var5 = null;
        int var6 = 0;
        ig var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        qd stackIn_7_0 = null;
        qd stackIn_8_0 = null;
        qd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        qd stackOut_6_0 = null;
        qd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          if (param2 <= -97) {
            break L0;
          } else {
            field_Tb = (String) null;
            break L0;
          }
        }
        var4_int = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var4_int >= this.field_gc.length) {
                break L3;
              } else {
                var5 = this.field_gc[var4_int];
                stackOut_4_0 = var5.field_ob ^ -1;
                stackOut_4_1 = -2;
                stackIn_12_0 = stackOut_4_0;
                stackIn_12_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var6 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0 != stackIn_5_1) {
                      break L4;
                    } else {
                      L5: {
                        this.a(param1, var4_int, -90, param0);
                        stackOut_6_0 = (qd) (var5);
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if ((var4_int ^ -1) != (this.field_Rb ^ -1)) {
                          stackOut_8_0 = (qd) ((Object) stackIn_8_0);
                          stackOut_8_1 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          break L5;
                        } else {
                          stackOut_7_0 = (qd) ((Object) stackIn_7_0);
                          stackOut_7_1 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          break L5;
                        }
                      }
                      stackIn_9_0.field_ab = stackIn_9_1 != 0;
                      break L4;
                    }
                  }
                  var4_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_11_0 = this.field_Rb;
            stackOut_11_1 = -1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L2;
          }
          L6: {
            if (stackIn_12_0 == stackIn_12_1) {
              break L6;
            } else {
              var7 = this.field_Pb[this.field_Rb];
              var4 = var7;
              if (var4 == null) {
                break L6;
              } else {
                var7.a(param0, param1, -99);
                break L6;
              }
            }
          }
          L7: {
            if (-1 <= (this.field_ec ^ -1)) {
              break L7;
            } else {
              this.b((byte) 67, this.field_ec - 1);
              break L7;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          this.field_bc = this.field_fc + param0 * 2;
          this.a(this.field_bc, 0, -this.field_Qb + param2, this.field_Qb, param1);
          if (param4 == -18) {
            break L0;
          } else {
            this.field_Qb = 30;
            break L0;
          }
        }
        L1: {
          if ((param5 ^ -1) != (this.field_Zb ^ -1)) {
            this.field_Zb = param5;
            this.b((byte) 67, this.field_ec);
            break L1;
          } else {
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (this.field_Ob <= var7) {
                break L4;
              } else {
                this.field_gc[var7].a(this.field_Vb, param0, 0, this.field_gc[var7].field_Ib, this.field_bc, param3, 500);
                var7++;
                if (var9 != 0) {
                  break L3;
                } else {
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (0 == (this.field_Rb ^ -1)) {
              break L3;
            } else {
              if (null != this.field_Pb[this.field_Rb]) {
                var7 = this.field_Pb[this.field_Rb].field_Ob;
                var8 = (var7 + this.field_Rb) * this.field_Vb + this.field_Ib;
                L5: while (true) {
                  L6: {
                    if (param2 >= var8) {
                      break L6;
                    } else {
                      var8 = var8 - this.field_Vb;
                      if (var9 != 0) {
                        break L3;
                      } else {
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_Pb[this.field_Rb].a(param0, this.field_bc + param1, var8, param3, (byte) -18, this.field_gc[this.field_Rb].field_pb);
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          return;
        }
    }

    final boolean f(int param0) {
        int var2 = 0;
        qd[] var3 = null;
        int var4 = 0;
        qd var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = client.field_A ? 1 : 0;
        if (param0 == -1) {
          var2 = 0;
          var3 = this.field_gc;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_4_0 = var2;
                    stackOut_4_1 = 0;
                    stackIn_11_0 = stackOut_4_0;
                    stackIn_11_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_5_0 = stackIn_5_0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (stackIn_5_1 == var5.field_ob) {
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L4;
                        } else {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L4;
                        }
                      }
                      var2 = stackIn_8_0 | stackIn_8_1;
                      var4++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  break L1;
                } else {
                  stackOut_10_0 = -1;
                  stackOut_10_1 = this.field_Rb;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                }
              }
              if (stackIn_11_0 == stackIn_11_1) {
                break L1;
              } else {
                if (this.field_Pb[this.field_Rb] != null) {
                  L5: {
                    if (!this.field_Pb[this.field_Rb].f(-1)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  var2 = stackIn_17_0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            return var2 != 0;
          }
        } else {
          return false;
        }
    }

    final void e(int param0) {
        qd[] var2 = null;
        int var3 = 0;
        qd var4 = null;
        int var5 = 0;
        qd[] var6 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = this.field_gc;
        var2 = var6;
        var3 = param0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if ((var3 ^ -1) <= (var6.length ^ -1)) {
                  break L3;
                } else {
                  var4 = var6[var3];
                  var4.field_ab = false;
                  var4.field_ob = 0;
                  var3++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (null != this.field_Ub) {
                this.field_Ub.e(0);
                break L2;
              } else {
                break L1;
              }
            }
            this.field_Ub.b((byte) 104);
            break L1;
          }
          this.field_Rb = -1;
          this.field_Ub = null;
          this.b((byte) 67, 12);
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (param3 != 69) {
            return true;
        }
        if (w.field_H != null) {
            if (!(!w.field_H.c(param3 + -72))) {
                tf.i((byte) -125);
                return true;
            }
        }
        if (pd.field_f != null) {
            if (!(!pd.field_f.b(false))) {
                pd.field_f = null;
                tf.i((byte) -97);
                return true;
            }
        }
        if (!(!ve.g((byte) 119))) {
            return true;
        }
        if (!rm.a(param1, param0, (byte) 10, param2)) {
            return false;
        }
        return true;
    }

    public static void g(byte param0) {
        field_Xb = null;
        if (param0 < 18) {
            return;
        }
        field_cc = null;
        field_ac = null;
        field_Sb = null;
        field_Tb = null;
    }

    ig(long param0, w param1, w param2, w param3, ig[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        mm var17 = null;
        mm var18 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var16 = client.field_A ? 1 : 0;
        this.field_Rb = -1;
        try {
          L0: {
            this.field_Wb = param7;
            this.field_Nb = param5;
            this.field_Pb = param4;
            this.field_Ob = this.field_Nb.length;
            var17 = param3.field_J;
            var18 = var17;
            this.field_Vb = var18.field_K + 2 + var18.field_R;
            this.field_fc = 0;
            this.field_gc = new qd[this.field_Ob];
            this.field_Qb = this.field_Vb * this.field_Ob;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_Ob <= var13) {
                    break L3;
                  } else {
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (0 >= this.field_Wb[var13]) {
                          break L4;
                        } else {
                          param6[var13] = var11 + pf.a(this.field_Wb[var13], (byte) -9).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (this.field_Pb[var13] != null) {
                            break L6;
                          } else {
                            if (this.field_Nb[var13] != -1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = qb.field_q;
                        break L5;
                      }
                      L7: {
                        this.field_gc[var13] = new qd(0L, param2, (w) null, param3, (ck) (var14), param6[var13]);
                        this.a(this.field_gc[var13], -16834);
                        var15 = var17.a(param6[var13]);
                        if ((var15 ^ -1) >= (this.field_fc ^ -1)) {
                          break L7;
                        } else {
                          this.field_fc = var15;
                          break L7;
                        }
                      }
                      var13++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_fc = this.field_fc + (qb.field_q.field_K - -10);
                this.b((byte) 67, 12);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var10);
            stackOut_14_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L8;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L8;
            }
          }
          L9: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L9;
            }
          }
          L10: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          L11: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          L12: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          L13: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param6 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L13;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L13;
            }
          }
          L14: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param7 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            field_ac = (ud) null;
        }
        return uc.field_g == cd.field_m.field_Xb ? true : false;
    }

    static {
        field_Sb = "This game option has not yet been unlocked for use.";
        field_Yb = 0;
        field_Xb = "Set up new game";
        field_Tb = "Quit to website";
    }
}
