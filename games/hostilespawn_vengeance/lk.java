/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends vd implements cd, qk {
    private boolean field_J;
    static int[] field_M;
    private ph field_P;
    static nd field_N;
    private boolean field_G;
    private ph field_R;
    private ig field_O;
    private String field_I;
    static String[] field_E;
    private boolean field_Q;
    static int field_H;
    private ph field_K;
    private ig field_L;

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != this.field_I) {
            jd.field_s.a(this.field_I, 20 + param1 + this.field_v, 15 + (this.field_m + param0), -40 + this.field_s, this.field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        }
        if (param2 <= 42) {
            lk.j(21);
        }
        if (!(this.field_P == null)) {
            si.a(param1 + 10, 134 + param0, -20 + this.field_s, 4210752);
        }
        super.a(param0, param1, (byte) 123, param3);
    }

    final void a(boolean param0) {
        if (param0) {
            this.field_J = false;
        }
        this.field_O.o(-128);
        this.field_L.o(-124);
    }

    private final void e(byte param0) {
        int var2;
        L0: {
          L1: {
            if (gi.b((byte) -86)) {
              break L1;
            } else {
              if ((this.field_O.field_n.length() ^ -1) >= -1) {
                break L0;
              } else {
                if ((this.field_L.field_n.length() ^ -1) < -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          r.a(this.field_O.field_n, this.field_L.field_n, -125);
          break L0;
        }
        var2 = -47 / ((29 - param0) / 34);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 14 / ((-63 - param4) / 52);
              if (this.field_K == param3) {
                this.e((byte) 124);
                break L1;
              } else {
                if (param3 != this.field_P) {
                  if (param3 != this.field_R) {
                    break L1;
                  } else {
                    if (this.field_G) {
                      ki.a(-1);
                      break L1;
                    } else {
                      if (!this.field_J) {
                        vc.a((byte) -1);
                        break L1;
                      } else {
                        mn.a((byte) -126);
                        break L1;
                      }
                    }
                  }
                } else {
                  gb.d(126);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("lk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    public final void a(ig param0, byte param1) {
        try {
            int var3_int = 116 / ((-76 - param1) / 41);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "lk.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ig param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = -31 % ((0 - param1) / 41);
              if (param0 == this.field_O) {
                this.field_L.a((byte) -47, (ag) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_L) {
                this.e((byte) -72);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lk.T(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        if (param0 != 27219) {
            lk.l(-62);
        }
        field_M = null;
        field_N = null;
        field_E = null;
    }

    final static void l(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = mn.field_a;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              if (param0 >= 71) {
                break L1;
              } else {
                lk.j(68);
                break L1;
              }
            }
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var1[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var1[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var1[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var1[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var1[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var1[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var1[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var1[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "lk.O(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, vm param3, int param4, int param5, int param6, int param7, int param8, int param9, bd[] param10, bd[] param11, bd[] param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, vm param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              se.a(param20, param2, param3, new vh(param11), param6, param8, new vh(param12), param13, param1, param9, param18, param0, param19, param14, param5, param15 ^ 4686, new vh(param10), param17, param7, param16, param4);
              if (param15 == 7662) {
                break L1;
              } else {
                field_N = (nd) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var21);

            stackIn_5_1 = new StringBuilder().append("lk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');

            if (param20 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ')');
        }
    }

    final void a(String param0, int param1) {
        ig var3 = this.field_O;
        String var4 = param0;
        if (param1 != 10000536) {
            return;
        }
        try {
            var3.a((byte) 118, false, var4);
            this.field_L.o(param1 ^ -10000616);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "lk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param2) {
                stackIn_7_0 = this.a(param1, (byte) -21);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) == -100) {
                  stackIn_11_0 = this.b((byte) -126, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lk.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final String k(int param0) {
        if (null == this.field_O.field_n) {
            return "";
        }
        if (param0 != 80) {
            return (String) null;
        }
        return this.field_O.field_n;
    }

    lk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nn) null);
        nh dupTemp$0 = null;
        nh dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        ph stackIn_18_1 = null;
        ph stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ph stackIn_19_1 = null;
        ph stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ke var6 = null;
        RuntimeException var6_ref = null;
        vm var7 = null;
        String var8 = null;
        fa var9 = null;
        nh var12 = null;
        nh var13 = null;
        try {
          L0: {
            L1: {
              this.field_I = param1;
              stackIn_3_0 = this;

              if (!param3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((lk) (this)).field_Q = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param2) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((lk) (this)).field_G = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param4) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((lk) (this)).field_J = stackIn_10_1 != 0;
              if (!this.field_G) {
                break L4;
              } else {
                L5: {
                  if (this.field_Q) {
                    break L5;
                  } else {
                    if (!this.field_J) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_O = (ig) ((Object) new sf(param0, (mh) (this), 100));
              this.field_L = (ig) ((Object) new sf("", (mh) (this), 20));
              if (!this.field_G) {
                L7: {
                  this.field_K = new ph(cb.field_b, (mh) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (this.field_J) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = ej.field_n;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = hg.field_d;
                    break L7;
                  }
                }
                ((lk) (this)).field_R = new ph(stackIn_19_3, (mh) null);
                if (!this.field_Q) {
                  break L6;
                } else {
                  this.field_P = new ph(kc.field_f, (mh) (this));
                  break L6;
                }
              } else {
                this.field_K = new ph(hf.field_f, (mh) null);
                this.field_R = new ph(sc.field_k, (mh) null);
                this.field_O.field_D = false;
                break L6;
              }
            }
            L8: {
              this.field_O.field_h = (nn) ((Object) new sd(10000536));
              this.field_L.field_h = (nn) ((Object) new km(10000536));
              var6 = new ke();
              this.field_K.field_h = (nn) ((Object) var6);
              if (null == this.field_R) {
                break L8;
              } else {
                this.field_R.field_h = (nn) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_O.field_i = qj.field_n;
              if (null == this.field_P) {
                break L9;
              } else {
                this.field_P.field_h = (nn) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_P) {
                break L10;
              } else {
                this.field_P.field_i = e.field_x;
                break L10;
              }
            }
            L11: {
              if (!this.field_G) {
                if (this.field_J) {
                  this.field_R.field_i = hk.field_l;
                  this.field_R.field_h = (nn) ((Object) new ti());
                  break L11;
                } else {
                  this.field_R.field_h = (nn) ((Object) new ti());
                  break L11;
                }
              } else {
                this.field_R.field_i = qg.field_s;
                break L11;
              }
            }
            L12: {
              this.field_m = 15;
              var7 = jd.field_s;
              if (this.field_I == null) {
                break L12;
              } else {
                this.field_m = this.field_m + (var7.b(this.field_I, -40 + this.field_s, var7.field_y) + 5);
                break L12;
              }
            }
            L13: {
              var8 = jg.field_b;
              var9 = qj.a(bn.c(-1), (byte) -116);
              if (ub.field_b != var9) {
                if (var9 != wh.field_c) {
                  break L13;
                } else {
                  var8 = dg.field_nb;
                  break L13;
                }
              } else {
                var8 = dk.field_k;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new nh(10, this.field_m, this.field_s + -20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a(51448, dupTemp$0);
              this.field_m = this.field_m + (((ag) ((Object) var12)).field_x - -5);
              dupTemp$1 = new nh(10, this.field_m, -20 + this.field_s, 25, this.field_L, false, 80, 3, var7, 16777215, qh.field_x);
              var13 = dupTemp$1;
              this.a(51448, dupTemp$1);
              this.field_m = this.field_m + (((ag) ((Object) var13)).field_x - -5);
              this.field_K.field_p = (mh) (this);
              if (null == this.field_P) {
                break L14;
              } else {
                this.field_P.field_p = (mh) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_R) {
                break L15;
              } else {
                this.field_R.field_p = (mh) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_P) {
                this.field_K.a(-10 + this.field_s - 6, this.field_m, 0, 8, 30);
                this.field_m = this.field_m + 35;
                break L16;
              } else {
                this.field_K.a(this.field_s - 95, this.field_m, 0, 85, 30);
                this.field_m = this.field_m + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_P == null) {
                break L17;
              } else {
                this.field_P.a(-6 + this.field_s + -10, this.field_m, 0, 8, 30);
                this.field_m = this.field_m + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_R) {
                break L18;
              } else {
                L19: {
                  if (this.field_G) {
                    break L19;
                  } else {
                    if (!this.field_J) {
                      this.field_R.a(40, this.field_m, 0, 8, 20);
                      this.field_m = this.field_m + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_R.a(-6 + this.field_s + -10, this.field_m, 0, 8, 30);
                this.field_m = this.field_m + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_s, 0, 0, 0, this.field_m + 3);
              this.a(51448, this.field_K);
              if (this.field_P == null) {
                break L20;
              } else {
                this.a(51448, this.field_P);
                break L20;
              }
            }
            L21: {
              if (null == this.field_R) {
                break L21;
              } else {
                this.a(51448, this.field_R);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("lk.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = new int[8192];
        field_E = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_H = 0;
        field_N = new nd(6, 0, 4, 2);
    }
}
