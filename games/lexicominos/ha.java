/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_i;
    static int field_d;
    private int[] field_c;
    tl field_a;
    char[] field_h;
    tl field_g;
    tl field_b;
    private boolean field_f;
    private fc field_e;

    final static void a(String param0, String param1, int param2) {
        if (param2 >= -58) {
            return;
        }
        try {
            uf.a(param0, -108, param1, false);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ha.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    var2 = 1;
                    var3 = qc.field_b[this.field_i][this.field_b.field_a];
                    var4 = 0;
                    if (param0 == -11498) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    if (var4 < 4) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return var2 != 0;
                }
                case 4: {
                    var5 = this.field_a.field_a + var3[var4 * 2];
                    var6 = this.field_g.field_a - -var3[var4 * 2 + 1];
                    stackIn_6_0 = 18;
                    stackIn_5_0 = stackIn_6_0;
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    if (stackIn_6_0 <= var6) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_e.field_w[var6][var5] = this.field_h[var4];
                    if (var7 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var2 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        int statePc = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        db var6_ref_db = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Lexicominos.field_L ? 1 : 0;
                    if (!param0) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    lf.g(0, 8, 311, 450);
                    var3_int = this.field_b.field_a * this.field_b.field_b + this.field_b.a((byte) -123);
                    if (-1 < (var3_int ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3_int += 128;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var4 = this.field_b.a((byte) -123);
                    if (var4 >= 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 += 32;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5_ref_int__ = qc.field_f[this.field_i][var3_int];
                    var6_ref_db = qc.field_d[var4];
                    var7 = (-var6_ref_db.field_p + ia.field_H.field_p) / 2;
                    var8 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var8 ^ -1) <= -5) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var9 = this.field_a.field_a * 24 - -var5_ref_int__[var8 * 2];
                    var10 = this.field_g.field_a * 24 + var5_ref_int__[1 + 2 * var8];
                    var11 = this.field_a.a((byte) -123) + (var9 + 10 + var7);
                    var12 = var7 + -this.field_g.a((byte) -123) + 416 + -var10;
                    eb.a(param1 ^ 13560, this.field_e.field_m, 0, var6_ref_db, this.field_h[var8], var12, var11);
                    var8++;
                    if (var13 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var13 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    lf.b();
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var13 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var14 = qc.field_b[this.field_i][this.field_b.field_a];
                    var3 = var14;
                    var4 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var4 >= 4) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var5 = this.field_c[this.field_i] + var14[1 + 2 * var4];
                    var6 = var14[2 * var4];
                    var7 = this.field_a.a((byte) -123) + (149 + 24 * var6);
                    var8 = -this.field_g.a((byte) -123) + 78 - 24 * var5;
                    eb.a(param1 + -13543, this.field_e.field_m, 0, ia.field_H, this.field_h[var4], var8, var7);
                    var4++;
                    if (var13 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var13 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var14 = qc.field_b[this.field_i][this.field_b.field_a];
                    var3 = var14;
                    var4 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var4 >= 4) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = this.field_c[this.field_i] + var14[1 + 2 * var4];
                    var6 = var14[2 * var4];
                    var7 = this.field_a.a((byte) -123) + (149 + 24 * var6);
                    var8 = -this.field_g.a((byte) -123) + 78 - 24 * var5;
                    eb.a(param1 + -13543, this.field_e.field_m, 0, ia.field_H, this.field_h[var4], var8, var7);
                    var4++;
                    if (var13 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var13 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (param1 == 13551) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_g = (tl) null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5) {
        tl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        tl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_13_0 = 0;
        tl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        tl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_57_0 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_74_0 = 0;
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
        L0: {
          var17 = Lexicominos.field_L ? 1 : 0;
          var7 = 0;
          if (param0 ^ param4) {
            L1: {
              stackIn_4_0 = this.field_b;

              stackIn_4_1 = 121;

              if (param0) {
                stackIn_5_0 = (tl) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = this.field_e.field_d;
                break L1;
              } else {
                stackIn_5_0 = (tl) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = -this.field_e.field_d;
                break L1;
              }
            }
            var7 = ((tl) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (var7 != 0) {
            break L2;
          } else {
            if (this.field_b.field_c != 0) {
              var8 = rf.a(this.field_b.field_c, 47);
              var7 = Math.min(var8 * this.field_b.field_c, this.field_e.field_d) * -var8;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_e.field_d > Math.abs(this.field_a.field_c)) {
            stackIn_13_0 = -this.field_a.field_c;
            break L3;
          } else {
            stackIn_13_0 = -this.field_e.field_d * rf.a(this.field_a.field_c, 47);
            break L3;
          }
        }
        var8 = stackIn_13_0;
        var9 = 0;
        if (param5 == -93) {
          L4: {
            if (param1 ^ param2) {
              L5: {
                stackIn_19_0 = this.field_a;

                stackIn_19_1 = 115;

                if (param2) {
                  stackIn_20_0 = (tl) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = -1;
                  break L5;
                } else {
                  stackIn_20_0 = (tl) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = 1;
                  break L5;
                }
              }
              var9 = ((tl) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2 * this.field_e.field_d);
              break L4;
            } else {
              break L4;
            }
          }
          L6: {
            if (!param3) {
              stackIn_24_0 = -this.field_e.field_d;
              break L6;
            } else {
              stackIn_24_0 = -32;
              break L6;
            }
          }
          L7: {
            var10 = stackIn_24_0;
            var11 = var7;
            var12 = var8;
            var13 = var9;
            var14 = var10;
            if (rf.a(var12, 47) != rf.a(var13, 47)) {
              break L7;
            } else {
              var12 = 0;
              var8 = 0;
              break L7;
            }
          }
          L8: while (true) {
            L9: {
              L10: {
                L11: {
                  L12: {
                    if (-1 != (var11 ^ -1)) {
                      break L12;
                    } else {
                      stackIn_42_0 = 0;

                      stackIn_42_1 = var12;

                      if (var17 != 0) {
                        break L11;
                      } else {
                        if (stackIn_42_0 != stackIn_42_1) {
                          break L12;
                        } else {
                          if (-1 != (var13 ^ -1)) {
                            break L12;
                          } else {
                            if (0 == var14) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (var11 == 0) {
                      break L13;
                    } else {
                      L14: {
                        var15 = rf.a(var11, 47);
                        if (-1 < (var15 * this.field_b.field_c ^ -1)) {
                          var16 = Math.min(Math.abs(var11), Math.abs(this.field_b.field_c)) * var15;
                          var11 = var11 - var16;
                          this.field_b.field_c = this.field_b.field_c + var16;
                          if (var17 == 0) {
                            continue L8;
                          } else {
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                      var16 = (4 + var15 + this.field_b.field_a) % 4;
                      if (!this.field_f) {
                        break L13;
                      } else {
                        if (!this.a(this.field_g.field_a, this.field_a.field_a, (byte) -15, var16)) {
                          break L13;
                        } else {
                          this.field_b.field_c = this.field_b.field_c + var15 * (1 + -this.field_b.field_f);
                          this.field_b.field_a = var16;
                          var11 = var11 - var15;
                          if (var17 == 0) {
                            continue L8;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  if (var13 != 0) {
                    stackIn_42_0 = var13;
                    stackIn_42_1 = 47;
                    break L11;
                  } else {
                    break L10;
                  }
                }
                L15: {
                  var15 = rf.a(stackIn_42_0, stackIn_42_1);
                  if (this.field_a.field_c * var15 >= 0) {
                    break L15;
                  } else {
                    var16 = Math.min(Math.abs(var13), Math.abs(this.field_a.field_c)) * var15;
                    var13 = var13 - var16;
                    var12 = 0;
                    this.field_a.field_c = this.field_a.field_c + var16;
                    if (var17 == 0) {
                      continue L8;
                    } else {
                      break L15;
                    }
                  }
                }
                if (!this.a(this.field_g.field_a, var15 + this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                  break L10;
                } else {
                  L16: {
                    if (0 == this.field_g.field_c) {
                      break L16;
                    } else {
                      if (this.a(this.field_g.field_a - -1, var15 + this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                        break L16;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var13 = var13 - var15;
                  var12 = 0;
                  this.field_a.field_c = this.field_a.field_c + (1 + -this.field_a.field_f) * var15;
                  this.field_a.field_a = this.field_a.field_a + var15;
                  if (var17 == 0) {
                    continue L8;
                  } else {
                    break L10;
                  }
                }
              }
              L17: {
                if (0 != var12) {
                  this.field_a.field_c = this.field_a.field_c + var12;
                  var12 = 0;
                  if (var17 == 0) {
                    continue L8;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              if (var14 == 0) {
                break L9;
              } else {
                L18: {
                  if (-1 <= (this.field_g.field_c ^ -1)) {
                    break L18;
                  } else {
                    L19: {
                      if (this.field_g.field_c < -var14) {
                        stackIn_57_0 = this.field_g.field_c;
                        break L19;
                      } else {
                        stackIn_57_0 = -var14;
                        break L19;
                      }
                    }
                    var15 = stackIn_57_0;
                    this.field_g.field_c = this.field_g.field_c - var15;
                    var14 = var14 + var15;
                    if (var17 == 0) {
                      continue L8;
                    } else {
                      break L18;
                    }
                  }
                }
                if (!this.a(this.field_g.field_a + -1, this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                  break L9;
                } else {
                  L20: {
                    if (this.field_a.field_c == 0) {
                      break L20;
                    } else {
                      if (this.a(this.field_g.field_a + -1, this.field_a.field_a - -rf.a(this.field_a.field_c, 47), (byte) -15, this.field_b.field_a)) {
                        break L20;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_g.field_a = this.field_g.field_a - 1;
                  this.field_g.field_c = this.field_g.field_f + -1;
                  var14++;
                  if (var17 == 0) {
                    continue L8;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L21: {
              L22: {
                stackIn_67_0 = this;

                if (var8 != var12) {
                  break L22;
                } else {
                  stackIn_67_0 = this;

                  if (var9 != var13) {
                    break L22;
                  } else {
                    stackIn_68_0 = this;

                    if (var10 == var14) {
                      stackIn_69_0 = this;
                      stackIn_69_1 = 0;
                      break L21;
                    } else {
                      stackIn_67_0 = this;
                      break L22;
                    }
                  }
                }
              }
              stackIn_69_0 = this;
              stackIn_69_1 = 1;
              break L21;
            }
            L23: {
              L24: {
                ((ha) (this)).field_f = stackIn_69_1 != 0;
                if (var7 != var11) {
                  break L24;
                } else {
                  if (!this.field_f) {
                    stackIn_74_0 = 0;
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              stackIn_74_0 = 1;
              break L23;
            }
            return stackIn_74_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        java.awt.Canvas var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 43) {
            break L0;
          } else {
            var2 = (java.awt.Canvas) null;
            ha.a((java.awt.Canvas) null, (byte) 124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (ta.field_g ^ -1)) {
              break L2;
            } else {
              if ((wf.field_i ^ -1) > -14) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 41) {
              L1: {
                sg.a((java.awt.Component) ((Object) param0), 2);
                bi.a((byte) 104, (java.awt.Component) ((Object) param0));
                if (null == rk.field_c) {
                  break L1;
                } else {
                  rk.field_c.a(true, (java.awt.Component) ((Object) param0));
                  break L1;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ha.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, byte param2, int param3) {
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int stackIn_7_0 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param2 == -15) {
          var10 = qc.field_b[this.field_i][param3 % 4];
          var5 = var10;
          var6 = 0;
          L0: while (true) {
            if ((var6 ^ -1) > -5) {
              var7 = param1 - -var10[var6 * 2];
              var8 = param0 + var10[1 + var6 * 2];
              stackIn_7_0 = var7 ^ -1;

              if (var9 == 0) {
                L1: {
                  if (stackIn_7_0 > -1) {
                    break L1;
                  } else {
                    if ((var7 ^ -1) <= -13) {
                      break L1;
                    } else {
                      if ((var8 ^ -1) > -1) {
                        break L1;
                      } else {
                        L2: {
                          if ((var8 ^ -1) <= -19) {
                            break L2;
                          } else {
                            if (this.field_e.field_w[var8][var7] != 0) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        var6++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
                return false;
              } else {
                return stackIn_7_0 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    ha(fc param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
                    this.field_a = new tl(16, 24);
                    this.field_g = new tl(128, 24);
                    this.field_b = new tl(32, 32);
                    this.field_f = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e = param0;
                        this.field_h = new char[4];
                        param0.field_m.a(param0, 0, this.field_h);
                        this.field_i = param0.a(-2, 7);
                        this.field_b.field_a = 0;
                        this.field_a.field_a = 5;
                        var2_int = 0;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= qc.field_b[this.field_i][this.field_b.field_a].length) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = Math.min(var2_int, qc.field_b[this.field_i][this.field_b.field_a][var3]);
                        var3 += 2;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_g.field_a = -var2_int + 18;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("ha.<init>(");
                    stackIn_8_1 = stackIn_9_1;
                    if (param0 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ha(fc param0, int param1, char[] param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
                    this.field_a = new tl(16, 24);
                    this.field_g = new tl(128, 24);
                    this.field_b = new tl(32, 32);
                    this.field_f = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e = param0;
                        this.field_h = param2;
                        this.field_i = param1;
                        if (param2.length == 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_b.field_a = 0;
                        this.field_a.field_a = 5;
                        var4_int = 0;
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 >= qc.field_b[param1][this.field_b.field_a].length) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = Math.min(var4_int, qc.field_b[param1][this.field_b.field_a][var5]);
                        var5 += 2;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_g.field_a = -var4_int + 18;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var4);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("ha.<init>(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param2 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
