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
        int var2;
        int var3;
        int var4;
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
        ep var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qe var9;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("vb.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        int var6 = 0;
        qe var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("vb.WA(");

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
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void m(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
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
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.h(param0 ^ -8);
                this.a(false, var2);
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

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        String var5 = null;
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
              dupTemp$1 = this.field_A.length();
              this.field_L = dupTemp$1;
              this.field_T = dupTemp$1;
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vb.F(");

            if (param0 == null) {
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
        int var2;
        int var3;
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
        if (null != this.field_l && -1 == (param2 ^ -1)) {
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

    final static void k(int param0) {
        if (!(ol.field_s)) {
            throw new IllegalStateException();
        }
        ci.field_t = true;
        lf.a((byte) -71, true);
        i.field_j = param0;
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
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
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                              dupTemp$0 = this.field_A.length();
                              this.field_T = dupTemp$0;
                              this.field_L = dupTemp$0;
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
                        stackIn_20_0 = 1;
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
                            stackIn_77_0 = 1;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          } else {
                            break L8;
                          }
                        } else {
                          this.h(-114);
                          stackIn_73_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        if (param0 != 13) {
                          if (96 != param0) {
                            if (param0 == 97) {
                              if (this.field_T < this.field_A.length()) {
                                L9: {
                                  stackIn_68_0 = this;

                                  if (!pe.field_l[82]) {
                                    stackIn_69_0 = this;
                                    stackIn_69_1 = this.field_T - -1;
                                    break L9;
                                  } else {
                                    stackIn_69_0 = this;
                                    stackIn_69_1 = this.h((byte) 106);
                                    break L9;
                                  }
                                }
                                this.a(stackIn_69_1, 81);
                                stackIn_70_0 = 1;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                break L8;
                              }
                            } else {
                              if (-103 == (param0 ^ -1)) {
                                this.a(0, 81);
                                stackIn_63_0 = 1;
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
                                          stackIn_61_0 = 1;
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
                                          stackIn_59_0 = 1;
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
                                        stackIn_57_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.j(-66);
                                    stackIn_47_0 = 1;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  this.a(this.field_A.length(), 81);
                                  stackIn_44_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            if ((this.field_T ^ -1) < -1) {
                              L12: {
                                stackIn_37_0 = this;

                                if (!pe.field_l[82]) {
                                  stackIn_38_0 = this;
                                  stackIn_38_1 = this.field_T - 1;
                                  break L12;
                                } else {
                                  stackIn_38_0 = this;
                                  stackIn_38_1 = this.d(false);
                                  break L12;
                                }
                              }
                              this.a(stackIn_38_1, param1 + -29);
                              stackIn_39_0 = 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              return false;
                            }
                          }
                        } else {
                          this.c(false);
                          stackIn_31_0 = 1;
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
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        this.h(param1 ^ -55);
                        stackIn_24_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_79_0 = 0;
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
            stackIn_82_0 = (RuntimeException) (var5);

            stackIn_82_1 = new StringBuilder().append("vb.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L13;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
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
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
              if (this.field_l instanceof qe) {
                L1: {
                  var8_int = ((qe) ((Object) this.field_l)).a((oc) (this), pq.field_k, true, param3, po.field_a, param2);
                  stackIn_6_0 = this;

                  if ((var8_int ^ -1) == 0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, 81);
                  var8_long = ue.a(false);
                  stackIn_9_0 = this;

                  if ((-this.field_P + var8_long ^ -1L) <= -251L) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
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
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_19_0 = 0;
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
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("vb.MA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
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
