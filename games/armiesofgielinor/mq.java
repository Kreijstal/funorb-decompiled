/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends je {
    private int[] field_Ub;
    private int field_Sb;
    private int field_Yb;
    static volatile int field_Xb;
    private int field_Qb;
    private int field_Pb;
    static String field_Mb;
    static String[] field_Lb;
    private nf[] field_Vb;
    static int field_Wb;
    static String field_Nb;
    private int field_Tb;
    private int field_Zb;
    private int field_Ib;
    private mq field_Ob;
    private char[] field_Kb;
    private mq[] field_Rb;
    private int field_Jb;

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 != 85) {
            mq.k(22);
            field_Mb = null;
            return;
        }
        field_Mb = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_Qb = this.field_Jb - -(2 * param0);
          this.a(this.field_Sb, param5 ^ 18789, this.field_Qb, -this.field_Sb + param2, param3);
          if (this.field_Zb != param4) {
            this.field_Zb = param4;
            this.c(this.field_Yb, 48);
            break L0;
          } else {
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (var7 >= this.field_Tb) {
            if (param5 == -6519) {
              L2: {
                if ((this.field_Pb ^ -1) == 0) {
                  break L2;
                } else {
                  if (this.field_Rb[this.field_Pb] == null) {
                    break L2;
                  } else {
                    var7 = this.field_Rb[this.field_Pb].field_Tb;
                    var8 = this.field_Ib * (var7 + this.field_Pb) + this.field_ab;
                    L3: while (true) {
                      if (param2 >= var8) {
                        this.field_Rb[this.field_Pb].b(param0, param1, var8, this.field_Qb + param3, this.field_Vb[this.field_Pb].field_D, -6519);
                        return;
                      } else {
                        var8 = var8 - this.field_Ib;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              L4: {
                this.field_Jb = 23;
                if ((this.field_Pb ^ -1) == 0) {
                  break L4;
                } else {
                  if (this.field_Rb[this.field_Pb] == null) {
                    break L4;
                  } else {
                    var7 = this.field_Rb[this.field_Pb].field_Tb;
                    var8 = this.field_Ib * (var7 + this.field_Pb) + this.field_ab;
                    L5: while (true) {
                      if (param2 >= var8) {
                        this.field_Rb[this.field_Pb].b(param0, param1, var8, this.field_Qb + param3, this.field_Vb[this.field_Pb].field_D, -6519);
                        return;
                      } else {
                        var8 = var8 - this.field_Ib;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            this.field_Vb[var7].a(this.field_Ib, param0, -30061, this.field_Qb, this.field_Vb[var7].field_ab, 0, param1);
            var7++;
            if (var9 == 0) {
              continue L1;
            } else {
              if ((this.field_Pb ^ -1) != 0) {
                if (this.field_Rb[this.field_Pb] != null) {
                  var7 = this.field_Rb[this.field_Pb].field_Tb;
                  var8 = this.field_Ib * (var7 + this.field_Pb) + this.field_ab;
                  L6: while (true) {
                    if (param2 < var8) {
                      var8 = var8 - this.field_Ib;
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        return;
                      }
                    } else {
                      this.field_Rb[this.field_Pb].b(param0, param1, var8, this.field_Qb + param3, this.field_Vb[this.field_Pb].field_D, -6519);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean d(byte param0) {
        int var2 = 0;
        nf[] var3 = null;
        int var4 = 0;
        nf var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = this.field_Vb;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3.length <= var4) {
                break L2;
              } else {
                var5 = var3[var4];
                stackOut_2_0 = var2;
                stackOut_2_1 = -1;
                stackOut_2_2 = var5.field_yb ^ -1;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_8_2 = stackOut_2_2;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (stackIn_3_1 == stackIn_3_2) {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L3;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L3;
                    }
                  }
                  var2 = stackIn_6_0 | stackIn_6_1;
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = 98;
            stackOut_7_1 = -22 - param0;
            stackOut_7_2 = 32;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            break L1;
          }
          var4 = stackIn_8_0 % (stackIn_8_1 / stackIn_8_2);
          if (var2 == 0) {
            if (0 != (this.field_Pb ^ -1)) {
              if (null == this.field_Rb[this.field_Pb]) {
                return var2 != 0;
              } else {
                L4: {
                  if (!this.field_Rb[this.field_Pb].d((byte) -58)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                var2 = stackIn_16_0;
                return var2 != 0;
              }
            } else {
              return var2 != 0;
            }
          } else {
            return var2 != 0;
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_48_0 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (85 != rs.field_q) {
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
        if (this.field_Ob == null) {
          L1: {
            if (null != this.field_Ob) {
              break L1;
            } else {
              if (this != qd.field_I) {
                break L1;
              } else {
                if (var4 != 0) {
                  e.a((byte) -101);
                  return true;
                } else {
                  var5 = ui.field_i;
                  if (!param0) {
                    L2: {
                      L3: {
                        if (var5 <= 0) {
                          break L3;
                        } else {
                          L4: {
                            if (var5 != et.field_a) {
                              break L4;
                            } else {
                              var5 = 63;
                              break L4;
                            }
                          }
                          var6 = 0;
                          L5: while (true) {
                            if (this.field_Kb.length <= var6) {
                              break L3;
                            } else {
                              stackOut_31_0 = var5;
                              stackIn_36_0 = stackOut_31_0;
                              stackIn_32_0 = stackOut_31_0;
                              if (var7 != 0) {
                                break L2;
                              } else {
                                if (stackIn_32_0 != this.field_Kb[var6]) {
                                  var6++;
                                  if (var7 == 0) {
                                    continue L5;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  this.a(param2, 23312, var6, param1);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_35_0 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      break L2;
                    }
                    return stackIn_36_0 != 0;
                  } else {
                    L6: {
                      L7: {
                        this.a(-72, (byte) -60, -60);
                        if (var5 <= 0) {
                          break L7;
                        } else {
                          L8: {
                            if (var5 != et.field_a) {
                              break L8;
                            } else {
                              var5 = 63;
                              break L8;
                            }
                          }
                          var6 = 0;
                          L9: while (true) {
                            if (this.field_Kb.length <= var6) {
                              break L7;
                            } else {
                              stackOut_19_0 = var5;
                              stackIn_24_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (var7 != 0) {
                                break L6;
                              } else {
                                if (stackIn_20_0 != this.field_Kb[var6]) {
                                  var6++;
                                  if (var7 == 0) {
                                    continue L9;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  this.a(param2, 23312, var6, param1);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L6;
                    }
                    return stackIn_24_0 != 0;
                  }
                }
              }
            }
          }
          var5 = ui.field_i;
          if (!param0) {
            L10: {
              L11: {
                if (var5 <= 0) {
                  break L11;
                } else {
                  L12: {
                    if (var5 != et.field_a) {
                      break L12;
                    } else {
                      var5 = 63;
                      break L12;
                    }
                  }
                  var6 = 0;
                  L13: while (true) {
                    if (this.field_Kb.length <= var6) {
                      break L11;
                    } else {
                      stackOut_55_0 = var5;
                      stackIn_60_0 = stackOut_55_0;
                      stackIn_56_0 = stackOut_55_0;
                      if (var7 != 0) {
                        break L10;
                      } else {
                        if (stackIn_56_0 != this.field_Kb[var6]) {
                          var6++;
                          if (var7 == 0) {
                            continue L13;
                          } else {
                            break L11;
                          }
                        } else {
                          this.a(param2, 23312, var6, param1);
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_59_0 = 0;
              stackIn_60_0 = stackOut_59_0;
              break L10;
            }
            return stackIn_60_0 != 0;
          } else {
            L14: {
              L15: {
                this.a(-72, (byte) -60, -60);
                if (var5 <= 0) {
                  break L15;
                } else {
                  L16: {
                    if (var5 != et.field_a) {
                      break L16;
                    } else {
                      var5 = 63;
                      break L16;
                    }
                  }
                  var6 = 0;
                  L17: while (true) {
                    if (this.field_Kb.length <= var6) {
                      break L15;
                    } else {
                      stackOut_44_0 = var5;
                      stackIn_49_0 = stackOut_44_0;
                      stackIn_45_0 = stackOut_44_0;
                      if (var7 != 0) {
                        break L14;
                      } else {
                        if (stackIn_45_0 != this.field_Kb[var6]) {
                          var6++;
                          if (var7 == 0) {
                            continue L17;
                          } else {
                            break L15;
                          }
                        } else {
                          this.a(param2, 23312, var6, param1);
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_48_0 = 0;
              stackIn_49_0 = stackOut_48_0;
              break L14;
            }
            return stackIn_49_0 != 0;
          }
        } else {
          if (var4 != 0) {
            if (-1 != this.field_Ob.field_Pb) {
              return this.field_Ob.a(false, param1, param2);
            } else {
              this.f((byte) -106);
              this.c(0, -125);
              return true;
            }
          } else {
            return this.field_Ob.a(false, param1, param2);
          }
        }
    }

    final void f(byte param0) {
        boolean discarded$5 = false;
        nf[] var2 = null;
        int var3 = 0;
        nf var4 = null;
        int var5 = 0;
        nf[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = this.field_Vb;
        var2 = var6;
        if (param0 == -106) {
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.field_yb = 0;
              var4.field_rb = false;
              var3++;
              if (var5 == 0) {
                continue L0;
              } else {
                this.field_Ob.d(param0 ^ 25);
                this.field_Pb = -1;
                this.field_Ob = null;
                this.c(12, -127);
                return;
              }
            } else {
              L1: {
                if (this.field_Ob != null) {
                  this.field_Ob.f((byte) -106);
                  this.field_Ob.d(param0 ^ 25);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_Pb = -1;
              this.field_Ob = null;
              this.c(12, -127);
              return;
            }
          }
        } else {
          discarded$5 = this.a(true, -115, -112);
          var3 = 0;
          L2: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.field_yb = 0;
              var4.field_rb = false;
              var3++;
              if (var5 != 0) {
                this.field_Ob.d(param0 ^ 25);
                this.field_Pb = -1;
                this.field_Ob = null;
                this.c(12, -127);
                return;
              } else {
                continue L2;
              }
            } else {
              L3: {
                if (this.field_Ob != null) {
                  this.field_Ob.f((byte) -106);
                  this.field_Ob.d(param0 ^ 25);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_Pb = -1;
              this.field_Ob = null;
              this.c(12, -127);
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 23312) {
            break L0;
          } else {
            this.a(-87, (byte) 117, -22);
            break L0;
          }
        }
        if (param2 != this.field_Pb) {
          if (null == this.field_Rb[param2]) {
            if (this.field_Ub[param2] != -1) {
              L1: {
                var5 = 32768 | this.field_Ub[param2];
                var6 = rs.field_t;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (null != vu.field_M) {
                    var6 = 1;
                    break L1;
                  } else {
                    if (-3 != (kp.a(var6, 114) ^ -1)) {
                      var8 = (String) null;
                      it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                      jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                      e.a((byte) -126);
                      wf.g(-20873);
                      return;
                    } else {
                      ud.b(1, false, var6, param3);
                      var8 = (String) null;
                      it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                      jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                      e.a((byte) -126);
                      wf.g(-20873);
                      return;
                    }
                  }
                }
              }
              if (-3 != (kp.a(var6, 114) ^ -1)) {
                var8 = (String) null;
                it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                e.a((byte) -126);
                wf.g(-20873);
                return;
              } else {
                ud.b(1, false, var6, param3);
                var8 = (String) null;
                it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                e.a((byte) -126);
                wf.g(-20873);
                return;
              }
            } else {
              gn.d(5);
              e.a((byte) -115);
              if (var7 != 0) {
                L2: {
                  var5 = 32768 | this.field_Ub[param2];
                  var6 = rs.field_t;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (null != vu.field_M) {
                      var6 = 1;
                      break L2;
                    } else {
                      L3: {
                        if (-3 != (kp.a(var6, 114) ^ -1)) {
                          var8 = (String) null;
                          it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                          jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                          e.a((byte) -126);
                          wf.g(-20873);
                          break L3;
                        } else {
                          ud.b(1, false, var6, param3);
                          var8 = (String) null;
                          it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                          jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                          e.a((byte) -126);
                          wf.g(-20873);
                          break L3;
                        }
                      }
                      return;
                    }
                  }
                }
                if (-3 != (kp.a(var6, 114) ^ -1)) {
                  var8 = (String) null;
                  it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                  jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                  e.a((byte) -126);
                  wf.g(-20873);
                  return;
                } else {
                  ud.b(1, false, var6, param3);
                  var8 = (String) null;
                  it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                  jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                  e.a((byte) -126);
                  wf.g(-20873);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.f((byte) -106);
            this.c(0, -124);
            this.field_Pb = param2;
            this.field_Ob = this.field_Rb[this.field_Pb];
            lw.a((byte) 79, this.field_Ob);
            this.field_Ob.c(12, 42);
            if (var7 != 0) {
              L4: {
                if (this.field_Ub[param2] != -1) {
                  break L4;
                } else {
                  gn.d(5);
                  e.a((byte) -115);
                  if (var7 != 0) {
                    break L4;
                  } else {
                    return;
                  }
                }
              }
              L5: {
                var5 = 32768 | this.field_Ub[param2];
                var6 = rs.field_t;
                if (var6 != 0) {
                  break L5;
                } else {
                  if (null != vu.field_M) {
                    var6 = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              if (-3 != (kp.a(var6, 114) ^ -1)) {
                var8 = (String) null;
                it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                e.a((byte) -126);
                wf.g(-20873);
                return;
              } else {
                ud.b(1, false, var6, param3);
                var8 = (String) null;
                it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                e.a((byte) -126);
                wf.g(-20873);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.f((byte) -106);
          this.c(0, -123);
          if (var7 != 0) {
            if (null != this.field_Rb[param2]) {
              this.f((byte) -106);
              this.c(0, -124);
              this.field_Pb = param2;
              this.field_Ob = this.field_Rb[this.field_Pb];
              lw.a((byte) 79, this.field_Ob);
              this.field_Ob.c(12, 42);
              if (var7 == 0) {
                return;
              } else {
                L6: {
                  if (this.field_Ub[param2] != -1) {
                    break L6;
                  } else {
                    gn.d(5);
                    e.a((byte) -115);
                    break L6;
                  }
                }
                L7: {
                  var5 = 32768 | this.field_Ub[param2];
                  var6 = rs.field_t;
                  if (var6 != 0) {
                    break L7;
                  } else {
                    if (null != vu.field_M) {
                      var6 = 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-3 != (kp.a(var6, 114) ^ -1)) {
                    var8 = (String) null;
                    it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                    jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                    e.a((byte) -126);
                    wf.g(-20873);
                    break L8;
                  } else {
                    ud.b(1, false, var6, param3);
                    var8 = (String) null;
                    it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                    jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                    e.a((byte) -126);
                    wf.g(-20873);
                    break L8;
                  }
                }
                return;
              }
            } else {
              L9: {
                L10: {
                  if (this.field_Ub[param2] != -1) {
                    break L10;
                  } else {
                    gn.d(5);
                    e.a((byte) -115);
                    if (var7 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  var5 = 32768 | this.field_Ub[param2];
                  var6 = rs.field_t;
                  if (var6 != 0) {
                    break L11;
                  } else {
                    if (null != vu.field_M) {
                      var6 = 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                if (-3 != (kp.a(var6, 114) ^ -1)) {
                  var8 = (String) null;
                  it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                  jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                  e.a((byte) -126);
                  wf.g(-20873);
                  break L9;
                } else {
                  ud.b(1, false, var6, param3);
                  var8 = (String) null;
                  it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
                  jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
                  e.a((byte) -126);
                  wf.g(-20873);
                  break L9;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          ac.field_k[0].b(param0, param4, param5, param1);
          var8 = 0;
          var9 = cq.field_u[param2];
          if ((var9 ^ -1) == -12) {
            var8 = 1;
            var9 = 7;
            break L0;
          } else {
            break L0;
          }
        }
        if (var9 != 0) {
          var10 = 53 % ((param6 - -10) / 62);
          if ((var9 ^ -1) == -8) {
            L1: {
              pv.field_b = var9;
              gt.field_i = var9;
              cs.field_Y = var9;
              np.field_Wb = var9;
              va.field_z = var9;
              rq.field_m = var9;
              j.field_b = var9;
              uf.field_e = var9;
              oh.field_E = var9;
              if ((param3 ^ -1) >= -1) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var11 = stackIn_10_0;
              if (param3 >= -1 + ks.field_y) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            var12 = stackIn_13_0;
            if (param7 > 0) {
              L3: {
                if (var11 != 0) {
                  np.field_Wb = cq.field_u[-1 + (param2 - ks.field_y)];
                  break L3;
                } else {
                  break L3;
                }
              }
              pv.field_b = cq.field_u[param2 + -ks.field_y];
              if (var12 == 0) {
                L4: {
                  if (var11 != 0) {
                    cs.field_Y = cq.field_u[param2 - 1];
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var12 != 0) {
                    uf.field_e = cq.field_u[1 + param2];
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var9 = var9 * 20;
                if (param7 < -1 + ef.field_c) {
                  if (var11 == 0) {
                    va.field_z = cq.field_u[param2 + ks.field_y];
                    if (var12 != 0) {
                      gt.field_i = cq.field_u[param2 - -ks.field_y - -1];
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                      ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                      ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                      ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                      if (cu.field_a) {
                        if (var8 == 0) {
                          if ((og.field_p[param2] - -param2 & 5) != 5) {
                            return;
                          } else {
                            nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                      ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                      ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                      ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                      if (cu.field_a) {
                        if (var8 == 0) {
                          if ((og.field_p[param2] - -param2 & 5) != 5) {
                            return;
                          } else {
                            nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    L6: {
                      oh.field_E = cq.field_u[-1 + param2 + ks.field_y];
                      va.field_z = cq.field_u[param2 + ks.field_y];
                      if (var12 != 0) {
                        gt.field_i = cq.field_u[param2 - -ks.field_y - -1];
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                    ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                    ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                    ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                    if (cu.field_a) {
                      if (var8 == 0) {
                        if ((og.field_p[param2] - -param2 & 5) == 5) {
                          nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                  ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                  ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                  ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                  if (cu.field_a) {
                    if (var8 == 0) {
                      if ((og.field_p[param2] - -param2 & 5) == 5) {
                        nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L7: {
                  rq.field_m = cq.field_u[-ks.field_y + (param2 - -1)];
                  if (var11 != 0) {
                    cs.field_Y = cq.field_u[param2 - 1];
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var12 != 0) {
                    uf.field_e = cq.field_u[1 + param2];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var9 = var9 * 20;
                  if (param7 < -1 + ef.field_c) {
                    L10: {
                      if (var11 == 0) {
                        break L10;
                      } else {
                        oh.field_E = cq.field_u[-1 + param2 + ks.field_y];
                        break L10;
                      }
                    }
                    va.field_z = cq.field_u[param2 + ks.field_y];
                    if (var12 != 0) {
                      gt.field_i = cq.field_u[param2 - -ks.field_y - -1];
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                if (cu.field_a) {
                  if (var8 == 0) {
                    if ((og.field_p[param2] - -param2 & 5) == 5) {
                      nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L11: {
                if (var11 != 0) {
                  cs.field_Y = cq.field_u[param2 - 1];
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var12 != 0) {
                  uf.field_e = cq.field_u[1 + param2];
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                var9 = var9 * 20;
                if (param7 < -1 + ef.field_c) {
                  L14: {
                    if (var11 == 0) {
                      break L14;
                    } else {
                      oh.field_E = cq.field_u[-1 + param2 + ks.field_y];
                      break L14;
                    }
                  }
                  va.field_z = cq.field_u[param2 + ks.field_y];
                  if (var12 != 0) {
                    gt.field_i = cq.field_u[param2 - -ks.field_y - -1];
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L15: {
                ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
                ac.field_k[var9 - (-1 + -ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
                ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
                ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
                if (!cu.field_a) {
                  break L15;
                } else {
                  if (var8 != 0) {
                    break L15;
                  } else {
                    if ((og.field_p[param2] - -param2 & 5) != 5) {
                      break L15;
                    } else {
                      nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
                      break L15;
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(je param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tg var8 = null;
        String var9 = null;
        wk var10 = null;
        tg var11 = null;
        String var12 = null;
        wk var13 = null;
        tg var14 = null;
        String var15 = null;
        wk var16 = null;
        tg var17 = null;
        String var18 = null;
        wk var19 = null;
        tg var20 = null;
        String var21 = null;
        wk var22 = null;
        tg var23 = null;
        String var24 = null;
        wk var25 = null;
        tg var26 = null;
        String var27 = null;
        wk var28 = null;
        tg var29 = null;
        String var30 = null;
        wk var31 = null;
        tg var32 = null;
        String var33 = null;
        wk var34 = null;
        tg var35 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ng.a((dn) null, param0, (int[]) null, (String) null, -1, 2, param1, (String) null, 0L);
            if (!param2) {
              L1: {
                if (0 == param1) {
                  var8 = tn.field_Z;
                  var10 = dh.field_n[0];
                  var28 = var10;
                  var28 = var10;
                  var9 = vl.field_o;
                  var8.field_i.a(false, var9, 11, var10);
                  var11 = tn.field_Z;
                  var13 = dh.field_n[1];
                  var28 = var13;
                  var28 = var13;
                  var12 = li.field_m;
                  var11.field_i.a(false, var12, 12, var13);
                  var14 = tn.field_Z;
                  var16 = dh.field_n[2];
                  var28 = var16;
                  var28 = var16;
                  var15 = ou.field_g;
                  var14.field_i.a(param2, var15, 13, var16);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-2 != (param1 ^ -1)) {
                  break L2;
                } else {
                  var17 = tn.field_Z;
                  var19 = dh.field_n[0];
                  var28 = var19;
                  var28 = var19;
                  var18 = vk.field_c;
                  var17.field_i.a(false, var18, 11, var19);
                  var20 = tn.field_Z;
                  var22 = dh.field_n[1];
                  var28 = var22;
                  var28 = var22;
                  var21 = fd.field_l;
                  var20.field_i.a(param2, var21, 12, var22);
                  var23 = tn.field_Z;
                  var25 = dh.field_n[2];
                  var28 = var25;
                  var28 = var25;
                  var24 = fa.field_c;
                  var23.field_i.a(false, var24, 13, var25);
                  break L2;
                }
              }
              L3: {
                if (-3 == (param1 ^ -1)) {
                  var26 = tn.field_Z;
                  var28 = dh.field_n[0];
                  var27 = ae.field_v;
                  var26.field_i.a(param2, var27, 11, var28);
                  var29 = tn.field_Z;
                  var31 = dh.field_n[1];
                  var30 = jj.field_e;
                  var29.field_i.a(param2, var30, 12, var31);
                  var32 = tn.field_Z;
                  var34 = dh.field_n[2];
                  var33 = ai.field_R;
                  var32.field_i.a(false, var33, 13, var34);
                  break L3;
                } else {
                  break L3;
                }
              }
              var35 = tn.field_Z;
              var4 = param0.field_V;
              var5 = param0.field_D;
              var6 = param0.field_gb;
              var7 = param0.field_ob;
              var35.field_i.a(var7, var5, var6, (byte) -118, var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("mq.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int e(byte param0) {
        int var2 = 6 / ((-76 - param0) / 46);
        return this.field_Qb - -(this.field_Ob == null ? 0 : this.field_Ob.e((byte) -124));
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 61 % ((-72 - param1) / 51);
        this.field_Yb = param0;
        var6 = 0;
        L0: while (true) {
          if (var6 < this.field_Tb) {
            var4 = this.field_Ib * var6;
            var5 = this.field_Yb * this.field_Yb;
            this.field_Vb[var6].field_ab = ((-var5 + 144) * var4 + (this.field_Zb - this.field_D) * var5) / 144;
            var6++;
            if (var7 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        mq var4 = null;
        nf var5 = null;
        int var6 = 0;
        mq var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        nf stackIn_7_0 = null;
        nf stackIn_8_0 = null;
        nf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        nf stackOut_6_0 = null;
        nf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        nf stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -42) {
          var4_int = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4_int >= this.field_Vb.length) {
                  break L2;
                } else {
                  var5 = this.field_Vb[var4_int];
                  stackOut_4_0 = -2;
                  stackOut_4_1 = var5.field_yb ^ -1;
                  stackIn_12_0 = stackOut_4_0;
                  stackIn_12_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0 != stackIn_5_1) {
                        break L3;
                      } else {
                        L4: {
                          this.a(param2, 23312, var4_int, param0);
                          stackOut_6_0 = (nf) (var5);
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (this.field_Pb != var4_int) {
                            stackOut_8_0 = (nf) ((Object) stackIn_8_0);
                            stackOut_8_1 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            stackOut_7_0 = (nf) ((Object) stackIn_7_0);
                            stackOut_7_1 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        stackIn_9_0.field_rb = stackIn_9_1 != 0;
                        break L3;
                      }
                    }
                    var4_int++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_11_0 = this.field_Pb;
              stackOut_11_1 = -1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L1;
            }
            if ((stackIn_12_0 ^ stackIn_12_1) != 0) {
              var7 = this.field_Rb[this.field_Pb];
              var4 = var7;
              if (var4 != null) {
                var7.a(param0, (byte) -42, param2);
                if (0 < this.field_Yb) {
                  this.c(this.field_Yb - 1, -126);
                  return;
                } else {
                  return;
                }
              } else {
                if (0 < this.field_Yb) {
                  this.c(this.field_Yb - 1, -126);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (0 < this.field_Yb) {
                this.c(this.field_Yb - 1, -126);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    mq(long param0, je param1, je param2, je param3, mq[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        ka var17 = null;
        ka var18 = null;
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
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_Pb = -1;
        try {
          L0: {
            this.field_Ub = param5;
            this.field_Rb = param4;
            this.field_Kb = param7;
            this.field_Tb = this.field_Ub.length;
            var17 = param3.field_Z;
            var18 = var17;
            this.field_Ib = var18.field_L + var18.field_H + 2;
            this.field_Sb = this.field_Ib * this.field_Tb;
            this.field_Jb = 0;
            this.field_Vb = new nf[this.field_Tb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_Tb <= var13) {
                    break L3;
                  } else {
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (-1 <= (this.field_Kb[var13] ^ -1)) {
                          break L4;
                        } else {
                          param6[var13] = var11 + db.a(true, this.field_Kb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (this.field_Rb[var13] != null) {
                            break L6;
                          } else {
                            if ((this.field_Ub[var13] ^ -1) != 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = s.field_c;
                        break L5;
                      }
                      L7: {
                        this.field_Vb[var13] = new nf(0L, param2, (je) null, param3, (wk) (var14), param6[var13]);
                        this.a(this.field_Vb[var13], 55);
                        var15 = var17.a(param6[var13]);
                        if (this.field_Jb >= var15) {
                          break L7;
                        } else {
                          this.field_Jb = var15;
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
                this.field_Jb = this.field_Jb + (10 + s.field_c.field_A);
                this.c(12, -8);
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
            stackOut_14_1 = new StringBuilder().append("mq.<init>(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    static {
        field_Nb = "Please enter your date of birth to enable chat:";
        field_Xb = 0;
        field_Lb = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_Mb = "<%0> has been defeated";
        field_Wb = 3;
    }
}
