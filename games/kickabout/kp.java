/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_j;
    int[][][] field_e;
    static String[] field_g;
    int field_k;
    int field_b;
    static ut field_m;
    static String field_i;
    boolean field_d;
    int[] field_c;
    int field_o;
    int field_n;
    static String field_a;
    int field_l;
    int field_f;
    int field_h;

    final static void a(int param0, int param1) {
        gn var2 = null;
        int var3 = 0;
        ii var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var4 = (ii) ((Object) il.field_a.g(24009));
            L1: while (true) {
              if (var4 == null) {
                var2 = ap.field_j.g(24009);
                L2: while (true) {
                  if (var2 == null) {
                    L3: {
                      if (param1 <= -36) {
                        break L3;
                      } else {
                        field_g = (String[]) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    lb.a((byte) -105, param0);
                    var2 = ap.field_j.c(33);
                    continue L2;
                  }
                }
              } else {
                te.a(param0, var4, (byte) -112);
                var4 = (ii) ((Object) il.field_a.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "kp.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        he var1 = null;
        qb var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1 = (he) ((Object) rp.field_B.g(24009));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (qb) ((Object) kq.field_yb.g(24009));
                L2: while (true) {
                  if (var1_ref == null) {
                    var1 = (he) ((Object) lw.field_d.g(24009));
                    L3: while (true) {
                      if (var1 == null) {
                        var2 = -47 / ((39 - param0) / 42);
                        break L0;
                      } else {
                        L4: {
                          if (var1.field_Jb <= 0) {
                            break L4;
                          } else {
                            var1.field_Jb = var1.field_Jb - 1;
                            if (var1.field_Jb != 0) {
                              break L4;
                            } else {
                              var1.field_Mb = 0;
                              if (var1.h(-13356)) {
                                var1.c((byte) -109);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var1 = (he) ((Object) lw.field_d.c(33));
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (0 >= var1_ref.field_Db) {
                        break L5;
                      } else {
                        var1_ref.field_Db = var1_ref.field_Db - 1;
                        if (-1 == (var1_ref.field_Db ^ -1)) {
                          var1_ref.field_Ab = 0;
                          if (!var1_ref.b(-7)) {
                            break L5;
                          } else {
                            var1_ref.c((byte) -109);
                            break L5;
                          }
                        } else {
                          var1_ref = (qb) ((Object) kq.field_yb.c(33));
                          continue L2;
                        }
                      }
                    }
                    var1_ref = (qb) ((Object) kq.field_yb.c(33));
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var1.field_Jb > 0) {
                    var1.field_Jb = var1.field_Jb - 1;
                    if (var1.field_Jb != 0) {
                      break L6;
                    } else {
                      var1.field_Mb = 0;
                      if (var1.h(-13356)) {
                        var1.c((byte) -109);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var1 = (he) ((Object) rp.field_B.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref2), "kp.D(" + param0 + ')');
        }
    }

    final void a(byte param0, ml param1) {
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -96) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            this.field_c = new int[2];
            var3_int = 0;
            L2: while (true) {
              if (-3 >= (var3_int ^ -1)) {
                L3: {
                  stackIn_8_0 = this;

                  if ((param1.h((byte) -111) ^ -1) != -2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  ((kp) (this)).field_d = stackIn_9_1 != 0;
                  this.field_f = param1.j((byte) -123);
                  this.field_j = param1.h((byte) -126);
                  this.field_b = param1.h((byte) -125);
                  if (5 != this.field_f) {
                    break L4;
                  } else {
                    this.field_o = param1.j((byte) -96);
                    this.field_k = param1.j((byte) -104);
                    break L4;
                  }
                }
                L5: {
                  if (this.field_f != 4) {
                    break L5;
                  } else {
                    this.field_h = param1.a((byte) 81) - 1;
                    this.field_n = param1.h((byte) -112);
                    this.field_l = param1.h((byte) -111);
                    var3_int = 0;
                    L6: while (true) {
                      if (-3 >= (var3_int ^ -1)) {
                        break L5;
                      } else {
                        var4 = 0;
                        L7: while (true) {
                          if ((var4 ^ -1) <= -6) {
                            var3_int++;
                            continue L6;
                          } else {
                            this.field_e[var3_int][var4][0] = param1.h((byte) -110);
                            this.field_e[var3_int][var4][1] = param1.h((byte) -121);
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                this.field_c[var3_int] = param1.j((byte) -94);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("kp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void a(boolean param0, kp param1) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        try {
          L0: {
            this.field_k = param1.field_k;
            this.field_o = param1.field_o;
            this.field_b = param1.field_b;
            this.field_f = param1.field_f;
            this.field_h = param1.field_h;
            this.field_j = param1.field_j;
            this.field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              if (this.field_c.length <= var3_int) {
                L2: {
                  this.field_d = param1.field_d;
                  var3_int = param1.field_n << -766846832;
                  var4 = param1.field_l << -836098800;
                  var5 = -this.field_n + var3_int;
                  var6 = -this.field_l + var4;
                  var7 = var5 >> -800829212;
                  if ((Math.abs(var5 >> 1486323248) ^ -1) <= -51) {
                    this.field_n = var3_int;
                    break L2;
                  } else {
                    this.field_n = this.field_n + var7;
                    break L2;
                  }
                }
                L3: {
                  var8 = var6 >> -873848028;
                  if (Math.abs(var6 >> 1036560) >= 50) {
                    this.field_l = var4;
                    break L3;
                  } else {
                    this.field_l = this.field_l + var8;
                    break L3;
                  }
                }
                var9 = 0;
                L4: while (true) {
                  if ((var9 ^ -1) <= -3) {
                    L5: {
                      if (!param0) {
                        break L5;
                      } else {
                        this.field_e = (int[][][]) null;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 5) {
                        var9++;
                        continue L4;
                      } else {
                        L7: {
                          var4 = param1.field_e[var9][var10][1] << -43722096;
                          var3_int = param1.field_e[var9][var10][0] << -699557392;
                          var5 = var3_int + -this.field_e[var9][var10][0];
                          var6 = -this.field_e[var9][var10][1] + var4;
                          var8 = var6 >> -1468886972;
                          var7 = var5 >> -367751868;
                          if (20 > Math.abs(var5 >> -529776592)) {
                            dupTemp$0 = this.field_e[var9][var10];
                            dupTemp$0[0] = dupTemp$0[0] + var7;
                            break L7;
                          } else {
                            this.field_e[var9][var10][0] = var3_int;
                            break L7;
                          }
                        }
                        L8: {
                          if ((Math.abs(var6 >> 765474544) ^ -1) <= -21) {
                            this.field_e[var9][var10][1] = var4;
                            break L8;
                          } else {
                            dupTemp$1 = this.field_e[var9][var10];
                            dupTemp$1[1] = dupTemp$1[1] + var8;
                            break L8;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                this.field_c[var3_int] = param1.field_c[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("kp.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 101) {
            field_m = (ut) null;
        }
        field_a = null;
        field_g = null;
        field_m = null;
        field_i = null;
    }

    final void b(boolean param0, kp param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            this.field_o = param1.field_o;
            this.field_k = param1.field_k;
            this.field_h = param1.field_h;
            this.field_f = param1.field_f;
            this.field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              if (this.field_c.length <= var3_int) {
                this.field_l = param1.field_l << 1262215216;
                this.field_n = param1.field_n << 146440368;
                this.field_d = param1.field_d;
                var3_int = 0;
                L2: while (true) {
                  if (2 <= var3_int) {
                    this.field_b = param1.field_b;
                    if (!param0) {
                      this.field_j = param1.field_j;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var4 = 0;
                    L3: while (true) {
                      if (-6 >= (var4 ^ -1)) {
                        var3_int++;
                        continue L2;
                      } else {
                        this.field_e[var3_int][var4][0] = param1.field_e[var3_int][var4][0] << -2112674864;
                        this.field_e[var3_int][var4][1] = param1.field_e[var3_int][var4][1] << 932081776;
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                this.field_c[var3_int] = param1.field_c[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("kp.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public kp() {
        this.field_e = new int[2][5][2];
        this.field_c = new int[]{-1, -1};
        this.field_j = 0;
        this.field_o = -2;
        this.field_k = -1;
        this.field_b = 0;
        this.field_n = lj.a(448, false);
        this.field_l = lj.a(672, false);
        this.field_f = -1;
        this.field_h = -1;
    }

    static {
        field_a = "Waiting for other players.";
        field_i = "(1 player wants to join)";
    }
}
