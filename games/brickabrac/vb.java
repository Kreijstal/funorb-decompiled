/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends d {
    private long field_P;
    private int field_Q;
    private boolean field_M;
    private int field_L;
    static int field_S;
    private int field_T;
    static mh field_K;
    private boolean field_N;
    private int field_R;
    private long field_O;

    final void c(boolean param0) {
        this.field_L = 0;
        this.field_A = "";
        this.field_T = 0;
        this.n(122);
        if (param0) {
            field_S = 97;
        }
    }

    public static void i(int param0) {
        if (param0 < 63) {
            return;
        }
        field_K = null;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(this.field_L == this.field_T)) {
            var2 = this.field_L >= this.field_T ? this.field_T : this.field_L;
            var3 = this.field_L < this.field_T ? this.field_T : this.field_L;
            this.field_L = var2;
            this.field_T = var2;
            this.field_A = this.field_A.substring(0, var2) + this.field_A.substring(var3, this.field_A.length());
            this.n(46);
        }
        if (param0 >= -34) {
            String var4 = (String) null;
            this.a(false, (String) null);
        }
    }

    vb(String param0, uh param1, int param2) {
        super(param0, param1);
        this.field_P = 0L;
        this.field_M = false;
        this.field_R = -1;
        try {
            this.field_l = bj.field_T.field_b;
            this.field_Q = param2;
            this.a(param0, -12592, true);
            this.field_N = true;
            this.field_O = ue.a(false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = this.field_A.length();
        if (var2 == this.field_T) {
          return this.field_T;
        } else {
          if (param0 >= 93) {
            var3 = this.field_T + 1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (this.field_A.charAt(var3 + -1) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return -128;
          }
        }
    }

    private final void f(byte param0) {
        ep var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (this.field_N) {
          if (!(this.field_l instanceof qe)) {
            return;
          } else {
            L0: {
              if (param0 == 81) {
                break L0;
              } else {
                this.field_L = 16;
                break L0;
              }
            }
            var9 = (qe) ((Object) this.field_l);
            var3 = var9.c((oc) (this), -3);
            var4 = var3.b(31458);
            var5 = var9.a(61823, (oc) (this));
            var6 = var9.a((byte) 99) >> -671140159;
            if (var4 >= var5 - var6) {
              L1: {
                var7 = this.field_r - -var3.a(this.field_T, (byte) -108);
                if (-var6 + var5 < var7) {
                  this.field_r = -var7 - (-var5 - -var6 - this.field_r);
                  break L1;
                } else {
                  if (var7 < var6) {
                    this.field_r = var6 - (var7 - this.field_r);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-1 > (this.field_r ^ -1)) {
                  this.field_r = 0;
                  break L2;
                } else {
                  if (this.field_r < -var5 - -var6) {
                    this.field_r = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              this.field_B = 0;
              this.field_r = 0;
              return;
            }
          }
        } else {
          this.field_r = 0;
          this.field_B = 0;
          return;
        }
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_Q != -1) {
                var3_int = this.field_Q - this.field_A.length();
                if ((var3_int ^ -1) > -1) {
                  param1 = param1.substring(0, var3_int);
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
              if (this.field_T == this.field_A.length()) {
                this.field_A = this.field_A + param1;
                break L2;
              } else {
                this.field_A = this.field_A.substring(0, this.field_T) + param1 + this.field_A.substring(this.field_T, this.field_A.length());
                break L2;
              }
            }
            L3: {
              this.field_T = this.field_T + param1.length();
              this.field_L = this.field_T;
              if (param0) {
                this.l(95);
                this.n(80);
                break L3;
              } else {
                this.n(80);
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("vb.U(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        qe var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              this.f((byte) 81);
              if (-2 == (this.field_n ^ -1)) {
                L2: {
                  if (!(this.field_l instanceof qe)) {
                    break L2;
                  } else {
                    var7 = (qe) ((Object) this.field_l);
                    var6 = var7.a((oc) (this), pq.field_k, true, param3, po.field_a, param2);
                    if (0 != (var6 ^ -1)) {
                      L3: {
                        if (!this.field_M) {
                          break L3;
                        } else {
                          if (this.field_R <= var6) {
                            break L3;
                          } else {
                            if (var6 <= this.field_L) {
                              break L3;
                            } else {
                              var6 = this.field_R;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_T = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_O = ue.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("vb.WA(");
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
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void m(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 32) {
                break L0;
              } else {
                field_S = 68;
                break L0;
              }
            }
            try {
              L1: {
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.h(param0 ^ -8);
                this.a(false, var2_ref);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
            L1: {
              if (param0 != null) {
                break L1;
              } else {
                param0 = "";
                break L1;
              }
            }
            L2: {
              this.field_A = param0;
              var4_int = param0.length();
              if (this.field_Q == -1) {
                break L2;
              } else {
                if (this.field_Q < var4_int) {
                  this.field_A = this.field_A.substring(0, this.field_Q);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_A.length();
              this.field_L = dupTemp$2;
              this.field_T = dupTemp$2;
              if (!param2) {
                this.n(19);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == -12592) {
                break L4;
              } else {
                var5 = (String) null;
                this.a((String) null, 58, false);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("vb.F(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void l(int param0) {
        String var2 = this.a((byte) -108);
        if (!(var2.length() <= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.a((byte) -124))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, int param1) {
        this.field_T = param0;
        if (!pe.field_l[param1]) {
            this.field_L = this.field_T;
        }
    }

    private final void j(int param0) {
        if (param0 != -66) {
            this.field_M = false;
        }
        if (this.field_i instanceof hf) {
            ((hf) ((Object) this.field_i)).a((vb) (this), -40);
        }
    }

    void n(int param0) {
        if (this.field_i instanceof hf) {
            ((hf) ((Object) this.field_i)).a((vb) (this), (byte) -100);
        }
        if (param0 <= 7) {
            vb.i(41);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (-1 != (this.field_T ^ -1)) {
          var2 = -1 + this.field_T;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (this.field_A.charAt(-1 + var2) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.field_L = -72;
                break L2;
              }
            }
            return var2;
          }
        } else {
          return this.field_T;
        }
    }

    private final String a(byte param0) {
        int var2 = this.field_L >= this.field_T ? this.field_T : this.field_L;
        if (param0 > -97) {
            return (String) null;
        }
        int var3 = this.field_L < this.field_T ? this.field_T : this.field_L;
        return this.field_A.substring(var2, var3);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        qe var5 = null;
        long var6 = 0L;
        if (param3 != -11) {
            return;
        }
        if (null != this.field_l) {
            if (-1 == (param2 ^ -1)) {
                this.field_l.a(this.field_J, -20618, param1, (oc) (this), param0);
                if (!(!(this.field_l instanceof qe))) {
                    var5 = (qe) ((Object) this.field_l);
                    if (this.field_T != this.field_L) {
                        var5.a(-15964, param0, param1, this.field_L, this.field_T, (oc) (this));
                    }
                    var6 = ue.a(false);
                    if ((var6 - this.field_O) % 1000L < 500L) {
                        var5.a((oc) (this), param1, this.field_T, param0, (byte) 123);
                    }
                }
            }
        }
    }

    final static void k(int param0) {
        if (!(ol.field_s)) {
            throw new IllegalStateException();
        }
        ci.field_t = true;
        lf.a((byte) -71, true);
        i.field_j = param0;
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        try {
          L0: {
            L1: {
              this.field_O = ue.a(false);
              if (param1 == 110) {
                break L1;
              } else {
                field_S = 20;
                break L1;
              }
            }
            L2: {
              if (param3 == 60) {
                break L2;
              } else {
                if (62 == param3) {
                  break L2;
                } else {
                  L3: {
                    if (param3 < 32) {
                      break L3;
                    } else {
                      if (param3 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_T != this.field_L) {
                            this.h(-84);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (-1 == this.field_Q) {
                              break L6;
                            } else {
                              if (this.field_A.length() >= this.field_Q) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_T >= this.field_A.length()) {
                              this.field_A = this.field_A + param3;
                              dupTemp$1 = this.field_A.length();
                              this.field_T = dupTemp$1;
                              this.field_L = dupTemp$1;
                              break L7;
                            } else {
                              this.field_A = this.field_A.substring(0, this.field_T) + param3 + this.field_A.substring(this.field_T, this.field_A.length());
                              this.field_T = this.field_T + 1;
                              this.field_L = this.field_T;
                              break L7;
                            }
                          }
                          this.n(66);
                          break L5;
                        }
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L8: {
                    if (-86 != (param0 ^ -1)) {
                      if (-102 == (param0 ^ -1)) {
                        if (this.field_T == this.field_L) {
                          if (this.field_T < this.field_A.length()) {
                            this.field_L = this.field_T - -1;
                            this.h(param1 + -182);
                            stackOut_76_0 = 1;
                            stackIn_77_0 = stackOut_76_0;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          } else {
                            break L8;
                          }
                        } else {
                          this.h(-114);
                          stackOut_72_0 = 1;
                          stackIn_73_0 = stackOut_72_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        if (param0 != 13) {
                          if (96 != param0) {
                            if (param0 == 97) {
                              if (this.field_T < this.field_A.length()) {
                                L9: {
                                  stackOut_66_0 = this;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_67_0 = stackOut_66_0;
                                  if (!pe.field_l[82]) {
                                    stackOut_68_0 = this;
                                    stackOut_68_1 = this.field_T - -1;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    break L9;
                                  } else {
                                    stackOut_67_0 = this;
                                    stackOut_67_1 = this.h((byte) 106);
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    break L9;
                                  }
                                }
                                this.a(stackIn_69_1, 81);
                                stackOut_69_0 = 1;
                                stackIn_70_0 = stackOut_69_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                break L8;
                              }
                            } else {
                              if (-103 == (param0 ^ -1)) {
                                this.a(0, 81);
                                stackOut_62_0 = 1;
                                stackIn_63_0 = stackOut_62_0;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                if (-104 != (param0 ^ -1)) {
                                  if (-85 != (param0 ^ -1)) {
                                    L10: {
                                      if (!pe.field_l[82]) {
                                        break L10;
                                      } else {
                                        if (-66 == (param0 ^ -1)) {
                                          this.g((byte) -49);
                                          stackOut_60_0 = 1;
                                          stackIn_61_0 = stackOut_60_0;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!pe.field_l[82]) {
                                        break L11;
                                      } else {
                                        if (66 == param0) {
                                          this.l(0);
                                          stackOut_58_0 = 1;
                                          stackIn_59_0 = stackOut_58_0;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!pe.field_l[82]) {
                                      break L8;
                                    } else {
                                      if (67 != param0) {
                                        break L8;
                                      } else {
                                        this.m(32);
                                        stackOut_56_0 = 1;
                                        stackIn_57_0 = stackOut_56_0;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.j(-66);
                                    stackOut_46_0 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  this.a(this.field_A.length(), 81);
                                  stackOut_43_0 = 1;
                                  stackIn_44_0 = stackOut_43_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            if ((this.field_T ^ -1) < -1) {
                              L12: {
                                stackOut_35_0 = this;
                                stackIn_37_0 = stackOut_35_0;
                                stackIn_36_0 = stackOut_35_0;
                                if (!pe.field_l[82]) {
                                  stackOut_37_0 = this;
                                  stackOut_37_1 = this.field_T - 1;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  break L12;
                                } else {
                                  stackOut_36_0 = this;
                                  stackOut_36_1 = this.d(false);
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  break L12;
                                }
                              }
                              this.a(stackIn_38_1, param1 + -29);
                              stackOut_38_0 = 1;
                              stackIn_39_0 = stackOut_38_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              return false;
                            }
                          }
                        } else {
                          this.c(false);
                          stackOut_30_0 = 1;
                          stackIn_31_0 = stackOut_30_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      if (this.field_L == this.field_T) {
                        if (this.field_T <= 0) {
                          break L8;
                        } else {
                          this.field_L = -1 + this.field_T;
                          this.h(param1 ^ -41);
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        this.h(param1 ^ -55);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackOut_78_0 = 0;
                  stackIn_79_0 = stackOut_78_0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var5);
            stackOut_80_1 = new StringBuilder().append("vb.T(").append(param0).append(',').append(param1).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param2 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L13;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_44_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_57_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_59_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_61_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_63_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_70_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_73_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_77_0 != 0;
                                    } else {
                                      return stackIn_79_0 != 0;
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

    private final void g(byte param0) {
        this.l(param0 ^ -49);
        this.h(-118);
        if (param0 != -49) {
            this.field_O = -103L;
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
              if (this.field_l instanceof qe) {
                L1: {
                  var8_int = ((qe) ((Object) this.field_l)).a((oc) (this), pq.field_k, true, param3, po.field_a, param2);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if ((var8_int ^ -1) == 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = var8_int;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, 81);
                  var8_long = ue.a(false);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if ((-this.field_P + var8_long ^ -1L) <= -251L) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((vb) (this)).field_M = stackIn_10_1 != 0;
                  if (!this.field_M) {
                    break L3;
                  } else {
                    L4: {
                      this.field_L = this.d(false);
                      this.field_T = this.h((byte) 103);
                      if (-1 <= (this.field_T ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_A.charAt(-1 + this.field_T) == 32) {
                          this.field_T = this.field_T - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_R = this.field_T;
                    break L3;
                  }
                }
                this.field_P = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("vb.MA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    static {
    }
}
