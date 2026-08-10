/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends br {
    static String field_j;
    private int field_r;
    static String field_q;
    private boolean field_k;
    static int field_s;
    static String field_f;
    private int field_o;
    private th field_l;
    private int field_p;
    private ge field_t;
    private int field_i;
    private rl field_m;
    static ea field_h;
    static String[] field_n;
    private boolean field_g;

    final static void a(int param0, double param1, int param2, int param3, double param4) {
        th discarded$0 = null;
        L0: {
          L1: {
            if (od.field_Db != 0) {
              break L1;
            } else {
              if (-1 <= (param2 ^ -1)) {
                break L1;
              } else {
                he.field_k = new th();
                break L0;
              }
            }
          }
          if (0 == param2) {
            he.field_k = null;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            od.field_Db = param2;
            la.field_n = param1;
            if (param3 != ab.field_o) {
              break L3;
            } else {
              if ((param0 ^ -1) < -1) {
                discarded$0 = new th();
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (-1 != (param0 ^ -1)) {
            break L2;
          } else {
            break L2;
          }
        }
        si.field_C = param4;
        ab.field_o = param0;
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ri var9 = null;
        jm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.d((byte) 69);
              var3 = param1.d((byte) 69);
              var4 = param1.d((byte) 69);
              var5 = param1.d((byte) 69);
              if (param0 == 20399) {
                break L1;
              } else {
                var9 = (ri) null;
                nk.a(-34, (int[]) null, (ri) null);
                break L1;
              }
            }
            var6 = param1.d((byte) 69);
            var7 = param1.d((byte) 69);
            var8 = param1.d((byte) 69);
            stackIn_3_0 = td.a(var5, var2_int, var4, (byte) 125, var8, var6, var7, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("nk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (ae) ((Object) stackIn_3_0);
    }

    nk(ge param0, int param1, int param2, boolean param3) {
        this(param0.field_A, param1, param2, param3);
        try {
            this.field_t = param0;
            this.field_l.a(this.field_t, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ri a(int param0, int[] param1, ri param2) {
        ri var3 = null;
        RuntimeException var3_ref = null;
        ri stackIn_2_0 = null;
        ri stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new ri(0, 0, 0);
            var3.field_b = param2.field_b;
            var3.field_f = param2.field_f;
            var3.field_m = param2.field_m;
            var3.field_h = param2.field_h;
            if (param0 >= 84) {
              var3.field_j = param2.field_j;
              var3.field_a = param2.field_a;
              var3.field_e = param2.field_e;
              var3.field_l = param1;
              stackIn_4_0 = (ri) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ri) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("nk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static ja a(ja param0, int param1, int param2, int param3) {
        ja stackIn_14_0 = null;
        ja stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            g.c(vb.field_b);
            oo.b();
            param0.g(3, 3);
            var10 = oo.field_i;
            var9 = var10;
            var4 = var9;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var10.length) {
                g.d();
                if (param2 == 255) {
                  stackIn_16_0 = vb.field_b;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_14_0 = (ja) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var6 = var10[var5];
                  if (0 != var6) {
                    if (0 != (65535 & var6)) {
                      if (-1 == (16711935 & var6 ^ -1)) {
                        var7 = var6 >> 246071752;
                        var4[var5] = cr.b(tq.b(16711696, var7 * tq.b(255, param1 >> 158125584) << 638653192), cr.b(tq.b(255, param1) * var7 >> -2043701208, tq.b(tq.b(param1 >> -706115832, 255) * var7, 65280)));
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var7 = var6 >> -1932291568;
                      var4[var5] = cr.b(tq.b(1107361536, var7 * tq.b(255, param3 >> -1166418768)) << 1310836744, cr.b(var7 * tq.b(255, param3) >> -1094131736, tq.b(65280, var7 * (tq.b(65362, param3) >> 707409480))));
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("nk.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static ja[] a(int param0, byte param1) {
        int var2 = -119 / ((43 - param1) / 47);
        ja[] var3 = new ja[9];
        var3[4] = k.a(-111, 64, param0);
        return var3;
    }

    final void a(int param0) {
        int var2;
        br var3;
        br var4;
        ek var5;
        int var6;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_p = this.field_p + 6;
          if (this.field_r < this.field_p) {
            L1: {
              if (this.field_k) {
                this.field_m.field_b.field_i.a((byte) 122);
                this.field_m.field_b.a(48);
                break L1;
              } else {
                break L1;
              }
            }
            this.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          var2 = this.field_p * this.field_p;
          if (param0 >= 91) {
            break L2;
          } else {
            nk.a((byte) -1);
            break L2;
          }
        }
        var3 = this.field_l.c(49);
        L3: while (true) {
          if (!(var3 instanceof ha)) {
            return;
          } else {
            L4: {
              var4 = var3.field_d;
              if (((ha) ((Object) var3)).field_f >= var2) {
                break L4;
              } else {
                var3.a(true);
                var5 = ((ha) ((Object) var3)).field_m;
                if (!(var5 instanceof ge)) {
                  if (!(var5 instanceof lm)) {
                    break L4;
                  } else {
                    if (!this.field_g) {
                      ((lm) ((Object) var5)).a(800, true);
                      break L4;
                    } else {
                      ((lm) ((Object) var5)).c(false);
                      break L4;
                    }
                  }
                } else {
                  L5: {
                    if (var5 == this.field_t) {
                      break L5;
                    } else {
                      if (!this.field_g) {
                        ((ge) ((Object) var5)).d(400, -118);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((ge) ((Object) var5)).m((byte) 42);
                  this.field_t = null;
                  break L4;
                }
              }
            }
            var3 = var4;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_n = null;
        field_q = null;
        field_h = null;
        int var1 = -54 / ((21 - param0) / 40);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawnMulti.field_E ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (param2 & 16712141) >> -2136508688;
        int var5 = param2 >> 428695592 & 255;
        int var6 = 255 & param2;
        int var7 = (16766674 & param0) >> 1216394416;
        if (param1 != 455739624) {
            ri var13 = (ri) null;
            nk.a(-88, (int[]) null, (ri) null);
        }
        int var8 = param0 >> -1040362296 & 255;
        int var9 = 255 & param0;
        for (var10 = 0; 256 > var10; var10++) {
            var11 = -var10 + 256;
            var14[var10] = (var6 * var10 >> -765718936) - (-(var9 * var11 >> 114843944) - (((var10 * var4 >> -1760534520) - -(var11 * var7 >> -2124228216) << 587744304) - -((var8 * var11 >> 53549288) + (var10 * var5 >> -1051937112) << 455739624)));
        }
        return var3;
    }

    nk(rl param0, int param1, int param2, boolean param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        br var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        this.field_k = false;
        try {
          L0: {
            L1: {
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
              ((nk) (this)).field_g = stackIn_4_1 != 0;
              this.field_m = param0;
              stackIn_6_0 = this;

              if (!this.field_g) {
                stackIn_7_0 = this;
                stackIn_7_1 = 180;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 90;
                break L2;
              }
            }
            L3: {
              ((nk) (this)).field_r = stackIn_7_1;
              if (this.field_m.field_b.a(-128, param2, param1)) {
                break L3;
              } else {
                param2 = param2 - (param2 % 24 + -4);
                break L3;
              }
            }
            this.field_p = 0;
            this.field_i = param2;
            this.field_o = param1;
            this.field_l = new th();
            var5_int = this.field_r * this.field_r;
            var6 = this.field_m.field_u.c(76);
            L4: while (true) {
              if (!(var6 instanceof ek)) {
                break L0;
              } else {
                L5: {
                  L6: {
                    L7: {
                      if (!(var6 instanceof ge)) {
                        break L7;
                      } else {
                        if (9 != ((ge) ((Object) var6)).field_Q) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var6 instanceof fd) {
                      break L6;
                    } else {
                      if (!(var6 instanceof lm)) {
                        break L5;
                      } else {
                        if (((lm) ((Object) var6)).field_Q == 2) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    var7 = ((ek) ((Object) var6)).e((byte) -112);
                    var8 = ((ek) ((Object) var6)).g(1829947600);
                    var9 = this.field_o + -var7;
                    var10 = -var8 + this.field_i;
                    var11 = var10 * var10 + var9 * var9;
                    if (var11 >= var5_int) {
                      stackIn_19_0 = 0;
                      break L8;
                    } else {
                      stackIn_19_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var12 = stackIn_19_0;
                    if (!(var6 instanceof fd)) {
                      L10: {
                        stackIn_29_0 = var12;

                        if (this.field_m.field_b.a(var8, -34, var7, this.field_i, this.field_o) == -1) {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = 0;
                          break L10;
                        } else {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = 1;
                          break L10;
                        }
                      }
                      var12 = stackIn_30_0 & stackIn_30_1;
                      break L9;
                    } else {
                      L11: {
                        L12: {
                          stackIn_24_0 = var12;

                          if (-1 != this.field_m.field_b.a(-24 + (-24 + (var8 - 2)), 98, var7, this.field_i, this.field_o)) {
                            break L12;
                          } else {

                            if (0 != (this.field_m.field_b.a(-48 + var8 + -2, -58, var7 + 24, this.field_i, this.field_o) ^ -1)) {
                              break L12;
                            } else {

                              if (-1 != this.field_m.field_b.a(var8 + 2, -124, var7, this.field_i, this.field_o)) {
                                break L12;
                              } else {

                                if (0 == (this.field_m.field_b.a(2 + var8, 107, 24 + var7, this.field_i, this.field_o) ^ -1)) {
                                  stackIn_26_0 = stackIn_24_0;
                                  stackIn_26_1 = 0;
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        stackIn_26_0 = stackIn_24_0;
                        stackIn_26_1 = 1;
                        break L11;
                      }
                      var12 = stackIn_26_0 & stackIn_26_1;
                      break L9;
                    }
                  }
                  if (var12 == 0) {
                    break L5;
                  } else {
                    L13: {
                      if (!(var6 instanceof ge)) {
                        break L13;
                      } else {
                        var13 = (ge) ((Object) var6);
                        if (!this.field_m.field_m.b(0, var13.field_gb)) {
                          break L13;
                        } else {
                          this.field_m.a((byte) -100, var13);
                          break L5;
                        }
                      }
                    }
                    this.field_l.a(new ha((ek) ((Object) var6), var11), false);
                    break L5;
                  }
                }
                var6 = var6.field_d;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var5);

            stackIn_40_1 = new StringBuilder().append("nk.<init>(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_j = "Remove <%0> from friend list";
        field_q = "Orb points: ";
        field_f = "Learn to organise them.";
    }
}
