/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private int field_p;
    static int field_i;
    private int field_g;
    private int field_j;
    private int field_n;
    static String[] field_f;
    private float field_d;
    private tk field_t;
    private int field_m;
    private int field_l;
    static String field_k;
    private boolean field_q;
    private int field_r;
    private int field_c;
    private int field_e;
    private int field_o;
    private int field_a;
    private int field_h;
    private int field_s;
    private int field_u;
    private int field_b;

    final static boolean a(int param0) {
        int var1 = -44 / ((-56 - param0) / 32);
        return vb.field_Z;
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = param0;
        if (!param3) {
          if (!param2) {
            if (param1) {
              var4++;
              return ik.field_d[var4];
            } else {
              return ik.field_d[var4];
            }
          } else {
            var4 += 2;
            if (param1) {
              var4++;
              return ik.field_d[var4];
            } else {
              return ik.field_d[var4];
            }
          }
        } else {
          var4 += 4;
          if (param2) {
            var4 += 2;
            if (!param1) {
              return ik.field_d[var4];
            } else {
              var4++;
              return ik.field_d[var4];
            }
          } else {
            if (param1) {
              var4++;
              return ik.field_d[var4];
            } else {
              return ik.field_d[var4];
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, java.math.BigInteger param3, java.math.BigInteger param4, wl param5, byte[] param6) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = ha.a(param2, (byte) -126);
                        if (rk.field_K == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rk.field_K = new java.security.SecureRandom();
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = new int[4];
                        var11 = var12;
                        var8 = var11;
                        var9 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (4 <= var9) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8[var9] = rk.field_K.nextInt();
                        var9++;
                        if (var10 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == ef.field_R) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7_int > ef.field_R.field_r.length) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ef.field_R = new wl(var7_int);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ef.field_R.field_n = 0;
                        if (param1 >= 101) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        ef.field_R.a(false, param2, param6, param0);
                        ef.field_R.e(102, var7_int);
                        ef.field_R.a((byte) -105, var12);
                        if (ba.field_b == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (100 <= ba.field_b.field_r.length) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ba.field_b = new wl(100);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ba.field_b.field_n = 0;
                        ba.field_b.a(true, 10);
                        var9 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (4 <= var9) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ba.field_b.a(var12[var9], false);
                        var9++;
                        if (var10 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ba.field_b.d(-1, param2);
                        ba.field_b.a(param4, param3, true);
                        param5.a(false, ba.field_b.field_n, ba.field_b.field_r, 0);
                        param5.a(false, ef.field_R.field_n, ef.field_R.field_r, 0);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var7);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param3 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param4 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
                    stackIn_33_1 = stackIn_34_1;
                    if (param5 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
                    stackIn_36_1 = stackIn_37_1;
                    if (param6 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw dh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ql c(int param0) {
        ql var2;
        if (param0 != 27134) {
          L0: {
            ri.a(-14);
            this.field_g = ob.field_g;
            this.field_j = de.field_M;
            this.field_t.a(-4328, this.field_o, this.field_p);
            jg.field_e = false;
            var2 = sg.a(this.field_p, lf.field_e, 0, 0, 67, this.field_o);
            if (var2 == null) {
              this.b((byte) -60);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            this.field_g = ob.field_g;
            this.field_j = de.field_M;
            this.field_t.a(-4328, this.field_o, this.field_p);
            jg.field_e = false;
            var2 = sg.a(this.field_p, lf.field_e, 0, 0, 67, this.field_o);
            if (var2 == null) {
              this.b((byte) -60);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        if (null != cl.field_v) {
          return;
        } else {
          L0: {
            if (eh.field_a <= 0) {
              this.field_q = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (this.field_q) {
            fieldTemp$0 = this.field_u - 1;
            this.field_u = this.field_u - 1;
            if (fieldTemp$0 > 0) {
              return;
            } else {
              this.field_u = this.field_s;
              if (this.field_e > ab.field_e) {
                this.field_q = false;
                return;
              } else {
                L1: {
                  this.d(60);
                  if (!param0) {
                    break L1;
                  } else {
                    ri.a(-99, -30, 116, 96, -46, -122);
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            L2: {
              if (de.field_M < this.field_m) {
                break L2;
              } else {
                if (this.field_m > 0) {
                  qd.field_Rb = 0;
                  if (!client.field_A) {
                    if (this.field_n == de.field_M) {
                      if (ob.field_g != this.field_r) {
                        this.field_t.a(-4328, this.field_r, this.field_n);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_t.a(-4328, this.field_r, this.field_n);
                      return;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  if (this.field_n != de.field_M) {
                    this.field_t.a(-4328, this.field_r, this.field_n);
                    return;
                  } else {
                    if (ob.field_g == this.field_r) {
                      return;
                    } else {
                      this.field_t.a(-4328, this.field_r, this.field_n);
                      return;
                    }
                  }
                }
              }
            }
            qd.field_Rb = (this.field_m + -de.field_M) / 2;
            if (this.field_n == de.field_M) {
              if (ob.field_g == this.field_r) {
                return;
              } else {
                this.field_t.a(-4328, this.field_r, this.field_n);
                return;
              }
            } else {
              this.field_t.a(-4328, this.field_r, this.field_n);
              return;
            }
          }
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_m;
        var3 = this.field_h;
        if (this.b(param0 + -60)) {
          L0: {
            L1: {
              if (var2 > this.field_a) {
                break L1;
              } else {
                if (var2 < this.field_l) {
                  var2 = this.field_l;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L2: {
                    L3: {
                      if (var3 > this.field_c) {
                        break L3;
                      } else {
                        if (this.field_b > var3) {
                          var3 = this.field_b;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3 = this.field_c;
                    break L2;
                  }
                  L4: {
                    if (0.0f >= this.field_d) {
                      break L4;
                    } else {
                      L5: {
                        var4 = (int)((float)var3 * this.field_d + 0.5f);
                        if (var4 <= var2) {
                          break L5;
                        } else {
                          var3 = (int)((float)var2 / this.field_d);
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var2 <= var4) {
                        break L4;
                      } else {
                        var2 = var4;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (de.field_M != var2) {
                      this.field_t.a(-4328, var3, var2);
                      break L6;
                    } else {
                      if (ob.field_g != var3) {
                        this.field_t.a(-4328, var3, var2);
                        break L6;
                      } else {
                        L7: {
                          if (param0 == 60) {
                            break L7;
                          } else {
                            ri.a((byte) 59);
                            break L7;
                          }
                        }
                        L8: {
                          if ((this.field_m ^ -1) >= -1) {
                            break L8;
                          } else {
                            qd.field_Rb = (this.field_m + -de.field_M) / 2;
                            break L8;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0 == 60) {
                    L9: {
                      if ((this.field_m ^ -1) >= -1) {
                        break L9;
                      } else {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        break L9;
                      }
                    }
                    return;
                  } else {
                    L10: {
                      ri.a((byte) 59);
                      if ((this.field_m ^ -1) >= -1) {
                        break L10;
                      } else {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        break L10;
                      }
                    }
                    return;
                  }
                }
              }
            }
            var2 = this.field_a;
            break L0;
          }
          L11: {
            L12: {
              if (var3 > this.field_c) {
                break L12;
              } else {
                if (this.field_b > var3) {
                  var3 = this.field_b;
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                } else {
                  L13: {
                    if (0.0f >= this.field_d) {
                      break L13;
                    } else {
                      L14: {
                        var4 = (int)((float)var3 * this.field_d + 0.5f);
                        if (var4 <= var2) {
                          break L14;
                        } else {
                          var3 = (int)((float)var2 / this.field_d);
                          if (var5 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (var2 <= var4) {
                        break L13;
                      } else {
                        var2 = var4;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (de.field_M != var2) {
                      this.field_t.a(-4328, var3, var2);
                      break L15;
                    } else {
                      if (ob.field_g == var3) {
                        break L15;
                      } else {
                        this.field_t.a(-4328, var3, var2);
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (param0 == 60) {
                      break L16;
                    } else {
                      ri.a((byte) 59);
                      break L16;
                    }
                  }
                  if ((this.field_m ^ -1) < -1) {
                    qd.field_Rb = (this.field_m + -de.field_M) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            var3 = this.field_c;
            break L11;
          }
          L17: {
            if (0.0f >= this.field_d) {
              break L17;
            } else {
              L18: {
                var4 = (int)((float)var3 * this.field_d + 0.5f);
                if (var4 <= var2) {
                  break L18;
                } else {
                  var3 = (int)((float)var2 / this.field_d);
                  if (var5 == 0) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              if (var2 <= var4) {
                break L17;
              } else {
                var2 = var4;
                break L17;
              }
            }
          }
          if (de.field_M != var2) {
            this.field_t.a(-4328, var3, var2);
            if (param0 == 60) {
              if ((this.field_m ^ -1) < -1) {
                qd.field_Rb = (this.field_m + -de.field_M) / 2;
                return;
              } else {
                return;
              }
            } else {
              ri.a((byte) 59);
              if ((this.field_m ^ -1) < -1) {
                qd.field_Rb = (this.field_m + -de.field_M) / 2;
                return;
              } else {
                return;
              }
            }
          } else {
            if (ob.field_g == var3) {
              if (param0 == 60) {
                if ((this.field_m ^ -1) < -1) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                ri.a((byte) 59);
                if ((this.field_m ^ -1) < -1) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_t.a(-4328, var3, var2);
              if (param0 == 60) {
                if ((this.field_m ^ -1) < -1) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                ri.a((byte) 59);
                if ((this.field_m ^ -1) < -1) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          this.field_q = false;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (80 <= param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = param1 / 20 * 18;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 54;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7_int = stackIn_4_0;
                        var8 = 0;
                        if (param1 >= 60) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7_int = var7_int + vl.a(23841, 80, param2 * 18 + 40);
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 < 80) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1 ^ -1) <= -94) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = vl.a(23841, 80, 40 + ve.field_ic[1 + param1 - 80] * 18);
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        hk.a(-30 + param4, 54 + param0 + -2, 60, 40, 4, 65280, 100);
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7_int = var7_int + vl.a(23841, 80, 40 + param5 * 18);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param3 < -57) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_i = -11;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-4 >= (var9 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fb.field_c[param6][1].c(var9 * 18 + -27 + param4, 72 + param0, 18, 18);
                        var9++;
                        if (var10 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        fb.field_c[param6][1].c(param4 - 27 + 36, var8 + var7_int + param0, 18, -var8 + 18);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var7), "ri.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int var6;
        int var7;
        L0: {
          db.field_b[og.field_eb] = param0;
          ch.field_a[og.field_eb] = og.field_eb;
          ad.field_i[og.field_eb] = param3;
          if (ge.field_b > param3) {
            mf.field_Q = param3;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 <= bg.field_d) {
          L1: {
            oa.field_e[og.field_eb] = param1;
            ln.field_a[og.field_eb] = param4;
            mk.field_b[og.field_eb] = param5;
            var6 = param5 + (param4 + param1);
            if ((var6 ^ -1) == param2) {
              stackIn_19_0 = 0;
              break L1;
            } else {
              stackIn_19_0 = param1 * 1000 / var6;
              break L1;
            }
          }
          var7 = stackIn_19_0;
          cc.field_h[og.field_eb] = var7;
          og.field_eb = og.field_eb + 1;
          if (rf.field_g >= var7) {
            if (mf.field_Q > var7) {
              mf.field_Q = var7;
              return;
            } else {
              return;
            }
          } else {
            rf.field_g = var7;
            if (mf.field_Q > var7) {
              mf.field_Q = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          L2: {
            rf.field_g = param3;
            oa.field_e[og.field_eb] = param1;
            ln.field_a[og.field_eb] = param4;
            mk.field_b[og.field_eb] = param5;
            var6 = param5 + (param4 + param1);
            if ((var6 ^ -1) == param2) {
              stackIn_7_0 = 0;
              break L2;
            } else {
              stackIn_7_0 = param1 * 1000 / var6;
              break L2;
            }
          }
          var7 = stackIn_7_0;
          cc.field_h[og.field_eb] = var7;
          og.field_eb = og.field_eb + 1;
          if (rf.field_g >= var7) {
            if (mf.field_Q > var7) {
              mf.field_Q = var7;
              return;
            } else {
              return;
            }
          } else {
            rf.field_g = var7;
            if (mf.field_Q <= var7) {
              return;
            } else {
              mf.field_Q = var7;
              return;
            }
          }
        }
    }

    final boolean b(int param0) {
        if (param0 == 0) {
          if (ab.field_e >= this.field_e) {
            if (0 >= eh.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_t = (tk) null;
          if (ab.field_e >= this.field_e) {
            if (0 >= eh.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_h = param2;
        this.field_m = param0;
        if (param1) {
            this.c(-56);
        }
    }

    final void b(byte param0) {
        if (param0 > -49) {
          this.field_s = -34;
          this.field_t.a(-4328, this.field_g, this.field_j);
          return;
        } else {
          this.field_t.a(-4328, this.field_g, this.field_j);
          return;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 != -91) {
            byte[] var2 = (byte[]) null;
            ri.a(-34, (byte) -93, 92, (java.math.BigInteger) null, (java.math.BigInteger) null, (wl) null, (byte[]) null);
        }
    }

    private ri() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "DRAW!";
        field_f = new String[8];
        field_f[0] = "fruit";
        field_f[3] = "bugs";
        field_f[5] = "undersea";
        field_f[4] = "flowers";
        field_f[1] = "animals";
        field_f[7] = "eightbit";
        field_f[6] = "city";
        field_f[2] = "breakfast";
    }
}
