/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    private int field_d;
    private int[] field_p;
    static String field_x;
    private int field_l;
    private int field_s;
    private int field_c;
    private ea field_r;
    static String field_e;
    private MinerDisturbance field_q;
    private int field_b;
    static bd field_t;
    private int field_f;
    private int[] field_g;
    static String field_z;
    static ea field_u;
    private boolean[] field_i;
    private int[] field_j;
    private int field_y;
    private ea field_h;
    boolean field_o;
    private int field_n;
    private int field_k;
    private int field_a;
    static ta field_m;
    private int field_v;
    static int field_w;

    private final void a(int param0, byte param1, int param2) {
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        boolean[] stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        boolean[] stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int var4;
        int var5;
        boolean[] var5_ref_boolean__;
        boolean[] var6;
        boolean[] var7;
        boolean[] var8;
        boolean[] var9;
        int var10;
        var10 = MinerDisturbance.field_ab;
        var4 = 0;
        if (2 == (param2 ^ -1)) {
          L0: {
            this.field_q.a(3, 0);
            this.field_o = true;
            if (0 == param0) {
              stackIn_83_0 = 0;
              break L0;
            } else {
              stackIn_83_0 = 1;
              break L0;
            }
          }
          jc.a(stackIn_83_0 != 0, param1 + -140, 4);
          return;
        } else {
          if (4 == (param2 ^ -1)) {
            L1: {
              if (this.field_f != 0) {
                break L1;
              } else {
                if (this.a(-7)) {
                  break L1;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= 21) {
                      this.field_o = true;
                      ke.field_V = true;
                      this.field_q.h((byte) 78);
                      wm.a(false);
                      return;
                    } else {
                      bn.field_b[var5] = qe.field_b[var5];
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_y = 100;
            return;
          } else {
            L3: {
              if ((param2 ^ -1) != 1) {
                if (-4 != param2) {
                  param2 = nb.field_g[ah.field_f][param2];
                  break L3;
                } else {
                  L4: {
                    if (sc.field_b) {
                      stackIn_70_0 = 0;
                      break L4;
                    } else {
                      stackIn_70_0 = 1;
                      break L4;
                    }
                  }
                  sc.field_b = stackIn_70_0 != 0;
                  d.field_c = true;
                  break L3;
                }
              } else {
                L5: {
                  this.field_j[21] = 2;
                  if (ah.field_f != 0) {
                    if (!qe.field_b[2]) {
                      break L5;
                    } else {
                      if (!qe.field_b[0]) {
                        break L5;
                      } else {
                        if (!qe.field_b[16]) {
                          break L5;
                        } else {
                          if (!qe.field_b[7]) {
                            break L5;
                          } else {
                            if (!qe.field_b[6]) {
                              break L5;
                            } else {
                              if (!qe.field_b[3]) {
                                break L5;
                              } else {
                                var5_ref_boolean__ = qe.field_b;
                                var6 = qe.field_b;
                                var7 = qe.field_b;
                                var8 = qe.field_b;
                                qe.field_b[3] = false;
                                var9 = qe.field_b;
                                this.field_j[0] = 2;
                                this.field_f = 6;
                                this.field_j[6] = 2;
                                var5_ref_boolean__[2] = false;
                                var8[7] = false;
                                this.field_j[16] = 2;
                                var4 = 1;
                                this.field_j[2] = 2;
                                var6[0] = false;
                                var9[6] = false;
                                this.field_j[7] = 2;
                                this.field_j[3] = 2;
                                var7[16] = false;
                                ne.a(2, param1 + 76);
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (this.field_f != 0) {
                      break L5;
                    } else {
                      if (!qe.field_b[2]) {
                        break L5;
                      } else {
                        if (!qe.field_b[0]) {
                          break L5;
                        } else {
                          if (!qe.field_b[3]) {
                            break L5;
                          } else {
                            if (!qe.field_b[7]) {
                              break L5;
                            } else {
                              if (qe.field_b[6]) {
                                var5_ref_boolean__ = qe.field_b;
                                var6 = qe.field_b;
                                var7 = qe.field_b;
                                qe.field_b[6] = false;
                                var8 = qe.field_b;
                                this.field_j[2] = 2;
                                this.field_f = 5;
                                var8[7] = false;
                                this.field_j[3] = 2;
                                var6[0] = false;
                                this.field_j[6] = 2;
                                this.field_j[7] = 2;
                                var5_ref_boolean__[2] = false;
                                this.field_j[0] = 2;
                                var4 = 1;
                                var7[3] = false;
                                ne.a(2, 39);
                                return;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (!qe.field_b[3]) {
                    this.field_j[3] = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!qe.field_b[2]) {
                    this.field_j[2] = 2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!qe.field_b[6]) {
                    this.field_j[6] = 2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (!qe.field_b[7]) {
                    this.field_j[7] = 2;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (qe.field_b[0]) {
                    break L10;
                  } else {
                    this.field_j[0] = 2;
                    break L10;
                  }
                }
                var5 = 0;
                L11: while (true) {
                  if ((var5 ^ -1) <= -22) {
                    L12: {
                      kj.a(1, param1 + -22174);
                      qe.field_b[7] = true;
                      qe.field_b[2] = true;
                      qe.field_b[3] = true;
                      qe.field_b[0] = true;
                      stackIn_54_0 = this;

                      if (-2 == (ah.field_f ^ -1)) {
                        stackIn_55_0 = this;
                        stackIn_55_1 = 6;
                        break L12;
                      } else {
                        stackIn_55_0 = this;
                        stackIn_55_1 = 5;
                        break L12;
                      }
                    }
                    L13: {
                      ((mc) (this)).field_f = stackIn_55_1;
                      if ((ah.field_f ^ -1) == -2) {
                        L14: {
                          if (!qe.field_b[16]) {
                            this.field_j[16] = 2;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        qe.field_b[16] = true;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    qe.field_b[6] = true;
                    var5 = 0;
                    L15: while (true) {
                      if (21 <= var5) {
                        break L3;
                      } else {
                        if (qe.field_b[var5]) {
                          this.field_f = this.field_f - this.field_g[var5];
                          var5++;
                          continue L15;
                        } else {
                          var5++;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    if ((var5 ^ -1) != -1) {
                      if (2 != var5) {
                        if (-7 != (var5 ^ -1)) {
                          if (var5 != 7) {
                            if (3 != var5) {
                              L16: {
                                if ((ah.field_f ^ -1) != -2) {
                                  break L16;
                                } else {
                                  if ((var5 ^ -1) != -17) {
                                    break L16;
                                  } else {
                                    var5++;
                                    continue L11;
                                  }
                                }
                              }
                              if (qe.field_b[var5]) {
                                this.field_j[var5] = 2;
                                qe.field_b[var5] = false;
                                this.field_f = this.field_f + this.field_g[var5];
                                var5++;
                                continue L11;
                              } else {
                                var5++;
                                continue L11;
                              }
                            } else {
                              var5++;
                              continue L11;
                            }
                          } else {
                            var5++;
                            continue L11;
                          }
                        } else {
                          var5++;
                          continue L11;
                        }
                      } else {
                        var5++;
                        continue L11;
                      }
                    } else {
                      var5++;
                      continue L11;
                    }
                  }
                }
              }
            }
            L17: {
              if (param1 == 18) {
                break L17;
              } else {
                this.a(-119, -15, -28, 91);
                break L17;
              }
            }
            L18: {
              if (0 > param2) {
                break L18;
              } else {
                if (21 > param2) {
                  L19: {
                    if (this.field_g[param2] > this.field_f) {
                      stackIn_92_0 = 0;
                      break L19;
                    } else {
                      stackIn_92_0 = 1;
                      break L19;
                    }
                  }
                  L20: {
                    L21: {
                      var5 = stackIn_92_0;
                      if ((param2 ^ -1) != -3) {
                        break L21;
                      } else {
                        if (!qe.field_b[19]) {
                          break L21;
                        } else {
                          this.field_j[19] = 2;
                          var5 = 1;
                          qe.field_b[19] = false;
                          this.field_f = this.field_f + this.field_g[19];
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (19 != param2) {
                        break L22;
                      } else {
                        if (!qe.field_b[2]) {
                          break L22;
                        } else {
                          if (this.field_f + this.field_g[2] < this.field_g[19]) {
                            break L22;
                          } else {
                            var5 = 1;
                            this.field_j[2] = 2;
                            qe.field_b[2] = false;
                            this.field_f = this.field_f + this.field_g[2];
                            break L20;
                          }
                        }
                      }
                    }
                    L23: {
                      if (0 != param2) {
                        break L23;
                      } else {
                        if (!qe.field_b[1]) {
                          break L23;
                        } else {
                          this.field_j[1] = 2;
                          var5 = 1;
                          qe.field_b[1] = false;
                          this.field_f = this.field_f + this.field_g[1];
                          break L20;
                        }
                      }
                    }
                    L24: {
                      if (-2 != (param2 ^ -1)) {
                        break L24;
                      } else {
                        if (!qe.field_b[0]) {
                          break L24;
                        } else {
                          if (this.field_g[1] <= this.field_g[0] + this.field_f) {
                            qe.field_b[0] = false;
                            var5 = 1;
                            this.field_j[0] = 2;
                            this.field_f = this.field_f + this.field_g[0];
                            break L20;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    if (-13 == (param2 ^ -1)) {
                      if (!qe.field_b[12]) {
                        if (var5 != 0) {
                          kj.a(ne.a(false) * 2, -22156);
                          break L20;
                        } else {
                          break L20;
                        }
                      } else {
                        kj.a(ne.a(false) / 2, -22156);
                        break L20;
                      }
                    } else {
                      if (-14 != (param2 ^ -1)) {
                        break L20;
                      } else {
                        if (!qe.field_b[13]) {
                          if (var5 != 0) {
                            kj.a(3 * ne.a(false), -22156);
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          kj.a(ne.a(false) / 3, -22156);
                          break L20;
                        }
                      }
                    }
                  }
                  L25: {
                    L26: {
                      if (var5 != 0) {
                        break L26;
                      } else {
                        if (!qe.field_b[param2]) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      stackIn_124_0 = this;

                      stackIn_124_1 = this.field_f;

                      if (qe.field_b[param2]) {
                        stackIn_125_0 = this;
                        stackIn_125_1 = stackIn_124_1;
                        stackIn_125_2 = this.field_g[param2];
                        break L27;
                      } else {
                        stackIn_125_0 = this;
                        stackIn_125_1 = stackIn_124_1;
                        stackIn_125_2 = -this.field_g[param2];
                        break L27;
                      }
                    }
                    L28: {
                      ((mc) (this)).field_f = stackIn_125_1 + stackIn_125_2;
                      var4 = 1;
                      stackIn_127_0 = qe.field_b;

                      stackIn_127_1 = param2;

                      if (qe.field_b[param2]) {
                        stackIn_128_0 = (boolean[]) ((Object) stackIn_127_0);
                        stackIn_128_1 = stackIn_127_1;
                        stackIn_128_2 = 0;
                        break L28;
                      } else {
                        stackIn_128_0 = (boolean[]) ((Object) stackIn_127_0);
                        stackIn_128_1 = stackIn_127_1;
                        stackIn_128_2 = 1;
                        break L28;
                      }
                    }
                    stackIn_128_0[stackIn_128_1] = stackIn_128_2 != 0;
                    break L25;
                  }
                  if (var4 != 0) {
                    this.field_j[param2] = 2;
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
            }
            ne.a(2, 63);
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1, String param2, int param3, boolean param4, boolean param5, boolean param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vm var13 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var13 = mm.field_a;
              var10 = this.field_v - -param7;
              if (!param5) {
                var13.a(param2, var10 - 2, param3 - -var13.field_I, 2829610, -1);
                var13.a(param2, var10 + 2, param3 + var13.field_I, 2829610, -1);
                var13.a(param2, var10, param3 - -var13.field_I + -2, 2829610, -1);
                var13.a(param2, var10, var13.field_I + (param3 - -2), 2829610, -1);
                var13.a(param2, var10 - 1, var13.field_I + param3 - 1, 2829610, -1);
                var13.a(param2, 1 + var10, var13.field_I + param3 - 1, 2829610, -1);
                var13.a(param2, -1 + var10, var13.field_I + param3 + 1, 2829610, -1);
                var13.a(param2, 1 + var10, param3 - (-var13.field_I + -1), 2829610, -1);
                break L1;
              } else {
                var11 = 3355443;
                var13.a(param2, var10 - 2, var13.field_I + param3, var11, -1);
                var13.a(param2, var10 + 2, param3 + var13.field_I, var11, -1);
                var13.a(param2, var10, -2 + (var13.field_I + param3), var11, -1);
                var13.a(param2, var10, 2 + var13.field_I + param3, var11, -1);
                var13.a(param2, var10 + -1, var13.field_I + (param3 - 1), var11, -1);
                var13.a(param2, var10 - -1, param3 + (var13.field_I + -1), var11, -1);
                var13.a(param2, var10 - 1, 1 + (param3 - -var13.field_I), var11, -1);
                var13.a(param2, 1 + var10, param3 - (-var13.field_I - 1), var11, -1);
                break L1;
              }
            }
            L2: {
              if (param1 < -97) {
                break L2;
              } else {
                this.field_p = (int[]) null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param4) {
                  break L4;
                } else {
                  if (!param0) {
                    if (!param5) {
                      var13.a(param2, var10, var13.field_I + param3, 16437248, -1);
                      break L3;
                    } else {
                      var13.a(param2, var10, var13.field_I + param3, 6776679, -1);
                      break L3;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              if (!param5) {
                var13.a(param2, var10, var13.field_I + param3, 15884837, -1);
                break L3;
              } else {
                if (param6) {
                  var13.a(param2, var10, var13.field_I + param3, 13963537, -1);
                  break L3;
                } else {
                  var13.a(param2, var10, param3 + var13.field_I, 14013909, -1);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var9);

            stackIn_20_1 = new StringBuilder().append("mc.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void c(int param0) {
        int var1;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (param0 <= -68) {
          L0: {
            wc.field_b = false;
            ic.field_i = null;
            if (gd.field_B) {
              sj.field_h.i((byte) -97);
              break L0;
            } else {
              var1 = a.field_d;
              if (-1 <= (var1 ^ -1)) {
                sj.field_h.s(2121792);
                pb.a(53);
                break L0;
              } else {
                if (1 != var1) {
                  ic.field_i = oa.a((byte) -99, pb.field_A, new String[]{Integer.toString(var1)});
                  ic.field_i = in.a(new CharSequence[]{(CharSequence) ((Object) ic.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) eb.field_a)}, -1);
                  sj.field_h.s(2121792);
                  pb.a(53);
                  break L0;
                } else {
                  ic.field_i = qg.field_g;
                  ic.field_i = in.a(new CharSequence[]{(CharSequence) ((Object) ic.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) eb.field_a)}, -1);
                  sj.field_h.s(2121792);
                  pb.a(53);
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          if (param0 == -7) {
            break L0;
          } else {
            field_t = (bd) null;
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if ((var3 ^ -1) <= -22) {
            L2: {
              L3: {
                if (!qe.field_b[12]) {
                  break L3;
                } else {
                  if (qe.field_b[13]) {
                    if (-7 != (ne.a(false) ^ -1)) {
                      kj.a(6, -22156);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (!qe.field_b[12]) {
                if (qe.field_b[13]) {
                  if ((ne.a(false) ^ -1) == -4) {
                    break L2;
                  } else {
                    kj.a(3, -22156);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                if (2 != ne.a(false)) {
                  kj.a(2, param0 ^ 22157);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (-1 != (ah.field_f ^ -1)) {
              if (ah.field_f == 1) {
                L4: {
                  if (-7 == (var2 ^ -1)) {
                    stackIn_31_0 = 0;
                    break L4;
                  } else {
                    stackIn_31_0 = 1;
                    break L4;
                  }
                }
                return stackIn_31_0 != 0;
              } else {
                return false;
              }
            } else {
              L5: {
                if ((var2 ^ -1) == -6) {
                  stackIn_25_0 = 0;
                  break L5;
                } else {
                  stackIn_25_0 = 1;
                  break L5;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            if (qe.field_b[var3]) {
              var2 = var2 + this.field_g[var3];
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, String param2, int param3, byte param4, boolean param5) {
        try {
            this.a(false, (byte) -103, param2, param0, param1, param5, false, param3);
            if (param4 != -66) {
                this.a(70, 121, 47, -17);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "mc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_u = null;
        field_m = null;
        if (param0 != -43) {
            mc.a((byte) -122);
        }
        field_t = null;
        field_z = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_21_0 = 0;
        boolean stackIn_77_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_106_0 = 0;
        boolean[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        boolean[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        boolean[] stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        boolean[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_192_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var17 = MinerDisturbance.field_ab;
        if (this.field_o) {
          L0: {
            this.field_v = this.field_v - 32;
            if (this.field_v >= -640) {
              break L0;
            } else {
              this.field_q.field_Q = null;
              if (ke.field_V) {
                el.a(ah.field_f, param1 + -5624);
                fa.b(param1 + 15262);
                break L0;
              } else {
                fm.f((byte) 81);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            this.field_c = this.field_c + 1;
            this.field_y = this.field_y - 1;
            if (-81 >= (255 & this.field_c ^ -1)) {
              break L1;
            } else {
              if (0 == (this.field_c & 7)) {
                this.field_b = this.field_b + 1;
                if (5 == this.field_b) {
                  this.field_b = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          L2: {
            this.field_k = 30 + (int)(0.5 + Math.sin((double)(this.field_c >> 1911047842)) * 30.0);
            var5 = wc.field_c[ah.field_f][0].field_A;
            var6 = wc.field_c[ah.field_f][0].field_x;
            var7 = 5;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_s == param3) {
              if (param2 == this.field_n) {
                if (param0 != 0) {
                  stackIn_21_0 = 1;
                  break L2;
                } else {
                  stackIn_21_0 = 0;
                  break L2;
                }
              } else {
                stackIn_21_0 = 1;
                break L2;
              }
            } else {
              stackIn_21_0 = 1;
              break L2;
            }
          }
          L3: {
            var11 = stackIn_21_0;
            this.field_n = param2;
            if ((this.field_v ^ -1) > -1) {
              break L3;
            } else {
              this.field_s = param3;
              break L3;
            }
          }
          L4: {
            if (var11 == 0) {
              break L4;
            } else {
              if (this.field_v >= 0) {
                L5: {
                  this.field_a = -1;
                  var12 = 3;
                  if (-2 != (ah.field_f ^ -1)) {
                    break L5;
                  } else {
                    var12 = 4;
                    break L5;
                  }
                }
                var13 = 0;
                L6: while (true) {
                  L7: {
                    if (var12 <= var13) {
                      break L7;
                    } else {
                      var14 = 0;
                      L8: while (true) {
                        if (var14 >= var7) {
                          var13++;
                          continue L6;
                        } else {
                          var15 = 40 + (this.field_v + var14 * (var6 + 16));
                          var16 = 80 + var13 * (4 + var5);
                          if (var15 < param3) {
                            if (param3 < var15 - -var6) {
                              if (param2 > var16) {
                                if (var16 + var5 > param2) {
                                  var9 = 1;
                                  this.field_l = -1;
                                  this.field_a = var8;
                                  break L7;
                                } else {
                                  var8++;
                                  var14++;
                                  continue L8;
                                }
                              } else {
                                var8++;
                                var14++;
                                continue L8;
                              }
                            } else {
                              var8++;
                              var14++;
                              continue L8;
                            }
                          } else {
                            var8++;
                            var14++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (449 >= param2) {
                        break L10;
                      } else {
                        if (475 <= param2) {
                          break L10;
                        } else {
                          L11: {
                            if (param3 <= 37) {
                              break L11;
                            } else {
                              if (169 > param3) {
                                this.field_a = -3;
                                var9 = 1;
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if ((param3 ^ -1) >= -330) {
                              break L12;
                            } else {
                              if (param3 < 443) {
                                this.field_a = -4;
                                var9 = 1;
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (445 >= param3) {
                            break L10;
                          } else {
                            if (588 <= param3) {
                              break L10;
                            } else {
                              var9 = 1;
                              this.field_a = -5;
                              if ((param3 ^ -1) >= -40) {
                                break L9;
                              } else {
                                if (param3 >= kd.field_r.field_x + 39) {
                                  break L9;
                                } else {
                                  if (315 >= param2) {
                                    break L9;
                                  } else {
                                    if (param2 >= 315 + kd.field_r.field_A) {
                                      break L9;
                                    } else {
                                      this.field_a = -2;
                                      var9 = 1;
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if ((param3 ^ -1) >= -40) {
                      break L9;
                    } else {
                      if (param3 >= kd.field_r.field_x + 39) {
                        break L9;
                      } else {
                        if (315 >= param2) {
                          break L9;
                        } else {
                          if (param2 >= 315 + kd.field_r.field_A) {
                            break L9;
                          } else {
                            this.field_a = -2;
                            var9 = 1;
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  if (20 >= this.field_a) {
                    if (var9 == 0) {
                      break L4;
                    } else {
                      if (param0 == 1) {
                        var10 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    this.field_a = 20;
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          var12 = 0;
          L13: while (true) {
            if (21 < var12) {
              var12 = 0;
              L14: while (true) {
                if (!mm.b((byte) 108)) {
                  L15: {
                    if (var12 == 0) {
                      if (var11 != 0) {
                        stackIn_192_0 = 1;
                        break L15;
                      } else {
                        stackIn_192_0 = 0;
                        break L15;
                      }
                    } else {
                      stackIn_192_0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    var11 = stackIn_192_0;
                    if (var10 == 0) {
                      break L16;
                    } else {
                      if (0 != (this.field_a ^ -1)) {
                        this.a(param0, (byte) 18, this.field_a);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (param1 == -5) {
                    L17: {
                      this.field_v = this.field_v + 32;
                      if (this.field_v <= 0) {
                        break L17;
                      } else {
                        this.field_v = 0;
                        break L17;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L18: {
                    if (13 == lj.field_t) {
                      var10 = 1;
                      this.field_a = -3;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (lj.field_t != 96) {
                      break L19;
                    } else {
                      var12 = 1;
                      if (this.field_a <= 0) {
                        if (1 < (this.field_a ^ -1)) {
                          if (2 == (this.field_a ^ -1)) {
                            this.field_a = -5;
                            break L19;
                          } else {
                            this.field_a = this.field_a + 1;
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      } else {
                        this.field_a = this.field_a - 1;
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (97 != lj.field_t) {
                      break L20;
                    } else {
                      L21: {
                        var12 = 1;
                        if (this.field_a >= -1 + nb.field_g[ah.field_f].length) {
                          break L21;
                        } else {
                          if (-2 < this.field_a) {
                            this.field_a = this.field_a + 1;
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if ((this.field_a ^ -1) <= 1) {
                        break L20;
                      } else {
                        if (-5 == this.field_a) {
                          this.field_a = -3;
                          break L20;
                        } else {
                          this.field_a = this.field_a - 1;
                          break L20;
                        }
                      }
                    }
                  }
                  L22: {
                    if (99 == lj.field_t) {
                      L23: {
                        L24: {
                          if ((this.field_a ^ -1) > -1) {
                            break L24;
                          } else {
                            if (5 >= -this.field_a + nb.field_g[ah.field_f].length) {
                              break L24;
                            } else {
                              this.field_a = this.field_a + 5;
                              if (this.field_a >= nb.field_g[ah.field_f].length - 1) {
                                this.field_a = nb.field_g[ah.field_f].length + -1;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        L25: {
                          if (this.field_a < 0) {
                            break L25;
                          } else {
                            if (-this.field_a + nb.field_g[ah.field_f].length > 5) {
                              break L25;
                            } else {
                              this.field_l = this.field_a;
                              this.field_a = -2;
                              break L23;
                            }
                          }
                        }
                        if (0 <= this.field_a) {
                          break L23;
                        } else {
                          if (this.field_a != -5) {
                            this.field_a = this.field_a - 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var12 = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L26: {
                    if (-99 == (lj.field_t ^ -1)) {
                      L27: {
                        if ((this.field_a ^ -1) > -6) {
                          if ((this.field_a ^ -1) <= -1) {
                            break L27;
                          } else {
                            if (1 == (this.field_a ^ -1)) {
                              if ((this.field_l ^ -1) <= -1) {
                                this.field_a = this.field_l;
                                break L27;
                              } else {
                                this.field_a = 10;
                                break L27;
                              }
                            } else {
                              this.field_a = this.field_a + 1;
                              break L27;
                            }
                          }
                        } else {
                          this.field_a = this.field_a - 5;
                          break L27;
                        }
                      }
                      var12 = 1;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L28: {
                    if (-81 == (lj.field_t ^ -1)) {
                      L29: {
                        var12 = 1;
                        if (-1 < (this.field_a ^ -1)) {
                          break L29;
                        } else {
                          if (14 > this.field_a) {
                            this.field_a = -5;
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      this.field_a = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L30: {
                    if ((lj.field_t ^ -1) == -85) {
                      break L30;
                    } else {
                      if ((lj.field_t ^ -1) == -84) {
                        break L30;
                      } else {
                        continue L14;
                      }
                    }
                  }
                  var10 = 1;
                  var12 = 1;
                  continue L14;
                }
              }
            } else {
              if (0 != this.field_j[var12]) {
                if (-3 != (this.field_j[var12] ^ -1)) {
                  this.field_p[var12] = this.field_p[var12] + 8;
                  if (0 <= this.field_p[var12]) {
                    this.field_j[var12] = 0;
                    var12++;
                    continue L13;
                  } else {
                    var12++;
                    continue L13;
                  }
                } else {
                  this.field_p[var12] = this.field_p[var12] - 8;
                  if (var12 == 21) {
                    if (this.field_p[var12] <= -kd.field_r.field_x) {
                      L31: {
                        this.field_j[var12] = 1;
                        stackIn_121_0 = this.field_i;

                        stackIn_121_1 = var12;

                        if (this.field_i[var12]) {
                          stackIn_122_0 = (boolean[]) ((Object) stackIn_121_0);
                          stackIn_122_1 = stackIn_121_1;
                          stackIn_122_2 = 0;
                          break L31;
                        } else {
                          stackIn_122_0 = (boolean[]) ((Object) stackIn_121_0);
                          stackIn_122_1 = stackIn_121_1;
                          stackIn_122_2 = 1;
                          break L31;
                        }
                      }
                      stackIn_122_0[stackIn_122_1] = stackIn_122_2 != 0;
                      var12++;
                      continue L13;
                    } else {
                      var12++;
                      continue L13;
                    }
                  } else {
                    if (-this.field_d >= this.field_p[var12]) {
                      L32: {
                        this.field_j[var12] = 1;
                        stackIn_115_0 = this.field_i;

                        stackIn_115_1 = var12;

                        if (this.field_i[var12]) {
                          stackIn_116_0 = (boolean[]) ((Object) stackIn_115_0);
                          stackIn_116_1 = stackIn_115_1;
                          stackIn_116_2 = 0;
                          break L32;
                        } else {
                          stackIn_116_0 = (boolean[]) ((Object) stackIn_115_0);
                          stackIn_116_1 = stackIn_115_1;
                          stackIn_116_2 = 1;
                          break L32;
                        }
                      }
                      stackIn_116_0[stackIn_116_1] = stackIn_116_2 != 0;
                      var12++;
                      continue L13;
                    } else {
                      var12++;
                      continue L13;
                    }
                  }
                }
              } else {
                L33: {
                  if (var12 >= 21) {
                    break L33;
                  } else {
                    L34: {
                      stackIn_77_0 = this.field_i[var12];

                      if (qe.field_b[var12]) {
                        stackIn_78_0 = stackIn_77_0;
                        stackIn_78_1 = 0;
                        break L34;
                      } else {
                        stackIn_78_0 = stackIn_77_0;
                        stackIn_78_1 = 1;
                        break L34;
                      }
                    }
                    if ((stackIn_78_0 ? 1 : 0) != stackIn_78_1) {
                      break L33;
                    } else {
                      this.field_j[var12] = 2;
                      break L33;
                    }
                  }
                }
                L35: {
                  if (-1 != (ah.field_f ^ -1)) {
                    break L35;
                  } else {
                    L36: {
                      L37: {
                        if (!qe.field_b[2]) {
                          break L37;
                        } else {
                          if (!qe.field_b[0]) {
                            break L37;
                          } else {
                            if (!qe.field_b[3]) {
                              break L37;
                            } else {
                              if (!qe.field_b[7]) {
                                break L37;
                              } else {
                                if (qe.field_b[6]) {
                                  stackIn_89_0 = 0;
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_89_0 = 1;
                      break L36;
                    }
                    L38: {


                      if (this.field_i[21]) {

                        stackIn_92_1 = 0;
                        break L38;
                      } else {

                        stackIn_92_1 = 1;
                        break L38;
                      }
                    }
                    if (stackIn_89_0 != stackIn_92_1) {
                      this.field_j[21] = 2;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                }
                if (ah.field_f == 1) {
                  L39: {
                    L40: {
                      if (!qe.field_b[2]) {
                        break L40;
                      } else {
                        if (!qe.field_b[0]) {
                          break L40;
                        } else {
                          if (!qe.field_b[3]) {
                            break L40;
                          } else {
                            if (!qe.field_b[7]) {
                              break L40;
                            } else {
                              if (!qe.field_b[6]) {
                                break L40;
                              } else {
                                if (qe.field_b[16]) {
                                  stackIn_106_0 = 0;
                                  break L39;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_106_0 = 1;
                    break L39;
                  }
                  if (stackIn_106_0 == (this.field_i[21] ? 1 : 0)) {
                    this.field_j[21] = 2;
                    var12++;
                    continue L13;
                  } else {
                    var12++;
                    continue L13;
                  }
                } else {
                  var12++;
                  continue L13;
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_54_0 = 0;
        vm stackIn_67_0;
        String stackIn_67_1;
        int stackIn_67_2;
        int stackIn_67_3;
        vm stackIn_68_0 = null;
        String stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        ea stackIn_70_0 = null;
        ea stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_79_0;
        int stackIn_79_2;
        String stackIn_79_3;
        int stackIn_79_4;
        Object stackIn_80_0 = null;
        int stackIn_80_2 = 0;
        String stackIn_80_3 = null;
        int stackIn_80_4 = 0;
        int stackIn_80_5 = 0;
        Object stackIn_82_0;
        Object stackIn_83_0 = null;
        int stackIn_83_6 = 0;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        Object stackIn_88_0;
        StringBuilder stackIn_88_3;
        Object stackIn_89_0 = null;
        StringBuilder stackIn_89_3 = null;
        String stackIn_89_4 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        vm stackIn_151_0;
        String stackIn_151_1;
        int stackIn_151_2;
        int stackIn_151_3;
        int stackIn_151_4;
        vm stackIn_152_0;
        String stackIn_152_1;
        int stackIn_152_2;
        int stackIn_152_3;
        int stackIn_152_4;
        int stackIn_152_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        String var8;
        int var9_int;
        vm var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        Object var13;
        String var13_ref;
        vm var14;
        ea var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        ea var22;
        L0: {
          var20 = MinerDisturbance.field_ab;
          if (-1 != (this.field_v ^ -1)) {
            vh.field_a[ah.field_f].c(this.field_v, 0, 100);
            break L0;
          } else {
            if (this.field_c <= 40) {
              vh.field_a[ah.field_f].c(this.field_v, 0, 178 - -(int)(60.0 * Math.sin((double)(this.field_c * 2)) + 18.0 * Math.cos((double)(3 * this.field_c))));
              break L0;
            } else {
              vh.field_a[ah.field_f].g(this.field_v, 0);
              break L0;
            }
          }
        }
        L1: {
          qc.field_d.f(-(qc.field_d.field_x >> -1793170751) + 320, this.field_v);
          if (-1 >= (this.field_v ^ -1)) {
            L2: {
              if (-41 > (this.field_c ^ -1)) {
                stackIn_10_0 = 30;
                break L2;
              } else {
                stackIn_10_0 = (int)(Math.sin((double)(this.field_c * 6)) * 20.0 + Math.cos((double)(this.field_c * 12)) * 14.0) + 35;
                break L2;
              }
            }
            var2 = stackIn_10_0;
            var3 = 345 + -(qc.field_d.field_x >> -1952423775);
            var4 = 320 - -(qc.field_d.field_x >> -418002335) - 25;
            L3: while (true) {
              if (var3 >= var4) {
                eh.a(var4 << 1827688708, 42 + this.field_v << 316952420, 800, var2, s.field_I);
                break L1;
              } else {
                eh.a(var3 << -804427772, this.field_v + 42 << -880195740, 800, var2, s.field_I);
                var3 += 50;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        L4: {
          var2 = wc.field_c[ah.field_f][0].field_A;
          var3 = wc.field_c[ah.field_f][0].field_x;
          var4 = 5;
          var5 = 0;
          var6 = 3;
          if (-2 != (ah.field_f ^ -1)) {
            break L4;
          } else {
            var6 = 4;
            break L4;
          }
        }
        var7 = 0;
        L5: while (true) {
          L6: {
            if (var6 <= var7) {
              break L6;
            } else {
              var8_int = 0;
              L7: while (true) {
                if (var4 <= var8_int) {
                  var7++;
                  continue L5;
                } else {
                  if (21 <= var5) {
                    break L6;
                  } else {
                    var9_int = 40 + ((16 + var3) * var8_int - -this.field_v);
                    var10 = var7 * (var2 - -4) - -80;
                    if (this.field_a == var5) {
                      var11 = -var3 + pk.field_d.field_x >> 908014305;
                      var12 = -var2 + pk.field_d.field_A >> -1858232575;
                      pk.field_d.f(var9_int + -var11, var10 + -var12);
                      var5++;
                      var8_int++;
                      continue L7;
                    } else {
                      var5++;
                      var8_int++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
          var21 = 0;
          var5 = var21;
          var7 = 0;
          L8: while (true) {
            L9: {
              if (var7 >= var6) {
                break L9;
              } else {
                var8_int = 0;
                L10: while (true) {
                  if (var8_int >= var4) {
                    var7++;
                    continue L8;
                  } else {
                    if (-22 >= (var21 ^ -1)) {
                      break L9;
                    } else {
                      L11: {
                        var9_int = nb.field_g[ah.field_f][var21];
                        var10 = this.field_g[var9_int];
                        var11 = this.field_p[var9_int];
                        var12 = var11 + var3;
                        var13_int = this.field_i[var9_int] ? 1 : 0;
                        var22 = wc.field_c[ah.field_f][var9_int];
                        var15 = te.field_e[ah.field_f][var9_int];
                        var16 = this.field_v + (var8_int * (16 + var3) + 40);
                        var17 = 80 + var7 * (var2 + 4);
                        var18 = -(var11 >> 957059617) + var16;
                        if (this.field_f < var10) {
                          if (var13_int == 0) {
                            L12: {
                              if ((var9_int ^ -1) != -2) {
                                break L12;
                              } else {
                                if (!qe.field_b[0]) {
                                  break L12;
                                } else {
                                  if (this.field_f < this.field_g[0]) {
                                    break L12;
                                  } else {
                                    stackIn_54_0 = 0;
                                    break L11;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (var9_int != 0) {
                                break L13;
                              } else {
                                if (!qe.field_b[1]) {
                                  break L13;
                                } else {
                                  stackIn_54_0 = 0;
                                  break L11;
                                }
                              }
                            }
                            L14: {
                              if (var9_int != 19) {
                                break L14;
                              } else {
                                if (!qe.field_b[2]) {
                                  break L14;
                                } else {
                                  if (this.field_f < this.field_g[2]) {
                                    break L14;
                                  } else {
                                    stackIn_54_0 = 0;
                                    break L11;
                                  }
                                }
                              }
                            }
                            if (-3 == (var9_int ^ -1)) {
                              if (!qe.field_b[19]) {
                                stackIn_54_0 = 1;
                                break L11;
                              } else {
                                stackIn_54_0 = 0;
                                break L11;
                              }
                            } else {
                              stackIn_54_0 = 1;
                              break L11;
                            }
                          } else {
                            stackIn_54_0 = 0;
                            break L11;
                          }
                        } else {
                          stackIn_54_0 = 0;
                          break L11;
                        }
                      }
                      L15: {
                        var19 = stackIn_54_0;
                        if (var19 != 0) {
                          var22.d(var18, var17, var12, var2, 100);
                          break L15;
                        } else {
                          if (var13_int != 0) {
                            var15.c(var18, var17, var12, var2);
                            if (var21 == this.field_a) {
                              var15.e(var18, var17, var12, var2, this.field_k);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            var22.c(var18, var17, var12, var2);
                            if (var21 == this.field_a) {
                              var22.e(var18, var17, var12, var2, this.field_k);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      var21++;
                      if (var13_int == 0) {
                        L16: {
                          this.field_h.g();
                          eh.d();
                          stackIn_67_0 = ce.field_d;

                          stackIn_67_1 = Integer.toString(var10 * 100);

                          stackIn_67_2 = 10;

                          stackIn_67_3 = 17;

                          if (var19 != 0) {
                            stackIn_68_0 = (vm) ((Object) stackIn_67_0);
                            stackIn_68_1 = (String) ((Object) stackIn_67_1);
                            stackIn_68_2 = stackIn_67_2;
                            stackIn_68_3 = stackIn_67_3;
                            stackIn_68_4 = 3355443;
                            break L16;
                          } else {
                            stackIn_68_0 = (vm) ((Object) stackIn_67_0);
                            stackIn_68_1 = (String) ((Object) stackIn_67_1);
                            stackIn_68_2 = stackIn_67_2;
                            stackIn_68_3 = stackIn_67_3;
                            stackIn_68_4 = 5710861;
                            break L16;
                          }
                        }
                        L17: {
                          ((vm) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2, stackIn_68_3, stackIn_68_4, -1);
                          stackIn_70_0 = this.field_h;

                          if (var19 != 0) {
                            stackIn_71_0 = (ea) ((Object) stackIn_70_0);
                            stackIn_71_1 = 6776679;
                            break L17;
                          } else {
                            stackIn_71_0 = (ea) ((Object) stackIn_70_0);
                            stackIn_71_1 = 16777215;
                            break L17;
                          }
                        }
                        ((ea) (Object) stackIn_71_0).f(stackIn_71_1);
                        bj.field_e.a((byte) -45);
                        this.field_h.c(var18, var17, var12, var2);
                        var8_int++;
                        continue L10;
                      } else {
                        gb.field_a.c(var18, var17, var12, var2);
                        var8_int++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
            L18: {
              L19: {
                eh.b(this.field_v, 440, 640, 40, 4539717, 160);
                eh.a(this.field_v, 441, 640, 41, 10066329);
                stackIn_76_0 = this;

                if (-1 != (this.field_f ^ -1)) {
                  break L19;
                } else {
                  stackIn_76_0 = this;

                  if ((this.field_c % 10 ^ -1) <= -6) {
                    break L19;
                  } else {
                    stackIn_77_0 = this;
                    stackIn_77_1 = 1;
                    break L18;
                  }
                }
              }
              stackIn_77_0 = this;
              stackIn_77_1 = 0;
              break L18;
            }
            L20: {
              stackIn_79_0 = this;

              stackIn_79_2 = -123;

              stackIn_79_3 = sd.field_e;

              stackIn_79_4 = 450;

              if ((this.field_a ^ -1) != 4) {
                stackIn_80_0 = this;

                stackIn_80_2 = stackIn_79_2;
                stackIn_80_3 = (String) ((Object) stackIn_79_3);
                stackIn_80_4 = stackIn_79_4;
                stackIn_80_5 = 0;
                break L20;
              } else {
                stackIn_80_0 = this;

                stackIn_80_2 = stackIn_79_2;
                stackIn_80_3 = (String) ((Object) stackIn_79_3);
                stackIn_80_4 = stackIn_79_4;
                stackIn_80_5 = 1;
                break L20;
              }
            }
            L21: {
              stackIn_82_0 = this;

              if (this.field_f == 0) {
                stackIn_83_0 = this;


                stackIn_80_3 = (String) ((Object) stackIn_80_3);


                stackIn_83_6 = 0;
                break L21;
              } else {
                stackIn_83_0 = this;


                stackIn_80_3 = (String) ((Object) stackIn_80_3);


                stackIn_83_6 = 1;
                break L21;
              }
            }
            L22: {
              this.a(stackIn_77_1 != 0, (byte) stackIn_80_2, stackIn_80_3, stackIn_80_4, stackIn_80_5 != 0, stackIn_83_6 != 0, false, 457);
              stackIn_85_0 = this;

              stackIn_85_1 = 450;

              if ((this.field_a ^ -1) != 3) {
                stackIn_86_0 = this;
                stackIn_86_1 = stackIn_85_1;
                stackIn_86_2 = 0;
                break L22;
              } else {
                stackIn_86_0 = this;
                stackIn_86_1 = stackIn_85_1;
                stackIn_86_2 = 1;
                break L22;
              }
            }
            L23: {
              stackIn_88_0 = this;

              stackIn_88_3 = new StringBuilder().append(gd.field_t);

              if (!sc.field_b) {
                stackIn_89_0 = this;


                stackIn_89_3 = (StringBuilder) ((Object) stackIn_88_3);
                stackIn_89_4 = ie.field_a;
                break L23;
              } else {
                stackIn_89_0 = this;


                stackIn_89_3 = (StringBuilder) ((Object) stackIn_88_3);
                stackIn_89_4 = gm.field_b;
                break L23;
              }
            }
            L24: {
              this.a(stackIn_86_1, stackIn_86_2 != 0, stackIn_89_4, 315, (byte) -66, false);
              stackIn_91_0 = this;

              stackIn_91_1 = 450;

              if (-3 != this.field_a) {
                stackIn_92_0 = this;
                stackIn_92_1 = stackIn_91_1;
                stackIn_92_2 = 0;
                break L24;
              } else {
                stackIn_92_0 = this;
                stackIn_92_1 = stackIn_91_1;
                stackIn_92_2 = 1;
                break L24;
              }
            }
            L25: {
              this.a(stackIn_92_1, stackIn_92_2 != 0, mn.field_v, 40, (byte) -66, false);
              if (0 != this.field_f) {
                break L25;
              } else {
                a.field_a[this.field_b - -16].f(this.field_v + 590, -a.field_a[0].field_u + -a.field_a[0].field_C + 480);
                break L25;
              }
            }
            L26: {
              var7 = -this.field_v - 0;
              var8 = ta.field_f;
              if (this.field_i[21]) {
                var8 = se.field_L;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var9 = mm.field_a;
              this.field_r.g();
              kd.field_r.g(0, 0);
              var10 = 3 + (var9.field_E + var9.field_I);
              var9.a(var8, -2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, 2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, 0, -2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, 0, 2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, -1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, 1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, -1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              var9.a(var8, 1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              if (this.field_a == -2) {
                var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 15884837, -1, 1, 1, var10);
                break L27;
              } else {
                var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 16437248, -1, 1, 1, var10);
                break L27;
              }
            }
            L28: {
              var11 = -101 / ((-70 - param0) / 32);
              bj.field_e.a((byte) -45);
              this.field_r.c(39 + (var7 + -(this.field_p[21] >> 1292543361)), 315, kd.field_r.field_x - -this.field_p[21], kd.field_r.field_A);
              g.a(316, 113, var7 + 190, 414, (byte) 83, he.field_b);
              g.a(391, 38, var7 + 39, 142, (byte) 109, he.field_b);
              if (-1 == (this.field_v ^ -1)) {
                L29: {
                  var12 = -1;
                  if ((this.field_a ^ -1) > -1) {
                    break L29;
                  } else {
                    if (nb.field_g[ah.field_f].length <= this.field_a) {
                      break L29;
                    } else {
                      var12 = nb.field_g[ah.field_f][this.field_a];
                      break L29;
                    }
                  }
                }
                L30: {
                  var13 = null;
                  if (6 == var12) {
                    tn.field_K[6].g(487, 326);
                    var13_ref = vh.field_h[ah.field_f];
                    break L30;
                  } else {
                    if (-1 != (var12 ^ -1)) {
                      if (-3 == (var12 ^ -1)) {
                        tn.field_K[2].g(487, 326);
                        var13_ref = gl.field_x[ah.field_f];
                        break L30;
                      } else {
                        if ((var12 ^ -1) != -4) {
                          if (var12 != 7) {
                            if ((var12 ^ -1) != -10) {
                              if (-2 != (var12 ^ -1)) {
                                if (var12 == 11) {
                                  tn.field_K[11].g(487, 326);
                                  var13_ref = tc.field_p;
                                  break L30;
                                } else {
                                  if (8 != var12) {
                                    if (4 == var12) {
                                      tn.field_K[4].g(487, 326);
                                      var13_ref = cl.field_M;
                                      break L30;
                                    } else {
                                      if (10 != var12) {
                                        if ((var12 ^ -1) == -6) {
                                          tn.field_K[5].g(487, 326);
                                          var13_ref = uf.field_u;
                                          break L30;
                                        } else {
                                          if (-13 != (var12 ^ -1)) {
                                            if ((var12 ^ -1) != -14) {
                                              if (14 != var12) {
                                                if (-16 != (var12 ^ -1)) {
                                                  if (16 != var12) {
                                                    if (17 != var12) {
                                                      if (-19 != (var12 ^ -1)) {
                                                        if (var12 == 19) {
                                                          tn.field_K[18].g(487, 326);
                                                          var13_ref = ck.field_e;
                                                          break L30;
                                                        } else {
                                                          if (20 == var12) {
                                                            tn.field_K[19].g(487, 326);
                                                            var13_ref = fm.field_K;
                                                            break L30;
                                                          } else {
                                                            var13_ref = ne.field_R[ah.field_f];
                                                            break L30;
                                                          }
                                                        }
                                                      } else {
                                                        tn.field_K[17].g(487, 326);
                                                        var13_ref = lm.field_I;
                                                        break L30;
                                                      }
                                                    } else {
                                                      tn.field_K[16].g(487, 326);
                                                      var13_ref = nf.field_b;
                                                      break L30;
                                                    }
                                                  } else {
                                                    tn.field_K[15].g(487, 326);
                                                    var13_ref = ol.field_d;
                                                    break L30;
                                                  }
                                                } else {
                                                  tn.field_K[14].g(487, 326);
                                                  var13_ref = jn.field_p;
                                                  break L30;
                                                }
                                              } else {
                                                tn.field_K[13].g(487, 326);
                                                var13_ref = fd.field_kb[ah.field_f];
                                                break L30;
                                              }
                                            } else {
                                              tn.field_K[12].g(487, 326);
                                              var13_ref = qh.field_d;
                                              break L30;
                                            }
                                          } else {
                                            tn.field_K[12].g(487, 326);
                                            var13_ref = hh.field_c;
                                            break L30;
                                          }
                                        }
                                      } else {
                                        tn.field_K[10].g(487, 326);
                                        var13_ref = wc.field_d;
                                        break L30;
                                      }
                                    }
                                  } else {
                                    tn.field_K[8].g(487, 326);
                                    var13_ref = ef.field_d;
                                    break L30;
                                  }
                                }
                              } else {
                                tn.field_K[1].g(487, 326);
                                var13_ref = ig.field_d;
                                break L30;
                              }
                            } else {
                              tn.field_K[9].g(487, 326);
                              var13_ref = mn.field_w[ah.field_f];
                              break L30;
                            }
                          } else {
                            tn.field_K[7].g(487, 326);
                            var13_ref = ii.field_c;
                            break L30;
                          }
                        } else {
                          tn.field_K[3].g(487, 326);
                          var13_ref = ob.field_v;
                          break L30;
                        }
                      }
                    } else {
                      tn.field_K[0].g(487, 326);
                      var13_ref = hm.field_J[ah.field_f];
                      break L30;
                    }
                  }
                }
                L31: {
                  if (var13_ref == null) {
                    break L31;
                  } else {
                    L32: {
                      stackIn_151_0 = ce.field_d;

                      stackIn_151_1 = (String) (var13_ref);

                      stackIn_151_2 = 205;

                      stackIn_151_3 = 327;

                      stackIn_151_4 = 384;

                      if (ne.field_R[ah.field_f] == var13_ref) {
                        stackIn_152_0 = (vm) ((Object) stackIn_151_0);
                        stackIn_152_1 = (String) ((Object) stackIn_151_1);
                        stackIn_152_2 = stackIn_151_2;
                        stackIn_152_3 = stackIn_151_3;
                        stackIn_152_4 = stackIn_151_4;
                        stackIn_152_5 = 0;
                        break L32;
                      } else {
                        stackIn_152_0 = (vm) ((Object) stackIn_151_0);
                        stackIn_152_1 = (String) ((Object) stackIn_151_1);
                        stackIn_152_2 = stackIn_151_2;
                        stackIn_152_3 = stackIn_151_3;
                        stackIn_152_4 = stackIn_151_4;
                        stackIn_152_5 = tn.field_K[13].field_x + 20;
                        break L32;
                      }
                    }
                    ((vm) (Object) stackIn_152_0).a(stackIn_152_1, stackIn_152_2, stackIn_152_3, stackIn_152_4 - stackIn_152_5, 90, 3550242, -1, 3, 0, 0);
                    break L31;
                  }
                }
                L33: {
                  var14 = mm.field_a;
                  if ((var12 ^ -1) > -1) {
                    break L33;
                  } else {
                    var14.c(oa.a((byte) -77, af.field_r, new String[]{Integer.toString(this.field_g[var12] * 100)}), 462, 418, 1, -1);
                    break L33;
                  }
                }
                L34: {
                  if (-1 <= (this.field_y ^ -1)) {
                    break L34;
                  } else {
                    if (-6 < (this.field_y % 10 ^ -1)) {
                      var14.a(oa.a((byte) -73, ne.field_M, new String[]{Integer.toString(100 * this.field_f)}), 52 - -var7, 418, 16711680, -1);
                      break L28;
                    } else {
                      break L34;
                    }
                  }
                }
                var14.a(oa.a((byte) -126, ne.field_M, new String[]{Integer.toString(this.field_f * 100)}), 52 - -var7, 418, 1, -1);
                break L28;
              } else {
                break L28;
              }
            }
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        if (!param0) {
            this.field_s = nk.field_w;
            this.field_n = gb.field_e;
            this.field_a = 0;
        } else {
            this.field_s = -1;
            this.field_n = -1;
        }
        if (param1 != 27) {
            this.field_f = 37;
        }
    }

    mc(MinerDisturbance param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        this.field_p = new int[22];
        this.field_i = new boolean[22];
        this.field_j = new int[22];
        this.field_a = 0;
        this.field_g = new int[]{1, 2, 1, 1, 3, 2, 1, 1, 2, 1, 2, 1, 2, 3, 1, 2, 1, 3, 1, 2, 3};
        this.field_v = -640;
        try {
          L0: {
            L1: {
              this.field_q = param0;
              this.field_f = 5;
              if ((ah.field_f ^ -1) != -2) {
                break L1;
              } else {
                this.field_f = 6;
                break L1;
              }
            }
            L2: {
              kj.a(1, -22156);
              if (ah.field_f == cm.field_o) {
                var5 = 0;
                var3_int = var5;
                L3: while (true) {
                  if (21 <= var5) {
                    break L2;
                  } else {
                    L4: {
                      qe.field_b[var5] = bn.field_b[var5];
                      if (!qe.field_b[var5]) {
                        break L4;
                      } else {
                        L5: {
                          this.field_f = this.field_f - this.field_g[var5];
                          if ((var5 ^ -1) != -13) {
                            break L5;
                          } else {
                            kj.a(2 * ne.a(false), -22156);
                            break L5;
                          }
                        }
                        if (13 != var5) {
                          break L4;
                        } else {
                          kj.a(ne.a(false) * 3, -22156);
                          break L4;
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var3_int = 0;
                L6: while (true) {
                  if ((var3_int ^ -1) <= -22) {
                    break L2;
                  } else {
                    qe.field_b[var3_int] = false;
                    var3_int++;
                    continue L6;
                  }
                }
              }
            }
            this.field_d = wc.field_c[ah.field_f][0].field_x;
            this.field_h = new ea(this.field_d, wc.field_c[ah.field_f][0].field_A);
            this.field_l = -1;
            this.field_y = 0;
            this.field_r = new ea(kd.field_r.field_x, kd.field_r.field_A);
            this.a(param1, (byte) 27);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("mc.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    static {
        field_z = "Nothing To Say";
        field_x = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Not yet achieved";
        field_t = new bd();
    }
}
