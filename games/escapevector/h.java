/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends bj implements rj, qb {
    private boolean field_K;
    private hc field_N;
    private boolean field_M;
    static String field_O;
    private boolean field_P;
    private ul field_L;
    private ul field_J;
    private hc field_G;
    private String field_H;
    private hc field_I;

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (this.field_G == param0) {
                this.a((byte) 103);
                break L1;
              } else {
                if (this.field_N == param0) {
                  fe.a((byte) -83);
                  break L1;
                } else {
                  if (this.field_I == param0) {
                    if (!this.field_K) {
                      if (this.field_P) {
                        qe.a(true);
                        break L1;
                      } else {
                        ta.m(2);
                        break L1;
                      }
                    } else {
                      fh.b(-54);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3 == 1) {
                break L2;
              } else {
                this.field_H = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("h.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != this.field_H) {
            sb.field_a.a(this.field_H, 20 + (this.field_k + param3), this.field_j + (param0 + 15), -40 + this.field_g, this.field_x, 16777215, -1, 1, 0, sb.field_a.field_r);
        }
        if (null != this.field_N) {
            em.e(10 + param3, 134 + param0, this.field_g - 20, 4210752);
        }
        if (param1 < 85) {
            this.field_H = (String) null;
        }
        super.a(param0, (byte) 87, param2, param3);
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        ul var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 60)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param2 ^ -1) == -99) {
                stackIn_7_0 = this.a((byte) 22, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 != 99) {
                  L1: {
                    if (param3 > 0) {
                      break L1;
                    } else {
                      var6 = (ul) null;
                      this.a((ul) null, -39);
                      break L1;
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(param0, true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("h.G(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    public final void a(boolean param0, ul param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == this.field_L) {
                this.field_J.a(-4659, (hm) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_J != param1) {
                break L2;
              } else {
                this.a((byte) 100);
                break L2;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_H = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("h.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(mf param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        ia var5 = null;
        int[] var6 = null;
        int var7 = 0;
        c var8 = null;
        int var9 = 0;
        c var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var8 = new c(param0.a(-4, "", "logo.fo3d"));
              var10 = var8;
              var3 = var10.e(0);
              var10.l(-17928);
              tj.field_y = hg.a(var10, 22178);
              fh.field_e = new ia[var3];
              jg.field_c = new int[var3][];
              if (param1 >= 41) {
                break L1;
              } else {
                h.a(82, (byte) -78);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var3 <= var4) {
                var10.o(-3879);
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = fh.field_e[var9];
                    var5.a(6, 1, 6, 6, -72);
                    var5.a((byte) 49);
                    var6 = new int[]{var5.field_b - -var5.field_a >> -1524691999, var5.field_R + var5.field_i >> 931046849, var5.field_O + var5.field_g >> -223174815};
                    jg.field_c[var9] = var6;
                    var5.a(-var6[2], 0, -var6[0], -var6[1]);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                fh.field_e[var4] = wk.a(-127, var8);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("h.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final String j(int param0) {
        hc var3;
        L0: {
          if (param0 == 35) {
            break L0;
          } else {
            var3 = (hc) null;
            this.a((hc) null, 35, 44, 83, 31);
            break L0;
          }
        }
        if (null == this.field_L.field_l) {
          return "";
        } else {
          return this.field_L.field_l;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = ua.field_c.a(29386, param0);
        if (param1 != 121) {
            field_O = (String) null;
        }
        int var3 = je.a(false, param0);
        if (var2 >= var3) {
            var2 = 0;
        } else {
            if (!(var2 != 0)) {
                var2 = hn.field_l.field_s;
            }
        }
        return var2;
    }

    public final void a(ul param0, int param1) {
        try {
            if (param1 != 0) {
                this.field_J = (ul) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "h.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        if (param0 >= -127) {
            this.field_N = (hc) null;
        }
        this.field_L.h((byte) -29);
        this.field_J.h((byte) -29);
    }

    private final void a(byte param0) {
        ul var3;
        L0: {
          if (param0 > 88) {
            break L0;
          } else {
            var3 = (ul) null;
            this.a(true, (ul) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (gm.b(8192)) {
              break L2;
            } else {
              if ((this.field_L.field_l.length() ^ -1) >= -1) {
                break L1;
              } else {
                if (-1 <= (this.field_J.field_l.length() ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          mi.a(0, this.field_J.field_l, this.field_L.field_l);
          break L1;
        }
    }

    h(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (db) null);
        ki dupTemp$0 = null;
        ki dupTemp$1 = null;
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
        hc stackIn_18_1 = null;
        hc stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        hc stackIn_19_1 = null;
        hc stackIn_19_2 = null;
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
        ck var6 = null;
        RuntimeException var6_ref = null;
        wl var7 = null;
        String var8 = null;
        ee var9 = null;
        ki var12 = null;
        ki var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param4) {
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
              ((h) (this)).field_P = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param3) {
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
              ((h) (this)).field_M = stackIn_7_1 != 0;
              this.field_H = param1;
              stackIn_9_0 = this;

              if (!param2) {
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
              ((h) (this)).field_K = stackIn_10_1 != 0;
              if (!this.field_K) {
                break L4;
              } else {
                L5: {
                  if (this.field_M) {
                    break L5;
                  } else {
                    if (!this.field_P) {
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
              this.field_L = (ul) ((Object) new gd(param0, (wn) (this), 100));
              this.field_J = (ul) ((Object) new gd("", (wn) (this), 20));
              if (!this.field_K) {
                L7: {
                  this.field_G = new hc(ta.field_g, (wn) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (this.field_P) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = cj.field_c;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = li.field_O;
                    break L7;
                  }
                }
                ((h) (this)).field_I = new hc(stackIn_19_3, (wn) null);
                if (!this.field_M) {
                  break L6;
                } else {
                  this.field_N = new hc(pc.field_g, (wn) (this));
                  break L6;
                }
              } else {
                this.field_G = new hc(sh.field_s, (wn) null);
                this.field_I = new hc(d.field_d, (wn) null);
                this.field_L.field_y = false;
                break L6;
              }
            }
            L8: {
              this.field_L.field_s = (db) ((Object) new re(10000536));
              this.field_J.field_s = (db) ((Object) new un(10000536));
              var6 = new ck();
              this.field_G.field_s = (db) ((Object) var6);
              if (this.field_I == null) {
                break L8;
              } else {
                this.field_I.field_s = (db) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (null == this.field_N) {
                break L9;
              } else {
                this.field_N.field_s = (db) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_L.field_i = cd.field_u;
              if (this.field_N == null) {
                break L10;
              } else {
                this.field_N.field_i = mm.field_c;
                break L10;
              }
            }
            L11: {
              if (!this.field_K) {
                if (!this.field_P) {
                  this.field_I.field_s = (db) ((Object) new ha());
                  break L11;
                } else {
                  this.field_I.field_i = lf.field_G;
                  this.field_I.field_s = (db) ((Object) new ha());
                  break L11;
                }
              } else {
                this.field_I.field_i = gd.field_Z;
                break L11;
              }
            }
            L12: {
              this.field_j = 15;
              var7 = sb.field_a;
              if (null == this.field_H) {
                break L12;
              } else {
                this.field_j = this.field_j + (var7.b(this.field_H, -40 + this.field_g, var7.field_r) + 5);
                break L12;
              }
            }
            L13: {
              var8 = lh.field_b;
              var9 = sh.a((byte) -1, oc.d((byte) -107));
              if (var9 == kf.field_q) {
                var8 = kg.field_b;
                break L13;
              } else {
                if (var9 != oh.field_n) {
                  break L13;
                } else {
                  var8 = wi.field_c;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new ki(10, this.field_j, -20 + this.field_g, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b(dupTemp$0, false);
              this.field_j = this.field_j + (((hm) ((Object) var12)).field_x + 5);
              dupTemp$1 = new ki(10, this.field_j, this.field_g + -20, 25, this.field_J, false, 80, 3, var7, 16777215, qc.field_vb);
              var13 = dupTemp$1;
              this.b(dupTemp$1, false);
              this.field_j = this.field_j + (((hm) ((Object) var13)).field_x - -5);
              this.field_G.field_q = (wn) (this);
              if (this.field_N == null) {
                break L14;
              } else {
                this.field_N.field_q = (wn) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_I) {
                break L15;
              } else {
                this.field_I.field_q = (wn) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_N == null) {
                this.field_G.a(-10 + (-6 + this.field_g), this.field_j, 8, true, 30);
                this.field_j = this.field_j + 35;
                break L16;
              } else {
                this.field_G.a(-95 + this.field_g, this.field_j, 85, true, 30);
                this.field_j = this.field_j + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_N == null) {
                break L17;
              } else {
                this.field_N.a(this.field_g - 6 + -10, this.field_j, 8, true, 30);
                this.field_j = this.field_j + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_I) {
                break L18;
              } else {
                L19: {
                  if (this.field_K) {
                    break L19;
                  } else {
                    if (!this.field_P) {
                      this.field_I.a(40, this.field_j, 8, true, 20);
                      this.field_j = this.field_j + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_I.a(-6 + (this.field_g + -10), this.field_j, 8, true, 30);
                this.field_j = this.field_j + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_g, 0, 0, true, 3 + this.field_j);
              this.b(this.field_G, false);
              if (this.field_N == null) {
                break L20;
              } else {
                this.b(this.field_N, false);
                break L20;
              }
            }
            L21: {
              if (null == this.field_I) {
                break L21;
              } else {
                this.b(this.field_I, false);
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

            stackIn_59_1 = new StringBuilder().append("h.<init>(");

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
          throw t.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 <= 94) {
            field_O = (String) null;
        }
        field_O = null;
    }

    final void a(String param0, byte param1) {
        ul var3 = null;
        String var4 = null;
        if (param1 <= 105) {
            return;
        }
        try {
            var3 = this.field_L;
            var4 = param0;
            var3.a(var4, false, -33);
            this.field_J.h((byte) -29);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "h.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_O = "Rewatch last briefing";
    }
}
