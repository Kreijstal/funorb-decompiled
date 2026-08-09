/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ae extends ig {
    private boolean field_L;
    private int field_H;
    private long field_K;
    private int field_M;
    static ha field_N;
    private boolean field_G;
    private long field_J;
    private int field_F;
    private int field_I;

    final static ub a(String param0, String param1, pf param2, int param3, pf param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ub stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 < -105) {
                break L1;
              } else {
                field_N = (ha) null;
                break L1;
              }
            }
            var5_int = param2.b(param0, (byte) -118);
            var6 = param2.a(var5_int, param1, (byte) -11);
            stackIn_3_0 = pc.a(var5_int, param4, param2, (byte) -39, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ae.K(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_M != -1) {
                var3_int = this.field_M + -this.field_m.length();
                if ((var3_int ^ -1) > -1) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_H == this.field_m.length()) {
                this.field_m = this.field_m + param0;
                break L2;
              } else {
                this.field_m = this.field_m.substring(0, this.field_H) + param0 + this.field_m.substring(this.field_H, this.field_m.length());
                break L2;
              }
            }
            L3: {
              if (param1 == 97) {
                break L3;
              } else {
                this.a(12, -91);
                break L3;
              }
            }
            this.field_H = this.field_H + param0.length();
            this.field_I = this.field_H;
            this.l(0);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ae.BB(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        this.field_H = param1;
        if (!si.field_jb[param0]) {
            this.field_I = this.field_H;
        }
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, (byte) 38, param6)) {
                break L1;
              } else {
                if (!(this.field_u instanceof pj)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((pj) ((Object) this.field_u)).a(-109, (rj) (this), param4, eb.field_a, param6, ni.field_e);
                    stackIn_4_0 = this;

                    stackIn_4_1 = 81;

                    if ((var8_int ^ -1) == 0) {
                      stackIn_5_0 = this;
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 0;
                      break L2;
                    } else {
                      stackIn_5_0 = this;
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, stackIn_5_2);
                    var8_long = ih.a((byte) -98);
                    stackIn_7_0 = this;

                    if (250L <= -this.field_K + var8_long) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 0;
                      break L3;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((ae) (this)).field_L = stackIn_8_1 != 0;
                    if (this.field_L) {
                      L5: {
                        this.field_I = this.n(-1);
                        this.field_H = this.j(-4238);
                        if (0 >= this.field_H) {
                          break L5;
                        } else {
                          if (this.field_m.charAt(this.field_H - 1) == 32) {
                            this.field_H = this.field_H - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_F = this.field_H;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_K = var8_long;
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param5 > 24) {
              stackIn_21_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_19_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var8);

            stackIn_24_1 = new StringBuilder().append("ae.P(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_I != this.field_H) {
            var2 = this.field_H > this.field_I ? this.field_I : this.field_H;
            var3 = this.field_H <= this.field_I ? this.field_I : this.field_H;
            this.field_I = var2;
            this.field_H = var2;
            this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
            this.l(param0 + 0);
        }
        if (param0 != 0) {
            field_N = (ha) null;
        }
    }

    void l(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!(!(this.field_v instanceof ec))) {
            ((ec) ((Object) this.field_v)).a((ae) (this), param0 + 0);
        }
    }

    private final void d(byte param0) {
        int discarded$0 = 0;
        this.g(0);
        this.i(0);
        if (param0 != -20) {
            discarded$0 = this.n(120);
        }
    }

    private final void k(int param0) {
        if (param0 != -1) {
            this.field_H = 78;
        }
        if (!(!(this.field_v instanceof ec))) {
            ((ec) ((Object) this.field_v)).b((ae) (this), 0);
        }
    }

    final void d(boolean param0) {
        this.field_H = 0;
        if (!param0) {
            this.i(68);
        }
        this.field_m = "";
        this.field_I = 0;
        this.l(0);
    }

    private final void o(int param0) {
        int var8 = stellarshard.field_B;
        if (!this.field_G) {
            this.field_l = 0;
            this.field_n = 0;
            return;
        }
        if (!(this.field_u instanceof pj)) {
            return;
        }
        if (param0 != -9104) {
            return;
        }
        pj var9 = (pj) ((Object) this.field_u);
        vk var3 = var9.b((rj) (this), (byte) 107);
        int var4 = var3.a(false);
        int var5 = var9.a(-27246, (rj) (this));
        int var6 = var9.a((byte) -73) >> 424407713;
        if (!(var5 - var6 <= var4)) {
            this.field_l = 0;
            this.field_n = 0;
            return;
        }
        int var7 = this.field_l + var3.b(this.field_H, 49);
        if (var7 > var5 + -var6) {
            this.field_l = this.field_l - var6 - (-var5 + var7);
        } else {
            if (var6 > var7) {
                this.field_l = this.field_l + -var7 + var6;
            }
        }
        if (-1 > (this.field_l ^ -1)) {
            this.field_l = 0;
        } else {
            if (!(this.field_l >= var6 + -var5)) {
                this.field_l = var6 + -var5;
            }
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        RuntimeException runtimeException = null;
        pj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.o(-9104);
              if (-2 != (this.field_o ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_u instanceof pj)) {
                    break L2;
                  } else {
                    var5 = (pj) ((Object) this.field_u);
                    var6 = var5.a(73, (rj) (this), param2, eb.field_a, param0, ni.field_e);
                    if (-1 != var6) {
                      L3: {
                        if (!this.field_L) {
                          break L3;
                        } else {
                          if (var6 >= this.field_F) {
                            break L3;
                          } else {
                            if (var6 <= this.field_I) {
                              break L3;
                            } else {
                              var6 = this.field_F;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_H = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_J = ih.a((byte) -98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ae.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public static void m(int param0) {
        field_N = null;
        if (param0 < 110) {
            pf var2 = (pf) null;
            ae.a(-3, (pf) null);
        }
    }

    final static void a(int param0, pf param1) {
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        ha var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            var8 = new ha(param1.a("logo.fo3d", "", (byte) -12));
            var10 = var8;
            var3 = var10.f(4);
            var10.j(8);
            e.field_d = uh.a(var10, -1);
            sj.field_B = new n[var3];
            bi.field_s = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.g((byte) 95);
                var9 = 0;
                var4 = var9;
                if (param0 > 4) {
                  L2: while (true) {
                    if (var9 >= var3) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = sj.field_B[var9];
                      var5.a(-12966, 6, 1, 6, 6);
                      var5.b((byte) -53);
                      var6 = new int[]{var5.field_F + var5.field_t >> -1531242687, var5.field_x - -var5.field_G >> -588309407, var5.field_u - -var5.field_k >> 1605485377};
                      bi.field_s[var9] = var6;
                      var5.a((byte) 108, -var6[1], -var6[2], -var6[0]);
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                sj.field_B[var4] = pf.a(16, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ae.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ae(String param0, lf param1, int param2) {
        super(param0, param1);
        this.field_L = false;
        this.field_K = 0L;
        this.field_F = -1;
        try {
            this.field_M = param2;
            this.field_u = n.field_i.field_d;
            this.a((byte) 20, param0, true);
            this.field_G = true;
            this.field_J = ih.a((byte) -98);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ae.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            L0: {
              if (param0 < -53) {
                break L0;
              } else {
                this.k(-83);
                break L0;
              }
            }
            try {
              L1: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.i(0);
                this.a(var2, (byte) 97);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        pj var8 = null;
        long var6 = 0L;
        if (param1 != -57) {
            this.field_L = true;
        }
        if (null != this.field_u && 0 == param0) {
            this.field_u.a(this.field_E, param3, param2, (rj) (this), 4549);
            if (this.field_u instanceof pj) {
                var8 = (pj) ((Object) this.field_u);
                if (!(this.field_H == this.field_I)) {
                    var8.a((rj) (this), this.field_H, param2, 0, param3, this.field_I);
                }
                var6 = ih.a((byte) -98);
                if (500L > (var6 - this.field_J) % 1000L) {
                    var8.a(this.field_H, false, param2, (rj) (this), param3);
                }
            }
        }
    }

    final void a(byte param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_m = param1;
              var4_int = param1.length();
              if (-1 == this.field_M) {
                break L2;
              } else {
                if (var4_int > this.field_M) {
                  this.field_m = this.field_m.substring(0, this.field_M);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_m.length();
              this.field_I = dupTemp$1;
              this.field_H = dupTemp$1;
              if (param0 == 20) {
                break L3;
              } else {
                this.field_G = false;
                break L3;
              }
            }
            L4: {
              if (param2) {
                break L4;
              } else {
                this.l(0);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ae.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        int discarded$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 29657) {
                break L1;
              } else {
                discarded$0 = this.n(-114);
                break L1;
              }
            }
            L2: {
              this.field_J = ih.a((byte) -98);
              if (param2 == 60) {
                break L2;
              } else {
                if (param2 == 62) {
                  break L2;
                } else {
                  L3: {
                    if (param2 < 32) {
                      break L3;
                    } else {
                      if (126 >= param2) {
                        L4: {
                          if (this.field_H == this.field_I) {
                            break L4;
                          } else {
                            this.i(0);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_M == -1) {
                              break L6;
                            } else {
                              if (this.field_m.length() >= this.field_M) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_H < this.field_m.length()) {
                              this.field_m = this.field_m.substring(0, this.field_H) + param2 + this.field_m.substring(this.field_H, this.field_m.length());
                              this.field_H = this.field_H + 1;
                              this.field_I = this.field_H;
                              break L7;
                            } else {
                              this.field_m = this.field_m + param2;
                              dupTemp$1 = this.field_m.length();
                              this.field_H = dupTemp$1;
                              this.field_I = dupTemp$1;
                              break L7;
                            }
                          }
                          this.l(0);
                          break L5;
                        }
                        stackIn_76_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (param1 != 85) {
                      if (-102 != (param1 ^ -1)) {
                        if (param1 == 13) {
                          this.d(true);
                          stackIn_65_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if ((param1 ^ -1) == -97) {
                            if ((this.field_H ^ -1) < -1) {
                              L9: {
                                stackIn_61_0 = this;

                                stackIn_61_1 = 81;

                                if (!si.field_jb[82]) {
                                  stackIn_62_0 = this;
                                  stackIn_62_1 = stackIn_61_1;
                                  stackIn_62_2 = -1 + this.field_H;
                                  break L9;
                                } else {
                                  stackIn_62_0 = this;
                                  stackIn_62_1 = stackIn_61_1;
                                  stackIn_62_2 = this.n(-1);
                                  break L9;
                                }
                              }
                              this.a(stackIn_62_1, stackIn_62_2);
                              stackIn_63_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            } else {
                              break L8;
                            }
                          } else {
                            if ((param1 ^ -1) != -98) {
                              if (102 != param1) {
                                if ((param1 ^ -1) == -104) {
                                  this.a(81, this.field_m.length());
                                  stackIn_56_0 = 1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (param1 == 84) {
                                    this.k(-1);
                                    stackIn_54_0 = 1;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    L10: {
                                      if (!si.field_jb[82]) {
                                        break L10;
                                      } else {
                                        if ((param1 ^ -1) == -66) {
                                          this.d((byte) -20);
                                          stackIn_52_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!si.field_jb[82]) {
                                        break L11;
                                      } else {
                                        if ((param1 ^ -1) == -67) {
                                          this.g(0);
                                          stackIn_50_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!si.field_jb[82]) {
                                      break L8;
                                    } else {
                                      if (67 != param1) {
                                        break L8;
                                      } else {
                                        this.h(-78);
                                        stackIn_48_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.a(81, 0);
                                stackIn_36_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            } else {
                              if (this.field_H >= this.field_m.length()) {
                                break L8;
                              } else {
                                L12: {
                                  stackIn_31_0 = this;

                                  stackIn_31_1 = param0 + -29576;

                                  if (si.field_jb[82]) {
                                    stackIn_32_0 = this;
                                    stackIn_32_1 = stackIn_31_1;
                                    stackIn_32_2 = this.j(param0 + -33895);
                                    break L12;
                                  } else {
                                    stackIn_32_0 = this;
                                    stackIn_32_1 = stackIn_31_1;
                                    stackIn_32_2 = this.field_H + 1;
                                    break L12;
                                  }
                                }
                                this.a(stackIn_32_1, stackIn_32_2);
                                stackIn_33_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_H != this.field_I) {
                          this.i(0);
                          stackIn_24_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (this.field_H < this.field_m.length()) {
                            this.field_I = this.field_H - -1;
                            this.i(0);
                            stackIn_22_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      if (this.field_I == this.field_H) {
                        if (0 >= this.field_H) {
                          break L8;
                        } else {
                          this.field_I = -1 + this.field_H;
                          this.i(0);
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        this.i(0);
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_78_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var5);

            stackIn_81_1 = new StringBuilder().append("ae.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L13;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L13;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_48_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_50_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_52_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_54_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_63_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_65_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_76_0 != 0;
                                    } else {
                                      return stackIn_78_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int j(int param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        L0: {
          var4 = stellarshard.field_B;
          if (param0 == -4238) {
            break L0;
          } else {
            var5 = (String) null;
            this.a((byte) 68, (String) null, true);
            break L0;
          }
        }
        var2 = this.field_m.length();
        if (this.field_H == var2) {
          return this.field_H;
        } else {
          var3 = 1 + this.field_H;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (this.field_m.charAt(var3 + -1) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        if (this.field_H == 0) {
          return this.field_H;
        } else {
          var2 = param0 + this.field_H;
          L0: while (true) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                if (this.field_m.charAt(var2 + -1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void g(int param0) {
        String var2 = this.p(79);
        if (var2.length() > param0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(44))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String p(int param0) {
        int var2 = this.field_H > this.field_I ? this.field_I : this.field_H;
        int var4 = 59 / ((-66 - param0) / 56);
        int var3 = this.field_H > this.field_I ? this.field_H : this.field_I;
        return this.field_m.substring(var2, var3);
    }

    static {
    }
}
