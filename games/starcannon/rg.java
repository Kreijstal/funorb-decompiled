/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends vk implements si, ga {
    private boolean field_A;
    private dk field_C;
    static String field_E;
    private boolean field_H;
    static String field_K;
    private String field_J;
    private dk field_F;
    private fe field_I;
    static int field_D;
    static int field_B;
    private fe field_G;
    private dk field_y;
    private boolean field_z;

    final static hl[] i(int param0) {
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = StarCannon.field_A;
        hl[] var1 = new hl[bj.field_b];
        for (var2 = 0; bj.field_b > var2; var2++) {
            var3 = gh.field_C[var2] * gg.field_d[var2];
            var10 = og.field_c[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = of.field_g[w.a(255, (int) var10[var6])];
            }
            var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var11);
        }
        var2 = 57 / ((47 - param0) / 46);
        rc.b((byte) -82);
        return var1;
    }

    final String j(int param0) {
        if (!(this.field_I.field_k != null)) {
            return "";
        }
        if (param0 != 190) {
            field_E = (String) null;
        }
        return this.field_I.field_k;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(this.field_J == null)) {
            nb.field_c.a(this.field_J, 20 + param1 + this.field_s, 15 + (param3 - -this.field_j), this.field_i + -40, this.field_f, 16777215, -1, 1, 0, nb.field_c.field_p);
        }
        if (this.field_y != null) {
            ki.b(10 + param1, param3 + 134, -20 + this.field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void k(int param0) {
        field_K = null;
        if (param0 > -94) {
            return;
        }
        field_E = null;
    }

    public final void a(int param0, fe param1) {
        RuntimeException runtimeException = null;
        uj var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -4312) {
                break L1;
              } else {
                var4 = (uj) null;
                this.a((uj) null, 'ﾠ', (byte) 81, -62);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rg.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    rg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (de) null);
        ad dupTemp$0 = null;
        ad dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        dk stackIn_17_1 = null;
        dk stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        dk stackIn_18_1 = null;
        dk stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        gb var6 = null;
        RuntimeException var6_ref = null;
        qe var7 = null;
        String var8 = null;
        mj var9 = null;
        ad var11 = null;
        ad var12 = null;
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
              ((rg) (this)).field_H = stackIn_4_1 != 0;
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
              ((rg) (this)).field_z = stackIn_7_1 != 0;
              this.field_J = param1;
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
              ((rg) (this)).field_A = stackIn_10_1 != 0;
              if (!this.field_z) {
                break L4;
              } else {
                L5: {
                  if (this.field_H) {
                    break L5;
                  } else {
                    if (!this.field_A) {
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
              this.field_I = (fe) ((Object) new ng(param0, (qg) (this), 100));
              this.field_G = (fe) ((Object) new ng("", (qg) (this), 20));
              if (this.field_z) {
                this.field_C = new dk(ma.field_g, (qg) null);
                this.field_F = new dk(bg.field_b, (qg) null);
                this.field_I.field_u = false;
                break L6;
              } else {
                L7: {
                  this.field_C = new dk(s.field_l, (qg) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (this.field_A) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = (String) (field_E);
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = dk.field_t;
                    break L7;
                  }
                }
                ((rg) (this)).field_F = new dk(stackIn_18_3, (qg) null);
                if (!this.field_H) {
                  break L6;
                } else {
                  this.field_y = new dk(qj.field_V, (qg) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_I.field_o = (de) ((Object) new fh(10000536));
              this.field_G.field_o = (de) ((Object) new sh(10000536));
              var6 = new gb();
              this.field_C.field_o = (de) ((Object) var6);
              if (this.field_F == null) {
                break L8;
              } else {
                this.field_F.field_o = (de) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_I.field_p = ne.field_a;
              if (null == this.field_y) {
                break L9;
              } else {
                this.field_y.field_o = (de) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_y) {
                break L10;
              } else {
                this.field_y.field_p = wj.field_f;
                break L10;
              }
            }
            L11: {
              if (this.field_z) {
                this.field_F.field_p = qd.field_B;
                break L11;
              } else {
                if (!this.field_A) {
                  this.field_F.field_o = (de) ((Object) new wa());
                  break L11;
                } else {
                  this.field_F.field_p = ej.field_t;
                  this.field_F.field_o = (de) ((Object) new wa());
                  break L11;
                }
              }
            }
            L12: {
              this.field_j = 15;
              var7 = nb.field_c;
              if (null == this.field_J) {
                break L12;
              } else {
                this.field_j = this.field_j + (var7.a(this.field_J, -40 + this.field_i, var7.field_p) - -5);
                break L12;
              }
            }
            L13: {
              var8 = pf.field_b;
              var9 = kl.a(ll.b(95), (byte) 84);
              if (var9 != p.field_a) {
                if (bh.field_b != var9) {
                  break L13;
                } else {
                  var8 = rc.field_c;
                  break L13;
                }
              } else {
                var8 = v.field_a;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new ad(10, this.field_j, -20 + this.field_i, 25, this.field_I, false, 80, 3, var7, 16777215, var8);
              var11 = dupTemp$0;
              this.a(true, dupTemp$0);
              this.field_j = this.field_j + (((uj) ((Object) var11)).field_f + 5);
              dupTemp$1 = new ad(10, this.field_j, -20 + this.field_i, 25, this.field_G, false, 80, 3, var7, 16777215, tj.field_y);
              var12 = dupTemp$1;
              this.a(true, dupTemp$1);
              this.field_C.field_g = (qg) (this);
              this.field_j = this.field_j + (5 + ((uj) ((Object) var12)).field_f);
              if (null == this.field_y) {
                break L14;
              } else {
                this.field_y.field_g = (qg) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_F) {
                break L15;
              } else {
                this.field_F.field_g = (qg) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_y != null) {
                this.field_C.a(85, this.field_i - 95, (byte) 121, 30, this.field_j);
                this.field_j = this.field_j + 60;
                break L16;
              } else {
                this.field_C.a(8, -10 + this.field_i - 6, (byte) 118, 30, this.field_j);
                this.field_j = this.field_j + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_y) {
                break L17;
              } else {
                this.field_y.a(8, this.field_i + -6 + -10, (byte) 117, 30, this.field_j);
                this.field_j = this.field_j + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_F == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_z) {
                    break L19;
                  } else {
                    if (this.field_A) {
                      break L19;
                    } else {
                      this.field_F.a(8, 40, (byte) 120, 20, this.field_j);
                      this.field_j = this.field_j + 25;
                      break L18;
                    }
                  }
                }
                this.field_F.a(8, -6 + this.field_i + -10, (byte) 127, 30, this.field_j);
                this.field_j = this.field_j + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, this.field_i, (byte) 120, 3 + this.field_j, 0);
              this.a(true, this.field_C);
              if (null == this.field_y) {
                break L20;
              } else {
                this.a(true, this.field_y);
                break L20;
              }
            }
            L21: {
              if (this.field_F == null) {
                break L21;
              } else {
                this.a(true, this.field_F);
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

            stackIn_59_1 = new StringBuilder().append("rg.<init>(");

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
          throw sd.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        this.field_I.i(19293);
        this.field_G.i(19293);
        if (param0) {
            fe var3 = (fe) null;
            this.a(false, (fe) null);
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
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
              if (param3 == 98) {
                stackIn_7_0 = this.b(-112, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param3 ^ -1)) {
                  stackIn_11_0 = this.a((byte) -103, param0);
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

            stackIn_14_1 = new StringBuilder().append("rg.EA(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    public final void a(boolean param0, fe param1) {
        String var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == this.field_I) {
                this.field_G.a(0, (uj) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_G == param1) {
                this.a(-100);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var4 = (String) null;
                this.b((byte) -93, (String) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("rg.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void a(int param0) {
        L0: {
          if (param0 == -100) {
            break L0;
          } else {
            this.field_J = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (se.d((byte) 125)) {
              break L2;
            } else {
              if (-1 <= (this.field_I.field_k.length() ^ -1)) {
                break L1;
              } else {
                if (-1 <= (this.field_G.field_k.length() ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ia.a(this.field_I.field_k, this.field_G.field_k, 0);
          break L1;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              if (param0 == 10) {
                break L1;
              } else {
                field_D = -57;
                break L1;
              }
            }
            var3 = new byte[var2_int];
            ug.a(param1, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rg.B(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_K = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0 != this.field_C) {
                if (param0 != this.field_y) {
                  if (this.field_F != param0) {
                    break L2;
                  } else {
                    if (!this.field_z) {
                      if (this.field_A) {
                        ob.b(11);
                        break L2;
                      } else {
                        vk.e(-59);
                        break L2;
                      }
                    } else {
                      ik.g(17);
                      break L2;
                    }
                  }
                } else {
                  pb.b(106);
                  break L2;
                }
              } else {
                this.a(-100);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("rg.E(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0, String param1) {
        fe var3 = null;
        String var4 = null;
        try {
            var3 = this.field_I;
            var4 = param1;
            var3.a((byte) -91, false, var4);
            if (param0 != -79) {
                this.field_I = (fe) null;
            }
            this.field_G.i(19293);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = bf.a(param1.length, 0, 4, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rg.C(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_K = "This password contains repeated characters, and would be easy to guess";
        field_B = 0;
        field_E = "Just play";
    }
}
