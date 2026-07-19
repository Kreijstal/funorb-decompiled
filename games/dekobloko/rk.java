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
          L0: {
            field_K = (java.security.SecureRandom) null;
            if (this.field_v instanceof qh) {
              ((qh) ((Object) this.field_v)).a(16737894, (rk) (this));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_v instanceof qh) {
              ((qh) ((Object) this.field_v)).a(16737894, (rk) (this));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
              dupTemp$3 = this.field_E.length();
              this.field_M = dupTemp$3;
              this.field_S = dupTemp$3;
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
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("rk.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        cf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nl var9 = null;
        var8 = client.field_A ? 1 : 0;
        if (!this.field_T) {
          this.field_x = 0;
          this.field_F = 0;
          return;
        } else {
          if (!(this.field_p instanceof nl)) {
            return;
          } else {
            var9 = (nl) ((Object) this.field_p);
            var3 = var9.a((ce) (this), (byte) 118);
            var4 = var3.a(false);
            if (param0 == -17122) {
              var5 = var9.a(false, (ce) (this));
              var6 = var9.a((byte) -106) >> -1897107391;
              if (var4 >= var5 + -var6) {
                var7 = this.field_x + var3.a((byte) -94, this.field_S);
                if (var5 + -var6 < var7) {
                  this.field_x = this.field_x + (-var6 + var5) + -var7;
                  if (0 >= this.field_x) {
                    if (-var5 - -var6 > this.field_x) {
                      this.field_x = -var5 - -var6;
                      if (var8 != 0) {
                        this.field_x = 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.field_x = 0;
                    return;
                  }
                } else {
                  if (var6 > var7) {
                    this.field_x = this.field_x - (-var6 + var7);
                    if (var8 != 0) {
                      this.field_x = this.field_x + (-var6 + var5) + -var7;
                      if (0 >= this.field_x) {
                        if (-var5 - -var6 > this.field_x) {
                          this.field_x = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_x = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_x = 0;
                        return;
                      }
                    } else {
                      if (0 >= this.field_x) {
                        if (-var5 - -var6 > this.field_x) {
                          this.field_x = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_x = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_x = 0;
                        return;
                      }
                    }
                  } else {
                    if (0 >= this.field_x) {
                      if (-var5 - -var6 > this.field_x) {
                        this.field_x = -var5 - -var6;
                        if (var8 != 0) {
                          this.field_x = 0;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_x = 0;
                      return;
                    }
                  }
                }
              } else {
                this.field_F = 0;
                this.field_x = 0;
                return;
              }
            } else {
              this.field_M = -109;
              var5 = var9.a(false, (ce) (this));
              var6 = var9.a((byte) -106) >> -1897107391;
              if (var4 >= var5 + -var6) {
                var7 = this.field_x + var3.a((byte) -94, this.field_S);
                if (var5 + -var6 >= var7) {
                  if (var6 > var7) {
                    L0: {
                      this.field_x = this.field_x - (-var6 + var7);
                      if (var8 == 0) {
                        break L0;
                      } else {
                        this.field_x = this.field_x + (-var6 + var5) + -var7;
                        break L0;
                      }
                    }
                    if (0 >= this.field_x) {
                      if (-var5 - -var6 > this.field_x) {
                        this.field_x = -var5 - -var6;
                        if (var8 == 0) {
                          return;
                        } else {
                          this.field_x = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_x = 0;
                      return;
                    }
                  } else {
                    L1: {
                      if (0 < this.field_x) {
                        this.field_x = 0;
                        break L1;
                      } else {
                        if (-var5 - -var6 <= this.field_x) {
                          break L1;
                        } else {
                          this.field_x = -var5 - -var6;
                          if (var8 == 0) {
                            break L1;
                          } else {
                            this.field_x = 0;
                            break L1;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L2: {
                    this.field_x = this.field_x + (-var6 + var5) + -var7;
                    if (0 < this.field_x) {
                      this.field_x = 0;
                      break L2;
                    } else {
                      if (-var5 - -var6 <= this.field_x) {
                        break L2;
                      } else {
                        this.field_x = -var5 - -var6;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          this.field_x = 0;
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                this.field_F = 0;
                this.field_x = 0;
                return;
              }
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = client.field_A ? 1 : 0;
        var2 = this.field_E.length();
        if (var2 == this.field_S) {
          return this.field_S;
        } else {
          var3 = 1 + this.field_S;
          L0: while (true) {
            if (var3 < var2) {
              var6 = this.field_E.charAt(var3 + -1) ^ -1;
              var5 = -33;
              if (var4 != 0) {
                if (var5 == var6) {
                  return var3;
                } else {
                  this.field_X = 46;
                  return var3;
                }
              } else {
                if (var5 != var6) {
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    if (param0 != -30) {
                      this.field_X = 46;
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                } else {
                  if (param0 != -30) {
                    this.field_X = 46;
                    return var3;
                  } else {
                    return var3;
                  }
                }
              }
            } else {
              if (param0 != -30) {
                this.field_X = 46;
                return var3;
              } else {
                return var3;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_p instanceof nl) {
                L1: {
                  var8_int = ((nl) ((Object) this.field_p)).a(param5, -257, (ce) (this), param4, pm.field_f, bh.field_g);
                  stackOut_3_0 = this;
                  stackOut_3_1 = param6 ^ 30294;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (0 == (var8_int ^ -1)) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, stackIn_6_2);
                  var8_long = ik.a(4);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -this.field_ab + var8_long) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
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
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
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
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("rk.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
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
            return;
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
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
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
                L3: {
                  if (this.field_S == this.field_E.length()) {
                    break L3;
                  } else {
                    this.field_E = this.field_E.substring(0, this.field_S) + param0 + this.field_E.substring(this.field_S, this.field_E.length());
                    if (!client.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_E = this.field_E + param0;
                break L2;
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("rk.I(");
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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
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
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
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
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.f((byte) -92);
                this.a(var2_ref, true);
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

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        long var6 = 0L;
        ce var8 = null;
        nl var9 = null;
        if (param1 <= -103) {
          if (null != this.field_p) {
            if (param2 == 0) {
              this.field_p.a(this.field_I, param0, param3, (byte) -110, (ce) (this));
              if (this.field_p instanceof nl) {
                var9 = (nl) ((Object) this.field_p);
                if (this.field_M == this.field_S) {
                  var6 = ik.a(4);
                  if (((var6 + -this.field_Z) % 1000L ^ -1L) > -501L) {
                    var9.a((ce) (this), this.field_S, 1, param0, param3);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a(this.field_M, this.field_S, param3, param0, -123, (ce) (this));
                  var6 = ik.a(4);
                  if (((var6 + -this.field_Z) % 1000L ^ -1L) > -501L) {
                    var9.a((ce) (this), this.field_S, 1, param0, param3);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var8 = (ce) null;
          discarded$1 = this.a(-88, -47, (ce) null, '%');
          if (null != this.field_p) {
            if (param2 == 0) {
              this.field_p.a(this.field_I, param0, param3, (byte) -110, (ce) (this));
              if (this.field_p instanceof nl) {
                var9 = (nl) ((Object) this.field_p);
                if (this.field_M == this.field_S) {
                  var6 = ik.a(4);
                  if (((var6 + -this.field_Z) % 1000L ^ -1L) > -501L) {
                    var9.a((ce) (this), this.field_S, 1, param0, param3);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a(this.field_M, this.field_S, param3, param0, -123, (ce) (this));
                  var6 = ik.a(4);
                  if (((var6 + -this.field_Z) % 1000L ^ -1L) > -501L) {
                    var9.a((ce) (this), this.field_S, 1, param0, param3);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        nl var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
              super.a(param0, 94, param2, param3);
              if (param1 >= 38) {
                break L1;
              } else {
                this.field_X = 63;
                break L1;
              }
            }
            L2: {
              this.k(-17122);
              if (-2 != (this.field_o ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (!(this.field_p instanceof nl)) {
                    break L3;
                  } else {
                    var7 = (nl) ((Object) this.field_p);
                    var6 = var7.a(param3, -257, (ce) (this), param2, pm.field_f, bh.field_g);
                    if ((var6 ^ -1) == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.field_W) {
                          break L4;
                        } else {
                          if (this.field_Q <= var6) {
                            break L4;
                          } else {
                            if (this.field_M < var6) {
                              var6 = this.field_Q;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_S = var6;
                      break L3;
                    }
                  }
                }
                this.field_Z = ik.a(4);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("rk.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void m(int param0) {
        this.field_M = param0;
        this.field_E = "";
        this.field_S = 0;
        this.l(18929);
    }

    private final String i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_S <= this.field_M) {
            stackOut_2_0 = this.field_S;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_M;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 <= 102) {
          return (String) null;
        } else {
          L1: {
            if (this.field_M < this.field_S) {
              stackOut_6_0 = this.field_S;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_M;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_E.substring(var2, var3);
        }
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
        L0: {
          this.field_S = param1;
          if (!bj.field_d[81]) {
            this.field_M = this.field_S;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -30305) {
          this.field_Z = 4L;
          return;
        } else {
          return;
        }
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            String var3 = null;
            L0: {
              var2 = this.i(127);
              if (-1 > (var2.length() ^ -1)) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.i(103))), (java.awt.datatransfer.ClipboardOwner) null);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 > -96) {
              var3 = (String) null;
              this.a((String) null, true);
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

    final boolean a(int param0, int param1, ce param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
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
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_30_0 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
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
                            L7: {
                              if (this.field_S < this.field_E.length()) {
                                break L7;
                              } else {
                                this.field_E = this.field_E + param3;
                                dupTemp$1 = this.field_E.length();
                                this.field_S = dupTemp$1;
                                this.field_M = dupTemp$1;
                                if (!client.field_A) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            this.field_E = this.field_E.substring(0, this.field_S) + param3 + this.field_E.substring(this.field_S, this.field_E.length());
                            this.field_S = this.field_S + 1;
                            this.field_M = this.field_S;
                            break L6;
                          }
                          this.l(18929);
                          break L4;
                        }
                        stackOut_74_0 = 1;
                        stackIn_75_0 = stackOut_74_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L8: {
                    if ((param1 ^ -1) == -86) {
                      if (this.field_M == this.field_S) {
                        if (this.field_S <= 0) {
                          break L8;
                        } else {
                          this.field_M = -1 + this.field_S;
                          this.f((byte) 113);
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        this.f((byte) -94);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    } else {
                      if (param1 != 101) {
                        if ((param1 ^ -1) != -14) {
                          if ((param1 ^ -1) != -97) {
                            if (param1 == 97) {
                              if (this.field_S >= this.field_E.length()) {
                                break L8;
                              } else {
                                L9: {
                                  stackOut_53_0 = this;
                                  stackOut_53_1 = -30305;
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  if (bj.field_d[82]) {
                                    stackOut_55_0 = this;
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = this.e((byte) -30);
                                    stackIn_56_0 = stackOut_55_0;
                                    stackIn_56_1 = stackOut_55_1;
                                    stackIn_56_2 = stackOut_55_2;
                                    break L9;
                                  } else {
                                    stackOut_54_0 = this;
                                    stackOut_54_1 = stackIn_54_1;
                                    stackOut_54_2 = 1 + this.field_S;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_56_1 = stackOut_54_1;
                                    stackIn_56_2 = stackOut_54_2;
                                    break L9;
                                  }
                                }
                                this.b(stackIn_56_1, stackIn_56_2);
                                stackOut_56_0 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              }
                            } else {
                              if (102 != param1) {
                                if (param1 == 103) {
                                  this.b(-30305, this.field_E.length());
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (-85 != (param1 ^ -1)) {
                                    L10: {
                                      if (!bj.field_d[82]) {
                                        break L10;
                                      } else {
                                        if (-66 == (param1 ^ -1)) {
                                          this.g((byte) -76);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!bj.field_d[82]) {
                                        break L11;
                                      } else {
                                        if (66 == param1) {
                                          this.h((byte) -101);
                                          stackOut_46_0 = 1;
                                          stackIn_47_0 = stackOut_46_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!bj.field_d[82]) {
                                      break L8;
                                    } else {
                                      if ((param1 ^ -1) != -68) {
                                        break L8;
                                      } else {
                                        this.h(118);
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.b(false);
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              } else {
                                this.b(-30305, 0);
                                stackOut_30_0 = 1;
                                stackIn_31_0 = stackOut_30_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          } else {
                            if (0 < this.field_S) {
                              L12: {
                                stackOut_23_0 = this;
                                stackOut_23_1 = -30305;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (bj.field_d[82]) {
                                  stackOut_25_0 = this;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = this.n(0);
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  stackIn_26_2 = stackOut_25_2;
                                  break L12;
                                } else {
                                  stackOut_24_0 = this;
                                  stackOut_24_1 = stackIn_24_1;
                                  stackOut_24_2 = -1 + this.field_S;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  stackIn_26_2 = stackOut_24_2;
                                  break L12;
                                }
                              }
                              this.b(stackIn_26_1, stackIn_26_2);
                              stackOut_26_0 = 1;
                              stackIn_27_0 = stackOut_26_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L8;
                            }
                          }
                        } else {
                          this.m(0);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        if (this.field_S != this.field_M) {
                          this.f((byte) -65);
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (this.field_S < this.field_E.length()) {
                            this.field_M = 1 + this.field_S;
                            this.f((byte) -50);
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  var5_int = -114 / ((-22 - param0) / 49);
                  stackOut_76_0 = 0;
                  stackIn_77_0 = stackOut_76_0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("rk.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L13;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param3 + ')');
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

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        char stackIn_6_0 = 0;
        char stackIn_7_0 = 0;
        char stackOut_5_0 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param0 != this.field_S) {
          var2 = this.field_S - 1;
          L0: while (true) {
            if (0 < var2) {
              stackOut_5_0 = this.field_E.charAt(var2 - 1);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var3 == 0) {
                if (stackIn_7_0 != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return var2;
            }
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
