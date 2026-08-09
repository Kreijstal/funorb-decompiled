/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qn extends fb {
    private boolean field_S;
    private int field_T;
    static ci field_P;
    static int field_M;
    static nk field_U;
    private int field_Q;
    private int field_X;
    private int field_N;
    private boolean field_W;
    static String field_R;
    private long field_V;
    private long field_O;

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_Q != this.field_X) {
            var2 = this.field_Q <= this.field_X ? this.field_Q : this.field_X;
            var3 = this.field_Q <= this.field_X ? this.field_X : this.field_Q;
            this.field_Q = var2;
            this.field_X = var2;
            this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
            this.g((byte) 63);
        }
        if (param0 != 1) {
            this.h((byte) -107);
        }
    }

    private final void c(boolean param0) {
        if (!(!(this.field_p instanceof ha))) {
            ((ha) ((Object) this.field_p)).b((qn) (this), 3);
        }
        if (!param0) {
            this.a(-126, (byte) -127);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
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
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_n instanceof mg) {
                L1: {
                  var8_int = ((mg) ((Object) this.field_n)).a(rf.field_b, param5, -4, param6, (mf) (this), hn.field_k);
                  stackIn_6_0 = this;

                  if (-1 != var8_int) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = var8_int;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, (byte) 80);
                  var8_long = ud.a(2);
                  stackIn_9_0 = this;

                  if (-251L >= (var8_long + -this.field_O ^ -1L)) {
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
                  ((qn) (this)).field_S = stackIn_10_1 != 0;
                  if (this.field_S) {
                    L4: {
                      this.field_X = this.l(param3 ^ 41);
                      this.field_Q = this.k(param3 + -23899);
                      if ((this.field_Q ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (32 != this.field_v.charAt(-1 + this.field_Q)) {
                          break L4;
                        } else {
                          this.field_Q = this.field_Q - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_N = this.field_Q;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_O = var8_long;
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

            stackIn_22_1 = new StringBuilder().append("qn.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final void e(byte param0) {
        int var3 = 71 % ((param0 - 31) / 51);
        String var2 = this.b(false);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.b(false))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                qn.a((byte) 44, 60, -34);
                break L2;
              }
            }
            L3: {
              this.field_v = param2;
              var4_int = param2.length();
              if (this.field_T == -1) {
                break L3;
              } else {
                if (this.field_T < var4_int) {
                  this.field_v = this.field_v.substring(0, this.field_T);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_v.length();
              this.field_X = dupTemp$2;
              this.field_Q = dupTemp$2;
              if (!param1) {
                this.g((byte) 63);
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
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qn.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final String b(boolean param0) {
        int var2 = this.field_Q <= this.field_X ? this.field_Q : this.field_X;
        if (param0) {
            return (String) null;
        }
        int var3 = this.field_X < this.field_Q ? this.field_Q : this.field_X;
        return this.field_v.substring(var2, var3);
    }

    private final void h(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                L1: {
                  if (param0 == -18) {
                    break L1;
                  } else {
                    this.field_W = true;
                    break L1;
                  }
                }
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.j(1);
                this.a(var2, 99);
                break L0;
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

    private final int l(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = Chess.field_G;
          if (param0 > 47) {
            break L0;
          } else {
            this.field_V = -33L;
            break L0;
          }
        }
        if (this.field_Q == 0) {
          return this.field_Q;
        } else {
          var2 = -1 + this.field_Q;
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (-33 == (this.field_v.charAt(var2 + -1) ^ -1)) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        mg var8 = null;
        long var6 = 0L;
        if (param2 > -80) {
            this.field_Q = -93;
        }
        if (null != this.field_n && 0 == param1) {
            this.field_n.a((byte) 124, param3, param0, this.field_H, (mf) (this));
            if (!(!(this.field_n instanceof mg))) {
                var8 = (mg) ((Object) this.field_n);
                if (this.field_Q != this.field_X) {
                    var8.a((mf) (this), param3, this.field_Q, param0, 122, this.field_X);
                }
                var6 = ud.a(2);
                if (500L > (-this.field_V + var6) % 1000L) {
                    var8.a(param3, this.field_Q, param0, (byte) -125, (mf) (this));
                }
            }
        }
    }

    private final void a(String param0, int param1) {
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
              if (param1 >= 93) {
                break L1;
              } else {
                this.g((byte) 65);
                break L1;
              }
            }
            L2: {
              if (this.field_T != -1) {
                var3_int = this.field_T - this.field_v.length();
                if ((var3_int ^ -1) > -1) {
                  param0 = param0.substring(0, var3_int);
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_Q != this.field_v.length()) {
                this.field_v = this.field_v.substring(0, this.field_Q) + param0 + this.field_v.substring(this.field_Q, this.field_v.length());
                break L3;
              } else {
                this.field_v = this.field_v + param0;
                break L3;
              }
            }
            this.field_Q = this.field_Q + param0.length();
            this.field_X = this.field_Q;
            this.g((byte) 63);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("qn.A(");

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
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        this.field_Q = param0;
        if (param1 < 55) {
            this.field_W = false;
        }
        if (!ok.field_Jb[81]) {
            this.field_X = this.field_Q;
        }
    }

    public static void m(int param0) {
        field_R = null;
        if (param0 != -14) {
            field_R = (String) null;
        }
        field_U = null;
        field_P = null;
    }

    qn(String param0, rg param1, int param2) {
        super(param0, param1);
        this.field_S = false;
        this.field_N = -1;
        this.field_O = 0L;
        try {
            this.field_n = a.field_a.field_o;
            this.field_T = param2;
            this.a(0, true, param0);
            this.field_W = true;
            this.field_V = ud.a(2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          L0: {
            if (param0 == 107) {
              var3_int = 0;
              var4 = id.field_c;
              L1: while (true) {
                if (var3_int >= bd.field_e.length) {
                  stackIn_15_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = ec.field_l[var3_int];
                    if ((var5 ^ -1) > -1) {
                      var4 = var4 + qd.field_r;
                      break L2;
                    } else {
                      var6 = in.a(bd.field_e[var3_int], 71, true);
                      var4 = var4 + mf.field_z;
                      var7 = of.field_k + -(var6 >> 475785921);
                      if (ve.a(var4, var7 + -gm.field_e, var6 + (gm.field_e << -5310527), param2, (fh.field_e << -19543679) + ug.field_a, 2, param1)) {
                        stackIn_10_0 = var5;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = var4 + ((fh.field_e << -1606804639) - (-mf.field_z - ug.field_a));
                        break L2;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 104;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "qn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != -17513) {
            field_U = (nk) null;
        }
        return li.field_e[65535 & (int)(param1 * 32768.0 / 3.141592653589793)];
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Chess.field_G;
        if (param0 == -23811) {
          var2 = this.field_v.length();
          if (this.field_Q == var2) {
            return this.field_Q;
          } else {
            var3 = 1 + this.field_Q;
            L0: while (true) {
              L1: {
                if (var2 <= var3) {
                  break L1;
                } else {
                  if (this.field_v.charAt(-1 + var3) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          }
        } else {
          return 12;
        }
    }

    private final void f(byte param0) {
        this.e((byte) -98);
        this.j(param0 ^ 78);
        if (param0 != 79) {
            this.h((byte) 7);
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_58_0 = 0;
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
            this.field_V = ud.a(2);
            if (param0 == 60) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                if (param2 == -1) {
                  L1: {
                    if (32 > param0) {
                      break L1;
                    } else {
                      if (param0 <= 126) {
                        L2: {
                          if (this.field_X == this.field_Q) {
                            break L2;
                          } else {
                            this.j(1);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (0 == (this.field_T ^ -1)) {
                              break L4;
                            } else {
                              if (this.field_v.length() >= this.field_T) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (this.field_Q < this.field_v.length()) {
                              this.field_v = this.field_v.substring(0, this.field_Q) + param0 + this.field_v.substring(this.field_Q, this.field_v.length());
                              this.field_Q = this.field_Q + 1;
                              this.field_X = this.field_Q;
                              break L5;
                            } else {
                              this.field_v = this.field_v + param0;
                              dupTemp$0 = this.field_v.length();
                              this.field_Q = dupTemp$0;
                              this.field_X = dupTemp$0;
                              break L5;
                            }
                          }
                          this.g((byte) 63);
                          break L3;
                        }
                        stackIn_76_0 = 1;
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if (-86 == (param1 ^ -1)) {
                      if (this.field_Q != this.field_X) {
                        this.j(1);
                        stackIn_65_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        if (0 < this.field_Q) {
                          this.field_X = this.field_Q - 1;
                          this.j(1);
                          stackIn_63_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if ((param1 ^ -1) != -102) {
                        if (-14 != (param1 ^ -1)) {
                          if (-97 == (param1 ^ -1)) {
                            if ((this.field_Q ^ -1) >= -1) {
                              break L6;
                            } else {
                              L7: {
                                stackIn_56_0 = this;

                                if (!ok.field_Jb[82]) {
                                  stackIn_57_0 = this;
                                  stackIn_57_1 = this.field_Q - 1;
                                  break L7;
                                } else {
                                  stackIn_57_0 = this;
                                  stackIn_57_1 = this.l(param2 ^ -113);
                                  break L7;
                                }
                              }
                              this.a(stackIn_57_1, (byte) 56);
                              stackIn_58_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          } else {
                            if ((param1 ^ -1) == -98) {
                              if (this.field_Q < this.field_v.length()) {
                                L8: {
                                  stackIn_50_0 = this;

                                  if (ok.field_Jb[82]) {
                                    stackIn_51_0 = this;
                                    stackIn_51_1 = this.k(-23811);
                                    break L8;
                                  } else {
                                    stackIn_51_0 = this;
                                    stackIn_51_1 = this.field_Q - -1;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_51_1, (byte) 65);
                                stackIn_52_0 = 1;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                break L6;
                              }
                            } else {
                              if (102 != param1) {
                                if (-104 != (param1 ^ -1)) {
                                  if (param1 == 84) {
                                    this.c(true);
                                    stackIn_45_0 = 1;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    L9: {
                                      if (!ok.field_Jb[82]) {
                                        break L9;
                                      } else {
                                        if (-66 != (param1 ^ -1)) {
                                          break L9;
                                        } else {
                                          this.f((byte) 79);
                                          stackIn_34_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!ok.field_Jb[82]) {
                                        break L10;
                                      } else {
                                        if (66 == param1) {
                                          this.e((byte) 122);
                                          stackIn_43_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!ok.field_Jb[82]) {
                                      break L6;
                                    } else {
                                      if (-68 != (param1 ^ -1)) {
                                        break L6;
                                      } else {
                                        this.h((byte) -18);
                                        stackIn_41_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(this.field_v.length(), (byte) 99);
                                  stackIn_29_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a(0, (byte) 114);
                                stackIn_26_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          }
                        } else {
                          this.i(-12881);
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        if (this.field_Q == this.field_X) {
                          if (this.field_Q >= this.field_v.length()) {
                            break L6;
                          } else {
                            this.field_X = this.field_Q + 1;
                            this.j(param2 ^ -2);
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          this.j(1);
                          stackIn_15_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_78_0 = 0;
                  decompiledRegionSelector0 = 16;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var5);

            stackIn_81_1 = new StringBuilder().append("qn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L11;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L11;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_29_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_34_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_43_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_45_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_52_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_58_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_65_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
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
    }

    void g(byte param0) {
        if (this.field_p instanceof ha) {
            ((ha) ((Object) this.field_p)).a((qn) (this), 10999);
        }
        if (param0 != 63) {
            qn.a((byte) 32, -122, 110);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        L0: {
          var17 = Chess.field_G;
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param7 < param4) {
                lg.a(wb.field_d, false, param10, param7, param9, param1, param6, param15, param12, param11, param2, param8, param4, param5, param0, param13, param14);
                break L0;
              } else {
                lg.a(wb.field_d, false, param0, param4, param15, param1, param6, param9, param11, param12, param2, param14, param7, param5, param10, param13, param8);
                break L0;
              }
            } else {
              lg.a(wb.field_d, false, param10, param7, param9, param15, param4, param1, param2, param11, param12, param8, param6, param14, param13, param0, param5);
              break L0;
            }
          } else {
            if (param4 > param7) {
              lg.a(wb.field_d, false, param13, param6, param1, param15, param4, param9, param11, param2, param12, param5, param7, param14, param10, param0, param8);
              break L0;
            } else {
              if (param4 <= param6) {
                lg.a(wb.field_d, false, param0, param4, param15, param9, param7, param1, param2, param12, param11, param14, param6, param8, param13, param10, param5);
                break L0;
              } else {
                lg.a(wb.field_d, false, param13, param6, param1, param9, param7, param15, param12, param2, param11, param5, param4, param8, param0, param10, param14);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param3 == 0) {
            break L1;
          } else {
            qn.a(95, 0.2911132497082521);
            break L1;
          }
        }
    }

    private final void d(boolean param0) {
        ub var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        mg var9;
        var8 = Chess.field_G;
        if (this.field_W) {
          if (!(this.field_n instanceof mg)) {
            return;
          } else {
            var9 = (mg) ((Object) this.field_n);
            var3 = var9.a((mf) (this), -23159);
            var4 = var3.c((byte) -24);
            var5 = var9.b((mf) (this), 0);
            var6 = var9.a((byte) 76) >> -2083444415;
            if (var4 >= -var6 + var5) {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  qn.m(61);
                  break L0;
                }
              }
              L1: {
                var7 = this.field_A - -var3.a(-5940, this.field_Q);
                if (var7 <= -var6 + var5) {
                  if (var6 > var7) {
                    this.field_A = -var7 - (-var6 - this.field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_A = this.field_A + -var7 + (var5 - var6);
                  break L1;
                }
              }
              L2: {
                if (this.field_A > 0) {
                  this.field_A = 0;
                  break L2;
                } else {
                  if (var6 + -var5 <= this.field_A) {
                    break L2;
                  } else {
                    this.field_A = -var5 + var6;
                    break L2;
                  }
                }
              }
              return;
            } else {
              this.field_A = 0;
              this.field_k = 0;
              return;
            }
          }
        } else {
          this.field_A = 0;
          this.field_k = 0;
          return;
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        mg var5 = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(param0, -51, param2, param3);
            if (param1 < -6) {
              L1: {
                this.d(true);
                if (1 != this.field_q) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_n instanceof mg) {
                      var5 = (mg) ((Object) this.field_n);
                      var6 = var5.a(rf.field_b, param3, -4, param0, (mf) (this), hn.field_k);
                      if (0 != (var6 ^ -1)) {
                        L3: {
                          if (!this.field_S) {
                            break L3;
                          } else {
                            if (this.field_N <= var6) {
                              break L3;
                            } else {
                              if (this.field_X >= var6) {
                                break L3;
                              } else {
                                var6 = this.field_N;
                                break L3;
                              }
                            }
                          }
                        }
                        this.field_Q = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  this.field_V = ud.a(2);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("qn.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        this.field_X = 0;
        this.field_Q = 0;
        if (param0 != -12881) {
            this.h((byte) 102);
        }
        this.field_v = "";
        this.g((byte) 63);
    }

    static {
    }
}
