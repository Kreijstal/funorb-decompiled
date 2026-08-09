/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends ng {
    private int field_bb;
    private int field_R;
    private long field_T;
    private int field_U;
    private long field_X;
    private boolean field_Y;
    private boolean field_ab;
    private int field_S;
    static ka field_O;
    static vi field_W;
    static ge[] field_V;
    static ll field_P;
    static lj field_cb;
    static int field_Q;
    static boolean field_Z;

    private final void d(byte param0) {
        lg var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        gd var9;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (this.field_ab) {
          if (this.field_q instanceof gd) {
            var9 = (gd) ((Object) this.field_q);
            var3 = var9.a(-96, (ee) (this));
            var4 = var3.b((byte) 57);
            var5 = var9.a((ee) (this), (byte) -1);
            var6 = var9.a(param0 ^ -6) >> -213221343;
            if (var4 >= -var6 + var5) {
              if (param0 == 5) {
                L0: {
                  var7 = this.field_u + var3.a(-109, this.field_R);
                  if (var5 - var6 < var7) {
                    this.field_u = this.field_u + (-var7 + var5 + -var6);
                    break L0;
                  } else {
                    if (var7 >= var6) {
                      break L0;
                    } else {
                      this.field_u = -var7 + (var6 + this.field_u);
                      break L0;
                    }
                  }
                }
                L1: {
                  if ((this.field_u ^ -1) >= -1) {
                    if (-var5 - -var6 <= this.field_u) {
                      break L1;
                    } else {
                      this.field_u = var6 + -var5;
                      break L1;
                    }
                  } else {
                    this.field_u = 0;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              this.field_j = 0;
              this.field_u = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_u = 0;
          this.field_j = 0;
          return;
        }
    }

    dj(String param0, gg param1, int param2) {
        super(param0, param1);
        this.field_Y = false;
        this.field_S = -1;
        this.field_T = 0L;
        try {
            this.field_q = kl.field_e.field_m;
            this.field_bb = param2;
            this.a(param0, true, (byte) -21);
            this.field_ab = true;
            this.field_X = ol.a(256);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int h(int param0) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 >= 101) {
          if (this.field_R != 0) {
            var2 = -1 + this.field_R;
            L0: while (true) {
              L1: {
                if (var2 <= 0) {
                  break L1;
                } else {
                  if (-33 == (this.field_v.charAt(var2 - 1) ^ -1)) {
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
            return this.field_R;
          }
        } else {
          return -48;
        }
    }

    void a(ee param0, int param1, byte param2, int param3) {
        int var6 = 0;
        gd var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -97) {
                break L1;
              } else {
                dj.c((byte) -78);
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, (byte) -99, param3);
              this.d((byte) 5);
              if (-2 == (this.field_z ^ -1)) {
                L3: {
                  if (!(this.field_q instanceof gd)) {
                    break L3;
                  } else {
                    var7 = (gd) ((Object) this.field_q);
                    var6 = var7.a(ph.field_d, kc.field_u, (ee) (this), (byte) -41, param3, param1);
                    if ((var6 ^ -1) != 0) {
                      L4: {
                        if (!this.field_Y) {
                          break L4;
                        } else {
                          if (var6 >= this.field_S) {
                            break L4;
                          } else {
                            if (this.field_U >= var6) {
                              break L4;
                            } else {
                              var6 = this.field_S;
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_R = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_X = ol.a(256);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("dj.U(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != 65) {
            return;
        }
        field_W = null;
        field_O = null;
        field_P = null;
        field_V = null;
        field_cb = null;
    }

    private final void e(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            if (param0 > 11) {
              try {
                L0: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.d(true);
                  this.a(var2, 1);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void i(int param0) {
        this.field_v = "";
        if (param0 != -22617) {
            this.field_S = 38;
        }
        this.field_R = 0;
        this.field_U = 0;
        this.k(-105);
    }

    private final void a(int param0, int param1) {
        if (param1 != -1) {
            this.field_ab = true;
        }
        this.field_R = param0;
        if (!(nj.field_c[81])) {
            this.field_U = this.field_R;
        }
    }

    void k(int param0) {
        if (param0 >= -79) {
            return;
        }
        if (this.field_k instanceof cc) {
            ((cc) ((Object) this.field_k)).b((dj) (this), 3);
        }
    }

    private final String j(int param0) {
        if (param0 != -12349) {
            this.k(-78);
        }
        int var2 = this.field_R > this.field_U ? this.field_U : this.field_R;
        int var3 = this.field_U >= this.field_R ? this.field_U : this.field_R;
        return this.field_v.substring(var2, var3);
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
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
            L1: {
              var3_int = -47 % ((-34 - param1) / 32);
              if (this.field_bb != -1) {
                var4 = this.field_bb - this.field_v.length();
                if (-1 >= (var4 ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var4);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_R == this.field_v.length()) {
                this.field_v = this.field_v + param0;
                break L2;
              } else {
                this.field_v = this.field_v.substring(0, this.field_R) + param0 + this.field_v.substring(this.field_R, this.field_v.length());
                break L2;
              }
            }
            this.field_R = this.field_R + param0.length();
            this.field_U = this.field_R;
            this.k(-115);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dj.P(");

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
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        if (param0 < 74) {
            return;
        }
        this.g(0);
        this.d(true);
    }

    final static void f(byte param0) {
        if (!(lj.field_q)) {
            throw new IllegalStateException();
        }
        fh.field_g = true;
        wb.a(true, (byte) -73);
        if (param0 > -51) {
            dj.c((byte) -1);
        }
        gj.field_c = 0;
    }

    final void a(String param0, boolean param1, byte param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_v = param0;
              var4_int = param0.length();
              if (this.field_bb == -1) {
                break L2;
              } else {
                if (var4_int <= this.field_bb) {
                  break L2;
                } else {
                  this.field_v = this.field_v.substring(0, this.field_bb);
                  break L2;
                }
              }
            }
            if (param2 == -21) {
              L3: {
                dupTemp$2 = this.field_v.length();
                this.field_U = dupTemp$2;
                this.field_R = dupTemp$2;
                if (!param1) {
                  this.k(-93);
                  break L3;
                } else {
                  break L3;
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
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("dj.T(");

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
          throw oj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        int discarded$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_X = ol.a(256);
              if (param2 >= 9) {
                break L1;
              } else {
                discarded$0 = this.h(110);
                break L1;
              }
            }
            if (param1 == 60) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 62) {
                L2: {
                  if (32 > param1) {
                    break L2;
                  } else {
                    if (param1 > 126) {
                      break L2;
                    } else {
                      L3: {
                        if (this.field_R != this.field_U) {
                          this.d(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if ((this.field_bb ^ -1) == 0) {
                            break L5;
                          } else {
                            if (this.field_v.length() >= this.field_bb) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (this.field_R >= this.field_v.length()) {
                            this.field_v = this.field_v + param1;
                            dupTemp$1 = this.field_v.length();
                            this.field_R = dupTemp$1;
                            this.field_U = dupTemp$1;
                            break L6;
                          } else {
                            this.field_v = this.field_v.substring(0, this.field_R) + param1 + this.field_v.substring(this.field_R, this.field_v.length());
                            this.field_R = this.field_R + 1;
                            this.field_U = this.field_R;
                            break L6;
                          }
                        }
                        this.k(-105);
                        break L4;
                      }
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L7: {
                  if (param0 != 85) {
                    if (101 != param0) {
                      if (-14 != (param0 ^ -1)) {
                        if (param0 != 96) {
                          if (97 != param0) {
                            if (param0 != 102) {
                              if ((param0 ^ -1) == -104) {
                                this.a(this.field_v.length(), -1);
                                stackIn_75_0 = 1;
                                decompiledRegionSelector0 = 14;
                                break L0;
                              } else {
                                if (param0 != 84) {
                                  L8: {
                                    if (!nj.field_c[82]) {
                                      break L8;
                                    } else {
                                      if (65 != param0) {
                                        break L8;
                                      } else {
                                        this.g((byte) 79);
                                        stackIn_64_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!nj.field_c[82]) {
                                      break L9;
                                    } else {
                                      if ((param0 ^ -1) == -67) {
                                        this.g(0);
                                        stackIn_73_0 = 1;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (!nj.field_c[82]) {
                                    break L7;
                                  } else {
                                    if ((param0 ^ -1) != -68) {
                                      break L7;
                                    } else {
                                      this.e((byte) 65);
                                      stackIn_71_0 = 1;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.h((byte) -108);
                                  stackIn_60_0 = 1;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            } else {
                              this.a(0, -1);
                              stackIn_56_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            if (this.field_R >= this.field_v.length()) {
                              break L7;
                            } else {
                              L10: {
                                stackIn_51_0 = this;

                                if (nj.field_c[82]) {
                                  stackIn_52_0 = this;
                                  stackIn_52_1 = this.e(true);
                                  break L10;
                                } else {
                                  stackIn_52_0 = this;
                                  stackIn_52_1 = 1 + this.field_R;
                                  break L10;
                                }
                              }
                              this.a(stackIn_52_1, -1);
                              stackIn_53_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          if (-1 <= (this.field_R ^ -1)) {
                            break L7;
                          } else {
                            L11: {
                              stackIn_44_0 = this;

                              if (nj.field_c[82]) {
                                stackIn_45_0 = this;
                                stackIn_45_1 = this.h(121);
                                break L11;
                              } else {
                                stackIn_45_0 = this;
                                stackIn_45_1 = this.field_R + -1;
                                break L11;
                              }
                            }
                            this.a(stackIn_45_1, -1);
                            stackIn_46_0 = 1;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        this.i(-22617);
                        stackIn_39_0 = 1;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      if (this.field_U != this.field_R) {
                        this.d(true);
                        stackIn_36_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (this.field_R < this.field_v.length()) {
                          this.field_U = 1 + this.field_R;
                          this.d(true);
                          stackIn_34_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                    }
                  } else {
                    if (this.field_R != this.field_U) {
                      this.d(true);
                      stackIn_28_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (-1 > (this.field_R ^ -1)) {
                        this.field_U = -1 + this.field_R;
                        this.d(true);
                        stackIn_26_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                stackIn_77_0 = 0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("dj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L12;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L12;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_26_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_46_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_53_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_56_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_60_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_64_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_71_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_73_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_75_0 != 0;
                                    } else {
                                      return stackIn_77_0 != 0;
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

    final static og c(byte param0) {
        try {
            Throwable var1 = null;
            og stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 > 66) {
                    break L1;
                  } else {
                    field_P = (ll) null;
                    break L1;
                  }
                }
                stackIn_3_0 = (og) (Class.forName("sc").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
            field_P = (ll) null;
        }
        if (!(this.field_U == this.field_R)) {
            var2 = this.field_R > this.field_U ? this.field_U : this.field_R;
            var3 = this.field_U < this.field_R ? this.field_R : this.field_U;
            this.field_R = var2;
            this.field_U = var2;
            this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
            this.k(-100);
        }
    }

    private final int e(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
          var2 = this.field_v.length();
          if (this.field_R != var2) {
            var3 = this.field_R - -1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (this.field_v.charAt(var3 + -1) == 32) {
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
            return this.field_R;
          }
        } else {
          return -110;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        gd var8 = null;
        long var6 = 0L;
        if (param2) {
            return;
        }
        if (this.field_q != null && -1 == (param3 ^ -1)) {
            this.field_q.a((ee) (this), param0, param1, (byte) 97, this.field_F);
            if (!(!(this.field_q instanceof gd))) {
                var8 = (gd) ((Object) this.field_q);
                if (this.field_R != this.field_U) {
                    var8.a((byte) 3, param0, this.field_U, this.field_R, param1, (ee) (this));
                }
                var6 = ol.a(256);
                if (500L > (-this.field_X + var6) % 1000L) {
                    var8.a(param1, param0, (ee) (this), this.field_R, (byte) 77);
                }
            }
        }
    }

    private final void g(int param0) {
        String var2 = this.j(-12349);
        if (!(param0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(param0 + -12349))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void h(byte param0) {
        int var2 = -76 / ((param0 - -21) / 61);
        if (this.field_k instanceof cc) {
            ((cc) ((Object) this.field_k)).a((dj) (this), 5);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(this.field_q instanceof gd)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((gd) ((Object) this.field_q)).a(ph.field_d, kc.field_u, (ee) (this), (byte) 72, param3, param4);
                    stackIn_4_0 = this;

                    if (0 != (var8_int ^ -1)) {
                      stackIn_5_0 = this;
                      stackIn_5_1 = var8_int;
                      break L2;
                    } else {
                      stackIn_5_0 = this;
                      stackIn_5_1 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, param2 ^ 80);
                    var8_long = ol.a(param2 + 337);
                    stackIn_7_0 = this;

                    if (var8_long + -this.field_T >= 250L) {
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
                    ((dj) (this)).field_Y = stackIn_8_1 != 0;
                    if (this.field_Y) {
                      L5: {
                        this.field_U = this.h(param2 ^ -41);
                        this.field_R = this.e(true);
                        if (0 >= this.field_R) {
                          break L5;
                        } else {
                          if (this.field_v.charAt(this.field_R + -1) == 32) {
                            this.field_R = this.field_R - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_S = this.field_R;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_T = var8_long;
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("dj.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    static {
        field_W = new vi();
        field_Q = -1;
        field_P = new ll();
    }
}
