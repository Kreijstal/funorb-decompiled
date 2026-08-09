/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends je {
    private hd field_Tb;
    private je field_Ob;
    private int field_Kb;
    static int[][] field_Vb;
    private boolean field_Nb;
    private int field_Mb;
    private int field_Jb;
    static long field_Lb;
    private boolean field_Ib;
    private long field_Wb;
    je field_Pb;
    private int field_Ub;
    private StringBuilder field_Rb;
    private wo field_Sb;
    private je field_Xb;
    private int field_Qb;

    private final int c(int param0, int param1) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 48) {
          var3 = 0;
          var4 = 0;
          var5 = this.field_Rb.length();
          L0: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                incrementValue$1 = var3;
                var3++;
                var4 = var4 + this.field_Pb.field_Z.a(this.field_Rb.charAt(incrementValue$1));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          this.field_Qb = -37;
          var3 = 0;
          var4 = 0;
          var5 = this.field_Rb.length();
          L1: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                incrementValue$2 = var3;
                var3++;
                var4 = var4 + this.field_Pb.field_Z.a(this.field_Rb.charAt(incrementValue$2));
                continue L1;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    final void a(boolean param0) {
        up.a(' ', 0, this.field_Rb, param0);
        this.field_Qb = 0;
        this.field_Jb = 0;
        this.field_Pb.field_X = this.field_Rb.toString();
    }

    final void a(hd param0, int param1) {
        try {
            this.field_Tb = param0;
            if (param1 != 176) {
                dp.n(63);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5 = am.field_K;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "dp.O(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 != -123) {
            dp.f((byte) -111);
            field_Vb = (int[][]) null;
            return;
        }
        field_Vb = (int[][]) null;
    }

    private dp(long param0, je param1, je param2, je param3, int param4) {
        super(param0, param1);
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Mb = -1;
        this.field_Nb = false;
        this.field_Ib = false;
        this.field_Wb = 0L;
        try {
          L0: {
            L1: {
              this.field_Ub = param4;
              this.field_Xb = new je(0L, param2);
              this.field_Pb = new je(0L, param3);
              this.field_Ob = new je(0L, param3);
              this.field_M = true;
              stackIn_3_0 = this;

              stackIn_3_1 = null;

              stackIn_3_2 = null;

              if (0 == (this.field_Ub ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = 256;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = this.field_Ub;
                break L1;
              }
            }
            ((dp) (this)).field_Rb = new StringBuilder(stackIn_4_3);
            this.field_Pb.field_X = this.field_Rb.toString();
            this.field_Ob.field_X = "";
            this.field_Ob.field_I = "|";
            this.field_fb = new at();
            this.a(this.field_Xb, 48);
            this.a(this.field_Pb, 48);
            this.a(this.field_Ob, 89);
            this.field_Y = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("dp.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = this.field_Rb.length();
          if (0 > param1) {
            param1 = 0;
            break L0;
          } else {
            if (param1 <= var4) {
              break L0;
            } else {
              param1 = var4;
              if (0 > param2) {
                param2 = 0;
                if (param0 == -98) {
                  this.field_Qb = param2;
                  this.field_Jb = param1;
                  return;
                } else {
                  discarded$6 = this.k(-15);
                  this.field_Qb = param2;
                  this.field_Jb = param1;
                  return;
                }
              } else {
                if (param2 > var4) {
                  param2 = var4;
                  if (param0 == -98) {
                    this.field_Qb = param2;
                    this.field_Jb = param1;
                    return;
                  } else {
                    discarded$7 = this.k(-15);
                    this.field_Qb = param2;
                    this.field_Jb = param1;
                    return;
                  }
                } else {
                  if (param0 == -98) {
                    this.field_Qb = param2;
                    this.field_Jb = param1;
                    return;
                  } else {
                    discarded$8 = this.k(-15);
                    this.field_Qb = param2;
                    this.field_Jb = param1;
                    return;
                  }
                }
              }
            }
          }
        }
        if (0 > param2) {
          param2 = 0;
          if (param0 != -98) {
            discarded$9 = this.k(-15);
            this.field_Qb = param2;
            this.field_Jb = param1;
            return;
          } else {
            this.field_Qb = param2;
            this.field_Jb = param1;
            return;
          }
        } else {
          if (param2 > var4) {
            param2 = var4;
            if (param0 != -98) {
              discarded$10 = this.k(-15);
              this.field_Qb = param2;
              this.field_Jb = param1;
              return;
            } else {
              this.field_Qb = param2;
              this.field_Jb = param1;
              return;
            }
          } else {
            if (param0 == -98) {
              this.field_Qb = param2;
              this.field_Jb = param1;
              return;
            } else {
              discarded$11 = this.k(-15);
              this.field_Qb = param2;
              this.field_Jb = param1;
              return;
            }
          }
        }
    }

    private final void l(int param0) {
        StringBuilder discarded$1 = null;
        int var2;
        int var3;
        String var4;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_Qb == this.field_Jb) {
            break L0;
          } else {
            L1: {
              if (this.field_Qb <= this.field_Jb) {
                stackIn_4_0 = this.field_Qb;
                break L1;
              } else {
                stackIn_4_0 = this.field_Jb;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_Jb >= this.field_Qb) {
                stackIn_7_0 = this.field_Jb;
                break L2;
              } else {
                stackIn_7_0 = this.field_Qb;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_Jb = var2;
            this.field_Qb = var2;
            var4 = this.field_Rb.toString().substring(var3, this.field_Rb.length());
            up.a(' ', var2, this.field_Rb, true);
            discarded$1 = this.field_Rb.append(var4);
            this.field_Pb.field_X = this.field_Rb.toString();
            break L0;
          }
        }
        if (param0 != 32) {
          field_Lb = -1L;
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, String param1) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        String var4 = null;
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
              if (0 != (this.field_Ub ^ -1)) {
                var3_int = this.field_Ub - this.field_Rb.length();
                if (0 == var3_int) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_Qb == this.field_Rb.length()) {
                discarded$3 = this.field_Rb.append(param1);
                break L2;
              } else {
                var4 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                up.a(' ', this.field_Qb, this.field_Rb, true);
                discarded$4 = this.field_Rb.append(param1);
                discarded$5 = this.field_Rb.append(var4);
                break L2;
              }
            }
            var3_int = 109 / ((param0 - 44) / 40);
            this.field_Pb.field_X = this.field_Rb.toString();
            this.field_Qb = this.field_Rb.length();
            this.field_Jb = this.field_Qb;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dp.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        String var2;
        int var3;
        int var4;
        if (param0 != 115) {
          L0: {
            this.p(78);
            var2 = this.field_Rb.toString();
            if (this.field_Qb <= this.field_Jb) {
              stackIn_11_0 = this.field_Qb;
              break L0;
            } else {
              stackIn_11_0 = this.field_Jb;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            if (this.field_Jb >= this.field_Qb) {
              stackIn_14_0 = this.field_Jb;
              break L1;
            } else {
              stackIn_14_0 = this.field_Qb;
              break L1;
            }
          }
          var4 = stackIn_14_0;
          return var2.substring(var3, var4);
        } else {
          L2: {
            var2 = this.field_Rb.toString();
            if (this.field_Qb <= this.field_Jb) {
              stackIn_4_0 = this.field_Qb;
              break L2;
            } else {
              stackIn_4_0 = this.field_Jb;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            if (this.field_Jb >= this.field_Qb) {
              stackIn_7_0 = this.field_Jb;
              break L3;
            } else {
              stackIn_7_0 = this.field_Qb;
              break L3;
            }
          }
          var4 = stackIn_7_0;
          return var2.substring(var3, var4);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_51_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int var4;
        String var11;
        String var12;
        if (param2 != 60) {
          if (62 != param2) {
            if (param2 < 32) {
              if (-86 != (param0 ^ -1)) {
                if (-102 != (param0 ^ -1)) {
                  if ((param0 ^ -1) != -14) {
                    if ((param0 ^ -1) == -97) {
                      if (-1 > (this.field_Qb ^ -1)) {
                        L0: {
                          if (!br.field_f[82]) {
                            stackIn_141_0 = -1 + this.field_Qb;
                            break L0;
                          } else {
                            stackIn_141_0 = this.k(-1);
                            break L0;
                          }
                        }
                        var4 = stackIn_141_0;
                        this.b(var4, false);
                        return true;
                      } else {
                        if (param1 == -26126) {
                          return false;
                        } else {
                          this.field_Wb = -48L;
                          return false;
                        }
                      }
                    } else {
                      L1: {
                        if (-98 == (param0 ^ -1)) {
                          if (this.field_Qb >= this.field_Rb.length()) {
                            break L1;
                          } else {
                            L2: {
                              if (!br.field_f[82]) {
                                stackIn_133_0 = this.field_Qb + 1;
                                break L2;
                              } else {
                                stackIn_133_0 = this.e((byte) 109);
                                break L2;
                              }
                            }
                            var4 = stackIn_133_0;
                            this.b(var4, false);
                            return true;
                          }
                        } else {
                          if ((param0 ^ -1) != -103) {
                            if (-104 != (param0 ^ -1)) {
                              if (!br.field_f[82]) {
                                if (!br.field_f[82]) {
                                  if (!br.field_f[82]) {
                                    break L1;
                                  } else {
                                    if ((param0 ^ -1) == -68) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        this.field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                } else {
                                  if ((param0 ^ -1) == -67) {
                                    this.p(param1 ^ 26164);
                                    return true;
                                  } else {
                                    if (br.field_f[82]) {
                                      if ((param0 ^ -1) == -68) {
                                        this.g((byte) -77);
                                        return true;
                                      } else {
                                        if (param1 == -26126) {
                                          return false;
                                        } else {
                                          this.field_Wb = -48L;
                                          return false;
                                        }
                                      }
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        this.field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (-66 != (param0 ^ -1)) {
                                  L3: {
                                    if (!br.field_f[82]) {
                                      break L3;
                                    } else {
                                      if ((param0 ^ -1) != -67) {
                                        break L3;
                                      } else {
                                        this.p(param1 ^ 26164);
                                        return true;
                                      }
                                    }
                                  }
                                  if (br.field_f[82]) {
                                    if ((param0 ^ -1) == -68) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      L4: {
                                        if (param1 == -26126) {
                                          break L4;
                                        } else {
                                          this.field_Wb = -48L;
                                          break L4;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    L5: {
                                      if (param1 == -26126) {
                                        break L5;
                                      } else {
                                        this.field_Wb = -48L;
                                        break L5;
                                      }
                                    }
                                    return false;
                                  }
                                } else {
                                  this.h((byte) 114);
                                  return true;
                                }
                              }
                            } else {
                              this.b(this.field_Rb.length(), false);
                              return true;
                            }
                          } else {
                            this.b(0, false);
                            return true;
                          }
                        }
                      }
                      if (param1 == -26126) {
                        return false;
                      } else {
                        this.field_Wb = -48L;
                        return false;
                      }
                    }
                  } else {
                    this.a(true);
                    return true;
                  }
                } else {
                  if (this.field_Jb == this.field_Qb) {
                    if (this.field_Qb >= this.field_Rb.length()) {
                      if (param1 == -26126) {
                        return false;
                      } else {
                        this.field_Wb = -48L;
                        return false;
                      }
                    } else {
                      this.field_Jb = 1 + this.field_Qb;
                      this.l(32);
                      return true;
                    }
                  } else {
                    this.l(32);
                    return true;
                  }
                }
              } else {
                if (this.field_Qb == this.field_Jb) {
                  if ((this.field_Qb ^ -1) >= -1) {
                    if (param1 == -26126) {
                      return false;
                    } else {
                      this.field_Wb = -48L;
                      return false;
                    }
                  } else {
                    this.field_Jb = this.field_Qb + -1;
                    this.l(32);
                    return true;
                  }
                } else {
                  this.l(32);
                  return true;
                }
              }
            } else {
              if (param2 <= 126) {
                L6: {
                  if (this.field_Qb != this.field_Jb) {
                    this.l(32);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 == this.field_Ub) {
                    L8: {
                      if (this.field_Qb != this.field_Rb.length()) {
                        var12 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                        up.a(' ', this.field_Qb, this.field_Rb, true);
                        discarded$0 = this.field_Rb.append(param2);
                        discarded$1 = this.field_Rb.append(var12);
                        break L8;
                      } else {
                        discarded$2 = this.field_Rb.append(param2);
                        break L8;
                      }
                    }
                    this.field_Pb.field_X = this.field_Rb.toString();
                    this.field_Qb = this.field_Qb + 1;
                    this.field_Jb = this.field_Qb;
                    break L7;
                  } else {
                    if (this.field_Rb.length() >= this.field_Ub) {
                      break L7;
                    } else {
                      L9: {
                        if (this.field_Qb != this.field_Rb.length()) {
                          var11 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                          up.a(' ', this.field_Qb, this.field_Rb, true);
                          discarded$3 = this.field_Rb.append(param2);
                          discarded$4 = this.field_Rb.append(var11);
                          break L9;
                        } else {
                          discarded$5 = this.field_Rb.append(param2);
                          break L9;
                        }
                      }
                      this.field_Pb.field_X = this.field_Rb.toString();
                      this.field_Qb = this.field_Qb + 1;
                      this.field_Jb = this.field_Qb;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                L10: {
                  if (-86 != (param0 ^ -1)) {
                    if (-102 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -14) {
                        if ((param0 ^ -1) == -97) {
                          if (-1 > (this.field_Qb ^ -1)) {
                            L11: {
                              if (!br.field_f[82]) {
                                stackIn_61_0 = -1 + this.field_Qb;
                                break L11;
                              } else {
                                stackIn_61_0 = this.k(-1);
                                break L11;
                              }
                            }
                            var4 = stackIn_61_0;
                            this.b(var4, false);
                            return true;
                          } else {
                            break L10;
                          }
                        } else {
                          if (-98 == (param0 ^ -1)) {
                            if (this.field_Qb >= this.field_Rb.length()) {
                              L12: {
                                if (param1 == -26126) {
                                  break L12;
                                } else {
                                  this.field_Wb = -48L;
                                  break L12;
                                }
                              }
                              return false;
                            } else {
                              L13: {
                                if (!br.field_f[82]) {
                                  stackIn_51_0 = this.field_Qb + 1;
                                  break L13;
                                } else {
                                  stackIn_51_0 = this.e((byte) 109);
                                  break L13;
                                }
                              }
                              var4 = stackIn_51_0;
                              this.b(var4, false);
                              return true;
                            }
                          } else {
                            if ((param0 ^ -1) != -103) {
                              if (-104 != (param0 ^ -1)) {
                                L14: {
                                  if (!br.field_f[82]) {
                                    break L14;
                                  } else {
                                    if (-66 != (param0 ^ -1)) {
                                      break L14;
                                    } else {
                                      this.h((byte) 114);
                                      return true;
                                    }
                                  }
                                }
                                L15: {
                                  if (!br.field_f[82]) {
                                    break L15;
                                  } else {
                                    if ((param0 ^ -1) != -67) {
                                      break L15;
                                    } else {
                                      this.p(param1 ^ 26164);
                                      return true;
                                    }
                                  }
                                }
                                if (br.field_f[82]) {
                                  if ((param0 ^ -1) == -68) {
                                    this.g((byte) -77);
                                    return true;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  L16: {
                                    if (param1 == -26126) {
                                      break L16;
                                    } else {
                                      this.field_Wb = -48L;
                                      break L16;
                                    }
                                  }
                                  return false;
                                }
                              } else {
                                this.b(this.field_Rb.length(), false);
                                return true;
                              }
                            } else {
                              this.b(0, false);
                              return true;
                            }
                          }
                        }
                      } else {
                        this.a(true);
                        return true;
                      }
                    } else {
                      if (this.field_Jb == this.field_Qb) {
                        if (this.field_Qb < this.field_Rb.length()) {
                          this.field_Jb = 1 + this.field_Qb;
                          this.l(32);
                          return true;
                        } else {
                          L17: {
                            if (param1 == -26126) {
                              break L17;
                            } else {
                              this.field_Wb = -48L;
                              break L17;
                            }
                          }
                          return false;
                        }
                      } else {
                        this.l(32);
                        return true;
                      }
                    }
                  } else {
                    if (this.field_Qb == this.field_Jb) {
                      if ((this.field_Qb ^ -1) < -1) {
                        this.field_Jb = this.field_Qb + -1;
                        this.l(32);
                        return true;
                      } else {
                        break L10;
                      }
                    } else {
                      this.l(32);
                      return true;
                    }
                  }
                }
                L18: {
                  if (param1 == -26126) {
                    break L18;
                  } else {
                    this.field_Wb = -48L;
                    break L18;
                  }
                }
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void g(byte param0) {
        if (!(this.field_Tb != null)) {
            return;
        }
        int var2 = -66 / ((72 - param0) / 35);
        this.field_Sb = this.field_Tb.a(0);
    }

    private final void h(byte param0) {
        if (null == this.field_Tb) {
          return;
        } else {
          this.p(-87);
          if (param0 <= 90) {
            this.field_Xb = (je) null;
            this.l(32);
            return;
          } else {
            this.l(32);
            return;
          }
        }
    }

    private final void p(int param0) {
        try {
            int var2;
            String var3;
            java.awt.datatransfer.StringSelection var4;
            if (this.field_Tb != null) {
              var2 = -53 / ((param0 - 11) / 49);
              var3 = this.d((byte) 115);
              if (var3.length() == 0) {
                return;
              } else {
                var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
                this.field_Tb.a((java.awt.datatransfer.Transferable) ((Object) var4), -26522);
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String q(int param0) {
        if (param0 != 0) {
            this.field_Xb = (je) null;
            return this.field_Rb.toString();
        }
        return this.field_Rb.toString();
    }

    final int o(int param0) {
        int var2 = -34 / ((param0 - 21) / 39);
        return this.field_Qb;
    }

    final void a(String param0, byte param1) {
        StringBuilder discarded$3 = null;
        int dupTemp$4 = 0;
        int discarded$5 = 0;
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_Rb.setLength(0);
              var3_int = param0.length();
              if (this.field_Ub == -1) {
                break L1;
              } else {
                if (this.field_Ub < var3_int) {
                  var3_int = this.field_Ub;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              discarded$3 = this.field_Rb.append(param0.substring(0, var3_int));
              dupTemp$4 = this.field_Rb.length();
              this.field_Jb = dupTemp$4;
              this.field_Qb = dupTemp$4;
              this.field_Pb.field_X = this.field_Rb.toString();
              if (param1 == 45) {
                break L2;
              } else {
                discarded$5 = this.e((byte) 43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("dp.T(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.a(param3, -20500, param2, param0, param4);
        this.field_Pb.a(param3, -20500, param2, param1, 0);
        this.field_Ob.a(param3, -20500, param2, 0, 0);
        this.field_Kb = -4 + param3;
    }

    private final void b(int param0, boolean param1) {
        this.field_Qb = param0;
        if (param1) {
            return;
        }
        if (!br.field_f[81]) {
            this.field_Jb = this.field_Qb;
        }
    }

    dp(long param0, je param1, je param2, je param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        this.field_Jb = param0;
        this.field_Qb = param0;
        if (param1) {
            this.a(-36, 44, '');
        }
    }

    final void m(int param0) {
        try {
            int dupTemp$0 = 0;
            Object stackIn_16_0 = null;
            Object stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            L0: {
              var6 = ArmiesOfGielinor.field_M ? 1 : 0;
              var2 = this.c(param0 ^ 48, sm.field_d - (this.field_V - -this.field_Pb.field_F));
              if (-2 == (this.field_yb ^ -1)) {
                L1: {
                  this.b(var2, false);
                  this.field_Ib = true;
                  var3_long = vi.b(param0 + -95);
                  stackIn_16_0 = this;

                  if (250L <= var3_long - this.field_Wb) {
                    stackIn_17_0 = this;
                    stackIn_17_1 = 0;
                    break L1;
                  } else {
                    stackIn_17_0 = this;
                    stackIn_17_1 = 1;
                    break L1;
                  }
                }
                ((dp) (this)).field_Nb = stackIn_17_1 != 0;
                if (!this.field_Nb) {
                  this.field_Wb = var3_long;
                  break L0;
                } else {
                  this.field_Jb = this.k(-1);
                  this.field_Qb = this.e((byte) 109);
                  if ((this.field_Qb ^ -1) >= -1) {
                    this.field_Mb = this.field_Qb;
                    this.field_Wb = var3_long;
                    break L0;
                  } else {
                    if (this.field_Rb.charAt(this.field_Qb + -1) != 32) {
                      this.field_Mb = this.field_Qb;
                      this.field_Wb = var3_long;
                      break L0;
                    } else {
                      this.field_Qb = this.field_Qb - 1;
                      this.field_Mb = this.field_Qb;
                      this.field_Wb = var3_long;
                      break L0;
                    }
                  }
                }
              } else {
                if ((ro.field_ub ^ -1) != -2) {
                  this.field_Ib = false;
                  break L0;
                } else {
                  if (this.field_Ib) {
                    if (!this.field_Nb) {
                      this.field_Qb = var2;
                      break L0;
                    } else {
                      if (var2 >= this.field_Mb) {
                        this.field_Qb = var2;
                        break L0;
                      } else {
                        if (this.field_Jb >= var2) {
                          this.field_Qb = var2;
                          break L0;
                        } else {
                          var2 = this.field_Mb;
                          this.field_Qb = var2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    this.field_Ib = false;
                    break L0;
                  }
                }
              }
            }
            L2: {
              if (this.field_Y) {
                break L2;
              } else {
                dupTemp$0 = this.field_Rb.length();
                this.field_Jb = dupTemp$0;
                this.field_Qb = dupTemp$0;
                break L2;
              }
            }
            L3: {
              this.field_Ob.field_S = this.field_Pb.field_Z.a(this.field_Rb.toString().substring(param0, this.field_Qb));
              if (this.field_Jb == this.field_Qb) {
                this.field_Xb.a(this.field_Kb, -20500, 0, 2, this.field_Ob.field_S);
                break L3;
              } else {
                L4: {
                  var3 = this.field_Pb.field_S + this.field_Pb.field_Z.a(this.field_Rb.toString().substring(0, this.field_Jb));
                  if (this.field_Ob.field_S <= var3) {
                    stackIn_34_0 = this.field_Ob.field_S;
                    break L4;
                  } else {
                    stackIn_34_0 = var3;
                    break L4;
                  }
                }
                var4_int = stackIn_34_0;
                var5 = Math.abs(var3 - this.field_Ob.field_S);
                this.field_Xb.a(this.field_Kb, param0 + -20500, var5, 2, var4_int + this.field_Pb.field_F);
                break L3;
              }
            }
            L5: {
              if (this.field_Sb == null) {
                break L5;
              } else {
                if (this.field_Sb.field_g != 0) {
                  var7 = (java.awt.datatransfer.Transferable) (this.field_Sb.field_f);
                  try {
                    L6: {
                      var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                      this.l(32);
                      this.a((byte) 90, var8);
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L7;
                    }
                  }
                  this.field_Sb = null;
                  break L5;
                } else {
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((this.field_Qb ^ -1) != param0) {
          var2 = this.field_Qb + -1;
          L0: while (true) {
            if (0 < var2) {
              if (!wr.a(this.field_Rb.charAt(-1 + var2), (byte) 95)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_Qb;
        }
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 109) {
          var2 = this.field_Rb.length();
          if (this.field_Qb != var2) {
            var3 = 1 + this.field_Qb;
            L0: while (true) {
              if (var2 > var3) {
                if (!wr.a(this.field_Rb.charAt(var3 + -1), (byte) 95)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_Qb;
          }
        } else {
          this.field_Ib = false;
          var2 = this.field_Rb.length();
          if (this.field_Qb != var2) {
            var3 = 1 + this.field_Qb;
            L1: while (true) {
              if (var2 > var3) {
                if (!wr.a(this.field_Rb.charAt(var3 + -1), (byte) 95)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_Qb;
          }
        }
    }

    static {
        field_Vb = new int[][]{new int[]{48, 48}, new int[]{144, 0}, new int[]{0, 0}, new int[]{0, 176}, new int[]{32, 0}, new int[]{64, 64}};
    }
}
