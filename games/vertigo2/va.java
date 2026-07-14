/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va implements ur, qa {
    int field_d;
    private boolean field_q;
    int field_n;
    static java.applet.Applet field_o;
    private int field_g;
    int field_m;
    int field_a;
    static int[] field_b;
    static wn field_s;
    static cr field_f;
    int field_e;
    int field_p;
    static String field_r;
    static cr field_h;
    int field_i;
    int field_j;
    int field_c;
    int field_k;
    cc field_l;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        if (!wq.field_H) {
          return;
        } else {
          L0: {
            bi.b(40, 40, 560, 400, 1, 164);
            bi.e(40, 40, 560, 400, 16777215);
            var1 = 16;
            var2 = 60;
            var3 = 60;
            if (param0 > 14) {
              tk.field_c.b("Press 'H' to close this screen", var3, var2, 16777215, -1);
              var2 = var2 + var1;
              var4 = var2;
              var5 = 0;
              break L0;
            } else {
              field_o = null;
              tk.field_c.b("Press 'H' to close this screen", var3, var2, 16777215, -1);
              var2 = var2 + var1;
              var4 = var2;
              var5 = 0;
              break L0;
            }
          }
          L1: while (true) {
            if (al.field_A.length <= var5) {
              return;
            } else {
              L2: {
                var7_int = al.field_x[var5];
                if (var7_int == -3) {
                  var6 = al.field_A[var5] + "+ALT";
                  break L2;
                } else {
                  if (-2 != var7_int) {
                    if ((var7_int ^ -1) == -4) {
                      var6 = al.field_A[var5] + "+CTRL+ALT";
                      break L2;
                    } else {
                      if (var7_int != 0) {
                        var6 = null;
                        break L2;
                      } else {
                        var6_ref = al.field_A[var5];
                        break L2;
                      }
                    }
                  } else {
                    var6 = al.field_A[var5] + "+CTRL";
                    break L2;
                  }
                }
              }
              L3: {
                var9 = var5 / 12;
                var10 = var5 - var9 * 12;
                var11 = 0;
                if (-1 >= (-7 + var10 ^ -1)) {
                  var12 = -7 + (var10 - -(5 * var9));
                  if (-1 <= var12) {
                    if (wa.field_h.length > var12) {
                      var7 = wa.field_h[var12];
                      var8 = 14517504;
                      break L3;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var12 = 7 * var9 + var10;
                  if (jl.field_a.length > var12) {
                    var7 = jl.field_a[var12];
                    var8 = 39168;
                    if (-1 != (1 << var12 & mb.field_s)) {
                      var11 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L4: {
                if (var11 != 0) {
                  bi.b(-10 + var3, var2 + -10, 50, 20 - -var1, var8, 120);
                  break L4;
                } else {
                  bi.b(var3 + -10, -10 + var2, 50, 20 + var1, var8);
                  break L4;
                }
              }
              int discarded$2 = tk.field_c.a(var6, var3 - 10, -10 + var2, 50, 20 + var1, 16777215, 5592405, 1, 1, 0);
              int discarded$3 = tk.field_c.a(var7, -10 + (var3 + 60), var2 + -10, 140, var1 + 20, 16777215, -1, 0, 1, 0);
              var2 = var2 + (24 + var1);
              if ((var2 ^ -1) < -421) {
                var2 = var4;
                // wide iinc 3 220
                var5++;
                continue L1;
              } else {
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 19207) {
            return -94;
        }
        int var3 = 1;
        while (1 < param1) {
            if (-1 != (1 & param1 ^ -1)) {
                var3 = var3 * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
        }
        if (!(1 != param1)) {
            return var3 * param2;
        }
        return var3;
    }

    final static void a(int param0, byte param1) {
        if (param1 < 118) {
            va.a(0);
            sl.field_w = 1000000000L / (long)param0;
            return;
        }
        sl.field_w = 1000000000L / (long)param0;
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -81) {
          if ((hn.field_w ^ -1) <= -11) {
            if (sq.field_c) {
              return false;
            } else {
              L0: {
                if (oe.q(95)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_s = null;
          if ((hn.field_w ^ -1) <= -11) {
            if (sq.field_c) {
              return false;
            } else {
              L1: {
                if (oe.q(95)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public final int a(iq param0, int param1) {
        ro discarded$9 = ((va) this).b(param0, param1 + 102);
        if (param1 != -1) {
          ((va) this).field_k = -38;
          return param0.field_r.b((byte) 116) - -((va) this).field_k + ((va) this).field_c;
        } else {
          return param0.field_r.b((byte) 116) - -((va) this).field_k + ((va) this).field_c;
        }
    }

    public final int a(iq param0, int param1, int param2) {
        if (param1 != 1) {
            return 57;
        }
        return this.a(param2, (byte) 110, 0, param0);
    }

    private final int a(int param0, byte param1, iq param2, int param3) {
        if (param1 != -94) {
          return 123;
        } else {
          return param3 + (param2.field_u + (param2.field_o + param0 + ((va) this).field_i));
        }
    }

    public void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        if (!param2) {
            ((va) this).field_k = 26;
            if (!(((va) this).field_l != null)) {
                return;
            }
            this.a(0, param1, param4, param3);
            return;
        }
        if (!(((va) this).field_l != null)) {
            return;
        }
        this.a(0, param1, param4, param3);
    }

    public final int b(iq param0, int param1, int param2) {
        if (param2 != -14323) {
            return -38;
        }
        return this.a(param1, (byte) -94, param0, 0);
    }

    public final int a(iq param0, byte param1) {
        ro discarded$7 = ((va) this).b(param0, 46);
        if (param1 <= 98) {
          ((va) this).field_m = -99;
          return param0.field_r.a(8783) - -((va) this).field_i - -((va) this).field_j;
        } else {
          return param0.field_r.a(8783) - -((va) this).field_i - -((va) this).field_j;
        }
    }

    private final int c(iq param0, int param1) {
        if (param1 != 0) {
          field_f = null;
          return -((va) this).field_c + -((va) this).field_k + param0.field_s;
        } else {
          return -((va) this).field_c + -((va) this).field_k + param0.field_s;
        }
    }

    private final int a(int param0, byte param1, int param2, iq param3) {
        if (param1 != 110) {
          int discarded$2 = ((va) this).a((byte) -120);
          return param0 - (-param3.field_t + (-((va) this).field_k - param3.field_y) - param2);
        } else {
          return param0 - (-param3.field_t + (-((va) this).field_k - param3.field_y) - param2);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, iq param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        jb.a(param0 - -param5.field_t, param5.field_n + (param5.field_o + param3), param5.field_o + param3, -30486, param5.field_s + param5.field_t + param0);
        var9 = ((va) this).a(-1, param5);
        var10 = this.c(param5, 0);
        if (!((va) this).field_q) {
          var12 = ((va) this).field_d;
          if (var12 == -1) {
            var11 = ((va) this).field_l.field_z;
            L0: {
              var12 = ((va) this).field_m;
              if (-1 == (var12 ^ -1)) {
                break L0;
              } else {
                if (var12 == 3) {
                  break L0;
                } else {
                  if (1 != var12) {
                    if (2 == var12) {
                      ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                      ln.d(-28558);
                      if (param4 > 64) {
                        return;
                      } else {
                        ((va) this).field_i = -47;
                        return;
                      }
                    } else {
                      ln.d(-28558);
                      if (param4 <= 64) {
                        ((va) this).field_i = -47;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9 >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                    ln.d(-28558);
                    if (param4 > 64) {
                      return;
                    } else {
                      ((va) this).field_i = -47;
                      return;
                    }
                  }
                }
              }
            }
            ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
            ln.d(-28558);
            if (param4 > 64) {
              return;
            } else {
              ((va) this).field_i = -47;
              return;
            }
          } else {
            if (2 != var12) {
              if (-4 != var12) {
                if ((var12 ^ -1) == -2) {
                  var11 = (-((va) this).field_l.field_z + var10 - ((va) this).field_l.field_M >> -1962907647) + ((va) this).field_l.field_z;
                  var12 = ((va) this).field_m;
                  if (-1 != (var12 ^ -1)) {
                    if (var12 != 3) {
                      if (1 != var12) {
                        if (2 == var12) {
                          L1: {
                            ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                            ln.d(-28558);
                            if (param4 > 64) {
                              break L1;
                            } else {
                              ((va) this).field_i = -47;
                              break L1;
                            }
                          }
                          return;
                        } else {
                          L2: {
                            ln.d(-28558);
                            if (param4 > 64) {
                              break L2;
                            } else {
                              ((va) this).field_i = -47;
                              break L2;
                            }
                          }
                          return;
                        }
                      } else {
                        L3: {
                          ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9 >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                          ln.d(-28558);
                          if (param4 > 64) {
                            break L3;
                          } else {
                            ((va) this).field_i = -47;
                            break L3;
                          }
                        }
                        return;
                      }
                    } else {
                      L4: {
                        ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                        ln.d(-28558);
                        if (param4 > 64) {
                          break L4;
                        } else {
                          ((va) this).field_i = -47;
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L5: {
                      ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                      ln.d(-28558);
                      if (param4 > 64) {
                        break L5;
                      } else {
                        ((va) this).field_i = -47;
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L6: {
                    var11 = (-((va) this).field_l.field_z + var10 - ((va) this).field_l.field_M >> -1962907647) + ((va) this).field_l.field_z;
                    var12 = ((va) this).field_m;
                    if (-1 == (var12 ^ -1)) {
                      break L6;
                    } else {
                      if (var12 == 3) {
                        break L6;
                      } else {
                        if (1 != var12) {
                          if (2 == var12) {
                            ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                            ln.d(-28558);
                            if (param4 <= 64) {
                              ((va) this).field_i = -47;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ln.d(-28558);
                            if (param4 <= 64) {
                              ((va) this).field_i = -47;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9 >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                          ln.d(-28558);
                          if (param4 <= 64) {
                            ((va) this).field_i = -47;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                  ln.d(-28558);
                  if (param4 <= 64) {
                    ((va) this).field_i = -47;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var11 = (-((va) this).field_l.field_z + var10 - ((va) this).field_l.field_M >> -1962907647) + ((va) this).field_l.field_z;
                var12 = ((va) this).field_m;
                if (-1 != (var12 ^ -1)) {
                  if (var12 != 3) {
                    if (1 != var12) {
                      if (2 != var12) {
                        L7: {
                          ln.d(-28558);
                          if (param4 > 64) {
                            break L7;
                          } else {
                            ((va) this).field_i = -47;
                            break L7;
                          }
                        }
                        return;
                      } else {
                        L8: {
                          ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                          ln.d(-28558);
                          if (param4 > 64) {
                            break L8;
                          } else {
                            ((va) this).field_i = -47;
                            break L8;
                          }
                        }
                        return;
                      }
                    } else {
                      L9: {
                        ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9 >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                        ln.d(-28558);
                        if (param4 > 64) {
                          break L9;
                        } else {
                          ((va) this).field_i = -47;
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                      ln.d(-28558);
                      if (param4 > 64) {
                        break L10;
                      } else {
                        ((va) this).field_i = -47;
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                    ln.d(-28558);
                    if (param4 > 64) {
                      break L11;
                    } else {
                      ((va) this).field_i = -47;
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              L12: {
                L13: {
                  var11 = var10 - ((va) this).field_l.field_M;
                  var12 = ((va) this).field_m;
                  if (-1 == (var12 ^ -1)) {
                    break L13;
                  } else {
                    if (var12 == 3) {
                      break L13;
                    } else {
                      if (1 != var12) {
                        if (2 == var12) {
                          L14: {
                            ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                            ln.d(-28558);
                            if (param4 > 64) {
                              break L14;
                            } else {
                              ((va) this).field_i = -47;
                              break L14;
                            }
                          }
                          return;
                        } else {
                          break L12;
                        }
                      } else {
                        ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9 >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                        break L12;
                      }
                    }
                  }
                }
                ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                break L12;
              }
              ln.d(-28558);
              if (param4 > 64) {
                return;
              } else {
                ((va) this).field_i = -47;
                return;
              }
            }
          }
        } else {
          int discarded$1 = ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5), var9, var10, param6, param1, ((va) this).field_m, ((va) this).field_d, ((va) this).field_n);
          ln.d(-28558);
          if (param4 > 64) {
            return;
          } else {
            ((va) this).field_i = -47;
            return;
          }
        }
    }

    public final void a(int param0, int param1, int param2, iq param3, int param4) {
        int var7 = 0;
        lq var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ro var13 = null;
        ro var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        if (param0 > -81) {
          return;
        } else {
          L0: {
            if (!param3.f(48)) {
              break L0;
            } else {
              L1: {
                var13 = ((va) this).b(param3, 80);
                var14 = var13;
                var7 = var14.a(param1, 22413);
                var8 = var13.field_c[var7];
                var9 = var14.b(param1, -61);
                var10 = this.a(param2, (byte) -94, param3, var9);
                var11 = ((va) this).a(param3, 1, param4) + Math.max(0, var8.field_f);
                stackOut_2_0 = ((va) this).a(param3, 1, param4);
                stackOut_2_1 = this.c(param3, 0);
                stackOut_2_2 = var8.field_d;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                if (var14.field_c.length <= 1 + var7) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = var8.field_d;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = stackIn_3_2;
                  stackOut_3_3 = var13.field_c[1 + var7].field_f;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  break L1;
                }
              }
              var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
              jb.a(param3.field_t + param4, param3.field_o + param2 + param3.field_n, param2 - -param3.field_o, -30486, param4 + (param3.field_t + param3.field_s));
              eb.field_c.a(var10, var12, ((va) this).field_p, var10, var11, 105);
              ln.d(-28558);
              break L0;
            }
          }
          return;
        }
    }

    public final int a(int param0, int param1, int param2, int param3, iq param4, int param5) {
        ro discarded$7 = ((va) this).b(param4, 33);
        if (param2 <= 21) {
          return 114;
        } else {
          return param4.field_r.a(param5 - ((va) this).a(param4, 1, param1), (byte) 42, param0 - ((va) this).b(param4, param3, -14323));
        }
    }

    private final void a(int param0, int param1, int param2, iq param3) {
        this.a(param2, ((va) this).field_g, 0, param1, 65, param3, ((va) this).field_e, param0);
    }

    private final void a(boolean param0, iq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (null == param1.field_r) {
            param1.field_r = (ro) (Object) new sl();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((va) this).a(-1, param1);
          var4 = this.c(param1, 0);
          var6 = ((va) this).field_d;
          if (var6 == 0) {
            var5 = ((va) this).field_l.field_z;
            break L1;
          } else {
            if (var6 == 2) {
              var5 = var4 - ((va) this).field_l.field_M;
              break L1;
            } else {
              L2: {
                if (-4 != (var6 ^ -1)) {
                  if ((var6 ^ -1) == -2) {
                    break L2;
                  } else {
                    L3: {
                      var5 = (var4 - (((va) this).field_l.field_z - -((va) this).field_l.field_M) >> -304752639) + ((va) this).field_l.field_z;
                      if (!param0) {
                        break L3;
                      } else {
                        field_o = null;
                        break L3;
                      }
                    }
                    var6 = ((va) this).field_m;
                    if (var6 != 0) {
                      if ((var6 ^ -1) != -4) {
                        if (var6 == 1) {
                          if (!(param1.field_r instanceof sl)) {
                            return;
                          } else {
                            ((sl) (Object) param1.field_r).a(var5, ((va) this).field_l, ((va) this).a((byte) -90, param1), -12558, var3 >> 379657217);
                            return;
                          }
                        } else {
                          if (2 == var6) {
                            if (param1.field_r instanceof sl) {
                              ((sl) (Object) param1.field_r).a(var3, (byte) 94, ((va) this).field_l, var5, ((va) this).a((byte) -90, param1));
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        L4: {
                          if (param1.field_r instanceof sl) {
                            ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!(param1.field_r instanceof sl)) {
                        return;
                      } else {
                        ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
                        return;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              var5 = (var4 - (((va) this).field_l.field_z - -((va) this).field_l.field_M) >> -304752639) + ((va) this).field_l.field_z;
              break L1;
            }
          }
        }
        if (param0) {
          field_o = null;
          var6 = ((va) this).field_m;
          if (var6 != 0) {
            if ((var6 ^ -1) != -4) {
              if (var6 == 1) {
                if (param1.field_r instanceof sl) {
                  ((sl) (Object) param1.field_r).a(var5, ((va) this).field_l, ((va) this).a((byte) -90, param1), -12558, var3 >> 379657217);
                  return;
                } else {
                  return;
                }
              } else {
                L5: {
                  if (2 != var6) {
                    break L5;
                  } else {
                    if (!(param1.field_r instanceof sl)) {
                      break L5;
                    } else {
                      ((sl) (Object) param1.field_r).a(var3, (byte) 94, ((va) this).field_l, var5, ((va) this).a((byte) -90, param1));
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              if (param1.field_r instanceof sl) {
                ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1.field_r instanceof sl) {
              ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
              return;
            } else {
              return;
            }
          }
        } else {
          var6 = ((va) this).field_m;
          if (var6 != 0) {
            if ((var6 ^ -1) != -4) {
              if (var6 == 1) {
                if (!(param1.field_r instanceof sl)) {
                  return;
                } else {
                  ((sl) (Object) param1.field_r).a(var5, ((va) this).field_l, ((va) this).a((byte) -90, param1), -12558, var3 >> 379657217);
                  return;
                }
              } else {
                if (2 == var6) {
                  if (!(param1.field_r instanceof sl)) {
                    return;
                  } else {
                    ((sl) (Object) param1.field_r).a(var3, (byte) 94, ((va) this).field_l, var5, ((va) this).a((byte) -90, param1));
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (!(param1.field_r instanceof sl)) {
                return;
              } else {
                ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
                return;
              }
            }
          } else {
            if (!(param1.field_r instanceof sl)) {
              return;
            } else {
              ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
              return;
            }
          }
        }
    }

    final void a(int param0, va param1) {
        param1.field_g = ((va) this).field_g;
        param1.field_d = ((va) this).field_d;
        param1.field_n = ((va) this).field_n;
        param1.field_p = ((va) this).field_p;
        param1.field_l = ((va) this).field_l;
        param1.field_i = ((va) this).field_i;
        if (param0 != 16777215) {
          ((va) this).field_e = 14;
          param1.field_c = ((va) this).field_c;
          param1.field_j = ((va) this).field_j;
          param1.field_a = ((va) this).field_a;
          param1.field_q = ((va) this).field_q;
          param1.field_e = ((va) this).field_e;
          param1.field_m = ((va) this).field_m;
          param1.field_k = ((va) this).field_k;
          return;
        } else {
          param1.field_c = ((va) this).field_c;
          param1.field_j = ((va) this).field_j;
          param1.field_a = ((va) this).field_a;
          param1.field_q = ((va) this).field_q;
          param1.field_e = ((va) this).field_e;
          param1.field_m = ((va) this).field_m;
          param1.field_k = ((va) this).field_k;
          return;
        }
    }

    public final int a(byte param0) {
        Object var3 = null;
        if (param0 != -91) {
          var3 = null;
          int discarded$2 = ((va) this).a((iq) null, (byte) 64);
          return ((va) this).field_l.field_M + ((va) this).field_l.field_z;
        } else {
          return ((va) this).field_l.field_M + ((va) this).field_l.field_z;
        }
    }

    public final int a(int param0, iq param1) {
        if (param0 != -1) {
          ((va) this).field_p = 47;
          return -((va) this).field_j + param1.field_n + -((va) this).field_i;
        } else {
          return -((va) this).field_j + param1.field_n + -((va) this).field_i;
        }
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(iq param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ro var17 = null;
        ro var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var16 = Vertigo2.field_L ? 1 : 0;
        if (param1 == param3) {
          return;
        } else {
          L0: {
            if (param0.f(24)) {
              L1: {
                var17 = ((va) this).b(param0, 122);
                var18 = var17;
                if (param3 < param1) {
                  var9 = param1;
                  var8 = param3;
                  break L1;
                } else {
                  var8 = param1;
                  var9 = param3;
                  break L1;
                }
              }
              var10 = var18.a(var8, 22413);
              var11 = var18.a(var9, 22413);
              jb.a(param0.field_t + param4, param0.field_n + param0.field_o + param5, param0.field_o + param5, -30486, param0.field_s + (param4 - -param0.field_t));
              var12 = var10;
              L2: while (true) {
                if (var11 < var12) {
                  ln.d(-28558);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_c[var12];
                    if (var12 != var10) {
                      stackOut_12_0 = var13.field_c[0];
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var18.b(var8, -28);
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_13_0;
                    if (var12 != var11) {
                      if (var13 == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = var13.field_c[var13.field_c.length - 1];
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      }
                    } else {
                      stackOut_14_0 = var18.b(var9, 126);
                      stackIn_18_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  var15 = stackIn_18_0;
                  eb.field_c.a(var13.field_d, (byte) -101, param4 + param0.field_t + (((va) this).field_k + param0.field_y) - -var13.field_f, ((va) this).field_a, ((va) this).field_a >>> 1465910872, this.a(param5, (byte) -94, param0, var14), var15 - var14);
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          if (param2) {
            ((va) this).field_n = -106;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_r = null;
        field_o = null;
        if (param0 != 60) {
            return;
        }
        field_s = null;
        field_f = null;
    }

    String a(byte param0, iq param1) {
        if (param0 != -90) {
            int discarded$0 = va.a(-117, 22, 99);
            return param1.field_w;
        }
        return param1.field_w;
    }

    public final ro b(iq param0, int param1) {
        L0: {
          if (param0.field_r == null) {
            param0.field_r = (ro) (Object) new sl();
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= 4) {
          if (((va) this).field_q) {
            ((sl) (Object) param0.field_r).a(((va) this).field_d, ((va) this).a((byte) -90, param0), 1, ((va) this).field_l, ((va) this).field_m, this.c(param0, 0), ((va) this).a(-1, param0), ((va) this).field_n);
            return param0.field_r;
          } else {
            this.a(false, param0);
            return param0.field_r;
          }
        } else {
          ((va) this).field_p = -35;
          if (((va) this).field_q) {
            ((sl) (Object) param0.field_r).a(((va) this).field_d, ((va) this).a((byte) -90, param0), 1, ((va) this).field_l, ((va) this).field_m, this.c(param0, 0), ((va) this).a(-1, param0), ((va) this).field_n);
            return param0.field_r;
          } else {
            this.a(false, param0);
            return param0.field_r;
          }
        }
    }

    protected va() {
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((va) this).field_g = param6;
        ((va) this).field_a = param11;
        ((va) this).field_q = param12 ? true : false;
        ((va) this).field_j = param2;
        ((va) this).field_d = param8;
        ((va) this).field_c = param4;
        ((va) this).field_k = param3;
        ((va) this).field_i = param1;
        ((va) this).field_e = param5;
        ((va) this).field_m = param7;
        ((va) this).field_n = param9;
        ((va) this).field_l = param0;
        ((va) this).field_p = param10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<%0> cannot join; the game is full.";
        field_b = null;
    }
}
