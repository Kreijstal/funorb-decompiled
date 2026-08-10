/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk extends ek {
    static qk field_L;
    private int field_Q;
    static String field_N;
    static int field_cb;
    static String[] field_P;
    private long field_Z;
    static String field_bb;
    static String[] field_O;
    private boolean field_T;
    private int field_M;
    static String field_U;
    static java.security.SecureRandom field_K;
    private long field_ab;
    static mm field_R;
    static String field_Y;
    private int field_S;
    private int field_X;
    private boolean field_W;
    static int field_V;

    void l(int param0) {
        if (param0 != 18929) {
            field_K = (java.security.SecureRandom) null;
        }
        if (!(!(this.field_v instanceof qh))) {
            ((qh) ((Object) this.field_v)).a(16737894, (rk) (this));
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
              this.field_E = param0;
              var4_int = param0.length();
              if ((this.field_X ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_X >= var4_int) {
                  break L2;
                } else {
                  this.field_E = this.field_E.substring(0, this.field_X);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_E.length();
              this.field_M = dupTemp$2;
              this.field_S = dupTemp$2;
              if (param1 == 114) {
                break L3;
              } else {
                field_U = (String) null;
                break L3;
              }
            }
            L4: {
              if (!param2) {
                this.l(18929);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("rk.L(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        cf var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        nl var9;
        var8 = client.field_A ? 1 : 0;
        if (!this.field_T) {
          this.field_x = 0;
          this.field_F = 0;
          return;
        } else {
          if (!(this.field_p instanceof nl)) {
            return;
          } else {
            L0: {
              var9 = (nl) ((Object) this.field_p);
              var3 = var9.a((ce) (this), (byte) 118);
              var4 = var3.a(false);
              if (param0 == -17122) {
                break L0;
              } else {
                this.field_M = -109;
                break L0;
              }
            }
            var5 = var9.a(false, (ce) (this));
            var6 = var9.a((byte) -106) >> -1897107391;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = this.field_x + var3.a((byte) -94, this.field_S);
                if (var5 + -var6 < var7) {
                  this.field_x = this.field_x + (-var6 + var5) + -var7;
                  break L1;
                } else {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    this.field_x = this.field_x - (-var6 + var7);
                    break L1;
                  }
                }
              }
              L2: {
                if (0 < this.field_x) {
                  this.field_x = 0;
                  break L2;
                } else {
                  if (-var5 - -var6 <= this.field_x) {
                    break L2;
                  } else {
                    this.field_x = -var5 - -var6;
                    break L2;
                  }
                }
              }
              return;
            } else {
              this.field_F = 0;
              this.field_x = 0;
              return;
            }
          }
        }
    }

    private final void f(byte param0) {
        int var3 = 0;
        int var2 = 0;
        if (!(this.field_S == this.field_M)) {
            var2 = this.field_S <= this.field_M ? this.field_S : this.field_M;
            var3 = this.field_S <= this.field_M ? this.field_M : this.field_S;
            this.field_M = var2;
            this.field_S = var2;
            this.field_E = this.field_E.substring(0, var2) + this.field_E.substring(var3, this.field_E.length());
            this.l(18929);
        }
        var2 = -30 / ((param0 - 40) / 59);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = this.field_E.length();
        if (var2 == this.field_S) {
          return this.field_S;
        } else {
          var3 = 1 + this.field_S;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (-33 == (this.field_E.charAt(var3 + -1) ^ -1)) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 == -30) {
                break L2;
              } else {
                this.field_X = 46;
                break L2;
              }
            }
            return var3;
          }
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_p instanceof nl) {
                L1: {
                  var8_int = ((nl) ((Object) this.field_p)).a(param5, -257, (ce) (this), param4, pm.field_f, bh.field_g);
                  stackIn_5_0 = this;

                  stackIn_5_1 = param6 ^ 30294;

                  if (0 == (var8_int ^ -1)) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, stackIn_6_2);
                  var8_long = ik.a(4);
                  stackIn_8_0 = this;

                  if (250L <= -this.field_ab + var8_long) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((rk) (this)).field_W = stackIn_9_1 != 0;
                  if (this.field_W) {
                    L4: {
                      this.field_M = this.n(0);
                      this.field_S = this.e((byte) -30);
                      if ((this.field_S ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_E.charAt(-1 + this.field_S) != 32) {
                          break L4;
                        } else {
                          this.field_S = this.field_S - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_Q = this.field_S;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_ab = var8_long;
                stackIn_16_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("rk.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final void g(byte param0) {
        if (param0 != -76) {
            return;
        }
        this.h((byte) -113);
        this.f((byte) -95);
    }

    private final void b(boolean param0) {
        if (!(!(this.field_v instanceof qh))) {
            ((qh) ((Object) this.field_v)).b(-2569, (rk) (this));
        }
        if (param0) {
            this.field_ab = 15L;
        }
    }

    rk(String param0, kg param1, int param2) {
        super(param0, param1);
        this.field_ab = 0L;
        this.field_Q = -1;
        this.field_W = false;
        try {
            this.field_X = param2;
            this.field_p = bf.field_x.field_l;
            this.a(param0, (byte) 114, true);
            this.field_T = true;
            this.field_Z = ik.a(4);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void c(boolean param0) {
        em.a(-1199770620);
        if (param0) {
            return;
        }
        hm.a(4, (byte) -104);
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1) {
              L1: {
                if (0 == (this.field_X ^ -1)) {
                  break L1;
                } else {
                  var3_int = this.field_X + -this.field_E.length();
                  if (-1 < (var3_int ^ -1)) {
                    param0 = param0.substring(0, var3_int);
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_S == this.field_E.length()) {
                  this.field_E = this.field_E + param0;
                  break L2;
                } else {
                  this.field_E = this.field_E.substring(0, this.field_S) + param0 + this.field_E.substring(this.field_S, this.field_E.length());
                  break L2;
                }
              }
              this.field_S = this.field_S + param0.length();
              this.field_M = this.field_S;
              this.l(18929);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rk.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void h(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            L0: {
              if (param0 >= 112) {
                break L0;
              } else {
                field_R = (mm) null;
                break L0;
              }
            }
            try {
              L1: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.f((byte) -92);
                this.a(var2, true);
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

    final void a(int param0, int param1, int param2, int param3) {
        nl var9 = null;
        long var6 = 0L;
        if (param1 > -103) {
            ce var8 = (ce) null;
            this.a(-88, -47, (ce) null, '%');
        }
        if (null != this.field_p) {
            if (!(param2 != 0)) {
                this.field_p.a(this.field_I, param0, param3, (byte) -110, (ce) (this));
                if (this.field_p instanceof nl) {
                    var9 = (nl) ((Object) this.field_p);
                    if (this.field_M != this.field_S) {
                        var9.a(this.field_M, this.field_S, param3, param0, -123, (ce) (this));
                    }
                    var6 = ik.a(4);
                    if (((var6 + -this.field_Z) % 1000L ^ -1L) > -501L) {
                        var9.a((ce) (this), this.field_S, 1, param0, param3);
                    }
                }
            }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        nl var7 = null;
        int var6 = 0;
        try {
            super.a(param0, 94, param2, param3);
            if (param1 < 38) {
                this.field_X = 63;
            }
            this.k(-17122);
            if (-2 == (this.field_o ^ -1)) {
                if (this.field_p instanceof nl) {
                    var7 = (nl) ((Object) this.field_p);
                    var6 = var7.a(param3, -257, (ce) (this), param2, pm.field_f, bh.field_g);
                    if ((var6 ^ -1) != 0) {
                        if (this.field_W && this.field_Q > var6) {
                            if (!(this.field_M >= var6)) {
                                var6 = this.field_Q;
                            }
                        }
                        this.field_S = var6;
                    }
                }
                this.field_Z = ik.a(4);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void m(int param0) {
        this.field_M = param0;
        this.field_E = "";
        this.field_S = 0;
        this.l(18929);
    }

    private final String i(int param0) {
        int var2 = this.field_S > this.field_M ? this.field_M : this.field_S;
        if (param0 <= 102) {
            return (String) null;
        }
        int var3 = this.field_M >= this.field_S ? this.field_M : this.field_S;
        return this.field_E.substring(var2, var3);
    }

    public static void j(int param0) {
        field_N = null;
        field_R = null;
        field_L = null;
        field_Y = null;
        field_P = null;
        field_U = null;
        field_bb = null;
        field_O = null;
        field_K = null;
        if (param0 != 81) {
            rk.c(true);
        }
    }

    private final void b(int param0, int param1) {
        this.field_S = param1;
        if (!(bj.field_d[81])) {
            this.field_M = this.field_S;
        }
        if (param0 != -30305) {
            this.field_Z = 4L;
        }
    }

    private final void h(byte param0) {
        String var2 = this.i(127);
        if (!(-1 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.i(103))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 > -96) {
            String var3 = (String) null;
            this.a((String) null, true);
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_Z = ik.a(4);
              if (60 == param3) {
                break L1;
              } else {
                if (param3 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (32 > param3) {
                      break L2;
                    } else {
                      if (param3 <= 126) {
                        L3: {
                          if (this.field_S == this.field_M) {
                            break L3;
                          } else {
                            this.f((byte) -94);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if ((this.field_X ^ -1) == 0) {
                              break L5;
                            } else {
                              if (this.field_E.length() >= this.field_X) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_S < this.field_E.length()) {
                              this.field_E = this.field_E.substring(0, this.field_S) + param3 + this.field_E.substring(this.field_S, this.field_E.length());
                              this.field_S = this.field_S + 1;
                              this.field_M = this.field_S;
                              break L6;
                            } else {
                              this.field_E = this.field_E + param3;
                              dupTemp$0 = this.field_E.length();
                              this.field_S = dupTemp$0;
                              this.field_M = dupTemp$0;
                              break L6;
                            }
                          }
                          this.l(18929);
                          break L4;
                        }
                        stackIn_74_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if ((param1 ^ -1) == -86) {
                      if (this.field_M == this.field_S) {
                        if (this.field_S <= 0) {
                          break L7;
                        } else {
                          this.field_M = -1 + this.field_S;
                          this.f((byte) 113);
                          stackIn_63_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        this.f((byte) -94);
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    } else {
                      if (param1 != 101) {
                        if ((param1 ^ -1) != -14) {
                          if ((param1 ^ -1) != -97) {
                            if (param1 == 97) {
                              if (this.field_S >= this.field_E.length()) {
                                break L7;
                              } else {
                                L8: {
                                  stackIn_55_0 = this;

                                  stackIn_55_1 = -30305;

                                  if (bj.field_d[82]) {
                                    stackIn_56_0 = this;
                                    stackIn_56_1 = stackIn_55_1;
                                    stackIn_56_2 = this.e((byte) -30);
                                    break L8;
                                  } else {
                                    stackIn_56_0 = this;
                                    stackIn_56_1 = stackIn_55_1;
                                    stackIn_56_2 = 1 + this.field_S;
                                    break L8;
                                  }
                                }
                                this.b(stackIn_56_1, stackIn_56_2);
                                stackIn_57_0 = 1;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              }
                            } else {
                              if (102 != param1) {
                                if (param1 == 103) {
                                  this.b(-30305, this.field_E.length());
                                  stackIn_51_0 = 1;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (-85 != (param1 ^ -1)) {
                                    L9: {
                                      if (!bj.field_d[82]) {
                                        break L9;
                                      } else {
                                        if (-66 == (param1 ^ -1)) {
                                          this.g((byte) -76);
                                          stackIn_49_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!bj.field_d[82]) {
                                        break L10;
                                      } else {
                                        if (66 == param1) {
                                          this.h((byte) -101);
                                          stackIn_47_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!bj.field_d[82]) {
                                      break L7;
                                    } else {
                                      if ((param1 ^ -1) != -68) {
                                        break L7;
                                      } else {
                                        this.h(118);
                                        stackIn_45_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.b(false);
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              } else {
                                this.b(-30305, 0);
                                stackIn_31_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          } else {
                            if (0 < this.field_S) {
                              L11: {
                                stackIn_25_0 = this;

                                stackIn_25_1 = -30305;

                                if (bj.field_d[82]) {
                                  stackIn_26_0 = this;
                                  stackIn_26_1 = stackIn_25_1;
                                  stackIn_26_2 = this.n(0);
                                  break L11;
                                } else {
                                  stackIn_26_0 = this;
                                  stackIn_26_1 = stackIn_25_1;
                                  stackIn_26_2 = -1 + this.field_S;
                                  break L11;
                                }
                              }
                              this.b(stackIn_26_1, stackIn_26_2);
                              stackIn_27_0 = 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          this.m(0);
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        if (this.field_S != this.field_M) {
                          this.f((byte) -65);
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (this.field_S < this.field_E.length()) {
                            this.field_M = 1 + this.field_S;
                            this.f((byte) -50);
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  var5_int = -114 / ((-22 - param0) / 49);
                  stackIn_76_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("rk.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L12;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_57_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_74_0 != 0;
                                    } else {
                                      return stackIn_76_0 != 0;
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

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param0 != this.field_S) {
          var2 = this.field_S - 1;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (this.field_E.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return this.field_S;
        }
    }

    static {
        field_O = new String[]{"Get four of the same colour touching!", "The wildcard special item (multicoloured star) can be used in place of any other colour!", "Watch out! All shapes you match will now come back as solid shapes. Match four loose pieces of the same colour against the solid shape to get rid of it again.", "Did you know that if you get two or more matches at the same time, you get a special item?"};
        field_bb = "Suggest muting this player";
        field_U = "You have entered another game.";
        field_N = "To clear a solid shape, make another shape of the same colour against it.";
        field_V = -1;
    }
}
